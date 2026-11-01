package l;

/* JADX INFO: renamed from: l.۠ܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56UC */
/* JADX INFO: loaded from: classes3.dex */
public final class C8311 implements AutoCloseable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C10428 f28836;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C18894 f28837;

    public C8311(C10428 c10428, C18894 c18894) {
        this.f28836 = c10428;
        this.f28837 = c18894;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13625 m21738() {
        C18894 c18894 = this.f28837;
        if (c18894 == null) {
            throw new IllegalStateException("Page lease is closed");
        }
        return c18894.f61177;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C16072 c16072;
        synchronized (this.f28836) {
            C18894 c18894 = this.f28837;
            c16072 = null;
            if (c18894 != null) {
                c18894.f61176--;
                C16072 c16073 = c18894.f61174.f25159;
                this.f28837 = null;
                this.f28836.notifyAll();
                c16072 = c16073;
            }
        }
        if (c16072 != null) {
            c16072.m38088();
        }
    }
}
