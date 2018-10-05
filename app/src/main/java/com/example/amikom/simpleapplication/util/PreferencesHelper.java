package com.example.amikom.simpleapplication.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by amikom on 28/09/2018.
 */

public class PreferencesHelper {
    private static PreferencesHelper INTANCES;
    private SharedPreferences sharedPreferences;

    private PreferencesHelper(Context context) {
        sharedPreferences = context
                .getApplicationContext()
                .getSharedPreferences("simple.android.app", context.MODE_PRIVATE);
    }
    public static PreferencesHelper getIntances(Context context){
        if (INTANCES == null){
            INTANCES = new PreferencesHelper(context);
        }
        return INTANCES;
    }
    public SharedPreferences Pref() {
        return sharedPreferences;
    }

    public Boolean isLogin() {
        return sharedPreferences.getBoolean("isLogin",false);
    }

    public void setLogin(boolean isCall){
        sharedPreferences.edit().putBoolean("isLogin",isCall).apply();
    }

    public void setName(String isName){
        sharedPreferences.edit().putString("isName",isName).apply();
    }

    public String getName () {
        return sharedPreferences.getString("isName", "");
    }
}
