package l;

/* JADX INFO: renamed from: l.ܶ᩸ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8RL */
/* JADX INFO: loaded from: classes4.dex */
public final class C15503 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f50503;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f50504;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C2460 f50505;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2460 f50506;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f50507;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f50508;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f50509;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f50510;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f50511;

    public C15503(C2460 c2460, C2460 c2461, boolean z) throws C22861 {
        this.f50505 = c2460;
        this.f50506 = c2461;
        this.f50510 = z;
        c2461.m7510(12);
        this.f50504 = c2461.m7531();
        c2460.m7510(12);
        this.f50509 = c2460.m7531();
        C19923.m45219("first_chunk must be 1", c2460.m7499() == 1);
        this.f50508 = -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m37110() {
        long jM7532;
        int i = this.f50508 + 1;
        this.f50508 = i;
        if (i == this.f50504) {
            return false;
        }
        boolean z = this.f50510;
        C2460 c2460 = this.f50506;
        if (z) {
            jM7532 = c2460.m7526();
        } else {
            jM7532 = c2460.m7532();
        }
        this.f50503 = jM7532;
        if (this.f50508 == this.f50507) {
            C2460 c2461 = this.f50505;
            this.f50511 = c2461.m7531();
            c2461.m7535(4);
            int i2 = this.f50509 - 1;
            this.f50509 = i2;
            this.f50507 = i2 > 0 ? c2461.m7531() - 1 : -1;
        }
        return true;
    }
}
