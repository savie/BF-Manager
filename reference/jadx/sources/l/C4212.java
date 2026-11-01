package l;

/* JADX INFO: renamed from: l.ۘ᩸ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8LV */
/* JADX INFO: loaded from: classes2.dex */
public final class C4212 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f15289;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f15290;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C5188 f15291;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f15292;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f15293;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long[] f15294;

    public C4212(C5188 c5188, long j, long j2, long[] jArr, int i, int i2) {
        C5188 c5189 = new C5188();
        c5189.f17990 = c5188.f17990;
        c5189.f17991 = c5188.f17991;
        c5189.f17994 = c5188.f17994;
        c5189.f17993 = c5188.f17993;
        c5189.f17995 = c5188.f17995;
        c5189.f17992 = c5188.f17992;
        c5189.f17996 = c5188.f17996;
        this.f15291 = c5189;
        this.f15289 = j;
        this.f15290 = j2;
        this.f15294 = jArr;
        this.f15293 = i;
        this.f15292 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4212 m11877(C5188 c5188, C2460 c2460) {
        long[] jArr;
        int i;
        int i2;
        int iM7499 = c2460.m7499();
        int iM7531 = (iM7499 & 1) != 0 ? c2460.m7531() : -1;
        long jM7532 = (iM7499 & 2) != 0 ? c2460.m7532() : -1L;
        if ((iM7499 & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i3 = 0; i3 < 100; i3++) {
                jArr2[i3] = c2460.m7516();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((iM7499 & 8) != 0) {
            c2460.m7535(4);
        }
        if (c2460.m7503() >= 24) {
            c2460.m7535(21);
            int iM7525 = c2460.m7525();
            i2 = iM7525 & 4095;
            i = (16773120 & iM7525) >> 12;
        } else {
            i = -1;
            i2 = -1;
        }
        return new C4212(c5188, iM7531, jM7532, jArr, i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m11878() {
        long j = this.f15289;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        C5188 c5188 = this.f15291;
        return C17983.m41826(c5188.f17993, (j * ((long) c5188.f17996)) - 1);
    }
}
