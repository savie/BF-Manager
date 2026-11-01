package l;

import bin.mt.plus.Main;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Collection;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܽܿۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H508 */
/* JADX INFO: loaded from: classes5.dex */
public class C16785 extends AbstractC20413 {

    /* JADX INFO: renamed from: ᩸᩺ܶ, reason: not valid java name and contains not printable characters */
    private static final short[] f53764 = {4096, 5979, 2322, 12826, 32113, 32113, 32113, 9761, 32375, -19034, 31524, 12160, 12161, 12162, 12219, 12183, 12173, 12163, 12170, 12219, 12175, 12161, 12189, 12219, 12179, 12165, 12182, 12170, 8322, 5154, 5163, 5174, 5159, 5153, 5125, 5172, 5167, 5175, 5125, 5142, 5123, 5147, 5140, 5125, 5136, 5132, 5143, 5147, 5175, 5165, 5155, 5162, 8650, -3920, -3925, -3918, -3918, 30135, -23769, -26198, -31380, -25061, 29772};

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f53765;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public boolean f53766;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f53767;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public int f53768;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f53769;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f53770;

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        ArrayList arrayList = null;
        int i = -8834388;
        int i2 = C0278.f1572;
        int i3 = C7105.f23796;
        int iM45029 = C19806.m45029("ۖۚ") ^ i2;
        int i4 = ((iM45029 ^ i3) * 31245) ^ 541269522;
        int i5 = -2112715382;
        while (true) {
            i = ((((i ^ i3) * 77) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2082563801:
                case -1620747223:
                    if (C2704.f10408) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩻ܺ")) * (-37);
                        i4 = ((iM45029 ^ i2) * (-14657)) ^ (-1283728678);
                        i5 = -2133170656;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۡܰ")) * (-7);
                        i4 = ((iM45029 ^ i2) * 11287) ^ (-1241530564);
                        i5 = -1526659426;
                    }
                    break;
                case -2055336403:
                case 407036236:
                    if (C1066.f4915 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֫ܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 15553) ^ 136202262;
                        i5 = 1562236551;
                    } else {
                        iM45029 = C19806.m45029("ۢ۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * 20773) ^ 2098151922;
                        i5 = 1339577643;
                    }
                    break;
                case -2051220402:
                case -1127347722:
                    arrayList = this.f53767;
                    if (C1419.m4964(arrayList)) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܿܳ")) * (-15);
                        i4 = ((iM45029 ^ i3) * (-24911)) ^ 1205778555;
                        i5 = -270135409;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܰ۠")) * (-5);
                        i4 = ((iM45029 ^ i2) * 4265) ^ (-2017409966);
                        i5 = -159494755;
                    }
                    break;
                case -2045365351:
                case 801158051:
                    c11545.m28831();
                    c11545.m28777((Collection) arrayList);
                    c11545.m28830();
                    iM45029 = (i2 - ThreadFactoryC3888.m11306("ܿܳ")) * (-15);
                    i4 = ((iM45029 ^ i3) * (-24911)) ^ 1205778555;
                    i5 = -270135409;
                    break;
                case -2032686338:
                case 1080713999:
                    C1937.m6279();
                    if (RunnableC1606.f6488 < 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۡܰ")) * (-7);
                        i4 = ((iM45029 ^ i2) * 11287) ^ (-1241530564);
                        i5 = -1526659426;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۟۟") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM45029 ^ i2) * (-30479)) ^ 709729536;
                        i5 = 694456872;
                    }
                    break;
                case -2003978541:
                case -875147711:
                    if (C2124.f7782 <= 0) {
                        iM45029 = C19806.m45029("ۛ֡") ^ i2;
                        i4 = ((iM45029 ^ i3) * 10129) ^ 1729202217;
                        i5 = -188539575;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ۫") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18011)) ^ 557491693;
                        i5 = -836562057;
                    }
                    break;
                case -1890475677:
                case -767118242:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = C19806.m45029("ۛ֡") ^ i2;
                        i4 = ((iM45029 ^ i3) * 10129) ^ 1729202217;
                        i5 = -188539575;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܳۨ")) * (-25);
                        i4 = ((iM45029 ^ i3) * 3029) ^ 447317737;
                        i5 = -1593030519;
                    }
                    break;
                case -1443729940:
                case -901253605:
                    break;
                case -1417864413:
                case 1059915408:
                    if (C19806.m45024()) {
                        iM45029 = (ThreadFactoryC3888.m11306("۟۟") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM45029 ^ i2) * (-30479)) ^ 709729536;
                        i5 = 694456872;
                    } else {
                        iM45029 = (i2 - C19806.m45029("᩺۬")) * (-111);
                        i4 = ((iM45029 ^ i3) * (-19483)) ^ (-2135608869);
                        i5 = -1019241437;
                    }
                    break;
                case -1161762763:
                case 176520234:
                    if (C0278.f1572 <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۡܰ")) * (-7);
                        i4 = ((iM45029 ^ i2) * 11287) ^ (-1241530564);
                        i5 = -1526659426;
                    } else {
                        iM45029 = (C19806.m45029("ܿۡ") + i2) * (-95);
                        i4 = ((iM45029 ^ i3) * (-4903)) ^ 820698519;
                        i5 = 1581402291;
                    }
                    break;
                case -1040187867:
                case -749417756:
                    if (C0216.m1591() <= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܳۨ")) * (-25);
                        i4 = ((iM45029 ^ i3) * 3029) ^ 447317737;
                        i5 = -1593030519;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ۫") + i3) * 93;
                        i4 = ((iM45029 ^ i2) * 10323) ^ 2130848113;
                        i5 = 1673972523;
                    }
                    break;
                case -1006146533:
                case 1312660282:
                    if (C0962.f3784) {
                        iM45029 = (ThreadFactoryC3888.m11306("۟۟") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM45029 ^ i2) * (-30479)) ^ 709729536;
                        i5 = 694456872;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳۖ") + i3) * 47;
                        i4 = ((iM45029 ^ i2) * 2153) ^ 1684705571;
                        i5 = -1584473155;
                    }
                    break;
                case -759840145:
                case -101452634:
                    if (C1460.f5948 >= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܳۨ")) * (-25);
                        i4 = ((iM45029 ^ i3) * 3029) ^ 447317737;
                        i5 = -1593030519;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩵ۢ")) * (-35);
                        i4 = ((iM45029 ^ i2) * 6759) ^ 1940139380;
                        i5 = 1539837166;
                    }
                    break;
                case -711606197:
                case 259088820:
                    if (C0817.f3443) {
                        iM45029 = ThreadFactoryC3888.m11306("۠ۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-8199)) ^ 486190040;
                        i5 = -1481166683;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֫ܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 15553) ^ 136202262;
                        i5 = 1562236551;
                    }
                    break;
                case -700715121:
                case 1452398259:
                    C2124.m6673();
                    C1668.m5583();
                    iM45029 = (i2 - ThreadFactoryC3888.m11306("ܳۨ")) * (-25);
                    i4 = ((iM45029 ^ i3) * 3029) ^ 447317737;
                    i5 = -1593030519;
                    break;
                case -452700138:
                case 1080929353:
                    if (C1066.f4915 <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۡܰ")) * (-7);
                        i4 = ((iM45029 ^ i2) * 11287) ^ (-1241530564);
                        i5 = -1526659426;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۬۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * 12055) ^ 1953347628;
                        i5 = -1744187335;
                    }
                    break;
                case -374029304:
                case 1121058927:
                    C3577.m10565();
                    if (C1066.f4915 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۟۟") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM45029 ^ i2) * (-30479)) ^ 709729536;
                        i5 = 694456872;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܳۨ")) * (-25);
                        i4 = ((iM45029 ^ i3) * 3029) ^ 447317737;
                        i5 = -1593030519;
                    }
                    break;
                case -93282536:
                case 1530525048:
                    if (m41579(c11545)) {
                        iM45029 = (i3 - C19806.m45029("۟֨")) * 93;
                        i4 = ((iM45029 ^ i2) * (-1817)) ^ 753161317;
                        i5 = -1444728563;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܿܳ")) * (-15);
                        i4 = ((iM45029 ^ i3) * (-24911)) ^ 1205778555;
                        i5 = -270135409;
                    }
                    break;
                default:
                    C2124.m6673();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0257 A[PHI: r2 r6 r9 r10 r11 r18
      0x0257: PHI (r2v4 boolean) = (r2v2 boolean), (r2v2 boolean), (r2v2 boolean), (r2v2 boolean), (r2v5 boolean) binds: [B:65:0x0255, B:61:0x0239, B:57:0x021b, B:53:0x01f8, B:11:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0257: PHI (r6v5 short) = (r6v2 short), (r6v2 short), (r6v4 short), (r6v2 short), (r6v2 short) binds: [B:65:0x0255, B:61:0x0239, B:57:0x021b, B:53:0x01f8, B:11:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0257: PHI (r9v4 short[]) = (r9v2 short[]), (r9v2 short[]), (r9v2 short[]), (r9v2 short[]), (r9v5 short[]) binds: [B:65:0x0255, B:61:0x0239, B:57:0x021b, B:53:0x01f8, B:11:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0257: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v5 int) binds: [B:65:0x0255, B:61:0x0239, B:57:0x021b, B:53:0x01f8, B:11:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0257: PHI (r11v4 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v5 int) binds: [B:65:0x0255, B:61:0x0239, B:57:0x021b, B:53:0x01f8, B:11:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0257: PHI (r18v5 int) = (r18v3 int), (r18v3 int), (r18v3 int), (r18v4 int), (r18v3 int) binds: [B:65:0x0255, B:61:0x0239, B:57:0x021b, B:53:0x01f8, B:11:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02a4  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
    
        if (l.C2642.f10294 <= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0060, code lost:
    
        if (l.C3577.f13150 < 0) goto L23;
     */
    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo16350(l.AbstractActivityC12483 r20, l.C5202 r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16785.mo16350(l.۫ܶۘ, l.ۚ۟ۜ, boolean):void");
    }

    public C16785() {
        ArrayList arrayList = null;
        int i = -1699968369;
        int i2 = C3660.f13403;
        int i3 = RunnableC1606.f6488;
        int iM11306 = ThreadFactoryC3888.m11306("ۖܶ") ^ i2;
        int i4 = ((iM11306 ^ i3) * 25749) ^ 1791233597;
        int i5 = 396699278;
        while (true) {
            i = ((((i ^ i3) * (-26361)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2146706195:
                case -1630550521:
                    arrayList = new ArrayList();
                    if (C1977.f7413 <= 0) {
                        iM11306 = (C19806.m45029("ᩳᩳ") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM11306 ^ i2) * (-32607)) ^ 1963528336;
                        i5 = -218445121;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡ܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-25825)) ^ (-781499349);
                        i5 = 2141052641;
                    }
                    break;
                case -2137761235:
                case -1746802083:
                    if (RunnableC1895.f7152) {
                        iM11306 = C19806.m45029("ۡۧ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-21475)) ^ (-225768940);
                        i5 = -525846812;
                    } else {
                        iM11306 = (C19806.m45029("۬ܽ") ^ i2) * 119;
                        i4 = ((iM11306 ^ i3) * 9341) ^ (-1839680632);
                        i5 = -1209388127;
                    }
                    break;
                case -1874150005:
                case -21681065:
                    if (C1461.m5080()) {
                        iM11306 = (C19806.m45029("۬ܽ") ^ i2) * 119;
                        i4 = ((iM11306 ^ i3) * 9341) ^ (-1839680632);
                        i5 = -1209388127;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۧܽ")) * 89;
                        i4 = ((iM11306 ^ i3) * 7017) ^ 2133793941;
                        i5 = 479922284;
                    }
                    break;
                case -1783175498:
                case 17266080:
                    if (C1875.m6086() != 0) {
                        iM11306 = (C19806.m45029("ۜᩳ") + i2) * (-103);
                        i4 = ((iM11306 ^ i3) * 25697) ^ (-2093852546);
                        i5 = 260361937;
                    } else {
                        iM11306 = (C19806.m45029("ܳۙ") ^ i2) * (-55);
                        i4 = ((iM11306 ^ i3) * (-5571)) ^ 1235101525;
                        i5 = -1066235213;
                    }
                    break;
                case -1482861603:
                case 360829733:
                    if (RunnableC1606.m5473() == 0) {
                        iM11306 = (C19806.m45029("ᩳᩳ") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM11306 ^ i2) * (-32607)) ^ 1963528336;
                        i5 = -218445121;
                    } else {
                        iM11306 = C19806.m45029("ܺ᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * 26095) ^ (-2086892070);
                        i5 = -1544561626;
                    }
                    break;
                case -1482186519:
                case 1919033177:
                    if (C7105.f23796 >= 0) {
                        iM11306 = (C19806.m45029("ۜᩳ") + i2) * (-103);
                        i4 = ((iM11306 ^ i3) * 25697) ^ (-2093852546);
                        i5 = 260361937;
                    } else {
                        iM11306 = C19806.m45029("۟ܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 29221) ^ 1233147820;
                        i5 = 389719897;
                    }
                    break;
                case -1459504482:
                case 166619050:
                    if (C1937.f7317 >= 0) {
                        iM11306 = (C19806.m45029("ᩳᩳ") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM11306 ^ i2) * (-32607)) ^ 1963528336;
                        i5 = -218445121;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩹᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * 7993) ^ 2018435195;
                        i5 = 582871308;
                    }
                    break;
                case -1406183753:
                case -149641957:
                    C2642.m8171();
                    if (C3722.f13525 <= 0) {
                        iM11306 = C19806.m45029("ۢܽ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-19315)) ^ (-740020232);
                        i5 = -2110836995;
                    } else {
                        iM11306 = C19806.m45029("ܺ᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * 26095) ^ (-2086892070);
                        i5 = -1544561626;
                    }
                    break;
                case -1257207982:
                case 1660233983:
                    if (C1398.m4895() <= 0) {
                        iM11306 = (C19806.m45029("ۜᩳ") + i2) * (-103);
                        i4 = ((iM11306 ^ i3) * 25697) ^ (-2093852546);
                        i5 = 260361937;
                    } else {
                        iM11306 = (C19806.m45029("ܺ۠") + i3) * (-5);
                        i4 = ((iM11306 ^ i2) * (-12645)) ^ (-1028874953);
                        i5 = -616968227;
                    }
                    break;
                case -769894660:
                case -83814194:
                    if (C3535.m10431() <= 0) {
                        iM11306 = C19806.m45029("ܺ᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * 26095) ^ (-2086892070);
                        i5 = -1544561626;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-12135)) ^ 777137084;
                        i5 = -1669279848;
                    }
                    break;
                case -198942479:
                case 1278800002:
                    C1148.m4232();
                    throw new RuntimeException();
                case -156279220:
                case 759277319:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        iM11306 = (C19806.m45029("۬ܽ") ^ i2) * 119;
                        i4 = ((iM11306 ^ i3) * 9341) ^ (-1839680632);
                        i5 = -1209388127;
                    } else {
                        iM11306 = C19806.m45029("ܺ᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * 26095) ^ (-2086892070);
                        i5 = -1544561626;
                    }
                    break;
                case 259996698:
                case 514573927:
                    if (C3660.f13403 >= 0) {
                        iM11306 = (C19806.m45029("۬ܽ") ^ i2) * 119;
                        i4 = ((iM11306 ^ i3) * 9341) ^ (-1839680632);
                        i5 = -1209388127;
                    } else {
                        iM11306 = C19806.m45029("ۧۜ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-24767)) ^ (-2075771140);
                        i5 = 1169337194;
                    }
                    break;
                case 301562783:
                case 1935146784:
                    if (C0962.f3784) {
                        iM11306 = C19806.m45029("ۢܽ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-19315)) ^ (-740020232);
                        i5 = -2110836995;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶܿ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-5823)) ^ 580818116;
                        i5 = -288340559;
                    }
                    break;
                case 901600383:
                case 928948249:
                    RunnableC1564.m5345();
                    iM11306 = C19806.m45029("ܺ᩶") ^ i3;
                    i4 = ((iM11306 ^ i2) * 26095) ^ (-2086892070);
                    i5 = -1544561626;
                    break;
                default:
                    this.f53767 = arrayList;
                    return;
            }
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5718;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x013c A[PHI: r1 r3 r4 r5 r6 r7 r9
      0x013c: PHI (r1v3 java.lang.String) = 
      (r1v1 java.lang.String)
      (r1v2 java.lang.String)
      (r1v1 java.lang.String)
      (r1v1 java.lang.String)
      (r1v1 java.lang.String)
     binds: [B:42:0x013a, B:38:0x0115, B:34:0x00f0, B:30:0x00cf, B:26:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r3v3 java.lang.String[]) = 
      (r3v1 java.lang.String[])
      (r3v1 java.lang.String[])
      (r3v2 java.lang.String[])
      (r3v1 java.lang.String[])
      (r3v1 java.lang.String[])
     binds: [B:42:0x013a, B:38:0x0115, B:34:0x00f0, B:30:0x00cf, B:26:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r4v3 int) = (r4v2 int), (r4v1 int), (r4v1 int), (r4v1 int), (r4v1 int) binds: [B:42:0x013a, B:38:0x0115, B:34:0x00f0, B:30:0x00cf, B:26:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r5v2 java.lang.String) = 
      (r5v1 java.lang.String)
      (r5v1 java.lang.String)
      (r5v1 java.lang.String)
      (r5v1 java.lang.String)
      (r5v3 java.lang.String)
     binds: [B:42:0x013a, B:38:0x0115, B:34:0x00f0, B:30:0x00cf, B:26:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r6v4 short[]) = (r6v2 short[]), (r6v2 short[]), (r6v2 short[]), (r6v3 short[]), (r6v2 short[]) binds: [B:42:0x013a, B:38:0x0115, B:34:0x00f0, B:30:0x00cf, B:26:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:42:0x013a, B:38:0x0115, B:34:0x00f0, B:30:0x00cf, B:26:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:42:0x013a, B:38:0x0115, B:34:0x00f0, B:30:0x00cf, B:26:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x016a A[PHI: r13 r14 r15
      0x016a: PHI (r13v2 short[]) = (r13v1 short[]), (r13v1 short[]), (r13v1 short[]), (r13v1 short[]), (r13v4 short[]) binds: [B:103:0x016a, B:102:0x016a, B:20:0x008e, B:17:0x0074, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x016a: PHI (r14v2 int) = (r14v1 int), (r14v1 int), (r14v1 int), (r14v1 int), (r14v4 int) binds: [B:103:0x016a, B:102:0x016a, B:20:0x008e, B:17:0x0074, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x016a: PHI (r15v2 int) = (r15v1 int), (r15v1 int), (r15v1 int), (r15v1 int), (r15v4 int) binds: [B:103:0x016a, B:102:0x016a, B:20:0x008e, B:17:0x0074, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02a9 A[PHI: r8 r17 r18 r22
      0x02a9: PHI (r8v2 short) = (r8v1 short), (r8v1 short), (r8v3 short) binds: [B:15:0x006e, B:71:0x02a7, B:67:0x0286] A[DONT_GENERATE, DONT_INLINE]
      0x02a9: PHI (r17v4 char) = (r17v2 char), (r17v3 char), (r17v2 char) binds: [B:15:0x006e, B:71:0x02a7, B:67:0x0286] A[DONT_GENERATE, DONT_INLINE]
      0x02a9: PHI (r18v3 int) = (r18v2 int), (r18v2 int), (r18v4 int) binds: [B:15:0x006e, B:71:0x02a7, B:67:0x0286] A[DONT_GENERATE, DONT_INLINE]
      0x02a9: PHI (r22v31 java.lang.String) = (r22v5 java.lang.String), (r22v30 java.lang.String), (r22v32 java.lang.String) binds: [B:15:0x006e, B:71:0x02a7, B:67:0x0286] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02db A[PHI: r11 r16 r22 r24
      0x02db: PHI (r11v2 short) = (r11v1 short), (r11v1 short), (r11v3 short) binds: [B:11:0x0061, B:75:0x02d9, B:63:0x0265] A[DONT_GENERATE, DONT_INLINE]
      0x02db: PHI (r16v4 short[]) = (r16v2 short[]), (r16v3 short[]), (r16v2 short[]) binds: [B:11:0x0061, B:75:0x02d9, B:63:0x0265] A[DONT_GENERATE, DONT_INLINE]
      0x02db: PHI (r22v33 java.lang.String) = (r22v6 java.lang.String), (r22v29 java.lang.String), (r22v34 java.lang.String) binds: [B:11:0x0061, B:75:0x02d9, B:63:0x0265] A[DONT_GENERATE, DONT_INLINE]
      0x02db: PHI (r24v4 int) = (r24v3 int), (r24v3 int), (r24v5 int) binds: [B:11:0x0061, B:75:0x02d9, B:63:0x0265] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        String strM10959;
        int iM45029;
        int i;
        int i2;
        int iM450210;
        int i3;
        int i4;
        int i5;
        String strM3017 = null;
        String str = null;
        String[] strArr = null;
        int iM11306 = 0;
        String strM10423 = null;
        short s = 0;
        short s2 = 0;
        int i6 = 0;
        short[] sArr = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = -1996126071;
        int i10 = C1461.f5957;
        int i11 = C1148.f5161;
        int iM11307 = ThreadFactoryC3888.m11306("᩵ۙ") ^ i10;
        int i12 = ((iM11307 ^ i11) * 28915) ^ 58147712;
        int i13 = iM11307 ^ 1860241885;
        int i14 = 0;
        int i15 = 0;
        char c = 0;
        int i16 = 0;
        AbstractC20745 abstractC20745 = null;
        int i17 = 0;
        short[] sArr2 = null;
        short[] sArr3 = null;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i11) * 1719) >> 31));
            switch (i9) {
                case -1861624941:
                case 1361219625:
                    strM10959 = C1148.m4230(f53764, 53, 4, i6);
                    str = strM10959;
                    iM45029 = (C19806.m45029("᩺ܳ") + i11) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i = ((iM45029 ^ i10) * (-21567)) ^ (-1031403266);
                    i2 = 374907213;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    break;
                case -1848094542:
                case -68066103:
                    if (C3535.f13026 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۢ") ^ i10;
                        i = ((iM45029 ^ i11) * 15225) ^ (-2050797849);
                        i2 = -1961901733;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۟ۛ") ^ i11;
                        i = ((iM45029 ^ i10) * 7559) ^ 1325496350;
                        i2 = 835393887;
                    }
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    break;
                case -1720625606:
                case -415822989:
                    strM3017 = C0671.m3017(2129487309 ^ iM11306);
                    if (RunnableC3388.m10064()) {
                        iM45029 = (i11 - ThreadFactoryC3888.m11306("۬᩷")) * 11;
                        i = ((iM45029 ^ i10) * (-28981)) ^ (-170223845);
                        i2 = 1958962455;
                    } else {
                        iM45029 = (i11 - ThreadFactoryC3888.m11306("ܿ۫")) * (-93);
                        i = ((iM45029 ^ i10) * 2399) ^ (-696228971);
                        i2 = -421048287;
                    }
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    break;
                case -1578727708:
                case 1699049704:
                    strM3017 = strM3017;
                    s = sArr2[c];
                    i16 = s * s;
                    if (C1398.f5802 <= 0) {
                        iM450210 = (C19806.m45029("ۙ᩻") ^ i11) * 123;
                        i3 = ((iM450210 ^ i10) * (-12111)) ^ (-1493618593);
                        i4 = -1599703538;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("۟ۚ") ^ i10) * (-45);
                        i3 = ((iM450210 ^ i11) * 7177) ^ (-1383751145);
                        i4 = -1287749629;
                    }
                    i5 = iM450210 ^ i4;
                    String str2 = strM3017;
                    i13 = i5;
                    i12 = i3;
                    strM3017 = str2;
                    break;
                case -1455032269:
                case -748042433:
                    C2788.m8472();
                    C3660.m10791();
                    return null;
                case -1010995204:
                case 1155656498:
                    C0278.m1789();
                    if (C1148.f5161 > 0) {
                        strM3017 = strM3017;
                        iM450210 = (C19806.m45029("ۙ᩻") ^ i11) * 123;
                        i3 = ((iM450210 ^ i10) * (-12111)) ^ (-1493618593);
                        i4 = -1599703538;
                        i5 = iM450210 ^ i4;
                        String str3 = strM3017;
                        i13 = i5;
                        i12 = i3;
                        strM3017 = str3;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۢ") ^ i10;
                        i = ((iM45029 ^ i11) * 15225) ^ (-2050797849);
                        i2 = -1961901733;
                        i13 = iM45029 ^ i2;
                        i12 = i;
                    }
                    break;
                case -987169557:
                case 247894907:
                    strM3017 = strM3017;
                    i17 = i16 + 25200400;
                    s2 = 10040;
                    if (C1668.m5583()) {
                        iM450210 = C19806.m45029("᩷ܽ") ^ i11;
                        i3 = ((iM450210 ^ i10) * 2611) ^ (-1616224516);
                        i4 = 1106199404;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("֨ᩴ") ^ i10) * (-33);
                        i3 = ((iM450210 ^ i11) * (-27893)) ^ 48775548;
                        i4 = 1499861581;
                    }
                    i5 = iM450210 ^ i4;
                    String str4 = strM3017;
                    i13 = i5;
                    i12 = i3;
                    strM3017 = str4;
                    break;
                case -881773621:
                case 765710806:
                    strM10959 = C3743.m10959(abstractC20745);
                    str = strM10959;
                    iM45029 = (C19806.m45029("᩺ܳ") + i11) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i = ((iM45029 ^ i10) * (-21567)) ^ (-1031403266);
                    i2 = 374907213;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    break;
                case -730991858:
                case 163333575:
                    AbstractC20745 abstractC20746 = this.f53769;
                    if (abstractC20746 == null) {
                        int iM450211 = (C19806.m45029("ܿܰ") ^ i10) * 51;
                        i12 = ((iM450211 ^ i11) * (-17631)) ^ (-880187957);
                        i13 = iM450211 ^ (-848816993);
                        abstractC20745 = abstractC20746;
                    } else {
                        int iM11308 = ThreadFactoryC3888.m11306("ᩴۤ") ^ i11;
                        strM3017 = strM3017;
                        i3 = ((iM11308 ^ i10) * (-17163)) ^ (-1782244263);
                        i5 = iM11308 ^ (-1262398244);
                        abstractC20745 = abstractC20746;
                        String str5 = strM3017;
                        i13 = i5;
                        i12 = i3;
                        strM3017 = str5;
                    }
                    break;
                case -646619201:
                case -304693723:
                    strM3017 = strM3017;
                    c = '4';
                    if (C2788.m8472() != 0) {
                        iM450210 = (C19806.m45029("ۙ᩻") ^ i11) * 123;
                        i3 = ((iM450210 ^ i10) * (-12111)) ^ (-1493618593);
                        i4 = -1599703538;
                    } else {
                        iM450210 = C19806.m45029("ۛܶ") ^ i10;
                        i3 = ((iM450210 ^ i11) * 22661) ^ 1200399735;
                        i4 = 1025545968;
                    }
                    i5 = iM450210 ^ i4;
                    String str6 = strM3017;
                    i13 = i5;
                    i12 = i3;
                    strM3017 = str6;
                    break;
                case -454207017:
                case 1046422829:
                    strM3017 = strM3017;
                    if ((s * s2) - i17 <= 0) {
                        iM450210 = ThreadFactoryC3888.m11306("ۜܰ") ^ i10;
                        i3 = ((iM450210 ^ i11) * 12025) ^ 2001764459;
                        i4 = 606938152;
                    } else {
                        iM450210 = (C19806.m45029("ۨۘ") ^ i11) * 53;
                        i3 = ((iM450210 ^ i10) * 14843) ^ (-991970086);
                        i4 = 2147254511;
                    }
                    i5 = iM450210 ^ i4;
                    String str7 = strM3017;
                    i13 = i5;
                    i12 = i3;
                    strM3017 = str7;
                    break;
                case -375532864:
                case 844024736:
                    sArr3 = f53764;
                    i14 = 60;
                    i15 = 3;
                    if (C0216.f1393 != 0) {
                        iM45029 = (i11 - ThreadFactoryC3888.m11306("ܿ۫")) * (-93);
                        i = ((iM45029 ^ i10) * 2399) ^ (-696228971);
                        i2 = -421048287;
                    } else {
                        iM45029 = (C19806.m45029("ܿ۟") + i11) * 43;
                        i = ((iM45029 ^ i10) * 13083) ^ 1414448857;
                        i2 = 1747986159;
                    }
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    break;
                case -175692280:
                case 746272986:
                    return C0278.m1786(C19806.m45029(strM10423) ^ 2127934898, strArr);
                case 141150307:
                case 1068188421:
                    strArr = new String[]{str, strM3017};
                    if (C1066.f4915 <= 0) {
                        iM45029 = (i11 - ThreadFactoryC3888.m11306("ܿ۫")) * (-93);
                        i = ((iM45029 ^ i10) * 2399) ^ (-696228971);
                        i2 = -421048287;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۫۫") ^ i10;
                        i = ((iM45029 ^ i11) * 18571) ^ (-585511956);
                        i2 = 1781214051;
                    }
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    break;
                case 265632044:
                case 1198895062:
                    i6 = 28552;
                    iM450210 = (C19806.m45029("ۛ᩻") ^ i10) * (-107);
                    i3 = ((iM450210 ^ i11) * (-685)) ^ 933713121;
                    i4 = 80523288;
                    i5 = iM450210 ^ i4;
                    String str8 = strM3017;
                    i13 = i5;
                    i12 = i3;
                    strM3017 = str8;
                    break;
                case 310497594:
                case 914820986:
                    strM3017 = strM3017;
                    sArr2 = f53764;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM450210 = C19806.m45029("֨᩵") ^ i11;
                        i3 = ((iM450210 ^ i10) * (-24083)) ^ 208862543;
                        i4 = -1838863857;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("֨ᩴ") ^ i10) * (-33);
                        i3 = ((iM450210 ^ i11) * (-27893)) ^ 48775548;
                        i4 = 1499861581;
                    }
                    i5 = iM450210 ^ i4;
                    String str9 = strM3017;
                    i13 = i5;
                    i12 = i3;
                    strM3017 = str9;
                    break;
                case 460820130:
                case 1069380193:
                    strM10423 = C3535.m10423(sArr3, i14, i15, i6);
                    if (C0278.f1572 <= 0) {
                        iM45029 = (i11 - ThreadFactoryC3888.m11306("ܿ۫")) * (-93);
                        i = ((iM45029 ^ i10) * 2399) ^ (-696228971);
                        i2 = -421048287;
                    } else {
                        iM45029 = C19806.m45029("ۖۢ") ^ i10;
                        i = ((iM45029 ^ i11) * (-24573)) ^ 678244682;
                        i2 = -1377648281;
                    }
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    break;
                case 832209847:
                case 1994198130:
                    iM11306 = ThreadFactoryC3888.m11306(C7105.m18989(sArr, i7, i8, i6));
                    if (C0278.f1572 <= 0) {
                        iM45029 = (i11 - ThreadFactoryC3888.m11306("ܿ۫")) * (-93);
                        i = ((iM45029 ^ i10) * 2399) ^ (-696228971);
                        i2 = -421048287;
                    } else {
                        iM45029 = (C19806.m45029("ۧۗ") + i11) * (-113);
                        i = ((iM45029 ^ i10) * 9023) ^ 151410351;
                        i2 = 939737859;
                    }
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    break;
                case 897355819:
                case 2060210384:
                    if (C7105.f23796 < 0) {
                        strM3017 = strM3017;
                        iM450210 = (ThreadFactoryC3888.m11306("֨ᩴ") ^ i10) * (-33);
                        i3 = ((iM450210 ^ i11) * (-27893)) ^ 48775548;
                        i4 = 1499861581;
                        i5 = iM450210 ^ i4;
                        String str10 = strM3017;
                        i13 = i5;
                        i12 = i3;
                        strM3017 = str10;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۢ") ^ i10;
                        i = ((iM45029 ^ i11) * 15225) ^ (-2050797849);
                        i2 = -1961901733;
                        i13 = iM45029 ^ i2;
                        i12 = i;
                    }
                    break;
                case 1316527972:
                case 1409598034:
                    C1875.m6086();
                    iM45029 = ThreadFactoryC3888.m11306("᩻ۢ") ^ i10;
                    i = ((iM45029 ^ i11) * 15225) ^ (-2050797849);
                    i2 = -1961901733;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    break;
                case 1585974564:
                case 2085143135:
                    i6 = 61662;
                    iM450210 = (C19806.m45029("ۛ᩻") ^ i10) * (-107);
                    i3 = ((iM450210 ^ i11) * (-685)) ^ 933713121;
                    i4 = 80523288;
                    i5 = iM450210 ^ i4;
                    String str11 = strM3017;
                    i13 = i5;
                    i12 = i3;
                    strM3017 = str11;
                    break;
                default:
                    sArr = f53764;
                    i7 = 57;
                    i8 = 3;
                    if (C1398.m4895() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۢ") ^ i10;
                        i = ((iM45029 ^ i11) * 15225) ^ (-2050797849);
                        i2 = -1961901733;
                    } else {
                        iM45029 = (i10 - C19806.m45029("ᩴۛ")) * 7;
                        i = ((iM45029 ^ i11) * 8571) ^ (-1417906828);
                        i2 = 1530171539;
                    }
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x006d  */
    /* JADX WARN: Code duplicated, block: B:53:0x01b4 A[PHI: r7 r8 r9
      0x01b4: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:52:0x01b2, B:48:0x0195, B:18:0x008b, B:16:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x01b4: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:52:0x01b2, B:48:0x0195, B:18:0x008b, B:16:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x01b4: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short), (r9v2 short) binds: [B:52:0x01b2, B:48:0x0195, B:18:0x008b, B:16:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01e8 A[PHI: r3 r6 r10
      0x01e8: PHI (r3v4 java.lang.String) = 
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v3 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
     binds: [B:56:0x01e6, B:44:0x0175, B:29:0x00e0, B:16:0x0087, B:12:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:56:0x01e6, B:44:0x0175, B:29:0x00e0, B:16:0x0087, B:12:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x01e8: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:56:0x01e6, B:44:0x0175, B:29:0x00e0, B:16:0x0087, B:12:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x021b A[PHI: r4 r12 r13 r14 r15 r21
      0x021b: PHI (r4v3 int) = (r4v2 int), (r4v2 int), (r4v2 int), (r4v5 int) binds: [B:60:0x0219, B:33:0x0100, B:9:0x005f, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x021b: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:60:0x0219, B:33:0x0100, B:9:0x005f, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x021b: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:60:0x0219, B:33:0x0100, B:9:0x005f, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x021b: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:60:0x0219, B:33:0x0100, B:9:0x005f, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x021b: PHI (r15v3 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v2 short[]), (r15v5 short[]) binds: [B:60:0x0219, B:33:0x0100, B:9:0x005f, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x021b: PHI (r21v5 char) = (r21v4 char), (r21v3 char), (r21v3 char), (r21v3 char) binds: [B:60:0x0219, B:33:0x0100, B:9:0x005f, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x024d A[PHI: r2 r16
      0x024d: PHI (r2v3 int) = (r2v2 int), (r2v5 int) binds: [B:64:0x024b, B:25:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]) binds: [B:64:0x024b, B:25:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        int iM45029;
        int i;
        int i2;
        int i3 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int i4 = ThreadFactoryC3888.f14547;
        int iM11306 = ThreadFactoryC3888.m11306("ܶۨ") ^ i3;
        int i5 = ((iM11306 ^ i4) * 22501) ^ (-425028958);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM11306 ^ 517869132;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -476855617;
        char c = 0;
        String strM9869 = null;
        int iM11307 = 0;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i4) * (-8149)) >> 31));
            switch (i14) {
                case -2070420276:
                case 1305126021:
                    C0278.m1784(this, C1460.m5047(sArr3, i7, 3, i11));
                    break;
                case -2027511256:
                case 896659268:
                    ThreadFactoryC3888.m11300();
                    if (C1668.m5583()) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֡ۤ")) * (-51);
                        i = ((iM45029 ^ i4) * (-10965)) ^ 1535585826;
                        i2 = -137085590;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰܰ") ^ i4;
                        i = ((iM45029 ^ i3) * (-6001)) ^ (-1699621712);
                        i2 = -1331638609;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1864559846:
                case -1475338684:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ۧ") + i4) * (-83);
                        i = ((iM45029 ^ i3) * 20247) ^ (-1477279948);
                        i2 = -1841661530;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰܰ") ^ i4;
                        i = ((iM45029 ^ i3) * (-6001)) ^ (-1699621712);
                        i2 = -1331638609;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1565692606:
                case -423386453:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    C1189.m4368();
                    iM45029 = (ThreadFactoryC3888.m11306("֫ۧ") + i4) * (-83);
                    i = ((iM45029 ^ i3) * 20247) ^ (-1477279948);
                    i2 = -1841661530;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1450781091:
                case 911842385:
                    i11 = 27056;
                    iM45029 = (ThreadFactoryC3888.m11306("᩵᩷") ^ i4) * 85;
                    i = ((iM45029 ^ i3) * 29715) ^ (-593922578);
                    i2 = 1129083476;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1012414692:
                case 1688882219:
                    i11 = 32095;
                    iM45029 = (ThreadFactoryC3888.m11306("᩵᩷") ^ i4) * 85;
                    i = ((iM45029 ^ i3) * 29715) ^ (-593922578);
                    i2 = 1129083476;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -946694060:
                case 1619432746:
                    i9 = i8 * i8;
                    s2 = 2;
                    if (C0050.f912 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ۧ") + i4) * (-83);
                        i = ((iM45029 ^ i3) * 20247) ^ (-1477279948);
                        i2 = -1841661530;
                    } else {
                        iM45029 = C19806.m45029("۫ܺ") ^ i4;
                        i = ((iM45029 ^ i3) * (-10495)) ^ (-409811577);
                        i2 = 1416831468;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -884887897:
                case 1866823046:
                    RunnableC1895.m6170();
                    break;
                case -556358511:
                case 72119114:
                    c = 0;
                    if (C1977.f7413 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹֡") ^ i3;
                        i = ((iM45029 ^ i4) * (-10231)) ^ (-1493640773);
                        i2 = 2083788959;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۨ᩵")) * 109;
                        i = ((iM45029 ^ i4) * (-13889)) ^ (-214177884);
                        i2 = 780763180;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -311609014:
                case 609397971:
                    sArr2 = f53764;
                    i12 = 1;
                    i13 = 3;
                    if (C3286.f12186) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹֡") ^ i3;
                        i = ((iM45029 ^ i4) * (-10231)) ^ (-1493640773);
                        i2 = 2083788959;
                    } else {
                        iM45029 = C19806.m45029("۬᩷") ^ i3;
                        i = ((iM45029 ^ i4) * 26663) ^ 1856258496;
                        i2 = 619337887;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -51375624:
                case 34633287:
                    i10 = s * s2;
                    if (C0817.m3399()) {
                        iM45029 = (C19806.m45029("ۗ۟") ^ i3) * (-107);
                        i = ((iM45029 ^ i4) * (-32407)) ^ 1291407607;
                        i2 = 1042429678;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰܰ") ^ i4;
                        i = ((iM45029 ^ i3) * (-6001)) ^ (-1699621712);
                        i2 = -1331638609;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 273914850:
                case 691094262:
                    if (C0526.m2437() < 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("֡ۤ")) * (-51);
                        i = ((iM45029 ^ i4) * (-10965)) ^ 1535585826;
                        i2 = -137085590;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹֡") ^ i3;
                        i = ((iM45029 ^ i4) * (-10231)) ^ (-1493640773);
                        i2 = 2083788959;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 333845507:
                case 1840014343:
                    strM9869 = ViewTreeObserverOnPreDrawListenerC3327.m9869(sArr2, i12, i13, i11);
                    if (C3660.f13403 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰܰ") ^ i4;
                        i = ((iM45029 ^ i3) * (-6001)) ^ (-1699621712);
                        i2 = -1331638609;
                    } else {
                        iM45029 = C19806.m45029("֨ۡ") ^ i3;
                        i = ((iM45029 ^ i4) * (-9949)) ^ 561404595;
                        i2 = 1978183729;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 396104662:
                case 1469588909:
                    sArr = f53764;
                    if (C1398.f5802 <= 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۖۛ")) * (-109);
                        i = ((iM45029 ^ i3) * (-21395)) ^ (-2139381006);
                        i2 = 516563163;
                    } else {
                        iM45029 = (C19806.m45029("ۡܿ") ^ i4) * 101;
                        i = ((iM45029 ^ i3) * (-25353)) ^ (-1300837348);
                        i2 = -874005837;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 473340834:
                case 843486192:
                    s = sArr[c];
                    if (C2124.f7782 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰܰ") ^ i4;
                        i = ((iM45029 ^ i3) * (-6001)) ^ (-1699621712);
                        i2 = -1331638609;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۗ") + i4) * 119;
                        i = ((iM45029 ^ i3) * 25897) ^ 1018624688;
                        i2 = 431093250;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 589411781:
                case 1637226873:
                    if (i9 - (i10 + 1) < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨۚ") + i4) * 9;
                        i = ((iM45029 ^ i3) * (-11233)) ^ 46447975;
                        i2 = -1610528517;
                    } else {
                        iM45029 = C19806.m45029("ۗ᩵") ^ i3;
                        i = ((iM45029 ^ i4) * 10377) ^ 716824198;
                        i2 = -1964907279;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 812929585:
                case 1098555937:
                    i8 = s + 1;
                    if (C0671.f2816 != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ۧ") + i4) * (-83);
                        i = ((iM45029 ^ i3) * 20247) ^ (-1477279948);
                        i2 = -1841661530;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠ۚ") ^ i3;
                        i = ((iM45029 ^ i4) * 23863) ^ (-33801963);
                        i2 = 700482371;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1018088347:
                case 1736841698:
                    iM11307 = 2123256891 ^ ThreadFactoryC3888.m11306(strM9869);
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۖۛ")) * (-109);
                        i = ((iM45029 ^ i3) * (-21395)) ^ (-2139381006);
                        i2 = 516563163;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ᩶") ^ i4;
                        i = ((iM45029 ^ i3) * 9121) ^ 976828240;
                        i2 = 971432786;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    C1377.m4841(this, iM11307);
                    sArr3 = f53764;
                    i7 = 4;
                    if (C1461.f5957 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹֡") ^ i3;
                        i = ((iM45029 ^ i4) * (-10231)) ^ (-1493640773);
                        i2 = 2083788959;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۢ") ^ i3;
                        i = ((iM45029 ^ i4) * (-20057)) ^ (-1195317068);
                        i2 = -841870733;
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
    public final void mo3079(C5202 c5202) {
        AbstractC20745 abstractC20745 = null;
        int i = -1533288675;
        int i2 = C3535.f13026;
        int i3 = C1148.f5161;
        int iM11306 = ThreadFactoryC3888.m11306("ۙۤ") ^ i2;
        int i4 = ((iM11306 ^ i3) * (-10875)) ^ 158492724;
        int i5 = 438409804;
        while (true) {
            i = ((((i ^ i3) * (-17565)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2096498055:
                case 422647278:
                    if (C1398.f5802 <= 0) {
                        iM11306 = (C19806.m45029("ܽ᩷") ^ i2) * 21;
                        i4 = ((iM11306 ^ i3) * (-28161)) ^ 1715359929;
                        i5 = 323779910;
                    } else {
                        iM11306 = C19806.m45029("ۚܺ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22511)) ^ 999883177;
                        i5 = -706563212;
                    }
                    break;
                case -2087515061:
                case 1253607563:
                    C0797.m3359();
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧᩴ") ^ i3) * (-93);
                        i4 = ((iM11306 ^ i2) * 5253) ^ (-1781203378);
                        i5 = 1515753308;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֡֡") + i2) * (-93);
                        i4 = ((iM11306 ^ i3) * (-23397)) ^ 1538879503;
                        i5 = -1207353868;
                    }
                    break;
                case -1824422679:
                case 650198968:
                    CallableC1627.m5507();
                    if (C7105.f23796 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-27445)) ^ 1624433231;
                        i5 = 1170142848;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧᩴ") ^ i3) * (-93);
                        i4 = ((iM11306 ^ i2) * 5253) ^ (-1781203378);
                        i5 = 1515753308;
                    }
                    break;
                case -1437518541:
                case -867620030:
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-27445)) ^ 1624433231;
                        i5 = 1170142848;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * 10773) ^ (-491720830);
                        i5 = -1920795461;
                    }
                    break;
                case -1320144972:
                case -115299664:
                    if (CallableC1627.m5507() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧᩴ") ^ i3) * (-93);
                        i4 = ((iM11306 ^ i2) * 5253) ^ (-1781203378);
                        i5 = 1515753308;
                    } else {
                        iM11306 = (C19806.m45029("֫۬") + i2) * 17;
                        i4 = ((iM11306 ^ i3) * (-8163)) ^ (-486451972);
                        i5 = -554048327;
                    }
                    break;
                case -1244002294:
                case 360081540:
                    if (RunnableC1606.m5473() != 0) {
                        iM11306 = C19806.m45029("᩶֫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-21757)) ^ 2057253863;
                        i5 = 889777305;
                    } else {
                        iM11306 = C19806.m45029("᩸۬") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24797)) ^ (-2098332747);
                        i5 = 253795900;
                    }
                    break;
                case -1155706883:
                case 243497778:
                    if (C1461.m5079(c5202)) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۘ۫")) * (-15);
                        i4 = ((iM11306 ^ i2) * 31639) ^ (-1439464709);
                        i5 = -522090133;
                    } else {
                        iM11306 = C19806.m45029("ܿۚ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-3473)) ^ (-1796484722);
                        i5 = 1679706087;
                    }
                    break;
                case -1133132279:
                case -282177533:
                    if (CallableC1627.f6528) {
                        iM11306 = C19806.m45029("ۧۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 6927) ^ 205895609;
                        i5 = 1365482495;
                    } else {
                        iM11306 = (C19806.m45029("ܽ᩷") ^ i2) * 21;
                        i4 = ((iM11306 ^ i3) * (-28161)) ^ 1715359929;
                        i5 = 323779910;
                    }
                    break;
                case -1042187390:
                case 1382147465:
                    C1875.m6086();
                    C3660.m10791();
                    break;
                case -834915473:
                case 582487012:
                    C0629.m2907();
                    if (!C19806.f63586) {
                        iM11306 = C19806.m45029("᩶֫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-21757)) ^ 2057253863;
                        i5 = 889777305;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֡֡") + i2) * (-93);
                        i4 = ((iM11306 ^ i3) * (-23397)) ^ 1538879503;
                        i5 = -1207353868;
                    }
                    break;
                case -574003776:
                case 1006541955:
                    abstractC20745 = this.f53765;
                    if (abstractC20745 != null) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܶ᩶") ^ i2) * (-105);
                        i4 = ((iM11306 ^ i3) * (-16325)) ^ (-257290636);
                        i5 = -485593278;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۘ۫")) * (-15);
                        i4 = ((iM11306 ^ i2) * 31639) ^ (-1439464709);
                        i5 = -522090133;
                    }
                    break;
                case -231648819:
                case 1278712274:
                    if (C3286.m9798() <= 0) {
                        iM11306 = C19806.m45029("᩶֫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-21757)) ^ 2057253863;
                        i5 = 889777305;
                    } else {
                        iM11306 = (C19806.m45029("۬ۡ") + i2) * 109;
                        i4 = ((iM11306 ^ i3) * 1711) ^ 1150944419;
                        i5 = -945714048;
                    }
                    break;
                case -139621421:
                case 1170308472:
                    if (C1377.f5749) {
                        iM11306 = C19806.m45029("ܰ᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * 6319) ^ (-1597157577);
                        i5 = 1205168299;
                    } else {
                        iM11306 = C19806.m45029("᩶֫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-21757)) ^ 2057253863;
                        i5 = 889777305;
                    }
                    break;
                case -88239003:
                case 1338036747:
                    RunnableC3388.m10052(abstractC20745);
                    iM11306 = (i3 - ThreadFactoryC3888.m11306("ۘ۫")) * (-15);
                    i4 = ((iM11306 ^ i2) * 31639) ^ (-1439464709);
                    i5 = -522090133;
                    break;
                case 181425726:
                case 1888549039:
                    if (C1875.f7103 >= 0) {
                        iM11306 = (C19806.m45029("ܽ᩷") ^ i2) * 21;
                        i4 = ((iM11306 ^ i3) * (-28161)) ^ 1715359929;
                        i5 = 323779910;
                    } else {
                        iM11306 = (C19806.m45029("ۛۙ") + i2) * 61;
                        i4 = ((iM11306 ^ i3) * 13753) ^ 2037593256;
                        i5 = -2057463621;
                    }
                    break;
                case 353247824:
                case 973959391:
                    RunnableC1895.m6170();
                    iM11306 = (ThreadFactoryC3888.m11306("ۧᩴ") ^ i3) * (-93);
                    i4 = ((iM11306 ^ i2) * 5253) ^ (-1781203378);
                    i5 = 1515753308;
                    break;
                case 406171122:
                case 1469045543:
                    if (C1398.f5802 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧᩴ") ^ i3) * (-93);
                        i4 = ((iM11306 ^ i2) * 5253) ^ (-1781203378);
                        i5 = 1515753308;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚ֨") + i3) * (-101);
                        i4 = ((iM11306 ^ i2) * 26889) ^ 2094096268;
                        i5 = 1690650343;
                    }
                    break;
                case 1109547001:
                case 1684790527:
                    C2788.m8475();
                    break;
                default:
                    if (C0797.f3386) {
                        iM11306 = (C19806.m45029("ܽ᩷") ^ i2) * 21;
                        i4 = ((iM11306 ^ i3) * (-28161)) ^ 1715359929;
                        i5 = 323779910;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖ᩹") ^ i3;
                        i4 = ((iM11306 ^ i2) * 14459) ^ (-1663798925);
                        i5 = -1868700793;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final C5202 mo3077() {
        int iM11306;
        int i;
        int i2;
        String[] strArrM41566;
        short[] sArr;
        int i3;
        int i4;
        C14558 c14558M41593;
        short s;
        short[] sArr2;
        int i5;
        AbstractC17131 abstractC17131;
        String[] strArr;
        int i6;
        int i7;
        int i8;
        short[] sArr3;
        int i9;
        int i10;
        short[] sArr4;
        int iM45029;
        int i11;
        int i12;
        AbstractC17131 abstractC17132;
        int iM11307;
        int i13;
        int iM11308;
        int i14;
        int i15;
        C14558 c14558;
        int i16;
        C14558 c14559;
        short[] sArr5;
        int i17;
        AbstractC17131 abstractC17133;
        String[] strArr2;
        int i18;
        int i19;
        int i20;
        short[] sArr6;
        short s2;
        int iM450210;
        int i21;
        int i22;
        int iM450211;
        int i23;
        this = this;
        String[] strArr3 = null;
        C14558 c145510 = null;
        int i24 = 0;
        boolean z = false;
        boolean z2 = false;
        C0556 c0556 = null;
        int i25 = 0;
        AbstractC20745 abstractC20745M10895 = null;
        AbstractC20745 abstractC20745M46692 = null;
        long j = 0;
        int i26 = 0;
        int i27 = 783660975;
        int i28 = RunnableC3388.f12514;
        int i29 = C0050.f912;
        int iM450212 = (C19806.m45029("᩻ۡ") ^ i28) * (-123);
        int i30 = ((iM450212 ^ i29) * 713) ^ 1395310484;
        int i31 = iM450212 ^ 54612983;
        AbstractC17131 abstractC17131M35031 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        int i32 = 0;
        char c = 0;
        short s3 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        boolean zM7070 = false;
        while (true) {
            i27 = i31 ^ (i30 & (((i27 ^ i29) * (-22627)) >> 31));
            switch (i27) {
                case -1965010297:
                case 1023620734:
                    C0629.m2907();
                    C2249.m6915();
                    return null;
                case -1846509797:
                case 147050663:
                    c145510 = c145510;
                    this.f53768 = C8516.m22238(j, strArr3.length);
                    if (zM7070) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜ᩷") ^ i29) * (-113);
                        i = ((iM11306 ^ i28) * (-11965)) ^ (-1842673187);
                        i2 = -1472479634;
                    } else {
                        iM11306 = (C19806.m45029("᩺᩷") + i28) * (-79);
                        i = ((iM11306 ^ i29) * 15531) ^ (-1873137857);
                        i2 = -128897682;
                    }
                    i16 = iM11306 ^ i2;
                    c14558 = c145510;
                    i31 = i16;
                    i30 = i;
                    c145510 = c14558;
                    break;
                case -1844837995:
                case 2006520884:
                    sArr = sArr9;
                    i3 = i35;
                    i4 = i36;
                    strArrM41566 = this.m41566(C3535.m10423(sArr, i3, i4, i32));
                    c14558M41593 = m41593();
                    abstractC17131M35031 = c14558M41593.m35031();
                    if (C0278.f1572 <= 0) {
                        int iM11309 = ThreadFactoryC3888.m11306("۠ۡ") ^ i28;
                        short[] sArr11 = sArr;
                        i30 = ((iM11309 ^ i29) * (-7477)) ^ 291076934;
                        i31 = iM11309 ^ 350256953;
                        i35 = i3;
                        c145510 = c14558M41593;
                        sArr9 = sArr11;
                        i36 = i4;
                        strArr3 = strArrM41566;
                    } else {
                        int iM450213 = C19806.m45029("ܰ֫") ^ i28;
                        i31 = iM450213 ^ 1210881026;
                        i30 = ((iM450213 ^ i29) * (-18703)) ^ 435027194;
                        strArr3 = strArrM41566;
                        i35 = i3;
                        c145510 = c14558M41593;
                        sArr9 = sArr;
                        i36 = i4;
                    }
                    break;
                case -1836210005:
                case 209667511:
                    i32 = 61989;
                    iM450211 = (i28 - C19806.m45029("֡ۧ")) * 123;
                    i14 = ((iM450211 ^ i29) * 13993) ^ 1735921457;
                    i23 = 524739963;
                    int i37 = iM450211 ^ i23;
                    abstractC17131M35031 = abstractC17131M35031;
                    sArr9 = sArr9;
                    i34 = i34;
                    i36 = i36;
                    c145510 = c145510;
                    i31 = i37;
                    i35 = i35;
                    this = this;
                    i33 = i33;
                    strArr3 = strArr3;
                    sArr8 = sArr8;
                    i30 = i14;
                    break;
                case -1813750347:
                case -233228619:
                    c14559 = c145510;
                    sArr5 = sArr8;
                    i17 = i34;
                    abstractC17133 = abstractC17131M35031;
                    strArr2 = strArr3;
                    i18 = i33;
                    i19 = i35;
                    i20 = i36;
                    sArr6 = sArr9;
                    s2 = sArr7[c];
                    i26 = s2 * s2;
                    if (C1977.f7413 <= 0) {
                        iM450210 = (i29 - C19806.m45029("ᩳܿ")) * (-61);
                        i21 = ((iM450210 ^ i28) * 2141) ^ 1918604609;
                        i22 = -8969467;
                    } else {
                        iM450210 = (C19806.m45029("ۘ۬") + i29) * (-35);
                        i21 = ((iM450210 ^ i28) * (-11125)) ^ 1241617175;
                        i22 = -1952891429;
                    }
                    int i38 = iM450210 ^ i22;
                    abstractC17131M35031 = abstractC17133;
                    sArr9 = sArr6;
                    i34 = i17;
                    i36 = i20;
                    c145510 = c14559;
                    i31 = i38;
                    i30 = i21;
                    i35 = i19;
                    i33 = i18;
                    strArr3 = strArr2;
                    sArr8 = sArr5;
                    s3 = s2;
                    this = this;
                    break;
                case -1745079986:
                case -56702889:
                    if (C3577.m10564(this)) {
                        iM11308 = C19806.m45029("ᩴ᩵") ^ i29;
                        i14 = ((iM11308 ^ i28) * (-26527)) ^ (-1585611275);
                        i15 = 1416593897;
                    } else {
                        iM11308 = C19806.m45029("ۢ֡") ^ i29;
                        i14 = ((iM11308 ^ i28) * 20831) ^ 986430829;
                        i15 = 367175190;
                    }
                    i31 = iM11308 ^ i15;
                    i30 = i14;
                    break;
                case -1637148834:
                case -914701594:
                    C13072.m32284(this.f53769, this.f53765, c145510, z, c0556);
                    iM11308 = (C19806.m45029("ۚۜ") + i29) * (-47);
                    i14 = ((iM11308 ^ i28) * (-22441)) ^ 99528447;
                    i15 = -1812377733;
                    i31 = iM11308 ^ i15;
                    i30 = i14;
                    break;
                case -1584873303:
                case -178644040:
                    strArr = strArr3;
                    c145510 = c145510;
                    i7 = i35;
                    i8 = i36;
                    abstractC17131 = abstractC17131M35031;
                    sArr3 = sArr9;
                    sArr4 = f53764;
                    i9 = 29;
                    i10 = 9;
                    if (RunnableC1606.f6488 >= 0) {
                        s = s3;
                        int iM113010 = (ThreadFactoryC3888.m11306("ۚ۟") + i29) * (-97);
                        short[] sArr12 = sArr4;
                        int i39 = ((iM113010 ^ i28) * (-22437)) ^ 272865896;
                        i12 = iM113010 ^ 627431841;
                        abstractC17131M35031 = abstractC17131;
                        sArr9 = sArr3;
                        i34 = i10;
                        strArr3 = strArr;
                        i36 = i8;
                        sArr8 = sArr12;
                        i35 = i7;
                        i33 = i9;
                        s3 = s;
                        i30 = i39;
                    } else {
                        int iM113011 = ThreadFactoryC3888.m11306("ܺ᩷") ^ i29;
                        int i40 = ((iM113011 ^ i28) * (-25147)) ^ (-946289894);
                        i12 = iM113011 ^ (-2022692717);
                        i30 = i40;
                        strArr3 = strArr;
                        abstractC17131M35031 = abstractC17131;
                        sArr9 = sArr3;
                        i34 = 9;
                        sArr8 = sArr4;
                        i36 = i8;
                        i35 = i7;
                        i33 = 29;
                    }
                    c14558 = c145510;
                    i31 = i12;
                    c145510 = c14558;
                    break;
                case -1255392749:
                case 636046688:
                    C2477.m7593();
                    if (!C1419.m4973()) {
                        strArrM41566 = strArr3;
                        sArr = sArr9;
                        i4 = i36;
                        c14558M41593 = c145510;
                        i3 = i35;
                        int iM113012 = ThreadFactoryC3888.m11306("۠ۡ") ^ i28;
                        short[] sArr13 = sArr;
                        i30 = ((iM113012 ^ i29) * (-7477)) ^ 291076934;
                        i31 = iM113012 ^ 350256953;
                        i35 = i3;
                        c145510 = c14558M41593;
                        sArr9 = sArr13;
                        i36 = i4;
                        strArr3 = strArrM41566;
                    } else {
                        c145510 = c145510;
                        abstractC17132 = abstractC17131M35031;
                        iM11307 = ThreadFactoryC3888.m11306("᩶ۙ") ^ i28;
                        i = ((iM11307 ^ i29) * 5593) ^ 1181218252;
                        i13 = 592242784;
                        i16 = iM11307 ^ i13;
                        abstractC17131M35031 = abstractC17132;
                        c14558 = c145510;
                        i31 = i16;
                        i30 = i;
                        c145510 = c14558;
                    }
                    break;
                case -1166839150:
                case -1032444799:
                    c145510 = c145510;
                    abstractC17132 = abstractC17131M35031;
                    sArr9 = f53764;
                    i35 = 38;
                    i36 = 9;
                    if (RunnableC3388.f12514 >= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("᩶ۙ") ^ i28;
                        i = ((iM11307 ^ i29) * 5593) ^ 1181218252;
                        i13 = 592242784;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ۨ᩻") + i28) * 21;
                        i = ((iM11307 ^ i29) * 24105) ^ 1880504544;
                        i13 = -2118220658;
                    }
                    i16 = iM11307 ^ i13;
                    abstractC17131M35031 = abstractC17132;
                    c14558 = c145510;
                    i31 = i16;
                    i30 = i;
                    c145510 = c14558;
                    break;
                case -1143836703:
                case -46881768:
                    c145510 = c145510;
                    this.f53765 = abstractC20745M46692;
                    this.mo21457(C3743.m10959(this.f53769));
                    j = i25;
                    if (!RunnableC1564.f6300) {
                        iM11306 = C19806.m45029("ᩳ᩶") ^ i28;
                        i = ((iM11306 ^ i29) * (-28965)) ^ (-283638183);
                        i2 = 267632839;
                        i16 = iM11306 ^ i2;
                        c14558 = c145510;
                        i31 = i16;
                        i30 = i;
                        c145510 = c14558;
                    }
                    s = s3;
                    sArr4 = sArr8;
                    i9 = i33;
                    i7 = i35;
                    i8 = i36;
                    strArr = strArr3;
                    i10 = i34;
                    sArr3 = sArr9;
                    abstractC17131 = abstractC17131M35031;
                    int iM113013 = (ThreadFactoryC3888.m11306("ۚ۟") + i29) * (-97);
                    short[] sArr14 = sArr4;
                    int i310 = ((iM113013 ^ i28) * (-22437)) ^ 272865896;
                    i12 = iM113013 ^ 627431841;
                    abstractC17131M35031 = abstractC17131;
                    sArr9 = sArr3;
                    i34 = i10;
                    strArr3 = strArr;
                    i36 = i8;
                    sArr8 = sArr14;
                    i35 = i7;
                    i33 = i9;
                    s3 = s;
                    i30 = i310;
                    c14558 = c145510;
                    i31 = i12;
                    c145510 = c14558;
                    break;
                case -1118887172:
                case 1942611607:
                    C1189.m4368();
                    strArrM41566 = strArr3;
                    sArr = sArr9;
                    i4 = i36;
                    c14558M41593 = c145510;
                    i3 = i35;
                    int iM113014 = ThreadFactoryC3888.m11306("۠ۡ") ^ i28;
                    short[] sArr15 = sArr;
                    i30 = ((iM113014 ^ i29) * (-7477)) ^ 291076934;
                    i31 = iM113014 ^ 350256953;
                    i35 = i3;
                    c145510 = c14558M41593;
                    sArr9 = sArr15;
                    i36 = i4;
                    strArr3 = strArrM41566;
                    break;
                case -1101689659:
                case 1035650634:
                    c145510 = c145510;
                    this.f53766 = z2;
                    this.f53770 = strArr3.length;
                    if (C1148.f5161 > 0) {
                        iM11306 = (C19806.m45029("ۜܺ") + i28) * (-51);
                        i = ((iM11306 ^ i29) * 13327) ^ 371590924;
                        i2 = -1631540363;
                        i16 = iM11306 ^ i2;
                        c14558 = c145510;
                        i31 = i16;
                        i30 = i;
                        c145510 = c14558;
                    }
                    abstractC17132 = abstractC17131M35031;
                    iM11307 = ThreadFactoryC3888.m11306("᩶ۙ") ^ i28;
                    i = ((iM11307 ^ i29) * 5593) ^ 1181218252;
                    i13 = 592242784;
                    i16 = iM11307 ^ i13;
                    abstractC17131M35031 = abstractC17132;
                    c14558 = c145510;
                    i31 = i16;
                    i30 = i;
                    c145510 = c14558;
                    break;
                case -989929646:
                case 985899416:
                    if (!C21512.m48160(C2642.m8160(this.f53769), z).m48184()) {
                        iM11308 = ThreadFactoryC3888.m11306("ܺۤ") ^ i28;
                        i14 = ((iM11308 ^ i29) * (-30897)) ^ (-546087956);
                        i15 = -1697545653;
                        i31 = iM11308 ^ i15;
                        i30 = i14;
                    } else {
                        c145510 = c145510;
                        iM11306 = (ThreadFactoryC3888.m11306("ۜ᩷") ^ i29) * (-113);
                        i = ((iM11306 ^ i28) * (-11965)) ^ (-1842673187);
                        i2 = -1472479634;
                        i16 = iM11306 ^ i2;
                        c14558 = c145510;
                        i31 = i16;
                        i30 = i;
                        c145510 = c14558;
                    }
                    break;
                case -977715951:
                case -390964222:
                    c145510 = c145510;
                    abstractC20745M10895 = C3722.m10895(strArr3[i25], new String[i24]);
                    this.f53769 = abstractC20745M10895;
                    sArr10 = f53764;
                    if (RunnableC1606.f6488 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۜۡ") ^ i29;
                        i = ((iM11306 ^ i28) * 22273) ^ (-744951395);
                        i2 = 595711814;
                        i16 = iM11306 ^ i2;
                        c14558 = c145510;
                        i31 = i16;
                        i30 = i;
                        c145510 = c14558;
                    } else {
                        strArrM41566 = strArr3;
                        sArr = sArr9;
                        i3 = i35;
                        i4 = i36;
                        c14558M41593 = c145510;
                        int iM113015 = ThreadFactoryC3888.m11306("۠ۡ") ^ i28;
                        short[] sArr16 = sArr;
                        i30 = ((iM113015 ^ i29) * (-7477)) ^ 291076934;
                        i31 = iM113015 ^ 350256953;
                        i35 = i3;
                        c145510 = c14558M41593;
                        sArr9 = sArr16;
                        i36 = i4;
                        strArr3 = strArrM41566;
                    }
                    break;
                case -907143034:
                case 459580108:
                    c0556 = new C0556(this);
                    i25 = 0;
                    iM11306 = (i29 - ThreadFactoryC3888.m11306("ۧܶ")) * (-63);
                    i = ((iM11306 ^ i28) * (-24859)) ^ (-350477867);
                    i2 = 1603504374;
                    i16 = iM11306 ^ i2;
                    c14558 = c145510;
                    i31 = i16;
                    i30 = i;
                    c145510 = c14558;
                    break;
                case -883274995:
                case 1224554610:
                    c145510 = c145510;
                    sArr8 = sArr8;
                    i34 = i34;
                    abstractC17131M35031 = abstractC17131M35031;
                    strArr3 = strArr3;
                    i33 = i33;
                    i35 = i35;
                    i36 = i36;
                    sArr9 = sArr9;
                    zM7070 = C2332.m7070(this, C1937.m6288(sArr8, i33, i34, i32));
                    if (C1419.f5860 < 0) {
                        iM450211 = (ThreadFactoryC3888.m11306("ۡܺ") + i29) * 15;
                        i14 = ((iM450211 ^ i28) * (-891)) ^ (-607203884);
                        i23 = -856121866;
                        int i311 = iM450211 ^ i23;
                        abstractC17131M35031 = abstractC17131M35031;
                        sArr9 = sArr9;
                        i34 = i34;
                        i36 = i36;
                        c145510 = c145510;
                        i31 = i311;
                        i35 = i35;
                        this = this;
                        i33 = i33;
                        strArr3 = strArr3;
                        sArr8 = sArr8;
                        i30 = i14;
                    } else {
                        int iM450214 = C19806.m45029("᩵ۨ") ^ i29;
                        abstractC17131M35031 = abstractC17131M35031;
                        sArr9 = sArr9;
                        i34 = i34;
                        i36 = i36;
                        c145510 = c145510;
                        i31 = iM450214 ^ 1405769844;
                        i35 = i35;
                        i33 = i33;
                        strArr3 = strArr3;
                        sArr8 = sArr8;
                        i30 = ((iM450214 ^ i28) * (-16711)) ^ 1939344949;
                        this = this;
                    }
                    break;
                case -768952446:
                case 447139396:
                    z2 = true;
                    iM11306 = ThreadFactoryC3888.m11306("ۧ֡") ^ i29;
                    i = ((iM11306 ^ i28) * (-1459)) ^ (-1253170175);
                    i2 = 1905296435;
                    i16 = iM11306 ^ i2;
                    c14558 = c145510;
                    i31 = i16;
                    i30 = i;
                    c145510 = c14558;
                    break;
                case -701726266:
                case 1112266635:
                    c145510 = c145510;
                    i24 = 0;
                    z = true;
                    abstractC17132 = abstractC17131M35031;
                    if (abstractC17132 == C20659.m46512()) {
                        iM11307 = (ThreadFactoryC3888.m11306("᩵۫") ^ i28) * 25;
                        i = ((iM11307 ^ i29) * 18085) ^ (-884280340);
                        i13 = 1962411205;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ܿܳ") + i29) * 61;
                        i = ((iM11307 ^ i28) * 17621) ^ (-711514885);
                        i13 = 147984557;
                    }
                    i16 = iM11307 ^ i13;
                    abstractC17131M35031 = abstractC17132;
                    c14558 = c145510;
                    i31 = i16;
                    i30 = i;
                    c145510 = c14558;
                    break;
                case -616847815:
                case 781187126:
                    z2 = false;
                    iM11306 = ThreadFactoryC3888.m11306("ۧ֡") ^ i29;
                    i = ((iM11306 ^ i28) * (-1459)) ^ (-1253170175);
                    i2 = 1905296435;
                    i16 = iM11306 ^ i2;
                    c14558 = c145510;
                    i31 = i16;
                    i30 = i;
                    c145510 = c14558;
                    break;
                case -480344806:
                case 1506338058:
                    C3660.m10788(this.f53767, C3743.m10959(this.f53765));
                    i25++;
                    iM11306 = (i29 - ThreadFactoryC3888.m11306("ۧܶ")) * (-63);
                    i = ((iM11306 ^ i28) * (-24859)) ^ (-350477867);
                    i2 = 1603504374;
                    i16 = iM11306 ^ i2;
                    c14558 = c145510;
                    i31 = i16;
                    i30 = i;
                    c145510 = c14558;
                    break;
                case -377874844:
                case 1873515808:
                    c145510 = c145510;
                    abstractC20745M46692 = abstractC20745M10895.m46692(C1377.m4832(sArr10, 47, 5, i32));
                    if (C3577.f13150 < 0) {
                        iM11306 = C19806.m45029("֨ܳ") ^ i28;
                        i = ((iM11306 ^ i29) * 13847) ^ (-1438804824);
                        i2 = 634530005;
                        i16 = iM11306 ^ i2;
                        c14558 = c145510;
                        i31 = i16;
                        i30 = i;
                        c145510 = c14558;
                    } else {
                        sArr8 = sArr8;
                        i34 = i34;
                        abstractC17131M35031 = abstractC17131M35031;
                        strArr3 = strArr3;
                        i33 = i33;
                        i35 = i35;
                        i36 = i36;
                        sArr9 = sArr9;
                        int iM450215 = C19806.m45029("᩵ۨ") ^ i29;
                        abstractC17131M35031 = abstractC17131M35031;
                        sArr9 = sArr9;
                        i34 = i34;
                        i36 = i36;
                        c145510 = c145510;
                        i31 = iM450215 ^ 1405769844;
                        i35 = i35;
                        i33 = i33;
                        strArr3 = strArr3;
                        sArr8 = sArr8;
                        i30 = ((iM450215 ^ i28) * (-16711)) ^ 1939344949;
                        this = this;
                    }
                    break;
                case -302992703:
                case 1709448275:
                    if (C0629.f2722 > 0) {
                        c145510 = c145510;
                        s = s3;
                        sArr4 = sArr8;
                        i9 = i33;
                        i7 = i35;
                        i8 = i36;
                        strArr = strArr3;
                        i10 = i34;
                        sArr3 = sArr9;
                        abstractC17131 = abstractC17131M35031;
                        int iM113016 = (ThreadFactoryC3888.m11306("ۚ۟") + i29) * (-97);
                        short[] sArr17 = sArr4;
                        int i312 = ((iM113016 ^ i28) * (-22437)) ^ 272865896;
                        i12 = iM113016 ^ 627431841;
                        abstractC17131M35031 = abstractC17131;
                        sArr9 = sArr3;
                        i34 = i10;
                        strArr3 = strArr;
                        i36 = i8;
                        sArr8 = sArr17;
                        i35 = i7;
                        i33 = i9;
                        s3 = s;
                        i30 = i312;
                        c14558 = c145510;
                        i31 = i12;
                        c145510 = c14558;
                    }
                    c145510 = c145510;
                    abstractC17132 = abstractC17131M35031;
                    iM11307 = ThreadFactoryC3888.m11306("᩶ۙ") ^ i28;
                    i = ((iM11307 ^ i29) * 5593) ^ 1181218252;
                    i13 = 592242784;
                    i16 = iM11307 ^ i13;
                    abstractC17131M35031 = abstractC17132;
                    c14558 = c145510;
                    i31 = i16;
                    i30 = i;
                    c145510 = c14558;
                    break;
                case -214757123:
                case 689434133:
                    i32 = 5188;
                    iM450211 = (i28 - C19806.m45029("֡ۧ")) * 123;
                    i14 = ((iM450211 ^ i29) * 13993) ^ 1735921457;
                    i23 = 524739963;
                    int i313 = iM450211 ^ i23;
                    abstractC17131M35031 = abstractC17131M35031;
                    sArr9 = sArr9;
                    i34 = i34;
                    i36 = i36;
                    c145510 = c145510;
                    i31 = i313;
                    i35 = i35;
                    this = this;
                    i33 = i33;
                    strArr3 = strArr3;
                    sArr8 = sArr8;
                    i30 = i14;
                    break;
                case -178707365:
                case 496386016:
                    c145510 = c145510;
                    short[] sArr18 = sArr8;
                    i5 = i34;
                    abstractC17131 = abstractC17131M35031;
                    strArr = strArr3;
                    i6 = i33;
                    i7 = i35;
                    i8 = i36;
                    sArr3 = sArr9;
                    s = s3;
                    sArr2 = sArr18;
                    if ((i26 + 51998521) - (s * 14422) >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡᩺") ^ i29;
                        i30 = ((iM45029 ^ i28) * (-7221)) ^ 163467071;
                        i11 = -1088863769;
                    } else {
                        iM45029 = C19806.m45029("ۙۡ") ^ i28;
                        i30 = ((iM45029 ^ i29) * (-10577)) ^ 927811920;
                        i11 = 210600508;
                    }
                    int i41 = iM45029 ^ i11;
                    abstractC17131M35031 = abstractC17131;
                    sArr9 = sArr3;
                    i34 = i5;
                    i36 = i8;
                    c145510 = c145510;
                    i31 = i41;
                    i35 = i7;
                    this = this;
                    i33 = i6;
                    strArr3 = strArr;
                    sArr8 = sArr2;
                    s3 = s;
                    break;
                case 80844062:
                case 1712114392:
                    C23730.m52263(this.f53769, this.f53765, c145510, c0556);
                    iM11308 = (C19806.m45029("ۚۜ") + i29) * (-47);
                    i14 = ((iM11308 ^ i28) * (-22441)) ^ 99528447;
                    i15 = -1812377733;
                    i31 = iM11308 ^ i15;
                    i30 = i14;
                    break;
                case 116212345:
                case 1816441484:
                    C2642.m8171();
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        c14559 = c145510;
                        s2 = s3;
                        sArr5 = sArr8;
                        i17 = i34;
                        abstractC17133 = abstractC17131M35031;
                        strArr2 = strArr3;
                        i18 = i33;
                        i19 = i35;
                        i20 = i36;
                        sArr6 = sArr9;
                        iM450210 = (i29 - C19806.m45029("ᩳܿ")) * (-61);
                        i21 = ((iM450210 ^ i28) * 2141) ^ 1918604609;
                        i22 = -8969467;
                        int i314 = iM450210 ^ i22;
                        abstractC17131M35031 = abstractC17133;
                        sArr9 = sArr6;
                        i34 = i17;
                        i36 = i20;
                        c145510 = c14559;
                        i31 = i314;
                        i30 = i21;
                        i35 = i19;
                        i33 = i18;
                        strArr3 = strArr2;
                        sArr8 = sArr5;
                        s3 = s2;
                        this = this;
                    } else {
                        strArrM41566 = strArr3;
                        sArr = sArr9;
                        i4 = i36;
                        c14558M41593 = c145510;
                        i3 = i35;
                        int iM113017 = ThreadFactoryC3888.m11306("۠ۡ") ^ i28;
                        short[] sArr19 = sArr;
                        i30 = ((iM113017 ^ i29) * (-7477)) ^ 291076934;
                        i31 = iM113017 ^ 350256953;
                        i35 = i3;
                        c145510 = c14558M41593;
                        sArr9 = sArr19;
                        i36 = i4;
                        strArr3 = strArrM41566;
                    }
                    break;
                case 393012266:
                case 1874432272:
                    c145510 = c145510;
                    s = s3;
                    sArr2 = sArr8;
                    i5 = i34;
                    abstractC17131 = abstractC17131M35031;
                    strArr = strArr3;
                    i6 = i33;
                    i7 = i35;
                    i8 = i36;
                    sArr3 = sArr9;
                    sArr7 = f53764;
                    c = 28;
                    if (C1189.f5284 > 0) {
                        iM45029 = C19806.m45029("۬֨") ^ i28;
                        i30 = ((iM45029 ^ i29) * 23001) ^ (-1626001824);
                        i11 = 1813584694;
                        int i42 = iM45029 ^ i11;
                        abstractC17131M35031 = abstractC17131;
                        sArr9 = sArr3;
                        i34 = i5;
                        i36 = i8;
                        c145510 = c145510;
                        i31 = i42;
                        i35 = i7;
                        this = this;
                        i33 = i6;
                        strArr3 = strArr;
                        sArr8 = sArr2;
                        s3 = s;
                    } else {
                        i9 = i6;
                        i10 = i5;
                        sArr4 = sArr2;
                        int iM113018 = (ThreadFactoryC3888.m11306("ۚ۟") + i29) * (-97);
                        short[] sArr110 = sArr4;
                        int i315 = ((iM113018 ^ i28) * (-22437)) ^ 272865896;
                        i12 = iM113018 ^ 627431841;
                        abstractC17131M35031 = abstractC17131;
                        sArr9 = sArr3;
                        i34 = i10;
                        strArr3 = strArr;
                        i36 = i8;
                        sArr8 = sArr110;
                        i35 = i7;
                        i33 = i9;
                        s3 = s;
                        i30 = i315;
                        c14558 = c145510;
                        i31 = i12;
                        c145510 = c14558;
                    }
                    break;
                case 407262859:
                case 1358355139:
                    this.f53765.mo24644();
                    return AbstractC0464.m2307();
                case 535034500:
                case 1410933414:
                    C2642.m8171();
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11308 = ThreadFactoryC3888.m11306("ܿܶ") ^ i28;
                        i14 = ((iM11308 ^ i29) * 2703) ^ (-2022362569);
                        i15 = 1945150633;
                        i31 = iM11308 ^ i15;
                        i30 = i14;
                    } else {
                        c14559 = c145510;
                        s2 = s3;
                        sArr5 = sArr8;
                        i17 = i34;
                        abstractC17133 = abstractC17131M35031;
                        strArr2 = strArr3;
                        i18 = i33;
                        i19 = i35;
                        i20 = i36;
                        sArr6 = sArr9;
                        iM450210 = (i29 - C19806.m45029("ᩳܿ")) * (-61);
                        i21 = ((iM450210 ^ i28) * 2141) ^ 1918604609;
                        i22 = -8969467;
                        int i316 = iM450210 ^ i22;
                        abstractC17131M35031 = abstractC17133;
                        sArr9 = sArr6;
                        i34 = i17;
                        i36 = i20;
                        c145510 = c14559;
                        i31 = i316;
                        i30 = i21;
                        i35 = i19;
                        i33 = i18;
                        strArr3 = strArr2;
                        sArr8 = sArr5;
                        s3 = s2;
                        this = this;
                    }
                    break;
                case 1301395297:
                case 1882469466:
                    return C5202.m14379();
                default:
                    c145510 = c145510;
                    if (i25 < strArr3.length) {
                        iM11306 = (C19806.m45029("ܽ۬") + i28) * (-103);
                        i = ((iM11306 ^ i29) * 30015) ^ 446348432;
                        i2 = -2047608996;
                    } else {
                        iM11306 = (C19806.m45029("ۜ۟") + i29) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM11306 ^ i28) * 29523) ^ 2060878128;
                        i2 = 1883410871;
                    }
                    i16 = iM11306 ^ i2;
                    c14558 = c145510;
                    i31 = i16;
                    i30 = i;
                    c145510 = c14558;
                    break;
            }
        }
    }
}
