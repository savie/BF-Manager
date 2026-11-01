package l;

import com.alipay.sdk.m.p.a;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.cb;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.֫۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: J9OT */
/* JADX INFO: loaded from: classes2.dex */
public final class C1851 extends AbstractC3262 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f7065;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InputStream f7066;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] f7067;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f7068;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f7069;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f7070;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f7071;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f7072;

    public C1851(InputStream inputStream) {
        super(0);
        this.f7069 = Integer.MAX_VALUE;
        C9779.m24889(inputStream, "input");
        this.f7066 = inputStream;
        this.f7067 = new byte[4096];
        this.f7071 = 0;
        this.f7072 = 0;
        this.f7070 = 0;
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo6048() throws C4529 {
        if (mo6021()) {
            this.f7068 = 0;
            return 0;
        }
        int iMo6044 = mo6044();
        this.f7068 = iMo6044;
        if ((iMo6044 >>> 3) != 0) {
            return iMo6044;
        }
        throw C4529.m12646();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6025(int i) throws C4529 {
        if (this.f7068 != i) {
            throw C4529.m12648();
        }
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean mo6022(int i) throws C4529 {
        int iMo6048;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            int i4 = this.f7071 - this.f7072;
            byte[] bArr = this.f7067;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.f7072;
                    this.f7072 = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw C4529.m12649();
            }
            while (i3 < 10) {
                if (this.f7072 == this.f7071) {
                    m6016(1);
                }
                int i6 = this.f7072;
                this.f7072 = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw C4529.m12649();
            return true;
        }
        if (i2 == 1) {
            m6051(8);
            return true;
        }
        if (i2 == 2) {
            m6051(mo6044());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                m6051(4);
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
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final double mo6020() {
        return Double.longBitsToDouble(m6042());
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final float mo6052() {
        return Float.intBitsToFloat(m6019());
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long mo6047() {
        return m6036();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long mo6049() {
        return m6036();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int mo6040() {
        return mo6044();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long mo6029() {
        return m6042();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int mo6023() {
        return m6019();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean mo6028() {
        return m6036() != 0;
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String mo6033() throws C4529 {
        int iMo6044 = mo6044();
        byte[] bArr = this.f7067;
        if (iMo6044 > 0) {
            int i = this.f7071;
            int i2 = this.f7072;
            if (iMo6044 <= i - i2) {
                String str = new String(bArr, i2, iMo6044, C9779.f33479);
                this.f7072 += iMo6044;
                return str;
            }
        }
        if (iMo6044 == 0) {
            return "";
        }
        if (iMo6044 < 0) {
            throw C4529.m12642();
        }
        if (iMo6044 <= this.f7071) {
            m6016(iMo6044);
            String str2 = new String(bArr, this.f7072, iMo6044, C9779.f33479);
            this.f7072 += iMo6044;
            return str2;
        }
        return new String(m6013(iMo6044), C9779.f33479);
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String mo6030() throws IOException {
        int iMo6044 = mo6044();
        int i = this.f7072;
        int i2 = this.f7071;
        int i3 = i2 - i;
        byte[] bArrM6013 = this.f7067;
        if (iMo6044 <= i3 && iMo6044 > 0) {
            this.f7072 = i + iMo6044;
        } else {
            if (iMo6044 == 0) {
                return "";
            }
            if (iMo6044 < 0) {
                throw C4529.m12642();
            }
            i = 0;
            if (iMo6044 <= i2) {
                m6016(iMo6044);
                this.f7072 = iMo6044;
            } else {
                bArrM6013 = m6013(iMo6044);
            }
        }
        return C6003.m16297(i, iMo6044, bArrM6013);
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6026(int i, InterfaceC6977 interfaceC6977, C2701 c2701) throws C4529 {
        m9745();
        this.f12121++;
        interfaceC6977.mergeFrom(this, c2701);
        mo6025((i << 3) | 4);
        this.f12121--;
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
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
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
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

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC23725 mo6050() throws IOException {
        int iMo6044 = mo6044();
        int i = this.f7071;
        int i2 = this.f7072;
        int i3 = i - i2;
        byte[] bArr = this.f7067;
        if (iMo6044 <= i3 && iMo6044 > 0) {
            AbstractC23725 abstractC23725M52255 = AbstractC23725.m52255(i2, iMo6044, bArr);
            this.f7072 += iMo6044;
            return abstractC23725M52255;
        }
        if (iMo6044 == 0) {
            return AbstractC23725.f76778;
        }
        if (iMo6044 < 0) {
            throw C4529.m12642();
        }
        byte[] bArrM6017 = m6017(iMo6044);
        if (bArrM6017 != null) {
            return AbstractC23725.m52255(0, bArrM6017.length, bArrM6017);
        }
        int i4 = this.f7072;
        int i5 = this.f7071;
        int length = i5 - i4;
        this.f7070 += i5;
        this.f7072 = 0;
        this.f7071 = 0;
        ArrayList<byte[]> arrayListM6014 = m6014(iMo6044 - length);
        byte[] bArr2 = new byte[iMo6044];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        for (byte[] bArr3 : arrayListM6014) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        AbstractC23725 abstractC23725 = AbstractC23725.f76778;
        return new C6085(bArr2);
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int mo6041() {
        return mo6044();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int mo6037() {
        return mo6044();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int mo6045() {
        return m6019();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final long mo6031() {
        return m6042();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int mo6046() {
        return AbstractC3262.m9744(mo6044());
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long mo6032() {
        return AbstractC3262.m9741(m6036());
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int mo6044() {
        int i;
        int i2 = this.f7072;
        int i3 = this.f7071;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f7067;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f7072 = i4;
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
                this.f7072 = i5;
                return i;
            }
        }
        return (int) m6043();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long m6036() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f7072;
        int i2 = this.f7071;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f7067;
            byte b = bArr[i];
            if (b >= 0) {
                this.f7072 = i3;
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
                this.f7072 = i4;
                return j;
            }
        }
        return m6043();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int m6019() throws C4529 {
        int i = this.f7072;
        if (this.f7071 - i < 4) {
            m6016(4);
            i = this.f7072;
        }
        this.f7072 = i + 4;
        byte[] bArr = this.f7067;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m6042() throws C4529 {
        int i = this.f7072;
        if (this.f7071 - i < 8) {
            m6016(8);
            i = this.f7072;
        }
        this.f7072 = i + 8;
        byte[] bArr = this.f7067;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo6035(int i) throws C4529 {
        if (i < 0) {
            throw C4529.m12642();
        }
        int i2 = this.f7070 + this.f7072 + i;
        int i3 = this.f7069;
        if (i2 > i3) {
            throw C4529.m12644();
        }
        this.f7069 = i2;
        m6015();
        return i3;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    private void m6015() {
        int i = this.f7071 + this.f7065;
        this.f7071 = i;
        int i2 = this.f7070 + i;
        int i3 = this.f7069;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f7065 = i4;
            this.f7071 = i - i4;
            return;
        }
        this.f7065 = 0;
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo6039(int i) {
        this.f7069 = i;
        m6015();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo6038() {
        int i = this.f7069;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f7070 + this.f7072);
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean mo6021() {
        return this.f7072 == this.f7071 && !m6018(1);
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo6034() {
        return this.f7070 + this.f7072;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m6016(int i) throws C4529 {
        if (m6018(i)) {
            return;
        }
        if (i > (this.f12122 - this.f7070) - this.f7072) {
            throw new C4529("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw C4529.m12644();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private boolean m6018(int i) throws IOException {
        int i2 = this.f7072;
        int i3 = i2 + i;
        int i4 = this.f7071;
        if (i3 <= i4) {
            throw new IllegalStateException(C2271.m6966(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i5 = this.f7070;
        int i6 = this.f12122;
        if (i <= (i6 - i5) - i2 && i5 + i2 + i <= this.f7069) {
            byte[] bArr = this.f7067;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f7070 += i2;
                this.f7071 -= i2;
                this.f7072 = 0;
            }
            int i7 = this.f7071;
            int iMin = Math.min(bArr.length - i7, (i6 - this.f7070) - i7);
            InputStream inputStream = this.f7066;
            int i8 = inputStream.read(bArr, i7, iMin);
            if (i8 == 0 || i8 < -1 || i8 > bArr.length) {
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i8 + "\nThe InputStream implementation is buggy.");
            }
            if (i8 > 0) {
                this.f7071 += i8;
                m6015();
                if (this.f7071 >= i) {
                    return true;
                }
                return m6018(i);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long m6043() throws C4529 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f7072 == this.f7071) {
                m6016(1);
            }
            int i2 = this.f7072;
            this.f7072 = i2 + 1;
            byte b = this.f7067[i2];
            j |= ((long) (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID)) << i;
            if ((b & GCMSIVBlockCipher.MASK) == 0) {
                return j;
            }
        }
        throw C4529.m12649();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private byte[] m6013(int i) throws IOException {
        byte[] bArrM6017 = m6017(i);
        if (bArrM6017 != null) {
            return bArrM6017;
        }
        int i2 = this.f7072;
        int i3 = this.f7071;
        int length = i3 - i2;
        this.f7070 += i3;
        this.f7072 = 0;
        this.f7071 = 0;
        ArrayList<byte[]> arrayListM6014 = m6014(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f7067, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListM6014) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private byte[] m6017(int i) throws IOException {
        if (i == 0) {
            return C9779.f33478;
        }
        if (i < 0) {
            throw C4529.m12642();
        }
        int i2 = this.f7070;
        int i3 = this.f7072;
        int i4 = i2 + i3 + i;
        if (i4 - this.f12122 > 0) {
            throw new C4529("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.f7069;
        if (i4 > i5) {
            m6051((i5 - i2) - i3);
            throw C4529.m12644();
        }
        int i6 = this.f7071 - i3;
        int i7 = i - i6;
        InputStream inputStream = this.f7066;
        if (i7 >= 4096 && i7 > inputStream.available()) {
            return null;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f7067, this.f7072, bArr, 0, i6);
        this.f7070 += this.f7071;
        this.f7072 = 0;
        this.f7071 = 0;
        while (i6 < i) {
            int i8 = inputStream.read(bArr, i6, i - i6);
            if (i8 == -1) {
                throw C4529.m12644();
            }
            this.f7070 += i8;
            i6 += i8;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private ArrayList m6014(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.f7066.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw C4529.m12644();
                }
                this.f7070 += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m6051(int i) throws C4529 {
        int i2 = this.f7071;
        int i3 = this.f7072;
        if (i <= i2 - i3 && i >= 0) {
            this.f7072 = i3 + i;
            return;
        }
        InputStream inputStream = this.f7066;
        if (i < 0) {
            throw C4529.m12642();
        }
        int i4 = this.f7070;
        int i5 = i4 + i3;
        int i6 = i5 + i;
        int i7 = this.f7069;
        if (i6 > i7) {
            m6051((i7 - i4) - i3);
            throw C4529.m12644();
        }
        this.f7070 = i5;
        int i8 = i2 - i3;
        this.f7071 = 0;
        this.f7072 = 0;
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
                this.f7070 += i8;
                m6015();
                throw th;
            }
        }
        this.f7070 += i8;
        m6015();
        if (i8 >= i) {
            return;
        }
        int i9 = this.f7071;
        int i10 = i9 - this.f7072;
        this.f7072 = i9;
        m6016(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f7071;
            if (i11 > i12) {
                i10 += i12;
                this.f7072 = i12;
                m6016(1);
            } else {
                this.f7072 = i11;
                return;
            }
        }
    }
}
