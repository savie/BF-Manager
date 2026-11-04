package l;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۘۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes2.dex */
public final class C3991 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f13655 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final char[] f13656 = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m12912(C12628 c12628, C23383 c23383, AbstractActivityC17204 abstractActivityC17204) {
        return (abstractActivityC17204 == null || !(abstractActivityC17204.isFinishing() || abstractActivityC17204.isDestroyed())) && c23383.m52547(c12628);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m12910(C7210 c7210, int i, int i2, C15177 c15177) throws IOException {
        if (i <= 0) {
            throw new IllegalArgumentException("column must be positive");
        }
        if (i2 < 5 && m12909(c7210.length(), i, i2) > 524288) {
            throw new C3245();
        }
        InterfaceC7509 interfaceC7509M41888 = C17950.m41888(c15177);
        switch (i2) {
            case 0:
                C12194 c12194 = new C12194(c7210.length(), i, interfaceC7509M41888);
                c7210.m19798(c12194, c7210.length());
                return c12194.finish();
            case 1:
                C20399 c20399 = new C20399(c7210.length(), i, interfaceC7509M41888);
                c7210.m19798(c20399, c7210.length());
                return c20399.finish();
            case 2:
                C16669 c16669 = new C16669(c7210.length(), i, interfaceC7509M41888);
                c7210.m19798(c16669, c7210.length());
                return c16669.finish();
            case 3:
                C24875 c24875 = new C24875(c7210.length(), interfaceC7509M41888);
                c7210.m19798(c24875, c7210.length());
                return c24875.finish();
            case 4:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) Math.min(524288L, m12909(c7210.length(), 1, 4)));
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 0);
                try {
                    c7210.m19798(new C17415(base64OutputStream, interfaceC7509M41888), c7210.length());
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
                MessageDigest messageDigestM36183 = C15022.m36183();
                c7210.m19798(new C1754(interfaceC7509M41888, messageDigestM36183), c7210.length());
                return C15022.m36182(messageDigestM36183.digest()).toUpperCase();
            case 6:
                MessageDigest messageDigestM36174 = C15022.m36174();
                c7210.m19798(new C1754(interfaceC7509M41888, messageDigestM36174), c7210.length());
                return C15022.m36182(messageDigestM36174.digest()).toUpperCase();
            case 7:
                CRC32 crc32 = new CRC32();
                c7210.m19798(new C11448(interfaceC7509M41888, crc32), c7210.length());
                return String.format("%08X", Long.valueOf(crc32.getValue()));
            default:
                throw new IllegalArgumentException(C13645.m33382(i2, "which = "));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m12909(int i, int i2, int i3) {
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
                        throw new IllegalArgumentException(C13645.m33382(i3, "which = "));
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
    public static void m12911(StringBuilder sb) {
        if (sb.length() != 0) {
            sb.setCharAt(sb.length() - 1, '\n');
        }
    }
}
