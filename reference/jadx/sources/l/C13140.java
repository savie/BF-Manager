package l;

/* JADX INFO: renamed from: l.۬۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 0ASK */
/* JADX INFO: loaded from: classes4.dex */
public final class C13140 extends AbstractC17373 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f43744;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f43745;

    @Override // l.AbstractC17373
    /* JADX INFO: renamed from: ۙ */
    public final int mo12146() {
        return 2;
    }

    public C13140(AbstractC2120 abstractC2120, int i, int i2) {
        super(abstractC2120);
        this.f43745 = i;
        this.f43744 = i2;
    }

    @Override // l.AbstractC17373
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo12147(int i, int i2) {
        return i >= this.f43745 && i <= this.f43744;
    }

    public final String toString() {
        StringBuilder sbAppendCodePoint = new StringBuilder("'").appendCodePoint(this.f43745);
        sbAppendCodePoint.append("'..'");
        StringBuilder sbAppendCodePoint2 = sbAppendCodePoint.appendCodePoint(this.f43744);
        sbAppendCodePoint2.append("'");
        return sbAppendCodePoint2.toString();
    }

    @Override // l.AbstractC17373
    /* JADX INFO: renamed from: ۨ */
    public final C0875 mo26136() {
        C0875 c0875 = new C0875(new int[0]);
        c0875.m3503(this.f43745, this.f43744);
        return c0875;
    }
}
