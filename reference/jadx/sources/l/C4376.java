package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.mt.plugin.api.LocalString;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۙۗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: B50D */
/* JADX INFO: loaded from: classes2.dex */
public final class C4376 {

    /* JADX INFO: renamed from: ᩸ۛ۠, reason: not valid java name and contains not printable characters */
    private static final short[] f15620 = {8943, -29605, -29610, -29607, -29616, -29630, -29610, -29616, -29614, -29592, -29601, -29602, -29613, -29613, -29614, -29607, -29592, -29607, -29614, -29632, -29589, -29621, 8253, -10930, 15080, -8358, 11809, -1630, -10901, -1090, 13149, 10433, 10978, -3785, -9980, -15176, -6241, -13776, -10986, -6473, 9869, -22432, -22412, -22411, -22418};

    /* JADX WARN: Code duplicated, block: B:74:0x0309 A[PHI: r2 r11 r18 r19 r20 r21 r25
      0x0309: PHI (r2v5 l.ۛۧ᩺) = (r2v2 l.ۛۧ᩺), (r2v2 l.ۛۧ᩺), (r2v2 l.ۛۧ᩺), (r2v3 l.ۛۧ᩺), (r2v2 l.ۛۧ᩺) binds: [B:73:0x0307, B:70:0x02d4, B:65:0x02af, B:50:0x01e2, B:9:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0309: PHI (r11v23 short[]) = (r11v8 short[]), (r11v9 short[]), (r11v10 short[]), (r11v16 short[]), (r11v27 short[]) binds: [B:73:0x0307, B:70:0x02d4, B:65:0x02af, B:50:0x01e2, B:9:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0309: PHI (r18v11 int) = (r18v2 int), (r18v4 int), (r18v2 int), (r18v2 int), (r18v2 int) binds: [B:73:0x0307, B:70:0x02d4, B:65:0x02af, B:50:0x01e2, B:9:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0309: PHI (r19v5 int) = (r19v2 int), (r19v2 int), (r19v3 int), (r19v2 int), (r19v2 int) binds: [B:73:0x0307, B:70:0x02d4, B:65:0x02af, B:50:0x01e2, B:9:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0309: PHI (r20v7 short) = (r20v3 short), (r20v4 short), (r20v2 short), (r20v2 short), (r20v2 short) binds: [B:73:0x0307, B:70:0x02d4, B:65:0x02af, B:50:0x01e2, B:9:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0309: PHI (r21v5 short) = (r21v2 short), (r21v2 short), (r21v3 short), (r21v2 short), (r21v2 short) binds: [B:73:0x0307, B:70:0x02d4, B:65:0x02af, B:50:0x01e2, B:9:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0309: PHI (r25v20 java.util.HashSet) = 
      (r25v5 java.util.HashSet)
      (r25v6 java.util.HashSet)
      (r25v8 java.util.HashSet)
      (r25v14 java.util.HashSet)
      (r25v26 java.util.HashSet)
     binds: [B:73:0x0307, B:70:0x02d4, B:65:0x02af, B:50:0x01e2, B:9:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007f, code lost:
    
        if (l.C2249.f8050 >= 0) goto L8;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashSet m12228() {
        /*
            Method dump skipped, instruction units count: 1076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4376.m12228():java.util.HashSet");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0057 A[PHI: r5
      0x0057: PHI (r5v5 l.֡֨ۘ) = (r5v4 l.֡֨ۘ), (r5v2 l.֡֨ۘ), (r5v2 l.֡֨ۘ), (r5v2 l.֡֨ۘ) binds: [B:20:0x0055, B:15:0x003b, B:13:0x0038, B:10:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0149  */
    /* JADX WARN: Code duplicated, block: B:56:0x0193  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e4 A[PHI: r0 r1 r4
      0x01e4: PHI (r0v6 bin.mt.plugin.api.LocalString) = 
      (r0v5 bin.mt.plugin.api.LocalString)
      (r0v2 bin.mt.plugin.api.LocalString)
      (r0v2 bin.mt.plugin.api.LocalString)
      (r0v2 bin.mt.plugin.api.LocalString)
     binds: [B:63:0x01e2, B:59:0x01c0, B:24:0x0087, B:10:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x01e4: PHI (r1v4 java.util.HashSet) = (r1v3 java.util.HashSet), (r1v2 java.util.HashSet), (r1v2 java.util.HashSet), (r1v2 java.util.HashSet) binds: [B:63:0x01e2, B:59:0x01c0, B:24:0x0087, B:10:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x01e4: PHI (r4v5 java.lang.String) = (r4v2 java.lang.String), (r4v2 java.lang.String), (r4v4 java.lang.String), (r4v2 java.lang.String) binds: [B:63:0x01e2, B:59:0x01c0, B:24:0x0087, B:10:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Set m12230() {
        int iM45029;
        int i;
        LocalString localStringM47603 = null;
        HashSet hashSetM12228 = null;
        Iterator it = null;
        String str = null;
        C0074 c0074 = null;
        int i2 = 282986352;
        int i3 = C3722.f13525;
        int i4 = RunnableC1606.f6488;
        int iM11306 = ThreadFactoryC3888.m11306("ۨ᩹") ^ i4;
        int i5 = ((iM11306 ^ i3) * (-29797)) ^ 1172309006;
        int i6 = 55828706;
        while (true) {
            int i7 = iM11306 ^ i6;
            C18623 c18623 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-17621)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2145841953:
                    case -228144197:
                        if (C1025.f4800 >= 0) {
                            iM45029 = ThreadFactoryC3888.m11306("᩸֡") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-631)) ^ 79564626;
                            i = 1301158475;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("ۖ۠") ^ i4) * (-113);
                            i5 = ((iM45029 ^ i3) * (-32067)) ^ (-1664877465);
                            i = -1810328325;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -2114709278:
                    case -2075489080:
                        if (C2332.m7079() <= 0) {
                            iM45029 = (i4 - C19806.m45029("ۘ᩻")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i5 = ((iM45029 ^ i3) * (-14221)) ^ (-1551038985);
                            i = 216189772;
                        } else {
                            iM45029 = C19806.m45029("᩷ۚ") ^ i4;
                            i5 = ((iM45029 ^ i3) * 14267) ^ (-37022749);
                            i = -2130516899;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -1992916617:
                    case -1435680630:
                        if (C0629.f2722 > 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("ܽۧ") ^ i3) * 79;
                            i5 = ((iM45029 ^ i4) * 30451) ^ (-310850920);
                            i = 256617883;
                            i7 = iM45029 ^ i;
                        }
                        break;
                    case -1654001173:
                    case -840092149:
                        if (C1189.f5284 <= 0) {
                            iM45029 = ThreadFactoryC3888.m11306("۫ۢ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-19615)) ^ 1951365270;
                            i = -216560536;
                        } else {
                            iM45029 = C19806.m45029("᩷᩹") ^ i4;
                            i5 = ((iM45029 ^ i3) * 15693) ^ 717238009;
                            i = 1234398173;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -1620198147:
                    case -793356964:
                        return C0561.unmodifiableSet(c18623);
                    case -1544456426:
                    case -1240778507:
                        if (C3535.f13026 <= 0) {
                            iM45029 = (i4 - C19806.m45029("ۘ᩻")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i5 = ((iM45029 ^ i3) * (-14221)) ^ (-1551038985);
                            i = 216189772;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("ۡۤ") + i3) * (-67);
                            i5 = ((iM45029 ^ i4) * (-1877)) ^ 871832945;
                            i = -1409857535;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -1505233945:
                    case 767073150:
                        if (C10634.f36300 < 0) {
                            c18623 = new C18623(hashSetM12228.size());
                            it = hashSetM12228.iterator();
                            iM45029 = (ThreadFactoryC3888.m11306("᩺۠") ^ i3) * 21;
                            i5 = ((iM45029 ^ i4) * 21093) ^ 1525607851;
                            i = -739880141;
                            i7 = iM45029 ^ i;
                        }
                        break;
                    case -1074781488:
                    case 733660137:
                        c18623.add(c0074.getOrDefault(str, str));
                        iM45029 = (ThreadFactoryC3888.m11306("᩺۠") ^ i3) * 21;
                        i5 = ((iM45029 ^ i4) * 21093) ^ 1525607851;
                        i = -739880141;
                        i7 = iM45029 ^ i;
                        break;
                    case -1062972129:
                    case 1044586736:
                        if (C0962.m3748(it)) {
                            iM45029 = C19806.m45029("᩸ᩴ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-15005)) ^ 1835147987;
                            i = 601791737;
                        } else {
                            iM45029 = (C19806.m45029("ۖۨ") + i4) * (-63);
                            i5 = ((iM45029 ^ i3) * (-19025)) ^ 52366769;
                            i = 689574518;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -969820252:
                    case -326842709:
                        localStringM47603 = C21157.m47603();
                        hashSetM12228 = m12228();
                        if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                            iM45029 = ThreadFactoryC3888.m11306("᩸֡") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-631)) ^ 79564626;
                            i = 1301158475;
                        } else {
                            iM45029 = C19806.m45029("ܰۛ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-21557)) ^ (-419081625);
                            i = -686286390;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -774914086:
                    case 1401387835:
                        RunnableC3388.m10064();
                        C1937.m6279();
                        return null;
                    case -749172877:
                    case 1789758444:
                        c0074 = (C0074) localStringM47603;
                        if (AbstractC0464.f2088 <= 0) {
                            iM45029 = ThreadFactoryC3888.m11306("ᩴۨ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-9945)) ^ 1523436699;
                            i = 1041978358;
                        } else {
                            iM45029 = C19806.m45029("ۙ᩺") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-22315)) ^ 360051718;
                            i = -999425040;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -697735451:
                    case 1088181574:
                        C1977.m6356();
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۨ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-9945)) ^ 1523436699;
                        i = 1041978358;
                        i7 = iM45029 ^ i;
                        break;
                    case 111404511:
                    case 1655915062:
                        str = (String) C0278.m1776(it);
                        if (CallableC1627.f6528) {
                            iM45029 = C19806.m45029("ۤۡ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-25805)) ^ 595667410;
                            i = -165253932;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("᩸֡") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-631)) ^ 79564626;
                            i = 1301158475;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case 412144105:
                    case 1760761784:
                        if (C2332.f8260) {
                            iM45029 = ThreadFactoryC3888.m11306("۫ۢ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-19615)) ^ 1951365270;
                            i = -216560536;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("ᩴۨ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-9945)) ^ 1523436699;
                            i = 1041978358;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case 749502046:
                    case 1859520966:
                        if (RunnableC3388.f12514 >= 0) {
                            iM45029 = ThreadFactoryC3888.m11306("۫ۢ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-19615)) ^ 1951365270;
                            i = -216560536;
                        } else {
                            iM45029 = (i4 - C19806.m45029("֡᩹")) * (-61);
                            i5 = ((iM45029 ^ i3) * 32249) ^ 2041093975;
                            i = 1358377175;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case 1142609187:
                    case 1349585473:
                        if (RunnableC3388.f12514 < 0) {
                            iM45029 = ThreadFactoryC3888.m11306("ᩴۨ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-9945)) ^ 1523436699;
                            i = 1041978358;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("᩸֡") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-631)) ^ 79564626;
                            i = 1301158475;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    default:
                        if (C10634.f36300 >= 0) {
                            iM45029 = ThreadFactoryC3888.m11306("۫ۢ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-19615)) ^ 1951365270;
                            i = -216560536;
                        } else {
                            iM45029 = (i4 - C19806.m45029("ۘ᩻")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i5 = ((iM45029 ^ i3) * (-14221)) ^ (-1551038985);
                            i = 216189772;
                        }
                        i7 = iM45029 ^ i;
                        break;
                }
            }
            iM11306 = (ThreadFactoryC3888.m11306("ۤ᩵") ^ i4) * 25;
            i5 = ((iM11306 ^ i3) * (-6835)) ^ (-1256616009);
            i6 = 839717449;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12229(AbstractActivityC12483 abstractActivityC12483, final Runnable runnable) {
        C0074 c0074;
        Object obj;
        View viewM4976;
        int i;
        int i2;
        int iM45029;
        int i3;
        int i4;
        int iM450210;
        int i5;
        int i6;
        int i7;
        int iM11306;
        int iM450211;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        short[] sArr;
        View view;
        C0074 c0075;
        short[] sArr2;
        ListView listView;
        int i13;
        int i14;
        int i15;
        int i16;
        int iM450212;
        int i17;
        int iM450213;
        int i18;
        abstractActivityC12483 = abstractActivityC12483;
        int i19 = RunnableC3388.f12514;
        int i20 = C0278.f1572;
        int iM11307 = (ThreadFactoryC3888.m11306("ۖܶ") + i20) * (-125);
        int i21 = ((iM11307 ^ i19) * 13741) ^ 704491757;
        View view2 = null;
        ListView listView2 = null;
        TextView textView = null;
        final ArrayList arrayList = null;
        C3152 c3152 = null;
        short[] sArr3 = null;
        int i22 = iM11307 ^ (-1518697109);
        int i23 = 0;
        int iM450214 = 0;
        int iM11308 = 0;
        int iM11309 = 0;
        int iM450215 = 0;
        short s = 0;
        int i24 = 0;
        int iM113010 = 0;
        int i25 = 0;
        int i26 = 1020329315;
        Object obj2 = null;
        C0074 c0076 = null;
        String str = null;
        short[] sArr4 = null;
        int i27 = 0;
        int i28 = 0;
        C8067 c8067 = null;
        final C20282 c20282 = null;
        Iterator it = null;
        HashSet hashSet = null;
        boolean z = false;
        while (true) {
            i26 = i22 ^ (i21 & (((i26 ^ i19) * (-4977)) >> 31));
            switch (i26) {
                case -2042945286:
                case 1495760219:
                    c3152.f11885 = z;
                    iM450213 = (i20 - ThreadFactoryC3888.m11306("ۢܳ")) * 17;
                    i8 = ((iM450213 ^ i19) * 29999) ^ (-570771263);
                    i18 = -1919723000;
                    i22 = iM450213 ^ i18;
                    i21 = i8;
                    break;
                case -1985723456:
                case 1248941393:
                    c0074 = c0076;
                    c8067 = new C8067(abstractActivityC12483);
                    view2 = view2;
                    C2871.m8638(c8067, view2);
                    if (!C0962.f3784) {
                        c8067.m21257(new DialogInterface.OnDismissListener() { // from class: l.֫ۢۨ

                            /* JADX INFO: renamed from: ۟ᩴ֨, reason: not valid java name and contains not printable characters */
                            private static final short[] f6867 = {2337, -29263, -29252, -29261, -29254, -29272, -29252, -29254, -29256, -29310, -29259, -29260, -29255, -29255, -29256, -29261, -29310, -29261, -29256, -29270};

