package l;

/* JADX INFO: renamed from: l.۠ܰ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8212 extends AbstractC18795 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C4603 f28593;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final boolean f28594;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20145 f28595;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8212(C20145 c20145, C4603 c4603, boolean z, AbstractC23903 abstractC23903) {
        super(c20145, EnumC10477.f35874, abstractC23903, "invisible class error");
        this.f28595 = c20145;
        this.f28593 = c4603;
        this.f28594 = z;
        this.f77453 = abstractC23903.f77453;
    }

    @Override // l.AbstractC8856
    /* JADX INFO: renamed from: ۙ */
    public final C11948 mo8964(EnumC17198 enumC17198, InterfaceC12260 interfaceC12260, AbstractC23903 abstractC23903, AbstractC16579 abstractC16579, AbstractC11242 abstractC11242, C21825 c21825, C21825 c21826) {
        EnumC10477 enumC10477;
        C20145 c20145 = this.f28595;
        C20414 c20414 = c20145.f65441;
        if (this.f28594) {
            return null;
        }
        AbstractC23903 abstractC23904 = this.f60927;
        EnumC10477 enumC10478 = abstractC23904.f77452;
        EnumC10477 enumC10479 = EnumC10477.f35867;
        C4603 c4603 = this.f28593;
        if (enumC10478 == enumC10479) {
            return c20145.f65420.m51912(enumC17198, c20414.m48186(), interfaceC12260, "package.not.visible", abstractC23904, c20145.m45524(c4603, abstractC23904.m52724()));
        }
        C11948 c11948M45524 = c20145.m45524(c4603, abstractC23904.m52724());
        if (interfaceC12260.mo9276() != null) {
            AbstractC8774 abstractC8774Mo9276 = interfaceC12260.mo9276();
            AbstractC23903 abstractC23905 = abstractC23904;
            while (true) {
                EnumC10477 enumC104710 = abstractC23905.f77452;
                enumC10477 = EnumC10477.f35867;
                if (enumC104710 == enumC10477 || !abstractC8774Mo9276.m22847(EnumC18651.f60473)) {
                    break;
                }
                abstractC23905 = abstractC23905.f77448;
                abstractC8774Mo9276 = ((C23570) abstractC8774Mo9276).f76357;
            }
            if (abstractC23905.f77452 == enumC10477) {
                abstractC8774Mo9276.getClass();
                return c20145.f65420.m51912(enumC17198, c20414.m48186(), abstractC8774Mo9276, "package.not.visible", abstractC23905, c11948M45524);
            }
        }
        return c20145.f65420.m51912(enumC17198, c20414.m48186(), interfaceC12260, "not.def.access.package.cant.access", abstractC23904, abstractC23904.m52724(), c11948M45524);
    }
}
