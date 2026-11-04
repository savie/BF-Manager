package l;

import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ۤۖۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: U58U */
/* JADX INFO: loaded from: classes3.dex */
public final class C10562 {

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final C10562 f33556 = new C10562();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public short f33557;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public short f33558;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f33559;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public short f33560;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C13741 f33561;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C10562 f33562;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public short f33563;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public short f33564;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public short f33565;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int[] f33566;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C2555 f33567;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public short f33568;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public short f33569;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C5517 f33570;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public short f33571;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C10562 f33572;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10562 m27017() {
        C13741 c13741 = this.f33561;
        return c13741 == null ? this : c13741.f43603;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27018(int i) {
        short s = this.f33569;
        if ((s & 128) == 0) {
            this.f33569 = (short) (s | 128);
            this.f33557 = (short) i;
            return;
        }
        if (this.f33566 == null) {
            this.f33566 = new int[4];
        }
        int[] iArr = this.f33566;
        int i2 = iArr[0] + 1;
        iArr[0] = i2;
        if (i2 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 4];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f33566 = iArr2;
        }
        this.f33566[i2] = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27022(AbstractC15037 abstractC15037, boolean z) {
        abstractC15037.mo10800(this);
        if (!z || (this.f33569 & 128) == 0) {
            return;
        }
        abstractC15037.mo10813(this.f33557 & HPKE.aead_EXPORT_ONLY, this);
        if (this.f33566 == null) {
            return;
        }
        int i = 1;
        while (true) {
            int[] iArr = this.f33566;
            if (i > iArr[0]) {
                return;
            }
            abstractC15037.mo10813(iArr[i], this);
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27020(C4047 c4047, int i, boolean z) {
        if ((this.f33569 & 4) != 0) {
            if (z) {
                c4047.m13023(this.f33559 - i);
                return;
            } else {
                c4047.m13021(this.f33559 - i);
                return;
            }
        }
        short s = (short) c4047.f13788;
        if (z) {
            c4047.m13021(this.f33560 & HPKE.aead_EXPORT_ONLY);
            c4047.m13021(i);
            this.f33560 = s;
        } else {
            c4047.m13021(this.f33564 & HPKE.aead_EXPORT_ONLY);
            this.f33564 = s;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27019(C4047 c4047) {
        if ((this.f33569 & 4) == 0) {
            short s = (short) c4047.f13788;
            c4047.m13021(this.f33563 & HPKE.aead_EXPORT_ONLY);
            this.f33563 = s;
            return;
        }
        c4047.m13021(this.f33559);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m27024(byte[] bArr, C4047 c4047, int i) {
        this.f33569 = (short) (this.f33569 | 4);
        this.f33559 = i;
        if (i > 65535) {
            return false;
        }
        int i2 = this.f33564 & HPKE.aead_EXPORT_ONLY;
        boolean z = false;
        while (i2 != 0) {
            int i3 = i2 + 1;
            int i4 = ((bArr[i2] & 255) << 8) | (bArr[i3] & 255);
            int i5 = i2 - 1;
            int i6 = i - i5;
            if (i6 < -32768 || i6 > 32767) {
                int i7 = bArr[i5] & 255;
                if (i7 < 198) {
                    bArr[i5] = (byte) (i7 + 49);
                } else {
                    bArr[i5] = (byte) (i7 + 20);
                }
                z = true;
            }
            bArr[i2] = (byte) (i6 >>> 8);
            bArr[i3] = (byte) i6;
            i2 = i4;
        }
        int i8 = this.f33560 & HPKE.aead_EXPORT_ONLY;
        while (i8 != 0) {
            int i9 = i8 + 1;
            int i10 = ((bArr[i8] & 255) << 8) | (bArr[i9] & 255);
            int i11 = i - (((bArr[i8 + 2] & 255) << 8) | (bArr[i8 + 3] & 255));
            bArr[i8] = (byte) (i11 >>> 24);
            bArr[i9] = (byte) (i11 >>> 16);
            bArr[i8 + 2] = (byte) (i11 >>> 8);
            bArr[i8 + 3] = (byte) i11;
            i8 = i10;
        }
        int i12 = this.f33563 & HPKE.aead_EXPORT_ONLY;
        while (i12 != 0) {
            byte[] bArr2 = c4047.f13787;
            int i13 = i12 + 1;
            int i14 = ((bArr2[i12] & 255) << 8) | (bArr2[i13] & 255);
            bArr2[i12] = (byte) (i >>> 8);
            bArr2[i13] = (byte) i;
            i12 = i14;
        }
        this.f33564 = (short) 0;
        this.f33560 = (short) 0;
        this.f33563 = (short) 0;
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27023(short s, C21751 c21751, C7776 c7776) {
        C10562 c10562 = f33556;
        this.f33572 = c10562;
        C10562 c10562M27016 = this;
        while (c10562M27016 != c10562) {
            C10562 c10563 = c10562M27016.f33572;
            c10562M27016.f33572 = null;
            if (c10562M27016.f33558 == 0) {
                c10562M27016.f33558 = s;
                c10562M27016 = c10562M27016.m27016(c10563, c21751, c7776);
            } else {
                c10562M27016 = c10563;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27021(C10562 c10562, C21751 c21751, C7776 c7776) {
        C10562 c10563 = f33556;
        this.f33572 = c10563;
        boolean z = false;
        C10562 c10562M27016 = this;
        C10562 c10564 = c10563;
        while (c10562M27016 != c10563) {
            C10562 c10565 = c10562M27016.f33572;
            c10562M27016.f33572 = c10564;
            if ((c10562M27016.f33569 & 64) != 0 && c10562M27016.f33558 != c10562.f33558) {
                if (z) {
                    throw new RuntimeException("Multiple rets to single jsr");
                }
                c10562M27016.f33567 = new C2555(c10562M27016.f33571, c10562.f33567.f8207, c10562M27016.f33567);
                z = true;
            }
            c10564 = c10562M27016;
            c10562M27016 = c10562M27016.m27016(c10565, c21751, c7776);
        }
        while (c10564 != c10563) {
            C10562 c10566 = c10564.f33572;
            c10564.f33572 = null;
            c10564 = c10566;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C10562 m27016(C10562 c10562, C21751 c21751, C7776 c7776) {
        C2555 c2555 = this.f33567;
        int i = 2;
        while (c2555 != null) {
            if ((this.f33569 & 16) == 0 || c2555 != this.f33567.f8206) {
                C10562 c10563 = c2555.f8207;
                if (c10563.f33572 == null) {
                    c10563.f33572 = c10562;
                    c10562 = c10563;
                }
            }
            c2555 = c2555.f8206;
            i += 5;
        }
        int i2 = this.f33559;
        while (c21751 != null) {
            int i3 = c21751.f69369.f33559;
            int i4 = c21751.f69368.f33559;
            if (i2 >= i3 && i2 < i4) {
                C10562 c10564 = c21751.f69372;
                if (c10564.f33572 == null) {
                    c10564.f33572 = c10562;
                    c10562 = c10564;
                }
            }
            c21751 = c21751.f69370;
            i += 5;
        }
        c7776.m21148(i);
        return c10562;
    }

    public final String toString() {
        return C13645.m33382(System.identityHashCode(this), "L");
    }
}
