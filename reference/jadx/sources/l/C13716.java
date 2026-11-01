package l;

/* JADX INFO: renamed from: l.ܰۡۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 843X */
/* JADX INFO: loaded from: classes4.dex */
public final class C13716 implements InterfaceC13320 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3836 f45226;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC13320 f45227;

    public C13716(C3836 c3836, InterfaceC13320 interfaceC13320) {
        this.f45226 = c3836;
        this.f45227 = interfaceC13320;
    }

    @Override // l.InterfaceC13320
    /* JADX INFO: renamed from: ۙ */
    public final void mo1179(AbstractC23903 abstractC23903) {
        try {
            this.f45227.mo1179(abstractC23903);
        } catch (C4146 unused) {
            abstractC23903.f77447 |= 513;
            ((C0309) abstractC23903.f77449).f1654 = this.f45226.f14275;
        }
    }

    @Override // l.InterfaceC13320
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo1180() {
        return this.f45227.mo1180();
    }
}
