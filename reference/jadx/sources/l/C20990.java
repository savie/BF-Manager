package l;

/* JADX INFO: renamed from: l.᩷ܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26UX */
/* JADX INFO: loaded from: classes4.dex */
public final class C20990 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f68348;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C6276 f68349;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C21695 f68350;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21571 f68351;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C8996 f68352;

    public C20990(C6276 c6276, C21571 c21571, C21695 c21695, C8996 c8996, long j) {
        this.f68349 = c6276;
        c21571.m48290();
        this.f68351 = c21571;
        this.f68348 = j;
        this.f68350 = c21695;
        this.f68352 = c8996;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C21571 c21571 = this.f68351;
        this.f68350 = null;
        this.f68352 = null;
        try {
            this.f68349.close();
        } finally {
            c21571.close();
        }
    }
}
