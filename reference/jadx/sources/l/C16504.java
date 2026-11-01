package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽ۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 5281 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16504 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int[] f53020 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Charset f53021 = StandardCharsets.ISO_8859_1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m38777(int i) {
        if (i < 96) {
            return f53020[i];
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
    public static C5920 m38778(String str, EnumC19326 enumC19326) throws C6625 {
        int i;
        boolean z;
        boolean z2;
        EnumC8743 enumC8743;
        char cCharAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        char c;
        EnumC19326 enumC19327 = enumC19326;
        Charset charset = C21442.f69712;
        Charset charset2 = f53021;
        int i8 = 1;
        if (charset != null && charset.equals(charset2)) {
            byte[] bytes = str.getBytes(C21442.f69712);
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
                                enumC8743 = EnumC8743.BYTE;
                                break;
                            }
                            enumC8743 = EnumC8743.NUMERIC;
                            break;
                        }
                        enumC8743 = EnumC8743.ALPHANUMERIC;
                        break;
                    }
                    cCharAt = str.charAt(i);
                    if (cCharAt >= '0') {
                        if (m38777(cCharAt) == -1) {
                            enumC8743 = EnumC8743.BYTE;
                            break;
                        }
                        z = true;
                    } else {
                        if (m38777(cCharAt) == -1) {
                            enumC8743 = EnumC8743.BYTE;
                            break;
                        }
                        z = true;
                    }
                    i++;
                }
            } else {
                enumC8743 = EnumC8743.KANJI;
            }
        } else {
            i = 0;
            z = false;
            z2 = false;
            while (true) {
                if (i < str.length()) {
                    if (z) {
                        if (z2) {
                            enumC8743 = EnumC8743.BYTE;
                            break;
                        }
                        enumC8743 = EnumC8743.NUMERIC;
                        break;
                    }
                    enumC8743 = EnumC8743.ALPHANUMERIC;
                    break;
                }
                cCharAt = str.charAt(i);
                if (cCharAt >= '0' && cCharAt <= '9') {
                    z2 = true;
                } else {
                    if (m38777(cCharAt) == -1) {
                        enumC8743 = EnumC8743.BYTE;
                        break;
                    }
                    z = true;
                }
                i++;
            }
        }
        C22854 c22854 = new C22854();
        EnumC8743 enumC8744 = EnumC8743.BYTE;
        c22854.m50601(enumC8743.m22682(), 4);
        C22854 c22855 = new C22854();
        int i11 = C0275.f1564[enumC8743.ordinal()];
        if (i11 == 1) {
            int length2 = str.length();
            int i12 = 0;
            while (i12 < length2) {
                int iCharAt = str.charAt(i12) - '0';
                int i13 = i12 + 2;
                if (i13 < length2) {
                    c22855.m50601(C1694.m5620(str.charAt(i12 + 1) - '0', 10, iCharAt * 100, str.charAt(i13) - '0'), 10);
                    i12 += 3;
                } else {
                    i12++;
                    if (i12 < length2) {
                        c22855.m50601((iCharAt * 10) + (str.charAt(i12) - '0'), 7);
                        i12 = i13;
                    } else {
                        c22855.m50601(iCharAt, 4);
                    }
                }
            }
        } else if (i11 == 2) {
            int length3 = str.length();
            int i14 = 0;
            while (i14 < length3) {
                int iM38777 = m38777(str.charAt(i14));
                if (iM38777 == -1) {
                    throw new C6625();
                }
                int i15 = i14 + 1;
                if (i15 < length3) {
                    int iM38778 = m38777(str.charAt(i15));
                    if (iM38778 == -1) {
                        throw new C6625();
                    }
                    c22855.m50601((iM38777 * 45) + iM38778, 11);
                    i14 += 2;
                } else {
                    c22855.m50601(iM38777, 6);
                    i14 = i15;
                }
            }
        } else if (i11 == 3) {
            for (byte b : str.getBytes(charset2)) {
                c22855.m50601(b, 8);
            }
        } else {
            if (i11 != 4) {
                throw new C6625("Invalid mode: " + enumC8743);
            }
            Charset charset3 = C21442.f69712;
            if (charset3 == null) {
                throw new C6625("SJIS Charset not supported on this platform");
            }
            byte[] bytes2 = str.getBytes(charset3);
            if (bytes2.length % 2 != 0) {
                throw new C6625("Kanji byte size not even");
            }
            int length4 = bytes2.length - 1;
            for (int i16 = 0; i16 < length4; i16 += 2) {
                int i17 = ((bytes2[i16] & 255) << 8) | (bytes2[i16 + 1] & 255);
                int i18 = (i17 < 33088 || i17 > 40956) ? (i17 < 57408 || i17 > 60351) ? -1 : i17 - 49472 : i17 - 33088;
                if (i18 == -1) {
                    throw new C6625("Invalid byte sequence");
                }
                c22855.m50601(((i18 >> 8) * 192) + (i18 & 255), 13);
            }
        }
        int size = c22855.getSize() + enumC8743.m22683(C20737.m46676(1)) + c22854.getSize();
        int i19 = 1;
        boolean z4 = false;
        while (i19 <= 40) {
            C20737 c20737M46676 = C20737.m46676(i19);
            if (m38779(size, c20737M46676, enumC19327)) {
                int size2 = c22855.getSize() + enumC8743.m22683(c20737M46676) + c22854.getSize();
                int i20 = 1;
                boolean z5 = z4;
                while (i20 <= 40) {
                    C20737 c20737M46677 = C20737.m46676(i20);
                    if (m38779(size2, c20737M46677, enumC19327)) {
                        C22854 c22856 = new C22854();
                        c22856.m50602(c22854);
                        int iM50600 = enumC8743 == enumC8744 ? c22855.m50600() : str.length();
                        int iM22683 = enumC8743.m22683(c20737M46677);
                        int i21 = i8 << iM22683;
                        if (iM50600 >= i21) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(iM50600);
                            sb.append(" is bigger than ");
                            sb.append(i21 - 1);
                            throw new C6625(sb.toString());
                        }
                        c22856.m50601(iM50600, iM22683);
                        c22856.m50602(c22855);
                        C7331 c7331M46678 = c20737M46677.m46678(enumC19327);
                        int iM46680 = c20737M46677.m46680() - c7331M46678.m19598();
                        int i22 = iM46680 * 8;
                        if (c22856.getSize() > i22) {
                            throw new C6625("data bits cannot fit in the QR Code" + c22856.getSize() + " > " + i22);
                        }
                        for (int i23 = 0; i23 < 4 && c22856.getSize() < i22; i23++) {
                            c22856.m50603(z5);
                        }
                        int size3 = c22856.getSize() & 7;
                        if (size3 > 0) {
                            while (size3 < 8) {
                                c22856.m50603(z5);
                                size3++;
                            }
                        }
                        int iM50601 = iM46680 - c22856.m50600();
                        for (int i24 = 0; i24 < iM50601; i24++) {
                            c22856.m50601((i24 & 1) == 0 ? 236 : 17, 8);
                        }
                        if (c22856.getSize() != i22) {
                            throw new C6625("Bits size does not equal capacity");
                        }
                        int iM46681 = c20737M46677.m46680();
                        int iM19600 = c7331M46678.m19600();
                        if (c22856.m50600() != iM46680) {
                            throw new C6625("Number of bits and data bytes does not match");
                        }
                        ArrayList arrayList = new ArrayList(iM19600);
                        int i25 = 0;
                        int i26 = 0;
                        int iMax = 0;
                        int iMax2 = 0;
                        while (i25 < iM19600) {
                            int[] iArr = new int[i8];
                            int[] iArr2 = new int[i8];
                            if (i25 >= iM19600) {
                                throw new C6625("Block ID too large");
                            }
                            int i27 = iM46681 % iM19600;
                            int i28 = iM19600 - i27;
                            int i29 = iM46681 / iM19600;
                            int i30 = iM46680 / iM19600;
                            C20737 c20737 = c20737M46677;
                            int i31 = i30 + 1;
                            EnumC8743 enumC8745 = enumC8743;
                            int i32 = i29 - i30;
                            int i33 = (i29 + 1) - i31;
                            if (i32 != i33) {
                                throw new C6625("EC bytes mismatch");
                            }
                            int i34 = iM46680;
                            if (iM19600 != i28 + i27) {
                                throw new C6625("RS blocks mismatch");
                            }
                            if (iM46681 != C0252.m1692(i31, i33, i27, (i30 + i32) * i28)) {
                                throw new C6625("Total bytes mismatch");
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
                                int i39 = iM19600;
                                for (int i40 = 0; i40 < 8; i40++) {
                                    if (c22856.m50604(i36)) {
                                        i38 = (1 << (7 - i40)) | i38;
                                    }
                                    i36++;
                                }
                                bArr[i37] = (byte) i38;
                                i37++;
                                iM19600 = i39;
                            }
                            int i41 = iM19600;
                            int i42 = iArr2[0];
                            int[] iArr3 = new int[i35 + i42];
                            for (int i43 = 0; i43 < i35; i43++) {
                                iArr3[i43] = bArr[i43] & 255;
                            }
                            new C8037(C17914.f56897).m21145(i42, iArr3);
                            byte[] bArr2 = new byte[i42];
                            for (int i44 = 0; i44 < i42; i44++) {
                                bArr2[i44] = (byte) iArr3[i35 + i44];
                            }
                            arrayList.add(new C15799(bArr, bArr2));
                            iMax = Math.max(iMax, i35);
                            iMax2 = Math.max(iMax2, i42);
                            i26 += iArr[0];
                            i25++;
                            i8 = 1;
                            iM46680 = i34;
                            iM19600 = i41;
                            c20737M46677 = c20737;
                            enumC8743 = enumC8745;
                        }
                        EnumC8743 enumC8746 = enumC8743;
                        C20737 c20738 = c20737M46677;
                        if (iM46680 != i26) {
                            throw new C6625("Data bytes does not match offset");
                        }
                        C22854 c22857 = new C22854();
                        for (int i45 = 0; i45 < iMax; i45++) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                byte[] bArrM37572 = ((C15799) it.next()).m37572();
                                if (i45 < bArrM37572.length) {
                                    c22857.m50601(bArrM37572[i45], 8);
                                }
                            }
                        }
                        for (int i46 = 0; i46 < iMax2; i46++) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                byte[] bArrM37573 = ((C15799) it2.next()).m37573();
                                if (i46 < bArrM37573.length) {
                                    c22857.m50601(bArrM37573[i46], 8);
                                }
                            }
                        }
                        if (iM46681 != c22857.m50600()) {
                            StringBuilder sbM40153 = C17214.m40153(iM46681, "Interleaving error: ", " and ");
                            sbM40153.append(c22857.m50600());
                            sbM40153.append(" differ.");
                            throw new C6625(sbM40153.toString());
                        }
                        C5920 c5920 = new C5920();
                        EnumC19326 enumC19328 = enumC19326;
                        c5920.m16183(enumC19328);
                        c5920.m16182(enumC8746);
                        c5920.m16185(c20738);
                        int iM46677 = c20738.m46677();
                        C20032 c20032 = new C20032(iM46677, iM46677);
                        int i47 = -1;
                        int i48 = Integer.MAX_VALUE;
                        int i49 = 0;
                        while (i49 < 8) {
                            C17209.m40133(c22857, enumC19328, c20738, i49, c20032);
                            int iM30494 = C12271.m30494(c20032);
                            byte[][] bArrM45363 = c20032.m45363();
                            int iM45357 = c20032.m45357();
                            int iM45362 = c20032.m45362();
                            int i50 = 0;
                            int i51 = 0;
                            while (i50 < iM45362 - 1) {
                                byte[] bArr3 = bArrM45363[i50];
                                int i52 = 0;
                                while (true) {
                                    i7 = iM45362;
                                    if (i52 < iM45357 - 1) {
                                        byte b2 = bArr3[i52];
                                        int i53 = i52 + 1;
                                        int i54 = iM45357;
                                        if (b2 == bArr3[i53]) {
                                            byte[] bArr4 = bArrM45363[i50 + 1];
                                            if (b2 == bArr4[i52] && b2 == bArr4[i53]) {
                                                i51++;
                                            }
                                        }
                                        iM45362 = i7;
                                        i52 = i53;
                                        iM45357 = i54;
                                    }
                                }
                                i50++;
                                iM45362 = i7;
                            }
                            int i55 = (i51 * 3) + iM30494;
                            byte[][] bArrM45364 = c20032.m45363();
                            int iM45358 = c20032.m45357();
                            int iM45363 = c20032.m45362();
                            int i56 = 0;
                            for (int i57 = 0; i57 < iM45363; i57++) {
                                int i58 = 0;
                                while (i58 < iM45358) {
                                    byte[] bArr5 = bArrM45364[i57];
                                    C22854 c22858 = c22857;
                                    int i59 = i58 + 6;
                                    if (i59 < iM45358) {
                                        i2 = iM45358;
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
                                        i2 = iM45358;
                                    }
                                    int i61 = i57 + 6;
                                    if (i61 < iM45363) {
                                        byte b4 = 1;
                                        if (bArrM45364[i57][i58] == 1 && bArrM45364[i57 + 1][i58] == 0 && bArrM45364[i57 + 2][i58] == 1 && bArrM45364[i57 + 3][i58] == 1 && bArrM45364[i57 + 4][i58] == 1 && bArrM45364[i57 + 5][i58] == 0 && bArrM45364[i61][i58] == 1) {
                                            int i62 = i57 - 4;
                                            if (i62 >= 0 && bArrM45364.length >= i57) {
                                                while (true) {
                                                    if (i62 < i57) {
                                                        if (bArrM45364[i62][i58] == b4) {
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
                                            if (i3 < 0 && bArrM45364.length >= i64) {
                                                while (true) {
                                                    if (i3 >= i64) {
                                                        i56++;
                                                        break;
                                                    }
                                                    if (bArrM45364[i3][i58] == 1) {
                                                        break;
                                                    }
                                                    i3++;
                                                }
                                            }
                                        }
                                    }
                                    i58++;
                                    c22857 = c22858;
                                    iM45358 = i2;
                                }
                            }
                            C22854 c22859 = c22857;
                            int i65 = (i56 * 40) + i55;
                            byte[][] bArrM45365 = c20032.m45363();
                            int iM45359 = c20032.m45357();
                            int iM45364 = c20032.m45362();
                            int i66 = 0;
                            for (int i67 = 0; i67 < iM45364; i67++) {
                                byte[] bArr6 = bArrM45365[i67];
                                for (int i68 = 0; i68 < iM45359; i68++) {
                                    if (bArr6[i68] == 1) {
                                        i66++;
                                    }
                                }
                            }
                            int iM453510 = c20032.m45357() * c20032.m45362();
                            int iAbs = (((Math.abs((i66 * 2) - iM453510) * 10) / iM453510) * 10) + i65;
                            if (iAbs < i48) {
                                i48 = iAbs;
                                i47 = i49;
                            }
                            i49++;
                            c22857 = c22859;
                            enumC19328 = enumC19326;
                        }
                        c5920.m16181(i47);
                        C17209.m40133(c22857, enumC19326, c20738, i47, c20032);
                        c5920.m16184(c20032);
                        return c5920;
                    }
                    i20++;
                    z5 = false;
                    enumC19327 = enumC19327;
                    enumC8743 = enumC8743;
                    i8 = 1;
                }
                throw new C6625("Data too big");
            }
            i19++;
            z4 = false;
            enumC19327 = enumC19327;
            enumC8743 = enumC8743;
            i8 = 1;
        }
        throw new C6625("Data too big");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m38779(int i, C20737 c20737, EnumC19326 enumC19326) {
        return c20737.m46680() - c20737.m46678(enumC19326).m19598() >= (i + 7) / 8;
    }
}
