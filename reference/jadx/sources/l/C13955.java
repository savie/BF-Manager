package l;

import java.util.HashSet;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.۬ܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R790 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13955 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1278 f44257;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashSet f44258 = new HashSet();

    public C13955(InterfaceC1278 interfaceC1278) {
        this.f44257 = interfaceC1278;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m34024(C13955 c13955) {
        return c13955.f44257.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m34025(C13955 c13955, long j, int i) {
        if (i < 0) {
            c13955.getClass();
            throw new C25167();
        }
        HashSet hashSet = c13955.f44258;
        if (i != 0) {
            long j2 = ((((long) i) + j) - 1) / X931RNG.BLOCK64_RESEED_MAX;
            for (long j3 = j / X931RNG.BLOCK64_RESEED_MAX; j3 <= j2; j3++) {
                hashSet.add(Long.valueOf(j3));
                if (hashSet.size() > 256) {
                    throw new C25167();
                }
            }
        }
        byte[] bArr = new byte[i];
        c13955.f44257.mo4667(j, bArr, 0, i);
        return bArr;
    }
}
