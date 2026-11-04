package l;

/* JADX INFO: renamed from: l.۬ܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: H6V3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14016 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C10508 f44406;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final char[] f44407;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC1339 f44408;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f44409;

    public C14016(char[] cArr, AbstractC1339 abstractC1339, int i, C10508 c10508) {
        this.f44406 = c10508;
        this.f44407 = cArr;
        this.f44408 = abstractC1339;
        this.f44409 = i;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C10508 c10508 = this.f44406;
        if (c10508 != null) {
            c10508.close();
        }
    }
}
