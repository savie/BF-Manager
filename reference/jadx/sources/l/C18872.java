package l;

import java.net.SocketTimeoutException;
import java.util.LinkedHashMap;
import moe.shizuku.server.IShizukuService;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ᩳۛ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 32SX */
/* JADX INFO: loaded from: classes4.dex */
public final class C18872 {

    /* JADX INFO: renamed from: ۛۙۢ, reason: not valid java name and contains not printable characters */
    private static final short[] f61270 = {5920, -31767, -31755, -31755, -31759, -31758, -31813, -31826, -31826, -31757, -31772, -31759, -31828, -31759, -31763, -31756, -31770, -31768, -31761, -31825, -31764, -31755, -31821, -31825, -31774, -31761, 4839, -3988, -3984, -3991, -3973, -3979, -3982, -4047, -3969, -3975, -3982, -3992, -3975, -3986, -4036, -3969, -3981, -3982, -3992, -3975, -3982, -3992, -3980, -3992, -3992, -3988, -3985, -4058, -4045, -4045, -3986, -3975, -3988, -4050, -4047, -3988, -3984, -3991, -3973, -3979, -3982, -4046, -3983, -3992, -4050, -4046, -3969, -3982, -3980, -3992, -3992, -3988, -3985, -4058, -4045, -4045, -3986, -3975, -3988, -4047, -3988, -3984, -3991, -3973, -3979, -3982, -4046, -3983, -3992, -4050, -4046, -3969, -3982, -4045, -3992, -3975, -3985, -3992, -4008, -3971, -3992, -3975, -4028, -4047, -4016, -4003, -4014, -4005, -4028, -4047, -4015, -4024, -4047, -4022, -4007, -4018, -4017, -4011, -4013, -4014, -4020, -4013, -4017, -4024, -3985, -3976, -3974, -3985, -4049, -3986, -3976, -4056, -4049, -3974, -3976, -3985, -3971, -4045, -3971, -3988, -3988, -3984, -3979, -3969, -3971, -3992, -3979, -3981, -3982, -4045, -3981, -3969, -3992, -3975, -3992, -4047, -3985, -3992, -3986, -3975, -3971, -3983, -4023, -4024, -4006, -4047, -4060, -4028, -4047, -4017, -3989, -3979, -3974, -3992, -4047, -4007, -3986, -3986, -3981, -3986, -3975, -3986, -3986, -3981, -3986, -4036, -4018, -3975, -3985, -3988, -3981, -3982, -3985, -3975, -4036, -3969, -3981, -3976, -3975, -4058, -4036, -3991, -3986, -3984, -3969, -3981, -3976, -3975, -3983, -3975, -3985, -3985, -3971, -3973, -3975, -3980, -3975, -3971, -3976, -3975, -3986, -3985, -3986, -3975, -3985, -3988, -3981, -3982, -3985, -3975, -4036, 6609, 27181, 27186, 27182, 5276, 26885, 26890, 26895, 26886, 3814, 23648, 23675, 23679, 23665, 23674};

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static long f61271 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean f61272 = true;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String f61273;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C24363 f61274;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f61275;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f61276;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f61277;

