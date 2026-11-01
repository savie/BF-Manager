package l;

/* JADX INFO: renamed from: l.ܺ֫۬, reason: contains not printable characters */
/* JADX INFO: compiled from: V6MU */
/* JADX INFO: loaded from: classes4.dex */
public final class C15627 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Throwable f50817;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f50818 = true;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C20937 f50819;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C20232 f50820;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C9919 f50821;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C20502 f50822;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f50823;

    @Override // java.lang.AutoCloseable
    public final void close() {
        C20232 c20232 = this.f50820;
        if (c20232 != null) {
            c20232.close();
        }
        this.f50820 = null;
        C9919 c9919 = this.f50821;
        if (c9919 != null) {
            c9919.m25119(this.f50822);
        } else {
            C20502 c20502 = this.f50822;
            if (c20502 != null) {
                c20502.close();
            }
        }
        this.f50821 = null;
        this.f50822 = null;
    }
}
