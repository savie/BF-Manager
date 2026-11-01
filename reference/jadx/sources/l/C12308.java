package l;

import android.util.Pair;
import java.util.Arrays;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;

/* JADX INFO: renamed from: l.۫ۡܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8SK */
/* JADX INFO: loaded from: classes3.dex */
public final class C12308 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final byte[] f41140 = {0, 0, 0, 0, 16, 0, GCMSIVBlockCipher.MASK, 0, 0, -86, 0, 56, -101, KeyFactorySpi.Ed448_type};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f41139 = {0, 0, PublicSuffixDatabase.EXCEPTION_MARKER, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m30567(InterfaceC7222 interfaceC7222) {
        C2460 c2460 = new C2460(8);
        int i = C16541.m38943(interfaceC7222, c2460).f53131;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        interfaceC7222.mo19210(0, 4, c2460.m7518());
        c2460.m7510(0);
        int iM7499 = c2460.m7499();
        if (iM7499 == 1463899717) {
            return true;
        }
        C0303.m1853("Unsupported form type: " + iM7499);
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C0312 m30569(InterfaceC7222 interfaceC7222) throws C22861 {
        byte[] bArr;
        C2460 c2460 = new C2460(16);
        long j = m30566(1718449184, interfaceC7222, c2460).f53132;
        C2023.m6510(j >= 16);
        interfaceC7222.mo19210(0, 16, c2460.m7518());
        c2460.m7510(0);
        int iM7528 = c2460.m7528();
        int iM7529 = c2460.m7528();
        int iM7533 = c2460.m7533();
        c2460.m7533();
        c2460.m7528();
        int iM75210 = c2460.m7528();
        int i = ((int) j) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            interfaceC7222.mo19210(0, i, bArr2);
            if (iM7528 == 65534 && i == 24) {
                C2460 c2461 = new C2460(bArr2);
                c2461.m7528();
                int iM75211 = c2461.m7528();
                if (iM75211 != 0 && iM75211 != iM75210) {
                    throw C22861.m50611("validBits ( " + iM75211 + ")  != bitsPerSample( " + iM75210 + ") are not supported");
                }
                int iM7534 = c2461.m7533();
                if ((iM7534 >> 18) != 0) {
                    throw C22861.m50611("invalid channel mask " + iM7534);
                }
                if (iM7534 != 0 && Integer.bitCount(iM7534) != iM7529) {
                    throw C22861.m50611("invalid number of channels (" + Integer.bitCount(iM7534) + ") in channel mask " + iM7534);
                }
                iM7528 = c2461.m7528();
                byte[] bArr3 = new byte[14];
                c2461.m7507(0, 14, bArr3);
                if (!Arrays.equals(bArr3, f41140) && !Arrays.equals(bArr3, f41139)) {
                    throw C22861.m50611("invalid wav format extension guid");
                }
            }
            bArr = bArr2;
        } else {
            bArr = C17983.f57507;
        }
        interfaceC7222.mo19214((int) (interfaceC7222.mo19213() - interfaceC7222.getPosition()));
        return new C0312(bArr, iM7528, iM7529, iM7533, iM75210);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Pair m30568(InterfaceC7222 interfaceC7222) throws C22861 {
        interfaceC7222.mo19217();
        C16541 c16541M30566 = m30566(1684108385, interfaceC7222, new C2460(8));
        interfaceC7222.mo19214(8);
        return Pair.create(Long.valueOf(interfaceC7222.getPosition()), Long.valueOf(c16541M30566.f53132));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16541 m30566(int i, InterfaceC7222 interfaceC7222, C2460 c2460) throws C22861 {
        C16541 c16541M38943 = C16541.m38943(interfaceC7222, c2460);
        while (true) {
            int i2 = c16541M38943.f53131;
            if (i2 == i) {
                return c16541M38943;
            }
            C7309.m19506(i2, "Ignoring unknown WAV chunk: ");
            long j = c16541M38943.f53132;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw C22861.m50611("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            interfaceC7222.mo19214((int) j2);
            c16541M38943 = C16541.m38943(interfaceC7222, c2460);
        }
    }
}
