package l;

/* JADX INFO: renamed from: l.ۖܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2749 extends AbstractC22664 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC19728 f9105;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11172 f9106;

    @Override // l.AbstractC22664, l.InterfaceC9769
    public final String toString() {
        return "<ProxyType>";
    }

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m9098() {
        AbstractC19728 abstractC19728 = this.f9105;
        byte[] bArrMo42394 = abstractC19728.mo42394();
        int iMo42398 = abstractC19728.mo42398();
        int iMo42395 = abstractC19728.mo42395();
        C11172 c11172 = this.f9106;
        c11172.f35191 = bArrMo42394;
        c11172.f35207 = iMo42398;
        c11172.f35211 = iMo42398 + iMo42395;
        return c11172.m28134();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2749(C11172 c11172, int i) {
        super(c11172.f35200.f48321, C14458.f45498);
        this.f9106 = c11172;
        this.f9105 = c11172.f35205.m50345(i);
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final EnumC21172 mo9097() {
        return EnumC21172.NONE;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC22664 mo4934(C14458 c14458) {
        throw new UnsupportedOperationException();
    }
}
