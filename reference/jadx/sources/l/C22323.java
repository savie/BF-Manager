package l;

/* JADX INFO: renamed from: l.᩹ܰ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22323 extends C13151 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC23903 f72900;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20145 f72901;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22323(C20145 c20145, AbstractC23903 abstractC23903, C6095 c6095) {
        super(c20145, abstractC23903.f77452, "diamondError", c6095);
        this.f72901 = c20145;
        this.f72900 = abstractC23903;
    }

    @Override // l.C13151, l.AbstractC8856
    /* JADX INFO: renamed from: ۙ */
    public final C11948 mo8964(EnumC17198 enumC17198, InterfaceC12260 interfaceC12260, AbstractC23903 abstractC23903, AbstractC16579 abstractC16579, AbstractC11242 abstractC11242, C21825 c21825, C21825 c21826) {
        C11948 c11948M12769;
        AbstractC23903 abstractC23904 = this.f72900;
        C11948 c11948 = abstractC23904.f77452 == EnumC10477.f35869 ? (C11948) ((C13151) abstractC23904.mo10880()).mo11471().f7665 : null;
        C20145 c20145 = this.f72901;
        if (c11948 != null && c20145.f65442 && (c11948M12769 = C4621.m12769(c20145.f65420, interfaceC12260, c20145.f65441.m48186(), enumC17198, c11948)) != null) {
            return c11948M12769;
        }
        String str = c11948 == null ? "cant.apply.diamond" : "cant.apply.diamond.1";
        C23549 c23549 = c20145.f65420;
        C22137 c22137M48186 = c20145.f65441.m48186();
        AbstractC0618 abstractC0618 = abstractC16579.f53222;
        C14377 c14377 = C14707.f48054;
        return c23549.m51912(enumC17198, c22137M48186, interfaceC12260, str, new C14377("compiler", "diamond", abstractC0618), c11948);
    }
}
