package l;

import com.alipay.sdk.m.p.a;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.cb;
import java.util.Arrays;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ܳ۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: J9OT */
/* JADX INFO: loaded from: classes4.dex */
public final class C14553 extends AbstractC3262 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f47645;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f47646;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] f47647;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f47648;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f47649;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f47650;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f47651;

    public C14553(boolean z, int i, int i2, byte[] bArr) {
        super(0);
        this.f47645 = Integer.MAX_VALUE;
        this.f47647 = bArr;
        this.f47646 = i2 + i;
        this.f47648 = i;
        this.f47651 = i;
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ᩷ */
    public final int mo6048() throws C4529 {
        if (mo6021()) {
            this.f47649 = 0;
            return 0;
        }
        int iMo6044 = mo6044();
        this.f47649 = iMo6044;
        if ((iMo6044 >>> 3) != 0) {
            return iMo6044;
        }
        throw C4529.m12646();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۙ */
    public final void mo6025(int i) throws C4529 {
        if (this.f47649 != i) {
            throw C4529.m12648();
        }
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo6022(int i) throws C4529 {
        int iMo6048;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            int i4 = this.f47646 - this.f47648;
            byte[] bArr = this.f47647;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.f47648;
                    this.f47648 = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw C4529.m12649();
            }
            while (i3 < 10) {
                int i6 = this.f47648;
                if (i6 == this.f47646) {
                    throw C4529.m12644();
                }
                this.f47648 = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw C4529.m12649();
            return true;
        }
        if (i2 == 1) {
            m35023(8);
            return true;
        }
        if (i2 == 2) {
            m35023(mo6044());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                m35023(4);
                return true;
            }
            throw C4529.m12645();
        }
        do {
            iMo6048 = mo6048();
            if (iMo6048 == 0) {
                break;
            }
        } while (mo6022(iMo6048));
        mo6025(((i >>> 3) << 3) | 4);
        return true;
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ֨ */
    public final double mo6020() {
        return Double.longBitsToDouble(m35021());
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ᩺ */
    public final float mo6052() {
        return Float.intBitsToFloat(m35019());
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ᩶ */
    public final long mo6047() {
        return m35020();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ᩸ */
    public final long mo6049() {
        return m35020();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ܶ */
    public final int mo6040() {
        return mo6044();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۜ */
    public final long mo6029() {
        return m35021();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۘ */
    public final int mo6023() {
        return m35019();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo6028() {
        return m35020() != 0;
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۤ */
    public final String mo6033() throws C4529 {
        int iMo6044 = mo6044();
        if (iMo6044 > 0) {
            int i = this.f47646;
            int i2 = this.f47648;
            if (iMo6044 <= i - i2) {
                String str = new String(this.f47647, i2, iMo6044, C9779.f33479);
                this.f47648 += iMo6044;
                return str;
            }
        }
        if (iMo6044 == 0) {
            return "";
        }
        if (iMo6044 < 0) {
            throw C4529.m12642();
        }
        throw C4529.m12644();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۟ */
    public final String mo6030() throws C4529 {
        int iMo6044 = mo6044();
        if (iMo6044 > 0) {
            int i = this.f47646;
            int i2 = this.f47648;
            if (iMo6044 <= i - i2) {
                String strM16297 = C6003.m16297(i2, iMo6044, this.f47647);
                this.f47648 += iMo6044;
                return strM16297;
            }
        }
        if (iMo6044 == 0) {
            return "";
        }
        if (iMo6044 <= 0) {
            throw C4529.m12642();
        }
        throw C4529.m12644();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۙ */
    public final void mo6026(int i, InterfaceC6977 interfaceC6977, C2701 c2701) throws C4529 {
        m9745();
        this.f12121++;
        interfaceC6977.mergeFrom(this, c2701);
        mo6025((i << 3) | 4);
        this.f12121--;
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۙ */
    public final void mo6027(InterfaceC6977 interfaceC6977, C2701 c2701) throws C4529 {
        int iMo6044 = mo6044();
        m9745();
        int iMo6035 = mo6035(iMo6044);
        this.f12121++;
        interfaceC6977.mergeFrom(this, c2701);
        mo6025(0);
        this.f12121--;
        if (mo6038() != 0) {
            throw C4529.m12644();
        }
        mo6039(iMo6035);
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC23206 mo6024(InterfaceC6271 interfaceC6271, C2701 c2701) throws C4529 {
        int iMo6044 = mo6044();
        m9745();
        int iMo6035 = mo6035(iMo6044);
        this.f12121++;
        InterfaceC23206 interfaceC23206 = (InterfaceC23206) interfaceC6271.parsePartialFrom(this, c2701);
        mo6025(0);
        this.f12121--;
        if (mo6038() != 0) {
            throw C4529.m12644();
        }
        mo6039(iMo6035);
        return interfaceC23206;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC23725 mo6050() throws C4529 {
        byte[] bArrCopyOfRange;
        int iMo6044 = mo6044();
        byte[] bArr = this.f47647;
        if (iMo6044 > 0) {
            int i = this.f47646;
            int i2 = this.f47648;
            if (iMo6044 <= i - i2) {
                AbstractC23725 abstractC23725M52255 = AbstractC23725.m52255(i2, iMo6044, bArr);
                this.f47648 += iMo6044;
                return abstractC23725M52255;
            }
        }
        if (iMo6044 == 0) {
            return AbstractC23725.f76778;
        }
        if (iMo6044 > 0) {
            int i3 = this.f47646;
            int i4 = this.f47648;
            if (iMo6044 <= i3 - i4) {
                int i5 = iMo6044 + i4;
                this.f47648 = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iMo6044 <= 0) {
                    throw C4529.m12644();
                }
                if (iMo6044 == 0) {
                    bArrCopyOfRange = C9779.f33478;
                } else {
                    throw C4529.m12642();
                }
            }
        } else {
            if (iMo6044 <= 0) {
                throw C4529.m12644();
            }
            if (iMo6044 == 0) {
                bArrCopyOfRange = C9779.f33478;
            } else {
                throw C4529.m12642();
            }
        }
        AbstractC23725 abstractC23725 = AbstractC23725.f76778;
        return new C6085(bArrCopyOfRange);
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ܺ */
    public final int mo6041() {
        return mo6044();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۬ */
    public final int mo6037() {
        return mo6044();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ᩴ */
    public final int mo6045() {
        return m35019();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۠ */
    public final long mo6031() {
        return m35021();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ᩵ */
    public final int mo6046() {
        return AbstractC3262.m9744(mo6044());
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۡ */
    public final long mo6032() {
        return AbstractC3262.m9741(m35020());
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ᩳ */
    public final int mo6044() {
        int i;
        int i2 = this.f47648;
        int i3 = this.f47646;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f47647;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f47648 = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ a.g;
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << cb.f77931l) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.f47648 = i5;
                return i;
            }
        }
        return (int) m35022();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long m35020() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f47648;
        int i2 = this.f47646;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f47647;
            byte b = bArr[i];
            if (b >= 0) {
                this.f47648 = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ a.g;
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << cb.f77931l) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.f47648 = i4;
                return j;
            }
        }
        return m35022();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int m35019() throws C4529 {
        int i = this.f47648;
        if (this.f47646 - i < 4) {
            throw C4529.m12644();
        }
        this.f47648 = i + 4;
        byte[] bArr = this.f47647;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m35021() throws C4529 {
        int i = this.f47648;
        if (this.f47646 - i < 8) {
            throw C4529.m12644();
        }
        this.f47648 = i + 8;
        byte[] bArr = this.f47647;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۨ */
    public final int mo6035(int i) {
        if (i < 0) {
            throw C4529.m12642();
        }
        int iMo6034 = i + mo6034();
        if (iMo6034 < 0) {
            throw C4529.m12647();
        }
        int i2 = this.f47645;
        if (iMo6034 > i2) {
            throw C4529.m12644();
        }
        this.f47645 = iMo6034;
        m35018();
        return i2;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    private void m35018() {
        int i = this.f47646 + this.f47650;
        this.f47646 = i;
        int i2 = i - this.f47651;
        int i3 = this.f47645;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f47650 = i4;
            this.f47646 = i - i4;
            return;
        }
        this.f47650 = 0;
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ܰ */
    public final void mo6039(int i) {
        this.f47645 = i;
        m35018();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ܰ */
    public final int mo6038() {
        int i = this.f47645;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - mo6034();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo6021() {
        return this.f47648 == this.f47646;
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۨ */
    public final int mo6034() {
        return this.f47648 - this.f47651;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long m35022() throws C4529 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f47648;
            if (i2 == this.f47646) {
                throw C4529.m12644();
            }
            this.f47648 = i2 + 1;
            byte b = this.f47647[i2];
            j |= ((long) (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID)) << i;
            if ((b & GCMSIVBlockCipher.MASK) == 0) {
                return j;
            }
        }
        throw C4529.m12649();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m35023(int i) throws C4529 {
        if (i >= 0) {
            int i2 = this.f47646;
            int i3 = this.f47648;
            if (i <= i2 - i3) {
                this.f47648 = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw C4529.m12642();
        }
        throw C4529.m12644();
    }
}
