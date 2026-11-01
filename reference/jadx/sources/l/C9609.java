package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۢ۬ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48PJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9609 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f32376 = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Code duplicated, block: B:62:0x0124  */
    /* JADX WARN: Code duplicated, block: B:71:0x0145  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7648 m24510(C2460 c2460, String str, String str2, C8354 c8354) throws C22861 {
        int i;
        boolean zM29035;
        int iM29039;
        int iM290310;
        int i2;
        int i3;
        boolean z;
        boolean zM29036;
        int i4;
        int iM290311;
        boolean z2;
        C11634 c11634 = new C11634();
        c11634.m29033(c2460);
        int iM29030 = c11634.m29030();
        int iM290312 = c11634.m29039(3);
        if (iM290312 > 1) {
            throw C22861.m50611("Unsupported AC-4 DSI version: " + iM290312);
        }
        int iM290313 = c11634.m29039(7);
        int i5 = c11634.m29035() ? 48000 : 44100;
        c11634.m29034(4);
        int iM290314 = c11634.m29039(9);
        if (iM290313 > 1) {
            if (iM290312 == 0) {
                throw C22861.m50611("Invalid AC-4 DSI version: " + iM290312);
            }
            if (c11634.m29035()) {
                c11634.m29034(16);
                if (c11634.m29035()) {
                    c11634.m29034(128);
                }
            }
        }
        if (iM290312 == 1) {
            if (c11634.m29030() < 66) {
                throw C22861.m50611("Invalid AC-4 DSI bitrate.");
            }
            c11634.m29034(66);
            c11634.m29040();
        }
        C14548 c14548 = new C14548();
        c14548.f47635 = true;
        c14548.f47633 = -1;
        c14548.f47634 = -1;
        c14548.f47636 = true;
        c14548.f47637 = 2;
        c14548.f47631 = 1;
        int i6 = 0;
        c14548.f47632 = 0;
        while (true) {
            if (i6 < iM290314) {
                if (iM290312 == 0) {
                    zM29035 = c11634.m29035();
                    iM29039 = c11634.m29039(5);
                    iM290310 = c11634.m29039(5);
                    i2 = 0;
                    i3 = 0;
                    z = false;
                } else {
                    int iM290315 = c11634.m29039(8);
                    int iM290316 = c11634.m29039(8);
                    if (iM290316 == 255) {
                        iM290316 += c11634.m29039(16);
                    }
                    if (iM290315 > 2) {
                        c11634.m29034(iM290316 * 8);
                        i6++;
                    } else {
                        int iM29031 = (iM29030 - c11634.m29030()) / 8;
                        iM29039 = c11634.m29039(5);
                        i2 = iM290316;
                        i3 = iM29031;
                        zM29035 = false;
                        z = iM29039 == 31;
                        iM290310 = iM290315;
                    }
                }
                c14548.f47631 = iM290310;
                if (zM29035 || z || iM29039 != 6) {
                    c14548.f47632 = c11634.m29039(3);
                    if (c11634.m29035()) {
                        c11634.m29034(5);
                    }
                    c11634.m29034(2);
                    if (iM290312 == 1 && (iM290310 == 1 || iM290310 == 2)) {
                        c11634.m29034(2);
                    }
                    c11634.m29034(5);
                    c11634.m29034(10);
                    if (iM290312 == 1) {
                        if (iM290310 > 0) {
                            c14548.f47635 = c11634.m29035();
                        }
                        if (c14548.f47635) {
                            if (iM290310 != 1) {
                                i4 = 2;
                                if (iM290310 == 2) {
                                    iM290311 = c11634.m29039(5);
                                    if (iM290311 >= 0 && iM290311 <= 15) {
                                        c14548.f47633 = iM290311;
                                    }
                                    if (iM290311 >= 11 || iM290311 > 14) {
                                        i4 = 2;
                                    } else {
                                        c14548.f47636 = c11634.m29035();
                                        i4 = 2;
                                        c14548.f47637 = c11634.m29039(2);
                                    }
                                }
                            } else {
                                iM290311 = c11634.m29039(5);
                                if (iM290311 >= 0) {
                                    c14548.f47633 = iM290311;
                                }
                                if (iM290311 >= 11) {
                                    i4 = 2;
                                } else {
                                    i4 = 2;
                                }
                            }
                            c11634.m29034(24);
                        } else {
                            i4 = 2;
                        }
                        if (iM290310 == 1 || iM290310 == i4) {
                            if (c11634.m29035() && c11634.m29035()) {
                                c11634.m29034(i4);
                            }
                            if (c11634.m29035()) {
                                c11634.m29042();
                                int i7 = 8;
                                int iM290317 = c11634.m29039(8);
                                int i8 = 0;
                                while (i8 < iM290317) {
                                    c11634.m29034(i7);
                                    i8++;
                                    i7 = 8;
                                }
                            }
                        }
                    }
                    if (!zM29035 && !z) {
                        c11634.m29042();
                        if (iM29039 == 0 || iM29039 == 1 || iM29039 == 2) {
                            if (iM290310 == 0) {
                                for (int i9 = 0; i9 < 2; i9++) {
                                    m24512(c11634, c14548);
                                }
                            } else {
                                for (int i10 = 0; i10 < 2; i10++) {
                                    m24514(c11634, c14548);
                                }
                            }
                        } else if (iM29039 == 3 || iM29039 == 4) {
                            if (iM290310 == 0) {
                                for (int i11 = 0; i11 < 3; i11++) {
                                    m24512(c11634, c14548);
                                }
                            } else {
                                for (int i12 = 0; i12 < 3; i12++) {
                                    m24514(c11634, c14548);
                                }
                            }
                        } else if (iM29039 != 5) {
                            int iM290318 = c11634.m29039(7);
                            for (int i13 = 0; i13 < iM290318; i13++) {
                                c11634.m29034(8);
                            }
                        } else if (iM290310 == 0) {
                            m24512(c11634, c14548);
                        } else {
                            int iM290319 = c11634.m29039(3);
                            for (int i14 = 0; i14 < iM290319 + 2; i14++) {
                                m24514(c11634, c14548);
                            }
                        }
                    } else if (iM290310 == 0) {
                        m24512(c11634, c14548);
                    } else {
                        m24514(c11634, c14548);
                    }
                    c11634.m29042();
                    zM29036 = c11634.m29035();
                } else {
                    zM29036 = true;
                }
                if (zM29036) {
                    int iM290320 = c11634.m29039(7);
                    for (int i15 = 0; i15 < iM290320; i15++) {
                        c11634.m29034(15);
                    }
                }
                if (iM290310 > 0) {
                    if (c11634.m29035()) {
                        if (c11634.m29030() < 66) {
                            z2 = false;
                        } else {
                            c11634.m29034(66);
                            z2 = true;
                        }
                        if (!z2) {
                            throw C22861.m50611("Can't parse bitrate DSI.");
                        }
                    }
                    if (c11634.m29035()) {
                        c11634.m29040();
                        c11634.m29043(c11634.m29039(16));
                        int iM290321 = c11634.m29039(5);
                        for (int i16 = 0; i16 < iM290321; i16++) {
                            c11634.m29034(3);
                            c11634.m29034(8);
                        }
                    }
                }
                c11634.m29040();
                if (iM290312 == 1) {
                    int iM29032 = ((iM29030 - c11634.m29030()) / 8) - i3;
                    if (i2 < iM29032) {
                        throw C22861.m50611("pres_bytes is smaller than presentation bytes read.");
                    }
                    c11634.m29043(i2 - iM29032);
                }
                if (c14548.f47635 && c14548.f47633 == -1) {
                    throw C22861.m50611("Can't determine channel mode of presentation " + i6);
                }
            }
            if (c14548.f47635) {
                int i17 = c14548.f47633;
                boolean z3 = c14548.f47636;
                int i18 = c14548.f47637;
                switch (i17) {
                    case 0:
                        i = 1;
                        break;
                    case 1:
                        i = 2;
                        break;
                    case 2:
                        i = 3;
                        break;
                    case 3:
                        i = 5;
                        break;
                    case 4:
                        i = 6;
                        break;
                    case 5:
                    case 7:
                    case 9:
                        i = 7;
                        break;
                    case 6:
                    case 8:
                    case 10:
                        i = 8;
                        break;
                    case 11:
                        i = 11;
                        break;
                    case 12:
                        i = 12;
                        break;
                    case 13:
                        i = 13;
                        break;
                    case 14:
                        i = 14;
                        break;
                    case 15:
                        i = 24;
                        break;
                    default:
                        i = -1;
                        break;
                }
                if (i17 == 11 || i17 == 12 || i17 == 13 || i17 == 14) {
                    if (!z3) {
                        i -= 2;
                    }
                    if (i18 == 0) {
                        i -= 4;
                    } else if (i18 == 1) {
                        i -= 2;
                    }
                }
            } else {
                int i19 = c14548.f47634;
                if (i19 > 0) {
                    int i20 = i19 + 1;
                    i = (c14548.f47632 == 4 && i20 == 17) ? 21 : i20;
                } else {
                    int i21 = c14548.f47632;
                    if (i21 == 0) {
                        i = 2;
                    } else if (i21 == 1) {
                        i = 6;
                    } else if (i21 == 2) {
                        i = 8;
                    } else if (i21 == 3) {
                        i = 10;
                    } else if (i21 != 4) {
                        C0303.m1848("AC-4 level " + c14548.f47632 + " has not been defined.");
                        i = 2;
                    } else {
                        i = 12;
                    }
                }
            }
            if (i <= 0) {
                throw C22861.m50611("Cannot determine channel count of presentation.");
            }
            Object[] objArr = {Integer.valueOf(iM290313), Integer.valueOf(c14548.f47631), Integer.valueOf(c14548.f47632)};
            String str3 = C17983.f57504;
            String str4 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
            C10471 c10471 = new C10471();
            c10471.m26516(str);
            c10471.m26533("audio/ac4");
            c10471.m26494(i);
            c10471.m26511(i5);
            c10471.m26506(c8354);
            c10471.m26509(str2);
            c10471.m26502(str4);
            return c10471.m26497();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24512(C11634 c11634, C14548 c14548) throws C22861 {
        int iM29039 = c11634.m29039(5);
        c11634.m29034(2);
        if (c11634.m29035()) {
            c11634.m29034(5);
        }
        if (iM29039 >= 7 && iM29039 <= 10) {
            c11634.m29042();
        }
        if (c11634.m29035()) {
            int iM290310 = c11634.m29039(3);
            if (c14548.f47633 == -1 && iM29039 >= 0 && iM29039 <= 15 && (iM290310 == 0 || iM290310 == 1)) {
                c14548.f47633 = iM29039;
            }
            if (c11634.m29035()) {
                m24513(c11634);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m24514(C11634 c11634, C14548 c14548) throws C22861 {
        c11634.m29034(2);
        boolean zM29035 = c11634.m29035();
        int iM29039 = c11634.m29039(8);
        for (int i = 0; i < iM29039; i++) {
            c11634.m29034(2);
            if (c11634.m29035()) {
                c11634.m29034(5);
            }
            if (zM29035) {
                c11634.m29034(24);
            } else {
                if (c11634.m29035()) {
                    if (!c11634.m29035()) {
                        c11634.m29034(4);
                    }
                    c14548.f47634 = c11634.m29039(6) + 1;
                }
                c11634.m29034(4);
            }
        }
        if (c11634.m29035()) {
            c11634.m29034(3);
            if (c11634.m29035()) {
                m24513(c11634);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m24513(C11634 c11634) throws C22861 {
        int iM29039 = c11634.m29039(6);
        if (iM29039 < 2 || iM29039 > 42) {
            throw C22861.m50611(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iM29039)));
        }
        c11634.m29034(iM29039 * 8);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1846 m24509(C11634 c11634) {
        int i;
        int i2;
        int iM29039 = c11634.m29039(16);
        int iM290310 = c11634.m29039(16);
        if (iM290310 == 65535) {
            iM290310 = c11634.m29039(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = iM290310 + i;
        if (iM29039 == 44097) {
            i3 += 2;
        }
        if (c11634.m29039(2) == 3) {
            do {
                c11634.m29039(2);
            } while (c11634.m29035());
        }
        int iM290311 = c11634.m29039(10);
        if (c11634.m29035() && c11634.m29039(3) > 0) {
            c11634.m29034(2);
        }
        int i4 = c11634.m29035() ? 48000 : 44100;
        int iM290312 = c11634.m29039(4);
        int[] iArr = f32376;
        if (i4 == 44100 && iM290312 == 13) {
            i2 = iArr[iM290312];
        } else if (i4 != 48000 || iM290312 >= 14) {
            i2 = 0;
        } else {
            int i5 = iArr[iM290312];
            int i6 = iM290311 % 5;
            if (i6 == 1) {
                if (iM290312 != 3 || iM290312 == 8) {
                    i2 = i5 + 1;
                } else {
                    i2 = i5;
                }
            } else if (i6 != 2) {
                if (i6 == 3) {
                    if (iM290312 != 3) {
                    }
                    i2 = i5 + 1;
                } else if (i6 == 4 && (iM290312 == 3 || iM290312 == 8 || iM290312 == 11)) {
                    i2 = i5 + 1;
                } else {
                    i2 = i5;
                }
            } else if (iM290312 == 8 || iM290312 == 11) {
                i2 = i5 + 1;
            } else {
                i2 = i5;
            }
        }
        return new C1846(i4, i3, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24511(int i, C2460 c2460) {
        c2460.m7517(7);
        byte[] bArrM7518 = c2460.m7518();
        bArrM7518[0] = -84;
        bArrM7518[1] = 64;
        bArrM7518[2] = -1;
        bArrM7518[3] = -1;
        bArrM7518[4] = (byte) ((i >> 16) & 255);
        bArrM7518[5] = (byte) ((i >> 8) & 255);
        bArrM7518[6] = (byte) (i & 255);
    }
}
