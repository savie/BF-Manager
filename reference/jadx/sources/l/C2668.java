package l;

/* JADX INFO: renamed from: l.ۖܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5I2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2668 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f10337;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6222 f10338;

    public C2668(C14690 c14690, boolean z) {
        this.f10338 = c14690.matcher("");
        this.f10337 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m8214(String str) {
        C6222 c6222 = this.f10338;
        c6222.m17276reset((CharSequence) str);
        return this.f10337 ? c6222.matches() : c6222.find();
    }
}
