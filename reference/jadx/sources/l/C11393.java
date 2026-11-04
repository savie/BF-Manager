package l;

/* JADX INFO: renamed from: l.ۧۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11393 extends AbstractC2335 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22010 f35853;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C14769 f35854;

    /* JADX WARN: Illegal instructions before constructor call */
    public C11393(C22010 c22010, AbstractC11781 abstractC11781, AbstractC11781 abstractC11782) {
        C14769 c14769Of;
        C14769 c14769Of2;
        this.f35853 = c22010;
        EnumC13603 enumC13603 = EnumC13603.f43209;
        super(c22010, enumC13603, "ambiguity error");
        this.f35854 = C14769.m35543();
        if (abstractC11782.f38066 == enumC13603) {
            c14769Of = ((C11393) abstractC11782.mo10410()).f35854;
        } else {
            c14769Of = C14769.of((Object) abstractC11782);
        }
        if (abstractC11781.f38066 == enumC13603) {
            c14769Of2 = ((C11393) abstractC11781.mo10410()).f35854;
        } else {
            c14769Of2 = C14769.of((Object) abstractC11781);
        }
        c14769Of.getClass();
        this.f35854 = c14769Of2.m35549(c14769Of);
    }

    @Override // l.AbstractC2335
    /* JADX INFO: renamed from: ۙ */
    public final C17007 mo3799(EnumC22229 enumC22229, InterfaceC5075 interfaceC5075, AbstractC11781 abstractC11781, AbstractC22664 abstractC22664, AbstractC19728 abstractC19728, C14769 c14769, C14769 c147610) {
        C14769 c14769M35554 = this.f35854.m35554();
        AbstractC11781 abstractC11782 = (AbstractC11781) c14769M35554.f48335;
        AbstractC11781 abstractC11783 = (AbstractC11781) c14769M35554.f48336.f48335;
        AbstractC19728 abstractC19729 = abstractC11782.f38072;
        C22010 c22010 = this.f35853;
        if (abstractC19729 == c22010.f71026.f49865) {
            abstractC19729 = abstractC11782.f38069.f38072;
        }
        return c22010.f71000.m45978(enumC22229, c22010.f71001.m34514(), interfaceC5075, "ref.ambiguous", abstractC19729, C10925.m27726(abstractC11782), abstractC11782, abstractC11782.m29594(abstractC22664, c22010.f71021), C10925.m27726(abstractC11783), abstractC11783, abstractC11783.m29594(abstractC22664, c22010.f71021));
    }

    @Override // l.AbstractC2335
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11781 mo7872(AbstractC19728 abstractC19728, AbstractC22970 abstractC22970) {
        AbstractC11781 abstractC11781 = (AbstractC11781) this.f35854.last();
        if (abstractC11781.f38066 != EnumC13603.f43213) {
            return abstractC11781;
        }
        C24705 c24705 = this.f35853.f71021;
        AbstractC22664 abstractC22664 = abstractC11781.f38067;
        c24705.getClass();
        return C24705.m55061(abstractC19728, abstractC22970, abstractC22664).f73596;
    }
}
