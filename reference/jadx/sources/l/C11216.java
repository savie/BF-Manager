package l;

/* JADX INFO: renamed from: l.ۧ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6V3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11216 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC0631 f37945;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final char[] f37946;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2042 f37947;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f37948;

    public C11216(char[] cArr, AbstractC0631 abstractC0631, int i, C2042 c2042) {
        this.f37947 = c2042;
        this.f37946 = cArr;
        this.f37945 = abstractC0631;
        this.f37948 = i;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C2042 c2042 = this.f37947;
        if (c2042 != null) {
            c2042.close();
        }
    }
}
