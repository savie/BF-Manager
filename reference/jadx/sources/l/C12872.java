package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫ۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5281 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12872 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f41204 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Charset f41205 = StandardCharsets.ISO_8859_1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m31902(int i) {
        if (i < 96) {
            return f41204[i];
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:254:0x047f  */
    /* JADX WARN: Code duplicated, block: B:257:0x0487 A[LOOP:22: B:253:0x047d->B:257:0x0487, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066 A[EDGE_INSN: B:38:0x0066->B:42:0x0070 BREAK  A[LOOP:30: B:25:0x0043->B:35:0x005e]] */
    /* JADX WARN: Code duplicated, block: B:397:0x048c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x0491 A[EDGE_INSN: B:398:0x0491->B:260:0x0491 BREAK  A[LOOP:22: B:253:0x047d->B:257:0x0487], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x006b A[EDGE_INSN: B:40:0x006b->B:42:0x0070 BREAK  A[LOOP:30: B:25:0x0043->B:35:0x005e]] */
    /* JADX WARN: Code duplicated, block: B:41:0x006e A[EDGE_INSN: B:41:0x006e->B:42:0x0070 BREAK  A[LOOP:30: B:25:0x0043->B:35:0x005e]] */
    /* JADX WARN: Code duplicated, block: B:424:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:425:0x0064 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11380 m31903(String str, EnumC7169 enumC7169) throws C7915 {
        int i;
        boolean z;
        boolean z2;
        EnumC13880 enumC13880;
        char cCharAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        char c;
        EnumC7169 enumC71610 = enumC7169;
        Charset charset = C1203.f4374;
        Charset charset2 = f41205;
        int i8 = 1;
        if (charset != null && charset.equals(charset2)) {
            byte[] bytes = str.getBytes(C1203.f4374);
            int length = bytes.length;
            boolean z3 = false;
            if (length % 2 == 0) {
                int i9 = 0;
                while (true) {
                    if (i9 >= length) {
                        z3 = true;
                        break;
                    }
                    int i10 = bytes[i9] & 255;
                    if ((i10 < 129 || i10 > 159) && (i10 < 224 || i10 > 235)) {
                        break;
                    }
                    i9 += 2;
                }
            }
            if (!z3) {
                i = 0;
                z = false;
                z2 = false;
                while (true) {
                    if (i < str.length()) {
                        if (z) {
                            if (z2) {
                                enumC13880 = EnumC13880.BYTE;
                                break;
                            }
                            enumC13880 = EnumC13880.NUMERIC;
                            break;
                        }
                        enumC13880 = EnumC13880.ALPHANUMERIC;
                        break;
                    }
                    cCharAt = str.charAt(i);
                    if (cCharAt >= '0') {
                        if (m31902(cCharAt) == -1) {
                            enumC13880 = EnumC13880.BYTE;
                            break;
                        }
                        z = true;
                    } else {
                        if (m31902(cCharAt) == -1) {
                            enumC13880 = EnumC13880.BYTE;
                            break;
                        }
                        z = true;
                    }
                    i++;
                }
            } else {
                enumC13880 = EnumC13880.KANJI;
            }
        } else {
            i = 0;
            z = false;
            z2 = false;
            while (true) {
                if (i < str.length()) {
                    if (z) {
                        if (z2) {
                            enumC13880 = EnumC13880.BYTE;
                            break;
                        }
                        enumC13880 = EnumC13880.NUMERIC;
                        break;
                    }
                    enumC13880 = EnumC13880.ALPHANUMERIC;
                    break;
                }
                cCharAt = str.charAt(i);
                if (cCharAt >= '0' && cCharAt <= '9') {
                    z2 = true;
                } else {
                    if (m31902(cCharAt) == -1) {
                        enumC13880 = EnumC13880.BYTE;
                        break;
                    }
                    z = true;
                }
                i++;
            }
        }
        C19102 c19102 = new C19102();
        EnumC13880 enumC13881 = EnumC13880.BYTE;
        c19102.m44217(enumC13880.m33828(), 4);
        C19102 c19103 = new C19102();
        int i11 = C15109.f49317[enumC13880.ordinal()];
        if (i11 == 1) {
            int length2 = str.length();
            int i12 = 0;
            while (i12 < length2) {
                int iCharAt = str.charAt(i12) - '0';
                int i13 = i12 + 2;
                if (i13 < length2) {
                    c19103.m44217(C12669.m31436(str.charAt(i12 + 1) - '0', 10, iCharAt * 100, str.charAt(i13) - '0'), 10);
                    i12 += 3;
                } else {
                    i12++;
                    if (i12 < length2) {
                        c19103.m44217((iCharAt * 10) + (str.charAt(i12) - '0'), 7);
                        i12 = i13;
                    } else {
                        c19103.m44217(iCharAt, 4);
                    }
                }
            }
        } else if (i11 == 2) {
            int length3 = str.length();
            int i14 = 0;
            while (i14 < length3) {
                int iM31902 = m31902(str.charAt(i14));
                if (iM31902 == -1) {
                    throw new C7915();
                }
                int i15 = i14 + 1;
                if (i15 < length3) {
                    int iM31903 = m31902(str.charAt(i15));
                    if (iM31903 == -1) {
                        throw new C7915();
                    }
                    c19103.m44217((iM31902 * 45) + iM31903, 11);
                    i14 += 2;
                } else {
                    c19103.m44217(iM31902, 6);
                    i14 = i15;
                }
            }
        } else if (i11 == 3) {
            for (byte b : str.getBytes(charset2)) {
                c19103.m44217(b, 8);
            }
        } else {
            if (i11 != 4) {
                throw new C7915("Invalid mode: " + enumC13880);
            }
            Charset charset3 = C1203.f4374;
            if (charset3 == null) {
                throw new C7915("SJIS Charset not supported on this platform");
            }
            byte[] bytes2 = str.getBytes(charset3);
            if (bytes2.length % 2 != 0) {
                throw new C7915("Kanji byte size not even");
            }
            int length4 = bytes2.length - 1;
            for (int i16 = 0; i16 < length4; i16 += 2) {
                int i17 = ((bytes2[i16] & 255) << 8) | (bytes2[i16 + 1] & 255);
                int i18 = (i17 < 33088 || i17 > 40956) ? (i17 < 57408 || i17 > 60351) ? -1 : i17 - 49472 : i17 - 33088;
                if (i18 == -1) {
                    throw new C7915("Invalid byte sequence");
                }
                c19103.m44217(((i18 >> 8) * 192) + (i18 & 255), 13);
            }
        }
        int size = c19103.getSize() + enumC13880.m33829(C10634.m27128(1)) + c19102.getSize();
        int i19 = 1;
        boolean z4 = false;
        while (i19 <= 40) {
            C10634 c10634M27128 = C10634.m27128(i19);
            if (m31904(size, c10634M27128, enumC71610)) {
                int size2 = c19103.getSize() + enumC13880.m33829(c10634M27128) + c19102.getSize();
                int i20 = 1;
                boolean z5 = z4;
                while (i20 <= 40) {
                    C10634 c10634M27129 = C10634.m27128(i20);
                    if (m31904(size2, c10634M27129, enumC71610)) {
                        C19102 c19104 = new C19102();
                        c19104.m44218(c19102);
                        int iM44216 = enumC13880 == enumC13881 ? c19103.m44216() : str.length();
                        int iM33829 = enumC13880.m33829(c10634M27129);
                        int i21 = i8 << iM33829;
                        if (iM44216 >= i21) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(iM44216);
                            sb.append(" is bigger than ");
                            sb.append(i21 - 1);
                            throw new C7915(sb.toString());
                        }
                        c19104.m44217(iM44216, iM33829);
                        c19104.m44218(c19103);
                        C21823 c21823M27130 = c10634M27129.m27130(enumC71610);
                        int iM27132 = c10634M27129.m27132() - c21823M27130.m49476();
                        int i22 = iM27132 * 8;
                        if (c19104.getSize() > i22) {
                            throw new C7915("data bits cannot fit in the QR Code" + c19104.getSize() + " > " + i22);
                        }
                        for (int i23 = 0; i23 < 4 && c19104.getSize() < i22; i23++) {
                            c19104.m44219(z5);
                        }
                        int size3 = c19104.getSize() & 7;
                        if (size3 > 0) {
                            while (size3 < 8) {
                                c19104.m44219(z5);
                                size3++;
                            }
                        }
                        int iM44217 = iM27132 - c19104.m44216();
                        for (int i24 = 0; i24 < iM44217; i24++) {
                            c19104.m44217((i24 & 1) == 0 ? 236 : 17, 8);
                        }
                        if (c19104.getSize() != i22) {
                            throw new C7915("Bits size does not equal capacity");
                        }
                        int iM27133 = c10634M27129.m27132();
                        int iM49474 = c21823M27130.m49474();
                        if (c19104.m44216() != iM27132) {
                            throw new C7915("Number of bits and data bytes does not match");
                        }
                        ArrayList arrayList = new ArrayList(iM49474);
                        int i25 = 0;
                        int i26 = 0;
                        int iMax = 0;
                        int iMax2 = 0;
                        while (i25 < iM49474) {
                            int[] iArr = new int[i8];
                            int[] iArr2 = new int[i8];
                            if (i25 >= iM49474) {
                                throw new C7915("Block ID too large");
                            }
                            int i27 = iM27133 % iM49474;
                            int i28 = iM49474 - i27;
                            int i29 = iM27133 / iM49474;
                            int i30 = iM27132 / iM49474;
                            C10634 c10634 = c10634M27129;
                            int i31 = i30 + 1;
                            EnumC13880 enumC13882 = enumC13880;
                            int i32 = i29 - i30;
                            int i33 = (i29 + 1) - i31;
                            if (i32 != i33) {
                                throw new C7915("EC bytes mismatch");
                            }
                            int i34 = iM27132;
                            if (iM49474 != i28 + i27) {
                                throw new C7915("RS blocks mismatch");
                            }
                            if (iM27133 != C12669.m31441(i31, i33, i27, (i30 + i32) * i28)) {
                                throw new C7915("Total bytes mismatch");
                            }
                            if (i25 < i28) {
                                c = 0;
                                iArr[0] = i30;
                                iArr2[0] = i32;
                            } else {
                                c = 0;
                                iArr[0] = i31;
                                iArr2[0] = i33;
                            }
                            int i35 = iArr[c];
                            byte[] bArr = new byte[i35];
                            int i36 = i26 * 8;
                            int i37 = 0;
                            while (i37 < i35) {
                                int i38 = 0;
                                int i39 = iM49474;
                                for (int i40 = 0; i40 < 8; i40++) {
                                    if (c19104.m44220(i36)) {
                                        i38 = (1 << (7 - i40)) | i38;
                                    }
                                    i36++;
                                }
                                bArr[i37] = (byte) i38;
                                i37++;
                                iM49474 = i39;
                            }
                            int i41 = iM49474;
                            int i42 = iArr2[0];
                            int[] iArr3 = new int[i35 + i42];
                            for (int i43 = 0; i43 < i35; i43++) {
                                iArr3[i43] = bArr[i43] & 255;
                            }
                            new C8660(C9405.f30525).m23314(i42, iArr3);
                            byte[] bArr2 = new byte[i42];
                            for (int i44 = 0; i44 < i42; i44++) {
                                bArr2[i44] = (byte) iArr3[i35 + i44];
                            }
                            arrayList.add(new C22569(bArr, bArr2));
                            iMax = Math.max(iMax, i35);
                            iMax2 = Math.max(iMax2, i42);
                            i26 += iArr[0];
                            i25++;
                            i8 = 1;
                            iM27132 = i34;
                            iM49474 = i41;
                            c10634M27129 = c10634;
                            enumC13880 = enumC13882;
                        }
                        EnumC13880 enumC13883 = enumC13880;
                        C10634 c10635 = c10634M27129;
                        if (iM27132 != i26) {
                            throw new C7915("Data bytes does not match offset");
                        }
                        C19102 c19105 = new C19102();
                        for (int i45 = 0; i45 < iMax; i45++) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                byte[] bArrM50864 = ((C22569) it.next()).m50864();
                                if (i45 < bArrM50864.length) {
                                    c19105.m44217(bArrM50864[i45], 8);
                                }
                            }
                        }
                        for (int i46 = 0; i46 < iMax2; i46++) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                byte[] bArrM50865 = ((C22569) it2.next()).m50865();
                                if (i46 < bArrM50865.length) {
                                    c19105.m44217(bArrM50865[i46], 8);
                                }
                            }
                        }
                        if (iM27133 != c19105.m44216()) {
                            StringBuilder sbM12235 = C3769.m12235(iM27133, "Interleaving error: ", " and ");
                            sbM12235.append(c19105.m44216());
                            sbM12235.append(" differ.");
                            throw new C7915(sbM12235.toString());
                        }
                        C11380 c11380 = new C11380();
                        EnumC7169 enumC71611 = enumC7169;
                        c11380.m28708(enumC71611);
                        c11380.m28710(enumC13883);
                        c11380.m28709(c10635);
                        int iM27129 = c10635.m27129();
                        C19585 c19585 = new C19585(iM27129, iM27129);
                        int i47 = -1;
                        int i48 = Integer.MAX_VALUE;
                        int i49 = 0;
                        while (i49 < 8) {
                            C1686.m6038(c19105, enumC71611, c10635, i49, c19585);
                            int iM16139 = C5415.m16139(c19585);
                            byte[][] bArrM45186 = c19585.m45186();
                            int iM45187 = c19585.m45187();
                            int iM45185 = c19585.m45185();
                            int i50 = 0;
                            int i51 = 0;
                            while (i50 < iM45185 - 1) {
                                byte[] bArr3 = bArrM45186[i50];
                                int i52 = 0;
                                while (true) {
                                    i7 = iM45185;
                                    if (i52 < iM45187 - 1) {
                                        byte b2 = bArr3[i52];
                                        int i53 = i52 + 1;
                                        int i54 = iM45187;
                                        if (b2 == bArr3[i53]) {
                                            byte[] bArr4 = bArrM45186[i50 + 1];
                                            if (b2 == bArr4[i52] && b2 == bArr4[i53]) {
                                                i51++;
                                            }
                                        }
                                        iM45185 = i7;
                                        i52 = i53;
                                        iM45187 = i54;
                                    }
                                }
                                i50++;
                                iM45185 = i7;
                            }
                            int i55 = (i51 * 3) + iM16139;
                            byte[][] bArrM45187 = c19585.m45186();
                            int iM45188 = c19585.m45187();
                            int iM45186 = c19585.m45185();
                            int i56 = 0;
                            for (int i57 = 0; i57 < iM45186; i57++) {
                                int i58 = 0;
                                while (i58 < iM45188) {
                                    byte[] bArr5 = bArrM45187[i57];
                                    C19102 c19106 = c19105;
                                    int i59 = i58 + 6;
                                    if (i59 < iM45188) {
                                        i2 = iM45188;
                                        byte b3 = 1;
                                        if (bArr5[i58] == 1 && bArr5[i58 + 1] == 0 && bArr5[i58 + 2] == 1 && bArr5[i58 + 3] == 1 && bArr5[i58 + 4] == 1 && bArr5[i58 + 5] == 0 && bArr5[i59] == 1) {
                                            int i60 = i58 - 4;
                                            if (i60 >= 0 && bArr5.length >= i58) {
                                                while (true) {
                                                    if (i60 < i58) {
                                                        if (bArr5[i60] == b3) {
                                                            i4 = i58 + 7;
                                                            i5 = i58 + 11;
                                                            if (i4 >= 0) {
                                                                while (true) {
                                                                    if (i4 >= i5) {
                                                                        i6 = i5;
                                                                        if (bArr5[i4] == 1) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i4++;
                                                                        i5 = i6;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            i60++;
                                                            b3 = 1;
                                                        }
                                                    }
                                                    i56++;
                                                    break;
                                                }
                                            } else {
                                                i4 = i58 + 7;
                                                i5 = i58 + 11;
                                                if (i4 >= 0 && bArr5.length >= i5) {
                                                    while (true) {
                                                        if (i4 >= i5) {
                                                            i56++;
                                                            break;
                                                        }
                                                        i6 = i5;
                                                        if (bArr5[i4] == 1) {
                                                            break;
                                                        }
                                                        i4++;
                                                        i5 = i6;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i2 = iM45188;
                                    }
                                    int i61 = i57 + 6;
                                    if (i61 < iM45186) {
                                        byte b4 = 1;
                                        if (bArrM45187[i57][i58] == 1 && bArrM45187[i57 + 1][i58] == 0 && bArrM45187[i57 + 2][i58] == 1 && bArrM45187[i57 + 3][i58] == 1 && bArrM45187[i57 + 4][i58] == 1 && bArrM45187[i57 + 5][i58] == 0 && bArrM45187[i61][i58] == 1) {
                                            int i62 = i57 - 4;
                                            if (i62 >= 0 && bArrM45187.length >= i57) {
                                                while (true) {
                                                    if (i62 < i57) {
                                                        if (bArrM45187[i62][i58] == b4) {
                                                            i3 = i57 + 7;
                                                            int i63 = i57 + 11;
                                                            if (i3 < 0) {
                                                            }
                                                        } else {
                                                            i62++;
                                                            b4 = 1;
                                                        }
                                                    }
                                                    i56++;
                                                    break;
                                                    break;
                                                }
                                            }
                                            i3 = i57 + 7;
                                            int i64 = i57 + 11;
                                            if (i3 < 0 && bArrM45187.length >= i64) {
                                                while (true) {
                                                    if (i3 >= i64) {
                                                        i56++;
                                                        break;
                                                    }
                                                    if (bArrM45187[i3][i58] == 1) {
                                                        break;
                                                    }
                                                    i3++;
                                                }
                                            }
                                        }
                                    }
                                    i58++;
                                    c19105 = c19106;
                                    iM45188 = i2;
                                }
                            }
                            C19102 c19107 = c19105;
                            int i65 = (i56 * 40) + i55;
                            byte[][] bArrM45188 = c19585.m45186();
                            int iM45189 = c19585.m45187();
                            int iM451810 = c19585.m45185();
                            int i66 = 0;
                            for (int i67 = 0; i67 < iM451810; i67++) {
                                byte[] bArr6 = bArrM45188[i67];
                                for (int i68 = 0; i68 < iM45189; i68++) {
                                    if (bArr6[i68] == 1) {
                                        i66++;
                                    }
                                }
                            }
                            int iM451811 = c19585.m45187() * c19585.m45185();
                            int iAbs = (((Math.abs((i66 * 2) - iM451811) * 10) / iM451811) * 10) + i65;
                            if (iAbs < i48) {
                                i48 = iAbs;
                                i47 = i49;
                            }
                            i49++;
                            c19105 = c19107;
                            enumC71611 = enumC7169;
                        }
                        c11380.m28707(i47);
                        C1686.m6038(c19105, enumC7169, c10635, i47, c19585);
                        c11380.m28711(c19585);
                        return c11380;
                    }
                    i20++;
                    z5 = false;
                    enumC71610 = enumC71610;
                    enumC13880 = enumC13880;
                    i8 = 1;
                }
                throw new C7915("Data too big");
            }
            i19++;
            z4 = false;
            enumC71610 = enumC71610;
            enumC13880 = enumC13880;
            i8 = 1;
        }
        throw new C7915("Data too big");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m31904(int i, C10634 c10634, EnumC7169 enumC7169) {
        return c10634.m27132() - c10634.m27130(enumC7169).m49476() >= (i + 7) / 8;
    }
}
