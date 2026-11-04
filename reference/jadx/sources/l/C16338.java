package l;

import com.alipay.sdk.m.p.a;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.cb;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ܶ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9OT */
/* JADX INFO: loaded from: classes5.dex */
public final class C16338 extends AbstractC3660 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream f53059;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f53060;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f53061;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f53062;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f53063;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f53064;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final byte[] f53065;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f53066;

    public C16338(InputStream inputStream) {
        super(0);
        this.f53060 = Integer.MAX_VALUE;
        C23447.m52662(inputStream, "input");
        this.f53059 = inputStream;
        this.f53065 = new byte[4096];
        this.f53063 = 0;
        this.f53066 = 0;
        this.f53064 = 0;
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ۘ */
    public final int mo11876() throws C20463 {
        if (mo11899()) {
            this.f53061 = 0;
            return 0;
        }
        int iMo11891 = mo11891();
        this.f53061 = iMo11891;
        if ((iMo11891 >>> 3) != 0) {
            return iMo11891;
        }
        throw C20463.m46965();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ۙ */
    public final void mo11879(int i) throws C20463 {
        if (this.f53061 != i) {
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
            int i4 = this.f53063 - this.f53066;
            byte[] bArr = this.f53065;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.f53066;
                    this.f53066 = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw C20463.m46967();
            }
            while (i3 < 10) {
                if (this.f53066 == this.f53063) {
                    m38832(1);
                }
                int i6 = this.f53066;
                this.f53066 = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw C20463.m46967();
            return true;
        }
        if (i2 == 1) {
            m38837(8);
            return true;
        }
        if (i2 == 2) {
            m38837(mo11891());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                m38837(4);
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
        return Double.longBitsToDouble(m38835());
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ᩻ */
    public final float mo11903() {
        return Float.intBitsToFloat(m38838());
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ᩶ */
    public final long mo11896() {
        return m38836();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ܽ */
    public final long mo11893() {
        return m38836();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ܺ */
    public final int mo11892() {
        return mo11891();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ۧ */
    public final long mo11886() {
        return m38835();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ֫ */
    public final int mo11874() {
        return m38838();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo11894() {
        return m38836() != 0;
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ۛ */
    public final String mo11883() throws C20463 {
        int iMo11891 = mo11891();
        byte[] bArr = this.f53065;
        if (iMo11891 > 0) {
            int i = this.f53063;
            int i2 = this.f53066;
            if (iMo11891 <= i - i2) {
                String str = new String(bArr, i2, iMo11891, C23447.f75888);
                this.f53066 += iMo11891;
                return str;
            }
        }
        if (iMo11891 == 0) {
            return "";
        }
        if (iMo11891 < 0) {
            throw C20463.m46966();
        }
        if (iMo11891 <= this.f53063) {
            m38832(iMo11891);
            String str2 = new String(bArr, this.f53066, iMo11891, C23447.f75888);
            this.f53066 += iMo11891;
            return str2;
        }
        return new String(m38833(iMo11891), C23447.f75888);
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ᩺ */
    public final String mo11902() throws IOException {
        int iMo11891 = mo11891();
        int i = this.f53066;
        int i2 = this.f53063;
        int i3 = i2 - i;
        byte[] bArrM38833 = this.f53065;
        if (iMo11891 <= i3 && iMo11891 > 0) {
            this.f53066 = i + iMo11891;
        } else {
            if (iMo11891 == 0) {
                return "";
            }
            if (iMo11891 < 0) {
                throw C20463.m46966();
            }
            i = 0;
            if (iMo11891 <= i2) {
                m38832(iMo11891);
                this.f53066 = iMo11891;
            } else {
                bArrM38833 = m38833(iMo11891);
            }
        }
        return C11643.m29262(i, iMo11891, bArrM38833);
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
    public final AbstractC17084 mo11890() throws IOException {
        int iMo11891 = mo11891();
        int i = this.f53063;
        int i2 = this.f53066;
        int i3 = i - i2;
        byte[] bArr = this.f53065;
        if (iMo11891 <= i3 && iMo11891 > 0) {
            AbstractC17084 abstractC17084M40218 = AbstractC17084.m40218(i2, iMo11891, bArr);
            this.f53066 += iMo11891;
            return abstractC17084M40218;
        }
        if (iMo11891 == 0) {
            return AbstractC17084.f55772;
        }
        if (iMo11891 < 0) {
            throw C20463.m46966();
        }
        byte[] bArrM38830 = m38830(iMo11891);
        if (bArrM38830 != null) {
            return AbstractC17084.m40218(0, bArrM38830.length, bArrM38830);
        }
        int i4 = this.f53066;
        int i5 = this.f53063;
        int length = i5 - i4;
        this.f53064 += i5;
        this.f53066 = 0;
        this.f53063 = 0;
        ArrayList<byte[]> arrayListM38829 = m38829(iMo11891 - length);
        byte[] bArr2 = new byte[iMo11891];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        for (byte[] bArr3 : arrayListM38829) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        AbstractC17084 abstractC17084 = AbstractC17084.f55772;
        return new C11863(bArr2);
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
        return m38838();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ۗ */
    public final long mo11875() {
        return m38835();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ᩵ */
    public final int mo11895() {
        return AbstractC3660.m11873(mo11891());
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ۨ */
    public final long mo11887() {
        return AbstractC3660.m11870(m38836());
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ܶ */
    public final int mo11891() {
        int i;
        int i2 = this.f53066;
        int i3 = this.f53063;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f53065;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f53066 = i4;
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
                this.f53066 = i5;
                return i;
            }
        }
        return (int) m38839();
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final long m38836() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f53066;
        int i2 = this.f53063;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f53065;
            byte b = bArr[i];
            if (b >= 0) {
                this.f53066 = i3;
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
                this.f53066 = i4;
                return j;
            }
        }
        return m38839();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m38838() throws C20463 {
        int i = this.f53066;
        if (this.f53063 - i < 4) {
            m38832(4);
            i = this.f53066;
        }
        this.f53066 = i + 4;
        byte[] bArr = this.f53065;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long m38835() throws C20463 {
        int i = this.f53066;
        if (this.f53063 - i < 8) {
            m38832(8);
            i = this.f53066;
        }
        this.f53066 = i + 8;
        byte[] bArr = this.f53065;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ۤ */
    public final int mo11885(int i) throws C20463 {
        if (i < 0) {
            throw C20463.m46966();
        }
        int i2 = this.f53064 + this.f53066 + i;
        int i3 = this.f53060;
        if (i2 > i3) {
            throw C20463.m46963();
        }
        this.f53060 = i2;
        m38831();
        return i3;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m38831() {
        int i = this.f53063 + this.f53062;
        this.f53063 = i;
        int i2 = this.f53064 + i;
        int i3 = this.f53060;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f53062 = i4;
            this.f53063 = i - i4;
            return;
        }
        this.f53062 = 0;
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ᩷ */
    public final void mo11898(int i) {
        this.f53060 = i;
        m38831();
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ᩷ */
    public final int mo11897() {
        int i = this.f53060;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f53064 + this.f53066);
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo11899() {
        return this.f53066 == this.f53063 && !m38834(1);
    }

    @Override // l.AbstractC3660
    /* JADX INFO: renamed from: ۤ */
    public final int mo11884() {
        return this.f53064 + this.f53066;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m38832(int i) throws C20463 {
        if (m38834(i)) {
            return;
        }
        if (i > (this.f12527 - this.f53064) - this.f53066) {
            throw new C20463("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw C20463.m46963();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private boolean m38834(int i) throws IOException {
        int i2 = this.f53066;
        int i3 = i2 + i;
        int i4 = this.f53063;
        if (i3 <= i4) {
            throw new IllegalStateException(C14442.m34864(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i5 = this.f53064;
        int i6 = this.f12527;
        if (i <= (i6 - i5) - i2 && i5 + i2 + i <= this.f53060) {
            byte[] bArr = this.f53065;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f53064 += i2;
                this.f53063 -= i2;
                this.f53066 = 0;
            }
            int i7 = this.f53063;
            int iMin = Math.min(bArr.length - i7, (i6 - this.f53064) - i7);
            InputStream inputStream = this.f53059;
            int i8 = inputStream.read(bArr, i7, iMin);
            if (i8 == 0 || i8 < -1 || i8 > bArr.length) {
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i8 + "\nThe InputStream implementation is buggy.");
            }
            if (i8 > 0) {
                this.f53063 += i8;
                m38831();
                if (this.f53063 >= i) {
                    return true;
                }
                return m38834(i);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m38839() throws C20463 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f53066 == this.f53063) {
                m38832(1);
            }
            int i2 = this.f53066;
            this.f53066 = i2 + 1;
            byte b = this.f53065[i2];
            j |= ((long) (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID)) << i;
            if ((b & GCMSIVBlockCipher.MASK) == 0) {
                return j;
            }
        }
        throw C20463.m46967();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private byte[] m38833(int i) throws IOException {
        byte[] bArrM38830 = m38830(i);
        if (bArrM38830 != null) {
            return bArrM38830;
        }
        int i2 = this.f53066;
        int i3 = this.f53063;
        int length = i3 - i2;
        this.f53064 += i3;
        this.f53066 = 0;
        this.f53063 = 0;
        ArrayList<byte[]> arrayListM38829 = m38829(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f53065, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListM38829) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private byte[] m38830(int i) throws IOException {
        if (i == 0) {
            return C23447.f75887;
        }
        if (i < 0) {
            throw C20463.m46966();
        }
        int i2 = this.f53064;
        int i3 = this.f53066;
        int i4 = i2 + i3 + i;
        if (i4 - this.f12527 > 0) {
            throw new C20463("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.f53060;
        if (i4 > i5) {
            m38837((i5 - i2) - i3);
            throw C20463.m46963();
        }
        int i6 = this.f53063 - i3;
        int i7 = i - i6;
        InputStream inputStream = this.f53059;
        if (i7 >= 4096 && i7 > inputStream.available()) {
            return null;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f53065, this.f53066, bArr, 0, i6);
        this.f53064 += this.f53063;
        this.f53066 = 0;
        this.f53063 = 0;
        while (i6 < i) {
            int i8 = inputStream.read(bArr, i6, i - i6);
            if (i8 == -1) {
                throw C20463.m46963();
            }
            this.f53064 += i8;
            i6 += i8;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private ArrayList m38829(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.f53059.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw C20463.m46963();
                }
                this.f53064 += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m38837(int i) throws C20463 {
        int i2 = this.f53063;
        int i3 = this.f53066;
        if (i <= i2 - i3 && i >= 0) {
            this.f53066 = i3 + i;
            return;
        }
        InputStream inputStream = this.f53059;
        if (i < 0) {
            throw C20463.m46966();
        }
        int i4 = this.f53064;
        int i5 = i4 + i3;
        int i6 = i5 + i;
        int i7 = this.f53060;
        if (i6 > i7) {
            m38837((i7 - i4) - i3);
            throw C20463.m46963();
        }
        this.f53064 = i5;
        int i8 = i2 - i3;
        this.f53063 = 0;
        this.f53066 = 0;
        while (i8 < i) {
            long j = i - i8;
            try {
                long jSkip = inputStream.skip(j);
                if (jSkip < 0 || jSkip > j) {
                    throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                }
                if (jSkip == 0) {
                    break;
                } else {
                    i8 += (int) jSkip;
                }
            } catch (Throwable th) {
                this.f53064 += i8;
                m38831();
                throw th;
            }
        }
        this.f53064 += i8;
        m38831();
        if (i8 >= i) {
            return;
        }
        int i9 = this.f53063;
        int i10 = i9 - this.f53066;
        this.f53066 = i9;
        m38832(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f53063;
            if (i11 > i12) {
                i10 += i12;
                this.f53066 = i12;
                m38832(1);
            } else {
                this.f53066 = i11;
                return;
            }
        }
    }
}
