package l;

import android.graphics.RectF;

/* JADX INFO: renamed from: l.֨ۢ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: G6MJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1036 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final float f4826;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f4827;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f4828;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final RectF f4829;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f4830;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final RectF f4831;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f4832;

    public C1036(long j, long j2, int i, int i2, int i3, int i4) {
        this.f4827 = i3;
        this.f4828 = j;
        this.f4832 = j2;
        this.f4830 = i4;
        float fScalb = Math.scalb(1.0f, i3);
        this.f4826 = fScalb;
        double d = i4;
        double d2 = j * d;
        double d3 = j2 * d;
        double d4 = fScalb;
        double d5 = i;
        double d6 = d2 + d;
        float fMin = (float) Math.min(d5, d6 / d4);
        double d7 = i2;
        double d8 = d + d3;
        this.f4831 = new RectF((float) (d2 / d4), (float) (d3 / d4), fMin, (float) Math.min(d7, d8 / d4));
        this.f4829 = new RectF((float) Math.max(0.0d, (d2 - 1.0d) / d4), (float) Math.max(0.0d, (d3 - 1.0d) / d4), (float) Math.min(d5, (d6 + 1.0d) / d4), (float) Math.min(d7, (d8 + 1.0d) / d4));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1036)) {
            return false;
        }
        C1036 c1036 = (C1036) obj;
        return this.f4827 == c1036.f4827 && this.f4830 == c1036.f4830 && this.f4828 == c1036.f4828 && this.f4832 == c1036.f4832;
    }

    public final int hashCode() {
        int i = ((this.f4827 * 31) + this.f4830) * 31;
        long j = this.f4828;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f4832;
        return i2 + ((int) (j2 ^ (j2 >>> 32)));
    }
}
