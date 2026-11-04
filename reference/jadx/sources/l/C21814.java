package l;

/* JADX INFO: renamed from: l.᩷ۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes2.dex */
public final class C21814 extends C12395 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f69553;

    @Override // l.C12395, l.InterfaceC1209
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4423() {
        return super.mo4423() || this.f69553;
    }

    @Override // l.C12395, l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1518(C16327 c16327) {
        super.mo1518(c16327);
        if (c16327.f53000 == EnumC17819.IMPLICIT) {
            this.f69553 = true;
        }
    }

    @Override // l.C12395, l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1954(C12598 c12598) {
        super.mo1954(c12598);
        if (c12598.mo6737() != EnumC3649.UNOVERLOADED) {
            this.f69553 = true;
        }
    }
}
