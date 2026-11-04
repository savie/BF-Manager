package l;

import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.y.q;

/* JADX INFO: renamed from: l.᩵֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8E3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20221 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C2561 f64902;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int[] f64904 = new int[16];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f64903 = new int[16];

    public C20221(C2561 c2561) {
        this.f64902 = c2561;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46486(int i, int i2, byte[] bArr) {
        m46485(1, i2);
        byte b = bArr[i];
        int i3 = b & 240;
        int i4 = b & 15;
        C2561 c2561 = this.f64902;
        if (i3 == 128) {
            m46485(3, i2);
            c2561.m8601(i4, bArr[i + 1], bArr[i + 2]);
            return;
        }
        if (i3 == 144) {
            m46485(3, i2);
            byte b2 = bArr[i + 2];
            if (b2 == 0) {
                c2561.m8601(i4, bArr[i + 1], b2);
                return;
            } else {
                c2561.m8608(i4, bArr[i + 1], b2);
                return;
            }
        }
        if (i3 == 160) {
            m46485(3, i2);
            byte b3 = bArr[i + 1];
            byte b4 = bArr[i + 2];
            return;
        }
        if (i3 != 176) {
            if (i3 == 192) {
                m46485(2, i2);
                c2561.m8600(i4, (int) bArr[i + 1]);
                return;
            } else if (i3 == 208) {
                m46485(2, i2);
                c2561.m8609(i4, ((double) bArr[i + 1]) * 0.007874015748031496d);
                return;
            } else {
                if (i3 != 224) {
                    return;
                }
                m46485(3, i2);
                c2561.m8603(i4, ((double) (((bArr[i + 2] << 7) + bArr[i + 1]) - 8192)) * 1.220703125E-4d);
            }
        }
        m46485(3, i2);
        byte b5 = bArr[i + 1];
        byte b6 = bArr[i + 2];
        int[] iArr = this.f64903;
        if (b5 == 6) {
            iArr[i4] = b6 << 7;
            m46484(i4);
            return;
        }
        if (b5 == 38) {
            iArr[i4] = b6 | (iArr[i4] & a.g);
            m46484(i4);
            return;
        }
        int[] iArr2 = this.f64904;
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
                    c2561.m8605(i4, d * 0.1d);
                    break;
                } else if (b5 == 7) {
                    c2561.m8604(i4, d);
                    break;
                } else if (b5 == 10) {
                    c2561.m8607(i4, (d * 2.0d) - 1.0d);
                    break;
                } else if (b5 == 74) {
                    c2561.m8606(i4, d);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m46484(int i) {
        int i2 = this.f64904[i];
        int i3 = i2 & 16384;
        int[] iArr = this.f64903;
        if (i3 == 0) {
            int i4 = iArr[i];
            if (i2 != 0) {
                return;
            }
            this.f64902.m8599(i, (((double) (i4 & 127)) * 0.01d) + ((double) (i4 >> 7)));
            return;
        }
        int i5 = iArr[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46485(int i, int i2) {
        if (i2 < i) {
            throw new IllegalArgumentException(C0703.m3016("Expected message of at least ", i, " bytes but got ", " bytes.", i2));
        }
    }
}