                            {
                                int i29 = -958329945;
                                int i30 = C10634.f36300;
                                int i31 = C2642.f10294;
                                int iM450216 = (C19806.m45029("ܳ֫") ^ i30) * (-91);
                                int i32 = ((iM450216 ^ i31) * (-23019)) ^ 2082825454;
                                int i33 = 680165524;
                                while (true) {
                                    i29 = ((((i29 ^ i31) * 14071) >> 31) & i32) ^ (iM450216 ^ i33);
                                    switch (i29) {
                                        case -2035498076:
                                        case -959498704:
                                            if (RunnableC3388.f12514 >= 0) {
                                                iM450216 = (C19806.m45029("ۗۚ") ^ i30) * 45;
                                                i32 = ((iM450216 ^ i31) * 18209) ^ 903133897;
                                                i33 = -129284537;
                                            } else {
                                                iM450216 = (ThreadFactoryC3888.m11306("ᩴ᩷") + i31) * (-121);
                                                i32 = ((iM450216 ^ i30) * (-12451)) ^ 1404700683;
                                                i33 = 901386905;
                                            }
                                            break;
                                        case -2028388869:
                                        case 1389373680:
                                            C0216.m1591();
                                            if (!RunnableC1895.f7152) {
                                                iM450216 = ThreadFactoryC3888.m11306("ۧܿ") ^ i31;
                                                i32 = ((iM450216 ^ i30) * 13087) ^ 1927416099;
                                                i33 = -1724423002;
                                            } else {
                                                iM450216 = (C19806.m45029("ۗۚ") ^ i30) * 45;
                                                i32 = ((iM450216 ^ i31) * 18209) ^ 903133897;
                                                i33 = -129284537;
                                            }
                                            break;
                                        case -1965478804:
                                        case 822196427:
                                            if (C1148.f5161 <= 0) {
                                                iM450216 = ThreadFactoryC3888.m11306("ۧܿ") ^ i31;
                                                i32 = ((iM450216 ^ i30) * 13087) ^ 1927416099;
                                                i33 = -1724423002;
                                            } else {
                                                iM450216 = ThreadFactoryC3888.m11306("᩸᩵") ^ i31;
                                                i32 = ((iM450216 ^ i30) * (-25293)) ^ 1545883378;
                                                i33 = 121467241;
                                            }
                                            break;
                                        case -1832334463:
                                        case 715405695:
                                            if (ThreadFactoryC3888.f14547 <= 0) {
                                                iM450216 = ThreadFactoryC3888.m11306("ۖ֨") ^ i30;
                                                i32 = ((iM450216 ^ i31) * 8995) ^ 1781061026;
                                                i33 = 941430786;
                                            } else {
                                                iM450216 = (ThreadFactoryC3888.m11306("ۢܳ") + i31) * (-13);
                                                i32 = ((iM450216 ^ i30) * 28389) ^ 116534667;
                                                i33 = -1418502654;
                                            }
                                            break;
                                        case -1729582645:
                                        case -295182371:
                                            if (C0629.f2722 <= 0) {
                                                iM450216 = C19806.m45029("ۘۡ") ^ i31;
                                                i32 = ((iM450216 ^ i30) * (-19027)) ^ 521961129;
                                                i33 = 1159574520;
                                            } else {
                                                iM450216 = ThreadFactoryC3888.m11306("ۧ᩹") ^ i30;
                                                i32 = ((iM450216 ^ i31) * 29697) ^ (-1218302236);
                                                i33 = -1448407005;
                                            }
                                            break;
                                        case -1631379430:
                                        case 1518736075:
                                            C3577.m10565();
                                            if (RunnableC1606.m5473() != 0) {
                                                iM450216 = ThreadFactoryC3888.m11306("ۖ֨") ^ i30;
                                                i32 = ((iM450216 ^ i31) * 8995) ^ 1781061026;
                                                i33 = 941430786;
                                            } else {
                                                iM450216 = (ThreadFactoryC3888.m11306("ᩴ᩷") + i31) * (-121);
                                                i32 = ((iM450216 ^ i30) * (-12451)) ^ 1404700683;
                                                i33 = 901386905;
                                            }
                                            break;
                                        case -1214989606:
                                        case 1826255492:
                                            return;
                                        case -830682701:
                                        case 1006748218:
                                            if (C1977.f7413 <= 0) {
                                                iM450216 = (C19806.m45029("ۗۚ") ^ i30) * 45;
                                                i32 = ((iM450216 ^ i31) * 18209) ^ 903133897;
                                                i33 = -129284537;
                                            } else {
                                                iM450216 = (i30 - C19806.m45029("۫᩺")) * 127;
                                                i32 = ((iM450216 ^ i31) * 25461) ^ (-832570293);
                                                i33 = -747235380;
                                            }
                                            break;
                                        case -382531984:
                                        case 802494378:
                                            if (C0629.m2907()) {
                                                iM450216 = (i30 - C19806.m45029("ܿ᩹")) * 55;
                                                i32 = ((iM450216 ^ i31) * 15893) ^ 443521347;
                                                i33 = 1826851433;
                                            } else {
                                                iM450216 = ThreadFactoryC3888.m11306("ۖ֨") ^ i30;
                                                i32 = ((iM450216 ^ i31) * 8995) ^ 1781061026;
                                                i33 = 941430786;
                                            }
                                            break;
                                        case 276276552:
                                        case 1886872021:
                                            if (C2477.f9839 <= 0) {
                                                iM450216 = C19806.m45029("ۘۡ") ^ i31;
                                                i32 = ((iM450216 ^ i30) * (-19027)) ^ 521961129;
                                                i33 = 1159574520;
                                            } else {
                                                iM450216 = ThreadFactoryC3888.m11306("᩶᩸") ^ i31;
                                                i32 = ((iM450216 ^ i30) * (-29461)) ^ 327611623;
                                                i33 = -234886363;
                                            }
                                            break;
                                        case 380574778:
                                        case 1139433725:
                                            if (C3535.f13026 <= 0) {
                                                iM450216 = ThreadFactoryC3888.m11306("ۧܿ") ^ i31;
                                                i32 = ((iM450216 ^ i30) * 13087) ^ 1927416099;
                                                i33 = -1724423002;
                                            } else {
                                                iM450216 = (ThreadFactoryC3888.m11306("֨ۗ") + i31) * 119;
                                                i32 = ((iM450216 ^ i30) * (-5937)) ^ 814840134;
                                                i33 = -1638951067;
                                            }
                                            break;
                                        case 413484462:
                                        case 421559576:
                                            if (C1668.f6641 >= 0) {
                                                iM450216 = C19806.m45029("ۘۡ") ^ i31;
                                                i32 = ((iM450216 ^ i30) * (-19027)) ^ 521961129;
                                                i33 = 1159574520;
                                            } else {
                                                iM450216 = C19806.m45029("ۨۢ") ^ i30;
                                                i32 = ((iM450216 ^ i31) * 30035) ^ 1349942927;
                                                i33 = -1784669714;
                                            }
                                            break;
                                        case 466484389:
                                        case 702757309:
                                            if (C1189.f5284 <= 0) {
                                                iM450216 = C19806.m45029("ۘۡ") ^ i31;
                                                i32 = ((iM450216 ^ i30) * (-19027)) ^ 521961129;
                                                i33 = 1159574520;
                                            } else {
                                                iM450216 = (C19806.m45029("ۛ֡") ^ i30) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                                i32 = ((iM450216 ^ i31) * 5) ^ 46044571;
                                                i33 = -1234101633;
                                            }
                                            break;
                                        case 849985908:
                                        case 1810989999:
                                            C0817.m3399();
                                            C1419.m4973();
                                            iM450216 = (ThreadFactoryC3888.m11306("ᩴ᩷") + i31) * (-121);
                                            i32 = ((iM450216 ^ i30) * (-12451)) ^ 1404700683;
                                            i33 = 901386905;
                                            break;
                                        case 1698677262:
                                        case 1834613996:
                                            if (C7105.m18985()) {
                                                iM450216 = (C19806.m45029("ۗۚ") ^ i30) * 45;
                                                i32 = ((iM450216 ^ i31) * 18209) ^ 903133897;
                                                i33 = -129284537;
                                            } else {
                                                iM450216 = (ThreadFactoryC3888.m11306("᩵ۗ") + i31) * 49;
                                                i32 = ((iM450216 ^ i30) * (-27005)) ^ (-201347875);
                                                i33 = 380456153;
                                            }
                                            break;
                                        default:
                                            C2788.m8472();
                                            CallableC1627.m5507();
                                            throw new RuntimeException();
                                    }
                                }
                            }

