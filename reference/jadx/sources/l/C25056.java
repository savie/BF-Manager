package l;

/* JADX INFO: renamed from: l.᩻۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 46PA */
/* JADX INFO: loaded from: classes.dex */
public final class C25056 extends C3523 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f81042;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f81043;

    public C25056(C5115 c5115, int i) {
        super(c5115);
        this.f81043 = Math.max(2000000L, ((long) i) * 1000);
    }

    @Override // l.C3523
    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC8743 mo5263(int i) {
        long j = this.f81042 + 1;
        this.f81042 = j;
        if ((j & 1023) == 0) {
            C7155.m19727();
            if (this.f81042 > this.f81043) {
                throw new IllegalArgumentException("Parser work exceeds formatter limit");
            }
        }
        return super.mo5263(i);
    }
}
