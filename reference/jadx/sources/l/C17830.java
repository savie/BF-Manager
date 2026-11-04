package l;

import com.alipay.sdk.m.p.a;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.cb;
import java.util.Arrays;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ܽ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9OT */
/* JADX INFO: loaded from: classes5.dex */
public final class C17830 extends AbstractC3660 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f58491;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f58492;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f58493;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f58494;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f58495;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final byte[] f58496;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f58497;

    public C17830(boolean z, int i, int i2, byte[] bArr) {
        super(0);
        this.f58494 = Integer.MAX_VALUE;
        this.f58496 = bArr;
        this.f58491 = i2 + i;
        this.f58493 = i;
        this.f58497 = i;
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ۘ */
    public final int mo11876() throws C20463 {
        if (mo11899()) {
            this.f58492 = 0;
            return 0;
        }
        int iMo11891 = mo11891();
        this.f58492 = iMo11891;
        if ((iMo11891 >>> 3) != 0) {
            return iMo11891;
        }
        throw C20463.m46965();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ۙ */
    public final void mo11879(int i) throws C20463 {
        if (this.f58492 != i) {
            throw C20463.m46969();
        }
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo11900(int i) throws C20463 {
        int iMo11876;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            int i4 = this.f58491 - this.f58493;
            byte[] bArr = this.f58496;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.f58493;
                    this.f58493 = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw C20463.m46967();
            }
            while (i3 < 10) {
                int i6 = this.f58493;
                if (i6 == this.f58491) {
                    throw C20463.m46963();
                }
                this.f58493 = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw C20463.m46967();
            return true;
        }
        if (i2 == 1) {
            m41677(8);
            return true;
        }
        if (i2 == 2) {
            m41677(mo11891());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                m41677(4);
                return true;
            }
            throw C20463.m46968();
        }
        do {
            iMo11876 = mo11876();
            if (iMo11876 == 0) {
                break;
            }
        } while (mo11900(iMo11876));
        mo11879(((i >>> 3) << 3) | 4);
        return true;
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ۫ */
    public final double mo11888() {
        return Double.longBitsToDouble(m41675());
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ᩻ */
    public final float mo11903() {
        return Float.intBitsToFloat(m41678());
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ᩶ */
    public final long mo11896() {
        return m41676();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ܽ */
    public final long mo11893() {
        return m41676();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ܺ */
    public final int mo11892() {
        return mo11891();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ۧ */
    public final long mo11886() {
        return m41675();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ֫ */
    public final int mo11874() {
        return m41678();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo11894() {
        return m41676() != 0;
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ۛ */
    public final String mo11883() throws C20463 {
        int iMo11891 = mo11891();
        if (iMo11891 > 0) {
            int i = this.f58491;
            int i2 = this.f58493;
            if (iMo11891 <= i - i2) {
                String str = new String(this.f58496, i2, iMo11891, C23447.f75888);
                this.f58493 += iMo11891;
                return str;
            }
        }
        if (iMo11891 == 0) {
            return "";
        }
        if (iMo11891 < 0) {
            throw C20463.m46966();
        }
        throw C20463.m46963();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ᩺ */
    public final String mo11902() throws C20463 {
        int iMo11891 = mo11891();
        if (iMo11891 > 0) {
            int i = this.f58491;
            int i2 = this.f58493;
            if (iMo11891 <= i - i2) {
                String strM29262 = C11643.m29262(i2, iMo11891, this.f58496);
                this.f58493 += iMo11891;
                return strM29262;
            }
        }
        if (iMo11891 == 0) {
            return "";
        }
        if (iMo11891 <= 0) {
            throw C20463.m46966();
        }
        throw C20463.m46963();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ۙ */
    public final void mo11880(int i, InterfaceC7588 interfaceC7588, C24215 c24215) throws C20463 {
        m11878();
        this.f12526++;
        interfaceC7588.mergeFrom(this, c24215);
        mo11879((i << 3) | 4);
        this.f12526--;
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ۙ */
    public final void mo11881(InterfaceC7588 interfaceC7588, C24215 c24215) throws C20463 {
        int iMo11891 = mo11891();
        m11878();
        int iMo11885 = mo11885(iMo11891);
        this.f12526++;
        interfaceC7588.mergeFrom(this, c24215);
        mo11879(0);
        this.f12526--;
        if (mo11897() != 0) {
            throw C20463.m46963();
        }
        mo11898(iMo11885);
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC18775 mo11877(InterfaceC11490 interfaceC11490, C24215 c24215) throws C20463 {
        int iMo11891 = mo11891();
        m11878();
        int iMo11885 = mo11885(iMo11891);
        this.f12526++;
        InterfaceC18775 interfaceC18775 = (InterfaceC18775) interfaceC11490.parsePartialFrom(this, c24215);
        mo11879(0);
        this.f12526--;
        if (mo11897() != 0) {
            throw C20463.m46963();
        }
        mo11898(iMo11885);
        return interfaceC18775;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ܳ */
    public final AbstractC17084 mo11890() throws C20463 {
        byte[] bArrCopyOfRange;
        int iMo11891 = mo11891();
        byte[] bArr = this.f58496;
        if (iMo11891 > 0) {
            int i = this.f58491;
            int i2 = this.f58493;
            if (iMo11891 <= i - i2) {
                AbstractC17084 abstractC17084M40218 = AbstractC17084.m40218(i2, iMo11891, bArr);
                this.f58493 += iMo11891;
                return abstractC17084M40218;
            }
        }
        if (iMo11891 == 0) {
            return AbstractC17084.f55772;
        }
        if (iMo11891 > 0) {
            int i3 = this.f58491;
            int i4 = this.f58493;
            if (iMo11891 <= i3 - i4) {
                int i5 = iMo11891 + i4;
                this.f58493 = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iMo11891 <= 0) {
                    throw C20463.m46963();
                }
                if (iMo11891 == 0) {
                    bArrCopyOfRange = C23447.f75887;
                } else {
                    throw C20463.m46966();
                }
            }
        } else {
            if (iMo11891 <= 0) {
                throw C20463.m46963();
            }
            if (iMo11891 == 0) {
                bArrCopyOfRange = C23447.f75887;
            } else {
                throw C20463.m46966();
            }
        }
        AbstractC17084 abstractC17084 = AbstractC17084.f55772;
        return new C11863(bArrCopyOfRange);
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ܰ */
    public final int mo11889() {
        return mo11891();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ۚ */
    public final int mo11882() {
        return mo11891();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ᩹ */
    public final int mo11901() {
        return m41678();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ۗ */
    public final long mo11875() {
        return m41675();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ᩵ */
    public final int mo11895() {
        return AbstractC3660.m11873(mo11891());
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ۨ */
    public final long mo11887() {
        return AbstractC3660.m11870(m41676());
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ܶ */
    public final int mo11891() {
        int i;
        int i2 = this.f58493;
        int i3 = this.f58491;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f58496;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f58493 = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ a.g;
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << cb.f82047l) ^ i6;
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
                this.f58493 = i5;
                return i;
            }
        }
        return (int) m41679();
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final long m41676() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f58493;
        int i2 = this.f58491;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f58496;
            byte b = bArr[i];
            if (b >= 0) {
                this.f58493 = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ a.g;
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << cb.f82047l) ^ i5;
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
                this.f58493 = i4;
                return j;
            }
        }
        return m41679();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m41678() throws C20463 {
        int i = this.f58493;
        if (this.f58491 - i < 4) {
            throw C20463.m46963();
        }
        this.f58493 = i + 4;
        byte[] bArr = this.f58496;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long m41675() throws C20463 {
        int i = this.f58493;
        if (this.f58491 - i < 8) {
            throw C20463.m46963();
        }
        this.f58493 = i + 8;
        byte[] bArr = this.f58496;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ۤ */
    public final int mo11885(int i) {
        if (i < 0) {
            throw C20463.m46966();
        }
        int iMo11884 = i + mo11884();
        if (iMo11884 < 0) {
            throw C20463.m46964();
        }
        int i2 = this.f58494;
        if (iMo11884 > i2) {
            throw C20463.m46963();
        }
        this.f58494 = iMo11884;
        m41674();
        return i2;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m41674() {
        int i = this.f58491 + this.f58495;
        this.f58491 = i;
        int i2 = i - this.f58497;
        int i3 = this.f58494;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f58495 = i4;
            this.f58491 = i - i4;
            return;
        }
        this.f58495 = 0;
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ᩷ */
    public final void mo11898(int i) {
        this.f58494 = i;
        m41674();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ᩷ */
    public final int mo11897() {
        int i = this.f58494;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - mo11884();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo11899() {
        return this.f58493 == this.f58491;
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ۤ */
    public final int mo11884() {
        return this.f58493 - this.f58497;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m41679() throws C20463 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f58493;
            if (i2 == this.f58491) {
                throw C20463.m46963();
            }
            this.f58493 = i2 + 1;
            byte b = this.f58496[i2];
            j |= ((long) (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID)) << i;
            if ((b & GCMSIVBlockCipher.MASK) == 0) {
                return j;
            }
        }
        throw C20463.m46967();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m41677(int i) throws C20463 {
        if (i >= 0) {
            int i2 = this.f58491;
            int i3 = this.f58493;
            if (i <= i2 - i3) {
                this.f58493 = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw C20463.m46966();
        }
        throw C20463.m46963();
    }
}
