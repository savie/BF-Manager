package l;

/* JADX INFO: renamed from: l.֫ۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 057Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C1610 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f6502;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f6503;

    public C1610(long j, long j2) {
        if (j2 == 0) {
            this.f6503 = 0L;
            this.f6502 = 1L;
        } else {
            this.f6503 = j;
            this.f6502 = j2;
        }
    }

    public final String toString() {
        return this.f6503 + "/" + this.f6502;
    }
}
