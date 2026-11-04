package l;

/* JADX INFO: renamed from: l.ܽ֫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 38RU */
/* JADX INFO: loaded from: classes5.dex */
public final class C17264 implements InterfaceC9060 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f56242;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C23232 f56243;

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo2298() {
        return true;
    }

    public C17264(C23232 c23232, long j) {
        this.f56243 = c23232;
        this.f56242 = j;
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ۚ */
    public final long mo2295() {
        return this.f56243.m52211();
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ۙ */
    public final C9805 mo2290(long j) {
        C23232 c23232 = this.f56243;
        C20782.m47566(c23232.f75260);
        C15772 c15772 = c23232.f75260;
        long[] jArr = c15772.f51350;
        long[] jArr2 = c15772.f51349;
        int iM19505 = C7116.m19505(jArr, C7116.m19476((((long) c23232.f75249) * j) / 1000000, 0L, c23232.f75256 - 1), false);
        long j2 = iM19505 == -1 ? 0L : jArr[iM19505];
        long j3 = iM19505 != -1 ? jArr2[iM19505] : 0L;
        int i = c23232.f75249;
        long j4 = (j2 * 1000000) / ((long) i);
        long j5 = this.f56242;
        C2349 c2349 = new C2349(j4, j3 + j5);
        if (j4 != j && iM19505 != jArr.length - 1) {
            int i2 = iM19505 + 1;
            return new C9805(c2349, new C2349((jArr[i2] * 1000000) / ((long) i), j5 + jArr2[i2]));
        }
        return new C9805(c2349, c2349);
    }
}
