package l;

import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: l.ᩴۙۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5IZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19577 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EdgeEffect f63132;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m45177(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C22561.m50790(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45178(EdgeEffect edgeEffect, float f, float f2) {
        C10626.m27097(edgeEffect, f, f2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static float m45179(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT < 31) {
            C10626.m27097(edgeEffect, f, f2);
            return f;
        }
        return C22561.m50791(edgeEffect, f, f2);
    }
}
