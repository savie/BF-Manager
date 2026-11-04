package l;

/* JADX INFO: renamed from: l.ۜܺ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U8RL */
/* JADX INFO: loaded from: classes3.dex */
public final class C7260 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21287 f23920;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21287 f23921;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f23922;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f23923;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f23924;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f23925;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f23926;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f23927;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f23928;

    public C7260(C21287 c21287, C21287 c21288, boolean z) throws C2970 {
        this.f23920 = c21287;
        this.f23921 = c21288;
        this.f23927 = z;
        c21288.m48510(12);
        this.f23928 = c21288.m48512();
        c21287.m48510(12);
        this.f23922 = c21287.m48512();
        C5332.m15985("first_chunk must be 1", c21287.m48500() == 1);
        this.f23923 = -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m19898() {
        long jM48485;
        int i = this.f23923 + 1;
        this.f23923 = i;
        if (i == this.f23928) {
            return false;
        }
        boolean z = this.f23927;
        C21287 c21287 = this.f23921;
        if (z) {
            jM48485 = c21287.m48482();
        } else {
            jM48485 = c21287.m48485();
        }
        this.f23924 = jM48485;
        if (this.f23923 == this.f23926) {
            C21287 c21288 = this.f23920;
            this.f23925 = c21288.m48512();
            c21288.m48503(4);
            int i2 = this.f23922 - 1;
            this.f23922 = i2;
            this.f23926 = i2 > 0 ? c21288.m48512() - 1 : -1;
        }
        return true;
    }
}
