package l;

import android.content.SharedPreferences;
import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ᩳ᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 154F */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC18356 implements Runnable {

    /* JADX INFO: renamed from: ᩵ܶܶ, reason: not valid java name and contains not printable characters */
    private static final short[] f58558 = {1621, -29514, 27515, -28443, -7899, -7898, -7898, -7819, -7897, -7821, -7901, -7903, -7819, -7904, -7818, -7899, -7899, -7823, -7822, -7820, -7897, -7899, -7904, -7904, -7904, -7818, -7898, -7904};

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f58559;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f58560;

    public /* synthetic */ RunnableC18356(int i, Object obj) {
        int i2 = 1298711109;
        int i3 = C3577.f13150;
        int i4 = C3535.f13026;
        this.f58559 = i;
        this.f58560 = obj;
        int iM45029 = (i3 - C19806.m45029("᩺ܰ")) * (-27);
        int i5 = ((iM45029 ^ i4) * (-17043)) ^ (-2041915666);
        int i6 = 1240911814;
        while (true) {
            i2 = (iM45029 ^ i6) ^ (i5 & (((i2 ^ i4) * (-28103)) >> 31));
            switch (i2) {
                case -1706675761:
                case 872147649:
                    return;
                case -1574475984:
                case 862373347:
                    C0962.m3746();
                    throw new RuntimeException();
                case -910873076:
                case -451889249:
                    RunnableC1606.m5473();
                    if (C3577.f13150 >= 0) {
                        iM45029 = (C19806.m45029("ܿۧ") + i4) * 17;
                        i5 = ((iM45029 ^ i3) * (-19861)) ^ (-125105543);
                        i6 = 1659511460;
                    } else {
                        iM45029 = (C19806.m45029("ۤ۟") ^ i3) * (-39);
                        i5 = ((iM45029 ^ i4) * 16141) ^ (-1525709783);
                        i6 = 693476018;
                    }
                    break;
                case -537575935:
                case 1981012720:
                    C2871.m8646();
                    if (C1419.f5860 < 0) {
                        iM45029 = (C19806.m45029("ܿۧ") + i4) * 17;
                        i5 = ((iM45029 ^ i3) * (-19861)) ^ (-125105543);
                        i6 = 1659511460;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ᩺") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-30825)) ^ (-398740338);
                        i6 = -1448556073;
                    }
                    break;
                case -448291849:
                case 677911695:
                    if (C0629.f2722 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰ۬") + i4) * 3;
                        i5 = ((iM45029 ^ i3) * 18417) ^ 85959217;
                        i6 = -88878578;
                    } else {
                        iM45029 = C19806.m45029("ܶ֫") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-1753)) ^ 1661975393;
                        i6 = -978917147;
                    }
                    break;
                case 1140424026:
                case 2046692856:
                    C0629.m2907();
                    if (C2249.m6915() <= 0) {
                        iM45029 = (C19806.m45029("ܿۧ") + i4) * 17;
                        i5 = ((iM45029 ^ i3) * (-19861)) ^ (-125105543);
                        i6 = 1659511460;
                    } else {
                        iM45029 = (i3 - C19806.m45029("֫᩹")) * 37;
                        i5 = ((iM45029 ^ i4) * (-5167)) ^ (-910735145);
                        i6 = -2139593896;
                    }
                    break;
                default:
                    C0629.m2907();
                    C2124.m6673();
                    iM45029 = ThreadFactoryC3888.m11306("ᩳ᩺") ^ i3;
                    i5 = ((iM45029 ^ i4) * (-30825)) ^ (-398740338);
                    i6 = -1448556073;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x009f A[PHI: r6 r7
      0x009f: PHI (r6v3 java.lang.String) = (r6v1 java.lang.String), (r6v2 java.lang.String), (r6v1 java.lang.String) binds: [B:110:0x009f, B:21:0x009d, B:6:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r7v3 int) = (r7v1 int), (r7v2 int), (r7v1 int) binds: [B:110:0x009f, B:21:0x009d, B:6:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x013a A[PHI: r4
      0x013a: PHI (r4v5 int) = (r4v1 int), (r4v3 int), (r4v1 int) binds: [B:109:0x013a, B:35:0x0138, B:6:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02c5 A[PHI: r8 r11 r18 r19 r20 r21 r27
      0x02c5: PHI (r8v4 java.lang.String) = (r8v1 java.lang.String), (r8v2 java.lang.String), (r8v1 java.lang.String), (r8v1 java.lang.String) binds: [B:100:0x02c5, B:99:0x02c5, B:71:0x02c3, B:67:0x02a5] A[DONT_GENERATE, DONT_INLINE]
      0x02c5: PHI (r11v5 int) = (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:100:0x02c5, B:99:0x02c5, B:71:0x02c3, B:67:0x02a5] A[DONT_GENERATE, DONT_INLINE]
      0x02c5: PHI (r18v4 short) = (r18v2 short), (r18v2 short), (r18v3 short), (r18v2 short) binds: [B:100:0x02c5, B:99:0x02c5, B:71:0x02c3, B:67:0x02a5] A[DONT_GENERATE, DONT_INLINE]
      0x02c5: PHI (r19v4 short) = (r19v2 short), (r19v2 short), (r19v3 short), (r19v2 short) binds: [B:100:0x02c5, B:99:0x02c5, B:71:0x02c3, B:67:0x02a5] A[DONT_GENERATE, DONT_INLINE]
      0x02c5: PHI (r20v3 int) = (r20v2 int), (r20v2 int), (r20v2 int), (r20v4 int) binds: [B:100:0x02c5, B:99:0x02c5, B:71:0x02c3, B:67:0x02a5] A[DONT_GENERATE, DONT_INLINE]
      0x02c5: PHI (r21v3 int) = (r21v2 int), (r21v2 int), (r21v2 int), (r21v4 int) binds: [B:100:0x02c5, B:99:0x02c5, B:71:0x02c3, B:67:0x02a5] A[DONT_GENERATE, DONT_INLINE]
      0x02c5: PHI (r27v4 int) = (r27v3 int), (r27v3 int), (r27v3 int), (r27v5 int) binds: [B:100:0x02c5, B:99:0x02c5, B:71:0x02c3, B:67:0x02a5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.lang.Runnable
    public final void run() {
        int iM11306;
        int i;
        int i2;
        int iM45029;
        int i3;
        RunnableC18356 runnableC18356 = this;
        ApplicationC0716 applicationC0716 = null;
        ActivityC20431 activityC20431 = null;
        int iM450210 = 0;
        C10596 c10596 = null;
        String strM1429 = null;
        int i4 = 0;
        String strM4969 = null;
        int i5 = 1166672126;
        int i6 = C1148.f5161;
        int i7 = C2477.f9839;
        int iM450211 = C19806.m45029("ܳۢ") ^ i6;
        int i8 = ((iM450211 ^ i7) * 21975) ^ 32991176;
        int i9 = iM450211 ^ 468799380;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i14 = 0;
        int i15 = 0;
        Object obj = null;
        int i16 = 0;
        while (true) {
            i5 = i9 ^ (i8 & (((i5 ^ i7) * (-25103)) >> 31));
            switch (i5) {
                case -2083011469:
                case 996939328:
                    strM1429 = RunnableC0195.m1429(sArr3, i12, i13, i10);
                    i4 = 1;
                    if (C0278.f1572 <= 0) {
                        iM11306 = (C19806.m45029("ܳ᩵") ^ i7) * (-91);
                        i = ((iM11306 ^ i6) * 19925) ^ (-894448337);
                        i2 = -1752767713;
                    } else {
                        iM11306 = (i6 - C19806.m45029("ܰܶ")) * (-91);
                        i = ((iM11306 ^ i7) * 1851) ^ 1848189337;
                        i2 = -982098638;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -1984111389:
                case 985902779:
                    C1189.m4368();
                    C2477.m7593();
                    iM45029 = (C19806.m45029("ۤ֫") ^ i6) * (-109);
                    i8 = ((iM45029 ^ i7) * 21555) ^ 80748917;
                    i3 = -927689874;
                    i9 = iM45029 ^ i3;
                    runnableC18356 = this;
                    break;
                case -1972271507:
                case -1064900736:
                    int i17 = runnableC18356.f58559;
                    Object obj2 = runnableC18356.f58560;
                    switch (i17) {
                        case 0:
                            int iM11307 = ThreadFactoryC3888.m11306("ܶܺ") ^ i7;
                            i9 = iM11307 ^ 1238492332;
                            i8 = ((iM11307 ^ i6) * 31417) ^ 1873853807;
                            obj = obj2;
                            break;
                        default:
                            int iM11308 = (i7 - ThreadFactoryC3888.m11306("ۢۗ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i8 = ((iM11308 ^ i6) * (-2145)) ^ (-229752615);
                            i9 = iM11308 ^ 1310456287;
                            runnableC18356 = this;
                            obj = obj2;
                            continue;
                    }
                    runnableC18356 = this;
                    break;
                case -1940940792:
                case 1334903049:
                    c = 0;
                    if (C10634.f36300 >= 0) {
                        iM45029 = (C19806.m45029("ۤ֫") ^ i6) * (-109);
                        i8 = ((iM45029 ^ i7) * 21555) ^ 80748917;
                        i3 = -927689874;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۟᩶") ^ i7) * 97;
                        i8 = ((iM45029 ^ i6) * 30729) ^ (-1747744512);
                        i3 = 1581172847;
                    }
                    i9 = iM45029 ^ i3;
                    runnableC18356 = this;
                    break;
                case -1908455629:
                case 707356387:
                    i14 = s * s2;
                    i15 = s * s;
                    i16 = 3229209;
                    if (C0671.f2816 != 0) {
                        iM45029 = C19806.m45029("ܺ᩸") ^ i7;
                        i8 = ((iM45029 ^ i6) * 9497) ^ (-1968529192);
                        i3 = 1427550938;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿۛ") ^ i7;
                        i8 = ((iM45029 ^ i6) * 23899) ^ (-1180131537);
                        i3 = -561668064;
                    }
                    i9 = iM45029 ^ i3;
                    runnableC18356 = this;
                    break;
                case -1865969054:
                case 2133977489:
                    sArr3 = f58558;
                    i12 = 4;
                    i13 = 24;
                    if (C1148.f5161 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚ֫") ^ i6;
                        i = ((iM11306 ^ i7) * 7429) ^ (-1365774517);
                        i2 = 1155502518;
                        i9 = iM11306 ^ i2;
                        i8 = i;
                    } else {
                        iM45029 = (i6 - C19806.m45029("᩵᩸")) * (-109);
                        i8 = ((iM45029 ^ i7) * 20793) ^ (-1697272784);
                        i3 = -286204904;
                        i9 = iM45029 ^ i3;
                        runnableC18356 = this;
                    }
                    break;
                case -1675789079:
                case 899223450:
                    iM450210 = 2126435197 ^ C19806.m45029(strM4969);
                    if (C0050.f912 <= 0) {
                        iM11306 = C19806.m45029("ܿ᩺") ^ i6;
                        i = ((iM11306 ^ i7) * 31013) ^ 658384008;
                        i2 = -2107038066;
                    } else {
                        iM11306 = C19806.m45029("᩹ܰ") ^ i7;
                        i = ((iM11306 ^ i6) * (-6469)) ^ 309583122;
                        i2 = 1605671365;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -1443375026:
                case -826875451:
                    UMConfigure.getOaid(applicationC0716, new C1188(c10596));
                    iM11306 = ThreadFactoryC3888.m11306("۠ۡ") ^ i7;
                    i = ((iM11306 ^ i6) * (-5825)) ^ (-1901042559);
                    i2 = -1020081555;
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -1365918857:
                case 1928219362:
                    c10596 = new C10596();
                    if (C15198.m36412()) {
                        iM11306 = ThreadFactoryC3888.m11306("۠ۡ") ^ i7;
                        i = ((iM11306 ^ i6) * (-5825)) ^ (-1901042559);
                        i2 = -1020081555;
                    } else {
                        iM11306 = C19806.m45029("ۤ۫") ^ i7;
                        i = ((iM11306 ^ i6) * 3889) ^ (-89358939);
                        i2 = -641334745;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -1363918414:
                case 385064970:
                    if ((i15 + i16) - i14 >= 0) {
                        iM45029 = (C19806.m45029("ۚ᩻") ^ i6) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i8 = ((iM45029 ^ i7) * (-23229)) ^ 1305320331;
                        i3 = -1526698543;
                    } else {
                        iM45029 = (C19806.m45029("֫ܶ") + i7) * 27;
                        i8 = ((iM45029 ^ i6) * (-14377)) ^ 431084155;
                        i3 = 707886200;
                    }
                    i9 = iM45029 ^ i3;
                    runnableC18356 = this;
                    break;
                case -1291644798:
                case 726595323:
                    break;
                case -1183124089:
                case 1593392695:
                    UMConfigure.init(applicationC0716, strM1429, null, i4, null);
                    MobclickAgent.setPageCollectionMode(MobclickAgent.PageMode.LEGACY_MANUAL);
                    iM11306 = (C19806.m45029("۫۫") + i6) * (-33);
                    i = ((iM11306 ^ i7) * 27675) ^ 1011874136;
                    i2 = -81129157;
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -1111144933:
                case 1650940621:
                    strM4969 = C1419.m4969(sArr2, i11, 3, i10);
                    if (!C0817.f3443) {
                        iM45029 = C19806.m45029("ܺ᩸") ^ i7;
                        i8 = ((iM45029 ^ i6) * 9497) ^ (-1968529192);
                        i3 = 1427550938;
                        i9 = iM45029 ^ i3;
                        runnableC18356 = this;
                    } else {
                        iM11306 = (i7 - C19806.m45029("ۛᩴ")) * 89;
                        i = ((iM11306 ^ i6) * (-4445)) ^ (-1261210387);
                        i2 = -1666897724;
                        i9 = iM11306 ^ i2;
                        i8 = i;
                    }
                    break;
                case -1001559365:
                case -144013124:
                    i10 = 57616;
                    iM45029 = ThreadFactoryC3888.m11306("۫۠") ^ i6;
                    i8 = ((iM45029 ^ i7) * (-22165)) ^ 1427342745;
                    i3 = -1087019214;
                    i9 = iM45029 ^ i3;
                    runnableC18356 = this;
                    break;
                case -895870707:
                case 623332938:
                    C0629.m2907();
                    if (C2871.f10837 < 0) {
                        iM45029 = (i6 - C19806.m45029("᩵᩸")) * (-109);
                        i8 = ((iM45029 ^ i7) * 20793) ^ (-1697272784);
                        i3 = -286204904;
                        i9 = iM45029 ^ i3;
                        runnableC18356 = this;
                    } else {
                        iM11306 = C19806.m45029("ܿ᩺") ^ i6;
                        i = ((iM11306 ^ i7) * 31013) ^ 658384008;
                        i2 = -2107038066;
                        i9 = iM11306 ^ i2;
                        i8 = i;
                    }
                    break;
                case -883350922:
                case 1734266589:
                    activityC20431 = ((C8437) obj).f29292;
                    sArr2 = f58558;
                    if (C0962.m3746() < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡۠") ^ i6;
                        i = ((iM11306 ^ i7) * (-20027)) ^ (-324101696);
                        i2 = 1090256784;
                        i9 = iM11306 ^ i2;
                        i8 = i;
                    } else {
                        iM45029 = (C19806.m45029("ۤ֫") ^ i6) * (-109);
                        i8 = ((iM45029 ^ i7) * 21555) ^ 80748917;
                        i3 = -927689874;
                        i9 = iM45029 ^ i3;
                        runnableC18356 = this;
                    }
                    break;
                case -876401768:
                case -589870442:
                    s = sArr[c];
                    s2 = 3594;
                    if (C3743.f13569) {
                        iM45029 = (C19806.m45029("᩸۠") ^ i6) * (-115);
                        i8 = ((iM45029 ^ i7) * 6415) ^ 1443040627;
                        i3 = 771664624;
                    } else {
                        iM45029 = C19806.m45029("ܺ᩸") ^ i7;
                        i8 = ((iM45029 ^ i6) * 9497) ^ (-1968529192);
                        i3 = 1427550938;
                    }
                    i9 = iM45029 ^ i3;
                    runnableC18356 = this;
                    break;
                case -708943156:
                case 970982534:
                    applicationC0716 = (ApplicationC0716) obj;
                    SharedPreferences sharedPreferences = ApplicationC0716.f2988;
                    int i18 = C13184.f43886;
                    if (C15198.m36412()) {
                        iM11306 = (C19806.m45029("۫۫") + i6) * (-33);
                        i = ((iM11306 ^ i7) * 27675) ^ 1011874136;
                        i2 = -81129157;
                    } else {
                        iM11306 = (i7 - C19806.m45029("᩹ۧ")) * 35;
                        i = ((iM11306 ^ i6) * 11559) ^ 892405154;
                        i2 = -964338622;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -36011918:
                case 560791648:
                    if (!C3743.f13569) {
                        iM45029 = (C19806.m45029("ۤ֫") ^ i6) * (-109);
                        i8 = ((iM45029 ^ i7) * 21555) ^ 80748917;
                        i3 = -927689874;
                        i9 = iM45029 ^ i3;
                        runnableC18356 = this;
                    } else {
                        iM11306 = (C19806.m45029("ܳ᩵") ^ i7) * (-91);
                        i = ((iM11306 ^ i6) * 19925) ^ (-894448337);
                        i2 = -1752767713;
                        i9 = iM11306 ^ i2;
                        i8 = i;
                    }
                    break;
                case -15828581:
                case 452635836:
                    i10 = 30564;
                    iM45029 = ThreadFactoryC3888.m11306("۫۠") ^ i6;
                    i8 = ((iM45029 ^ i7) * (-22165)) ^ 1427342745;
                    i3 = -1087019214;
                    i9 = iM45029 ^ i3;
                    runnableC18356 = this;
                    break;
                case 171584958:
                case 1682109564:
                    sArr = f58558;
                    if (C1875.f7103 >= 0) {
                        iM45029 = (i6 - C19806.m45029("᩵᩸")) * (-109);
                        i8 = ((iM45029 ^ i7) * 20793) ^ (-1697272784);
                        i3 = -286204904;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿۢ") ^ i6;
                        i8 = ((iM45029 ^ i7) * (-22489)) ^ (-1345990649);
                        i3 = -201579924;
                    }
                    i9 = iM45029 ^ i3;
                    runnableC18356 = this;
                    break;
                case 308170692:
                case 797353212:
                    C2332.m7083(activityC20431, iM450210);
                    activityC20431.invalidateOptionsMenu();
                    break;
                case 1061689128:
                case 1540509894:
                    i11 = 1;
                    if (C3722.f13525 > 0) {
                        iM11306 = C19806.m45029("᩷᩸") ^ i6;
                        i = ((iM11306 ^ i7) * (-23239)) ^ 1331065982;
                        i2 = -1032497891;
                        i9 = iM11306 ^ i2;
                        i8 = i;
                    } else {
                        iM45029 = C19806.m45029("ܺ᩸") ^ i7;
                        i8 = ((iM45029 ^ i6) * 9497) ^ (-1968529192);
                        i3 = 1427550938;
                        i9 = iM45029 ^ i3;
                        runnableC18356 = this;
                    }
                    break;
                case 1257747505:
                case 1748713102:
                    C1377.m4833();
                    break;
                default:
                    C0629.m2907();
                    if (AbstractC0464.f2088 > 0) {
                        iM11306 = (C19806.m45029("ܳ᩵") ^ i7) * (-91);
                        i = ((iM11306 ^ i6) * 19925) ^ (-894448337);
                        i2 = -1752767713;
                    } else {
                        iM11306 = C19806.m45029("ܿ᩺") ^ i6;
                        i = ((iM11306 ^ i7) * 31013) ^ 658384008;
                        i2 = -2107038066;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
            }
            return;
        }
    }
}
