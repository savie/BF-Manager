package l;

/* JADX INFO: renamed from: l.ܰ᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: U58Q */
/* JADX INFO: loaded from: classes5.dex */
public final class C14888 extends AbstractC8922 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f48648;

    public C14888(String str) {
        super(EnumC22260.NEW);
        this.f48648 = str;
    }

    @Override // l.AbstractC8922, l.AbstractC11071
    public final AbstractC11071 clone() {
        return new C14888(this.f48648);
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11071 mo5237(C5194 c5194) {
        return new C14888(this.f48648);
    }

    @Override // l.AbstractC11071
    /* JADX INFO: renamed from: ܳ */
    public final String mo5238() {
        return "NEW " + C2211.m7539(this.f48648);
    }
}
