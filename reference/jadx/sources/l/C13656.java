package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܰۜܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8IL */
/* JADX INFO: loaded from: classes3.dex */
public final class C13656 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f45026;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f45027;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final List f45028;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f45029;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f45030;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f45031;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean f45032;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C3166 f45033;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f45034;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f45035;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f45036;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f45037;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f45038;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float f45039;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f45040;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int f45041;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f45042;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f45043;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f45044;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13656 m33348(C2460 c2460) {
        return m33350(c2460, false, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13656 m33349(C2460 c2460, C3166 c3166) {
        return m33350(c2460, true, c3166);
    }

    /* JADX WARN: Code duplicated, block: B:135:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:136:0x02a7  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13656 m33350(C2460 c2460, boolean z, C3166 c3166) throws C22861 {
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
                c2460.m7535(4);
            } else {
                c2460.m7535(21);
            }
            int iM7516 = c2460.m7516() & 3;
            int iM7517 = c2460.m7516();
            ArrayList arrayList = new ArrayList();
            boolean z2 = false;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                Throwable th = null;
                int i8 = -1;
                if (i6 < iM7517) {
                    c2460.m7535(1);
                    int iM7519 = c2460.m7519();
                    int i9 = 0;
                    while (i9 < iM7519) {
                        int iM75110 = c2460.m7519();
                        if (iM75110 > c2460.m7503()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Error parsing");
                            sb.append(z ? "L-HEVC config" : "HEVC config");
                            throw C22861.m50610(sb.toString(), th);
                        }
                        if (iM75110 < 2) {
                            arrayList.add(new C4482(c2460.m7500(), iM75110, i8, z2));
                            c2460.m7535(iM75110);
                        } else {
                            arrayList.add(new C4482(c2460.m7500(), iM75110, (c2460.m7518()[c2460.m7500()] & 126) >> 1, true));
                            i7 += iM75110 + 4;
                            c2460.m7535(iM75110);
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
                    C3166 c3166M28858 = c3166;
                    str = "HEVC config";
                    String strM7350 = null;
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
                            C4482 c4482 = (C4482) arrayList.get(i10);
                            str2 = str5;
                            try {
                                boolean z12 = c4482.f15952;
                                ArrayList arrayList2 = arrayList;
                                int i22 = c4482.f15953;
                                if (z12) {
                                    str3 = str6;
                                    try {
                                        System.arraycopy(C11551.f38845, 0, bArr, i11, 4);
                                        int i23 = i11 + 4;
                                        System.arraycopy(c2460.m7518(), c4482.f15954, bArr, i23, i22);
                                        int i24 = c4482.f15955;
                                        if (i24 != 32) {
                                            if (i24 != 33) {
                                                z6 = z6;
                                                if (i24 == 34) {
                                                    z5 = true;
                                                } else if (i24 == 39 && !z8) {
                                                    try {
                                                        C23629 c23629M28854 = C11551.m28854(i23, i23 + i22, bArr);
                                                        if (c23629M28854 != null && c3166M28858 != null) {
                                                            i20 = c23629M28854.f76550 == ((C0344) c3166M28858.f11912.get(0)).f1758 ? 4 : 5;
                                                        }
                                                    } catch (RuntimeException unused) {
                                                    }
                                                    z8 = true;
                                                }
                                            } else if (z7) {
                                                z4 = true;
                                            } else {
                                                try {
                                                    C14457 c14457M28852 = C11551.m28852(bArr, i23, i23 + i22, c3166M28858);
                                                    i12 = c14457M28852.f47413 + 1;
                                                    int i25 = c14457M28852.f47408;
                                                    try {
                                                        int i26 = c14457M28852.f47419;
                                                        try {
                                                            i15 = c14457M28852.f47416 + 8;
                                                            i16 = c14457M28852.f47411 + 8;
                                                            int i27 = c14457M28852.f47409;
                                                            try {
                                                                int i28 = c14457M28852.f47414;
                                                                try {
                                                                    int i29 = c14457M28852.f47412;
                                                                    i = i25;
                                                                    try {
                                                                        float f2 = c14457M28852.f47420;
                                                                        try {
                                                                            int i30 = c14457M28852.f47410;
                                                                            try {
                                                                                C12340 c12340 = c14457M28852.f47417;
                                                                                if (c12340 != null) {
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
                                                                                                        strM7350 = C2419.m7350(c12340.f41238, c12340.f41236, c12340.f41239, c12340.f41237, c12340.f41241, c12340.f41240);
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
                                                                                                    iM7516 = iM7516;
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
                                                                                                iM7516 = iM7516;
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
                                                                                            iM7516 = iM7516;
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
                                                                                        iM7516 = iM7516;
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
                                                c3166M28858 = C11551.m28858(i23, i23 + i22, bArr);
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
                                        throw C22861.m50610(str3.concat(str4), e);
                                    }
                                } else {
                                    str3 = str6;
                                    z11 = true;
                                }
                                i10++;
                                str5 = str2;
                                arrayList = arrayList2;
                                str6 = str3;
                                iM7516 = iM7516;
                            } catch (ArrayIndexOutOfBoundsException e2) {
                                e = e2;
                                str3 = str6;
                                if (z) {
                                    str4 = str2;
                                } else {
                                    str4 = str;
                                }
                                throw C22861.m50610(str3.concat(str4), e);
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
                            throw C22861.m50610(str3.concat(str4), e);
                        }
                    }
                    str2 = str5;
                    str3 = str6;
                    return new C13656(i7 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iM7516 + 1, i12, i13, i14, i15, i16, i17, i18, i19, i20, f, i21, strM7350, c3166M28858, !z && (z11 || !z3 || !z4 || !z5 || z9 || z10), z9, z10, z11);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e4) {
            e = e4;
            str = "HEVC config";
        }
    }

    public C13656(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, String str, C3166 c3166, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f45028 = list;
        this.f45042 = i;
        this.f45038 = i2;
        this.f45036 = i3;
        this.f45026 = i4;
        this.f45037 = i5;
        this.f45029 = i6;
        this.f45030 = i7;
        this.f45027 = i8;
        this.f45043 = i9;
        this.f45041 = i10;
        this.f45039 = f;
        this.f45044 = i11;
        this.f45035 = str;
        this.f45033 = c3166;
        this.f45040 = z;
        this.f45034 = z2;
        this.f45032 = z3;
        this.f45031 = z4;
    }
}
