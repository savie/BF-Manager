package com.google.android.material.internal;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import com.google.android.material.color.MaterialColors;
import l.C18190;
import l.C18893;
import l.C19988;

/* JADX INFO: loaded from: classes.dex */
public class EdgeToEdgeUtils {
    public static final int EDGE_TO_EDGE_BAR_ALPHA = 128;

    public static void applyEdgeToEdge(Window window, boolean z) {
        applyEdgeToEdge(window, z, null, null);
    }

    public static void applyEdgeToEdge(Window window, boolean z, Integer num, Integer num2) {
        boolean z2 = num == null || num.intValue() == 0;
        boolean z3 = num2 == null || num2.intValue() == 0;
        if (z2 || z3) {
            int color = MaterialColors.getColor(window.getContext(), R.attr.colorBackground, -16777216);
            if (z2) {
                num = Integer.valueOf(color);
            }
            if (z3) {
                num2 = Integer.valueOf(color);
            }
        }
        C18190.m42352(window, !z);
        int statusBarColor = getStatusBarColor(window.getContext(), z);
        int navigationBarColor = getNavigationBarColor(window.getContext(), z);
        window.setStatusBarColor(statusBarColor);
        window.setNavigationBarColor(navigationBarColor);
        setLightStatusBar(window, isUsingLightSystemBar(statusBarColor, MaterialColors.isColorLight(num.intValue())));
        setLightNavigationBar(window, isUsingLightSystemBar(navigationBarColor, MaterialColors.isColorLight(num2.intValue())));
    }

    public static void setLightStatusBar(Window window, boolean z) {
        new C18893(window, window.getDecorView()).m43816(z);
    }

    public static void setLightNavigationBar(Window window, boolean z) {
        new C18893(window, window.getDecorView()).m43812(z);
    }

    @TargetApi(21)
    public static int getStatusBarColor(Context context, boolean z) {
        if (z && Build.VERSION.SDK_INT < 23) {
            return C19988.m45964(MaterialColors.getColor(context, R.attr.statusBarColor, -16777216), 128);
        }
        if (z) {
            return 0;
        }
        return MaterialColors.getColor(context, R.attr.statusBarColor, -16777216);
    }

    @TargetApi(21)
    public static int getNavigationBarColor(Context context, boolean z) {
        if (z && Build.VERSION.SDK_INT < 27) {
            return C19988.m45964(MaterialColors.getColor(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z) {
            return 0;
        }
        return MaterialColors.getColor(context, R.attr.navigationBarColor, -16777216);
    }

    public static boolean isUsingLightSystemBar(int i, boolean z) {
        if (MaterialColors.isColorLight(i)) {
            return true;
        }
        return i == 0 && z;
    }
}
