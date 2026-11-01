package l;

import java.util.HashSet;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۚۗ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: R790 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5083 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3153 f17735;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashSet f17736 = new HashSet();

    public C5083(InterfaceC3153 interfaceC3153) {
        this.f17735 = interfaceC3153;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m14176(C5083 c5083) {
        return c5083.f17735.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m14177(C5083 c5083, long j, int i) {
        if (i < 0) {
            c5083.getClass();
            throw new C7906();
        }
        HashSet hashSet = c5083.f17736;
        if (i != 0) {
            long j2 = ((((long) i) + j) - 1) / X931RNG.BLOCK64_RESEED_MAX;
            for (long j3 = j / X931RNG.BLOCK64_RESEED_MAX; j3 <= j2; j3++) {
                hashSet.add(Long.valueOf(j3));
                if (hashSet.size() > 256) {
                    throw new C7906();
                }
            }
        }
        byte[] bArr = new byte[i];
        c5083.f17735.mo9547(j, bArr, 0, i);
        return bArr;
    }
}
