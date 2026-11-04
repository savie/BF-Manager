package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܶܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: G8MT */
/* JADX INFO: loaded from: classes4.dex */
public final class C16165 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f52473;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean[] f52474 = new boolean[15];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f52475;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f52476;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f52477;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f52478;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f52479;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f52480;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m38344() {
        this.f52475 = 0L;
        this.f52478 = 0L;
        this.f52477 = 0L;
        this.f52476 = 0;
        Arrays.fill(this.f52474, false);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m38346() {
        return this.f52475 > 15 && this.f52476 == 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m38343() {
        long j = this.f52475;
        if (j == 0) {
            return false;
        }
        return this.f52474[(int) ((j - 1) % 15)];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m38345() {
        return this.f52477;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m38341() {
        long j = this.f52478;
        if (j == 0) {
            return 0L;
        }
        return this.f52477 / j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38342(long j) {
        long j2 = this.f52475;
        if (j2 == 0) {
            this.f52479 = j;
        } else if (j2 == 1) {
            long j3 = j - this.f52479;
            this.f52473 = j3;
            this.f52477 = j3;
            this.f52478 = 1L;
        } else {
            long j4 = j - this.f52480;
            int i = (int) (j2 % 15);
            long jAbs = Math.abs(j4 - this.f52473);
            boolean[] zArr = this.f52474;
            if (jAbs <= 1000000) {
                this.f52478++;
                this.f52477 += j4;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.f52476--;
                }
            } else if (!zArr[i]) {
                zArr[i] = true;
                this.f52476++;
            }
        }
        this.f52475++;
        this.f52480 = j;
    }
}
