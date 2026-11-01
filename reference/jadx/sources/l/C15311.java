package l;

/* JADX INFO: renamed from: l.ܶܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 956A */
/* JADX INFO: loaded from: classes5.dex */
public final class C15311 extends C17926 {

    /* JADX INFO: renamed from: ᩶ܶ, reason: not valid java name and contains not printable characters */
    public C1198 f49889;

    public C15311(C7974 c7974) {
        super(c7974);
        this.f49889 = null;
    }

    /* JADX INFO: renamed from: ۠ۨ, reason: not valid java name and contains not printable characters */
    public final C22085 m36670() {
        return this.f49889;
    }

    @Override // l.AbstractC19886
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo36669(C22085 c22085, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(m30313());
        sb.append("[");
        sb.append(c22085.f71538);
        sb.append(",");
        String strM5594 = C1679.m5594(C12441.m30911(c22085.f71540, "]", sb), " ", mo30315(c22085, strArr));
        System.err.println(strM5594);
        if (this.f49889 == null) {
            this.f49889 = new C1198(strM5594, c22085);
        }
    }
}
