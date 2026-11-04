package l;

/* JADX INFO: renamed from: l.᩺ۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: F6QC */
/* JADX INFO: loaded from: classes.dex */
public final class C24092 extends C3523 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f77895;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f77896;

    public C24092(C24838 c24838, int i) {
        super(c24838);
        this.f77896 = Math.max(2000000L, ((long) i) * 1000);
    }

    @Override // l.C3523
    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC8743 mo5263(int i) {
        long j = this.f77895 + 1;
        this.f77895 = j;
        if ((j & 1023) == 0) {
            C18870.m43769();
            if (this.f77895 > this.f77896) {
                throw new IllegalArgumentException("Parser work exceeds formatter limit");
            }
        }
        return super.mo5263(i);
    }
}
