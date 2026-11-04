package l;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.ۤᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11054 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f34875 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f34873 = false;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f34874 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f34878 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f34877 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Interpolator f34876 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27937(int i) {
        this.f34875 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m27940() {
        return this.f34875 >= 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27939(C25227 c25227) {
        int i = this.f34875;
        if (i >= 0) {
            this.f34875 = -1;
            c25227.jumpToPositionForSmoothScroller(i);
            this.f34873 = false;
        } else if (this.f34873) {
            Interpolator interpolator = this.f34876;
            if (interpolator != null && this.f34877 < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i2 = this.f34877;
            if (i2 >= 1) {
                c25227.mViewFlinger.m7281(this.f34874, this.f34878, interpolator, i2);
                this.f34873 = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27938(int i, int i2, Interpolator interpolator, int i3) {
        this.f34874 = i;
        this.f34878 = i2;
        this.f34877 = i3;
        this.f34876 = interpolator;
        this.f34873 = true;
    }
}
