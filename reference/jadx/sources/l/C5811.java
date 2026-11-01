package l;

/* JADX INFO: renamed from: l.ۛۘܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38RU */
/* JADX INFO: loaded from: classes3.dex */
public final class C5811 implements InterfaceC6599 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f19740;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C23451 f19741;

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo5382() {
        return true;
    }

    public C5811(C23451 c23451, long j) {
        this.f19741 = c23451;
        this.f19740 = j;
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۬ */
    public final long mo5383() {
        return this.f19741.m51685();
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۙ */
    public final C12950 mo5381(long j) {
        C23451 c23451 = this.f19741;
        C2023.m6508(c23451.f75959);
        C10751 c10751 = c23451.f75959;
        long[] jArr = c10751.f36652;
        long[] jArr2 = c10751.f36651;
        int iM41855 = C17983.m41855(jArr, C17983.m41829((((long) c23451.f75950) * j) / 1000000, 0L, c23451.f75957 - 1), false);
        long j2 = iM41855 == -1 ? 0L : jArr[iM41855];
        long j3 = iM41855 != -1 ? jArr2[iM41855] : 0L;
        int i = c23451.f75950;
        long j4 = (j2 * 1000000) / ((long) i);
        long j5 = this.f19740;
        C22828 c22828 = new C22828(j4, j3 + j5);
        if (j4 != j && iM41855 != jArr.length - 1) {
            int i2 = iM41855 + 1;
            return new C12950(c22828, new C22828((jArr[i2] * 1000000) / ((long) i), j5 + jArr2[i2]));
        }
        return new C12950(c22828, c22828);
    }
}
