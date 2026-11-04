package l;

/* JADX INFO: renamed from: l.۫ᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: N6TT */
/* JADX INFO: loaded from: classes4.dex */
public final class C13293 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C20348 f42446;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f42447;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C18251 f42448;

    public C13293(C20348 c20348, int i, C18251 c18251) {
        this.f42446 = c20348;
        this.f42447 = i;
        this.f42448 = c18251;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f42448.close();
    }
}
