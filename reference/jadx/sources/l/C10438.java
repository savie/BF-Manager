package l;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.ۤܿܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10438 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f35650 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f35646 = false;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f35648 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f35645 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f35649 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Interpolator f35647 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26351(int i) {
        this.f35650 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m26354() {
        return this.f35650 >= 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26353(C17492 c17492) {
        int i = this.f35650;
        if (i >= 0) {
            this.f35650 = -1;
            c17492.jumpToPositionForSmoothScroller(i);
            this.f35646 = false;
        } else if (this.f35646) {
            Interpolator interpolator = this.f35647;
            if (interpolator != null && this.f35649 < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i2 = this.f35649;
            if (i2 >= 1) {
                c17492.mViewFlinger.m39439(this.f35648, this.f35645, interpolator, i2);
                this.f35646 = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26352(int i, int i2, Interpolator interpolator, int i3) {
        this.f35648 = i;
        this.f35645 = i2;
        this.f35649 = i3;
        this.f35647 = interpolator;
        this.f35646 = true;
    }
}
