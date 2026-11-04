package l;

import java.io.EOFException;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: renamed from: l.۟ܺ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 58Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8006 implements InterfaceC22486 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C1402 f26587 = new C1402();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6078 f26588;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C21287 f26589;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f26590;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f26591;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f26592;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C4586 f26593;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f26594;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14280 f26595;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC10242 f26596;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f26597;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f26598;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f26599;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C19378 f26600;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC22024 f26601;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC12789 f26602;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long f26603;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC22024 f26604;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f26605;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f26606;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C18010 f26607;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f26608;

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
    /* JADX INFO: renamed from: ܳ */
    public final List mo2297() {
        return AbstractC1928.of();
    }

    public C8006(int i) {
        this(i, -9223372036854775807L);
    }

    public C8006(int i, long j) {
        this.f26597 = (i & 2) != 0 ? i | 1 : i;
        this.f26592 = j;
        this.f26589 = new C21287(10);
        this.f26607 = new C18010();
        this.f26588 = new C6078();
        this.f26591 = -9223372036854775807L;
        this.f26595 = new C14280();
        C4586 c4586 = new C4586();
        this.f26593 = c4586;
        this.f26604 = c4586;
        this.f26605 = -1L;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2294(InterfaceC19502 interfaceC19502) {
        return m21863(interfaceC19502, true);
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2293(InterfaceC12789 interfaceC12789) {
        this.f26602 = interfaceC12789;
        InterfaceC22024 interfaceC22024Mo16658 = interfaceC12789.mo16658(0, 1);
        this.f26601 = interfaceC22024Mo16658;
        this.f26604 = interfaceC22024Mo16658;
        this.f26602.mo16661();
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2292(long j, long j2) {
        this.f26590 = 0;
        this.f26591 = -9223372036854775807L;
        this.f26606 = 0L;
        this.f26599 = 0;
        this.f26603 = j2;
        InterfaceC10242 interfaceC10242 = this.f26596;
        if (!(interfaceC10242 instanceof C18447) || ((C18447) interfaceC10242).m42978(j2)) {
            return;
        }
        this.f26608 = true;
        this.f26604 = this.f26593;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m21866() {
        this.f26594 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m21863(InterfaceC19502 interfaceC19502, boolean z) throws EOFException {
        int i;
        int iMo10072;
        int iM1220;
        int i2 = z ? 32768 : 524288;
        interfaceC19502.mo10076();
        if (interfaceC19502.getPosition() == 0) {
            C19378 c19378M34693 = this.f26595.m34693(interfaceC19502, (this.f26597 & 8) == 0 ? null : f26587);
            this.f26600 = c19378M34693;
            if (c19378M34693 != null) {
                this.f26588.m17594(c19378M34693);
            }
            iMo10072 = (int) interfaceC19502.mo10072();
            if (!z) {
                interfaceC19502.mo10073(iMo10072);
            }
            i = 0;
        } else {
            i = 0;
            iMo10072 = 0;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (m21864(interfaceC19502)) {
                if (i3 > 0) {
                    break;
                }
                m21865();
                throw new EOFException();
            }
            C21287 c21287 = this.f26589;
            c21287.m48510(0);
            int iM48500 = c21287.m48500();
            if ((i == 0 || ((-128000) & iM48500) == (((long) i) & (-128000))) && (iM1220 = C0111.m1220(iM48500)) != -1) {
                i3++;
                if (i3 != 1) {
                    if (i3 == 4) {
                        break;
                    }
                } else {
                    this.f26607.m41989(iM48500);
                    i = iM48500;
                }
                interfaceC19502.mo10068(iM1220 - 4);
            } else {
                int i5 = i4 + 1;
                if (i4 == i2) {
                    if (z) {
                        return false;
                    }
                    m21865();
                    throw new EOFException();
                }
                if (z) {
                    interfaceC19502.mo10076();
                    interfaceC19502.mo10068(iMo10072 + i5);
                } else {
                    interfaceC19502.mo10073(1);
                }
                i4 = i5;
                i = 0;
                i3 = 0;
            }
        }
        if (z) {
            interfaceC19502.mo10073(iMo10072 + i4);
        } else {
            interfaceC19502.mo10076();
        }
        this.f26590 = i;
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m21864(InterfaceC19502 interfaceC19502) {
        InterfaceC10242 interfaceC10242 = this.f26596;
        if (interfaceC10242 != null) {
            long jMo2550 = interfaceC10242.mo2550();
            if (jMo2550 == -1 || interfaceC19502.mo10072() <= jMo2550 - 4) {
            }
            return true;
        }
        try {
            return !interfaceC19502.mo10078(true, 0, 4, this.f26589.m48497());
        } catch (EOFException unused) {
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m21865() {
        InterfaceC9060 interfaceC9060 = this.f26596;
        if ((interfaceC9060 instanceof C21431) && ((C0967) interfaceC9060).mo2298()) {
            long j = this.f26605;
            if (j == -1 || j == this.f26596.mo2550()) {
                return;
            }
            this.f26596 = ((C21431) this.f26596).m48754(this.f26605);
            InterfaceC12789 interfaceC12789 = this.f26602;
            interfaceC12789.getClass();
            interfaceC12789.mo16659(this.f26596);
            InterfaceC22024 interfaceC22024 = this.f26601;
            interfaceC22024.getClass();
            interfaceC22024.mo14382(this.f26596.mo2295());
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0247 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0249  */
    /* JADX WARN: Code duplicated, block: B:11:0x003e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0253  */
    /* JADX WARN: Code duplicated, block: B:124:0x0257  */
    /* JADX WARN: Code duplicated, block: B:125:0x025b  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:131:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:134:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:136:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:138:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Code duplicated, block: B:140:0x0309  */
    /* JADX WARN: Code duplicated, block: B:144:0x0315  */
    /* JADX WARN: Code duplicated, block: B:147:0x0320  */
    /* JADX WARN: Code duplicated, block: B:149:0x0338  */
    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    /* JADX WARN: Code duplicated, block: B:151:0x033f  */
    /* JADX WARN: Code duplicated, block: B:152:0x0342  */
    /* JADX WARN: Code duplicated, block: B:154:0x0350  */
    /* JADX WARN: Code duplicated, block: B:156:0x0362  */
    /* JADX WARN: Code duplicated, block: B:159:0x0382  */
    /* JADX WARN: Code duplicated, block: B:164:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:166:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:168:0x03be  */
    /* JADX WARN: Code duplicated, block: B:169:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:172:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX WARN: Code duplicated, block: B:183:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x005f  */
    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Code duplicated, block: B:32:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    /* JADX WARN: Code duplicated, block: B:37:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:54:0x0107  */
    /* JADX WARN: Code duplicated, block: B:57:0x0118  */
    /* JADX WARN: Code duplicated, block: B:59:0x011f  */
    /* JADX WARN: Code duplicated, block: B:62:0x012e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0132  */
    /* JADX WARN: Code duplicated, block: B:66:0x013b  */
    /* JADX WARN: Code duplicated, block: B:68:0x013f  */
    /* JADX WARN: Code duplicated, block: B:70:0x016e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0178  */
    /* JADX WARN: Code duplicated, block: B:75:0x017f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0192 A[LOOP:0: B:74:0x017d->B:78:0x0192, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x0195 A[EDGE_INSN: B:79:0x0195->B:80:0x0196 BREAK  A[LOOP:0: B:74:0x017d->B:78:0x0192]] */
    /* JADX WARN: Code duplicated, block: B:82:0x019c  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x01da  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final int mo2289(InterfaceC19502 interfaceC19502, C18756 c18756) {
        int i;
        int i2;
        long j;
        InterfaceC10242 interfaceC10242;
        C21287 c21287;
        long j2;
        long position;
        long j3;
        int iMo14380;
        int i3;
        int iM48500;
        int i4;
        int i5;
        long position2;
        InterfaceC10242 interfaceC10243;
        long j4;
        C21287 c21288;
        int i6;
        int iM48501;
        C6078 c6078;
        C9496 c9496M24874;
        long j5;
        int i7;
        int i8;
        long position3;
        long j6;
        long length;
        long jM24875;
        C18010 c18010;
        InterfaceC10242 c21431;
        int i9;
        long j7;
        C19378 c19378;
        long position4;
        C0548 c0548M2546;
        boolean z;
        int i10;
        boolean z2;
        long length2;
        long jM21862;
        long jMo2550;
        long j8;
        C20124 c20124;
        C19378 c19379;
        int iM44819;
        int i11;
        InterfaceC8191 interfaceC8191M44820;
        C20782.m47566(this.f26601);
        String str = C7116.f23455;
        int i12 = this.f26590;
        C18010 c18011 = this.f26607;
        if (i12 == 0) {
            try {
                m21863(interfaceC19502, false);
                interfaceC10242 = this.f26596;
                c21287 = this.f26589;
                if (interfaceC10242 == null) {
                    c21288 = new C21287(c18011.f58964);
                    interfaceC19502.mo10069(0, c18011.f58964, c21288.m48497());
                    i6 = 21;
                    if ((c18011.f58965 & 1) != 0) {
                        if (c18011.f58968 != 1) {
                            i6 = 36;
                        }
                    } else if (c18011.f58968 == 1) {
                        i6 = 13;
                    }
                    if (c21288.m48509() >= i6 + 4) {
                        c21288.m48510(i6);
                        iM48501 = c21288.m48500();
                        if (iM48501 != 1483304551 && iM48501 != 1231971951) {
                            if (c21288.m48509() >= 40) {
                                c21288.m48510(36);
                                if (c21288.m48500() == 1447187017) {
                                    iM48501 = 1447187017;
                                } else {
                                    iM48501 = 0;
                                }
                            } else {
                                iM48501 = 0;
                            }
                        }
                    } else if (c21288.m48509() >= 40) {
                        c21288.m48510(36);
                        if (c21288.m48500() == 1447187017) {
                            iM48501 = 1447187017;
                        } else {
                            iM48501 = 0;
                        }
                    } else {
                        iM48501 = 0;
                    }
                    c6078 = this.f26588;
                    if (iM48501 == 1231971951) {
                        c9496M24874 = C9496.m24874(c18011, c21288);
                        j5 = c9496M24874.f30769;
                        if ((c6078.f20801 != -1 || c6078.f20802 == -1) && (i7 = c9496M24874.f30773) != -1 && (i8 = c9496M24874.f30770) != -1) {
                            c6078.f20801 = i7;
                            c6078.f20802 = i8;
                        }
                        position3 = interfaceC19502.getPosition();
                        if (interfaceC19502.getLength() != -1 || j5 == -1) {
                            j6 = -9223372036854775807L;
                        } else {
                            j6 = -9223372036854775807L;
                            long j9 = position3 + j5;
                            if (interfaceC19502.getLength() != j9) {
                                C1896.m6513("Data size mismatch between stream (" + interfaceC19502.getLength() + ") and Xing frame (" + j9 + "), using Xing value.");
                            }
                        }
                        interfaceC19502.mo10073(c18011.f58964);
                        if (iM48501 == 1483304551) {
                            c21431 = C2785.m9252(c9496M24874, position3);
                        } else {
                            length = interfaceC19502.getLength();
                            jM24875 = c9496M24874.m24875();
                            c18010 = c9496M24874.f30772;
                            if (jM24875 != j6) {
                                if (j5 != -1) {
                                    length = position3 + j5;
                                    i9 = c18010.f58964;
                                } else if (length != -1) {
                                    j5 = length - position3;
                                    i9 = c18010.f58964;
                                } else {
                                    c21431 = null;
                                }
                                long j10 = j5 - ((long) i9);
                                long j11 = length;
                                RoundingMode roundingMode = RoundingMode.HALF_UP;
                                c21431 = new C21431(C18444.m42970(C7116.m19477(j10, 8000000L, jM24875, roundingMode)), C18444.m42970(C20682.m47306(j10, c9496M24874.f30774, roundingMode)), j11, position3 + ((long) c18010.f58964), false);
                            } else {
                                c21431 = null;
                            }
                        }
                        j7 = j6;
                    } else {
                        if (iM48501 != 1447187017) {
                            c21431 = C1294.m4687(interfaceC19502.getLength(), interfaceC19502.getPosition(), this.f26607, c21288);
                            interfaceC19502.mo10073(c18011.f58964);
                        } else if (iM48501 != 1483304551) {
                            c9496M24874 = C9496.m24874(c18011, c21288);
                            j5 = c9496M24874.f30769;
                            if (c6078.f20801 != -1) {
                                c6078.f20801 = i7;
                                c6078.f20802 = i8;
                            } else {
                                c6078.f20801 = i7;
                                c6078.f20802 = i8;
                            }
                            position3 = interfaceC19502.getPosition();
                            if (interfaceC19502.getLength() != -1) {
                                j6 = -9223372036854775807L;
                            } else {
                                j6 = -9223372036854775807L;
                            }
                            interfaceC19502.mo10073(c18011.f58964);
                            if (iM48501 == 1483304551) {
                                c21431 = C2785.m9252(c9496M24874, position3);
                            } else {
                                length = interfaceC19502.getLength();
                                jM24875 = c9496M24874.m24875();
                                c18010 = c9496M24874.f30772;
                                if (jM24875 != j6) {
                                    if (j5 != -1) {
                                        length = position3 + j5;
                                        i9 = c18010.f58964;
                                    } else if (length != -1) {
                                        j5 = length - position3;
                                        i9 = c18010.f58964;
                                    } else {
                                        c21431 = null;
                                    }
                                    long j12 = j5 - ((long) i9);
                                    long j13 = length;
                                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                                    c21431 = new C21431(C18444.m42970(C7116.m19477(j12, 8000000L, jM24875, roundingMode2)), C18444.m42970(C20682.m47306(j12, c9496M24874.f30774, roundingMode2)), j13, position3 + ((long) c18010.f58964), false);
                                } else {
                                    c21431 = null;
                                }
                            }
                            j7 = j6;
                        } else {
                            interfaceC19502.mo10076();
                            c21431 = null;
                        }
                        j7 = -9223372036854775807L;
                    }
                    c19378 = this.f26600;
                    position4 = interfaceC19502.getPosition();
                    if (c19378 != null) {
                        c0548M2546 = null;
                        break;
                    }
                    iM44819 = c19378.m44819();
                    i11 = 0;
                    while (true) {
                        if (i11 < iM44819) {
                            c0548M2546 = null;
                            break;
                        }
                        interfaceC8191M44820 = c19378.m44820(i11);
                        if (interfaceC8191M44820 instanceof C9738) {
                            c0548M2546 = C0548.m2546(position4, (C9738) interfaceC8191M44820, m21862(c19378));
                            break;
                        }
                        i11++;
                    }
                    z = this.f26594;
                    i10 = this.f26597;
                    if (z) {
                        c21431 = new C19193(j7);
                    } else {
                        if ((i10 & 4) != 0) {
                            if (c0548M2546 != null) {
                                jM21862 = c0548M2546.mo2295();
                            } else {
                                if (c21431 != null) {
                                    long jMo2295 = c21431.mo2295();
                                    jMo2550 = c21431.mo2550();
                                    j8 = jMo2295;
                                } else {
                                    jM21862 = m21862(this.f26600);
                                }
                                c21431 = new C18447(j8, interfaceC19502.getPosition(), jMo2550);
                            }
                            j8 = jM21862;
                            jMo2550 = -1;
                            c21431 = new C18447(j8, interfaceC19502.getPosition(), jMo2550);
                        } else if (c0548M2546 != null) {
                            c21431 = c0548M2546;
                        } else if (c21431 == null) {
                            c21431 = null;
                        }
                        if (c21431 == null && !c21431.mo2298() && (i10 & 1) != 0 && c21431.mo2295() != -9223372036854775807L && (c21431.mo2550() != -1 || interfaceC19502.getLength() != -1)) {
                            long jMo2548 = c21431.mo2548() != -1 ? c21431.mo2548() : 0L;
                            if (c21431.mo2550() != -1) {
                                length2 = c21431.mo2550();
                            } else {
                                length2 = interfaceC19502.getLength();
                            }
                            long j14 = length2;
                            c21431 = new C21431(C18444.m42974(C7116.m19477(j14 - jMo2548, 8000000L, c21431.mo2295(), RoundingMode.HALF_UP)), -1, j14, jMo2548, false);
                        } else if (c21431 != null || (!c21431.mo2298() && (i10 & 1) != 0)) {
                            if ((i10 & 2) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            interfaceC19502.mo10069(0, 4, c21287.m48497());
                            c21287.m48510(0);
                            c18011.m41989(c21287.m48500());
                            c21431 = new C21431(c18011.f58963, c18011.f58964, interfaceC19502.getLength(), interfaceC19502.getPosition(), z2);
                        }
                        this.f26601.mo14382(c21431.mo2295());
                    }
                    this.f26596 = c21431;
                    this.f26602.mo16659(c21431);
                    c20124 = new C20124();
                    c20124.m46327("audio/mpeg");
                    c20124.m46315(c18011.f58969);
                    c20124.m46318(4096);
                    c20124.m46329(c18011.f58968);
                    c20124.m46332(c18011.f58967);
                    c20124.m46292(c6078.f20801);
                    c20124.m46310(c6078.f20802);
                    if ((i10 & 8) != 0) {
                        c19379 = null;
                    } else {
                        c19379 = this.f26600;
                    }
                    c20124.m46303(c19379);
                    if (this.f26596.mo2547() != -2147483647) {
                        c20124.m46308(this.f26596.mo2547());
                    }
                    this.f26604.mo14384(c20124.m46295());
                    this.f26598 = interfaceC19502.getPosition();
                    j2 = 0;
                    j = 1000000;
                } else {
                    if (this.f26598 != 0) {
                        position = interfaceC19502.getPosition();
                        j3 = this.f26598;
                        if (position < j3) {
                            interfaceC19502.mo10073((int) (j3 - position));
                        }
                    }
                    j = 1000000;
                    j2 = 0;
                }
                if (this.f26599 == 0) {
                    interfaceC19502.mo10076();
                    if (m21864(interfaceC19502)) {
                        i = -1;
                        i2 = -1;
                    } else {
                        c21287.m48510(0);
                        iM48500 = c21287.m48500();
                        if (((-128000) & iM48500) == (((long) this.f26590) & (-128000))) {
                            i4 = 0;
                            i5 = 1;
                        } else if (C0111.m1220(iM48500) == -1) {
                            i5 = 1;
                            i4 = 0;
                        } else {
                            c18011.m41989(iM48500);
                            if (this.f26591 == -9223372036854775807L) {
                                this.f26591 = this.f26596.mo2549(interfaceC19502.getPosition());
                                j4 = this.f26592;
                                if (j4 != -9223372036854775807L) {
                                    this.f26591 = (j4 - this.f26596.mo2549(j2)) + this.f26591;
                                }
                            }
                            this.f26599 = c18011.f58964;
                            position2 = interfaceC19502.getPosition() + ((long) c18011.f58964);
                            this.f26605 = position2;
                            interfaceC10243 = this.f26596;
                            if (interfaceC10243 instanceof C18447) {
                                C18447 c18447 = (C18447) interfaceC10243;
                                c18447.m42977((((this.f26606 + ((long) c18011.f58966)) * j) / ((long) c18011.f58967)) + this.f26591, position2);
                                if (this.f26608 && c18447.m42978(this.f26603)) {
                                    this.f26608 = false;
                                    this.f26604 = this.f26601;
                                }
                            }
                            iMo14380 = this.f26604.mo14380((InterfaceC9461) interfaceC19502, this.f26599, true);
                            if (iMo14380 == -1) {
                                i = -1;
                                i2 = -1;
                            } else {
                                i3 = this.f26599 - iMo14380;
                                this.f26599 = i3;
                                if (i3 <= 0) {
                                    this.f26604.mo14383(this.f26591 + ((this.f26606 * j) / ((long) c18011.f58967)), 1, c18011.f58964, 0, null);
                                    this.f26606 += (long) c18011.f58966;
                                    this.f26599 = 0;
                                }
                                i = -1;
                                i2 = 0;
                            }
                        }
                        interfaceC19502.mo10073(i5);
                        this.f26590 = i4;
                        i = -1;
                        i2 = 0;
                    }
                } else {
                    iMo14380 = this.f26604.mo14380((InterfaceC9461) interfaceC19502, this.f26599, true);
                    if (iMo14380 == -1) {
                        i = -1;
                        i2 = -1;
                    } else {
                        i3 = this.f26599 - iMo14380;
                        this.f26599 = i3;
                        if (i3 <= 0) {
                            this.f26604.mo14383(this.f26591 + ((this.f26606 * j) / ((long) c18011.f58967)), 1, c18011.f58964, 0, null);
                            this.f26606 += (long) c18011.f58966;
                            this.f26599 = 0;
                        }
                        i = -1;
                        i2 = 0;
                    }
                }
            } catch (EOFException unused) {
                i = -1;
                i2 = -1;
                j = 1000000;
            }
        } else {
            interfaceC10242 = this.f26596;
            c21287 = this.f26589;
            if (interfaceC10242 == null) {
                c21288 = new C21287(c18011.f58964);
                interfaceC19502.mo10069(0, c18011.f58964, c21288.m48497());
                i6 = 21;
                if ((c18011.f58965 & 1) != 0) {
                    if (c18011.f58968 != 1) {
                        i6 = 36;
                    }
                } else if (c18011.f58968 == 1) {
                    i6 = 13;
                }
                if (c21288.m48509() >= i6 + 4) {
                    c21288.m48510(i6);
                    iM48501 = c21288.m48500();
                    if (iM48501 != 1483304551) {
                        if (c21288.m48509() >= 40) {
                            c21288.m48510(36);
                            if (c21288.m48500() == 1447187017) {
                                iM48501 = 1447187017;
                            } else {
                                iM48501 = 0;
                            }
                        } else {
                            iM48501 = 0;
                        }
                    }
                } else if (c21288.m48509() >= 40) {
                    c21288.m48510(36);
                    if (c21288.m48500() == 1447187017) {
                        iM48501 = 1447187017;
                    } else {
                        iM48501 = 0;
                    }
                } else {
                    iM48501 = 0;
                }
                c6078 = this.f26588;
                if (iM48501 == 1231971951) {
                    c9496M24874 = C9496.m24874(c18011, c21288);
                    j5 = c9496M24874.f30769;
                    if (c6078.f20801 != -1) {
                        c6078.f20801 = i7;
                        c6078.f20802 = i8;
                    } else {
                        c6078.f20801 = i7;
                        c6078.f20802 = i8;
                    }
                    position3 = interfaceC19502.getPosition();
                    if (interfaceC19502.getLength() != -1) {
                        j6 = -9223372036854775807L;
                    } else {
                        j6 = -9223372036854775807L;
                    }
                    interfaceC19502.mo10073(c18011.f58964);
                    if (iM48501 == 1483304551) {
                        c21431 = C2785.m9252(c9496M24874, position3);
                    } else {
                        length = interfaceC19502.getLength();
                        jM24875 = c9496M24874.m24875();
                        c18010 = c9496M24874.f30772;
                        if (jM24875 != j6) {
                            if (j5 != -1) {
                                length = position3 + j5;
                                i9 = c18010.f58964;
                            } else if (length != -1) {
                                j5 = length - position3;
                                i9 = c18010.f58964;
                            } else {
                                c21431 = null;
                            }
                            long j15 = j5 - ((long) i9);
                            long j16 = length;
                            RoundingMode roundingMode3 = RoundingMode.HALF_UP;
                            c21431 = new C21431(C18444.m42970(C7116.m19477(j15, 8000000L, jM24875, roundingMode3)), C18444.m42970(C20682.m47306(j15, c9496M24874.f30774, roundingMode3)), j16, position3 + ((long) c18010.f58964), false);
                        } else {
                            c21431 = null;
                        }
                    }
                    j7 = j6;
                } else {
                    if (iM48501 != 1447187017) {
                        c21431 = C1294.m4687(interfaceC19502.getLength(), interfaceC19502.getPosition(), this.f26607, c21288);
                        interfaceC19502.mo10073(c18011.f58964);
                    } else if (iM48501 != 1483304551) {
                        c9496M24874 = C9496.m24874(c18011, c21288);
                        j5 = c9496M24874.f30769;
                        if (c6078.f20801 != -1) {
                            c6078.f20801 = i7;
                            c6078.f20802 = i8;
                        } else {
                            c6078.f20801 = i7;
                            c6078.f20802 = i8;
                        }
                        position3 = interfaceC19502.getPosition();
                        if (interfaceC19502.getLength() != -1) {
                            j6 = -9223372036854775807L;
                        } else {
                            j6 = -9223372036854775807L;
                        }
                        interfaceC19502.mo10073(c18011.f58964);
                        if (iM48501 == 1483304551) {
                            c21431 = C2785.m9252(c9496M24874, position3);
                        } else {
                            length = interfaceC19502.getLength();
                            jM24875 = c9496M24874.m24875();
                            c18010 = c9496M24874.f30772;
                            if (jM24875 != j6) {
                                if (j5 != -1) {
                                    length = position3 + j5;
                                    i9 = c18010.f58964;
                                } else if (length != -1) {
                                    j5 = length - position3;
                                    i9 = c18010.f58964;
                                } else {
                                    c21431 = null;
                                }
                                long j17 = j5 - ((long) i9);
                                long j18 = length;
                                RoundingMode roundingMode4 = RoundingMode.HALF_UP;
                                c21431 = new C21431(C18444.m42970(C7116.m19477(j17, 8000000L, jM24875, roundingMode4)), C18444.m42970(C20682.m47306(j17, c9496M24874.f30774, roundingMode4)), j18, position3 + ((long) c18010.f58964), false);
                            } else {
                                c21431 = null;
                            }
                        }
                        j7 = j6;
                    } else {
                        interfaceC19502.mo10076();
                        c21431 = null;
                    }
                    j7 = -9223372036854775807L;
                }
                c19378 = this.f26600;
                position4 = interfaceC19502.getPosition();
                if (c19378 != null) {
                    c0548M2546 = null;
                    break;
                }
                iM44819 = c19378.m44819();
                i11 = 0;
                while (true) {
                    if (i11 < iM44819) {
                        c0548M2546 = null;
                        break;
                    }
                    interfaceC8191M44820 = c19378.m44820(i11);
                    if (interfaceC8191M44820 instanceof C9738) {
                        c0548M2546 = C0548.m2546(position4, (C9738) interfaceC8191M44820, m21862(c19378));
                        break;
                    }
                    i11++;
                }
                z = this.f26594;
                i10 = this.f26597;
                if (z) {
                    c21431 = new C19193(j7);
                } else {
                    if ((i10 & 4) != 0) {
                        if (c0548M2546 != null) {
                            jM21862 = c0548M2546.mo2295();
                        } else {
                            if (c21431 != null) {
                                long jMo2296 = c21431.mo2295();
                                jMo2550 = c21431.mo2550();
                                j8 = jMo2296;
                            } else {
                                jM21862 = m21862(this.f26600);
                            }
                            c21431 = new C18447(j8, interfaceC19502.getPosition(), jMo2550);
                        }
                        j8 = jM21862;
                        jMo2550 = -1;
                        c21431 = new C18447(j8, interfaceC19502.getPosition(), jMo2550);
                    } else if (c0548M2546 != null) {
                        c21431 = c0548M2546;
                    } else if (c21431 == null) {
                        c21431 = null;
                    }
                    if (c21431 == null) {
                        if (c21431 != null) {
                            if ((i10 & 2) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            interfaceC19502.mo10069(0, 4, c21287.m48497());
                            c21287.m48510(0);
                            c18011.m41989(c21287.m48500());
                            c21431 = new C21431(c18011.f58963, c18011.f58964, interfaceC19502.getLength(), interfaceC19502.getPosition(), z2);
                        } else {
                            if ((i10 & 2) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            interfaceC19502.mo10069(0, 4, c21287.m48497());
                            c21287.m48510(0);
                            c18011.m41989(c21287.m48500());
                            c21431 = new C21431(c18011.f58963, c18011.f58964, interfaceC19502.getLength(), interfaceC19502.getPosition(), z2);
                        }
                    } else if (c21431 != null) {
                        if ((i10 & 2) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        interfaceC19502.mo10069(0, 4, c21287.m48497());
                        c21287.m48510(0);
                        c18011.m41989(c21287.m48500());
                        c21431 = new C21431(c18011.f58963, c18011.f58964, interfaceC19502.getLength(), interfaceC19502.getPosition(), z2);
                    } else {
                        if ((i10 & 2) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        interfaceC19502.mo10069(0, 4, c21287.m48497());
                        c21287.m48510(0);
                        c18011.m41989(c21287.m48500());
                        c21431 = new C21431(c18011.f58963, c18011.f58964, interfaceC19502.getLength(), interfaceC19502.getPosition(), z2);
                    }
                    this.f26601.mo14382(c21431.mo2295());
                }
                this.f26596 = c21431;
                this.f26602.mo16659(c21431);
                c20124 = new C20124();
                c20124.m46327("audio/mpeg");
                c20124.m46315(c18011.f58969);
                c20124.m46318(4096);
                c20124.m46329(c18011.f58968);
                c20124.m46332(c18011.f58967);
                c20124.m46292(c6078.f20801);
                c20124.m46310(c6078.f20802);
                if ((i10 & 8) != 0) {
                    c19379 = null;
                } else {
                    c19379 = this.f26600;
                }
                c20124.m46303(c19379);
                if (this.f26596.mo2547() != -2147483647) {
                    c20124.m46308(this.f26596.mo2547());
                }
                this.f26604.mo14384(c20124.m46295());
                this.f26598 = interfaceC19502.getPosition();
                j2 = 0;
                j = 1000000;
            } else {
                if (this.f26598 != 0) {
                    position = interfaceC19502.getPosition();
                    j3 = this.f26598;
                    if (position < j3) {
                        interfaceC19502.mo10073((int) (j3 - position));
                    }
                }
                j = 1000000;
                j2 = 0;
            }
            if (this.f26599 == 0) {
                interfaceC19502.mo10076();
                if (m21864(interfaceC19502)) {
                    i = -1;
                    i2 = -1;
                } else {
                    c21287.m48510(0);
                    iM48500 = c21287.m48500();
                    if (((-128000) & iM48500) == (((long) this.f26590) & (-128000))) {
                        i4 = 0;
                        i5 = 1;
                    } else if (C0111.m1220(iM48500) == -1) {
                        i5 = 1;
                        i4 = 0;
                    } else {
                        c18011.m41989(iM48500);
                        if (this.f26591 == -9223372036854775807L) {
                            this.f26591 = this.f26596.mo2549(interfaceC19502.getPosition());
                            j4 = this.f26592;
                            if (j4 != -9223372036854775807L) {
                                this.f26591 = (j4 - this.f26596.mo2549(j2)) + this.f26591;
                            }
                        }
                        this.f26599 = c18011.f58964;
                        position2 = interfaceC19502.getPosition() + ((long) c18011.f58964);
                        this.f26605 = position2;
                        interfaceC10243 = this.f26596;
                        if (interfaceC10243 instanceof C18447) {
                            C18447 c18448 = (C18447) interfaceC10243;
                            c18448.m42977((((this.f26606 + ((long) c18011.f58966)) * j) / ((long) c18011.f58967)) + this.f26591, position2);
                            if (this.f26608) {
                                this.f26608 = false;
                                this.f26604 = this.f26601;
                            }
                        }
                        iMo14380 = this.f26604.mo14380((InterfaceC9461) interfaceC19502, this.f26599, true);
                        if (iMo14380 == -1) {
                            i = -1;
                            i2 = -1;
                        } else {
                            i3 = this.f26599 - iMo14380;
                            this.f26599 = i3;
                            if (i3 <= 0) {
                                this.f26604.mo14383(this.f26591 + ((this.f26606 * j) / ((long) c18011.f58967)), 1, c18011.f58964, 0, null);
                                this.f26606 += (long) c18011.f58966;
                                this.f26599 = 0;
                            }
                            i = -1;
                            i2 = 0;
                        }
                    }
                    interfaceC19502.mo10073(i5);
                    this.f26590 = i4;
                    i = -1;
                    i2 = 0;
                }
            } else {
                iMo14380 = this.f26604.mo14380((InterfaceC9461) interfaceC19502, this.f26599, true);
                if (iMo14380 == -1) {
                    i = -1;
                    i2 = -1;
                } else {
                    i3 = this.f26599 - iMo14380;
                    this.f26599 = i3;
                    if (i3 <= 0) {
                        this.f26604.mo14383(this.f26591 + ((this.f26606 * j) / ((long) c18011.f58967)), 1, c18011.f58964, 0, null);
                        this.f26606 += (long) c18011.f58966;
                        this.f26599 = 0;
                    }
                    i = -1;
                    i2 = 0;
                }
            }
        }
        if (i2 == i) {
            InterfaceC10242 interfaceC10244 = this.f26596;
            if (interfaceC10244 instanceof C18447) {
                long j19 = ((this.f26606 * j) / ((long) c18011.f58967)) + this.f26591;
                if (interfaceC10244.mo2295() != j19) {
                    ((C18447) this.f26596).m42979(j19);
                    this.f26602.mo16659(this.f26596);
                    this.f26601.mo14382(this.f26596.mo2295());
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m21862(C19378 c19378) {
        if (c19378 == null) {
            return -9223372036854775807L;
        }
        int iM44819 = c19378.m44819();
        for (int i = 0; i < iM44819; i++) {
            InterfaceC8191 interfaceC8191M44820 = c19378.m44820(i);
            if (interfaceC8191M44820 instanceof C8993) {
                C8993 c8993 = (C8993) interfaceC8191M44820;
                if (c8993.f62806.equals("TLEN")) {
                    return C7116.m19474(Long.parseLong((String) c8993.f29298.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }
}
