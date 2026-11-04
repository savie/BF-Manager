package l;

import org.bouncycastle.asn1.ASN1RelativeOID;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.ۖۢܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17YO */
/* JADX INFO: loaded from: classes2.dex */
public final class C2583 {

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final int[] f8290 = {0, 1, 3, 7, 15, 31, 63, 127, 255, SecP521R1Field.P16, 1023, 2047, 4095, 8191, ASN1RelativeOID.MAX_IDENTIFIER_LENGTH, EnumC6121.f20881, 65535};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f8291;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C4559 f8292;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte f8293;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f8294;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f8295;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f8296;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f8297;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte f8298;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int[] f8299;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f8300;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9294 f8301;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f8302;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f8303;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f8304;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f8305 = 0;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f8306;

    public C2583(C4559 c4559, C9294 c9294) {
        this.f8292 = c4559;
        this.f8301 = c9294;
    }

    /* JADX WARN: Code duplicated, block: B:191:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:208:0x0527  */
    /* JADX WARN: Code duplicated, block: B:209:0x052b  */
    /* JADX WARN: Code duplicated, block: B:211:0x0530 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:212:0x0532  */
    /* JADX WARN: Code duplicated, block: B:213:0x0534  */
    /* JADX WARN: Code duplicated, block: B:215:0x053f  */
    /* JADX WARN: Code duplicated, block: B:220:0x0567 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:221:0x0569 A[LOOP:6: B:219:0x0565->B:221:0x0569, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:226:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:227:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:229:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:230:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:232:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:233:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:235:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:250:0x057a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x05de A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m8646(int i) {
        C2583 c2583;
        int i2;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String str2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr;
        int i19;
        int i20;
        int i21;
        C2583 c2584 = this;
        C4559 c4559 = c2584.f8292;
        int i22 = c4559.f72678;
        int i23 = c4559.f72685;
        C9294 c9294 = c2584.f8301;
        int i24 = c9294.f30203;
        int i25 = c9294.f30209;
        int i26 = c9294.f30223;
        int i27 = c9294.f30218;
        int i28 = c9294.f30204;
        int i29 = i27 < i28 ? (i28 - i27) - 1 : i24 - i27;
        int i30 = i27;
        int i31 = i26;
        int i32 = i25;
        int i33 = i23;
        int i34 = i22;
        int iM24504 = i;
        while (true) {
            int i35 = c2584.f8306;
            int[] iArr2 = f8290;
            switch (i35) {
                case 0:
                    if (i29 >= 258 && i33 >= 10) {
                        c9294.f30209 = i32;
                        c9294.f30223 = i31;
                        c4559.f72685 = i33;
                        int i36 = i33;
                        int i37 = i32;
                        c4559.f72687 += (long) (i34 - c4559.f72678);
                        c4559.f72678 = i34;
                        c9294.f30218 = i30;
                        byte b = c2584.f8298;
                        byte b2 = c2584.f8293;
                        int[] iArr3 = c2584.f8291;
                        int i38 = c2584.f8296;
                        int[] iArr4 = c2584.f8295;
                        int i39 = i36;
                        int i40 = c2584.f8304;
                        int i41 = i34;
                        int i42 = c9294.f30204;
                        int i43 = i30 < i42 ? (i42 - i30) - 1 : i24 - i30;
                        int i44 = iArr2[b];
                        int i45 = iArr2[b2];
                        int i46 = i31;
                        String str3 = "invalid distance code";
                        int i47 = i43;
                        int i48 = i30;
                        int i49 = i41;
                        int i50 = i37;
                        while (true) {
                            if (i46 < 20) {
                                i39--;
                                i50 |= (c4559.f72681[i49] & 255) << i46;
                                i46 += 8;
                                i49++;
                            } else {
                                int i51 = i50 & i44;
                                int i52 = (i38 + i51) * 3;
                                int i53 = iArr3[i52];
                                if (i53 != 0) {
                                    while (true) {
                                        int i54 = iArr3[i52 + 1];
                                        i50 >>= i54;
                                        i46 -= i54;
                                        if ((i53 & 16) == 0) {
                                            i3 = i44;
                                            str2 = str3;
                                            if ((i53 & 64) == 0) {
                                                i51 = i51 + iArr3[i52 + 2] + (i50 & iArr2[i53]);
                                                i52 = (i38 + i51) * 3;
                                                i53 = iArr3[i52];
                                                if (i53 == 0) {
                                                    int i55 = iArr3[i52 + 1];
                                                    i50 >>= i55;
                                                    i8 = i48 + 1;
                                                    c9294.f30221[i48] = (byte) iArr3[i52 + 2];
                                                    i46 -= i55;
                                                } else {
                                                    str3 = str2;
                                                    i44 = i3;
                                                }
                                            } else if ((i53 & 32) != 0) {
                                                int i56 = c4559.f72685 - i39;
                                                int i57 = i46 >> 3;
                                                if (i57 < i56) {
                                                    i56 = i57;
                                                }
                                                int i58 = i49 - i56;
                                                c9294.f30209 = i50;
                                                c9294.f30223 = i46 - (i56 << 3);
                                                c4559.f72685 = i39 + i56;
                                                c4559.f72687 += (long) (i58 - c4559.f72678);
                                                c4559.f72678 = i58;
                                                c9294.f30218 = i48;
                                                i7 = 1;
                                            } else {
                                                str = "invalid literal/length code";
                                                c4559.f72682 = str;
                                                int i59 = c4559.f72685 - i39;
                                                int i60 = i46 >> 3;
                                                if (i60 < i59) {
                                                    i59 = i60;
                                                }
                                                int i61 = i49 - i59;
                                                c9294.f30209 = i50;
                                                c9294.f30223 = i46 - (i59 << 3);
                                                c4559.f72685 = i39 + i59;
                                                c4559.f72687 += (long) (i61 - c4559.f72678);
                                                c4559.f72678 = i61;
                                                c9294.f30218 = i48;
                                            }
                                            str = "invalid literal/length code";
                                            i9 = c4559.f72678;
                                            i10 = c4559.f72685;
                                            i32 = c9294.f30209;
                                            i31 = c9294.f30223;
                                            i30 = c9294.f30218;
                                            i11 = c9294.f30204;
                                            if (i30 < i11) {
                                                i12 = 1;
                                                i29 = (i11 - i30) - 1;
                                            } else {
                                                i12 = 1;
                                                i29 = i24 - i30;
                                            }
                                            if (i7 != 0) {
                                                if (i7 == i12) {
                                                    i13 = 7;
                                                } else {
                                                    i13 = 9;
                                                }
                                                c2583 = this;
                                                c2583.f8306 = i13;
                                                i33 = i10;
                                                i34 = i9;
                                                iM24504 = i7;
                                            } else {
                                                c2583 = this;
                                                i2 = i10;
                                                i34 = i9;
                                                iM24504 = i7;
                                            }
                                            c2584 = c2583;
                                            break;
                                        } else {
                                            int i62 = i53 & 15;
                                            i3 = i44;
                                            int i63 = iArr3[i52 + 2] + (i50 & iArr2[i62]);
                                            int i64 = i50 >> i62;
                                            int i65 = i46 - i62;
                                            while (i65 < 15) {
                                                i39--;
                                                i64 |= (c4559.f72681[i49] & 255) << i65;
                                                i65 += 8;
                                                i49++;
                                            }
                                            int i66 = i64 & i45;
                                            int i67 = (i40 + i66) * 3;
                                            int i68 = iArr4[i67];
                                            while (true) {
                                                int i69 = iArr4[i67 + 1];
                                                i64 >>= i69;
                                                i65 -= i69;
                                                if ((i68 & 16) != 0) {
                                                    int i70 = i68 & 15;
                                                    int i71 = i49;
                                                    int i72 = i39;
                                                    while (i65 < i70) {
                                                        i72--;
                                                        i64 |= (c4559.f72681[i71] & 255) << i65;
                                                        i65 += 8;
                                                        i71++;
                                                    }
                                                    int i73 = iArr4[i67 + 2] + (i64 & iArr2[i70]);
                                                    int i74 = i64 >> i70;
                                                    int i75 = i65 - i70;
                                                    int i76 = i47 - i63;
                                                    if (i48 >= i73) {
                                                        int i77 = i48 - i73;
                                                        int i78 = i48 - i77;
                                                        if (i78 > 0 && 2 > i78) {
                                                            byte[] bArr = c9294.f30221;
                                                            int i79 = i48 + 1;
                                                            int i80 = i77 + 1;
                                                            bArr[i48] = bArr[i77];
                                                            i48 += 2;
                                                            i4 = i77 + 2;
                                                            bArr[i79] = bArr[i80];
                                                        } else {
                                                            byte[] bArr2 = c9294.f30221;
                                                            System.arraycopy(bArr2, i77, bArr2, i48, 2);
                                                            i48 += 2;
                                                            i4 = i77 + 2;
                                                        }
                                                        i63 -= 2;
                                                    } else {
                                                        i4 = i48 - i73;
                                                        do {
                                                            i4 += i24;
                                                        } while (i4 < 0);
                                                        int i81 = i24 - i4;
                                                        if (i63 > i81) {
                                                            i63 -= i81;
                                                            int i82 = i48 - i4;
                                                            if (i82 <= 0 || i81 <= i82) {
                                                                byte[] bArr3 = c9294.f30221;
                                                                System.arraycopy(bArr3, i4, bArr3, i48, i81);
                                                                i48 += i81;
                                                            } else {
                                                                while (true) {
                                                                    byte[] bArr4 = c9294.f30221;
                                                                    int i83 = i4 + 1;
                                                                    bArr4[i48] = bArr4[i4];
                                                                    i81--;
                                                                    i48++;
                                                                    if (i81 != 0) {
                                                                        i4 = i83;
                                                                    }
                                                                }
                                                            }
                                                            i4 = 0;
                                                        }
                                                    }
                                                    int i84 = i48 - i4;
                                                    if (i84 <= 0 || i63 <= i84) {
                                                        byte[] bArr5 = c9294.f30221;
                                                        System.arraycopy(bArr5, i4, bArr5, i48, i63);
                                                        i5 = i48 + i63;
                                                    } else {
                                                        while (true) {
                                                            byte[] bArr6 = c9294.f30221;
                                                            i5 = i48 + 1;
                                                            int i85 = i4 + 1;
                                                            bArr6[i48] = bArr6[i4];
                                                            i63--;
                                                            if (i63 != 0) {
                                                                i48 = i5;
                                                                i4 = i85;
                                                            }
                                                        }
                                                    }
                                                    i48 = i5;
                                                    i49 = i71;
                                                    i6 = i72;
                                                    i50 = i74;
                                                    i46 = i75;
                                                    i47 = i76;
                                                    if (i47 >= 258 || i6 < 10) {
                                                        i14 = c4559.f72685 - i6;
                                                        i15 = i46 >> 3;
                                                        if (i15 < i14) {
                                                            i14 = i15;
                                                        }
                                                        int i86 = i49 - i14;
                                                        c9294.f30209 = i50;
                                                        c9294.f30223 = i46 - (i14 << 3);
                                                        c4559.f72685 = i6 + i14;
                                                        c4559.f72687 += (long) (i86 - c4559.f72678);
                                                        c4559.f72678 = i86;
                                                        c9294.f30218 = i48;
                                                        i7 = 0;
                                                        str = "invalid literal/length code";
                                                        i9 = c4559.f72678;
                                                        i10 = c4559.f72685;
                                                        i32 = c9294.f30209;
                                                        i31 = c9294.f30223;
                                                        i30 = c9294.f30218;
                                                        i11 = c9294.f30204;
                                                        if (i30 < i11) {
                                                            i12 = 1;
                                                            i29 = (i11 - i30) - 1;
                                                        } else {
                                                            i12 = 1;
                                                            i29 = i24 - i30;
                                                        }
                                                        if (i7 != 0) {
                                                            if (i7 == i12) {
                                                                i13 = 7;
                                                            } else {
                                                                i13 = 9;
                                                            }
                                                            c2583 = this;
                                                            c2583.f8306 = i13;
                                                            i33 = i10;
                                                            i34 = i9;
                                                            iM24504 = i7;
                                                        } else {
                                                            c2583 = this;
                                                            i2 = i10;
                                                            i34 = i9;
                                                            iM24504 = i7;
                                                        }
                                                        c2584 = c2583;
                                                    } else {
                                                        i39 = i6;
                                                        i44 = i3;
                                                    }
                                                    break;
                                                } else if ((i68 & 64) == 0) {
                                                    i66 = i66 + iArr4[i67 + 2] + (i64 & iArr2[i68]);
                                                    i67 = (i40 + i66) * 3;
                                                    i68 = iArr4[i67];
                                                } else {
                                                    c4559.f72682 = str3;
                                                    int i87 = c4559.f72685 - i39;
                                                    int i88 = i65 >> 3;
                                                    if (i88 < i87) {
                                                        i87 = i88;
                                                    }
                                                    int i89 = i49 - i87;
                                                    c9294.f30209 = i64;
                                                    c9294.f30223 = i65 - (i87 << 3);
                                                    c4559.f72685 = i39 + i87;
                                                    c4559.f72687 += (long) (i89 - c4559.f72678);
                                                    c4559.f72678 = i89;
                                                    c9294.f30218 = i48;
                                                    str = "invalid literal/length code";
                                                }
                                            }
                                        }
                                        i7 = -3;
                                        i9 = c4559.f72678;
                                        i10 = c4559.f72685;
                                        i32 = c9294.f30209;
                                        i31 = c9294.f30223;
                                        i30 = c9294.f30218;
                                        i11 = c9294.f30204;
                                        if (i30 < i11) {
                                            i12 = 1;
                                            i29 = (i11 - i30) - 1;
                                        } else {
                                            i12 = 1;
                                            i29 = i24 - i30;
                                        }
                                        if (i7 != 0) {
                                            if (i7 == i12) {
                                                i13 = 7;
                                            } else {
                                                i13 = 9;
                                            }
                                            c2583 = this;
                                            c2583.f8306 = i13;
                                            i33 = i10;
                                            i34 = i9;
                                            iM24504 = i7;
                                        } else {
                                            c2583 = this;
                                            i2 = i10;
                                            i34 = i9;
                                            iM24504 = i7;
                                        }
                                        c2584 = c2583;
                                    }
                                } else {
                                    int i90 = iArr3[i52 + 1];
                                    i50 >>= i90;
                                    i8 = i48 + 1;
                                    c9294.f30221[i48] = (byte) iArr3[i52 + 2];
                                    i46 -= i90;
                                    i3 = i44;
                                    str2 = str3;
                                }
                                i47--;
                                str3 = str2;
                                i6 = i39;
                                i48 = i8;
                                if (i47 >= 258) {
                                }
                                i14 = c4559.f72685 - i6;
                                i15 = i46 >> 3;
                                if (i15 < i14) {
                                    i14 = i15;
                                }
                                int i810 = i49 - i14;
                                c9294.f30209 = i50;
                                c9294.f30223 = i46 - (i14 << 3);
                                c4559.f72685 = i6 + i14;
                                c4559.f72687 += (long) (i810 - c4559.f72678);
                                c4559.f72678 = i810;
                                c9294.f30218 = i48;
                                i7 = 0;
                                str = "invalid literal/length code";
                                i9 = c4559.f72678;
                                i10 = c4559.f72685;
                                i32 = c9294.f30209;
                                i31 = c9294.f30223;
                                i30 = c9294.f30218;
                                i11 = c9294.f30204;
                                if (i30 < i11) {
                                    i12 = 1;
                                    i29 = (i11 - i30) - 1;
                                } else {
                                    i12 = 1;
                                    i29 = i24 - i30;
                                }
                                if (i7 != 0) {
                                    if (i7 == i12) {
                                        i13 = 7;
                                    } else {
                                        i13 = 9;
                                    }
                                    c2583 = this;
                                    c2583.f8306 = i13;
                                    i33 = i10;
                                    i34 = i9;
                                    iM24504 = i7;
                                } else {
                                    c2583 = this;
                                    i2 = i10;
                                    i34 = i9;
                                    iM24504 = i7;
                                }
                                c2584 = c2583;
                            }
                        }
                    } else {
                        c2583 = c2584;
                        i2 = i33;
                        str = "invalid literal/length code";
                        i32 = i32;
                        i34 = i34;
                    }
                    c2583.f8300 = c2583.f8298;
                    c2583.f8299 = c2583.f8291;
                    c2583.f8305 = c2583.f8296;
                    c2583.f8306 = 1;
                    i16 = c2583.f8300;
                    i17 = i2;
                    while (i31 < i16) {
                        if (i17 != 0) {
                            c9294.f30209 = i32;
                            c9294.f30223 = i31;
                            c4559.f72685 = i17;
                            c4559.f72687 += (long) (i34 - c4559.f72678);
                            c4559.f72678 = i34;
                            c9294.f30218 = i30;
                            return c9294.m24504(iM24504);
                        }
                        i17--;
                        i32 |= (c4559.f72681[i34] & 255) << i31;
                        i31 += 8;
                        iM24504 = 0;
                        i34++;
                    }
                    i18 = (c2583.f8305 + (iArr2[i16] & i32)) * 3;
                    iArr = c2583.f8299;
                    int i91 = iArr[i18 + 1];
                    i32 >>>= i91;
                    i31 -= i91;
                    i19 = iArr[i18];
                    if (i19 == 0) {
                        c2583.f8294 = iArr[i18 + 2];
                        c2583.f8306 = 6;
                    } else if ((i19 & 16) != 0) {
                        c2583.f8302 = i19 & 15;
                        c2583.f8297 = iArr[i18 + 2];
                        c2583.f8306 = 2;
                    } else if ((i19 & 64) == 0) {
                        c2583.f8300 = i19;
                        c2583.f8305 = (i18 / 3) + iArr[i18 + 2];
                    } else if ((i19 & 32) != 0) {
                        c2583.f8306 = 7;
                    } else {
                        c2583.f8306 = 9;
                        c4559.f72682 = str;
                        c9294.f30209 = i32;
                        c9294.f30223 = i31;
                        c4559.f72685 = i17;
                        c4559.f72687 += (long) (i34 - c4559.f72678);
                        c4559.f72678 = i34;
                        c9294.f30218 = i30;
                        return c9294.m24504(-3);
                    }
                    i33 = i17;
                    c2584 = c2583;
                    break;
                case 1:
                    c2583 = c2584;
                    i2 = i33;
                    str = "invalid literal/length code";
                    i16 = c2583.f8300;
                    i17 = i2;
                    while (i31 < i16) {
                        if (i17 != 0) {
                            c9294.f30209 = i32;
                            c9294.f30223 = i31;
                            c4559.f72685 = i17;
                            c4559.f72687 += (long) (i34 - c4559.f72678);
                            c4559.f72678 = i34;
                            c9294.f30218 = i30;
                            return c9294.m24504(iM24504);
                        }
                        i17--;
                        i32 |= (c4559.f72681[i34] & 255) << i31;
                        i31 += 8;
                        iM24504 = 0;
                        i34++;
                    }
                    i18 = (c2583.f8305 + (iArr2[i16] & i32)) * 3;
                    iArr = c2583.f8299;
                    int i92 = iArr[i18 + 1];
                    i32 >>>= i92;
                    i31 -= i92;
                    i19 = iArr[i18];
                    if (i19 == 0) {
                        c2583.f8294 = iArr[i18 + 2];
                        c2583.f8306 = 6;
                    } else if ((i19 & 16) != 0) {
                        c2583.f8302 = i19 & 15;
                        c2583.f8297 = iArr[i18 + 2];
                        c2583.f8306 = 2;
                    } else if ((i19 & 64) == 0) {
                        c2583.f8300 = i19;
                        c2583.f8305 = (i18 / 3) + iArr[i18 + 2];
                    } else if ((i19 & 32) != 0) {
                        c2583.f8306 = 7;
                    } else {
                        c2583.f8306 = 9;
                        c4559.f72682 = str;
                        c9294.f30209 = i32;
                        c9294.f30223 = i31;
                        c4559.f72685 = i17;
                        c4559.f72687 += (long) (i34 - c4559.f72678);
                        c4559.f72678 = i34;
                        c9294.f30218 = i30;
                        return c9294.m24504(-3);
                    }
                    i33 = i17;
                    c2584 = c2583;
                    break;
                case 2:
                    int i93 = c2584.f8302;
                    while (i31 < i93) {
                        if (i33 == 0) {
                            c9294.f30209 = i32;
                            c9294.f30223 = i31;
                            c4559.f72685 = i33;
                            c4559.f72687 += (long) (i34 - c4559.f72678);
                            c4559.f72678 = i34;
                            c9294.f30218 = i30;
                            return c9294.m24504(iM24504);
                        }
                        i33--;
                        i32 |= (c4559.f72681[i34] & 255) << i31;
                        i31 += 8;
                        iM24504 = 0;
                        i34++;
                    }
                    c2584.f8297 += iArr2[i93] & i32;
                    i32 >>= i93;
                    i31 -= i93;
                    c2584.f8300 = c2584.f8293;
                    c2584.f8299 = c2584.f8295;
                    c2584.f8305 = c2584.f8304;
                    c2584.f8306 = 3;
                case 3:
                    int i94 = c2584.f8300;
                    while (i31 < i94) {
                        if (i33 == 0) {
                            c9294.f30209 = i32;
                            c9294.f30223 = i31;
                            c4559.f72685 = i33;
                            c4559.f72687 += (long) (i34 - c4559.f72678);
                            c4559.f72678 = i34;
                            c9294.f30218 = i30;
                            return c9294.m24504(iM24504);
                        }
                        i33--;
                        i32 |= (c4559.f72681[i34] & 255) << i31;
                        i31 += 8;
                        iM24504 = 0;
                        i34++;
                    }
                    int i95 = (c2584.f8305 + (iArr2[i94] & i32)) * 3;
                    int[] iArr5 = c2584.f8299;
                    int i96 = iArr5[i95 + 1];
                    i32 >>= i96;
                    i31 -= i96;
                    int i97 = iArr5[i95];
                    if ((i97 & 16) != 0) {
                        c2584.f8302 = i97 & 15;
                        c2584.f8303 = iArr5[i95 + 2];
                        c2584.f8306 = 4;
                    } else if ((i97 & 64) == 0) {
                        c2584.f8300 = i97;
                        c2584.f8305 = (i95 / 3) + iArr5[i95 + 2];
                    } else {
                        c2584.f8306 = 9;
                        c4559.f72682 = "invalid distance code";
                        c9294.f30209 = i32;
                        c9294.f30223 = i31;
                        c4559.f72685 = i33;
                        c4559.f72687 += (long) (i34 - c4559.f72678);
                        c4559.f72678 = i34;
                        c9294.f30218 = i30;
                        return c9294.m24504(-3);
                    }
                    c2583 = c2584;
                    c2584 = c2583;
                    break;
                case 4:
                    int i98 = c2584.f8302;
                    while (i31 < i98) {
                        if (i33 == 0) {
                            c9294.f30209 = i32;
                            c9294.f30223 = i31;
                            c4559.f72685 = i33;
                            c4559.f72687 += (long) (i34 - c4559.f72678);
                            c4559.f72678 = i34;
                            c9294.f30218 = i30;
                            return c9294.m24504(iM24504);
                        }
                        i33--;
                        i32 |= (c4559.f72681[i34] & 255) << i31;
                        i31 += 8;
                        iM24504 = 0;
                        i34++;
                    }
                    c2584.f8303 += iArr2[i98] & i32;
                    i32 >>= i98;
                    i31 -= i98;
                    c2584.f8306 = 5;
                case 5:
                    int i99 = i30 - c2584.f8303;
                    while (i99 < 0) {
                        i99 += i24;
                    }
                    while (c2584.f8297 != 0) {
                        if (i29 == 0) {
                            if (i30 == i24 && (i20 = c9294.f30204) != 0) {
                                i29 = i20 > 0 ? i20 - 1 : i24;
                                i30 = 0;
                            }
                            if (i29 == 0) {
                                c9294.f30218 = i30;
                                iM24504 = c9294.m24504(iM24504);
                                i30 = c9294.f30218;
                                int i100 = c9294.f30204;
                                int i101 = i30 < i100 ? (i100 - i30) - 1 : i24 - i30;
                                if (i30 != i24 || i100 == 0) {
                                    i29 = i101;
                                } else {
                                    i29 = i100 > 0 ? i100 - 1 : i24;
                                    i30 = 0;
                                }
                                if (i29 == 0) {
                                    c9294.f30209 = i32;
                                    c9294.f30223 = i31;
                                    c4559.f72685 = i33;
                                    c4559.f72687 += (long) (i34 - c4559.f72678);
                                    c4559.f72678 = i34;
                                    c9294.f30218 = i30;
                                    return c9294.m24504(iM24504);
                                }
                            }
                        }
                        byte[] bArr7 = c9294.f30221;
                        int i102 = i30 + 1;
                        int i103 = i99 + 1;
                        bArr7[i30] = bArr7[i99];
                        i29--;
                        i99 = i103 == i24 ? 0 : i103;
                        c2584.f8297--;
                        i30 = i102;
                    }
                    c2584.f8306 = 0;
                    c2583 = c2584;
                    c2584 = c2583;
                    break;
                case 6:
                    if (i29 == 0) {
                        if (i30 == i24 && (i21 = c9294.f30204) != 0) {
                            i29 = i21 > 0 ? i21 - 1 : i24;
                            i30 = 0;
                        }
                        if (i29 == 0) {
                            c9294.f30218 = i30;
                            int iM24505 = c9294.m24504(iM24504);
                            i30 = c9294.f30218;
                            int i104 = c9294.f30204;
                            int i105 = i30 < i104 ? (i104 - i30) - 1 : i24 - i30;
                            if (i30 != i24 || i104 == 0) {
                                i29 = i105;
                            } else {
                                i29 = i104 > 0 ? i104 - 1 : i24;
                                i30 = 0;
                            }
                            if (i29 == 0) {
                                c9294.f30209 = i32;
                                c9294.f30223 = i31;
                                c4559.f72685 = i33;
                                c4559.f72687 += (long) (i34 - c4559.f72678);
                                c4559.f72678 = i34;
                                c9294.f30218 = i30;
                                return c9294.m24504(iM24505);
                            }
                        }
                    }
                    c9294.f30221[i30] = (byte) c2584.f8294;
                    i29--;
                    c2584.f8306 = 0;
                    iM24504 = 0;
                    i30++;
                    c2583 = c2584;
                    c2584 = c2583;
                    break;
                case 7:
                    if (i31 > 7) {
                        i31 -= 8;
                        i33++;
                        i34--;
                    }
                    c9294.f30218 = i30;
                    int iM24506 = c9294.m24504(iM24504);
                    i30 = c9294.f30218;
                    if (c9294.f30204 != i30) {
                        c9294.f30209 = i32;
                        c9294.f30223 = i31;
                        c4559.f72685 = i33;
                        c4559.f72687 += (long) (i34 - c4559.f72678);
                        c4559.f72678 = i34;
                        c9294.f30218 = i30;
                        return c9294.m24504(iM24506);
                    }
                    c2584.f8306 = 8;
                    c9294.f30209 = i32;
                    c9294.f30223 = i31;
                    c4559.f72685 = i33;
                    c4559.f72687 += (long) (i34 - c4559.f72678);
                    c4559.f72678 = i34;
                    c9294.f30218 = i30;
                    return c9294.m24504(1);
                case 8:
                    c9294.f30209 = i32;
                    c9294.f30223 = i31;
                    c4559.f72685 = i33;
                    c4559.f72687 += (long) (i34 - c4559.f72678);
                    c4559.f72678 = i34;
                    c9294.f30218 = i30;
                    return c9294.m24504(1);
                case 9:
                    c9294.f30209 = i32;
                    c9294.f30223 = i31;
                    c4559.f72685 = i33;
                    c4559.f72687 += (long) (i34 - c4559.f72678);
                    c4559.f72678 = i34;
                    c9294.f30218 = i30;
                    return c9294.m24504(-3);
                default:
                    int i106 = i34;
                    c9294.f30209 = i32;
                    c9294.f30223 = i31;
                    c4559.f72685 = i33;
                    c4559.f72687 += (long) (i106 - c4559.f72678);
                    c4559.f72678 = i106;
                    c9294.f30218 = i30;
                    return c9294.m24504(-2);
            }
        }
    }
}
