package l;

/* JADX INFO: renamed from: l.۬ۙ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12882 extends AbstractC2566 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20145 f42843;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8378 f42844;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12882(C20145 c20145, AbstractC11242 abstractC11242, C0309 c0309, C21825 c21825, C21825 c21826, C8378 c8378) {
        super(c20145, abstractC11242, c0309, c21825, c21826);
        this.f42843 = c20145;
        this.f42844 = c8378;
    }

    @Override // l.AbstractC2566
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC23903 mo3562(C4603 c4603, EnumC11678 enumC11678) {
        AbstractC16579 abstractC16579 = this.f35427;
        enumC11678.m29178();
        return C20145.m45512(this.f42843, this.f42844, c4603, abstractC16579, this.f35428, this.f35429, enumC11678.m29179());
    }

    @Override // l.AbstractC2566, l.AbstractC10329
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC23903 mo8017(C4603 c4603, InterfaceC12260 interfaceC12260, AbstractC23903 abstractC23903, AbstractC23903 abstractC23904) {
        if (!abstractC23904.f77452.m26583()) {
            return abstractC23904;
        }
        EnumC10477 enumC10477 = abstractC23904.f77452;
        EnumC10477 enumC10478 = EnumC10477.f35869;
        if (enumC10477 != enumC10478 && enumC10477 != EnumC10477.f35873) {
            return super.mo8017(c4603, interfaceC12260, abstractC23903, abstractC23904);
        }
        if (enumC10477 == enumC10478) {
        }
        C20145 c20145 = this.f42843;
        C22323 c22323 = new C22323(c20145, abstractC23904, c20145.f65437);
        AbstractC16579 abstractC16579 = this.f35427;
        AbstractC11242 abstractC11242 = c20145.f65436.f77632;
        AbstractC23903 abstractC23903M45546 = c20145.m45546((AbstractC23903) c22323, interfaceC12260, (AbstractC23903) abstractC16579.f53222, abstractC16579, abstractC11242, true, this.f35428, this.f35429, (InterfaceC19501) c20145.f65434);
        ((C22990) c4603.f16299).f74727 = c20145.f65437.f20637;
        return abstractC23903M45546;
    }
}
