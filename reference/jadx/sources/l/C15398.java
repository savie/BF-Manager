package l;

/* JADX INFO: renamed from: l.ܶᩳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8R0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15398 implements InterfaceC19631 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C23451 f50130;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C10751 f50132;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f50131 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f50133 = -1;

    public C15398(C23451 c23451, C10751 c10751) {
        this.f50130 = c23451;
        this.f50132 = c10751;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m36832(long j) {
        this.f50131 = j;
    }

    @Override // l.InterfaceC19631
    /* JADX INFO: renamed from: ۙ */
    public final long mo20180(InterfaceC7222 interfaceC7222) {
        long j = this.f50133;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.f50133 = -1L;
        return j2;
    }

    @Override // l.InterfaceC19631
    /* JADX INFO: renamed from: ۙ */
    public final void mo20182(long j) {
        long[] jArr = this.f50132.f36652;
        this.f50133 = jArr[C17983.m41855(jArr, j, true)];
    }

    @Override // l.InterfaceC19631
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC6599 mo20181() {
        C2023.m6510(this.f50131 != -1);
        return new C5811(this.f50130, this.f50131);
    }
}
