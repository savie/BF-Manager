package l;

import java.io.BufferedInputStream;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡֨ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44W5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0079 extends AbstractC2432 {

    /* JADX INFO: renamed from: ܿ᩹ܳ, reason: not valid java name and contains not printable characters */
    private static final short[] f984 = {9817, 7778, 7777, 7780, 7712, 7780, 7781, 7800, 7712, 7782, 7785, 7788, 7781, 7726, 7780, 7781, 7800};

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8614 f985;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f986;

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1134() {
    }

    public C0079(C8614 c8614, AbstractC22044 abstractC22044) {
        int i = -1475687145;
        int i2 = C3448.f11240;
        int i3 = C0950.f3488;
        this.f985 = c8614;
        this.f986 = abstractC22044;
        int iM2761 = (C0619.m2761("ܿۖ") + i2) * 11;
        int i4 = ((iM2761 ^ i3) * 7127) ^ 789975824;
        int i5 = -2120918739;
        while (true) {
            i = (iM2761 ^ i5) ^ (i4 & (((i ^ i3) * 9541) >> 31));
            switch (i) {
                case -1785910597:
                case -1106020285:
                    return;
                case -995362611:
                case 553911963:
                    C3492.m11488();
                    iM2761 = (i2 - C0773.m3169("ۘۛ")) * (-79);
                    i4 = ((iM2761 ^ i3) * 23169) ^ (-663780893);
                    i5 = 1832375359;
                    break;
                case 210376987:
                case 1245693028:
                    if (!C3077.f9998) {
                        iM2761 = (C0773.m3169("۬᩹") ^ i2) * 21;
                        i4 = ((iM2761 ^ i3) * (-12927)) ^ (-388615171);
                        i5 = -894916662;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۘۛ")) * (-79);
                        i4 = ((iM2761 ^ i3) * 23169) ^ (-663780893);
                        i5 = 1832375359;
                    }
                    break;
                case 608945566:
                case 1349378698:
                    if (C2288.f7433 <= 0) {
                        iM2761 = (C0773.m3169("۬᩹") ^ i2) * 21;
                        i4 = ((iM2761 ^ i3) * (-12927)) ^ (-388615171);
                        i5 = -894916662;
                    } else {
                        iM2761 = (C0619.m2761("۠ۢ") + i3) * 119;
                        i4 = ((iM2761 ^ i2) * 7853) ^ (-1814404597);
                        i5 = 261543686;
                    }
                    break;
                case 684717424:
                case 1018530444:
                    C11235.m28309();
                    throw new RuntimeException();
                case 1595079571:
                case 2074171629:
                    if (RunnableC3646.f12471) {
                        iM2761 = (i2 - C0773.m3169("ۘۛ")) * (-79);
                        i4 = ((iM2761 ^ i3) * 23169) ^ (-663780893);
                        i5 = 1832375359;
                    } else {
                        iM2761 = C0619.m2761("ۡۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 25123) ^ 953346602;
                        i5 = -1285517422;
                    }
                    break;
                default:
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0619.m2761("ۧ۟") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-12139)) ^ (-1294311740);
                        i5 = -1813497709;
                    } else {
                        iM2761 = C0619.m2761("ܽܶ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 22905) ^ (-1520379389);
                        i5 = 691538422;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo1137() {
        C3779.m12267(this, RunnableC3055.m9939(this.f985));
    }

    /* JADX WARN: Code duplicated, block: B:107:0x046b A[PHI: r7 r8 r11 r20 r21 r29 r30
      0x046b: PHI (r7v4 byte[]) = (r7v3 byte[]), (r7v3 byte[]), (r7v5 byte[]) binds: [B:106:0x0469, B:102:0x0445, B:63:0x0243] A[DONT_GENERATE, DONT_INLINE]
      0x046b: PHI (r8v4 int) = (r8v3 int), (r8v3 int), (r8v5 int) binds: [B:106:0x0469, B:102:0x0445, B:63:0x0243] A[DONT_GENERATE, DONT_INLINE]
      0x046b: PHI (r11v37 int) = (r11v26 int), (r11v27 int), (r11v38 int) binds: [B:106:0x0469, B:102:0x0445, B:63:0x0243] A[DONT_GENERATE, DONT_INLINE]
      0x046b: PHI (r20v5 short) = (r20v4 short), (r20v3 short), (r20v3 short) binds: [B:106:0x0469, B:102:0x0445, B:63:0x0243] A[DONT_GENERATE, DONT_INLINE]
      0x046b: PHI (r21v5 int) = (r21v3 int), (r21v4 int), (r21v3 int) binds: [B:106:0x0469, B:102:0x0445, B:63:0x0243] A[DONT_GENERATE, DONT_INLINE]
      0x046b: PHI (r29v36 l.᩷ۨᩴ) = (r29v24 l.᩷ۨᩴ), (r29v25 l.᩷ۨᩴ), (r29v37 l.᩷ۨᩴ) binds: [B:106:0x0469, B:102:0x0445, B:63:0x0243] A[DONT_GENERATE, DONT_INLINE]
      0x046b: PHI (r30v23 java.lang.StringBuilder) = (r30v11 java.lang.StringBuilder), (r30v12 java.lang.StringBuilder), (r30v24 java.lang.StringBuilder) binds: [B:106:0x0469, B:102:0x0445, B:63:0x0243] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x00be  */
    /* JADX WARN: Code duplicated, block: B:38:0x0153 A[PHI: r15
      0x0153: PHI (r15v5 java.lang.StringBuilder) = (r15v4 java.lang.StringBuilder), (r15v3 java.lang.StringBuilder), (r15v3 java.lang.StringBuilder) binds: [B:37:0x0151, B:164:0x0153, B:20:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo1136() throws Exception {
        int iM3169;
        int i;
        int i2;
        AbstractC22044 abstractC22044;
        int i3;
        AbstractC22044 abstractC22044M49868;
        int iM2761;
        int i4;
        int i5;
        int i6;
        int i7;
        int iM2762;
        int i8;
        int i9;
        int i10;
        int iM2763;
        int i11;
        int iM2764;
        int i12;
        int i13 = C1146.f4234;
        int i14 = C3690.f12684;
        int iM2765 = C0619.m2761("ۢ۟") ^ i14;
        int i15 = ((iM2765 ^ i13) * (-7157)) ^ (-297252334);
        byte[] bArr = null;
        Object obj = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i16 = iM2765 ^ (-111874256);
        int i17 = 0;
        int i18 = 0;
        int iM11483 = 0;
        char c = 0;
        short s = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 472805664;
        int i24 = 0;
        BufferedInputStream bufferedInputStreamM49875 = null;
        Iterator itM7968 = null;
        AbstractC22044 abstractC22045 = null;
        String strM49874 = null;
        Throwable th = null;
        StringBuilder sb = null;
        StringBuilder sb2 = null;
        String strM9937 = null;
        int i25 = 0;
        AbstractC22044 abstractC22046 = null;
        C3696 c3696M12006 = null;
        while (true) {
            AbstractC22044 abstractC22047 = abstractC22046;
            while (true) {
                i23 = i16 ^ (i15 & (((i23 ^ i13) * (-29487)) >> 31));
                switch (i23) {
                    case -2113722388:
                    case -1813987809:
                        abstractC22047 = abstractC22047;
                        i24 = i24;
                        sb = sb;
                        abstractC22045 = this.f986;
                        bufferedInputStreamM49875 = abstractC22045.m49875();
                        iM2761 = C0773.m3169("᩸ۡ") ^ i14;
                        i4 = ((iM2761 ^ i13) * (-16921)) ^ 1572037612;
                        i5 = 2021529538;
                        abstractC22047 = abstractC22047;
                        i16 = iM2761 ^ i5;
                        i15 = i4;
                        sb = sb;
                        i24 = i24;
                        break;
                    case -2017057713:
                    case 985636043:
                        i17 = 7680;
                        iM2761 = (C0619.m2761("ܳۧ") + i13) * 39;
                        i4 = ((iM2761 ^ i14) * 18013) ^ (-711569695);
                        i5 = 1900077381;
                        abstractC22047 = abstractC22047;
                        i16 = iM2761 ^ i5;
                        i15 = i4;
                        sb = sb;
                        i24 = i24;
                        break;
                    case -1964691144:
                    case -1311192752:
                        if (C1542.f5343 <= 0) {
                            iM3169 = C0773.m3169("᩺֨") ^ i14;
                            i = ((iM3169 ^ i13) * 10015) ^ 1477708261;
                            i2 = 1617566517;
                        } else {
                            iM3169 = C0773.m3169("ܽ᩺") ^ i13;
                            i = ((iM3169 ^ i14) * 25177) ^ 103176127;
                            i2 = -1710841395;
                        }
                        i16 = iM3169 ^ i2;
                        i15 = i;
                        break;
                    case -1858352217:
                    case 180832363:
                        if (C1519.f5300 < 0) {
                            abstractC22044 = abstractC22047;
                            i3 = i24;
                            int iM2766 = C0619.m2761("᩸ۚ") ^ i13;
                            i24 = i3;
                            abstractC22047 = abstractC22044;
                            i16 = iM2766 ^ 88309984;
                            i15 = ((iM2766 ^ i14) * 18925) ^ 1943801563;
                            abstractC22045 = abstractC22045;
                        } else {
                            iM3169 = C0773.m3169("ܽ᩺") ^ i13;
                            i = ((iM3169 ^ i14) * 25177) ^ 103176127;
                            i2 = -1710841395;
                            i16 = iM3169 ^ i2;
                            i15 = i;
                        }
                        break;
                    case -1771720758:
                    case 712967442:
                        C3492.m11488();
                        if (C2354.f7599 >= 0) {
                            iM3169 = C0773.m3169("᩺֨") ^ i14;
                            i = ((iM3169 ^ i13) * 10015) ^ 1477708261;
                            i2 = 1617566517;
                            i16 = iM3169 ^ i2;
                            i15 = i;
                        } else {
                            abstractC22047 = abstractC22047;
                            i24 = i24;
                            sb = sb;
                            iM2761 = C0619.m2761("ۤ᩹") ^ i14;
                            i4 = ((iM2761 ^ i13) * (-6815)) ^ (-701600775);
                            i5 = -1831746790;
                            abstractC22047 = abstractC22047;
                            i16 = iM2761 ^ i5;
                            i15 = i4;
                            sb = sb;
                            i24 = i24;
                        }
                        break;
                    case -1745274676:
                    case -1464144136:
                        C3779.m12258(sb2, strM9937);
                        abstractC22044M49868 = abstractC22045.m49868(C1080.m4058(sb2));
                        abstractC22047 = abstractC22044M49868;
                        iM3169 = (i13 - C0619.m2761("ۧۚ")) * (-55);
                        i = ((iM3169 ^ i14) * (-26537)) ^ (-2131338125);
                        i2 = -748011911;
                        i16 = iM3169 ^ i2;
                        i15 = i;
                        break;
                    case -1680557811:
                    case 1865858970:
                        C1783.m6234(sb, strM9937);
                        abstractC22044M49868 = abstractC22045.m49868(C1080.m4058(sb));
                        abstractC22047 = abstractC22044M49868;
                        iM3169 = (i13 - C0619.m2761("ۧۚ")) * (-55);
                        i = ((iM3169 ^ i14) * (-26537)) ^ (-2131338125);
                        i2 = -748011911;
                        i16 = iM3169 ^ i2;
                        i15 = i;
                        break;
                    case -1580775446:
                    case 1591511328:
                        abstractC22047 = abstractC22047;
                        i24 = i24;
                        sb = sb;
                        try {
                            C1519.m5402(bufferedInputStreamM49875);
                            iM2762 = (C0619.m2761("ۖܺ") + i13) * 15;
                            i8 = ((iM2762 ^ i14) * 31111) ^ 1904223941;
                            i9 = 85838967;
                            i11 = iM2762 ^ i9;
                            sb = sb;
                            i24 = i24;
                            abstractC22046 = abstractC22047;
                            i16 = i11;
                            i15 = i8;
                        } catch (Throwable th2) {
                            int iM2767 = C0619.m2761("ܺܳ") ^ i14;
                            i6 = ((iM2767 ^ i13) * (-8613)) ^ 313122968;
                            i7 = iM2767 ^ (-1026443445);
                            obj = th2;
                            i15 = i6;
                            sb = sb;
                            i24 = i24;
                            abstractC22046 = abstractC22047;
                            i16 = i7;
                        }
                        break;
                    case -1569871158:
                    case 1183739339:
                        abstractC22047 = abstractC22047;
                        i24 = i24;
                        sb = sb;
                        try {
                            c3696M12006 = C3696.m12006(bufferedInputStreamM49875);
                            iM2762 = C0619.m2761("᩵֡") ^ i13;
                            i8 = ((iM2762 ^ i14) * (-10379)) ^ 745798343;
                            i9 = -590012593;
                            i11 = iM2762 ^ i9;
                            sb = sb;
                            i24 = i24;
                            abstractC22046 = abstractC22047;
                            i16 = i11;
                            i15 = i8;
                        } catch (Throwable th3) {
                            int iM31610 = C0773.m3169("֫᩶") ^ i14;
                            i6 = ((iM31610 ^ i13) * (-27761)) ^ 2108080141;
                            i7 = iM31610 ^ 1613693547;
                            th = th3;
                            i15 = i6;
                            sb = sb;
                            i24 = i24;
                            abstractC22046 = abstractC22047;
                            i16 = i7;
                        }
                        break;
                    case -1455705837:
                    case 757367622:
                        abstractC22047 = abstractC22047;
                        i24 = 1;
                        i25 = i22 + 1;
                        sArr2 = f984;
                        if (RunnableC1848.m6360()) {
                            iM2763 = C0619.m2761("ۢۘ") ^ i13;
                            i8 = ((iM2763 ^ i14) * 23693) ^ (-77379960);
                            i10 = 557992339;
                        } else {
                            iM2763 = (C0619.m2761("᩷۬") ^ i13) * (-99);
                            i8 = ((iM2763 ^ i14) * (-877)) ^ (-1852261845);
                            i10 = 1025580700;
                        }
                        i11 = iM2763 ^ i10;
                        abstractC22046 = abstractC22047;
                        i16 = i11;
                        i15 = i8;
                        break;
                    case -1426899530:
                    case -734211821:
                        return;
                    case -1407028625:
                    case 560936577:
                        C3033.m9845();
                        C0773.m3161();
                        return;
                    case -1254496896:
                    case -689979557:
                        if (C3690.f12684 <= 0) {
                            iM3169 = C0773.m3169("ܽ᩺") ^ i13;
                            i = ((iM3169 ^ i14) * 25177) ^ 103176127;
                            i2 = -1710841395;
                        } else {
                            iM3169 = C0619.m2761("ᩳܺ") ^ i14;
                            i = ((iM3169 ^ i13) * (-2347)) ^ 126714625;
                            i2 = -1273672833;
                        }
                        i16 = iM3169 ^ i2;
                        i15 = i;
                        break;
                    case -1084328021:
                    case -790650149:
                        abstractC22047 = abstractC22047;
                        i24 = i24;
                        sb = sb;
                        i19 = s + 1;
                        if (C2878.f9462) {
                            iM2761 = (C0773.m3169("᩶ۡ") ^ i14) * 87;
                            i4 = ((iM2761 ^ i13) * 2261) ^ (-1687899991);
                            i5 = 781990394;
                        } else {
                            iM2761 = C0773.m3169("ܰ֫") ^ i13;
                            i4 = ((iM2761 ^ i14) * 23951) ^ (-460454347);
                            i5 = -1626842216;
                        }
                        abstractC22047 = abstractC22047;
                        i16 = iM2761 ^ i5;
                        i15 = i4;
                        sb = sb;
                        i24 = i24;
                        break;
                    case -1003367682:
                    case 1379177805:
                        throw th;
                    case -945327507:
                    case -612943510:
                        abstractC22044 = abstractC22047;
                        i3 = i24;
                        StringBuilder sb3 = sb;
                        sArr = f984;
                        c = 0;
                        if (C1146.f4234 >= 0) {
                            sb = sb3;
                            int iM2768 = C0619.m2761("᩸ۚ") ^ i13;
                            i24 = i3;
                            abstractC22047 = abstractC22044;
                            i16 = iM2768 ^ 88309984;
                            i15 = ((iM2768 ^ i14) * 18925) ^ 1943801563;
                        } else {
                            int iM2769 = C0619.m2761("ܳܶ") ^ i14;
                            abstractC22047 = abstractC22044;
                            sb = sb3;
                            i16 = iM2769 ^ (-942845342);
                            i15 = ((iM2769 ^ i13) * 8227) ^ (-297934014);
                            i24 = i3;
                        }
                        abstractC22045 = abstractC22045;
                        break;
                    case -901340072:
                    case -343327646:
                        abstractC22047 = abstractC22047;
                        i24 = i24;
                        sb = sb;
                        if (C3998.m12923(itM7968)) {
                            iM2762 = (C0619.m2761("ۨۧ") + i14) * (-77);
                            i8 = ((iM2762 ^ i13) * (-6963)) ^ (-2014842264);
                            i9 = 1383209302;
                        } else {
                            iM2762 = (C0619.m2761("ۢᩳ") + i13) * (-35);
                            i8 = ((iM2762 ^ i14) * 16433) ^ 1141159474;
                            i9 = 1974755729;
                        }
                        i11 = iM2762 ^ i9;
                        sb = sb;
                        i24 = i24;
                        abstractC22046 = abstractC22047;
                        i16 = i11;
                        i15 = i8;
                        break;
                    case -887041011:
                    case -41168441:
                        strM9937 = RunnableC3055.m9937(sArr2, 13, 4, i17);
                        i24 = i24;
                        if (i25 == i24) {
                            iM2764 = (C0619.m2761("᩺۟") ^ i13) * 69;
                            i8 = ((iM2764 ^ i14) * 6907) ^ 569351823;
                            i12 = -249939525;
                        } else {
                            iM2764 = C0619.m2761("ۜܺ") ^ i14;
                            i8 = ((iM2764 ^ i13) * (-8461)) ^ 353757176;
                            i12 = 266525948;
                        }
                        i11 = iM2764 ^ i12;
                        i24 = i24;
                        abstractC22046 = abstractC22047;
                        i16 = i11;
                        i15 = i8;
                        break;
                    case -886883072:
                    case -113314463:
                        abstractC22047 = abstractC22047;
                        i24 = i24;
                        sb = sb;
                        s = sArr[c];
                        if (C2966.f9654 >= 0) {
                            iM2761 = (C0773.m3169("᩶ۡ") ^ i14) * 87;
                            i4 = ((iM2761 ^ i13) * 2261) ^ (-1687899991);
                            i5 = 781990394;
                        } else {
                            iM2761 = C0619.m2761("ۘ᩵") ^ i13;
                            i4 = ((iM2761 ^ i14) * 13433) ^ (-145360649);
                            i5 = 1621496388;
                        }
                        abstractC22047 = abstractC22047;
                        i16 = iM2761 ^ i5;
                        i15 = i4;
                        sb = sb;
                        i24 = i24;
                        break;
                    case -776596965:
                    case 1692428075:
                        i17 = 34465;
                        iM2761 = (C0619.m2761("ܳۧ") + i13) * 39;
                        i4 = ((iM2761 ^ i14) * 18013) ^ (-711569695);
                        i5 = 1900077381;
                        abstractC22047 = abstractC22047;
                        i16 = iM2761 ^ i5;
                        i15 = i4;
                        sb = sb;
                        i24 = i24;
                        break;
                    case -685395933:
                    case 795992545:
                        abstractC22047 = abstractC22047;
                        i24 = i24;
                        sb = sb;
                        i20 = i19 * i19;
                        i21 = s * 2;
                        if (RunnableC1848.f6235) {
                            iM2761 = C0619.m2761("ۤ᩹") ^ i14;
                            i4 = ((iM2761 ^ i13) * (-6815)) ^ (-701600775);
                            i5 = -1831746790;
                        } else {
                            iM2761 = (C0773.m3169("ۚ᩸") + i14) * 11;
                            i4 = ((iM2761 ^ i13) * 28105) ^ (-1508632425);
                            i5 = -1530371578;
                        }
                        abstractC22047 = abstractC22047;
                        i16 = iM2761 ^ i5;
                        i15 = i4;
                        sb = sb;
                        i24 = i24;
                        break;
                    case -656292909:
                    case -64876270:
                        C1146.m4219(th, obj);
                        abstractC22047 = abstractC22047;
                        i24 = i24;
                        sb = sb;
                        iM2762 = (C0619.m2761("ۖܺ") + i13) * 15;
                        i8 = ((iM2762 ^ i14) * 31111) ^ 1904223941;
                        i9 = 85838967;
                        i11 = iM2762 ^ i9;
                        sb = sb;
                        i24 = i24;
                        abstractC22046 = abstractC22047;
                        i16 = i11;
                        i15 = i8;
                        break;
                    case -549507664:
                    case 1122026555:
                        abstractC22047 = abstractC22047;
                        i24 = i24;
                        sb = sb;
                        C20104 c20104 = (C20104) C0950.m3796(itM7968);
                        if (C1542.m5459() < 0) {
                            bArr = c20104.f64596;
                            i18 = c20104.f64597;
                            if (!C1343.m4943()) {
                                iM2761 = (C0773.m3169("᩶ۡ") ^ i14) * 87;
                                i4 = ((iM2761 ^ i13) * 2261) ^ (-1687899991);
                                i5 = 781990394;
                                abstractC22047 = abstractC22047;
                                i16 = iM2761 ^ i5;
                                i15 = i4;
                                sb = sb;
                                i24 = i24;
                            } else {
                                iM11483 = C3492.m11483(new C3674(bArr, i18), 32);
                                if (iM11483 + i18 <= bArr.length) {
                                    iM2762 = C0773.m3169("֫ۖ") ^ i14;
                                    i8 = ((iM2762 ^ i13) * 9789) ^ 140255440;
                                    i9 = -1748482312;
                                } else {
                                    iM2762 = C0619.m2761("ۛ᩹") ^ i13;
                                    i8 = ((iM2762 ^ i14) * 7365) ^ (-140635688);
                                    i9 = -614634560;
                                }
                                i11 = iM2762 ^ i9;
                                sb = sb;
                                i24 = i24;
                                abstractC22046 = abstractC22047;
                                i16 = i11;
                                i15 = i8;
                            }
                        }
                        iM2761 = C0619.m2761("ۤ᩹") ^ i14;
                        i4 = ((iM2761 ^ i13) * (-6815)) ^ (-701600775);
                        i5 = -1831746790;
                        abstractC22047 = abstractC22047;
                        i16 = iM2761 ^ i5;
                        i15 = i4;
                        sb = sb;
                        i24 = i24;
                        break;
                    case -474267515:
                    case 1294317191:
                        AbstractC3624.m11755();
                        if (RunnableC3646.f12471) {
                            abstractC22047 = abstractC22047;
                            iM2763 = C0619.m2761("ۢۘ") ^ i13;
                            i8 = ((iM2763 ^ i14) * 23693) ^ (-77379960);
                            i10 = 557992339;
                            i11 = iM2763 ^ i10;
                            abstractC22046 = abstractC22047;
                            i16 = i11;
                            i15 = i8;
                        }
                        iM3169 = C0619.m2761("ᩳܺ") ^ i14;
                        i = ((iM3169 ^ i13) * (-2347)) ^ 126714625;
                        i2 = -1273672833;
                        i16 = iM3169 ^ i2;
                        i15 = i;
                        break;
                    case -201531437:
                    case 280391852:
                        abstractC22047 = abstractC22047;
                        i24 = i24;
                        sb = sb;
                        if ((i21 + 1) - i20 <= 0) {
                            iM2761 = C0773.m3169("۬ܳ") ^ i14;
                            i4 = ((iM2761 ^ i13) * 1221) ^ 1722541181;
                            i5 = -1187661592;
                        } else {
                            iM2761 = C0619.m2761("ܽ᩷") ^ i13;
                            i4 = ((iM2761 ^ i14) * 1331) ^ (-1451348328);
                            i5 = -728120333;
                        }
                        abstractC22047 = abstractC22047;
                        i16 = iM2761 ^ i5;
                        i15 = i4;
                        sb = sb;
                        i24 = i24;
                        break;
                    case -74225714:
                    case 823215682:
                        sb2 = new StringBuilder();
                        C1783.m6234(sb2, strM49874);
                        C3779.m12269(sb2, i25);
                        if (C4238.f15451 >= 0) {
                            iM3169 = C0773.m3169("᩺֨") ^ i14;
                            i = ((iM3169 ^ i13) * 10015) ^ 1477708261;
                            i2 = 1617566517;
                        } else {
                            iM3169 = (C0773.m3169("᩸ۨ") + i13) * (-37);
                            i = ((iM3169 ^ i14) * 18859) ^ (-844450154);
                            i2 = -368776630;
                        }
                        i16 = iM3169 ^ i2;
                        i15 = i;
                        break;
                    case 567163306:
                    case 1587175483:
                        RunnableC1848.m6360();
                        C1343.m4943();
                        abstractC22047 = abstractC22047;
                        i24 = i24;
                        sb = sb;
                        iM2761 = C0619.m2761("ۤ᩹") ^ i14;
                        i4 = ((iM2761 ^ i13) * (-6815)) ^ (-701600775);
                        i5 = -1831746790;
                        abstractC22047 = abstractC22047;
                        i16 = iM2761 ^ i5;
                        i15 = i4;
                        sb = sb;
                        i24 = i24;
                        break;
                    case 1474850086:
                    case 1642553272:
                        sb = new StringBuilder();
                        C1783.m6234(sb, strM49874);
                        if (C2419.f7754 < 0) {
                            iM3169 = C0773.m3169("᩸ܳ") ^ i14;
                            i = ((iM3169 ^ i13) * 15271) ^ 1645677080;
                            i2 = -1524317226;
                            i16 = iM3169 ^ i2;
                            i15 = i;
                        } else {
                            abstractC22044 = abstractC22047;
                            i3 = i24;
                            int iM27610 = C0619.m2761("᩸ۚ") ^ i13;
                            i24 = i3;
                            abstractC22047 = abstractC22044;
                            i16 = iM27610 ^ 88309984;
                            i15 = ((iM27610 ^ i14) * 18925) ^ 1943801563;
                            abstractC22045 = abstractC22045;
                        }
                        break;
                    case 1797577532:
                    case 2145531880:
                        abstractC22047 = abstractC22047;
                        i24 = i24;
                        short[] sArr3 = f984;
                        sb = sb;
                        if (C13473.f42873 == 0) {
                            throw new Exception(C13473.m33137(sArr3, 1, 12, i17));
                        }
                        iM2761 = C0619.m2761("ۤ᩹") ^ i14;
                        i4 = ((iM2761 ^ i13) * (-6815)) ^ (-701600775);
                        i5 = -1831746790;
                        abstractC22047 = abstractC22047;
                        i16 = iM2761 ^ i5;
                        i15 = i4;
                        sb = sb;
                        i24 = i24;
                        break;
                    case 1823438977:
                    case 1839222208:
                        RunnableC0334.m2060(bufferedInputStreamM49875);
                        strM49874 = abstractC22045.m49874();
                        itM7968 = C2354.m7968(c3696M12006.m12013());
                        i22 = 0;
                        iM2762 = (i14 - C0773.m3169("ۧۘ")) * 3;
                        i8 = ((iM2762 ^ i13) * 13673) ^ 1884239357;
                        i9 = 1465782735;
                        i11 = iM2762 ^ i9;
                        sb = sb;
                        i24 = i24;
                        abstractC22046 = abstractC22047;
                        i16 = i11;
                        i15 = i8;
                        break;
                    default:
                        abstractC22047.m49850(bArr, i18, iM11483);
                        i22 = i25;
                        iM2762 = (i14 - C0773.m3169("ۧۘ")) * 3;
                        i8 = ((iM2762 ^ i13) * 13673) ^ 1884239357;
                        i9 = 1465782735;
                        i11 = iM2762 ^ i9;
                        sb = sb;
                        i24 = i24;
                        abstractC22046 = abstractC22047;
                        i16 = i11;
                        i15 = i8;
                        break;
                }
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo1138() {
        C0487.m2362(this);
        RunnableC0334.m2057();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1135(Exception exc) {
        C8614 c8614 = null;
        int i = -1830876940;
        int i2 = C1826.f6190;
        int i3 = C3734.f12817;
        int iM2761 = (C0619.m2761("֨ۨ") ^ i3) * 61;
        int i4 = ((iM2761 ^ i2) * 21059) ^ 1889469163;
        int i5 = 1413957508;
        while (true) {
            i = ((((i ^ i2) * 765) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2126538276:
                case -705926872:
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (C0619.m2761("ܶ᩻") ^ i2) * 75;
                        i4 = ((iM2761 ^ i3) * 24813) ^ (-2124265309);
                        i5 = -605809896;
                    } else {
                        iM2761 = (C0619.m2761("ܳ᩵") + i2) * (-33);
                        i4 = ((iM2761 ^ i3) * (-19051)) ^ 155048468;
                        i5 = 62417;
                    }
                    break;
                case -2035801751:
                case -1733363321:
                    C1783.m6232();
                    C4282.m13644();
                    break;
                case -1780004477:
                case -1676294496:
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0619.m2761("᩵۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * 18321) ^ 1673605579;
                        i5 = -498194043;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ܰܰ")) * 57;
                        i4 = ((iM2761 ^ i3) * (-30463)) ^ 1091060881;
                        i5 = -1665015544;
                    }
                    break;
                case -1581981408:
                case -367740569:
                    if (C3734.f12817 >= 0) {
                        iM2761 = C0619.m2761("᩵۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * 18321) ^ 1673605579;
                        i5 = -498194043;
                    } else {
                        iM2761 = C0773.m3169("۫᩹") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-2427)) ^ 1236118661;
                        i5 = 1247937894;
                    }
                    break;
                case -1538693901:
                case -927197151:
                    if (C2966.f9654 >= 0) {
                        iM2761 = C0773.m3169("ܶ۬") ^ i3;
                        i4 = ((iM2761 ^ i2) * 15573) ^ (-1310190615);
                        i5 = -560857869;
                    } else {
                        iM2761 = (C0773.m3169("۫ۖ") + i3) * (-69);
                        i4 = ((iM2761 ^ i2) * 20099) ^ (-1890229675);
                        i5 = 1392720688;
                    }
                    break;
                case -1322063163:
                case -960325855:
                    RunnableC3055.m9930(AbstractC0641.m2816(c8614), exc, null);
                    break;
                case -1113731602:
                case 1421227566:
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0773.m3169("ܶ۬") ^ i3;
                        i4 = ((iM2761 ^ i2) * 15573) ^ (-1310190615);
                        i5 = -560857869;
                    } else {
                        iM2761 = C0619.m2761("᩵۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * 18321) ^ 1673605579;
                        i5 = -498194043;
                    }
                    break;
                case -1073054827:
                case 2003272250:
                    C2288.m7767();
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (C0619.m2761("ܶ᩻") ^ i2) * 75;
                        i4 = ((iM2761 ^ i3) * 24813) ^ (-2124265309);
                        i5 = -605809896;
                    } else {
                        iM2761 = C0619.m2761("᩵۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * 18321) ^ 1673605579;
                        i5 = -498194043;
                    }
                    break;
                case -876748012:
                case -27995514:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0619.m2761("᩵۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * 18321) ^ 1673605579;
                        i5 = -498194043;
                    } else {
                        iM2761 = C0619.m2761("ᩳۗ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-22645)) ^ 510544568;
                        i5 = -1286224651;
                    }
                    break;
                case -794061615:
                case 1824146604:
                    if (C0487.f2131 <= 0) {
                        iM2761 = C0619.m2761("ܽ۬") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-29981)) ^ 2026713090;
                        i5 = -1125648568;
                    } else {
                        iM2761 = C0619.m2761("֡ܰ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-12065)) ^ (-821045556);
                        i5 = 151371190;
                    }
                    break;
                case -676082218:
                case 1547981296:
                    c8614 = this.f985;
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0619.m2761("ܽ۬") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-29981)) ^ 2026713090;
                        i5 = -1125648568;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۙۙ")) * (-61);
                        i4 = ((iM2761 ^ i2) * 1439) ^ (-1978038800);
                        i5 = -1108319318;
                    }
                    break;
                case -50301693:
                case 1910220784:
                    if (C1542.f5343 <= 0) {
                        iM2761 = (C0619.m2761("ܶ᩻") ^ i2) * 75;
                        i4 = ((iM2761 ^ i3) * 24813) ^ (-2124265309);
                        i5 = -605809896;
                    } else {
                        iM2761 = C0619.m2761("ܶۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-27225)) ^ 1077922090;
                        i5 = 569812081;
                    }
                    break;
                case 780650095:
                case 1189959322:
                    if (C2419.f7754 >= 0) {
                        iM2761 = C0619.m2761("᩵۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * 18321) ^ 1673605579;
                        i5 = -498194043;
                    } else {
                        iM2761 = (i3 - C0773.m3169("۠ۘ")) * 73;
                        i4 = ((iM2761 ^ i2) * 5565) ^ 1890141509;
                        i5 = 2089569290;
                    }
                    break;
                case 958742429:
                case 1266799676:
                    C2287.m7745();
                    C17202.m40372();
                    iM2761 = C0619.m2761("᩵۠") ^ i2;
                    i4 = ((iM2761 ^ i3) * 18321) ^ 1673605579;
                    i5 = -498194043;
                    break;
                case 1158902247:
                case 1638182500:
                    if (C2310.f7472 >= 0) {
                        iM2761 = C0619.m2761("᩵۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * 18321) ^ 1673605579;
                        i5 = -498194043;
                    } else {
                        iM2761 = C0619.m2761("ۢ۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * 4961) ^ (-1280394830);
                        i5 = 827946612;
                    }
                    break;
                default:
                    C3492.m11488();
                    if (C3033.f9831 < 0) {
                        iM2761 = (C0619.m2761("ܶ᩻") ^ i2) * 75;
                        i4 = ((iM2761 ^ i3) * 24813) ^ (-2124265309);
                        i5 = -605809896;
                    } else {
                        iM2761 = C0773.m3169("ۛۚ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 19171) ^ (-567212724);
                        i5 = -495478820;
                    }
                    break;
            }
            return;
        }
    }
}
