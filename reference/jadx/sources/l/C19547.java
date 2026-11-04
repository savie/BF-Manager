package l;

/* JADX INFO: renamed from: l.ᩴۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: L6RY */
/* JADX INFO: loaded from: classes5.dex */
public final class C19547 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C23056 f63045;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12834 f63046;

    public C19547(C12834 c12834, C23056 c23056) {
        this.f63046 = c12834;
        this.f63045 = c23056;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f63045 = null;
        this.f63046.close();
    }
}
