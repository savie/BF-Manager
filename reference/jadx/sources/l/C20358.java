package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.᩵ۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 48PJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20358 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f65296 = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Code duplicated, block: B:62:0x0124  */
    /* JADX WARN: Code duplicated, block: B:71:0x0145  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15648 m46774(C21287 c21287, String str, String str2, C22362 c22362) throws C2970 {
        int i;
        boolean zM35162;
        int iM35163;
        int iM35164;
        int i2;
        int i3;
        boolean z;
        boolean zM35163;
        int i4;
        int iM35165;
        boolean z2;
        C14573 c14573 = new C14573();
        c14573.m35155(c21287);
        int iM35152 = c14573.m35152();
        int iM35166 = c14573.m35163(3);
        if (iM35166 > 1) {
            throw C2970.m9689("Unsupported AC-4 DSI version: " + iM35166);
        }
        int iM35167 = c14573.m35163(7);
        int i5 = c14573.m35162() ? 48000 : 44100;
        c14573.m35161(4);
        int iM35168 = c14573.m35163(9);
        if (iM35167 > 1) {
            if (iM35166 == 0) {
                throw C2970.m9689("Invalid AC-4 DSI version: " + iM35166);
            }
            if (c14573.m35162()) {
                c14573.m35161(16);
                if (c14573.m35162()) {
                    c14573.m35161(128);
                }
            }
        }
        if (iM35166 == 1) {
            if (c14573.m35152() < 66) {
                throw C2970.m9689("Invalid AC-4 DSI bitrate.");
            }
            c14573.m35161(66);
            c14573.m35164();
        }
        C23342 c23342 = new C23342();
        c23342.f75612 = true;
        c23342.f75611 = -1;
        c23342.f75615 = -1;
        c23342.f75616 = true;
        c23342.f75614 = 2;
        c23342.f75613 = 1;
        int i6 = 0;
        c23342.f75617 = 0;
        while (true) {
            if (i6 < iM35168) {
                if (iM35166 == 0) {
                    zM35162 = c14573.m35162();
                    iM35163 = c14573.m35163(5);
                    iM35164 = c14573.m35163(5);
                    i2 = 0;
                    i3 = 0;
                    z = false;
                } else {
                    int iM35169 = c14573.m35163(8);
                    int iM351610 = c14573.m35163(8);
                    if (iM351610 == 255) {
                        iM351610 += c14573.m35163(16);
                    }
                    if (iM35169 > 2) {
                        c14573.m35161(iM351610 * 8);
                        i6++;
                    } else {
                        int iM35153 = (iM35152 - c14573.m35152()) / 8;
                        iM35163 = c14573.m35163(5);
                        i2 = iM351610;
                        i3 = iM35153;
                        zM35162 = false;
                        z = iM35163 == 31;
                        iM35164 = iM35169;
                    }
                }
                c23342.f75613 = iM35164;
                if (zM35162 || z || iM35163 != 6) {
                    c23342.f75617 = c14573.m35163(3);
                    if (c14573.m35162()) {
                        c14573.m35161(5);
                    }
                    c14573.m35161(2);
                    if (iM35166 == 1 && (iM35164 == 1 || iM35164 == 2)) {
                        c14573.m35161(2);
                    }
                    c14573.m35161(5);
                    c14573.m35161(10);
                    if (iM35166 == 1) {
                        if (iM35164 > 0) {
                            c23342.f75612 = c14573.m35162();
                        }
                        if (c23342.f75612) {
                            if (iM35164 != 1) {
                                i4 = 2;
                                if (iM35164 == 2) {
                                    iM35165 = c14573.m35163(5);
                                    if (iM35165 >= 0 && iM35165 <= 15) {
                                        c23342.f75611 = iM35165;
                                    }
                                    if (iM35165 >= 11 || iM35165 > 14) {
                                        i4 = 2;
                                    } else {
                                        c23342.f75616 = c14573.m35162();
                                        i4 = 2;
                                        c23342.f75614 = c14573.m35163(2);
                                    }
                                }
                            } else {
                                iM35165 = c14573.m35163(5);
                                if (iM35165 >= 0) {
                                    c23342.f75611 = iM35165;
                                }
                                if (iM35165 >= 11) {
                                    i4 = 2;
                                } else {
                                    i4 = 2;
                                }
                            }
                            c14573.m35161(24);
                        } else {
                            i4 = 2;
                        }
                        if (iM35164 == 1 || iM35164 == i4) {
                            if (c14573.m35162() && c14573.m35162()) {
                                c14573.m35161(i4);
                            }
                            if (c14573.m35162()) {
                                c14573.m35159();
                                int i7 = 8;
                                int iM351611 = c14573.m35163(8);
                                int i8 = 0;
                                while (i8 < iM351611) {
                                    c14573.m35161(i7);
                                    i8++;
                                    i7 = 8;
                                }
                            }
                        }
                    }
                    if (!zM35162 && !z) {
                        c14573.m35159();
                        if (iM35163 == 0 || iM35163 == 1 || iM35163 == 2) {
                            if (iM35164 == 0) {
                                for (int i9 = 0; i9 < 2; i9++) {
                                    m46776(c14573, c23342);
                                }
                            } else {
                                for (int i10 = 0; i10 < 2; i10++) {
                                    m46778(c14573, c23342);
                                }
                            }
                        } else if (iM35163 == 3 || iM35163 == 4) {
                            if (iM35164 == 0) {
                                for (int i11 = 0; i11 < 3; i11++) {
                                    m46776(c14573, c23342);
                                }
                            } else {
                                for (int i12 = 0; i12 < 3; i12++) {
                                    m46778(c14573, c23342);
                                }
                            }
                        } else if (iM35163 != 5) {
                            int iM351612 = c14573.m35163(7);
                            for (int i13 = 0; i13 < iM351612; i13++) {
                                c14573.m35161(8);
                            }
                        } else if (iM35164 == 0) {
                            m46776(c14573, c23342);
                        } else {
                            int iM351613 = c14573.m35163(3);
                            for (int i14 = 0; i14 < iM351613 + 2; i14++) {
                                m46778(c14573, c23342);
                            }
                        }
                    } else if (iM35164 == 0) {
                        m46776(c14573, c23342);
                    } else {
                        m46778(c14573, c23342);
                    }
                    c14573.m35159();
                    zM35163 = c14573.m35162();
                } else {
                    zM35163 = true;
                }
                if (zM35163) {
                    int iM351614 = c14573.m35163(7);
                    for (int i15 = 0; i15 < iM351614; i15++) {
                        c14573.m35161(15);
                    }
                }
                if (iM35164 > 0) {
                    if (c14573.m35162()) {
                        if (c14573.m35152() < 66) {
                            z2 = false;
                        } else {
                            c14573.m35161(66);
                            z2 = true;
                        }
                        if (!z2) {
                            throw C2970.m9689("Can't parse bitrate DSI.");
                        }
                    }
                    if (c14573.m35162()) {
                        c14573.m35164();
                        c14573.m35160(c14573.m35163(16));
                        int iM351615 = c14573.m35163(5);
                        for (int i16 = 0; i16 < iM351615; i16++) {
                            c14573.m35161(3);
                            c14573.m35161(8);
                        }
                    }
                }
                c14573.m35164();
                if (iM35166 == 1) {
                    int iM35154 = ((iM35152 - c14573.m35152()) / 8) - i3;
                    if (i2 < iM35154) {
                        throw C2970.m9689("pres_bytes is smaller than presentation bytes read.");
                    }
                    c14573.m35160(i2 - iM35154);
                }
                if (c23342.f75612 && c23342.f75611 == -1) {
                    throw C2970.m9689("Can't determine channel mode of presentation " + i6);
                }
            }
            if (c23342.f75612) {
                int i17 = c23342.f75611;
                boolean z3 = c23342.f75616;
                int i18 = c23342.f75614;
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
                int i19 = c23342.f75615;
                if (i19 > 0) {
                    int i20 = i19 + 1;
                    i = (c23342.f75617 == 4 && i20 == 17) ? 21 : i20;
                } else {
                    int i21 = c23342.f75617;
                    if (i21 == 0) {
                        i = 2;
                    } else if (i21 == 1) {
                        i = 6;
                    } else if (i21 == 2) {
                        i = 8;
                    } else if (i21 == 3) {
                        i = 10;
                    } else if (i21 != 4) {
                        C1896.m6517("AC-4 level " + c23342.f75617 + " has not been defined.");
                        i = 2;
                    } else {
                        i = 12;
                    }
                }
            }
            if (i <= 0) {
                throw C2970.m9689("Cannot determine channel count of presentation.");
            }
            Object[] objArr = {Integer.valueOf(iM35167), Integer.valueOf(c23342.f75613), Integer.valueOf(c23342.f75617)};
            String str3 = C7116.f23455;
            String str4 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
            C20124 c20124 = new C20124();
            c20124.m46309(str);
            c20124.m46315("audio/ac4");
            c20124.m46329(i);
            c20124.m46332(i5);
            c20124.m46304(c22362);
            c20124.m46321(str2);
            c20124.m46300(str4);
            return c20124.m46295();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46776(C14573 c14573, C23342 c23342) throws C2970 {
        int iM35163 = c14573.m35163(5);
        c14573.m35161(2);
        if (c14573.m35162()) {
            c14573.m35161(5);
        }
        if (iM35163 >= 7 && iM35163 <= 10) {
            c14573.m35159();
        }
        if (c14573.m35162()) {
            int iM35164 = c14573.m35163(3);
            if (c23342.f75611 == -1 && iM35163 >= 0 && iM35163 <= 15 && (iM35164 == 0 || iM35164 == 1)) {
                c23342.f75611 = iM35163;
            }
            if (c14573.m35162()) {
                m46777(c14573);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m46778(C14573 c14573, C23342 c23342) throws C2970 {
        c14573.m35161(2);
        boolean zM35162 = c14573.m35162();
        int iM35163 = c14573.m35163(8);
        for (int i = 0; i < iM35163; i++) {
            c14573.m35161(2);
            if (c14573.m35162()) {
                c14573.m35161(5);
            }
            if (zM35162) {
                c14573.m35161(24);
            } else {
                if (c14573.m35162()) {
                    if (!c14573.m35162()) {
                        c14573.m35161(4);
                    }
                    c23342.f75615 = c14573.m35163(6) + 1;
                }
                c14573.m35161(4);
            }
        }
        if (c14573.m35162()) {
            c14573.m35161(3);
            if (c14573.m35162()) {
                m46777(c14573);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m46777(C14573 c14573) throws C2970 {
        int iM35163 = c14573.m35163(6);
        if (iM35163 < 2 || iM35163 > 42) {
            throw C2970.m9689(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iM35163)));
        }
        c14573.m35161(iM35163 * 8);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3204 m46773(C14573 c14573) {
        int i;
        int i2;
        int iM35163 = c14573.m35163(16);
        int iM35164 = c14573.m35163(16);
        if (iM35164 == 65535) {
            iM35164 = c14573.m35163(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = iM35164 + i;
        if (iM35163 == 44097) {
            i3 += 2;
        }
        if (c14573.m35163(2) == 3) {
            do {
                c14573.m35163(2);
            } while (c14573.m35162());
        }
        int iM35165 = c14573.m35163(10);
        if (c14573.m35162() && c14573.m35163(3) > 0) {
            c14573.m35161(2);
        }
        int i4 = c14573.m35162() ? 48000 : 44100;
        int iM35166 = c14573.m35163(4);
        int[] iArr = f65296;
        if (i4 == 44100 && iM35166 == 13) {
            i2 = iArr[iM35166];
        } else if (i4 != 48000 || iM35166 >= 14) {
            i2 = 0;
        } else {
            int i5 = iArr[iM35166];
            int i6 = iM35165 % 5;
            if (i6 == 1) {
                if (iM35166 != 3 || iM35166 == 8) {
                    i2 = i5 + 1;
                } else {
                    i2 = i5;
                }
            } else if (i6 != 2) {
                if (i6 == 3) {
                    if (iM35166 != 3) {
                    }
                    i2 = i5 + 1;
                } else if (i6 == 4 && (iM35166 == 3 || iM35166 == 8 || iM35166 == 11)) {
                    i2 = i5 + 1;
                } else {
                    i2 = i5;
                }
            } else if (iM35166 == 8 || iM35166 == 11) {
                i2 = i5 + 1;
            } else {
                i2 = i5;
            }
        }
        return new C3204(i4, i3, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46775(int i, C21287 c21287) {
        c21287.m48496(7);
        byte[] bArrM48497 = c21287.m48497();
        bArrM48497[0] = -84;
        bArrM48497[1] = 64;
        bArrM48497[2] = -1;
        bArrM48497[3] = -1;
        bArrM48497[4] = (byte) ((i >> 16) & 255);
        bArrM48497[5] = (byte) ((i >> 8) & 255);
        bArrM48497[6] = (byte) (i & 255);
    }
}
