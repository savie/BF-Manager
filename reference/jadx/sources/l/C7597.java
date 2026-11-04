package l;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.slider.BaseSlider;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۟ۗ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: G2S4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7597 extends AbstractC12964 {

    /* JADX INFO: renamed from: ᩺ۙ᩸, reason: not valid java name and contains not printable characters */
    private static final short[] f25087 = {335, 14302, 4554, 15211, 16859, 16859, 16859, 14583, -13303, 13778, 13462, 11442, 10328, 6996, 12497, -10118, -11157, 4711, 14729, -10566};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0885 f25088;

    @Override // l.AbstractC12964
    public final int getItemViewType(int i) {
        int itemCount = 0;
        int i2 = 0;
        int i3 = -1374565694;
        int i4 = C0950.f3488;
        int i5 = RunnableC3055.f9898;
        int iM2761 = C0619.m2761("֫۠") ^ i4;
        int i6 = ((iM2761 ^ i5) * (-509)) ^ (-76379663);
        int i7 = 234958116;
        while (true) {
            i3 = ((((i3 ^ i5) * 25925) >> 31) & i6) ^ (iM2761 ^ i7);
            switch (i3) {
                case -2036487592:
                case -576021892:
                    return i2;
                case -2003916769:
                case 965217316:
                    itemCount = getItemCount();
                    if (RunnableC3646.f12471) {
                        iM2761 = C0619.m2761("ۢܰ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-25357)) ^ 570797192;
                        i7 = 2020299091;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ۖ᩹")) * 45;
                        i6 = ((iM2761 ^ i4) * (-30947)) ^ 612321717;
                        i7 = 946442538;
                    }
                    break;
                case -1837663655:
                case -1502124605:
                    if (!C2702.m8876()) {
                        iM2761 = C0619.m2761("ۗۧ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 10963) ^ (-1907495574);
                        i7 = -404162061;
                    } else {
                        iM2761 = (i4 - C0773.m3169("᩷ۤ")) * 81;
                        i6 = ((iM2761 ^ i5) * 4061) ^ 270232090;
                        i7 = -366257370;
                    }
                    break;
                case -1725297251:
                case 1705086939:
                    if (C4238.m13540() <= 0) {
                        iM2761 = (C0773.m3169("ۚܰ") + i5) * (-73);
                        i6 = ((iM2761 ^ i4) * (-3781)) ^ (-1080202932);
                        i7 = -1613358846;
                    } else {
                        iM2761 = C0773.m3169("ܰۢ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 26829) ^ 1032544866;
                        i7 = 1291262029;
                    }
                    break;
                case -1565993836:
                case 1551466502:
                    C3448.m11248();
                    iM2761 = C0619.m2761("ۗۧ") ^ i4;
                    i6 = ((iM2761 ^ i5) * 10963) ^ (-1907495574);
                    i7 = -404162061;
                    break;
                case -1494545797:
                case 1216295115:
                    if (C20932.m47848() != 0) {
                        iM2761 = C0619.m2761("ۢܰ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-25357)) ^ 570797192;
                        i7 = 2020299091;
                    } else {
                        iM2761 = C0619.m2761("۠ۘ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-18515)) ^ 1013109655;
                        i7 = -691313288;
                    }
                    break;
                case -1490714163:
                case 1891874095:
                    C3077.m10041();
                    RunnableC0334.m2063();
                    return 0;
                case -1290413876:
                case 972004265:
                    C2419.m8174();
                    if (!RunnableC1848.f6235) {
                        iM2761 = C0619.m2761("᩷᩹") ^ i5;
                        i6 = ((iM2761 ^ i4) * 737) ^ 744794201;
                        i7 = -464069252;
                    } else {
                        iM2761 = (C0773.m3169("ۚܰ") + i5) * (-73);
                        i6 = ((iM2761 ^ i4) * (-3781)) ^ (-1080202932);
                        i7 = -1613358846;
                    }
                    break;
                case -1113432529:
                case 511970279:
                    i2 = 1;
                    if (i == itemCount - 1) {
                        iM2761 = (i5 - C0619.m2761("ۢۗ")) * (-29);
                        i6 = ((iM2761 ^ i4) * 31695) ^ 415491979;
                        i7 = -62045611;
                    } else {
                        iM2761 = C0773.m3169("ۡ۟") ^ i4;
                        i6 = ((iM2761 ^ i5) * 2559) ^ (-75279065);
                        i7 = 1988072493;
                    }
                    break;
                case -955587797:
                case 1105209516:
                    if (C0950.f3488 >= 0) {
                        iM2761 = (i4 - C0773.m3169("᩷ۤ")) * 81;
                        i6 = ((iM2761 ^ i5) * 4061) ^ 270232090;
                        i7 = -366257370;
                    } else {
                        iM2761 = (C0773.m3169("֨ۢ") + i5) * (-85);
                        i6 = ((iM2761 ^ i4) * (-889)) ^ 19725321;
                        i7 = 323083093;
                    }
                    break;
                case -728657100:
                case 1959013893:
                    if (C2288.m7767()) {
                        iM2761 = C0619.m2761("᩷᩹") ^ i5;
                        i6 = ((iM2761 ^ i4) * 737) ^ 744794201;
                        i7 = -464069252;
                    } else {
                        iM2761 = C0619.m2761("ܺ۬") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-18275)) ^ 1349603012;
                        i7 = -1824080235;
                    }
                    break;
                case -674226704:
                case 54333674:
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0619.m2761("ۢܰ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-25357)) ^ 570797192;
                        i7 = 2020299091;
                    } else {
                        iM2761 = C0773.m3169("ۤ۟") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-345)) ^ 516095652;
                        i7 = -2138443395;
                    }
                    break;
                case -293469576:
                case 1688499394:
                    if (C3998.f13671 != 0) {
                        iM2761 = C0619.m2761("᩷᩹") ^ i5;
                        i6 = ((iM2761 ^ i4) * 737) ^ 744794201;
                        i7 = -464069252;
                    } else {
                        iM2761 = C0773.m3169("۠᩹") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-5509)) ^ (-1215031663);
                        i7 = 1036781037;
                    }
                    break;
                case 97997589:
                case 2035986403:
                    if (C4282.f15546 <= 0) {
                        iM2761 = C0619.m2761("᩷᩹") ^ i5;
                        i6 = ((iM2761 ^ i4) * 737) ^ 744794201;
                        i7 = -464069252;
                    } else {
                        iM2761 = (i4 - C0773.m3169("᩸᩶")) * (-21);
                        i6 = ((iM2761 ^ i5) * (-22801)) ^ 888505177;
                        i7 = -1606802146;
                    }
                    break;
                case 239690778:
                case 1360128073:
                    if (C3734.m12152() < 0) {
                        iM2761 = (C0773.m3169("ۚܰ") + i5) * (-73);
                        i6 = ((iM2761 ^ i4) * (-3781)) ^ (-1080202932);
                        i7 = -1613358846;
                    } else {
                        iM2761 = C0619.m2761("ۗۧ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 10963) ^ (-1907495574);
                        i7 = -404162061;
                    }
                    break;
                case 396540714:
                case 914451243:
                    if (C11235.f35427 >= 0) {
                        iM2761 = (i4 - C0773.m3169("᩷ۤ")) * 81;
                        i6 = ((iM2761 ^ i5) * 4061) ^ 270232090;
                        i7 = -366257370;
                    } else {
                        iM2761 = (C0773.m3169("ۚۨ") + i4) * (-79);
                        i6 = ((iM2761 ^ i5) * 30899) ^ 1771614731;
                        i7 = -1915131794;
                    }
                    break;
                case 1193662428:
                case 1466209471:
                    if (C3077.f9998) {
                        iM2761 = C0619.m2761("ۘܳ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 13423) ^ 386211303;
                        i7 = -208717387;
                    } else {
                        iM2761 = C0619.m2761("ۢܰ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-25357)) ^ 570797192;
                        i7 = 2020299091;
                    }
                    break;
                default:
                    return 0;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0257 A[PHI: r0 r5 r6 r14 r29
      0x0257: PHI (r0v4 short[]) = (r0v3 short[]), (r0v2 short[]), (r0v2 short[]) binds: [B:49:0x0255, B:31:0x0167, B:10:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x0257: PHI (r5v4 int) = (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:49:0x0255, B:31:0x0167, B:10:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x0257: PHI (r6v4 int) = (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:49:0x0255, B:31:0x0167, B:10:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x0257: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:49:0x0255, B:31:0x0167, B:10:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x0257: PHI (r29v18 int) = (r29v8 int), (r29v11 int), (r29v24 int) binds: [B:49:0x0255, B:31:0x0167, B:10:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        int i2;
        int iM2761;
        int i3;
        int i4;
        int i5;
        TextView textView;
        String str;
        short[] sArr;
        int iM10871;
        int i6;
        int iM3169;
        int i7;
        int i8;
        int i9;
        String str2;
        ImageView imageView;
        int i10;
        TextView textView2;
        int i11;
        int i12 = -519212933;
        int i13 = C4238.f15451;
        int i14 = C1321.f4751;
        int iM2762 = C0619.m2761("ۗ۠") ^ i13;
        int i15 = ((iM2762 ^ i14) * 1259) ^ (-838284882);
        int i16 = iM2762 ^ 1965431927;
        ImageView imageView2 = null;
        TextView textView3 = null;
        String strM28216 = null;
        C18300 c18300M52717 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i17 = 0;
        int i18 = 0;
        int iM12919 = 0;
        int i19 = 0;
        int iM31610 = 0;
        int iM31611 = 0;
        int i20 = 0;
        short s = 0;
        short s2 = 0;
        ActivityC0885 activityC0885 = null;
        int i21 = 0;
        int i22 = 0;
        C11192 c11192 = null;
        String strM2820 = null;
        ViewOnClickListenerC18784 viewOnClickListenerC18784 = null;
        SpannableStringBuilder spannableStringBuilderM4232 = null;
        int i23 = 0;
        SpannableStringBuilder spannableStringBuilder = null;
        while (true) {
            i12 = i16 ^ (i15 & (((i12 ^ i14) * (-23313)) >> 31));
            switch (i12) {
                case -1979106997:
                case 469853547:
                    i6 = i21;
                    i8 = 16891;
                    int iM2763 = C0619.m2761("ۜܰ") ^ i14;
                    i23 = i8;
                    strM28216 = strM28216;
                    i15 = ((iM2763 ^ i13) * 22619) ^ (-439049324);
                    sArr4 = sArr4;
                    textView3 = textView3;
                    i22 = i22;
                    i19 = i19;
                    i16 = iM2763 ^ 332345446;
                    activityC0885 = activityC0885;
                    ImageView imageView3 = imageView2;
                    i21 = i6;
                    imageView2 = imageView3;
                    break;
                case -1922761873:
                case 2032614928:
                    RunnableC1848.m6360();
                    if (C0269.f1558 > 0) {
                        i2 = i19;
                        iM2761 = (C0773.m3169("۬ۨ") ^ i13) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM2761 ^ i14) * 7557) ^ 320375540;
                        i4 = -285043179;
                        int i24 = iM2761 ^ i4;
                        i19 = i2;
                        i16 = i24;
                        i15 = i3;
                    }
                    i2 = i19;
                    iM2761 = (i14 - C0619.m2761("֨ۗ")) * (-31);
                    i3 = ((iM2761 ^ i13) * 7047) ^ (-702186227);
                    i4 = -858231120;
                    int i25 = iM2761 ^ i4;
                    i19 = i2;
                    i16 = i25;
                    i15 = i3;
                    break;
                case -1784492624:
                case -1013843017:
                    i2 = i19;
                    i5 = i22;
                    textView = textView3;
                    str = strM28216;
                    sArr = sArr4;
                    i23 = i23;
                    int i26 = i21;
                    imageView2 = imageView2;
                    i6 = i26;
                    sArr2 = f25087;
                    if (C3492.f12043 > 0) {
                        iM3169 = (i13 - C0773.m3169("ۤۗ")) * 19;
                        i15 = ((iM3169 ^ i14) * 24001) ^ 1915357990;
                        i7 = 2122159071;
                        i23 = i23;
                        strM28216 = str;
                        int i27 = i2;
                        i16 = iM3169 ^ i7;
                        sArr4 = sArr;
                        textView3 = textView;
                        i22 = i5;
                        i19 = i27;
                        ImageView imageView4 = imageView2;
                        i21 = i6;
                        imageView2 = imageView4;
                    } else {
                        ImageView imageView5 = imageView2;
                        i21 = i6;
                        imageView2 = imageView5;
                        int iM31612 = C0773.m3169("ۡܿ") ^ i14;
                        i15 = ((iM31612 ^ i13) * (-4185)) ^ (-2139912920);
                        i23 = i23;
                        strM28216 = str;
                        i11 = i2;
                        i16 = iM31612 ^ 53244163;
                        sArr4 = sArr;
                        textView3 = textView;
                        i22 = i5;
                        i19 = i11;
                    }
                    break;
                case -1708604791:
                case 202892230:
                    i2 = i19;
                    ActivityC0885 activityC0886 = activityC0885;
                    i5 = i22;
                    textView = textView3;
                    str = strM28216;
                    sArr = sArr4;
                    i23 = i23;
                    int i28 = i21;
                    imageView2 = imageView2;
                    i6 = i28;
                    int i29 = s + s2;
                    if ((i29 * i29) - ((s * 2) + 1) >= 0) {
                        iM3169 = (C0773.m3169("ܰۘ") ^ i13) * 23;
                        activityC0885 = activityC0886;
                        i15 = ((iM3169 ^ i14) * (-22939)) ^ (-460513988);
                        i7 = -527611172;
                    } else {
                        activityC0885 = activityC0886;
                        iM3169 = (C0773.m3169("۟᩻") ^ i14) * (-125);
                        i15 = ((iM3169 ^ i13) * 20625) ^ 1280522504;
                        i7 = 1337841148;
                    }
                    i23 = i23;
                    strM28216 = str;
                    int i210 = i2;
                    i16 = iM3169 ^ i7;
                    sArr4 = sArr;
                    textView3 = textView;
                    i22 = i5;
                    i19 = i210;
                    ImageView imageView6 = imageView2;
                    i21 = i6;
                    imageView2 = imageView6;
                    break;
                case -1692925518:
                case 524980604:
                    C3998.m12920();
                    C23916.m53419();
                    i9 = i19;
                    textView2 = textView3;
                    str2 = strM28216;
                    int i30 = i21;
                    imageView = imageView2;
                    i10 = i30;
                    int iM31613 = C0773.m3169("֨֡") ^ i13;
                    i15 = ((iM31613 ^ i14) * (-29811)) ^ 118409503;
                    sArr4 = sArr4;
                    textView3 = textView2;
                    i22 = i22;
                    i19 = i9;
                    i16 = iM31613 ^ (-383235679);
                    strM28216 = str2;
                    ImageView imageView7 = imageView;
                    i21 = i10;
                    imageView2 = imageView7;
                    break;
                case -1670915534:
                case 846476482:
                    ActivityC0885.m3597(activityC0885, (ViewOnClickListenerC9833) abstractC11800);
                    break;
                case -1656094926:
                case -357691233:
                    C13650.m33411(C0487.m2348(c11192), c11192.m28200(), c11192.m28213(), viewOnClickListenerC18784.f61009);
                    break;
                case -1573259199:
                case 2080836837:
                    i2 = i19;
                    iM31611 = C0773.m3169(C23916.m53420(f25087, 10, 3, i23));
                    i20 = 2127855407;
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = (i14 - C0619.m2761("֨ۗ")) * (-31);
                        i3 = ((iM2761 ^ i13) * 7047) ^ (-702186227);
                        i4 = -858231120;
                    } else {
                        iM2761 = (C0773.m3169("᩺᩵") + i13) * (-31);
                        i3 = ((iM2761 ^ i14) * 4899) ^ (-1135087025);
                        i4 = -1577885439;
                    }
                    int i211 = iM2761 ^ i4;
                    i19 = i2;
                    i16 = i211;
                    i15 = i3;
                    break;
                case -1514900986:
                case 1316443546:
                    C4282.m13644();
                    if (C1080.f3865 >= 0) {
                        i2 = i19;
                        iM2761 = (i14 - C0619.m2761("֨ۗ")) * (-31);
                        i3 = ((iM2761 ^ i13) * 7047) ^ (-702186227);
                        i4 = -858231120;
                        int i212 = iM2761 ^ i4;
                        i19 = i2;
                        i16 = i212;
                        i15 = i3;
                    } else {
                        i9 = i19;
                        textView2 = textView3;
                        str2 = strM28216;
                        int i31 = i21;
                        imageView = imageView2;
                        i10 = i31;
                        int iM31614 = C0773.m3169("֨֡") ^ i13;
                        i15 = ((iM31614 ^ i14) * (-29811)) ^ 118409503;
                        sArr4 = sArr4;
                        textView3 = textView2;
                        i22 = i22;
                        i19 = i9;
                        i16 = iM31614 ^ (-383235679);
                        strM28216 = str2;
                        ImageView imageView8 = imageView;
                        i21 = i10;
                        imageView2 = imageView8;
                    }
                    break;
                case -1464333539:
                case -401778327:
                    i6 = i21;
                    i8 = 10858;
                    int iM2764 = C0619.m2761("ۜܰ") ^ i14;
                    i23 = i8;
                    strM28216 = strM28216;
                    i15 = ((iM2764 ^ i13) * 22619) ^ (-439049324);
                    sArr4 = sArr4;
                    textView3 = textView3;
                    i22 = i22;
                    i19 = i19;
                    i16 = iM2764 ^ 332345446;
                    activityC0885 = activityC0885;
                    ImageView imageView9 = imageView2;
                    i21 = i6;
                    imageView2 = imageView9;
                    break;
                case -1408494081:
                case -1252576055:
                    i2 = i19;
                    i5 = i22;
                    textView = textView3;
                    str = strM28216;
                    sArr = sArr4;
                    i23 = i23;
                    int i32 = i21;
                    imageView2 = imageView2;
                    i6 = i32;
                    boolean z = abstractC11800 instanceof ViewOnClickListenerC18784;
                    ActivityC0885 activityC0887 = this.f25088;
                    if (z) {
                        int iM31615 = C0773.m3169("۬۠") ^ i13;
                        activityC0885 = activityC0887;
                        int i33 = ((iM31615 ^ i14) * 28029) ^ 1776921103;
                        int i34 = iM31615 ^ (-463678103);
                        i23 = i23;
                        strM28216 = str;
                        i15 = i33;
                        sArr4 = sArr;
                        textView3 = textView;
                        i22 = i5;
                        i19 = i2;
                        i16 = i34;
                    } else {
                        activityC0885 = activityC0887;
                        iM3169 = (i13 - C0773.m3169("᩻۠")) * 61;
                        i15 = ((iM3169 ^ i14) * (-2399)) ^ (-255005185);
                        i7 = 344166118;
                        i23 = i23;
                        strM28216 = str;
                        int i213 = i2;
                        i16 = iM3169 ^ i7;
                        sArr4 = sArr;
                        textView3 = textView;
                        i22 = i5;
                        i19 = i213;
                    }
                    ImageView imageView10 = imageView2;
                    i21 = i6;
                    imageView2 = imageView10;
                    break;
                case -1383134451:
                case 330101198:
                    i2 = i19;
                    strM2820 = AbstractC0641.m2820(sArr4, i17, i18, i23);
                    C1146.m4232(C1146.m4232(spannableStringBuilderM4232, strM2820), C8311.m22390(c11192.m28233()));
                    c18300M52717 = C23522.m52717(C0487.m2348(c11192));
                    if (c18300M52717 != null) {
                        iM2761 = (C0619.m2761("֫ۛ") ^ i14) * 49;
                        i3 = ((iM2761 ^ i13) * (-30939)) ^ 1784469579;
                        i4 = -2034141161;
                    } else {
                        iM2761 = C0619.m2761("ۖ᩹") ^ i14;
                        i3 = ((iM2761 ^ i13) * 30381) ^ (-852491021);
                        i4 = -309109887;
                    }
                    int i214 = iM2761 ^ i4;
                    i19 = i2;
                    i16 = i214;
                    i15 = i3;
                    break;
                case -1300882779:
                case 1705038853:
                    i2 = i19;
                    iM31610 = C0773.m3169(C3492.m11486(f25087, 7, 3, i23));
                    if (C0269.f1558 <= 0) {
                        iM2761 = (C0773.m3169("۬ۨ") ^ i13) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM2761 ^ i14) * 7557) ^ 320375540;
                        i4 = -285043179;
                    } else {
                        iM2761 = (i14 - C0619.m2761("ۚۤ")) * (-11);
                        i3 = ((iM2761 ^ i13) * (-9797)) ^ 1785982597;
                        i4 = -1984608696;
                    }
                    int i215 = iM2761 ^ i4;
                    i19 = i2;
                    i16 = i215;
                    i15 = i3;
                    break;
                case -1131663849:
                case 2124127973:
                    RunnableC3646.m11803(spannableStringBuilder, AbstractC3624.m11765(iM31611 ^ i20));
                    iM10871 = C3296.m10871(-1996767, -29696);
                    i19 = iM10871;
                    int iM31616 = (C0773.m3169("ܳ᩸") ^ i14) * (-11);
                    i3 = ((iM31616 ^ i13) * (-6287)) ^ 2012761724;
                    i16 = iM31616 ^ (-959731501);
                    i15 = i3;
                    break;
                case -744204594:
                case -582937495:
                    i9 = i19;
                    TextView textView4 = textView3;
                    str2 = strM28216;
                    C2354.m7978(textView4, str2);
                    spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilderM4232 = C1146.m4232(spannableStringBuilder, c11192.m28224());
                    if (C1542.f5343 <= 0) {
                        textView2 = textView4;
                        int i35 = i21;
                        imageView = imageView2;
                        i10 = i35;
                        int iM31617 = C0773.m3169("֨֡") ^ i13;
                        i15 = ((iM31617 ^ i14) * (-29811)) ^ 118409503;
                        sArr4 = sArr4;
                        textView3 = textView2;
                        i22 = i22;
                        i19 = i9;
                        i16 = iM31617 ^ (-383235679);
                        strM28216 = str2;
                        ImageView imageView11 = imageView;
                        i21 = i10;
                        imageView2 = imageView11;
                    } else {
                        int iM31618 = (i13 - C0773.m3169("ܿۨ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        strM28216 = str2;
                        i15 = ((iM31618 ^ i14) * 4311) ^ (-1911660911);
                        sArr4 = sArr4;
                        textView3 = textView4;
                        i16 = iM31618 ^ 539881872;
                        i19 = i9;
                    }
                    break;
                case -320024067:
                case 1710046700:
                    i2 = i19;
                    RunnableC3646.m11803(spannableStringBuilder, strM2820);
                    iM12919 = C3998.m12919(spannableStringBuilder);
                    if (c18300M52717.m42650() < c11192.m28200()) {
                        iM2761 = (C0619.m2761("᩹ܶ") ^ i13) * (-105);
                        i3 = ((iM2761 ^ i14) * 5943) ^ (-469855275);
                        i4 = -1307517523;
                    } else {
                        iM2761 = C0619.m2761("ۘᩳ") ^ i13;
                        i3 = ((iM2761 ^ i14) * 28237) ^ (-1032587051);
                        i4 = 79808791;
                    }
                    int i216 = iM2761 ^ i4;
                    i19 = i2;
                    i16 = i216;
                    i15 = i3;
                    break;
                case -235618723:
                case -133031998:
                    i2 = i19;
                    i5 = i22;
                    textView = textView3;
                    str = strM28216;
                    sArr = sArr4;
                    i23 = i23;
                    int i36 = i21;
                    imageView2 = imageView2;
                    i6 = i36;
                    s = sArr2[0];
                    s2 = 1;
                    if (C3033.m9845() > 0) {
                        iM3169 = C0619.m2761("ۡۗ") ^ i14;
                        i15 = ((iM3169 ^ i13) * 30301) ^ 837015547;
                        i7 = -1433411413;
                        i23 = i23;
                        strM28216 = str;
                        int i217 = i2;
                        i16 = iM3169 ^ i7;
                        sArr4 = sArr;
                        textView3 = textView;
                        i22 = i5;
                        i19 = i217;
                        ImageView imageView12 = imageView2;
                        i21 = i6;
                        imageView2 = imageView12;
                    } else {
                        ImageView imageView13 = imageView2;
                        i21 = i6;
                        imageView2 = imageView13;
                        int iM31619 = C0773.m3169("ۡܿ") ^ i14;
                        i15 = ((iM31619 ^ i13) * (-4185)) ^ (-2139912920);
                        i23 = i23;
                        strM28216 = str;
                        i11 = i2;
                        i16 = iM31619 ^ 53244163;
                        sArr4 = sArr;
                        textView3 = textView;
                        i22 = i5;
                        i19 = i11;
                    }
                    break;
                case -25120061:
                case 756344720:
                    i2 = i19;
                    TextView textView5 = textView3;
                    str = strM28216;
                    sArr = sArr4;
                    imageView2 = viewOnClickListenerC18784.f61009;
                    sArr3 = f25087;
                    i22 = 1;
                    i21 = 3;
                    if (C0487.f2131 <= 0) {
                        textView = textView5;
                        i5 = 1;
                        int iM316110 = C0773.m3169("ۡܿ") ^ i14;
                        i15 = ((iM316110 ^ i13) * (-4185)) ^ (-2139912920);
                        i23 = i23;
                        strM28216 = str;
                        i11 = i2;
                        i16 = iM316110 ^ 53244163;
                        sArr4 = sArr;
                        textView3 = textView;
                        i22 = i5;
                    } else {
                        int iM31620 = (C0773.m3169("ۧۧ") ^ i14) * 75;
                        int i37 = ((iM31620 ^ i13) * (-14735)) ^ (-152111471);
                        strM28216 = str;
                        i11 = i2;
                        i16 = iM31620 ^ (-2069370656);
                        sArr4 = sArr;
                        textView3 = textView5;
                        i15 = i37;
                    }
                    i19 = i11;
                    break;
                case 146370834:
                case 1829441740:
                    C3492.m11488();
                    if (C2834.m9344() >= 0) {
                        i2 = i19;
                        i5 = i22;
                        textView = textView3;
                        str = strM28216;
                        sArr = sArr4;
                        int iM316111 = C0773.m3169("ۡܿ") ^ i14;
                        i15 = ((iM316111 ^ i13) * (-4185)) ^ (-2139912920);
                        i23 = i23;
                        strM28216 = str;
                        i11 = i2;
                        i16 = iM316111 ^ 53244163;
                        sArr4 = sArr;
                        textView3 = textView;
                        i22 = i5;
                        i19 = i11;
                    } else {
                        i2 = i19;
                        iM2761 = (i14 - C0619.m2761("֨ۗ")) * (-31);
                        i3 = ((iM2761 ^ i13) * 7047) ^ (-702186227);
                        i4 = -858231120;
                        int i218 = iM2761 ^ i4;
                        i19 = i2;
                        i16 = i218;
                        i15 = i3;
                    }
                    break;
                case 297663653:
                case 626034998:
                    i2 = i19;
                    C3734.m12154(spannableStringBuilder, new ForegroundColorSpan(i19), iM12919, C3998.m12919(spannableStringBuilder), 33);
                    iM2761 = C0619.m2761("ۖ᩹") ^ i14;
                    i3 = ((iM2761 ^ i13) * 30381) ^ (-852491021);
                    i4 = -309109887;
                    int i219 = iM2761 ^ i4;
                    i19 = i2;
                    i16 = i219;
                    i15 = i3;
                    break;
                case 424852855:
                case 1259039385:
                    i2 = i19;
                    C23916.m53425(viewOnClickListenerC18784.f61005, spannableStringBuilder);
                    C2354.m7978(viewOnClickListenerC18784.f61007, c11192.m28201());
                    if (C2375.f7641 > 0) {
                        iM2761 = C0619.m2761("ܺܳ") ^ i13;
                        i3 = ((iM2761 ^ i14) * 25525) ^ (-676275702);
                        i4 = 738075938;
                        int i2110 = iM2761 ^ i4;
                        i19 = i2;
                        i16 = i2110;
                        i15 = i3;
                    } else {
                        i5 = i22;
                        textView = textView3;
                        str = strM28216;
                        sArr = sArr4;
                        int iM316112 = C0773.m3169("ۡܿ") ^ i14;
                        i15 = ((iM316112 ^ i13) * (-4185)) ^ (-2139912920);
                        i23 = i23;
                        strM28216 = str;
                        i11 = i2;
                        i16 = iM316112 ^ 53244163;
                        sArr4 = sArr;
                        textView3 = textView;
                        i22 = i5;
                        i19 = i11;
                    }
                    break;
                case 929602604:
                case 1589811117:
                    RunnableC3646.m11803(spannableStringBuilder, AbstractC0116.m1244(2127171176 ^ iM31610));
                    iM10871 = C3296.f10738;
                    i19 = iM10871;
                    int iM316113 = (C0773.m3169("ܳ᩸") ^ i14) * (-11);
                    i3 = ((iM316113 ^ i13) * (-6287)) ^ 2012761724;
                    i16 = iM316113 ^ (-959731501);
                    i15 = i3;
                    break;
                case 1073192117:
                case 1391146292:
                    i9 = i19;
                    i22 = i22;
                    TextView textView6 = textView3;
                    str2 = strM28216;
                    sArr4 = sArr4;
                    int i38 = i21;
                    imageView = imageView2;
                    i10 = i38;
                    viewOnClickListenerC18784 = (ViewOnClickListenerC18784) abstractC11800;
                    textView2 = textView6;
                    c11192 = (C11192) C3690.m11990(activityC0885.f3302, i);
                    viewOnClickListenerC18784.f61006 = c11192;
                    if (RunnableC3055.f9898 >= 0) {
                        int iM316114 = C0773.m3169("֨֡") ^ i13;
                        i15 = ((iM316114 ^ i14) * (-29811)) ^ 118409503;
                        sArr4 = sArr4;
                        textView3 = textView2;
                        i22 = i22;
                        i19 = i9;
                        i16 = iM316114 ^ (-383235679);
                    } else {
                        int iM2765 = C0619.m2761("ۗ᩶") ^ i14;
                        sArr4 = sArr4;
                        textView3 = textView2;
                        i22 = i22;
                        i19 = i9;
                        i16 = iM2765 ^ 1478001607;
                        i15 = ((iM2765 ^ i13) * (-29635)) ^ 1512429546;
                        i23 = i23;
                    }
                    strM28216 = str2;
                    ImageView imageView14 = imageView;
                    i21 = i10;
                    imageView2 = imageView14;
                    break;
                case 1192759128:
                case 1244587657:
                    short[] sArr5 = sArr4;
                    int i39 = i19;
                    short[] sArr6 = sArr3;
                    int i40 = i21;
                    int i41 = i22;
                    int iM31621 = C0773.m3169(C0619.m2756(sArr6, i41, i40, i23)) ^ 2127410140;
                    sArr3 = sArr6;
                    ImageView imageView15 = imageView2;
                    imageView15.setImageResource(iM31621);
                    TextView textView7 = viewOnClickListenerC18784.f61004;
                    strM28216 = c11192.m28216();
                    if (C2878.f9462) {
                        int iM31622 = C0773.m3169("ۛܳ") ^ i13;
                        int i42 = ((iM31622 ^ i14) * (-32433)) ^ 1687424073;
                        i22 = i41;
                        i19 = i39;
                        i16 = iM31622 ^ (-812590975);
                        imageView2 = imageView15;
                        i21 = i40;
                        i15 = i42;
                        sArr4 = sArr5;
                        textView3 = textView7;
                    } else {
                        imageView = imageView15;
                        int iM2766 = (C0619.m2761("ᩴ֫") ^ i13) * 43;
                        i10 = i40;
                        i15 = ((iM2766 ^ i14) * 28425) ^ (-35575074);
                        i22 = i41;
                        i19 = i39;
                        i16 = iM2766 ^ 1836962531;
                        sArr4 = sArr5;
                        textView3 = textView7;
                        ImageView imageView16 = imageView;
                        i21 = i10;
                        imageView2 = imageView16;
                    }
                    break;
                case 1523698380:
                case 2115516528:
                    i2 = i19;
                    sArr4 = f25087;
                    i17 = 4;
                    i18 = 3;
                    if (C4282.f15546 <= 0) {
                        iM2761 = (C0773.m3169("۬ۨ") ^ i13) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM2761 ^ i14) * 7557) ^ 320375540;
                        i4 = -285043179;
                    } else {
                        iM2761 = C0773.m3169("ۖܶ") ^ i14;
                        i3 = ((iM2761 ^ i13) * (-16707)) ^ 2016280553;
                        i4 = 186060630;
                    }
                    int i2111 = iM2761 ^ i4;
                    i19 = i2;
                    i16 = i2111;
                    i15 = i3;
                    break;
                default:
                    C2354.m7983();
                    C3448.m11248();
                    break;
            }
            return;
        }
    }

    public C7597(ActivityC0885 activityC0885) {
        this.f25088 = activityC0885;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0170 A[PHI: r4 r5 r7 r9 r10 r11 r14 r15
      0x0170: PHI (r4v6 android.view.LayoutInflater) = 
      (r4v4 android.view.LayoutInflater)
      (r4v3 android.view.LayoutInflater)
      (r4v3 android.view.LayoutInflater)
      (r4v3 android.view.LayoutInflater)
     binds: [B:43:0x016e, B:29:0x00fc, B:25:0x00d7, B:10:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r5v6 android.view.LayoutInflater) = 
      (r5v3 android.view.LayoutInflater)
      (r5v4 android.view.LayoutInflater)
      (r5v3 android.view.LayoutInflater)
      (r5v3 android.view.LayoutInflater)
     binds: [B:43:0x016e, B:29:0x00fc, B:25:0x00d7, B:10:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r7v6 int) = (r7v3 int), (r7v3 int), (r7v4 int), (r7v3 int) binds: [B:43:0x016e, B:29:0x00fc, B:25:0x00d7, B:10:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r9v6 int) = (r9v3 int), (r9v4 int), (r9v3 int), (r9v3 int) binds: [B:43:0x016e, B:29:0x00fc, B:25:0x00d7, B:10:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r10v6 short[]) = (r10v3 short[]), (r10v4 short[]), (r10v3 short[]), (r10v3 short[]) binds: [B:43:0x016e, B:29:0x00fc, B:25:0x00d7, B:10:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r11v6 int) = (r11v3 int), (r11v4 int), (r11v3 int), (r11v3 int) binds: [B:43:0x016e, B:29:0x00fc, B:25:0x00d7, B:10:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r14v6 short[]) = (r14v4 short[]), (r14v3 short[]), (r14v3 short[]), (r14v3 short[]) binds: [B:43:0x016e, B:29:0x00fc, B:25:0x00d7, B:10:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x0170: PHI (r15v6 int) = (r15v4 int), (r15v3 int), (r15v3 int), (r15v3 int) binds: [B:43:0x016e, B:29:0x00fc, B:25:0x00d7, B:10:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x02a8 A[PHI: r16 r17 r18 r19
      0x02a8: PHI (r16v5 short[]) = (r16v4 short[]), (r16v3 short[]), (r16v3 short[]) binds: [B:68:0x02a6, B:64:0x0288, B:60:0x0265] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r17v5 int) = (r17v3 int), (r17v4 int), (r17v3 int) binds: [B:68:0x02a6, B:64:0x0288, B:60:0x0265] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r18v4 int) = (r18v3 int), (r18v3 int), (r18v5 int) binds: [B:68:0x02a6, B:64:0x0288, B:60:0x0265] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r19v5 short) = (r19v3 short), (r19v4 short), (r19v3 short) binds: [B:68:0x02a6, B:64:0x0288, B:60:0x0265] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0083, code lost:
    
        if (l.AbstractC3624.f12429 > 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x008b, code lost:
    
        if (l.C13473.f42873 != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0096, code lost:
    
        if (l.C2878.f9462 != false) goto L19;
     */
    @Override // l.AbstractC12964
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.AbstractC11800 onCreateViewHolder(android.view.ViewGroup r27, int r28) {
        /*
            Method dump skipped, instruction units count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7597.onCreateViewHolder(android.view.ViewGroup, int):l.ۧᩳ᩷");
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        ActivityC0885 activityC0885 = null;
        int iM8879 = 0;
        int i = 217541908;
        int i2 = C3734.f12817;
        int i3 = C2310.f7472;
        int iM2761 = C0619.m2761("ܿ֡") ^ i2;
        int i4 = ((iM2761 ^ i3) * 3107) ^ 40810725;
        int i5 = -1909623296;
        while (true) {
            i = ((((i ^ i3) * (-4283)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2126293245:
                case 2102451582:
                    if (C20932.f66974 <= 0) {
                        iM2761 = (C0619.m2761("᩹᩸") + i3) * (-99);
                        i4 = ((iM2761 ^ i2) * 29641) ^ 1324238453;
                        i5 = -1079101001;
                    } else {
                        iM2761 = (C0773.m3169("᩷۟") + i3) * 91;
                        i4 = ((iM2761 ^ i2) * 14897) ^ 311385522;
                        i5 = -1995418153;
                    }
                    break;
                case -1946584984:
                case -822785730:
                    RunnableC0334.m2063();
                    return 0;
                case -1792433595:
                case 261136788:
                    if (C0619.f2439) {
                        iM2761 = (C0619.m2761("᩹᩸") + i3) * (-99);
                        i4 = ((iM2761 ^ i2) * 29641) ^ 1324238453;
                        i5 = -1079101001;
                    } else {
                        iM2761 = (C0619.m2761("᩷ܶ") ^ i3) * 33;
                        i4 = ((iM2761 ^ i2) * 26003) ^ (-1027556241);
                        i5 = -1418148021;
                    }
                    break;
                case -1762641361:
                case -1743086157:
                    C2310.m7813();
                    if (C2287.f7432 < 0) {
                        iM2761 = C0619.m2761("ܿۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 1025) ^ 1492210475;
                        i5 = -1516806339;
                    } else {
                        iM2761 = (C0619.m2761("۟۫") ^ i3) * (-97);
                        i4 = ((iM2761 ^ i2) * 30955) ^ 592084149;
                        i5 = 258161150;
                    }
                    break;
                case -1545760945:
                case 814183942:
                    C1542.m5459();
                    C1826.m6301();
                    iM2761 = (C0619.m2761("᩵۬") + i3) * 69;
                    i4 = ((iM2761 ^ i2) * 27271) ^ (-1399303831);
                    i5 = 933397592;
                    break;
                case -1377808660:
                case 1124549308:
                    if (C0269.f1558 <= 0) {
                        iM2761 = C0619.m2761("ܿۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 1025) ^ 1492210475;
                        i5 = -1516806339;
                    } else {
                        iM2761 = C0773.m3169("ۢ֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-3343)) ^ (-808281602);
                        i5 = 3782147;
                    }
                    break;
                case -1130244448:
                case -1065117381:
                    if (C1783.f6087 <= 0) {
                        iM2761 = (C0619.m2761("᩵۬") + i3) * 69;
                        i4 = ((iM2761 ^ i2) * 27271) ^ (-1399303831);
                        i5 = 933397592;
                    } else {
                        iM2761 = C0773.m3169("ۖۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 6049) ^ (-1252947301);
                        i5 = -398407423;
                    }
                    break;
                case -1024132453:
                case -534819618:
                    if (C3734.m12152() < 0) {
                        iM2761 = (C0619.m2761("᩹᩸") + i3) * (-99);
                        i4 = ((iM2761 ^ i2) * 29641) ^ 1324238453;
                        i5 = -1079101001;
                    } else {
                        iM2761 = C0619.m2761("ܿۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 1025) ^ 1492210475;
                        i5 = -1516806339;
                    }
                    break;
                case -882357892:
                case 2114124297:
                    return 0;
                case -843468235:
                case -61773892:
                    if (C4282.f15546 <= 0) {
                        iM2761 = (i2 - C0619.m2761("ۚ᩷")) * (-35);
                        i4 = ((iM2761 ^ i3) * (-7933)) ^ (-775433638);
                        i5 = 1545641591;
                    } else {
                        iM2761 = (C0619.m2761("᩸᩸") ^ i3) * (-23);
                        i4 = ((iM2761 ^ i2) * (-29257)) ^ (-253444715);
                        i5 = -2124348298;
                    }
                    break;
                case -749682666:
                case 1325606090:
                    if (C3690.m11987()) {
                        iM2761 = (C0619.m2761("᩹᩸") + i3) * (-99);
                        i4 = ((iM2761 ^ i2) * 29641) ^ 1324238453;
                        i5 = -1079101001;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۤ᩵")) * 87;
                        i4 = ((iM2761 ^ i2) * (-11569)) ^ 1214023302;
                        i5 = 118093645;
                    }
                    break;
                case -709690907:
                case 1445608024:
                    if (activityC0885.f3294) {
                        iM2761 = (i2 - C0619.m2761("᩶ۧ")) * (-37);
                        i4 = ((iM2761 ^ i3) * 19807) ^ 830100522;
                        i5 = -1100880860;
                    } else {
                        iM2761 = C0773.m3169("᩶ۖ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-28255)) ^ 2022595179;
                        i5 = -804777654;
                    }
                    break;
                case -639774059:
                case 939559398:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = C0619.m2761("ܿۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 1025) ^ 1492210475;
                        i5 = -1516806339;
                    } else {
                        iM2761 = (C0619.m2761("᩵۬") + i3) * 69;
                        i4 = ((iM2761 ^ i2) * 27271) ^ (-1399303831);
                        i5 = 933397592;
                    }
                    break;
                case -572519532:
                case 2078550650:
                    iM8879 = C2702.m8879(activityC0885.f3302);
                    if (C1519.m5403()) {
                        iM2761 = C0773.m3169("ۙ᩹") ^ i2;
                        i4 = ((iM2761 ^ i3) * 23825) ^ (-1480740088);
                        i5 = -280949084;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ۚ᩷")) * (-35);
                        i4 = ((iM2761 ^ i3) * (-7933)) ^ (-775433638);
                        i5 = 1545641591;
                    }
                    break;
                case -570060488:
                case 457006843:
                    activityC0885 = this.f25088;
                    if (C1564.m5509() <= 0) {
                        iM2761 = C0619.m2761("ܿۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 1025) ^ 1492210475;
                        i5 = -1516806339;
                    } else {
                        iM2761 = C0773.m3169("ۜۙ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-5145)) ^ 1528126071;
                        i5 = 1178654162;
                    }
                    break;
                case 50585845:
                case 2052140765:
                    return iM8879 + 1;
                case 925863629:
                case 2038544015:
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0619.m2761("ܿۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 1025) ^ 1492210475;
                        i5 = -1516806339;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ᩴ᩻")) * (-49);
                        i4 = ((iM2761 ^ i2) * (-2323)) ^ 2140076694;
                        i5 = -725671381;
                    }
                    break;
                case 1089722487:
                case 1250286698:
                    if (C0950.f3488 >= 0) {
                        iM2761 = (C0619.m2761("᩹᩸") + i3) * (-99);
                        i4 = ((iM2761 ^ i2) * 29641) ^ 1324238453;
                        i5 = -1079101001;
                    } else {
                        iM2761 = (C0773.m3169("ۛ᩷") + i2) * (-25);
                        i4 = ((iM2761 ^ i3) * (-22751)) ^ 347961041;
                        i5 = -840585229;
                    }
                    break;
                default:
                    if (C3099.m10097(activityC0885.f3302)) {
                        iM2761 = (i2 - C0619.m2761("᩶ۧ")) * (-37);
                        i4 = ((iM2761 ^ i3) * 19807) ^ 830100522;
                        i5 = -1100880860;
                    } else {
                        iM2761 = C0619.m2761("᩷᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-27447)) ^ 682934453;
                        i5 = -1378521152;
                    }
                    break;
            }
        }
    }
}
