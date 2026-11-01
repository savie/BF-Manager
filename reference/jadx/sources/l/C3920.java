package l;

/* JADX INFO: renamed from: l.ۘۨ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3920 implements InterfaceC12389 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20855 f14618;

    public /* synthetic */ C3920(C20855 c20855) {
        this.f14618 = c20855;
    }

    @Override // l.InterfaceC12389
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11368(InterfaceC12783 interfaceC12783, InterfaceC3609 interfaceC3609) {
        C20855 c20855 = this.f14618;
        String str = c20855.f67770;
        if (interfaceC3609.mo10693() != c20855.f67759) {
            return;
        }
        if (c20855.f67763 == null) {
            InterfaceC17721 interfaceC17721Mo10692 = interfaceC3609.mo10692();
            InterfaceC19133 type = interfaceC3609.getType();
            int i = c20855.f67759;
            interfaceC17721Mo10692.getClass();
            int iMo19106 = interfaceC17721Mo10692.mo19106();
            c20855.f67763 = new C17327(type.getTypeName(), i, iMo19106, type.mo26942(), interfaceC3609.mo10691(), interfaceC3609.mo7645());
        }
        String strM47741 = C21291.m47741(interfaceC12783);
        c20855.f67767.add(strM47741);
        if ("*".equals(str) || str.equals(strM47741)) {
            c20855.f67760.add(new C8861(interfaceC12783, interfaceC3609));
        }
    }
}
