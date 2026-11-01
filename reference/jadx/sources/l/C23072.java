package l;

/* JADX INFO: renamed from: l.᩺ܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5JI */
/* JADX INFO: loaded from: classes2.dex */
public final class C23072 extends C9770 {

    /* JADX INFO: renamed from: ۧ᩵, reason: not valid java name and contains not printable characters */
    public C1198 f74958;

    public C23072(C17063 c17063) {
        super(c17063);
        this.f74958 = null;
    }

    /* JADX INFO: renamed from: ᩳۨ, reason: not valid java name and contains not printable characters */
    public final C22085 m51049() {
        return this.f74958;
    }

    @Override // l.AbstractC19886
    /* JADX INFO: renamed from: ۙ */
    public final void mo36669(C22085 c22085, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8256.m39848());
        sb.append("[");
        sb.append(c22085.f71538);
        sb.append(",");
        String strM5594 = C1679.m5594(C12441.m30911(c22085.f71540, "]", sb), " ", mo30315(c22085, strArr));
        System.err.println(strM5594);
        if (this.f74958 == null) {
            this.f74958 = new C1198(strM5594, c22085);
        }
    }
}
