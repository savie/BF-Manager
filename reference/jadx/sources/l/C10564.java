package l;

/* JADX INFO: renamed from: l.ۤ᩸ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8RL */
/* JADX INFO: loaded from: classes3.dex */
public final class C10564 implements InterfaceC8447 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2460 f36162;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f36163;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f36164;

    public C10564(C7400 c7400, C7648 c7648) {
        C2460 c2460 = c7400.f24593;
        this.f36162 = c2460;
        c2460.m7510(12);
        int iM7531 = c2460.m7531();
        if ("audio/raw".equals(c7648.f25265)) {
            int iM41849 = C17983.m41849(c7648.f25280) * c7648.f25249;
            if (iM7531 == 0 || iM7531 % iM41849 != 0) {
                C0303.m1848("Audio sample size mismatch. stsd sample size: " + iM41849 + ", stsz sample size: " + iM7531);
                iM7531 = iM41849;
            }
        }
        this.f36164 = iM7531 == 0 ? -1 : iM7531;
        this.f36163 = c2460.m7531();
    }

    @Override // l.InterfaceC8447
    /* JADX INFO: renamed from: ۨ */
    public final int mo20389() {
        return this.f36163;
    }

    @Override // l.InterfaceC8447
    /* JADX INFO: renamed from: ܰ */
    public final int mo20390() {
        return this.f36164;
    }

    @Override // l.InterfaceC8447
    /* JADX INFO: renamed from: ۙ */
    public final int mo20388() {
        int i = this.f36164;
        return i == -1 ? this.f36162.m7531() : i;
    }
}
