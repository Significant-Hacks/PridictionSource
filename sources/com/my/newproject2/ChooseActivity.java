package com.my.newproject2;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class ChooseActivity extends Activity {
    /* access modifiers changed from: private */
    public Timer _timer = new Timer();
    /* access modifiers changed from: private */
    public TimerTask a;
    /* access modifiers changed from: private */
    public Intent f = new Intent();
    private LinearLayout linear1;
    private LinearLayout linear2;
    private TextView textview1;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.choose);
        initialize(bundle);
        initializeLogic();
    }

    private void initialize(Bundle bundle) {
        this.linear1 = (LinearLayout) findViewById(R.id.linear1);
        this.linear2 = (LinearLayout) findViewById(R.id.linear2);
        this.textview1 = (TextView) findViewById(R.id.textview1);
        this.linear2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ProgressDialog progressDialog = new ProgressDialog(ChooseActivity.this);
                progressDialog.setMax(100);
                progressDialog.setTitle("Signal Loading");
                progressDialog.setMessage("Please wait...");
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(true);
                progressDialog.show();
                ChooseActivity.this.a = new TimerTask() {
                    public void run() {
                        ChooseActivity.this.runOnUiThread(new Runnable() {
                            public void run() {
                                ChooseActivity.this.f.setClass(ChooseActivity.this.getApplicationContext(), PasswordActivity.class);
                                ChooseActivity.this.startActivity(ChooseActivity.this.f);
                            }
                        });
                    }
                };
                ChooseActivity.this._timer.schedule(ChooseActivity.this.a, 3000);
            }
        });
    }

    private void initializeLogic() {
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
