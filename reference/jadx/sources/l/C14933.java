package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܶۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X2T4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14933 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۙ۠۬, reason: not valid java name and contains not printable characters */
    private static final short[] f48708 = {5381, -19811, -19811, -19811, -19811, -19811, 8525, -16042, 14814, -19833, -19811, 3058, -8739, 7823, 1522};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC9994 f48709;

    @Override // l.AbstractC0414
    public final int getItemCount() {
        ActivityC9994 activityC9994 = null;
        int iM18986 = 0;
        int i = -1897920532;
        int i2 = C3722.f13525;
        int i3 = C1460.f5948;
        int iM45029 = C19806.m45029("ܳ۫") ^ i2;
        int i4 = ((iM45029 ^ i3) * (-31617)) ^ 675844878;
        int i5 = 1036978229;
        while (true) {
            i = ((((i ^ i3) * 983) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2140615461:
                case -1339382992:
                    if (RunnableC1564.f6300) {
                        iM45029 = (C19806.m45029("ۢۗ") ^ i3) * (-7);
                        i4 = ((iM45029 ^ i2) * (-15701)) ^ 1709972126;
                        i5 = -1372069809;
                    } else {
                        iM45029 = (C19806.m45029("ܺܳ") ^ i2) * 23;
                        i4 = ((iM45029 ^ i3) * (-393)) ^ 2114835887;
                        i5 = -44300579;
                    }
                    break;
                case -1977835135:
                case 1834249508:
                    if (RunnableC0195.f1321 < 0) {
                        iM45029 = C19806.m45029("ܺ۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * 17679) ^ (-702649613);
                        i5 = 1737651904;
                    } else {
                        iM45029 = C19806.m45029("۬᩵") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-28839)) ^ (-1695579835);
                        i5 = -1108699750;
                    }
                    break;
                case -1735109815:
                case 889457425:
                    C2332.m7079();
                    iM45029 = C19806.m45029("ܶ֫") ^ i3;
                    i4 = ((iM45029 ^ i2) * (-32229)) ^ (-569375946);
                    i5 = 604891747;
                    break;
                case -1618339348:
                case 553366840:
                    return iM18986 + 1;
                case -1556561224:
                case 464380930:
                    if (C3286.f12186) {
                        iM45029 = C19806.m45029("᩵ۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 29861) ^ (-545421049);
                        i5 = -797863941;
                    } else {
                        iM45029 = C19806.m45029("۠ܽ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-28799)) ^ (-131107804);
                        i5 = -1808289858;
                    }
                    break;
                case -1104485495:
                case 1883688414:
                    return 0;
                case -1071936800:
                case 352903605:
                    C0962.m3746();
                    return 0;
                case -722114624:
                case 1881273941:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6239(activityC9994.f34142)) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ᩴ") + i2) * (-37);
                        i4 = ((iM45029 ^ i3) * (-8059)) ^ (-756877916);
                        i5 = -469649281;
                    } else {
                        iM45029 = (i2 - C19806.m45029("֨ۖ")) * 13;
                        i4 = ((iM45029 ^ i3) * 13129) ^ (-234923497);
                        i5 = -1984041546;
                    }
                    break;
                case -518343993:
                case 1860335626:
                    iM18986 = C7105.m18986(activityC9994.f34142);
                    if (C3577.f13150 >= 0) {
                        iM45029 = C19806.m45029("۬᩵") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-28839)) ^ (-1695579835);
                        i5 = -1108699750;
                    } else {
                        iM45029 = C19806.m45029("᩵ᩴ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 10629) ^ 2012019179;
                        i5 = 2074071749;
                    }
                    break;
                case -473107665:
                case 2041573573:
                    if (C19806.m45024()) {
                        iM45029 = C19806.m45029("ܺ۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * 17679) ^ (-702649613);
                        i5 = 1737651904;
                    } else {
                        iM45029 = (C19806.m45029("ۢۙ") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM45029 ^ i2) * (-27175)) ^ (-1704877240);
                        i5 = 702077639;
                    }
                    break;
                case -417911797:
                case 1122805759:
                    RunnableC3388.m10064();
                    if (C1066.f4915 <= 0) {
                        iM45029 = C19806.m45029("۬᩵") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-28839)) ^ (-1695579835);
                        i5 = -1108699750;
                    } else {
                        iM45029 = C19806.m45029("ܶ֫") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-32229)) ^ (-569375946);
                        i5 = 604891747;
                    }
                    break;
                case -183729370:
                case 1323632598:
                    if (C2704.m8255() > 0) {
                        iM45029 = (C19806.m45029("ۢۗ") ^ i3) * (-7);
                        i4 = ((iM45029 ^ i2) * (-15701)) ^ 1709972126;
                        i5 = -1372069809;
                    } else {
                        iM45029 = C19806.m45029("ܶ֫") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-32229)) ^ (-569375946);
                        i5 = 604891747;
                    }
                    break;
                case 237763768:
                case 603528565:
                    if (C0278.f1572 <= 0) {
                        iM45029 = C19806.m45029("ܶ֫") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-32229)) ^ (-569375946);
                        i5 = 604891747;
                    } else {
                        iM45029 = (C19806.m45029("֫ܳ") ^ i3) * 3;
                        i4 = ((iM45029 ^ i2) * (-10673)) ^ 1434087851;
                        i5 = 740972225;
                    }
                    break;
                case 356920790:
                case 1803591485:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = (C19806.m45029("ۢۗ") ^ i3) * (-7);
                        i4 = ((iM45029 ^ i2) * (-15701)) ^ 1709972126;
                        i5 = -1372069809;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛܽ") + i3) * 25;
                        i4 = ((iM45029 ^ i2) * (-27221)) ^ 1222623817;
                        i5 = 624574288;
                    }
                    break;
                case 414308855:
                case 1495334773:
                    activityC9994 = this.f48709;
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = C19806.m45029("۬᩵") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-28839)) ^ (-1695579835);
                        i5 = -1108699750;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨᩳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-9159)) ^ (-201474613);
                        i5 = 414824333;
                    }
                    break;
                case 782640365:
                case 2089792044:
                    if (C1419.f5860 >= 0) {
                        iM45029 = C19806.m45029("᩵ۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 29861) ^ (-545421049);
                        i5 = -797863941;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ۤ᩹")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM45029 ^ i3) * (-11913)) ^ 1703598278;
                        i5 = 1965310491;
                    }
                    break;
                case 1126344151:
                case 1668463592:
                    if (C1461.m5080()) {
                        iM45029 = C19806.m45029("ܺ۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * 17679) ^ (-702649613);
                        i5 = 1737651904;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-9849)) ^ 1003445980;
                        i5 = 726995369;
                    }
                    break;
                default:
                    if (C2124.f7782 <= 0) {
                        iM45029 = C19806.m45029("ܺ۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * 17679) ^ (-702649613);
                        i5 = 1737651904;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * 1541) ^ (-1554966101);
                        i5 = -961402220;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0173 A[PHI: r8
      0x0173: PHI (r8v4 java.lang.String) = (r8v3 java.lang.String), (r8v2 java.lang.String) binds: [B:35:0x0159, B:25:0x00ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x01be A[PHI: r7 r12
      0x01be: PHI (r7v6 java.lang.String) = (r7v2 java.lang.String), (r7v3 java.lang.String), (r7v2 java.lang.String) binds: [B:43:0x01bc, B:39:0x0191, B:113:0x01be] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r12v6 short[]) = (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:43:0x01bc, B:39:0x0191, B:113:0x01be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x024a A[PHI: r0 r9 r13 r14 r24
      0x024a: PHI (r0v57 java.lang.StringBuilder) = (r0v42 java.lang.StringBuilder), (r0v2 java.lang.StringBuilder), (r0v2 java.lang.StringBuilder) binds: [B:54:0x0248, B:21:0x00cf, B:114:0x024a] A[DONT_GENERATE, DONT_INLINE]
      0x024a: PHI (r9v4 java.lang.StringBuilder) = (r9v2 java.lang.StringBuilder), (r9v3 java.lang.StringBuilder), (r9v2 java.lang.StringBuilder) binds: [B:54:0x0248, B:21:0x00cf, B:114:0x024a] A[DONT_GENERATE, DONT_INLINE]
      0x024a: PHI (r13v5 short[]) = (r13v2 short[]), (r13v4 short[]), (r13v2 short[]) binds: [B:54:0x0248, B:21:0x00cf, B:114:0x024a] A[DONT_GENERATE, DONT_INLINE]
      0x024a: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:54:0x0248, B:21:0x00cf, B:114:0x024a] A[DONT_GENERATE, DONT_INLINE]
      0x024a: PHI (r24v10 short[]) = (r24v4 short[]), (r24v3 short[]), (r24v3 short[]) binds: [B:54:0x0248, B:21:0x00cf, B:114:0x024a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        int i2;
        int iM11306;
        int i3;
        StringBuilder sb;
        short s;
        ViewOnClickListenerC8583 viewOnClickListenerC8583;
        int iM45029;
        int i4;
        int i5;
        StringBuilder sb2;
        ViewOnClickListenerC8583 viewOnClickListenerC8584;
        short s2;
        int iM11307;
        int i6;
        int i7;
        int iM11308;
        int i8;
        int i9;
        int i10 = AbstractC0464.f2088;
        int i11 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int iM450210 = (C19806.m45029("۫ۘ") ^ i11) * 9;
        int i12 = ((iM450210 ^ i10) * (-27265)) ^ 223046317;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i13 = iM450210 ^ (-1676044599);
        StringBuilder sb3 = null;
        int i14 = 0;
        int i15 = 0;
        short s3 = 0;
        int i16 = 0;
        int i17 = -422933576;
        short[] sArr4 = null;
        String strM6105 = null;
        String strM3412 = null;
        StringBuilder sb4 = null;
        String strM42739 = null;
        String strM10056 = null;
        String str = null;
        C18419 c18419 = null;
        ActivityC9994 activityC9994 = null;
        ViewOnClickListenerC8583 viewOnClickListenerC8585 = null;
        while (true) {
            i17 = i13 ^ (i12 & (((i17 ^ i10) * 23303) >> 31));
            switch (i17) {
                case -2043999605:
                case 439113344:
                    if (C2249.m6911(strM42739)) {
                        iM11308 = ThreadFactoryC3888.m11306("ܰ᩵") ^ i10;
                        i8 = ((iM11308 ^ i11) * (-19147)) ^ (-100824647);
                        i9 = -697769407;
                    } else {
                        strM3412 = strM42739;
                        iM11308 = (ThreadFactoryC3888.m11306("ۙ᩵") ^ i10) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i8 = ((iM11308 ^ i11) * 11677) ^ (-102541692);
                        i9 = 198454281;
                    }
                    i13 = iM11308 ^ i9;
                    i12 = i8;
                    break;
                case -1968031369:
                case -1921595086:
                    C0050.m946();
                    if (C0629.f2722 > 0) {
                        iM11308 = (i10 - C19806.m45029("᩹᩻")) * (-35);
                        i8 = ((iM11308 ^ i11) * 23923) ^ (-427882113);
                        i9 = 454593449;
                        i13 = iM11308 ^ i9;
                        i12 = i8;
                    } else {
                        sb = sb3;
                        s = s3;
                        viewOnClickListenerC8583 = viewOnClickListenerC8585;
                        iM45029 = (ThreadFactoryC3888.m11306("ۙۨ") + i10) * 89;
                        i4 = ((iM45029 ^ i11) * (-31813)) ^ (-1524646807);
                        i5 = 2112651788;
                        StringBuilder sb5 = sb;
                        i13 = iM45029 ^ i5;
                        sb3 = sb5;
                        ViewOnClickListenerC8583 viewOnClickListenerC8586 = viewOnClickListenerC8583;
                        s3 = s;
                        i12 = i4;
                        viewOnClickListenerC8585 = viewOnClickListenerC8586;
                    }
                    break;
                case -1911903197:
                case -1374646145:
                    strM6105 = C1875.m6105(f48708, 6, 3, i15);
                    if (AbstractC0464.m2313() == 0) {
                        iM11308 = (C19806.m45029("᩻᩸") + i11) * (-5);
                        i8 = ((iM11308 ^ i10) * (-9729)) ^ (-653914557);
                        i9 = 740562336;
                        i13 = iM11308 ^ i9;
                        i12 = i8;
                    } else {
                        sb = sb3;
                        s = s3;
                        viewOnClickListenerC8583 = viewOnClickListenerC8585;
                        iM45029 = (ThreadFactoryC3888.m11306("ۙۨ") + i10) * 89;
                        i4 = ((iM45029 ^ i11) * (-31813)) ^ (-1524646807);
                        i5 = 2112651788;
                        StringBuilder sb6 = sb;
                        i13 = iM45029 ^ i5;
                        sb3 = sb6;
                        ViewOnClickListenerC8583 viewOnClickListenerC8587 = viewOnClickListenerC8583;
                        s3 = s;
                        i12 = i4;
                        viewOnClickListenerC8585 = viewOnClickListenerC8587;
                    }
                    break;
                case -1911336105:
                case -1876680170:
                    C1148.m4223(sb3, str);
                    C1148.m4223(sb3, C1791.m5863(c18419.m42745()));
                    sArr2 = f48708;
                    if (RunnableC1895.f7152) {
                        iM11308 = (i11 - C19806.m45029("ۧ᩸")) * 101;
                        i8 = ((iM11308 ^ i10) * (-15041)) ^ 1032458968;
                        i9 = 2086301135;
                    } else {
                        iM11308 = (i10 - C19806.m45029("᩹᩻")) * (-35);
                        i8 = ((iM11308 ^ i11) * 23923) ^ (-427882113);
                        i9 = 454593449;
                    }
                    i13 = iM11308 ^ i9;
                    i12 = i8;
                    break;
                case -1798679643:
                case 256592782:
                    strM10056 = RunnableC3388.m10056(sArr2, 4, 2, i15);
                    if (C0962.f3784) {
                        iM11308 = (i10 - C19806.m45029("᩹᩻")) * (-35);
                        i8 = ((iM11308 ^ i11) * 23923) ^ (-427882113);
                        i9 = 454593449;
                    } else {
                        iM11308 = C19806.m45029("֫ۖ") ^ i10;
                        i8 = ((iM11308 ^ i11) * (-28435)) ^ 1734182341;
                        i9 = 1209902626;
                    }
                    i13 = iM11308 ^ i9;
                    i12 = i8;
                    break;
                case -1516317562:
                case 191030702:
                    if (C7105.f23796 < 0) {
                        sb2 = sb3;
                        s2 = s3;
                        viewOnClickListenerC8584 = viewOnClickListenerC8585;
                        iM11307 = ThreadFactoryC3888.m11306("ۤۖ") ^ i11;
                        i6 = ((iM11307 ^ i10) * 24873) ^ 330531176;
                        i7 = -514121509;
                        ViewOnClickListenerC8583 viewOnClickListenerC8588 = viewOnClickListenerC8584;
                        s3 = s2;
                        sb3 = sb2;
                        i13 = iM11307 ^ i7;
                        i12 = i6;
                        viewOnClickListenerC8585 = viewOnClickListenerC8588;
                    } else {
                        sb = sb3;
                        s = s3;
                        viewOnClickListenerC8583 = viewOnClickListenerC8585;
                        iM45029 = (ThreadFactoryC3888.m11306("ۙۨ") + i10) * 89;
                        i4 = ((iM45029 ^ i11) * (-31813)) ^ (-1524646807);
                        i5 = 2112651788;
                        StringBuilder sb7 = sb;
                        i13 = iM45029 ^ i5;
                        sb3 = sb7;
                        ViewOnClickListenerC8583 viewOnClickListenerC8589 = viewOnClickListenerC8583;
                        s3 = s;
                        i12 = i4;
                        viewOnClickListenerC8585 = viewOnClickListenerC8589;
                    }
                    break;
                case -1493161347:
                case 97781622:
                    short[] sArr5 = sArr;
                    String strM18989 = C7105.m18989(sArr5, 1, 3, i15);
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        sArr = sArr5;
                        str = strM18989;
                        int iM450211 = (C19806.m45029("᩶᩹") + i11) * (-7);
                        int i18 = ((iM450211 ^ i10) * (-28847)) ^ 177591700;
                        i13 = iM450211 ^ 1951072465;
                        i12 = i18;
                        sb3 = null;
                    } else {
                        int iM450212 = C19806.m45029("᩸ܿ") ^ i11;
                        sArr = sArr5;
                        str = strM18989;
                        i12 = ((iM450212 ^ i10) * (-14137)) ^ (-1593456348);
                        sb3 = sb3;
                        i13 = iM450212 ^ (-950622973);
                    }
                    break;
                case -1474481862:
                case 429984740:
                    C1977.m6356();
                    RunnableC1564.m5345();
                    sb = sb3;
                    s = s3;
                    viewOnClickListenerC8583 = viewOnClickListenerC8585;
                    iM45029 = (ThreadFactoryC3888.m11306("ۙۨ") + i10) * 89;
                    i4 = ((iM45029 ^ i11) * (-31813)) ^ (-1524646807);
                    i5 = 2112651788;
                    StringBuilder sb8 = sb;
                    i13 = iM45029 ^ i5;
                    sb3 = sb8;
                    ViewOnClickListenerC8583 viewOnClickListenerC85810 = viewOnClickListenerC8583;
                    s3 = s;
                    i12 = i4;
                    viewOnClickListenerC8585 = viewOnClickListenerC85810;
                    break;
                case -1313435713:
                case 1013163954:
                    sb3 = sb3;
                    if (abstractC12554 instanceof ViewOnClickListenerC8583) {
                        iM11306 = ThreadFactoryC3888.m11306("֫ܶ") ^ i11;
                        i12 = ((iM11306 ^ i10) * 17871) ^ 240981118;
                        i3 = 2136411371;
                    } else {
                        iM11306 = (C19806.m45029("۫ܰ") ^ i11) * 37;
                        i12 = ((iM11306 ^ i10) * 28001) ^ 728830912;
                        i3 = -1314507935;
                    }
                    i2 = iM11306 ^ i3;
                    StringBuilder sb9 = sb3;
                    i13 = i2;
                    sb3 = sb9;
                    break;
                case -1298684904:
                case 276801422:
                    C2788.m8480(sb3, strM10056);
                    C2788.m8480(sb3, c18419.m42732());
                    MenuItemOnMenuItemClickListenerC3244.m9704(viewOnClickListenerC8585.f29681, C2124.m6674(sb3));
                    strM42739 = c18419.m42739();
                    if (strM42739 != null) {
                        iM11308 = (i11 - ThreadFactoryC3888.m11306("۟᩶")) * 59;
                        i8 = ((iM11308 ^ i10) * 317) ^ (-1204236852);
                        i9 = 1697725183;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("ܰ᩵") ^ i10;
                        i8 = ((iM11308 ^ i11) * (-19147)) ^ (-100824647);
                        i9 = -697769407;
                    }
                    i13 = iM11308 ^ i9;
                    i12 = i8;
                    break;
                case -1112966416:
                case -12515014:
                    strM3412 = C0817.m3412(activityC9994, ThreadFactoryC3888.m11306(strM6105) ^ 2100030000);
                    iM11308 = (ThreadFactoryC3888.m11306("ۙ᩵") ^ i10) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i8 = ((iM11308 ^ i11) * 11677) ^ (-102541692);
                    i9 = 198454281;
                    i13 = iM11308 ^ i9;
                    i12 = i8;
                    break;
                case -948871702:
                case 1265482740:
                    C2788.m8472();
                    break;
                case -922124094:
                case 2035731562:
                    viewOnClickListenerC8585.f29679 = c18419;
                    viewOnClickListenerC8585.m22366();
                    if (!C0962.f3784) {
                        sb3 = new StringBuilder();
                        C2788.m8480(sb3, c18419.m42741());
                        sArr = f48708;
                        if (C1189.f5284 <= 0) {
                            iM11308 = (ThreadFactoryC3888.m11306("᩷ۧ") + i10) * (-33);
                            i8 = ((iM11308 ^ i11) * (-24781)) ^ (-783758426);
                            i9 = -1850123513;
                        } else {
                            iM11308 = ThreadFactoryC3888.m11306("ܰۜ") ^ i10;
                            i8 = ((iM11308 ^ i11) * 21287) ^ (-553834077);
                            i9 = 1572230653;
                        }
                        i13 = iM11308 ^ i9;
                        i12 = i8;
                    } else {
                        int iM450213 = (C19806.m45029("᩶᩹") + i11) * (-7);
                        int i19 = ((iM450213 ^ i10) * (-28847)) ^ 177591700;
                        i13 = iM450213 ^ 1951072465;
                        i12 = i19;
                        sb3 = null;
                    }
                    break;
                case -750697698:
                case 1266871450:
                    sb4 = new StringBuilder();
                    C1148.m4223(sb4, C5422.m14997(c18419.m42740()));
                    sArr3 = f48708;
                    i14 = 9;
                    if (C2871.m8646()) {
                        iM11308 = ThreadFactoryC3888.m11306("ۜ᩶") ^ i11;
                        i8 = ((iM11308 ^ i10) * 26497) ^ 154468480;
                        i9 = 684175016;
                    } else {
                        iM11308 = (ThreadFactoryC3888.m11306("᩷ۧ") + i10) * (-33);
                        i8 = ((iM11308 ^ i11) * (-24781)) ^ (-783758426);
                        i9 = -1850123513;
                    }
                    i13 = iM11308 ^ i9;
                    i12 = i8;
                    break;
                case -525421797:
                case 1766709388:
                    sb2 = sb3;
                    viewOnClickListenerC8584 = viewOnClickListenerC8585;
                    s2 = sArr4[0];
                    i16 = s2 * s2;
                    if (C1461.f5957 <= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ۤۖ") ^ i11;
                        i6 = ((iM11307 ^ i10) * 24873) ^ 330531176;
                        i7 = -514121509;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ܶᩴ") ^ i10) * (-125);
                        i6 = ((iM11307 ^ i11) * 24923) ^ (-1814337136);
                        i7 = -1664341352;
                    }
                    ViewOnClickListenerC8583 viewOnClickListenerC85811 = viewOnClickListenerC8584;
                    s3 = s2;
                    sb3 = sb2;
                    i13 = iM11307 ^ i7;
                    i12 = i6;
                    viewOnClickListenerC8585 = viewOnClickListenerC85811;
                    break;
                case -236172040:
                case 560990881:
                    if (AbstractC0464.m2313() == 0) {
                        iM11308 = (ThreadFactoryC3888.m11306("᩷ۧ") + i10) * (-33);
                        i8 = ((iM11308 ^ i11) * (-24781)) ^ (-783758426);
                        i9 = -1850123513;
                        i13 = iM11308 ^ i9;
                        i12 = i8;
                    } else {
                        sb = sb3;
                        s = s3;
                        viewOnClickListenerC8583 = viewOnClickListenerC8585;
                        iM45029 = (ThreadFactoryC3888.m11306("ۙۨ") + i10) * 89;
                        i4 = ((iM45029 ^ i11) * (-31813)) ^ (-1524646807);
                        i5 = 2112651788;
                        StringBuilder sb10 = sb;
                        i13 = iM45029 ^ i5;
                        sb3 = sb10;
                        ViewOnClickListenerC8583 viewOnClickListenerC85812 = viewOnClickListenerC8583;
                        s3 = s;
                        i12 = i4;
                        viewOnClickListenerC8585 = viewOnClickListenerC85812;
                    }
                    break;
                case -6637508:
                case 907114387:
                    viewOnClickListenerC8585 = (ViewOnClickListenerC8583) abstractC12554;
                    activityC9994 = this.f48709;
                    sb3 = sb3;
                    c18419 = (C18419) RunnableC1606.m5478(activityC9994.f34142, i);
                    if (RunnableC1606.f6488 < 0) {
                        int iM450214 = (i10 - C19806.m45029("ۗ֫")) * (-43);
                        int i20 = ((iM450214 ^ i11) * 119) ^ (-818915508);
                        i2 = iM450214 ^ 1591280069;
                        i12 = i20;
                        StringBuilder sb11 = sb3;
                        i13 = i2;
                        sb3 = sb11;
                    } else {
                        int iM450215 = (C19806.m45029("᩶᩹") + i11) * (-7);
                        int i110 = ((iM450215 ^ i10) * (-28847)) ^ 177591700;
                        i13 = iM450215 ^ 1951072465;
                        i12 = i110;
                        sb3 = null;
                    }
                    break;
                case 31795520:
                case 538993521:
                    i15 = 33888;
                    iM11306 = (C19806.m45029("ۡۚ") + i10) * (-79);
                    i12 = ((iM11306 ^ i11) * 8049) ^ (-614652882);
                    i3 = -2061096718;
                    i2 = iM11306 ^ i3;
                    StringBuilder sb12 = sb3;
                    i13 = i2;
                    sb3 = sb12;
                    break;
                case 258932999:
                case 1461623613:
                    sb = sb3;
                    s = s3;
                    viewOnClickListenerC8583 = viewOnClickListenerC8585;
                    sArr4 = f48708;
                    if (C0671.f2816 != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙۨ") + i10) * 89;
                        i4 = ((iM45029 ^ i11) * (-31813)) ^ (-1524646807);
                        i5 = 2112651788;
                    } else {
                        iM45029 = C19806.m45029("֡ۤ") ^ i11;
                        i4 = ((iM45029 ^ i10) * 29969) ^ 2139913168;
                        i5 = -1444361237;
                    }
                    StringBuilder sb13 = sb;
                    i13 = iM45029 ^ i5;
                    sb3 = sb13;
                    ViewOnClickListenerC8583 viewOnClickListenerC85813 = viewOnClickListenerC8583;
                    s3 = s;
                    i12 = i4;
                    viewOnClickListenerC8585 = viewOnClickListenerC85813;
                    break;
                case 267196966:
                case 646341807:
                    break;
                case 857530895:
                case 1635879969:
                    C2788.m8480(sb4, MenuItemOnMenuItemClickListenerC3244.m9715(sArr3, i14, 2, i15));
                    C1148.m4223(sb4, strM3412);
                    MenuItemOnMenuItemClickListenerC3244.m9704(viewOnClickListenerC8585.f29678, C0817.m3407(sb4));
                    sb3 = sb3;
                    iM11306 = (C19806.m45029("۫ܰ") ^ i11) * 37;
                    i12 = ((iM11306 ^ i10) * 28001) ^ 728830912;
                    i3 = -1314507935;
                    i2 = iM11306 ^ i3;
                    StringBuilder sb14 = sb3;
                    i13 = i2;
                    sb3 = sb14;
                    break;
                case 1261677203:
                case 2058219019:
                    sb = sb3;
                    int i21 = i16 + 318096;
                    s = s3;
                    viewOnClickListenerC8583 = viewOnClickListenerC8585;
                    int i22 = s + 564;
                    if ((i22 * i22) - (i21 + i21) > 0) {
                        iM45029 = C19806.m45029("ۧۡ") ^ i11;
                        i4 = ((iM45029 ^ i10) * (-949)) ^ 1390821387;
                        i5 = 1768321592;
                    } else {
                        iM45029 = C19806.m45029("ۨᩴ") ^ i10;
                        i4 = ((iM45029 ^ i11) * (-9255)) ^ (-1015111455);
                        i5 = -1452930943;
                    }
                    StringBuilder sb15 = sb;
                    i13 = iM45029 ^ i5;
                    sb3 = sb15;
                    ViewOnClickListenerC8583 viewOnClickListenerC85814 = viewOnClickListenerC8583;
                    s3 = s;
                    i12 = i4;
                    viewOnClickListenerC8585 = viewOnClickListenerC85814;
                    break;
                default:
                    i15 = 45757;
                    iM11306 = (C19806.m45029("ۡۚ") + i10) * (-79);
                    i12 = ((iM11306 ^ i11) * 8049) ^ (-614652882);
                    i3 = -2061096718;
                    i2 = iM11306 ^ i3;
                    StringBuilder sb16 = sb3;
                    i13 = i2;
                    sb3 = sb16;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0259 A[PHI: r5 r9 r19 r20
      0x0259: PHI (r5v3 int) = (r5v2 int), (r5v2 int), (r5v4 int) binds: [B:67:0x0257, B:59:0x0217, B:17:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:67:0x0257, B:59:0x0217, B:17:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:67:0x0257, B:59:0x0217, B:17:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r20v11 l.ۤۖۘ) = (r20v4 l.ۤۖۘ), (r20v6 l.ۤۖۘ), (r20v12 l.ۤۖۘ) binds: [B:67:0x0257, B:59:0x0217, B:17:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0289 A[PHI: r7 r8 r10 r20
      0x0289: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short) binds: [B:71:0x0287, B:63:0x0239, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0289: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:71:0x0287, B:63:0x0239, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0289: PHI (r10v3 short) = (r10v2 short), (r10v2 short), (r10v5 short) binds: [B:71:0x0287, B:63:0x0239, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0289: PHI (r20v13 l.ۤۖۘ) = (r20v3 l.ۤۖۘ), (r20v5 l.ۤۖۘ), (r20v15 l.ۤۖۘ) binds: [B:71:0x0287, B:63:0x0239, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int iM45029;
        int i2;
        int i3;
        int iM450210;
        int i4;
        int iM450211;
        int i5;
        int i6;
        int i7 = C2477.f9839;
        int i8 = C0629.f2722;
        int iM11306 = ThreadFactoryC3888.m11306("ۖܰ") ^ i7;
        int i9 = ((iM11306 ^ i8) * 13059) ^ (-141938878);
        LayoutInflater layoutInflaterFrom = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i10 = iM11306 ^ (-361492551);
        ActivityC9994 activityC9994 = null;
        int i11 = 0;
        boolean z = false;
        int iM11307 = 0;
        short s = 0;
        int i12 = 0;
        int i13 = 0;
        short s2 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = -728227378;
        while (true) {
            i17 = i10 ^ (i9 & (((i17 ^ i8) * (-32589)) >> 31));
            switch (i17) {
                case -1955247457:
                case -1706700211:
                    activityC9994 = activityC9994;
                    if (C3286.m9798() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙۗ") ^ i7;
                        i2 = ((iM45029 ^ i8) * 7583) ^ 1099978258;
                        i3 = 2066839387;
                    } else {
                        iM45029 = C19806.m45029("۠ۚ") ^ i8;
                        i2 = ((iM45029 ^ i7) * (-28303)) ^ 354088772;
                        i3 = 334104573;
                    }
                    i10 = iM45029 ^ i3;
                    i9 = i2;
                    activityC9994 = activityC9994;
                    break;
                case -1826714799:
                case -789835128:
                    activityC9994 = activityC9994;
                    int i18 = 193376836 + i12;
                    i13 = i18 + i18;
                    if (C2788.m8472() != 0) {
                        iM45029 = (C19806.m45029("ᩳۛ") + i7) * 55;
                        i2 = ((iM45029 ^ i8) * (-25279)) ^ (-152650098);
                        i3 = 1480309129;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۫᩹") ^ i8;
                        i2 = ((iM45029 ^ i7) * 9437) ^ (-1235708557);
                        i3 = 1442867076;
                    }
                    i10 = iM45029 ^ i3;
                    i9 = i2;
                    activityC9994 = activityC9994;
                    break;
                case -1532945626:
                case -1159732184:
                    C3577.m10565();
                    if (C1398.m4895() > 0) {
                        activityC9994 = activityC9994;
                        iM45029 = (C19806.m45029("ᩳۛ") + i7) * 55;
                        i2 = ((iM45029 ^ i8) * (-25279)) ^ (-152650098);
                        i3 = 1480309129;
                        i10 = iM45029 ^ i3;
                        i9 = i2;
                        activityC9994 = activityC9994;
                    } else {
                        iM450211 = (ThreadFactoryC3888.m11306("۫᩶") ^ i8) * 67;
                        i5 = ((iM450211 ^ i7) * 4613) ^ 1850184972;
                        i6 = 488405449;
                        i10 = iM450211 ^ i6;
                        i9 = i5;
                    }
                    break;
                case -1400363459:
                case 513036257:
                    layoutInflaterFrom = LayoutInflater.from(activityC9994);
                    sArr2 = f48708;
                    i15 = 12;
                    i16 = 3;
                    if (C2124.f7782 <= 0) {
                        iM450211 = C19806.m45029("ܿܰ") ^ i8;
                        i5 = ((iM450211 ^ i7) * 30543) ^ (-976194450);
                        i6 = 2081326982;
                    } else {
                        iM450211 = ThreadFactoryC3888.m11306("ᩳᩴ") ^ i7;
                        i5 = ((iM450211 ^ i8) * (-31873)) ^ 280781989;
                        i6 = 17943431;
                    }
                    i10 = iM450211 ^ i6;
                    i9 = i5;
                    break;
                case -1372361969:
                case 1938957513:
                    View view = new View(activityC9994);
                    if (!C1377.f5749) {
                        iM450211 = C19806.m45029("ܿܰ") ^ i8;
                        i5 = ((iM450211 ^ i7) * 30543) ^ (-976194450);
                        i6 = 2081326982;
                        i10 = iM450211 ^ i6;
                        i9 = i5;
                    } else {
                        int iM2304 = AbstractC0464.m2304(5.0f);
                        if (C2124.f7782 > 0) {
                            view.setLayoutParams(new ViewGroup.LayoutParams(-1, iM2304));
                            return new C21282(view);
                        }
                        iM45029 = (C19806.m45029("ۗ᩵") + i8) * 7;
                        i2 = ((iM45029 ^ i7) * (-6261)) ^ 800291438;
                        i3 = 750002664;
                        i10 = iM45029 ^ i3;
                        i9 = i2;
                        activityC9994 = activityC9994;
                    }
                    break;
                case -1337160856:
                case -567276918:
                    activityC9994 = this.f48709;
                    if (i != 0) {
                        iM450211 = C19806.m45029("ᩳ֡") ^ i8;
                        i5 = ((iM450211 ^ i7) * (-7311)) ^ (-437224286);
                        i6 = 1627311491;
                        i10 = iM450211 ^ i6;
                        i9 = i5;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("ᩳۤ") ^ i7) * (-5);
                        i9 = ((iM450210 ^ i8) * (-807)) ^ (-1733245179);
                        i4 = -779051740;
                        i10 = iM450210 ^ i4;
                    }
                    break;
                case -1160956727:
                case 1780736421:
                    i11 = 2118191748 ^ iM11307;
                    if (C3286.f12186) {
                        z = false;
                        iM450211 = C19806.m45029("ܿܰ") ^ i8;
                        i5 = ((iM450211 ^ i7) * 30543) ^ (-976194450);
                        i6 = 2081326982;
                        i10 = iM450211 ^ i6;
                        i9 = i5;
                    } else {
                        int iM11308 = ThreadFactoryC3888.m11306("ܶ᩸") ^ i7;
                        i9 = ((iM11308 ^ i8) * (-29201)) ^ (-1932634485);
                        i10 = iM11308 ^ 1474391543;
                        z = false;
                    }
                    break;
                case -637739640:
                case 1868673171:
                    C1066.m4023();
                    if (!C2332.f8260) {
                        iM450211 = (ThreadFactoryC3888.m11306("۫᩶") ^ i8) * 67;
                        i5 = ((iM450211 ^ i7) * 4613) ^ 1850184972;
                        i6 = 488405449;
                        i10 = iM450211 ^ i6;
                        i9 = i5;
                    } else {
                        iM45029 = (C19806.m45029("ۗ᩵") + i8) * 7;
                        i2 = ((iM45029 ^ i7) * (-6261)) ^ 800291438;
                        i3 = 750002664;
                        i10 = iM45029 ^ i3;
                        i9 = i2;
                        activityC9994 = activityC9994;
                    }
                    break;
                case -603224376:
                case 667980059:
                    return new ViewOnClickListenerC8583(activityC9994, layoutInflaterFrom.inflate(i11, viewGroup, z));
                case -344257625:
                case 185144708:
                    AbstractC0464.m2313();
                    return null;
                case -108131944:
                case 1898152712:
                    iM11307 = ThreadFactoryC3888.m11306(C0797.m3361(sArr2, i15, i16, i14));
                    if (!C19806.m45024()) {
                        iM450210 = (C19806.m45029("ۙܳ") ^ i8) * 87;
                        i9 = ((iM450210 ^ i7) * (-29971)) ^ 1667792032;
                        i4 = -258008009;
                        i10 = iM450210 ^ i4;
                    } else {
                        activityC9994 = activityC9994;
                        iM45029 = (C19806.m45029("ᩳۛ") + i7) * 55;
                        i2 = ((iM45029 ^ i8) * (-25279)) ^ (-152650098);
                        i3 = 1480309129;
                        i10 = iM45029 ^ i3;
                        i9 = i2;
                        activityC9994 = activityC9994;
                    }
                    break;
                case -48330864:
                case 1002240232:
                    i14 = 36479;
                    iM45029 = (C19806.m45029("ۛᩴ") ^ i8) * (-49);
                    i2 = ((iM45029 ^ i7) * (-23325)) ^ (-1435866507);
                    i3 = -1719329575;
                    i10 = iM45029 ^ i3;
                    i9 = i2;
                    activityC9994 = activityC9994;
                    break;
                case 8719555:
                case 18420567:
                    activityC9994 = activityC9994;
                    sArr = f48708;
                    if (C1025.f4800 >= 0) {
                        iM45029 = (C19806.m45029("ᩳۛ") + i7) * 55;
                        i2 = ((iM45029 ^ i8) * (-25279)) ^ (-152650098);
                        i3 = 1480309129;
                    } else {
                        iM45029 = C19806.m45029("ܿ᩵") ^ i7;
                        i2 = ((iM45029 ^ i8) * 9403) ^ (-328672776);
                        i3 = 2074854115;
                    }
                    i10 = iM45029 ^ i3;
                    i9 = i2;
                    activityC9994 = activityC9994;
                    break;
                case 184593067:
                case 343534581:
                    if (C0050.f912 > 0) {
                        iM450211 = C19806.m45029("ܿܰ") ^ i8;
                        i5 = ((iM450211 ^ i7) * 30543) ^ (-976194450);
                        i6 = 2081326982;
                        i10 = iM450211 ^ i6;
                        i9 = i5;
                    } else {
                        iM45029 = (C19806.m45029("ۗ᩵") + i8) * 7;
                        i2 = ((iM45029 ^ i7) * (-6261)) ^ 800291438;
                        i3 = 750002664;
                        i10 = iM45029 ^ i3;
                        i9 = i2;
                        activityC9994 = activityC9994;
                    }
                    break;
                case 194658075:
                case 869637175:
                    activityC9994 = activityC9994;
                    s = sArr[11];
                    i12 = s * s;
                    if (RunnableC1564.f6300) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙۗ") ^ i7;
                        i2 = ((iM45029 ^ i8) * 7583) ^ 1099978258;
                        i3 = 2066839387;
                    } else {
                        iM45029 = (C19806.m45029("ܽ۠") ^ i7) * (-91);
                        i2 = ((iM45029 ^ i8) * (-10979)) ^ 51089928;
                        i3 = -827796215;
                    }
                    i10 = iM45029 ^ i3;
                    i9 = i2;
                    activityC9994 = activityC9994;
                    break;
                case 720114252:
                case 1483374291:
                    activityC9994 = activityC9994;
                    int i19 = s + s2;
                    if ((i19 * i19) - i13 > 0) {
                        iM45029 = (i7 - ThreadFactoryC3888.m11306("ۡۛ")) * (-109);
                        i2 = ((iM45029 ^ i8) * 11973) ^ 577006521;
                        i3 = 1270786435;
                    } else {
                        iM45029 = C19806.m45029("ᩴ᩷") ^ i7;
                        i2 = ((iM45029 ^ i8) * 17691) ^ 1940314539;
                        i3 = -1926443011;
                    }
                    i10 = iM45029 ^ i3;
                    i9 = i2;
                    activityC9994 = activityC9994;
                    break;
                case 1124181907:
                case 1529787715:
                    C1668.m5583();
                    iM450211 = (ThreadFactoryC3888.m11306("۫᩶") ^ i8) * 67;
                    i5 = ((iM450211 ^ i7) * 4613) ^ 1850184972;
                    i6 = 488405449;
                    i10 = iM450211 ^ i6;
                    i9 = i5;
                    break;
                case 1204783838:
                case 1891854911:
                    i14 = 63953;
                    iM45029 = (C19806.m45029("ۛᩴ") ^ i8) * (-49);
                    i2 = ((iM45029 ^ i7) * (-23325)) ^ (-1435866507);
                    i3 = -1719329575;
                    i10 = iM45029 ^ i3;
                    i9 = i2;
                    activityC9994 = activityC9994;
                    break;
                default:
                    activityC9994 = activityC9994;
                    s2 = 13906;
                    if (C1937.f7317 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙۗ") ^ i7;
                        i2 = ((iM45029 ^ i8) * 7583) ^ 1099978258;
                        i3 = 2066839387;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨ᩺") ^ i8;
                        i2 = ((iM45029 ^ i7) * (-26235)) ^ (-858752761);
                        i3 = 964899354;
                    }
                    i10 = iM45029 ^ i3;
                    i9 = i2;
                    activityC9994 = activityC9994;
                    break;
            }
        }
    }

    public C14933(ActivityC9994 activityC9994) {
        this.f48709 = activityC9994;
    }

    @Override // l.AbstractC0414
    public final int getItemViewType(int i) {
        int itemCount = 0;
        int i2 = 0;
        int i3 = 1878536158;
        int i4 = C2249.f8050;
        int i5 = C10634.f36300;
        int iM45029 = (C19806.m45029("ۧۤ") + i5) * (-59);
        int i6 = ((iM45029 ^ i4) * 29389) ^ (-607930373);
        int i7 = -2043482245;
        while (true) {
            i3 = ((((i3 ^ i4) * (-32625)) >> 31) & i6) ^ (iM45029 ^ i7);
            switch (i3) {
                case -2114354517:
                case -238086741:
                    i2 = 1;
                    if (i == itemCount - 1) {
                        iM45029 = (C19806.m45029("ۚۨ") ^ i5) * (-109);
                        i6 = ((iM45029 ^ i4) * 1915) ^ 1663778570;
                        i7 = 448588249;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ۧ") + i4) * 75;
                        i6 = ((iM45029 ^ i5) * 9007) ^ (-152739678);
                        i7 = -50314489;
                    }
                    break;
                case -1830967616:
                case -1605468931:
                    return 0;
                case -1744022282:
                case -1214985558:
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM45029 = (i4 - C19806.m45029("ۗ᩵")) * (-37);
                        i6 = ((iM45029 ^ i5) * 29385) ^ (-465039550);
                        i7 = -892989483;
                    } else {
                        iM45029 = C19806.m45029("᩵ۨ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-14049)) ^ 755567452;
                        i7 = -1300619348;
                    }
                    break;
                case -1685125785:
                case -1638568460:
                    if (!RunnableC1564.f6300) {
                        iM45029 = (C19806.m45029("֫ۜ") ^ i5) * 67;
                        i6 = ((iM45029 ^ i4) * 31263) ^ (-562259066);
                        i7 = 1020307493;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ֡") + i5) * (-11);
                        i6 = ((iM45029 ^ i4) * 13917) ^ (-1164409004);
                        i7 = -307632118;
                    }
                    break;
                case -1644038823:
                case 792260594:
                    if (CallableC1627.f6528) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۗ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-11975)) ^ 108324355;
                        i7 = -1569960590;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ֡") + i5) * (-11);
                        i6 = ((iM45029 ^ i4) * 13917) ^ (-1164409004);
                        i7 = -307632118;
                    }
                    break;
                case -1316504346:
                case 700760476:
                    return i2;
                case -1263465464:
                case 448552343:
                    if (C0216.f1393 != 0) {
                        iM45029 = (i4 - C19806.m45029("ۗ᩵")) * (-37);
                        i6 = ((iM45029 ^ i5) * 29385) ^ (-465039550);
                        i7 = -892989483;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽۢ") + i5) * 101;
                        i6 = ((iM45029 ^ i4) * (-24333)) ^ (-1608566853);
                        i7 = 541100846;
                    }
                    break;
                case -1026607285:
                case 402309330:
                    C3660.m10791();
                    C1377.m4833();
                    return 0;
                case -1011666719:
                case 655797553:
                    C1668.m5583();
                    if (C1189.m4368() > 0) {
                        iM45029 = (i4 - C19806.m45029("ۗ᩵")) * (-37);
                        i6 = ((iM45029 ^ i5) * 29385) ^ (-465039550);
                        i7 = -892989483;
                    } else {
                        iM45029 = (C19806.m45029("֫ۜ") ^ i5) * 67;
                        i6 = ((iM45029 ^ i4) * 31263) ^ (-562259066);
                        i7 = 1020307493;
                    }
                    break;
                case -170735501:
                case 2140406547:
                    if (C10634.f36300 >= 0) {
                        iM45029 = (C19806.m45029("֫ۜ") ^ i5) * 67;
                        i6 = ((iM45029 ^ i4) * 31263) ^ (-562259066);
                        i7 = 1020307493;
                    } else {
                        iM45029 = (C19806.m45029("ۚۘ") + i4) * 89;
                        i6 = ((iM45029 ^ i5) * 18035) ^ 1892387424;
                        i7 = -838489289;
                    }
                    break;
                case -119553866:
                case 2016618831:
                    if (C3660.f13403 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ֡") + i5) * (-11);
                        i6 = ((iM45029 ^ i4) * 13917) ^ (-1164409004);
                        i7 = -307632118;
                    } else {
                        iM45029 = (C19806.m45029("۫۬") + i4) * 101;
                        i6 = ((iM45029 ^ i5) * 7453) ^ 1640472944;
                        i7 = 1396143128;
                    }
                    break;
                case -83772162:
                case 266996476:
                    if (C2124.f7782 > 0) {
                        iM45029 = (C19806.m45029("֫ۜ") ^ i5) * 67;
                        i6 = ((iM45029 ^ i4) * 31263) ^ (-562259066);
                        i7 = 1020307493;
                    } else {
                        iM45029 = C19806.m45029("۬ܶ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 25683) ^ (-445969560);
                        i7 = -1362336465;
                    }
                    break;
                case 70980290:
                case 1645199400:
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM45029 = (C19806.m45029("֫ۜ") ^ i5) * 67;
                        i6 = ((iM45029 ^ i4) * 31263) ^ (-562259066);
                        i7 = 1020307493;
                    } else {
                        iM45029 = (C19806.m45029("۫ۗ") ^ i5) * 49;
                        i6 = ((iM45029 ^ i4) * 30705) ^ (-1094506044);
                        i7 = 398855297;
                    }
                    break;
                case 752231186:
                case 1300970104:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = C19806.m45029("ۤ֫") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-693)) ^ (-1677707944);
                        i7 = 1205594010;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ۗ᩵")) * (-37);
                        i6 = ((iM45029 ^ i5) * 29385) ^ (-465039550);
                        i7 = -892989483;
                    }
                    break;
                case 899601347:
                case 1260664454:
                    if (RunnableC1895.f7152) {
                        iM45029 = C19806.m45029("᩻᩸") ^ i5;
                        i6 = ((iM45029 ^ i4) * 11527) ^ (-2035101756);
                        i7 = -1874895676;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ֡") + i5) * (-11);
                        i6 = ((iM45029 ^ i4) * 13917) ^ (-1164409004);
                        i7 = -307632118;
                    }
                    break;
                case 1029629992:
                case 1857022346:
                    RunnableC0195.m1431();
                    iM45029 = (C19806.m45029("֫ۜ") ^ i5) * 67;
                    i6 = ((iM45029 ^ i4) * 31263) ^ (-562259066);
                    i7 = 1020307493;
                    break;
                case 2031670408:
                case 2098356062:
                    if (C3286.f12186) {
                        iM45029 = (C19806.m45029("֫ۜ") ^ i5) * 67;
                        i6 = ((iM45029 ^ i4) * 31263) ^ (-562259066);
                        i7 = 1020307493;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸᩺") + i4) * 61;
                        i6 = ((iM45029 ^ i5) * (-27489)) ^ (-705683329);
                        i7 = -1823470485;
                    }
                    break;
                default:
                    itemCount = getItemCount();
                    if (C1398.m4895() <= 0) {
                        iM45029 = C19806.m45029("᩸۠") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-11253)) ^ 716017207;
                        i7 = 612942436;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤ۟") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-32241)) ^ (-49958031);
                        i7 = 1056809659;
                    }
                    break;
            }
        }
    }
}
