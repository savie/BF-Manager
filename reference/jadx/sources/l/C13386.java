package l;

/* JADX INFO: renamed from: l.۬᩸ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8H3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13386 implements InterfaceC1390 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f44332;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f44333;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long[] f44334;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f44335;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f44336;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long[] f44337;

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo5382() {
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13386 m32881(long j, long j2, C5188 c5188, C2460 c2460) {
        long j3;
        long jMax;
        int iM7516;
        c2460.m7535(6);
        int iM7499 = c2460.m7499();
        long j4 = j2 + ((long) c5188.f17994);
        long j5 = ((long) iM7499) + j4;
        int iM74910 = c2460.m7499();
        if (iM74910 <= 0) {
            return null;
        }
        long jM41826 = C17983.m41826(c5188.f17993, (((long) iM74910) * ((long) c5188.f17996)) - 1);
        int iM7519 = c2460.m7519();
        int iM75110 = c2460.m7519();
        int iM75111 = c2460.m7519();
        c2460.m7535(2);
        long j6 = j2 + ((long) c5188.f17994);
        long[] jArr = new long[iM7519];
        long[] jArr2 = new long[iM7519];
        int i = 0;
        while (i < iM7519) {
            long j7 = j5;
            long j8 = jM41826;
            jArr[i] = (((long) i) * jM41826) / ((long) iM7519);
            jArr2[i] = j6;
            if (iM75111 == 1) {
                iM7516 = c2460.m7516();
            } else if (iM75111 == 2) {
                iM7516 = c2460.m7519();
            } else if (iM75111 == 3) {
                iM7516 = c2460.m7525();
            } else {
                if (iM75111 != 4) {
                    return null;
                }
                iM7516 = c2460.m7531();
            }
            j6 += ((long) iM7516) * ((long) iM75110);
            i++;
            j5 = j7;
            jM41826 = j8;
        }
        long j9 = j5;
        long j10 = jM41826;
        if (j == -1 || j == j9) {
            j3 = j9;
        } else {
            StringBuilder sbM39970 = C17114.m39970("VBRI data size mismatch: ", ", ", j);
            j3 = j9;
            sbM39970.append(j3);
            C0303.m1848(sbM39970.toString());
        }
        if (j3 != j6) {
            StringBuilder sbM39971 = C17114.m39970("VBRI bytes and ToC mismatch (using max): ", ", ", j3);
            sbM39971.append(j6);
            sbM39971.append("\nSeeking will be inaccurate.");
            C0303.m1848(sbM39971.toString());
            jMax = Math.max(j3, j6);
        } else {
            jMax = j3;
        }
        return new C13386(jArr, jArr2, j10, j4, jMax, c5188.f17992);
    }

    public C13386(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.f44337 = jArr;
        this.f44334 = jArr2;
        this.f44332 = j;
        this.f44335 = j2;
        this.f44336 = j3;
        this.f44333 = i;
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۙ */
    public final C12950 mo5381(long j) {
        long[] jArr = this.f44337;
        int iM41855 = C17983.m41855(jArr, j, true);
        long j2 = jArr[iM41855];
        long[] jArr2 = this.f44334;
        C22828 c22828 = new C22828(j2, jArr2[iM41855]);
        if (j2 >= j || iM41855 == jArr.length - 1) {
            return new C12950(c22828, c22828);
        }
        int i = iM41855 + 1;
        return new C12950(c22828, new C22828(jArr[i], jArr2[i]));
    }

    @Override // l.InterfaceC1390
    /* JADX INFO: renamed from: ܰ */
    public final long mo4878(long j) {
        return this.f44337[C17983.m41855(this.f44334, j, true)];
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۬ */
    public final long mo5383() {
        return this.f44332;
    }

    @Override // l.InterfaceC1390
    /* JADX INFO: renamed from: ܰ */
    public final long mo4877() {
        return this.f44335;
    }

    @Override // l.InterfaceC1390
    /* JADX INFO: renamed from: ۖ */
    public final long mo4876() {
        return this.f44336;
    }

    @Override // l.InterfaceC1390
    /* JADX INFO: renamed from: ֨ */
    public final int mo4875() {
        return this.f44333;
    }
}
