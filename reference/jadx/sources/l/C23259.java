package l;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.᩹ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 93YB */
/* JADX INFO: loaded from: classes.dex */
public final class C23259 extends Drawable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final double f75369 = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static float m52345(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        return (float) (((1.0d - f75369) * ((double) f2)) + ((double) (f * 1.5f)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m52344(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        return (float) (((1.0d - f75369) * ((double) f2)) + ((double) f));
    }
}
