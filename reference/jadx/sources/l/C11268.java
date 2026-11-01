package l;

/* JADX INFO: renamed from: l.ۧ᩸۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6X9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11268 implements AutoCloseable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C6328 f38083;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23968 f38084;

    public C11268(C23968 c23968, C6328 c6328) {
        this.f38084 = c23968;
        this.f38083 = c6328;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C23968 c23968 = this.f38084;
        c23968.f77709.lock();
        try {
            if (this.f38083 != null) {
                c23968.f77708.remove(this.f38083);
                this.f38083 = null;
                c23968.f77710.signalAll();
            }
        } finally {
            c23968.f77709.unlock();
        }
    }
}
