package l;

/* JADX INFO: renamed from: l.ۧ᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A18X */
/* JADX INFO: loaded from: classes4.dex */
public final class C11244 implements InterfaceC23218 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C0617 f38034;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C4747 f38035;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC4166 f38036;

    @Override // l.InterfaceC23218
    /* JADX INFO: renamed from: ۙ */
    public final void mo20358(AbstractC14730 abstractC14730, int i) {
    }

    public C11244(C0617 c0617, C4747 c4747, AbstractC4166 abstractC4166) {
        this.f38034 = c0617;
        this.f38035 = c4747;
        this.f38036 = abstractC4166;
    }

    @Override // l.InterfaceC23218
    /* JADX INFO: renamed from: ܰ */
    public final void mo20359(AbstractC14730 abstractC14730, int i) {
        if (abstractC14730 instanceof C0617) {
            C0617 c0617 = (C0617) abstractC14730;
            if (this.f38036.mo2407(this.f38034, c0617)) {
                this.f38035.add(c0617);
            }
        }
    }
}
