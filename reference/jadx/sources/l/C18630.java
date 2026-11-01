package l;

/* JADX INFO: renamed from: l.ᩴ۠۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes5.dex */
public final class C18630 extends AbstractC14728 implements InterfaceC4251 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC13425 f60397 = EnumC13425.STATEMENT;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC13425 f60398 = EnumC13425.RULE;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f60399;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C21825 f60400;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC8774 f60401;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final EnumC13425 f60402;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C21825 f60403;

    public C18630(EnumC13425 enumC13425, C21825 c21825, C21825 c21826, AbstractC8774 abstractC8774) {
        C6171.m17171(c21825);
        C6171.m17176(c21825.isEmpty() || c21825.f70876 != null);
        this.f60402 = enumC13425;
        this.f60400 = c21825;
        this.f60403 = c21826;
        this.f60401 = abstractC8774;
    }

    @Override // l.AbstractC8774
    /* JADX INFO: renamed from: ۙ */
    public final void mo1802(AbstractC19357 abstractC19357) {
        abstractC19357.mo3952(this);
    }

    @Override // l.InterfaceC17428
    /* JADX INFO: renamed from: ۙ */
    public final EnumC12490 mo1801() {
        return EnumC12490.CASE;
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m43083() {
        return (C21825) C9030.stream(this.f60400).filter(new C11757(1)).map(new C18663(10)).collect(C21825.m48587());
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C21825 m43084() {
        if (this.f60402 == EnumC13425.STATEMENT) {
            return this.f60403;
        }
        return null;
    }

    @Override // l.AbstractC8774, l.InterfaceC17428
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1800(InterfaceC6139 interfaceC6139, Object obj) {
        return interfaceC6139.mo1904(this, obj);
    }

    @Override // l.AbstractC8774
    /* JADX INFO: renamed from: ۨۙ */
    public final EnumC18651 mo1803() {
        return EnumC18651.f60486;
    }
}
