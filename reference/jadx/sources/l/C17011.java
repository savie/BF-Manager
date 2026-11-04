package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.Main;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܺᩳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: JAGX */
/* JADX INFO: loaded from: classes4.dex */
public final class C17011 {

    /* JADX INFO: renamed from: ܰۙۧ, reason: not valid java name and contains not printable characters */
    private static final short[] f55579 = {9361, -31964, -30282, 32238, 27901, -20471, -28603, 31019, -29853, -30016, 30174, 24793, -20236, 3415, 31094, 21657, -20396, -19967, -22901, 31012, 19927, 20507, 31434, 26966, 18389, 16693, 9929, 9931, 17139, 18499, 20992, -19093, -17126, -20780, 22081, -17693, -20012, 9946, 9533, 32372, 32357, 32368, 32364, 32375, 32354, 32365, 32360, 32353, 32367, 32353, 32353, 32372, 32325, 32372, 32367, 32343, 32365, 32355, 32326, 32360, 32363, 32359, 32367};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f55580;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C8614 f55581;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f55582;

    public C17011(AbstractC22044 abstractC22044, C8614 c8614, String str) {
        ArrayList arrayList = null;
        int i = 1157398094;
        int i2 = C0269.f1558;
        int i3 = C3492.f12043;
        int iM2761 = (i2 - C0619.m2761("֨ۖ")) * 91;
        int i4 = ((iM2761 ^ i3) * (-31561)) ^ (-46255227);
        int i5 = -422105758;
        while (true) {
            i = ((((i ^ i3) * (-6977)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2093186581:
                case -950005996:
                    if (C0269.f1558 <= 0) {
                        iM2761 = C0773.m3169("ۙܺ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-22735)) ^ 2078128767;
                        i5 = -883276703;
                    } else {
                        iM2761 = (C0619.m2761("֨ᩴ") ^ i2) * 43;
                        i4 = ((iM2761 ^ i3) * 13243) ^ 1439439688;
                        i5 = -1972937756;
                    }
                    break;
                case -2092680719:
                case -659815639:
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0773.m3169("᩹ۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-24639)) ^ (-1284848766);
                        i5 = -1158514867;
                    } else {
                        iM2761 = C0773.m3169("۟ۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-21051)) ^ (-384769766);
                        i5 = 672388310;
                    }
                    break;
                case -2088821897:
                case -1591049189:
                    this.f55582 = arrayList;
                    if (C2023.f6737) {
                        iM2761 = C0773.m3169("᩹ۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-24639)) ^ (-1284848766);
                        i5 = -1158514867;
                    } else {
                        iM2761 = (C0773.m3169("᩵֨") ^ i3) * (-39);
                        i4 = ((iM2761 ^ i2) * (-27219)) ^ (-770358153);
                        i5 = -1746150551;
                    }
                    break;
                case -1992607209:
                case 1004901320:
                    C4238.m13540();
                    C3690.m11987();
                    throw new RuntimeException();
                case -1783114535:
                case -16933050:
                    C3033.m9845();
                    AbstractC0116.m1243();
                    iM2761 = C0773.m3169("۟ۖ") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-21051)) ^ (-384769766);
                    i5 = 672388310;
                    break;
                case -1754248108:
                case 996722233:
                    if (RunnableC3646.f12471) {
                        iM2761 = C0773.m3169("᩹ۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-24639)) ^ (-1284848766);
                        i5 = -1158514867;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ᩴܿ")) * 33;
                        i4 = ((iM2761 ^ i2) * 22889) ^ (-1555693181);
                        i5 = 926149584;
                    }
                    break;
                case -1519617298:
                case 1163611364:
                    if (C3998.f13671 != 0) {
                        iM2761 = C0773.m3169("ۙܺ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-22735)) ^ 2078128767;
                        i5 = -883276703;
                    } else {
                        iM2761 = C0619.m2761("֫ܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 5543) ^ 934724382;
                        i5 = -1405536896;
                    }
                    break;
                case -1492716122:
                case -14547706:
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0773.m3169("ۙܺ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-22735)) ^ 2078128767;
                        i5 = -883276703;
                    } else {
                        iM2761 = (C0773.m3169("ۡ᩶") + i3) * (-91);
                        i4 = ((iM2761 ^ i2) * 23107) ^ (-1224994556);
                        i5 = 207835692;
                    }
                    break;
                case -1355694154:
                case 1443905293:
                    C2287.m7745();
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = (i2 - C0619.m2761("ۢۚ")) * (-55);
                        i4 = ((iM2761 ^ i3) * (-20581)) ^ (-1203530486);
                        i5 = -1721203529;
                    } else {
                        iM2761 = C0773.m3169("۟ۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-21051)) ^ (-384769766);
                        i5 = 672388310;
                    }
                    break;
                case -1122505662:
                case 721452489:
                    arrayList = new ArrayList();
                    if (C13473.f42873 != 0) {
                        iM2761 = C0773.m3169("᩹ۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-24639)) ^ (-1284848766);
                        i5 = -1158514867;
                    } else {
                        iM2761 = C0619.m2761("ۢ᩻") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-19097)) ^ (-770858762);
                        i5 = -1865747717;
                    }
                    break;
                case -931220059:
                case -345875174:
                    if (C0269.m1775() <= 0) {
                        iM2761 = (i2 - C0619.m2761("ۢۚ")) * (-55);
                        i4 = ((iM2761 ^ i3) * (-20581)) ^ (-1203530486);
                        i5 = -1721203529;
                    } else {
                        iM2761 = C0773.m3169("֫ۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6205)) ^ 1429671085;
                        i5 = -1204395299;
                    }
                    break;
                case 788620080:
                case 1097606632:
                    if (C0487.f2131 > 0) {
                        iM2761 = C0773.m3169("ۙܺ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-22735)) ^ 2078128767;
                        i5 = -883276703;
                    } else {
                        iM2761 = C0773.m3169("۟ۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-21051)) ^ (-384769766);
                        i5 = 672388310;
                    }
                    break;
                case 860610288:
                case 1368493366:
                    this.f55580 = abstractC22044;
                    if (C3734.f12817 < 0) {
                        C2834.m9339(new C5825(this, c8614, abstractC22044, str));
                        return;
                    }
                    iM2761 = C0773.m3169("ۙܺ") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-22735)) ^ 2078128767;
                    i5 = -883276703;
                    break;
                case 1942223541:
                case 2057889173:
                    if (C23916.f77426 <= 0) {
                        iM2761 = (i2 - C0619.m2761("ۢۚ")) * (-55);
                        i4 = ((iM2761 ^ i3) * (-20581)) ^ (-1203530486);
                        i5 = -1721203529;
                    } else {
                        iM2761 = C0773.m3169("ۤۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-24571)) ^ (-2045375546);
                        i5 = -2009026111;
                    }
                    break;
                default:
                    this.f55581 = c8614;
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0619.m2761("ۡܰ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-3563)) ^ (-1215944298);
                        i5 = 1172733867;
                    } else {
                        iM2761 = (C0773.m3169("ۛ۬") ^ i2) * 57;
                        i4 = ((iM2761 ^ i3) * (-9137)) ^ 813883071;
                        i5 = -684421560;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0315 A[PHI: r16 r17 r21 r22 r23
      0x0315: PHI (r16v4 int) = (r16v2 int), (r16v3 int), (r16v2 int) binds: [B:70:0x0313, B:66:0x02ee, B:9:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0315: PHI (r17v4 short) = (r17v3 short), (r17v2 short), (r17v2 short) binds: [B:70:0x0313, B:66:0x02ee, B:9:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0315: PHI (r21v29 android.content.DialogInterface$OnClickListener) = 
      (r21v5 android.content.DialogInterface$OnClickListener)
      (r21v6 android.content.DialogInterface$OnClickListener)
      (r21v30 android.content.DialogInterface$OnClickListener)
     binds: [B:70:0x0313, B:66:0x02ee, B:9:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0315: PHI (r22v5 short) = (r22v3 short), (r22v4 short), (r22v3 short) binds: [B:70:0x0313, B:66:0x02ee, B:9:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0315: PHI (r23v20 int) = (r23v3 int), (r23v4 int), (r23v21 int) binds: [B:70:0x0313, B:66:0x02ee, B:9:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x034d A[PHI: r12 r13 r21 r23
      0x034d: PHI (r12v6 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]) binds: [B:74:0x034b, B:47:0x01df, B:8:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x034d: PHI (r13v6 int) = (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:74:0x034b, B:47:0x01df, B:8:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x034d: PHI (r21v34 android.content.DialogInterface$OnClickListener) = 
      (r21v4 android.content.DialogInterface$OnClickListener)
      (r21v13 android.content.DialogInterface$OnClickListener)
      (r21v35 android.content.DialogInterface$OnClickListener)
     binds: [B:74:0x034b, B:47:0x01df, B:8:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x034d: PHI (r23v24 int) = (r23v2 int), (r23v11 int), (r23v25 int) binds: [B:74:0x034b, B:47:0x01df, B:8:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40114(final C17011 c17011, final Main main, final DialogInterfaceC8327 dialogInterfaceC8327, final C14941 c14941, final String str) {
        int iM3169;
        DialogInterface.OnClickListener onClickListener;
        int i;
        int i2;
        int iM31610;
        int i3;
        int i4;
        int iM31611;
        int i5;
        int i6 = C3779.f12953;
        int i7 = C3690.f12684;
        int iM31612 = C0773.m3169("᩺᩵") ^ i6;
        int i8 = ((iM31612 ^ i7) * 1303) ^ 729067181;
        DialogInterface.OnClickListener onClickListener2 = null;
        Object obj = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i9 = iM31612 ^ (-961162095);
        C2361 c2361M3794 = null;
        int iM31613 = 0;
        int iM31614 = 0;
        int i10 = 0;
        int iM2761 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        short s = 0;
        int i15 = 1229532148;
        short s2 = 0;
        short[] sArr3 = null;
        int i16 = 0;
        while (true) {
            i15 = i9 ^ (i8 & (((i15 ^ i7) * 9529) >> 31));
            switch (i15) {
                case -2057138298:
                case -209882895:
                    C3492.m11487(c2361M3794, iM31614, onClickListener2);
                    sArr2 = f55579;
                    i12 = 10;
                    if (AbstractC0641.f2496 >= 0) {
                        i11 = 3;
                        iM31611 = (i6 - C0619.m2761("ۧۧ")) * 93;
                        i3 = ((iM31611 ^ i7) * 9481) ^ 1369432637;
                        i5 = -1189896768;
                        i9 = iM31611 ^ i5;
                        i8 = i3;
                        iM31613 = iM31613;
                    } else {
                        int iM2762 = C0619.m2761("ᩳܿ") ^ i7;
                        i9 = iM2762 ^ 865627063;
                        i8 = ((iM2762 ^ i6) * 11729) ^ 900710032;
                        i11 = 3;
                    }
                    break;
                case -1911079148:
                case -183565939:
                    onClickListener = onClickListener2;
                    iM31613 = 2098858374 ^ C0773.m3169(RunnableC0334.m2049(sArr, i16, 3, i13));
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0773.m3169("ۘ᩻") ^ i7;
                        i = ((iM3169 ^ i6) * (-29121)) ^ (-1902227831);
                        i2 = -12039405;
                    } else {
                        iM3169 = C0773.m3169("۬֡") ^ i7;
                        i = ((iM3169 ^ i6) * 6187) ^ 673396811;
                        i2 = 258030198;
                    }
                    DialogInterface.OnClickListener onClickListener3 = onClickListener;
                    i9 = iM3169 ^ i2;
                    i8 = i;
                    onClickListener2 = onClickListener3;
                    break;
                case -1886934430:
                case -1211425670:
                    iM31614 = 2099289934 ^ C0773.m3169(C3077.m10047(sArr3, 7, 3, i13));
                    if (AbstractC3624.f12429 > 0) {
                        iM3169 = C0773.m3169("᩸ۗ") ^ i7;
                        onClickListener = onClickListener2;
                        i = ((iM3169 ^ i6) * (-13673)) ^ (-1592313032);
                        i2 = -1147996743;
                        DialogInterface.OnClickListener onClickListener4 = onClickListener;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                        onClickListener2 = onClickListener4;
                    } else {
                        iM31611 = (i6 - C0619.m2761("ۧۧ")) * 93;
                        i3 = ((iM31611 ^ i7) * 9481) ^ 1369432637;
                        i5 = -1189896768;
                        i9 = iM31611 ^ i5;
                        i8 = i3;
                        iM31613 = iM31613;
                    }
                    break;
                case -1692370109:
                case -1002313709:
                    iM31613 = iM31613;
                    onClickListener2 = onClickListener2;
                    C13473.m33136(c2361M3794, 2122803319 ^ iM2761);
                    sArr = f55579;
                    i16 = 4;
                    if (C3077.f9998) {
                        iM31610 = (C0773.m3169("ܰۚ") ^ i6) * 93;
                        i3 = ((iM31610 ^ i7) * (-10053)) ^ (-1291476323);
                        i4 = -378305247;
                    } else {
                        iM31610 = (C0773.m3169("᩶۬") + i6) * (-111);
                        i3 = ((iM31610 ^ i7) * (-29835)) ^ 1097105200;
                        i4 = -529416578;
                    }
                    int i17 = iM31610 ^ i4;
                    onClickListener2 = onClickListener2;
                    i9 = i17;
                    i8 = i3;
                    iM31613 = iM31613;
                    break;
                case -1664213216:
                case 1935107050:
                    C3033.m9848(c2361M3794, i10, obj);
                    C0938.m3745(c17011.f55581, C1321.m4860(c2361M3794), str);
                    break;
                case -1524910338:
                case 1706166157:
                    if (!RunnableC3646.f12471) {
                        iM31613 = iM31613;
                        onClickListener2 = onClickListener2;
                        iM31610 = (C0773.m3169("۠֨") + i7) * 35;
                        i3 = ((iM31610 ^ i6) * (-779)) ^ (-1962176268);
                        i4 = -2015108717;
                        int i18 = iM31610 ^ i4;
                        onClickListener2 = onClickListener2;
                        i9 = i18;
                        i8 = i3;
                        iM31613 = iM31613;
                    }
                    iM31613 = iM31613;
                    onClickListener2 = onClickListener2;
                    iM31610 = (C0773.m3169("᩶۬") + i6) * (-111);
                    i3 = ((iM31610 ^ i7) * (-29835)) ^ 1097105200;
                    i4 = -529416578;
                    int i19 = iM31610 ^ i4;
                    onClickListener2 = onClickListener2;
                    i9 = i19;
                    i8 = i3;
                    iM31613 = iM31613;
                    break;
                case -1313052382:
                case 357790087:
                    iM31613 = iM31613;
                    onClickListener2 = onClickListener2;
                    s = f55579[0];
                    if (C2485.f7950 != 0) {
                        iM31610 = (C0773.m3169("۠֨") + i7) * 35;
                        i3 = ((iM31610 ^ i6) * (-779)) ^ (-1962176268);
                        i4 = -2015108717;
                    } else {
                        iM31610 = (i6 - C0773.m3169("ۡܿ")) * 73;
                        i3 = ((iM31610 ^ i7) * (-22601)) ^ (-1119164792);
                        i4 = -1223884565;
                    }
                    int i110 = iM31610 ^ i4;
                    onClickListener2 = onClickListener2;
                    i9 = i110;
                    i8 = i3;
                    iM31613 = iM31613;
                    break;
                case -1044650800:
                case -524483054:
                    if (C2375.f7641 > 0) {
                        iM31613 = iM31613;
                        onClickListener2 = onClickListener2;
                        iM31610 = (i6 - C0619.m2761("ۧ᩺")) * 101;
                        i3 = ((iM31610 ^ i7) * 9159) ^ (-1214460552);
                        i4 = 495653331;
                        int i111 = iM31610 ^ i4;
                        onClickListener2 = onClickListener2;
                        i9 = i111;
                        i8 = i3;
                        iM31613 = iM31613;
                    }
                    iM31613 = iM31613;
                    onClickListener2 = onClickListener2;
                    iM31610 = (C0773.m3169("᩶۬") + i6) * (-111);
                    i3 = ((iM31610 ^ i7) * (-29835)) ^ 1097105200;
                    i4 = -529416578;
                    int i112 = iM31610 ^ i4;
                    onClickListener2 = onClickListener2;
                    i9 = i112;
                    i8 = i3;
                    iM31613 = iM31613;
                    break;
                case -904843093:
                case 1533140087:
                    iM31613 = iM31613;
                    onClickListener2 = onClickListener2;
                    if (c14941.m35955().isEmpty()) {
                        iM31610 = C0619.m2761("ۡᩴ") ^ i7;
                        i3 = ((iM31610 ^ i6) * (-7175)) ^ 612125592;
                        i4 = 1809468645;
                    } else {
                        iM31610 = C0619.m2761("ᩴۤ") ^ i6;
                        i3 = ((iM31610 ^ i7) * 20463) ^ (-1251806851);
                        i4 = 1551531141;
                    }
                    int i113 = iM31610 ^ i4;
                    onClickListener2 = onClickListener2;
                    i9 = i113;
                    i8 = i3;
                    iM31613 = iM31613;
                    break;
                case -581877013:
                case 915013254:
                    iM31613 = iM31613;
                    onClickListener2 = onClickListener2;
                    if (((s * s2) + 1) - i14 > 0) {
                        iM31610 = C0619.m2761("۠ܽ") ^ i6;
                        i3 = ((iM31610 ^ i7) * (-20391)) ^ 943162423;
                        i4 = 481350558;
                    } else {
                        iM31610 = C0773.m3169("ܽۛ") ^ i6;
                        i3 = ((iM31610 ^ i7) * (-12745)) ^ (-115215854);
                        i4 = 1014899291;
                    }
                    int i114 = iM31610 ^ i4;
                    onClickListener2 = onClickListener2;
                    i9 = i114;
                    i8 = i3;
                    iM31613 = iM31613;
                    break;
                case -531720198:
                case -282148196:
                    iM31613 = iM31613;
                    onClickListener2 = onClickListener2;
                    if (RunnableC0334.m2063()) {
                        iM31610 = (C0773.m3169("᩶۬") + i6) * (-111);
                        i3 = ((iM31610 ^ i7) * (-29835)) ^ 1097105200;
                        i4 = -529416578;
                    } else {
                        iM31610 = C0773.m3169("ۨۡ") ^ i7;
                        i3 = ((iM31610 ^ i6) * (-25275)) ^ 101928590;
                        i4 = -1890585413;
                    }
                    int i115 = iM31610 ^ i4;
                    onClickListener2 = onClickListener2;
                    i9 = i115;
                    i8 = i3;
                    iM31613 = iM31613;
                    break;
                case -38107885:
                case 1428808246:
                    C2375.m8064(dialogInterfaceC8327);
                    break;
                case 224924155:
                case 1384564721:
                    int iM2763 = C0619.m2761(C3734.m12149(sArr2, i12, i11, i13)) ^ 2104592791;
                    if (C3690.f12684 <= 0) {
                        i10 = iM2763;
                        obj = null;
                        iM31611 = (i6 - C0619.m2761("ۧۧ")) * 93;
                        i3 = ((iM31611 ^ i7) * 9481) ^ 1369432637;
                        i5 = -1189896768;
                        i9 = iM31611 ^ i5;
                        i8 = i3;
                        iM31613 = iM31613;
                    } else {
                        int iM31615 = (C0773.m3169("۬ܽ") + i6) * 75;
                        int i20 = ((iM31615 ^ i7) * (-13297)) ^ 1130240169;
                        i9 = iM31615 ^ (-1288896467);
                        i10 = iM2763;
                        i8 = i20;
                        obj = null;
                    }
                    break;
                case 271768521:
                case 831694627:
                    C3099.m10082(c2361M3794, iM31613);
                    onClickListener2 = new DialogInterface.OnClickListener(c17011) { // from class: l.ܳᩳۤ

                        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ C17011 f50505;

                        {
                            int i21 = 1382125353;
                            int i22 = RunnableC0334.f1808;
                            int i23 = AbstractC0641.f2496;
                            int iM2764 = C0619.m2761("᩺ܳ") ^ i23;
                            int i24 = ((iM2764 ^ i22) * 31959) ^ (-1530050388);
                            int i25 = -949006301;
                            while (true) {
                                i21 = ((((i21 ^ i22) * 18717) >> 31) & i24) ^ (iM2764 ^ i25);
                                switch (i21) {
                                    case -2126408690:
                                    case 540375951:
                                        if (C0269.f1558 <= 0) {
                                            iM2764 = C0773.m3169("ܽ۫") ^ i23;
                                            i24 = ((iM2764 ^ i22) * 8975) ^ (-62089273);
                                            i25 = 1133786094;
                                        } else {
                                            iM2764 = (C0773.m3169("ۨ֡") ^ i22) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                            i24 = ((iM2764 ^ i23) * (-21871)) ^ (-245572620);
                                            i25 = 116401913;
                                        }
                                        break;
                                    case -2124513081:
                                    case -1554699524:
                                        if (C1343.f4799 != 0) {
                                            iM2764 = (C0773.m3169("ۛ۠") ^ i23) * 81;
                                            i24 = ((iM2764 ^ i22) * (-27099)) ^ 17817096;
                                            i25 = 1097695681;
                                        } else {
                                            iM2764 = (C0619.m2761("᩶᩵") ^ i23) * 71;
                                            i24 = ((iM2764 ^ i22) * (-17607)) ^ (-1765168915);
                                            i25 = 1895614889;
                                        }
                                        break;
                                    case -1808535606:
                                    case -304494832:
                                        if (C20932.f66974 <= 0) {
                                            iM2764 = C0773.m3169("֨ۢ") ^ i22;
                                            i24 = ((iM2764 ^ i23) * 3547) ^ 1044231072;
                                            i25 = 901915779;
                                        } else {
                                            iM2764 = C0773.m3169("ܺܽ") ^ i23;
                                            i24 = ((iM2764 ^ i22) * 20965) ^ 1370973495;
                                            i25 = 194307775;
                                        }
                                        break;
                                    case -1529454904:
                                    case -837741598:
                                        C2966.m9664();
                                        throw new RuntimeException();
                                    case -1408214010:
                                    case 1553089062:
                                        C3492.m11488();
                                        if (C1542.f5343 <= 0) {
                                            iM2764 = C0773.m3169("֨ۢ") ^ i22;
                                            i24 = ((iM2764 ^ i23) * 3547) ^ 1044231072;
                                            i25 = 901915779;
                                        } else {
                                            iM2764 = C0773.m3169("᩺ܰ") ^ i23;
                                            i24 = ((iM2764 ^ i22) * 16009) ^ (-1708512375);
                                            i25 = 1153940966;
                                        }
                                        break;
                                    case -1236058412:
                                    case -1000464082:
                                        if (C2878.f9462) {
                                            iM2764 = (C0773.m3169("ۛ۠") ^ i23) * 81;
                                            i24 = ((iM2764 ^ i22) * (-27099)) ^ 17817096;
                                            i25 = 1097695681;
                                        } else {
                                            iM2764 = C0619.m2761("ۤ᩶") ^ i23;
                                            i24 = ((iM2764 ^ i22) * (-15805)) ^ 930276855;
                                            i25 = -364601004;
                                        }
                                        break;
                                    case -918470318:
                                    case -42195672:
                                        C3448.m11248();
                                        if (C1542.f5343 <= 0) {
                                            iM2764 = C0619.m2761("ۛ֫") ^ i22;
                                            i24 = ((iM2764 ^ i23) * 15221) ^ (-85983150);
                                            i25 = 117368675;
                                        } else {
                                            iM2764 = C0773.m3169("᩺ܰ") ^ i23;
                                            i24 = ((iM2764 ^ i22) * 16009) ^ (-1708512375);
                                            i25 = 1153940966;
                                        }
                                        break;
                                    case -864521473:
                                    case 1880395435:
                                        if (C2023.f6737) {
                                            iM2764 = C0773.m3169("ܽ۫") ^ i23;
                                            i24 = ((iM2764 ^ i22) * 8975) ^ (-62089273);
                                            i25 = 1133786094;
                                        } else {
                                            iM2764 = (C0619.m2761("᩷᩻") ^ i23) * 65;
                                            i24 = ((iM2764 ^ i22) * 28031) ^ (-1704390888);
                                            i25 = 1524560082;
                                        }
                                        break;
                                    case -617534913:
                                    case 859947932:
                                        C3492.m11488();
                                        C3779.m12264();
                                        iM2764 = C0773.m3169("᩺ܰ") ^ i23;
                                        i24 = ((iM2764 ^ i22) * 16009) ^ (-1708512375);
                                        i25 = 1153940966;
                                        break;
                                    case -475787567:
                                    case 1594099794:
                                        if (C2419.m8174() >= 0) {
                                            iM2764 = C0773.m3169("᩺ܰ") ^ i23;
                                            i24 = ((iM2764 ^ i22) * 16009) ^ (-1708512375);
                                            i25 = 1153940966;
                                        } else {
                                            iM2764 = (C0619.m2761("ۧۛ") ^ i22) * 109;
                                            i24 = ((iM2764 ^ i23) * (-14085)) ^ 1741127924;
                                            i25 = 1377493541;
                                        }
                                        break;
                                    case -244704270:
                                    case 1669643243:
                                        if (C3077.m10041()) {
                                            iM2764 = C0619.m2761("ۛ֫") ^ i22;
                                            i24 = ((iM2764 ^ i23) * 15221) ^ (-85983150);
                                            i25 = 117368675;
                                        } else {
                                            iM2764 = (C0773.m3169("ۘ۟") + i22) * (-35);
                                            i24 = ((iM2764 ^ i23) * (-1773)) ^ 2124078974;
                                            i25 = 848418932;
                                        }
                                        break;
                                    case 8219766:
                                    case 333754411:
                                        if (C2834.f9334 > 0) {
                                            iM2764 = C0773.m3169("ܽ۫") ^ i23;
                                            i24 = ((iM2764 ^ i22) * 8975) ^ (-62089273);
                                            i25 = 1133786094;
                                        } else {
                                            iM2764 = C0619.m2761("ۛ֫") ^ i22;
                                            i24 = ((iM2764 ^ i23) * 15221) ^ (-85983150);
                                            i25 = 117368675;
                                        }
                                        break;
                                    case 280107534:
                                    case 1620165812:
                                        return;
                                    case 370338939:
                                    case 441667652:
                                        if (C4282.m13644()) {
                                            iM2764 = (i22 - C0773.m3169("᩹᩹")) * (-19);
                                            i24 = ((iM2764 ^ i23) * (-20473)) ^ 1543074925;
                                            i25 = -1263679273;
                                        } else {
                                            iM2764 = C0619.m2761("ۛ֫") ^ i22;
                                            i24 = ((iM2764 ^ i23) * 15221) ^ (-85983150);
                                            i25 = 117368675;
                                        }
                                        break;
                                    case 770011672:
                                    case 1304034856:
                                        this.f50505 = c17011;
                                        if (C2310.f7472 >= 0) {
                                            iM2764 = C0773.m3169("֨ۢ") ^ i22;
                                            i24 = ((iM2764 ^ i23) * 3547) ^ 1044231072;
                                            i25 = 901915779;
                                        } else {
                                            iM2764 = (C0773.m3169("᩵ܶ") ^ i23) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i24 = ((iM2764 ^ i22) * 8727) ^ (-1954922051);
                                            i25 = 1813101039;
                                        }
                                        break;
                                    default:
                                        if (AbstractC0116.f1064 <= 0) {
                                            iM2764 = C0773.m3169("֨ۢ") ^ i22;
                                            i24 = ((iM2764 ^ i23) * 3547) ^ 1044231072;
                                            i25 = 901915779;
                                        } else {
                                            iM2764 = (C0619.m2761("᩻۠") ^ i22) * 67;
                                            i24 = ((iM2764 ^ i23) * 22419) ^ 1907528767;
                                            i25 = -1288520862;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i21) {
                            DialogInterfaceC8327 dialogInterfaceC8328 = null;
                            int i22 = -930228542;
                            int i23 = C3779.f12953;
                            int i24 = RunnableC0334.f1808;
                            int iM2764 = (C0619.m2761("᩸ۙ") + i24) * 19;
                            int i25 = ((iM2764 ^ i23) * (-2977)) ^ (-990202239);
                            int i26 = -366210766;
                            while (true) {
                                i22 = ((((i22 ^ i23) * 14889) >> 31) & i25) ^ (iM2764 ^ i26);
                                switch (i22) {
                                    case -2050315907:
                                    case -874712334:
                                        if (RunnableC3646.f12471) {
                                            iM2764 = (i24 - C0773.m3169("᩷֡")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i25 = ((iM2764 ^ i23) * (-13589)) ^ 1997252580;
                                            i26 = 556673535;
                                        } else {
                                            iM2764 = C0773.m3169("᩶᩺") ^ i24;
                                            i25 = ((iM2764 ^ i23) * (-19931)) ^ 670548960;
                                            i26 = -43187142;
                                        }
                                        break;
                                    case -1826578054:
                                    case -205982744:
                                        if (C3492.f12043 > 0) {
                                            iM2764 = (i24 - C0773.m3169("᩷֡")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i25 = ((iM2764 ^ i23) * (-13589)) ^ 1997252580;
                                            i26 = 556673535;
                                        } else {
                                            iM2764 = (i24 - C0619.m2761("ܺ᩺")) * (-103);
                                            i25 = ((iM2764 ^ i23) * 3653) ^ 2028631912;
                                            i26 = 1889897669;
                                        }
                                        break;
                                    case -1757570119:
                                    case 391200930:
                                        if (C3779.f12953 <= 0) {
                                            iM2764 = (i24 - C0773.m3169("᩷֡")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i25 = ((iM2764 ^ i23) * (-13589)) ^ 1997252580;
                                            i26 = 556673535;
                                        } else {
                                            iM2764 = C0619.m2761("۠ۙ") ^ i23;
                                            i25 = ((iM2764 ^ i24) * 12741) ^ 1015560229;
                                            i26 = 1015710345;
                                        }
                                        break;
                                    case -1747413077:
                                    case 356596464:
                                        C1321.m4852();
                                        if (C0862.f3233 != 0) {
                                            iM2764 = (C0773.m3169("֡ܽ") ^ i23) * (-115);
                                            i25 = ((iM2764 ^ i24) * (-11927)) ^ (-1154920986);
                                            i26 = -2035064679;
                                        } else {
                                            iM2764 = (i24 - C0619.m2761("ܺ᩺")) * (-103);
                                            i25 = ((iM2764 ^ i23) * 3653) ^ 2028631912;
                                            i26 = 1889897669;
                                        }
                                        break;
                                    case -1730137319:
                                    case 2144381456:
                                        if (C0950.m3785() != 0) {
                                            iM2764 = C0619.m2761("ᩳۙ") ^ i24;
                                            i25 = ((iM2764 ^ i23) * (-3349)) ^ (-1248152505);
                                            i26 = -1499699853;
                                        } else {
                                            iM2764 = (C0619.m2761("ܰ֫") + i24) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i25 = ((iM2764 ^ i23) * (-4199)) ^ (-1533851598);
                                            i26 = 68292922;
                                        }
                                        break;
                                    case -1594550219:
                                    case -1096412233:
                                        if (C1783.f6087 <= 0) {
                                            iM2764 = (i24 - C0773.m3169("᩷֡")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i25 = ((iM2764 ^ i23) * (-13589)) ^ 1997252580;
                                            i26 = 556673535;
                                        } else {
                                            iM2764 = C0773.m3169("۫ܶ") ^ i23;
                                            i25 = ((iM2764 ^ i24) * 23449) ^ 992204811;
                                            i26 = 1447571085;
                                        }
                                        break;
                                    case -925780943:
                                    case 1029924864:
                                        if (C3077.f9998) {
                                            iM2764 = C0619.m2761("ܰۤ") ^ i24;
                                            i25 = ((iM2764 ^ i23) * 21503) ^ (-607581647);
                                            i26 = -1961293620;
                                        } else {
                                            iM2764 = (i24 - C0773.m3169("᩷֡")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i25 = ((iM2764 ^ i23) * (-13589)) ^ 1997252580;
                                            i26 = 556673535;
                                        }
                                        break;
                                    case -687939941:
                                    case 1000432232:
                                        C1321.m4852();
                                        C0773.m3161();
                                        iM2764 = (i24 - C0619.m2761("ܺ᩺")) * (-103);
                                        i25 = ((iM2764 ^ i23) * 3653) ^ 2028631912;
                                        i26 = 1889897669;
                                        break;
                                    case 9775747:
                                    case 1542383690:
                                        C2375.m8064(dialogInterfaceC8328);
                                        if (C2310.f7472 < 0) {
                                            final C17011 c17012 = this.f50505;
                                            final C14941 c14942 = c14941;
                                            final Main main2 = main;
                                            if (C1826.f6190 > 0) {
                                                C0938.m3749(new InterfaceC18837() { // from class: l.۫ᩳۤ
                                                    @Override // l.InterfaceC18837
                                                    /* JADX INFO: renamed from: ۙ */
                                                    public final /* synthetic */ void mo1268() {
                                                    }

                                                    @Override // l.InterfaceC18837
                                                    /* JADX INFO: renamed from: ۙ */
                                                    public final void mo1269(C9651 c9651, boolean z) {
                                                        C14941 c14943 = null;
                                                        int i27 = 772908615;
                                                        int i28 = C2354.f7599;
                                                        int i29 = C2310.f7472;
                                                        int iM2765 = C0619.m2761("ۙ֫") ^ i29;
                                                        int i30 = ((iM2765 ^ i28) * 16389) ^ 842418572;
                                                        int i31 = 1325282956;
                                                        while (true) {
                                                            i27 = ((((i27 ^ i28) * 25417) >> 31) & i30) ^ (iM2765 ^ i31);
                                                            switch (i27) {
                                                                case -2066050997:
                                                                case -947356105:
                                                                    if (RunnableC3646.f12471) {
                                                                        iM2765 = C0619.m2761("۠ᩴ") ^ i29;
                                                                        i30 = ((iM2765 ^ i28) * 9369) ^ 803754140;
                                                                        i31 = -402472032;
                                                                    } else {
                                                                        iM2765 = (C0619.m2761("۬᩹") + i28) * (-7);
                                                                        i30 = ((iM2765 ^ i29) * 4337) ^ 1908902713;
                                                                        i31 = -1162515562;
                                                                    }
                                                                    break;
                                                                case -2037841674:
                                                                case -1275236742:
                                                                    C2354.m7983();
                                                                    if (C1343.f4799 == 0) {
                                                                        iM2765 = C0619.m2761("۠ᩴ") ^ i29;
                                                                        i30 = ((iM2765 ^ i28) * 9369) ^ 803754140;
                                                                        i31 = -402472032;
                                                                    } else {
                                                                        iM2765 = C0619.m2761("۬᩻") ^ i29;
                                                                        i30 = ((iM2765 ^ i28) * 15229) ^ 511686561;
                                                                        i31 = -211093372;
                                                                    }
                                                                    break;
                                                                case -1897848697:
                                                                case -1684750445:
                                                                    RunnableC3055.m9933();
                                                                    if (C3099.f10023 <= 0) {
                                                                        iM2765 = C0773.m3169("ܶܽ") ^ i28;
                                                                        i30 = ((iM2765 ^ i29) * (-545)) ^ 914768453;
                                                                        i31 = -148212618;
                                                                    } else {
                                                                        iM2765 = C0619.m2761("֡ۤ") ^ i28;
                                                                        i30 = ((iM2765 ^ i29) * 10679) ^ (-1308628470);
                                                                        i31 = 597545609;
                                                                    }
                                                                    break;
                                                                case -1749424905:
                                                                case -545709523:
                                                                    if (C1542.f5343 <= 0) {
                                                                        iM2765 = (C0619.m2761("ܶۙ") ^ i28) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                                                        i30 = ((iM2765 ^ i29) * 9677) ^ (-1093404706);
                                                                        i31 = -1188869588;
                                                                    } else {
                                                                        iM2765 = C0773.m3169("ܿۧ") ^ i28;
                                                                        i30 = ((iM2765 ^ i29) * 2633) ^ (-1224659527);
                                                                        i31 = -1378385602;
                                                                    }
                                                                    break;
                                                                case -1731402713:
                                                                case -1130912372:
                                                                    if (C2375.f7641 <= 0) {
                                                                        iM2765 = C0619.m2761("۠ᩴ") ^ i29;
                                                                        i30 = ((iM2765 ^ i28) * 9369) ^ 803754140;
                                                                        i31 = -402472032;
                                                                    } else {
                                                                        iM2765 = C0619.m2761("᩺ܳ") ^ i29;
                                                                        i30 = ((iM2765 ^ i28) * 6107) ^ (-1041226427);
                                                                        i31 = 1330038623;
                                                                    }
                                                                    break;
                                                                case -1720190977:
                                                                case 723054250:
                                                                    if (RunnableC3646.f12471) {
                                                                        iM2765 = C0619.m2761("۬᩻") ^ i29;
                                                                        i30 = ((iM2765 ^ i28) * 15229) ^ 511686561;
                                                                        i31 = -211093372;
                                                                    } else {
                                                                        iM2765 = (C0619.m2761("᩸᩻") + i28) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                                                        i30 = ((iM2765 ^ i29) * (-25949)) ^ 1794751957;
                                                                        i31 = -1108703235;
                                                                    }
                                                                    break;
                                                                case -1591179420:
                                                                case 1043343213:
                                                                    AbstractC3624.m11755();
                                                                    if (C4282.f15546 > 0) {
                                                                        iM2765 = C0773.m3169("ܶܽ") ^ i28;
                                                                        i30 = ((iM2765 ^ i29) * (-545)) ^ 914768453;
                                                                        i31 = -148212618;
                                                                    } else {
                                                                        iM2765 = C0619.m2761("۬᩻") ^ i29;
                                                                        i30 = ((iM2765 ^ i28) * 15229) ^ 511686561;
                                                                        i31 = -211093372;
                                                                    }
                                                                    break;
                                                                case -1071535338:
                                                                case 1035431718:
                                                                    if (C3690.f12684 <= 0) {
                                                                        iM2765 = C0773.m3169("ܶܽ") ^ i28;
                                                                        i30 = ((iM2765 ^ i29) * (-545)) ^ 914768453;
                                                                        i31 = -148212618;
                                                                    } else {
                                                                        iM2765 = (C0619.m2761("ۙ᩺") ^ i29) * (-41);
                                                                        i30 = ((iM2765 ^ i28) * (-30489)) ^ (-907345037);
                                                                        i31 = -831382039;
                                                                    }
                                                                    break;
                                                                case -933470377:
                                                                case 1470888158:
                                                                    if (C0950.f3488 >= 0) {
                                                                        iM2765 = C0773.m3169("ܶܽ") ^ i28;
                                                                        i30 = ((iM2765 ^ i29) * (-545)) ^ 914768453;
                                                                        i31 = -148212618;
                                                                    } else {
                                                                        iM2765 = C0773.m3169("᩺᩹") ^ i28;
                                                                        i30 = ((iM2765 ^ i29) * 10803) ^ 464390782;
                                                                        i31 = 347723492;
                                                                    }
                                                                    break;
                                                                case -462650740:
                                                                case 1284779041:
                                                                    if (C0269.f1558 <= 0) {
                                                                        iM2765 = C0619.m2761("۠ᩴ") ^ i29;
                                                                        i30 = ((iM2765 ^ i28) * 9369) ^ 803754140;
                                                                        i31 = -402472032;
                                                                    } else {
                                                                        iM2765 = (C0773.m3169("ܽ᩸") + i29) * (-55);
                                                                        i30 = ((iM2765 ^ i28) * 21301) ^ 348786950;
                                                                        i31 = -115809618;
                                                                    }
                                                                    break;
                                                                case 34687098:
                                                                case 1779859560:
                                                                    if (AbstractC0116.f1064 <= 0) {
                                                                        iM2765 = C0619.m2761("۠ᩴ") ^ i29;
                                                                        i30 = ((iM2765 ^ i28) * 9369) ^ 803754140;
                                                                        i31 = -402472032;
                                                                    } else {
                                                                        iM2765 = (C0619.m2761("ܺ۫") ^ i28) * 85;
                                                                        i30 = ((iM2765 ^ i29) * 17691) ^ (-1129893442);
                                                                        i31 = 1737924546;
                                                                    }
                                                                    break;
                                                                case 91856969:
                                                                case 1615828316:
                                                                    C17011.m40116(c17012, c14943, main2, c9651, z);
                                                                    break;
                                                                case 407152470:
                                                                case 1732942625:
                                                                    C3998.m12920();
                                                                    iM2765 = C0619.m2761("۬᩻") ^ i29;
                                                                    i30 = ((iM2765 ^ i28) * 15229) ^ 511686561;
                                                                    i31 = -211093372;
                                                                    break;
                                                                case 626524882:
                                                                case 1334320349:
                                                                    C2354.m7983();
                                                                    C2310.m7813();
                                                                    break;
                                                                case 677041082:
                                                                case 2141923137:
                                                                    if (RunnableC1848.f6235) {
                                                                        iM2765 = C0773.m3169("ܶܽ") ^ i28;
                                                                        i30 = ((iM2765 ^ i29) * (-545)) ^ 914768453;
                                                                        i31 = -148212618;
                                                                    } else {
                                                                        iM2765 = (i29 - C0619.m2761("ۖܳ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                                        i30 = ((iM2765 ^ i28) * (-3911)) ^ (-1465725035);
                                                                        i31 = 740774971;
                                                                    }
                                                                    break;
                                                                default:
                                                                    c14943 = c14942;
                                                                    if (C3099.f10023 <= 0) {
                                                                        iM2765 = (C0619.m2761("ܶۙ") ^ i28) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                                                        i30 = ((iM2765 ^ i29) * 9677) ^ (-1093404706);
                                                                        i31 = -1188869588;
                                                                    } else {
                                                                        iM2765 = C0619.m2761("ۤ֡") ^ i29;
                                                                        i30 = ((iM2765 ^ i28) * (-11243)) ^ (-496778223);
                                                                        i31 = -750030803;
                                                                    }
                                                                    break;
                                                            }
                                                            return;
                                                        }
                                                    }

                                                    @Override // l.InterfaceC18837
                                                    /* JADX INFO: renamed from: ۙ */
                                                    public final /* synthetic */ boolean mo1270(Exception exc) {
                                                        return false;
                                                    }

                                                    {
                                                        int i27 = -734338411;
                                                        int i28 = C3734.f12817;
                                                        int i29 = C2375.f7641;
                                                        int iM2765 = (C0619.m2761("᩹ᩴ") + i29) * (-41);
                                                        int i30 = ((iM2765 ^ i28) * (-19485)) ^ (-1948382104);
                                                        int i31 = 1382134377;
                                                        while (true) {
                                                            i27 = ((((i27 ^ i28) * 8053) >> 31) & i30) ^ (iM2765 ^ i31);
                                                            switch (i27) {
                                                                case -2139723530:
                                                                case -551131404:
                                                                    if (AbstractC0116.f1064 <= 0) {
                                                                        iM2765 = (C0773.m3169("ۘ᩺") ^ i28) * (-57);
                                                                        i30 = ((iM2765 ^ i29) * 51) ^ 875701919;
                                                                        i31 = 864566579;
                                                                    } else {
                                                                        iM2765 = (C0619.m2761("۟ܰ") ^ i28) * (-21);
                                                                        i30 = ((iM2765 ^ i29) * 22867) ^ (-1698999010);
                                                                        i31 = -1095018398;
                                                                    }
                                                                    break;
                                                                case -1754769837:
                                                                case 867465222:
                                                                    C1783.m6232();
                                                                    if (C3099.f10023 <= 0) {
                                                                        iM2765 = C0773.m3169("֡᩸") ^ i28;
                                                                        i30 = ((iM2765 ^ i29) * (-23597)) ^ 1807645358;
                                                                        i31 = 724455245;
                                                                    } else {
                                                                        iM2765 = (C0619.m2761("ۛ۠") ^ i29) * (-79);
                                                                        i30 = ((iM2765 ^ i28) * 26229) ^ 46492724;
                                                                        i31 = -421519961;
                                                                    }
                                                                    break;
                                                                case -1618870725:
                                                                case 298726469:
                                                                    if (C1826.f6190 <= 0) {
                                                                        iM2765 = (C0619.m2761("ۛ۠") ^ i29) * (-79);
                                                                        i30 = ((iM2765 ^ i28) * 26229) ^ 46492724;
                                                                        i31 = -421519961;
                                                                    } else {
                                                                        iM2765 = (C0773.m3169("ܳ۬") + i29) * 87;
                                                                        i30 = ((iM2765 ^ i28) * (-5911)) ^ (-647626115);
                                                                        i31 = 931450728;
                                                                    }
                                                                    break;
                                                                case -1383877859:
                                                                case -52370226:
                                                                    C2375.m8065();
                                                                    if (C1826.f6190 <= 0) {
                                                                        iM2765 = C0773.m3169("ۧܳ") ^ i29;
                                                                        i30 = ((iM2765 ^ i28) * (-16481)) ^ 1780437441;
                                                                        i31 = 1198141779;
                                                                    } else {
                                                                        iM2765 = (C0619.m2761("ۛ۠") ^ i29) * (-79);
                                                                        i30 = ((iM2765 ^ i28) * 26229) ^ 46492724;
                                                                        i31 = -421519961;
                                                                    }
                                                                    break;
                                                                case -1380559183:
                                                                case 133486410:
                                                                    if (C3448.f11240 >= 0) {
                                                                        iM2765 = (C0619.m2761("ܰۡ") + i28) * 63;
                                                                        i30 = ((iM2765 ^ i29) * (-30373)) ^ 261355695;
                                                                        i31 = 1878107640;
                                                                    } else {
                                                                        iM2765 = C0773.m3169("᩸ۨ") ^ i29;
                                                                        i30 = ((iM2765 ^ i28) * (-125)) ^ (-92008883);
                                                                        i31 = -577721165;
                                                                    }
                                                                    break;
                                                                case -1303627418:
                                                                case 159747067:
                                                                    C3033.m9845();
                                                                    C4282.m13644();
                                                                    iM2765 = (C0619.m2761("ܰۡ") + i28) * 63;
                                                                    i30 = ((iM2765 ^ i29) * (-30373)) ^ 261355695;
                                                                    i31 = 1878107640;
                                                                    break;
                                                                case -1103214333:
                                                                case -945505288:
                                                                    RunnableC0334.m2063();
                                                                    if (C2419.m8174() >= 0) {
                                                                        iM2765 = (C0619.m2761("ۛ۠") ^ i29) * (-79);
                                                                        i30 = ((iM2765 ^ i28) * 26229) ^ 46492724;
                                                                        i31 = -421519961;
                                                                    } else {
                                                                        iM2765 = (C0619.m2761("ܰۡ") + i28) * 63;
                                                                        i30 = ((iM2765 ^ i29) * (-30373)) ^ 261355695;
                                                                        i31 = 1878107640;
                                                                    }
                                                                    break;
                                                                case -1062550546:
                                                                case 198356788:
                                                                    RunnableC3055.m9933();
                                                                    C2966.m9664();
                                                                    throw new RuntimeException();
                                                                case -773657858:
                                                                case 768334418:
                                                                    if (C4238.f15451 >= 0) {
                                                                        iM2765 = C0773.m3169("ۧܳ") ^ i29;
                                                                        i30 = ((iM2765 ^ i28) * (-16481)) ^ 1780437441;
                                                                        i31 = 1198141779;
                                                                    } else {
                                                                        iM2765 = C0619.m2761("۬ۨ") ^ i29;
                                                                        i30 = ((iM2765 ^ i28) * 27703) ^ (-27880320);
                                                                        i31 = 96627427;
                                                                    }
                                                                    break;
                                                                case -475488260:
                                                                case 803079501:
                                                                    if (C2485.f7950 != 0) {
                                                                        iM2765 = C0773.m3169("֡᩸") ^ i28;
                                                                        i30 = ((iM2765 ^ i29) * (-23597)) ^ 1807645358;
                                                                        i31 = 724455245;
                                                                    } else {
                                                                        iM2765 = (i29 - C0773.m3169("ۢܳ")) * (-127);
                                                                        i30 = ((iM2765 ^ i28) * 7217) ^ (-1156915304);
                                                                        i31 = 1366246983;
                                                                    }
                                                                    break;
                                                                case -306404750:
                                                                case 364068645:
                                                                    if (C1519.f5300 >= 0) {
                                                                        iM2765 = (C0773.m3169("ۘ᩺") ^ i28) * (-57);
                                                                        i30 = ((iM2765 ^ i29) * 51) ^ 875701919;
                                                                        i31 = 864566579;
                                                                    } else {
                                                                        iM2765 = C0619.m2761("ۗ᩹") ^ i28;
                                                                        i30 = ((iM2765 ^ i29) * (-19583)) ^ 1350984179;
                                                                        i31 = 1991819207;
                                                                    }
                                                                    break;
                                                                case -270781770:
                                                                case 1466860975:
                                                                    if (C2966.m9664()) {
                                                                        iM2765 = C0619.m2761("֨ܰ") ^ i28;
                                                                        i30 = ((iM2765 ^ i29) * (-22353)) ^ 2089081835;
                                                                        i31 = -25532004;
                                                                    } else {
                                                                        iM2765 = (C0619.m2761("ۛ۠") ^ i29) * (-79);
                                                                        i30 = ((iM2765 ^ i28) * 26229) ^ 46492724;
                                                                        i31 = -421519961;
                                                                    }
                                                                    break;
                                                                case 725426327:
                                                                case 2064982714:
                                                                    return;
                                                                case 736677378:
                                                                case 1897669606:
                                                                    if (C2419.f7754 >= 0) {
                                                                        iM2765 = C0773.m3169("֡᩸") ^ i28;
                                                                        i30 = ((iM2765 ^ i29) * (-23597)) ^ 1807645358;
                                                                        i31 = 724455245;
                                                                    } else {
                                                                        iM2765 = (C0773.m3169("ܳܶ") + i28) * 99;
                                                                        i30 = ((iM2765 ^ i29) * (-8433)) ^ (-295931432);
                                                                        i31 = -1574052194;
                                                                    }
                                                                    break;
                                                                case 752095102:
                                                                case 1802113453:
                                                                    if (C0619.m2763()) {
                                                                        iM2765 = (C0619.m2761("ۛ۠") ^ i29) * (-79);
                                                                        i30 = ((iM2765 ^ i28) * 26229) ^ 46492724;
                                                                        i31 = -421519961;
                                                                    } else {
                                                                        iM2765 = (C0619.m2761("֨ۛ") + i29) * 115;
                                                                        i30 = ((iM2765 ^ i28) * (-20861)) ^ 1090254555;
                                                                        i31 = 1370251706;
                                                                    }
                                                                    break;
                                                                default:
                                                                    if (C1343.m4943()) {
                                                                        iM2765 = (i28 - C0773.m3169("᩶ۜ")) * 69;
                                                                        i30 = ((iM2765 ^ i29) * (-31943)) ^ 1704062280;
                                                                        i31 = 1030157018;
                                                                    } else {
                                                                        iM2765 = C0773.m3169("ۧܳ") ^ i29;
                                                                        i30 = ((iM2765 ^ i28) * (-16481)) ^ 1780437441;
                                                                        i31 = 1198141779;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    }
                                                }, main2, str);
                                            }
                                            iM2764 = (i24 - C0773.m3169("᩷֡")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i25 = ((iM2764 ^ i23) * (-13589)) ^ 1997252580;
                                            i26 = 556673535;
                                        } else {
                                            iM2764 = C0619.m2761("ᩳۙ") ^ i24;
                                            i25 = ((iM2764 ^ i23) * (-3349)) ^ (-1248152505);
                                            i26 = -1499699853;
                                        }
                                        break;
                                    case 135211104:
                                    case 1037243614:
                                        dialogInterfaceC8328 = dialogInterfaceC8327;
                                        if (C0269.m1775() <= 0) {
                                            iM2764 = (i24 - C0773.m3169("᩷֡")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i25 = ((iM2764 ^ i23) * (-13589)) ^ 1997252580;
                                            i26 = 556673535;
                                        } else {
                                            iM2764 = (C0619.m2761("ܿ᩹") + i23) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i25 = ((iM2764 ^ i24) * 23621) ^ (-2000196206);
                                            i26 = -1444023469;
                                        }
                                        break;
                                    case 199932351:
                                    case 725785906:
                                        C3690.m11987();
                                        if (!C17202.f56030) {
                                            iM2764 = (C0773.m3169("֡ܽ") ^ i23) * (-115);
                                            i25 = ((iM2764 ^ i24) * (-11927)) ^ (-1154920986);
                                            i26 = -2035064679;
                                        } else {
                                            iM2764 = C0619.m2761("ܰ᩵") ^ i23;
                                            i25 = ((iM2764 ^ i24) * 8875) ^ (-1971809585);
                                            i26 = 1020893827;
                                        }
                                        break;
                                    case 276875506:
                                    case 1608802527:
                                        C1146.m4231();
                                        C2966.m9664();
                                        break;
                                    case 277107811:
                                    case 353501254:
                                        if (RunnableC3055.f9898 >= 0) {
                                            iM2764 = (i24 - C0773.m3169("᩷֡")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i25 = ((iM2764 ^ i23) * (-13589)) ^ 1997252580;
                                            i26 = 556673535;
                                        } else {
                                            iM2764 = (C0619.m2761("ۛᩳ") + i24) * 3;
                                            i25 = ((iM2764 ^ i23) * 29897) ^ (-1768901749);
                                            i26 = 1518730421;
                                        }
                                        break;
                                    default:
                                        if (C23916.m53419() != 0) {
                                            iM2764 = C0619.m2761("ܰ᩵") ^ i23;
                                            i25 = ((iM2764 ^ i24) * 8875) ^ (-1971809585);
                                            i26 = 1020893827;
                                        } else {
                                            iM2764 = (i23 - C0619.m2761("ܿۧ")) * 79;
                                            i25 = ((iM2764 ^ i24) * 29563) ^ 706841216;
                                            i26 = 509666880;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    sArr3 = f55579;
                    if (C1146.m4231()) {
                        iM31611 = (C0773.m3169("ۘۤ") + i6) * 57;
                        i3 = ((iM31611 ^ i7) * 32153) ^ 1590690970;
                        i5 = -862254896;
                    } else {
                        iM31611 = (i6 - C0619.m2761("ۧۧ")) * 93;
                        i3 = ((iM31611 ^ i7) * 9481) ^ 1369432637;
                        i5 = -1189896768;
                    }
                    i9 = iM31611 ^ i5;
                    i8 = i3;
                    iM31613 = iM31613;
                    break;
                case 367434835:
                case 479650073:
                    i13 = 60303;
                    iM31610 = C0619.m2761("ۚܰ") ^ i7;
                    i3 = ((iM31610 ^ i6) * 4715) ^ (-859914852);
                    i4 = -186471843;
                    int i116 = iM31610 ^ i4;
                    onClickListener2 = onClickListener2;
                    i9 = i116;
                    i8 = i3;
                    iM31613 = iM31613;
                    break;
                case 368778066:
                case 499252958:
                    AbstractC3624.m11755();
                    AbstractC3624.m11755();
                    break;
                case 482097387:
                case 1834695353:
                    if (C2485.m8357() <= 0) {
                        onClickListener = onClickListener2;
                        iM3169 = C0773.m3169("ۘ᩻") ^ i7;
                        i = ((iM3169 ^ i6) * (-29121)) ^ (-1902227831);
                        i2 = -12039405;
                        DialogInterface.OnClickListener onClickListener5 = onClickListener;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                        onClickListener2 = onClickListener5;
                    } else {
                        iM31613 = iM31613;
                        onClickListener2 = onClickListener2;
                        iM31610 = (C0773.m3169("᩶۬") + i6) * (-111);
                        i3 = ((iM31610 ^ i7) * (-29835)) ^ 1097105200;
                        i4 = -529416578;
                        int i117 = iM31610 ^ i4;
                        onClickListener2 = onClickListener2;
                        i9 = i117;
                        i8 = i3;
                        iM31613 = iM31613;
                    }
                    break;
                case 891836149:
                case 2049729809:
                    i13 = 32183;
                    iM31610 = C0619.m2761("ۚܰ") ^ i7;
                    i3 = ((iM31610 ^ i6) * 4715) ^ (-859914852);
                    i4 = -186471843;
                    int i118 = iM31610 ^ i4;
                    onClickListener2 = onClickListener2;
                    i9 = i118;
                    i8 = i3;
                    iM31613 = iM31613;
                    break;
                case 1013611716:
                case 1977687875:
                    iM31613 = iM31613;
                    onClickListener2 = onClickListener2;
                    c2361M3794 = C0950.m3794(main);
                    iM2761 = C0619.m2761(C0269.m1785(f55579, 1, 3, i13));
                    if (C1826.f6190 <= 0) {
                        iM31610 = (i6 - C0619.m2761("ۧ᩺")) * 101;
                        i3 = ((iM31610 ^ i7) * 9159) ^ (-1214460552);
                        i4 = 495653331;
                    } else {
                        iM31610 = (C0773.m3169("ܶۨ") ^ i7) * (-67);
                        i3 = ((iM31610 ^ i6) * (-27027)) ^ 1644862620;
                        i4 = 1115336281;
                    }
                    int i119 = iM31610 ^ i4;
                    onClickListener2 = onClickListener2;
                    i9 = i119;
                    i8 = i3;
                    iM31613 = iM31613;
                    break;
                case 1622038067:
                case 1799327891:
                    iM31613 = iM31613;
                    onClickListener2 = onClickListener2;
                    int i21 = s + 1;
                    i14 = i21 * i21;
                    s2 = 2;
                    if (AbstractC0116.f1064 <= 0) {
                        iM31610 = (C0773.m3169("۠֨") + i7) * 35;
                        i3 = ((iM31610 ^ i6) * (-779)) ^ (-1962176268);
                        i4 = -2015108717;
                    } else {
                        iM31610 = C0773.m3169("ᩴۙ") ^ i7;
                        i3 = ((iM31610 ^ i6) * (-7595)) ^ 2052732674;
                        i4 = -475973266;
                    }
                    int i1110 = iM31610 ^ i4;
                    onClickListener2 = onClickListener2;
                    i9 = i1110;
                    i8 = i3;
                    iM31613 = iM31613;
                    break;
                default:
                    C2419.m8174();
                    C1519.m5403();
                    iM31613 = iM31613;
                    onClickListener2 = onClickListener2;
                    iM31610 = (C0773.m3169("᩶۬") + i6) * (-111);
                    i3 = ((iM31610 ^ i7) * (-29835)) ^ 1097105200;
                    i4 = -529416578;
                    int i1111 = iM31610 ^ i4;
                    onClickListener2 = onClickListener2;
                    i9 = i1111;
                    i8 = i3;
                    iM31613 = iM31613;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40115(final C17011 c17011, final String str) {
        View view;
        short[] sArr;
        int i;
        int iM2761;
        short[] sArr2;
        int i2;
        int i3;
        int iM2762;
        int i4;
        int iM2763;
        int i5;
        int i6;
        int iM3169;
        int i7;
        int i8;
        int i9;
        Main main;
        short[] sArr3;
        View view2;
        short[] sArr4;
        int i10;
        short[] sArr5;
        int i11;
        short[] sArr6;
        int i12;
        short s;
        int iM31610;
        int i13;
        int i14;
        int iM31611;
        int i15;
        int i16;
        int i17;
        int iM2764;
        int i18;
        int i19;
        DialogInterfaceC8327 dialogInterfaceC8327M34866 = null;
        int i20 = 1100545245;
        int i21 = AbstractC0641.f2496;
        int i22 = C0269.f1558;
        int iM2765 = C0619.m2761("۟ܳ") ^ i22;
        int i23 = ((iM2765 ^ i21) * (-8585)) ^ (-1319052312);
        int i24 = iM2765 ^ 580172450;
        C15306 c15306M36752 = null;
        Iterator itM53423 = null;
        StringBuilder sb = null;
        String strM40377 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        int i25 = 0;
        int i26 = 0;
        C14941 c14941 = null;
        int iM2766 = 0;
        int i27 = 0;
        int iM31612 = 0;
        int iM2767 = 0;
        int i28 = 0;
        int i29 = 0;
        short s2 = 0;
        int iM31613 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        TextView textView = null;
        C2361 c2361M3794 = null;
        String strM6233 = null;
        HashSet hashSet = null;
        String str2 = null;
        int iM2768 = 0;
        C25227 c25227 = null;
        short[] sArr11 = null;
        View view3 = null;
        final Main mainM2816 = null;
        while (true) {
            i20 = i24 ^ (i23 & (((i20 ^ i21) * (-16975)) >> 31));
            switch (i20) {
                case -2004055119:
                case -161541544:
                    i25 = i25;
                    view3 = view3;
                    if (C3998.m12923(itM53423)) {
                        iM2764 = (C0619.m2761("ۤ᩶") + i21) * (-75);
                        i18 = ((iM2764 ^ i22) * 8279) ^ 1090963990;
                        i19 = 358507976;
                    } else {
                        iM2764 = (C0619.m2761("ۚܰ") + i22) * (-91);
                        i18 = ((iM2764 ^ i21) * 16927) ^ (-596271809);
                        i19 = 1383952072;
                    }
                    i24 = iM2764 ^ i19;
                    view3 = view3;
                    i23 = i18;
                    i25 = i25;
                    break;
                case -1935735847:
                case -1793491500:
                    iM2767 = C0619.m2761(C1783.m6233(sArr11, i25, 3, i26));
                    if (RunnableC3646.m11813() == 0) {
                        iM3169 = (C0773.m3169("᩷ۘ") + i22) * 31;
                        i7 = ((iM3169 ^ i21) * (-10869)) ^ (-1313969814);
                        i8 = -701147392;
                        i24 = iM3169 ^ i8;
                        i23 = i7;
                    } else {
                        i25 = i25;
                        sArr11 = sArr11;
                        view3 = view3;
                        sArr = sArr7;
                        i = i31;
                        sArr8 = sArr8;
                        i32 = i32;
                        sArr9 = sArr9;
                        i30 = i30;
                        int iM31614 = (C0773.m3169("ۧۙ") + i21) * 67;
                        int i33 = i;
                        i23 = ((iM31614 ^ i22) * 23213) ^ (-499666469);
                        sArr7 = sArr;
                        i30 = i30;
                        i32 = i32;
                        sArr9 = sArr9;
                        i25 = i25;
                        sArr11 = sArr11;
                        sArr8 = sArr8;
                        view3 = view3;
                        i24 = iM31614 ^ 840397612;
                        i31 = i33;
                    }
                    break;
                case -1829879383:
                case -333241830:
                    C19782 c19782M36756 = c15306M36752.m36756();
                    c14941.m35948(c19782M36756);
                    HashSet hashSet2 = new HashSet();
                    itM53423 = C23916.m53423(c19782M36756.m45556());
                    hashSet = hashSet2;
                    iM2764 = (C0773.m3169("ܿ֨") + i21) * (-15);
                    i18 = ((iM2764 ^ i22) * (-17365)) ^ 2059776309;
                    i19 = 724675283;
                    i24 = iM2764 ^ i19;
                    view3 = view3;
                    i23 = i18;
                    i25 = i25;
                    break;
                case -1729135234:
                case -1630538043:
                    C1783.m6232();
                    if (C20932.m47848() != 0) {
                        i25 = i25;
                        sArr11 = sArr11;
                        view = view3;
                        sArr2 = sArr8;
                        i32 = i32;
                        sArr9 = sArr9;
                        iM2761 = (C0619.m2761("ܰᩳ") ^ i22) * (-57);
                        i2 = ((iM2761 ^ i21) * 19449) ^ (-1483874706);
                        i3 = -552245337;
                        i24 = iM2761 ^ i3;
                        i32 = i32;
                        i25 = i25;
                        sArr11 = sArr11;
                        sArr8 = sArr2;
                        short[] sArr12 = sArr9;
                        view3 = view;
                        i23 = i2;
                        sArr9 = sArr12;
                    } else {
                        iM3169 = C0619.m2761("ܺܰ") ^ i21;
                        i7 = ((iM3169 ^ i22) * 14577) ^ (-682916715);
                        i8 = 610807976;
                        i24 = iM3169 ^ i8;
                        i23 = i7;
                    }
                    break;
                case -1620596564:
                case 1681357408:
                    C3033.m9845();
                    if (!C2702.m8876()) {
                        i9 = i25;
                        sArr3 = sArr11;
                        s = s2;
                        view2 = view3;
                        sArr4 = sArr7;
                        i10 = i31;
                        sArr5 = sArr8;
                        i11 = i32;
                        main = mainM2816;
                        sArr6 = sArr9;
                        i12 = i30;
                        iM31610 = (i22 - C0773.m3169("ܽܰ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i13 = ((iM31610 ^ i21) * 1467) ^ 272269961;
                        i14 = 1523562490;
                        int i34 = iM31610 ^ i14;
                        i30 = i12;
                        i32 = i11;
                        sArr9 = sArr6;
                        sArr11 = sArr3;
                        sArr8 = sArr5;
                        view3 = view2;
                        sArr7 = sArr4;
                        i31 = i10;
                        i24 = i34;
                        i25 = i9;
                        Main main2 = main;
                        s2 = s;
                        i23 = i13;
                        mainM2816 = main2;
                    } else {
                        iM3169 = C0619.m2761("ܺܰ") ^ i21;
                        i7 = ((iM3169 ^ i22) * 14577) ^ (-682916715);
                        i8 = 610807976;
                        i24 = iM3169 ^ i8;
                        i23 = i7;
                    }
                    break;
                case -1579295059:
                case 306058229:
                    i25 = i25;
                    sArr9 = sArr9;
                    sArr11 = sArr11;
                    sArr2 = sArr8;
                    i32 = i32;
                    View viewM2812 = AbstractC0641.m2812(mainM2816, iM2768 ^ i27);
                    String strM2820 = AbstractC0641.m2820(f55579, 17, 3, i26);
                    if (C2023.m6964() <= 0) {
                        str2 = strM2820;
                        view = viewM2812;
                        iM2761 = (C0619.m2761("ܰᩳ") ^ i22) * (-57);
                        i2 = ((iM2761 ^ i21) * 19449) ^ (-1483874706);
                        i3 = -552245337;
                        i24 = iM2761 ^ i3;
                        i32 = i32;
                        i25 = i25;
                        sArr11 = sArr11;
                        sArr8 = sArr2;
                        short[] sArr13 = sArr9;
                        view3 = view;
                        i23 = i2;
                        sArr9 = sArr13;
                    } else {
                        int iM31615 = C0773.m3169("֫ۛ") ^ i21;
                        int i35 = ((iM31615 ^ i22) * 4549) ^ (-1264304999);
                        i24 = iM31615 ^ (-1238404039);
                        i32 = i32;
                        i25 = i25;
                        sArr11 = sArr11;
                        sArr8 = sArr2;
                        str2 = strM2820;
                        i23 = i35;
                        sArr9 = sArr9;
                        view3 = viewM2812;
                    }
                    break;
                case -1523399057:
                case -1021792831:
                    i26 = 9973;
                    iM2763 = (i22 - C0619.m2761("ᩴ֨")) * (-69);
                    i5 = ((iM2763 ^ i21) * (-5795)) ^ (-1191534001);
                    i6 = 1848703841;
                    i17 = iM2763 ^ i6;
                    i30 = i30;
                    i32 = i32;
                    sArr9 = sArr9;
                    sArr11 = sArr11;
                    sArr8 = sArr8;
                    view3 = view3;
                    sArr7 = sArr7;
                    i31 = i31;
                    i24 = i17;
                    i23 = i5;
                    i25 = i25;
                    break;
                case -1505675997:
                case -546932597:
                    RunnableC0334.m2063();
                    if (C0269.f1558 > 0) {
                        iM3169 = C0619.m2761("ܺܰ") ^ i21;
                        i7 = ((iM3169 ^ i22) * 14577) ^ (-682916715);
                        i8 = 610807976;
                        i24 = iM3169 ^ i8;
                        i23 = i7;
                    } else {
                        i25 = i25;
                        sArr11 = sArr11;
                        view = view3;
                        sArr9 = sArr9;
                        int iM2769 = C0619.m2761("ۖۛ") ^ i21;
                        i2 = ((iM2769 ^ i22) * 2223) ^ (-1010086741);
                        i24 = iM2769 ^ 1358629474;
                        i25 = i25;
                        sArr11 = sArr11;
                        c14941 = null;
                        short[] sArr14 = sArr9;
                        view3 = view;
                        i23 = i2;
                        sArr9 = sArr14;
                    }
                    break;
                case -1363328404:
                case 1112983250:
                    RunnableC0334.m2063();
                    C3690.m11987();
                    i25 = i25;
                    sArr11 = sArr11;
                    view = view3;
                    sArr9 = sArr9;
                    int iM27610 = C0619.m2761("ۖۛ") ^ i21;
                    i2 = ((iM27610 ^ i22) * 2223) ^ (-1010086741);
                    i24 = iM27610 ^ 1358629474;
                    i25 = i25;
                    sArr11 = sArr11;
                    c14941 = null;
                    short[] sArr15 = sArr9;
                    view3 = view;
                    i23 = i2;
                    sArr9 = sArr15;
                    break;
                case -1324172686:
                case 1793066617:
                    strM40377 = C17202.m40377(sArr9, 34, 3, i26);
                    if (C1564.m5509() > 0) {
                        iM3169 = C0773.m3169("ۢۜ") ^ i22;
                        i7 = ((iM3169 ^ i21) * 17663) ^ (-1937199323);
                        i8 = -166858210;
                        i24 = iM3169 ^ i8;
                        i23 = i7;
                    } else {
                        i25 = i25;
                        sArr11 = sArr11;
                        view = view3;
                        sArr2 = sArr8;
                        i32 = i32;
                        sArr9 = sArr9;
                        iM2761 = (C0619.m2761("ܰᩳ") ^ i22) * (-57);
                        i2 = ((iM2761 ^ i21) * 19449) ^ (-1483874706);
                        i3 = -552245337;
                        i24 = iM2761 ^ i3;
                        i32 = i32;
                        i25 = i25;
                        sArr11 = sArr11;
                        sArr8 = sArr2;
                        short[] sArr16 = sArr9;
                        view3 = view;
                        i23 = i2;
                        sArr9 = sArr16;
                    }
                    break;
                case -1300430861:
                case 1023039323:
                    i25 = i25;
                    sArr11 = sArr11;
                    view = view3;
                    sArr9 = sArr9;
                    textView = (TextView) C3448.m11246(view, C0619.m2761(str2) ^ 2100629894);
                    sArr8 = f55579;
                    i32 = 20;
                    if (C2287.f7432 >= 0) {
                        int iM27611 = C0619.m2761("ۖۛ") ^ i21;
                        i2 = ((iM27611 ^ i22) * 2223) ^ (-1010086741);
                        i24 = iM27611 ^ 1358629474;
                        i25 = i25;
                        sArr11 = sArr11;
                        c14941 = null;
                    } else {
                        iM2762 = (C0619.m2761("ܶۨ") ^ i22) * (-33);
                        i2 = ((iM2762 ^ i21) * (-4061)) ^ (-84908222);
                        i4 = 403608463;
                        i24 = iM2762 ^ i4;
                        i25 = i25;
                        sArr11 = sArr11;
                    }
                    short[] sArr17 = sArr9;
                    view3 = view;
                    i23 = i2;
                    sArr9 = sArr17;
                    break;
                case -1126634119:
                case 1856028986:
                    i25 = i25;
                    strM6233 = C1783.m6233(f55579, 28, 3, i26);
                    if (C3033.f9831 < 0) {
                        int iM27612 = C0619.m2761("᩹ۚ") ^ i21;
                        i5 = ((iM27612 ^ i22) * (-10639)) ^ 1303729058;
                        i24 = iM27612 ^ 1782039923;
                        i23 = i5;
                        i25 = i25;
                    } else {
                        sArr11 = sArr11;
                        view = view3;
                        sArr2 = sArr8;
                        i32 = i32;
                        sArr9 = sArr9;
                        iM2761 = (C0619.m2761("ܰᩳ") ^ i22) * (-57);
                        i2 = ((iM2761 ^ i21) * 19449) ^ (-1483874706);
                        i3 = -552245337;
                        i24 = iM2761 ^ i3;
                        i32 = i32;
                        i25 = i25;
                        sArr11 = sArr11;
                        sArr8 = sArr2;
                        short[] sArr18 = sArr9;
                        view3 = view;
                        i23 = i2;
                        sArr9 = sArr18;
                    }
                    break;
                case -957450994:
                case -522097920:
                    iM2766 = C0619.m2761(strM6233) ^ 2123849548;
                    sArr11 = f55579;
                    i25 = 31;
                    iM3169 = (i22 - C0773.m3169("ᩴ᩸")) * 91;
                    i7 = ((iM3169 ^ i21) * 31353) ^ 43567646;
                    i8 = 1081354688;
                    i24 = iM3169 ^ i8;
                    i23 = i7;
                    break;
                case -823733819:
                case 1283093875:
                    i25 = i25;
                    view = view3;
                    TextView textView2 = textView;
                    C2023.m6954(textView2, iM31612 ^ 2116360172);
                    C18597.m43181(c25227);
                    short[] sArr19 = f55579;
                    if (C0773.f2792 > 0) {
                        textView = textView2;
                        short[] sArr20 = sArr9;
                        c14941 = new C14941(C14941.m35934(AbstractC0116.m1236(sArr19, 26, 2, i26)));
                        c15306M36752 = C15306.m36752(c17011.f55582);
                        int iM31616 = C0773.m3169("۫ܳ") ^ i22;
                        i25 = i25;
                        i5 = ((iM31616 ^ i21) * (-12259)) ^ 1954333794;
                        i24 = iM31616 ^ (-1016764499);
                        sArr9 = sArr20;
                        view3 = view;
                        i23 = i5;
                        i25 = i25;
                    } else {
                        textView = textView2;
                        sArr9 = sArr9;
                        sArr11 = sArr11;
                        int iM27613 = C0619.m2761("ۖۛ") ^ i21;
                        i2 = ((iM27613 ^ i22) * 2223) ^ (-1010086741);
                        i24 = iM27613 ^ 1358629474;
                        i25 = i25;
                        sArr11 = sArr11;
                        c14941 = null;
                        short[] sArr110 = sArr9;
                        view3 = view;
                        i23 = i2;
                        sArr9 = sArr110;
                    }
                    break;
                case -787534881:
                case 574175427:
                    i25 = i25;
                    sArr11 = sArr11;
                    view3 = view3;
                    sArr = sArr7;
                    i = i31;
                    sArr8 = sArr8;
                    i32 = i32;
                    sArr9 = sArr9;
                    i30 = i30;
                    iM2768 = C0619.m2761(C2310.m7803(sArr, i30, i, i26));
                    i27 = 2121923806;
                    if (AbstractC0116.f1064 > 0) {
                        i31 = i;
                        iM2763 = C0619.m2761("֫ۢ") ^ i21;
                        sArr7 = sArr;
                        i5 = ((iM2763 ^ i22) * (-2811)) ^ 1362601530;
                        i6 = -1729417072;
                        i17 = iM2763 ^ i6;
                        i30 = i30;
                        i32 = i32;
                        sArr9 = sArr9;
                        sArr11 = sArr11;
                        sArr8 = sArr8;
                        view3 = view3;
                        sArr7 = sArr7;
                        i31 = i31;
                        i24 = i17;
                        i23 = i5;
                        i25 = i25;
                    } else {
                        int iM31617 = (C0773.m3169("ۧۙ") + i21) * 67;
                        int i36 = i;
                        i23 = ((iM31617 ^ i22) * 23213) ^ (-499666469);
                        sArr7 = sArr;
                        i30 = i30;
                        i32 = i32;
                        sArr9 = sArr9;
                        i25 = i25;
                        sArr11 = sArr11;
                        sArr8 = sArr8;
                        view3 = view3;
                        i24 = iM31617 ^ 840397612;
                        i31 = i36;
                    }
                    break;
                case -684958298:
                case -634501803:
                    C2702.m8876();
                    C2310.m7813();
                    break;
                case -671468660:
                case 1763648085:
                    C1783.m6234(sb, RunnableC1848.m6366(sArr10, 37, 1, i26));
                    C0862.m3502(hashSet, C1080.m4058(sb));
                    iM2764 = (C0773.m3169("ܿ֨") + i21) * (-15);
                    i18 = ((iM2764 ^ i22) * (-17365)) ^ 2059776309;
                    i19 = 724675283;
                    i24 = iM2764 ^ i19;
                    view3 = view3;
                    i23 = i18;
                    i25 = i25;
                    break;
                case -649349573:
                case 1681406007:
                    C17202.m40371(C0773.m3169(strM40377) ^ 2124978958);
                    final DialogInterfaceC8327 dialogInterfaceC8327 = dialogInterfaceC8327M34866;
                    final C14941 c14942 = c14941;
                    C11235.m28299(RunnableC3055.m9932(dialogInterfaceC8327M34866), new View.OnClickListener(c17011) { // from class: l.ᩴᩳۤ

                        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ C17011 f64254;

                        {
                            int i37 = -1969537582;
                            int i38 = C2702.f8586;
                            int i39 = C2966.f9654;
                            int iM27614 = (C0619.m2761("۬ᩴ") ^ i38) * (-89);
                            int i40 = ((iM27614 ^ i39) * 12877) ^ (-555874071);
                            int i41 = -1464394898;
                            while (true) {
                                i37 = ((((i37 ^ i39) * 3551) >> 31) & i40) ^ (iM27614 ^ i41);
                                switch (i37) {
                                    case -2105221832:
                                    case -1533263757:
                                        if (C1826.m6301() < 0) {
                                            iM27614 = C0773.m3169("֡᩷") ^ i39;
                                            i40 = ((iM27614 ^ i38) * 23317) ^ (-1398423216);
                                            i41 = -1268839664;
                                        } else {
                                            iM27614 = C0619.m2761("֨ᩴ") ^ i38;
                                            i40 = ((iM27614 ^ i39) * (-10445)) ^ (-872577389);
                                            i41 = 365160469;
                                        }
                                        break;
                                    case -2058143928:
                                    case 692061733:
                                        C3448.m11248();
                                        if (C3033.f9831 < 0) {
                                            iM27614 = C0619.m2761("֨ۛ") ^ i39;
                                            i40 = ((iM27614 ^ i38) * (-29229)) ^ 1273714492;
                                            i41 = -342707599;
                                        } else {
                                            iM27614 = C0619.m2761("֨ᩴ") ^ i38;
                                            i40 = ((iM27614 ^ i39) * (-10445)) ^ (-872577389);
                                            i41 = 365160469;
                                        }
                                        break;
                                    case -2020145764:
                                    case 806089250:
                                        if (C0773.f2792 <= 0) {
                                            iM27614 = C0773.m3169("ܳ᩹") ^ i39;
                                            i40 = ((iM27614 ^ i38) * 16967) ^ (-802135670);
                                            i41 = -40337432;
                                        } else {
                                            iM27614 = (C0619.m2761("ۢ۟") + i38) * (-115);
                                            i40 = ((iM27614 ^ i39) * (-17459)) ^ 360771166;
                                            i41 = -1368913286;
                                        }
                                        break;
                                    case -1985118944:
                                    case -825447969:
                                        if (C1826.m6301() >= 0) {
                                            iM27614 = C0619.m2761("֨ۛ") ^ i39;
                                            i40 = ((iM27614 ^ i38) * (-29229)) ^ 1273714492;
                                            i41 = -342707599;
                                        } else {
                                            iM27614 = (C0619.m2761("ܺۡ") + i38) * (-37);
                                            i40 = ((iM27614 ^ i39) * 22563) ^ (-900770645);
                                            i41 = -827793483;
                                        }
                                        break;
                                    case -1520091265:
                                    case -77933884:
                                        if (C2419.f7754 >= 0) {
                                            iM27614 = C0619.m2761("֨ۛ") ^ i39;
                                            i40 = ((iM27614 ^ i38) * (-29229)) ^ 1273714492;
                                            i41 = -342707599;
                                        } else {
                                            iM27614 = C0773.m3169("ۗ᩹") ^ i39;
                                            i40 = ((iM27614 ^ i38) * 1399) ^ 931589732;
                                            i41 = 347231841;
                                        }
                                        break;
                                    case -954135492:
                                    case 17284869:
                                        if (C1564.m5509() <= 0) {
                                            iM27614 = C0619.m2761("֨ᩴ") ^ i38;
                                            i40 = ((iM27614 ^ i39) * (-10445)) ^ (-872577389);
                                            i41 = 365160469;
                                        } else {
                                            iM27614 = (C0773.m3169("ۚۖ") + i38) * (-115);
                                            i40 = ((iM27614 ^ i39) * 24273) ^ 1364396303;
                                            i41 = 873662114;
                                        }
                                        break;
                                    case -794687137:
                                    case 1571669605:
                                        AbstractC0116.m1243();
                                        C1826.m6301();
                                        throw new RuntimeException();
                                    case -726589368:
                                    case 2030895106:
                                        this.f64254 = c17011;
                                        if (C23916.f77426 <= 0) {
                                            iM27614 = C0619.m2761("֨ۛ") ^ i39;
                                            i40 = ((iM27614 ^ i38) * (-29229)) ^ 1273714492;
                                            i41 = -342707599;
                                        } else {
                                            iM27614 = (i39 - C0773.m3169("ۙۚ")) * 83;
                                            i40 = ((iM27614 ^ i38) * (-13923)) ^ 358583932;
                                            i41 = -925386637;
                                        }
                                        break;
                                    case -610697191:
                                    case 1989001601:
                                        C2023.m6964();
                                        RunnableC1848.m6360();
                                        iM27614 = C0619.m2761("֨ᩴ") ^ i38;
                                        i40 = ((iM27614 ^ i39) * (-10445)) ^ (-872577389);
                                        i41 = 365160469;
                                        break;
                                    case -610075297:
                                    case 841209647:
                                        return;
                                    case -334683463:
                                    case 1525291149:
                                        if (C2287.m7745() <= 0) {
                                            iM27614 = C0619.m2761("֨ᩴ") ^ i38;
                                            i40 = ((iM27614 ^ i39) * (-10445)) ^ (-872577389);
                                            i41 = 365160469;
                                        } else {
                                            iM27614 = C0773.m3169("ۧ۬") ^ i38;
                                            i40 = ((iM27614 ^ i39) * 20241) ^ 1818973692;
                                            i41 = 1811994533;
                                        }
                                        break;
                                    case 69257755:
                                    case 970042101:
                                        if (AbstractC3624.f12429 <= 0) {
                                            iM27614 = C0619.m2761("֨ᩴ") ^ i38;
                                            i40 = ((iM27614 ^ i39) * (-10445)) ^ (-872577389);
                                            i41 = 365160469;
                                        } else {
                                            iM27614 = (C0619.m2761("ᩳܳ") + i38) * (-19);
                                            i40 = ((iM27614 ^ i39) * (-6831)) ^ 2117626150;
                                            i41 = -1635723607;
                                        }
                                        break;
                                    case 304535354:
                                    case 611249404:
                                        if (RunnableC3646.m11813() != 0) {
                                            iM27614 = C0619.m2761("֨ۛ") ^ i39;
                                            i40 = ((iM27614 ^ i38) * (-29229)) ^ 1273714492;
                                            i41 = -342707599;
                                        } else {
                                            iM27614 = C0619.m2761("ܶ֡") ^ i39;
                                            i40 = ((iM27614 ^ i38) * (-26363)) ^ 976876831;
                                            i41 = 947527575;
                                        }
                                        break;
                                    case 1039583528:
                                    case 1619477389:
                                        RunnableC1848.m6360();
                                        if (C3099.f10023 <= 0) {
                                            iM27614 = C0619.m2761("֨ᩴ") ^ i38;
                                            i40 = ((iM27614 ^ i39) * (-10445)) ^ (-872577389);
                                            i41 = 365160469;
                                        } else {
                                            iM27614 = (C0619.m2761("ۙۗ") ^ i38) * 35;
                                            i40 = ((iM27614 ^ i39) * 20261) ^ (-179967406);
                                            i41 = 1133382229;
                                        }
                                        break;
                                    case 1049491070:
                                    case 1104702522:
                                        if (C1146.f4234 >= 0) {
                                            iM27614 = C0619.m2761("֨ۛ") ^ i39;
                                            i40 = ((iM27614 ^ i38) * (-29229)) ^ 1273714492;
                                            i41 = -342707599;
                                        } else {
                                            iM27614 = (C0773.m3169("ۖۛ") ^ i39) * 41;
                                            i40 = ((iM27614 ^ i38) * (-28737)) ^ (-1260304638);
                                            i41 = 1930555259;
                                        }
                                        break;
                                    default:
                                        if (C2354.f7599 >= 0) {
                                            iM27614 = C0773.m3169("֡᩷") ^ i39;
                                            i40 = ((iM27614 ^ i38) * 23317) ^ (-1398423216);
                                            i41 = -1268839664;
                                        } else {
                                            iM27614 = C0619.m2761("ۨۚ") ^ i39;
                                            i40 = ((iM27614 ^ i38) * 4971) ^ 454372433;
                                            i41 = 445127853;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            Main main3 = null;
                            String str3 = null;
                            C17011 c17012 = null;
                            DialogInterfaceC8327 dialogInterfaceC8328 = null;
                            int i37 = -563856155;
                            int i38 = AbstractC3624.f12429;
                            int i39 = C1519.f5300;
                            int iM31618 = C0773.m3169("᩸᩻") ^ i38;
                            int i40 = ((iM31618 ^ i39) * (-10621)) ^ 1792114673;
                            int i41 = -916110495;
                            while (true) {
                                i37 = ((((i37 ^ i39) * 31843) >> 31) & i40) ^ (iM31618 ^ i41);
                                switch (i37) {
                                    case -2126570492:
                                    case 1295959439:
                                        if (C1564.f5401 <= 0) {
                                            iM31618 = C0773.m3169("ۛۙ") ^ i38;
                                            i40 = ((iM31618 ^ i39) * 25281) ^ (-714077109);
                                            i41 = -1039047777;
                                        } else {
                                            iM31618 = (C0773.m3169("ܳ᩸") + i38) * 83;
                                            i40 = ((iM31618 ^ i39) * 1531) ^ (-1262720196);
                                            i41 = -566993072;
                                        }
                                        break;
                                    case -2104809560:
                                    case -710498885:
                                        if (C2288.f7433 <= 0) {
                                            iM31618 = C0773.m3169("ۛۙ") ^ i38;
                                            i40 = ((iM31618 ^ i39) * 25281) ^ (-714077109);
                                            i41 = -1039047777;
                                        } else {
                                            iM31618 = (i39 - C0619.m2761("ۗ᩵")) * 97;
                                            i40 = ((iM31618 ^ i38) * (-27531)) ^ (-609713081);
                                            i41 = -1183958075;
                                        }
                                        break;
                                    case -2078076119:
                                    case -331119564:
                                        str3 = str;
                                        if (RunnableC1848.f6235) {
                                            iM31618 = C0773.m3169("ܶۘ") ^ i38;
                                            i40 = ((iM31618 ^ i39) * (-25631)) ^ (-1511510719);
                                            i41 = 221482566;
                                        } else {
                                            iM31618 = C0773.m3169("ۧۨ") ^ i38;
                                            i40 = ((iM31618 ^ i39) * (-17045)) ^ (-1736180201);
                                            i41 = 970068728;
                                        }
                                        break;
                                    case -1979935989:
                                    case 848415147:
                                        if (!C3492.m11488()) {
                                            iM31618 = (i39 - C0773.m3169("۫ۧ")) * (-49);
                                            i40 = ((iM31618 ^ i38) * (-3645)) ^ (-1503175569);
                                            i41 = 378955698;
                                        } else {
                                            iM31618 = (C0773.m3169("᩻ۛ") + i38) * 67;
                                            i40 = ((iM31618 ^ i39) * 5273) ^ 1315201945;
                                            i41 = 964087979;
                                        }
                                        break;
                                    case -1978043729:
                                    case -323548375:
                                        if (C3492.f12043 <= 0) {
                                            iM31618 = (C0773.m3169("᩻ۛ") + i38) * 67;
                                            i40 = ((iM31618 ^ i39) * 5273) ^ 1315201945;
                                            i41 = 964087979;
                                        } else {
                                            iM31618 = C0773.m3169("۠ۙ") ^ i39;
                                            i40 = ((iM31618 ^ i38) * 18609) ^ (-1048746472);
                                            i41 = 1971149478;
                                        }
                                        break;
                                    case -1853432141:
                                    case -1471505850:
                                        C17011.m40114(c17012, main3, dialogInterfaceC8328, c14942, str3);
                                        break;
                                    case -1834041320:
                                    case 1188971502:
                                        C3492.m11488();
                                        if (C23916.f77426 > 0) {
                                            iM31618 = C0773.m3169("᩸᩹") ^ i39;
                                            i40 = ((iM31618 ^ i38) * 9555) ^ 1226923162;
                                            i41 = 544441396;
                                        } else {
                                            iM31618 = C0773.m3169("ۛۙ") ^ i38;
                                            i40 = ((iM31618 ^ i39) * 25281) ^ (-714077109);
                                            i41 = -1039047777;
                                        }
                                        break;
                                    case -1747268057:
                                    case -95522495:
                                        if (C0950.f3488 >= 0) {
                                            iM31618 = (C0773.m3169("᩻ۛ") + i38) * 67;
                                            i40 = ((iM31618 ^ i39) * 5273) ^ 1315201945;
                                            i41 = 964087979;
                                        } else {
                                            iM31618 = (C0773.m3169("ۧᩳ") + i39) * (-97);
                                            i40 = ((iM31618 ^ i38) * (-27123)) ^ 352953208;
                                            i41 = -779148495;
                                        }
                                        break;
                                    case -1719986009:
                                    case 1073905069:
                                        main3 = mainM2816;
                                        if (AbstractC0116.f1064 <= 0) {
                                            iM31618 = C0773.m3169("ܶۘ") ^ i38;
                                            i40 = ((iM31618 ^ i39) * (-25631)) ^ (-1511510719);
                                            i41 = 221482566;
                                        } else {
                                            iM31618 = C0619.m2761("ۨ֡") ^ i39;
                                            i40 = ((iM31618 ^ i38) * (-10219)) ^ 1097568545;
                                            i41 = 1532844207;
                                        }
                                        break;
                                    case -1595137387:
                                    case -425866827:
                                        C3492.m11488();
                                        break;
                                    case -1471567732:
                                    case -15836406:
                                        C2419.m8174();
                                        if (!C2288.m7767()) {
                                            iM31618 = (i39 - C0773.m3169("۫ۧ")) * (-49);
                                            i40 = ((iM31618 ^ i38) * (-3645)) ^ (-1503175569);
                                            i41 = 378955698;
                                        } else {
                                            iM31618 = C0773.m3169("ۛۙ") ^ i38;
                                            i40 = ((iM31618 ^ i39) * 25281) ^ (-714077109);
                                            i41 = -1039047777;
                                        }
                                        break;
                                    case -1442639520:
                                    case 1201061684:
                                        if (C3734.f12817 >= 0) {
                                            iM31618 = (i39 - C0773.m3169("۫ۧ")) * (-49);
                                            i40 = ((iM31618 ^ i38) * (-3645)) ^ (-1503175569);
                                            i41 = 378955698;
                                        } else {
                                            iM31618 = C0619.m2761("᩷ۡ") ^ i38;
                                            i40 = ((iM31618 ^ i39) * (-13541)) ^ (-1392331197);
                                            i41 = -1314889279;
                                        }
                                        break;
                                    case 401895908:
                                    case 1310484932:
                                        if (C13473.m33144()) {
                                            iM31618 = (i38 - C0619.m2761("ۗ᩹")) * (-107);
                                            i40 = ((iM31618 ^ i39) * (-27461)) ^ (-256814770);
                                            i41 = 712503320;
                                        } else {
                                            iM31618 = C0773.m3169("᩸᩹") ^ i39;
                                            i40 = ((iM31618 ^ i38) * 9555) ^ 1226923162;
                                            i41 = 544441396;
                                        }
                                        break;
                                    case 778478911:
                                    case 1729917253:
                                        C2023.m6964();
                                        iM31618 = (C0773.m3169("᩻ۛ") + i38) * 67;
                                        i40 = ((iM31618 ^ i39) * 5273) ^ 1315201945;
                                        i41 = 964087979;
                                        break;
                                    case 1864221336:
                                    case 1916790227:
                                        c17012 = this.f64254;
                                        dialogInterfaceC8328 = dialogInterfaceC8327;
                                        if (C2419.f7754 >= 0) {
                                            iM31618 = (C0773.m3169("᩻ۛ") + i38) * 67;
                                            i40 = ((iM31618 ^ i39) * 5273) ^ 1315201945;
                                            i41 = 964087979;
                                        } else {
                                            iM31618 = C0773.m3169("᩷ۨ") ^ i39;
                                            i40 = ((iM31618 ^ i38) * (-12347)) ^ (-1822433599);
                                            i41 = 2000105768;
                                        }
                                        break;
                                    default:
                                        if (AbstractC3624.f12429 <= 0) {
                                            iM31618 = C0773.m3169("᩸᩹") ^ i39;
                                            i40 = ((iM31618 ^ i38) * 9555) ^ 1226923162;
                                            i41 = 544441396;
                                        } else {
                                            iM31618 = C0619.m2761("᩹ܽ") ^ i38;
                                            i40 = ((iM31618 ^ i39) * 2875) ^ 341854061;
                                            i41 = -1487332601;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    break;
                case -533603330:
                case 1915948773:
                    i26 = 50599;
                    iM2763 = (i22 - C0619.m2761("ᩴ֨")) * (-69);
                    i5 = ((iM2763 ^ i21) * (-5795)) ^ (-1191534001);
                    i6 = 1848703841;
                    i17 = iM2763 ^ i6;
                    i30 = i30;
                    i32 = i32;
                    sArr9 = sArr9;
                    sArr11 = sArr11;
                    sArr8 = sArr8;
                    view3 = view3;
                    sArr7 = sArr7;
                    i31 = i31;
                    i24 = i17;
                    i23 = i5;
                    i25 = i25;
                    break;
                case -432293029:
                case 1675931745:
                    i25 = i25;
                    c14941.m35941(hashSet);
                    c14941.m35936();
                    C3998.m12927(c25227, c14941);
                    c2361M3794 = C0950.m3794(mainM2816);
                    view3 = view3;
                    C4282.m13657(c2361M3794, view3);
                    iM2764 = (C0619.m2761("᩺۬") + i21) * (-19);
                    i18 = ((iM2764 ^ i22) * (-2705)) ^ (-1683088570);
                    i19 = -548883986;
                    i24 = iM2764 ^ i19;
                    view3 = view3;
                    i23 = i18;
                    i25 = i25;
                    break;
                case -379216706:
                case 231931529:
                    i9 = i25;
                    main = mainM2816;
                    sArr3 = sArr11;
                    view2 = view3;
                    sArr4 = sArr7;
                    i10 = i31;
                    sArr5 = sArr8;
                    i11 = i32;
                    sArr6 = sArr9;
                    i12 = i30;
                    s = f55579[13];
                    i28 = s * s;
                    i29 = 158432569;
                    if (C0269.f1558 <= 0) {
                        iM31610 = (i22 - C0773.m3169("ܽܰ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i13 = ((iM31610 ^ i21) * 1467) ^ 272269961;
                        i14 = 1523562490;
                    } else {
                        iM31610 = C0773.m3169("᩺ۖ") ^ i21;
                        i13 = ((iM31610 ^ i22) * 28063) ^ 1755256918;
                        i14 = -889218242;
                    }
                    int i37 = iM31610 ^ i14;
                    i30 = i12;
                    i32 = i11;
                    sArr9 = sArr6;
                    sArr11 = sArr3;
                    sArr8 = sArr5;
                    view3 = view2;
                    sArr7 = sArr4;
                    i31 = i10;
                    i24 = i37;
                    i25 = i9;
                    Main main3 = main;
                    s2 = s;
                    i23 = i13;
                    mainM2816 = main3;
                    break;
                case -325415288:
                case 753366600:
                    i25 = i25;
                    mainM2816 = AbstractC0641.m2816(c17011.f55581);
                    sArr7 = f55579;
                    i30 = 14;
                    i31 = 3;
                    int iM27614 = C0619.m2761("ۖܳ") ^ i22;
                    i5 = ((iM27614 ^ i21) * (-23459)) ^ (-163527124);
                    i17 = iM27614 ^ (-28743459);
                    i32 = i32;
                    sArr9 = sArr9;
                    sArr11 = sArr11;
                    sArr8 = sArr8;
                    view3 = view3;
                    i24 = i17;
                    i23 = i5;
                    i25 = i25;
                    break;
                case -1630084:
                case 701392157:
                    i25 = i25;
                    sArr11 = sArr11;
                    view = view3;
                    sArr9 = sArr9;
                    short[] sArr21 = sArr8;
                    i32 = i32;
                    iM31613 = C0773.m3169(C2287.m7749(sArr21, i32, 3, i26)) ^ 2125131442;
                    if (C2702.f8586 > 0) {
                        iM2761 = C0619.m2761("۟᩷") ^ i21;
                        sArr2 = sArr21;
                        i2 = ((iM2761 ^ i22) * (-14939)) ^ (-435756347);
                        i3 = -998353381;
                        i24 = iM2761 ^ i3;
                        i32 = i32;
                        i25 = i25;
                        sArr11 = sArr11;
                        sArr8 = sArr2;
                        short[] sArr111 = sArr9;
                        view3 = view;
                        i23 = i2;
                        sArr9 = sArr111;
                    } else {
                        view3 = view;
                        sArr8 = sArr21;
                        sArr = sArr7;
                        i30 = i30;
                        i = i31;
                        int iM31618 = (C0773.m3169("ۧۙ") + i21) * 67;
                        int i38 = i;
                        i23 = ((iM31618 ^ i22) * 23213) ^ (-499666469);
                        sArr7 = sArr;
                        i30 = i30;
                        i32 = i32;
                        sArr9 = sArr9;
                        i25 = i25;
                        sArr11 = sArr11;
                        sArr8 = sArr8;
                        view3 = view3;
                        i24 = iM31618 ^ 840397612;
                        i31 = i38;
                    }
                    break;
                case 319406121:
                case 1076442448:
                    i25 = i25;
                    short[] sArr22 = sArr11;
                    View view4 = view3;
                    short[] sArr23 = sArr7;
                    int i39 = i31;
                    short[] sArr24 = sArr8;
                    int i40 = i32;
                    short[] sArr25 = sArr9;
                    int i41 = i30;
                    int i42 = i28 + i29;
                    short s3 = s2;
                    Main main4 = mainM2816;
                    int i43 = s3 + 12587;
                    if ((i42 + i42) - (i43 * i43) >= 0) {
                        iM31611 = C0619.m2761("᩵᩺") ^ i22;
                        i15 = ((iM31611 ^ i21) * (-26281)) ^ 1591643862;
                        i16 = -329417861;
                    } else {
                        iM31611 = C0773.m3169("᩷֨") ^ i21;
                        i15 = ((iM31611 ^ i22) * (-30947)) ^ 81981079;
                        i16 = 1793553437;
                    }
                    int i44 = iM31611 ^ i16;
                    i30 = i41;
                    i32 = i40;
                    sArr9 = sArr25;
                    sArr11 = sArr22;
                    sArr8 = sArr24;
                    view3 = view4;
                    sArr7 = sArr23;
                    i31 = i39;
                    i24 = i44;
                    i23 = i15;
                    mainM2816 = main4;
                    s2 = s3;
                    i25 = i25;
                    break;
                case 1182325020:
                case 1312551927:
                    C19782 c19782 = (C19782) C4238.m13529(itM53423);
                    sb = new StringBuilder();
                    C1783.m6234(sb, c19782.m45560());
                    sArr10 = f55579;
                    iM3169 = C0773.m3169("ܶ᩹") ^ i22;
                    i7 = ((iM3169 ^ i21) * (-23611)) ^ 388580863;
                    i8 = 1180254281;
                    i24 = iM3169 ^ i8;
                    i23 = i7;
                    break;
                case 1435161420:
                case 1875234720:
                    dialogInterfaceC8327M34866 = C14442.m34866(c2361M3794, iM2766, null, iM2767 ^ 2100268881, null);
                    sArr9 = f55579;
                    iM3169 = C0773.m3169("᩸᩻") ^ i21;
                    i7 = ((iM3169 ^ i22) * 30047) ^ (-2064834471);
                    i8 = -533275512;
                    i24 = iM3169 ^ i8;
                    i23 = i7;
                    break;
                default:
                    i25 = i25;
                    view = view3;
                    sArr9 = sArr9;
                    c25227 = (C25227) C3448.m11246(view, iM31613);
                    sArr11 = sArr11;
                    iM31612 = C0773.m3169(C0773.m3166(f55579, 23, 3, i26));
                    if (C23916.m53419() == 0) {
                        iM2762 = C0619.m2761("ܶܰ") ^ i22;
                        i2 = ((iM2762 ^ i21) * (-20761)) ^ (-2054432457);
                        i4 = -509563040;
                        i24 = iM2762 ^ i4;
                        i25 = i25;
                        sArr11 = sArr11;
                        short[] sArr112 = sArr9;
                        view3 = view;
                        i23 = i2;
                        sArr9 = sArr112;
                    } else {
                        view3 = view;
                        sArr = sArr7;
                        i30 = i30;
                        i = i31;
                        sArr8 = sArr8;
                        i32 = i32;
                        int iM31619 = (C0773.m3169("ۧۙ") + i21) * 67;
                        int i310 = i;
                        i23 = ((iM31619 ^ i22) * 23213) ^ (-499666469);
                        sArr7 = sArr;
                        i30 = i30;
                        i32 = i32;
                        sArr9 = sArr9;
                        i25 = i25;
                        sArr11 = sArr11;
                        sArr8 = sArr8;
                        view3 = view3;
                        i24 = iM31619 ^ 840397612;
                        i31 = i310;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0355 A[PHI: r5 r9 r14 r15 r16 r17 r21 r23 r24
      0x0355: PHI (r5v5 java.lang.String[]) = (r5v2 java.lang.String[]), (r5v2 java.lang.String[]), (r5v4 java.lang.String[]), (r5v2 java.lang.String[]) binds: [B:72:0x0353, B:68:0x032e, B:111:0x0355, B:18:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x0355: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:72:0x0353, B:68:0x032e, B:111:0x0355, B:18:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x0355: PHI (r14v4 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v3 short[]), (r14v2 short[]) binds: [B:72:0x0353, B:68:0x032e, B:111:0x0355, B:18:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x0355: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:72:0x0353, B:68:0x032e, B:111:0x0355, B:18:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x0355: PHI (r16v4 short[]) = (r16v2 short[]), (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:72:0x0353, B:68:0x032e, B:111:0x0355, B:18:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x0355: PHI (r17v4 char) = (r17v2 char), (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:72:0x0353, B:68:0x032e, B:111:0x0355, B:18:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x0355: PHI (r21v23 short[]) = (r21v6 short[]), (r21v7 short[]), (r21v15 short[]), (r21v24 short[]) binds: [B:72:0x0353, B:68:0x032e, B:111:0x0355, B:18:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x0355: PHI (r23v20 java.lang.String) = (r23v4 java.lang.String), (r23v5 java.lang.String), (r23v13 java.lang.String), (r23v21 java.lang.String) binds: [B:72:0x0353, B:68:0x032e, B:111:0x0355, B:18:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x0355: PHI (r24v17 l.᩷ۨᩴ) = (r24v5 l.᩷ۨᩴ), (r24v6 l.᩷ۨᩴ), (r24v14 l.᩷ۨᩴ), (r24v18 l.᩷ۨᩴ) binds: [B:72:0x0353, B:68:0x032e, B:111:0x0355, B:18:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40116(C17011 c17011, C14941 c14941, Main main, C9651 c9651, boolean z) {
        int iM2761;
        String str;
        int i;
        int i2;
        int iM3169;
        int i3;
        int i4;
        int iM31610;
        int i5;
        int i6;
        int i7;
        C17011 c17012 = c17011;
        int i8 = C1542.f5343;
        int i9 = C1146.f4234;
        int iM31611 = C0773.m3169("۫ۨ") ^ i9;
        int i10 = ((iM31611 ^ i8) * (-18191)) ^ (-1189403521);
        short[] sArr = null;
        short[] sArr2 = null;
        int i11 = iM31611 ^ 1975629483;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        char c = 0;
        int i16 = -1724512115;
        int i17 = 0;
        short[] sArr3 = null;
        String strM12266 = null;
        String strM4220 = null;
        AbstractC22044 abstractC22044 = null;
        String[] strArr = null;
        Object[] array = null;
        HashSet hashSetM35955 = null;
        C8458 c8458 = null;
        while (true) {
            i16 = i11 ^ (i10 & (((i16 ^ i8) * 15891) >> 31));
            switch (i16) {
                case -1926866068:
                case -1006608099:
                    i14 = 32260;
                    iM3169 = C0619.m2761("ܶܽ") ^ i8;
                    i10 = ((iM3169 ^ i9) * (-17185)) ^ (-108709738);
                    i3 = 1431898483;
                    i4 = iM3169 ^ i3;
                    sArr2 = sArr2;
                    strM4220 = strM4220;
                    abstractC22044 = abstractC22044;
                    i11 = i4;
                    c17012 = c17011;
                    break;
                case -1868546793:
                case -925605294:
                    abstractC22044 = abstractC22044;
                    strM4220 = strM4220;
                    sArr2 = sArr2;
                    strArr = (String[]) array;
                    sArr = f55579;
                    i15 = 39;
                    i12 = 5;
                    if (AbstractC0641.f2496 < 0) {
                        iM31610 = (i9 - C0619.m2761("֡᩺")) * 81;
                        i5 = ((iM31610 ^ i8) * (-6571)) ^ 653137293;
                        i6 = -518263972;
                        i7 = iM31610 ^ i6;
                        sArr2 = sArr2;
                        strM4220 = strM4220;
                        i11 = i7;
                        i10 = i5;
                        abstractC22044 = abstractC22044;
                    } else {
                        iM3169 = (i9 - C0773.m3169("ۢۜ")) * 33;
                        i10 = ((iM3169 ^ i8) * 17899) ^ (-599008529);
                        i3 = -388238873;
                        i4 = iM3169 ^ i3;
                        sArr2 = sArr2;
                        strM4220 = strM4220;
                        abstractC22044 = abstractC22044;
                        i11 = i4;
                        c17012 = c17011;
                    }
                    break;
                case -1718715911:
                case 473444248:
                    abstractC22044 = abstractC22044;
                    strM4220 = strM4220;
                    sArr2 = sArr2;
                    int i18 = C13678.f43415;
                    c8458 = new C8458(C25217.class);
                    hashSetM35955 = c14941.m35955();
                    if (C1146.f4234 < 0) {
                        iM3169 = (C0619.m2761("ۡۨ") + i8) * (-3);
                        i10 = ((iM3169 ^ i9) * (-15399)) ^ (-372279235);
                        i3 = 1038725332;
                        i4 = iM3169 ^ i3;
                        sArr2 = sArr2;
                        strM4220 = strM4220;
                        abstractC22044 = abstractC22044;
                        i11 = i4;
                        c17012 = c17011;
                    } else {
                        strM4220 = strM4220;
                        abstractC22044 = abstractC22044;
                        int iM31612 = (i9 - C0773.m3169("ܽۜ")) * 115;
                        sArr2 = sArr2;
                        i11 = iM31612 ^ 1752226301;
                        i10 = ((iM31612 ^ i8) * (-24783)) ^ 1418959464;
                        c17012 = c17011;
                    }
                    break;
                case -1696967539:
                case -1192075267:
                    abstractC22044 = abstractC22044;
                    strM4220 = strM4220;
                    sArr2 = sArr2;
                    if (i17 - (88303609 + i13) <= 0) {
                        iM3169 = C0773.m3169("ۙ۫") ^ i8;
                        i10 = ((iM3169 ^ i9) * (-12287)) ^ 621100909;
                        i3 = -1922991613;
                    } else {
                        iM3169 = C0773.m3169("ۘۡ") ^ i9;
                        i10 = ((iM3169 ^ i8) * (-65)) ^ (-389874454);
                        i3 = 1088876302;
                    }
                    i4 = iM3169 ^ i3;
                    sArr2 = sArr2;
                    strM4220 = strM4220;
                    abstractC22044 = abstractC22044;
                    i11 = i4;
                    c17012 = c17011;
                    break;
                case -1613816481:
                case 1210642394:
                    c8458.m22725(c17012.f55581);
                    c8458.m22714();
                    break;
                case -1601555291:
                case -1478684798:
                    c8458.m22720(C2288.m7761(sArr2, 48, 15, i14), z);
                    if (C1146.f4234 >= 0) {
                        sArr2 = sArr2;
                        int iM31613 = (i9 - C0773.m3169("ܽۜ")) * 115;
                        sArr2 = sArr2;
                        i11 = iM31613 ^ 1752226301;
                        i10 = ((iM31613 ^ i8) * (-24783)) ^ 1418959464;
                        c17012 = c17011;
                    } else {
                        int iM31614 = (i9 - C0773.m3169("᩻ܳ")) * (-15);
                        i11 = iM31614 ^ 920329749;
                        i10 = ((iM31614 ^ i8) * 21121) ^ 67752163;
                        sArr2 = sArr2;
                    }
                    break;
                case -1349134442:
                case 461707886:
                    if (!C3077.f9998) {
                        abstractC22044 = abstractC22044;
                        strM4220 = strM4220;
                        sArr2 = sArr2;
                        iM31610 = C0619.m2761("᩻᩺") ^ i8;
                        i5 = ((iM31610 ^ i9) * 20993) ^ (-2099357380);
                        i6 = 357501021;
                        i7 = iM31610 ^ i6;
                        sArr2 = sArr2;
                        strM4220 = strM4220;
                        i11 = i7;
                        i10 = i5;
                        abstractC22044 = abstractC22044;
                    } else {
                        abstractC22044 = abstractC22044;
                        strM4220 = strM4220;
                        sArr2 = sArr2;
                        iM3169 = (i9 - C0773.m3169("ۢۜ")) * 33;
                        i10 = ((iM3169 ^ i8) * 17899) ^ (-599008529);
                        i3 = -388238873;
                        i4 = iM3169 ^ i3;
                        sArr2 = sArr2;
                        strM4220 = strM4220;
                        abstractC22044 = abstractC22044;
                        i11 = i4;
                        c17012 = c17011;
                    }
                    break;
                case -1316193016:
                case 1586684050:
                    abstractC22044 = abstractC22044;
                    strM4220 = strM4220;
                    sArr2 = sArr2;
                    sArr3 = f55579;
                    c = '&';
                    if (C11235.m28309() != 0) {
                        iM3169 = (i9 - C0773.m3169("ۢۜ")) * 33;
                        i10 = ((iM3169 ^ i8) * 17899) ^ (-599008529);
                        i3 = -388238873;
                    } else {
                        iM3169 = (C0773.m3169("ᩳܺ") + i8) * 39;
                        i10 = ((iM3169 ^ i9) * (-20859)) ^ 1053317364;
                        i3 = 811555266;
                    }
                    i4 = iM3169 ^ i3;
                    sArr2 = sArr2;
                    strM4220 = strM4220;
                    abstractC22044 = abstractC22044;
                    i11 = i4;
                    c17012 = c17011;
                    break;
                case -1167733591:
                case 778928228:
                    if (C2834.f9334 <= 0) {
                        sArr2 = sArr2;
                        int iM31615 = (i8 - C0773.m3169("ۘܿ")) * (-81);
                        i10 = ((iM31615 ^ i9) * (-6757)) ^ (-1245916042);
                        sArr2 = sArr2;
                        i11 = iM31615 ^ (-336505989);
                    } else {
                        abstractC22044 = abstractC22044;
                        strM4220 = strM4220;
                        sArr2 = sArr2;
                        iM3169 = (i8 - C0773.m3169("֫᩵")) * (-87);
                        i10 = ((iM3169 ^ i9) * 459) ^ 102864264;
                        i3 = 193560380;
                        i4 = iM3169 ^ i3;
                        sArr2 = sArr2;
                        strM4220 = strM4220;
                        abstractC22044 = abstractC22044;
                        i11 = i4;
                        c17012 = c17011;
                    }
                    break;
                case -1087440047:
                case 926731397:
                    str = strM4220;
                    sArr2 = sArr2;
                    c8458.m22722(C3077.m10047(sArr, i15, i12, i14), strArr);
                    abstractC22044 = c17012.f55580;
                    if (AbstractC0116.m1243() == 0) {
                        iM2761 = (C0619.m2761("ۙ᩺") + i8) * (-119);
                        i = ((iM2761 ^ i9) * (-11563)) ^ 397432479;
                        i2 = -1767026606;
                        sArr2 = sArr2;
                        i11 = iM2761 ^ i2;
                        i10 = i;
                        strM4220 = str;
                    } else {
                        strM4220 = str;
                        int iM31616 = (i9 - C0773.m3169("ܽۜ")) * 115;
                        sArr2 = sArr2;
                        i11 = iM31616 ^ 1752226301;
                        i10 = ((iM31616 ^ i8) * (-24783)) ^ 1418959464;
                        c17012 = c17011;
                    }
                    break;
                case -977783308:
                case -797165880:
                    abstractC22044 = abstractC22044;
                    strM4220 = strM4220;
                    sArr2 = sArr2;
                    if (C13473.f42873 != 0) {
                        iM3169 = (i9 - C0773.m3169("ۢۜ")) * 33;
                        i10 = ((iM3169 ^ i8) * 17899) ^ (-599008529);
                        i3 = -388238873;
                    } else {
                        iM3169 = C0773.m3169("֡ᩳ") ^ i9;
                        i10 = ((iM3169 ^ i8) * 19143) ^ 1142522014;
                        i3 = 32893944;
                    }
                    i4 = iM3169 ^ i3;
                    sArr2 = sArr2;
                    strM4220 = strM4220;
                    abstractC22044 = abstractC22044;
                    i11 = i4;
                    c17012 = c17011;
                    break;
                case -661919754:
                case -257988091:
                    i14 = 8778;
                    iM3169 = C0619.m2761("ܶܽ") ^ i8;
                    i10 = ((iM3169 ^ i9) * (-17185)) ^ (-108709738);
                    i3 = 1431898483;
                    i4 = iM3169 ^ i3;
                    sArr2 = sArr2;
                    strM4220 = strM4220;
                    abstractC22044 = abstractC22044;
                    i11 = i4;
                    c17012 = c17011;
                    break;
                case 493605516:
                case 1465076527:
                    C3033.m9845();
                    abstractC22044 = abstractC22044;
                    strM4220 = strM4220;
                    sArr2 = sArr2;
                    iM31610 = C0619.m2761("᩻᩺") ^ i8;
                    i5 = ((iM31610 ^ i9) * 20993) ^ (-2099357380);
                    i6 = 357501021;
                    i7 = iM31610 ^ i6;
                    sArr2 = sArr2;
                    strM4220 = strM4220;
                    i11 = i7;
                    i10 = i5;
                    abstractC22044 = abstractC22044;
                    break;
                case 506567635:
                case 1560601555:
                    abstractC22044 = abstractC22044;
                    strM4220 = strM4220;
                    sArr2 = sArr2;
                    array = hashSetM35955.toArray(new String[0]);
                    if (AbstractC0641.f2496 >= 0) {
                        iM31610 = C0619.m2761("᩻᩺") ^ i8;
                        i5 = ((iM31610 ^ i9) * 20993) ^ (-2099357380);
                        i6 = 357501021;
                    } else {
                        iM31610 = C0773.m3169("۫ۘ") ^ i9;
                        i5 = ((iM31610 ^ i8) * 30185) ^ (-1785345186);
                        i6 = 2024661277;
                    }
                    i7 = iM31610 ^ i6;
                    sArr2 = sArr2;
                    strM4220 = strM4220;
                    i11 = i7;
                    i10 = i5;
                    abstractC22044 = abstractC22044;
                    break;
                case 507318375:
                case 1451918160:
                    abstractC22044 = abstractC22044;
                    strM4220 = strM4220;
                    sArr2 = sArr2;
                    short s = sArr3[c];
                    int i19 = s * 18794;
                    i13 = s * s;
                    if (C13473.f42873 != 0) {
                        i17 = i19;
                        iM3169 = (i8 - C0773.m3169("֫᩵")) * (-87);
                        i10 = ((iM3169 ^ i9) * 459) ^ 102864264;
                        i3 = 193560380;
                        i4 = iM3169 ^ i3;
                    } else {
                        int iM31617 = C0773.m3169("֡ۢ") ^ i9;
                        int i20 = ((iM31617 ^ i8) * 1451) ^ (-103451723);
                        i4 = iM31617 ^ 143373470;
                        i17 = i19;
                        i10 = i20;
                    }
                    sArr2 = sArr2;
                    strM4220 = strM4220;
                    abstractC22044 = abstractC22044;
                    i11 = i4;
                    c17012 = c17011;
                    break;
                case 598134480:
                case 1136115445:
                    C3033.m9845();
                    if (!C1080.m4050()) {
                        abstractC22044 = abstractC22044;
                        strM4220 = strM4220;
                        sArr2 = sArr2;
                        iM3169 = (i8 - C0773.m3169("֫᩵")) * (-87);
                        i10 = ((iM3169 ^ i9) * 459) ^ 102864264;
                        i3 = 193560380;
                        i4 = iM3169 ^ i3;
                        sArr2 = sArr2;
                        strM4220 = strM4220;
                        abstractC22044 = abstractC22044;
                        i11 = i4;
                        c17012 = c17011;
                    } else {
                        abstractC22044 = abstractC22044;
                        strM4220 = strM4220;
                        sArr2 = sArr2;
                        iM31610 = C0619.m2761("᩻᩺") ^ i8;
                        i5 = ((iM31610 ^ i9) * 20993) ^ (-2099357380);
                        i6 = 357501021;
                        i7 = iM31610 ^ i6;
                        sArr2 = sArr2;
                        strM4220 = strM4220;
                        i11 = i7;
                        i10 = i5;
                        abstractC22044 = abstractC22044;
                    }
                    break;
                case 1019338083:
                case 1546487598:
                    C2310.m7813();
                    C3779.m12264();
                    break;
                case 1381776635:
                case 1972240263:
                    sArr2 = sArr2;
                    strM4220 = C1146.m4220(abstractC22044);
                    abstractC22044 = abstractC22044;
                    strM12266 = C3779.m12266(f55579, 44, 4, i14);
                    if (C3779.f12953 > 0) {
                        int iM31618 = (i9 - C0773.m3169("᩵֫")) * 43;
                        i5 = ((iM31618 ^ i8) * 12437) ^ 1394698632;
                        i7 = iM31618 ^ 888429232;
                        sArr2 = sArr2;
                        i11 = i7;
                        i10 = i5;
                        abstractC22044 = abstractC22044;
                    } else {
                        abstractC22044 = abstractC22044;
                        int iM31619 = (i9 - C0773.m3169("ܽۜ")) * 115;
                        sArr2 = sArr2;
                        i11 = iM31619 ^ 1752226301;
                        i10 = ((iM31619 ^ i8) * (-24783)) ^ 1418959464;
                        c17012 = c17011;
                    }
                    break;
                default:
                    C13473.m33145(c8458, strM12266, strM4220);
                    c8458.m22717(main, c9651);
                    sArr2 = f55579;
                    if (C1343.f4799 == 0) {
                        iM2761 = C0619.m2761("֡ܺ") ^ i8;
                        str = strM4220;
                        i = ((iM2761 ^ i9) * 22143) ^ (-1225432370);
                        i2 = -370458320;
                        sArr2 = sArr2;
                        i11 = iM2761 ^ i2;
                        i10 = i;
                        strM4220 = str;
                    } else {
                        int iM316110 = (i8 - C0773.m3169("ۘܿ")) * (-81);
                        i10 = ((iM316110 ^ i9) * (-6757)) ^ (-1245916042);
                        sArr2 = sArr2;
                        i11 = iM316110 ^ (-336505989);
                    }
                    break;
            }
            return;
        }
    }
}
