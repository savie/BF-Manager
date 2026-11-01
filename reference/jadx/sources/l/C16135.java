package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.TypedValue;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܺ᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I141 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16135 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f52139 = 0;

    /* JADX INFO: renamed from: ۖܺ۠, reason: not valid java name and contains not printable characters */
    private static final short[] f52138 = {7048, -3142, -14040, -4477};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final TypedValue f52140 = new TypedValue();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m38189(Resources.Theme theme, int i) {
        boolean z = false;
        TypedValue typedValue = null;
        int i2 = 0;
        int i3 = 1010940474;
        int i4 = C7105.f23796;
        int i5 = C1189.f5284;
        int iM11306 = ThreadFactoryC3888.m11306("ۤۛ") ^ i5;
        int i6 = ((iM11306 ^ i4) * 32475) ^ 323491019;
        int i7 = 1671629956;
        while (true) {
            i3 = ((((i3 ^ i4) * (-19391)) >> 31) & i6) ^ (iM11306 ^ i7);
            switch (i3) {
                case -2096110166:
                case 1799823003:
                    z = true;
                    if (C1668.f6641 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ۘ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-20961)) ^ (-1585091560);
                        i7 = -1198184691;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶۡ") ^ i4;
                        i6 = ((iM11306 ^ i5) * 26759) ^ (-1117603160);
                        i7 = -2038470266;
                    }
                    break;
                case -1630470285:
                case -1489566447:
                    if (i2 <= 31) {
                        iM11306 = C19806.m45029("ۚۜ") ^ i5;
                        i6 = ((iM11306 ^ i4) * 14893) ^ (-1018669046);
                        i7 = 408083621;
                    } else {
                        iM11306 = (i5 - C19806.m45029("ܶۜ")) * (-47);
                        i6 = ((iM11306 ^ i4) * 13517) ^ (-1132083734);
                        i7 = 1090320873;
                    }
                    break;
                case -1570898456:
                case 213359287:
                    if (C3722.f13525 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ۘ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-20961)) ^ (-1585091560);
                        i7 = -1198184691;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚܶ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-2377)) ^ (-1511528003);
                        i7 = -1042256717;
                    }
                    break;
                case -1535754370:
                case 892175778:
                    C2704.m8255();
                    return null;
                case -1459556591:
                case 861178698:
                    if (C1460.f5948 >= 0) {
                        iM11306 = C19806.m45029("۠᩹") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-10633)) ^ (-933069583);
                        i7 = 869735857;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("֨ᩴ")) * (-115);
                        i6 = ((iM11306 ^ i5) * (-23385)) ^ (-2118902595);
                        i7 = 998882002;
                    }
                    break;
                case -1318158392:
                case 1041446218:
                    if (!C7105.m18985()) {
                        iM11306 = C19806.m45029("۠᩹") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-10633)) ^ (-933069583);
                        i7 = 869735857;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛܺ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-729)) ^ 191789676;
                        i7 = 900609020;
                    }
                    break;
                case -1242962710:
                case -828616352:
                    i2 = typedValue.type;
                    if (i2 >= 28) {
                        iM11306 = C19806.m45029("ܶ᩺") ^ i4;
                        i6 = ((iM11306 ^ i5) * 13721) ^ 1968899304;
                        i7 = 1421103192;
                    } else {
                        iM11306 = (i5 - C19806.m45029("ܶۜ")) * (-47);
                        i6 = ((iM11306 ^ i4) * 13517) ^ (-1132083734);
                        i7 = 1090320873;
                    }
                    break;
                case -1222067629:
                case 1043158075:
                    return C16631.m39102(theme.getResources(), typedValue.resourceId, theme);
                case -1209245791:
                case 1234299895:
                    if (C1461.f5957 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛܺ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-729)) ^ 191789676;
                        i7 = 900609020;
                    } else {
                        iM11306 = (C19806.m45029("ۧ֨") + i5) * (-7);
                        i6 = ((iM11306 ^ i4) * 15509) ^ (-831021504);
                        i7 = 1829044968;
                    }
                    break;
                case -1019233068:
                case -572496391:
                    if (C1460.f5948 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛܺ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-729)) ^ 191789676;
                        i7 = 900609020;
                    } else {
                        iM11306 = (C19806.m45029("ۖܽ") + i4) * (-103);
                        i6 = ((iM11306 ^ i5) * (-17789)) ^ (-1749784157);
                        i7 = -543569611;
                    }
                    break;
                case -658265483:
                case 1322271827:
                    if (RunnableC1564.f6300) {
                        iM11306 = C19806.m45029("۠᩹") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-10633)) ^ (-933069583);
                        i7 = 869735857;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ۠") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-8319)) ^ (-119860196);
                        i7 = 1125313954;
                    }
                    break;
                case -591599120:
                case 1746189782:
                    return ColorStateList.valueOf(typedValue.data);
                case -3490452:
                case 3991175:
                    C2124.m6673();
                    if (!C0526.f2219) {
                        iM11306 = (i4 - C19806.m45029("ܿ۫")) * (-61);
                        i6 = ((iM11306 ^ i5) * 17873) ^ 1279377220;
                        i7 = 1647894359;
                    } else {
                        iM11306 = C19806.m45029("۠᩹") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-10633)) ^ (-933069583);
                        i7 = 869735857;
                    }
                    break;
                case 179561689:
                case 1276893890:
                    typedValue = f52140;
                    theme.resolveAttribute(i, typedValue, z);
                    if (typedValue.resourceId != 0) {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("֨۠")) * 63;
                        i6 = ((iM11306 ^ i4) * (-4983)) ^ (-2030939968);
                        i7 = 370294804;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢܳ") + i4) * 19;
                        i6 = ((iM11306 ^ i5) * (-22771)) ^ (-1450181065);
                        i7 = -1335142998;
                    }
                    break;
                case 193257984:
                case 369459027:
                    if (C0817.f3443) {
                        iM11306 = C19806.m45029("᩵ۡ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-20701)) ^ (-1604741797);
                        i7 = -1381636924;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ܿ۫")) * (-61);
                        i6 = ((iM11306 ^ i5) * 17873) ^ 1279377220;
                        i7 = 1647894359;
                    }
                    break;
                case 270718682:
                case 333802178:
                    if (C1977.f7413 <= 0) {
                        iM11306 = (C19806.m45029("ܺܶ") ^ i4) * (-35);
                        i6 = ((iM11306 ^ i5) * 25695) ^ (-425840536);
                        i7 = -447358801;
                    } else {
                        iM11306 = C19806.m45029("֨ۡ") ^ i5;
                        i6 = ((iM11306 ^ i4) * 3043) ^ (-836973232);
                        i7 = 93670607;
                    }
                    break;
                case 601023570:
                case 946671420:
                    throw new RuntimeException();
                case 784455765:
                case 968372818:
                    if (C2124.f7782 <= 0) {
                        iM11306 = (i4 - C19806.m45029("ܿ۫")) * (-61);
                        i6 = ((iM11306 ^ i5) * 17873) ^ 1279377220;
                        i7 = 1647894359;
                    } else {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ܳ᩶")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((iM11306 ^ i4) * (-9513)) ^ (-1505590887);
                        i7 = -133341369;
                    }
                    break;
                case 1032206082:
                case 1976778951:
                    if (C1398.m4895() <= 0) {
                        iM11306 = C19806.m45029("۠᩹") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-10633)) ^ (-933069583);
                        i7 = 869735857;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰ᩵") ^ i4) * 59;
                        i6 = ((iM11306 ^ i5) * 26249) ^ 1925195144;
                        i7 = 124666246;
                    }
                    break;
                case 1133594649:
                case 2051746857:
                    C3722.m10894();
                    iM11306 = (i4 - C19806.m45029("ܿ۫")) * (-61);
                    i6 = ((iM11306 ^ i5) * 17873) ^ 1279377220;
                    i7 = 1647894359;
                    break;
                default:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = (C19806.m45029("ܺܶ") ^ i4) * (-35);
                        i6 = ((iM11306 ^ i5) * 25695) ^ (-425840536);
                        i7 = -447358801;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ܿ۫")) * (-61);
                        i6 = ((iM11306 ^ i5) * 17873) ^ 1279377220;
                        i7 = 1647894359;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m38192(Resources.Theme theme, int i) {
        boolean z = false;
        int i2 = 218212516;
        int i3 = C1875.f7103;
        int i4 = C1460.f5948;
        int iM45029 = (C19806.m45029("ܺܺ") ^ i3) * 27;
        int i5 = ((iM45029 ^ i4) * (-27539)) ^ (-272016578);
        int i6 = 424374620;
        while (true) {
            i2 = ((((i2 ^ i4) * 12267) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -2144036412:
                case -1447254574:
                    z = true;
                    if (C10634.f36300 >= 0) {
                        iM45029 = (C19806.m45029("ܶ᩵") ^ i4) * 39;
                        i5 = ((iM45029 ^ i3) * 24491) ^ 1974525075;
                        i6 = 728289271;
                    } else {
                        iM45029 = (C19806.m45029("᩸ۗ") ^ i4) * 53;
                        i5 = ((iM45029 ^ i3) * 28587) ^ (-1800638201);
                        i6 = -1470632104;
                    }
                    break;
                case -1864930971:
                case 1661161298:
                    TypedValue typedValue = f52140;
                    theme.resolveAttribute(i, typedValue, z);
                    return typedValue.resourceId;
                case -1811668760:
                case -633789283:
                    if (C1189.m4368() > 0) {
                        iM45029 = C19806.m45029("֡᩶") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-16877)) ^ 1416407533;
                        i6 = -1155762316;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿܽ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-14943)) ^ (-1649079672);
                        i6 = -760247890;
                    }
                    break;
                case -1750691031:
                case 2120259755:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = C19806.m45029("֡᩶") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-16877)) ^ 1416407533;
                        i6 = -1155762316;
                    } else {
                        iM45029 = C19806.m45029("ۢܰ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-27)) ^ (-110322960);
                        i6 = -1873666770;
                    }
                    break;
                case -1144451153:
                case -1123623304:
                    if (C2642.m8171() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿۘ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 4123) ^ 1172117314;
                        i6 = -1846587629;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۟֫") ^ i3) * (-77);
                        i5 = ((iM45029 ^ i4) * 3091) ^ 980247881;
                        i6 = -1036905609;
                    }
                    break;
                case -725790032:
                case 966688221:
                    C1398.m4895();
                    return 0;
                case -710699080:
                case 1759034792:
                    if (C0216.f1393 != 0) {
                        iM45029 = C19806.m45029("᩶۟") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-15811)) ^ 793421510;
                        i6 = 188667904;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ᩳۜ")) * 65;
                        i5 = ((iM45029 ^ i4) * 30881) ^ 1798995461;
                        i6 = -1962080044;
                    }
                    break;
                case -686840413:
                case 1913073288:
                    if (C2124.f7782 <= 0) {
                        iM45029 = (C19806.m45029("ܶ᩵") ^ i4) * 39;
                        i5 = ((iM45029 ^ i3) * 24491) ^ 1974525075;
                        i6 = 728289271;
                    } else {
                        iM45029 = (C19806.m45029("ۜۨ") ^ i4) * q.h;
                        i5 = ((iM45029 ^ i3) * (-25143)) ^ (-236540377);
                        i6 = 909426682;
                    }
                    break;
                case -646665458:
                case 1231668254:
                    if (C0050.f912 <= 0) {
                        iM45029 = (C19806.m45029("ܶ᩵") ^ i4) * 39;
                        i5 = ((iM45029 ^ i3) * 24491) ^ 1974525075;
                        i6 = 728289271;
                    } else {
                        iM45029 = C19806.m45029("᩷ܶ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-31211)) ^ (-1055645405);
                        i6 = -868901761;
                    }
                    break;
                case -566923240:
                case 1140303505:
                    if (C2332.m7079() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿܽ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-14943)) ^ (-1649079672);
                        i6 = -760247890;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻֡") ^ i4;
                        i5 = ((iM45029 ^ i3) * 6571) ^ (-1265274872);
                        i6 = 1494442312;
                    }
                    break;
                case -515452761:
                case 1034492208:
                    if (RunnableC1895.f7152) {
                        iM45029 = C19806.m45029("֫ܳ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 24023) ^ 420673687;
                        i6 = 1940955255;
                    } else {
                        iM45029 = C19806.m45029("֡᩶") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-16877)) ^ 1416407533;
                        i6 = -1155762316;
                    }
                    break;
                case -455841100:
                case 2070139405:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = C19806.m45029("᩶۟") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-15811)) ^ 793421510;
                        i6 = 188667904;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ᩶") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-14645)) ^ (-2062068817);
                        i6 = -1384138514;
                    }
                    break;
                case -282368353:
                case 2041243827:
                    C0817.m3399();
                    C2788.m8472();
                    iM45029 = ThreadFactoryC3888.m11306("ܿܽ") ^ i3;
                    i5 = ((iM45029 ^ i4) * (-14943)) ^ (-1649079672);
                    i6 = -760247890;
                    break;
                case 625133242:
                case 654816333:
                    if (C2124.f7782 <= 0) {
                        iM45029 = C19806.m45029("᩶۟") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-15811)) ^ 793421510;
                        i6 = 188667904;
                    } else {
                        iM45029 = C19806.m45029("᩸֫") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-7605)) ^ (-1101829839);
                        i6 = -1463447793;
                    }
                    break;
                case 792508883:
                case 2061417415:
                    C7105.m18985();
                    if (C0050.f912 <= 0) {
                        iM45029 = C19806.m45029("᩶۟") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-15811)) ^ 793421510;
                        i6 = 188667904;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿܽ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-14943)) ^ (-1649079672);
                        i6 = -760247890;
                    }
                    break;
                default:
                    if (C10634.f36300 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿۘ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 4123) ^ 1172117314;
                        i6 = -1846587629;
                    } else {
                        iM45029 = C19806.m45029("᩶۟") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-15811)) ^ 793421510;
                        i6 = 188667904;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01a4 A[PHI: r1 r9
      0x01a4: PHI (r1v5 int) = (r1v2 int), (r1v3 int), (r1v2 int) binds: [B:50:0x01a2, B:27:0x00c3, B:6:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x01a4: PHI (r9v5 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:50:0x01a2, B:27:0x00c3, B:6:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01f9 A[PHI: r5 r6 r13
      0x01f9: PHI (r5v4 short) = (r5v3 short), (r5v2 short) binds: [B:58:0x01f7, B:35:0x0109] A[DONT_GENERATE, DONT_INLINE]
      0x01f9: PHI (r6v4 short) = (r6v3 short), (r6v2 short) binds: [B:58:0x01f7, B:35:0x0109] A[DONT_GENERATE, DONT_INLINE]
      0x01f9: PHI (r13v3 int) = (r13v2 int), (r13v4 int) binds: [B:58:0x01f7, B:35:0x0109] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x024b  */
    /* JADX WARN: Code duplicated, block: B:71:0x027d A[PHI: r2 r4 r7 r8 r11 r12 r18
      0x027d: PHI (r2v4 int) = (r2v2 int), (r2v2 int), (r2v2 int), (r2v2 int), (r2v3 int), (r2v2 int), (r2v2 int) binds: [B:70:0x027b, B:62:0x022b, B:54:0x01d6, B:39:0x0129, B:31:0x00ea, B:15:0x0075, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x027d: PHI (r4v4 char) = (r4v2 char), (r4v3 char), (r4v2 char), (r4v2 char), (r4v2 char), (r4v2 char), (r4v2 char) binds: [B:70:0x027b, B:62:0x022b, B:54:0x01d6, B:39:0x0129, B:31:0x00ea, B:15:0x0075, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x027d: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:70:0x027b, B:62:0x022b, B:54:0x01d6, B:39:0x0129, B:31:0x00ea, B:15:0x0075, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x027d: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:70:0x027b, B:62:0x022b, B:54:0x01d6, B:39:0x0129, B:31:0x00ea, B:15:0x0075, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x027d: PHI (r11v4 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:70:0x027b, B:62:0x022b, B:54:0x01d6, B:39:0x0129, B:31:0x00ea, B:15:0x0075, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x027d: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:70:0x027b, B:62:0x022b, B:54:0x01d6, B:39:0x0129, B:31:0x00ea, B:15:0x0075, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x027d: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:70:0x027b, B:62:0x022b, B:54:0x01d6, B:39:0x0129, B:31:0x00ea, B:15:0x0075, B:13:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m38190(Context context) {
        int iM45029;
        int i;
        int i2;
        int i3 = ThreadFactoryC3888.f14547;
        int i4 = C7105.f23796;
        int iM450210 = C19806.m45029("᩸ܿ") ^ i3;
        int i5 = ((iM450210 ^ i4) * 20531) ^ (-1992894814);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM450210 ^ 1360927138;
        int i7 = 0;
        int iM450211 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -638024343;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i4) * 18187) >> 31));
            switch (i14) {
                case -1781181294:
                case -1686188534:
                    s = sArr[c];
                    s2 = 15724;
                    if (C1025.f4800 >= 0) {
                        iM45029 = (i4 - C19806.m45029("᩶۬")) * 75;
                        i = ((iM45029 ^ i3) * (-15201)) ^ (-1812004987);
                        i2 = -1469917594;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۫۫") ^ i3) * 119;
                        i = ((iM45029 ^ i4) * 15549) ^ 2067685286;
                        i2 = 2119491063;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1737808384:
                case 958616841:
                    return false;
                case -1594848359:
                case -1038982664:
                    i7 = iM450211 ^ 2124415178;
                    if (C2642.f10294 <= 0) {
                        iM45029 = (C19806.m45029("᩻ܰ") ^ i3) * (-55);
                        i = ((iM45029 ^ i4) * 24287) ^ 1981594851;
                        i2 = 144643687;
                    } else {
                        iM45029 = (C19806.m45029("۠֫") + i3) * 123;
                        i = ((iM45029 ^ i4) * (-19459)) ^ 89206552;
                        i2 = -2090473065;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1254383238:
                case 245715338:
                    C1066.m4023();
                    return false;
                case -1231466030:
                case 1327964471:
                    if (C7105.m18985()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۜ") ^ i3;
                        i = ((iM45029 ^ i4) * 2453) ^ 1269549105;
                        i2 = 34935779;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۫۬") ^ i3) * 91;
                        i = ((iM45029 ^ i4) * (-1691)) ^ (-1111257632);
                        i2 = -185310051;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -828665611:
                case -42782838:
                    i11 = 40769;
                    iM45029 = (C19806.m45029("۟ܺ") ^ i3) * (-27);
                    i = ((iM45029 ^ i4) * (-23481)) ^ 367808585;
                    i2 = 985971857;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -749728535:
                case -392091280:
                    i13 = 3;
                    if (C3660.f13403 >= 0) {
                        iM45029 = (i4 - C19806.m45029("᩶۬")) * 75;
                        i = ((iM45029 ^ i3) * (-15201)) ^ (-1812004987);
                        i2 = -1469917594;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ۢ") + i4) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM45029 ^ i3) * 32051) ^ 78999337;
                        i2 = 1894171512;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -742764682:
                case 1008132347:
                    i10 = 61811044;
                    if (RunnableC1895.f7152) {
                        iM45029 = C19806.m45029("ܳۜ") ^ i4;
                        i = ((iM45029 ^ i3) * 5971) ^ (-422685785);
                        i2 = 1018809816;
                    } else {
                        iM45029 = (C19806.m45029("᩻ܰ") ^ i3) * (-55);
                        i = ((iM45029 ^ i4) * 24287) ^ 1981594851;
                        i2 = 144643687;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -726011051:
                case -353846313:
                    return true;
                case -650028086:
                case 1306248623:
                    sArr2 = f52138;
                    i12 = 1;
                    if (C1460.f5948 >= 0) {
                        iM45029 = C19806.m45029("ۨ۠") ^ i3;
                        i = ((iM45029 ^ i4) * (-1969)) ^ 1435854573;
                        i2 = -480708730;
                    } else {
                        iM45029 = (C19806.m45029("ۤᩳ") + i4) * (-83);
                        i = ((iM45029 ^ i3) * 30079) ^ (-156331641);
                        i2 = -1300594673;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -502487961:
                case -254167011:
                    iM450211 = C19806.m45029(RunnableC1564.m5344(sArr2, i12, i13, i11));
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM45029 = C19806.m45029("ۨ۠") ^ i3;
                        i = ((iM45029 ^ i4) * (-1969)) ^ 1435854573;
                        i2 = -480708730;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۨܿ")) * 47;
                        i = ((iM45029 ^ i4) * 9709) ^ 265817629;
                        i2 = 504353339;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -463950263:
                case 279030991:
                    i11 = 54151;
                    iM45029 = (C19806.m45029("۟ܺ") ^ i3) * (-27);
                    i = ((iM45029 ^ i4) * (-23481)) ^ 367808585;
                    i2 = 985971857;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -240373496:
                case 22644450:
                    if (C0050.m942(context.getTheme(), i7) == 0) {
                        iM45029 = C19806.m45029("᩶ᩳ") ^ i4;
                        i = ((iM45029 ^ i3) * (-16453)) ^ (-267515376);
                        i2 = 546283589;
                    } else {
                        iM45029 = (C19806.m45029("ᩳۗ") ^ i4) * (-5);
                        i = ((iM45029 ^ i3) * 24649) ^ (-1813259748);
                        i2 = -1819150743;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -153256194:
                case 745191775:
                    if (i8 - (i9 + i10) > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶֡") + i3) * 91;
                        i = ((iM45029 ^ i4) * 3673) ^ 378774860;
                        i2 = 1390349244;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۖ֫")) * 49;
                        i = ((iM45029 ^ i3) * 17899) ^ 1546002645;
                        i2 = 1938897039;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 125741153:
                case 315303367:
                    sArr = f52138;
                    if (C1066.m4023() <= 0) {
                        iM45029 = C19806.m45029("ۨ۠") ^ i3;
                        i = ((iM45029 ^ i4) * (-1969)) ^ 1435854573;
                        i2 = -480708730;
                    } else {
                        iM45029 = C19806.m45029("֫ۚ") ^ i4;
                        i = ((iM45029 ^ i3) * 28575) ^ (-422131655);
                        i2 = -2059156841;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 283218853:
                case 1417036422:
                    C1066.m4023();
                    C1668.m5583();
                    iM45029 = C19806.m45029("ۨ۠") ^ i3;
                    i = ((iM45029 ^ i4) * (-1969)) ^ 1435854573;
                    i2 = -480708730;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1037104754:
                case 1101296762:
                    c = 0;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = C19806.m45029("ۨ۠") ^ i3;
                        i = ((iM45029 ^ i4) * (-1969)) ^ 1435854573;
                        i2 = -480708730;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("᩵᩸")) * (-37);
                        i = ((iM45029 ^ i3) * (-13869)) ^ (-2083833384);
                        i2 = 612680654;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1318742807:
                case 2041050174:
                    if (C3660.f13403 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۜ") ^ i3;
                        i = ((iM45029 ^ i4) * 2453) ^ 1269549105;
                        i2 = 34935779;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("᩹֨")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM45029 ^ i3) * 13649) ^ 149394107;
                        i2 = 699573756;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1450787467:
                case 1990381162:
                    i8 = s * s2;
                    i9 = s * s;
                    if (C0817.f3443) {
                        iM45029 = (C19806.m45029("᩺ۛ") ^ i3) * (-121);
                        i = ((iM45029 ^ i4) * 32161) ^ (-1680876511);
                        i2 = -637323;
                    } else {
                        iM45029 = C19806.m45029("ۨ۠") ^ i3;
                        i = ((iM45029 ^ i4) * (-1969)) ^ 1435854573;
                        i2 = -480708730;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1473506716:
                case 1680493187:
                    C1148.m4232();
                    if (C1668.f6641 < 0) {
                        iM45029 = C19806.m45029("ۨ۠") ^ i3;
                        i = ((iM45029 ^ i4) * (-1969)) ^ 1435854573;
                        i2 = -480708730;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۜ") ^ i3;
                        i = ((iM45029 ^ i4) * 2453) ^ 1269549105;
                        i2 = 34935779;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    if (CallableC1627.f6528) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۜ") ^ i3;
                        i = ((iM45029 ^ i4) * 2453) ^ 1269549105;
                        i2 = 34935779;
                    } else {
                        iM45029 = (C19806.m45029("᩻ܰ") ^ i3) * (-55);
                        i = ((iM45029 ^ i4) * 24287) ^ 1981594851;
                        i2 = 144643687;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m38191(Resources.Theme theme) {
        int iM45029;
        int i;
        int i2 = 0;
        TypedValue typedValue = null;
        boolean z = false;
        boolean z2 = false;
        int i3 = -1409516492;
        int i4 = C1668.f6641;
        int i5 = C10634.f36300;
        int iM11306 = (ThreadFactoryC3888.m11306("ܰܰ") ^ i4) * (-89);
        int i6 = ((iM11306 ^ i5) * 25349) ^ (-558329227);
        int i7 = 1688396917;
        while (true) {
            int i8 = iM11306 ^ i7;
            while (true) {
                i3 = ((((i3 ^ i5) * 28475) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2110071867:
                    case -367610606:
                        if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                            iM11306 = C19806.m45029("ᩳܽ") ^ i5;
                            i6 = ((iM11306 ^ i4) * 23217) ^ 312831542;
                            i7 = -1774570474;
                            break;
                        }
                        iM11306 = C19806.m45029("ۤ۫") ^ i5;
                        i6 = ((iM11306 ^ i4) * 25449) ^ 2096916460;
                        i7 = -2039347788;
                        break;
                    case -1903174218:
                    case -756959803:
                    case 1285261380:
                    case 2013827141:
                        return z2;
                    case -1831145911:
                    case -578364362:
                        if (C1025.f4800 < 0) {
                            iM11306 = (i5 - C19806.m45029("ۚۜ")) * 17;
                            i6 = ((iM11306 ^ i4) * 5991) ^ 1779900600;
                            i7 = -1168734248;
                            break;
                        }
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("֨ܳ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((iM11306 ^ i4) * (-20935)) ^ (-22741872);
                        i7 = -1294590478;
                        break;
                    case -1338380257:
                    case 10630976:
                        typedValue = f52140;
                        if (C0050.m946() > 0) {
                            iM11306 = C19806.m45029("᩺ۘ") ^ i5;
                            i6 = ((iM11306 ^ i4) * 30993) ^ 1051609694;
                            i7 = -1673407379;
                            break;
                        }
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("֨ܳ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((iM11306 ^ i4) * (-20935)) ^ (-22741872);
                        i7 = -1294590478;
                        break;
                        break;
                    case -1281181855:
                    case -555737608:
                        if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                            iM11306 = ThreadFactoryC3888.m11306("᩷ᩳ") ^ i4;
                            i6 = ((iM11306 ^ i5) * 11513) ^ (-395159750);
                            i7 = -928038213;
                            break;
                        }
                        iM11306 = (ThreadFactoryC3888.m11306("۫ۚ") + i5) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM11306 ^ i4) * (-20759)) ^ (-2142172902);
                        i7 = -1133940146;
                        break;
                    case -1152326554:
                    case -369312981:
                        return z;
                    case -1119077111:
                    case 577152897:
                        C3722.m10894();
                        iM11306 = C19806.m45029("ۤ۫") ^ i5;
                        i6 = ((iM11306 ^ i4) * 25449) ^ 2096916460;
                        i7 = -2039347788;
                        break;
                        break;
                    case -1002658356:
                    case 591795096:
                        z = true;
                        if (theme.resolveAttribute(i2, typedValue, true)) {
                            iM45029 = C19806.m45029("ۢ۫") ^ i5;
                            i6 = ((iM45029 ^ i4) * (-16153)) ^ 348484773;
                            i = 1688722294;
                        } else {
                            iM45029 = C19806.m45029("᩷ۨ") ^ i4;
                            i6 = ((iM45029 ^ i5) * (-31421)) ^ (-1226936099);
                            i = 435554936;
                        }
                        i8 = iM45029 ^ i;
                        z2 = false;
                        break;
                    case -999293665:
                    case 691925847:
                        C3535.m10431();
                        if (!RunnableC1564.f6300) {
                            iM11306 = ThreadFactoryC3888.m11306("ۡ֫") ^ i4;
                            i6 = ((iM11306 ^ i5) * 18877) ^ (-1843962706);
                            i7 = -1256418828;
                            break;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("᩷ᩳ") ^ i4;
                        i6 = ((iM11306 ^ i5) * 11513) ^ (-395159750);
                        i7 = -928038213;
                        break;
                        break;
                    case -610010284:
                    case 408809850:
                        if (typedValue.data == 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ܽܺ") ^ i4;
                            i6 = ((iM11306 ^ i5) * (-31599)) ^ (-621124615);
                            i7 = -277701817;
                            break;
                        }
                        iM11306 = C19806.m45029("ۗۢ") ^ i5;
                        i6 = ((iM11306 ^ i4) * 14007) ^ (-471246492);
                        i7 = 1459133867;
                        break;
                    case -526903649:
                    case 964044120:
                        MenuItemOnMenuItemClickListenerC3244.m9701();
                        ThreadFactoryC3888.m11300();
                        return false;
                    case -224464922:
                    case 541896877:
                        if (!RunnableC1564.f6300) {
                            iM11306 = (i4 - C19806.m45029("ۚ᩶")) * (-93);
                            i6 = ((iM11306 ^ i5) * 19607) ^ (-1480517513);
                            i7 = 642698705;
                            break;
                        }
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("֨ܳ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((iM11306 ^ i4) * (-20935)) ^ (-22741872);
                        i7 = -1294590478;
                        break;
                        break;
                    case 28970664:
                    case 1729653949:
                        if (!C0817.m3399()) {
                            iM11306 = ThreadFactoryC3888.m11306("ۡ֫") ^ i4;
                            i6 = ((iM11306 ^ i5) * 18877) ^ (-1843962706);
                            i7 = -1256418828;
                            break;
                            break;
                        }
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("᩸ܺ")) * (-23);
                        i6 = ((iM11306 ^ i5) * 29171) ^ 1426720577;
                        i7 = 1148431496;
                        break;
                    case 170350577:
                    case 598991177:
                        if (C0629.f2722 > 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("ܰۡ") ^ i5) * (-71);
                            i6 = ((iM11306 ^ i4) * (-31827)) ^ (-1772894428);
                            i7 = 73849378;
                            break;
                        }
                        iM11306 = C19806.m45029("ۤ۫") ^ i5;
                        i6 = ((iM11306 ^ i4) * 25449) ^ 2096916460;
                        i7 = -2039347788;
                        break;
                        break;
                    case 353416289:
                    case 1737336467:
                        if (C0629.f2722 > 0) {
                            iM11306 = C19806.m45029("۟ۤ") ^ i4;
                            i6 = ((iM11306 ^ i5) * 4023) ^ (-804065416);
                            i7 = -1747451846;
                            break;
                        }
                        iM11306 = C19806.m45029("ۤ۫") ^ i5;
                        i6 = ((iM11306 ^ i4) * 25449) ^ 2096916460;
                        i7 = -2039347788;
                        break;
                        break;
                    case 842050252:
                    case 999328931:
                        i2 = R.attr.windowLightStatusBar;
                        if (C2704.m8255() > 0) {
                            iM11306 = C19806.m45029("ܿۢ") ^ i4;
                            i6 = ((iM11306 ^ i5) * 5907) ^ 1214044493;
                            i7 = -241103205;
                            break;
                        }
                        iM11306 = C19806.m45029("ᩳܽ") ^ i5;
                        i6 = ((iM11306 ^ i4) * 23217) ^ 312831542;
                        i7 = -1774570474;
                        break;
                        break;
                    case 1352689683:
                    case 1876956648:
                        if (C1977.f7413 > 0) {
                            iM11306 = (C19806.m45029("ۨۗ") + i4) * (-97);
                            i6 = ((iM11306 ^ i5) * 13125) ^ (-396242558);
                            i7 = 1201569028;
                            break;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("᩷ᩳ") ^ i4;
                        i6 = ((iM11306 ^ i5) * 11513) ^ (-395159750);
                        i7 = -928038213;
                        break;
                        break;
                    case 1505477418:
                    case 1607917816:
                        C1189.m4368();
                        if (ThreadFactoryC3888.f14547 > 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۡ֫") ^ i4;
                            i6 = ((iM11306 ^ i5) * 18877) ^ (-1843962706);
                            i7 = -1256418828;
                            break;
                            break;
                        }
                        iM11306 = C19806.m45029("ۤ۫") ^ i5;
                        i6 = ((iM11306 ^ i4) * 25449) ^ 2096916460;
                        i7 = -2039347788;
                        break;
                        break;
                    default:
                        if (C1398.f5802 > 0) {
                            iM11306 = C19806.m45029("۠֨") ^ i5;
                            i6 = ((iM11306 ^ i4) * (-5123)) ^ (-1222490124);
                            i7 = -1255968430;
                            break;
                        }
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("֨ܳ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((iM11306 ^ i4) * (-20935)) ^ (-22741872);
                        i7 = -1294590478;
                        break;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m38193(Resources.Theme theme, int i) {
        boolean z = false;
        int i2 = 1042277409;
        int i3 = AbstractC0464.f2088;
        int i4 = C2477.f9839;
        int iM11306 = (ThreadFactoryC3888.m11306("ۢۜ") ^ i4) * 75;
        int i5 = ((iM11306 ^ i3) * (-9631)) ^ (-2134557934);
        int i6 = -1048241567;
        while (true) {
            i2 = ((((i2 ^ i3) * 27257) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -2032344673:
                case 1725473872:
                    if (C2477.f9839 <= 0) {
                        iM11306 = C19806.m45029("ۗ֨") ^ i4;
                        i5 = ((iM11306 ^ i3) * 18575) ^ 928407107;
                        i6 = -1356646722;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨܺ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-29467)) ^ 1195783673;
                        i6 = 513919809;
                    }
                    break;
                case -1963711948:
                case 522061437:
                    if (RunnableC0195.m1431()) {
                        iM11306 = (C19806.m45029("۫۠") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM11306 ^ i4) * 6393) ^ (-711948947);
                        i6 = 638534284;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠ۗ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-9451)) ^ 119955427;
                        i6 = -1951398513;
                    }
                    break;
                case -1714222881:
                case 1301663989:
                    ThreadFactoryC3888.m11300();
                    iM11306 = C19806.m45029("ۗ֨") ^ i4;
                    i5 = ((iM11306 ^ i3) * 18575) ^ 928407107;
                    i6 = -1356646722;
                    break;
                case -1126480285:
                case -75376490:
                    C1148.m4232();
                    if (C1377.f5749) {
                        iM11306 = C19806.m45029("ۛ᩵") ^ i4;
                        i5 = ((iM11306 ^ i3) * 12929) ^ (-1884416629);
                        i6 = 751763482;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۘ᩻")) * 71;
                        i5 = ((iM11306 ^ i4) * (-27969)) ^ (-2028989168);
                        i6 = -1179214042;
                    }
                    break;
                case -993044109:
                case 1634361695:
                    if (C1419.f5860 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۠ۗ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-9451)) ^ 119955427;
                        i6 = -1951398513;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫᩶") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-31115)) ^ (-992503035);
                        i6 = 1412824265;
                    }
                    break;
                case -552408607:
                case 331197610:
                    RunnableC0195.m1431();
                    return 0;
                case -44953007:
                case 1437711224:
                    if (RunnableC1895.f7152) {
                        iM11306 = (C19806.m45029("ᩳܺ") + i4) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM11306 ^ i3) * (-3779)) ^ (-111556563);
                        i6 = 1373728641;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠ۗ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-9451)) ^ 119955427;
                        i6 = -1951398513;
                    }
                    break;
                case 118748723:
                case 535562133:
                    TypedValue typedValue = f52140;
                    theme.resolveAttribute(i, typedValue, z);
                    return typedValue.data;
                case 175402504:
                case 1448221170:
                    if (C0962.f3784) {
                        iM11306 = C19806.m45029("ۡۡ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 20403) ^ 621156545;
                        i6 = -1045339176;
                    } else {
                        iM11306 = (C19806.m45029("ۜ᩷") + i3) * 63;
                        i5 = ((iM11306 ^ i4) * 21091) ^ (-327742372);
                        i6 = -1578136735;
                    }
                    break;
                case 369318936:
                case 377678707:
                    z = true;
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۠ۗ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-9451)) ^ 119955427;
                        i6 = -1951398513;
                    } else {
                        iM11306 = C19806.m45029("᩵᩷") ^ i3;
                        i5 = ((iM11306 ^ i4) * 15427) ^ (-1846535001);
                        i6 = 1601310646;
                    }
                    break;
                case 384605424:
                case 624722699:
                    if (C0797.f3386) {
                        iM11306 = C19806.m45029("ۡۡ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 20403) ^ 621156545;
                        i6 = -1045339176;
                    } else {
                        iM11306 = (i4 - C19806.m45029("᩻ۚ")) * 49;
                        i5 = ((iM11306 ^ i3) * (-6983)) ^ (-8076954);
                        i6 = 384401016;
                    }
                    break;
                case 984089530:
                case 1100949924:
                    C19806.m45024();
                    if (C1937.f7317 < 0) {
                        iM11306 = C19806.m45029("ۡۡ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 20403) ^ 621156545;
                        i6 = -1045339176;
                    } else {
                        iM11306 = C19806.m45029("ۗ֨") ^ i4;
                        i5 = ((iM11306 ^ i3) * 18575) ^ 928407107;
                        i6 = -1356646722;
                    }
                    break;
                case 1237979958:
                case 1560209422:
                    RunnableC3388.m10064();
                    if (C2788.f10625 < 0) {
                        iM11306 = (i3 - C19806.m45029("ۘ᩻")) * 71;
                        i5 = ((iM11306 ^ i4) * (-27969)) ^ (-2028989168);
                        i6 = -1179214042;
                    } else {
                        iM11306 = C19806.m45029("ۗ֨") ^ i4;
                        i5 = ((iM11306 ^ i3) * 18575) ^ 928407107;
                        i6 = -1356646722;
                    }
                    break;
                case 1824509859:
                case 1854935293:
                    if (C1668.f6641 >= 0) {
                        iM11306 = C19806.m45029("ۗ֨") ^ i4;
                        i5 = ((iM11306 ^ i3) * 18575) ^ 928407107;
                        i6 = -1356646722;
                    } else {
                        iM11306 = C19806.m45029("ܳۤ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 22311) ^ 1146934803;
                        i6 = 1317981638;
                    }
                    break;
                case 1848286599:
                case 2128669945:
                    if (C0817.m3399()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨۜ") ^ i4) * (-33);
                        i5 = ((iM11306 ^ i3) * 8637) ^ (-1521305913);
                        i6 = -2082042706;
                    } else {
                        iM11306 = C19806.m45029("ۡۡ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 20403) ^ 621156545;
                        i6 = -1045339176;
                    }
                    break;
                default:
                    if (C1668.f6641 >= 0) {
                        iM11306 = C19806.m45029("ۗ֨") ^ i4;
                        i5 = ((iM11306 ^ i3) * 18575) ^ 928407107;
                        i6 = -1356646722;
                    } else {
                        iM11306 = (C19806.m45029("ܰۙ") ^ i4) * (-81);
                        i5 = ((iM11306 ^ i3) * 12181) ^ 174433647;
                        i6 = 2103772376;
                    }
                    break;
            }
        }
    }
}
