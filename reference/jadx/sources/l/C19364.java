package l;

/* JADX INFO: renamed from: l.ᩳ᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: U582 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19364 extends AbstractC8922 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f62553;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f62554;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f62555;

    public C19364(String str, String str2, String str3) {
        super(EnumC22260.STATIC_FIELD);
        this.f62554 = str3;
        this.f62553 = str2;
        this.f62555 = str;
    }

    @Override // l.AbstractC8922, l.AbstractC11071
    public final AbstractC11071 clone() {
        return new C19364(this.f62555, this.f62553, this.f62554);
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11071 mo5237(C5194 c5194) {
        return new C19364(this.f62555, this.f62553, this.f62554);
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ܳ */
    public final String mo5238() {
        return C2211.m7539(this.f62555) + "." + this.f62553;
    }
}
