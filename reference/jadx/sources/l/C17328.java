package l;

/* JADX INFO: renamed from: l.ܿۨܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8M4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17328 implements InterfaceC18739 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18739 f55134;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f55135;

    public C17328(InterfaceC18739 interfaceC18739, long j) {
        this.f55134 = interfaceC18739;
        this.f55135 = j;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18739 m40290() {
        return this.f55134;
    }

    @Override // l.InterfaceC18739
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo12778() {
        return this.f55134.mo12778();
    }

    @Override // l.InterfaceC18739
    /* JADX INFO: renamed from: ۙ */
    public final void mo12777() {
        this.f55134.mo12777();
    }

    @Override // l.InterfaceC18739
    /* JADX INFO: renamed from: ۙ */
    public final int mo12776(C12526 c12526, C16033 c16033, int i) {
        int iMo12776 = this.f55134.mo12776(c12526, c16033, i);
        if (iMo12776 == -4) {
            c16033.f51910 += this.f55135;
        }
        return iMo12776;
    }

    @Override // l.InterfaceC18739
    /* JADX INFO: renamed from: ۙ */
    public final int mo12775(long j) {
        return this.f55134.mo12775(j - this.f55135);
    }
}
