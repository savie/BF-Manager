package l;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ܿۧ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: X8U2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18294 implements InterfaceC22486 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21278 f59643;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C19378 f59644;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f59645;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f59646;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f59647;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C23232 f59648;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public InterfaceC22024 f59649;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC12789 f59652;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f59654;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] f59651 = new byte[42];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21287 f59653 = new C21287(new byte[32768], 0);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f59642 = false;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C11297 f59655 = new C11297();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f59650 = 0;

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2291() {
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC22486 mo2296() {
        return this;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2294(InterfaceC19502 interfaceC19502) {
        C19378 c19378M34693 = new C14280().m34693(interfaceC19502, C8248.f27128);
        if (c19378M34693 != null) {
            c19378M34693.m44819();
        }
        C21287 c21287 = new C21287(4);
        ((C9169) interfaceC19502).mo10078(false, 0, 4, c21287.m48497());
        return c21287.m48485() == 1716281667;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ܳ */
    public final List mo2297() {
        return AbstractC1928.of();
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2293(InterfaceC12789 interfaceC12789) {
        this.f59652 = interfaceC12789;
        this.f59649 = interfaceC12789.mo16658(0, 1);
        interfaceC12789.mo16661();
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final int mo2289(InterfaceC19502 interfaceC19502, C18756 c18756) throws C2970 {
        InterfaceC9060 c0857;
        long j;
        boolean zM55203;
        int i = this.f59650;
        C19378 c19378 = null;
        boolean z = true;
        if (i == 0) {
            interfaceC19502.mo10076();
            long jMo10072 = interfaceC19502.mo10072();
            C19378 c19378M34693 = new C14280().m34693(interfaceC19502, !this.f59642 ? null : C8248.f27128);
            if (c19378M34693 != null && c19378M34693.m44819() != 0) {
                c19378 = c19378M34693;
            }
            interfaceC19502.mo10073((int) (interfaceC19502.mo10072() - jMo10072));
            this.f59644 = c19378;
            this.f59650 = 1;
            return 0;
        }
        byte[] bArr = this.f59651;
        if (i == 1) {
            interfaceC19502.mo10069(0, bArr.length, bArr);
            interfaceC19502.mo10076();
            this.f59650 = 2;
            return 0;
        }
        if (i == 2) {
            C21287 c21287 = new C21287(4);
            interfaceC19502.readFully(c21287.m48497(), 0, 4);
            if (c21287.m48485() != 1716281667) {
                throw C2970.m9688("Failed to read FLAC stream marker.", (Throwable) null);
            }
            this.f59650 = 3;
            return 0;
        }
        if (i == 3) {
            C23232 c23232M52213 = this.f59648;
            boolean z2 = false;
            while (!z2) {
                interfaceC19502.mo10076();
                byte[] bArr2 = new byte[4];
                C14573 c14573 = new C14573(bArr2, 4);
                interfaceC19502.mo10069(0, 4, bArr2);
                boolean zM35162 = c14573.m35162();
                int iM35163 = c14573.m35163(7);
                int iM35164 = c14573.m35163(24) + 4;
                if (iM35163 == 0) {
                    byte[] bArr3 = new byte[38];
                    interfaceC19502.readFully(bArr3, 0, 38);
                    c23232M52213 = new C23232(bArr3, 4);
                } else {
                    if (c23232M52213 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iM35163 == 3) {
                        C21287 c21288 = new C21287(iM35164);
                        interfaceC19502.readFully(c21288.m48497(), 0, iM35164);
                        c23232M52213 = c23232M52213.m52214(C16518.m39146(c21288));
                    } else if (iM35163 == 4) {
                        C21287 c21289 = new C21287(iM35164);
                        interfaceC19502.readFully(c21289.m48497(), 0, iM35164);
                        c21289.m48503(4);
                        c23232M52213 = c23232M52213.m52215(Arrays.asList(C5616.m16597(c21289, false, false).f63651));
                    } else if (iM35163 == 6) {
                        C21287 c212810 = new C21287(iM35164);
                        interfaceC19502.readFully(c212810.m48497(), 0, iM35164);
                        c212810.m48503(4);
                        c23232M52213 = c23232M52213.m52213(AbstractC1928.of((Object) C17943.m41885(c212810)));
                    } else {
                        interfaceC19502.mo10073(iM35164);
                    }
                }
                String str = C7116.f23455;
                this.f59648 = c23232M52213;
                z2 = zM35162;
            }
            this.f59648.getClass();
            this.f59646 = Math.max(this.f59648.f75251, 6);
            C15648 c15648M52212 = this.f59648.m52212(bArr, this.f59644);
            InterfaceC22024 interfaceC22024 = this.f59649;
            C20124 c20124M37397 = c15648M52212.m37397();
            c20124M37397.m46327("audio/flac");
            interfaceC22024.mo14384(c20124M37397.m46295());
            this.f59649.mo14382(this.f59648.m52211());
            this.f59650 = 4;
            return 0;
        }
        long j2 = 0;
        if (i == 4) {
            interfaceC19502.mo10076();
            C21287 c212811 = new C21287(2);
            interfaceC19502.mo10069(0, 2, c212811.m48497());
            int iM48494 = c212811.m48494();
            if ((iM48494 >> 2) != 16382) {
                interfaceC19502.mo10076();
                throw C2970.m9688("First frame does not start with sync code.", (Throwable) null);
            }
            interfaceC19502.mo10076();
            this.f59647 = iM48494;
            InterfaceC12789 interfaceC12789 = this.f59652;
            String str2 = C7116.f23455;
            long position = interfaceC19502.getPosition();
            long length = interfaceC19502.getLength();
            this.f59648.getClass();
            C23232 c23232 = this.f59648;
            C15772 c15772 = c23232.f75260;
            if (c15772 != null && c15772.f51350.length > 0) {
                c0857 = new C17264(c23232, position);
            } else if (length == -1 || c23232.f75256 <= 0) {
                c0857 = new C0857(c23232.m52211());
            } else {
                C21278 c21278 = new C21278(c23232, this.f59647, position, length);
                this.f59643 = c21278;
                c0857 = c21278.m1675();
            }
            interfaceC12789.mo16659(c0857);
            this.f59650 = 5;
            return 0;
        }
        if (i != 5) {
            throw new IllegalStateException();
        }
        this.f59649.getClass();
        this.f59648.getClass();
        C21278 c21279 = this.f59643;
        if (c21279 != null && c21279.m1677()) {
            return this.f59643.m1674(interfaceC19502, c18756);
        }
        if (this.f59654 == -1) {
            C23232 c23233 = this.f59648;
            interfaceC19502.mo10076();
            interfaceC19502.mo10068(1);
            byte[] bArr4 = new byte[1];
            interfaceC19502.mo10069(0, 1, bArr4);
            boolean z3 = (bArr4[0] & 1) == 1;
            interfaceC19502.mo10068(2);
            int i2 = z3 ? 7 : 6;
            C21287 c212812 = new C21287(i2);
            byte[] bArrM48497 = c212812.m48497();
            int i3 = 0;
            while (i3 < i2) {
                int iMo10075 = interfaceC19502.mo10075(i3, i2 - i3, bArrM48497);
                if (iMo10075 == -1) {
                    break;
                }
                i3 += iMo10075;
            }
            c212812.m48517(i3);
            interfaceC19502.mo10076();
            try {
                long jM48508 = c212812.m48508();
                if (!z3) {
                    jM48508 *= (long) c23233.f75259;
                }
                j2 = jM48508;
            } catch (NumberFormatException unused) {
                z = false;
            }
            if (!z) {
                throw C2970.m9688((String) null, (Throwable) null);
            }
            this.f59654 = j2;
        } else {
            C21287 c212813 = this.f59653;
            int iM48509 = c212813.m48509();
            if (iM48509 < 32768) {
                int i4 = interfaceC19502.read(c212813.m48497(), iM48509, 32768 - iM48509);
                z = i4 == -1;
                if (!z) {
                    c212813.m48517(iM48509 + i4);
                } else if (c212813.m48486() == 0) {
                    long j3 = this.f59654 * 1000000;
                    C23232 c23234 = this.f59648;
                    String str3 = C7116.f23455;
                    this.f59649.mo14383(j3 / ((long) c23234.f75249), 1, this.f59645, 0, null);
                    return -1;
                }
            } else {
                z = false;
            }
            int iM48516 = c212813.m48516();
            int i5 = this.f59645;
            int i6 = this.f59646;
            if (i5 < i6) {
                c212813.m48503(Math.min(i6 - i5, c212813.m48486()));
            }
            this.f59648.getClass();
            int iM48517 = c212813.m48516();
            while (true) {
                int iM485010 = c212813.m48509() - 16;
                C11297 c11297 = this.f59655;
                if (iM48517 > iM485010) {
                    if (z) {
                        while (true) {
                            if (iM48517 <= c212813.m48509() - this.f59646) {
                                c212813.m48510(iM48517);
                                try {
                                    zM55203 = C24724.m55203(c212813, this.f59648, this.f59647, c11297);
                                } catch (IndexOutOfBoundsException unused2) {
                                    zM55203 = false;
                                }
                                if (c212813.m48516() > c212813.m48509()) {
                                    zM55203 = false;
                                }
                                if (zM55203) {
                                    c212813.m48510(iM48517);
                                    j = c11297.f35612;
                                    break;
                                }
                                iM48517++;
                            } else {
                                c212813.m48510(c212813.m48509());
                            }
                        }
                    } else {
                        c212813.m48510(iM48517);
                    }
                    j = -1;
                    break;
                }
                c212813.m48510(iM48517);
                if (C24724.m55203(c212813, this.f59648, this.f59647, c11297)) {
                    c212813.m48510(iM48517);
                    j = c11297.f35612;
                    break;
                }
                iM48517++;
            }
            int iM48518 = c212813.m48516() - iM48516;
            c212813.m48510(iM48516);
            this.f59649.mo14381(iM48518, c212813);
            int i7 = this.f59645 + iM48518;
            this.f59645 = i7;
            if (j != -1) {
                long j4 = this.f59654 * 1000000;
                C23232 c23235 = this.f59648;
                String str4 = C7116.f23455;
                this.f59649.mo14383(j4 / ((long) c23235.f75249), 1, i7, 0, null);
                this.f59645 = 0;
                this.f59654 = j;
            }
            int length2 = c212813.m48497().length - c212813.m48509();
            if (c212813.m48486() < 16 && length2 < 16) {
                int iM48486 = c212813.m48486();
                System.arraycopy(c212813.m48497(), c212813.m48516(), c212813.m48497(), 0, iM48486);
                c212813.m48510(0);
                c212813.m48517(iM48486);
            }
        }
        return 0;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2292(long j, long j2) {
        if (j == 0) {
            this.f59650 = 0;
        } else {
            C21278 c21278 = this.f59643;
            if (c21278 != null) {
                c21278.m1676(j2);
            }
        }
        this.f59654 = j2 != 0 ? -1L : 0L;
        this.f59645 = 0;
        this.f59653.m48496(0);
    }
}
