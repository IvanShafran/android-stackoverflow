package com.githab.ivanshafran.backbuttonhandle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity {

    private boolean mIsBackButtonPressedBefore = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    @Override
    public void onBackPressed() {
        if (mIsBackButtonPressedBefore) {
            Toast.makeText(this, "Second back button press", Toast.LENGTH_SHORT).show();
            super.onBackPressed();
        } else {
            mIsBackButtonPressedBefore = true;
            Toast.makeText(this, "First back button press", Toast.LENGTH_SHORT).show();
        }
    }
}
