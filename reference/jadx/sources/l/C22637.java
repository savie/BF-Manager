package l;

import android.content.Intent;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩸ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AL3 */
/* JADX INFO: loaded from: classes.dex */
public final class C22637 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f73532 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int f73533 = 1;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static boolean f73534 = true;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean f73535 = false;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static int f73536 = 1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int f73537 = 1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean f73538 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m51029(int i) {
        if (i < 0 || i > 2) {
            return 1;
        }
        return i;
    }

    static {
        m51035();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m51044() {
        m51035();
        C21576.m49065(new Intent("ScreenColorPickerConfig.ACTION_CONFIG_CHANGED"));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m51031() {
        return f73535;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m51041(boolean z) {
        f73535 = z;
        C6421.m18184(ApplicationC17729.f58258, "scp_6", z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m51027() {
        return f73534;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m51034(boolean z) {
        f73534 = z;
        ApplicationC17729.f58258.edit().putBoolean("scp_1", z).apply();
        C21576.m49065(new Intent("ScreenColorPickerConfig.ACTION_CONFIG_CHANGED"));
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static boolean m51036() {
        return f73538;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51030(boolean z) {
        f73538 = z;
        C6421.m18184(ApplicationC17729.f58258, "scp_5", z);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static int m51037() {
        float dimension;
        int i = f73536;
        if (i == 0) {
            dimension = C21576.m49055().getDimension(R.dimen.MT_Protector);
        } else if (i == 2) {
            dimension = C21576.m49055().getDimension(R.dimen.MT_Protector);
        } else {
            dimension = C21576.m49055().getDimension(R.dimen.MT_Protector);
        }
        return (int) dimension;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static int m51038() {
        return f73536;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m51043(int i) {
        int iM51029 = m51029(i);
        f73536 = iM51029;
        ApplicationC17729.f58258.edit().mo3486(iM51029, "scp_2").apply();
        C21576.m49065(new Intent("ScreenColorPickerConfig.ACTION_CONFIG_CHANGED"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m51028() {
        int i = f73537;
        if (i != 0) {
            return i != 2 ? 8 : 6;
        }
        return 10;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m51039() {
        return f73537;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m51040(int i) {
        int iM51029 = m51029(i);
        f73537 = iM51029;
        ApplicationC17729.f58258.edit().mo3486(iM51029, "scp_3").apply();
        C21576.m49065(new Intent("ScreenColorPickerConfig.ACTION_CONFIG_CHANGED"));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m51042() {
        int i = f73533;
        if (i != 0) {
            return i != 2 ? 20 : 30;
        }
        return 10;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m51032() {
        return f73533;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m51033(int i) {
        int iM51029 = m51029(i);
        f73533 = iM51029;
        ApplicationC17729.f58258.edit().mo3486(iM51029, "scp_4").apply();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m51035() {
        f73535 = ApplicationC17729.f58258.getBoolean("scp_6", false);
        f73534 = ApplicationC17729.f58258.getBoolean("scp_1", true);
        f73538 = ApplicationC17729.f58258.getBoolean("scp_5", true);
        f73536 = m51029(ApplicationC17729.f58258.getInt("scp_2", 1));
        f73537 = m51029(ApplicationC17729.f58258.getInt("scp_3", 1));
        f73533 = m51029(ApplicationC17729.f58258.getInt("scp_4", 1));
    }
}
