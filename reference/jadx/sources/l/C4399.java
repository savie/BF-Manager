package l;

/* JADX INFO: renamed from: l.ۙۘܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88UO */
/* JADX INFO: loaded from: classes3.dex */
public final class C4399 implements InterfaceC6599 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f15661;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f15662;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f15663;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f15664;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f15665;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC2282 f15666;

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo5382() {
        return true;
    }

    public C4399(InterfaceC2282 interfaceC2282, long j, long j2, long j3, long j4, long j5) {
        this.f15666 = interfaceC2282;
        this.f15661 = j;
        this.f15664 = j2;
        this.f15663 = j3;
        this.f15665 = j4;
        this.f15662 = j5;
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۙ */
    public final C12950 mo5381(long j) {
        C22828 c22828 = new C22828(j, C11456.m28593(this.f15666.mo6989(j), 0L, this.f15664, this.f15663, this.f15665, this.f15662));
        return new C12950(c22828, c22828);
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۬ */
    public final long mo5383() {
        return this.f15661;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m12262(long j) {
        return this.f15666.mo6989(j);
    }
}
