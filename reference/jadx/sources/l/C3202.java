package l;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;

/* JADX INFO: renamed from: l.ۗۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Q159 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3202 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int f11987 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m9622(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            if (i >= 29) {
                try {
                    Resources resources = context.getResources();
                    if (f11987 == -1) {
                        f11987 = resources.getIdentifier("config_navBarInteractionMode", "integer", "android");
                    }
                    int i2 = f11987;
                    if (i2 != 0) {
                        if (resources.getInteger(i2) == 2) {
                            return true;
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (C12597.m31369()) {
                return Settings.Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0) != 0;
            }
            if (C12597.m31372() || C12597.m31368()) {
                return Settings.Secure.getInt(context.getContentResolver(), "navigation_gesture_on", 0) != 0;
            }
            if (C12597.m31376()) {
                return (Settings.System.getInt(context.getContentResolver(), "navigationbar_hide_bar_enabled", 0) == 0 && Settings.Global.getInt(context.getContentResolver(), "navigationbar_hide_bar_enabled", 0) == 0) ? false : true;
            }
            if (C12597.m31375()) {
                return (Settings.System.getInt(context.getContentResolver(), "navigationbar_is_min", 0) == 0 && Settings.Global.getInt(context.getContentResolver(), "navigationbar_is_min", 0) == 0) ? false : true;
            }
            return (Settings.Global.getInt(context.getContentResolver(), "navigationbar_is_min", 0) == 0 && Settings.Global.getInt(context.getContentResolver(), "navigation_gesture_on", 0) == 0) ? false : true;
        }
        return false;
    }
}
