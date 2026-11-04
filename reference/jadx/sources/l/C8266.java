package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.۠֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77UP */
/* JADX INFO: loaded from: classes3.dex */
public final class C8266 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f27203;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f27204;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f27205;

    public C8266(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public C8266(byte[] bArr, int i, int i2) throws C6775 {
        this.f27203 = bArr;
        this.f27204 = i;
        this.f27205 = i2;
        if (i + i2 > bArr.length) {
            throw new C6775();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m22314() {
        return this.f27203[this.f27204] & 255;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m22305() {
        return m22314() == 48;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m22311() {
        return m22314() == 2;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m22310() {
        return m22314() == 6;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m22308() {
        return m22314() == 4;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m22312() {
        return m22314() == 3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m22306(int i) {
        return m22314() == ((i | DHParameters.DEFAULT_MINIMUM_LENGTH) & 255);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m22304(int[] iArr) {
        int i = iArr[0];
        int i2 = i + 1;
        byte[] bArr = this.f27203;
        byte b = bArr[i];
        int i3 = b & 255;
        if ((b & GCMSIVBlockCipher.MASK) != 0) {
            int i4 = b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID;
            i3 = 0;
            while (true) {
                int i5 = i4 - 1;
                if (i4 <= 0) {
                    break;
                }
                int i6 = (i3 << 8) + (bArr[i2] & 255);
                i2++;
                i3 = i6;
                i4 = i5;
            }
        }
        iArr[0] = i2;
        return i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m22307() {
        int[] iArr = {this.f27204 + 1};
        int iM22304 = m22304(iArr);
        byte[] bArr = new byte[iM22304];
        System.arraycopy(this.f27203, iArr[0], bArr, 0, iM22304);
        return bArr;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C8266[] m22313() {
        byte[] bArr = this.f27203;
        int i = this.f27204;
        byte b = bArr[i];
        int[] iArr = {i + 1};
        int iM22304 = m22304(iArr);
        if (b == 5) {
            return new C8266[0];
        }
        int i2 = iArr[0];
        ArrayList arrayList = new ArrayList();
        while (iM22304 > 0) {
            int i3 = i2 + 1;
            iArr[0] = i3;
            int iM22305 = m22304(iArr);
            int i4 = iArr[0];
            int i5 = i4 - i3;
            arrayList.add(new C8266(bArr, i2, i5 + 1 + iM22305));
            i2 = i4 + iM22305;
            iM22304 = ((iM22304 - 1) - i5) - iM22305;
        }
        C8266[] c8266Arr = new C8266[arrayList.size()];
        arrayList.toArray(c8266Arr);
        return c8266Arr;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte[] m22309() {
        int i = this.f27205;
        int i2 = this.f27204;
        return Arrays.copyOfRange(this.f27203, i2, i + i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m22303(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(bArr);
        if (bigInteger.bitLength() <= 31) {
            return bigInteger.intValue();
        }
        throw new ArithmeticException("BigInteger out of int range");
    }
}
