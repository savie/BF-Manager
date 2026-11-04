package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۨ۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: G1XN */
/* JADX INFO: loaded from: classes4.dex */
public final class C12202 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۜ᩹ۜ, reason: not valid java name and contains not printable characters */
    private static final short[] f39230 = {1791, -24941, 29545, 30660, 4427, 31678, 31665, 31668, 31677, 31721, 31678, 31665, 31668, 31677, 31722, 31665, 31659, 31644, 31677, 31648, 31646, 31665, 31668, 31677, 31675, 31664, 31673, 31670, 31679, 31677, 31676, 31628, 31649, 31656, 31677, 31659, 31675, 31664, 31673, 31670, 31679, 31677, 31676, 31644, 31677, 31648, 31677, 31659};

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3999 f39231;

    /* JADX WARN: Code duplicated, block: B:29:0x00d0 A[PHI: r5 r6
      0x00d0: PHI (r5v4 l.ܰ᩺᩻) = (r5v3 l.ܰ᩺᩻), (r5v2 l.ܰ᩺᩻), (r5v2 l.ܰ᩺᩻), (r5v2 l.ܰ᩺᩻) binds: [B:28:0x00ce, B:13:0x0062, B:7:0x0053, B:5:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r6v4 java.util.ArrayList) = (r6v3 java.util.ArrayList), (r6v2 java.util.ArrayList), (r6v2 java.util.ArrayList), (r6v2 java.util.ArrayList) binds: [B:28:0x00ce, B:13:0x0062, B:7:0x0053, B:5:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0107 A[PHI: r4 r7
      0x0107: PHI (r4v4 l.ܰ᩺᩻) = (r4v3 l.ܰ᩺᩻), (r4v2 l.ܰ᩺᩻) binds: [B:32:0x0105, B:20:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x0107: PHI (r7v3 l.ܰ᩺᩻) = (r7v2 l.ܰ᩺᩻), (r7v4 l.ܰ᩺᩻) binds: [B:32:0x0105, B:20:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0209 A[PHI: r1 r2 r3 r13 r14
      0x0209: PHI (r1v6 int) = (r1v2 int), (r1v4 int), (r1v2 int), (r1v2 int), (r1v2 int) binds: [B:55:0x0207, B:40:0x0167, B:24:0x00a3, B:7:0x0053, B:70:0x0209] A[DONT_GENERATE, DONT_INLINE]
      0x0209: PHI (r2v4 l.ۘ۟֫) = (r2v2 l.ۘ۟֫), (r2v2 l.ۘ۟֫), (r2v2 l.ۘ۟֫), (r2v2 l.ۘ۟֫), (r2v6 l.ۘ۟֫) binds: [B:55:0x0207, B:40:0x0167, B:24:0x00a3, B:7:0x0053, B:70:0x0209] A[DONT_GENERATE, DONT_INLINE]
      0x0209: PHI (r3v4 l.ۚܿ᩻) = (r3v2 l.ۚܿ᩻), (r3v2 l.ۚܿ᩻), (r3v2 l.ۚܿ᩻), (r3v2 l.ۚܿ᩻), (r3v7 l.ۚܿ᩻) binds: [B:55:0x0207, B:40:0x0167, B:24:0x00a3, B:7:0x0053, B:70:0x0209] A[DONT_GENERATE, DONT_INLINE]
      0x0209: PHI (r13v5 int) = (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:55:0x0207, B:40:0x0167, B:24:0x00a3, B:7:0x0053, B:70:0x0209] A[DONT_GENERATE, DONT_INLINE]
      0x0209: PHI (r14v5 short) = (r14v3 short), (r14v2 short), (r14v2 short), (r14v2 short), (r14v2 short) binds: [B:55:0x0207, B:40:0x0167, B:24:0x00a3, B:7:0x0053, B:70:0x0209] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x023c A[PHI: r11 r12
      0x023c: PHI (r11v4 short) = (r11v3 short), (r11v2 short) binds: [B:59:0x023a, B:10:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x023c: PHI (r12v4 short) = (r12v3 short), (r12v2 short) binds: [B:59:0x023a, B:10:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x026f A[PHI: r8 r10 r20
      0x026f: PHI (r8v5 java.lang.String) = (r8v2 java.lang.String), (r8v4 java.lang.String), (r8v2 java.lang.String), (r8v2 java.lang.String) binds: [B:63:0x026d, B:44:0x018d, B:13:0x0062, B:10:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x026f: PHI (r10v4 char) = (r10v3 char), (r10v2 char), (r10v2 char), (r10v2 char) binds: [B:63:0x026d, B:44:0x018d, B:13:0x0062, B:10:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x026f: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:63:0x026d, B:44:0x018d, B:13:0x0062, B:10:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        int iM2761;
        int i;
        int i2;
        int i3 = C3492.f12043;
        int i4 = AbstractC0641.f2496;
        int iM2762 = C0619.m2761("ۛۜ") ^ i4;
        int i5 = ((iM2762 ^ i3) * 29867) ^ 2008606681;
        short[] sArr = null;
        int i6 = iM2762 ^ 1428519869;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        short s3 = 0;
        int i8 = 0;
        int i9 = -2033790497;
        String strM4861 = null;
        C14941 c14941 = null;
        ArrayList arrayList = null;
        C14941 c14942 = null;
        C14941 c14943 = null;
        C5817 c5817 = null;
        ActivityC3999 activityC3999 = null;
        int iM3169 = 0;
        while (true) {
            i9 = i6 ^ (i5 & (((i9 ^ i3) * 31245) >> 31));
            switch (i9) {
                case -2101057245:
                case -677429616:
                    s = sArr[c];
                    s2 = 17716;
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0773.m3169("۬֨") ^ i4;
                        i = ((iM2761 ^ i3) * 30883) ^ 2103089499;
                        i2 = 1073426460;
                    } else {
                        iM2761 = (i4 - C0619.m2761("᩹ܺ")) * 81;
                        i = ((iM2761 ^ i3) * 14639) ^ (-1526676149);
                        i2 = -1413479729;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -2048979972:
                case -1255245358:
                    C3734.m12152();
                    if (C0269.f1558 > 0) {
                        iM2761 = C0619.m2761("ۜۗ") ^ i4;
                        i = ((iM2761 ^ i3) * 8565) ^ 731097875;
                        i2 = -200619315;
                    } else {
                        iM2761 = C0773.m3169("᩹᩵") ^ i3;
                        i = ((iM2761 ^ i4) * 25613) ^ 1338655429;
                        i2 = -233833111;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1921530427:
                case -80049596:
                    i8 = 41920;
                    iM2761 = (C0619.m2761("᩵ᩳ") ^ i4) * (-63);
                    i = ((iM2761 ^ i3) * 19153) ^ 401102830;
                    i2 = -68874208;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1820915825:
                case -418284002:
                    activityC3999.f13675 = c14943;
                    c14942 = activityC3999.f13675;
                    arrayList = activityC3999.f13674.f78144;
                    if (C1564.m5509() <= 0) {
                        iM2761 = C0619.m2761("ۜۗ") ^ i4;
                        i = ((iM2761 ^ i3) * 8565) ^ 731097875;
                        i2 = -200619315;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ۛ᩵")) * 123;
                        i = ((iM2761 ^ i3) * 21199) ^ (-1480050406);
                        i2 = 241533678;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1490005477:
                case 1884296375:
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0619.m2761("ۜۗ") ^ i4;
                        i = ((iM2761 ^ i3) * 8565) ^ 731097875;
                        i2 = -200619315;
                    } else {
                        iM2761 = C0773.m3169("ۢۛ") ^ i4;
                        i = ((iM2761 ^ i3) * (-29385)) ^ (-1181413194);
                        i2 = -1773312559;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1353994947:
                case 646592753:
                    activityC3999.f13675.m35942((InterfaceC2264) activityC3999);
                    c14941 = activityC3999.f13675;
                    if (C1564.f5401 <= 0) {
                        iM2761 = (i3 - C0619.m2761("ᩳ᩹")) * (-49);
                        i = ((iM2761 ^ i4) * (-26709)) ^ (-1272141831);
                        i2 = -1990349546;
                    } else {
                        iM2761 = C0619.m2761("᩹ۚ") ^ i3;
                        i = ((iM2761 ^ i4) * (-12181)) ^ 324111717;
                        i2 = -1043924992;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1169572922:
                case -546328525:
                    c14942.m35938(1, arrayList);
                    if (C3779.m12264()) {
                        iM2761 = C0619.m2761("᩻۠") ^ i3;
                        i = ((iM2761 ^ i4) * 24359) ^ (-820669570);
                        i2 = 897556477;
                    } else {
                        iM2761 = C0773.m3169("ۢۛ") ^ i4;
                        i = ((iM2761 ^ i3) * (-29385)) ^ (-1181413194);
                        i2 = -1773312559;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -835356649:
                case 2128577604:
                    C2485.m8357();
                    break;
                case -768385208:
                case 932217235:
                    c14941.m35944((InterfaceC5993) activityC3999);
                    C1826.m6315(c5817, activityC3999.f13675);
                    break;
                case -677381507:
                case 1207664990:
                    i8 = 61947;
                    iM2761 = (C0619.m2761("᩵ᩳ") ^ i4) * (-63);
                    i = ((iM2761 ^ i3) * 19153) ^ 401102830;
                    i2 = -68874208;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -537905874:
                case 779524329:
                    sArr = f39230;
                    c = 0;
                    if (C1146.f4234 >= 0) {
                        iM2761 = C0773.m3169("᩹᩵") ^ i3;
                        i = ((iM2761 ^ i4) * 25613) ^ 1338655429;
                        i2 = -233833111;
                    } else {
                        iM2761 = (C0619.m2761("᩸ۗ") ^ i3) * 31;
                        i = ((iM2761 ^ i4) * 15103) ^ (-1783906661);
                        i2 = -394583543;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -108304118:
                case 531923793:
                    if (i7 - (s * s3) >= 0) {
                        iM2761 = C0773.m3169("᩷᩵") ^ i3;
                        i = ((iM2761 ^ i4) * 10755) ^ (-2025319796);
                        i2 = -999675798;
                    } else {
                        iM2761 = C0773.m3169("ۧܽ") ^ i3;
                        i = ((iM2761 ^ i4) * (-12641)) ^ 1805346194;
                        i2 = -389231685;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 240005150:
                case 651603645:
                    iM3169 = 2126024576 ^ C0773.m3169(strM4861);
                    if (C0619.f2439) {
                        iM2761 = C0773.m3169("ۢۛ") ^ i4;
                        i = ((iM2761 ^ i3) * (-29385)) ^ (-1181413194);
                        i2 = -1773312559;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ᩴ᩹")) * (-21);
                        i = ((iM2761 ^ i3) * 13481) ^ (-1215605798);
                        i2 = -141956032;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 373613465:
                case 501245357:
                    c14943 = new C14941();
                    if (C1564.f5401 <= 0) {
                        iM2761 = (i3 - C0619.m2761("ᩳ᩹")) * (-49);
                        i = ((iM2761 ^ i4) * (-26709)) ^ (-1272141831);
                        i2 = -1990349546;
                    } else {
                        iM2761 = C0773.m3169("ۖۗ") ^ i4;
                        i = ((iM2761 ^ i3) * (-27731)) ^ 1335014499;
                        i2 = 430065852;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 479734810:
                case 1796202946:
                    if (C2485.f7950 == 0) {
                        iM2761 = C0773.m3169("᩹᩵") ^ i3;
                        i = ((iM2761 ^ i4) * 25613) ^ 1338655429;
                        i2 = -233833111;
                    } else {
                        iM2761 = C0773.m3169("۬֨") ^ i4;
                        i = ((iM2761 ^ i3) * 30883) ^ 2103089499;
                        i2 = 1073426460;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 784666700:
                case 1733350167:
                    strM4861 = C1321.m4861(f39230, 1, 3, i8);
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0773.m3169("᩹᩵") ^ i3;
                        i = ((iM2761 ^ i4) * 25613) ^ 1338655429;
                        i2 = -233833111;
                    } else {
                        iM2761 = C0773.m3169("ۙ᩸") ^ i3;
                        i = ((iM2761 ^ i4) * (-22407)) ^ 586912711;
                        i2 = 891346123;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 866945853:
                case 1196326318:
                    int i10 = s + s2;
                    i7 = i10 * i10;
                    s3 = 70864;
                    if (C3779.f12953 <= 0) {
                        iM2761 = C0773.m3169("ۢۛ") ^ i4;
                        i = ((iM2761 ^ i3) * (-29385)) ^ (-1181413194);
                        i2 = -1773312559;
                    } else {
                        iM2761 = C0619.m2761("ۧܰ") ^ i4;
                        i = ((iM2761 ^ i3) * 20633) ^ 1586541721;
                        i2 = 1935548881;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1799997519:
                case 1953147171:
                    activityC3999 = this.f39231;
                    c5817 = (C5817) C1564.m5518(activityC3999, iM3169);
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0773.m3169("ۢۛ") ^ i4;
                        i = ((iM2761 ^ i3) * (-29385)) ^ (-1181413194);
                        i2 = -1773312559;
                        i6 = iM2761 ^ i2;
                        i5 = i;
                    } else {
                        int iM2763 = C0619.m2761("ܶ֨") ^ i3;
                        i5 = ((iM2763 ^ i4) * (-18327)) ^ (-1090666107);
                        i6 = iM2763 ^ 236330070;
                    }
                    break;
                default:
                    C3077.m10041();
                    iM2761 = C0619.m2761("ۜۗ") ^ i4;
                    i = ((iM2761 ^ i3) * 8565) ^ 731097875;
                    i2 = -200619315;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    public C12202(ActivityC3999 activityC3999) {
        this.f39231 = activityC3999;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C1783.m6242(this, this.f39231);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        ActivityC3999 activityC3999 = null;
        int i = 1337435893;
        int i2 = RunnableC3055.f9898;
        int i3 = C1542.f5343;
        int iM3169 = (i3 - C0773.m3169("ۙۘ")) * 23;
        int i4 = ((iM3169 ^ i2) * (-9011)) ^ (-234647420);
        int i5 = -79191750;
        while (true) {
            i = ((((i ^ i2) * 28367) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1936485419:
                case -491978322:
                    C17202.m40372();
                    if (C2354.f7599 < 0) {
                        iM3169 = C0773.m3169("ܺܺ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 8007) ^ 1965557137;
                        i5 = -1485492446;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ۛ᩷")) * (-31);
                        i4 = ((iM3169 ^ i3) * 12483) ^ 1245267067;
                        i5 = -6656012;
                    }
                    break;
                case -1858449914:
                case -89904509:
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0773.m3169("ۗۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-17805)) ^ 1821476042;
                        i5 = 1720696498;
                    } else {
                        iM3169 = C0619.m2761("۟۫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-31065)) ^ 1959462569;
                        i5 = 1334761023;
                    }
                    break;
                case -1517094313:
                case 1976911010:
                    activityC3999 = this.f39231;
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0619.m2761("ۧܰ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-24363)) ^ (-1640883031);
                        i5 = -1447399289;
                    } else {
                        iM3169 = C0773.m3169("᩶᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-17853)) ^ 364794029;
                        i5 = 1767350084;
                    }
                    break;
                case -1235324150:
                case 1829894085:
                    if (C0487.f2131 <= 0) {
                        iM3169 = C0619.m2761("ۧܰ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-24363)) ^ (-1640883031);
                        i5 = -1447399289;
                    } else {
                        iM3169 = (C0773.m3169("ۜᩳ") + i2) * 29;
                        i4 = ((iM3169 ^ i3) * 16197) ^ (-2031708511);
                        i5 = -513599855;
                    }
                    break;
                case -1212544572:
                case -1131304143:
                    if (C2310.f7472 >= 0) {
                        iM3169 = C0619.m2761("ۧܰ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-24363)) ^ (-1640883031);
                        i5 = -1447399289;
                    } else {
                        iM3169 = (i2 - C0619.m2761("֫᩷")) * (-65);
                        i4 = ((iM3169 ^ i3) * 16101) ^ (-1688439443);
                        i5 = -1698236164;
                    }
                    break;
                case -851890402:
                case 781616427:
                    if (C2354.f7599 >= 0) {
                        iM3169 = C0773.m3169("ܺܺ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 8007) ^ 1965557137;
                        i5 = -1485492446;
                    } else {
                        iM3169 = C0619.m2761("ۛܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-10929)) ^ 1176439336;
                        i5 = -168775514;
                    }
                    break;
                case -529414071:
                case 604120239:
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0773.m3169("ۗۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-17805)) ^ 1821476042;
                        i5 = 1720696498;
                    } else {
                        iM3169 = C0773.m3169("֡֨") ^ i3;
                        i4 = ((iM3169 ^ i2) * 26155) ^ 320763776;
                        i5 = -1278910840;
                    }
                    break;
                case -476622431:
                case 1625156219:
                    if (C23916.m53419() != 0) {
                        iM3169 = (i2 - C0773.m3169("ۛ᩷")) * (-31);
                        i4 = ((iM3169 ^ i3) * 12483) ^ 1245267067;
                        i5 = -6656012;
                    } else {
                        iM3169 = (i2 - C0619.m2761("᩹᩹")) * 53;
                        i4 = ((iM3169 ^ i3) * (-2023)) ^ 1110679789;
                        i5 = 1507416479;
                    }
                    break;
                case -300677042:
                case 252511623:
                    C3734.m12152();
                    iM3169 = (i2 - C0773.m3169("ۛ᩷")) * (-31);
                    i4 = ((iM3169 ^ i3) * 12483) ^ 1245267067;
                    i5 = -6656012;
                    break;
                case -168559125:
                case 1493211260:
                    C0773.m3161();
                    break;
                case 23861053:
                case 540348840:
                    activityC3999.m40402((Throwable) exc, true);
                    break;
                case 306707414:
                case 1134975530:
                    if (C2310.f7472 < 0) {
                        iM3169 = (C0619.m2761("ۘ᩶") ^ i3) * 101;
                        i4 = ((iM3169 ^ i2) * (-23247)) ^ 1848166951;
                        i5 = -716890840;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ۛ᩷")) * (-31);
                        i4 = ((iM3169 ^ i3) * 12483) ^ 1245267067;
                        i5 = -6656012;
                    }
                    break;
                case 337544276:
                case 730819373:
                    if (C3998.m12920()) {
                        iM3169 = (C0773.m3169("ۚۡ") ^ i2) * (-87);
                        i4 = ((iM3169 ^ i3) * (-17115)) ^ 288108853;
                        i5 = -1877147150;
                    } else {
                        iM3169 = C0619.m2761("ۧܰ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-24363)) ^ (-1640883031);
                        i5 = -1447399289;
                    }
                    break;
                case 1395260496:
                case 1677723934:
                    if (C0950.m3785() != 0) {
                        iM3169 = C0619.m2761("ۧܰ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-24363)) ^ (-1640883031);
                        i5 = -1447399289;
                    } else {
                        iM3169 = C0619.m2761("ۜܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-26411)) ^ 1559877878;
                        i5 = 700248451;
                    }
                    break;
                case 1827878161:
                case 1864602294:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (C0619.m2761("ۘ᩶") ^ i3) * 101;
                        i4 = ((iM3169 ^ i2) * (-23247)) ^ 1848166951;
                        i5 = -716890840;
                    } else {
                        iM3169 = C0619.m2761("ܺ۟") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-5041)) ^ 1144395276;
                        i5 = -12626493;
                    }
                    break;
                default:
                    if (C2966.f9654 < 0) {
                        iM3169 = C0773.m3169("ۗۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-17805)) ^ 1821476042;
                        i5 = 1720696498;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ۛ᩷")) * (-31);
                        i4 = ((iM3169 ^ i3) * 12483) ^ 1245267067;
                        i5 = -6656012;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws Throwable {
        int iM3169;
        int i;
        int i2;
        int iM2761;
        int i3;
        int i4;
        HashMap map;
        int i5;
        int iM31610;
        int i6;
        int i7;
        int i8;
        int iM2762;
        int i9;
        int i10;
        int iM2763;
        int i11;
        int i12;
        HashMap map2;
        AbstractC22044 abstractC22044;
        int i13;
        int iM2764;
        int i14;
        C22737 c22737;
        C22737 c22738;
        int i15;
        HashMap map3 = null;
        HashMap map4 = null;
        ArrayList<String> stringArrayListExtra = null;
        HashSet hashSet = null;
        C22941 c22941 = null;
        Throwable th = null;
        C22737 c22739 = null;
        Iterator itM4942 = null;
        boolean zM6317 = false;
        Iterator itM7974 = null;
        boolean zM6318 = false;
        Iterator itM53429 = null;
        C22737 c227310 = null;
        boolean zM12923 = false;
        boolean zM47847 = false;
        C22737 c227311 = null;
        boolean zM47848 = false;
        int i16 = 364562286;
        int i17 = C0773.f2792;
        int i18 = C3734.f12817;
        int iM31611 = C0773.m3169("ܳۜ") ^ i18;
        int i19 = ((iM31611 ^ i17) * 14137) ^ (-1424568197);
        int i20 = iM31611 ^ 1026688937;
        AbstractC22044 abstractC22045 = null;
        ArrayList<String> arrayList = null;
        Iterator itM534210 = null;
        C22941 c22942 = null;
        Object obj = null;
        boolean z = false;
        int i21 = 0;
        int i22 = 0;
        boolean zM6319 = false;
        ActivityC3999 activityC3999 = null;
        int i23 = 0;
        AbstractC22044 abstractC22046 = null;
        Throwable th2 = null;
        Iterator itM4943 = null;
        Object obj2 = null;
        Iterator itM7975 = null;
        C8002 c8002M1239 = null;
        C22737 c227312 = null;
        C8002 c8002M11760 = null;
        while (true) {
            i16 = i20 ^ (i19 & (((i16 ^ i17) * 3521) >> 31));
            switch (i16) {
                case -2067346994:
                case -1330315288:
                    throw th;
                case -1956281955:
                case 2067454681:
                    if (zM6317) {
                        iM3169 = (C0773.m3169("ۘܽ") + i18) * (-79);
                        i = ((iM3169 ^ i17) * (-17151)) ^ 1523141442;
                        i2 = 490570368;
                    } else {
                        iM3169 = (i17 - C0619.m2761("ܰܿ")) * (-103);
                        i = ((iM3169 ^ i18) * 12111) ^ (-369742473);
                        i2 = 168199678;
                    }
                    i20 = iM3169 ^ i2;
                    i19 = i;
                    break;
                case -1912786313:
                case -739094702:
                    try {
                        C22737 c227313 = (C22737) C0950.m3796(itM7974);
                        try {
                            zM47847 = C20932.m47847(hashSet, C0487.m2358(c227313));
                            int iM2765 = C0619.m2761("᩵᩺") ^ i17;
                            i = ((iM2765 ^ i18) * (-31825)) ^ 1115659029;
                            i15 = iM2765 ^ (-623630792);
                            c227310 = c227313;
                            i20 = i15;
                            i19 = i;
                        } catch (Throwable th3) {
                            th = th3;
                            c22739 = c22739;
                            c227310 = c227313;
                            map4 = map4;
                            map3 = map3;
                            iM2763 = C0773.m3169("ۡۜ") ^ i18;
                            i11 = ((iM2763 ^ i17) * 15755) ^ 366250170;
                            i12 = 178067213;
                            int i24 = iM2763 ^ i12;
                            abstractC22046 = abstractC22046;
                            map4 = map4;
                            i20 = i24;
                            i19 = i11;
                            map3 = map3;
                            c227312 = c227312;
                            z = z;
                            c22739 = c22739;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        th = th;
                        c22739 = c22739;
                        map3 = map3;
                        iM2763 = C0773.m3169("ۡۜ") ^ i18;
                        i11 = ((iM2763 ^ i17) * 15755) ^ 366250170;
                        i12 = 178067213;
                        int i25 = iM2763 ^ i12;
                        abstractC22046 = abstractC22046;
                        map4 = map4;
                        i20 = i25;
                        i19 = i11;
                        map3 = map3;
                        c227312 = c227312;
                        z = z;
                        c22739 = c22739;
                    }
                    break;
                case -1899715307:
                case -712830678:
                    map4 = map4;
                    c22739 = c22739;
                    abstractC22046 = abstractC22046;
                    z = z ? 1 : 0;
                    c227312 = c227312;
                    map3 = map3;
                    if (C3998.m12923(itM534210)) {
                        iM2763 = (C0773.m3169("ۛ᩹") ^ i17) * (-101);
                        i11 = ((iM2763 ^ i18) * (-20887)) ^ 1032268976;
                        i12 = -2018818775;
                    } else {
                        iM2763 = C0773.m3169("᩸ۚ") ^ i18;
                        i11 = ((iM2763 ^ i17) * 843) ^ 822443465;
                        i12 = 1127729635;
                    }
                    int i26 = iM2763 ^ i12;
                    abstractC22046 = abstractC22046;
                    map4 = map4;
                    i20 = i26;
                    i19 = i11;
                    map3 = map3;
                    c227312 = c227312;
                    z = z;
                    c22739 = c22739;
                    break;
                case -1893327866:
                case 730715046:
                    try {
                        c22737 = c227310;
                        try {
                            C1519.m5396(map3, C0487.m2358(c227310), c22737);
                            c227310 = c22737;
                            iM3169 = (C0619.m2761("ۨۚ") ^ i18) * 39;
                            i = ((iM3169 ^ i17) * (-30083)) ^ (-895681766);
                            i2 = 387672734;
                            i20 = iM3169 ^ i2;
                            i19 = i;
                        } catch (Throwable th5) {
                            th = th5;
                            c227310 = c22737;
                            c22739 = c22739;
                            map3 = map3;
                            iM2763 = C0773.m3169("ۡۜ") ^ i18;
                            i11 = ((iM2763 ^ i17) * 15755) ^ 366250170;
                            i12 = 178067213;
                            int i27 = iM2763 ^ i12;
                            abstractC22046 = abstractC22046;
                            map4 = map4;
                            i20 = i27;
                            i19 = i11;
                            map3 = map3;
                            c227312 = c227312;
                            z = z;
                            c22739 = c22739;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        th = th;
                        c22739 = c22739;
                        map3 = map3;
                        iM2763 = C0773.m3169("ۡۜ") ^ i18;
                        i11 = ((iM2763 ^ i17) * 15755) ^ 366250170;
                        i12 = 178067213;
                        int i28 = iM2763 ^ i12;
                        abstractC22046 = abstractC22046;
                        map4 = map4;
                        i20 = i28;
                        i19 = i11;
                        map3 = map3;
                        c227312 = c227312;
                        z = z;
                        c22739 = c22739;
                        break;
                    }
                    break;
                case -1877186541:
                case -1675427921:
                    zM6317 = C1826.m6317(itM4942);
                    iM3169 = C0773.m3169("ܰ۫") ^ i17;
                    i = ((iM3169 ^ i18) * 21627) ^ 76092525;
                    i2 = -100983665;
                    i20 = iM3169 ^ i2;
                    i19 = i;
                    break;
                case -1820740006:
                case 1733595936:
                    map4 = map4;
                    c22739 = c22739;
                    abstractC22046 = abstractC22046;
                    z = z ? 1 : 0;
                    c227312 = c227312;
                    map3 = map3;
                    if (zM6319) {
                        iM2763 = C0773.m3169("ۗܶ") ^ i18;
                        i11 = ((iM2763 ^ i17) * (-489)) ^ 649354058;
                        i12 = -751854682;
                    } else {
                        iM2763 = C0619.m2761("ۜ᩵") ^ i17;
                        i11 = ((iM2763 ^ i18) * 4781) ^ (-89081263);
                        i12 = 1140450812;
                    }
                    int i29 = iM2763 ^ i12;
                    abstractC22046 = abstractC22046;
                    map4 = map4;
                    i20 = i29;
                    i19 = i11;
                    map3 = map3;
                    c227312 = c227312;
                    z = z;
                    c22739 = c22739;
                    break;
                case -1775826240:
                case 1379187212:
                    map4 = map4;
                    c22739 = c22739;
                    abstractC22046 = abstractC22046;
                    z = z ? 1 : 0;
                    c227312 = c227312;
                    map3 = map3;
                    AbstractC22044 abstractC22047 = abstractC22045;
                    c22941 = new C22941(abstractC22047);
                    iM2763 = (C0619.m2761("ܰ֨") + i17) * 11;
                    abstractC22045 = abstractC22047;
                    i11 = ((iM2763 ^ i18) * (-32623)) ^ (-1806040032);
                    i12 = -181852973;
                    int i210 = iM2763 ^ i12;
                    abstractC22046 = abstractC22046;
                    map4 = map4;
                    i20 = i210;
                    i19 = i11;
                    map3 = map3;
                    c227312 = c227312;
                    z = z;
                    c22739 = c22739;
                    break;
                case -1749419181:
                case 1896547320:
                    RunnableC3646.m11799(th, obj);
                    map2 = map4;
                    c22739 = c22739;
                    abstractC22044 = abstractC22046;
                    z = z ? 1 : 0;
                    iM2764 = C0619.m2761("ۚۛ") ^ i18;
                    i9 = ((iM2764 ^ i17) * 3825) ^ (-209886873);
                    i14 = 631564816;
                    int i30 = iM2764 ^ i14;
                    abstractC22046 = abstractC22044;
                    map4 = map2;
                    i20 = i30;
                    i19 = i9;
                    z = z;
                    c22739 = c22739;
                    break;
                case -1744730217:
                case -702268360:
                    map4 = map4;
                    c22739 = c22739;
                    abstractC22046 = abstractC22046;
                    z = z ? 1 : 0;
                    c227312 = c227312;
                    itM7975 = C2354.m7974((AbstractC8696) C23916.m53418(C3448.m11255(C13473.m33134(abstractC22046))));
                    iM2763 = (C0619.m2761("᩶ۘ") + i17) * 53;
                    i11 = ((iM2763 ^ i18) * (-87)) ^ (-797200816);
                    i12 = -1437457682;
                    int i211 = iM2763 ^ i12;
                    abstractC22046 = abstractC22046;
                    map4 = map4;
                    i20 = i211;
                    i19 = i11;
                    map3 = map3;
                    c227312 = c227312;
                    z = z;
                    c22739 = c22739;
                    break;
                case -1683467084:
                case -1469421813:
                    map4 = map4;
                    c22739 = c22739;
                    abstractC22046 = abstractC22046;
                    z = z ? 1 : 0;
                    c227312 = c227312;
                    map3 = map3;
                    try {
                        zM6319 = C1826.m6317(itM4943);
                        iM2763 = C0773.m3169("֡ܳ") ^ i18;
                        i11 = ((iM2763 ^ i17) * (-13145)) ^ (-1060482092);
                        i12 = 107597137;
                    } catch (Throwable th7) {
                        th = th7;
                        iM2763 = C0773.m3169("ۡۜ") ^ i18;
                        i11 = ((iM2763 ^ i17) * 15755) ^ 366250170;
                        i12 = 178067213;
                    }
                    int i212 = iM2763 ^ i12;
                    abstractC22046 = abstractC22046;
                    map4 = map4;
                    i20 = i212;
                    i19 = i11;
                    map3 = map3;
                    c227312 = c227312;
                    z = z;
                    c22739 = c22739;
                    break;
                case -1682684068:
                case -1149087603:
                    throw th2;
                case -1638988694:
                case 435168440:
                    itM4943 = C1343.m4942(arrayList);
                    iM2763 = (C0619.m2761("ᩴۘ") ^ i17) * (-21);
                    i11 = ((iM2763 ^ i18) * (-645)) ^ (-1620234195);
                    i12 = 829679780;
                    int i213 = iM2763 ^ i12;
                    abstractC22046 = abstractC22046;
                    map4 = map4;
                    i20 = i213;
                    i19 = i11;
                    map3 = map3;
                    c227312 = c227312;
                    z = z;
                    c22739 = c22739;
                    break;
                case -1618147921:
                case 599900140:
                    map2 = map4;
                    c22739 = c22739;
                    abstractC22044 = abstractC22046;
                    z = z ? 1 : 0;
                    try {
                        C3033.m9861(c22941);
                        iM2764 = C0619.m2761("ۚۛ") ^ i18;
                        i9 = ((iM2764 ^ i17) * 3825) ^ (-209886873);
                        i14 = 631564816;
                        int i31 = iM2764 ^ i14;
                        abstractC22046 = abstractC22044;
                        map4 = map2;
                        i20 = i31;
                        i19 = i9;
                        z = z;
                        c22739 = c22739;
                    } catch (Throwable th8) {
                        int iM31612 = (i17 - C0773.m3169("᩵᩻")) * 47;
                        int i32 = ((iM31612 ^ i18) * 30501) ^ (-1874889937);
                        abstractC22046 = abstractC22044;
                        map4 = map2;
                        i20 = iM31612 ^ (-1648013858);
                        z = z ? 1 : 0;
                        c22739 = c22739;
                        i13 = i32;
                        obj = th8;
                        i19 = i13;
                    }
                    break;
                case -1570135053:
                case -329831331:
                    zM6318 = C1826.m6317(itM7974);
                    iM3169 = C0619.m2761("ܰۡ") ^ i17;
                    i = ((iM3169 ^ i18) * (-3971)) ^ (-1205322540);
                    i2 = -1738408807;
                    i20 = iM3169 ^ i2;
                    i19 = i;
                    break;
                case -1547117053:
                case 444863924:
                    try {
                        RunnableC1848.m6369(c22942);
                        iM3169 = (C0619.m2761("ۡ᩺") ^ i17) * (-41);
                        i = ((iM3169 ^ i18) * (-7941)) ^ 1359786690;
                        i2 = 1059948844;
                        i20 = iM3169 ^ i2;
                        i19 = i;
                    } catch (Throwable th9) {
                        int iM31613 = (i18 - C0773.m3169("ۨۢ")) * (-61);
                        i20 = iM31613 ^ 184556134;
                        i13 = ((iM31613 ^ i17) * (-23389)) ^ (-2050810012);
                        obj2 = th9;
                        i19 = i13;
                    }
                    break;
                case -1474154727:
                case 584174579:
                    HashMap map5 = map4;
                    Throwable th10 = th2;
                    C22737 c227314 = c22739;
                    abstractC22046 = abstractC22046;
                    int i33 = i23;
                    Object[] objArr = z ? 1 : 0;
                    C22941 c22943 = c22942;
                    c227312 = c227312;
                    map3 = map3;
                    short s = f39230[4];
                    int i34 = (s * s) + 183494116;
                    int i35 = s + 13546;
                    if ((i35 * i35) - (i34 + i34) > 0) {
                        iM2761 = (C0619.m2761("ۧۖ") ^ i17) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i3 = ((iM2761 ^ i18) * 24259) ^ 365919456;
                        i4 = -838568262;
                    } else {
                        iM2761 = (C0619.m2761("ۢۛ") + i18) * (-85);
                        i3 = ((iM2761 ^ i17) * (-16715)) ^ (-302825774);
                        i4 = 76334524;
                    }
                    int i36 = iM2761 ^ i4;
                    z = objArr == true ? 1 : 0;
                    c22942 = c22943;
                    i23 = i33;
                    c22739 = c227314;
                    th2 = th10;
                    map = map5;
                    i20 = i36;
                    i19 = i3;
                    map3 = map3;
                    c227312 = c227312;
                    abstractC22046 = abstractC22046;
                    map4 = map;
                    break;
                case -1471606732:
                case 497691034:
                    c22737 = c227310;
                    if (zM47847) {
                        iM3169 = C0773.m3169("ۨ᩵") ^ i17;
                        c227310 = c22737;
                        i = ((iM3169 ^ i18) * (-29763)) ^ 1232056137;
                        i2 = -38235102;
                    } else {
                        c227310 = c22737;
                        iM3169 = (C0619.m2761("ۨۚ") ^ i18) * 39;
                        i = ((iM3169 ^ i17) * (-30083)) ^ (-895681766);
                        i2 = 387672734;
                    }
                    i20 = iM3169 ^ i2;
                    i19 = i;
                    break;
                case -1355531557:
                case -64546001:
                    map4 = map4;
                    c22739 = (C22737) C4238.m13529(itM7975);
                    if (!C20932.m47847(hashSet, C0487.m2358(c22739))) {
                        c22739 = c22739;
                        iM2763 = (C0619.m2761("᩶ۘ") + i17) * 53;
                        i11 = ((iM2763 ^ i18) * (-87)) ^ (-797200816);
                        i12 = -1437457682;
                        int i214 = iM2763 ^ i12;
                        abstractC22046 = abstractC22046;
                        map4 = map4;
                        i20 = i214;
                        i19 = i11;
                        map3 = map3;
                        c227312 = c227312;
                        z = z;
                        c22739 = c22739;
                    } else {
                        int iM31614 = (C0773.m3169("᩵ۤ") + i18) * (-79);
                        i6 = ((iM31614 ^ i17) * 5191) ^ 125052381;
                        i8 = iM31614 ^ 158434861;
                        map = map4;
                        i20 = i8;
                        i19 = i6;
                        map4 = map;
                    }
                    break;
                case -1230830328:
                case 828863052:
                    map2 = map4;
                    c22739 = c22739;
                    RunnableC1848.m6369(c22941);
                    abstractC22044 = abstractC22046;
                    c22942 = new C22941(abstractC22044);
                    iM2764 = C0619.m2761("᩶ᩴ") ^ i18;
                    z = z ? 1 : 0;
                    i9 = ((iM2764 ^ i17) * (-16611)) ^ (-2088369030);
                    i14 = -50973954;
                    int i37 = iM2764 ^ i14;
                    abstractC22046 = abstractC22044;
                    map4 = map2;
                    i20 = i37;
                    i19 = i9;
                    z = z;
                    c22739 = c22739;
                    break;
                case -1164678135:
                case -741321808:
                    i5 = 3907;
                    int iM2766 = C0619.m2761("ۖ᩹") ^ i18;
                    th2 = th2;
                    c22942 = c22942;
                    i23 = i5;
                    i19 = ((iM2766 ^ i17) * (-16801)) ^ 264006621;
                    z = z ? 1 : 0;
                    c22739 = c22739;
                    map = map4;
                    i20 = iM2766 ^ (-659292491);
                    map3 = map3;
                    c227312 = c227312;
                    abstractC22046 = abstractC22046;
                    map4 = map;
                    break;
                case -996979915:
                case 1776661241:
                    map4 = map4;
                    c22739 = c22739;
                    try {
                        itM4942 = C1343.m4942(arrayList);
                        iM31610 = (C0619.m2761("ᩴ۟") + i18) * 59;
                        i6 = ((iM31610 ^ i17) * (-11309)) ^ (-1277311613);
                        i7 = -880652065;
                    } catch (Throwable th11) {
                        th2 = th11;
                        iM31610 = (C0773.m3169("۬ۤ") ^ i17) * 5;
                        i6 = ((iM31610 ^ i18) * 4967) ^ (-530971261);
                        i7 = -1630412010;
                    }
                    i8 = iM31610 ^ i7;
                    c22739 = c22739;
                    map = map4;
                    i20 = i8;
                    i19 = i6;
                    map4 = map;
                    break;
                case -970108445:
                case 241033505:
                    if (c8002M1239 != null) {
                        iM3169 = (C0773.m3169("ܶۢ") + i17) * (-115);
                        i = ((iM3169 ^ i18) * 15653) ^ (-969606828);
                        i2 = -1472116791;
                        i20 = iM3169 ^ i2;
                        i19 = i;
                    } else {
                        map4 = map4;
                        c22739 = c22739;
                        iM31610 = (C0619.m2761("ᩴ۟") + i18) * 59;
                        i6 = ((iM31610 ^ i17) * (-11309)) ^ (-1277311613);
                        i7 = -880652065;
                        i8 = iM31610 ^ i7;
                        c22739 = c22739;
                        map = map4;
                        i20 = i8;
                        i19 = i6;
                        map4 = map;
                    }
                    break;
                case -954153311:
                case 1707588615:
                    c22739 = c22739;
                    String str = (String) C3690.m11990(stringArrayListExtra, i21);
                    map4 = map4;
                    stringArrayListExtra.set(i21, AbstractC0116.m1237(str, z ? 1 : 0, C2966.m9671(str) - (z ? 1 : 0)));
                    i21++;
                    z = z ? 1 : 0;
                    c227312 = c227312;
                    abstractC22046 = abstractC22046;
                    iM2763 = (C0773.m3169("۟᩸") + i17) * (-47);
                    i11 = ((iM2763 ^ i18) * 28349) ^ 725991418;
                    i12 = -1541852373;
                    int i215 = iM2763 ^ i12;
                    abstractC22046 = abstractC22046;
                    map4 = map4;
                    i20 = i215;
                    i19 = i11;
                    map3 = map3;
                    c227312 = c227312;
                    z = z;
                    c22739 = c22739;
                    break;
                case -797268909:
                case 1178570272:
                    map4 = map4;
                    c22739 = c22739;
                    try {
                        c8002M11760 = AbstractC3624.m11760(c22941, (String) C0950.m3796(itM4943));
                        iM31610 = (C0773.m3169("ܺᩳ") + i18) * (-123);
                        i6 = ((iM31610 ^ i17) * 30049) ^ 1220927013;
                        i7 = 955244938;
                        i8 = iM31610 ^ i7;
                        c22739 = c22739;
                        map = map4;
                        i20 = i8;
                        i19 = i6;
                        map4 = map;
                    } catch (Throwable th12) {
                        th = th12;
                        map3 = map3;
                        iM2763 = C0773.m3169("ۡۜ") ^ i18;
                        i11 = ((iM2763 ^ i17) * 15755) ^ 366250170;
                        i12 = 178067213;
                        int i216 = iM2763 ^ i12;
                        abstractC22046 = abstractC22046;
                        map4 = map4;
                        i20 = i216;
                        i19 = i11;
                        map3 = map3;
                        c227312 = c227312;
                        z = z;
                        c22739 = c22739;
                    }
                    break;
                case -768636196:
                case 1352848105:
                    map4 = map4;
                    c22739 = c22739;
                    z = true;
                    z = true;
                    if (i21 < C2288.m7752(stringArrayListExtra)) {
                        iM31610 = (i17 - C0773.m3169("ۢ֨")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i6 = ((iM31610 ^ i18) * (-26427)) ^ (-644166052);
                        i7 = -346078038;
                    } else {
                        iM31610 = (C0773.m3169("᩺ۜ") ^ i17) * (-111);
                        i6 = ((iM31610 ^ i18) * (-26981)) ^ (-686577196);
                        i7 = 2061786477;
                    }
                    i8 = iM31610 ^ i7;
                    c22739 = c22739;
                    map = map4;
                    i20 = i8;
                    i19 = i6;
                    map4 = map;
                    break;
                case -491716034:
                case 777828971:
                    c8002M1239 = AbstractC0116.m1239(c22942, (String) C0950.m3796(itM4942));
                    iM3169 = (C0619.m2761("ܿܰ") ^ i18) * (-105);
                    i = ((iM3169 ^ i17) * (-18463)) ^ (-1558272493);
                    i2 = -771562119;
                    i20 = iM3169 ^ i2;
                    i19 = i;
                    break;
                case -458006776:
                case 930830113:
                    zM12923 = C3998.m12923(itM53429);
                    iM3169 = (i18 - C0773.m3169("ۖ۬")) * 93;
                    i = ((iM3169 ^ i17) * 16065) ^ 1709961913;
                    i2 = 550327604;
                    i20 = iM3169 ^ i2;
                    i19 = i;
                    break;
                case -392396300:
                case 1583466174:
                    C3033.m9861(c22942);
                    map4 = map4;
                    c22739 = c22739;
                    abstractC22046 = abstractC22046;
                    z = z ? 1 : 0;
                    c227312 = c227312;
                    i21 = i22;
                    iM2763 = (C0773.m3169("۟᩸") + i17) * (-47);
                    i11 = ((iM2763 ^ i18) * 28349) ^ 725991418;
                    i12 = -1541852373;
                    int i217 = iM2763 ^ i12;
                    abstractC22046 = abstractC22046;
                    map4 = map4;
                    i20 = i217;
                    i19 = i11;
                    map3 = map3;
                    c227312 = c227312;
                    z = z;
                    c22739 = c22739;
                    break;
                case -352362111:
                case 2039716040:
                    if (!zM6318) {
                        iM2763 = (C0619.m2761("ᩴۘ") ^ i17) * (-21);
                        i11 = ((iM2763 ^ i18) * (-645)) ^ (-1620234195);
                        i12 = 829679780;
                        int i218 = iM2763 ^ i12;
                        abstractC22046 = abstractC22046;
                        map4 = map4;
                        i20 = i218;
                        i19 = i11;
                        map3 = map3;
                        c227312 = c227312;
                        z = z;
                        c22739 = c22739;
                    } else {
                        iM3169 = (C0619.m2761("ۚᩴ") + i18) * 37;
                        i = ((iM3169 ^ i17) * 839) ^ 1665745087;
                        i2 = 1482828141;
                        i20 = iM3169 ^ i2;
                        i19 = i;
                    }
                    break;
                case -255989820:
                case 707333720:
                    itM53429 = C23916.m53429((AbstractC8696) C2354.m7984(C24975.m55778(C0269.m1776(c22942, c8002M1239))));
                    iM3169 = (C0619.m2761("᩸֡") + i17) * (-3);
                    i = ((iM3169 ^ i18) * 4643) ^ (-595509296);
                    i2 = -1620987733;
                    i20 = iM3169 ^ i2;
                    i19 = i;
                    break;
                case -140411547:
                case -54427681:
                    c22739 = c22739;
                    C1519.m5396(map4, C0487.m2358(c22739), c22739);
                    map4 = map4;
                    iM2763 = (C0619.m2761("᩶ۘ") + i17) * 53;
                    i11 = ((iM2763 ^ i18) * (-87)) ^ (-797200816);
                    i12 = -1437457682;
                    int i219 = iM2763 ^ i12;
                    abstractC22046 = abstractC22046;
                    map4 = map4;
                    i20 = i219;
                    i19 = i11;
                    map3 = map3;
                    c227312 = c227312;
                    z = z;
                    c22739 = c22739;
                    break;
                case -118064169:
                case 287841257:
                    map4 = map4;
                    c22739 = c22739;
                    abstractC22046 = abstractC22046;
                    z = z ? 1 : 0;
                    c227312 = c227312;
                    if (C3998.m12923(itM7975)) {
                        iM2763 = (i18 - C0773.m3169("֡ܶ")) * 123;
                        map3 = map3;
                        i11 = ((iM2763 ^ i17) * 24253) ^ (-1409010427);
                        i12 = 831012407;
                    } else {
                        i21 = i22;
                        iM2763 = (C0773.m3169("۟᩸") + i17) * (-47);
                        i11 = ((iM2763 ^ i18) * 28349) ^ 725991418;
                        i12 = -1541852373;
                    }
                    int i2110 = iM2763 ^ i12;
                    abstractC22046 = abstractC22046;
                    map4 = map4;
                    i20 = i2110;
                    i19 = i11;
                    map3 = map3;
                    c227312 = c227312;
                    z = z;
                    c22739 = c22739;
                    break;
                case -24813307:
                case 1180691576:
                    map4 = map4;
                    c22739 = c22739;
                    abstractC22046 = abstractC22046;
                    z = z ? 1 : 0;
                    c227312 = c227312;
                    map3 = map3;
                    itM534210 = C23916.m53429((AbstractC8696) C23916.m53418(C2834.m9334(C13473.m33134(abstractC22045))));
                    iM2763 = (C0619.m2761("᩶֡") + i18) * 3;
                    i11 = ((iM2763 ^ i17) * 14139) ^ 471173592;
                    i12 = 1790904518;
                    int i2111 = iM2763 ^ i12;
                    abstractC22046 = abstractC22046;
                    map4 = map4;
                    i20 = i2111;
                    i19 = i11;
                    map3 = map3;
                    c227312 = c227312;
                    z = z;
                    c22739 = c22739;
                    break;
                case 22175447:
                case 366610013:
                    try {
                        C22737 c227315 = (C22737) C0950.m3796(itM53429);
                        try {
                            zM47848 = C20932.m47847(hashSet, C20932.m47854(c227315));
                            int iM31615 = (C0773.m3169("ۨ᩻") + i18) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i = ((iM31615 ^ i17) * 10675) ^ 1320953225;
                            i15 = iM31615 ^ 393489932;
                            c227311 = c227315;
                            i20 = i15;
                            i19 = i;
                        } catch (Throwable th13) {
                            th2 = th13;
                            c22739 = c22739;
                            c227311 = c227315;
                            map4 = map4;
                            iM31610 = (C0773.m3169("۬ۤ") ^ i17) * 5;
                            i6 = ((iM31610 ^ i18) * 4967) ^ (-530971261);
                            i7 = -1630412010;
                            i8 = iM31610 ^ i7;
                            c22739 = c22739;
                            map = map4;
                            i20 = i8;
                            i19 = i6;
                            map4 = map;
                        }
                    } catch (Throwable th14) {
                        th = th14;
                        th2 = th;
                        c22739 = c22739;
                        iM31610 = (C0773.m3169("۬ۤ") ^ i17) * 5;
                        i6 = ((iM31610 ^ i18) * 4967) ^ (-530971261);
                        i7 = -1630412010;
                        i8 = iM31610 ^ i7;
                        c22739 = c22739;
                        map = map4;
                        i20 = i8;
                        i19 = i6;
                        map4 = map;
                        break;
                    }
                    break;
                case 43922084:
                case 101108803:
                    if (!zM12923) {
                        map4 = map4;
                        c22739 = c22739;
                        iM31610 = (C0619.m2761("ᩴ۟") + i18) * 59;
                        i6 = ((iM31610 ^ i17) * (-11309)) ^ (-1277311613);
                        i7 = -880652065;
                        i8 = iM31610 ^ i7;
                        c22739 = c22739;
                        map = map4;
                        i20 = i8;
                        i19 = i6;
                        map4 = map;
                    } else {
                        iM3169 = C0773.m3169("᩻ۧ") ^ i18;
                        i = ((iM3169 ^ i17) * 7525) ^ 2002959174;
                        i2 = -1807635550;
                        i20 = iM3169 ^ i2;
                        i19 = i;
                    }
                    break;
                case 113189712:
                case 1311553398:
                    try {
                        c22738 = c227311;
                        try {
                            C1519.m5396(map4, C20932.m47854(c227311), c22738);
                            c227311 = c22738;
                            iM3169 = (C0619.m2761("᩸֡") + i17) * (-3);
                            i = ((iM3169 ^ i18) * 4643) ^ (-595509296);
                            i2 = -1620987733;
                            i20 = iM3169 ^ i2;
                            i19 = i;
                        } catch (Throwable th15) {
                            th2 = th15;
                            c227311 = c22738;
                            c22739 = c22739;
                            iM31610 = (C0773.m3169("۬ۤ") ^ i17) * 5;
                            i6 = ((iM31610 ^ i18) * 4967) ^ (-530971261);
                            i7 = -1630412010;
                            i8 = iM31610 ^ i7;
                            c22739 = c22739;
                            map = map4;
                            i20 = i8;
                            i19 = i6;
                            map4 = map;
                        }
                    } catch (Throwable th16) {
                        th = th16;
                        th2 = th;
                        c22739 = c22739;
                        iM31610 = (C0773.m3169("۬ۤ") ^ i17) * 5;
                        i6 = ((iM31610 ^ i18) * 4967) ^ (-530971261);
                        i7 = -1630412010;
                        i8 = iM31610 ^ i7;
                        c22739 = c22739;
                        map = map4;
                        i20 = i8;
                        i19 = i6;
                        map4 = map;
                        break;
                    }
                    break;
                case 124890499:
                case 1882423067:
                    C1146.m4219(th2, obj2);
                    iM3169 = (C0619.m2761("ۡ᩺") ^ i17) * (-41);
                    i = ((iM3169 ^ i18) * (-7941)) ^ 1359786690;
                    i2 = 1059948844;
                    i20 = iM3169 ^ i2;
                    i19 = i;
                    break;
                case 194691124:
                case 925610838:
                    activityC3999.f13674.f78144 = stringArrayListExtra;
                    activityC3999.f13674.f78142 = z;
                    return;
                case 490013630:
                case 1404259873:
                    itM7974 = C2354.m7974((AbstractC8696) C23916.m53418(C24975.m55778(C0269.m1776(c22941, c8002M11760))));
                    iM3169 = (C0619.m2761("ۨۚ") ^ i18) * 39;
                    i = ((iM3169 ^ i17) * (-30083)) ^ (-895681766);
                    i2 = 387672734;
                    i20 = iM3169 ^ i2;
                    i19 = i;
                    break;
                case 547541286:
                case 1486599536:
                    if (c8002M11760 != null) {
                        iM3169 = C0773.m3169("۟۬") ^ i17;
                        i = ((iM3169 ^ i18) * 11223) ^ 730960868;
                        i2 = 556658021;
                        i20 = iM3169 ^ i2;
                        i19 = i;
                    } else {
                        iM2763 = (C0619.m2761("ᩴۘ") ^ i17) * (-21);
                        i11 = ((iM2763 ^ i18) * (-645)) ^ (-1620234195);
                        i12 = 829679780;
                        int i2112 = iM2763 ^ i12;
                        abstractC22046 = abstractC22046;
                        map4 = map4;
                        i20 = i2112;
                        i19 = i11;
                        map3 = map3;
                        c227312 = c227312;
                        z = z;
                        c22739 = c22739;
                    }
                    break;
                case 671067904:
                case 1086712452:
                    map3 = map3;
                    map4 = map4;
                    c22739 = c22739;
                    abstractC22046 = abstractC22046;
                    z = z ? 1 : 0;
                    C22737 c227316 = (C22737) C4238.m13529(itM534210);
                    if (!C20932.m47847(hashSet, C20932.m47854(c227316))) {
                        c227312 = c227316;
                        iM2763 = (C0619.m2761("᩶֡") + i18) * 3;
                        i11 = ((iM2763 ^ i17) * 14139) ^ 471173592;
                        i12 = 1790904518;
                        int i2113 = iM2763 ^ i12;
                        abstractC22046 = abstractC22046;
                        map4 = map4;
                        i20 = i2113;
                        i19 = i11;
                        map3 = map3;
                        c227312 = c227312;
                        z = z;
                        c22739 = c22739;
                    } else {
                        int iM31616 = (i17 - C0773.m3169("ܳ۠")) * (-107);
                        i9 = ((iM31616 ^ i18) * (-27359)) ^ (-292254322);
                        abstractC22046 = abstractC22046;
                        map4 = map4;
                        i20 = iM31616 ^ 1820123845;
                        map3 = map3;
                        c227312 = c227316;
                        i19 = i9;
                        z = z;
                        c22739 = c22739;
                    }
                    break;
                case 735349138:
                case 1952406025:
                    map4 = map4;
                    c22739 = c22739;
                    abstractC22046 = abstractC22046;
                    z = z ? 1 : 0;
                    c227312 = c227312;
                    RunnableC0334.m2056(map3, C0487.m2358(c227312), c227312);
                    map3 = map3;
                    iM2763 = (C0619.m2761("᩶֡") + i18) * 3;
                    i11 = ((iM2763 ^ i17) * 14139) ^ 471173592;
                    i12 = 1790904518;
                    int i2114 = iM2763 ^ i12;
                    abstractC22046 = abstractC22046;
                    map4 = map4;
                    i20 = i2114;
                    i19 = i11;
                    map3 = map3;
                    c227312 = c227312;
                    z = z;
                    c22739 = c22739;
                    break;
                case 827044438:
                case 1645692128:
                    c22738 = c227311;
                    if (zM47848) {
                        iM3169 = C0619.m2761("ܰۜ") ^ i17;
                        c227311 = c22738;
                        i = ((iM3169 ^ i18) * 11813) ^ 1108243978;
                        i2 = 1018309235;
                    } else {
                        c227311 = c22738;
                        iM3169 = (C0619.m2761("᩸֡") + i17) * (-3);
                        i = ((iM3169 ^ i18) * 4643) ^ (-595509296);
                        i2 = -1620987733;
                    }
                    i20 = iM3169 ^ i2;
                    i19 = i;
                    break;
                case 1302584943:
                case 2031786271:
                    c22739 = c22739;
                    z = z ? 1 : 0;
                    C22737 c227317 = c227312;
                    ActivityC3999 activityC39910 = this.f39231;
                    HashMap map6 = activityC39910.f13674.f78143;
                    HashMap map7 = activityC39910.f13674.f78141;
                    Throwable th17 = th2;
                    int i38 = i23;
                    abstractC22045 = (AbstractC22044) C2485.m8359(activityC39910).getSerializableExtra(C3033.m9847(f39230, 5, 5, i38));
                    AbstractC22044 abstractC22048 = (AbstractC22044) C13473.m33143(activityC39910).getSerializableExtra(C3734.m12149(f39230, 10, 5, i38));
                    C22941 c22944 = c22942;
                    boolean booleanExtra = C2485.m8359(activityC39910).getBooleanExtra(C3448.m11252(f39230, 15, 9, i38), false);
                    stringArrayListExtra = C2485.m8359(activityC39910).getStringArrayListExtra(RunnableC0334.m2049(f39230, 24, 12, i38));
                    ArrayList<String> stringArrayListExtra2 = C2485.m8359(activityC39910).getStringArrayListExtra(C23916.m53420(f39230, 36, 12, i38));
                    C1321.m4848(abstractC22045);
                    C1321.m4848(abstractC22048);
                    C3099.m10086(stringArrayListExtra);
                    C3099.m10086(stringArrayListExtra2);
                    hashSet = new HashSet(stringArrayListExtra);
                    if (booleanExtra) {
                        iM2762 = (C0619.m2761("᩷᩹") ^ i18) * (-23);
                        i9 = ((iM2762 ^ i17) * (-11049)) ^ 1061259787;
                        i10 = -580871253;
                    } else {
                        iM2762 = (C0619.m2761("ۢۤ") + i17) * 67;
                        i9 = ((iM2762 ^ i18) * 5867) ^ 1070690468;
                        i10 = 1771320129;
                    }
                    int i39 = iM2762 ^ i10;
                    c227312 = c227317;
                    activityC3999 = activityC39910;
                    c22942 = c22944;
                    abstractC22046 = abstractC22048;
                    i20 = i39;
                    i23 = i38;
                    map3 = map6;
                    map4 = map7;
                    th2 = th17;
                    i22 = 0;
                    arrayList = stringArrayListExtra2;
                    i19 = i9;
                    z = z;
                    c22739 = c22739;
                    break;
                default:
                    i5 = 31704;
                    int iM2767 = C0619.m2761("ۖ᩹") ^ i18;
                    th2 = th2;
                    c22942 = c22942;
                    i23 = i5;
                    i19 = ((iM2767 ^ i17) * (-16801)) ^ 264006621;
                    z = z ? 1 : 0;
                    c22739 = c22739;
                    map = map4;
                    i20 = iM2767 ^ (-659292491);
                    map3 = map3;
                    c227312 = c227312;
                    abstractC22046 = abstractC22046;
                    map4 = map;
                    break;
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C20932.m47845(this);
    }
}
