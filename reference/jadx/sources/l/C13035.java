package l;

/* JADX INFO: renamed from: l.۫ۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: V743 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13035 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f41719;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f41720;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C5578 f41721;

    public C13035(C5578 c5578, int i) {
        this.f41721 = c5578;
        this.f41720 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32457(C13035 c13035, int i) {
        int i2;
        if (c13035.f41719 || i < 0 || i > (i2 = c13035.f41720)) {
            throw new IllegalStateException("Preview memory reservation is invalid");
        }
        c13035.f41720 = i2 - i;
        c13035.f41721.f19386 -= i;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f41719) {
            return;
        }
        this.f41719 = true;
        C5578.m16541(this.f41721, this);
    }
}