    /* JADX WARN: Code duplicated, block: B:53:0x01d5 A[PHI: r5 r6 r8 r16
      0x01d5: PHI (r5v4 short) = (r5v3 short), (r5v2 short), (r5v2 short) binds: [B:52:0x01d3, B:44:0x018e, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x01d5: PHI (r6v4 int) = (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:52:0x01d3, B:44:0x018e, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x01d5: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:52:0x01d3, B:44:0x018e, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x01d5: PHI (r16v16 java.util.LinkedHashMap) = (r16v5 java.util.LinkedHashMap), (r16v7 java.util.LinkedHashMap), (r16v17 java.util.LinkedHashMap) binds: [B:52:0x01d3, B:44:0x018e, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0259 A[PHI: r3 r7 r9 r11 r16
      0x0259: PHI (r3v4 short[]) = (r3v2 short[]), (r3v3 short[]), (r3v2 short[]), (r3v2 short[]), (r3v2 short[]) binds: [B:64:0x0257, B:60:0x023c, B:48:0x01b0, B:40:0x0169, B:25:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:64:0x0257, B:60:0x023c, B:48:0x01b0, B:40:0x0169, B:25:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r9v4 short) = (r9v2 short), (r9v2 short), (r9v2 short), (r9v3 short), (r9v2 short) binds: [B:64:0x0257, B:60:0x023c, B:48:0x01b0, B:40:0x0169, B:25:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r11v3 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]), (r11v4 short[]) binds: [B:64:0x0257, B:60:0x023c, B:48:0x01b0, B:40:0x0169, B:25:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r16v13 java.util.LinkedHashMap) = 
      (r16v2 java.util.LinkedHashMap)
      (r16v3 java.util.LinkedHashMap)
      (r16v6 java.util.LinkedHashMap)
      (r16v8 java.util.LinkedHashMap)
      (r16v14 java.util.LinkedHashMap)
     binds: [B:64:0x0257, B:60:0x023c, B:48:0x01b0, B:40:0x0169, B:25:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43774(int i) {
        int iM3169;
        int i2;
        int i3;
        int i4 = C0269.f1558;
        int i5 = C1146.f4234;
        int iM2761 = (C0619.m2761("ۗۨ") ^ i4) * 75;
        int i6 = ((iM2761 ^ i5) * 1661) ^ 514132618;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM2761 ^ (-2107964645);
        char c = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1701318113;
        String strM7760 = null;
        LinkedHashMap linkedHashMap = null;
        while (true) {
            i13 = i7 ^ (i6 & (((i13 ^ i5) * (-10609)) >> 31));
            switch (i13) {
                case -2103358155:
                case -117440483:
                    C1564.m5509();
                    if (C1343.f4799 != 0) {
                        iM3169 = C0619.m2761("۠۟") ^ i5;
                        linkedHashMap = linkedHashMap;
                        i2 = ((iM3169 ^ i4) * 31665) ^ (-434403316);
                        i3 = 742594259;
                        LinkedHashMap linkedHashMap2 = linkedHashMap;
                        i7 = iM3169 ^ i3;
                        i6 = i2;
                        linkedHashMap = linkedHashMap2;
                    } else {
                        int iM2762 = (i5 - C0619.m2761("᩸ۚ")) * (-91);
                        i6 = ((iM2762 ^ i4) * (-21999)) ^ (-1909065291);
                        i7 = iM2762 ^ 1841434894;
                    }
                    break;
                case -1673882834:
                case 400434272:
                    if (C2966.f9654 < 0) {
                        linkedHashMap = linkedHashMap;
                        iM3169 = (C0619.m2761("ۚۜ") + i4) * (-93);
                        i2 = ((iM3169 ^ i5) * (-2277)) ^ (-1774662029);
                        i3 = 823738875;
                        LinkedHashMap linkedHashMap3 = linkedHashMap;
                        i7 = iM3169 ^ i3;
                        i6 = i2;
                        linkedHashMap = linkedHashMap3;
                    }
                    linkedHashMap = linkedHashMap;
                    iM3169 = (C0773.m3169("ܽۛ") ^ i4) * 43;
                    i2 = ((iM3169 ^ i5) * 9949) ^ (-2035849092);
                    i3 = -1870405272;
                    LinkedHashMap linkedHashMap4 = linkedHashMap;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    linkedHashMap = linkedHashMap4;
                    break;
                case -1365857057:
                case 1298656545:
                    linkedHashMap = linkedHashMap;
                    int i14 = i8 + i9;
                    i10 = i14 + i14;
                    if (C1826.m6301() >= 0) {
                        iM3169 = (C0619.m2761("ۚۜ") + i4) * (-93);
                        i2 = ((iM3169 ^ i5) * (-2277)) ^ (-1774662029);
                        i3 = 823738875;
                    } else {
                        iM3169 = (i4 - C0619.m2761("۟ۤ")) * (-59);
                        i2 = ((iM3169 ^ i5) * 31187) ^ (-184936017);
                        i3 = 503398530;
                    }
                    LinkedHashMap linkedHashMap5 = linkedHashMap;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    linkedHashMap = linkedHashMap5;
                    break;
                case -1335058400:
                case 1403655229:
                    linkedHashMap = linkedHashMap;
                    sArr2 = f61270;
                    if (C4238.f15451 >= 0) {
                        iM3169 = (C0773.m3169("ܺۤ") + i4) * (-121);
                        i2 = ((iM3169 ^ i5) * (-21371)) ^ (-453837543);
                        i3 = 1580528802;
                    } else {
                        iM3169 = C0619.m2761("۠ۗ") ^ i4;
                        i2 = ((iM3169 ^ i5) * (-28005)) ^ 80504976;
                        i3 = 552468681;
                    }
                    LinkedHashMap linkedHashMap6 = linkedHashMap;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    linkedHashMap = linkedHashMap6;
                    break;
                case -1275066796:
                case 1436938203:
                    linkedHashMap = linkedHashMap;
                    int i15 = s + s2;
                    if (i10 - (i15 * i15) < 0) {
                        iM3169 = (C0619.m2761("ܳۛ") ^ i5) * (-79);
                        i2 = ((iM3169 ^ i4) * (-22513)) ^ 1969265885;
                        i3 = 882521121;
                    } else {
                        iM3169 = C0619.m2761("۫᩸") ^ i4;
                        i2 = ((iM3169 ^ i5) * (-11395)) ^ 1359158375;
                        i3 = 668516831;
                    }
                    LinkedHashMap linkedHashMap7 = linkedHashMap;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    linkedHashMap = linkedHashMap7;
                    break;
                case -1255341918:
                case 943476308:
                    linkedHashMap = linkedHashMap;
                    s = sArr[c];
                    i8 = s * s;
                    if (C2834.f9334 <= 0) {
                        iM3169 = (C0619.m2761("ۚۜ") + i4) * (-93);
                        i2 = ((iM3169 ^ i5) * (-2277)) ^ (-1774662029);
                        i3 = 823738875;
                    } else {
                        iM3169 = (i5 - C0773.m3169("ܰ۫")) * 101;
                        i2 = ((iM3169 ^ i4) * 24551) ^ (-1606444005);
                        i3 = -1109376980;
                    }
                    LinkedHashMap linkedHashMap8 = linkedHashMap;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    linkedHashMap = linkedHashMap8;
                    break;
                case -1091960629:
                case 691369549:
                    i11 = 713;
                    iM3169 = C0619.m2761("ۤۛ") ^ i4;
                    i2 = ((iM3169 ^ i5) * 26525) ^ (-1760216678);
                    i3 = -328765283;
                    LinkedHashMap linkedHashMap9 = linkedHashMap;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    linkedHashMap = linkedHashMap9;
                    break;
                case -1021233931:
                case 1499976813:
                    linkedHashMap = this.f61277;
                    strM7760 = C2288.m7760(i);
                    if (!C2023.f6737) {
                        iM3169 = (i5 - C0619.m2761("֨ܳ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        linkedHashMap = linkedHashMap;
                        i2 = ((iM3169 ^ i4) * 27361) ^ 1065458125;
                        i3 = 852933618;
                        LinkedHashMap linkedHashMap10 = linkedHashMap;
                        i7 = iM3169 ^ i3;
                        i6 = i2;
                        linkedHashMap = linkedHashMap10;
                    } else {
                        int iM2763 = (i5 - C0619.m2761("᩸ۚ")) * (-91);
                        i6 = ((iM2763 ^ i4) * (-21999)) ^ (-1909065291);
                        i7 = iM2763 ^ 1841434894;
                    }
                    break;
                case -502115272:
                case 206482960:
                    if (C4282.f15546 <= 0) {
                        int iM2764 = (i5 - C0619.m2761("᩸ۚ")) * (-91);
                        i6 = ((iM2764 ^ i4) * (-21999)) ^ (-1909065291);
                        i7 = iM2764 ^ 1841434894;
                    } else {
                        linkedHashMap = linkedHashMap;
                        iM3169 = (C0773.m3169("ܽۛ") ^ i4) * 43;
                        i2 = ((iM3169 ^ i5) * 9949) ^ (-2035849092);
                        i3 = -1870405272;
                        LinkedHashMap linkedHashMap11 = linkedHashMap;
                        i7 = iM3169 ^ i3;
                        i6 = i2;
                        linkedHashMap = linkedHashMap11;
                    }
                    break;
                case -267957943:
                case 1195143374:
                    linkedHashMap = linkedHashMap;
                    c = 237;
                    if (C0773.f2792 <= 0) {
                        iM3169 = (C0773.m3169("ܽۛ") ^ i4) * 43;
                        i2 = ((iM3169 ^ i5) * 9949) ^ (-2035849092);
                        i3 = -1870405272;
                    } else {
                        iM3169 = C0773.m3169("֡ۚ") ^ i4;
                        i2 = ((iM3169 ^ i5) * (-12247)) ^ 379452178;
                        i3 = 393896722;
                    }
                    LinkedHashMap linkedHashMap12 = linkedHashMap;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    linkedHashMap = linkedHashMap12;
                    break;
                case -138225296:
                case 577188911:
                    linkedHashMap = linkedHashMap;
                    i9 = 159769600;
                    if (C3998.f13671 != 0) {
                        iM3169 = (C0773.m3169("ܺۤ") + i4) * (-121);
                        i2 = ((iM3169 ^ i5) * (-21371)) ^ (-453837543);
                        i3 = 1580528802;
                    } else {
                        iM3169 = (C0619.m2761("᩵ۙ") ^ i5) * (-37);
                        i2 = ((iM3169 ^ i4) * 20957) ^ (-52394409);
                        i3 = -791033091;
                    }
                    LinkedHashMap linkedHashMap13 = linkedHashMap;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    linkedHashMap = linkedHashMap13;
                    break;
                case -56093062:
                case 144615725:
                    i11 = 27229;
                    iM3169 = C0619.m2761("ۤۛ") ^ i4;
                    i2 = ((iM3169 ^ i5) * 26525) ^ (-1760216678);
                    i3 = -328765283;
                    LinkedHashMap linkedHashMap14 = linkedHashMap;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    linkedHashMap = linkedHashMap14;
                    break;
                case 5589235:
                case 1540266145:
                    linkedHashMap = linkedHashMap;
                    if (C13473.f42873 != 0) {
                        iM3169 = (C0773.m3169("ܺۤ") + i4) * (-121);
                        i2 = ((iM3169 ^ i5) * (-21371)) ^ (-453837543);
                        i3 = 1580528802;
                    } else {
                        iM3169 = C0773.m3169("۫ۜ") ^ i4;
                        i2 = ((iM3169 ^ i5) * (-20455)) ^ (-860305094);
                        i3 = 453887703;
                    }
                    LinkedHashMap linkedHashMap15 = linkedHashMap;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    linkedHashMap = linkedHashMap15;
                    break;
                case 82632224:
                case 397452399:
                    linkedHashMap = linkedHashMap;
                    s2 = 12640;
                    if (C13473.f42873 != 0) {
                        iM3169 = (C0773.m3169("ܺۤ") + i4) * (-121);
                        i2 = ((iM3169 ^ i5) * (-21371)) ^ (-453837543);
                        i3 = 1580528802;
                    } else {
                        iM3169 = (C0773.m3169("֡۟") + i5) * (-17);
                        i2 = ((iM3169 ^ i4) * 4555) ^ 1544563194;
                        i3 = -203116300;
                    }
                    LinkedHashMap linkedHashMap16 = linkedHashMap;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    linkedHashMap = linkedHashMap16;
                    break;
                case 262685473:
                case 1194900255:
                    i12 = 238;
                    if (C4282.f15546 <= 0) {
                        iM3169 = C0619.m2761("۠۟") ^ i5;
                        linkedHashMap = linkedHashMap;
                        i2 = ((iM3169 ^ i4) * 31665) ^ (-434403316);
                        i3 = 742594259;
                    } else {
                        linkedHashMap = linkedHashMap;
                        iM3169 = C0773.m3169("ۚܺ") ^ i5;
                        i2 = ((iM3169 ^ i4) * (-29431)) ^ 1291342192;
                        i3 = -1908217273;
                    }
                    LinkedHashMap linkedHashMap17 = linkedHashMap;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    linkedHashMap = linkedHashMap17;
                    break;
                case 743612623:
                case 877364121:
                    linkedHashMap = linkedHashMap;
                    sArr = f61270;
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (C0773.m3169("ܺۤ") + i4) * (-121);
                        i2 = ((iM3169 ^ i5) * (-21371)) ^ (-453837543);
                        i3 = 1580528802;
                    } else {
                        iM3169 = C0619.m2761("ۢۘ") ^ i5;
                        i2 = ((iM3169 ^ i4) * 16153) ^ (-1549722956);
                        i3 = 1082051453;
                    }
                    LinkedHashMap linkedHashMap18 = linkedHashMap;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    linkedHashMap = linkedHashMap18;
                    break;
                case 1044082661:
                case 1277106736:
                    linkedHashMap.put(C1146.m4222(sArr2, i12, 3, i11), strM7760);
                    break;
                case 1276482522:
                case 1616165859:
                    C3779.m12264();
                    AbstractC3624.m11755();
                    break;
                default:
                    AbstractC0641.m2813();
                    C2485.m8357();
                    linkedHashMap = linkedHashMap;
                    iM3169 = (C0773.m3169("ܽۛ") ^ i4) * 43;
                    i2 = ((iM3169 ^ i5) * 9949) ^ (-2035849092);
                    i3 = -1870405272;
                    LinkedHashMap linkedHashMap19 = linkedHashMap;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    linkedHashMap = linkedHashMap19;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x02d1 A[PHI: r1 r16 r17 r18
      0x02d1: PHI (r1v4 char) = (r1v2 char), (r1v3 char), (r1v2 char) binds: [B:71:0x02cf, B:53:0x01e9, B:17:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x02d1: PHI (r16v27 int) = (r16v9 int), (r16v13 int), (r16v28 int) binds: [B:71:0x02cf, B:53:0x01e9, B:17:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x02d1: PHI (r17v9 int) = (r17v0 int), (r17v4 int), (r17v10 int) binds: [B:71:0x02cf, B:53:0x01e9, B:17:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x02d1: PHI (r18v16 short) = (r18v3 short), (r18v7 short), (r18v17 short) binds: [B:71:0x02cf, B:53:0x01e9, B:17:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
    
        if (l.C3033.f9831 >= 0) goto L16;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m43776(l.AbstractC22044 r20) {
        /*
            Method dump skipped, instruction units count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18872.m43776(l.᩷ۨᩴ):void");
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0281 A[PHI: r2 r3 r4 r16 r17
      0x0281: PHI (r2v3 l.۫۠֫) = (r2v2 l.۫۠֫), (r2v2 l.۫۠֫), (r2v2 l.۫۠֫), (r2v4 l.۫۠֫) binds: [B:63:0x027f, B:35:0x017a, B:25:0x0101, B:21:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r3v26 short[]) = (r3v3 short[]), (r3v22 short[]), (r3v2 short[]), (r3v2 short[]) binds: [B:63:0x027f, B:35:0x017a, B:25:0x0101, B:21:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r4v4 char) = (r4v2 char), (r4v3 char), (r4v2 char), (r4v2 char) binds: [B:63:0x027f, B:35:0x017a, B:25:0x0101, B:21:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r16v23 short) = (r16v3 short), (r16v16 short), (r16v21 short), (r16v25 short) binds: [B:63:0x027f, B:35:0x017a, B:25:0x0101, B:21:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r17v5 java.lang.String) = (r17v3 java.lang.String), (r17v3 java.lang.String), (r17v4 java.lang.String), (r17v3 java.lang.String) binds: [B:63:0x027f, B:35:0x017a, B:25:0x0101, B:21:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x02a8 A[PHI: r7 r8 r10 r11 r12 r16 r18
      0x02a8: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v4 int) binds: [B:66:0x02a6, B:61:0x027c, B:57:0x0258, B:47:0x0203, B:32:0x0152, B:10:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v8 int) binds: [B:66:0x02a6, B:61:0x027c, B:57:0x0258, B:47:0x0203, B:32:0x0152, B:10:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r10v5 short[]) = (r10v2 short[]), (r10v2 short[]), (r10v2 short[]), (r10v2 short[]), (r10v4 short[]), (r10v2 short[]) binds: [B:66:0x02a6, B:61:0x027c, B:57:0x0258, B:47:0x0203, B:32:0x0152, B:10:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r11v5 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v4 int), (r11v2 int) binds: [B:66:0x02a6, B:61:0x027c, B:57:0x0258, B:47:0x0203, B:32:0x0152, B:10:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:66:0x02a6, B:61:0x027c, B:57:0x0258, B:47:0x0203, B:32:0x0152, B:10:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r16v37 short) = (r16v2 short), (r16v3 short), (r16v4 short), (r16v7 short), (r16v27 short), (r16v40 short) binds: [B:66:0x02a6, B:61:0x027c, B:57:0x0258, B:47:0x0203, B:32:0x0152, B:10:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r18v33 short[]) = (r18v0 short[]), (r18v1 short[]), (r18v2 short[]), (r18v4 short[]), (r18v24 short[]), (r18v37 short[]) binds: [B:66:0x02a6, B:61:0x027c, B:57:0x0258, B:47:0x0203, B:32:0x0152, B:10:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x02db A[PHI: r1 r16 r18
      0x02db: PHI (r1v4 l.ۛܳۨ) = (r1v3 l.ۛܳۨ), (r1v2 l.ۛܳۨ) binds: [B:53:0x0235, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x02db: PHI (r16v41 short) = (r16v5 short), (r16v45 short) binds: [B:53:0x0235, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x02db: PHI (r18v38 short[]) = (r18v3 short[]), (r18v40 short[]) binds: [B:53:0x0235, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        short[] sArr;
        short s;
        short s2;
        int iM2761;
        int i;
        int i2;
        int i3;
        int i4 = C0773.f2792;
        int i5 = C2375.f7641;
        int iM2762 = C0619.m2761("ܿۤ") ^ i5;
        int i6 = ((iM2762 ^ i4) * 24441) ^ 1837089243;
        String strM4861 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i7 = iM2762 ^ (-1411031160);
        char c = 0;
        short s3 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -914616405;
        C12970 c12970 = null;
        C6463 c6463M54267 = null;
        while (true) {
            i14 = i7 ^ (i6 & (((i14 ^ i4) * 41) >> 31));
            switch (i14) {
                case -1952295997:
                case 317154336:
                    sArr = sArr2;
                    s = s3;
                    C1564.m5509();
                    if (C13473.f42873 == 0) {
                        iM2761 = (C0619.m2761("᩸ۛ") + i5) * 47;
                        i = ((iM2761 ^ i4) * (-25607)) ^ (-1899387082);
                        s3 = s;
                        i2 = 971875018;
                    } else {
                        s3 = s;
                        iM2761 = (i4 - C0773.m3169("ۛܽ")) * 13;
                        i = ((iM2761 ^ i5) * (-4363)) ^ 1825967527;
                        i2 = 557994626;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    sArr2 = sArr;
                    break;
                case -1874494412:
                case -213736135:
                    sArr = sArr2;
                    s = s3;
                    if (C2288.m7767()) {
                        sArr2 = sArr;
                        iM2761 = C0773.m3169("۫ۖ") ^ i5;
                        sArr = sArr2;
                        i = ((iM2761 ^ i4) * (-23763)) ^ (-1917798670);
                        s3 = s;
                        i2 = 1004374549;
                    } else {
                        iM2761 = (C0619.m2761("᩸ۛ") + i5) * 47;
                        i = ((iM2761 ^ i4) * (-25607)) ^ (-1899387082);
                        s3 = s;
                        i2 = 971875018;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    sArr2 = sArr;
                    break;
                case -1836485500:
                case 96763782:
                    sArr = sArr2;
                    s = s3;
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = (C0619.m2761("᩸ۛ") + i5) * 47;
                        i = ((iM2761 ^ i4) * (-25607)) ^ (-1899387082);
                        s3 = s;
                        i2 = 971875018;
                    } else {
                        iM2761 = C0773.m3169("֨ܶ") ^ i5;
                        i = ((iM2761 ^ i4) * 15287) ^ (-711887663);
                        s3 = s;
                        i2 = 1715029719;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    sArr2 = sArr;
                    break;
                case -1113701094:
                case 809625301:
                    sArr = sArr2;
                    s2 = s3;
                    f61273 = strM4861;
                    c6463M54267 = C24258.m54267();
                    if (C2354.f7599 >= 0) {
                        iM2761 = (C0773.m3169("ᩴ֡") + i4) * 45;
                        i = ((iM2761 ^ i5) * 25669) ^ (-1256156223);
                        s3 = s2;
                        i2 = 598222488;
                    } else {
                        iM2761 = C0619.m2761("۠ۚ") ^ i4;
                        i = ((iM2761 ^ i5) * (-28709)) ^ (-142863015);
                        s3 = s2;
                        i2 = 1950609023;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    sArr2 = sArr;
                    break;
                case -1090203428:
                case -135244696:
                    f61274 = c6463M54267.m18265();
                    return;
                case -904754293:
                case -450439946:
                    sArr = sArr2;
                    s = s3;
                    i13 = 25;
                    if (C3734.f12817 >= 0) {
                        iM2761 = (C0619.m2761("᩸ۛ") + i5) * 47;
                        i = ((iM2761 ^ i4) * (-25607)) ^ (-1899387082);
                        s3 = s;
                        i2 = 971875018;
                    } else {
                        iM2761 = (C0773.m3169("ᩴܶ") ^ i4) * 31;
                        i = ((iM2761 ^ i5) * 1039) ^ (-1758925591);
                        s3 = s;
                        i2 = 221731902;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    sArr2 = sArr;
                    break;
                case -895501058:
                case 1320499326:
                    sArr = sArr2;
                    short s4 = s3;
                    if (i8 - (i9 + i10) <= 0) {
                        iM2761 = C0773.m3169("ܰۡ") ^ i4;
                        i = ((iM2761 ^ i5) * (-8811)) ^ 665832401;
                        s3 = s4;
                        i2 = -1722827852;
                    } else {
                        iM2761 = C0619.m2761("᩷᩷") ^ i5;
                        i = ((iM2761 ^ i4) * 5903) ^ 1026135469;
                        s3 = s4;
                        i2 = 662572088;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    sArr2 = sArr;
                    break;
                case -660956115:
                case 1848624725:
                    s3 = sArr2[c];
                    if (RunnableC3055.f9898 >= 0) {
                        sArr = sArr2;
                        iM2761 = (i4 - C0773.m3169("ۛܽ")) * 13;
                        i = ((iM2761 ^ i5) * (-4363)) ^ 1825967527;
                        i2 = 557994626;
                    } else {
                        iM2761 = C0773.m3169("֡ۙ") ^ i4;
                        sArr = sArr2;
                        i = ((iM2761 ^ i5) * (-30995)) ^ 2065876890;
                        i2 = 871989442;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    sArr2 = sArr;
                    break;
                case -549770124:
                case 171772802:
                    s = s3;
                    sArr2 = f61270;
                    c = 0;
                    if (C23916.f77426 <= 0) {
                        iM2761 = C0773.m3169("۫ۖ") ^ i5;
                        sArr = sArr2;
                        i = ((iM2761 ^ i4) * (-23763)) ^ (-1917798670);
                        s3 = s;
                        i2 = 1004374549;
                    } else {
                        iM2761 = (i5 - C0619.m2761("ᩳۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        sArr = sArr2;
                        i = ((iM2761 ^ i4) * (-27719)) ^ (-2072614679);
                        s3 = s;
                        i2 = 896357661;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    sArr2 = sArr;
                    break;
                case -484601869:
                case 1955753209:
                    s = s3;
                    sArr3 = f61270;
                    i12 = 1;
                    if (C1783.f6087 <= 0) {
                        sArr = sArr2;
                        iM2761 = (C0619.m2761("᩸ۛ") + i5) * 47;
                        i = ((iM2761 ^ i4) * (-25607)) ^ (-1899387082);
                        s3 = s;
                        i2 = 971875018;
                    } else {
                        iM2761 = C0773.m3169("ۘۧ") ^ i5;
                        sArr = sArr2;
                        i = ((iM2761 ^ i4) * 6883) ^ 1068134336;
                        s3 = s;
                        i2 = -1093876483;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    sArr2 = sArr;
                    break;
                case -338614612:
                case 763617032:
                    i3 = 33665;
                    int iM3169 = (i4 - C0773.m3169("ۜᩴ")) * (-13);
                    sArr = sArr2;
                    i = ((iM3169 ^ i5) * (-29185)) ^ 302888748;
                    i11 = i3;
                    iM2761 = iM3169;
                    s3 = s3;
                    i2 = -853701552;
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    sArr2 = sArr;
                    break;
                case -331586229:
                case 1697503766:
                    s = s3;
                    strM4861 = C1321.m4861(sArr3, i12, i13, i11);
                    if (C2419.f7754 >= 0) {
                        iM2761 = C0773.m3169("۫ۖ") ^ i5;
                        sArr = sArr2;
                        i = ((iM2761 ^ i4) * (-23763)) ^ (-1917798670);
                        s3 = s;
                        i2 = 1004374549;
                    } else {
                        iM2761 = C0619.m2761("ۘ۫") ^ i5;
                        sArr = sArr2;
                        i = ((iM2761 ^ i4) * 31673) ^ (-756195548);
                        s3 = s;
                        i2 = -918549904;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    sArr2 = sArr;
                    break;
                case -248185189:
                case 115166508:
                    s = s3;
                    c12970 = new C12970();
                    if (C4282.f15546 <= 0) {
                        iM2761 = C0773.m3169("۫ۖ") ^ i5;
                        sArr = sArr2;
                        i = ((iM2761 ^ i4) * (-23763)) ^ (-1917798670);
                        s3 = s;
                        i2 = 1004374549;
                    } else {
                        iM2761 = (C0619.m2761("۠ۖ") ^ i5) * (-69);
                        sArr = sArr2;
                        i = ((iM2761 ^ i4) * (-12311)) ^ 1622445192;
                        s3 = s;
                        i2 = -2037870405;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    sArr2 = sArr;
                    break;
                case 99622122:
                case 1325646631:
                    s = s3;
                    C17202.m40372();
                    sArr = sArr2;
                    iM2761 = (C0619.m2761("᩸ۛ") + i5) * 47;
                    i = ((iM2761 ^ i4) * (-25607)) ^ (-1899387082);
                    s3 = s;
                    i2 = 971875018;
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    sArr2 = sArr;
                    break;
                case 516785149:
                case 1285065646:
                    AbstractC3624.m11755();
                    throw new RuntimeException();
                case 520262620:
                case 1403246241:
                    i3 = 5947;
                    int iM31610 = (i4 - C0773.m3169("ۜᩴ")) * (-13);
                    sArr = sArr2;
                    i = ((iM31610 ^ i5) * (-29185)) ^ 302888748;
                    i11 = i3;
                    iM2761 = iM31610;
                    s3 = s3;
                    i2 = -853701552;
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    sArr2 = sArr;
                    break;
                case 615356481:
                case 1097289011:
                    i8 = s3 * 562;
                    if (C2878.f9462) {
                        sArr = sArr2;
                        s = s3;
                        iM2761 = C0773.m3169("֨ܶ") ^ i5;
                        i = ((iM2761 ^ i4) * 15287) ^ (-711887663);
                        s3 = s;
                        i2 = 1715029719;
                    } else {
                        iM2761 = (C0773.m3169("ܽ۬") + i4) * (-79);
                        sArr = sArr2;
                        i = ((iM2761 ^ i5) * (-7327)) ^ (-1129184751);
                        s3 = s3;
                        i2 = -685160368;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    sArr2 = sArr;
                    break;
                case 1080308056:
                case 2012752424:
                    i9 = s3 * s3;
                    if (AbstractC0116.m1243() != 0) {
                        sArr = sArr2;
                        s = s3;
                        i10 = 78961;
                        iM2761 = (C0619.m2761("᩸ۛ") + i5) * 47;
                        i = ((iM2761 ^ i4) * (-25607)) ^ (-1899387082);
                        s3 = s;
                        i2 = 971875018;
                    } else {
                        iM2761 = C0773.m3169("᩸۫") ^ i5;
                        sArr = sArr2;
                        i = ((iM2761 ^ i4) * 24937) ^ (-1029525413);
                        i10 = 78961;
                        i2 = -1102965772;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    sArr2 = sArr;
                    break;
                default:
                    sArr = sArr2;
                    s2 = s3;
                    c6463M54267.m18273(c12970);
                    if (C1321.f4751 >= 0) {
                        iM2761 = (C0773.m3169("ᩴ֡") + i4) * 45;
                        i = ((iM2761 ^ i5) * 25669) ^ (-1256156223);
                        s3 = s2;
                        i2 = 598222488;
                    } else {
                        iM2761 = C0773.m3169("᩹ۖ") ^ i4;
                        i = ((iM2761 ^ i5) * 32487) ^ 1135232943;
                        s3 = s2;
                        i2 = -845573368;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    sArr2 = sArr;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e1  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18872 m43772(String str) {
        int iM2761;
        int i;
        int iM3169;
        int i2;
        LinkedHashMap linkedHashMap = null;
        int i3 = 87771156;
        int i4 = RunnableC0334.f1808;
        int i5 = RunnableC3055.f9898;
        int iM2762 = (C0619.m2761("ܶ᩻") + i5) * (-89);
        int i6 = ((iM2762 ^ i4) * (-24195)) ^ 724748614;
        int i7 = 183674714;
        while (true) {
            int i8 = iM2762 ^ i7;
            C18872 c18872 = null;
            LinkedHashMap linkedHashMap2 = null;
            while (true) {
                i3 = ((((i3 ^ i4) * 30495) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2133380332:
                    case -1196641088:
                        C3998.m12920();
                        iM3169 = (C0619.m2761("۟ۚ") + i5) * 75;
                        i6 = ((iM3169 ^ i4) * (-31901)) ^ (-605395989);
                        i2 = -1219489815;
                        i8 = iM3169 ^ i2;
                        c18872 = null;
                        break;
                    case -1855610875:
                    case 1865548307:
                        if (C0619.m2763()) {
                            iM3169 = C0773.m3169("ܿᩳ") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-29029)) ^ (-1758318167);
                            i2 = 1257930047;
                            i8 = iM3169 ^ i2;
                            c18872 = null;
                        } else if (C11235.f35427 < 0) {
                            if (!C3099.m10095()) {
                                if (C2419.m8174() >= 0) {
                                }
                                if (C0950.f3488 >= 0) {
                                    iM3169 = (C0619.m2761("۟ۚ") + i5) * 75;
                                    i6 = ((iM3169 ^ i4) * (-31901)) ^ (-605395989);
                                    i2 = -1219489815;
                                    i8 = iM3169 ^ i2;
                                    c18872 = null;
                                    break;
                                } else {
                                    if (AbstractC0641.f2496 >= 0) {
                                        break;
                                    }
                                    c18872 = new C18872();
                                    if (C1080.m4050()) {
                                        iM2761 = (C0773.m3169("ۚᩴ") + i4) * 57;
                                        i6 = ((iM2761 ^ i5) * (-20031)) ^ 20627816;
                                        i = 203447471;
                                        i8 = iM2761 ^ i;
                                        break;
                                    }
                                }
                                break;
                            }
                            iM3169 = (i4 - C0619.m2761("ܳۖ")) * 73;
                            i6 = ((iM3169 ^ i5) * (-21287)) ^ (-1597186139);
                            i2 = 225573164;
                            i8 = iM3169 ^ i2;
                            c18872 = null;
                        } else {
                            iM3169 = C0619.m2761("۬ۙ") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-23561)) ^ 2055497086;
                            i2 = 1387306537;
                            i8 = iM3169 ^ i2;
                            c18872 = null;
                        }
                        break;
                    case -1595510353:
                    case 1367421315:
                        if (C2702.f8586 > 0) {
                            iM3169 = C0619.m2761("۬ۙ") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-23561)) ^ 2055497086;
                            i2 = 1387306537;
                        } else {
                            iM3169 = (i4 - C0619.m2761("ܳۖ")) * 73;
                            i6 = ((iM3169 ^ i5) * (-21287)) ^ (-1597186139);
                            i2 = 225573164;
                        }
                        i8 = iM3169 ^ i2;
                        c18872 = null;
                        break;
                    case -1190286022:
                    case 1222180745:
                        C1564.m5509();
                        if (AbstractC3624.f12429 <= 0) {
                            iM3169 = (C0619.m2761("۟ۚ") + i5) * 75;
                            i6 = ((iM3169 ^ i4) * (-31901)) ^ (-605395989);
                            i2 = -1219489815;
                        } else {
                            iM3169 = C0773.m3169("ܿᩳ") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-29029)) ^ (-1758318167);
                            i2 = 1257930047;
                        }
                        i8 = iM3169 ^ i2;
                        c18872 = null;
                        break;
                    case -948237487:
                    case 679416323:
                        c18872.f61277 = linkedHashMap;
                        if (!C0619.f2439) {
                            linkedHashMap2 = new LinkedHashMap();
                            if (!C1321.m4852()) {
                                iM3169 = (i4 - C0619.m2761("ܳۖ")) * 73;
                                i6 = ((iM3169 ^ i5) * (-21287)) ^ (-1597186139);
                                i2 = 225573164;
                                i8 = iM3169 ^ i2;
                                c18872 = null;
                            } else {
                                iM2761 = (i4 - C0619.m2761("ۛ֨")) * (-67);
                                i6 = ((iM2761 ^ i5) * 11499) ^ (-422970054);
                                i = -1092304109;
                                i8 = iM2761 ^ i;
                            }
                        }
                        break;
                    case 569172796:
                    case 1885327065:
                        C1080.m4050();
                        return null;
                    case 1126242873:
                    case 1344121481:
                        c18872.f61275 = linkedHashMap2;
                        c18872.f61276 = str;
                        return c18872;
                    case 1337638861:
                    case 1578101504:
                        C2375.m8065();
                        if (C11235.f35427 >= 0) {
                            iM3169 = (C0619.m2761("۟ۚ") + i5) * 75;
                            i6 = ((iM3169 ^ i4) * (-31901)) ^ (-605395989);
                            i2 = -1219489815;
                        } else {
                            iM3169 = C0619.m2761("۬ۙ") ^ i5;
                            i6 = ((iM3169 ^ i4) * (-23561)) ^ 2055497086;
                            i2 = 1387306537;
                        }
                        i8 = iM3169 ^ i2;
                        c18872 = null;
                        break;
                    default:
                        linkedHashMap = new LinkedHashMap();
                        if (C3734.f12817 < 0) {
                            iM2761 = C0619.m2761("ۘ֫") ^ i5;
                            i6 = ((iM2761 ^ i4) * 6671) ^ 1389146554;
                            i = 761734406;
                            i8 = iM2761 ^ i;
                        }
                        break;
                }
            }
            iM2762 = (C0773.m3169("᩶ۤ") + i4) * 85;
            i6 = ((iM2762 ^ i5) * (-23917)) ^ 695773932;
            i7 = -1861566840;
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x01f6 A[PHI: r6 r16
      0x01f6: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:60:0x01f4, B:47:0x0174, B:11:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x01f6: PHI (r16v23 java.lang.String) = (r16v5 java.lang.String), (r16v8 java.lang.String), (r16v24 java.lang.String) binds: [B:60:0x01f4, B:47:0x0174, B:11:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x022b A[PHI: r3 r9 r10 r16
      0x022b: PHI (r3v4 char) = (r3v2 char), (r3v3 char), (r3v2 char) binds: [B:64:0x0229, B:56:0x01d4, B:15:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x022b: PHI (r9v5 short[]) = (r9v2 short[]), (r9v2 short[]), (r9v6 short[]) binds: [B:64:0x0229, B:56:0x01d4, B:15:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x022b: PHI (r10v5 int) = (r10v2 int), (r10v2 int), (r10v6 int) binds: [B:64:0x0229, B:56:0x01d4, B:15:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x022b: PHI (r16v21 java.lang.String) = (r16v4 java.lang.String), (r16v6 java.lang.String), (r16v22 java.lang.String) binds: [B:64:0x0229, B:56:0x01d4, B:15:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (l.RunnableC0334.m2063() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (l.C3998.f13671 == 0) goto L18;
     */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m43779() {
        /*
            Method dump skipped, instruction units count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18872.m43779():void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43775(String str, String str2) {
        int i = -713117481;
        int i2 = C3779.f12953;
        int i3 = C20932.f66974;
        int iM3169 = C0773.m3169("ܿ۫") ^ i3;
        int i4 = ((iM3169 ^ i2) * 25043) ^ (-807384520);
        int i5 = -1993127313;
        while (true) {
            i = ((((i ^ i2) * (-10311)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1886504225:
                case -1451536755:
                    if (C1783.f6087 > 0) {
                        iM3169 = (C0619.m2761("᩸ۛ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM3169 ^ i3) * 24093) ^ 326462788;
                        i5 = 1730787263;
                    } else {
                        iM3169 = (C0773.m3169("᩹ᩳ") + i2) * 3;
                        i4 = ((iM3169 ^ i3) * (-4959)) ^ 1505967553;
                        i5 = 223833077;
                    }
                    break;
                case -1798839727:
                case -706909476:
                    if (C0862.f3233 != 0) {
                        iM3169 = (C0619.m2761("᩸ۛ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM3169 ^ i3) * 24093) ^ 326462788;
                        i5 = 1730787263;
                    } else {
                        iM3169 = (i2 - C0619.m2761("᩶ۨ")) * (-121);
                        i4 = ((iM3169 ^ i3) * 27803) ^ 716242726;
                        i5 = 1552752713;
                    }
                    break;
                case -1635808237:
                case 1437102364:
                    if (C11235.m28309() != 0) {
                        iM3169 = (i3 - C0619.m2761("֨ۚ")) * (-11);
                        i4 = ((iM3169 ^ i2) * 28693) ^ (-1461033441);
                        i5 = -1498084176;
                    } else {
                        iM3169 = (C0773.m3169("᩹ᩳ") + i2) * 3;
                        i4 = ((iM3169 ^ i3) * (-4959)) ^ 1505967553;
                        i5 = 223833077;
                    }
                    break;
                case -1543543450:
                case -747340877:
                    if (C3099.f10023 <= 0) {
                        iM3169 = (i3 - C0619.m2761("֨ۚ")) * (-11);
                        i4 = ((iM3169 ^ i2) * 28693) ^ (-1461033441);
                        i5 = -1498084176;
                    } else {
                        iM3169 = C0773.m3169("ᩳۡ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 4639) ^ 552511870;
                        i5 = -1643459627;
                    }
                    break;
                case -1375940895:
                case 441263819:
                    if (C1321.f4751 >= 0) {
                        iM3169 = (C0619.m2761("᩸ۛ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM3169 ^ i3) * 24093) ^ 326462788;
                        i5 = 1730787263;
                    } else {
                        iM3169 = C0619.m2761("ۚۛ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-11099)) ^ (-379044489);
                        i5 = -15632104;
                    }
                    break;
                case -1296138288:
                case 67760213:
                    if (C2288.f7433 <= 0) {
                        iM3169 = (i3 - C0619.m2761("֨ۚ")) * (-11);
                        i4 = ((iM3169 ^ i2) * 28693) ^ (-1461033441);
                        i5 = -1498084176;
                    } else {
                        iM3169 = (C0773.m3169("۫᩹") + i2) * (-85);
                        i4 = ((iM3169 ^ i3) * (-14623)) ^ (-7403968);
                        i5 = 1230243161;
                    }
                    break;
                case -1215190995:
                case 114528112:
                    if (C2310.f7472 >= 0) {
                        iM3169 = (i3 - C0619.m2761("֨ۚ")) * (-11);
                        i4 = ((iM3169 ^ i2) * 28693) ^ (-1461033441);
                        i5 = -1498084176;
                    } else {
                        iM3169 = C0773.m3169("ۗۤ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 31987) ^ 485639131;
                        i5 = -879805506;
                    }
                    break;
                case -1121106165:
                case 120998033:
                    if (C2375.f7641 <= 0) {
                        iM3169 = (C0773.m3169("᩹ᩳ") + i2) * 3;
                        i4 = ((iM3169 ^ i3) * (-4959)) ^ 1505967553;
                        i5 = 223833077;
                    } else {
                        iM3169 = (C0773.m3169("ܶۖ") + i2) * (-71);
                        i4 = ((iM3169 ^ i3) * (-16569)) ^ (-47326477);
                        i5 = -1832272564;
                    }
                    break;
                case -1042563390:
                case 2068095639:
                    this.f61277.put(str, str2);
                    break;
                case -515692074:
                case 3438647:
                    if (C3779.f12953 <= 0) {
                        iM3169 = (C0619.m2761("ۙ᩺") + i3) * 61;
                        i4 = ((iM3169 ^ i2) * 16727) ^ 1175221294;
                        i5 = -1045942041;
                    } else {
                        iM3169 = C0619.m2761("۟᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-11033)) ^ (-204546040);
                        i5 = 1380804084;
                    }
                    break;
                case -457777110:
                case 86299692:
                    if (C3492.f12043 <= 0) {
                        iM3169 = (C0619.m2761("ۙ᩺") + i3) * 61;
                        i4 = ((iM3169 ^ i2) * 16727) ^ 1175221294;
                        i5 = -1045942041;
                    } else {
                        iM3169 = (C0619.m2761("᩷۫") ^ i3) * 11;
                        i4 = ((iM3169 ^ i2) * 26775) ^ (-1557772095);
                        i5 = 2064889626;
                    }
                    break;
                case -300774434:
                case 2006115170:
                    if (C4238.m13540() > 0) {
                        iM3169 = (C0619.m2761("ۙ᩺") + i3) * 61;
                        i4 = ((iM3169 ^ i2) * 16727) ^ 1175221294;
                        i5 = -1045942041;
                    } else {
                        iM3169 = (C0773.m3169("᩹ᩳ") + i2) * 3;
                        i4 = ((iM3169 ^ i3) * (-4959)) ^ 1505967553;
                        i5 = 223833077;
                    }
                    break;
                case -223569079:
                case 1347413711:
                    C17202.m40372();
                    iM3169 = (C0773.m3169("᩹ᩳ") + i2) * 3;
                    i4 = ((iM3169 ^ i3) * (-4959)) ^ 1505967553;
                    i5 = 223833077;
                    break;
                case -211241313:
                case 2077610938:
                    if (C0269.m1775() <= 0) {
                        iM3169 = (i3 - C0619.m2761("֨ۚ")) * (-11);
                        i4 = ((iM3169 ^ i2) * 28693) ^ (-1461033441);
                        i5 = -1498084176;
                    } else {
                        iM3169 = C0619.m2761("ۘ᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-17309)) ^ 1845376509;
                        i5 = 771387018;
                    }
                    break;
                case 1925822844:
                case 2035181397:
                    if (C1343.f4799 != 0) {
                        iM3169 = (i3 - C0619.m2761("ۗۧ")) * 63;
                        i4 = ((iM3169 ^ i2) * (-13695)) ^ 313434642;
                        i5 = 374406072;
                    } else {
                        iM3169 = C0773.m3169("᩻ۚ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 12113) ^ (-1670767207);
                        i5 = -350990856;
                    }
                    break;
                default:
                    C1564.m5509();
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 44301. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private l.C9444 m43771(boolean r56) {
        /*
            Method dump skipped, instruction units count: 4430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18872.m43771(boolean):l.ۡܳۨ");
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003f  */
    /* JADX WARN: Code duplicated, block: B:42:0x009e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:54:0x0102  */
    /* JADX WARN: Code duplicated, block: B:57:0x011f  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9921 m43778() {
        int iM2761;
        int i;
        boolean z = false;
        int i2 = -1395316206;
        int i3 = C1146.f4234;
        int i4 = C2310.f7472;
        int iM3169 = (C0773.m3169("ۙܰ") + i3) * (-33);
        int i5 = ((iM3169 ^ i4) * (-21713)) ^ 334126993;
        int i6 = iM3169 ^ (-862252930);
        C9921 c9921 = null;
        while (true) {
            i2 = ((((i2 ^ i4) * (-22517)) >> 31) & i5) ^ i6;
            switch (i2) {
                case -2067500427:
                case 489271476:
                    if (C1783.f6087 > 0) {
                        iM2761 = (C0619.m2761("ۚ۟") ^ i4) * (-109);
                        i5 = ((iM2761 ^ i3) * 30533) ^ (-913978698);
                        i = -1678854477;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۤ᩵")) * 75;
                        i5 = ((iM2761 ^ i4) * (-923)) ^ (-1487929334);
                        i = 1120711253;
                    }
                    i6 = iM2761 ^ i;
                    break;
                case -2060474173:
                case -1360125700:
                    try {
                        try {
                            c9921 = new C9921(new JSONObject(m43771(z).m24818().m23392()));
                            iM2761 = C0773.m3169("ۢ֨") ^ i3;
                            i5 = ((iM2761 ^ i4) * 9907) ^ (-926561812);
                            i = -1299895454;
                        } catch (SocketTimeoutException unused) {
                            c9921 = null;
                            iM2761 = C0773.m3169("ܳ۠") ^ i3;
                            i5 = ((iM2761 ^ i4) * 15607) ^ (-1306887863);
                            i = -91797450;
                        } catch (Throwable unused2) {
                            c9921 = null;
                            iM2761 = (i4 - C0619.m2761("֨ۢ")) * (-23);
                            i5 = ((iM2761 ^ i3) * 4933) ^ (-25139555);
                            i = 344287030;
                        }
                    } catch (SocketTimeoutException unused3) {
                    } catch (Throwable unused4) {
                    }
                    i6 = iM2761 ^ i;
                    break;
                case -1980324214:
                case 1258221625:
                    if (C1343.f4799 == 0) {
                        if (C2419.f7754 < 0 && C2419.m8174() < 0) {
                            if (C1542.f5343 <= 0) {
                                iM2761 = C0619.m2761("᩻ۙ") ^ i4;
                                i5 = ((iM2761 ^ i3) * 293) ^ 1676548051;
                                i = -1560229368;
                            } else if (C3033.f9831 >= 0) {
                                iM2761 = C0773.m3169("ۗۧ") ^ i4;
                                i5 = ((iM2761 ^ i3) * (-15411)) ^ (-2043960554);
                                i = 489411395;
                            } else if (C2419.f7754 >= 0) {
                                iM2761 = (C0773.m3169("ܽۙ") ^ i3) * (-99);
                                i5 = ((iM2761 ^ i4) * (-5745)) ^ (-1623389423);
                                i = -1027992015;
                            } else if (C0269.f1558 <= 0) {
                                iM2761 = (C0619.m2761("ۚ۟") ^ i4) * (-109);
                                i5 = ((iM2761 ^ i3) * 30533) ^ (-913978698);
                                i = -1678854477;
                            } else if (C2834.f9334 <= 0) {
                                iM2761 = (i4 - C0619.m2761("ܽ᩸")) * (-65);
                                i5 = ((iM2761 ^ i3) * (-26783)) ^ 501681345;
                                i = 424583799;
                            } else if (C11235.m28309() != 0) {
                                iM2761 = (C0619.m2761("ۘܺ") ^ i3) * 57;
                                i5 = ((iM2761 ^ i4) * 13771) ^ 1405219937;
                                i = -1687061108;
                            } else if (AbstractC0641.m2813() > 0) {
                                return new C9921(-2);
                            }
                        }
                        iM2761 = (i3 - C0773.m3169("ܰۛ")) * (-71);
                        i5 = ((iM2761 ^ i4) * (-5851)) ^ (-833615585);
                        i = 787150676;
                    } else {
                        iM2761 = (C0773.m3169("ܽۙ") ^ i3) * (-99);
                        i5 = ((iM2761 ^ i4) * (-5745)) ^ (-1623389423);
                        i = -1027992015;
                    }
                    i6 = iM2761 ^ i;
                    break;
                case -1535841005:
                case -887553302:
                    C2834.m9344();
                    if (C3099.m10095()) {
                        iM2761 = (C0619.m2761("ۚ۟") ^ i4) * (-109);
                        i5 = ((iM2761 ^ i3) * 30533) ^ (-913978698);
                        i = -1678854477;
                    } else {
                        iM2761 = (C0619.m2761("ۘܺ") ^ i3) * 57;
                        i5 = ((iM2761 ^ i4) * 13771) ^ 1405219937;
                        i = -1687061108;
                    }
                    i6 = iM2761 ^ i;
                    break;
                case -1068676395:
                case -720093951:
                    return new C9921(-1);
                case -1027500354:
                case -796930068:
                    C20932.m47848();
                    return null;
                case -755631617:
                case 1471402663:
                    C4282.m13644();
                    iM2761 = (C0619.m2761("ۘܺ") ^ i3) * 57;
                    i5 = ((iM2761 ^ i4) * 13771) ^ 1405219937;
                    i = -1687061108;
                    i6 = iM2761 ^ i;
                    break;
                case -242972722:
                case 1995128142:
                    C3099.m10095();
                    if (C1146.m4231()) {
                        iM2761 = (C0773.m3169("ܽۙ") ^ i3) * (-99);
                        i5 = ((iM2761 ^ i4) * (-5745)) ^ (-1623389423);
                        i = -1027992015;
                    } else {
                        iM2761 = (C0619.m2761("ۚ۟") ^ i4) * (-109);
                        i5 = ((iM2761 ^ i3) * 30533) ^ (-913978698);
                        i = -1678854477;
                    }
                    i6 = iM2761 ^ i;
                    break;
                case 39275319:
                case 680850999:
                    if (C2702.f8586 <= 0) {
                        iM2761 = (C0619.m2761("ۘܺ") ^ i3) * 57;
                        i5 = ((iM2761 ^ i4) * 13771) ^ 1405219937;
                        i = -1687061108;
                    } else {
                        iM2761 = C0773.m3169("ۗۧ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-15411)) ^ (-2043960554);
                        i = 489411395;
                    }
                    i6 = iM2761 ^ i;
                    break;
                case 50114150:
                case 2010070669:
                    return c9921;
                case 104399141:
                case 1966209775:
                    if (C2375.m8065() > 0) {
                        iM2761 = C0773.m3169("ۗۧ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-15411)) ^ (-2043960554);
                        i = 489411395;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ܽ᩸")) * (-65);
                        i5 = ((iM2761 ^ i3) * (-26783)) ^ 501681345;
                        i = 424583799;
                    }
                    i6 = iM2761 ^ i;
                    break;
                case 545024139:
                case 1750928586:
                    if (C1080.f3865 >= 0) {
                        iM2761 = (i3 - C0773.m3169("ۤ᩵")) * 75;
                        i5 = ((iM2761 ^ i4) * (-923)) ^ (-1487929334);
                        i = 1120711253;
                    } else {
                        iM2761 = C0619.m2761("᩻ۙ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 293) ^ 1676548051;
                        i = -1560229368;
                    }
                    i6 = iM2761 ^ i;
                    break;
                default:
                    z = true;
                    iM2761 = C0619.m2761("ۨܳ") ^ i4;
                    i5 = ((iM2761 ^ i3) * 4159) ^ (-824773681);
                    i = 2027747054;
                    i6 = iM2761 ^ i;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C9444 m43777() {
        return m43771(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9444 m43773() {
        return m43771(false);
    }
}
