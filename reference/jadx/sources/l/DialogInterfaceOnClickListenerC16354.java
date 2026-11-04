package l;

import android.app.Application;
import android.content.DialogInterface;
import android.view.View;
import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.HashMap;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܶ᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1VR */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogInterfaceOnClickListenerC16354 implements DialogInterface.OnClickListener, View.OnClickListener {

    /* JADX INFO: renamed from: ܰ᩺۫, reason: not valid java name and contains not printable characters */
    private static final short[] f53094 = {872, 18913, 18911, 18891, 18917, 18888, 18835, 18937, 18911, 18889, 18910, 18882, 18893, 18881, 18889, 18937, 18911, 18889, 18910, 18936, 18901, 18908, 18889, 18894, 18905, 18904, 18904, 18883, 18882, 18926, 18905, 18904, 18904, 18883, 18882, 18908, 18905, 18911, 18884, 18817, 18895, 18880, 18885, 18895, 18887, 1900, -2397, -2403, -2423, -2393, -2422, -2351, -2373, -2403, -2421, -2404, -2432, -2417, -2429, -2421, -2373, -2403, -2421, -2404, -2374, -2409, -2402, -2421, -2420, -2405, -2406, -2406, -2431, -2432, -2388, -2405, -2406, -2406, -2431, -2432, -2402, -2405, -2403, -2426, -2365, -2419, -2430, -2425, -2419, -2427};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Runnable f53095;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f53096;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f53097;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f53098;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f53099;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m38848(DialogInterfaceOnClickListenerC16354 dialogInterfaceOnClickListenerC16354) {
        return dialogInterfaceOnClickListenerC16354.f53098;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ String m38850(DialogInterfaceOnClickListenerC16354 dialogInterfaceOnClickListenerC16354) {
        return dialogInterfaceOnClickListenerC16354.f53096;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x029e A[PHI: r2 r13 r20 r21
      0x029e: PHI (r2v5 java.util.HashMap) = (r2v3 java.util.HashMap), (r2v2 java.util.HashMap), (r2v2 java.util.HashMap) binds: [B:66:0x029c, B:55:0x020d, B:14:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x029e: PHI (r13v5 short[]) = (r13v3 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:66:0x029c, B:55:0x020d, B:14:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x029e: PHI (r20v29 java.lang.Runnable) = (r20v7 java.lang.Runnable), (r20v11 java.lang.Runnable), (r20v35 java.lang.Runnable) binds: [B:66:0x029c, B:55:0x020d, B:14:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x029e: PHI (r21v6 java.lang.String) = (r21v4 java.lang.String), (r21v3 java.lang.String), (r21v3 java.lang.String) binds: [B:66:0x029c, B:55:0x020d, B:14:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007a, code lost:
    
        if (l.C2375.f7641 > 0) goto L13;
     */
    @Override // android.content.DialogInterface.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.content.DialogInterface r24, int r25) {
        /*
            Method dump skipped, instruction units count: 1150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.DialogInterfaceOnClickListenerC16354.onClick(android.content.DialogInterface, int):void");
    }

    public DialogInterfaceOnClickListenerC16354(int i, int i2) {
        int i3 = 583106360;
        int i4 = C0269.f1558;
        int i5 = C2287.f7432;
        int iM2761 = C0619.m2761("۠֫") ^ i4;
        int i6 = ((iM2761 ^ i5) * 13601) ^ (-783821662);
        int i7 = -2028534306;
        while (true) {
            i3 = ((((i3 ^ i5) * 8859) >> 31) & i6) ^ (iM2761 ^ i7);
            switch (i3) {
                case -2120912157:
                case -585223996:
                    if (C0862.m3503()) {
                        iM2761 = C0773.m3169("᩷ܿ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 9107) ^ 1696696809;
                        i7 = -1752398183;
                    } else {
                        iM2761 = C0773.m3169("ᩴ᩷") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-21389)) ^ 1101576528;
                        i7 = -579005359;
                    }
                    break;
                case -1743534901:
                case 395846456:
                    this.f53097 = i2;
                    return;
                case -1640741790:
                case 1199570192:
                    C3099.m10095();
                    if (RunnableC3055.f9898 < 0) {
                        iM2761 = C0773.m3169("ᩴ۟") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-4893)) ^ 1157187701;
                        i7 = 679702467;
                    } else {
                        iM2761 = (C0773.m3169("ᩴܽ") ^ i5) * 5;
                        i6 = ((iM2761 ^ i4) * 25135) ^ 130327617;
                        i7 = 1422512852;
                    }
                    break;
                case -1634310639:
                case -973087587:
                    if (C17202.f56030) {
                        iM2761 = (C0773.m3169("ۤᩴ") + i5) * (-37);
                        i6 = ((iM2761 ^ i4) * (-26129)) ^ 1283219733;
                        i7 = 1933651690;
                    } else {
                        iM2761 = C0773.m3169("ᩴ᩷") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-21389)) ^ 1101576528;
                        i7 = -579005359;
                    }
                    break;
                case -1471068406:
                case -179197227:
                    this.f53099 = i;
                    if (RunnableC1848.f6235) {
                        iM2761 = C0773.m3169("ۨۘ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 18837) ^ (-1153153876);
                        i7 = 1748613631;
                    } else {
                        iM2761 = C0619.m2761("ۛ۟") ^ i4;
                        i6 = ((iM2761 ^ i5) * 4189) ^ 1613471647;
                        i7 = -930312611;
                    }
                    break;
                case -1466447071:
                case -448343293:
                    C23916.m53419();
                    if (!C0619.f2439) {
                        iM2761 = (C0773.m3169("ᩴܽ") ^ i5) * 5;
                        i6 = ((iM2761 ^ i4) * 25135) ^ 130327617;
                        i7 = 1422512852;
                    } else {
                        iM2761 = C0773.m3169("᩸֨") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-23945)) ^ 787527768;
                        i7 = 1449422380;
                    }
                    break;
                case -1235171568:
                case -991219416:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = (C0773.m3169("ᩴܽ") ^ i5) * 5;
                        i6 = ((iM2761 ^ i4) * 25135) ^ 130327617;
                        i7 = 1422512852;
                    } else {
                        iM2761 = C0773.m3169("ۗ᩹") ^ i4;
                        i6 = ((iM2761 ^ i5) * 5509) ^ 1492400450;
                        i7 = -587025696;
                    }
                    break;
                case -1229158886:
                case 430475012:
                    if (C1783.f6087 <= 0) {
                        iM2761 = (C0773.m3169("ᩴܽ") ^ i5) * 5;
                        i6 = ((iM2761 ^ i4) * 25135) ^ 130327617;
                        i7 = 1422512852;
                    } else {
                        iM2761 = C0619.m2761("֡᩶") ^ i4;
                        i6 = ((iM2761 ^ i5) * 639) ^ (-147275011);
                        i7 = 951286920;
                    }
                    break;
                case -1087637416:
                case 254957705:
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0773.m3169("ۨۘ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 18837) ^ (-1153153876);
                        i7 = 1748613631;
                    } else {
                        iM2761 = C0619.m2761("ۙܳ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-11685)) ^ (-287589540);
                        i7 = 1157395547;
                    }
                    break;
                case -734043740:
                case -726734700:
                    C1519.m5403();
                    RunnableC3055.m9933();
                    iM2761 = C0773.m3169("᩸֨") ^ i4;
                    i6 = ((iM2761 ^ i5) * (-23945)) ^ 787527768;
                    i7 = 1449422380;
                    break;
                case -406139610:
                case 1232453843:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0773.m3169("ᩴ᩷") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-21389)) ^ 1101576528;
                        i7 = -579005359;
                    } else {
                        iM2761 = (C0773.m3169("ۨ۠") ^ i5) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i6 = ((iM2761 ^ i4) * (-1361)) ^ (-960644075);
                        i7 = -883050520;
                    }
                    break;
                case -231161139:
                case 1907740018:
                    C4282.m13644();
                    if (C1826.f6190 <= 0) {
                        iM2761 = C0773.m3169("ۨۘ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 18837) ^ (-1153153876);
                        i7 = 1748613631;
                    } else {
                        iM2761 = C0773.m3169("᩸֨") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-23945)) ^ 787527768;
                        i7 = 1449422380;
                    }
                    break;
                case -230374275:
                case 1729168859:
                    if (C2878.f9462) {
                        iM2761 = C0773.m3169("ᩴ۟") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-4893)) ^ 1157187701;
                        i7 = 679702467;
                    } else {
                        iM2761 = (i5 - C0619.m2761("ۘܺ")) * 17;
                        i6 = ((iM2761 ^ i4) * 17693) ^ 282618102;
                        i7 = -1742050797;
                    }
                    break;
                case 401943650:
                case 2113832450:
                    if (C0619.f2439) {
                        iM2761 = C0773.m3169("ᩴ۟") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-4893)) ^ 1157187701;
                        i7 = 679702467;
                    } else {
                        iM2761 = (C0773.m3169("ۘۜ") ^ i4) * 15;
                        i6 = ((iM2761 ^ i5) * (-28967)) ^ (-2093433317);
                        i7 = 402906705;
                    }
                    break;
                case 1101206529:
                case 1888981310:
                    if (C3779.m12264()) {
                        iM2761 = (i4 - C0619.m2761("ۚۤ")) * (-55);
                        i6 = ((iM2761 ^ i5) * 16557) ^ (-621811288);
                        i7 = 1183975468;
                    } else {
                        iM2761 = C0773.m3169("ᩴ᩷") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-21389)) ^ 1101576528;
                        i7 = -579005359;
                    }
                    break;
                default:
                    C2375.m8065();
                    throw new RuntimeException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0203 A[PHI: r6 r13 r22
      0x0203: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v8 int) binds: [B:59:0x0201, B:20:0x0090, B:51:0x01b3] A[DONT_GENERATE, DONT_INLINE]
      0x0203: PHI (r13v3 java.lang.StringBuilder) = (r13v2 java.lang.StringBuilder), (r13v2 java.lang.StringBuilder), (r13v14 java.lang.StringBuilder) binds: [B:59:0x0201, B:20:0x0090, B:51:0x01b3] A[DONT_GENERATE, DONT_INLINE]
      0x0203: PHI (r22v37 java.lang.Runnable) = (r22v10 java.lang.Runnable), (r22v22 java.lang.Runnable), (r22v49 java.lang.Runnable) binds: [B:59:0x0201, B:20:0x0090, B:51:0x01b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x029a A[PHI: r2 r15 r22 r24
      0x029a: PHI (r2v3 java.util.HashMap) = (r2v2 java.util.HashMap), (r2v2 java.util.HashMap), (r2v4 java.util.HashMap) binds: [B:37:0x012d, B:16:0x0084, B:6:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r15v3 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v4 short[]) binds: [B:37:0x012d, B:16:0x0084, B:6:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r22v26 java.lang.Runnable) = (r22v12 java.lang.Runnable), (r22v25 java.lang.Runnable), (r22v27 java.lang.Runnable) binds: [B:37:0x012d, B:16:0x0084, B:6:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r24v2 java.lang.String) = (r24v1 java.lang.String), (r24v1 java.lang.String), (r24v3 java.lang.String) binds: [B:37:0x012d, B:16:0x0084, B:6:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM2761;
        int i;
        int i2;
        String strM10092;
        int iM2762;
        int i3;
        String str;
        int i4;
        String str2;
        int iM2763;
        int i5;
        int i6;
        int i7;
        DialogInterfaceOnClickListenerC16354 dialogInterfaceOnClickListenerC16354 = this;
        int i8 = -1316230421;
        int i9 = RunnableC3055.f9898;
        int i10 = C1826.f6190;
        int iM3169 = C0773.m3169("ܶ᩵") ^ i9;
        int i11 = ((iM3169 ^ i10) * 13035) ^ (-2060717425);
        int i12 = iM3169 ^ 135460730;
        String strM7760 = null;
        String str3 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        HashMap map = null;
        int i13 = 0;
        int i14 = 0;
        StringBuilder sb = null;
        char c = 0;
        short s = 0;
        int i15 = 0;
        Runnable runnable = null;
        short[] sArr4 = null;
        int i16 = 0;
        Application applicationM10096 = null;
        String strM6952 = null;
        int i17 = 0;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i10) * (-27889)) >> 31));
            switch (i8) {
                case -1947136582:
                case -502335231:
                    runnable = runnable;
                    str = strM7760;
                    sArr = f53094;
                    c = '-';
                    if (C2288.f7433 <= 0) {
                        int iM31610 = C0773.m3169("ۙ֨") ^ i9;
                        i11 = ((iM31610 ^ i10) * (-15537)) ^ (-1637338726);
                        i4 = iM31610 ^ (-677314857);
                        strM7760 = str;
                        runnable = runnable;
                        sb = null;
                    } else {
                        int iM2764 = C0619.m2761("ۗܰ") ^ i10;
                        i11 = ((iM2764 ^ i9) * (-1669)) ^ 1471823855;
                        i4 = iM2764 ^ 1273120924;
                        strM7760 = str;
                        runnable = runnable;
                    }
                    i12 = i4;
                    dialogInterfaceOnClickListenerC16354 = this;
                    break;
                case -1893778985:
                case 1170623936:
                    runnable = runnable;
                    C3779.m12269(sb, i17);
                    strM6952 = C2023.m6952(sb);
                    sArr3 = f53094;
                    if (C1146.f4234 >= 0) {
                        iM2761 = (C0773.m3169("ۧۨ") + i10) * (-27);
                        i = ((iM2761 ^ i9) * (-17327)) ^ (-211934656);
                        i2 = -1851374438;
                    } else {
                        iM2761 = (C0773.m3169("᩷ۨ") + i10) * (-107);
                        i = ((iM2761 ^ i9) * (-26143)) ^ (-2069851410);
                        i2 = -386664038;
                    }
                    int i18 = iM2761 ^ i2;
                    runnable = runnable;
                    i12 = i18;
                    i11 = i;
                    break;
                case -1758584262:
                case 187671544:
                    RunnableC3055.m9933();
                    if (C1321.f4751 >= 0) {
                        runnable = runnable;
                        iM2761 = (C0619.m2761("ۙ᩹") + i9) * (-53);
                        i = ((iM2761 ^ i10) * 11127) ^ (-831429399);
                        i2 = 522424578;
                        int i19 = iM2761 ^ i2;
                        runnable = runnable;
                        i12 = i19;
                        i11 = i;
                    }
                    runnable = runnable;
                    iM2761 = (C0773.m3169("ۧۨ") + i10) * (-27);
                    i = ((iM2761 ^ i9) * (-17327)) ^ (-211934656);
                    i2 = -1851374438;
                    int i110 = iM2761 ^ i2;
                    runnable = runnable;
                    i12 = i110;
                    i11 = i;
                    break;
                case -1729314066:
                case -532031462:
                    C4282.m13644();
                    runnable = runnable;
                    iM2761 = (C0773.m3169("ۧۨ") + i10) * (-27);
                    i = ((iM2761 ^ i9) * (-17327)) ^ (-211934656);
                    i2 = -1851374438;
                    int i111 = iM2761 ^ i2;
                    runnable = runnable;
                    i12 = i111;
                    i11 = i;
                    break;
                case -1721039469:
                case 789028930:
                    runnable = runnable;
                    str2 = strM7760;
                    short s2 = sArr[c];
                    int i20 = s2 + 3944;
                    if (C2310.f7472 < 0) {
                        int iM2765 = (i9 - C0619.m2761("֡ۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        int i21 = ((iM2765 ^ i10) * 13043) ^ (-1152585965);
                        strM7760 = str2;
                        i15 = i20;
                        runnable = runnable;
                        i12 = iM2765 ^ 825939265;
                        s = s2;
                        i11 = i21;
                        dialogInterfaceOnClickListenerC16354 = this;
                    } else {
                        s = s2;
                        i15 = i20;
                        int iM2766 = C0619.m2761("ܽۙ") ^ i9;
                        i5 = ((iM2766 ^ i10) * (-23459)) ^ (-2014399370);
                        i7 = iM2766 ^ 1594155179;
                        strM7760 = str2;
                        sb = null;
                        Runnable runnable2 = runnable;
                        i12 = i7;
                        i11 = i5;
                        runnable = runnable2;
                    }
                    break;
                case -1486991212:
                case 61842745:
                    strM10092 = C0619.m2752();
                    str3 = strM10092;
                    iM2761 = C0773.m3169("᩸᩹") ^ i10;
                    i = ((iM2761 ^ i9) * (-27593)) ^ (-55128530);
                    i2 = -1713025813;
                    int i112 = iM2761 ^ i2;
                    runnable = runnable;
                    i12 = i112;
                    i11 = i;
                    break;
                case -1389655730:
                case -903497155:
                    runnable = dialogInterfaceOnClickListenerC16354.f53095;
                    if (runnable != null) {
                        iM2762 = (C0619.m2761("۬ۜ") ^ i9) * (-87);
                        i = ((iM2762 ^ i10) * (-1037)) ^ 871529101;
                        i3 = -1998444355;
                    } else {
                        iM2762 = C0619.m2761("ۘ۠") ^ i10;
                        i = ((iM2762 ^ i9) * (-1369)) ^ (-1933261336);
                        i3 = 1489999234;
                    }
                    i12 = iM2762 ^ i3;
                    i11 = i;
                    break;
                case -1306143899:
                case 6572862:
                    runnable = runnable;
                    strM7760 = strM7760;
                    int i22 = (s * s) + 15555136;
                    if ((i22 + i22) - (i15 * i15) >= 0) {
                        iM2763 = (C0773.m3169("ۜ᩸") ^ i9) * 11;
                        i5 = ((iM2763 ^ i10) * 29373) ^ (-1323525765);
                        i6 = -184153206;
                    } else {
                        iM2763 = (C0619.m2761("ۜۗ") ^ i10) * 97;
                        i5 = ((iM2763 ^ i9) * 11673) ^ 412883452;
                        i6 = -338078697;
                    }
                    i7 = iM2763 ^ i6;
                    strM7760 = strM7760;
                    Runnable runnable3 = runnable;
                    i12 = i7;
                    i11 = i5;
                    runnable = runnable3;
                    break;
                case -1256656877:
                case 1430122982:
                    AbstractC0641.m2813();
                    if (C0862.f3233 != 0) {
                        runnable = runnable;
                        str = strM7760;
                        int iM31611 = C0773.m3169("ۙ֨") ^ i9;
                        i11 = ((iM31611 ^ i10) * (-15537)) ^ (-1637338726);
                        i4 = iM31611 ^ (-677314857);
                        strM7760 = str;
                        runnable = runnable;
                        sb = null;
                        i12 = i4;
                        dialogInterfaceOnClickListenerC16354 = this;
                    } else {
                        runnable = runnable;
                        iM2761 = (C0773.m3169("ۧۨ") + i10) * (-27);
                        i = ((iM2761 ^ i9) * (-17327)) ^ (-211934656);
                        i2 = -1851374438;
                        int i113 = iM2761 ^ i2;
                        runnable = runnable;
                        i12 = i113;
                        i11 = i;
                    }
                    break;
                case -1242294513:
                case -1087277644:
                    strM10092 = C3099.m10092(f53094, 51, 1, i16);
                    str3 = strM10092;
                    iM2761 = C0773.m3169("᩸᩹") ^ i10;
                    i = ((iM2761 ^ i9) * (-27593)) ^ (-55128530);
                    i2 = -1713025813;
                    int i114 = iM2761 ^ i2;
                    runnable = runnable;
                    i12 = i114;
                    i11 = i;
                    break;
                case -1044050466:
                case 904275175:
                    runnable = runnable;
                    RunnableC0334.m2056(map, C2702.m8881(sArr2, i13, i14, i16), C23814.m53140());
                    if (!C3077.f9998) {
                        str = strM7760;
                        int iM31612 = C0773.m3169("ۙ֨") ^ i9;
                        i11 = ((iM31612 ^ i10) * (-15537)) ^ (-1637338726);
                        i4 = iM31612 ^ (-677314857);
                        strM7760 = str;
                        runnable = runnable;
                        sb = null;
                        i12 = i4;
                        dialogInterfaceOnClickListenerC16354 = this;
                    } else {
                        short[] sArr5 = f53094;
                        if (C3099.f10023 > 0) {
                            sb = new StringBuilder(C2375.m8069(sArr5, 68, 6, i16));
                            i17 = dialogInterfaceOnClickListenerC16354.f53097;
                            if (C0862.m3503()) {
                                iM2761 = C0619.m2761("ܰܶ") ^ i9;
                                i = ((iM2761 ^ i10) * 11363) ^ (-694625000);
                                i2 = -1344644030;
                            } else {
                                iM2761 = (C0619.m2761("ۙ᩹") + i9) * (-53);
                                i = ((iM2761 ^ i10) * 11127) ^ (-831429399);
                                i2 = 522424578;
                            }
                            int i115 = iM2761 ^ i2;
                            runnable = runnable;
                            i12 = i115;
                            i11 = i;
                        } else {
                            str2 = strM7760;
                            int iM2767 = C0619.m2761("ܽۙ") ^ i9;
                            i5 = ((iM2767 ^ i10) * (-23459)) ^ (-2014399370);
                            i7 = iM2767 ^ 1594155179;
                            strM7760 = str2;
                            sb = null;
                            Runnable runnable4 = runnable;
                            i12 = i7;
                            i11 = i5;
                            runnable = runnable4;
                        }
                    }
                    break;
                case -904233358:
                case 1142166302:
                    C1519.m5403();
                    C0773.m3161();
                    break;
                case -901873611:
                case 318690239:
                    runnable = runnable;
                    sArr2 = f53094;
                    i13 = 60;
                    i14 = 8;
                    if (AbstractC0641.f2496 < 0) {
                        iM2761 = (C0619.m2761("۬᩻") ^ i10) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM2761 ^ i9) * 8011) ^ 210934285;
                        i2 = -1971739009;
                        int i116 = iM2761 ^ i2;
                        runnable = runnable;
                        i12 = i116;
                        i11 = i;
                    } else {
                        str = strM7760;
                        int iM31613 = C0773.m3169("ۙ֨") ^ i9;
                        i11 = ((iM31613 ^ i10) * (-15537)) ^ (-1637338726);
                        i4 = iM31613 ^ (-677314857);
                        strM7760 = str;
                        runnable = runnable;
                        sb = null;
                        i12 = i4;
                        dialogInterfaceOnClickListenerC16354 = this;
                    }
                    break;
                case -849797008:
                case 975862274:
                    runnable = runnable;
                    RunnableC0334.m2056(map, C2023.m6966(sArr3, 74, 6, i16), strM6952);
                    if (C3779.f12953 <= 0) {
                        iM2761 = (C0619.m2761("᩶ܽ") ^ i10) * (-7);
                        i = ((iM2761 ^ i9) * 3351) ^ 1808312254;
                        i2 = 916088472;
                    } else {
                        iM2761 = (C0619.m2761("۬֫") + i9) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2761 ^ i10) * (-22421)) ^ 1404192958;
                        i2 = -1738802312;
                    }
                    int i117 = iM2761 ^ i2;
                    runnable = runnable;
                    i12 = i117;
                    i11 = i;
                    break;
                case -794802524:
                case 1037319619:
                    runnable = runnable;
                    MobclickAgent.onEvent(applicationM10096, C11235.m28300(f53094, 80, 10, i16), map);
                    iM2761 = C0619.m2761("ۤ֡") ^ i9;
                    i = ((iM2761 ^ i10) * 28231) ^ (-711187359);
                    i2 = 1194829303;
                    int i118 = iM2761 ^ i2;
                    runnable = runnable;
                    i12 = i118;
                    i11 = i;
                    break;
                case -792430837:
                case -198268881:
                    i16 = 36016;
                    iM2763 = C0773.m3169("ۙۢ") ^ i10;
                    i5 = ((iM2763 ^ i9) * 27969) ^ 1291061774;
                    i6 = -241871636;
                    i7 = iM2763 ^ i6;
                    strM7760 = strM7760;
                    Runnable runnable5 = runnable;
                    i12 = i7;
                    i11 = i5;
                    runnable = runnable5;
                    break;
                case -584563640:
                case 1009417581:
                    break;
                case -124825687:
                case 415422093:
                    C1080.m4055(runnable);
                    iM2762 = C0619.m2761("ۘ۠") ^ i10;
                    i = ((iM2762 ^ i9) * (-1369)) ^ (-1933261336);
                    i3 = 1489999234;
                    i12 = iM2762 ^ i3;
                    i11 = i;
                    break;
                case -97319678:
                case 523719818:
                    i16 = 63214;
                    iM2763 = C0773.m3169("ۙۢ") ^ i10;
                    i5 = ((iM2763 ^ i9) * 27969) ^ 1291061774;
                    i6 = -241871636;
                    i7 = iM2763 ^ i6;
                    strM7760 = strM7760;
                    Runnable runnable6 = runnable;
                    i12 = i7;
                    i11 = i5;
                    runnable = runnable6;
                    break;
                case -50122739:
                case 78865453:
                    runnable = runnable;
                    RunnableC0334.m2056(map, C1542.m5471(f53094, 52, 8, i16), str3);
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (C0619.m2761("ۙ᩹") + i9) * (-53);
                        i = ((iM2761 ^ i10) * 11127) ^ (-831429399);
                        i2 = 522424578;
                    } else {
                        iM2761 = C0619.m2761("᩺ۖ") ^ i9;
                        i = ((iM2761 ^ i10) * 28173) ^ (-998325639);
                        i2 = -119464025;
                    }
                    int i119 = iM2761 ^ i2;
                    runnable = runnable;
                    i12 = i119;
                    i11 = i;
                    break;
                case 734733541:
                case 1110211065:
                    runnable = runnable;
                    applicationM10096 = C3099.m10096();
                    int i23 = C2278.f7424;
                    if (C16514.m39144()) {
                        iM2761 = C0619.m2761("ۤ֡") ^ i9;
                        i = ((iM2761 ^ i10) * 28231) ^ (-711187359);
                        i2 = 1194829303;
                    } else {
                        iM2761 = C0619.m2761("۟ۖ") ^ i10;
                        i = ((iM2761 ^ i9) * (-14179)) ^ (-1028822525);
                        i2 = -1270501740;
                    }
                    int i1110 = iM2761 ^ i2;
                    runnable = runnable;
                    i12 = i1110;
                    i11 = i;
                    break;
                case 771235899:
                case 1437197193:
                    runnable = runnable;
                    strM7760 = strM7760;
                    C1519.m5396(map, C2702.m8881(sArr4, 46, 5, i16), strM7760);
                    if (C2702.m8873()) {
                        iM2763 = (C0619.m2761("ܺ᩹") ^ i10) * (-19);
                        i5 = ((iM2763 ^ i9) * (-13101)) ^ 1436987097;
                        i6 = -2124567423;
                    } else {
                        iM2763 = (C0773.m3169("֡ܿ") ^ i9) * 127;
                        i5 = ((iM2763 ^ i10) * (-28927)) ^ (-2109785446);
                        i6 = -1846489655;
                    }
                    i7 = iM2763 ^ i6;
                    strM7760 = strM7760;
                    Runnable runnable7 = runnable;
                    i12 = i7;
                    i11 = i5;
                    runnable = runnable7;
                    break;
                case 1035784380:
                case 1627464466:
                    RunnableC3055.m9933();
                    if (C1564.f5401 > 0) {
                        runnable = runnable;
                        iM2761 = (C0619.m2761("᩶ܽ") ^ i10) * (-7);
                        i = ((iM2761 ^ i9) * 3351) ^ 1808312254;
                        i2 = 916088472;
                        int i1111 = iM2761 ^ i2;
                        runnable = runnable;
                        i12 = i1111;
                        i11 = i;
                    }
                    runnable = runnable;
                    iM2761 = (C0773.m3169("ۧۨ") + i10) * (-27);
                    i = ((iM2761 ^ i9) * (-17327)) ^ (-211934656);
                    i2 = -1851374438;
                    int i1112 = iM2761 ^ i2;
                    runnable = runnable;
                    i12 = i1112;
                    i11 = i;
                    break;
                default:
                    runnable = runnable;
                    map = new HashMap();
                    strM7760 = C2288.m7760(dialogInterfaceOnClickListenerC16354.f53099);
                    sArr4 = f53094;
                    if (C1146.f4234 >= 0) {
                        iM2761 = (C0619.m2761("᩶ܽ") ^ i10) * (-7);
                        i = ((iM2761 ^ i9) * 3351) ^ 1808312254;
                        i2 = 916088472;
                    } else {
                        iM2761 = C0619.m2761("ܶ᩸") ^ i9;
                        i = ((iM2761 ^ i10) * 24747) ^ (-1884239495);
                        i2 = -941347395;
                    }
                    int i1113 = iM2761 ^ i2;
                    runnable = runnable;
                    i12 = i1113;
                    i11 = i;
                    break;
            }
            return;
        }
    }
}
