package l;

/* JADX INFO: renamed from: l.᩷۟ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C20729 extends AbstractC18154 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23800 f67453;

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1767(Object obj, AbstractC16579 abstractC16579) {
        return ((AbstractC23903) obj).f77449;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C0309 c0309, Object obj) {
        AbstractC23903 abstractC23903 = (AbstractC23903) obj;
        AbstractC23903 abstractC23904 = abstractC23903.f77448;
        if ((abstractC23903.mo20276() & 8) == 0 && abstractC23904.f77449.mo1942()) {
            C23800 c23800 = this.f67453;
            AbstractC16579 abstractC16579M52372 = c23800.m52372(abstractC23904, c0309);
            if (c0309.mo12731()) {
                abstractC16579M52372 = c23800.m52419(abstractC16579M52372);
            }
            if (abstractC16579M52372 != null) {
                C21825 c21825Mo1943 = abstractC23904.f77449.mo1943();
                C21825 c21825Mo1944 = abstractC16579M52372.mo1943();
                if (c21825Mo1943.m48595()) {
                    if (c21825Mo1944.isEmpty()) {
                        return c23800.m52402(abstractC23903.f77449);
                    }
                    return c23800.m52371(abstractC23903.f77449, c21825Mo1943, c21825Mo1944);
                }
            }
        }
        return abstractC23903.f77449;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4811(C0350 c0350, Object obj) {
        C23800 c23800 = this.f67453;
        return c23800.m52409((AbstractC23903) obj, c23800.m52415(c0350));
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4812(C5954 c5954, Object obj) {
        return c5954;
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1769(C22929 c22929, Object obj) {
        return this.f67453.m52409((AbstractC23903) obj, c22929.mo18112());
    }

    public C20729(C23800 c23800) {
        this.f67453 = c23800;
    }
}
