package l;

/* JADX INFO: renamed from: l.ܿܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46PA */
/* JADX INFO: loaded from: classes5.dex */
public final class C17486 extends C4943 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f55636;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f55637;

    public C17486(C19583 c19583, int i) {
        super(c19583);
        this.f55636 = Math.max(2000000L, ((long) i) * 1000);
    }

    @Override // l.C4943
    /* JADX INFO: renamed from: ۖ */
    public final InterfaceC19761 mo13724(int i) {
        long j = this.f55637 + 1;
        this.f55637 = j;
        if ((j & 1023) == 0) {
            C18567.m42975();
            if (this.f55637 > this.f55636) {
                throw new IllegalArgumentException("Parser work exceeds formatter limit");
            }
        }
        return super.mo13724(i);
    }
}
