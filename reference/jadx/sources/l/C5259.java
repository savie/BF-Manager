package l;

import android.os.Build;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.ۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes2.dex */
public final class C5259 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C2436 f18237;

    public C5259(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f18237 = new C11610(C9266.m23802(i, interpolator, j));
        } else {
            this.f18237 = new C1503(i, interpolator, j);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m14531() {
        return this.f18237.mo7421();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float m14532() {
        return this.f18237.mo7422();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m14529() {
        return this.f18237.mo7419();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14530(float f) {
        this.f18237.mo7420(f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5259 m14528(WindowInsetsAnimation windowInsetsAnimation) {
        C5259 c5259 = new C5259(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            c5259.f18237 = new C11610(windowInsetsAnimation);
        }
        return c5259;
    }
}
