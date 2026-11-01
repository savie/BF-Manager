package l;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۨۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U19E */
/* JADX INFO: loaded from: classes3.dex */
public final class C11673 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f39241;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f39242;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] f39243;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f39244;

    public C11673(byte[] bArr) {
        int length = bArr.length;
        this.f39243 = bArr;
        this.f39241 = 0;
        this.f39244 = length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13790 m29131() {
        int i;
        String strM29130;
        do {
            i = this.f39241;
            strM29130 = m29130();
            if (strM29130 == null) {
                return null;
            }
        } while (strM29130.length() == 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(m29128(strM29130));
        while (true) {
            String strM29131 = m29130();
            if (strM29131 == null || strM29131.length() == 0) {
                break;
            }
            arrayList.add(m29128(strM29131));
        }
        return new C13790(arrayList, i, this.f39241 - i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4616 m29128(String str) {
        int iIndexOf = str.indexOf(": ");
        if (iIndexOf == -1) {
            return new C4616(str, "");
        }
        return new C4616(str.substring(0, iIndexOf), str.substring(iIndexOf + 2));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private String m29130() {
        byte[] bArr = this.f39242;
        byte[] bArr2 = C8574.f29651;
        if (bArr != null && bArr.length == 0) {
            this.f39242 = null;
        } else {
            byte[] bArrM29129 = m29129();
            if (bArrM29129 == null) {
                bArr2 = this.f39242;
                if (bArr2 != null) {
                    this.f39242 = null;
                } else {
                    bArr2 = null;
                }
            } else if (bArrM29129.length == 0) {
                bArrM29129 = this.f39242;
                if (bArrM29129 != null) {
                    this.f39242 = bArr2;
                    bArr2 = bArrM29129;
                }
            } else {
                byte[] bArr3 = this.f39242;
                if (bArr3 != null) {
                    if (bArrM29129[0] != 32) {
                        this.f39242 = bArrM29129;
                        bArr2 = bArr3;
                    } else {
                        this.f39242 = null;
                        int length = bArrM29129.length - 1;
                        byte[] bArr4 = new byte[bArr3.length + length];
                        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                        System.arraycopy(bArrM29129, 1, bArr4, bArr3.length, length);
                        bArrM29129 = bArr4;
                    }
                }
                while (true) {
                    byte[] bArrM291210 = m29129();
                    if (bArrM291210 == null) {
                        break;
                    }
                    if (bArrM291210.length == 0) {
                        this.f39242 = bArr2;
                        break;
                    }
                    if (bArrM291210[0] == 32) {
                        int length2 = bArrM291210.length - 1;
                        byte[] bArr5 = new byte[bArrM29129.length + length2];
                        System.arraycopy(bArrM29129, 0, bArr5, 0, bArrM29129.length);
                        System.arraycopy(bArrM291210, 1, bArr5, bArrM29129.length, length2);
                        bArrM29129 = bArr5;
                    } else {
                        this.f39242 = bArrM291210;
                        break;
                    }
                }
                bArr2 = bArrM29129;
            }
        }
        if (bArr2 == null) {
            return null;
        }
        return bArr2.length == 0 ? "" : new String(bArr2, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private byte[] m29129() {
        byte[] bArr;
        int i;
        int i2 = this.f39241;
        int i3 = this.f39244;
        if (i2 >= i3) {
            return null;
        }
        int i4 = i2;
        while (true) {
            bArr = this.f39243;
            if (i4 >= i3) {
                i4 = -1;
                i = -1;
                break;
            }
            byte b = bArr[i4];
            if (b == 13) {
                i = i4 + 1;
                if (i >= i3 || bArr[i] != 10) {
                    break;
                    break;
                }
                i = i4 + 2;
                break;
            }
            if (b == 10) {
                i = i4 + 1;
                break;
            }
            i4++;
        }
        if (i4 == -1) {
            i4 = i3;
        } else {
            i3 = i;
        }
        this.f39241 = i3;
        if (i4 == i2) {
            return C8574.f29651;
        }
        return Arrays.copyOfRange(bArr, i2, i4);
    }
}
