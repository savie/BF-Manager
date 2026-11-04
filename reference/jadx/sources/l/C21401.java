package l;

/* JADX INFO: renamed from: l.᩶ܶۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0ASK */
/* JADX INFO: loaded from: classes5.dex */
public final class C21401 extends AbstractC5959 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f68170;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f68171;

    @Override // l.AbstractC5959
    /* JADX INFO: renamed from: ۙ */
    public final int mo2568() {
        return 2;
    }

    public C21401(AbstractC17715 abstractC17715, int i, int i2) {
        super(abstractC17715);
        this.f68170 = i;
        this.f68171 = i2;
    }

    @Override // l.AbstractC5959
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2569(int i, int i2) {
        return i >= this.f68170 && i <= this.f68171;
    }

    public final String toString() {
        StringBuilder sbAppendCodePoint = new StringBuilder("'").appendCodePoint(this.f68170);
        sbAppendCodePoint.append("'..'");
        StringBuilder sbAppendCodePoint2 = sbAppendCodePoint.appendCodePoint(this.f68171);
        sbAppendCodePoint2.append("'");
        return sbAppendCodePoint2.toString();
    }

    @Override // l.AbstractC5959
    /* JADX INFO: renamed from: ۤ */
    public final C14907 mo17341() {
        C14907 c14907 = new C14907(new int[0]);
        c14907.m35859(this.f68170, this.f68171);
        return c14907;
    }
}
