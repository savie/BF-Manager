package l;

/* JADX INFO: renamed from: l.ۛ֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BEJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6030 extends AbstractC12741 {
    public C6030(C18708 c18708, C9012 c9012, C20946 c20946, C0063 c0063, AbstractC13487 abstractC13487) {
        super(c18708, c9012, c20946, c0063, abstractC13487);
        if (c18708.m43508() == 1) {
            return;
        }
        throw new IllegalArgumentException("opcode with invalid branchingness: " + c18708.m43508());
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC11050 mo7781() {
        return C13705.f43487;
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ۙ */
    public final void mo7779(InterfaceC16470 interfaceC16470) {
        interfaceC16470.mo38985(this);
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17216 mo7777(C5085 c5085) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17216 mo7778(C20946 c20946, C0063 c0063) {
        return new C6030(m40434(), m40433(), c20946, c0063, m31552());
    }
}
