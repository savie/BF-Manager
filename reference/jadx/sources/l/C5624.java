package l;

import java.io.EOFException;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: renamed from: l.ۚ᩸ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5624 implements InterfaceC10045 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C3509 f19253 = new C3509();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f19254;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f19255;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C2988 f19256;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f19257;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC15690 f19258;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C11539 f19259;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C5188 f19260;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C2460 f19261;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public InterfaceC1390 f19262;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C7928 f19263;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f19264;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f19265;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC8011 f19266;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C0987 f19267;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f19268;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f19269;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long f19270;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f19271;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC8011 f19272;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f19273;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f19274;

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2751() {
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC10045 mo2755() {
        return this;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ᩹ */
    public final List mo2756() {
        return AbstractC22433.of();
    }

    public C5624(int i) {
        this(i, -9223372036854775807L);
    }

    public C5624(int i, long j) {
        this.f19254 = (i & 2) != 0 ? i | 1 : i;
        this.f19265 = j;
        this.f19261 = new C2460(10);
        this.f19260 = new C5188();
        this.f19256 = new C2988();
        this.f19257 = -9223372036854775807L;
        this.f19259 = new C11539();
        C7928 c7928 = new C7928();
        this.f19263 = c7928;
        this.f19266 = c7928;
        this.f19255 = -1L;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2754(InterfaceC7222 interfaceC7222) {
        return m15515(interfaceC7222, true);
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2753(InterfaceC15690 interfaceC15690) {
        this.f19258 = interfaceC15690;
        InterfaceC8011 interfaceC8011Mo7684 = interfaceC15690.mo7684(0, 1);
        this.f19272 = interfaceC8011Mo7684;
        this.f19266 = interfaceC8011Mo7684;
        this.f19258.mo7696();
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2752(long j, long j2) {
        this.f19271 = 0;
        this.f19257 = -9223372036854775807L;
        this.f19269 = 0L;
        this.f19268 = 0;
        this.f19270 = j2;
        InterfaceC1390 interfaceC1390 = this.f19262;
        if (!(interfaceC1390 instanceof C11975) || ((C11975) interfaceC1390).m29783(j2)) {
            return;
        }
        this.f19274 = true;
        this.f19266 = this.f19263;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m15517() {
        this.f19264 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m15515(InterfaceC7222 interfaceC7222, boolean z) throws EOFException {
        int i;
        int iMo19213;
        int iM49077;
        int i2 = z ? 32768 : 524288;
        interfaceC7222.mo19217();
        if (interfaceC7222.getPosition() == 0) {
            C0987 c0987M28713 = this.f19259.m28713(interfaceC7222, (this.f19254 & 8) == 0 ? null : f19253);
            this.f19267 = c0987M28713;
            if (c0987M28713 != null) {
                this.f19256.m8941(c0987M28713);
            }
            iMo19213 = (int) interfaceC7222.mo19213();
            if (!z) {
                interfaceC7222.mo19214(iMo19213);
            }
            i = 0;
        } else {
            i = 0;
            iMo19213 = 0;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (m15516(interfaceC7222)) {
                if (i3 > 0) {
                    break;
                }
                m15513();
                throw new EOFException();
            }
            C2460 c2460 = this.f19261;
            c2460.m7510(0);
            int iM7499 = c2460.m7499();
            if ((i == 0 || ((-128000) & iM7499) == (((long) i) & (-128000))) && (iM49077 = C22122.m49077(iM7499)) != -1) {
                i3++;
                if (i3 != 1) {
                    if (i3 == 4) {
                        break;
                    }
                } else {
                    this.f19260.m14349(iM7499);
                    i = iM7499;
                }
                interfaceC7222.mo19209(iM49077 - 4);
            } else {
                int i5 = i4 + 1;
                if (i4 == i2) {
                    if (z) {
                        return false;
                    }
                    m15513();
                    throw new EOFException();
                }
                if (z) {
                    interfaceC7222.mo19217();
                    interfaceC7222.mo19209(iMo19213 + i5);
                } else {
                    interfaceC7222.mo19214(1);
                }
                i4 = i5;
                i = 0;
                i3 = 0;
            }
        }
        if (z) {
            interfaceC7222.mo19214(iMo19213 + i4);
        } else {
            interfaceC7222.mo19217();
        }
        this.f19271 = i;
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m15516(InterfaceC7222 interfaceC7222) {
        InterfaceC1390 interfaceC1390 = this.f19262;
        if (interfaceC1390 != null) {
            long jMo4876 = interfaceC1390.mo4876();
            if (jMo4876 == -1 || interfaceC7222.mo19213() <= jMo4876 - 4) {
            }
            return true;
        }
        try {
            return !interfaceC7222.mo19219(true, 0, 4, this.f19261.m7518());
        } catch (EOFException unused) {
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m15513() {
        Object obj = this.f19262;
        if ((obj instanceof C14092) && ((C22745) obj).mo5382()) {
            long j = this.f19255;
            if (j == -1 || j == this.f19262.mo4876()) {
                return;
            }
            this.f19262 = ((C14092) this.f19262).m34076(this.f19255);
            InterfaceC15690 interfaceC15690 = this.f19258;
            interfaceC15690.getClass();
            interfaceC15690.mo7690(this.f19262);
            InterfaceC8011 interfaceC8011 = this.f19272;
            interfaceC8011.getClass();
            interfaceC8011.mo8113(this.f19262.mo5383());
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
    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final int mo2750(InterfaceC7222 interfaceC7222, C0954 c0954) {
        int i;
        int i2;
        long j;
        InterfaceC1390 interfaceC1390;
        C2460 c2460;
        long j2;
        long position;
        long j3;
        int iMo8111;
        int i3;
        int iM7499;
        int i4;
        int i5;
        long position2;
        InterfaceC1390 interfaceC1391;
        long j4;
        C2460 c2461;
        int i6;
        int iM74910;
        C2988 c2988;
        C4212 c4212M11877;
        long j5;
        int i7;
        int i8;
        long position3;
        long j6;
        long length;
        long jM11878;
        C5188 c5188;
        InterfaceC1390 c14092;
        int i9;
        long j7;
        C0987 c0987;
        long position4;
        C2801 c2801M8511;
        boolean z;
        int i10;
        boolean z2;
        long length2;
        long jM15514;
        long jMo4876;
        long j8;
        C10471 c10471;
        C0987 c0988;
        int iM3789;
        int i11;
        InterfaceC22155 interfaceC22155M3793;
        C2023.m6508(this.f19272);
        String str = C17983.f57504;
        int i12 = this.f19271;
        C5188 c5189 = this.f19260;
        if (i12 == 0) {
            try {
                m15515(interfaceC7222, false);
                interfaceC1390 = this.f19262;
                c2460 = this.f19261;
                if (interfaceC1390 == null) {
                    c2461 = new C2460(c5189.f17994);
                    interfaceC7222.mo19210(0, c5189.f17994, c2461.m7518());
                    i6 = 21;
                    if ((c5189.f17990 & 1) != 0) {
                        if (c5189.f17995 != 1) {
                            i6 = 36;
                        }
                    } else if (c5189.f17995 == 1) {
                        i6 = 13;
                    }
                    if (c2461.m7509() >= i6 + 4) {
                        c2461.m7510(i6);
                        iM74910 = c2461.m7499();
                        if (iM74910 != 1483304551 && iM74910 != 1231971951) {
                            if (c2461.m7509() >= 40) {
                                c2461.m7510(36);
                                if (c2461.m7499() == 1447187017) {
                                    iM74910 = 1447187017;
                                } else {
                                    iM74910 = 0;
                                }
                            } else {
                                iM74910 = 0;
                            }
                        }
                    } else if (c2461.m7509() >= 40) {
                        c2461.m7510(36);
                        if (c2461.m7499() == 1447187017) {
                            iM74910 = 1447187017;
                        } else {
                            iM74910 = 0;
                        }
                    } else {
                        iM74910 = 0;
                    }
                    c2988 = this.f19256;
                    if (iM74910 == 1231971951) {
                        c4212M11877 = C4212.m11877(c5189, c2461);
                        j5 = c4212M11877.f15290;
                        if ((c2988.f11217 != -1 || c2988.f11218 == -1) && (i7 = c4212M11877.f15293) != -1 && (i8 = c4212M11877.f15292) != -1) {
                            c2988.f11217 = i7;
                            c2988.f11218 = i8;
                        }
                        position3 = interfaceC7222.getPosition();
                        if (interfaceC7222.getLength() != -1 || j5 == -1) {
                            j6 = -9223372036854775807L;
                        } else {
                            j6 = -9223372036854775807L;
                            long j9 = position3 + j5;
                            if (interfaceC7222.getLength() != j9) {
                                C0303.m1851("Data size mismatch between stream (" + interfaceC7222.getLength() + ") and Xing frame (" + j9 + "), using Xing value.");
                            }
                        }
                        interfaceC7222.mo19214(c5189.f17994);
                        if (iM74910 == 1483304551) {
                            c14092 = C7035.m18872(c4212M11877, position3);
                        } else {
                            length = interfaceC7222.getLength();
                            jM11878 = c4212M11877.m11878();
                            c5188 = c4212M11877.f15291;
                            if (jM11878 != j6) {
                                if (j5 != -1) {
                                    length = position3 + j5;
                                    i9 = c5188.f17994;
                                } else if (length != -1) {
                                    j5 = length - position3;
                                    i9 = c5188.f17994;
                                } else {
                                    c14092 = null;
                                }
                                long j10 = j5 - ((long) i9);
                                long j11 = length;
                                RoundingMode roundingMode = RoundingMode.HALF_UP;
                                c14092 = new C14092(C17039.m39818(C17983.m41830(j10, 8000000L, jM11878, roundingMode)), C17039.m39818(C7161.m19081(j10, c4212M11877.f15289, roundingMode)), j11, position3 + ((long) c5188.f17994), false);
                            } else {
                                c14092 = null;
                            }
                        }
                        j7 = j6;
                    } else {
                        if (iM74910 != 1447187017) {
                            c14092 = C13386.m32881(interfaceC7222.getLength(), interfaceC7222.getPosition(), this.f19260, c2461);
                            interfaceC7222.mo19214(c5189.f17994);
                        } else if (iM74910 != 1483304551) {
                            c4212M11877 = C4212.m11877(c5189, c2461);
                            j5 = c4212M11877.f15290;
                            if (c2988.f11217 != -1) {
                                c2988.f11217 = i7;
                                c2988.f11218 = i8;
                            } else {
                                c2988.f11217 = i7;
                                c2988.f11218 = i8;
                            }
                            position3 = interfaceC7222.getPosition();
                            if (interfaceC7222.getLength() != -1) {
                                j6 = -9223372036854775807L;
                            } else {
                                j6 = -9223372036854775807L;
                            }
                            interfaceC7222.mo19214(c5189.f17994);
                            if (iM74910 == 1483304551) {
                                c14092 = C7035.m18872(c4212M11877, position3);
                            } else {
                                length = interfaceC7222.getLength();
                                jM11878 = c4212M11877.m11878();
                                c5188 = c4212M11877.f15291;
                                if (jM11878 != j6) {
                                    if (j5 != -1) {
                                        length = position3 + j5;
                                        i9 = c5188.f17994;
                                    } else if (length != -1) {
                                        j5 = length - position3;
                                        i9 = c5188.f17994;
                                    } else {
                                        c14092 = null;
                                    }
                                    long j12 = j5 - ((long) i9);
                                    long j13 = length;
                                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                                    c14092 = new C14092(C17039.m39818(C17983.m41830(j12, 8000000L, jM11878, roundingMode2)), C17039.m39818(C7161.m19081(j12, c4212M11877.f15289, roundingMode2)), j13, position3 + ((long) c5188.f17994), false);
                                } else {
                                    c14092 = null;
                                }
                            }
                            j7 = j6;
                        } else {
                            interfaceC7222.mo19217();
                            c14092 = null;
                        }
                        j7 = -9223372036854775807L;
                    }
                    c0987 = this.f19267;
                    position4 = interfaceC7222.getPosition();
                    if (c0987 != null) {
                        c2801M8511 = null;
                        break;
                    }
                    iM3789 = c0987.m3789();
                    i11 = 0;
                    while (true) {
                        if (i11 < iM3789) {
                            c2801M8511 = null;
                            break;
                        }
                        interfaceC22155M3793 = c0987.m3793(i11);
                        if (interfaceC22155M3793 instanceof C4024) {
                            c2801M8511 = C2801.m8511(position4, (C4024) interfaceC22155M3793, m15514(c0987));
                            break;
                        }
                        i11++;
                    }
                    z = this.f19264;
                    i10 = this.f19254;
                    if (z) {
                        c14092 = new C22558(j7);
                    } else {
                        if ((i10 & 4) != 0) {
                            if (c2801M8511 != null) {
                                jM15514 = c2801M8511.mo5383();
                            } else {
                                if (c14092 != null) {
                                    long jMo5383 = c14092.mo5383();
                                    jMo4876 = c14092.mo4876();
                                    j8 = jMo5383;
                                } else {
                                    jM15514 = m15514(this.f19267);
                                }
                                c14092 = new C11975(j8, interfaceC7222.getPosition(), jMo4876);
                            }
                            j8 = jM15514;
                            jMo4876 = -1;
                            c14092 = new C11975(j8, interfaceC7222.getPosition(), jMo4876);
                        } else if (c2801M8511 != null) {
                            c14092 = c2801M8511;
                        } else if (c14092 == null) {
                            c14092 = null;
                        }
                        if (c14092 == null && !c14092.mo5382() && (i10 & 1) != 0 && c14092.mo5383() != -9223372036854775807L && (c14092.mo4876() != -1 || interfaceC7222.getLength() != -1)) {
                            long jMo4877 = c14092.mo4877() != -1 ? c14092.mo4877() : 0L;
                            if (c14092.mo4876() != -1) {
                                length2 = c14092.mo4876();
                            } else {
                                length2 = interfaceC7222.getLength();
                            }
                            long j14 = length2;
                            c14092 = new C14092(C17039.m39822(C17983.m41830(j14 - jMo4877, 8000000L, c14092.mo5383(), RoundingMode.HALF_UP)), -1, j14, jMo4877, false);
                        } else if (c14092 != null || (!c14092.mo5382() && (i10 & 1) != 0)) {
                            if ((i10 & 2) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            interfaceC7222.mo19210(0, 4, c2460.m7518());
                            c2460.m7510(0);
                            c5189.m14349(c2460.m7499());
                            c14092 = new C14092(c5189.f17992, c5189.f17994, interfaceC7222.getLength(), interfaceC7222.getPosition(), z2);
                        }
                        this.f19272.mo8113(c14092.mo5383());
                    }
                    this.f19262 = c14092;
                    this.f19258.mo7690(c14092);
                    c10471 = new C10471();
                    c10471.m26521("audio/mpeg");
                    c10471.m26533(c5189.f17991);
                    c10471.m26531(4096);
                    c10471.m26494(c5189.f17995);
                    c10471.m26511(c5189.f17993);
                    c10471.m26496(c2988.f11217);
                    c10471.m26510(c2988.f11218);
                    if ((i10 & 8) != 0) {
                        c0988 = null;
                    } else {
                        c0988 = this.f19267;
                    }
                    c10471.m26504(c0988);
                    if (this.f19262.mo4875() != -2147483647) {
                        c10471.m26515(this.f19262.mo4875());
                    }
                    this.f19266.mo8116(c10471.m26497());
                    this.f19273 = interfaceC7222.getPosition();
                    j2 = 0;
                    j = 1000000;
                } else {
                    if (this.f19273 != 0) {
                        position = interfaceC7222.getPosition();
                        j3 = this.f19273;
                        if (position < j3) {
                            interfaceC7222.mo19214((int) (j3 - position));
                        }
                    }
                    j = 1000000;
                    j2 = 0;
                }
                if (this.f19268 == 0) {
                    interfaceC7222.mo19217();
                    if (m15516(interfaceC7222)) {
                        i = -1;
                        i2 = -1;
                    } else {
                        c2460.m7510(0);
                        iM7499 = c2460.m7499();
                        if (((-128000) & iM7499) == (((long) this.f19271) & (-128000))) {
                            i4 = 0;
                            i5 = 1;
                        } else if (C22122.m49077(iM7499) == -1) {
                            i5 = 1;
                            i4 = 0;
                        } else {
                            c5189.m14349(iM7499);
                            if (this.f19257 == -9223372036854775807L) {
                                this.f19257 = this.f19262.mo4878(interfaceC7222.getPosition());
                                j4 = this.f19265;
                                if (j4 != -9223372036854775807L) {
                                    this.f19257 = (j4 - this.f19262.mo4878(j2)) + this.f19257;
                                }
                            }
                            this.f19268 = c5189.f17994;
                            position2 = interfaceC7222.getPosition() + ((long) c5189.f17994);
                            this.f19255 = position2;
                            interfaceC1391 = this.f19262;
                            if (interfaceC1391 instanceof C11975) {
                                C11975 c11975 = (C11975) interfaceC1391;
                                c11975.m29782((((this.f19269 + ((long) c5189.f17996)) * j) / ((long) c5189.f17993)) + this.f19257, position2);
                                if (this.f19274 && c11975.m29783(this.f19270)) {
                                    this.f19274 = false;
                                    this.f19266 = this.f19272;
                                }
                            }
                            iMo8111 = this.f19266.mo8111((InterfaceC6942) interfaceC7222, this.f19268, true);
                            if (iMo8111 == -1) {
                                i = -1;
                                i2 = -1;
                            } else {
                                i3 = this.f19268 - iMo8111;
                                this.f19268 = i3;
                                if (i3 <= 0) {
                                    this.f19266.mo8114(this.f19257 + ((this.f19269 * j) / ((long) c5189.f17993)), 1, c5189.f17994, 0, null);
                                    this.f19269 += (long) c5189.f17996;
                                    this.f19268 = 0;
                                }
                                i = -1;
                                i2 = 0;
                            }
                        }
                        interfaceC7222.mo19214(i5);
                        this.f19271 = i4;
                        i = -1;
                        i2 = 0;
                    }
                } else {
                    iMo8111 = this.f19266.mo8111((InterfaceC6942) interfaceC7222, this.f19268, true);
                    if (iMo8111 == -1) {
                        i = -1;
                        i2 = -1;
                    } else {
                        i3 = this.f19268 - iMo8111;
                        this.f19268 = i3;
                        if (i3 <= 0) {
                            this.f19266.mo8114(this.f19257 + ((this.f19269 * j) / ((long) c5189.f17993)), 1, c5189.f17994, 0, null);
                            this.f19269 += (long) c5189.f17996;
                            this.f19268 = 0;
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
            interfaceC1390 = this.f19262;
            c2460 = this.f19261;
            if (interfaceC1390 == null) {
                c2461 = new C2460(c5189.f17994);
                interfaceC7222.mo19210(0, c5189.f17994, c2461.m7518());
                i6 = 21;
                if ((c5189.f17990 & 1) != 0) {
                    if (c5189.f17995 != 1) {
                        i6 = 36;
                    }
                } else if (c5189.f17995 == 1) {
                    i6 = 13;
                }
                if (c2461.m7509() >= i6 + 4) {
                    c2461.m7510(i6);
                    iM74910 = c2461.m7499();
                    if (iM74910 != 1483304551) {
                        if (c2461.m7509() >= 40) {
                            c2461.m7510(36);
                            if (c2461.m7499() == 1447187017) {
                                iM74910 = 1447187017;
                            } else {
                                iM74910 = 0;
                            }
                        } else {
                            iM74910 = 0;
                        }
                    }
                } else if (c2461.m7509() >= 40) {
                    c2461.m7510(36);
                    if (c2461.m7499() == 1447187017) {
                        iM74910 = 1447187017;
                    } else {
                        iM74910 = 0;
                    }
                } else {
                    iM74910 = 0;
                }
                c2988 = this.f19256;
                if (iM74910 == 1231971951) {
                    c4212M11877 = C4212.m11877(c5189, c2461);
                    j5 = c4212M11877.f15290;
                    if (c2988.f11217 != -1) {
                        c2988.f11217 = i7;
                        c2988.f11218 = i8;
                    } else {
                        c2988.f11217 = i7;
                        c2988.f11218 = i8;
                    }
                    position3 = interfaceC7222.getPosition();
                    if (interfaceC7222.getLength() != -1) {
                        j6 = -9223372036854775807L;
                    } else {
                        j6 = -9223372036854775807L;
                    }
                    interfaceC7222.mo19214(c5189.f17994);
                    if (iM74910 == 1483304551) {
                        c14092 = C7035.m18872(c4212M11877, position3);
                    } else {
                        length = interfaceC7222.getLength();
                        jM11878 = c4212M11877.m11878();
                        c5188 = c4212M11877.f15291;
                        if (jM11878 != j6) {
                            if (j5 != -1) {
                                length = position3 + j5;
                                i9 = c5188.f17994;
                            } else if (length != -1) {
                                j5 = length - position3;
                                i9 = c5188.f17994;
                            } else {
                                c14092 = null;
                            }
                            long j15 = j5 - ((long) i9);
                            long j16 = length;
                            RoundingMode roundingMode3 = RoundingMode.HALF_UP;
                            c14092 = new C14092(C17039.m39818(C17983.m41830(j15, 8000000L, jM11878, roundingMode3)), C17039.m39818(C7161.m19081(j15, c4212M11877.f15289, roundingMode3)), j16, position3 + ((long) c5188.f17994), false);
                        } else {
                            c14092 = null;
                        }
                    }
                    j7 = j6;
                } else {
                    if (iM74910 != 1447187017) {
                        c14092 = C13386.m32881(interfaceC7222.getLength(), interfaceC7222.getPosition(), this.f19260, c2461);
                        interfaceC7222.mo19214(c5189.f17994);
                    } else if (iM74910 != 1483304551) {
                        c4212M11877 = C4212.m11877(c5189, c2461);
                        j5 = c4212M11877.f15290;
                        if (c2988.f11217 != -1) {
                            c2988.f11217 = i7;
                            c2988.f11218 = i8;
                        } else {
                            c2988.f11217 = i7;
                            c2988.f11218 = i8;
                        }
                        position3 = interfaceC7222.getPosition();
                        if (interfaceC7222.getLength() != -1) {
                            j6 = -9223372036854775807L;
                        } else {
                            j6 = -9223372036854775807L;
                        }
                        interfaceC7222.mo19214(c5189.f17994);
                        if (iM74910 == 1483304551) {
                            c14092 = C7035.m18872(c4212M11877, position3);
                        } else {
                            length = interfaceC7222.getLength();
                            jM11878 = c4212M11877.m11878();
                            c5188 = c4212M11877.f15291;
                            if (jM11878 != j6) {
                                if (j5 != -1) {
                                    length = position3 + j5;
                                    i9 = c5188.f17994;
                                } else if (length != -1) {
                                    j5 = length - position3;
                                    i9 = c5188.f17994;
                                } else {
                                    c14092 = null;
                                }
                                long j17 = j5 - ((long) i9);
                                long j18 = length;
                                RoundingMode roundingMode4 = RoundingMode.HALF_UP;
                                c14092 = new C14092(C17039.m39818(C17983.m41830(j17, 8000000L, jM11878, roundingMode4)), C17039.m39818(C7161.m19081(j17, c4212M11877.f15289, roundingMode4)), j18, position3 + ((long) c5188.f17994), false);
                            } else {
                                c14092 = null;
                            }
                        }
                        j7 = j6;
                    } else {
                        interfaceC7222.mo19217();
                        c14092 = null;
                    }
                    j7 = -9223372036854775807L;
                }
                c0987 = this.f19267;
                position4 = interfaceC7222.getPosition();
                if (c0987 != null) {
                    c2801M8511 = null;
                    break;
                }
                iM3789 = c0987.m3789();
                i11 = 0;
                while (true) {
                    if (i11 < iM3789) {
                        c2801M8511 = null;
                        break;
                    }
                    interfaceC22155M3793 = c0987.m3793(i11);
                    if (interfaceC22155M3793 instanceof C4024) {
                        c2801M8511 = C2801.m8511(position4, (C4024) interfaceC22155M3793, m15514(c0987));
                        break;
                    }
                    i11++;
                }
                z = this.f19264;
                i10 = this.f19254;
                if (z) {
                    c14092 = new C22558(j7);
                } else {
                    if ((i10 & 4) != 0) {
                        if (c2801M8511 != null) {
                            jM15514 = c2801M8511.mo5383();
                        } else {
                            if (c14092 != null) {
                                long jMo5384 = c14092.mo5383();
                                jMo4876 = c14092.mo4876();
                                j8 = jMo5384;
                            } else {
                                jM15514 = m15514(this.f19267);
                            }
                            c14092 = new C11975(j8, interfaceC7222.getPosition(), jMo4876);
                        }
                        j8 = jM15514;
                        jMo4876 = -1;
                        c14092 = new C11975(j8, interfaceC7222.getPosition(), jMo4876);
                    } else if (c2801M8511 != null) {
                        c14092 = c2801M8511;
                    } else if (c14092 == null) {
                        c14092 = null;
                    }
                    if (c14092 == null) {
                        if (c14092 != null) {
                            if ((i10 & 2) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            interfaceC7222.mo19210(0, 4, c2460.m7518());
                            c2460.m7510(0);
                            c5189.m14349(c2460.m7499());
                            c14092 = new C14092(c5189.f17992, c5189.f17994, interfaceC7222.getLength(), interfaceC7222.getPosition(), z2);
                        } else {
                            if ((i10 & 2) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            interfaceC7222.mo19210(0, 4, c2460.m7518());
                            c2460.m7510(0);
                            c5189.m14349(c2460.m7499());
                            c14092 = new C14092(c5189.f17992, c5189.f17994, interfaceC7222.getLength(), interfaceC7222.getPosition(), z2);
                        }
                    } else if (c14092 != null) {
                        if ((i10 & 2) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        interfaceC7222.mo19210(0, 4, c2460.m7518());
                        c2460.m7510(0);
                        c5189.m14349(c2460.m7499());
                        c14092 = new C14092(c5189.f17992, c5189.f17994, interfaceC7222.getLength(), interfaceC7222.getPosition(), z2);
                    } else {
                        if ((i10 & 2) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        interfaceC7222.mo19210(0, 4, c2460.m7518());
                        c2460.m7510(0);
                        c5189.m14349(c2460.m7499());
                        c14092 = new C14092(c5189.f17992, c5189.f17994, interfaceC7222.getLength(), interfaceC7222.getPosition(), z2);
                    }
                    this.f19272.mo8113(c14092.mo5383());
                }
                this.f19262 = c14092;
                this.f19258.mo7690(c14092);
                c10471 = new C10471();
                c10471.m26521("audio/mpeg");
                c10471.m26533(c5189.f17991);
                c10471.m26531(4096);
                c10471.m26494(c5189.f17995);
                c10471.m26511(c5189.f17993);
                c10471.m26496(c2988.f11217);
                c10471.m26510(c2988.f11218);
                if ((i10 & 8) != 0) {
                    c0988 = null;
                } else {
                    c0988 = this.f19267;
                }
                c10471.m26504(c0988);
                if (this.f19262.mo4875() != -2147483647) {
                    c10471.m26515(this.f19262.mo4875());
                }
                this.f19266.mo8116(c10471.m26497());
                this.f19273 = interfaceC7222.getPosition();
                j2 = 0;
                j = 1000000;
            } else {
                if (this.f19273 != 0) {
                    position = interfaceC7222.getPosition();
                    j3 = this.f19273;
                    if (position < j3) {
                        interfaceC7222.mo19214((int) (j3 - position));
                    }
                }
                j = 1000000;
                j2 = 0;
            }
            if (this.f19268 == 0) {
                interfaceC7222.mo19217();
                if (m15516(interfaceC7222)) {
                    i = -1;
                    i2 = -1;
                } else {
                    c2460.m7510(0);
                    iM7499 = c2460.m7499();
                    if (((-128000) & iM7499) == (((long) this.f19271) & (-128000))) {
                        i4 = 0;
                        i5 = 1;
                    } else if (C22122.m49077(iM7499) == -1) {
                        i5 = 1;
                        i4 = 0;
                    } else {
                        c5189.m14349(iM7499);
                        if (this.f19257 == -9223372036854775807L) {
                            this.f19257 = this.f19262.mo4878(interfaceC7222.getPosition());
                            j4 = this.f19265;
                            if (j4 != -9223372036854775807L) {
                                this.f19257 = (j4 - this.f19262.mo4878(j2)) + this.f19257;
                            }
                        }
                        this.f19268 = c5189.f17994;
                        position2 = interfaceC7222.getPosition() + ((long) c5189.f17994);
                        this.f19255 = position2;
                        interfaceC1391 = this.f19262;
                        if (interfaceC1391 instanceof C11975) {
                            C11975 c11976 = (C11975) interfaceC1391;
                            c11976.m29782((((this.f19269 + ((long) c5189.f17996)) * j) / ((long) c5189.f17993)) + this.f19257, position2);
                            if (this.f19274) {
                                this.f19274 = false;
                                this.f19266 = this.f19272;
                            }
                        }
                        iMo8111 = this.f19266.mo8111((InterfaceC6942) interfaceC7222, this.f19268, true);
                        if (iMo8111 == -1) {
                            i = -1;
                            i2 = -1;
                        } else {
                            i3 = this.f19268 - iMo8111;
                            this.f19268 = i3;
                            if (i3 <= 0) {
                                this.f19266.mo8114(this.f19257 + ((this.f19269 * j) / ((long) c5189.f17993)), 1, c5189.f17994, 0, null);
                                this.f19269 += (long) c5189.f17996;
                                this.f19268 = 0;
                            }
                            i = -1;
                            i2 = 0;
                        }
                    }
                    interfaceC7222.mo19214(i5);
                    this.f19271 = i4;
                    i = -1;
                    i2 = 0;
                }
            } else {
                iMo8111 = this.f19266.mo8111((InterfaceC6942) interfaceC7222, this.f19268, true);
                if (iMo8111 == -1) {
                    i = -1;
                    i2 = -1;
                } else {
                    i3 = this.f19268 - iMo8111;
                    this.f19268 = i3;
                    if (i3 <= 0) {
                        this.f19266.mo8114(this.f19257 + ((this.f19269 * j) / ((long) c5189.f17993)), 1, c5189.f17994, 0, null);
                        this.f19269 += (long) c5189.f17996;
                        this.f19268 = 0;
                    }
                    i = -1;
                    i2 = 0;
                }
            }
        }
        if (i2 == i) {
            InterfaceC1390 interfaceC1392 = this.f19262;
            if (interfaceC1392 instanceof C11975) {
                long j19 = ((this.f19269 * j) / ((long) c5189.f17993)) + this.f19257;
                if (interfaceC1392.mo5383() != j19) {
                    ((C11975) this.f19262).m29781(j19);
                    this.f19258.mo7690(this.f19262);
                    this.f19272.mo8113(this.f19262.mo5383());
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m15514(C0987 c0987) {
        if (c0987 == null) {
            return -9223372036854775807L;
        }
        int iM3789 = c0987.m3789();
        for (int i = 0; i < iM3789; i++) {
            InterfaceC22155 interfaceC22155M3793 = c0987.m3793(i);
            if (interfaceC22155M3793 instanceof C23076) {
                C23076 c23076 = (C23076) interfaceC22155M3793;
                if (c23076.f73049.equals("TLEN")) {
                    return C17983.m41827(Long.parseLong((String) c23076.f74971.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }
}