                            /* JADX WARN: Code duplicated, block: B:24:0x00a6  */
                            /* JADX WARN: Code duplicated, block: B:41:0x0140  */
                            /* JADX WARN: Code duplicated, block: B:53:0x01c1 A[PHI: r7 r11
                              0x01c1: PHI (r7v4 l.ܿۧ᩺) = (r7v3 l.ܿۧ᩺), (r7v2 l.ܿۧ᩺), (r7v2 l.ܿۧ᩺), (r7v2 l.ܿۧ᩺), (r7v2 l.ܿۧ᩺) binds: [B:52:0x01bf, B:25:0x00bc, B:22:0x00a2, B:15:0x0079, B:144:0x01c1] A[DONT_GENERATE, DONT_INLINE]
                              0x01c1: PHI (r11v4 short[]) = (r11v3 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:52:0x01bf, B:25:0x00bc, B:22:0x00a2, B:15:0x0079, B:144:0x01c1] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Code duplicated, block: B:65:0x026a  */
                            /* JADX WARN: Code duplicated, block: B:91:0x038f A[PHI: r8 r19 r24
                              0x038f: PHI (r8v6 java.lang.String) = (r8v2 java.lang.String), (r8v3 java.lang.String), (r8v2 java.lang.String) binds: [B:90:0x038d, B:44:0x0178, B:142:0x038f] A[DONT_GENERATE, DONT_INLINE]
                              0x038f: PHI (r19v6 short) = (r19v3 short), (r19v2 short), (r19v2 short) binds: [B:90:0x038d, B:44:0x0178, B:142:0x038f] A[DONT_GENERATE, DONT_INLINE]
                              0x038f: PHI (r24v7 short) = (r24v4 short), (r24v3 short), (r24v3 short) binds: [B:90:0x038d, B:44:0x0178, B:142:0x038f] A[DONT_GENERATE, DONT_INLINE]] */
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                int iM450216;
                                int i29;
                                int i30;
                                int iM450217;
                                int i31;
                                short[] sArr5;
                                DialogInterfaceOnDismissListenerC1741 dialogInterfaceOnDismissListenerC1741 = this;
                                int i32 = -635300390;
                                int i33 = C2871.f10837;
                                int i34 = ThreadFactoryC3888.f14547;
                                int iM113011 = ThreadFactoryC3888.m11306("᩻᩸") ^ i34;
                                int i35 = ((iM113011 ^ i33) * 18677) ^ 478914878;
                                int i36 = iM113011 ^ (-780074461);
                                short[] sArr6 = null;
                                short[] sArr7 = null;
                                int i37 = 0;
                                int i38 = 0;
                                int i39 = 0;
                                int i40 = 0;
                                int i41 = 0;
                                int i42 = 0;
                                char c = 0;
                                short s2 = 0;
                                short s3 = 0;
                                C3152 c3153 = null;
                                String strM4892 = null;
                                InterfaceC17314 interfaceC17314M8257 = null;
                                Iterator itM10563 = null;
                                StringBuilder sb = null;
                                Iterator itM10564 = null;
                                Iterator itM9863 = null;
                                ArrayList arrayList2 = null;
                                while (true) {
                                    i32 = i36 ^ (i35 & (((i32 ^ i33) * (-19459)) >> 31));
                                    switch (i32) {
                                        case -2082746381:
                                        case -1629656772:
                                            s3 = sArr6[c];
                                            s2 = 11338;
                                            if (C2124.f7782 <= 0) {
                                                iM450216 = (i33 - ThreadFactoryC3888.m11306("ۗܰ")) * 101;
                                                i29 = ((iM450216 ^ i34) * (-20653)) ^ (-157510464);
                                                i30 = 1122407598;
                                            } else {
                                                iM450216 = (C19806.m45029("֫ܳ") + i33) * (-25);
                                                i29 = ((iM450216 ^ i34) * 10053) ^ (-431050201);
                                                i30 = 1999282319;
                                            }
                                            i36 = iM450216 ^ i30;
                                            i35 = i29;
                                            break;
                                        case -2031257286:
                                        case -1379980959:
                                            if (C3722.m10894() > 0) {
                                                sArr5 = sArr6;
                                                int iM113012 = ThreadFactoryC3888.m11306("᩹ۚ") ^ i34;
                                                i36 = iM113012 ^ (-18287727);
                                                sArr6 = sArr5;
                                                i35 = ((iM113012 ^ i33) * (-27771)) ^ (-139685174);
                                                dialogInterfaceOnDismissListenerC1741 = this;
                                            } else {
                                                iM450216 = ThreadFactoryC3888.m11306("᩺ܿ") ^ i33;
                                                i29 = ((iM450216 ^ i34) * 13825) ^ 1666345640;
                                                i30 = 412114918;
                                                i36 = iM450216 ^ i30;
                                                i35 = i29;
                                            }
                                            break;
                                        case -2015246470:
                                        case -533194595:
                                            if (C0050.f912 <= 0) {
                                                iM450217 = (i34 - ThreadFactoryC3888.m11306("ۗᩴ")) * 37;
                                                i35 = ((iM450217 ^ i33) * (-29949)) ^ (-1814829565);
                                                i31 = -1141026762;
                                            } else {
                                                iM450217 = (C19806.m45029("ۡ᩻") ^ i34) * 95;
                                                i35 = ((iM450217 ^ i33) * 20553) ^ (-774915);
                                                i31 = 434029723;
                                            }
                                            i36 = iM450217 ^ i31;
                                            dialogInterfaceOnDismissListenerC1741 = this;
                                            break;
                                        case -2000849367:
                                        case 649135244:
                                            StringBuilder sb2 = new StringBuilder();
                                            itM10563 = C3577.m10563(arrayList2);
                                            sb = sb2;
                                            iM450216 = ThreadFactoryC3888.m11306("᩷ۡ") ^ i33;
                                            i29 = ((iM450216 ^ i34) * 26679) ^ (-1086399813);
                                            i30 = -2031547602;
                                            i36 = iM450216 ^ i30;
                                            i35 = i29;
                                            break;
                                        case -1959595852:
                                        case 761420014:
                                            if (C2332.f8260) {
                                                iM450216 = ThreadFactoryC3888.m11306("᩺ܿ") ^ i33;
                                                i29 = ((iM450216 ^ i34) * 13825) ^ 1666345640;
                                                i30 = 412114918;
                                            } else {
                                                iM450216 = (i33 - C19806.m45029("֡ۡ")) * 35;
                                                i29 = ((iM450216 ^ i34) * 17759) ^ 715077979;
                                                i30 = -620325787;
                                            }
                                            i36 = iM450216 ^ i30;
                                            i35 = i29;
                                            break;
                                        case -1862560796:
                                        case 1261731712:
                                            i40 = i39 * i39;
                                            i41 = s3 * s3;
                                            i42 = 128550244;
                                            if (C1668.f6641 < 0) {
                                                iM450216 = C19806.m45029("ۨۛ") ^ i34;
                                                i29 = ((iM450216 ^ i33) * 20501) ^ (-940330335);
                                                i30 = 1622260257;
                                                i36 = iM450216 ^ i30;
                                                i35 = i29;
                                            } else {
                                                sArr5 = sArr6;
                                                int iM113013 = ThreadFactoryC3888.m11306("᩹ۚ") ^ i34;
                                                i36 = iM113013 ^ (-18287727);
                                                sArr6 = sArr5;
                                                i35 = ((iM113013 ^ i33) * (-27771)) ^ (-139685174);
                                                dialogInterfaceOnDismissListenerC1741 = this;
                                            }
                                            break;
                                        case -1811327491:
                                        case 1343830811:
                                            c3153 = (C3152) C0216.m1584(itM10563);
                                            if (c3153.f11885) {
                                                iM450216 = ThreadFactoryC3888.m11306("ܽۡ") ^ i33;
                                                i29 = ((iM450216 ^ i34) * 643) ^ 852333196;
                                                i30 = 142694001;
                                            } else {
                                                iM450216 = ThreadFactoryC3888.m11306("᩷ۡ") ^ i33;
                                                i29 = ((iM450216 ^ i34) * 26679) ^ (-1086399813);
                                                i30 = -2031547602;
                                            }
                                            i36 = iM450216 ^ i30;
                                            i35 = i29;
                                            break;
                                        case -1765421999:
                                        case -1166957639:
                                            if (C1025.m3868(sb) > 0) {
                                                iM450216 = C19806.m45029("ۜۚ") ^ i34;
                                                i29 = ((iM450216 ^ i33) * 14945) ^ 1097699586;
                                                i30 = -1075670920;
                                            } else {
                                                iM450216 = ThreadFactoryC3888.m11306("֫ܶ") ^ i34;
                                                i29 = ((iM450216 ^ i33) * (-25875)) ^ 1436425320;
                                                i30 = -1295855819;
                                            }
                                            i36 = iM450216 ^ i30;
                                            i35 = i29;
                                            break;
                                        case -1750384784:
                                        case -628734191:
                                            if (C0817.f3443) {
                                                iM450216 = C19806.m45029("᩻ᩴ") ^ i34;
                                                i29 = ((iM450216 ^ i33) * (-25417)) ^ 1768688189;
                                                i30 = -581814807;
                                            } else {
                                                iM450216 = C19806.m45029("ۘ۬") ^ i33;
                                                i29 = ((iM450216 ^ i34) * 13681) ^ (-1952305492);
                                                i30 = 1950654128;
                                            }
                                            i36 = iM450216 ^ i30;
                                            i35 = i29;
                                            break;
                                        case -1729326693:
                                        case -943904075:
                                            C1377.m4833();
                                            if (C1977.f7413 <= 0) {
                                                iM450216 = (i33 - ThreadFactoryC3888.m11306("ۗܰ")) * 101;
                                                i29 = ((iM450216 ^ i34) * (-20653)) ^ (-157510464);
                                                i30 = 1122407598;
                                                i36 = iM450216 ^ i30;
                                                i35 = i29;
                                            } else {
                                                sArr5 = sArr6;
                                                int iM113014 = ThreadFactoryC3888.m11306("᩹ۚ") ^ i34;
                                                i36 = iM113014 ^ (-18287727);
                                                sArr6 = sArr5;
                                                i35 = ((iM113014 ^ i33) * (-27771)) ^ (-139685174);
                                                dialogInterfaceOnDismissListenerC1741 = this;
                                            }
                                            break;
                                        case -1467465196:
                                        case 1990004339:
                                            CallableC1627.m5507();
                                            if (C7105.f23796 >= 0) {
                                                iM450216 = ThreadFactoryC3888.m11306("᩺ܿ") ^ i33;
                                                i29 = ((iM450216 ^ i34) * 13825) ^ 1666345640;
                                                i30 = 412114918;
                                            } else {
                                                iM450216 = C19806.m45029("ۘ۬") ^ i33;
                                                i29 = ((iM450216 ^ i34) * 13681) ^ (-1952305492);
                                                i30 = 1950654128;
                                            }
                                            i36 = iM450216 ^ i30;
                                            i35 = i29;
                                            break;
                                        case -1458814463:
                                        case 148761068:
                                            i37 = 36317;
                                            iM450216 = C19806.m45029("ܿ֫") ^ i34;
                                            i29 = ((iM450216 ^ i33) * (-30851)) ^ 1521695294;
                                            i30 = 838779558;
                                            i36 = iM450216 ^ i30;
                                            i35 = i29;
                                            break;
                                        case -1436323473:
                                        case -1367901878:
                                            C0216.m1591();
                                            C1668.m5583();
                                            break;
                                        case -1026028214:
                                        case 355899075:
                                            i37 = 3803;
                                            iM450216 = C19806.m45029("ܿ֫") ^ i34;
                                            i29 = ((iM450216 ^ i33) * (-30851)) ^ 1521695294;
                                            i30 = 838779558;
                                            i36 = iM450216 ^ i30;
                                            i35 = i29;
                                            break;
                                        case -961259736:
                                        case 789994072:
                                            C1460.m5050();
                                            ViewGroupOnHierarchyChangeListenerC1916.m6233();
                                            iM450216 = ThreadFactoryC3888.m11306("᩺ܿ") ^ i33;
                                            i29 = ((iM450216 ^ i34) * 13825) ^ 1666345640;
                                            i30 = 412114918;
                                            i36 = iM450216 ^ i30;
                                            i35 = i29;
                                            break;
                                        case -848178500:
                                        case -573643348:
                                            if (RunnableC1564.m5348(itM10564)) {
                                                iM450216 = (ThreadFactoryC3888.m11306("ᩳ۠") + i34) * 93;
                                                i29 = ((iM450216 ^ i33) * 30103) ^ 1963804760;
                                                i30 = 898953038;
                                            } else {
                                                iM450216 = ThreadFactoryC3888.m11306("ۢ᩻") ^ i34;
                                                i29 = ((iM450216 ^ i33) * (-20803)) ^ 715871848;
                                                i30 = -555871244;
                                            }
                                            i36 = iM450216 ^ i30;
                                            i35 = i29;
                                            break;
                                        case -842689209:
                                        case 833061362:
                                            strM4892 = C1398.m4892(sArr7, i38, 19, i37);
                                            if (C1419.m4973()) {
                                                iM450216 = (i33 - ThreadFactoryC3888.m11306("ۗܰ")) * 101;
                                                i29 = ((iM450216 ^ i34) * (-20653)) ^ (-157510464);
                                                i30 = 1122407598;
                                            } else {
                                                iM450216 = (C19806.m45029("۟ۛ") ^ i33) * 25;
                                                i29 = ((iM450216 ^ i34) * (-7247)) ^ 226499517;
                                                i30 = 622966849;
                                            }
                                            i36 = iM450216 ^ i30;
                                            i35 = i29;
                                            break;
                                        case -667626140:
                                        case 1738387182:
                                            ArrayList arrayList3 = arrayList;
                                            itM9863 = ViewTreeObserverOnPreDrawListenerC3327.m9863(arrayList3);
                                            arrayList2 = arrayList3;
                                            iM450216 = ThreadFactoryC3888.m11306("ܶܽ") ^ i33;
                                            i29 = ((iM450216 ^ i34) * (-5587)) ^ (-383800367);
                                            i30 = -2030765822;
                                            i36 = iM450216 ^ i30;
                                            i35 = i29;
                                            break;
                                        case -459148326:
                                        case 1190760469:
                                            C2788.m8480(sb, c3153.f11887);
                                            iM450216 = ThreadFactoryC3888.m11306("᩷ۡ") ^ i33;
                                            i29 = ((iM450216 ^ i34) * 26679) ^ (-1086399813);
                                            i30 = -2031547602;
                                            i36 = iM450216 ^ i30;
                                            i35 = i29;
                                            break;
                                        case -442105012:
                                        case -245959901:
                                            i39 = s3 + s2;
                                            if (C3722.f13525 > 0) {
                                                iM450216 = (i33 - ThreadFactoryC3888.m11306("ܽۨ")) * 73;
                                                i29 = ((iM450216 ^ i34) * (-20677)) ^ 807928859;
                                                i30 = 1292315145;
                                                i36 = iM450216 ^ i30;
                                                i35 = i29;
                                            } else {
                                                iM450217 = (i34 - ThreadFactoryC3888.m11306("ۗᩴ")) * 37;
                                                i35 = ((iM450217 ^ i33) * (-29949)) ^ (-1814829565);
                                                i31 = -1141026762;
                                                i36 = iM450217 ^ i31;
                                                dialogInterfaceOnDismissListenerC1741 = this;
                                            }
                                            break;
                                        case -417064008:
                                        case 1554124945:
                                            C3660.m10783(C3535.m10429(interfaceC17314M8257, strM4892, C0817.m3407(sb)));
                                            if (C1875.f7103 >= 0) {
                                                iM450216 = C19806.m45029("᩻ᩴ") ^ i34;
                                                i29 = ((iM450216 ^ i33) * (-25417)) ^ 1768688189;
                                                i30 = -581814807;
                                            } else {
                                                iM450216 = (ThreadFactoryC3888.m11306("֨ۤ") + i33) * 25;
                                                i29 = ((iM450216 ^ i34) * (-4515)) ^ (-136672814);
                                                i30 = 132693876;
                                            }
                                            i36 = iM450216 ^ i30;
                                            i35 = i29;
                                            break;
                                        case -377372414:
                                        case 1373514806:
                                            C19806.m45023(sb, '|');
                                            iM450216 = ThreadFactoryC3888.m11306("֫ܶ") ^ i34;
                                            i29 = ((iM450216 ^ i33) * (-25875)) ^ 1436425320;
                                            i30 = -1295855819;
                                            i36 = iM450216 ^ i30;
                                            i35 = i29;
                                            break;
                                        case -354814637:
                                        case 1089319730:
                                            itM10564 = C3577.m10563(arrayList2);
                                            iM450216 = (i33 - ThreadFactoryC3888.m11306("۬ۘ")) * (-81);
                                            i29 = ((iM450216 ^ i34) * 12331) ^ 1728320348;
                                            i30 = -1080109748;
                                            i36 = iM450216 ^ i30;
                                            i35 = i29;
                                            break;
                                        case 389809433:
                                        case 1805297434:
                                            sArr5 = f6867;
                                            if (!C0962.f3784) {
                                                int iM450218 = C19806.m45029("ۘ᩹") ^ i33;
                                                i29 = ((iM450218 ^ i34) * 25421) ^ (-266883849);
                                                i36 = iM450218 ^ (-899758443);
                                                dialogInterfaceOnDismissListenerC1741 = this;
                                                sArr6 = sArr5;
                                                i35 = i29;
                                            } else {
                                                int iM113015 = ThreadFactoryC3888.m11306("᩹ۚ") ^ i34;
                                                i36 = iM113015 ^ (-18287727);
                                                sArr6 = sArr5;
                                                i35 = ((iM113015 ^ i33) * (-27771)) ^ (-139685174);
                                                dialogInterfaceOnDismissListenerC1741 = this;
                                            }
                                            break;
                                        case 619026721:
                                        case 1688772618:
                                            i38 = 1;
                                            if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                                                sArr5 = sArr6;
                                                int iM113016 = ThreadFactoryC3888.m11306("᩹ۚ") ^ i34;
                                                i36 = iM113016 ^ (-18287727);
                                                sArr6 = sArr5;
                                                i35 = ((iM113016 ^ i33) * (-27771)) ^ (-139685174);
                                                dialogInterfaceOnDismissListenerC1741 = this;
                                            } else {
                                                iM450216 = (C19806.m45029("֡ۚ") ^ i34) * (-97);
                                                i29 = ((iM450216 ^ i33) * 3801) ^ (-717799614);
                                                i30 = 1975745585;
                                                i36 = iM450216 ^ i30;
                                                i35 = i29;
                                            }
                                            break;
                                        case 714812146:
                                        case 2120951036:
                                            C2871.m8647(runnable);
                                            break;
                                        case 872680777:
                                        case 1544146811:
                                            if (C0962.m3748(itM9863)) {
                                                iM450216 = C19806.m45029("ۚ֫") ^ i34;
                                                i29 = ((iM450216 ^ i33) * (-7549)) ^ 1831905870;
                                                i30 = -573239147;
                                            } else {
                                                iM450216 = (i33 - ThreadFactoryC3888.m11306("ۜܳ")) * 65;
                                                i29 = ((iM450216 ^ i34) * 9235) ^ 156141186;
                                                i30 = -2073749850;
                                            }
                                            i36 = iM450216 ^ i30;
                                            i35 = i29;
                                            break;
                                        case 874128104:
                                        case 1455228669:
                                            if (RunnableC1564.m5348(itM10563)) {
                                                iM450216 = C19806.m45029("ۧܰ") ^ i34;
                                                i29 = ((iM450216 ^ i33) * (-3831)) ^ (-1408668337);
                                                i30 = -1033239856;
                                            } else {
                                                iM450216 = (ThreadFactoryC3888.m11306("֫֨") + i33) * 31;
                                                i29 = ((iM450216 ^ i34) * (-7769)) ^ 345700783;
                                                i30 = -68070609;
                                            }
                                            i36 = iM450216 ^ i30;
                                            i35 = i29;
                                            break;
                                        case 878334048:
                                        case 919792854:
                                            int i43 = i41 + i42;
                                            if (i40 - (i43 + i43) <= 0) {
                                                iM450216 = ThreadFactoryC3888.m11306("᩵ۧ") ^ i34;
                                                i29 = ((iM450216 ^ i33) * 11567) ^ (-1031688021);
                                                i30 = 1589467386;
                                            } else {
                                                iM450216 = (i33 - C19806.m45029("ۧ۬")) * (-5);
                                                i29 = ((iM450216 ^ i34) * 28017) ^ 2010637344;
                                                i30 = -1805294210;
                                            }
                                            i36 = iM450216 ^ i30;
                                            i35 = i29;
                                            break;
                                        case 1337324314:
                                        case 2024684216:
                                            c = 0;
                                            if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                                                iM450216 = (C19806.m45029("ۚ۫") ^ i34) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                i29 = ((iM450216 ^ i33) * (-21649)) ^ (-645719296);
                                                i30 = 1462419166;
                                                i36 = iM450216 ^ i30;
                                                i35 = i29;
                                            } else {
                                                sArr5 = sArr6;
                                                int iM113017 = ThreadFactoryC3888.m11306("᩹ۚ") ^ i34;
                                                i36 = iM113017 ^ (-18287727);
                                                sArr6 = sArr5;
                                                i35 = ((iM113017 ^ i33) * (-27771)) ^ (-139685174);
                                                dialogInterfaceOnDismissListenerC1741 = this;
                                            }
                                            break;
                                        case 1356424728:
                                        case 1409356530:
                                            interfaceC17314M8257 = C2704.m8257(ApplicationC0716.f2992);
                                            sArr7 = f6867;
                                            if (RunnableC3388.m10064()) {
                                                iM450216 = C19806.m45029("֫ۛ") ^ i34;
                                                i29 = ((iM450216 ^ i33) * (-23133)) ^ 2015291491;
                                                i30 = 852204702;
                                            } else {
                                                iM450216 = ThreadFactoryC3888.m11306("᩺ܿ") ^ i33;
                                                i29 = ((iM450216 ^ i34) * 13825) ^ 1666345640;
                                                i30 = 412114918;
                                            }
                                            i36 = iM450216 ^ i30;
                                            i35 = i29;
                                            break;
                                        case 1455526051:
                                        case 1616642508:
                                            ((C3152) C0278.m1776(itM10564)).f11885 = false;
                                            iM450216 = (i33 - ThreadFactoryC3888.m11306("۬ۘ")) * (-81);
                                            i29 = ((iM450216 ^ i34) * 12331) ^ 1728320348;
                                            i30 = -1080109748;
                                            i36 = iM450216 ^ i30;
                                            i35 = i29;
                                            break;
                                        default:
                                            if (((C3152) C0216.m1584(itM9863)).f11885) {
                                                iM450216 = ThreadFactoryC3888.m11306("ܶܽ") ^ i33;
                                                i29 = ((iM450216 ^ i34) * (-5587)) ^ (-383800367);
                                                i30 = -2030765822;
                                            } else {
                                                iM450216 = ThreadFactoryC3888.m11306("ۢ᩻") ^ i34;
                                                i29 = ((iM450216 ^ i33) * (-20803)) ^ 715871848;
                                                i30 = -555871244;
                                            }
                                            i36 = iM450216 ^ i30;
                                            i35 = i29;
                                            break;
                                    }
                                    return;
                                }
                            }
                        });
                        i27 = i27;
                        obj = obj2;
                        iM11309 = ThreadFactoryC3888.m11306(C2477.m7604(f15620, 35, 3, i23));
                        if (!C0526.f2219) {
                            int iM450216 = (C19806.m45029("ۤ۟") + i20) * (-79);
                            i = ((iM450216 ^ i19) * 2535) ^ (-1437890029);
                            c0076 = c0074;
                            obj2 = obj;
                            i22 = iM450216 ^ (-1968498929);
                            int i29 = i27;
                            view2 = view2;
                            i21 = i;
                            i27 = i29;
                        } else {
                            viewM4976 = view2;
                            int i30 = i28;
                            sArr3 = sArr3;
                            listView2 = listView2;
                            i25 = i25;
                            i2 = i30;
                            iM11306 = ThreadFactoryC3888.m11306("۟ۤ") ^ i20;
                            i7 = ((iM11306 ^ i19) * (-18901)) ^ 693200742;
                            i6 = 669117868;
                            int i31 = iM11306 ^ i6;
                            iM113010 = iM113010;
                            i21 = i7;
                            c0076 = c0074;
                            i27 = i27;
                            obj2 = obj;
                            i22 = i31;
                            view2 = viewM4976;
                            int i32 = i25;
                            listView2 = listView2;
                            sArr3 = sArr3;
                            i28 = i2;
                            i25 = i32;
                        }
                    } else {
                        i11 = i25;
                        i12 = i28;
                        sArr = sArr3;
                        int iM113011 = (ThreadFactoryC3888.m11306("ۧ᩹") ^ i19) * (-125);
                        view = view2;
                        i21 = ((iM113011 ^ i20) * 31625) ^ (-145257221);
                        sArr3 = sArr;
                        i28 = i12;
                        i25 = i11;
                        c0076 = c0074;
                        listView2 = listView2;
                        i22 = iM113011 ^ (-1767304602);
                        i27 = i27;
                        view2 = view;
                    }
                    break;
                case -1908650653:
                case 1459107000:
                    C10634.m26823(c8067, iM450215 ^ 2127405301, obj2);
                    C7105.m18993(C1460.m5052(CallableC1627.m5514(c8067)), new View.OnClickListener() { // from class: l.ۢۢۨ
                        {
                            int i33 = -494622904;
                            int i34 = RunnableC0195.f1321;
                            int i35 = C2642.f10294;
                            int iM113012 = ThreadFactoryC3888.m11306("ᩳۙ") ^ i34;
                            int i36 = ((iM113012 ^ i35) * 23413) ^ (-1593397036);
                            int i37 = 184583631;
                            while (true) {
                                i33 = ((((i33 ^ i35) * 21863) >> 31) & i36) ^ (iM113012 ^ i37);
                                switch (i33) {
                                    case -2020034371:
                                    case -1941285251:
                                        if (CallableC1627.f6528) {
                                            iM113012 = C19806.m45029("۫᩷") ^ i35;
                                            i36 = ((iM113012 ^ i34) * 30083) ^ 1247744519;
                                            i37 = -132565052;
                                        } else {
                                            iM113012 = C19806.m45029("ۡܺ") ^ i34;
                                            i36 = ((iM113012 ^ i35) * 22831) ^ (-1009892394);
                                            i37 = 2036383237;
                                        }
                                        break;
                                    case -1816850376:
                                    case -1374602297:
                                        if (RunnableC3388.f12514 >= 0) {
                                            iM113012 = C19806.m45029("ܺ᩵") ^ i34;
                                            i36 = ((iM113012 ^ i35) * 18303) ^ (-1945504296);
                                            i37 = 222440103;
                                        } else {
                                            iM113012 = C19806.m45029("ۡۘ") ^ i34;
                                            i36 = ((iM113012 ^ i35) * 6121) ^ 1689082478;
                                            i37 = 609071865;
                                        }
                                        break;
                                    case -1512869149:
                                    case -1509848870:
                                        if (C3660.m10791() != 0) {
                                            iM113012 = (ThreadFactoryC3888.m11306("ܿ᩷") ^ i34) * (-47);
                                            i36 = ((iM113012 ^ i35) * 9279) ^ 1790178349;
                                            i37 = 1468519420;
                                        } else {
                                            iM113012 = ThreadFactoryC3888.m11306("ᩳ֨") ^ i34;
                                            i36 = ((iM113012 ^ i35) * 17959) ^ (-1849212259);
                                            i37 = -1929433733;
                                        }
                                        break;
                                    case -1462343334:
                                    case -1378432139:
                                        if (C7105.f23796 >= 0) {
                                            iM113012 = C19806.m45029("ܺ᩵") ^ i34;
                                            i36 = ((iM113012 ^ i35) * 18303) ^ (-1945504296);
                                            i37 = 222440103;
                                        } else {
                                            iM113012 = ThreadFactoryC3888.m11306("ܳ᩶") ^ i34;
                                            i36 = ((iM113012 ^ i35) * 21673) ^ (-119884037);
                                            i37 = -1721555412;
                                        }
                                        break;
                                    case -1365834097:
                                    case 103105465:
                                        C2124.m6673();
                                        throw new RuntimeException();
                                    case -1233147536:
                                    case 2040466911:
                                        return;
                                    case -1134854969:
                                    case -515307563:
                                        ThreadFactoryC3888.m11300();
                                        if (C2124.f7782 <= 0) {
                                            iM113012 = (C19806.m45029("ܶۙ") + i35) * (-123);
                                            i36 = ((iM113012 ^ i34) * (-15189)) ^ 1923318854;
                                            i37 = -1592811205;
                                        } else {
                                            iM113012 = C19806.m45029("ܺ᩵") ^ i34;
                                            i36 = ((iM113012 ^ i35) * 18303) ^ (-1945504296);
                                            i37 = 222440103;
                                        }
                                        break;
                                    case -1045408387:
                                    case 985008604:
                                        if (C2124.m6673() <= 0) {
                                            iM113012 = C19806.m45029("ܺ᩵") ^ i34;
                                            i36 = ((iM113012 ^ i35) * 18303) ^ (-1945504296);
                                            i37 = 222440103;
                                        } else {
                                            iM113012 = (ThreadFactoryC3888.m11306("ۚ᩻") ^ i35) * (-109);
                                            i36 = ((iM113012 ^ i34) * 20907) ^ (-881698948);
                                            i37 = -195716731;
                                        }
                                        break;
                                    case -836250359:
                                    case -625626065:
                                        if (RunnableC3388.f12514 < 0) {
                                            iM113012 = ThreadFactoryC3888.m11306("᩻᩵") ^ i35;
                                            i36 = ((iM113012 ^ i34) * (-29039)) ^ (-188565380);
                                            i37 = 1507910081;
                                        } else {
                                            iM113012 = (ThreadFactoryC3888.m11306("ܿ᩷") ^ i34) * (-47);
                                            i36 = ((iM113012 ^ i35) * 9279) ^ 1790178349;
                                            i37 = 1468519420;
                                        }
                                        break;
                                    case -745028420:
                                    case -82746756:
                                        if (RunnableC0195.f1321 >= 0) {
                                            iM113012 = ThreadFactoryC3888.m11306("᩻᩵") ^ i35;
                                            i36 = ((iM113012 ^ i34) * (-29039)) ^ (-188565380);
                                            i37 = 1507910081;
                                        } else {
                                            iM113012 = (C19806.m45029("᩵ۖ") + i35) * (-91);
                                            i36 = ((iM113012 ^ i34) * (-24543)) ^ (-1601700621);
                                            i37 = 575365159;
                                        }
                                        break;
                                    case -522259424:
                                    case 808453127:
                                        if (RunnableC1564.f6300) {
                                            iM113012 = (ThreadFactoryC3888.m11306("ܿ᩷") ^ i34) * (-47);
                                            i36 = ((iM113012 ^ i35) * 9279) ^ 1790178349;
                                            i37 = 1468519420;
                                        } else {
                                            iM113012 = (i35 - ThreadFactoryC3888.m11306("᩶֫")) * (-39);
                                            i36 = ((iM113012 ^ i34) * 27099) ^ 1907170725;
                                            i37 = -1132780219;
                                        }
                                        break;
                                    case 632204922:
                                    case 1859270058:
                                        C2477.m7593();
                                        iM113012 = C19806.m45029("ܺ᩵") ^ i34;
                                        i36 = ((iM113012 ^ i35) * 18303) ^ (-1945504296);
                                        i37 = 222440103;
                                        break;
                                    case 791265981:
                                    case 1480212804:
                                        if (RunnableC1895.f7152) {
                                            iM113012 = C19806.m45029("ۗ᩹") ^ i35;
                                            i36 = ((iM113012 ^ i34) * 26221) ^ (-1810070368);
                                            i37 = -1444659768;
                                        } else {
                                            iM113012 = C19806.m45029("ۡܺ") ^ i34;
                                            i36 = ((iM113012 ^ i35) * 22831) ^ (-1009892394);
                                            i37 = 2036383237;
                                        }
                                        break;
                                    case 1182323873:
                                    case 1246401854:
                                        C0050.m946();
                                        if (C1461.f5957 <= 0) {
                                            iM113012 = (ThreadFactoryC3888.m11306("ܿ᩷") ^ i34) * (-47);
                                            i36 = ((iM113012 ^ i35) * 9279) ^ 1790178349;
                                            i37 = 1468519420;
                                        } else {
                                            iM113012 = (C19806.m45029("ܶۙ") + i35) * (-123);
                                            i36 = ((iM113012 ^ i34) * (-15189)) ^ 1923318854;
                                            i37 = -1592811205;
                                        }
                                        break;
                                    case 1852111806:
                                    case 2123630404:
                                        if (RunnableC1895.f7152) {
                                            iM113012 = C19806.m45029("ܺ᩹") ^ i34;
                                            i36 = ((iM113012 ^ i35) * 11275) ^ (-1498424270);
                                            i37 = 1489260112;
                                        } else {
                                            iM113012 = (ThreadFactoryC3888.m11306("ܿ᩷") ^ i34) * (-47);
                                            i36 = ((iM113012 ^ i35) * 9279) ^ 1790178349;
                                            i37 = 1468519420;
                                        }
                                        break;
                                    default:
                                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                                            iM113012 = ThreadFactoryC3888.m11306("᩻᩵") ^ i35;
                                            i36 = ((iM113012 ^ i34) * (-29039)) ^ (-188565380);
                                            i37 = 1507910081;
                                        } else {
                                            iM113012 = C19806.m45029("֨ܺ") ^ i34;
                                            i36 = ((iM113012 ^ i35) * 7501) ^ 2136897094;
                                            i37 = 97839131;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            Iterator itM9863 = null;
                            C3152 c3153 = null;
                            boolean z2 = false;
                            int i33 = -1504829029;
                            int i34 = ThreadFactoryC3888.f14547;
                            int i35 = C1461.f5957;
                            int iM113012 = (i35 - ThreadFactoryC3888.m11306("᩷ܽ")) * (-9);
                            int i36 = ((iM113012 ^ i34) * (-603)) ^ 1323399465;
                            int i37 = 1087569078;
                            while (true) {
                                i33 = ((((i33 ^ i34) * 20041) >> 31) & i36) ^ (iM113012 ^ i37);
                                switch (i33) {
                                    case -2039892005:
                                    case -437765819:
                                        c20282.notifyDataSetChanged();
                                        break;
                                    case -1879180298:
                                    case 584057575:
                                        itM9863 = ViewTreeObserverOnPreDrawListenerC3327.m9863(arrayList);
                                        iM113012 = (C19806.m45029("᩷ۗ") + i34) * (-75);
                                        i36 = ((iM113012 ^ i35) * 4453) ^ (-1646578306);
                                        i37 = -1434245349;
                                        break;
                                    case -1537273171:
                                    case 1657028991:
                                        if (C2477.f9839 <= 0) {
                                            iM113012 = (ThreadFactoryC3888.m11306("ۘᩴ") ^ i34) * 55;
                                            i36 = ((iM113012 ^ i35) * (-16683)) ^ 295746363;
                                            i37 = -1002039584;
                                        } else {
                                            iM113012 = C19806.m45029("ᩳܳ") ^ i34;
                                            i36 = ((iM113012 ^ i35) * (-4403)) ^ (-686925253);
                                            i37 = 1831713220;
                                        }
                                        break;
                                    case -1396562803:
                                    case 1386976467:
                                        if (CallableC1627.m5507() != 0) {
                                            iM113012 = (ThreadFactoryC3888.m11306("᩵ܿ") + i34) * 25;
                                            i36 = ((iM113012 ^ i35) * (-24511)) ^ (-1585487759);
                                            i37 = -2107955845;
                                        } else {
                                            iM113012 = (ThreadFactoryC3888.m11306("᩶ۜ") + i35) * 43;
                                            i36 = ((iM113012 ^ i34) * (-2137)) ^ (-919065538);
                                            i37 = 1818422387;
                                        }
                                        break;
                                    case -1346326462:
                                    case 90640911:
                                        if (RunnableC1564.m5348(itM9863)) {
                                            iM113012 = C19806.m45029("֡ۡ") ^ i34;
                                            i36 = ((iM113012 ^ i35) * 5437) ^ 2048249920;
                                            i37 = 865020196;
                                        } else {
                                            iM113012 = (ThreadFactoryC3888.m11306("ۜܽ") + i35) * (-45);
                                            i36 = ((iM113012 ^ i34) * (-1981)) ^ 1879032262;
                                            i37 = -1813661047;
                                        }
                                        break;
                                    case -1242651216:
                                    case 189808223:
                                        if (C10634.f36300 >= 0) {
                                            iM113012 = (ThreadFactoryC3888.m11306("᩵ܿ") + i34) * 25;
                                            i36 = ((iM113012 ^ i35) * (-24511)) ^ (-1585487759);
                                            i37 = -2107955845;
                                        } else {
                                            iM113012 = (C19806.m45029("ۜۛ") + i34) * (-95);
                                            i36 = ((iM113012 ^ i35) * 14391) ^ (-345489071);
                                            i37 = 2135142293;
                                        }
                                        break;
                                    case -1224514280:
                                    case -1025454497:
                                        if (C1377.f5749) {
                                            iM113012 = (i35 - C19806.m45029("ۙ᩶")) * (-33);
                                            i36 = ((iM113012 ^ i34) * 13157) ^ (-1072978791);
                                            i37 = 1849479287;
                                        } else {
                                            iM113012 = (ThreadFactoryC3888.m11306("۫ۙ") + i35) * 87;
                                            i36 = ((iM113012 ^ i34) * 10197) ^ (-1213834586);
                                            i37 = 1465510548;
                                        }
                                        break;
                                    case -957537303:
                                    case -229481787:
                                        if (ThreadFactoryC3888.f14547 > 0) {
                                            iM113012 = C19806.m45029("۬ܶ") ^ i35;
                                            i36 = ((iM113012 ^ i34) * 4791) ^ 1866303414;
                                            i37 = 290451504;
                                        } else {
                                            iM113012 = (ThreadFactoryC3888.m11306("ۘᩴ") ^ i34) * 55;
                                            i36 = ((iM113012 ^ i35) * (-16683)) ^ 295746363;
                                            i37 = -1002039584;
                                        }
                                        break;
                                    case -900646293:
                                    case 1709971008:
                                        c3153 = (C3152) C0216.m1584(itM9863);
                                        if (C2704.f10408) {
                                            iM113012 = C19806.m45029("۠۟") ^ i35;
                                            i36 = ((iM113012 ^ i34) * (-11017)) ^ 1240162486;
                                            i37 = -1324105475;
                                        } else {
                                            iM113012 = (ThreadFactoryC3888.m11306("۫ۙ") + i35) * 87;
                                            i36 = ((iM113012 ^ i34) * 10197) ^ (-1213834586);
                                            i37 = 1465510548;
                                        }
                                        break;
                                    case -854708481:
                                    case -378132831:
                                        z2 = c3153.f11885;
                                        if (C1377.f5749) {
                                            iM113012 = (i35 - ThreadFactoryC3888.m11306("ۚۜ")) * (-11);
                                            i36 = ((iM113012 ^ i34) * 28979) ^ (-209029913);
                                            i37 = 1339876152;
                                        } else {
                                            iM113012 = (ThreadFactoryC3888.m11306("۫ۙ") + i35) * 87;
                                            i36 = ((iM113012 ^ i34) * 10197) ^ (-1213834586);
                                            i37 = 1465510548;
                                        }
                                        break;
                                    case -629349877:
                                    case 741089512:
                                        C1148.m4232();
                                        C0278.m1789();
                                        iM113012 = (ThreadFactoryC3888.m11306("ۘᩴ") ^ i34) * 55;
                                        i36 = ((iM113012 ^ i35) * (-16683)) ^ 295746363;
                                        i37 = -1002039584;
                                        break;
                                    case -623812058:
                                    case 380453603:
                                        if (C1461.m5080()) {
                                            iM113012 = C19806.m45029("۬ܶ") ^ i35;
                                            i36 = ((iM113012 ^ i34) * 4791) ^ 1866303414;
                                            i37 = 290451504;
                                        } else {
                                            iM113012 = C19806.m45029("ۗ۟") ^ i35;
                                            i36 = ((iM113012 ^ i34) * (-21193)) ^ 328822439;
                                            i37 = 181302168;
                                        }
                                        break;
                                    case -473082462:
                                    case -181599187:
                                        if (RunnableC1564.f6300) {
                                            iM113012 = (ThreadFactoryC3888.m11306("ۘᩴ") ^ i34) * 55;
                                            i36 = ((iM113012 ^ i35) * (-16683)) ^ 295746363;
                                            i37 = -1002039584;
                                        } else {
                                            iM113012 = C19806.m45029("᩻᩺") ^ i34;
                                            i36 = ((iM113012 ^ i35) * (-24911)) ^ (-1532095555);
                                            i37 = 1087211448;
                                        }
                                        break;
                                    case -355460780:
                                    case 1260161608:
                                        RunnableC1564.m5345();
                                        break;
                                    case -115968599:
                                    case 2087921389:
                                        c3153.f11885 = !z2;
                                        iM113012 = (C19806.m45029("᩷ۗ") + i34) * (-75);
                                        i36 = ((iM113012 ^ i35) * 4453) ^ (-1646578306);
                                        i37 = -1434245349;
                                        break;
                                    case 331881871:
                                    case 732510249:
                                        if (C1189.m4368() <= 0) {
                                            iM113012 = (ThreadFactoryC3888.m11306("֡ۤ") ^ i34) * 17;
                                            i36 = ((iM113012 ^ i35) * 3517) ^ (-1488002233);
                                            i37 = 1726732252;
                                        } else {
                                            iM113012 = (C19806.m45029("᩵᩻") + i34) * (-75);
                                            i36 = ((iM113012 ^ i35) * 15201) ^ 1472190390;
                                            i37 = 1832798317;
                                        }
                                        break;
                                    case 986929344:
                                    case 994904288:
                                        if (C2704.m8255() <= 0) {
                                            iM113012 = C19806.m45029("۬ܶ") ^ i35;
                                            i36 = ((iM113012 ^ i34) * 4791) ^ 1866303414;
                                            i37 = 290451504;
                                        } else {
                                            iM113012 = (i35 - C19806.m45029("᩸۟")) * 81;
                                            i36 = ((iM113012 ^ i34) * (-21887)) ^ (-1632088226);
                                            i37 = -456480397;
                                        }
                                        break;
                                    case 1227493465:
                                    case 1543907844:
                                        RunnableC1564.m5345();
                                        if (C7105.f23796 >= 0) {
                                            iM113012 = (ThreadFactoryC3888.m11306("֡ۤ") ^ i34) * 17;
                                            i36 = ((iM113012 ^ i35) * 3517) ^ (-1488002233);
                                            i37 = 1726732252;
                                        } else {
                                            iM113012 = (ThreadFactoryC3888.m11306("ۘᩴ") ^ i34) * 55;
                                            i36 = ((iM113012 ^ i35) * (-16683)) ^ 295746363;
                                            i37 = -1002039584;
                                        }
                                        break;
                                    default:
                                        C1025.m3861();
                                        if (C0671.m3008() < 0) {
                                            iM113012 = (ThreadFactoryC3888.m11306("᩵ܿ") + i34) * 25;
                                            i36 = ((iM113012 ^ i35) * (-24511)) ^ (-1585487759);
                                            i37 = -2107955845;
                                        } else {
                                            iM113012 = (ThreadFactoryC3888.m11306("֡ۤ") ^ i34) * 17;
                                            i36 = ((iM113012 ^ i35) * 3517) ^ (-1488002233);
                                            i37 = 1726732252;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    break;
                case -1770078557:
                case 2003285438:
                    c0074 = c0076;
                    i11 = i25;
                    view2 = view2;
                    i27 = i27;
                    i12 = i28;
                    sArr = sArr3;
                    listView2 = (ListView) C2642.m8167(view2, iM450214 ^ 2097929383);
                    C16754.m39314(listView2);
                    obj2 = null;
                    listView2.setDivider(null);
                    if (C19806.f63586) {
                        int iM113012 = (ThreadFactoryC3888.m11306("ۧ᩹") ^ i19) * (-125);
                        view = view2;
                        i21 = ((iM113012 ^ i20) * 31625) ^ (-145257221);
                        sArr3 = sArr;
                        i28 = i12;
                        i25 = i11;
                        c0076 = c0074;
                        listView2 = listView2;
                        i22 = iM113012 ^ (-1767304602);
                    } else {
                        view = view2;
                        int iM450217 = C19806.m45029("᩻ܳ") ^ i20;
                        sArr3 = sArr;
                        i28 = i12;
                        i25 = i11;
                        c0076 = c0074;
                        i22 = iM450217 ^ 1601413269;
                        listView2 = listView2;
                        i21 = ((iM450217 ^ i19) * (-22545)) ^ (-1903997014);
                    }
                    i27 = i27;
                    view2 = view;
                    break;
                case -1599019567:
                case -1222656402:
                    c0076 = c0076;
                    iM450215 = C19806.m45029(C1066.m4040(sArr4, i27, 3, i23));
                    if (C0050.f912 > 0) {
                        iM450211 = (C19806.m45029("ܺ᩺") ^ i19) * (-51);
                        i8 = ((iM450211 ^ i20) * 16213) ^ 324173439;
                        i9 = -754583861;
                        int i33 = iM450211 ^ i9;
                        c0076 = c0076;
                        i22 = i33;
                        i21 = i8;
                    } else {
                        i27 = i27;
                        int i34 = i28;
                        sArr3 = sArr3;
                        listView2 = listView2;
                        i25 = i25;
                        i2 = i34;
                        iM450210 = (i19 - ThreadFactoryC3888.m11306("ᩴ۫")) * (-119);
                        i21 = ((iM450210 ^ i20) * (-27579)) ^ (-10662307);
                        i5 = -1094251466;
                        i10 = iM450210 ^ i5;
                        c0076 = c0076;
                        i27 = i27;
                        obj2 = obj2;
                        view2 = view2;
                        i22 = i10;
                        int i35 = i25;
                        listView2 = listView2;
                        sArr3 = sArr3;
                        i28 = i2;
                        i25 = i35;
                    }
                    break;
                case -1584786543:
                case 750191976:
                    C2249.m6915();
                    break;
                case -1464023537:
                case -956650783:
                    obj2 = obj2;
                    c0076 = c0076;
                    view2 = view2;
                    i27 = i27;
                    int i36 = i28;
                    sArr3 = sArr3;
                    listView2 = listView2;
                    i25 = i25;
                    i2 = i36;
                    iM113010 = ThreadFactoryC3888.m11306(RunnableC1606.m5481(f15620, 23, 3, i23)) ^ 2128979949;
                    if (AbstractC0464.m2313() != 0) {
                        iM450210 = (i19 - ThreadFactoryC3888.m11306("ᩴ۫")) * (-119);
                        i21 = ((iM450210 ^ i20) * (-27579)) ^ (-10662307);
                        i5 = -1094251466;
                    } else {
                        iM450210 = (i19 - C19806.m45029("᩷ܽ")) * 29;
                        i21 = ((iM450210 ^ i20) * 27107) ^ 318057085;
                        i5 = -1736928177;
                    }
                    i10 = iM450210 ^ i5;
                    c0076 = c0076;
                    i27 = i27;
                    obj2 = obj2;
                    view2 = view2;
                    i22 = i10;
                    int i37 = i25;
                    listView2 = listView2;
                    sArr3 = sArr3;
                    i28 = i2;
                    i25 = i37;
                    break;
                case -1327556233:
                case 982922542:
                    if (C1460.f5948 >= 0) {
                        c0074 = c0076;
                        view2 = view2;
                        i11 = i25;
                        i12 = i28;
                        sArr = sArr3;
                        int iM113013 = (ThreadFactoryC3888.m11306("ۧ᩹") ^ i19) * (-125);
                        view = view2;
                        i21 = ((iM113013 ^ i20) * 31625) ^ (-145257221);
                        sArr3 = sArr;
                        i28 = i12;
                        i25 = i11;
                        c0076 = c0074;
                        listView2 = listView2;
                        i22 = iM113013 ^ (-1767304602);
                        i27 = i27;
                        view2 = view;
                    } else {
                        iM450213 = (ThreadFactoryC3888.m11306("ܶ۬") ^ i20) * (-23);
                        i8 = ((iM450213 ^ i19) * 25191) ^ (-269940909);
                        i18 = 1988980241;
                        i22 = iM450213 ^ i18;
                        i21 = i8;
                    }
                    break;
                case -1235897231:
                case 956489086:
                    obj2 = obj2;
                    c0076 = c0076;
                    int i38 = iM113010;
                    view2 = view2;
                    i27 = i27;
                    int i39 = i28;
                    sArr3 = sArr3;
                    listView2 = listView2;
                    i25 = i25;
                    i2 = i39;
                    short s2 = f15620[22];
                    int i40 = s2 + 19380;
                    if (C2871.m8646()) {
                        int iM113014 = (ThreadFactoryC3888.m11306("ۘ۠") ^ i19) * (-17);
                        s = s2;
                        iM113010 = i38;
                        i24 = i40;
                        i21 = ((iM113014 ^ i20) * (-15035)) ^ (-1635043771);
                        c0076 = c0076;
                        obj2 = obj2;
                        i22 = iM113014 ^ (-1318819424);
                        i27 = i27;
                        view2 = view2;
                    } else {
                        s = s2;
                        iM113010 = i38;
                        i24 = i40;
                        iM450210 = (i19 - ThreadFactoryC3888.m11306("ᩴ۫")) * (-119);
                        i21 = ((iM450210 ^ i20) * (-27579)) ^ (-10662307);
                        i5 = -1094251466;
                        i10 = iM450210 ^ i5;
                        c0076 = c0076;
                        i27 = i27;
                        obj2 = obj2;
                        view2 = view2;
                        i22 = i10;
                    }
                    int i310 = i25;
                    listView2 = listView2;
                    sArr3 = sArr3;
                    i28 = i2;
                    i25 = i310;
                    break;
                case -1210733239:
                case 1353385729:
                    obj2 = obj2;
                    c0075 = c0076;
                    listView = listView2;
                    view2 = view2;
                    i27 = i27;
                    textView = (TextView) C2642.m8167(view2, iM11308 ^ 2118629074);
                    short[] sArr5 = f15620;
                    i28 = 32;
                    i25 = 3;
                    if (C2788.m8472() == 0) {
                        int iM450218 = C19806.m45029("ۜۘ") ^ i19;
                        i15 = ((iM450218 ^ i20) * 9391) ^ 848012654;
                        i16 = iM450218 ^ (-1063189243);
                        listView2 = listView;
                        c0076 = c0075;
                        sArr3 = sArr5;
                        i22 = i16;
                        i27 = i27;
                        view2 = view2;
                        i21 = i15;
                        obj2 = obj2;
                    } else {
                        sArr2 = sArr5;
                        i14 = 32;
                        int iM450219 = C19806.m45029("ܿۖ") ^ i19;
                        i = ((iM450219 ^ i20) * (-28661)) ^ 460729386;
                        listView2 = listView;
                        sArr3 = sArr2;
                        c0076 = c0075;
                        i22 = iM450219 ^ (-900455225);
                        i28 = i14;
                        obj2 = obj2;
                        int i210 = i27;
                        view2 = view2;
                        i21 = i;
                        i27 = i210;
                    }
                    break;
                case -1041232236:
                case 320985364:
                    str = (String) C0216.m1584(it);
                    c0076 = c0076;
                    if (!C1460.m5058(str, C1668.m5577(f15620, 41, 4, i23))) {
                        iM450211 = C19806.m45029("ܺ۠") ^ i20;
                        i8 = ((iM450211 ^ i19) * (-20473)) ^ (-983651927);
                        i9 = 2080556873;
                        int i311 = iM450211 ^ i9;
                        c0076 = c0076;
                        i22 = i311;
                        i21 = i8;
                    } else {
                        iM450212 = (ThreadFactoryC3888.m11306("ۨܳ") ^ i20) * (-81);
                        i15 = ((iM450212 ^ i19) * 29667) ^ (-404378094);
                        i17 = -94603148;
                        i16 = iM450212 ^ i17;
                        listView2 = listView2;
                        c0076 = c0076;
                        i22 = i16;
                        i27 = i27;
                        view2 = view2;
                        i21 = i15;
                        obj2 = obj2;
                    }
                    break;
                case -1014808416:
                case 1414803983:
                    C3286.m9798();
                    if (C1977.f7413 <= 0) {
                        obj = obj2;
                        c0074 = c0076;
                        viewM4976 = view2;
                        i27 = i27;
                        int i312 = i28;
                        sArr3 = sArr3;
                        listView2 = listView2;
                        i25 = i25;
                        i2 = i312;
                        iM11306 = ThreadFactoryC3888.m11306("۟ۤ") ^ i20;
                        i7 = ((iM11306 ^ i19) * (-18901)) ^ 693200742;
                        i6 = 669117868;
                        int i313 = iM11306 ^ i6;
                        iM113010 = iM113010;
                        i21 = i7;
                        c0076 = c0074;
                        i27 = i27;
                        obj2 = obj;
                        i22 = i313;
                        view2 = viewM4976;
                        int i314 = i25;
                        listView2 = listView2;
                        sArr3 = sArr3;
                        i28 = i2;
                        i25 = i314;
                    } else {
                        c0074 = c0076;
                        view2 = view2;
                        i11 = i25;
                        i12 = i28;
                        sArr = sArr3;
                        int iM113015 = (ThreadFactoryC3888.m11306("ۧ᩹") ^ i19) * (-125);
                        view = view2;
                        i21 = ((iM113015 ^ i20) * 31625) ^ (-145257221);
                        sArr3 = sArr;
                        i28 = i12;
                        i25 = i11;
                        c0076 = c0074;
                        listView2 = listView2;
                        i22 = iM113015 ^ (-1767304602);
                        i27 = i27;
                        view2 = view;
                    }
                    break;
                case -976902445:
                case 1635066568:
                    c3152 = new C3152(0);
                    c3152.f11887 = str;
                    c3152.f11886 = c0076.getOrDefault(str, str);
                    if (C3535.m10416(hashSet, str)) {
                        iM450213 = (C19806.m45029("֫ۜ") + i19) * 73;
                        i8 = ((iM450213 ^ i20) * 11747) ^ 1775991268;
                        i18 = 1465877387;
                    } else {
                        iM450213 = (i20 - ThreadFactoryC3888.m11306("ۢܳ")) * 17;
                        i8 = ((iM450213 ^ i19) * 29999) ^ (-570771263);
                        i18 = -1919723000;
                    }
                    i22 = iM450213 ^ i18;
                    i21 = i8;
                    break;
                case -864416332:
                case 1587621830:
                    obj2 = obj2;
                    c0075 = c0076;
                    i14 = i28;
                    int i41 = i25;
                    view2 = view2;
                    i27 = i27;
                    short[] sArr6 = sArr3;
                    listView = listView2;
                    i13 = i41;
                    int iM113016 = ThreadFactoryC3888.m11306(C2871.m8640(sArr6, i14, i41, i23)) ^ 2128911775;
                    sArr2 = sArr6;
                    TextView textView2 = textView;
                    C19806.m45022(textView2, iM113016);
                    if (C1460.f5948 >= 0) {
                        textView = textView2;
                        i25 = i13;
                        int iM4502110 = C19806.m45029("ܿۖ") ^ i19;
                        i = ((iM4502110 ^ i20) * (-28661)) ^ 460729386;
                        listView2 = listView;
                        sArr3 = sArr2;
                        c0076 = c0075;
                        i22 = iM4502110 ^ (-900455225);
                    } else {
                        int iM450220 = (C19806.m45029("ۧ֨") + i20) * 5;
                        textView = textView2;
                        i = ((iM450220 ^ i19) * (-8515)) ^ 137334044;
                        i25 = i13;
                        c0076 = c0075;
                        i22 = iM450220 ^ (-185443460);
                        listView2 = listView;
                        sArr3 = sArr2;
                    }
                    i28 = i14;
                    obj2 = obj2;
                    int i211 = i27;
                    view2 = view2;
                    i21 = i;
                    i27 = i211;
                    break;
                case -824904237:
                case 1464781920:
                    obj2 = obj2;
                    c0076 = c0076;
                    listView2 = listView2;
                    view2 = view2;
                    i27 = i27;
                    if (RunnableC1564.m5348(it)) {
                        iM450212 = C19806.m45029("᩹ۡ") ^ i19;
                        i15 = ((iM450212 ^ i20) * 9889) ^ (-796545840);
                        i17 = 1609811107;
                    } else {
                        iM450212 = (i19 - C19806.m45029("ۛ֡")) * (-113);
                        i15 = ((iM450212 ^ i20) * 23799) ^ 1972831473;
                        i17 = 290721436;
                    }
                    i16 = iM450212 ^ i17;
                    listView2 = listView2;
                    c0076 = c0076;
                    i22 = i16;
                    i27 = i27;
                    view2 = view2;
                    i21 = i15;
                    obj2 = obj2;
                    break;
                case -760703744:
                case 1107795946:
                    obj2 = obj2;
                    c0075 = c0076;
                    int i42 = i28;
                    view2 = view2;
                    i27 = i27;
                    sArr2 = sArr3;
                    listView = listView2;
                    i13 = i25;
                    iM11308 = ThreadFactoryC3888.m11306(C2642.m8172(f15620, 29, 3, i23));
                    if (C1398.f5802 <= 0) {
                        i14 = i42;
                        i25 = i13;
                        int iM4502111 = C19806.m45029("ܿۖ") ^ i19;
                        i = ((iM4502111 ^ i20) * (-28661)) ^ 460729386;
                        listView2 = listView;
                        sArr3 = sArr2;
                        c0076 = c0075;
                        i22 = iM4502111 ^ (-900455225);
                        i28 = i14;
                        obj2 = obj2;
                        int i212 = i27;
                        view2 = view2;
                        i21 = i;
                        i27 = i212;
                    } else {
                        int iM450221 = (C19806.m45029("ܶ۟") ^ i19) * 115;
                        c0076 = c0075;
                        obj2 = obj2;
                        i22 = iM450221 ^ (-1432243677);
                        view2 = view2;
                        i21 = ((iM450221 ^ i20) * (-17129)) ^ 48888699;
                        i27 = i27;
                        listView2 = listView;
                        sArr3 = sArr2;
                        i28 = i42;
                        i25 = i13;
                    }
                    break;
                case -672975311:
                case 2110076058:
                    i27 = i27;
                    obj = obj2;
                    c0074 = c0076;
                    iM113010 = iM113010;
                    int i43 = i28;
                    sArr3 = sArr3;
                    listView2 = listView2;
                    i25 = i25;
                    i2 = i43;
                    viewM4976 = C1419.m4976(abstractActivityC12483, iM113010);
                    iM450214 = C19806.m45029(C3577.m10571(f15620, 26, 3, i23));
                    if (C1398.f5802 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۤ") ^ i20;
                        i7 = ((iM11306 ^ i19) * (-18901)) ^ 693200742;
                        i6 = 669117868;
                    } else {
                        iM11306 = (C19806.m45029("᩹۟") ^ i20) * 123;
                        i7 = ((iM11306 ^ i19) * 27591) ^ 818169185;
                        i6 = -1331041608;
                    }
                    int i315 = iM11306 ^ i6;
                    iM113010 = iM113010;
                    i21 = i7;
                    c0076 = c0074;
                    i27 = i27;
                    obj2 = obj;
                    i22 = i315;
                    view2 = viewM4976;
                    int i316 = i25;
                    listView2 = listView2;
                    sArr3 = sArr3;
                    i28 = i2;
                    i25 = i316;
                    break;
                case -143536886:
                case 815349881:
                    obj2 = obj2;
                    c0076 = c0076;
                    iM113010 = iM113010;
                    view2 = view2;
                    i27 = i27;
                    int i44 = i28;
                    sArr3 = sArr3;
                    listView2 = listView2;
                    i25 = i25;
                    i2 = i44;
                    int i45 = (s * s) + 375584400;
                    if ((i45 + i45) - (i24 * i24) >= 0) {
                        iM45029 = (i20 - C19806.m45029("ۤ֨")) * (-59);
                        i3 = ((iM45029 ^ i19) * (-18013)) ^ (-563909942);
                        i4 = 844019627;
                    } else {
                        iM45029 = (C19806.m45029("۟۫") ^ i20) * (-73);
                        i3 = ((iM45029 ^ i19) * (-21375)) ^ (-784423987);
                        i4 = -564433177;
                    }
                    i10 = iM45029 ^ i4;
                    iM113010 = iM113010;
                    i21 = i3;
                    c0076 = c0076;
                    i27 = i27;
                    obj2 = obj2;
                    view2 = view2;
                    i22 = i10;
                    int i317 = i25;
                    listView2 = listView2;
                    sArr3 = sArr3;
                    i28 = i2;
                    i25 = i317;
                    break;
                case 182064746:
                case 1352768491:
                    obj2 = obj2;
                    c0076 = c0076;
                    view2 = view2;
                    i27 = i27;
                    c20282 = new C20282(abstractActivityC12483, arrayList);
                    listView2 = listView2;
                    listView2.setAdapter((ListAdapter) c20282);
                    listView2.setOnItemClickListener(c20282);
                    int i46 = DialogInterfaceC19356.f62401;
                    iM450212 = C19806.m45029("ܶܰ") ^ i19;
                    i15 = ((iM450212 ^ i20) * (-12975)) ^ 474545043;
                    i17 = -730774956;
                    i16 = iM450212 ^ i17;
                    listView2 = listView2;
                    c0076 = c0076;
                    i22 = i16;
                    i27 = i27;
                    view2 = view2;
                    i21 = i15;
                    obj2 = obj2;
                    break;
                case 546519000:
                case 2035011134:
                    C2249.m6905(arrayList, c3152);
                    c0076 = c0076;
                    iM450212 = (ThreadFactoryC3888.m11306("ۨܳ") ^ i20) * (-81);
                    i15 = ((iM450212 ^ i19) * 29667) ^ (-404378094);
                    i17 = -94603148;
                    i16 = iM450212 ^ i17;
                    listView2 = listView2;
                    c0076 = c0076;
                    i22 = i16;
                    i27 = i27;
                    view2 = view2;
                    i21 = i15;
                    obj2 = obj2;
                    break;
                case 721799674:
                case 1331039361:
                    C0962.m3746();
                    if (!C2704.f10408) {
                        iM450213 = (ThreadFactoryC3888.m11306("ܶ۬") ^ i20) * (-23);
                        i8 = ((iM450213 ^ i19) * 25191) ^ (-269940909);
                        i18 = 1988980241;
                        i22 = iM450213 ^ i18;
                        i21 = i8;
                    } else {
                        c0076 = c0076;
                        i27 = i27;
                        int i318 = i28;
                        sArr3 = sArr3;
                        listView2 = listView2;
                        i25 = i25;
                        i2 = i318;
                        iM450210 = (i19 - ThreadFactoryC3888.m11306("ᩴ۫")) * (-119);
                        i21 = ((iM450210 ^ i20) * (-27579)) ^ (-10662307);
                        i5 = -1094251466;
                        i10 = iM450210 ^ i5;
                        c0076 = c0076;
                        i27 = i27;
                        obj2 = obj2;
                        view2 = view2;
                        i22 = i10;
                        int i319 = i25;
                        listView2 = listView2;
                        sArr3 = sArr3;
                        i28 = i2;
                        i25 = i319;
                    }
                    break;
                case 836175166:
                case 869576840:
                    C7105.m18985();
                    C2871.m8646();
                    iM450213 = (ThreadFactoryC3888.m11306("ܶ۬") ^ i20) * (-23);
                    i8 = ((iM450213 ^ i19) * 25191) ^ (-269940909);
                    i18 = 1988980241;
                    i22 = iM450213 ^ i18;
                    i21 = i8;
                    break;
                case 1183329978:
                case 1845032853:
                    i2 = i28;
                    i23 = 41405;
                    iM45029 = ThreadFactoryC3888.m11306("۫֡") ^ i19;
                    i3 = ((iM45029 ^ i20) * 4385) ^ (-1304503712);
                    i4 = 918350758;
                    i10 = iM45029 ^ i4;
                    iM113010 = iM113010;
                    i21 = i3;
                    c0076 = c0076;
                    i27 = i27;
                    obj2 = obj2;
                    view2 = view2;
                    i22 = i10;
                    int i3110 = i25;
                    listView2 = listView2;
                    sArr3 = sArr3;
                    i28 = i2;
                    i25 = i3110;
                    break;
                case 1279198485:
                case 1655373389:
                    c0076 = c0076;
                    AbstractC0464.m2309(c8067, iM11309 ^ 2125474117, obj2);
                    sArr4 = f15620;
                    i27 = 38;
                    iM450211 = ThreadFactoryC3888.m11306("ܺۛ") ^ i20;
                    i8 = ((iM450211 ^ i19) * 18513) ^ 32650678;
                    i9 = -1436001304;
                    int i3111 = iM450211 ^ i9;
                    c0076 = c0076;
                    i22 = i3111;
                    i21 = i8;
                    break;
                case 1520070195:
                case 1738866772:
                    obj2 = obj2;
                    listView2 = listView2;
                    view2 = view2;
                    C0074 c0077 = (C0074) C21157.m47603();
                    TreeSet treeSet = new TreeSet(c0077.keySet());
                    arrayList = new ArrayList(treeSet.size() - 1);
                    HashSet hashSetM12228 = m12228();
                    c0076 = c0077;
                    it = treeSet.iterator();
                    hashSet = hashSetM12228;
                    z = true;
                    iM450212 = (ThreadFactoryC3888.m11306("ۨܳ") ^ i20) * (-81);
                    i15 = ((iM450212 ^ i19) * 29667) ^ (-404378094);
                    i17 = -94603148;
                    i16 = iM450212 ^ i17;
                    listView2 = listView2;
                    c0076 = c0076;
                    i22 = i16;
                    i27 = i27;
                    view2 = view2;
                    i21 = i15;
                    obj2 = obj2;
                    break;
                default:
                    i2 = i28;
                    i23 = 43009;
                    iM45029 = ThreadFactoryC3888.m11306("۫֡") ^ i19;
                    i3 = ((iM45029 ^ i20) * 4385) ^ (-1304503712);
                    i4 = 918350758;
                    i10 = iM45029 ^ i4;
                    iM113010 = iM113010;
                    i21 = i3;
                    c0076 = c0076;
                    i27 = i27;
                    obj2 = obj2;
                    view2 = view2;
                    i22 = i10;
                    int i3112 = i25;
                    listView2 = listView2;
                    sArr3 = sArr3;
                    i28 = i2;
                    i25 = i3112;
                    break;
            }
            return;
        }
    }
}
