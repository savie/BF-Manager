package l;

/* JADX INFO: renamed from: l.ܽܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6UK */
/* JADX INFO: loaded from: classes4.dex */
public final class C16757 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C16072 f53640;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11113 f53641;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f53642;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C16072 f53643;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C22983 f53644;

    public C16757(C11113 c11113, C22983 c22983, C16072 c16072) {
        this.f53641 = c11113;
        this.f53644 = c22983;
        this.f53640 = c16072;
        this.f53643 = c16072;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39321() {
        synchronized (this.f53641) {
            if (this.f53642) {
                throw new IllegalStateException("Recovery generation already installed");
            }
            this.f53642 = true;
            this.f53643 = this.f53641.f37721;
            this.f53641.f37721 = this.f53640;
            this.f53641.f37723 = this.f53644;
            this.f53641.f37722 = false;
            this.f53641.getClass();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C16072 c16072 = this.f53643;
        this.f53643 = null;
        if (c16072 != null) {
            c16072.m38088();
        }
    }
}
