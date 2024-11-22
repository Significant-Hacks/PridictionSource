package com.my.newproject2;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.DigitalClock;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class HooActivity extends Activity {
    /* access modifiers changed from: private */
    public Timer _timer = new Timer();
    /* access modifiers changed from: private */
    public TimerTask a;
    private Button button1;
    private DigitalClock digitalclock1;
    /* access modifiers changed from: private */
    public Intent i = new Intent();
    private ImageView imageview1;
    private LinearLayout linear1;
    private LinearLayout linear3;
    private LinearLayout linear4;
    private LinearLayout linear5;
    private LinearLayout linear6;
    private ProgressBar progressbar1;
    private TextView textview1;
    private TextView textview2;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.hoo);
        initialize(bundle);
        initializeLogic();
    }

    private void initialize(Bundle bundle) {
        this.linear1 = (LinearLayout) findViewById(R.id.linear1);
        this.digitalclock1 = (DigitalClock) findViewById(R.id.digitalclock1);
        this.linear3 = (LinearLayout) findViewById(R.id.linear3);
        this.linear4 = (LinearLayout) findViewById(R.id.linear4);
        this.linear6 = (LinearLayout) findViewById(R.id.linear6);
        this.linear5 = (LinearLayout) findViewById(R.id.linear5);
        this.progressbar1 = (ProgressBar) findViewById(R.id.progressbar1);
        this.button1 = (Button) findViewById(R.id.button1);
        this.textview1 = (TextView) findViewById(R.id.textview1);
        this.imageview1 = (ImageView) findViewById(R.id.imageview1);
        this.textview2 = (TextView) findViewById(R.id.textview2);
        this.button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ProgressDialog progressDialog = new ProgressDialog(HooActivity.this);
                progressDialog.setMax(100);
                progressDialog.setTitle("Signal Loading");
                progressDialog.setMessage("Please wait...");
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(true);
                progressDialog.show();
                HooActivity.this.a = new TimerTask() {
                    public void run() {
                        HooActivity.this.runOnUiThread(new Runnable() {
                            public void run() {
                                HooActivity.this.i.setClass(HooActivity.this.getApplicationContext(), HoopActivity.class);
                                HooActivity.this.startActivity(HooActivity.this.i);
                            }
                        });
                    }
                };
                HooActivity.this._timer.schedule(HooActivity.this.a, 3000);
            }
        });
    }

    private void initializeLogic() {
        _radius(this.button1, 15.0d, 70.0d, "#FFFFFF");
        _radius(this.linear3, 15.0d, 70.0d, "#d40606");
        _radius(this.textview1, 15.0d, 70.0d, "#d40606");
    }

    public void _radius(View view, double d, double d2, String str) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setCornerRadius((float) d);
        view.setElevation((float) d2);
        view.setBackground(gradientDrawable);
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
