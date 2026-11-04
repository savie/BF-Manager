package l;

/* JADX INFO: renamed from: l.᩸ܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 06R7 */
/* JADX INFO: loaded from: classes.dex */
public final class C22968 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f74605;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15508 f74606;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C10287 f74607;

    public C22968(C15508 c15508, int i, int i2) {
        this.f74606 = c15508;
        this.f74607 = new C10287(c15508.f50482.m23622(), i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m51841() {
        this.f74606.m37171();
        if (this.f74605) {
            throw new IllegalStateException("Line cursor is closed");
        }
        return this.f74607.m26520();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f74605) {
            return;
        }
        this.f74605 = true;
        this.f74607.close();
    }
}
