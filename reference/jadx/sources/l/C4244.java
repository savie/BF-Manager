package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۘ᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1XT */
/* JADX INFO: loaded from: classes3.dex */
public final class C4244 extends AbstractC0414 {

    /* JADX INFO: renamed from: ܺ᩺᩹, reason: not valid java name and contains not printable characters */
    private static final short[] f15339 = {4823, 32452, -29893, -31283, -31090, 29388, -22046, 7782, -20694, -21227, -17002};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC23296 f15340;

    @Override // l.AbstractC0414
    public final int getItemViewType(int i) {
        ActivityC23296 activityC23296 = null;
        String[][] strArr = null;
        int length = 0;
        String[][] strArr2 = null;
        int i2 = 614864263;
        int i3 = C1066.f4915;
        int i4 = C3535.f13026;
        int iM11306 = (ThreadFactoryC3888.m11306("ۚ֫") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
        int i5 = ((iM11306 ^ i3) * (-21303)) ^ 1217671546;
        int i6 = -1685047565;
        while (true) {
            i2 = ((((i2 ^ i3) * 14859) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -2143977673:
                case -1107195573:
                    if (RunnableC1895.f7152) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷۟") ^ i3) * 9;
                        i5 = ((iM11306 ^ i4) * (-30719)) ^ (-1882757310);
                        i6 = 1883528144;
                    } else {
                        iM11306 = (C19806.m45029("ܺۨ") + i3) * (-75);
                        i5 = ((iM11306 ^ i4) * (-17583)) ^ 382444100;
                        i6 = -2081242726;
                    }
                    break;
                case -1931426927:
                case -1822772016:
                    activityC23296 = this.f15340;
                    if (C1460.f5948 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨ۟") ^ i4) * (-11);
                        i5 = ((iM11306 ^ i3) * (-9265)) ^ 1558748255;
                        i6 = -1318268490;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽۤ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-1709)) ^ (-652085455);
                        i6 = 1868857733;
                    }
                    break;
                case -1854798725:
                case 1747859083:
                    C3286.m9798();
                    C1148.m4232();
                    iM11306 = (ThreadFactoryC3888.m11306("ۨ۟") ^ i4) * (-11);
                    i5 = ((iM11306 ^ i3) * (-9265)) ^ 1558748255;
                    i6 = -1318268490;
                    break;
                case -1713326991:
                case 2111866145:
                    return 1;
                case -1713283429:
                case 1346013118:
                    C2332.m7079();
                    C1066.m4023();
                    return 0;
                case -1650150956:
                case 1170293995:
                    if (C1398.m4895() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ᩺") ^ i3;
                        i5 = ((iM11306 ^ i4) * 1815) ^ 835163102;
                        i6 = -187769498;
                    } else {
                        iM11306 = (C19806.m45029("ܰۙ") ^ i4) * 73;
                        i5 = ((iM11306 ^ i3) * 13421) ^ (-866325945);
                        i6 = -51220621;
                    }
                    break;
                case -1515408315:
                case -1148059712:
                    return 0;
                case -1301351274:
                case 577345233:
                    ThreadFactoryC3888.m11300();
                    if (C1668.f6641 < 0) {
                        iM11306 = (C19806.m45029("᩻ۡ") + i4) * (-111);
                        i5 = ((iM11306 ^ i3) * (-13647)) ^ (-966069399);
                        i6 = -2066698815;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨ۟") ^ i4) * (-11);
                        i5 = ((iM11306 ^ i3) * (-9265)) ^ 1558748255;
                        i6 = -1318268490;
                    }
                    break;
                case -1300581089:
                case 181948332:
                    strArr = activityC23296.f75546;
                    if (C1148.f5161 <= 0) {
                        iM11306 = C19806.m45029("۟᩶") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-15269)) ^ 1839708577;
                        i6 = -1127045243;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩷ۚ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((iM11306 ^ i4) * (-2069)) ^ 800646290;
                        i6 = 104005578;
                    }
                    break;
                case -1186273161:
                case -890025405:
                    if (C2249.f8050 >= 0) {
                        iM11306 = (C19806.m45029("᩻ۡ") + i4) * (-111);
                        i5 = ((iM11306 ^ i3) * (-13647)) ^ (-966069399);
                        i6 = -2066698815;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ۘ") + i4) * 43;
                        i5 = ((iM11306 ^ i3) * 5405) ^ 339744197;
                        i6 = 1489430106;
                    }
                    break;
                case -1181665348:
                case -483443364:
                    if (C0817.f3443) {
                        iM11306 = (C19806.m45029("ۜۚ") + i4) * 119;
                        i5 = ((iM11306 ^ i3) * 5323) ^ (-641401765);
                        i6 = 799043760;
                    } else {
                        iM11306 = (C19806.m45029("᩻ۡ") + i4) * (-111);
                        i5 = ((iM11306 ^ i3) * (-13647)) ^ (-966069399);
                        i6 = -2066698815;
                    }
                    break;
                case -974966154:
                case -393236876:
                    if (!C3743.f13569) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ᩺") ^ i3;
                        i5 = ((iM11306 ^ i4) * 1815) ^ 835163102;
                        i6 = -187769498;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨ۟") ^ i4) * (-11);
                        i5 = ((iM11306 ^ i3) * (-9265)) ^ 1558748255;
                        i6 = -1318268490;
                    }
                    break;
                case -711329651:
                case -470550394:
                    if (C3577.f13150 >= 0) {
                        iM11306 = C19806.m45029("۟᩶") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-15269)) ^ 1839708577;
                        i6 = -1127045243;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤܶ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-14741)) ^ 1084436064;
                        i6 = -754965668;
                    }
                    break;
                case -647077476:
                case 1085972511:
                    if (!C0629.m2907()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ᩺") ^ i3;
                        i5 = ((iM11306 ^ i4) * 1815) ^ 835163102;
                        i6 = -187769498;
                    } else {
                        iM11306 = (C19806.m45029("ܺۨ") + i3) * (-75);
                        i5 = ((iM11306 ^ i4) * (-17583)) ^ 382444100;
                        i6 = -2081242726;
                    }
                    break;
                case -194191961:
                case 436768098:
                    if (i < strArr2.length + length) {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ۧ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-32639)) ^ (-858098021);
                        i6 = -567349823;
                    } else {
                        iM11306 = C19806.m45029("᩷ᩳ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 19825) ^ (-1767198451);
                        i6 = -972831054;
                    }
                    break;
                case 1108223166:
                case 1373581785:
                    if (C7105.m18985()) {
                        iM11306 = (C19806.m45029("᩻ۡ") + i4) * (-111);
                        i5 = ((iM11306 ^ i3) * (-13647)) ^ (-966069399);
                        i6 = -2066698815;
                    } else {
                        iM11306 = C19806.m45029("ܺۡ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 8071) ^ (-790205659);
                        i6 = -132612515;
                    }
                    break;
                case 1384490263:
                case 2075534957:
                    length = strArr.length;
                    strArr2 = activityC23296.f75545;
                    if (C0050.m946() <= 0) {
                        iM11306 = C19806.m45029("۟᩶") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-15269)) ^ 1839708577;
                        i6 = -1127045243;
                    } else {
                        iM11306 = (C19806.m45029("ܺܿ") + i4) * (-113);
                        i5 = ((iM11306 ^ i3) * (-10267)) ^ (-1901643009);
                        i6 = -1214779970;
                    }
                    break;
                default:
                    if (C2642.m8171() != 0) {
                        iM11306 = C19806.m45029("۟᩶") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-15269)) ^ 1839708577;
                        i6 = -1127045243;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷֫") ^ i3) * (-77);
                        i5 = ((iM11306 ^ i4) * 28431) ^ 1160479071;
                        i6 = -2035803886;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x026d A[PHI: r8 r9 r10 r17 r19
      0x026d: PHI (r8v4 short) = (r8v3 short), (r8v2 short) binds: [B:63:0x026b, B:59:0x0247] A[DONT_GENERATE, DONT_INLINE]
      0x026d: PHI (r9v3 int) = (r9v2 int), (r9v4 int) binds: [B:63:0x026b, B:59:0x0247] A[DONT_GENERATE, DONT_INLINE]
      0x026d: PHI (r10v3 int) = (r10v2 int), (r10v4 int) binds: [B:63:0x026b, B:59:0x0247] A[DONT_GENERATE, DONT_INLINE]
      0x026d: PHI (r17v13 android.view.LayoutInflater) = (r17v12 android.view.LayoutInflater), (r17v14 android.view.LayoutInflater) binds: [B:63:0x026b, B:59:0x0247] A[DONT_GENERATE, DONT_INLINE]
      0x026d: PHI (r19v15 l.᩺᩺ۘ) = (r19v14 l.᩺᩺ۘ), (r19v16 l.᩺᩺ۘ) binds: [B:63:0x026b, B:59:0x0247] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x0300 A[PHI: r4 r17 r19
      0x0300: PHI (r4v6 int) = (r4v5 int), (r4v2 int), (r4v2 int) binds: [B:12:0x005c, B:75:0x02fe, B:71:0x02db] A[DONT_GENERATE, DONT_INLINE]
      0x0300: PHI (r17v8 android.view.LayoutInflater) = (r17v4 android.view.LayoutInflater), (r17v7 android.view.LayoutInflater), (r17v9 android.view.LayoutInflater) binds: [B:12:0x005c, B:75:0x02fe, B:71:0x02db] A[DONT_GENERATE, DONT_INLINE]
      0x0300: PHI (r19v10 l.᩺᩺ۘ) = (r19v6 l.᩺᩺ۘ), (r19v9 l.᩺᩺ۘ), (r19v11 l.᩺᩺ۘ) binds: [B:12:0x005c, B:75:0x02fe, B:71:0x02db] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int iM45029;
        int i2;
        int i3;
        int iM450210;
        int i4;
        int i5;
        int i6 = i;
        int i7 = C0278.f1572;
        int i8 = C2642.f10294;
        int iM450211 = C19806.m45029("ۜ۬") ^ i7;
        int i9 = ((iM450211 ^ i8) * 1805) ^ (-1030327979);
        LayoutInflater layoutInflaterFrom = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i10 = iM450211 ^ 1470629910;
        ActivityC23296 activityC23296 = null;
        short s = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = -1995248033;
        String strM9869 = null;
        View viewInflate = null;
        int iM11306 = 0;
        while (true) {
            i15 = i10 ^ (i9 & (((i15 ^ i8) * 18617) >> 31));
            switch (i15) {
                case -1921316380:
                case -1545166056:
                    activityC23296 = activityC23296;
                    layoutInflaterFrom = layoutInflaterFrom;
                    s = sArr[7];
                    if (C1189.f5284 <= 0) {
                        iM450210 = (i7 - C19806.m45029("֡ۙ")) * (-5);
                        i9 = ((iM450210 ^ i8) * (-15315)) ^ 380080905;
                        i4 = -1636760018;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("ᩳ᩶") ^ i7;
                        i9 = ((iM450210 ^ i8) * 3841) ^ 765285543;
                        i4 = 374286261;
                    }
                    i5 = iM450210 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    activityC23296 = activityC23296;
                    i10 = i5;
                    i6 = i;
                    break;
                case -1705145373:
                case 246217397:
                    C2788.m8472();
                    return null;
                case -1682888521:
                case 1017987603:
                    CallableC1627.m5507();
                    if (C1066.f4915 <= 0) {
                        iM45029 = (i7 - ThreadFactoryC3888.m11306("ᩴ֫")) * (-41);
                        layoutInflaterFrom = layoutInflaterFrom;
                        i2 = ((iM45029 ^ i8) * 31559) ^ (-1793233340);
                        i3 = -1946966019;
                        LayoutInflater layoutInflater = layoutInflaterFrom;
                        i10 = iM45029 ^ i3;
                        i9 = i2;
                        layoutInflaterFrom = layoutInflater;
                    }
                    layoutInflaterFrom = layoutInflaterFrom;
                    iM45029 = ThreadFactoryC3888.m11306("ۤܶ") ^ i8;
                    i2 = ((iM45029 ^ i7) * (-14979)) ^ 2006290565;
                    i3 = 288840797;
                    LayoutInflater layoutInflater2 = layoutInflaterFrom;
                    i10 = iM45029 ^ i3;
                    i9 = i2;
                    layoutInflaterFrom = layoutInflater2;
                    break;
                case -1666038059:
                case 1612838805:
                    LayoutInflater layoutInflater3 = layoutInflaterFrom;
                    ActivityC23296 activityC23297 = this.f15340;
                    if (i6 != 1) {
                        int iM450212 = (C19806.m45029("᩻ۤ") + i8) * (-63);
                        activityC23296 = activityC23297;
                        layoutInflaterFrom = layoutInflater3;
                        i10 = iM450212 ^ (-1648504543);
                        i9 = ((iM450212 ^ i7) * (-2613)) ^ 548913215;
                    } else {
                        int iM450213 = C19806.m45029("ܿܺ") ^ i7;
                        i9 = ((iM450213 ^ i8) * 23035) ^ (-1847351768);
                        i5 = iM450213 ^ 810130916;
                        activityC23296 = activityC23297;
                        layoutInflaterFrom = layoutInflater3;
                        i10 = i5;
                    }
                    i6 = i;
                    break;
                case -1648239598:
                case 759069016:
                    layoutInflaterFrom = layoutInflaterFrom;
                    View view = new View(activityC23296);
                    if (C0526.m2437() >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۤܶ") ^ i8;
                        i2 = ((iM45029 ^ i7) * (-14979)) ^ 2006290565;
                        i3 = 288840797;
                        LayoutInflater layoutInflater4 = layoutInflaterFrom;
                        i10 = iM45029 ^ i3;
                        i9 = i2;
                        layoutInflaterFrom = layoutInflater4;
                    } else if (C3722.f13525 > 0) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-1, C1460.m5054(10.0f)));
                        viewInflate = view;
                        int iM11307 = (ThreadFactoryC3888.m11306("᩸۬") + i8) * 17;
                        layoutInflaterFrom = layoutInflaterFrom;
                        i10 = iM11307 ^ (-657907863);
                        i9 = ((iM11307 ^ i7) * (-12447)) ^ 1838253050;
                        activityC23296 = activityC23296;
                    } else {
                        iM450210 = C19806.m45029("۠۟") ^ i8;
                        i9 = ((iM450210 ^ i7) * 12861) ^ 1295650366;
                        i4 = -2077587086;
                        i5 = iM450210 ^ i4;
                        layoutInflaterFrom = layoutInflaterFrom;
                        activityC23296 = activityC23296;
                        i10 = i5;
                        i6 = i;
                    }
                    break;
                case -1540469847:
                case 855878629:
                    viewInflate = layoutInflaterFrom.inflate(iM11306, viewGroup, false);
                    layoutInflaterFrom = layoutInflaterFrom;
                    int iM11308 = (ThreadFactoryC3888.m11306("᩸۬") + i8) * 17;
                    layoutInflaterFrom = layoutInflaterFrom;
                    i10 = iM11308 ^ (-657907863);
                    i9 = ((iM11308 ^ i7) * (-12447)) ^ 1838253050;
                    activityC23296 = activityC23296;
                    break;
                case -1437801374:
                case 2128758481:
                    layoutInflaterFrom = LayoutInflater.from(activityC23296);
                    sArr2 = f15339;
                    if (RunnableC0195.f1321 >= 0) {
                        i14 = 8;
                        iM45029 = (i7 - ThreadFactoryC3888.m11306("ᩴ֫")) * (-41);
                        layoutInflaterFrom = layoutInflaterFrom;
                        i2 = ((iM45029 ^ i8) * 31559) ^ (-1793233340);
                        i3 = -1946966019;
                        LayoutInflater layoutInflater5 = layoutInflaterFrom;
                        i10 = iM45029 ^ i3;
                        i9 = i2;
                        layoutInflaterFrom = layoutInflater5;
                    } else {
                        int iM450214 = C19806.m45029("۫᩸") ^ i8;
                        i10 = iM450214 ^ (-1034512029);
                        i9 = ((iM450214 ^ i7) * 18233) ^ 1755998075;
                        i14 = 8;
                    }
                    break;
                case -1395875475:
                case 1282007035:
                    activityC23296 = activityC23296;
                    layoutInflaterFrom = layoutInflaterFrom;
                    if (i11 - (232562500 + i12) > 0) {
                        iM450210 = (C19806.m45029("ۢ᩺") + i8) * (-9);
                        i9 = ((iM450210 ^ i7) * (-4279)) ^ (-1058263372);
                        i4 = -1455218069;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("ۙ᩻") ^ i7;
                        i9 = ((iM450210 ^ i8) * 13787) ^ (-683044832);
                        i4 = -421950928;
                    }
                    i5 = iM450210 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    activityC23296 = activityC23296;
                    i10 = i5;
                    i6 = i;
                    break;
                case -1390404993:
                case -226236890:
                    activityC23296 = activityC23296;
                    layoutInflaterFrom = layoutInflaterFrom;
                    if (RunnableC1564.f6300) {
                        iM450210 = (i7 - ThreadFactoryC3888.m11306("۫ۧ")) * 99;
                        i9 = ((iM450210 ^ i8) * 8361) ^ (-1719128168);
                        i4 = -1500925634;
                    } else {
                        iM450210 = (i7 - ThreadFactoryC3888.m11306("ۘۖ")) * 83;
                        i9 = ((iM450210 ^ i8) * (-28327)) ^ (-302204534);
                        i4 = -583794568;
                    }
                    i5 = iM450210 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    activityC23296 = activityC23296;
                    i10 = i5;
                    i6 = i;
                    break;
                case -1052569625:
                case -540639660:
                    return new ViewOnClickListenerC7067(activityC23296, viewInflate, i6);
                case -1024035648:
                case 1254319925:
                    i13 = 62811;
                    iM450210 = ThreadFactoryC3888.m11306("ܿۢ") ^ i7;
                    i9 = ((iM450210 ^ i8) * (-22621)) ^ 1711163418;
                    i4 = 2102793073;
                    i5 = iM450210 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    activityC23296 = activityC23296;
                    i10 = i5;
                    i6 = i;
                    break;
                case -1014557395:
                case -812425841:
                    C2704.m8255();
                    C0278.m1789();
                    layoutInflaterFrom = layoutInflaterFrom;
                    iM45029 = ThreadFactoryC3888.m11306("ۤܶ") ^ i8;
                    i2 = ((iM45029 ^ i7) * (-14979)) ^ 2006290565;
                    i3 = 288840797;
                    LayoutInflater layoutInflater6 = layoutInflaterFrom;
                    i10 = iM45029 ^ i3;
                    i9 = i2;
                    layoutInflaterFrom = layoutInflater6;
                    break;
                case -841158479:
                case -222199909:
                    RunnableC1606.m5473();
                    if (AbstractC0464.f2088 > 0) {
                        activityC23296 = activityC23296;
                        layoutInflaterFrom = layoutInflaterFrom;
                        iM450210 = (i7 - ThreadFactoryC3888.m11306("۫ۧ")) * 99;
                        i9 = ((iM450210 ^ i8) * 8361) ^ (-1719128168);
                        i4 = -1500925634;
                        i5 = iM450210 ^ i4;
                        layoutInflaterFrom = layoutInflaterFrom;
                        activityC23296 = activityC23296;
                        i10 = i5;
                        i6 = i;
                    } else {
                        layoutInflaterFrom = layoutInflaterFrom;
                        iM45029 = ThreadFactoryC3888.m11306("ۤܶ") ^ i8;
                        i2 = ((iM45029 ^ i7) * (-14979)) ^ 2006290565;
                        i3 = 288840797;
                        LayoutInflater layoutInflater7 = layoutInflaterFrom;
                        i10 = iM45029 ^ i3;
                        i9 = i2;
                        layoutInflaterFrom = layoutInflater7;
                    }
                    break;
                case -672878106:
                case 847594204:
                    iM11306 = 2130372737 ^ ThreadFactoryC3888.m11306(strM9869);
                    if (RunnableC1606.f6488 < 0) {
                        iM45029 = C19806.m45029("ۜܶ") ^ i7;
                        layoutInflaterFrom = layoutInflaterFrom;
                        i2 = ((iM45029 ^ i8) * 25835) ^ (-1986523743);
                        i3 = 779383640;
                        LayoutInflater layoutInflater8 = layoutInflaterFrom;
                        i10 = iM45029 ^ i3;
                        i9 = i2;
                        layoutInflaterFrom = layoutInflater8;
                    } else {
                        activityC23296 = activityC23296;
                        layoutInflaterFrom = layoutInflaterFrom;
                        iM450210 = (i7 - ThreadFactoryC3888.m11306("۫ۧ")) * 99;
                        i9 = ((iM450210 ^ i8) * 8361) ^ (-1719128168);
                        i4 = -1500925634;
                        i5 = iM450210 ^ i4;
                        layoutInflaterFrom = layoutInflaterFrom;
                        activityC23296 = activityC23296;
                        i10 = i5;
                        i6 = i;
                    }
                    break;
                case -573762636:
                case -172159745:
                    layoutInflaterFrom = layoutInflaterFrom;
                    strM9869 = ViewTreeObserverOnPreDrawListenerC3327.m9869(sArr2, i14, 3, i13);
                    if (C0671.f2816 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۤܶ") ^ i8;
                        i2 = ((iM45029 ^ i7) * (-14979)) ^ 2006290565;
                        i3 = 288840797;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۙ") ^ i7;
                        i2 = ((iM45029 ^ i8) * 28419) ^ 1181007923;
                        i3 = -896308769;
                    }
                    LayoutInflater layoutInflater9 = layoutInflaterFrom;
                    i10 = iM45029 ^ i3;
                    i9 = i2;
                    layoutInflaterFrom = layoutInflater9;
                    break;
                case -72456299:
                case 1462654896:
                    i13 = 12030;
                    iM450210 = ThreadFactoryC3888.m11306("ܿۢ") ^ i7;
                    i9 = ((iM450210 ^ i8) * (-22621)) ^ 1711163418;
                    i4 = 2102793073;
                    i5 = iM450210 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    activityC23296 = activityC23296;
                    i10 = i5;
                    i6 = i;
                    break;
                case 188443313:
                case 562947880:
                    activityC23296 = activityC23296;
                    layoutInflaterFrom = layoutInflaterFrom;
                    i11 = s * 30500;
                    i12 = s * s;
                    if (C10634.m26820()) {
                        iM450210 = (i7 - C19806.m45029("֡ۙ")) * (-5);
                        i9 = ((iM450210 ^ i8) * (-15315)) ^ 380080905;
                        i4 = -1636760018;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("᩺ۙ") ^ i8;
                        i9 = ((iM450210 ^ i7) * (-10023)) ^ (-87803676);
                        i4 = -1286283064;
                    }
                    i5 = iM450210 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    activityC23296 = activityC23296;
                    i10 = i5;
                    i6 = i;
                    break;
                case 373194461:
                case 1256181985:
                    activityC23296 = activityC23296;
                    layoutInflaterFrom = layoutInflaterFrom;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM450210 = (i7 - ThreadFactoryC3888.m11306("۫ۧ")) * 99;
                        i9 = ((iM450210 ^ i8) * 8361) ^ (-1719128168);
                        i4 = -1500925634;
                    } else {
                        iM450210 = C19806.m45029("ۢ᩷") ^ i8;
                        i9 = ((iM450210 ^ i7) * (-27195)) ^ 42402545;
                        i4 = -1296330864;
                    }
                    i5 = iM450210 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    activityC23296 = activityC23296;
                    i10 = i5;
                    i6 = i;
                    break;
                case 1269273072:
                case 1350244979:
                    activityC23296 = activityC23296;
                    layoutInflaterFrom = layoutInflaterFrom;
                    sArr = f15339;
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM450210 = C19806.m45029("۠۟") ^ i8;
                        i9 = ((iM450210 ^ i7) * 12861) ^ 1295650366;
                        i4 = -2077587086;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("ᩳ۬") ^ i8) * 97;
                        i9 = ((iM450210 ^ i7) * 21633) ^ 1745534360;
                        i4 = 1976279015;
                    }
                    i5 = iM450210 ^ i4;
                    layoutInflaterFrom = layoutInflaterFrom;
                    activityC23296 = activityC23296;
                    i10 = i5;
                    i6 = i;
                    break;
                default:
                    if (C0629.f2722 <= 0) {
                        layoutInflaterFrom = layoutInflaterFrom;
                        iM450210 = C19806.m45029("۠۟") ^ i8;
                        i9 = ((iM450210 ^ i7) * 12861) ^ 1295650366;
                        i4 = -2077587086;
                        i5 = iM450210 ^ i4;
                        layoutInflaterFrom = layoutInflaterFrom;
                        activityC23296 = activityC23296;
                        i10 = i5;
                        i6 = i;
                    } else {
                        layoutInflaterFrom = layoutInflaterFrom;
                        iM45029 = ThreadFactoryC3888.m11306("ۤܶ") ^ i8;
                        i2 = ((iM45029 ^ i7) * (-14979)) ^ 2006290565;
                        i3 = 288840797;
                        LayoutInflater layoutInflater10 = layoutInflaterFrom;
                        i10 = iM45029 ^ i3;
                        i9 = i2;
                        layoutInflaterFrom = layoutInflater10;
                    }
                    break;
            }
        }
    }

    public C4244(ActivityC23296 activityC23296) {
        this.f15340 = activityC23296;
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        ActivityC23296 activityC23296 = null;
        String[][] strArr = null;
        int length = 0;
        String[][] strArr2 = null;
        int length2 = 0;
        int i = 1337082725;
        int i2 = C1025.f4800;
        int i3 = C3660.f13403;
        int iM45029 = C19806.m45029("᩺ۖ") ^ i3;
        int i4 = ((iM45029 ^ i2) * 4899) ^ 872572845;
        int i5 = 209601016;
        while (true) {
            i = ((((i ^ i2) * (-2109)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1923902421:
                case 383459511:
                    C2477.m7593();
                    iM45029 = C19806.m45029("ۘۘ") ^ i3;
                    i4 = ((iM45029 ^ i2) * (-18843)) ^ 1682585280;
                    i5 = -544010571;
                    break;
                case -1680647385:
                case 1900970170:
                    activityC23296 = this.f15340;
                    if (C1875.f7103 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-5627)) ^ 1976244195;
                        i5 = -966157497;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩺ۚ")) * 15;
                        i4 = ((iM45029 ^ i2) * 27645) ^ (-178213321);
                        i5 = -603930686;
                    }
                    break;
                case -1583129002:
                case 1071390035:
                    length = strArr.length;
                    strArr2 = activityC23296.f75545;
                    if (C3577.f13150 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ۬") + i3) * 37;
                        i4 = ((iM45029 ^ i2) * (-23371)) ^ 1721908971;
                        i5 = -533190627;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩺ܿ")) * 85;
                        i4 = ((iM45029 ^ i2) * (-24925)) ^ (-862613435);
                        i5 = 1345896767;
                    }
                    break;
                case -1468120538:
                case -719704433:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-15503)) ^ 587904511;
                        i5 = -1705812640;
                    } else {
                        iM45029 = C19806.m45029("ۘۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-6069)) ^ (-1607549585);
                        i5 = -684016906;
                    }
                    break;
                case -1392539982:
                case 1410492319:
                    if (RunnableC0195.m1431()) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-21927)) ^ 1138742112;
                        i5 = 95108413;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-5627)) ^ 1976244195;
                        i5 = -966157497;
                    }
                    break;
                case -1260466873:
                case 193387689:
                    length2 = strArr2.length + length;
                    if (C0797.f3386) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ۬") + i3) * 37;
                        i4 = ((iM45029 ^ i2) * (-23371)) ^ 1721908971;
                        i5 = -533190627;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ۜ") ^ i2) * (-59);
                        i4 = ((iM45029 ^ i3) * 3601) ^ 990001924;
                        i5 = -1023902779;
                    }
                    break;
                case -520377534:
                case 607279186:
                    return length2 + 1;
                case -398251641:
                case 1561538885:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-15503)) ^ 587904511;
                        i5 = -1705812640;
                    } else {
                        iM45029 = (C19806.m45029("ܰܺ") + i3) * 37;
                        i4 = ((iM45029 ^ i2) * 32301) ^ 1120657147;
                        i5 = -1201772098;
                    }
                    break;
                case -121758330:
                case 174485829:
                    if (C1148.f5161 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-15503)) ^ 587904511;
                        i5 = -1705812640;
                    } else {
                        iM45029 = (C19806.m45029("᩸᩷") ^ i3) * (-33);
                        i4 = ((iM45029 ^ i2) * (-26619)) ^ (-1009337099);
                        i5 = 800565633;
                    }
                    break;
                case 126588103:
                case 1258553294:
                    strArr = activityC23296.f75546;
                    if (RunnableC1564.m5345()) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-5627)) ^ 1976244195;
                        i5 = -966157497;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿ᩻") + i3) * 21;
                        i4 = ((iM45029 ^ i2) * (-15555)) ^ (-1343712015);
                        i5 = -788656739;
                    }
                    break;
                case 391534540:
                case 1256297338:
                    if (C3577.f13150 < 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ᩳᩳ")) * (-121);
                        i4 = ((iM45029 ^ i2) * 2117) ^ 330792442;
                        i5 = 624626084;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-5627)) ^ 1976244195;
                        i5 = -966157497;
                    }
                    break;
                case 791967195:
                case 906507192:
                    if (C1460.m5050() != 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ᩳᩳ")) * (-121);
                        i4 = ((iM45029 ^ i2) * 2117) ^ 330792442;
                        i5 = 624626084;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۬ᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-12191)) ^ (-383081368);
                        i5 = 672077902;
                    }
                    break;
                case 940673033:
                case 1970887441:
                    if (C1398.f5802 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-5627)) ^ 1976244195;
                        i5 = -966157497;
                    } else {
                        iM45029 = C19806.m45029("ۘۘ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-18843)) ^ 1682585280;
                        i5 = -544010571;
                    }
                    break;
                case 964396810:
                case 1212019958:
                    C1937.m6279();
                    C1419.m4973();
                    return 0;
                case 1057213263:
                case 2036806210:
                    if (C3535.m10431() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-5627)) ^ 1976244195;
                        i5 = -966157497;
                    } else {
                        iM45029 = C19806.m45029("۟ۖ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-29987)) ^ 202192108;
                        i5 = -424076128;
                    }
                    break;
                default:
                    C3535.m10431();
                    if (!C0817.f3443) {
                        iM45029 = C19806.m45029("ۘۘ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-18843)) ^ 1682585280;
                        i5 = -544010571;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-15503)) ^ 587904511;
                        i5 = -1705812640;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        int iM11306;
        int i2;
        int i3;
        String str;
        short s;
        int iM45029;
        int i4;
        int i5;
        String str2;
        int i6;
        int iM450210;
        int i7;
        int i8;
        String str3;
        int i9;
        int iM11307;
        int i10;
        int i11;
        String str4;
        int i12 = i;
        int i13 = C3722.f13525;
        int i14 = C1025.f4800;
        int iM450211 = (C19806.m45029("֫᩻") + i14) * (-67);
        int i15 = ((iM450211 ^ i13) * (-8979)) ^ (-131320047);
        ActivityC23296 activityC23296 = null;
        TextView textView = null;
        ImageView imageView = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i16 = iM450211 ^ (-1568635013);
        ViewOnClickListenerC7067 viewOnClickListenerC7067 = null;
        char c = 0;
        char c2 = 0;
        int i17 = 0;
        int i18 = 0;
        short s2 = 0;
        int i19 = 0;
        int i20 = -1444923318;
        int i21 = 0;
        String str5 = null;
        short[] sArr3 = null;
        int i22 = 0;
        ImageView imageView2 = null;
        String[][] strArr = null;
        String[][] strArr2 = null;
        TextView textView2 = null;
        int length = 0;
        while (true) {
            i20 = i16 ^ (i15 & (((i20 ^ i13) * 23365) >> 31));
            switch (i20) {
                case -2145252458:
                case 1091849973:
                    imageView2 = viewOnClickListenerC7067.f23726;
                    sArr2 = f15339;
                    i22 = 4;
                    if (!C1977.m6356()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۛ") ^ i14;
                        i2 = ((iM11306 ^ i13) * 13151) ^ (-498985619);
                        i3 = 238473295;
                        i16 = iM11306 ^ i3;
                        i15 = i2;
                    } else {
                        str5 = str5;
                        c = c;
                        textView = textView;
                        viewOnClickListenerC7067 = viewOnClickListenerC7067;
                        int iM450212 = C19806.m45029("᩶ۢ") ^ i13;
                        i15 = ((iM450212 ^ i14) * (-25661)) ^ (-561669);
                        i5 = iM450212 ^ (-1239160185);
                        viewOnClickListenerC7067 = viewOnClickListenerC7067;
                        textView = textView;
                        c = c;
                        str5 = str5;
                        i16 = i5;
                        i12 = i;
                    }
                    break;
                case -2095863805:
                case -1941802553:
                    TextView textView3 = textView;
                    String str6 = str5;
                    int i23 = i21;
                    viewOnClickListenerC7067 = (ViewOnClickListenerC7067) abstractC12554;
                    activityC23296 = this.f15340;
                    if (i12 < activityC23296.f75546.length) {
                        int iM11308 = (i14 - ThreadFactoryC3888.m11306("ۜᩳ")) * (-99);
                        i15 = ((iM11308 ^ i13) * (-9903)) ^ 1115757002;
                        textView = textView3;
                        i21 = i23;
                        str5 = str6;
                        c = 1;
                        i12 = i;
                        i16 = iM11308 ^ (-1729247942);
                        c2 = 0;
                    } else {
                        int iM450213 = (C19806.m45029("ۜ۬") + i14) * (-127);
                        int i24 = ((iM450213 ^ i13) * 7387) ^ (-827794242);
                        i5 = iM450213 ^ (-1409378694);
                        textView = textView3;
                        i15 = i24;
                        i21 = i23;
                        str5 = str6;
                        c = 1;
                        c2 = 0;
                        i16 = i5;
                        i12 = i;
                    }
                    break;
                case -2094578663:
                case -2088435907:
                    i17 = 11694;
                    int iM11309 = ThreadFactoryC3888.m11306("ܳۜ") ^ i13;
                    int i25 = ((iM11309 ^ i14) * 20907) ^ (-1286964112);
                    i5 = iM11309 ^ (-1502774832);
                    i15 = i25;
                    i21 = i21;
                    viewOnClickListenerC7067 = viewOnClickListenerC7067;
                    textView = textView;
                    c = c;
                    str5 = str5;
                    i16 = i5;
                    i12 = i;
                    break;
                case -2072608662:
                case 587510002:
                    MenuItemOnMenuItemClickListenerC3244.m9704(viewOnClickListenerC7067.f23728, activityC23296.f75545[length][c]);
                    strArr = activityC23296.f75545;
                    if (C1025.m3861() > 0) {
                        iM11306 = C19806.m45029("᩷ۤ") ^ i14;
                        i2 = ((iM11306 ^ i13) * (-17459)) ^ (-2096641715);
                        i3 = -989983330;
                        i16 = iM11306 ^ i3;
                        i15 = i2;
                    } else {
                        str = str5;
                        i21 = i21;
                        c = c;
                        textView = textView;
                        viewOnClickListenerC7067 = viewOnClickListenerC7067;
                        s = s2;
                        int iM113010 = ThreadFactoryC3888.m11306("᩵᩵") ^ i14;
                        String str7 = str;
                        i15 = ((iM113010 ^ i13) * 25409) ^ 1763563274;
                        i16 = iM113010 ^ 1043865333;
                        i12 = i;
                        i21 = i21;
                        str4 = str7;
                        s2 = s;
                        viewOnClickListenerC7067 = viewOnClickListenerC7067;
                        textView = textView;
                        c = c;
                        str5 = str4;
                    }
                    break;
                case -1822497167:
                case 832249313:
                    if (!C1977.m6356()) {
                        str3 = str5;
                        i9 = i21;
                        c = c;
                        iM11307 = ThreadFactoryC3888.m11306("ۧۗ") ^ i13;
                        i10 = ((iM11307 ^ i14) * 18929) ^ (-1418431016);
                        i11 = 1356137208;
                        int i26 = iM11307 ^ i11;
                        i21 = i9;
                        str4 = str3;
                        i16 = i26;
                        i15 = i10;
                        c = c;
                        str5 = str4;
                    } else {
                        iM11306 = (i13 - ThreadFactoryC3888.m11306("۟֨")) * 77;
                        i2 = ((iM11306 ^ i14) * 30991) ^ 772881487;
                        i3 = -1745884374;
                        i16 = iM11306 ^ i3;
                        i15 = i2;
                    }
                    break;
                case -1647605766:
                case 1620571194:
                    str5 = str5;
                    i21 = i21;
                    c = c;
                    textView = textView;
                    viewOnClickListenerC7067 = viewOnClickListenerC7067;
                    int i27 = i18 + 60155536;
                    s = s2;
                    int i28 = s + 7756;
                    if ((i28 * i28) - (i27 + i27) <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۘ") ^ i14;
                        i15 = ((iM45029 ^ i13) * 19195) ^ 987101589;
                        i4 = 399929313;
                    } else {
                        iM45029 = C19806.m45029("ܶ۟") ^ i13;
                        i15 = ((iM45029 ^ i14) * (-26851)) ^ (-491464664);
                        i4 = -1493553522;
                    }
                    i5 = iM45029 ^ i4;
                    s2 = s;
                    i21 = i21;
                    viewOnClickListenerC7067 = viewOnClickListenerC7067;
                    textView = textView;
                    c = c;
                    str5 = str5;
                    i16 = i5;
                    i12 = i;
                    break;
                case -1461245198:
                case 1006211646:
                    length = i12 - activityC23296.f75546.length;
                    textView2 = viewOnClickListenerC7067.f23724;
                    strArr2 = activityC23296.f75545;
                    if (C3722.f13525 > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ܳ") ^ i13) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i2 = ((iM11306 ^ i14) * 31063) ^ (-1625254299);
                        i3 = -216509016;
                        i16 = iM11306 ^ i3;
                        i15 = i2;
                    } else {
                        str = str5;
                        i21 = i21;
                        c = c;
                        textView = textView;
                        viewOnClickListenerC7067 = viewOnClickListenerC7067;
                        s = s2;
                        int iM113011 = ThreadFactoryC3888.m11306("᩵᩵") ^ i14;
                        String str8 = str;
                        i15 = ((iM113011 ^ i13) * 25409) ^ 1763563274;
                        i16 = iM113011 ^ 1043865333;
                        i12 = i;
                        i21 = i21;
                        str4 = str8;
                        s2 = s;
                        viewOnClickListenerC7067 = viewOnClickListenerC7067;
                        textView = textView;
                        c = c;
                        str5 = str4;
                    }
                    break;
                case -1422384135:
                case 1457493699:
                    String str9 = str5;
                    viewOnClickListenerC7067.f23725 = str9;
                    imageView = viewOnClickListenerC7067.f23726;
                    sArr = f15339;
                    i19 = 1;
                    i21 = 3;
                    if (C2249.m6915() <= 0) {
                        str5 = str9;
                        c = c;
                        textView = textView;
                        viewOnClickListenerC7067 = viewOnClickListenerC7067;
                        int iM450214 = C19806.m45029("᩶ۢ") ^ i13;
                        i15 = ((iM450214 ^ i14) * (-25661)) ^ (-561669);
                        i5 = iM450214 ^ (-1239160185);
                        viewOnClickListenerC7067 = viewOnClickListenerC7067;
                        textView = textView;
                        c = c;
                        str5 = str5;
                        i16 = i5;
                        i12 = i;
                    } else {
                        int iM113012 = ThreadFactoryC3888.m11306("ۚᩳ") ^ i13;
                        str5 = str9;
                        i15 = ((iM113012 ^ i14) * (-24559)) ^ 2081556722;
                        i16 = iM113012 ^ (-821290336);
                    }
                    break;
                case -1294593580:
                case -419582282:
                    C1461.m5083(textView2, strArr2[length][c2]);
                    if (AbstractC0464.f2088 > 0) {
                        iM11306 = C19806.m45029("ۛ۠") ^ i14;
                        i2 = ((iM11306 ^ i13) * (-8349)) ^ (-75353144);
                        i3 = -206201000;
                        i16 = iM11306 ^ i3;
                        i15 = i2;
                    } else {
                        str3 = str5;
                        i9 = i21;
                        c = c;
                        iM11307 = ThreadFactoryC3888.m11306("ۧۗ") ^ i13;
                        i10 = ((iM11307 ^ i14) * 18929) ^ (-1418431016);
                        i11 = 1356137208;
                        int i29 = iM11307 ^ i11;
                        i21 = i9;
                        str4 = str3;
                        i16 = i29;
                        i15 = i10;
                        c = c;
                        str5 = str4;
                    }
                    break;
                case -1233323177:
                case 979513531:
                    i21 = i21;
                    String str10 = activityC23296.f75546[i12][c];
                    c = c;
                    textView = textView;
                    C1461.m5083(textView, str10);
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        int iM113013 = ThreadFactoryC3888.m11306("ۤ᩸") ^ i14;
                        i15 = ((iM113013 ^ i13) * 19223) ^ 879318317;
                        i21 = i21;
                        i16 = iM113013 ^ (-2039573992);
                        textView = textView;
                        c = c;
                        str5 = null;
                    } else {
                        viewOnClickListenerC7067 = viewOnClickListenerC7067;
                        s = s2;
                        str = null;
                        int iM113014 = ThreadFactoryC3888.m11306("᩵᩵") ^ i14;
                        String str11 = str;
                        i15 = ((iM113014 ^ i13) * 25409) ^ 1763563274;
                        i16 = iM113014 ^ 1043865333;
                        i12 = i;
                        i21 = i21;
                        str4 = str11;
                        s2 = s;
                        viewOnClickListenerC7067 = viewOnClickListenerC7067;
                        textView = textView;
                        c = c;
                        str5 = str4;
                    }
                    break;
                case -1080883234:
                case -145093676:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    iM11306 = (i13 - ThreadFactoryC3888.m11306("۟֨")) * 77;
                    i2 = ((iM11306 ^ i14) * 30991) ^ 772881487;
                    i3 = -1745884374;
                    i16 = iM11306 ^ i3;
                    i15 = i2;
                    break;
                case -1043094347:
                case 1800470877:
                    break;
                case -1011317704:
                case 1846386316:
                    str5 = str5;
                    i21 = i21;
                    c = c;
                    textView = textView;
                    viewOnClickListenerC7067 = viewOnClickListenerC7067;
                    s = s2;
                    sArr3 = f15339;
                    if (!C3286.f12186) {
                        iM45029 = (i14 - C19806.m45029("᩸ۗ")) * (-115);
                        i15 = ((iM45029 ^ i13) * (-1045)) ^ 741215811;
                        i4 = 1155984717;
                        i5 = iM45029 ^ i4;
                        s2 = s;
                        i21 = i21;
                        viewOnClickListenerC7067 = viewOnClickListenerC7067;
                        textView = textView;
                        c = c;
                        str5 = str5;
                        i16 = i5;
                        i12 = i;
                    } else {
                        str = str5;
                        int iM113015 = ThreadFactoryC3888.m11306("᩵᩵") ^ i14;
                        String str12 = str;
                        i15 = ((iM113015 ^ i13) * 25409) ^ 1763563274;
                        i16 = iM113015 ^ 1043865333;
                        i12 = i;
                        i21 = i21;
                        str4 = str12;
                        s2 = s;
                        viewOnClickListenerC7067 = viewOnClickListenerC7067;
                        textView = textView;
                        c = c;
                        str5 = str4;
                    }
                    break;
                case -949534704:
                case 582719916:
                    i17 = 62625;
                    int iM113016 = ThreadFactoryC3888.m11306("ܳۜ") ^ i13;
                    int i210 = ((iM113016 ^ i14) * 20907) ^ (-1286964112);
                    i5 = iM113016 ^ (-1502774832);
                    i15 = i210;
                    i21 = i21;
                    viewOnClickListenerC7067 = viewOnClickListenerC7067;
                    textView = textView;
                    c = c;
                    str5 = str5;
                    i16 = i5;
                    i12 = i;
                    break;
                case -782570345:
                case -569313930:
                    C3660.m10791();
                    C1460.m5050();
                    break;
                case -748221214:
                case 1496581514:
                    str3 = str5;
                    i9 = i21;
                    c = c;
                    MenuItemOnMenuItemClickListenerC3244.m9704(viewOnClickListenerC7067.f23724, activityC23296.f75546[i12][c2]);
                    textView = viewOnClickListenerC7067.f23728;
                    if (C10634.m26820()) {
                        iM11307 = ThreadFactoryC3888.m11306("ۧۗ") ^ i13;
                        i10 = ((iM11307 ^ i14) * 18929) ^ (-1418431016);
                        i11 = 1356137208;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ۧᩴ") ^ i13;
                        i10 = ((iM11307 ^ i14) * 249) ^ (-1701329836);
                        i11 = 521991948;
                    }
                    int i211 = iM11307 ^ i11;
                    i21 = i9;
                    str4 = str3;
                    i16 = i211;
                    i15 = i10;
                    c = c;
                    str5 = str4;
                    break;
                case -592169307:
                case 27088732:
                    str2 = str5;
                    i6 = i21;
                    c = c;
                    textView = textView;
                    viewOnClickListenerC7067 = viewOnClickListenerC7067;
                    if (i12 - activityC23296.f75546.length < activityC23296.f75545.length) {
                        iM450210 = (i13 - C19806.m45029("᩻۬")) * (-31);
                        i7 = ((iM450210 ^ i14) * (-30607)) ^ 230184458;
                        i8 = -553889765;
                    } else {
                        iM450210 = (C19806.m45029("ۙᩳ") + i14) * 87;
                        i7 = ((iM450210 ^ i13) * 1691) ^ (-877717345);
                        i8 = 756610874;
                    }
                    int i30 = iM450210 ^ i8;
                    i21 = i6;
                    str4 = str2;
                    i16 = i30;
                    i15 = i7;
                    viewOnClickListenerC7067 = viewOnClickListenerC7067;
                    textView = textView;
                    c = c;
                    str5 = str4;
                    break;
                case -561512511:
                case 1165437312:
                    imageView2.setImageResource(C19806.m45029(C3286.m9788(sArr2, i22, 3, i17)) ^ 2125809639);
                    str2 = str5;
                    i6 = i21;
                    c = c;
                    textView = textView;
                    viewOnClickListenerC7067 = viewOnClickListenerC7067;
                    iM450210 = (C19806.m45029("ۙᩳ") + i14) * 87;
                    i7 = ((iM450210 ^ i13) * 1691) ^ (-877717345);
                    i8 = 756610874;
                    int i31 = iM450210 ^ i8;
                    i21 = i6;
                    str4 = str2;
                    i16 = i31;
                    i15 = i7;
                    viewOnClickListenerC7067 = viewOnClickListenerC7067;
                    textView = textView;
                    c = c;
                    str5 = str4;
                    break;
                case -361577565:
                case 938820061:
                    imageView.setImageResource(ThreadFactoryC3888.m11306(RunnableC0195.m1429(sArr, i19, i21, i17)) ^ 2099211062);
                    break;
                case -327600144:
                case 90464253:
                    str5 = str5;
                    i21 = i21;
                    c = c;
                    textView = textView;
                    viewOnClickListenerC7067 = viewOnClickListenerC7067;
                    s2 = sArr3[0];
                    i18 = s2 * s2;
                    if (!C3743.f13569) {
                        i21 = i21;
                        int iM450215 = C19806.m45029("᩶ۢ") ^ i13;
                        i15 = ((iM450215 ^ i14) * (-25661)) ^ (-561669);
                        i5 = iM450215 ^ (-1239160185);
                        viewOnClickListenerC7067 = viewOnClickListenerC7067;
                        textView = textView;
                        c = c;
                        str5 = str5;
                        i16 = i5;
                        i12 = i;
                    } else {
                        int iM450216 = (i13 - C19806.m45029("֨֡")) * (-83);
                        i15 = ((iM450216 ^ i14) * 4393) ^ (-1678418478);
                        i5 = iM450216 ^ (-1193712329);
                        i21 = i21;
                        viewOnClickListenerC7067 = viewOnClickListenerC7067;
                        textView = textView;
                        c = c;
                        str5 = str5;
                        i16 = i5;
                        i12 = i;
                    }
                    break;
                case -292903782:
                case 69962341:
                    if (C1977.f7413 <= 0) {
                        str5 = str5;
                        c = c;
                        textView = textView;
                        viewOnClickListenerC7067 = viewOnClickListenerC7067;
                        int iM450217 = C19806.m45029("᩶ۢ") ^ i13;
                        i15 = ((iM450217 ^ i14) * (-25661)) ^ (-561669);
                        i5 = iM450217 ^ (-1239160185);
                        viewOnClickListenerC7067 = viewOnClickListenerC7067;
                        textView = textView;
                        c = c;
                        str5 = str5;
                        i16 = i5;
                        i12 = i;
                    } else {
                        str3 = str5;
                        i9 = i21;
                        c = c;
                        iM11307 = ThreadFactoryC3888.m11306("ۧۗ") ^ i13;
                        i10 = ((iM11307 ^ i14) * 18929) ^ (-1418431016);
                        i11 = 1356137208;
                        int i212 = iM11307 ^ i11;
                        i21 = i9;
                        str4 = str3;
                        i16 = i212;
                        i15 = i10;
                        c = c;
                        str5 = str4;
                    }
                    break;
                case 24653097:
                case 340574748:
                    viewOnClickListenerC7067.f23725 = strArr[length][2];
                    if (C1419.f5860 < 0) {
                        iM11306 = C19806.m45029("ܿ֫") ^ i13;
                        i2 = ((iM11306 ^ i14) * (-12243)) ^ (-1621187130);
                        i3 = -1520641536;
                        i16 = iM11306 ^ i3;
                        i15 = i2;
                    } else {
                        str3 = str5;
                        i9 = i21;
                        c = c;
                        iM11307 = ThreadFactoryC3888.m11306("ۧۗ") ^ i13;
                        i10 = ((iM11307 ^ i14) * 18929) ^ (-1418431016);
                        i11 = 1356137208;
                        int i213 = iM11307 ^ i11;
                        i21 = i9;
                        str4 = str3;
                        i16 = i213;
                        i15 = i10;
                        c = c;
                        str5 = str4;
                    }
                    break;
                default:
                    if (C0671.f2816 == 0) {
                        iM11306 = (i13 - ThreadFactoryC3888.m11306("۟֨")) * 77;
                        i2 = ((iM11306 ^ i14) * 30991) ^ 772881487;
                        i3 = -1745884374;
                    } else {
                        iM11306 = (i14 - ThreadFactoryC3888.m11306("ܶ᩺")) * 89;
                        i2 = ((iM11306 ^ i13) * 2373) ^ 78220199;
                        i3 = 840185677;
                    }
                    i16 = iM11306 ^ i3;
                    i15 = i2;
                    break;
            }
            return;
        }
    }
}
