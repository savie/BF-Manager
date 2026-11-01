package l;

/* JADX INFO: renamed from: l.֨᩵۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes3.dex */
public final class C1321 extends AbstractC5930 implements InterfaceC4727 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public EnumC6617 f5611;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Object f5612;

    @Override // l.AbstractC5930
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC5930 mo4719(AbstractC16579 abstractC16579) {
        this.f30190 = abstractC16579;
        return this;
    }

    @Override // l.AbstractC8774
    /* JADX INFO: renamed from: ۙ */
    public final void mo1802(AbstractC19357 abstractC19357) {
        abstractC19357.mo3917(this);
    }

    @Override // l.InterfaceC17428
    /* JADX INFO: renamed from: ۙ */
    public final EnumC12490 mo1801() {
        return this.f5611.m17949();
    }

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final Object m4718() {
        Object obj = this.f5612;
        int i = C11575.f38927[this.f5611.ordinal()];
        if (i == 1) {
            return Boolean.valueOf(((Integer) obj).intValue() != 0);
        }
        if (i != 2) {
            return obj;
        }
        int iIntValue = ((Integer) obj).intValue();
        char c = (char) iIntValue;
        if (c != iIntValue) {
            throw new AssertionError("bad value for char literal");
        }
        return Character.valueOf(c);
    }

    @Override // l.AbstractC8774, l.InterfaceC17428
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1800(InterfaceC6139 interfaceC6139, Object obj) {
        return interfaceC6139.mo1859(this, obj);
    }

    @Override // l.AbstractC8774
    /* JADX INFO: renamed from: ۨۙ */
    public final EnumC18651 mo1803() {
        return EnumC18651.f60472;
    }
}
