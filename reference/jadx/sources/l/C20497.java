package l;

/* JADX INFO: renamed from: l.᩶᩻ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6O6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20497 extends C4943 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f66460;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16969 f66461;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20497(C10246 c10246, C16969 c16969) {
        super(c10246);
        this.f66461 = c16969;
    }

    @Override // l.C4943
    /* JADX INFO: renamed from: ᩹ */
    public final int mo13730(int i) {
        this.f66461.m39762();
        if (size() >= 200000) {
            throw C6385.m17523(EnumC8129.LIMIT, "Token count limit exceeded");
        }
        return super.mo13730(Math.min(i, 200000 - size()));
    }

    @Override // l.C4943
    /* JADX INFO: renamed from: ۖ */
    public final InterfaceC19761 mo13724(int i) {
        int i2 = this.f66460 + 1;
        this.f66460 = i2;
        if ((i2 & 1023) == 0) {
            this.f66461.m39762();
        }
        return super.mo13724(i);
    }
}
