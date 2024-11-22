package com.my.newproject2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
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

public class LoadingActivity extends Activity {
    private Timer _timer = new Timer();
    private ImageView imageview1;
    private LinearLayout linear2;
    private LinearLayout linear3;
    private LinearLayout linear4;
    private ProgressBar progressbar1;
    /* access modifiers changed from: private */
    public Intent q = new Intent();
    private RatingBar ratingbar1;
    private RatingBar ratingbar2;
    private TimerTask t;
    private TextView textview1;
    private TextView textview2;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.loading);
        initialize(bundle);
        initializeLogic();
    }

    private void initialize(Bundle bundle) {
        this.linear2 = (LinearLayout) findViewById(R.id.linear2);
        this.ratingbar2 = (RatingBar) findViewById(R.id.ratingbar2);
        this.textview2 = (TextView) findViewById(R.id.textview2);
        this.linear3 = (LinearLayout) findViewById(R.id.linear3);
        this.linear4 = (LinearLayout) findViewById(R.id.linear4);
        this.progressbar1 = (ProgressBar) findViewById(R.id.progressbar1);
        this.ratingbar1 = (RatingBar) findViewById(R.id.ratingbar1);
        this.imageview1 = (ImageView) findViewById(R.id.imageview1);
        this.textview1 = (TextView) findViewById(R.id.textview1);
    }

    private void initializeLogic() {
        this.t = new TimerTask() {
            public void run() {
                LoadingActivity.this.runOnUiThread(new Runnable() {
                    public void run() {
                        LoadingActivity.this.q.setClass(LoadingActivity.this.getApplicationContext(), NiceActivity.class);
                        LoadingActivity.this.startActivity(LoadingActivity.this.q);
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
