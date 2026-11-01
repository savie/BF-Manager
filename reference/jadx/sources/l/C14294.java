package l;

/* JADX INFO: renamed from: l.ܳۙ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14294 extends AbstractC8856 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C21825 f46831;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20145 f46832;

    /* JADX WARN: Illegal instructions before constructor call */
    public C14294(C20145 c20145, AbstractC23903 abstractC23903, AbstractC23903 abstractC23904) {
        C21825 c21825Of;
        C21825 c21825Of2;
        this.f46832 = c20145;
        EnumC10477 enumC10477 = EnumC10477.f35883;
        super(c20145, enumC10477, "ambiguity error");
        this.f46831 = C21825.m48588();
        if (abstractC23904.f77452 == enumC10477) {
            c21825Of = ((C14294) abstractC23904.mo10880()).f46831;
        } else {
            c21825Of = C21825.of((Object) abstractC23904);
        }
        if (abstractC23903.f77452 == enumC10477) {
            c21825Of2 = ((C14294) abstractC23903.mo10880()).f46831;
        } else {
            c21825Of2 = C21825.of((Object) abstractC23903);
        }
        c21825Of.getClass();
        this.f46831 = c21825Of2.m48594(c21825Of);
    }

    @Override // l.AbstractC8856
    /* JADX INFO: renamed from: ۙ */
    public final C11948 mo8964(EnumC17198 enumC17198, InterfaceC12260 interfaceC12260, AbstractC23903 abstractC23903, AbstractC16579 abstractC16579, AbstractC11242 abstractC11242, C21825 c21825, C21825 c21826) {
        C21825 c21825M48589 = this.f46831.m48589();
        AbstractC23903 abstractC23904 = (AbstractC23903) c21825M48589.f70876;
        AbstractC23903 abstractC23905 = (AbstractC23903) c21825M48589.f70877.f70876;
        AbstractC11242 abstractC11243 = abstractC23904.f77453;
        C20145 c20145 = this.f46832;
        if (abstractC11243 == c20145.f65436.f77632) {
            abstractC11243 = abstractC23904.f77448.f77453;
        }
        return c20145.f65420.m51912(enumC17198, c20145.f65441.m48186(), interfaceC12260, "ref.ambiguous", abstractC11243, C16121.m38160(abstractC23904), abstractC23904, abstractC23904.m52714(abstractC16579, c20145.f65444), C16121.m38160(abstractC23905), abstractC23905, abstractC23905.m52714(abstractC16579, c20145.f65444));
    }

    @Override // l.AbstractC8856
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC23903 mo22991(AbstractC11242 abstractC11242, AbstractC0618 abstractC0618) {
        AbstractC23903 abstractC23903 = (AbstractC23903) this.f46831.last();
        if (abstractC23903.f77452 != EnumC10477.f35865) {
            return abstractC23903;
        }
        C23800 c23800 = this.f46832.f65444;
        AbstractC16579 abstractC16579 = abstractC23903.f77449;
        c23800.getClass();
        return C23800.m52331(abstractC11242, abstractC0618, abstractC16579).f53222;
    }
}
