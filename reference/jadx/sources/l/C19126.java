package l;

import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ᩳܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V42A */
/* JADX INFO: loaded from: classes4.dex */
public final class C19126 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC5878 f61895;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f61896;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f61897;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f61898;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f61899;

    public C19126(InterfaceC5878 interfaceC5878) {
        this.f61895 = interfaceC5878;
    }

    public C19126(InterfaceC5878 interfaceC5878, String str, int i, String str2) {
        this.f61895 = interfaceC5878;
        this.f61896 = (str.length() > 15 ? str.substring(0, 15) : str).toUpperCase();
        this.f61898 = i;
        if (str2 == null || str2.length() <= 0) {
            interfaceC5878.getClass();
            str2 = null;
        }
        this.f61899 = str2;
        this.f61897 = 0;
    }

    public C19126(InterfaceC5878 interfaceC5878, C19126 c19126) {
        this.f61895 = interfaceC5878;
        this.f61896 = c19126.f61896;
        this.f61898 = c19126.f61898;
        this.f61899 = c19126.f61899;
        this.f61897 = c19126.f61897;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44256() {
        return "0.0.0.0".equals(this.f61896) && this.f61898 == 0 && this.f61899 == null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m44257(int i, byte[] bArr) {
        int length;
        bArr[i] = UTF8.S_CS3;
        String str = this.f61896;
        InterfaceC5878 interfaceC5878 = this.f61895;
        byte[] bArrM53452 = C23933.m53452(str, interfaceC5878);
        int i2 = 0;
        while (i2 < bArrM53452.length) {
            int i3 = i2 * 2;
            bArr[i3 + 1 + i] = (byte) (((bArrM53452[i2] & 240) >> 4) + 65);
            bArr[i3 + 2 + i] = (byte) ((15 & bArrM53452[i2]) + 65);
            i2++;
        }
        while (i2 < 15) {
            int i4 = i2 * 2;
            bArr[i4 + 1 + i] = 67;
            bArr[i4 + 2 + i] = 65;
            i2++;
        }
        int i5 = this.f61898;
        bArr[i + 31] = (byte) (((i5 & 240) >> 4) + 65);
        bArr[i + 32] = (byte) ((i5 & 15) + 65);
        int i6 = i + 33;
        String str2 = this.f61899;
        if (str2 == null) {
            bArr[i6] = 0;
            length = 1;
        } else {
            int i7 = i + 34;
            bArr[i6] = 46;
            System.arraycopy(C23933.m53452(str2, interfaceC5878), 0, bArr, i7, this.f61899.length());
            int length2 = this.f61899.length() + i7;
            bArr[length2] = 0;
            int i8 = length2 - 1;
            int length3 = i8 - this.f61899.length();
            int i9 = 0;
            while (true) {
                if (bArr[i8] == 46) {
                    bArr[i8] = (byte) i9;
                    i9 = 0;
                } else {
                    i9++;
                }
                int i10 = i8 - 1;
                if (i8 <= length3) {
                    break;
                }
                i8 = i10;
            }
            length = this.f61899.length() + 2;
        }
        return length + 33;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m44255(int i, byte[] bArr) {
        int i2;
        byte[] bArr2 = new byte[33];
        int i3 = 15;
        for (int i4 = 0; i4 < 15; i4++) {
            int i5 = i4 * 2;
            byte b = (byte) (((bArr[(i5 + 1) + i] & 255) - 65) << 4);
            bArr2[i4] = b;
            byte b2 = (byte) (((byte) (((bArr[(i5 + 2) + i] & 255) - 65) & 15)) | b);
            bArr2[i4] = b2;
            if (b2 != 32) {
                i3 = i4 + 1;
            }
        }
        InterfaceC5878 interfaceC5878 = this.f61895;
        this.f61896 = C23933.m53450(bArr2, 0, i3, interfaceC5878);
        int i6 = ((bArr[i + 31] & 255) - 65) << 4;
        this.f61898 = i6;
        this.f61898 = i6 | (15 & ((bArr[i + 32] & 255) - 65));
        int i7 = i + 33;
        int i8 = i + 34;
        int i9 = bArr[i7] & 255;
        if (i9 == 0) {
            this.f61899 = null;
            i2 = 1;
        } else {
            StringBuffer stringBuffer = new StringBuffer(C23933.m53450(bArr, i8, i9, interfaceC5878));
            while (true) {
                int i10 = i8 + i9;
                i9 = i10 + 1;
                i8 = bArr[i10] & 255;
                if (i8 == 0) {
                    break;
                }
                stringBuffer.append('.');
                stringBuffer.append(C23933.m53450(bArr, i9, i8, interfaceC5878));
            }
            this.f61899 = stringBuffer.toString();
            i2 = i9 - i7;
        }
        return i2 + 33;
    }

    public final int hashCode() {
        int iHashCode = (this.f61897 * 65599) + (this.f61898 * 65599) + this.f61896.hashCode();
        String str = this.f61899;
        return (str == null || str.length() == 0) ? iHashCode : this.f61899.hashCode() + iHashCode;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19126)) {
            return false;
        }
        C19126 c19126 = (C19126) obj;
        if (this.f61899 == null && c19126.f61899 == null) {
            return this.f61896.equals(c19126.f61896) && this.f61898 == c19126.f61898;
        }
        return this.f61896.equals(c19126.f61896) && this.f61898 == c19126.f61898 && this.f61899.equals(c19126.f61899);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = this.f61896;
        if (str == null) {
            str = "null";
        } else if (str.charAt(0) == 1) {
            char[] charArray = str.toCharArray();
            charArray[0] = '.';
            charArray[1] = '.';
            charArray[14] = '.';
            str = new String(charArray);
        }
        stringBuffer.append(str);
        stringBuffer.append("<");
        stringBuffer.append(C6033.m17503(this.f61898, 2));
        stringBuffer.append(">");
        if (this.f61899 != null) {
            stringBuffer.append(".");
            stringBuffer.append(this.f61899);
        }
        return stringBuffer.toString();
    }
}
