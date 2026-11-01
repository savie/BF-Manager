package l;

import android.content.pm.PackageInfo;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.ۧᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2R7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11175 {

    /* JADX INFO: renamed from: ᩷ۛ᩹, reason: not valid java name and contains not printable characters */
    private static final short[] f37856 = {5751, -23297, -23376, -23391, -23366, -23297, -23376, -23391, -23366, -23390, -23390};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745[] f37857;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16819 f37858;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f37859;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f37860;

    /* JADX WARN: Code duplicated, block: B:53:0x0181  */
    /* JADX WARN: Code duplicated, block: B:61:0x01cb A[PHI: r12
      0x01cb: PHI (r12v3 long) = (r12v1 long), (r12v2 long), (r12v1 long) binds: [B:60:0x01c9, B:26:0x0094, B:12:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:69:0x0229  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m28107() {
        int iM45029;
        int i;
        int i2;
        AbstractC20745[] abstractC20745Arr = null;
        long j = 0;
        int length = 0;
        int i3 = 0;
        long j2 = 0;
        long jMo33964 = 0;
        long j3 = 0;
        int i4 = -1005450208;
        int i5 = AbstractC0464.f2088;
        int i6 = C10634.f36300;
        int iM450210 = C19806.m45029("֡ۤ") ^ i5;
        int i7 = ((iM450210 ^ i6) * (-13063)) ^ 1892980477;
        int i8 = iM450210 ^ 796733453;
        long jMo33965 = 0;
        long j4 = 0;
        while (true) {
            i4 = i8 ^ (i7 & (((i4 ^ i6) * 5845) >> 31));
            switch (i4) {
                case -2105028064:
                case 2032808330:
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM45029 = C19806.m45029("ۗۨ") ^ i5;
                        i = ((iM45029 ^ i6) * 2781) ^ 1120044257;
                        i2 = -499953053;
                    } else {
                        iM45029 = C19806.m45029("ܽۢ") ^ i5;
                        i = ((iM45029 ^ i6) * 15099) ^ (-150714176);
                        i2 = 206352499;
                    }
                    int i9 = i;
                    i8 = iM45029 ^ i2;
                    i7 = i9;
                    break;
                case -2086969307:
                case 358569253:
                    if (C2788.f10625 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚܿ") ^ i6) * 75;
                        i = ((iM45029 ^ i5) * (-7941)) ^ (-1135403857);
                        i2 = 665564657;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ܳ") ^ i5;
                        i = ((iM45029 ^ i6) * (-1601)) ^ (-1221153759);
                        i2 = -633067311;
                    }
                    int i10 = i;
                    i8 = iM45029 ^ i2;
                    i7 = i10;
                    break;
                case -2079915651:
                case 572893474:
                    return j4;
                case -2020729342:
                case 1412358161:
                    if (C3535.f13026 <= 0) {
                        iM45029 = C19806.m45029("ܽۡ") ^ i5;
                        i = ((iM45029 ^ i6) * 22689) ^ (-1713948635);
                        i2 = 1595299636;
                    } else {
                        iM45029 = (C19806.m45029("᩷ܶ") + i6) * (-123);
                        i = ((iM45029 ^ i5) * (-8029)) ^ 1332027683;
                        i2 = -609661310;
                    }
                    int i11 = i;
                    i8 = iM45029 ^ i2;
                    i7 = i11;
                    break;
                case -1901197251:
                case 1720788547:
                    if (i3 < length) {
                        iM45029 = (C19806.m45029("ۨܿ") + i6) * 85;
                        i = ((iM45029 ^ i5) * (-27925)) ^ (-768658045);
                        i2 = 1799467166;
                    } else {
                        j = j2;
                        iM45029 = C19806.m45029("᩺᩷") ^ i6;
                        i = ((iM45029 ^ i5) * 2955) ^ (-846583845);
                        i2 = -1906997646;
                    }
                    int i12 = i;
                    i8 = iM45029 ^ i2;
                    i7 = i12;
                    break;
                case -1391255583:
                case 271081223:
                    if (j4 != -1) {
                        iM45029 = ThreadFactoryC3888.m11306("֫᩷") ^ i6;
                        i = ((iM45029 ^ i5) * (-8689)) ^ 1475378431;
                        i2 = 990066490;
                    } else {
                        iM45029 = C19806.m45029("ۨ᩺") ^ i5;
                        i = ((iM45029 ^ i6) * 13711) ^ (-1885588468);
                        i2 = -1545162449;
                    }
                    int i13 = i;
                    i8 = iM45029 ^ i2;
                    i7 = i13;
                    break;
                case -1169080395:
                case 1034848637:
                    if (RunnableC1895.f7152) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸᩺") ^ i6;
                        i = ((iM45029 ^ i5) * (-10727)) ^ 1220452436;
                        i2 = -60920361;
                    } else {
                        iM45029 = C19806.m45029("ܽۡ") ^ i5;
                        i = ((iM45029 ^ i6) * 22689) ^ (-1713948635);
                        i2 = 1595299636;
                    }
                    int i14 = i;
                    i8 = iM45029 ^ i2;
                    i7 = i14;
                    break;
                case -778298197:
                case 610944139:
                    C7105.m18985();
                    iM45029 = C19806.m45029("ܽۡ") ^ i5;
                    i = ((iM45029 ^ i6) * 22689) ^ (-1713948635);
                    i2 = 1595299636;
                    int i15 = i;
                    i8 = iM45029 ^ i2;
                    i7 = i15;
                    break;
                case -457697462:
                case 640204159:
                    if (C1461.f5957 <= 0) {
                        iM45029 = C19806.m45029("ܽۡ") ^ i5;
                        i = ((iM45029 ^ i6) * 22689) ^ (-1713948635);
                        i2 = 1595299636;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨܽ") ^ i6;
                        i = ((iM45029 ^ i5) * (-18583)) ^ 1048730177;
                        i2 = -1436847077;
                    }
                    int i16 = i;
                    i8 = iM45029 ^ i2;
                    i7 = i16;
                    break;
                case -324772432:
                case 1548985804:
                    if (C3286.f12186) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸᩺") ^ i6;
                        i = ((iM45029 ^ i5) * (-10727)) ^ 1220452436;
                        i2 = -60920361;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢ֨") + i5) * 5;
                        i = ((iM45029 ^ i6) * 28971) ^ (-1549743845);
                        i2 = -1613142114;
                    }
                    int i17 = i;
                    i8 = iM45029 ^ i2;
                    i7 = i17;
                    break;
                case -262774427:
                case -92064812:
                    length = abstractC20745Arr.length;
                    j2 = jMo33965;
                    i3 = 0;
                    iM45029 = ThreadFactoryC3888.m11306("ۙ֨") ^ i5;
                    i = ((iM45029 ^ i6) * 6005) ^ 288524033;
                    i2 = -691247371;
                    int i18 = i;
                    i8 = iM45029 ^ i2;
                    i7 = i18;
                    break;
                case -211868268:
                case -75172198:
                    jMo33965 = this.f37860.mo33964();
                    abstractC20745Arr = this.f37857;
                    if (abstractC20745Arr != null) {
                        iM45029 = ThreadFactoryC3888.m11306("۠ܽ") ^ i5;
                        i = ((iM45029 ^ i6) * (-19011)) ^ (-1028727236);
                        i2 = -1472984545;
                    } else {
                        j = jMo33965;
                        iM45029 = C19806.m45029("᩺᩷") ^ i6;
                        i = ((iM45029 ^ i5) * 2955) ^ (-846583845);
                        i2 = -1906997646;
                    }
                    int i19 = i;
                    i8 = iM45029 ^ i2;
                    i7 = i19;
                    break;
                case -203287794:
                case 923377906:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = C19806.m45029("ܽۡ") ^ i5;
                        i = ((iM45029 ^ i6) * 22689) ^ (-1713948635);
                        i2 = 1595299636;
                    } else {
                        iM45029 = C19806.m45029("᩷ܺ") ^ i5;
                        i = ((iM45029 ^ i6) * (-2325)) ^ (-829549181);
                        i2 = 1212797827;
                    }
                    int i110 = i;
                    i8 = iM45029 ^ i2;
                    i7 = i110;
                    break;
                case -102222169:
                case 266124533:
                    i3++;
                    j2 = j3;
                    iM45029 = ThreadFactoryC3888.m11306("ۙ֨") ^ i5;
                    i = ((iM45029 ^ i6) * 6005) ^ 288524033;
                    i2 = -691247371;
                    int i111 = i;
                    i8 = iM45029 ^ i2;
                    i7 = i111;
                    break;
                case 125044567:
                case 1276628602:
                    AbstractC0464.m2313();
                    C0050.m946();
                    return 0L;
                case 129039860:
                case 2077648600:
                    jMo33964 = abstractC20745Arr[i3].mo33964();
                    if (RunnableC1564.m5345()) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸᩺") ^ i6;
                        i = ((iM45029 ^ i5) * (-10727)) ^ 1220452436;
                        i2 = -60920361;
                    } else {
                        iM45029 = C19806.m45029("᩷ۙ") ^ i5;
                        i = ((iM45029 ^ i6) * 8077) ^ (-529215507);
                        i2 = 2141912231;
                    }
                    int i112 = i;
                    i8 = iM45029 ^ i2;
                    i7 = i112;
                    break;
                case 131225252:
                case 827471140:
                    this.f37859 = j;
                    return j;
                case 231727476:
                case 1129963198:
                    if (C0216.m1591() <= 0) {
                        iM45029 = C19806.m45029("ܽۡ") ^ i5;
                        i = ((iM45029 ^ i6) * 22689) ^ (-1713948635);
                        i2 = 1595299636;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚܿ") ^ i6) * 75;
                        i = ((iM45029 ^ i5) * (-7941)) ^ (-1135403857);
                        i2 = 665564657;
                    }
                    int i113 = i;
                    i8 = iM45029 ^ i2;
                    i7 = i113;
                    break;
                case 434256599:
                case 525693458:
                    if (C1937.m6279() < 0) {
                        iM45029 = C19806.m45029("ܽۡ") ^ i5;
                        i = ((iM45029 ^ i6) * 22689) ^ (-1713948635);
                        i2 = 1595299636;
                    } else {
                        iM45029 = C19806.m45029("ۗۨ") ^ i5;
                        i = ((iM45029 ^ i6) * 2781) ^ 1120044257;
                        i2 = -499953053;
                    }
                    int i114 = i;
                    i8 = iM45029 ^ i2;
                    i7 = i114;
                    break;
                case 541068035:
                case 1998533193:
                    long j5 = this.f37859;
                    if (C3577.f13150 >= 0) {
                        j4 = j5;
                        iM45029 = (i5 - C19806.m45029("۟ܺ")) * 115;
                        i = ((iM45029 ^ i6) * 14721) ^ 1440209450;
                        i2 = -1441307949;
                        int i115 = i;
                        i8 = iM45029 ^ i2;
                        i7 = i115;
                    } else {
                        int iM450211 = (C19806.m45029("᩻᩷") + i6) * (-99);
                        j4 = j5;
                        i8 = iM450211 ^ 1725989761;
                        i7 = ((iM450211 ^ i5) * 10957) ^ 164151190;
                    }
                    break;
                case 667644098:
                case 2093995673:
                    j3 = j2 + jMo33964;
                    if (C19806.f63586) {
                        iM45029 = (i5 - C19806.m45029("۟ܺ")) * 115;
                        i = ((iM45029 ^ i6) * 14721) ^ 1440209450;
                        i2 = -1441307949;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻֫") + i6) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM45029 ^ i5) * (-26017)) ^ 2023155630;
                        i2 = -1291204092;
                    }
                    int i116 = i;
                    i8 = iM45029 ^ i2;
                    i7 = i116;
                    break;
                default:
                    if (C3577.m10565()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ֡") ^ i6;
                        i = ((iM45029 ^ i5) * 15463) ^ (-532096000);
                        i2 = 1290155661;
                    } else {
                        iM45029 = C19806.m45029("ۗۨ") ^ i5;
                        i = ((iM45029 ^ i6) * 2781) ^ 1120044257;
                        i2 = -499953053;
                    }
                    int i117 = i;
                    i8 = iM45029 ^ i2;
                    i7 = i117;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0085  */
    /* JADX WARN: Code duplicated, block: B:65:0x025e A[PHI: r4 r14
      0x025e: PHI (r4v4 java.lang.String) = (r4v2 java.lang.String), (r4v3 java.lang.String), (r4v2 java.lang.String) binds: [B:64:0x025c, B:41:0x017d, B:8:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:64:0x025c, B:41:0x017d, B:8:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0296 A[PHI: r20 r25
      0x0296: PHI (r20v4 int) = (r20v3 int), (r20v2 int), (r20v2 int) binds: [B:68:0x0294, B:11:0x0072, B:8:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r25v5 int) = (r25v4 int), (r25v3 int), (r25v3 int) binds: [B:68:0x0294, B:11:0x0072, B:8:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x02ea A[PHI: r17
      0x02ea: PHI (r17v4 char) = (r17v3 char), (r17v2 char) binds: [B:76:0x02e8, B:14:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0320 A[PHI: r2 r3 r8 r9 r10 r11 r12 r16 r18 r19
      0x0320: PHI (r2v4 java.lang.String) = 
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v3 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
     binds: [B:80:0x031e, B:72:0x02cc, B:53:0x01e6, B:49:0x01c0, B:45:0x019e, B:26:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x0320: PHI (r3v4 java.lang.String) = 
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v3 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
     binds: [B:80:0x031e, B:72:0x02cc, B:53:0x01e6, B:49:0x01c0, B:45:0x019e, B:26:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x0320: PHI (r8v4 short[]) = (r8v2 short[]), (r8v2 short[]), (r8v2 short[]), (r8v2 short[]), (r8v3 short[]), (r8v2 short[]) binds: [B:80:0x031e, B:72:0x02cc, B:53:0x01e6, B:49:0x01c0, B:45:0x019e, B:26:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x0320: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:80:0x031e, B:72:0x02cc, B:53:0x01e6, B:49:0x01c0, B:45:0x019e, B:26:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x0320: PHI (r10v3 short[]) = (r10v2 short[]), (r10v2 short[]), (r10v2 short[]), (r10v2 short[]), (r10v2 short[]), (r10v4 short[]) binds: [B:80:0x031e, B:72:0x02cc, B:53:0x01e6, B:49:0x01c0, B:45:0x019e, B:26:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x0320: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v4 int) binds: [B:80:0x031e, B:72:0x02cc, B:53:0x01e6, B:49:0x01c0, B:45:0x019e, B:26:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x0320: PHI (r12v3 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v4 int) binds: [B:80:0x031e, B:72:0x02cc, B:53:0x01e6, B:49:0x01c0, B:45:0x019e, B:26:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x0320: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:80:0x031e, B:72:0x02cc, B:53:0x01e6, B:49:0x01c0, B:45:0x019e, B:26:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x0320: PHI (r18v4 short) = (r18v2 short), (r18v3 short), (r18v2 short), (r18v2 short), (r18v2 short), (r18v2 short) binds: [B:80:0x031e, B:72:0x02cc, B:53:0x01e6, B:49:0x01c0, B:45:0x019e, B:26:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x0320: PHI (r19v4 short) = (r19v2 short), (r19v3 short), (r19v2 short), (r19v2 short), (r19v2 short), (r19v2 short) binds: [B:80:0x031e, B:72:0x02cc, B:53:0x01e6, B:49:0x01c0, B:45:0x019e, B:26:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m28105() {
        int iM11306;
        int i;
        int i2;
        String strM10567;
        int i3 = C1461.f5957;
        int i4 = C2788.f10625;
        int iM11307 = ThreadFactoryC3888.m11306("᩹۬") ^ i4;
        int i5 = ((iM11307 ^ i3) * 31777) ^ (-1750333399);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM11307 ^ (-254277715);
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i12 = 0;
        int i13 = -1691600380;
        int i14 = 0;
        String str = null;
        String strM10964 = null;
        AbstractC20745[] abstractC20745Arr = null;
        String strM2424 = null;
        String strM9716 = null;
        String strM12599 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i3) * 31471) >> 31));
            switch (i13) {
                case -2049064252:
                case -305709446:
                    C0629.m2907();
                    return null;
                case -2043522746:
                case 1077132633:
                    if (abstractC20745Arr == null) {
                        str = strM12599;
                        iM11306 = ThreadFactoryC3888.m11306("ۤ۠") ^ i3;
                        i = ((iM11306 ^ i4) * (-32399)) ^ 979087770;
                        i2 = 2035068881;
                    } else {
                        iM11306 = C19806.m45029("֡ܶ") ^ i4;
                        i = ((iM11306 ^ i3) * (-27079)) ^ 428407363;
                        i2 = 2111420135;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1955393046:
                case -815307723:
                    sArr2 = f37856;
                    i7 = 1;
                    if (C3577.f13150 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۖ") ^ i4;
                        i = ((iM11306 ^ i3) * (-5061)) ^ 1835962872;
                        i2 = 1034525834;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܰ᩶")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM11306 ^ i4) * 24737) ^ 1142562309;
                        i2 = 1285455120;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1562609829:
                case -515163053:
                    s = sArr[c];
                    s2 = 18846;
                    if (C1668.f6641 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۖ") ^ i4;
                        i = ((iM11306 ^ i3) * (-5061)) ^ 1835962872;
                        i2 = 1034525834;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨۜ") ^ i3;
                        i = ((iM11306 ^ i4) * (-4609)) ^ 182068629;
                        i2 = -502162937;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1472730748:
                case 2090495751:
                    sArr3 = f37856;
                    i8 = 10;
                    i9 = 1;
                    if (C2642.f10294 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۖ") ^ i4;
                        i = ((iM11306 ^ i3) * (-5061)) ^ 1835962872;
                        i2 = 1034525834;
                    } else {
                        iM11306 = C19806.m45029("ܶ֨") ^ i4;
                        i = ((iM11306 ^ i3) * (-1349)) ^ 1575784376;
                        i2 = -1631434709;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1166771376:
                case 453754042:
                    i12 = s * s2;
                    i14 = s * s;
                    if (C1668.f6641 >= 0) {
                        iM11306 = (C19806.m45029("ۢܽ") + i3) * 109;
                        i = ((iM11306 ^ i4) * (-5487)) ^ (-1247108684);
                        i2 = 429332093;
                    } else {
                        iM11306 = (C19806.m45029("ۧۗ") + i4) * (-25);
                        i = ((iM11306 ^ i3) * 20565) ^ 594210876;
                        i2 = 879563758;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1158792677:
                case 799076895:
                    C3286.m9798();
                    if (C7105.m18985()) {
                        iM11306 = C19806.m45029("۫ۤ") ^ i4;
                        i = ((iM11306 ^ i3) * 17953) ^ 732867346;
                        i2 = 1345582411;
                    } else {
                        iM11306 = (C19806.m45029("ܿ۠") + i4) * 79;
                        i = ((iM11306 ^ i3) * (-23771)) ^ 251634197;
                        i2 = -1154210164;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1154899831:
                case 846226319:
                    C3743.m10966();
                    if (C3660.m10791() == 0) {
                        iM11306 = C19806.m45029("۫ۤ") ^ i4;
                        i = ((iM11306 ^ i3) * 17953) ^ 732867346;
                        i2 = 1345582411;
                    } else {
                        iM11306 = (C19806.m45029("ۢܽ") + i3) * 109;
                        i = ((iM11306 ^ i4) * (-5487)) ^ (-1247108684);
                        i2 = 429332093;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1103770027:
                case 1859118306:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    C0817.m3399();
                    iM11306 = C19806.m45029("۫ۤ") ^ i4;
                    i = ((iM11306 ^ i3) * 17953) ^ 732867346;
                    i2 = 1345582411;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1007958273:
                case 604295469:
                    strM10567 = ViewTreeObserverOnPreDrawListenerC3327.m9865(strM12599, strM10964);
                    str = strM10567;
                    iM11306 = ThreadFactoryC3888.m11306("ۤ۠") ^ i3;
                    i = ((iM11306 ^ i4) * (-32399)) ^ 979087770;
                    i2 = 2035068881;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -993020675:
                case 1190915180:
                    boolean zM6176 = RunnableC1895.m6176(strM9716, strM2424);
                    abstractC20745Arr = this.f37857;
                    if (zM6176) {
                        iM11306 = (C19806.m45029("ܺܶ") + i4) * 43;
                        i = ((iM11306 ^ i3) * (-8809)) ^ 316461644;
                        i2 = -1350831009;
                    } else {
                        iM11306 = C19806.m45029("ۧۡ") ^ i3;
                        i = ((iM11306 ^ i4) * (-6409)) ^ 1262717000;
                        i2 = -1966328112;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -979404010:
                case 719564193:
                    if ((i14 + i10) - i12 < 0) {
                        iM11306 = (C19806.m45029("֨᩹") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM11306 ^ i3) * 6711) ^ 2037470940;
                        i2 = 1767407561;
                    } else {
                        iM11306 = C19806.m45029("ۖ۟") ^ i4;
                        i = ((iM11306 ^ i3) * (-19361)) ^ (-1059283918);
                        i2 = 328850556;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -965219229:
                case 942487701:
                    i11 = 42193;
                    iM11306 = C19806.m45029("ۙܳ") ^ i3;
                    i = ((iM11306 ^ i4) * 17523) ^ (-1329039216);
                    i2 = 326167545;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -963784507:
                case 804819748:
                    i10 = 88792929;
                    if (C0216.f1393 != 0) {
                        iM11306 = (C19806.m45029("ۨܳ") + i3) * 61;
                        i = ((iM11306 ^ i4) * 23431) ^ 430051750;
                        i2 = 572787001;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ۨ") ^ i3) * 9;
                        i = ((iM11306 ^ i4) * (-15197)) ^ 1549130847;
                        i2 = 829573263;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -725093521:
                case 1926072465:
                    strM10964 = C3743.m10964(f37856, 5, 5, i11);
                    iM11306 = (C19806.m45029("᩸᩸") + i3) * (-43);
                    i = ((iM11306 ^ i4) * (-6047)) ^ (-1779131781);
                    i2 = 41202098;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -397955833:
                case 1194396261:
                    if (C0278.f1572 <= 0) {
                        iM11306 = (C19806.m45029("ۢܽ") + i3) * 109;
                        i = ((iM11306 ^ i4) * (-5487)) ^ (-1247108684);
                        i2 = 429332093;
                    } else {
                        iM11306 = (C19806.m45029("ۨܳ") + i3) * 61;
                        i = ((iM11306 ^ i4) * 23431) ^ 430051750;
                        i2 = 572787001;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 247173483:
                case 529094768:
                    c = 0;
                    if (CallableC1627.f6528) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩺ۧ")) * 119;
                        i = ((iM11306 ^ i4) * 10601) ^ 73771876;
                        i2 = -1219322367;
                    } else {
                        iM11306 = (C19806.m45029("ܿ۠") + i4) * 79;
                        i = ((iM11306 ^ i3) * (-23771)) ^ 251634197;
                        i2 = -1154210164;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 535288131:
                case 963086051:
                    strM2424 = C0526.m2424(sArr2, i7, 4, i11);
                    if (C3743.f13569) {
                        iM11306 = (C19806.m45029("ܰܰ") + i4) * 87;
                        i = ((iM11306 ^ i3) * (-25335)) ^ 1888230000;
                        i2 = 1890602055;
                    } else {
                        iM11306 = (C19806.m45029("ۨܳ") + i3) * 61;
                        i = ((iM11306 ^ i4) * 23431) ^ 430051750;
                        i2 = 572787001;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 556355086:
                case 1687459949:
                    return C1668.m5585(ViewOnClickListenerC4514.m12582(), str);
                case 603729767:
                case 624285416:
                    sArr = f37856;
                    if (C0526.m2437() >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۖ") ^ i4;
                        i = ((iM11306 ^ i3) * (-5061)) ^ 1835962872;
                        i2 = 1034525834;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("᩵ܳ")) * 23;
                        i = ((iM11306 ^ i3) * 30335) ^ (-825737202);
                        i2 = 915886755;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 739317786:
                case 1326814946:
                    strM9716 = MenuItemOnMenuItemClickListenerC3244.m9716(strM12599);
                    if (C1398.f5802 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۖ") ^ i4;
                        i = ((iM11306 ^ i3) * (-5061)) ^ 1835962872;
                        i2 = 1034525834;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡܿ") ^ i3) * 81;
                        i = ((iM11306 ^ i4) * (-31611)) ^ (-1901403272);
                        i2 = 1934583559;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 926992298:
                case 1261193167:
                    strM10567 = C3577.m10567(strM12599, C19806.m45020(sArr3, i8, i9, i11));
                    str = strM10567;
                    iM11306 = ThreadFactoryC3888.m11306("ۤ۠") ^ i3;
                    i = ((iM11306 ^ i4) * (-32399)) ^ 979087770;
                    i2 = 2035068881;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1223981742:
                case 1997806886:
                    i11 = Scalar25519.L4;
                    iM11306 = C19806.m45029("ۙܳ") ^ i3;
                    i = ((iM11306 ^ i4) * 17523) ^ (-1329039216);
                    i2 = 326167545;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1259670816:
                case 2138510093:
                    strM12599 = ViewOnClickListenerC4514.m12599(this.f37858);
                    if (RunnableC1895.m6170() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۖ") ^ i4;
                        i = ((iM11306 ^ i3) * (-5061)) ^ 1835962872;
                        i2 = 1034525834;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ܿܺ")) * 55;
                        i = ((iM11306 ^ i3) * 3687) ^ 1786543002;
                        i2 = -1187564273;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    if (abstractC20745Arr == null) {
                        strM10964 = strM2424;
                        iM11306 = (C19806.m45029("᩸᩸") + i3) * (-43);
                        i = ((iM11306 ^ i4) * (-6047)) ^ (-1779131781);
                        i2 = 41202098;
                    } else {
                        iM11306 = C19806.m45029("ۢܶ") ^ i3;
                        i = ((iM11306 ^ i4) * 31941) ^ (-473211941);
                        i2 = 715680166;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0394  */
    /* JADX WARN: Code duplicated, block: B:104:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:112:0x0417  */
    /* JADX WARN: Code duplicated, block: B:120:0x046a  */
    /* JADX WARN: Code duplicated, block: B:124:0x049d  */
    /* JADX WARN: Code duplicated, block: B:128:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:12:0x005f  */
    /* JADX WARN: Code duplicated, block: B:132:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:52:0x018f  */
    /* JADX WARN: Code duplicated, block: B:80:0x02ba  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28106(AbstractC20745 abstractC20745, InterfaceC10389 interfaceC10389) throws Throwable {
        int iM11306;
        int i;
        int i2;
        int i3 = C2124.f7782;
        int i4 = C3577.f13150;
        int iM45029 = (C19806.m45029("ܰۨ") + i3) * (-59);
        int i5 = ((iM45029 ^ i4) * 25669) ^ (-570774149);
        Throwable th = null;
        Object obj = null;
        AbstractC20745 abstractC20746 = null;
        int i6 = iM45029 ^ 194968889;
        C22918 c22918 = null;
        int length = 0;
        int i7 = 0;
        boolean zM9866 = false;
        int i8 = -923558069;
        AbstractC20745[] abstractC20745Arr = null;
        Throwable th2 = null;
        AbstractC20745 abstractC20747 = null;
        int i9 = 0;
        while (true) {
            i8 = i6 ^ (i5 & (((i8 ^ i4) * 4231) >> 31));
            switch (i8) {
                case -2092097416:
                case -1832481218:
                    try {
                        C0526.m2434(c22918);
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܽܰ")) * (-9);
                        i = ((iM11306 ^ i3) * 7073) ^ 1777894735;
                        i2 = -574348988;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                    } catch (Throwable th3) {
                        int iM450210 = C19806.m45029("֫ۙ") ^ i3;
                        i6 = iM450210 ^ 650250976;
                        obj = th3;
                        i5 = ((iM450210 ^ i4) * (-7853)) ^ (-394435038);
                    }
                    break;
                case -2080871840:
                case 1393880580:
                    throw th2;
                case -2076376437:
                case 91700837:
                    c22918.m50722(i9);
                    C3660.m10779(c22918, C3743.m10959(abstractC20747));
                    abstractC20747.m46696(c22918.m50720(), interfaceC10389);
                    length = abstractC20745Arr.length;
                    iM11306 = (i4 - C19806.m45029("ۤۤ")) * 23;
                    i = ((iM11306 ^ i3) * (-5719)) ^ (-1585233035);
                    i2 = 1484880013;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1944980127:
                case 1794807887:
                    C1189.m4368();
                    if (C2332.f8260) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩶ۗ")) * 31;
                        i = ((iM11306 ^ i4) * (-17203)) ^ (-564970138);
                        i2 = 1274814744;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨܰ") ^ i4;
                        i = ((iM11306 ^ i3) * 4909) ^ 1241193579;
                        i2 = -103563933;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1929287039:
                case 1701697334:
                    if (C3535.f13026 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨܰ") ^ i4;
                        i = ((iM11306 ^ i3) * 4909) ^ 1241193579;
                        i2 = -103563933;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙۖ") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM11306 ^ i4) * 27535) ^ (-620955133);
                        i2 = 1270503381;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1903270995:
                case 801574616:
                    if (i7 < length) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ۘ") ^ i4;
                        i = ((iM11306 ^ i3) * (-4219)) ^ 2063748407;
                        i2 = 1582770653;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ᩸") ^ i3;
                        i = ((iM11306 ^ i4) * 8105) ^ 1162677568;
                        i2 = 1597354699;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1835519184:
                case -1778606578:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (C19806.f63586) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ۜ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM11306 ^ i3) * (-32187)) ^ (-252919271);
                        i2 = -1264103333;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ܶ۟")) * 119;
                        i = ((iM11306 ^ i3) * (-20179)) ^ (-1975931928);
                        i2 = -1328764189;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1752516211:
                case -34346894:
                    CallableC1627.m5507();
                    if (C3743.f13569) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽ۠") ^ i4;
                        i = ((iM11306 ^ i3) * 29355) ^ (-481307593);
                        i2 = 254884638;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩵۫")) * (-5);
                        i = ((iM11306 ^ i4) * (-26073)) ^ 1164288765;
                        i2 = -2131130371;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1741159029:
                case 1988509671:
                    if (C16737.m39280()) {
                        iM11306 = (C19806.m45029("ۤۜ") ^ i3) * (-47);
                        i = ((iM11306 ^ i4) * (-7153)) ^ 1122182748;
                        i2 = 1452832421;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۨܶ")) * (-63);
                        i = ((iM11306 ^ i3) * (-3877)) ^ 411733802;
                        i2 = 126203734;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1718665430:
                case 755987376:
                    abstractC20745.mo24644();
                    iM11306 = (ThreadFactoryC3888.m11306("ۧ᩹") ^ i4) * (-115);
                    i = ((iM11306 ^ i3) * (-14691)) ^ 103785818;
                    i2 = -1564581509;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1707804802:
                case 329832355:
                    if (C0797.m3359()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘۢ") ^ i4;
                        i = ((iM11306 ^ i3) * 16319) ^ (-2111327213);
                        i2 = 1559742212;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩵۫")) * (-5);
                        i = ((iM11306 ^ i4) * (-26073)) ^ 1164288765;
                        i2 = -2131130371;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1678945347:
                case 792421117:
                    abstractC20747 = this.f37860;
                    abstractC20745Arr = this.f37857;
                    if (abstractC20745Arr == null) {
                        iM11306 = C19806.m45029("ۨۨ") ^ i3;
                        i = ((iM11306 ^ i4) * (-30749)) ^ (-1859062294);
                        i2 = -1055662531;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ܶۖ")) * (-41);
                        i = ((iM11306 ^ i3) * (-3845)) ^ (-1074645066);
                        i2 = -180546757;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1598022846:
                case -685335978:
                    throw th;
                case -1507499437:
                case 1591802271:
                    if (C0216.f1393 != 0) {
                        iM11306 = (i4 - C19806.m45029("ܶ۟")) * 119;
                        i = ((iM11306 ^ i3) * (-20179)) ^ (-1975931928);
                        i2 = -1328764189;
                    } else {
                        iM11306 = (C19806.m45029("ܰ᩹") ^ i3) * 21;
                        i = ((iM11306 ^ i4) * 25439) ^ 12180207;
                        i2 = -34324243;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1479342038:
                case -1465372243:
                    if (C2249.f8050 < 0) {
                        iM11306 = (C19806.m45029("۟ۗ") + i4) * 3;
                        i = ((iM11306 ^ i3) * (-18029)) ^ 1863602838;
                        i2 = -560830541;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸ۘ") ^ i3) * (-5);
                        i = ((iM11306 ^ i4) * (-19167)) ^ (-2072966444);
                        i2 = 638957960;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1397148842:
                case -831118282:
                    abstractC20745.mo24644();
                    return;
                case -1297828553:
                case 1868981131:
                    try {
                        C3660.m10779(c22918, C2642.m8160(abstractC20746));
                        abstractC20746.m46696(c22918.m50720(), interfaceC10389);
                        iM11306 = C19806.m45029("۟ۡ") ^ i3;
                        i = ((iM11306 ^ i4) * 1087) ^ 1844751381;
                        i2 = 188004669;
                    } catch (Throwable th4) {
                        th2 = th4;
                        iM11306 = (ThreadFactoryC3888.m11306("ܽۚ") ^ i4) * (-69);
                        i = ((iM11306 ^ i3) * (-4211)) ^ 1210040539;
                        i2 = -975222494;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1288800587:
                case 151181769:
                    abstractC20745.mo24644();
                    iM11306 = (i4 - ThreadFactoryC3888.m11306("ۨܶ")) * (-63);
                    i = ((iM11306 ^ i3) * (-3877)) ^ 411733802;
                    i2 = 126203734;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1232566986:
                case -421162540:
                    abstractC20747.m46701(abstractC20745, (C5222) null, interfaceC10389);
                    if (C3577.m10564(interfaceC10389)) {
                        iM11306 = C19806.m45029("᩹۫") ^ i3;
                        i = ((iM11306 ^ i4) * (-17017)) ^ (-995683610);
                        i2 = -1175545425;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫ܿ") ^ i4;
                        i = ((iM11306 ^ i3) * 8599) ^ (-107049896);
                        i2 = -330588160;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1208788808:
                case -983414319:
                    if (zM9866) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ᩸") ^ i3;
                        i = ((iM11306 ^ i4) * 8105) ^ 1162677568;
                        i2 = 1597354699;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("᩶᩵")) * 95;
                        i = ((iM11306 ^ i3) * 22929) ^ (-2135207829);
                        i2 = 529989735;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1188366086:
                case -407189603:
                    if (C2124.f7782 <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩶ۗ")) * 31;
                        i = ((iM11306 ^ i4) * (-17203)) ^ (-564970138);
                        i2 = 1274814744;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺᩺") ^ i3;
                        i = ((iM11306 ^ i4) * 19321) ^ (-1263343995);
                        i2 = -307478987;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1065855698:
                case -605151246:
                    try {
                        c22918 = new C22918(abstractC20745);
                        iM11306 = (ThreadFactoryC3888.m11306("ۢ᩹") ^ i3) * 35;
                        i = ((iM11306 ^ i4) * 28385) ^ 1832861222;
                        i2 = 2013368670;
                    } catch (Throwable th5) {
                        th = th5;
                        c22918 = null;
                        iM11306 = C19806.m45029("ۚۚ") ^ i4;
                        i = ((iM11306 ^ i3) * (-621)) ^ 1963868128;
                        i2 = 1816532576;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1036317403:
                case 1364802149:
                    C0629.m2911(th2, obj);
                    iM11306 = (i4 - ThreadFactoryC3888.m11306("ܽܰ")) * (-9);
                    i = ((iM11306 ^ i3) * 7073) ^ 1777894735;
                    i2 = -574348988;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -996585300:
                case 674086393:
                    abstractC20746 = abstractC20745Arr[i7];
                    zM9866 = ViewTreeObserverOnPreDrawListenerC3327.m9866(interfaceC10389);
                    iM11306 = (ThreadFactoryC3888.m11306("۫ܽ") ^ i3) * 33;
                    i = ((iM11306 ^ i4) * (-22701)) ^ (-315690025);
                    i2 = -587888031;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -980213157:
                case -158625933:
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9866(interfaceC10389)) {
                        iM11306 = (i3 - C19806.m45029("᩺᩷")) * (-7);
                        i = ((iM11306 ^ i4) * 10977) ^ 1924916215;
                        i2 = 593084276;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧ᩹") ^ i4) * (-115);
                        i = ((iM11306 ^ i3) * (-14691)) ^ 103785818;
                        i2 = -1564581509;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -969253283:
                case 15427168:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚ᩷") ^ i3) * 69;
                        i = ((iM11306 ^ i4) * 18129) ^ (-193044787);
                        i2 = -1492250093;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚۖ") ^ i3) * (-11);
                        i = ((iM11306 ^ i4) * (-15319)) ^ (-1254861937);
                        i2 = 564205265;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -904440958:
                case 908469249:
                    RunnableC0195.m1431();
                    iM11306 = (C19806.m45029("۟ۗ") + i4) * 3;
                    i = ((iM11306 ^ i3) * (-18029)) ^ 1863602838;
                    i2 = -560830541;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -796079733:
                case -507367267:
                    if (C19806.f63586) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚۖ") ^ i3) * (-11);
                        i = ((iM11306 ^ i4) * (-15319)) ^ (-1254861937);
                        i2 = 564205265;
                    } else {
                        iM11306 = C19806.m45029("۫ܳ") ^ i4;
                        i = ((iM11306 ^ i3) * (-7417)) ^ 1152327260;
                        i2 = -1003657628;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -773063161:
                case 2091902164:
                    i7++;
                    iM11306 = C19806.m45029("ᩳۢ") ^ i3;
                    i = ((iM11306 ^ i4) * 15403) ^ (-1537979864);
                    i2 = 1482666524;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -699956574:
                case 1732851609:
                    if (C7105.m18985()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨܰ") ^ i4;
                        i = ((iM11306 ^ i3) * 4909) ^ 1241193579;
                        i2 = -103563933;
                    } else {
                        iM11306 = (C19806.m45029("֫ۢ") ^ i4) * (-41);
                        i = ((iM11306 ^ i3) * 24769) ^ 240706736;
                        i2 = -1943456666;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -665836766:
                case 1649194447:
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9866(interfaceC10389)) {
                        iM11306 = (i4 - C19806.m45029("۟ۜ")) * 43;
                        i = ((iM11306 ^ i3) * (-12113)) ^ (-1632047573);
                        i2 = 156757019;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۨܶ")) * (-63);
                        i = ((iM11306 ^ i3) * (-3877)) ^ 411733802;
                        i2 = 126203734;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -533293933:
                case 819260547:
                    return;
                case -446739189:
                case 574548042:
                    i9 = 3;
                    iM11306 = (C19806.m45029("۠᩻") + i3) * (-95);
                    i = ((iM11306 ^ i4) * (-18699)) ^ (-786840233);
                    i2 = -1719179005;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 251149618:
                case 979055258:
                    RunnableC3388.m10064();
                    C0671.m3008();
                    return;
                case 279681578:
                case 887045869:
                    if (C3722.m10894() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚۖ") ^ i3) * (-11);
                        i = ((iM11306 ^ i4) * (-15319)) ^ (-1254861937);
                        i2 = 564205265;
                    } else {
                        iM11306 = (C19806.m45029("ܺۢ") ^ i3) * (-35);
                        i = ((iM11306 ^ i4) * (-22521)) ^ 402432399;
                        i2 = -2136505191;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 336612548:
                case 1144132389:
                    C2704.m8255();
                    if (C3743.f13569) {
                        iM11306 = C19806.m45029("ۘܰ") ^ i3;
                        i = ((iM11306 ^ i4) * (-32019)) ^ 1510181511;
                        i2 = -550277890;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸ۘ") ^ i3) * (-5);
                        i = ((iM11306 ^ i4) * (-19167)) ^ (-2072966444);
                        i2 = 638957960;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 627459182:
                case 1593169821:
                    if (C0797.f3386) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ۜ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM11306 ^ i3) * (-32187)) ^ (-252919271);
                        i2 = -1264103333;
                    } else {
                        iM11306 = C19806.m45029("ᩳ۟") ^ i4;
                        i = ((iM11306 ^ i3) * (-25735)) ^ (-247833905);
                        i2 = -41464058;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 682547990:
                case 1892361448:
                    try {
                        C0526.m2434(c22918);
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴᩴ") ^ i3) * 43;
                        i = ((iM11306 ^ i4) * (-11303)) ^ (-100745833);
                        i2 = -822506373;
                    } catch (Throwable th6) {
                        th = th6;
                        iM11306 = C19806.m45029("ۚۚ") ^ i4;
                        i = ((iM11306 ^ i3) * (-621)) ^ 1963868128;
                        i2 = 1816532576;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 721358538:
                case 1402505227:
                    C0216.m1591();
                    if (C1398.f5802 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨܰ") ^ i4;
                        i = ((iM11306 ^ i3) * 4909) ^ 1241193579;
                        i2 = -103563933;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽ۠") ^ i4;
                        i = ((iM11306 ^ i3) * 29355) ^ (-481307593);
                        i2 = 254884638;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 814560078:
                case 1347735081:
                    RunnableC1606.m5473();
                    if (C0797.f3386) {
                        iM11306 = (C19806.m45029("۟ۗ") + i4) * 3;
                        i = ((iM11306 ^ i3) * (-18029)) ^ 1863602838;
                        i2 = -560830541;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ۜ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM11306 ^ i3) * (-32187)) ^ (-252919271);
                        i2 = -1264103333;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 823896515:
                case 1662919288:
                    if (C1875.f7103 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ۜ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM11306 ^ i3) * (-32187)) ^ (-252919271);
                        i2 = -1264103333;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩶ۗ")) * 31;
                        i = ((iM11306 ^ i4) * (-17203)) ^ (-564970138);
                        i2 = 1274814744;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 842346631:
                case 1954432079:
                    if (C0216.m1591() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸ۘ") ^ i3) * (-5);
                        i = ((iM11306 ^ i4) * (-19167)) ^ (-2072966444);
                        i2 = 638957960;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۛۢ")) * (-17);
                        i = ((iM11306 ^ i3) * 13363) ^ (-1387067862);
                        i2 = -1463373698;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1558319686:
                case 1820405834:
                    abstractC20745.mo32855(C1460.m5059());
                    return;
                default:
                    i7 = 0;
                    iM11306 = C19806.m45029("ᩳۢ") ^ i3;
                    i = ((iM11306 ^ i4) * 15403) ^ (-1537979864);
                    i2 = 1482666524;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    public C11175(C16819 c16819) {
        PackageInfo packageInfo = null;
        String str = null;
        int i = 0;
        AbstractC20745 abstractC20745M6171 = null;
        String[] strArr = null;
        InterfaceC5046 map = null;
        Object[] array = null;
        int i2 = 2134601498;
        int i3 = C3722.f13525;
        int i4 = C0278.f1572;
        int iM45029 = C19806.m45029("۟᩹") ^ i3;
        int i5 = ((iM45029 ^ i4) * (-23241)) ^ 319749187;
        int i6 = 1148275788;
        while (true) {
            i2 = ((((i2 ^ i4) * (-28103)) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -2132789170:
                case -775009564:
                    RunnableC1564.m5345();
                    throw new RuntimeException();
                case -1897032397:
                case 677385357:
                    strArr = c16819.f53841.applicationInfo.splitSourceDirs;
                    if (strArr != null) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ܺ᩺")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM45029 ^ i3) * (-16745)) ^ 1105976430;
                        i6 = -346306782;
                    } else {
                        iM45029 = C19806.m45029("ۨ᩻") ^ i4;
                        i5 = ((iM45029 ^ i3) * 14473) ^ (-111535489);
                        i6 = -295064809;
                    }
                    break;
                case -1665995708:
                case 300469033:
                    array = map.toArray(new C6235());
                    if (C10634.f36300 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳܳ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 8513) ^ (-479707577);
                        i6 = -716121897;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰۡ") ^ i3) * 123;
                        i5 = ((iM45029 ^ i4) * (-30745)) ^ (-773923394);
                        i6 = -1710013613;
                    }
                    break;
                case -1437435682:
                case 674393152:
                    if (C3722.f13525 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳܳ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 8513) ^ (-479707577);
                        i6 = -716121897;
                    } else {
                        iM45029 = C19806.m45029("ۚ֡") ^ i3;
                        i5 = ((iM45029 ^ i4) * 23297) ^ (-288850416);
                        i6 = -189749447;
                    }
                    break;
                case -1377964790:
                case -937107312:
                    if (C3660.f13403 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ᩷") + i3) * 77;
                        i5 = ((iM45029 ^ i4) * (-16697)) ^ 2022661726;
                        i6 = 268743167;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰۨ") + i4) * 43;
                        i5 = ((iM45029 ^ i3) * (-13167)) ^ 204729171;
                        i6 = 713004941;
                    }
                    break;
                case -1297310365:
                case -1219135262:
                    InterfaceC5046 interfaceC5046Stream = C20318.stream(strArr);
                    if (C1377.f5749) {
                        map = interfaceC5046Stream.map(new C8215(1));
                        if (C10634.f36300 >= 0) {
                            iM45029 = C19806.m45029("ۚ֡") ^ i3;
                            i5 = ((iM45029 ^ i4) * 23297) ^ (-288850416);
                            i6 = -189749447;
                        } else {
                            iM45029 = (i4 - C19806.m45029("ۚۢ")) * 99;
                            i5 = ((iM45029 ^ i3) * (-581)) ^ 784729104;
                            i6 = -133992519;
                        }
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰۨ") + i4) * 43;
                        i5 = ((iM45029 ^ i3) * (-13167)) ^ 204729171;
                        i6 = 713004941;
                    }
                    break;
                case -806887756:
                case -648298568:
                    C1377.m4833();
                    iM45029 = C19806.m45029("ۚ֡") ^ i3;
                    i5 = ((iM45029 ^ i4) * 23297) ^ (-288850416);
                    i6 = -189749447;
                    break;
                case -241323792:
                case -112395046:
                    str = packageInfo.applicationInfo.sourceDir;
                    if (C3722.m10894() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰۨ") + i4) * 43;
                        i5 = ((iM45029 ^ i3) * (-13167)) ^ 204729171;
                        i6 = 713004941;
                    } else {
                        iM45029 = (C19806.m45029("ܶ᩺") ^ i3) * 43;
                        i5 = ((iM45029 ^ i4) * 30069) ^ 1440218085;
                        i6 = 1471243538;
                    }
                    break;
                case -216114973:
                case 710954498:
                    this.f37857 = null;
                    return;
                case -136673944:
                case 1596908871:
                    this.f37858 = c16819;
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰۨ") + i4) * 43;
                        i5 = ((iM45029 ^ i3) * (-13167)) ^ 204729171;
                        i6 = 713004941;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢۜ") + i4) * (-39);
                        i5 = ((iM45029 ^ i3) * 23641) ^ 877481252;
                        i6 = -508096514;
                    }
                    break;
                case -127782290:
                case 1887074309:
                    this.f37860 = abstractC20745M6171;
                    if (C0817.f3443) {
                        iM45029 = (C19806.m45029("ܳۚ") ^ i3) * 3;
                        i5 = ((iM45029 ^ i4) * 30805) ^ 839089166;
                        i6 = 1478254874;
                    } else {
                        iM45029 = (C19806.m45029("ۖܰ") ^ i4) * (-107);
                        i5 = ((iM45029 ^ i3) * 16355) ^ 1586777199;
                        i6 = 79362847;
                    }
                    break;
                case -83946898:
                case 1628411116:
                    this.f37859 = -1L;
                    if (C1937.f7317 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰۨ") + i4) * 43;
                        i5 = ((iM45029 ^ i3) * (-13167)) ^ 204729171;
                        i6 = 713004941;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۛ۠")) * (-3);
                        i5 = ((iM45029 ^ i4) * (-18709)) ^ (-1754841875);
                        i6 = -794226714;
                    }
                    break;
                case 198813664:
                case 824595411:
                    if (strArr.length == 0) {
                        iM45029 = C19806.m45029("ۨ᩻") ^ i4;
                        i5 = ((iM45029 ^ i3) * 14473) ^ (-111535489);
                        i6 = -295064809;
                    } else {
                        iM45029 = C19806.m45029("᩵ۛ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-25123)) ^ 2036573934;
                        i6 = -1747873345;
                    }
                    break;
                case 263360776:
                case 1661723015:
                    packageInfo = c16819.f53841;
                    if (C1066.f4915 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳܳ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 8513) ^ (-479707577);
                        i6 = -716121897;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ۫") ^ i4;
                        i5 = ((iM45029 ^ i3) * 20593) ^ (-545020585);
                        i6 = -465886003;
                    }
                    break;
                case 309961260:
                case 469627224:
                    i = 0;
                    if (C1398.m4895() <= 0) {
                        iM45029 = (C19806.m45029("ۖܰ") ^ i4) * (-107);
                        i5 = ((iM45029 ^ i3) * 16355) ^ 1586777199;
                        i6 = 79362847;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ۙ᩺")) * (-75);
                        i5 = ((iM45029 ^ i3) * (-15273)) ^ (-91866577);
                        i6 = 733663598;
                    }
                    break;
                case 444146496:
                case 1463429703:
                    C1398.m4895();
                    if (C2477.f9839 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰۨ") + i4) * 43;
                        i5 = ((iM45029 ^ i3) * (-13167)) ^ 204729171;
                        i6 = 713004941;
                    } else {
                        iM45029 = C19806.m45029("ۚ֡") ^ i3;
                        i5 = ((iM45029 ^ i4) * 23297) ^ (-288850416);
                        i6 = -189749447;
                    }
                    break;
                case 1156169923:
                case 1977426480:
                    abstractC20745M6171 = RunnableC1895.m6171(str, new String[i]);
                    if (C1377.f5749) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺᩵") + i3) * (-47);
                        i5 = ((iM45029 ^ i4) * (-21369)) ^ (-1510702939);
                        i6 = 1833061152;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ᩷") + i3) * 77;
                        i5 = ((iM45029 ^ i4) * (-16697)) ^ 2022661726;
                        i6 = 268743167;
                    }
                    break;
                default:
                    this.f37857 = (AbstractC20745[]) array;
                    return;
            }
        }
    }
}
