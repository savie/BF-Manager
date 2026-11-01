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

/* JADX INFO: renamed from: l.᩻ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AHH */
/* JADX INFO: loaded from: classes.dex */
public final class C23455 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f75961 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC1581 f75962 = AbstractC9344.m23996(Charset.defaultCharset());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m51691(String str, byte[] bArr, int i, int i2, InterfaceC1581 interfaceC1581) {
        byte[] bArrMo5389 = interfaceC1581.mo5389(str);
        while (bArrMo5389.length > i2) {
            str = C20630.m46498(1, 0, str);
            bArrMo5389 = interfaceC1581.mo5389(str);
        }
        System.arraycopy(bArrMo5389, 0, bArr, i, bArrMo5389.length);
        for (int length = bArrMo5389.length; length < i2; length++) {
            bArr[i + length] = 0;
        }
        return i + i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51697(long j, byte[] bArr, int i, int i2) {
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
    public static List m51696(String str) throws IOException {
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length % 2 == 1) {
            throw new IOException("Corrupted TAR archive. Bad format in GNU.sparse.map PAX Header");
        }
        for (int i = 0; i < strArrSplit.length; i += 2) {
            long jM3721 = C0958.m3721(strArrSplit[i]);
            if (jM3721 < 0) {
                throw new IOException("Corrupted TAR archive. Sparse struct offset contains negative value");
            }
            long jM3722 = C0958.m3721(strArrSplit[i + 1]);
            if (jM3722 < 0) {
                throw new IOException("Corrupted TAR archive. Sparse struct numbytes contains negative value");
            }
            arrayList.add(new C16399(jM3721, jM3722));
        }
        return C0561.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m51693(byte[] bArr, int i, int i2, InterfaceC1581 interfaceC1581) {
        int i3 = 0;
        for (int i4 = i; i3 < i2 && bArr[i4] != 0; i4++) {
            i3++;
        }
        return i3 > 0 ? interfaceC1581.mo5388(i, i3, bArr) : "";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m51692(int i, int i2, byte[] bArr) {
        int i3 = i + i2;
        if (i2 < 2) {
            throw new IllegalArgumentException(C2271.m6966(i2, "Length ", " must be at least 2"));
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
                StringBuilder sbM40153 = C17214.m40153(b2, "Invalid byte ", " at offset ");
                sbM40153.append(i4 - i);
                sbM40153.append(" in '");
                sbM40153.append(strReplace);
                sbM40153.append("' len=");
                sbM40153.append(i2);
                throw new IllegalArgumentException(sbM40153.toString());
            }
            j = (j << 3) + ((long) (b2 - 48));
            i4++;
        }
        return j;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static long m51700(int i, int i2, byte[] bArr) {
        byte b = bArr[i];
        if ((b & GCMSIVBlockCipher.MASK) == 0) {
            return m51692(i, i2, bArr);
        }
        boolean z = b == -1;
        if (i2 < 9) {
            if (i2 >= 9) {
                throw new IllegalArgumentException(C8015.m21119("At offset ", i, ", ", " byte binary number exceeds maximum signed long value", i2));
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
            throw new IllegalArgumentException(C8015.m21119("At offset ", i, ", ", " byte binary number exceeds maximum signed long value", i2));
        }
        long jLongValue = bigInteger.longValue();
        return z ? -jLongValue : jLongValue;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m51694(InputStream inputStream, int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        long[] jArrM51698 = m51698(inputStream);
        long j = jArrM51698[0];
        if (j < 0) {
            throw new IOException("Corrupted TAR archive. Negative value in sparse headers block");
        }
        long j2 = jArrM51698[1];
        while (true) {
            long j3 = j - 1;
            if (j > 0) {
                long[] jArrM51699 = m51698(inputStream);
                long j4 = jArrM51699[0];
                if (j4 < 0) {
                    throw new IOException("Corrupted TAR archive. Sparse header block offset contains negative value");
                }
                long j5 = j2 + jArrM51699[1];
                long[] jArrM516910 = m51698(inputStream);
                long j6 = jArrM516910[0];
                if (j6 < 0) {
                    throw new IOException("Corrupted TAR archive. Sparse header block numbytes contains negative value");
                }
                j2 = j5 + jArrM516910[1];
                arrayList.add(new C16399(j4, j6));
                j = j3;
            } else {
                long j7 = i;
                C20010.m45294((j7 - (j2 % j7)) % j7, inputStream);
                return arrayList;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HashMap m51695(InputStream inputStream, ArrayList arrayList, HashMap map, long j) throws IOException {
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
                        C14843 c14843 = new C14843();
                        while (true) {
                            i3 = inputStream.read();
                            if (i3 != i7) {
                                i5++;
                                i4++;
                                if (i4 >= 0 && (j < j3 || i4 < j)) {
                                    if (i3 == 61) {
                                        Charset charset = StandardCharsets.UTF_8;
                                        String str = new String(c14843.mo35530(), charset);
                                        int i8 = i6 - i5;
                                        if (i8 > 1) {
                                            if (j >= j3 && i8 > j - ((long) i4)) {
                                                throw new IOException(C2271.m6966(i8, "Paxheader value size ", " exceeds size of header record"));
                                            }
                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                            C20010.m45300(inputStream, byteArrayOutputStream, i8);
                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                            int length = byteArray.length;
                                            if (length != i8) {
                                                throw new IOException(C2271.m6967("Failed to read Paxheader. Expected ", i8, length, " bytes, read "));
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
                                                    arrayList.add(new C16399(lValueOf.longValue(), 0L));
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
                                            long jM3721 = C0958.m3721(str2);
                                            if (jM3721 < 0) {
                                                throw new IOException("Failed to read Paxheader.GNU.sparse.numbytes contains negative value");
                                            }
                                            arrayList.add(new C16399(lValueOf.longValue(), jM3721));
                                            lValueOf = null;
                                            break;
                                        }
                                        map2.remove(str);
                                    } else {
                                        c14843.write((byte) i3);
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
            arrayList.add(new C16399(lValueOf.longValue(), 0L));
        }
        return map2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long[] m51698(InputStream inputStream) throws IOException {
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

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static List m51699(int i, int i2, byte[] bArr) throws IOException {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = (i3 * 24) + i;
            try {
                C16399 c16399 = new C16399(m51700(i4, 12, bArr), m51700(i4 + 12, 12, bArr));
                if (c16399.m38605() < 0) {
                    throw new IOException("Corrupted TAR archive, sparse entry with negative offset");
                }
                if (c16399.m38604() < 0) {
                    throw new IOException("Corrupted TAR archive, sparse entry with negative numbytes");
                }
                arrayList.add(c16399);
            } catch (IllegalArgumentException e) {
                throw new IOException("Corrupted TAR archive, sparse entry is invalid", e);
            }
        }
        return C0561.unmodifiableList(arrayList);
    }
}
