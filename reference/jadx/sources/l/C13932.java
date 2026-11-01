package l;

import android.graphics.Point;
import android.util.DisplayMetrics;

/* JADX INFO: renamed from: l.ܰܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: C57W */
/* JADX INFO: loaded from: classes3.dex */
public final class C13932 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static float f45875;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float f45876;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Point f45877 = new Point();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Point f45878 = new Point();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean f45879 = false;

    static {
        DisplayMetrics displayMetrics = C16737.m39279().getDisplayMetrics();
        f45875 = displayMetrics.density;
        f45876 = displayMetrics.scaledDensity;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m33769(float f) {
        return (int) ((f * f45875) + 0.5f);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m33771(float f) {
        return (int) ((f / f45876) + 0.5f);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m33770(float f) {
        return (int) ((f * f45876) + 0.5f);
    }
}
