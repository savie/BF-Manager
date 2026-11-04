package l;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.ۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes3.dex */
public class C10688 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f33918;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Interpolator f33919;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f33920;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f33921;

    public C10688(int i, Interpolator interpolator, long j) {
        this.f33921 = i;
        this.f33919 = interpolator;
        this.f33918 = j;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int mo27237() {
        return this.f33921;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float mo27238() {
        Interpolator interpolator = this.f33919;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f33920);
        }
        return this.f33920;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long mo27235() {
        return this.f33918;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo27236(float f) {
        this.f33920 = f;
    }
}
