package l;

/* JADX INFO: renamed from: l.ۡ۬۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8897 extends AbstractC16579 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC11242 f30526;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0429 f30527;

    @Override // l.AbstractC16579, l.InterfaceC9105
    public final String toString() {
        return "<ProxyType>";
    }

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m23147() {
        AbstractC11242 abstractC11242 = this.f30526;
        byte[] bArrMo28214 = abstractC11242.mo28214();
        int iMo28207 = abstractC11242.mo28207();
        int iMo28217 = abstractC11242.mo28217();
        C0429 c0429 = this.f30527;
        c0429.f1973 = bArrMo28214;
        c0429.f1962 = iMo28207;
        c0429.f1978 = iMo28207 + iMo28217;
        return c0429.m2228();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8897(C0429 c0429, int i) {
        super(c0429.f1991.f14243, C3794.f13674);
        this.f30527 = c0429;
        this.f30526 = c0429.f1983.m1624(i);
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۙۙ */
    public final EnumC6617 mo1933() {
        return EnumC6617.NONE;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC16579 mo1929(C3794 c3794) {
        throw new UnsupportedOperationException();
    }
}
