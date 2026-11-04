package l;

/* JADX INFO: renamed from: l.۬ۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: V6MU */
/* JADX INFO: loaded from: classes4.dex */
public final class C13802 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C15010 f43772;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C9044 f43773;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f43774 = true;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C8299 f43775;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Throwable f43776;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C9153 f43777;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f43778;

    @Override // java.lang.AutoCloseable
    public final void close() {
        C8299 c8299 = this.f43775;
        if (c8299 != null) {
            c8299.close();
        }
        this.f43775 = null;
        C15010 c15010 = this.f43772;
        if (c15010 != null) {
            c15010.m36154(this.f43777);
        } else {
            C9153 c9153 = this.f43777;
            if (c9153 != null) {
                c9153.close();
            }
        }
        this.f43772 = null;
        this.f43777 = null;
    }
}
