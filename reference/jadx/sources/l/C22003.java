package l;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩷ۤ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: U19E */
/* JADX INFO: loaded from: classes.dex */
public final class C22003 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f70984;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte[] f70985;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f70986;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f70987;

    public C22003(byte[] bArr) {
        int length = bArr.length;
        this.f70985 = bArr;
        this.f70987 = 0;
        this.f70986 = length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4849 m49739() {
        int i;
        String strM49738;
        do {
            i = this.f70987;
            strM49738 = m49738();
            if (strM49738 == null) {
                return null;
            }
        } while (strM49738.length() == 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(m49736(strM49738));
        while (true) {
            String strM49739 = m49738();
            if (strM49739 == null || strM49739.length() == 0) {
                break;
            }
            arrayList.add(m49736(strM49739));
        }
        return new C4849(arrayList, i, this.f70987 - i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14126 m49736(String str) {
        int iIndexOf = str.indexOf(": ");
        if (iIndexOf == -1) {
            return new C14126(str, "");
        }
        return new C14126(str.substring(0, iIndexOf), str.substring(iIndexOf + 2));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private String m49738() {
        byte[] bArr = this.f70984;
        byte[] bArr2 = C9498.f30777;
        if (bArr != null && bArr.length == 0) {
            this.f70984 = null;
        } else {
            byte[] bArrM49737 = m49737();
            if (bArrM49737 == null) {
                bArr2 = this.f70984;
                if (bArr2 != null) {
                    this.f70984 = null;
                } else {
                    bArr2 = null;
                }
            } else if (bArrM49737.length == 0) {
                bArrM49737 = this.f70984;
                if (bArrM49737 != null) {
                    this.f70984 = bArr2;
                    bArr2 = bArrM49737;
                }
            } else {
                byte[] bArr3 = this.f70984;
                if (bArr3 != null) {
                    if (bArrM49737[0] != 32) {
                        this.f70984 = bArrM49737;
                        bArr2 = bArr3;
                    } else {
                        this.f70984 = null;
                        int length = bArrM49737.length - 1;
                        byte[] bArr4 = new byte[bArr3.length + length];
                        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                        System.arraycopy(bArrM49737, 1, bArr4, bArr3.length, length);
                        bArrM49737 = bArr4;
                    }
                }
                while (true) {
                    byte[] bArrM49738 = m49737();
                    if (bArrM49738 == null) {
                        break;
                    }
                    if (bArrM49738.length == 0) {
                        this.f70984 = bArr2;
                        break;
                    }
                    if (bArrM49738[0] == 32) {
                        int length2 = bArrM49738.length - 1;
                        byte[] bArr5 = new byte[bArrM49737.length + length2];
                        System.arraycopy(bArrM49737, 0, bArr5, 0, bArrM49737.length);
                        System.arraycopy(bArrM49738, 1, bArr5, bArrM49737.length, length2);
                        bArrM49737 = bArr5;
                    } else {
                        this.f70984 = bArrM49738;
                        break;
                    }
                }
                bArr2 = bArrM49737;
            }
        }
        if (bArr2 == null) {
            return null;
        }
        return bArr2.length == 0 ? "" : new String(bArr2, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private byte[] m49737() {
        byte[] bArr;
        int i;
        int i2 = this.f70987;
        int i3 = this.f70986;
        if (i2 >= i3) {
            return null;
        }
        int i4 = i2;
        while (true) {
            bArr = this.f70985;
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
        this.f70987 = i3;
        if (i4 == i2) {
            return C9498.f30777;
        }
        return Arrays.copyOfRange(bArr, i2, i4);
    }
}
