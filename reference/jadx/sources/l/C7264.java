package l;

/* JADX INFO: renamed from: l.ۜܺ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N6PY */
/* JADX INFO: loaded from: classes4.dex */
public final class C7264 extends C3523 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5049 f23930;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f23931;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7264(InterfaceC13963 interfaceC13963, C5049 c5049) {
        super((AbstractC14709) interfaceC13963);
        this.f23930 = c5049;
    }

    @Override // l.C3523
    /* JADX INFO: renamed from: ܳ */
    public final int mo6508(int i) {
        this.f23930.m15284();
        if (size() >= 200000) {
            throw C15489.m37050(EnumC19965.LIMIT, "Token count limit exceeded");
        }
        return super.mo6508(Math.min(i, 200000 - size()));
    }

    @Override // l.C3523
    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC8743 mo5263(int i) {
        int i2 = this.f23931 + 1;
        this.f23931 = i2;
        if ((i2 & 1023) == 0) {
            this.f23930.m15284();
        }
        return super.mo5263(i);
    }
}
