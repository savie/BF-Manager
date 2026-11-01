package l;

import java.io.EOFException;
import java.util.Arrays;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۟֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: P4G6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7167 implements Cloneable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C18597 f23949;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f23950 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte[] f23951;

    static {
        C18597 c18597 = new C18597();
        f23949 = c18597;
        c18597.add(1);
        c18597.add(7);
        c18597.add(8);
        c18597.add(9);
        c18597.add(10);
        c18597.add(12);
        c18597.add(13);
        c18597.add(14);
        c18597.add(15);
        c18597.add(20);
        c18597.add(21);
        c18597.add(22);
        c18597.add(23);
        c18597.add(24);
        c18597.add(25);
        c18597.add(32);
        c18597.add(33);
        c18597.add(34);
        c18597.add(35);
        c18597.add(101);
        c18597.add(IShizukuService.Stub.TRANSACTION_attachUserService);
        c18597.add(18064);
        c18597.add(1992);
        c18597.add(9733);
        c18597.add(9989);
        c18597.add(10245);
        c18597.add(13133);
        c18597.add(17217);
        c18597.add(17491);
        c18597.add(18180);
        c18597.add(18191);
        c18597.add(19270);
        c18597.add(19521);
        c18597.add(19785);
        c18597.add(20300);
        c18597.add(21334);
        c18597.add(21589);
        c18597.add(21838);
        c18597.add(22613);
        c18597.add(25461);
        c18597.add(25922);
        c18597.add(28789);
        c18597.add(30062);
        c18597.add(30805);
        c18597.add(41246);
        c18597.add(41504);
        c18597.add(64842);
        c18597.add(39169);
        c18597.add(39170);
        c18597.add(19796);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m19090(byte[] bArr) {
        int i = 0;
        while (bArr.length - i >= 4) {
            int iM36347 = C15157.m36347(i, bArr);
            int iM36348 = C15157.m36347(i + 2, bArr);
            if (!f23949.contains(iM36347) || i + 4 + iM36348 > bArr.length) {
                break;
            }
            i += iM36348 + 4;
        }
        return Arrays.copyOf(bArr, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m19089(int i, byte[] bArr, byte[] bArr2) {
        byte[] bArrM19091 = m19091(i, bArr);
        byte[] bArr3 = new byte[bArr2.length + 4 + bArrM19091.length];
        C15157.m36353(0, i, bArr3);
        C15157.m36353(2, bArr2.length, bArr3);
        System.arraycopy(bArr2, 0, bArr3, 4, bArr2.length);
        System.arraycopy(bArrM19091, 0, bArr3, bArr2.length + 4, bArrM19091.length);
        return bArr3;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static byte[] m19091(int i, byte[] bArr) {
        if (bArr == null) {
            return new byte[0];
        }
        int i2 = 0;
        while (bArr.length - i2 >= 4) {
            int iM36347 = C15157.m36347(i2, bArr);
            int iM36348 = C15157.m36347(i2 + 2, bArr);
            int i3 = i2 + 4;
            if (iM36348 > bArr.length - i3) {
                break;
            }
            if (iM36347 == i) {
                int i4 = iM36348 + 4;
                byte[] bArr2 = new byte[bArr.length - i4];
                System.arraycopy(bArr, 0, bArr2, 0, i2);
                System.arraycopy(bArr, i2 + i4, bArr2, i2, (bArr.length - i4) - i2);
                return bArr2;
            }
            i2 = i3 + iM36348;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7167 m19088(int i, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int i2 = 0;
        while (bArr.length - i2 >= 4) {
            int iM36347 = C15157.m36347(i2, bArr);
            int iM36348 = C15157.m36347(i2 + 2, bArr);
            int i3 = i2 + 4;
            if (iM36348 > bArr.length - i3) {
                return null;
            }
            if (iM36347 == i) {
                byte[] bArr2 = new byte[iM36348];
                System.arraycopy(bArr, i3, bArr2, 0, iM36348);
                C7167 c7167 = new C7167();
                c7167.f23951 = bArr2;
                return c7167;
            }
            i2 = i3 + iM36348;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m19094() {
        return this.f23951;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m19092() throws EOFException {
        byte[] bArr = this.f23951;
        boolean z = C21506.f69876;
        if (1 > bArr.length) {
            throw new EOFException();
        }
        return bArr[0] & 255;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m19095() throws EOFException {
        byte[] bArr = this.f23951;
        boolean z = C21506.f69876;
        if (5 > bArr.length) {
            throw new EOFException();
        }
        return C15157.m36336(1, bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m19093(int i) throws EOFException {
        byte[] bArr = this.f23951;
        boolean z = C21506.f69876;
        if (i + 8 > bArr.length) {
            throw new EOFException();
        }
        return C15157.m36351(i, bArr);
    }

    public final Object clone() {
        return (C7167) super.clone();
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final C7167 m19096clone() {
        return (C7167) super.clone();
    }
}
