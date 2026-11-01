package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.֨ܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1FQ */
/* JADX INFO: loaded from: classes3.dex */
public class C1192 extends AbstractC17902 {

    /* JADX INFO: renamed from: ֫᩸ۤ, reason: not valid java name and contains not printable characters */
    private static final short[] f5291 = {9368, 23613, -30741, 20076, -10616, -10617, -10622, -10613, 1668, -1037, -1039, -1046, -1044, -1039, -1046, -1033, -1030, -1066, -1039, -1041, -1034, -1039, -1041, -1040, -1045, -1054, -1102, -1051, -1046, -1041, -1050, -1091, -1091, -1117, -1081, -1044, -1036, -1043, -1041, -1044, -1054, -1049, -1117, -1142, -1041, -1044, -1056, -1054, -1033, -1046, -1044, -1043, -1072, -1077, -1086, -1102, -1142, -1072, -1034, -1056, -1056, -1050, -1040, -1040, -1118, -1142, -1083, -1046, -1041, -1050, -1117, -1072, -1077, -1086, -1102, -1117, -1056, -1045, -1050, -1056, -1048, -1117, -1051, -1054, -1046, -1041, -1050, -1049, -1095, -1117, -1050, -1029, -1037, -1050, -1056, -1033, -1050, -1049, -1090, -1105, -1117, -1052, -1044, -1033, -1090, -1142, -1072, -1050, -1039, -1035, -1050, -1039, -1117, -1039, -1050, -1033, -1034, -1039, -1043, -1050, -1049, -1117, -1077, -1065, -1065, -1069, -1117, -1117, -1142, -1071, -1050, -1049, -1046, -1039, -1050, -1056, -1033, -1117, -1033, -1044, -1117, 2239, -31011, -31056, -24061, -9313, -9332, -9317, -9318, -9344, -9338, -9337, -9305, -9336, -9340, -9332, -9313, -9332, -9317, -9318, -9344, -9338, -9337, -9312, -9337, -9329, -9338, 18757, 17260, 22647, -9271, -21413, 22611, 19853, -23597, -32647, -29392, 1525, 16727, 16728, 16733, 16724, -11678, -16067, 10913};

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f5292 = 0;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f5293 = true;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f5294;

    /* JADX WARN: Code duplicated, block: B:28:0x00ad A[PHI: r4 r14 r15
      0x00ad: PHI (r4v4 int) = (r4v3 int), (r4v2 int) binds: [B:27:0x00ab, B:12:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x00ad: PHI (r14v4 short[]) = (r14v3 short[]), (r14v2 short[]) binds: [B:27:0x00ab, B:12:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x00ad: PHI (r15v4 int) = (r15v3 int), (r15v2 int) binds: [B:27:0x00ab, B:12:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x010a A[PHI: r2 r3
      0x010a: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v3 java.lang.String), (r2v2 java.lang.String), (r2v2 java.lang.String) binds: [B:35:0x0108, B:23:0x008b, B:17:0x006d, B:15:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r3v4 int) = (r3v3 int), (r3v2 int), (r3v2 int), (r3v2 int) binds: [B:35:0x0108, B:23:0x008b, B:17:0x006d, B:15:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x0138 A[PHI: r11 r12 r13
      0x0138: PHI (r11v3 short[]) = (r11v2 short[]), (r11v5 short[]) binds: [B:9:0x005d, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0138: PHI (r12v3 int) = (r12v2 int), (r12v5 int) binds: [B:9:0x005d, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0138: PHI (r13v3 int) = (r13v2 int), (r13v5 int) binds: [B:9:0x005d, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0202 A[PHI: r6 r8 r9
      0x0202: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:56:0x0200, B:48:0x01c4, B:31:0x00e2] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:56:0x0200, B:48:0x01c4, B:31:0x00e2] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short) binds: [B:56:0x0200, B:48:0x01c4, B:31:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0250 A[PHI: r7 r16 r21
      0x0250: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:64:0x024e, B:60:0x0232, B:52:0x01e3, B:15:0x0069, B:12:0x0063, B:9:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:64:0x024e, B:60:0x0232, B:52:0x01e3, B:15:0x0069, B:12:0x0063, B:9:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r21v5 char) = (r21v3 char), (r21v4 char), (r21v3 char), (r21v3 char), (r21v3 char), (r21v3 char) binds: [B:64:0x024e, B:60:0x0232, B:52:0x01e3, B:15:0x0069, B:12:0x0063, B:9:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        int iM45029;
        int i;
        int i2;
        int i3 = C7105.f23796;
        int i4 = C2124.f7782;
        int iM11306 = ThreadFactoryC3888.m11306("۬᩷") ^ i4;
        int i5 = ((iM11306 ^ i3) * 19645) ^ (-1026990714);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM11306 ^ 2099271709;
        String strM3747 = null;
        int iM450210 = 0;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1952993084;
        char c = 0;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i3) * (-21629)) >> 31));
            switch (i14) {
                case -1963572428:
                case -161541045:
                    strM3747 = C0962.m3747(sArr3, i13, i7, i10);
                    if (C2477.f9839 <= 0) {
                        iM45029 = C19806.m45029("ܳܿ") ^ i3;
                        i = ((iM45029 ^ i4) * (-5295)) ^ (-1570175846);
                        i2 = 849039879;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ۛ") ^ i4;
                        i = ((iM45029 ^ i3) * 20471) ^ 1889536157;
                        i2 = -482615081;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1814703317:
                case 74850682:
                    if (C0629.f2722 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ۚ") ^ i3) * (-37);
                        i = ((iM45029 ^ i4) * (-8247)) ^ 948876164;
                        i2 = 1926695102;
                    } else {
                        iM45029 = C19806.m45029("۫᩹") ^ i4;
                        i = ((iM45029 ^ i3) * (-18515)) ^ 1815385233;
                        i2 = 1614871438;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1801233000:
                case -1095073371:
                    C0216.m1581(this, m41569(strM3747));
                    mo21455(0);
                    break;
                case -1712607583:
                case 589088623:
                    sArr3 = f5291;
                    i13 = 4;
                    i7 = 4;
                    if (C1419.f5860 >= 0) {
                        iM45029 = C19806.m45029("۫᩹") ^ i4;
                        i = ((iM45029 ^ i3) * (-18515)) ^ 1815385233;
                        i2 = 1614871438;
                    } else {
                        iM45029 = C19806.m45029("ۧܿ") ^ i4;
                        i = ((iM45029 ^ i3) * 20195) ^ 1407147435;
                        i2 = -43182073;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1662027694:
                case 598853922:
                    i10 = 37839;
                    iM45029 = (C19806.m45029("ۨ᩵") ^ i4) * 59;
                    i = ((iM45029 ^ i3) * 25989) ^ (-194592249);
                    i2 = 489081068;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1627260092:
                case 222767500:
                    C0050.m934(this, 2097252576 ^ iM450210);
                    if (C2704.f10408) {
                        iM45029 = (C19806.m45029("᩷᩸") + i3) * 79;
                        i = ((iM45029 ^ i4) * (-1389)) ^ (-1497634321);
                        i2 = -334492079;
                    } else {
                        iM45029 = C19806.m45029("ᩴۡ") ^ i3;
                        i = ((iM45029 ^ i4) * (-6811)) ^ (-226218748);
                        i2 = -665603534;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1466893895:
                case 305454576:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ۚ") ^ i3) * (-37);
                        i = ((iM45029 ^ i4) * (-8247)) ^ 948876164;
                        i2 = 1926695102;
                    } else {
                        iM45029 = C19806.m45029("ۖۛ") ^ i4;
                        i = ((iM45029 ^ i3) * 4303) ^ 108330686;
                        i2 = -464613403;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1119042377:
                case 1694943373:
                    i8 = s * 2;
                    if (C10634.f36300 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ۚ") ^ i3) * (-37);
                        i = ((iM45029 ^ i4) * (-8247)) ^ 948876164;
                        i2 = 1926695102;
                    } else {
                        iM45029 = C19806.m45029("ۛ۬") ^ i4;
                        i = ((iM45029 ^ i3) * 29145) ^ (-447064877);
                        i2 = 524858412;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -873446872:
                case 180039453:
                    sArr = f5291;
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ۚ") ^ i3) * (-37);
                        i = ((iM45029 ^ i4) * (-8247)) ^ 948876164;
                        i2 = 1926695102;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ۤ᩺")) * (-31);
                        i = ((iM45029 ^ i3) * 26051) ^ 638031526;
                        i2 = 1675175242;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -841349020:
                case -476425479:
                    RunnableC1895.m6170();
                    iM45029 = C19806.m45029("ܳܿ") ^ i3;
                    i = ((iM45029 ^ i4) * (-5295)) ^ (-1570175846);
                    i2 = 849039879;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -539390856:
                case 400264555:
                    if (RunnableC1895.f7152) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ۚ") ^ i3) * (-37);
                        i = ((iM45029 ^ i4) * (-8247)) ^ 948876164;
                        i2 = 1926695102;
                    } else {
                        iM45029 = C19806.m45029("ܳܿ") ^ i3;
                        i = ((iM45029 ^ i4) * (-5295)) ^ (-1570175846);
                        i2 = 849039879;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -464451355:
                case 1683372555:
                    iM450210 = C19806.m45029(C1977.m6363(sArr2, i11, i12, i10));
                    if (C1977.f7413 <= 0) {
                        iM45029 = C19806.m45029("ܳܿ") ^ i3;
                        i = ((iM45029 ^ i4) * (-5295)) ^ (-1570175846);
                        i2 = 849039879;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۢۡ")) * (-35);
                        i = ((iM45029 ^ i4) * (-795)) ^ (-1473966321);
                        i2 = -882406284;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -424106272:
                case 1471716991:
                    s = sArr[c];
                    if (C19806.f63586) {
                        iM45029 = C19806.m45029("ᩴۡ") ^ i3;
                        i = ((iM45029 ^ i4) * (-6811)) ^ (-226218748);
                        i2 = -665603534;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ᩵") + i3) * (-51);
                        i = ((iM45029 ^ i4) * (-10037)) ^ (-1417034230);
                        i2 = -925383146;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -409013729:
                case 1176494167:
                    c = 0;
                    if (C0797.f3386) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ۚ") ^ i3) * (-37);
                        i = ((iM45029 ^ i4) * (-8247)) ^ 948876164;
                        i2 = 1926695102;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ᩵") ^ i3;
                        i = ((iM45029 ^ i4) * 24349) ^ (-1941680778);
                        i2 = -1646517175;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -117448380:
                case 1962284566:
                    C1066.m4023();
                    RunnableC1895.m6170();
                    break;
                case 221982609:
                case 587930856:
                    i10 = 55022;
                    iM45029 = (C19806.m45029("ۨ᩵") ^ i4) * 59;
                    i = ((iM45029 ^ i3) * 25989) ^ (-194592249);
                    i2 = 489081068;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 307374216:
                case 1758718294:
                    i9 = i8 + 1;
                    s2 = 1;
                    if (C3743.f13569) {
                        iM45029 = (C19806.m45029("֫۬") ^ i4) * 3;
                        i = ((iM45029 ^ i3) * 26101) ^ 476743473;
                        i2 = 603876337;
                    } else {
                        iM45029 = C19806.m45029("ᩴۡ") ^ i3;
                        i = ((iM45029 ^ i4) * (-6811)) ^ (-226218748);
                        i2 = -665603534;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1160772111:
                case 1507765307:
                    int i15 = s + s2;
                    if (i9 - (i15 * i15) <= 0) {
                        iM45029 = C19806.m45029("᩶ۛ") ^ i3;
                        i = ((iM45029 ^ i4) * 8059) ^ (-961829886);
                        i2 = -950255205;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۤۢ")) * (-97);
                        i = ((iM45029 ^ i4) * 7621) ^ 2140371972;
                        i2 = -861913923;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    sArr2 = f5291;
                    i11 = 1;
                    i12 = 3;
                    if (C1937.m6279() >= 0) {
                        iM45029 = C19806.m45029("ۖۛ") ^ i4;
                        i = ((iM45029 ^ i3) * 4303) ^ 108330686;
                        i2 = -464613403;
                    } else {
                        iM45029 = C19806.m45029("ᩳᩳ") ^ i4;
                        i = ((iM45029 ^ i3) * 25541) ^ 1680958394;
                        i2 = 332329568;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final DialogInterfaceC19356 mo2981(AbstractActivityC12483 abstractActivityC12483) {
        int iM45029;
        int i;
        int i2;
        int i3;
        int i4;
        StringBuilder sb;
        int i5;
        int i6;
        boolean z;
        String strM9788;
        String str;
        short[] sArr;
        int i7;
        int i8;
        int iM450210;
        int i9;
        int iM11306;
        int i10;
        int i11;
        int i12;
        int i13;
        int iM11307;
        String str2;
        StringBuilder sb2;
        int iM450211;
        int i14;
        int i15;
        final C1192 c1192 = this;
        int iM450212 = 0;
        boolean z2 = false;
        C8067 c8067 = null;
        Object obj = null;
        DialogInterface.OnClickListener onClickListener = null;
        DialogInterfaceC19356 dialogInterfaceC19356M8239 = null;
        final DialogInterfaceC19356 dialogInterfaceC19356M32610 = null;
        Button buttonM5052 = null;
        final Button buttonM4897 = null;
        String strM6918 = null;
        int iM450213 = 0;
        int iM450214 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1871248003;
        int i19 = C0050.f912;
        int i20 = C3722.f13525;
        int iM11308 = (ThreadFactoryC3888.m11306("ᩴᩴ") ^ i20) * (-49);
        int i21 = ((iM11308 ^ i19) * (-30449)) ^ (-2141241782);
        int i22 = iM11308 ^ (-805197738);
        String strM41585 = null;
        String str3 = null;
        String strM41586 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        boolean z3 = false;
        int i23 = 0;
        boolean z4 = false;
        short s = 0;
        int i24 = 0;
        int i25 = 0;
        StringBuilder sb3 = null;
        int i26 = 0;
        String str4 = null;
        C9186 c9186M41568 = null;
        while (true) {
            i18 = i22 ^ (i21 & (((i18 ^ i19) * 13429) >> 31));
            switch (i18) {
                case -2009807529:
                case 1857251098:
                    iM450212 = iM450212;
                    short[] sArr4 = sArr3;
                    sb2 = sb3;
                    C1148.m4223(sb2, C1025.m3859(sArr4, i26, 1, i23));
                    C1148.m4223(sb2, strM41585);
                    c8067.m21277(C0817.m3407(sb2));
                    String str5 = strM41586;
                    C1875.m6095(c8067, str5);
                    if (!C0797.m3359()) {
                        strM41586 = str5;
                        z2 = z2 ? 1 : 0;
                        sb = sb2;
                        str3 = str3;
                        str4 = str4;
                        i24 = i24;
                        i25 = i25;
                        sArr3 = sArr4;
                        iM450210 = (C19806.m45029("ۧۢ") + i20) * 7;
                        i21 = ((iM450210 ^ i19) * (-2269)) ^ 441384843;
                        i9 = -1033674218;
                        i22 = iM450210 ^ i9;
                        c1192 = this;
                        i25 = i25;
                        i24 = i24;
                        iM450212 = iM450212;
                        z2 = z2;
                        sArr3 = sArr3;
                        str4 = str4;
                        str3 = str3;
                        String str6 = strM41586;
                        sb3 = sb;
                        strM41586 = str6;
                    } else {
                        int iM450215 = (i20 - C19806.m45029("ۨۙ")) * (-97);
                        i21 = ((iM450215 ^ i19) * 16945) ^ 42957639;
                        i22 = iM450215 ^ (-1244054421);
                        sArr3 = sArr4;
                        strM41586 = str5;
                        iM450212 = iM450212;
                        sb3 = sb2;
                    }
                    break;
                case -1860193849:
                case 75398899:
                    str3 = str3;
                    sb = sb3;
                    boolean z5 = c1192.f5293;
                    strM6918 = C2249.m6918(f5291, 142, 3, i23);
                    int iM450216 = C19806.m45029("ۡ᩷") ^ i19;
                    i10 = ((iM450216 ^ i20) * 405) ^ 2140428085;
                    i22 = iM450216 ^ (-1885146674);
                    c1192 = this;
                    z4 = z5;
                    i21 = i10;
                    i25 = i25;
                    i24 = i24;
                    iM450212 = iM450212;
                    z2 = z2;
                    sArr3 = sArr3;
                    str4 = str4;
                    str3 = str3;
                    String str7 = strM41586;
                    sb3 = sb;
                    strM41586 = str7;
                    break;
                case -1747851549:
                case -1422812715:
                    return dialogInterfaceC19356M32610;
                case -1581167567:
                case 2131784669:
                    i5 = iM450212;
                    str2 = str4;
                    sb2 = sb3;
                    strM41586 = strM41586;
                    C1148.m4223(sb2, str2);
                    sArr3 = f5291;
                    if (C1066.m4023() > 0) {
                        int iM11309 = ThreadFactoryC3888.m11306("ۘᩳ") ^ i20;
                        i22 = iM11309 ^ 1271774811;
                        str4 = str2;
                        i21 = ((iM11309 ^ i19) * (-14541)) ^ (-538743797);
                        strM41586 = strM41586;
                        iM450212 = i5;
                        i26 = 170;
                        sb3 = sb2;
                    } else {
                        sb = sb2;
                        i26 = 170;
                        int iM113010 = (ThreadFactoryC3888.m11306("᩵֨") + i19) * 91;
                        i22 = iM113010 ^ (-553527446);
                        str4 = str2;
                        i21 = ((iM113010 ^ i20) * 16593) ^ 1349063528;
                        iM450212 = i5;
                        String str8 = strM41586;
                        sb3 = sb;
                        strM41586 = str8;
                    }
                    break;
                case -1505709924:
                case 1872909031:
                    if (!RunnableC0195.m1443(dialogInterfaceC19356M32610)) {
                        str3 = str3;
                        str4 = str4;
                        sArr3 = sArr3;
                        i3 = i24;
                        i4 = i25;
                        StringBuilder sb4 = sb3;
                        strM41586 = strM41586;
                        sb = sb4;
                        int iM113011 = (ThreadFactoryC3888.m11306("ۜܳ") ^ i20) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i22 = iM113011 ^ (-1505242524);
                        i21 = ((iM113011 ^ i19) * 11615) ^ 1164725738;
                        i25 = i4;
                        i24 = i3;
                        iM450212 = iM450212;
                        sArr3 = sArr3;
                        str4 = str4;
                        str3 = str3;
                        String str9 = strM41586;
                        sb3 = sb;
                        strM41586 = str9;
                    } else {
                        iM45029 = C19806.m45029("᩺ᩳ") ^ i20;
                        i = ((iM45029 ^ i19) * (-28157)) ^ 1854062360;
                        i2 = 70049454;
                        i22 = iM45029 ^ i2;
                        i21 = i;
                    }
                    break;
                case -1407367537:
                case 2119807452:
                    i5 = iM450212;
                    iM450213 = C19806.m45029(C3743.m10964(f5291, 171, 3, i23));
                    iM450211 = ThreadFactoryC3888.m11306("᩺᩵") ^ i19;
                    i14 = ((iM450211 ^ i20) * 19313) ^ (-1705132741);
                    i15 = 660691954;
                    i22 = iM450211 ^ i15;
                    i21 = i14;
                    iM450212 = i5;
                    break;
                case -1397356876:
                case 200845830:
                    c1192.f5293 = z2;
                    dialogInterfaceC19356M32610 = C13188.m32610();
                    if (dialogInterfaceC19356M32610 == null) {
                        str3 = str3;
                        str4 = str4;
                        sArr3 = sArr3;
                        i3 = i24;
                        i4 = i25;
                        StringBuilder sb5 = sb3;
                        strM41586 = strM41586;
                        sb = sb5;
                        int iM113012 = (ThreadFactoryC3888.m11306("ۜܳ") ^ i20) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i22 = iM113012 ^ (-1505242524);
                        i21 = ((iM113012 ^ i19) * 11615) ^ 1164725738;
                        i25 = i4;
                        i24 = i3;
                        iM450212 = iM450212;
                        sArr3 = sArr3;
                        str4 = str4;
                        str3 = str3;
                        String str10 = strM41586;
                        sb3 = sb;
                        strM41586 = str10;
                    } else {
                        iM45029 = C19806.m45029("᩶ۛ") ^ i19;
                        i = ((iM45029 ^ i20) * 28931) ^ 758839599;
                        i2 = -362212774;
                        i22 = iM45029 ^ i2;
                        i21 = i;
                    }
                    break;
                case -1336797300:
                case -280778679:
                    RunnableC1895.m6170();
                    C3286.m9798();
                    i5 = iM450212;
                    iM450211 = (i19 - ThreadFactoryC3888.m11306("ܰ۠")) * 89;
                    i14 = ((iM450211 ^ i20) * (-13823)) ^ (-1026451291);
                    i15 = -1059624843;
                    i22 = iM450211 ^ i15;
                    i21 = i14;
                    iM450212 = i5;
                    break;
                case -1163342386:
                case 1918388490:
                    C2704.m8255();
                    return null;
                case -1014462565:
                case 509044629:
                    str3 = str3;
                    str4 = str4;
                    sArr3 = sArr3;
                    i3 = i24;
                    i4 = i25;
                    StringBuilder sb6 = sb3;
                    strM41586 = strM41586;
                    sb = sb6;
                    iM450212 = 2122031621 ^ C19806.m45029(strM6918);
                    if (z4) {
                        int iM450217 = (C19806.m45029("᩹ۜ") + i20) * 49;
                        i22 = iM450217 ^ 641711819;
                        i21 = ((iM450217 ^ i19) * (-4721)) ^ (-1250304512);
                        i25 = i4;
                        i24 = i3;
                        z2 = false;
                    } else {
                        z2 = false;
                        int iM113013 = (ThreadFactoryC3888.m11306("ۜܳ") ^ i20) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i22 = iM113013 ^ (-1505242524);
                        i21 = ((iM113013 ^ i19) * 11615) ^ 1164725738;
                        i25 = i4;
                        i24 = i3;
                        iM450212 = iM450212;
                    }
                    sArr3 = sArr3;
                    str4 = str4;
                    str3 = str3;
                    String str11 = strM41586;
                    sb3 = sb;
                    strM41586 = str11;
                    break;
                case -1004866843:
                case -530800546:
                    if (C1937.f7317 < 0) {
                        i6 = iM450212;
                        z = z2 ? 1 : 0;
                        strM9788 = str3;
                        str = str4;
                        sArr = sArr3;
                        i7 = i24;
                        i8 = i25;
                        StringBuilder sb7 = sb3;
                        strM41586 = strM41586;
                        sb = sb7;
                        iM11307 = ThreadFactoryC3888.m11306("᩸ۘ") ^ i20;
                        i13 = ((iM11307 ^ i19) * 2249) ^ (-689516493);
                        i12 = 1866088343;
                        i22 = iM11307 ^ i12;
                        i25 = i8;
                        i24 = i7;
                        iM450212 = i6;
                        sArr3 = sArr;
                        str4 = str;
                        str3 = strM9788;
                        i21 = i13;
                        z2 = z;
                        String str12 = strM41586;
                        sb3 = sb;
                        strM41586 = str12;
                    } else {
                        iM45029 = C19806.m45029("ܽ֨") ^ i20;
                        i = ((iM45029 ^ i19) * 30749) ^ 796009071;
                        i2 = -901940840;
                        i22 = iM45029 ^ i2;
                        i21 = i;
                    }
                    break;
                case -884238632:
                case -766759080:
                    C1461.m5080();
                    if (C2642.f10294 > 0) {
                        iM45029 = C19806.m45029("ܽ֨") ^ i20;
                        i = ((iM45029 ^ i19) * 30749) ^ 796009071;
                        i2 = -901940840;
                        i22 = iM45029 ^ i2;
                        i21 = i;
                    } else {
                        i5 = iM450212;
                        iM450211 = (i19 - ThreadFactoryC3888.m11306("ܰ۠")) * 89;
                        i14 = ((iM450211 ^ i20) * (-13823)) ^ (-1026451291);
                        i15 = -1059624843;
                        i22 = iM450211 ^ i15;
                        i21 = i14;
                        iM450212 = i5;
                    }
                    break;
                case -827946549:
                case -377934905:
                    sb = sb3;
                    i23 = 56297;
                    iM450210 = (ThreadFactoryC3888.m11306("۫ۧ") + i20) * (-61);
                    i21 = ((iM450210 ^ i19) * 17827) ^ (-215519273);
                    i9 = 348753105;
                    i22 = iM450210 ^ i9;
                    c1192 = this;
                    i25 = i25;
                    i24 = i24;
                    iM450212 = iM450212;
                    z2 = z2;
                    sArr3 = sArr3;
                    str4 = str4;
                    str3 = str3;
                    String str13 = strM41586;
                    sb3 = sb;
                    strM41586 = str13;
                    break;
                case -811542541:
                case 1799916842:
                    i5 = iM450212;
                    obj = null;
                    C1460.m5055(c8067, iM450213 ^ 2126763945, null);
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM450211 = (i19 - ThreadFactoryC3888.m11306("᩺᩸")) * 11;
                        i14 = ((iM450211 ^ i20) * (-31497)) ^ (-327904152);
                        i15 = 2032799784;
                    } else {
                        iM450211 = (i19 - ThreadFactoryC3888.m11306("ܰ۠")) * 89;
                        i14 = ((iM450211 ^ i20) * (-13823)) ^ (-1026451291);
                        i15 = -1059624843;
                    }
                    i22 = iM450211 ^ i15;
                    i21 = i14;
                    iM450212 = i5;
                    break;
                case -710207967:
                case 36480409:
                    C7105.m18983(c9186M41568, dialogInterfaceC19356M32610, new InterfaceC10597() { // from class: l.ۨܶۘ

                        /* JADX INFO: renamed from: ۧۘۙ, reason: not valid java name and contains not printable characters */
                        private static final short[] f39527 = {4570, 12094};

