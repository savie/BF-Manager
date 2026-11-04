package l;

/* JADX INFO: renamed from: l.ۖ֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBDA */
/* JADX INFO: loaded from: classes3.dex */
public final class C2301 extends AbstractC17216 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C24698 f7460;

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo7780(AbstractC17216 abstractC17216) {
        return false;
    }

    public C2301(C18708 c18708, C9012 c9012, C20946 c20946, C0063 c0063, C24698 c24698) {
        super(c18708, c9012, c20946, c0063);
        if (c18708.m43508() != 5) {
            throw new IllegalArgumentException("bogus branchingness");
        }
        if (c24698 == null) {
            throw new NullPointerException("cases == null");
        }
        this.f7460 = c24698;
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String mo7782() {
        return this.f7460.toString();
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11050 mo7781() {
        return C13705.f43487;
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7779(InterfaceC16470 interfaceC16470) {
        interfaceC16470.mo38984(this);
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC17216 mo7777(C5085 c5085) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC17216 mo7778(C20946 c20946, C0063 c0063) {
        return new C2301(m40434(), m40433(), c20946, c0063, this.f7460);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C24698 m7783() {
        return this.f7460;
    }
}
