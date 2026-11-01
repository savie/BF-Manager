package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.֫ۗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: G9A5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1554 extends AbstractC3492 {

    /* JADX INFO: renamed from: ܺۤۙ, reason: not valid java name and contains not printable characters */
    private static final short[] f6281 = {9583, -1088, 9592, 7361};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f6282;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC18488 f6283;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC9317 f6284;

    /* JADX WARN: Code duplicated, block: B:52:0x019e A[PHI: r10 r11 r15
      0x019e: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:51:0x019c, B:32:0x00de, B:12:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x019e: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:51:0x019c, B:32:0x00de, B:12:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x019e: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:51:0x019c, B:32:0x00de, B:12:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x01ca A[PHI: r2 r9 r14
      0x01ca: PHI (r2v4 l.ۢۗۨ) = (r2v3 l.ۢۗۨ), (r2v2 l.ۢۗۨ) binds: [B:36:0x0100, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r9v3 int) = (r9v2 int), (r9v5 int) binds: [B:36:0x0100, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r14v4 short[]) = (r14v3 short[]), (r14v2 short[]) binds: [B:36:0x0100, B:6:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x021b A[PHI: r4 r5 r7 r8 r12
      0x021b: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int), (r4v2 int), (r4v2 int) binds: [B:61:0x0219, B:57:0x01fa, B:47:0x017a, B:24:0x009c, B:18:0x0081, B:15:0x0067, B:12:0x0061, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x021b: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int), (r5v2 int), (r5v2 int) binds: [B:61:0x0219, B:57:0x01fa, B:47:0x017a, B:24:0x009c, B:18:0x0081, B:15:0x0067, B:12:0x0061, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x021b: PHI (r7v4 char) = (r7v3 char), (r7v2 char), (r7v2 char), (r7v2 char), (r7v2 char), (r7v2 char), (r7v2 char), (r7v2 char) binds: [B:61:0x0219, B:57:0x01fa, B:47:0x017a, B:24:0x009c, B:18:0x0081, B:15:0x0067, B:12:0x0061, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x021b: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short), (r8v2 short), (r8v2 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:61:0x0219, B:57:0x01fa, B:47:0x017a, B:24:0x009c, B:18:0x0081, B:15:0x0067, B:12:0x0061, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x021b: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:61:0x0219, B:57:0x01fa, B:47:0x017a, B:24:0x009c, B:18:0x0081, B:15:0x0067, B:12:0x0061, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x024d A[PHI: r3 r20
      0x024d: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v3 java.lang.String), (r3v2 java.lang.String) binds: [B:65:0x024b, B:28:0x00bf, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:65:0x024b, B:28:0x00bf, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        int iM45029;
        int i;
        int i2;
        int i3 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int i4 = C1977.f7413;
        int iM450210 = (C19806.m45029("ۛܰ") + i4) * 41;
        int i5 = ((iM450210 ^ i3) * 26259) ^ 506513163;
        String strM3009 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM450210 ^ (-1813078753);
        ActivityC9317 activityC9317 = null;
        int iM11306 = 0;
        int i7 = 0;
        char c = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 581041893;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i3) * (-29539)) >> 31));
            switch (i14) {
                case -1981548784:
                case -1879409933:
                    m10246(activityC9317, iM11306 ^ i7);
                    break;
                case -1771242025:
                case -623251563:
                    activityC9317 = this.f6284;
                    sArr2 = f6281;
                    if (C3286.f12186) {
                        iM45029 = ThreadFactoryC3888.m11306("۠֡") ^ i3;
                        i = ((iM45029 ^ i4) * (-15639)) ^ 1621508571;
                        i2 = 1234792168;
                    } else {
                        iM45029 = (C19806.m45029("᩺᩶") + i4) * 27;
                        i = ((iM45029 ^ i3) * 26941) ^ 76068517;
                        i2 = -1289332961;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1725752543:
                case 366391135:
                    i13 = 1;
                    if (C2642.f10294 <= 0) {
                        iM45029 = C19806.m45029("۠۟") ^ i3;
                        i = ((iM45029 ^ i4) * (-463)) ^ 314401495;
                        i2 = 1832757575;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩷֨")) * (-53);
                        i = ((iM45029 ^ i4) * (-18489)) ^ (-462883526);
                        i2 = -991710872;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1628581989:
                case 893007828:
                    i12 = 49572;
                    iM45029 = C19806.m45029("ܳᩳ") ^ i3;
                    i = ((iM45029 ^ i4) * (-15905)) ^ (-1841442737);
                    i2 = 929960384;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1557506635:
                case 1766525181:
                    C0797.m3359();
                    iM45029 = (C19806.m45029("ܿܽ") + i3) * 89;
                    i = ((iM45029 ^ i4) * 5895) ^ (-1086335979);
                    i2 = 113633426;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1422034988:
                case -868260081:
                    if (C2477.f9839 <= 0) {
                        iM45029 = (C19806.m45029("ܿܽ") + i3) * 89;
                        i = ((iM45029 ^ i4) * 5895) ^ (-1086335979);
                        i2 = 113633426;
                    } else {
                        iM45029 = C19806.m45029("ۚܽ") ^ i4;
                        i = ((iM45029 ^ i3) * (-29085)) ^ 1929276920;
                        i2 = -248573038;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1326975170:
                case -274254057:
                    sArr = f6281;
                    if (C0216.f1393 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۫֡") ^ i4;
                        i = ((iM45029 ^ i3) * 19149) ^ (-2060716013);
                        i2 = 344198227;
                    } else {
                        iM45029 = (C19806.m45029("᩹ۜ") ^ i3) * (-107);
                        i = ((iM45029 ^ i4) * 3067) ^ 1252224833;
                        i2 = -205251771;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1200063254:
                case 1884666848:
                    i9 = i8 * i8;
                    i10 = s * s;
                    if (C3743.f13569) {
                        iM45029 = C19806.m45029("᩵ᩴ") ^ i4;
                        i = ((iM45029 ^ i3) * 20719) ^ 451677995;
                        i2 = 1925959002;
                    } else {
                        iM45029 = C19806.m45029("۠۟") ^ i3;
                        i = ((iM45029 ^ i4) * (-463)) ^ 314401495;
                        i2 = 1832757575;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1170986091:
                case -693738383:
                    i12 = 30189;
                    iM45029 = C19806.m45029("ܳᩳ") ^ i3;
                    i = ((iM45029 ^ i4) * (-15905)) ^ (-1841442737);
                    i2 = 929960384;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1133060352:
                case 1195748097:
                    c = 0;
                    if (C1377.m4833() != 0) {
                        iM45029 = (C19806.m45029("ܿܽ") + i3) * 89;
                        i = ((iM45029 ^ i4) * 5895) ^ (-1086335979);
                        i2 = 113633426;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۧ֫") ^ i4;
                        i = ((iM45029 ^ i3) * 16001) ^ 1042594513;
                        i2 = 816932292;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -475135481:
                case -392453730:
                    if (C1977.f7413 > 0) {
                        iM45029 = (C19806.m45029("ܿܽ") + i3) * 89;
                        i = ((iM45029 ^ i4) * 5895) ^ (-1086335979);
                        i2 = 113633426;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۫֡") ^ i4;
                        i = ((iM45029 ^ i3) * 19149) ^ (-2060716013);
                        i2 = 344198227;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -324098905:
                case -229232440:
                    iM11306 = ThreadFactoryC3888.m11306(strM3009);
                    i7 = 2098064118;
                    if (C1398.f5802 <= 0) {
                        iM45029 = (C19806.m45029("ܿܽ") + i3) * 89;
                        i = ((iM45029 ^ i4) * 5895) ^ (-1086335979);
                        i2 = 113633426;
                    } else {
                        iM45029 = (C19806.m45029("ۘ᩵") ^ i4) * (-65);
                        i = ((iM45029 ^ i3) * (-8043)) ^ 1975145907;
                        i2 = -1518456393;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -116291974:
                case 1876899786:
                    strM3009 = C0671.m3009(sArr2, i13, 3, i12);
                    if (C2249.f8050 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۫֡") ^ i4;
                        i = ((iM45029 ^ i3) * 19149) ^ (-2060716013);
                        i2 = 344198227;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤۛ") ^ i4) * (-71);
                        i = ((iM45029 ^ i3) * (-21233)) ^ (-169112837);
                        i2 = -1406922436;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -53493665:
                case 1111988149:
                    C1419.m4973();
                    C1025.m3861();
                    break;
                case 550313537:
                case 1705651198:
                    i11 = 927369;
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM45029 = (C19806.m45029("ܿܽ") + i3) * 89;
                        i = ((iM45029 ^ i4) * 5895) ^ (-1086335979);
                        i2 = 113633426;
                    } else {
                        iM45029 = (C19806.m45029("ۗ᩺") + i3) * (-57);
                        i = ((iM45029 ^ i4) * 7815) ^ (-45610385);
                        i2 = 439082525;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 654753178:
                case 1015009547:
                    int i15 = i10 + i11;
                    if ((i15 + i15) - i9 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۫ۙ") ^ i4) * 83;
                        i = ((iM45029 ^ i3) * 22593) ^ (-793270458);
                        i2 = -1567738198;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛ֡") + i3) * (-67);
                        i = ((iM45029 ^ i4) * 23327) ^ 311238679;
                        i2 = 178085208;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1182879169:
                case 2023466611:
                    C7105.m18985();
                    if (C1419.f5860 < 0) {
                        iM45029 = (C19806.m45029("ܿܽ") + i3) * 89;
                        i = ((iM45029 ^ i4) * 5895) ^ (-1086335979);
                        i2 = 113633426;
                    } else {
                        iM45029 = C19806.m45029("۠۟") ^ i3;
                        i = ((iM45029 ^ i4) * (-463)) ^ 314401495;
                        i2 = 1832757575;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1618946082:
                case 1655972836:
                    s = sArr[c];
                    if (C0216.f1393 != 0) {
                        iM45029 = (C19806.m45029("ܿܽ") + i3) * 89;
                        i = ((iM45029 ^ i4) * 5895) ^ (-1086335979);
                        i2 = 113633426;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ۧ") ^ i3) * (-121);
                        i = ((iM45029 ^ i4) * 32703) ^ 1874218945;
                        i2 = 1009080753;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    i8 = s + 963;
                    if (C2477.f9839 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۠֡") ^ i3;
                        i = ((iM45029 ^ i4) * (-15639)) ^ 1621508571;
                        i2 = 1234792168;
                    } else {
                        iM45029 = C19806.m45029("᩹ۨ") ^ i4;
                        i = ((iM45029 ^ i3) * 3565) ^ (-262719994);
                        i2 = 575872491;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    public C1554(ActivityC9317 activityC9317, ArrayList arrayList, RunnableC18488 runnableC18488) {
        int i = 374887986;
        int i2 = RunnableC1606.f6488;
        int i3 = C1066.f4915;
        this.f6284 = activityC9317;
        this.f6282 = arrayList;
        this.f6283 = runnableC18488;
        int iM11306 = ThreadFactoryC3888.m11306("ܳ֫") ^ i2;
        int i4 = ((iM11306 ^ i3) * 13267) ^ (-219528270);
        int i5 = -555358188;
        while (true) {
            i = (iM11306 ^ i5) ^ (i4 & (((i ^ i3) * (-22779)) >> 31));
            switch (i) {
                case -2102405198:
                case -1662604018:
                    C2477.m7593();
                    if (C0629.f2722 > 0) {
                        iM11306 = C19806.m45029("᩵۟") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-1553)) ^ (-1209460815);
                        i5 = 595841984;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۘ֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-3683)) ^ (-1116662229);
                        i5 = 1095282423;
                    }
                    break;
                case -1895105251:
                case -921690953:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (C0817.m3399()) {
                        iM11306 = ThreadFactoryC3888.m11306("ܿۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-3595)) ^ 2047771957;
                        i5 = -1505648731;
                    } else {
                        iM11306 = C19806.m45029("ۤ۠") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-32521)) ^ (-449577638);
                        i5 = -418176352;
                    }
                    break;
                case -1885854374:
                case -1365270017:
                    C10634.m26820();
                    iM11306 = C19806.m45029("᩵۟") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-1553)) ^ (-1209460815);
                    i5 = 595841984;
                    break;
                case -1413787247:
                case 1178386852:
                    C2871.m8646();
                    throw new RuntimeException();
                case -1352262644:
                case 825416212:
                    if (C0629.f2722 <= 0) {
                        iM11306 = C19806.m45029("ۙۙ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 18075) ^ 1559939960;
                        i5 = -1397952775;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ܽۗ")) * 93;
                        i4 = ((iM11306 ^ i3) * (-1091)) ^ 273640440;
                        i5 = 1346515135;
                    }
                    break;
                case 26392106:
                case 1234611716:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = C19806.m45029("ۤ۠") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-32521)) ^ (-449577638);
                        i5 = -418176352;
                    } else {
                        iM11306 = C19806.m45029("᩵۟") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-1553)) ^ (-1209460815);
                        i5 = 595841984;
                    }
                    break;
                default:
                    return;
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws IOException {
        ActivityC9317 activityC9317 = null;
        AbstractC20745 abstractC20745 = null;
        String strM46730 = null;
        EnumC9326[] enumC9326Arr = null;
        EnumC9326 enumC9326 = null;
        char c = 0;
        C15676 c15676M22397 = null;
        Iterator itM9705 = null;
        C22722 c22722 = null;
        int i = -723645475;
        int i2 = C3535.f13026;
        int i3 = C1066.f4915;
        int iM45029 = (i2 - C19806.m45029("ܰ᩷")) * (-127);
        int i4 = ((iM45029 ^ i3) * 30677) ^ 1355069526;
        int i5 = -885050000;
        while (true) {
            i = ((((i ^ i3) * 30865) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2144539628:
                case -98476236:
                    if (C3535.f13026 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۢ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 28193) ^ 878676432;
                        i5 = -334324595;
                    } else {
                        iM45029 = C19806.m45029("ܿܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 27) ^ 1488488629;
                        i5 = 1715482007;
                    }
                    break;
                case -2012110891:
                case 13875287:
                    C1398.m4895();
                    if (C3577.f13150 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۢ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 28193) ^ 878676432;
                        i5 = -334324595;
                    } else {
                        iM45029 = (C19806.m45029("۠ۢ") + i3) * 31;
                        i4 = ((iM45029 ^ i2) * (-20289)) ^ (-403647475);
                        i5 = -285910359;
                    }
                    break;
                case -1566780476:
                case 1319139659:
                    if (RunnableC1564.m5348(itM9705)) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("۫۟")) * (-35);
                        i4 = ((iM45029 ^ i3) * (-14803)) ^ (-402246777);
                        i5 = -726771365;
                    } else {
                        iM45029 = C19806.m45029("ܰۙ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 7297) ^ 647454545;
                        i5 = 40034173;
                    }
                    break;
                case -1275954280:
                case -519928429:
                    AbstractC0464.m2313();
                    iM45029 = (C19806.m45029("۠ۢ") + i3) * 31;
                    i4 = ((iM45029 ^ i2) * (-20289)) ^ (-403647475);
                    i5 = -285910359;
                    break;
                case -1200024034:
                case 763735579:
                    enumC9326Arr = new EnumC9326[1];
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (C19806.m45029("ܺۗ") + i2) * 19;
                        i4 = ((iM45029 ^ i3) * (-8071)) ^ 34039770;
                        i5 = 1696400428;
                    } else {
                        iM45029 = C19806.m45029("᩻ۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 21201) ^ (-1431330274);
                        i5 = 369412853;
                    }
                    break;
                case -1195309168:
                case -1157438552:
                    activityC9317 = this.f6284;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۢ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 28193) ^ 878676432;
                        i5 = -334324595;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֫ۚ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-7781)) ^ 997757471;
                        i5 = 114015761;
                    }
                    break;
                case -1142360145:
                case -463862309:
                    if (C2642.f10294 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫᩵") ^ i2) * (-113);
                        i4 = ((iM45029 ^ i3) * (-25953)) ^ 1300765185;
                        i5 = -85865153;
                    } else {
                        iM45029 = (C19806.m45029("ܽ۫") ^ i2) * 77;
                        i4 = ((iM45029 ^ i3) * 13047) ^ (-1032292751);
                        i5 = -1798476915;
                    }
                    break;
                case -1089015239:
                case 249102469:
                    C0671.m3008();
                    break;
                case -990087291:
                case 1715613636:
                    enumC9326Arr[c] = enumC9326;
                    if (C3286.m9798() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۢ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 28193) ^ 878676432;
                        i5 = -334324595;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ֫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 28353) ^ 957445446;
                        i5 = -1818758734;
                    }
                    break;
                case -939947611:
                case 1239928145:
                    enumC9326 = EnumC9326.OrderedField;
                    c = 0;
                    if (C2249.f8050 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫᩵") ^ i2) * (-113);
                        i4 = ((iM45029 ^ i3) * (-25953)) ^ 1300765185;
                        i5 = -85865153;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * 24183) ^ (-417547869);
                        i5 = 67037301;
                    }
                    break;
                case -864611202:
                case 713392922:
                    c15676M22397 = AbstractC8620.m22397(strM46730, enumC9326Arr);
                    itM9705 = MenuItemOnMenuItemClickListenerC3244.m9705(this.f6282);
                    iM45029 = (C19806.m45029("ۖ֡") ^ i3) * (-11);
                    i4 = ((iM45029 ^ i2) * (-6123)) ^ 680541409;
                    i5 = 41776621;
                    break;
                case -598098978:
                case 819483492:
                    c22722 = (C22722) C0216.m1584(itM9705);
                    if (c22722.f74020 != null) {
                        iM45029 = ThreadFactoryC3888.m11306("ܽۨ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 18831) ^ (-924672786);
                        i5 = -1155058230;
                    } else {
                        iM45029 = (C19806.m45029("ۖ֡") ^ i3) * (-11);
                        i4 = ((iM45029 ^ i2) * (-6123)) ^ 680541409;
                        i5 = 41776621;
                    }
                    break;
                case -560202769:
                case 210026343:
                    c15676M22397.m37349(c22722.m50373(), c22722.f74020);
                    iM45029 = (C19806.m45029("ۖ֡") ^ i3) * (-11);
                    i4 = ((iM45029 ^ i2) * (-6123)) ^ 680541409;
                    i5 = 41776621;
                    break;
                case -407706308:
                case 1114177120:
                    strM46730 = abstractC20745.m46730();
                    if (C1148.m4232() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫᩵") ^ i2) * (-113);
                        i4 = ((iM45029 ^ i3) * (-25953)) ^ 1300765185;
                        i5 = -85865153;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۜ᩵")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM45029 ^ i2) * (-16531)) ^ 1905091257;
                        i5 = -1009658328;
                    }
                    break;
                case -398875326:
                case 1568802507:
                    activityC9317.f31592.m46735(c15676M22397.mo19151());
                    break;
                case -50975928:
                case 2024316056:
                    if (C1668.f6641 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫᩵") ^ i2) * (-113);
                        i4 = ((iM45029 ^ i3) * (-25953)) ^ 1300765185;
                        i5 = -85865153;
                    } else {
                        iM45029 = C19806.m45029("֫۠") ^ i3;
                        i4 = ((iM45029 ^ i2) * 6883) ^ (-1610064722);
                        i5 = 1701783468;
                    }
                    break;
                case 66904872:
                case 2089418109:
                    if (C10634.f36300 >= 0) {
                        iM45029 = C19806.m45029("֫۠") ^ i3;
                        i4 = ((iM45029 ^ i2) * 6883) ^ (-1610064722);
                        i5 = 1701783468;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩵ۢ")) * 43;
                        i4 = ((iM45029 ^ i3) * (-26997)) ^ (-1816066292);
                        i5 = -29021219;
                    }
                    break;
                case 216062606:
                case 1465032612:
                    C3722.m10894();
                    if (!CallableC1627.f6528) {
                        iM45029 = C19806.m45029("֫۠") ^ i3;
                        i4 = ((iM45029 ^ i2) * 6883) ^ (-1610064722);
                        i5 = 1701783468;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۢ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 28193) ^ 878676432;
                        i5 = -334324595;
                    }
                    break;
                case 1177828133:
                case 1668751856:
                    if (C19806.f63586) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۢ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 28193) ^ 878676432;
                        i5 = -334324595;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-2597)) ^ (-2007580180);
                        i5 = -1514023298;
                    }
                    break;
                default:
                    abstractC20745 = activityC9317.f31592;
                    if (C3722.f13525 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘۢ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 28193) ^ 878676432;
                        i5 = -334324595;
                    } else {
                        iM45029 = C19806.m45029("ۜۤ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-11133)) ^ 1278281271;
                        i5 = 668208262;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        this.f6283.run();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C0797.m3353(this);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        ActivityC9317 activityC9317 = null;
        int i = 1110923464;
        int i2 = C1066.f4915;
        int i3 = C2642.f10294;
        int iM45029 = C19806.m45029("ۖۘ") ^ i3;
        int i4 = ((iM45029 ^ i2) * (-2255)) ^ (-1090980913);
        int i5 = -805313747;
        while (true) {
            i = ((((i ^ i2) * (-10041)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2041123584:
                case -361111829:
                    if (C1419.f5860 >= 0) {
                        iM45029 = C19806.m45029("֫ۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 27995) ^ (-567177872);
                        i5 = -488689214;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۨᩴ")) * 35;
                        i4 = ((iM45029 ^ i2) * (-29073)) ^ (-1870261625);
                        i5 = -1863602393;
                    }
                    break;
                case -1826111572:
                case -798735403:
                    if (C1377.m4833() != 0) {
                        iM45029 = (C19806.m45029("֡ۗ") ^ i2) * (-15);
                        i4 = ((iM45029 ^ i3) * (-5231)) ^ (-481760596);
                        i5 = -70180303;
                    } else {
                        iM45029 = (C19806.m45029("᩸ۜ") ^ i3) * 99;
                        i4 = ((iM45029 ^ i2) * (-22017)) ^ 931906175;
                        i5 = -381891683;
                    }
                    break;
                case -1777386391:
                case -344182789:
                    if (C7105.m18985()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡܰ") ^ i2) * (-31);
                        i4 = ((iM45029 ^ i3) * 24451) ^ (-1680589333);
                        i5 = -1390430201;
                    } else {
                        iM45029 = C19806.m45029("ܽۙ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 7177) ^ (-821066685);
                        i5 = -1882910535;
                    }
                    break;
                case -1675998075:
                case 1452948392:
                    C0671.m3019(activityC9317, exc, null);
                    break;
                case -1546954892:
                case -555905849:
                    if (C1937.f7317 >= 0) {
                        iM45029 = (C19806.m45029("֡ۗ") ^ i2) * (-15);
                        i4 = ((iM45029 ^ i3) * (-5231)) ^ (-481760596);
                        i5 = -70180303;
                    } else {
                        iM45029 = C19806.m45029("᩷۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-27743)) ^ (-996668082);
                        i5 = 243603587;
                    }
                    break;
                case -1496587129:
                case -247920865:
                    C0278.m1789();
                    if (C3722.f13525 <= 0) {
                        iM45029 = (C19806.m45029("֡ۗ") ^ i2) * (-15);
                        i4 = ((iM45029 ^ i3) * (-5231)) ^ (-481760596);
                        i5 = -70180303;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡܰ") ^ i2) * (-31);
                        i4 = ((iM45029 ^ i3) * 24451) ^ (-1680589333);
                        i5 = -1390430201;
                    }
                    break;
                case -1026851347:
                case 1733262198:
                    if (C1148.f5161 <= 0) {
                        iM45029 = C19806.m45029("֫ۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 27995) ^ (-567177872);
                        i5 = -488689214;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ֨") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-11263)) ^ 524046478;
                        i5 = 159225612;
                    }
                    break;
                case -614470116:
                case 50457830:
                    AbstractC0464.m2313();
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    iM45029 = C19806.m45029("֫ۛ") ^ i3;
                    i4 = ((iM45029 ^ i2) * 27995) ^ (-567177872);
                    i5 = -488689214;
                    break;
                case -575621704:
                case 1824614384:
                    if (C1419.f5860 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡܰ") ^ i2) * (-31);
                        i4 = ((iM45029 ^ i3) * 24451) ^ (-1680589333);
                        i5 = -1390430201;
                    } else {
                        iM45029 = C19806.m45029("֫᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * 18345) ^ (-710073623);
                        i5 = 881819597;
                    }
                    break;
                case -232523127:
                case 384528775:
                    RunnableC1564.m5345();
                    if (C2704.m8255() <= 0) {
                        iM45029 = C19806.m45029("֫ۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 27995) ^ (-567177872);
                        i5 = -488689214;
                    } else {
                        iM45029 = (C19806.m45029("᩶᩸") ^ i3) * (-99);
                        i4 = ((iM45029 ^ i2) * 6455) ^ (-475596375);
                        i5 = 1933797430;
                    }
                    break;
                case -45810328:
                case 1249267892:
                    C19806.m45024();
                    break;
                case -13399433:
                case 1798965925:
                    if (C0629.f2722 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡܰ") ^ i2) * (-31);
                        i4 = ((iM45029 ^ i3) * 24451) ^ (-1680589333);
                        i5 = -1390430201;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 25167) ^ (-760388726);
                        i5 = 860107006;
                    }
                    break;
                case 524622971:
                case 573746867:
                    activityC9317 = this.f6284;
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ܶ") + i3) * (-33);
                        i4 = ((iM45029 ^ i2) * 31219) ^ 693122359;
                        i5 = 501525796;
                    } else {
                        iM45029 = (C19806.m45029("᩵ۛ") + i3) * 7;
                        i4 = ((iM45029 ^ i2) * (-19827)) ^ (-2091817989);
                        i5 = -1949511832;
                    }
                    break;
                case 722784216:
                case 1628209666:
                    if (C1460.f5948 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ܶ") + i3) * (-33);
                        i4 = ((iM45029 ^ i2) * 31219) ^ 693122359;
                        i5 = 501525796;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳۘ") + i2) * (-9);
                        i4 = ((iM45029 ^ i3) * (-20885)) ^ 1823640205;
                        i5 = 1316476038;
                    }
                    break;
                case 1459158741:
                case 1635421792:
                    if (C3660.f13403 >= 0) {
                        iM45029 = C19806.m45029("֫ۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 27995) ^ (-567177872);
                        i5 = -488689214;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۜ᩸")) * 53;
                        i4 = ((iM45029 ^ i2) * 1347) ^ (-1853593446);
                        i5 = 485618015;
                    }
                    break;
                default:
                    C1937.m6279();
                    if (!C1377.f5749) {
                        iM45029 = C19806.m45029("֫ۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 27995) ^ (-567177872);
                        i5 = -488689214;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡܰ") ^ i2) * (-31);
                        i4 = ((iM45029 ^ i3) * 24451) ^ (-1680589333);
                        i5 = -1390430201;
                    }
                    break;
            }
            return;
        }
    }
}
