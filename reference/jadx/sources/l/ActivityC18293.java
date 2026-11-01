package l;

import android.graphics.Bitmap;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import com.alipay.sdk.m.y.q;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ᩳ᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E9LN */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC18293 extends AbstractActivityC12483 {

    /* JADX INFO: renamed from: ۜ᩻᩵, reason: not valid java name and contains not printable characters */
    private static final short[] f58363 = {2330, 22192, 32298, 25888, 24813, 25135, 16788, 26930, 25168, -17451, 20291, 20605, -22798, 32603, -24551, 27641, 17313, -19200, 19400, 12511, 12482, 12511, 12487, 12494, 3923, -7893, 5639, -14224, -14635, 6382, 2179, 7721, 4365, 6306, 7373, 7360, -26699, -26734, -26731, -26722, -26709, -26726, -26737, -26728, -26733, -26709, -26743, -26722, -26739, -26734, -26722, -26740, -26722, -26743};

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f58364 = 0;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f58365;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public C13584 f58366;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = 1425120533;
        int i7 = C3535.f13026;
        int i8 = C1189.f5284;
        int iM11306 = (ThreadFactoryC3888.m11306("ۡܰ") ^ i7) * 97;
        int i9 = ((iM11306 ^ i8) * 20519) ^ (-389258422);
        int i10 = 1074712870;
        while (true) {
            i6 = ((((i6 ^ i8) * (-10815)) >> 31) & i9) ^ (iM11306 ^ i10);
            switch (i6) {
                case -2059787169:
                case 1914473680:
                    if (!C0817.f3443) {
                        iM11306 = (C19806.m45029("᩷۟") ^ i8) * 101;
                        i9 = ((iM11306 ^ i7) * (-24607)) ^ 1938597173;
                        i10 = -1610632610;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۬᩵") ^ i8) * q.h;
                        i9 = ((iM11306 ^ i7) * 17171) ^ (-430516603);
                        i10 = -1361175701;
                    }
                    break;
                case -2019839951:
                case -1682383438:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    iM11306 = (ThreadFactoryC3888.m11306("۬᩵") ^ i8) * q.h;
                    i9 = ((iM11306 ^ i7) * 17171) ^ (-430516603);
                    i10 = -1361175701;
                    break;
                case -1936550128:
                case 593281724:
                    i3 = s * s2;
                    if (C2788.f10625 >= 0) {
                        iM11306 = (i7 - C19806.m45029("ᩳ᩹")) * 73;
                        i9 = ((iM11306 ^ i8) * 1455) ^ (-1641064033);
                        i10 = -792334946;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧܰ") ^ i7) * 9;
                        i9 = ((iM11306 ^ i8) * 24457) ^ (-372264331);
                        i10 = 581730053;
                    }
                    break;
                case -1823583158:
                case -749761300:
                    i2 = i * i;
                    s2 = 2;
                    if (RunnableC1606.m5473() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۬᩵") ^ i8) * q.h;
                        i9 = ((iM11306 ^ i7) * 17171) ^ (-430516603);
                        i10 = -1361175701;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ۟") ^ i8;
                        i9 = ((iM11306 ^ i7) * 26053) ^ (-482174413);
                        i10 = 1394255024;
                    }
                    break;
                case -1734395131:
                case -1349461828:
                    if (C1461.f5957 <= 0) {
                        iM11306 = (i7 - C19806.m45029("ᩳ᩹")) * 73;
                        i9 = ((iM11306 ^ i8) * 1455) ^ (-1641064033);
                        i10 = -792334946;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܶᩴ") + i8) * 43;
                        i9 = ((iM11306 ^ i7) * (-4759)) ^ (-79195505);
                        i10 = -1090022302;
                    }
                    break;
                case -1628384406:
                case -277816695:
                    c = '#';
                    if (C3535.f13026 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܶۙ") ^ i8;
                        i9 = ((iM11306 ^ i7) * (-17623)) ^ 1728288757;
                        i10 = 1977982230;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛۚ") ^ i7;
                        i9 = ((iM11306 ^ i8) * (-11223)) ^ 287836119;
                        i10 = 356156447;
                    }
                    break;
                case -1480655885:
                case 2089591091:
                    ThreadFactoryC3888.m11300();
                    C1461.m5080();
                    return null;
                case -1424949788:
                case 94617924:
                    C3577.m10565();
                    if (C1937.m6279() < 0) {
                        iM11306 = (i7 - C19806.m45029("ᩳ᩹")) * 73;
                        i9 = ((iM11306 ^ i8) * 1455) ^ (-1641064033);
                        i10 = -792334946;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۬᩵") ^ i8) * q.h;
                        i9 = ((iM11306 ^ i7) * 17171) ^ (-430516603);
                        i10 = -1361175701;
                    }
                    break;
                case -1081684330:
                case 2123220538:
                    i = s + 1;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܶۙ") ^ i8;
                        i9 = ((iM11306 ^ i7) * (-17623)) ^ 1728288757;
                        i10 = 1977982230;
                    } else {
                        iM11306 = (C19806.m45029("᩸֫") + i7) * 89;
                        i9 = ((iM11306 ^ i8) * (-20447)) ^ 1626105781;
                        i10 = -2057589138;
                    }
                    break;
                case -764193986:
                case 108449335:
                    return C1937.m6288(sArr2, i5, 18, i4);
                case -728520989:
                case 1423267764:
                    if (C1668.f6641 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۬᩵") ^ i8) * q.h;
                        i9 = ((iM11306 ^ i7) * 17171) ^ (-430516603);
                        i10 = -1361175701;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟᩺") ^ i7;
                        i9 = ((iM11306 ^ i8) * (-30187)) ^ 674895994;
                        i10 = -1000861994;
                    }
                    break;
                case -376785001:
                case 1000100373:
                    if (C2332.m7079() <= 0) {
                        iM11306 = (C19806.m45029("᩷۟") ^ i8) * 101;
                        i9 = ((iM11306 ^ i7) * (-24607)) ^ 1938597173;
                        i10 = -1610632610;
                    } else {
                        iM11306 = C19806.m45029("ۗۙ") ^ i8;
                        i9 = ((iM11306 ^ i7) * 9287) ^ (-1421897939);
                        i10 = -388408362;
                    }
                    break;
                case -54381901:
                case 676882381:
                    i4 = 445;
                    iM11306 = (i8 - ThreadFactoryC3888.m11306("ܺۢ")) * 19;
                    i9 = ((iM11306 ^ i7) * 18105) ^ (-963321326);
                    i10 = 2007312098;
                    break;
                case 263369483:
                case 2053374289:
                    i4 = 38907;
                    iM11306 = (i8 - ThreadFactoryC3888.m11306("ܺۢ")) * 19;
                    i9 = ((iM11306 ^ i7) * 18105) ^ (-963321326);
                    i10 = 2007312098;
                    break;
                case 339467094:
                case 1212387835:
                    sArr = f58363;
                    if (C0216.f1393 != 0) {
                        iM11306 = (i7 - C19806.m45029("ᩳ᩹")) * 73;
                        i9 = ((iM11306 ^ i8) * 1455) ^ (-1641064033);
                        i10 = -792334946;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ۤ") + i7) * (-35);
                        i9 = ((iM11306 ^ i8) * (-12199)) ^ (-1718764010);
                        i10 = 174860306;
                    }
                    break;
                case 962374274:
                case 1661785991:
                    if (C0797.f3386) {
                        iM11306 = ThreadFactoryC3888.m11306("ܶۙ") ^ i8;
                        i9 = ((iM11306 ^ i7) * (-17623)) ^ 1728288757;
                        i10 = 1977982230;
                    } else {
                        iM11306 = (i7 - C19806.m45029("᩹۠")) * (-53);
                        i9 = ((iM11306 ^ i8) * 1049) ^ 497797618;
                        i10 = -934397439;
                    }
                    break;
                case 1154493337:
                case 2085328355:
                    if ((i3 + 1) - i2 > 0) {
                        iM11306 = (C19806.m45029("ܳۙ") ^ i7) * (-113);
                        i9 = ((iM11306 ^ i8) * (-27803)) ^ 1500730720;
                        i10 = 1367181380;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳۢ") ^ i8;
                        i9 = ((iM11306 ^ i7) * (-31107)) ^ 843009415;
                        i10 = 2146907125;
                    }
                    break;
                case 1255826271:
                case 1382543249:
                    s = sArr[c];
                    if (C19806.m45024()) {
                        iM11306 = ThreadFactoryC3888.m11306("ܶۙ") ^ i8;
                        i9 = ((iM11306 ^ i7) * (-17623)) ^ 1728288757;
                        i10 = 1977982230;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺܳ") + i8) * 29;
                        i9 = ((iM11306 ^ i7) * (-11027)) ^ (-191928459);
                        i10 = -963604680;
                    }
                    break;
                default:
                    sArr2 = f58363;
                    i5 = 36;
                    if (C3577.f13150 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܶۙ") ^ i8;
                        i9 = ((iM11306 ^ i7) * (-17623)) ^ 1728288757;
                        i10 = 1977982230;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩹᩻") ^ i7;
                        i9 = ((iM11306 ^ i8) * (-25085)) ^ (-1006674387);
                        i10 = -1919934461;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x021e A[PHI: r7 r11 r12 r21
      0x021e: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:58:0x021c, B:42:0x0156, B:10:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:58:0x021c, B:42:0x0156, B:10:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r12v4 short) = (r12v3 short), (r12v2 short), (r12v2 short) binds: [B:58:0x021c, B:42:0x0156, B:10:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x021e: PHI (r21v19 int) = (r21v7 int), (r21v13 int), (r21v20 int) binds: [B:58:0x021c, B:42:0x0156, B:10:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x026f A[PHI: r2 r3 r8 r17 r21
      0x026f: PHI (r2v3 android.view.MenuItem) = (r2v2 android.view.MenuItem), (r2v2 android.view.MenuItem), (r2v4 android.view.MenuItem) binds: [B:63:0x026d, B:38:0x0135, B:35:0x010b] A[DONT_GENERATE, DONT_INLINE]
      0x026f: PHI (r3v4 int) = (r3v2 int), (r3v3 int), (r3v2 int) binds: [B:63:0x026d, B:38:0x0135, B:35:0x010b] A[DONT_GENERATE, DONT_INLINE]
      0x026f: PHI (r8v3 short[]) = (r8v2 short[]), (r8v2 short[]), (r8v4 short[]) binds: [B:63:0x026d, B:38:0x0135, B:35:0x010b] A[DONT_GENERATE, DONT_INLINE]
      0x026f: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:63:0x026d, B:38:0x0135, B:35:0x010b] A[DONT_GENERATE, DONT_INLINE]
      0x026f: PHI (r21v15 int) = (r21v6 int), (r21v14 int), (r21v17 int) binds: [B:63:0x026d, B:38:0x0135, B:35:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x02a5 A[PHI: r9 r16 r21 r22
      0x02a5: PHI (r9v3 short) = (r9v2 short), (r9v2 short), (r9v5 short) binds: [B:15:0x0078, B:67:0x02a3, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r16v4 short[]) = (r16v2 short[]), (r16v3 short[]), (r16v2 short[]) binds: [B:15:0x0078, B:67:0x02a3, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r21v21 int) = (r21v4 int), (r21v5 int), (r21v24 int) binds: [B:15:0x0078, B:67:0x02a3, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r22v4 int) = (r22v3 int), (r22v3 int), (r22v6 int) binds: [B:15:0x0078, B:67:0x02a3, B:6:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0067, code lost:
    
        if (l.C1937.f7317 < 0) goto L10;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onCreateOptionsMenu(android.view.Menu r26) {
        /*
            Method dump skipped, instruction units count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC18293.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    @Override // android.app.Activity
    public final void finish() {
        AbstractC20745 abstractC20745 = null;
        int i = 1711849928;
        int i2 = C2642.f10294;
        int i3 = C1025.f4800;
        int iM11306 = (ThreadFactoryC3888.m11306("᩷֡") + i2) * 51;
        int i4 = ((iM11306 ^ i3) * (-14103)) ^ (-814617395);
        int i5 = -1439638428;
        while (true) {
            i = ((((i ^ i3) * 23887) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2052449109:
                case -70908438:
                    C1398.m4895();
                    break;
                case -1852387512:
                case 377259108:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹֨") ^ i3) * 27;
                        i4 = ((iM11306 ^ i2) * (-7293)) ^ (-136571559);
                        i5 = 1793750775;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳ۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * 29771) ^ (-1768180635);
                        i5 = -463627831;
                    }
                    break;
                case -1761250793:
                case 1243081101:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹֨") ^ i3) * 27;
                        i4 = ((iM11306 ^ i2) * (-7293)) ^ (-136571559);
                        i5 = 1793750775;
                    } else {
                        iM11306 = C19806.m45029("ۨᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-6457)) ^ 730763618;
                        i5 = 1793028210;
                    }
                    break;
                case -1443795941:
                case 1251790740:
                    C3743.m10966();
                    if (C1875.f7103 < 0) {
                        iM11306 = (i3 - C19806.m45029("ܳ᩺")) * (-105);
                        i4 = ((iM11306 ^ i2) * (-17469)) ^ (-1029377552);
                        i5 = -781627860;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳ۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * 29771) ^ (-1768180635);
                        i5 = -463627831;
                    }
                    break;
                case -1390370631:
                case -1285947973:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = C19806.m45029("ܶ֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-4527)) ^ 389860882;
                        i5 = -959605376;
                    } else {
                        iM11306 = C19806.m45029("ۧۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 8569) ^ (-576655825);
                        i5 = -427074317;
                    }
                    break;
                case -1310963542:
                case -97030836:
                    abstractC20745.mo24644();
                    iM11306 = ThreadFactoryC3888.m11306("۫۬") ^ i3;
                    i4 = ((iM11306 ^ i2) * 16227) ^ 84052947;
                    i5 = 1822162109;
                    break;
                case -1275015754:
                case 909800691:
                    abstractC20745 = this.f58365;
                    if (abstractC20745 != null) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ᩵") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-6475)) ^ 1626601016;
                        i5 = -441648987;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫۬") ^ i3;
                        i4 = ((iM11306 ^ i2) * 16227) ^ 84052947;
                        i5 = 1822162109;
                    }
                    break;
                case -1241402700:
                case 177250338:
                    C2642.m8171();
                    C1398.m4895();
                    iM11306 = ThreadFactoryC3888.m11306("ܳ۬") ^ i2;
                    i4 = ((iM11306 ^ i3) * 29771) ^ (-1768180635);
                    i5 = -463627831;
                    break;
                case -1138043629:
                case 1053286652:
                    break;
                case -805207041:
                case 573104053:
                    if (C0797.f3386) {
                        iM11306 = ThreadFactoryC3888.m11306("ܳ۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * 29771) ^ (-1768180635);
                        i5 = -463627831;
                    } else {
                        iM11306 = (i3 - C19806.m45029("֡᩶")) * (-15);
                        i4 = ((iM11306 ^ i2) * 21131) ^ 814374111;
                        i5 = 736494807;
                    }
                    break;
                case -539235790:
                case -294098195:
                    if (RunnableC1895.f7152) {
                        iM11306 = C19806.m45029("᩻᩹") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-19487)) ^ (-1823571594);
                        i5 = 2050063247;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ܳ᩺")) * (-105);
                        i4 = ((iM11306 ^ i2) * (-17469)) ^ (-1029377552);
                        i5 = -781627860;
                    }
                    break;
                case -502931123:
                case 631505574:
                    if (CallableC1627.m5507() != 0) {
                        iM11306 = (C19806.m45029("ۚ᩹") ^ i2) * 101;
                        i4 = ((iM11306 ^ i3) * 6219) ^ 527321725;
                        i5 = 855470541;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ܰۨ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM11306 ^ i2) * (-19935)) ^ (-1064995710);
                        i5 = 671716700;
                    }
                    break;
                case -424856088:
                case 1415782622:
                    super.finish();
                    if (C0671.f2816 != 0) {
                        iM11306 = (i3 - C19806.m45029("ܳ᩺")) * (-105);
                        i4 = ((iM11306 ^ i2) * (-17469)) ^ (-1029377552);
                        i5 = -781627860;
                    } else {
                        iM11306 = (i2 - C19806.m45029("۫᩺")) * (-85);
                        i4 = ((iM11306 ^ i3) * (-28753)) ^ 1868496289;
                        i5 = 1672842068;
                    }
                    break;
                case -404362157:
                case 1967454915:
                    if (C0817.m3399()) {
                        iM11306 = (C19806.m45029("᩸۟") ^ i2) * (-127);
                        i4 = ((iM11306 ^ i3) * (-10809)) ^ (-1702149704);
                        i5 = -2060063242;
                    } else {
                        iM11306 = C19806.m45029("ܶ֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-4527)) ^ 389860882;
                        i5 = -959605376;
                    }
                    break;
                case 908999803:
                case 1202661444:
                    if (C1977.f7413 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹֨") ^ i3) * 27;
                        i4 = ((iM11306 ^ i2) * (-7293)) ^ (-136571559);
                        i5 = 1793750775;
                    } else {
                        iM11306 = (C19806.m45029("ۨۡ") ^ i3) * (-47);
                        i4 = ((iM11306 ^ i2) * 11465) ^ 1011756310;
                        i5 = -445745253;
                    }
                    break;
                case 1028562944:
                case 1748087159:
                    C10634.m26820();
                    if (C1460.f5948 >= 0) {
                        iM11306 = (C19806.m45029("ۚ᩹") ^ i2) * 101;
                        i4 = ((iM11306 ^ i3) * 6219) ^ 527321725;
                        i5 = 855470541;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳ۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * 29771) ^ (-1768180635);
                        i5 = -463627831;
                    }
                    break;
                case 1705594603:
                case 1922369494:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = C19806.m45029("ܶ֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-4527)) ^ 389860882;
                        i5 = -959605376;
                    } else {
                        iM11306 = C19806.m45029("ۚ֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * 4191) ^ (-1736574772);
                        i5 = -1296367484;
                    }
                    break;
                default:
                    if (C3535.m10431() <= 0) {
                        iM11306 = C19806.m45029("ܶ֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-4527)) ^ 389860882;
                        i5 = -959605376;
                    } else {
                        iM11306 = C19806.m45029("ۘܿ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 16367) ^ 566070532;
                        i5 = 11578455;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x01d0 A[PHI: r1 r6 r9 r11 r12
      0x01d0: PHI (r1v4 int) = (r1v2 int), (r1v2 int), (r1v3 int), (r1v2 int) binds: [B:57:0x01ce, B:49:0x0191, B:38:0x011e, B:34:0x00fd] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r6v4 int) = (r6v3 int), (r6v2 int), (r6v2 int), (r6v2 int) binds: [B:57:0x01ce, B:49:0x0191, B:38:0x011e, B:34:0x00fd] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:57:0x01ce, B:49:0x0191, B:38:0x011e, B:34:0x00fd] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r11v4 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]) binds: [B:57:0x01ce, B:49:0x0191, B:38:0x011e, B:34:0x00fd] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r12v3 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v4 int) binds: [B:57:0x01ce, B:49:0x0191, B:38:0x011e, B:34:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0223 A[PHI: r3 r4 r5
      0x0223: PHI (r3v4 char) = (r3v3 char), (r3v2 char), (r3v2 char), (r3v2 char), (r3v2 char) binds: [B:65:0x0221, B:61:0x0203, B:18:0x0080, B:16:0x007c, B:9:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0223: PHI (r4v4 short) = (r4v2 short), (r4v3 short), (r4v2 short), (r4v2 short), (r4v2 short) binds: [B:65:0x0221, B:61:0x0203, B:18:0x0080, B:16:0x007c, B:9:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0223: PHI (r5v4 short) = (r5v2 short), (r5v3 short), (r5v2 short), (r5v2 short), (r5v2 short) binds: [B:65:0x0221, B:61:0x0203, B:18:0x0080, B:16:0x007c, B:9:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x024d A[PHI: r18
      0x024d: PHI (r18v4 short[]) = (r18v3 short[]), (r18v3 short[]), (r18v5 short[]) binds: [B:16:0x007c, B:13:0x0073, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x027e A[PHI: r7 r8 r13
      0x027e: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:71:0x027c, B:53:0x01af, B:30:0x00e0, B:13:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:71:0x027c, B:53:0x01af, B:30:0x00e0, B:13:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:71:0x027c, B:53:0x01af, B:30:0x00e0, B:13:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int iM45029;
        int i;
        int i2;
        int i3 = C1875.f7103;
        int i4 = C7105.f23796;
        int iM450210 = C19806.m45029("ۖ۬") ^ i4;
        int i5 = ((iM450210 ^ i3) * 1325) ^ (-936370717);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM450210 ^ (-17811611);
        int iM18990 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1961600285;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i3) * 15983) >> 31));
            switch (i14) {
                case -2033959093:
                case -1535755532:
                    i13 = 3;
                    if (C0797.f3386) {
                        iM45029 = C19806.m45029("ۖ۠") ^ i4;
                        i = ((iM45029 ^ i3) * (-9811)) ^ (-512687035);
                        i2 = -1708303413;
                    } else {
                        iM45029 = C19806.m45029("ܶۗ") ^ i4;
                        i = ((iM45029 ^ i3) * (-25175)) ^ 181936407;
                        i2 = -1825928919;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1989951167:
                case -1773931059:
                    i11 = 50262;
                    iM45029 = C19806.m45029("ۢ᩶") ^ i4;
                    i = ((iM45029 ^ i3) * (-7367)) ^ (-2141571241);
                    i2 = -1421697199;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1937139345:
                case 1881087564:
                    this.f58366.m33203();
                    return true;
                case -1756683201:
                case 1597032778:
                    if (C1398.f5802 > 0) {
                        iM45029 = (C19806.m45029("ۗۗ") + i3) * (-95);
                        i = ((iM45029 ^ i4) * 17879) ^ 434289310;
                        i2 = -380531548;
                    } else {
                        iM45029 = C19806.m45029("ۖ۠") ^ i4;
                        i = ((iM45029 ^ i3) * (-9811)) ^ (-512687035);
                        i2 = -1708303413;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1696407923:
                case -962528729:
                    c = 31;
                    if (CallableC1627.f6528) {
                        iM45029 = (C19806.m45029("᩹ۙ") + i4) * (-117);
                        i = ((iM45029 ^ i3) * 30711) ^ 853076802;
                        i2 = -1703006714;
                    } else {
                        iM45029 = C19806.m45029("᩵ۙ") ^ i4;
                        i = ((iM45029 ^ i3) * (-20877)) ^ 1041858333;
                        i2 = -51683164;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1385336675:
                case 1532788807:
                    i8 = i7 * i7;
                    i9 = s * s;
                    if (C19806.f63586) {
                        iM45029 = C19806.m45029("ۖ۠") ^ i4;
                        i = ((iM45029 ^ i3) * (-9811)) ^ (-512687035);
                        i2 = -1708303413;
                    } else {
                        iM45029 = (C19806.m45029("ܶۡ") + i3) * 61;
                        i = ((iM45029 ^ i4) * (-18003)) ^ (-1281201925);
                        i2 = 1639298783;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1213388901:
                case 1580035081:
                    i12 = 32;
                    if (C1668.f6641 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۤ֡") ^ i3;
                        i = ((iM45029 ^ i4) * 18037) ^ 366679395;
                        i2 = -440042198;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨᩴ") ^ i4;
                        i = ((iM45029 ^ i3) * 32061) ^ (-370986263);
                        i2 = 1285593832;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1210484821:
                case 1498298983:
                    if (iM18990 == (C19806.m45029(C0962.m3747(sArr2, i12, i13, i11)) ^ 2118700544)) {
                        int iM450211 = C19806.m45029("ܽۜ") ^ i3;
                        i5 = ((iM450211 ^ i4) * 12027) ^ (-292352660);
                        i6 = iM450211 ^ (-1691424034);
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۡۡ")) * 43;
                        i = ((iM45029 ^ i4) * 25411) ^ 882501462;
                        i2 = -91246909;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    }
                    break;
                case -1100156270:
                case 250918330:
                    C0050.m946();
                    if (C3535.f13026 <= 0) {
                        iM45029 = C19806.m45029("᩵ۙ") ^ i4;
                        i = ((iM45029 ^ i3) * (-20877)) ^ 1041858333;
                        i2 = -51683164;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۗ᩶")) * 31;
                        i = ((iM45029 ^ i3) * 1515) ^ 2033205322;
                        i2 = -583424486;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -852265789:
                case 1347015726:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = C19806.m45029("᩵ۙ") ^ i4;
                        i = ((iM45029 ^ i3) * (-20877)) ^ 1041858333;
                        i2 = -51683164;
                    } else {
                        iM45029 = (C19806.m45029("ۗۗ") + i3) * (-95);
                        i = ((iM45029 ^ i4) * 17879) ^ 434289310;
                        i2 = -380531548;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -841427305:
                case 1801265511:
                    i10 = 74563225;
                    if (C1668.f6641 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۤ֡") ^ i3;
                        i = ((iM45029 ^ i4) * 18037) ^ 366679395;
                        i2 = -440042198;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶ᩵") ^ i4;
                        i = ((iM45029 ^ i3) * o.a.z) ^ (-1924844333);
                        i2 = -1139271164;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -455815677:
                case 28772953:
                    s = sArr[c];
                    s2 = 8635;
                    if (C0817.f3443) {
                        iM45029 = (C19806.m45029("֨ᩴ") ^ i3) * 67;
                        i = ((iM45029 ^ i4) * (-26659)) ^ (-1651719011);
                        i2 = 1952288033;
                    } else {
                        iM45029 = C19806.m45029("᩵ۙ") ^ i4;
                        i = ((iM45029 ^ i3) * (-20877)) ^ 1041858333;
                        i2 = -51683164;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -95311294:
                case 1351881027:
                    i7 = s + s2;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ܰ֫")) * 119;
                        i = ((iM45029 ^ i3) * 27333) ^ 1240427039;
                        i2 = -1185672399;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤ֡") ^ i3;
                        i = ((iM45029 ^ i4) * 18037) ^ 366679395;
                        i2 = -440042198;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 215841384:
                case 934796467:
                    i11 = 18616;
                    iM45029 = C19806.m45029("ۢ᩶") ^ i4;
                    i = ((iM45029 ^ i3) * (-7367)) ^ (-2141571241);
                    i2 = -1421697199;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 362337610:
                case 1987884756:
                    int i15 = i9 + i10;
                    if (i8 - (i15 + i15) > 0) {
                        iM45029 = (C19806.m45029("ۢ۬") + i3) * (-103);
                        i = ((iM45029 ^ i4) * 14701) ^ 1802083452;
                        i2 = -678710562;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸᩶") + i3) * 81;
                        i = ((iM45029 ^ i4) * (-6297)) ^ 998800695;
                        i2 = 1545921704;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 627254457:
                case 1361704201:
                    C0962.m3746();
                    C1937.m6279();
                    iM45029 = C19806.m45029("᩵ۙ") ^ i4;
                    i = ((iM45029 ^ i3) * (-20877)) ^ 1041858333;
                    i2 = -51683164;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 882161820:
                case 1958656955:
                    if (C0526.f2219) {
                        iM45029 = C19806.m45029("ۖ۠") ^ i4;
                        i = ((iM45029 ^ i3) * (-9811)) ^ (-512687035);
                        i2 = -1708303413;
                    } else {
                        iM45029 = (C19806.m45029("۫֡") ^ i4) * (-89);
                        i = ((iM45029 ^ i3) * 851) ^ (-1865652407);
                        i2 = 1005827475;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 915148431:
                case 1294993056:
                    C3535.m10431();
                    C2477.m7593();
                    return false;
                case 1447360954:
                case 2073492076:
                    return false;
                case 1453319387:
                case 1629889962:
                    iM18990 = C7105.m18990(menuItem);
                    sArr2 = f58363;
                    if (C0216.f1393 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۤ֡") ^ i3;
                        i = ((iM45029 ^ i4) * 18037) ^ 366679395;
                        i2 = -440042198;
                    } else {
                        iM45029 = C19806.m45029("ۗܺ") ^ i3;
                        i = ((iM45029 ^ i4) * (-28015)) ^ (-30070845);
                        i2 = -1256413977;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    sArr = f58363;
                    if (C0629.f2722 <= 0) {
                        iM45029 = (C19806.m45029("ۗۗ") + i3) * (-95);
                        i = ((iM45029 ^ i4) * 17879) ^ 434289310;
                        i2 = -380531548;
                    } else {
                        iM45029 = (i3 - C19806.m45029("֨ۙ")) * 11;
                        i = ((iM45029 ^ i4) * 21049) ^ (-1067864375);
                        i2 = -575340941;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:33:0x0111  */
    /* JADX WARN: Code duplicated, block: B:71:0x0351 A[PHI: r2 r4 r7 r9 r10 r25 r27 r28
      0x0351: PHI (r2v7 android.widget.SeekBar) = (r2v2 android.widget.SeekBar), (r2v5 android.widget.SeekBar), (r2v2 android.widget.SeekBar) binds: [B:70:0x034f, B:57:0x029a, B:32:0x0107] A[DONT_GENERATE, DONT_INLINE]
      0x0351: PHI (r4v46 short[]) = (r4v20 short[]), (r4v29 short[]), (r4v47 short[]) binds: [B:70:0x034f, B:57:0x029a, B:32:0x0107] A[DONT_GENERATE, DONT_INLINE]
      0x0351: PHI (r7v5 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:70:0x034f, B:57:0x029a, B:32:0x0107] A[DONT_GENERATE, DONT_INLINE]
      0x0351: PHI (r9v5 short[]) = (r9v2 short[]), (r9v3 short[]), (r9v2 short[]) binds: [B:70:0x034f, B:57:0x029a, B:32:0x0107] A[DONT_GENERATE, DONT_INLINE]
      0x0351: PHI (r10v5 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:70:0x034f, B:57:0x029a, B:32:0x0107] A[DONT_GENERATE, DONT_INLINE]
      0x0351: PHI (r25v37 android.widget.CheckBox) = (r25v26 android.widget.CheckBox), (r25v29 android.widget.CheckBox), (r25v38 android.widget.CheckBox) binds: [B:70:0x034f, B:57:0x029a, B:32:0x0107] A[DONT_GENERATE, DONT_INLINE]
      0x0351: PHI (r27v23 android.widget.CompoundButton$OnCheckedChangeListener) = 
      (r27v14 android.widget.CompoundButton$OnCheckedChangeListener)
      (r27v17 android.widget.CompoundButton$OnCheckedChangeListener)
      (r27v24 android.widget.CompoundButton$OnCheckedChangeListener)
     binds: [B:70:0x034f, B:57:0x029a, B:32:0x0107] A[DONT_GENERATE, DONT_INLINE]
      0x0351: PHI (r28v23 java.io.IOException) = (r28v14 java.io.IOException), (r28v17 java.io.IOException), (r28v24 java.io.IOException) binds: [B:70:0x034f, B:57:0x029a, B:32:0x0107] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        CheckBox checkBox;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        IOException iOException;
        int iM11306;
        int i;
        int i2;
        int i3;
        CheckBox checkBox2;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener2;
        IOException iOException2;
        short[] sArr;
        short[] sArr2;
        int i4;
        int iM45029;
        int i5;
        int iM450210;
        int i6;
        int iM450211;
        int i7;
        int i8;
        int iM11307;
        int i9;
        int i10;
        int iM450212;
        int i11;
        int i12;
        int i13;
        final ActivityC18293 activityC18293 = this;
        int i14 = AbstractC0464.f2088;
        int i15 = C1148.f5161;
        int iM11308 = (ThreadFactoryC3888.m11306("ܳۤ") + i15) * (-19);
        int i16 = ((iM11308 ^ i14) * (-9211)) ^ 1429481699;
        IOException iOException3 = null;
        String strM8640 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i17 = iM11308 ^ 1583607678;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        short s = 0;
        short s2 = 0;
        int iM450213 = 0;
        int i24 = 0;
        int i25 = -212031176;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener3 = null;
        CheckBox checkBox3 = null;
        SeekBar seekBar = null;
        SeekBar seekBar2 = null;
        while (true) {
            i25 = i17 ^ (i16 & (((i25 ^ i14) * 18337) >> 31));
            switch (i25) {
                case -1920306426:
                case -1221717795:
                    C3660.m10791();
                    C1377.m4833();
                    break;
                case -1879687356:
                case 1003790632:
                    checkBox = checkBox3;
                    onCheckedChangeListener = onCheckedChangeListener3;
                    iOException = iOException3;
                    seekBar = (SeekBar) RunnableC0195.m1436(activityC18293, C19806.m45029(C2124.m6685(sArr5, i20, i18, i21)) ^ 2117595173);
                    sArr6 = f58363;
                    i22 = 16;
                    i19 = 3;
                    if (C2124.f7782 <= 0) {
                        iM450212 = C19806.m45029("ᩳ۫") ^ i14;
                        i11 = ((iM450212 ^ i15) * (-235)) ^ (-1279603166);
                        i12 = -1974272060;
                    } else {
                        iM450212 = C19806.m45029("ۚ᩷") ^ i15;
                        i11 = ((iM450212 ^ i14) * 21337) ^ (-1027291626);
                        i12 = 1162867937;
                    }
                    int i26 = iM450212 ^ i12;
                    onCheckedChangeListener3 = onCheckedChangeListener;
                    iOException3 = iOException;
                    CheckBox checkBox4 = checkBox;
                    i17 = i26;
                    i16 = i11;
                    checkBox3 = checkBox4;
                    break;
                case -1693274287:
                case 1142444431:
                    C2788.m8472();
                    if (!C0962.f3784) {
                        checkBox3 = checkBox3;
                        onCheckedChangeListener3 = onCheckedChangeListener3;
                        iOException3 = iOException3;
                        sArr4 = sArr4;
                        int iM450214 = C19806.m45029("ۤۧ") ^ i14;
                        i7 = ((iM450214 ^ i15) * 23095) ^ 564286910;
                        i13 = iM450214 ^ (-280200327);
                        sArr4 = sArr4;
                        checkBox3 = checkBox3;
                        onCheckedChangeListener3 = onCheckedChangeListener3;
                        iOException3 = iOException3;
                        i17 = i13;
                        i16 = i7;
                        activityC18293 = this;
                    } else {
                        checkBox3 = checkBox3;
                        onCheckedChangeListener3 = onCheckedChangeListener3;
                        iOException3 = iOException3;
                        sArr4 = sArr4;
                        iM11307 = (i15 - ThreadFactoryC3888.m11306("᩺ᩳ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i9 = ((iM11307 ^ i14) * 9687) ^ (-2137143804);
                        i10 = 499375021;
                        int i27 = iM11307 ^ i10;
                        sArr4 = sArr4;
                        checkBox3 = checkBox3;
                        iOException3 = iOException3;
                        i17 = i27;
                        i16 = i9;
                        onCheckedChangeListener3 = onCheckedChangeListener3;
                    }
                    break;
                case -1120030447:
                case 1029148563:
                    checkBox2 = checkBox3;
                    onCheckedChangeListener2 = onCheckedChangeListener3;
                    iOException2 = iOException3;
                    sArr = sArr4;
                    sArr2 = sArr3;
                    i4 = i24;
                    C6938 c6938 = (C6938) C2332.m7083(activityC18293, C19806.m45029(C19806.m45020(sArr2, i4, 3, i21)) ^ 2117976123);
                    activityC18293.f41645 = c6938;
                    C0216.m1585(activityC18293, c6938);
                    if (C3743.m10966() <= 0) {
                        iM45029 = C19806.m45029("ܺ᩹") ^ i14;
                        i = ((iM45029 ^ i15) * (-16597)) ^ 900976442;
                        i5 = 606652232;
                    } else {
                        iM45029 = C19806.m45029("᩵۬") ^ i14;
                        i = ((iM45029 ^ i15) * 29635) ^ 632979884;
                        i5 = 680501640;
                    }
                    i3 = iM45029 ^ i5;
                    sArr4 = sArr;
                    sArr3 = sArr2;
                    i24 = i4;
                    checkBox3 = checkBox2;
                    onCheckedChangeListener3 = onCheckedChangeListener2;
                    iOException3 = iOException2;
                    i17 = i3;
                    i16 = i;
                    break;
                case -1049910481:
                case -645772805:
                    C3577.m10565();
                    if (!C2704.f10408) {
                        checkBox2 = checkBox3;
                        onCheckedChangeListener2 = onCheckedChangeListener3;
                        iOException2 = iOException3;
                        sArr2 = sArr3;
                        i4 = i24;
                        sArr = sArr4;
                        iM45029 = C19806.m45029("ܺ᩹") ^ i14;
                        i = ((iM45029 ^ i15) * (-16597)) ^ 900976442;
                        i5 = 606652232;
                        i3 = iM45029 ^ i5;
                        sArr4 = sArr;
                        sArr3 = sArr2;
                        i24 = i4;
                        checkBox3 = checkBox2;
                        onCheckedChangeListener3 = onCheckedChangeListener2;
                        iOException3 = iOException2;
                        i17 = i3;
                        i16 = i;
                    } else {
                        checkBox3 = checkBox3;
                        onCheckedChangeListener3 = onCheckedChangeListener3;
                        iOException3 = iOException3;
                        sArr4 = sArr4;
                        int iM450215 = C19806.m45029("ۤۧ") ^ i14;
                        i7 = ((iM450215 ^ i15) * 23095) ^ 564286910;
                        i13 = iM450215 ^ (-280200327);
                        sArr4 = sArr4;
                        checkBox3 = checkBox3;
                        onCheckedChangeListener3 = onCheckedChangeListener3;
                        iOException3 = iOException3;
                        i17 = i13;
                        i16 = i7;
                        activityC18293 = this;
                    }
                    break;
                case -936502405:
                case 130451485:
                    checkBox3 = checkBox3;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    iOException3 = iOException3;
                    sArr4 = sArr4;
                    strM8640 = C2871.m8640(f58363, 7, 3, i21);
                    if (C3286.m9798() > 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ۗᩳ") ^ i15;
                        i9 = ((iM11307 ^ i14) * 22811) ^ (-525713433);
                        i10 = 913203970;
                        int i28 = iM11307 ^ i10;
                        sArr4 = sArr4;
                        checkBox3 = checkBox3;
                        iOException3 = iOException3;
                        i17 = i28;
                        i16 = i9;
                        onCheckedChangeListener3 = onCheckedChangeListener3;
                    } else {
                        int iM450216 = C19806.m45029("ۤۧ") ^ i14;
                        i7 = ((iM450216 ^ i15) * 23095) ^ 564286910;
                        i13 = iM450216 ^ (-280200327);
                        sArr4 = sArr4;
                        checkBox3 = checkBox3;
                        onCheckedChangeListener3 = onCheckedChangeListener3;
                        iOException3 = iOException3;
                        i17 = i13;
                        i16 = i7;
                        activityC18293 = this;
                    }
                    break;
                case -777995684:
                case 569808263:
                    CheckBox checkBox5 = checkBox3;
                    CompoundButton.OnCheckedChangeListener onCheckedChangeListener4 = onCheckedChangeListener3;
                    IOException iOException4 = iOException3;
                    short[] sArr7 = sArr3;
                    int i29 = i24;
                    short[] sArr8 = sArr4;
                    short s3 = s;
                    int i30 = s3 + 11362;
                    if ((i30 * i30) - (s * s2) < 0) {
                        iM11306 = (i14 - ThreadFactoryC3888.m11306("ۧ۫")) * 21;
                        i = ((iM11306 ^ i15) * 17227) ^ 1031918605;
                        i2 = 289668947;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩹۬") ^ i14;
                        i = ((iM11306 ^ i15) * (-9993)) ^ 1110581725;
                        i2 = 79131845;
                    }
                    i3 = iM11306 ^ i2;
                    s = s3;
                    sArr4 = sArr8;
                    sArr3 = sArr7;
                    i24 = i29;
                    checkBox3 = checkBox5;
                    onCheckedChangeListener3 = onCheckedChangeListener4;
                    iOException3 = iOException4;
                    activityC18293 = this;
                    i17 = i3;
                    i16 = i;
                    break;
                case -768380357:
                case 284378593:
                    if (C3722.m10894() > 0) {
                        iM450210 = (C19806.m45029("ۖ֫") + i15) * 19;
                        i = ((iM450210 ^ i14) * (-30207)) ^ (-1034040317);
                        i6 = 1182061710;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("ᩴۤ") ^ i14;
                        i = ((iM450210 ^ i15) * 29717) ^ 1726308382;
                        i6 = 1716734821;
                    }
                    i17 = iM450210 ^ i6;
                    i16 = i;
                    break;
                case -752610241:
                case 2085259792:
                    C0526.m2437();
                    if (C2332.f8260) {
                        iM450210 = (i14 - ThreadFactoryC3888.m11306("ۢ᩻")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM450210 ^ i15) * (-4133)) ^ (-1674422547);
                        i6 = 1194371297;
                    } else {
                        iM450210 = (C19806.m45029("ۖ֫") + i15) * 19;
                        i = ((iM450210 ^ i14) * (-30207)) ^ (-1034040317);
                        i6 = 1182061710;
                    }
                    i17 = iM450210 ^ i6;
                    i16 = i;
                    break;
                case -711293820:
                case 291885238:
                    if (C0216.f1393 != 0) {
                        checkBox = checkBox3;
                        onCheckedChangeListener = onCheckedChangeListener3;
                        iOException = iOException3;
                        iM450212 = C19806.m45029("ᩳ۫") ^ i14;
                        i11 = ((iM450212 ^ i15) * (-235)) ^ (-1279603166);
                        i12 = -1974272060;
                        int i210 = iM450212 ^ i12;
                        onCheckedChangeListener3 = onCheckedChangeListener;
                        iOException3 = iOException;
                        CheckBox checkBox6 = checkBox;
                        i17 = i210;
                        i16 = i11;
                        checkBox3 = checkBox6;
                    } else {
                        iM450210 = C19806.m45029("᩺ܺ") ^ i15;
                        i = ((iM450210 ^ i14) * (-22411)) ^ (-1587294444);
                        i6 = -1092894008;
                        i17 = iM450210 ^ i6;
                        i16 = i;
                    }
                    break;
                case -697994765:
                case 2134341945:
                    break;
                case -604169242:
                case 1387218366:
                    checkBox3 = checkBox3;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    iOException3 = iOException3;
                    sArr3 = sArr3;
                    i24 = i24;
                    sArr4 = sArr4;
                    s = f58363[0];
                    s2 = 45448;
                    if (C10634.f36300 >= 0) {
                        iM450211 = C19806.m45029("ۡᩴ") ^ i15;
                        i7 = ((iM450211 ^ i14) * 15725) ^ (-1246052833);
                        i8 = 438692698;
                    } else {
                        iM450211 = (C19806.m45029("֡ܽ") + i15) * (-89);
                        i7 = ((iM450211 ^ i14) * 11053) ^ (-1843112239);
                        i8 = -1147946542;
                    }
                    i13 = iM450211 ^ i8;
                    sArr4 = sArr4;
                    sArr3 = sArr3;
                    i24 = i24;
                    checkBox3 = checkBox3;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    iOException3 = iOException3;
                    i17 = i13;
                    i16 = i7;
                    activityC18293 = this;
                    break;
                case -599803370:
                case 1343560268:
                    checkBox3 = checkBox3;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    iOException3 = iOException3;
                    sArr4 = sArr4;
                    seekBar2 = (SeekBar) C2332.m7083(activityC18293, C19806.m45029(C0817.m3406(sArr4, i23, 3, i21)) ^ 2129031903);
                    sArr5 = f58363;
                    i20 = 13;
                    i18 = 3;
                    if (C0216.f1393 != 0) {
                        iM11307 = (i15 - ThreadFactoryC3888.m11306("᩺ᩳ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i9 = ((iM11307 ^ i14) * 9687) ^ (-2137143804);
                        i10 = 499375021;
                    } else {
                        iM11307 = C19806.m45029("ۗ۟") ^ i14;
                        i9 = ((iM11307 ^ i15) * (-14391)) ^ 463960324;
                        i10 = -678145397;
                    }
                    int i211 = iM11307 ^ i10;
                    sArr4 = sArr4;
                    checkBox3 = checkBox3;
                    iOException3 = iOException3;
                    i17 = i211;
                    i16 = i9;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    break;
                case -385626791:
                case 15082037:
                    activityC18293.m31003((Throwable) iOException3, true);
                    break;
                case -168900248:
                case 510748646:
                    checkBox3 = checkBox3;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    iOException3 = iOException3;
                    sArr4 = sArr4;
                    RunnableC0195.m1436(activityC18293, iM450213 ^ 2122588862);
                    sArr3 = f58363;
                    i24 = 4;
                    if (!RunnableC1895.f7152) {
                        int iM450217 = C19806.m45029("ۤۧ") ^ i14;
                        i7 = ((iM450217 ^ i15) * 23095) ^ 564286910;
                        i13 = iM450217 ^ (-280200327);
                        sArr4 = sArr4;
                        checkBox3 = checkBox3;
                        onCheckedChangeListener3 = onCheckedChangeListener3;
                        iOException3 = iOException3;
                        i17 = i13;
                        i16 = i7;
                        activityC18293 = this;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ܽۘ") ^ i15;
                        i9 = ((iM11307 ^ i14) * 271) ^ (-1507331529);
                        i10 = -1030878259;
                        int i212 = iM11307 ^ i10;
                        sArr4 = sArr4;
                        checkBox3 = checkBox3;
                        iOException3 = iOException3;
                        i17 = i212;
                        i16 = i9;
                        onCheckedChangeListener3 = onCheckedChangeListener3;
                    }
                    break;
                case 219977157:
                case 1569077256:
                    checkBox3 = checkBox3;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    iOException3 = iOException3;
                    sArr3 = sArr3;
                    i24 = i24;
                    sArr4 = sArr4;
                    super.onCreate(bundle);
                    iM450213 = C19806.m45029(ThreadFactoryC3888.m11312(f58363, 1, 3, i21));
                    if (C1668.f6641 < 0) {
                        iM450211 = C19806.m45029("ۨۡ") ^ i14;
                        i7 = ((iM450211 ^ i15) * (-24177)) ^ 1898024025;
                        i8 = 1175653432;
                        i13 = iM450211 ^ i8;
                        sArr4 = sArr4;
                        sArr3 = sArr3;
                        i24 = i24;
                        checkBox3 = checkBox3;
                        onCheckedChangeListener3 = onCheckedChangeListener3;
                        iOException3 = iOException3;
                        i17 = i13;
                        i16 = i7;
                        activityC18293 = this;
                    } else {
                        sArr3 = sArr3;
                        i24 = i24;
                        int iM450218 = C19806.m45029("ۤۧ") ^ i14;
                        i7 = ((iM450218 ^ i15) * 23095) ^ 564286910;
                        i13 = iM450218 ^ (-280200327);
                        sArr4 = sArr4;
                        checkBox3 = checkBox3;
                        onCheckedChangeListener3 = onCheckedChangeListener3;
                        iOException3 = iOException3;
                        i17 = i13;
                        i16 = i7;
                        activityC18293 = this;
                    }
                    break;
                case 307800718:
                case 1316093749:
                    C1189.m4370(checkBox3, onCheckedChangeListener3);
                    checkBox = checkBox3;
                    onCheckedChangeListener = onCheckedChangeListener3;
                    iOException = iOException3;
                    C3286.m9791(activityC18293.f41645, C0526.m2421(C1937.m6287(this), C0671.m3009(f58363, 19, 5, i21)));
                    iM450212 = (C19806.m45029("ᩳۨ") ^ i15) * 109;
                    i11 = ((iM450212 ^ i14) * (-21405)) ^ (-1766615373);
                    i12 = 190143815;
                    int i213 = iM450212 ^ i12;
                    onCheckedChangeListener3 = onCheckedChangeListener;
                    iOException3 = iOException;
                    CheckBox checkBox7 = checkBox;
                    i17 = i213;
                    i16 = i11;
                    checkBox3 = checkBox7;
                    break;
                case 308764646:
                case 1704352014:
                    if (!C2704.f10408) {
                        iM450210 = (i14 - ThreadFactoryC3888.m11306("ۢ᩻")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM450210 ^ i15) * (-4133)) ^ (-1674422547);
                        i6 = 1194371297;
                        i17 = iM450210 ^ i6;
                        i16 = i;
                    } else {
                        checkBox3 = checkBox3;
                        onCheckedChangeListener3 = onCheckedChangeListener3;
                        iOException3 = iOException3;
                        sArr4 = sArr4;
                        iM11307 = (i15 - ThreadFactoryC3888.m11306("᩺ᩳ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i9 = ((iM11307 ^ i14) * 9687) ^ (-2137143804);
                        i10 = 499375021;
                        int i214 = iM11307 ^ i10;
                        sArr4 = sArr4;
                        checkBox3 = checkBox3;
                        iOException3 = iOException3;
                        i17 = i214;
                        i16 = i9;
                        onCheckedChangeListener3 = onCheckedChangeListener3;
                    }
                    break;
                case 375054762:
                case 1007995578:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() == 0) {
                        checkBox3 = checkBox3;
                        onCheckedChangeListener3 = onCheckedChangeListener3;
                        iOException3 = iOException3;
                        sArr3 = sArr3;
                        i24 = i24;
                        sArr4 = sArr4;
                        iM450211 = C19806.m45029("ۡᩴ") ^ i15;
                        i7 = ((iM450211 ^ i14) * 15725) ^ (-1246052833);
                        i8 = 438692698;
                        i13 = iM450211 ^ i8;
                        sArr4 = sArr4;
                        sArr3 = sArr3;
                        i24 = i24;
                        checkBox3 = checkBox3;
                        onCheckedChangeListener3 = onCheckedChangeListener3;
                        iOException3 = iOException3;
                        i17 = i13;
                        i16 = i7;
                        activityC18293 = this;
                    }
                    checkBox3 = checkBox3;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    iOException3 = iOException3;
                    sArr4 = sArr4;
                    int iM450219 = C19806.m45029("ۤۧ") ^ i14;
                    i7 = ((iM450219 ^ i15) * 23095) ^ 564286910;
                    i13 = iM450219 ^ (-280200327);
                    sArr4 = sArr4;
                    checkBox3 = checkBox3;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    iOException3 = iOException3;
                    i17 = i13;
                    i16 = i7;
                    activityC18293 = this;
                    break;
                case 961197240:
                case 1108751279:
                    C10634.m26820();
                    C3660.m10791();
                    checkBox3 = checkBox3;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    iOException3 = iOException3;
                    sArr4 = sArr4;
                    int iM4502110 = C19806.m45029("ۤۧ") ^ i14;
                    i7 = ((iM4502110 ^ i15) * 23095) ^ 564286910;
                    i13 = iM4502110 ^ (-280200327);
                    sArr4 = sArr4;
                    checkBox3 = checkBox3;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    iOException3 = iOException3;
                    i17 = i13;
                    i16 = i7;
                    activityC18293 = this;
                    break;
                case 989611995:
                case 1674007768:
                    iOException2 = iOException3;
                    checkBox3 = (CheckBox) RunnableC0195.m1436(activityC18293, C19806.m45029(C0629.m2906(sArr6, i22, i19, i21)) ^ 2127201147);
                    activityC18293.f58366.m33206(seekBar2, seekBar);
                    onCheckedChangeListener3 = new CompoundButton.OnCheckedChangeListener() { // from class: l.᩸᩷ۘ
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                            int i31 = -853447936;
                            int i32 = C0278.f1572;
                            int i33 = C0050.f912;
                            int iM450220 = C19806.m45029("֫ۤ") ^ i33;
                            int i34 = ((iM450220 ^ i32) * (-30559)) ^ (-593654759);
                            int i35 = 1186211947;
                            while (true) {
                                i31 = ((((i31 ^ i32) * 22573) >> 31) & i34) ^ (iM450220 ^ i35);
                                switch (i31) {
                                    case -2117805168:
                                    case -478692257:
                                        C2871.m8646();
                                        break;
                                    case -1967135384:
                                    case 32712565:
                                        if (C3660.f13403 >= 0) {
                                            iM450220 = (ThreadFactoryC3888.m11306("᩸ۡ") + i33) * 39;
                                            i34 = ((iM450220 ^ i32) * (-11037)) ^ 2005328300;
                                            i35 = 569403747;
                                        } else {
                                            iM450220 = ThreadFactoryC3888.m11306("ۙۖ") ^ i32;
                                            i34 = ((iM450220 ^ i33) * 28125) ^ (-1970126420);
                                            i35 = 1317525823;
                                        }
                                        break;
                                    case -1692777131:
                                    case 504565320:
                                        if (C3535.f13026 <= 0) {
                                            iM450220 = C19806.m45029("ۘۜ") ^ i32;
                                            i34 = ((iM450220 ^ i33) * 5067) ^ (-1581544498);
                                            i35 = -1387486571;
                                        } else {
                                            iM450220 = (ThreadFactoryC3888.m11306("ۘۘ") + i32) * 67;
                                            i34 = ((iM450220 ^ i33) * 13991) ^ (-1187069133);
                                            i35 = 2118998609;
                                        }
                                        break;
                                    case -1461146315:
                                    case 178128657:
                                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                                            iM450220 = C19806.m45029("ۘۜ") ^ i32;
                                            i34 = ((iM450220 ^ i33) * 5067) ^ (-1581544498);
                                            i35 = -1387486571;
                                        } else {
                                            iM450220 = ThreadFactoryC3888.m11306("۫᩵") ^ i33;
                                            i34 = ((iM450220 ^ i32) * 15913) ^ 1481676438;
                                            i35 = -34807217;
                                        }
                                        break;
                                    case -1338279178:
                                    case 1632600504:
                                        if (C3535.m10431() <= 0) {
                                            iM450220 = (ThreadFactoryC3888.m11306("᩸ۡ") + i33) * 39;
                                            i34 = ((iM450220 ^ i32) * (-11037)) ^ 2005328300;
                                            i35 = 569403747;
                                        } else {
                                            iM450220 = (i32 - ThreadFactoryC3888.m11306("ۚ۟")) * (-73);
                                            i34 = ((iM450220 ^ i33) * (-1555)) ^ 2137149060;
                                            i35 = 1495049753;
                                        }
                                        break;
                                    case -1156900873:
                                    case -950002654:
                                        if (C1875.f7103 < 0) {
                                            iM450220 = (i32 - ThreadFactoryC3888.m11306("ۚ۟")) * (-73);
                                            i34 = ((iM450220 ^ i33) * (-1555)) ^ 2137149060;
                                            i35 = 1495049753;
                                        } else {
                                            iM450220 = C19806.m45029("ۨܰ") ^ i33;
                                            i34 = ((iM450220 ^ i32) * 1479) ^ 1935322203;
                                            i35 = -839999685;
                                        }
                                        break;
                                    case -1068357545:
                                    case 1848923898:
                                        C0797.m3359();
                                        iM450220 = C19806.m45029("ۨܰ") ^ i33;
                                        i34 = ((iM450220 ^ i32) * 1479) ^ 1935322203;
                                        i35 = -839999685;
                                        break;
                                    case -940644303:
                                    case 65288046:
                                        this.f70871.f58366.m33207(z);
                                        break;
                                    case -938316124:
                                    case 1147805901:
                                        if (C1461.f5957 <= 0) {
                                            iM450220 = C19806.m45029("ۘۜ") ^ i32;
                                            i34 = ((iM450220 ^ i33) * 5067) ^ (-1581544498);
                                            i35 = -1387486571;
                                        } else {
                                            iM450220 = (ThreadFactoryC3888.m11306("ܶۤ") + i33) * (-95);
                                            i34 = ((iM450220 ^ i32) * (-28385)) ^ (-832172083);
                                            i35 = -245156787;
                                        }
                                        break;
                                    case -591243087:
                                    case 1744050369:
                                        if (C1025.m3861() <= 0) {
                                            iM450220 = (i32 - ThreadFactoryC3888.m11306("ۚ۟")) * (-73);
                                            i34 = ((iM450220 ^ i33) * (-1555)) ^ 2137149060;
                                            i35 = 1495049753;
                                        } else {
                                            iM450220 = ThreadFactoryC3888.m11306("ۚۘ") ^ i32;
                                            i34 = ((iM450220 ^ i33) * (-12859)) ^ (-2081995713);
                                            i35 = -1748484815;
                                        }
                                        break;
                                    case -360558358:
                                    case 1793123331:
                                        if (C2124.m6673() <= 0) {
                                            iM450220 = C19806.m45029("ۘ۬") ^ i33;
                                            i34 = ((iM450220 ^ i32) * (-12911)) ^ (-1151981579);
                                            i35 = 584509532;
                                        } else {
                                            iM450220 = (i32 - C19806.m45029("ᩴۨ")) * 85;
                                            i34 = ((iM450220 ^ i33) * 21637) ^ (-1909943389);
                                            i35 = -996820671;
                                        }
                                        break;
                                    case -184632229:
                                    case 1253594556:
                                        if (C3660.f13403 >= 0) {
                                            iM450220 = (i32 - ThreadFactoryC3888.m11306("ۚ۟")) * (-73);
                                            i34 = ((iM450220 ^ i33) * (-1555)) ^ 2137149060;
                                            i35 = 1495049753;
                                        } else {
                                            iM450220 = C19806.m45029("ۧۡ") ^ i33;
                                            i34 = ((iM450220 ^ i32) * 9469) ^ 124876303;
                                            i35 = -1498933805;
                                        }
                                        break;
                                    case 263917329:
                                    case 989253735:
                                        if (C0629.m2907()) {
                                            iM450220 = (i33 - C19806.m45029("ܶᩳ")) * 49;
                                            i34 = ((iM450220 ^ i32) * 3465) ^ 1907898521;
                                            i35 = 1328923575;
                                        } else {
                                            iM450220 = C19806.m45029("ۘۜ") ^ i32;
                                            i34 = ((iM450220 ^ i33) * 5067) ^ (-1581544498);
                                            i35 = -1387486571;
                                        }
                                        break;
                                    case 722306812:
                                    case 1408237893:
                                        if (C3535.f13026 <= 0) {
                                            iM450220 = C19806.m45029("ۘ۬") ^ i33;
                                            i34 = ((iM450220 ^ i32) * (-12911)) ^ (-1151981579);
                                            i35 = 584509532;
                                        } else {
                                            iM450220 = ThreadFactoryC3888.m11306("֨ܽ") ^ i33;
                                            i34 = ((iM450220 ^ i32) * 31141) ^ (-1563416);
                                            i35 = 1379475774;
                                        }
                                        break;
                                    case 1416167374:
                                    case 1862052523:
                                        C10634.m26820();
                                        if (C1977.f7413 <= 0) {
                                            iM450220 = C19806.m45029("ۘۜ") ^ i32;
                                            i34 = ((iM450220 ^ i33) * 5067) ^ (-1581544498);
                                            i35 = -1387486571;
                                        } else {
                                            iM450220 = (i32 - ThreadFactoryC3888.m11306("ۚ۟")) * (-73);
                                            i34 = ((iM450220 ^ i33) * (-1555)) ^ 2137149060;
                                            i35 = 1495049753;
                                        }
                                        break;
                                    default:
                                        if (C0797.f3386) {
                                            iM450220 = C19806.m45029("ۘۜ") ^ i32;
                                            i34 = ((iM450220 ^ i33) * 5067) ^ (-1581544498);
                                            i35 = -1387486571;
                                        } else {
                                            iM450220 = ThreadFactoryC3888.m11306("ܿۜ") ^ i32;
                                            i34 = ((iM450220 ^ i33) * (-18005)) ^ 1590610213;
                                            i35 = 662779005;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    if (C1148.f5161 <= 0) {
                        checkBox2 = checkBox3;
                        onCheckedChangeListener2 = onCheckedChangeListener3;
                        sArr2 = sArr3;
                        i4 = i24;
                        sArr = sArr4;
                        iM45029 = C19806.m45029("ܺ᩹") ^ i14;
                        i = ((iM45029 ^ i15) * (-16597)) ^ 900976442;
                        i5 = 606652232;
                        i3 = iM45029 ^ i5;
                        sArr4 = sArr;
                        sArr3 = sArr2;
                        i24 = i4;
                        checkBox3 = checkBox2;
                        onCheckedChangeListener3 = onCheckedChangeListener2;
                        iOException3 = iOException2;
                        i17 = i3;
                        i16 = i;
                    } else {
                        int iM450220 = (C19806.m45029("ۨ֡") + i14) * (-105);
                        i17 = iM450220 ^ (-1385142098);
                        i16 = ((iM450220 ^ i15) * 9901) ^ 516675264;
                        iOException3 = iOException2;
                    }
                    break;
                case 1239273625:
                case 1959212202:
                    checkBox = checkBox3;
                    onCheckedChangeListener = onCheckedChangeListener3;
                    iOException = iOException3;
                    activityC18293.f58366 = (C13584) C2332.m7083(activityC18293, ThreadFactoryC3888.m11306(strM8640) ^ 2119232728);
                    sArr4 = f58363;
                    i23 = 10;
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM450212 = ThreadFactoryC3888.m11306("᩻ۡ") ^ i15;
                        i11 = ((iM450212 ^ i14) * (-21763)) ^ 1306516188;
                        i12 = -1440030043;
                    } else {
                        iM450212 = (i14 - C19806.m45029("᩵ܿ")) * (-41);
                        i11 = ((iM450212 ^ i15) * 21621) ^ (-1685162);
                        i12 = 76190893;
                    }
                    int i215 = iM450212 ^ i12;
                    onCheckedChangeListener3 = onCheckedChangeListener;
                    iOException3 = iOException;
                    CheckBox checkBox8 = checkBox;
                    i17 = i215;
                    i16 = i11;
                    checkBox3 = checkBox8;
                    break;
                case 1363482668:
                case 1456979625:
                    i21 = 51230;
                    iM450211 = (C19806.m45029("ۚۜ") ^ i15) * (-101);
                    i7 = ((iM450211 ^ i14) * 25487) ^ 1333651853;
                    i8 = -1012016913;
                    i13 = iM450211 ^ i8;
                    sArr4 = sArr4;
                    sArr3 = sArr3;
                    i24 = i24;
                    checkBox3 = checkBox3;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    iOException3 = iOException3;
                    i17 = i13;
                    i16 = i7;
                    activityC18293 = this;
                    break;
                case 1431219469:
                case 1988878489:
                    try {
                        AbstractC20745 abstractC20745M15309 = C5553.m15309(C7105.m18982(this));
                        activityC18293.f58365 = abstractC20745M15309;
                        C6527 c6527 = new C6527(C1460.m5051(abstractC20745M15309));
                        Bitmap bitmapM17738 = c6527.m17738();
                        byte[] ninePatchChunk = bitmapM17738.getNinePatchChunk();
                        C5789 c5789M17732 = c6527.m17732();
                        C1419.m4970(c5789M17732);
                        activityC18293.f58366.m33205(new NinePatchDrawable(getResources(), bitmapM17738, ninePatchChunk, c5789M17732.f19677, null));
                        iM450210 = (ThreadFactoryC3888.m11306("֫ۤ") ^ i15) * (-43);
                        i = ((iM450210 ^ i14) * 32069) ^ (-343915713);
                        i6 = -202372881;
                    } catch (IOException e) {
                        iOException3 = e;
                        iM450210 = (i14 - ThreadFactoryC3888.m11306("۫ۜ")) * 17;
                        i = ((iM450210 ^ i15) * 13579) ^ (-783879017);
                        i6 = 930921071;
                    }
                    i17 = iM450210 ^ i6;
                    i16 = i;
                    break;
                case 1552795601:
                case 1894657464:
                    checkBox3 = checkBox3;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    iOException3 = iOException3;
                    sArr4 = sArr4;
                    C7105.m18992(this);
                    C0526.m2430(activityC18293.f41645, new ViewOnClickListenerC17982(activityC18293, 2));
                    if (C1875.f7103 >= 0) {
                        iM11307 = (i15 - ThreadFactoryC3888.m11306("᩺ᩳ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i9 = ((iM11307 ^ i14) * 9687) ^ (-2137143804);
                        i10 = 499375021;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ۜ᩹") ^ i15) * (-33);
                        i9 = ((iM11307 ^ i14) * (-24221)) ^ (-1060752027);
                        i10 = 1107031741;
                    }
                    int i216 = iM11307 ^ i10;
                    sArr4 = sArr4;
                    checkBox3 = checkBox3;
                    iOException3 = iOException3;
                    i17 = i216;
                    i16 = i9;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    break;
                case 1557592177:
                case 1700144825:
                    i21 = 12459;
                    iM450211 = (C19806.m45029("ۚۜ") ^ i15) * (-101);
                    i7 = ((iM450211 ^ i14) * 25487) ^ 1333651853;
                    i8 = -1012016913;
                    i13 = iM450211 ^ i8;
                    sArr4 = sArr4;
                    sArr3 = sArr3;
                    i24 = i24;
                    checkBox3 = checkBox3;
                    onCheckedChangeListener3 = onCheckedChangeListener3;
                    iOException3 = iOException3;
                    i17 = i13;
                    i16 = i7;
                    activityC18293 = this;
                    break;
                default:
                    C1937.m6279();
                    if (C1377.f5749) {
                        iM450210 = C19806.m45029("᩺ܺ") ^ i15;
                        i = ((iM450210 ^ i14) * (-22411)) ^ (-1587294444);
                        i6 = -1092894008;
                    } else {
                        iM450210 = (i14 - ThreadFactoryC3888.m11306("ۢ᩻")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM450210 ^ i15) * (-4133)) ^ (-1674422547);
                        i6 = 1194371297;
                    }
                    i17 = iM450210 ^ i6;
                    i16 = i;
                    break;
            }
            return;
        }
    }
}
