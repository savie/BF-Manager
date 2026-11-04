package l;

import android.app.Application;
import android.os.SystemClock;
import com.alipay.sdk.m.p.a;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۗ֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: T5M8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3076 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C17930 f9993;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Runnable f9994;

    /* JADX INFO: renamed from: ᩳ᩻֫, reason: not valid java name and contains not printable characters */
    private static final short[] f9995 = {6231, 30605, 30598, 30593, 30657, 30594, 30619, 30657, 30623, 30595, 30618, 30620, 30616, 30615, 30602, 30605, 30604, 30684, 30601, 30605, 30605, 30680, 30680, 30683, 30686, 30604, 30686, 30681, 30604, 30602, 30616, 30615, 30602, 30682, 30682, 30686, 30685, 30684, 30678, 30685, 30604, 30681, 30603, 30679, 30687, 30685, 30682, 30678, 5850, -22596, -22613, -22616, -22597, -22624, -22614, -22613, -22614, -22594, -22609, -22617, -22614, 7555, 30351, -16695, 28030, -23605, -23248, -21096, -19468, 25482, -20282, 24323, 23987, 19019, 24367, 20103, 26541, 30690, 25505, 23092, 17132};

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final String f9996;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static volatile long f9997;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final boolean m10031(C24706 c24706) {
        long jM55174 = 0;
        long j = 0;
        int i = -791428328;
        int i2 = C1321.f4751;
        int i3 = C23916.f77426;
        int iM3169 = C0773.m3169("ܿܿ") ^ i3;
        int i4 = ((iM3169 ^ i2) * 29475) ^ 360959770;
        int i5 = -2079288715;
        while (true) {
            i = ((((i ^ i2) * 5161) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2122125626:
                case 870794159:
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0773.m3169("ܺ᩻") ^ i2;
                        i4 = ((iM3169 ^ i3) * 12985) ^ 1538974609;
                        i5 = 959197998;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ܿۘ")) * 13;
                        i4 = ((iM3169 ^ i3) * 9433) ^ (-817352989);
                        i5 = 1719712739;
                    }
                    break;
                case -2118305798:
                case 1131447789:
                    if (C17202.f56030) {
                        iM3169 = C0773.m3169("ܳܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-8153)) ^ (-1873924098);
                        i5 = -1944864823;
                    } else {
                        iM3169 = (C0619.m2761("ܺۤ") + i3) * 91;
                        i4 = ((iM3169 ^ i2) * 26385) ^ 113262483;
                        i5 = 1374895102;
                    }
                    break;
                case -2028880639:
                case -1873495864:
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0773.m3169("ܶۧ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 17373) ^ 1923374354;
                        i5 = -1395010988;
                    } else {
                        iM3169 = (C0773.m3169("ܳۘ") + i3) * 51;
                        i4 = ((iM3169 ^ i2) * (-28249)) ^ 668036950;
                        i5 = 1581447279;
                    }
                    break;
                case -2005988838:
                case 1948154329:
                    return false;
                case -1615587628:
                case -162047671:
                    C0269.m1775();
                    if (C0773.m3161() == 0) {
                        iM3169 = (C0619.m2761("ܺۤ") + i3) * 91;
                        i4 = ((iM3169 ^ i2) * 26385) ^ 113262483;
                        i5 = 1374895102;
                    } else {
                        iM3169 = C0773.m3169("ܶۧ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 17373) ^ 1923374354;
                        i5 = -1395010988;
                    }
                    break;
                case -1225784779:
                case 1338144602:
                    if (C0487.m2356() >= 0) {
                        iM3169 = C0773.m3169("ܺ᩻") ^ i2;
                        i4 = ((iM3169 ^ i3) * 12985) ^ 1538974609;
                        i5 = 959197998;
                    } else {
                        iM3169 = (i2 - C0773.m3169("᩷ᩴ")) * 15;
                        i4 = ((iM3169 ^ i3) * (-13555)) ^ (-410956531);
                        i5 = 1171440707;
                    }
                    break;
                case -1093406594:
                case 1304014406:
                    C20932.m47848();
                    if (C1519.f5300 >= 0) {
                        iM3169 = (C0619.m2761("᩵ۘ") + i2) * (-107);
                        i4 = ((iM3169 ^ i3) * (-17813)) ^ 1070595804;
                        i5 = 1732341350;
                    } else {
                        iM3169 = C0773.m3169("ܶۧ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 17373) ^ 1923374354;
                        i5 = -1395010988;
                    }
                    break;
                case -1091361277:
                case 2122748126:
                    if (c24706 != null) {
                        iM3169 = C0619.m2761("ۢ۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * 15301) ^ (-621260856);
                        i5 = -915961941;
                    } else {
                        iM3169 = C0773.m3169("ۢܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-16337)) ^ 452310279;
                        i5 = -1299413731;
                    }
                    break;
                case -732591454:
                case 1702024199:
                    if (C1146.f4234 >= 0) {
                        iM3169 = C0619.m2761("ܶ᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * 29559) ^ 275994705;
                        i5 = 1499780292;
                    } else {
                        iM3169 = C0773.m3169("֫ۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-15623)) ^ (-371333328);
                        i5 = 151299765;
                    }
                    break;
                case -449478258:
                case 1560020654:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0619.m2761("ܶ᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * 29559) ^ 275994705;
                        i5 = 1499780292;
                    } else {
                        iM3169 = (C0619.m2761("ۗۨ") ^ i3) * (-113);
                        i4 = ((iM3169 ^ i2) * (-8995)) ^ (-337055850);
                        i5 = 893260738;
                    }
                    break;
                case -293189716:
                case 998343472:
                    if (!C2354.m7983()) {
                        iM3169 = C0619.m2761("ܶ᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * 29559) ^ 275994705;
                        i5 = 1499780292;
                    } else {
                        iM3169 = C0773.m3169("ܶۧ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 17373) ^ 1923374354;
                        i5 = -1395010988;
                    }
                    break;
                case -134269770:
                case 322380793:
                    if (jM55174 == j) {
                        iM3169 = (C0773.m3169("۠᩸") + i3) * (-21);
                        i4 = ((iM3169 ^ i2) * 8083) ^ 1885147000;
                        i5 = 1726121430;
                    } else {
                        iM3169 = C0773.m3169("ۢܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-16337)) ^ 452310279;
                        i5 = -1299413731;
                    }
                    break;
                case -131562987:
                case -9705500:
                    if (C2375.m8065() <= 0) {
                        iM3169 = (C0619.m2761("ܺۤ") + i3) * 91;
                        i4 = ((iM3169 ^ i2) * 26385) ^ 113262483;
                        i5 = 1374895102;
                    } else {
                        iM3169 = C0619.m2761("֨ۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 4005) ^ (-1560803327);
                        i5 = 1603350952;
                    }
                    break;
                case 172092254:
                case 462711520:
                    C3448.m11248();
                    return false;
                case 539284279:
                case 883837515:
                    if (C2485.m8357() <= 0) {
                        iM3169 = (C0619.m2761("᩵ۘ") + i2) * (-107);
                        i4 = ((iM3169 ^ i3) * (-17813)) ^ 1070595804;
                        i5 = 1732341350;
                    } else {
                        iM3169 = (C0773.m3169("ܳۙ") + i2) * (-15);
                        i4 = ((iM3169 ^ i3) * 8017) ^ (-1396329459);
                        i5 = -483519796;
                    }
                    break;
                case 1076140584:
                case 1669823826:
                    AbstractC3624.m11755();
                    iM3169 = C0773.m3169("ܶۧ") ^ i2;
                    i4 = ((iM3169 ^ i3) * 17373) ^ 1923374354;
                    i5 = -1395010988;
                    break;
                case 1302657260:
                case 1367670215:
                    if (C15243.m36589((Object) c24706.m55175(), (Object) C0773.m3167())) {
                        iM3169 = C0619.m2761("ܽ۬") ^ i2;
                        i4 = ((iM3169 ^ i3) * 16219) ^ (-380522519);
                        i5 = -678036038;
                    } else {
                        iM3169 = C0773.m3169("ۢܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-16337)) ^ 452310279;
                        i5 = -1299413731;
                    }
                    break;
                case 1669524277:
                case 1879016685:
                    jM55174 = c24706.m55174();
                    j = f9997;
                    if (C23916.f77426 <= 0) {
                        iM3169 = C0773.m3169("ܶۧ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 17373) ^ 1923374354;
                        i5 = -1395010988;
                    } else {
                        iM3169 = C0773.m3169("ܳ᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-20015)) ^ 1700039566;
                        i5 = 656740645;
                    }
                    break;
                case 1728072433:
                case 1896727950:
                    return true;
                default:
                    if (C2878.f9462) {
                        iM3169 = (C0619.m2761("ܺۤ") + i3) * 91;
                        i4 = ((iM3169 ^ i2) * 26385) ^ 113262483;
                        i5 = 1374895102;
                    } else {
                        iM3169 = (C0773.m3169("ۛ֨") ^ i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM3169 ^ i3) * 1851) ^ (-1267833859);
                        i5 = 1503836391;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:132:0x0504 A[PHI: r0 r20 r21 r27
      0x0504: PHI (r0v32 int) = (r0v6 int), (r0v11 int), (r0v33 int) binds: [B:131:0x0502, B:111:0x0430, B:37:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x0504: PHI (r20v4 int) = (r20v2 int), (r20v3 int), (r20v2 int) binds: [B:131:0x0502, B:111:0x0430, B:37:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x0504: PHI (r21v4 int) = (r21v2 int), (r21v3 int), (r21v2 int) binds: [B:131:0x0502, B:111:0x0430, B:37:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x0504: PHI (r27v59 boolean) = (r27v40 boolean), (r27v45 boolean), (r27v60 boolean) binds: [B:131:0x0502, B:111:0x0430, B:37:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:136:0x053a A[PHI: r0 r17 r27
      0x053a: PHI (r0v36 int) = (r0v5 int), (r0v7 int), (r0v9 int), (r0v39 int) binds: [B:135:0x0538, B:127:0x04e2, B:119:0x048d, B:11:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x053a: PHI (r17v4 short[]) = (r17v2 short[]), (r17v2 short[]), (r17v3 short[]), (r17v2 short[]) binds: [B:135:0x0538, B:127:0x04e2, B:119:0x048d, B:11:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x053a: PHI (r27v63 boolean) = (r27v39 boolean), (r27v41 boolean), (r27v43 boolean), (r27v66 boolean) binds: [B:135:0x0538, B:127:0x04e2, B:119:0x048d, B:11:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:144:0x059d A[PHI: r0 r22 r27
      0x059d: PHI (r0v12 int) = (r0v2 int), (r0v3 int), (r0v13 int) binds: [B:30:0x00d7, B:143:0x059b, B:107:0x0409] A[DONT_GENERATE, DONT_INLINE]
      0x059d: PHI (r22v3 int) = (r22v2 int), (r22v2 int), (r22v4 int) binds: [B:30:0x00d7, B:143:0x059b, B:107:0x0409] A[DONT_GENERATE, DONT_INLINE]
      0x059d: PHI (r27v46 boolean) = (r27v5 boolean), (r27v37 boolean), (r27v47 boolean) binds: [B:30:0x00d7, B:143:0x059b, B:107:0x0409] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a0  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10029(String str, String str2, long j) {
        int iM3169;
        int i;
        int i2;
        int iM2761;
        int i3;
        int iM2762;
        int i4;
        int iM31610;
        int i5;
        String str3 = str;
        String str4 = str2;
        int i6 = C2419.f7754;
        int i7 = C4238.f15451;
        int iM31611 = (C0773.m3169("֡ۚ") + i6) * 37;
        int i8 = ((iM31611 ^ i7) * (-10219)) ^ 796477414;
        int[] iArr = null;
        JSONObject jSONObjectM43548 = null;
        C13778 c13778M29287 = null;
        short[] sArr = null;
        int i9 = iM31611 ^ 1195691011;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean zM36589 = false;
        boolean z = false;
        boolean z2 = false;
        boolean zM5516 = false;
        boolean zM33682 = false;
        boolean zM365810 = false;
        short s = 0;
        short s2 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = -2056008999;
        while (true) {
            i17 = i9 ^ (i8 & (((i17 ^ i7) * 32559) >> 31));
            switch (i17) {
                case -2125396315:
                case -1436202171:
                    z2 = z2;
                    i16 = i16;
                    if (C11235.m28309() != 0) {
                        iM2762 = (C0619.m2761("ᩳܿ") + i6) * (-65);
                        i8 = ((iM2762 ^ i7) * (-23119)) ^ (-383856708);
                        i4 = 302915194;
                    } else {
                        iM2762 = (i7 - C0619.m2761("᩺ۛ")) * (-125);
                        i8 = ((iM2762 ^ i6) * (-5071)) ^ (-1521156837);
                        i4 = 1203898934;
                    }
                    i16 = i16;
                    z2 = z2;
                    str3 = str;
                    i9 = iM2762 ^ i4;
                    str4 = str2;
                    break;
                case -2115230739:
                case -1041002005:
                    z2 = z2;
                    i16 = i16;
                    if (C2485.f7950 != 0) {
                        iM2762 = C0773.m3169("᩹ܺ") ^ i7;
                        i8 = ((iM2762 ^ i6) * 9001) ^ (-1179044837);
                        i4 = 145805417;
                    } else {
                        iM2762 = C0619.m2761("ۨۢ") ^ i7;
                        i8 = ((iM2762 ^ i6) * 27331) ^ 1111975086;
                        i4 = -501257878;
                    }
                    i16 = i16;
                    z2 = z2;
                    str3 = str;
                    i9 = iM2762 ^ i4;
                    str4 = str2;
                    break;
                case -2034050360:
                case -201602219:
                    z2 = z2;
                    if (j == f9997) {
                        iM3169 = C0773.m3169("᩷᩶") ^ i6;
                        i = ((iM3169 ^ i7) * (-665)) ^ 213201833;
                        i2 = -629698840;
                        int i18 = iM3169 ^ i2;
                        z2 = z2;
                        i9 = i18;
                        i8 = i;
                    } else {
                        i16 = i16;
                        iM2762 = C0619.m2761("ᩳۚ") ^ i7;
                        i8 = ((iM2762 ^ i6) * (-4637)) ^ (-2116206370);
                        i4 = -2060572269;
                        i16 = i16;
                        z2 = z2;
                        str3 = str;
                        i9 = iM2762 ^ i4;
                        str4 = str2;
                    }
                    break;
                case -1963315147:
                case -277892947:
                    z2 = z2;
                    C2592 c2592M12270 = C3779.m12270(i12);
                    C2023.m6965(c2592M12270, str4);
                    jSONObjectM43548 = C18738.m43548(c2592M12270);
                    zM36589 = C15243.m36589((Object) str3, (Object) C0773.m3167());
                    iM3169 = C0619.m2761("᩹ܰ") ^ i7;
                    i = ((iM3169 ^ i6) * (-16805)) ^ (-210631382);
                    i2 = 1438359761;
                    int i19 = iM3169 ^ i2;
                    z2 = z2;
                    i9 = i19;
                    i8 = i;
                    break;
                case -1950969025:
                case 301727000:
                    zM33682 = c13778M29287.m33682();
                    iM2761 = C0619.m2761("ܺ۟") ^ i7;
                    i = ((iM2761 ^ i6) * (-32437)) ^ (-985711530);
                    i3 = 735332687;
                    i9 = iM2761 ^ i3;
                    i8 = i;
                    break;
                case -1915139410:
                case 337836999:
                    z2 = z2;
                    i16 = i16;
                    if (C1519.m5403()) {
                        iM2762 = C0619.m2761("ۡۨ") ^ i6;
                        i8 = ((iM2762 ^ i7) * 10487) ^ (-798208678);
                        i4 = 161168960;
                    } else {
                        iM2762 = C0619.m2761("᩶ܶ") ^ i6;
                        i8 = ((iM2762 ^ i7) * (-11773)) ^ (-1513518484);
                        i4 = 489942642;
                    }
                    i16 = i16;
                    z2 = z2;
                    str3 = str;
                    i9 = iM2762 ^ i4;
                    str4 = str2;
                    break;
                case -1866182894:
                case -1295003123:
                    try {
                        f9993.mo40348(new C24706(str4, str3, j));
                        z2 = z2;
                        i16 = i16;
                        iM2762 = C0619.m2761("ᩳۚ") ^ i7;
                        i8 = ((iM2762 ^ i6) * (-4637)) ^ (-2116206370);
                        i4 = -2060572269;
                        i16 = i16;
                        z2 = z2;
                        str3 = str;
                        i9 = iM2762 ^ i4;
                        str4 = str2;
                    } catch (Exception unused) {
                        iM3169 = C0619.m2761("ۜᩴ") ^ i6;
                        i = ((iM3169 ^ i7) * 461) ^ 2075965539;
                        i2 = -154021759;
                        int i110 = iM3169 ^ i2;
                        z2 = z2;
                        i9 = i110;
                        i8 = i;
                    }
                    break;
                case -1790503816:
                case -1106406019:
                    if (C23916.f77426 > 0) {
                        z2 = z2;
                        i16 = i16;
                        iM2762 = C0773.m3169("᩹ܺ") ^ i7;
                        i8 = ((iM2762 ^ i6) * 9001) ^ (-1179044837);
                        i4 = 145805417;
                        i16 = i16;
                        z2 = z2;
                        str3 = str;
                        i9 = iM2762 ^ i4;
                        str4 = str2;
                    }
                    z2 = z2;
                    i16 = i16;
                    iM2762 = (C0773.m3169("᩷ܰ") + i6) * (-75);
                    i8 = ((iM2762 ^ i7) * (-27531)) ^ (-531776255);
                    i4 = -1685561817;
                    i16 = i16;
                    z2 = z2;
                    str3 = str;
                    i9 = iM2762 ^ i4;
                    str4 = str2;
                    break;
                case -1752857622:
                case 1656859644:
                    i10 = 42958;
                    iM2762 = (i6 - C0619.m2761("ۙۖ")) * 31;
                    i8 = ((iM2762 ^ i7) * 26127) ^ (-1175730509);
                    i4 = -2056784151;
                    i16 = i16;
                    z2 = z2;
                    str3 = str;
                    i9 = iM2762 ^ i4;
                    str4 = str2;
                    break;
                case -1736472424:
                case 192566807:
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0773.m3169("᩸ۛ") ^ i6;
                        i = ((iM2761 ^ i7) * (-5589)) ^ (-1224426033);
                        i3 = -557323359;
                    } else {
                        iM2761 = C0773.m3169("ۤ᩵") ^ i7;
                        i = ((iM2761 ^ i6) * (-861)) ^ 17864351;
                        i3 = 746824609;
                    }
                    i9 = iM2761 ^ i3;
                    i8 = i;
                    break;
                case -1707839847:
                case 1865528656:
                    C1564.m5509();
                    if (C2375.m8065() <= 0) {
                        z2 = z2;
                        i16 = i16;
                        iM2762 = (i6 - C0773.m3169("᩹۬")) * 41;
                        i8 = ((iM2762 ^ i7) * 9675) ^ 1166524352;
                        i4 = 1625538296;
                        i16 = i16;
                        z2 = z2;
                        str3 = str;
                        i9 = iM2762 ^ i4;
                        str4 = str2;
                    } else {
                        iM2761 = C0773.m3169("ۖ֡") ^ i7;
                        i = ((iM2761 ^ i6) * (-16941)) ^ 1714489155;
                        i3 = -910719835;
                        i9 = iM2761 ^ i3;
                        i8 = i;
                    }
                    break;
                case -1654418813:
                case 1298290263:
                    if (!zM33682) {
                        iM3169 = C0619.m2761("ۜᩴ") ^ i6;
                        i = ((iM3169 ^ i7) * 461) ^ 2075965539;
                        i2 = -154021759;
                        int i111 = iM3169 ^ i2;
                        z2 = z2;
                        i9 = i111;
                        i8 = i;
                    } else {
                        z2 = z2;
                        i16 = i16;
                        iM2762 = C0619.m2761("ᩳۚ") ^ i7;
                        i8 = ((iM2762 ^ i6) * (-4637)) ^ (-2116206370);
                        i4 = -2060572269;
                        i16 = i16;
                        z2 = z2;
                        str3 = str;
                        i9 = iM2762 ^ i4;
                        str4 = str2;
                    }
                    break;
                case -1484826625:
                case 1254869936:
                    AbstractC0641.m2813();
                    break;
                case -1438114561:
                case 762699261:
                    if (zM365810) {
                        iM2761 = C0619.m2761("᩹ᩴ") ^ i7;
                        i = ((iM2761 ^ i6) * (-31349)) ^ 786608631;
                        i3 = 644889888;
                    } else {
                        iM2761 = (C0619.m2761("֡᩵") + i6) * (-93);
                        i = ((iM2761 ^ i7) * (-27549)) ^ (-155851650);
                        i3 = -410836219;
                    }
                    i9 = iM2761 ^ i3;
                    i8 = i;
                    break;
                case -1424791056:
                case 1375928765:
                    z2 = z2;
                    i12 = 4371;
                    iM3169 = C0773.m3169("۬ۚ") ^ i7;
                    i = ((iM3169 ^ i6) * (-30039)) ^ (-1194044723);
                    i2 = 1507348714;
                    int i112 = iM3169 ^ i2;
                    z2 = z2;
                    i9 = i112;
                    i8 = i;
                    break;
                case -1397906156:
                case -382630719:
                    z2 = z2;
                    i16 = i16;
                    if (C2287.f7432 >= 0) {
                        iM2762 = (C0773.m3169("᩷ܰ") + i6) * (-75);
                        i8 = ((iM2762 ^ i7) * (-27531)) ^ (-531776255);
                        i4 = -1685561817;
                    } else {
                        iM2762 = C0619.m2761("ۛ۠") ^ i6;
                        i8 = ((iM2762 ^ i7) * 27105) ^ 1142901536;
                        i4 = -377096047;
                    }
                    i16 = i16;
                    z2 = z2;
                    str3 = str;
                    i9 = iM2762 ^ i4;
                    str4 = str2;
                    break;
                case -1382543345:
                case 865742461:
                    break;
                case -1369611418:
                case 896367302:
                    if (z2) {
                        iM2761 = (C0619.m2761("۟ۢ") + i6) * (-101);
                        i = ((iM2761 ^ i7) * (-9135)) ^ (-1209162002);
                        i3 = 36685400;
                        i9 = iM2761 ^ i3;
                        i8 = i;
                    }
                    iM3169 = C0619.m2761("ۜᩴ") ^ i6;
                    i = ((iM3169 ^ i7) * 461) ^ 2075965539;
                    i2 = -154021759;
                    int i113 = iM3169 ^ i2;
                    z2 = z2;
                    i9 = i113;
                    i8 = i;
                    break;
                case -1292762117:
                case 1902563996:
                    z2 = z2;
                    z = jSONObjectM43548.getBoolean(AbstractC3624.m11769(f9995, 49, 8, i10));
                    iM3169 = C0619.m2761("ۢ᩸") ^ i7;
                    i = ((iM3169 ^ i6) * (-30957)) ^ (-1403992498);
                    i2 = 115346413;
                    int i114 = iM3169 ^ i2;
                    z2 = z2;
                    i9 = i114;
                    i8 = i;
                    break;
                case -1169503625:
                case -479981291:
                    if (C23916.f77426 <= 0) {
                        iM2761 = C0773.m3169("ۖ֡") ^ i7;
                        i = ((iM2761 ^ i6) * (-16941)) ^ 1714489155;
                        i3 = -910719835;
                    } else {
                        iM2761 = C0773.m3169("᩸ۛ") ^ i6;
                        i = ((iM2761 ^ i7) * (-5589)) ^ (-1224426033);
                        i3 = -557323359;
                    }
                    i9 = iM2761 ^ i3;
                    i8 = i;
                    break;
                case -1106979167:
                case -702214872:
                    if (C0619.f2439) {
                        iM2761 = C0773.m3169("᩸ۛ") ^ i6;
                        i = ((iM2761 ^ i7) * (-5589)) ^ (-1224426033);
                        i3 = -557323359;
                    } else {
                        iM2761 = C0619.m2761("ۘ᩺") ^ i7;
                        i = ((iM2761 ^ i6) * (-9871)) ^ 1099473205;
                        i3 = -968277976;
                    }
                    i9 = iM2761 ^ i3;
                    i8 = i;
                    break;
                case -967418567:
                case -485513681:
                    z2 = z2;
                    if (!zM36589) {
                        i16 = i16;
                        iM2762 = C0619.m2761("ᩳۚ") ^ i7;
                        i8 = ((iM2762 ^ i6) * (-4637)) ^ (-2116206370);
                        i4 = -2060572269;
                        i16 = i16;
                        z2 = z2;
                        str3 = str;
                        i9 = iM2762 ^ i4;
                        str4 = str2;
                    } else {
                        iM3169 = (C0773.m3169("ۜܰ") ^ i6) * 3;
                        i = ((iM3169 ^ i7) * 14541) ^ (-1760277584);
                        i2 = -402416250;
                        int i115 = iM3169 ^ i2;
                        z2 = z2;
                        i9 = i115;
                        i8 = i;
                    }
                    break;
                case -928428337:
                case 343417136:
                    C3690.m11987();
                    if (C2310.f7472 < 0) {
                        z2 = z2;
                        i16 = i16;
                        iM2762 = C0619.m2761("᩶ܶ") ^ i6;
                        i8 = ((iM2762 ^ i7) * (-11773)) ^ (-1513518484);
                        i4 = 489942642;
                        i16 = i16;
                        z2 = z2;
                        str3 = str;
                        i9 = iM2762 ^ i4;
                        str4 = str2;
                    }
                    z2 = z2;
                    i16 = i16;
                    iM2762 = (C0773.m3169("᩷ܰ") + i6) * (-75);
                    i8 = ((iM2762 ^ i7) * (-27531)) ^ (-531776255);
                    i4 = -1685561817;
                    i16 = i16;
                    z2 = z2;
                    str3 = str;
                    i9 = iM2762 ^ i4;
                    str4 = str2;
                    break;
                case -922636923:
                case 875256417:
                    z2 = z2;
                    i16 = i16;
                    s = sArr[48];
                    s2 = 2853;
                    if (C1343.f4799 != 0) {
                        iM2762 = C0773.m3169("ܿ֡") ^ i7;
                        i8 = ((iM2762 ^ i6) * 2691) ^ 1099687132;
                        i4 = 2115933604;
                    } else {
                        iM2762 = (C0773.m3169("ۗܰ") + i6) * 21;
                        i8 = ((iM2762 ^ i7) * 9435) ^ (-567842085);
                        i4 = 1378103802;
                    }
                    i16 = i16;
                    z2 = z2;
                    str3 = str;
                    i9 = iM2762 ^ i4;
                    str4 = str2;
                    break;
                case -771630639:
                case 1634015839:
                    zM365810 = C15243.m36589((Object) str3, (Object) C0773.m3167());
                    iM2761 = (C0773.m3169("۠۫") + i6) * (-105);
                    i = ((iM2761 ^ i7) * (-4481)) ^ (-2046029516);
                    i3 = -1395703524;
                    i9 = iM2761 ^ i3;
                    i8 = i;
                    break;
                case -757169576:
                case 1643307646:
                    z2 = z2;
                    i16 = i16;
                    if (C2419.f7754 >= 0) {
                        iM2762 = C0619.m2761("᩶ܶ") ^ i6;
                        i8 = ((iM2762 ^ i7) * (-11773)) ^ (-1513518484);
                        i4 = 489942642;
                    } else {
                        iM2762 = C0773.m3169("ܰۘ") ^ i6;
                        i8 = ((iM2762 ^ i7) * 6323) ^ (-912341167);
                        i4 = 571633511;
                    }
                    i16 = i16;
                    z2 = z2;
                    str3 = str;
                    i9 = iM2762 ^ i4;
                    str4 = str2;
                    break;
                case -561317219:
                case 1529063303:
                    z2 = z2;
                    i16 = i16;
                    int i20 = i14 + i15;
                    if (i13 - (i20 + i20) > 0) {
                        iM2762 = (C0773.m3169("۫ۘ") + i7) * (-31);
                        i8 = ((iM2762 ^ i6) * 2119) ^ 459006800;
                        i4 = -1827623565;
                    } else {
                        iM2762 = (C0619.m2761("ܰ۫") + i6) * 41;
                        i8 = ((iM2762 ^ i7) * (-7237)) ^ (-860333222);
                        i4 = -1181523471;
                    }
                    i16 = i16;
                    z2 = z2;
                    str3 = str;
                    i9 = iM2762 ^ i4;
                    str4 = str2;
                    break;
                case -486387055:
                case 421281924:
                    if (zM5516) {
                        iM2761 = C0773.m3169("ۢܽ") ^ i7;
                        i = ((iM2761 ^ i6) * 5135) ^ 480411846;
                        i3 = -674038803;
                    } else {
                        iM2761 = (C0619.m2761("֡᩵") + i6) * (-93);
                        i = ((iM2761 ^ i7) * (-27549)) ^ (-155851650);
                        i3 = -410836219;
                    }
                    i9 = iM2761 ^ i3;
                    i8 = i;
                    break;
                case -460286777:
                case -370075634:
                    z2 = z2;
                    i16 = i16;
                    i15 = 8139609;
                    if (C3492.f12043 <= 0) {
                        iM2762 = (i6 - C0773.m3169("᩹۬")) * 41;
                        i8 = ((iM2762 ^ i7) * 9675) ^ 1166524352;
                        i4 = 1625538296;
                    } else {
                        iM2762 = C0619.m2761("ܿۧ") ^ i6;
                        i8 = ((iM2762 ^ i7) * 3935) ^ 256427247;
                        i4 = 1459477663;
                    }
                    i16 = i16;
                    z2 = z2;
                    str3 = str;
                    i9 = iM2762 ^ i4;
                    str4 = str2;
                    break;
                case -332453311:
                case 1033641325:
                    try {
                        z2 = jSONObjectM43548.getBoolean(C4238.m13530(f9995, 57, 4, i10));
                        iM2761 = (i6 - C0619.m2761("ۜۜ")) * 35;
                        i = ((iM2761 ^ i7) * (-22045)) ^ 613235493;
                        i3 = -1658058344;
                        i9 = iM2761 ^ i3;
                    } catch (Exception unused2) {
                        iM3169 = C0619.m2761("ۜᩴ") ^ i6;
                        i = ((iM3169 ^ i7) * 461) ^ 2075965539;
                        i2 = -154021759;
                        int i116 = iM3169 ^ i2;
                        z2 = z2;
                        i9 = i116;
                    }
                    i8 = i;
                    break;
                case -183253978:
                case 1932862114:
                    z2 = z2;
                    i16 = i16;
                    if (i11 < i16) {
                        iM2762 = (C0619.m2761("ۙ᩺") ^ i6) * 77;
                        i8 = ((iM2762 ^ i7) * 13235) ^ 1686698983;
                        i4 = 588017407;
                    } else {
                        iM2762 = C0619.m2761("ᩳۚ") ^ i7;
                        i8 = ((iM2762 ^ i6) * (-4637)) ^ (-2116206370);
                        i4 = -2060572269;
                    }
                    i16 = i16;
                    z2 = z2;
                    str3 = str;
                    i9 = iM2762 ^ i4;
                    str4 = str2;
                    break;
                case -84295217:
                case 2124873235:
                    i11++;
                    iM31610 = C0773.m3169("᩹ܶ") ^ i7;
                    i8 = (-1117720114) ^ ((iM31610 ^ i6) * (-26213));
                    i5 = -981392298;
                    int i21 = iM31610 ^ i5;
                    str4 = str2;
                    z2 = z2;
                    i9 = i21;
                    str3 = str;
                    break;
                case -30547252:
                case 1263473908:
                    z2 = z2;
                    i16 = i16;
                    if (C2834.f9334 <= 0) {
                        iM2762 = (i6 - C0773.m3169("᩹۬")) * 41;
                        i8 = ((iM2762 ^ i7) * 9675) ^ 1166524352;
                        i4 = 1625538296;
                    } else {
                        iM2762 = (i7 - C0619.m2761("ۗۘ")) * (-17);
                        i8 = ((iM2762 ^ i6) * 26369) ^ 1853388647;
                        i4 = 1900993580;
                    }
                    i16 = i16;
                    z2 = z2;
                    str3 = str;
                    i9 = iM2762 ^ i4;
                    str4 = str2;
                    break;
                case 50467290:
                case 1705571567:
                    iArr = new int[]{500, 500, 500, 500, 1000, 1000, 1000, 1000, 1000, 1000};
                    i11 = 0;
                    i16 = 10;
                    iM31610 = C0773.m3169("᩹ܶ") ^ i7;
                    i8 = (-1117720114) ^ ((iM31610 ^ i6) * (-26213));
                    i5 = -981392298;
                    int i22 = iM31610 ^ i5;
                    str4 = str2;
                    z2 = z2;
                    i9 = i22;
                    str3 = str;
                    break;
                case 310902405:
                case 685070192:
                    z2 = z2;
                    SystemClock.sleep(iArr[i11]);
                    if (!C2288.m7766()) {
                        i16 = i16;
                        iM2762 = C0619.m2761("ᩳۚ") ^ i7;
                        i8 = ((iM2762 ^ i6) * (-4637)) ^ (-2116206370);
                        i4 = -2060572269;
                        i16 = i16;
                        z2 = z2;
                        str3 = str;
                        i9 = iM2762 ^ i4;
                        str4 = str2;
                    } else {
                        iM31610 = (C0773.m3169("ᩴ᩻") + i7) * 47;
                        i8 = (-648201849) ^ ((iM31610 ^ i6) * 7463);
                        i5 = -350925951;
                        int i23 = iM31610 ^ i5;
                        str4 = str2;
                        z2 = z2;
                        i9 = i23;
                        str3 = str;
                    }
                    break;
                case 709240231:
                case 1887824639:
                    c13778M29287 = C11650.m29287();
                    zM5516 = C1564.m5516(c13778M29287);
                    iM2761 = (C0773.m3169("ۜۢ") + i7) * (-57);
                    i = ((iM2761 ^ i6) * 16007) ^ (-395662080);
                    i3 = 1209975181;
                    i9 = iM2761 ^ i3;
                    i8 = i;
                    break;
                case 752554444:
                case 1673587205:
                    z2 = z2;
                    i16 = i16;
                    int i24 = s + s2;
                    i13 = i24 * i24;
                    i14 = s * s;
                    if (C3492.m11488()) {
                        iM2762 = (C0773.m3169("۟ܳ") ^ i7) * (-117);
                        i8 = ((iM2762 ^ i6) * (-28721)) ^ 1017914642;
                        i4 = -1721333384;
                    } else {
                        iM2762 = (C0619.m2761("ᩳܿ") + i6) * (-65);
                        i8 = ((iM2762 ^ i7) * (-23119)) ^ (-383856708);
                        i4 = 302915194;
                    }
                    i16 = i16;
                    z2 = z2;
                    str3 = str;
                    i9 = iM2762 ^ i4;
                    str4 = str2;
                    break;
                case 949367601:
                case 1285842629:
                    i10 = 35090;
                    iM2762 = (i6 - C0619.m2761("ۙۖ")) * 31;
                    i8 = ((iM2762 ^ i7) * 26127) ^ (-1175730509);
                    i4 = -2056784151;
                    i16 = i16;
                    z2 = z2;
                    str3 = str;
                    i9 = iM2762 ^ i4;
                    str4 = str2;
                    break;
                case 1098906087:
                case 1895732131:
                    C0269.m1775();
                    if (C0269.f1558 > 0) {
                        z2 = z2;
                        i16 = i16;
                        iM2762 = (C0773.m3169("᩷ܰ") + i6) * (-75);
                        i8 = ((iM2762 ^ i7) * (-27531)) ^ (-531776255);
                        i4 = -1685561817;
                        i16 = i16;
                        z2 = z2;
                        str3 = str;
                        i9 = iM2762 ^ i4;
                        str4 = str2;
                    } else {
                        iM2761 = C0773.m3169("ۖ֡") ^ i7;
                        i = ((iM2761 ^ i6) * (-16941)) ^ 1714489155;
                        i3 = -910719835;
                        i9 = iM2761 ^ i3;
                        i8 = i;
                    }
                    break;
                case 1330811356:
                case 1420331193:
                    z2 = z2;
                    i16 = i16;
                    sArr = f9995;
                    if (C1542.f5343 <= 0) {
                        iM2762 = C0619.m2761("᩶ܶ") ^ i6;
                        i8 = ((iM2762 ^ i7) * (-11773)) ^ (-1513518484);
                        i4 = 489942642;
                    } else {
                        iM2762 = (i7 - C0619.m2761("ۘܰ")) * (-7);
                        i8 = ((iM2762 ^ i6) * 13593) ^ 1944994799;
                        i4 = -939327796;
                    }
                    i16 = i16;
                    z2 = z2;
                    str3 = str;
                    i9 = iM2762 ^ i4;
                    str4 = str2;
                    break;
                case 1443865031:
                case 1454575944:
                    if (!C0619.m2763()) {
                        z2 = z2;
                        i16 = i16;
                        iM2762 = (C0619.m2761("ᩳܿ") + i6) * (-65);
                        i8 = ((iM2762 ^ i7) * (-23119)) ^ (-383856708);
                        i4 = 302915194;
                        i16 = i16;
                        z2 = z2;
                        str3 = str;
                        i9 = iM2762 ^ i4;
                        str4 = str2;
                    } else {
                        iM2761 = C0773.m3169("ۖ֡") ^ i7;
                        i = ((iM2761 ^ i6) * (-16941)) ^ 1714489155;
                        i3 = -910719835;
                        i9 = iM2761 ^ i3;
                        i8 = i;
                    }
                    break;
                case 1677973600:
                case 1730866897:
                    z2 = z2;
                    if (!C15243.m36589((Object) str3, (Object) C0619.m2752())) {
                        i16 = i16;
                        iM2762 = C0619.m2761("ᩳۚ") ^ i7;
                        i8 = ((iM2762 ^ i6) * (-4637)) ^ (-2116206370);
                        i4 = -2060572269;
                        i16 = i16;
                        z2 = z2;
                        str3 = str;
                        i9 = iM2762 ^ i4;
                        str4 = str2;
                    } else {
                        iM3169 = (C0773.m3169("ᩳ᩸") + i6) * (-21);
                        i = ((iM3169 ^ i7) * 9147) ^ 1648217625;
                        i2 = 1260743597;
                        int i117 = iM3169 ^ i2;
                        z2 = z2;
                        i9 = i117;
                        i8 = i;
                    }
                    break;
                case 2006204604:
                case 2130731015:
                    C0619.m2763();
                    C1564.m5509();
                    z2 = z2;
                    i16 = i16;
                    iM2762 = (C0619.m2761("ᩳܿ") + i6) * (-65);
                    i8 = ((iM2762 ^ i7) * (-23119)) ^ (-383856708);
                    i4 = 302915194;
                    i16 = i16;
                    z2 = z2;
                    str3 = str;
                    i9 = iM2762 ^ i4;
                    str4 = str2;
                    break;
                default:
                    z2 = z2;
                    if (!z) {
                        iM3169 = (C0773.m3169("᩸᩻") ^ i7) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM3169 ^ i6) * 12411) ^ (-2095484884);
                        i2 = 1233735371;
                        int i118 = iM3169 ^ i2;
                        z2 = z2;
                        i9 = i118;
                        i8 = i;
                    } else {
                        i16 = i16;
                        iM2762 = C0619.m2761("ᩳۚ") ^ i7;
                        i8 = ((iM2762 ^ i6) * (-4637)) ^ (-2116206370);
                        i4 = -2060572269;
                        i16 = i16;
                        z2 = z2;
                        str3 = str;
                        i9 = iM2762 ^ i4;
                        str4 = str2;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m10032() {
        return f9996;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00eb A[PHI: r2 r9
      0x00eb: PHI (r2v7 java.lang.String) = (r2v6 java.lang.String), (r2v2 java.lang.String) binds: [B:29:0x00d4, B:23:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x00eb: PHI (r9v4 com.tencent.mm.opensdk.openapi.IWXAPI) = (r9v3 com.tencent.mm.opensdk.openapi.IWXAPI), (r9v2 com.tencent.mm.opensdk.openapi.IWXAPI) binds: [B:29:0x00d4, B:23:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x015c A[PHI: r7
      0x015c: PHI (r7v6 java.lang.String) = (r7v5 java.lang.String), (r7v1 java.lang.String) binds: [B:41:0x015a, B:9:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x028d A[PHI: r5 r11 r12
      0x028d: PHI (r5v4 long) = (r5v3 long), (r5v2 long) binds: [B:53:0x01ef, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x028d: PHI (r11v3 int) = (r11v2 int), (r11v5 int) binds: [B:53:0x01ef, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x028d: PHI (r12v3 int) = (r12v2 int), (r12v5 int) binds: [B:53:0x01ef, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02de  */
    /* JADX WARN: Code duplicated, block: B:83:0x0325  */
    /* JADX WARN: Code duplicated, block: B:87:0x0351 A[PHI: r3 r4 r10 r18
      0x0351: PHI (r3v6 java.lang.String) = 
      (r3v1 java.lang.String)
      (r3v1 java.lang.String)
      (r3v1 java.lang.String)
      (r3v1 java.lang.String)
      (r3v5 java.lang.String)
      (r3v1 java.lang.String)
      (r3v1 java.lang.String)
      (r3v1 java.lang.String)
      (r3v1 java.lang.String)
     binds: [B:86:0x034f, B:78:0x030a, B:70:0x02c1, B:57:0x0219, B:49:0x01cc, B:17:0x0073, B:15:0x006f, B:12:0x0064, B:9:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0351: PHI (r4v4 java.lang.String) = 
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v3 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
     binds: [B:86:0x034f, B:78:0x030a, B:70:0x02c1, B:57:0x0219, B:49:0x01cc, B:17:0x0073, B:15:0x006f, B:12:0x0064, B:9:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0351: PHI (r10v4 char) = 
      (r10v2 char)
      (r10v2 char)
      (r10v3 char)
      (r10v2 char)
      (r10v2 char)
      (r10v2 char)
      (r10v2 char)
      (r10v2 char)
      (r10v2 char)
     binds: [B:86:0x034f, B:78:0x030a, B:70:0x02c1, B:57:0x0219, B:49:0x01cc, B:17:0x0073, B:15:0x006f, B:12:0x0064, B:9:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0351: PHI (r18v5 short[]) = 
      (r18v3 short[])
      (r18v3 short[])
      (r18v4 short[])
      (r18v3 short[])
      (r18v3 short[])
      (r18v3 short[])
      (r18v3 short[])
      (r18v3 short[])
      (r18v3 short[])
     binds: [B:86:0x034f, B:78:0x030a, B:70:0x02c1, B:57:0x0219, B:49:0x01cc, B:17:0x0073, B:15:0x006f, B:12:0x0064, B:9:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m10030(AbstractActivityC17204 abstractActivityC17204, int i, int i2, String str, InterfaceC19479 interfaceC19479) {
        int iM3169;
        int i3;
        int i4;
        String strM10092 = null;
        int i5 = C2419.f7754;
        int i6 = C2287.f7432;
        int iM31610 = (C0773.m3169("ܿܳ") ^ i6) * (-63);
        int i7 = ((iM31610 ^ i5) * (-31597)) ^ (-660942900);
        IWXAPI iwxapiCreateWXAPI = null;
        short[] sArr = null;
        int i8 = iM31610 ^ (-2099324166);
        char c = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1253342891;
        String str2 = null;
        String strM5471 = null;
        String strM2752 = null;
        long j = 0;
        while (true) {
            i12 = i8 ^ (i7 & (((i12 ^ i5) * 1365) >> 31));
            switch (i12) {
                case -1949566365:
                case -534489259:
                    i11 = 14339;
                    iM3169 = (i6 - C0773.m3169("ܳ۟")) * 73;
                    i3 = ((iM3169 ^ i5) * (-27579)) ^ 71708391;
                    i4 = -464240287;
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    break;
                case -1803698337:
                case 1583731996:
                    throw new RuntimeException();
                case -1762023185:
                case -774153096:
                    Application applicationM10096 = C3099.m10096();
                    str2 = f9996;
                    iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(applicationM10096, str2, true);
                    if (iwxapiCreateWXAPI.isWXAppInstalled()) {
                        iM3169 = C0773.m3169("᩺ܰ") ^ i5;
                        i3 = ((iM3169 ^ i6) * (-6461)) ^ 1372370976;
                        i4 = 1430814151;
                    } else {
                        iM3169 = C0773.m3169("ۜ۫") ^ i6;
                        i3 = ((iM3169 ^ i5) * (-20577)) ^ (-1701868619);
                        i4 = -503372570;
                    }
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    break;
                case -1651325594:
                case 1920533792:
                    j = f9997;
                    f9994 = null;
                    if (C3690.f12684 <= 0) {
                        iM3169 = (C0773.m3169("۟ۡ") + i6) * (-89);
                        i3 = ((iM3169 ^ i5) * 1513) ^ (-705697469);
                        i4 = -1909740942;
                    } else {
                        iM3169 = (i6 - C0619.m2761("᩵֡")) * (-39);
                        i3 = ((iM3169 ^ i5) * (-16347)) ^ 1618663316;
                        i4 = -1451911623;
                    }
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    break;
                case -1599678955:
                case -152331121:
                    if (i9 - (2387025 + i10) <= 0) {
                        iM3169 = (C0619.m2761("ۘۛ") + i6) * 71;
                        i3 = ((iM3169 ^ i5) * (-6123)) ^ 909097984;
                        i4 = 1726858497;
                    } else {
                        iM3169 = (C0773.m3169("۠ܺ") ^ i5) * (-15);
                        i3 = ((iM3169 ^ i6) * 13281) ^ (-1085290504);
                        i4 = 1194386163;
                    }
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    break;
                case -1177185774:
                case 87685223:
                    interfaceC19479.mo4064();
                    C2834.m9339(new C17246(abstractActivityC17204, strM2752, j, i2, str));
                    return;
                case -1130514222:
                case -1104705412:
                    strM10092 = C3099.m10092(f9995, 65, 3, i11);
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0619.m2761("ۘܰ") ^ i5;
                        i3 = ((iM3169 ^ i6) * (-1863)) ^ (-1133078565);
                        i4 = 1403349823;
                    } else {
                        iM3169 = (i6 - C0619.m2761("ܽۖ")) * (-55);
                        i3 = ((iM3169 ^ i5) * (-5261)) ^ (-1008503722);
                        i4 = 1284628903;
                    }
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    break;
                case -948855676:
                case -583235653:
                    if (iwxapiCreateWXAPI.getWXAppSupportAPI() < 570425345) {
                        iM3169 = C0773.m3169("ۜ۫") ^ i6;
                        i3 = ((iM3169 ^ i5) * (-20577)) ^ (-1701868619);
                        i4 = -503372570;
                    } else {
                        iM3169 = C0619.m2761("ۖ᩵") ^ i6;
                        i3 = ((iM3169 ^ i5) * (-23299)) ^ (-1567211574);
                        i4 = -1558667704;
                    }
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    break;
                case -897486238:
                case 1177920035:
                    i11 = 48412;
                    iM3169 = (i6 - C0773.m3169("ܳ۟")) * 73;
                    i3 = ((iM3169 ^ i5) * (-27579)) ^ 71708391;
                    i4 = -464240287;
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    break;
                case -889111865:
                case 2096040051:
                    if (i == (C0773.m3169(strM5471) ^ 2117959844)) {
                        iM3169 = (C0773.m3169("ۛᩳ") + i6) * 99;
                        i3 = ((iM3169 ^ i5) * 17631) ^ (-519650686);
                        i4 = 816518513;
                    } else {
                        iM3169 = C0619.m2761("ܺۜ") ^ i5;
                        i3 = ((iM3169 ^ i6) * (-3781)) ^ 1104427765;
                        i4 = 911257364;
                    }
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    break;
                case -815076605:
                case -711906164:
                    strM5471 = C1542.m5471(f9995, 62, 3, i11);
                    if (C1826.m6301() >= 0) {
                        iM3169 = (i6 - C0773.m3169("ۡ᩷")) * 15;
                        i3 = ((iM3169 ^ i5) * 27505) ^ 219556235;
                        i4 = 1817425670;
                    } else {
                        iM3169 = (i5 - C0619.m2761("ܳۧ")) * 63;
                        i3 = ((iM3169 ^ i6) * (-18525)) ^ 749029469;
                        i4 = 1581332685;
                    }
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    break;
                case -606965267:
                case 1849543797:
                    AbstractC0641.m2813();
                    if (C2878.f9462) {
                        iM3169 = (i6 - C0773.m3169("ۡ᩷")) * 15;
                        i3 = ((iM3169 ^ i5) * 27505) ^ 219556235;
                        i4 = 1817425670;
                    } else {
                        iM3169 = C0773.m3169("ۨۗ") ^ i6;
                        i3 = ((iM3169 ^ i5) * (-21099)) ^ (-950446954);
                        i4 = -53591280;
                    }
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    break;
                case -590875234:
                case -119023513:
                    if (C0487.f2131 <= 0) {
                        iM3169 = (i6 - C0773.m3169("ۡ᩷")) * 15;
                        i3 = ((iM3169 ^ i5) * 27505) ^ 219556235;
                        i4 = 1817425670;
                    } else {
                        iM3169 = (i5 - C0773.m3169("ܿܶ")) * 95;
                        i3 = ((iM3169 ^ i6) * 25659) ^ 567617200;
                        i4 = 1111340544;
                    }
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    break;
                case -433619091:
                case 1120169425:
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0773.m3169("ۨۗ") ^ i6;
                        i3 = ((iM3169 ^ i5) * (-21099)) ^ (-950446954);
                        i4 = -53591280;
                    } else {
                        iM3169 = C0773.m3169("ۚ᩺") ^ i6;
                        i3 = ((iM3169 ^ i5) * (-11175)) ^ 1377594833;
                        i4 = -873554825;
                    }
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    break;
                case -318275109:
                case -246406601:
                    RunnableC3646.m11813();
                    C2966.m9664();
                    return;
                case -270311053:
                case 1715119282:
                    sArr = f9995;
                    c = a.h;
                    if (C1542.m5459() >= 0) {
                        iM3169 = (i6 - C0773.m3169("ۡ᩷")) * 15;
                        i3 = ((iM3169 ^ i5) * 27505) ^ 219556235;
                        i4 = 1817425670;
                    } else {
                        iM3169 = C0619.m2761("ܿ᩷") ^ i6;
                        i3 = ((iM3169 ^ i5) * 27009) ^ 294176445;
                        i4 = -1450956167;
                    }
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    break;
                case -111790273:
                case 2022148707:
                    if (C4238.f15451 >= 0) {
                        iM3169 = (i6 - C0773.m3169("ۡ᩷")) * 15;
                        i3 = ((iM3169 ^ i5) * 27505) ^ 219556235;
                        i4 = 1817425670;
                    } else {
                        iM3169 = C0619.m2761("ۘܰ") ^ i5;
                        i3 = ((iM3169 ^ i6) * (-1863)) ^ (-1133078565);
                        i4 = 1403349823;
                    }
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    break;
                case 104687544:
                case 588246558:
                    interfaceC19479.mo4064();
                    iwxapiCreateWXAPI.registerApp(str2);
                    C2834.m9339(new C23214(abstractActivityC17204, strM2752, j, i2, str, iwxapiCreateWXAPI));
                    return;
                case 731205043:
                case 751127976:
                    C3492.m11488();
                    C0487.m2356();
                    iM3169 = (i6 - C0773.m3169("ۡ᩷")) * 15;
                    i3 = ((iM3169 ^ i5) * 27505) ^ 219556235;
                    i4 = 1817425670;
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    break;
                case 772811964:
                case 2094596598:
                    RunnableC1848.m6360();
                    if (C4238.m13540() > 0) {
                        iM3169 = (i6 - C0773.m3169("ۡ᩷")) * 15;
                        i3 = ((iM3169 ^ i5) * 27505) ^ 219556235;
                        i4 = 1817425670;
                    } else {
                        iM3169 = C0773.m3169("ۢۤ") ^ i5;
                        i3 = ((iM3169 ^ i6) * (-18551)) ^ (-247170734);
                        i4 = -1531817888;
                    }
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    break;
                case 932141303:
                case 1159416655:
                    if (i == (C0619.m2761(strM10092) ^ 2102815566)) {
                        iM3169 = (C0619.m2761("֫ۨ") + i5) * 47;
                        i3 = ((iM3169 ^ i6) * (-1929)) ^ (-20217481);
                        i4 = -1729648698;
                    } else {
                        iM3169 = C0619.m2761("ܿ᩶") ^ i5;
                        i3 = ((iM3169 ^ i6) * (-20783)) ^ 674668183;
                        i4 = 470451650;
                    }
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    break;
                case 1274670238:
                case 1388652068:
                    if (C1146.f4234 >= 0) {
                        iM3169 = (i6 - C0773.m3169("ۡ᩷")) * 15;
                        i3 = ((iM3169 ^ i5) * 27505) ^ 219556235;
                        i4 = 1817425670;
                    } else {
                        iM3169 = C0773.m3169("ܿ᩹") ^ i5;
                        i3 = ((iM3169 ^ i6) * 17193) ^ (-1611146774);
                        i4 = -297169052;
                    }
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    break;
                case 1364057505:
                case 1642619232:
                    C3734.m12142(RunnableC1848.m6366(f9995, 68, 13, i11));
                    return;
                case 1531382687:
                case 1715385844:
                    if (C3690.f12684 <= 0) {
                        iM3169 = C0773.m3169("ۢۤ") ^ i5;
                        i3 = ((iM3169 ^ i6) * (-18551)) ^ (-247170734);
                        i4 = -1531817888;
                    } else {
                        iM3169 = C0773.m3169("ۙۤ") ^ i6;
                        i3 = ((iM3169 ^ i5) * 817) ^ 903780841;
                        i4 = 1878271057;
                    }
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    break;
                case 1647195716:
                case 1724412296:
                    strM2752 = C0619.m2752();
                    f9997++;
                    if (C3033.f9831 >= 0) {
                        iM3169 = (i6 - C0773.m3169("ۡ᩷")) * 15;
                        i3 = ((iM3169 ^ i5) * 27505) ^ 219556235;
                        i4 = 1817425670;
                    } else {
                        iM3169 = (C0773.m3169("᩸۠") ^ i5) * 127;
                        i3 = ((iM3169 ^ i6) * 27419) ^ 1890899755;
                        i4 = -1066306754;
                    }
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    break;
                default:
                    short s = sArr[c];
                    i9 = s * 3090;
                    i10 = s * s;
                    if (C1519.m5403()) {
                        iM3169 = C0773.m3169("ۤۚ") ^ i5;
                        i3 = ((iM3169 ^ i6) * (-16289)) ^ (-1398866575);
                        i4 = 684837865;
                    } else {
                        iM3169 = (C0773.m3169("۟ۡ") + i6) * (-89);
                        i3 = ((iM3169 ^ i5) * 1513) ^ (-705697469);
                        i4 = -1909740942;
                    }
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0146 A[PHI: r10
      0x0146: PHI (r10v4 int) = (r10v2 int), (r10v5 int) binds: [B:44:0x0185, B:36:0x0144] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0187  */
    /* JADX WARN: Code duplicated, block: B:48:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:51:0x01b0 A[PHI: r5 r6
      0x01b0: PHI (r5v3 short) = (r5v2 short), (r5v2 short), (r5v4 short) binds: [B:50:0x01ae, B:47:0x01a4, B:23:0x00f4] A[DONT_GENERATE, DONT_INLINE]
      0x01b0: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:50:0x01ae, B:47:0x01a4, B:23:0x00f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x020a A[PHI: r3 r4 r7 r8 r9 r13 r14
      0x020a: PHI (r3v4 short[]) = (r3v3 short[]), (r3v2 short[]), (r3v2 short[]), (r3v2 short[]) binds: [B:58:0x0208, B:54:0x01e9, B:40:0x0167, B:16:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r4v4 char) = (r4v3 char), (r4v2 char), (r4v2 char), (r4v2 char) binds: [B:58:0x0208, B:54:0x01e9, B:40:0x0167, B:16:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v2 int), (r7v4 int) binds: [B:58:0x0208, B:54:0x01e9, B:40:0x0167, B:16:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:58:0x0208, B:54:0x01e9, B:40:0x0167, B:16:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:58:0x0208, B:54:0x01e9, B:40:0x0167, B:16:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:58:0x0208, B:54:0x01e9, B:40:0x0167, B:16:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:58:0x0208, B:54:0x01e9, B:40:0x0167, B:16:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        String str;
        int iM2761;
        int i;
        int i2;
        String strM49092;
        String strM8069;
        int i3;
        int iM3169;
        int i4;
        int i5 = C4282.f15546;
        int i6 = C1783.f6087;
        int iM2762 = C0619.m2761("ۤ᩷") ^ i6;
        int i7 = ((iM2762 ^ i5) * 10723) ^ 277159030;
        C17930 c17930 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM2762 ^ (-135798691);
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = -1051974582;
        String str2 = null;
        String str3 = null;
        while (true) {
            i16 = i8 ^ (i7 & (((i16 ^ i5) * (-2989)) >> 31));
            switch (i16) {
                case -1591711679:
                case 498264905:
                    str = str2;
                    c17930 = new C17930();
                    if (C1343.f4799 != 0) {
                        iM2761 = (C0773.m3169("᩻ۡ") ^ i5) * (-43);
                        i = ((iM2761 ^ i6) * 15203) ^ (-404260878);
                        str2 = str;
                        i2 = 720640906;
                    } else {
                        iM2761 = (C0619.m2761("۠ۜ") + i5) * 71;
                        i = ((iM2761 ^ i6) * 24201) ^ (-775518066);
                        str2 = str;
                        i2 = 2087161229;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -1322963645:
                case 1571801684:
                    String str4 = str2;
                    if (C3492.m11490(str4, C4238.m13530(sArr2, i14, i15, i13))) {
                        iM2761 = C0619.m2761("ۚܰ") ^ i6;
                        i = ((iM2761 ^ i5) * 4347) ^ (-1355156761);
                        str2 = str4;
                        i2 = 307711340;
                    } else {
                        iM2761 = C0619.m2761("᩺ۗ") ^ i6;
                        i = ((iM2761 ^ i5) * 6561) ^ 1860243520;
                        str2 = str4;
                        i2 = 1283655427;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -1316486868:
                case 878048152:
                    strM49092 = C21576.m49092();
                    sArr2 = f9995;
                    if (C13473.f42873 != 0) {
                        iM2761 = (i6 - C0619.m2761("ܰܽ")) * (-81);
                        String str5 = strM49092;
                        i = ((iM2761 ^ i5) * (-9483)) ^ (-1305995438);
                        str2 = str5;
                        i2 = 1247008286;
                    } else {
                        iM2761 = (C0619.m2761("ۛ۫") + i5) * 33;
                        i = ((iM2761 ^ i6) * 31195) ^ 158824581;
                        str2 = strM49092;
                        i2 = 1613473257;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -1110214216:
                case -401239266:
                    sArr = f9995;
                    c = 0;
                    if (RunnableC3646.f12471) {
                        iM2761 = (C0619.m2761("ۛᩳ") + i6) * 81;
                        i = ((iM2761 ^ i5) * (-29369)) ^ 94275727;
                        i2 = -1448847413;
                    } else {
                        iM2761 = (C0773.m3169("ۙۢ") + i6) * 49;
                        i = ((iM2761 ^ i5) * (-11175)) ^ (-1266009436);
                        i2 = 904936614;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -1000941791:
                case -617096960:
                    i10 = s * s;
                    i11 = 103083409;
                    if (C0862.m3503()) {
                        iM2761 = (C0773.m3169("֨ۨ") + i5) * (-71);
                        i = ((iM2761 ^ i6) * 12267) ^ 1543172134;
                        i2 = 810159829;
                    } else {
                        iM2761 = (C0619.m2761("ۛᩳ") + i6) * 81;
                        i = ((iM2761 ^ i5) * (-29369)) ^ 94275727;
                        i2 = -1448847413;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -901012533:
                case 470572919:
                    s2 = 10153;
                    if (C1564.f5401 <= 0) {
                        iM2761 = (i5 - C0773.m3169("᩶ۖ")) * (-85);
                        i = ((iM2761 ^ i6) * (-31565)) ^ 369187577;
                        i2 = -1386241049;
                    } else {
                        iM2761 = (C0619.m2761("ᩳܰ") + i6) * 93;
                        i = ((iM2761 ^ i5) * 11043) ^ (-332045427);
                        i2 = -685518781;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -807365287:
                case -502936463:
                    C2287.m7745();
                    if (C2485.f7950 != 0) {
                        str = str2;
                        iM2761 = (C0773.m3169("᩻ۡ") ^ i5) * (-43);
                        i = ((iM2761 ^ i6) * 15203) ^ (-404260878);
                        str2 = str;
                        i2 = 720640906;
                    } else {
                        iM2761 = (i5 - C0773.m3169("᩶ۖ")) * (-85);
                        i = ((iM2761 ^ i6) * (-31565)) ^ 369187577;
                        i2 = -1386241049;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -750422907:
                case -286818249:
                    C0950.m3785();
                    if (C3077.f9998) {
                        strM49092 = str2;
                        iM2761 = (i6 - C0619.m2761("ܰܽ")) * (-81);
                        String str6 = strM49092;
                        i = ((iM2761 ^ i5) * (-9483)) ^ (-1305995438);
                        str2 = str6;
                        i2 = 1247008286;
                    } else {
                        iM2761 = (i6 - C0773.m3169("۫ۛ")) * (-73);
                        i = ((iM2761 ^ i5) * 24211) ^ (-296040841);
                        i2 = 681896388;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -652456244:
                case 1555928008:
                    i14 = 1;
                    i15 = 11;
                    if (C3448.f11240 >= 0) {
                        iM2761 = (C0619.m2761("ۛᩳ") + i6) * 81;
                        i = ((iM2761 ^ i5) * (-29369)) ^ 94275727;
                        i2 = -1448847413;
                    } else {
                        iM2761 = C0773.m3169("ۖ᩸") ^ i5;
                        i = ((iM2761 ^ i6) * 19761) ^ 1249540774;
                        i2 = 2030869283;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -433488968:
                case 1071922391:
                    i12 = i10 + i11;
                    if (C3077.f9998) {
                        iM2761 = (C0619.m2761("ܺۖ") + i6) * 109;
                        i = ((iM2761 ^ i5) * 25593) ^ 1491906706;
                        i2 = -2085219145;
                    } else {
                        strM49092 = str2;
                        iM2761 = (i6 - C0619.m2761("ܰܽ")) * (-81);
                        String str7 = strM49092;
                        i = ((iM2761 ^ i5) * (-9483)) ^ (-1305995438);
                        str2 = str7;
                        i2 = 1247008286;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -409789516:
                case -1569426:
                    C3690.m11987();
                    throw new RuntimeException();
                case -299062147:
                case 1438682170:
                    f9993 = c17930;
                    if (C0862.m3503()) {
                        iM2761 = (i6 - C0619.m2761("ۤ᩸")) * 115;
                        i = ((iM2761 ^ i5) * 23639) ^ (-516563903);
                        i2 = 1632252702;
                    } else {
                        str = str2;
                        iM2761 = (C0773.m3169("᩻ۡ") ^ i5) * (-43);
                        i = ((iM2761 ^ i6) * 15203) ^ (-404260878);
                        str2 = str;
                        i2 = 720640906;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -201479419:
                case 638787644:
                    C3690.m11987();
                    iM2761 = (i6 - C0773.m3169("۫ۛ")) * (-73);
                    i = ((iM2761 ^ i5) * 24211) ^ (-296040841);
                    i2 = 681896388;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case -88599227:
                case 1599866601:
                    f9996 = str3;
                    return;
                case 29492809:
                case 181970695:
                    s = sArr[c];
                    if (C1783.f6087 <= 0) {
                        iM2761 = (i5 - C0773.m3169("᩶ۖ")) * (-85);
                        i = ((iM2761 ^ i6) * (-31565)) ^ 369187577;
                        i2 = -1386241049;
                    } else {
                        iM2761 = C0619.m2761("ܽܶ") ^ i5;
                        i = ((iM2761 ^ i6) * 11123) ^ (-981644430);
                        i2 = 950994939;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case 112481640:
                case 2123362070:
                    strM8069 = C2375.m8069(f9995, 12, 18, i13);
                    iM3169 = C0773.m3169("ۚᩴ") ^ i5;
                    i2 = 2080331558;
                    i4 = ((iM3169 ^ i6) * (-2941)) ^ 626723463;
                    str3 = strM8069;
                    iM2761 = iM3169;
                    i = i4;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case 277470015:
                case 555034532:
                    int i17 = s + s2;
                    i9 = i17 * i17;
                    if (C3099.f10023 <= 0) {
                        iM2761 = (C0619.m2761("ۛᩳ") + i6) * 81;
                        i = ((iM2761 ^ i5) * (-29369)) ^ 94275727;
                        i2 = -1448847413;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ۧܳ")) * 97;
                        i = ((iM2761 ^ i6) * 1999) ^ 1411771728;
                        i2 = 635522664;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case 453344733:
                case 750416840:
                    if (i9 - (i12 + i12) > 0) {
                        iM2761 = (i6 - C0619.m2761("֡ۨ")) * 63;
                        i = ((iM2761 ^ i5) * 19727) ^ 1512599970;
                        i2 = 857680682;
                    } else {
                        iM2761 = (i5 - C0773.m3169("᩹ܺ")) * (-77);
                        i = ((iM2761 ^ i6) * 13509) ^ 1144693963;
                        i2 = 2067292640;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case 642463770:
                case 2079034432:
                    if (C4238.f15451 < 0) {
                        iM2761 = (i6 - C0773.m3169("۫ۛ")) * (-73);
                        i = ((iM2761 ^ i5) * 24211) ^ (-296040841);
                        i2 = 681896388;
                    } else {
                        str = str2;
                        iM2761 = (C0773.m3169("᩻ۡ") ^ i5) * (-43);
                        i = ((iM2761 ^ i6) * 15203) ^ (-404260878);
                        str2 = str;
                        i2 = 720640906;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case 665007013:
                case 1906721819:
                    i3 = 33272;
                    iM3169 = C0619.m2761("۠᩵") ^ i6;
                    str2 = str2;
                    i2 = 1468427562;
                    i4 = ((iM3169 ^ i5) * 9075) ^ (-430214902);
                    i13 = i3;
                    iM2761 = iM3169;
                    i = i4;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                case 699108444:
                case 1482948364:
                    strM8069 = C0773.m3166(f9995, 30, 18, i13);
                    iM3169 = C0773.m3169("ۚᩴ") ^ i5;
                    i2 = 2080331558;
                    i4 = ((iM3169 ^ i6) * (-2941)) ^ 626723463;
                    str3 = strM8069;
                    iM2761 = iM3169;
                    i = i4;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
                default:
                    i3 = 30703;
                    iM3169 = C0619.m2761("۠᩵") ^ i6;
                    str2 = str2;
                    i2 = 1468427562;
                    i4 = ((iM3169 ^ i5) * 9075) ^ (-430214902);
                    i13 = i3;
                    iM2761 = iM3169;
                    i = i4;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    break;
            }
        }
    }
}
