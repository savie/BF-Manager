package l;

/* JADX INFO: renamed from: l.ۗ֡۬, reason: contains not printable characters */
/* JADX INFO: compiled from: V743 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2884 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f10869;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f10870;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C4771 f10871;

    public C2884(C4771 c4771, int i) {
        this.f10871 = c4771;
        this.f10869 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8675(C2884 c2884, int i) {
        int i2;
        if (c2884.f10870 || i < 0 || i > (i2 = c2884.f10869)) {
            throw new IllegalStateException("Preview memory reservation is invalid");
        }
        c2884.f10869 = i2 - i;
        c2884.f10871.f16790 -= i;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f10870) {
            return;
        }
        this.f10870 = true;
        C4771.m13238(this.f10871, this);
    }
}
