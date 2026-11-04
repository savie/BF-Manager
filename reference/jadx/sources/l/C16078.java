package l;

import java.math.RoundingMode;

/* JADX INFO: renamed from: l.ܶۨ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 78HC */
/* JADX INFO: loaded from: classes5.dex */
public final class C16078 implements InterfaceC9060 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f52091;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f52092;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C25030 f52093;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f52094;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f52095;

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo2298() {
        return true;
    }

    public C16078(C25030 c25030, int i, long j, long j2) {
        this.f52093 = c25030;
        this.f52095 = i;
        this.f52092 = j;
        long j3 = (j2 - j) / ((long) c25030.f80995);
        this.f52091 = j3;
        this.f52094 = m38226(j3);
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ۚ */
    public final long mo2295() {
        return this.f52094;
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ۙ */
    public final C9805 mo2290(long j) {
        C25030 c25030 = this.f52093;
        long j2 = (((long) c25030.f80994) * j) / (((long) this.f52095) * 1000000);
        long j3 = this.f52091;
        long jM19476 = C7116.m19476(j2, 0L, j3 - 1);
        long j4 = ((long) c25030.f80995) * jM19476;
        long j5 = this.f52092;
        long jM38226 = m38226(jM19476);
        C2349 c2349 = new C2349(jM38226, j4 + j5);
        if (jM38226 < j && jM19476 != j3 - 1) {
            long j6 = jM19476 + 1;
            return new C9805(c2349, new C2349(m38226(j6), (((long) c25030.f80995) * j6) + j5));
        }
        return new C9805(c2349, c2349);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private long m38226(long j) {
        long j2 = j * ((long) this.f52095);
        long j3 = this.f52093.f80994;
        String str = C7116.f23455;
        return C7116.m19477(j2, 1000000L, j3, RoundingMode.DOWN);
    }
}
