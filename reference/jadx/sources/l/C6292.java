package l;

/* JADX INFO: renamed from: l.ۛ᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Y50P */
/* JADX INFO: loaded from: classes3.dex */
public final class C6292 extends AbstractC19119 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f21297;

    public C6292() {
        super(EnumC9947.ARRAY, null, null);
    }

    public C6292(AbstractC7124 abstractC7124, AbstractC7124 abstractC7125, String str) {
        super(EnumC9947.ARRAY, abstractC7124, abstractC7125);
        this.f21297 = str;
    }

    @Override // l.AbstractC19119, l.AbstractC7124
    public final AbstractC7124 clone() {
        AbstractC7124 abstractC7124 = this.f61770;
        abstractC7124.getClass();
        AbstractC7124 abstractC7124Clone = abstractC7124.clone();
        AbstractC7124 abstractC7125 = this.f61771;
        abstractC7125.getClass();
        return new C6292(abstractC7124Clone, abstractC7125.clone(), this.f21297);
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7124 mo3325(C10527 c10527) {
        return new C6292(this.f61770.mo3325(c10527), this.f61771.mo3325(c10527), this.f21297);
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ᩹ */
    public final String mo3326() {
        return this.f61770 + "[" + this.f61771 + "]";
    }
}
