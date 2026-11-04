package l;

import java.math.RoundingMode;

/* JADX INFO: renamed from: l.֫ۨ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P8OA */
/* JADX INFO: loaded from: classes3.dex */
public final class C1909 implements InterfaceC5638 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12789 f6420;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C25030 f6421;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f6422;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC22024 f6423;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f6424;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f6425;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15648 f6426;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f6427;

    public C1909(InterfaceC12789 interfaceC12789, InterfaceC22024 interfaceC22024, C25030 c25030, String str, int i) throws C2970 {
        this.f6420 = interfaceC12789;
        this.f6423 = interfaceC22024;
        this.f6421 = c25030;
        int i2 = c25030.f80993;
        int i3 = c25030.f80994;
        int i4 = (c25030.f80991 * i2) / 8;
        int i5 = c25030.f80995;
        if (i5 != i4) {
            throw C2970.m9688("Expected block size: " + i4 + "; got: " + i5, (Throwable) null);
        }
        int i6 = i3 * i4;
        int i7 = i6 * 8;
        int iMax = Math.max(i4, i6 / 10);
        this.f6424 = iMax;
        C20124 c20124 = new C20124();
        c20124.m46327("audio/wav");
        c20124.m46315(str);
        c20124.m46308(i7);
        c20124.m46322(i7);
        c20124.m46318(iMax);
        c20124.m46329(i2);
        c20124.m46332(i3);
        c20124.m46293(i);
        this.f6426 = c20124.m46295();
    }

    @Override // l.InterfaceC5638
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6573(long j) {
        this.f6425 = j;
        this.f6427 = 0;
        this.f6422 = 0L;
    }

    @Override // l.InterfaceC5638
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6572(int i, long j) {
        C16078 c16078 = new C16078(this.f6421, 1, i, j);
        this.f6420.mo16659(c16078);
        C15648 c15648 = this.f6426;
        InterfaceC22024 interfaceC22024 = this.f6423;
        interfaceC22024.mo14384(c15648);
        interfaceC22024.mo14382(c16078.mo2295());
    }

    @Override // l.InterfaceC5638
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo6574(InterfaceC19502 interfaceC19502, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.f6427) < (i2 = this.f6424)) {
            int iMo14380 = this.f6423.mo14380((InterfaceC9461) interfaceC19502, (int) Math.min(i2 - i, j2), true);
            if (iMo14380 == -1) {
                j2 = 0;
            } else {
                this.f6427 += iMo14380;
                j2 -= (long) iMo14380;
            }
        }
        C25030 c25030 = this.f6421;
        int i3 = c25030.f80995;
        int i4 = this.f6427 / i3;
        if (i4 > 0) {
            long j3 = this.f6425;
            long j4 = this.f6422;
            long j5 = c25030.f80994;
            String str = C7116.f23455;
            long jM19477 = j3 + C7116.m19477(j4, 1000000L, j5, RoundingMode.DOWN);
            int i5 = i4 * i3;
            int i6 = this.f6427 - i5;
            this.f6423.mo14383(jM19477, 1, i5, i6, null);
            this.f6422 += (long) i4;
            this.f6427 = i6;
        }
        return j2 <= 0;
    }
}
