package l;

import android.content.SharedPreferences;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۡ᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 154F */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC9185 implements Runnable {

    /* JADX INFO: renamed from: ֫ۚᩴ, reason: not valid java name and contains not printable characters */
    private static final short[] f31262 = {4469, 25995, 26002, 26068, 26041, 26006, 25991, 26002, 25998, 26057, 26005, 25986, 25989, 25991, 26004, 25986, 26057, 26027, 26034, 26068, 7800, 13275, -99};

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f31263;

    public /* synthetic */ RunnableC9185(int i) {
        this.f31263 = i;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x007c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0142 A[PHI: r4 r5
      0x0142: PHI (r4v4 java.lang.String) = (r4v3 java.lang.String), (r4v2 java.lang.String), (r4v2 java.lang.String) binds: [B:39:0x0140, B:23:0x00c5, B:21:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x0142: PHI (r5v4 java.lang.String) = (r5v3 java.lang.String), (r5v2 java.lang.String), (r5v2 java.lang.String) binds: [B:39:0x0140, B:23:0x00c5, B:21:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01d6 A[PHI: r1 r7 r9 r10 r11 r14 r15
      0x01d6: PHI (r1v4 android.content.SharedPreferences) = 
      (r1v3 android.content.SharedPreferences)
      (r1v2 android.content.SharedPreferences)
      (r1v2 android.content.SharedPreferences)
      (r1v2 android.content.SharedPreferences)
     binds: [B:52:0x01d4, B:48:0x01b2, B:33:0x0116, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x01d6: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:52:0x01d4, B:48:0x01b2, B:33:0x0116, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x01d6: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:52:0x01d4, B:48:0x01b2, B:33:0x0116, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x01d6: PHI (r10v4 short[]) = (r10v2 short[]), (r10v2 short[]), (r10v3 short[]), (r10v2 short[]) binds: [B:52:0x01d4, B:48:0x01b2, B:33:0x0116, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x01d6: PHI (r11v4 int) = (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:52:0x01d4, B:48:0x01b2, B:33:0x0116, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x01d6: PHI (r14v4 short[]) = (r14v3 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:52:0x01d4, B:48:0x01b2, B:33:0x0116, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x01d6: PHI (r15v4 int) = (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:52:0x01d4, B:48:0x01b2, B:33:0x0116, B:9:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x02d3 A[PHI: r2 r3 r6 r8 r18
      0x02d3: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v3 java.lang.String), (r2v2 java.lang.String), (r2v2 java.lang.String) binds: [B:72:0x02d1, B:44:0x0192, B:29:0x00f3, B:6:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x02d3: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v5 java.lang.String) binds: [B:72:0x02d1, B:44:0x0192, B:29:0x00f3, B:6:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x02d3: PHI (r6v4 java.lang.String) = (r6v2 java.lang.String), (r6v2 java.lang.String), (r6v3 java.lang.String), (r6v2 java.lang.String) binds: [B:72:0x02d1, B:44:0x0192, B:29:0x00f3, B:6:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x02d3: PHI (r8v4 short[]) = (r8v2 short[]), (r8v3 short[]), (r8v2 short[]), (r8v2 short[]) binds: [B:72:0x02d1, B:44:0x0192, B:29:0x00f3, B:6:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x02d3: PHI (r18v4 int) = (r18v3 int), (r18v2 int), (r18v2 int), (r18v2 int) binds: [B:72:0x02d1, B:44:0x0192, B:29:0x00f3, B:6:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x0306 A[PHI: r19 r20 r25
      0x0306: PHI (r19v4 int) = (r19v2 int), (r19v3 int), (r19v2 int), (r19v2 int) binds: [B:76:0x0304, B:68:0x02b2, B:18:0x009a, B:16:0x0096] A[DONT_GENERATE, DONT_INLINE]
      0x0306: PHI (r20v4 short) = (r20v3 short), (r20v2 short), (r20v2 short), (r20v2 short) binds: [B:76:0x0304, B:68:0x02b2, B:18:0x009a, B:16:0x0096] A[DONT_GENERATE, DONT_INLINE]
      0x0306: PHI (r25v5 short) = (r25v3 short), (r25v4 short), (r25v3 short), (r25v3 short) binds: [B:76:0x0304, B:68:0x02b2, B:18:0x009a, B:16:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0338 A[PHI: r16 r17
      0x0338: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:80:0x0336, B:16:0x0096, B:12:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x0338: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:80:0x0336, B:16:0x0096, B:12:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.lang.Runnable
    public final void run() {
        int iM11306;
        int i;
        int i2;
        int i3 = C10634.f36300;
        int i4 = C1875.f7103;
        int iM11307 = ThreadFactoryC3888.m11306("ᩳ۟") ^ i4;
        int i5 = ((iM11307 ^ i3) * (-4553)) ^ (-1709428324);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM11307 ^ (-1259204150);
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        char c = 0;
        int i12 = 0;
        int i13 = 0;
        short s = 0;
        int i14 = -965552193;
        short s2 = 0;
        short[] sArr4 = null;
        String strM4832 = null;
        String strM29688 = null;
        String strM10951 = null;
        String strM10056 = null;
        String strM3009 = null;
        SharedPreferences sharedPreferences = null;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i3) * 32053) >> 31));
            switch (i14) {
                case -2112195610:
                case -302707621:
                    i10 = 46155;
                    iM11306 = (i4 - ThreadFactoryC3888.m11306("۬֫")) * 7;
                    i = ((iM11306 ^ i3) * (-23447)) ^ (-348718299);
                    i2 = -349496369;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -2055561267:
                case 1250214905:
                    switch (this.f31263) {
                        case 0:
                            iM11306 = ThreadFactoryC3888.m11306("ۙ᩹") ^ i3;
                            i = ((iM11306 ^ i4) * (-1779)) ^ 1724671151;
                            i2 = -1616687080;
                            break;
                        case 1:
                            int iM11308 = (ThreadFactoryC3888.m11306("᩹ܳ") ^ i4) * (-21);
                            i5 = ((iM11308 ^ i3) * 599) ^ (-515738841);
                            i6 = iM11308 ^ (-1342165577);
                            continue;
                        default:
                            iM11306 = (C19806.m45029("᩶ܳ") ^ i3) * (-105);
                            i = ((iM11306 ^ i4) * 17785) ^ 283132767;
                            i2 = -79951577;
                            break;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1961735703:
                case -269583312:
                    s = sArr4[c];
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = C19806.m45029("֨ۗ") ^ i3;
                        i = ((iM11306 ^ i4) * 2259) ^ 1080742218;
                        i2 = -159496082;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵᩹") ^ i3;
                        i = ((iM11306 ^ i4) * (-24137)) ^ (-41023264);
                        i2 = 83743;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1869947491:
                case 1593007837:
                    sArr3 = f31262;
                    i9 = 20;
                    i8 = 3;
                    if (C0817.f3443) {
                        iM11306 = ThreadFactoryC3888.m11306("֫᩶") ^ i3;
                        i = ((iM11306 ^ i4) * 28419) ^ 1308366856;
                        i2 = 558629238;
                    } else {
                        iM11306 = C19806.m45029("ܺܶ") ^ i3;
                        i = ((iM11306 ^ i4) * (-27247)) ^ 1430885832;
                        i2 = 665474827;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1782397614:
                case 547832499:
                    sharedPreferences = ApplicationC0716.f2988;
                    sArr = f31262;
                    i11 = 1;
                    if (C1398.f5802 <= 0) {
                        iM11306 = C19806.m45029("ܺܶ") ^ i3;
                        i = ((iM11306 ^ i4) * (-27247)) ^ 1430885832;
                        i2 = 665474827;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۤᩳ") ^ i3) * 47;
                        i = ((iM11306 ^ i4) * 25459) ^ 70754;
                        i2 = -1930944403;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1733407652:
                case 1252937230:
                    if (C0629.m2907()) {
                        iM11306 = ThreadFactoryC3888.m11306("ܿۜ") ^ i3;
                        i = ((iM11306 ^ i4) * (-15741)) ^ 664770234;
                        i2 = -1896796437;
                    } else {
                        iM11306 = C19806.m45029("ۢۤ") ^ i4;
                        i = ((iM11306 ^ i3) * (-7123)) ^ 431902692;
                        i2 = -1519804944;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1655282127:
                case 1640545296:
                    i7 = 8;
                    if (C10634.f36300 >= 0) {
                        iM11306 = C19806.m45029("ܺܶ") ^ i3;
                        i = ((iM11306 ^ i4) * (-27247)) ^ 1430885832;
                        i2 = 665474827;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۙۧ")) * 119;
                        i = ((iM11306 ^ i3) * 17089) ^ (-157858950);
                        i2 = 10375279;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1639434442:
                case -609936391:
                    strM4832 = C1377.m4832(sArr3, i9, i8, i10);
                    if (C2477.f9839 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳܳ") ^ i4;
                        i = ((iM11306 ^ i3) * 16759) ^ 1109811032;
                        i2 = 223647999;
                    } else {
                        iM11306 = (C19806.m45029("ۡۡ") ^ i4) * (-121);
                        i = ((iM11306 ^ i3) * (-12513)) ^ (-1280522748);
                        i2 = -888685791;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1403943985:
                case 1314411039:
                    if (C1398.m4895() <= 0) {
                        iM11306 = C19806.m45029("֨ۗ") ^ i3;
                        i = ((iM11306 ^ i4) * 2259) ^ 1080742218;
                        i2 = -159496082;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿۜ") ^ i3;
                        i = ((iM11306 ^ i4) * (-15741)) ^ 664770234;
                        i2 = -1896796437;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1365799365:
                case -678251112:
                    int i15 = s + s2;
                    if ((i15 * i15) - i13 < 0) {
                        iM11306 = C19806.m45029("ۖۧ") ^ i4;
                        i = ((iM11306 ^ i3) * 6475) ^ (-1305824512);
                        i2 = 1764473498;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫᩺") ^ i3;
                        i = ((iM11306 ^ i4) * 14007) ^ (-537218107);
                        i2 = -1059076538;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1348402626:
                case -1090062896:
                    i12 = s * 2;
                    if (C1025.f4800 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳܳ") ^ i4;
                        i = ((iM11306 ^ i3) * 16759) ^ 1109811032;
                        i2 = 223647999;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳۜ") + i4) * 119;
                        i = ((iM11306 ^ i3) * 337) ^ (-933935763);
                        i2 = 685142117;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1244941376:
                case -429477774:
                    if (RunnableC1895.f7152) {
                        iM11306 = C19806.m45029("ۢۤ") ^ i4;
                        i = ((iM11306 ^ i3) * (-7123)) ^ 431902692;
                        i2 = -1519804944;
                    } else {
                        iM11306 = C19806.m45029("ܺܶ") ^ i3;
                        i = ((iM11306 ^ i4) * (-27247)) ^ 1430885832;
                        i2 = 665474827;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1018142546:
                case 510877050:
                    C1189.m4360(C19806.m45029(strM4832) ^ 2127108005);
                    break;
                case -961899192:
                case 2145110722:
                    i10 = 26086;
                    iM11306 = (i4 - ThreadFactoryC3888.m11306("۬֫")) * 7;
                    i = ((iM11306 ^ i3) * (-23447)) ^ (-348718299);
                    i2 = -349496369;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -881402075:
                case 1543437567:
                    ApplicationC0716.f2988.edit().putString(strM3009, strM29688).apply();
                    C11904.m29696(strM29688);
                    iM11306 = (C19806.m45029("ۘ֨") + i4) * (-99);
                    i = ((iM11306 ^ i3) * 27647) ^ (-1040046807);
                    i2 = 719289273;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -496995065:
                case 560878352:
                    break;
                case -116320239:
                case 1606432939:
                    sArr4 = f31262;
                    c = 0;
                    if (C2332.f8260) {
                        iM11306 = ThreadFactoryC3888.m11306("ۜۡ") ^ i4;
                        i = ((iM11306 ^ i3) * 473) ^ (-223233518);
                        i2 = 1612939713;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿۜ") ^ i3;
                        i = ((iM11306 ^ i4) * (-15741)) ^ 664770234;
                        i2 = -1896796437;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -76428503:
                case 91995359:
                    if (C1460.m5058(strM10951, C2642.m8161(ApplicationC0716.f2988, strM3009, strM10056))) {
                        iM11306 = (i4 - C19806.m45029("ܿ᩷")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM11306 ^ i3) * (-8105)) ^ (-1713295880);
                        i2 = 457967328;
                    } else {
                        iM11306 = (C19806.m45029("ۘ֨") + i4) * (-99);
                        i = ((iM11306 ^ i3) * 27647) ^ (-1040046807);
                        i2 = 719289273;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 81953674:
                case 843732887:
                    C10750.m27045();
                    break;
                case 213441235:
                case 1028528460:
                    strM10951 = C3743.m10951(sharedPreferences, strM3009, strM10056);
                    strM29688 = C11904.m29688(strM10951);
                    if (C1460.m5058(strM29688, strM10951)) {
                        iM11306 = (C19806.m45029("ۘ֨") + i4) * (-99);
                        i = ((iM11306 ^ i3) * 27647) ^ (-1040046807);
                        i2 = 719289273;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("۬ᩳ")) * 81;
                        i = ((iM11306 ^ i4) * 13019) ^ (-618624187);
                        i2 = 1966876283;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 462617299:
                case 2095932415:
                    i13 = i12 + 1;
                    s2 = 1;
                    if (C1461.m5080()) {
                        iM11306 = C19806.m45029("֨ۗ") ^ i3;
                        i = ((iM11306 ^ i4) * 2259) ^ 1080742218;
                        i2 = -159496082;
                    } else {
                        iM11306 = (C19806.m45029("᩶ܰ") ^ i3) * 5;
                        i = ((iM11306 ^ i4) * (-22993)) ^ 816526891;
                        i2 = 1823758029;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 467185771:
                case 1232732714:
                    C3286.m9798();
                    C0817.m3399();
                    break;
                case 694980342:
                case 838153725:
                    C3577.m10565();
                    C0817.m3399();
                    iM11306 = C19806.m45029("֨ۗ") ^ i3;
                    i = ((iM11306 ^ i4) * 2259) ^ 1080742218;
                    i2 = -159496082;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1408504678:
                case 1773591806:
                    strM3009 = C0671.m3009(sArr, i11, i7, i10);
                    sArr2 = f31262;
                    if (C2124.f7782 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳܳ") ^ i4;
                        i = ((iM11306 ^ i3) * 16759) ^ 1109811032;
                        i2 = 223647999;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۠۬") + i3) * (-7);
                        i = ((iM11306 ^ i4) * (-2999)) ^ 1241107111;
                        i2 = -1540255299;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    strM10056 = RunnableC3388.m10056(sArr2, 9, 11, i10);
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳܳ") ^ i4;
                        i = ((iM11306 ^ i3) * 16759) ^ 1109811032;
                        i2 = 223647999;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸ۡ") ^ i4) * (-25);
                        i = ((iM11306 ^ i3) * (-24711)) ^ (-527371040);
                        i2 = 894705040;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }
}
