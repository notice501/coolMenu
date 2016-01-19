package com.dxtt.coolmenu;

import android.content.Context;
import android.util.DisplayMetrics;

final class Utils {

    private Utils() {}

    public static int getScreenWidth(Context context) {
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        return dm.widthPixels;
    }

    public static int getScreenHeight(Context context) {
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        return dm.heightPixels;
    }
}
