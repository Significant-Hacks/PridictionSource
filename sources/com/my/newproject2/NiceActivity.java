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

public class NiceActivity extends Activity {
    private Timer _timer = new Timer();
    private LinearLayout linear1;
    private ProgressBar progressbar1;
    /* access modifiers changed from: private */
    public Intent q = new Intent();
    private RatingBar ratingbar1;
    private RatingBar ratingbar2;
    private TimerTask t;
    private TextView textview1;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.nice);
        initialize(bundle);
        initializeLogic();
    }

    private void initialize(Bundle bundle) {
        this.linear1 = (LinearLayout) findViewById(R.id.linear1);
        this.ratingbar1 = (RatingBar) findViewById(R.id.ratingbar1);
        this.textview1 = (TextView) findViewById(R.id.textview1);
        this.progressbar1 = (ProgressBar) findViewById(R.id.progressbar1);
        this.ratingbar2 = (RatingBar) findViewById(R.id.ratingbar2);
    }

    private void initializeLogic() {
        this.t = new TimerTask() {
            public void run() {
                NiceActivity.this.runOnUiThread(new Runnable() {
                    public void run() {
                        NiceActivity.this.q.setClass(NiceActivity.this.getApplicationContext(), ChooseActivity.class);
                        NiceActivity.this.startActivity(NiceActivity.this.q);
                    }
                });
            }
        };
        this._timer.schedule(this.t, 3000);
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
