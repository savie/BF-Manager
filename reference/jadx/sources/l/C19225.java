package l;

/* JADX INFO: renamed from: l.ᩳܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6X9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19225 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C8038 f62176;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10274 f62177;

    public C19225(C10274 c10274, C8038 c8038) {
        this.f62177 = c10274;
        this.f62176 = c8038;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C10274 c10274 = this.f62177;
        c10274.f32808.lock();
        try {
            if (this.f62176 != null) {
                c10274.f32807.remove(this.f62176);
                this.f62176 = null;
                c10274.f32809.signalAll();
            }
        } finally {
            c10274.f32808.unlock();
        }
    }
}
