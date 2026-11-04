package l;

/* JADX INFO: renamed from: l.᩶᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 157Y */
/* JADX INFO: loaded from: classes.dex */
public final class C21602 extends AbstractC5106 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f69012;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f69013;

    public C21602(String str, int i, AbstractC11071[] abstractC11071Arr) {
        super(EnumC22260.NEW_MUTI_ARRAY, abstractC11071Arr);
        this.f69013 = str;
        this.f69012 = i;
    }

    @Override // l.AbstractC5106, l.AbstractC11071
    public final AbstractC11071 clone() {
        return new C21602(this.f69013, this.f69012, m15447());
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11071 mo5237(C5194 c5194) {
        return new C21602(this.f69013, this.f69012, m15449(c5194));
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ܳ */
    public final String mo5238() {
        StringBuilder sb = new StringBuilder("new ");
        sb.append(C2211.m7539(this.f69013));
        for (AbstractC11071 abstractC11071 : this.f17809) {
            sb.append('[');
            sb.append(abstractC11071);
            sb.append(']');
        }
        for (int length = this.f17809.length; length < this.f69012; length++) {
            sb.append("[]");
        }
        return sb.toString();
    }
}
