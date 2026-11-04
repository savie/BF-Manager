package l;

/* JADX INFO: renamed from: l.۟۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 26UX */
/* JADX INFO: loaded from: classes3.dex */
public final class C7745 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C12547 f25501;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C7305 f25502;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C12219 f25503;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f25504;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C21170 f25505;

    public C7745(C7305 c7305, C12547 c12547, C12219 c12219, C21170 c21170, long j) {
        this.f25502 = c7305;
        c12547.m31223();
        this.f25501 = c12547;
        this.f25504 = j;
        this.f25503 = c12219;
        this.f25505 = c21170;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C12547 c12547 = this.f25501;
        this.f25503 = null;
        this.f25505 = null;
        try {
            this.f25502.close();
        } finally {
            c12547.close();
        }
    }
}
