package l;

/* JADX INFO: renamed from: l.᩺ܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: G6SF */
/* JADX INFO: loaded from: classes.dex */
public final class C24394 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C4256 f79137;

    public C24394(C4256 c4256) {
        this.f79137 = c4256;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C4256 c4256;
        synchronized (this) {
            c4256 = this.f79137;
            this.f79137 = null;
        }
        if (c4256 != null) {
            C4256.m13585(c4256, (Throwable) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54531(Throwable th) {
        C4256 c4256;
        synchronized (this) {
            c4256 = this.f79137;
            this.f79137 = null;
        }
        if (c4256 != null) {
            C4256.m13585(c4256, th);
        }
    }
}
