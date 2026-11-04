package l;

/* JADX INFO: renamed from: l.֨ܺ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8H3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1294 implements InterfaceC10242 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f4617;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f4618;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long[] f4619;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long[] f4620;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f4621;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f4622;

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo2298() {
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1294 m4687(long j, long j2, C18010 c18010, C21287 c21287) {
        long j3;
        long jMax;
        int iM48493;
        c21287.m48503(6);
        int iM48500 = c21287.m48500();
        long j4 = j2 + ((long) c18010.f58964);
        long j5 = ((long) iM48500) + j4;
        int iM48501 = c21287.m48500();
        if (iM48501 <= 0) {
            return null;
        }
        long jM19473 = C7116.m19473(c18010.f58967, (((long) iM48501) * ((long) c18010.f58966)) - 1);
        int iM48494 = c21287.m48494();
        int iM48495 = c21287.m48494();
        int iM48496 = c21287.m48494();
        c21287.m48503(2);
        long j6 = j2 + ((long) c18010.f58964);
        long[] jArr = new long[iM48494];
        long[] jArr2 = new long[iM48494];
        int i = 0;
        while (i < iM48494) {
            long j7 = j5;
            long j8 = jM19473;
            jArr[i] = (((long) i) * jM19473) / ((long) iM48494);
            jArr2[i] = j6;
            if (iM48496 == 1) {
                iM48493 = c21287.m48493();
            } else if (iM48496 == 2) {
                iM48493 = c21287.m48494();
            } else if (iM48496 == 3) {
                iM48493 = c21287.m48501();
            } else {
                if (iM48496 != 4) {
                    return null;
                }
                iM48493 = c21287.m48512();
            }
            j6 += ((long) iM48493) * ((long) iM48495);
            i++;
            j5 = j7;
            jM19473 = j8;
        }
        long j9 = j5;
        long j10 = jM19473;
        if (j == -1 || j == j9) {
            j3 = j9;
        } else {
            StringBuilder sbM8289 = C2458.m8289("VBRI data size mismatch: ", ", ", j);
            j3 = j9;
            sbM8289.append(j3);
            C1896.m6517(sbM8289.toString());
        }
        if (j3 != j6) {
            StringBuilder sbM82810 = C2458.m8289("VBRI bytes and ToC mismatch (using max): ", ", ", j3);
            sbM82810.append(j6);
            sbM82810.append("\nSeeking will be inaccurate.");
            C1896.m6517(sbM82810.toString());
            jMax = Math.max(j3, j6);
        } else {
            jMax = j3;
        }
        return new C1294(jArr, jArr2, j10, j4, jMax, c18010.f58963);
    }

    public C1294(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.f4619 = jArr;
        this.f4620 = jArr2;
        this.f4622 = j;
        this.f4618 = j2;
        this.f4621 = j3;
        this.f4617 = i;
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ۙ */
    public final C9805 mo2290(long j) {
        long[] jArr = this.f4619;
        int iM19505 = C7116.m19505(jArr, j, true);
        long j2 = jArr[iM19505];
        long[] jArr2 = this.f4620;
        C2349 c2349 = new C2349(j2, jArr2[iM19505]);
        if (j2 >= j || iM19505 == jArr.length - 1) {
            return new C9805(c2349, c2349);
        }
        int i = iM19505 + 1;
        return new C9805(c2349, new C2349(jArr[i], jArr2[i]));
    }

    @Override // l.InterfaceC10242
    /* JADX INFO: renamed from: ᩷ */
    public final long mo2549(long j) {
        return this.f4619[C7116.m19505(this.f4620, j, true)];
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ۚ */
    public final long mo2295() {
        return this.f4622;
    }

    @Override // l.InterfaceC10242
    /* JADX INFO: renamed from: ᩷ */
    public final long mo2548() {
        return this.f4618;
    }

    @Override // l.InterfaceC10242
    /* JADX INFO: renamed from: ᩸ */
    public final long mo2550() {
        return this.f4621;
    }

    @Override // l.InterfaceC10242
    /* JADX INFO: renamed from: ۫ */
    public final int mo2547() {
        return this.f4617;
    }
}
