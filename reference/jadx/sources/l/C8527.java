package l;

import java.util.Random;

/* JADX INFO: renamed from: l.۠ۡܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48BN */
/* JADX INFO: loaded from: classes3.dex */
public final class C8527 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f27861 = new Random().nextInt();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final double m22840() {
        long j = (this.f27861 * 6364136223846793005L) + 1442695040888963407L;
        this.f27861 = j;
        return ((double) ((int) (j >> 32))) * 4.656612873077393E-10d;
    }
}
