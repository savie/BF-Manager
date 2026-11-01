package l;

/* JADX INFO: renamed from: l.᩻۠۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes2.dex */
public final class C23570 extends AbstractC5930 implements InterfaceC2610 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public AbstractC23903 f76355;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC11242 f76356;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC5930 f76357;

    public C23570(AbstractC5930 abstractC5930, AbstractC11242 abstractC11242, AbstractC23903 abstractC23903) {
        this.f76357 = abstractC5930;
        this.f76356 = abstractC11242;
        this.f76355 = abstractC23903;
    }

    @Override // l.AbstractC8774
    /* JADX INFO: renamed from: ۙ */
    public final void mo1802(AbstractC19357 abstractC19357) {
        abstractC19357.mo1268(this);
    }

    @Override // l.InterfaceC17428
    /* JADX INFO: renamed from: ۙ */
    public final EnumC12490 mo1801() {
        return EnumC12490.MEMBER_SELECT;
    }

    @Override // l.InterfaceC2610
    public final AbstractC5930 getExpression() {
        return this.f76357;
    }

    @Override // l.AbstractC8774, l.InterfaceC17428
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1800(InterfaceC6139 interfaceC6139, Object obj) {
        return interfaceC6139.mo1919(this, obj);
    }

    @Override // l.InterfaceC2610
    /* JADX INFO: renamed from: ۘ */
    public final AbstractC11242 mo8084() {
        return this.f76356;
    }

    @Override // l.AbstractC8774
    /* JADX INFO: renamed from: ۨۙ */
    public final EnumC18651 mo1803() {
        return EnumC18651.f60473;
    }
}
