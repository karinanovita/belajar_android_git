package com.example.amikom.simpleapplication;

import android.app.backup.SharedPreferencesBackupHelper;
import android.content.Intent;
import android.os.Handler;
import android.preference.Preference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.amikom.simpleapplication.util.PreferencesHelper;

public class SplashActivity extends AppCompatActivity {


    PreferencesHelper intances;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        intances = PreferencesHelper.getIntances(getAlicationContext());
        int splashInterval = 10;
        new Handler () .postDelayed(new Runnable() {
            @Override
            public void run() {
                if (!intances.isLogin()) {
                    startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                } else {
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                }
                }
        }, splashInterval);
    }
}
