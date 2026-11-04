package l;

import com.alipay.sdk.m.p.a;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.cb;
import java.nio.ByteBuffer;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.᩹᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9OT */
/* JADX INFO: loaded from: classes.dex */
public final class C23798 extends AbstractC3660 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f77084;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f77085;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f77086;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f77087;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f77088;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f77089;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f77090;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f77091;

    public C23798(ByteBuffer byteBuffer, boolean z) {
        super(0);
        this.f77085 = Integer.MAX_VALUE;
        this.f77088 = byteBuffer;
        long jM51500 = C22832.m51500(byteBuffer);
        this.f77090 = jM51500;
        this.f77086 = ((long) byteBuffer.limit()) + jM51500;
        long jPosition = jM51500 + ((long) byteBuffer.position());
        this.f77091 = jPosition;
        this.f77089 = jPosition;
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ۘ */
    public final int mo11876() throws C20463 {
        if (mo11899()) {
            this.f77084 = 0;
            return 0;
        }
        int iMo11891 = mo11891();
        this.f77084 = iMo11891;
        if ((iMo11891 >>> 3) != 0) {
            return iMo11891;
        }
        throw C20463.m46965();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ۙ */
    public final void mo11879(int i) throws C20463 {
        if (this.f77084 != i) {
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
            if (((int) (this.f77086 - this.f77091)) >= 10) {
                while (i3 < 10) {
                    long j = this.f77091;
                    this.f77091 = j + 1;
                    if (C22832.m51497(j) < 0) {
                        i3++;
                    }
                }
                throw C20463.m46967();
            }
            while (i3 < 10) {
                long j2 = this.f77091;
                if (j2 == this.f77086) {
                    throw C20463.m46963();
                }
                this.f77091 = j2 + 1;
                if (C22832.m51497(j2) < 0) {
                    i3++;
                }
            }
            throw C20463.m46967();
            return true;
        }
        if (i2 == 1) {
            m53090(8);
            return true;
        }
        if (i2 == 2) {
            m53090(mo11891());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                m53090(4);
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
        return Double.longBitsToDouble(m53088());
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ᩻ */
    public final float mo11903() {
        return Float.intBitsToFloat(m53091());
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ᩶ */
    public final long mo11896() {
        return m53089();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ܽ */
    public final long mo11893() {
        return m53089();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ܺ */
    public final int mo11892() {
        return mo11891();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ۧ */
    public final long mo11886() {
        return m53088();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ֫ */
    public final int mo11874() {
        return m53091();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo11894() {
        return m53089() != 0;
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ۛ */
    public final String mo11883() throws C20463 {
        int iMo11891 = mo11891();
        if (iMo11891 > 0) {
            long j = this.f77086;
            long j2 = this.f77091;
            if (iMo11891 <= ((int) (j - j2))) {
                byte[] bArr = new byte[iMo11891];
                long j3 = iMo11891;
                C22832.m51506(j2, bArr, 0L, j3);
                String str = new String(bArr, C23447.f75888);
                this.f77091 += j3;
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
            long j = this.f77086;
            long j2 = this.f77091;
            if (iMo11891 <= ((int) (j - j2))) {
                String strM29257 = C11643.m29257(this.f77088, (int) (j2 - this.f77090), iMo11891);
                this.f77091 += (long) iMo11891;
                return strM29257;
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

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ܳ */
    public final AbstractC17084 mo11890() throws C20463 {
        int iMo11891 = mo11891();
        if (iMo11891 > 0) {
            long j = this.f77086;
            long j2 = this.f77091;
            if (iMo11891 <= ((int) (j - j2))) {
                byte[] bArr = new byte[iMo11891];
                long j3 = iMo11891;
                C22832.m51506(j2, bArr, 0L, j3);
                this.f77091 += j3;
                AbstractC17084 abstractC17084 = AbstractC17084.f55772;
                return new C11863(bArr);
            }
        }
        if (iMo11891 == 0) {
            return AbstractC17084.f55772;
        }
        if (iMo11891 < 0) {
            throw C20463.m46966();
        }
        throw C20463.m46963();
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
        return m53091();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ۗ */
    public final long mo11875() {
        return m53088();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ᩵ */
    public final int mo11895() {
        return AbstractC3660.m11873(mo11891());
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ۨ */
    public final long mo11887() {
        return AbstractC3660.m11870(m53089());
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ܶ */
    public final int mo11891() {
        int i;
        long j = this.f77091;
        if (this.f77086 != j) {
            long j2 = 1 + j;
            byte bM51497 = C22832.m51497(j);
            if (bM51497 >= 0) {
                this.f77091 = j2;
                return bM51497;
            }
            if (this.f77086 - j2 >= 9) {
                long j3 = 2 + j;
                int iM51497 = (C22832.m51497(j2) << 7) ^ bM51497;
                if (iM51497 < 0) {
                    i = iM51497 ^ a.g;
                } else {
                    long j4 = 3 + j;
                    int iM51498 = iM51497 ^ (C22832.m51497(j3) << cb.f82047l);
                    if (iM51498 >= 0) {
                        i = iM51498 ^ 16256;
                    } else {
                        j3 = 4 + j;
                        int iM51499 = iM51498 ^ (C22832.m51497(j4) << 21);
                        if (iM51499 < 0) {
                            i = (-2080896) ^ iM51499;
                        } else {
                            j4 = 5 + j;
                            byte bM51498 = C22832.m51497(j3);
                            int i2 = (iM51499 ^ (bM51498 << ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB)) ^ 266354560;
                            if (bM51498 < 0) {
                                j3 = 6 + j;
                                if (C22832.m51497(j4) < 0) {
                                    j4 = 7 + j;
                                    if (C22832.m51497(j3) < 0) {
                                        j3 = 8 + j;
                                        if (C22832.m51497(j4) < 0) {
                                            j4 = j + 9;
                                            if (C22832.m51497(j3) < 0) {
                                                long j5 = j + 10;
                                                if (C22832.m51497(j4) >= 0) {
                                                    j3 = j5;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i2;
                            }
                            i = i2;
                        }
                    }
                    j3 = j4;
                }
                this.f77091 = j3;
                return i;
            }
        }
        return (int) m53092();
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final long m53089() {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        long j5 = this.f77091;
        if (this.f77086 != j5) {
            long j6 = 1 + j5;
            byte bM51497 = C22832.m51497(j5);
            if (bM51497 >= 0) {
                this.f77091 = j6;
                return bM51497;
            }
            if (this.f77086 - j6 >= 9) {
                long j7 = 2 + j5;
                int iM51497 = (C22832.m51497(j6) << 7) ^ bM51497;
                if (iM51497 >= 0) {
                    j = 3 + j5;
                    int iM51498 = iM51497 ^ (C22832.m51497(j7) << cb.f82047l);
                    if (iM51498 >= 0) {
                        j2 = iM51498 ^ 16256;
                    } else {
                        j7 = 4 + j5;
                        int iM51499 = iM51498 ^ (C22832.m51497(j) << 21);
                        if (iM51499 < 0) {
                            i = (-2080896) ^ iM51499;
                        } else {
                            long j8 = 5 + j5;
                            long jM51497 = ((long) iM51499) ^ (((long) C22832.m51497(j7)) << 28);
                            if (jM51497 >= 0) {
                                j4 = 266354560;
                            } else {
                                long j9 = 6 + j5;
                                long jM51498 = jM51497 ^ (((long) C22832.m51497(j8)) << 35);
                                if (jM51498 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    j8 = 7 + j5;
                                    jM51497 = jM51498 ^ (((long) C22832.m51497(j9)) << 42);
                                    if (jM51497 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        j9 = 8 + j5;
                                        jM51498 = jM51497 ^ (((long) C22832.m51497(j8)) << 49);
                                        if (jM51498 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            long j10 = j5 + 9;
                                            long jM51499 = (jM51498 ^ (((long) C22832.m51497(j9)) << 56)) ^ 71499008037633920L;
                                            if (jM51499 < 0) {
                                                long j11 = j5 + 10;
                                                if (C22832.m51497(j10) >= 0) {
                                                    j2 = jM51499;
                                                    j = j11;
                                                }
                                            } else {
                                                j2 = jM51499;
                                                j = j10;
                                            }
                                        }
                                    }
                                }
                                j2 = j3 ^ jM51498;
                                j = j9;
                            }
                            j2 = j4 ^ jM51497;
                            j = j8;
                        }
                    }
                    this.f77091 = j;
                    return j2;
                }
                i = iM51497 ^ a.g;
                j2 = i;
                j = j7;
                this.f77091 = j;
                return j2;
            }
        }
        return m53092();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m53091() throws C20463 {
        long j = this.f77091;
        if (this.f77086 - j < 4) {
            throw C20463.m46963();
        }
        this.f77091 = 4 + j;
        return ((C22832.m51497(j + 3) & 255) << 24) | (C22832.m51497(j) & 255) | ((C22832.m51497(1 + j) & 255) << 8) | ((C22832.m51497(2 + j) & 255) << 16);
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long m53088() throws C20463 {
        long j = this.f77091;
        if (this.f77086 - j < 8) {
            throw C20463.m46963();
        }
        this.f77091 = 8 + j;
        return ((((long) C22832.m51497(j + 7)) & 255) << 56) | (((long) C22832.m51497(j)) & 255) | ((((long) C22832.m51497(1 + j)) & 255) << 8) | ((((long) C22832.m51497(2 + j)) & 255) << 16) | ((((long) C22832.m51497(3 + j)) & 255) << 24) | ((((long) C22832.m51497(4 + j)) & 255) << 32) | ((((long) C22832.m51497(5 + j)) & 255) << 40) | ((((long) C22832.m51497(6 + j)) & 255) << 48);
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ۤ */
    public final int mo11885(int i) throws C20463 {
        if (i < 0) {
            throw C20463.m46966();
        }
        int iMo11884 = i + mo11884();
        int i2 = this.f77085;
        if (iMo11884 > i2) {
            throw C20463.m46963();
        }
        this.f77085 = iMo11884;
        m53087();
        return i2;
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ᩷ */
    public final void mo11898(int i) {
        this.f77085 = i;
        m53087();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ᩷ */
    public final int mo11897() {
        int i = this.f77085;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - mo11884();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo11899() {
        return this.f77091 == this.f77086;
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ۤ */
    public final int mo11884() {
        return (int) (this.f77091 - this.f77089);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m53092() throws C20463 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            long j2 = this.f77091;
            if (j2 == this.f77086) {
                throw C20463.m46963();
            }
            this.f77091 = 1 + j2;
            byte bM51497 = C22832.m51497(j2);
            j |= ((long) (bM51497 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID)) << i;
            if ((bM51497 & GCMSIVBlockCipher.MASK) == 0) {
                return j;
            }
        }
        throw C20463.m46967();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m53087() {
        long j = this.f77086 + ((long) this.f77087);
        this.f77086 = j;
        int i = (int) (j - this.f77089);
        int i2 = this.f77085;
        if (i > i2) {
            int i3 = i - i2;
            this.f77087 = i3;
            this.f77086 = j - ((long) i3);
            return;
        }
        this.f77087 = 0;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m53090(int i) throws C20463 {
        if (i >= 0) {
            long j = this.f77086;
            long j2 = this.f77091;
            if (i <= ((int) (j - j2))) {
                this.f77091 = j2 + ((long) i);
                return;
            }
        }
        if (i < 0) {
            throw C20463.m46966();
        }
        throw C20463.m46963();
    }
}
