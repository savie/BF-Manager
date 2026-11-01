package l;

import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۨ᩵۠, reason: contains not printable characters */
/* JADX INFO: compiled from: V42A */
/* JADX INFO: loaded from: classes3.dex */
public final class C11907 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f39947;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC10601 f39948;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f39949;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f39950;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f39951;

    public C11907(InterfaceC10601 interfaceC10601) {
        this.f39948 = interfaceC10601;
    }

    public C11907(InterfaceC10601 interfaceC10601, String str, int i, String str2) {
        this.f39948 = interfaceC10601;
        this.f39950 = (str.length() > 15 ? str.substring(0, 15) : str).toUpperCase();
        this.f39951 = i;
        if (str2 == null || str2.length() <= 0) {
            interfaceC10601.getClass();
            str2 = null;
        }
        this.f39947 = str2;
        this.f39949 = 0;
    }

    public C11907(InterfaceC10601 interfaceC10601, C11907 c11907) {
        this.f39948 = interfaceC10601;
        this.f39950 = c11907.f39950;
        this.f39951 = c11907.f39951;
        this.f39947 = c11907.f39947;
        this.f39949 = c11907.f39949;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29701() {
        return "0.0.0.0".equals(this.f39950) && this.f39951 == 0 && this.f39947 == null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m29702(int i, byte[] bArr) {
        int length;
        bArr[i] = UTF8.S_CS3;
        String str = this.f39950;
        InterfaceC10601 interfaceC10601 = this.f39948;
        byte[] bArrM27418 = C10933.m27418(str, interfaceC10601);
        int i2 = 0;
        while (i2 < bArrM27418.length) {
            int i3 = i2 * 2;
            bArr[i3 + 1 + i] = (byte) (((bArrM27418[i2] & 240) >> 4) + 65);
            bArr[i3 + 2 + i] = (byte) ((15 & bArrM27418[i2]) + 65);
            i2++;
        }
        while (i2 < 15) {
            int i4 = i2 * 2;
            bArr[i4 + 1 + i] = 67;
            bArr[i4 + 2 + i] = 65;
            i2++;
        }
        int i5 = this.f39951;
        bArr[i + 31] = (byte) (((i5 & 240) >> 4) + 65);
        bArr[i + 32] = (byte) ((i5 & 15) + 65);
        int i6 = i + 33;
        String str2 = this.f39947;
        if (str2 == null) {
            bArr[i6] = 0;
            length = 1;
        } else {
            int i7 = i + 34;
            bArr[i6] = 46;
            System.arraycopy(C10933.m27418(str2, interfaceC10601), 0, bArr, i7, this.f39947.length());
            int length2 = this.f39947.length() + i7;
            bArr[length2] = 0;
            int i8 = length2 - 1;
            int length3 = i8 - this.f39947.length();
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
            length = this.f39947.length() + 2;
        }
        return length + 33;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m29700(int i, byte[] bArr) {
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
        InterfaceC10601 interfaceC10601 = this.f39948;
        this.f39950 = C10933.m27416(bArr2, 0, i3, interfaceC10601);
        int i6 = ((bArr[i + 31] & 255) - 65) << 4;
        this.f39951 = i6;
        this.f39951 = i6 | (15 & ((bArr[i + 32] & 255) - 65));
        int i7 = i + 33;
        int i8 = i + 34;
        int i9 = bArr[i7] & 255;
        if (i9 == 0) {
            this.f39947 = null;
            i2 = 1;
        } else {
            StringBuffer stringBuffer = new StringBuffer(C10933.m27416(bArr, i8, i9, interfaceC10601));
            while (true) {
                int i10 = i8 + i9;
                i9 = i10 + 1;
                i8 = bArr[i10] & 255;
                if (i8 == 0) {
                    break;
                }
                stringBuffer.append('.');
                stringBuffer.append(C10933.m27416(bArr, i9, i8, interfaceC10601));
            }
            this.f39947 = stringBuffer.toString();
            i2 = i9 - i7;
        }
        return i2 + 33;
    }

    public final int hashCode() {
        int iHashCode = (this.f39949 * 65599) + (this.f39951 * 65599) + this.f39950.hashCode();
        String str = this.f39947;
        return (str == null || str.length() == 0) ? iHashCode : this.f39947.hashCode() + iHashCode;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11907)) {
            return false;
        }
        C11907 c11907 = (C11907) obj;
        if (this.f39947 == null && c11907.f39947 == null) {
            return this.f39950.equals(c11907.f39950) && this.f39951 == c11907.f39951;
        }
        return this.f39950.equals(c11907.f39950) && this.f39951 == c11907.f39951 && this.f39947.equals(c11907.f39947);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = this.f39950;
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
        stringBuffer.append(C5993.m16280(this.f39951, 2));
        stringBuffer.append(">");
        if (this.f39947 != null) {
            stringBuffer.append(".");
            stringBuffer.append(this.f39947);
        }
        return stringBuffer.toString();
    }
}
