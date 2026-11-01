package l;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۜ֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes2.dex */
public final class C6447 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f21817 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final char[] f21818 = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m17635(C13026 c13026, C2213 c2213, AbstractActivityC12483 abstractActivityC12483) {
        return (abstractActivityC12483 == null || !(abstractActivityC12483.isFinishing() || abstractActivityC12483.isDestroyed())) && c2213.m6829(c13026);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m17633(C6750 c6750, int i, int i2, C11054 c11054) throws IOException {
        if (i <= 0) {
            throw new IllegalArgumentException("column must be positive");
        }
        if (i2 < 5 && m17632(c6750.length(), i, i2) > 524288) {
            throw new C5036();
        }
        InterfaceC5614 interfaceC5614M29777 = C11965.m29777(c11054);
        switch (i2) {
            case 0:
                C0802 c0802 = new C0802(c6750.length(), i, interfaceC5614M29777);
                c6750.m18251(c0802, c6750.length());
                return c0802.finish();
            case 1:
                C21970 c21970 = new C21970(c6750.length(), i, interfaceC5614M29777);
                c6750.m18251(c21970, c6750.length());
                return c21970.finish();
            case 2:
                C4330 c4330 = new C4330(c6750.length(), i, interfaceC5614M29777);
                c6750.m18251(c4330, c6750.length());
                return c4330.finish();
            case 3:
                C3291 c3291 = new C3291(c6750.length(), interfaceC5614M29777);
                c6750.m18251(c3291, c6750.length());
                return c3291.finish();
            case 4:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) Math.min(524288L, m17632(c6750.length(), 1, 4)));
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 0);
                try {
                    c6750.m18251(new C13504(base64OutputStream, interfaceC5614M29777), c6750.length());
                    base64OutputStream.close();
                    return byteArrayOutputStream.toString(StandardCharsets.US_ASCII.name());
                } catch (Throwable th) {
                    try {
                        base64OutputStream.close();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 5:
                MessageDigest messageDigestM49425 = C22253.m49425();
                c6750.m18251(new C1880(interfaceC5614M29777, messageDigestM49425), c6750.length());
                return C22253.m49424(messageDigestM49425.digest()).toUpperCase();
            case 6:
                MessageDigest messageDigestM49416 = C22253.m49416();
                c6750.m18251(new C1880(interfaceC5614M29777, messageDigestM49416), c6750.length());
                return C22253.m49424(messageDigestM49416.digest()).toUpperCase();
            case 7:
                CRC32 crc32 = new CRC32();
                c6750.m18251(new C9643(interfaceC5614M29777, crc32), c6750.length());
                return String.format("%08X", Long.valueOf(crc32.getValue()));
            default:
                throw new IllegalArgumentException(C8479.m22141(i2, "which = "));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m17632(int i, int i2, int i3) {
        long j;
        long j2;
        if (i < 0 || i2 <= 0) {
            throw new IllegalArgumentException("Invalid copy range");
        }
        long j3 = i == 0 ? 0L : (((long) i) - 1) / ((long) i2);
        if (i3 == 0) {
            j = ((long) i) * 3;
        } else {
            if (i3 != 1) {
                if (i3 == 2) {
                    j2 = ((long) i) * 9;
                } else {
                    if (i3 == 3) {
                        return i;
                    }
                    if (i3 != 4) {
                        throw new IllegalArgumentException(C8479.m22141(i3, "which = "));
                    }
                    j3 = 2;
                    long j4 = ((((long) i) + 2) / 3) * 4;
                    j2 = (j4 / 76) + j4;
                }
                return j2 + j3;
            }
            j = ((long) i) * 4;
        }
        return j + j3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17634(StringBuilder sb) {
        if (sb.length() != 0) {
            sb.setCharAt(sb.length() - 1, '\n');
        }
    }
}
