package l;

/* JADX INFO: renamed from: l.᩸ۙܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8LH */
/* JADX INFO: loaded from: classes5.dex */
public final class C21354 implements InterfaceC18739 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18739 f69472;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17826 f69473;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f69474;

    public C21354(C17826 c17826, InterfaceC18739 interfaceC18739) {
        this.f69473 = c17826;
        this.f69472 = interfaceC18739;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m47883() {
        this.f69474 = false;
    }

    @Override // l.InterfaceC18739
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo12778() {
        return !this.f69473.m41399() && this.f69472.mo12778();
    }

    @Override // l.InterfaceC18739
    /* JADX INFO: renamed from: ۙ */
    public final void mo12777() {
        this.f69472.mo12777();
    }

    @Override // l.InterfaceC18739
    /* JADX INFO: renamed from: ۙ */
    public final int mo12776(C12526 c12526, C16033 c16033, int i) {
        C17826 c17826 = this.f69473;
        if (c17826.m41399()) {
            return -3;
        }
        if (this.f69474) {
            c16033.m42267(4);
            return -4;
        }
        long jMo1391 = c17826.mo1391();
        int iMo12776 = this.f69472.mo12776(c12526, c16033, i);
        if (iMo12776 == -5) {
            C7648 c7648 = c12526.f41899;
            c7648.getClass();
            int i2 = c7648.f25254;
            int i3 = c7648.f25272;
            if (i3 == 0 && i2 == 0) {
                return -5;
            }
            if (c17826.f56456 != 0) {
                i3 = 0;
            }
            if (c17826.f56455 != Long.MIN_VALUE) {
                i2 = 0;
            }
            C10471 c10471M20201 = c7648.m20201();
            c10471M20201.m26496(i3);
            c10471M20201.m26510(i2);
            c12526.f41899 = c10471M20201.m26497();
            return -5;
        }
        long j = c17826.f56455;
        if (j == Long.MIN_VALUE || ((iMo12776 != -4 || c16033.f51910 < j) && !(iMo12776 == -3 && jMo1391 == Long.MIN_VALUE && !c16033.f51915))) {
            return iMo12776;
        }
        c16033.mo7();
        c16033.m42267(4);
        this.f69474 = true;
        return -4;
    }

    @Override // l.InterfaceC18739
    /* JADX INFO: renamed from: ۙ */
    public final int mo12775(long j) {
        if (this.f69473.m41399()) {
            return -3;
        }
        return this.f69472.mo12775(j);
    }
}
