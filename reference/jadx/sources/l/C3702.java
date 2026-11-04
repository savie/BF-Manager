package l;

/* JADX INFO: renamed from: l.ۗ᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5D4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3702 extends AbstractC7431 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f12711;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f12712;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f12713;

    public C3702(AbstractC11071 abstractC11071, String str, String str2, String str3) {
        super(EnumC22260.FIELD, abstractC11071);
        this.f12711 = str3;
        this.f12713 = str2;
        this.f12712 = str;
    }

    @Override // l.AbstractC7431, l.AbstractC11071
    public final AbstractC11071 clone() {
        AbstractC11071 abstractC11071 = this.f24464;
        abstractC11071.getClass();
        return new C3702(abstractC11071.clone(), this.f12712, this.f12713, this.f12711);
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11071 mo5237(C5194 c5194) {
        return new C3702(this.f24464.mo5237(c5194), this.f12712, this.f12713, this.f12711);
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ܳ */
    public final String mo5238() {
        return this.f24464 + "." + this.f12713;
    }
}
