package l;

/* JADX INFO: renamed from: l.֫ۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M6O6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1891 extends C3523 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25012 f6378;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f6379;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1891(C22490 c22490, C25012 c25012) {
        super(c22490);
        this.f6378 = c25012;
    }

    @Override // l.C3523
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int mo6508(int i) {
        this.f6378.m55844();
        if (size() >= 200000) {
            throw C16060.m38214(EnumC4590.LIMIT, "Token count limit exceeded");
        }
        return super.mo6508(Math.min(i, 200000 - size()));
    }

    @Override // l.C3523
    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC8743 mo5263(int i) {
        int i2 = this.f6379 + 1;
        this.f6379 = i2;
        if ((i2 & 1023) == 0) {
            this.f6378.m55844();
        }
        return super.mo5263(i);
    }
}
