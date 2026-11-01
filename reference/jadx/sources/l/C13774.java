package l;

/* JADX INFO: renamed from: l.ܰۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6QC */
/* JADX INFO: loaded from: classes4.dex */
public final class C13774 extends C4943 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f45396;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f45397;

    public C13774(C17156 c17156, int i) {
        super(c17156);
        this.f45396 = Math.max(2000000L, ((long) i) * 1000);
    }

    @Override // l.C4943
    /* JADX INFO: renamed from: ۖ */
    public final InterfaceC19761 mo13724(int i) {
        long j = this.f45397 + 1;
        this.f45397 = j;
        if ((j & 1023) == 0) {
            C3894.m11326();
            if (this.f45397 > this.f45396) {
                throw new IllegalArgumentException("Parser work exceeds formatter limit");
            }
        }
        return super.mo13724(i);
    }
}
