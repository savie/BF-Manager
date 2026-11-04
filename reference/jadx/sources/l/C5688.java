package l;

/* JADX INFO: renamed from: l.ۚܰۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: HIUL */
/* JADX INFO: loaded from: classes3.dex */
public final class C5688 extends AbstractC16700 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f19647 = C16980.m40037(C5688.class);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12509 f19648;

    public C5688(InterfaceC12509 interfaceC12509) {
        this.f19648 = interfaceC12509;
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo8439(C1610 c1610) {
        try {
            this.f19648.m31061();
        } catch (Exception e) {
            f19647.mo13718("Error in prepare pass init: {}", this, e);
        }
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    public final String getName() {
        this.f19648.m41522();
        throw null;
    }
}
