package l;

/* JADX INFO: renamed from: l.ۙ۫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4644 extends C13872 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6761 f16403;

    public C4644(C6761 c6761) {
        this.f16403 = c6761;
    }

    @Override // l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1864(C3107 c3107, Object obj) {
        return this.f16403.f22822.m45530((C3107) null, (C4603) obj, c3107.f11715, C21059.f68587);
    }

    @Override // l.InterfaceC6139
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1919(C23570 c23570, Object obj) {
        C4603 c4603 = (C4603) obj;
        AbstractC5930 abstractC5930 = c23570.f76357;
        AbstractC23903 abstractC23903 = (AbstractC23903) (abstractC5930 == null ? null : abstractC5930.mo1800(this, c4603));
        EnumC10477 enumC10477 = abstractC23903.f77452;
        if (enumC10477 == EnumC10477.f35866 || enumC10477 == EnumC10477.f35872 || enumC10477 == EnumC10477.f35874) {
            return abstractC23903;
        }
        AbstractC11242 abstractC11242 = c23570.f76356;
        EnumC10477 enumC10478 = EnumC10477.f35867;
        C6761 c6761 = this.f16403;
        if (enumC10477 == enumC10478) {
            c4603.f16295.f34721 = (C7675) abstractC23903;
            return c6761.f22822.m45544((C23570) null, c4603, (AbstractC0618) abstractC23903, abstractC11242, C21059.f68587);
        }
        c4603.f16301.f30086 = (C22492) abstractC23903;
        return c6761.f22822.m45521(c4603, abstractC23903.f77449, abstractC11242, (AbstractC0618) abstractC23903);
    }
}
