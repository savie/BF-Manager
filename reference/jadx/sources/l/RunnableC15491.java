package l;

import android.content.SharedPreferences;
import com.alipay.sdk.m.y.c;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ܳܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 154F */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC15491 implements Runnable {

    /* JADX INFO: renamed from: ۙ᩶ۤ, reason: not valid java name and contains not printable characters */
    private static final short[] f50418 = {5346, 17838, 21327, 22341};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50419;

    public /* synthetic */ RunnableC15491(int i) {
        this.f50419 = i;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0299 A[PHI: r8 r9 r10 r11 r14 r15
      0x0299: PHI (r8v3 short) = (r8v2 short), (r8v1 short), (r8v1 short), (r8v1 short) binds: [B:74:0x0297, B:70:0x0276, B:66:0x0255, B:42:0x0148] A[DONT_GENERATE, DONT_INLINE]
      0x0299: PHI (r9v3 int) = (r9v1 int), (r9v2 int), (r9v1 int), (r9v1 int) binds: [B:74:0x0297, B:70:0x0276, B:66:0x0255, B:42:0x0148] A[DONT_GENERATE, DONT_INLINE]
      0x0299: PHI (r10v3 int) = (r10v1 int), (r10v1 int), (r10v2 int), (r10v1 int) binds: [B:74:0x0297, B:70:0x0276, B:66:0x0255, B:42:0x0148] A[DONT_GENERATE, DONT_INLINE]
      0x0299: PHI (r11v3 short) = (r11v1 short), (r11v1 short), (r11v2 short), (r11v1 short) binds: [B:74:0x0297, B:70:0x0276, B:66:0x0255, B:42:0x0148] A[DONT_GENERATE, DONT_INLINE]
      0x0299: PHI (r14v2 short[]) = (r14v1 short[]), (r14v1 short[]), (r14v1 short[]), (r14v3 short[]) binds: [B:74:0x0297, B:70:0x0276, B:66:0x0255, B:42:0x0148] A[DONT_GENERATE, DONT_INLINE]
      0x0299: PHI (r15v2 int) = (r15v1 int), (r15v1 int), (r15v1 int), (r15v3 int) binds: [B:74:0x0297, B:70:0x0276, B:66:0x0255, B:42:0x0148] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x02ce A[PHI: r6 r12 r20
      0x02ce: PHI (r6v5 int) = (r6v2 int), (r6v2 int), (r6v6 int) binds: [B:78:0x02cc, B:62:0x0232, B:10:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x02ce: PHI (r12v4 int) = (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:78:0x02cc, B:62:0x0232, B:10:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x02ce: PHI (r20v7 char) = (r20v5 char), (r20v4 char), (r20v4 char) binds: [B:78:0x02cc, B:62:0x0232, B:10:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.lang.Runnable
    public final void run() {
        int iM3169;
        int i;
        int i2;
        int iM2761;
        int i3;
        int i4;
        int i5;
        InterruptedException interruptedException = null;
        String strM6966 = null;
        int iM2762 = 0;
        int i6 = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        short[] sArr = null;
        int i11 = 0;
        int i12 = 812081335;
        int i13 = C2288.f7433;
        int i14 = AbstractC3624.f12429;
        int iM2763 = C0619.m2761("ۧ᩶") ^ i13;
        int i15 = ((iM2763 ^ i14) * (-7017)) ^ 705972889;
        int i16 = iM2763 ^ (-2018833418);
        short[] sArr2 = null;
        int i17 = 0;
        char c = 0;
        long j = 0;
        while (true) {
            i12 = i16 ^ (i15 & (((i12 ^ i14) * (-15057)) >> 31));
            switch (i12) {
                case -2089376012:
                case 1530587342:
                    sArr = f50418;
                    i11 = 1;
                    if (C3734.f12817 < 0) {
                        iM2761 = C0773.m3169("ۤۨ") ^ i14;
                        i3 = ((iM2761 ^ i13) * (-13667)) ^ (-352093081);
                        i4 = 1105791608;
                        i5 = i3;
                        i16 = iM2761 ^ i4;
                        i15 = i5;
                    } else {
                        iM3169 = C0773.m3169("ܶ᩸") ^ i13;
                        i = ((iM3169 ^ i14) * (-13027)) ^ (-1335956224);
                        i2 = -141895535;
                        i16 = iM3169 ^ i2;
                        i15 = i;
                    }
                    break;
                case -1962493298:
                case 1394022865:
                    int i18 = C23582.f76548;
                    return;
                case -1797775205:
                case -411601132:
                    SharedPreferences sharedPreferences = ApplicationC17729.f58262;
                    j = c.a;
                    iM2761 = C0619.m2761("۠ܿ") ^ i14;
                    i3 = ((iM2761 ^ i13) * (-30977)) ^ 949971541;
                    i4 = -1504906269;
                    i5 = i3;
                    i16 = iM2761 ^ i4;
                    i15 = i5;
                    break;
                case -1781004850:
                case 1494865711:
                    C3998.m12920();
                    if (C2834.m9344() < 0) {
                        iM2761 = (i14 - C0773.m3169("ۜᩳ")) * 11;
                        i3 = ((iM2761 ^ i13) * 3981) ^ (-2115547890);
                        i4 = -1350355186;
                        i5 = i3;
                        i16 = iM2761 ^ i4;
                        i15 = i5;
                    } else {
                        iM3169 = (i14 - C0619.m2761("ܰۘ")) * (-103);
                        i = ((iM3169 ^ i13) * 24127) ^ 1699062855;
                        i2 = -1731527137;
                        i16 = iM3169 ^ i2;
                        i15 = i;
                    }
                    break;
                case -1780104005:
                case -349882803:
                    C3998.m12920();
                    if (C1542.f5343 <= 0) {
                        iM2761 = (i13 - C0773.m3169("᩶֫")) * 75;
                        i3 = ((iM2761 ^ i14) * (-12987)) ^ (-511740808);
                        i4 = 619969663;
                        i5 = i3;
                        i16 = iM2761 ^ i4;
                        i15 = i5;
                    } else {
                        iM3169 = C0773.m3169("۠ۚ") ^ i13;
                        i = ((iM3169 ^ i14) * 27153) ^ 1093089665;
                        i2 = 673274714;
                        i16 = iM3169 ^ i2;
                        i15 = i;
                    }
                    break;
                case -1771214392:
                case -1620118984:
                    switch (this.f50419) {
                        case 0:
                            iM3169 = (C0619.m2761("ۛۢ") + i14) * 25;
                            i = ((iM3169 ^ i13) * 31981) ^ 399665803;
                            i2 = -1924545315;
                            break;
                        case 1:
                            iM3169 = C0619.m2761("᩻ۡ") ^ i14;
                            i = ((iM3169 ^ i13) * 17723) ^ (-2124924940);
                            i2 = 418974173;
                            break;
                        default:
                            iM3169 = (C0773.m3169("ۜ֨") + i13) * (-39);
                            i = ((iM3169 ^ i14) * 25527) ^ (-1679770009);
                            i2 = 1583372175;
                            break;
                    }
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    break;
                case -1706643887:
                case 676546363:
                    i10 = 40997;
                    iM3169 = (C0773.m3169("֫۠") + i13) * 85;
                    i = ((iM3169 ^ i14) * 31715) ^ (-1722440128);
                    i2 = 988627810;
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    break;
                case -1681902350:
                case 830861112:
                    iM2762 = C0619.m2761(strM6966);
                    i6 = 2124680554;
                    if (C2702.f8586 <= 0) {
                        iM2761 = (i13 - C0773.m3169("᩶֫")) * 75;
                        i3 = ((iM2761 ^ i14) * (-12987)) ^ (-511740808);
                        i4 = 619969663;
                    } else {
                        iM2761 = (C0619.m2761("ۘ᩹") + i14) * (-115);
                        i3 = ((iM2761 ^ i13) * 19073) ^ 1520332068;
                        i4 = 1113775265;
                    }
                    i5 = i3;
                    i16 = iM2761 ^ i4;
                    i15 = i5;
                    break;
                case -1503068850:
                case -658750504:
                    C3734.m12146(iM2762 ^ i6);
                    return;
                case -1277491234:
                case 1148289972:
                    i9 = s * s2;
                    if (C2287.f7432 >= 0) {
                        iM3169 = (i14 - C0619.m2761("ܰۘ")) * (-103);
                        i = ((iM3169 ^ i13) * 24127) ^ 1699062855;
                        i2 = -1731527137;
                    } else {
                        iM3169 = (i13 - C0773.m3169("᩺ۧ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM3169 ^ i14) * (-11407)) ^ (-58752443);
                        i2 = 803986478;
                    }
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    break;
                case -1186931856:
                case 1270235723:
                    throw new RuntimeException(interruptedException);
                case -996384767:
                case 1262343326:
                    if (i8 - (i9 + 1) < 0) {
                        iM3169 = C0619.m2761("᩸ᩳ") ^ i13;
                        i = ((iM3169 ^ i14) * (-31345)) ^ 1848303422;
                        i2 = 1241656989;
                    } else {
                        iM3169 = (C0619.m2761("֡ۛ") + i14) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM3169 ^ i13) * 13307) ^ 1173842025;
                        i2 = -518983954;
                    }
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    break;
                case -977725194:
                case 168099126:
                    i17 = 3;
                    if (!C2878.f9462) {
                        iM2761 = C0619.m2761("ܳ۫") ^ i13;
                        i3 = ((iM2761 ^ i14) * (-22767)) ^ 2017635642;
                        i4 = 438705245;
                        i5 = i3;
                        i16 = iM2761 ^ i4;
                        i15 = i5;
                    } else {
                        iM3169 = (i14 - C0619.m2761("ܰۘ")) * (-103);
                        i = ((iM3169 ^ i13) * 24127) ^ 1699062855;
                        i2 = -1731527137;
                        i16 = iM3169 ^ i2;
                        i15 = i;
                    }
                    break;
                case -436609852:
                case 1870561301:
                    sArr2 = f50418;
                    if (C3077.f9998) {
                        iM3169 = (C0773.m3169("ۖ۠") ^ i13) * (-27);
                        i = ((iM3169 ^ i14) * (-14277)) ^ 852190182;
                        i2 = -965893438;
                    } else {
                        iM3169 = C0773.m3169("۠ۚ") ^ i13;
                        i = ((iM3169 ^ i14) * 27153) ^ 1093089665;
                        i2 = 673274714;
                    }
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    break;
                case -370380537:
                case 10646149:
                    C3779.m12264();
                    C1146.m4231();
                    iM3169 = C0773.m3169("۠ۚ") ^ i13;
                    i = ((iM3169 ^ i14) * 27153) ^ 1093089665;
                    i2 = 673274714;
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    break;
                case -308214666:
                case -105920229:
                    try {
                        Thread.sleep(j);
                        iM2761 = (i13 - C0619.m2761("ܽۛ")) * (-51);
                        i3 = ((iM2761 ^ i14) * 6211) ^ 944803798;
                        i4 = -1686293127;
                        i5 = i3;
                        i16 = iM2761 ^ i4;
                    } catch (InterruptedException e) {
                        int iM31610 = C0773.m3169("ܳ᩹") ^ i14;
                        int i19 = ((iM31610 ^ i13) * 9075) ^ 221659448;
                        i16 = iM31610 ^ (-223540964);
                        i5 = i19;
                        interruptedException = e;
                    }
                    i15 = i5;
                    break;
                case -223540054:
                case 1699977207:
                    C9341.m24618();
                    C9383.m24707();
                    C25053.m55879();
                    return;
                case -181563262:
                case 504023094:
                    i7 = s + 1;
                    if (C1826.f6190 <= 0) {
                        iM3169 = C0773.m3169("ܶ᩸") ^ i13;
                        i = ((iM3169 ^ i14) * (-13027)) ^ (-1335956224);
                        i2 = -141895535;
                    } else {
                        iM3169 = (C0773.m3169("ۗۚ") ^ i13) * 17;
                        i = ((iM3169 ^ i14) * (-27397)) ^ 1506734594;
                        i2 = -812759885;
                    }
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    break;
                case 218410077:
                case 2020924696:
                    strM6966 = C2023.m6966(sArr, i11, i17, i10);
                    if (C1826.f6190 > 0) {
                        iM2761 = (i13 - C0773.m3169("᩸۠")) * (-67);
                        i3 = ((iM2761 ^ i14) * (-4723)) ^ 57650277;
                        i4 = 1960694233;
                        i5 = i3;
                        i16 = iM2761 ^ i4;
                        i15 = i5;
                    } else {
                        iM3169 = C0773.m3169("۠ۚ") ^ i13;
                        i = ((iM3169 ^ i14) * 27153) ^ 1093089665;
                        i2 = 673274714;
                        i16 = iM3169 ^ i2;
                        i15 = i;
                    }
                    break;
                case 221540466:
                case 497716000:
                    i10 = 13458;
                    iM3169 = (C0773.m3169("֫۠") + i13) * 85;
                    i = ((iM3169 ^ i14) * 31715) ^ (-1722440128);
                    i2 = 988627810;
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    break;
                case 642074483:
                case 1208786221:
                    i8 = i7 * i7;
                    s2 = 2;
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0773.m3169("ܶ᩸") ^ i13;
                        i = ((iM3169 ^ i14) * (-13027)) ^ (-1335956224);
                        i2 = -141895535;
                    } else {
                        iM3169 = (C0619.m2761("ܿ֡") ^ i14) * 55;
                        i = ((iM3169 ^ i13) * (-9337)) ^ 1889206569;
                        i2 = -473157658;
                    }
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    break;
                case 703846471:
                case 1075201381:
                    s = sArr2[c];
                    if (C3099.f10023 <= 0) {
                        iM3169 = C0773.m3169("ܶ᩸") ^ i13;
                        i = ((iM3169 ^ i14) * (-13027)) ^ (-1335956224);
                        i2 = -141895535;
                    } else {
                        iM3169 = C0773.m3169("ܶܳ") ^ i14;
                        i = ((iM3169 ^ i13) * 21669) ^ 178318758;
                        i2 = -1094689291;
                    }
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    break;
                case 1067773505:
                case 1249093629:
                    C2702.m8876();
                    C2288.m7767();
                    return;
                case 1116121140:
                case 1733485521:
                    c = 0;
                    if (C3448.m11248() != 0) {
                        iM3169 = (i14 - C0619.m2761("ܰۘ")) * (-103);
                        i = ((iM3169 ^ i13) * 24127) ^ 1699062855;
                        i2 = -1731527137;
                    } else {
                        iM3169 = (i14 - C0619.m2761("᩷ۡ")) * (-101);
                        i = ((iM3169 ^ i13) * (-23179)) ^ (-1314274013);
                        i2 = 1285708005;
                    }
                    i16 = iM3169 ^ i2;
                    i15 = i;
                    break;
                default:
                    RunnableC1848.m6360();
                    if (C2375.f7641 <= 0) {
                        iM3169 = (i14 - C0619.m2761("ܰۘ")) * (-103);
                        i = ((iM3169 ^ i13) * 24127) ^ 1699062855;
                        i2 = -1731527137;
                        i16 = iM3169 ^ i2;
                        i15 = i;
                    } else {
                        iM2761 = (i13 - C0773.m3169("᩶֫")) * 75;
                        i3 = ((iM2761 ^ i14) * (-12987)) ^ (-511740808);
                        i4 = 619969663;
                        i5 = i3;
                        i16 = iM2761 ^ i4;
                        i15 = i5;
                    }
                    break;
            }
        }
    }
}
