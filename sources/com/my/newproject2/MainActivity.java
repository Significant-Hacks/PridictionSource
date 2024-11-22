package com.my.newproject2;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends Activity {
    private Timer _timer = new Timer();
    private ObjectAnimator f = new ObjectAnimator();
    private AlertDialog.Builder j;
    private LinearLayout linear3;
    /* access modifiers changed from: private */
    public Intent u = new Intent();
    private TimerTask w;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.main);
        initialize(bundle);
        initializeLogic();
    }

    private void initialize(Bundle bundle) {
        this.linear3 = (LinearLayout) findViewById(R.id.linear3);
        this.j = new AlertDialog.Builder(this);
    }

    private void initializeLogic() {
        getWindow().getDecorView().setSystemUiVisibility(8192);
        getWindow().setStatusBarColor(-1);
        if (Build.VERSION.SDK_INT > 19) {
            Window window = getWindow();
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(-1);
        }
        this.linear3.addView(new PlanetView(this));
        this.w = new TimerTask() {
            public void run() {
                MainActivity.this.runOnUiThread(new Runnable() {
                    public void run() {
                        MainActivity.this.u.setClass(MainActivity.this.getApplicationContext(), LoadingActivity.class);
                        MainActivity.this.startActivity(MainActivity.this.u);
                    }
                });
            }
        };
        this._timer.schedule(this.w, 30000);
    }

    public void _extra() {
    }

    public class PlanetView extends View {
        private double angle;
        private Paint myPaint;

        public PlanetView(Context context) {
            super(context);
            this.angle = 0.0d;
            this.myPaint = new Paint();
            this.angle = 0.0d;
        }

        /* access modifiers changed from: protected */
        public void onDraw(Canvas canvas) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            this.angle = (this.angle + 0.001d) % 360.0d;
            float round = (float) Math.round(260.0d * Math.sin(Math.toDegrees(this.angle)));
            float round2 = (float) Math.round(110.0d * Math.cos(Math.toDegrees(this.angle)));
            float round3 = (float) Math.round(290.0d * Math.cos(90.0d + Math.toDegrees(this.angle)));
            float round4 = (float) Math.round(230.0d * Math.cos(180.0d + Math.toDegrees(this.angle)));
            float round5 = (float) Math.round(250.0d * Math.cos(270.0d + Math.toDegrees(this.angle)));
            this.myPaint.setStyle(Paint.Style.FILL);
            this.myPaint.setColor(Color.parseColor("#eceff1"));
            Canvas canvas2 = canvas;
            canvas2.drawCircle((float) (measuredWidth / 2), (float) (measuredHeight / 2), (float) ((int) (((double) round) * 1.5d)), this.myPaint);
            this.myPaint.setColor(Color.parseColor("#cfd8dc"));
            Canvas canvas3 = canvas;
            canvas3.drawCircle((float) (measuredWidth / 2), (float) (measuredHeight / 2), (float) (((int) (((double) round) * 1.5d)) - 25), this.myPaint);
            this.myPaint.setColor(Color.parseColor("#275080"));
            Canvas canvas4 = canvas;
            canvas4.drawCircle(((float) (measuredWidth / 2)) + round, round2 + ((float) (measuredHeight / 2)), 15.0f, this.myPaint);
            this.myPaint.setColor(Color.parseColor("#DA3287"));
            Paint paint = this.myPaint;
            Canvas canvas5 = canvas;
            canvas5.drawCircle(((float) (measuredWidth / 2)) + ((float) Math.round(120.0d * Math.sin(90.0d + Math.toDegrees(this.angle)))), ((float) (measuredHeight / 2)) + round3, 20.0f, paint);
            this.myPaint.setColor(Color.parseColor("#008001"));
            Paint paint2 = this.myPaint;
            Canvas canvas6 = canvas;
            canvas6.drawCircle(((float) (measuredWidth / 2)) + ((float) Math.round(130.0d * Math.sin(180.0d + Math.toDegrees(this.angle)))), ((float) (measuredHeight / 2)) + round4, 30.0f, paint2);
            this.myPaint.setColor(Color.parseColor("#8B0000"));
            Paint paint3 = this.myPaint;
            Canvas canvas7 = canvas;
            canvas7.drawCircle(((float) (measuredWidth / 2)) + ((float) Math.round(120.0d * Math.sin(270.0d + Math.toDegrees(this.angle)))), ((float) (measuredHeight / 2)) + round5, 10.0f, paint3);
            Drawable drawable = getResources().getDrawable(R.drawable.hhh, (Resources.Theme) null);
            drawable.setBounds((int) (((float) ((measuredWidth / 2) - 80)) - (round / 11.0f)), (int) (((float) ((measuredHeight / 2) - 80)) - (round / 11.0f)), (int) (((float) ((measuredWidth / 2) + 80)) + (round / 11.0f)), (int) (((float) ((measuredHeight / 2) + 80)) + (round / 11.0f)));
            drawable.draw(canvas);
            invalidate();
        }
    }

    @Deprecated
    public void showMessage(String str) {
        Toast.makeText(getApplicationContext(), str, 0).show();
    }

    @Deprecated
    public int getLocationX(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr[0];
    }

    @Deprecated
    public int getLocationY(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr[1];
    }

    @Deprecated
    public int getRandom(int i, int i2) {
        return new Random().nextInt((i2 - i) + 1) + i;
    }

    @Deprecated
    public ArrayList<Double> getCheckedItemPositionsToArray(ListView listView) {
        ArrayList<Double> arrayList = new ArrayList<>();
        SparseBooleanArray checkedItemPositions = listView.getCheckedItemPositions();
        for (int i = 0; i < checkedItemPositions.size(); i++) {
            if (checkedItemPositions.valueAt(i)) {
                arrayList.add(Double.valueOf((double) checkedItemPositions.keyAt(i)));
            }
        }
        return arrayList;
    }

    @Deprecated
    public float getDip(int i) {
        return TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
    }

    @Deprecated
    public int getDisplayWidthPixels() {
        return getResources().getDisplayMetrics().widthPixels;
    }

    @Deprecated
    public int getDisplayHeightPixels() {
        return getResources().getDisplayMetrics().heightPixels;
    }
}
