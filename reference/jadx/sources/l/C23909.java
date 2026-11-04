package l;

/* JADX INFO: renamed from: l.᩹᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6ZT */
/* JADX INFO: loaded from: classes.dex */
public final class C23909 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long[] f77416;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long[] f77417;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long[] f77418;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f77419;

    public C23909(int i) {
        this.f77419 = i;
        this.f77416 = new long[i];
        this.f77418 = new long[i * 128];
        this.f77417 = new long[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23909 m53411(C19161[] c19161Arr) {
        for (C19161 c19161 : c19161Arr) {
            if (!c19161.m44416() && !c19161.m44418() && !c19161.m44411()) {
                C23909 c23909 = new C23909((c19161Arr.length + 63) >>> 6);
                for (int i = 0; i < c19161Arr.length; i++) {
                    C19161 c19162 = c19161Arr[i];
                    int i2 = i >>> 6;
                    long j = 1 << (i & 63);
                    if (c19162.m44416() || c19162.m44418() || c19162.m44411()) {
                        long[] jArr = c23909.f77416;
                        jArr[i2] = jArr[i2] | j;
                    } else {
                        c23909.m53412(0, i2, c19162.m44413(), j);
                        c23909.m53412(64, i2, c19162.m44417(), j);
                        if (c19162.m44415()) {
                            long[] jArr2 = c23909.f77417;
                            jArr2[i2] = jArr2[i2] | j;
                        }
                    }
                }
                return c23909;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m53413() {
        return this.f77419;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m53414(int i, int i2) {
        long j = this.f77416[i];
        if (i2 < 0) {
            return j;
        }
        if (i2 < 128) {
            return j | this.f77418[(i2 * this.f77419) + i];
        }
        return this.f77417[i] | j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m53412(int i, int i2, long j, long j2) {
        while (j != 0) {
            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j) + i;
            j &= j - 1;
            int i3 = (iNumberOfTrailingZeros * this.f77419) + i2;
            long[] jArr = this.f77418;
            jArr[i3] = jArr[i3] | j2;
        }
    }
}
