package l;

import java.util.Random;

/* JADX INFO: renamed from: l.ۡ۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48BN */
/* JADX INFO: loaded from: classes3.dex */
public final class C8761 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f30120 = new Random().nextInt();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final double m22765() {
        long j = (this.f30120 * 6364136223846793005L) + 1442695040888963407L;
        this.f30120 = j;
        return ((double) ((int) (j >> 32))) * 4.6566128730773926E-10d;
    }
}
