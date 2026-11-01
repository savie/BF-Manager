package l;

/* JADX INFO: renamed from: l.۟᩸ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8RL */
/* JADX INFO: loaded from: classes3.dex */
public final class C7741 implements InterfaceC8447 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f25580;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f25581;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f25582;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f25583;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2460 f25584;

    @Override // l.InterfaceC8447
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo20390() {
        return -1;
    }

    public C7741(C7400 c7400) {
        C2460 c2460 = c7400.f24593;
        this.f25584 = c2460;
        c2460.m7510(12);
        this.f25583 = c2460.m7531() & 255;
        this.f25580 = c2460.m7531();
    }

    @Override // l.InterfaceC8447
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo20389() {
        return this.f25580;
    }

    @Override // l.InterfaceC8447
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo20388() {
        C2460 c2460 = this.f25584;
        int i = this.f25583;
        if (i == 8) {
            return c2460.m7516();
        }
        if (i == 16) {
            return c2460.m7519();
        }
        int i2 = this.f25582;
        this.f25582 = i2 + 1;
        if (i2 % 2 == 0) {
            int iM7516 = c2460.m7516();
            this.f25581 = iM7516;
            return (iM7516 & 240) >> 4;
        }
        return this.f25581 & 15;
    }
}
