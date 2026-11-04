package l;

import android.graphics.Point;
import android.util.DisplayMetrics;

/* JADX INFO: renamed from: l.ۜۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: C57W */
/* JADX INFO: loaded from: classes3.dex */
public final class C6907 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float f22900;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static float f22904;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Point f22902 = new Point();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Point f22901 = new Point();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean f22903 = false;

    static {
        DisplayMetrics displayMetrics = C21576.m49055().getDisplayMetrics();
        f22904 = displayMetrics.density;
        f22900 = displayMetrics.scaledDensity;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m19160(float f) {
        return (int) ((f * f22904) + 0.5f);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m19162(float f) {
        return (int) ((f / f22900) + 0.5f);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m19161(float f) {
        return (int) ((f * f22900) + 0.5f);
    }
}
