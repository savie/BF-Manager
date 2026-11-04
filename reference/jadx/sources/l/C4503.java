package l;

import android.graphics.RectF;

/* JADX INFO: renamed from: l.ۘ᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: G6MJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4503 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f16072;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f16073;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final float f16074;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f16075;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final RectF f16076;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final RectF f16077;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f16078;

    public C4503(long j, long j2, int i, int i2, int i3, int i4) {
        this.f16078 = i3;
        this.f16072 = j;
        this.f16075 = j2;
        this.f16073 = i4;
        float fScalb = Math.scalb(1.0f, i3);
        this.f16074 = fScalb;
        double d = i4;
        double d2 = j * d;
        double d3 = j2 * d;
        double d4 = fScalb;
        double d5 = i;
        double d6 = d2 + d;
        float fMin = (float) Math.min(d5, d6 / d4);
        double d7 = i2;
        double d8 = d + d3;
        this.f16077 = new RectF((float) (d2 / d4), (float) (d3 / d4), fMin, (float) Math.min(d7, d8 / d4));
        this.f16076 = new RectF((float) Math.max(0.0d, (d2 - 1.0d) / d4), (float) Math.max(0.0d, (d3 - 1.0d) / d4), (float) Math.min(d5, (d6 + 1.0d) / d4), (float) Math.min(d7, (d8 + 1.0d) / d4));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4503)) {
            return false;
        }
        C4503 c4503 = (C4503) obj;
        return this.f16078 == c4503.f16078 && this.f16073 == c4503.f16073 && this.f16072 == c4503.f16072 && this.f16075 == c4503.f16075;
    }

    public final int hashCode() {
        int i = ((this.f16078 * 31) + this.f16073) * 31;
        long j = this.f16072;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f16075;
        return i2 + ((int) (j2 ^ (j2 >>> 32)));
    }
}
