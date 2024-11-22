package com.my.newproject2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class PasswordActivity extends Activity {
    private Timer _timer = new Timer();
    /* access modifiers changed from: private */
    public Intent i = new Intent();
    private LinearLayout linear1;
    private ProgressBar progressbar1;
    private ProgressBar progressbar2;
    private TimerTask q;
    private RatingBar ratingbar1;
    private RatingBar ratingbar2;
    private TextView textview1;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.password);
        initialize(bundle);
        initializeLogic();
    }

    private void initialize(Bundle bundle) {
        this.linear1 = (LinearLayout) findViewById(R.id.linear1);
        this.ratingbar2 = (RatingBar) findViewById(R.id.ratingbar2);
        this.textview1 = (TextView) findViewById(R.id.textview1);
        this.progressbar1 = (ProgressBar) findViewById(R.id.progressbar1);
        this.ratingbar1 = (RatingBar) findViewById(R.id.ratingbar1);
        this.progressbar2 = (ProgressBar) findViewById(R.id.progressbar2);
    }

    private void initializeLogic() {
        this.q = new TimerTask() {
            public void run() {
                PasswordActivity.this.runOnUiThread(new Runnable() {
                    public void run() {
                        PasswordActivity.this.i.setClass(PasswordActivity.this.getApplicationContext(), StartgameActivity.class);
                        PasswordActivity.this.startActivity(PasswordActivity.this.i);
                    }
                });
            }
        };
        this._timer.schedule(this.q, 3000);
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
    public int getRandom(int i2, int i3) {
        return new Random().nextInt((i3 - i2) + 1) + i2;
    }

    @Deprecated
    public ArrayList<Double> getCheckedItemPositionsToArray(ListView listView) {
        ArrayList<Double> arrayList = new ArrayList<>();
        SparseBooleanArray checkedItemPositions = listView.getCheckedItemPositions();
        for (int i2 = 0; i2 < checkedItemPositions.size(); i2++) {
            if (checkedItemPositions.valueAt(i2)) {
                arrayList.add(Double.valueOf((double) checkedItemPositions.keyAt(i2)));
            }
        }
        return arrayList;
    }

    @Deprecated
    public float getDip(int i2) {
        return TypedValue.applyDimension(1, (float) i2, getResources().getDisplayMetrics());
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
