package l;

/* JADX INFO: renamed from: l.ۤᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: O6S3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11055 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C10046 f34879;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f34881;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C20006 f34882;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C22990 f34884;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f34883 = -1;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f34880 = -1;

    public C11055(C20006 c20006, C10046 c10046, C22990 c22990) {
        this.f34882 = c20006;
        this.f34879 = c10046;
        this.f34884 = c22990;
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final C10046 m27948() {
        C10046 c10046;
        synchronized (this.f34882) {
            if (this.f34881 || this.f34882.f64286 != this || this.f34882.f64283 || this.f34882.f64282 != this.f34884) {
                throw new IllegalStateException("Recovery candidate has not been durably published");
            }
            this.f34881 = true;
            this.f34882.f64286 = null;
            c10046 = this.f34879;
        }
        return c10046;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f34882) {
            if (this.f34881) {
                return;
            }
            boolean z = true;
            this.f34881 = true;
            this.f34882.f64286 = null;
            if (this.f34882.f64283 || (this.f34882.f64282 != null && this.f34882.f64282.f74635.equals(this.f34884.f74635))) {
                z = false;
            }
            if (z) {
                C20006 c20006 = this.f34882;
                C22990 c22990 = this.f34884;
                C10046 c10046 = this.f34879;
                c10046.m25977().m52931((InterfaceC2017) new C22244(c20006, c22990, c10046));
            }
            this.f34879.close();
        }
    }
}
