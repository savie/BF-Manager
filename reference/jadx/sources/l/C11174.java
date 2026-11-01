package l;

/* JADX INFO: renamed from: l.ۧᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6RY */
/* JADX INFO: loaded from: classes3.dex */
public final class C11174 implements AutoCloseable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C2063 f37854;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C23874 f37855;

    public C11174(C23874 c23874, C2063 c2063) {
        this.f37855 = c23874;
        this.f37854 = c2063;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f37854 = null;
        this.f37855.close();
    }
}
