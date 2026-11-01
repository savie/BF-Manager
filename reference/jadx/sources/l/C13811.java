package l;

/* JADX INFO: renamed from: l.ܰ۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6TT */
/* JADX INFO: loaded from: classes3.dex */
public final class C13811 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f45590;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17367 f45591;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9017 f45592;

    public C13811(C17367 c17367, int i, C9017 c9017) {
        this.f45591 = c17367;
        this.f45590 = i;
        this.f45592 = c9017;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f45592.close();
    }
}
