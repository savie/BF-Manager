package l;

import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۫۠᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RP */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC12294 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܽۨ۠, reason: not valid java name and contains not printable characters */
    private static final short[] f41102 = {9783, 14462, 14460, 14443, 14454, 14441, 14454, 14443, 14438, 19076, 22938, 16643, -17052, 23870, -23372, 14457, 14454, 14449, 14459, 14409, 14454, 14458, 14440, 14429, 14438, 14422, 14459, 14391, 14385, 14385, 14385, 14390, 22602, -18306, -17312, -24091, -23088, 24326, -24447, 25147, 30668, 22788, -23404, 26880, 26708, 23301, -16768, -22377, -23627, 23266, -23462, 18491, -22372, 27029, -24441, -21852, 8495, -2680, -2562, -5978, -29209, -29206, -29194, -29202, -29209, 844, -30084, -30101, -30083, -30082, -30111, -30112, -30083, -30101, -6715, -9123, 5719, -3773, -4475, 1890, -333, -9043, -2447, -11099, -646, -155, 5660, -32687, -32676, -32704, -32680, -32687, 9559, -8731, -8718, -8732, -8729, -8712, -8711, -8732, -8718, -19088, -16570, -18226, 17986, -21439, -23963, 22865, 18303, 17165, 23488, -20214, -17790, -19471, -29948, -23659, -28894, 20987, -30114, 3729, -31936, -5693, 36, -6266, -9465, 804, -12990, -4501, -13140, 7491, -11840, 7102, 6084, -5010, 2070, -10980, -31882, -31934, -31932, -31913, -31912, -31931, -31910, -31913, -31934, -31905, -31911, -31912, -31890, -31931, -31917, -31934, -31886, -31933, -31932, -31913, -31934, -31905, -31911, -31912, -31970, -31976, -31976, -31976, -31969, -1128, 4315, 6230, -10591, 593, -9729, 4500, -6941, 7834, -9116, -9292, 8145, -2737, 3503, -6429, -4446, 6773, 2812};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Button f41103;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final TextInputLayout f41104;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final View f41105;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final TextView f41106;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final View f41107;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final byte[] f41108;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TextInputLayout f41109;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f41110;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C8391 f41111;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19356 f41112;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Button f41113;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f41114;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r34v1 */
    /* JADX WARN: Type inference failed for: r34v10 */
    /* JADX WARN: Type inference failed for: r34v11 */
    /* JADX WARN: Type inference failed for: r34v15 */
    /* JADX WARN: Type inference failed for: r34v17 */
    /* JADX WARN: Type inference failed for: r34v18 */
    /* JADX WARN: Type inference failed for: r34v2 */
    /* JADX WARN: Type inference failed for: r34v21 */
    /* JADX WARN: Type inference failed for: r34v22 */
    /* JADX WARN: Type inference failed for: r34v23 */
    /* JADX WARN: Type inference failed for: r34v24 */
    /* JADX WARN: Type inference failed for: r34v26 */
    /* JADX WARN: Type inference failed for: r34v27 */
    /* JADX WARN: Type inference failed for: r34v28 */
    /* JADX WARN: Type inference failed for: r34v29 */
    /* JADX WARN: Type inference failed for: r34v3 */
    /* JADX WARN: Type inference failed for: r34v30 */
    /* JADX WARN: Type inference failed for: r34v31 */
    /* JADX WARN: Type inference failed for: r34v32 */
    /* JADX WARN: Type inference failed for: r34v33 */
    /* JADX WARN: Type inference failed for: r34v34 */
    /* JADX WARN: Type inference failed for: r34v35 */
    /* JADX WARN: Type inference failed for: r34v36 */
    /* JADX WARN: Type inference failed for: r34v37 */
    /* JADX WARN: Type inference failed for: r34v38 */
    /* JADX WARN: Type inference failed for: r34v4 */
    /* JADX WARN: Type inference failed for: r34v6 */
    /* JADX WARN: Type inference failed for: r34v7 */
    /* JADX WARN: Type inference failed for: r34v8 */
    /* JADX WARN: Type inference failed for: r34v9 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [boolean, int] */
    public ViewOnClickListenerC12294(AbstractActivityC12483 abstractActivityC12483, C8391 c8391, byte[] bArr, String str) {
        int iM11306;
        int i;
        short[] sArr;
        int i2;
        ?? r4;
        ?? r34;
        int i3;
        int i4;
        ?? r35;
        Button button;
        int i5;
        boolean z;
        String str2;
        int iM45029;
        int i6;
        int i7;
        ?? r36;
        View viewM8167;
        ?? r37;
        boolean z2;
        View view;
        int iM450210;
        int i8;
        int iM11307;
        int i9;
        ?? r38;
        Button button2;
        int iM450211;
        int i10;
        int i11;
        int i12;
        Button button3;
        ?? r5;
        ?? r39;
        ?? r310;
        ?? r311;
        ViewOnClickListenerC12294 viewOnClickListenerC12294 = this;
        AbstractActivityC12483 abstractActivityC12484 = abstractActivityC12483;
        int i13 = -1765293598;
        int i14 = C1398.f5802;
        int i15 = C2477.f9839;
        short s = f41102[0];
        int i16 = (s * s) + 70913241;
        int i17 = s + 8421;
        int i18 = (i17 * i17) - (i16 + i16) <= 0 ? 14367 : 53637;
        C2704.m8238(abstractActivityC12484, C3535.m10423(f41102, 1, 8, i18));
        int iM450212 = (C19806.m45029("ܳۖ") ^ i15) * (-73);
        int i19 = ((iM450212 ^ i14) * (-24789)) ^ 1058236033;
        View view2 = null;
        TextInputLayout textInputLayout = null;
        Button button4 = null;
        DialogInterfaceC19356 dialogInterfaceC19356M5514 = null;
        RunnableC4114 runnableC4114 = null;
        String strM1429 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        boolean z3 = false;
        int i20 = 0;
        int iM450213 = 0;
        int iM450214 = 0;
        int iM11308 = 0;
        int iM11309 = 0;
        int i21 = 0;
        int i22 = 0;
        ViewOnClickListenerC19680 viewOnClickListenerC19680 = null;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = iM450212 ^ (-1570680474);
        View viewM10957 = null;
        View view3 = null;
        View viewM8168 = null;
        View viewM8169 = null;
        Object[] objArr = null;
        int i30 = 0;
        View viewM4976 = null;
        String str3 = null;
        TextInputLayout textInputLayout2 = null;
        Button button5 = null;
        int i31 = 0;
        int iM450215 = 0;
        while (true) {
            i13 = i29 ^ (i19 & (((i13 ^ i14) * 21999) >> 31));
            switch (i13) {
                case -2143093125:
                case -235888784:
                    ?? r312 = i30;
                    i22 = i22;
                    sArr6 = sArr6;
                    button4 = button4;
                    boolean z4 = z3 ? 1 : 0;
                    short[] sArr8 = sArr2;
                    int i32 = i23;
                    int iM113010 = ThreadFactoryC3888.m11306(C1937.m6288(sArr8, i32, 3, i18)) ^ 2125955328;
                    int iM450216 = C19806.m45029("ܶۤ") ^ i14;
                    sArr2 = sArr8;
                    i23 = i32;
                    i27 = i27;
                    i24 = i24;
                    r4 = r312 == true ? 1 : 0;
                    sArr5 = sArr5;
                    sArr4 = sArr4;
                    i26 = i26;
                    sArr3 = sArr3;
                    i29 = iM450216 ^ (-343419549);
                    i19 = ((iM450216 ^ i15) * (-8505)) ^ (-222502147);
                    iM450215 = iM450215;
                    z3 = z4 ? 1 : 0;
                    i20 = iM113010;
                    button4 = button4;
                    r5 = r4;
                    sArr6 = sArr6;
                    i30 = r5;
                    i22 = i22;
                    break;
                case -2069231271:
                case 770333666:
                    C19328.m44316(textInputLayout2);
                    C8067 c8067M3751 = C0962.m3751(abstractActivityC12483);
                    C2871.m8638(c8067M3751, viewM4976);
                    ThreadFactoryC3888.m11299(c8067M3751, z3);
                    dialogInterfaceC19356M5514 = CallableC1627.m5514(c8067M3751);
                    viewOnClickListenerC12294.f41112 = dialogInterfaceC19356M5514;
                    runnableC4114 = new RunnableC4114(i30, viewOnClickListenerC12294);
                    iM11306 = ThreadFactoryC3888.m11306("۠ۤ") ^ i14;
                    i19 = ((iM11306 ^ i15) * 17365) ^ (-1092432933);
                    i = -305379886;
                    i29 = iM11306 ^ i;
                    break;
                case -1976445533:
                case 310191753:
                    ?? r313 = i30;
                    i20 = i20;
                    iM450215 = iM450215;
                    i22 = i22;
                    sArr6 = sArr6;
                    button4 = button4;
                    short[] sArr9 = sArr3;
                    int i33 = i24;
                    sArr = sArr4;
                    i2 = i26;
                    short[] sArr10 = sArr5;
                    int i34 = i27;
                    z3 = z3 ? 1 : 0;
                    C1668.m5572(viewOnClickListenerC19680.f63187);
                    sArr2 = f41102;
                    i23 = 9;
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        int iM113011 = ThreadFactoryC3888.m11306("֡ۙ") ^ i14;
                        i27 = i34;
                        i24 = i33;
                        sArr5 = sArr10;
                        sArr4 = sArr;
                        i26 = i2;
                        sArr3 = sArr9;
                        i19 = ((iM113011 ^ i15) * 25327) ^ 1664120590;
                        iM450215 = iM450215;
                        i29 = iM113011 ^ (-1420329250);
                        r34 = r313;
                        i20 = i20;
                        r37 = r34;
                        z3 = z3;
                        r4 = r37;
                        button4 = button4;
                        r5 = r4;
                        sArr6 = sArr6;
                        i30 = r5;
                        i22 = i22;
                    } else {
                        i27 = i34;
                        i24 = i33;
                        z3 = z3 ? 1 : 0;
                        sArr5 = sArr10;
                        sArr3 = sArr9;
                        r38 = r313;
                        int iM450217 = (C19806.m45029("֨ۖ") ^ i14) * (-5);
                        i19 = ((iM450217 ^ i15) * (-19581)) ^ (-1982503961);
                        i29 = iM450217 ^ 1310753812;
                        iM450215 = iM450215;
                        button4 = button4;
                        sArr4 = sArr;
                        i26 = i2;
                        i20 = i20;
                        r35 = r38;
                        sArr6 = sArr6;
                        i30 = r35;
                        i22 = i22;
                    }
                    break;
                case -1960842237:
                case -983704722:
                    i22 = i22;
                    sArr6 = sArr6;
                    button2 = button4;
                    z = z3 ? 1 : 0;
                    viewM8169 = C2642.m8167(viewM4976, iM11308 ^ 2117333236);
                    if (C2477.f9839 > 0) {
                        iM450211 = (C19806.m45029("ۛ᩵") + i14) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i10 = ((iM450211 ^ i15) * (-27233)) ^ (-465417361);
                        i11 = -464886446;
                        int i35 = iM450211 ^ i11;
                        sArr6 = sArr6;
                        i22 = i22;
                        int i36 = i10;
                        i29 = i35;
                        z3 = z;
                        button4 = button2;
                        i19 = i36;
                    } else {
                        button = button2;
                        str2 = str3;
                        i5 = i25;
                        r310 = i30;
                        iM45029 = (i15 - ThreadFactoryC3888.m11306("ܺܽ")) * 7;
                        i6 = ((iM45029 ^ i14) * 6509) ^ (-749329300);
                        i7 = 1163549106;
                        r39 = r310;
                        i27 = i27;
                        i25 = i5;
                        str3 = str2;
                        sArr5 = sArr5;
                        sArr4 = sArr4;
                        i26 = i26;
                        strM1429 = strM1429;
                        i19 = i6;
                        z3 = z;
                        i29 = iM45029 ^ i7;
                        button4 = button;
                        r5 = r39;
                        sArr6 = sArr6;
                        i30 = r5;
                        i22 = i22;
                    }
                    break;
                case -1948976385:
                case -29971729:
                    i22 = i22;
                    sArr6 = sArr6;
                    button4 = button4;
                    z2 = z3 ? 1 : 0;
                    View viewM81610 = C2642.m8167(viewM4976, iM450214 ^ 2121648541);
                    C1937.m6286(viewM81610, str3);
                    textInputLayout2 = (TextInputLayout) viewM81610;
                    iM11307 = (i14 - C19806.m45029("۟ۖ")) * (-15);
                    i19 = 918889395 ^ ((iM11307 ^ i15) * 289);
                    i9 = 1115224739;
                    i29 = i9 ^ iM11307;
                    z3 = z2;
                    r4 = i30;
                    button4 = button4;
                    r5 = r4;
                    sArr6 = sArr6;
                    i30 = r5;
                    i22 = i22;
                    break;
                case -1929979747:
                case -565774105:
                    i22 = i22;
                    sArr6 = sArr6;
                    button4 = button4;
                    z2 = z3 ? 1 : 0;
                    view = viewM8168;
                    C7105.m18988(view, str3);
                    viewOnClickListenerC12294.f41106 = (TextView) view;
                    if (RunnableC1606.m5473() != 0) {
                        iM450210 = (ThreadFactoryC3888.m11306("ۙۛ") + i14) * 101;
                        i19 = ((iM450210 ^ i15) * 27331) ^ 427923495;
                        i8 = -989564906;
                    } else {
                        iM450210 = (C19806.m45029("ܺۨ") + i14) * (-119);
                        i19 = ((iM450210 ^ i15) * (-31971)) ^ (-6536966);
                        i8 = 1718848027;
                    }
                    i29 = iM450210 ^ i8;
                    viewM8168 = view;
                    z3 = z2;
                    r4 = i30;
                    button4 = button4;
                    r5 = r4;
                    sArr6 = sArr6;
                    i30 = r5;
                    i22 = i22;
                    break;
                case -1864202017:
                case 1049738624:
                    C0050.m946();
                    CallableC1627.m5507();
                    i22 = i22;
                    sArr6 = sArr6;
                    button = button4;
                    z = z3 ? 1 : 0;
                    str2 = str3;
                    i5 = i25;
                    r310 = i30;
                    iM45029 = (i15 - ThreadFactoryC3888.m11306("ܺܽ")) * 7;
                    i6 = ((iM45029 ^ i14) * 6509) ^ (-749329300);
                    i7 = 1163549106;
                    r39 = r310;
                    i27 = i27;
                    i25 = i5;
                    str3 = str2;
                    sArr5 = sArr5;
                    sArr4 = sArr4;
                    i26 = i26;
                    strM1429 = strM1429;
                    i19 = i6;
                    z3 = z;
                    i29 = iM45029 ^ i7;
                    button4 = button;
                    r5 = r39;
                    sArr6 = sArr6;
                    i30 = r5;
                    i22 = i22;
                    break;
                case -1802223563:
                case 984658221:
                    if (C2477.f9839 <= 0) {
                        r311 = i30;
                        i22 = i22;
                        sArr6 = sArr6;
                        button4 = button4;
                        sArr = sArr4;
                        i2 = i26;
                        r38 = r311;
                        int iM450218 = (C19806.m45029("֨ۖ") ^ i14) * (-5);
                        i19 = ((iM450218 ^ i15) * (-19581)) ^ (-1982503961);
                        i29 = iM450218 ^ 1310753812;
                        iM450215 = iM450215;
                        button4 = button4;
                        sArr4 = sArr;
                        i26 = i2;
                        i20 = i20;
                        r35 = r38;
                        sArr6 = sArr6;
                        i30 = r35;
                        i22 = i22;
                    } else {
                        button3 = button4;
                        int iM450219 = C19806.m45029("ܳۗ") ^ i14;
                        i12 = ((iM450219 ^ i15) * 31723) ^ (-213738430);
                        i29 = iM450219 ^ (-1141417178);
                        button4 = button3;
                        i19 = i12;
                    }
                    break;
                case -1789573216:
                case 1567169054:
                    i22 = i22;
                    sArr6 = sArr6;
                    button4 = button4;
                    z2 = z3 ? 1 : 0;
                    View viewM10958 = C3743.m10957(viewM4976, iM450213 ^ 2101487261);
                    C1937.m6286(viewM10958, str3);
                    int iM450220 = (C19806.m45029("ۧܿ") + i15) * (-17);
                    i19 = ((iM450220 ^ i14) * 28179) ^ 113920152;
                    i29 = iM450220 ^ (-358066967);
                    view2 = viewM10958;
                    z3 = z2;
                    r4 = i30;
                    button4 = button4;
                    r5 = r4;
                    sArr6 = sArr6;
                    i30 = r5;
                    i22 = i22;
                    break;
                case -1662222964:
                case -1488815531:
                    i22 = i22;
                    sArr6 = sArr6;
                    Button button6 = button4;
                    z2 = z3 ? 1 : 0;
                    button4 = button6;
                    iM11308 = ThreadFactoryC3888.m11306(C19806.m45020(f41102, 44, 3, i18));
                    iM11307 = C19806.m45029("ۤ֨") ^ i15;
                    i19 = (-780806426) ^ ((iM11307 ^ i14) * (-8211));
                    i9 = -1251211580;
                    i29 = i9 ^ iM11307;
                    z3 = z2;
                    r4 = i30;
                    button4 = button4;
                    r5 = r4;
                    sArr6 = sArr6;
                    i30 = r5;
                    i22 = i22;
                    break;
                case -1630862120:
                case 826355771:
                    i22 = i22;
                    sArr6 = sArr6;
                    button4 = button4;
                    z2 = z3 ? 1 : 0;
                    iM450213 = C19806.m45029(C1668.m5577(f41102, 38, 3, i18));
                    iM11307 = ThreadFactoryC3888.m11306("ۤۖ") ^ i15;
                    i19 = 2134891661 ^ ((iM11307 ^ i14) * (-8941));
                    i9 = 760791170;
                    i29 = i9 ^ iM11307;
                    z3 = z2;
                    r4 = i30;
                    button4 = button4;
                    r5 = r4;
                    sArr6 = sArr6;
                    i30 = r5;
                    i22 = i22;
                    break;
                case -1549300467:
                case 2057473470:
                    i22 = i22;
                    short[] sArr11 = sArr6;
                    Button button7 = button4;
                    boolean z5 = z3 ? 1 : 0;
                    viewOnClickListenerC12294.f41110 = abstractActivityC12484;
                    viewOnClickListenerC12294.f41111 = c8391;
                    viewOnClickListenerC12294.f41108 = bArr;
                    viewOnClickListenerC12294.f41114 = true;
                    ViewOnClickListenerC19680 viewOnClickListenerC19681 = c8391.f29134;
                    int iM450221 = (C19806.m45029("۫ۖ") ^ i15) * (-73);
                    abstractActivityC12484 = abstractActivityC12483;
                    viewOnClickListenerC19680 = viewOnClickListenerC19681;
                    i23 = i23;
                    i27 = i27;
                    i24 = i24;
                    z3 = z5 ? 1 : 0;
                    sArr5 = sArr5;
                    sArr4 = sArr4;
                    i26 = i26;
                    sArr3 = sArr3;
                    i29 = iM450221 ^ 330660730;
                    i19 = ((iM450221 ^ i14) * (-3317)) ^ 24523184;
                    iM450215 = iM450215;
                    button4 = button7;
                    viewOnClickListenerC12294 = this;
                    i20 = i20;
                    sArr6 = sArr11;
                    i30 = 1;
                    i22 = i22;
                    break;
                case -1538501362:
                case 1711771027:
                    i22 = i22;
                    sArr6 = sArr6;
                    button4 = button4;
                    z2 = z3 ? 1 : 0;
                    textInputLayout = (TextInputLayout) view2;
                    viewOnClickListenerC12294.f41109 = textInputLayout;
                    iM450214 = C19806.m45029(C3743.m10964(f41102, 41, 3, i18));
                    if (C3577.f13150 < 0) {
                        iM11307 = C19806.m45029("ۙܺ") ^ i14;
                        i19 = 1280811046 ^ ((iM11307 ^ i15) * 16707);
                        i9 = -719108973;
                        i29 = i9 ^ iM11307;
                        z3 = z2;
                        r4 = i30;
                        button4 = button4;
                        r5 = r4;
                        sArr6 = sArr6;
                        i30 = r5;
                        i22 = i22;
                    } else {
                        view = viewM8168;
                        iM450210 = (ThreadFactoryC3888.m11306("ۙۛ") + i14) * 101;
                        i19 = ((iM450210 ^ i15) * 27331) ^ 427923495;
                        i8 = -989564906;
                        i29 = iM450210 ^ i8;
                        viewM8168 = view;
                        z3 = z2;
                        r4 = i30;
                        button4 = button4;
                        r5 = r4;
                        sArr6 = sArr6;
                        i30 = r5;
                        i22 = i22;
                    }
                    break;
                case -1501856035:
                case 1351750600:
                    View viewM10959 = C3743.m10957(viewM4976, iM11309 ^ i21);
                    C1937.m6286(viewM10959, str3);
                    Button button8 = (Button) viewM10959;
                    viewOnClickListenerC12294.f41103 = button8;
                    button3 = button4;
                    C1937.m6291(button3, viewOnClickListenerC12294);
                    C1937.m6291(button8, viewOnClickListenerC12294);
                    if (C1066.m4023() <= 0) {
                        button5 = button8;
                        int iM4502110 = C19806.m45029("ܳۗ") ^ i14;
                        i12 = ((iM4502110 ^ i15) * 31723) ^ (-213738430);
                        i29 = iM4502110 ^ (-1141417178);
                        button4 = button3;
                        i19 = i12;
                    } else {
                        int iM450222 = (C19806.m45029("ۤ֡") + i14) * 89;
                        button5 = button8;
                        i29 = iM450222 ^ 1389977423;
                        i19 = ((iM450222 ^ i15) * (-6287)) ^ (-1206200907);
                        z3 = z3 ? 1 : 0 ? 1 : 0;
                        button4 = button3;
                    }
                    break;
                case -1283687219:
                case -742978532:
                    r36 = i30;
                    i22 = i22;
                    sArr6 = sArr6;
                    button4 = button4;
                    z3 = z3 ? 1 : 0;
                    viewM8167 = C2642.m8167(viewM4976, C19806.m45029(strM1429) ^ 2121510304);
                    C7105.m18988(viewM8167, str3);
                    int iM450223 = (C19806.m45029("ܿۘ") ^ i14) * 57;
                    viewM8168 = viewM8168;
                    sArr5 = sArr5;
                    i27 = i27;
                    i29 = iM450223 ^ (-1179717921);
                    i19 = ((iM450223 ^ i15) * 10541) ^ (-1692417165);
                    view3 = viewM8167;
                    r37 = r36;
                    z3 = z3;
                    r4 = r37;
                    button4 = button4;
                    r5 = r4;
                    sArr6 = sArr6;
                    i30 = r5;
                    i22 = i22;
                    break;
                case -1112616984:
                case 1099727573:
                    textInputLayout.setHelperText(C1875.m6104(abstractActivityC12484, C19806.m45029(C1025.m3859(sArr7, i31, 3, i18)) ^ 2102053108, objArr));
                    C19328.m44316(textInputLayout);
                    if (AbstractC0464.f2088 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ᩷") ^ i15;
                        i19 = ((iM11306 ^ i14) * 23247) ^ 1045044098;
                        i = -191348269;
                        i29 = iM11306 ^ i;
                    } else {
                        i22 = i22;
                        sArr6 = sArr6;
                        button = button4;
                        z = z3 ? 1 : 0;
                        str2 = str3;
                        i5 = i25;
                        r310 = i30;
                        iM45029 = (i15 - ThreadFactoryC3888.m11306("ܺܽ")) * 7;
                        i6 = ((iM45029 ^ i14) * 6509) ^ (-749329300);
                        i7 = 1163549106;
                        r39 = r310;
                        i27 = i27;
                        i25 = i5;
                        str3 = str2;
                        sArr5 = sArr5;
                        sArr4 = sArr4;
                        i26 = i26;
                        strM1429 = strM1429;
                        i19 = i6;
                        z3 = z;
                        i29 = iM45029 ^ i7;
                        button4 = button;
                        r5 = r39;
                        sArr6 = sArr6;
                        i30 = r5;
                        i22 = i22;
                    }
                    break;
                case -1064171792:
                case -949371354:
                    ?? r314 = i30;
                    i20 = i20;
                    i22 = i22;
                    sArr6 = sArr6;
                    button4 = button4;
                    sArr = sArr4;
                    i2 = i26;
                    short[] sArr12 = sArr5;
                    int i37 = i27;
                    z3 = z3 ? 1 : 0;
                    int i38 = iM450215;
                    viewM4976 = C1419.m4976(abstractActivityC12484, i20);
                    sArr3 = f41102;
                    i24 = 12;
                    if (AbstractC0464.f2088 > 0) {
                        int iM450224 = C19806.m45029("۫ۘ") ^ i15;
                        int i39 = ((iM450224 ^ i14) * 4645) ^ 564485005;
                        i29 = iM450224 ^ 1893914284;
                        i27 = i37;
                        iM450215 = i38;
                        sArr5 = sArr12;
                        sArr4 = sArr;
                        i26 = i2;
                        i19 = i39;
                        r34 = r314;
                        i20 = i20;
                        r37 = r34;
                        z3 = z3;
                        r4 = r37;
                        button4 = button4;
                        r5 = r4;
                        sArr6 = sArr6;
                        i30 = r5;
                        i22 = i22;
                    } else {
                        iM450215 = i38;
                        i27 = i37;
                        z3 = z3 ? 1 : 0;
                        sArr5 = sArr12;
                        r38 = r314;
                        int iM4502111 = (C19806.m45029("֨ۖ") ^ i14) * (-5);
                        i19 = ((iM4502111 ^ i15) * (-19581)) ^ (-1982503961);
                        i29 = iM4502111 ^ 1310753812;
                        iM450215 = iM450215;
                        button4 = button4;
                        sArr4 = sArr;
                        i26 = i2;
                        i20 = i20;
                        r35 = r38;
                        sArr6 = sArr6;
                        i30 = r35;
                        i22 = i22;
                    }
                    break;
                case -958813141:
                case -126446381:
                    C8875.m23020(dialogInterfaceC19356M5514, ThreadFactoryC3888.m11306(C7105.m18989(f41102, 53, 3, i18)) ^ 2119639990, runnableC4114);
                    return;
                case -785178350:
                case -209537228:
                    ?? r315 = i30;
                    i22 = i22;
                    sArr6 = sArr6;
                    button = button4;
                    i5 = i25;
                    int i40 = i26;
                    sArr5 = sArr5;
                    i27 = i27;
                    z = z3 ? 1 : 0;
                    short[] sArr13 = sArr4;
                    String strM6288 = C1937.m6288(sArr13, i5, i40, i18);
                    sArr4 = sArr13;
                    View view4 = viewM10957;
                    C7105.m18988(view4, strM6288);
                    viewOnClickListenerC12294.f41105 = view4;
                    i26 = i40;
                    str2 = strM6288;
                    strM1429 = RunnableC0195.m1429(f41102, 32, 3, i18);
                    r310 = r315;
                    if (C3722.m10894() <= 0) {
                        iM45029 = (i15 - ThreadFactoryC3888.m11306("ܺܽ")) * 7;
                        i6 = ((iM45029 ^ i14) * 6509) ^ (-749329300);
                        i7 = 1163549106;
                        r39 = r310;
                    } else {
                        iM45029 = C19806.m45029("ᩴۘ") ^ i15;
                        i6 = ((iM45029 ^ i14) * (-1727)) ^ 1936242278;
                        i7 = -1018281785;
                        r39 = r315;
                    }
                    i27 = i27;
                    i25 = i5;
                    str3 = str2;
                    sArr5 = sArr5;
                    sArr4 = sArr4;
                    i26 = i26;
                    strM1429 = strM1429;
                    i19 = i6;
                    z3 = z;
                    i29 = iM45029 ^ i7;
                    button4 = button;
                    r5 = r39;
                    sArr6 = sArr6;
                    i30 = r5;
                    i22 = i22;
                    break;
                case -730487414:
                case 779432379:
                    ?? r316 = i30;
                    viewM8167 = view3;
                    i22 = i22;
                    sArr6 = sArr6;
                    button4 = button4;
                    z3 = z3 ? 1 : 0;
                    View view5 = viewM8168;
                    viewOnClickListenerC12294.f41107 = viewM8167;
                    sArr5 = f41102;
                    i27 = 35;
                    i28 = 3;
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        viewM8168 = view5;
                        view3 = viewM8167;
                        z3 = z3 ? 1 : 0;
                        r311 = r316;
                        sArr = sArr4;
                        i2 = i26;
                        r38 = r311;
                        int iM4502112 = (C19806.m45029("֨ۖ") ^ i14) * (-5);
                        i19 = ((iM4502112 ^ i15) * (-19581)) ^ (-1982503961);
                        i29 = iM4502112 ^ 1310753812;
                        iM450215 = iM450215;
                        button4 = button4;
                        sArr4 = sArr;
                        i26 = i2;
                        i20 = i20;
                        r35 = r38;
                        sArr6 = sArr6;
                        i30 = r35;
                        i22 = i22;
                    } else {
                        int iM450225 = (C19806.m45029("ۚۖ") ^ i14) * (-39);
                        i19 = ((iM450225 ^ i15) * 30885) ^ 1671408500;
                        i29 = iM450225 ^ 945069324;
                        viewM8168 = view5;
                        r36 = r316;
                        view3 = viewM8167;
                        r37 = r36;
                        z3 = z3;
                        r4 = r37;
                        button4 = button4;
                        r5 = r4;
                        sArr6 = sArr6;
                        i30 = r5;
                        i22 = i22;
                    }
                    break;
                case -527682475:
                case 1194281357:
                    boolean z6 = z3 ? 1 : 0;
                    View view6 = viewM8169;
                    C7105.m18988(view6, str3);
                    Button button9 = (Button) view6;
                    viewOnClickListenerC12294.f41113 = button9;
                    sArr6 = f41102;
                    i22 = 47;
                    int iM450226 = (i14 - C19806.m45029("᩹᩻")) * q.h;
                    i12 = ((iM450226 ^ i15) * 13097) ^ (-1098468053);
                    viewM8169 = view6;
                    z3 = z6 ? 1 : 0;
                    button4 = button9;
                    i29 = iM450226 ^ 1811450279;
                    i19 = i12;
                    break;
                case -462464748:
                case 13831439:
                    short[] sArr14 = sArr3;
                    int i41 = i24;
                    iM450215 = C19806.m45029(C1419.m4969(sArr14, i41, 3, i18)) ^ 2097933440;
                    int iM450227 = (C19806.m45029("ۗۡ") + i15) * 115;
                    i3 = ((iM450227 ^ i14) * 21049) ^ (-565024028);
                    i4 = iM450227 ^ 704022596;
                    i24 = i41;
                    i27 = i27;
                    sArr5 = sArr5;
                    sArr4 = sArr4;
                    i26 = i26;
                    sArr3 = sArr14;
                    i29 = i4;
                    i19 = i3;
                    r37 = i30;
                    z3 = z3;
                    r4 = r37;
                    button4 = button4;
                    r5 = r4;
                    sArr6 = sArr6;
                    i30 = r5;
                    i22 = i22;
                    break;
                case -238502107:
                case 1335819340:
                    r35 = i30;
                    i22 = i22;
                    sArr6 = sArr6;
                    Button button10 = button4;
                    boolean z7 = z3 ? 1 : 0;
                    int i42 = iM450215;
                    viewM10957 = C3743.m10957(viewM4976, i42);
                    sArr4 = f41102;
                    i25 = 15;
                    i26 = 17;
                    int iM450228 = C19806.m45029("ᩳ֡") ^ i14;
                    iM450215 = i42;
                    i27 = i27;
                    z3 = z7 ? 1 : 0;
                    sArr5 = sArr5;
                    i19 = ((iM450228 ^ i15) * (-12417)) ^ (-1645764411);
                    button4 = button10;
                    i29 = iM450228 ^ (-661341369);
                    sArr6 = sArr6;
                    i30 = r35;
                    i22 = i22;
                    break;
                case -39377590:
                case 1816473928:
                    button2 = button4;
                    z = z3 ? 1 : 0;
                    i22 = i22;
                    short[] sArr15 = sArr6;
                    iM11309 = ThreadFactoryC3888.m11306(C2871.m8640(sArr15, i22, 3, i18));
                    i21 = 2101070782;
                    iM450211 = (i15 - ThreadFactoryC3888.m11306("᩻ۙ")) * 47;
                    sArr6 = sArr15;
                    i10 = ((iM450211 ^ i14) * (-593)) ^ (-860491050);
                    i11 = 1041445645;
                    int i310 = iM450211 ^ i11;
                    sArr6 = sArr6;
                    i22 = i22;
                    int i311 = i10;
                    i29 = i310;
                    z3 = z;
                    button4 = button2;
                    i19 = i311;
                    break;
                case 607066723:
                case 1409975327:
                    AbstractC0464.m2313();
                    throw new RuntimeException();
                case 1001803109:
                case 1154846974:
                    TextInputLayout textInputLayout3 = textInputLayout2;
                    i22 = i22;
                    sArr6 = sArr6;
                    button4 = button4;
                    viewOnClickListenerC12294.f41104 = textInputLayout3;
                    textInputLayout3.setEndIconVisible(false);
                    textInputLayout3.setEndIconMode(i30);
                    if (C2249.f8050 >= 0) {
                        textInputLayout2 = textInputLayout3;
                        r38 = i30;
                        i20 = i20;
                        iM450215 = iM450215;
                        sArr = sArr4;
                        i2 = i26;
                        z3 = false;
                        int iM4502113 = (C19806.m45029("֨ۖ") ^ i14) * (-5);
                        i19 = ((iM4502113 ^ i15) * (-19581)) ^ (-1982503961);
                        i29 = iM4502113 ^ 1310753812;
                        iM450215 = iM450215;
                        button4 = button4;
                        sArr4 = sArr;
                        i26 = i2;
                        i20 = i20;
                        r35 = r38;
                        sArr6 = sArr6;
                        i30 = r35;
                        i22 = i22;
                    } else {
                        int iM113012 = (ThreadFactoryC3888.m11306("ۜ۬") ^ i15) * 59;
                        int i43 = ((iM113012 ^ i14) * (-15095)) ^ (-2033771658);
                        int i44 = iM113012 ^ 2084337247;
                        textInputLayout2 = textInputLayout3;
                        button4 = button4;
                        z3 = false;
                        sArr6 = sArr6;
                        i22 = i22;
                        i19 = i43;
                        i29 = i44;
                    }
                    break;
                case 1349747794:
                case 1476148629:
                    short[] sArr16 = sArr5;
                    int i45 = i27;
                    int i46 = i28;
                    viewM8168 = C2642.m8167(viewM4976, C19806.m45029(C1461.m5070(sArr16, i45, i46, i18)) ^ 2103410837);
                    int iM113013 = ThreadFactoryC3888.m11306("ܺۖ") ^ i15;
                    i3 = ((iM113013 ^ i14) * (-23911)) ^ (-1607342387);
                    i4 = iM113013 ^ (-1367926571);
                    sArr5 = sArr16;
                    i27 = i45;
                    i28 = i46;
                    i29 = i4;
                    i19 = i3;
                    r37 = i30;
                    z3 = z3;
                    r4 = r37;
                    button4 = button4;
                    r5 = r4;
                    sArr6 = sArr6;
                    i30 = r5;
                    i22 = i22;
                    break;
                case 1621167016:
                case 1745534105:
                    C0216.m1591();
                    if (C1419.f5860 < 0) {
                        button3 = button4;
                        int iM4502114 = C19806.m45029("ܳۗ") ^ i14;
                        i12 = ((iM4502114 ^ i15) * 31723) ^ (-213738430);
                        i29 = iM4502114 ^ (-1141417178);
                        button4 = button3;
                        i19 = i12;
                    } else {
                        i22 = i22;
                        sArr6 = sArr6;
                        button = button4;
                        z = z3 ? 1 : 0;
                        str2 = str3;
                        i5 = i25;
                        r310 = i30;
                        iM45029 = (i15 - ThreadFactoryC3888.m11306("ܺܽ")) * 7;
                        i6 = ((iM45029 ^ i14) * 6509) ^ (-749329300);
                        i7 = 1163549106;
                        r39 = r310;
                        i27 = i27;
                        i25 = i5;
                        str3 = str2;
                        sArr5 = sArr5;
                        sArr4 = sArr4;
                        i26 = i26;
                        strM1429 = strM1429;
                        i19 = i6;
                        z3 = z;
                        i29 = iM45029 ^ i7;
                        button4 = button;
                        r5 = r39;
                        sArr6 = sArr6;
                        i30 = r5;
                        i22 = i22;
                    }
                    break;
                case 1723132149:
                case 1960790463:
                    C1189.m4368();
                    if (!C0629.m2907()) {
                        i22 = i22;
                        sArr6 = sArr6;
                        button = button4;
                        z = z3 ? 1 : 0;
                        str2 = str3;
                        i5 = i25;
                        r310 = i30;
                        iM45029 = (i15 - ThreadFactoryC3888.m11306("ܺܽ")) * 7;
                        i6 = ((iM45029 ^ i14) * 6509) ^ (-749329300);
                        i7 = 1163549106;
                        r39 = r310;
                        i27 = i27;
                        i25 = i5;
                        str3 = str2;
                        sArr5 = sArr5;
                        sArr4 = sArr4;
                        i26 = i26;
                        strM1429 = strM1429;
                        i19 = i6;
                        z3 = z;
                        i29 = iM45029 ^ i7;
                        button4 = button;
                        r5 = r39;
                        sArr6 = sArr6;
                        i30 = r5;
                        i22 = i22;
                    } else {
                        iM11306 = C19806.m45029("᩶֡") ^ i15;
                        i19 = ((iM11306 ^ i14) * (-20753)) ^ (-1622902087);
                        i = 278082733;
                        i29 = iM11306 ^ i;
                    }
                    break;
                default:
                    C9682.m24639(button5);
                    textInputLayout.setHelperTextEnabled(i30);
                    textInputLayout.setHelperTextColor(ColorStateList.valueOf(C20368.f65973));
                    objArr = new Object[i30];
                    objArr[z3 ? 1 : 0] = str;
                    sArr7 = f41102;
                    i31 = 50;
                    iM11306 = ThreadFactoryC3888.m11306("ܰۙ") ^ i15;
                    i19 = ((iM11306 ^ i14) * (-21509)) ^ (-571438237);
                    i = -845206353;
                    i29 = iM11306 ^ i;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m30546(ViewOnClickListenerC12294 viewOnClickListenerC12294) {
        DialogInterfaceC19356 dialogInterfaceC19356 = null;
        int i = -1263365463;
        int i2 = C1189.f5284;
        int i3 = C0629.f2722;
        int iM45029 = C19806.m45029("ۗۖ") ^ i3;
        int i4 = ((iM45029 ^ i2) * (-28069)) ^ 621764197;
        int i5 = 673397133;
        while (true) {
            i = ((((i ^ i2) * 9239) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1941195836:
                case 1371204874:
                    if (!C1977.m6356()) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ֨") ^ i2;
                        i4 = ((iM45029 ^ i3) * 15359) ^ (-803799198);
                        i5 = -898924342;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛᩳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 29337) ^ (-964639169);
                        i5 = 2039815026;
                    }
                    break;
                case -1937719682:
                case 2138129700:
                    if (RunnableC1564.f6300) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ֨") ^ i2;
                        i4 = ((iM45029 ^ i3) * 15359) ^ (-803799198);
                        i5 = -898924342;
                    } else {
                        iM45029 = C19806.m45029("ۧܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-8721)) ^ (-2136340873);
                        i5 = 212096746;
                    }
                    break;
                case -1863953691:
                case -13387511:
                    if (C0050.f912 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛᩳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 29337) ^ (-964639169);
                        i5 = 2039815026;
                    } else {
                        iM45029 = C19806.m45029("᩻۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * 27465) ^ (-2094457603);
                        i5 = -1219976244;
                    }
                    break;
                case -1541125927:
                case -772375712:
                    if (C1025.f4800 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-12355)) ^ (-531941517);
                        i5 = -1624986636;
                    } else {
                        iM45029 = (C19806.m45029("᩻ܿ") + i2) * (-125);
                        i4 = ((iM45029 ^ i3) * (-28213)) ^ 441913186;
                        i5 = -775654525;
                    }
                    break;
                case -1484192123:
                case 974923308:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-12355)) ^ (-531941517);
                        i5 = -1624986636;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ۬") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-1533)) ^ 1082219971;
                        i5 = -526372028;
                    }
                    break;
                case -1472785182:
                case 1431436402:
                    if (C3577.m10565()) {
                        iM45029 = C19806.m45029("ۖ֫") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18523)) ^ (-1820469289);
                        i5 = -1405774830;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛᩳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 29337) ^ (-964639169);
                        i5 = 2039815026;
                    }
                    break;
                case -1171389586:
                case -497495892:
                    C1377.m4833();
                    if (C1977.f7413 <= 0) {
                        iM45029 = C19806.m45029("᩹ۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 21247) ^ 1316592758;
                        i5 = 429432318;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰۘ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 20121) ^ 288962311;
                        i5 = 8221954;
                    }
                    break;
                case -596379722:
                case 1253317761:
                    C1189.m4367(dialogInterfaceC19356);
                    if (C2477.f9839 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-12355)) ^ (-531941517);
                        i5 = -1624986636;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤۖ") ^ i3) * (-91);
                        i4 = ((iM45029 ^ i2) * (-16541)) ^ 1111036765;
                        i5 = 545223875;
                    }
                    break;
                case -427322459:
                case 498877653:
                    if (C1148.f5161 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-12355)) ^ (-531941517);
                        i5 = -1624986636;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ۟") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-1085)) ^ 635204624;
                        i5 = 695414222;
                    }
                    break;
                case -273779716:
                case 319963246:
                    C0629.m2907();
                    iM45029 = C19806.m45029("᩹ۗ") ^ i2;
                    i4 = ((iM45029 ^ i3) * 21247) ^ 1316592758;
                    i5 = 429432318;
                    break;
                case 533420807:
                case 1085198100:
                    if (C10634.f36300 >= 0) {
                        iM45029 = C19806.m45029("᩹ۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 21247) ^ 1316592758;
                        i5 = 429432318;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * 12237) ^ (-788898763);
                        i5 = 622099599;
                    }
                    break;
                case 939069325:
                case 1537837517:
                    viewOnClickListenerC12294.f41111.m22033();
                    break;
                case 994849686:
                case 1214054173:
                    dialogInterfaceC19356 = viewOnClickListenerC12294.f41112;
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛᩳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 29337) ^ (-964639169);
                        i5 = 2039815026;
                    } else {
                        iM45029 = C19806.m45029("ۧۙ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-7661)) ^ (-2088491627);
                        i5 = -1765673658;
                    }
                    break;
                case 1776098481:
                case 1927364530:
                    ThreadFactoryC3888.m11300();
                    break;
                case 1794778446:
                case 1827100340:
                    if (C0216.f1393 == 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ֨") ^ i2;
                        i4 = ((iM45029 ^ i3) * 15359) ^ (-803799198);
                        i5 = -898924342;
                    } else {
                        iM45029 = C19806.m45029("᩹ۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 21247) ^ 1316592758;
                        i5 = 429432318;
                    }
                    break;
                default:
                    if (C3660.f13403 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡᩵") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-12355)) ^ (-531941517);
                        i5 = -1624986636;
                    } else {
                        iM45029 = C19806.m45029("ᩴ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-32731)) ^ (-1322336406);
                        i5 = 1813896037;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00f5 A[PHI: r4 r5 r11 r12
      0x00f5: PHI (r4v4 android.view.View) = (r4v3 android.view.View), (r4v2 android.view.View), (r4v2 android.view.View) binds: [B:29:0x00f3, B:25:0x00cf, B:13:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x00f5: PHI (r5v4 android.animation.ObjectAnimator) = 
      (r5v2 android.animation.ObjectAnimator)
      (r5v3 android.animation.ObjectAnimator)
      (r5v2 android.animation.ObjectAnimator)
     binds: [B:29:0x00f3, B:25:0x00cf, B:13:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x00f5: PHI (r11v4 short[]) = (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:29:0x00f3, B:25:0x00cf, B:13:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x00f5: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:29:0x00f3, B:25:0x00cf, B:13:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0081, code lost:
    
        if (l.C19806.f63586 != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0086, code lost:
    
        if (l.ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) goto L7;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m30536() {
        /*
            Method dump skipped, instruction units count: 854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC12294.m30536():void");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0434 A[PHI: r2 r9 r16 r17 r18 r19 r24
      0x0434: PHI (r2v62 java.lang.String) = (r2v22 java.lang.String), (r2v23 java.lang.String), (r2v65 java.lang.String) binds: [B:100:0x0432, B:96:0x0410, B:49:0x01bf] A[DONT_GENERATE, DONT_INLINE]
      0x0434: PHI (r9v5 java.lang.String) = (r9v2 java.lang.String), (r9v2 java.lang.String), (r9v7 java.lang.String) binds: [B:100:0x0432, B:96:0x0410, B:49:0x01bf] A[DONT_GENERATE, DONT_INLINE]
      0x0434: PHI (r16v6 short) = (r16v2 short), (r16v3 short), (r16v2 short) binds: [B:100:0x0432, B:96:0x0410, B:49:0x01bf] A[DONT_GENERATE, DONT_INLINE]
      0x0434: PHI (r17v6 short[]) = (r17v3 short[]), (r17v2 short[]), (r17v2 short[]) binds: [B:100:0x0432, B:96:0x0410, B:49:0x01bf] A[DONT_GENERATE, DONT_INLINE]
      0x0434: PHI (r18v6 char) = (r18v3 char), (r18v2 char), (r18v2 char) binds: [B:100:0x0432, B:96:0x0410, B:49:0x01bf] A[DONT_GENERATE, DONT_INLINE]
      0x0434: PHI (r19v6 short) = (r19v2 short), (r19v3 short), (r19v2 short) binds: [B:100:0x0432, B:96:0x0410, B:49:0x01bf] A[DONT_GENERATE, DONT_INLINE]
      0x0434: PHI (r24v28 l.۠᩵᩺) = (r24v7 l.۠᩵᩺), (r24v8 l.۠᩵᩺), (r24v29 l.۠᩵᩺) binds: [B:100:0x0432, B:96:0x0410, B:49:0x01bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0228 A[PHI: r8 r12
      0x0228: PHI (r8v5 java.lang.String) = (r8v4 java.lang.String), (r8v2 java.lang.String), (r8v2 java.lang.String), (r8v2 java.lang.String) binds: [B:58:0x0226, B:22:0x00ba, B:137:0x0228, B:9:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r12v5 int) = (r12v2 int), (r12v4 int), (r12v2 int), (r12v2 int) binds: [B:58:0x0226, B:22:0x00ba, B:137:0x0228, B:9:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m30547(ViewOnClickListenerC12294 viewOnClickListenerC12294, C1313 c1313) {
        int iM45029;
        C8391 c8391;
        int i;
        C8391 c8392;
        C8391 c8393;
        int iM11306;
        int i2;
        int i3;
        int iM11307;
        int i4;
        int i5;
        int i6;
        int iM11308;
        int i7;
        ViewOnClickListenerC12294 viewOnClickListenerC12295 = viewOnClickListenerC12294;
        int i8 = C2477.f9839;
        int i9 = C3535.f13026;
        int iM450210 = C19806.m45029("۫ۙ") ^ i9;
        int i10 = ((iM450210 ^ i8) * (-17261)) ^ (-1773369234);
        TextInputLayout textInputLayout = null;
        C8391 c8394 = null;
        String strM5047 = null;
        short[] sArr = null;
        int i11 = iM450210 ^ (-2051542283);
        int i12 = 0;
        int iM6174 = 0;
        int iM11309 = 0;
        int i13 = 0;
        int i14 = 0;
        short s = 0;
        char c = 0;
        short s2 = 0;
        String strM26821 = null;
        int i15 = -1941921504;
        String strM18989 = null;
        short[] sArr2 = null;
        int iM113010 = 0;
        String strM189810 = null;
        TextInputLayout textInputLayout2 = null;
        while (true) {
            i15 = i11 ^ (i10 & (((i15 ^ i8) * 5259) >> 31));
            switch (i15) {
                case -2125245747:
                case 1288142119:
                    C3743.m10954(textInputLayout, C19806.m45029(strM189810) ^ 2101692531);
                    break;
                case -2081114564:
                case 436290625:
                    iM113010 = ThreadFactoryC3888.m11306(RunnableC1564.m5344(f41102, 116, 3, i13));
                    if (C1875.f7103 >= 0) {
                        iM11308 = (i9 - ThreadFactoryC3888.m11306("ܽᩳ")) * 123;
                        i2 = ((iM11308 ^ i8) * 11621) ^ 2081138556;
                        i7 = 328918187;
                    } else {
                        iM11308 = (ThreadFactoryC3888.m11306("ۚ۠") ^ i8) * 57;
                        i2 = ((iM11308 ^ i9) * (-3709)) ^ (-2011263340);
                        i7 = 157336535;
                    }
                    i11 = iM11308 ^ i7;
                    i10 = i2;
                    break;
                case -2054405577:
                case -1123024616:
                    textInputLayout2 = viewOnClickListenerC12295.f41104;
                    strM5047 = C1460.m5047(f41102, UMErrorCode.E_UM_BE_JSON_FAILED, 3, i13);
                    if (!C2332.f8260) {
                        int iM450211 = C19806.m45029("᩹ۜ") ^ i9;
                        i10 = ((iM450211 ^ i8) * (-5047)) ^ 378507048;
                        i11 = iM450211 ^ 1775211692;
                        viewOnClickListenerC12295 = viewOnClickListenerC12294;
                    } else {
                        iM11308 = C19806.m45029("ۚ֨") ^ i9;
                        i2 = ((iM11308 ^ i8) * (-6627)) ^ 1512829797;
                        i7 = -1218273152;
                        i11 = iM11308 ^ i7;
                        i10 = i2;
                    }
                    break;
                case -2011411095:
                case -489138191:
                    strM26821 = strM26821;
                    c8394 = c8394;
                    s2 = sArr2[c];
                    s = 8212;
                    if (C2871.f10837 >= 0) {
                        iM11307 = C19806.m45029("ۙ۟") ^ i9;
                        i4 = ((iM11307 ^ i8) * 16775) ^ 168906155;
                        i5 = -895156318;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("᩵ۧ") ^ i8;
                        i4 = ((iM11307 ^ i9) * (-11081)) ^ 97860741;
                        i5 = 582072548;
                    }
                    i6 = iM11307 ^ i5;
                    strM26821 = strM26821;
                    i10 = i4;
                    c8394 = c8394;
                    i11 = i6;
                    viewOnClickListenerC12295 = viewOnClickListenerC12294;
                    break;
                case -1790699365:
                case 491846225:
                    if (C2124.f7782 > 0) {
                        iM11308 = (i9 - ThreadFactoryC3888.m11306("ܽᩳ")) * 123;
                        i2 = ((iM11308 ^ i8) * 11621) ^ 2081138556;
                        i7 = 328918187;
                    } else {
                        iM11308 = (ThreadFactoryC3888.m11306("ۜۘ") ^ i8) * 77;
                        i2 = ((iM11308 ^ i9) * (-14143)) ^ (-1016824244);
                        i7 = -486548632;
                    }
                    i11 = iM11308 ^ i7;
                    i10 = i2;
                    break;
                case -1726219326:
                case 1792849918:
                    i13 = 56727;
                    iM11307 = ThreadFactoryC3888.m11306("ۖ֡") ^ i8;
                    i4 = ((iM11307 ^ i9) * 26775) ^ 487362467;
                    i5 = 1110912152;
                    i6 = iM11307 ^ i5;
                    strM26821 = strM26821;
                    i10 = i4;
                    c8394 = c8394;
                    i11 = i6;
                    viewOnClickListenerC12295 = viewOnClickListenerC12294;
                    break;
                case -1642596278:
                case 673163563:
                    if (iM6174 != 1601) {
                        iM11308 = (C19806.m45029("֨᩸") + i9) * 101;
                        i2 = ((iM11308 ^ i8) * 28175) ^ (-344564522);
                        i7 = 1345577335;
                    } else {
                        iM11308 = (C19806.m45029("ۛ᩻") + i8) * 15;
                        i2 = ((iM11308 ^ i9) * (-19219)) ^ 812877769;
                        i7 = -1109181221;
                    }
                    i11 = iM11308 ^ i7;
                    i10 = i2;
                    break;
                case -1421532393:
                case -394115439:
                    C3743.m10954(textInputLayout2, C19806.m45029(strM5047) ^ 2098712656);
                    break;
                case -1305153870:
                case 292948320:
                    C1189.m4367(viewOnClickListenerC12295.f41112);
                    C8391 c8395 = viewOnClickListenerC12295.f41111;
                    sArr = f41102;
                    if (C2124.f7782 > 0) {
                        iM45029 = C19806.m45029("ᩳ᩶") ^ i9;
                        c8391 = c8395;
                        i10 = ((iM45029 ^ i8) * 5963) ^ (-373980235);
                        i = 884950286;
                        int i16 = iM45029 ^ i;
                        c8394 = c8391;
                        i11 = i16;
                    } else {
                        c8394 = c8395;
                        int iM450212 = C19806.m45029("᩹ۜ") ^ i9;
                        i10 = ((iM450212 ^ i8) * (-5047)) ^ 378507048;
                        i11 = iM450212 ^ 1775211692;
                        viewOnClickListenerC12295 = viewOnClickListenerC12294;
                    }
                    break;
                case -1275130768:
                case 1072656180:
                    strM18989 = C7105.m18989(f41102, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 3, i13);
                    if (C2642.f10294 > 0) {
                        iM11308 = (ThreadFactoryC3888.m11306("۫ۖ") + i9) * (-17);
                        i2 = ((iM11308 ^ i8) * 5433) ^ (-2032918558);
                        i7 = -1260494728;
                        i11 = iM11308 ^ i7;
                        i10 = i2;
                    } else {
                        strM26821 = strM26821;
                        c8394 = c8394;
                        iM11307 = C19806.m45029("ۙ۟") ^ i9;
                        i4 = ((iM11307 ^ i8) * 16775) ^ 168906155;
                        i5 = -895156318;
                        i6 = iM11307 ^ i5;
                        strM26821 = strM26821;
                        i10 = i4;
                        c8394 = c8394;
                        i11 = i6;
                        viewOnClickListenerC12295 = viewOnClickListenerC12294;
                    }
                    break;
                case -1186373594:
                case 1431603750:
                    if (iM6174 != 1101) {
                        iM11308 = (i8 - ThreadFactoryC3888.m11306("ۘ۠")) * 65;
                        i2 = ((iM11308 ^ i9) * 8077) ^ 392332531;
                        i7 = -949927790;
                    } else {
                        iM11308 = (ThreadFactoryC3888.m11306("᩺ܰ") + i8) * (-107);
                        i2 = ((iM11308 ^ i9) * (-23279)) ^ (-87246049);
                        i7 = -1445525820;
                    }
                    i11 = iM11308 ^ i7;
                    i10 = i2;
                    break;
                case -1169857842:
                case -226846273:
                    CallableC1627.m5503(C0526.m2431(c1313, 2119555244 ^ iM113010));
                    break;
                case -1151703564:
                case -335917150:
                    if (iM6174 != 1200) {
                        iM11308 = (ThreadFactoryC3888.m11306("ۙܶ") + i9) * (-35);
                        i2 = ((iM11308 ^ i8) * (-23677)) ^ 663003559;
                        i7 = -869897081;
                    } else {
                        iM11308 = (ThreadFactoryC3888.m11306("ᩴ۟") ^ i8) * (-119);
                        i2 = ((iM11308 ^ i9) * 15103) ^ (-1678400671);
                        i7 = 1563057050;
                    }
                    i11 = iM11308 ^ i7;
                    i10 = i2;
                    break;
                case -1129247423:
                case -501062257:
                    c8394.m22030(ThreadFactoryC3888.m11306(RunnableC1564.m5344(sArr, i14, i12, i13)) ^ 2122591509);
                    break;
                case -911691698:
                case 1754139395:
                    C19328.m44318(textInputLayout, C0526.m2431(c1313, 2126209941 ^ iM11309));
                    break;
                case -631827548:
                case -1913497:
                    strM26821 = strM26821;
                    c8394 = c8394;
                    sArr2 = f41102;
                    c = '\\';
                    if (C1460.f5948 >= 0) {
                        iM11307 = C19806.m45029("ۙ۟") ^ i9;
                        i4 = ((iM11307 ^ i8) * 16775) ^ 168906155;
                        i5 = -895156318;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("᩹ܳ") + i9) * 109;
                        i4 = ((iM11307 ^ i8) * 28095) ^ 152760781;
                        i5 = 822231796;
                    }
                    i6 = iM11307 ^ i5;
                    strM26821 = strM26821;
                    i10 = i4;
                    c8394 = c8394;
                    i11 = i6;
                    viewOnClickListenerC12295 = viewOnClickListenerC12294;
                    break;
                case -564719460:
                case 1706016650:
                    C2788.m8472();
                    int iM450213 = C19806.m45029("᩹ۜ") ^ i9;
                    i10 = ((iM450213 ^ i8) * (-5047)) ^ 378507048;
                    i11 = iM450213 ^ 1775211692;
                    viewOnClickListenerC12295 = viewOnClickListenerC12294;
                    break;
                case -547205613:
                case -101565337:
                    strM26821 = strM26821;
                    c8394 = c8394;
                    CallableC1627.m5508(c1313, strM26821);
                    viewOnClickListenerC12294.m30536();
                    textInputLayout = viewOnClickListenerC12295.f41109;
                    if (RunnableC1564.m5342(c1313)) {
                        int iM113011 = ThreadFactoryC3888.m11306("ܶ֨") ^ i9;
                        strM26821 = strM26821;
                        c8394 = c8394;
                        i10 = ((iM113011 ^ i8) * 9771) ^ (-1942659053);
                        i11 = iM113011 ^ 1318506573;
                    } else {
                        iM11307 = (C19806.m45029("᩸ۢ") ^ i8) * (-69);
                        i4 = ((iM11307 ^ i9) * 28761) ^ (-1403081653);
                        i5 = 966925474;
                        i6 = iM11307 ^ i5;
                        strM26821 = strM26821;
                        i10 = i4;
                        c8394 = c8394;
                        i11 = i6;
                    }
                    viewOnClickListenerC12295 = viewOnClickListenerC12294;
                    break;
                case -69765170:
                case 1218735486:
                    c8393 = c8394;
                    iM6174 = RunnableC1895.m6174(c1313);
                    if (iM6174 != 1001) {
                        iM11306 = (i9 - ThreadFactoryC3888.m11306("ۘ᩷")) * 39;
                        i2 = ((iM11306 ^ i8) * (-3511)) ^ (-847394466);
                        i3 = 575516326;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ܺ") ^ i8;
                        i2 = ((iM11306 ^ i9) * 29211) ^ (-1448595941);
                        i3 = 1766986748;
                    }
                    int i17 = iM11306 ^ i3;
                    c8394 = c8393;
                    i11 = i17;
                    i10 = i2;
                    break;
                case -10710903:
                case 789468201:
                    iM11309 = ThreadFactoryC3888.m11306(MenuItemOnMenuItemClickListenerC3244.m9715(f41102, UMErrorCode.E_UM_BE_RAW_OVERSIZE, 3, i13));
                    if (C3722.f13525 > 0) {
                        iM11308 = C19806.m45029("᩻۬") ^ i8;
                        i2 = ((iM11308 ^ i9) * 16379) ^ 806043949;
                        i7 = 414987836;
                        i11 = iM11308 ^ i7;
                        i10 = i2;
                    } else {
                        int iM450214 = C19806.m45029("᩹ۜ") ^ i9;
                        i10 = ((iM450214 ^ i8) * (-5047)) ^ 378507048;
                        i11 = iM450214 ^ 1775211692;
                        viewOnClickListenerC12295 = viewOnClickListenerC12294;
                    }
                    break;
                case 382939022:
                case 1366036020:
                    C2642.m8170(textInputLayout, C19806.m45029(strM18989) ^ 2098708740);
                    break;
                case 425733809:
                case 1064609548:
                    strM189810 = C7105.m18989(f41102, IShizukuService.Stub.TRANSACTION_isHidden, 3, i13);
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11308 = (i9 - ThreadFactoryC3888.m11306("ܽᩳ")) * 123;
                        i2 = ((iM11308 ^ i8) * 11621) ^ 2081138556;
                        i7 = 328918187;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("ܽ۫") ^ i9;
                        i2 = ((iM11308 ^ i8) * 18931) ^ (-236659545);
                        i7 = -558659172;
                    }
                    i11 = iM11308 ^ i7;
                    i10 = i2;
                    break;
                case 442932634:
                case 908890928:
                    C1937.m6279();
                    break;
                case 839316477:
                case 1446822056:
                    c8394 = c8394;
                    strM26821 = C10634.m26821(f41102, 93, 8, i13);
                    if (C2124.m6673() > 0) {
                        int iM450215 = (i9 - C19806.m45029("ۡܰ")) * 35;
                        i10 = ((iM450215 ^ i8) * 2081) ^ (-1657933366);
                        i6 = iM450215 ^ (-991405309);
                        c8394 = c8394;
                        i11 = i6;
                        viewOnClickListenerC12295 = viewOnClickListenerC12294;
                    } else {
                        c8394 = c8394;
                        int iM450216 = C19806.m45029("᩹ۜ") ^ i9;
                        i10 = ((iM450216 ^ i8) * (-5047)) ^ 378507048;
                        i11 = iM450216 ^ 1775211692;
                        viewOnClickListenerC12295 = viewOnClickListenerC12294;
                    }
                    break;
                case 881152099:
                case 1015049355:
                    i13 = 42678;
                    iM11307 = ThreadFactoryC3888.m11306("ۖ֡") ^ i8;
                    i4 = ((iM11307 ^ i9) * 26775) ^ 487362467;
                    i5 = 1110912152;
                    i6 = iM11307 ^ i5;
                    strM26821 = strM26821;
                    i10 = i4;
                    c8394 = c8394;
                    i11 = i6;
                    viewOnClickListenerC12295 = viewOnClickListenerC12294;
                    break;
                case 1100672216:
                case 1384351000:
                    strM26821 = strM26821;
                    c8394 = c8394;
                    if ((s2 * s) - ((s2 * s2) + 16859236) > 0) {
                        iM11307 = (C19806.m45029("֡ۚ") + i9) * 17;
                        i4 = ((iM11307 ^ i8) * 3585) ^ (-1266450690);
                        i5 = 1634755699;
                    } else {
                        iM11307 = (C19806.m45029("ۖ۫") ^ i8) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM11307 ^ i9) * (-5379)) ^ 1189324126;
                        i5 = 1015383639;
                    }
                    i6 = iM11307 ^ i5;
                    strM26821 = strM26821;
                    i10 = i4;
                    c8394 = c8394;
                    i11 = i6;
                    viewOnClickListenerC12295 = viewOnClickListenerC12294;
                    break;
                case 1345894779:
                case 1543536514:
                    AbstractC0464.m2313();
                    if (AbstractC0464.f2088 <= 0) {
                        iM11308 = (i9 - ThreadFactoryC3888.m11306("ܽᩳ")) * 123;
                        i2 = ((iM11308 ^ i8) * 11621) ^ 2081138556;
                        i7 = 328918187;
                        i11 = iM11308 ^ i7;
                        i10 = i2;
                    } else {
                        int iM450217 = C19806.m45029("᩹ۜ") ^ i9;
                        i10 = ((iM450217 ^ i8) * (-5047)) ^ 378507048;
                        i11 = iM450217 ^ 1775211692;
                        viewOnClickListenerC12295 = viewOnClickListenerC12294;
                    }
                    break;
                case 1774776321:
                case 1801205618:
                    c8392 = c8394;
                    i14 = 101;
                    i12 = 3;
                    if (C1066.f4915 > 0) {
                        c8393 = c8392;
                        iM11306 = (i8 - ThreadFactoryC3888.m11306("۠᩸")) * 39;
                        i2 = ((iM11306 ^ i9) * (-19607)) ^ (-1682183229);
                        i3 = -177083499;
                        int i18 = iM11306 ^ i3;
                        c8394 = c8393;
                        i11 = i18;
                        i10 = i2;
                    } else {
                        iM45029 = (i8 - C19806.m45029("᩹۟")) * (-41);
                        c8391 = c8392;
                        i10 = ((iM45029 ^ i9) * (-17519)) ^ (-762512863);
                        i = 1829098450;
                        int i19 = iM45029 ^ i;
                        c8394 = c8391;
                        i11 = i19;
                    }
                    break;
                default:
                    C1189.m4368();
                    if (!C1419.m4973()) {
                        c8392 = c8394;
                        iM45029 = (i8 - C19806.m45029("᩹۟")) * (-41);
                        c8391 = c8392;
                        i10 = ((iM45029 ^ i9) * (-17519)) ^ (-762512863);
                        i = 1829098450;
                        int i110 = iM45029 ^ i;
                        c8394 = c8391;
                        i11 = i110;
                    } else {
                        int iM450218 = C19806.m45029("᩹ۜ") ^ i9;
                        i10 = ((iM450218 ^ i8) * (-5047)) ^ 378507048;
                        i11 = iM450218 ^ 1775211692;
                        viewOnClickListenerC12295 = viewOnClickListenerC12294;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ac, code lost:
    
        if (l.RunnableC0195.m1431() == false) goto L18;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m30539(l.ViewOnClickListenerC12294 r29, l.C1313 r30) {
        /*
            Method dump skipped, instruction units count: 1174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC12294.m30539(l.۫۠᩺, l.֨ᩴ᩺):void");
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 40481. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:99)
        */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r52) {
        /*
            Method dump skipped, instruction units count: 4048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC12294.onClick(android.view.View):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30538(ViewOnClickListenerC12294 viewOnClickListenerC12294, String str, String str2) {
        int i = 1837622174;
        int i2 = C10634.f36300;
        int i3 = RunnableC0195.f1321;
        int iM45029 = (i3 - C19806.m45029("ۘۢ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
        int i4 = ((iM45029 ^ i2) * 15849) ^ 882988750;
        int i5 = -14939313;
        while (true) {
            i = ((((i ^ i2) * (-24007)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1985585227:
                case -1343533214:
                    C3660.m10791();
                    C1668.m5583();
                    break;
                case -1895563197:
                case 608995748:
                    if (C1066.f4915 <= 0) {
                        iM45029 = C19806.m45029("ۡᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 29179) ^ (-79636856);
                        i5 = 1847982339;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܰܳ")) * 23;
                        i4 = ((iM45029 ^ i2) * 10147) ^ 1332074285;
                        i5 = 1716722726;
                    }
                    break;
                case -1842896749:
                case -777439130:
                    AbstractActivityC12483 abstractActivityC12483 = viewOnClickListenerC12294.f41110;
                    byte[] bArr = viewOnClickListenerC12294.f41108;
                    if (!C1377.f5749) {
                        iM45029 = C19806.m45029("ۧܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-27449)) ^ 390812532;
                        i5 = -793906359;
                    } else {
                        C15822 c15822 = new C15822(viewOnClickListenerC12294);
                        if (C2704.f10408) {
                            C2642.m8165(new Thread(new RunnableC12356(bArr, str, str2, abstractActivityC12483, c15822)));
                        }
                        iM45029 = ThreadFactoryC3888.m11306("ܶ֨") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18077)) ^ (-2029669180);
                        i5 = 1516606169;
                    }
                    break;
                case -1764526694:
                case -446592128:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31383)) ^ (-201387279);
                        i5 = 273783268;
                    } else {
                        iM45029 = C19806.m45029("ۡᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 29179) ^ (-79636856);
                        i5 = 1847982339;
                    }
                    break;
                case -1451545264:
                case -1145874316:
                    viewOnClickListenerC12294.m30545();
                    if (C0817.f3443) {
                        iM45029 = C19806.m45029("ۢ᩶") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-13401)) ^ 491837441;
                        i5 = 837982484;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31383)) ^ (-201387279);
                        i5 = 273783268;
                    }
                    break;
                case -1441013864:
                case 1873400333:
                    C0797.m3359();
                    if (!RunnableC1895.f7152) {
                        iM45029 = ThreadFactoryC3888.m11306("ܶ֨") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18077)) ^ (-2029669180);
                        i5 = 1516606169;
                    } else {
                        iM45029 = (C19806.m45029("֨ᩴ") ^ i3) * 127;
                        i4 = ((iM45029 ^ i2) * 8975) ^ (-2116037695);
                        i5 = -820187052;
                    }
                    break;
                case -1283151669:
                case 1142308574:
                    C1419.m4973();
                    if (C2788.f10625 < 0) {
                        iM45029 = C19806.m45029("ۡᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 29179) ^ (-79636856);
                        i5 = 1847982339;
                    } else {
                        iM45029 = (C19806.m45029("֨ᩴ") ^ i3) * 127;
                        i4 = ((iM45029 ^ i2) * 8975) ^ (-2116037695);
                        i5 = -820187052;
                    }
                    break;
                case -786306342:
                case -205544420:
                    C0671.m3008();
                    C1398.m4895();
                    iM45029 = (C19806.m45029("֨ᩴ") ^ i3) * 127;
                    i4 = ((iM45029 ^ i2) * 8975) ^ (-2116037695);
                    i5 = -820187052;
                    break;
                case -784766006:
                case -562918634:
                    if (C2642.f10294 <= 0) {
                        iM45029 = C19806.m45029("ۡᩳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 29179) ^ (-79636856);
                        i5 = 1847982339;
                    } else {
                        iM45029 = (C19806.m45029("ᩳ᩶") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM45029 ^ i2) * (-785)) ^ (-844135201);
                        i5 = 873479363;
                    }
                    break;
                case 118773619:
                case 2023066329:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31383)) ^ (-201387279);
                        i5 = 273783268;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("۟ۛ")) * (-39);
                        i4 = ((iM45029 ^ i3) * 9601) ^ 941799312;
                        i5 = -2072047111;
                    }
                    break;
                case 283676907:
                case 1954491900:
                    if (C7105.f23796 >= 0) {
                        iM45029 = C19806.m45029("ۧܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-27449)) ^ 390812532;
                        i5 = -793906359;
                    } else {
                        iM45029 = (C19806.m45029("ۗۤ") + i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM45029 ^ i3) * (-22623)) ^ 1008582543;
                        i5 = -524687928;
                    }
                    break;
                case 1188113978:
                case 1646271438:
                    if (C7105.f23796 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31383)) ^ (-201387279);
                        i5 = 273783268;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ֨") + i3) * 99;
                        i4 = ((iM45029 ^ i2) * 26249) ^ (-1716283664);
                        i5 = 396455483;
                    }
                    break;
                case 1269254077:
                case 1339308184:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (C19806.m45029("֨ᩴ") ^ i3) * 127;
                        i4 = ((iM45029 ^ i2) * 8975) ^ (-2116037695);
                        i5 = -820187052;
                    } else {
                        iM45029 = C19806.m45029("ۘ᩵") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-10393)) ^ (-1687155596);
                        i5 = -1343454691;
                    }
                    break;
                default:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܶ֨") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-18077)) ^ (-2029669180);
                        i5 = 1516606169;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ᩺") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-30403)) ^ (-266348055);
                        i5 = -1689740591;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0126 A[PHI: r3 r4 r5
      0x0126: PHI (r3v4 android.view.View) = (r3v3 android.view.View), (r3v2 android.view.View), (r3v2 android.view.View) binds: [B:37:0x0124, B:33:0x0100, B:29:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x0126: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:37:0x0124, B:33:0x0100, B:29:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x0126: PHI (r5v3 float[]) = (r5v2 float[]), (r5v2 float[]), (r5v4 float[]) binds: [B:37:0x0124, B:33:0x0100, B:29:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01f8 A[PHI: r2 r11 r12
      0x01f8: PHI (r2v6 int) = (r2v2 int), (r2v4 int), (r2v2 int) binds: [B:56:0x01f6, B:41:0x0155, B:8:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r11v5 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:56:0x01f6, B:41:0x0155, B:8:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r12v5 short) = (r12v3 short), (r12v2 short), (r12v2 short) binds: [B:56:0x01f6, B:41:0x0155, B:8:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x022f A[PHI: r6 r9 r10
      0x022f: PHI (r6v4 java.lang.String) = (r6v2 java.lang.String), (r6v2 java.lang.String), (r6v3 java.lang.String), (r6v2 java.lang.String) binds: [B:60:0x022d, B:45:0x0179, B:21:0x0097, B:11:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r9v4 short) = (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:60:0x022d, B:45:0x0179, B:21:0x0097, B:11:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:60:0x022d, B:45:0x0179, B:21:0x0097, B:11:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0263 A[PHI: r8 r14 r15 r20
      0x0263: PHI (r8v4 char) = (r8v3 char), (r8v2 char), (r8v2 char), (r8v2 char) binds: [B:64:0x0261, B:25:0x00be, B:17:0x0084, B:14:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r14v4 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:64:0x0261, B:25:0x00be, B:17:0x0084, B:14:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:64:0x0261, B:25:0x00be, B:17:0x0084, B:14:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:64:0x0261, B:25:0x00be, B:17:0x0084, B:14:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private final void m30545() {
        int iM11306;
        int i;
        int i2;
        int i3 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int i4 = C0050.f912;
        int iM45029 = C19806.m45029("ۜۢ") ^ i4;
        int i5 = ((iM45029 ^ i3) * 19981) ^ (-2014541267);
        View view = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM45029 ^ (-19906914);
        int i7 = 0;
        char c = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 2058325452;
        String strM3009 = null;
        float[] fArr = null;
        int i13 = 0;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * (-10211)) >> 31));
            switch (i12) {
                case -1853335389:
                case -1655513543:
                    // fill-array-data instruction
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    sArr2 = f41102;
                    i11 = 87;
                    if (C1377.m4833() != 0) {
                        iM11306 = C19806.m45029("֡ܺ") ^ i4;
                        i = ((iM11306 ^ i3) * 25015) ^ (-2136287197);
                        i2 = 1229806922;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ᩳۘ")) * (-55);
                        i = ((iM11306 ^ i4) * 11747) ^ (-1136699308);
                        i2 = -2014781274;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1776365842:
                case -248998384:
                    view = this.f41105;
                    RunnableC1895.m6165(view, i7);
                    if (C2124.m6673() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۠ۤ") ^ i3;
                        i = ((iM11306 ^ i4) * (-6077)) ^ (-1958822501);
                        i2 = -43696540;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖ۬") ^ i3;
                        i = ((iM11306 ^ i4) * 1555) ^ (-250488525);
                        i2 = 308422815;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1764779872:
                case 885026036:
                    fArr = new float[i13];
                    if (C0050.f912 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۠ۤ") ^ i3;
                        i = ((iM11306 ^ i4) * (-6077)) ^ (-1958822501);
                        i2 = -43696540;
                    } else {
                        iM11306 = (C19806.m45029("֫ܺ") ^ i4) * 51;
                        i = ((iM11306 ^ i3) * 22195) ^ (-399723245);
                        i2 = -1321893539;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1709307727:
                case 1685762009:
                    if ((s * s2) - i9 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ۘ") ^ i4;
                        i = ((iM11306 ^ i3) * (-31707)) ^ (-2138030913);
                        i2 = 789562292;
                    } else {
                        iM11306 = (C19806.m45029("ۖۛ") + i4) * (-113);
                        i = ((iM11306 ^ i3) * 24503) ^ 1260757319;
                        i2 = 1099166532;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1654862148:
                case 1550317527:
                    if (C0526.m2437() < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֫۟") + i3) * 19;
                        i = ((iM11306 ^ i4) * 21775) ^ 764741943;
                        i2 = -869326865;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽۘ") ^ i4;
                        i = ((iM11306 ^ i3) * 11065) ^ 234725133;
                        i2 = -2018417717;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1646137634:
                case 58506036:
                    i7 = 0;
                    if (C0526.f2219) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽۘ") ^ i4;
                        i = ((iM11306 ^ i3) * 11065) ^ 234725133;
                        i2 = -2018417717;
                    } else {
                        iM11306 = C19806.m45029("ۢۗ") ^ i3;
                        i = ((iM11306 ^ i4) * (-19317)) ^ (-1439661995);
                        i2 = 1344954258;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1426190361:
                case 1058682494:
                    C1875.m6086();
                    iM11306 = C19806.m45029("֡ܺ") ^ i4;
                    i = ((iM11306 ^ i3) * 25015) ^ (-2136287197);
                    i2 = 1229806922;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1292206853:
                case 1624803196:
                    sArr = f41102;
                    c = 'V';
                    if (C2477.f9839 <= 0) {
                        iM11306 = C19806.m45029("֡ܺ") ^ i4;
                        i = ((iM11306 ^ i3) * 25015) ^ (-2136287197);
                        i2 = 1229806922;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴܽ") ^ i3;
                        i = ((iM11306 ^ i4) * (-25249)) ^ 410223936;
                        i2 = -1028142830;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1285494786:
                case -831239829:
                    AbstractC0464.m2301(view, 0.0f);
                    i13 = 2;
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۠ۤ") ^ i3;
                        i = ((iM11306 ^ i4) * (-6077)) ^ (-1958822501);
                        i2 = -43696540;
                    } else {
                        iM11306 = (C19806.m45029("ܽ᩵") ^ i4) * 43;
                        i = ((iM11306 ^ i3) * 5815) ^ (-252636058);
                        i2 = 1573990985;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -916517876:
                case 329826865:
                    this.f41112.m44368((DialogInterface.OnKeyListener) null);
                    if (RunnableC1564.m5345()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢܰ") ^ i4;
                        i = ((iM11306 ^ i3) * 7289) ^ 1741626548;
                        i2 = -1504597046;
                    } else {
                        iM11306 = C19806.m45029("᩸ۢ") ^ i4;
                        i = ((iM11306 ^ i3) * (-17513)) ^ (-2097673608);
                        i2 = 1330977213;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -879026925:
                case 1584206505:
                    if (C3286.f12186) {
                        iM11306 = (ThreadFactoryC3888.m11306("֫۟") + i3) * 19;
                        i = ((iM11306 ^ i4) * 21775) ^ 764741943;
                        i2 = -869326865;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢܰ") ^ i4;
                        i = ((iM11306 ^ i3) * 7289) ^ 1741626548;
                        i2 = -1504597046;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -690587427:
                case -496529895:
                    i9 = i8 + 248945284;
                    s2 = 31556;
                    if (C1977.m6356()) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽۘ") ^ i4;
                        i = ((iM11306 ^ i3) * 11065) ^ 234725133;
                        i2 = -2018417717;
                    } else {
                        iM11306 = (C19806.m45029("᩹ۡ") + i3) * (-95);
                        i = ((iM11306 ^ i4) * (-31217)) ^ 1454901292;
                        i2 = 1534883398;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -360976729:
                case 223542553:
                    if (C1398.f5802 <= 0) {
                        iM11306 = C19806.m45029("֡ܺ") ^ i4;
                        i = ((iM11306 ^ i3) * 25015) ^ (-2136287197);
                        i2 = 1229806922;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫۟") + i3) * 19;
                        i = ((iM11306 ^ i4) * 21775) ^ 764741943;
                        i2 = -869326865;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -287959388:
                case 706776947:
                    strM3009 = C0671.m3009(sArr2, i11, 5, i10);
                    if (C2642.f10294 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢܰ") ^ i4;
                        i = ((iM11306 ^ i3) * 7289) ^ 1741626548;
                        i2 = -1504597046;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۡᩳ")) * (-111);
                        i = ((iM11306 ^ i4) * 9825) ^ 1017442670;
                        i2 = 1418023048;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -115206388:
                case 1663459639:
                    i10 = 32816;
                    iM11306 = (ThreadFactoryC3888.m11306("ۧۜ") + i3) * (-95);
                    i = ((iM11306 ^ i4) * 22135) ^ 261248036;
                    i2 = 743390269;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 90665232:
                case 1081711704:
                    C0629.m2907();
                    C10634.m26820();
                    break;
                case 559051420:
                case 2015600514:
                    i10 = 41255;
                    iM11306 = (ThreadFactoryC3888.m11306("ۧۜ") + i3) * (-95);
                    i = ((iM11306 ^ i4) * 22135) ^ 261248036;
                    i2 = 743390269;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1622007407:
                case 1672931308:
                    s = sArr[c];
                    i8 = s * s;
                    if (C1377.m4833() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢܰ") ^ i4;
                        i = ((iM11306 ^ i3) * 7289) ^ 1741626548;
                        i2 = -1504597046;
                    } else {
                        iM11306 = (C19806.m45029("ܿۚ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM11306 ^ i3) * (-873)) ^ (-1298835139);
                        i2 = -552967615;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    C2477.m7594(C2871.m8649(C1066.m4024(view, strM3009, fArr), 200L));
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30537(ViewOnClickListenerC12294 viewOnClickListenerC12294) {
        C3722.m10890(viewOnClickListenerC12294.f41105, 8);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m30543(ViewOnClickListenerC12294 viewOnClickListenerC12294) {
        DialogInterfaceC19356 dialogInterfaceC19356 = null;
        int i = -172314176;
        int i2 = C3577.f13150;
        int i3 = C7105.f23796;
        int iM45029 = (i2 - C19806.m45029("ܰܳ")) * (-119);
        int i4 = ((iM45029 ^ i3) * (-22353)) ^ 34845691;
        int i5 = 1655536870;
        while (true) {
            i = ((((i ^ i3) * 3911) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1952018309:
                case -1146120765:
                    viewOnClickListenerC12294.f41111.m22033();
                    break;
                case -1881898180:
                case 1978472403:
                    if (C0797.m3359()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-6805)) ^ (-41483676);
                        i5 = -188583786;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷ۤ") ^ i2) * 51;
                        i4 = ((iM45029 ^ i3) * (-18041)) ^ 1621965498;
                        i5 = -1608545117;
                    }
                    break;
                case -1643007095:
                case 530657344:
                    if (C0526.f2219) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷ۤ") ^ i2) * 51;
                        i4 = ((iM45029 ^ i3) * (-18041)) ^ 1621965498;
                        i5 = -1608545117;
                    } else {
                        iM45029 = (C19806.m45029("ۙ᩻") ^ i2) * (-83);
                        i4 = ((iM45029 ^ i3) * 3937) ^ (-2142212122);
                        i5 = 159576089;
                    }
                    break;
                case -1437852749:
                case 1405766747:
                    C1419.m4973();
                    break;
                case -1230581894:
                case 502226599:
                    if (C1460.m5050() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * 22951) ^ 1805725226;
                        i5 = 1089463833;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۨۚ")) * (-55);
                        i4 = ((iM45029 ^ i3) * 26999) ^ (-862295957);
                        i5 = -2024725162;
                    }
                    break;
                case -1045263011:
                case 1427309061:
                    if (C1875.f7103 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * 22951) ^ 1805725226;
                        i5 = 1089463833;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳᩳ") ^ i2) * (-113);
                        i4 = ((iM45029 ^ i3) * 26771) ^ (-2109348341);
                        i5 = -1226877158;
                    }
                    break;
                case -959185692:
                case 1610204560:
                    C1189.m4367(dialogInterfaceC19356);
                    if (C2477.f9839 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘ᩹") ^ i3) * 69;
                        i4 = ((iM45029 ^ i2) * (-25157)) ^ 1397004553;
                        i5 = -495141364;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷ᩴ") + i3) * 15;
                        i4 = ((iM45029 ^ i2) * (-24221)) ^ 1691516909;
                        i5 = 1740441975;
                    }
                    break;
                case -635281582:
                case 59017284:
                    C1025.m3861();
                    CallableC1627.m5507();
                    iM45029 = ThreadFactoryC3888.m11306("ᩴ᩻") ^ i3;
                    i4 = ((iM45029 ^ i2) * 17257) ^ 1391316763;
                    i5 = -1716693005;
                    break;
                case -219511120:
                case 2000530521:
                    C1398.m4895();
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * 22951) ^ 1805725226;
                        i5 = 1089463833;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * 17257) ^ 1391316763;
                        i5 = -1716693005;
                    }
                    break;
                case -97167650:
                case 960961919:
                    if (C0526.f2219) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * 17257) ^ 1391316763;
                        i5 = -1716693005;
                    } else {
                        iM45029 = (C19806.m45029("ᩴۡ") ^ i3) * (-45);
                        i4 = ((iM45029 ^ i2) * (-16135)) ^ (-6927420);
                        i5 = 1953524390;
                    }
                    break;
                case 377654818:
                case 1225141216:
                    if (C7105.f23796 >= 0) {
                        iM45029 = C19806.m45029("ܳ۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-6795)) ^ (-1016303496);
                        i5 = -1464523612;
                    } else {
                        iM45029 = C19806.m45029("֡ܺ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 29023) ^ (-2062090709);
                        i5 = -1536858667;
                    }
                    break;
                case 1051234879:
                case 1953640463:
                    if (C0216.f1393 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * 22951) ^ 1805725226;
                        i5 = 1089463833;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-31099)) ^ 1769715874;
                        i5 = 198575420;
                    }
                    break;
                case 1351098719:
                case 1657902995:
                    if (!C2332.f8260) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * 17257) ^ 1391316763;
                        i5 = -1716693005;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷ۤ") ^ i2) * 51;
                        i4 = ((iM45029 ^ i3) * (-18041)) ^ 1621965498;
                        i5 = -1608545117;
                    }
                    break;
                case 1513936567:
                case 1846533240:
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷ۤ") ^ i2) * 51;
                        i4 = ((iM45029 ^ i3) * (-18041)) ^ 1621965498;
                        i5 = -1608545117;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ᩹") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-22009)) ^ 1106046516;
                        i5 = -588897621;
                    }
                    break;
                case 1868182346:
                case 1949667092:
                    C2704.m8255();
                    if (!C0962.f3784) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * 17257) ^ 1391316763;
                        i5 = -1716693005;
                    } else {
                        iM45029 = C19806.m45029("ܳ۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-6795)) ^ (-1016303496);
                        i5 = -1464523612;
                    }
                    break;
                default:
                    dialogInterfaceC19356 = viewOnClickListenerC12294.f41112;
                    if (C1937.f7317 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * 17257) ^ 1391316763;
                        i5 = -1716693005;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۢ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 18589) ^ (-1359303279);
                        i5 = 1169419641;
                    }
                    break;
            }
            return;
        }
    }
}
