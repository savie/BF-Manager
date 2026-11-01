package l;

import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.bo;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Vector;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.util.encoders.Base32Encoder;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.۠᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R5PD */
/* JADX INFO: loaded from: classes3.dex */
public final class C8491 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f29421;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final byte[] f29422;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String[] f29423;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m22167(byte b) {
        if (((byte) (b & GCMSIVBlockCipher.MASK)) == 0) {
            return 1;
        }
        if (((byte) (b & bo.k)) == -64) {
            return 2;
        }
        return ((byte) (b & 240)) == -32 ? 3 : 1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static byte m22181(byte b) {
        if (b == 61) {
            return (byte) 0;
        }
        int i = 0;
        while (true) {
            byte[] bArr = f29421;
            if (i >= bArr.length) {
                return (byte) 0;
            }
            if (b == bArr[i]) {
                return (byte) i;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static byte[] m22184(int i, int i2, byte[] bArr) throws C5813 {
        try {
            byte[] bArr2 = new byte[i2];
            int i3 = 0;
            for (int i4 = i; i4 < i + i2; i4 += 4) {
                int i5 = i4 + 1;
                bArr2[i3] = (byte) ((m22181(bArr[i4]) << 2) | ((m22181(bArr[i5]) & UTF8.S_P3A) >>> 4));
                int i6 = i4 + 2;
                if (bArr[i6] == 61) {
                    i3++;
                    break;
                }
                bArr2[i3 + 1] = (byte) (((m22181(bArr[i5]) & 15) << 4) | ((m22181(bArr[i6]) & 60) >>> 2));
                int i7 = i4 + 3;
                if (bArr[i7] == 61) {
                    i3 += 2;
                    break;
                }
                bArr2[i3 + 2] = (byte) (((m22181(bArr[i6]) & 3) << 6) | (m22181(bArr[i7]) & 63));
                i3 += 3;
            }
            byte[] bArr3 = new byte[i3];
            System.arraycopy(bArr2, 0, bArr3, 0, i3);
            return bArr3;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C5813("fromBase64: invalid base64 data", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x007d A[PHI: r11
      0x007d: PHI (r11v12 int) = (r11v11 int), (r11v17 int) binds: [B:14:0x00ad, B:9:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m22176(byte[] bArr, int i, boolean z) {
        byte[] bArr2;
        int i2;
        byte[] bArr3 = new byte[i * 2];
        int i3 = (i / 3) * 3;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            bArr2 = f29421;
            if (i4 >= i3) {
                break;
            }
            bArr3[i5] = bArr2[(bArr[i4] >>> 2) & 63];
            int i6 = i4 + 1;
            bArr3[i5 + 1] = bArr2[((bArr[i4] & 3) << 4) | ((bArr[i6] >>> 4) & 15)];
            int i7 = i4 + 2;
            int i8 = ((bArr[i6] & 15) << 2) | ((bArr[i7] >>> 6) & 3);
            int i9 = i5 + 3;
            bArr3[i5 + 2] = bArr2[i8];
            i5 += 4;
            bArr3[i9] = bArr2[bArr[i7] & 63];
            i4 += 3;
        }
        int i10 = i - i3;
        if (i10 == 1) {
            bArr3[i5] = bArr2[(bArr[i4] >>> 2) & 63];
            i2 = i5 + 2;
            bArr3[i5 + 1] = bArr2[((bArr[i4] & 3) << 4) & 63];
            if (z) {
                int i11 = i5 + 3;
                bArr3[i2] = Base32Encoder.DEFAULT_PADDING;
                i5 += 4;
                bArr3[i11] = Base32Encoder.DEFAULT_PADDING;
            } else {
                i5 = i2;
            }
        } else if (i10 == 2) {
            bArr3[i5] = bArr2[(bArr[i4] >>> 2) & 63];
            int i12 = (bArr[i4] & 3) << 4;
            int i13 = i4 + 1;
            bArr3[i5 + 1] = bArr2[i12 | ((bArr[i13] >>> 4) & 15)];
            i2 = i5 + 3;
            bArr3[i5 + 2] = bArr2[((bArr[i13] & 15) << 2) & 63];
            if (z) {
                i5 += 4;
                bArr3[i2] = Base32Encoder.DEFAULT_PADDING;
            } else {
                i5 = i2;
            }
        }
        byte[] bArr4 = new byte[i5];
        System.arraycopy(bArr3, 0, bArr4, 0, i5);
        return bArr4;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m22180(byte[] bArr, byte[] bArr2) {
        if (bArr2.length > 0 && bArr2[0] == 46) {
            if (bArr.length <= 0 || bArr[0] != 46) {
                return false;
            }
            if (bArr.length == 2 && bArr[1] == 42) {
                return true;
            }
            return m22173(1, 1, bArr, bArr2);
        }
        return m22173(0, 0, bArr, bArr2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22173(int i, int i2, byte[] bArr, byte[] bArr2) {
        byte b;
        int iM22167;
        int length = bArr.length;
        if (length == 0) {
            return false;
        }
        int length2 = bArr2.length;
        while (i < length && i2 < length2) {
            byte b2 = bArr[i];
            if (b2 == 92) {
                int i3 = i + 1;
                if (i3 == length || (b = bArr[i3]) != bArr2[i2]) {
                    return false;
                }
                i = i3 + m22167(b);
                iM22167 = m22167(bArr2[i2]);
            } else {
                if (b2 == 42) {
                    while (i < length && bArr[i] == 42) {
                        i++;
                    }
                    if (length == i) {
                        return true;
                    }
                    byte b3 = bArr[i];
                    if (b3 == 63) {
                        while (i2 < length2) {
                            if (m22173(i, i2, bArr, bArr2)) {
                                return true;
                            }
                            i2 += m22167(bArr2[i2]);
                        }
                        return false;
                    }
                    if (b3 != 92) {
                        while (i2 < length2) {
                            if (b3 == bArr2[i2] && m22173(i, i2, bArr, bArr2)) {
                                return true;
                            }
                            i2 += m22167(bArr2[i2]);
                        }
                        return false;
                    }
                    int i4 = i + 1;
                    if (i4 == length) {
                        return false;
                    }
                    byte b4 = bArr[i4];
                    while (i2 < length2) {
                        if (b4 == bArr2[i2] && m22173(m22167(b4) + i4, m22167(bArr2[i2]) + i2, bArr, bArr2)) {
                            return true;
                        }
                        i2 += m22167(bArr2[i2]);
                    }
                    return false;
                }
                if (b2 == 63) {
                    i++;
                    iM22167 = m22167(bArr2[i2]);
                } else {
                    if (b2 != bArr2[i2]) {
                        return false;
                    }
                    i += m22167(b2);
                    i2 += m22167(bArr2[i2]);
                    if (i2 < length2) {
                        continue;
                    } else {
                        if (i >= length) {
                            return true;
                        }
                        if (bArr[i] == 42) {
                            break;
                        }
                    }
                }
            }
            i2 += iM22167;
        }
        if (i == length && i2 == length2) {
            return true;
        }
        if (i2 < length2 || bArr[i] != 42) {
            return false;
        }
        while (i < length) {
            int i5 = i + 1;
            if (bArr[i] != 42) {
                return false;
            }
            i = i5;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static byte[] m22166(byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            if (bArr[i] == 92) {
                int i2 = i + 1;
                if (i2 == length) {
                    break;
                }
                System.arraycopy(bArr, i2, bArr, i, bArr.length - i2);
                length--;
                i = i2;
            } else {
                i++;
            }
        }
        if (length == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m22170(InterfaceC21335 interfaceC21335, byte[] bArr) {
        try {
            interfaceC21335.init();
            interfaceC21335.mo3065(bArr.length, bArr);
            byte[] bArrMo3066 = interfaceC21335.mo3066();
            StringBuilder sb = new StringBuilder();
            sb.append(interfaceC21335.name());
            sb.append(":");
            int i = 0;
            if (interfaceC21335.name().equals("MD5")) {
                while (i < bArrMo3066.length) {
                    byte b = bArrMo3066[i];
                    String[] strArr = f29423;
                    sb.append(strArr[((b & 255) >>> 4) & 15]);
                    sb.append(strArr[b & 15]);
                    i++;
                    if (i < bArrMo3066.length) {
                        sb.append(":");
                    }
                }
            } else {
                byte[] bArrM22176 = m22176(bArrMo3066, bArrMo3066.length, false);
                sb.append(m22168(0, bArrM22176.length, bArrM22176));
            }
            return sb.toString();
        } catch (Exception unused) {
            return "???";
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22174(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Socket m22172(int i, int i2, String str) throws C5813 {
        Socket socket = new Socket();
        try {
            socket.connect(new InetSocketAddress(str, i), i2);
            return socket;
        } catch (Exception e) {
            try {
                socket.close();
            } catch (Exception unused) {
            }
            throw new C5813(e instanceof SocketTimeoutException ? "timeout: socket is not established" : e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m22175(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        return str.getBytes(charset);
    }

    static {
        Charset charset = StandardCharsets.UTF_8;
        f29421 = m22175("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=", charset);
        f29423 = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", am.av, "b", am.aF, "d", "e", "f"};
        f29422 = m22175("", charset);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String[] m22177(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        Vector vector = new Vector();
        int i = 0;
        while (true) {
            int iIndexOf = str.indexOf(",", i);
            if (iIndexOf < 0) {
                break;
            }
            vector.addElement(m22168(i, iIndexOf - i, bytes));
            i = iIndexOf + 1;
        }
        vector.addElement(m22168(i, bytes.length - i, bytes));
        int size = vector.size();
        String[] strArr = new String[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = (String) vector.elementAt(i2);
        }
        return strArr;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m22178(String str) {
        Charset charset = StandardCharsets.UTF_8;
        byte[] bArrM22175 = m22175(str, charset);
        byte[] bArrM22166 = m22166(bArrM22175);
        return bArrM22175.length == bArrM22166.length ? str : new String(bArrM22166, 0, bArrM22166.length, charset);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static byte[] m22185(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m22171(byte[] bArr) {
        return new String(bArr, 0, bArr.length, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m22168(int i, int i2, byte[] bArr) {
        return new String(bArr, i, i2, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m22179(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < bArr.length) {
            String hexString = Integer.toHexString(bArr[i] & 255);
            StringBuilder sb2 = new StringBuilder("0x");
            sb2.append(hexString.length() == 1 ? "0" : "");
            sb2.append(hexString);
            sb.append(sb2.toString());
            i++;
            if (i < bArr.length) {
                sb.append(":");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m22182(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m22169(String str, String[] strArr) {
        String[] strArrM22177 = m22177(str);
        String string = null;
        for (int i = 0; i < strArrM22177.length; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= strArr.length) {
                    if (string != null) {
                        StringBuilder sbM8976 = C3012.m8976(string, ",");
                        sbM8976.append(strArrM22177[i]);
                        string = sbM8976.toString();
                        break;
                    }
                    string = strArrM22177[i];
                    break;
                }
                if (strArrM22177[i].equals(strArr[i2])) {
                    break;
                }
                i2++;
            }
        }
        return string;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m22183(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        return i == 0;
    }
}
