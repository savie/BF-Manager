package l;

import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: l.֨ۙۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5IZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0883 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EdgeEffect f3574;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m3556(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C22051.m48994(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3557(EdgeEffect edgeEffect, float f, float f2) {
        C5117.m14262(edgeEffect, f, f2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static float m3558(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT < 31) {
            C5117.m14262(edgeEffect, f, f2);
            return f;
        }
        return C22051.m48995(edgeEffect, f, f2);
    }
}
