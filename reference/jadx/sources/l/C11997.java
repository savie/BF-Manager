package l;

/* JADX INFO: renamed from: l.ۨ᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B9V */
/* JADX INFO: loaded from: classes4.dex */
public final class C11997 extends AbstractC7763 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C16251 f40212;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m29882(C16251 c16251) {
        return c16251.m38392() + ' ' + c16251.m38386().toString() + ": " + c16251.m38401().mo2376();
    }

    public C11997(C11312 c11312, C16251 c16251) {
        super(c11312);
        if (c16251 == null) {
            throw new NullPointerException("local == null");
        }
        this.f40212 = c16251;
    }

    @Override // l.AbstractC7763, l.AbstractC16438
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC16438 mo20431(int i) {
        return new C11997(m38701(), this.f40212.m38389(i));
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC16438 mo8569(C0727 c0727) {
        return new C11997(m38701(), this.f40212);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C16251 m29884() {
        return this.f40212;
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ۙ */
    public final String mo8568() {
        return this.f40212.toString();
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ܶ */
    public final String mo15537() {
        return "local-start " + m29882(this.f40212);
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16438 mo29883(C11976 c11976) {
        return new C11997(m38701(), c11976.mo15518(this.f40212));
    }
}
