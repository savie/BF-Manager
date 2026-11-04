package l;

import java.io.EOFException;
import java.util.Arrays;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩺ܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: P4G6 */
/* JADX INFO: loaded from: classes.dex */
public final class C24411 implements Cloneable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C0594 f79211;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f79212 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f79213;

    static {
        C0594 c0594 = new C0594();
        f79211 = c0594;
        c0594.add(1);
        c0594.add(7);
        c0594.add(8);
        c0594.add(9);
        c0594.add(10);
        c0594.add(12);
        c0594.add(13);
        c0594.add(14);
        c0594.add(15);
        c0594.add(20);
        c0594.add(21);
        c0594.add(22);
        c0594.add(23);
        c0594.add(24);
        c0594.add(25);
        c0594.add(32);
        c0594.add(33);
        c0594.add(34);
        c0594.add(35);
        c0594.add(101);
        c0594.add(IShizukuService.Stub.TRANSACTION_attachUserService);
        c0594.add(18064);
        c0594.add(1992);
        c0594.add(9733);
        c0594.add(9989);
        c0594.add(10245);
        c0594.add(13133);
        c0594.add(17217);
        c0594.add(17491);
        c0594.add(18180);
        c0594.add(18191);
        c0594.add(19270);
        c0594.add(19521);
        c0594.add(19785);
        c0594.add(20300);
        c0594.add(21334);
        c0594.add(21589);
        c0594.add(21838);
        c0594.add(22613);
        c0594.add(25461);
        c0594.add(25922);
        c0594.add(28789);
        c0594.add(30062);
        c0594.add(30805);
        c0594.add(41246);
        c0594.add(41504);
        c0594.add(64842);
        c0594.add(39169);
        c0594.add(39170);
        c0594.add(19796);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m54600(byte[] bArr) {
        int i = 0;
        while (bArr.length - i >= 4) {
            int iM19212 = C6929.m19212(i, bArr);
            int iM19213 = C6929.m19212(i + 2, bArr);
            if (!f79211.contains(iM19212) || i + 4 + iM19213 > bArr.length) {
                break;
            }
            i += iM19213 + 4;
        }
        return Arrays.copyOf(bArr, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m54599(int i, byte[] bArr, byte[] bArr2) {
        byte[] bArrM54601 = m54601(i, bArr);
        byte[] bArr3 = new byte[bArr2.length + 4 + bArrM54601.length];
        C6929.m19215(0, i, bArr3);
        C6929.m19215(2, bArr2.length, bArr3);
        System.arraycopy(bArr2, 0, bArr3, 4, bArr2.length);
        System.arraycopy(bArrM54601, 0, bArr3, bArr2.length + 4, bArrM54601.length);
        return bArr3;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static byte[] m54601(int i, byte[] bArr) {
        if (bArr == null) {
            return new byte[0];
        }
        int i2 = 0;
        while (bArr.length - i2 >= 4) {
            int iM19212 = C6929.m19212(i2, bArr);
            int iM19213 = C6929.m19212(i2 + 2, bArr);
            int i3 = i2 + 4;
            if (iM19213 > bArr.length - i3) {
                break;
            }
            if (iM19212 == i) {
                int i4 = iM19213 + 4;
                byte[] bArr2 = new byte[bArr.length - i4];
                System.arraycopy(bArr, 0, bArr2, 0, i2);
                System.arraycopy(bArr, i2 + i4, bArr2, i2, (bArr.length - i4) - i2);
                return bArr2;
            }
            i2 = i3 + iM19213;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24411 m54598(int i, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int i2 = 0;
        while (bArr.length - i2 >= 4) {
            int iM19212 = C6929.m19212(i2, bArr);
            int iM19213 = C6929.m19212(i2 + 2, bArr);
            int i3 = i2 + 4;
            if (iM19213 > bArr.length - i3) {
                return null;
            }
            if (iM19212 == i) {
                byte[] bArr2 = new byte[iM19213];
                System.arraycopy(bArr, i3, bArr2, 0, iM19213);
                C24411 c24411 = new C24411();
                c24411.f79213 = bArr2;
                return c24411;
            }
            i2 = i3 + iM19213;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m54603() {
        return this.f79213;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m54604() throws EOFException {
        byte[] bArr = this.f79213;
        boolean z = C17719.f58226;
        if (1 > bArr.length) {
            throw new EOFException();
        }
        return bArr[0] & 255;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m54605() {
        byte[] bArr = this.f79213;
        boolean z = C17719.f58226;
        if (5 > bArr.length) {
            throw new EOFException();
        }
        return C6929.m19208(1, bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m54602(int i) {
        byte[] bArr = this.f79213;
        boolean z = C17719.f58226;
        if (i + 8 > bArr.length) {
            throw new EOFException();
        }
        return C6929.m19214(i, bArr);
    }

    public final Object clone() {
        return (C24411) super.clone();
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final C24411 m54606clone() {
        return (C24411) super.clone();
    }
}
