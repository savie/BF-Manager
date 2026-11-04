package l;

/* JADX INFO: renamed from: l.ܽܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U1FZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17692 extends Exception {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f58152;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f58153;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f58154;

    /* JADX WARN: Illegal instructions before constructor call */
    public C17692(String str, C10254 c10254) {
        StringBuilder sbM10405 = C3188.m10405(str, ": ");
        sbM10405.append(c10254.getMessage());
        super(sbM10405.toString(), c10254);
        this.f58153 = str;
        this.f58154 = c10254.m26443().m24888();
        this.f58152 = c10254.m26443().m24885() - 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m41404() {
        return this.f58153;
    }
}
