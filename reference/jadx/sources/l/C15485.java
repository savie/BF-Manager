package l;

/* JADX INFO: renamed from: l.ܳܽ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U8RL */
/* JADX INFO: loaded from: classes5.dex */
public final class C15485 implements InterfaceC11010 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21287 f50405;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f50406;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f50407;

    public C15485(C19621 c19621, C15648 c15648) {
        C21287 c21287 = c19621.f63236;
        this.f50405 = c21287;
        c21287.m48510(12);
        int iM48512 = c21287.m48512();
        if ("audio/raw".equals(c15648.f50848)) {
            int iM19495 = C7116.m19495(c15648.f50826) * c15648.f50843;
            if (iM48512 == 0 || iM48512 % iM19495 != 0) {
                C1896.m6517("Audio sample size mismatch. stsd sample size: " + iM19495 + ", stsz sample size: " + iM48512);
                iM48512 = iM19495;
            }
        }
        this.f50407 = iM48512 == 0 ? -1 : iM48512;
        this.f50406 = c21287.m48512();
    }

    @Override // l.InterfaceC11010
    /* JADX INFO: renamed from: ۤ */
    public final int mo27871() {
        return this.f50406;
    }

    @Override // l.InterfaceC11010
    /* JADX INFO: renamed from: ᩷ */
    public final int mo27872() {
        return this.f50407;
    }

    @Override // l.InterfaceC11010
    /* JADX INFO: renamed from: ۙ */
    public final int mo27870() {
        int i = this.f50407;
        return i == -1 ? this.f50405.m48512() : i;
    }
}
