package l;

/* JADX INFO: renamed from: l.ۗۚۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y2SQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C3026 extends C14317 implements InterfaceC12179, InterfaceC10062 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C3067 f11332;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4935 f11333;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C3067 f11334;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C1428 f11335;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3026(C4935 c4935, InterfaceC12179 interfaceC12179) {
        super(c4935, interfaceC12179);
        this.f11333 = c4935;
    }

    @Override // l.InterfaceC12179
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo9024() {
        return ((InterfaceC12179) this.f46898).mo9024();
    }

    @Override // l.InterfaceC12179
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC20852 mo9023() {
        C3067 c3067 = this.f11332;
        return c3067 != null ? c3067 : ((InterfaceC12179) this.f46898).mo9023();
    }

    @Override // l.InterfaceC12179
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final InterfaceC15914 mo9026() {
        C1428 c1428 = this.f11335;
        if (c1428 != null) {
            return c1428;
        }
        InterfaceC15914 interfaceC15914Mo9026 = ((InterfaceC12179) this.f46898).mo9026();
        if (interfaceC15914Mo9026 == null) {
            return null;
        }
        return new C18425(this.f11333.f17266.m29872(), interfaceC15914Mo9026);
    }

    @Override // l.InterfaceC12179
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20852 mo9025() {
        C3067 c3067 = this.f11334;
        return c3067 != null ? c3067 : ((InterfaceC12179) this.f46898).mo9025();
    }

    @Override // l.InterfaceC10062
    /* JADX INFO: renamed from: ۙ */
    public final void mo1141(C8485 c8485) {
        InterfaceC15914 interfaceC15914Mo9026 = mo9026();
        if (interfaceC15914Mo9026 != null) {
            this.f11335 = c8485.f51666.m50097(interfaceC15914Mo9026.getType());
        }
        InterfaceC20852 interfaceC20852Mo9023 = mo9023();
        if (interfaceC20852Mo9023 != null) {
            this.f11332 = c8485.m22164(interfaceC20852Mo9023.getString());
        }
        InterfaceC20852 interfaceC20852Mo9025 = mo9025();
        if (interfaceC20852Mo9025 != null) {
            this.f11334 = c8485.m22164(interfaceC20852Mo9025.getString());
        }
    }
}
