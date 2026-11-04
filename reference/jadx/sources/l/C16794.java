package l;

import com.google.android.material.motion.MotionUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ܺۧۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4D9 */
/* JADX INFO: loaded from: classes4.dex */
public class C16794 implements Serializable, Comparable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f54181;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient String f54182;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient int f54183;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final char[] f54180 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C16794 f54179 = m39649(new byte[0]);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C16794 m39653(String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        if (charset != null) {
            return new C16794(str.getBytes(charset));
        }
        throw new IllegalArgumentException("charset == null");
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d7 A[RETURN] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16794 m39648(String str) {
        int i;
        char cCharAt;
        if (str != null) {
            int length = str.length();
            while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
                length--;
            }
            int i2 = (int) ((((long) length) * 6) / 8);
            byte[] bArr = new byte[i2];
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                if (i3 < length) {
                    char cCharAt2 = str.charAt(i3);
                    if (cCharAt2 >= 'A' && cCharAt2 <= 'Z') {
                        i = cCharAt2 - 'A';
                    } else if (cCharAt2 >= 'a' && cCharAt2 <= 'z') {
                        i = cCharAt2 - 'G';
                    } else if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                        i = cCharAt2 + 4;
                    } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                        i = 62;
                    } else {
                        if (cCharAt2 != '/' && cCharAt2 != '_') {
                            if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                                break;
                            }
                        } else {
                            i = 63;
                        }
                        i3++;
                    }
                    i5 = (i5 << 6) | ((byte) i);
                    i4++;
                    if (i4 % 4 == 0) {
                        bArr[i6] = (byte) (i5 >> 16);
                        int i7 = i6 + 2;
                        bArr[i6 + 1] = (byte) (i5 >> 8);
                        i6 += 3;
                        bArr[i7] = (byte) i5;
                    }
                    i3++;
                } else {
                    int i8 = i4 % 4;
                    if (i8 == 1) {
                        break;
                    }
                    if (i8 == 2) {
                        bArr[i6] = (byte) ((i5 << 12) >> 16);
                        i6++;
                    } else if (i8 == 3) {
                        int i9 = i5 << 6;
                        int i10 = i6 + 1;
                        bArr[i6] = (byte) (i9 >> 16);
                        i6 += 2;
                        bArr[i10] = (byte) (i9 >> 8);
                    }
                    if (i6 != i2) {
                        byte[] bArr2 = new byte[i6];
                        System.arraycopy(bArr, 0, bArr2, 0, i6);
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        return new C16794(bArr);
                    }
                    return null;
                }
            }
            bArr = null;
            if (bArr != null) {
                return new C16794(bArr);
            }
            return null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C16794 c16794 = (C16794) obj;
        int iMo23081 = mo23081();
        int iMo23082 = c16794.mo23081();
        int iMin = Math.min(iMo23081, iMo23082);
        for (int i = 0; i < iMin; i++) {
            int iMo23083 = mo23082(i) & 255;
            int iMo23084 = c16794.mo23082(i) & 255;
            if (iMo23083 != iMo23084) {
                return iMo23083 < iMo23084 ? -1 : 1;
            }
        }
        if (iMo23081 == iMo23082) {
            return 0;
        }
        return iMo23081 < iMo23082 ? -1 : 1;
    }

    public C16794(byte[] bArr) {
        this.f54181 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16794 m39649(byte... bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("data == null");
        }
        return new C16794((byte[]) bArr.clone());
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C16794 m39651(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        C16794 c16794 = new C16794(str.getBytes(C11222.f35388));
        c16794.f54182 = str;
        return c16794;
    }

    /* JADX INFO: renamed from: ᩹ */
    public String mo23092() {
        String str = this.f54182;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f54181, C11222.f35388);
        this.f54182 = str2;
        return str2;
    }

    /* JADX INFO: renamed from: ۙ */
    public String mo23083() {
        return C13065.m32547(this.f54181);
    }

    /* JADX INFO: renamed from: ᩴ */
    public C16794 mo23090() {
        return m39650("MD5");
    }

    /* JADX INFO: renamed from: ۫ */
    public C16794 mo23088() {
        return m39650(XMSSKeyParameters.SHA_256);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private C16794 m39650(String str) {
        try {
            return m39649(MessageDigest.getInstance(str).digest(this.f54181));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ᩸ */
    public String mo23091() {
        byte[] bArr = this.f54181;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f54180;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C16794 m39652(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str));
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((m39647(str.charAt(i2)) << 4) + m39647(str.charAt(i2 + 1)));
        }
        return m39649(bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m39647(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c >= 'A' && c <= 'F') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    /* JADX INFO: renamed from: ᩻ */
    public C16794 mo23093() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f54181;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b + UTF8.S_CS3);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i2] = (byte) (b2 + UTF8.S_CS3);
                    }
                }
                return new C16794(bArr2);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public C16794 mo23087() {
        byte[] bArr = this.f54181;
        if (64 > bArr.length) {
            throw new IllegalArgumentException(C12669.m31437(this.f54181.length, MotionUtils.EASING_TYPE_FORMAT_END, new StringBuilder("endIndex > length(")));
        }
        if (64 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, 64);
        return new C16794(bArr2);
    }

    /* JADX INFO: renamed from: ۙ */
    public byte mo23082(int i) {
        return this.f54181[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public int mo23081() {
        return this.f54181.length;
    }

    /* JADX INFO: renamed from: ܺ */
    public byte[] mo23089() {
        return (byte[]) this.f54181.clone();
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo23084(C1879 c1879) {
        byte[] bArr = this.f54181;
        c1879.write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo23086(C16794 c16794, int i) {
        return c16794.mo23085(0, this.f54181, 0, i);
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo23085(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.f54181;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
                Charset charset = C11222.f35388;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (bArr2[i4 + i] == bArr[i4 + i2]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C16794) {
            C16794 c16794 = (C16794) obj;
            int iMo23081 = c16794.mo23081();
            byte[] bArr = this.f54181;
            if (iMo23081 == bArr.length && c16794.mo23085(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f54183;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f54181);
        this.f54183 = iHashCode;
        return iHashCode;
    }

    public String toString() {
        if (this.f54181.length == 0) {
            return "[size=0]";
        }
        String strMo23092 = mo23092();
        int length = strMo23092.length();
        int length2 = 0;
        int i = 0;
        while (true) {
            if (length2 >= length) {
                length2 = strMo23092.length();
                break;
            }
            if (i != 64) {
                int iCodePointAt = strMo23092.codePointAt(length2);
                if ((Character.isISOControl(iCodePointAt) && iCodePointAt != 10 && iCodePointAt != 13) || iCodePointAt == 65533) {
                    length2 = -1;
                    break;
                }
                i++;
                length2 += Character.charCount(iCodePointAt);
            } else {
                break;
            }
        }
        if (length2 != -1) {
            String strReplace = strMo23092.substring(0, length2).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (length2 >= strMo23092.length()) {
                return C14442.m34865("[text=", strReplace, "]");
            }
            return "[size=" + this.f54181.length + " text=" + strReplace + "…]";
        }
        if (this.f54181.length <= 64) {
            return "[hex=" + mo23091() + "]";
        }
        return "[size=" + this.f54181.length + " hex=" + mo23087().mo23091() + "…]";
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new IllegalArgumentException(C13645.m33382(i, "byteCount < 0: "));
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = objectInputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        C16794 c16794 = new C16794(bArr);
        try {
            Field declaredField = C16794.class.getDeclaredField("ܰ");
            declaredField.setAccessible(true);
            declaredField.set(this, c16794.f54181);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (NoSuchFieldException unused2) {
            throw new AssertionError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f54181.length);
        objectOutputStream.write(this.f54181);
    }
}
