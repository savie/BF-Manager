package l;

/* JADX INFO: renamed from: l.᩹۠۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes2.dex */
public final class C22158 extends AbstractC5930 implements InterfaceC9420 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC5930 f72476;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC5930 f72477;

    public C22158(AbstractC5930 abstractC5930, AbstractC5930 abstractC5931) {
        this.f72477 = abstractC5930;
        this.f72476 = abstractC5931;
    }

    @Override // l.AbstractC8774
    /* JADX INFO: renamed from: ۙ */
    public final void mo1802(AbstractC19357 abstractC19357) {
        abstractC19357.mo3957(this);
    }

    @Override // l.InterfaceC17428
    /* JADX INFO: renamed from: ۙ */
    public final EnumC12490 mo1801() {
        return EnumC12490.ARRAY_ACCESS;
    }

    @Override // l.InterfaceC9420
    public final AbstractC5930 getExpression() {
        return this.f72477;
    }

    @Override // l.InterfaceC9420
    public final AbstractC5930 getIndex() {
        return this.f72476;
    }

    @Override // l.AbstractC8774, l.InterfaceC17428
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1800(InterfaceC6139 interfaceC6139, Object obj) {
        return interfaceC6139.mo1913(this, obj);
    }

    @Override // l.AbstractC8774
    /* JADX INFO: renamed from: ۨۙ */
    public final EnumC18651 mo1803() {
        return EnumC18651.f60540;
    }
}
