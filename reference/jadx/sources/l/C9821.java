package l;

/* JADX INFO: renamed from: l.ۢ᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K5D4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9821 extends AbstractC7830 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f33568;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f33569;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f33570;

    public C9821(AbstractC7124 abstractC7124, String str, String str2, String str3) {
        super(EnumC9947.FIELD, abstractC7124);
        this.f33569 = str3;
        this.f33570 = str2;
        this.f33568 = str;
    }

    @Override // l.AbstractC7830, l.AbstractC7124
    public final AbstractC7124 clone() {
        AbstractC7124 abstractC7124 = this.f25764;
        abstractC7124.getClass();
        return new C9821(abstractC7124.clone(), this.f33568, this.f33570, this.f33569);
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7124 mo3325(C10527 c10527) {
        return new C9821(this.f25764.mo3325(c10527), this.f33568, this.f33570, this.f33569);
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ᩹ */
    public final String mo3326() {
        return this.f25764 + "." + this.f33570;
    }
}
