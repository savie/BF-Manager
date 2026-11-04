package l;

/* JADX INFO: renamed from: l.ۨ۫ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 465J */
/* JADX INFO: loaded from: classes4.dex */
public final class C12360 extends AbstractC16859 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C24975 f39702;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f39703;

    public C12360(C24975 c24975, C8565 c8565, int i) {
        this.f39702 = c24975;
        this.f39703 = c8565.m22992(i + 1);
    }

    @Override // l.InterfaceC14553
    public final String getValue() {
        return this.f39702.m55782(this.f39703);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m30835() {
        return this.f39703;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30836(C0560 c0560) {
        this.f39702.m55786(this.f39703, c0560, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30837(C2161 c2161) {
        c2161.write(34);
        this.f39702.m55816(this.f39703, c2161, true);
        c2161.write(34);
    }
}
