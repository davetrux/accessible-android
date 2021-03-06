package com.hpe.digitalservices.accessibledemo;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Utility functions for manipulating a theme change
 *
 * Created by trux on 9/28/16.
 */

public class Utils {

    public static final String THEME_INTENT = "themechange";
    public static final String THEME_KEY = "theme";

    /**
     * Set the theme of the Activity, and restart it by creating a new Activity of the same type.
     */

    public static void changeTheme(Activity activity) {
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));
    }

    public static void setUiTheme(Activity activity) {

        if(isDarkTheme(activity)) {
            activity.setTheme(R.style.DarkTheme);
        } else {
            activity.setTheme(R.style.LightTheme);
        }

    }

    public static boolean isDarkTheme(Activity activity) {

        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(activity.getBaseContext());

        return sharedPrefs.getBoolean("theme", false);

    }
}
