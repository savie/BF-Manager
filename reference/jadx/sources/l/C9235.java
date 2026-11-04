package l;

/* JADX INFO: renamed from: l.ۡ۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K6UK */
/* JADX INFO: loaded from: classes3.dex */
public final class C9235 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C10046 f30075;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13710 f30076;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f30077;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C10046 f30078;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C3598 f30079;

    public C9235(C13710 c13710, C3598 c3598, C10046 c10046) {
        this.f30076 = c13710;
        this.f30079 = c3598;
        this.f30078 = c10046;
        this.f30075 = c10046;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24428() {
        synchronized (this.f30076) {
            if (this.f30077) {
                throw new IllegalStateException("Recovery generation already installed");
            }
            this.f30077 = true;
            this.f30075 = this.f30076.f43514;
            this.f30076.f43514 = this.f30078;
            this.f30076.f43523 = this.f30079;
            this.f30076.f43526 = false;
            this.f30076.getClass();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C10046 c10046 = this.f30075;
        this.f30075 = null;
        if (c10046 != null) {
            c10046.m25975();
        }
    }
}
