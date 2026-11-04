package l;

/* JADX INFO: renamed from: l.ۖ᩶ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZIVU */
/* JADX INFO: loaded from: classes3.dex */
public final class C2902 implements InterfaceC8670 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20684 f9496;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC22294 f9497;

    @Override // l.InterfaceC8670
    /* JADX INFO: renamed from: ᩷ */
    public final /* bridge */ /* synthetic */ InterfaceC1213 mo5149() {
        return null;
    }

    public C2902(EnumC22294 enumC22294, C20684 c20684) {
        this.f9497 = enumC22294;
        this.f9496 = c20684;
    }

    @Override // l.InterfaceC8670
    public final EnumC22294 getType() {
        return this.f9497;
    }

    @Override // l.InterfaceC8670
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC13890 mo5148() {
        return this.f9496;
    }

    @Override // l.InterfaceC8670
    /* JADX INFO: renamed from: ۙ */
    public final void mo5147() {
        this.f9496.mo33834();
    }

    public final String toString() {
        return this.f9497 + ": " + this.f9496;
    }
}
