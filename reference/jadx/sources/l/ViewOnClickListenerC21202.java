package l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.SpannableString;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.TwofishEngine;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: l.᩶ۡۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: D17I */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC21202 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۢۧۤ, reason: not valid java name and contains not printable characters */
    private static final short[] f67679 = {255, 5574, -7352, 11683, 6332, -1424, 11051, -4250, 7844, -6582, -6496, 1008, -6347, 3882, -5750, 3948, -2146, 7061, 1464, 6904, 11588, 2482, -6920, 12141, -5809, 11934, 10744, 10447, -2978, -5066, 11942, 10325, -379, 9469, 627, 11198, 6590, 31844, 31843, 31847, 31848, 31854, 31865, 31826, 31871, 31848, 31826, 31870, 31842, 31864, 31871, 31854, 31848, 31826, 31841, 31844, 31843, 31848, 31844, 31843, 31847, 31848, 31854, 31865, 31826, 31841, 31842, 31850, 31826, 31851, 31842, 31871, 31840, 31852, 31865, 31844, 31843, 31847, 31848, 31854, 31865, 31826, 31841, 31842, 31850, 31826, 31869, 31852, 31865, 31845, 272, 8659, 5355, 31844, 31843, 31847, 31848, 31854, 31865, 31826, 31851, 31844, 31841, 31865, 31848, 31871, 31826, 600, 26345, 26350, 26346, 26341, 26339, 26356, 26335, 26348, 26351, 26343, 26335, 26352, 26337, 26356, 26344, 5494, 27356, -24042, -23355, -17562, 18215, 18571, 27262, -16914, 26747, 5297, -22068, -24428, -21794, -22696, -22841, -24023, -11643, -11646, -11642, -11639, -11633, -11624, -11597, -11648, -11645, -11637, -11597, -11638, -11645, -11618, -11647, -11635, -11624, -11593, -11592, -11611, -11615, -11607, -11599, -11572, -11593, -11601, -11616, -11603, -11585, -11585, -11599, -11546, -11583, -11566, -11593, -11615, -11607, -11592, -11612, -11613, -11608, -11599, -11580, -11593, -11616, -11613, -11601, -11603, -11592, -11611, -11613, -11614, -11599, -11579, -11546, -11593, -11586, -11607, -11585, -11591, -11616, -11592, -11599, -11546, -11583, -11583, -11583, -11583, -11583, -11583, -11583, -11583, -11583, -11583, -11583, -11583, -11583, -11583, -11583, -11583, -11583, -11583, -11583, -11583, -11546, -32606, -29529, 18572, 20430, 22103, -30056, 20848, 17266, 24352, 19393, -20226, 24326, -19525, 16760, 22055, -25176, -17000, -23707, 22888, -16739, 19278, -25472, -30963, -16537, 2317, 19200, 19207, 19203, 19212, 19210, 19229, 19254, 19215, 19200, 19205, 19229, 19212, 19227, 19254, 6006, -13744, -13737, -13741, -13732, -13734, -13747, -13722, -13750, -13734, -13743, -13732, -13740, -13732, -18574, -19569, -24559, 2245, -24533, -24514, -24518, -24490, -24544, -24476, -24465, -24456, -24465, -24524, 4862, 30508, 30507, 30511, 30496, 30502, 30513, 30490, 30505, 30506, 30498, 30490, 30517, 30500, 30513, 30509, 6753, 21909, 21910, 21918, 21898, 21974, 21922, 21929, 21944, 21946, 21938, 21944, 21950, 21948, 21924, 21972, 21922, 21933, 21936, 21940, 21948, 21924, 21975, 21909, 21910, 21918, 21974, 21922, 21930, 21949, 21946, 21944, 21931, 21949, 21924, 9671, -3305, 3361, -7957, -4707, -1933, -7346, -5065, -8045, 9154, 6993, -6441, 7936, 30612, 30654, 30612, 3049, 27141, 29848, 23473, 32279, -25029, -26685, 283, 284, 280, 279, 273, 262, 301, 286, 285, 277, 301, 258, 275, 262, 282, 28110, -31716, 25539, -32557, 22263, 31854, 26507, -27061, -26246, 30641, 21316, 21262, 21530, 20343, -30887, 32301, -32543, 25666, 9817, 14788, 14787, 14791, 14792, 14798, 14809, 14834, 14814, 14798, 14789, 14792, 14784, 14792, 2849, 6441, 3257, -13483};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f67680;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ArrayList f67681;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C8614 f67682;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C15958 f67683;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Spinner f67684;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C23255 f67685;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Main f67686;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public TreeSet f67687;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f67688;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C3054 f67689;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ void m48347(ViewOnClickListenerC21202 viewOnClickListenerC21202, C15958 c15958) {
        viewOnClickListenerC21202.f67683 = c15958;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ C8614 m48352(ViewOnClickListenerC21202 viewOnClickListenerC21202) {
        return viewOnClickListenerC21202.f67682;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ String m48353(ViewOnClickListenerC21202 viewOnClickListenerC21202) {
        return viewOnClickListenerC21202.f67688;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ AbstractC22044 m48354(ViewOnClickListenerC21202 viewOnClickListenerC21202) {
        return viewOnClickListenerC21202.f67680;
    }

    /* JADX WARN: Code duplicated, block: B:163:0x0af4 A[PHI: r103 r104 r105 r106
      0x0af4: PHI (r103v7 int) = (r103v1 int), (r103v3 int), (r103v8 int) binds: [B:159:0x0ad2, B:152:0x0a7a, B:145:0x09f2] A[DONT_GENERATE, DONT_INLINE]
      0x0af4: PHI (r104v7 int) = (r104v1 int), (r104v3 int), (r104v8 int) binds: [B:159:0x0ad2, B:152:0x0a7a, B:145:0x09f2] A[DONT_GENERATE, DONT_INLINE]
      0x0af4: PHI (r105v7 int) = (r105v1 int), (r105v3 int), (r105v8 int) binds: [B:159:0x0ad2, B:152:0x0a7a, B:145:0x09f2] A[DONT_GENERATE, DONT_INLINE]
      0x0af4: PHI (r106v7 int) = (r106v1 int), (r106v3 int), (r106v8 int) binds: [B:159:0x0ad2, B:152:0x0a7a, B:145:0x09f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0519 A[PHI: r2 r103 r104 r105 r106
      0x0519: PHI (r2v73 java.util.ArrayList) = (r2v61 java.util.ArrayList), (r2v66 java.util.ArrayList), (r2v74 java.util.ArrayList) binds: [B:62:0x0500, B:47:0x043f, B:37:0x0370] A[DONT_GENERATE, DONT_INLINE]
      0x0519: PHI (r103v41 int) = (r103v29 int), (r103v34 int), (r103v42 int) binds: [B:62:0x0500, B:47:0x043f, B:37:0x0370] A[DONT_GENERATE, DONT_INLINE]
      0x0519: PHI (r104v34 l.᩹۠ۤ) = (r104v23 l.᩹۠ۤ), (r104v27 l.᩹۠ۤ), (r104v35 l.᩹۠ۤ) binds: [B:62:0x0500, B:47:0x043f, B:37:0x0370] A[DONT_GENERATE, DONT_INLINE]
      0x0519: PHI (r105v41 int) = (r105v29 int), (r105v34 int), (r105v42 int) binds: [B:62:0x0500, B:47:0x043f, B:37:0x0370] A[DONT_GENERATE, DONT_INLINE]
      0x0519: PHI (r106v42 int) = (r106v30 int), (r106v35 int), (r106v43 int) binds: [B:62:0x0500, B:47:0x043f, B:37:0x0370] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:236:0x10b8. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x016c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r80v1 */
    /* JADX WARN: Type inference failed for: r80v2 */
    /* JADX WARN: Type inference failed for: r80v3 */
    /* JADX WARN: Type inference failed for: r80v4 */
    /* JADX WARN: Type inference failed for: r80v5 */
    /* JADX WARN: Type inference failed for: r80v6 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48346(ViewOnClickListenerC21202 viewOnClickListenerC21202, C8850 c8850, C22737 c22737, C24910 c24910, boolean z, AtomicInteger atomicInteger) {
        int iM3169;
        int i;
        int i2;
        int iM2761;
        int i3;
        int i4;
        boolean z2;
        int iM31610;
        int i5;
        int i6;
        int iM2762;
        int i7;
        int i8;
        int iM2763;
        int i9;
        int i10;
        int i11;
        int iM2764;
        int i12;
        int i13;
        ArrayList arrayList;
        int i14;
        int iM2765;
        int i15;
        int i16;
        int i17;
        int iM2766;
        int i18;
        int i19;
        int iM31611;
        int i20;
        int i21;
        AtomicInteger atomicInteger2;
        List list;
        int i22;
        int i23;
        int i24;
        String str;
        C8850 c8851;
        int i25;
        String str2;
        C8850 c8852;
        InterfaceC7140 interfaceC7140;
        List list2;
        int i26;
        int i27;
        AbstractC12384 abstractC12384;
        EnumC22631 enumC22631;
        int i28;
        C8850 c8853;
        C10628 c10628;
        int i29;
        int iM2767;
        int i30;
        int i31;
        ArrayList arrayList2;
        EnumC22631 enumC22632;
        int i32;
        C8850 c8854;
        C8850 c8855;
        InterfaceC7140 interfaceC7141;
        int iM31612;
        int i33;
        InterfaceC7140 interfaceC7142;
        ArrayList arrayList3;
        int i34;
        EnumC22631 enumC22633;
        C10628 c10629;
        InterfaceC7140 interfaceC7143;
        AbstractC12384 abstractC12385;
        List list3;
        int iM31613;
        int i35;
        int i36;
        int i37;
        int i38;
        AbstractC12384 abstractC12386;
        AbstractC12384 abstractC12387;
        int i39;
        int iM2768;
        int i40;
        AbstractC12384 abstractC12388;
        int iM31614;
        int i41;
        int iM2769;
        int i42;
        int i43;
        int i44;
        int iM31615;
        int i45;
        int i46;
        boolean z3;
        int i47;
        int iM31616;
        int i48;
        int i49;
        InterfaceC12142 interfaceC12142;
        int i50;
        int i51;
        C8850 c8856;
        int i52;
        C8850 c8857;
        int iM27610;
        int i53;
        int i54;
        int iM27611;
        int i55;
        int i56;
        ViewOnClickListenerC21202 viewOnClickListenerC21203 = viewOnClickListenerC21202;
        AtomicInteger atomicInteger3 = null;
        String str3 = null;
        int i57 = C2310.f7472;
        int i58 = C0773.f2792;
        int iM27612 = C0619.m2761("ᩳۡ") ^ i57;
        int i59 = ((iM27612 ^ i58) * 26925) ^ (-48665246);
        String strMo20400 = null;
        C8850 c8858 = null;
        InterfaceC7140 interfaceC7140Mo13175 = null;
        C10628 c106210 = null;
        List listMo2840 = null;
        String str4 = null;
        C8850 c8859 = null;
        C8850 c88510 = null;
        C23418 c23418M55494 = null;
        InterfaceC7140 interfaceC7144 = null;
        AbstractC12384 abstractC12389 = null;
        EnumC22631 enumC22634 = null;
        C8850 c88511 = null;
        C8850 c88512 = null;
        InterfaceC6177 interfaceC6177 = null;
        ArrayList arrayList4 = null;
        boolean[] zArr = null;
        int i60 = iM27612 ^ 1867455079;
        int i61 = 0;
        int i62 = 0;
        int i63 = 0;
        int i64 = 0;
        int i65 = -86926984;
        int i66 = 0;
        ArrayList arrayList5 = null;
        char c = 0;
        boolean z4 = false;
        boolean z5 = false;
        int i67 = 0;
        int i68 = 0;
        int i69 = 0;
        int i70 = 0;
        boolean z6 = false;
        boolean z7 = false;
        int i71 = 0;
        boolean z8 = false;
        int i72 = 0;
        int i73 = 0;
        boolean z9 = false;
        int i74 = 0;
        char c2 = 0;
        boolean z10 = false;
        int i75 = 0;
        boolean z11 = false;
        boolean z12 = false;
        int i76 = 0;
        char c3 = 0;
        int i77 = 0;
        boolean z13 = false;
        ?? r80 = 0;
        int i78 = 0;
        int i79 = 0;
        boolean z14 = false;
        int i80 = 0;
        int i81 = 0;
        int i82 = 0;
        int i83 = 0;
        int i84 = 0;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = false;
        int i85 = 0;
        int i86 = 0;
        ArrayList arrayList6 = null;
        Iterator itM47859 = null;
        Iterator itM2357 = null;
        Iterator itM2358 = null;
        C8850 c88513 = null;
        InterfaceC7140 interfaceC7145 = null;
        C8850 c88514 = null;
        InterfaceC12142 interfaceC12143 = null;
        Iterator itM4942 = null;
        int iM7976 = 0;
        int i87 = 0;
        char c4 = 0;
        String str5 = null;
        InterfaceC7140 interfaceC7140M23710 = null;
        ArrayList arrayListM38074 = null;
        C8850 c88515 = null;
        InterfaceC8631 interfaceC8631 = null;
        AbstractC12384 abstractC123810 = null;
        String strM2049 = null;
        boolean z21 = false;
        while (true) {
            i65 = i60 ^ (i59 & (((i65 ^ i58) * 14771) >> 31));
            switch (i65) {
                case -2141249648:
                case -64965436:
                    z20 = true;
                    int iM27613 = C0619.m2761("۬ᩴ") ^ i57;
                    i65 = i65;
                    i59 = ((iM27613 ^ i58) * (-29147)) ^ 1326340224;
                    i60 = iM27613 ^ (-2070458980);
                    i65 = i65;
                    break;
                case -2130064177:
                case 2097121154:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i85 = i85;
                    c88510 = c88510;
                    EnumC22631 enumC22635 = enumC22634;
                    i83 = i83;
                    if (enumC22635 != EnumC22631.f73441) {
                        enumC22632 = enumC22635;
                        i69 = i69;
                        listMo2840 = listMo2840;
                        i80 = i80;
                        abstractC12388 = abstractC123810;
                        int iM31617 = (i58 - C0773.m3169("۟֫")) * 65;
                        i42 = ((iM31617 ^ i57) * (-11255)) ^ (-101787325);
                        i46 = iM31617 ^ 455426888;
                        listMo2840 = listMo2840;
                        i85 = i85;
                        abstractC123810 = abstractC12388;
                        i80 = i80;
                        c88510 = c88510;
                        str3 = str3;
                        i83 = i83;
                        enumC22634 = enumC22632;
                        i69 = i69;
                        i61 = i61;
                        i62 = i62;
                        iM7976 = iM7976;
                        viewOnClickListenerC21203 = viewOnClickListenerC21202;
                        i60 = i46;
                        i59 = i42;
                        i87 = i87;
                        i65 = i65;
                    } else {
                        enumC22634 = enumC22635;
                        i80 = i80;
                        abstractC12388 = abstractC123810;
                        int iM31618 = C0773.m3169("ۗܳ") ^ i57;
                        i42 = ((iM31618 ^ i58) * (-28483)) ^ (-741571296);
                        i46 = iM31618 ^ 2022118740;
                        listMo2840 = listMo2840;
                        i85 = i85;
                        abstractC123810 = abstractC12388;
                        i80 = i80;
                        c88510 = c88510;
                        str3 = str3;
                        i83 = i83;
                        i74 = i74;
                        i61 = i61;
                        i62 = i62;
                        iM7976 = iM7976;
                        viewOnClickListenerC21203 = viewOnClickListenerC21202;
                        i60 = i46;
                        i59 = i42;
                        i87 = i87;
                        i65 = i65;
                    }
                    break;
                case -2129063685:
                case 134629495:
                    break;
                case -2112401882:
                case 542456168:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i80 = i80;
                    EnumC22631 enumC22636 = enumC22634;
                    i83 = i83;
                    i85 = i85;
                    c88510 = c88510;
                    AbstractC12384 abstractC123811 = abstractC123810;
                    if (!viewOnClickListenerC21203.f67683.m38077(c88510, abstractC123811, c106210, i85)) {
                        enumC22632 = enumC22636;
                        abstractC12386 = abstractC123811;
                        i38 = i86;
                        abstractC123810 = abstractC12386;
                        i83 = i83;
                        z3 = z5;
                        i47 = i85;
                        z7 = z3;
                        c88512 = c88510;
                        i70 = i47;
                        c88511 = c88514;
                        z6 = z8;
                        int iM31619 = C0773.m3169("֨۠") ^ i57;
                        i67 = i67;
                        i85 = i85;
                        i86 = i38;
                        i80 = i80;
                        c88510 = c88510;
                        i87 = i87;
                        str3 = str3;
                        enumC22634 = enumC22632;
                        i74 = i74;
                        i69 = i69;
                        c106210 = c106210;
                        i65 = i65;
                        i62 = i62;
                        iM7976 = iM7976;
                        listMo2840 = listMo2840;
                        i60 = iM31619 ^ 1753192764;
                        i59 = ((iM31619 ^ i58) * (-2717)) ^ (-2118321898);
                        i61 = i61;
                        viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    } else {
                        int iM31620 = (C0773.m3169("ۨۢ") ^ i57) * (-113);
                        i42 = ((iM31620 ^ i58) * (-363)) ^ 1262122588;
                        i46 = iM31620 ^ (-1613644375);
                        i85 = i85;
                        abstractC123810 = abstractC123811;
                        i80 = i80;
                        c88510 = c88510;
                        str3 = str3;
                        i83 = i83;
                        enumC22634 = enumC22636;
                        i61 = i61;
                        i62 = i62;
                        iM7976 = iM7976;
                        i60 = i46;
                        i59 = i42;
                        i87 = i87;
                        i65 = i65;
                    }
                    break;
                case -2078611743:
                case -718876471:
                    i65 = i65;
                    iM7976 = iM7976;
                    i62 = i62;
                    c23418M55494 = c23418M55494;
                    arrayList4 = arrayList4;
                    C1519.m5406(arrayList4, (C17450) C3690.m11990(arrayListM38074, i87));
                    iM2763 = C0619.m2761("ۖۢ") ^ i58;
                    i9 = ((iM2763 ^ i57) * (-26669)) ^ 1608114805;
                    i10 = 1823255172;
                    i60 = iM2763 ^ i10;
                    arrayList4 = arrayList4;
                    i59 = i9;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case -2077165034:
                case -1018505987:
                    i65 = i65;
                    if ((i76 & 32) != 0) {
                        iM27611 = (C0619.m2761("۟᩸") + i58) * (-5);
                        i55 = ((iM27611 ^ i57) * (-2419)) ^ 826119447;
                        i56 = 1052918674;
                    } else {
                        iM27611 = C0619.m2761("᩵ܿ") ^ i57;
                        i55 = ((iM27611 ^ i58) * 8991) ^ 997210851;
                        i56 = 650997126;
                    }
                    i60 = iM27611 ^ i56;
                    i59 = i55;
                    i65 = i65;
                    break;
                case -2056634346:
                case 1829678933:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    int i88 = i68;
                    i69 = i69;
                    listMo2840 = listMo2840;
                    i74 = i74;
                    i80 = i80;
                    abstractC12388 = abstractC123810;
                    enumC22632 = enumC22634;
                    i83 = i83;
                    i85 = i85;
                    c88510 = c88510;
                    if (i80 == i88) {
                        i68 = i88;
                        abstractC12387 = abstractC12388;
                        i80 = i80;
                        i39 = i86;
                        int iM27614 = (i58 - C0619.m2761("ۗۘ")) * (-83);
                        i85 = i85;
                        i67 = i67;
                        i86 = i39;
                        c88510 = c88510;
                        str3 = str3;
                        i83 = i83;
                        enumC22634 = enumC22632;
                        i74 = i74;
                        abstractC123810 = abstractC12387;
                        c106210 = c106210;
                        i61 = i61;
                        i62 = i62;
                        iM7976 = iM7976;
                        listMo2840 = listMo2840;
                        i60 = iM27614 ^ 1503071324;
                        i59 = ((iM27614 ^ i57) * 18487) ^ 730881827;
                        i87 = i87;
                        i69 = i69;
                        i65 = i65;
                        viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    } else {
                        iM31614 = C0773.m3169("ۘ᩹") ^ i58;
                        i68 = i88;
                        i59 = ((iM31614 ^ i57) * 28033) ^ (-729779875);
                        i41 = 822425908;
                        listMo2840 = listMo2840;
                        i85 = i85;
                        abstractC123810 = abstractC12388;
                        i80 = i80;
                        c88510 = c88510;
                        str3 = str3;
                        i83 = i83;
                        enumC22634 = enumC22632;
                        i74 = i74;
                        i69 = i69;
                        i61 = i61;
                        i62 = i62;
                        iM7976 = iM7976;
                        viewOnClickListenerC21203 = viewOnClickListenerC21202;
                        i60 = iM31614 ^ i41;
                        i87 = i87;
                        i65 = i65;
                    }
                    break;
                case -2054964279:
                case 752401552:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i67 = i67;
                    i69 = i69;
                    listMo2840 = listMo2840;
                    i74 = i74;
                    i80 = i80;
                    enumC22632 = enumC22634;
                    i83 = i83;
                    i85 = i85;
                    c88510 = c88510;
                    c106210 = c106210;
                    i38 = i86;
                    abstractC12386 = (AbstractC12384) C3690.m11998(listMo2840, i85);
                    c23418M55494 = c24910.m55494(abstractC12386);
                    if (c23418M55494 == null) {
                        abstractC123810 = abstractC12386;
                        i83 = i83;
                        z3 = z5;
                        i47 = i85;
                        z7 = z3;
                        c88512 = c88510;
                        i70 = i47;
                        c88511 = c88514;
                        z6 = z8;
                        int iM316110 = C0773.m3169("֨۠") ^ i57;
                        i67 = i67;
                        i85 = i85;
                        i86 = i38;
                        i80 = i80;
                        c88510 = c88510;
                        i87 = i87;
                        str3 = str3;
                        enumC22634 = enumC22632;
                        i74 = i74;
                        i69 = i69;
                        c106210 = c106210;
                        i65 = i65;
                        i62 = i62;
                        iM7976 = iM7976;
                        listMo2840 = listMo2840;
                        i60 = iM316110 ^ 1753192764;
                        i59 = ((iM316110 ^ i58) * (-2717)) ^ (-2118321898);
                    } else {
                        i67 = i67;
                        int iM31621 = C0773.m3169("ۗۡ") ^ i57;
                        i59 = ((iM31621 ^ i58) * (-7251)) ^ 445219516;
                        i85 = i85;
                        i86 = i38;
                        i80 = i80;
                        c88510 = c88510;
                        i87 = i87;
                        str3 = str3;
                        i83 = i83;
                        enumC22634 = enumC22632;
                        i74 = i74;
                        i69 = i69;
                        abstractC123810 = abstractC12386;
                        c106210 = c106210;
                        i65 = i65;
                        i62 = i62;
                        iM7976 = iM7976;
                        listMo2840 = listMo2840;
                        i60 = iM31621 ^ (-52550866);
                    }
                    i61 = i61;
                    viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    break;
                case -2028295104:
                case -445970863:
                    z16 = false;
                    iM27610 = C0773.m3169("ۛ֡") ^ i57;
                    i53 = ((iM27610 ^ i58) * (-681)) ^ 420065668;
                    i54 = 509524125;
                    i60 = iM27610 ^ i54;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    iM7976 = iM7976;
                    i59 = i53;
                    i62 = i62;
                    break;
                case -2027060564:
                case -408468667:
                    z10 = true;
                    iM2761 = (C0619.m2761("ܺ۠") + i57) * (-77);
                    i3 = ((iM2761 ^ i58) * 30165) ^ (-109032317);
                    i4 = -783918316;
                    i60 = iM2761 ^ i4;
                    i59 = i3;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case -1981602637:
                case 720171677:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i25 = i87;
                    str2 = str3;
                    i62 = i62;
                    i69 = i69;
                    list3 = listMo2840;
                    i26 = i74;
                    i27 = i80;
                    enumC22631 = enumC22634;
                    i28 = i83;
                    i34 = i85;
                    c8853 = c88510;
                    boolean z22 = c23418M55494.f75800;
                    abstractC12384 = abstractC123810;
                    c10628 = c106210;
                    i29 = i86;
                    strM2049 = RunnableC0334.m2049(f67679, 291, 1, i29);
                    if (z22) {
                        iM2768 = C0773.m3169("֨۫") ^ i57;
                        i35 = ((iM2768 ^ i58) * (-16113)) ^ (-1390844375);
                        i40 = 1515044479;
                    } else {
                        iM2768 = (C0619.m2761("ۘ᩺") ^ i57) * 69;
                        i35 = ((iM2768 ^ i58) * (-67)) ^ 1365073701;
                        i40 = -1888875149;
                    }
                    i37 = iM2768 ^ i40;
                    i85 = i34;
                    i86 = i29;
                    i80 = i27;
                    c88510 = c8853;
                    i87 = i25;
                    str3 = str2;
                    i83 = i28;
                    enumC22634 = enumC22631;
                    i74 = i26;
                    abstractC123810 = abstractC12384;
                    c106210 = c10628;
                    i65 = i65;
                    i62 = i62;
                    iM7976 = iM7976;
                    listMo2840 = list3;
                    i60 = i37;
                    i59 = i35;
                    i69 = i69;
                    i61 = i61;
                    viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    break;
                case -1980637639:
                case 241128887:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    c8852 = c8858;
                    arrayList2 = arrayList6;
                    i69 = i69;
                    list2 = listMo2840;
                    i74 = i74;
                    i80 = i80;
                    abstractC12384 = abstractC123810;
                    enumC22632 = enumC22634;
                    i83 = i83;
                    i85 = i85;
                    c88510 = c88510;
                    c10628 = c106210;
                    i32 = i86;
                    interfaceC8631 = (InterfaceC8631) C0950.m3796(itM2357);
                    interfaceC7140Mo13175 = interfaceC8631.mo13175();
                    if (interfaceC7140Mo13175 != null) {
                        iM31612 = (C0773.m3169("ᩳܿ") + i57) * (-123);
                        i59 = ((iM31612 ^ i58) * 2905) ^ 1191806542;
                        i33 = 1198706256;
                    } else {
                        c8854 = c8852;
                        c8855 = c8854;
                        interfaceC7141 = interfaceC7140Mo13175;
                        interfaceC7145 = interfaceC7141;
                        c88513 = c8854;
                        str4 = str5;
                        c8859 = c8855;
                        z4 = z21;
                        iM31612 = C0773.m3169("ۙܰ") ^ i58;
                        i59 = ((iM31612 ^ i57) * (-7937)) ^ (-163186815);
                        i33 = 2084090902;
                    }
                    i31 = iM31612 ^ i33;
                    i85 = i85;
                    arrayList6 = arrayList2;
                    i86 = i32;
                    i80 = i80;
                    c88510 = c88510;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    enumC22634 = enumC22632;
                    i74 = i74;
                    c8858 = c8852;
                    abstractC123810 = abstractC12384;
                    c106210 = c10628;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM7976 = iM7976;
                    i60 = i31;
                    i69 = i69;
                    listMo2840 = list2;
                    viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    break;
                case -1979113936:
                case 245766088:
                    i22 = i86;
                    C1519.m5406(arrayList6, c88513.m23709(interfaceC8631.mo6804(), RunnableC3055.m9941(interfaceC8631), interfaceC8631.getParameters(), interfaceC8631.mo6802(), interfaceC8631.mo13184(), interfaceC8631.getAnnotations(), interfaceC8631.mo13176(), interfaceC7145));
                    list = listMo2840;
                    str = str3;
                    i23 = i66;
                    z21 = z4;
                    str5 = str4;
                    i24 = i85;
                    c8851 = c8859;
                    int iM31622 = C0773.m3169("ۚ۬") ^ i58;
                    i60 = iM31622 ^ (-783669224);
                    i86 = i22;
                    i85 = i24;
                    str3 = str;
                    i66 = i23;
                    c8858 = c8851;
                    i59 = ((iM31622 ^ i57) * (-1129)) ^ (-173464591);
                    listMo2840 = list;
                    iM7976 = iM7976;
                    viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    break;
                case -1939692147:
                case -1485954641:
                    arrayList5 = new ArrayList();
                    arrayList6 = new ArrayList();
                    strMo20400 = c22737.mo20400();
                    itM47859 = C20932.m47859(c22737.getFields());
                    iM31611 = (i57 - C0773.m3169("ۛܺ")) * 27;
                    i20 = ((iM31611 ^ i58) * 18231) ^ (-1624619394);
                    i21 = -355654887;
                    i86 = i86;
                    str3 = str3;
                    i85 = i85;
                    c8858 = c8858;
                    i60 = iM31611 ^ i21;
                    i66 = i66;
                    i59 = i20;
                    listMo2840 = listMo2840;
                    iM7976 = iM7976;
                    viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    break;
                case -1937833115:
                case 2026801:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i69 = i69;
                    listMo2840 = listMo2840;
                    i74 = i74;
                    i80 = i80;
                    abstractC123810 = abstractC123810;
                    enumC22632 = enumC22634;
                    i83 = i83;
                    i85 = i85;
                    c88510 = c88510;
                    switch (C4048.f13789[C2702.m8885(C0862.m3506(abstractC123810))]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                            iM2769 = C0619.m2761("᩸ۧ") ^ i57;
                            i42 = ((iM2769 ^ i58) * 27389) ^ (-1809573762);
                            i43 = -165856930;
                            i46 = iM2769 ^ i43;
                            listMo2840 = listMo2840;
                            i85 = i85;
                            abstractC123810 = abstractC123810;
                            i80 = i80;
                            c88510 = c88510;
                            str3 = str3;
                            i83 = i83;
                            enumC22634 = enumC22632;
                            i74 = i74;
                            i69 = i69;
                            i61 = i61;
                            i62 = i62;
                            iM7976 = iM7976;
                            viewOnClickListenerC21203 = viewOnClickListenerC21202;
                            i60 = i46;
                            i59 = i42;
                            i87 = i87;
                            i65 = i65;
                            break;
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                            iM2769 = C0619.m2761("ܶۖ") ^ i58;
                            i42 = ((iM2769 ^ i57) * 11533) ^ 290430750;
                            i43 = -259403537;
                            i46 = iM2769 ^ i43;
                            listMo2840 = listMo2840;
                            i85 = i85;
                            abstractC123810 = abstractC123810;
                            i80 = i80;
                            c88510 = c88510;
                            str3 = str3;
                            i83 = i83;
                            enumC22634 = enumC22632;
                            i74 = i74;
                            i69 = i69;
                            i61 = i61;
                            i62 = i62;
                            iM7976 = iM7976;
                            viewOnClickListenerC21203 = viewOnClickListenerC21202;
                            i60 = i46;
                            i59 = i42;
                            i87 = i87;
                            i65 = i65;
                            break;
                        default:
                            abstractC12386 = abstractC123810;
                            i67 = i67;
                            i38 = i86;
                            abstractC123810 = abstractC12386;
                            i83 = i83;
                            z3 = z5;
                            i47 = i85;
                            z7 = z3;
                            c88512 = c88510;
                            i70 = i47;
                            c88511 = c88514;
                            z6 = z8;
                            int iM316111 = C0773.m3169("֨۠") ^ i57;
                            i67 = i67;
                            i85 = i85;
                            i86 = i38;
                            i80 = i80;
                            c88510 = c88510;
                            i87 = i87;
                            str3 = str3;
                            enumC22634 = enumC22632;
                            i74 = i74;
                            i69 = i69;
                            c106210 = c106210;
                            i65 = i65;
                            i62 = i62;
                            iM7976 = iM7976;
                            listMo2840 = listMo2840;
                            i60 = iM316111 ^ 1753192764;
                            i59 = ((iM316111 ^ i58) * (-2717)) ^ (-2118321898);
                            i61 = i61;
                            viewOnClickListenerC21203 = viewOnClickListenerC21202;
                            break;
                    }
                    break;
                case -1933661591:
                case -617401356:
                    i65 = i65;
                    iM7976 = iM7976;
                    i62 = i62;
                    c23418M55494 = c23418M55494;
                    arrayList4 = arrayList4;
                    if (C2702.m8879(arrayList4) <= 1) {
                        c23418M55494 = c23418M55494;
                        i78 = i63;
                        z14 = z12;
                        iM31610 = (i58 - C0773.m3169("֫ۖ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM31610 ^ i57) * (-3645)) ^ (-2084084604);
                        i6 = 540944807;
                        i60 = iM31610 ^ i6;
                        arrayList4 = arrayList4;
                        i59 = i5;
                        i65 = i65;
                        i62 = i62;
                        iM7976 = iM7976;
                    } else {
                        iM2763 = (C0773.m3169("᩻ܺ") ^ i58) * 87;
                        i9 = ((iM2763 ^ i57) * 24981) ^ (-762034282);
                        i10 = -1559158254;
                        i60 = iM2763 ^ i10;
                        arrayList4 = arrayList4;
                        i59 = i9;
                        i65 = i65;
                        c23418M55494 = c23418M55494;
                        i62 = i62;
                        iM7976 = iM7976;
                    }
                    break;
                case -1891330719:
                case 1348697032:
                    arrayList4 = arrayList4;
                    itM4942 = C1343.m4942(arrayList4);
                    i61 = i63;
                    iM2763 = (C0773.m3169("ܶܺ") + i57) * 31;
                    i9 = ((iM2763 ^ i58) * (-8253)) ^ 880578460;
                    i10 = -1940138340;
                    i60 = iM2763 ^ i10;
                    arrayList4 = arrayList4;
                    i59 = i9;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case -1888299916:
                case 1161084432:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i80 = i80;
                    enumC22632 = enumC22634;
                    i83 = i83;
                    i85 = i85;
                    c88510 = c88510;
                    itM2358.remove();
                    iM2769 = (i58 - C0773.m3169("ۖ᩹")) * (-27);
                    i42 = ((iM2769 ^ i57) * 10229) ^ (-573271456);
                    i43 = -237318259;
                    i46 = iM2769 ^ i43;
                    listMo2840 = listMo2840;
                    i85 = i85;
                    abstractC123810 = abstractC123810;
                    i80 = i80;
                    c88510 = c88510;
                    str3 = str3;
                    i83 = i83;
                    enumC22634 = enumC22632;
                    i74 = i74;
                    i69 = i69;
                    i61 = i61;
                    i62 = i62;
                    iM7976 = iM7976;
                    viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    i60 = i46;
                    i59 = i42;
                    i87 = i87;
                    i65 = i65;
                    break;
                case -1884419491:
                case -486956417:
                    z15 = false;
                    iM27610 = C0619.m2761("ۛ᩸") ^ i58;
                    i53 = ((iM27610 ^ i57) * 5193) ^ 1624867750;
                    i54 = 58175251;
                    i60 = iM27610 ^ i54;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    iM7976 = iM7976;
                    i59 = i53;
                    i62 = i62;
                    break;
                case -1878911689:
                case 1393938505:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i25 = i87;
                    str2 = str3;
                    i62 = i62;
                    C8850 c88516 = c8858;
                    interfaceC7142 = interfaceC7140Mo13175;
                    arrayList3 = arrayList6;
                    list2 = listMo2840;
                    i26 = i74;
                    i27 = i80;
                    abstractC12384 = abstractC123810;
                    enumC22631 = enumC22634;
                    i28 = i83;
                    i34 = i85;
                    c8853 = c88510;
                    c10628 = c106210;
                    i29 = i86;
                    interfaceC7140M23710 = c88516.m23710(interfaceC7142);
                    i67 = 3;
                    if (atomicInteger3 != null) {
                        int iM31623 = C0773.m3169("᩶ۚ") ^ i57;
                        int i89 = ((iM31623 ^ i58) * (-8015)) ^ 265366863;
                        interfaceC7140Mo13175 = interfaceC7142;
                        i85 = i34;
                        arrayList6 = arrayList3;
                        i86 = i29;
                        i80 = i27;
                        c88510 = c8853;
                        i87 = i25;
                        str3 = str2;
                        i83 = i28;
                        enumC22634 = enumC22631;
                        i74 = i26;
                        i60 = iM31623 ^ 1041170283;
                        c8858 = c88516;
                        abstractC123810 = abstractC12384;
                        c106210 = c10628;
                        i65 = i65;
                        i61 = i61;
                        i62 = i62;
                        iM7976 = iM7976;
                        i64 = 5;
                        i69 = 6;
                        i59 = i89;
                    } else {
                        c8852 = c88516;
                        i64 = 5;
                        i69 = 6;
                        int iM31624 = C0773.m3169("ᩳۤ") ^ i58;
                        interfaceC7140 = interfaceC7142;
                        i59 = ((iM31624 ^ i57) * 15897) ^ (-112620589);
                        i31 = iM31624 ^ 1285357652;
                        i85 = i34;
                        arrayList6 = arrayList3;
                        i86 = i29;
                        i80 = i27;
                        c88510 = c8853;
                        i87 = i25;
                        str3 = str2;
                        i83 = i28;
                        enumC22634 = enumC22631;
                        i74 = i26;
                        interfaceC7140Mo13175 = interfaceC7140;
                        c8858 = c8852;
                        abstractC123810 = abstractC12384;
                        c106210 = c10628;
                        i65 = i65;
                        i61 = i61;
                        i62 = i62;
                        iM7976 = iM7976;
                        i60 = i31;
                        i69 = i69;
                    }
                    listMo2840 = list2;
                    viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    break;
                case -1839865793:
                case -1087936761:
                    z16 = true;
                    iM27610 = C0773.m3169("ۛ֡") ^ i57;
                    i53 = ((iM27610 ^ i58) * (-681)) ^ 420065668;
                    i54 = 509524125;
                    i60 = iM27610 ^ i54;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    iM7976 = iM7976;
                    i59 = i53;
                    i62 = i62;
                    break;
                case -1835315110:
                case 1611804914:
                    i65 = i65;
                    iM7976 = iM7976;
                    i62 = i62;
                    arrayList4 = arrayList4;
                    if ((c23418M55494.f75805 & 1) != 0) {
                        iM31610 = C0619.m2761("ۡ֡") ^ i57;
                        i5 = ((iM31610 ^ i58) * 2475) ^ (-1884753732);
                        i6 = -609193117;
                    } else {
                        iM31610 = (i58 - C0619.m2761("۬᩷")) * 51;
                        i5 = ((iM31610 ^ i57) * (-28435)) ^ 759741985;
                        i6 = 920268134;
                    }
                    i60 = iM31610 ^ i6;
                    arrayList4 = arrayList4;
                    i59 = i5;
                    i65 = i65;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case -1832950801:
                case 1158715598:
                    InterfaceC2665 interfaceC2665 = (InterfaceC2665) C4238.m13529(itM47859);
                    RunnableC0334.m2054(arrayList5, c8850.m23713(interfaceC2665.mo4500(), interfaceC2665.getName(), interfaceC2665.getType(), interfaceC2665.mo8823(), interfaceC2665.mo8822(), interfaceC2665.getAnnotations(), interfaceC2665.mo8821()));
                    iM31611 = (i57 - C0773.m3169("ۛܺ")) * 27;
                    i20 = ((iM31611 ^ i58) * 18231) ^ (-1624619394);
                    i21 = -355654887;
                    i86 = i86;
                    str3 = str3;
                    i85 = i85;
                    c8858 = c8858;
                    i60 = iM31611 ^ i21;
                    i66 = i66;
                    i59 = i20;
                    listMo2840 = listMo2840;
                    iM7976 = iM7976;
                    viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    break;
                case -1821626410:
                case 226665178:
                    z13 = true;
                    iM27610 = (i57 - C0619.m2761("ۨۗ")) * 49;
                    i53 = ((iM27610 ^ i58) * 30189) ^ 1758220174;
                    i54 = -1877433926;
                    i60 = iM27610 ^ i54;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    iM7976 = iM7976;
                    i59 = i53;
                    i62 = i62;
                    break;
                case -1819952738:
                case 1334878990:
                    i65 = i65;
                    iM7976 = iM7976;
                    i62 = i62;
                    c23418M55494 = c23418M55494;
                    i84 = i61 + 1;
                    c106210.m27107(i61, new C11131(EnumC22631.f73304, 0, 0, 0, 0, 0, 0, c88515.f74918.m17100(viewOnClickListenerC21203.f67683.f51821)));
                    if (atomicInteger3 == null) {
                        arrayList4 = arrayList4;
                        i11 = i84;
                        i82 = i84;
                        i84 = i11;
                        iM2763 = (C0619.m2761("ܽ᩶") ^ i58) * 33;
                        i9 = ((iM2763 ^ i57) * 5045) ^ 1484472786;
                        i10 = -142064146;
                        i60 = iM2763 ^ i10;
                        arrayList4 = arrayList4;
                        i59 = i9;
                        i65 = i65;
                        c23418M55494 = c23418M55494;
                        i62 = i62;
                        iM7976 = iM7976;
                    } else {
                        iM2764 = C0773.m3169("֫ۜ") ^ i58;
                        i12 = ((iM2764 ^ i57) * 26259) ^ 1714518583;
                        i13 = -1388406176;
                        i60 = iM2764 ^ i13;
                        i59 = i12;
                        i65 = i65;
                        c23418M55494 = c23418M55494;
                        i62 = i62;
                        iM7976 = iM7976;
                    }
                    break;
                case -1816327308:
                case -1182913552:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i66 = i66;
                    arrayList = arrayList5;
                    c8858 = c8858;
                    interfaceC7140Mo13175 = interfaceC7140Mo13175;
                    i69 = i69;
                    listMo2840 = listMo2840;
                    i74 = i74;
                    i80 = i80;
                    abstractC123810 = abstractC123810;
                    enumC22634 = enumC22634;
                    i83 = i83;
                    i85 = i85;
                    c88510 = c88510;
                    c106210 = c106210;
                    i14 = i86;
                    short s = f67679[281];
                    int i90 = s + 1;
                    if ((i90 * i90) - ((s * 2) + 1) >= 0) {
                        iM2765 = (i57 - C0773.m3169("֡ۡ")) * (-19);
                        i15 = ((iM2765 ^ i58) * (-8047)) ^ 425598669;
                        i16 = -189560151;
                    } else {
                        iM2765 = C0619.m2761("ۧۤ") ^ i58;
                        i15 = ((iM2765 ^ i57) * (-20657)) ^ (-1758132334);
                        i16 = 571495687;
                    }
                    i17 = iM2765 ^ i16;
                    arrayList5 = arrayList;
                    i86 = i14;
                    i80 = i80;
                    c88510 = c88510;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    enumC22634 = enumC22634;
                    i74 = i74;
                    i85 = i85;
                    interfaceC7140Mo13175 = interfaceC7140Mo13175;
                    c8858 = c8858;
                    abstractC123810 = abstractC123810;
                    c106210 = c106210;
                    i65 = i65;
                    i62 = i62;
                    iM7976 = iM7976;
                    i60 = i17;
                    i66 = i66;
                    i59 = i15;
                    i69 = i69;
                    listMo2840 = listMo2840;
                    i61 = i61;
                    viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    break;
                case -1808414204:
                case -307077601:
                    ((C17450) C4238.m13529(itM4942)).m40948(c88515, c106210, i61);
                    i61++;
                    arrayList4 = arrayList4;
                    iM2763 = (C0773.m3169("ܶܺ") + i57) * 31;
                    i9 = ((iM2763 ^ i58) * (-8253)) ^ 880578460;
                    i10 = -1940138340;
                    i60 = iM2763 ^ i10;
                    arrayList4 = arrayList4;
                    i59 = i9;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case -1807583345:
                case -1571392127:
                    i50 = iM7976;
                    i51 = i85;
                    c8856 = c88510;
                    InterfaceC6177 interfaceC6178 = (InterfaceC6177) abstractC123810;
                    i52 = 0;
                    arrayListM38074 = viewOnClickListenerC21203.f67683.m38074(interfaceC6178);
                    i63 = i51;
                    interfaceC6177 = interfaceC6178;
                    c8857 = c8856;
                    z12 = z5;
                    r80 = z8;
                    int iM27615 = C0619.m2761("᩶ۤ") ^ i58;
                    C8850 c88517 = c8857;
                    i59 = ((iM27615 ^ i57) * 3483) ^ (-224836871);
                    i85 = i51;
                    i83 = i83;
                    enumC22634 = enumC22634;
                    c88510 = c8856;
                    i62 = i52;
                    i87 = i87;
                    c88515 = c88517;
                    i65 = i65;
                    i61 = i61;
                    iM7976 = i50;
                    i60 = iM27615 ^ (-2038285143);
                    str3 = str3;
                    break;
                case -1796086372:
                case -1546351645:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i25 = i87;
                    str2 = str3;
                    i62 = i62;
                    c8852 = c8858;
                    interfaceC7140 = interfaceC7140Mo13175;
                    i69 = i69;
                    list2 = listMo2840;
                    i26 = i74;
                    i27 = i80;
                    abstractC12384 = abstractC123810;
                    enumC22631 = enumC22634;
                    i28 = i83;
                    int i91 = i85;
                    c8853 = c88510;
                    c10628 = c106210;
                    i29 = i86;
                    if (C3998.m12923(itM2357)) {
                        iM2767 = (i58 - C0619.m2761("᩹ܽ")) * 55;
                        i59 = ((iM2767 ^ i57) * (-17079)) ^ 855202388;
                        i30 = -1861919772;
                    } else {
                        iM2767 = (C0619.m2761("ۘۡ") ^ i57) * (-29);
                        i59 = ((iM2767 ^ i58) * 19271) ^ (-1101847261);
                        i30 = 1025996299;
                    }
                    i31 = iM2767 ^ i30;
                    i85 = i91;
                    i86 = i29;
                    i80 = i27;
                    c88510 = c8853;
                    i87 = i25;
                    str3 = str2;
                    i83 = i28;
                    enumC22634 = enumC22631;
                    i74 = i26;
                    interfaceC7140Mo13175 = interfaceC7140;
                    c8858 = c8852;
                    abstractC123810 = abstractC12384;
                    c106210 = c10628;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM7976 = iM7976;
                    i60 = i31;
                    i69 = i69;
                    listMo2840 = list2;
                    viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    break;
                case -1763502473:
                case 1817660888:
                    i87 = 0;
                    iM7976 = C2354.m7976(zArr.length, C2288.m7752(arrayListM38074));
                    iM2763 = C0773.m3169("ᩴ۠") ^ i58;
                    i9 = ((iM2763 ^ i57) * (-15999)) ^ (-601612358);
                    i10 = -1941326888;
                    i60 = iM2763 ^ i10;
                    arrayList4 = arrayList4;
                    i59 = i9;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case -1735804942:
                case 912367866:
                    i65 = i65;
                    iM7976 = iM7976;
                    i62 = i62;
                    arrayList4 = new ArrayList();
                    c4 = 4;
                    if (z10) {
                        iM2762 = C0773.m3169("ۡۢ") ^ i57;
                        i7 = ((iM2762 ^ i58) * (-11997)) ^ (-1048781735);
                        i8 = -140465262;
                    } else {
                        iM2762 = (C0619.m2761("ܿ۫") ^ i58) * (-69);
                        i7 = ((iM2762 ^ i57) * 21993) ^ 98204454;
                        i8 = -1985721507;
                    }
                    i60 = iM2762 ^ i8;
                    i59 = i7;
                    i65 = i65;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case -1705879107:
                case -199262418:
                    iM7976 = iM7976;
                    int i92 = i61;
                    int i93 = i62;
                    if (i93 < 2) {
                        iM3169 = C0773.m3169("ܰ۠") ^ i57;
                        i = ((iM3169 ^ i58) * (-15381)) ^ (-1066144105);
                        i2 = 268029028;
                    } else {
                        iM3169 = C0773.m3169("ᩴ֨") ^ i58;
                        i = ((iM3169 ^ i57) * 18759) ^ 874932607;
                        i2 = -1670902030;
                    }
                    i60 = iM3169 ^ i2;
                    i62 = i93;
                    i59 = i;
                    i65 = i65;
                    i61 = i92;
                    iM7976 = iM7976;
                    break;
                case -1658537856:
                case -1103184064:
                    i66 = i66;
                    atomicInteger2 = null;
                    atomicInteger3 = atomicInteger2;
                    iM31611 = C0773.m3169("֨ۖ") ^ i57;
                    i20 = ((iM31611 ^ i58) * (-27211)) ^ 1258085725;
                    i21 = -449278137;
                    i86 = i86;
                    str3 = str3;
                    i85 = i85;
                    c8858 = c8858;
                    i60 = iM31611 ^ i21;
                    i66 = i66;
                    i59 = i20;
                    listMo2840 = listMo2840;
                    iM7976 = iM7976;
                    viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    break;
                case -1615253671:
                case 1869693936:
                    boolean[] zArr2 = new boolean[6];
                    zArr2[0] = z13;
                    zArr2[r80] = false;
                    zArr2[c2] = false;
                    zArr2[c] = false;
                    zArr2[c4] = false;
                    zArr2[c3] = false;
                    zArr = zArr2;
                    iM27610 = (C0773.m3169("ۜ֨") + i58) * (-63);
                    i53 = ((iM27610 ^ i57) * (-18533)) ^ 1602402123;
                    i54 = 1546224578;
                    i60 = iM27610 ^ i54;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    iM7976 = iM7976;
                    i59 = i53;
                    i62 = i62;
                    break;
                case -1532167468:
                case -1391254213:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    InterfaceC7140 interfaceC7146 = interfaceC7144;
                    i69 = i69;
                    listMo2840 = listMo2840;
                    i74 = i74;
                    i80 = i80;
                    abstractC12388 = abstractC123810;
                    enumC22632 = enumC22634;
                    i83 = i83;
                    i85 = i85;
                    c88510 = c88510;
                    if (!(interfaceC7146 instanceof C10628)) {
                        interfaceC7144 = interfaceC7146;
                        list2 = listMo2840;
                        abstractC12384 = abstractC12388;
                        c10628 = c106210;
                        c8854 = c88510;
                        c8852 = c8858;
                        c8855 = c88514;
                        arrayList2 = arrayList6;
                        interfaceC7141 = interfaceC7144;
                        i32 = i86;
                        interfaceC7145 = interfaceC7141;
                        c88513 = c8854;
                        str4 = str5;
                        c8859 = c8855;
                        z4 = z21;
                        iM31612 = C0773.m3169("ۙܰ") ^ i58;
                        i59 = ((iM31612 ^ i57) * (-7937)) ^ (-163186815);
                        i33 = 2084090902;
                        i31 = iM31612 ^ i33;
                        i85 = i85;
                        arrayList6 = arrayList2;
                        i86 = i32;
                        i80 = i80;
                        c88510 = c88510;
                        i87 = i87;
                        str3 = str3;
                        i83 = i83;
                        enumC22634 = enumC22632;
                        i74 = i74;
                        c8858 = c8852;
                        abstractC123810 = abstractC12384;
                        c106210 = c10628;
                        i65 = i65;
                        i61 = i61;
                        i62 = i62;
                        iM7976 = iM7976;
                        i60 = i31;
                        i69 = i69;
                        listMo2840 = list2;
                        viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    } else {
                        iM31614 = C0773.m3169("ۙ۠") ^ i57;
                        interfaceC7144 = interfaceC7146;
                        i59 = ((iM31614 ^ i58) * 2403) ^ (-2031229863);
                        i41 = -2006625578;
                        listMo2840 = listMo2840;
                        i85 = i85;
                        abstractC123810 = abstractC12388;
                        i80 = i80;
                        c88510 = c88510;
                        str3 = str3;
                        i83 = i83;
                        enumC22634 = enumC22632;
                        i74 = i74;
                        i69 = i69;
                        i61 = i61;
                        i62 = i62;
                        iM7976 = iM7976;
                        viewOnClickListenerC21203 = viewOnClickListenerC21202;
                        i60 = iM31614 ^ i41;
                        i87 = i87;
                        i65 = i65;
                    }
                    break;
                case -1458697504:
                case 506595553:
                    iM7976 = iM7976;
                    i87++;
                    iM2763 = C0773.m3169("ᩴ۠") ^ i58;
                    i9 = ((iM2763 ^ i57) * (-15999)) ^ (-601612358);
                    i10 = -1941326888;
                    i60 = iM2763 ^ i10;
                    arrayList4 = arrayList4;
                    i59 = i9;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case -1363819215:
                case 1961238157:
                    interfaceC12142 = (InterfaceC12142) abstractC12389;
                    interfaceC12143 = interfaceC12142;
                    iM31616 = C0619.m2761("ۧۜ") ^ i57;
                    i48 = ((iM31616 ^ i58) * 26193) ^ (-562550085);
                    i49 = 1114677251;
                    i85 = i85;
                    enumC22634 = enumC22634;
                    i80 = i80;
                    c88510 = c88510;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    i65 = i65;
                    i62 = i62;
                    iM7976 = iM7976;
                    i60 = iM31616 ^ i49;
                    i59 = i48;
                    i61 = i61;
                    break;
                case -1241623951:
                case 812714630:
                    z17 = false;
                    iM2763 = (C0773.m3169("᩵ۡ") ^ i57) * 37;
                    i9 = ((iM2763 ^ i58) * MLKEMEngine.KyberQ) ^ 909853295;
                    i10 = -800394438;
                    i60 = iM2763 ^ i10;
                    arrayList4 = arrayList4;
                    i59 = i9;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case -1241476254:
                case 1033632047:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i62 = i62;
                    i75 = i63 + 1;
                    if (atomicInteger3 != null) {
                        iM2761 = C0773.m3169("ܽۧ") ^ i57;
                        i3 = ((iM2761 ^ i58) * 19583) ^ 1193828261;
                        i4 = -2043656648;
                    } else {
                        iM2761 = (i57 - C0773.m3169("ܳۘ")) * (-15);
                        i3 = ((iM2761 ^ i58) * (-6449)) ^ 1110025069;
                        i4 = 855044589;
                    }
                    i60 = iM2761 ^ i4;
                    i59 = i3;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case -1221313254:
                case -676621786:
                    z19 = true;
                    iM2764 = (C0773.m3169("ۙۡ") + i58) * 43;
                    i12 = ((iM2764 ^ i57) * (-26857)) ^ (-290614779);
                    i13 = -2088124186;
                    i60 = iM2764 ^ i13;
                    i59 = i12;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case -1175058450:
                case 1139505177:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i62 = i62;
                    c2 = 2;
                    if (z10) {
                        iM2761 = C0619.m2761("ᩴۛ") ^ i58;
                        i3 = ((iM2761 ^ i57) * 26195) ^ (-1383151492);
                        i4 = -1870152972;
                    } else {
                        iM2761 = C0773.m3169("ܽ֫") ^ i57;
                        i3 = ((iM2761 ^ i58) * 19195) ^ 1041220487;
                        i4 = 1751735617;
                    }
                    i60 = iM2761 ^ i4;
                    i59 = i3;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case -1159976088:
                case 1921320909:
                    z18 = false;
                    iM2764 = C0619.m2761("ۧ᩺") ^ i58;
                    i12 = ((iM2764 ^ i57) * 1695) ^ (-1721252372);
                    i13 = -1094982189;
                    i60 = iM2764 ^ i13;
                    i59 = i12;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case -1127718020:
                case -349956376:
                    i65 = i65;
                    iM7976 = iM7976;
                    i62 = i62;
                    c23418M55494 = c23418M55494;
                    arrayList4 = arrayList4;
                    if (((C17450) C1542.m5457(arrayListM38074, i87)).f56757 != -1) {
                        iM2763 = (i57 - C0619.m2761("۫۬")) * (-57);
                        i9 = ((iM2763 ^ i58) * (-15567)) ^ (-2091649351);
                        i10 = -1708518655;
                    } else {
                        iM2763 = C0619.m2761("ۖۢ") ^ i58;
                        i9 = ((iM2763 ^ i57) * (-26669)) ^ 1608114805;
                        i10 = 1823255172;
                    }
                    i60 = iM2763 ^ i10;
                    arrayList4 = arrayList4;
                    i59 = i9;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case -1117984784:
                case -679217616:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i25 = i87;
                    str2 = str3;
                    i62 = i62;
                    i69 = i69;
                    list3 = listMo2840;
                    i26 = i74;
                    i27 = i80;
                    abstractC12384 = abstractC123810;
                    enumC22631 = enumC22634;
                    i28 = i83;
                    i34 = i85;
                    c8853 = c88510;
                    c10628 = c106210;
                    i29 = i86;
                    if (i34 < C3448.m11247(list3)) {
                        iM31613 = (C0619.m2761("ۢ᩺") + i58) * (-7);
                        i35 = ((iM31613 ^ i57) * 15317) ^ (-376794375);
                        i36 = -243492631;
                    } else {
                        iM31613 = C0773.m3169("ܿۡ") ^ i57;
                        i35 = ((iM31613 ^ i58) * 7157) ^ (-322451194);
                        i36 = -1779936292;
                    }
                    i37 = iM31613 ^ i36;
                    i85 = i34;
                    i86 = i29;
                    i80 = i27;
                    c88510 = c8853;
                    i87 = i25;
                    str3 = str2;
                    i83 = i28;
                    enumC22634 = enumC22631;
                    i74 = i26;
                    abstractC123810 = abstractC12384;
                    c106210 = c10628;
                    i65 = i65;
                    i62 = i62;
                    iM7976 = iM7976;
                    listMo2840 = list3;
                    i60 = i37;
                    i59 = i35;
                    i69 = i69;
                    i61 = i61;
                    viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    break;
                case -1102240675:
                case 2107717907:
                    i85 = i70 + 1;
                    enumC22633 = enumC22634;
                    c10629 = c106210;
                    interfaceC7143 = interfaceC7140M23710;
                    z8 = z6;
                    c88514 = c88511;
                    c88510 = c88512;
                    z5 = z7;
                    c3 = 5;
                    int iM31625 = (i57 - C0773.m3169("ܺ֡")) * (-73);
                    interfaceC7140M23710 = interfaceC7143;
                    arrayList6 = arrayList6;
                    i86 = i86;
                    i80 = i80;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    enumC22634 = enumC22633;
                    i74 = i74;
                    abstractC123810 = abstractC123810;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM7976 = iM7976;
                    i60 = iM31625 ^ 1015002638;
                    c106210 = c10629;
                    i59 = ((iM31625 ^ i58) * (-30073)) ^ (-160879519);
                    i69 = i69;
                    viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    break;
                case -1101287402:
                case -658108517:
                    z2 = c23418M55494.f75804;
                    z11 = z2;
                    iM2761 = C0619.m2761("ۘۙ") ^ i58;
                    i3 = ((iM2761 ^ i57) * (-21441)) ^ (-953768249);
                    i4 = 1640376660;
                    i60 = iM2761 ^ i4;
                    i59 = i3;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case -997317542:
                case -474470116:
                    z13 = false;
                    iM27610 = (i57 - C0619.m2761("ۨۗ")) * 49;
                    i53 = ((iM27610 ^ i58) * 30189) ^ 1758220174;
                    i54 = -1877433926;
                    i60 = iM27610 ^ i54;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    iM7976 = iM7976;
                    i59 = i53;
                    i62 = i62;
                    break;
                case -932419102:
                case 567668188:
                    i65 = i65;
                    iM7976 = iM7976;
                    i62 = i62;
                    c23418M55494 = c23418M55494;
                    arrayList4 = arrayList4;
                    if ((i76 & 4) != 0) {
                        iM2763 = C0619.m2761("۫ܳ") ^ i58;
                        i9 = ((iM2763 ^ i57) * 4757) ^ (-1760802420);
                        i10 = 558857367;
                    } else {
                        iM2763 = C0619.m2761("᩶۫") ^ i57;
                        i9 = ((iM2763 ^ i58) * 20559) ^ 492461116;
                        i10 = -431998230;
                    }
                    i60 = iM2763 ^ i10;
                    arrayList4 = arrayList4;
                    i59 = i9;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case -893398003:
                case -286976980:
                    i86 = 40974;
                    int iM27616 = C0619.m2761("ۨ᩵") ^ i58;
                    i15 = ((iM27616 ^ i57) * 2555) ^ (-1362570067);
                    i17 = iM27616 ^ (-17027671);
                    arrayList5 = arrayList5;
                    i80 = i80;
                    c88510 = c88510;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    enumC22634 = enumC22634;
                    i74 = i74;
                    i85 = i85;
                    interfaceC7140Mo13175 = interfaceC7140Mo13175;
                    c8858 = c8858;
                    abstractC123810 = abstractC123810;
                    c106210 = c106210;
                    i65 = i65;
                    i62 = i62;
                    iM7976 = iM7976;
                    i60 = i17;
                    i66 = i66;
                    i59 = i15;
                    i69 = i69;
                    listMo2840 = listMo2840;
                    i61 = i61;
                    viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    break;
                case -869962487:
                case 125331640:
                    i65 = i65;
                    iM7976 = iM7976;
                    i62 = i62;
                    c23418M55494 = c23418M55494;
                    if ((i76 & 16) != 0) {
                        iM2764 = C0773.m3169("ۜܶ") ^ i57;
                        i12 = ((iM2764 ^ i58) * 4563) ^ 1374079906;
                        i13 = 26821285;
                    } else {
                        iM2764 = (C0773.m3169("ۚ֡") ^ i57) * (-37);
                        i12 = ((iM2764 ^ i58) * 30239) ^ 1854895400;
                        i13 = 716975221;
                    }
                    i60 = iM2764 ^ i13;
                    i59 = i12;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case -803771757:
                case -709892607:
                    i65 = i65;
                    iM7976 = iM7976;
                    i62 = i62;
                    c23418M55494 = c23418M55494;
                    arrayList4 = arrayList4;
                    if (zArr[i87]) {
                        iM2763 = (i58 - C0773.m3169("ۤ֨")) * (-77);
                        i9 = ((iM2763 ^ i57) * (-26837)) ^ (-867550762);
                        i10 = 1840496247;
                    } else {
                        iM2763 = C0619.m2761("ۖۢ") ^ i58;
                        i9 = ((iM2763 ^ i57) * (-26669)) ^ 1608114805;
                        i10 = 1823255172;
                    }
                    i60 = iM2763 ^ i10;
                    arrayList4 = arrayList4;
                    i59 = i9;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case -743735149:
                case 1138884800:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i62 = i62;
                    z3 = true;
                    i87 = i87;
                    str3 = str3;
                    i67 = i67;
                    i69 = i69;
                    listMo2840 = listMo2840;
                    i47 = i73;
                    i74 = i74;
                    i80 = i80;
                    enumC22632 = enumC22634;
                    i85 = i85;
                    c88510 = c88510;
                    c106210 = c106210;
                    i38 = i86;
                    z7 = z3;
                    c88512 = c88510;
                    i70 = i47;
                    c88511 = c88514;
                    z6 = z8;
                    int iM316112 = C0773.m3169("֨۠") ^ i57;
                    i67 = i67;
                    i85 = i85;
                    i86 = i38;
                    i80 = i80;
                    c88510 = c88510;
                    i87 = i87;
                    str3 = str3;
                    enumC22634 = enumC22632;
                    i74 = i74;
                    i69 = i69;
                    c106210 = c106210;
                    i65 = i65;
                    i62 = i62;
                    iM7976 = iM7976;
                    listMo2840 = listMo2840;
                    i60 = iM316112 ^ 1753192764;
                    i59 = ((iM316112 ^ i58) * (-2717)) ^ (-2118321898);
                    i61 = i61;
                    viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    break;
                case -693333287:
                case -128532084:
                    z15 = true;
                    iM27610 = C0619.m2761("ۛ᩸") ^ i58;
                    i53 = ((iM27610 ^ i57) * 5193) ^ 1624867750;
                    i54 = 58175251;
                    i60 = iM27610 ^ i54;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    iM7976 = iM7976;
                    i59 = i53;
                    i62 = i62;
                    break;
                case -640998771:
                case 320364762:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i62 = i62;
                    if (i62 == 0) {
                        iM2761 = C0773.m3169("ۙ᩺") ^ i57;
                        i3 = ((iM2761 ^ i58) * 29971) ^ 2083376714;
                        i4 = 831891165;
                    } else {
                        iM2761 = (C0773.m3169("ۖۤ") ^ i58) * 123;
                        i3 = ((iM2761 ^ i57) * (-18453)) ^ (-1157874108);
                        i4 = 1094916876;
                    }
                    i60 = iM2761 ^ i4;
                    i59 = i3;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case -633704820:
                case -329290588:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i80 = i80;
                    enumC22634 = enumC22634;
                    int i94 = i83;
                    i85 = i85;
                    c88510 = c88510;
                    i71 = i85 + 1;
                    if (atomicInteger3 != null) {
                        iM31616 = (C0619.m2761("ܳܺ") ^ i58) * 91;
                        i83 = i94;
                        i48 = ((iM31616 ^ i57) * 10245) ^ 990274427;
                        i49 = 1117527132;
                    } else {
                        i83 = i94;
                        i73 = i71;
                        iM31616 = (i57 - C0619.m2761("ۖ֨")) * 9;
                        i48 = ((iM31616 ^ i58) * 9651) ^ 701452145;
                        i49 = -1000816833;
                    }
                    i85 = i85;
                    enumC22634 = enumC22634;
                    i80 = i80;
                    c88510 = c88510;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    i65 = i65;
                    i62 = i62;
                    iM7976 = iM7976;
                    i60 = iM31616 ^ i49;
                    i59 = i48;
                    i61 = i61;
                    break;
                case -599207204:
                case -543140776:
                    i65 = i65;
                    int iM8879 = i61 - C2702.m8879(arrayList4);
                    c23418M55494 = c23418M55494;
                    StringBuilder sbM10405 = C3188.m10405(str3, strM2049);
                    i62 = i62;
                    C1783.m6237(sbM10405, RunnableC0334.m2051(atomicInteger3));
                    iM7976 = iM7976;
                    c106210.m27108(iM8879, new C24801(0, c88515.m23719(C1080.m4058(sbM10405)), null, null));
                    c106210.m27108(i61 - C2288.m7752(arrayList4), new C12866(atomicInteger3.getAndIncrement()));
                    arrayList4 = arrayList4;
                    i82 = i84;
                    iM2763 = (C0619.m2761("ܽ᩶") ^ i58) * 33;
                    i9 = ((iM2763 ^ i57) * 5045) ^ 1484472786;
                    i10 = -142064146;
                    i60 = iM2763 ^ i10;
                    arrayList4 = arrayList4;
                    i59 = i9;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case -590562626:
                case 907528203:
                    int i95 = iM7976;
                    i61 = i61;
                    int i96 = i87;
                    String str6 = str3;
                    int i97 = i62;
                    ArrayList arrayList7 = arrayList5;
                    C8850 c88518 = c8858;
                    InterfaceC7140 interfaceC7147 = interfaceC7140Mo13175;
                    int i98 = i69;
                    List list4 = listMo2840;
                    int i99 = i74;
                    int i100 = i80;
                    AbstractC12384 abstractC123812 = abstractC123810;
                    EnumC22631 enumC22637 = enumC22634;
                    int i101 = i83;
                    int i102 = i85;
                    C8850 c88519 = c88510;
                    C10628 c106211 = c106210;
                    int i103 = i86;
                    if (z) {
                        iM2766 = (C0773.m3169("۫᩻") ^ i58) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i18 = ((iM2766 ^ i57) * (-22513)) ^ 790947736;
                        i19 = -642933255;
                    } else {
                        iM2766 = C0619.m2761("ۤܶ") ^ i57;
                        i18 = ((iM2766 ^ i58) * 1833) ^ 996933042;
                        i19 = 1259761419;
                    }
                    int i104 = iM2766 ^ i19;
                    viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    arrayList5 = arrayList7;
                    i86 = i103;
                    i80 = i100;
                    c88510 = c88519;
                    i87 = i96;
                    str3 = str6;
                    i83 = i101;
                    enumC22634 = enumC22637;
                    i74 = i99;
                    i85 = i102;
                    interfaceC7140Mo13175 = interfaceC7147;
                    c8858 = c88518;
                    abstractC123810 = abstractC123812;
                    c106210 = c106211;
                    i65 = i65;
                    i62 = i97;
                    iM7976 = i95;
                    i66 = 1;
                    i60 = i104;
                    i59 = i18;
                    i69 = i98;
                    listMo2840 = list4;
                    i61 = i61;
                    break;
                case -567625409:
                case 1613463766:
                    i65 = i65;
                    iM7976 = iM7976;
                    i62 = i62;
                    c23418M55494 = c23418M55494;
                    arrayList4 = arrayList4;
                    if (C2288.m7752(arrayList4) == 1) {
                        iM2763 = (i58 - C0619.m2761("᩸۬")) * 109;
                        i9 = ((iM2763 ^ i57) * 16121) ^ (-55459312);
                        i10 = -301394346;
                    } else {
                        iM2763 = (C0619.m2761("ܰܶ") ^ i57) * (-47);
                        i9 = ((iM2763 ^ i58) * (-8247)) ^ 1745009483;
                        i10 = 2006276219;
                    }
                    i60 = iM2763 ^ i10;
                    arrayList4 = arrayList4;
                    i59 = i9;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case -515601867:
                case 539756904:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i80 = i80;
                    AbstractC12384 abstractC123813 = abstractC123810;
                    enumC22632 = enumC22634;
                    i85 = i85;
                    c88510 = c88510;
                    int i105 = i85 + 1;
                    if (!viewOnClickListenerC21203.f67683.m38076(c88510, abstractC123813, c106210, i105)) {
                        abstractC12386 = abstractC123813;
                        i83 = i105;
                        i38 = i86;
                        abstractC123810 = abstractC12386;
                        i83 = i83;
                        z3 = z5;
                        i47 = i85;
                        z7 = z3;
                        c88512 = c88510;
                        i70 = i47;
                        c88511 = c88514;
                        z6 = z8;
                        int iM316113 = C0773.m3169("֨۠") ^ i57;
                        i67 = i67;
                        i85 = i85;
                        i86 = i38;
                        i80 = i80;
                        c88510 = c88510;
                        i87 = i87;
                        str3 = str3;
                        enumC22634 = enumC22632;
                        i74 = i74;
                        i69 = i69;
                        c106210 = c106210;
                        i65 = i65;
                        i62 = i62;
                        iM7976 = iM7976;
                        listMo2840 = listMo2840;
                        i60 = iM316113 ^ 1753192764;
                        i59 = ((iM316113 ^ i58) * (-2717)) ^ (-2118321898);
                        i61 = i61;
                        viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    } else {
                        int iM27617 = C0619.m2761("ܶۗ") ^ i58;
                        i44 = ((iM27617 ^ i57) * (-1611)) ^ (-2063227127);
                        i85 = i85;
                        abstractC123810 = abstractC123813;
                        i83 = i105;
                        i80 = i80;
                        c88510 = c88510;
                        i87 = i87;
                        str3 = str3;
                        enumC22634 = enumC22632;
                        i65 = i65;
                        i61 = i61;
                        i62 = i62;
                        iM7976 = iM7976;
                        i60 = iM27617 ^ 1313031678;
                        i59 = i44;
                        viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    }
                    break;
                case -501548870:
                case 1952967859:
                    z2 = c23418M55494.f75801;
                    z11 = z2;
                    iM2761 = C0619.m2761("ۘۙ") ^ i58;
                    i3 = ((iM2761 ^ i57) * (-21441)) ^ (-953768249);
                    i4 = 1640376660;
                    i60 = iM2761 ^ i4;
                    i59 = i3;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case -499948811:
                case 1091206379:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    listMo2840 = listMo2840;
                    int i106 = i74;
                    i80 = i80;
                    abstractC12388 = abstractC123810;
                    i83 = i83;
                    i85 = i85;
                    c88510 = c88510;
                    abstractC12389 = (AbstractC12384) C1542.m5473(listMo2840, i106);
                    EnumC22631 enumC22631M7746 = C2287.m7746(abstractC12389);
                    i74 = i106;
                    if (enumC22631M7746 == EnumC22631.f73236) {
                        enumC22634 = enumC22631M7746;
                        int iM316114 = C0773.m3169("ۗܳ") ^ i57;
                        i42 = ((iM316114 ^ i58) * (-28483)) ^ (-741571296);
                        i46 = iM316114 ^ 2022118740;
                        listMo2840 = listMo2840;
                        i85 = i85;
                        abstractC123810 = abstractC12388;
                        i80 = i80;
                        c88510 = c88510;
                        str3 = str3;
                        i83 = i83;
                        i74 = i74;
                        i61 = i61;
                        i62 = i62;
                        iM7976 = iM7976;
                        viewOnClickListenerC21203 = viewOnClickListenerC21202;
                        i60 = i46;
                        i59 = i42;
                        i87 = i87;
                        i65 = i65;
                    } else {
                        iM31615 = (i57 - C0773.m3169("ۛۢ")) * (-49);
                        enumC22632 = enumC22631M7746;
                        i42 = ((iM31615 ^ i58) * (-32165)) ^ (-997110472);
                        i45 = 1082480497;
                        i46 = iM31615 ^ i45;
                        listMo2840 = listMo2840;
                        i85 = i85;
                        abstractC123810 = abstractC12388;
                        i80 = i80;
                        c88510 = c88510;
                        str3 = str3;
                        i83 = i83;
                        enumC22634 = enumC22632;
                        i74 = i74;
                        i61 = i61;
                        i62 = i62;
                        iM7976 = iM7976;
                        viewOnClickListenerC21203 = viewOnClickListenerC21202;
                        i60 = i46;
                        i59 = i42;
                        i87 = i87;
                        i65 = i65;
                    }
                    break;
                case -415788395:
                case 1386592205:
                    boolean[] zArr3 = new boolean[6];
                    zArr3[0] = z15;
                    zArr3[r80] = z16;
                    zArr3[c2] = z17;
                    zArr3[c] = z18;
                    zArr3[c4] = z19;
                    zArr3[c3] = z20;
                    zArr = zArr3;
                    iM27610 = (C0773.m3169("ۜ֨") + i58) * (-63);
                    i53 = ((iM27610 ^ i57) * (-18533)) ^ 1602402123;
                    i54 = 1546224578;
                    i60 = iM27610 ^ i54;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    iM7976 = iM7976;
                    i59 = i53;
                    i62 = i62;
                    break;
                case -398471402:
                case 335034573:
                    abstractC12385 = abstractC123810;
                    itM2358 = C0487.m2357(interfaceC7140M23710.mo2842());
                    i68 = i64;
                    int iM31626 = (C0773.m3169("۫ᩴ") ^ i58) * 89;
                    i44 = ((iM31626 ^ i57) * 30675) ^ (-990793755);
                    i85 = i85;
                    arrayList6 = arrayList6;
                    i86 = i86;
                    i80 = i80;
                    c88510 = c88510;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    enumC22634 = enumC22634;
                    i74 = i74;
                    abstractC123810 = abstractC12385;
                    c106210 = c106210;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM7976 = iM7976;
                    i60 = iM31626 ^ (-586349169);
                    i69 = i69;
                    listMo2840 = listMo2840;
                    i59 = i44;
                    viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    break;
                case -362338558:
                case 1351545203:
                    i86 = 27308;
                    int iM27618 = C0619.m2761("ۨ᩵") ^ i58;
                    i15 = ((iM27618 ^ i57) * 2555) ^ (-1362570067);
                    i17 = iM27618 ^ (-17027671);
                    arrayList5 = arrayList5;
                    i80 = i80;
                    c88510 = c88510;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    enumC22634 = enumC22634;
                    i74 = i74;
                    i85 = i85;
                    interfaceC7140Mo13175 = interfaceC7140Mo13175;
                    c8858 = c8858;
                    abstractC123810 = abstractC123810;
                    c106210 = c106210;
                    i65 = i65;
                    i62 = i62;
                    iM7976 = iM7976;
                    i60 = i17;
                    i66 = i66;
                    i59 = i15;
                    i69 = i69;
                    listMo2840 = listMo2840;
                    i61 = i61;
                    viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    break;
                case -286450512:
                case 1134276412:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    int i107 = i69;
                    listMo2840 = listMo2840;
                    i74 = i74;
                    i80 = i80;
                    abstractC12388 = abstractC123810;
                    enumC22632 = enumC22634;
                    i83 = i83;
                    i85 = i85;
                    c88510 = c88510;
                    if (i80 == i107) {
                        i69 = i107;
                        abstractC12387 = abstractC12388;
                        i80 = i80;
                        i39 = i86;
                        int iM27619 = (i58 - C0619.m2761("ۗۘ")) * (-83);
                        i85 = i85;
                        i67 = i67;
                        i86 = i39;
                        c88510 = c88510;
                        str3 = str3;
                        i83 = i83;
                        enumC22634 = enumC22632;
                        i74 = i74;
                        abstractC123810 = abstractC12387;
                        c106210 = c106210;
                        i61 = i61;
                        i62 = i62;
                        iM7976 = iM7976;
                        listMo2840 = listMo2840;
                        i60 = iM27619 ^ 1503071324;
                        i59 = ((iM27619 ^ i57) * 18487) ^ 730881827;
                        i87 = i87;
                        i69 = i69;
                        i65 = i65;
                        viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    } else {
                        iM31614 = (C0619.m2761("ۚ۟") ^ i58) * (-5);
                        i69 = i107;
                        i59 = ((iM31614 ^ i57) * 13937) ^ 31122217;
                        i41 = -1418900193;
                        listMo2840 = listMo2840;
                        i85 = i85;
                        abstractC123810 = abstractC12388;
                        i80 = i80;
                        c88510 = c88510;
                        str3 = str3;
                        i83 = i83;
                        enumC22634 = enumC22632;
                        i74 = i74;
                        i69 = i69;
                        i61 = i61;
                        i62 = i62;
                        iM7976 = iM7976;
                        viewOnClickListenerC21203 = viewOnClickListenerC21202;
                        i60 = iM31614 ^ i41;
                        i87 = i87;
                        i65 = i65;
                    }
                    break;
                case -285913105:
                case 1914296908:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i62 = i62;
                    if (c23418M55494.f75802) {
                        iM2761 = (C0619.m2761("ۜ᩺") ^ i57) * (-105);
                        i3 = ((iM2761 ^ i58) * 26555) ^ (-1497015688);
                        i4 = 1736080618;
                    } else {
                        i72 = i63;
                        z9 = z12;
                        iM2761 = C0773.m3169("ۤ᩹") ^ i58;
                        i3 = ((iM2761 ^ i57) * (-27661)) ^ 925672561;
                        i4 = 1615764876;
                    }
                    i60 = iM2761 ^ i4;
                    i59 = i3;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case -277049432:
                case 212789641:
                    i65 = i65;
                    iM7976 = iM7976;
                    i62 = i62;
                    arrayList4 = arrayList4;
                    if (z10) {
                        iM31610 = (C0773.m3169("۬۟") ^ i57) * (-59);
                        i5 = ((iM31610 ^ i58) * (-27811)) ^ 1008240758;
                        i6 = -1116826723;
                    } else {
                        i77 = i78;
                        iM31610 = (C0773.m3169("ۤۧ") + i58) * (-63);
                        i5 = ((iM31610 ^ i57) * (-5589)) ^ (-1423446624);
                        i6 = -983365952;
                    }
                    i60 = iM31610 ^ i6;
                    arrayList4 = arrayList4;
                    i59 = i5;
                    i65 = i65;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case -254340124:
                case 1796244334:
                    i66 = i66;
                    atomicInteger2 = new AtomicInteger(i66);
                    atomicInteger3 = atomicInteger2;
                    iM31611 = C0773.m3169("֨ۖ") ^ i57;
                    i20 = ((iM31611 ^ i58) * (-27211)) ^ 1258085725;
                    i21 = -449278137;
                    i86 = i86;
                    str3 = str3;
                    i85 = i85;
                    c8858 = c8858;
                    i60 = iM31611 ^ i21;
                    i66 = i66;
                    i59 = i20;
                    listMo2840 = listMo2840;
                    iM7976 = iM7976;
                    viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    break;
                case -251896395:
                case 598392816:
                    z20 = false;
                    int iM276110 = C0619.m2761("۬ᩴ") ^ i57;
                    i65 = i65;
                    i59 = ((iM276110 ^ i58) * (-29147)) ^ 1326340224;
                    i60 = iM276110 ^ (-2070458980);
                    i65 = i65;
                    break;
                case -221811046:
                case 845692936:
                    i79 = 1;
                    iM27610 = C0619.m2761("ۨ᩻") ^ i57;
                    i53 = ((iM27610 ^ i58) * (-32441)) ^ 411367205;
                    i54 = -976074534;
                    i60 = iM27610 ^ i54;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    iM7976 = iM7976;
                    i59 = i53;
                    i62 = i62;
                    break;
                case -140465428:
                case 489198336:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i85 = i85;
                    c88510 = c88510;
                    i80 = i80;
                    i83 = i83;
                    enumC22632 = enumC22634;
                    if (i80 == 10) {
                        i80 = i80;
                        i69 = i69;
                        listMo2840 = listMo2840;
                        i74 = i74;
                        abstractC12387 = abstractC123810;
                        i39 = i86;
                        int iM276111 = (i58 - C0619.m2761("ۗۘ")) * (-83);
                        i85 = i85;
                        i67 = i67;
                        i86 = i39;
                        c88510 = c88510;
                        str3 = str3;
                        i83 = i83;
                        enumC22634 = enumC22632;
                        i74 = i74;
                        abstractC123810 = abstractC12387;
                        c106210 = c106210;
                        i61 = i61;
                        i62 = i62;
                        iM7976 = iM7976;
                        listMo2840 = listMo2840;
                        i60 = iM276111 ^ 1503071324;
                        i59 = ((iM276111 ^ i57) * 18487) ^ 730881827;
                        i87 = i87;
                        i69 = i69;
                        i65 = i65;
                        viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    } else {
                        iM2769 = (i58 - C0773.m3169("ۖ᩹")) * (-27);
                        i42 = ((iM2769 ^ i57) * 10229) ^ (-573271456);
                        i43 = -237318259;
                        i46 = iM2769 ^ i43;
                        listMo2840 = listMo2840;
                        i85 = i85;
                        abstractC123810 = abstractC123810;
                        i80 = i80;
                        c88510 = c88510;
                        str3 = str3;
                        i83 = i83;
                        enumC22634 = enumC22632;
                        i74 = i74;
                        i69 = i69;
                        i61 = i61;
                        i62 = i62;
                        iM7976 = iM7976;
                        viewOnClickListenerC21203 = viewOnClickListenerC21202;
                        i60 = i46;
                        i59 = i42;
                        i87 = i87;
                        i65 = i65;
                    }
                    break;
                case -84937272:
                case 1342351915:
                    i65 = i65;
                    iM7976 = iM7976;
                    i62 = i62;
                    StringBuilder sbM10406 = C3188.m10405(str3, strM2049);
                    C1783.m6237(sbM10406, RunnableC0334.m2051(atomicInteger3));
                    i61 = i61;
                    c106210.m27108(i63, new C24801(0, c8850.m23719(C1080.m4058(sbM10406)), null, null));
                    c106210.m27108(i63, new C12866(atomicInteger3.getAndIncrement()));
                    iM2761 = (i57 - C0773.m3169("ܳۘ")) * (-15);
                    i3 = ((iM2761 ^ i58) * (-6449)) ^ 1110025069;
                    i4 = 855044589;
                    i60 = iM2761 ^ i4;
                    i59 = i3;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case -73065157:
                case -19598947:
                    i65 = i65;
                    iM7976 = iM7976;
                    i62 = i62;
                    c23418M55494 = c23418M55494;
                    arrayList4 = arrayList4;
                    if (i87 < iM7976) {
                        iM27610 = (C0773.m3169("᩹᩹") + i57) * (-55);
                        i53 = ((iM27610 ^ i58) * (-3687)) ^ (-368002822);
                        i54 = 791049728;
                    } else {
                        iM27610 = (C0619.m2761("۠ܺ") + i58) * 95;
                        i53 = ((iM27610 ^ i57) * (-663)) ^ 2030212877;
                        i54 = -385151797;
                    }
                    i60 = iM27610 ^ i54;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    iM7976 = iM7976;
                    i59 = i53;
                    i62 = i62;
                    break;
                case -50434202:
                case 1536810482:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    StringBuilder sbM10407 = C3188.m10405(str3, strM2049);
                    C1783.m6237(sbM10407, C1519.m5400(atomicInteger3));
                    c88510 = c88510;
                    i62 = i62;
                    i87 = i87;
                    i85 = i85;
                    c106210.m27108(i85, new C24801(0, c88510.m23719(C2023.m6952(sbM10407)), null, null));
                    c106210.m27108(i85, new C12866(atomicInteger3.getAndIncrement()));
                    str3 = str3;
                    i80 = i80;
                    enumC22634 = enumC22634;
                    i83 = i83;
                    i73 = i71;
                    iM31616 = (i57 - C0619.m2761("ۖ֨")) * 9;
                    i48 = ((iM31616 ^ i58) * 9651) ^ 701452145;
                    i49 = -1000816833;
                    i85 = i85;
                    enumC22634 = enumC22634;
                    i80 = i80;
                    c88510 = c88510;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    i65 = i65;
                    i62 = i62;
                    iM7976 = iM7976;
                    i60 = iM31616 ^ i49;
                    i59 = i48;
                    i61 = i61;
                    break;
                case -28982471:
                case 1400577137:
                    z10 = false;
                    iM2761 = (C0619.m2761("ܺ۠") + i57) * (-77);
                    i3 = ((iM2761 ^ i58) * 30165) ^ (-109032317);
                    i4 = -783918316;
                    i60 = iM2761 ^ i4;
                    i59 = i3;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case -27000802:
                case 315626800:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i62 = i62;
                    i70 = i72 - 1;
                    i87 = i87;
                    str3 = str3;
                    c88511 = c8850;
                    c88512 = c88511;
                    i67 = i67;
                    i69 = i69;
                    listMo2840 = listMo2840;
                    z7 = z9;
                    i74 = i74;
                    i80 = i80;
                    enumC22632 = enumC22634;
                    i85 = i85;
                    c88510 = c88510;
                    z6 = true;
                    c106210 = c106210;
                    i38 = i86;
                    int iM316115 = C0773.m3169("֨۠") ^ i57;
                    i67 = i67;
                    i85 = i85;
                    i86 = i38;
                    i80 = i80;
                    c88510 = c88510;
                    i87 = i87;
                    str3 = str3;
                    enumC22634 = enumC22632;
                    i74 = i74;
                    i69 = i69;
                    c106210 = c106210;
                    i65 = i65;
                    i62 = i62;
                    iM7976 = iM7976;
                    listMo2840 = listMo2840;
                    i60 = iM316115 ^ 1753192764;
                    i59 = ((iM316115 ^ i58) * (-2717)) ^ (-2118321898);
                    i61 = i61;
                    viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    break;
                case 18898549:
                case 1322786482:
                    interfaceC12142 = null;
                    interfaceC12143 = interfaceC12142;
                    iM31616 = C0619.m2761("ۧۜ") ^ i57;
                    i48 = ((iM31616 ^ i58) * 26193) ^ (-562550085);
                    i49 = 1114677251;
                    i85 = i85;
                    enumC22634 = enumC22634;
                    i80 = i80;
                    c88510 = c88510;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    i65 = i65;
                    i62 = i62;
                    iM7976 = iM7976;
                    i60 = iM31616 ^ i49;
                    i59 = i48;
                    i61 = i61;
                    break;
                case 27381087:
                case 571480519:
                    i65 = i65;
                    iM7976 = iM7976;
                    i62 = i62;
                    c23418M55494 = c23418M55494;
                    arrayList4 = arrayList4;
                    i81 = i63 + 1;
                    ((C17450) C1542.m5457(arrayList4, 0)).m40949(c88515, c106210, i63);
                    if (atomicInteger3 != null) {
                        iM2763 = C0773.m3169("ۚۤ") ^ i57;
                        i9 = ((iM2763 ^ i58) * 17305) ^ (-1461664292);
                        i10 = -335515610;
                    } else {
                        i11 = i84;
                        i84 = i81;
                        i82 = i84;
                        i84 = i11;
                        iM2763 = (C0619.m2761("ܽ᩶") ^ i58) * 33;
                        i9 = ((iM2763 ^ i57) * 5045) ^ 1484472786;
                        i10 = -142064146;
                    }
                    i60 = iM2763 ^ i10;
                    arrayList4 = arrayList4;
                    i59 = i9;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case 64421108:
                case 207580237:
                    z18 = true;
                    iM2764 = C0619.m2761("ۧ᩺") ^ i58;
                    i12 = ((iM2764 ^ i57) * 1695) ^ (-1721252372);
                    i13 = -1094982189;
                    i60 = iM2764 ^ i13;
                    i59 = i12;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case 68180943:
                case 1148204721:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i25 = i87;
                    str2 = str3;
                    i62 = i62;
                    i69 = i69;
                    list3 = listMo2840;
                    i26 = i74;
                    i27 = i80;
                    abstractC12384 = abstractC123810;
                    enumC22631 = enumC22634;
                    i28 = i83;
                    i34 = i85;
                    c8853 = c88510;
                    c10628 = c106210;
                    i29 = i86;
                    if (!C3998.m12923(itM2358)) {
                        list2 = list3;
                        c8852 = c8858;
                        interfaceC7142 = interfaceC7140Mo13175;
                        arrayList3 = arrayList6;
                        int iM31627 = C0773.m3169("ᩳۤ") ^ i58;
                        interfaceC7140 = interfaceC7142;
                        i59 = ((iM31627 ^ i57) * 15897) ^ (-112620589);
                        i31 = iM31627 ^ 1285357652;
                        i85 = i34;
                        arrayList6 = arrayList3;
                        i86 = i29;
                        i80 = i27;
                        c88510 = c8853;
                        i87 = i25;
                        str3 = str2;
                        i83 = i28;
                        enumC22634 = enumC22631;
                        i74 = i26;
                        interfaceC7140Mo13175 = interfaceC7140;
                        c8858 = c8852;
                        abstractC123810 = abstractC12384;
                        c106210 = c10628;
                        i65 = i65;
                        i61 = i61;
                        i62 = i62;
                        iM7976 = iM7976;
                        i60 = i31;
                        i69 = i69;
                        listMo2840 = list2;
                        viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    } else {
                        iM31613 = C0773.m3169("۟ᩴ") ^ i58;
                        i35 = ((iM31613 ^ i57) * (-18627)) ^ 923394681;
                        i36 = 32309542;
                        i37 = iM31613 ^ i36;
                        i85 = i34;
                        i86 = i29;
                        i80 = i27;
                        c88510 = c8853;
                        i87 = i25;
                        str3 = str2;
                        i83 = i28;
                        enumC22634 = enumC22631;
                        i74 = i26;
                        abstractC123810 = abstractC12384;
                        c106210 = c10628;
                        i65 = i65;
                        i62 = i62;
                        iM7976 = iM7976;
                        listMo2840 = list3;
                        i60 = i37;
                        i59 = i35;
                        i69 = i69;
                        i61 = i61;
                        viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    }
                    break;
                case 136130648:
                case 1319945130:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i87 = i87;
                    i62 = i62;
                    i85 = i85;
                    c88510 = c88510;
                    StringBuilder sbM10408 = C3188.m10405(str3, strM2049);
                    C3779.m12269(sbM10408, C1519.m5400(atomicInteger3));
                    str3 = str3;
                    C24801 c24801 = new C24801(0, c88510.m23719(C2023.m6952(sbM10408)), null, null);
                    int i108 = i83;
                    c106210.m27108(i108, c24801);
                    c106210.m27108(i108, new C12866(atomicInteger3.getAndIncrement()));
                    i83 = i108;
                    i80 = i80;
                    enumC22634 = enumC22634;
                    i73 = i83;
                    iM31616 = (i57 - C0619.m2761("ۖ֨")) * 9;
                    i48 = ((iM31616 ^ i58) * 9651) ^ 701452145;
                    i49 = -1000816833;
                    i85 = i85;
                    enumC22634 = enumC22634;
                    i80 = i80;
                    c88510 = c88510;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    i65 = i65;
                    i62 = i62;
                    iM7976 = iM7976;
                    i60 = iM31616 ^ i49;
                    i59 = i48;
                    i61 = i61;
                    break;
                case 160161987:
                case 976396341:
                    i65 = i65;
                    iM7976 = iM7976;
                    i62 = i62;
                    c23418M55494 = c23418M55494;
                    arrayList4 = arrayList4;
                    StringBuilder sbM10409 = C3188.m10405(str3, strM2049);
                    C1783.m6237(sbM10409, C1519.m5400(atomicInteger3));
                    c106210.m27108(i63, new C24801(0, c88515.m23719(C2023.m6952(sbM10409)), null, null));
                    c106210.m27108(i63, new C12866(atomicInteger3.getAndIncrement()));
                    i11 = i84;
                    i84 = i81;
                    i82 = i84;
                    i84 = i11;
                    iM2763 = (C0619.m2761("ܽ᩶") ^ i58) * 33;
                    i9 = ((iM2763 ^ i57) * 5045) ^ 1484472786;
                    i10 = -142064146;
                    i60 = iM2763 ^ i10;
                    arrayList4 = arrayList4;
                    i59 = i9;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case 191910772:
                case 324569852:
                    i65 = i65;
                    iM7976 = iM7976;
                    i62 = i62;
                    arrayList4 = arrayList4;
                    if (z11) {
                        iM31610 = (C0773.m3169("᩸֫") ^ i57) * (-17);
                        i5 = ((iM31610 ^ i58) * (-25083)) ^ (-1515013677);
                        i6 = -254142708;
                    } else {
                        i78 = i63;
                        z14 = z12;
                        iM31610 = (i58 - C0773.m3169("֫ۖ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM31610 ^ i57) * (-3645)) ^ (-2084084604);
                        i6 = 540944807;
                    }
                    i60 = iM31610 ^ i6;
                    arrayList4 = arrayList4;
                    i59 = i5;
                    i65 = i65;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case 204911802:
                case 1021172534:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i80 = i80;
                    enumC22634 = enumC22634;
                    i83 = i83;
                    i85 = i85;
                    c88510 = c88510;
                    if (atomicInteger3 != null) {
                        iM31616 = C0773.m3169("᩵ۗ") ^ i57;
                        i48 = ((iM31616 ^ i58) * (-4795)) ^ 644169928;
                        i49 = -1734478863;
                    } else {
                        i73 = i83;
                        iM31616 = (i57 - C0619.m2761("ۖ֨")) * 9;
                        i48 = ((iM31616 ^ i58) * 9651) ^ 701452145;
                        i49 = -1000816833;
                    }
                    i85 = i85;
                    enumC22634 = enumC22634;
                    i80 = i80;
                    c88510 = c88510;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    i65 = i65;
                    i62 = i62;
                    iM7976 = iM7976;
                    i60 = iM31616 ^ i49;
                    i59 = i48;
                    i61 = i61;
                    break;
                case 262737132:
                case 688312811:
                    i50 = iM7976;
                    i52 = i62 + 1;
                    i63 = i77;
                    z12 = z14;
                    i51 = i85;
                    c8856 = c88510;
                    r80 = 1;
                    c8857 = c8850;
                    int iM276112 = C0619.m2761("᩶ۤ") ^ i58;
                    C8850 c885110 = c8857;
                    i59 = ((iM276112 ^ i57) * 3483) ^ (-224836871);
                    i85 = i51;
                    i83 = i83;
                    enumC22634 = enumC22634;
                    c88510 = c8856;
                    i62 = i52;
                    i87 = i87;
                    c88515 = c885110;
                    i65 = i65;
                    i61 = i61;
                    iM7976 = i50;
                    i60 = iM276112 ^ (-2038285143);
                    str3 = str3;
                    break;
                case 331272960:
                case 414754067:
                    abstractC12385 = abstractC123810;
                    i68 = 5;
                    int iM31628 = (C0773.m3169("۫ᩴ") ^ i58) * 89;
                    i44 = ((iM31628 ^ i57) * 30675) ^ (-990793755);
                    i85 = i85;
                    arrayList6 = arrayList6;
                    i86 = i86;
                    i80 = i80;
                    c88510 = c88510;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    enumC22634 = enumC22634;
                    i74 = i74;
                    abstractC123810 = abstractC12385;
                    c106210 = c106210;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM7976 = iM7976;
                    i60 = iM31628 ^ (-586349169);
                    i69 = i69;
                    listMo2840 = listMo2840;
                    i59 = i44;
                    viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    break;
                case 333493008:
                case 500045632:
                    i65 = i65;
                    int i109 = iM7976;
                    i62 = i62;
                    arrayList4 = arrayList4;
                    iM7976 = i109;
                    i77 = i78 + i79;
                    iM31610 = (C0773.m3169("ۤۧ") + i58) * (-63);
                    i5 = ((iM31610 ^ i57) * (-5589)) ^ (-1423446624);
                    i6 = -983365952;
                    i60 = iM31610 ^ i6;
                    arrayList4 = arrayList4;
                    i59 = i5;
                    i65 = i65;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case 378167925:
                case 1548533931:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i62 = i62;
                    if (viewOnClickListenerC21203.f67683.m38075(c8850, interfaceC6177, interfaceC12143, c106210, i63)) {
                        iM2761 = (i58 - C0773.m3169("᩶ᩳ")) * 127;
                        i3 = ((iM2761 ^ i57) * 31915) ^ (-885258718);
                        i4 = -412994245;
                    } else {
                        i72 = i63;
                        z9 = z12;
                        iM2761 = C0773.m3169("ۤ᩹") ^ i58;
                        i3 = ((iM2761 ^ i57) * (-27661)) ^ 925672561;
                        i4 = 1615764876;
                    }
                    i60 = iM2761 ^ i4;
                    i59 = i3;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case 389851538:
                case 772901366:
                    i79 = 2;
                    iM27610 = C0619.m2761("ۨ᩻") ^ i57;
                    i53 = ((iM27610 ^ i58) * (-32441)) ^ 411367205;
                    i54 = -976074534;
                    i60 = iM27610 ^ i54;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    iM7976 = iM7976;
                    i59 = i53;
                    i62 = i62;
                    break;
                case 403619028:
                case 1582793384:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    listMo2840 = listMo2840;
                    i74 = i74;
                    i80 = i80;
                    abstractC12388 = abstractC123810;
                    enumC22632 = enumC22634;
                    i83 = i83;
                    i85 = i85;
                    c88510 = c88510;
                    if (!z21) {
                        i69 = i69;
                        list2 = listMo2840;
                        abstractC12384 = abstractC12388;
                        c10628 = c106210;
                        c8854 = c88510;
                        c8852 = c8858;
                        c8855 = c88514;
                        arrayList2 = arrayList6;
                        interfaceC7141 = interfaceC7144;
                        i32 = i86;
                        interfaceC7145 = interfaceC7141;
                        c88513 = c8854;
                        str4 = str5;
                        c8859 = c8855;
                        z4 = z21;
                        iM31612 = C0773.m3169("ۙܰ") ^ i58;
                        i59 = ((iM31612 ^ i57) * (-7937)) ^ (-163186815);
                        i33 = 2084090902;
                        i31 = iM31612 ^ i33;
                        i85 = i85;
                        arrayList6 = arrayList2;
                        i86 = i32;
                        i80 = i80;
                        c88510 = c88510;
                        i87 = i87;
                        str3 = str3;
                        i83 = i83;
                        enumC22634 = enumC22632;
                        i74 = i74;
                        c8858 = c8852;
                        abstractC123810 = abstractC12384;
                        c106210 = c10628;
                        i65 = i65;
                        i61 = i61;
                        i62 = i62;
                        iM7976 = iM7976;
                        i60 = i31;
                        i69 = i69;
                        listMo2840 = list2;
                        viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    } else {
                        iM31615 = (C0773.m3169("ۚ᩺") + i57) * (-85);
                        i42 = ((iM31615 ^ i58) * 2325) ^ 881771893;
                        i45 = -1044606699;
                        i46 = iM31615 ^ i45;
                        listMo2840 = listMo2840;
                        i85 = i85;
                        abstractC123810 = abstractC12388;
                        i80 = i80;
                        c88510 = c88510;
                        str3 = str3;
                        i83 = i83;
                        enumC22634 = enumC22632;
                        i74 = i74;
                        i61 = i61;
                        i62 = i62;
                        iM7976 = iM7976;
                        viewOnClickListenerC21203 = viewOnClickListenerC21202;
                        i60 = i46;
                        i59 = i42;
                        i87 = i87;
                        i65 = i65;
                    }
                    break;
                case 477571761:
                case 837195166:
                    i65 = i65;
                    iM7976 = iM7976;
                    i62 = i62;
                    arrayList4 = arrayList4;
                    i78 = i82;
                    z14 = true;
                    iM31610 = (i58 - C0773.m3169("֫ۖ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i5 = ((iM31610 ^ i57) * (-3645)) ^ (-2084084604);
                    i6 = 540944807;
                    i60 = iM31610 ^ i6;
                    arrayList4 = arrayList4;
                    i59 = i5;
                    i65 = i65;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case 522598351:
                case 1120524182:
                    i65 = i65;
                    iM7976 = iM7976;
                    i62 = i62;
                    c23418M55494 = c23418M55494;
                    arrayList4 = arrayList4;
                    if (interfaceC12143 != null) {
                        iM27610 = (i58 - C0773.m3169("۠ܿ")) * (-51);
                        i53 = ((iM27610 ^ i57) * (-27307)) ^ 733867411;
                        i54 = 1034253520;
                    } else {
                        iM27610 = C0619.m2761("ۘ۟") ^ i57;
                        i53 = ((iM27610 ^ i58) * 9495) ^ 2135019427;
                        i54 = -463826858;
                    }
                    i60 = iM27610 ^ i54;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    iM7976 = iM7976;
                    i59 = i53;
                    i62 = i62;
                    break;
                case 530126641:
                case 548305414:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i80 = i80;
                    i83 = i83;
                    i85 = i85;
                    c88510 = c88510;
                    C1564.m5517(atomicInteger);
                    enumC22632 = enumC22634;
                    c88513 = c88510;
                    str4 = str3;
                    c8852 = c8858;
                    c8859 = c88514;
                    arrayList2 = arrayList6;
                    interfaceC7145 = interfaceC7144;
                    i69 = i69;
                    list2 = listMo2840;
                    i74 = i74;
                    abstractC12384 = abstractC123810;
                    z4 = false;
                    c10628 = c106210;
                    i32 = i86;
                    iM31612 = C0773.m3169("ۙܰ") ^ i58;
                    i59 = ((iM31612 ^ i57) * (-7937)) ^ (-163186815);
                    i33 = 2084090902;
                    i31 = iM31612 ^ i33;
                    i85 = i85;
                    arrayList6 = arrayList2;
                    i86 = i32;
                    i80 = i80;
                    c88510 = c88510;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    enumC22634 = enumC22632;
                    i74 = i74;
                    c8858 = c8852;
                    abstractC123810 = abstractC12384;
                    c106210 = c10628;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM7976 = iM7976;
                    i60 = i31;
                    i69 = i69;
                    listMo2840 = list2;
                    viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    break;
                case 538677535:
                case 2125607082:
                    z19 = false;
                    iM2764 = (C0773.m3169("ۙۡ") + i58) * 43;
                    i12 = ((iM2764 ^ i57) * (-26857)) ^ (-290614779);
                    i13 = -2088124186;
                    i60 = iM2764 ^ i13;
                    i59 = i12;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case 563248362:
                case 800721440:
                    i65 = i65;
                    int i110 = iM7976;
                    i62 = i62;
                    ArrayList arrayList8 = arrayList4;
                    int i111 = c23418M55494.f75803;
                    if ((i111 & 1) != 0) {
                        int iM31629 = C0773.m3169("ۗۜ") ^ i58;
                        iM7976 = i110;
                        i59 = ((iM31629 ^ i57) * 31067) ^ 196170786;
                        i60 = iM31629 ^ (-1540214635);
                        arrayList4 = arrayList8;
                        i76 = i111;
                    } else {
                        iM7976 = i110;
                        int iM31630 = C0773.m3169("᩹ۢ") ^ i57;
                        i60 = iM31630 ^ 1503607437;
                        arrayList4 = arrayList8;
                        i76 = i111;
                        i59 = ((iM31630 ^ i58) * (-5973)) ^ (-14829327);
                    }
                    i65 = i65;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case 626069363:
                case 1546562044:
                    i65 = i65;
                    iM7976 = iM7976;
                    i62 = i62;
                    c23418M55494 = c23418M55494;
                    arrayList4 = arrayList4;
                    if ((i76 & 8) != 0) {
                        iM2763 = (i58 - C0773.m3169("᩺᩻")) * (-19);
                        i9 = ((iM2763 ^ i57) * 18445) ^ 1543300708;
                        i10 = 2108494268;
                    } else {
                        iM2763 = (i57 - C0773.m3169("᩺ۧ")) * (-29);
                        i9 = ((iM2763 ^ i58) * (-6283)) ^ 631638068;
                        i10 = -835223991;
                    }
                    i60 = iM2763 ^ i10;
                    arrayList4 = arrayList4;
                    i59 = i9;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case 639941703:
                case 1105732089:
                    i65 = i65;
                    iM7976 = iM7976;
                    i62 = i62;
                    i61 = i61;
                    i72 = i75;
                    z9 = true;
                    iM2761 = C0773.m3169("ۤ᩹") ^ i58;
                    i3 = ((iM2761 ^ i57) * (-27661)) ^ 925672561;
                    i4 = 1615764876;
                    i60 = iM2761 ^ i4;
                    i59 = i3;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case 856306224:
                case 1317205147:
                    list = listMo2840;
                    i22 = i86;
                    i23 = i66;
                    Object[] objArr = new Object[i23];
                    objArr[0] = C0773.m3159(C1519.m5400(atomicInteger));
                    i24 = i85;
                    str = String.format(C3033.m9847(f67679, 282, 9, i22), objArr);
                    z21 = z;
                    itM2357 = C0487.m2357(c22737.getMethods());
                    c8851 = c8850;
                    str5 = strMo20400;
                    int iM316210 = C0773.m3169("ۚ۬") ^ i58;
                    i60 = iM316210 ^ (-783669224);
                    i86 = i22;
                    i85 = i24;
                    str3 = str;
                    i66 = i23;
                    c8858 = c8851;
                    i59 = ((iM316210 ^ i57) * (-1129)) ^ (-173464591);
                    listMo2840 = list;
                    iM7976 = iM7976;
                    viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    break;
                case 886960596:
                case 1067638439:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i69 = i69;
                    listMo2840 = listMo2840;
                    i80 = i80;
                    abstractC12388 = abstractC123810;
                    enumC22632 = enumC22634;
                    i83 = i83;
                    i85 = i85;
                    c88510 = c88510;
                    int i112 = i85 + 1;
                    if (i112 >= C3448.m11247(listMo2840)) {
                        i74 = i112;
                        int iM316116 = (i58 - C0773.m3169("۟֫")) * 65;
                        i42 = ((iM316116 ^ i57) * (-11255)) ^ (-101787325);
                        i46 = iM316116 ^ 455426888;
                        listMo2840 = listMo2840;
                        i85 = i85;
                        abstractC123810 = abstractC12388;
                        i80 = i80;
                        c88510 = c88510;
                        str3 = str3;
                        i83 = i83;
                        enumC22634 = enumC22632;
                        i69 = i69;
                        i61 = i61;
                        i62 = i62;
                        iM7976 = iM7976;
                        viewOnClickListenerC21203 = viewOnClickListenerC21202;
                        i60 = i46;
                        i59 = i42;
                        i87 = i87;
                        i65 = i65;
                    } else {
                        iM31614 = C0773.m3169("ۚ۠") ^ i58;
                        i74 = i112;
                        i59 = ((iM31614 ^ i57) * (-32007)) ^ (-1814062312);
                        i41 = -1867661030;
                        listMo2840 = listMo2840;
                        i85 = i85;
                        abstractC123810 = abstractC12388;
                        i80 = i80;
                        c88510 = c88510;
                        str3 = str3;
                        i83 = i83;
                        enumC22634 = enumC22632;
                        i74 = i74;
                        i69 = i69;
                        i61 = i61;
                        i62 = i62;
                        iM7976 = iM7976;
                        viewOnClickListenerC21203 = viewOnClickListenerC21202;
                        i60 = iM31614 ^ i41;
                        i87 = i87;
                        i65 = i65;
                    }
                    break;
                case 1040204332:
                case 1335749574:
                    enumC22633 = enumC22634;
                    interfaceC7143 = interfaceC7140M23710;
                    c10629 = new C10628(interfaceC7143);
                    listMo2840 = c10629.mo2840();
                    c88514 = c8858;
                    c88510 = c88514;
                    c = 3;
                    z5 = false;
                    z8 = true;
                    c3 = 5;
                    i85 = 0;
                    int iM316211 = (i57 - C0773.m3169("ܺ֡")) * (-73);
                    interfaceC7140M23710 = interfaceC7143;
                    arrayList6 = arrayList6;
                    i86 = i86;
                    i80 = i80;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    enumC22634 = enumC22633;
                    i74 = i74;
                    abstractC123810 = abstractC123810;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM7976 = iM7976;
                    i60 = iM316211 ^ 1015002638;
                    c106210 = c10629;
                    i59 = ((iM316211 ^ i58) * (-30073)) ^ (-160879519);
                    i69 = i69;
                    viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    break;
                case 1074080306:
                case 1936955130:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i69 = i69;
                    listMo2840 = listMo2840;
                    i74 = i74;
                    abstractC12387 = abstractC123810;
                    enumC22632 = enumC22634;
                    i83 = i83;
                    i85 = i85;
                    c88510 = c88510;
                    c106210 = c106210;
                    i39 = i86;
                    int iMo4171 = ((InterfaceC10650) C4238.m13529(itM2358)).mo4171();
                    i67 = i67;
                    if (iMo4171 != i67) {
                        int iM31631 = (C0773.m3169("᩷᩸") ^ i57) * 21;
                        i80 = iMo4171;
                        i85 = i85;
                        i67 = i67;
                        i86 = i39;
                        i59 = ((iM31631 ^ i58) * 21487) ^ 222144380;
                        c88510 = c88510;
                        str3 = str3;
                        i83 = i83;
                        enumC22634 = enumC22632;
                        i74 = i74;
                        abstractC123810 = abstractC12387;
                        c106210 = c106210;
                        i61 = i61;
                        i62 = i62;
                        iM7976 = iM7976;
                        listMo2840 = listMo2840;
                        i60 = iM31631 ^ 392230926;
                    } else {
                        i80 = iMo4171;
                        int iM276113 = (i58 - C0619.m2761("ۗۘ")) * (-83);
                        i85 = i85;
                        i67 = i67;
                        i86 = i39;
                        c88510 = c88510;
                        str3 = str3;
                        i83 = i83;
                        enumC22634 = enumC22632;
                        i74 = i74;
                        abstractC123810 = abstractC12387;
                        c106210 = c106210;
                        i61 = i61;
                        i62 = i62;
                        iM7976 = iM7976;
                        listMo2840 = listMo2840;
                        i60 = iM276113 ^ 1503071324;
                        i59 = ((iM276113 ^ i57) * 18487) ^ 730881827;
                    }
                    i87 = i87;
                    i69 = i69;
                    i65 = i65;
                    viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    break;
                case 1074824671:
                case 1223964314:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i80 = i80;
                    enumC22634 = enumC22634;
                    i83 = i83;
                    i85 = i85;
                    c88510 = c88510;
                    if (enumC22634 == EnumC22631.f73319) {
                        enumC22634 = enumC22634;
                        abstractC12388 = abstractC123810;
                        int iM316117 = C0773.m3169("ۗܳ") ^ i57;
                        i42 = ((iM316117 ^ i58) * (-28483)) ^ (-741571296);
                        i46 = iM316117 ^ 2022118740;
                        listMo2840 = listMo2840;
                        i85 = i85;
                        abstractC123810 = abstractC12388;
                        i80 = i80;
                        c88510 = c88510;
                        str3 = str3;
                        i83 = i83;
                        i74 = i74;
                        i61 = i61;
                        i62 = i62;
                        iM7976 = iM7976;
                        viewOnClickListenerC21203 = viewOnClickListenerC21202;
                        i60 = i46;
                        i59 = i42;
                        i87 = i87;
                        i65 = i65;
                    } else {
                        iM31616 = C0773.m3169("۟֡") ^ i58;
                        i48 = ((iM31616 ^ i57) * 28927) ^ 1877394403;
                        i49 = 241247625;
                        i85 = i85;
                        enumC22634 = enumC22634;
                        i80 = i80;
                        c88510 = c88510;
                        i87 = i87;
                        str3 = str3;
                        i83 = i83;
                        i65 = i65;
                        i62 = i62;
                        iM7976 = iM7976;
                        i60 = iM31616 ^ i49;
                        i59 = i48;
                        i61 = i61;
                    }
                    break;
                case 1113203211:
                case 2111018731:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i62 = i62;
                    if (interfaceC12143 != null) {
                        iM2761 = C0773.m3169("ᩳۢ") ^ i58;
                        i3 = ((iM2761 ^ i57) * (-6265)) ^ (-259073049);
                        i4 = 785482445;
                    } else {
                        i72 = i63;
                        z9 = z12;
                        iM2761 = C0773.m3169("ۤ᩹") ^ i58;
                        i3 = ((iM2761 ^ i57) * (-27661)) ^ 925672561;
                        i4 = 1615764876;
                    }
                    i60 = iM2761 ^ i4;
                    i59 = i3;
                    i65 = i65;
                    i61 = i61;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                case 1138409223:
                case 1674535195:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i25 = i87;
                    str2 = str3;
                    i62 = i62;
                    i69 = i69;
                    list3 = listMo2840;
                    i26 = i74;
                    i27 = i80;
                    abstractC12384 = abstractC123810;
                    enumC22631 = enumC22634;
                    i28 = i83;
                    i34 = i85;
                    c8853 = c88510;
                    c10628 = c106210;
                    i29 = i86;
                    interfaceC7144 = z5 ? c10628 : interfaceC7140M23710;
                    iM31613 = (C0619.m2761("᩸۟") ^ i58) * (-27);
                    i35 = ((iM31613 ^ i57) * 16233) ^ (-1662971816);
                    i36 = 1148910717;
                    i37 = iM31613 ^ i36;
                    i85 = i34;
                    i86 = i29;
                    i80 = i27;
                    c88510 = c8853;
                    i87 = i25;
                    str3 = str2;
                    i83 = i28;
                    enumC22634 = enumC22631;
                    i74 = i26;
                    abstractC123810 = abstractC12384;
                    c106210 = c10628;
                    i65 = i65;
                    i62 = i62;
                    iM7976 = iM7976;
                    listMo2840 = list3;
                    i60 = i37;
                    i59 = i35;
                    i69 = i69;
                    i61 = i61;
                    viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    break;
                case 1602665512:
                case 2113742375:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i66 = i66;
                    arrayList = arrayList5;
                    c8858 = c8858;
                    interfaceC7140Mo13175 = interfaceC7140Mo13175;
                    i69 = i69;
                    listMo2840 = listMo2840;
                    i74 = i74;
                    i80 = i80;
                    abstractC123810 = abstractC123810;
                    enumC22634 = enumC22634;
                    i83 = i83;
                    i85 = i85;
                    c88510 = c88510;
                    c106210 = c106210;
                    i14 = i86;
                    if (C3998.m12923(itM47859)) {
                        iM2765 = (C0619.m2761("ܺᩴ") + i58) * (-53);
                        i15 = ((iM2765 ^ i57) * (-9963)) ^ (-1424534183);
                        i16 = 32354575;
                    } else {
                        iM2765 = (C0619.m2761("᩶۟") + i57) * 99;
                        i15 = ((iM2765 ^ i58) * (-19327)) ^ (-1898925350);
                        i16 = 173473528;
                    }
                    i17 = iM2765 ^ i16;
                    arrayList5 = arrayList;
                    i86 = i14;
                    i80 = i80;
                    c88510 = c88510;
                    i87 = i87;
                    str3 = str3;
                    i83 = i83;
                    enumC22634 = enumC22634;
                    i74 = i74;
                    i85 = i85;
                    interfaceC7140Mo13175 = interfaceC7140Mo13175;
                    c8858 = c8858;
                    abstractC123810 = abstractC123810;
                    c106210 = c106210;
                    i65 = i65;
                    i62 = i62;
                    iM7976 = iM7976;
                    i60 = i17;
                    i66 = i66;
                    i59 = i15;
                    i69 = i69;
                    listMo2840 = listMo2840;
                    i61 = i61;
                    viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    break;
                case 1615689300:
                case 1911109959:
                    i65 = i65;
                    iM7976 = iM7976;
                    i62 = i62;
                    c23418M55494 = c23418M55494;
                    arrayList4 = arrayList4;
                    if ((i76 & 2) != 0) {
                        iM27610 = (C0619.m2761("᩷ۘ") + i58) * (-127);
                        i53 = ((iM27610 ^ i57) * 12509) ^ 207482047;
                        i54 = -1282253099;
                    } else {
                        iM27610 = (C0773.m3169("ۖۖ") + i57) * (-91);
                        i53 = ((iM27610 ^ i58) * 24985) ^ 2035551877;
                        i54 = 1048785740;
                    }
                    i60 = iM27610 ^ i54;
                    arrayList4 = arrayList4;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    iM7976 = iM7976;
                    i59 = i53;
                    i62 = i62;
                    break;
                case 1770750331:
                case 2074324415:
                    i65 = i65;
                    iM7976 = iM7976;
                    i61 = i61;
                    i87 = i87;
                    str3 = str3;
                    i62 = i62;
                    i80 = i80;
                    enumC22634 = enumC22634;
                    i83 = i83;
                    i85 = i85;
                    c88510 = c88510;
                    if (i80 == 9) {
                        enumC22632 = enumC22634;
                        i80 = i80;
                        i69 = i69;
                        listMo2840 = listMo2840;
                        i74 = i74;
                        abstractC12387 = abstractC123810;
                        i39 = i86;
                        int iM276114 = (i58 - C0619.m2761("ۗۘ")) * (-83);
                        i85 = i85;
                        i67 = i67;
                        i86 = i39;
                        c88510 = c88510;
                        str3 = str3;
                        i83 = i83;
                        enumC22634 = enumC22632;
                        i74 = i74;
                        abstractC123810 = abstractC12387;
                        c106210 = c106210;
                        i61 = i61;
                        i62 = i62;
                        iM7976 = iM7976;
                        listMo2840 = listMo2840;
                        i60 = iM276114 ^ 1503071324;
                        i59 = ((iM276114 ^ i57) * 18487) ^ 730881827;
                        i87 = i87;
                        i69 = i69;
                        i65 = i65;
                        viewOnClickListenerC21203 = viewOnClickListenerC21202;
                    } else {
                        iM31616 = C0773.m3169("᩻֨") ^ i58;
                        i48 = ((iM31616 ^ i57) * (-13607)) ^ 1973212441;
                        i49 = -2059540280;
                        i85 = i85;
                        enumC22634 = enumC22634;
                        i80 = i80;
                        c88510 = c88510;
                        i87 = i87;
                        str3 = str3;
                        i83 = i83;
                        i65 = i65;
                        i62 = i62;
                        iM7976 = iM7976;
                        i60 = iM31616 ^ i49;
                        i59 = i48;
                        i61 = i61;
                    }
                    break;
                case 2087749407:
                case 2107897981:
                    i65 = i65;
                    iM7976 = iM7976;
                    i62 = i62;
                    c23418M55494 = c23418M55494;
                    if (C3998.m12923(itM4942)) {
                        iM2764 = C0619.m2761("ۗۤ") ^ i57;
                        i12 = ((iM2764 ^ i58) * 16999) ^ (-1131016016);
                        i13 = 1107762096;
                    } else {
                        iM2764 = C0773.m3169("ܶۛ") ^ i58;
                        i12 = ((iM2764 ^ i57) * 14393) ^ (-1221526339);
                        i13 = 1024343490;
                    }
                    i60 = iM2764 ^ i13;
                    i59 = i12;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
                default:
                    z17 = true;
                    iM2763 = (C0773.m3169("᩵ۡ") ^ i57) * 37;
                    i9 = ((iM2763 ^ i58) * MLKEMEngine.KyberQ) ^ 909853295;
                    i10 = -800394438;
                    i60 = iM2763 ^ i10;
                    arrayList4 = arrayList4;
                    i59 = i9;
                    i65 = i65;
                    c23418M55494 = c23418M55494;
                    i62 = i62;
                    iM7976 = iM7976;
                    break;
            }
            c8850.m23711(C0487.m2358(c22737), c22737.mo20404(), c22737.mo20397(), c22737.mo20402(), str5, c22737.getAnnotations(), arrayList5, arrayList6);
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x02d7 A[PHI: r1 r2 r5 r11 r15 r17 r20 r21 r22 r27
      0x02d7: PHI (r1v36 android.text.SpannableString) = 
      (r1v6 android.text.SpannableString)
      (r1v2 android.text.SpannableString)
      (r1v35 android.text.SpannableString)
      (r1v2 android.text.SpannableString)
      (r1v2 android.text.SpannableString)
     binds: [B:65:0x02d1, B:82:0x02d7, B:52:0x0206, B:33:0x0138, B:29:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x02d7: PHI (r2v6 bin.mt.plus.Main) = 
      (r2v2 bin.mt.plus.Main)
      (r2v2 bin.mt.plus.Main)
      (r2v4 bin.mt.plus.Main)
      (r2v2 bin.mt.plus.Main)
      (r2v2 bin.mt.plus.Main)
     binds: [B:65:0x02d1, B:82:0x02d7, B:52:0x0206, B:33:0x0138, B:29:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x02d7: PHI (r5v4 l.ۖۖۧ) = (r5v2 l.ۖۖۧ), (r5v2 l.ۖۖۧ), (r5v2 l.ۖۖۧ), (r5v3 l.ۖۖۧ), (r5v2 l.ۖۖۧ) binds: [B:65:0x02d1, B:82:0x02d7, B:52:0x0206, B:33:0x0138, B:29:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x02d7: PHI (r11v3 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]), (r11v4 short[]) binds: [B:65:0x02d1, B:82:0x02d7, B:52:0x0206, B:33:0x0138, B:29:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x02d7: PHI (r15v3 int) = (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v4 int) binds: [B:65:0x02d1, B:82:0x02d7, B:52:0x0206, B:33:0x0138, B:29:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x02d7: PHI (r17v6 int) = (r17v3 int), (r17v2 int), (r17v2 int), (r17v2 int), (r17v2 int) binds: [B:65:0x02d1, B:82:0x02d7, B:52:0x0206, B:33:0x0138, B:29:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x02d7: PHI (r20v20 int) = (r20v4 int), (r20v2 int), (r20v19 int), (r20v2 int), (r20v2 int) binds: [B:65:0x02d1, B:82:0x02d7, B:52:0x0206, B:33:0x0138, B:29:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x02d7: PHI (r21v16 int) = (r21v2 int), (r21v2 int), (r21v15 int), (r21v2 int), (r21v2 int) binds: [B:65:0x02d1, B:82:0x02d7, B:52:0x0206, B:33:0x0138, B:29:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x02d7: PHI (r22v22 short[]) = (r22v4 short[]), (r22v2 short[]), (r22v21 short[]), (r22v2 short[]), (r22v2 short[]) binds: [B:65:0x02d1, B:82:0x02d7, B:52:0x0206, B:33:0x0138, B:29:0x010e] A[DONT_GENERATE, DONT_INLINE]
      0x02d7: PHI (r27v16 int) = (r27v3 int), (r27v3 int), (r27v14 int), (r27v3 int), (r27v3 int) binds: [B:65:0x02d1, B:82:0x02d7, B:52:0x0206, B:33:0x0138, B:29:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48341(ViewOnClickListenerC21202 viewOnClickListenerC21202) {
        int iM2761;
        int i;
        int i2;
        int iM3169;
        int i3;
        int i4;
        int i5 = C1080.f3865;
        int i6 = C2288.f7433;
        int iM31610 = (i5 - C0773.m3169("᩹֨")) * (-83);
        int i7 = ((iM31610 ^ i6) * 5561) ^ 1693591431;
        Main main = null;
        C2361 c2361M3794 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i8 = iM31610 ^ 44541664;
        SpannableString spannableStringM48355 = null;
        int iM31611 = 0;
        int i9 = 0;
        int iM2762 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        short s = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = -705194224;
        int iM2763 = 0;
        View viewM9942 = null;
        while (true) {
            i20 = i8 ^ (i7 & (((i20 ^ i6) * 8369) >> 31));
            switch (i20) {
                case -2078749433:
                case -861920051:
                    i13 = 35306;
                    iM2761 = C0773.m3169("ܽܺ") ^ i6;
                    i19 = i19;
                    i = ((iM2761 ^ i5) * (-9885)) ^ (-1246280093);
                    i2 = -1492582293;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    spannableStringM48355 = spannableStringM48355;
                    i18 = i18;
                    sArr = sArr;
                    break;
                case -1511128960:
                case 417981578:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = (C0619.m2761("᩹ܰ") + i6) * (-65);
                        i3 = ((iM3169 ^ i5) * 26551) ^ (-997354875);
                        i4 = 1082553733;
                    } else {
                        iM3169 = C0619.m2761("ۛܺ") ^ i5;
                        i3 = ((iM3169 ^ i6) * 21111) ^ (-475669917);
                        i4 = -1043321122;
                    }
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    break;
                case -1300663509:
                case 1703673696:
                    iM31611 = C0773.m3169(AbstractC0641.m2820(sArr2, i12, i11, i13));
                    i9 = 2098005501;
                    if (C0269.f1558 > 0) {
                        iM3169 = C0773.m3169("ܶ᩺") ^ i6;
                        i3 = ((iM3169 ^ i5) * 14317) ^ (-1813827260);
                        i4 = 1843884468;
                        i8 = iM3169 ^ i4;
                        i7 = i3;
                    } else {
                        i18 = i18;
                        spannableStringM48355 = spannableStringM48355;
                        iM2761 = (C0773.m3169("֫֫") + i6) * (-43);
                        i = ((iM2761 ^ i5) * (-21593)) ^ (-848011388);
                        i2 = 1348208245;
                        i8 = iM2761 ^ i2;
                        i7 = i;
                        spannableStringM48355 = spannableStringM48355;
                        i18 = i18;
                        sArr = sArr;
                    }
                    break;
                case -1289351558:
                case -595977083:
                    sArr = sArr;
                    i18 = i18;
                    spannableStringM48355 = spannableStringM48355;
                    s = f67679[123];
                    if (C4238.f15451 >= 0) {
                        iM2761 = (i6 - C0619.m2761("۟᩻")) * (-107);
                        i = ((iM2761 ^ i5) * (-11849)) ^ 1303468977;
                        i2 = -253476737;
                    } else {
                        iM2761 = (i6 - C0619.m2761("۬᩸")) * 59;
                        i = ((iM2761 ^ i5) * (-13361)) ^ (-1388223809);
                        i2 = -887749266;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    spannableStringM48355 = spannableStringM48355;
                    i18 = i18;
                    sArr = sArr;
                    break;
                case -1025437041:
                case 742976052:
                    C2834.m9344();
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0773.m3169("ܽ֡") ^ i5;
                        i3 = ((iM3169 ^ i6) * 29585) ^ 1371848119;
                        i4 = -564363534;
                        i8 = iM3169 ^ i4;
                        i7 = i3;
                    } else {
                        sArr = sArr;
                        i18 = i18;
                        spannableStringM48355 = spannableStringM48355;
                        iM2761 = (i6 - C0619.m2761("۟᩻")) * (-107);
                        i = ((iM2761 ^ i5) * (-11849)) ^ 1303468977;
                        i2 = -253476737;
                        i8 = iM2761 ^ i2;
                        i7 = i;
                        spannableStringM48355 = spannableStringM48355;
                        i18 = i18;
                        sArr = sArr;
                    }
                    break;
                case -1003977789:
                case -491371381:
                    i13 = 15702;
                    iM2761 = C0773.m3169("ܽܺ") ^ i6;
                    i19 = i19;
                    i = ((iM2761 ^ i5) * (-9885)) ^ (-1246280093);
                    i2 = -1492582293;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    spannableStringM48355 = spannableStringM48355;
                    i18 = i18;
                    sArr = sArr;
                    break;
                case -983842645:
                case -325484624:
                    int i21 = iM2763;
                    spannableStringM48355 = m48355();
                    Main main2 = viewOnClickListenerC21202.f67686;
                    sArr = f67679;
                    i18 = 124;
                    i19 = 3;
                    if (C13473.m33144()) {
                        int iM2764 = (C0619.m2761("۟᩸") ^ i6) * (-11);
                        iM2763 = i21;
                        i7 = ((iM2764 ^ i5) * 22333) ^ (-2107665346);
                        i8 = iM2764 ^ (-215140389);
                        main = main2;
                    } else {
                        iM2763 = i21;
                        main = main2;
                        iM3169 = C0773.m3169("ܽ֡") ^ i5;
                        i3 = ((iM3169 ^ i6) * 29585) ^ 1371848119;
                        i4 = -564363534;
                        i8 = iM3169 ^ i4;
                        i7 = i3;
                    }
                    break;
                case -770695704:
                case 87739934:
                    C1080.m4050();
                    if (!C2702.m8876()) {
                        iM3169 = (C0619.m2761("᩹ܰ") + i6) * (-65);
                        i3 = ((iM3169 ^ i5) * 26551) ^ (-997354875);
                        i4 = 1082553733;
                        i8 = iM3169 ^ i4;
                        i7 = i3;
                    } else {
                        sArr = sArr;
                        i18 = i18;
                        spannableStringM48355 = spannableStringM48355;
                        iM2761 = (i6 - C0619.m2761("۟᩻")) * (-107);
                        i = ((iM2761 ^ i5) * (-11849)) ^ 1303468977;
                        i2 = -253476737;
                        i8 = iM2761 ^ i2;
                        i7 = i;
                        spannableStringM48355 = spannableStringM48355;
                        i18 = i18;
                        sArr = sArr;
                    }
                    break;
                case -687743888:
                case 1222097481:
                    C0862.m3503();
                    break;
                case -354383600:
                case -217189591:
                    sArr = sArr;
                    i18 = i18;
                    spannableStringM48355 = spannableStringM48355;
                    if ((i17 + 1) - i16 > 0) {
                        iM2761 = C0619.m2761("֨᩶") ^ i5;
                        i = ((iM2761 ^ i6) * 12617) ^ (-1344221223);
                        i2 = 1602114081;
                    } else {
                        iM2761 = (C0773.m3169("۠ܶ") ^ i6) * 77;
                        i = ((iM2761 ^ i5) * (-7637)) ^ 779608389;
                        i2 = 1883489988;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    spannableStringM48355 = spannableStringM48355;
                    i18 = i18;
                    sArr = sArr;
                    break;
                case -277444898:
                case 726188640:
                    C3492.m11487(c2361M3794, iM2762 ^ i10, null);
                    C1321.m4860(c2361M3794);
                    break;
                case -121518505:
                case 1671528901:
                    sArr = sArr;
                    i18 = i18;
                    spannableStringM48355 = spannableStringM48355;
                    i15 = s + 1;
                    if (C1080.f3865 < 0) {
                        iM2761 = (i5 - C0619.m2761("ۛۘ")) * 41;
                        i = ((iM2761 ^ i6) * 18405) ^ 901764838;
                        i2 = -644035133;
                        i8 = iM2761 ^ i2;
                        i7 = i;
                        spannableStringM48355 = spannableStringM48355;
                        i18 = i18;
                        sArr = sArr;
                    } else {
                        spannableStringM48355 = spannableStringM48355;
                        i18 = i18;
                        sArr = sArr;
                        iM3169 = C0773.m3169("ܽ֡") ^ i5;
                        i3 = ((iM3169 ^ i6) * 29585) ^ 1371848119;
                        i4 = -564363534;
                        i8 = iM3169 ^ i4;
                        i7 = i3;
                    }
                    break;
                case -57260781:
                case 1265319188:
                    iM2762 = C0619.m2761(C0950.m3780(sArr3, i14, 3, i13));
                    i10 = 2118457617;
                    if (!C0862.m3503()) {
                        sArr = sArr;
                        i18 = i18;
                        spannableStringM48355 = spannableStringM48355;
                        iM2761 = (i6 - C0619.m2761("۟᩻")) * (-107);
                        i = ((iM2761 ^ i5) * (-11849)) ^ 1303468977;
                        i2 = -253476737;
                        i8 = iM2761 ^ i2;
                        i7 = i;
                        spannableStringM48355 = spannableStringM48355;
                        i18 = i18;
                        sArr = sArr;
                    } else {
                        iM3169 = (i5 - C0619.m2761("ܶ᩸")) * (-63);
                        i3 = ((iM3169 ^ i6) * (-199)) ^ (-599330147);
                        i4 = -310860360;
                        i8 = iM3169 ^ i4;
                        i7 = i3;
                    }
                    break;
                case 216090444:
                case 448177033:
                    RunnableC0334.m2063();
                    iM3169 = (C0619.m2761("᩹ܰ") + i6) * (-65);
                    i3 = ((iM3169 ^ i5) * 26551) ^ (-997354875);
                    i4 = 1082553733;
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    break;
                case 263564525:
                case 603898996:
                    C23916.m53425((TextView) C2834.m9333(viewM9942, iM31611 ^ i9), spannableStringM48355);
                    c2361M3794 = C0950.m3794(main);
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0773.m3169("ܽ֡") ^ i5;
                        i3 = ((iM3169 ^ i6) * 29585) ^ 1371848119;
                        i4 = -564363534;
                    } else {
                        iM3169 = C0773.m3169("ۘܺ") ^ i6;
                        i3 = ((iM3169 ^ i5) * (-13765)) ^ (-1644844991);
                        i4 = 1292935440;
                    }
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    break;
                case 565047523:
                case 792878383:
                    C4282.m13657(c2361M3794, viewM9942);
                    sArr3 = f67679;
                    i14 = 130;
                    if (C2485.f7950 != 0) {
                        iM3169 = C0773.m3169("ܽ֡") ^ i5;
                        i3 = ((iM3169 ^ i6) * 29585) ^ 1371848119;
                        i4 = -564363534;
                    } else {
                        iM3169 = C0773.m3169("ۤ֫") ^ i5;
                        i3 = ((iM3169 ^ i6) * (-19251)) ^ 462451661;
                        i4 = -1878150981;
                    }
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    break;
                case 807770356:
                case 1568018828:
                    int i22 = iM2763;
                    viewM9942 = RunnableC3055.m9942(main, i22);
                    sArr2 = f67679;
                    i12 = 127;
                    if (C3448.f11240 >= 0) {
                        iM2763 = i22;
                        i11 = 3;
                        i18 = i18;
                        spannableStringM48355 = spannableStringM48355;
                        iM2761 = (C0773.m3169("֫֫") + i6) * (-43);
                        i = ((iM2761 ^ i5) * (-21593)) ^ (-848011388);
                        i2 = 1348208245;
                        i8 = iM2761 ^ i2;
                        i7 = i;
                        spannableStringM48355 = spannableStringM48355;
                        i18 = i18;
                        sArr = sArr;
                    } else {
                        int iM31612 = (C0773.m3169("ۢ᩶") + i5) * (-89);
                        iM2763 = i22;
                        i8 = iM31612 ^ (-594307132);
                        i7 = ((iM31612 ^ i6) * (-787)) ^ 226404814;
                        i11 = 3;
                    }
                    break;
                case 895242671:
                case 1728601277:
                    int i23 = i18;
                    sArr = sArr;
                    spannableStringM48355 = spannableStringM48355;
                    int i24 = i19;
                    iM2763 = C0619.m2761(C3077.m10047(sArr, i23, i24, i13)) ^ 2119270298;
                    if (RunnableC3646.f12471) {
                        i18 = i23;
                        i19 = i24;
                        iM2761 = (i6 - C0619.m2761("۟᩻")) * (-107);
                        i = ((iM2761 ^ i5) * (-11849)) ^ 1303468977;
                        i2 = -253476737;
                        i8 = iM2761 ^ i2;
                        i7 = i;
                    } else {
                        int iM31613 = C0773.m3169("ۜ۫") ^ i5;
                        i18 = i23;
                        i7 = ((iM31613 ^ i6) * 10877) ^ 2146904874;
                        i8 = iM31613 ^ (-347925101);
                        i19 = i24;
                    }
                    spannableStringM48355 = spannableStringM48355;
                    i18 = i18;
                    sArr = sArr;
                    break;
                default:
                    sArr = sArr;
                    i18 = i18;
                    spannableStringM48355 = spannableStringM48355;
                    i16 = i15 * i15;
                    i17 = s * 2;
                    if (C3492.m11488()) {
                        iM2761 = (C0619.m2761("ۘ۬") ^ i5) * (-45);
                        i = ((iM2761 ^ i6) * (-19417)) ^ 94349382;
                        i2 = -1644889699;
                    } else {
                        iM2761 = (C0773.m3169("֫֫") + i6) * (-43);
                        i = ((iM2761 ^ i5) * (-21593)) ^ (-848011388);
                        i2 = 1348208245;
                    }
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    spannableStringM48355 = spannableStringM48355;
                    i18 = i18;
                    sArr = sArr;
                    break;
            }
            return;
        }
    }

    public ViewOnClickListenerC21202(AbstractC22044 abstractC22044, C8614 c8614, String str) {
        DialogInterfaceC8327 dialogInterfaceC8327;
        Object obj;
        int i;
        InterfaceC9801 interfaceC9801;
        short[] sArr;
        int i2;
        int i3;
        short[] sArr2;
        int i4;
        short[] sArr3;
        int i5;
        InterfaceC9801 interfaceC9802;
        InterfaceC9801 interfaceC9803;
        short[] sArr4;
        CheckBox checkBox;
        short[] sArr5;
        short[] sArr6;
        int i6;
        int i7;
        C2361 c2361;
        Main main;
        short[] sArr7;
        int i8;
        InterfaceC9801 interfaceC9804;
        short[] sArr8;
        short[] sArr9;
        InterfaceC9801 interfaceC9805;
        CheckBox checkBox2;
        InterfaceC9801 interfaceC9806;
        int i9;
        short[] sArr10;
        int i10;
        Object obj2;
        C2361 c2362;
        short[] sArr11;
        short[] sArr12;
        int i11;
        short[] sArr13;
        short[] sArr14;
        int i12;
        int i13;
        short[] sArr15;
        int i14;
        int i15;
        int iM3169;
        int i16;
        short[] sArr16;
        int i17;
        short[] sArr17;
        int i18;
        int i19;
        short[] sArr18;
        int i20;
        short[] sArr19;
        int i21;
        InterfaceC9801 interfaceC9807;
        InterfaceC9801 interfaceC9808;
        short[] sArr20;
        CheckBox checkBox3;
        short[] sArr21;
        C2361 c2363;
        DialogInterfaceC8327 dialogInterfaceC8327M10090;
        int iM31610;
        int i22;
        int i23;
        int iM2761;
        int i24;
        InterfaceC9801 interfaceC9809;
        int iM31611;
        int i25;
        final ViewOnClickListenerC21202 viewOnClickListenerC21202 = this;
        final String str2 = str;
        int i26 = -873837482;
        int i27 = C1542.f5343;
        int i28 = C3448.f11240;
        short s = f67679[0];
        int i29 = (s * s) + 153664;
        int i30 = s + 392;
        int i31 = (i29 + i29) - (i30 * i30) < 0 ? 62747 : 31757;
        int iM31612 = (C0773.m3169("ۗۧ") + i28) * 59;
        int i32 = ((iM31612 ^ i27) * 22545) ^ 693084818;
        int i33 = iM31612 ^ (-1449128961);
        CheckBox checkBox4 = null;
        InterfaceC9801 interfaceC98010 = null;
        InterfaceC9801 interfaceC98011 = null;
        String strM2049 = null;
        String strM8069 = null;
        String strM6366 = null;
        short[] sArr22 = null;
        short[] sArr23 = null;
        short[] sArr24 = null;
        short[] sArr25 = null;
        short[] sArr26 = null;
        short[] sArr27 = null;
        short[] sArr28 = null;
        Main main2 = null;
        int iM2762 = 0;
        int iM31613 = 0;
        int i34 = 0;
        int iM2763 = 0;
        int i35 = 0;
        int iM31614 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        Object obj3 = null;
        C3054 c3054 = null;
        InterfaceC9801 interfaceC98012 = null;
        InterfaceC9801 interfaceC98013 = null;
        StringBuilder sb = null;
        String str3 = null;
        ArrayList arrayList = null;
        int i43 = 0;
        View viewM9942 = null;
        C2361 c2364 = null;
        ImageView imageView = null;
        ViewOnClickListenerC24932 viewOnClickListenerC24932 = null;
        int i44 = 0;
        int i45 = i32;
        View viewM9333 = null;
        CheckBox checkBox5 = null;
        short[] sArr29 = null;
        final CheckBox checkBox6 = null;
        C23255 c23255 = null;
        Spinner spinner = null;
        final DialogInterfaceC8327 dialogInterfaceC8328 = null;
        int i46 = 0;
        while (true) {
            i26 = i33 ^ (i45 & (((i26 ^ i27) * (-31855)) >> 31));
            switch (i26) {
                case -2126981121:
                case -1925961369:
                    dialogInterfaceC8327 = dialogInterfaceC8328;
                    i17 = i37;
                    interfaceC9801 = interfaceC98013;
                    sArr17 = sArr25;
                    i18 = i39;
                    i19 = i40;
                    sArr18 = sArr26;
                    i20 = i41;
                    sArr19 = sArr27;
                    i21 = i42;
                    interfaceC9807 = interfaceC98010;
                    interfaceC9808 = interfaceC98012;
                    sArr20 = sArr28;
                    checkBox3 = checkBox4;
                    sArr21 = sArr29;
                    imageView = (ImageView) C2834.m9333(viewM9942, C0619.m2761(strM8069) ^ 2098394332);
                    if (!C1519.m5403()) {
                        interfaceC9809 = interfaceC9808;
                        int iM31615 = (C0773.m3169("ۧۧ") ^ i27) * 7;
                        i45 = ((iM31615 ^ i28) * (-28371)) ^ (-1409980230);
                        i33 = iM31615 ^ 1652964730;
                        sArr29 = sArr21;
                        sArr28 = sArr20;
                        interfaceC98010 = interfaceC9807;
                        i42 = i21;
                        sArr27 = sArr19;
                        sArr26 = sArr18;
                        i41 = i20;
                        sArr25 = sArr17;
                        i39 = i18;
                        i40 = i19;
                        interfaceC98013 = interfaceC9801;
                        i37 = i17;
                        dialogInterfaceC8328 = dialogInterfaceC8327;
                        CheckBox checkBox7 = checkBox3;
                        interfaceC98012 = interfaceC9809;
                        checkBox4 = checkBox7;
                    } else {
                        iM2761 = (C0619.m2761("ۙ᩹") + i27) * (-17);
                        i45 = 1932744360 ^ ((iM2761 ^ i28) * 8423);
                        i24 = 606907079;
                        i33 = iM2761 ^ i24;
                        checkBox4 = checkBox3;
                        sArr29 = sArr21;
                        sArr28 = sArr20;
                        i42 = i21;
                        sArr27 = sArr19;
                        sArr26 = sArr18;
                        i41 = i20;
                        sArr25 = sArr17;
                        i39 = i18;
                        i40 = i19;
                        i37 = i17;
                        interfaceC98012 = interfaceC9808;
                        interfaceC98010 = interfaceC9807;
                        interfaceC98013 = interfaceC9801;
                        dialogInterfaceC8328 = dialogInterfaceC8327;
                    }
                    break;
                case -2058081334:
                case 300536340:
                    dialogInterfaceC8327 = dialogInterfaceC8328;
                    InterfaceC9801 interfaceC98014 = interfaceC98013;
                    RunnableC0334.m2050(checkBox4, interfaceC98014.contains(C3734.m12149(sArr29, i44, i46, i31)));
                    viewOnClickListenerC24932 = new ViewOnClickListenerC24932(0, viewOnClickListenerC21202, checkBox5);
                    int iM2764 = C0619.m2761("᩵ᩳ") ^ i27;
                    i33 = iM2764 ^ 263199700;
                    interfaceC98013 = interfaceC98014;
                    i45 = ((iM2764 ^ i28) * 21987) ^ 985856358;
                    dialogInterfaceC8328 = dialogInterfaceC8327;
                    break;
                case -2037407327:
                case 749018277:
                    i44 = i44;
                    viewM9942 = viewM9942;
                    dialogInterfaceC8327 = dialogInterfaceC8328;
                    obj = obj3;
                    i = i37;
                    interfaceC9801 = interfaceC98013;
                    sArr = sArr25;
                    i2 = i39;
                    i3 = i40;
                    sArr2 = sArr26;
                    i4 = i41;
                    sArr3 = sArr27;
                    i5 = i42;
                    interfaceC9802 = interfaceC98010;
                    interfaceC9803 = interfaceC98012;
                    sArr4 = sArr28;
                    checkBox = checkBox4;
                    sArr5 = sArr29;
                    C2361 c2365 = c2364;
                    sArr6 = sArr24;
                    C3033.m9848(c2365, C0619.m2761(str3) ^ 2099769352, obj);
                    sArr23 = f67679;
                    i38 = 10;
                    if (C2354.f7599 < 0) {
                        int iM2765 = (C0619.m2761("ۢۧ") ^ i28) * (-127);
                        i6 = ((iM2765 ^ i27) * 23765) ^ 1890188635;
                        i7 = iM2765 ^ 1488946501;
                        obj3 = obj;
                        sArr24 = sArr6;
                        checkBox4 = checkBox;
                        i42 = i5;
                        sArr27 = sArr3;
                        sArr26 = sArr2;
                        i41 = i4;
                        sArr25 = sArr;
                        i39 = i2;
                        i40 = i3;
                        i44 = i44;
                        c2364 = c2365;
                        interfaceC98012 = interfaceC9803;
                        sArr29 = sArr5;
                        sArr28 = sArr4;
                        interfaceC98010 = interfaceC9802;
                        interfaceC98013 = interfaceC9801;
                        i37 = i;
                        dialogInterfaceC8328 = dialogInterfaceC8327;
                        View view = viewM9942;
                        i33 = i7;
                        i45 = i6;
                        viewM9942 = view;
                    } else {
                        c2361 = c2365;
                        main = main2;
                        sArr7 = sArr22;
                        int iM31616 = (C0773.m3169("ۚۡ") ^ i28) * 89;
                        i45 = (-1823286236) ^ ((iM31616 ^ i27) * (-32043));
                        obj3 = obj;
                        sArr22 = sArr7;
                        sArr24 = sArr6;
                        checkBox4 = checkBox;
                        sArr29 = sArr5;
                        sArr28 = sArr4;
                        i42 = i5;
                        sArr27 = sArr3;
                        sArr26 = sArr2;
                        i41 = i4;
                        sArr25 = sArr;
                        i39 = i2;
                        i40 = i3;
                        i44 = i44;
                        viewM9942 = viewM9942;
                        c2364 = c2361;
                        main2 = main;
                        i33 = iM31616 ^ (-964529568);
                        i37 = i;
                        interfaceC98012 = interfaceC9803;
                        interfaceC98010 = interfaceC9802;
                        str2 = str;
                        interfaceC98013 = interfaceC9801;
                        dialogInterfaceC8328 = dialogInterfaceC8327;
                    }
                    break;
                case -1942828535:
                case 824794701:
                    dialogInterfaceC8327 = dialogInterfaceC8328;
                    i17 = i37;
                    interfaceC9801 = interfaceC98013;
                    int i47 = i40;
                    short[] sArr30 = sArr27;
                    int i48 = i42;
                    interfaceC9807 = interfaceC98010;
                    interfaceC9808 = interfaceC98012;
                    short[] sArr31 = sArr28;
                    CheckBox checkBox8 = checkBox4;
                    short[] sArr32 = sArr29;
                    short[] sArr33 = sArr25;
                    int i49 = i39;
                    sArr17 = sArr33;
                    i18 = i49;
                    i19 = i47;
                    C2375.m8070(C2834.m9333(viewM9942, C0619.m2761(C3998.m12925(sArr33, i49, i47, i31)) ^ 2101534719), new ViewOnClickListenerC23960(1, viewOnClickListenerC21202));
                    sArr26 = f67679;
                    i41 = 25;
                    if (C2966.f9654 >= 0) {
                        iM31611 = (C0773.m3169("᩹᩺") ^ i28) * 87;
                        i45 = 1757385301 ^ ((iM31611 ^ i27) * (-21783));
                        i25 = 1576251024;
                    } else {
                        iM31611 = C0773.m3169("ܿ۠") ^ i28;
                        i45 = 518535982 ^ ((iM31611 ^ i27) * (-10353));
                        i25 = -325784674;
                    }
                    i33 = iM31611 ^ i25;
                    checkBox4 = checkBox8;
                    sArr29 = sArr32;
                    sArr28 = sArr31;
                    i42 = i48;
                    sArr27 = sArr30;
                    sArr25 = sArr17;
                    i39 = i18;
                    i40 = i19;
                    i37 = i17;
                    interfaceC98012 = interfaceC9808;
                    interfaceC98010 = interfaceC9807;
                    interfaceC98013 = interfaceC9801;
                    dialogInterfaceC8328 = dialogInterfaceC8327;
                    break;
                case -1861782833:
                case 847410600:
                    DialogInterfaceC8327 dialogInterfaceC8329 = dialogInterfaceC8328;
                    int i50 = i36;
                    short[] sArr34 = sArr28;
                    int i51 = i37;
                    InterfaceC9801 interfaceC98015 = interfaceC98012;
                    RunnableC0334.m2050(checkBox5, interfaceC98015.contains(C0619.m2756(sArr34, i51, i50, i31)));
                    interfaceC98013 = ApplicationC17729.f58258;
                    short[] sArr35 = f67679;
                    int iM2766 = (C0619.m2761("֫֡") + i28) * 69;
                    int i52 = ((iM2766 ^ i27) * 21695) ^ (-269095266);
                    i33 = iM2766 ^ (-1913033992);
                    i36 = i50;
                    sArr28 = sArr34;
                    sArr29 = sArr35;
                    interfaceC98012 = interfaceC98015;
                    i45 = i52;
                    i37 = i51;
                    dialogInterfaceC8328 = dialogInterfaceC8329;
                    i44 = 75;
                    i46 = 15;
                    break;
                case -1840340107:
                case 38911010:
                    RunnableC0334.m2063();
                    C1080.m4050();
                    i10 = i44;
                    viewM9942 = viewM9942;
                    dialogInterfaceC8327 = dialogInterfaceC8328;
                    obj2 = obj3;
                    c2362 = c2364;
                    i8 = i37;
                    interfaceC9804 = interfaceC98013;
                    sArr12 = sArr23;
                    i11 = i38;
                    sArr13 = sArr24;
                    sArr14 = sArr25;
                    i12 = i39;
                    i13 = i40;
                    sArr15 = sArr26;
                    i14 = i41;
                    sArr10 = sArr27;
                    i9 = i42;
                    interfaceC9806 = interfaceC98010;
                    interfaceC9805 = interfaceC98012;
                    sArr8 = sArr28;
                    checkBox2 = checkBox4;
                    sArr9 = sArr29;
                    sArr11 = sArr22;
                    iM3169 = C0619.m2761("֫᩸") ^ i27;
                    i6 = ((iM3169 ^ i28) * 1785) ^ (-1728787004);
                    i16 = -1754688449;
                    i7 = iM3169 ^ i16;
                    sArr22 = sArr11;
                    i38 = i11;
                    sArr24 = sArr13;
                    checkBox4 = checkBox2;
                    sArr29 = sArr9;
                    sArr28 = sArr8;
                    i42 = i9;
                    sArr27 = sArr10;
                    sArr26 = sArr15;
                    i41 = i14;
                    sArr25 = sArr14;
                    i39 = i12;
                    i40 = i13;
                    sArr23 = sArr12;
                    c2364 = c2362;
                    obj3 = obj2;
                    i37 = i8;
                    interfaceC98012 = interfaceC9805;
                    interfaceC98010 = interfaceC9806;
                    i44 = i10;
                    interfaceC98013 = interfaceC9804;
                    dialogInterfaceC8328 = dialogInterfaceC8327;
                    View view2 = viewM9942;
                    i33 = i7;
                    i45 = i6;
                    viewM9942 = view2;
                    break;
                case -1691915738:
                case -975546426:
                    dialogInterfaceC8327 = dialogInterfaceC8328;
                    i = i37;
                    interfaceC9801 = interfaceC98013;
                    short[] sArr36 = sArr28;
                    short[] sArr37 = sArr29;
                    C2361 c2366 = c2364;
                    int i53 = i44;
                    viewM9942 = viewM9942;
                    short[] sArr38 = sArr23;
                    int i54 = i38;
                    int iM2767 = C0619.m2761(C3734.m12149(sArr38, i54, 3, i31)) ^ 2101787388;
                    Object obj4 = obj3;
                    C2375.m8063(c2366, iM2767, obj4);
                    int iM2768 = C0619.m2761("ܰۤ") ^ i27;
                    i6 = ((iM2768 ^ i28) * 19337) ^ (-1497020406);
                    i7 = iM2768 ^ 405221555;
                    i38 = i54;
                    sArr24 = sArr24;
                    checkBox4 = checkBox4;
                    i42 = i42;
                    sArr27 = sArr27;
                    sArr26 = sArr26;
                    i41 = i41;
                    sArr25 = sArr25;
                    i39 = i39;
                    i40 = i40;
                    sArr23 = sArr38;
                    c2364 = c2366;
                    obj3 = obj4;
                    interfaceC98012 = interfaceC98012;
                    sArr29 = sArr37;
                    sArr28 = sArr36;
                    interfaceC98010 = interfaceC98010;
                    i44 = i53;
                    interfaceC98013 = interfaceC9801;
                    i37 = i;
                    dialogInterfaceC8328 = dialogInterfaceC8327;
                    View view3 = viewM9942;
                    i33 = i7;
                    i45 = i6;
                    viewM9942 = view3;
                    break;
                case -1628679246:
                case 81637561:
                    dialogInterfaceC8327 = dialogInterfaceC8328;
                    i17 = i37;
                    interfaceC9801 = interfaceC98013;
                    i21 = i42;
                    interfaceC9807 = interfaceC98010;
                    interfaceC9808 = interfaceC98012;
                    sArr20 = sArr28;
                    checkBox3 = checkBox4;
                    sArr21 = sArr29;
                    sArr19 = sArr27;
                    short[] sArr39 = sArr26;
                    int i55 = i41;
                    sArr18 = sArr39;
                    C2375.m8070(C2834.m9333(viewM9942, C0619.m2761(C1542.m5471(sArr39, i55, 3, i31)) ^ 2118824916), new View.OnClickListener() { // from class: l.ۧۡۤ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            ViewOnClickListenerC21202.m48356(this.f36204);
                        }
                    });
                    i20 = i55;
                    strM6366 = RunnableC1848.m6366(f67679, 28, 3, i31);
                    if (AbstractC0641.f2496 < 0) {
                        int iM31617 = C0773.m3169("ۘ᩵") ^ i27;
                        i45 = 1181909149 ^ ((iM31617 ^ i28) * 27045);
                        i33 = iM31617 ^ 1278329713;
                        checkBox4 = checkBox3;
                        sArr29 = sArr21;
                        sArr28 = sArr20;
                        i42 = i21;
                        sArr27 = sArr19;
                        sArr26 = sArr18;
                        i41 = i20;
                        i37 = i17;
                        interfaceC98012 = interfaceC9808;
                        interfaceC98010 = interfaceC9807;
                        interfaceC98013 = interfaceC9801;
                        dialogInterfaceC8328 = dialogInterfaceC8327;
                    } else {
                        c2363 = c2364;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8327;
                        sArr17 = sArr25;
                        i18 = i39;
                        i19 = i40;
                        iM31610 = C0773.m3169("֡۠") ^ i28;
                        dialogInterfaceC8327 = dialogInterfaceC8327M10090;
                        i22 = ((iM31610 ^ i27) * (-23093)) ^ (-611955792);
                        i23 = 2047322764;
                        i33 = iM31610 ^ i23;
                        i45 = i22;
                        c2364 = c2363;
                        checkBox4 = checkBox3;
                        sArr29 = sArr21;
                        sArr28 = sArr20;
                        i42 = i21;
                        sArr27 = sArr19;
                        sArr26 = sArr18;
                        i41 = i20;
                        sArr25 = sArr17;
                        i39 = i18;
                        i40 = i19;
                        i37 = i17;
                        interfaceC98012 = interfaceC9808;
                        interfaceC98010 = interfaceC9807;
                        interfaceC98013 = interfaceC9801;
                        dialogInterfaceC8328 = dialogInterfaceC8327;
                    }
                    break;
                case -1603434207:
                case 535445894:
                    C2310.m7800(c23255, C2702.m8877(interfaceC98011, C2023.m6952(sb), ""));
                    C21232.m48398(dialogInterfaceC8328);
                    dialogInterfaceC8328.m22426(new DialogInterface.OnDismissListener(viewOnClickListenerC21202) { // from class: l.ܺۡۤ

                        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ViewOnClickListenerC21202 f54018;

                        {
                            int i56 = -1559712876;
                            int i57 = C20932.f66974;
                            int i58 = C3734.f12817;
                            int iM2769 = (i58 - C0619.m2761("ܿۜ")) * 95;
                            int i59 = ((iM2769 ^ i57) * (-31379)) ^ 1371187240;
                            int i60 = 789777235;
                            while (true) {
                                i56 = ((((i56 ^ i57) * (-17877)) >> 31) & i59) ^ (iM2769 ^ i60);
                                switch (i56) {
                                    case -2010983888:
                                    case 459960117:
                                        if (C1080.m4050()) {
                                            iM2769 = C0773.m3169("֡ۘ") ^ i58;
                                            i59 = ((iM2769 ^ i57) * 10201) ^ 104369953;
                                            i60 = 1264642561;
                                        } else {
                                            iM2769 = C0619.m2761("ۤ֨") ^ i58;
                                            i59 = ((iM2769 ^ i57) * (-7783)) ^ (-1955743927);
                                            i60 = 2014041303;
                                        }
                                        break;
                                    case -1973902629:
                                    case -316948182:
                                        if (C3779.f12953 > 0) {
                                            iM2769 = (C0619.m2761("ۧ᩹") ^ i57) * (-79);
                                            i59 = ((iM2769 ^ i58) * (-24581)) ^ 569094630;
                                            i60 = 934863783;
                                        } else {
                                            iM2769 = (C0773.m3169("ܺ֨") + i57) * 43;
                                            i59 = ((iM2769 ^ i58) * 7049) ^ (-1502543179);
                                            i60 = 160995573;
                                        }
                                        break;
                                    case -1848167715:
                                    case 1546403310:
                                        if (C3033.f9831 >= 0) {
                                            iM2769 = C0619.m2761("ۤ֨") ^ i58;
                                            i59 = ((iM2769 ^ i57) * (-7783)) ^ (-1955743927);
                                            i60 = 2014041303;
                                        } else {
                                            iM2769 = (C0619.m2761("ܳܳ") + i57) * 75;
                                            i59 = ((iM2769 ^ i58) * (-305)) ^ (-1871276619);
                                            i60 = -1094264406;
                                        }
                                        break;
                                    case -1842326062:
                                    case -1041812150:
                                        return;
                                    case -1751798086:
                                    case 2119732088:
                                        if (C1826.m6301() >= 0) {
                                            iM2769 = (C0619.m2761("ۧ᩹") ^ i57) * (-79);
                                            i59 = ((iM2769 ^ i58) * (-24581)) ^ 569094630;
                                            i60 = 934863783;
                                        } else {
                                            iM2769 = (i58 - C0619.m2761("֡ᩴ")) * 95;
                                            i59 = ((iM2769 ^ i57) * 13867) ^ (-1026192413);
                                            i60 = -381827966;
                                        }
                                        break;
                                    case -1725858691:
                                    case -563047953:
                                        if (AbstractC0641.f2496 >= 0) {
                                            iM2769 = (C0773.m3169("ܺ֨") + i57) * 43;
                                            i59 = ((iM2769 ^ i58) * 7049) ^ (-1502543179);
                                            i60 = 160995573;
                                        } else {
                                            iM2769 = C0773.m3169("᩹ܽ") ^ i58;
                                            i59 = ((iM2769 ^ i57) * 1255) ^ (-1760366944);
                                            i60 = -1817685067;
                                        }
                                        break;
                                    case -1696803226:
                                    case -714602584:
                                        if (C3690.m11987()) {
                                            iM2769 = (C0619.m2761("ۧ᩹") ^ i57) * (-79);
                                            i59 = ((iM2769 ^ i58) * (-24581)) ^ 569094630;
                                            i60 = 934863783;
                                        } else {
                                            iM2769 = (C0619.m2761("ۨܶ") ^ i57) * 101;
                                            i59 = ((iM2769 ^ i58) * 9895) ^ (-1786659961);
                                            i60 = 1789283111;
                                        }
                                        break;
                                    case -1503758388:
                                    case 424732812:
                                        C3734.m12152();
                                        if (C3998.f13671 != 0) {
                                            iM2769 = C0619.m2761("ۤ֨") ^ i58;
                                            i59 = ((iM2769 ^ i57) * (-7783)) ^ (-1955743927);
                                            i60 = 2014041303;
                                        } else {
                                            iM2769 = (C0619.m2761("ۧ᩹") ^ i57) * (-79);
                                            i59 = ((iM2769 ^ i58) * (-24581)) ^ 569094630;
                                            i60 = 934863783;
                                        }
                                        break;
                                    case -1125457479:
                                    case 957667940:
                                        C13473.m33144();
                                        throw new RuntimeException();
                                    case -1116745612:
                                    case -158736157:
                                        if (C2702.m8876()) {
                                            iM2769 = C0619.m2761("ۙۜ") ^ i58;
                                            i59 = ((iM2769 ^ i57) * 8711) ^ 1502815978;
                                            i60 = -918804364;
                                        } else {
                                            iM2769 = (i58 - C0619.m2761("᩵۟")) * (-75);
                                            i59 = ((iM2769 ^ i57) * 21205) ^ 1670805336;
                                            i60 = 311310203;
                                        }
                                        break;
                                    case -60490222:
                                    case 2146812951:
                                        this.f54018 = viewOnClickListenerC21202;
                                        if (RunnableC0334.m2063()) {
                                            iM2769 = C0773.m3169("۟ۖ") ^ i58;
                                            i59 = ((iM2769 ^ i57) * (-15763)) ^ (-1941631921);
                                            i60 = -1941897758;
                                        } else {
                                            iM2769 = C0619.m2761("۠᩹") ^ i57;
                                            i59 = ((iM2769 ^ i58) * (-22739)) ^ (-1485011562);
                                            i60 = -599406593;
                                        }
                                        break;
                                    case -45971360:
                                    case -17646324:
                                        RunnableC3646.m11813();
                                        if (C2023.m6964() > 0) {
                                            iM2769 = (i58 - C0619.m2761("᩵۟")) * (-75);
                                            i59 = ((iM2769 ^ i57) * 21205) ^ 1670805336;
                                            i60 = 311310203;
                                        } else {
                                            iM2769 = (C0773.m3169("ܺ֨") + i57) * 43;
                                            i59 = ((iM2769 ^ i58) * 7049) ^ (-1502543179);
                                            i60 = 160995573;
                                        }
                                        break;
                                    case -40155890:
                                    case 1200327872:
                                        C2834.m9344();
                                        iM2769 = (C0773.m3169("ܺ֨") + i57) * 43;
                                        i59 = ((iM2769 ^ i58) * 7049) ^ (-1502543179);
                                        i60 = 160995573;
                                        break;
                                    case 112961256:
                                    case 247555488:
                                        if (C17202.f56030) {
                                            iM2769 = (C0619.m2761("ۚܿ") ^ i57) * (-79);
                                            i59 = ((iM2769 ^ i58) * (-25297)) ^ (-1726197803);
                                            i60 = -1252093352;
                                        } else {
                                            iM2769 = (i58 - C0619.m2761("᩵۟")) * (-75);
                                            i59 = ((iM2769 ^ i57) * 21205) ^ 1670805336;
                                            i60 = 311310203;
                                        }
                                        break;
                                    case 182049978:
                                    case 881124541:
                                        if (C2288.f7433 <= 0) {
                                            iM2769 = C0619.m2761("ۤ֨") ^ i58;
                                            i59 = ((iM2769 ^ i57) * (-7783)) ^ (-1955743927);
                                            i60 = 2014041303;
                                        } else {
                                            iM2769 = C0773.m3169("ۖۘ") ^ i58;
                                            i59 = ((iM2769 ^ i57) * (-3895)) ^ (-1725074784);
                                            i60 = 265077277;
                                        }
                                        break;
                                    default:
                                        if (C2702.f8586 <= 0) {
                                            iM2769 = C0773.m3169("۟ۖ") ^ i58;
                                            i59 = ((iM2769 ^ i57) * (-15763)) ^ (-1941631921);
                                            i60 = -1941897758;
                                        } else {
                                            iM2769 = C0773.m3169("֨ۜ") ^ i57;
                                            i59 = ((iM2769 ^ i58) * (-23817)) ^ 1184728864;
                                            i60 = -349484037;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            ViewOnClickListenerC21202 viewOnClickListenerC21203 = null;
                            int i56 = -992903982;
                            int i57 = C23916.f77426;
                            int i58 = C3448.f11240;
                            int iM31618 = C0773.m3169("ۘ᩺") ^ i58;
                            int i59 = ((iM31618 ^ i57) * 3541) ^ (-629168252);
                            int i60 = -1418811781;
                            while (true) {
                                i56 = ((((i56 ^ i57) * 19107) >> 31) & i59) ^ (iM31618 ^ i60);
                                switch (i56) {
                                    case -2076990625:
                                    case 1127638048:
                                        if (C3998.f13671 != 0) {
                                            iM31618 = (C0773.m3169("᩻᩵") ^ i57) * (-35);
                                            i59 = ((iM31618 ^ i58) * (-31767)) ^ (-1429734977);
                                            i60 = -1166344032;
                                        } else {
                                            iM31618 = C0619.m2761("ܽۢ") ^ i57;
                                            i59 = ((iM31618 ^ i58) * (-26723)) ^ 1092951907;
                                            i60 = 1443439011;
                                        }
                                        break;
                                    case -1782615857:
                                    case -1071570759:
                                        C1519.m5403();
                                        if (!C2354.m7983()) {
                                            iM31618 = (C0619.m2761("ۖ۫") + i57) * (-113);
                                            i59 = ((iM31618 ^ i58) * (-17985)) ^ (-1774046791);
                                            i60 = -542683171;
                                        } else {
                                            iM31618 = (i58 - C0619.m2761("᩻ᩴ")) * 49;
                                            i59 = ((iM31618 ^ i57) * 7005) ^ 1457403893;
                                            i60 = 1976086498;
                                        }
                                        break;
                                    case -1685576235:
                                    case 1773133558:
                                        if (C0269.f1558 <= 0) {
                                            iM31618 = (C0619.m2761("ۖ۫") + i57) * (-113);
                                            i59 = ((iM31618 ^ i58) * (-17985)) ^ (-1774046791);
                                            i60 = -542683171;
                                        } else {
                                            iM31618 = C0773.m3169("᩺ۜ") ^ i58;
                                            i59 = ((iM31618 ^ i57) * (-8465)) ^ 1003009181;
                                            i60 = -1050896120;
                                        }
                                        break;
                                    case -1494095236:
                                    case -555692776:
                                        C1519.m5403();
                                        C2354.m7983();
                                        iM31618 = (i58 - C0619.m2761("᩻ᩴ")) * 49;
                                        i59 = ((iM31618 ^ i57) * 7005) ^ 1457403893;
                                        i60 = 1976086498;
                                        break;
                                    case -1319613589:
                                    case 256168328:
                                        ViewOnClickListenerC21202.m48343(viewOnClickListenerC21203, str2);
                                        break;
                                    case -1161525909:
                                    case 562477554:
                                        if (C11235.m28309() != 0) {
                                            iM31618 = C0773.m3169("֫ۜ") ^ i57;
                                            i59 = ((iM31618 ^ i58) * 19851) ^ (-639615006);
                                            i60 = -1139544657;
                                        } else {
                                            iM31618 = C0773.m3169("۬ܰ") ^ i57;
                                            i59 = ((iM31618 ^ i58) * (-32303)) ^ 2139846167;
                                            i60 = -1586779257;
                                        }
                                        break;
                                    case -743928961:
                                    case 874124165:
                                        if (C17202.f56030) {
                                            iM31618 = C0619.m2761("ܽۤ") ^ i57;
                                            i59 = ((iM31618 ^ i58) * 12835) ^ 686638271;
                                            i60 = 323913497;
                                        } else {
                                            iM31618 = (C0773.m3169("᩻᩵") ^ i57) * (-35);
                                            i59 = ((iM31618 ^ i58) * (-31767)) ^ (-1429734977);
                                            i60 = -1166344032;
                                        }
                                        break;
                                    case -307737538:
                                    case 689723969:
                                        if (C1519.f5300 >= 0) {
                                            iM31618 = C0773.m3169("֫ۜ") ^ i57;
                                            i59 = ((iM31618 ^ i58) * 19851) ^ (-639615006);
                                            i60 = -1139544657;
                                        } else {
                                            iM31618 = C0619.m2761("ܺᩳ") ^ i58;
                                            i59 = ((iM31618 ^ i57) * 5181) ^ (-411895044);
                                            i60 = 1385022388;
                                        }
                                        break;
                                    case -226260407:
                                    case 1227296956:
                                        if (C20932.f66974 > 0) {
                                            iM31618 = C0773.m3169("֫ۜ") ^ i57;
                                            i59 = ((iM31618 ^ i58) * 19851) ^ (-639615006);
                                            i60 = -1139544657;
                                        } else {
                                            iM31618 = (i58 - C0619.m2761("᩻ᩴ")) * 49;
                                            i59 = ((iM31618 ^ i57) * 7005) ^ 1457403893;
                                            i60 = 1976086498;
                                        }
                                        break;
                                    case 11682911:
                                    case 1999110965:
                                        C11235.m28309();
                                        break;
                                    case 61215026:
                                    case 699216840:
                                        if (RunnableC0334.f1808 <= 0) {
                                            iM31618 = (i58 - C0619.m2761("᩻ᩴ")) * 49;
                                            i59 = ((iM31618 ^ i57) * 7005) ^ 1457403893;
                                            i60 = 1976086498;
                                        } else {
                                            iM31618 = (i57 - C0619.m2761("ܿܶ")) * 27;
                                            i59 = ((iM31618 ^ i58) * (-245)) ^ 433339358;
                                            i60 = -666300133;
                                        }
                                        break;
                                    case 210549471:
                                    case 689315340:
                                        if (RunnableC1848.m6360()) {
                                            iM31618 = (C0619.m2761("ۖ۫") + i57) * (-113);
                                            i59 = ((iM31618 ^ i58) * (-17985)) ^ (-1774046791);
                                            i60 = -542683171;
                                        } else {
                                            iM31618 = (C0773.m3169("ܰۖ") ^ i58) * 37;
                                            i59 = ((iM31618 ^ i57) * (-22971)) ^ (-1780321007);
                                            i60 = -777012960;
                                        }
                                        break;
                                    case 893819167:
                                    case 1582171022:
                                        viewOnClickListenerC21203 = this.f54018;
                                        if (C3033.f9831 >= 0) {
                                            iM31618 = (C0773.m3169("᩻᩵") ^ i57) * (-35);
                                            i59 = ((iM31618 ^ i58) * (-31767)) ^ (-1429734977);
                                            i60 = -1166344032;
                                        } else {
                                            iM31618 = (i57 - C0619.m2761("֡ܿ")) * 91;
                                            i59 = ((iM31618 ^ i58) * (-14351)) ^ 1404156525;
                                            i60 = 1607880867;
                                        }
                                        break;
                                    case 1126691967:
                                    case 1893723009:
                                        if (C2287.m7745() <= 0) {
                                            iM31618 = (i58 - C0619.m2761("᩻ᩴ")) * 49;
                                            i59 = ((iM31618 ^ i57) * 7005) ^ 1457403893;
                                            i60 = 1976086498;
                                        } else {
                                            iM31618 = (C0773.m3169("᩻ۛ") ^ i58) * (-33);
                                            i59 = ((iM31618 ^ i57) * 24745) ^ 2037961430;
                                            i60 = 981375071;
                                        }
                                        break;
                                    case 1493219538:
                                    case 1827313008:
                                        if (C0862.m3503()) {
                                            iM31618 = C0619.m2761("֨ۛ") ^ i58;
                                            i59 = ((iM31618 ^ i57) * (-14383)) ^ 1682545378;
                                            i60 = -1241052901;
                                        } else {
                                            iM31618 = (C0619.m2761("ۖ۫") + i57) * (-113);
                                            i59 = ((iM31618 ^ i58) * (-17985)) ^ (-1774046791);
                                            i60 = -542683171;
                                        }
                                        break;
                                    default:
                                        if (AbstractC0641.f2496 < 0) {
                                            iM31618 = (C0619.m2761("ۖ۫") + i57) * (-113);
                                            i59 = ((iM31618 ^ i58) * (-17985)) ^ (-1774046791);
                                            i60 = -542683171;
                                        } else {
                                            iM31618 = C0773.m3169("᩶ܿ") ^ i58;
                                            i59 = ((iM31618 ^ i57) * 14047) ^ 22086481;
                                            i60 = 2113271776;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    C2375.m8070(RunnableC3055.m9932(dialogInterfaceC8328), new View.OnClickListener(viewOnClickListenerC21202) { // from class: l.ܽۡۤ

                        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ViewOnClickListenerC21202 f56804;

                        {
                            int i56 = -1825990424;
                            int i57 = C11235.f35427;
                            int i58 = C1321.f4751;
                            int iM2769 = (i57 - C0619.m2761("ۗۚ")) * 45;
                            int i59 = ((iM2769 ^ i58) * 18783) ^ (-163530223);
                            int i60 = -440497521;
                            while (true) {
                                i56 = ((((i56 ^ i58) * 11295) >> 31) & i59) ^ (iM2769 ^ i60);
                                switch (i56) {
                                    case -2098143826:
                                    case -507715366:
                                        if (C4282.f15546 > 0) {
                                            iM2769 = C0619.m2761("ۡ۠") ^ i58;
                                            i59 = ((iM2769 ^ i57) * 349) ^ (-1188798973);
                                            i60 = -1673315105;
                                        } else {
                                            iM2769 = (C0619.m2761("ۤܳ") ^ i58) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i59 = ((iM2769 ^ i57) * 24937) ^ 1097020005;
                                            i60 = -978737622;
                                        }
                                        break;
                                    case -1846533378:
                                    case 1930875675:
                                        C2354.m7983();
                                        C0950.m3785();
                                        throw new RuntimeException();
                                    case -1823375085:
                                    case -300653077:
                                        if (C3099.m10095()) {
                                            iM2769 = C0619.m2761("ۡ۠") ^ i58;
                                            i59 = ((iM2769 ^ i57) * 349) ^ (-1188798973);
                                            i60 = -1673315105;
                                        } else {
                                            iM2769 = (C0619.m2761("ܽۖ") + i58) * 49;
                                            i59 = ((iM2769 ^ i57) * (-23321)) ^ 91558862;
                                            i60 = 704089552;
                                        }
                                        break;
                                    case -1742632677:
                                    case 476639383:
                                        if (C2702.f8586 <= 0) {
                                            iM2769 = (i57 - C0773.m3169("᩵ۨ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i59 = ((iM2769 ^ i58) * (-17451)) ^ 708930838;
                                            i60 = -1009856852;
                                        } else {
                                            iM2769 = (i57 - C0619.m2761("֡ۗ")) * 109;
                                            i59 = ((iM2769 ^ i58) * (-14035)) ^ (-610770015);
                                            i60 = 1679212749;
                                        }
                                        break;
                                    case -1529084711:
                                    case 874643794:
                                        this.f56804 = viewOnClickListenerC21202;
                                        if (C2878.m9491() <= 0) {
                                            iM2769 = C0619.m2761("ۡ۠") ^ i58;
                                            i59 = ((iM2769 ^ i57) * 349) ^ (-1188798973);
                                            i60 = -1673315105;
                                        } else {
                                            iM2769 = C0619.m2761("֡ܿ") ^ i57;
                                            i59 = ((iM2769 ^ i58) * (-953)) ^ 977999216;
                                            i60 = 997189225;
                                        }
                                        break;
                                    case -1450352509:
                                    case 927917764:
                                        if (C3448.f11240 >= 0) {
                                            iM2769 = C0619.m2761("ۡ۠") ^ i58;
                                            i59 = ((iM2769 ^ i57) * 349) ^ (-1188798973);
                                            i60 = -1673315105;
                                        } else {
                                            iM2769 = C0773.m3169("ܰ۠") ^ i58;
                                            i59 = ((iM2769 ^ i57) * 21625) ^ (-1134669680);
                                            i60 = 2096460920;
                                        }
                                        break;
                                    case -1332159708:
                                    case 934814489:
                                        if (C2878.f9462) {
                                            iM2769 = C0773.m3169("۫ۖ") ^ i57;
                                            i59 = ((iM2769 ^ i58) * 23561) ^ (-1205654469);
                                            i60 = 1523022843;
                                        } else {
                                            iM2769 = (i58 - C0773.m3169("ܿ᩻")) * (-115);
                                            i59 = ((iM2769 ^ i57) * 8253) ^ 1586165929;
                                            i60 = 2007747270;
                                        }
                                        break;
                                    case -1092246012:
                                    case -630370637:
                                        if (C3077.f9998) {
                                            iM2769 = C0773.m3169("ۚۢ") ^ i57;
                                            i59 = ((iM2769 ^ i58) * (-17851)) ^ 1055538430;
                                            i60 = -1520776443;
                                        } else {
                                            iM2769 = C0773.m3169("۫ۖ") ^ i57;
                                            i59 = ((iM2769 ^ i58) * 23561) ^ (-1205654469);
                                            i60 = 1523022843;
                                        }
                                        break;
                                    case -980423313:
                                    case -656253890:
                                        if (C0773.f2792 <= 0) {
                                            iM2769 = C0773.m3169("ۖۨ") ^ i58;
                                            i59 = ((iM2769 ^ i57) * (-19525)) ^ (-235918149);
                                            i60 = 610850823;
                                        } else {
                                            iM2769 = C0773.m3169("ۘۘ") ^ i58;
                                            i59 = ((iM2769 ^ i57) * 14929) ^ 1985910371;
                                            i60 = -1034881826;
                                        }
                                        break;
                                    case -895973980:
                                    case 2061324170:
                                        if (C13473.f42873 != 0) {
                                            iM2769 = C0619.m2761("ۡ۠") ^ i58;
                                            i59 = ((iM2769 ^ i57) * 349) ^ (-1188798973);
                                            i60 = -1673315105;
                                        } else {
                                            iM2769 = C0773.m3169("᩸֡") ^ i57;
                                            i59 = ((iM2769 ^ i58) * (-13277)) ^ 1883421571;
                                            i60 = 1466885138;
                                        }
                                        break;
                                    case -601244903:
                                    case 407322985:
                                        C2834.m9344();
                                        C2023.m6964();
                                        iM2769 = (C0619.m2761("ۤܳ") ^ i58) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                        i59 = ((iM2769 ^ i57) * 24937) ^ 1097020005;
                                        i60 = -978737622;
                                        break;
                                    case -406661761:
                                    case 475657082:
                                        if (C4282.f15546 <= 0) {
                                            iM2769 = (i57 - C0773.m3169("᩵ۨ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i59 = ((iM2769 ^ i58) * (-17451)) ^ 708930838;
                                            i60 = -1009856852;
                                        } else {
                                            iM2769 = C0773.m3169("ۤۡ") ^ i58;
                                            i59 = ((iM2769 ^ i57) * 7807) ^ (-569447134);
                                            i60 = -1158614127;
                                        }
                                        break;
                                    case 158126280:
                                    case 987447227:
                                        C2354.m7983();
                                        if (C1783.f6087 > 0) {
                                            iM2769 = C0773.m3169("۫ۖ") ^ i57;
                                            i59 = ((iM2769 ^ i58) * 23561) ^ (-1205654469);
                                            i60 = 1523022843;
                                        } else {
                                            iM2769 = (i57 - C0773.m3169("᩵ۨ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i59 = ((iM2769 ^ i58) * (-17451)) ^ 708930838;
                                            i60 = -1009856852;
                                        }
                                        break;
                                    case 1505393945:
                                    case 1690890405:
                                        return;
                                    case 1584374677:
                                    case 1669400727:
                                        if (C0487.f2131 <= 0) {
                                            iM2769 = (C0619.m2761("ۤܳ") ^ i58) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i59 = ((iM2769 ^ i57) * 24937) ^ 1097020005;
                                            i60 = -978737622;
                                        } else {
                                            iM2769 = C0773.m3169("֨ۤ") ^ i57;
                                            i59 = ((iM2769 ^ i58) * (-29665)) ^ 295397960;
                                            i60 = 1965051927;
                                        }
                                        break;
                                    default:
                                        if (RunnableC3646.m11813() != 0) {
                                            iM2769 = (i57 - C0773.m3169("᩵ۨ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i59 = ((iM2769 ^ i58) * (-17451)) ^ 708930838;
                                            i60 = -1009856852;
                                        } else {
                                            iM2769 = (C0619.m2761("ۤܳ") ^ i58) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i59 = ((iM2769 ^ i57) * 24937) ^ 1097020005;
                                            i60 = -978737622;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            String str4 = null;
                            CheckBox checkBox9 = null;
                            int i56 = -1842610225;
                            int i57 = C1519.f5300;
                            int i58 = C2702.f8586;
                            int iM31618 = C0773.m3169("֨ܽ") ^ i58;
                            int i59 = ((iM31618 ^ i57) * 31713) ^ 1981205079;
                            int i60 = 942632419;
                            while (true) {
                                i56 = ((((i56 ^ i57) * (-3577)) >> 31) & i59) ^ (iM31618 ^ i60);
                                switch (i56) {
                                    case -1830028537:
                                    case 1494944936:
                                        checkBox9 = checkBox6;
                                        if (C20932.f66974 <= 0) {
                                            iM31618 = (C0773.m3169("۠᩷") ^ i58) * (-43);
                                            i59 = ((iM31618 ^ i57) * (-5895)) ^ 962732065;
                                            i60 = -1386642310;
                                        } else {
                                            iM31618 = (C0773.m3169("۠ܿ") ^ i57) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i59 = ((iM31618 ^ i58) * 6757) ^ (-1560694768);
                                            i60 = 1614442102;
                                        }
                                        break;
                                    case -1535030588:
                                    case -1089235063:
                                        if (C0862.m3503()) {
                                            iM31618 = (i58 - C0773.m3169("۬᩶")) * (-53);
                                            i59 = ((iM31618 ^ i57) * 23045) ^ (-1465310080);
                                            i60 = -1418490834;
                                        } else {
                                            iM31618 = (C0619.m2761("ᩳᩳ") + i58) * 71;
                                            i59 = ((iM31618 ^ i57) * 29171) ^ (-1096687820);
                                            i60 = -299640449;
                                        }
                                        break;
                                    case -1438097144:
                                    case -944275723:
                                        if (C0269.m1775() <= 0) {
                                            iM31618 = C0773.m3169("᩵۫") ^ i58;
                                            i59 = ((iM31618 ^ i57) * (-1873)) ^ 345265262;
                                            i60 = -1082789263;
                                        } else {
                                            iM31618 = C0773.m3169("۫ۘ") ^ i58;
                                            i59 = ((iM31618 ^ i57) * (-24995)) ^ 850385935;
                                            i60 = 1605816225;
                                        }
                                        break;
                                    case -1248555427:
                                    case 1724193471:
                                        if (C2419.f7754 >= 0) {
                                            iM31618 = C0773.m3169("᩵۫") ^ i58;
                                            i59 = ((iM31618 ^ i57) * (-1873)) ^ 345265262;
                                            i60 = -1082789263;
                                        } else {
                                            iM31618 = (C0619.m2761("ܶۛ") + i58) * (-125);
                                            i59 = ((iM31618 ^ i57) * 26589) ^ 1924154559;
                                            i60 = -2047912571;
                                        }
                                        break;
                                    case -1031244010:
                                    case 2070094794:
                                        ViewOnClickListenerC21202.m48345(this.f56804, dialogInterfaceC8328, str4, checkBox9);
                                        break;
                                    case -894362688:
                                    case 2013691629:
                                        C0950.m3785();
                                        if (C0773.f2792 > 0) {
                                            iM31618 = C0773.m3169("᩵۫") ^ i58;
                                            i59 = ((iM31618 ^ i57) * (-1873)) ^ 345265262;
                                            i60 = -1082789263;
                                        } else {
                                            iM31618 = (C0619.m2761("ܰ᩸") ^ i57) * 91;
                                            i59 = ((iM31618 ^ i58) * (-28055)) ^ (-399013407);
                                            i60 = -1973678700;
                                        }
                                        break;
                                    case -862037684:
                                    case 948208847:
                                        if (C2288.m7767()) {
                                            iM31618 = (C0619.m2761("ᩳᩳ") + i58) * 71;
                                            i59 = ((iM31618 ^ i57) * 29171) ^ (-1096687820);
                                            i60 = -299640449;
                                        } else {
                                            iM31618 = C0619.m2761("ۗۢ") ^ i57;
                                            i59 = ((iM31618 ^ i58) * 25651) ^ (-2019690763);
                                            i60 = 1617812829;
                                        }
                                        break;
                                    case -735530805:
                                    case 1883323594:
                                        if (RunnableC3055.f9898 >= 0) {
                                            iM31618 = (C0619.m2761("ܰ᩸") ^ i57) * 91;
                                            i59 = ((iM31618 ^ i58) * (-28055)) ^ (-399013407);
                                            i60 = -1973678700;
                                        } else {
                                            iM31618 = C0619.m2761("۟ۖ") ^ i57;
                                            i59 = ((iM31618 ^ i58) * 14533) ^ 1133923175;
                                            i60 = -2104970457;
                                        }
                                        break;
                                    case -166721567:
                                    case -72126247:
                                        C3448.m11248();
                                        C11235.m28309();
                                        break;
                                    case -149410085:
                                    case 1212205934:
                                        C2375.m8065();
                                        C2375.m8065();
                                        iM31618 = (C0619.m2761("ܰ᩸") ^ i57) * 91;
                                        i59 = ((iM31618 ^ i58) * (-28055)) ^ (-399013407);
                                        i60 = -1973678700;
                                        break;
                                    case -108078917:
                                    case 1131174862:
                                        C4238.m13540();
                                        if (C3099.f10023 > 0) {
                                            iM31618 = (C0619.m2761("ܰ᩸") ^ i57) * 91;
                                            i59 = ((iM31618 ^ i58) * (-28055)) ^ (-399013407);
                                            i60 = -1973678700;
                                        } else {
                                            iM31618 = C0619.m2761("ۨ۬") ^ i57;
                                            i59 = ((iM31618 ^ i58) * 28523) ^ (-279926208);
                                            i60 = -1485294634;
                                        }
                                        break;
                                    case -68792564:
                                    case 1576466639:
                                        if (C2288.f7433 <= 0) {
                                            iM31618 = C0773.m3169("᩵۫") ^ i58;
                                            i59 = ((iM31618 ^ i57) * (-1873)) ^ 345265262;
                                            i60 = -1082789263;
                                        } else {
                                            iM31618 = C0619.m2761("᩶ۛ") ^ i58;
                                            i59 = ((iM31618 ^ i57) * 9435) ^ 655916768;
                                            i60 = 782812710;
                                        }
                                        break;
                                    case 39892588:
                                    case 1205088134:
                                        str4 = str2;
                                        if (C3690.f12684 <= 0) {
                                            iM31618 = (C0619.m2761("ᩳᩳ") + i58) * 71;
                                            i59 = ((iM31618 ^ i57) * 29171) ^ (-1096687820);
                                            i60 = -299640449;
                                        } else {
                                            iM31618 = (C0773.m3169("֡ۖ") + i58) * (-105);
                                            i59 = ((iM31618 ^ i57) * (-21409)) ^ (-1603680409);
                                            i60 = 321099951;
                                        }
                                        break;
                                    case 400094544:
                                    case 1524373897:
                                        if (C0487.f2131 <= 0) {
                                            iM31618 = (C0773.m3169("۠᩷") ^ i58) * (-43);
                                            i59 = ((iM31618 ^ i57) * (-5895)) ^ 962732065;
                                            i60 = -1386642310;
                                        } else {
                                            iM31618 = (C0773.m3169("ۨܿ") + i57) * 33;
                                            i59 = ((iM31618 ^ i58) * (-22467)) ^ (-1701139672);
                                            i60 = -2001137712;
                                        }
                                        break;
                                    case 612830310:
                                    case 1389661749:
                                        if (C3099.f10023 <= 0) {
                                            iM31618 = (C0619.m2761("ᩳᩳ") + i58) * 71;
                                            i59 = ((iM31618 ^ i57) * 29171) ^ (-1096687820);
                                            i60 = -299640449;
                                        } else {
                                            iM31618 = (C0773.m3169("ۢ᩷") + i57) * 93;
                                            i59 = ((iM31618 ^ i58) * 20285) ^ (-2028175717);
                                            i60 = 164955019;
                                        }
                                        break;
                                    default:
                                        if (C1783.f6087 <= 0) {
                                            iM31618 = (C0619.m2761("ᩳᩳ") + i58) * 71;
                                            i59 = ((iM31618 ^ i57) * 29171) ^ (-1096687820);
                                            i60 = -299640449;
                                        } else {
                                            iM31618 = C0773.m3169("᩵۫") ^ i58;
                                            i59 = ((iM31618 ^ i57) * (-1873)) ^ 345265262;
                                            i60 = -1082789263;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    return;
                case -1542308511:
                case 546366573:
                    DialogInterfaceC8327 dialogInterfaceC83210 = dialogInterfaceC8328;
                    int i56 = i37;
                    short[] sArr40 = sArr28;
                    short[] sArr41 = sArr29;
                    ArrayList arrayList2 = new ArrayList(C16704.m39467());
                    viewOnClickListenerC21202.f67681 = arrayList2;
                    Main mainM2816 = AbstractC0641.m2816(c8614);
                    viewOnClickListenerC21202.f67686 = mainM2816;
                    viewOnClickListenerC21202.f67682 = c8614;
                    int iM31618 = (C0773.m3169("֡֨") + i28) * 49;
                    arrayList = arrayList2;
                    sArr22 = sArr22;
                    i38 = i38;
                    sArr24 = sArr24;
                    checkBox4 = checkBox4;
                    i42 = i42;
                    sArr27 = sArr27;
                    sArr26 = sArr26;
                    i41 = i41;
                    sArr25 = sArr25;
                    i39 = i39;
                    i40 = i40;
                    viewM9942 = viewM9942;
                    sArr23 = sArr23;
                    c2364 = c2364;
                    str2 = str;
                    main2 = mainM2816;
                    i33 = iM31618 ^ 2124695496;
                    obj3 = obj3;
                    interfaceC98012 = interfaceC98012;
                    sArr29 = sArr41;
                    sArr28 = sArr40;
                    interfaceC98010 = interfaceC98010;
                    i44 = i44;
                    i45 = ((iM31618 ^ i27) * 15423) ^ 18585576;
                    interfaceC98013 = interfaceC98013;
                    i37 = i56;
                    dialogInterfaceC8328 = dialogInterfaceC83210;
                    viewOnClickListenerC21202 = this;
                    break;
                case -1400148879:
                case -471445327:
                    C11235.m28309();
                    if (C11235.f35427 < 0) {
                        dialogInterfaceC8327 = dialogInterfaceC8328;
                        main = main2;
                        obj = obj3;
                        c2361 = c2364;
                        i = i37;
                        interfaceC9801 = interfaceC98013;
                        sArr7 = sArr22;
                        sArr6 = sArr24;
                        sArr = sArr25;
                        i2 = i39;
                        i3 = i40;
                        sArr2 = sArr26;
                        i4 = i41;
                        sArr3 = sArr27;
                        i5 = i42;
                        interfaceC9802 = interfaceC98010;
                        interfaceC9803 = interfaceC98012;
                        sArr4 = sArr28;
                        checkBox = checkBox4;
                        sArr5 = sArr29;
                        int iM31619 = (C0773.m3169("ۚۡ") ^ i28) * 89;
                        i45 = (-1823286236) ^ ((iM31619 ^ i27) * (-32043));
                        obj3 = obj;
                        sArr22 = sArr7;
                        sArr24 = sArr6;
                        checkBox4 = checkBox;
                        sArr29 = sArr5;
                        sArr28 = sArr4;
                        i42 = i5;
                        sArr27 = sArr3;
                        sArr26 = sArr2;
                        i41 = i4;
                        sArr25 = sArr;
                        i39 = i2;
                        i40 = i3;
                        i44 = i44;
                        viewM9942 = viewM9942;
                        c2364 = c2361;
                        main2 = main;
                        i33 = iM31619 ^ (-964529568);
                        i37 = i;
                        interfaceC98012 = interfaceC9803;
                        interfaceC98010 = interfaceC9802;
                        str2 = str;
                        interfaceC98013 = interfaceC9801;
                        dialogInterfaceC8328 = dialogInterfaceC8327;
                    } else {
                        i10 = i44;
                        viewM9942 = viewM9942;
                        dialogInterfaceC8327 = dialogInterfaceC8328;
                        obj2 = obj3;
                        c2362 = c2364;
                        i8 = i37;
                        interfaceC9804 = interfaceC98013;
                        sArr12 = sArr23;
                        i11 = i38;
                        sArr13 = sArr24;
                        sArr14 = sArr25;
                        i12 = i39;
                        i13 = i40;
                        sArr15 = sArr26;
                        i14 = i41;
                        sArr10 = sArr27;
                        i9 = i42;
                        interfaceC9806 = interfaceC98010;
                        interfaceC9805 = interfaceC98012;
                        sArr8 = sArr28;
                        checkBox2 = checkBox4;
                        sArr9 = sArr29;
                        sArr11 = sArr22;
                        iM3169 = C0619.m2761("֫᩸") ^ i27;
                        i6 = ((iM3169 ^ i28) * 1785) ^ (-1728787004);
                        i16 = -1754688449;
                        i7 = iM3169 ^ i16;
                        sArr22 = sArr11;
                        i38 = i11;
                        sArr24 = sArr13;
                        checkBox4 = checkBox2;
                        sArr29 = sArr9;
                        sArr28 = sArr8;
                        i42 = i9;
                        sArr27 = sArr10;
                        sArr26 = sArr15;
                        i41 = i14;
                        sArr25 = sArr14;
                        i39 = i12;
                        i40 = i13;
                        sArr23 = sArr12;
                        c2364 = c2362;
                        obj3 = obj2;
                        i37 = i8;
                        interfaceC98012 = interfaceC9805;
                        interfaceC98010 = interfaceC9806;
                        i44 = i10;
                        interfaceC98013 = interfaceC9804;
                        dialogInterfaceC8328 = dialogInterfaceC8327;
                        View view4 = viewM9942;
                        i33 = i7;
                        i45 = i6;
                        viewM9942 = view4;
                    }
                    break;
                case -1388602504:
                case -1004398353:
                    int i57 = i44;
                    dialogInterfaceC8327 = dialogInterfaceC8328;
                    i8 = i37;
                    interfaceC9804 = interfaceC98013;
                    short[] sArr42 = sArr28;
                    short[] sArr43 = sArr29;
                    C2361 c2367 = c2364;
                    C2419.m8168(c2367, iM2762 ^ i43, null);
                    String strM7749 = C2287.m7749(f67679, 7, 3, i31);
                    int iM31620 = (i27 - C0773.m3169("᩶ܰ")) * 43;
                    str3 = strM7749;
                    i45 = ((iM31620 ^ i28) * 17287) ^ 1090169284;
                    i38 = i38;
                    sArr24 = sArr24;
                    checkBox4 = checkBox4;
                    i42 = i42;
                    sArr27 = sArr27;
                    sArr26 = sArr26;
                    i41 = i41;
                    sArr25 = sArr25;
                    i39 = i39;
                    i40 = i40;
                    viewM9942 = viewM9942;
                    sArr23 = sArr23;
                    obj3 = null;
                    c2364 = c2367;
                    i33 = iM31620 ^ (-730863545);
                    interfaceC98012 = interfaceC98012;
                    sArr29 = sArr43;
                    sArr28 = sArr42;
                    interfaceC98010 = interfaceC98010;
                    i44 = i57;
                    interfaceC98013 = interfaceC9804;
                    i37 = i8;
                    dialogInterfaceC8328 = dialogInterfaceC8327;
                    break;
                case -1378419398:
                case -720402716:
                    checkBox5 = (CheckBox) C2834.m9333(viewM9942, iM31614);
                    sArr16 = sArr28;
                    CheckBox checkBox9 = (CheckBox) C3448.m11246(viewM9942, C0619.m2761(C0773.m3166(f67679, 34, 3, i31)) ^ 2129648569);
                    InterfaceC9801 interfaceC98016 = ApplicationC17729.f58258;
                    int iM31621 = (C0773.m3169("۬᩶") + i28) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i33 = iM31621 ^ (-1030508936);
                    i45 = ((iM31621 ^ i27) * 31597) ^ 562438932;
                    interfaceC98013 = interfaceC98013;
                    checkBox4 = checkBox9;
                    dialogInterfaceC8328 = dialogInterfaceC8328;
                    interfaceC98012 = interfaceC98012;
                    interfaceC98010 = interfaceC98016;
                    sArr29 = sArr29;
                    sArr28 = sArr16;
                    i37 = i37;
                    break;
                case -1122030030:
                case 144429301:
                    i44 = i44;
                    viewM9942 = viewM9942;
                    dialogInterfaceC8327 = dialogInterfaceC8328;
                    Main main3 = main2;
                    obj = obj3;
                    c2361 = c2364;
                    i = i37;
                    interfaceC9801 = interfaceC98013;
                    short[] sArr44 = sArr23;
                    int i58 = i38;
                    sArr6 = sArr24;
                    sArr = sArr25;
                    i2 = i39;
                    i3 = i40;
                    sArr2 = sArr26;
                    i4 = i41;
                    sArr3 = sArr27;
                    i5 = i42;
                    interfaceC9802 = interfaceC98010;
                    interfaceC9803 = interfaceC98012;
                    sArr4 = sArr28;
                    checkBox = checkBox4;
                    sArr5 = sArr29;
                    viewOnClickListenerC21202.f67680 = abstractC22044;
                    viewOnClickListenerC21202.f67688 = str2;
                    sArr7 = sArr22;
                    main = main3;
                    strM2049 = RunnableC0334.m2049(f67679, 1, 3, i31);
                    if (C2375.f7641 <= 0) {
                        i38 = i58;
                        sArr23 = sArr44;
                        int iM316110 = (C0773.m3169("ۚۡ") ^ i28) * 89;
                        i45 = (-1823286236) ^ ((iM316110 ^ i27) * (-32043));
                        obj3 = obj;
                        sArr22 = sArr7;
                        sArr24 = sArr6;
                        checkBox4 = checkBox;
                        sArr29 = sArr5;
                        sArr28 = sArr4;
                        i42 = i5;
                        sArr27 = sArr3;
                        sArr26 = sArr2;
                        i41 = i4;
                        sArr25 = sArr;
                        i39 = i2;
                        i40 = i3;
                        i44 = i44;
                        viewM9942 = viewM9942;
                        c2364 = c2361;
                        main2 = main;
                        i33 = iM316110 ^ (-964529568);
                        i37 = i;
                        interfaceC98012 = interfaceC9803;
                        interfaceC98010 = interfaceC9802;
                    } else {
                        int iM2769 = (C0619.m2761("ᩴܿ") ^ i27) * 71;
                        i45 = 1247745896 ^ ((iM2769 ^ i28) * (-32079));
                        sArr22 = sArr7;
                        i38 = i58;
                        sArr24 = sArr6;
                        checkBox4 = checkBox;
                        sArr29 = sArr5;
                        sArr28 = sArr4;
                        i42 = i5;
                        sArr27 = sArr3;
                        sArr26 = sArr2;
                        i41 = i4;
                        sArr25 = sArr;
                        i39 = i2;
                        i40 = i3;
                        viewM9942 = viewM9942;
                        sArr23 = sArr44;
                        c2364 = c2361;
                        main2 = main;
                        i33 = iM2769 ^ (-1455540857);
                        obj3 = obj;
                        i37 = i;
                        interfaceC98012 = interfaceC9803;
                        interfaceC98010 = interfaceC9802;
                        i44 = i44;
                    }
                    str2 = str;
                    interfaceC98013 = interfaceC9801;
                    dialogInterfaceC8328 = dialogInterfaceC8327;
                    break;
                case -1070335346:
                case 89189824:
                    dialogInterfaceC8327 = dialogInterfaceC8328;
                    i17 = i37;
                    interfaceC9801 = interfaceC98013;
                    interfaceC9807 = interfaceC98010;
                    interfaceC9808 = interfaceC98012;
                    CheckBox checkBox10 = checkBox4;
                    checkBox6 = (CheckBox) C3448.m11246(viewM9942, C0773.m3169(strM6366) ^ 2098956673);
                    sArr27 = f67679;
                    i42 = 31;
                    int iM31622 = C0773.m3169("ܽ֨") ^ i28;
                    i45 = 83151218 ^ ((iM31622 ^ i27) * 109);
                    i33 = iM31622 ^ (-1241160436);
                    checkBox4 = checkBox10;
                    sArr29 = sArr29;
                    sArr28 = sArr28;
                    i37 = i17;
                    interfaceC98012 = interfaceC9808;
                    interfaceC98010 = interfaceC9807;
                    interfaceC98013 = interfaceC9801;
                    dialogInterfaceC8328 = dialogInterfaceC8327;
                    break;
                case -736333553:
                case 1363547435:
                    i17 = i37;
                    interfaceC9801 = interfaceC98013;
                    sArr17 = sArr25;
                    i18 = i39;
                    i19 = i40;
                    sArr18 = sArr26;
                    i20 = i41;
                    sArr19 = sArr27;
                    i21 = i42;
                    interfaceC9807 = interfaceC98010;
                    interfaceC9808 = interfaceC98012;
                    sArr20 = sArr28;
                    checkBox3 = checkBox4;
                    sArr21 = sArr29;
                    c2363 = c2364;
                    C11235.m28306(c2363, false);
                    dialogInterfaceC8327M10090 = C3099.m10090(c2363);
                    C0938.m3745(c8614, dialogInterfaceC8327M10090, str2);
                    sArr24 = f67679;
                    if (C1542.f5343 <= 0) {
                        iM31610 = C0773.m3169("֡۠") ^ i28;
                        dialogInterfaceC8327 = dialogInterfaceC8327M10090;
                        i22 = ((iM31610 ^ i27) * (-23093)) ^ (-611955792);
                        i23 = 2047322764;
                    } else {
                        iM31610 = (i28 - C0773.m3169("ܶ۠")) * (-7);
                        dialogInterfaceC8327 = dialogInterfaceC8327M10090;
                        i22 = ((iM31610 ^ i27) * (-1143)) ^ (-214125114);
                        i23 = -1569272559;
                    }
                    i33 = iM31610 ^ i23;
                    i45 = i22;
                    c2364 = c2363;
                    checkBox4 = checkBox3;
                    sArr29 = sArr21;
                    sArr28 = sArr20;
                    i42 = i21;
                    sArr27 = sArr19;
                    sArr26 = sArr18;
                    i41 = i20;
                    sArr25 = sArr17;
                    i39 = i18;
                    i40 = i19;
                    i37 = i17;
                    interfaceC98012 = interfaceC9808;
                    interfaceC98010 = interfaceC9807;
                    interfaceC98013 = interfaceC9801;
                    dialogInterfaceC8328 = dialogInterfaceC8327;
                    break;
                case -707907836:
                case 117927769:
                    C1826.m6301();
                    if (C2966.f9654 >= 0) {
                        dialogInterfaceC8327 = dialogInterfaceC8328;
                        i17 = i37;
                        interfaceC9801 = interfaceC98013;
                        sArr17 = sArr25;
                        i18 = i39;
                        i19 = i40;
                        sArr18 = sArr26;
                        i20 = i41;
                        sArr19 = sArr27;
                        i21 = i42;
                        interfaceC9807 = interfaceC98010;
                        sArr20 = sArr28;
                        sArr21 = sArr29;
                        InterfaceC9801 interfaceC98017 = interfaceC98012;
                        checkBox3 = checkBox4;
                        interfaceC9809 = interfaceC98017;
                        int iM316111 = (C0773.m3169("ۧۧ") ^ i27) * 7;
                        i45 = ((iM316111 ^ i28) * (-28371)) ^ (-1409980230);
                        i33 = iM316111 ^ 1652964730;
                        sArr29 = sArr21;
                        sArr28 = sArr20;
                        interfaceC98010 = interfaceC9807;
                        i42 = i21;
                        sArr27 = sArr19;
                        sArr26 = sArr18;
                        i41 = i20;
                        sArr25 = sArr17;
                        i39 = i18;
                        i40 = i19;
                        interfaceC98013 = interfaceC9801;
                        i37 = i17;
                        dialogInterfaceC8328 = dialogInterfaceC8327;
                        CheckBox checkBox11 = checkBox3;
                        interfaceC98012 = interfaceC9809;
                        checkBox4 = checkBox11;
                    } else {
                        i17 = i37;
                        sArr17 = sArr25;
                        i18 = i39;
                        i19 = i40;
                        sArr18 = sArr26;
                        i20 = i41;
                        sArr19 = sArr27;
                        i21 = i42;
                        sArr20 = sArr28;
                        sArr21 = sArr29;
                        c2363 = c2364;
                        InterfaceC9801 interfaceC98018 = interfaceC98012;
                        checkBox3 = checkBox4;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8328;
                        interfaceC9801 = interfaceC98013;
                        interfaceC9807 = interfaceC98010;
                        interfaceC9808 = interfaceC98018;
                        iM31610 = C0773.m3169("֡۠") ^ i28;
                        dialogInterfaceC8327 = dialogInterfaceC8327M10090;
                        i22 = ((iM31610 ^ i27) * (-23093)) ^ (-611955792);
                        i23 = 2047322764;
                        i33 = iM31610 ^ i23;
                        i45 = i22;
                        c2364 = c2363;
                        checkBox4 = checkBox3;
                        sArr29 = sArr21;
                        sArr28 = sArr20;
                        i42 = i21;
                        sArr27 = sArr19;
                        sArr26 = sArr18;
                        i41 = i20;
                        sArr25 = sArr17;
                        i39 = i18;
                        i40 = i19;
                        i37 = i17;
                        interfaceC98012 = interfaceC9808;
                        interfaceC98010 = interfaceC9807;
                        interfaceC98013 = interfaceC9801;
                        dialogInterfaceC8328 = dialogInterfaceC8327;
                    }
                    break;
                case -569860546:
                case -232930923:
                    C0619.m2763();
                    throw new RuntimeException();
                case -541633669:
                case 74770765:
                    dialogInterfaceC8327 = dialogInterfaceC8328;
                    i8 = i37;
                    interfaceC9804 = interfaceC98013;
                    interfaceC9806 = interfaceC98010;
                    interfaceC9805 = interfaceC98012;
                    sArr8 = sArr28;
                    CheckBox checkBox12 = checkBox4;
                    sArr9 = sArr29;
                    short[] sArr45 = sArr24;
                    viewM9333 = C2834.m9333(viewM9942, C0773.m3169(C2878.m9486(sArr45, 13, 3, i31)) ^ 2127090051);
                    int iM27610 = C0619.m2761("ۖܰ") ^ i28;
                    i15 = ((iM27610 ^ i27) * (-31223)) ^ 1596155859;
                    i33 = iM27610 ^ (-979791335);
                    sArr24 = sArr45;
                    checkBox4 = checkBox12;
                    i42 = i42;
                    sArr27 = sArr27;
                    sArr26 = sArr26;
                    i41 = i41;
                    sArr25 = sArr25;
                    i39 = i39;
                    i40 = i40;
                    i45 = i15;
                    interfaceC98012 = interfaceC9805;
                    sArr29 = sArr9;
                    sArr28 = sArr8;
                    interfaceC98010 = interfaceC9806;
                    interfaceC98013 = interfaceC9804;
                    i37 = i8;
                    dialogInterfaceC8328 = dialogInterfaceC8327;
                    break;
                case -475881666:
                case 596033217:
                    C23255 c23256 = (C23255) C2834.m9333(viewM9942, iM2763 ^ i35);
                    viewOnClickListenerC21202.f67685 = c23256;
                    interfaceC98011 = ApplicationC17729.f58258;
                    DialogInterfaceC8327 dialogInterfaceC83211 = dialogInterfaceC8328;
                    StringBuilder sb2 = new StringBuilder(C2288.m7761(f67679, 93, 14, i31));
                    C3779.m12258(sb2, str2);
                    int iM31623 = C0773.m3169("ۚ۫") ^ i28;
                    int i59 = ((iM31623 ^ i27) * 20251) ^ 881951166;
                    i33 = iM31623 ^ (-140302735);
                    c23255 = c23256;
                    dialogInterfaceC8328 = dialogInterfaceC83211;
                    sb = sb2;
                    i45 = i59;
                    break;
                case -213021674:
                case 312349305:
                    DialogInterfaceC8327 dialogInterfaceC83212 = dialogInterfaceC8328;
                    sArr16 = sArr28;
                    Main main4 = main2;
                    viewM9942 = RunnableC3055.m9942(main4, C0773.m3169(strM2049) ^ 2125315793);
                    C2361 c2361M13539 = C4238.m13539(main4);
                    C1343.m4952(c2361M13539, viewM9942);
                    sArr22 = f67679;
                    int iM27611 = C0619.m2761("ۚܺ") ^ i28;
                    int i60 = ((iM27611 ^ i27) * (-12285)) ^ 550261743;
                    i38 = i38;
                    sArr24 = sArr24;
                    checkBox4 = checkBox4;
                    i42 = i42;
                    sArr27 = sArr27;
                    sArr26 = sArr26;
                    i41 = i41;
                    sArr25 = sArr25;
                    i39 = i39;
                    i40 = i40;
                    c2364 = c2361M13539;
                    sArr23 = sArr23;
                    obj3 = obj3;
                    i33 = iM27611 ^ (-390958036);
                    interfaceC98012 = interfaceC98012;
                    interfaceC98010 = interfaceC98010;
                    i44 = i44;
                    main2 = main4;
                    interfaceC98013 = interfaceC98013;
                    dialogInterfaceC8328 = dialogInterfaceC83212;
                    i45 = i60;
                    sArr29 = sArr29;
                    sArr28 = sArr16;
                    i37 = i37;
                    break;
                case 16454442:
                case 1679119803:
                    i10 = i44;
                    viewM9942 = viewM9942;
                    dialogInterfaceC8327 = dialogInterfaceC8328;
                    obj2 = obj3;
                    i8 = i37;
                    interfaceC9804 = interfaceC98013;
                    sArr12 = sArr23;
                    i11 = i38;
                    sArr14 = sArr25;
                    i12 = i39;
                    i13 = i40;
                    sArr15 = sArr26;
                    i14 = i41;
                    sArr10 = sArr27;
                    i9 = i42;
                    interfaceC9806 = interfaceC98010;
                    interfaceC9805 = interfaceC98012;
                    sArr8 = sArr28;
                    checkBox2 = checkBox4;
                    sArr9 = sArr29;
                    C2361 c2368 = c2364;
                    sArr13 = sArr24;
                    c2362 = c2368;
                    sArr11 = sArr22;
                    iM2762 = C0619.m2761(C17202.m40377(sArr11, 4, 3, i31));
                    i43 = 2123928691;
                    if (C0773.f2792 <= 0) {
                        iM3169 = C0619.m2761("֫᩸") ^ i27;
                        i6 = ((iM3169 ^ i28) * 1785) ^ (-1728787004);
                        i16 = -1754688449;
                    } else {
                        iM3169 = (i27 - C0773.m3169("᩷ۙ")) * (-27);
                        i6 = ((iM3169 ^ i28) * 26093) ^ 281174899;
                        i16 = -298033110;
                    }
                    i7 = iM3169 ^ i16;
                    sArr22 = sArr11;
                    i38 = i11;
                    sArr24 = sArr13;
                    checkBox4 = checkBox2;
                    sArr29 = sArr9;
                    sArr28 = sArr8;
                    i42 = i9;
                    sArr27 = sArr10;
                    sArr26 = sArr15;
                    i41 = i14;
                    sArr25 = sArr14;
                    i39 = i12;
                    i40 = i13;
                    sArr23 = sArr12;
                    c2364 = c2362;
                    obj3 = obj2;
                    i37 = i8;
                    interfaceC98012 = interfaceC9805;
                    interfaceC98010 = interfaceC9806;
                    i44 = i10;
                    interfaceC98013 = interfaceC9804;
                    dialogInterfaceC8328 = dialogInterfaceC8327;
                    View view5 = viewM9942;
                    i33 = i7;
                    i45 = i6;
                    viewM9942 = view5;
                    break;
                case 24920469:
                case 1037632371:
                    dialogInterfaceC8327 = dialogInterfaceC8328;
                    i17 = i37;
                    interfaceC9801 = interfaceC98013;
                    sArr18 = sArr26;
                    i20 = i41;
                    sArr19 = sArr27;
                    i21 = i42;
                    interfaceC9807 = interfaceC98010;
                    interfaceC9808 = interfaceC98012;
                    sArr20 = sArr28;
                    checkBox3 = checkBox4;
                    sArr21 = sArr29;
                    ImageView imageView2 = imageView;
                    imageView2.setImageResource(iM31613 ^ i34);
                    C2375.m8070(imageView2, viewOnClickListenerC21202);
                    sArr25 = f67679;
                    i39 = 22;
                    i40 = 3;
                    int iM31624 = (C0773.m3169("ۤۧ") ^ i28) * (-53);
                    i45 = ((iM31624 ^ i27) * (-26335)) ^ (-1016332641);
                    i33 = iM31624 ^ 1694356062;
                    imageView = imageView2;
                    checkBox4 = checkBox3;
                    sArr29 = sArr21;
                    sArr28 = sArr20;
                    i42 = i21;
                    sArr27 = sArr19;
                    sArr26 = sArr18;
                    i41 = i20;
                    i37 = i17;
                    interfaceC98012 = interfaceC9808;
                    interfaceC98010 = interfaceC9807;
                    interfaceC98013 = interfaceC9801;
                    dialogInterfaceC8328 = dialogInterfaceC8327;
                    break;
                case 73320595:
                case 1586098789:
                    dialogInterfaceC8327 = dialogInterfaceC8328;
                    i17 = i37;
                    interfaceC9801 = interfaceC98013;
                    sArr17 = sArr25;
                    i18 = i39;
                    i19 = i40;
                    sArr18 = sArr26;
                    i20 = i41;
                    sArr19 = sArr27;
                    i21 = i42;
                    interfaceC9807 = interfaceC98010;
                    interfaceC9808 = interfaceC98012;
                    sArr20 = sArr28;
                    checkBox3 = checkBox4;
                    sArr21 = sArr29;
                    iM31613 = C0773.m3169(C2375.m8069(f67679, 19, 3, i31));
                    i34 = 2122631495;
                    iM2761 = C0619.m2761("᩸ۤ") ^ i27;
                    i45 = (-1288974656) ^ ((iM2761 ^ i28) * (-671));
                    i24 = 1958475827;
                    i33 = iM2761 ^ i24;
                    checkBox4 = checkBox3;
                    sArr29 = sArr21;
                    sArr28 = sArr20;
                    i42 = i21;
                    sArr27 = sArr19;
                    sArr26 = sArr18;
                    i41 = i20;
                    sArr25 = sArr17;
                    i39 = i18;
                    i40 = i19;
                    i37 = i17;
                    interfaceC98012 = interfaceC9808;
                    interfaceC98010 = interfaceC9807;
                    interfaceC98013 = interfaceC9801;
                    dialogInterfaceC8328 = dialogInterfaceC8327;
                    break;
                case 165656136:
                case 1543758512:
                    dialogInterfaceC8327 = dialogInterfaceC8328;
                    interfaceC9801 = interfaceC98013;
                    checkBox3 = checkBox4;
                    InterfaceC9801 interfaceC98019 = interfaceC98010;
                    RunnableC0334.m2050(checkBox6, C0950.m3781(interfaceC98019, C2702.m8881(f67679, 37, 21, i31), true));
                    interfaceC9809 = ApplicationC17729.f58258;
                    sArr28 = f67679;
                    i37 = 58;
                    i36 = 17;
                    if (C2287.m7745() <= 0) {
                        interfaceC9807 = interfaceC98019;
                        sArr20 = sArr28;
                        sArr17 = sArr25;
                        i18 = i39;
                        i19 = i40;
                        sArr18 = sArr26;
                        i20 = i41;
                        sArr19 = sArr27;
                        i21 = i42;
                        i17 = 58;
                        sArr21 = sArr29;
                        int iM316112 = (C0773.m3169("ۧۧ") ^ i27) * 7;
                        i45 = ((iM316112 ^ i28) * (-28371)) ^ (-1409980230);
                        i33 = iM316112 ^ 1652964730;
                        sArr29 = sArr21;
                        sArr28 = sArr20;
                        interfaceC98010 = interfaceC9807;
                        i42 = i21;
                        sArr27 = sArr19;
                        sArr26 = sArr18;
                        i41 = i20;
                        sArr25 = sArr17;
                        i39 = i18;
                        i40 = i19;
                        interfaceC98013 = interfaceC9801;
                        i37 = i17;
                        dialogInterfaceC8328 = dialogInterfaceC8327;
                        CheckBox checkBox13 = checkBox3;
                        interfaceC98012 = interfaceC9809;
                        checkBox4 = checkBox13;
                    } else {
                        int iM27612 = (C0619.m2761("۫ܿ") + i27) * (-85);
                        i33 = iM27612 ^ (-1866211064);
                        i45 = ((iM27612 ^ i28) * (-17933)) ^ (-1591651115);
                        interfaceC98013 = interfaceC9801;
                        checkBox4 = checkBox3;
                        dialogInterfaceC8328 = dialogInterfaceC8327;
                        interfaceC98012 = interfaceC9809;
                        interfaceC98010 = interfaceC98019;
                    }
                    break;
                case 768669093:
                case 945870438:
                    dialogInterfaceC8327 = dialogInterfaceC8328;
                    i17 = i37;
                    interfaceC9801 = interfaceC98013;
                    sArr17 = sArr25;
                    i18 = i39;
                    i19 = i40;
                    sArr18 = sArr26;
                    i20 = i41;
                    sArr19 = sArr27;
                    i21 = i42;
                    interfaceC9807 = interfaceC98010;
                    interfaceC9808 = interfaceC98012;
                    sArr20 = sArr28;
                    checkBox3 = checkBox4;
                    sArr21 = sArr29;
                    Spinner spinner2 = (Spinner) viewM9333;
                    viewOnClickListenerC21202.f67684 = spinner2;
                    Context contextM12922 = C3998.m12922(spinner2);
                    spinner = spinner2;
                    ArrayList arrayList3 = arrayList;
                    C3054 c3055 = new C3054(contextM12922, arrayList3);
                    viewOnClickListenerC21202.f67689 = c3055;
                    int iM27613 = C0619.m2761("ۛ᩻") ^ i27;
                    arrayList = arrayList3;
                    i33 = iM27613 ^ 816597702;
                    i45 = ((iM27613 ^ i28) * (-19949)) ^ (-1696740262);
                    c3054 = c3055;
                    checkBox4 = checkBox3;
                    sArr29 = sArr21;
                    sArr28 = sArr20;
                    i42 = i21;
                    sArr27 = sArr19;
                    sArr26 = sArr18;
                    i41 = i20;
                    sArr25 = sArr17;
                    i39 = i18;
                    i40 = i19;
                    i37 = i17;
                    interfaceC98012 = interfaceC9808;
                    interfaceC98010 = interfaceC9807;
                    interfaceC98013 = interfaceC9801;
                    dialogInterfaceC8328 = dialogInterfaceC8327;
                    break;
                case 1023305660:
                case 1188205926:
                    dialogInterfaceC8327 = dialogInterfaceC8328;
                    C11235.m28299(checkBox5, viewOnClickListenerC24932);
                    C11235.m28299(checkBox4, new ViewOnClickListenerC7061(1, viewOnClickListenerC21202, checkBox4));
                    iM2763 = C0619.m2761(C2485.m8350(f67679, 90, 3, i31));
                    i35 = 2129359136;
                    if (C2485.m8357() <= 0) {
                        main = main2;
                        obj = obj3;
                        c2361 = c2364;
                        i = i37;
                        interfaceC9801 = interfaceC98013;
                        sArr7 = sArr22;
                        sArr6 = sArr24;
                        sArr = sArr25;
                        i2 = i39;
                        i3 = i40;
                        sArr2 = sArr26;
                        i4 = i41;
                        sArr3 = sArr27;
                        i5 = i42;
                        interfaceC9802 = interfaceC98010;
                        interfaceC9803 = interfaceC98012;
                        sArr4 = sArr28;
                        checkBox = checkBox4;
                        sArr5 = sArr29;
                        int iM316113 = (C0773.m3169("ۚۡ") ^ i28) * 89;
                        i45 = (-1823286236) ^ ((iM316113 ^ i27) * (-32043));
                        obj3 = obj;
                        sArr22 = sArr7;
                        sArr24 = sArr6;
                        checkBox4 = checkBox;
                        sArr29 = sArr5;
                        sArr28 = sArr4;
                        i42 = i5;
                        sArr27 = sArr3;
                        sArr26 = sArr2;
                        i41 = i4;
                        sArr25 = sArr;
                        i39 = i2;
                        i40 = i3;
                        i44 = i44;
                        viewM9942 = viewM9942;
                        c2364 = c2361;
                        main2 = main;
                        i33 = iM316113 ^ (-964529568);
                        i37 = i;
                        interfaceC98012 = interfaceC9803;
                        interfaceC98010 = interfaceC9802;
                        str2 = str;
                        interfaceC98013 = interfaceC9801;
                    } else {
                        int iM31625 = C0773.m3169("ۙۖ") ^ i27;
                        i33 = iM31625 ^ (-1430027249);
                        i45 = ((iM31625 ^ i28) * 17937) ^ 295848696;
                    }
                    dialogInterfaceC8328 = dialogInterfaceC8327;
                    break;
                case 1663169774:
                case 1926068126:
                    if (C3734.f12817 >= 0) {
                        i17 = i37;
                        sArr17 = sArr25;
                        i18 = i39;
                        i19 = i40;
                        sArr18 = sArr26;
                        i20 = i41;
                        sArr19 = sArr27;
                        i21 = i42;
                        sArr20 = sArr28;
                        sArr21 = sArr29;
                        c2363 = c2364;
                        InterfaceC9801 interfaceC980110 = interfaceC98012;
                        checkBox3 = checkBox4;
                        dialogInterfaceC8327M10090 = dialogInterfaceC8328;
                        interfaceC9801 = interfaceC98013;
                        interfaceC9807 = interfaceC98010;
                        interfaceC9808 = interfaceC980110;
                        iM31610 = C0773.m3169("֡۠") ^ i28;
                        dialogInterfaceC8327 = dialogInterfaceC8327M10090;
                        i22 = ((iM31610 ^ i27) * (-23093)) ^ (-611955792);
                        i23 = 2047322764;
                        i33 = iM31610 ^ i23;
                        i45 = i22;
                        c2364 = c2363;
                        checkBox4 = checkBox3;
                        sArr29 = sArr21;
                        sArr28 = sArr20;
                        i42 = i21;
                        sArr27 = sArr19;
                        sArr26 = sArr18;
                        i41 = i20;
                        sArr25 = sArr17;
                        i39 = i18;
                        i40 = i19;
                        i37 = i17;
                        interfaceC98012 = interfaceC9808;
                        interfaceC98010 = interfaceC9807;
                        interfaceC98013 = interfaceC9801;
                        dialogInterfaceC8328 = dialogInterfaceC8327;
                    } else {
                        i10 = i44;
                        viewM9942 = viewM9942;
                        dialogInterfaceC8327 = dialogInterfaceC8328;
                        obj2 = obj3;
                        c2362 = c2364;
                        i8 = i37;
                        interfaceC9804 = interfaceC98013;
                        sArr12 = sArr23;
                        i11 = i38;
                        sArr13 = sArr24;
                        sArr14 = sArr25;
                        i12 = i39;
                        i13 = i40;
                        sArr15 = sArr26;
                        i14 = i41;
                        sArr10 = sArr27;
                        i9 = i42;
                        interfaceC9806 = interfaceC98010;
                        interfaceC9805 = interfaceC98012;
                        sArr8 = sArr28;
                        checkBox2 = checkBox4;
                        sArr9 = sArr29;
                        sArr11 = sArr22;
                        iM3169 = C0619.m2761("֫᩸") ^ i27;
                        i6 = ((iM3169 ^ i28) * 1785) ^ (-1728787004);
                        i16 = -1754688449;
                        i7 = iM3169 ^ i16;
                        sArr22 = sArr11;
                        i38 = i11;
                        sArr24 = sArr13;
                        checkBox4 = checkBox2;
                        sArr29 = sArr9;
                        sArr28 = sArr8;
                        i42 = i9;
                        sArr27 = sArr10;
                        sArr26 = sArr15;
                        i41 = i14;
                        sArr25 = sArr14;
                        i39 = i12;
                        i40 = i13;
                        sArr23 = sArr12;
                        c2364 = c2362;
                        obj3 = obj2;
                        i37 = i8;
                        interfaceC98012 = interfaceC9805;
                        interfaceC98010 = interfaceC9806;
                        i44 = i10;
                        interfaceC98013 = interfaceC9804;
                        dialogInterfaceC8328 = dialogInterfaceC8327;
                        View view6 = viewM9942;
                        i33 = i7;
                        i45 = i6;
                        viewM9942 = view6;
                    }
                    break;
                case 2043504106:
                case 2048806542:
                    dialogInterfaceC8327 = dialogInterfaceC8328;
                    i17 = i37;
                    interfaceC9801 = interfaceC98013;
                    sArr17 = sArr25;
                    i18 = i39;
                    i19 = i40;
                    sArr18 = sArr26;
                    i20 = i41;
                    sArr19 = sArr27;
                    i21 = i42;
                    interfaceC9807 = interfaceC98010;
                    interfaceC9808 = interfaceC98012;
                    sArr20 = sArr28;
                    checkBox3 = checkBox4;
                    sArr21 = sArr29;
                    spinner.setAdapter((SpinnerAdapter) c3054);
                    m48359();
                    strM8069 = C2375.m8069(f67679, 16, 3, i31);
                    iM2761 = (C0619.m2761("᩻᩵") ^ i28) * (-9);
                    i45 = 1279390096 ^ ((iM2761 ^ i27) * (-927));
                    i24 = 1415953371;
                    i33 = iM2761 ^ i24;
                    checkBox4 = checkBox3;
                    sArr29 = sArr21;
                    sArr28 = sArr20;
                    i42 = i21;
                    sArr27 = sArr19;
                    sArr26 = sArr18;
                    i41 = i20;
                    sArr25 = sArr17;
                    i39 = i18;
                    i40 = i19;
                    i37 = i17;
                    interfaceC98012 = interfaceC9808;
                    interfaceC98010 = interfaceC9807;
                    interfaceC98013 = interfaceC9801;
                    dialogInterfaceC8328 = dialogInterfaceC8327;
                    break;
                default:
                    dialogInterfaceC8327 = dialogInterfaceC8328;
                    i8 = i37;
                    interfaceC9804 = interfaceC98013;
                    sArr8 = sArr28;
                    sArr9 = sArr29;
                    InterfaceC9801 interfaceC98020 = interfaceC98010;
                    interfaceC9805 = interfaceC98012;
                    checkBox2 = checkBox4;
                    interfaceC9806 = interfaceC98020;
                    short[] sArr46 = sArr27;
                    int i61 = i42;
                    iM31614 = C0773.m3169(C2310.m7803(sArr46, i61, 3, i31)) ^ 2118567206;
                    if (C1564.f5401 > 0) {
                        int iM27614 = C0619.m2761("ۨۢ") ^ i27;
                        i15 = ((iM27614 ^ i28) * 20811) ^ 1769147150;
                        i33 = iM27614 ^ (-457711124);
                        sArr27 = sArr46;
                        checkBox4 = checkBox2;
                        i42 = i61;
                        i45 = i15;
                        interfaceC98012 = interfaceC9805;
                        sArr29 = sArr9;
                        sArr28 = sArr8;
                        interfaceC98010 = interfaceC9806;
                        interfaceC98013 = interfaceC9804;
                        i37 = i8;
                        dialogInterfaceC8328 = dialogInterfaceC8327;
                    } else {
                        i9 = i61;
                        sArr10 = sArr46;
                        i10 = i44;
                        viewM9942 = viewM9942;
                        obj2 = obj3;
                        c2362 = c2364;
                        sArr11 = sArr22;
                        sArr12 = sArr23;
                        i11 = i38;
                        sArr13 = sArr24;
                        sArr14 = sArr25;
                        i12 = i39;
                        i13 = i40;
                        sArr15 = sArr26;
                        i14 = i41;
                        iM3169 = C0619.m2761("֫᩸") ^ i27;
                        i6 = ((iM3169 ^ i28) * 1785) ^ (-1728787004);
                        i16 = -1754688449;
                        i7 = iM3169 ^ i16;
                        sArr22 = sArr11;
                        i38 = i11;
                        sArr24 = sArr13;
                        checkBox4 = checkBox2;
                        sArr29 = sArr9;
                        sArr28 = sArr8;
                        i42 = i9;
                        sArr27 = sArr10;
                        sArr26 = sArr15;
                        i41 = i14;
                        sArr25 = sArr14;
                        i39 = i12;
                        i40 = i13;
                        sArr23 = sArr12;
                        c2364 = c2362;
                        obj3 = obj2;
                        i37 = i8;
                        interfaceC98012 = interfaceC9805;
                        interfaceC98010 = interfaceC9806;
                        i44 = i10;
                        interfaceC98013 = interfaceC9804;
                        dialogInterfaceC8328 = dialogInterfaceC8327;
                        View view7 = viewM9942;
                        i33 = i7;
                        i45 = i6;
                        viewM9942 = view7;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x025c A[PHI: r3 r4 r7 r8 r10 r13 r17 r18
      0x025c: PHI (r3v4 java.lang.String) = 
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v5 java.lang.String)
     binds: [B:61:0x025a, B:53:0x0202, B:45:0x01a5, B:30:0x00e5, B:14:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r4v4 l.ᩳ۬᩸) = (r4v2 l.ᩳ۬᩸), (r4v2 l.ᩳ۬᩸), (r4v2 l.ᩳ۬᩸), (r4v2 l.ᩳ۬᩸), (r4v5 l.ᩳ۬᩸) binds: [B:61:0x025a, B:53:0x0202, B:45:0x01a5, B:30:0x00e5, B:14:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r7v5 short) = (r7v2 short), (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:61:0x025a, B:53:0x0202, B:45:0x01a5, B:30:0x00e5, B:14:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r8v5 short) = (r8v2 short), (r8v3 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:61:0x025a, B:53:0x0202, B:45:0x01a5, B:30:0x00e5, B:14:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r10v5 short) = (r10v2 short), (r10v2 short), (r10v3 short), (r10v2 short), (r10v2 short) binds: [B:61:0x025a, B:53:0x0202, B:45:0x01a5, B:30:0x00e5, B:14:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r13v5 int) = (r13v2 int), (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:61:0x025a, B:53:0x0202, B:45:0x01a5, B:30:0x00e5, B:14:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r17v24 l.ᩳ֫ܺ) = (r17v3 l.ᩳ֫ܺ), (r17v5 l.ᩳ֫ܺ), (r17v7 l.ᩳ֫ܺ), (r17v13 l.ᩳ֫ܺ), (r17v25 l.ᩳ֫ܺ) binds: [B:61:0x025a, B:53:0x0202, B:45:0x01a5, B:30:0x00e5, B:14:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x025c: PHI (r18v6 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:61:0x025a, B:53:0x0202, B:45:0x01a5, B:30:0x00e5, B:14:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        if (l.C2419.f7754 < 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        if (l.C20932.f66974 <= 0) goto L17;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m48343(l.ViewOnClickListenerC21202 r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC21202.m48343(l.᩶ۡۤ, java.lang.String):void");
    }

    /* JADX WARN: Code duplicated, block: B:85:0x038e A[PHI: r7 r9 r10 r18 r20
      0x038e: PHI (r7v4 java.lang.String) = (r7v3 java.lang.String), (r7v2 java.lang.String), (r7v2 java.lang.String), (r7v2 java.lang.String) binds: [B:42:0x017c, B:84:0x038c, B:72:0x0310, B:27:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x038e: PHI (r9v3 java.lang.String) = (r9v2 java.lang.String), (r9v2 java.lang.String), (r9v2 java.lang.String), (r9v5 java.lang.String) binds: [B:42:0x017c, B:84:0x038c, B:72:0x0310, B:27:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x038e: PHI (r10v4 short) = (r10v2 short), (r10v2 short), (r10v3 short), (r10v2 short) binds: [B:42:0x017c, B:84:0x038c, B:72:0x0310, B:27:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x038e: PHI (r18v18 l.᩻۠ۤ) = (r18v2 l.᩻۠ۤ), (r18v5 l.᩻۠ۤ), (r18v8 l.᩻۠ۤ), (r18v19 l.᩻۠ۤ) binds: [B:42:0x017c, B:84:0x038c, B:72:0x0310, B:27:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x038e: PHI (r20v15 bin.mt.plus.Main) = (r20v0 bin.mt.plus.Main), (r20v4 bin.mt.plus.Main), (r20v7 bin.mt.plus.Main), (r20v16 bin.mt.plus.Main) binds: [B:42:0x017c, B:84:0x038c, B:72:0x0310, B:27:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x03c0 A[PHI: r18 r20
      0x03c0: PHI (r18v30 l.᩻۠ۤ) = (r18v4 l.᩻۠ۤ), (r18v6 l.᩻۠ۤ), (r18v31 l.᩻۠ۤ) binds: [B:88:0x03be, B:80:0x036c, B:8:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x03c0: PHI (r20v23 bin.mt.plus.Main) = (r20v3 bin.mt.plus.Main), (r20v5 bin.mt.plus.Main), (r20v24 bin.mt.plus.Main) binds: [B:88:0x03be, B:80:0x036c, B:8:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005f, code lost:
    
        if (l.C2354.f7599 < 0) goto L12;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m48345(final l.ViewOnClickListenerC21202 r23, l.DialogInterfaceC8327 r24, java.lang.String r25, final android.widget.CheckBox r26) {
        /*
            Method dump skipped, instruction units count: 1214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC21202.m48345(l.᩶ۡۤ, l.۠ۖۧ, java.lang.String, android.widget.CheckBox):void");
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0230 A[PHI: r5 r6 r9 r17
      0x0230: PHI (r5v5 short) = (r5v3 short), (r5v2 short), (r5v2 short) binds: [B:62:0x022e, B:50:0x01c4, B:12:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r6v5 int) = (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:62:0x022e, B:50:0x01c4, B:12:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r9v5 short) = (r9v2 short), (r9v3 short), (r9v2 short) binds: [B:62:0x022e, B:50:0x01c4, B:12:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r17v26 l.ᩳ֫ܺ) = (r17v5 l.ᩳ֫ܺ), (r17v9 l.ᩳ֫ܺ), (r17v27 l.ᩳ֫ܺ) binds: [B:62:0x022e, B:50:0x01c4, B:12:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0266 A[PHI: r4 r7 r17
      0x0266: PHI (r4v4 char) = (r4v3 char), (r4v2 char) binds: [B:66:0x0264, B:58:0x020a] A[DONT_GENERATE, DONT_INLINE]
      0x0266: PHI (r7v3 int) = (r7v2 int), (r7v4 int) binds: [B:66:0x0264, B:58:0x020a] A[DONT_GENERATE, DONT_INLINE]
      0x0266: PHI (r17v6 l.ᩳ֫ܺ) = (r17v4 l.ᩳ֫ܺ), (r17v7 l.ᩳ֫ܺ) binds: [B:66:0x0264, B:58:0x020a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0056 A[PHI: r8 r12 r13 r17 r18
      0x0056: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:70:0x0299, B:54:0x01e6, B:6:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0056: PHI (r12v3 int) = (r12v2 int), (r12v2 int), (r12v4 int) binds: [B:70:0x0299, B:54:0x01e6, B:6:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0056: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v4 int) binds: [B:70:0x0299, B:54:0x01e6, B:6:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0056: PHI (r17v19 l.ᩳ֫ܺ) = (r17v3 l.ᩳ֫ܺ), (r17v8 l.ᩳ֫ܺ), (r17v20 l.ᩳ֫ܺ) binds: [B:70:0x0299, B:54:0x01e6, B:6:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0056: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:70:0x0299, B:54:0x01e6, B:6:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48348(C23255 c23255, CheckBox checkBox) {
        int iM3169;
        int i;
        int i2;
        int i3 = C1542.f5343;
        int i4 = AbstractC3624.f12429;
        int iM31610 = C0773.m3169("ܶ᩵") ^ i3;
        int i5 = ((iM31610 ^ i4) * 15573) ^ (-1127333934);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM31610 ^ 763577784;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 882039614;
        String strM48350 = null;
        InterfaceC18752 interfaceC18752M8173 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * 14387) >> 31));
            switch (i13) {
                case -2118655886:
                case -876707698:
                    C2375.m8061(C2966.m9665(interfaceC18752M8173, C3779.m12266(sArr2, i11, i12, i10), strM48350));
                    if (C4282.f15546 <= 0) {
                        interfaceC18752M8173 = interfaceC18752M8173;
                        iM3169 = C0619.m2761("᩵᩶") ^ i4;
                        i = ((iM3169 ^ i3) * (-27469)) ^ (-1007547727);
                        i2 = -1156539727;
                    } else {
                        iM3169 = (C0773.m3169("۠۠") ^ i4) * (-117);
                        interfaceC18752M8173 = interfaceC18752M8173;
                        i = ((iM3169 ^ i3) * 7523) ^ (-1939561194);
                        i2 = 157862649;
                    }
                    InterfaceC18752 interfaceC18752 = interfaceC18752M8173;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    interfaceC18752M8173 = interfaceC18752;
                    break;
                case -1998660510:
                case -663622647:
                    if (AbstractC3624.f12429 <= 0) {
                        interfaceC18752M8173 = interfaceC18752M8173;
                        iM3169 = C0619.m2761("᩵᩶") ^ i4;
                        i = ((iM3169 ^ i3) * (-27469)) ^ (-1007547727);
                        i2 = -1156539727;
                        InterfaceC18752 interfaceC18753 = interfaceC18752M8173;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                        interfaceC18752M8173 = interfaceC18753;
                    } else {
                        int iM31611 = (i4 - C0773.m3169("֫۬")) * (-41);
                        i6 = iM31611 ^ (-1565008145);
                        i5 = ((iM31611 ^ i3) * (-8463)) ^ (-1520287677);
                    }
                    break;
                case -1990707248:
                case 1972822656:
                    C3779.m12264();
                    break;
                case -1877167129:
                case 1145521330:
                    interfaceC18752M8173 = interfaceC18752M8173;
                    sArr = f67679;
                    if (C2834.m9344() >= 0) {
                        interfaceC18752M8173 = interfaceC18752M8173;
                        iM3169 = (C0619.m2761("ۘۡ") ^ i3) * (-17);
                        interfaceC18752M8173 = interfaceC18752M8173;
                        i = ((iM3169 ^ i4) * 25913) ^ (-1670312191);
                        i2 = -1033611583;
                    } else {
                        iM3169 = C0619.m2761("ܳۗ") ^ i3;
                        i = ((iM3169 ^ i4) * 2463) ^ 526586937;
                        i2 = -582897954;
                    }
                    InterfaceC18752 interfaceC18754 = interfaceC18752M8173;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    interfaceC18752M8173 = interfaceC18754;
                    break;
                case -1860394584:
                case -866037337:
                    interfaceC18752M8173 = interfaceC18752M8173;
                    i8 = 38613796;
                    if (C2878.f9462) {
                        iM3169 = C0773.m3169("ܶۡ") ^ i3;
                        i = ((iM3169 ^ i4) * 21825) ^ 1990226342;
                        i2 = -1044383195;
                    } else {
                        iM3169 = C0773.m3169("ۛܽ") ^ i4;
                        i = ((iM3169 ^ i3) * 1641) ^ 1880756859;
                        i2 = 1983323107;
                    }
                    InterfaceC18752 interfaceC18755 = interfaceC18752M8173;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    interfaceC18752M8173 = interfaceC18755;
                    break;
                case -1809807114:
                case 171576721:
                    interfaceC18752M8173 = interfaceC18752M8173;
                    c = 292;
                    if (C1343.f4799 != 0) {
                        iM3169 = C0773.m3169("ܶۡ") ^ i3;
                        i = ((iM3169 ^ i4) * 21825) ^ 1990226342;
                        i2 = -1044383195;
                    } else {
                        iM3169 = C0773.m3169("ۜۘ") ^ i3;
                        i = ((iM3169 ^ i4) * 18767) ^ 1278254506;
                        i2 = -1774958035;
                    }
                    InterfaceC18752 interfaceC18756 = interfaceC18752M8173;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    interfaceC18752M8173 = interfaceC18756;
                    break;
                case -1747600604:
                case -28589653:
                    interfaceC18752M8173 = C2419.m8173(ApplicationC17729.f58258);
                    sArr2 = f67679;
                    if (C2288.m7767()) {
                        iM3169 = (C0619.m2761("ۘۡ") ^ i3) * (-17);
                        interfaceC18752M8173 = interfaceC18752M8173;
                        i = ((iM3169 ^ i4) * 25913) ^ (-1670312191);
                        i2 = -1033611583;
                    } else {
                        iM3169 = (C0773.m3169("ۤ۟") + i4) * 77;
                        interfaceC18752M8173 = interfaceC18752M8173;
                        i = ((iM3169 ^ i3) * (-3077)) ^ 730486347;
                        i2 = 1499742164;
                    }
                    InterfaceC18752 interfaceC18757 = interfaceC18752M8173;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    interfaceC18752M8173 = interfaceC18757;
                    break;
                case -1647441115:
                case -226229571:
                    interfaceC18752M8173 = interfaceC18752M8173;
                    int i14 = s + s2;
                    if ((i14 * i14) - i9 > 0) {
                        iM3169 = C0619.m2761("ܿ֫") ^ i3;
                        i = ((iM3169 ^ i4) * 18891) ^ 683554699;
                        i2 = -1888390031;
                    } else {
                        iM3169 = C0773.m3169("ᩳ᩷") ^ i4;
                        i = ((iM3169 ^ i3) * (-29231)) ^ 364545003;
                        i2 = -521594924;
                    }
                    InterfaceC18752 interfaceC18758 = interfaceC18752M8173;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    interfaceC18752M8173 = interfaceC18758;
                    break;
                case -1481382384:
                case 882864429:
                    strM48350 = m48350();
                    interfaceC18752M8173 = interfaceC18752M8173;
                    iM3169 = (i3 - C0773.m3169("ܰۚ")) * (-47);
                    i = ((iM3169 ^ i4) * 2861) ^ 12324679;
                    i2 = 2038178697;
                    InterfaceC18752 interfaceC18759 = interfaceC18752M8173;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    interfaceC18752M8173 = interfaceC18759;
                    break;
                case -1425575302:
                case 827410611:
                    i10 = 30533;
                    iM3169 = (i4 - C0619.m2761("ۨۚ")) * 25;
                    i = ((iM3169 ^ i3) * (-1349)) ^ 172689793;
                    i2 = 863251907;
                    InterfaceC18752 interfaceC187510 = interfaceC18752M8173;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    interfaceC18752M8173 = interfaceC187510;
                    break;
                case -1396429006:
                case -488020918:
                    C1783.m6232();
                    int iM31612 = (i4 - C0773.m3169("֫۬")) * (-41);
                    i6 = iM31612 ^ (-1565008145);
                    i5 = ((iM31612 ^ i3) * (-8463)) ^ (-1520287677);
                    break;
                case -1215085817:
                case 1163201111:
                    RunnableC0334.m2050(checkBox, true);
                    break;
                case -972008943:
                case 442116692:
                    i10 = 20417;
                    iM3169 = (i4 - C0619.m2761("ۨۚ")) * 25;
                    i = ((iM3169 ^ i3) * (-1349)) ^ 172689793;
                    i2 = 863251907;
                    InterfaceC18752 interfaceC187511 = interfaceC18752M8173;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    interfaceC18752M8173 = interfaceC187511;
                    break;
                case -548056707:
                case 1350247761:
                    interfaceC18752M8173 = interfaceC18752M8173;
                    s = sArr[c];
                    i7 = s * s;
                    if (AbstractC0641.m2813() <= 0) {
                        iM3169 = C0619.m2761("᩵᩶") ^ i4;
                        i = ((iM3169 ^ i3) * (-27469)) ^ (-1007547727);
                        i2 = -1156539727;
                    } else {
                        iM3169 = (C0619.m2761("۫ܿ") + i4) * 123;
                        i = ((iM3169 ^ i3) * 939) ^ 323278317;
                        i2 = -1220551123;
                    }
                    InterfaceC18752 interfaceC187512 = interfaceC18752M8173;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    interfaceC18752M8173 = interfaceC187512;
                    break;
                case -251723814:
                case 62548430:
                    C1343.m4943();
                    if (C23916.m53419() != 0) {
                        interfaceC18752M8173 = interfaceC18752M8173;
                        iM3169 = (C0773.m3169("ۙܶ") ^ i4) * 49;
                        i = ((iM3169 ^ i3) * 7729) ^ (-1109112387);
                        i2 = -409893188;
                        InterfaceC18752 interfaceC187513 = interfaceC18752M8173;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                        interfaceC18752M8173 = interfaceC187513;
                    } else {
                        int iM31613 = (i4 - C0773.m3169("֫۬")) * (-41);
                        i6 = iM31613 ^ (-1565008145);
                        i5 = ((iM31613 ^ i3) * (-8463)) ^ (-1520287677);
                    }
                    break;
                case 289251487:
                case 1766692888:
                    interfaceC18752M8173 = interfaceC18752M8173;
                    s2 = 6214;
                    if (C1343.f4799 != 0) {
                        iM3169 = C0619.m2761("᩵᩶") ^ i4;
                        i = ((iM3169 ^ i3) * (-27469)) ^ (-1007547727);
                        i2 = -1156539727;
                    } else {
                        iM3169 = C0619.m2761("ܺۘ") ^ i3;
                        i = ((iM3169 ^ i4) * 13857) ^ (-1315074656);
                        i2 = -726716969;
                    }
                    InterfaceC18752 interfaceC187514 = interfaceC18752M8173;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    interfaceC18752M8173 = interfaceC187514;
                    break;
                case 425750356:
                case 1037757419:
                    interfaceC18752M8173 = interfaceC18752M8173;
                    int i15 = i7 + i8;
                    i9 = i15 + i15;
                    if (C2878.f9462) {
                        interfaceC18752M8173 = interfaceC18752M8173;
                        iM3169 = (C0619.m2761("ۘۡ") ^ i3) * (-17);
                        interfaceC18752M8173 = interfaceC18752M8173;
                        i = ((iM3169 ^ i4) * 25913) ^ (-1670312191);
                        i2 = -1033611583;
                    } else {
                        iM3169 = (C0773.m3169("ܶۗ") ^ i3) * 65;
                        i = ((iM3169 ^ i4) * 3865) ^ 1795115368;
                        i2 = -924376683;
                    }
                    InterfaceC18752 interfaceC187515 = interfaceC18752M8173;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    interfaceC18752M8173 = interfaceC187515;
                    break;
                case 719628660:
                case 1692564587:
                    interfaceC18752M8173 = interfaceC18752M8173;
                    if (C2878.f9462) {
                        iM3169 = (C0773.m3169("ۙܶ") ^ i4) * 49;
                        i = ((iM3169 ^ i3) * 7729) ^ (-1109112387);
                        i2 = -409893188;
                    } else {
                        iM3169 = C0773.m3169("ۖܿ") ^ i4;
                        i = ((iM3169 ^ i3) * 5329) ^ (-601885782);
                        i2 = 262845521;
                    }
                    InterfaceC18752 interfaceC187516 = interfaceC18752M8173;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    interfaceC18752M8173 = interfaceC187516;
                    break;
                case 1499963099:
                case 1724545446:
                    interfaceC18752M8173 = interfaceC18752M8173;
                    String strM6952 = C2023.m6952(AbstractC0116.m1233(c23255));
                    if (C2878.m9480(strM6952)) {
                        iM3169 = C0619.m2761("᩻֡") ^ i3;
                        i = ((iM3169 ^ i4) * (-27625)) ^ 498849949;
                        i2 = 2113768327;
                    } else {
                        strM48350 = strM6952;
                        iM3169 = (i3 - C0773.m3169("ܰۚ")) * (-47);
                        i = ((iM3169 ^ i4) * 2861) ^ 12324679;
                        i2 = 2038178697;
                    }
                    InterfaceC18752 interfaceC187517 = interfaceC18752M8173;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    interfaceC18752M8173 = interfaceC187517;
                    break;
                case 1864013243:
                case 1884268861:
                    if (!C2878.f9462) {
                        iM3169 = (C0619.m2761("ۘۡ") ^ i3) * (-17);
                        interfaceC18752M8173 = interfaceC18752M8173;
                        i = ((iM3169 ^ i4) * 25913) ^ (-1670312191);
                        i2 = -1033611583;
                        InterfaceC18752 interfaceC187518 = interfaceC18752M8173;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                        interfaceC18752M8173 = interfaceC187518;
                    } else {
                        int iM31614 = (i4 - C0773.m3169("֫۬")) * (-41);
                        i6 = iM31614 ^ (-1565008145);
                        i5 = ((iM31614 ^ i3) * (-8463)) ^ (-1520287677);
                    }
                    break;
                default:
                    interfaceC18752M8173 = interfaceC18752M8173;
                    i11 = 293;
                    i12 = 15;
                    if (C20932.m47848() != 0) {
                        interfaceC18752M8173 = interfaceC18752M8173;
                        iM3169 = (C0619.m2761("ۘۡ") ^ i3) * (-17);
                        interfaceC18752M8173 = interfaceC18752M8173;
                        i = ((iM3169 ^ i4) * 25913) ^ (-1670312191);
                        i2 = -1033611583;
                    } else {
                        iM3169 = (C0773.m3169("᩷᩸") + i3) * (-99);
                        i = ((iM3169 ^ i4) * 247) ^ 902208457;
                        i2 = 475843979;
                    }
                    InterfaceC18752 interfaceC187519 = interfaceC18752M8173;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    interfaceC18752M8173 = interfaceC187519;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x01b7 A[PHI: r10 r11
      0x01b7: PHI (r10v4 int) = (r10v3 int), (r10v2 int) binds: [B:49:0x01b5, B:12:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x01b7: PHI (r11v4 short) = (r11v3 short), (r11v2 short) binds: [B:49:0x01b5, B:12:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0224 A[PHI: r6
      0x0224: PHI (r6v4 char) = (r6v3 char), (r6v2 char), (r6v2 char) binds: [B:58:0x0222, B:15:0x0070, B:12:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0257 A[PHI: r21
      0x0257: PHI (r21v4 short[]) = (r21v2 short[]), (r21v1 short[]), (r21v1 short[]), (r21v1 short[]) binds: [B:62:0x0255, B:17:0x0074, B:15:0x0070, B:92:0x0257] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0287 A[PHI: r2 r4 r7 r8 r9
      0x0287: PHI (r2v2 android.content.Intent) = 
      (r2v1 android.content.Intent)
      (r2v1 android.content.Intent)
      (r2v1 android.content.Intent)
      (r2v3 android.content.Intent)
     binds: [B:66:0x0285, B:53:0x01ea, B:6:0x0053, B:25:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x0287: PHI (r4v3 bin.mt.plus.Main) = (r4v2 bin.mt.plus.Main), (r4v2 bin.mt.plus.Main), (r4v2 bin.mt.plus.Main), (r4v4 bin.mt.plus.Main) binds: [B:66:0x0285, B:53:0x01ea, B:6:0x0053, B:25:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x0287: PHI (r7v4 short) = (r7v2 short), (r7v2 short), (r7v3 short), (r7v2 short) binds: [B:66:0x0285, B:53:0x01ea, B:6:0x0053, B:25:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x0287: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:66:0x0285, B:53:0x01ea, B:6:0x0053, B:25:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x0287: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:66:0x0285, B:53:0x01ea, B:6:0x0053, B:25:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM3169;
        int i;
        int i2;
        int i3 = C1146.f4234;
        int i4 = C2966.f9654;
        int iM31610 = C0773.m3169("ܽᩴ") ^ i3;
        int i5 = ((iM31610 ^ i4) * (-27707)) ^ (-1277651738);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM31610 ^ 1619767977;
        Intent intent = null;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1455979051;
        Main main = null;
        int iM3792 = 0;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * 12153) >> 31));
            switch (i13) {
                case -1982188534:
                case -79842330:
                    i12 = 3;
                    if (C13473.f42873 == 0) {
                        iM3169 = (C0619.m2761("ܺ᩷") ^ i3) * 41;
                        i = ((iM3169 ^ i4) * 11525) ^ 1663311146;
                        i2 = 1951818270;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    } else {
                        int iM31611 = C0773.m3169("֡ۖ") ^ i4;
                        i6 = iM31611 ^ 1774002735;
                        i5 = ((iM31611 ^ i3) * 171) ^ (-1849996460);
                        intent = null;
                    }
                    break;
                case -1628151954:
                case 877336784:
                    i10 = TwofishEngine.GF256_FDBK;
                    iM3169 = (C0773.m3169("ۚܽ") + i4) * 61;
                    i = ((iM3169 ^ i3) * 9527) ^ 1309553585;
                    i2 = 670909821;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1599009447:
                case 796917495:
                    i8 = 322382025;
                    if (C13473.f42873 != 0) {
                        iM3169 = C0773.m3169("ܳܿ") ^ i3;
                        i = ((iM3169 ^ i4) * 23445) ^ 1441489309;
                        i2 = -378552054;
                    } else {
                        iM3169 = C0773.m3169("ۤۜ") ^ i4;
                        i = ((iM3169 ^ i3) * 16921) ^ 1443531291;
                        i2 = 981020880;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1486476949:
                case 1008078945:
                    int i14 = i7 + i8;
                    i9 = i14 + i14;
                    s2 = 17955;
                    if (C3077.m10041()) {
                        iM3169 = C0619.m2761("۠۬") ^ i3;
                        i = ((iM3169 ^ i4) * 12969) ^ 948282691;
                        i2 = 1877596631;
                    } else {
                        iM3169 = (C0619.m2761("ۘۗ") + i3) * 39;
                        i = ((iM3169 ^ i4) * (-25215)) ^ 582656269;
                        i2 = 1499108949;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1432475493:
                case -1144768142:
                    int i15 = s + s2;
                    if (i9 - (i15 * i15) >= 0) {
                        iM3169 = (i3 - C0773.m3169("ۜ۟")) * (-17);
                        i = ((iM3169 ^ i4) * 10293) ^ 722345426;
                        i2 = -210951033;
                    } else {
                        iM3169 = (C0619.m2761("ܰᩳ") + i4) * 109;
                        i = ((iM3169 ^ i3) * 28441) ^ (-621440238);
                        i2 = -759542434;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1427007877:
                case 1439449505:
                    C1080.m4050();
                    break;
                case -1265471210:
                case -124330946:
                    i10 = 40808;
                    iM3169 = (C0773.m3169("ۚܽ") + i4) * 61;
                    i = ((iM3169 ^ i3) * 9527) ^ 1309553585;
                    i2 = 670909821;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -915324657:
                case 2024902189:
                    sArr = f67679;
                    if (C2485.m8357() <= 0) {
                        iM3169 = (C0773.m3169("ۛ۟") ^ i3) * (-125);
                        i = ((iM3169 ^ i4) * 24791) ^ (-831224387);
                        i2 = 2119715657;
                    } else {
                        iM3169 = C0773.m3169("֨ᩳ") ^ i3;
                        i = ((iM3169 ^ i4) * 9235) ^ 1221203826;
                        i2 = -164031592;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -899269964:
                case 419760989:
                    C13473.m33144();
                    iM3169 = (C0773.m3169("ۛ۟") ^ i3) * (-125);
                    i = ((iM3169 ^ i4) * 24791) ^ (-831224387);
                    i2 = 2119715657;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -861147747:
                case 1178633297:
                    c = 413;
                    if (C3492.m11488()) {
                        iM3169 = C0619.m2761("ۜۛ") ^ i3;
                        i = ((iM3169 ^ i4) * (-13299)) ^ (-1612469786);
                        i2 = 1942361289;
                    } else {
                        iM3169 = C0773.m3169("ۙܽ") ^ i4;
                        i = ((iM3169 ^ i3) * (-10933)) ^ (-213250850);
                        i2 = -2078665446;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -789440900:
                case 995677556:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0773.m3169("ܳܿ") ^ i3;
                        i = ((iM3169 ^ i4) * 23445) ^ 1441489309;
                        i2 = -378552054;
                    } else {
                        iM3169 = (C0773.m3169("ܺܽ") ^ i4) * (-61);
                        i = ((iM3169 ^ i3) * (-9427)) ^ 1414856440;
                        i2 = 1189447311;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -676414392:
                case 1494645092:
                    C1146.m4231();
                    if (C0269.f1558 <= 0) {
                        int iM31612 = C0773.m3169("֡ۖ") ^ i4;
                        i6 = iM31612 ^ 1774002735;
                        i5 = ((iM31612 ^ i3) * 171) ^ (-1849996460);
                        intent = null;
                    } else {
                        iM3169 = (C0773.m3169("ۛ۟") ^ i3) * (-125);
                        i = ((iM3169 ^ i4) * 24791) ^ (-831224387);
                        i2 = 2119715657;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    }
                    break;
                case -544187431:
                case 362712783:
                    RunnableC0334.m2063();
                    if (C3077.m10041()) {
                        iM3169 = C0773.m3169("ۙܽ") ^ i4;
                        i = ((iM3169 ^ i3) * (-10933)) ^ (-213250850);
                        i2 = -2078665446;
                    } else {
                        iM3169 = (C0773.m3169("ۛ۟") ^ i3) * (-125);
                        i = ((iM3169 ^ i4) * 24791) ^ (-831224387);
                        i2 = 2119715657;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -190688583:
                case 911738161:
                    C20932.m47848();
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0773.m3169("ۙܽ") ^ i4;
                        i = ((iM3169 ^ i3) * (-10933)) ^ (-213250850);
                        i2 = -2078665446;
                    } else {
                        iM3169 = C0619.m2761("۠۬") ^ i3;
                        i = ((iM3169 ^ i4) * 12969) ^ 948282691;
                        i2 = 1877596631;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -158626146:
                case 1056572070:
                    RunnableC1848.m6363(main, intent);
                    main.m40399(new RunnableC14488(this));
                    iM3169 = C0773.m3169("ᩳܿ") ^ i4;
                    i = ((iM3169 ^ i3) * (-10563)) ^ (-131666197);
                    i2 = -429331085;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 325143254:
                case 1463496755:
                    iM3792 = C0950.m3792(view);
                    sArr2 = f67679;
                    i11 = 414;
                    if (C0862.f3233 == 0) {
                        iM3169 = (i3 - C0619.m2761("ܳ۬")) * (-47);
                        i = ((iM3169 ^ i4) * 28125) ^ (-54462146);
                        i2 = 272353331;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    } else {
                        int iM31613 = C0773.m3169("֡ۖ") ^ i4;
                        i6 = iM31613 ^ 1774002735;
                        i5 = ((iM31613 ^ i3) * 171) ^ (-1849996460);
                        intent = null;
                    }
                    break;
                case 775523827:
                case 1670864941:
                    main = this.f67686;
                    if (C2834.m9344() < 0) {
                        intent = new Intent(main, (Class<?>) ActivityC10694.class);
                        if (C4282.f15546 <= 0) {
                            iM3169 = C0773.m3169("ܳܿ") ^ i3;
                            i = ((iM3169 ^ i4) * 23445) ^ 1441489309;
                            i2 = -378552054;
                        } else {
                            iM3169 = (i4 - C0619.m2761("᩺ܳ")) * 119;
                            i = ((iM3169 ^ i3) * (-8839)) ^ 2060881404;
                            i2 = 918425152;
                        }
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    } else {
                        int iM31614 = C0773.m3169("֡ۖ") ^ i4;
                        i6 = iM31614 ^ 1774002735;
                        i5 = ((iM31614 ^ i3) * 171) ^ (-1849996460);
                        intent = null;
                    }
                    break;
                case 925710921:
                case 1403203719:
                    if (iM3792 == (C0773.m3169(AbstractC3624.m11769(sArr2, i11, i12, i10)) ^ 2097166241)) {
                        iM3169 = (i3 - C0773.m3169("ۡܶ")) * (-95);
                        i = ((iM3169 ^ i4) * (-17187)) ^ (-1967888856);
                        i2 = -1384226466;
                    } else {
                        iM3169 = C0773.m3169("ᩳܿ") ^ i4;
                        i = ((iM3169 ^ i3) * (-10563)) ^ (-131666197);
                        i2 = -429331085;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1425150350:
                case 2071204764:
                    break;
                default:
                    s = sArr[c];
                    i7 = s * s;
                    if (C0619.m2763()) {
                        iM3169 = C0773.m3169("ܳܿ") ^ i3;
                        i = ((iM3169 ^ i4) * 23445) ^ 1441489309;
                        i2 = -378552054;
                    } else {
                        iM3169 = (i4 - C0773.m3169("᩸֫")) * (-15);
                        i = ((iM3169 ^ i3) * (-9711)) ^ 1396398620;
                        i2 = 1810030537;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48342(ViewOnClickListenerC21202 viewOnClickListenerC21202, CheckBox checkBox) {
        int iM2761;
        int i;
        int i2;
        int iM2762;
        int i3;
        String str;
        int i4;
        int iM2763;
        int i5;
        short[] sArr;
        int i6;
        int i7;
        int iM3169;
        int i8;
        int i9;
        int iM2764;
        int i10;
        int i11;
        final CheckBox checkBox2 = checkBox;
        int i12 = C4238.f15451;
        int i13 = C3448.f11240;
        int iM2765 = (C0619.m2761("ܽۛ") ^ i12) * 5;
        int i14 = ((iM2765 ^ i13) * 823) ^ 716897705;
        String strM8881 = null;
        ViewOnClickListenerC15533 viewOnClickListenerC15533 = null;
        String strM12925 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i15 = iM2765 ^ (-233494354);
        Main main = null;
        int i16 = 0;
        int i17 = 0;
        int iM2766 = 0;
        int i18 = 0;
        short s = 0;
        int i19 = 0;
        int i20 = 0;
        int iM31610 = 0;
        int i21 = 0;
        int i22 = 0;
        int iM31611 = 0;
        int i23 = 0;
        int i24 = -217965881;
        int i25 = 0;
        InterfaceC9801 interfaceC9801 = null;
        String str2 = null;
        C23255 c23255 = null;
        DialogInterface.OnClickListener onClickListener = null;
        View viewM2812 = null;
        DialogInterfaceOnClickListenerC7716 dialogInterfaceOnClickListenerC7716 = null;
        int i26 = 0;
        C2361 c2361M13539 = null;
        View viewM9333 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int iM31612 = 0;
        while (true) {
            i24 = i15 ^ (i14 & (((i24 ^ i13) * 30169) >> 31));
            switch (i24) {
                case -2099402313:
                case 1669491421:
                    i26 = i26;
                    strM8881 = strM8881;
                    i22 = i22;
                    i25 = i25;
                    main = main;
                    s = f67679[133];
                    i19 = s * 2;
                    i20 = 1;
                    iM2762 = (C0619.m2761("ۨܽ") + i12) * 45;
                    i14 = ((iM2762 ^ i13) * 16589) ^ (-922494598);
                    i3 = 1959544952;
                    i9 = iM2762 ^ i3;
                    main = main;
                    i25 = i25;
                    strM8881 = strM8881;
                    i22 = i22;
                    i26 = i26;
                    i15 = i9;
                    checkBox2 = checkBox;
                    break;
                case -2056152038:
                case -267665898:
                    i26 = i26;
                    i22 = i22;
                    i4 = i25;
                    InterfaceC9801 interfaceC9802 = interfaceC9801;
                    str = strM8881;
                    C0269.m1786(c23255, C2702.m8877(interfaceC9802, str, C2419.m8166(f67679, 157, 68, i16)));
                    if (C11235.f35427 < 0) {
                        iM2763 = C0619.m2761("֨۠") ^ i13;
                        interfaceC9801 = interfaceC9802;
                        i14 = ((iM2763 ^ i12) * (-30425)) ^ 1552542476;
                        i5 = -1208506153;
                        i6 = iM2763 ^ i5;
                        strM8881 = str;
                        i25 = i4;
                        i26 = i26;
                        i15 = i6;
                        i22 = i22;
                        checkBox2 = checkBox;
                    } else {
                        interfaceC9801 = interfaceC9802;
                        strM8881 = str;
                        sArr = sArr2;
                        i25 = i4;
                        int iM2767 = C0619.m2761("ۘۘ") ^ i12;
                        i14 = ((iM2767 ^ i13) * 8985) ^ (-1927415736);
                        i9 = iM2767 ^ (-1309738416);
                        sArr2 = sArr;
                        i22 = i22;
                        i26 = i26;
                        i15 = i9;
                        checkBox2 = checkBox;
                    }
                    break;
                case -2051694922:
                case -1965222245:
                    i26 = i26;
                    strM8881 = strM8881;
                    i22 = i22;
                    i25 = i25;
                    main = main;
                    iM31612 = C0773.m3169(str2) ^ 2127660828;
                    if (RunnableC3646.m11813() != 0) {
                        iM2762 = (C0619.m2761("᩷۟") ^ i13) * (-99);
                        i14 = ((iM2762 ^ i12) * (-21447)) ^ 705603804;
                        i3 = -418060742;
                    } else {
                        iM2762 = (i13 - C0619.m2761("᩵۟")) * (-95);
                        i14 = ((iM2762 ^ i12) * (-21505)) ^ (-1469159163);
                        i3 = 60459263;
                    }
                    i9 = iM2762 ^ i3;
                    main = main;
                    i25 = i25;
                    strM8881 = strM8881;
                    i22 = i22;
                    i26 = i26;
                    i15 = i9;
                    checkBox2 = checkBox;
                    break;
                case -2021883706:
                case 123280505:
                    if (C1542.m5459() >= 0) {
                        i26 = i26;
                        strM8881 = strM8881;
                        i22 = i22;
                        i25 = i25;
                        main = main;
                        iM2762 = (i12 - C0619.m2761("ܶۜ")) * (-107);
                        i14 = ((iM2762 ^ i13) * (-17241)) ^ (-1760140102);
                        i3 = 1066488237;
                        i9 = iM2762 ^ i3;
                        main = main;
                        i25 = i25;
                        strM8881 = strM8881;
                        i22 = i22;
                        i26 = i26;
                        i15 = i9;
                        checkBox2 = checkBox;
                    }
                    i26 = i26;
                    i22 = i22;
                    i25 = i25;
                    main = main;
                    iM2762 = (C0619.m2761("᩷۟") ^ i13) * (-99);
                    i14 = ((iM2762 ^ i12) * (-21447)) ^ 705603804;
                    i3 = -418060742;
                    i9 = iM2762 ^ i3;
                    main = main;
                    i25 = i25;
                    strM8881 = strM8881;
                    i22 = i22;
                    i26 = i26;
                    i15 = i9;
                    checkBox2 = checkBox;
                    break;
                case -1993238830:
                case 570133147:
                    i26 = i26;
                    i22 = i22;
                    i4 = i25;
                    sArr = sArr2;
                    strM8881 = C2702.m8881(sArr, 140, 17, i16);
                    if (C2310.f7472 < 0) {
                        int iM31613 = (C0773.m3169("ܳ֫") ^ i12) * (-117);
                        i14 = ((iM31613 ^ i13) * 27365) ^ 1437551581;
                        i6 = iM31613 ^ (-125241151);
                        sArr2 = sArr;
                        i25 = i4;
                        i26 = i26;
                        i15 = i6;
                        i22 = i22;
                        checkBox2 = checkBox;
                    }
                    i25 = i4;
                    int iM2768 = C0619.m2761("ۘۘ") ^ i12;
                    i14 = ((iM2768 ^ i13) * 8985) ^ (-1927415736);
                    i9 = iM2768 ^ (-1309738416);
                    sArr2 = sArr;
                    i22 = i22;
                    i26 = i26;
                    i15 = i9;
                    checkBox2 = checkBox;
                    break;
                case -1951735990:
                case 282748478:
                    i26 = i26;
                    C2419.m8168(c2361M13539, C0773.m3169(C1080.m4056(f67679, 240, 3, i16)) ^ 2116384272, dialogInterfaceOnClickListenerC7716);
                    iM2764 = C0619.m2761("ܺ᩹") ^ i12;
                    i10 = ((iM2764 ^ i13) * (-14621)) ^ 1162005423;
                    i11 = 1278567611;
                    int i27 = i26;
                    i15 = iM2764 ^ i11;
                    i14 = i10;
                    i26 = i27;
                    break;
                case -1780440905:
                case -868644660:
                    C3077.m10041();
                    C2310.m7813();
                    break;
                case -1740022556:
                case 1631712169:
                    if (!C2878.f9462) {
                        i26 = i26;
                        sArr = sArr2;
                        i22 = i22;
                        int iM2769 = C0619.m2761("ۘۘ") ^ i12;
                        i14 = ((iM2769 ^ i13) * 8985) ^ (-1927415736);
                        i9 = iM2769 ^ (-1309738416);
                        sArr2 = sArr;
                        i22 = i22;
                        i26 = i26;
                        i15 = i9;
                        checkBox2 = checkBox;
                    }
                    i26 = i26;
                    i22 = i22;
                    i25 = i25;
                    main = main;
                    iM2762 = (C0619.m2761("᩷۟") ^ i13) * (-99);
                    i14 = ((iM2762 ^ i12) * (-21447)) ^ 705603804;
                    i3 = -418060742;
                    i9 = iM2762 ^ i3;
                    main = main;
                    i25 = i25;
                    strM8881 = strM8881;
                    i22 = i22;
                    i26 = i26;
                    i15 = i9;
                    checkBox2 = checkBox;
                    break;
                case -1638339118:
                case -83336985:
                    C0269.m1775();
                    C0950.m3785();
                    i26 = i26;
                    i22 = i22;
                    i25 = i25;
                    main = main;
                    iM2762 = (C0619.m2761("᩷۟") ^ i13) * (-99);
                    i14 = ((iM2762 ^ i12) * (-21447)) ^ 705603804;
                    i3 = -418060742;
                    i9 = iM2762 ^ i3;
                    main = main;
                    i25 = i25;
                    strM8881 = strM8881;
                    i22 = i22;
                    i26 = i26;
                    i15 = i9;
                    checkBox2 = checkBox;
                    break;
                case -1612691272:
                case 372731225:
                    i26 = i26;
                    C2375.m8070(C3448.m11246(viewM2812, C0619.m2761(strM12925) ^ 2097822411), viewOnClickListenerC15533);
                    int iM27610 = C0619.m2761("ۗᩴ") ^ i13;
                    int i28 = ((iM27610 ^ i12) * (-32019)) ^ (-1609996988);
                    i9 = iM27610 ^ 1450795647;
                    i23 = i23;
                    i25 = i25;
                    i14 = i28;
                    i26 = i26;
                    i15 = i9;
                    checkBox2 = checkBox;
                    break;
                case -1471294742:
                case -1104138076:
                    i26 = i26;
                    sArr3 = f67679;
                    i23 = 234;
                    i25 = 3;
                    if (AbstractC3624.m11755() != 0) {
                        sArr = sArr2;
                        i22 = i22;
                        int iM27611 = C0619.m2761("ۘۘ") ^ i12;
                        i14 = ((iM27611 ^ i13) * 8985) ^ (-1927415736);
                        i9 = iM27611 ^ (-1309738416);
                        sArr2 = sArr;
                        i22 = i22;
                    } else {
                        int iM31614 = C0773.m3169("ۧ᩹") ^ i12;
                        i14 = ((iM31614 ^ i13) * (-19227)) ^ 1449272235;
                        i9 = iM31614 ^ 2102184448;
                    }
                    i26 = i26;
                    i15 = i9;
                    checkBox2 = checkBox;
                    break;
                case -1405287407:
                case 451144014:
                    i26 = i26;
                    C11235.m28299(viewM9333, viewOnClickListenerC15533);
                    c2361M13539 = C4238.m13539(main);
                    C1343.m4952(c2361M13539, viewM2812);
                    dialogInterfaceOnClickListenerC7716 = new DialogInterfaceOnClickListenerC7716(1, c23255, checkBox2);
                    if (C2485.f7950 == 0) {
                        iM2764 = C0619.m2761("ۘۜ") ^ i13;
                        i10 = ((iM2764 ^ i12) * (-1275)) ^ 2017703107;
                        i11 = 1675868392;
                        int i29 = i26;
                        i15 = iM2764 ^ i11;
                        i14 = i10;
                        i26 = i29;
                    } else {
                        i7 = i25;
                        iM3169 = (C0619.m2761("֫ۜ") + i13) * 119;
                        i14 = ((iM3169 ^ i12) * 2937) ^ (-1574905539);
                        i8 = -1225890932;
                        i9 = iM3169 ^ i8;
                        i25 = i7;
                        i26 = i26;
                        i15 = i9;
                        checkBox2 = checkBox;
                    }
                    break;
                case -1396123122:
                case 1121623778:
                    i16 = 53996;
                    iM2762 = (C0773.m3169("ۨᩳ") ^ i12) * (-53);
                    i14 = ((iM2762 ^ i13) * (-3347)) ^ (-1844072503);
                    i3 = 1229668135;
                    i9 = iM2762 ^ i3;
                    main = main;
                    i25 = i25;
                    strM8881 = strM8881;
                    i22 = i22;
                    i26 = i26;
                    i15 = i9;
                    checkBox2 = checkBox;
                    break;
                case -1221427231:
                case 1946690002:
                    i26 = i26;
                    i7 = i25;
                    iM31611 = C0773.m3169(C2288.m7761(f67679, 228, 3, i16)) ^ 2102673796;
                    iM3169 = C0773.m3169("ۨ۟") ^ i13;
                    i14 = ((iM3169 ^ i12) * 9063) ^ 1168995756;
                    i8 = 971486355;
                    i9 = iM3169 ^ i8;
                    i25 = i7;
                    i26 = i26;
                    i15 = i9;
                    checkBox2 = checkBox;
                    break;
                case -872741029:
                case -228720735:
                    i26 = i26;
                    int i30 = i23;
                    i7 = i25;
                    C2375.m8070(C2834.m9333(viewM2812, C0619.m2761(C3448.m11252(sArr3, i30, i7, i16)) ^ 2101442118), viewOnClickListenerC15533);
                    sArr4 = f67679;
                    if (C0619.m2763()) {
                        i23 = i30;
                        iM3169 = (C0619.m2761("֫ۜ") + i13) * 119;
                        i14 = ((iM3169 ^ i12) * 2937) ^ (-1574905539);
                        i8 = -1225890932;
                        i9 = iM3169 ^ i8;
                        i25 = i7;
                        i26 = i26;
                        i15 = i9;
                    } else {
                        int iM27612 = C0619.m2761("ۜۜ") ^ i13;
                        i23 = i30;
                        i25 = i7;
                        i26 = i26;
                        i14 = ((iM27612 ^ i12) * (-31343)) ^ (-577439373);
                        i15 = iM27612 ^ (-289254038);
                    }
                    checkBox2 = checkBox;
                    break;
                case -833654813:
                case 1931659053:
                    i26 = i26;
                    strM8881 = strM8881;
                    i22 = i22;
                    i25 = i25;
                    viewM2812 = AbstractC0641.m2812(main, iM31612);
                    main = main;
                    iM31610 = C0773.m3169(RunnableC1848.m6366(f67679, 137, 3, i16));
                    i17 = 2126666539;
                    if (C3492.f12043 <= 0) {
                        iM2762 = (i12 - C0619.m2761("ܶۜ")) * (-107);
                        i14 = ((iM2762 ^ i13) * (-17241)) ^ (-1760140102);
                        i3 = 1066488237;
                    } else {
                        iM2762 = C0619.m2761("ۢۚ") ^ i13;
                        i14 = ((iM2762 ^ i12) * 25317) ^ 833011338;
                        i3 = -142540461;
                    }
                    i9 = iM2762 ^ i3;
                    main = main;
                    i25 = i25;
                    strM8881 = strM8881;
                    i22 = i22;
                    i26 = i26;
                    i15 = i9;
                    checkBox2 = checkBox;
                    break;
                case -777071422:
                case 1797038630:
                    i26 = i26;
                    i7 = i25;
                    C11235.m28299(C2834.m9333(viewM2812, iM31611), viewOnClickListenerC15533);
                    strM12925 = C3998.m12925(f67679, 231, 3, i16);
                    if (C3734.f12817 >= 0) {
                        iM3169 = (C0619.m2761("֫ۜ") + i13) * 119;
                        i14 = ((iM3169 ^ i12) * 2937) ^ (-1574905539);
                        i8 = -1225890932;
                    } else {
                        iM3169 = C0619.m2761("ܺ۫") ^ i12;
                        i14 = ((iM3169 ^ i13) * (-32643)) ^ (-1481724569);
                        i8 = 693605216;
                    }
                    i9 = iM3169 ^ i8;
                    i25 = i7;
                    i26 = i26;
                    i15 = i9;
                    checkBox2 = checkBox;
                    break;
                case -418880341:
                case 142792527:
                    C3033.m9848(c2361M13539, iM2766 ^ i18, null);
                    onClickListener = new DialogInterface.OnClickListener() { // from class: l.֫ۡۤ

                        /* JADX INFO: renamed from: ۛ۫ۨ, reason: not valid java name and contains not printable characters */
                        private static final short[] f6159 = {1668, -18831, -18826, -18830, -18819, -18821, -18836, -18873, -18828, -18825, -18817, -18873, -18818, -18825, -18838, -18827, -18823, -18836};

                        /* JADX WARN: Code duplicated, block: B:62:0x023f A[PHI: r3 r4 r5 r6 r16
                          0x023f: PHI (r3v3 short[]) = (r3v2 short[]), (r3v1 short[]), (r3v1 short[]) binds: [B:61:0x023d, B:57:0x021a, B:53:0x01f3] A[DONT_GENERATE, DONT_INLINE]
                          0x023f: PHI (r4v3 short) = (r4v1 short), (r4v2 short), (r4v1 short) binds: [B:61:0x023d, B:57:0x021a, B:53:0x01f3] A[DONT_GENERATE, DONT_INLINE]
                          0x023f: PHI (r5v3 int) = (r5v1 int), (r5v2 int), (r5v1 int) binds: [B:61:0x023d, B:57:0x021a, B:53:0x01f3] A[DONT_GENERATE, DONT_INLINE]
                          0x023f: PHI (r6v2 int) = (r6v1 int), (r6v1 int), (r6v3 int) binds: [B:61:0x023d, B:57:0x021a, B:53:0x01f3] A[DONT_GENERATE, DONT_INLINE]
                          0x023f: PHI (r16v6 l.ᩳ֫ܺ) = (r16v4 l.ᩳ֫ܺ), (r16v5 l.ᩳ֫ܺ), (r16v7 l.ᩳ֫ܺ) binds: [B:61:0x023d, B:57:0x021a, B:53:0x01f3] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:68:0x0284 A[PHI: r2 r16
                          0x0284: PHI (r2v8 boolean) = (r2v1 boolean), (r2v3 boolean), (r2v1 boolean), (r2v1 boolean) binds: [B:65:0x026d, B:26:0x008a, B:15:0x0059, B:6:0x003a] A[DONT_GENERATE, DONT_INLINE]
                          0x0284: PHI (r16v21 l.ᩳ֫ܺ) = (r16v3 l.ᩳ֫ܺ), (r16v14 l.ᩳ֫ܺ), (r16v20 l.ᩳ֫ܺ), (r16v24 l.ᩳ֫ܺ) binds: [B:65:0x026d, B:26:0x008a, B:15:0x0059, B:6:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
                        
                            if (l.C3690.m11987() != false) goto L18;
                         */
                        @Override // android.content.DialogInterface.OnClickListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void onClick(android.content.DialogInterface r19, int r20) {
                            /*
                                Method dump skipped, instruction units count: 840
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: l.DialogInterfaceOnClickListenerC1811.onClick(android.content.DialogInterface, int):void");
                        }
                    };
                    sArr5 = f67679;
                    i26 = 246;
                    iM2761 = C0619.m2761("۠ۘ") ^ i12;
                    i = ((iM2761 ^ i13) * 277) ^ (-1269755345);
                    i2 = -1547942935;
                    i15 = iM2761 ^ i2;
                    i14 = i;
                    break;
                case -141405276:
                case 1787879518:
                    i26 = i26;
                    strM8881 = strM8881;
                    i22 = i22;
                    i25 = i25;
                    main = main;
                    int i31 = s + 1;
                    if ((i31 * i31) - (i19 + i20) < 0) {
                        iM2762 = (C0619.m2761("᩹ۚ") ^ i13) * (-9);
                        i14 = ((iM2762 ^ i12) * 30985) ^ (-182188182);
                        i3 = -1742972885;
                    } else {
                        iM2762 = C0619.m2761("ܽۙ") ^ i13;
                        i14 = ((iM2762 ^ i12) * 15749) ^ 381043987;
                        i3 = -1433156232;
                    }
                    i9 = iM2762 ^ i3;
                    main = main;
                    i25 = i25;
                    strM8881 = strM8881;
                    i22 = i22;
                    i26 = i26;
                    i15 = i9;
                    checkBox2 = checkBox;
                    break;
                case -92101651:
                case 743697810:
                    i26 = i26;
                    iM2766 = C0619.m2761(C3779.m12266(f67679, 243, 3, i16));
                    i18 = 2097902772;
                    if (C3998.f13671 == 0) {
                        iM2764 = (C0619.m2761("۬᩺") ^ i13) * 5;
                        i10 = ((iM2764 ^ i12) * (-16905)) ^ 1879558771;
                        i11 = 1852236003;
                        int i210 = i26;
                        i15 = iM2764 ^ i11;
                        i14 = i10;
                        i26 = i210;
                    } else {
                        i7 = i25;
                        iM3169 = (C0619.m2761("֫ۜ") + i13) * 119;
                        i14 = ((iM3169 ^ i12) * 2937) ^ (-1574905539);
                        i8 = -1225890932;
                        i9 = iM3169 ^ i8;
                        i25 = i7;
                        i26 = i26;
                        i15 = i9;
                        checkBox2 = checkBox;
                    }
                    break;
                case 42790360:
                case 1282796829:
                    C0619.m2763();
                    if (!C0619.f2439) {
                        i26 = i26;
                        i22 = i22;
                        i25 = i25;
                        main = main;
                        iM2762 = (C0619.m2761("᩷۟") ^ i13) * (-99);
                        i14 = ((iM2762 ^ i12) * (-21447)) ^ 705603804;
                        i3 = -418060742;
                        i9 = iM2762 ^ i3;
                        main = main;
                        i25 = i25;
                        strM8881 = strM8881;
                        i22 = i22;
                        i26 = i26;
                        i15 = i9;
                        checkBox2 = checkBox;
                    } else {
                        iM2761 = (C0619.m2761("֫ۗ") + i13) * (-23);
                        i = ((iM2761 ^ i12) * (-7281)) ^ 1127496392;
                        i2 = 1074681131;
                        i15 = iM2761 ^ i2;
                        i14 = i;
                    }
                    break;
                case 109785676:
                case 1137968704:
                    i26 = i26;
                    viewM9333 = C2834.m9333(viewM2812, C0773.m3169(C2702.m8881(sArr4, 237, 3, i16)) ^ 2121649419);
                    iM2764 = C0619.m2761("ۛܰ") ^ i12;
                    i10 = ((iM2764 ^ i13) * 4087) ^ 946642601;
                    i11 = -1403777070;
                    int i211 = i26;
                    i15 = iM2764 ^ i11;
                    i14 = i10;
                    i26 = i211;
                    break;
                case 299974184:
                case 1300064138:
                    i16 = 2326;
                    iM2762 = (C0773.m3169("ۨᩳ") ^ i12) * (-53);
                    i14 = ((iM2762 ^ i13) * (-3347)) ^ (-1844072503);
                    i3 = 1229668135;
                    i9 = iM2762 ^ i3;
                    main = main;
                    i25 = i25;
                    strM8881 = strM8881;
                    i22 = i22;
                    i26 = i26;
                    i15 = i9;
                    checkBox2 = checkBox;
                    break;
                case 353084728:
                case 1751995860:
                    C11235.m28307(c2361M13539, C0773.m3169(AbstractC0641.m2820(sArr5, i26, 3, i16)) ^ 2116238661, onClickListener);
                    C3099.m10090(c2361M13539);
                    break;
                case 533225933:
                case 1996963316:
                    i26 = i26;
                    str = strM8881;
                    i22 = i22;
                    i4 = i25;
                    c23255 = (C23255) C2834.m9333(viewM2812, iM31610 ^ i17);
                    interfaceC9801 = ApplicationC17729.f58258;
                    sArr2 = f67679;
                    iM2763 = C0619.m2761("۠᩹") ^ i12;
                    i14 = ((iM2763 ^ i13) * 28257) ^ (-109103585);
                    i5 = -1756604373;
                    i6 = iM2763 ^ i5;
                    strM8881 = str;
                    i25 = i4;
                    i26 = i26;
                    i15 = i6;
                    i22 = i22;
                    checkBox2 = checkBox;
                    break;
                case 1298978110:
                case 1642503227:
                    i26 = i26;
                    int i32 = i21;
                    i22 = i22;
                    int i33 = i25;
                    C2375.m8070(C3448.m11246(viewM2812, C0773.m3169(C2966.m9670(sArr6, i32, i22, i16)) ^ 2118842999), viewOnClickListenerC15533);
                    if (C0773.f2792 <= 0) {
                        i21 = i32;
                        i25 = i33;
                        main = main;
                        iM2762 = (C0619.m2761("᩷۟") ^ i13) * (-99);
                        i14 = ((iM2762 ^ i12) * (-21447)) ^ 705603804;
                        i3 = -418060742;
                        i9 = iM2762 ^ i3;
                        main = main;
                        i25 = i25;
                        strM8881 = strM8881;
                    } else {
                        int iM31615 = C0773.m3169("֡ܺ") ^ i13;
                        i21 = i32;
                        i14 = ((iM31615 ^ i12) * 1259) ^ (-284124255);
                        i9 = iM31615 ^ 1601926910;
                        i25 = i33;
                    }
                    i22 = i22;
                    i26 = i26;
                    i15 = i9;
                    checkBox2 = checkBox;
                    break;
                case 1340285604:
                case 1606328905:
                    i26 = i26;
                    i7 = i25;
                    C4238.m13531(c23255, c23255.m54099());
                    viewOnClickListenerC15533 = new ViewOnClickListenerC15533(1, c23255);
                    sArr6 = f67679;
                    i21 = HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS;
                    i22 = 3;
                    iM3169 = (i12 - C0773.m3169("ܳ᩶")) * (-115);
                    i14 = ((iM3169 ^ i13) * 20835) ^ (-957621443);
                    i8 = -1913047307;
                    i9 = iM3169 ^ i8;
                    i25 = i7;
                    i26 = i26;
                    i15 = i9;
                    checkBox2 = checkBox;
                    break;
                default:
                    int i34 = i26;
                    String str3 = strM8881;
                    int i35 = i22;
                    int i36 = i25;
                    Main main2 = viewOnClickListenerC21202.f67686;
                    String strM7749 = C2287.m7749(f67679, 134, 3, i16);
                    int iM31616 = C0773.m3169("۠۫") ^ i12;
                    strM8881 = str3;
                    i25 = i36;
                    i26 = i34;
                    i15 = iM31616 ^ 855801748;
                    i14 = ((iM31616 ^ i13) * (-1141)) ^ (-1826506111);
                    i22 = i35;
                    main = main2;
                    str2 = strM7749;
                    checkBox2 = checkBox;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m48349(ViewOnClickListenerC21202 viewOnClickListenerC21202) {
        ArrayList arrayListM39467 = null;
        ArrayList arrayList = null;
        C3054 c3054 = null;
        int i = -2066918806;
        int i2 = C3492.f12043;
        int i3 = C1826.f6190;
        int iM2761 = C0619.m2761("ۜܽ") ^ i2;
        int i4 = ((iM2761 ^ i3) * 16853) ^ (-955379511);
        int i5 = 1124373324;
        while (true) {
            i = ((((i ^ i3) * 681) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2080540937:
                case 2123701363:
                    break;
                case -2067873140:
                case 2140756805:
                    C3448.m11253(arrayList);
                    arrayList.addAll(arrayListM39467);
                    if (C1826.f6190 <= 0) {
                        iM2761 = C0773.m3169("ۛܶ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 1661) ^ 99662908;
                        i5 = -1553670084;
                    } else {
                        iM2761 = C0773.m3169("᩷۬") ^ i3;
                        i4 = ((iM2761 ^ i2) * 30793) ^ (-273487020);
                        i5 = -2128879103;
                    }
                    break;
                case -1809548394:
                case 1358091364:
                    arrayListM39467 = C16704.m39467();
                    if (C2834.f9334 <= 0) {
                        iM2761 = (C0619.m2761("ۘ᩵") + i2) * 71;
                        i4 = ((iM2761 ^ i3) * 497) ^ 205710062;
                        i5 = -1305570666;
                    } else {
                        iM2761 = C0619.m2761("ۧ֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * 1433) ^ 336215976;
                        i5 = 1858612596;
                    }
                    break;
                case -1771826004:
                case -657149332:
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0619.m2761("ۗۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6585)) ^ (-358014326);
                        i5 = 862215643;
                    } else {
                        iM2761 = C0619.m2761("ᩳܿ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 19127) ^ 1642277603;
                        i5 = -597601491;
                    }
                    break;
                case -1667902810:
                case -763333841:
                    arrayList = viewOnClickListenerC21202.f67681;
                    if (C2419.m8175(arrayListM39467, arrayList)) {
                        iM2761 = C0619.m2761("۫ۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-8411)) ^ 1231467262;
                        i5 = -1878313118;
                    } else {
                        iM2761 = (C0619.m2761("ᩳۤ") ^ i3) * 19;
                        i4 = ((iM2761 ^ i2) * (-21955)) ^ 970833046;
                        i5 = -106140274;
                    }
                    break;
                case -1485552489:
                case 55581106:
                    c3054.notifyDataSetChanged();
                    viewOnClickListenerC21202.m48359();
                    iM2761 = C0619.m2761("۫ۧ") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-8411)) ^ 1231467262;
                    i5 = -1878313118;
                    break;
                case -1476882115:
                case 1269534193:
                    if (C1080.m4050()) {
                        iM2761 = C0619.m2761("ܿ֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-19581)) ^ (-1645092666);
                        i5 = 1467296430;
                    } else {
                        iM2761 = C0619.m2761("ۢۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-11711)) ^ 2053679493;
                        i5 = 1991914961;
                    }
                    break;
                case -1450864401:
                case 998849500:
                    if (C23916.f77426 <= 0) {
                        iM2761 = (i2 - C0619.m2761("ܰ᩶")) * 65;
                        i4 = ((iM2761 ^ i3) * 14007) ^ 1617641122;
                        i5 = 1094394387;
                    } else {
                        iM2761 = C0773.m3169("ۛܶ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 1661) ^ 99662908;
                        i5 = -1553670084;
                    }
                    break;
                case -1289945356:
                case -436344141:
                    c3054 = viewOnClickListenerC21202.f67689;
                    if (C2375.f7641 <= 0) {
                        iM2761 = (C0619.m2761("ۘ᩵") + i2) * 71;
                        i4 = ((iM2761 ^ i3) * 497) ^ 205710062;
                        i5 = -1305570666;
                    } else {
                        iM2761 = C0619.m2761("ܽۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 19609) ^ 1204765452;
                        i5 = 279339588;
                    }
                    break;
                case -1199088666:
                case 1053167723:
                    if (C1146.f4234 >= 0) {
                        iM2761 = C0773.m3169("ۛܶ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 1661) ^ 99662908;
                        i5 = -1553670084;
                    } else {
                        iM2761 = C0619.m2761("֨ۙ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4119)) ^ (-863061951);
                        i5 = 2091740168;
                    }
                    break;
                case -967467248:
                case 546446323:
                    RunnableC3646.m11813();
                    iM2761 = C0773.m3169("ۛܶ") ^ i3;
                    i4 = ((iM2761 ^ i2) * 1661) ^ 99662908;
                    i5 = -1553670084;
                    break;
                case -947845024:
                case 1531633309:
                    C3099.m10095();
                    C2354.m7983();
                    break;
                case -721054307:
                case 308271732:
                    if (C3779.f12953 > 0) {
                        iM2761 = C0619.m2761("ۗۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6585)) ^ (-358014326);
                        i5 = 862215643;
                    } else {
                        iM2761 = C0773.m3169("ۛܶ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 1661) ^ 99662908;
                        i5 = -1553670084;
                    }
                    break;
                case -489484853:
                case 2101242393:
                    if (C0619.m2763()) {
                        iM2761 = C0619.m2761("ۢۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-11711)) ^ 2053679493;
                        i5 = 1991914961;
                    } else {
                        iM2761 = C0773.m3169("᩺ۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 5055) ^ (-63469904);
                        i5 = 793609660;
                    }
                    break;
                case -236828978:
                case 1348838992:
                    C3690.m11987();
                    if (!RunnableC0334.m2063()) {
                        iM2761 = C0619.m2761("ۢۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-11711)) ^ 2053679493;
                        i5 = 1991914961;
                    } else {
                        iM2761 = C0619.m2761("ۗۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6585)) ^ (-358014326);
                        i5 = 862215643;
                    }
                    break;
                case -121919833:
                case 1149456421:
                    if (C1080.f3865 >= 0) {
                        iM2761 = (C0619.m2761("ۘ᩵") + i2) * 71;
                        i4 = ((iM2761 ^ i3) * 497) ^ 205710062;
                        i5 = -1305570666;
                    } else {
                        iM2761 = C0773.m3169("֫ۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 27463) ^ 1898654069;
                        i5 = 2094948183;
                    }
                    break;
                case 406575648:
                case 1797160679:
                    if (C3448.m11248() != 0) {
                        iM2761 = (i2 - C0619.m2761("ܰ᩶")) * 65;
                        i4 = ((iM2761 ^ i3) * 14007) ^ 1617641122;
                        i5 = 1094394387;
                    } else {
                        iM2761 = C0619.m2761("ܿۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-5559)) ^ 49389571;
                        i5 = -886912736;
                    }
                    break;
                default:
                    if (C3779.f12953 <= 0) {
                        iM2761 = C0619.m2761("ۗۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6585)) ^ (-358014326);
                        i5 = 862215643;
                    } else {
                        iM2761 = C0619.m2761("ۤ᩹") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-31517)) ^ 2048490712;
                        i5 = -126873260;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m48357(ViewOnClickListenerC21202 viewOnClickListenerC21202, CheckBox checkBox) {
        int i;
        int i2;
        Object obj;
        int iM2761;
        int i3;
        int iM2762;
        int i4;
        int iM3169;
        int i5;
        int i6;
        int iM2763;
        int i7;
        View.OnClickListener onClickListener;
        int i8;
        int i9;
        InterfaceC9801 interfaceC9801;
        Object obj2;
        View view;
        View.OnClickListener onClickListener2;
        int i10;
        int i11;
        int i12;
        final CheckBox checkBox2 = checkBox;
        int i13 = C0773.f2792;
        int i14 = C0487.f2131;
        int iM31610 = C0773.m3169("ۢۨ") ^ i14;
        int i15 = ((iM31610 ^ i13) * 29433) ^ 1879463260;
        String strM48350 = null;
        View.OnClickListener onClickListener3 = null;
        DialogInterface.OnClickListener onClickListener4 = null;
        String strM8881 = null;
        String strM10047 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i16 = iM31610 ^ (-1074603046);
        int i17 = 0;
        short s = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = -907397216;
        int i24 = 0;
        InterfaceC9801 interfaceC9802 = null;
        Object obj3 = null;
        DialogInterfaceOnClickListenerC3302 dialogInterfaceOnClickListenerC3302 = null;
        String strM13530 = null;
        int i25 = 0;
        final C23255 c23255 = null;
        C2361 c2361M3794 = null;
        int i26 = 0;
        View viewM9942 = null;
        Main main = null;
        View view2 = null;
        short[] sArr4 = null;
        while (true) {
            i23 = i16 ^ (i15 & (((i23 ^ i13) * 18995) >> 31));
            switch (i23) {
                case -2114288672:
                case -451315701:
                    i17 = 22018;
                    iM3169 = C0619.m2761("ۢ᩸") ^ i14;
                    i15 = ((iM3169 ^ i13) * 31769) ^ (-1653303812);
                    i5 = -1033110053;
                    i6 = iM3169 ^ i5;
                    main = main;
                    i24 = i24;
                    i21 = i21;
                    interfaceC9802 = interfaceC9802;
                    onClickListener3 = onClickListener3;
                    obj3 = obj3;
                    i16 = i6;
                    checkBox2 = checkBox;
                    break;
                case -2060560781:
                case -169516829:
                    obj3 = obj3;
                    interfaceC9802 = interfaceC9802;
                    onClickListener3 = onClickListener3;
                    main = main;
                    i21 = i21;
                    i24 = i24;
                    if (i18 - ((s * s) + 279658729) <= 0) {
                        iM3169 = C0773.m3169("ۖۨ") ^ i14;
                        i15 = ((iM3169 ^ i13) * (-2643)) ^ (-710011816);
                        i5 = 1632403824;
                    } else {
                        iM3169 = (i13 - C0619.m2761("ܰ᩻")) * 39;
                        i15 = ((iM3169 ^ i14) * (-25399)) ^ 488671729;
                        i5 = -201005902;
                    }
                    i6 = iM3169 ^ i5;
                    main = main;
                    i24 = i24;
                    i21 = i21;
                    interfaceC9802 = interfaceC9802;
                    onClickListener3 = onClickListener3;
                    obj3 = obj3;
                    i16 = i6;
                    checkBox2 = checkBox;
                    break;
                case -2050923611:
                case 1716014084:
                    obj = obj3;
                    view = view2;
                    onClickListener2 = onClickListener3;
                    i10 = i24;
                    sArr = f67679;
                    i22 = MLKEMEngine.KyberPolyBytes;
                    i11 = 3;
                    if (AbstractC0641.f2496 < 0) {
                        view2 = view;
                        int iM2764 = C0619.m2761("ᩳۤ") ^ i14;
                        int i27 = ((iM2764 ^ i13) * 6623) ^ 2081113226;
                        i6 = iM2764 ^ 456546740;
                        i15 = i27;
                        onClickListener3 = onClickListener2;
                        i24 = i10;
                        obj3 = obj;
                        i21 = 3;
                        i16 = i6;
                        checkBox2 = checkBox;
                    }
                    int iM2765 = C0619.m2761("᩹֫") ^ i13;
                    view2 = view;
                    i12 = ((iM2765 ^ i14) * 14499) ^ 909729021;
                    onClickListener3 = onClickListener2;
                    i24 = i10;
                    obj3 = obj;
                    i21 = i11;
                    i16 = iM2765 ^ (-991282231);
                    i15 = i12;
                    checkBox2 = checkBox;
                    break;
                case -1971338001:
                case 1132991787:
                    C11235.m28307(c2361M3794, C0773.m3169(C0950.m3780(sArr4, 396, 3, i17)) ^ 2130457583, onClickListener4);
                    C3099.m10090(c2361M3794);
                    break;
                case -1966277395:
                case 715072427:
                    obj3 = obj3;
                    interfaceC9802 = interfaceC9802;
                    onClickListener3 = onClickListener3;
                    i21 = i21;
                    i24 = i24;
                    viewM9942 = RunnableC3055.m9942(main, i19 ^ i20);
                    main = main;
                    strM8881 = C2702.m8881(f67679, 363, 3, i17);
                    if (C3998.f13671 == 0) {
                        iM3169 = (C0773.m3169("ۡ᩶") + i14) * 39;
                        i15 = ((iM3169 ^ i13) * (-18229)) ^ (-883722903);
                        i5 = -520040690;
                        i6 = iM3169 ^ i5;
                        main = main;
                        i24 = i24;
                        i21 = i21;
                        interfaceC9802 = interfaceC9802;
                        onClickListener3 = onClickListener3;
                        obj3 = obj3;
                        i16 = i6;
                        checkBox2 = checkBox;
                    } else {
                        main = main;
                        int iM31611 = (i13 - C0773.m3169("۟ۛ")) * (-99);
                        i15 = ((iM31611 ^ i14) * 14453) ^ (-316975598);
                        i6 = iM31611 ^ (-1754125775);
                        interfaceC9802 = interfaceC9802;
                        i24 = i24;
                        i21 = i21;
                        onClickListener3 = onClickListener3;
                        obj3 = obj3;
                        i16 = i6;
                        checkBox2 = checkBox;
                    }
                    break;
                case -1770856919:
                case 229327522:
                    RunnableC1848.m6359(c2361M3794, C0619.m2761(AbstractC0116.m1236(sArr3, i25, i26, i17)) ^ 2119734607, obj3);
                    iM2762 = C0619.m2761("᩻۠") ^ i13;
                    i = ((iM2762 ^ i14) * (-32237)) ^ 2002019273;
                    i4 = -1088645906;
                    i16 = iM2762 ^ i4;
                    i15 = i;
                    break;
                case -1768655105:
                case -672126436:
                    Object obj4 = obj3;
                    View.OnClickListener onClickListener5 = onClickListener3;
                    C11235.m28299(C2834.m9333(viewM9942, C0619.m2761(strM13530) ^ 2124594827), onClickListener5);
                    int iM2766 = C0619.m2761("ۗ᩺") ^ i13;
                    sArr = sArr;
                    i15 = ((iM2766 ^ i14) * (-19281)) ^ (-1621358961);
                    onClickListener3 = onClickListener5;
                    i24 = i24;
                    obj3 = obj4;
                    i16 = iM2766 ^ 349624878;
                    i21 = i21;
                    checkBox2 = checkBox;
                    break;
                case -1629397672:
                case 425603958:
                    obj3 = obj3;
                    int i28 = i21;
                    onClickListener3 = onClickListener3;
                    i24 = i24;
                    i21 = i28;
                    strM13530 = C4238.m13530(f67679, 381, 3, i17);
                    if (C0950.m3785() == 0) {
                        iM2763 = C0619.m2761("ܽܶ") ^ i14;
                        i15 = ((iM2763 ^ i13) * (-401)) ^ 304756155;
                        i7 = -2115643778;
                        i6 = iM2763 ^ i7;
                        i24 = i24;
                        i21 = i21;
                        onClickListener3 = onClickListener3;
                        obj3 = obj3;
                        i16 = i6;
                        checkBox2 = checkBox;
                    } else {
                        i24 = i24;
                        int iM2767 = (C0619.m2761("۫ܿ") + i13) * 41;
                        i15 = ((iM2767 ^ i14) * 8203) ^ (-1333858090);
                        i6 = iM2767 ^ 1101464680;
                        i21 = i21;
                        onClickListener3 = onClickListener3;
                        obj3 = obj3;
                        i16 = i6;
                        checkBox2 = checkBox;
                    }
                    break;
                case -1521455529:
                case 205792381:
                    int i29 = i21;
                    short[] sArr5 = sArr;
                    int i30 = i22;
                    View viewM11246 = C3448.m11246(viewM9942, C0773.m3169(C23916.m53420(sArr5, i30, i29, i17)) ^ 2130425255);
                    int iM2768 = (C0619.m2761("ᩴۨ") ^ i14) * (-9);
                    int i31 = ((iM2768 ^ i13) * 7705) ^ 356854006;
                    onClickListener3 = onClickListener3;
                    i24 = i24;
                    obj3 = obj3;
                    i21 = i29;
                    i16 = iM2768 ^ 200163662;
                    sArr = sArr5;
                    i15 = i31;
                    checkBox2 = checkBox;
                    view2 = viewM11246;
                    i22 = i30;
                    break;
                case -1467793276:
                case 559787239:
                    obj3 = obj3;
                    interfaceC9802 = interfaceC9802;
                    onClickListener3 = onClickListener3;
                    main = main;
                    i21 = i21;
                    i24 = i24;
                    s = f67679[359];
                    i18 = s * 33446;
                    iM3169 = C0773.m3169("ۛۚ") ^ i13;
                    i15 = ((iM3169 ^ i14) * 11217) ^ (-192489762);
                    i5 = -139397755;
                    i6 = iM3169 ^ i5;
                    main = main;
                    i24 = i24;
                    i21 = i21;
                    interfaceC9802 = interfaceC9802;
                    onClickListener3 = onClickListener3;
                    obj3 = obj3;
                    i16 = i6;
                    checkBox2 = checkBox;
                    break;
                case -1420698748:
                case 438554765:
                    C4238.m13540();
                    break;
                case -1265477664:
                case 228938045:
                    if (AbstractC0641.f2496 < 0) {
                        obj = obj3;
                        i11 = i21;
                        view = view2;
                        onClickListener2 = onClickListener3;
                        i10 = i24;
                        int iM2769 = C0619.m2761("᩹֫") ^ i13;
                        view2 = view;
                        i12 = ((iM2769 ^ i14) * 14499) ^ 909729021;
                        onClickListener3 = onClickListener2;
                        i24 = i10;
                        obj3 = obj;
                        i21 = i11;
                        i16 = iM2769 ^ (-991282231);
                        i15 = i12;
                        checkBox2 = checkBox;
                    }
                    obj3 = obj3;
                    onClickListener3 = onClickListener3;
                    i21 = i21;
                    int iM27610 = (C0619.m2761("۫ܿ") + i13) * 41;
                    i15 = ((iM27610 ^ i14) * 8203) ^ (-1333858090);
                    i6 = iM27610 ^ 1101464680;
                    i21 = i21;
                    onClickListener3 = onClickListener3;
                    obj3 = obj3;
                    i16 = i6;
                    checkBox2 = checkBox;
                    break;
                case -1233684174:
                case 115294790:
                    if (!C3077.f9998) {
                        obj3 = obj3;
                        interfaceC9802 = interfaceC9802;
                        onClickListener3 = onClickListener3;
                        i21 = i21;
                        i24 = i24;
                        int iM31612 = (i13 - C0773.m3169("۟ۛ")) * (-99);
                        i15 = ((iM31612 ^ i14) * 14453) ^ (-316975598);
                        i6 = iM31612 ^ (-1754125775);
                        interfaceC9802 = interfaceC9802;
                        i24 = i24;
                        i21 = i21;
                        onClickListener3 = onClickListener3;
                        obj3 = obj3;
                        i16 = i6;
                        checkBox2 = checkBox;
                    }
                    obj3 = obj3;
                    onClickListener3 = onClickListener3;
                    i21 = i21;
                    int iM27611 = (C0619.m2761("۫ܿ") + i13) * 41;
                    i15 = ((iM27611 ^ i14) * 8203) ^ (-1333858090);
                    i6 = iM27611 ^ 1101464680;
                    i21 = i21;
                    onClickListener3 = onClickListener3;
                    obj3 = obj3;
                    i16 = i6;
                    checkBox2 = checkBox;
                    break;
                case -1218838207:
                case -14134385:
                    strM48350 = m48350();
                    interfaceC9801 = interfaceC9802;
                    obj2 = obj3;
                    onClickListener = onClickListener3;
                    i8 = i21;
                    i9 = i24;
                    int iM27612 = C0619.m2761("ۙۤ") ^ i14;
                    i15 = ((iM27612 ^ i13) * (-16823)) ^ 312815500;
                    i16 = iM27612 ^ (-252641587);
                    checkBox2 = checkBox;
                    i24 = i9;
                    i21 = i8;
                    onClickListener3 = onClickListener;
                    obj3 = obj2;
                    interfaceC9802 = interfaceC9801;
                    break;
                case -966341492:
                case 82697706:
                    onClickListener = onClickListener3;
                    i8 = i21;
                    i9 = i24;
                    interfaceC9801 = interfaceC9802;
                    String strM7758 = C2288.m7758(interfaceC9801, C11235.m28300(f67679, 366, 15, i17), null);
                    if (strM7758 == null) {
                        int iM27613 = C0619.m2761("ᩴ᩵") ^ i14;
                        i15 = ((iM27613 ^ i13) * (-21117)) ^ 926484830;
                        i16 = iM27613 ^ (-1607989032);
                        checkBox2 = checkBox;
                        interfaceC9802 = interfaceC9801;
                        i24 = i9;
                        i21 = i8;
                        onClickListener3 = onClickListener;
                        obj3 = null;
                    } else {
                        strM48350 = strM7758;
                        obj2 = null;
                        int iM27614 = C0619.m2761("ۙۤ") ^ i14;
                        i15 = ((iM27614 ^ i13) * (-16823)) ^ 312815500;
                        i16 = iM27614 ^ (-252641587);
                        checkBox2 = checkBox;
                        i24 = i9;
                        i21 = i8;
                        onClickListener3 = onClickListener;
                        obj3 = obj2;
                        interfaceC9802 = interfaceC9801;
                    }
                    break;
                case -900220109:
                case 579413288:
                    obj3 = obj3;
                    int i32 = i24;
                    onClickListener3 = onClickListener3;
                    C11235.m28299(C3448.m11246(viewM9942, C0619.m2761(C1564.m5510(sArr2, i32, 3, i17)) ^ 2124378857), onClickListener3);
                    if (C0487.f2131 > 0) {
                        int iM31613 = (C0773.m3169("ۜܳ") + i13) * (-123);
                        i12 = ((iM31613 ^ i14) * (-22681)) ^ 2055214033;
                        i24 = i32;
                        onClickListener3 = onClickListener3;
                        obj3 = obj3;
                        i16 = iM31613 ^ (-30367902);
                        i15 = i12;
                        checkBox2 = checkBox;
                    } else {
                        i21 = i21;
                        i24 = i32;
                        iM2763 = C0619.m2761("ۢܰ") ^ i14;
                        i15 = ((iM2763 ^ i13) * (-30583)) ^ (-1544809878);
                        i7 = 450153131;
                        i6 = iM2763 ^ i7;
                        i24 = i24;
                        i21 = i21;
                        onClickListener3 = onClickListener3;
                        obj3 = obj3;
                        i16 = i6;
                        checkBox2 = checkBox;
                    }
                    break;
                case -849594728:
                case -410950914:
                    String str = strM48350;
                    C0269.m1786(c23255, str);
                    C0950.m3788(c23255, c23255.m54099());
                    View.OnClickListener onClickListener6 = new View.OnClickListener() { // from class: l.᩹ۡۤ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            TextView textView = null;
                            CharSequence charSequenceM4230 = null;
                            String strM4058 = null;
                            C23255 c23256 = null;
                            int iM10042 = 0;
                            int iM6961 = 0;
                            int iM10045 = 0;
                            int i33 = 144552970;
                            int i34 = C1321.f4751;
                            int i35 = AbstractC0116.f1064;
                            int iM27615 = C0619.m2761("ۡ֨") ^ i35;
                            int i36 = ((iM27615 ^ i34) * (-17925)) ^ 784165477;
                            int i37 = -613300922;
                            while (true) {
                                i33 = ((((i33 ^ i34) * 28399) >> 31) & i36) ^ (iM27615 ^ i37);
                                switch (i33) {
                                    case -1829925893:
                                    case -1051320977:
                                        if (C2966.m9664()) {
                                            iM27615 = (C0773.m3169("ۜۜ") ^ i35) * (-107);
                                            i36 = ((iM27615 ^ i34) * (-24307)) ^ 1977728452;
                                            i37 = 1334338228;
                                        } else {
                                            iM27615 = (C0773.m3169("ۘᩳ") + i35) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i36 = ((iM27615 ^ i34) * 12659) ^ (-1689392240);
                                            i37 = -2135835777;
                                        }
                                        break;
                                    case -1686387145:
                                    case 149841496:
                                        if (C2375.f7641 <= 0) {
                                            iM27615 = (C0773.m3169("ۘᩳ") + i35) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i36 = ((iM27615 ^ i34) * 12659) ^ (-1689392240);
                                            i37 = -2135835777;
                                        } else {
                                            iM27615 = (i35 - C0619.m2761("᩹ۘ")) * (-123);
                                            i36 = ((iM27615 ^ i34) * (-24143)) ^ (-398229130);
                                            i37 = -75223477;
                                        }
                                        break;
                                    case -1607293353:
                                    case 1620405744:
                                        C2834.m9344();
                                        C1783.m6232();
                                        break;
                                    case -957807246:
                                    case 676496153:
                                        iM10045 = C3077.m10045(strM4058);
                                        if (C1542.f5343 <= 0) {
                                            iM27615 = C0619.m2761("۟ۛ") ^ i34;
                                            i36 = ((iM27615 ^ i35) * 11117) ^ 535319256;
                                            i37 = 111846128;
                                        } else {
                                            iM27615 = C0619.m2761("ܶܳ") ^ i35;
                                            i36 = ((iM27615 ^ i34) * (-6647)) ^ (-1372963001);
                                            i37 = -449792550;
                                        }
                                        break;
                                    case -891350819:
                                    case 1499127516:
                                        C2354.m7983();
                                        if (!RunnableC3646.f12471) {
                                            iM27615 = (i34 - C0619.m2761("ܶ۬")) * (-55);
                                            i36 = ((iM27615 ^ i35) * (-31557)) ^ (-1346551644);
                                            i37 = 411951641;
                                        } else {
                                            iM27615 = (C0773.m3169("ۤ۠") ^ i34) * (-105);
                                            i36 = ((iM27615 ^ i35) * 15295) ^ (-172168002);
                                            i37 = 598338901;
                                        }
                                        break;
                                    case -859680781:
                                    case -512216056:
                                        AbstractC0116.m1233(c23256).replace(iM10042, iM6961, strM4058);
                                        if (C3734.f12817 >= 0) {
                                            iM27615 = C0619.m2761("۟ۛ") ^ i34;
                                            i36 = ((iM27615 ^ i35) * 11117) ^ 535319256;
                                            i37 = 111846128;
                                        } else {
                                            iM27615 = C0619.m2761("ܿۙ") ^ i34;
                                            i36 = ((iM27615 ^ i35) * 29245) ^ 1351667298;
                                            i37 = -1899316456;
                                        }
                                        break;
                                    case -783126062:
                                    case -511591792:
                                        charSequenceM4230 = C1146.m4230(textView);
                                        if (C2966.f9654 >= 0) {
                                            iM27615 = (C0619.m2761("᩵᩶") + i35) * (-79);
                                            i36 = ((iM27615 ^ i34) * (-28553)) ^ 1060996891;
                                            i37 = -533679727;
                                        } else {
                                            iM27615 = (C0773.m3169("ۙ֫") ^ i35) * (-111);
                                            i36 = ((iM27615 ^ i34) * 20179) ^ 761079204;
                                            i37 = 1399625519;
                                        }
                                        break;
                                    case -663498457:
                                    case -555652003:
                                        iM10042 = C3077.m10042(c23256);
                                        iM6961 = C2023.m6961(c23256);
                                        if (iM10042 > iM6961) {
                                            iM6961 = iM10042;
                                            iM10042 = iM6961;
                                        }
                                        iM27615 = (C0619.m2761("ܰۧ") + i35) * (-3);
                                        i36 = ((iM27615 ^ i34) * (-26659)) ^ 1298257943;
                                        i37 = 1063393876;
                                        break;
                                    case -562747269:
                                    case 768908788:
                                        C4238.m13540();
                                        if (C1519.f5300 >= 0) {
                                            iM27615 = (C0773.m3169("ۘᩳ") + i35) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i36 = ((iM27615 ^ i34) * 12659) ^ (-1689392240);
                                            i37 = -2135835777;
                                        } else {
                                            iM27615 = (C0773.m3169("ۤ۠") ^ i34) * (-105);
                                            i36 = ((iM27615 ^ i35) * 15295) ^ (-172168002);
                                            i37 = 598338901;
                                        }
                                        break;
                                    case -546315747:
                                    case 441904920:
                                        if (C2023.f6737) {
                                            iM27615 = (C0773.m3169("ۘᩳ") + i35) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i36 = ((iM27615 ^ i34) * 12659) ^ (-1689392240);
                                            i37 = -2135835777;
                                        } else {
                                            iM27615 = (C0619.m2761("ۧܿ") ^ i35) * (-47);
                                            i36 = ((iM27615 ^ i34) * 3811) ^ (-949955773);
                                            i37 = 1470977257;
                                        }
                                        break;
                                    case -517034277:
                                    case 1238111702:
                                        C0950.m3788(c23256, iM10045 + iM10042);
                                        break;
                                    case -47348998:
                                    case 2102860582:
                                        textView = (TextView) view3;
                                        if (C1826.f6190 <= 0) {
                                            iM27615 = (C0773.m3169("ۘᩳ") + i35) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i36 = ((iM27615 ^ i34) * 12659) ^ (-1689392240);
                                            i37 = -2135835777;
                                        } else {
                                            iM27615 = C0619.m2761("᩺ۢ") ^ i34;
                                            i36 = ((iM27615 ^ i35) * 16729) ^ 2070466005;
                                            i37 = 2009699585;
                                        }
                                        break;
                                    case 48812433:
                                    case 1645852509:
                                        if (C1343.f4799 != 0) {
                                            iM27615 = C0619.m2761("۟ۛ") ^ i34;
                                            i36 = ((iM27615 ^ i35) * 11117) ^ 535319256;
                                            i37 = 111846128;
                                        } else {
                                            iM27615 = C0773.m3169("᩷ܰ") ^ i34;
                                            i36 = ((iM27615 ^ i35) * (-32571)) ^ (-804908094);
                                            i37 = 1741552013;
                                        }
                                        break;
                                    case 832984272:
                                    case 1463827580:
                                        if (C3734.f12817 < 0) {
                                            iM27615 = (C0773.m3169("ۤ۠") ^ i34) * (-105);
                                            i36 = ((iM27615 ^ i35) * 15295) ^ (-172168002);
                                            i37 = 598338901;
                                        } else {
                                            iM27615 = C0619.m2761("۟ۛ") ^ i34;
                                            i36 = ((iM27615 ^ i35) * 11117) ^ 535319256;
                                            i37 = 111846128;
                                        }
                                        break;
                                    case 1703073025:
                                    case 2104255402:
                                        strM4058 = C1080.m4058(charSequenceM4230);
                                        c23256 = c23255;
                                        if (C2966.f9654 >= 0) {
                                            iM27615 = (i34 - C0619.m2761("ܶ۬")) * (-55);
                                            i36 = ((iM27615 ^ i35) * (-31557)) ^ (-1346551644);
                                            i37 = 411951641;
                                        } else {
                                            iM27615 = (i34 - C0773.m3169("᩺᩻")) * 41;
                                            i36 = ((iM27615 ^ i35) * 6039) ^ 1385011808;
                                            i37 = 1930786071;
                                        }
                                        break;
                                    case 1775588141:
                                    case 1972314931:
                                        if (C23916.f77426 <= 0) {
                                            iM27615 = C0619.m2761("۟ۛ") ^ i34;
                                            i36 = ((iM27615 ^ i35) * 11117) ^ 535319256;
                                            i37 = 111846128;
                                        } else {
                                            iM27615 = C0773.m3169("֡ۢ") ^ i34;
                                            i36 = ((iM27615 ^ i35) * (-20705)) ^ 2023862742;
                                            i37 = -1536115829;
                                        }
                                        break;
                                    default:
                                        C1321.m4852();
                                        iM27615 = C0619.m2761("۟ۛ") ^ i34;
                                        i36 = ((iM27615 ^ i35) * 11117) ^ 535319256;
                                        i37 = 111846128;
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    int iM27615 = (i13 - C0619.m2761("ܳ۬")) * (-65);
                    strM48350 = str;
                    i24 = i24;
                    i21 = i21;
                    checkBox2 = checkBox;
                    onClickListener3 = onClickListener6;
                    i15 = ((iM27615 ^ i14) * 29739) ^ (-375626410);
                    obj3 = obj3;
                    i16 = iM27615 ^ 2065470504;
                    break;
                case -847128702:
                case -595162921:
                    onClickListener4 = new DialogInterface.OnClickListener() { // from class: l.᩵ۡۤ

                        /* JADX INFO: renamed from: ۖۡۧ, reason: not valid java name and contains not printable characters */
                        private static final short[] f65505 = {6486, 29552, 29559, 29555, 29564, 29562, 29549, 29510, 29557, 29558, 29566, 29510, 29545, 29560, 29549, 29553};

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i33) {
                            InterfaceC18752 interfaceC18752M11489 = null;
                            String strM11996 = null;
                            boolean z = false;
                            short[] sArr6 = null;
                            short s2 = 0;
                            int i34 = 0;
                            int i35 = 0;
                            short[] sArr7 = null;
                            int i36 = 0;
                            int i37 = 16023952;
                            int i38 = C3448.f11240;
                            int i39 = C4238.f15451;
                            int iM27616 = (C0619.m2761("ۤ᩵") + i39) * (-49);
                            int i40 = ((iM27616 ^ i38) * 16347) ^ 996852607;
                            int i41 = -341765901;
                            while (true) {
                                i37 = ((((i37 ^ i38) * (-21375)) >> 31) & i40) ^ (iM27616 ^ i41);
                                switch (i37) {
                                    case -1879834043:
                                    case -1529356211:
                                        i35 = 63480;
                                        iM27616 = (i39 - C0773.m3169("ܿ֫")) * 123;
                                        i40 = ((iM27616 ^ i38) * 3385) ^ (-956373385);
                                        i41 = 50181852;
                                        break;
                                    case -1789204883:
                                    case -788346668:
                                        if (C1343.m4943()) {
                                            iM27616 = C0773.m3169("ܺܰ") ^ i38;
                                            i40 = ((iM27616 ^ i39) * (-15065)) ^ (-1452002284);
                                            i41 = 1982134824;
                                        } else {
                                            iM27616 = (C0773.m3169("ۧۧ") + i39) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i40 = ((iM27616 ^ i38) * 30985) ^ (-846463129);
                                            i41 = -829280607;
                                        }
                                        break;
                                    case -1636982344:
                                    case -536045949:
                                        sArr6 = f65505;
                                        if (C3734.f12817 >= 0) {
                                            iM27616 = (C0773.m3169("ۧۧ") + i39) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i40 = ((iM27616 ^ i38) * 30985) ^ (-846463129);
                                            i41 = -829280607;
                                        } else {
                                            iM27616 = C0619.m2761("᩶ᩴ") ^ i39;
                                            i40 = ((iM27616 ^ i38) * (-25769)) ^ (-1847908211);
                                            i41 = 2036707215;
                                        }
                                        break;
                                    case -1500200856:
                                    case -146708666:
                                        C0269.m1775();
                                        RunnableC3055.m9933();
                                        break;
                                    case -1334470683:
                                    case -62367898:
                                        i34 = (s2 * s2) + 1653796;
                                        if (C20932.f66974 <= 0) {
                                            iM27616 = C0619.m2761("۟۬") ^ i38;
                                            i40 = ((iM27616 ^ i39) * 11905) ^ (-1726661305);
                                            i41 = -1891313035;
                                        } else {
                                            iM27616 = (C0773.m3169("֫ܳ") ^ i39) * 59;
                                            i40 = ((iM27616 ^ i38) * (-11315)) ^ (-1848086755);
                                            i41 = -101653399;
                                        }
                                        break;
                                    case -1235370402:
                                    case -525915723:
                                        C1146.m4231();
                                        if (C4282.f15546 > 0) {
                                            iM27616 = (C0619.m2761("۬ᩴ") ^ i39) * (-109);
                                            i40 = ((iM27616 ^ i38) * 79) ^ (-412608723);
                                            i41 = 18702722;
                                        } else {
                                            iM27616 = C0619.m2761("۟۬") ^ i38;
                                            i40 = ((iM27616 ^ i39) * 11905) ^ (-1726661305);
                                            i41 = -1891313035;
                                        }
                                        break;
                                    case -1225201467:
                                    case 2088563982:
                                        if (C3779.f12953 <= 0) {
                                            iM27616 = C0619.m2761("۫ܳ") ^ i38;
                                            i40 = ((iM27616 ^ i39) * 4341) ^ (-1714800968);
                                            i41 = 149833915;
                                        } else {
                                            iM27616 = (C0773.m3169("᩺ۨ") + i39) * 75;
                                            i40 = ((iM27616 ^ i38) * 3383) ^ (-515529164);
                                            i41 = 503021712;
                                        }
                                        break;
                                    case -1136658250:
                                    case 1835282319:
                                        C11235.m28308(interfaceC18752M11489.remove(strM11996));
                                        z = false;
                                        if (C2966.f9654 >= 0) {
                                            iM27616 = C0619.m2761("۟۬") ^ i38;
                                            i40 = ((iM27616 ^ i39) * 11905) ^ (-1726661305);
                                            i41 = -1891313035;
                                        } else {
                                            iM27616 = (i38 - C0773.m3169("ۗۨ")) * 109;
                                            i40 = ((iM27616 ^ i39) * (-9445)) ^ (-1468015491);
                                            i41 = -1041505826;
                                        }
                                        break;
                                    case -882504973:
                                    case 1012006661:
                                        interfaceC18752M11489 = C3492.m11489(ApplicationC17729.f58258);
                                        sArr7 = f65505;
                                        if (C2310.m7813() <= 0) {
                                            iM27616 = C0619.m2761("۫ܳ") ^ i38;
                                            i40 = ((iM27616 ^ i39) * 4341) ^ (-1714800968);
                                            i41 = 149833915;
                                        } else {
                                            iM27616 = (C0619.m2761("ۘۖ") + i38) * (-65);
                                            i40 = ((iM27616 ^ i39) * (-28539)) ^ 1810627613;
                                            i41 = -270148586;
                                        }
                                        break;
                                    case -808330216:
                                    case 2072633394:
                                        s2 = sArr6[0];
                                        if (AbstractC3624.f12429 <= 0) {
                                            iM27616 = C0619.m2761("ۤܰ") ^ i39;
                                            i40 = ((iM27616 ^ i38) * (-4365)) ^ 810882458;
                                            i41 = -1858738515;
                                        } else {
                                            iM27616 = (i38 - C0773.m3169("᩹᩺")) * 123;
                                            i40 = ((iM27616 ^ i39) * (-22987)) ^ 933084453;
                                            i41 = 698550530;
                                        }
                                        break;
                                    case -646968256:
                                    case -2611204:
                                        i35 = 29465;
                                        iM27616 = (i39 - C0773.m3169("ܿ֫")) * 123;
                                        i40 = ((iM27616 ^ i38) * 3385) ^ (-956373385);
                                        i41 = 50181852;
                                        break;
                                    case -440545006:
                                    case -285003018:
                                        if ((s2 * 2572) - i34 > 0) {
                                            iM27616 = C0619.m2761("֫ۚ") ^ i39;
                                            i40 = ((iM27616 ^ i38) * (-19593)) ^ (-1702661368);
                                            i41 = 308308971;
                                        } else {
                                            iM27616 = (i38 - C0619.m2761("ۜ۬")) * 41;
                                            i40 = ((iM27616 ^ i39) * (-1653)) ^ (-1581245767);
                                            i41 = -864801926;
                                        }
                                        break;
                                    case -412386390:
                                    case -316782827:
                                        if (C11235.f35427 >= 0) {
                                            iM27616 = C0619.m2761("ۤܰ") ^ i39;
                                            i40 = ((iM27616 ^ i38) * (-4365)) ^ 810882458;
                                            i41 = -1858738515;
                                        } else {
                                            iM27616 = C0619.m2761("֫ۧ") ^ i38;
                                            i40 = ((iM27616 ^ i39) * 7221) ^ (-1306302684);
                                            i41 = 1588716287;
                                        }
                                        break;
                                    case -353721526:
                                    case 1084623262:
                                        i36 = 1;
                                        if (C2375.f7641 <= 0) {
                                            iM27616 = (C0619.m2761("۬ᩴ") ^ i39) * (-109);
                                            i40 = ((iM27616 ^ i38) * 79) ^ (-412608723);
                                            i41 = 18702722;
                                        } else {
                                            iM27616 = C0773.m3169("ۖ۫") ^ i38;
                                            i40 = ((iM27616 ^ i39) * (-27831)) ^ (-386033476);
                                            i41 = -820295609;
                                        }
                                        break;
                                    case 101518370:
                                    case 659697204:
                                        strM11996 = C3690.m11996(sArr7, i36, 15, i35);
                                        if (C2288.f7433 <= 0) {
                                            iM27616 = C0619.m2761("۫ܳ") ^ i38;
                                            i40 = ((iM27616 ^ i39) * 4341) ^ (-1714800968);
                                            i41 = 149833915;
                                        } else {
                                            iM27616 = C0619.m2761("᩺ۚ") ^ i39;
                                            i40 = ((iM27616 ^ i38) * 9067) ^ (-1243944548);
                                            i41 = 176946751;
                                        }
                                        break;
                                    case 662832968:
                                    case 1597293131:
                                        RunnableC3646.m11813();
                                        if (C2834.f9334 > 0) {
                                            iM27616 = C0619.m2761("۫ܳ") ^ i38;
                                            i40 = ((iM27616 ^ i39) * 4341) ^ (-1714800968);
                                            i41 = 149833915;
                                        } else {
                                            iM27616 = C0619.m2761("۟۬") ^ i38;
                                            i40 = ((iM27616 ^ i39) * 11905) ^ (-1726661305);
                                            i41 = -1891313035;
                                        }
                                        break;
                                    case 849572977:
                                    case 883303015:
                                        C3492.m11488();
                                        if (C2288.f7433 <= 0) {
                                            iM27616 = C0619.m2761("۟۬") ^ i38;
                                            i40 = ((iM27616 ^ i39) * 11905) ^ (-1726661305);
                                            i41 = -1891313035;
                                        } else {
                                            iM27616 = (C0773.m3169("ۧۧ") + i39) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i40 = ((iM27616 ^ i38) * 30985) ^ (-846463129);
                                            i41 = -829280607;
                                        }
                                        break;
                                    case 1728953662:
                                    case 1819387675:
                                        AbstractC0116.m1243();
                                        iM27616 = (C0773.m3169("ۧۧ") + i39) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                        i40 = ((iM27616 ^ i38) * 30985) ^ (-846463129);
                                        i41 = -829280607;
                                        break;
                                    default:
                                        C1519.m5405(checkBox2, z);
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    sArr4 = f67679;
                    if (C1564.m5509() > 0) {
                        iM2762 = C0619.m2761("ۧۨ") ^ i14;
                        i = ((iM2762 ^ i13) * (-4415)) ^ 841576084;
                        i4 = -1660002538;
                        i16 = iM2762 ^ i4;
                        i15 = i;
                    } else {
                        obj3 = obj3;
                        onClickListener3 = onClickListener3;
                        i21 = i21;
                        int iM27616 = (C0619.m2761("۫ܿ") + i13) * 41;
                        i15 = ((iM27616 ^ i14) * 8203) ^ (-1333858090);
                        i6 = iM27616 ^ 1101464680;
                        i21 = i21;
                        onClickListener3 = onClickListener3;
                        obj3 = obj3;
                        i16 = i6;
                        checkBox2 = checkBox;
                    }
                    break;
                case -719694571:
                case 1429470950:
                    obj3 = obj3;
                    interfaceC9802 = interfaceC9802;
                    onClickListener3 = onClickListener3;
                    i21 = i21;
                    i24 = i24;
                    Main main2 = viewOnClickListenerC21202.f67686;
                    int iM31614 = C0773.m3169(C2834.m9343(f67679, 360, 3, i17));
                    i20 = 2125400856;
                    if (C3448.f11240 >= 0) {
                        main = main2;
                        i19 = iM31614;
                        int iM31615 = (i13 - C0773.m3169("۟ۛ")) * (-99);
                        i15 = ((iM31615 ^ i14) * 14453) ^ (-316975598);
                        i6 = iM31615 ^ (-1754125775);
                        interfaceC9802 = interfaceC9802;
                        i24 = i24;
                        i21 = i21;
                        onClickListener3 = onClickListener3;
                        obj3 = obj3;
                        i16 = i6;
                    } else {
                        int iM31616 = (i13 - C0773.m3169("ۗۛ")) * 109;
                        interfaceC9802 = interfaceC9802;
                        i24 = i24;
                        i21 = i21;
                        onClickListener3 = onClickListener3;
                        obj3 = obj3;
                        i16 = iM31616 ^ (-410841270);
                        i15 = ((iM31616 ^ i14) * 21161) ^ (-1635658201);
                        main = main2;
                        i19 = iM31614;
                    }
                    checkBox2 = checkBox;
                    break;
                case -579982617:
                case 1299136621:
                    C1519.m5403();
                    C13473.m33144();
                    obj3 = obj3;
                    onClickListener3 = onClickListener3;
                    i21 = i21;
                    int iM27617 = (C0619.m2761("۫ܿ") + i13) * 41;
                    i15 = ((iM27617 ^ i14) * 8203) ^ (-1333858090);
                    i6 = iM27617 ^ 1101464680;
                    i21 = i21;
                    onClickListener3 = onClickListener3;
                    obj3 = obj3;
                    i16 = i6;
                    checkBox2 = checkBox;
                    break;
                case -380221925:
                case 323156450:
                    obj = obj3;
                    c2361M3794 = C0950.m3794(main);
                    C1343.m4952(c2361M3794, viewM9942);
                    dialogInterfaceOnClickListenerC3302 = new DialogInterfaceOnClickListenerC3302(0, c23255, checkBox2);
                    iM2761 = (C0773.m3169("ۢܶ") ^ i14) * (-19);
                    i = ((iM2761 ^ i13) * (-20279)) ^ (-2021620376);
                    i3 = -1122693822;
                    i2 = iM2761 ^ i3;
                    obj3 = obj;
                    i16 = i2;
                    i15 = i;
                    break;
                case -8095266:
                case 1879374123:
                    obj = obj3;
                    strM10047 = C3077.m10047(f67679, 390, 3, i17);
                    if (C20932.f66974 > 0) {
                        iM2761 = (i14 - C0619.m2761("᩶۠")) * (-103);
                        i = ((iM2761 ^ i13) * 17157) ^ (-1937707440);
                        i3 = 1091028537;
                        i2 = iM2761 ^ i3;
                        obj3 = obj;
                        i16 = i2;
                        i15 = i;
                    } else {
                        i11 = i21;
                        view = view2;
                        onClickListener2 = onClickListener3;
                        i10 = i24;
                        int iM27618 = C0619.m2761("᩹֫") ^ i13;
                        view2 = view;
                        i12 = ((iM27618 ^ i14) * 14499) ^ 909729021;
                        onClickListener3 = onClickListener2;
                        i24 = i10;
                        obj3 = obj;
                        i21 = i11;
                        i16 = iM27618 ^ (-991282231);
                        i15 = i12;
                        checkBox2 = checkBox;
                    }
                    break;
                case 593784218:
                case 1936102965:
                    obj3 = obj3;
                    onClickListener3 = onClickListener3;
                    i21 = i21;
                    i24 = i24;
                    c23255 = (C23255) C3448.m11246(viewM9942, C0619.m2761(strM8881) ^ 2130189096);
                    interfaceC9802 = ApplicationC17729.f58258;
                    if (C2023.f6737) {
                        iM2763 = C0619.m2761("ۢܰ") ^ i14;
                        i15 = ((iM2763 ^ i13) * (-30583)) ^ (-1544809878);
                        i7 = 450153131;
                    } else {
                        iM2763 = (C0619.m2761("֡᩸") + i13) * (-95);
                        i15 = ((iM2763 ^ i14) * 25059) ^ (-736178098);
                        i7 = 1913354314;
                    }
                    i6 = iM2763 ^ i7;
                    i24 = i24;
                    i21 = i21;
                    onClickListener3 = onClickListener3;
                    obj3 = obj3;
                    i16 = i6;
                    checkBox2 = checkBox;
                    break;
                case 655873018:
                case 1472707033:
                    obj3 = obj3;
                    View view3 = view2;
                    onClickListener3 = onClickListener3;
                    C11235.m28299(view3, onClickListener3);
                    sArr2 = f67679;
                    i24 = 387;
                    if (C1343.f4799 == 0) {
                        int iM31617 = C0773.m3169("ۚ۠") ^ i13;
                        i = ((iM31617 ^ i14) * (-26645)) ^ (-963427930);
                        i2 = iM31617 ^ (-1194780452);
                        view2 = view3;
                        onClickListener3 = onClickListener3;
                        obj3 = obj3;
                        checkBox2 = checkBox;
                        i16 = i2;
                        i15 = i;
                    } else {
                        view2 = view3;
                        i21 = i21;
                        int iM27619 = (C0619.m2761("۫ܿ") + i13) * 41;
                        i15 = ((iM27619 ^ i14) * 8203) ^ (-1333858090);
                        i6 = iM27619 ^ 1101464680;
                        i21 = i21;
                        onClickListener3 = onClickListener3;
                        obj3 = obj3;
                        i16 = i6;
                        checkBox2 = checkBox;
                    }
                    break;
                case 936495621:
                case 1983716538:
                    i17 = 370;
                    iM3169 = C0619.m2761("ۢ᩸") ^ i14;
                    i15 = ((iM3169 ^ i13) * 31769) ^ (-1653303812);
                    i5 = -1033110053;
                    i6 = iM3169 ^ i5;
                    main = main;
                    i24 = i24;
                    i21 = i21;
                    interfaceC9802 = interfaceC9802;
                    onClickListener3 = onClickListener3;
                    obj3 = obj3;
                    i16 = i6;
                    checkBox2 = checkBox;
                    break;
                case 981366408:
                case 1314781199:
                    if (!C0619.m2763()) {
                        iM2762 = C0773.m3169("ۗۜ") ^ i14;
                        i = ((iM2762 ^ i13) * (-4015)) ^ (-762108642);
                        i4 = -903891174;
                        i16 = iM2762 ^ i4;
                        i15 = i;
                    } else {
                        obj3 = obj3;
                        onClickListener3 = onClickListener3;
                        i21 = i21;
                        int iM276110 = (C0619.m2761("۫ܿ") + i13) * 41;
                        i15 = ((iM276110 ^ i14) * 8203) ^ (-1333858090);
                        i6 = iM276110 ^ 1101464680;
                        i21 = i21;
                        onClickListener3 = onClickListener3;
                        obj3 = obj3;
                        i16 = i6;
                        checkBox2 = checkBox;
                    }
                    break;
                default:
                    C3492.m11487(c2361M3794, C0619.m2761(strM10047) ^ 2128220608, dialogInterfaceOnClickListenerC3302);
                    sArr3 = f67679;
                    i25 = 393;
                    i26 = 3;
                    if (C1146.f4234 >= 0) {
                        iM2762 = C0773.m3169("ۗۜ") ^ i14;
                        i = ((iM2762 ^ i13) * (-4015)) ^ (-762108642);
                        i4 = -903891174;
                    } else {
                        iM2762 = C0619.m2761("ۘ֨") ^ i13;
                        i = ((iM2762 ^ i14) * 5791) ^ 1981149364;
                        i4 = -454262960;
                    }
                    i16 = iM2762 ^ i4;
                    i15 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01f0 A[PHI: r5 r6 r16 r17
      0x01f0: PHI (r5v4 short) = (r5v3 short), (r5v2 short) binds: [B:55:0x01ee, B:51:0x01cf] A[DONT_GENERATE, DONT_INLINE]
      0x01f0: PHI (r6v3 int) = (r6v2 int), (r6v4 int) binds: [B:55:0x01ee, B:51:0x01cf] A[DONT_GENERATE, DONT_INLINE]
      0x01f0: PHI (r16v7 java.lang.String) = (r16v6 java.lang.String), (r16v8 java.lang.String) binds: [B:55:0x01ee, B:51:0x01cf] A[DONT_GENERATE, DONT_INLINE]
      0x01f0: PHI (r17v7 l.ۢ֫ܺ) = (r17v6 l.ۢ֫ܺ), (r17v8 l.ۢ֫ܺ) binds: [B:55:0x01ee, B:51:0x01cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0241 A[PHI: r7 r8 r16 r17
      0x0241: PHI (r7v6 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:63:0x023f, B:59:0x0222, B:47:0x01af, B:9:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0241: PHI (r8v6 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:63:0x023f, B:59:0x0222, B:47:0x01af, B:9:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0241: PHI (r16v28 java.lang.String) = (r16v4 java.lang.String), (r16v5 java.lang.String), (r16v9 java.lang.String), (r16v29 java.lang.String) binds: [B:63:0x023f, B:59:0x0222, B:47:0x01af, B:9:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0241: PHI (r17v27 l.ۢ֫ܺ) = (r17v4 l.ۢ֫ܺ), (r17v5 l.ۢ֫ܺ), (r17v9 l.ۢ֫ܺ), (r17v28 l.ۢ֫ܺ) binds: [B:63:0x023f, B:59:0x0222, B:47:0x01af, B:9:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02a7 A[PHI: r3 r4 r11 r12 r16 r17
      0x02a7: PHI (r3v4 short[]) = (r3v3 short[]), (r3v2 short[]), (r3v2 short[]), (r3v2 short[]) binds: [B:71:0x02a5, B:31:0x00f1, B:27:0x00cd, B:18:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x02a7: PHI (r4v4 char) = (r4v3 char), (r4v2 char), (r4v2 char), (r4v2 char) binds: [B:71:0x02a5, B:31:0x00f1, B:27:0x00cd, B:18:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x02a7: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:71:0x02a5, B:31:0x00f1, B:27:0x00cd, B:18:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x02a7: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:71:0x02a5, B:31:0x00f1, B:27:0x00cd, B:18:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x02a7: PHI (r16v16 java.lang.String) = (r16v2 java.lang.String), (r16v14 java.lang.String), (r16v15 java.lang.String), (r16v17 java.lang.String) binds: [B:71:0x02a5, B:31:0x00f1, B:27:0x00cd, B:18:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x02a7: PHI (r17v16 l.ۢ֫ܺ) = (r17v2 l.ۢ֫ܺ), (r17v14 l.ۢ֫ܺ), (r17v15 l.ۢ֫ܺ), (r17v17 l.ۢ֫ܺ) binds: [B:71:0x02a5, B:31:0x00f1, B:27:0x00cd, B:18:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m48340() {
        int iM2761;
        int i;
        int i2;
        String strM48350;
        String str;
        int iM3169;
        int i3;
        int i4;
        int i5 = C4238.f15451;
        int i6 = C1783.f6087;
        int iM31610 = (C0773.m3169("ۖۜ") + i5) * (-57);
        int i7 = ((iM31610 ^ i6) * (-13745)) ^ (-1078118730);
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM31610 ^ 1928320520;
        char c = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = -1417632491;
        String str2 = null;
        InterfaceC9801 interfaceC9801 = null;
        while (true) {
            i15 = i8 ^ (i7 & (((i15 ^ i6) * (-14675)) >> 31));
            switch (i15) {
                case -1939976617:
                case -1879111487:
                    str = str2;
                    interfaceC9801 = ApplicationC17729.f58258;
                    sArr2 = f67679;
                    if (C3779.f12953 <= 0) {
                        iM3169 = (C0619.m2761("ۧۤ") + i6) * (-71);
                        i3 = ((iM3169 ^ i5) * (-15947)) ^ (-249806025);
                        i4 = 1675293362;
                    } else {
                        iM3169 = C0773.m3169("ۛܿ") ^ i6;
                        i3 = ((iM3169 ^ i5) * (-31469)) ^ 992766127;
                        i4 = -396664185;
                    }
                    String str3 = str;
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    str2 = str3;
                    break;
                case -1866323031:
                case -1537127271:
                    C3998.m12920();
                    if (C1519.f5300 >= 0) {
                        interfaceC9801 = interfaceC9801;
                        str2 = str2;
                        iM2761 = (i5 - C0619.m2761("ۧۖ")) * (-89);
                        i = ((iM2761 ^ i6) * 17263) ^ 229247716;
                        i2 = 1866399320;
                        int i16 = iM2761 ^ i2;
                        str2 = str2;
                        i8 = i16;
                        i7 = i;
                        interfaceC9801 = interfaceC9801;
                    }
                    interfaceC9801 = interfaceC9801;
                    str2 = str2;
                    iM2761 = C0619.m2761("۟ۘ") ^ i5;
                    i = ((iM2761 ^ i6) * (-19553)) ^ (-392027198);
                    i2 = -1756095764;
                    int i17 = iM2761 ^ i2;
                    str2 = str2;
                    i8 = i17;
                    i7 = i;
                    interfaceC9801 = interfaceC9801;
                    break;
                case -1844239248:
                case 1513918992:
                    interfaceC9801 = interfaceC9801;
                    str2 = str2;
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0619.m2761("۟ۘ") ^ i5;
                        i = ((iM2761 ^ i6) * (-19553)) ^ (-392027198);
                        i2 = -1756095764;
                    } else {
                        iM2761 = (C0619.m2761("֨᩷") + i6) * (-111);
                        i = ((iM2761 ^ i5) * (-263)) ^ (-456142373);
                        i2 = -1003039104;
                    }
                    int i18 = iM2761 ^ i2;
                    str2 = str2;
                    i8 = i18;
                    i7 = i;
                    interfaceC9801 = interfaceC9801;
                    break;
                case -1612027248:
                case 699950451:
                    interfaceC9801 = interfaceC9801;
                    str2 = str2;
                    i9 = s * 3774;
                    if (C1080.f3865 >= 0) {
                        iM2761 = (C0773.m3169("ۙۘ") + i6) * 109;
                        i = ((iM2761 ^ i5) * (-28451)) ^ (-2112038584);
                        i2 = 1020208488;
                    } else {
                        iM2761 = C0773.m3169("᩺ܽ") ^ i5;
                        i = ((iM2761 ^ i6) * 20329) ^ 1709153590;
                        i2 = -1965544785;
                    }
                    int i19 = iM2761 ^ i2;
                    str2 = str2;
                    i8 = i19;
                    i7 = i;
                    interfaceC9801 = interfaceC9801;
                    break;
                case -1569730379:
                case 289545755:
                    interfaceC9801 = interfaceC9801;
                    str2 = str2;
                    i13 = 108;
                    if (C2023.m6964() <= 0) {
                        iM2761 = (C0773.m3169("۟֡") + i5) * 73;
                        i = ((iM2761 ^ i6) * 31757) ^ 1124432725;
                        i2 = -1526817800;
                    } else {
                        iM2761 = C0773.m3169("᩸ۢ") ^ i5;
                        i = ((iM2761 ^ i6) * 12453) ^ (-1377758069);
                        i2 = 117657132;
                    }
                    int i110 = iM2761 ^ i2;
                    str2 = str2;
                    i8 = i110;
                    i7 = i;
                    interfaceC9801 = interfaceC9801;
                    break;
                case -1313388433:
                case -806374579:
                    interfaceC9801 = interfaceC9801;
                    str2 = str2;
                    i14 = 15;
                    if (C2023.m6964() <= 0) {
                        iM2761 = (C0773.m3169("۟֡") + i5) * 73;
                        i = ((iM2761 ^ i6) * 31757) ^ 1124432725;
                        i2 = -1526817800;
                    } else {
                        iM2761 = (C0773.m3169("ۗ۠") + i6) * (-29);
                        i = ((iM2761 ^ i5) * (-27051)) ^ (-42295451);
                        i2 = -1872566039;
                    }
                    int i111 = iM2761 ^ i2;
                    str2 = str2;
                    i8 = i111;
                    i7 = i;
                    interfaceC9801 = interfaceC9801;
                    break;
                case -1284365381:
                case 1505527095:
                    strM48350 = m48350();
                    str2 = strM48350;
                    int iM31611 = C0773.m3169("᩸ܰ") ^ i5;
                    interfaceC9801 = interfaceC9801;
                    i = ((iM31611 ^ i6) * 11643) ^ (-1009268028);
                    i8 = iM31611 ^ (-1158032261);
                    i7 = i;
                    interfaceC9801 = interfaceC9801;
                    break;
                case -1098886373:
                case -1001033121:
                    C3033.m9845();
                    C3779.m12264();
                    interfaceC9801 = interfaceC9801;
                    str2 = str2;
                    iM2761 = C0619.m2761("۟ۘ") ^ i5;
                    i = ((iM2761 ^ i6) * (-19553)) ^ (-392027198);
                    i2 = -1756095764;
                    int i112 = iM2761 ^ i2;
                    str2 = str2;
                    i8 = i112;
                    i7 = i;
                    interfaceC9801 = interfaceC9801;
                    break;
                case -1032852796:
                case -742359279:
                    i12 = 26240;
                    iM2761 = (C0773.m3169("ۗ֫") ^ i6) * (-13);
                    i = ((iM2761 ^ i5) * (-24559)) ^ (-634327831);
                    i2 = -1263795097;
                    int i113 = iM2761 ^ i2;
                    str2 = str2;
                    i8 = i113;
                    i7 = i;
                    interfaceC9801 = interfaceC9801;
                    break;
                case -787411942:
                case 2053280491:
                    interfaceC9801 = interfaceC9801;
                    str2 = str2;
                    if ((i10 + i11) - i9 < 0) {
                        iM2761 = (i5 - C0773.m3169("ۡᩴ")) * (-17);
                        i = ((iM2761 ^ i6) * (-24867)) ^ 502056003;
                        i2 = -1148376886;
                    } else {
                        iM2761 = C0773.m3169("ܺܶ") ^ i6;
                        i = ((iM2761 ^ i5) * 31073) ^ (-62725674);
                        i2 = -1712000549;
                    }
                    int i114 = iM2761 ^ i2;
                    str2 = str2;
                    i8 = i114;
                    i7 = i;
                    interfaceC9801 = interfaceC9801;
                    break;
                case -538738875:
                case -278262053:
                    interfaceC9801 = interfaceC9801;
                    str2 = str2;
                    s = sArr[c];
                    if (C0862.f3233 != 0) {
                        iM2761 = (C0773.m3169("ۙۘ") + i6) * 109;
                        i = ((iM2761 ^ i5) * (-28451)) ^ (-2112038584);
                        i2 = 1020208488;
                    } else {
                        iM2761 = (C0773.m3169("ܶۛ") + i6) * 119;
                        i = ((iM2761 ^ i5) * (-7095)) ^ (-1957198745);
                        i2 = 1466974014;
                    }
                    int i115 = iM2761 ^ i2;
                    str2 = str2;
                    i8 = i115;
                    i7 = i;
                    interfaceC9801 = interfaceC9801;
                    break;
                case -141889506:
                case 1954535543:
                    interfaceC9801 = interfaceC9801;
                    str2 = str2;
                    if (C1542.f5343 <= 0) {
                        iM2761 = (i5 - C0619.m2761("ۧۖ")) * (-89);
                        i = ((iM2761 ^ i6) * 17263) ^ 229247716;
                        i2 = 1866399320;
                    } else {
                        iM2761 = C0619.m2761("᩷᩹") ^ i5;
                        i = ((iM2761 ^ i6) * (-2019)) ^ 1369351817;
                        i2 = -326573605;
                    }
                    int i116 = iM2761 ^ i2;
                    str2 = str2;
                    i8 = i116;
                    i7 = i;
                    interfaceC9801 = interfaceC9801;
                    break;
                case 127261268:
                case 2034147605:
                    str = str2;
                    strM48350 = C2288.m7758(interfaceC9801, C1519.m5399(sArr2, i13, i14, i12), null);
                    if (strM48350 != null) {
                        str2 = strM48350;
                        int iM31612 = C0773.m3169("᩸ܰ") ^ i5;
                        interfaceC9801 = interfaceC9801;
                        i = ((iM31612 ^ i6) * 11643) ^ (-1009268028);
                        i8 = iM31612 ^ (-1158032261);
                        i7 = i;
                        interfaceC9801 = interfaceC9801;
                    } else {
                        iM3169 = (i6 - C0773.m3169("ᩳۘ")) * (-119);
                        i3 = ((iM3169 ^ i5) * 6825) ^ (-2119436004);
                        i4 = -627075826;
                        String str4 = str;
                        i8 = iM3169 ^ i4;
                        i7 = i3;
                        str2 = str4;
                    }
                    break;
                case 149137865:
                case 1669317380:
                    C0773.m3161();
                    if (AbstractC0116.f1064 <= 0) {
                        interfaceC9801 = interfaceC9801;
                        str2 = str2;
                        iM2761 = (C0773.m3169("۟֡") + i5) * 73;
                        i = ((iM2761 ^ i6) * 31757) ^ 1124432725;
                        i2 = -1526817800;
                        int i117 = iM2761 ^ i2;
                        str2 = str2;
                        i8 = i117;
                        i7 = i;
                        interfaceC9801 = interfaceC9801;
                    }
                    interfaceC9801 = interfaceC9801;
                    str2 = str2;
                    iM2761 = C0619.m2761("۟ۘ") ^ i5;
                    i = ((iM2761 ^ i6) * (-19553)) ^ (-392027198);
                    i2 = -1756095764;
                    int i118 = iM2761 ^ i2;
                    str2 = str2;
                    i8 = i118;
                    i7 = i;
                    interfaceC9801 = interfaceC9801;
                    break;
                case 206426858:
                case 718322003:
                    return str2;
                case 363233006:
                case 1141413578:
                    if (AbstractC0641.f2496 < 0) {
                        str = str2;
                        iM3169 = (C0619.m2761("ۧۤ") + i6) * (-71);
                        i3 = ((iM3169 ^ i5) * (-15947)) ^ (-249806025);
                        i4 = 1675293362;
                        String str5 = str;
                        i8 = iM3169 ^ i4;
                        i7 = i3;
                        str2 = str5;
                    } else {
                        interfaceC9801 = interfaceC9801;
                        str2 = str2;
                        iM2761 = C0619.m2761("۟ۘ") ^ i5;
                        i = ((iM2761 ^ i6) * (-19553)) ^ (-392027198);
                        i2 = -1756095764;
                        int i119 = iM2761 ^ i2;
                        str2 = str2;
                        i8 = i119;
                        i7 = i;
                        interfaceC9801 = interfaceC9801;
                    }
                    break;
                case 365749266:
                case 383277845:
                    interfaceC9801 = interfaceC9801;
                    str2 = str2;
                    if (C13473.f42873 != 0) {
                        iM2761 = C0619.m2761("۟ۘ") ^ i5;
                        i = ((iM2761 ^ i6) * (-19553)) ^ (-392027198);
                        i2 = -1756095764;
                    } else {
                        iM2761 = C0773.m3169("ܺ۟") ^ i5;
                        i = ((iM2761 ^ i6) * (-21077)) ^ (-911847648);
                        i2 = 1767154825;
                    }
                    int i1110 = iM2761 ^ i2;
                    str2 = str2;
                    i8 = i1110;
                    i7 = i;
                    interfaceC9801 = interfaceC9801;
                    break;
                case 602766785:
                case 1153231878:
                    interfaceC9801 = interfaceC9801;
                    str2 = str2;
                    sArr = f67679;
                    c = 'k';
                    if (C0269.f1558 <= 0) {
                        iM2761 = (C0773.m3169("۟֡") + i5) * 73;
                        i = ((iM2761 ^ i6) * 31757) ^ 1124432725;
                        i2 = -1526817800;
                    } else {
                        iM2761 = (C0619.m2761("֫ܽ") + i6) * 17;
                        i = ((iM2761 ^ i5) * (-7789)) ^ 160543802;
                        i2 = 437116790;
                    }
                    int i1111 = iM2761 ^ i2;
                    str2 = str2;
                    i8 = i1111;
                    i7 = i;
                    interfaceC9801 = interfaceC9801;
                    break;
                case 1013721989:
                case 1756713103:
                    interfaceC9801 = interfaceC9801;
                    str2 = str2;
                    i10 = s * s;
                    i11 = 3560769;
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0619.m2761("۟ۘ") ^ i5;
                        i = ((iM2761 ^ i6) * (-19553)) ^ (-392027198);
                        i2 = -1756095764;
                    } else {
                        iM2761 = C0773.m3169("ܽۨ") ^ i5;
                        i = ((iM2761 ^ i6) * 25977) ^ (-76883451);
                        i2 = -858437495;
                    }
                    int i1112 = iM2761 ^ i2;
                    str2 = str2;
                    i8 = i1112;
                    i7 = i;
                    interfaceC9801 = interfaceC9801;
                    break;
                case 1362565199:
                case 1718219744:
                    i12 = 48867;
                    iM2761 = (C0773.m3169("ۗ֫") ^ i6) * (-13);
                    i = ((iM2761 ^ i5) * (-24559)) ^ (-634327831);
                    i2 = -1263795097;
                    int i1113 = iM2761 ^ i2;
                    str2 = str2;
                    i8 = i1113;
                    i7 = i;
                    interfaceC9801 = interfaceC9801;
                    break;
                default:
                    AbstractC0641.m2813();
                    C3734.m12152();
                    return null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x01a4 A[PHI: r2 r3 r4 r5 r13 r19 r22
      0x01a4: PHI (r2v5 l.᩷ۨᩴ) = (r2v2 l.᩷ۨᩴ), (r2v3 l.᩷ۨᩴ), (r2v2 l.᩷ۨᩴ) binds: [B:45:0x017a, B:49:0x01a2, B:14:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x01a4: PHI (r3v6 java.lang.String) = (r3v4 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String) binds: [B:45:0x017a, B:49:0x01a2, B:14:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x01a4: PHI (r4v8 java.lang.StringBuilder) = (r4v6 java.lang.StringBuilder), (r4v1 java.lang.StringBuilder), (r4v1 java.lang.StringBuilder) binds: [B:45:0x017a, B:49:0x01a2, B:14:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x01a4: PHI (r5v6 java.lang.String) = (r5v4 java.lang.String), (r5v2 java.lang.String), (r5v2 java.lang.String) binds: [B:45:0x017a, B:49:0x01a2, B:14:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x01a4: PHI (r13v5 short[]) = (r13v3 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:45:0x017a, B:49:0x01a2, B:14:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x01a4: PHI (r19v26 int) = (r19v6 int), (r19v13 int), (r19v27 int) binds: [B:45:0x017a, B:49:0x01a2, B:14:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x01a4: PHI (r22v19 short) = (r22v5 short), (r22v13 short), (r22v20 short) binds: [B:45:0x017a, B:49:0x01a2, B:14:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0076, code lost:
    
        if (l.C2485.f7950 == 0) goto L14;
     */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m48350() {
        /*
            Method dump skipped, instruction units count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC21202.m48350():java.lang.String");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00f1 A[PHI: r7 r8
      0x00f1: PHI (r7v4 java.lang.String) = (r7v3 java.lang.String), (r7v2 java.lang.String) binds: [B:30:0x00d9, B:24:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x00f1: PHI (r8v4 int) = (r8v3 int), (r8v2 int) binds: [B:30:0x00d9, B:24:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0155 A[PHI: r4 r5 r6
      0x0155: PHI (r4v5 l.ۢ֫ܺ) = (r4v3 l.ۢ֫ܺ), (r4v2 l.ۢ֫ܺ), (r4v2 l.ۢ֫ܺ), (r4v2 l.ۢ֫ܺ), (r4v2 l.ۢ֫ܺ) binds: [B:43:0x0153, B:35:0x0112, B:17:0x009a, B:15:0x0096, B:111:0x0155] A[DONT_GENERATE, DONT_INLINE]
      0x0155: PHI (r5v5 java.lang.String) = 
      (r5v2 java.lang.String)
      (r5v3 java.lang.String)
      (r5v2 java.lang.String)
      (r5v2 java.lang.String)
      (r5v2 java.lang.String)
     binds: [B:43:0x0153, B:35:0x0112, B:17:0x009a, B:15:0x0096, B:111:0x0155] A[DONT_GENERATE, DONT_INLINE]
      0x0155: PHI (r6v5 java.lang.Object) = 
      (r6v2 java.lang.Object)
      (r6v3 java.lang.Object)
      (r6v2 java.lang.Object)
      (r6v2 java.lang.Object)
      (r6v2 java.lang.Object)
     binds: [B:43:0x0153, B:35:0x0112, B:17:0x009a, B:15:0x0096, B:111:0x0155] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x020a A[PHI: r17
      0x020a: PHI (r17v4 int) = (r17v3 int), (r17v2 int) binds: [B:58:0x0208, B:15:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x02f2 A[PHI: r1 r11 r12 r19 r20
      0x02f2: PHI (r1v88 short) = (r1v5 short), (r1v6 short), (r1v89 short) binds: [B:81:0x02f0, B:77:0x02d0, B:10:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x02f2: PHI (r11v7 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v8 short[]) binds: [B:81:0x02f0, B:77:0x02d0, B:10:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x02f2: PHI (r12v7 int) = (r12v2 int), (r12v2 int), (r12v8 int) binds: [B:81:0x02f0, B:77:0x02d0, B:10:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x02f2: PHI (r19v6 short[]) = (r19v3 short[]), (r19v2 short[]), (r19v2 short[]) binds: [B:81:0x02f0, B:77:0x02d0, B:10:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x02f2: PHI (r20v6 char) = (r20v2 char), (r20v3 char), (r20v2 char) binds: [B:81:0x02f0, B:77:0x02d0, B:10:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m48359() {
        short s;
        int iM2761;
        int i;
        int i2;
        int iM2762;
        int i3;
        int iM2763;
        int i4;
        ViewOnClickListenerC21202 viewOnClickListenerC21202 = this;
        int i5 = C3492.f12043;
        int i6 = C0269.f1558;
        int iM2764 = C0619.m2761("ۢᩳ") ^ i5;
        int i7 = ((iM2764 ^ i6) * (-27793)) ^ 685154780;
        String strM7758 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM2764 ^ 1641495701;
        Spinner spinner = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int selectedItemPosition = 0;
        char c = 0;
        int i17 = -1471512358;
        short s2 = 0;
        Object obj = null;
        String strM4939 = null;
        InterfaceC9801 interfaceC9801 = null;
        int i18 = 0;
        while (true) {
            i17 = i8 ^ (i7 & (((i17 ^ i6) * (-3467)) >> 31));
            switch (i17) {
                case -1749157197:
                case -1248529974:
                    i11 = 0;
                    iM2762 = (C0773.m3169("۟ۖ") + i6) * 29;
                    i = ((iM2762 ^ i5) * (-15761)) ^ (-1512361153);
                    i3 = -57486190;
                    i8 = iM2762 ^ i3;
                    i7 = i;
                    break;
                case -1684792055:
                case -1034152069:
                    i14 = i13 * i13;
                    i15 = s2 * s2;
                    if (AbstractC0116.m1243() == 0) {
                        iM2762 = C0619.m2761("ܶ᩷") ^ i6;
                        i = ((iM2762 ^ i5) * 10529) ^ 1282981943;
                        i3 = 622892703;
                        i8 = iM2762 ^ i3;
                        i7 = i;
                    } else {
                        iM2763 = (i6 - C0619.m2761("ۜ۠")) * (-17);
                        i7 = ((iM2763 ^ i5) * 15295) ^ 732468691;
                        i4 = 2009215326;
                        i8 = iM2763 ^ i4;
                        viewOnClickListenerC21202 = this;
                    }
                    break;
                case -1504443560:
                case 1914785677:
                    s = s2;
                    sArr = f67679;
                    if (C4282.f15546 <= 0) {
                        iM2761 = C0619.m2761("ܿܽ") ^ i5;
                        i = ((iM2761 ^ i6) * 6501) ^ (-1119789990);
                        i2 = -419643230;
                    } else {
                        iM2761 = C0619.m2761("ۛ᩷") ^ i6;
                        i = ((iM2761 ^ i5) * 31389) ^ (-1395732248);
                        i2 = 1518754434;
                    }
                    i8 = iM2761 ^ i2;
                    viewOnClickListenerC21202 = this;
                    s2 = s;
                    i7 = i;
                    break;
                case -1494360154:
                case 218718357:
                    int i19 = i15 + i16;
                    if (i14 - (i19 + i19) <= 0) {
                        iM2762 = (C0619.m2761("۬᩹") ^ i5) * 27;
                        i = ((iM2762 ^ i6) * 21271) ^ 1937610234;
                        i3 = 795195792;
                    } else {
                        iM2762 = (C0773.m3169("۟֫") ^ i6) * (-33);
                        i = ((iM2762 ^ i5) * (-8965)) ^ 676405694;
                        i3 = -113620211;
                    }
                    i8 = iM2762 ^ i3;
                    i7 = i;
                    break;
                case -1484065204:
                case -819258230:
                    spinner.setSelection(i11);
                    break;
                case -1415821077:
                case 1540495036:
                    C3099.m10095();
                    if (C4282.m13644()) {
                        iM2762 = C0619.m2761("ۙۧ") ^ i5;
                        i = ((iM2762 ^ i6) * (-7233)) ^ 608229329;
                        i3 = 895023738;
                    } else {
                        iM2762 = (i5 - C0773.m3169("᩷֡")) * 83;
                        i = ((iM2762 ^ i6) * (-19721)) ^ 1208117492;
                        i3 = -2014105990;
                    }
                    i8 = iM2762 ^ i3;
                    i7 = i;
                    break;
                case -1408819810:
                case 1005768146:
                    strM4939 = C1343.m4939(sArr2, i12, 13, i18);
                    obj = null;
                    if (C2288.f7433 <= 0) {
                        iM2762 = (i5 - C0773.m3169("᩷֡")) * 83;
                        i = ((iM2762 ^ i6) * (-19721)) ^ 1208117492;
                        i3 = -2014105990;
                    } else {
                        iM2762 = (i5 - C0773.m3169("᩵᩻")) * (-85);
                        i = ((iM2762 ^ i6) * (-21541)) ^ (-1051601745);
                        i3 = -549311578;
                    }
                    i8 = iM2762 ^ i3;
                    i7 = i;
                    break;
                case -1208746211:
                case -266719849:
                    C3779.m12264();
                    C0862.m3503();
                    break;
                case -1082841657:
                case 1092032162:
                    strM7758 = C2288.m7758(interfaceC9801, strM4939, obj);
                    i9 = -1;
                    if (strM7758 != null) {
                        iM2762 = C0773.m3169("۠۠") ^ i5;
                        i = ((iM2762 ^ i6) * 28341) ^ 530860175;
                        i3 = 363479977;
                    } else {
                        i10 = selectedItemPosition;
                        iM2762 = C0619.m2761("ۜᩳ") ^ i6;
                        i = ((iM2762 ^ i5) * 4085) ^ (-1238292985);
                        i3 = 608538613;
                    }
                    i8 = iM2762 ^ i3;
                    i7 = i;
                    break;
                case -1054076650:
                case -780597263:
                    s2 = sArr[c];
                    if (AbstractC0641.m2813() <= 0) {
                        iM2763 = (i6 - C0619.m2761("ۜ۠")) * (-17);
                        i7 = ((iM2763 ^ i5) * 15295) ^ 732468691;
                        i4 = 2009215326;
                    } else {
                        iM2763 = (C0619.m2761("ܺۡ") ^ i5) * 59;
                        i7 = ((iM2763 ^ i6) * (-7459)) ^ 1338276066;
                        i4 = -1469513632;
                    }
                    i8 = iM2763 ^ i4;
                    viewOnClickListenerC21202 = this;
                    break;
                case -1050018434:
                case 1971369591:
                    spinner = viewOnClickListenerC21202.f67684;
                    selectedItemPosition = spinner.getSelectedItemPosition();
                    if (C1321.f4751 < 0) {
                        iM2762 = C0619.m2761("ܰ۬") ^ i6;
                        i = ((iM2762 ^ i5) * (-30521)) ^ (-720657278);
                        i3 = 1874469998;
                        i8 = iM2762 ^ i3;
                        i7 = i;
                    } else {
                        s = s2;
                        int iM2765 = C0619.m2761("᩹ۧ") ^ i6;
                        i8 = iM2765 ^ (-92037385);
                        s2 = s;
                        i7 = ((iM2765 ^ i5) * 9499) ^ (-1481453126);
                        viewOnClickListenerC21202 = this;
                    }
                    break;
                case -708428442:
                case 1031506580:
                    C2354.m7983();
                    if (C3690.f12684 <= 0) {
                        s = s2;
                        iM2761 = C0619.m2761("ܿܽ") ^ i5;
                        i = ((iM2761 ^ i6) * 6501) ^ (-1119789990);
                        i2 = -419643230;
                        i8 = iM2761 ^ i2;
                        viewOnClickListenerC21202 = this;
                        s2 = s;
                        i7 = i;
                    } else {
                        iM2763 = (i6 - C0619.m2761("ۜ۠")) * (-17);
                        i7 = ((iM2763 ^ i5) * 15295) ^ 732468691;
                        i4 = 2009215326;
                        i8 = iM2763 ^ i4;
                        viewOnClickListenerC21202 = this;
                    }
                    break;
                case -702385111:
                case 1090279885:
                    interfaceC9801 = ApplicationC17729.f58258;
                    if (C3779.f12953 <= 0) {
                        iM2762 = (i5 - C0773.m3169("᩷֡")) * 83;
                        i = ((iM2762 ^ i6) * (-19721)) ^ 1208117492;
                        i3 = -2014105990;
                    } else {
                        iM2762 = (C0619.m2761("֨ۖ") + i6) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM2762 ^ i5) * 8163) ^ 1055613241;
                        i3 = -1280184290;
                    }
                    i8 = iM2762 ^ i3;
                    i7 = i;
                    break;
                case -678498933:
                case 1999787046:
                    sArr2 = f67679;
                    i12 = 400;
                    if (C1564.f5401 > 0) {
                        iM2762 = (C0773.m3169("ᩴ᩹") + i5) * 37;
                        i = ((iM2762 ^ i6) * 7385) ^ (-1826602691);
                        i3 = -655503468;
                        i8 = iM2762 ^ i3;
                        i7 = i;
                    }
                    s = s2;
                    iM2761 = C0619.m2761("ܿܽ") ^ i5;
                    i = ((iM2761 ^ i6) * 6501) ^ (-1119789990);
                    i2 = -419643230;
                    i8 = iM2761 ^ i2;
                    viewOnClickListenerC21202 = this;
                    s2 = s;
                    i7 = i;
                    break;
                case -248275767:
                case 833038586:
                    s = s2;
                    i13 = s + 2151;
                    if (!C2878.f9462) {
                        iM2761 = (C0773.m3169("ۛۡ") + i6) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2761 ^ i5) * (-23117)) ^ 672561806;
                        i2 = -1701212506;
                        i8 = iM2761 ^ i2;
                        viewOnClickListenerC21202 = this;
                        s2 = s;
                        i7 = i;
                    } else {
                        int iM2766 = C0619.m2761("᩹ۧ") ^ i6;
                        i8 = iM2766 ^ (-92037385);
                        s2 = s;
                        i7 = ((iM2766 ^ i5) * 9499) ^ (-1481453126);
                        viewOnClickListenerC21202 = this;
                    }
                    break;
                case -183845963:
                case 2143206855:
                    if (!C3690.m11987()) {
                        iM2762 = (i5 - C0773.m3169("᩷֡")) * 83;
                        i = ((iM2762 ^ i6) * (-19721)) ^ 1208117492;
                        i3 = -2014105990;
                        i8 = iM2762 ^ i3;
                        i7 = i;
                    } else {
                        iM2763 = (i6 - C0619.m2761("ۜ۠")) * (-17);
                        i7 = ((iM2763 ^ i5) * 15295) ^ 732468691;
                        i4 = 2009215326;
                        i8 = iM2763 ^ i4;
                        viewOnClickListenerC21202 = this;
                    }
                    break;
                case -3340127:
                case 106693472:
                    int iIndexOf = viewOnClickListenerC21202.f67681.indexOf(strM7758);
                    if (iIndexOf == i9) {
                        i10 = selectedItemPosition;
                    } else {
                        i10 = iIndexOf;
                    }
                    iM2762 = C0619.m2761("ۜᩳ") ^ i6;
                    i = ((iM2762 ^ i5) * 4085) ^ (-1238292985);
                    i3 = 608538613;
                    i8 = iM2762 ^ i3;
                    i7 = i;
                    break;
                case 174519425:
                case 1841265665:
                    i16 = 4626801;
                    if (AbstractC3624.m11755() != 0) {
                        iM2762 = C0619.m2761("ۙۧ") ^ i5;
                        i = ((iM2762 ^ i6) * (-7233)) ^ 608229329;
                        i3 = 895023738;
                    } else {
                        iM2762 = C0619.m2761("᩺֡") ^ i5;
                        i = ((iM2762 ^ i6) * (-4589)) ^ 1291946512;
                        i3 = -1256687352;
                    }
                    i8 = iM2762 ^ i3;
                    i7 = i;
                    break;
                case 306134290:
                case 516632032:
                    i18 = 44407;
                    iM2762 = (C0619.m2761("֡۠") ^ i5) * 53;
                    i = ((iM2762 ^ i6) * 11587) ^ 2082555514;
                    i3 = 1417030265;
                    i8 = iM2762 ^ i3;
                    i7 = i;
                    break;
                case 648986013:
                case 1014392900:
                    C23916.m53419();
                    C0619.m2763();
                    iM2762 = (i5 - C0773.m3169("᩷֡")) * 83;
                    i = ((iM2762 ^ i6) * (-19721)) ^ 1208117492;
                    i3 = -2014105990;
                    i8 = iM2762 ^ i3;
                    i7 = i;
                    break;
                case 899164732:
                case 1048357331:
                    i18 = 14765;
                    iM2762 = (C0619.m2761("֡۠") ^ i5) * 53;
                    i = ((iM2762 ^ i6) * 11587) ^ 2082555514;
                    i3 = 1417030265;
                    i8 = iM2762 ^ i3;
                    i7 = i;
                    break;
                case 1360618315:
                case 1975528545:
                    s = s2;
                    c = 399;
                    if (C3779.f12953 <= 0) {
                        iM2761 = C0619.m2761("ܿܽ") ^ i5;
                        i = ((iM2761 ^ i6) * 6501) ^ (-1119789990);
                        i2 = -419643230;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ۙ᩵")) * 71;
                        i = ((iM2761 ^ i6) * 15421) ^ (-1771721069);
                        i2 = 1482310250;
                    }
                    i8 = iM2761 ^ i2;
                    viewOnClickListenerC21202 = this;
                    s2 = s;
                    i7 = i;
                    break;
                default:
                    if (i10 == i9) {
                        iM2762 = (i6 - C0619.m2761("ۚܳ")) * (-107);
                        i = ((iM2762 ^ i5) * 6521) ^ 303178886;
                        i3 = -1436038835;
                    } else {
                        i11 = i10;
                        iM2762 = (C0773.m3169("۟ۖ") + i6) * 29;
                        i = ((iM2762 ^ i5) * (-15761)) ^ (-1512361153);
                        i3 = -57486190;
                    }
                    i8 = iM2762 ^ i3;
                    i7 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m48356(ViewOnClickListenerC21202 viewOnClickListenerC21202) {
        C23255 c23255 = null;
        InterfaceC19106 interfaceC19106M11756 = null;
        String strM6952 = null;
        int i = 140059491;
        int i2 = C2419.f7754;
        int i3 = C3734.f12817;
        int iM2761 = (i2 - C0619.m2761("ۘۡ")) * (-47);
        int i4 = ((iM2761 ^ i3) * 3183) ^ 2021858112;
        int i5 = -1875732015;
        while (true) {
            i = ((((i ^ i3) * (-7025)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1848391592:
                case 1645819776:
                    c23255 = viewOnClickListenerC21202.f67685;
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = (C0619.m2761("ۜۛ") ^ i2) * (-87);
                        i4 = ((iM2761 ^ i3) * (-14179)) ^ (-1705500500);
                        i5 = -1397367783;
                    } else {
                        iM2761 = C0773.m3169("ܰܿ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 18903) ^ (-1241267274);
                        i5 = -2065394298;
                    }
                    break;
                case -1793669114:
                case 1490931709:
                    C2834.m9339(new C24186(viewOnClickListenerC21202, strM6952));
                    break;
                case -1471204791:
                case -387362215:
                    C2485.m8357();
                    C1080.m4050();
                    iM2761 = (C0773.m3169("ۤۢ") ^ i3) * (-107);
                    i4 = ((iM2761 ^ i2) * 11145) ^ (-1713580763);
                    i5 = -1250136407;
                    break;
                case -1319490581:
                case -828072204:
                    if (C2023.f6737) {
                        iM2761 = (C0773.m3169("ۤۢ") ^ i3) * (-107);
                        i4 = ((iM2761 ^ i2) * 11145) ^ (-1713580763);
                        i5 = -1250136407;
                    } else {
                        iM2761 = C0619.m2761("ܽۗ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-6765)) ^ 1547740226;
                        i5 = -542203667;
                    }
                    break;
                case -1240544529:
                case 1808994209:
                    if (C0487.f2131 <= 0) {
                        iM2761 = C0773.m3169("֫᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * 6405) ^ 196034074;
                        i5 = -106966628;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۜᩴ")) * (-101);
                        i4 = ((iM2761 ^ i2) * (-5977)) ^ 1055726052;
                        i5 = -691356781;
                    }
                    break;
                case -1216472271:
                case -339641409:
                    if (C1146.f4234 >= 0) {
                        iM2761 = (C0619.m2761("۬֫") ^ i3) * q.h;
                        i4 = ((iM2761 ^ i2) * (-28635)) ^ (-1665304880);
                        i5 = -384526909;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۗ֫")) * (-33);
                        i4 = ((iM2761 ^ i2) * 28783) ^ 1158347630;
                        i5 = 922843446;
                    }
                    break;
                case -1172372859:
                case -370945817:
                    interfaceC19106M11756 = AbstractC3624.m11756(c23255);
                    if (C2878.m9491() <= 0) {
                        iM2761 = (C0619.m2761("۬֫") ^ i3) * q.h;
                        i4 = ((iM2761 ^ i2) * (-28635)) ^ (-1665304880);
                        i5 = -384526909;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۤ۠")) * 7;
                        i4 = ((iM2761 ^ i2) * (-10589)) ^ (-26176223);
                        i5 = 1840204644;
                    }
                    break;
                case -821973413:
                case 1911085628:
                    if (!C1080.m4050()) {
                        iM2761 = (C0773.m3169("ۤۢ") ^ i3) * (-107);
                        i4 = ((iM2761 ^ i2) * 11145) ^ (-1713580763);
                        i5 = -1250136407;
                    } else {
                        iM2761 = (C0619.m2761("۬֫") ^ i3) * q.h;
                        i4 = ((iM2761 ^ i2) * (-28635)) ^ (-1665304880);
                        i5 = -384526909;
                    }
                    break;
                case -428441880:
                case 1533199931:
                    if (C3779.m12264()) {
                        iM2761 = C0619.m2761("ۤᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 9649) ^ 590713187;
                        i5 = 959257198;
                    } else {
                        iM2761 = C0773.m3169("֫᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * 6405) ^ 196034074;
                        i5 = -106966628;
                    }
                    break;
                case -198081566:
                case 301251888:
                    if (C2288.f7433 <= 0) {
                        iM2761 = (C0619.m2761("۬֫") ^ i3) * q.h;
                        i4 = ((iM2761 ^ i2) * (-28635)) ^ (-1665304880);
                        i5 = -384526909;
                    } else {
                        iM2761 = (C0619.m2761("᩷᩹") + i2) * (-63);
                        i4 = ((iM2761 ^ i3) * (-13141)) ^ (-1570909239);
                        i5 = -2106093869;
                    }
                    break;
                case -1043603:
                case 1601505180:
                    if (C3448.f11240 >= 0) {
                        iM2761 = C0773.m3169("֫᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * 6405) ^ 196034074;
                        i5 = -106966628;
                    } else {
                        iM2761 = (C0773.m3169("ۗ᩺") ^ i2) * (-103);
                        i4 = ((iM2761 ^ i3) * 20317) ^ (-164627914);
                        i5 = -1375544946;
                    }
                    break;
                case 120866938:
                case 1994808574:
                    C1343.m4943();
                    C1542.m5459();
                    break;
                case 567123629:
                case 1561295497:
                    C0619.m2763();
                    if (C0950.m3785() != 0) {
                        iM2761 = C0773.m3169("ۙܰ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-31521)) ^ 302421804;
                        i5 = 1620986020;
                    } else {
                        iM2761 = (C0773.m3169("ۤۢ") ^ i3) * (-107);
                        i4 = ((iM2761 ^ i2) * 11145) ^ (-1713580763);
                        i5 = -1250136407;
                    }
                    break;
                case 858786468:
                case 1229385852:
                    C2375.m8065();
                    if (AbstractC3624.f12429 > 0) {
                        iM2761 = C0773.m3169("֫᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * 6405) ^ 196034074;
                        i5 = -106966628;
                    } else {
                        iM2761 = C0773.m3169("ۙܰ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-31521)) ^ 302421804;
                        i5 = 1620986020;
                    }
                    break;
                case 1101186285:
                case 2126566607:
                    strM6952 = C2023.m6952(interfaceC19106M11756);
                    if (C2354.f7599 >= 0) {
                        iM2761 = (C0619.m2761("ۜۛ") ^ i2) * (-87);
                        i4 = ((iM2761 ^ i3) * (-14179)) ^ (-1705500500);
                        i5 = -1397367783;
                    } else {
                        iM2761 = (C0773.m3169("ۡۨ") ^ i2) * 115;
                        i4 = ((iM2761 ^ i3) * (-8659)) ^ 1417953165;
                        i5 = 358587210;
                    }
                    break;
                default:
                    if (C3779.f12953 <= 0) {
                        iM2761 = (C0619.m2761("۬֫") ^ i3) * q.h;
                        i4 = ((iM2761 ^ i2) * (-28635)) ^ (-1665304880);
                        i5 = -384526909;
                    } else {
                        iM2761 = (C0773.m3169("᩸ۤ") + i2) * (-39);
                        i4 = ((iM2761 ^ i3) * (-22125)) ^ (-813059761);
                        i5 = -593451423;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0084, code lost:
    
        if (l.C3492.m11488() == false) goto L15;
     */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannableString m48355() {
        /*
            Method dump skipped, instruction units count: 1392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC21202.m48355():android.text.SpannableString");
    }
}
