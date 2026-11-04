package l;

import android.os.Build;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes.dex */
public final class C22623 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C10688 f73217;

    public C22623(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f73217 = new C21877(C8494.m22811(i, interpolator, j));
        } else {
            this.f73217 = new C2528(i, interpolator, j);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m50972() {
        return this.f73217.mo27237();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float m50973() {
        return this.f73217.mo27238();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m50970() {
        return this.f73217.mo27235();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50971(float f) {
        this.f73217.mo27236(f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22623 m50969(WindowInsetsAnimation windowInsetsAnimation) {
        C22623 c22623 = new C22623(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            c22623.f73217 = new C21877(windowInsetsAnimation);
        }
        return c22623;
    }
}
