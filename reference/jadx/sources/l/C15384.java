package l;

/* JADX INFO: renamed from: l.ܶܿ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: T1UY */
/* JADX INFO: loaded from: classes4.dex */
public final class C15384 implements InterfaceC21733 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f50077;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21733 f50078;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f50079 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f50080;

    public C15384(int i, int i2, InterfaceC21733 interfaceC21733) {
        this.f50077 = i2;
        this.f50080 = i & 7;
        this.f50078 = interfaceC21733;
    }

    @Override // l.InterfaceC21733
    /* JADX INFO: renamed from: ۙ */
    public final void mo5128(C12417 c12417, C17355 c17355) {
        int iM39119 = c17355.m39119();
        if ((this.f50079 & (~iM39119)) == 0 && (this.f50077 & iM39119) == 0) {
            int i = this.f50080;
            if (i == 0 || (iM39119 & i) != 0) {
                this.f50078.mo5128(c12417, c17355);
            }
        }
    }

    @Override // l.InterfaceC21733
    /* JADX INFO: renamed from: ۙ */
    public final void mo5127(C12417 c12417, C11006 c11006) {
        int iM39119 = c11006.m39119();
        if ((this.f50079 & (~iM39119)) == 0 && (this.f50077 & iM39119) == 0) {
            int i = this.f50080;
            if (i == 0 || (iM39119 & i) != 0) {
                this.f50078.mo5127(c12417, c11006);
            }
        }
    }
}
