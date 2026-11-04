package l;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;

/* JADX INFO: renamed from: l.۬֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q159 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13531 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int f42995 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m33236(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            if (i >= 29) {
                try {
                    Resources resources = context.getResources();
                    if (f42995 == -1) {
                        f42995 = resources.getIdentifier("config_navBarInteractionMode", "integer", "android");
                    }
                    int i2 = f42995;
                    if (i2 != 0) {
                        if (resources.getInteger(i2) == 2) {
                            return true;
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (C9034.m24095()) {
                return Settings.Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0) != 0;
            }
            if (C9034.m24093() || C9034.m24091()) {
                return Settings.Secure.getInt(context.getContentResolver(), "navigation_gesture_on", 0) != 0;
            }
            if (C9034.m24092()) {
                return (Settings.System.getInt(context.getContentResolver(), "navigationbar_hide_bar_enabled", 0) == 0 && Settings.Global.getInt(context.getContentResolver(), "navigationbar_hide_bar_enabled", 0) == 0) ? false : true;
            }
            if (C9034.m24094()) {
                return (Settings.System.getInt(context.getContentResolver(), "navigationbar_is_min", 0) == 0 && Settings.Global.getInt(context.getContentResolver(), "navigationbar_is_min", 0) == 0) ? false : true;
            }
            return (Settings.Global.getInt(context.getContentResolver(), "navigationbar_is_min", 0) == 0 && Settings.Global.getInt(context.getContentResolver(), "navigation_gesture_on", 0) == 0) ? false : true;
        }
        return false;
    }
}