                        @Override // l.InterfaceC10597
                        /* JADX INFO: renamed from: ۙ */
                        public final void mo1473(Object obj2) {
                            int iM113014;
                            int i27;
                            int i28;
                            StringBuilder sb8;
                            int iM113015;
                            int i29;
                            AbstractC17902 abstractC17902 = null;
                            String strM5502 = null;
                            short[] sArr5 = null;
                            char c = 0;
                            short s2 = 0;
                            int i30 = 0;
                            int i31 = 0;
                            short s3 = 0;
                            int i32 = 0;
                            short[] sArr6 = null;
                            int i33 = -11859416;
                            int i34 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
                            int i35 = C1148.f5161;
                            int iM450218 = C19806.m45029("ܿۤ") ^ i34;
                            int i36 = ((iM450218 ^ i35) * (-6497)) ^ 650380311;
                            int i37 = iM450218 ^ (-1093273857);
                            while (true) {
                                StringBuilder sb9 = null;
                                while (true) {
                                    i33 = ((((i33 ^ i35) * (-14389)) >> 31) & i36) ^ i37;
                                    switch (i33) {
                                        case -2080690515:
                                        case -207067582:
                                            C1377.m4833();
                                            break;
                                        case -1832213786:
                                        case 599791807:
                                            i32 = 47960;
                                            iM113014 = C19806.m45029("ۙ᩵") ^ i34;
                                            i27 = ((iM113014 ^ i35) * (-3551)) ^ 2112621586;
                                            i28 = 151633535;
                                            i37 = iM113014 ^ i28;
                                            abstractC17902 = abstractC17902;
                                            sb9 = sb9;
                                            i36 = i27;
                                            break;
                                        case -1815965916:
                                        case 491289794:
                                            i32 = 12059;
                                            iM113014 = C19806.m45029("ۙ᩵") ^ i34;
                                            i27 = ((iM113014 ^ i35) * (-3551)) ^ 2112621586;
                                            i28 = 151633535;
                                            i37 = iM113014 ^ i28;
                                            abstractC17902 = abstractC17902;
                                            sb9 = sb9;
                                            i36 = i27;
                                            break;
                                        case -1793722742:
                                        case 1078959440:
                                            abstractC17902 = (AbstractC17902) obj2;
                                            int i38 = C1192.f5292;
                                            if (C1419.f5860 < 0) {
                                                sb9 = new StringBuilder();
                                                if (C3577.m10565()) {
                                                    iM113015 = ThreadFactoryC3888.m11306("᩺᩻") ^ i35;
                                                    i36 = ((iM113015 ^ i34) * (-17565)) ^ (-2125386008);
                                                    i29 = -1628807403;
                                                } else {
                                                    iM113015 = C19806.m45029("ۗ֡") ^ i35;
                                                    i36 = ((iM113015 ^ i34) * 21301) ^ (-1746400231);
                                                    i29 = -1944329713;
                                                }
                                                i37 = iM113015 ^ i29;
                                            }
                                            break;
                                        case -1455312898:
                                        case 1654771896:
                                            sb9 = sb9;
                                            abstractC17902 = abstractC17902;
                                            s2 = sArr5[c];
                                            i30 = s2 * s2;
                                            if (C2249.f8050 < 0) {
                                                iM113014 = (ThreadFactoryC3888.m11306("ۘ᩹") ^ i35) * q.h;
                                                i27 = ((iM113014 ^ i34) * 5845) ^ 1929262290;
                                                i28 = -1376659287;
                                                i37 = iM113014 ^ i28;
                                                abstractC17902 = abstractC17902;
                                                sb9 = sb9;
                                                i36 = i27;
                                            } else {
                                                abstractC17902 = abstractC17902;
                                            }
                                            break;
                                        case -1308186810:
                                        case -876581411:
                                            sb9 = sb9;
                                            abstractC17902 = abstractC17902;
                                            if ((s2 * s3) - i31 <= 0) {
                                                iM113014 = ThreadFactoryC3888.m11306("ۛۤ") ^ i35;
                                                i27 = ((iM113014 ^ i34) * (-1677)) ^ 1973944545;
                                                i28 = 1660680780;
                                            } else {
                                                iM113014 = C19806.m45029("ܰܺ") ^ i35;
                                                i27 = ((iM113014 ^ i34) * 23703) ^ 273978891;
                                                i28 = -310830837;
                                            }
                                            i37 = iM113014 ^ i28;
                                            abstractC17902 = abstractC17902;
                                            sb9 = sb9;
                                            i36 = i27;
                                            break;
                                        case -1286397298:
                                        case 1648720560:
                                            sb9 = sb9;
                                            C2788.m8480(sb9, strM5502);
                                            if (C3660.f13403 >= 0) {
                                                abstractC17902 = abstractC17902;
                                                iM113014 = (ThreadFactoryC3888.m11306("ᩴۗ") ^ i34) * (-35);
                                                i27 = ((iM113014 ^ i35) * 27395) ^ 1605210969;
                                                i28 = 463843947;
                                                i37 = iM113014 ^ i28;
                                                abstractC17902 = abstractC17902;
                                            } else {
                                                int iM450219 = C19806.m45029("ᩴ֨") ^ i34;
                                                i27 = ((iM450219 ^ i35) * (-15649)) ^ 2117934652;
                                                i37 = iM450219 ^ 1994359618;
                                            }
                                            sb9 = sb9;
                                            i36 = i27;
                                            break;
                                        case -952881325:
                                        case -431238794:
                                            sb9 = sb9;
                                            abstractC17902 = abstractC17902;
                                            c = 0;
                                            if (ThreadFactoryC3888.f14547 <= 0) {
                                                iM113014 = C19806.m45029("ܶۙ") ^ i35;
                                                i27 = ((iM113014 ^ i34) * (-17485)) ^ (-644151285);
                                                i28 = -1334714809;
                                            } else {
                                                iM113014 = ThreadFactoryC3888.m11306("۟ۖ") ^ i34;
                                                i27 = ((iM113014 ^ i35) * (-5615)) ^ 1512733845;
                                                i28 = -536364614;
                                            }
                                            i37 = iM113014 ^ i28;
                                            abstractC17902 = abstractC17902;
                                            sb9 = sb9;
                                            i36 = i27;
                                            break;
                                        case -809343549:
                                        case 1385444061:
                                            C3535.m10431();
                                            if (!C3743.f13569) {
                                            }
                                            int iM113016 = (i34 - ThreadFactoryC3888.m11306("᩶ۛ")) * (-17);
                                            i36 = ((iM113016 ^ i35) * 31381) ^ (-547917552);
                                            i37 = iM113016 ^ 267354333;
                                            break;
                                        case -713914674:
                                        case -463549132:
                                            C0526.m2437();
                                            if (C2477.f9839 <= 0) {
                                                int iM113017 = (i34 - ThreadFactoryC3888.m11306("᩶ۛ")) * (-17);
                                                i36 = ((iM113017 ^ i35) * 31381) ^ (-547917552);
                                                i37 = iM113017 ^ 267354333;
                                            } else {
                                                iM113015 = C19806.m45029("ۗ֡") ^ i35;
                                                i36 = ((iM113015 ^ i34) * 21301) ^ (-1746400231);
                                                i29 = -1944329713;
                                                i37 = iM113015 ^ i29;
                                            }
                                            break;
                                        case -683381980:
                                        case -514175565:
                                            sb9 = sb9;
                                            C2124.m6683(sb9, abstractC17902.m41564());
                                            sArr6 = f39527;
                                            if (C1025.f4800 < 0) {
                                                int iM113018 = ThreadFactoryC3888.m11306("ᩳ᩶") ^ i34;
                                                AbstractC17902 abstractC17903 = abstractC17902;
                                                i37 = iM113018 ^ 418031251;
                                                sb8 = sb9;
                                                i36 = ((iM113018 ^ i35) * 19113) ^ (-239008641);
                                                abstractC17902 = abstractC17903;
                                                sb9 = sb8;
                                            } else {
                                                abstractC17902 = abstractC17902;
                                                iM113014 = C19806.m45029("ܶۙ") ^ i35;
                                                i27 = ((iM113014 ^ i34) * (-17485)) ^ (-644151285);
                                                i28 = -1334714809;
                                                i37 = iM113014 ^ i28;
                                                abstractC17902 = abstractC17902;
                                                sb9 = sb9;
                                                i36 = i27;
                                            }
                                            break;
                                        case -523593253:
                                        case 191679111:
                                            C0962.m3746();
                                            C1460.m5050();
                                            iM113015 = C19806.m45029("ۗ֡") ^ i35;
                                            i36 = ((iM113015 ^ i34) * 21301) ^ (-1746400231);
                                            i29 = -1944329713;
                                            i37 = iM113015 ^ i29;
                                            break;
                                        case -451879855:
                                        case -141304599:
                                            sb9 = sb9;
                                            abstractC17902 = abstractC17902;
                                            if (C0797.f3386) {
                                                iM113014 = (ThreadFactoryC3888.m11306("ᩴۗ") ^ i34) * (-35);
                                                i27 = ((iM113014 ^ i35) * 27395) ^ 1605210969;
                                                i28 = 463843947;
                                            } else {
                                                iM113014 = ThreadFactoryC3888.m11306("ᩳۡ") ^ i34;
                                                i27 = ((iM113014 ^ i35) * 887) ^ 127166284;
                                                i28 = 1650519974;
                                            }
                                            i37 = iM113014 ^ i28;
                                            abstractC17902 = abstractC17902;
                                            sb9 = sb9;
                                            i36 = i27;
                                            break;
                                        case -145796729:
                                        case 1992821268:
                                            sb9 = sb9;
                                            abstractC17902 = abstractC17902;
                                            i31 = i30 + 156250000;
                                            s3 = 25000;
                                            if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                                                iM113014 = C19806.m45029("ۙۢ") ^ i34;
                                                i27 = ((iM113014 ^ i35) * (-3719)) ^ (-482287250);
                                                i28 = -79646212;
                                                i37 = iM113014 ^ i28;
                                                abstractC17902 = abstractC17902;
                                                sb9 = sb9;
                                                i36 = i27;
                                            } else {
                                                abstractC17902 = abstractC17902;
                                                sb9 = sb9;
                                                iM113015 = C19806.m45029("ۗ֡") ^ i35;
                                                i36 = ((iM113015 ^ i34) * 21301) ^ (-1746400231);
                                                i29 = -1944329713;
                                                i37 = iM113015 ^ i29;
                                            }
                                            break;
                                        case 88433203:
                                        case 1370432867:
                                            StringBuilder sb10 = sb9;
                                            strM5502 = CallableC1627.m5502(sArr6, 1, 1, i32);
                                            if (!C0817.f3443) {
                                            }
                                            int iM113019 = (i35 - ThreadFactoryC3888.m11306("ۖ֨")) * 123;
                                            i37 = iM113019 ^ 947973735;
                                            sb8 = sb10;
                                            i36 = ((iM113019 ^ i34) * (-9837)) ^ (-523977166);
                                            strM5502 = strM5502;
                                            sb9 = sb8;
                                            break;
                                            break;
                                        case 723851515:
                                        case 1545139649:
                                            sb9 = sb9;
                                            abstractC17902 = abstractC17902;
                                            sArr5 = f39527;
                                            if (!RunnableC1895.f7152) {
                                                abstractC17902 = abstractC17902;
                                                sb9 = sb9;
                                                iM113015 = C19806.m45029("ۗ֡") ^ i35;
                                                i36 = ((iM113015 ^ i34) * 21301) ^ (-1746400231);
                                                i29 = -1944329713;
                                                i37 = iM113015 ^ i29;
                                            } else {
                                                iM113014 = (ThreadFactoryC3888.m11306("֫᩹") + i35) * (-53);
                                                i27 = ((iM113014 ^ i34) * 15959) ^ 813794697;
                                                i28 = 1216847092;
                                                i37 = iM113014 ^ i28;
                                                abstractC17902 = abstractC17902;
                                                sb9 = sb9;
                                                i36 = i27;
                                            }
                                            break;
                                        case 1067087717:
                                        case 1650865945:
                                            C1461.m5083(buttonM4897, C2124.m6674(sb9));
                                            break;
                                        default:
                                            C2871.m8646();
                                            if (!C1377.f5749) {
                                                iM113015 = C19806.m45029("ۗ֡") ^ i35;
                                                i36 = ((iM113015 ^ i34) * 21301) ^ (-1746400231);
                                                i29 = -1944329713;
                                                i37 = iM113015 ^ i29;
                                            } else {
                                                sb9 = sb9;
                                                abstractC17902 = abstractC17902;
                                                iM113014 = (ThreadFactoryC3888.m11306("ᩴۗ") ^ i34) * (-35);
                                                i27 = ((iM113014 ^ i35) * 27395) ^ 1605210969;
                                                i28 = 463843947;
                                                i37 = iM113014 ^ i28;
                                                abstractC17902 = abstractC17902;
                                                sb9 = sb9;
                                                i36 = i27;
                                            }
                                            break;
                                    }
                                    return;
                                }
                                int iM113020 = ThreadFactoryC3888.m11306("ܺ᩷") ^ i35;
                                i36 = ((iM113020 ^ i34) * 32511) ^ (-1182185715);
                                i37 = iM113020 ^ (-1678939474);
                            }
                        }
                    });
                    if (((AbstractActivityC12483) C8703.m22527(dialogInterfaceC19356M32610.m44363())) != abstractActivityC12483) {
                        str3 = str3;
                        str4 = str4;
                        sArr3 = sArr3;
                        i3 = i24;
                        i4 = i25;
                        StringBuilder sb8 = sb3;
                        strM41586 = strM41586;
                        sb = sb8;
                        int iM113014 = (ThreadFactoryC3888.m11306("ۜܳ") ^ i20) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i22 = iM113014 ^ (-1505242524);
                        i21 = ((iM113014 ^ i19) * 11615) ^ 1164725738;
                        i25 = i4;
                        i24 = i3;
                        iM450212 = iM450212;
                        sArr3 = sArr3;
                        str4 = str4;
                        str3 = str3;
                        String str14 = strM41586;
                        sb3 = sb;
                        strM41586 = str14;
                    } else {
                        iM45029 = (i20 - C19806.m45029("۫᩸")) * (-53);
                        i = ((iM45029 ^ i19) * (-28453)) ^ 431276658;
                        i2 = -1430145524;
                        i22 = iM45029 ^ i2;
                        i21 = i;
                    }
                    break;
                case -638437235:
                case 1176209378:
                    C1066.m4025(c8067, iM450214 ^ 2128395869, onClickListener);
                    C1066.m4034(c8067, iM450212, obj);
                    dialogInterfaceC19356M8239 = C2704.m8239(c8067);
                    iM45029 = C19806.m45029("ۛ۬") ^ i19;
                    i = ((iM45029 ^ i20) * (-11035)) ^ (-1513803110);
                    i2 = 1303026892;
                    i22 = iM45029 ^ i2;
                    i21 = i;
                    break;
                case -562240113:
                case -424483307:
                    String str15 = str3;
                    String str16 = str4;
                    short[] sArr5 = sArr3;
                    strM41586 = c1192.m41585(str15);
                    C8067 c8067M3751 = C0962.m3751(abstractActivityC12483);
                    ThreadFactoryC3888.m11299(c8067M3751, z2);
                    sb3 = new StringBuilder();
                    int iM450218 = C19806.m45029("ᩳ۬") ^ i20;
                    i21 = ((iM450218 ^ i19) * 29523) ^ (-409560125);
                    i22 = iM450218 ^ (-701244631);
                    i24 = i24;
                    i25 = i25;
                    sArr3 = sArr5;
                    iM450212 = iM450212;
                    str4 = str16;
                    str3 = str15;
                    c8067 = c8067M3751;
                    break;
                case -496137367:
                case 165731089:
                    str3 = str3;
                    sb = sb3;
                    int i27 = i16 + i17;
                    short s2 = s;
                    int i28 = s2 + 15917;
                    if ((i28 * i28) - (i27 + i27) <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡܳ") ^ i19;
                        i10 = ((iM11306 ^ i20) * (-4271)) ^ (-1610707785);
                        i11 = -1521258922;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ᩵") ^ i19;
                        i10 = ((iM11306 ^ i20) * (-30527)) ^ (-1697758917);
                        i11 = -517004344;
                    }
                    i22 = iM11306 ^ i11;
                    c1192 = this;
                    s = s2;
                    i21 = i10;
                    i25 = i25;
                    i24 = i24;
                    iM450212 = iM450212;
                    z2 = z2;
                    sArr3 = sArr3;
                    str4 = str4;
                    str3 = str3;
                    String str17 = strM41586;
                    sb3 = sb;
                    strM41586 = str17;
                    break;
                case -464548921:
                case -74231315:
                    sb = sb3;
                    str3 = str3;
                    strM41585 = c1192.m41585(C1875.m6105(f5291, 145, 11, i23));
                    int iM450219 = (C19806.m45029("ۙ᩵") ^ i19) * (-125);
                    i10 = ((iM450219 ^ i20) * 20961) ^ 1015064110;
                    i22 = iM450219 ^ (-1106029698);
                    i21 = i10;
                    i25 = i25;
                    i24 = i24;
                    iM450212 = iM450212;
                    z2 = z2;
                    sArr3 = sArr3;
                    str4 = str4;
                    str3 = str3;
                    String str18 = strM41586;
                    sb3 = sb;
                    strM41586 = str18;
                    break;
                case -288429569:
                case 1246180141:
                    C0216.m1591();
                    if (C1148.m4232() > 0) {
                        i5 = iM450212;
                        str2 = str4;
                        StringBuilder sb9 = sb3;
                        strM41586 = strM41586;
                        sb = sb9;
                        int iM113015 = (ThreadFactoryC3888.m11306("᩵֨") + i19) * 91;
                        i22 = iM113015 ^ (-553527446);
                        str4 = str2;
                        i21 = ((iM113015 ^ i20) * 16593) ^ 1349063528;
                        iM450212 = i5;
                        String str19 = strM41586;
                        sb3 = sb;
                        strM41586 = str19;
                    } else {
                        iM45029 = C19806.m45029("ܽ֨") ^ i20;
                        i = ((iM45029 ^ i19) * 30749) ^ 796009071;
                        i2 = -901940840;
                        i22 = iM45029 ^ i2;
                        i21 = i;
                    }
                    break;
                case -212937174:
                case 1805494601:
                    i5 = iM450212;
                    str2 = str4;
                    short[] sArr6 = sArr3;
                    StringBuilder sb10 = sb3;
                    strM41586 = strM41586;
                    sb = sb10;
                    sArr2 = f5291;
                    i24 = 167;
                    i25 = 3;
                    if (C3286.f12186) {
                        sArr3 = sArr6;
                        int iM113016 = (ThreadFactoryC3888.m11306("᩵֨") + i19) * 91;
                        i22 = iM113016 ^ (-553527446);
                        str4 = str2;
                        i21 = ((iM113016 ^ i20) * 16593) ^ 1349063528;
                        iM450212 = i5;
                    } else {
                        int iM450220 = (C19806.m45029("֡ۗ") + i19) * (-43);
                        int i29 = ((iM450220 ^ i20) * 9645) ^ (-1976356545);
                        i22 = iM450220 ^ 1334327369;
                        sArr3 = sArr6;
                        iM450212 = i5;
                        str4 = str2;
                        i21 = i29;
                    }
                    String str110 = strM41586;
                    sb3 = sb;
                    strM41586 = str110;
                    break;
                case 17245571:
                case 392051457:
                    C1937.m6291(buttonM5052, new ViewOnClickListenerC13894(0, dialogInterfaceC19356M32610));
                    buttonM4897 = C1398.m4897(dialogInterfaceC19356M32610);
                    z3 = true;
                    if (C1398.f5802 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢ֡") ^ i19;
                        i = ((iM45029 ^ i20) * (-20547)) ^ 1475237822;
                        i2 = 2016227874;
                        i22 = iM45029 ^ i2;
                        i21 = i;
                    } else {
                        i5 = iM450212;
                        iM450211 = (i19 - ThreadFactoryC3888.m11306("ܰ۠")) * 89;
                        i14 = ((iM450211 ^ i20) * (-13823)) ^ (-1026451291);
                        i15 = -1059624843;
                        i22 = iM450211 ^ i15;
                        i21 = i14;
                        iM450212 = i5;
                    }
                    break;
                case 25222750:
                case 270624172:
                    C13188.m32612(dialogInterfaceC19356M8239);
                    final Button buttonM10425 = C3535.m10425(dialogInterfaceC19356M8239);
                    if (C2477.m7593() < 0) {
                        C1937.m6291(buttonM10425, new ViewOnClickListenerC7273(1));
                        C1937.m6282(m41568(), dialogInterfaceC19356M8239, new InterfaceC10597() { // from class: l.ۚܶۘ

                            /* JADX INFO: renamed from: ܺܿܳ, reason: not valid java name and contains not printable characters */
                            private static final short[] f18740 = {2123, 27242};

                            /* JADX WARN: Code duplicated, block: B:65:0x0252 A[PHI: r3 r4 r7 r8 r15 r16
                              0x0252: PHI (r3v6 short[]) = (r3v3 short[]), (r3v2 short[]), (r3v2 short[]), (r3v2 short[]) binds: [B:64:0x0250, B:60:0x022f, B:52:0x01d1, B:12:0x004d] A[DONT_GENERATE, DONT_INLINE]
                              0x0252: PHI (r4v6 char) = (r4v2 char), (r4v3 char), (r4v2 char), (r4v2 char) binds: [B:64:0x0250, B:60:0x022f, B:52:0x01d1, B:12:0x004d] A[DONT_GENERATE, DONT_INLINE]
                              0x0252: PHI (r7v6 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:64:0x0250, B:60:0x022f, B:52:0x01d1, B:12:0x004d] A[DONT_GENERATE, DONT_INLINE]
                              0x0252: PHI (r8v6 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:64:0x0250, B:60:0x022f, B:52:0x01d1, B:12:0x004d] A[DONT_GENERATE, DONT_INLINE]
                              0x0252: PHI (r15v36 java.lang.StringBuilder) = 
                              (r15v12 java.lang.StringBuilder)
                              (r15v13 java.lang.StringBuilder)
                              (r15v15 java.lang.StringBuilder)
                              (r15v37 java.lang.StringBuilder)
                             binds: [B:64:0x0250, B:60:0x022f, B:52:0x01d1, B:12:0x004d] A[DONT_GENERATE, DONT_INLINE]
                              0x0252: PHI (r16v31 l.ᩳ۟ۜ) = (r16v9 l.ᩳ۟ۜ), (r16v10 l.ᩳ۟ۜ), (r16v12 l.ᩳ۟ۜ), (r16v32 l.ᩳ۟ۜ) binds: [B:64:0x0250, B:60:0x022f, B:52:0x01d1, B:12:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
                            @Override // l.InterfaceC10597
                            /* JADX INFO: renamed from: ۙ */
                            public final void mo1473(Object obj2) {
                                StringBuilder sb11;
                                int iM450221;
                                int i30;
                                int i31;
                                int iM450222;
                                int i32;
                                AbstractC17902 abstractC17902 = null;
                                String strM4832 = null;
                                short[] sArr7 = null;
                                char c = 0;
                                short s3 = 0;
                                int i33 = 0;
                                int i34 = 0;
                                int i35 = 0;
                                int i36 = 0;
                                short[] sArr8 = null;
                                int i37 = -1399881614;
                                int i38 = C0629.f2722;
                                int i39 = ThreadFactoryC3888.f14547;
                                int iM450223 = C19806.m45029("᩷ܰ") ^ i38;
                                int i40 = ((iM450223 ^ i39) * 11927) ^ (-381036848);
                                int i41 = iM450223 ^ 2104597076;
                                while (true) {
                                    StringBuilder sb12 = null;
                                    while (true) {
                                        i37 = ((((i37 ^ i39) * 1825) >> 31) & i40) ^ i41;
                                        switch (i37) {
                                            case -2064070870:
                                            case 215736704:
                                                sb12 = sb12;
                                                abstractC17902 = abstractC17902;
                                                s3 = sArr7[c];
                                                i33 = s3 + 1;
                                                if (C10634.f36300 >= 0) {
                                                    iM450221 = (C19806.m45029("᩹ܿ") + i38) * (-35);
                                                    i30 = ((iM450221 ^ i39) * 21797) ^ 1927124040;
                                                    i31 = 1102484450;
                                                } else {
                                                    iM450221 = (ThreadFactoryC3888.m11306("ܶۙ") ^ i38) * q.h;
                                                    i30 = ((iM450221 ^ i39) * 30127) ^ (-861573357);
                                                    i31 = -879954361;
                                                }
                                                i41 = iM450221 ^ i31;
                                                abstractC17902 = abstractC17902;
                                                sb12 = sb12;
                                                i40 = i30;
                                                break;
                                            case -2010838675:
                                            case 1419193433:
                                                sb12 = sb12;
                                                abstractC17902 = abstractC17902;
                                                if ((i35 + 1) - i34 <= 0) {
                                                    iM450221 = C19806.m45029("۟ܳ") ^ i39;
                                                    i30 = ((iM450221 ^ i38) * (-6349)) ^ 1667595269;
                                                    i31 = 214601480;
                                                } else {
                                                    iM450221 = C19806.m45029("ۖܽ") ^ i39;
                                                    i30 = ((iM450221 ^ i38) * (-8407)) ^ (-211099884);
                                                    i31 = -1614420489;
                                                }
                                                i41 = iM450221 ^ i31;
                                                abstractC17902 = abstractC17902;
                                                sb12 = sb12;
                                                i40 = i30;
                                                break;
                                            case -1943153575:
                                            case -566969658:
                                                C3660.m10791();
                                                if (C1937.f7317 >= 0) {
                                                    sb12 = sb12;
                                                    abstractC17902 = abstractC17902;
                                                    iM450221 = ThreadFactoryC3888.m11306("۫᩹") ^ i38;
                                                    i30 = ((iM450221 ^ i39) * (-14853)) ^ 1171978566;
                                                    i31 = 656665236;
                                                    i41 = iM450221 ^ i31;
                                                    abstractC17902 = abstractC17902;
                                                    sb12 = sb12;
                                                    i40 = i30;
                                                } else {
                                                    int iM450224 = (C19806.m45029("ۜۚ") ^ i39) * (-83);
                                                    i40 = ((iM450224 ^ i38) * 20575) ^ (-1313075301);
                                                    i41 = iM450224 ^ (-1890828535);
                                                }
                                                break;
                                            case -1895816410:
                                            case -658862128:
                                                C0216.m1591();
                                                RunnableC1895.m6170();
                                                break;
                                            case -1315066975:
                                            case 1521080632:
                                                i36 = 27215;
                                                iM450221 = ThreadFactoryC3888.m11306("᩵ۢ") ^ i38;
                                                i30 = ((iM450221 ^ i39) * 27251) ^ (-1860218488);
                                                i31 = 206982399;
                                                i41 = iM450221 ^ i31;
                                                abstractC17902 = abstractC17902;
                                                sb12 = sb12;
                                                i40 = i30;
                                                break;
                                            case -1294996318:
                                            case -548635383:
                                                sb12 = sb12;
                                                abstractC17902 = abstractC17902;
                                                c = 0;
                                                if (C1066.f4915 <= 0) {
                                                    iM450221 = ThreadFactoryC3888.m11306("۫᩹") ^ i38;
                                                    i30 = ((iM450221 ^ i39) * (-14853)) ^ 1171978566;
                                                    i31 = 656665236;
                                                } else {
                                                    iM450221 = ThreadFactoryC3888.m11306("ۜ᩶") ^ i39;
                                                    i30 = ((iM450221 ^ i38) * (-2763)) ^ 938634888;
                                                    i31 = 1522042014;
                                                }
                                                i41 = iM450221 ^ i31;
                                                abstractC17902 = abstractC17902;
                                                sb12 = sb12;
                                                i40 = i30;
                                                break;
                                            case -1228842548:
                                            case -506318562:
                                                sb12 = sb12;
                                                abstractC17902 = abstractC17902;
                                                i34 = i33 * i33;
                                                i35 = s3 * 2;
                                                if (C2124.m6673() <= 0) {
                                                    iM450221 = ThreadFactoryC3888.m11306("۫᩹") ^ i38;
                                                    i30 = ((iM450221 ^ i39) * (-14853)) ^ 1171978566;
                                                    i31 = 656665236;
                                                } else {
                                                    iM450221 = C19806.m45029("֫ۜ") ^ i38;
                                                    i30 = ((iM450221 ^ i39) * (-31779)) ^ (-1871293991);
                                                    i31 = -1689620680;
                                                }
                                                i41 = iM450221 ^ i31;
                                                abstractC17902 = abstractC17902;
                                                sb12 = sb12;
                                                i40 = i30;
                                                break;
                                            case -1180405022:
                                            case 877447870:
                                                if (C2642.f10294 > 0) {
                                                    sb12 = sb12;
                                                    abstractC17902 = abstractC17902;
                                                    iM450221 = (C19806.m45029("᩹ܿ") + i38) * (-35);
                                                    i30 = ((iM450221 ^ i39) * 21797) ^ 1927124040;
                                                    i31 = 1102484450;
                                                    i41 = iM450221 ^ i31;
                                                    abstractC17902 = abstractC17902;
                                                    sb12 = sb12;
                                                    i40 = i30;
                                                }
                                                break;
                                            case -970718146:
                                            case 627989247:
                                                sb12 = sb12;
                                                C1148.m4223(sb12, strM4832);
                                                if (C0629.f2722 <= 0) {
                                                    abstractC17902 = abstractC17902;
                                                    iM450221 = ThreadFactoryC3888.m11306("۫᩹") ^ i38;
                                                    i30 = ((iM450221 ^ i39) * (-14853)) ^ 1171978566;
                                                    i31 = 656665236;
                                                    i41 = iM450221 ^ i31;
                                                    abstractC17902 = abstractC17902;
                                                } else {
                                                    int iM450225 = C19806.m45029("᩻֡") ^ i39;
                                                    i30 = ((iM450225 ^ i38) * 6635) ^ (-1035136010);
                                                    i41 = iM450225 ^ 685544752;
                                                }
                                                sb12 = sb12;
                                                i40 = i30;
                                                break;
                                            case -911821612:
                                            case 1217293631:
                                                i36 = 32962;
                                                iM450221 = ThreadFactoryC3888.m11306("᩵ۢ") ^ i38;
                                                i30 = ((iM450221 ^ i39) * 27251) ^ (-1860218488);
                                                i31 = 206982399;
                                                i41 = iM450221 ^ i31;
                                                abstractC17902 = abstractC17902;
                                                sb12 = sb12;
                                                i40 = i30;
                                                break;
                                            case -364763223:
                                            case 523937590:
                                                abstractC17902 = (AbstractC17902) obj2;
                                                int i42 = C1192.f5292;
                                                if (C1066.f4915 > 0) {
                                                    sb12 = new StringBuilder();
                                                    if (C0050.f912 <= 0) {
                                                        iM450222 = (C19806.m45029("᩻ۨ") + i39) * 51;
                                                        i40 = ((iM450222 ^ i38) * (-15729)) ^ 1695637782;
                                                        i32 = -397553051;
                                                    } else {
                                                        iM450222 = (C19806.m45029("ܰ᩻") + i38) * 43;
                                                        i40 = ((iM450222 ^ i39) * (-16699)) ^ (-1042645528);
                                                        i32 = 2113719157;
                                                    }
                                                    i41 = iM450222 ^ i32;
                                                }
                                                break;
                                            case -121319770:
                                            case 1847423241:
                                                sb12 = sb12;
                                                abstractC17902 = abstractC17902;
                                                if (C1875.f7103 < 0) {
                                                    iM450221 = C19806.m45029("᩹۠") ^ i38;
                                                    i30 = ((iM450221 ^ i39) * (-21633)) ^ 245716549;
                                                    i31 = 1722592664;
                                                    i41 = iM450221 ^ i31;
                                                    abstractC17902 = abstractC17902;
                                                    sb12 = sb12;
                                                    i40 = i30;
                                                } else {
                                                    abstractC17902 = abstractC17902;
                                                    sb12 = sb12;
                                                    iM450222 = (C19806.m45029("᩻ۨ") + i39) * 51;
                                                    i40 = ((iM450222 ^ i38) * (-15729)) ^ 1695637782;
                                                    i32 = -397553051;
                                                    i41 = iM450222 ^ i32;
                                                }
                                                break;
                                            case 385079072:
                                            case 1768809462:
                                                C3535.m10431();
                                                ViewGroupOnHierarchyChangeListenerC1916.m6233();
                                                break;
                                            case 703874397:
                                            case 1041054704:
                                                sb12 = sb12;
                                                C2124.m6683(sb12, abstractC17902.m41564());
                                                sArr8 = f18740;
                                                if (!C3743.f13569) {
                                                    sb12 = sb12;
                                                    iM450222 = (C19806.m45029("᩻ۨ") + i39) * 51;
                                                    i40 = ((iM450222 ^ i38) * (-15729)) ^ 1695637782;
                                                    i32 = -397553051;
                                                    i41 = iM450222 ^ i32;
                                                } else {
                                                    int iM113017 = ThreadFactoryC3888.m11306("ܿܽ") ^ i39;
                                                    AbstractC17902 abstractC17903 = abstractC17902;
                                                    i41 = iM113017 ^ (-2006933940);
                                                    sb11 = sb12;
                                                    i40 = ((iM113017 ^ i38) * (-18761)) ^ 1906301913;
                                                    abstractC17902 = abstractC17903;
                                                    sb12 = sb11;
                                                }
                                                break;
                                            case 1466112874:
                                            case 1921034875:
                                                C2249.m6915();
                                                if (AbstractC0464.m2313() != 0) {
                                                }
                                                sb12 = sb12;
                                                abstractC17902 = abstractC17902;
                                                iM450221 = ThreadFactoryC3888.m11306("۫᩹") ^ i38;
                                                i30 = ((iM450221 ^ i39) * (-14853)) ^ 1171978566;
                                                i31 = 656665236;
                                                i41 = iM450221 ^ i31;
                                                abstractC17902 = abstractC17902;
                                                sb12 = sb12;
                                                i40 = i30;
                                                break;
                                            case 1500839942:
                                            case 2126259634:
                                                C1461.m5083(buttonM10425, C0817.m3407(sb12));
                                                break;
                                            case 1546764199:
                                            case 1975535323:
                                                sb12 = sb12;
                                                abstractC17902 = abstractC17902;
                                                sArr7 = f18740;
                                                if (C3577.f13150 >= 0) {
                                                    iM450221 = ThreadFactoryC3888.m11306("۫᩹") ^ i38;
                                                    i30 = ((iM450221 ^ i39) * (-14853)) ^ 1171978566;
                                                    i31 = 656665236;
                                                } else {
                                                    iM450221 = C19806.m45029("֨ܳ") ^ i39;
                                                    i30 = ((iM450221 ^ i38) * (-20615)) ^ (-506173992);
                                                    i31 = -1993391738;
                                                }
                                                i41 = iM450221 ^ i31;
                                                abstractC17902 = abstractC17902;
                                                sb12 = sb12;
                                                i40 = i30;
                                                break;
                                            default:
                                                StringBuilder sb13 = sb12;
                                                strM4832 = C1377.m4832(sArr8, 1, 1, i36);
                                                if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                                                }
                                                int iM450226 = (C19806.m45029("᩵ܽ") ^ i38) * 93;
                                                i41 = iM450226 ^ (-927622846);
                                                sb11 = sb13;
                                                i40 = ((iM450226 ^ i39) * (-32665)) ^ 1591816073;
                                                strM4832 = strM4832;
                                                sb12 = sb11;
                                                break;
                                                break;
                                        }
                                        return;
                                    }
                                    int iM450227 = C19806.m45029("ۨۖ") ^ i39;
                                    i40 = ((iM450227 ^ i38) * (-23695)) ^ (-1166923592);
                                    i41 = iM450227 ^ (-1898325702);
                                }
                            }
                        });
                        return dialogInterfaceC19356M8239;
                    }
                    iM45029 = C19806.m45029("ܽ֨") ^ i20;
                    i = ((iM45029 ^ i19) * 30749) ^ 796009071;
                    i2 = -901940840;
                    i22 = iM45029 ^ i2;
                    i21 = i;
                    break;
                case 49966480:
                case 2127192305:
                    iM450212 = iM450212;
                    z2 = z2 ? 1 : 0;
                    str3 = str3;
                    str4 = str4;
                    sArr3 = sArr3;
                    i24 = i24;
                    i25 = i25;
                    StringBuilder sb11 = sb3;
                    strM41586 = strM41586;
                    sb = sb11;
                    s = f5291[141];
                    i16 = s * s;
                    i17 = 253350889;
                    if (C2249.m6915() <= 0) {
                        iM450210 = (C19806.m45029("ۧۢ") + i20) * 7;
                        i21 = ((iM450210 ^ i19) * (-2269)) ^ 441384843;
                        i9 = -1033674218;
                    } else {
                        iM450210 = C19806.m45029("ܺ᩵") ^ i20;
                        i21 = ((iM450210 ^ i19) * (-12613)) ^ (-1817577394);
                        i9 = -955038008;
                    }
                    i22 = iM450210 ^ i9;
                    c1192 = this;
                    i25 = i25;
                    i24 = i24;
                    iM450212 = iM450212;
                    z2 = z2;
                    sArr3 = sArr3;
                    str4 = str4;
                    str3 = str3;
                    String str111 = strM41586;
                    sb3 = sb;
                    strM41586 = str111;
                    break;
                case 405165482:
                case 1901127139:
                    i6 = iM450212;
                    str = str4;
                    sArr = sArr3;
                    i8 = i25;
                    StringBuilder sb12 = sb3;
                    strM41586 = strM41586;
                    sb = sb12;
                    short[] sArr7 = f5291;
                    i7 = i24;
                    z = z2 ? 1 : 0;
                    strM9788 = C3286.m9788(sArr7, 156, 11, i23);
                    if (C1377.f5749) {
                        iM11307 = (C19806.m45029("ۚ᩻") ^ i20) * 19;
                        i13 = ((iM11307 ^ i19) * (-7237)) ^ 1932232044;
                        i12 = 785971572;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("᩸ۘ") ^ i20;
                        i13 = ((iM11307 ^ i19) * 2249) ^ (-689516493);
                        i12 = 1866088343;
                    }
                    i22 = iM11307 ^ i12;
                    i25 = i8;
                    i24 = i7;
                    iM450212 = i6;
                    sArr3 = sArr;
                    str4 = str;
                    str3 = strM9788;
                    i21 = i13;
                    z2 = z;
                    String str112 = strM41586;
                    sb3 = sb;
                    strM41586 = str112;
                    break;
                case 558999117:
                case 915061333:
                    C7105.m18993(dialogInterfaceC19356M32610.m44374(), new View.OnClickListener(c1192) { // from class: l.ۙܶۘ

                        /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ C1192 f16659;

                        {
                            int i30 = -1026593868;
                            int i31 = C3660.f13403;
                            int i32 = C1066.f4915;
                            int iM450221 = C19806.m45029("۠ۚ") ^ i31;
                            int i33 = ((iM450221 ^ i32) * 3019) ^ 131536096;
                            int i34 = -1883170624;
                            while (true) {
                                i30 = ((((i30 ^ i32) * 1983) >> 31) & i33) ^ (iM450221 ^ i34);
                                switch (i30) {
                                    case -2042373928:
                                    case -1485143950:
                                        C19806.m45024();
                                        if (C2871.f10837 >= 0) {
                                            iM450221 = C19806.m45029("۫ܶ") ^ i31;
                                            i33 = ((iM450221 ^ i32) * 24185) ^ (-399944697);
                                            i34 = 1479703011;
                                        } else {
                                            iM450221 = (C19806.m45029("ۘۧ") + i32) * (-123);
                                            i33 = ((iM450221 ^ i31) * 1391) ^ (-1538850909);
                                            i34 = 1590778825;
                                        }
                                        break;
                                    case -1959823722:
                                    case 1794336963:
                                        if (C7105.f23796 >= 0) {
                                            iM450221 = (ThreadFactoryC3888.m11306("ۙ᩸") ^ i32) * (-7);
                                            i33 = ((iM450221 ^ i31) * (-24847)) ^ 1166537861;
                                            i34 = 1188991414;
                                        } else {
                                            iM450221 = (C19806.m45029("ۢۗ") ^ i31) * (-65);
                                            i33 = ((iM450221 ^ i32) * (-7245)) ^ 188496510;
                                            i34 = 800586102;
                                        }
                                        break;
                                    case -1650284630:
                                    case 1400386393:
                                        if (C0797.f3386) {
                                            iM450221 = (C19806.m45029("ۘۧ") + i32) * (-123);
                                            i33 = ((iM450221 ^ i31) * 1391) ^ (-1538850909);
                                            i34 = 1590778825;
                                        } else {
                                            iM450221 = C19806.m45029("ܰ۫") ^ i32;
                                            i33 = ((iM450221 ^ i31) * (-2447)) ^ (-1357533033);
                                            i34 = -1183683146;
                                        }
                                        break;
                                    case -1643199871:
                                    case -736112915:
                                        if (C0629.f2722 <= 0) {
                                            iM450221 = (C19806.m45029("᩻ۗ") + i31) * (-19);
                                            i33 = ((iM450221 ^ i32) * (-29307)) ^ (-936240964);
                                            i34 = 2082720220;
                                        } else {
                                            iM450221 = (C19806.m45029("ᩴۗ") + i32) * (-75);
                                            i33 = ((iM450221 ^ i31) * (-28801)) ^ 531724204;
                                            i34 = 1331401420;
                                        }
                                        break;
                                    case -1581723086:
                                    case 1557679968:
                                        if (C2477.f9839 <= 0) {
                                            iM450221 = (C19806.m45029("᩻ۗ") + i31) * (-19);
                                            i33 = ((iM450221 ^ i32) * (-29307)) ^ (-936240964);
                                            i34 = 2082720220;
                                        } else {
                                            iM450221 = ThreadFactoryC3888.m11306("ܶ֡") ^ i31;
                                            i33 = ((iM450221 ^ i32) * (-16975)) ^ 555500362;
                                            i34 = 161482473;
                                        }
                                        break;
                                    case -1507120021:
                                    case -1476829489:
                                        if (RunnableC1895.f7152) {
                                            iM450221 = ThreadFactoryC3888.m11306("᩻᩶") ^ i31;
                                            i33 = ((iM450221 ^ i32) * 23191) ^ 640696264;
                                            i34 = 907394090;
                                        } else {
                                            iM450221 = (C19806.m45029("ۘۧ") + i32) * (-123);
                                            i33 = ((iM450221 ^ i31) * 1391) ^ (-1538850909);
                                            i34 = 1590778825;
                                        }
                                        break;
                                    case -1297825406:
                                    case -1040854833:
                                        RunnableC3388.m10064();
                                        if (C1398.f5802 <= 0) {
                                            iM450221 = (C19806.m45029("ۘۧ") + i32) * (-123);
                                            i33 = ((iM450221 ^ i31) * 1391) ^ (-1538850909);
                                            i34 = 1590778825;
                                        } else {
                                            iM450221 = C19806.m45029("ۡ᩹") ^ i32;
                                            i33 = ((iM450221 ^ i31) * 26173) ^ 402641963;
                                            i34 = -1027193180;
                                        }
                                        break;
                                    case -955972939:
                                    case 1090489400:
                                        C2332.m7079();
                                        throw new RuntimeException();
                                    case -872691409:
                                    case 1771552952:
                                        if (C1977.f7413 <= 0) {
                                            iM450221 = (ThreadFactoryC3888.m11306("ۙ᩸") ^ i32) * (-7);
                                            i33 = ((iM450221 ^ i31) * (-24847)) ^ 1166537861;
                                            i34 = 1188991414;
                                        } else {
                                            iM450221 = C19806.m45029("ܺۡ") ^ i31;
                                            i33 = ((iM450221 ^ i32) * (-12505)) ^ (-1879629259);
                                            i34 = 168583182;
                                        }
                                        break;
                                    case -811825909:
                                    case 1929113946:
                                        C1461.m5080();
                                        C0817.m3399();
                                        iM450221 = (C19806.m45029("ۘۧ") + i32) * (-123);
                                        i33 = ((iM450221 ^ i31) * 1391) ^ (-1538850909);
                                        i34 = 1590778825;
                                        break;
                                    case -707940080:
                                    case 1896356095:
                                        if (!C0526.f2219) {
                                            iM450221 = (C19806.m45029("ۘۧ") + i32) * (-123);
                                            i33 = ((iM450221 ^ i31) * 1391) ^ (-1538850909);
                                            i34 = 1590778825;
                                        } else {
                                            iM450221 = (C19806.m45029("᩻ۗ") + i31) * (-19);
                                            i33 = ((iM450221 ^ i32) * (-29307)) ^ (-936240964);
                                            i34 = 2082720220;
                                        }
                                        break;
                                    case -609169692:
                                    case 409985657:
                                        this.f16659 = c1192;
                                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                                            iM450221 = (ThreadFactoryC3888.m11306("ۙ᩸") ^ i32) * (-7);
                                            i33 = ((iM450221 ^ i31) * (-24847)) ^ 1166537861;
                                            i34 = 1188991414;
                                        } else {
                                            iM450221 = (i32 - C19806.m45029("ۗۚ")) * 39;
                                            i33 = ((iM450221 ^ i31) * (-32439)) ^ (-278863366);
                                            i34 = -663639582;
                                        }
                                        break;
                                    case -590438045:
                                    case 1858605762:
                                        if (C0629.f2722 <= 0) {
                                            iM450221 = C19806.m45029("۫ܶ") ^ i31;
                                            i33 = ((iM450221 ^ i32) * 24185) ^ (-399944697);
                                            i34 = 1479703011;
                                        } else {
                                            iM450221 = (ThreadFactoryC3888.m11306("۬ܿ") ^ i32) * (-79);
                                            i33 = ((iM450221 ^ i31) * (-2657)) ^ 970661767;
                                            i34 = -264040082;
                                        }
                                        break;
                                    case 703312878:
                                    case 1395022972:
                                        return;
                                    case 1949066975:
                                    case 2142637705:
                                        if (C0216.f1393 != 0) {
                                            iM450221 = C19806.m45029("۫ܶ") ^ i31;
                                            i33 = ((iM450221 ^ i32) * 24185) ^ (-399944697);
                                            i34 = 1479703011;
                                        } else {
                                            iM450221 = ThreadFactoryC3888.m11306("᩸֡") ^ i32;
                                            i33 = ((iM450221 ^ i31) * 21833) ^ (-1024957125);
                                            i34 = 109780235;
                                        }
                                        break;
                                    default:
                                        if (C3577.m10565()) {
                                            iM450221 = C19806.m45029("ۛۤ") ^ i31;
                                            i33 = ((iM450221 ^ i32) * (-28469)) ^ 437505915;
                                            i34 = 1549087493;
                                        } else {
                                            iM450221 = C19806.m45029("۫ܶ") ^ i31;
                                            i33 = ((iM450221 ^ i32) * 24185) ^ (-399944697);
                                            i34 = 1479703011;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C1192 c1193 = null;
                            int i30 = -16716052;
                            int i31 = C1668.f6641;
                            int i32 = C1398.f5802;
                            int iM450221 = (C19806.m45029("ۡۛ") ^ i31) * 23;
                            int i33 = ((iM450221 ^ i32) * 16917) ^ (-1345561041);
                            int i34 = -1858451703;
                            while (true) {
                                i30 = ((((i30 ^ i32) * 10899) >> 31) & i33) ^ (iM450221 ^ i34);
                                switch (i30) {
                                    case -2111335650:
                                    case 924219538:
                                        if (C19806.m45024()) {
                                            iM450221 = C19806.m45029("ۛ۠") ^ i32;
                                            i33 = ((iM450221 ^ i31) * (-23973)) ^ 1309759034;
                                            i34 = -1183870570;
                                        } else {
                                            iM450221 = (i32 - C19806.m45029("᩶᩵")) * (-51);
                                            i33 = ((iM450221 ^ i31) * (-22199)) ^ 813030038;
                                            i34 = 1480195642;
                                        }
                                        break;
                                    case -2091150416:
                                    case -1217839815:
                                        if (!C3577.m10565()) {
                                            iM450221 = ThreadFactoryC3888.m11306("ܽ֡") ^ i31;
                                            i33 = ((iM450221 ^ i32) * (-25493)) ^ (-1195171343);
                                            i34 = -192603824;
                                        } else {
                                            iM450221 = ThreadFactoryC3888.m11306("ܰ᩶") ^ i32;
                                            i33 = ((iM450221 ^ i31) * 15281) ^ (-404830866);
                                            i34 = 398179169;
                                        }
                                        break;
                                    case -2034482029:
                                    case 1421535071:
                                        if (C2477.f9839 <= 0) {
                                            iM450221 = ThreadFactoryC3888.m11306("ܰ᩶") ^ i32;
                                            i33 = ((iM450221 ^ i31) * 15281) ^ (-404830866);
                                            i34 = 398179169;
                                        } else {
                                            iM450221 = (ThreadFactoryC3888.m11306("ܿ᩹") + i32) * (-125);
                                            i33 = ((iM450221 ^ i31) * (-22221)) ^ 652830474;
                                            i34 = 13322246;
                                        }
                                        break;
                                    case -1958653466:
                                    case 1104806256:
                                        if (C0629.f2722 <= 0) {
                                            iM450221 = C19806.m45029("ۛ۠") ^ i32;
                                            i33 = ((iM450221 ^ i31) * (-23973)) ^ 1309759034;
                                            i34 = -1183870570;
                                        } else {
                                            iM450221 = ThreadFactoryC3888.m11306("ۘ۫") ^ i31;
                                            i33 = ((iM450221 ^ i32) * (-26677)) ^ (-801884142);
                                            i34 = 337749052;
                                        }
                                        break;
                                    case -1837465842:
                                    case -455340215:
                                        if (C1377.m4833() != 0) {
                                            iM450221 = ThreadFactoryC3888.m11306("ۘ۫") ^ i31;
                                            i33 = ((iM450221 ^ i32) * (-26677)) ^ (-801884142);
                                            i34 = 337749052;
                                        } else {
                                            iM450221 = ThreadFactoryC3888.m11306("ܰ᩶") ^ i32;
                                            i33 = ((iM450221 ^ i31) * 15281) ^ (-404830866);
                                            i34 = 398179169;
                                        }
                                        break;
                                    case -1769499240:
                                    case 1677661131:
                                        C0797.m3359();
                                        break;
                                    case -1693457933:
                                    case 180362490:
                                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                                            iM450221 = ThreadFactoryC3888.m11306("ܰ᩶") ^ i32;
                                            i33 = ((iM450221 ^ i31) * 15281) ^ (-404830866);
                                            i34 = 398179169;
                                        } else {
                                            iM450221 = (C19806.m45029("᩶ۗ") + i31) * (-13);
                                            i33 = ((iM450221 ^ i32) * 31619) ^ 423770747;
                                            i34 = 439163935;
                                        }
                                        break;
                                    case -1464806535:
                                    case 1057114042:
                                        if (C1025.f4800 >= 0) {
                                            iM450221 = ThreadFactoryC3888.m11306("ܰ᩶") ^ i32;
                                            i33 = ((iM450221 ^ i31) * 15281) ^ (-404830866);
                                            i34 = 398179169;
                                        } else {
                                            iM450221 = ThreadFactoryC3888.m11306("ܶ᩺") ^ i31;
                                            i33 = ((iM450221 ^ i32) * (-31235)) ^ (-1746724612);
                                            i34 = -2146342145;
                                        }
                                        break;
                                    case -919853022:
                                    case -181053894:
                                        int i35 = C1192.f5292;
                                        if (RunnableC1895.f7152) {
                                            iM450221 = C19806.m45029("ۤۛ") ^ i31;
                                            i33 = ((iM450221 ^ i32) * (-17919)) ^ 400684744;
                                            i34 = -1922183970;
                                        } else {
                                            iM450221 = C19806.m45029("ۧۚ") ^ i31;
                                            i33 = ((iM450221 ^ i32) * (-29305)) ^ (-1268372031);
                                            i34 = 473653674;
                                        }
                                        break;
                                    case -715266851:
                                    case -71723361:
                                        c1193.cancel();
                                        C1189.m4367(dialogInterfaceC19356M32610);
                                        break;
                                    case -153006141:
                                    case 858481703:
                                        if (ThreadFactoryC3888.f14547 <= 0) {
                                            iM450221 = C19806.m45029("ۛ۠") ^ i32;
                                            i33 = ((iM450221 ^ i31) * (-23973)) ^ 1309759034;
                                            i34 = -1183870570;
                                        } else {
                                            iM450221 = C19806.m45029("֡᩶") ^ i32;
                                            i33 = ((iM450221 ^ i31) * (-24847)) ^ (-932518115);
                                            i34 = 835003363;
                                        }
                                        break;
                                    case 225048785:
                                    case 449896171:
                                        if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                                            iM450221 = ThreadFactoryC3888.m11306("ۘ۫") ^ i31;
                                            i33 = ((iM450221 ^ i32) * (-26677)) ^ (-801884142);
                                            i34 = 337749052;
                                        } else {
                                            iM450221 = (ThreadFactoryC3888.m11306("ۚۘ") + i31) * (-53);
                                            i33 = ((iM450221 ^ i32) * (-4759)) ^ (-868141231);
                                            i34 = 200232006;
                                        }
                                        break;
                                    case 392920164:
                                    case 1398512982:
                                        if (C2642.f10294 <= 0) {
                                            iM450221 = C19806.m45029("ۧۚ") ^ i31;
                                            i33 = ((iM450221 ^ i32) * (-29305)) ^ (-1268372031);
                                            i34 = 473653674;
                                        } else {
                                            iM450221 = (ThreadFactoryC3888.m11306("۟ۜ") + i32) * (-87);
                                            i33 = ((iM450221 ^ i31) * (-7435)) ^ 531646581;
                                            i34 = 1818859128;
                                        }
                                        break;
                                    case 399608139:
                                    case 861343900:
                                        if (C0817.f3443) {
                                            iM450221 = C19806.m45029("ۙۡ") ^ i31;
                                            i33 = ((iM450221 ^ i32) * (-9139)) ^ 755512922;
                                            i34 = 1582702485;
                                        } else {
                                            iM450221 = ThreadFactoryC3888.m11306("ܽ֡") ^ i31;
                                            i33 = ((iM450221 ^ i32) * (-25493)) ^ (-1195171343);
                                            i34 = -192603824;
                                        }
                                        break;
                                    case 1018066906:
                                    case 1045247568:
                                        ViewGroupOnHierarchyChangeListenerC1916.m6233();
                                        C0526.m2437();
                                        iM450221 = ThreadFactoryC3888.m11306("ܽ֡") ^ i31;
                                        i33 = ((iM450221 ^ i32) * (-25493)) ^ (-1195171343);
                                        i34 = -192603824;
                                        break;
                                    default:
                                        c1193 = this.f16659;
                                        if (C0962.m3746() >= 0) {
                                            iM450221 = C19806.m45029("ۧۚ") ^ i31;
                                            i33 = ((iM450221 ^ i32) * (-29305)) ^ (-1268372031);
                                            i34 = 473653674;
                                        } else {
                                            iM450221 = ThreadFactoryC3888.m11306("᩶ۛ") ^ i32;
                                            i33 = ((iM450221 ^ i31) * (-28477)) ^ (-854245801);
                                            i34 = -28579323;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    buttonM5052 = C1460.m5052(dialogInterfaceC19356M32610);
                    RunnableC1895.m6165(buttonM5052, z2 ? 1 : 0);
                    C19806.m45022(buttonM5052, iM450212);
                    if (C3535.f13026 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۟᩷") ^ i20) * (-29);
                        i = ((iM45029 ^ i19) * (-7673)) ^ 1685733729;
                        i2 = -1046065115;
                        i22 = iM45029 ^ i2;
                        i21 = i;
                    } else {
                        i5 = iM450212;
                        str2 = str4;
                        StringBuilder sb13 = sb3;
                        strM41586 = strM41586;
                        sb = sb13;
                        int iM113017 = (ThreadFactoryC3888.m11306("᩵֨") + i19) * 91;
                        i22 = iM113017 ^ (-553527446);
                        str4 = str2;
                        i21 = ((iM113017 ^ i20) * 16593) ^ 1349063528;
                        iM450212 = i5;
                        String str113 = strM41586;
                        sb3 = sb;
                        strM41586 = str113;
                    }
                    break;
                case 726451376:
                case 2066843940:
                    int i30 = iM450212;
                    short[] sArr8 = sArr3;
                    short[] sArr9 = sArr2;
                    int i31 = i24;
                    int i32 = i25;
                    String strM6085 = C1875.m6085(ThreadFactoryC3888.m11306(C1148.m4230(sArr9, i31, i32, i23)) ^ 2100007925);
                    int iM450221 = C19806.m45029("ۚۚ") ^ i19;
                    i21 = ((iM450221 ^ i20) * 20805) ^ (-1036006031);
                    i22 = iM450221 ^ (-303362414);
                    i24 = i31;
                    i25 = i32;
                    iM450212 = i30;
                    sArr2 = sArr9;
                    sArr3 = sArr8;
                    str4 = strM6085;
                    sb3 = sb3;
                    strM41586 = strM41586;
                    break;
                case 872902974:
                case 1770960558:
                    C2477.m7603(buttonM4897, z3);
                    C7105.m18993(buttonM4897, new ViewOnClickListenerC7273(1));
                    c9186M41568 = m41568();
                    iM45029 = (C19806.m45029("۠ۧ") + i19) * 23;
                    i = ((iM45029 ^ i20) * 10989) ^ 413553940;
                    i2 = 38571559;
                    i22 = iM45029 ^ i2;
                    i21 = i;
                    break;
                case 1016735039:
                case 1300747932:
                    onClickListener = new DialogInterface.OnClickListener() { // from class: l.ۖܶۘ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i33) {
                            int i34 = 248159768;
                            int i35 = C2642.f10294;
                            int i36 = C3660.f13403;
                            int iM450222 = C19806.m45029("ۨۡ") ^ i36;
                            int i37 = ((iM450222 ^ i35) * 25141) ^ (-1333870686);
                            int i38 = -2137704370;
                            while (true) {
                                i34 = ((((i34 ^ i35) * (-16115)) >> 31) & i37) ^ (iM450222 ^ i38);
                                switch (i34) {
                                    case -1961560752:
                                    case -726627942:
                                        MenuItemOnMenuItemClickListenerC3244.m9701();
                                        C1937.m6279();
                                        break;
                                    case -1927820943:
                                    case 1005540767:
                                        if (C10634.m26820()) {
                                            iM450222 = (C19806.m45029("ܺۙ") + i35) * 3;
                                            i37 = ((iM450222 ^ i36) * (-12025)) ^ 169076625;
                                            i38 = 890755099;
                                        } else {
                                            iM450222 = ThreadFactoryC3888.m11306("ۙ֨") ^ i35;
                                            i37 = ((iM450222 ^ i36) * 14543) ^ 1154612477;
                                            i38 = 1578741492;
                                        }
                                        break;
                                    case -1926460679:
                                    case 1807940432:
                                        if (C1977.f7413 <= 0) {
                                            iM450222 = C19806.m45029("֨ᩴ") ^ i36;
                                            i37 = ((iM450222 ^ i35) * 21695) ^ 1188165175;
                                            i38 = -759637418;
                                        } else {
                                            iM450222 = ThreadFactoryC3888.m11306("۟ܶ") ^ i35;
                                            i37 = ((iM450222 ^ i36) * (-7703)) ^ (-1729686518);
                                            i38 = -537459796;
                                        }
                                        break;
                                    case -1698305442:
                                    case -352816705:
                                        if (C3286.m9798() <= 0) {
                                            iM450222 = (C19806.m45029("ܺۙ") + i35) * 3;
                                            i37 = ((iM450222 ^ i36) * (-12025)) ^ 169076625;
                                            i38 = 890755099;
                                        } else {
                                            iM450222 = (i35 - ThreadFactoryC3888.m11306("ܰܰ")) * (-123);
                                            i37 = ((iM450222 ^ i36) * (-12255)) ^ 34471407;
                                            i38 = 1330802206;
                                        }
                                        break;
                                    case -1612143044:
                                    case -1609908654:
                                        if (C2788.f10625 >= 0) {
                                            iM450222 = ThreadFactoryC3888.m11306("۟ܶ") ^ i35;
                                            i37 = ((iM450222 ^ i36) * (-7703)) ^ (-1729686518);
                                            i38 = -537459796;
                                        } else {
                                            iM450222 = ThreadFactoryC3888.m11306("᩺᩸") ^ i36;
                                            i37 = ((iM450222 ^ i35) * (-2549)) ^ (-529453123);
                                            i38 = -267542999;
                                        }
                                        break;
                                    case -1166751983:
                                    case 86125453:
                                        if (RunnableC1895.f7152) {
                                            iM450222 = ThreadFactoryC3888.m11306("ۤۨ") ^ i35;
                                            i37 = ((iM450222 ^ i36) * 6107) ^ (-1159752746);
                                            i38 = 488692260;
                                        } else {
                                            iM450222 = (C19806.m45029("ܺۙ") + i35) * 3;
                                            i37 = ((iM450222 ^ i36) * (-12025)) ^ 169076625;
                                            i38 = 890755099;
                                        }
                                        break;
                                    case -762931562:
                                    case 1099042081:
                                        int i39 = C1192.f5292;
                                        this.f10204.cancel();
                                        break;
                                    case -497535432:
                                    case 1287529280:
                                        if (CallableC1627.f6528) {
                                            iM450222 = C19806.m45029("۫ܺ") ^ i36;
                                            i37 = ((iM450222 ^ i35) * (-22589)) ^ 1271339847;
                                            i38 = -85628818;
                                        } else {
                                            iM450222 = ThreadFactoryC3888.m11306("۟ܶ") ^ i35;
                                            i37 = ((iM450222 ^ i36) * (-7703)) ^ (-1729686518);
                                            i38 = -537459796;
                                        }
                                        break;
                                    case -311951581:
                                    case 45841562:
                                        if (CallableC1627.f6528) {
                                            iM450222 = C19806.m45029("᩻ܶ") ^ i36;
                                            i37 = ((iM450222 ^ i35) * 10899) ^ (-1965726658);
                                            i38 = 1979001696;
                                        } else {
                                            iM450222 = ThreadFactoryC3888.m11306("۟ܶ") ^ i35;
                                            i37 = ((iM450222 ^ i36) * (-7703)) ^ (-1729686518);
                                            i38 = -537459796;
                                        }
                                        break;
                                    case 40485063:
                                    case 1833669762:
                                        if (C19806.f63586) {
                                            iM450222 = ThreadFactoryC3888.m11306("ۜۡ") ^ i35;
                                            i37 = ((iM450222 ^ i36) * (-12761)) ^ 409218057;
                                            i38 = 1417748368;
                                        } else {
                                            iM450222 = ThreadFactoryC3888.m11306("ܿ᩺") ^ i35;
                                            i37 = ((iM450222 ^ i36) * (-4175)) ^ (-1296747325);
                                            i38 = 1767051180;
                                        }
                                        break;
                                    case 389793268:
                                    case 397506518:
                                        if (C0962.m3746() >= 0) {
                                            iM450222 = (C19806.m45029("ܺۙ") + i35) * 3;
                                            i37 = ((iM450222 ^ i36) * (-12025)) ^ 169076625;
                                            i38 = 890755099;
                                        } else {
                                            iM450222 = ThreadFactoryC3888.m11306("᩵ܳ") ^ i36;
                                            i37 = ((iM450222 ^ i35) * 2655) ^ (-606949480);
                                            i38 = 224981059;
                                        }
                                        break;
                                    case 529267778:
                                    case 1260043823:
                                        C1977.m6356();
                                        C1460.m5050();
                                        iM450222 = ThreadFactoryC3888.m11306("ۧܽ") ^ i36;
                                        i37 = ((iM450222 ^ i35) * 32761) ^ 1444196125;
                                        i38 = 1126069743;
                                        break;
                                    case 937172453:
                                    case 1159082713:
                                        if (!C3286.f12186) {
                                            iM450222 = ThreadFactoryC3888.m11306("۟ܶ") ^ i35;
                                            i37 = ((iM450222 ^ i36) * (-7703)) ^ (-1729686518);
                                            i38 = -537459796;
                                        } else {
                                            iM450222 = ThreadFactoryC3888.m11306("ۜۡ") ^ i35;
                                            i37 = ((iM450222 ^ i36) * (-12761)) ^ 409218057;
                                            i38 = 1417748368;
                                        }
                                        break;
                                    case 978962148:
                                    case 1738600532:
                                        if (C3743.f13569) {
                                            iM450222 = ThreadFactoryC3888.m11306("᩸ܶ") ^ i35;
                                            i37 = ((iM450222 ^ i36) * (-18059)) ^ (-1823087249);
                                            i38 = 448424457;
                                        } else {
                                            iM450222 = (C19806.m45029("ܺۙ") + i35) * 3;
                                            i37 = ((iM450222 ^ i36) * (-12025)) ^ 169076625;
                                            i38 = 890755099;
                                        }
                                        break;
                                    case 1494277004:
                                    case 1992855181:
                                        if (C1377.f5749) {
                                            iM450222 = C19806.m45029("᩷ۚ") ^ i36;
                                            i37 = ((iM450222 ^ i35) * 10823) ^ 69642488;
                                            i38 = -1404940385;
                                        } else {
                                            iM450222 = C19806.m45029("֨ᩴ") ^ i36;
                                            i37 = ((iM450222 ^ i35) * 21695) ^ 1188165175;
                                            i38 = -759637418;
                                        }
                                        break;
                                    default:
                                        RunnableC1564.m5345();
                                        if (C1937.f7317 < 0) {
                                            iM450222 = ThreadFactoryC3888.m11306("ۜۡ") ^ i35;
                                            i37 = ((iM450222 ^ i36) * (-12761)) ^ 409218057;
                                            i38 = 1417748368;
                                        } else {
                                            iM450222 = ThreadFactoryC3888.m11306("ۧܽ") ^ i36;
                                            i37 = ((iM450222 ^ i35) * 32761) ^ 1444196125;
                                            i38 = 1126069743;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    i5 = iM450212;
                    iM450214 = C19806.m45029(C3660.m10790(f5291, 174, 3, i23));
                    if (C1148.m4232() > 0) {
                        iM450211 = C19806.m45029("ܺۖ") ^ i20;
                        i14 = ((iM450211 ^ i19) * 25525) ^ (-1893619834);
                        i15 = 1667585764;
                        i22 = iM450211 ^ i15;
                        i21 = i14;
                        iM450212 = i5;
                    } else {
                        str2 = str4;
                        StringBuilder sb14 = sb3;
                        strM41586 = strM41586;
                        sb = sb14;
                        int iM113018 = (ThreadFactoryC3888.m11306("᩵֨") + i19) * 91;
                        i22 = iM113018 ^ (-553527446);
                        str4 = str2;
                        i21 = ((iM113018 ^ i20) * 16593) ^ 1349063528;
                        iM450212 = i5;
                        String str114 = strM41586;
                        sb3 = sb;
                        strM41586 = str114;
                    }
                    break;
                default:
                    sb = sb3;
                    i23 = 4072;
                    iM450210 = (ThreadFactoryC3888.m11306("۫ۧ") + i20) * (-61);
                    i21 = ((iM450210 ^ i19) * 17827) ^ (-215519273);
                    i9 = 348753105;
                    i22 = iM450210 ^ i9;
                    c1192 = this;
                    i25 = i25;
                    i24 = i24;
                    iM450212 = iM450212;
                    z2 = z2;
                    sArr3 = sArr3;
                    str4 = str4;
                    str3 = str3;
                    String str115 = strM41586;
                    sb3 = sb;
                    strM41586 = str115;
                    break;
            }
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        int i = 2144588474;
        int i2 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int i3 = C1025.f4800;
        int iM11306 = ThreadFactoryC3888.m11306("֨ᩳ") ^ i3;
        int i4 = ((iM11306 ^ i2) * 14311) ^ (-94168588);
        int i5 = -1863040151;
        while (true) {
            i = ((((i ^ i2) * (-6965)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2026164820:
                case -366996642:
                    RunnableC3388.m10052(this.f5294);
                    iM11306 = C19806.m45029("ܶۤ") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-13255)) ^ (-210484498);
                    i5 = -440927285;
                    break;
                case -1835477175:
                case 404588353:
                    if (C3535.f13026 <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۛۗ")) * 119;
                        i4 = ((iM11306 ^ i2) * 8543) ^ (-256688006);
                        i5 = 486238831;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۜ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 10993) ^ (-209792722);
                        i5 = 1883753637;
                    }
                    break;
                case -1663794881:
                case 1594928116:
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۛۗ")) * 119;
                        i4 = ((iM11306 ^ i2) * 8543) ^ (-256688006);
                        i5 = 486238831;
                    } else {
                        iM11306 = C19806.m45029("ۤᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-21677)) ^ (-490244451);
                        i5 = 865743601;
                    }
                    break;
                case -1657770783:
                case -1190004237:
                    if (C7105.f23796 < 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩷֨")) * (-33);
                        i4 = ((iM11306 ^ i2) * 13705) ^ 1250293615;
                        i5 = 797957670;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶۘ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-23135)) ^ 263625972;
                        i5 = 480374514;
                    }
                    break;
                case -1594454434:
                case 632289788:
                    if (C1977.f7413 <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۛۗ")) * 119;
                        i4 = ((iM11306 ^ i2) * 8543) ^ (-256688006);
                        i5 = 486238831;
                    } else {
                        iM11306 = C19806.m45029("ۘᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 29455) ^ (-226613452);
                        i5 = -1755545641;
                    }
                    break;
                case -1593885522:
                case 921439607:
                    if (C0797.f3386) {
                        iM11306 = (C19806.m45029("᩶ۨ") + i2) * (-105);
                        i4 = ((iM11306 ^ i3) * (-2355)) ^ 1144591638;
                        i5 = -413052801;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧۙ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-21375)) ^ (-1194172319);
                        i5 = 1281730850;
                    }
                    break;
                case -1404155620:
                case 1078296173:
                    if (C0278.f1572 <= 0) {
                        iM11306 = (C19806.m45029("᩶ۨ") + i2) * (-105);
                        i4 = ((iM11306 ^ i3) * (-2355)) ^ 1144591638;
                        i5 = -413052801;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛ᩺") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-18977)) ^ 1479521442;
                        i5 = 1711023998;
                    }
                    break;
                case -1351665949:
                case 711245765:
                    if (C0216.f1393 != 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۛۗ")) * 119;
                        i4 = ((iM11306 ^ i2) * 8543) ^ (-256688006);
                        i5 = 486238831;
                    } else {
                        iM11306 = C19806.m45029("᩻۬") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-9891)) ^ 1693637795;
                        i5 = -517773274;
                    }
                    break;
                case -1187979982:
                case 1863800543:
                    if (RunnableC1895.f7152) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴۜ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-28053)) ^ (-686237115);
                        i5 = -107890226;
                    } else {
                        iM11306 = (C19806.m45029("ܿ֡") ^ i2) * 55;
                        i4 = ((iM11306 ^ i3) * (-32513)) ^ (-638428282);
                        i5 = 177341762;
                    }
                    break;
                case -989930442:
                case 163352845:
                    if (CallableC1627.f6528) {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ᩴ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-17445)) ^ 1963639707;
                        i5 = 1770153671;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۛۗ")) * 119;
                        i4 = ((iM11306 ^ i2) * 8543) ^ (-256688006);
                        i5 = 486238831;
                    }
                    break;
                case -871302049:
                case 498555377:
                    C0962.m3746();
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩷֨")) * (-33);
                        i4 = ((iM11306 ^ i2) * 13705) ^ 1250293615;
                        i5 = 797957670;
                    } else {
                        iM11306 = (C19806.m45029("᩶ۨ") + i2) * (-105);
                        i4 = ((iM11306 ^ i3) * (-2355)) ^ 1144591638;
                        i5 = -413052801;
                    }
                    break;
                case -578796414:
                case 912164091:
                    if (C1419.f5860 >= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩷֨")) * (-33);
                        i4 = ((iM11306 ^ i2) * 13705) ^ 1250293615;
                        i5 = 797957670;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ۜܳ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM11306 ^ i3) * (-25617)) ^ 1508774279;
                        i5 = 1642565477;
                    }
                    break;
                case -303360354:
                case 514440730:
                    C3722.m10894();
                    if (!C2704.f10408) {
                        iM11306 = (C19806.m45029("ܿ֡") ^ i2) * 55;
                        i4 = ((iM11306 ^ i3) * (-32513)) ^ (-638428282);
                        i5 = 177341762;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩷֨")) * (-33);
                        i4 = ((iM11306 ^ i2) * 13705) ^ 1250293615;
                        i5 = 797957670;
                    }
                    break;
                case 244108286:
                case 831629112:
                    if (MenuItemOnMenuItemClickListenerC3244.m9712(c5202)) {
                        iM11306 = C19806.m45029("ܶۤ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-13255)) ^ (-210484498);
                        i5 = -440927285;
                    } else {
                        iM11306 = C19806.m45029("᩷ۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 20891) ^ (-1506139994);
                        i5 = 1468654119;
                    }
                    break;
                case 415828374:
                case 922104740:
                    RunnableC0195.m1431();
                    C0629.m2907();
                    iM11306 = (C19806.m45029("᩶ۨ") + i2) * (-105);
                    i4 = ((iM11306 ^ i3) * (-2355)) ^ 1144591638;
                    i5 = -413052801;
                    break;
                case 690190313:
                case 2024294556:
                    if (C1419.f5860 >= 0) {
                        iM11306 = (C19806.m45029("᩶ۨ") + i2) * (-105);
                        i4 = ((iM11306 ^ i3) * (-2355)) ^ 1144591638;
                        i5 = -413052801;
                    } else {
                        iM11306 = C19806.m45029("ۗᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 6633) ^ 1851998077;
                        i5 = 33408869;
                    }
                    break;
                case 1152209178:
                case 1152714770:
                    break;
                default:
                    C19806.m45024();
                    C1875.m6086();
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5719;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        int i = -1027434824;
        int i2 = C0050.f912;
        int i3 = C1875.f7103;
        int iM45029 = (i2 - C19806.m45029("ᩳ֫")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
        int i4 = ((iM45029 ^ i3) * (-13413)) ^ (-589942203);
        int i5 = 1352977377;
        while (true) {
            i = ((((i ^ i3) * (-31581)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1975562571:
                case -1834986391:
                    if (C1937.f7317 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧۜ") + i3) * (-73);
                        i4 = ((iM45029 ^ i2) * (-3329)) ^ 1140341340;
                        i5 = -1637754836;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ۜ") ^ i3) * (-69);
                        i4 = ((iM45029 ^ i2) * 24371) ^ (-1236768560);
                        i5 = 2000001381;
                    }
                    break;
                case -1934872277:
                case -153916382:
                    if (C3660.f13403 >= 0) {
                        iM45029 = (C19806.m45029("᩺ۢ") ^ i2) * 101;
                        i4 = ((iM45029 ^ i3) * (-95)) ^ (-1412496706);
                        i5 = -914909639;
                    } else {
                        iM45029 = C19806.m45029("᩹ۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 27313) ^ (-1173182526);
                        i5 = 1491934736;
                    }
                    break;
                case -1873185430:
                case -210443699:
                    if (C0629.f2722 <= 0) {
                        iM45029 = (C19806.m45029("᩺ۢ") ^ i2) * 101;
                        i4 = ((iM45029 ^ i3) * (-95)) ^ (-1412496706);
                        i5 = -914909639;
                    } else {
                        iM45029 = (C19806.m45029("۬۠") ^ i2) * (-39);
                        i4 = ((iM45029 ^ i3) * 22289) ^ 951201659;
                        i5 = -1822629667;
                    }
                    break;
                case -1803379379:
                case -1654928986:
                    if (RunnableC1564.m5345()) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ܰ") + i3) * (-101);
                        i4 = ((iM45029 ^ i2) * (-21333)) ^ 1390805606;
                        i5 = 1828819109;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ܳ") ^ i2) * (-73);
                        i4 = ((iM45029 ^ i3) * (-14721)) ^ (-2084825852);
                        i5 = -2139056543;
                    }
                    break;
                case -1470849453:
                case 1740328885:
                    C19806.m45024();
                    if (!C3743.f13569) {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ۛ") + i3) * (-41);
                        i4 = ((iM45029 ^ i2) * (-22453)) ^ (-1671906353);
                        i5 = -2076804499;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ܰ") + i3) * (-101);
                        i4 = ((iM45029 ^ i2) * (-21333)) ^ 1390805606;
                        i5 = 1828819109;
                    }
                    break;
                case -1297891278:
                case 1499273427:
                    C1460.m5050();
                    iM45029 = (C19806.m45029("᩺ۢ") ^ i2) * 101;
                    i4 = ((iM45029 ^ i3) * (-95)) ^ (-1412496706);
                    i5 = -914909639;
                    break;
                case -1277217227:
                case -933006319:
                    if (C7105.m18985()) {
                        iM45029 = C19806.m45029("۠᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * 9535) ^ (-627458943);
                        i5 = 730937793;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۧܿ")) * 119;
                        i4 = ((iM45029 ^ i3) * (-18935)) ^ (-1159277985);
                        i5 = -1959849890;
                    }
                    break;
                case -1257019322:
                case -858276745:
                    break;
                case -1142625427:
                case 1889776322:
                    C2871.m8646();
                    if (!C3743.f13569) {
                        iM45029 = C19806.m45029("۠᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * 9535) ^ (-627458943);
                        i5 = 730937793;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ܰ") + i3) * (-101);
                        i4 = ((iM45029 ^ i2) * (-21333)) ^ 1390805606;
                        i5 = 1828819109;
                    }
                    break;
                case -988114514:
                case 1241640298:
                    C1398.m4895();
                    break;
                case -948436036:
                case 1262503720:
                    if (C0797.f3386) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ܰ") + i3) * (-101);
                        i4 = ((iM45029 ^ i2) * (-21333)) ^ 1390805606;
                        i5 = 1828819109;
                    } else {
                        iM45029 = (C19806.m45029("᩺ۛ") ^ i3) * (-119);
                        i4 = ((iM45029 ^ i2) * 25801) ^ 2103167072;
                        i5 = 1490780193;
                    }
                    break;
                case -868747732:
                case -330718429:
                    if (C1668.f6641 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧۜ") + i3) * (-73);
                        i4 = ((iM45029 ^ i2) * (-3329)) ^ 1140341340;
                        i5 = -1637754836;
                    } else {
                        iM45029 = C19806.m45029("ᩳۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 30077) ^ (-358608755);
                        i5 = -1168824596;
                    }
                    break;
                case -705309039:
                case 464728537:
                    C3872.m11210(main, this.f5294, C16737.m39293());
                    iM45029 = (ThreadFactoryC3888.m11306("֫᩸") + i2) * 59;
                    i4 = ((iM45029 ^ i3) * 23363) ^ (-1994621274);
                    i5 = 1121432519;
                    break;
                case -325018802:
                case 1326691142:
                    if (C1461.m5079(c5202)) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘۛ") + i3) * (-63);
                        i4 = ((iM45029 ^ i2) * (-5585)) ^ 1639302517;
                        i5 = 84243305;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫᩸") + i2) * 59;
                        i4 = ((iM45029 ^ i3) * 23363) ^ (-1994621274);
                        i5 = 1121432519;
                    }
                    break;
                case 215776692:
                case 911461675:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = C19806.m45029("ۙᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 30147) ^ (-677481728);
                        i5 = -561372368;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ۛ") + i3) * (-41);
                        i4 = ((iM45029 ^ i2) * (-22453)) ^ (-1671906353);
                        i5 = -2076804499;
                    }
                    break;
                case 516105324:
                case 736491616:
                    if (C0050.m946() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧۜ") + i3) * (-73);
                        i4 = ((iM45029 ^ i2) * (-3329)) ^ 1140341340;
                        i5 = -1637754836;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ܶۤ")) * (-39);
                        i4 = ((iM45029 ^ i3) * 24071) ^ (-1207719649);
                        i5 = 1769591961;
                    }
                    break;
                case 1365708687:
                case 1686090114:
                    if (C7105.f23796 >= 0) {
                        iM45029 = (C19806.m45029("᩺ۢ") ^ i2) * 101;
                        i4 = ((iM45029 ^ i3) * (-95)) ^ (-1412496706);
                        i5 = -914909639;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢ᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * 30027) ^ 1330706962;
                        i5 = -168634347;
                    }
                    break;
                default:
                    CallableC1627.m5507();
                    if (C2477.f9839 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ܰ") + i3) * (-101);
                        i4 = ((iM45029 ^ i2) * (-21333)) ^ 1390805606;
                        i5 = 1828819109;
                    } else {
                        iM45029 = (C19806.m45029("᩺ۢ") ^ i2) * 101;
                        i4 = ((iM45029 ^ i3) * (-95)) ^ (-1412496706);
                        i5 = -914909639;
                    }
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 26181. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final l.C5202 mo3077() {
        /*
            Method dump skipped, instruction units count: 2618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1192.mo3077():l.ۚ۟ۜ");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b5 A[PHI: r3
      0x00b5: PHI (r3v5 java.lang.String) = (r3v4 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String) binds: [B:27:0x00b3, B:15:0x006e, B:9:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01ce A[PHI: r8 r13 r14 r15
      0x01ce: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v4 int) binds: [B:39:0x0138, B:17:0x0072, B:15:0x006e, B:12:0x0065, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x01ce: PHI (r13v4 short[]) = (r13v3 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:39:0x0138, B:17:0x0072, B:15:0x006e, B:12:0x0065, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x01ce: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:39:0x0138, B:17:0x0072, B:15:0x006e, B:12:0x0065, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x01ce: PHI (r15v4 int) = (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:39:0x0138, B:17:0x0072, B:15:0x006e, B:12:0x0065, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0235 A[PHI: r4 r9 r10 r11 r21
      0x0235: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:60:0x0233, B:50:0x01b2, B:23:0x008e, B:9:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0235: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:60:0x0233, B:50:0x01b2, B:23:0x008e, B:9:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0235: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:60:0x0233, B:50:0x01b2, B:23:0x008e, B:9:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0235: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:60:0x0233, B:50:0x01b2, B:23:0x008e, B:9:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0235: PHI (r21v5 char) = (r21v4 char), (r21v3 char), (r21v3 char), (r21v3 char) binds: [B:60:0x0233, B:50:0x01b2, B:23:0x008e, B:9:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0265 A[PHI: r1 r16
      0x0265: PHI (r1v4 java.lang.String) = (r1v2 java.lang.String), (r1v3 java.lang.String), (r1v2 java.lang.String) binds: [B:64:0x0263, B:35:0x0115, B:12:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:64:0x0263, B:35:0x0115, B:12:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        int iM45029;
        int i;
        int i2;
        int i3 = RunnableC3388.f12514;
        int i4 = C2124.f7782;
        int iM450210 = (i3 - C19806.m45029("۟ۘ")) * 35;
        int i5 = ((iM450210 ^ i4) * (-8771)) ^ (-288634410);
        String strM6164 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM450210 ^ (-1151050711);
        int iM450211 = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1755002617;
        char c = 0;
        String[] strArr = null;
        String strM1774 = null;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i4) * (-7431)) >> 31));
            switch (i14) {
                case -1988911842:
                case 871516402:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘۘ") ^ i4) * 43;
                        i = ((iM45029 ^ i3) * 16411) ^ (-1047321684);
                        i2 = 839900436;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩶ܳ")) * (-33);
                        i = ((iM45029 ^ i4) * 14715) ^ 922455988;
                        i2 = 1162544659;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1752341233:
                case 334389416:
                    return C0216.m1574(2099969470 ^ iM450211, strArr);
                case -1725513358:
                case -1153955459:
                    i8 = i7 * i7;
                    i9 = s * s;
                    i10 = 252714609;
                    if (C2788.m8472() != 0) {
                        iM45029 = C19806.m45029("᩹ܿ") ^ i3;
                        i = ((iM45029 ^ i4) * (-24231)) ^ 186765166;
                        i2 = 393238343;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۜ᩸")) * (-99);
                        i = ((iM45029 ^ i4) * (-15743)) ^ 421067425;
                        i2 = 35599984;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1717350306:
                case 1188455813:
                    i11 = 16689;
                    iM45029 = (i4 - C19806.m45029("ۙᩳ")) * (-111);
                    i = ((iM45029 ^ i3) * (-32305)) ^ 1652634026;
                    i2 = -1751440950;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1691955568:
                case 38363010:
                    strM6164 = RunnableC1895.m6164(sArr3, 182, 3, i11);
                    if (C2124.m6673() <= 0) {
                        iM45029 = C19806.m45029("֫ۜ") ^ i3;
                        i = ((iM45029 ^ i4) * (-9903)) ^ 1378880748;
                        i2 = -1172172802;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ܽ") ^ i4) * 81;
                        i = ((iM45029 ^ i3) * 14363) ^ 1433901231;
                        i2 = 900422267;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1652307069:
                case -1268563413:
                    sArr2 = f5291;
                    i12 = 178;
                    i13 = 4;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = (i3 - C19806.m45029("᩶ܳ")) * (-33);
                        i = ((iM45029 ^ i4) * 14715) ^ 922455988;
                        i2 = 1162544659;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۘ") ^ i3;
                        i = ((iM45029 ^ i4) * 17309) ^ 605090490;
                        i2 = -248850148;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1585967656:
                case 560374363:
                    sArr = f5291;
                    if (C0797.f3386) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘۘ") ^ i4) * 43;
                        i = ((iM45029 ^ i3) * 16411) ^ (-1047321684);
                        i2 = 839900436;
                    } else {
                        iM45029 = (C19806.m45029("᩵ᩳ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM45029 ^ i4) * (-5029)) ^ 138127838;
                        i2 = 1650280017;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1178880608:
                case -570811456:
                    c = 177;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = C19806.m45029("᩹ܿ") ^ i3;
                        i = ((iM45029 ^ i4) * (-24231)) ^ 186765166;
                        i2 = 393238343;
                    } else {
                        iM45029 = C19806.m45029("ۢ۬") ^ i4;
                        i = ((iM45029 ^ i3) * (-25687)) ^ 942488299;
                        i2 = 1314682417;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -855424459:
                case 969354352:
                    s = sArr[c];
                    if (C0050.f912 <= 0) {
                        iM45029 = C19806.m45029("ۜۘ") ^ i4;
                        i = ((iM45029 ^ i3) * (-22437)) ^ (-1485303862);
                        i2 = 1571429520;
                    } else {
                        iM45029 = C19806.m45029("ۧۨ") ^ i3;
                        i = ((iM45029 ^ i4) * 10633) ^ 582846536;
                        i2 = -1252944897;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -836254502:
                case -404632441:
                    int i15 = i9 + i10;
                    if ((i15 + i15) - i8 < 0) {
                        iM45029 = C19806.m45029("֫ۧ") ^ i3;
                        i = ((iM45029 ^ i4) * (-32139)) ^ (-1921877405);
                        i2 = -733420830;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗۖ") ^ i4) * (-73);
                        i = ((iM45029 ^ i3) * 25025) ^ (-1071555928);
                        i2 = -1570446839;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -601405206:
                case 1246275009:
                    i11 = 5284;
                    iM45029 = (i4 - C19806.m45029("ۙᩳ")) * (-111);
                    i = ((iM45029 ^ i3) * (-32305)) ^ 1652634026;
                    i2 = -1751440950;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -580408594:
                case -419395731:
                    C2477.m7593();
                    return null;
                case -486583211:
                case -464101199:
                    iM450211 = C19806.m45029(strM6164);
                    if (C3535.f13026 <= 0) {
                        iM45029 = C19806.m45029("᩹ܿ") ^ i3;
                        i = ((iM45029 ^ i4) * (-24231)) ^ 186765166;
                        i2 = 393238343;
                    } else {
                        iM45029 = C19806.m45029("֫ܽ") ^ i4;
                        i = ((iM45029 ^ i3) * (-28019)) ^ 970873385;
                        i2 = -535407114;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 196666677:
                case 707871207:
                    C0278.m1789();
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = C19806.m45029("֫ۜ") ^ i3;
                        i = ((iM45029 ^ i4) * (-9903)) ^ 1378880748;
                        i2 = -1172172802;
                    } else {
                        iM45029 = C19806.m45029("᩹ܿ") ^ i3;
                        i = ((iM45029 ^ i4) * (-24231)) ^ 186765166;
                        i2 = 393238343;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 606226640:
                case 1506360713:
                    C2249.m6915();
                    C0671.m3008();
                    iM45029 = (i3 - C19806.m45029("᩶ܳ")) * (-33);
                    i = ((iM45029 ^ i4) * 14715) ^ 922455988;
                    i2 = 1162544659;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 622296525:
                case 1835944867:
                    C1668.m5583();
                    if (C2124.f7782 > 0) {
                        iM45029 = (i3 - C19806.m45029("᩶ܳ")) * (-33);
                        i = ((iM45029 ^ i4) * 14715) ^ 922455988;
                        i2 = 1162544659;
                    } else {
                        iM45029 = C19806.m45029("֫ۜ") ^ i3;
                        i = ((iM45029 ^ i4) * (-9903)) ^ 1378880748;
                        i2 = -1172172802;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1240239321:
                case 1865085506:
                    strM1774 = C0278.m1774(sArr2, i12, i13, i11);
                    if (C2871.f10837 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘۘ") ^ i4) * 43;
                        i = ((iM45029 ^ i3) * 16411) ^ (-1047321684);
                        i2 = 839900436;
                    } else {
                        iM45029 = (C19806.m45029("ܽۜ") ^ i4) * 79;
                        i = ((iM45029 ^ i3) * (-30887)) ^ (-665677780);
                        i2 = -1243073745;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1562037283:
                case 1954340148:
                    strArr = new String[]{m41569(strM1774)};
                    sArr3 = f5291;
                    if (C2249.f8050 >= 0) {
                        iM45029 = C19806.m45029("ۜۘ") ^ i4;
                        i = ((iM45029 ^ i3) * (-22437)) ^ (-1485303862);
                        i2 = 1571429520;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM450212 = (i3 - C19806.m45029("ۡ֫")) * (-29);
                        i5 = ((iM450212 ^ i4) * 25259) ^ (-1073820786);
                        i6 = iM450212 ^ 464795229;
                    }
                    break;
                default:
                    i7 = s + 15897;
                    if (C1875.m6086() != 0) {
                        iM45029 = (i3 - C19806.m45029("᩶ܳ")) * (-33);
                        i = ((iM45029 ^ i4) * 14715) ^ 922455988;
                        i2 = 1162544659;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧܳ") + i4) * (-121);
                        i = ((iM45029 ^ i3) * (-23811)) ^ 1818882505;
                        i2 = -869461380;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }
}
