package l;

/* JADX INFO: renamed from: l.ۢۙ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9355 extends AbstractC18795 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C16100 f31710;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20145 f31711;

    /* JADX WARN: Illegal instructions before constructor call */
    public C9355(C20145 c20145, C16100 c16100) {
        this.f31711 = c20145;
        EnumC10477 enumC10477 = EnumC10477.f35874;
        AbstractC23903 abstractC23903 = c16100.f15170;
        super(c20145, enumC10477, abstractC23903, "BadClassFileError");
        this.f77453 = abstractC23903.f77453;
        this.f31710 = c16100;
    }

    @Override // l.AbstractC8856
    /* JADX INFO: renamed from: ۙ */
    public final C11948 mo8964(EnumC17198 enumC17198, InterfaceC12260 interfaceC12260, AbstractC23903 abstractC23903, AbstractC16579 abstractC16579, AbstractC11242 abstractC11242, C21825 c21825, C21825 c21826) {
        C20145 c20145 = this.f31711;
        C23549 c23549 = c20145.f65420;
        C22137 c22137M48186 = c20145.f65441.m48186();
        C16100 c16100 = this.f31710;
        C11948 c11948M51912 = c23549.m51912(enumC17198, c22137M48186, interfaceC12260, "cant.access", c16100.f15170, c16100.m11788());
        c11948M51912.m29766(EnumC0264.NON_DEFERRABLE);
        return c11948M51912;
    }
}
