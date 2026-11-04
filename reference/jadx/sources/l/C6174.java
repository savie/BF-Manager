package l;

/* JADX INFO: renamed from: l.ۛۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6174 extends C3936 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22010 f21027;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public AbstractC11781 f21028;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6174(C22010 c22010, AbstractC11781 abstractC11781, C12775 c12775) {
        super(c22010, abstractC11781.f38066, "diamondError", c12775);
        this.f21027 = c22010;
        this.f21028 = abstractC11781;
    }

    @Override // l.C3936, l.AbstractC2335
    /* JADX INFO: renamed from: ۙ */
    public final C17007 mo3799(EnumC22229 enumC22229, InterfaceC5075 interfaceC5075, AbstractC11781 abstractC11781, AbstractC22664 abstractC22664, AbstractC19728 abstractC19728, C14769 c14769, C14769 c147610) {
        C17007 c17007M52133;
        AbstractC11781 abstractC11782 = this.f21028;
        C17007 c17007 = abstractC11782.f38066 == EnumC13603.f43202 ? (C17007) ((C3936) abstractC11782.mo10410()).mo12637().f19301 : null;
        C22010 c22010 = this.f21027;
        if (c17007 != null && c22010.f71024 && (c17007M52133 = C23218.m52133(c22010.f71000, interfaceC5075, c22010.f71001.m34514(), enumC22229, c17007)) != null) {
            return c17007M52133;
        }
        String str = c17007 == null ? "cant.apply.diamond" : "cant.apply.diamond.1";
        C19991 c19991 = c22010.f71000;
        C23393 c23393M34514 = c22010.f71001.m34514();
        AbstractC22970 abstractC22970 = abstractC22664.f73596;
        C15515 c15515 = C19859.f63823;
        return c19991.m45978(enumC22229, c23393M34514, interfaceC5075, str, new C15515("compiler", "diamond", abstractC22970), c17007);
    }
}
