package l;

/* JADX INFO: renamed from: l.᩶ܺ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: S8O0 */
/* JADX INFO: loaded from: classes.dex */
public final class C21431 extends C0967 implements InterfaceC10242 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f68376;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f68377;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f68378;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f68379;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f68380;

    public C21431(int i, int i2, long j, long j2, boolean z) {
        super(i, i2, j, j2, z);
        this.f68380 = j2;
        this.f68376 = i;
        this.f68379 = i2;
        this.f68377 = z;
        this.f68378 = j == -1 ? -1L : j;
    }

    @Override // l.InterfaceC10242
    /* JADX INFO: renamed from: ᩷ */
    public final long mo2548() {
        return this.f68380;
    }

    @Override // l.InterfaceC10242
    /* JADX INFO: renamed from: ᩸ */
    public final long mo2550() {
        return this.f68378;
    }

    @Override // l.InterfaceC10242
    /* JADX INFO: renamed from: ۫ */
    public final int mo2547() {
        return this.f68376;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C21431 m48754(long j) {
        return new C21431(this.f68376, this.f68379, j, this.f68380, this.f68377);
    }
}
