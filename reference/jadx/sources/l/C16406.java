package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܽۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F2T1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16406 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۤ۫᩺, reason: not valid java name and contains not printable characters */
    private static final short[] f52780 = {8105, 26686, 28867, 27751, -4951, -4959, -4960, -4951, -4951, -4951, -4951, -4902, -4915, -4926, -4951, -13539, 32725, -32553, -18351, -24011, 24703, -19817, -23748, -31819, 28871, 25725, 29876, -19427, 27647, -28243, 25167, 29468, -29917, -31147, -32549, 24627, -29710, -4960, -4941, -4951, -4989, 5994, -23153, -19120, -18006, 18956, 18364, -28945, 22435, -31612, -29883, 19165, 18017, -23740, -29796, 23350, -19088};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11736 f52781;

    @Override // l.AbstractC0414
    public final int getItemCount() {
        ActivityC11736 activityC11736 = null;
        int iM4837 = 0;
        int i = 1076442129;
        int i2 = C1025.f4800;
        int i3 = ThreadFactoryC3888.f14547;
        int iM45029 = C19806.m45029("֨۫") ^ i2;
        int i4 = ((iM45029 ^ i3) * 7055) ^ (-282378359);
        int i5 = 1865002127;
        while (true) {
            i = ((((i ^ i3) * (-17829)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2127722556:
                case -737086989:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = ThreadFactoryC3888.m11306("֨ᩴ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 21199) ^ 1971013358;
                        i5 = -1150844164;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۨ᩸")) * 61;
                        i4 = ((iM45029 ^ i3) * 15987) ^ 1871187401;
                        i5 = 1768078234;
                    }
                    break;
                case -2097437146:
                case 472562296:
                    RunnableC3388.m10064();
                    if (AbstractC0464.m2313() == 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 11869) ^ 721545462;
                        i5 = -1615695751;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۨ᩸")) * 61;
                        i4 = ((iM45029 ^ i3) * 15987) ^ 1871187401;
                        i5 = 1768078234;
                    }
                    break;
                case -1880634910:
                case 1409098473:
                    return 0;
                case -1602729083:
                case 327884297:
                    return iM4837 + 1;
                case -1468369443:
                case -239530651:
                    if (C2788.f10625 >= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۨ᩸")) * 61;
                        i4 = ((iM45029 ^ i3) * 15987) ^ 1871187401;
                        i5 = 1768078234;
                    } else {
                        iM45029 = (C19806.m45029("ܺᩴ") + i3) * 25;
                        i4 = ((iM45029 ^ i2) * 10377) ^ (-1835681014);
                        i5 = 631399164;
                    }
                    break;
                case -1336570185:
                case 1325621138:
                    if (!C0797.f3386) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ۠") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-28237)) ^ 701359970;
                        i5 = -450407255;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۨ᩸")) * 61;
                        i4 = ((iM45029 ^ i3) * 15987) ^ 1871187401;
                        i5 = 1768078234;
                    }
                    break;
                case -1287134143:
                case 491765094:
                    C1419.m4973();
                    return 0;
                case -1190938851:
                case 201961541:
                    iM4837 = C1377.m4837(activityC11736.f39458);
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = C19806.m45029("᩸ۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-11599)) ^ (-2010427124);
                        i5 = -625004744;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ۟") ^ i3;
                        i4 = ((iM45029 ^ i2) * 20711) ^ (-1003135459);
                        i5 = -165992563;
                    }
                    break;
                case -1185395885:
                case -848726143:
                    if (C1668.f6641 >= 0) {
                        iM45029 = C19806.m45029("᩸ۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-11599)) ^ (-2010427124);
                        i5 = -625004744;
                    } else {
                        iM45029 = C19806.m45029("ۖ۠") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-2513)) ^ (-392031313);
                        i5 = 82047615;
                    }
                    break;
                case -1162551814:
                case -732767110:
                    if (RunnableC1564.f6300) {
                        iM45029 = C19806.m45029("᩸ۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-11599)) ^ (-2010427124);
                        i5 = -625004744;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ܽ") ^ i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM45029 ^ i3) * 18711) ^ 133380138;
                        i5 = 1664194574;
                    }
                    break;
                case -1080496637:
                case -631797134:
                    activityC11736 = this.f52781;
                    if (C2788.m8472() != 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۨ᩸")) * 61;
                        i4 = ((iM45029 ^ i3) * 15987) ^ 1871187401;
                        i5 = 1768078234;
                    } else {
                        iM45029 = C19806.m45029("᩶ۧ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-5055)) ^ 1875145805;
                        i5 = 520047633;
                    }
                    break;
                case -957303533:
                case 1218444580:
                    if (C0216.m1591() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 11869) ^ 721545462;
                        i5 = -1615695751;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤۘ") + i2) * (-121);
                        i4 = ((iM45029 ^ i3) * 1213) ^ 1415712885;
                        i5 = -218013048;
                    }
                    break;
                case -944606371:
                case 229361318:
                    if (C3286.m9789(activityC11736.f39458)) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶۤ") ^ i2) * 21;
                        i4 = ((iM45029 ^ i3) * 19027) ^ 67738600;
                        i5 = 1299949020;
                    } else {
                        iM45029 = C19806.m45029("᩹ܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 16311) ^ 1787841628;
                        i5 = 1516831126;
                    }
                    break;
                case -749946727:
                case 1388377461:
                    C2477.m7593();
                    iM45029 = ThreadFactoryC3888.m11306("ᩴ۠") ^ i3;
                    i4 = ((iM45029 ^ i2) * (-28237)) ^ 701359970;
                    i5 = -450407255;
                    break;
                case 168681630:
                case 503888016:
                    if (C0526.f2219) {
                        iM45029 = (C19806.m45029("ۡܽ") ^ i3) * 59;
                        i4 = ((iM45029 ^ i2) * 19815) ^ (-600821969);
                        i5 = -187803696;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۨ᩸")) * 61;
                        i4 = ((iM45029 ^ i3) * 15987) ^ 1871187401;
                        i5 = 1768078234;
                    }
                    break;
                case 248932057:
                case 983850107:
                    if (C1189.f5284 <= 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۨ᩸")) * 61;
                        i4 = ((iM45029 ^ i3) * 15987) ^ 1871187401;
                        i5 = 1768078234;
                    } else {
                        iM45029 = C19806.m45029("ۖۡ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 15871) ^ 148136146;
                        i5 = -281338980;
                    }
                    break;
                case 1249022642:
                case 1266202801:
                    if (C2332.m7079() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ۠") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-28237)) ^ 701359970;
                        i5 = -450407255;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩶ۙ")) * (-63);
                        i4 = ((iM45029 ^ i3) * 3259) ^ 572911759;
                        i5 = 1896922975;
                    }
                    break;
                default:
                    if (C1377.f5749) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 4817) ^ (-206401740);
                        i5 = 1824845058;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۨ᩸")) * 61;
                        i4 = ((iM45029 ^ i3) * 15987) ^ 1871187401;
                        i5 = 1768078234;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC0414
    public final int getItemViewType(int i) {
        int itemCount = 0;
        int i2 = 0;
        int i3 = -893370710;
        int i4 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int i5 = C1461.f5957;
        int iM45029 = (C19806.m45029("ܶ֨") + i5) * (-101);
        int i6 = ((iM45029 ^ i4) * 23049) ^ (-1659742912);
        int i7 = 979285571;
        while (true) {
            i3 = ((((i3 ^ i4) * 16835) >> 31) & i6) ^ (iM45029 ^ i7);
            switch (i3) {
                case -2121594853:
                case -1908263520:
                    i2 = 1;
                    if (i == itemCount - 1) {
                        iM45029 = C19806.m45029("ۚۖ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 13509) ^ 536682802;
                        i7 = -212190148;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳᩴ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-13717)) ^ 571433496;
                        i7 = 1087757091;
                    }
                    break;
                case -1935754773:
                case -663773470:
                    if (!C3743.f13569) {
                        iM45029 = C19806.m45029("֫ܽ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 1265) ^ (-1940300973);
                        i7 = -1654467428;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶֫") + i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i6 = ((iM45029 ^ i4) * (-6661)) ^ (-311631318);
                        i7 = 1026316609;
                    }
                    break;
                case -1742353094:
                case 993039193:
                    RunnableC1564.m5345();
                    C1025.m3861();
                    iM45029 = ThreadFactoryC3888.m11306("ᩴ᩻") ^ i4;
                    i6 = ((iM45029 ^ i5) * 14069) ^ 234641015;
                    i7 = -114769991;
                    break;
                case -1421878621:
                case -536056915:
                    return i2;
                case -1335238535:
                case 211702228:
                    if (C7105.f23796 >= 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۜܺ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((iM45029 ^ i5) * (-7283)) ^ (-958596773);
                        i7 = -1533482661;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨۜ") + i5) * 119;
                        i6 = ((iM45029 ^ i4) * (-9987)) ^ 130161631;
                        i7 = 602678897;
                    }
                    break;
                case -1335018323:
                case -251628039:
                    C0278.m1789();
                    return 0;
                case -1319208255:
                case 1364521822:
                    if (C0526.m2437() >= 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۜܺ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((iM45029 ^ i5) * (-7283)) ^ (-958596773);
                        i7 = -1533482661;
                    } else {
                        iM45029 = C19806.m45029("֡֡") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-18723)) ^ (-1367393265);
                        i7 = 1473757775;
                    }
                    break;
                case -450820570:
                case 1903342883:
                    if (C1460.f5948 >= 0) {
                        iM45029 = (i4 - C19806.m45029("ܽۙ")) * (-95);
                        i6 = ((iM45029 ^ i5) * (-1269)) ^ 434638601;
                        i7 = -59827454;
                    } else {
                        iM45029 = (i4 - C19806.m45029("֡᩶")) * (-3);
                        i6 = ((iM45029 ^ i5) * 26971) ^ (-352986920);
                        i7 = 1970864504;
                    }
                    break;
                case -350571152:
                case 636155828:
                    if (C0526.m2437() >= 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۜܺ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((iM45029 ^ i5) * (-7283)) ^ (-958596773);
                        i7 = -1533482661;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۬ܳ") ^ i5) * 53;
                        i6 = ((iM45029 ^ i4) * 13179) ^ 643498430;
                        i7 = 657927566;
                    }
                    break;
                case 160454865:
                case 1796558610:
                    return 0;
                case 351152117:
                case 2059275754:
                    if (C2332.m7079() <= 0) {
                        iM45029 = C19806.m45029("֫ܽ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 1265) ^ (-1940300973);
                        i7 = -1654467428;
                    } else {
                        iM45029 = C19806.m45029("ᩳۧ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 11067) ^ (-933970143);
                        i7 = -401610994;
                    }
                    break;
                case 392028729:
                case 1780504890:
                    if (C3535.m10431() <= 0) {
                        iM45029 = C19806.m45029("֫ܽ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 1265) ^ (-1940300973);
                        i7 = -1654467428;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۟ۡ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 19899) ^ 1518423524;
                        i7 = 1059879685;
                    }
                    break;
                case 467613327:
                case 1954937160:
                    if (C2332.f8260) {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ܳ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 5239) ^ 310095857;
                        i7 = -1119420391;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ᩻") ^ i4;
                        i6 = ((iM45029 ^ i5) * 14069) ^ 234641015;
                        i7 = -114769991;
                    }
                    break;
                case 512867324:
                case 690726435:
                    itemCount = getItemCount();
                    if (C1398.f5802 <= 0) {
                        iM45029 = (i4 - C19806.m45029("ܽۙ")) * (-95);
                        i6 = ((iM45029 ^ i5) * (-1269)) ^ 434638601;
                        i7 = -59827454;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֫᩻") ^ i5;
                        i6 = ((iM45029 ^ i4) * 29057) ^ 546506683;
                        i7 = -702037453;
                    }
                    break;
                case 861970101:
                case 1098192224:
                    C1377.m4833();
                    if (C0278.f1572 <= 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۜܺ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((iM45029 ^ i5) * (-7283)) ^ (-958596773);
                        i7 = -1533482661;
                    } else {
                        iM45029 = C19806.m45029("֫ܽ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 1265) ^ (-1940300973);
                        i7 = -1654467428;
                    }
                    break;
                case 875826422:
                case 1986686324:
                    if (C3535.f13026 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶֫") + i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i6 = ((iM45029 ^ i4) * (-6661)) ^ (-311631318);
                        i7 = 1026316609;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ۖۤ")) * (-49);
                        i6 = ((iM45029 ^ i5) * 31367) ^ 84891463;
                        i7 = -311251010;
                    }
                    break;
                case 882539072:
                case 1281817733:
                    if (C1461.f5957 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ᩻") ^ i4;
                        i6 = ((iM45029 ^ i5) * 14069) ^ 234641015;
                        i7 = -114769991;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶۛ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 9663) ^ (-1271054932);
                        i7 = 1036243646;
                    }
                    break;
                default:
                    C1066.m4023();
                    if (C2477.f9839 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶֫") + i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i6 = ((iM45029 ^ i4) * (-6661)) ^ (-311631318);
                        i7 = 1026316609;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ᩻") ^ i4;
                        i6 = ((iM45029 ^ i5) * 14069) ^ 234641015;
                        i7 = -114769991;
                    }
                    break;
            }
        }
    }

    public C16406(ActivityC11736 activityC11736) {
        this.f52781 = activityC11736;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 41361. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractC0414
    public final void onBindViewHolder(l.AbstractC12554 r57, int r58) {
        /*
            Method dump skipped, instruction units count: 4136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16406.onBindViewHolder(l.۫ܿܰ, int):void");
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int iM45029;
        int i2;
        int i3;
        int iM450210;
        int i4;
        int iM11306;
        int i5;
        int i6;
        int iM11307;
        int i7;
        int i8;
        int i9;
        int iM11308;
        viewGroup = viewGroup;
        int i10 = C3660.f13403;
        int i11 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM450211 = C19806.m45029("ܳ֡") ^ i11;
        int i12 = ((iM450211 ^ i10) * 31191) ^ 862417614;
        LayoutInflater layoutInflaterFrom = null;
        LayoutInflater layoutInflaterFrom2 = null;
        String strM2308 = null;
        short[] sArr = null;
        int i13 = iM450211 ^ 1550337920;
        int i14 = 0;
        int iM450212 = 0;
        int iM450213 = 0;
        int i15 = 0;
        int iM11309 = 0;
        int i16 = -469580153;
        C13853 c13853 = null;
        int iM113010 = 0;
        ActivityC11736 activityC11736 = null;
        TextView textView = null;
        boolean z = false;
        View viewM8167 = null;
        View viewInflate = null;
        short[] sArr2 = null;
        short s = 0;
        while (true) {
            i16 = i13 ^ (i12 & (((i16 ^ i10) * (-13985)) >> 31));
            switch (i16) {
                case -2078588184:
                case 1153876698:
                    layoutInflaterFrom = LayoutInflater.from(activityC11736);
                    iM113010 = ThreadFactoryC3888.m11306(C1460.m5047(f52780, 42, 3, i14));
                    if (C0526.f2219) {
                        iM11308 = ThreadFactoryC3888.m11306("ۙܶ") ^ i10;
                        i12 = ((iM11308 ^ i11) * 24635) ^ 1482859995;
                        i9 = -1621321291;
                    } else {
                        iM11308 = (C19806.m45029("ۘۤ") ^ i10) * 7;
                        i12 = ((iM11308 ^ i11) * (-13855)) ^ (-1021739081);
                        i9 = 1892853823;
                    }
                    i13 = iM11308 ^ i9;
                    viewGroup = viewGroup;
                    break;
                case -1937452509:
                case 1860987708:
                    RunnableC1895.m6165(C3743.m10957(viewInflate, iM450213 ^ i15), 8);
                    return c13853;
                case -1930324903:
                case -1500782561:
                    layoutInflaterFrom = layoutInflaterFrom;
                    s = sArr[41];
                    if (C3577.f13150 < 0) {
                        iM450210 = (ThreadFactoryC3888.m11306("ۜܺ") + i10) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i12 = ((iM450210 ^ i11) * (-27841)) ^ (-1086126294);
                        i4 = -916205572;
                        i13 = iM450210 ^ i4;
                        layoutInflaterFrom = layoutInflaterFrom;
                    } else {
                        int iM113011 = ThreadFactoryC3888.m11306("ܿܶ") ^ i10;
                        i12 = ((iM113011 ^ i11) * (-32251)) ^ (-1916738390);
                        i13 = iM113011 ^ 166104817;
                        viewGroup = viewGroup;
                        layoutInflaterFrom = layoutInflaterFrom;
                        c13853 = null;
                    }
                    break;
                case -1717868286:
                case 1793073002:
                    C0817.m3399();
                    C1398.m4895();
                    iM45029 = (ThreadFactoryC3888.m11306("ۧ۬") + i10) * 59;
                    i2 = ((iM45029 ^ i11) * 25393) ^ 784274385;
                    i3 = -1367129365;
                    i13 = iM45029 ^ i3;
                    i12 = i2;
                    break;
                case -1647539667:
                case -390814859:
                    return new ViewOnClickListenerC4679(activityC11736, layoutInflaterFrom2.inflate(2121949048 ^ iM11309, viewGroup, z));
                case -1639430043:
                case 318523744:
                    C0797.m3359();
                    if (C0050.f912 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧ۬") + i10) * 59;
                        i2 = ((iM45029 ^ i11) * 25393) ^ 784274385;
                        i3 = -1367129365;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠ۜ") ^ i11;
                        i2 = ((iM45029 ^ i10) * (-9203)) ^ (-1780812145);
                        i3 = 240271989;
                    }
                    i13 = iM45029 ^ i3;
                    i12 = i2;
                    break;
                case -1353675714:
                case 1335982553:
                    if (C2642.m8171() != 0) {
                        iM11308 = ThreadFactoryC3888.m11306("ۙܶ") ^ i10;
                        i12 = ((iM11308 ^ i11) * 24635) ^ 1482859995;
                        i9 = -1621321291;
                        i13 = iM11308 ^ i9;
                        viewGroup = viewGroup;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧ۬") + i10) * 59;
                        i2 = ((iM45029 ^ i11) * 25393) ^ 784274385;
                        i3 = -1367129365;
                        i13 = iM45029 ^ i3;
                        i12 = i2;
                    }
                    break;
                case -1307391361:
                case 1427795990:
                    layoutInflaterFrom = layoutInflaterFrom;
                    viewInflate = layoutInflaterFrom.inflate(iM113010 ^ 2126029866, viewGroup, z);
                    if (C3743.f13569) {
                        C13853 c13854 = new C13853(viewInflate);
                        strM2308 = AbstractC0464.m2308(f52780, 45, 3, i14);
                        if (C0629.f2722 > 0) {
                            int iM450214 = C19806.m45029("᩹᩸") ^ i11;
                            i12 = ((iM450214 ^ i10) * 11487) ^ 225201217;
                            i13 = iM450214 ^ (-1374970921);
                            c13853 = c13854;
                            layoutInflaterFrom = layoutInflaterFrom;
                            break;
                        }
                    }
                    int iM113012 = ThreadFactoryC3888.m11306("ܿܶ") ^ i10;
                    i12 = ((iM113012 ^ i11) * (-32251)) ^ (-1916738390);
                    i13 = iM113012 ^ 166104817;
                    viewGroup = viewGroup;
                    layoutInflaterFrom = layoutInflaterFrom;
                    c13853 = null;
                    break;
                case -1241033084:
                case -1029962115:
                    ThreadFactoryC3888.m11303(textView, 2128985329 ^ iM450212);
                    sArr2 = f52780;
                    if (!C19806.f63586) {
                        iM45029 = (C19806.m45029("۫ۙ") + i11) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i2 = ((iM45029 ^ i10) * (-28459)) ^ 457313974;
                        i3 = -228961486;
                        i13 = iM45029 ^ i3;
                        i12 = i2;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("ۙܶ") ^ i10;
                        i12 = ((iM11308 ^ i11) * 24635) ^ 1482859995;
                        i9 = -1621321291;
                        i13 = iM11308 ^ i9;
                        viewGroup = viewGroup;
                    }
                    break;
                case -833628021:
                case 252363135:
                    viewM8167 = C2642.m8167(viewInflate, C19806.m45029(strM2308) ^ 2104252481);
                    if (C0671.f2816 == 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴᩳ") ^ i10;
                        i2 = ((iM45029 ^ i11) * (-18337)) ^ (-864157558);
                        i3 = -81977791;
                        i13 = iM45029 ^ i3;
                        i12 = i2;
                    } else {
                        layoutInflaterFrom = layoutInflaterFrom;
                        int iM113013 = ThreadFactoryC3888.m11306("ܿܶ") ^ i10;
                        i12 = ((iM113013 ^ i11) * (-32251)) ^ (-1916738390);
                        i13 = iM113013 ^ 166104817;
                        viewGroup = viewGroup;
                        layoutInflaterFrom = layoutInflaterFrom;
                        c13853 = null;
                    }
                    break;
                case -401850946:
                case 2018566625:
                    i14 = 55103;
                    iM11306 = (i11 - C19806.m45029("֡۬")) * 21;
                    i5 = ((iM11306 ^ i10) * (-16889)) ^ 1604041676;
                    i6 = 1113226039;
                    i13 = iM11306 ^ i6;
                    i12 = i5;
                    layoutInflaterFrom = layoutInflaterFrom;
                    viewGroup = viewGroup;
                    break;
                case -269366179:
                case 1540870611:
                    C19806.m45024();
                    return null;
                case -43337991:
                case 1468239489:
                    layoutInflaterFrom = layoutInflaterFrom;
                    sArr = f52780;
                    if (C1977.f7413 <= 0) {
                        iM450210 = (C19806.m45029("۬ۤ") + i11) * 11;
                        i12 = ((iM450210 ^ i10) * (-8085)) ^ (-1236740822);
                        i4 = 1924864519;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("ܶۚ") + i11) * (-41);
                        i12 = ((iM450210 ^ i10) * (-32011)) ^ (-1667309184);
                        i4 = -1878097998;
                    }
                    i13 = iM450210 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    break;
                case 150102923:
                case 591286979:
                    if (C0278.f1572 > 0) {
                        layoutInflaterFrom = layoutInflaterFrom;
                        iM450210 = (C19806.m45029("۬ۤ") + i11) * 11;
                        i12 = ((iM450210 ^ i10) * (-8085)) ^ (-1236740822);
                        i4 = 1924864519;
                        i13 = iM450210 ^ i4;
                        layoutInflaterFrom = layoutInflaterFrom;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧ۬") + i10) * 59;
                        i2 = ((iM45029 ^ i11) * 25393) ^ 784274385;
                        i3 = -1367129365;
                        i13 = iM45029 ^ i3;
                        i12 = i2;
                    }
                    break;
                case 1029600365:
                case 1603853853:
                    layoutInflaterFrom = layoutInflaterFrom;
                    short s2 = s;
                    if (((s2 * s2) + 209294089) - (s2 * 28934) >= 0) {
                        s = s2;
                        iM450210 = (ThreadFactoryC3888.m11306("ܳۛ") ^ i11) * (-15);
                        i12 = ((iM450210 ^ i10) * (-19599)) ^ (-1101434181);
                        i4 = -600923118;
                        i13 = iM450210 ^ i4;
                        layoutInflaterFrom = layoutInflaterFrom;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ܳ") ^ i10;
                        s = s2;
                        i5 = ((iM11306 ^ i11) * (-19789)) ^ 1979644801;
                        i6 = 2141267875;
                        i13 = iM11306 ^ i6;
                        i12 = i5;
                        layoutInflaterFrom = layoutInflaterFrom;
                        viewGroup = viewGroup;
                    }
                    break;
                case 1291654109:
                case 2055419562:
                    i14 = 54492;
                    iM11306 = (i11 - C19806.m45029("֡۬")) * 21;
                    i5 = ((iM11306 ^ i10) * (-16889)) ^ 1604041676;
                    i6 = 1113226039;
                    i13 = iM11306 ^ i6;
                    i12 = i5;
                    layoutInflaterFrom = layoutInflaterFrom;
                    viewGroup = viewGroup;
                    break;
                case 1349062754:
                case 1823502717:
                    textView = (TextView) viewM8167;
                    iM450212 = C19806.m45029(RunnableC0195.m1429(f52780, 48, 3, i14));
                    if (C10634.f36300 < 0) {
                        iM45029 = C19806.m45029("ۚܽ") ^ i11;
                        i2 = ((iM45029 ^ i10) * 23457) ^ (-1353899442);
                        i3 = 386242704;
                        i13 = iM45029 ^ i3;
                        i12 = i2;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("ۙܶ") ^ i10;
                        i12 = ((iM11308 ^ i11) * 24635) ^ 1482859995;
                        i9 = -1621321291;
                        i13 = iM11308 ^ i9;
                        viewGroup = viewGroup;
                    }
                    break;
                case 1917653893:
                case 2138558279:
                    layoutInflaterFrom2 = LayoutInflater.from(activityC11736);
                    iM11309 = ThreadFactoryC3888.m11306(C1461.m5070(f52780, 54, 3, i14));
                    if (!C3743.f13569) {
                        layoutInflaterFrom = layoutInflaterFrom;
                        iM450210 = (C19806.m45029("۬ۤ") + i11) * 11;
                        i12 = ((iM450210 ^ i10) * (-8085)) ^ (-1236740822);
                        i4 = 1924864519;
                        i13 = iM450210 ^ i4;
                        layoutInflaterFrom = layoutInflaterFrom;
                    } else {
                        iM45029 = C19806.m45029("۫᩹") ^ i10;
                        i2 = ((iM45029 ^ i11) * 8685) ^ (-1774137526);
                        i3 = 174218112;
                        i13 = iM45029 ^ i3;
                        i12 = i2;
                    }
                    break;
                case 1940492478:
                case 2001116427:
                    LayoutInflater layoutInflater = layoutInflaterFrom;
                    activityC11736 = this.f52781;
                    if (i == 0) {
                        iM11307 = (C19806.m45029("ܿ᩵") + i11) * (-89);
                        i7 = ((iM11307 ^ i10) * (-32517)) ^ (-302900502);
                        i8 = 2056841212;
                    } else {
                        iM11307 = (i10 - ThreadFactoryC3888.m11306("ۘܳ")) * (-103);
                        i7 = ((iM11307 ^ i11) * 5411) ^ (-200037105);
                        i8 = -1114759822;
                    }
                    i13 = iM11307 ^ i8;
                    viewGroup = viewGroup;
                    i12 = i7;
                    layoutInflaterFrom = layoutInflater;
                    z = false;
                    break;
                default:
                    iM450213 = C19806.m45029(RunnableC3388.m10056(sArr2, 51, 3, i14));
                    i15 = 2104056420;
                    if (C1398.m4895() > 0) {
                        iM45029 = (C19806.m45029("ܳۗ") ^ i10) * 61;
                        i2 = ((iM45029 ^ i11) * (-13249)) ^ 60932539;
                        i3 = -1474188856;
                        i13 = iM45029 ^ i3;
                        i12 = i2;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("ۙܶ") ^ i10;
                        i12 = ((iM11308 ^ i11) * 24635) ^ 1482859995;
                        i9 = -1621321291;
                        i13 = iM11308 ^ i9;
                        viewGroup = viewGroup;
                    }
                    break;
            }
        }
    }
}
