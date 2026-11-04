package l;

import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۤܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6ZO */
/* JADX INFO: loaded from: classes3.dex */
public final class C11008 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27867(C6178 c6178, C24413 c24413, C1270 c1270, C8246 c8246, boolean z, boolean z2, C6711 c6711, C20881 c20881) {
        C17359.requireNonNull(c6178, "out");
        C17359.requireNonNull(c24413, "definition");
        long position = c6178.getPosition();
        try {
            C16800 c16800M54613 = c24413.m54613();
            C20661 c20661M54614 = c24413.m54614();
            String strM24620 = c16800M54613 == null ? null : C9341.m24620(c16800M54613);
            if (z && c16800M54613 != null && strM24620 != null && c20661M54614 != null && c1270 != null) {
                boolean z3 = false;
                if (z2 && c6711 == null && c8246 != null && c8246.m22191() == c1270.m4628()) {
                    if (c1270.m4633() <= 1000000 && c8246.m22181() <= 1000000) {
                        m27866(c6178, 1, strM24620, c20661M54614, c1270.m4628(), 0, c1270.m4628(), c1270, c8246, c20881);
                        return;
                    }
                }
                if (!z2 && c6711 != null && c6711.m18742() == c1270 && c6711.m18743()) {
                    C1270 c1270M18745 = c6711.m18745();
                    C8246 c8246M18747 = c6711.m18747();
                    if (c1270M18745 != null && c8246M18747 != null && c8246M18747.m22191() == c1270M18745.m4628()) {
                        if (c1270M18745.m4633() <= 1000000 && c8246M18747.m22181() <= 1000000) {
                            z3 = true;
                        }
                        if (z3) {
                            m27866(c6178, 2, strM24620, c20661M54614, c1270.m4628(), c6711.m18746(), c6711.m18738(), c1270M18745, c8246M18747, c20881);
                            return;
                        }
                    }
                }
                m27865(c6178);
                return;
            }
            m27865(c6178);
        } catch (RuntimeException unused) {
            c6178.seek(position);
            c6178.m17782((int) position);
            m27865(c6178);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27866(C6178 c6178, int i, String str, C20661 c20661, int i2, int i3, int i4, C1270 c1270, C8246 c8246, C20881 c20881) {
        if (c1270.m4628() != i4 - i3 || c8246.m22191() != c1270.m4628()) {
            throw new IllegalArgumentException("Syntax cache payload coverage differs");
        }
        c6178.writeInt(1398361651);
        c6178.writeInt(3);
        int position = (int) c6178.getPosition();
        c6178.writeByte(i);
        c6178.m17786((CharSequence) str);
        c6178.writeInt(c20661.m47287());
        c6178.writeInt(i2);
        c6178.writeInt(i3);
        c6178.writeInt(i4);
        c6178.m17789(c20881 != null);
        if (c20881 != null) {
            int iM47722 = c20881.m47722();
            if (iM47722 > 32) {
                throw new IllegalArgumentException("Too many syntax derived refresh ranges");
            }
            c6178.writeInt(iM47722);
            int iM2486 = -1;
            for (int i5 = 0; i5 < iM47722; i5++) {
                C0524 c0524M47718 = c20881.m47718(i5);
                if (c0524M47718.m2487() < 0 || c0524M47718.m2487() >= c0524M47718.m2486() || c0524M47718.m2486() > i2 || c0524M47718.m2487() <= iM2486) {
                    throw new IllegalArgumentException("Invalid syntax derived refresh range");
                }
                c6178.writeInt(c0524M47718.m2487());
                c6178.writeInt(c0524M47718.m2486());
                iM2486 = c0524M47718.m2486();
            }
        }
        C22197 c22197 = new C22197();
        C21407 c21407 = new C21407();
        c21407.m48710(c1270);
        while (c21407.m48714()) {
            c22197.m50215(c21407.m48712());
        }
        c6178.writeInt(c1270.m4633());
        c6178.writeInt(c22197.m50212());
        for (int i6 = 0; i6 < c22197.m50212(); i6++) {
            C11974 c11974M50214 = c22197.m50214(i6);
            c6178.writeInt(c11974M50214.m30041());
            c6178.writeInt(c11974M50214.m30046());
            c6178.writeInt(c11974M50214.m30034());
            c6178.writeInt(c11974M50214.m30047());
            c6178.writeInt(c11974M50214.m30042());
            String strM30035 = c11974M50214.m30035();
            c6178.m17789(strM30035 != null);
            if (strM30035 != null) {
                c6178.m17786((CharSequence) strM30035);
            }
        }
        c21407.m48710(c1270);
        while (c21407.m48714()) {
            int iM48709 = c21407.m48709() - c21407.m48715();
            if (c21407.m48716()) {
                iM48709 |= Integer.MIN_VALUE;
            }
            c6178.writeInt(iM48709);
            c6178.writeInt(c22197.m50213(c21407.m48712()));
        }
        c6178.writeInt(c8246.m22181());
        for (int i7 = 0; i7 < c8246.m22181(); i7++) {
            c6178.writeInt(c8246.m22189(i7));
            c6178.writeInt(c8246.m22186(i7));
            c6178.writeInt(c8246.m22190(i7));
            C16800 c16800M22193 = c8246.m22193(i7);
            int iM47278 = c16800M22193 == null ? -1 : c20661.m47278(c16800M22193);
            if (c16800M22193 != null && iM47278 < 0) {
                throw new IllegalArgumentException("Syntax context language is outside program graph");
            }
            c6178.writeInt(iM47278 + 1);
        }
        byte[] bArrM17808 = c6178.m17808();
        int position2 = (int) c6178.getPosition();
        CRC32 crc32 = new CRC32();
        crc32.update(bArrM17808, position, position2 - position);
        c6178.writeInt((int) crc32.getValue());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27865(C6178 c6178) {
        c6178.writeInt(1398361651);
        c6178.writeInt(3);
        int position = (int) c6178.getPosition();
        c6178.writeByte(0);
        byte[] bArrM17808 = c6178.m17808();
        int position2 = (int) c6178.getPosition();
        CRC32 crc32 = new CRC32();
        crc32.update(bArrM17808, position, position2 - position);
        c6178.writeInt((int) crc32.getValue());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13969 m27863(int i, int i2, C20348 c20348) {
        C13969 c13969M34040;
        C17359.requireNonNull(c20348, "in");
        byte[] bArr = c20348.f65270;
        int iM46744 = c20348.m46744();
        if (i < iM46744 || i > bArr.length) {
            throw new IndexOutOfBoundsException("Syntax cache record is outside input");
        }
        C24413 c24413M54612 = C24413.m54612(null);
        try {
            if (i - iM46744 < 13) {
                c13969M34040 = C13969.m34040(c24413M54612);
            } else {
                C5043 c5043 = new C5043(bArr, iM46744, i);
                if (c5043.m15275() != 1398361651 || c5043.m15275() != 3) {
                    c13969M34040 = C13969.m34040(c24413M54612);
                } else {
                    int iM15271 = c5043.m15271();
                    int i3 = i - 4;
                    int iM27868 = m27868(i3, bArr);
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr, iM15271, i3 - iM15271);
                    if (((int) crc32.getValue()) != iM27868) {
                        c13969M34040 = C13969.m34040(c24413M54612);
                    } else {
                        C5043 c5044 = new C5043(bArr, iM15271, i3);
                        int iM15273 = c5044.m15273();
                        if (iM15273 == 0) {
                            c5044.m15274();
                            c13969M34040 = C13969.m34040(c24413M54612);
                        } else {
                            if (iM15273 != 1 && iM15273 != 2) {
                                throw new IllegalArgumentException("Unknown syntax cache kind");
                            }
                            C24413 c24413M54613 = C24413.m54612(C9341.m24619(c5044.m15272(16384)));
                            C20661 c20661M54614 = c24413M54613.m54614();
                            C16800 c16800M54613 = c24413M54613.m54613();
                            int iM15275 = c5044.m15275();
                            int iM15276 = c5044.m15275();
                            int iM15277 = c5044.m15275();
                            int iM15278 = c5044.m15275();
                            if (c20661M54614 == null || c16800M54613 == null || c20661M54614.m47287() != iM15275 || iM15276 != i2 || iM15276 < 0 || iM15277 < 0 || iM15278 < iM15277 || iM15278 > iM15276) {
                                throw new IllegalArgumentException("Syntax cache identity differs");
                            }
                            int i4 = iM15278 - iM15277;
                            if (iM15273 == 1 && (iM15277 != 0 || iM15278 != iM15276 || iM15276 > 1000000)) {
                                throw new IllegalArgumentException("Invalid full syntax cache coverage");
                            }
                            C20881 c20881M27864 = m27864(c5044, iM15276);
                            C1270 c1270M27869 = m27869(c5044, i4);
                            C8246 c8246M27862 = m27862(c5044, i4, c20661M54614);
                            c5044.m15274();
                            if (iM15273 == 1) {
                                c13969M34040 = C13969.m34041(c24413M54613, c1270M27869, c8246M27862, c20881M27864);
                            } else {
                                c13969M34040 = C13969.m34042(c24413M54613, C6711.m18736(iM15276, iM15277, c1270M27869, c8246M27862, c20661M54614.f66262), c20881M27864);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException unused) {
            c13969M34040 = C13969.m34040(c24413M54612);
        } finally {
            c20348.seek(i);
        }
        return c13969M34040;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C1270 m27869(C5043 c5043, int i) {
        int iM15275 = c5043.m15275();
        int iM15276 = c5043.m15275();
        if (iM15275 < 0 || iM15276 < 0 || ((i == 0 && (iM15275 != 0 || iM15276 != 0)) || ((i != 0 && (iM15275 == 0 || iM15275 > i || iM15275 > 1000000 || iM15276 == 0 || iM15276 > iM15275)) || iM15276 > c5043.m15276() / 21))) {
            throw new IllegalArgumentException("Invalid syntax cache run counts");
        }
        C11974[] c11974Arr = new C11974[iM15276];
        for (int i2 = 0; i2 < iM15276; i2++) {
            int iM15277 = c5043.m15275();
            int iM15278 = c5043.m15275();
            int iM15279 = c5043.m15275();
            int iM152710 = c5043.m15275();
            int iM152711 = c5043.m15275();
            int iM15273 = c5043.m15273();
            if (iM15273 == 0 || iM15273 == 255) {
                c11974Arr[i2] = C11974.m30032(iM15273 != 0 ? c5043.m15272(65536) : null, iM15277, iM15278, iM15279, iM152710, iM152711);
            } else {
                throw new IllegalArgumentException("Invalid syntax cache boolean");
            }
        }
        C14693 c14693 = new C14693();
        int i3 = 0;
        for (int i4 = 0; i4 < iM15275; i4++) {
            int iM152712 = c5043.m15275();
            boolean z = iM152712 < 0;
            int i5 = iM152712 & Integer.MAX_VALUE;
            int iM152713 = c5043.m15275();
            if (i5 <= 0 || iM152713 < 0 || iM152713 >= iM15276 || ((long) i3) + ((long) i5) > i) {
                throw new IllegalArgumentException("Invalid syntax cache run");
            }
            c14693.m35347(i5, c11974Arr[iM152713], z);
            i3 += i5;
        }
        if (i3 != i) {
            throw new IllegalArgumentException("Syntax cache runs do not cover payload");
        }
        return c14693.m35346();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8246 m27862(C5043 c5043, int i, C20661 c20661) {
        int iM15275 = c5043.m15275();
        if (iM15275 <= 0 || iM15275 > 1000000 || iM15275 > c5043.m15276() / 16) {
            throw new IllegalArgumentException("Invalid syntax cache context count");
        }
        int[] iArr = new int[iM15275];
        int[] iArr2 = new int[iM15275];
        int[] iArr3 = new int[iM15275];
        C16800[] c16800Arr = new C16800[iM15275];
        for (int i2 = 0; i2 < iM15275; i2++) {
            int iM15276 = c5043.m15275();
            iArr[i2] = iM15276;
            int iM15277 = c5043.m15275();
            iArr2[i2] = iM15277;
            int iM15278 = c5043.m15275();
            iArr3[i2] = iM15278;
            int iM15279 = c5043.m15275();
            if (iM15276 < 0 || iM15277 < iM15276 || iM15277 > i || ((i2 == 0 && iM15278 != -1) || ((i2 != 0 && (iM15278 < 0 || iM15278 >= i2)) || iM15279 < 0 || iM15279 > c20661.m47277()))) {
                throw new IllegalArgumentException("Invalid syntax cache context node");
            }
            c16800Arr[i2] = iM15279 == 0 ? null : c20661.m47280(iM15279 - 1);
        }
        if (iArr[0] != 0 || iArr2[0] != i || c16800Arr[0] != c20661.f66265) {
            throw new IllegalArgumentException("Invalid syntax cache context root");
        }
        return new C8246(i, iM15275, iArr, iArr2, iArr3, c16800Arr);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m27868(int i, byte[] bArr) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20881 m27864(C5043 c5043, int i) {
        int iM15273 = c5043.m15273();
        if (iM15273 != 0 && iM15273 != 255) {
            throw new IllegalArgumentException("Invalid syntax cache boolean");
        }
        if (iM15273 == 0) {
            return null;
        }
        int iM15275 = c5043.m15275();
        if (iM15275 < 0 || iM15275 > 32 || iM15275 > c5043.m15276() / 8) {
            throw new IllegalArgumentException("Invalid syntax derived refresh range count");
        }
        C20881 c20881M47716 = C20881.f66829;
        int i2 = -1;
        int i3 = 0;
        while (i3 < iM15275) {
            int iM15276 = c5043.m15275();
            int iM15277 = c5043.m15275();
            if (iM15276 < 0 || iM15276 >= iM15277 || iM15277 > i || iM15276 <= i2) {
                throw new IllegalArgumentException("Invalid syntax derived refresh range");
            }
            c20881M47716 = C20881.m47716(c20881M47716, iM15276, iM15277);
            i3++;
            i2 = iM15277;
        }
        return c20881M47716;
    }
}
