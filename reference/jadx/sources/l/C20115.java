package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.bo;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;

/* JADX INFO: renamed from: l.᩶ۤ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Y3NK */
/* JADX INFO: loaded from: classes4.dex */
public final class C20115 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m45480(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45479(byte b, byte b2, char[] cArr, int i) throws C4529 {
        if (b < -62 || m45480(b2)) {
            throw C4529.m12643();
        }
        cArr[i] = (char) (((b & bo.j) << 6) | (b2 & 63));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45478(byte b, byte b2, byte b3, char[] cArr, int i) throws C4529 {
        if (m45480(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m45480(b3)))) {
            throw C4529.m12643();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45477(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws C4529 {
        if (!m45480(b2)) {
            if ((((b2 + KeyFactorySpi.Ed25519_type) + (b << ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB)) >> 30) == 0 && !m45480(b3) && !m45480(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw C4529.m12643();
    }
}
