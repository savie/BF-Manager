package l;

/* JADX INFO: renamed from: l.۠ܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes3.dex */
public final class C8318 extends C10391 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f28843;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f28844;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f28845;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21017 f28846;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8318(C21017 c21017, InterfaceC12260 interfaceC12260, String str, AbstractC16579 abstractC16579, AbstractC16579 abstractC165710) {
        super(interfaceC12260);
        this.f28846 = c21017;
        this.f28843 = str;
        this.f28845 = abstractC16579;
        this.f28844 = abstractC165710;
    }

    @Override // l.C10391
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo21748(EnumC0597 enumC0597) {
        super.mo21748(enumC0597);
        int i = C21723.f70428[enumC0597.ordinal()];
        C21017 c21017 = this.f28846;
        if (i == 1) {
            InterfaceC12260 interfaceC12260M26292 = m26292();
            C11948 c11948M51914 = c21017.f68447.m51914(this.f28843, new Object[0]);
            C14065 c14065 = C9768.f32836;
            c21017.m47346(interfaceC12260M26292, new C14065("compiler", "prob.found.req", c11948M51914, this.f28845, this.f28844));
            return;
        }
        if (i == 2) {
            if (c21017.f68425 == null || c21017.f68425.m52702((AbstractC23903) c21017.f68430.f14273.f53222) == null || !c21017.m47248(c21017.f68425) || c21017.f68417.m52436((AbstractC16579) c21017.f68425.f77449.mo33523().last())) {
                return;
            }
            InterfaceC12260 interfaceC12260M26293 = m26292();
            AbstractC23903 abstractC23903 = (AbstractC23903) c21017.f68425.f58259.last();
            C14065 c14066 = C9768.f32836;
            c21017.m47333(interfaceC12260M26293, new C14065("compiler", "varargs.unsafe.use.varargs.param", abstractC23903));
            return;
        }
        throw new AssertionError("Unexpected lint: " + enumC0597);
    }
}
