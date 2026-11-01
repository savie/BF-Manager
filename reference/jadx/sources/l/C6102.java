package l;

/* JADX INFO: renamed from: l.ۛܰܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8BG9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6102 extends AbstractC1100 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22974 f20669;

    public C6102(C22974 c22974) {
        super("InnerClasses");
        try {
            if (c22974.m43640()) {
                throw new C8364("innerClasses.isMutable()", null);
            }
            this.f20669 = c22974;
        } catch (NullPointerException unused) {
            throw new NullPointerException("innerClasses == null");
        }
    }

    @Override // l.InterfaceC5771
    /* JADX INFO: renamed from: ۙ */
    public final int mo2281() {
        return (this.f20669.size() * 8) + 8;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22974 m16597() {
        return this.f20669;
    }
}
