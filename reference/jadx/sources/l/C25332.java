package l;

/* JADX INFO: renamed from: l.᩻᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y50P */
/* JADX INFO: loaded from: classes.dex */
public final class C25332 extends AbstractC14142 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f81801;

    public C25332() {
        super(EnumC22260.ARRAY, null, null);
    }

    public C25332(AbstractC11071 abstractC11071, AbstractC11071 abstractC11072, String str) {
        super(EnumC22260.ARRAY, abstractC11071, abstractC11072);
        this.f81801 = str;
    }

    @Override // l.AbstractC14142, l.AbstractC11071
    public final AbstractC11071 clone() {
        AbstractC11071 abstractC11071 = this.f44724;
        abstractC11071.getClass();
        AbstractC11071 abstractC11071Clone = abstractC11071.clone();
        AbstractC11071 abstractC11072 = this.f44725;
        abstractC11072.getClass();
        return new C25332(abstractC11071Clone, abstractC11072.clone(), this.f81801);
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11071 mo5237(C5194 c5194) {
        return new C25332(this.f44724.mo5237(c5194), this.f44725.mo5237(c5194), this.f81801);
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ܳ */
    public final String mo5238() {
        return this.f44724 + "[" + this.f44725 + "]";
    }
}
