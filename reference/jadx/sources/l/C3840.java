package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۘ֫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: W8IL */
/* JADX INFO: loaded from: classes2.dex */
public final class C3840 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f13078;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f13079;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f13080;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f13081;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean f13082;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f13083;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f13084;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C6197 f13085;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f13086;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f13087;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final float f13088;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f13089;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f13090;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f13091;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int f13092;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f13093;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f13094;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f13095;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f13096;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3840 m12380(C21287 c21287) {
        return m12382(c21287, false, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3840 m12381(C21287 c21287, C6197 c6197) {
        return m12382(c21287, true, c6197);
    }

    /* JADX WARN: Code duplicated, block: B:135:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:136:0x02a7  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3840 m12382(C21287 c21287, boolean z, C6197 c6197) throws C2970 {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str5 = "L-HEVC config";
        String str6 = "Error parsing";
        try {
            if (z) {
                c21287.m48503(4);
            } else {
                c21287.m48503(21);
            }
            int iM48493 = c21287.m48493() & 3;
            int iM48494 = c21287.m48493();
            ArrayList arrayList = new ArrayList();
            boolean z2 = false;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                Throwable th = null;
                int i8 = -1;
                if (i6 < iM48494) {
                    c21287.m48503(1);
                    int iM48495 = c21287.m48494();
                    int i9 = 0;
                    while (i9 < iM48495) {
                        int iM48496 = c21287.m48494();
                        if (iM48496 > c21287.m48486()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Error parsing");
                            sb.append(z ? "L-HEVC config" : "HEVC config");
                            throw C2970.m9688(sb.toString(), th);
                        }
                        if (iM48496 < 2) {
                            arrayList.add(new C23978(c21287.m48516(), iM48496, i8, z2));
                            c21287.m48503(iM48496);
                        } else {
                            arrayList.add(new C23978(c21287.m48516(), iM48496, (c21287.m48497()[c21287.m48516()] & 126) >> 1, true));
                            i7 += iM48496 + 4;
                            c21287.m48503(iM48496);
                        }
                        i9++;
                        z2 = false;
                        th = null;
                        i8 = -1;
                    }
                    i6++;
                    z2 = false;
                } else {
                    byte[] bArr = new byte[i7];
                    C6197 c6197M34831 = c6197;
                    str = "HEVC config";
                    String strM48971 = null;
                    int i10 = 0;
                    int i11 = 0;
                    boolean z3 = false;
                    boolean z4 = false;
                    boolean z5 = false;
                    boolean z6 = false;
                    boolean z7 = false;
                    boolean z8 = false;
                    int i12 = -1;
                    int i13 = -1;
                    int i14 = -1;
                    int i15 = -1;
                    int i16 = -1;
                    int i17 = -1;
                    int i18 = -1;
                    int i19 = -1;
                    int i20 = -1;
                    float f = 1.0f;
                    int i21 = -1;
                    boolean z9 = false;
                    boolean z10 = false;
                    boolean z11 = false;
                    while (i10 < arrayList.size()) {
                        try {
                            C23978 c23978 = (C23978) arrayList.get(i10);
                            str2 = str5;
                            try {
                                boolean z12 = c23978.f77599;
                                ArrayList arrayList2 = arrayList;
                                int i22 = c23978.f77596;
                                if (z12) {
                                    str3 = str6;
                                    try {
                                        System.arraycopy(C14399.f45378, 0, bArr, i11, 4);
                                        int i23 = i11 + 4;
                                        System.arraycopy(c21287.m48497(), c23978.f77597, bArr, i23, i22);
                                        int i24 = c23978.f77598;
                                        if (i24 != 32) {
                                            if (i24 != 33) {
                                                z6 = z6;
                                                if (i24 == 34) {
                                                    z5 = true;
                                                } else if (i24 == 39 && !z8) {
                                                    try {
                                                        C23351 c23351M34826 = C14399.m34826(i23, i23 + i22, bArr);
                                                        if (c23351M34826 != null && c6197M34831 != null) {
                                                            i20 = c23351M34826.f75629 == ((C1722) c6197M34831.f21095.get(0)).f5877 ? 4 : 5;
                                                        }
                                                    } catch (RuntimeException unused) {
                                                    }
                                                    z8 = true;
                                                }
                                            } else if (z7) {
                                                z4 = true;
                                            } else {
                                                try {
                                                    C3213 c3213M34824 = C14399.m34824(bArr, i23, i23 + i22, c6197M34831);
                                                    i12 = c3213M34824.f10465 + 1;
                                                    int i25 = c3213M34824.f10466;
                                                    try {
                                                        int i26 = c3213M34824.f10467;
                                                        try {
                                                            i15 = c3213M34824.f10471 + 8;
                                                            i16 = c3213M34824.f10462 + 8;
                                                            int i27 = c3213M34824.f10472;
                                                            try {
                                                                int i28 = c3213M34824.f10464;
                                                                try {
                                                                    int i29 = c3213M34824.f10470;
                                                                    i = i25;
                                                                    try {
                                                                        float f2 = c3213M34824.f10473;
                                                                        try {
                                                                            int i30 = c3213M34824.f10461;
                                                                            try {
                                                                                C24843 c24843 = c3213M34824.f10468;
                                                                                if (c24843 != null) {
                                                                                    i3 = i30;
                                                                                    try {
                                                                                        i2 = i26;
                                                                                        try {
                                                                                            i4 = i27;
                                                                                            try {
                                                                                                i5 = i28;
                                                                                                try {
                                                                                                    z6 = z6;
                                                                                                    try {
                                                                                                        strM48971 = C21528.m48971(c24843.f80339, c24843.f80341, c24843.f80337, c24843.f80336, c24843.f80338, c24843.f80340);
                                                                                                    } catch (RuntimeException unused2) {
                                                                                                        i19 = i29;
                                                                                                        f = f2;
                                                                                                        i21 = i3;
                                                                                                        i17 = i4;
                                                                                                        i18 = i5;
                                                                                                        i13 = i;
                                                                                                        i14 = i2;
                                                                                                        z4 = true;
                                                                                                        z7 = true;
                                                                                                        z10 = true;
                                                                                                    }
                                                                                                } catch (RuntimeException unused3) {
                                                                                                    z6 = z6;
                                                                                                    i19 = i29;
                                                                                                    f = f2;
                                                                                                    i21 = i3;
                                                                                                    i17 = i4;
                                                                                                    i18 = i5;
                                                                                                    i13 = i;
                                                                                                    i14 = i2;
                                                                                                    z4 = true;
                                                                                                    z7 = true;
                                                                                                    z10 = true;
                                                                                                    z6 = z6;
                                                                                                    i11 = i23 + i22;
                                                                                                    i10++;
                                                                                                    str5 = str2;
                                                                                                    arrayList = arrayList2;
                                                                                                    str6 = str3;
                                                                                                    iM48493 = iM48493;
                                                                                                }
                                                                                            } catch (RuntimeException unused4) {
                                                                                                i5 = i28;
                                                                                                z6 = z6;
                                                                                                i19 = i29;
                                                                                                f = f2;
                                                                                                i21 = i3;
                                                                                                i17 = i4;
                                                                                                i18 = i5;
                                                                                                i13 = i;
                                                                                                i14 = i2;
                                                                                                z4 = true;
                                                                                                z7 = true;
                                                                                                z10 = true;
                                                                                                z6 = z6;
                                                                                                i11 = i23 + i22;
                                                                                                i10++;
                                                                                                str5 = str2;
                                                                                                arrayList = arrayList2;
                                                                                                str6 = str3;
                                                                                                iM48493 = iM48493;
                                                                                            }
                                                                                        } catch (RuntimeException unused5) {
                                                                                            i4 = i27;
                                                                                            i5 = i28;
                                                                                            z6 = z6;
                                                                                            i19 = i29;
                                                                                            f = f2;
                                                                                            i21 = i3;
                                                                                            i17 = i4;
                                                                                            i18 = i5;
                                                                                            i13 = i;
                                                                                            i14 = i2;
                                                                                            z4 = true;
                                                                                            z7 = true;
                                                                                            z10 = true;
                                                                                            z6 = z6;
                                                                                            i11 = i23 + i22;
                                                                                            i10++;
                                                                                            str5 = str2;
                                                                                            arrayList = arrayList2;
                                                                                            str6 = str3;
                                                                                            iM48493 = iM48493;
                                                                                        }
                                                                                    } catch (RuntimeException unused6) {
                                                                                        i2 = i26;
                                                                                        i4 = i27;
                                                                                        i5 = i28;
                                                                                        z6 = z6;
                                                                                        i19 = i29;
                                                                                        f = f2;
                                                                                        i21 = i3;
                                                                                        i17 = i4;
                                                                                        i18 = i5;
                                                                                        i13 = i;
                                                                                        i14 = i2;
                                                                                        z4 = true;
                                                                                        z7 = true;
                                                                                        z10 = true;
                                                                                        z6 = z6;
                                                                                        i11 = i23 + i22;
                                                                                        i10++;
                                                                                        str5 = str2;
                                                                                        arrayList = arrayList2;
                                                                                        str6 = str3;
                                                                                        iM48493 = iM48493;
                                                                                    }
                                                                                } else {
                                                                                    i3 = i30;
                                                                                    i2 = i26;
                                                                                    i4 = i27;
                                                                                    i5 = i28;
                                                                                    z6 = z6;
                                                                                }
                                                                                i19 = i29;
                                                                                i13 = i;
                                                                                f = f2;
                                                                                i21 = i3;
                                                                                i14 = i2;
                                                                                i17 = i4;
                                                                                i18 = i5;
                                                                                z4 = true;
                                                                                z7 = true;
                                                                            } catch (RuntimeException unused7) {
                                                                                i3 = i30;
                                                                            }
                                                                        } catch (RuntimeException unused8) {
                                                                            i19 = i29;
                                                                            f = f2;
                                                                            i14 = i26;
                                                                            i17 = i27;
                                                                            i18 = i28;
                                                                            i13 = i;
                                                                            z4 = true;
                                                                            z7 = true;
                                                                            z10 = true;
                                                                        }
                                                                    } catch (RuntimeException unused9) {
                                                                        i19 = i29;
                                                                        i13 = i;
                                                                        i14 = i26;
                                                                        i17 = i27;
                                                                        i18 = i28;
                                                                        z4 = true;
                                                                        z7 = true;
                                                                        z10 = true;
                                                                    }
                                                                } catch (RuntimeException unused10) {
                                                                    i = i25;
                                                                }
                                                            } catch (RuntimeException unused11) {
                                                                z6 = z6;
                                                                i13 = i25;
                                                                i14 = i26;
                                                                i17 = i27;
                                                            }
                                                        } catch (RuntimeException unused12) {
                                                            i = i25;
                                                            i2 = i26;
                                                            z6 = z6;
                                                        }
                                                    } catch (RuntimeException unused13) {
                                                        i = i25;
                                                    }
                                                } catch (RuntimeException unused14) {
                                                    z6 = z6;
                                                }
                                            }
                                            z6 = z6;
                                        } else if (z6) {
                                            z6 = z6;
                                            z3 = true;
                                            z6 = z6;
                                        } else {
                                            try {
                                                c6197M34831 = C14399.m34831(i23, i23 + i22, bArr);
                                                z3 = true;
                                                z6 = true;
                                            } catch (RuntimeException unused15) {
                                                z3 = true;
                                                z6 = true;
                                                z9 = true;
                                            }
                                        }
                                        i11 = i23 + i22;
                                    } catch (ArrayIndexOutOfBoundsException e) {
                                        e = e;
                                        if (z) {
                                            str4 = str2;
                                        } else {
                                            str4 = str;
                                        }
                                        throw C2970.m9688(str3.concat(str4), e);
                                    }
                                } else {
                                    str3 = str6;
                                    z11 = true;
                                }
                                i10++;
                                str5 = str2;
                                arrayList = arrayList2;
                                str6 = str3;
                                iM48493 = iM48493;
                            } catch (ArrayIndexOutOfBoundsException e2) {
                                e = e2;
                                str3 = str6;
                                if (z) {
                                    str4 = str2;
                                } else {
                                    str4 = str;
                                }
                                throw C2970.m9688(str3.concat(str4), e);
                            }
                        } catch (ArrayIndexOutOfBoundsException e3) {
                            e = e3;
                            str2 = str5;
                            str3 = str6;
                            if (z) {
                                str4 = str2;
                            } else {
                                str4 = str;
                            }
                            throw C2970.m9688(str3.concat(str4), e);
                        }
                    }
                    str2 = str5;
                    str3 = str6;
                    return new C3840(i7 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iM48493 + 1, i12, i13, i14, i15, i16, i17, i18, i19, i20, f, i21, strM48971, c6197M34831, !z && (z11 || !z3 || !z4 || !z5 || z9 || z10), z9, z10, z11);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e4) {
            e = e4;
            str = "HEVC config";
        }
    }

    public C3840(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, String str, C6197 c6197, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f13078 = list;
        this.f13090 = i;
        this.f13089 = i2;
        this.f13081 = i3;
        this.f13086 = i4;
        this.f13093 = i5;
        this.f13080 = i6;
        this.f13091 = i7;
        this.f13094 = i8;
        this.f13087 = i9;
        this.f13092 = i10;
        this.f13088 = f;
        this.f13096 = i11;
        this.f13083 = str;
        this.f13085 = c6197;
        this.f13095 = z;
        this.f13082 = z2;
        this.f13079 = z3;
        this.f13084 = z4;
    }
}
