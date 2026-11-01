package l;

import android.content.Intent;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AL3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17403 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static boolean f55383 = true;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean f55384 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f55385 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static int f55386 = 1;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int f55387 = 1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int f55388 = 1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static boolean f55389;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m40554(int i) {
        if (i < 0 || i > 2) {
            return 1;
        }
        return i;
    }

    static {
        m40557();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static void m40566() {
        m40557();
        C16737.m39270(new Intent("ScreenColorPickerConfig.ACTION_CONFIG_CHANGED"));
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static boolean m40561() {
        return f55389;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m40564(boolean z) {
        f55389 = z;
        C1679.m5597(ApplicationC0716.f2992, "scp_6", z);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static boolean m40552() {
        return f55383;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m40560(boolean z) {
        f55383 = z;
        ApplicationC0716.f2992.edit().putBoolean("scp_1", z).apply();
        C16737.m39270(new Intent("ScreenColorPickerConfig.ACTION_CONFIG_CHANGED"));
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static boolean m40549() {
        return f55384;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40555(boolean z) {
        f55384 = z;
        C1679.m5597(ApplicationC0716.f2992, "scp_5", z);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static int m40565() {
        float dimension;
        int i = f55386;
        if (i == 0) {
            dimension = C16737.m39279().getDimension(R.dimen.MT_Protector);
        } else if (i == 2) {
            dimension = C16737.m39279().getDimension(R.dimen.MT_Protector);
        } else {
            dimension = C16737.m39279().getDimension(R.dimen.MT_Protector);
        }
        return (int) dimension;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static int m40556() {
        return f55386;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m40551(int i) {
        int iM40554 = m40554(i);
        f55386 = iM40554;
        ApplicationC0716.f2992.edit().mo4065(iM40554, "scp_2").apply();
        C16737.m39270(new Intent("ScreenColorPickerConfig.ACTION_CONFIG_CHANGED"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m40553() {
        int i = f55388;
        if (i != 0) {
            return i != 2 ? 8 : 6;
        }
        return 10;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m40562() {
        return f55388;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m40563(int i) {
        int iM40554 = m40554(i);
        f55388 = iM40554;
        ApplicationC0716.f2992.edit().mo4065(iM40554, "scp_3").apply();
        C16737.m39270(new Intent("ScreenColorPickerConfig.ACTION_CONFIG_CHANGED"));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m40550() {
        int i = f55387;
        if (i != 0) {
            return i != 2 ? 20 : 30;
        }
        return 10;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m40558() {
        return f55387;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m40559(int i) {
        int iM40554 = m40554(i);
        f55387 = iM40554;
        ApplicationC0716.f2992.edit().mo4065(iM40554, "scp_4").apply();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static void m40557() {
        f55389 = ApplicationC0716.f2992.getBoolean("scp_6", false);
        f55383 = ApplicationC0716.f2992.getBoolean("scp_1", true);
        f55384 = ApplicationC0716.f2992.getBoolean("scp_5", true);
        f55386 = m40554(ApplicationC0716.f2992.getInt("scp_2", 1));
        f55388 = m40554(ApplicationC0716.f2992.getInt("scp_3", 1));
        f55387 = m40554(ApplicationC0716.f2992.getInt("scp_4", 1));
    }
}
