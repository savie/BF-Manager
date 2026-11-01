package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ۡ᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77UP */
/* JADX INFO: loaded from: classes3.dex */
public final class C9197 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f31273;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f31274;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f31275;

    public C9197(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public C9197(byte[] bArr, int i, int i2) throws C10608 {
        this.f31273 = bArr;
        this.f31274 = i;
        this.f31275 = i2;
        if (i + i2 > bArr.length) {
            throw new C10608();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m23649() {
        return this.f31273[this.f31274] & 255;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m23650() {
        return m23649() == 48;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m23657() {
        return m23649() == 2;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m23648() {
        return m23649() == 6;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m23655() {
        return m23649() == 4;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m23653() {
        return m23649() == 3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m23651(int i) {
        return m23649() == ((i | DHParameters.DEFAULT_MINIMUM_LENGTH) & 255);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m23647(int[] iArr) {
        int i = iArr[0];
        int i2 = i + 1;
        byte[] bArr = this.f31273;
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
    public final byte[] m23652() {
        int[] iArr = {this.f31274 + 1};
        int iM23647 = m23647(iArr);
        byte[] bArr = new byte[iM23647];
        System.arraycopy(this.f31273, iArr[0], bArr, 0, iM23647);
        return bArr;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9197[] m23656() {
        byte[] bArr = this.f31273;
        int i = this.f31274;
        byte b = bArr[i];
        int[] iArr = {i + 1};
        int iM23647 = m23647(iArr);
        if (b == 5) {
            return new C9197[0];
        }
        int i2 = iArr[0];
        ArrayList arrayList = new ArrayList();
        while (iM23647 > 0) {
            int i3 = i2 + 1;
            iArr[0] = i3;
            int iM23648 = m23647(iArr);
            int i4 = iArr[0];
            int i5 = i4 - i3;
            arrayList.add(new C9197(bArr, i2, i5 + 1 + iM23648));
            i2 = i4 + iM23648;
            iM23647 = ((iM23647 - 1) - i5) - iM23648;
        }
        C9197[] c9197Arr = new C9197[arrayList.size()];
        arrayList.toArray(c9197Arr);
        return c9197Arr;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] m23654() {
        int i = this.f31275;
        int i2 = this.f31274;
        return Arrays.copyOfRange(this.f31273, i2, i + i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m23646(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(bArr);
        if (bigInteger.bitLength() <= 31) {
            return bigInteger.intValue();
        }
        throw new ArithmeticException("BigInteger out of int range");
    }
}
