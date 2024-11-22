package com.my.newproject2;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Process;
import android.util.Log;
import java.lang.Thread;

public class SketchApplication extends Application {
    /* access modifiers changed from: private */
    public Thread.UncaughtExceptionHandler uncaughtExceptionHandler;

    public void onCreate() {
        this.uncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            public void uncaughtException(Thread thread, Throwable th) {
                Intent intent = new Intent(SketchApplication.this.getApplicationContext(), DebugActivity.class);
                intent.setFlags(32768);
                intent.putExtra("error", Log.getStackTraceString(th));
                ((AlarmManager) SketchApplication.this.getSystemService("alarm")).set(2, 1000, PendingIntent.getActivity(SketchApplication.this.getApplicationContext(), 11111, intent, 1073741824));
                Process.killProcess(Process.myPid());
                System.exit(1);
                SketchApplication.this.uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        });
        super.onCreate();
    }
}
