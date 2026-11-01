package l;

import com.alipay.sdk.m.p.a;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.cb;
import java.nio.ByteBuffer;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ۢ۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: J9OT */
/* JADX INFO: loaded from: classes3.dex */
public final class C9614 extends AbstractC3262 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f32388;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f32389;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f32390;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f32391;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f32392;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f32393;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f32394;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f32395;

    public C9614(ByteBuffer byteBuffer, boolean z) {
        super(0);
        this.f32392 = Integer.MAX_VALUE;
        this.f32394 = byteBuffer;
        long jM37769 = C15882.m37769(byteBuffer);
        this.f32390 = jM37769;
        this.f32391 = ((long) byteBuffer.limit()) + jM37769;
        long jPosition = jM37769 + ((long) byteBuffer.position());
        this.f32395 = jPosition;
        this.f32393 = jPosition;
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ᩷ */
    public final int mo6048() throws C4529 {
        if (mo6021()) {
            this.f32389 = 0;
            return 0;
        }
        int iMo6044 = mo6044();
        this.f32389 = iMo6044;
        if ((iMo6044 >>> 3) != 0) {
            return iMo6044;
        }
        throw C4529.m12646();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۙ */
    public final void mo6025(int i) throws C4529 {
        if (this.f32389 != i) {
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
            if (((int) (this.f32391 - this.f32395)) >= 10) {
                while (i3 < 10) {
                    long j = this.f32395;
                    this.f32395 = j + 1;
                    if (C15882.m37766(j) < 0) {
                        i3++;
                    }
                }
                throw C4529.m12649();
            }
            while (i3 < 10) {
                long j2 = this.f32395;
                if (j2 == this.f32391) {
                    throw C4529.m12644();
                }
                this.f32395 = j2 + 1;
                if (C15882.m37766(j2) < 0) {
                    i3++;
                }
            }
            throw C4529.m12649();
            return true;
        }
        if (i2 == 1) {
            m24520(8);
            return true;
        }
        if (i2 == 2) {
            m24520(mo6044());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                m24520(4);
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
        return Double.longBitsToDouble(m24518());
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ᩺ */
    public final float mo6052() {
        return Float.intBitsToFloat(m24516());
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ᩶ */
    public final long mo6047() {
        return m24517();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ᩸ */
    public final long mo6049() {
        return m24517();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ܶ */
    public final int mo6040() {
        return mo6044();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۜ */
    public final long mo6029() {
        return m24518();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۘ */
    public final int mo6023() {
        return m24516();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo6028() {
        return m24517() != 0;
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۤ */
    public final String mo6033() throws C4529 {
        int iMo6044 = mo6044();
        if (iMo6044 > 0) {
            long j = this.f32391;
            long j2 = this.f32395;
            if (iMo6044 <= ((int) (j - j2))) {
                byte[] bArr = new byte[iMo6044];
                long j3 = iMo6044;
                C15882.m37775(j2, bArr, 0L, j3);
                String str = new String(bArr, C9779.f33479);
                this.f32395 += j3;
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
            long j = this.f32391;
            long j2 = this.f32395;
            if (iMo6044 <= ((int) (j - j2))) {
                String strM16292 = C6003.m16292(this.f32394, (int) (j2 - this.f32390), iMo6044);
                this.f32395 += (long) iMo6044;
                return strM16292;
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

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC23725 mo6050() throws C4529 {
        int iMo6044 = mo6044();
        if (iMo6044 > 0) {
            long j = this.f32391;
            long j2 = this.f32395;
            if (iMo6044 <= ((int) (j - j2))) {
                byte[] bArr = new byte[iMo6044];
                long j3 = iMo6044;
                C15882.m37775(j2, bArr, 0L, j3);
                this.f32395 += j3;
                AbstractC23725 abstractC23725 = AbstractC23725.f76778;
                return new C6085(bArr);
            }
        }
        if (iMo6044 == 0) {
            return AbstractC23725.f76778;
        }
        if (iMo6044 < 0) {
            throw C4529.m12642();
        }
        throw C4529.m12644();
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
        return m24516();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۠ */
    public final long mo6031() {
        return m24518();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ᩵ */
    public final int mo6046() {
        return AbstractC3262.m9744(mo6044());
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۡ */
    public final long mo6032() {
        return AbstractC3262.m9741(m24517());
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ᩳ */
    public final int mo6044() {
        int i;
        long j = this.f32395;
        if (this.f32391 != j) {
            long j2 = 1 + j;
            byte bM37766 = C15882.m37766(j);
            if (bM37766 >= 0) {
                this.f32395 = j2;
                return bM37766;
            }
            if (this.f32391 - j2 >= 9) {
                long j3 = 2 + j;
                int iM37766 = (C15882.m37766(j2) << 7) ^ bM37766;
                if (iM37766 < 0) {
                    i = iM37766 ^ a.g;
                } else {
                    long j4 = 3 + j;
                    int iM37767 = iM37766 ^ (C15882.m37766(j3) << cb.f77931l);
                    if (iM37767 >= 0) {
                        i = iM37767 ^ 16256;
                    } else {
                        j3 = 4 + j;
                        int iM37768 = iM37767 ^ (C15882.m37766(j4) << 21);
                        if (iM37768 < 0) {
                            i = (-2080896) ^ iM37768;
                        } else {
                            j4 = 5 + j;
                            byte bM37767 = C15882.m37766(j3);
                            int i2 = (iM37768 ^ (bM37767 << ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB)) ^ 266354560;
                            if (bM37767 < 0) {
                                j3 = 6 + j;
                                if (C15882.m37766(j4) < 0) {
                                    j4 = 7 + j;
                                    if (C15882.m37766(j3) < 0) {
                                        j3 = 8 + j;
                                        if (C15882.m37766(j4) < 0) {
                                            j4 = j + 9;
                                            if (C15882.m37766(j3) < 0) {
                                                long j5 = j + 10;
                                                if (C15882.m37766(j4) >= 0) {
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
                this.f32395 = j3;
                return i;
            }
        }
        return (int) m24519();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long m24517() {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        long j5 = this.f32395;
        if (this.f32391 != j5) {
            long j6 = 1 + j5;
            byte bM37766 = C15882.m37766(j5);
            if (bM37766 >= 0) {
                this.f32395 = j6;
                return bM37766;
            }
            if (this.f32391 - j6 >= 9) {
                long j7 = 2 + j5;
                int iM37766 = (C15882.m37766(j6) << 7) ^ bM37766;
                if (iM37766 >= 0) {
                    j = 3 + j5;
                    int iM37767 = iM37766 ^ (C15882.m37766(j7) << cb.f77931l);
                    if (iM37767 >= 0) {
                        j2 = iM37767 ^ 16256;
                    } else {
                        j7 = 4 + j5;
                        int iM37768 = iM37767 ^ (C15882.m37766(j) << 21);
                        if (iM37768 < 0) {
                            i = (-2080896) ^ iM37768;
                        } else {
                            long j8 = 5 + j5;
                            long jM37766 = ((long) iM37768) ^ (((long) C15882.m37766(j7)) << 28);
                            if (jM37766 >= 0) {
                                j4 = 266354560;
                            } else {
                                long j9 = 6 + j5;
                                long jM37767 = jM37766 ^ (((long) C15882.m37766(j8)) << 35);
                                if (jM37767 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    j8 = 7 + j5;
                                    jM37766 = jM37767 ^ (((long) C15882.m37766(j9)) << 42);
                                    if (jM37766 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        j9 = 8 + j5;
                                        jM37767 = jM37766 ^ (((long) C15882.m37766(j8)) << 49);
                                        if (jM37767 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            long j10 = j5 + 9;
                                            long jM37768 = (jM37767 ^ (((long) C15882.m37766(j9)) << 56)) ^ 71499008037633920L;
                                            if (jM37768 < 0) {
                                                long j11 = j5 + 10;
                                                if (C15882.m37766(j10) >= 0) {
                                                    j2 = jM37768;
                                                    j = j11;
                                                }
                                            } else {
                                                j2 = jM37768;
                                                j = j10;
                                            }
                                        }
                                    }
                                }
                                j2 = j3 ^ jM37767;
                                j = j9;
                            }
                            j2 = j4 ^ jM37766;
                            j = j8;
                        }
                    }
                    this.f32395 = j;
                    return j2;
                }
                i = iM37766 ^ a.g;
                j2 = i;
                j = j7;
                this.f32395 = j;
                return j2;
            }
        }
        return m24519();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int m24516() throws C4529 {
        long j = this.f32395;
        if (this.f32391 - j < 4) {
            throw C4529.m12644();
        }
        this.f32395 = 4 + j;
        return ((C15882.m37766(j + 3) & 255) << 24) | (C15882.m37766(j) & 255) | ((C15882.m37766(1 + j) & 255) << 8) | ((C15882.m37766(2 + j) & 255) << 16);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m24518() throws C4529 {
        long j = this.f32395;
        if (this.f32391 - j < 8) {
            throw C4529.m12644();
        }
        this.f32395 = 8 + j;
        return ((((long) C15882.m37766(j + 7)) & 255) << 56) | (((long) C15882.m37766(j)) & 255) | ((((long) C15882.m37766(1 + j)) & 255) << 8) | ((((long) C15882.m37766(2 + j)) & 255) << 16) | ((((long) C15882.m37766(3 + j)) & 255) << 24) | ((((long) C15882.m37766(4 + j)) & 255) << 32) | ((((long) C15882.m37766(5 + j)) & 255) << 40) | ((((long) C15882.m37766(6 + j)) & 255) << 48);
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۨ */
    public final int mo6035(int i) throws C4529 {
        if (i < 0) {
            throw C4529.m12642();
        }
        int iMo6034 = i + mo6034();
        int i2 = this.f32392;
        if (iMo6034 > i2) {
            throw C4529.m12644();
        }
        this.f32392 = iMo6034;
        m24515();
        return i2;
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ܰ */
    public final void mo6039(int i) {
        this.f32392 = i;
        m24515();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ܰ */
    public final int mo6038() {
        int i = this.f32392;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - mo6034();
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo6021() {
        return this.f32395 == this.f32391;
    }

    @Override // l.AbstractC3262
    /* JADX INFO: renamed from: ۨ */
    public final int mo6034() {
        return (int) (this.f32395 - this.f32393);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long m24519() throws C4529 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            long j2 = this.f32395;
            if (j2 == this.f32391) {
                throw C4529.m12644();
            }
            this.f32395 = 1 + j2;
            byte bM37766 = C15882.m37766(j2);
            j |= ((long) (bM37766 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID)) << i;
            if ((bM37766 & GCMSIVBlockCipher.MASK) == 0) {
                return j;
            }
        }
        throw C4529.m12649();
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    private void m24515() {
        long j = this.f32391 + ((long) this.f32388);
        this.f32391 = j;
        int i = (int) (j - this.f32393);
        int i2 = this.f32392;
        if (i > i2) {
            int i3 = i - i2;
            this.f32388 = i3;
            this.f32391 = j - ((long) i3);
            return;
        }
        this.f32388 = 0;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m24520(int i) throws C4529 {
        if (i >= 0) {
            long j = this.f32391;
            long j2 = this.f32395;
            if (i <= ((int) (j - j2))) {
                this.f32395 = j2 + ((long) i);
                return;
            }
        }
        if (i < 0) {
            throw C4529.m12642();
        }
        throw C4529.m12644();
    }
}
