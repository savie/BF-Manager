package l;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.ImageView;
import android.widget.TextView;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۗܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X2T2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3268 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۗۨ۠, reason: not valid java name and contains not printable characters */
    private static final short[] f12128 = {3940, -20188, 22436, -19788, -13379, -13379, -13379, -16706, -24996, 19771, 23079, 23735, 22448, 3440, 5981, -2928, 162, -5629, -1524, -3136};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11674 f12129;

    @Override // l.AbstractC0414
    public final int getItemViewType(int i) {
        int itemCount = 0;
        int i2 = 0;
        int i3 = -1929063960;
        int i4 = C2477.f9839;
        int i5 = C1025.f4800;
        int iM45029 = (C19806.m45029("ۡܰ") + i4) * (-89);
        int i6 = ((iM45029 ^ i5) * (-10385)) ^ (-1549875483);
        int i7 = 1997606402;
        while (true) {
            i3 = ((((i3 ^ i5) * (-4705)) >> 31) & i6) ^ (iM45029 ^ i7);
            switch (i3) {
                case -2103996747:
                case 781958733:
                    if (C0671.f2816 != 0) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("᩸ܶ")) * 73;
                        i6 = ((iM45029 ^ i4) * 6147) ^ 1539180372;
                        i7 = 1229002629;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤ᩶") ^ i5) * (-67);
                        i6 = ((iM45029 ^ i4) * (-17815)) ^ 1791260580;
                        i7 = -1473266847;
                    }
                    break;
                case -2102498436:
                case 2141547170:
                    C1977.m6356();
                    C0526.m2437();
                    return 0;
                case -2027689244:
                case -1255095356:
                    return i2;
                case -1984496983:
                case 1599216400:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = C19806.m45029("۫ۛ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 31907) ^ (-1248595667);
                        i7 = 1377780451;
                    } else {
                        iM45029 = C19806.m45029("ܶۘ") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-1403)) ^ 2028602570;
                        i7 = 890483450;
                    }
                    break;
                case -1667356046:
                case 648637473:
                    return 0;
                case -1607955536:
                case -1288865799:
                    C0278.m1789();
                    if (CallableC1627.m5507() != 0) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("᩸ܶ")) * 73;
                        i6 = ((iM45029 ^ i4) * 6147) ^ 1539180372;
                        i7 = 1229002629;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡۨ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 31251) ^ 681015446;
                        i7 = 162140402;
                    }
                    break;
                case -1367411489:
                case 2040252987:
                    C0817.m3399();
                    C3535.m10431();
                    iM45029 = C19806.m45029("۫ۛ") ^ i5;
                    i6 = ((iM45029 ^ i4) * 31907) ^ (-1248595667);
                    i7 = 1377780451;
                    break;
                case -1266364455:
                case 976599415:
                    if (C0216.f1393 != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۧ") + i4) * (-69);
                        i6 = ((iM45029 ^ i5) * 12057) ^ (-926561788);
                        i7 = -1404077638;
                    } else {
                        iM45029 = C19806.m45029("᩻᩵") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-2453)) ^ (-610550309);
                        i7 = -1559735054;
                    }
                    break;
                case -1126849363:
                case -929836452:
                    if (C7105.f23796 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۧ") + i4) * (-69);
                        i6 = ((iM45029 ^ i5) * 12057) ^ (-926561788);
                        i7 = -1404077638;
                    } else {
                        iM45029 = C19806.m45029("۫ۛ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 31907) ^ (-1248595667);
                        i7 = 1377780451;
                    }
                    break;
                case -914095800:
                case 1268348275:
                    itemCount = getItemCount();
                    if (C10634.f36300 >= 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ᩴ۫")) * 41;
                        i6 = ((iM45029 ^ i5) * 20159) ^ 1260137865;
                        i7 = 1148771702;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۘ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 29283) ^ (-722218806);
                        i7 = -1787307323;
                    }
                    break;
                case -836180230:
                case 1328789105:
                    if (C1377.m4833() != 0) {
                        iM45029 = C19806.m45029("۫ۛ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 31907) ^ (-1248595667);
                        i7 = 1377780451;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰܿ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-10159)) ^ (-1696667650);
                        i7 = 441326073;
                    }
                    break;
                case -827709164:
                case 856471508:
                    if (C2124.f7782 <= 0) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("᩸ܶ")) * 73;
                        i6 = ((iM45029 ^ i4) * 6147) ^ 1539180372;
                        i7 = 1229002629;
                    } else {
                        iM45029 = (C19806.m45029("۟ܰ") ^ i5) * 99;
                        i6 = ((iM45029 ^ i4) * (-8501)) ^ (-1773099881);
                        i7 = 2057977024;
                    }
                    break;
                case -463636201:
                case 1189646216:
                    if (RunnableC1564.f6300) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ᩴ۫")) * 41;
                        i6 = ((iM45029 ^ i5) * 20159) ^ 1260137865;
                        i7 = 1148771702;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ۢ") ^ i4) * 61;
                        i6 = ((iM45029 ^ i5) * (-8185)) ^ (-1190507275);
                        i7 = 960539697;
                    }
                    break;
                case -448370308:
                case 14391060:
                    i2 = 1;
                    if (i == itemCount - 1) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ֫") ^ i5;
                        i6 = ((iM45029 ^ i4) * 11399) ^ (-1727343924);
                        i7 = 1469237182;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֫ᩳ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 30791) ^ 669287468;
                        i7 = 1452843239;
                    }
                    break;
                case -442326953:
                case -10989486:
                    if (C3722.f13525 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۧ") + i4) * (-69);
                        i6 = ((iM45029 ^ i5) * 12057) ^ (-926561788);
                        i7 = -1404077638;
                    } else {
                        iM45029 = (C19806.m45029("ܽ᩻") + i4) * (-57);
                        i6 = ((iM45029 ^ i5) * (-26471)) ^ 365362595;
                        i7 = -898125696;
                    }
                    break;
                case 729952065:
                case 1839551519:
                    C2124.m6673();
                    if (C1148.f5161 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡۨ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 31251) ^ 681015446;
                        i7 = 162140402;
                    } else {
                        iM45029 = C19806.m45029("۫ۛ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 31907) ^ (-1248595667);
                        i7 = 1377780451;
                    }
                    break;
                case 905849960:
                case 1786771736:
                    if (C3660.f13403 >= 0) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("᩸ܶ")) * 73;
                        i6 = ((iM45029 ^ i4) * 6147) ^ 1539180372;
                        i7 = 1229002629;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ۤۙ")) * (-15);
                        i6 = ((iM45029 ^ i5) * (-18621)) ^ (-1930206372);
                        i7 = 1461205918;
                    }
                    break;
                default:
                    if (RunnableC1895.f7152) {
                        iM45029 = ThreadFactoryC3888.m11306("֡ܰ") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-14519)) ^ (-1777319967);
                        i7 = 887896183;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۧ") + i4) * (-69);
                        i6 = ((iM45029 ^ i5) * 12057) ^ (-926561788);
                        i7 = -1404077638;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0243 A[PHI: r0 r5 r6 r14 r29
      0x0243: PHI (r0v79 short[]) = (r0v2 short[]), (r0v77 short[]), (r0v2 short[]) binds: [B:21:0x00c0, B:50:0x0241, B:32:0x0153] A[DONT_GENERATE, DONT_INLINE]
      0x0243: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:21:0x00c0, B:50:0x0241, B:32:0x0153] A[DONT_GENERATE, DONT_INLINE]
      0x0243: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:21:0x00c0, B:50:0x0241, B:32:0x0153] A[DONT_GENERATE, DONT_INLINE]
      0x0243: PHI (r14v3 int) = (r14v2 int), (r14v2 int), (r14v4 int) binds: [B:21:0x00c0, B:50:0x0241, B:32:0x0153] A[DONT_GENERATE, DONT_INLINE]
      0x0243: PHI (r29v39 int) = (r29v17 int), (r29v36 int), (r29v40 int) binds: [B:21:0x00c0, B:50:0x0241, B:32:0x0153] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        int i2;
        int i3;
        int iM11306;
        int i4;
        int i5;
        int iM45029;
        int i6;
        int i7;
        TextView textView;
        String str;
        short[] sArr;
        int iM450210;
        int i8;
        int i9;
        int iM45983;
        int i10 = 244383252;
        int i11 = C0278.f1572;
        int i12 = C3577.f13150;
        int iM450211 = C19806.m45029("᩻ܳ") ^ i11;
        int i13 = ((iM450211 ^ i12) * 31439) ^ (-1307848706);
        int i14 = iM450211 ^ (-1273704182);
        ImageView imageView = null;
        TextView textView2 = null;
        String strM42743 = null;
        C11986 c11986M40033 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i15 = 0;
        int i16 = 0;
        int iM5086 = 0;
        int i17 = 0;
        int iM450212 = 0;
        int iM450213 = 0;
        int i18 = 0;
        short s = 0;
        short s2 = 0;
        C11674 c11674 = null;
        int i19 = 0;
        int i20 = 0;
        C18419 c18419 = null;
        String strM6241 = null;
        ViewOnClickListenerC4617 viewOnClickListenerC4617 = null;
        SpannableStringBuilder spannableStringBuilderM3865 = null;
        int i21 = 0;
        SpannableStringBuilder spannableStringBuilder = null;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i12) * (-9243)) >> 31));
            switch (i10) {
                case -1834483553:
                case 913989470:
                    i17 = i17;
                    iM450212 = C19806.m45029(C3535.m10423(f12128, 7, 3, i21));
                    if (C3743.f13569) {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ۡ") + i12) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i6 = ((iM45029 ^ i11) * (-14549)) ^ (-99094145);
                        i7 = 1879532295;
                    } else {
                        iM45029 = C19806.m45029("ܳۢ") ^ i12;
                        i6 = ((iM45029 ^ i11) * 27) ^ (-578922555);
                        i7 = 1596831472;
                    }
                    int i22 = iM45029 ^ i7;
                    i17 = i17;
                    i14 = i22;
                    i13 = i6;
                    break;
                case -1730651070:
                case -945644318:
                    i3 = i19;
                    i21 = 52125;
                    int iM11307 = (ThreadFactoryC3888.m11306("ᩳ۠") + i12) * 13;
                    c11674 = c11674;
                    i13 = ((iM11307 ^ i11) * (-29709)) ^ 501455763;
                    i5 = iM11307 ^ 723925616;
                    c11674 = c11674;
                    strM42743 = strM42743;
                    int i23 = i17;
                    i14 = i5;
                    sArr4 = sArr4;
                    textView2 = textView2;
                    i20 = i20;
                    i17 = i23;
                    ImageView imageView2 = imageView;
                    i19 = i3;
                    imageView = imageView2;
                    break;
                case -1601898232:
                case 211626288:
                    short[] sArr5 = sArr4;
                    int i24 = i17;
                    short[] sArr6 = sArr3;
                    int i25 = i19;
                    int i26 = i20;
                    int iM450214 = C19806.m45029(C2249.m6918(sArr6, i26, i25, i21)) ^ 2129139218;
                    sArr3 = sArr6;
                    ImageView imageView3 = imageView;
                    imageView3.setImageResource(iM450214);
                    TextView textView3 = viewOnClickListenerC4617.f16343;
                    strM42743 = c18419.m42743();
                    if (C1937.f7317 >= 0) {
                        int iM450215 = (C19806.m45029("ܳۘ") ^ i11) * (-21);
                        int i27 = ((iM450215 ^ i12) * 10975) ^ (-1867957716);
                        i20 = i26;
                        i17 = i24;
                        i14 = iM450215 ^ (-357740137);
                        imageView = imageView3;
                        i19 = i25;
                        i13 = i27;
                        sArr4 = sArr5;
                        textView2 = textView3;
                    } else {
                        imageView = imageView3;
                        int iM11308 = (ThreadFactoryC3888.m11306("۬ᩳ") ^ i12) * (-111);
                        i3 = i25;
                        i13 = ((iM11308 ^ i11) * 5491) ^ 560795828;
                        i20 = i26;
                        i17 = i24;
                        i14 = iM11308 ^ (-359003451);
                        sArr4 = sArr5;
                        textView2 = textView3;
                        ImageView imageView4 = imageView;
                        i19 = i3;
                        imageView = imageView4;
                    }
                    break;
                case -1557993127:
                case -1453171002:
                    i17 = i17;
                    textView = textView2;
                    str = strM42743;
                    sArr = sArr4;
                    imageView = viewOnClickListenerC4617.f16345;
                    sArr3 = f12128;
                    i20 = 1;
                    i19 = 3;
                    if (C1419.f5860 >= 0) {
                        iM450210 = (C19806.m45029("۫ۨ") ^ i12) * 83;
                        i8 = ((iM450210 ^ i11) * (-24891)) ^ (-1971484242);
                        i9 = -1697629496;
                    } else {
                        iM450210 = (C19806.m45029("ᩳۘ") ^ i11) * 53;
                        i8 = ((iM450210 ^ i12) * (-12499)) ^ 1245382941;
                        i9 = 361940922;
                    }
                    int i28 = iM450210 ^ i9;
                    strM42743 = str;
                    int i29 = i17;
                    i14 = i28;
                    sArr4 = sArr;
                    textView2 = textView;
                    i13 = i8;
                    i17 = i29;
                    break;
                case -1453265291:
                case 1070075679:
                    i17 = i17;
                    i20 = i20;
                    textView2 = textView2;
                    strM42743 = strM42743;
                    sArr4 = sArr4;
                    c11674 = c11674;
                    i2 = i21;
                    int i30 = i19;
                    imageView = imageView;
                    i3 = i30;
                    sArr2 = f12128;
                    if (C1066.m4023() <= 0) {
                        iM11306 = (i11 - ThreadFactoryC3888.m11306("᩹ۘ")) * 65;
                        i13 = ((iM11306 ^ i12) * 1235) ^ 345260666;
                        i4 = 1046817719;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۙ") ^ i11;
                        i13 = ((iM11306 ^ i12) * 3021) ^ 561548288;
                        i4 = 1479702609;
                    }
                    i5 = iM11306 ^ i4;
                    i21 = i2;
                    c11674 = c11674;
                    strM42743 = strM42743;
                    int i210 = i17;
                    i14 = i5;
                    sArr4 = sArr4;
                    textView2 = textView2;
                    i20 = i20;
                    i17 = i210;
                    ImageView imageView5 = imageView;
                    i19 = i3;
                    imageView = imageView5;
                    break;
                case -1434801342:
                case 1497658509:
                    C19806.m45024();
                    if (C2249.f8050 < 0) {
                        i17 = i17;
                        i20 = i20;
                        textView2 = textView2;
                        strM42743 = strM42743;
                        sArr4 = sArr4;
                        c11674 = c11674;
                        i2 = i21;
                        int i31 = i19;
                        imageView = imageView;
                        i3 = i31;
                        iM11306 = C19806.m45029("᩶ۙ") ^ i11;
                        i13 = ((iM11306 ^ i12) * 32489) ^ 1245402862;
                        i4 = -1237072471;
                        i5 = iM11306 ^ i4;
                        i21 = i2;
                        c11674 = c11674;
                        strM42743 = strM42743;
                        int i211 = i17;
                        i14 = i5;
                        sArr4 = sArr4;
                        textView2 = textView2;
                        i20 = i20;
                        i17 = i211;
                        ImageView imageView6 = imageView;
                        i19 = i3;
                        imageView = imageView6;
                    }
                    i17 = i17;
                    textView2 = textView2;
                    strM42743 = strM42743;
                    i2 = i21;
                    int i32 = i19;
                    imageView = imageView;
                    i3 = i32;
                    iM11306 = (i11 - ThreadFactoryC3888.m11306("᩹ۘ")) * 65;
                    i13 = ((iM11306 ^ i12) * 1235) ^ 345260666;
                    i4 = 1046817719;
                    i5 = iM11306 ^ i4;
                    i21 = i2;
                    c11674 = c11674;
                    strM42743 = strM42743;
                    int i212 = i17;
                    i14 = i5;
                    sArr4 = sArr4;
                    textView2 = textView2;
                    i20 = i20;
                    i17 = i212;
                    ImageView imageView7 = imageView;
                    i19 = i3;
                    imageView = imageView7;
                    break;
                case -1422393875:
                case 820763628:
                    C3535.m10431();
                    if (RunnableC1606.f6488 >= 0) {
                        i17 = i17;
                        iM45029 = C19806.m45029("ܳۢ") ^ i12;
                        i6 = ((iM45029 ^ i11) * 27) ^ (-578922555);
                        i7 = 1596831472;
                        int i213 = iM45029 ^ i7;
                        i17 = i17;
                        i14 = i213;
                        i13 = i6;
                    } else {
                        i17 = i17;
                        textView2 = textView2;
                        strM42743 = strM42743;
                        i2 = i21;
                        int i33 = i19;
                        imageView = imageView;
                        i3 = i33;
                        iM11306 = (i11 - ThreadFactoryC3888.m11306("᩹ۘ")) * 65;
                        i13 = ((iM11306 ^ i12) * 1235) ^ 345260666;
                        i4 = 1046817719;
                        i5 = iM11306 ^ i4;
                        i21 = i2;
                        c11674 = c11674;
                        strM42743 = strM42743;
                        int i214 = i17;
                        i14 = i5;
                        sArr4 = sArr4;
                        textView2 = textView2;
                        i20 = i20;
                        i17 = i214;
                        ImageView imageView8 = imageView;
                        i19 = i3;
                        imageView = imageView8;
                    }
                    break;
                case -1254637174:
                case 576796631:
                    i17 = i17;
                    C0797.m3349(spannableStringBuilder, strM6241);
                    iM5086 = C1461.m5086(spannableStringBuilder);
                    if (c11986M40033.m29823() < c18419.m42727()) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬ܽ") ^ i11) * 33;
                        i6 = ((iM45029 ^ i12) * 5525) ^ (-1934527074);
                        i7 = 567600184;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ۫") ^ i12;
                        i6 = ((iM45029 ^ i11) * (-23709)) ^ 402337236;
                        i7 = -1397242338;
                    }
                    int i215 = iM45029 ^ i7;
                    i17 = i17;
                    i14 = i215;
                    i13 = i6;
                    break;
                case -980957365:
                case 620508770:
                    C1025.m3865(spannableStringBuilder, C0671.m3017(2127603155 ^ iM450212));
                    iM45983 = C20368.f65970;
                    i17 = iM45983;
                    int iM450216 = (i12 - C19806.m45029("ܰ᩸")) * (-39);
                    i6 = ((iM450216 ^ i11) * (-30243)) ^ 1144652543;
                    i14 = iM450216 ^ (-1698822691);
                    i13 = i6;
                    break;
                case -975170900:
                case 1211229776:
                    C2249.m6915();
                    i17 = i17;
                    textView2 = textView2;
                    strM42743 = strM42743;
                    i2 = i21;
                    int i34 = i19;
                    imageView = imageView;
                    i3 = i34;
                    iM11306 = (i11 - ThreadFactoryC3888.m11306("᩹ۘ")) * 65;
                    i13 = ((iM11306 ^ i12) * 1235) ^ 345260666;
                    i4 = 1046817719;
                    i5 = iM11306 ^ i4;
                    i21 = i2;
                    c11674 = c11674;
                    strM42743 = strM42743;
                    int i216 = i17;
                    i14 = i5;
                    sArr4 = sArr4;
                    textView2 = textView2;
                    i20 = i20;
                    i17 = i216;
                    ImageView imageView9 = imageView;
                    i19 = i3;
                    imageView = imageView9;
                    break;
                case -784924730:
                case 1162190857:
                    i17 = i17;
                    i20 = i20;
                    textView2 = textView2;
                    strM42743 = strM42743;
                    sArr4 = sArr4;
                    c11674 = c11674;
                    i2 = i21;
                    int i35 = i19;
                    imageView = imageView;
                    i3 = i35;
                    s = sArr2[0];
                    s2 = 3336;
                    if (C1461.m5080()) {
                        iM11306 = C19806.m45029("᩶ۙ") ^ i11;
                        i13 = ((iM11306 ^ i12) * 32489) ^ 1245402862;
                        i4 = -1237072471;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙ۬") ^ i12;
                        i13 = ((iM11306 ^ i11) * (-15025)) ^ 1506037496;
                        i4 = -985759053;
                    }
                    i5 = iM11306 ^ i4;
                    i21 = i2;
                    c11674 = c11674;
                    strM42743 = strM42743;
                    int i217 = i17;
                    i14 = i5;
                    sArr4 = sArr4;
                    textView2 = textView2;
                    i20 = i20;
                    i17 = i217;
                    ImageView imageView10 = imageView;
                    i19 = i3;
                    imageView = imageView10;
                    break;
                case -525090906:
                case -139435824:
                    int i36 = i17;
                    i20 = i20;
                    textView2 = textView2;
                    strM42743 = strM42743;
                    sArr4 = sArr4;
                    int i37 = i19;
                    ImageView imageView11 = imageView;
                    boolean z = abstractC12554 instanceof ViewOnClickListenerC4617;
                    int i38 = i21;
                    C11674 c11675 = this.f12129;
                    if (z) {
                        int iM450217 = C19806.m45029("ۤܺ") ^ i12;
                        int i39 = ((iM450217 ^ i11) * (-25675)) ^ (-1761488464);
                        int i40 = iM450217 ^ 2104542703;
                        i13 = i39;
                        i17 = i36;
                        i14 = i40;
                    } else {
                        int iM11309 = (ThreadFactoryC3888.m11306("ۜ۬") + i11) * 9;
                        i13 = ((iM11309 ^ i12) * (-18695)) ^ (-1793168383);
                        i14 = iM11309 ^ (-82044568);
                        i17 = i36;
                    }
                    c11674 = c11675;
                    i21 = i38;
                    i19 = i37;
                    imageView = imageView11;
                    break;
                case -417153534:
                case 1609767891:
                    i17 = i17;
                    i20 = i20;
                    textView2 = textView2;
                    strM42743 = strM42743;
                    sArr4 = sArr4;
                    c11674 = c11674;
                    i2 = i21;
                    int i41 = i19;
                    imageView = imageView;
                    i3 = i41;
                    int i42 = s + s2;
                    int i43 = (s * s) + 11128896;
                    if ((i43 + i43) - (i42 * i42) >= 0) {
                        iM11306 = C19806.m45029("ۜۘ") ^ i11;
                        i13 = ((iM11306 ^ i12) * (-9585)) ^ 1093648024;
                        i4 = -623557383;
                    } else {
                        iM11306 = C19806.m45029("᩹ۤ") ^ i12;
                        i13 = ((iM11306 ^ i11) * 2425) ^ (-1250491167);
                        i4 = -469189668;
                    }
                    i5 = iM11306 ^ i4;
                    i21 = i2;
                    c11674 = c11674;
                    strM42743 = strM42743;
                    int i218 = i17;
                    i14 = i5;
                    sArr4 = sArr4;
                    textView2 = textView2;
                    i20 = i20;
                    i17 = i218;
                    ImageView imageView12 = imageView;
                    i19 = i3;
                    imageView = imageView12;
                    break;
                case -407020694:
                case 639368208:
                    i17 = i17;
                    i20 = i20;
                    TextView textView4 = textView2;
                    strM42743 = strM42743;
                    sArr4 = sArr4;
                    int i44 = i19;
                    imageView = imageView;
                    i3 = i44;
                    viewOnClickListenerC4617 = (ViewOnClickListenerC4617) abstractC12554;
                    textView2 = textView4;
                    c18419 = (C18419) C2477.m7592(c11674.f39246, i);
                    viewOnClickListenerC4617.f16342 = c18419;
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() < 0) {
                        int iM450218 = (i11 - C19806.m45029("ܽ᩹")) * 127;
                        i13 = ((iM450218 ^ i12) * (-7761)) ^ (-1064448283);
                        sArr4 = sArr4;
                        textView2 = textView2;
                        i20 = i20;
                        i17 = i17;
                        i14 = iM450218 ^ 1051514284;
                        strM42743 = strM42743;
                        ImageView imageView13 = imageView;
                        i19 = i3;
                        imageView = imageView13;
                    } else {
                        c11674 = c11674;
                        i2 = i21;
                        iM11306 = (i11 - ThreadFactoryC3888.m11306("᩹ۘ")) * 65;
                        i13 = ((iM11306 ^ i12) * 1235) ^ 345260666;
                        i4 = 1046817719;
                        i5 = iM11306 ^ i4;
                        i21 = i2;
                        c11674 = c11674;
                        strM42743 = strM42743;
                        int i219 = i17;
                        i14 = i5;
                        sArr4 = sArr4;
                        textView2 = textView2;
                        i20 = i20;
                        i17 = i219;
                        ImageView imageView14 = imageView;
                        i19 = i3;
                        imageView = imageView14;
                    }
                    break;
                case -307801778:
                case 1182647641:
                    i17 = i17;
                    iM450213 = C19806.m45029(C0797.m3361(f12128, 10, 3, i21));
                    i18 = 2099773378;
                    if (!C0526.f2219) {
                        iM45029 = (i11 - ThreadFactoryC3888.m11306("᩻ܶ")) * (-27);
                        i6 = ((iM45029 ^ i12) * (-19237)) ^ 1862618765;
                        i7 = -798024222;
                        int i2110 = iM45029 ^ i7;
                        i17 = i17;
                        i14 = i2110;
                        i13 = i6;
                    } else {
                        textView = textView2;
                        str = strM42743;
                        sArr = sArr4;
                        iM450210 = (C19806.m45029("۫ۨ") ^ i12) * 83;
                        i8 = ((iM450210 ^ i11) * (-24891)) ^ (-1971484242);
                        i9 = -1697629496;
                        int i220 = iM450210 ^ i9;
                        strM42743 = str;
                        int i221 = i17;
                        i14 = i220;
                        sArr4 = sArr;
                        textView2 = textView;
                        i13 = i8;
                        i17 = i221;
                    }
                    break;
                case -262219122:
                case 316159125:
                    i17 = i17;
                    ThreadFactoryC3888.m11309(spannableStringBuilder, new ForegroundColorSpan(i17), iM5086, MenuItemOnMenuItemClickListenerC3244.m9702(spannableStringBuilder), 33);
                    iM45029 = C19806.m45029("۬ۖ") ^ i12;
                    i6 = ((iM45029 ^ i11) * (-11039)) ^ 2147379783;
                    i7 = -1089059353;
                    int i2111 = iM45029 ^ i7;
                    i17 = i17;
                    i14 = i2111;
                    i13 = i6;
                    break;
                case -243949115:
                case 1697982112:
                    C14892.m35594(C1937.m6281(c18419), c18419.m42727(), c18419.m42728(), viewOnClickListenerC4617.f16345);
                    break;
                case -232075321:
                case 1368896218:
                    C11674.m29145(c11674, (ViewOnClickListenerC13791) abstractC12554);
                    break;
                case 173356113:
                case 1038149580:
                    i17 = i17;
                    TextView textView5 = textView2;
                    strM42743 = strM42743;
                    C1461.m5083(textView5, strM42743);
                    spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilderM3865 = C1025.m3865(spannableStringBuilder, c18419.m42741());
                    if (C3722.f13525 <= 0) {
                        textView2 = textView5;
                        i2 = i21;
                        int i310 = i19;
                        imageView = imageView;
                        i3 = i310;
                        iM11306 = (i11 - ThreadFactoryC3888.m11306("᩹ۘ")) * 65;
                        i13 = ((iM11306 ^ i12) * 1235) ^ 345260666;
                        i4 = 1046817719;
                        i5 = iM11306 ^ i4;
                        i21 = i2;
                        c11674 = c11674;
                        strM42743 = strM42743;
                        int i2112 = i17;
                        i14 = i5;
                        sArr4 = sArr4;
                        textView2 = textView2;
                        i20 = i20;
                        i17 = i2112;
                        ImageView imageView15 = imageView;
                        i19 = i3;
                        imageView = imageView15;
                    } else {
                        int iM450219 = (C19806.m45029("ۜ᩺") + i11) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        strM42743 = strM42743;
                        i13 = ((iM450219 ^ i12) * 935) ^ (-1189066364);
                        sArr4 = sArr4;
                        textView2 = textView5;
                        i14 = iM450219 ^ 359893263;
                        i17 = i17;
                    }
                    break;
                case 635165406:
                case 1644623367:
                    i17 = i17;
                    C1461.m5083(viewOnClickListenerC4617.f16341, spannableStringBuilder);
                    C1461.m5083(viewOnClickListenerC4617.f16340, c18419.m42717());
                    if (!C3286.f12186) {
                        iM45029 = C19806.m45029("ᩴܰ") ^ i11;
                        i6 = ((iM45029 ^ i12) * 30401) ^ 1163147117;
                        i7 = 2017533691;
                        int i2113 = iM45029 ^ i7;
                        i17 = i17;
                        i14 = i2113;
                        i13 = i6;
                    } else {
                        textView2 = textView2;
                        strM42743 = strM42743;
                        i2 = i21;
                        int i311 = i19;
                        imageView = imageView;
                        i3 = i311;
                        iM11306 = (i11 - ThreadFactoryC3888.m11306("᩹ۘ")) * 65;
                        i13 = ((iM11306 ^ i12) * 1235) ^ 345260666;
                        i4 = 1046817719;
                        i5 = iM11306 ^ i4;
                        i21 = i2;
                        c11674 = c11674;
                        strM42743 = strM42743;
                        int i2114 = i17;
                        i14 = i5;
                        sArr4 = sArr4;
                        textView2 = textView2;
                        i20 = i20;
                        i17 = i2114;
                        ImageView imageView16 = imageView;
                        i19 = i3;
                        imageView = imageView16;
                    }
                    break;
                case 724343232:
                case 1146213528:
                    i17 = i17;
                    sArr4 = f12128;
                    i15 = 4;
                    i16 = 3;
                    if (C0629.f2722 <= 0) {
                        iM45029 = C19806.m45029("ܳۢ") ^ i12;
                        i6 = ((iM45029 ^ i11) * 27) ^ (-578922555);
                        i7 = 1596831472;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡܰ") ^ i12;
                        i6 = ((iM45029 ^ i11) * 29629) ^ 2078831273;
                        i7 = -747151057;
                    }
                    int i2115 = iM45029 ^ i7;
                    i17 = i17;
                    i14 = i2115;
                    i13 = i6;
                    break;
                case 883353374:
                case 1016438822:
                    C0797.m3349(spannableStringBuilder, C0671.m3017(iM450213 ^ i18));
                    iM45983 = C20368.m45983(-1996767, -29696);
                    i17 = iM45983;
                    int iM4502110 = (i12 - C19806.m45029("ܰ᩸")) * (-39);
                    i6 = ((iM4502110 ^ i11) * (-30243)) ^ 1144652543;
                    i14 = iM4502110 ^ (-1698822691);
                    i13 = i6;
                    break;
                case 992247957:
                case 1236991763:
                    i17 = i17;
                    strM6241 = ViewGroupOnHierarchyChangeListenerC1916.m6241(sArr4, i15, i16, i21);
                    C1025.m3865(C0797.m3349(spannableStringBuilderM3865, strM6241), C1791.m5863(c18419.m42745()));
                    c11986M40033 = C17132.m40033(C1937.m6281(c18419));
                    if (c11986M40033 != null) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳۡ") ^ i11) * (-33);
                        i6 = ((iM45029 ^ i12) * 21903) ^ 851164801;
                        i7 = 375760608;
                    } else {
                        iM45029 = C19806.m45029("۬ۖ") ^ i12;
                        i6 = ((iM45029 ^ i11) * (-11039)) ^ 2147379783;
                        i7 = -1089059353;
                    }
                    int i2116 = iM45029 ^ i7;
                    i17 = i17;
                    i14 = i2116;
                    i13 = i6;
                    break;
                case 1027928310:
                case 2139586401:
                    if (C3660.f13403 < 0) {
                        i17 = i17;
                        textView = textView2;
                        str = strM42743;
                        sArr = sArr4;
                        iM450210 = (C19806.m45029("۫ۨ") ^ i12) * 83;
                        i8 = ((iM450210 ^ i11) * (-24891)) ^ (-1971484242);
                        i9 = -1697629496;
                        int i222 = iM450210 ^ i9;
                        strM42743 = str;
                        int i223 = i17;
                        i14 = i222;
                        sArr4 = sArr;
                        textView2 = textView;
                        i13 = i8;
                        i17 = i223;
                    } else {
                        i17 = i17;
                        textView2 = textView2;
                        strM42743 = strM42743;
                        i2 = i21;
                        int i312 = i19;
                        imageView = imageView;
                        i3 = i312;
                        iM11306 = (i11 - ThreadFactoryC3888.m11306("᩹ۘ")) * 65;
                        i13 = ((iM11306 ^ i12) * 1235) ^ 345260666;
                        i4 = 1046817719;
                        i5 = iM11306 ^ i4;
                        i21 = i2;
                        c11674 = c11674;
                        strM42743 = strM42743;
                        int i2117 = i17;
                        i14 = i5;
                        sArr4 = sArr4;
                        textView2 = textView2;
                        i20 = i20;
                        i17 = i2117;
                        ImageView imageView17 = imageView;
                        i19 = i3;
                        imageView = imageView17;
                    }
                    break;
                case 1615494562:
                case 2126955012:
                    i3 = i19;
                    i21 = 61851;
                    int iM113010 = (ThreadFactoryC3888.m11306("ᩳ۠") + i12) * 13;
                    c11674 = c11674;
                    i13 = ((iM113010 ^ i11) * (-29709)) ^ 501455763;
                    i5 = iM113010 ^ 723925616;
                    c11674 = c11674;
                    strM42743 = strM42743;
                    int i2118 = i17;
                    i14 = i5;
                    sArr4 = sArr4;
                    textView2 = textView2;
                    i20 = i20;
                    i17 = i2118;
                    ImageView imageView18 = imageView;
                    i19 = i3;
                    imageView = imageView18;
                    break;
                default:
                    C1398.m4895();
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        C11674 c11674 = null;
        int iM18986 = 0;
        int i = 1264141516;
        int i2 = C1875.f7103;
        int i3 = C3577.f13150;
        int iM11306 = ThreadFactoryC3888.m11306("ۙۨ") ^ i2;
        int i4 = ((iM11306 ^ i3) * (-22727)) ^ (-1452488876);
        int i5 = -2130435495;
        while (true) {
            i = ((((i ^ i3) * 32239) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1994189922:
                case -726961809:
                    if (C1875.f7103 >= 0) {
                        iM11306 = C19806.m45029("ۜ۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-21235)) ^ 1944086833;
                        i5 = -1871684685;
                    } else {
                        iM11306 = (C19806.m45029("ܰۘ") + i2) * (-9);
                        i4 = ((iM11306 ^ i3) * (-22013)) ^ 809872505;
                        i5 = -1193144155;
                    }
                    break;
                case -1962582893:
                case -348954586:
                    if (C3286.m9798() <= 0) {
                        iM11306 = (C19806.m45029("֡ۚ") + i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM11306 ^ i3) * (-30811)) ^ (-1643514960);
                        i5 = 910150336;
                    } else {
                        iM11306 = (C19806.m45029("ۘ֡") ^ i3) * 31;
                        i4 = ((iM11306 ^ i2) * 28959) ^ (-320783212);
                        i5 = -1957334065;
                    }
                    break;
                case -1938616047:
                case -1726581114:
                    if (C3722.m10894() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۠ᩳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-11945)) ^ (-787279167);
                        i5 = -2012938543;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ܶ᩻")) * (-13);
                        i4 = ((iM11306 ^ i3) * 23685) ^ (-1202732613);
                        i5 = 1457434569;
                    }
                    break;
                case -1902298304:
                case 946521155:
                    iM18986 = C7105.m18986(c11674.f39246);
                    if (C3286.f12186) {
                        iM11306 = (C19806.m45029("֡ۚ") + i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM11306 ^ i3) * (-30811)) ^ (-1643514960);
                        i5 = 910150336;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺۙ") ^ i3) * (-121);
                        i4 = ((iM11306 ^ i2) * (-28483)) ^ 772789822;
                        i5 = 1027305731;
                    }
                    break;
                case -1853561251:
                case 1481645489:
                    if (RunnableC1564.f6300) {
                        iM11306 = (C19806.m45029("֡ۚ") + i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM11306 ^ i3) * (-30811)) ^ (-1643514960);
                        i5 = 910150336;
                    } else {
                        iM11306 = C19806.m45029("ۧۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-4493)) ^ (-943931707);
                        i5 = -141377223;
                    }
                    break;
                case -1788219764:
                case -585369891:
                    return 0;
                case -1776484184:
                case 900768873:
                    if (C0671.f2816 != 0) {
                        iM11306 = (C19806.m45029("ܰۘ") + i2) * (-9);
                        i4 = ((iM11306 ^ i3) * (-22013)) ^ 809872505;
                        i5 = -1193144155;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۜۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 31389) ^ 1257061953;
                        i5 = -619342555;
                    }
                    break;
                case -1774914085:
                case 315183889:
                    if (C1066.m4023() <= 0) {
                        iM11306 = C19806.m45029("۫ܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-31819)) ^ 445019981;
                        i5 = 1315368590;
                    } else {
                        iM11306 = (C19806.m45029("ܰۘ") + i2) * (-9);
                        i4 = ((iM11306 ^ i3) * (-22013)) ^ 809872505;
                        i5 = -1193144155;
                    }
                    break;
                case -1426974161:
                case 64760998:
                    RunnableC1606.m5473();
                    C2249.m6915();
                    return 0;
                case -1295003841:
                case -423202458:
                    C1377.m4833();
                    if (!CallableC1627.f6528) {
                        iM11306 = C19806.m45029("۫ܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-31819)) ^ 445019981;
                        i5 = 1315368590;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠ᩳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-11945)) ^ (-787279167);
                        i5 = -2012938543;
                    }
                    break;
                case -1178811435:
                case 973840804:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6239(c11674.f39246)) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ܳ") ^ i2) * 41;
                        i4 = ((iM11306 ^ i3) * (-29535)) ^ 599858959;
                        i5 = 1066405953;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20591)) ^ 299407977;
                        i5 = -1566090716;
                    }
                    break;
                case -831627831:
                case -480409009:
                    if (c11674.f39251) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ܳ") ^ i2) * 41;
                        i4 = ((iM11306 ^ i3) * (-29535)) ^ 599858959;
                        i5 = 1066405953;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۛܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 26701) ^ 1653958015;
                        i5 = -784701007;
                    }
                    break;
                case -664397213:
                case 1834966949:
                    if (C10634.m26820()) {
                        iM11306 = (C19806.m45029("֡ۚ") + i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM11306 ^ i3) * (-30811)) ^ (-1643514960);
                        i5 = 910150336;
                    } else {
                        iM11306 = (i3 - C19806.m45029("᩹۫")) * 47;
                        i4 = ((iM11306 ^ i2) * (-28981)) ^ (-1337493424);
                        i5 = -2008369376;
                    }
                    break;
                case -531792907:
                case 2067895197:
                    C3535.m10431();
                    RunnableC3388.m10064();
                    iM11306 = (C19806.m45029("ܰۘ") + i2) * (-9);
                    i4 = ((iM11306 ^ i3) * (-22013)) ^ 809872505;
                    i5 = -1193144155;
                    break;
                case -369735465:
                case 762312124:
                    return iM18986 + 1;
                case 1104677897:
                case 1255627093:
                    if (C3722.f13525 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۠ᩳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-11945)) ^ (-787279167);
                        i5 = -2012938543;
                    } else {
                        iM11306 = C19806.m45029("ۡۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-17927)) ^ (-970215802);
                        i5 = 1915205900;
                    }
                    break;
                case 1246294565:
                case 1428721341:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = (C19806.m45029("ܰۘ") + i2) * (-9);
                        i4 = ((iM11306 ^ i3) * (-22013)) ^ 809872505;
                        i5 = -1193144155;
                    } else {
                        iM11306 = C19806.m45029("᩵֫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-17143)) ^ 1234046429;
                        i5 = 84573;
                    }
                    break;
                case 1470173702:
                case 1781918427:
                    c11674 = this.f12129;
                    if (C0671.f2816 != 0) {
                        iM11306 = C19806.m45029("ۜ۟") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-21235)) ^ 1944086833;
                        i5 = -1871684685;
                    } else {
                        iM11306 = C19806.m45029("ۨۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-16009)) ^ (-1221046901);
                        i5 = 1682789292;
                    }
                    break;
                default:
                    if (C3286.f12186) {
                        iM11306 = C19806.m45029("۫ܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-31819)) ^ 445019981;
                        i5 = 1315368590;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ܰۗ")) * 45;
                        i4 = ((iM11306 ^ i2) * 30015) ^ 487076663;
                        i5 = 1623508097;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x005f, code lost:
    
        if (l.C0629.f2722 <= 0) goto L8;
     */
    @Override // l.AbstractC0414
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.AbstractC12554 onCreateViewHolder(android.view.ViewGroup r25, int r26) {
        /*
            Method dump skipped, instruction units count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3268.onCreateViewHolder(android.view.ViewGroup, int):l.۫ܿܰ");
    }

    public C3268(C11674 c11674) {
        this.f12129 = c11674;
    }
}
