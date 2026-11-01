package l;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.ۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes2.dex */
public class C2436 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f9747;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f9748;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Interpolator f9749;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f9750;

    public C2436(int i, Interpolator interpolator, long j) {
        this.f9747 = i;
        this.f9749 = interpolator;
        this.f9748 = j;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int mo7421() {
        return this.f9747;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float mo7422() {
        Interpolator interpolator = this.f9749;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f9750);
        }
        return this.f9750;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long mo7419() {
        return this.f9748;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo7420(float f) {
        this.f9750 = f;
    }
}
