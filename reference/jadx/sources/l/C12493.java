package l;

/* JADX INFO: renamed from: l.۫ܶܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8TP */
/* JADX INFO: loaded from: classes4.dex */
public final class C12493 extends AbstractC8965 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f41784;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f41785;

    public C12493(long j, long j2) {
        this.f41785 = j;
        this.f41784 = j2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12493 m31035(C2460 c2460, long j, C6694 c6694) {
        long jM31034 = m31034(j, c2460);
        return new C12493(jM31034, c6694.m18077(jM31034));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m31034(long j, C2460 c2460) {
        long jM7516 = c2460.m7516();
        if ((128 & jM7516) != 0) {
            return 8589934591L & ((((jM7516 & 1) << 32) | c2460.m7532()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // l.AbstractC8965
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb.append(this.f41785);
        sb.append(", playbackPositionUs= ");
        return C15037.m36023(sb, this.f41784, " }");
    }
}
