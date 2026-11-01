package l;

import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.y.q;

/* JADX INFO: renamed from: l.ۨᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8E3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11893 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C19344 f39901;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int[] f39903 = new int[16];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int[] f39902 = new int[16];

    public C11893(C19344 c19344) {
        this.f39901 = c19344;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29657(int i, int i2, byte[] bArr) {
        m29656(1, i2);
        byte b = bArr[i];
        int i3 = b & 240;
        int i4 = b & 15;
        C19344 c19344 = this.f39901;
        if (i3 == 128) {
            m29656(3, i2);
            c19344.m44345(i4, bArr[i + 1], bArr[i + 2]);
            return;
        }
        if (i3 == 144) {
            m29656(3, i2);
            byte b2 = bArr[i + 2];
            if (b2 == 0) {
                c19344.m44345(i4, bArr[i + 1], b2);
                return;
            } else {
                c19344.m44350(i4, bArr[i + 1], b2);
                return;
            }
        }
        if (i3 == 160) {
            m29656(3, i2);
            byte b3 = bArr[i + 1];
            byte b4 = bArr[i + 2];
            return;
        }
        if (i3 != 176) {
            if (i3 == 192) {
                m29656(2, i2);
                c19344.m44344(i4, (int) bArr[i + 1]);
                return;
            } else if (i3 == 208) {
                m29656(2, i2);
                c19344.m44341(i4, ((double) bArr[i + 1]) * 0.007874015748031496d);
                return;
            } else {
                if (i3 != 224) {
                    return;
                }
                m29656(3, i2);
                c19344.m44348(i4, ((double) (((bArr[i + 2] << 7) + bArr[i + 1]) - 8192)) * 1.220703125E-4d);
            }
        }
        m29656(3, i2);
        byte b5 = bArr[i + 1];
        byte b6 = bArr[i + 2];
        int[] iArr = this.f39902;
        if (b5 == 6) {
            iArr[i4] = b6 << 7;
            m29655(i4);
            return;
        }
        if (b5 == 38) {
            iArr[i4] = b6 | (iArr[i4] & a.g);
            m29655(i4);
            return;
        }
        int[] iArr2 = this.f39903;
        switch (b5) {
            case 98:
                iArr2[i4] = b6 | 16384 | (iArr2[i4] & a.g);
                break;
            case q.f /* 99 */:
                iArr2[i4] = (b6 << 7) | 16384;
                break;
            case 100:
                iArr2[i4] = b6 | (iArr2[i4] & a.g);
                break;
            case 101:
                iArr2[i4] = b6 << 7;
                break;
            default:
                double d = ((double) b6) * 0.007874015748031496d;
                if (b5 == 1) {
                    c19344.m44351(i4, d * 0.1d);
                    break;
                } else if (b5 == 7) {
                    c19344.m44340(i4, d);
                    break;
                } else if (b5 == 10) {
                    c19344.m44349(i4, (d * 2.0d) - 1.0d);
                    break;
                } else if (b5 == 74) {
                    c19344.m44347(i4, d);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29655(int i) {
        int i2 = this.f39903[i];
        int i3 = i2 & 16384;
        int[] iArr = this.f39902;
        if (i3 == 0) {
            int i4 = iArr[i];
            if (i2 != 0) {
                return;
            }
            this.f39901.m44343(i, (((double) (i4 & 127)) * 0.01d) + ((double) (i4 >> 7)));
            return;
        }
        int i5 = iArr[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29656(int i, int i2) {
        if (i2 < i) {
            throw new IllegalArgumentException(C8015.m21119("Expected message of at least ", i, " bytes but got ", " bytes.", i2));
        }
    }
}
