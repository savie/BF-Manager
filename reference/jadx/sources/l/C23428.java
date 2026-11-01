package l;

import android.text.GetChars;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩻ۗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9A1 */
/* JADX INFO: loaded from: classes.dex */
public final class C23428 {

    /* JADX INFO: renamed from: ᩴ᩷ۡ, reason: not valid java name and contains not printable characters */
    private static final short[] f75851 = {2060, -15590, -15595, -15591, -15599, -15609, -15616, -15610, -15587, -15590, -15597, -15527, -15595, -15610, -15610, -15595, -15603, -15609, -15616, -15610, -15587, -15590, -15597, -15612, -15592, -15615, -15610, -15595, -15592, -15609, -15575, -15569, -15587, -15616, -15599, -15591, -15595, -15610, -15610, -15595, -15603, -15538, -15611, -15615, -15595, -15590, -15616, -15587, -15616, -15603, -15612, -15592, -15615, -15610, -15595, -15592, -15609, -15538, 2960, 32258, 32277, 32259, 32287, 32261, 32258, 32275, 32277, 32259, 32259, 32260, 32258, 32281, 32286, 32279, 32259, 32260, 32258, 32281, 32286, 32279, 32349, 32273, 32258, 32258, 32273, 32265, 32256, 32284, 32261, 32258, 32273, 32284, 32259, 32286, 32273, 32285, 32277, 2890, -23994, -24007};

