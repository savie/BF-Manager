package l;

/* JADX INFO: renamed from: l.ܽܺ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: G8TP */
/* JADX INFO: loaded from: classes5.dex */
public final class C17701 extends AbstractC19939 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f58181;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f58182;

    public C17701(long j, long j2) {
        this.f58182 = j;
        this.f58181 = j2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17701 m41462(C21287 c21287, long j, C1150 c1150) {
        long jM41461 = m41461(j, c21287);
        return new C17701(jM41461, c1150.m4249(jM41461));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m41461(long j, C21287 c21287) {
        long jM48493 = c21287.m48493();
        if ((128 & jM48493) != 0) {
            return 8589934591L & ((((jM48493 & 1) << 32) | c21287.m48485()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // l.AbstractC19939
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb.append(this.f58182);
        sb.append(", playbackPositionUs= ");
        return C2764.m9137(sb, this.f58181, " }");
    }
}
