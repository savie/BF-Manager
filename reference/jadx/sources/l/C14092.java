package l;

/* JADX INFO: renamed from: l.ܰ᩸ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8O0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14092 extends C22745 implements InterfaceC1390 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f46257;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f46258;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f46259;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f46260;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final long f46261;

    public C14092(int i, int i2, long j, long j2, boolean z) {
        super(i, i2, j, j2, z);
        this.f46261 = j2;
        this.f46257 = i;
        this.f46260 = i2;
        this.f46259 = z;
        this.f46258 = j == -1 ? -1L : j;
    }

    @Override // l.InterfaceC1390
    /* JADX INFO: renamed from: ܰ */
    public final long mo4877() {
        return this.f46261;
    }

    @Override // l.InterfaceC1390
    /* JADX INFO: renamed from: ۖ */
    public final long mo4876() {
        return this.f46258;
    }

    @Override // l.InterfaceC1390
    /* JADX INFO: renamed from: ֨ */
    public final int mo4875() {
        return this.f46257;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C14092 m34076(long j) {
        return new C14092(this.f46257, this.f46260, j, this.f46261, this.f46259);
    }
}
