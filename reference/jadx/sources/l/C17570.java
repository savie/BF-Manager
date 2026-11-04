package l;

import android.util.Pair;
import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.Arrays;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;

/* JADX INFO: renamed from: l.ܽۨ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C8SK */
/* JADX INFO: loaded from: classes4.dex */
public final class C17570 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final byte[] f57093 = {0, 0, 0, 0, 16, 0, GCMSIVBlockCipher.MASK, 0, 0, -86, 0, 56, -101, KeyFactorySpi.Ed448_type};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f57092 = {0, 0, PublicSuffixDatabase.EXCEPTION_MARKER, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m41236(InterfaceC19502 interfaceC19502) {
        C21287 c21287 = new C21287(8);
        int i = C16824.m39743(interfaceC19502, c21287).f54282;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        interfaceC19502.mo10069(0, 4, c21287.m48497());
        c21287.m48510(0);
        int iM48500 = c21287.m48500();
        if (iM48500 == 1463899717) {
            return true;
        }
        C1896.m6515("Unsupported form type: " + iM48500);
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C25030 m41238(InterfaceC19502 interfaceC19502) throws C2970 {
        byte[] bArr;
        C21287 c21287 = new C21287(16);
        long j = m41235(1718449184, interfaceC19502, c21287).f54283;
        C20782.m47568(j >= 16);
        interfaceC19502.mo10069(0, 16, c21287.m48497());
        c21287.m48510(0);
        int iM48504 = c21287.m48504();
        int iM48505 = c21287.m48504();
        int iM48506 = c21287.m48506();
        c21287.m48506();
        c21287.m48504();
        int iM48507 = c21287.m48504();
        int i = ((int) j) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            interfaceC19502.mo10069(0, i, bArr2);
            if (iM48504 == 65534 && i == 24) {
                C21287 c21288 = new C21287(bArr2);
                c21288.m48504();
                int iM48508 = c21288.m48504();
                if (iM48508 != 0 && iM48508 != iM48507) {
                    throw C2970.m9689("validBits ( " + iM48508 + ")  != bitsPerSample( " + iM48507 + ") are not supported");
                }
                int iM48509 = c21288.m48506();
                if ((iM48509 >> 18) != 0) {
                    throw C2970.m9689("invalid channel mask " + iM48509);
                }
                if (iM48509 != 0 && Integer.bitCount(iM48509) != iM48505) {
                    throw C2970.m9689("invalid number of channels (" + Integer.bitCount(iM48509) + ") in channel mask " + iM48509);
                }
                iM48504 = c21288.m48504();
                byte[] bArr3 = new byte[14];
                c21288.m48490(0, 14, bArr3);
                if (!Arrays.equals(bArr3, f57093) && !Arrays.equals(bArr3, f57092)) {
                    throw C2970.m9689("invalid wav format extension guid");
                }
            }
            bArr = bArr2;
        } else {
            bArr = C7116.f23453;
        }
        interfaceC19502.mo10073((int) (interfaceC19502.mo10072() - interfaceC19502.getPosition()));
        return new C25030(bArr, iM48504, iM48505, iM48506, iM48507);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Pair m41237(InterfaceC19502 interfaceC19502) throws C2970 {
        interfaceC19502.mo10076();
        C16824 c16824M41235 = m41235(1684108385, interfaceC19502, new C21287(8));
        interfaceC19502.mo10073(8);
        return Pair.create(Long.valueOf(interfaceC19502.getPosition()), Long.valueOf(c16824M41235.f54283));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16824 m41235(int i, InterfaceC19502 interfaceC19502, C21287 c21287) throws C2970 {
        C16824 c16824M39743 = C16824.m39743(interfaceC19502, c21287);
        while (true) {
            int i2 = c16824M39743.f54282;
            if (i2 == i) {
                return c16824M39743;
            }
            j$$ExternalSyntheticOutline0.m(i2, "Ignoring unknown WAV chunk: ");
            long j = c16824M39743.f54283;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw C2970.m9689("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            interfaceC19502.mo10073((int) j2);
            c16824M39743 = C16824.m39743(interfaceC19502, c21287);
        }
    }
}
