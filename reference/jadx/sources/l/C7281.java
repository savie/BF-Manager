package l;

/* JADX INFO: renamed from: l.۟ۛۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes4.dex */
public class C7281 extends AbstractC3877 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C12926 f24203;

    @Override // l.C4748, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public AbstractC16579 mo1767(Object obj, AbstractC16579 abstractC16579) {
        return !abstractC16579.m39001(EnumC6617.DEFERRED) ? abstractC16579 : mo19417((C10104) abstractC16579, obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 mo19417(C10104 c10104, Object obj) {
        C12926 c12926 = this.f24203;
        int iOrdinal = c12926.f42954.ordinal();
        if (iOrdinal == 0) {
            return c10104.mo25715(c12926.f42951, c12926.f42957);
        }
        if (iOrdinal == 1) {
            AbstractC16579 abstractC16579 = c10104.f34494.f30190;
            return abstractC16579 == null ? AbstractC16579.f53219 : abstractC16579;
        }
        C6171.m17170();
        throw null;
    }

    public C7281(C5870 c5870, EnumC9729 enumC9729, AbstractC23903 abstractC23903, EnumC11678 enumC11678) {
        this.f24203 = new C12926(c5870, enumC9729, abstractC23903, enumC11678, c5870.f20044.f43861, c5870.f20035, c5870.f20040.f76946);
    }
}
