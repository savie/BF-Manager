package l;

/* JADX INFO: renamed from: l.᩹۠᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes.dex */
public class C23431 extends C13690 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0310 f75857;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23431(C0310 c0310, InterfaceC1013 interfaceC1013) {
        super(interfaceC1013);
        this.f75857 = c0310;
    }

    @Override // l.C13690, l.InterfaceC1013
    /* JADX INFO: renamed from: ۙ */
    public boolean mo3911(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665, C1083 c1083) {
        InterfaceC1013 interfaceC1013 = this.f75857.f1698.f71222;
        InterfaceC1013 interfaceC1014 = this.f43432;
        return interfaceC1013.mo3911(interfaceC1014.mo2276().m8710(abstractC22664), interfaceC1014.mo2276().m8710(abstractC22665), c1083);
    }

    @Override // l.C13690, l.InterfaceC1013
    /* JADX INFO: renamed from: ۙ */
    public void mo3910(InterfaceC5075 interfaceC5075, C17007 c17007) {
        C19991 c19991 = this.f75857.f1704;
        C15515 c15515 = C19859.f63823;
        this.f43432.mo3910(interfaceC5075, c19991.m45975(new C15515("compiler", "incompatible.ret.type.in.lambda", c17007)));
    }
}
