package l;

/* JADX INFO: renamed from: l.ܶۡ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes5.dex */
public final class C15124 extends AbstractC5930 implements InterfaceC11972 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC8774 f49398;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C8068 f49399;

    @Override // l.AbstractC8774
    /* JADX INFO: renamed from: ۙ */
    public final void mo1802(AbstractC19357 abstractC19357) {
        abstractC19357.mo3946(this);
    }

    @Override // l.InterfaceC17428
    /* JADX INFO: renamed from: ۙ */
    public final EnumC12490 mo1801() {
        int i = C11575.f38926[this.f49399.f28284.ordinal()];
        if (i == 1) {
            return EnumC12490.UNBOUNDED_WILDCARD;
        }
        if (i == 2) {
            return EnumC12490.EXTENDS_WILDCARD;
        }
        if (i == 3) {
            return EnumC12490.SUPER_WILDCARD;
        }
        throw new AssertionError("Unknown wildcard bound " + this.f49399);
    }

    @Override // l.AbstractC8774, l.InterfaceC17428
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1800(InterfaceC6139 interfaceC6139, Object obj) {
        return interfaceC6139.mo1895(this, obj);
    }

    @Override // l.AbstractC8774
    /* JADX INFO: renamed from: ۨۙ */
    public final EnumC18651 mo1803() {
        return EnumC18651.f60537;
    }
}
