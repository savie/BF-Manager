package l;

/* JADX INFO: renamed from: l.ۜۢۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6GG */
/* JADX INFO: loaded from: classes3.dex */
public final class C7048 extends AbstractC21703 {

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC12006[] f23251 = {EnumC12006.ARRAY};

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 f23252;

    public C7048(AbstractC1566 abstractC1566) {
        this.f23252 = abstractC1566;
        this.f5441 = abstractC1566.f5441;
    }

    @Override // l.AbstractC1566
    /* JADX INFO: renamed from: ܳ */
    public final AbstractC1566 mo5557() {
        return this.f23252;
    }

    @Override // l.AbstractC1566
    /* JADX INFO: renamed from: ܶ */
    public final EnumC12006 mo5558() {
        return EnumC12006.ARRAY;
    }

    @Override // l.AbstractC21703, l.AbstractC1566
    /* JADX INFO: renamed from: ᩶ */
    public final boolean mo5564() {
        return this.f23252.mo5564();
    }

    @Override // l.AbstractC21703, l.AbstractC1566
    /* JADX INFO: renamed from: ۟ */
    public final AbstractC1566 mo5551() {
        return new C7048(this.f23252.mo5551());
    }

    @Override // l.AbstractC21703, l.AbstractC1566
    /* JADX INFO: renamed from: ܽ */
    public final EnumC12006[] mo5560() {
        return f23251;
    }

    @Override // l.AbstractC1566
    /* JADX INFO: renamed from: ᩴ */
    public final int mo5562() {
        return this.f23252.mo5562() + 1;
    }

    @Override // l.AbstractC1566
    /* JADX INFO: renamed from: ۫ */
    public final AbstractC1566 mo5555() {
        return this.f23252.mo5555();
    }

    @Override // l.AbstractC1566
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo5547(Object obj) {
        return this.f23252.equals(((C7048) obj).f23252);
    }

    @Override // l.AbstractC1566
    public final String toString() {
        return this.f23252 + "[]";
    }
}
