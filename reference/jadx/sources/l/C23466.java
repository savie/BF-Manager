package l;

/* JADX INFO: renamed from: l.᩻ۙ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23466 extends AbstractC18795 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C4603 f75987;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f75988;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20145 f75989;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23466(C20145 c20145, C4603 c4603, AbstractC16579 abstractC16579, AbstractC23903 abstractC23903) {
        super(c20145, EnumC10477.f35874, abstractC23903, "access error");
        this.f75989 = c20145;
        this.f75987 = c4603;
        this.f75988 = abstractC16579;
    }

    @Override // l.AbstractC8856
    /* JADX INFO: renamed from: ۙ */
    public final C11948 mo8964(EnumC17198 enumC17198, InterfaceC12260 interfaceC12260, AbstractC23903 abstractC23903, AbstractC16579 abstractC16579, AbstractC11242 abstractC11242, C21825 c21825, C21825 c21826) {
        AbstractC16579 abstractC165710;
        AbstractC23903 abstractC23904 = this.f60927;
        AbstractC11242 abstractC11243 = abstractC23904.f77453;
        C20145 c20145 = this.f75989;
        C23942 c23942 = c20145.f65436;
        C20414 c20414 = c20145.f65441;
        if (abstractC11243 == c23942.f77632 && abstractC23904.f77448 != abstractC16579.f53222) {
            return new C7444(c20145, EnumC10477.f35881).mo8964(enumC17198, interfaceC12260, abstractC23903, abstractC16579, abstractC11242, c21825, c21826);
        }
        long jMo20276 = abstractC23904.mo20276() & 1;
        C4603 c4603 = this.f75987;
        if (jMo20276 == 0 && (c4603 == null || (abstractC165710 = this.f75988) == null || c20145.m45554(c4603, abstractC165710, false))) {
            if ((abstractC23904.mo20276() & 6) != 0) {
                return c20145.f65420.m51912(enumC17198, c20414.m48186(), interfaceC12260, "report.access", abstractC23904, C8360.m21884(abstractC23904.mo20276() & 6), abstractC23904.m52708());
            }
            return c20145.f65420.m51912(enumC17198, c20414.m48186(), interfaceC12260, "not.def.public.cant.access", abstractC23904, abstractC23904.m52708());
        }
        if (abstractC23904.f77448.f77452 == EnumC10477.f35867) {
            return c20145.f65420.m51912(enumC17198, c20414.m48186(), interfaceC12260, "not.def.access.package.cant.access", abstractC23904, abstractC23904.m52708(), c20145.m45524(c4603, abstractC23904.m52724()));
        }
        if (abstractC23904.m52724() != c20145.f65410.f14227) {
            C19670 c19670 = c4603.f16295.f34730;
            C7675 c7675M52724 = abstractC23904.m52724();
            if (c19670 != c7675M52724.f25392 && !c19670.f63148.containsKey(c7675M52724.f25396)) {
                return c20145.f65420.m51912(enumC17198, c20414.m48186(), interfaceC12260, "not.def.access.class.intf.cant.access.reason", abstractC23904, abstractC23904.m52708(), abstractC23904.m52708().m52724(), c20145.m45524(c4603, abstractC23904.m52724()));
            }
        }
        return c20145.f65420.m51912(enumC17198, c20414.m48186(), interfaceC12260, "not.def.access.class.intf.cant.access", abstractC23904, abstractC23904.m52708());
    }
}
