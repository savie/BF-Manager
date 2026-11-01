package l;

/* JADX INFO: renamed from: l.᩹ܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6U1 */
/* JADX INFO: loaded from: classes.dex */
public final class C22422 implements AutoCloseable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C20990 f73180;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        C20990 c20990 = this.f73180;
        if (c20990 != null) {
            c20990.close();
            this.f73180 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C6276 m49746() {
        C6276 c6276;
        C20990 c20990 = this.f73180;
        if (c20990 == null) {
            throw new IllegalStateException("Session state is closed");
        }
        c6276 = c20990.f68349;
        return new C6276(c6276.m40840(), c6276.m17352());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m49747(C11018 c11018) {
        C20990 c20990 = this.f73180;
        if (c20990 == null) {
            throw new IllegalStateException("Session state is closed");
        }
        C18043.m42029(c20990, c11018);
    }

    public C22422(C20990 c20990) {
        this.f73180 = c20990;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20990 m49745(C22422 c22422) {
        C20990 c20990 = c22422.f73180;
        if (c20990 != null) {
            return c20990;
        }
        throw new IllegalStateException("Session state is closed");
    }
}
