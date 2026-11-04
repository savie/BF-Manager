package l;

/* JADX INFO: renamed from: l.۠ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1BJ4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8400 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21080 f27514;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6909 f27515;

    public C8400(C6909 c6909) {
        this.f27515 = c6909;
        C18842 c18842 = c6909.f22905;
        c18842.getClass();
        this.f27514 = new C21080(c18842);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22572(C14366 c14366) {
        this.f27514.m48139(c14366);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f27514.m48140()) {
            C6909.m19164(this.f27515);
        }
    }
}