    /* JADX WARN: Code duplicated, block: B:173:0x0697 A[PHI: r26 r32
      0x0697: PHI (r26v4 int) = (r26v2 int), (r26v1 int), (r26v1 int) binds: [B:172:0x0695, B:145:0x054c, B:10:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0697: PHI (r32v38 int) = (r32v21 int), (r32v30 int), (r32v41 int) binds: [B:172:0x0695, B:145:0x054c, B:10:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:185:0x0721 A[PHI: r23 r25 r32 r34
      0x0721: PHI (r23v3 char) = (r23v2 char), (r23v1 char) binds: [B:184:0x071f, B:176:0x06d5] A[DONT_GENERATE, DONT_INLINE]
      0x0721: PHI (r25v2 int) = (r25v1 int), (r25v3 int) binds: [B:184:0x071f, B:176:0x06d5] A[DONT_GENERATE, DONT_INLINE]
      0x0721: PHI (r32v19 int) = (r32v16 int), (r32v20 int) binds: [B:184:0x071f, B:176:0x06d5] A[DONT_GENERATE, DONT_INLINE]
      0x0721: PHI (r34v14 l.ܿ᩺᩵) = (r34v11 l.ܿ᩺᩵), (r34v15 l.ܿ᩺᩵) binds: [B:184:0x071f, B:176:0x06d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:189:0x0759 A[PHI: r22 r24 r32 r34
      0x0759: PHI (r22v3 short[]) = (r22v1 short[]), (r22v2 short[]), (r22v1 short[]) binds: [B:25:0x00db, B:188:0x0757, B:180:0x06fa] A[DONT_GENERATE, DONT_INLINE]
      0x0759: PHI (r24v2 short) = (r24v1 short), (r24v1 short), (r24v3 short) binds: [B:25:0x00db, B:188:0x0757, B:180:0x06fa] A[DONT_GENERATE, DONT_INLINE]
      0x0759: PHI (r32v17 int) = (r32v14 int), (r32v15 int), (r32v18 int) binds: [B:25:0x00db, B:188:0x0757, B:180:0x06fa] A[DONT_GENERATE, DONT_INLINE]
      0x0759: PHI (r34v12 l.ܿ᩺᩵) = (r34v9 l.ܿ᩺᩵), (r34v10 l.ܿ᩺᩵), (r34v13 l.ܿ᩺᩵) binds: [B:25:0x00db, B:188:0x0757, B:180:0x06fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:33:0x010d  */
    /* JADX WARN: Code duplicated, block: B:79:0x02a2 A[PHI: r32 r34
      0x02a2: PHI (r32v71 boolean) = (r32v11 boolean), (r32v67 boolean), (r32v72 boolean) binds: [B:239:0x02a2, B:77:0x0289, B:63:0x01f4] A[DONT_GENERATE, DONT_INLINE]
      0x02a2: PHI (r34v49 int) = (r34v8 int), (r34v45 int), (r34v50 int) binds: [B:239:0x02a2, B:77:0x0289, B:63:0x01f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m51593(GetChars getChars) throws Throwable {
        boolean z;
        int iM11306;
        int i;
        int i2;
        int iM45029;
        int i3;
        int iM11307;
        int i4;
        int iM450210;
        int i5;
        int i6;
        int i7;
        C17664 c17664;
        int iM450211;
        int i8;
        int i9;
        int i10;
        boolean zM5058 = false;
        boolean zM5059 = false;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i11 = 0;
        int i12 = 0;
        short s2 = 0;
        int i13 = 1169878908;
        int i14 = C3722.f13525;
        int i15 = C1461.f5957;
        int iM450212 = C19806.m45029("ܶۙ") ^ i15;
        int i16 = ((iM450212 ^ i14) * (-19551)) ^ (-1815362542);
        int i17 = iM450212 ^ 512658849;
        C3329 c3329Mo2399 = null;
        Throwable th = null;
        Object obj = null;
        String strM10328 = null;
        int i18 = 0;
        int iM10314 = 0;
        C3504 c3504 = null;
        int iM10327 = 0;
        int i19 = 0;
        boolean z2 = false;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        boolean zM2315 = false;
        boolean zM50510 = false;
        boolean zM50511 = false;
        boolean zM51593 = false;
        boolean z3 = false;
        C17664 c17665 = null;
        while (true) {
            i13 = i17 ^ (i16 & (((i13 ^ i14) * 7029) >> 31));
            switch (i13) {
                case -2086725772:
                case -1038606936:
                    throw th;
                case -2047645527:
                case 500446462:
                    z2 = true;
                    if (iM10327 != 1) {
                        iM11307 = (C19806.m45029("ۧܳ") ^ i15) * 21;
                        i = ((iM11307 ^ i14) * (-5969)) ^ 1025502609;
                        i4 = -116946619;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ۘۡ") + i14) * (-91);
                        i = ((iM11307 ^ i15) * (-20675)) ^ (-1944580771);
                        i4 = -1041048109;
                    }
                    i17 = iM11307 ^ i4;
                    i16 = i;
                    break;
                case -1992976115:
                case -82837183:
                    i18 = i18;
                    c17665 = c17665;
                    i12 = i11 + 1;
                    if (C7105.f23796 >= 0) {
                        int iM450213 = (C19806.m45029("۟֡") ^ i14) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM450213 ^ i15) * (-7757)) ^ (-112159755);
                        i9 = iM450213 ^ (-765856813);
                        c17665 = null;
                    } else {
                        iM450210 = (C19806.m45029("ۙᩳ") ^ i14) * (-19);
                        i5 = ((iM450210 ^ i15) * (-23297)) ^ (-1626906056);
                        i6 = 1737386959;
                        i9 = iM450210 ^ i6;
                        c17665 = c17665;
                    }
                    i7 = i18;
                    i17 = i9;
                    i16 = i5;
                    i18 = i7;
                    break;
                case -1970907520:
                case -1505397602:
                    i21 = 0;
                    i23 = 0;
                    iM450211 = (i14 - C19806.m45029("᩷֫")) * 61;
                    i5 = ((iM450211 ^ i15) * 29405) ^ 690090171;
                    i8 = -1225958979;
                    i9 = iM450211 ^ i8;
                    i7 = i18;
                    i17 = i9;
                    i16 = i5;
                    i18 = i7;
                    break;
                case -1891284070:
                case 900822987:
                    CallableC1627.m5507();
                    C19806.m45024();
                    i18 = i18;
                    c17664 = c17665;
                    iM450210 = ThreadFactoryC3888.m11306("ۗ۠") ^ i15;
                    c17665 = c17664;
                    i5 = ((iM450210 ^ i14) * (-4677)) ^ 1415417336;
                    i6 = 1381649907;
                    i9 = iM450210 ^ i6;
                    c17665 = c17665;
                    i7 = i18;
                    i17 = i9;
                    i16 = i5;
                    i18 = i7;
                    break;
                case -1863988467:
                case 479085950:
                    if (zM5059) {
                        iM11307 = ThreadFactoryC3888.m11306("᩸ۜ") ^ i14;
                        i = ((iM11307 ^ i15) * (-28875)) ^ 1851513876;
                        i4 = -2039255053;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("᩺ᩴ") ^ i14) * 19;
                        i = ((iM11307 ^ i15) * (-19045)) ^ 1197490223;
                        i4 = -22141118;
                    }
                    i17 = iM11307 ^ i4;
                    i16 = i;
                    break;
                case -1823241602:
                case 1943240788:
                    C3743.m10966();
                    if (!C0629.m2907()) {
                        i18 = i18;
                        int iM450214 = (C19806.m45029("۟֡") ^ i14) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM450214 ^ i15) * (-7757)) ^ (-112159755);
                        i9 = iM450214 ^ (-765856813);
                        c17665 = null;
                        i7 = i18;
                        i17 = i9;
                        i16 = i5;
                        i18 = i7;
                    }
                    i18 = i18;
                    iM450211 = (ThreadFactoryC3888.m11306("᩻ܳ") ^ i15) * 29;
                    i5 = ((iM450211 ^ i14) * (-31131)) ^ 102195700;
                    i8 = -1681973260;
                    i9 = iM450211 ^ i8;
                    i7 = i18;
                    i17 = i9;
                    i16 = i5;
                    i18 = i7;
                    break;
                case -1818674428:
                case -1623437839:
                    iM10327 = iM10327;
                    z2 = z2;
                    zM2315 = AbstractC0464.m2315(c3504.m10328(), C2332.m7082(f75851, 59, 9, i19));
                    iM45029 = ThreadFactoryC3888.m11306("ۨܺ") ^ i14;
                    i = ((iM45029 ^ i15) * 635) ^ 443040558;
                    i3 = 773880084;
                    i10 = iM45029 ^ i3;
                    z2 = z2;
                    iM10327 = iM10327;
                    i17 = i10;
                    i16 = i;
                    break;
                case -1808636772:
                case 190468132:
                    i18 = i18;
                    c17664 = c17665;
                    c3504.m10317(c17664);
                    z3 = false;
                    if (C0629.f2722 <= 0) {
                        iM450210 = ThreadFactoryC3888.m11306("ۗ۠") ^ i15;
                        c17665 = c17664;
                        i5 = ((iM450210 ^ i14) * (-4677)) ^ 1415417336;
                        i6 = 1381649907;
                    } else {
                        c17665 = c17664;
                        iM450210 = (i14 - C19806.m45029("۬ۛ")) * (-53);
                        i5 = ((iM450210 ^ i15) * (-24015)) ^ (-2097903804);
                        i6 = -1215688359;
                    }
                    i9 = iM450210 ^ i6;
                    c17665 = c17665;
                    i7 = i18;
                    i17 = i9;
                    i16 = i5;
                    i18 = i7;
                    break;
                case -1789342746:
                case -1717944302:
                    i18 = i18;
                    c17665 = c17665;
                    if (getChars instanceof InterfaceC0507) {
                        iM450210 = (i15 - C19806.m45029("۟᩺")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM450210 ^ i14) * 21007) ^ 75976281;
                        i6 = 1624604833;
                    } else {
                        iM450210 = C19806.m45029("᩷᩵") ^ i14;
                        i5 = ((iM450210 ^ i15) * (-24787)) ^ 902808196;
                        i6 = 1203546966;
                    }
                    i9 = iM450210 ^ i6;
                    c17665 = c17665;
                    i7 = i18;
                    i17 = i9;
                    i16 = i5;
                    i18 = i7;
                    break;
                case -1755264249:
                case 473258308:
                    iM10327 = iM10327;
                    z2 = z2;
                    if (zM50510) {
                        iM45029 = C19806.m45029("ۨᩳ") ^ i15;
                        i = ((iM45029 ^ i14) * (-18361)) ^ 1742742526;
                        i3 = -808106913;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֡ܳ") + i14) * (-73);
                        i = ((iM45029 ^ i15) * 2645) ^ (-649326214);
                        i3 = 1455053740;
                    }
                    i10 = iM45029 ^ i3;
                    z2 = z2;
                    iM10327 = iM10327;
                    i17 = i10;
                    i16 = i;
                    break;
                case -1750038153:
                case 612246423:
                    i18 = 0;
                    iM45029 = C19806.m45029("᩸ۙ") ^ i14;
                    i = ((iM45029 ^ i15) * (-9761)) ^ (-1412832028);
                    i3 = 1033808879;
                    i10 = iM45029 ^ i3;
                    z2 = z2;
                    iM10327 = iM10327;
                    i17 = i10;
                    i16 = i;
                    break;
                case -1741607461:
                case 1744690054:
                    C1398.m4895();
                    if (RunnableC0195.f1321 >= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ܺۢ") ^ i14;
                        i = ((iM11307 ^ i15) * 32299) ^ (-805980320);
                        i4 = 973886807;
                    } else {
                        iM11307 = (C19806.m45029("ܳۙ") ^ i15) * 91;
                        i = ((iM11307 ^ i14) * (-31735)) ^ 403701934;
                        i4 = 51070013;
                    }
                    i17 = iM11307 ^ i4;
                    i16 = i;
                    break;
                case -1685409827:
                case 2057726359:
                    i18 = i18;
                    c17665 = c17665;
                    c = ':';
                    if (RunnableC3388.f12514 >= 0) {
                        iM450210 = ThreadFactoryC3888.m11306("ۙ֨") ^ i15;
                        i5 = ((iM450210 ^ i14) * 16203) ^ 1622731992;
                        i6 = -885625294;
                    } else {
                        iM450210 = (i14 - ThreadFactoryC3888.m11306("ܺ֫")) * (-95);
                        i5 = ((iM450210 ^ i15) * 4225) ^ (-1769044853);
                        i6 = -590162772;
                    }
                    i9 = iM450210 ^ i6;
                    c17665 = c17665;
                    i7 = i18;
                    i17 = i9;
                    i16 = i5;
                    i18 = i7;
                    break;
                case -1672553843:
                case 1656869458:
                    i18 = i18;
                    c17665 = c17665;
                    c3504 = new C3504();
                    if (C3722.f13525 > 0) {
                        iM450210 = (C19806.m45029("۟ۢ") ^ i15) * 83;
                        i5 = ((iM450210 ^ i14) * 5907) ^ 1134620639;
                        i6 = -1871819726;
                        i9 = iM450210 ^ i6;
                        c17665 = c17665;
                        i7 = i18;
                        i17 = i9;
                        i16 = i5;
                        i18 = i7;
                    }
                    c17665 = c17665;
                    iM450211 = (ThreadFactoryC3888.m11306("᩻ܳ") ^ i15) * 29;
                    i5 = ((iM450211 ^ i14) * (-31131)) ^ 102195700;
                    i8 = -1681973260;
                    i9 = iM450211 ^ i8;
                    i7 = i18;
                    i17 = i9;
                    i16 = i5;
                    i18 = i7;
                    break;
                case -1649723351:
                case 1189828193:
                    i18 = i18;
                    c17665 = c17665;
                    sArr = f75851;
                    if (C1189.f5284 <= 0) {
                        iM450210 = C19806.m45029("۬֫") ^ i15;
                        i5 = ((iM450210 ^ i14) * 345) ^ (-1638066129);
                        i6 = -1564039577;
                    } else {
                        iM450210 = (C19806.m45029("ܰۗ") ^ i15) * 27;
                        i5 = ((iM450210 ^ i14) * 23167) ^ (-1290989312);
                        i6 = -919115855;
                    }
                    i9 = iM450210 ^ i6;
                    c17665 = c17665;
                    i7 = i18;
                    i17 = i9;
                    i16 = i5;
                    i18 = i7;
                    break;
                case -1644146316:
                case -628478190:
                    z = z2;
                    if (iM10327 == 3) {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ֨") ^ i14;
                        i = ((iM11306 ^ i15) * (-27243)) ^ 1113877985;
                        i2 = 2046553251;
                        i10 = iM11306 ^ i2;
                        z2 = z;
                        i17 = i10;
                        i16 = i;
                    } else {
                        z2 = z;
                        iM450211 = (i14 - C19806.m45029("᩷֫")) * 61;
                        i5 = ((iM450211 ^ i15) * 29405) ^ 690090171;
                        i8 = -1225958979;
                        i9 = iM450211 ^ i8;
                        i7 = i18;
                        i17 = i9;
                        i16 = i5;
                        i18 = i7;
                    }
                    break;
                case -1588131196:
                case -1072529012:
                    iM10327 = iM10327;
                    z2 = z2;
                    try {
                        C3743.m10955(c3329Mo2399);
                        iM45029 = (i14 - C19806.m45029("ۤۨ")) * 29;
                        i = ((iM45029 ^ i15) * (-9351)) ^ 448762729;
                        i3 = -1129558070;
                        i10 = iM45029 ^ i3;
                        z2 = z2;
                        iM10327 = iM10327;
                        i17 = i10;
                        i16 = i;
                    } catch (Throwable th2) {
                        int iM450215 = (i15 - C19806.m45029("ᩳ᩹")) * 19;
                        obj = th2;
                        i16 = ((iM450215 ^ i14) * (-2033)) ^ (-44878355);
                        z2 = z2;
                        iM10327 = iM10327;
                        i17 = iM450215 ^ 2013773144;
                    }
                    break;
                case -1559338163:
                case -184426152:
                    return z2;
                case -1325411699:
                case 1066818420:
                    try {
                        z = z2;
                        try {
                            zM5058 = C1460.m5058(strM10328, C0050.m940(f75851, 86, 7, i19));
                            iM11306 = (i14 - C19806.m45029("ܰ᩷")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i = ((iM11306 ^ i15) * 7103) ^ (-1506748791);
                            i2 = -248376930;
                            i10 = iM11306 ^ i2;
                            z2 = z;
                            i17 = i10;
                        } catch (Exception unused) {
                            z2 = z;
                            iM11307 = (ThreadFactoryC3888.m11306("ۘۡ") + i14) * (-91);
                            i = ((iM11307 ^ i15) * (-20675)) ^ (-1944580771);
                            i4 = -1041048109;
                            i17 = iM11307 ^ i4;
                        }
                    } catch (Exception unused2) {
                        z = z2;
                    }
                    i16 = i;
                    break;
                case -1286171157:
                case 239095423:
                    if (C3535.f13026 <= 0) {
                        i18 = i18;
                        iM450211 = (ThreadFactoryC3888.m11306("᩻ܳ") ^ i15) * 29;
                        i5 = ((iM450211 ^ i14) * (-31131)) ^ 102195700;
                        i8 = -1681973260;
                        i9 = iM450211 ^ i8;
                        i7 = i18;
                        i17 = i9;
                        i16 = i5;
                        i18 = i7;
                    } else {
                        iM11307 = C19806.m45029("ᩳۤ") ^ i14;
                        i = ((iM11307 ^ i15) * 31711) ^ 1534376773;
                        i4 = 496531831;
                        i17 = iM11307 ^ i4;
                        i16 = i;
                    }
                    break;
                case -1280509924:
                case 920772578:
                    i18++;
                    iM45029 = C19806.m45029("᩸ۙ") ^ i14;
                    i = ((iM45029 ^ i15) * (-9761)) ^ (-1412832028);
                    i3 = 1033808879;
                    i10 = iM45029 ^ i3;
                    z2 = z2;
                    iM10327 = iM10327;
                    i17 = i10;
                    i16 = i;
                    break;
                case -1272457478:
                case -556620461:
                    C2477.m7593();
                    if (C2788.f10625 >= 0) {
                        i18 = i18;
                        c17665 = c17665;
                        iM450210 = C19806.m45029("۬֫") ^ i15;
                        i5 = ((iM450210 ^ i14) * 345) ^ (-1638066129);
                        i6 = -1564039577;
                        i9 = iM450210 ^ i6;
                        c17665 = c17665;
                        i7 = i18;
                        i17 = i9;
                        i16 = i5;
                        i18 = i7;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ܺۢ") ^ i14;
                        i = ((iM11307 ^ i15) * 32299) ^ (-805980320);
                        i4 = 973886807;
                        i17 = iM11307 ^ i4;
                        i16 = i;
                    }
                    break;
                case -1185094914:
                case 664928544:
                    i20 = 2;
                    if (iM10327 != 2) {
                        iM11307 = C19806.m45029("ۧ֡") ^ i14;
                        i = ((iM11307 ^ i15) * (-13075)) ^ 1754615105;
                        i4 = -1149321932;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("᩻ۨ") ^ i15;
                        i = ((iM11307 ^ i14) * (-25753)) ^ (-293787091);
                        i4 = 1100812263;
                    }
                    i17 = iM11307 ^ i4;
                    i16 = i;
                    break;
                case -1005580148:
                case -759085971:
                    i18 = i18;
                    c17665 = c17665;
                    i11 = s * 2;
                    if (C1937.f7317 >= 0) {
                        iM450210 = ThreadFactoryC3888.m11306("ۙ֨") ^ i15;
                        i5 = ((iM450210 ^ i14) * 16203) ^ 1622731992;
                        i6 = -885625294;
                    } else {
                        iM450210 = C19806.m45029("ۚܺ") ^ i15;
                        i5 = ((iM450210 ^ i14) * 4791) ^ 293723219;
                        i6 = -1552554174;
                    }
                    i9 = iM450210 ^ i6;
                    c17665 = c17665;
                    i7 = i18;
                    i17 = i9;
                    i16 = i5;
                    i18 = i7;
                    break;
                case -992658048:
                case 1148439033:
                    try {
                        zM51593 = m51593((GetChars) c3329Mo2399);
                        iM11307 = (ThreadFactoryC3888.m11306("ۚᩳ") ^ i15) * 9;
                        i = ((iM11307 ^ i14) * (-7975)) ^ 1418232980;
                        i4 = 1045075834;
                        i17 = iM11307 ^ i4;
                        i16 = i;
                    } catch (Throwable th3) {
                        int iM11308 = ThreadFactoryC3888.m11306("ۗۢ") ^ i14;
                        i17 = iM11308 ^ (-2077628491);
                        th = th3;
                        i16 = ((iM11308 ^ i15) * (-31429)) ^ 427253934;
                    }
                    break;
                case -894675355:
                case 1271973508:
                    i18 = i18;
                    c17665 = c17665;
                    s = sArr[c];
                    if (C1148.m4232() <= 0) {
                        iM450210 = C19806.m45029("۬֫") ^ i15;
                        i5 = ((iM450210 ^ i14) * 345) ^ (-1638066129);
                        i6 = -1564039577;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("֫۠") ^ i14) * 43;
                        i5 = ((iM450210 ^ i15) * 3403) ^ (-1719616381);
                        i6 = -1627456472;
                    }
                    i9 = iM450210 ^ i6;
                    c17665 = c17665;
                    i7 = i18;
                    i17 = i9;
                    i16 = i5;
                    i18 = i7;
                    break;
                case -859307558:
                case 1425169563:
                    iM10327 = iM10327;
                    z2 = z2;
                    if (i22 == i20) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳ᩹") + i14) * (-99);
                        i = ((iM45029 ^ i15) * 12949) ^ 1349353119;
                        i3 = 1254674739;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۬ۜ") ^ i15;
                        i = ((iM45029 ^ i14) * (-3705)) ^ 796241113;
                        i3 = 602291332;
                    }
                    i10 = iM45029 ^ i3;
                    z2 = z2;
                    iM10327 = iM10327;
                    i17 = i10;
                    i16 = i;
                    break;
                case -818844142:
                case 1886697130:
                    i18 = i18;
                    c17665 = c17665;
                    int i24 = s + s2;
                    if (i12 - (i24 * i24) <= 0) {
                        iM450210 = (i14 - C19806.m45029("ۚ᩷")) * 17;
                        i5 = ((iM450210 ^ i15) * 20461) ^ (-1631868085);
                        i6 = 5660545;
                    } else {
                        iM450210 = (C19806.m45029("ۖۙ") + i15) * 73;
                        i5 = ((iM450210 ^ i14) * (-1865)) ^ (-153699551);
                        i6 = 975751070;
                    }
                    i9 = iM450210 ^ i6;
                    c17665 = c17665;
                    i7 = i18;
                    i17 = i9;
                    i16 = i5;
                    i18 = i7;
                    break;
                case -259067207:
                case 2039383742:
                    c3329Mo2399 = ((InterfaceC0507) getChars).mo2399();
                    iM450211 = C19806.m45029("᩷ۚ") ^ i15;
                    i18 = i18;
                    i5 = ((iM450211 ^ i14) * 22491) ^ (-1127602457);
                    i8 = 471191321;
                    i9 = iM450211 ^ i8;
                    i7 = i18;
                    i17 = i9;
                    i16 = i5;
                    i18 = i7;
                    break;
                case -186460831:
                case 954561660:
                    RunnableC0195.m1431();
                    if (C0671.f2816 != 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ܺۢ") ^ i14;
                        i = ((iM11307 ^ i15) * 32299) ^ (-805980320);
                        i4 = 973886807;
                        i17 = iM11307 ^ i4;
                        i16 = i;
                    } else {
                        i18 = i18;
                        c17664 = c17665;
                        iM450210 = ThreadFactoryC3888.m11306("ۗ۠") ^ i15;
                        c17665 = c17664;
                        i5 = ((iM450210 ^ i14) * (-4677)) ^ 1415417336;
                        i6 = 1381649907;
                        i9 = iM450210 ^ i6;
                        c17665 = c17665;
                        i7 = i18;
                        i17 = i9;
                        i16 = i5;
                        i18 = i7;
                    }
                    break;
                case -176353255:
                case 1285134117:
                    iM10327 = iM10327;
                    z2 = z2;
                    if (i18 >= iM10314) {
                        i21 = i22;
                        z2 = z2;
                        iM10327 = iM10327;
                        iM450211 = (i14 - C19806.m45029("᩷֫")) * 61;
                        i5 = ((iM450211 ^ i15) * 29405) ^ 690090171;
                        i8 = -1225958979;
                        i9 = iM450211 ^ i8;
                        i7 = i18;
                        i17 = i9;
                        i16 = i5;
                        i18 = i7;
                    } else {
                        iM45029 = C19806.m45029("֡ᩳ") ^ i15;
                        i = ((iM45029 ^ i14) * 25853) ^ (-1937705073);
                        i3 = 1414594257;
                        i10 = iM45029 ^ i3;
                        z2 = z2;
                        iM10327 = iM10327;
                        i17 = i10;
                        i16 = i;
                    }
                    break;
                case -146572065:
                case 735170113:
                    iM10327 = iM10327;
                    z2 = z2;
                    C0629.m2911(th, obj);
                    iM45029 = (i14 - C19806.m45029("ۤۨ")) * 29;
                    i = ((iM45029 ^ i15) * (-9351)) ^ 448762729;
                    i3 = -1129558070;
                    i10 = iM45029 ^ i3;
                    z2 = z2;
                    iM10327 = iM10327;
                    i17 = i10;
                    i16 = i;
                    break;
                case -119787263:
                case 410261688:
                    iM10327 = iM10327;
                    z2 = z2;
                    zM50511 = C1460.m5058(strM10328, C2642.m8172(f75851, 74, 12, i19));
                    iM45029 = ThreadFactoryC3888.m11306("ۙۖ") ^ i14;
                    i = ((iM45029 ^ i15) * (-32289)) ^ 1444623961;
                    i3 = 548418544;
                    i10 = iM45029 ^ i3;
                    z2 = z2;
                    iM10327 = iM10327;
                    i17 = i10;
                    i16 = i;
                    break;
                case -103742063:
                case 1487085971:
                    try {
                        iM10327 = c3504.m10327();
                        iM11307 = ThreadFactoryC3888.m11306("᩷ۙ") ^ i14;
                        i = ((iM11307 ^ i15) * 13833) ^ 404451652;
                        i4 = -1601280975;
                    } catch (Exception unused3) {
                        iM11307 = (ThreadFactoryC3888.m11306("ۘۡ") + i14) * (-91);
                        i = ((iM11307 ^ i15) * (-20675)) ^ (-1944580771);
                        i4 = -1041048109;
                    }
                    i17 = iM11307 ^ i4;
                    i16 = i;
                    break;
                case -89962501:
                case -25322622:
                    if (C1460.f5948 >= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ܺۢ") ^ i14;
                        i = ((iM11307 ^ i15) * 32299) ^ (-805980320);
                        i4 = 973886807;
                    } else {
                        iM11307 = C19806.m45029("ᩳۤ") ^ i14;
                        i = ((iM11307 ^ i15) * 31711) ^ 1534376773;
                        i4 = 496531831;
                    }
                    i17 = iM11307 ^ i4;
                    i16 = i;
                    break;
                case -72198056:
                case 417572692:
                    iM10327 = iM10327;
                    z2 = z2;
                    iM10314 = c3504.m10314();
                    iM45029 = C19806.m45029("᩻ۘ") ^ i15;
                    i = ((iM45029 ^ i14) * 9831) ^ 1442552544;
                    i3 = -1390733817;
                    i10 = iM45029 ^ i3;
                    z2 = z2;
                    iM10327 = iM10327;
                    i17 = i10;
                    i16 = i;
                    break;
                case -52923568:
                case 204802944:
                    z2 = z2;
                    try {
                        iM10327 = iM10327;
                        try {
                            zM5059 = C1460.m5058(c3504.m10315(i18), C1460.m5047(f75851, 93, 4, i19));
                            iM45029 = (C19806.m45029("ۤᩴ") + i15) * 39;
                            i = ((iM45029 ^ i14) * 28373) ^ 464708920;
                            i3 = 1797174075;
                            i10 = iM45029 ^ i3;
                            z2 = z2;
                            iM10327 = iM10327;
                            i17 = i10;
                        } catch (Exception unused4) {
                            z2 = z2;
                            iM10327 = iM10327;
                            iM11307 = (ThreadFactoryC3888.m11306("ۘۡ") + i14) * (-91);
                            i = ((iM11307 ^ i15) * (-20675)) ^ (-1944580771);
                            i4 = -1041048109;
                            i17 = iM11307 ^ i4;
                        }
                    } catch (Exception unused5) {
                        iM10327 = iM10327;
                    }
                    i16 = i;
                    break;
                case 97443639:
                case 2106532722:
                    iM10327 = iM10327;
                    z2 = z2;
                    if (zM50511) {
                        iM45029 = C19806.m45029("ۨᩳ") ^ i15;
                        i = ((iM45029 ^ i14) * (-18361)) ^ 1742742526;
                        i3 = -808106913;
                    } else {
                        iM45029 = C19806.m45029("ۖ᩺") ^ i15;
                        i = ((iM45029 ^ i14) * (-4159)) ^ (-125270748);
                        i3 = 1744013491;
                    }
                    i10 = iM45029 ^ i3;
                    z2 = z2;
                    iM10327 = iM10327;
                    i17 = i10;
                    i16 = i;
                    break;
                case 171944633:
                case 213159537:
                    C2249.m6915();
                    RunnableC1606.m5473();
                    return false;
                case 190747548:
                case 1161324315:
                    iM10327 = iM10327;
                    z2 = z2;
                    if (!zM2315) {
                        z2 = z2;
                        iM10327 = iM10327;
                        iM11307 = (ThreadFactoryC3888.m11306("ۘۡ") + i14) * (-91);
                        i = ((iM11307 ^ i15) * (-20675)) ^ (-1944580771);
                        i4 = -1041048109;
                        i17 = iM11307 ^ i4;
                        i16 = i;
                    } else {
                        i21 = i22;
                        z2 = z2;
                        iM10327 = iM10327;
                        iM450211 = (i14 - C19806.m45029("᩷֫")) * 61;
                        i5 = ((iM450211 ^ i15) * 29405) ^ 690090171;
                        i8 = -1225958979;
                        i9 = iM450211 ^ i8;
                        i7 = i18;
                        i17 = i9;
                        i16 = i5;
                        i18 = i7;
                    }
                    break;
                case 216182321:
                case 2072239191:
                    iM10327 = iM10327;
                    z2 = z2;
                    int i25 = i23 + 1;
                    if (i25 != 10) {
                        i23 = i25;
                        i21 = i22;
                        z2 = z2;
                        iM10327 = iM10327;
                        iM450211 = (i14 - C19806.m45029("᩷֫")) * 61;
                        i5 = ((iM450211 ^ i15) * 29405) ^ 690090171;
                        i8 = -1225958979;
                        i9 = iM450211 ^ i8;
                        i7 = i18;
                        i17 = i9;
                        i16 = i5;
                        i18 = i7;
                    } else {
                        z2 = z2;
                        iM10327 = iM10327;
                        iM11307 = (ThreadFactoryC3888.m11306("ۘۡ") + i14) * (-91);
                        i = ((iM11307 ^ i15) * (-20675)) ^ (-1944580771);
                        i4 = -1041048109;
                        i17 = iM11307 ^ i4;
                        i16 = i;
                    }
                    break;
                case 225749501:
                case 1780913308:
                    return z3;
                case 255079048:
                case 1499485821:
                    i19 = 58248;
                    iM450210 = (C19806.m45029("ۘ᩺") ^ i15) * (-81);
                    i5 = ((iM450210 ^ i14) * (-7405)) ^ (-118221989);
                    i6 = -1835993271;
                    i9 = iM450210 ^ i6;
                    c17665 = c17665;
                    i7 = i18;
                    i17 = i9;
                    i16 = i5;
                    i18 = i7;
                    break;
                case 302038131:
                case 889653939:
                    iM10327 = iM10327;
                    z2 = z2;
                    strM10328 = c3504.m10328();
                    zM50510 = C1460.m5058(strM10328, C1189.m4365(f75851, 68, 6, i19));
                    iM45029 = (ThreadFactoryC3888.m11306("ܺۧ") + i15) * 83;
                    i = ((iM45029 ^ i14) * 8559) ^ 1270548661;
                    i3 = -1255635980;
                    i10 = iM45029 ^ i3;
                    z2 = z2;
                    iM10327 = iM10327;
                    i17 = i10;
                    i16 = i;
                    break;
                case 312944990:
                case 527598693:
                    C10634.m26820();
                    if (C2477.m7593() >= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("᩶ܶ") ^ i15;
                        i = ((iM11307 ^ i14) * (-22697)) ^ (-1557309746);
                        i4 = 1842835944;
                        i17 = iM11307 ^ i4;
                        i16 = i;
                    } else {
                        i18 = i18;
                        c17664 = c17665;
                        iM450210 = ThreadFactoryC3888.m11306("ۗ۠") ^ i15;
                        c17665 = c17664;
                        i5 = ((iM450210 ^ i14) * (-4677)) ^ 1415417336;
                        i6 = 1381649907;
                        i9 = iM450210 ^ i6;
                        c17665 = c17665;
                        i7 = i18;
                        i17 = i9;
                        i16 = i5;
                        i18 = i7;
                    }
                    break;
                case 435882377:
                case 1050269896:
                    i22 = i21 + 1;
                    if (i22 == z2) {
                        iM11307 = ThreadFactoryC3888.m11306("᩻ۙ") ^ i15;
                        i = ((iM11307 ^ i14) * (-19087)) ^ 767417634;
                        i4 = -872465127;
                    } else {
                        iM11307 = C19806.m45029("ᩳۘ") ^ i15;
                        i = ((iM11307 ^ i14) * 2043) ^ (-935939819);
                        i4 = -1800534340;
                    }
                    i17 = iM11307 ^ i4;
                    i16 = i;
                    break;
                case 635369520:
                case 2026204852:
                    C2642.m8168(c3329Mo2399);
                    return zM51593;
                case 662271185:
                case 2097645388:
                    i19 = 32368;
                    iM450210 = (C19806.m45029("ۘ᩺") ^ i15) * (-81);
                    i5 = ((iM450210 ^ i14) * (-7405)) ^ (-118221989);
                    i6 = -1835993271;
                    i9 = iM450210 ^ i6;
                    c17665 = c17665;
                    i7 = i18;
                    i17 = i9;
                    i16 = i5;
                    i18 = i7;
                    break;
                case 754436296:
                case 1516975855:
                    iM10327 = iM10327;
                    z2 = z2;
                    if (!zM5058) {
                        i21 = i22;
                        z2 = z2;
                        iM10327 = iM10327;
                        iM450211 = (i14 - C19806.m45029("᩷֫")) * 61;
                        i5 = ((iM450211 ^ i15) * 29405) ^ 690090171;
                        i8 = -1225958979;
                        i9 = iM450211 ^ i8;
                        i7 = i18;
                        i17 = i9;
                        i16 = i5;
                        i18 = i7;
                    } else {
                        iM45029 = C19806.m45029("ۨᩳ") ^ i15;
                        i = ((iM45029 ^ i14) * (-18361)) ^ 1742742526;
                        i3 = -808106913;
                        i10 = iM45029 ^ i3;
                        z2 = z2;
                        iM10327 = iM10327;
                        i17 = i10;
                        i16 = i;
                    }
                    break;
                case 963111666:
                case 1345200067:
                    i18 = i18;
                    if (C0278.f1572 <= 0) {
                        int iM450216 = (C19806.m45029("۟֡") ^ i14) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM450216 ^ i15) * (-7757)) ^ (-112159755);
                        i9 = iM450216 ^ (-765856813);
                        c17665 = null;
                        i7 = i18;
                        i17 = i9;
                        i16 = i5;
                    } else {
                        C17664 c17666 = new C17664(getChars);
                        if (C3722.m10894() <= 0) {
                            c17665 = c17666;
                            iM450211 = (ThreadFactoryC3888.m11306("᩻ܳ") ^ i15) * 29;
                            i5 = ((iM450211 ^ i14) * (-31131)) ^ 102195700;
                            i8 = -1681973260;
                            i9 = iM450211 ^ i8;
                            i7 = i18;
                            i17 = i9;
                            i16 = i5;
                        } else {
                            int iM11309 = ThreadFactoryC3888.m11306("֫ۙ") ^ i14;
                            i16 = ((iM11309 ^ i15) * 10019) ^ (-872660355);
                            c17665 = c17666;
                            i7 = i18;
                            i17 = iM11309 ^ (-1320360504);
                        }
                    }
                    i18 = i7;
                    break;
                case 1061919402:
                case 1343993391:
                    i18 = i18;
                    c17665 = c17665;
                    s2 = 1;
                    if (!C1977.m6356()) {
                        iM450210 = (i15 - ThreadFactoryC3888.m11306("ۤܺ")) * (-13);
                        i5 = ((iM450210 ^ i14) * (-30519)) ^ 1885474509;
                        i6 = -225205443;
                        i9 = iM450210 ^ i6;
                        c17665 = c17665;
                        i7 = i18;
                        i17 = i9;
                        i16 = i5;
                        i18 = i7;
                    }
                    c17665 = c17665;
                    iM450211 = (ThreadFactoryC3888.m11306("᩻ܳ") ^ i15) * 29;
                    i5 = ((iM450211 ^ i14) * (-31131)) ^ 102195700;
                    i8 = -1681973260;
                    i9 = iM450211 ^ i8;
                    i7 = i18;
                    i17 = i9;
                    i16 = i5;
                    i18 = i7;
                    break;
                case 1524230993:
                case 1866356634:
                    RunnableC0195.m1431();
                    if (RunnableC1895.m6170() != 0) {
                        iM11307 = C19806.m45029("ᩳۤ") ^ i14;
                        i = ((iM11307 ^ i15) * 31711) ^ 1534376773;
                        i4 = 496531831;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ۤᩳ") ^ i14;
                        i = ((iM11307 ^ i15) * (-28981)) ^ (-716014533);
                        i4 = -1856433873;
                    }
                    i17 = iM11307 ^ i4;
                    i16 = i;
                    break;
                default:
                    i21--;
                    iM450211 = (i14 - C19806.m45029("᩷֫")) * 61;
                    i5 = ((iM450211 ^ i15) * 29405) ^ 690090171;
                    i8 = -1225958979;
                    i9 = iM450211 ^ i8;
                    i7 = i18;
                    i17 = i9;
                    i16 = i5;
                    i18 = i7;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x01ef A[PHI: r1 r4 r10
      0x01ef: PHI (r1v41 java.util.Iterator) = 
      (r1v3 java.util.Iterator)
      (r1v1 java.util.Iterator)
      (r1v1 java.util.Iterator)
      (r1v1 java.util.Iterator)
      (r1v1 java.util.Iterator)
     binds: [B:54:0x01e2, B:37:0x0142, B:30:0x00f9, B:23:0x009c, B:21:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x01ef: PHI (r4v6 l.ۧۗۨ) = (r4v1 l.ۧۗۨ), (r4v3 l.ۧۗۨ), (r4v1 l.ۧۗۨ), (r4v1 l.ۧۗۨ), (r4v1 l.ۧۗۨ) binds: [B:54:0x01e2, B:37:0x0142, B:30:0x00f9, B:23:0x009c, B:21:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x01ef: PHI (r10v14 l.ܺۗ᩺) = (r10v3 l.ܺۗ᩺), (r10v2 l.ܺۗ᩺), (r10v2 l.ܺۗ᩺), (r10v2 l.ܺۗ᩺), (r10v2 l.ܺۗ᩺) binds: [B:54:0x01e2, B:37:0x0142, B:30:0x00f9, B:23:0x009c, B:21:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x02f3 A[PHI: r17 r18 r22
      0x02f3: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:77:0x02f1, B:73:0x02d4, B:14:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x02f3: PHI (r18v6 short) = (r18v2 short), (r18v3 short), (r18v2 short) binds: [B:77:0x02f1, B:73:0x02d4, B:14:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x02f3: PHI (r22v22 java.util.Iterator) = (r22v7 java.util.Iterator), (r22v8 java.util.Iterator), (r22v23 java.util.Iterator) binds: [B:77:0x02f1, B:73:0x02d4, B:14:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C15676 m51594(CharSequence charSequence) throws Throwable {
        int iM45029;
        int i;
        int i2;
        int iM450210;
        int i3;
        int i4;
        int i5;
        Iterator itM943 = null;
        Map.Entry entry = null;
        Object value = null;
        C10728 c10728 = null;
        String str = null;
        String str2 = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        short[] sArr = null;
        int i9 = 1953821756;
        int i10 = C1461.f5957;
        int i11 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM450211 = C19806.m45029("֨ۡ") ^ i11;
        int i12 = ((iM450211 ^ i10) * (-3549)) ^ 1522946732;
        int i13 = iM450211 ^ (-517281478);
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i14 = 0;
        int i15 = 0;
        C15676 c15676 = null;
        char c = 0;
        short s = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i10) * 31793) >> 31));
            switch (i9) {
                case -2115251623:
                case -1091682398:
                    CallableC1627.m5507();
                    C0216.m1591();
                    itM943 = itM943;
                    int iM450212 = C19806.m45029("֨֡") ^ i11;
                    i = ((iM450212 ^ i10) * 32253) ^ 407993250;
                    i5 = iM450212 ^ 616625430;
                    c15676 = null;
                    Iterator it = itM943;
                    i13 = i5;
                    i12 = i;
                    itM943 = it;
                    break;
                case -2050861992:
                case -1902714685:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    return null;
                case -1864696339:
                case 1341258763:
                    C1148.m4232();
                    if (!C2871.m8646()) {
                        iM450210 = (C19806.m45029("۬ۡ") + i11) * 17;
                        i3 = ((iM450210 ^ i10) * (-14095)) ^ (-1489414288);
                        i4 = 2020756477;
                        i13 = iM450210 ^ i4;
                        i12 = i3;
                    } else {
                        itM943 = itM943;
                        int iM450213 = C19806.m45029("֨֡") ^ i11;
                        i = ((iM450213 ^ i10) * 32253) ^ 407993250;
                        i5 = iM450213 ^ 616625430;
                        c15676 = null;
                        Iterator it2 = itM943;
                        i13 = i5;
                        i12 = i;
                        itM943 = it2;
                    }
                    break;
                case -1821834375:
                case 1580322133:
                    itM943 = itM943;
                    s = sArr2[c];
                    if (C0526.m2437() >= 0) {
                        int iM450214 = C19806.m45029("֨֡") ^ i11;
                        i = ((iM450214 ^ i10) * 32253) ^ 407993250;
                        i5 = iM450214 ^ 616625430;
                        c15676 = null;
                    } else {
                        iM45029 = C19806.m45029("ܳۤ") ^ i11;
                        i = ((iM45029 ^ i10) * 26529) ^ 1033944129;
                        i2 = -1113324781;
                        i5 = iM45029 ^ i2;
                    }
                    Iterator it3 = itM943;
                    i13 = i5;
                    i12 = i;
                    itM943 = it3;
                    break;
                case -1742515738:
                case -1384378943:
                    if (C0962.m3748(itM943)) {
                        iM450210 = C19806.m45029("ܳۧ") ^ i11;
                        i3 = ((iM450210 ^ i10) * 31291) ^ (-2129232680);
                        i4 = -1321251603;
                    } else {
                        iM450210 = (C19806.m45029("ᩴ᩶") ^ i10) * (-93);
                        i3 = ((iM450210 ^ i11) * (-12609)) ^ (-944675665);
                        i4 = 650480280;
                    }
                    i13 = iM450210 ^ i4;
                    i12 = i3;
                    break;
                case -1492811526:
                case 1011389764:
                    if (C3535.m10420(str, C7105.m18989(sArr, i14, 1, i8))) {
                        iM450210 = (C19806.m45029("᩹᩹") ^ i11) * 33;
                        i3 = ((iM450210 ^ i10) * (-2311)) ^ 230345235;
                        i4 = 1817223350;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("ܽ᩶") + i10) * (-13);
                        i3 = ((iM450210 ^ i11) * 3853) ^ (-300404626);
                        i4 = 1955828363;
                    }
                    i13 = iM450210 ^ i4;
                    i12 = i3;
                    break;
                case -1315057331:
                case -809276868:
                    i8 = 41478;
                    iM45029 = ThreadFactoryC3888.m11306("ۗ֨") ^ i11;
                    i = ((iM45029 ^ i10) * 18637) ^ (-968381710);
                    i2 = -532513997;
                    i5 = iM45029 ^ i2;
                    Iterator it4 = itM943;
                    i13 = i5;
                    i12 = i;
                    itM943 = it4;
                    break;
                case -1087711023:
                case 480702645:
                    itM943 = itM943;
                    short s2 = s;
                    int i18 = s2 + 18247;
                    if (C1460.f5948 >= 0) {
                        s = s2;
                        i16 = i18;
                        iM45029 = ThreadFactoryC3888.m11306("ۖܺ") ^ i10;
                        i = ((iM45029 ^ i11) * (-6777)) ^ (-793711955);
                        i2 = 466658172;
                        i5 = iM45029 ^ i2;
                        Iterator it5 = itM943;
                        i13 = i5;
                        i12 = i;
                        itM943 = it5;
                    } else {
                        int iM450215 = C19806.m45029("֫ܿ") ^ i10;
                        s = s2;
                        i12 = ((iM450215 ^ i11) * 11409) ^ (-602794240);
                        i16 = i18;
                        itM943 = itM943;
                        i13 = iM450215 ^ 1565157340;
                    }
                    break;
                case -1030824814:
                case 361725404:
                    c15676.m37349((String) entry.getKey(), c10728.f36574);
                    iM450210 = (C19806.m45029("᩹᩹") ^ i11) * 33;
                    i3 = ((iM450210 ^ i10) * (-2311)) ^ 230345235;
                    i4 = 1817223350;
                    i13 = iM450210 ^ i4;
                    i12 = i3;
                    break;
                case -1005738085:
                case 393340280:
                    return c15676;
                case -918524399:
                case -204102850:
                    C1461.m5080();
                    if (!C2332.f8260) {
                        itM943 = itM943;
                        int iM450216 = C19806.m45029("֨֡") ^ i11;
                        i = ((iM450216 ^ i10) * 32253) ^ 407993250;
                        i5 = iM450216 ^ 616625430;
                        c15676 = null;
                        Iterator it6 = itM943;
                        i13 = i5;
                        i12 = i;
                        itM943 = it6;
                    } else {
                        int iM11306 = ThreadFactoryC3888.m11306("۟֡") ^ i10;
                        i13 = iM11306 ^ (-427042653);
                        i12 = ((iM11306 ^ i11) * (-7225)) ^ 642441345;
                        c15676 = null;
                    }
                    break;
                case -876443797:
                case 87026827:
                    itM943 = itM943;
                    i17 = i16 * i16;
                    i6 = s * s;
                    i7 = 332953009;
                    if (C3660.f13403 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֫᩺") ^ i11;
                        i = ((iM45029 ^ i10) * 30459) ^ (-1274478529);
                        i2 = 836248181;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡۡ") ^ i11;
                        i = ((iM45029 ^ i10) * (-24735)) ^ 142207915;
                        i2 = -786643898;
                    }
                    i5 = iM45029 ^ i2;
                    Iterator it7 = itM943;
                    i13 = i5;
                    i12 = i;
                    itM943 = it7;
                    break;
                case -818720138:
                case -161696961:
                    str2 = c10728.f36574;
                    sArr3 = f75851;
                    i15 = 99;
                    if (C1461.f5957 <= 0) {
                        iM450210 = (C19806.m45029("۬ۡ") + i11) * 17;
                        i3 = ((iM450210 ^ i10) * (-14095)) ^ (-1489414288);
                        i4 = 2020756477;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("ۡܽ") ^ i11) * (-97);
                        i3 = ((iM450210 ^ i10) * 24319) ^ (-1698232465);
                        i4 = -1679862156;
                    }
                    i13 = iM450210 ^ i4;
                    i12 = i3;
                    break;
                case -720597061:
                case 362601380:
                    itM943 = itM943;
                    c = 'a';
                    if (C1377.f5749) {
                        iM45029 = C19806.m45029("ۢ᩷") ^ i11;
                        i = ((iM45029 ^ i10) * 22481) ^ 801400253;
                        i2 = -13420745;
                        i5 = iM45029 ^ i2;
                    } else {
                        int iM450217 = C19806.m45029("֨֡") ^ i11;
                        i = ((iM450217 ^ i10) * 32253) ^ 407993250;
                        i5 = iM450217 ^ 616625430;
                        c15676 = null;
                    }
                    Iterator it8 = itM943;
                    i13 = i5;
                    i12 = i;
                    itM943 = it8;
                    break;
                case 272482126:
                case 1647557014:
                    entry = (Map.Entry) C0278.m1776(itM943);
                    value = entry.getValue();
                    if (AbstractC0464.f2088 > 0) {
                        iM450210 = (C19806.m45029("֡ۢ") ^ i10) * 65;
                        i3 = ((iM450210 ^ i11) * (-6841)) ^ 1125234325;
                        i4 = 30541275;
                        i13 = iM450210 ^ i4;
                        i12 = i3;
                    } else {
                        itM943 = itM943;
                        iM45029 = ThreadFactoryC3888.m11306("֫᩺") ^ i11;
                        i = ((iM45029 ^ i10) * 30459) ^ (-1274478529);
                        i2 = 836248181;
                        i5 = iM45029 ^ i2;
                        Iterator it9 = itM943;
                        i13 = i5;
                        i12 = i;
                        itM943 = it9;
                    }
                    break;
                case 472809734:
                case 1135953403:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        itM943 = itM943;
                        iM45029 = ThreadFactoryC3888.m11306("֫᩺") ^ i11;
                        i = ((iM45029 ^ i10) * 30459) ^ (-1274478529);
                        i2 = 836248181;
                        i5 = iM45029 ^ i2;
                        Iterator it10 = itM943;
                        i13 = i5;
                        i12 = i;
                        itM943 = it10;
                    } else {
                        int iM11307 = ThreadFactoryC3888.m11306("۟֡") ^ i10;
                        i13 = iM11307 ^ (-427042653);
                        i12 = ((iM11307 ^ i11) * (-7225)) ^ 642441345;
                        c15676 = null;
                    }
                    break;
                case 578120541:
                case 1871592132:
                    i8 = 1221;
                    iM45029 = ThreadFactoryC3888.m11306("ۗ֨") ^ i11;
                    i = ((iM45029 ^ i10) * 18637) ^ (-968381710);
                    i2 = -532513997;
                    i5 = iM45029 ^ i2;
                    Iterator it11 = itM943;
                    i13 = i5;
                    i12 = i;
                    itM943 = it11;
                    break;
                case 1049701119:
                case 1880472729:
                    c10728 = (C10728) value;
                    if (C6493.m17688(c10728.f36574)) {
                        iM450210 = ThreadFactoryC3888.m11306("᩶ᩳ") ^ i11;
                        i3 = ((iM450210 ^ i10) * 11089) ^ (-161436421);
                        i4 = -663725875;
                    } else {
                        iM450210 = (C19806.m45029("᩹᩹") ^ i11) * 33;
                        i3 = ((iM450210 ^ i10) * (-2311)) ^ 230345235;
                        i4 = 1817223350;
                    }
                    i13 = iM450210 ^ i4;
                    i12 = i3;
                    break;
                case 1094760245:
                case 1932915942:
                    Map mapM51590 = m51590(charSequence);
                    if (C0278.f1572 <= 0) {
                        int iM11308 = ThreadFactoryC3888.m11306("۟֡") ^ i10;
                        i13 = iM11308 ^ (-427042653);
                        i12 = ((iM11308 ^ i11) * (-7225)) ^ 642441345;
                        c15676 = null;
                    } else if (C2642.m8171() == 0) {
                        c15676 = new C15676(0, true);
                        itM943 = C0050.m943(mapM51590.entrySet());
                        iM450210 = (C19806.m45029("᩹᩹") ^ i11) * 33;
                        i3 = ((iM450210 ^ i10) * (-2311)) ^ 230345235;
                        i4 = 1817223350;
                        i13 = iM450210 ^ i4;
                        i12 = i3;
                    } else {
                        itM943 = itM943;
                        int iM450218 = C19806.m45029("֨֡") ^ i11;
                        i = ((iM450218 ^ i10) * 32253) ^ 407993250;
                        i5 = iM450218 ^ 616625430;
                        c15676 = null;
                        Iterator it12 = itM943;
                        i13 = i5;
                        i12 = i;
                        itM943 = it12;
                    }
                    break;
                case 1226010949:
                case 2037449671:
                    str = c10728.f36574;
                    sArr = f75851;
                    i14 = 98;
                    if (C1025.f4800 < 0) {
                        iM450210 = ThreadFactoryC3888.m11306("ܽۢ") ^ i10;
                        i3 = ((iM450210 ^ i11) * 7429) ^ 986590251;
                        i4 = 1680691106;
                        i13 = iM450210 ^ i4;
                        i12 = i3;
                    } else {
                        itM943 = itM943;
                        iM45029 = ThreadFactoryC3888.m11306("֫᩺") ^ i11;
                        i = ((iM45029 ^ i10) * 30459) ^ (-1274478529);
                        i2 = 836248181;
                        i5 = iM45029 ^ i2;
                        Iterator it13 = itM943;
                        i13 = i5;
                        i12 = i;
                        itM943 = it13;
                    }
                    break;
                case 1690056142:
                case 1881017809:
                    itM943 = itM943;
                    int i19 = i6 + i7;
                    if ((i19 + i19) - i17 < 0) {
                        iM45029 = (i10 - C19806.m45029("֡۟")) * 87;
                        i = ((iM45029 ^ i11) * 26217) ^ 172753917;
                        i2 = 677323822;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽۚ") ^ i10) * 91;
                        i = ((iM45029 ^ i11) * 4061) ^ 631229176;
                        i2 = -1544037354;
                    }
                    i5 = iM45029 ^ i2;
                    Iterator it14 = itM943;
                    i13 = i5;
                    i12 = i;
                    itM943 = it14;
                    break;
                case 1714347105:
                case 1987971396:
                    if (C3535.m10420(str2, ThreadFactoryC3888.m11312(sArr3, i15, 1, i8))) {
                        iM450210 = (C19806.m45029("᩹᩹") ^ i11) * 33;
                        i3 = ((iM450210 ^ i10) * (-2311)) ^ 230345235;
                        i4 = 1817223350;
                    } else {
                        iM450210 = C19806.m45029("ۖ۟") ^ i10;
                        i3 = ((iM450210 ^ i11) * 11295) ^ (-967457395);
                        i4 = 1307220662;
                    }
                    i13 = iM450210 ^ i4;
                    i12 = i3;
                    break;
                default:
                    itM943 = itM943;
                    sArr2 = f75851;
                    if (C2704.m8255() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖܺ") ^ i10;
                        i = ((iM45029 ^ i11) * (-6777)) ^ (-793711955);
                        i2 = 466658172;
                    } else {
                        iM45029 = (C19806.m45029("۬ۙ") ^ i10) * 23;
                        i = ((iM45029 ^ i11) * 25285) ^ 621355478;
                        i2 = -457447130;
                    }
                    i5 = iM45029 ^ i2;
                    Iterator it15 = itM943;
                    i13 = i5;
                    i12 = i;
                    itM943 = it15;
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0089, code lost:
    
        if (l.C0526.m2437() < 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0060, code lost:
    
        if (l.C1977.f7413 > 0) goto L10;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m51592(l.C15676 r29, l.InterfaceC2916 r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23428.m51592(l.ܺۗ᩺, l.ۗ֫ۖ):void");
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0797 A[PHI: r3 r4 r10 r17 r21 r27 r31 r32 r33 r36 r37 r41
      0x0797: PHI (r3v80 l.۠ᩳۨ) = (r3v76 l.۠ᩳۨ), (r3v78 l.۠ᩳۨ), (r3v79 l.۠ᩳۨ), (r3v81 l.۠ᩳۨ) binds: [B:133:0x0745, B:127:0x06ea, B:123:0x06ad, B:117:0x0657] A[DONT_GENERATE, DONT_INLINE]
      0x0797: PHI (r4v65 java.lang.String) = (r4v62 java.lang.String), (r4v63 java.lang.String), (r4v64 java.lang.String), (r4v67 java.lang.String) binds: [B:133:0x0745, B:127:0x06ea, B:123:0x06ad, B:117:0x0657] A[DONT_GENERATE, DONT_INLINE]
      0x0797: PHI (r10v4 java.lang.String) = (r10v3 java.lang.String), (r10v2 java.lang.String), (r10v2 java.lang.String), (r10v2 java.lang.String) binds: [B:133:0x0745, B:127:0x06ea, B:123:0x06ad, B:117:0x0657] A[DONT_GENERATE, DONT_INLINE]
      0x0797: PHI (r17v4 byte) = (r17v3 byte), (r17v2 byte), (r17v2 byte), (r17v2 byte) binds: [B:133:0x0745, B:127:0x06ea, B:123:0x06ad, B:117:0x0657] A[DONT_GENERATE, DONT_INLINE]
      0x0797: PHI (r21v40 l.۠ᩳۨ) = (r21v36 l.۠ᩳۨ), (r21v38 l.۠ᩳۨ), (r21v39 l.۠ᩳۨ), (r21v41 l.۠ᩳۨ) binds: [B:133:0x0745, B:127:0x06ea, B:123:0x06ad, B:117:0x0657] A[DONT_GENERATE, DONT_INLINE]
      0x0797: PHI (r27v33 java.lang.StringBuilder) = 
      (r27v29 java.lang.StringBuilder)
      (r27v31 java.lang.StringBuilder)
      (r27v32 java.lang.StringBuilder)
      (r27v37 java.lang.StringBuilder)
     binds: [B:133:0x0745, B:127:0x06ea, B:123:0x06ad, B:117:0x0657] A[DONT_GENERATE, DONT_INLINE]
      0x0797: PHI (r31v37 java.lang.Object) = (r31v33 java.lang.Object), (r31v35 java.lang.Object), (r31v36 java.lang.Object), (r31v38 java.lang.Object) binds: [B:133:0x0745, B:127:0x06ea, B:123:0x06ad, B:117:0x0657] A[DONT_GENERATE, DONT_INLINE]
      0x0797: PHI (r32v40 l.۠ᩳۨ) = (r32v37 l.۠ᩳۨ), (r32v38 l.۠ᩳۨ), (r32v39 l.۠ᩳۨ), (r32v41 l.۠ᩳۨ) binds: [B:133:0x0745, B:127:0x06ea, B:123:0x06ad, B:117:0x0657] A[DONT_GENERATE, DONT_INLINE]
      0x0797: PHI (r33v36 int) = (r33v32 int), (r33v34 int), (r33v35 int), (r33v37 int) binds: [B:133:0x0745, B:127:0x06ea, B:123:0x06ad, B:117:0x0657] A[DONT_GENERATE, DONT_INLINE]
      0x0797: PHI (r36v39 java.lang.String) = (r36v36 java.lang.String), (r36v37 java.lang.String), (r36v38 java.lang.String), (r36v40 java.lang.String) binds: [B:133:0x0745, B:127:0x06ea, B:123:0x06ad, B:117:0x0657] A[DONT_GENERATE, DONT_INLINE]
      0x0797: PHI (r37v28 short[]) = (r37v25 short[]), (r37v26 short[]), (r37v27 short[]), (r37v29 short[]) binds: [B:133:0x0745, B:127:0x06ea, B:123:0x06ad, B:117:0x0657] A[DONT_GENERATE, DONT_INLINE]
      0x0797: PHI (r41v39 int) = (r41v35 int), (r41v37 int), (r41v38 int), (r41v40 int) binds: [B:133:0x0745, B:127:0x06ea, B:123:0x06ad, B:117:0x0657] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01a4, code lost:
    
        if (l.C1025.f4800 < 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01aa, code lost:
    
        if (l.ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) goto L14;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:132:0x0742. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:87:0x0480. Please report as an issue. */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map m51590(java.lang.CharSequence r49) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23428.m51590(java.lang.CharSequence):java.util.Map");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10728 m51591(CharSequence charSequence, C8340 c8340) {
        ArrayList arrayListM21785 = null;
        Object objM7592 = null;
        AbstractC23157 abstractC23157 = null;
        int iM51157 = 0;
        int iM6276 = 0;
        int i = 0;
        int i2 = 0;
        AbstractC23157 abstractC23158 = null;
        int iM51158 = 0;
        int iLastIndexOf = 0;
        int i3 = -900717512;
        int i4 = C1148.f5161;
        int i5 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int iM45029 = (C19806.m45029("ۜ᩷") + i5) * (-107);
        int i6 = ((iM45029 ^ i4) * (-7893)) ^ (-1845921263);
        int i7 = 619846659;
        while (true) {
            i3 = ((((i3 ^ i4) * 7459) >> 31) & i6) ^ (iM45029 ^ i7);
            switch (i3) {
                case -2145708351:
                case -186318559:
                    RunnableC1895.m6170();
                    iM45029 = C19806.m45029("ۢ᩶") ^ i4;
                    i6 = ((iM45029 ^ i5) * 1657) ^ 978919916;
                    i7 = -465863938;
                    break;
                case -1878451438:
                case 1615781086:
                    iM6276 = C1937.m6276(arrayListM21785);
                    i = -1;
                    if (C0278.f1572 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۟᩶") ^ i4) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM45029 ^ i5) * (-25627)) ^ 35880320;
                        i7 = -1138377795;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰ᩸") ^ i4) * 71;
                        i6 = ((iM45029 ^ i5) * 28587) ^ (-1507257731);
                        i7 = 1021067700;
                    }
                    break;
                case -1868673526:
                case 543986436:
                    abstractC23157 = (AbstractC23157) objM7592;
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (C19806.m45029("ۢۨ") + i5) * 51;
                        i6 = ((iM45029 ^ i4) * 19823) ^ (-1028375755);
                        i7 = 939222856;
                    } else {
                        iM45029 = C19806.m45029("᩸۟") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-7891)) ^ 1590487748;
                        i7 = -912250837;
                    }
                    break;
                case -1820239326:
                case -1363299981:
                    C1398.m4895();
                    if (C1419.f5860 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۟᩶") ^ i4) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM45029 ^ i5) * (-25627)) ^ 35880320;
                        i7 = -1138377795;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷۠") ^ i5;
                        i6 = ((iM45029 ^ i4) * 15553) ^ 887583517;
                        i7 = -1113524229;
                    }
                    break;
                case -1811777138:
                case -1535520731:
                    if (C1377.f5749) {
                        return new C10728(C0817.m3407(charSequence.subSequence(iM51157, iM51158)), iM51157, iM51158);
                    }
                    iM45029 = (C19806.m45029("ۢۨ") + i5) * 51;
                    i6 = ((iM45029 ^ i4) * 19823) ^ (-1028375755);
                    i7 = 939222856;
                    break;
                case -1705265732:
                case 1748324247:
                    C1460.m5050();
                    if (C2249.f8050 >= 0) {
                        iM45029 = (C19806.m45029("ۢۨ") + i5) * 51;
                        i6 = ((iM45029 ^ i4) * 19823) ^ (-1028375755);
                        i7 = 939222856;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷۠") ^ i5;
                        i6 = ((iM45029 ^ i4) * 15553) ^ 887583517;
                        i7 = -1113524229;
                    }
                    break;
                case -1685534515:
                case 450296705:
                    C2124.m6673();
                    return null;
                case -1401715873:
                case 2079735621:
                    if (C0797.f3386) {
                        iM45029 = C19806.m45029("ۢ᩶") ^ i4;
                        i6 = ((iM45029 ^ i5) * 1657) ^ 978919916;
                        i7 = -465863938;
                    } else {
                        iM45029 = C19806.m45029("۬ۘ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 195) ^ (-190474430);
                        i7 = 1893362395;
                    }
                    break;
                case -1240445269:
                case 578314552:
                    iM51157 = abstractC23157.m51157();
                    if (C10634.m26820()) {
                        iM45029 = (ThreadFactoryC3888.m11306("۟᩶") ^ i4) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM45029 ^ i5) * (-25627)) ^ 35880320;
                        i7 = -1138377795;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸᩵") + i5) * (-107);
                        i6 = ((iM45029 ^ i4) * (-5397)) ^ (-1406764623);
                        i7 = 1044960014;
                    }
                    break;
                case -642150510:
                case -519265747:
                    return new C10728("", iLastIndexOf, iLastIndexOf);
                case -489695283:
                case -245175486:
                    RunnableC1564.m5345();
                    if (C0278.f1572 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷۠") ^ i5;
                        i6 = ((iM45029 ^ i4) * 15553) ^ 887583517;
                        i7 = -1113524229;
                    } else {
                        iM45029 = C19806.m45029("ۢ᩶") ^ i4;
                        i6 = ((iM45029 ^ i5) * 1657) ^ 978919916;
                        i7 = -465863938;
                    }
                    break;
                case -367993570:
                case 1443818813:
                    i2 = iM6276 + i;
                    if (C2332.f8260) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ܰ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 31577) ^ (-2120494115);
                        i7 = 1272693682;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ᩴۙ")) * (-25);
                        i6 = ((iM45029 ^ i5) * 7801) ^ 666097886;
                        i7 = 496443762;
                    }
                    break;
                case -198542813:
                case 1480362147:
                    iM51158 = abstractC23158.m51158();
                    if (C3660.f13403 >= 0) {
                        iM45029 = C19806.m45029("ۢ᩶") ^ i4;
                        i6 = ((iM45029 ^ i5) * 1657) ^ 978919916;
                        i7 = -465863938;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢۚ") ^ i5) * (-13);
                        i6 = ((iM45029 ^ i4) * (-16121)) ^ (-1915649455);
                        i7 = -485963148;
                    }
                    break;
                case 258599504:
                case 655737946:
                    arrayListM21785 = c8340.m21785();
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6239(arrayListM21785)) {
                        iM45029 = (ThreadFactoryC3888.m11306("֡ۖ") + i4) * 35;
                        i6 = ((iM45029 ^ i5) * 985) ^ 1675349909;
                        i7 = -1148748741;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛ۫") ^ i5) * (-83);
                        i6 = ((iM45029 ^ i4) * 9345) ^ (-119807159);
                        i7 = 1223812575;
                    }
                    break;
                case 363647604:
                case 879470028:
                    abstractC23158 = (AbstractC23157) RunnableC1606.m5478(arrayListM21785, i2);
                    if (C0962.f3784) {
                        iM45029 = (ThreadFactoryC3888.m11306("۟᩶") ^ i4) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((iM45029 ^ i5) * (-25627)) ^ 35880320;
                        i7 = -1138377795;
                    } else {
                        iM45029 = (C19806.m45029("ܽ۫") + i5) * (-33);
                        i6 = ((iM45029 ^ i4) * 15243) ^ (-1905888120);
                        i7 = -704829860;
                    }
                    break;
                case 1130109809:
                case 1991733688:
                    objM7592 = C2477.m7592(arrayListM21785, 0);
                    if (C2788.f10625 >= 0) {
                        iM45029 = (i4 - C19806.m45029("ᩴۙ")) * (-25);
                        i6 = ((iM45029 ^ i5) * 7801) ^ 666097886;
                        i7 = 496443762;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨۫") ^ i5) * (-101);
                        i6 = ((iM45029 ^ i4) * (-9193)) ^ (-1164243425);
                        i7 = -2018547462;
                    }
                    break;
                default:
                    iLastIndexOf = TextUtils.lastIndexOf(charSequence, '<', c8340.m51158());
                    if (C1148.f5161 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷۠") ^ i5;
                        i6 = ((iM45029 ^ i4) * 15553) ^ 887583517;
                        i7 = -1113524229;
                    } else {
                        iM45029 = (C19806.m45029("۫۟") + i5) * 73;
                        i6 = ((iM45029 ^ i4) * 939) ^ 821379799;
                        i7 = 1020671053;
                    }
                    break;
            }
        }
    }
}
