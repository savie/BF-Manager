package l;

/* JADX INFO: renamed from: l.᩻ۢۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: A18X */
/* JADX INFO: loaded from: classes.dex */
public final class C24953 implements InterfaceC9772 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C20477 f80782;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C15496 f80783;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC0078 f80784;

    @Override // l.InterfaceC9772
    /* JADX INFO: renamed from: ۙ */
    public final void mo25483(AbstractC17734 abstractC17734, int i) {
    }

    public C24953(C15496 c15496, C20477 c20477, AbstractC0078 abstractC0078) {
        this.f80783 = c15496;
        this.f80782 = c20477;
        this.f80784 = abstractC0078;
    }

    @Override // l.InterfaceC9772
    /* JADX INFO: renamed from: ᩷ */
    public final void mo25484(AbstractC17734 abstractC17734, int i) {
        if (abstractC17734 instanceof C15496) {
            C15496 c15496 = (C15496) abstractC17734;
            if (this.f80784.mo1133(this.f80783, c15496)) {
                this.f80782.add(c15496);
            }
        }
    }
}
