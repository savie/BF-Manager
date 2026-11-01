package l;

import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.translation.TranslationEngine;
import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩹ۗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7HQ */
/* JADX INFO: loaded from: classes.dex */
public final class C22016 {

    /* JADX INFO: renamed from: ᩴ֨۠, reason: not valid java name and contains not printable characters */
    private static final short[] f71372 = {8275, 11146, 11236, 11237, 11244, 11241, 11245, 11241, 11252, 11237, 11250, 11215, 11250, 11241, 11239, 11241, 11246, 11233, 11244, 11176, 11177, 11194, 11146, 11220, 11250, 11233, 11246, 11251, 11244, 11233, 11252, 11237, 11236, 11176, 11220, 11250, 11233, 11246, 11251, 11244, 11233, 11252, 11241, 11247, 11246, 11168, 11238, 11233, 11241, 11244, 11237, 11236, 11194, 11168, 11182, 11182, 11182};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5082 f71373;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final TranslationEngine f71374;

    public C22016(TranslationEngine translationEngine) {
        TranslationEngine.Configuration configuration = null;
        int i = 951887752;
        int i2 = C1025.f4800;
        int i3 = RunnableC1606.f6488;
        int iM45029 = (i3 - C19806.m45029("ۡ᩸")) * (-77);
        int i4 = ((iM45029 ^ i2) * (-11193)) ^ 1910154050;
        int i5 = 1263945793;
        while (true) {
            i = ((((i ^ i2) * (-19441)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2044704771:
                case -1836449549:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (i2 - C19806.m45029("᩶ۖ")) * (-87);
                        i4 = ((iM45029 ^ i3) * (-21119)) ^ 2005307220;
                        i5 = -468180953;
                    } else {
                        iM45029 = (C19806.m45029("ۙ᩶") + i2) * 57;
                        i4 = ((iM45029 ^ i3) * 27681) ^ (-1857571390);
                        i5 = -726603015;
                    }
                    break;
                case -1895162407:
                case -468267244:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = (C19806.m45029("ۙ᩶") + i2) * 57;
                        i4 = ((iM45029 ^ i3) * 27681) ^ (-1857571390);
                        i5 = -726603015;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܰܿ")) * (-55);
                        i4 = ((iM45029 ^ i2) * (-11975)) ^ 1196321081;
                        i5 = 280960169;
                    }
                    break;
                case -1773383767:
                case -177226517:
                    if (C1977.f7413 <= 0) {
                        iM45029 = (C19806.m45029("ۘ۠") + i3) * (-21);
                        i4 = ((iM45029 ^ i2) * 10351) ^ (-1475643200);
                        i5 = -1796731300;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۛ᩹")) * q.h;
                        i4 = ((iM45029 ^ i2) * (-7053)) ^ (-1818811123);
                        i5 = -1451087075;
                    }
                    break;
                case -1760939182:
                case 670664212:
                    this.f71374 = translationEngine;
                    configuration = translationEngine.getConfiguration();
                    if (C1419.f5860 >= 0) {
                        iM45029 = (i2 - C19806.m45029("᩶ۖ")) * (-87);
                        i4 = ((iM45029 ^ i3) * (-21119)) ^ 2005307220;
                        i5 = -468180953;
                    } else {
                        iM45029 = (C19806.m45029("ܺ᩹") ^ i2) * 75;
                        i4 = ((iM45029 ^ i3) * 22547) ^ 1897436309;
                        i5 = -1395306423;
                    }
                    break;
                case -1553710891:
                case 587857507:
                    C1875.m6086();
                    iM45029 = (C19806.m45029("ۘ۠") + i3) * (-21);
                    i4 = ((iM45029 ^ i2) * 10351) ^ (-1475643200);
                    i5 = -1796731300;
                    break;
                case -1301471633:
                case -543530875:
                    if (C19806.f63586) {
                        iM45029 = (i2 - C19806.m45029("᩶ۖ")) * (-87);
                        i4 = ((iM45029 ^ i3) * (-21119)) ^ 2005307220;
                        i5 = -468180953;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۢۙ")) * 21;
                        i4 = ((iM45029 ^ i3) * 9133) ^ (-2085635421);
                        i5 = -613267879;
                    }
                    break;
                case -973782495:
                case 1714474658:
                    if (C2477.f9839 <= 0) {
                        iM45029 = (C19806.m45029("ۙ᩶") + i2) * 57;
                        i4 = ((iM45029 ^ i3) * 27681) ^ (-1857571390);
                        i5 = -726603015;
                    } else {
                        iM45029 = C19806.m45029("ۛ۟") ^ i3;
                        i4 = ((iM45029 ^ i2) * 23487) ^ 466115433;
                        i5 = -27603213;
                    }
                    break;
                case -942577924:
                case 259469853:
                    C1398.m4895();
                    C3660.m10791();
                    throw new RuntimeException();
                case -543592734:
                case 8938622:
                    C7105.m18985();
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳܺ") ^ i3) * (-101);
                        i4 = ((iM45029 ^ i2) * (-25407)) ^ 1867075812;
                        i5 = -432438440;
                    } else {
                        iM45029 = (C19806.m45029("ۙ᩶") + i2) * 57;
                        i4 = ((iM45029 ^ i3) * 27681) ^ (-1857571390);
                        i5 = -726603015;
                    }
                    break;
                case -499489301:
                case 294503247:
                    if (AbstractC0464.m2313() != 0) {
                        iM45029 = (C19806.m45029("ۙ᩶") + i2) * 57;
                        i4 = ((iM45029 ^ i3) * 27681) ^ (-1857571390);
                        i5 = -726603015;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺۬") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-22891)) ^ 1545332307;
                        i5 = -1390348350;
                    }
                    break;
                case -259603040:
                case 1664835371:
                    if (RunnableC1606.f6488 < 0) {
                        iM45029 = (C19806.m45029("ۙ᩶") + i2) * 57;
                        i4 = ((iM45029 ^ i3) * 27681) ^ (-1857571390);
                        i5 = -726603015;
                    } else {
                        iM45029 = (C19806.m45029("ۘ۠") + i3) * (-21);
                        i4 = ((iM45029 ^ i2) * 10351) ^ (-1475643200);
                        i5 = -1796731300;
                    }
                    break;
                case 536839663:
                case 1751996536:
                    if (RunnableC1895.f7152) {
                        iM45029 = (C19806.m45029("ۡܳ") ^ i3) * (-53);
                        i4 = ((iM45029 ^ i2) * (-837)) ^ (-1036722075);
                        i5 = 1913606587;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳܺ") ^ i3) * (-101);
                        i4 = ((iM45029 ^ i2) * (-25407)) ^ 1867075812;
                        i5 = -432438440;
                    }
                    break;
                case 2069509605:
                case 2106734783:
                    if (C3660.m10791() == 0) {
                        int i6 = configuration.maxTranslationTextLength;
                        if (C3743.f13569) {
                            this.f71373 = new C5082(this, i6, configuration.textLengthCalculator);
                            return;
                        }
                    }
                    iM45029 = ThreadFactoryC3888.m11306("ۢۗ") ^ i2;
                    i4 = ((iM45029 ^ i3) * (-31201)) ^ 1196267650;
                    i5 = 254297624;
                    break;
                default:
                    if (C1977.f7413 <= 0) {
                        iM45029 = (i2 - C19806.m45029("᩶ۖ")) * (-87);
                        i4 = ((iM45029 ^ i3) * (-21119)) ^ 2005307220;
                        i5 = -468180953;
                    } else {
                        iM45029 = C19806.m45029("᩵ۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 11371) ^ (-1129138320);
                        i5 = 635269925;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String[] m48904(String[] strArr, String str, String str2) {
        StringBuilder sb;
        int iM45029;
        int i;
        int i2;
        StringBuilder sb2;
        boolean z;
        int iM450210;
        int i3;
        int i4;
        String str3;
        short[] sArr;
        String str4;
        StringBuilder sb3;
        boolean z2;
        short s;
        int i5;
        String str5;
        int iM11306;
        int i6;
        int i7;
        String str6;
        int iM11307;
        int i8;
        int i9;
        int iM450211;
        int i10;
        int i11;
        int i12;
        String str7;
        StringBuilder sb4;
        boolean z3;
        String str8;
        String strTranslate;
        int iM450212;
        int i13;
        int i14;
        int iM11308;
        int i15;
        int i16;
        String[] strArr2 = strArr;
        int i17 = -301548640;
        int i18 = RunnableC3388.f12514;
        int i19 = C0050.f912;
        int iM450213 = (i19 - C19806.m45029("ۧܽ")) * 3;
        int i20 = ((iM450213 ^ i18) * 12341) ^ 428977731;
        int i21 = iM450213 ^ (-1062967935);
        StringBuilder sb5 = null;
        String str9 = null;
        String[] strArrSplit = null;
        PluginContext context = null;
        String strM5481 = null;
        StringBuilder sb6 = null;
        int i22 = 0;
        int i23 = 0;
        boolean z4 = false;
        StringBuilder sb7 = null;
        boolean z5 = false;
        short s2 = 0;
        String strM48902 = null;
        String strM38890 = null;
        String str10 = null;
        String strM3407 = null;
        short[] sArr2 = null;
        int i24 = 0;
        TranslationEngine translationEngine = null;
        String strM3408 = null;
        while (true) {
            i17 = i21 ^ (i20 & (((i17 ^ i18) * 395) >> 31));
            switch (i17) {
                case -2071477534:
                case 972094899:
                    strM3407 = strM3407;
                    sArr2 = sArr2;
                    z = z5;
                    str9 = str9;
                    strArrSplit = str10.split(str9, -1);
                    sb2 = sb7;
                    if (strArrSplit.length == strArr2.length) {
                        iM450210 = C19806.m45029("᩷ᩴ") ^ i19;
                        i3 = ((iM450210 ^ i18) * 12811) ^ (-1670967786);
                        i4 = -2086488455;
                    } else {
                        iM450210 = (C19806.m45029("ᩳۗ") ^ i19) * (-113);
                        i3 = ((iM450210 ^ i18) * 7655) ^ 1509834405;
                        i4 = -1536352477;
                    }
                    int i25 = iM450210 ^ i4;
                    z5 = z;
                    sb7 = sb2;
                    strM3407 = strM3407;
                    i21 = i25;
                    i20 = i3;
                    str9 = str9;
                    sArr2 = sArr2;
                    break;
                case -2056775632:
                case -1544650483:
                    C2788.m8472();
                    if (C3535.f13026 > 0) {
                        iM11308 = C19806.m45029("᩵۠") ^ i19;
                        i10 = ((iM11308 ^ i18) * (-16845)) ^ (-1463107958);
                        i15 = 1944971237;
                        i21 = iM11308 ^ i15;
                        i20 = i10;
                    } else {
                        str3 = strM3407;
                        sArr = sArr2;
                        str4 = str9;
                        sb3 = sb7;
                        z2 = z5;
                        s = s2;
                        i5 = i24;
                        str5 = strM48902;
                        iM11306 = (ThreadFactoryC3888.m11306("ۗۧ") + i18) * (-19);
                        i6 = ((iM11306 ^ i19) * (-26601)) ^ 1333429218;
                        i7 = -1225107152;
                        i16 = iM11306 ^ i7;
                        s2 = s;
                        strM48902 = str5;
                        i20 = i6;
                        sb7 = sb3;
                        i24 = i5;
                        z5 = z2;
                        str9 = str4;
                        strM3407 = str3;
                        sArr2 = sArr;
                        i21 = i16;
                        strArr2 = strArr;
                    }
                    break;
                case -2039995601:
                case -169667674:
                    C1937.m6279();
                    if (!C1377.f5749) {
                        iM11308 = (C19806.m45029("ܿ᩸") + i18) * (-57);
                        i10 = ((iM11308 ^ i19) * 1633) ^ 458820768;
                        i15 = -980045453;
                        i21 = iM11308 ^ i15;
                        i20 = i10;
                    } else {
                        strM3407 = strM3407;
                        sArr2 = sArr2;
                        strTranslate = str10;
                        int iM11309 = (ThreadFactoryC3888.m11306("ۖۜ") ^ i18) * (-89);
                        i20 = ((iM11309 ^ i19) * 8327) ^ (-350291351);
                        z5 = z5;
                        str10 = strTranslate;
                        strM3407 = strM3407;
                        i21 = iM11309 ^ (-1306631198);
                        sArr2 = sArr2;
                        sb7 = null;
                        translationEngine = translationEngine;
                    }
                    break;
                case -1761112329:
                case 1868434458:
                    strM3407 = strM3407;
                    sArr2 = sArr2;
                    str9 = str9;
                    sb7 = sb7;
                    z5 = z5;
                    i24 = i24;
                    String strM7082 = C2332.m7082(f71372, 1, 1, i23);
                    strM48902 = strM48902;
                    strM38890 = C16523.m38890(strM7082, strM48902, strM7082);
                    if (strM38890 != null) {
                        iM450211 = ThreadFactoryC3888.m11306("۟᩵") ^ i19;
                        i10 = ((iM450211 ^ i18) * (-32583)) ^ 1455495581;
                        i11 = -409260204;
                    } else {
                        iM450211 = (ThreadFactoryC3888.m11306("֡᩺") ^ i18) * (-11);
                        i10 = ((iM450211 ^ i19) * 389) ^ 115740537;
                        i11 = 1948128061;
                    }
                    int i26 = iM450211 ^ i11;
                    strM48902 = strM48902;
                    sb7 = sb7;
                    i24 = i24;
                    z5 = z5;
                    str9 = str9;
                    strM3407 = strM3407;
                    sArr2 = sArr2;
                    i21 = i26;
                    i20 = i10;
                    break;
                case -1582180398:
                case 1069827341:
                    C0216.m1591();
                    str3 = strM3407;
                    sArr = sArr2;
                    str4 = str9;
                    sb3 = sb7;
                    z2 = z5;
                    s = s2;
                    i5 = i24;
                    str5 = strM48902;
                    iM11306 = (ThreadFactoryC3888.m11306("ۗۧ") + i18) * (-19);
                    i6 = ((iM11306 ^ i19) * (-26601)) ^ 1333429218;
                    i7 = -1225107152;
                    i16 = iM11306 ^ i7;
                    s2 = s;
                    strM48902 = str5;
                    i20 = i6;
                    sb7 = sb3;
                    i24 = i5;
                    z5 = z2;
                    str9 = str4;
                    strM3407 = str3;
                    sArr2 = sArr;
                    i21 = i16;
                    strArr2 = strArr;
                    break;
                case -1507455020:
                case -1248405277:
                    if (C2788.m8472() != 0) {
                        iM11308 = C19806.m45029("ۢ֡") ^ i19;
                        i10 = ((iM11308 ^ i18) * (-12511)) ^ (-1731926902);
                        i15 = -901619661;
                        i21 = iM11308 ^ i15;
                        i20 = i10;
                    } else {
                        str3 = strM3407;
                        sArr = sArr2;
                        str4 = str9;
                        sb3 = sb7;
                        z2 = z5;
                        s = s2;
                        i5 = i24;
                        str5 = strM48902;
                        iM11306 = (ThreadFactoryC3888.m11306("ۗۧ") + i18) * (-19);
                        i6 = ((iM11306 ^ i19) * (-26601)) ^ 1333429218;
                        i7 = -1225107152;
                        i16 = iM11306 ^ i7;
                        s2 = s;
                        strM48902 = str5;
                        i20 = i6;
                        sb7 = sb3;
                        i24 = i5;
                        z5 = z2;
                        str9 = str4;
                        strM3407 = str3;
                        sArr2 = sArr;
                        i21 = i16;
                        strArr2 = strArr;
                    }
                    break;
                case -1414440511:
                case 1616309510:
                    i12 = i24;
                    strM3407 = strM3407;
                    sArr2 = sArr2;
                    str7 = str9;
                    sb4 = sb7;
                    sb5 = new StringBuilder();
                    z3 = true;
                    if (strArr2.length <= 0) {
                        int iM113010 = (ThreadFactoryC3888.m11306("۬᩻") ^ i19) * 45;
                        sb7 = sb4;
                        str9 = str7;
                        sArr2 = sArr2;
                        String str11 = strM3407;
                        i21 = iM113010 ^ (-1134341567);
                        i20 = ((iM113010 ^ i18) * (-28373)) ^ (-159051601);
                        strM3407 = str11;
                        int i27 = i12;
                        z5 = z3;
                        i24 = i27;
                    } else {
                        int iM113011 = (ThreadFactoryC3888.m11306("ܰܺ") ^ i18) * (-127);
                        sb7 = sb4;
                        i24 = i12;
                        z5 = true;
                        str9 = str7;
                        sArr2 = sArr2;
                        str8 = strM3407;
                        i21 = iM113011 ^ 1098054216;
                        i20 = ((iM113011 ^ i19) * (-5647)) ^ (-196663463);
                        strM3407 = str8;
                    }
                    break;
                case -1376733652:
                case 1088146085:
                    sb5.append((CharSequence) strM38890);
                    sb5.append((CharSequence) strArr2[i22]);
                    i22++;
                    iM450212 = ThreadFactoryC3888.m11306("ۛ᩶") ^ i18;
                    i13 = ((iM450212 ^ i19) * 12001) ^ (-781417811);
                    i14 = 1212094623;
                    i9 = iM450212 ^ i14;
                    sb7 = sb7;
                    z5 = z5;
                    i20 = i13;
                    strM3407 = strM3407;
                    sArr2 = sArr2;
                    i21 = i9;
                    break;
                case -1270177228:
                case -1008158688:
                    sb6 = new StringBuilder();
                    C2788.m8480(sb6, C2642.m8164(str10, i24, 99));
                    sArr2 = f71372;
                    if (C3743.f13569) {
                        iM11308 = (ThreadFactoryC3888.m11306("ۘܽ") ^ i19) * (-23);
                        i10 = ((iM11308 ^ i18) * (-17687)) ^ (-1752085882);
                        i15 = -1641390785;
                    } else {
                        iM11308 = (C19806.m45029("ܿ᩸") + i18) * (-57);
                        i10 = ((iM11308 ^ i19) * 1633) ^ 458820768;
                        i15 = -980045453;
                    }
                    i21 = iM11308 ^ i15;
                    i20 = i10;
                    break;
                case -1197624912:
                case 1695533594:
                    str3 = strM3407;
                    sArr = sArr2;
                    str4 = str9;
                    sb3 = sb7;
                    z2 = z5;
                    i5 = i24;
                    str6 = strM48902;
                    s2 = f71372[0];
                    if (C2124.f7782 <= 0) {
                        iM11307 = C19806.m45029("۠᩹") ^ i18;
                        i20 = ((iM11307 ^ i19) * (-30045)) ^ 634352472;
                        i8 = 731301573;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ۧۡ") ^ i18;
                        i20 = ((iM11307 ^ i19) * (-3779)) ^ 1545455375;
                        i8 = 1933502917;
                    }
                    i16 = iM11307 ^ i8;
                    strM48902 = str6;
                    sb7 = sb3;
                    i24 = i5;
                    z5 = z2;
                    str9 = str4;
                    strM3407 = str3;
                    sArr2 = sArr;
                    i21 = i16;
                    strArr2 = strArr;
                    break;
                case -1193386872:
                case -887138057:
                    sb2 = sb7;
                    z = z5;
                    strM48902 = m48902(false, strArr2);
                    i24 = 0;
                    z4 = false;
                    iM450210 = (C19806.m45029("۟᩺") + i19) * (-77);
                    i3 = ((iM450210 ^ i18) * (-447)) ^ 207131816;
                    i4 = 2042208928;
                    int i28 = iM450210 ^ i4;
                    z5 = z;
                    sb7 = sb2;
                    strM3407 = strM3407;
                    i21 = i28;
                    i20 = i3;
                    str9 = str9;
                    sArr2 = sArr2;
                    break;
                case -1190653102:
                case -595146883:
                    sb5.append((CharSequence) strArr2[i24]);
                    i22 = 1;
                    iM450212 = ThreadFactoryC3888.m11306("ۛ᩶") ^ i18;
                    i13 = ((iM450212 ^ i19) * 12001) ^ (-781417811);
                    i14 = 1212094623;
                    i9 = iM450212 ^ i14;
                    sb7 = sb7;
                    z5 = z5;
                    i20 = i13;
                    strM3407 = strM3407;
                    sArr2 = sArr2;
                    i21 = i9;
                    break;
                case -973871894:
                case 315036725:
                    strM3407 = strM3407;
                    sArr2 = sArr2;
                    sb7 = sb7;
                    z5 = z5;
                    if (z4) {
                        iM450212 = C19806.m45029("ۜ᩵") ^ i18;
                        i13 = ((iM450212 ^ i19) * (-23955)) ^ (-135071093);
                        i14 = -405314562;
                    } else {
                        iM450212 = (ThreadFactoryC3888.m11306("᩻ۧ") ^ i19) * (-25);
                        i13 = ((iM450212 ^ i18) * 31733) ^ (-533733790);
                        i14 = 1207926095;
                    }
                    i9 = iM450212 ^ i14;
                    sb7 = sb7;
                    z5 = z5;
                    i20 = i13;
                    strM3407 = strM3407;
                    sArr2 = sArr2;
                    i21 = i9;
                    break;
                case -938453978:
                case 1334238346:
                    z = z5;
                    strM48902 = m48902(z, strArr2);
                    z4 = true;
                    sb2 = sb7;
                    iM450210 = (C19806.m45029("۟᩺") + i19) * (-77);
                    i3 = ((iM450210 ^ i18) * (-447)) ^ 207131816;
                    i4 = 2042208928;
                    int i29 = iM450210 ^ i4;
                    z5 = z;
                    sb7 = sb2;
                    strM3407 = strM3407;
                    i21 = i29;
                    i20 = i3;
                    str9 = str9;
                    sArr2 = sArr2;
                    break;
                case -868997923:
                case 618222470:
                    str3 = strM3407;
                    sArr = sArr2;
                    str4 = str9;
                    sb3 = sb7;
                    z2 = z5;
                    s = s2;
                    i5 = i24;
                    str5 = strM48902;
                    if (C1066.f4915 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗۧ") + i18) * (-19);
                        i6 = ((iM11306 ^ i19) * (-26601)) ^ 1333429218;
                        i7 = -1225107152;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠᩸") ^ i19;
                        i6 = ((iM11306 ^ i18) * 10023) ^ (-1564741258);
                        i7 = 690338913;
                    }
                    i16 = iM11306 ^ i7;
                    s2 = s;
                    strM48902 = str5;
                    i20 = i6;
                    sb7 = sb3;
                    i24 = i5;
                    z5 = z2;
                    str9 = str4;
                    strM3407 = str3;
                    sArr2 = sArr;
                    i21 = i16;
                    strArr2 = strArr;
                    break;
                case -812949177:
                case 1118156506:
                    return strArrSplit;
                case -767165100:
                case 562117159:
                    strM3407 = strM3407;
                    sArr2 = sArr2;
                    String strM3009 = C0671.m3009(f71372, 11, 9, i23);
                    if (C0962.m3746() < 0) {
                        sb = new StringBuilder(strM3009);
                        C0817.m3408(sb, strArr2.length);
                        if (C0050.f912 > 0) {
                            iM45029 = C19806.m45029("ۜۖ") ^ i19;
                            i = ((iM45029 ^ i18) * 16541) ^ 1917434863;
                            i2 = 1450003507;
                            int i30 = iM45029 ^ i2;
                            sb7 = sb;
                            i20 = i;
                            sArr2 = sArr2;
                            str8 = strM3407;
                            i21 = i30;
                            strM3407 = str8;
                            break;
                        }
                    }
                    strTranslate = str10;
                    int iM113012 = (ThreadFactoryC3888.m11306("ۖۜ") ^ i18) * (-89);
                    i20 = ((iM113012 ^ i19) * 8327) ^ (-350291351);
                    z5 = z5;
                    str10 = strTranslate;
                    strM3407 = strM3407;
                    i21 = iM113012 ^ (-1306631198);
                    sArr2 = sArr2;
                    sb7 = null;
                    translationEngine = translationEngine;
                    break;
                case -709829647:
                case -215509453:
                    C0526.m2437();
                    return null;
                case -700512293:
                case 1556209585:
                    strM3407 = strM3407;
                    sArr2 = sArr2;
                    sb7 = sb7;
                    z5 = z5;
                    if (i22 >= strArr2.length) {
                        i12 = i24;
                        z3 = z5;
                        str7 = str9;
                        sb4 = sb7;
                        int iM113013 = (ThreadFactoryC3888.m11306("۬᩻") ^ i19) * 45;
                        sb7 = sb4;
                        str9 = str7;
                        sArr2 = sArr2;
                        String str12 = strM3407;
                        i21 = iM113013 ^ (-1134341567);
                        i20 = ((iM113013 ^ i18) * (-28373)) ^ (-159051601);
                        strM3407 = str12;
                        int i210 = i12;
                        z5 = z3;
                        i24 = i210;
                    } else {
                        iM450212 = ThreadFactoryC3888.m11306("᩻ᩴ") ^ i19;
                        i13 = ((iM450212 ^ i18) * 11533) ^ 182034632;
                        i14 = -505847658;
                        i9 = iM450212 ^ i14;
                        sb7 = sb7;
                        z5 = z5;
                        i20 = i13;
                        strM3407 = strM3407;
                        sArr2 = sArr2;
                        i21 = i9;
                    }
                    break;
                case -653593647:
                case 151297185:
                    i23 = 5202;
                    iM450211 = (C19806.m45029("ܽܳ") ^ i18) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i10 = ((iM450211 ^ i19) * (-27071)) ^ (-1096668803);
                    i11 = 1695883670;
                    int i211 = iM450211 ^ i11;
                    strM48902 = strM48902;
                    sb7 = sb7;
                    i24 = i24;
                    z5 = z5;
                    str9 = str9;
                    strM3407 = strM3407;
                    sArr2 = sArr2;
                    i21 = i211;
                    i20 = i10;
                    break;
                case -552131779:
                case 657399891:
                    strM3407 = strM3407;
                    sArr2 = sArr2;
                    StringBuilder sb8 = sb7;
                    z5 = z5;
                    strM3408 = C0817.m3407(sb5);
                    translationEngine = this.f71374;
                    strTranslate = translationEngine.translate(strM3408, str, str2);
                    String strQuote = Pattern.quote(strM38890);
                    if (C1460.m5050() != 0) {
                        str9 = strQuote;
                        int iM113014 = (ThreadFactoryC3888.m11306("ۖۜ") ^ i18) * (-89);
                        i20 = ((iM113014 ^ i19) * 8327) ^ (-350291351);
                        z5 = z5;
                        str10 = strTranslate;
                        strM3407 = strM3407;
                        i21 = iM113014 ^ (-1306631198);
                        sArr2 = sArr2;
                        sb7 = null;
                        translationEngine = translationEngine;
                    } else {
                        int iM450214 = (C19806.m45029("ܺܿ") + i18) * (-91);
                        str10 = strTranslate;
                        sArr2 = sArr2;
                        translationEngine = translationEngine;
                        i21 = iM450214 ^ 1372592502;
                        i20 = ((iM450214 ^ i19) * 28069) ^ (-25182494);
                        i24 = i24;
                        z5 = z5;
                        strM3407 = strM3407;
                        sb7 = sb8;
                        str9 = strQuote;
                    }
                    break;
                case -468613652:
                case 1001613775:
                    C2704.m8255();
                    if (!C1461.m5080()) {
                        str3 = strM3407;
                        sArr = sArr2;
                        str4 = str9;
                        sb3 = sb7;
                        z2 = z5;
                        i5 = i24;
                        str6 = strM48902;
                        iM11307 = C19806.m45029("۠᩹") ^ i18;
                        i20 = ((iM11307 ^ i19) * (-30045)) ^ 634352472;
                        i8 = 731301573;
                        i16 = iM11307 ^ i8;
                        strM48902 = str6;
                        sb7 = sb3;
                        i24 = i5;
                        z5 = z2;
                        str9 = str4;
                        strM3407 = str3;
                        sArr2 = sArr;
                        i21 = i16;
                        strArr2 = strArr;
                    } else {
                        iM11308 = (C19806.m45029("ܿ᩸") + i18) * (-57);
                        i10 = ((iM11308 ^ i19) * 1633) ^ 458820768;
                        i15 = -980045453;
                        i21 = iM11308 ^ i15;
                        i20 = i10;
                    }
                    break;
                case -314653536:
                case 582625857:
                    str3 = strM3407;
                    sArr = sArr2;
                    str4 = str9;
                    sb3 = sb7;
                    z2 = z5;
                    s = s2;
                    i5 = i24;
                    str5 = strM48902;
                    if (((s * s) + 20097289) - (s * 8966) >= 0) {
                        iM11306 = C19806.m45029("ܶ֫") ^ i19;
                        i6 = ((iM11306 ^ i18) * 19069) ^ (-364445266);
                        i7 = -1252947922;
                        i16 = iM11306 ^ i7;
                        s2 = s;
                        strM48902 = str5;
                        i20 = i6;
                        sb7 = sb3;
                        i24 = i5;
                        z5 = z2;
                        str9 = str4;
                        strM3407 = str3;
                        sArr2 = sArr;
                        i21 = i16;
                        strArr2 = strArr;
                    } else {
                        int iM113015 = (ThreadFactoryC3888.m11306("ۧ֫") + i18) * (-125);
                        int i31 = ((iM113015 ^ i19) * (-15837)) ^ 312534126;
                        i9 = iM113015 ^ 1328504;
                        s2 = s;
                        strM48902 = str5;
                        sb7 = sb3;
                        i24 = i5;
                        i20 = i31;
                        z5 = z2;
                        str9 = str4;
                        strM3407 = str3;
                        sArr2 = sArr;
                        strArr2 = strArr;
                        i21 = i9;
                    }
                    break;
                case -246413566:
                case 557385148:
                    strM3407 = strM3407;
                    sArr2 = sArr2;
                    sb = sb7;
                    C1148.m4223(sb, strM5481);
                    C2788.m8480(sb, strM3408);
                    if (CallableC1627.f6528) {
                        iM45029 = (ThreadFactoryC3888.m11306("۫ۡ") + i18) * (-61);
                        i = ((iM45029 ^ i19) * (-19123)) ^ 1455365092;
                        i2 = -1390197486;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤܰ") ^ i19) * (-101);
                        i = ((iM45029 ^ i18) * (-30147)) ^ (-3315455);
                        i2 = -924721734;
                    }
                    int i32 = iM45029 ^ i2;
                    sb7 = sb;
                    i20 = i;
                    sArr2 = sArr2;
                    str8 = strM3407;
                    i21 = i32;
                    strM3407 = str8;
                    break;
                case -189603091:
                case 202539877:
                    context.log(C0817.m3407(sb7));
                    short[] sArr3 = f71372;
                    if (!RunnableC1895.f7152) {
                        str3 = strM3407;
                        sArr = sArr2;
                        str4 = str9;
                        sb3 = sb7;
                        z2 = z5;
                        s = s2;
                        i5 = i24;
                        str5 = strM48902;
                        iM11306 = (ThreadFactoryC3888.m11306("ۗۧ") + i18) * (-19);
                        i6 = ((iM11306 ^ i19) * (-26601)) ^ 1333429218;
                        i7 = -1225107152;
                        i16 = iM11306 ^ i7;
                        s2 = s;
                        strM48902 = str5;
                        i20 = i6;
                        sb7 = sb3;
                        i24 = i5;
                        z5 = z2;
                        str9 = str4;
                        strM3407 = str3;
                        sArr2 = sArr;
                        i21 = i16;
                        strArr2 = strArr;
                    } else {
                        strM3407 = strM3407;
                        sArr2 = sArr2;
                        String strM7604 = C2477.m7604(sArr3, 23, 11, i23);
                        if (C1189.m4368() > 0) {
                            StringBuilder sb9 = new StringBuilder(strM7604);
                            C0817.m3408(sb9, strArrSplit.length);
                            C1148.m4223(sb9, strM5481);
                            C2788.m8480(sb9, str10);
                            context.log(C0817.m3407(sb9));
                            sb7 = sb7;
                            z5 = z5;
                            iM450212 = (C19806.m45029("ۗۛ") + i18) * (-101);
                            i13 = ((iM450212 ^ i19) * 29725) ^ (-858076354);
                            i14 = -1508997737;
                            i9 = iM450212 ^ i14;
                            sb7 = sb7;
                            z5 = z5;
                            i20 = i13;
                            strM3407 = strM3407;
                            sArr2 = sArr2;
                            i21 = i9;
                        } else {
                            sb = sb7;
                            iM45029 = (ThreadFactoryC3888.m11306("ۤܰ") ^ i19) * (-101);
                            i = ((iM45029 ^ i18) * (-30147)) ^ (-3315455);
                            i2 = -924721734;
                            int i33 = iM45029 ^ i2;
                            sb7 = sb;
                            i20 = i;
                            sArr2 = sArr2;
                            str8 = strM3407;
                            i21 = i33;
                            strM3407 = str8;
                        }
                    }
                    break;
                case -124021997:
                case -109316872:
                    i23 = 11136;
                    iM450211 = (C19806.m45029("ܽܳ") ^ i18) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i10 = ((iM450211 ^ i19) * (-27071)) ^ (-1096668803);
                    i11 = 1695883670;
                    int i212 = iM450211 ^ i11;
                    strM48902 = strM48902;
                    sb7 = sb7;
                    i24 = i24;
                    z5 = z5;
                    str9 = str9;
                    strM3407 = strM3407;
                    sArr2 = sArr2;
                    i21 = i212;
                    i20 = i10;
                    break;
                case -117970165:
                case 440864426:
                    strM3407 = strM3407;
                    sArr2 = sArr2;
                    sb = sb7;
                    strM5481 = RunnableC1606.m5481(f71372, 20, 3, i23);
                    if (!C0962.f3784) {
                        iM45029 = (i19 - ThreadFactoryC3888.m11306("ܳۡ")) * (-111);
                        i = ((iM45029 ^ i18) * (-25347)) ^ 1472466444;
                        i2 = -657325287;
                        int i34 = iM45029 ^ i2;
                        sb7 = sb;
                        i20 = i;
                        sArr2 = sArr2;
                        str8 = strM3407;
                        i21 = i34;
                        strM3407 = str8;
                    } else {
                        strTranslate = str10;
                        int iM113016 = (ThreadFactoryC3888.m11306("ۖۜ") ^ i18) * (-89);
                        i20 = ((iM113016 ^ i19) * 8327) ^ (-350291351);
                        z5 = z5;
                        str10 = strTranslate;
                        strM3407 = strM3407;
                        i21 = iM113016 ^ (-1306631198);
                        sArr2 = sArr2;
                        sb7 = null;
                        translationEngine = translationEngine;
                    }
                    break;
                case 58443692:
                case 1874964090:
                    throw new IOException(C0252.m1693(C3286.m9788(f71372, 34, 20, i23), strM3407));
                case 256165414:
                case 494661202:
                    strM3407 = strM3407;
                    sArr2 = sArr2;
                    sb = sb7;
                    if (C2871.m8641(str10) <= 100) {
                        strM3407 = str10;
                        int iM113017 = ThreadFactoryC3888.m11306("֫ܽ") ^ i19;
                        i21 = iM113017 ^ 602636651;
                        sb7 = sb;
                        i20 = ((iM113017 ^ i18) * 20069) ^ (-1770473616);
                        sArr2 = sArr2;
                    } else {
                        iM45029 = C19806.m45029("ۛ᩸") ^ i18;
                        i = ((iM45029 ^ i19) * 12033) ^ (-683667531);
                        i2 = 709541238;
                        int i35 = iM45029 ^ i2;
                        sb7 = sb;
                        i20 = i;
                        sArr2 = sArr2;
                        str8 = strM3407;
                        i21 = i35;
                        strM3407 = str8;
                    }
                    break;
                case 336065179:
                case 393747984:
                    if (!C19806.f63586) {
                        strM3407 = strM3407;
                        sArr2 = sArr2;
                        strTranslate = str10;
                        int iM113018 = (ThreadFactoryC3888.m11306("ۖۜ") ^ i18) * (-89);
                        i20 = ((iM113018 ^ i19) * 8327) ^ (-350291351);
                        z5 = z5;
                        str10 = strTranslate;
                        strM3407 = strM3407;
                        i21 = iM113018 ^ (-1306631198);
                        sArr2 = sArr2;
                        sb7 = null;
                        translationEngine = translationEngine;
                    } else {
                        iM11308 = C19806.m45029("᩵۠") ^ i19;
                        i10 = ((iM11308 ^ i18) * (-16845)) ^ (-1463107958);
                        i15 = 1944971237;
                        i21 = iM11308 ^ i15;
                        i20 = i10;
                    }
                    break;
                case 1105435331:
                case 1691281835:
                    throw new NullPointerException(C1461.m5070(f71372, 2, 9, i23));
                case 1347798450:
                case 2044165464:
                    strM3407 = strM3407;
                    sArr2 = sArr2;
                    sb7 = sb7;
                    z5 = z5;
                    context = translationEngine.getContext();
                    if (context != null) {
                        iM450212 = C19806.m45029("᩹ܶ") ^ i18;
                        i13 = ((iM450212 ^ i19) * (-19259)) ^ (-2033831626);
                        i14 = -1081937851;
                    } else {
                        iM450212 = (C19806.m45029("ۗۛ") + i18) * (-101);
                        i13 = ((iM450212 ^ i19) * 29725) ^ (-858076354);
                        i14 = -1508997737;
                    }
                    i9 = iM450212 ^ i14;
                    sb7 = sb7;
                    z5 = z5;
                    i20 = i13;
                    strM3407 = strM3407;
                    sArr2 = sArr2;
                    i21 = i9;
                    break;
                default:
                    C2788.m8480(sb6, C3722.m10901(sArr2, 54, 3, i23));
                    strM3407 = C0817.m3407(sb6);
                    sArr2 = sArr2;
                    sb = sb7;
                    int iM113019 = ThreadFactoryC3888.m11306("֫ܽ") ^ i19;
                    i21 = iM113019 ^ 602636651;
                    sb7 = sb;
                    i20 = ((iM113019 ^ i18) * 20069) ^ (-1770473616);
                    sArr2 = sArr2;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5082 m48903() {
        return this.f71373;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x018d A[PHI: r7 r8
      0x018d: PHI (r7v4 java.lang.String) = (r7v3 java.lang.String), (r7v2 java.lang.String), (r7v2 java.lang.String) binds: [B:48:0x018b, B:16:0x0082, B:13:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x018d: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:48:0x018b, B:16:0x0082, B:13:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0227  */
    /* JADX WARN: Code duplicated, block: B:73:0x0291  */
    /* JADX WARN: Code duplicated, block: B:81:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:89:0x0336 A[PHI: r2 r6 r20
      0x0336: PHI (r2v4 int) = (r2v3 int), (r2v2 int), (r2v2 int), (r2v2 int) binds: [B:88:0x0334, B:84:0x0312, B:76:0x02c1, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0336: PHI (r6v3 char[]) = (r6v2 char[]), (r6v2 char[]), (r6v2 char[]), (r6v5 char[]) binds: [B:88:0x0334, B:84:0x0312, B:76:0x02c1, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0336: PHI (r20v5 int) = (r20v4 int), (r20v3 int), (r20v3 int), (r20v3 int) binds: [B:88:0x0334, B:84:0x0312, B:76:0x02c1, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m48902(boolean z, String[] strArr) {
        int iM45029;
        int i;
        int i2;
        int i3 = C1875.f7103;
        int i4 = C1025.f4800;
        int iM450210 = (C19806.m45029("᩹۫") + i4) * (-13);
        int i5 = ((iM450210 ^ i3) * (-7135)) ^ 1878021189;
        String str = null;
        int i6 = iM450210 ^ 1899077333;
        int length = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        char c = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = -2134345354;
        int i16 = 0;
        char[] cArr = null;
        int i17 = 0;
        while (true) {
            i15 = i6 ^ (i5 & (((i15 ^ i3) * 18755) >> 31));
            switch (i15) {
                case -2025543644:
                case 631422337:
                    C0216.m1591();
                    if (C10634.f36300 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۡ") ^ i3) * (-127);
                        i = ((iM45029 ^ i4) * 2069) ^ 727040402;
                        i2 = 1505305481;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ۖۗ")) * 91;
                        i = ((iM45029 ^ i3) * 7651) ^ 1528034247;
                        i2 = 1437948265;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1995466867:
                case -1323657694:
                    if (C2477.f9839 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳۗ") + i3) * (-21);
                        i = ((iM45029 ^ i4) * (-653)) ^ 1110299065;
                        i2 = 871446687;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ֨") ^ i4;
                        i = ((iM45029 ^ i3) * (-21905)) ^ 722582342;
                        i2 = -834576513;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1980909215:
                case -804552325:
                    c = '-';
                    iM45029 = ThreadFactoryC3888.m11306("ۛܳ") ^ i4;
                    i = ((iM45029 ^ i3) * 16809) ^ 2126705080;
                    i2 = 873573834;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1918327626:
                case -1491130079:
                    if (i10 >= i17) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܿۛ")) * 97;
                        i = ((iM45029 ^ i4) * (-16955)) ^ 1436531683;
                        i2 = -890263682;
                    } else {
                        i11 = i17;
                        iM45029 = ThreadFactoryC3888.m11306("ۤ᩵") ^ i3;
                        i = ((iM45029 ^ i4) * (-15931)) ^ (-927574783);
                        i2 = 1924048113;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1887113320:
                case 1515521865:
                    if (C2788.m8472() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۡ") ^ i3) * (-127);
                        i = ((iM45029 ^ i4) * 2069) ^ 727040402;
                        i2 = 1505305481;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۙ") ^ i4;
                        i = ((iM45029 ^ i3) * (-19305)) ^ 1863404552;
                        i2 = -187560191;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1736502415:
                case 2067864467:
                    C1977.m6356();
                    C0671.m3008();
                    iM45029 = (ThreadFactoryC3888.m11306("ܳۡ") ^ i3) * (-127);
                    i = ((iM45029 ^ i4) * 2069) ^ 727040402;
                    i2 = 1505305481;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1717614771:
                case 317041715:
                    i7++;
                    i17 = i11;
                    iM45029 = ThreadFactoryC3888.m11306("ܳ᩶") ^ i4;
                    i = ((iM45029 ^ i3) * (-26731)) ^ 1580637282;
                    i2 = 1226117005;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1717304607:
                case -748280874:
                    if (i7 < length) {
                        iM45029 = C19806.m45029("ܿۖ") ^ i3;
                        i = ((iM45029 ^ i4) * (-4519)) ^ 1079254381;
                        i2 = 636493158;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿۡ") ^ i3) * (-77);
                        i = ((iM45029 ^ i4) * (-1725)) ^ (-1825082567);
                        i2 = -1253210598;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1514023091:
                case -561983964:
                    i9++;
                    i10 = i13;
                    i12 = i14;
                    iM45029 = ThreadFactoryC3888.m11306("ۛ᩻") ^ i3;
                    i = ((iM45029 ^ i4) * 269) ^ 1246569200;
                    i2 = 562870597;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1310779125:
                case 913484965:
                    c = a.h;
                    iM45029 = ThreadFactoryC3888.m11306("ۛܳ") ^ i4;
                    i = ((iM45029 ^ i3) * 16809) ^ 2126705080;
                    i2 = 873573834;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1306003240:
                case 2110673980:
                    i13 = i10;
                    i14 = 0;
                    iM45029 = (C19806.m45029("ۖᩳ") + i4) * 123;
                    i = ((iM45029 ^ i3) * 9401) ^ (-492901016);
                    i2 = -533532311;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1233423661:
                case -6337550:
                    if (C1875.f7103 >= 0) {
                        iM45029 = (i4 - C19806.m45029("ۖۗ")) * 91;
                        i = ((iM45029 ^ i3) * 7651) ^ 1528034247;
                        i2 = 1437948265;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۧ") ^ i3;
                        i = ((iM45029 ^ i4) * (-10827)) ^ 2025552975;
                        i2 = 554532359;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1139315782:
                case 1946619855:
                    if (C2249.f8050 >= 0) {
                        iM45029 = (i4 - C19806.m45029("ۖۗ")) * 91;
                        i = ((iM45029 ^ i3) * 7651) ^ 1528034247;
                        i2 = 1437948265;
                    } else {
                        iM45029 = (C19806.m45029("ۡۨ") ^ i3) * (-97);
                        i = ((iM45029 ^ i4) * (-2965)) ^ 1995358012;
                        i2 = 1396361876;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -901990566:
                case 903072047:
                    i17 = i16;
                    i7 = 0;
                    iM45029 = ThreadFactoryC3888.m11306("ܳ᩶") ^ i4;
                    i = ((iM45029 ^ i3) * (-26731)) ^ 1580637282;
                    i2 = 1226117005;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -893565464:
                case 91793890:
                    if (i9 < C1977.m6360(str)) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶۫") ^ i4;
                        i = ((iM45029 ^ i3) * 17709) ^ 253788590;
                        i2 = -1019501671;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ᩴۡ")) * 43;
                        i = ((iM45029 ^ i3) * 5361) ^ 566518076;
                        i2 = -2131649472;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -884128412:
                case 193857450:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    return null;
                case -826152516:
                case 569080220:
                    str = strArr[i7];
                    i8 = 0;
                    if (C1398.m4895() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳۗ") + i3) * (-21);
                        i = ((iM45029 ^ i4) * (-653)) ^ 1110299065;
                        i2 = 871446687;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۧ᩸") ^ i4;
                        i = ((iM45029 ^ i3) * (-16205)) ^ (-1580203906);
                        i2 = -1815677210;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -704183718:
                case -676390417:
                    i11 = i10 + 1;
                    iM45029 = ThreadFactoryC3888.m11306("ۤ᩵") ^ i3;
                    i = ((iM45029 ^ i4) * (-15931)) ^ (-927574783);
                    i2 = 1924048113;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -667427990:
                case 305154614:
                    if (C1461.m5080()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۡ") ^ i3) * (-127);
                        i = ((iM45029 ^ i4) * 2069) ^ 727040402;
                        i2 = 1505305481;
                    } else {
                        iM45029 = (C19806.m45029("֫֫") + i3) * (-125);
                        i = ((iM45029 ^ i4) * (-8565)) ^ 26245395;
                        i2 = 1507077033;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -459242819:
                case 1299838703:
                    length = strArr.length;
                    i16 = 8;
                    if (C0629.m2907()) {
                        iM45029 = (i3 - C19806.m45029("ܽ۫")) * 33;
                        i = ((iM45029 ^ i4) * 10255) ^ (-318367693);
                        i2 = 122690894;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۫ۙ") ^ i4;
                        i = ((iM45029 ^ i3) * 14069) ^ 904695913;
                        i2 = -1531566514;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -386487811:
                case 402462150:
                    if (z) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۖ᩶")) * 55;
                        i = ((iM45029 ^ i4) * 7433) ^ (-1042653826);
                        i2 = 1465090800;
                    } else {
                        iM45029 = (C19806.m45029("ۛ᩸") ^ i4) * (-121);
                        i = ((iM45029 ^ i3) * 18109) ^ (-1197110327);
                        i2 = -308967595;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -292534301:
                case 1386090740:
                    int i18 = i12 + 1;
                    if (i18 > i10) {
                        i13 = i18;
                        i14 = i13;
                    } else {
                        i14 = i18;
                        i13 = i10;
                    }
                    iM45029 = (C19806.m45029("ۖᩳ") + i4) * 123;
                    i = ((iM45029 ^ i3) * 9401) ^ (-492901016);
                    i2 = -533532311;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -222671259:
                case 1902444302:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۫ۙ") ^ i4;
                        i = ((iM45029 ^ i3) * 14069) ^ 904695913;
                        i2 = -1531566514;
                    } else {
                        iM45029 = C19806.m45029("ۚۘ") ^ i3;
                        i = ((iM45029 ^ i4) * (-30779)) ^ 385532949;
                        i2 = -1113820392;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -106578094:
                case 1449502065:
                    if (C1977.f7413 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۫ۙ") ^ i4;
                        i = ((iM45029 ^ i3) * 14069) ^ 904695913;
                        i2 = -1531566514;
                    } else {
                        iM45029 = (C19806.m45029("ܳ۟") ^ i4) * (-105);
                        i = ((iM45029 ^ i3) * (-6325)) ^ (-1757963932);
                        i2 = -1083665041;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -26125524:
                case 519065118:
                    C0050.m946();
                    if (C1398.f5802 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۡ") ^ i3) * (-127);
                        i = ((iM45029 ^ i4) * 2069) ^ 727040402;
                        i2 = 1505305481;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳۗ") + i3) * (-21);
                        i = ((iM45029 ^ i4) * (-653)) ^ 1110299065;
                        i2 = 871446687;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 327773283:
                case 473482118:
                    if (C2871.m8652(str, i9) == c) {
                        iM45029 = (C19806.m45029("ܰ᩸") + i3) * 119;
                        i = ((iM45029 ^ i4) * 32381) ^ 1153711467;
                        i2 = 114955543;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺܳ") ^ i4;
                        i = ((iM45029 ^ i3) * 4571) ^ (-1452280771);
                        i2 = 1654057774;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 609625819:
                case 1521676059:
                    return new String(cArr);
                case 610476273:
                case 1304793634:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ֨") ^ i4;
                        i = ((iM45029 ^ i3) * (-21905)) ^ 722582342;
                        i2 = -834576513;
                    } else {
                        iM45029 = C19806.m45029("֨ܿ") ^ i3;
                        i = ((iM45029 ^ i4) * 25905) ^ 1241604548;
                        i2 = 347008712;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1131934296:
                case 1986826351:
                    i9 = i8;
                    i10 = 0;
                    i12 = 0;
                    iM45029 = ThreadFactoryC3888.m11306("ۛ᩻") ^ i3;
                    i = ((iM45029 ^ i4) * 269) ^ 1246569200;
                    i2 = 562870597;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1454226315:
                case 1836157266:
                    if (C1875.f7103 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ֨") ^ i4;
                        i = ((iM45029 ^ i3) * (-21905)) ^ 722582342;
                        i2 = -834576513;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘ֨") + i4) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM45029 ^ i3) * (-17543)) ^ (-1181183737);
                        i2 = -298024653;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    cArr = new char[i17];
                    Arrays.fill(cArr, c);
                    if (C1377.f5749) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫᩵") ^ i4) * (-51);
                        i = ((iM45029 ^ i3) * 13435) ^ 468775620;
                        i2 = 906139514;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۫ۙ") ^ i4;
                        i = ((iM45029 ^ i3) * 14069) ^ 904695913;
                        i2 = -1531566514;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }
}
