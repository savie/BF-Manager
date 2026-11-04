package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.util.encoders.UTF8;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.֫ۗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AHH */
/* JADX INFO: loaded from: classes2.dex */
public final class C1639 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f5665 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final InterfaceC24760 f5666 = AbstractC16554.m39196(Charset.defaultCharset());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m5795(String str, byte[] bArr, int i, int i2, InterfaceC24760 interfaceC24760) {
        byte[] bArrMo28622 = interfaceC24760.mo28622(str);
        while (bArrMo28622.length > i2) {
            str = C1402.m5124(1, 0, str);
            bArrMo28622 = interfaceC24760.mo28622(str);
        }
        System.arraycopy(bArrMo28622, 0, bArr, i, bArrMo28622.length);
        for (int length = bArrMo28622.length; length < i2; length++) {
            bArr[i + length] = 0;
        }
        return i + i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5801(long j, byte[] bArr, int i, int i2) {
        int i3;
        int i4 = i2 - 1;
        if (j == 0) {
            i3 = i2 - 2;
            bArr[i4 + i] = UTF8.S_P3A;
        } else {
            long j2 = j;
            while (i4 >= 0 && j2 != 0) {
                bArr[i + i4] = (byte) (((byte) (7 & j2)) + UTF8.S_P3A);
                j2 >>>= 3;
                i4--;
            }
            if (j2 != 0) {
                throw new IllegalArgumentException(j + "=" + Long.toOctalString(j) + " will not fit in octal number buffer of length " + i2);
            }
            i3 = i4;
        }
        while (i3 >= 0) {
            bArr[i + i3] = UTF8.S_P3A;
            i3--;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m5800(String str) throws IOException {
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length % 2 == 1) {
            throw new IOException("Corrupted TAR archive. Bad format in GNU.sparse.map PAX Header");
        }
        for (int i = 0; i < strArrSplit.length; i += 2) {
            long jM53569 = C24014.m53569(strArrSplit[i]);
            if (jM53569 < 0) {
                throw new IOException("Corrupted TAR archive. Sparse struct offset contains negative value");
            }
            long jM535610 = C24014.m53569(strArrSplit[i + 1]);
            if (jM535610 < 0) {
                throw new IOException("Corrupted TAR archive. Sparse struct numbytes contains negative value");
            }
            arrayList.add(new C19538(jM53569, jM535610));
        }
        return C4681.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m5797(byte[] bArr, int i, int i2, InterfaceC24760 interfaceC24760) {
        int i3 = 0;
        for (int i4 = i; i3 < i2 && bArr[i4] != 0; i4++) {
            i3++;
        }
        return i3 > 0 ? interfaceC24760.mo28621(i, i3, bArr) : "";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m5796(int i, int i2, byte[] bArr) {
        int i3 = i + i2;
        if (i2 < 2) {
            throw new IllegalArgumentException(C14442.m34864(i2, "Length ", " must be at least 2"));
        }
        long j = 0;
        if (bArr[i] == 0) {
            return 0L;
        }
        int i4 = i;
        while (i4 < i3 && bArr[i4] == 32) {
            i4++;
        }
        byte b = bArr[i3 - 1];
        while (i4 < i3 && (b == 0 || b == 32)) {
            b = bArr[i3 - 2];
            i3--;
        }
        while (i4 < i3) {
            byte b2 = bArr[i4];
            if (b2 < 48 || b2 > 55) {
                String strReplace = new String(bArr, i, i2, Charset.defaultCharset()).replace(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, "{NUL}");
                StringBuilder sbM12235 = C3769.m12235(b2, "Invalid byte ", " at offset ");
                sbM12235.append(i4 - i);
                sbM12235.append(" in '");
                sbM12235.append(strReplace);
                sbM12235.append("' len=");
                sbM12235.append(i2);
                throw new IllegalArgumentException(sbM12235.toString());
            }
            j = (j << 3) + ((long) (b2 - 48));
            i4++;
        }
        return j;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long m5804(int i, int i2, byte[] bArr) {
        byte b = bArr[i];
        if ((b & GCMSIVBlockCipher.MASK) == 0) {
            return m5796(i, i2, bArr);
        }
        boolean z = b == -1;
        if (i2 < 9) {
            if (i2 >= 9) {
                throw new IllegalArgumentException(C0703.m3016("At offset ", i, ", ", " byte binary number exceeds maximum signed long value", i2));
            }
            long jPow = 0;
            for (int i3 = 1; i3 < i2; i3++) {
                jPow = (jPow << 8) + ((long) (bArr[i + i3] & 255));
            }
            if (z) {
                jPow = (jPow - 1) ^ (((long) Math.pow(2.0d, ((double) (i2 - 1)) * 8.0d)) - 1);
            }
            return z ? -jPow : jPow;
        }
        int i4 = i2 - 1;
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, i + 1, bArr2, 0, i4);
        BigInteger bigInteger = new BigInteger(bArr2);
        if (z) {
            bigInteger = bigInteger.add(BigInteger.valueOf(-1L)).not();
        }
        if (bigInteger.bitLength() > 63) {
            throw new IllegalArgumentException(C0703.m3016("At offset ", i, ", ", " byte binary number exceeds maximum signed long value", i2));
        }
        long jLongValue = bigInteger.longValue();
        return z ? -jLongValue : jLongValue;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m5798(InputStream inputStream, int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        long[] jArrM5802 = m5802(inputStream);
        long j = jArrM5802[0];
        if (j < 0) {
            throw new IOException("Corrupted TAR archive. Negative value in sparse headers block");
        }
        long j2 = jArrM5802[1];
        while (true) {
            long j3 = j - 1;
            if (j > 0) {
                long[] jArrM5803 = m5802(inputStream);
                long j4 = jArrM5803[0];
                if (j4 < 0) {
                    throw new IOException("Corrupted TAR archive. Sparse header block offset contains negative value");
                }
                long j5 = j2 + jArrM5803[1];
                long[] jArrM5804 = m5802(inputStream);
                long j6 = jArrM5804[0];
                if (j6 < 0) {
                    throw new IOException("Corrupted TAR archive. Sparse header block numbytes contains negative value");
                }
                j2 = j5 + jArrM5804[1];
                arrayList.add(new C19538(j4, j6));
                j = j3;
            } else {
                long j7 = i;
                C5125.m15488((j7 - (j2 % j7)) % j7, inputStream);
                return arrayList;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HashMap m5799(InputStream inputStream, ArrayList arrayList, HashMap map, long j) throws IOException {
        int i;
        int i2;
        int i3;
        long j2;
        HashMap map2 = new HashMap(map);
        int i4 = 0;
        Long lValueOf = null;
        do {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                i = inputStream.read();
                int i7 = -1;
                long j3 = 0;
                if (i != -1) {
                    i5++;
                    i4++;
                    if (i == 10) {
                        i2 = -1;
                        break;
                    }
                    if (i == 32) {
                        C13087 c13087 = new C13087();
                        while (true) {
                            i3 = inputStream.read();
                            if (i3 != i7) {
                                i5++;
                                i4++;
                                if (i4 >= 0 && (j < j3 || i4 < j)) {
                                    if (i3 == 61) {
                                        Charset charset = StandardCharsets.UTF_8;
                                        String str = new String(c13087.mo32557(), charset);
                                        int i8 = i6 - i5;
                                        if (i8 > 1) {
                                            if (j >= j3 && i8 > j - ((long) i4)) {
                                                throw new IOException(C14442.m34864(i8, "Paxheader value size ", " exceeds size of header record"));
                                            }
                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                            C5125.m15495(inputStream, byteArrayOutputStream, i8);
                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                            int length = byteArray.length;
                                            if (length != i8) {
                                                throw new IOException(C6934.m19217("Failed to read Paxheader. Expected ", i8, length, " bytes, read "));
                                            }
                                            i4 += i8;
                                            int i9 = i8 - 1;
                                            if (byteArray[i9] != 10) {
                                                throw new IOException("Failed to read Paxheader.Value should end with a newline");
                                            }
                                            String str2 = new String(byteArray, 0, i9, charset);
                                            map2.put(str, str2);
                                            if (str.equals("GNU.sparse.offset")) {
                                                if (lValueOf != null) {
                                                    j2 = 0;
                                                    arrayList.add(new C19538(lValueOf.longValue(), 0L));
                                                } else {
                                                    j2 = 0;
                                                }
                                                try {
                                                    lValueOf = Long.valueOf(str2);
                                                    if (lValueOf.longValue() < j2) {
                                                        throw new IOException("Failed to read Paxheader.GNU.sparse.offset contains negative value");
                                                    }
                                                } catch (NumberFormatException unused) {
                                                    throw new IOException("Failed to read Paxheader.GNU.sparse.offset contains a non-numeric value");
                                                }
                                            }
                                            if (!str.equals("GNU.sparse.numbytes")) {
                                                break;
                                            }
                                            if (lValueOf == null) {
                                                throw new IOException("Failed to read Paxheader.GNU.sparse.offset is expected before GNU.sparse.numbytes shows up.");
                                            }
                                            long jM53569 = C24014.m53569(str2);
                                            if (jM53569 < 0) {
                                                throw new IOException("Failed to read Paxheader.GNU.sparse.numbytes contains negative value");
                                            }
                                            arrayList.add(new C19538(lValueOf.longValue(), jM53569));
                                            lValueOf = null;
                                            break;
                                        }
                                        map2.remove(str);
                                    } else {
                                        c13087.write((byte) i3);
                                        i7 = -1;
                                        j3 = 0;
                                    }
                                }
                            }
                            break;
                        }
                        i = i3;
                    } else {
                        if (i < 48 || i > 57) {
                            throw new IOException("Failed to read Paxheader. Encountered a non-number while reading length");
                        }
                        i6 = (i6 * 10) + (i - 48);
                    }
                }
                i2 = -1;
                break;
            }
        } while (i != i2);
        if (lValueOf != null) {
            arrayList.add(new C19538(lValueOf.longValue(), 0L));
        }
        return map2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long[] m5802(InputStream inputStream) throws IOException {
        long j = 0;
        long j2 = 0;
        while (true) {
            int i = inputStream.read();
            if (i == 10) {
                return new long[]{j2, j + 1};
            }
            j++;
            if (i == -1) {
                throw new IOException("Unexpected EOF when reading parse information of 1.X PAX format");
            }
            if (i < 48 || i > 57) {
                throw new IOException("Corrupted TAR archive. Non-numeric value in sparse headers block");
            }
            j2 = (j2 * 10) + ((long) (i - 48));
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static List m5803(int i, int i2, byte[] bArr) throws IOException {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = (i3 * 24) + i;
            try {
                C19538 c19538 = new C19538(m5804(i4, 12, bArr), m5804(i4 + 12, 12, bArr));
                if (c19538.m45070() < 0) {
                    throw new IOException("Corrupted TAR archive, sparse entry with negative offset");
                }
                if (c19538.m45069() < 0) {
                    throw new IOException("Corrupted TAR archive, sparse entry with negative numbytes");
                }
                arrayList.add(c19538);
            } catch (IllegalArgumentException e) {
                throw new IOException("Corrupted TAR archive, sparse entry is invalid", e);
            }
        }
        return C4681.unmodifiableList(arrayList);
    }
}
