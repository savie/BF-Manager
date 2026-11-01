package l;

/* JADX INFO: renamed from: l.ۡ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U1FZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8563 extends Exception {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f29591;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f29592;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f29593;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8563(String str, C4811 c4811) {
        StringBuilder sbM8976 = C3012.m8976(str, ": ");
        sbM8976.append(c4811.getMessage());
        super(sbM8976.toString(), c4811);
        this.f29591 = str;
        this.f29593 = c4811.m13367().m29578();
        this.f29592 = c4811.m13367().m29580() - 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m22321() {
        return this.f29591;
    }
}
