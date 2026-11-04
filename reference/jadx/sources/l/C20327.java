package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.pqc.crypto.lms.LM_OTS;

/* JADX INFO: renamed from: l.᩵ۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1TD */
/* JADX INFO: loaded from: classes5.dex */
public final class C20327 {

    /* JADX INFO: renamed from: ۠ܳۙ, reason: not valid java name and contains not printable characters */
    private static final short[] f65222 = {5626, 9020, 9021, 9023, 9018, 9021, 9014, 8972, 9008, 9020, 9021, 9013, 9018, 9012, 8972, 8999, 9018, 9022, 9014, 9020, 9021, 9023, 9018, 9021, 9014, 8972, 9008, 9020, 9021, 9013, 9018, 9012, 8972, 9015, 9010, 8999, 9010, 4921, 7710, 7700, 7683, 7705, 7692, 7701, 7768, 7730, 7709, 7686, 7690, 7730, 7684, 7683, 7691, 7682, 7729, 7697, 7710, 7700, 7683, 7705, 7692, 7701, 7746, 7682, 7683, 7681, 7684, 7683, 7688, 7746, 7739, 7720, 7743, 7742, 7716, 7714, 7715, 9308, -32372, -32371, -32369, -32374, -32371, -32378, -32324, -32384, -32372, -32371, -32379, -32374, -32380, -32324, -32363, -32378, -32367, -32368, -32374, -32372, -32371, -32373, -32361, -32361, -32365, -32368, -32295, -32308, -32308, -32373, -32362, LM_OTS.D_MESG, -32307, -32370, -32361, -32307, -32384, -32384, -32308, -32382, -32365, -32374, -32308, -32384, -32372, -32371, -32379, -32374, -32380, -32292, -32363, -32290, -32303, -32299, -32302, -32302, -32301, -32304, -32299, -32298, -32372, -32371, -32369, -32374, -32371, -32378, -32324, -32384, -32372, -32371, -32379, -32374, -32380, -32324, -32377, -32382, -32361, -32382, -32372, -32371, -32369, -32374, -32371, -32378, -32324, -32384, -32372, -32371, -32379, -32374, -32380, -32324, -32363, -32378, -32367, -32368, -32374, -32372, -32371, -32372, -32371, -32369, -32374, -32371, -32378, -32324, -32384, -32372, -32371, -32379, -32374, -32380, -32324, -32361, -32374, -32370, -32378, 8552, 13159, 13153, 13158, 13174};

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C20327 f65223;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static long f65224;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f65225 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int f65226;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Map f65227;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static synchronized void m46702() {
        short s = f65222[77];
        int i = s + 14375;
        int i2 = (s * 57500) - (i * i) <= 0 ? 33251 : 28377;
        synchronized (C20327.class) {
            if (C21576.m49085() && C0950.m3789() - f65224 >= 10000) {
                if (ApplicationC17729.f58258.getInt(C1080.m4056(f65222, 78, 21, i2), 0) != 26110365 || Math.abs(((int) (C3448.m11251() / 1000)) - f65226) > 3600) {
                    f65224 = C0950.m3789();
                    try {
                        byte[] bArrM41699 = C17851.m41699(C1146.m4222(f65222, 99, 39, i2));
                        for (int i3 = 0; i3 < bArrM41699.length; i3++) {
                            bArrM41699[i3] = (byte) (bArrM41699[i3] ^ (i3 * 3));
                        }
                        String str = new String(bArrM41699, StandardCharsets.UTF_8);
                        C20327 c20327 = new C20327(C17851.m41700(str));
                        f65223 = c20327;
                        f65226 = (int) (C3448.m11251() / 1000);
                        C11235.m28308(C2966.m9665(C2419.m8173(ApplicationC17729.f58258), C2834.m9343(f65222, 138, 18, i2), str).mo3486(26110365, RunnableC1848.m6366(f65222, 156, 21, i2)).mo3486(f65226, C2375.m8069(f65222, 177, 18, i2)));
                        m46700(c20327);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x02d5 A[PHI: r2 r3 r6 r7 r16 r17
      0x02d5: PHI (r2v4 short[]) = (r2v2 short[]), (r2v2 short[]), (r2v3 short[]), (r2v2 short[]), (r2v2 short[]), (r2v2 short[]) binds: [B:71:0x02d3, B:67:0x02b2, B:63:0x0293, B:59:0x026d, B:51:0x0211, B:47:0x01ea] A[DONT_GENERATE, DONT_INLINE]
      0x02d5: PHI (r3v4 char) = (r3v2 char), (r3v2 char), (r3v2 char), (r3v3 char), (r3v2 char), (r3v2 char) binds: [B:71:0x02d3, B:67:0x02b2, B:63:0x0293, B:59:0x026d, B:51:0x0211, B:47:0x01ea] A[DONT_GENERATE, DONT_INLINE]
      0x02d5: PHI (r6v4 int) = (r6v2 int), (r6v2 int), (r6v2 int), (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:71:0x02d3, B:67:0x02b2, B:63:0x0293, B:59:0x026d, B:51:0x0211, B:47:0x01ea] A[DONT_GENERATE, DONT_INLINE]
      0x02d5: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v4 int) binds: [B:71:0x02d3, B:67:0x02b2, B:63:0x0293, B:59:0x026d, B:51:0x0211, B:47:0x01ea] A[DONT_GENERATE, DONT_INLINE]
      0x02d5: PHI (r16v16 int) = (r16v10 int), (r16v11 int), (r16v12 int), (r16v13 int), (r16v15 int), (r16v17 int) binds: [B:71:0x02d3, B:67:0x02b2, B:63:0x0293, B:59:0x026d, B:51:0x0211, B:47:0x01ea] A[DONT_GENERATE, DONT_INLINE]
      0x02d5: PHI (r17v18 java.lang.String) = 
      (r17v12 java.lang.String)
      (r17v13 java.lang.String)
      (r17v14 java.lang.String)
      (r17v15 java.lang.String)
      (r17v17 java.lang.String)
      (r17v19 java.lang.String)
     binds: [B:71:0x02d3, B:67:0x02b2, B:63:0x0293, B:59:0x026d, B:51:0x0211, B:47:0x01ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008c, code lost:
    
        if (l.C1146.m4231() == false) goto L17;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m46704(java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20327.m46704(java.lang.String):boolean");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46699() {
        long j = 0;
        int i = -289926905;
        int i2 = C2354.f7599;
        int i3 = C0487.f2131;
        int iM3169 = (C0773.m3169("᩹ܰ") + i2) * 43;
        int i4 = ((iM3169 ^ i3) * 22517) ^ (-891159293);
        int i5 = -768362762;
        while (true) {
            i = ((((i ^ i3) * (-4469)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2020374243:
                case -675487674:
                    if (C3492.f12043 > 0) {
                        iM3169 = C0773.m3169("۠ۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-1629)) ^ 971443304;
                        i5 = 2041881903;
                    } else {
                        iM3169 = C0619.m2761("ۢۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 17435) ^ (-303693129);
                        i5 = -1151641574;
                    }
                    break;
                case -1835065669:
                case -607843103:
                    f65226 = 0;
                    if (C1826.m6301() >= 0) {
                        iM3169 = (i3 - C0619.m2761("ۜܺ")) * (-15);
                        i4 = ((iM3169 ^ i2) * 1431) ^ 1861744110;
                        i5 = 2014757684;
                    } else {
                        iM3169 = (C0773.m3169("᩺᩺") ^ i3) * 29;
                        i4 = ((iM3169 ^ i2) * (-19179)) ^ 1938776397;
                        i5 = 1805650771;
                    }
                    break;
                case -1433142354:
                case -793432090:
                    f65224 = j;
                    if (C1542.m5459() >= 0) {
                        iM3169 = C0773.m3169("᩸ۗ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-24105)) ^ (-957790262);
                        i5 = 401652690;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ܰ֡")) * (-53);
                        i4 = ((iM3169 ^ i3) * 21383) ^ 1748613558;
                        i5 = 1046565356;
                    }
                    break;
                case -1427973444:
                case -1078328632:
                    j = 0;
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = C0773.m3169("۠ۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-1629)) ^ 971443304;
                        i5 = 2041881903;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܺ᩵")) * 41;
                        i4 = ((iM3169 ^ i2) * 31783) ^ (-2033086501);
                        i5 = 1785708171;
                    }
                    break;
                case -867501397:
                case 1750758254:
                    if (C2878.f9462) {
                        iM3169 = C0619.m2761("᩸᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-6199)) ^ 2129013203;
                        i5 = -628861227;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ۤ᩵")) * 101;
                        i4 = ((iM3169 ^ i3) * 20247) ^ 925302262;
                        i5 = 445341288;
                    }
                    break;
                case -839491789:
                case -133783482:
                    C3690.m11987();
                    if (!C2023.f6737) {
                        iM3169 = (i3 - C0619.m2761("ۜܺ")) * (-15);
                        i4 = ((iM3169 ^ i2) * 1431) ^ 1861744110;
                        i5 = 2014757684;
                    } else {
                        iM3169 = C0619.m2761("ۢۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 17435) ^ (-303693129);
                        i5 = -1151641574;
                    }
                    break;
                case -839264471:
                case -176327333:
                    if (C2966.m9664()) {
                        iM3169 = (C0619.m2761("۬᩻") ^ i3) * (-17);
                        i4 = ((iM3169 ^ i2) * 2917) ^ (-1956794784);
                        i5 = 968261756;
                    } else {
                        iM3169 = C0773.m3169("۠ۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-1629)) ^ 971443304;
                        i5 = 2041881903;
                    }
                    break;
                case -767673771:
                case 1858419150:
                    C3033.m9845();
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = C0619.m2761("᩸᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-6199)) ^ 2129013203;
                        i5 = -628861227;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۜܺ")) * (-15);
                        i4 = ((iM3169 ^ i2) * 1431) ^ 1861744110;
                        i5 = 2014757684;
                    }
                    break;
                case -662735698:
                case 821938342:
                    C1080.m4050();
                    C1146.m4231();
                    break;
                case -284274317:
                case 503564736:
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0619.m2761("ۢۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 17435) ^ (-303693129);
                        i5 = -1151641574;
                    } else {
                        iM3169 = C0619.m2761("᩸ܺ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-21679)) ^ (-1909436673);
                        i5 = 775260846;
                    }
                    break;
                case 573309305:
                case 575052436:
                    ExecutorService executorService = C5261.f18540;
                    if (C0269.f1558 > 0) {
                        C3734.m12156(executorService, new RunnableC3173());
                    }
                    iM3169 = C0773.m3169("᩸ۗ") ^ i2;
                    i4 = ((iM3169 ^ i3) * (-24105)) ^ (-957790262);
                    i5 = 401652690;
                    break;
                case 747778785:
                case 961017460:
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0773.m3169("۠ۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-1629)) ^ 971443304;
                        i5 = 2041881903;
                    } else {
                        iM3169 = (C0619.m2761("ۧۘ") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM3169 ^ i3) * (-7741)) ^ 198216405;
                        i5 = -1362057293;
                    }
                    break;
                case 925683868:
                case 1078545068:
                    if (C3077.f9998) {
                        iM3169 = (C0773.m3169("᩶۫") + i2) * 79;
                        i4 = ((iM3169 ^ i3) * (-9993)) ^ 1737752295;
                        i5 = 2078231952;
                    } else {
                        iM3169 = C0773.m3169("᩸ۗ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-24105)) ^ (-957790262);
                        i5 = 401652690;
                    }
                    break;
                case 1220831237:
                case 1605494152:
                    if (C1321.f4751 >= 0) {
                        iM3169 = C0773.m3169("᩸ۗ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-24105)) ^ (-957790262);
                        i5 = 401652690;
                    } else {
                        iM3169 = (C0619.m2761("ۡۢ") + i2) * (-127);
                        i4 = ((iM3169 ^ i3) * (-11903)) ^ 1291718621;
                        i5 = -183707763;
                    }
                    break;
                default:
                    C2354.m7983();
                    C2834.m9344();
                    iM3169 = (i3 - C0619.m2761("ۜܺ")) * (-15);
                    i4 = ((iM3169 ^ i2) * 1431) ^ 1861744110;
                    i5 = 2014757684;
                    break;
            }
            return;
        }
    }

    static {
        InterfaceC9801 interfaceC9801;
        int iM2761;
        int i;
        int i2;
        int i3;
        char c;
        int i4;
        int i5;
        short[] sArr;
        short s;
        short[] sArr2;
        int iM2762;
        int i6;
        InterfaceC9801 interfaceC9802;
        InterfaceC9801 interfaceC9803;
        InterfaceC9801 interfaceC9804 = null;
        String strM7758 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i7 = C2702.f8586;
        int i8 = C0773.f2792;
        int iM2763 = C0619.m2761("ۚ᩺") ^ i8;
        int i9 = ((iM2763 ^ i7) * (-13901)) ^ (-1584368234);
        int i10 = iM2763 ^ 460121012;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        char c2 = 0;
        int i15 = 0;
        int i16 = -1958309475;
        int i17 = 0;
        int i18 = 0;
        HashMap map = null;
        C20327 c20327 = null;
        short[] sArr5 = null;
        InterfaceC9801 interfaceC9805 = null;
        int i19 = 0;
        int i20 = 0;
        short s2 = 0;
        while (true) {
            i16 = i10 ^ (i9 & (((i16 ^ i7) * (-22615)) >> 31));
            switch (i16) {
                case -2144407881:
                case -588578438:
                    f65223 = new C20327(map);
                    return;
                case -2129861715:
                case -482574417:
                    interfaceC9801 = interfaceC9805;
                    interfaceC9803 = interfaceC9804;
                    i13 = 18;
                    if (C2419.f7754 < 0) {
                        iM2762 = C0773.m3169("᩷۟") ^ i8;
                        i9 = ((iM2762 ^ i7) * 8801) ^ (-1887353992);
                        interfaceC9804 = interfaceC9803;
                        interfaceC9805 = interfaceC9801;
                        i6 = 2091959064;
                        i10 = iM2762 ^ i6;
                    } else {
                        int iM3169 = C0773.m3169("ۖ֫") ^ i8;
                        i9 = 1350595496 ^ ((iM3169 ^ i7) * (-13279));
                        i10 = 1080698717 ^ iM3169;
                        interfaceC9804 = interfaceC9803;
                        interfaceC9805 = interfaceC9801;
                    }
                    break;
                case -2002465714:
                case 768990452:
                    interfaceC9801 = interfaceC9805;
                    C20327 c20328 = new C20327(C17851.m41700(strM7758));
                    if (AbstractC0641.f2496 < 0) {
                        int iM2764 = (i8 - C0619.m2761("۟᩸")) * 5;
                        c20327 = c20328;
                        iM2762 = iM2764;
                        i9 = ((iM2764 ^ i7) * (-12957)) ^ 1845713266;
                        interfaceC9804 = interfaceC9804;
                        interfaceC9805 = interfaceC9801;
                        i6 = -1278595205;
                        i10 = iM2762 ^ i6;
                    } else {
                        c20327 = c20328;
                        iM2761 = (C0619.m2761("᩻۠") + i8) * 83;
                        i = ((iM2761 ^ i7) * (-16565)) ^ 357504258;
                        i2 = -752354929;
                        sArr = sArr4;
                        s = s2;
                        sArr2 = sArr5;
                        c = c2;
                        i3 = i14;
                        i4 = i12;
                        i5 = i;
                        short[] sArr6 = sArr;
                        char c3 = c;
                        sArr5 = sArr2;
                        s2 = s;
                        sArr4 = sArr6;
                        i10 = iM2761 ^ i2;
                        i9 = i5;
                        i12 = i4;
                        i14 = i3;
                        c2 = c3;
                        interfaceC9805 = interfaceC9801;
                    }
                    break;
                case -1996407296:
                case 371092097:
                    interfaceC9801 = interfaceC9805;
                    interfaceC9804 = ApplicationC17729.f58258;
                    sArr4 = f65222;
                    i12 = 19;
                    if (C2287.f7432 < 0) {
                        iM2762 = C0619.m2761("᩵ۤ") ^ i7;
                        i9 = ((iM2762 ^ i8) * 20819) ^ 1373303404;
                        interfaceC9805 = interfaceC9801;
                        i6 = -1420713188;
                        i10 = iM2762 ^ i6;
                    } else {
                        iM2761 = C0773.m3169("ۚ۟") ^ i8;
                        i = ((iM2761 ^ i7) * (-4199)) ^ (-864523321);
                        i2 = 1837987175;
                        sArr = sArr4;
                        s = s2;
                        sArr2 = sArr5;
                        c = c2;
                        i3 = i14;
                        i4 = i12;
                        i5 = i;
                        short[] sArr7 = sArr;
                        char c4 = c;
                        sArr5 = sArr2;
                        s2 = s;
                        sArr4 = sArr7;
                        i10 = iM2761 ^ i2;
                        i9 = i5;
                        i12 = i4;
                        i14 = i3;
                        c2 = c4;
                        interfaceC9805 = interfaceC9801;
                    }
                    break;
                case -1930100826:
                case 1776146442:
                    i20 = 3627;
                    iM2762 = (C0773.m3169("᩻ۡ") ^ i7) * (-75);
                    i9 = ((iM2762 ^ i8) * (-20835)) ^ 1388568310;
                    interfaceC9805 = interfaceC9805;
                    i6 = 84396669;
                    i10 = iM2762 ^ i6;
                    break;
                case -1771815268:
                case 521393803:
                    C2878.m9491();
                    throw new RuntimeException();
                case -1560848464:
                case 1597019515:
                    interfaceC9801 = interfaceC9805;
                    s2 = sArr5[c2];
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0773.m3169("ۚ۟") ^ i8;
                        i = ((iM2761 ^ i7) * (-4199)) ^ (-864523321);
                        i2 = 1837987175;
                    } else {
                        iM2761 = (C0619.m2761("᩹᩵") ^ i8) * 127;
                        i = ((iM2761 ^ i7) * (-32719)) ^ (-2033146380);
                        i2 = -250450173;
                    }
                    sArr = sArr4;
                    s = s2;
                    sArr2 = sArr5;
                    c = c2;
                    i3 = i14;
                    i4 = i12;
                    i5 = i;
                    short[] sArr8 = sArr;
                    char c5 = c;
                    sArr5 = sArr2;
                    s2 = s;
                    sArr4 = sArr8;
                    i10 = iM2761 ^ i2;
                    i9 = i5;
                    i12 = i4;
                    i14 = i3;
                    c2 = c5;
                    interfaceC9805 = interfaceC9801;
                    break;
                case -1553024733:
                case 2061305563:
                    interfaceC9801 = interfaceC9805;
                    i18 = interfaceC9801.getInt(RunnableC0334.m2049(sArr3, i19, i11, i20), 0);
                    if (C1826.f6190 > 0) {
                        iM2762 = (i8 - C0773.m3169("۟ۘ")) * (-31);
                        i9 = ((iM2762 ^ i7) * 11777) ^ (-1465837075);
                        interfaceC9805 = interfaceC9801;
                        i6 = -1746191152;
                        i10 = iM2762 ^ i6;
                    } else {
                        iM2761 = (C0619.m2761("᩻۠") + i8) * 83;
                        i = ((iM2761 ^ i7) * (-16565)) ^ 357504258;
                        i2 = -752354929;
                        sArr = sArr4;
                        s = s2;
                        sArr2 = sArr5;
                        c = c2;
                        i3 = i14;
                        i4 = i12;
                        i5 = i;
                        short[] sArr9 = sArr;
                        char c6 = c;
                        sArr5 = sArr2;
                        s2 = s;
                        sArr4 = sArr9;
                        i10 = iM2761 ^ i2;
                        i9 = i5;
                        i12 = i4;
                        i14 = i3;
                        c2 = c6;
                        interfaceC9805 = interfaceC9801;
                    }
                    break;
                case -1462508727:
                case 854885985:
                    if (AbstractC0116.f1064 > 0) {
                        interfaceC9802 = interfaceC9805;
                        iM2762 = C0773.m3169("ۨ᩹") ^ i7;
                        i9 = ((iM2762 ^ i8) * 10203) ^ (-141539580);
                        interfaceC9805 = interfaceC9802;
                        i6 = -464999396;
                        i10 = iM2762 ^ i6;
                    } else {
                        interfaceC9801 = interfaceC9805;
                        iM2761 = C0773.m3169("ۚ۟") ^ i8;
                        i = ((iM2761 ^ i7) * (-4199)) ^ (-864523321);
                        i2 = 1837987175;
                        sArr = sArr4;
                        s = s2;
                        sArr2 = sArr5;
                        c = c2;
                        i3 = i14;
                        i4 = i12;
                        i5 = i;
                        short[] sArr10 = sArr;
                        char c7 = c;
                        sArr5 = sArr2;
                        s2 = s;
                        sArr4 = sArr10;
                        i10 = iM2761 ^ i2;
                        i9 = i5;
                        i12 = i4;
                        i14 = i3;
                        c2 = c7;
                        interfaceC9805 = interfaceC9801;
                    }
                    break;
                case -1406747855:
                case 1461353945:
                    AbstractC3624.m11755();
                    interfaceC9801 = interfaceC9805;
                    iM2761 = C0773.m3169("ۚ۟") ^ i8;
                    i = ((iM2761 ^ i7) * (-4199)) ^ (-864523321);
                    i2 = 1837987175;
                    sArr = sArr4;
                    s = s2;
                    sArr2 = sArr5;
                    c = c2;
                    i3 = i14;
                    i4 = i12;
                    i5 = i;
                    short[] sArr11 = sArr;
                    char c8 = c;
                    sArr5 = sArr2;
                    s2 = s;
                    sArr4 = sArr11;
                    i10 = iM2761 ^ i2;
                    i9 = i5;
                    i12 = i4;
                    i14 = i3;
                    c2 = c8;
                    interfaceC9805 = interfaceC9801;
                    break;
                case -1343886975:
                case 1898000395:
                    if (strM7758 != null) {
                        iM2762 = (i7 - C0619.m2761("۠ܺ")) * 77;
                        i9 = ((iM2762 ^ i8) * 5001) ^ (-995828399);
                        i6 = 1102946356;
                    } else {
                        iM2762 = C0619.m2761("ܶᩴ") ^ i7;
                        i9 = ((iM2762 ^ i8) * 5769) ^ 1874504206;
                        i6 = -935268107;
                    }
                    i10 = iM2762 ^ i6;
                    break;
                case -1210211333:
                case 720162248:
                    int i21 = s2 * 30916;
                    if (C3033.m9845() <= 0) {
                        i15 = i21;
                        interfaceC9801 = interfaceC9805;
                        interfaceC9803 = interfaceC9804;
                        int iM31610 = C0773.m3169("ۖ֫") ^ i8;
                        i9 = 1350595496 ^ ((iM31610 ^ i7) * (-13279));
                        i10 = 1080698717 ^ iM31610;
                        interfaceC9804 = interfaceC9803;
                    } else {
                        int iM31611 = C0773.m3169("ۗܶ") ^ i7;
                        i15 = i21;
                        i10 = iM31611 ^ 461136460;
                        i9 = ((iM31611 ^ i8) * 16609) ^ (-835023362);
                        interfaceC9801 = interfaceC9805;
                    }
                    interfaceC9805 = interfaceC9801;
                    break;
                case -1084135722:
                case -1026055617:
                    interfaceC9802 = ApplicationC17729.f58258;
                    sArr3 = f65222;
                    i19 = 1;
                    if (RunnableC3055.f9898 >= 0) {
                        iM2762 = C0773.m3169("ۨ᩹") ^ i7;
                        i9 = ((iM2762 ^ i8) * 10203) ^ (-141539580);
                        interfaceC9805 = interfaceC9802;
                        i6 = -464999396;
                    } else {
                        iM2762 = C0619.m2761("۠᩵") ^ i8;
                        i9 = ((iM2762 ^ i7) * (-14253)) ^ (-923223880);
                        interfaceC9805 = interfaceC9802;
                        i6 = 1429263888;
                    }
                    i10 = iM2762 ^ i6;
                    break;
                case -1041171304:
                case -681286815:
                    if ((i17 + i14) - i15 >= 0) {
                        iM2762 = (C0619.m2761("ۖ۫") ^ i7) * (-89);
                        i9 = ((iM2762 ^ i8) * (-27357)) ^ 903891289;
                        i6 = 351488006;
                    } else {
                        iM2762 = C0773.m3169("ᩳۤ") ^ i8;
                        i9 = ((iM2762 ^ i7) * (-913)) ^ 606398544;
                        i6 = 457218674;
                    }
                    i10 = iM2762 ^ i6;
                    break;
                case -983568775:
                case -59858334:
                    i20 = 9043;
                    iM2762 = (C0773.m3169("᩻ۡ") ^ i7) * (-75);
                    i9 = ((iM2762 ^ i8) * (-20835)) ^ 1388568310;
                    interfaceC9805 = interfaceC9805;
                    i6 = 84396669;
                    i10 = iM2762 ^ i6;
                    break;
                case -167977073:
                case 193279710:
                    C0487.m2356();
                    if (C1080.f3865 >= 0) {
                        interfaceC9801 = interfaceC9805;
                        interfaceC9803 = interfaceC9804;
                        int iM31612 = C0773.m3169("ۖ֫") ^ i8;
                        i9 = 1350595496 ^ ((iM31612 ^ i7) * (-13279));
                        i10 = 1080698717 ^ iM31612;
                        interfaceC9804 = interfaceC9803;
                        interfaceC9805 = interfaceC9801;
                    } else {
                        interfaceC9802 = interfaceC9805;
                        iM2762 = C0773.m3169("ۨ᩹") ^ i7;
                        i9 = ((iM2762 ^ i8) * 10203) ^ (-141539580);
                        interfaceC9805 = interfaceC9802;
                        i6 = -464999396;
                        i10 = iM2762 ^ i6;
                    }
                    break;
                case -112556507:
                case 560622421:
                    if (C2966.f9654 >= 0) {
                        iM2762 = (i7 - C0619.m2761("ۤۙ")) * (-93);
                        i9 = ((iM2762 ^ i8) * (-22785)) ^ (-593572555);
                        i6 = 1173960890;
                        i10 = iM2762 ^ i6;
                    } else {
                        interfaceC9801 = interfaceC9805;
                        iM2761 = C0773.m3169("ۚ۟") ^ i8;
                        i = ((iM2761 ^ i7) * (-4199)) ^ (-864523321);
                        i2 = 1837987175;
                        sArr = sArr4;
                        s = s2;
                        sArr2 = sArr5;
                        c = c2;
                        i3 = i14;
                        i4 = i12;
                        i5 = i;
                        short[] sArr12 = sArr;
                        char c9 = c;
                        sArr5 = sArr2;
                        s2 = s;
                        sArr4 = sArr12;
                        i10 = iM2761 ^ i2;
                        i9 = i5;
                        i12 = i4;
                        i14 = i3;
                        c2 = c9;
                        interfaceC9805 = interfaceC9801;
                    }
                    break;
                case 237863161:
                case 864641724:
                    strM7758 = C2288.m7758(interfaceC9804, C2310.m7803(sArr4, i12, i13, i20), null);
                    if (i18 > 0) {
                        int iM31613 = (i8 - C0773.m3169("ۘ۬")) * q.h;
                        map = null;
                        iM2762 = iM31613;
                        i9 = ((iM31613 ^ i7) * (-9259)) ^ (-233997173);
                        i6 = 1494227008;
                    } else {
                        map = null;
                        iM2762 = C0619.m2761("ܶᩴ") ^ i7;
                        i9 = ((iM2762 ^ i8) * 5769) ^ 1874504206;
                        i6 = -935268107;
                    }
                    i10 = iM2762 ^ i6;
                    break;
                case 665731372:
                case 1812889620:
                    i11 = 18;
                    if (C1519.f5300 >= 0) {
                        iM2762 = (i7 - C0619.m2761("ۤۙ")) * (-93);
                        i9 = ((iM2762 ^ i8) * (-22785)) ^ (-593572555);
                        i6 = 1173960890;
                    } else {
                        iM2762 = (i7 - C0619.m2761("ۧۗ")) * (-123);
                        i9 = ((iM2762 ^ i8) * 24145) ^ 222822717;
                        i6 = 1241368135;
                    }
                    i10 = iM2762 ^ i6;
                    break;
                case 1126087643:
                case 1393712847:
                    i17 = s2 * s2;
                    i14 = 238949764;
                    if (C1321.f4751 < 0) {
                        iM2762 = C0773.m3169("ܶܿ") ^ i8;
                        i9 = ((iM2762 ^ i7) * 20085) ^ 597436021;
                        i6 = -1284611336;
                        i10 = iM2762 ^ i6;
                    } else {
                        interfaceC9801 = interfaceC9805;
                        iM2761 = C0773.m3169("ۚ۟") ^ i8;
                        i = ((iM2761 ^ i7) * (-4199)) ^ (-864523321);
                        i2 = 1837987175;
                        sArr = sArr4;
                        s = s2;
                        sArr2 = sArr5;
                        c = c2;
                        i3 = i14;
                        i4 = i12;
                        i5 = i;
                        short[] sArr13 = sArr;
                        char c10 = c;
                        sArr5 = sArr2;
                        s2 = s;
                        sArr4 = sArr13;
                        i10 = iM2761 ^ i2;
                        i9 = i5;
                        i12 = i4;
                        i14 = i3;
                        c2 = c10;
                        interfaceC9805 = interfaceC9801;
                    }
                    break;
                case 1170606884:
                case 1777497597:
                    short[] sArr14 = f65222;
                    c2 = 0;
                    if (C1519.m5403()) {
                        iM2761 = C0619.m2761("᩹ᩳ") ^ i7;
                        i3 = i14;
                        c = 0;
                        i4 = i12;
                        i5 = ((iM2761 ^ i8) * (-26445)) ^ (-701259594);
                        interfaceC9801 = interfaceC9805;
                        i2 = 391986653;
                        sArr = sArr4;
                        s = s2;
                        sArr2 = sArr14;
                    } else {
                        sArr5 = sArr14;
                        interfaceC9801 = interfaceC9805;
                        iM2761 = (C0619.m2761("᩻۠") + i8) * 83;
                        i = ((iM2761 ^ i7) * (-16565)) ^ 357504258;
                        i2 = -752354929;
                        sArr = sArr4;
                        s = s2;
                        sArr2 = sArr5;
                        c = c2;
                        i3 = i14;
                        i4 = i12;
                        i5 = i;
                    }
                    short[] sArr15 = sArr;
                    char c11 = c;
                    sArr5 = sArr2;
                    s2 = s;
                    sArr4 = sArr15;
                    i10 = iM2761 ^ i2;
                    i9 = i5;
                    i12 = i4;
                    i14 = i3;
                    c2 = c11;
                    interfaceC9805 = interfaceC9801;
                    break;
                default:
                    f65223 = c20327;
                    f65226 = i18;
                    return;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C20327 m46701() {
        return f65223;
    }

    public C20327(HashMap map) {
        Map map2 = null;
        int i = -329479065;
        int i2 = RunnableC3055.f9898;
        int i3 = C3448.f11240;
        int iM3169 = (C0773.m3169("᩷ܰ") + i3) * 77;
        int i4 = ((iM3169 ^ i2) * (-1979)) ^ 598661183;
        int i5 = -915587900;
        while (true) {
            i = ((((i ^ i2) * (-14871)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2116980193:
                case 1149844044:
                    if (C3998.f13671 != 0) {
                        iM3169 = (C0773.m3169("ܽۛ") + i3) * 109;
                        i4 = ((iM3169 ^ i2) * 30933) ^ 1979234629;
                        i5 = 770801792;
                    } else {
                        iM3169 = (C0619.m2761("ۗܰ") ^ i3) * (-35);
                        i4 = ((iM3169 ^ i2) * 24945) ^ 1634438740;
                        i5 = 667290194;
                    }
                    break;
                case -1863893140:
                case -1755548739:
                    if (C2419.f7754 < 0) {
                        iM3169 = (C0619.m2761("᩵᩷") ^ i2) * 65;
                        i4 = ((iM3169 ^ i3) * (-18635)) ^ (-6143843);
                        i5 = 598271798;
                    } else {
                        iM3169 = C0619.m2761("᩻ۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 29601) ^ (-304818348);
                        i5 = -615903356;
                    }
                    break;
                case -1815331596:
                case 855673071:
                    AbstractC0116.m1243();
                    if (AbstractC0641.f2496 < 0) {
                        iM3169 = (C0773.m3169("ᩳ֨") + i2) * 55;
                        i4 = ((iM3169 ^ i3) * 6785) ^ 1740828875;
                        i5 = 391447975;
                    } else {
                        iM3169 = (C0619.m2761("᩵᩷") ^ i2) * 65;
                        i4 = ((iM3169 ^ i3) * (-18635)) ^ (-6143843);
                        i5 = 598271798;
                    }
                    break;
                case -1548480055:
                case 2119576756:
                    if (C3448.m11248() != 0) {
                        iM3169 = C0773.m3169("֨ۖ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-11109)) ^ (-1524012395);
                        i5 = 2063302342;
                    } else {
                        iM3169 = (C0773.m3169("᩻ܽ") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM3169 ^ i3) * (-8687)) ^ (-2050715601);
                        i5 = -417824156;
                    }
                    break;
                case -1253470646:
                case 1539279352:
                    if (!C2288.m7767()) {
                        iM3169 = (C0773.m3169("ܽۛ") + i3) * 109;
                        i4 = ((iM3169 ^ i2) * 30933) ^ 1979234629;
                        i5 = 770801792;
                    } else {
                        iM3169 = (C0619.m2761("᩵᩷") ^ i2) * 65;
                        i4 = ((iM3169 ^ i3) * (-18635)) ^ (-6143843);
                        i5 = 598271798;
                    }
                    break;
                case -902412140:
                case -218524927:
                    C2702.m8876();
                    throw new RuntimeException();
                case -897813076:
                case 1095177599:
                    map2 = Collections.EMPTY_MAP;
                    iM3169 = (C0773.m3169("ۜۚ") + i3) * (-59);
                    i4 = ((iM3169 ^ i2) * 6295) ^ (-1893959352);
                    i5 = -1912933853;
                    break;
                case -776222146:
                case -337456490:
                    if (C1542.m5459() >= 0) {
                        iM3169 = (C0773.m3169("ᩳ֨") + i2) * 55;
                        i4 = ((iM3169 ^ i3) * 6785) ^ 1740828875;
                        i5 = 391447975;
                    } else {
                        iM3169 = (i3 - C0619.m2761("֡ۜ")) * (-77);
                        i4 = ((iM3169 ^ i2) * 3229) ^ 820425369;
                        i5 = 1111387045;
                    }
                    break;
                case -710348019:
                case 1369892240:
                    AbstractC0116.m1243();
                    C2834.m9344();
                    iM3169 = (C0773.m3169("ܽۛ") + i3) * 109;
                    i4 = ((iM3169 ^ i2) * 30933) ^ 1979234629;
                    i5 = 770801792;
                    break;
                case -709946003:
                case -407955270:
                    if (C1146.f4234 >= 0) {
                        iM3169 = (C0619.m2761("᩵᩷") ^ i2) * 65;
                        i4 = ((iM3169 ^ i3) * (-18635)) ^ (-6143843);
                        i5 = 598271798;
                    } else {
                        iM3169 = (C0619.m2761("ۛᩴ") + i3) * (-55);
                        i4 = ((iM3169 ^ i2) * 591) ^ (-1343668260);
                        i5 = -6524655;
                    }
                    break;
                case -415299316:
                case -63492077:
                    return;
                case -395750970:
                case 1767405191:
                    if (RunnableC3646.f12471) {
                        iM3169 = C0773.m3169("֨ۖ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-11109)) ^ (-1524012395);
                        i5 = 2063302342;
                    } else {
                        iM3169 = C0773.m3169("ܰ۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * 7963) ^ (-2077998400);
                        i5 = 220404519;
                    }
                    break;
                case -137424884:
                case 1614194132:
                    if (C1343.f4799 != 0) {
                        iM3169 = (C0773.m3169("ܽۛ") + i3) * 109;
                        i4 = ((iM3169 ^ i2) * 30933) ^ 1979234629;
                        i5 = 770801792;
                    } else {
                        iM3169 = (i2 - C0773.m3169("۬ۢ")) * 23;
                        i4 = ((iM3169 ^ i3) * (-27481)) ^ 893843951;
                        i5 = -1990777507;
                    }
                    break;
                case -80470633:
                case 1176019087:
                    this.f65227 = map2;
                    if (C4282.m13644()) {
                        iM3169 = C0773.m3169("֫۫") ^ i2;
                        i4 = ((iM3169 ^ i3) * 21113) ^ (-25963972);
                        i5 = -1318296276;
                    } else {
                        iM3169 = (C0773.m3169("ܽۛ") + i3) * 109;
                        i4 = ((iM3169 ^ i2) * 30933) ^ 1979234629;
                        i5 = 770801792;
                    }
                    break;
                case 14385222:
                case 1534075912:
                    if (C17202.m40372()) {
                        iM3169 = C0619.m2761("ۡ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-25087)) ^ 51095602;
                        i5 = 1000854018;
                    } else {
                        iM3169 = (C0773.m3169("ܽۛ") + i3) * 109;
                        i4 = ((iM3169 ^ i2) * 30933) ^ 1979234629;
                        i5 = 770801792;
                    }
                    break;
                case 439410449:
                case 2128449938:
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0773.m3169("֨ۖ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-11109)) ^ (-1524012395);
                        i5 = 2063302342;
                    } else {
                        iM3169 = (C0773.m3169("᩶ۧ") ^ i2) * (-45);
                        i4 = ((iM3169 ^ i3) * (-32657)) ^ (-934739833);
                        i5 = -1560254837;
                    }
                    break;
                case 852222276:
                case 2070504100:
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0773.m3169("֨ۖ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-11109)) ^ (-1524012395);
                        i5 = 2063302342;
                    } else {
                        iM3169 = (C0773.m3169("۟ۛ") ^ i3) * 81;
                        i4 = ((iM3169 ^ i2) * (-7909)) ^ (-350809513);
                        i5 = -594695085;
                    }
                    break;
                default:
                    if (map == null) {
                        iM3169 = C0773.m3169("ۢ᩷") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-1047)) ^ (-125751012);
                        i5 = -1458682356;
                    } else {
                        map2 = map;
                        iM3169 = (C0773.m3169("ۜۚ") + i3) * (-59);
                        i4 = ((iM3169 ^ i2) * 6295) ^ (-1893959352);
                        i5 = -1912933853;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m46703(String str, String str2) {
        String str3 = null;
        int i = 1647887846;
        int i2 = AbstractC0116.f1064;
        int i3 = AbstractC0641.f2496;
        int iM3169 = C0773.m3169("ۨۢ") ^ i3;
        int i4 = ((iM3169 ^ i2) * (-13409)) ^ 1580106981;
        int i5 = -774206171;
        while (true) {
            i = ((((i ^ i2) * 30435) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2126858492:
                case 1527759917:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = C0619.m2761("֫֡") ^ i3;
                        i4 = ((iM3169 ^ i2) * 29623) ^ 1567153063;
                        i5 = -1906359550;
                    } else {
                        iM3169 = C0773.m3169("ۖۜ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 24943) ^ (-1981881646);
                        i5 = 1383789615;
                    }
                    break;
                case -1996970823:
                case -85146140:
                    if (C1783.m6232()) {
                        iM3169 = (C0619.m2761("ܿۚ") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM3169 ^ i2) * 583) ^ (-430412095);
                        i5 = 1325206312;
                    } else {
                        iM3169 = C0773.m3169("ᩴۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3565)) ^ (-179517587);
                        i5 = 310352865;
                    }
                    break;
                case -1918467454:
                case -156752732:
                    return str2;
                case -1874950176:
                case -438637995:
                    if (C3077.f9998) {
                        iM3169 = C0773.m3169("ܿ۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-10855)) ^ 1079789732;
                        i5 = 1104715524;
                    } else {
                        iM3169 = C0773.m3169("ᩴۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3565)) ^ (-179517587);
                        i5 = 310352865;
                    }
                    break;
                case -1821107694:
                case 222441994:
                    return str3;
                case -1801952294:
                case 1761931398:
                    if (C23916.m53419() != 0) {
                        iM3169 = (C0619.m2761("۟ۧ") + i3) * (-3);
                        i4 = ((iM3169 ^ i2) * (-31421)) ^ 1158121059;
                        i5 = 268851503;
                    } else {
                        iM3169 = C0773.m3169("ᩴۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 27691) ^ 1852804421;
                        i5 = 1492988784;
                    }
                    break;
                case -1715519157:
                case -1002375783:
                    C0269.m1775();
                    if (!C0619.f2439) {
                        iM3169 = C0773.m3169("ᩴۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3565)) ^ (-179517587);
                        i5 = 310352865;
                    } else {
                        iM3169 = (C0619.m2761("۟ۧ") + i3) * (-3);
                        i4 = ((iM3169 ^ i2) * (-31421)) ^ 1158121059;
                        i5 = 268851503;
                    }
                    break;
                case -1647182652:
                case -1276975914:
                    C3690.m11987();
                    if (!C3077.f9998) {
                        iM3169 = (C0619.m2761("۟ۧ") + i3) * (-3);
                        i4 = ((iM3169 ^ i2) * (-31421)) ^ 1158121059;
                        i5 = 268851503;
                    } else {
                        iM3169 = C0619.m2761("֫֡") ^ i3;
                        i4 = ((iM3169 ^ i2) * 29623) ^ 1567153063;
                        i5 = -1906359550;
                    }
                    break;
                case -1594853932:
                case 1333457757:
                    C0269.m1775();
                    return null;
                case -1471772599:
                case -810436802:
                    if (C1783.f6087 <= 0) {
                        iM3169 = (C0619.m2761("۟ۧ") + i3) * (-3);
                        i4 = ((iM3169 ^ i2) * (-31421)) ^ 1158121059;
                        i5 = 268851503;
                    } else {
                        iM3169 = (i2 - C0619.m2761("۬ۛ")) * (-91);
                        i4 = ((iM3169 ^ i3) * 6035) ^ 753993460;
                        i5 = 28450840;
                    }
                    break;
                case -1378684628:
                case -888279686:
                    if (RunnableC3646.m11813() != 0) {
                        iM3169 = C0773.m3169("ۡܺ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 11229) ^ 1395443817;
                        i5 = -1714430719;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ܳۨ")) * 67;
                        i4 = ((iM3169 ^ i3) * 26859) ^ (-1485609084);
                        i5 = 1479389366;
                    }
                    break;
                case -1027060723:
                case -768893834:
                    if (C0950.f3488 >= 0) {
                        iM3169 = C0619.m2761("ۢᩴ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-23237)) ^ (-766740442);
                        i5 = -1650371803;
                    } else {
                        iM3169 = (C0619.m2761("ۚ᩶") ^ i2) * 73;
                        i4 = ((iM3169 ^ i3) * (-17603)) ^ (-1848161873);
                        i5 = 1690288931;
                    }
                    break;
                case -951205505:
                case 1449448277:
                    if (C4238.f15451 >= 0) {
                        iM3169 = C0773.m3169("ᩴۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3565)) ^ (-179517587);
                        i5 = 310352865;
                    } else {
                        iM3169 = (C0773.m3169("᩹᩺") ^ i3) * (-29);
                        i4 = ((iM3169 ^ i2) * 9115) ^ (-1930894192);
                        i5 = -1978105561;
                    }
                    break;
                case -699293117:
                case 1230727079:
                    if (RunnableC3646.f12471) {
                        iM3169 = C0773.m3169("ᩴۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3565)) ^ (-179517587);
                        i5 = 310352865;
                    } else {
                        iM3169 = C0773.m3169("᩻ۗ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-5765)) ^ 1730741274;
                        i5 = -1870289446;
                    }
                    break;
                case -236032983:
                case 76178342:
                    C0269.m1775();
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0619.m2761("ۢᩴ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-23237)) ^ (-766740442);
                        i5 = -1650371803;
                    } else {
                        iM3169 = C0773.m3169("ᩴۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3565)) ^ (-179517587);
                        i5 = 310352865;
                    }
                    break;
                case 375545011:
                case 1199045182:
                    C3690.m11987();
                    C20932.m47848();
                    iM3169 = (C0619.m2761("۟ۧ") + i3) * (-3);
                    i4 = ((iM3169 ^ i2) * (-31421)) ^ 1158121059;
                    i5 = 268851503;
                    break;
                case 1210860867:
                case 1654080294:
                    if (C2288.m7767()) {
                        iM3169 = (C0619.m2761("۟ۧ") + i3) * (-3);
                        i4 = ((iM3169 ^ i2) * (-31421)) ^ 1158121059;
                        i5 = 268851503;
                    } else {
                        iM3169 = C0773.m3169("ۨۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-2991)) ^ (-736103342);
                        i5 = 451661547;
                    }
                    break;
                default:
                    str3 = (String) this.f65227.get(str);
                    if (str3 == null) {
                        iM3169 = C0773.m3169("ᩳۖ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 26611) ^ 1515434225;
                        i5 = 2088668053;
                    } else {
                        iM3169 = C0619.m2761("۠᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 6079) ^ 1295549041;
                        i5 = -1754658761;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x03a0 A[PHI: r0 r12 r13 r19 r20 r22
      0x03a0: PHI (r0v2 l.ۧۛ֫) = (r0v1 l.ۧۛ֫), (r0v1 l.ۧۛ֫), (r0v3 l.ۧۛ֫) binds: [B:19:0x0080, B:112:0x039e, B:99:0x02e5] A[DONT_GENERATE, DONT_INLINE]
      0x03a0: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:19:0x0080, B:112:0x039e, B:99:0x02e5] A[DONT_GENERATE, DONT_INLINE]
      0x03a0: PHI (r13v3 int) = (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:19:0x0080, B:112:0x039e, B:99:0x02e5] A[DONT_GENERATE, DONT_INLINE]
      0x03a0: PHI (r19v25 short[]) = (r19v11 short[]), (r19v20 short[]), (r19v26 short[]) binds: [B:19:0x0080, B:112:0x039e, B:99:0x02e5] A[DONT_GENERATE, DONT_INLINE]
      0x03a0: PHI (r20v23 char) = (r20v9 char), (r20v18 char), (r20v24 char) binds: [B:19:0x0080, B:112:0x039e, B:99:0x02e5] A[DONT_GENERATE, DONT_INLINE]
      0x03a0: PHI (r22v15 java.lang.String[]) = (r22v2 java.lang.String[]), (r22v10 java.lang.String[]), (r22v16 java.lang.String[]) binds: [B:19:0x0080, B:112:0x039e, B:99:0x02e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46700(C20327 c20327) {
        int iM3169;
        int i;
        int i2;
        int iM31610;
        int i3;
        int iM31611;
        int i4;
        int i5;
        int iM2761;
        int i6;
        int iM31612;
        int i7;
        int i8;
        String[] strArr;
        short[] sArr;
        int iM31613;
        int i9;
        int i10;
        int i11;
        RunnableC11413 runnableC11413 = null;
        String strM46703 = null;
        String[] strArrM5508 = null;
        int iM4845 = 0;
        C1161 c1161M49861 = null;
        boolean zM6303 = false;
        int iM5470 = 0;
        short[] sArr2 = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 174971997;
        int i17 = C3690.f12684;
        int i18 = C3099.f10023;
        int iM2762 = (C0619.m2761("ۙۧ") + i18) * (-31);
        int i19 = ((iM2762 ^ i17) * 65) ^ 489175785;
        int i20 = iM2762 ^ (-2112989466);
        int i21 = 0;
        while (true) {
            i16 = i20 ^ ((((i16 ^ i17) * 2407) >> 31) & i19);
            switch (i16) {
                case -2140884930:
                case 1913623022:
                    i15 = 6788;
                    iM31611 = C0773.m3169("ܽ۬") ^ i17;
                    i4 = ((iM31611 ^ i18) * (-9049)) ^ 367660216;
                    i5 = -980359441;
                    i8 = iM31611 ^ i5;
                    sArr2 = sArr2;
                    c = c;
                    i20 = i8;
                    i19 = i4;
                    strArrM5508 = strArrM5508;
                    break;
                case -2112536224:
                case -1114106047:
                    strArrM5508 = strArrM5508;
                    sArr2 = sArr2;
                    c = c;
                    if (C2310.f7472 >= 0) {
                        iM31611 = (C0619.m2761("᩻ܿ") + i18) * 85;
                        i4 = ((iM31611 ^ i17) * 2265) ^ 250113059;
                        i5 = 200515915;
                    } else {
                        iM31611 = (C0619.m2761("ۛܰ") + i18) * (-57);
                        i4 = ((iM31611 ^ i17) * (-19509)) ^ 1060525132;
                        i5 = 1250922963;
                    }
                    i8 = iM31611 ^ i5;
                    sArr2 = sArr2;
                    c = c;
                    i20 = i8;
                    i19 = i4;
                    strArrM5508 = strArrM5508;
                    break;
                case -2076846021:
                case 1840025292:
                    if (C13473.f42873 != 0) {
                        iM31610 = C0773.m3169("᩸᩸") ^ i17;
                        sArr2 = sArr2;
                        i19 = ((iM31610 ^ i18) * 15539) ^ (-2029276107);
                        i3 = -2043040646;
                        i11 = iM31610 ^ i3;
                        sArr2 = sArr2;
                        i20 = i11;
                    } else {
                        strArrM5508 = strArrM5508;
                        sArr2 = sArr2;
                        c = c;
                        iM31611 = C0619.m2761("ۙᩳ") ^ i18;
                        i4 = ((iM31611 ^ i17) * 5189) ^ (-1040372422);
                        i5 = -1881796339;
                        i8 = iM31611 ^ i5;
                        sArr2 = sArr2;
                        c = c;
                        i20 = i8;
                        i19 = i4;
                        strArrM5508 = strArrM5508;
                    }
                    break;
                case -2047017880:
                case 82761046:
                    strArrM5508 = strArrM5508;
                    sArr2 = sArr2;
                    c = c;
                    try {
                        strM46703 = c20327.m46703(C1080.m4056(f65222, 38, 16, i15), null);
                        iM31611 = C0773.m3169("᩻ۤ") ^ i18;
                        i4 = ((iM31611 ^ i17) * (-9223)) ^ 32206196;
                        i5 = 1495498617;
                        i8 = iM31611 ^ i5;
                        sArr2 = sArr2;
                        c = c;
                        i20 = i8;
                        i19 = i4;
                        strArrM5508 = strArrM5508;
                    } catch (Exception unused) {
                        strArrM5508 = strArrM5508;
                        int iM31614 = C0773.m3169("ۤ۠") ^ i17;
                        i9 = ((iM31614 ^ i18) * (-20653)) ^ 354878221;
                        sArr2 = sArr2;
                        i20 = iM31614 ^ (-590757550);
                        char c2 = c;
                        i19 = i9;
                        c = c2;
                    }
                    break;
                case -1924855100:
                case -1142950976:
                    strArrM5508 = strArrM5508;
                    sArr2 = sArr2;
                    c = c;
                    C2288.m7754(runnableC11413);
                    int i22 = C9341.f30354;
                    iM31611 = C0773.m3169("۫ᩴ") ^ i18;
                    i4 = ((iM31611 ^ i17) * 12113) ^ (-1799181951);
                    i5 = -575736313;
                    i8 = iM31611 ^ i5;
                    sArr2 = sArr2;
                    c = c;
                    i20 = i8;
                    i19 = i4;
                    strArrM5508 = strArrM5508;
                    break;
                case -1859085962:
                case -1618532352:
                    strArrM5508 = strArrM5508;
                    sArr2 = sArr2;
                    c = c;
                    s = sArr2[c];
                    s2 = 2322;
                    if (C3033.f9831 >= 0) {
                        iM31611 = C0773.m3169("֡֫") ^ i17;
                        i4 = ((iM31611 ^ i18) * 14757) ^ (-1705212597);
                        i5 = -148104088;
                    } else {
                        iM31611 = (C0619.m2761("ۙۙ") ^ i18) * (-107);
                        i4 = ((iM31611 ^ i17) * 28755) ^ 905982563;
                        i5 = 56205338;
                    }
                    i8 = iM31611 ^ i5;
                    sArr2 = sArr2;
                    c = c;
                    i20 = i8;
                    i19 = i4;
                    strArrM5508 = strArrM5508;
                    break;
                case -1720305947:
                case 389557763:
                    sArr2 = sArr2;
                    try {
                        c = c;
                        try {
                            C17202.m40368(C5261.f18540, new RunnableC25385(iM4845, 1, strArrM5508));
                            break;
                        } catch (Exception unused2) {
                        }
                    } catch (Exception unused3) {
                        c = c;
                    }
                    int iM31615 = C0773.m3169("ۤ۠") ^ i17;
                    i9 = ((iM31615 ^ i18) * (-20653)) ^ 354878221;
                    sArr2 = sArr2;
                    i20 = iM31615 ^ (-590757550);
                    char c3 = c;
                    i19 = i9;
                    c = c3;
                    break;
                case -1676606130:
                case -1022649528:
                    sArr2 = sArr2;
                    c = c;
                    if (iM5470 >= iM4845) {
                        int iM31616 = C0773.m3169("ۤ۠") ^ i17;
                        i9 = ((iM31616 ^ i18) * (-20653)) ^ 354878221;
                        sArr2 = sArr2;
                        i20 = iM31616 ^ (-590757550);
                        char c4 = c;
                        i19 = i9;
                        c = c4;
                    } else {
                        iM3169 = (C0773.m3169("ۡۗ") + i17) * 83;
                        i = ((iM3169 ^ i18) * (-23733)) ^ (-1724646774);
                        i2 = 2115871553;
                        i11 = iM3169 ^ i2;
                        c = c;
                        i19 = i;
                        sArr2 = sArr2;
                        i20 = i11;
                    }
                    break;
                case -1627521134:
                case -788404128:
                    strArrM5508 = strArrM5508;
                    sArr2 = sArr2;
                    c = c;
                    if (iM4845 > 14) {
                        int iM31617 = (C0773.m3169("ۡۨ") ^ i17) * 11;
                        i = ((iM31617 ^ i18) * (-1775)) ^ 1760412778;
                        i11 = iM31617 ^ 56790237;
                        c = c;
                        strArrM5508 = strArrM5508;
                        i21 = 14;
                        i19 = i;
                        sArr2 = sArr2;
                        i20 = i11;
                    } else {
                        i21 = 14;
                        strArrM5508 = strArrM5508;
                        int iM31618 = C0773.m3169("ۤ۠") ^ i17;
                        i9 = ((iM31618 ^ i18) * (-20653)) ^ 354878221;
                        sArr2 = sArr2;
                        i20 = iM31618 ^ (-590757550);
                        char c5 = c;
                        i19 = i9;
                        c = c5;
                    }
                    break;
                case -1624461197:
                case -1048139:
                    strArrM5508 = strArrM5508;
                    sArr2 = sArr2;
                    c = c;
                    if (i12 - (i13 + i14) > 0) {
                        iM31611 = C0773.m3169("۫ۧ") ^ i18;
                        i4 = ((iM31611 ^ i17) * 8791) ^ (-1575633690);
                        i5 = 710784564;
                    } else {
                        iM31611 = (C0619.m2761("ۖ۫") ^ i18) * 5;
                        i4 = ((iM31611 ^ i17) * 17197) ^ 2014351271;
                        i5 = -1808668531;
                    }
                    i8 = iM31611 ^ i5;
                    sArr2 = sArr2;
                    c = c;
                    i20 = i8;
                    i19 = i4;
                    strArrM5508 = strArrM5508;
                    break;
                case -1497342363:
                case 48460824:
                    sArr2 = sArr2;
                    if (!C2878.f9462) {
                        strArrM5508 = strArrM5508;
                        c = c;
                        iM31611 = C0619.m2761("֡᩷") ^ i18;
                        i4 = ((iM31611 ^ i17) * 3491) ^ 1347633089;
                        i5 = -1852409550;
                        i8 = iM31611 ^ i5;
                        sArr2 = sArr2;
                        c = c;
                        i20 = i8;
                        i19 = i4;
                        strArrM5508 = strArrM5508;
                    } else {
                        iM31610 = (C0619.m2761("ܿۙ") ^ i17) * 13;
                        i19 = ((iM31610 ^ i18) * (-15167)) ^ 1417641415;
                        i3 = 1184382768;
                        i11 = iM31610 ^ i3;
                        sArr2 = sArr2;
                        i20 = i11;
                    }
                    break;
                case -1397562809:
                case -77381440:
                    strArrM5508 = strArrM5508;
                    sArr2 = sArr2;
                    c = c;
                    runnableC11413 = new RunnableC11413();
                    if (C0773.f2792 <= 0) {
                        iM31611 = (C0619.m2761("ۛ᩶") + i18) * (-3);
                        i4 = ((iM31611 ^ i17) * 15515) ^ (-996915848);
                        i5 = -1700213327;
                    } else {
                        iM31611 = C0619.m2761("ۨ۫") ^ i17;
                        i4 = ((iM31611 ^ i18) * (-13447)) ^ 560382009;
                        i5 = -1279879513;
                    }
                    i8 = iM31611 ^ i5;
                    sArr2 = sArr2;
                    c = c;
                    i20 = i8;
                    i19 = i4;
                    strArrM5508 = strArrM5508;
                    break;
                case -1376951967:
                case -431102742:
                    if (C1564.f5401 > 0) {
                        strArrM5508 = strArrM5508;
                        sArr2 = sArr2;
                        c = c;
                        iM31611 = (C0619.m2761("ۛ᩶") + i18) * (-3);
                        i4 = ((iM31611 ^ i17) * 15515) ^ (-996915848);
                        i5 = -1700213327;
                        i8 = iM31611 ^ i5;
                        sArr2 = sArr2;
                        c = c;
                        i20 = i8;
                        i19 = i4;
                        strArrM5508 = strArrM5508;
                    } else {
                        sArr2 = sArr2;
                        iM31610 = (C0619.m2761("ܿۙ") ^ i17) * 13;
                        i19 = ((iM31610 ^ i18) * (-15167)) ^ 1417641415;
                        i3 = 1184382768;
                        i11 = iM31610 ^ i3;
                        sArr2 = sArr2;
                        i20 = i11;
                    }
                    break;
                case -1223340336:
                case 1981054593:
                    sArr2 = sArr2;
                    c = c;
                    try {
                        try {
                            strArrM5508 = strArrM5508;
                            try {
                                c1161M49861 = C0269.m1774(C6382.f21568, C0487.m2361(f65222, 56, 21, i15)).m49861();
                                try {
                                    zM6303 = C1826.m6303(c1161M49861);
                                    iM31612 = (C0773.m3169("᩷᩵") ^ i18) * 75;
                                    i4 = ((iM31612 ^ i17) * 11509) ^ (-1017091967);
                                    i7 = -113920253;
                                } catch (Exception unused4) {
                                    iM5470 = i21;
                                    iM31612 = (C0619.m2761("ۚۢ") + i17) * (-119);
                                    i4 = ((iM31612 ^ i18) * 18061) ^ 1204200848;
                                    i7 = 2139960992;
                                }
                                i8 = iM31612 ^ i7;
                                sArr2 = sArr2;
                                c = c;
                                i20 = i8;
                                i19 = i4;
                                strArrM5508 = strArrM5508;
                            } catch (Exception unused5) {
                                strArrM5508 = strArrM5508;
                                int iM31619 = C0773.m3169("ۤ۠") ^ i17;
                                i9 = ((iM31619 ^ i18) * (-20653)) ^ 354878221;
                                sArr2 = sArr2;
                                i20 = iM31619 ^ (-590757550);
                                char c6 = c;
                                i19 = i9;
                                c = c6;
                            }
                        } catch (Exception unused6) {
                            strArrM5508 = strArrM5508;
                        }
                    } catch (Exception unused7) {
                        int iM316110 = C0773.m3169("ۤ۠") ^ i17;
                        i9 = ((iM316110 ^ i18) * (-20653)) ^ 354878221;
                        sArr2 = sArr2;
                        i20 = iM316110 ^ (-590757550);
                        char c7 = c;
                        i19 = i9;
                        c = c7;
                    }
                    break;
                case -1194745318:
                case -896191747:
                    sArr2 = sArr2;
                    if (RunnableC1848.f6235) {
                        strArrM5508 = strArrM5508;
                        c = c;
                        iM31611 = (C0619.m2761("᩻ܿ") + i18) * 85;
                        i4 = ((iM31611 ^ i17) * 2265) ^ 250113059;
                        i5 = 200515915;
                        i8 = iM31611 ^ i5;
                        sArr2 = sArr2;
                        c = c;
                        i20 = i8;
                        i19 = i4;
                        strArrM5508 = strArrM5508;
                    }
                    strArrM5508 = strArrM5508;
                    c = c;
                    iM31611 = C0619.m2761("ۙᩳ") ^ i18;
                    i4 = ((iM31611 ^ i17) * 5189) ^ (-1040372422);
                    i5 = -1881796339;
                    i8 = iM31611 ^ i5;
                    sArr2 = sArr2;
                    c = c;
                    i20 = i8;
                    i19 = i4;
                    strArrM5508 = strArrM5508;
                    break;
                case -1134743934:
                case 651846347:
                    sArr2 = sArr2;
                    c = c;
                    if (!zM6303) {
                        strArrM5508 = strArrM5508;
                        iM5470 = i21;
                        iM31612 = (C0619.m2761("ۚۢ") + i17) * (-119);
                        i4 = ((iM31612 ^ i18) * 18061) ^ 1204200848;
                        i7 = 2139960992;
                        i8 = iM31612 ^ i7;
                        sArr2 = sArr2;
                        c = c;
                        i20 = i8;
                        i19 = i4;
                        strArrM5508 = strArrM5508;
                    } else {
                        iM3169 = (C0773.m3169("ܳ᩸") ^ i18) * 81;
                        i = ((iM3169 ^ i17) * 9581) ^ (-1325765466);
                        i2 = -852408393;
                        i11 = iM3169 ^ i2;
                        c = c;
                        i19 = i;
                        sArr2 = sArr2;
                        i20 = i11;
                    }
                    break;
                case -1013873747:
                case -499491762:
                    break;
                case -909882558:
                case 305358771:
                    sArr2 = sArr2;
                    if (C1783.f6087 <= 0) {
                        iM31610 = (C0619.m2761("ܿۙ") ^ i17) * 13;
                        i19 = ((iM31610 ^ i18) * (-15167)) ^ 1417641415;
                        i3 = 1184382768;
                        i11 = iM31610 ^ i3;
                        sArr2 = sArr2;
                        i20 = i11;
                    } else {
                        strArrM5508 = strArrM5508;
                        c = c;
                        iM31611 = C0619.m2761("ۙᩳ") ^ i18;
                        i4 = ((iM31611 ^ i17) * 5189) ^ (-1040372422);
                        i5 = -1881796339;
                        i8 = iM31611 ^ i5;
                        sArr2 = sArr2;
                        c = c;
                        i20 = i8;
                        i19 = i4;
                        strArrM5508 = strArrM5508;
                    }
                    break;
                case -908072670:
                case 1372648981:
                    C1080.m4050();
                    if (C2966.f9654 >= 0) {
                        strArr = strArrM5508;
                        sArr = sArr2;
                        c = c;
                        iM31613 = (i17 - C0773.m3169("۠᩻")) * 3;
                        i9 = ((iM31613 ^ i18) * 27425) ^ (-417401415);
                        i10 = -1240902468;
                        i20 = iM31613 ^ i10;
                        sArr2 = sArr;
                        strArrM5508 = strArr;
                        char c8 = c;
                        i19 = i9;
                        c = c8;
                    } else {
                        sArr2 = sArr2;
                        iM31610 = (i17 - C0773.m3169("ۚܶ")) * (-67);
                        i19 = ((iM31610 ^ i18) * (-19631)) ^ 2096428719;
                        i3 = 542049233;
                        i11 = iM31610 ^ i3;
                        sArr2 = sArr2;
                        i20 = i11;
                    }
                    break;
                case -807974446:
                case -281116561:
                    strArr = strArrM5508;
                    c = c;
                    sArr = f65222;
                    if (C1343.m4943()) {
                        iM31613 = (C0773.m3169("ᩴ᩵") ^ i17) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i9 = ((iM31613 ^ i18) * (-29993)) ^ 913183941;
                        i10 = -2084295206;
                    } else {
                        iM31613 = (i17 - C0773.m3169("۠᩻")) * 3;
                        i9 = ((iM31613 ^ i18) * 27425) ^ (-417401415);
                        i10 = -1240902468;
                    }
                    i20 = iM31613 ^ i10;
                    sArr2 = sArr;
                    strArrM5508 = strArr;
                    char c9 = c;
                    i19 = i9;
                    c = c9;
                    break;
                case -721476426:
                case -467825884:
                    strArrM5508 = strArrM5508;
                    sArr2 = sArr2;
                    c = '%';
                    if (C2288.f7433 <= 0) {
                        iM2761 = C0619.m2761("۬۠") ^ i18;
                        i19 = ((iM2761 ^ i17) * (-17329)) ^ (-2026939771);
                        i6 = -1105214696;
                    } else {
                        iM2761 = C0619.m2761("ۤۡ") ^ i18;
                        i19 = ((iM2761 ^ i17) * 31733) ^ (-880275167);
                        i6 = -916275315;
                    }
                    sArr2 = sArr2;
                    i20 = iM2761 ^ i6;
                    strArrM5508 = strArrM5508;
                    break;
                case -691761306:
                case 766200082:
                    i15 = 7789;
                    iM31611 = C0773.m3169("ܽ۬") ^ i17;
                    i4 = ((iM31611 ^ i18) * (-9049)) ^ 367660216;
                    i5 = -980359441;
                    i8 = iM31611 ^ i5;
                    sArr2 = sArr2;
                    c = c;
                    i20 = i8;
                    i19 = i4;
                    strArrM5508 = strArrM5508;
                    break;
                case -679213775:
                case 1381898695:
                    C2310.m7813();
                    C4282.m13644();
                    break;
                case -504505889:
                case 1144205195:
                    strArrM5508 = strArrM5508;
                    sArr2 = sArr2;
                    c = c;
                    if (C1321.f4751 < 0) {
                        iM31611 = (i18 - C0773.m3169("ܳۙ")) * (-127);
                        i4 = ((iM31611 ^ i17) * (-9759)) ^ 1743233949;
                        i5 = 1357526921;
                        i8 = iM31611 ^ i5;
                        sArr2 = sArr2;
                        c = c;
                        i20 = i8;
                        i19 = i4;
                        strArrM5508 = strArrM5508;
                    }
                    c = c;
                    iM2761 = C0619.m2761("۬۠") ^ i18;
                    i19 = ((iM2761 ^ i17) * (-17329)) ^ (-2026939771);
                    i6 = -1105214696;
                    sArr2 = sArr2;
                    i20 = iM2761 ^ i6;
                    strArrM5508 = strArrM5508;
                    break;
                case -442996367:
                case 1959219298:
                    sArr2 = sArr2;
                    C2288.m7767();
                    strArrM5508 = strArrM5508;
                    c = c;
                    iM31611 = C0619.m2761("ۙᩳ") ^ i18;
                    i4 = ((iM31611 ^ i17) * 5189) ^ (-1040372422);
                    i5 = -1881796339;
                    i8 = iM31611 ^ i5;
                    sArr2 = sArr2;
                    c = c;
                    i20 = i8;
                    i19 = i4;
                    strArrM5508 = strArrM5508;
                    break;
                case -397150219:
                case 1019460004:
                    sArr2 = sArr2;
                    c = c;
                    try {
                        strArrM5508 = strArrM5508;
                        iM5470 = C1542.m5470(c1161M49861.m49835());
                    } catch (Exception unused8) {
                        strArrM5508 = strArrM5508;
                        iM5470 = i21;
                    }
                    iM31612 = (C0619.m2761("ۚۢ") + i17) * (-119);
                    i4 = ((iM31612 ^ i18) * 18061) ^ 1204200848;
                    i7 = 2139960992;
                    i8 = iM31612 ^ i7;
                    sArr2 = sArr2;
                    c = c;
                    i20 = i8;
                    i19 = i4;
                    strArrM5508 = strArrM5508;
                    break;
                case -363788968:
                case 1599309625:
                    sArr2 = sArr2;
                    C1146.m4231();
                    if (C2310.f7472 >= 0) {
                        iM31610 = (C0619.m2761("ܿۙ") ^ i17) * 13;
                        i19 = ((iM31610 ^ i18) * (-15167)) ^ 1417641415;
                        i3 = 1184382768;
                    } else {
                        iM31610 = (i17 - C0773.m3169("ۚܶ")) * (-67);
                        i19 = ((iM31610 ^ i18) * (-19631)) ^ 2096428719;
                        i3 = 542049233;
                    }
                    i11 = iM31610 ^ i3;
                    sArr2 = sArr2;
                    i20 = i11;
                    break;
                case -88235587:
                case 384978820:
                    strArrM5508 = strArrM5508;
                    sArr2 = sArr2;
                    c = c;
                    i12 = s * s2;
                    i13 = s * s;
                    if (C0269.f1558 <= 0) {
                        iM31611 = (C0619.m2761("ۛ᩶") + i18) * (-3);
                        i4 = ((iM31611 ^ i17) * 15515) ^ (-996915848);
                        i5 = -1700213327;
                    } else {
                        iM31611 = C0773.m3169("᩹ܰ") ^ i17;
                        i4 = ((iM31611 ^ i18) * (-9171)) ^ 388221348;
                        i5 = -1038233954;
                    }
                    i8 = iM31611 ^ i5;
                    sArr2 = sArr2;
                    c = c;
                    i20 = i8;
                    i19 = i4;
                    strArrM5508 = strArrM5508;
                    break;
                case 24297014:
                case 1461596661:
                    strArrM5508 = strArrM5508;
                    sArr2 = sArr2;
                    c = c;
                    if (strM46703 != null) {
                        iM31612 = (C0773.m3169("ۙ֡") ^ i18) * (-59);
                        i4 = ((iM31612 ^ i17) * 21225) ^ 1862212628;
                        i7 = -1415278601;
                        i8 = iM31612 ^ i7;
                        sArr2 = sArr2;
                        c = c;
                        i20 = i8;
                        i19 = i4;
                        strArrM5508 = strArrM5508;
                    } else {
                        strArrM5508 = strArrM5508;
                        int iM316111 = C0773.m3169("ۤ۠") ^ i17;
                        i9 = ((iM316111 ^ i18) * (-20653)) ^ 354878221;
                        sArr2 = sArr2;
                        i20 = iM316111 ^ (-590757550);
                        char c10 = c;
                        i19 = i9;
                        c = c10;
                    }
                    break;
                case 182428147:
                case 1247698851:
                    C2288.m7767();
                    strArrM5508 = strArrM5508;
                    sArr2 = sArr2;
                    if (AbstractC0116.f1064 > 0) {
                        iM2761 = C0619.m2761("۬۠") ^ i18;
                        i19 = ((iM2761 ^ i17) * (-17329)) ^ (-2026939771);
                        i6 = -1105214696;
                        sArr2 = sArr2;
                        i20 = iM2761 ^ i6;
                        strArrM5508 = strArrM5508;
                    } else {
                        c = c;
                        iM31611 = C0619.m2761("֡᩷") ^ i18;
                        i4 = ((iM31611 ^ i17) * 3491) ^ 1347633089;
                        i5 = -1852409550;
                        i8 = iM31611 ^ i5;
                        sArr2 = sArr2;
                        c = c;
                        i20 = i8;
                        i19 = i4;
                        strArrM5508 = strArrM5508;
                    }
                    break;
                case 246766161:
                case 346722931:
                    sArr2 = sArr2;
                    c = c;
                    strArrM5508 = C1564.m5508(RunnableC1848.m6365(strM46703), C3492.m11486(f65222, 54, 2, i15));
                    iM4845 = C1321.m4845(strArrM5508[0]);
                    iM3169 = (C0773.m3169("ۘۜ") + i17) * (-61);
                    i = ((iM3169 ^ i18) * (-2079)) ^ 933607064;
                    i2 = 1630061502;
                    i11 = iM3169 ^ i2;
                    c = c;
                    i19 = i;
                    sArr2 = sArr2;
                    i20 = i11;
                    break;
                case 346610036:
                case 2142102281:
                    strArrM5508 = strArrM5508;
                    sArr2 = sArr2;
                    c = c;
                    if (C2702.f8586 > 0) {
                        iM31611 = (C0619.m2761("۟᩵") + i17) * (-63);
                        i4 = ((iM31611 ^ i18) * (-5095)) ^ 554023793;
                        i5 = 1015016471;
                        i8 = iM31611 ^ i5;
                        sArr2 = sArr2;
                        c = c;
                        i20 = i8;
                        i19 = i4;
                        strArrM5508 = strArrM5508;
                    }
                    c = c;
                    iM2761 = C0619.m2761("۬۠") ^ i18;
                    i19 = ((iM2761 ^ i17) * (-17329)) ^ (-2026939771);
                    i6 = -1105214696;
                    sArr2 = sArr2;
                    i20 = iM2761 ^ i6;
                    strArrM5508 = strArrM5508;
                    break;
                case 534437134:
                case 1248297629:
                    strArrM5508 = strArrM5508;
                    sArr2 = sArr2;
                    c = c;
                    if (C3448.f11240 >= 0) {
                        iM31611 = C0619.m2761("ۙᩳ") ^ i18;
                        i4 = ((iM31611 ^ i17) * 5189) ^ (-1040372422);
                        i5 = -1881796339;
                    } else {
                        iM31611 = C0619.m2761("֡ܺ") ^ i17;
                        i4 = ((iM31611 ^ i18) * 32347) ^ (-256871849);
                        i5 = -368258961;
                    }
                    i8 = iM31611 ^ i5;
                    sArr2 = sArr2;
                    c = c;
                    i20 = i8;
                    i19 = i4;
                    strArrM5508 = strArrM5508;
                    break;
                default:
                    strArrM5508 = strArrM5508;
                    sArr2 = sArr2;
                    c = c;
                    i14 = 1347921;
                    if (RunnableC0334.f1808 <= 0) {
                        iM31611 = C0619.m2761("֡᩷") ^ i18;
                        i4 = ((iM31611 ^ i17) * 3491) ^ 1347633089;
                        i5 = -1852409550;
                    } else {
                        iM31611 = C0619.m2761("ۛܶ") ^ i17;
                        i4 = ((iM31611 ^ i18) * 9129) ^ (-1335237213);
                        i5 = -1579210072;
                    }
                    i8 = iM31611 ^ i5;
                    sArr2 = sArr2;
                    c = c;
                    i20 = i8;
                    i19 = i4;
                    strArrM5508 = strArrM5508;
                    break;
            }
            return;
        }
    }
}
