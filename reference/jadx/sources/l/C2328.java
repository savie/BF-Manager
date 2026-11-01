package l;

/* JADX INFO: renamed from: l.ۖۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes2.dex */
public class C2328 extends AbstractC19886 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C17063 f8256;

    @Override // l.AbstractC19886
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo7068(InterfaceC14242 interfaceC14242) {
        return ((InterfaceC3739) interfaceC14242).mo10949(1);
    }

    @Override // l.AbstractC19886
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo7067(int i, InterfaceC14242 interfaceC14242) {
        C12125 c12125 = new C12125(i, i == -1 ? "<missing EOF>" : C22697.m50267(new StringBuilder("<missing "), C9770.f33011[i], ">"));
        InterfaceC3739 interfaceC3739 = (InterfaceC3739) interfaceC14242;
        InterfaceC12913 interfaceC12913Mo10949 = interfaceC3739.mo10949(1);
        if (interfaceC12913Mo10949.getType() == -1) {
            interfaceC12913Mo10949 = interfaceC3739.mo10949(-1);
        }
        c12125.f40593 = interfaceC12913Mo10949.getLine();
        c12125.f40597 = interfaceC12913Mo10949.mo30176();
        c12125.f40594 = 0;
        c12125.f40595 = interfaceC12913Mo10949.getInputStream();
        return c12125;
    }
}
