package l;

import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import java.io.OutputStream;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۖۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: V6B4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2486 extends AbstractC2432 {

    /* JADX INFO: renamed from: ᩵ܶ֫, reason: not valid java name and contains not printable characters */
    private static final short[] f7951 = {5161, -9175, 15965, -14010, 9277, 8354, -3661, -7607};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22667 f7952;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f7953;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f7954;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f7955;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10745 f7956;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20065 f7957;

    /* JADX WARN: Code duplicated, block: B:39:0x0108  */
    /* JADX WARN: Code duplicated, block: B:58:0x01eb A[PHI: r4 r5 r11
      0x01eb: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:57:0x01e9, B:26:0x00a7, B:9:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x01eb: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:57:0x01e9, B:26:0x00a7, B:9:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x01eb: PHI (r11v4 short) = (r11v3 short), (r11v2 short), (r11v2 short) binds: [B:57:0x01e9, B:26:0x00a7, B:9:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x025f A[PHI: r7 r8 r9 r13
      0x025f: PHI (r7v3 char) = (r7v2 char), (r7v2 char), (r7v2 char), (r7v2 char), (r7v5 char) binds: [B:65:0x0245, B:34:0x00e5, B:16:0x0080, B:12:0x0060, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r8v4 short) = (r8v3 short), (r8v2 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:65:0x0245, B:34:0x00e5, B:16:0x0080, B:12:0x0060, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:65:0x0245, B:34:0x00e5, B:16:0x0080, B:12:0x0060, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:65:0x0245, B:34:0x00e5, B:16:0x0080, B:12:0x0060, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0293 A[PHI: r3 r10 r14 r15 r20
      0x0293: PHI (r3v4 l.۠ۨܳ) = (r3v2 l.۠ۨܳ), (r3v2 l.۠ۨܳ), (r3v3 l.۠ۨܳ), (r3v2 l.۠ۨܳ) binds: [B:71:0x0291, B:61:0x0222, B:42:0x013e, B:30:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:71:0x0291, B:61:0x0222, B:42:0x013e, B:30:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r14v3 int) = (r14v2 int), (r14v2 int), (r14v2 int), (r14v4 int) binds: [B:71:0x0291, B:61:0x0222, B:42:0x013e, B:30:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r15v3 int) = (r15v2 int), (r15v2 int), (r15v2 int), (r15v4 int) binds: [B:71:0x0291, B:61:0x0222, B:42:0x013e, B:30:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:71:0x0291, B:61:0x0222, B:42:0x013e, B:30:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        int iM3169;
        int i;
        int i2;
        int i3 = AbstractC0641.f2496;
        int i4 = C0487.f2131;
        int iM31610 = (i4 - C0773.m3169("۟ᩳ")) * (-73);
        int i5 = ((iM31610 ^ i3) * 19105) ^ (-1280601708);
        C8614 c8614M46155 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM31610 ^ (-3473663);
        AbstractC22044 abstractC22044 = null;
        int iM31611 = 0;
        int i7 = 0;
        char c = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 549858973;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * (-22573)) >> 31));
            switch (i13) {
                case -1923493524:
                case -731446502:
                    boolean zM5404 = C1519.m5404(this.f7956);
                    abstractC22044 = this.f7954;
                    if (zM5404) {
                        iM3169 = C0773.m3169("۟֡") ^ i3;
                        i = ((iM3169 ^ i4) * (-5961)) ^ (-1131131513);
                        i2 = 1264500564;
                    } else {
                        iM3169 = C0773.m3169("֨᩷") ^ i4;
                        i = ((iM3169 ^ i3) * 1839) ^ (-385133223);
                        i2 = 166483627;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1706527762:
                case 513661052:
                    c8614M46155 = this.f7957.m46155();
                    if (C2878.f9462) {
                        iM3169 = C0773.m3169("ۤܿ") ^ i3;
                        i = ((iM3169 ^ i4) * (-3147)) ^ 217947054;
                        i2 = -2126616010;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ᩳᩴ")) * 41;
                        i = ((iM3169 ^ i4) * (-5507)) ^ (-187832429);
                        i2 = -2082094432;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1629135820:
                case 549440168:
                    C23916.m53419();
                    C13473.m33144();
                    break;
                case -1501234801:
                case 1353705075:
                    C17202.m40371(iM31611 ^ i7);
                    break;
                case -1470094130:
                case -649378192:
                    iM31611 = C0773.m3169(C3998.m12925(sArr2, i11, i12, i10));
                    i7 = 2101744520;
                    if (C2878.f9462) {
                        iM3169 = (C0619.m2761("۟۟") ^ i4) * q.h;
                        i = ((iM3169 ^ i3) * 24513) ^ 1403829094;
                        i2 = -1596095219;
                    } else {
                        iM3169 = C0619.m2761("᩷ۘ") ^ i3;
                        i = ((iM3169 ^ i4) * 10445) ^ (-1915500013);
                        i2 = -629585728;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1354891971:
                case 859138087:
                    sArr = f7951;
                    if (C1783.f6087 <= 0) {
                        iM3169 = C0773.m3169("ۤܿ") ^ i3;
                        i = ((iM3169 ^ i4) * (-3147)) ^ 217947054;
                        i2 = -2126616010;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ܳܺ")) * q.h;
                        i = ((iM3169 ^ i4) * 5519) ^ 1944630695;
                        i2 = -878612704;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1238069340:
                case 1035943050:
                    s = sArr[c];
                    i8 = s * s;
                    if (C0487.m2356() >= 0) {
                        iM3169 = (C0773.m3169("۠ᩳ") ^ i3) * 81;
                        i = ((iM3169 ^ i4) * (-29921)) ^ (-4487655);
                        i2 = -934799636;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ܶۡ")) * (-79);
                        i = ((iM3169 ^ i4) * 8153) ^ 1845775780;
                        i2 = -691981451;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1211206633:
                case -1203194727:
                    Main.m98(c8614M46155, abstractC22044);
                    if (C3998.f13671 != 0) {
                        iM3169 = (C0619.m2761("۟ܰ") + i4) * (-125);
                        i = ((iM3169 ^ i3) * (-18795)) ^ (-669413695);
                        i2 = -1376055309;
                    } else {
                        iM3169 = C0619.m2761("ܺ֫") ^ i3;
                        i = ((iM3169 ^ i4) * (-31883)) ^ 923939423;
                        i2 = 1614531646;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1047793660:
                case 845453051:
                    C3734.m12147(abstractC22044);
                    break;
                case -854543070:
                case 1403958572:
                    if (i9 - (s * s2) >= 0) {
                        iM3169 = C0619.m2761("ܶ᩸") ^ i4;
                        i = ((iM3169 ^ i3) * (-32713)) ^ (-1022502036);
                        i2 = 1276728918;
                    } else {
                        iM3169 = (C0619.m2761("ۤ۬") + i3) * 81;
                        i = ((iM3169 ^ i4) * (-3327)) ^ 2034077511;
                        i2 = 199805526;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -836767426:
                case 1258436341:
                    i11 = 1;
                    i12 = 3;
                    if (C2966.m9664()) {
                        iM3169 = C0619.m2761("᩶᩹") ^ i4;
                        i = ((iM3169 ^ i3) * 15091) ^ (-296622507);
                        i2 = -835104853;
                    } else {
                        iM3169 = C0773.m3169("ۤܿ") ^ i3;
                        i = ((iM3169 ^ i4) * (-3147)) ^ 217947054;
                        i2 = -2126616010;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -760995819:
                case -553702119:
                    if (C3998.f13671 == 0) {
                        iM3169 = (C0773.m3169("۠ᩳ") ^ i3) * 81;
                        i = ((iM3169 ^ i4) * (-29921)) ^ (-4487655);
                        i2 = -934799636;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۗۧ")) * 59;
                        i = ((iM3169 ^ i3) * 31301) ^ (-1781276521);
                        i2 = 1500810401;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -633432055:
                case -432868660:
                    i10 = 17534;
                    iM3169 = (C0773.m3169("ܶܶ") ^ i4) * (-29);
                    i = ((iM3169 ^ i3) * (-11851)) ^ 2038475060;
                    i2 = -713458716;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -434294147:
                case 1360444811:
                    s2 = 29678;
                    if (C0487.f2131 <= 0) {
                        iM3169 = (C0619.m2761("۟۟") ^ i4) * q.h;
                        i = ((iM3169 ^ i3) * 24513) ^ 1403829094;
                        i2 = -1596095219;
                    } else {
                        iM3169 = (C0773.m3169("᩷ܰ") + i3) * (-53);
                        i = ((iM3169 ^ i4) * (-4183)) ^ 1571235271;
                        i2 = 313666325;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -353452931:
                case 16339893:
                    sArr2 = f7951;
                    if (RunnableC1848.f6235) {
                        iM3169 = (C0773.m3169("۠ᩳ") ^ i3) * 81;
                        i = ((iM3169 ^ i4) * (-29921)) ^ (-4487655);
                        i2 = -934799636;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۗۚ")) * (-43);
                        i = ((iM3169 ^ i3) * (-10165)) ^ (-2004498158);
                        i2 = 1528817132;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -23271902:
                case 1659321969:
                    i9 = i8 + 220195921;
                    if (C1321.f4751 >= 0) {
                        iM3169 = C0773.m3169("ۤܿ") ^ i3;
                        i = ((iM3169 ^ i4) * (-3147)) ^ 217947054;
                        i2 = -2126616010;
                    } else {
                        iM3169 = (C0619.m2761("ۧ۟") ^ i4) * (-87);
                        i = ((iM3169 ^ i3) * (-21125)) ^ (-1973042704);
                        i2 = -294050883;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 199959327:
                case 659763988:
                    C2878.m9491();
                    if (RunnableC3646.f12471) {
                        iM3169 = (C0619.m2761("۟۟") ^ i4) * q.h;
                        i = ((iM3169 ^ i3) * 24513) ^ 1403829094;
                        i2 = -1596095219;
                    } else {
                        iM3169 = (C0619.m2761("۟ܰ") + i4) * (-125);
                        i = ((iM3169 ^ i3) * (-18795)) ^ (-669413695);
                        i2 = -1376055309;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 633581149:
                case 2012516403:
                    C1321.m4852();
                    iM3169 = (C0619.m2761("۟ܰ") + i4) * (-125);
                    i = ((iM3169 ^ i3) * (-18795)) ^ (-669413695);
                    i2 = -1376055309;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1067213209:
                case 1382962044:
                    if (C1321.m4852()) {
                        iM3169 = (C0619.m2761("۟ܰ") + i4) * (-125);
                        i = ((iM3169 ^ i3) * (-18795)) ^ (-669413695);
                        i2 = -1376055309;
                    } else {
                        iM3169 = (C0773.m3169("۠ᩳ") ^ i3) * 81;
                        i = ((iM3169 ^ i4) * (-29921)) ^ (-4487655);
                        i2 = -934799636;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1370880504:
                case 1533602636:
                    i10 = 18155;
                    iM3169 = (C0773.m3169("ܶܶ") ^ i4) * (-29);
                    i = ((iM3169 ^ i3) * (-11851)) ^ 2038475060;
                    i2 = -713458716;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    c = 0;
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0773.m3169("۠ᩳ") ^ i3) * 81;
                        i = ((iM3169 ^ i4) * (-29921)) ^ (-4487655);
                        i2 = -934799636;
                    } else {
                        iM3169 = (C0773.m3169("ܽۛ") ^ i4) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM3169 ^ i3) * (-4095)) ^ 175855490;
                        i2 = -1957622316;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x019e A[PHI: r1 r2
      0x019e: PHI (r1v4 l.᩷ۨᩴ) = (r1v3 l.᩷ۨᩴ), (r1v2 l.᩷ۨᩴ) binds: [B:51:0x0185, B:46:0x0161] A[DONT_GENERATE, DONT_INLINE]
      0x019e: PHI (r2v5 l.᩸۠֫) = (r2v4 l.᩸۠֫), (r2v2 l.᩸۠֫) binds: [B:51:0x0185, B:46:0x0161] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws Throwable {
        int iM3169;
        int i;
        AbstractC22044 abstractC22044 = null;
        C22667 c22667 = null;
        OutputStream outputStreamMo4289 = null;
        Throwable th = null;
        Object th2 = null;
        int i2 = 968144552;
        int i3 = C3033.f9831;
        int i4 = C0950.f3488;
        int iM2761 = C0619.m2761("ܺ᩶") ^ i3;
        int i5 = ((iM2761 ^ i4) * (-8985)) ^ (-1200241799);
        int i6 = -632842208;
        while (true) {
            int i7 = iM2761 ^ i6;
            C9197 c9197 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * 32383) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2072513812:
                    case 1944950889:
                        if (C0487.f2131 > 0) {
                            iM2761 = C0773.m3169("֡ۙ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 26919) ^ (-241891607);
                            i6 = -1042951445;
                        }
                        iM3169 = (C0773.m3169("֡֡") + i3) * 7;
                        i5 = ((iM3169 ^ i4) * (-23119)) ^ (-1845411281);
                        i = 1116222076;
                        i7 = iM3169 ^ i;
                        break;
                    case -1939289634:
                    case 1086578465:
                        C3690.m11987();
                        if (C0862.f3233 != 0) {
                            iM2761 = C0773.m3169("ܺ۟") ^ i4;
                            i5 = ((iM2761 ^ i3) * 14953) ^ 796705967;
                            i6 = -127094189;
                        } else {
                            iM2761 = (C0619.m2761("֫۟") + i4) * (-45);
                            i5 = ((iM2761 ^ i3) * (-8389)) ^ 447630443;
                            i6 = 517675561;
                        }
                        break;
                    case -1901432255:
                    case 1546603095:
                        if (outputStreamMo4289 != null) {
                            iM3169 = (C0619.m2761("ۜۡ") + i4) * (-97);
                            i5 = ((iM3169 ^ i3) * (-5677)) ^ (-853496650);
                            i = 481875533;
                        } else {
                            iM3169 = (C0773.m3169("۫ܰ") + i4) * 31;
                            i5 = ((iM3169 ^ i3) * (-11365)) ^ (-1629052315);
                            i = 517787434;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1534050910:
                    case -378385205:
                        C4238.m13542(outputStreamMo4289);
                        iM3169 = (C0773.m3169("۫ܰ") + i4) * 31;
                        i5 = ((iM3169 ^ i3) * (-11365)) ^ (-1629052315);
                        i = 517787434;
                        i7 = iM3169 ^ i;
                        break;
                    case -1452800486:
                    case 2009838892:
                        try {
                            C21298.m48534(c22667.m51131(), outputStreamMo4289, c22667.length(), c9197);
                            iM3169 = (C0619.m2761("ۨۖ") + i3) * 7;
                            i5 = ((iM3169 ^ i4) * 23015) ^ (-895345270);
                            i = -752595329;
                        } catch (Throwable th3) {
                            th = th3;
                            iM3169 = (C0773.m3169("ۧۧ") + i3) * 79;
                            i5 = ((iM3169 ^ i4) * 4499) ^ (-669317590);
                            i = -501658582;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1446592025:
                    case -952948:
                        this.f7953.m49847(abstractC22044, (C24523) null, c9197);
                        return;
                    case -1286378790:
                    case -1130226171:
                        abstractC22044 = this.f7954;
                        abstractC22044.mo49834();
                        c22667 = this.f7952;
                        if (c22667 != null) {
                            iM3169 = (i3 - C0619.m2761("ܰۡ")) * 79;
                            i5 = ((iM3169 ^ i4) * (-23603)) ^ (-1033815609);
                            i = -632399718;
                        } else {
                            iM3169 = C0773.m3169("ۙ᩸") ^ i4;
                            i5 = ((iM3169 ^ i3) * (-27795)) ^ 2035099182;
                            i = 1055766900;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1234918630:
                    case 1415728879:
                        C2310.m7813();
                        if (C1783.f6087 > 0) {
                            iM2761 = (C0619.m2761("֫۟") + i4) * (-45);
                            i5 = ((iM2761 ^ i3) * (-8389)) ^ 447630443;
                            i6 = 517675561;
                        }
                        iM3169 = (C0773.m3169("֡֡") + i3) * 7;
                        i5 = ((iM3169 ^ i4) * (-23119)) ^ (-1845411281);
                        i = 1116222076;
                        i7 = iM3169 ^ i;
                        break;
                    case -1215440808:
                    case -416651588:
                        if (outputStreamMo4289 != null) {
                            iM3169 = C0773.m3169("ۨۚ") ^ i4;
                            i5 = ((iM3169 ^ i3) * (-6343)) ^ 871498058;
                            i = -572878446;
                        } else {
                            iM3169 = (C0773.m3169("ᩳ֫") ^ i3) * (-125);
                            i5 = ((iM3169 ^ i4) * (-31965)) ^ 151911584;
                            i = -1678894764;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1127613230:
                    case 1257364300:
                        try {
                            C4238.m13542(outputStreamMo4289);
                            iM3169 = (C0773.m3169("ᩳ֫") ^ i3) * (-125);
                            i5 = ((iM3169 ^ i4) * (-31965)) ^ 151911584;
                            i = -1678894764;
                        } catch (Throwable th4) {
                            th2 = th4;
                            iM3169 = (i3 - C0773.m3169("᩻ۡ")) * (-35);
                            i5 = ((iM3169 ^ i4) * (-18031)) ^ (-47081710);
                            i = 980279767;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -970372464:
                    case 417895936:
                        outputStreamMo4289 = abstractC22044.mo4289(false);
                        iM3169 = (C0619.m2761("ܺ۫") + i4) * 57;
                        i5 = ((iM3169 ^ i3) * 19627) ^ (-1135426621);
                        i = -550736295;
                        i7 = iM3169 ^ i;
                        break;
                    case -847129350:
                    case 776200543:
                        C0619.m2763();
                        C2375.m8065();
                        iM2761 = C0773.m3169("֡ۙ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 26919) ^ (-241891607);
                        i6 = -1042951445;
                        break;
                    case -771456999:
                    case 899367414:
                        if (C1826.m6301() < 0) {
                            if (C2375.f7641 <= 0) {
                                iM2761 = C0773.m3169("֡ۙ") ^ i4;
                                i5 = ((iM2761 ^ i3) * 26919) ^ (-241891607);
                                i6 = -1042951445;
                            } else {
                                if (C0950.f3488 < 0 && C0862.m3503()) {
                                    if (C3099.f10023 > 0) {
                                        if (C3033.f9831 < 0) {
                                            if (AbstractC0116.f1064 > 0) {
                                                if (C13473.m33144()) {
                                                    if (C0773.f2792 > 0) {
                                                        c9197 = new C9197(this);
                                                        if (AbstractC0641.f2496 < 0) {
                                                            iM3169 = (C0773.m3169("ۛۢ") ^ i3) * (-107);
                                                            i5 = ((iM3169 ^ i4) * 8559) ^ (-2003563540);
                                                            i = 33954900;
                                                            i7 = iM3169 ^ i;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        iM2761 = (C0619.m2761("֫۟") + i4) * (-45);
                                        i5 = ((iM2761 ^ i3) * (-8389)) ^ 447630443;
                                        i6 = 517675561;
                                    }
                                    iM2761 = (C0773.m3169("ۖ۟") + i3) * 33;
                                    i5 = ((iM2761 ^ i4) * 24091) ^ (-760817904);
                                    i6 = 1561882569;
                                }
                                iM2761 = C0773.m3169("ۢ᩺") ^ i3;
                                i5 = ((iM2761 ^ i4) * (-1055)) ^ 391614263;
                                i6 = -79475162;
                            }
                            break;
                        }
                        iM2761 = C0773.m3169("ܺ۟") ^ i4;
                        i5 = ((iM2761 ^ i3) * 14953) ^ 796705967;
                        i6 = -127094189;
                        break;
                    case -555333811:
                    case 1269969013:
                        if (c22667.m51131() != null) {
                            iM3169 = C0773.m3169("ܳ᩹") ^ i4;
                            i5 = ((iM3169 ^ i3) * 18067) ^ (-904877328);
                            i = 1359095066;
                        } else {
                            iM3169 = C0773.m3169("ۙ᩸") ^ i4;
                            i5 = ((iM3169 ^ i3) * (-27795)) ^ 2035099182;
                            i = 1055766900;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -428955730:
                    case 1866973850:
                        if (!RunnableC3646.f12471) {
                            iM2761 = (C0619.m2761("֫۟") + i4) * (-45);
                            i5 = ((iM2761 ^ i3) * (-8389)) ^ 447630443;
                            i6 = 517675561;
                        } else {
                            iM2761 = (C0773.m3169("ۖ۟") + i3) * 33;
                            i5 = ((iM2761 ^ i4) * 24091) ^ (-760817904);
                            i6 = 1561882569;
                        }
                        break;
                    case 255175171:
                    case 320130153:
                        RunnableC3646.m11799(th, th2);
                        iM3169 = (C0773.m3169("ᩳ֫") ^ i3) * (-125);
                        i5 = ((iM3169 ^ i4) * (-31965)) ^ 151911584;
                        i = -1678894764;
                        i7 = iM3169 ^ i;
                        break;
                    case 345997908:
                    case 2137693181:
                        C11235.m28309();
                        if (C2354.m7983()) {
                            iM3169 = (C0773.m3169("ۖ֨") ^ i3) * 67;
                            i5 = ((iM3169 ^ i4) * 20441) ^ (-405236965);
                            i = -2045336695;
                        } else {
                            iM3169 = (C0773.m3169("֡֡") + i3) * 7;
                            i5 = ((iM3169 ^ i4) * (-23119)) ^ (-1845411281);
                            i = 1116222076;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case 462936228:
                    case 1459548575:
                        C2354.m7983();
                        return;
                    case 1556496396:
                    case 2080255170:
                        throw th;
                    default:
                        return;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0137 A[PHI: r2 r3
      0x0137: PHI (r2v4 l.ۤ۠ᩴ) = (r2v3 l.ۤ۠ᩴ), (r2v2 l.ۤ۠ᩴ), (r2v2 l.ۤ۠ᩴ), (r2v2 l.ۤ۠ᩴ) binds: [B:40:0x0135, B:24:0x00a9, B:13:0x0069, B:10:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0137: PHI (r3v4 l.᩷ۨᩴ) = (r3v2 l.᩷ۨᩴ), (r3v3 l.᩷ۨᩴ), (r3v2 l.᩷ۨᩴ), (r3v2 l.᩷ۨᩴ) binds: [B:40:0x0135, B:24:0x00a9, B:13:0x0069, B:10:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01c4 A[PHI: r5 r10 r11 r12
      0x01c4: PHI (r5v3 int) = (r5v2 int), (r5v4 int) binds: [B:51:0x01c2, B:28:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x01c4: PHI (r10v4 int) = (r10v3 int), (r10v2 int) binds: [B:51:0x01c2, B:28:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x01c4: PHI (r11v4 int) = (r11v3 int), (r11v2 int) binds: [B:51:0x01c2, B:28:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x01c4: PHI (r12v4 int) = (r12v3 int), (r12v2 int) binds: [B:51:0x01c2, B:28:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01f6 A[PHI: r9
      0x01f6: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:55:0x01f4, B:20:0x0084, B:10:0x0061, B:7:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0229 A[PHI: r8
      0x0229: PHI (r8v4 short) = (r8v3 short), (r8v2 short) binds: [B:59:0x0227, B:7:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x025a A[PHI: r4 r7 r14 r15 r20
      0x025a: PHI (r4v5 int) = (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:63:0x0258, B:36:0x0112, B:32:0x00f1, B:13:0x0069, B:5:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r7v5 char) = (r7v3 char), (r7v2 char), (r7v2 char), (r7v2 char), (r7v2 char) binds: [B:63:0x0258, B:36:0x0112, B:32:0x00f1, B:13:0x0069, B:5:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r14v5 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:63:0x0258, B:36:0x0112, B:32:0x00f1, B:13:0x0069, B:5:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r15v5 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:63:0x0258, B:36:0x0112, B:32:0x00f1, B:13:0x0069, B:5:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r20v6 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:63:0x0258, B:36:0x0112, B:32:0x00f1, B:13:0x0069, B:5:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        int iM3169;
        int i;
        int i2;
        int i3 = RunnableC0334.f1808;
        int i4 = C3734.f12817;
        int iM2761 = (C0619.m2761("᩸ᩳ") + i4) * (-51);
        int i5 = ((iM2761 ^ i3) * (-32295)) ^ 1303813168;
        AbstractC22044 abstractC22044 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2761 ^ 953551864;
        C10745 c10745 = null;
        int iM31610 = 0;
        int i7 = 0;
        char c = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -692956092;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i3) * (-25093)) >> 31));
            switch (i14) {
                case -1856591497:
                case -172357460:
                    c10745.m27393(C3998.m12926(abstractC22044));
                    if (C0269.f1558 <= 0) {
                        iM3169 = (C0773.m3169("ᩴܳ") + i4) * (-73);
                        i = ((iM3169 ^ i3) * (-12703)) ^ 790106754;
                        i2 = 1054337209;
                    } else {
                        iM3169 = (C0773.m3169("ۨۨ") ^ i4) * 7;
                        i = ((iM3169 ^ i3) * (-23247)) ^ (-108062096);
                        i2 = 1695816252;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1592035876:
                case -1467238630:
                    if (C0862.f3233 != 0) {
                        iM3169 = (C0773.m3169("ᩴܳ") + i4) * (-73);
                        i = ((iM3169 ^ i3) * (-12703)) ^ 790106754;
                        i2 = 1054337209;
                    } else {
                        iM3169 = C0773.m3169("᩷ܳ") ^ i4;
                        i = ((iM3169 ^ i3) * 19237) ^ 1375489797;
                        i2 = 1306061137;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1520020426:
                case 829746214:
                    i12 = 32393;
                    iM3169 = (C0619.m2761("᩹ۛ") ^ i3) * 97;
                    i = ((iM3169 ^ i4) * (-7097)) ^ (-851133599);
                    i2 = 1174467317;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1459632459:
                case 445001944:
                    c10745 = new C10745(this.f7955);
                    if (C2354.f7599 >= 0) {
                        iM3169 = C0619.m2761("۠֫") ^ i3;
                        i = ((iM3169 ^ i4) * 18233) ^ 1580566912;
                        i2 = -1894308503;
                    } else {
                        iM3169 = C0619.m2761("ۛۛ") ^ i4;
                        i = ((iM3169 ^ i3) * (-25877)) ^ (-585561725);
                        i2 = 1295195786;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1175140154:
                case -546790017:
                    i8 = s + 10619;
                    if (C2419.f7754 >= 0) {
                        iM3169 = (C0773.m3169("ᩴܳ") + i4) * (-73);
                        i = ((iM3169 ^ i3) * (-12703)) ^ 790106754;
                        i2 = 1054337209;
                    } else {
                        iM3169 = C0773.m3169("ۨۜ") ^ i4;
                        i = ((iM3169 ^ i3) * (-15825)) ^ 1258786579;
                        i2 = -331766938;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1160634797:
                case 2030303620:
                    int i15 = i10 + i11;
                    if (i9 - (i15 + i15) <= 0) {
                        iM3169 = (i4 - C0773.m3169("ۢۛ")) * 61;
                        i = ((iM3169 ^ i3) * 10117) ^ 708048923;
                        i2 = 564829366;
                    } else {
                        iM3169 = C0619.m2761("ܶ᩶") ^ i3;
                        i = ((iM3169 ^ i4) * 28879) ^ 655638418;
                        i2 = 252969536;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -888705929:
                case 984286863:
                    i12 = 8073;
                    iM3169 = (C0619.m2761("᩹ۛ") ^ i3) * 97;
                    i = ((iM3169 ^ i4) * (-7097)) ^ (-851133599);
                    i2 = 1174467317;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -839388163:
                case 700781070:
                    s = sArr[c];
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0773.m3169("᩷ܳ") ^ i4;
                        i = ((iM3169 ^ i3) * 19237) ^ 1375489797;
                        i2 = 1306061137;
                    } else {
                        iM3169 = C0619.m2761("ܿۘ") ^ i4;
                        i = ((iM3169 ^ i3) * 29115) ^ (-1731994804);
                        i2 = 753197318;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -710487838:
                case 336432281:
                    C3998.m12920();
                    break;
                case -685059610:
                case 2032775467:
                    i9 = i8 * i8;
                    i10 = s * s;
                    i11 = 112763161;
                    if (C0862.f3233 != 0) {
                        iM3169 = C0619.m2761("ۡܺ") ^ i3;
                        i = ((iM3169 ^ i4) * 7837) ^ 538789365;
                        i2 = -1801169046;
                    } else {
                        iM3169 = C0773.m3169("ۛۤ") ^ i3;
                        i = ((iM3169 ^ i4) * (-17947)) ^ 821452396;
                        i2 = 1287445538;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -668791981:
                case 1827146722:
                    sArr2 = f7951;
                    i13 = 5;
                    if (C0950.m3785() != 0) {
                        iM3169 = C0773.m3169("֫ܰ") ^ i3;
                        i = ((iM3169 ^ i4) * (-30719)) ^ (-1741569304);
                        i2 = -535193400;
                    } else {
                        iM3169 = C0773.m3169("᩵ۙ") ^ i3;
                        i = ((iM3169 ^ i4) * (-8985)) ^ (-60426870);
                        i2 = 571597407;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -657777548:
                case 694949283:
                    C3492.m11488();
                    if (C0950.f3488 >= 0) {
                        iM3169 = C0619.m2761("۠֫") ^ i3;
                        i = ((iM3169 ^ i4) * 18233) ^ 1580566912;
                        i2 = -1894308503;
                    } else {
                        iM3169 = (C0773.m3169("ᩴܳ") + i4) * (-73);
                        i = ((iM3169 ^ i3) * (-12703)) ^ 790106754;
                        i2 = 1054337209;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -603088072:
                case 941186300:
                    c10745.m27397(iM31610 ^ i7);
                    abstractC22044 = this.f7953;
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0619.m2761("۠֫") ^ i3;
                        i = ((iM3169 ^ i4) * 18233) ^ 1580566912;
                        i2 = -1894308503;
                    } else {
                        iM3169 = C0773.m3169("۠ۙ") ^ i4;
                        i = ((iM3169 ^ i3) * (-6271)) ^ (-1371005484);
                        i2 = 71744567;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 52836692:
                case 1134477553:
                    if (C1321.m4852()) {
                        iM3169 = C0619.m2761("۠֫") ^ i3;
                        i = ((iM3169 ^ i4) * 18233) ^ 1580566912;
                        i2 = -1894308503;
                    } else {
                        iM3169 = C0773.m3169("֫ܰ") ^ i3;
                        i = ((iM3169 ^ i4) * (-30719)) ^ (-1741569304);
                        i2 = -535193400;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 123783175:
                case 2072909278:
                    i7 = 2120316466;
                    if (C2354.m7983()) {
                        iM3169 = (C0619.m2761("۠ۨ") ^ i3) * 101;
                        i = ((iM3169 ^ i4) * (-10205)) ^ (-1528046038);
                        i2 = 208790655;
                    } else {
                        iM3169 = C0619.m2761("ۡܺ") ^ i3;
                        i = ((iM3169 ^ i4) * 7837) ^ 538789365;
                        i2 = -1801169046;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 397223828:
                case 577411520:
                    iM31610 = C0773.m3169(C4238.m13530(sArr2, i13, 3, i12));
                    if (C1321.f4751 >= 0) {
                        iM3169 = C0773.m3169("֫ܰ") ^ i3;
                        i = ((iM3169 ^ i4) * (-30719)) ^ (-1741569304);
                        i2 = -535193400;
                    } else {
                        iM3169 = C0773.m3169("ܰ᩷") ^ i4;
                        i = ((iM3169 ^ i3) * (-10529)) ^ 1592846966;
                        i2 = -291626464;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 551457411:
                case 1986302003:
                    c10745.mo25916((Runnable) null);
                    c10745.mo25931();
                    this.f7956 = c10745;
                    break;
                case 759818207:
                case 1948786396:
                    sArr = f7951;
                    c = 4;
                    if (C3099.f10023 <= 0) {
                        iM3169 = C0773.m3169("֫ܰ") ^ i3;
                        i = ((iM3169 ^ i4) * (-30719)) ^ (-1741569304);
                        i2 = -535193400;
                    } else {
                        iM3169 = (C0773.m3169("ᩴ᩶") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM3169 ^ i4) * (-15619)) ^ (-1504508727);
                        i2 = 1394416902;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    C2834.m9344();
                    C1519.m5403();
                    iM3169 = C0773.m3169("֫ܰ") ^ i3;
                    i = ((iM3169 ^ i4) * (-30719)) ^ (-1741569304);
                    i2 = -535193400;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    public C2486(Main main, AbstractC22044 abstractC22044, AbstractC22044 abstractC22045, C22667 c22667, C20065 c20065) {
        int i = -1505494809;
        int i2 = C1519.f5300;
        int i3 = C4282.f15546;
        this.f7955 = main;
        this.f7953 = abstractC22044;
        this.f7954 = abstractC22045;
        this.f7952 = c22667;
        this.f7957 = c20065;
        int iM3169 = C0773.m3169("ۗܺ") ^ i2;
        int i4 = ((iM3169 ^ i3) * 4493) ^ 1485714119;
        int i5 = -404567099;
        while (true) {
            i = (iM3169 ^ i5) ^ (i4 & (((i ^ i3) * 20055) >> 31));
            switch (i) {
                case -1947014011:
                case 1248821578:
                    C1542.m5459();
                    iM3169 = C0619.m2761("ۖᩳ") ^ i2;
                    i4 = ((iM3169 ^ i3) * 15327) ^ 461043880;
                    i5 = -1780736514;
                    break;
                case -1187049278:
                case 438461708:
                    C1542.m5459();
                    if (C2310.f7472 < 0) {
                        iM3169 = C0619.m2761("ۖᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 15327) ^ 461043880;
                        i5 = -1780736514;
                    } else {
                        iM3169 = C0619.m2761("ۘ۠") ^ i3;
                        i4 = ((iM3169 ^ i2) * 4229) ^ 2014091365;
                        i5 = -1353611112;
                    }
                    break;
                case -803641187:
                case 1252156316:
                    C3033.m9845();
                    throw new RuntimeException();
                case -582004656:
                case 842217000:
                    if (C23916.m53419() == 0) {
                        iM3169 = C0773.m3169("᩶ܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 723) ^ (-148303527);
                        i5 = -983576908;
                    } else {
                        iM3169 = (C0619.m2761("ۛܳ") + i2) * (-87);
                        i4 = ((iM3169 ^ i3) * (-24089)) ^ (-1006189432);
                        i5 = 533586277;
                    }
                    break;
                case 24079252:
                case 343912042:
                    if (!RunnableC3646.f12471) {
                        iM3169 = C0773.m3169("᩶ܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 723) ^ (-148303527);
                        i5 = -983576908;
                    } else {
                        iM3169 = C0619.m2761("ۖᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 15327) ^ 461043880;
                        i5 = -1780736514;
                    }
                    break;
                case 375923883:
                case 949780665:
                    if (C2375.f7641 <= 0) {
                        iM3169 = C0773.m3169("۠ᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 12237) ^ (-1987498659);
                        i5 = -101973802;
                    } else {
                        iM3169 = (C0773.m3169("᩹ܿ") ^ i3) * q.h;
                        i4 = ((iM3169 ^ i2) * (-20343)) ^ (-1273707378);
                        i5 = 432023587;
                    }
                    break;
                default:
                    return;
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        Main main = null;
        Object obj = null;
        int i = 933441310;
        int i2 = RunnableC0334.f1808;
        int i3 = C3690.f12684;
        int iM2761 = C0619.m2761("᩹ۗ") ^ i3;
        int i4 = ((iM2761 ^ i2) * 23631) ^ 1010445394;
        int i5 = -389260345;
        while (true) {
            i = ((((i ^ i2) * 32557) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2105358191:
                case 1653952865:
                    C1783.m6232();
                    C0950.m3785();
                    break;
                case -2103008176:
                case -1915241436:
                    if (C3998.f13671 != 0) {
                        iM2761 = C0619.m2761("ۘۚ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 22531) ^ (-1767821395);
                        i5 = -540749694;
                    } else {
                        iM2761 = C0773.m3169("᩺᩹") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-337)) ^ (-330851476);
                        i5 = 1366970845;
                    }
                    break;
                case -1884685240:
                case 1212667103:
                    if (C1564.f5401 <= 0) {
                        iM2761 = C0619.m2761("ۘۚ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 22531) ^ (-1767821395);
                        i5 = -540749694;
                    } else {
                        iM2761 = C0619.m2761("ۖۧ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 9463) ^ (-1155448672);
                        i5 = -2109281728;
                    }
                    break;
                case -1824184015:
                case 1690755117:
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = C0773.m3169("ۤۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 18201) ^ (-121017324);
                        i5 = -1066677829;
                    } else {
                        iM2761 = (C0619.m2761("ۖܶ") ^ i3) * 63;
                        i4 = ((iM2761 ^ i2) * 16215) ^ (-562686323);
                        i5 = -1765008382;
                    }
                    break;
                case -1552968253:
                case -1128959503:
                    if (C2023.f6737) {
                        iM2761 = (i3 - C0773.m3169("᩺᩻")) * (-95);
                        i4 = ((iM2761 ^ i2) * 11261) ^ (-917885952);
                        i5 = 645394158;
                    } else {
                        iM2761 = (i2 - C0619.m2761("۟ۛ")) * (-73);
                        i4 = ((iM2761 ^ i3) * 30895) ^ 883962872;
                        i5 = -1690838942;
                    }
                    break;
                case -1538315369:
                case 628273984:
                    if (C2023.f6737) {
                        iM2761 = C0619.m2761("ۘۚ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 22531) ^ (-1767821395);
                        i5 = -540749694;
                    } else {
                        iM2761 = (C0773.m3169("᩸ۚ") ^ i2) * (-15);
                        i4 = ((iM2761 ^ i3) * (-9111)) ^ (-1983351790);
                        i5 = -1850229246;
                    }
                    break;
                case -1297118122:
                case -348198462:
                    if (C2288.f7433 <= 0) {
                        iM2761 = (i3 - C0773.m3169("᩺᩻")) * (-95);
                        i4 = ((iM2761 ^ i2) * 11261) ^ (-917885952);
                        i5 = 645394158;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ܶۢ")) * 25;
                        i4 = ((iM2761 ^ i3) * 11383) ^ (-623975667);
                        i5 = -231595516;
                    }
                    break;
                case -1213843826:
                case -667799989:
                    obj = null;
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0773.m3169("ۨܳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-17213)) ^ 626536400;
                        i5 = 932359047;
                    } else {
                        iM2761 = C0619.m2761("ۨۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 26825) ^ 1353055827;
                        i5 = -1949321585;
                    }
                    break;
                case -1103385587:
                case 1529332868:
                    AbstractC3624.m11755();
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = C0619.m2761("ۘۚ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 22531) ^ (-1767821395);
                        i5 = -540749694;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩺᩻")) * (-95);
                        i4 = ((iM2761 ^ i2) * 11261) ^ (-917885952);
                        i5 = 645394158;
                    }
                    break;
                case -1099918145:
                case 159847228:
                    RunnableC3055.m9930(main, exc, obj);
                    C17202.m40378(this.f7954);
                    break;
                case -845462609:
                case 165511935:
                    if (C2023.f6737) {
                        iM2761 = C0773.m3169("ۤۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 18201) ^ (-121017324);
                        i5 = -1066677829;
                    } else {
                        iM2761 = (C0773.m3169("۠ᩴ") + i3) * (-77);
                        i4 = ((iM2761 ^ i2) * 18357) ^ (-590950536);
                        i5 = 905967068;
                    }
                    break;
                case -700702247:
                case -79489548:
                    if (C4238.m13540() <= 0) {
                        iM2761 = C0773.m3169("ۨܳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-17213)) ^ 626536400;
                        i5 = 932359047;
                    } else {
                        iM2761 = (C0619.m2761("ᩳ᩹") ^ i3) * 59;
                        i4 = ((iM2761 ^ i2) * 16745) ^ 1288102785;
                        i5 = 66441778;
                    }
                    break;
                case -516470048:
                case 320258890:
                    if (C13473.f42873 == 0) {
                        iM2761 = C0773.m3169("ۤۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 18201) ^ (-121017324);
                        i5 = -1066677829;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩺᩻")) * (-95);
                        i4 = ((iM2761 ^ i2) * 11261) ^ (-917885952);
                        i5 = 645394158;
                    }
                    break;
                case -170595584:
                case 1195047543:
                    C4238.m13540();
                    C3033.m9845();
                    iM2761 = (i3 - C0773.m3169("᩺᩻")) * (-95);
                    i4 = ((iM2761 ^ i2) * 11261) ^ (-917885952);
                    i5 = 645394158;
                    break;
                case 157366188:
                case 2094259152:
                    if (C0269.f1558 <= 0) {
                        iM2761 = (i3 - C0773.m3169("᩺᩻")) * (-95);
                        i4 = ((iM2761 ^ i2) * 11261) ^ (-917885952);
                        i5 = 645394158;
                    } else {
                        iM2761 = C0619.m2761("ᩳܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-8763)) ^ 806226977;
                        i5 = -1954059803;
                    }
                    break;
                default:
                    main = this.f7955;
                    if (C3779.f12953 <= 0) {
                        iM2761 = C0773.m3169("ۤۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 18201) ^ (-121017324);
                        i5 = -1066677829;
                    } else {
                        iM2761 = (C0619.m2761("۠ۗ") ^ i3) * 95;
                        i4 = ((iM2761 ^ i2) * (-31073)) ^ 1746429503;
                        i5 = -339711865;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C22667 c22667 = null;
        C10745 c10745 = null;
        int i = -567669123;
        int i2 = C1783.f6087;
        int i3 = C1146.f4234;
        int iM2761 = C0619.m2761("᩶᩷") ^ i2;
        int i4 = ((iM2761 ^ i3) * 8225) ^ (-1406936986);
        int i5 = 1530617775;
        while (true) {
            i = ((((i ^ i3) * 20137) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2132330020:
                case -1579311118:
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0773.m3169("ۢ᩹") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-23097)) ^ (-1425811167);
                        i5 = -1892279491;
                    } else {
                        iM2761 = C0619.m2761("ۚܺ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 10019) ^ 1053273661;
                        i5 = 1827741734;
                    }
                    break;
                case -2001742328:
                case -989684452:
                    if (C1080.f3865 >= 0) {
                        iM2761 = (i2 - C0619.m2761("ۡ֡")) * (-103);
                        i4 = ((iM2761 ^ i3) * (-9095)) ^ 1686779846;
                        i5 = 180014301;
                    } else {
                        iM2761 = C0619.m2761("᩵۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-10511)) ^ 390901540;
                        i5 = -1031872739;
                    }
                    break;
                case -1792173465:
                case -1125429174:
                    if (C1826.f6190 <= 0) {
                        iM2761 = C0773.m3169("ۢ᩹") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-23097)) ^ (-1425811167);
                        i5 = -1892279491;
                    } else {
                        iM2761 = C0773.m3169("ۗۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-28163)) ^ (-1396394895);
                        i5 = -2000329196;
                    }
                    break;
                case -1615554286:
                case -1218847514:
                    if (C17202.f56030) {
                        iM2761 = (C0773.m3169("ۨ۠") + i3) * 69;
                        i4 = ((iM2761 ^ i2) * 20935) ^ (-1437039675);
                        i5 = 1669646387;
                    } else {
                        iM2761 = C0619.m2761("᩵۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-10511)) ^ 390901540;
                        i5 = -1031872739;
                    }
                    break;
                case -1368678613:
                case 286029976:
                    if (C0950.m3785() != 0) {
                        iM2761 = C0619.m2761("᩵۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-10511)) ^ 390901540;
                        i5 = -1031872739;
                    } else {
                        iM2761 = C0619.m2761("ۚ᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * 32657) ^ 1292934834;
                        i5 = -153102489;
                    }
                    break;
                case -1341099201:
                case 1912912404:
                    C13473.m33144();
                    RunnableC3055.m9933();
                    break;
                case -1289303430:
                case -651412684:
                    if (C1343.m4943()) {
                        iM2761 = (C0619.m2761("ۖ᩹") + i2) * (-53);
                        i4 = ((iM2761 ^ i3) * 31753) ^ 1404043110;
                        i5 = -74024525;
                    } else {
                        iM2761 = C0619.m2761("᩵۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-10511)) ^ 390901540;
                        i5 = -1031872739;
                    }
                    break;
                case -1160569995:
                case 2040870885:
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0619.m2761("۫ᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 22031) ^ (-1470831709);
                        i5 = -572648623;
                    } else {
                        iM2761 = (C0773.m3169("۠ۖ") + i2) * (-11);
                        i4 = ((iM2761 ^ i3) * 22769) ^ (-857394768);
                        i5 = 379176424;
                    }
                    break;
                case -1130040436:
                case 646609885:
                    C2419.m8171(c22667.m51131());
                    iM2761 = C0619.m2761("ᩳۗ") ^ i2;
                    i4 = ((iM2761 ^ i3) * 7447) ^ 1982671247;
                    i5 = -1929804846;
                    break;
                case -967006433:
                case 391484921:
                    break;
                case -959524640:
                case -463313345:
                    c10745 = this.f7956;
                    if (c10745 != null) {
                        iM2761 = C0773.m3169("ܺۘ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-26059)) ^ 1970886818;
                        i5 = -396858908;
                    } else {
                        iM2761 = (i2 - C0619.m2761("۬ۜ")) * (-55);
                        i4 = ((iM2761 ^ i3) * 29927) ^ 1875420938;
                        i5 = 431577807;
                    }
                    break;
                case -936987240:
                case -210424495:
                    if (C1783.f6087 <= 0) {
                        iM2761 = C0773.m3169("ۖ᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-5497)) ^ (-958486580);
                        i5 = 231730038;
                    } else {
                        iM2761 = (C0773.m3169("ܽ֡") + i2) * (-3);
                        i4 = ((iM2761 ^ i3) * 5029) ^ 1429169330;
                        i5 = 188596208;
                    }
                    break;
                case -813751106:
                case 1207659745:
                    C3492.m11488();
                    iM2761 = C0619.m2761("᩵۠") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-10511)) ^ 390901540;
                    i5 = -1031872739;
                    break;
                case -595024508:
                case -169406267:
                    c22667 = this.f7952;
                    if (c22667 != null) {
                        iM2761 = (C0619.m2761("۬᩶") ^ i3) * 71;
                        i4 = ((iM2761 ^ i2) * 22727) ^ 1167758963;
                        i5 = 1293646004;
                    } else {
                        iM2761 = C0619.m2761("ᩳۗ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 7447) ^ 1982671247;
                        i5 = -1929804846;
                    }
                    break;
                case -340253639:
                case 805020411:
                    C0862.m3503();
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0619.m2761("۫ᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 22031) ^ (-1470831709);
                        i5 = -572648623;
                    } else {
                        iM2761 = C0773.m3169("ۖ᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-5497)) ^ (-958486580);
                        i5 = 231730038;
                    }
                    break;
                case 21382247:
                case 951902951:
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0619.m2761("᩵۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-10511)) ^ 390901540;
                        i5 = -1031872739;
                    } else {
                        iM2761 = C0619.m2761("ܶۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 16567) ^ (-1586290121);
                        i5 = -908292222;
                    }
                    break;
                case 243349162:
                case 1839709626:
                    if (C1321.f4751 < 0) {
                        iM2761 = C0773.m3169("ۖ᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-5497)) ^ (-958486580);
                        i5 = 231730038;
                    } else {
                        iM2761 = C0619.m2761("᩵۠") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-10511)) ^ 390901540;
                        i5 = -1031872739;
                    }
                    break;
                case 426265344:
                case 710782946:
                    if (C3448.m11248() != 0) {
                        iM2761 = (i2 - C0619.m2761("ۡ֡")) * (-103);
                        i4 = ((iM2761 ^ i3) * (-9095)) ^ 1686779846;
                        i5 = 180014301;
                    } else {
                        iM2761 = C0773.m3169("᩵ۗ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 20369) ^ (-49289352);
                        i5 = -336933626;
                    }
                    break;
                case 1499647008:
                case 1876604767:
                    if (RunnableC3646.f12471) {
                        iM2761 = C0773.m3169("ۖ᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-5497)) ^ (-958486580);
                        i5 = 231730038;
                    } else {
                        iM2761 = C0619.m2761("᩶ۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 1867) ^ 1608137330;
                        i5 = 119781826;
                    }
                    break;
                default:
                    c10745.m27405();
                    iM2761 = (i2 - C0619.m2761("۬ۜ")) * (-55);
                    i4 = ((iM2761 ^ i3) * 29927) ^ 1875420938;
                    i5 = 431577807;
                    break;
            }
            return;
        }
    }
}
