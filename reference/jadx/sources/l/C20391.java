package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩵ۜۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: D60A */
/* JADX INFO: loaded from: classes5.dex */
public final class C20391 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۙ᩸ۙ, reason: not valid java name and contains not printable characters */
    private static final short[] f65371 = {4641, 5776, -263, 10356};

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21137 f65372;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f65373;

    /* JADX WARN: Code duplicated, block: B:17:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x0100 A[PHI: r2 r4 r5 r14
      0x0100: PHI (r2v4 l.᩶ۜۤ) = (r2v3 l.᩶ۜۤ), (r2v2 l.᩶ۜۤ), (r2v2 l.᩶ۜۤ) binds: [B:36:0x00fe, B:24:0x009b, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0100: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:36:0x00fe, B:24:0x009b, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0100: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:36:0x00fe, B:24:0x009b, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0100: PHI (r14v4 short[]) = (r14v3 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:36:0x00fe, B:24:0x009b, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x01ea A[PHI: r3 r8 r10 r11
      0x01ea: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v3 java.lang.String), (r3v2 java.lang.String) binds: [B:59:0x01e8, B:51:0x01a6, B:28:0x00bf, B:12:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x01ea: PHI (r8v4 short) = (r8v3 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:59:0x01e8, B:51:0x01a6, B:28:0x00bf, B:12:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x01ea: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:59:0x01e8, B:51:0x01a6, B:28:0x00bf, B:12:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x01ea: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:59:0x01e8, B:51:0x01a6, B:28:0x00bf, B:12:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0214 A[PHI: r7 r9 r12 r15
      0x0214: PHI (r7v3 char) = (r7v2 char), (r7v2 char), (r7v2 char), (r7v5 char) binds: [B:55:0x01c7, B:47:0x0186, B:32:0x00de, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0214: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:55:0x01c7, B:47:0x0186, B:32:0x00de, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0214: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:55:0x01c7, B:47:0x0186, B:32:0x00de, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0214: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:55:0x01c7, B:47:0x0186, B:32:0x00de, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0248 A[PHI: r20
      0x0248: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:65:0x0246, B:18:0x007e, B:15:0x0062, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        int iM3169;
        int i;
        int i2;
        int i3 = C2375.f7641;
        int i4 = C0950.f3488;
        int iM31610 = (C0773.m3169("۠ۘ") ^ i3) * (-83);
        int i5 = ((iM31610 ^ i4) * (-32515)) ^ (-1484251499);
        String strM8881 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM31610 ^ (-1448442741);
        ActivityC21137 activityC21137 = null;
        int iM2761 = 0;
        int i7 = 0;
        char c = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1396451735;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i4) * 7829) >> 31));
            switch (i14) {
                case -2002209461:
                case -1104790187:
                    if (C0773.f2792 <= 0) {
                        iM3169 = C0773.m3169("ۡۤ") ^ i3;
                        i = ((iM3169 ^ i4) * 24191) ^ (-1480332132);
                        i2 = 1543263142;
                    } else {
                        iM3169 = (C0773.m3169("ܽ᩵") + i3) * 19;
                        i = ((iM3169 ^ i4) * 14103) ^ (-1500829989);
                        i2 = -459503619;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1913810690:
                case -1708392176:
                    iM2761 = C0619.m2761(strM8881);
                    i7 = 2122447018;
                    if (C4282.m13644()) {
                        iM3169 = (i4 - C0773.m3169("֨ܶ")) * (-27);
                        i = ((iM3169 ^ i3) * 32257) ^ (-155511929);
                        i2 = -1784578692;
                    } else {
                        iM3169 = C0619.m2761("ۢ֨") ^ i3;
                        i = ((iM3169 ^ i4) * (-14537)) ^ (-1963200356);
                        i2 = 1522441641;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1728768097:
                case 778097366:
                    if (C0487.f2131 <= 0) {
                        iM3169 = (C0773.m3169("ܽ᩵") + i3) * 19;
                        i = ((iM3169 ^ i4) * 14103) ^ (-1500829989);
                        i2 = -459503619;
                    } else {
                        iM3169 = C0773.m3169("۠᩷") ^ i4;
                        i = ((iM3169 ^ i3) * 5293) ^ 1967807492;
                        i2 = 528731376;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1680140502:
                case -1029692286:
                    m8191(activityC21137, iM2761 ^ i7);
                    break;
                case -1425567132:
                case -1056134920:
                    i13 = 1;
                    if (C1343.f4799 != 0) {
                        iM3169 = C0773.m3169("ۨ۟") ^ i4;
                        i = ((iM3169 ^ i3) * 13681) ^ (-2099135232);
                        i2 = 2041753408;
                    } else {
                        iM3169 = C0773.m3169("۟ۤ") ^ i3;
                        i = ((iM3169 ^ i4) * 6089) ^ 1760831416;
                        i2 = 1653844303;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1320967505:
                case 1450751365:
                    activityC21137 = this.f65372;
                    sArr2 = f65371;
                    if (C2485.f7950 != 0) {
                        iM3169 = C0619.m2761("ۢ֨") ^ i3;
                        i = ((iM3169 ^ i4) * (-14537)) ^ (-1963200356);
                        i2 = 1522441641;
                    } else {
                        iM3169 = (C0619.m2761("ܿۗ") + i4) * 47;
                        i = ((iM3169 ^ i3) * 24589) ^ 628530365;
                        i2 = 2603492;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1303986778:
                case 1545195726:
                    sArr = f65371;
                    if (C1146.m4231()) {
                        iM3169 = C0773.m3169("ۧܰ") ^ i4;
                        i = ((iM3169 ^ i3) * 32491) ^ 168852829;
                        i2 = -240576781;
                    } else {
                        iM3169 = C0773.m3169("ۡۤ") ^ i3;
                        i = ((iM3169 ^ i4) * 24191) ^ (-1480332132);
                        i2 = 1543263142;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1147285928:
                case 1898833725:
                    i11 = 6916900;
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0773.m3169("ۨ۟") ^ i4;
                        i = ((iM3169 ^ i3) * 13681) ^ (-2099135232);
                        i2 = 2041753408;
                    } else {
                        iM3169 = C0773.m3169("ۗ᩸") ^ i4;
                        i = ((iM3169 ^ i3) * (-6535)) ^ (-359938022);
                        i2 = 1197381255;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1126875211:
                case 135852939:
                    i12 = 41427;
                    iM3169 = C0773.m3169("۬ۨ") ^ i3;
                    i = ((iM3169 ^ i4) * 8217) ^ 433912875;
                    i2 = -979506262;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -797577686:
                case -3060220:
                    int i15 = i10 + i11;
                    if ((i15 + i15) - i9 >= 0) {
                        iM3169 = C0619.m2761("۠۬") ^ i3;
                        i = ((iM3169 ^ i4) * 31831) ^ (-1686236438);
                        i2 = 1947505047;
                    } else {
                        iM3169 = C0773.m3169("ۚܿ") ^ i4;
                        i = ((iM3169 ^ i3) * 4025) ^ (-1868414386);
                        i2 = -1623998974;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -715616068:
                case 1580427220:
                    s = sArr[c];
                    if (C2287.m7745() <= 0) {
                        iM3169 = C0773.m3169("۠᩷") ^ i4;
                        i = ((iM3169 ^ i3) * 5293) ^ 1967807492;
                        i2 = 528731376;
                    } else {
                        iM3169 = C0773.m3169("֡ܽ") ^ i3;
                        i = ((iM3169 ^ i4) * (-4813)) ^ (-637449397);
                        i2 = -1458630093;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -699840534:
                case 790764540:
                    RunnableC3055.m9933();
                    C3077.m10041();
                    break;
                case -573492234:
                case 714940630:
                    i8 = s + 2630;
                    if (C3734.m12152() >= 0) {
                        iM3169 = C0773.m3169("ۨ۟") ^ i4;
                        i = ((iM3169 ^ i3) * 13681) ^ (-2099135232);
                        i2 = 2041753408;
                    } else {
                        iM3169 = (C0619.m2761("۟᩺") + i4) * 29;
                        i = ((iM3169 ^ i3) * (-14889)) ^ 832585990;
                        i2 = -775731928;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -353986791:
                case -291904101:
                    if (AbstractC0641.f2496 < 0) {
                        iM3169 = C0773.m3169("ۡۤ") ^ i3;
                        i = ((iM3169 ^ i4) * 24191) ^ (-1480332132);
                        i2 = 1543263142;
                    } else {
                        iM3169 = C0619.m2761("ۢ֨") ^ i3;
                        i = ((iM3169 ^ i4) * (-14537)) ^ (-1963200356);
                        i2 = 1522441641;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -238524733:
                case 1044816475:
                    i9 = i8 * i8;
                    i10 = s * s;
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0773.m3169("۠᩷") ^ i4;
                        i = ((iM3169 ^ i3) * 5293) ^ 1967807492;
                        i2 = 528731376;
                    } else {
                        iM3169 = (C0619.m2761("᩻ۛ") ^ i3) * (-87);
                        i = ((iM3169 ^ i4) * (-26105)) ^ 850054462;
                        i2 = -214661511;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 13294050:
                case 200632119:
                    i12 = 28798;
                    iM3169 = C0773.m3169("۬ۨ") ^ i3;
                    i = ((iM3169 ^ i4) * 8217) ^ 433912875;
                    i2 = -979506262;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 374204115:
                case 1815050843:
                    strM8881 = C2702.m8881(sArr2, i13, 3, i12);
                    if (AbstractC3624.m11755() != 0) {
                        iM3169 = C0773.m3169("۠᩷") ^ i4;
                        i = ((iM3169 ^ i3) * 5293) ^ 1967807492;
                        i2 = 528731376;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۙۡ")) * 37;
                        i = ((iM3169 ^ i3) * 10879) ^ 1440404861;
                        i2 = 1124140676;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 601219612:
                case 1208689918:
                    C2287.m7745();
                    iM3169 = C0773.m3169("ۡۤ") ^ i3;
                    i = ((iM3169 ^ i4) * 24191) ^ (-1480332132);
                    i2 = 1543263142;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    c = 0;
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0773.m3169("ۨ۟") ^ i4;
                        i = ((iM3169 ^ i3) * 13681) ^ (-2099135232);
                        i2 = 2041753408;
                    } else {
                        iM3169 = (C0773.m3169("ۗ֡") + i3) * (-57);
                        i = ((iM3169 ^ i4) * 289) ^ 230588241;
                        i2 = 790162057;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    public C20391(ActivityC21137 activityC21137) {
        ArrayList arrayList = null;
        int i = 2032471723;
        int i2 = C3448.f11240;
        int i3 = C23916.f77426;
        this.f65372 = activityC21137;
        int iM3169 = (C0773.m3169("ۧ۬") + i2) * 79;
        int i4 = ((iM3169 ^ i3) * (-28203)) ^ 274602709;
        int i5 = -1631670509;
        while (true) {
            i = ((((i ^ i3) * (-21791)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1780409591:
                case 79944432:
                    AbstractC3624.m11755();
                    iM3169 = C0773.m3169("᩻᩶") ^ i2;
                    i4 = ((iM3169 ^ i3) * (-14537)) ^ 1112618749;
                    i5 = -2001957500;
                    break;
                case -1776346788:
                case -1233569657:
                    if (C3033.f9831 >= 0) {
                        iM3169 = C0773.m3169("᩺ۤ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-30843)) ^ (-1113822213);
                        i5 = 1042526924;
                    } else {
                        iM3169 = C0773.m3169("᩻᩶") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-14537)) ^ 1112618749;
                        i5 = -2001957500;
                    }
                    break;
                case -1614645993:
                case 586477648:
                    this.f65373 = arrayList;
                    return;
                case -1418588358:
                case 1347645072:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0773.m3169("᩻᩶") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-14537)) ^ 1112618749;
                        i5 = -2001957500;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ᩳۛ")) * 7;
                        i4 = ((iM3169 ^ i2) * (-7849)) ^ 414765584;
                        i5 = 1869182883;
                    }
                    break;
                case -1091991600:
                case 2067078745:
                    if (RunnableC1848.f6235) {
                        iM3169 = C0619.m2761("᩶۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-17329)) ^ 1942961952;
                        i5 = 1196570702;
                    } else {
                        iM3169 = C0773.m3169("ۛ᩸") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-24351)) ^ (-1650469753);
                        i5 = 1789973499;
                    }
                    break;
                case -1076154422:
                case 1397027980:
                    if (C4282.m13644()) {
                        iM3169 = (C0619.m2761("᩵ᩴ") + i2) * 37;
                        i4 = ((iM3169 ^ i3) * (-1863)) ^ (-1615878485);
                        i5 = -1659449162;
                    } else {
                        iM3169 = C0773.m3169("᩻᩶") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-14537)) ^ 1112618749;
                        i5 = -2001957500;
                    }
                    break;
                case -938889879:
                case 1042606301:
                    if (C2419.m8174() >= 0) {
                        iM3169 = C0619.m2761("۟۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-3567)) ^ (-1908284465);
                        i5 = 1198341204;
                    } else {
                        iM3169 = C0773.m3169("ۧۘ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-32217)) ^ (-1714266418);
                        i5 = -444008977;
                    }
                    break;
                case -917649268:
                case 834391798:
                    arrayList = new ArrayList();
                    if (C0269.f1558 <= 0) {
                        iM3169 = (C0773.m3169("ۛۜ") + i2) * 77;
                        i4 = ((iM3169 ^ i3) * (-5529)) ^ (-117835680);
                        i5 = 1746305692;
                    } else {
                        iM3169 = (C0773.m3169("۫۬") + i2) * (-31);
                        i4 = ((iM3169 ^ i3) * (-3551)) ^ (-2010961064);
                        i5 = -1513994370;
                    }
                    break;
                case -762319721:
                case -417367822:
                    if (C3779.f12953 <= 0) {
                        iM3169 = C0773.m3169("᩻᩶") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-14537)) ^ 1112618749;
                        i5 = -2001957500;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ܳ۫")) * (-69);
                        i4 = ((iM3169 ^ i3) * (-26695)) ^ 915181176;
                        i5 = 1517994855;
                    }
                    break;
                case -546604376:
                case 349965601:
                    if (C3077.m10041()) {
                        iM3169 = C0619.m2761("᩶۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-17329)) ^ 1942961952;
                        i5 = 1196570702;
                    } else {
                        iM3169 = (C0619.m2761("ۚۖ") ^ i2) * 19;
                        i4 = ((iM3169 ^ i3) * (-20993)) ^ (-1713376619);
                        i5 = -67125637;
                    }
                    break;
                case -395676090:
                case 2108838125:
                    if (RunnableC0334.f1808 > 0) {
                        iM3169 = C0619.m2761("۟۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-3567)) ^ (-1908284465);
                        i5 = 1198341204;
                    } else {
                        iM3169 = (C0773.m3169("ۛۜ") + i2) * 77;
                        i4 = ((iM3169 ^ i3) * (-5529)) ^ (-117835680);
                        i5 = 1746305692;
                    }
                    break;
                case -213263871:
                case 1028932685:
                    if (C1343.f4799 != 0) {
                        iM3169 = C0773.m3169("᩻᩶") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-14537)) ^ 1112618749;
                        i5 = -2001957500;
                    } else {
                        iM3169 = C0619.m2761("ܳ᩻") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-26311)) ^ (-1806170978);
                        i5 = -1156730494;
                    }
                    break;
                case 202810835:
                case 238317647:
                    if (C23916.f77426 <= 0) {
                        iM3169 = (C0773.m3169("ۛۜ") + i2) * 77;
                        i4 = ((iM3169 ^ i3) * (-5529)) ^ (-117835680);
                        i5 = 1746305692;
                    } else {
                        iM3169 = (C0619.m2761("᩸ᩴ") ^ i3) * (-105);
                        i4 = ((iM3169 ^ i2) * 32007) ^ 1319006597;
                        i5 = 144442129;
                    }
                    break;
                case 1571175245:
                case 2106504239:
                    if (!C3077.f9998) {
                        iM3169 = C0773.m3169("᩺ۤ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-30843)) ^ (-1113822213);
                        i5 = 1042526924;
                    } else {
                        iM3169 = (C0773.m3169("ۛۜ") + i2) * 77;
                        i4 = ((iM3169 ^ i3) * (-5529)) ^ (-117835680);
                        i5 = 1746305692;
                    }
                    break;
                case 1594813305:
                case 1625718393:
                    C1080.m4050();
                    C0487.m2356();
                    throw new RuntimeException();
                default:
                    if (C2702.m8876()) {
                        iM3169 = (C0619.m2761("ܶ᩻") ^ i3) * 93;
                        i4 = ((iM3169 ^ i2) * (-19029)) ^ (-1081552212);
                        i5 = 1178626615;
                    } else {
                        iM3169 = C0619.m2761("᩶۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-17329)) ^ 1942961952;
                        i5 = 1196570702;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x047c A[PHI: r3 r17 r18
      0x047c: PHI (r3v22 l.᩻ܽܺ) = (r3v6 l.᩻ܽܺ), (r3v21 l.᩻ܽܺ), (r3v23 l.᩻ܽܺ) binds: [B:23:0x009b, B:124:0x047a, B:120:0x045a] A[DONT_GENERATE, DONT_INLINE]
      0x047c: PHI (r17v36 java.util.concurrent.atomic.AtomicInteger) = 
      (r17v8 java.util.concurrent.atomic.AtomicInteger)
      (r17v35 java.util.concurrent.atomic.AtomicInteger)
      (r17v37 java.util.concurrent.atomic.AtomicInteger)
     binds: [B:23:0x009b, B:124:0x047a, B:120:0x045a] A[DONT_GENERATE, DONT_INLINE]
      0x047c: PHI (r18v29 java.util.ArrayList) = (r18v8 java.util.ArrayList), (r18v28 java.util.ArrayList), (r18v30 java.util.ArrayList) binds: [B:23:0x009b, B:124:0x047a, B:120:0x045a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws Throwable {
        int iM3169;
        int i;
        int i2;
        int iM31610;
        int i3;
        int i4;
        int iM31611;
        int i5;
        int i6 = C3690.f12684;
        int i7 = C1519.f5300;
        int iM31612 = (i6 - C0773.m3169("ۜ᩻")) * (-95);
        int i8 = ((iM31612 ^ i7) * (-8723)) ^ (-1176691594);
        ActivityC21137 activityC21137 = null;
        Object obj = null;
        Iterator it = null;
        int i9 = iM31612 ^ (-1813257310);
        ArrayList arrayList = null;
        final AtomicInteger atomicInteger = null;
        HashMap map = null;
        int iM7752 = 0;
        int i10 = 0;
        boolean zM12923 = false;
        int i11 = -615729975;
        C25179 c25179 = null;
        Throwable th = null;
        int i12 = 0;
        while (true) {
            i11 = i9 ^ (i8 & (((i11 ^ i7) * (-17703)) >> 31));
            switch (i11) {
                case -2100247480:
                case 1628076093:
                    atomicInteger = atomicInteger;
                    c25179 = c25179;
                    arrayList = arrayList;
                    if (C3690.f12684 <= 0) {
                        iM3169 = C0619.m2761("᩻ܳ") ^ i7;
                        i = ((iM3169 ^ i6) * 1487) ^ (-1798029833);
                        i2 = -635976979;
                    } else {
                        iM3169 = (C0773.m3169("ܿᩳ") ^ i7) * (-97);
                        i = ((iM3169 ^ i6) * (-31673)) ^ 412689759;
                        i2 = -1578478976;
                    }
                    AtomicInteger atomicInteger2 = atomicInteger;
                    i9 = iM3169 ^ i2;
                    i8 = i;
                    arrayList = arrayList;
                    c25179 = c25179;
                    atomicInteger = atomicInteger2;
                    break;
                case -2039478203:
                case 565068141:
                    if (zM12923) {
                        iM31610 = C0619.m2761("ۚ᩷") ^ i7;
                        i3 = ((iM31610 ^ i6) * (-13863)) ^ 1147481417;
                        i4 = -274409914;
                    } else {
                        iM31610 = C0773.m3169("ۘ۠") ^ i6;
                        i3 = ((iM31610 ^ i7) * 529) ^ 654763769;
                        i4 = 1310371318;
                    }
                    i9 = iM31610 ^ i4;
                    i8 = i3;
                    break;
                case -1995956247:
                case -724009282:
                    C0773.m3160(c25179);
                    return;
                case -1832719230:
                case -147210451:
                    AbstractC0116.m1243();
                    if (C4282.f15546 > 0) {
                        atomicInteger = atomicInteger;
                        c25179 = c25179;
                        arrayList = arrayList;
                        iM3169 = (C0619.m2761("ۘۚ") ^ i6) * 33;
                        i = ((iM3169 ^ i7) * 19535) ^ 1600632899;
                        i2 = -1281490036;
                        AtomicInteger atomicInteger3 = atomicInteger;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                        arrayList = arrayList;
                        c25179 = c25179;
                        atomicInteger = atomicInteger3;
                    } else {
                        iM31610 = C0619.m2761("ܰۙ") ^ i7;
                        i3 = ((iM31610 ^ i6) * (-25553)) ^ (-1844454604);
                        i4 = -453497563;
                        i9 = iM31610 ^ i4;
                        i8 = i3;
                    }
                    break;
                case -1813205541:
                case -16722468:
                    atomicInteger = atomicInteger;
                    c25179 = c25179;
                    arrayList = arrayList;
                    if (C2966.f9654 < 0) {
                        iM3169 = (i6 - C0773.m3169("ۢۧ")) * 27;
                        i = ((iM3169 ^ i7) * (-8253)) ^ (-955742450);
                        i2 = 199686171;
                        AtomicInteger atomicInteger4 = atomicInteger;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                        arrayList = arrayList;
                        c25179 = c25179;
                        atomicInteger = atomicInteger4;
                    } else {
                        arrayList = arrayList;
                        iM31611 = C0773.m3169("۠᩷") ^ i6;
                        i3 = ((iM31611 ^ i7) * (-13885)) ^ 1932749731;
                        i5 = -1612153165;
                        int i13 = iM31611 ^ i5;
                        c25179 = c25179;
                        atomicInteger = atomicInteger;
                        i9 = i13;
                        i8 = i3;
                    }
                    break;
                case -1759904435:
                case 769241573:
                    atomicInteger = atomicInteger;
                    c25179 = c25179;
                    arrayList = arrayList;
                    activityC21137 = this.f65372;
                    if (C2702.m8876()) {
                        iM3169 = C0773.m3169("۫᩷") ^ i7;
                        i = ((iM3169 ^ i6) * (-9623)) ^ (-1487804299);
                        i2 = 921968562;
                    } else {
                        iM3169 = (C0619.m2761("ۢ᩷") + i6) * 75;
                        i = ((iM3169 ^ i7) * (-30941)) ^ 504596642;
                        i2 = -375881921;
                    }
                    AtomicInteger atomicInteger5 = atomicInteger;
                    i9 = iM3169 ^ i2;
                    i8 = i;
                    arrayList = arrayList;
                    c25179 = c25179;
                    atomicInteger = atomicInteger5;
                    break;
                case -1743645256:
                case -1493380558:
                    if (RunnableC1848.f6235) {
                        iM31610 = C0619.m2761("ܰۙ") ^ i7;
                        i3 = ((iM31610 ^ i6) * (-25553)) ^ (-1844454604);
                        i4 = -453497563;
                    } else {
                        iM31610 = (i7 - C0773.m3169("ۘܺ")) * (-77);
                        i3 = ((iM31610 ^ i6) * (-3685)) ^ (-270082188);
                        i4 = 1765108587;
                    }
                    i9 = iM31610 ^ i4;
                    i8 = i3;
                    break;
                case -1609708773:
                case -438000873:
                    atomicInteger = atomicInteger;
                    c25179 = c25179;
                    arrayList = arrayList;
                    if (C1343.m4943()) {
                        iM3169 = C0619.m2761("۠ܳ") ^ i6;
                        i = ((iM3169 ^ i7) * (-15931)) ^ (-2045029779);
                        i2 = -1764257841;
                    } else {
                        iM3169 = (i6 - C0619.m2761("ۤܰ")) * 65;
                        i = ((iM3169 ^ i7) * 17139) ^ (-1486008146);
                        i2 = -1542523376;
                    }
                    AtomicInteger atomicInteger6 = atomicInteger;
                    i9 = iM3169 ^ i2;
                    i8 = i;
                    arrayList = arrayList;
                    c25179 = c25179;
                    atomicInteger = atomicInteger6;
                    break;
                case -1592012732:
                case -1540267585:
                    if (C1321.f4751 >= 0) {
                        iM31610 = (C0773.m3169("᩷۠") ^ i7) * (-65);
                        i3 = ((iM31610 ^ i6) * 9881) ^ 713233141;
                        i4 = -740975736;
                        i9 = iM31610 ^ i4;
                        i8 = i3;
                    } else {
                        atomicInteger = atomicInteger;
                        c25179 = c25179;
                        arrayList = arrayList;
                        iM3169 = (C0619.m2761("ۘۚ") ^ i6) * 33;
                        i = ((iM3169 ^ i7) * 19535) ^ 1600632899;
                        i2 = -1281490036;
                        AtomicInteger atomicInteger7 = atomicInteger;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                        arrayList = arrayList;
                        c25179 = c25179;
                        atomicInteger = atomicInteger7;
                    }
                    break;
                case -1522714011:
                case -1199291609:
                    throw th;
                case -1474030852:
                case -177580371:
                    atomicInteger = atomicInteger;
                    c25179 = c25179;
                    arrayList = arrayList;
                    if (C17202.m40372()) {
                        iM3169 = C0773.m3169("֡۠") ^ i7;
                        i = ((iM3169 ^ i6) * 29337) ^ 2127071400;
                        i2 = 1214765101;
                    } else {
                        iM3169 = (C0619.m2761("᩷ۢ") ^ i6) * (-29);
                        i = ((iM3169 ^ i7) * 28341) ^ (-1720153084);
                        i2 = -567411472;
                    }
                    AtomicInteger atomicInteger8 = atomicInteger;
                    i9 = iM3169 ^ i2;
                    i8 = i;
                    arrayList = arrayList;
                    c25179 = c25179;
                    atomicInteger = atomicInteger8;
                    break;
                case -1472247083:
                case 570069790:
                    atomicInteger = atomicInteger;
                    c25179 = c25179;
                    arrayList = arrayList;
                    if (C1321.f4751 >= 0) {
                        iM3169 = (C0619.m2761("ۘۚ") ^ i6) * 33;
                        i = ((iM3169 ^ i7) * 19535) ^ 1600632899;
                        i2 = -1281490036;
                    } else {
                        iM3169 = (i6 - C0773.m3169("۠᩶")) * (-75);
                        i = ((iM3169 ^ i7) * (-20967)) ^ (-1221298647);
                        i2 = 1793501893;
                    }
                    AtomicInteger atomicInteger9 = atomicInteger;
                    i9 = iM3169 ^ i2;
                    i8 = i;
                    arrayList = arrayList;
                    c25179 = c25179;
                    atomicInteger = atomicInteger9;
                    break;
                case -1468640830:
                case 478257918:
                    atomicInteger = atomicInteger;
                    c25179 = c25179;
                    arrayList = arrayList;
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0619.m2761("᩻ܳ") ^ i7;
                        i = ((iM3169 ^ i6) * 1487) ^ (-1798029833);
                        i2 = -635976979;
                    } else {
                        iM3169 = (C0773.m3169("ۖ᩹") + i6) * 93;
                        i = ((iM3169 ^ i7) * (-5317)) ^ 1371356173;
                        i2 = -1077992982;
                    }
                    AtomicInteger atomicInteger10 = atomicInteger;
                    i9 = iM3169 ^ i2;
                    i8 = i;
                    arrayList = arrayList;
                    c25179 = c25179;
                    atomicInteger = atomicInteger10;
                    break;
                case -1448207552:
                case 467520546:
                    atomicInteger = atomicInteger;
                    c25179 = c25179;
                    try {
                        C0619.m2765(c25179);
                        iM31611 = (i7 - C0773.m3169("ۢۖ")) * 43;
                        i3 = ((iM31611 ^ i6) * (-9955)) ^ 934971575;
                        i5 = 790628284;
                        int i14 = iM31611 ^ i5;
                        c25179 = c25179;
                        atomicInteger = atomicInteger;
                        i9 = i14;
                        i8 = i3;
                    } catch (Throwable th2) {
                        int iM31613 = (i7 - C0773.m3169("ۛ֫")) * 61;
                        c25179 = c25179;
                        atomicInteger = atomicInteger;
                        i9 = iM31613 ^ 32965840;
                        obj = th2;
                        i8 = ((iM31613 ^ i6) * (-6071)) ^ (-743445282);
                    }
                    break;
                case -1398119713:
                case 819636388:
                    try {
                        final String str = (String) C4238.m13529(it);
                        ((C14763) ((C11636) C11392.computeIfAbsent(map, str, new Function() { // from class: l.ۗۜۤ

                            /* JADX INFO: renamed from: ܽ᩷᩸, reason: not valid java name and contains not printable characters */
                            private static final short[] f10546 = {7584, 3319, 3280, 3286, 3277, 3274, 3267, 3204};

                            @Override // java.util.function.Function
                            /* JADX INFO: renamed from: andThen */
                            public /* synthetic */ Function mo10608andThen(Function function) {
                                return C24247.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public /* synthetic */ Function compose(Function function) {
                                return C24247.$default$compose(this, function);
                            }

                            {
                                int i15 = 668731973;
                                int i16 = C2288.f7433;
                                int i17 = C1783.f6087;
                                int iM31614 = C0773.m3169("᩵ܿ") ^ i16;
                                int i18 = ((iM31614 ^ i17) * 21841) ^ 963519971;
                                int i19 = -1525152199;
                                while (true) {
                                    i15 = ((((i15 ^ i17) * 20171) >> 31) & i18) ^ (iM31614 ^ i19);
                                    switch (i15) {
                                        case -2045482756:
                                        case -951510514:
                                            if (C2878.f9462) {
                                                iM31614 = C0773.m3169("᩻ۢ") ^ i16;
                                                i18 = ((iM31614 ^ i17) * (-28343)) ^ 1065096982;
                                                i19 = -1047679325;
                                            } else {
                                                iM31614 = C0619.m2761("ܶ᩷") ^ i17;
                                                i18 = ((iM31614 ^ i16) * (-21393)) ^ (-690064492);
                                                i19 = 1898766936;
                                            }
                                            break;
                                        case -1969340814:
                                        case -887253288:
                                            if (C1080.f3865 >= 0) {
                                                iM31614 = (i16 - C0619.m2761("ۘܺ")) * 61;
                                                i18 = ((iM31614 ^ i17) * (-19683)) ^ 787006439;
                                                i19 = -1466237405;
                                            } else {
                                                iM31614 = (C0619.m2761("᩶ܰ") ^ i17) * 97;
                                                i18 = ((iM31614 ^ i16) * 1939) ^ (-234890240);
                                                i19 = -506827751;
                                            }
                                            break;
                                        case -1545817543:
                                        case 463733475:
                                            AbstractC3624.m11755();
                                            if (!C3492.m11488()) {
                                                iM31614 = C0773.m3169("۫ܳ") ^ i17;
                                                i18 = ((iM31614 ^ i16) * (-25807)) ^ 645205531;
                                                i19 = 1943025102;
                                            } else {
                                                iM31614 = (i16 - C0619.m2761("ۘܺ")) * 61;
                                                i18 = ((iM31614 ^ i17) * (-19683)) ^ 787006439;
                                                i19 = -1466237405;
                                            }
                                            break;
                                        case -1287955669:
                                        case 1329643858:
                                            if (C3998.f13671 != 0) {
                                                iM31614 = C0773.m3169("ۡܺ") ^ i17;
                                                i18 = ((iM31614 ^ i16) * (-10735)) ^ 584902089;
                                                i19 = -881888398;
                                            } else {
                                                iM31614 = C0773.m3169("֨ܺ") ^ i16;
                                                i18 = ((iM31614 ^ i17) * 15937) ^ 1942060243;
                                                i19 = -1454438633;
                                            }
                                            break;
                                        case -1003861023:
                                        case 1053800699:
                                            return;
                                        case -976886548:
                                        case -827404418:
                                            C4282.m13644();
                                            iM31614 = C0773.m3169("۫ܳ") ^ i17;
                                            i18 = ((iM31614 ^ i16) * (-25807)) ^ 645205531;
                                            i19 = 1943025102;
                                            break;
                                        case -606133243:
                                        case -219415982:
                                            if (C1826.f6190 <= 0) {
                                                iM31614 = C0619.m2761("ۙۢ") ^ i17;
                                                i18 = ((iM31614 ^ i16) * (-19989)) ^ 1229358760;
                                                i19 = 1575871265;
                                            } else {
                                                iM31614 = (C0619.m2761("ܿ᩺") ^ i16) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                i18 = ((iM31614 ^ i17) * (-26677)) ^ (-237814086);
                                                i19 = -1124051209;
                                            }
                                            break;
                                        case -316252399:
                                        case 750031295:
                                            if (C23916.m53419() != 0) {
                                                iM31614 = C0773.m3169("ۡܺ") ^ i17;
                                                i18 = ((iM31614 ^ i16) * (-10735)) ^ 584902089;
                                                i19 = -881888398;
                                            } else {
                                                iM31614 = C0619.m2761("ۢ᩺") ^ i17;
                                                i18 = ((iM31614 ^ i16) * 8247) ^ (-1425026590);
                                                i19 = -1193313156;
                                            }
                                            break;
                                        case -164840569:
                                        case 1735278137:
                                            if (C13473.f42873 != 0) {
                                                iM31614 = C0773.m3169("ۡܺ") ^ i17;
                                                i18 = ((iM31614 ^ i16) * (-10735)) ^ 584902089;
                                                i19 = -881888398;
                                            } else {
                                                iM31614 = (i17 - C0773.m3169("۫ۖ")) * (-47);
                                                i18 = ((iM31614 ^ i16) * 21837) ^ (-1518480368);
                                                i19 = 474397591;
                                            }
                                            break;
                                        case -163474886:
                                        case 281135400:
                                            if (C1146.f4234 >= 0) {
                                                iM31614 = (i16 - C0619.m2761("ۘܺ")) * 61;
                                                i18 = ((iM31614 ^ i17) * (-19683)) ^ 787006439;
                                                i19 = -1466237405;
                                            } else {
                                                iM31614 = C0619.m2761("ۨۜ") ^ i17;
                                                i18 = ((iM31614 ^ i16) * 29839) ^ (-1696838993);
                                                i19 = 760908603;
                                            }
                                            break;
                                        case -12834027:
                                        case 533099158:
                                            if (C0269.m1775() <= 0) {
                                                iM31614 = C0619.m2761("ۙۢ") ^ i17;
                                                i18 = ((iM31614 ^ i16) * (-19989)) ^ 1229358760;
                                                i19 = 1575871265;
                                            } else {
                                                iM31614 = (C0619.m2761("ۛܿ") ^ i16) * 15;
                                                i18 = ((iM31614 ^ i17) * (-24383)) ^ 520380115;
                                                i19 = 882728653;
                                            }
                                            break;
                                        case 400118270:
                                        case 815265536:
                                            if (C3779.f12953 <= 0) {
                                                iM31614 = C0773.m3169("ۡܺ") ^ i17;
                                                i18 = ((iM31614 ^ i16) * (-10735)) ^ 584902089;
                                                i19 = -881888398;
                                            } else {
                                                iM31614 = C0773.m3169("᩻ۢ") ^ i16;
                                                i18 = ((iM31614 ^ i17) * (-28343)) ^ 1065096982;
                                                i19 = -1047679325;
                                            }
                                            break;
                                        case 971276688:
                                        case 1546681112:
                                            C3492.m11488();
                                            throw new RuntimeException();
                                        case 991457711:
                                        case 1015451533:
                                            if (C0950.f3488 >= 0) {
                                                iM31614 = C0773.m3169("ۡܺ") ^ i17;
                                                i18 = ((iM31614 ^ i16) * (-10735)) ^ 584902089;
                                                i19 = -881888398;
                                            } else {
                                                iM31614 = (C0619.m2761("۬᩸") + i16) * 63;
                                                i18 = ((iM31614 ^ i17) * 1297) ^ (-1648552632);
                                                i19 = -2125964548;
                                            }
                                            break;
                                        case 1333332882:
                                        case 2093979404:
                                            if (C1542.f5343 <= 0) {
                                                iM31614 = C0619.m2761("ۙۢ") ^ i17;
                                                i18 = ((iM31614 ^ i16) * (-19989)) ^ 1229358760;
                                                i19 = 1575871265;
                                            } else {
                                                iM31614 = (i16 - C0619.m2761("᩶ۛ")) * 61;
                                                i18 = ((iM31614 ^ i17) * 30461) ^ 298889560;
                                                i19 = -2115496375;
                                            }
                                            break;
                                        default:
                                            C1146.m4231();
                                            if (!RunnableC0334.m2063()) {
                                                iM31614 = C0773.m3169("᩻ۢ") ^ i16;
                                                i18 = ((iM31614 ^ i17) * (-28343)) ^ 1065096982;
                                                i19 = -1047679325;
                                            } else {
                                                iM31614 = (i16 - C0619.m2761("ۘܺ")) * 61;
                                                i18 = ((iM31614 ^ i17) * (-19683)) ^ 787006439;
                                                i19 = -1466237405;
                                            }
                                            break;
                                    }
                                }
                            }

                            /* JADX WARN: Code duplicated, block: B:32:0x00d1 A[PHI: r13 r14
                              0x00d1: PHI (r13v4 short[]) = (r13v3 short[]), (r13v2 short[]) binds: [B:31:0x00cf, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]
                              0x00d1: PHI (r14v4 int) = (r14v3 int), (r14v2 int) binds: [B:31:0x00cf, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Code duplicated, block: B:47:0x0183 A[PHI: r9 r10 r11
                              0x0183: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:46:0x0181, B:14:0x0064, B:12:0x0060, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]
                              0x0183: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:46:0x0181, B:14:0x0064, B:12:0x0060, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]
                              0x0183: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:46:0x0181, B:14:0x0064, B:12:0x0060, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Code duplicated, block: B:51:0x01b6 A[PHI: r3 r7 r8
                              0x01b6: PHI (r3v2 l.ۧ۬ۤ) = (r3v1 l.ۧ۬ۤ), (r3v1 l.ۧ۬ۤ), (r3v9 l.ۧ۬ۤ) binds: [B:50:0x01b4, B:6:0x004e, B:23:0x008a] A[DONT_GENERATE, DONT_INLINE]
                              0x01b6: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:50:0x01b4, B:6:0x004e, B:23:0x008a] A[DONT_GENERATE, DONT_INLINE]
                              0x01b6: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:50:0x01b4, B:6:0x004e, B:23:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Code duplicated, block: B:59:0x0203 A[PHI: r6 r20
                              0x0203: PHI (r6v4 char) = (r6v2 char), (r6v3 char), (r6v2 char), (r6v2 char) binds: [B:58:0x0201, B:54:0x01e5, B:12:0x0060, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
                              0x0203: PHI (r20v3 short[]) = (r20v2 short[]), (r20v1 short[]), (r20v1 short[]), (r20v1 short[]) binds: [B:58:0x0201, B:54:0x01e5, B:12:0x0060, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                int iM31614;
                                int i15;
                                int i16;
                                int i17 = C1826.f6190;
                                int i18 = C4282.f15546;
                                int iM31615 = C0773.m3169("ۛ֡") ^ i18;
                                int i19 = ((iM31615 ^ i17) * (-13001)) ^ 847134631;
                                short[] sArr = null;
                                short[] sArr2 = null;
                                int i20 = iM31615 ^ (-926617151);
                                C11636 c11636 = null;
                                char c = 0;
                                short s = 0;
                                int i21 = 0;
                                int i22 = 0;
                                int i23 = 0;
                                int i24 = 0;
                                int i25 = 0;
                                int i26 = 0;
                                int i27 = 1893156082;
                                String strM7981 = null;
                                int iM9485 = 0;
                                while (true) {
                                    i27 = i20 ^ (i19 & (((i27 ^ i17) * 12855) >> 31));
                                    switch (i27) {
                                        case -1991970445:
                                        case 11894481:
                                            i25 = 12324;
                                            iM31614 = C0773.m3169("۟ۢ") ^ i18;
                                            i15 = ((iM31614 ^ i17) * 9653) ^ (-941168188);
                                            i16 = 1942152170;
                                            i20 = iM31614 ^ i16;
                                            i19 = i15;
                                            break;
                                        case -1916256271:
                                        case -1167156369:
                                            sArr = f10546;
                                            if (C1519.f5300 >= 0) {
                                                iM31614 = (C0773.m3169("᩵᩹") ^ i17) * (-39);
                                                i15 = ((iM31614 ^ i18) * 18641) ^ 150738559;
                                                i16 = -1985836843;
                                            } else {
                                                iM31614 = (C0773.m3169("᩺ۢ") + i18) * (-99);
                                                i15 = ((iM31614 ^ i17) * (-9147)) ^ (-1646076982);
                                                i16 = 362818298;
                                            }
                                            i20 = iM31614 ^ i16;
                                            i19 = i15;
                                            break;
                                        case -1886941703:
                                        case 1147603662:
                                            i25 = 3236;
                                            iM31614 = C0773.m3169("۟ۢ") ^ i18;
                                            i15 = ((iM31614 ^ i17) * 9653) ^ (-941168188);
                                            i16 = 1942152170;
                                            i20 = iM31614 ^ i16;
                                            i19 = i15;
                                            break;
                                        case -1545705532:
                                        case 1933806961:
                                            C1542.m5459();
                                            if (C1519.f5300 >= 0) {
                                                iM31614 = C0773.m3169("ۚۡ") ^ i18;
                                                i15 = ((iM31614 ^ i17) * (-31393)) ^ (-904805858);
                                                i16 = 1386451689;
                                            } else {
                                                iM31614 = (C0773.m3169("᩵᩹") ^ i17) * (-39);
                                                i15 = ((iM31614 ^ i18) * 18641) ^ 150738559;
                                                i16 = -1985836843;
                                            }
                                            i20 = iM31614 ^ i16;
                                            i19 = i15;
                                            break;
                                        case -1438669688:
                                        case -737493520:
                                            C1080.m4050();
                                            if (C1343.f4799 == 0) {
                                                iM31614 = C0773.m3169("ۚۡ") ^ i18;
                                                i15 = ((iM31614 ^ i17) * (-31393)) ^ (-904805858);
                                                i16 = 1386451689;
                                            } else {
                                                iM31614 = C0619.m2761("ܳܿ") ^ i18;
                                                i15 = ((iM31614 ^ i17) * 25459) ^ (-901704625);
                                                i16 = 1474352136;
                                            }
                                            i20 = iM31614 ^ i16;
                                            i19 = i15;
                                            break;
                                        case -1429894177:
                                        case -1022442417:
                                            strM7981 = C2354.m7981(iM9485, C2287.m7749(sArr2, i26, 7, i25));
                                            if (C4282.f15546 > 0) {
                                                iM31614 = C0773.m3169("ۧ֨") ^ i17;
                                                i15 = ((iM31614 ^ i18) * 10029) ^ (-117106780);
                                                i16 = -1431638534;
                                                i20 = iM31614 ^ i16;
                                                i19 = i15;
                                            } else {
                                                int iM2761 = C0619.m2761("ۘܿ") ^ i18;
                                                i20 = iM2761 ^ (-2124459544);
                                                i19 = ((iM2761 ^ i17) * 9475) ^ 1236261630;
                                                c11636 = null;
                                            }
                                            break;
                                        case -1310219890:
                                        case 1979774651:
                                            RunnableC0334.m2063();
                                            RunnableC3646.m11813();
                                            return null;
                                        case -959634925:
                                        case 340134687:
                                            c = 0;
                                            if (C1519.f5300 >= 0) {
                                                iM31614 = (C0773.m3169("᩵᩹") ^ i17) * (-39);
                                                i15 = ((iM31614 ^ i18) * 18641) ^ 150738559;
                                                i16 = -1985836843;
                                            } else {
                                                iM31614 = C0619.m2761("ܺܶ") ^ i18;
                                                i15 = ((iM31614 ^ i17) * 6981) ^ (-45623323);
                                                i16 = 763390576;
                                            }
                                            i20 = iM31614 ^ i16;
                                            i19 = i15;
                                            break;
                                        case -833681988:
                                        case 887155855:
                                            String str2 = str;
                                            if (!C0619.f2439) {
                                                c11636 = new C11636(str2, iM9485, strM7981, false);
                                                if (AbstractC0116.f1064 <= 0) {
                                                    iM31614 = (C0773.m3169("ۛ᩶") + i17) * 15;
                                                    i15 = ((iM31614 ^ i18) * 3293) ^ 1218810983;
                                                    i16 = 1128509366;
                                                } else {
                                                    iM31614 = C0619.m2761("ܶܳ") ^ i18;
                                                    i15 = ((iM31614 ^ i17) * (-9729)) ^ 453659842;
                                                    i16 = 1960678807;
                                                }
                                                i20 = iM31614 ^ i16;
                                                i19 = i15;
                                            } else {
                                                int iM2762 = C0619.m2761("ۘܿ") ^ i18;
                                                i20 = iM2762 ^ (-2124459544);
                                                i19 = ((iM2762 ^ i17) * 9475) ^ 1236261630;
                                                c11636 = null;
                                            }
                                            break;
                                        case -328755982:
                                        case 365543641:
                                            if (C2023.m6964() > 0) {
                                                iM31614 = C0773.m3169("ܺ᩵") ^ i17;
                                                i15 = ((iM31614 ^ i18) * (-17101)) ^ 1789224661;
                                                i16 = -561294605;
                                                i20 = iM31614 ^ i16;
                                                i19 = i15;
                                            } else {
                                                int iM2763 = C0619.m2761("ۘܿ") ^ i18;
                                                i20 = iM2763 ^ (-2124459544);
                                                i19 = ((iM2763 ^ i17) * 9475) ^ 1236261630;
                                                c11636 = null;
                                            }
                                            break;
                                        case -10528739:
                                        case 1563654930:
                                            i22 = i21 * i21;
                                            i23 = s * s;
                                            i24 = 80658361;
                                            if (RunnableC3646.f12471) {
                                                iM31614 = C0773.m3169("ۚۡ") ^ i18;
                                                i15 = ((iM31614 ^ i17) * (-31393)) ^ (-904805858);
                                                i16 = 1386451689;
                                            } else {
                                                iM31614 = C0773.m3169("ۡۤ") ^ i17;
                                                i15 = ((iM31614 ^ i18) * 30675) ^ (-1992017819);
                                                i16 = 1885171598;
                                            }
                                            i20 = iM31614 ^ i16;
                                            i19 = i15;
                                            break;
                                        case 8739660:
                                        case 1350487103:
                                            c11636.m29227(new C14763());
                                            return c11636;
                                        case 153301593:
                                        case 876424506:
                                            s = sArr[c];
                                            i21 = s + 8981;
                                            if (C2966.f9654 >= 0) {
                                                iM31614 = (C0773.m3169("ۛ᩶") + i17) * 15;
                                                i15 = ((iM31614 ^ i18) * 3293) ^ 1218810983;
                                                i16 = 1128509366;
                                            } else {
                                                iM31614 = C0619.m2761("ܺᩳ") ^ i17;
                                                i15 = ((iM31614 ^ i18) * (-19707)) ^ (-1378573640);
                                                i16 = 970371724;
                                            }
                                            i20 = iM31614 ^ i16;
                                            i19 = i15;
                                            break;
                                        case 215378653:
                                        case 1466009372:
                                            iM9485 = C2878.m9485(atomicInteger);
                                            if (C2834.f9334 > 0) {
                                                iM31614 = (C0773.m3169("֡ۗ") ^ i18) * 47;
                                                i15 = ((iM31614 ^ i17) * 3147) ^ 1857433413;
                                                i16 = -788510832;
                                                i20 = iM31614 ^ i16;
                                                i19 = i15;
                                            } else {
                                                int iM2764 = C0619.m2761("ۘܿ") ^ i18;
                                                i20 = iM2764 ^ (-2124459544);
                                                i19 = ((iM2764 ^ i17) * 9475) ^ 1236261630;
                                                c11636 = null;
                                            }
                                            break;
                                        case 347635786:
                                        case 880376684:
                                            int i28 = i23 + i24;
                                            if ((i28 + i28) - i22 < 0) {
                                                iM31614 = (C0773.m3169("ۧ۫") + i17) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                                i15 = ((iM31614 ^ i18) * 16757) ^ (-1622921798);
                                                i16 = -1742356612;
                                            } else {
                                                iM31614 = (i18 - C0773.m3169("۫֨")) * (-117);
                                                i15 = ((iM31614 ^ i17) * 29101) ^ 1923741780;
                                                i16 = -838219439;
                                            }
                                            i20 = iM31614 ^ i16;
                                            i19 = i15;
                                            break;
                                        case 692085278:
                                        case 2025979487:
                                            C2485.m8357();
                                            iM31614 = C0773.m3169("ۚۡ") ^ i18;
                                            i15 = ((iM31614 ^ i17) * (-31393)) ^ (-904805858);
                                            i16 = 1386451689;
                                            i20 = iM31614 ^ i16;
                                            i19 = i15;
                                            break;
                                        case 1444081238:
                                        case 1760470493:
                                            sArr2 = f10546;
                                            i26 = 1;
                                            if (C3077.m10041()) {
                                                iM31614 = C0619.m2761("ܳܿ") ^ i18;
                                                i15 = ((iM31614 ^ i17) * 25459) ^ (-901704625);
                                                i16 = 1474352136;
                                            } else {
                                                iM31614 = C0619.m2761("ۘۛ") ^ i17;
                                                i15 = ((iM31614 ^ i18) * (-5039)) ^ (-1096175407);
                                                i16 = -1477759829;
                                            }
                                            i20 = iM31614 ^ i16;
                                            i19 = i15;
                                            break;
                                        default:
                                            C3779.m12264();
                                            if (C3734.f12817 < 0) {
                                                iM31614 = (C0773.m3169("᩵᩹") ^ i17) * (-39);
                                                i15 = ((iM31614 ^ i18) * 18641) ^ 150738559;
                                                i16 = -1985836843;
                                            } else {
                                                iM31614 = (C0773.m3169("ۛ᩶") + i17) * 15;
                                                i15 = ((iM31614 ^ i18) * 3293) ^ 1218810983;
                                                i16 = 1128509366;
                                            }
                                            i20 = iM31614 ^ i16;
                                            i19 = i15;
                                            break;
                                    }
                                }
                            }
                        })).m29224()).add(i10);
                        atomicInteger = atomicInteger;
                        c25179 = c25179;
                        iM31611 = (C0619.m2761("ۤۛ") + i6) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i3 = ((iM31611 ^ i7) * (-21333)) ^ 418148935;
                        i5 = 1439205693;
                        int i15 = iM31611 ^ i5;
                        c25179 = c25179;
                        atomicInteger = atomicInteger;
                        i9 = i15;
                        i8 = i3;
                    } catch (Throwable th3) {
                        th = th3;
                        atomicInteger = atomicInteger;
                        c25179 = c25179;
                        iM3169 = (C0619.m2761("ۨܶ") ^ i6) * (-125);
                        i = ((iM3169 ^ i7) * (-18947)) ^ (-1694436477);
                        i2 = -358439222;
                        AtomicInteger atomicInteger11 = atomicInteger;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                        arrayList = arrayList;
                        c25179 = c25179;
                        atomicInteger = atomicInteger11;
                    }
                    break;
                case -1375341844:
                case -29497531:
                    C2834.m9344();
                    if (C1080.f3865 >= 0) {
                        atomicInteger = atomicInteger;
                        c25179 = c25179;
                        arrayList = arrayList;
                        iM3169 = (C0619.m2761("᩷ۢ") ^ i6) * (-29);
                        i = ((iM3169 ^ i7) * 28341) ^ (-1720153084);
                        i2 = -567411472;
                        AtomicInteger atomicInteger12 = atomicInteger;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                        arrayList = arrayList;
                        c25179 = c25179;
                        atomicInteger = atomicInteger12;
                    } else {
                        atomicInteger = atomicInteger;
                        c25179 = c25179;
                        iM31611 = C0773.m3169("۠᩷") ^ i6;
                        i3 = ((iM31611 ^ i7) * (-13885)) ^ 1932749731;
                        i5 = -1612153165;
                        int i16 = iM31611 ^ i5;
                        c25179 = c25179;
                        atomicInteger = atomicInteger;
                        i9 = i16;
                        i8 = i3;
                    }
                    break;
                case -1359420114:
                case -648254690:
                    if (C2288.f7433 <= 0) {
                        iM31610 = C0619.m2761("ܰۙ") ^ i7;
                        i3 = ((iM31610 ^ i6) * (-25553)) ^ (-1844454604);
                        i4 = -453497563;
                        i9 = iM31610 ^ i4;
                        i8 = i3;
                    } else {
                        atomicInteger = atomicInteger;
                        c25179 = c25179;
                        arrayList = arrayList;
                        iM3169 = (i6 - C0619.m2761("ۤܰ")) * 65;
                        i = ((iM3169 ^ i7) * 17139) ^ (-1486008146);
                        i2 = -1542523376;
                        AtomicInteger atomicInteger13 = atomicInteger;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                        arrayList = arrayList;
                        c25179 = c25179;
                        atomicInteger = atomicInteger13;
                    }
                    break;
                case -1287402233:
                case 996881412:
                    atomicInteger = atomicInteger;
                    c25179 = c25179;
                    arrayList.addAll(map.values());
                    Collections.sort(arrayList, C2661.comparing(new C8195(1)));
                    iM31611 = C0773.m3169("֡֡") ^ i7;
                    i3 = ((iM31611 ^ i6) * 32243) ^ 2115386330;
                    i5 = 1450589174;
                    int i17 = iM31611 ^ i5;
                    c25179 = c25179;
                    atomicInteger = atomicInteger;
                    i9 = i17;
                    i8 = i3;
                    break;
                case -1131778988:
                case 90861258:
                    C3779.m12264();
                    if (C0773.m3161() != 0) {
                        atomicInteger = atomicInteger;
                        c25179 = c25179;
                        iM31611 = C0773.m3169("۠᩷") ^ i6;
                        i3 = ((iM31611 ^ i7) * (-13885)) ^ 1932749731;
                        i5 = -1612153165;
                        int i18 = iM31611 ^ i5;
                        c25179 = c25179;
                        atomicInteger = atomicInteger;
                        i9 = i18;
                        i8 = i3;
                    } else {
                        atomicInteger = atomicInteger;
                        c25179 = c25179;
                        arrayList = arrayList;
                        iM3169 = (i6 - C0619.m2761("ۤܰ")) * 65;
                        i = ((iM3169 ^ i7) * 17139) ^ (-1486008146);
                        i2 = -1542523376;
                        AtomicInteger atomicInteger14 = atomicInteger;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                        arrayList = arrayList;
                        c25179 = c25179;
                        atomicInteger = atomicInteger14;
                    }
                    break;
                case -1112712069:
                case 1602584452:
                    C0773.m3161();
                    return;
                case -1053173889:
                case -376799391:
                    ArrayList arrayList2 = arrayList;
                    AtomicInteger atomicInteger15 = atomicInteger;
                    if (C4282.f15546 <= 0) {
                        int iM31614 = (C0773.m3169("ᩴܶ") + i7) * 127;
                        atomicInteger = atomicInteger15;
                        i9 = iM31614 ^ (-1916670130);
                        i8 = ((iM31614 ^ i6) * 19709) ^ 1527090037;
                        arrayList = arrayList2;
                        c25179 = null;
                    } else {
                        C25179 c251710 = new C25179(ActivityC21137.f67518);
                        i12 = 36;
                        int iM2761 = (C0619.m2761("᩷ᩳ") + i6) * 87;
                        c25179 = c251710;
                        i8 = ((iM2761 ^ i7) * 21871) ^ (-1192273587);
                        atomicInteger = atomicInteger15;
                        i9 = iM2761 ^ (-1186430489);
                        arrayList = arrayList2;
                    }
                    break;
                case -1014664956:
                case -158211623:
                    i10 = 0;
                    iM31611 = (i7 - C0773.m3169("᩺ۗ")) * (-73);
                    i3 = ((iM31611 ^ i6) * (-19851)) ^ 104579172;
                    i5 = -1116020639;
                    int i19 = iM31611 ^ i5;
                    c25179 = c25179;
                    atomicInteger = atomicInteger;
                    i9 = i19;
                    i8 = i3;
                    break;
                case -932274205:
                case 15717841:
                    if (!C17202.f56030) {
                        atomicInteger = atomicInteger;
                        c25179 = c25179;
                        arrayList = arrayList;
                        iM3169 = C0619.m2761("᩻ܳ") ^ i7;
                        i = ((iM3169 ^ i6) * 1487) ^ (-1798029833);
                        i2 = -635976979;
                        AtomicInteger atomicInteger16 = atomicInteger;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                        arrayList = arrayList;
                        c25179 = c25179;
                        atomicInteger = atomicInteger16;
                    } else {
                        iM31610 = C0619.m2761("ܰۙ") ^ i7;
                        i3 = ((iM31610 ^ i6) * (-25553)) ^ (-1844454604);
                        i4 = -453497563;
                        i9 = iM31610 ^ i4;
                        i8 = i3;
                    }
                    break;
                case -909612467:
                case -122798673:
                    atomicInteger = atomicInteger;
                    c25179 = c25179;
                    if (i10 < iM7752) {
                        iM31611 = C0619.m2761("ᩳܿ") ^ i6;
                        i3 = ((iM31611 ^ i7) * (-30357)) ^ (-774573994);
                        i5 = 2094172829;
                    } else {
                        iM31611 = (C0773.m3169("ۡᩳ") ^ i6) * 81;
                        i3 = ((iM31611 ^ i7) * 5175) ^ (-1467765368);
                        i5 = -797875082;
                    }
                    int i110 = iM31611 ^ i5;
                    c25179 = c25179;
                    atomicInteger = atomicInteger;
                    i9 = i110;
                    i8 = i3;
                    break;
                case -800513305:
                case 1822563249:
                    C2375.m8065();
                    if (!RunnableC3646.f12471) {
                        atomicInteger = atomicInteger;
                        c25179 = c25179;
                        arrayList = arrayList;
                        iM3169 = (C0619.m2761("ۢ᩷") + i6) * 75;
                        i = ((iM3169 ^ i7) * (-30941)) ^ 504596642;
                        i2 = -375881921;
                        AtomicInteger atomicInteger17 = atomicInteger;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                        arrayList = arrayList;
                        c25179 = c25179;
                        atomicInteger = atomicInteger17;
                    } else {
                        iM31610 = (i7 - C0773.m3169("ۘܺ")) * (-77);
                        i3 = ((iM31610 ^ i6) * (-3685)) ^ (-270082188);
                        i4 = 1765108587;
                        i9 = iM31610 ^ i4;
                        i8 = i3;
                    }
                    break;
                case -698542890:
                case 1090741571:
                    atomicInteger = atomicInteger;
                    c25179 = c25179;
                    C1146.m4219(th, obj);
                    iM31611 = (i7 - C0773.m3169("ۢۖ")) * 43;
                    i3 = ((iM31611 ^ i6) * (-9955)) ^ 934971575;
                    i5 = 790628284;
                    int i111 = iM31611 ^ i5;
                    c25179 = c25179;
                    atomicInteger = atomicInteger;
                    i9 = i111;
                    i8 = i3;
                    break;
                case -595360381:
                case 1519474363:
                    atomicInteger = atomicInteger;
                    c25179 = c25179;
                    try {
                        C1146.m4234(c25179, i12);
                        try {
                            AtomicInteger atomicInteger18 = new AtomicInteger();
                            try {
                                map = new HashMap();
                                try {
                                    iM7752 = C2288.m7752(activityC21137.f67520);
                                    int iM31615 = (i6 - C0773.m3169("ۘܶ")) * (-119);
                                    i9 = iM31615 ^ 1271100619;
                                    i8 = ((iM31615 ^ i7) * 20117) ^ (-1205458452);
                                    arrayList = arrayList;
                                    c25179 = c25179;
                                    atomicInteger = atomicInteger18;
                                } catch (Throwable th4) {
                                    th = th4;
                                    atomicInteger = atomicInteger18;
                                    iM3169 = (C0619.m2761("ۨܶ") ^ i6) * (-125);
                                    i = ((iM3169 ^ i7) * (-18947)) ^ (-1694436477);
                                    i2 = -358439222;
                                    AtomicInteger atomicInteger19 = atomicInteger;
                                    i9 = iM3169 ^ i2;
                                    i8 = i;
                                    arrayList = arrayList;
                                    c25179 = c25179;
                                    atomicInteger = atomicInteger19;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                atomicInteger = atomicInteger18;
                                map = null;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            atomicInteger = null;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                    break;
                case -374005075:
                case 998660275:
                    C3779.m12264();
                    C2310.m7813();
                    atomicInteger = atomicInteger;
                    c25179 = c25179;
                    arrayList = arrayList;
                    iM3169 = (i6 - C0619.m2761("ۤܰ")) * 65;
                    i = ((iM3169 ^ i7) * 17139) ^ (-1486008146);
                    i2 = -1542523376;
                    AtomicInteger atomicInteger110 = atomicInteger;
                    i9 = iM3169 ^ i2;
                    i8 = i;
                    arrayList = arrayList;
                    c25179 = c25179;
                    atomicInteger = atomicInteger110;
                    break;
                case -252496331:
                case 2012692857:
                    atomicInteger = atomicInteger;
                    c25179 = c25179;
                    arrayList = arrayList;
                    if (C3690.f12684 > 0) {
                        iM3169 = C0619.m2761("ۚᩳ") ^ i7;
                        i = ((iM3169 ^ i6) * 25815) ^ 330655809;
                        i2 = -24842760;
                        AtomicInteger atomicInteger111 = atomicInteger;
                        i9 = iM3169 ^ i2;
                        i8 = i;
                        arrayList = arrayList;
                        c25179 = c25179;
                        atomicInteger = atomicInteger111;
                    } else {
                        arrayList = arrayList;
                        iM31611 = C0773.m3169("۠᩷") ^ i6;
                        i3 = ((iM31611 ^ i7) * (-13885)) ^ 1932749731;
                        i5 = -1612153165;
                        int i112 = iM31611 ^ i5;
                        c25179 = c25179;
                        atomicInteger = atomicInteger;
                        i9 = i112;
                        i8 = i3;
                    }
                    break;
                case -112329967:
                case 32540860:
                    zM12923 = C3998.m12923(it);
                    iM31610 = C0773.m3169("֫ۢ") ^ i7;
                    i3 = ((iM31610 ^ i6) * (-5665)) ^ 1644439056;
                    i4 = -19896379;
                    i9 = iM31610 ^ i4;
                    i8 = i3;
                    break;
                case 1109586129:
                case 1144424854:
                    try {
                        AbstractC22044 abstractC22044 = (AbstractC22044) C3690.m11990(activityC21137.f67520, i10);
                        byte[] bArrM49866 = abstractC22044.m49866();
                        atomicInteger = atomicInteger;
                        c25179 = c25179;
                        try {
                            C1783.m6245(c25179, C1826.m6311(abstractC22044));
                            C0619.m2750(c25179, bArrM49866);
                            it = ActivityC21137.m48239(activityC21137, C3448.m11255(bArrM49866)).iterator();
                            iM31611 = (C0619.m2761("ۤۛ") + i6) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i3 = ((iM31611 ^ i7) * (-21333)) ^ 418148935;
                            i5 = 1439205693;
                            int i113 = iM31611 ^ i5;
                            c25179 = c25179;
                            atomicInteger = atomicInteger;
                            i9 = i113;
                            i8 = i3;
                        } catch (Throwable th8) {
                            th = th8;
                            th = th;
                            iM3169 = (C0619.m2761("ۨܶ") ^ i6) * (-125);
                            i = ((iM3169 ^ i7) * (-18947)) ^ (-1694436477);
                            i2 = -358439222;
                            AtomicInteger atomicInteger112 = atomicInteger;
                            i9 = iM3169 ^ i2;
                            i8 = i;
                            arrayList = arrayList;
                            c25179 = c25179;
                            atomicInteger = atomicInteger112;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        atomicInteger = atomicInteger;
                        c25179 = c25179;
                    }
                    break;
                case 1134398624:
                case 1894332318:
                    i10++;
                    iM31611 = (i7 - C0773.m3169("᩺ۗ")) * (-73);
                    i3 = ((iM31611 ^ i6) * (-19851)) ^ 104579172;
                    i5 = -1116020639;
                    int i114 = iM31611 ^ i5;
                    c25179 = c25179;
                    atomicInteger = atomicInteger;
                    i9 = i114;
                    i8 = i3;
                    break;
                default:
                    atomicInteger = atomicInteger;
                    c25179 = c25179;
                    arrayList = this.f65373;
                    if (RunnableC0334.f1808 <= 0) {
                        iM31611 = C0773.m3169("۠᩷") ^ i6;
                        i3 = ((iM31611 ^ i7) * (-13885)) ^ 1932749731;
                        i5 = -1612153165;
                    } else {
                        iM31611 = (C0619.m2761("ۛ᩵") ^ i7) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM31611 ^ i6) * 11547) ^ (-2058889160);
                        i5 = 1440819985;
                    }
                    int i115 = iM31611 ^ i5;
                    c25179 = c25179;
                    atomicInteger = atomicInteger;
                    i9 = i115;
                    i8 = i3;
                    break;
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        ActivityC21137 activityC21137 = null;
        int i = -1934297838;
        int i2 = C4282.f15546;
        int i3 = C3033.f9831;
        int iM2761 = C0619.m2761("ܽۧ") ^ i3;
        int i4 = ((iM2761 ^ i2) * (-15341)) ^ (-1285531928);
        int i5 = 706663197;
        while (true) {
            i = ((((i ^ i2) * (-26595)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2037814240:
                case -1728188750:
                    C0619.m2763();
                    C3690.m11987();
                    iM2761 = C0773.m3169("ۜ᩷") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-4519)) ^ 1276922846;
                    i5 = 1169682736;
                    break;
                case -2006011462:
                case -1255329496:
                    if (C0269.f1558 <= 0) {
                        iM2761 = C0773.m3169("ۜ᩷") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-4519)) ^ 1276922846;
                        i5 = 1169682736;
                    } else {
                        iM2761 = C0619.m2761("ۡ۠") ^ i2;
                        i4 = ((iM2761 ^ i3) * 7381) ^ 1615098476;
                        i5 = 2040329204;
                    }
                    break;
                case -1600567393:
                case 1121207141:
                    if (C3448.f11240 >= 0) {
                        iM2761 = C0619.m2761("۬ۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4873)) ^ 2026931207;
                        i5 = -1134654261;
                    } else {
                        iM2761 = (C0773.m3169("ۛۧ") ^ i2) * 71;
                        i4 = ((iM2761 ^ i3) * (-9283)) ^ 953310952;
                        i5 = 1929340850;
                    }
                    break;
                case -1435812479:
                case 794483291:
                    C3779.m12264();
                    break;
                case -977135619:
                case 1338672698:
                    if (C11235.f35427 >= 0) {
                        iM2761 = (C0619.m2761("᩹᩷") ^ i3) * (-63);
                        i4 = ((iM2761 ^ i2) * (-27357)) ^ 189543404;
                        i5 = -1966948277;
                    } else {
                        iM2761 = C0773.m3169("᩶᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * 25569) ^ 593024591;
                        i5 = 1739709650;
                    }
                    break;
                case -877006439:
                case -264152030:
                    C3033.m9845();
                    if (C2375.m8065() <= 0) {
                        iM2761 = C0619.m2761("۬ۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4873)) ^ 2026931207;
                        i5 = -1134654261;
                    } else {
                        iM2761 = C0773.m3169("ᩴܶ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 32087) ^ 1110253323;
                        i5 = 986315545;
                    }
                    break;
                case -858027676:
                case 2091651374:
                    if (C3779.m12264()) {
                        iM2761 = C0619.m2761("ۧ۫") ^ i2;
                        i4 = ((iM2761 ^ i3) * 1659) ^ 965074704;
                        i5 = 295933325;
                    } else {
                        iM2761 = (C0619.m2761("᩹᩷") ^ i3) * (-63);
                        i4 = ((iM2761 ^ i2) * (-27357)) ^ 189543404;
                        i5 = -1966948277;
                    }
                    break;
                case -853334827:
                case 889255548:
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0619.m2761("۬ۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4873)) ^ 2026931207;
                        i5 = -1134654261;
                    } else {
                        iM2761 = (C0773.m3169("ۢܶ") + i3) * 3;
                        i4 = ((iM2761 ^ i2) * (-17827)) ^ 485539743;
                        i5 = -1446452684;
                    }
                    break;
                case -468969711:
                case 1809521213:
                    activityC21137.m40402((Throwable) exc, true);
                    break;
                case 109684658:
                case 1564446974:
                    if (C2287.m7745() <= 0) {
                        iM2761 = (C0619.m2761("᩹᩷") ^ i3) * (-63);
                        i4 = ((iM2761 ^ i2) * (-27357)) ^ 189543404;
                        i5 = -1966948277;
                    } else {
                        iM2761 = (C0773.m3169("ᩳ֡") + i3) * 123;
                        i4 = ((iM2761 ^ i2) * (-22927)) ^ (-515503129);
                        i5 = 1023269062;
                    }
                    break;
                case 922296252:
                case 1761198646:
                    activityC21137 = this.f65372;
                    if (C2375.m8065() <= 0) {
                        iM2761 = (C0619.m2761("᩹᩷") ^ i3) * (-63);
                        i4 = ((iM2761 ^ i2) * (-27357)) ^ 189543404;
                        i5 = -1966948277;
                    } else {
                        iM2761 = C0619.m2761("ۧ᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * 31083) ^ (-948382410);
                        i5 = 198231242;
                    }
                    break;
                case 1157922796:
                case 1291061617:
                    if (C2702.f8586 <= 0) {
                        iM2761 = C0773.m3169("ۜ᩷") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-4519)) ^ 1276922846;
                        i5 = 1169682736;
                    } else {
                        iM2761 = C0619.m2761("᩺ܿ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-11745)) ^ (-579137924);
                        i5 = -1391764278;
                    }
                    break;
                case 1370064656:
                case 1925644287:
                    C2354.m7983();
                    if (RunnableC0334.f1808 > 0) {
                        iM2761 = C0773.m3169("۠ۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4347)) ^ (-1109953252);
                        i5 = -723370189;
                    } else {
                        iM2761 = C0619.m2761("۬ۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4873)) ^ 2026931207;
                        i5 = -1134654261;
                    }
                    break;
                case 1445047428:
                case 1538243133:
                    if (C0862.f3233 != 0) {
                        iM2761 = C0773.m3169("۠ۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4347)) ^ (-1109953252);
                        i5 = -723370189;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ۧۙ")) * 39;
                        i4 = ((iM2761 ^ i3) * 7237) ^ (-631584687);
                        i5 = -64374269;
                    }
                    break;
                case 1717559950:
                case 2131793282:
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0773.m3169("ۜ᩷") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-4519)) ^ 1276922846;
                        i5 = 1169682736;
                    } else {
                        iM2761 = C0619.m2761("᩷ۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 18005) ^ (-1348466023);
                        i5 = 1750371631;
                    }
                    break;
                default:
                    C1783.m6232();
                    if (!C2354.m7983()) {
                        iM2761 = C0619.m2761("۬ۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4873)) ^ 2026931207;
                        i5 = -1134654261;
                    } else {
                        iM2761 = C0773.m3169("ۜ᩷") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-4519)) ^ 1276922846;
                        i5 = 1169682736;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        this.f65372.m26246(this.f65373);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C20932.m47845(this);
    }
}
