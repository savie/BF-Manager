package l;

/* JADX INFO: renamed from: l.ܺۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: I6U1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16759 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C7745 f54105;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        C7745 c7745 = this.f54105;
        if (c7745 != null) {
            c7745.close();
            this.f54105 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C7305 m39571() {
        C7305 c7305;
        C7745 c7745 = this.f54105;
        if (c7745 == null) {
            throw new IllegalStateException("Session state is closed");
        }
        c7305 = c7745.f25502;
        return new C7305(c7305.m23622(), c7305.m19989());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m39572(C6178 c6178) {
        C7745 c7745 = this.f54105;
        if (c7745 == null) {
            throw new IllegalStateException("Session state is closed");
        }
        C6582.m18509(c7745, c6178);
    }

    public C16759(C7745 c7745) {
        this.f54105 = c7745;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7745 m39570(C16759 c16759) {
        C7745 c7745 = c16759.f54105;
        if (c7745 != null) {
            return c7745;
        }
        throw new IllegalStateException("Session state is closed");
    }
}
