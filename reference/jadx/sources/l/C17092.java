package l;

/* JADX INFO: renamed from: l.ܿۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6ZT */
/* JADX INFO: loaded from: classes4.dex */
public final class C17092 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f54509;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long[] f54510;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long[] f54511;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long[] f54512;

    public C17092(int i) {
        this.f54509 = i;
        this.f54510 = new long[i];
        this.f54512 = new long[i * 128];
        this.f54511 = new long[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17092 m39869(C3399[] c3399Arr) {
        for (C3399 c3399 : c3399Arr) {
            if (!c3399.m10081() && !c3399.m10077() && !c3399.m10079()) {
                C17092 c17092 = new C17092((c3399Arr.length + 63) >>> 6);
                for (int i = 0; i < c3399Arr.length; i++) {
                    C3399 c33910 = c3399Arr[i];
                    int i2 = i >>> 6;
                    long j = 1 << (i & 63);
                    if (c33910.m10081() || c33910.m10077() || c33910.m10079()) {
                        long[] jArr = c17092.f54510;
                        jArr[i2] = jArr[i2] | j;
                    } else {
                        c17092.m39870(0, i2, c33910.m10082(), j);
                        c17092.m39870(64, i2, c33910.m10083(), j);
                        if (c33910.m10084()) {
                            long[] jArr2 = c17092.f54511;
                            jArr2[i2] = jArr2[i2] | j;
                        }
                    }
                }
                return c17092;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m39871() {
        return this.f54509;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m39872(int i, int i2) {
        long j = this.f54510[i];
        if (i2 < 0) {
            return j;
        }
        if (i2 < 128) {
            return j | this.f54512[(i2 * this.f54509) + i];
        }
        return this.f54511[i] | j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m39870(int i, int i2, long j, long j2) {
        while (j != 0) {
            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j) + i;
            j &= j - 1;
            int i3 = (iNumberOfTrailingZeros * this.f54509) + i2;
            long[] jArr = this.f54512;
            jArr[i3] = jArr[i3] | j2;
        }
    }
}
