package l;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SpinnerAdapter;
import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.ec.custom.sec.SecP160R2Field;

/* JADX INFO: renamed from: l.ۢ۬ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q62Z */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractActivityC10144 extends AbstractActivityC17204 implements AdapterView.OnItemLongClickListener, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ֡ᩳۜ, reason: not valid java name and contains not printable characters */
    private static final short[] f32484 = {7502, 13243, 13245, 13230, 13217, 13244, 13311, 507, 25190, 32595, 31813, 3169, 19, 5927, 5113, 5750, -2849, 4119, -3097, -3615, 3210, 2256, 25236, 25230, 2273, 28947, 20316, -28248, -27989, 26874, 27184, -30278, -26811, 27696, -30814, 22473, -29279, 32372, -25815, 26850, 23916, 25033, 24027, 5316, -850, -857, -838, -854, -863, -852, -873, -836, -863, -840, -873, -853, -864, -851, -853, -861, -873, -836, -838, -855, -858, -837, -860, -855, -836, -863, -857, -858, -873, -850, -857, -838, -859, -855, -836, -873, -853, -857, -858, -836, -838, -857, -860, 32421, -32486, 28360, 6828, -31706, -26722, -25941, -27070, 32732, 19501, -24672, 23053, -24736, 27394, 19558, -30327, 22211, 24938, 31196, -31784, 25139, 25467, 8234, 13606, -15312, 7655, 15495, 244, 12896, 2883, -6988, -9095, 9571, 1350, 7194, -7059, -6217, -5832, -10022, -7732, -1597, 683, -14450, -13244, -5134, 5460, -2500, 4368, -3662, 6617, -6086, -14768, -4865, 5209, 884, 4252, -12833, 1727, -9772, -13310, -4437, -27026, -27031, -27012, -27031, -27016, -27054, -27050, -27031, -27025, -27012, -27021, -27026, -27023, -27012, -27031, -27020, -27022, -27021, -27070, -27024, -27022, -27015, -27016, -27070, -27026, -27022, -27025, -27031, -27016, -27015, 118, 17093, 23636, -27754, 18348, 23519, -32381, 19478, -20683, 16678, 211, 19400, -24517, 16807, 30908, -20218, 30176, -17550, 32527, 19003, -17304, 19611, 17694, 19994, -21256, -16569, 18821, -17454, 21245, -18411, 20569, 18436, 30601, 29769, -19907, 19923, 21361, 29045, 22895, -21426, -17161, -21586, -19528, 23894, -19976, 18943, 28880, 31813, 23032, -16641, -19586, 23251, 32344, 31366, -22453, -16850, 21273, 23110, 21107, 20246, -17342, 17096, 10587, 10576, 10589, 10587, 10579, 10599, 10572, 10570, 10585, 10582, 10571, 10580, 10585, 10572, 10577, 10583, 10582, 10599, 10590, 10583, 10570, 10581, 10585, 10572, 10599, 10587, 10583, 10582, 10572, 10570, 10583, 10580, 10590, 10583, 10570, 10586, 10577, 10588, 10599, 10572, 10577, 10568, 10599, 18944, 26207, 18460, -19186, 26116, 29506, 23776, 29914, 22427, 32406, -17990, 29212, 29892, 30491, 28754, -19150, -21056, 17950, 10572, 10570, 10585, 10582, 10571, 10580, 10585, 10572, 10577, 10583, 10582, 10599, 10581, 10583, 10588, 10589, 10599, 10571, 10583, 10570, 10572, 10589, 10588, -17113, -21917, -23109, 7232, 6995, 6996, 6977, 6996, 6981, 7023, 7019, 7750, 21872, -21825, -24146, 8905, 3975, 3976, 3973, 3976};

    /* JADX INFO: renamed from: ܰ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f32485 = 0;

    /* JADX INFO: renamed from: ᩶᩷, reason: not valid java name and contains not printable characters */
    public static final AbstractC22044 f32486;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public boolean f32487;

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public C17930 f32488;

    /* JADX INFO: renamed from: ۘ᩷, reason: not valid java name and contains not printable characters */
    public int f32489;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public int[] f32490;

    /* JADX INFO: renamed from: ۛ᩷, reason: not valid java name and contains not printable characters */
    public String f32491;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public int f32492;

    /* JADX INFO: renamed from: ۨ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f32493;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public boolean f32494;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public int f32495;

    /* JADX INFO: renamed from: ܶ᩷, reason: not valid java name and contains not printable characters */
    public int f32496;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f32497;

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f32498;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public C11870 f32499;

    /* JADX INFO: renamed from: ᩵᩷, reason: not valid java name and contains not printable characters */
    public boolean f32500;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public C19095 f32501;

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public boolean f32502;

    /* JADX INFO: renamed from: ᩺᩷, reason: not valid java name and contains not printable characters */
    public DialogInterfaceOnDismissListenerC20840 f32503;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public boolean f32504;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo19736(RunnableC23571 runnableC23571);

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean mo26247() {
        return false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void mo26248(int i) {
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean mo26249(String str) {
        return true;
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public String mo26253() {
        return null;
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public boolean mo26254() {
        return false;
    }

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo19737(boolean z);

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo26257() {
        return false;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public CharSequence mo26258(String str) {
        return str;
    }

    /* JADX INFO: renamed from: ᩻ۙ */
    public abstract void mo19738();

    /* JADX WARN: Code duplicated, block: B:85:0x0368 A[PHI: r6 r11 r14 r17 r23 r24 r25 r26 r30 r31
      0x0368: PHI (r6v7 l.ۧ᩶᩻) = (r6v2 l.ۧ᩶᩻), (r6v2 l.ۧ᩶᩻), (r6v3 l.ۧ᩶᩻), (r6v2 l.ۧ᩶᩻), (r6v2 l.ۧ᩶᩻) binds: [B:84:0x0362, B:80:0x0325, B:67:0x02ad, B:37:0x0163, B:15:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x0368: PHI (r11v7 l.ۧ᩶᩻) = (r11v2 l.ۧ᩶᩻), (r11v2 l.ۧ᩶᩻), (r11v2 l.ۧ᩶᩻), (r11v3 l.ۧ᩶᩻), (r11v2 l.ۧ᩶᩻) binds: [B:84:0x0362, B:80:0x0325, B:67:0x02ad, B:37:0x0163, B:15:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x0368: PHI (r14v7 java.lang.String) = 
      (r14v2 java.lang.String)
      (r14v2 java.lang.String)
      (r14v3 java.lang.String)
      (r14v2 java.lang.String)
      (r14v2 java.lang.String)
     binds: [B:84:0x0362, B:80:0x0325, B:67:0x02ad, B:37:0x0163, B:15:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x0368: PHI (r17v7 java.lang.String) = 
      (r17v2 java.lang.String)
      (r17v2 java.lang.String)
      (r17v2 java.lang.String)
      (r17v3 java.lang.String)
      (r17v2 java.lang.String)
     binds: [B:84:0x0362, B:80:0x0325, B:67:0x02ad, B:37:0x0163, B:15:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x0368: PHI (r23v20 l.ۧ᩶᩻) = (r23v4 l.ۧ᩶᩻), (r23v11 l.ۧ᩶᩻), (r23v2 l.ۧ᩶᩻), (r23v2 l.ۧ᩶᩻), (r23v2 l.ۧ᩶᩻) binds: [B:84:0x0362, B:80:0x0325, B:67:0x02ad, B:37:0x0163, B:15:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x0368: PHI (r24v32 int) = (r24v25 int), (r24v26 int), (r24v2 int), (r24v2 int), (r24v2 int) binds: [B:84:0x0362, B:80:0x0325, B:67:0x02ad, B:37:0x0163, B:15:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x0368: PHI (r25v38 short[]) = (r25v30 short[]), (r25v31 short[]), (r25v2 short[]), (r25v2 short[]), (r25v2 short[]) binds: [B:84:0x0362, B:80:0x0325, B:67:0x02ad, B:37:0x0163, B:15:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x0368: PHI (r26v38 int) = (r26v31 int), (r26v34 int), (r26v2 int), (r26v2 int), (r26v2 int) binds: [B:84:0x0362, B:80:0x0325, B:67:0x02ad, B:37:0x0163, B:15:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x0368: PHI (r30v55 int) = (r30v33 int), (r30v35 int), (r30v38 int), (r30v43 int), (r30v56 int) binds: [B:84:0x0362, B:80:0x0325, B:67:0x02ad, B:37:0x0163, B:15:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x0368: PHI (r31v26 int) = (r31v18 int), (r31v22 int), (r31v1 int), (r31v1 int), (r31v1 int) binds: [B:84:0x0362, B:80:0x0325, B:67:0x02ad, B:37:0x0163, B:15:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26227(AbstractActivityC10144 abstractActivityC10144) {
        int i;
        int iM2761;
        int i2;
        int i3;
        int i4;
        int i5;
        short s;
        int i6;
        short[] sArr;
        int i7;
        int i8;
        int i9;
        int i10;
        int iM2762;
        int i11;
        int iM2763;
        int i12;
        int i13;
        int iM2764;
        int i14;
        int iM2765;
        int i15;
        abstractActivityC10144 = abstractActivityC10144;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = -1978574626;
        int i21 = C0773.f2792;
        int i22 = AbstractC0116.f1064;
        int iM3169 = (C0773.m3169("᩵ܰ") ^ i22) * (-125);
        int i23 = ((iM3169 ^ i21) * 8083) ^ 1241706043;
        int i24 = iM3169 ^ 692656424;
        C11870 c11870 = null;
        C11870 c11871 = null;
        C11870 c11872 = null;
        String strM28300 = null;
        short[] sArr2 = null;
        int iM29755 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        short s2 = 0;
        C11870 c11873 = null;
        String strM4939 = null;
        C11870 c11874 = null;
        String strM12925 = null;
        int i31 = 0;
        String strM12149 = null;
        String strM9847 = null;
        C11870 c11875 = null;
        int i32 = 0;
        while (true) {
            i20 = i24 ^ (i23 & (((i20 ^ i21) * 26513) >> 31));
            switch (i20) {
                case -2123132460:
                case 1194786316:
                    C1783.m6232();
                    if (C2375.f7641 <= 0) {
                        i = i32;
                        i4 = i29;
                        i5 = i30;
                        s = s2;
                        short[] sArr3 = sArr2;
                        i28 = i28;
                        sArr = sArr3;
                        iM2763 = C0773.m3169("᩸ۘ") ^ i22;
                        i6 = iM29755;
                        i12 = ((iM2763 ^ i21) * 14829) ^ 2138369390;
                        i13 = 1267882522;
                        int i33 = iM2763 ^ i13;
                        s2 = s;
                        i30 = i5;
                        i32 = i;
                        i24 = i33;
                        i23 = i12;
                        iM29755 = i6;
                        i29 = i4;
                        int i34 = i28;
                        sArr2 = sArr;
                        i28 = i34;
                    }
                    i7 = i32;
                    i8 = i29;
                    i9 = i30;
                    i10 = iM29755;
                    short[] sArr4 = sArr2;
                    i28 = i28;
                    sArr = sArr4;
                    iM2762 = C0619.m2761("ۘܿ") ^ i21;
                    i23 = ((iM2762 ^ i22) * (-20989)) ^ (-2104659644);
                    i11 = 454077763;
                    int i35 = iM2762 ^ i11;
                    i30 = i9;
                    iM29755 = i10;
                    i32 = i7;
                    i24 = i35;
                    i29 = i8;
                    abstractActivityC10144 = abstractActivityC10144;
                    int i36 = i28;
                    sArr2 = sArr;
                    i28 = i36;
                    break;
                case -2058976138:
                case 1205636067:
                    i = i32;
                    int i37 = i29;
                    int i38 = i30;
                    C11870 c11876 = abstractActivityC10144.f32499;
                    i28 = 0;
                    sArr2 = f32484;
                    if (C2419.m8174() >= 0) {
                        c11870 = c11876;
                        i29 = i37;
                        i30 = i38;
                        iM2761 = C0619.m2761("ܳܿ") ^ i21;
                        i2 = ((iM2761 ^ i22) * (-28295)) ^ 731916785;
                        i3 = 1330139367;
                        int i39 = iM2761 ^ i3;
                        i32 = i;
                        i24 = i39;
                        i23 = i2;
                    } else {
                        int iM31610 = C0773.m3169("ۚۤ") ^ i22;
                        i23 = ((iM31610 ^ i21) * 27139) ^ (-2109954847);
                        i30 = i38;
                        i32 = i;
                        i24 = iM31610 ^ 425891806;
                        c11870 = c11876;
                        i29 = i37;
                    }
                    break;
                case -2046225526:
                case -357404081:
                    c11870.m29747(i28, C0619.m2761(C20932.m47853(sArr2, i29, i30, i25)) ^ 2126347753);
                    break;
                case -2020915687:
                case 2112624014:
                    i = i32;
                    c11872 = abstractActivityC10144.f32499;
                    strM4939 = C1343.m4939(f32484, 37, 3, i25);
                    if (RunnableC3646.m11813() != 0) {
                        iM2761 = C0619.m2761("ܳܿ") ^ i21;
                        i2 = ((iM2761 ^ i22) * (-28295)) ^ 731916785;
                        i3 = 1330139367;
                    } else {
                        iM2761 = C0619.m2761("ۡ᩶") ^ i22;
                        i2 = ((iM2761 ^ i21) * (-13145)) ^ (-574128264);
                        i3 = 768060330;
                    }
                    int i310 = iM2761 ^ i3;
                    i32 = i;
                    i24 = i310;
                    i23 = i2;
                    break;
                case -1957822050:
                case 1806340860:
                    i32 = i32;
                    int i40 = i28;
                    sArr = sArr2;
                    i29 = i29;
                    i30 = i30;
                    iM29755 = abstractActivityC10144.f32499.m29755();
                    if (iM29755 != 0) {
                        int iM2766 = (C0619.m2761("ᩴۧ") + i22) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        int i41 = ((iM2766 ^ i21) * 15995) ^ 904898652;
                        i29 = i29;
                        i30 = i30;
                        i32 = i32;
                        i24 = iM2766 ^ 1625419013;
                        sArr2 = sArr;
                        i28 = i40;
                        i23 = i41;
                        abstractActivityC10144 = abstractActivityC10144;
                    } else {
                        iM2764 = (C0773.m3169("ܶܽ") ^ i21) * 17;
                        i28 = i40;
                        i23 = ((iM2764 ^ i22) * 32223) ^ (-1497658533);
                        i14 = -615248211;
                        int i42 = iM2764 ^ i14;
                        i29 = i29;
                        i30 = i30;
                        i32 = i32;
                        i24 = i42;
                        abstractActivityC10144 = abstractActivityC10144;
                        int i311 = i28;
                        sArr2 = sArr;
                        i28 = i311;
                    }
                    break;
                case -1877205457:
                case 424487865:
                    sArr = sArr2;
                    i25 = 342;
                    iM2764 = (C0773.m3169("᩺ܰ") ^ i21) * (-109);
                    i23 = ((iM2764 ^ i22) * 20961) ^ 320612979;
                    i14 = 1486930545;
                    int i43 = iM2764 ^ i14;
                    i29 = i29;
                    i30 = i30;
                    i32 = i32;
                    i24 = i43;
                    abstractActivityC10144 = abstractActivityC10144;
                    int i312 = i28;
                    sArr2 = sArr;
                    i28 = i312;
                    break;
                case -1750612250:
                case 936842186:
                    c11875 = abstractActivityC10144.f32499;
                    i = i32;
                    strM28300 = C11235.m28300(f32484, 40, 3, i25);
                    if (C3033.f9831 < 0) {
                        iM2761 = C0619.m2761("ۚ᩹") ^ i21;
                        i2 = ((iM2761 ^ i22) * 9865) ^ 1835819559;
                        i3 = 1485487605;
                        int i313 = iM2761 ^ i3;
                        i32 = i;
                        i24 = i313;
                        i23 = i2;
                    } else {
                        i4 = i29;
                        i5 = i30;
                        s = s2;
                        i6 = iM29755;
                        short[] sArr5 = sArr2;
                        i28 = i28;
                        sArr = sArr5;
                        iM2763 = C0619.m2761("ۧۢ") ^ i21;
                        i12 = ((iM2763 ^ i22) * (-17549)) ^ 1698086482;
                        i13 = 900225662;
                        int i314 = iM2763 ^ i13;
                        s2 = s;
                        i30 = i5;
                        i32 = i;
                        i24 = i314;
                        i23 = i12;
                        iM29755 = i6;
                        i29 = i4;
                        int i315 = i28;
                        sArr2 = sArr;
                        i28 = i315;
                    }
                    break;
                case -1699085259:
                case -238438732:
                    c11873.m29747(i27, C0619.m2761(strM12925) ^ 2098704072);
                    break;
                case -1371281249:
                case 1770917517:
                    RunnableC0334.m2063();
                    i = i32;
                    iM2761 = C0619.m2761("ܳܿ") ^ i21;
                    i2 = ((iM2761 ^ i22) * (-28295)) ^ 731916785;
                    i3 = 1330139367;
                    int i316 = iM2761 ^ i3;
                    i32 = i;
                    i24 = i316;
                    i23 = i2;
                    break;
                case -1275402182:
                case 1771629428:
                    i = i32;
                    i26 = 1;
                    if (iM29755 != 1) {
                        iM2761 = C0619.m2761("ܿܽ") ^ i21;
                        i2 = ((iM2761 ^ i22) * (-4321)) ^ 1013877934;
                        i3 = -2097925900;
                    } else {
                        iM2761 = (C0619.m2761("᩻ۨ") ^ i22) * 21;
                        i2 = ((iM2761 ^ i21) * (-7519)) ^ 279239455;
                        i3 = 1047229552;
                    }
                    int i317 = iM2761 ^ i3;
                    i32 = i;
                    i24 = i317;
                    i23 = i2;
                    break;
                case -1243803982:
                case -734201827:
                    i7 = i32;
                    i8 = i29;
                    i9 = i30;
                    i10 = iM29755;
                    short[] sArr6 = sArr2;
                    i28 = i28;
                    sArr = sArr6;
                    s2 = f32484[24];
                    if (RunnableC0334.m2063()) {
                        iM2762 = C0619.m2761("ۘܿ") ^ i21;
                        i23 = ((iM2762 ^ i22) * (-20989)) ^ (-2104659644);
                        i11 = 454077763;
                    } else {
                        iM2762 = (i21 - C0619.m2761("ۗܺ")) * 71;
                        i23 = ((iM2762 ^ i22) * (-16159)) ^ (-838846243);
                        i11 = -459157479;
                    }
                    int i318 = iM2762 ^ i11;
                    i30 = i9;
                    iM29755 = i10;
                    i32 = i7;
                    i24 = i318;
                    i29 = i8;
                    abstractActivityC10144 = abstractActivityC10144;
                    int i319 = i28;
                    sArr2 = sArr;
                    i28 = i319;
                    break;
                case -1159523362:
                case 1784829020:
                    i = i32;
                    if (abstractActivityC10144.f32499.m29750()) {
                        iM2761 = C0773.m3169("ۚۙ") ^ i21;
                        i2 = ((iM2761 ^ i22) * (-25241)) ^ (-22163512);
                        i3 = 1343638571;
                    } else {
                        iM2761 = (C0773.m3169("ܰ᩺") + i21) * (-51);
                        i2 = ((iM2761 ^ i22) * (-26385)) ^ (-1878137544);
                        i3 = 858874666;
                    }
                    int i3110 = iM2761 ^ i3;
                    i32 = i;
                    i24 = i3110;
                    i23 = i2;
                    break;
                case -1089696400:
                case -188726255:
                    sArr = sArr2;
                    i25 = 31417;
                    iM2764 = (C0773.m3169("᩺ܰ") ^ i21) * (-109);
                    i23 = ((iM2764 ^ i22) * 20961) ^ 320612979;
                    i14 = 1486930545;
                    int i44 = iM2764 ^ i14;
                    i29 = i29;
                    i30 = i30;
                    i32 = i32;
                    i24 = i44;
                    abstractActivityC10144 = abstractActivityC10144;
                    int i3111 = i28;
                    sArr2 = sArr;
                    i28 = i3111;
                    break;
                case -959160771:
                case 34757091:
                    break;
                case -872167237:
                case 702134691:
                    c11872.m29747(i31, C0773.m3169(strM4939) ^ 2128764092);
                    break;
                case -719420269:
                case 579399613:
                    i = i32;
                    c11873 = abstractActivityC10144.f32499;
                    strM12925 = C3998.m12925(f32484, 34, 3, i25);
                    if (C2354.f7599 >= 0) {
                        iM2761 = (i22 - C0619.m2761("᩺ۜ")) * 9;
                        i2 = ((iM2761 ^ i21) * (-2151)) ^ 36457613;
                        i3 = 565804157;
                    } else {
                        iM2761 = (i21 - C0619.m2761("۫ۢ")) * 5;
                        i2 = ((iM2761 ^ i22) * (-11033)) ^ (-38592565);
                        i3 = -1481765713;
                    }
                    int i3112 = iM2761 ^ i3;
                    i32 = i;
                    i24 = i3112;
                    i23 = i2;
                    break;
                case -598206217:
                case 1142716725:
                    i32 = 4;
                    if (iM29755 != 4) {
                        iM2765 = C0773.m3169("ᩴ۬") ^ i22;
                        i2 = ((iM2765 ^ i21) * 19441) ^ (-276555069);
                        i15 = -1026975367;
                    } else {
                        iM2765 = (C0619.m2761("ܳۗ") + i22) * (-59);
                        i2 = ((iM2765 ^ i21) * (-23761)) ^ (-653459093);
                        i15 = -1694415834;
                    }
                    i24 = iM2765 ^ i15;
                    i23 = i2;
                    break;
                case -366187967:
                case -234879922:
                    i = i32;
                    i31 = 3;
                    if (iM29755 != 3) {
                        iM2761 = (C0773.m3169("ܳۘ") ^ i21) * 79;
                        i2 = ((iM2761 ^ i22) * 22371) ^ (-123513030);
                        i3 = 451841569;
                    } else {
                        iM2761 = C0773.m3169("ۢܽ") ^ i22;
                        i2 = ((iM2761 ^ i21) * 25611) ^ (-1072168307);
                        i3 = -2087360706;
                    }
                    int i3113 = iM2761 ^ i3;
                    i32 = i;
                    i24 = i3113;
                    i23 = i2;
                    break;
                case -261443709:
                case 519592120:
                    i = i32;
                    i27 = 2;
                    if (iM29755 != 2) {
                        iM2761 = C0619.m2761("ۙ֫") ^ i22;
                        i2 = ((iM2761 ^ i21) * (-13)) ^ (-480827830);
                        i3 = -298693105;
                    } else {
                        iM2761 = C0773.m3169("ۡܰ") ^ i22;
                        i2 = ((iM2761 ^ i21) * (-31009)) ^ (-542602556);
                        i3 = 1853650319;
                    }
                    int i3114 = iM2761 ^ i3;
                    i32 = i;
                    i24 = i3114;
                    i23 = i2;
                    break;
                case -175945706:
                case -105186303:
                    i32 = i32;
                    i29 = i29;
                    i30 = i30;
                    short[] sArr7 = sArr2;
                    i28 = i28;
                    sArr = sArr7;
                    int i45 = i18 + i19;
                    if ((i45 + i45) - i17 >= 0) {
                        iM2764 = C0773.m3169("ۖ᩶") ^ i22;
                        i23 = ((iM2764 ^ i21) * (-16563)) ^ (-2147047257);
                        i14 = -1811804685;
                    } else {
                        iM2764 = (i22 - C0619.m2761("᩸ܶ")) * (-51);
                        i23 = ((iM2764 ^ i21) * 14515) ^ 122378204;
                        i14 = -1854613738;
                    }
                    int i46 = iM2764 ^ i14;
                    i29 = i29;
                    i30 = i30;
                    i32 = i32;
                    i24 = i46;
                    abstractActivityC10144 = abstractActivityC10144;
                    int i3115 = i28;
                    sArr2 = sArr;
                    i28 = i3115;
                    break;
                case -107707119:
                case 88125079:
                    if (C23916.m53419() == 0) {
                        i7 = i32;
                        i8 = i29;
                        i9 = i30;
                        i10 = iM29755;
                        short[] sArr8 = sArr2;
                        i28 = i28;
                        sArr = sArr8;
                        iM2762 = C0619.m2761("ۘܿ") ^ i21;
                        i23 = ((iM2762 ^ i22) * (-20989)) ^ (-2104659644);
                        i11 = 454077763;
                        int i3116 = iM2762 ^ i11;
                        i30 = i9;
                        iM29755 = i10;
                        i32 = i7;
                        i24 = i3116;
                        i29 = i8;
                        abstractActivityC10144 = abstractActivityC10144;
                        int i3117 = i28;
                        sArr2 = sArr;
                        i28 = i3117;
                    } else {
                        i = i32;
                        iM2761 = C0619.m2761("ܳܿ") ^ i21;
                        i2 = ((iM2761 ^ i22) * (-28295)) ^ 731916785;
                        i3 = 1330139367;
                        int i3118 = iM2761 ^ i3;
                        i32 = i;
                        i24 = i3118;
                        i23 = i2;
                    }
                    break;
                case 6999313:
                case 955366155:
                    c11871.m29747(i26, C0773.m3169(strM9847) ^ 2099950880);
                    break;
                case 173269117:
                case 851561839:
                    c11874.m29747(i27, C0773.m3169(strM12149) ^ 2097583870);
                    break;
                case 366240980:
                case 494711080:
                    i = i32;
                    C11870 c11877 = c11870;
                    int i47 = i28;
                    short[] sArr9 = sArr2;
                    i29 = 25;
                    i30 = 3;
                    if (C0487.f2131 <= 0) {
                        sArr2 = sArr9;
                        c11870 = c11877;
                        i28 = i47;
                        iM2761 = C0619.m2761("ܳܿ") ^ i21;
                        i2 = ((iM2761 ^ i22) * (-28295)) ^ 731916785;
                        i3 = 1330139367;
                        int i3119 = iM2761 ^ i3;
                        i32 = i;
                        i24 = i3119;
                        i23 = i2;
                    } else {
                        int iM2767 = C0619.m2761("ۧۚ") ^ i21;
                        i23 = ((iM2767 ^ i22) * (-6621)) ^ 1188383703;
                        sArr2 = sArr9;
                        i28 = i47;
                        i32 = i;
                        i24 = iM2767 ^ (-1741892043);
                        c11870 = c11877;
                    }
                    break;
                case 420294589:
                case 1936270752:
                    i = i32;
                    c11874 = abstractActivityC10144.f32499;
                    strM12149 = C3734.m12149(f32484, 31, 3, i25);
                    if (C2375.f7641 > 0) {
                        iM2761 = (C0619.m2761("᩸᩹") + i22) * 25;
                        i2 = ((iM2761 ^ i21) * 91) ^ (-2060624602);
                        i3 = 1436070682;
                        int i31110 = iM2761 ^ i3;
                        i32 = i;
                        i24 = i31110;
                        i23 = i2;
                    } else {
                        i4 = i29;
                        i5 = i30;
                        s = s2;
                        short[] sArr10 = sArr2;
                        i28 = i28;
                        sArr = sArr10;
                        iM2763 = C0773.m3169("᩸ۘ") ^ i22;
                        i6 = iM29755;
                        i12 = ((iM2763 ^ i21) * 14829) ^ 2138369390;
                        i13 = 1267882522;
                        int i3120 = iM2763 ^ i13;
                        s2 = s;
                        i30 = i5;
                        i32 = i;
                        i24 = i3120;
                        i23 = i12;
                        iM29755 = i6;
                        i29 = i4;
                        int i31111 = i28;
                        sArr2 = sArr;
                        i28 = i31111;
                    }
                    break;
                case 705964931:
                case 1036116670:
                    c11875.m29747(i32, C0619.m2761(strM28300) ^ 2121551705);
                    break;
                case 756512595:
                case 1227701688:
                    i = i32;
                    i4 = i29;
                    i5 = i30;
                    s = s2;
                    i6 = iM29755;
                    short[] sArr11 = sArr2;
                    i28 = i28;
                    sArr = sArr11;
                    int i48 = s + 12264;
                    if (C2878.f9462) {
                        i16 = i48;
                        iM2763 = C0619.m2761("ۧۢ") ^ i21;
                        i12 = ((iM2763 ^ i22) * (-17549)) ^ 1698086482;
                        i13 = 900225662;
                        int i3121 = iM2763 ^ i13;
                        s2 = s;
                        i30 = i5;
                        i32 = i;
                        i24 = i3121;
                        i23 = i12;
                    } else {
                        int iM31611 = (C0773.m3169("ۚᩴ") ^ i22) * (-15);
                        i16 = i48;
                        s2 = s;
                        i23 = ((iM31611 ^ i21) * (-11675)) ^ 1725686315;
                        i30 = i5;
                        i32 = i;
                        i24 = iM31611 ^ (-162948434);
                    }
                    iM29755 = i6;
                    i29 = i4;
                    int i31112 = i28;
                    sArr2 = sArr;
                    i28 = i31112;
                    break;
                case 1034170105:
                case 1334811846:
                    C2354.m7983();
                    if (C13473.f42873 == 0) {
                        i = i32;
                        iM2761 = (i22 - C0619.m2761("᩺ۜ")) * 9;
                        i2 = ((iM2761 ^ i21) * (-2151)) ^ 36457613;
                        i3 = 565804157;
                        int i31113 = iM2761 ^ i3;
                        i32 = i;
                        i24 = i31113;
                        i23 = i2;
                    }
                    i = i32;
                    iM2761 = C0619.m2761("ܳܿ") ^ i21;
                    i2 = ((iM2761 ^ i22) * (-28295)) ^ 731916785;
                    i3 = 1330139367;
                    int i31114 = iM2761 ^ i3;
                    i32 = i;
                    i24 = i31114;
                    i23 = i2;
                    break;
                case 1037487650:
                case 1106995938:
                    C1826.m6301();
                    break;
                case 1212638022:
                case 1746547509:
                    i = i32;
                    c11871 = abstractActivityC10144.f32499;
                    strM9847 = C3033.m9847(f32484, 28, 3, i25);
                    if (C1321.f4751 >= 0) {
                        iM2761 = C0619.m2761("ܳܿ") ^ i21;
                        i2 = ((iM2761 ^ i22) * (-28295)) ^ 731916785;
                        i3 = 1330139367;
                    } else {
                        iM2761 = C0619.m2761("֨ۢ") ^ i21;
                        i2 = ((iM2761 ^ i22) * 583) ^ (-445651437);
                        i3 = 1928594306;
                    }
                    int i31115 = iM2761 ^ i3;
                    i32 = i;
                    i24 = i31115;
                    i23 = i2;
                    break;
                default:
                    i = i32;
                    i4 = i29;
                    i5 = i30;
                    short[] sArr12 = sArr2;
                    i28 = i28;
                    sArr = sArr12;
                    i17 = i16 * i16;
                    s = s2;
                    i18 = s * s;
                    i19 = 150405696;
                    if (C3492.m11488()) {
                        i6 = iM29755;
                        iM2763 = C0773.m3169("۫ܰ") ^ i21;
                        i12 = ((iM2763 ^ i22) * 23603) ^ (-1219928313);
                        i13 = -2028081894;
                    } else {
                        iM2763 = C0773.m3169("᩸ۘ") ^ i22;
                        i6 = iM29755;
                        i12 = ((iM2763 ^ i21) * 14829) ^ 2138369390;
                        i13 = 1267882522;
                    }
                    int i3122 = iM2763 ^ i13;
                    s2 = s;
                    i30 = i5;
                    i32 = i;
                    i24 = i3122;
                    i23 = i12;
                    iM29755 = i6;
                    i29 = i4;
                    int i31116 = i28;
                    sArr2 = sArr;
                    i28 = i31116;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0051 A[PHI: r18
      0x0051: PHI (r18v4 java.lang.String) = (r18v2 java.lang.String), (r18v1 java.lang.String), (r18v1 java.lang.String), (r18v1 java.lang.String) binds: [B:29:0x00c2, B:19:0x0063, B:17:0x0060, B:13:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0082 A[PHI: r1 r2
      0x0082: PHI (r1v59 int) = (r1v1 int), (r1v1 int), (r1v64 int) binds: [B:17:0x0060, B:9:0x0046, B:25:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r2v3 int) = (r2v1 int), (r2v1 int), (r2v5 int) binds: [B:17:0x0060, B:9:0x0046, B:25:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x020d A[PHI: r6 r9 r17
      0x020d: PHI (r6v3 int) = (r6v2 int), (r6v1 int) binds: [B:58:0x020b, B:6:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x020d: PHI (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:58:0x020b, B:6:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x020d: PHI (r17v27 int) = (r17v9 int), (r17v28 int) binds: [B:58:0x020b, B:6:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0263 A[PHI: r4 r7 r8 r13 r17
      0x0263: PHI (r4v3 char) = (r4v2 char), (r4v1 char), (r4v1 char), (r4v1 char) binds: [B:66:0x0261, B:54:0x01ea, B:33:0x00e3, B:11:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r7v3 int) = (r7v1 int), (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:66:0x0261, B:54:0x01ea, B:33:0x00e3, B:11:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r8v3 short) = (r8v1 short), (r8v2 short), (r8v1 short), (r8v1 short) binds: [B:66:0x0261, B:54:0x01ea, B:33:0x00e3, B:11:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r13v3 int) = (r13v1 int), (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:66:0x0261, B:54:0x01ea, B:33:0x00e3, B:11:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x0263: PHI (r17v25 int) = (r17v7 int), (r17v10 int), (r17v17 int), (r17v26 int) binds: [B:66:0x0261, B:54:0x01ea, B:33:0x00e3, B:11:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0294 A[PHI: r3 r5 r17
      0x0294: PHI (r3v3 short[]) = (r3v2 short[]), (r3v1 short[]), (r3v1 short[]) binds: [B:70:0x0292, B:62:0x0243, B:15:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0294: PHI (r5v3 short) = (r5v1 short), (r5v2 short), (r5v1 short) binds: [B:70:0x0292, B:62:0x0243, B:15:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x0294: PHI (r17v21 int) = (r17v6 int), (r17v8 int), (r17v24 int) binds: [B:70:0x0292, B:62:0x0243, B:15:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26216(AbstractActivityC10144 abstractActivityC10144) {
        int iM2761;
        int i;
        int i2;
        int iM2762 = 0;
        int i3 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        short s2 = 0;
        int i6 = 0;
        int i7 = 0;
        short[] sArr2 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = -121348890;
        int i11 = C3779.f12953;
        int i12 = C2834.f9334;
        int iM3169 = (C0773.m3169("ܿܽ") + i11) * 115;
        int i13 = ((iM3169 ^ i12) * (-23121)) ^ (-123633808);
        int i14 = iM3169 ^ 559953305;
        String strM6366 = null;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i12) * (-26821)) >> 31));
            switch (i10) {
                case -1941440961:
                case -815472672:
                    iM2762 = C0619.m2761(strM6366);
                    if (C2354.f7599 >= 0) {
                        i3 = 2124643993;
                        iM2761 = (i11 - C0619.m2761("᩵᩻")) * (-61);
                        iM2762 = iM2762;
                        i = ((iM2761 ^ i12) * 24547) ^ (-1733796674);
                        i2 = -1545383088;
                        int i15 = iM2762;
                        i14 = iM2761 ^ i2;
                        i13 = i;
                        iM2762 = i15;
                    } else {
                        int iM31610 = (C0773.m3169("۟ۖ") ^ i12) * (-111);
                        i14 = iM31610 ^ (-2045393674);
                        i13 = ((iM31610 ^ i11) * (-14191)) ^ (-1119516511);
                        i3 = 2124643993;
                    }
                    break;
                case -1900540315:
                case -1276117759:
                    iM2762 = iM2762;
                    sArr = f32484;
                    if (C1343.f4799 != 0) {
                        iM2761 = (C0773.m3169("ۧ᩷") ^ i12) * (-37);
                        i = ((iM2761 ^ i11) * (-17573)) ^ 1195930868;
                        i2 = 1292989575;
                    } else {
                        iM2761 = (C0619.m2761("ۡ᩻") + i12) * (-5);
                        i = ((iM2761 ^ i11) * 14263) ^ 1150148828;
                        i2 = 604900660;
                    }
                    int i16 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i16;
                    break;
                case -1894491457:
                case 1469300168:
                    iM2762 = iM2762;
                    if (abstractActivityC10144.m26224(true)) {
                        iM2761 = (C0619.m2761("᩻ۚ") ^ i11) * 63;
                        i = ((iM2761 ^ i12) * 15921) ^ (-396422396);
                        i2 = -666300019;
                    } else {
                        iM2761 = (i11 - C0619.m2761("ᩴ᩹")) * 83;
                        i = ((iM2761 ^ i12) * (-23459)) ^ (-1344864061);
                        i2 = 350093384;
                    }
                    int i17 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i17;
                    break;
                case -1747113988:
                case -530811596:
                    iM2762 = iM2762;
                    i5 = i4 * i4;
                    s2 = 2;
                    if (C2023.m6964() <= 0) {
                        iM2761 = C0619.m2761("ᩴۘ") ^ i12;
                        i = ((iM2761 ^ i11) * (-30907)) ^ (-1110191199);
                        i2 = -1142724875;
                    } else {
                        iM2761 = C0619.m2761("֨ۧ") ^ i11;
                        i = ((iM2761 ^ i12) * 10629) ^ 1164474610;
                        i2 = 1369327259;
                    }
                    int i18 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i18;
                    break;
                case -1578398747:
                case -259292062:
                    i7 = 61517;
                    iM2761 = C0619.m2761("ۚۙ") ^ i12;
                    i = ((iM2761 ^ i11) * 30535) ^ 477870936;
                    i2 = 416994087;
                    int i19 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i19;
                    break;
                case -1352113430:
                case -936981152:
                    strM6366 = RunnableC1848.m6366(sArr2, i8, i9, i7);
                    if (C2966.f9654 >= 0) {
                        iM2762 = iM2762;
                        iM2761 = C0773.m3169("ܳܽ") ^ i11;
                        i = ((iM2761 ^ i12) * 8987) ^ (-69864987);
                        i2 = 2011215625;
                    } else {
                        iM2761 = (C0619.m2761("ۧܰ") ^ i11) * 97;
                        iM2762 = iM2762;
                        i = ((iM2761 ^ i12) * 11069) ^ (-1684588372);
                        i2 = 1317927296;
                    }
                    int i110 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i110;
                    break;
                case -1264637728:
                case 58518398:
                    C3448.m11248();
                    AbstractC0116.m1243();
                    iM2762 = iM2762;
                    iM2761 = C0773.m3169("ܳܽ") ^ i11;
                    i = ((iM2761 ^ i12) * 8987) ^ (-69864987);
                    i2 = 2011215625;
                    int i111 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i111;
                    break;
                case -1117048836:
                case 1103513448:
                    iM2762 = iM2762;
                    s = sArr[c];
                    if (C3033.f9831 >= 0) {
                        iM2761 = (C0773.m3169("ۧ᩷") ^ i12) * (-37);
                        i = ((iM2761 ^ i11) * (-17573)) ^ 1195930868;
                        i2 = 1292989575;
                    } else {
                        iM2761 = C0773.m3169("᩶ܰ") ^ i11;
                        i = ((iM2761 ^ i12) * 21499) ^ 864157602;
                        i2 = 640499164;
                    }
                    int i112 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i112;
                    break;
                case -948331673:
                case -445071487:
                    C3690.m11987();
                    if (C3690.m11987()) {
                        iM2762 = iM2762;
                        iM2761 = C0773.m3169("ܳܽ") ^ i11;
                        i = ((iM2761 ^ i12) * 8987) ^ (-69864987);
                        i2 = 2011215625;
                    } else {
                        iM2761 = (i11 - C0619.m2761("᩵᩻")) * (-61);
                        iM2762 = iM2762;
                        i = ((iM2761 ^ i12) * 24547) ^ (-1733796674);
                        i2 = -1545383088;
                    }
                    int i113 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i113;
                    break;
                case -909067916:
                case 1584924757:
                    C17202.m40372();
                    break;
                case -849006785:
                case 1070781944:
                    i7 = 3532;
                    iM2761 = C0619.m2761("ۚۙ") ^ i12;
                    i = ((iM2761 ^ i11) * 30535) ^ 477870936;
                    i2 = 416994087;
                    int i114 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i114;
                    break;
                case -676985826:
                case 1230866556:
                    iM2762 = iM2762;
                    i9 = 3;
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0619.m2761("ᩴۘ") ^ i12;
                        i = ((iM2761 ^ i11) * (-30907)) ^ (-1110191199);
                        i2 = -1142724875;
                    } else {
                        iM2761 = C0619.m2761("ۖᩴ") ^ i12;
                        i = ((iM2761 ^ i11) * 17529) ^ 2060289906;
                        i2 = -2022730002;
                    }
                    int i115 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i115;
                    break;
                case -660961186:
                case 1186176117:
                    if (C13473.f42873 != 0) {
                        iM2761 = (i11 - C0619.m2761("᩵᩻")) * (-61);
                        iM2762 = iM2762;
                        i = ((iM2761 ^ i12) * 24547) ^ (-1733796674);
                        i2 = -1545383088;
                    } else {
                        iM2762 = iM2762;
                        iM2761 = C0619.m2761("ᩴۘ") ^ i12;
                        i = ((iM2761 ^ i11) * (-30907)) ^ (-1110191199);
                        i2 = -1142724875;
                    }
                    int i116 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i116;
                    break;
                case -445370822:
                case 754471561:
                    iM2762 = iM2762;
                    sArr2 = f32484;
                    i8 = 8;
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0773.m3169("ܳܽ") ^ i11;
                        i = ((iM2761 ^ i12) * 8987) ^ (-69864987);
                        i2 = 2011215625;
                    } else {
                        iM2761 = (C0773.m3169("ܽܶ") ^ i12) * (-115);
                        i = ((iM2761 ^ i11) * 9115) ^ (-1065134413);
                        i2 = 726499657;
                    }
                    int i117 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i117;
                    break;
                case -190191167:
                case 1188464362:
                    if (C2419.f7754 >= 0) {
                        iM2762 = iM2762;
                        iM2761 = (C0773.m3169("ۧ᩷") ^ i12) * (-37);
                        i = ((iM2761 ^ i11) * (-17573)) ^ 1195930868;
                        i2 = 1292989575;
                        int i118 = iM2762;
                        i14 = iM2761 ^ i2;
                        i13 = i;
                        iM2762 = i118;
                    }
                    iM2762 = iM2762;
                    iM2761 = C0773.m3169("ܳܽ") ^ i11;
                    i = ((iM2761 ^ i12) * 8987) ^ (-69864987);
                    i2 = 2011215625;
                    int i119 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i119;
                    break;
                case 263610256:
                case 278354374:
                    iM2762 = iM2762;
                    i4 = s + 1;
                    if (C2375.m8065() <= 0) {
                        iM2761 = (i11 - C0619.m2761("ۗᩳ")) * (-109);
                        i = ((iM2761 ^ i12) * (-27545)) ^ (-887081671);
                        i2 = 204739259;
                    } else {
                        iM2761 = (i12 - C0619.m2761("ۗۛ")) * (-37);
                        i = ((iM2761 ^ i11) * 24807) ^ (-1750066762);
                        i2 = 1780756176;
                    }
                    int i1110 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i1110;
                    break;
                case 423398913:
                case 427884273:
                    C3077.m10039(iM2762 ^ i3);
                    iM2762 = iM2762;
                    iM2761 = (i11 - C0619.m2761("ᩴ᩹")) * 83;
                    i = ((iM2761 ^ i12) * (-23459)) ^ (-1344864061);
                    i2 = 350093384;
                    int i1111 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i1111;
                    break;
                case 877007087:
                case 1871476523:
                    break;
                case 1377619846:
                case 1485865888:
                    iM2762 = iM2762;
                    if ((i6 + 1) - i5 > 0) {
                        iM2761 = (i11 - C0773.m3169("ܶ᩺")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM2761 ^ i12) * (-7361)) ^ (-1369406551);
                        i2 = -1359118233;
                    } else {
                        iM2761 = C0619.m2761("᩹֡") ^ i12;
                        i = ((iM2761 ^ i11) * (-25993)) ^ 953125925;
                        i2 = -2110807897;
                    }
                    int i1112 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i1112;
                    break;
                case 1468320122:
                case 1881829742:
                    iM2762 = iM2762;
                    c = 7;
                    if (C1080.m4050()) {
                        iM2761 = C0619.m2761("۬ۚ") ^ i11;
                        i = ((iM2761 ^ i12) * (-21047)) ^ 463315804;
                        i2 = 1751040816;
                    } else {
                        iM2761 = C0619.m2761("ᩴۘ") ^ i12;
                        i = ((iM2761 ^ i11) * (-30907)) ^ (-1110191199);
                        i2 = -1142724875;
                    }
                    int i1113 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i1113;
                    break;
                default:
                    iM2762 = iM2762;
                    i6 = s * s2;
                    if (C3734.f12817 >= 0) {
                        iM2761 = (i11 - C0619.m2761("ۗᩳ")) * (-109);
                        i = ((iM2761 ^ i12) * (-27545)) ^ (-887081671);
                        i2 = 204739259;
                    } else {
                        iM2761 = (C0619.m2761("ۧܿ") + i12) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2761 ^ i11) * (-1897)) ^ 1908938692;
                        i2 = 2092693496;
                    }
                    int i1114 = iM2762;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    iM2762 = i1114;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a4 A[PHI: r7
      0x00a4: PHI (r7v8 l.ܽ᩻ۙ) = (r7v7 l.ܽ᩻ۙ), (r7v4 l.ܽ᩻ۙ), (r7v4 l.ܽ᩻ۙ) binds: [B:31:0x008b, B:13:0x003c, B:7:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0139  */
    /* JADX WARN: Code duplicated, block: B:54:0x0165  */
    /* JADX WARN: Code duplicated, block: B:58:0x0196 A[PHI: r0
      0x0196: PHI (r0v6 boolean) = (r0v5 boolean), (r0v2 boolean), (r0v2 boolean), (r0v2 boolean) binds: [B:57:0x0194, B:37:0x00d0, B:18:0x0046, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    public AbstractActivityC10144() {
        int iM3169;
        int i;
        boolean z = false;
        int i2 = -28364896;
        int i3 = C3033.f9831;
        int i4 = RunnableC0334.f1808;
        int iM2761 = (C0619.m2761("ۘۢ") ^ i4) * (-47);
        int i5 = ((iM2761 ^ i3) * 6207) ^ (-1807908903);
        int i6 = -1550551435;
        while (true) {
            int i7 = iM2761 ^ i6;
            C17930 c17930 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-5407)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2105776480:
                    case -1242723016:
                        z = false;
                        z = false;
                        this.f32502 = false;
                        if (C3690.m11987()) {
                            iM3169 = (C0773.m3169("᩺ᩳ") + i3) * (-23);
                            i5 = ((iM3169 ^ i4) * (-16829)) ^ 2046701793;
                            i = -1792194949;
                        } else {
                            iM3169 = (C0773.m3169("֡ۗ") ^ i4) * 87;
                            i5 = ((iM3169 ^ i3) * 25919) ^ (-1887065889);
                            i = -1123617538;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -2093733465:
                    case 1898392022:
                        this.f32488 = c17930;
                        if (C1826.f6190 <= 0) {
                            iM3169 = (C0773.m3169("ܶᩳ") ^ i4) * (-75);
                            i5 = ((iM3169 ^ i3) * (-28401)) ^ 683561673;
                            i = -708800882;
                        } else {
                            iM3169 = C0773.m3169("ۗۧ") ^ i4;
                            i5 = ((iM3169 ^ i3) * (-18773)) ^ (-191920682);
                            i = 1853714242;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1968896275:
                    case 1514457123:
                        if (C1783.f6087 > 0) {
                            iM3169 = C0619.m2761("᩶ۛ") ^ i3;
                            i5 = ((iM3169 ^ i4) * 1219) ^ (-585365892);
                            i = -1476146566;
                        } else {
                            iM3169 = (C0773.m3169("ܶᩳ") ^ i4) * (-75);
                            i5 = ((iM3169 ^ i3) * (-28401)) ^ 683561673;
                            i = -708800882;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1866911700:
                    case 1539459965:
                        this.f32495 = -1;
                        return;
                    case -1832391379:
                    case -1610437215:
                        if (!C0619.f2439) {
                            iM3169 = (C0619.m2761("ۜۙ") + i4) * (-61);
                            i5 = ((iM3169 ^ i3) * (-5697)) ^ (-180320427);
                            i = -485314305;
                            i7 = iM3169 ^ i;
                        }
                        break;
                    case -1798804780:
                    case 1202757389:
                        if (C2485.f7950 != 0) {
                            iM3169 = C0619.m2761("᩶ۛ") ^ i3;
                            i5 = ((iM3169 ^ i4) * 1219) ^ (-585365892);
                            i = -1476146566;
                        } else {
                            iM3169 = C0773.m3169("ܽ֫") ^ i4;
                            i5 = ((iM3169 ^ i3) * (-32611)) ^ (-1725297865);
                            i = -1932903765;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1376958870:
                    case -321236305:
                        if (C2354.m7983()) {
                            iM3169 = C0619.m2761("֨֨") ^ i4;
                            i5 = ((iM3169 ^ i3) * (-12049)) ^ 823962696;
                            i = 885442434;
                        } else {
                            iM3169 = (C0773.m3169("ܶᩳ") ^ i4) * (-75);
                            i5 = ((iM3169 ^ i3) * (-28401)) ^ 683561673;
                            i = -708800882;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1318257155:
                    case -406721568:
                        C3448.m11248();
                        C4282.m13644();
                        throw new RuntimeException();
                    case -1183505814:
                    case 1903876546:
                        if (C23916.f77426 > 0) {
                            iM3169 = (C0773.m3169("᩺ᩳ") + i3) * (-23);
                            i5 = ((iM3169 ^ i4) * (-16829)) ^ 2046701793;
                            i = -1792194949;
                        } else {
                            iM3169 = C0619.m2761("᩶ۛ") ^ i3;
                            i5 = ((iM3169 ^ i4) * 1219) ^ (-585365892);
                            i = -1476146566;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -1018809527:
                    case 132497607:
                        this.f32504 = z;
                        if (C1080.f3865 < 0) {
                            c17930 = new C17930(C4282.m13653(z));
                            if (C2023.m6964() <= 0) {
                                iM3169 = C0773.m3169("ܽ֫") ^ i4;
                                i5 = ((iM3169 ^ i3) * (-32611)) ^ (-1725297865);
                                i = -1932903765;
                            } else {
                                iM3169 = (C0773.m3169("ᩳܽ") ^ i3) * 65;
                                i5 = ((iM3169 ^ i4) * (-18065)) ^ 1586434864;
                                i = -1769860778;
                            }
                            i7 = iM3169 ^ i;
                        }
                        break;
                    case -770094309:
                    case -104682372:
                        if (C3779.f12953 <= 0) {
                            iM3169 = (C0773.m3169("᩺ᩳ") + i3) * (-23);
                            i5 = ((iM3169 ^ i4) * (-16829)) ^ 2046701793;
                            i = -1792194949;
                        } else {
                            iM3169 = (C0773.m3169("ᩴܶ") + i3) * 5;
                            i5 = ((iM3169 ^ i4) * 31115) ^ 2091879810;
                            i = -1363584082;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case -117160959:
                    case 1835476533:
                        if (C20932.f66974 <= 0) {
                            iM3169 = C0619.m2761("᩶ۛ") ^ i3;
                            i5 = ((iM3169 ^ i4) * 1219) ^ (-585365892);
                            i = -1476146566;
                        } else {
                            iM3169 = (C0773.m3169("ۖ᩹") + i3) * 41;
                            i5 = ((iM3169 ^ i4) * (-23733)) ^ (-742801637);
                            i = -2034387270;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case 24742989:
                    case 257861198:
                        if (C4238.f15451 >= 0) {
                            iM3169 = C0619.m2761("᩶ۛ") ^ i3;
                            i5 = ((iM3169 ^ i4) * 1219) ^ (-585365892);
                            i = -1476146566;
                        } else {
                            iM3169 = (C0619.m2761("᩺ᩴ") + i3) * 85;
                            i5 = ((iM3169 ^ i4) * 24473) ^ 1511428367;
                            i = 87263253;
                        }
                        i7 = iM3169 ^ i;
                        break;
                    case 1101575753:
                    case 1205654261:
                        C3492.m11488();
                        iM3169 = (C0773.m3169("᩺ᩳ") + i3) * (-23);
                        i5 = ((iM3169 ^ i4) * (-16829)) ^ 2046701793;
                        i = -1792194949;
                        i7 = iM3169 ^ i;
                        break;
                    default:
                        this.f32496 = z ? 1 : 0;
                        if (C1343.f4799 != 0) {
                            iM3169 = C0773.m3169("ܽ֫") ^ i4;
                            i5 = ((iM3169 ^ i3) * (-32611)) ^ (-1725297865);
                            i = -1932903765;
                        } else {
                            iM3169 = (C0619.m2761("ۨ֫") + i4) * (-115);
                            i5 = ((iM3169 ^ i3) * (-17145)) ^ (-1218340402);
                            i = 421258019;
                        }
                        i7 = iM3169 ^ i;
                        break;
                }
            }
            iM2761 = C0773.m3169("ۡ֫") ^ i3;
            i5 = ((iM2761 ^ i4) * 22833) ^ (-361437295);
            i6 = 1702494125;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x014e A[PHI: r8
      0x014e: PHI (r8v4 short) = (r8v2 short), (r8v1 short), (r8v1 short), (r8v1 short) binds: [B:44:0x0158, B:41:0x014b, B:13:0x0068, B:9:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x01cb A[PHI: r0 r7
      0x01cb: PHI (r0v4 short[]) = (r0v3 short[]), (r0v5 short[]) binds: [B:58:0x01c8, B:16:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x01cb: PHI (r7v2 char) = (r7v1 char), (r7v3 char) binds: [B:58:0x01c8, B:16:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x01f5 A[PHI: r1 r6 r8
      0x01f5: PHI (r1v3 short[]) = (r1v1 short[]), (r1v2 short[]), (r1v1 short[]) binds: [B:64:0x01f3, B:34:0x00f9, B:42:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x01f5: PHI (r6v38 l.᩷ۨᩴ) = (r6v9 l.᩷ۨᩴ), (r6v25 l.᩷ۨᩴ), (r6v40 l.᩷ۨᩴ) binds: [B:64:0x01f3, B:34:0x00f9, B:42:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x01f5: PHI (r8v3 short) = (r8v1 short), (r8v1 short), (r8v4 short) binds: [B:64:0x01f3, B:34:0x00f9, B:42:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
    
        if (l.C0773.m3161() != 0) goto L42;
     */
    static {
        /*
            Method dump skipped, instruction units count: 1136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC10144.<clinit>():void");
    }

    /* JADX WARN: Code duplicated, block: B:141:0x06da A[PHI: r3 r10 r13 r22 r23 r26 r27 r28 r33 r39 r40
      0x06da: PHI (r3v26 int) = (r3v9 int), (r3v10 int), (r3v27 int) binds: [B:140:0x06d8, B:136:0x06aa, B:40:0x019b] A[DONT_GENERATE, DONT_INLINE]
      0x06da: PHI (r10v3 java.lang.String) = (r10v2 java.lang.String), (r10v2 java.lang.String), (r10v4 java.lang.String) binds: [B:140:0x06d8, B:136:0x06aa, B:40:0x019b] A[DONT_GENERATE, DONT_INLINE]
      0x06da: PHI (r13v53 java.util.ArrayList) = (r13v13 java.util.ArrayList), (r13v14 java.util.ArrayList), (r13v54 java.util.ArrayList) binds: [B:140:0x06d8, B:136:0x06aa, B:40:0x019b] A[DONT_GENERATE, DONT_INLINE]
      0x06da: PHI (r22v32 java.lang.StringBuilder) = (r22v10 java.lang.StringBuilder), (r22v11 java.lang.StringBuilder), (r22v33 java.lang.StringBuilder) binds: [B:140:0x06d8, B:136:0x06aa, B:40:0x019b] A[DONT_GENERATE, DONT_INLINE]
      0x06da: PHI (r23v29 int) = (r23v9 int), (r23v10 int), (r23v30 int) binds: [B:140:0x06d8, B:136:0x06aa, B:40:0x019b] A[DONT_GENERATE, DONT_INLINE]
      0x06da: PHI (r26v4 char) = (r26v3 char), (r26v2 char), (r26v2 char) binds: [B:140:0x06d8, B:136:0x06aa, B:40:0x019b] A[DONT_GENERATE, DONT_INLINE]
      0x06da: PHI (r27v4 short) = (r27v2 short), (r27v3 short), (r27v2 short) binds: [B:140:0x06d8, B:136:0x06aa, B:40:0x019b] A[DONT_GENERATE, DONT_INLINE]
      0x06da: PHI (r28v4 int) = (r28v2 int), (r28v3 int), (r28v2 int) binds: [B:140:0x06d8, B:136:0x06aa, B:40:0x019b] A[DONT_GENERATE, DONT_INLINE]
      0x06da: PHI (r33v36 int) = (r33v10 int), (r33v11 int), (r33v37 int) binds: [B:140:0x06d8, B:136:0x06aa, B:40:0x019b] A[DONT_GENERATE, DONT_INLINE]
      0x06da: PHI (r39v63 l.ۧ۬ۤ) = (r39v21 l.ۧ۬ۤ), (r39v22 l.ۧ۬ۤ), (r39v64 l.ۧ۬ۤ) binds: [B:140:0x06d8, B:136:0x06aa, B:40:0x019b] A[DONT_GENERATE, DONT_INLINE]
      0x06da: PHI (r40v15 short[]) = (r40v4 short[]), (r40v5 short[]), (r40v16 short[]) binds: [B:140:0x06d8, B:136:0x06aa, B:40:0x019b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final void m26255() {
        short[] sArr;
        int i;
        String str;
        int iM3169;
        int i2;
        int i3;
        int iM31610;
        int i4;
        int i5;
        int iM2761;
        int i6;
        int i7;
        int iM31611;
        int i8;
        int i9;
        C11636 c11636;
        int i10;
        int iM31612;
        int i11;
        StringBuilder sb;
        String str2;
        int iM2762;
        int i12;
        int i13;
        AbstractActivityC10144 abstractActivityC10144 = this;
        int i14 = -209453430;
        int i15 = C2310.f7472;
        int i16 = C3690.f12684;
        int iM31613 = (C0773.m3169("ۡܽ") ^ i15) * (-83);
        int i17 = ((iM31613 ^ i16) * (-15689)) ^ (-2130362324);
        int i18 = iM31613 ^ (-829385371);
        int[] iArr = null;
        C11636 c11637 = null;
        StringBuilder sb2 = null;
        String strM4058 = null;
        String strM8350 = null;
        String strM6952 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        boolean z = false;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        char c = 0;
        short s = 0;
        int i30 = 0;
        int i31 = 0;
        short s2 = 0;
        ArrayList arrayList = null;
        int i32 = 0;
        String strM33137 = null;
        Iterator itM13647 = null;
        StringBuilder sb3 = null;
        C11636 c11638 = null;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        while (true) {
            i14 = i18 ^ (i17 & (((i14 ^ i16) * (-545)) >> 31));
            switch (i14) {
                case -2145671032:
                case 208361993:
                    str2 = strM33137;
                    StringBuilder sb4 = sb2;
                    C1783.m6234(sb4, str2);
                    C3779.m12269(sb4, i33);
                    strM6952 = C2023.m6952(sb4);
                    sb = sb3;
                    int iM31614 = C0773.m3169("ۖۚ") ^ i16;
                    strM33137 = str2;
                    i17 = ((iM31614 ^ i15) * 31069) ^ 1827618231;
                    i18 = iM31614 ^ 1197285472;
                    sb3 = sb;
                    i19 = i19;
                    arrayList = arrayList;
                    break;
                case -2102779844:
                case 1074167023:
                    arrayList = arrayList;
                    i19 = i19;
                    sb3 = sb3;
                    itM13647 = C4282.m13647(arrayList);
                    i22 = i35;
                    i23 = 0;
                    iM31612 = C0619.m2761("ۛۗ") ^ i16;
                    i6 = ((iM31612 ^ i15) * 30205) ^ (-315035332);
                    i11 = -1702246549;
                    i18 = iM31612 ^ i11;
                    i17 = i6;
                    i19 = i19;
                    arrayList = arrayList;
                    int i36 = i29;
                    sb3 = sb3;
                    i29 = i36;
                    break;
                case -2092359211:
                case 1689928194:
                    abstractActivityC10144.f56046.setSubtitle(abstractActivityC10144.f32491);
                    break;
                case -1958092160:
                case 701897294:
                    C2354.m7983();
                    if (C3099.f10023 > 0) {
                        iM31610 = C0773.m3169("۟۠") ^ i15;
                        i4 = ((iM31610 ^ i16) * 31059) ^ (-1466488455);
                        i5 = -1660740919;
                        i18 = iM31610 ^ i5;
                        i17 = i4;
                    } else {
                        c11636 = c11638;
                        arrayList = arrayList;
                        i19 = i19;
                        StringBuilder sb5 = sb3;
                        i29 = i29;
                        sb3 = sb5;
                        int iM2763 = C0619.m2761("֨֫") ^ i16;
                        i6 = ((iM2763 ^ i15) * 26119) ^ 317019758;
                        i13 = iM2763 ^ (-695904054);
                        c11638 = c11636;
                        i18 = i13;
                        i17 = i6;
                        i19 = i19;
                        arrayList = arrayList;
                        int i37 = i29;
                        sb3 = sb3;
                        i29 = i37;
                    }
                    break;
                case -1945306072:
                case 1385782672:
                    if (C3998.f13671 == 0) {
                        c11638 = c11638;
                        arrayList = arrayList;
                        sArr3 = sArr3;
                        i32 = i32;
                        i19 = i19;
                        StringBuilder sb6 = sb3;
                        i29 = i29;
                        sb3 = sb6;
                        iM2761 = C0619.m2761("۠۟") ^ i15;
                        i6 = ((iM2761 ^ i16) * 21309) ^ (-1651973275);
                        i7 = -942750978;
                        i13 = iM2761 ^ i7;
                        i32 = i32;
                        c11638 = c11638;
                        sArr3 = sArr3;
                        i18 = i13;
                        i17 = i6;
                        i19 = i19;
                        arrayList = arrayList;
                        int i38 = i29;
                        sb3 = sb3;
                        i29 = i38;
                    } else {
                        iM31610 = C0773.m3169("ۙܳ") ^ i16;
                        i4 = ((iM31610 ^ i15) * (-32441)) ^ 604042331;
                        i5 = 388333652;
                        i18 = iM31610 ^ i5;
                        i17 = i4;
                    }
                    break;
                case -1896688617:
                case 716068315:
                    arrayList = arrayList;
                    c11638 = (C11636) C3690.m11990(arrayList, iArr[i34]);
                    if (c11638.m29232()) {
                        i27 = i33;
                        i26 = i24;
                        iM2762 = C0773.m3169("ۖ᩶") ^ i15;
                        i2 = ((iM2762 ^ i16) * SecP160R2Field.PInv33) ^ (-42551354);
                        i12 = 1041778326;
                    } else {
                        iM2762 = (C0619.m2761("᩶ۘ") ^ i15) * 85;
                        i19 = i19;
                        i2 = ((iM2762 ^ i16) * (-26931)) ^ (-550749716);
                        i12 = 593697329;
                    }
                    i18 = iM2762 ^ i12;
                    i17 = i2;
                    i19 = i19;
                    arrayList = arrayList;
                    break;
                case -1769367494:
                case 345894072:
                    strM8350 = C2485.m8350(sArr4, i19, i21, i20);
                    if (C2375.f7641 > 0) {
                        iM31610 = (C0773.m3169("ۗܺ") + i16) * (-45);
                        i4 = ((iM31610 ^ i15) * 8083) ^ 39607573;
                        i5 = -544306785;
                        i18 = iM31610 ^ i5;
                        i17 = i4;
                    } else {
                        c11638 = c11638;
                        arrayList = arrayList;
                        sArr3 = sArr3;
                        i32 = i32;
                        i19 = i19;
                        StringBuilder sb7 = sb3;
                        i29 = i29;
                        sb3 = sb7;
                        iM2761 = (i15 - C0773.m3169("ܰܶ")) * 101;
                        i6 = ((iM2761 ^ i16) * (-27267)) ^ (-45937855);
                        i7 = -1562962240;
                        i13 = iM2761 ^ i7;
                        i32 = i32;
                        c11638 = c11638;
                        sArr3 = sArr3;
                        i18 = i13;
                        i17 = i6;
                        i19 = i19;
                        arrayList = arrayList;
                        int i39 = i29;
                        sb3 = sb3;
                        i29 = i39;
                    }
                    break;
                case -1679936737:
                case 1125427812:
                    c11638 = c11638;
                    arrayList = arrayList;
                    sArr = sArr3;
                    i = i32;
                    int i40 = i19;
                    StringBuilder sb8 = sb3;
                    i29 = i29;
                    sb3 = sb8;
                    sArr2 = f32484;
                    if (C3998.f13671 == 0) {
                        int iM2764 = (C0619.m2761("۫ᩴ") ^ i15) * (-49);
                        i17 = ((iM2764 ^ i16) * 28051) ^ (-493750193);
                        i32 = i;
                        i19 = i40;
                        c11638 = c11638;
                        sArr3 = sArr;
                        i18 = iM2764 ^ (-768683586);
                        arrayList = arrayList;
                        abstractActivityC10144 = this;
                        int i310 = i29;
                        sb3 = sb3;
                        i29 = i310;
                    } else {
                        sb3 = sb3;
                        i19 = i40;
                        int iM2765 = (i15 - C0619.m2761("ۨۗ")) * 7;
                        int i41 = ((iM2765 ^ i16) * 17773) ^ 688284149;
                        i32 = i;
                        arrayList = arrayList;
                        c11638 = c11638;
                        sArr3 = sArr;
                        i18 = iM2765 ^ 1655786402;
                        i29 = i29;
                        sb3 = sb3;
                        i17 = i41;
                        abstractActivityC10144 = this;
                    }
                    break;
                case -1535484585:
                case 939357626:
                    arrayList = arrayList;
                    i19 = i19;
                    StringBuilder sb9 = sb3;
                    i29 = i29;
                    sb3 = sb9;
                    if (C3998.m12923(itM13647)) {
                        iM31612 = C0773.m3169("᩸ۧ") ^ i15;
                        i6 = ((iM31612 ^ i16) * (-5261)) ^ 1959489908;
                        i11 = 1690518267;
                    } else {
                        iM31612 = C0773.m3169("ܽۜ") ^ i16;
                        i6 = ((iM31612 ^ i15) * 8243) ^ (-2146379109);
                        i11 = 470561033;
                    }
                    i18 = iM31612 ^ i11;
                    i17 = i6;
                    i19 = i19;
                    arrayList = arrayList;
                    int i311 = i29;
                    sb3 = sb3;
                    i29 = i311;
                    break;
                case -1509283199:
                case 1026949862:
                    i28 = i33 + 1;
                    if (c11638.f36482 == null) {
                        i26 = i24;
                        i27 = i28;
                        arrayList = arrayList;
                        iM2762 = C0773.m3169("ۖ᩶") ^ i15;
                        i2 = ((iM2762 ^ i16) * SecP160R2Field.PInv33) ^ (-42551354);
                        i12 = 1041778326;
                        i18 = iM2762 ^ i12;
                        i17 = i2;
                        i19 = i19;
                        arrayList = arrayList;
                    } else {
                        iM31610 = (i16 - C0619.m2761("۠ܰ")) * (-103);
                        i4 = ((iM31610 ^ i15) * (-17229)) ^ (-1455246697);
                        i5 = 1858076715;
                        i18 = iM31610 ^ i5;
                        i17 = i4;
                    }
                    break;
                case -1481163176:
                case 76438996:
                    i22++;
                    i23 = i25;
                    arrayList = arrayList;
                    i19 = i19;
                    sb3 = sb3;
                    iM31612 = C0619.m2761("ۛۗ") ^ i16;
                    i6 = ((iM31612 ^ i15) * 30205) ^ (-315035332);
                    i11 = -1702246549;
                    i18 = iM31612 ^ i11;
                    i17 = i6;
                    i19 = i19;
                    arrayList = arrayList;
                    int i312 = i29;
                    sb3 = sb3;
                    i29 = i312;
                    break;
                case -1472147594:
                case -389674637:
                    int i42 = i29;
                    arrayList = arrayList;
                    i19 = i19;
                    sb = sb3;
                    if (i34 >= i42) {
                        i29 = i42;
                        iM31612 = C0773.m3169("᩹ۜ") ^ i16;
                        sb3 = sb;
                        i6 = ((iM31612 ^ i15) * (-24765)) ^ (-1427002200);
                        i11 = -1991309314;
                        i18 = iM31612 ^ i11;
                        i17 = i6;
                        i19 = i19;
                        arrayList = arrayList;
                        int i313 = i29;
                        sb3 = sb3;
                        i29 = i313;
                    } else {
                        int iM31615 = C0773.m3169("ۗᩴ") ^ i15;
                        i17 = ((iM31615 ^ i16) * 13021) ^ 1696372600;
                        i18 = iM31615 ^ 1488990515;
                        i29 = i42;
                        sb3 = sb;
                        i19 = i19;
                        arrayList = arrayList;
                    }
                    break;
                case -1292733747:
                case 1513478171:
                    str = strM33137;
                    arrayList = arrayList;
                    i19 = i19;
                    StringBuilder sb10 = sb2;
                    c11637 = (C11636) C4238.m13529(itM13647);
                    if (!c11637.m29232()) {
                        iM3169 = (C0773.m3169("᩷ܰ") ^ i16) * 65;
                        sb2 = sb10;
                        i2 = ((iM3169 ^ i15) * 22673) ^ (-1078696129);
                        i3 = -517286948;
                        i18 = iM3169 ^ i3;
                        strM33137 = str;
                        i17 = i2;
                        i19 = i19;
                        arrayList = arrayList;
                    } else {
                        sb2 = sb10;
                        strM33137 = str;
                        sb3 = sb3;
                        iM31612 = C0619.m2761("ۛۗ") ^ i16;
                        i6 = ((iM31612 ^ i15) * 30205) ^ (-315035332);
                        i11 = -1702246549;
                        i18 = iM31612 ^ i11;
                        i17 = i6;
                        i19 = i19;
                        arrayList = arrayList;
                        int i314 = i29;
                        sb3 = sb3;
                        i29 = i314;
                    }
                    break;
                case -1273618669:
                case 301732440:
                    C17202.m40372();
                    if (RunnableC0334.m2063()) {
                        iM31610 = C0773.m3169("ۙܳ") ^ i16;
                        i4 = ((iM31610 ^ i15) * (-32441)) ^ 604042331;
                        i5 = 388333652;
                    } else {
                        iM31610 = C0773.m3169("֫᩸") ^ i15;
                        i4 = ((iM31610 ^ i16) * 3471) ^ (-817862544);
                        i5 = -1700467428;
                    }
                    i18 = iM31610 ^ i5;
                    i17 = i4;
                    break;
                case -1212187363:
                case 545429531:
                    str = strM33137;
                    arrayList = arrayList;
                    i19 = i19;
                    StringBuilder sb11 = new StringBuilder();
                    C3779.m12269(sb11, i24);
                    if (C20932.f66974 > 0) {
                        iM3169 = C0773.m3169("ᩳ᩻") ^ i15;
                        sb2 = sb11;
                        i2 = ((iM3169 ^ i16) * 23837) ^ 1442519212;
                        i3 = -631627976;
                        i18 = iM3169 ^ i3;
                        strM33137 = str;
                        i17 = i2;
                        i19 = i19;
                        arrayList = arrayList;
                    } else {
                        strM33137 = str;
                        sb2 = sb11;
                        i19 = i19;
                        sArr = sArr3;
                        i = i32;
                        i29 = i29;
                        int iM2766 = (i15 - C0619.m2761("ۨۗ")) * 7;
                        int i43 = ((iM2766 ^ i16) * 17773) ^ 688284149;
                        i32 = i;
                        arrayList = arrayList;
                        c11638 = c11638;
                        sArr3 = sArr;
                        i18 = iM2766 ^ 1655786402;
                        i29 = i29;
                        sb3 = sb3;
                        i17 = i43;
                        abstractActivityC10144 = this;
                    }
                    break;
                case -1175908540:
                case 1923159743:
                    RunnableC3055.m9933();
                    C4282.m13644();
                    break;
                case -1073759290:
                case 1074949765:
                    arrayList = arrayList;
                    i19 = i19;
                    StringBuilder sb12 = sb3;
                    i29 = i29;
                    sb3 = sb12;
                    c11638 = c11638;
                    short[] sArr5 = sArr3;
                    i32 = i32;
                    strM33137 = C13473.m33137(sArr5, i32, 1, i20);
                    i35 = 0;
                    if (z) {
                        iM2761 = (i15 - C0619.m2761("ۨۖ")) * (-59);
                        sArr3 = sArr5;
                        i6 = ((iM2761 ^ i16) * 4209) ^ (-1381532003);
                        i7 = -625956235;
                    } else {
                        sArr3 = sArr5;
                        iM2761 = C0773.m3169("᩹ۛ") ^ i15;
                        i6 = ((iM2761 ^ i16) * 12619) ^ (-1441775590);
                        i7 = 1419448551;
                    }
                    i13 = iM2761 ^ i7;
                    i32 = i32;
                    c11638 = c11638;
                    sArr3 = sArr3;
                    i18 = i13;
                    i17 = i6;
                    i19 = i19;
                    arrayList = arrayList;
                    int i315 = i29;
                    sb3 = sb3;
                    i29 = i315;
                    break;
                case -1028041029:
                case 372427687:
                    i26 = i24 + 1;
                    i27 = i28;
                    arrayList = arrayList;
                    iM2762 = C0773.m3169("ۖ᩶") ^ i15;
                    i2 = ((iM2762 ^ i16) * SecP160R2Field.PInv33) ^ (-42551354);
                    i12 = 1041778326;
                    i18 = iM2762 ^ i12;
                    i17 = i2;
                    i19 = i19;
                    arrayList = arrayList;
                    break;
                case -1022021757:
                case 1319424337:
                    int i44 = i19;
                    C11636 c11639 = c11638;
                    short[] sArr6 = sArr3;
                    int i45 = i32;
                    StringBuilder sb13 = sb3;
                    i29 = i29;
                    sb3 = sb13;
                    ArrayList arrayList2 = abstractActivityC10144.f32497;
                    if (arrayList2 == null) {
                        iM31611 = (C0773.m3169("ܳ۟") + i16) * 61;
                        i8 = ((iM31611 ^ i15) * (-12327)) ^ (-1681365046);
                        i9 = -2090580631;
                    } else {
                        iM31611 = (i16 - C0773.m3169("᩻۫")) * (-123);
                        i8 = ((iM31611 ^ i15) * (-22909)) ^ 532278239;
                        i9 = 671528884;
                    }
                    i32 = i45;
                    c11638 = c11639;
                    sArr3 = sArr6;
                    i18 = iM31611 ^ i9;
                    i19 = i44;
                    arrayList = arrayList2;
                    i17 = i8;
                    int i316 = i29;
                    sb3 = sb3;
                    i29 = i316;
                    break;
                case -961962792:
                case -215153266:
                    c11638 = c11638;
                    arrayList = arrayList;
                    sArr3 = sArr3;
                    i32 = i32;
                    i19 = i19;
                    StringBuilder sb14 = sb3;
                    i29 = i29;
                    sb3 = sb14;
                    if (i31 - (s * s2) < 0) {
                        iM2761 = (i16 - C0619.m2761("᩺۫")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((iM2761 ^ i15) * (-10951)) ^ 1342958942;
                        i7 = -744755579;
                    } else {
                        iM2761 = C0773.m3169("ܽ᩵") ^ i16;
                        i6 = ((iM2761 ^ i15) * 21743) ^ (-225267003);
                        i7 = 1664281147;
                    }
                    i13 = iM2761 ^ i7;
                    i32 = i32;
                    c11638 = c11638;
                    sArr3 = sArr3;
                    i18 = i13;
                    i17 = i6;
                    i19 = i19;
                    arrayList = arrayList;
                    int i317 = i29;
                    sb3 = sb3;
                    i29 = i317;
                    break;
                case -903178159:
                case 454392344:
                    abstractActivityC10144.f56046.setSubtitle(strM4058);
                    break;
                case -770506002:
                case 878615345:
                    c11638 = c11638;
                    arrayList = arrayList;
                    sArr3 = sArr3;
                    i32 = i32;
                    i19 = i19;
                    StringBuilder sb15 = sb3;
                    i29 = i29;
                    sb3 = sb15;
                    c = 339;
                    if (C2878.f9462) {
                        iM2761 = (i15 - C0773.m3169("ܰܶ")) * 101;
                        i6 = ((iM2761 ^ i16) * (-27267)) ^ (-45937855);
                        i7 = -1562962240;
                    } else {
                        iM2761 = (i16 - C0619.m2761("ᩴ᩶")) * 7;
                        i6 = ((iM2761 ^ i15) * (-1185)) ^ 1631083352;
                        i7 = 1079143272;
                    }
                    i13 = iM2761 ^ i7;
                    i32 = i32;
                    c11638 = c11638;
                    sArr3 = sArr3;
                    i18 = i13;
                    i17 = i6;
                    i19 = i19;
                    arrayList = arrayList;
                    int i318 = i29;
                    sb3 = sb3;
                    i29 = i318;
                    break;
                case -399858769:
                case -273910676:
                    i34++;
                    i24 = i26;
                    i33 = i27;
                    i10 = i29;
                    int iM2767 = C0619.m2761("ۡᩳ") ^ i15;
                    i29 = i10;
                    i17 = ((iM2767 ^ i16) * 13213) ^ 305918266;
                    i18 = iM2767 ^ 1056239000;
                    i19 = i19;
                    arrayList = arrayList;
                    int i319 = i29;
                    sb3 = sb3;
                    i29 = i319;
                    break;
                case -394875735:
                case 1382870097:
                    C0269.m1775();
                    arrayList = arrayList;
                    sArr = sArr3;
                    i = i32;
                    i29 = i29;
                    int iM2768 = (i15 - C0619.m2761("ۨۗ")) * 7;
                    int i46 = ((iM2768 ^ i16) * 17773) ^ 688284149;
                    i32 = i;
                    arrayList = arrayList;
                    c11638 = c11638;
                    sArr3 = sArr;
                    i18 = iM2768 ^ 1655786402;
                    i29 = i29;
                    sb3 = sb3;
                    i17 = i46;
                    abstractActivityC10144 = this;
                    break;
                case -357833628:
                case 2105027488:
                    c11636 = c11638;
                    arrayList = arrayList;
                    i19 = i19;
                    StringBuilder sb16 = sb3;
                    i29 = i29;
                    sb3 = sb16;
                    boolean z2 = abstractActivityC10144.f32504;
                    sArr3 = f32484;
                    i32 = 340;
                    if (C2288.f7433 <= 0) {
                        z = z2;
                        int iM2769 = C0619.m2761("֨֫") ^ i16;
                        i6 = ((iM2769 ^ i15) * 26119) ^ 317019758;
                        i13 = iM2769 ^ (-695904054);
                        c11638 = c11636;
                        i18 = i13;
                        i17 = i6;
                    } else {
                        int iM31616 = C0773.m3169("ܰ᩸") ^ i15;
                        z = z2;
                        i17 = ((iM31616 ^ i16) * 12995) ^ (-545647536);
                        c11638 = c11636;
                        i18 = iM31616 ^ 1775061463;
                    }
                    i19 = i19;
                    arrayList = arrayList;
                    int i3110 = i29;
                    sb3 = sb3;
                    i29 = i3110;
                    break;
                case -168212715:
                case -69183388:
                    sArr4 = f32484;
                    i19 = 341;
                    i21 = 3;
                    if (C2375.m8065() > 0) {
                        iM31610 = C0773.m3169("ᩴ۫") ^ i16;
                        i4 = ((iM31610 ^ i15) * (-9179)) ^ (-836165308);
                        i5 = 711825199;
                        i18 = iM31610 ^ i5;
                        i17 = i4;
                    } else {
                        arrayList = arrayList;
                        sArr = sArr3;
                        i = i32;
                        i29 = i29;
                        int iM27610 = (i15 - C0619.m2761("ۨۗ")) * 7;
                        int i47 = ((iM27610 ^ i16) * 17773) ^ 688284149;
                        i32 = i;
                        arrayList = arrayList;
                        c11638 = c11638;
                        sArr3 = sArr;
                        i18 = iM27610 ^ 1655786402;
                        i29 = i29;
                        sb3 = sb3;
                        i17 = i47;
                        abstractActivityC10144 = this;
                    }
                    break;
                case -168020791:
                case 311490307:
                    c11638 = c11638;
                    arrayList = arrayList;
                    sArr3 = sArr3;
                    i32 = i32;
                    i19 = i19;
                    StringBuilder sb17 = sb3;
                    i29 = i29;
                    sb3 = sb17;
                    i31 = i30 + 15928081;
                    if (C1519.f5300 >= 0) {
                        iM2761 = C0619.m2761("۠۟") ^ i15;
                        i6 = ((iM2761 ^ i16) * 21309) ^ (-1651973275);
                        i7 = -942750978;
                    } else {
                        iM2761 = (C0773.m3169("ۛ۫") + i15) * 39;
                        i6 = ((iM2761 ^ i16) * 21831) ^ (-1435674479);
                        i7 = -123373516;
                    }
                    i13 = iM2761 ^ i7;
                    i32 = i32;
                    c11638 = c11638;
                    sArr3 = sArr3;
                    i18 = i13;
                    i17 = i6;
                    i19 = i19;
                    arrayList = arrayList;
                    int i3111 = i29;
                    sb3 = sb3;
                    i29 = i3111;
                    break;
                case -119681158:
                case -99483145:
                    c11638 = c11638;
                    arrayList = arrayList;
                    sArr3 = sArr3;
                    i32 = i32;
                    i19 = i19;
                    StringBuilder sb18 = sb3;
                    i29 = i29;
                    sb3 = sb18;
                    s = sArr2[c];
                    i30 = s * s;
                    if (C2375.f7641 <= 0) {
                        iM2761 = (i15 - C0773.m3169("ܰܶ")) * 101;
                        i6 = ((iM2761 ^ i16) * (-27267)) ^ (-45937855);
                        i7 = -1562962240;
                    } else {
                        iM2761 = (i16 - C0619.m2761("֡֨")) * (-51);
                        i6 = ((iM2761 ^ i15) * (-28475)) ^ 480177190;
                        i7 = -2142115476;
                    }
                    i13 = iM2761 ^ i7;
                    i32 = i32;
                    c11638 = c11638;
                    sArr3 = sArr3;
                    i18 = i13;
                    i17 = i6;
                    i19 = i19;
                    arrayList = arrayList;
                    int i3112 = i29;
                    sb3 = sb3;
                    i29 = i3112;
                    break;
                case 225117626:
                case 438692581:
                    i25 = i23 + 1;
                    C11636 c116310 = c11637;
                    if (c116310.f36482 != null) {
                        int iM27611 = C0619.m2761("۬ᩴ") ^ i15;
                        c11637 = c116310;
                        i17 = ((iM27611 ^ i16) * 27177) ^ (-575658155);
                        i18 = iM27611 ^ 1904591881;
                    } else {
                        c11637 = c116310;
                        i23 = i25;
                        arrayList = arrayList;
                        i19 = i19;
                        sb3 = sb3;
                        iM31612 = C0619.m2761("ۛۗ") ^ i16;
                        i6 = ((iM31612 ^ i15) * 30205) ^ (-315035332);
                        i11 = -1702246549;
                        i18 = iM31612 ^ i11;
                        i17 = i6;
                        i19 = i19;
                        arrayList = arrayList;
                        int i3113 = i29;
                        sb3 = sb3;
                        i29 = i3113;
                    }
                    break;
                case 271152766:
                case 1895182898:
                    sb3 = sb3;
                    i20 = 14559;
                    iM2761 = C0773.m3169("ۖܶ") ^ i15;
                    i6 = ((iM2761 ^ i16) * 26997) ^ 1229680575;
                    i7 = -1734999768;
                    i13 = iM2761 ^ i7;
                    i32 = i32;
                    c11638 = c11638;
                    sArr3 = sArr3;
                    i18 = i13;
                    i17 = i6;
                    i19 = i19;
                    arrayList = arrayList;
                    int i3114 = i29;
                    sb3 = sb3;
                    i29 = i3114;
                    break;
                case 347426956:
                case 1847066978:
                    str2 = strM33137;
                    sb = sb3;
                    C1783.m6234(sb, str2);
                    C3779.m12269(sb, i23);
                    strM6952 = C2023.m6952(sb);
                    int iM31617 = C0773.m3169("ۖۚ") ^ i16;
                    strM33137 = str2;
                    i17 = ((iM31617 ^ i15) * 31069) ^ 1827618231;
                    i18 = iM31617 ^ 1197285472;
                    sb3 = sb;
                    i19 = i19;
                    arrayList = arrayList;
                    break;
                case 375437551:
                case 1211612982:
                    C2419.m8174();
                    if (C4282.f15546 > 0) {
                        iM31610 = (i16 - C0619.m2761("ۤۙ")) * 35;
                        i4 = ((iM31610 ^ i15) * 3837) ^ (-34664416);
                        i5 = 388968457;
                        i18 = iM31610 ^ i5;
                        i17 = i4;
                    } else {
                        c11638 = c11638;
                        arrayList = arrayList;
                        sArr3 = sArr3;
                        i32 = i32;
                        i19 = i19;
                        StringBuilder sb19 = sb3;
                        i29 = i29;
                        sb3 = sb19;
                        iM2761 = C0619.m2761("۠۟") ^ i15;
                        i6 = ((iM2761 ^ i16) * 21309) ^ (-1651973275);
                        i7 = -942750978;
                        i13 = iM2761 ^ i7;
                        i32 = i32;
                        c11638 = c11638;
                        sArr3 = sArr3;
                        i18 = i13;
                        i17 = i6;
                        i19 = i19;
                        arrayList = arrayList;
                        int i3115 = i29;
                        sb3 = sb3;
                        i29 = i3115;
                    }
                    break;
                case 387416576:
                case 1261554289:
                    C1826.m6301();
                    if (C3734.f12817 < 0) {
                        iM31610 = C0773.m3169("֫᩸") ^ i15;
                        i4 = ((iM31610 ^ i16) * 3471) ^ (-817862544);
                        i5 = -1700467428;
                        i18 = iM31610 ^ i5;
                        i17 = i4;
                    } else {
                        c11636 = c11638;
                        arrayList = arrayList;
                        i19 = i19;
                        StringBuilder sb20 = sb3;
                        i29 = i29;
                        sb3 = sb20;
                        int iM27612 = C0619.m2761("֨֫") ^ i16;
                        i6 = ((iM27612 ^ i15) * 26119) ^ 317019758;
                        i13 = iM27612 ^ (-695904054);
                        c11638 = c11636;
                        i18 = i13;
                        i17 = i6;
                        i19 = i19;
                        arrayList = arrayList;
                        int i3116 = i29;
                        sb3 = sb3;
                        i29 = i3116;
                    }
                    break;
                case 388241539:
                case 1499746475:
                    c11638 = c11638;
                    arrayList = arrayList;
                    sArr3 = sArr3;
                    i32 = i32;
                    i19 = i19;
                    StringBuilder sb21 = sb3;
                    i29 = i29;
                    sb3 = sb21;
                    s2 = 7982;
                    if (C1542.f5343 <= 0) {
                        iM2761 = (i16 - C0619.m2761("ۜۛ")) * (-69);
                        i6 = ((iM2761 ^ i15) * (-32249)) ^ 1492880599;
                        i7 = 516567732;
                    } else {
                        iM2761 = (C0619.m2761("ۢ۠") + i15) * (-119);
                        i6 = ((iM2761 ^ i16) * 28871) ^ (-568910241);
                        i7 = -1652859583;
                    }
                    i13 = iM2761 ^ i7;
                    i32 = i32;
                    c11638 = c11638;
                    sArr3 = sArr3;
                    i18 = i13;
                    i17 = i6;
                    i19 = i19;
                    arrayList = arrayList;
                    int i3117 = i29;
                    sb3 = sb3;
                    i29 = i3117;
                    break;
                case 513328794:
                case 2041494468:
                    if (abstractActivityC10144.f32491 != null) {
                        iM31610 = C0773.m3169("ܺ֫") ^ i15;
                        i4 = ((iM31610 ^ i16) * 20929) ^ (-862567687);
                        i5 = 600549885;
                    } else {
                        strM4058 = strM6952;
                        iM31610 = C0619.m2761("ۤ֫") ^ i16;
                        i4 = ((iM31610 ^ i15) * 15623) ^ (-1379278277);
                        i5 = -187104650;
                    }
                    i18 = iM31610 ^ i5;
                    i17 = i4;
                    break;
                case 587175766:
                case 920221183:
                    arrayList = arrayList;
                    i19 = i19;
                    sb3 = new StringBuilder();
                    C3779.m12269(sb3, i22);
                    if (C1542.f5343 > 0) {
                        int iM27613 = (C0619.m2761("᩹ܽ") + i16) * (-71);
                        sb3 = sb3;
                        i17 = ((iM27613 ^ i15) * (-5301)) ^ 1847859057;
                        i18 = iM27613 ^ (-407157946);
                        i19 = i19;
                        arrayList = arrayList;
                    } else {
                        c11638 = c11638;
                        i29 = i29;
                        i19 = i19;
                        sArr = sArr3;
                        i = i32;
                        int iM27614 = (i15 - C0619.m2761("ۨۗ")) * 7;
                        int i48 = ((iM27614 ^ i16) * 17773) ^ 688284149;
                        i32 = i;
                        arrayList = arrayList;
                        c11638 = c11638;
                        sArr3 = sArr;
                        i18 = iM27614 ^ 1655786402;
                        i29 = i29;
                        sb3 = sb3;
                        i17 = i48;
                        abstractActivityC10144 = this;
                    }
                    break;
                case 599043967:
                case 791931869:
                    C2375.m8065();
                    if (C0773.f2792 > 0) {
                        c11638 = c11638;
                        arrayList = arrayList;
                        sArr3 = sArr3;
                        i32 = i32;
                        i19 = i19;
                        StringBuilder sb22 = sb3;
                        i29 = i29;
                        sb3 = sb22;
                        iM2761 = (i16 - C0619.m2761("ۜۛ")) * (-69);
                        i6 = ((iM2761 ^ i15) * (-32249)) ^ 1492880599;
                        i7 = 516567732;
                        i13 = iM2761 ^ i7;
                        i32 = i32;
                        c11638 = c11638;
                        sArr3 = sArr3;
                        i18 = i13;
                        i17 = i6;
                        i19 = i19;
                        arrayList = arrayList;
                        int i3118 = i29;
                        sb3 = sb3;
                        i29 = i3118;
                    } else {
                        iM31610 = C0773.m3169("۟۠") ^ i15;
                        i4 = ((iM31610 ^ i16) * 31059) ^ (-1466488455);
                        i5 = -1660740919;
                        i18 = iM31610 ^ i5;
                        i17 = i4;
                    }
                    break;
                case 815300294:
                case 2013566931:
                    StringBuilder sbM10405 = C3188.m10405(strM6952, strM8350);
                    C1783.m6234(sbM10405, abstractActivityC10144.f32491);
                    strM4058 = C1080.m4058(sbM10405);
                    iM31610 = C0619.m2761("ۤ֫") ^ i16;
                    i4 = ((iM31610 ^ i15) * 15623) ^ (-1379278277);
                    i5 = -187104650;
                    i18 = iM31610 ^ i5;
                    i17 = i4;
                    break;
                case 1101811192:
                case 2015029026:
                    i10 = abstractActivityC10144.f32492;
                    iArr = abstractActivityC10144.f32490;
                    i34 = i35;
                    i33 = 0;
                    i24 = 0;
                    int iM27615 = C0619.m2761("ۡᩳ") ^ i15;
                    i29 = i10;
                    i17 = ((iM27615 ^ i16) * 13213) ^ 305918266;
                    i18 = iM27615 ^ 1056239000;
                    i19 = i19;
                    arrayList = arrayList;
                    int i3119 = i29;
                    sb3 = sb3;
                    i29 = i3119;
                    break;
                case 1572950403:
                case 1972245833:
                    sb3 = sb3;
                    i20 = 4008;
                    iM2761 = C0773.m3169("ۖܶ") ^ i15;
                    i6 = ((iM2761 ^ i16) * 26997) ^ 1229680575;
                    i7 = -1734999768;
                    i13 = iM2761 ^ i7;
                    i32 = i32;
                    c11638 = c11638;
                    sArr3 = sArr3;
                    i18 = i13;
                    i17 = i6;
                    i19 = i19;
                    arrayList = arrayList;
                    int i31110 = i29;
                    sb3 = sb3;
                    i29 = i31110;
                    break;
                default:
                    if (C2310.f7472 >= 0) {
                        c11636 = c11638;
                        arrayList = arrayList;
                        i19 = i19;
                        StringBuilder sb23 = sb3;
                        i29 = i29;
                        sb3 = sb23;
                        int iM27616 = C0619.m2761("֨֫") ^ i16;
                        i6 = ((iM27616 ^ i15) * 26119) ^ 317019758;
                        i13 = iM27616 ^ (-695904054);
                        c11638 = c11636;
                        i18 = i13;
                        i17 = i6;
                        i19 = i19;
                        arrayList = arrayList;
                        int i31111 = i29;
                        sb3 = sb3;
                        i29 = i31111;
                    } else {
                        arrayList = arrayList;
                        sArr = sArr3;
                        i = i32;
                        i29 = i29;
                        int iM27617 = (i15 - C0619.m2761("ۨۗ")) * 7;
                        int i49 = ((iM27617 ^ i16) * 17773) ^ 688284149;
                        i32 = i;
                        arrayList = arrayList;
                        c11638 = c11638;
                        sArr3 = sArr;
                        i18 = iM27617 ^ 1655786402;
                        i29 = i29;
                        sb3 = sb3;
                        i17 = i49;
                        abstractActivityC10144 = this;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x01d8 A[PHI: r7 r10 r11 r16 r18
      0x01d8: PHI (r7v3 int) = (r7v1 int), (r7v2 int), (r7v1 int) binds: [B:16:0x0060, B:51:0x01d6, B:36:0x0124] A[DONT_GENERATE, DONT_INLINE]
      0x01d8: PHI (r10v2 short[]) = (r10v1 short[]), (r10v1 short[]), (r10v3 short[]) binds: [B:16:0x0060, B:51:0x01d6, B:36:0x0124] A[DONT_GENERATE, DONT_INLINE]
      0x01d8: PHI (r11v2 int) = (r11v1 int), (r11v1 int), (r11v3 int) binds: [B:16:0x0060, B:51:0x01d6, B:36:0x0124] A[DONT_GENERATE, DONT_INLINE]
      0x01d8: PHI (r16v20 int) = (r16v8 int), (r16v13 int), (r16v21 int) binds: [B:16:0x0060, B:51:0x01d6, B:36:0x0124] A[DONT_GENERATE, DONT_INLINE]
      0x01d8: PHI (r18v16 int) = (r18v4 int), (r18v9 int), (r18v17 int) binds: [B:16:0x0060, B:51:0x01d6, B:36:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x026e A[PHI: r4 r6 r8 r16 r18
      0x026e: PHI (r4v3 char) = (r4v2 char), (r4v1 char), (r4v1 char) binds: [B:64:0x026c, B:55:0x020e, B:47:0x01ae] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r6v3 int) = (r6v1 int), (r6v2 int), (r6v1 int) binds: [B:64:0x026c, B:55:0x020e, B:47:0x01ae] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r8v2 short) = (r8v1 short), (r8v1 short), (r8v3 short) binds: [B:64:0x026c, B:55:0x020e, B:47:0x01ae] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r16v14 int) = (r16v10 int), (r16v12 int), (r16v15 int) binds: [B:64:0x026c, B:55:0x020e, B:47:0x01ae] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r18v10 int) = (r18v6 int), (r18v8 int), (r18v11 int) binds: [B:64:0x026c, B:55:0x020e, B:47:0x01ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x02a2 A[PHI: r3 r12 r16 r18
      0x02a2: PHI (r3v3 short[]) = (r3v2 short[]), (r3v1 short[]), (r3v1 short[]) binds: [B:68:0x02a0, B:32:0x00fd, B:12:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x02a2: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:68:0x02a0, B:32:0x00fd, B:12:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x02a2: PHI (r16v26 int) = (r16v9 int), (r16v22 int), (r16v29 int) binds: [B:68:0x02a0, B:32:0x00fd, B:12:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x02a2: PHI (r18v19 int) = (r18v5 int), (r18v18 int), (r18v20 int) binds: [B:68:0x02a0, B:32:0x00fd, B:12:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public String mo26250() {
        int iM2761;
        int i;
        int i2;
        int iM3169 = 0;
        int i3 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        short s2 = 0;
        int i6 = 0;
        short[] sArr2 = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = -583526275;
        int i10 = C1783.f6087;
        int i11 = C2310.f7472;
        int iM31610 = (C0773.m3169("ܶۙ") + i11) * 41;
        int i12 = ((iM31610 ^ i10) * (-10441)) ^ (-1883442491);
        int i13 = iM31610 ^ 742820248;
        String strM5471 = null;
        while (true) {
            int i14 = i13 ^ (i12 & (((i9 ^ i10) * 18857) >> 31));
            switch (i14) {
                case -1917064657:
                case -1691287854:
                    iM3169 = iM3169;
                    i14 = i14;
                    i5 = i4 + 1;
                    if (RunnableC1848.m6360()) {
                        iM2761 = (C0773.m3169("ۖ᩵") ^ i11) * 11;
                        i = ((iM2761 ^ i10) * 20011) ^ 1481446688;
                        i2 = -2033596753;
                    } else {
                        iM2761 = C0773.m3169("᩺᩵") ^ i11;
                        i = ((iM2761 ^ i10) * (-7707)) ^ 1653832157;
                        i2 = -1700885528;
                    }
                    i9 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    iM3169 = iM3169;
                    break;
                case -1811458661:
                case -606071486:
                    if (C4282.f15546 <= 0) {
                        iM3169 = iM3169;
                        i14 = i14;
                        iM2761 = C0773.m3169("ۧۡ") ^ i10;
                        i = ((iM2761 ^ i11) * (-8551)) ^ (-1163188854);
                        i2 = -100950265;
                        i9 = i14;
                        i13 = iM2761 ^ i2;
                        i12 = i;
                        iM3169 = iM3169;
                    }
                    iM2761 = C0619.m2761("᩺ܽ") ^ i10;
                    iM3169 = iM3169;
                    i = ((iM2761 ^ i11) * (-16841)) ^ 255970695;
                    i2 = 1933493378;
                    i9 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    iM3169 = iM3169;
                    break;
                case -1606071285:
                case -21047818:
                    iM3169 = iM3169;
                    i14 = i14;
                    i4 = s * 2;
                    if (C17202.f56030) {
                        iM2761 = (i11 - C0619.m2761("᩻᩶")) * (-15);
                        i = ((iM2761 ^ i10) * 3315) ^ 203177925;
                        i2 = -17230287;
                    } else {
                        iM2761 = C0619.m2761("۠᩸") ^ i11;
                        i = ((iM2761 ^ i10) * (-14987)) ^ (-2087346694);
                        i2 = 1110815066;
                    }
                    i9 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    iM3169 = iM3169;
                    break;
                case -1519482200:
                case 1915752489:
                    iM3169 = iM3169;
                    i14 = i14;
                    i8 = 3;
                    if (C2485.f7950 != 0) {
                        iM2761 = C0773.m3169("ۧۡ") ^ i10;
                        i = ((iM2761 ^ i11) * (-8551)) ^ (-1163188854);
                        i2 = -100950265;
                    } else {
                        iM2761 = (C0773.m3169("۬ۘ") + i10) * (-31);
                        i = ((iM2761 ^ i11) * (-21877)) ^ 1262964646;
                        i2 = -185309955;
                    }
                    i9 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    iM3169 = iM3169;
                    break;
                case -1510480398:
                case -418541743:
                    C0619.m2763();
                    C2288.m7767();
                    iM2761 = C0619.m2761("᩺ܽ") ^ i10;
                    iM3169 = iM3169;
                    i = ((iM2761 ^ i11) * (-16841)) ^ 255970695;
                    i2 = 1933493378;
                    i9 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    iM3169 = iM3169;
                    break;
                case -1453774150:
                case 1333922786:
                    return C1783.m6246(this, iM3169 ^ i3);
                case -1353538041:
                case 1651392132:
                    iM3169 = iM3169;
                    i14 = i14;
                    sArr = f32484;
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0773.m3169("ۧۡ") ^ i10;
                        i = ((iM2761 ^ i11) * (-8551)) ^ (-1163188854);
                        i2 = -100950265;
                    } else {
                        iM2761 = (C0619.m2761("ܳ᩵") ^ i11) * (-17);
                        i = ((iM2761 ^ i10) * (-20585)) ^ (-258426051);
                        i2 = -1248917985;
                    }
                    i9 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    iM3169 = iM3169;
                    break;
                case -1306471085:
                case -1210503799:
                    i6 = 13619;
                    iM2761 = (C0773.m3169("ܿۧ") ^ i10) * (-33);
                    i = ((iM2761 ^ i11) * 16937) ^ (-566686835);
                    i2 = -1601420717;
                    i9 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    iM3169 = iM3169;
                    break;
                case -1293544979:
                case 1214833905:
                    C1146.m4231();
                    if (C2288.f7433 <= 0) {
                        int iM31611 = C0773.m3169("ۡ᩻") ^ i10;
                        i13 = iM31611 ^ (-1388771043);
                        i12 = ((iM31611 ^ i11) * (-22615)) ^ (-71516290);
                        i9 = i14;
                    } else {
                        iM2761 = C0619.m2761("᩺ܽ") ^ i10;
                        iM3169 = iM3169;
                        i = ((iM2761 ^ i11) * (-16841)) ^ 255970695;
                        i2 = 1933493378;
                        i9 = i14;
                        i13 = iM2761 ^ i2;
                        i12 = i;
                        iM3169 = iM3169;
                    }
                    break;
                case -1278268885:
                case 1406682700:
                    C0269.m1775();
                    if (!C2878.f9462) {
                        int iM31612 = C0773.m3169("ۡ᩻") ^ i10;
                        i13 = iM31612 ^ (-1388771043);
                        i12 = ((iM31612 ^ i11) * (-22615)) ^ (-71516290);
                        i9 = i14;
                    } else {
                        iM3169 = iM3169;
                        i14 = i14;
                        iM2761 = (C0773.m3169("ۖ᩵") ^ i11) * 11;
                        i = ((iM2761 ^ i10) * 20011) ^ 1481446688;
                        i2 = -2033596753;
                        i9 = i14;
                        i13 = iM2761 ^ i2;
                        i12 = i;
                        iM3169 = iM3169;
                    }
                    break;
                case -1254680192:
                case 1771429981:
                    iM3169 = iM3169;
                    i14 = i14;
                    s = sArr[c];
                    if (C1519.f5300 >= 0) {
                        iM3169 = iM3169;
                        iM2761 = C0619.m2761("᩺ܽ") ^ i10;
                        iM3169 = iM3169;
                        i = ((iM2761 ^ i11) * (-16841)) ^ 255970695;
                        i2 = 1933493378;
                    } else {
                        iM2761 = C0619.m2761("ۙ۟") ^ i10;
                        i = ((iM2761 ^ i11) * (-22709)) ^ 25961438;
                        i2 = -361627941;
                    }
                    i9 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    iM3169 = iM3169;
                    break;
                case -1252613937:
                case -810163311:
                    iM3169 = iM3169;
                    i14 = i14;
                    sArr2 = f32484;
                    i7 = 336;
                    if (C1542.f5343 <= 0) {
                        iM2761 = (C0773.m3169("ۖ᩵") ^ i11) * 11;
                        i = ((iM2761 ^ i10) * 20011) ^ 1481446688;
                        i2 = -2033596753;
                    } else {
                        iM2761 = C0619.m2761("᩸ۗ") ^ i11;
                        i = ((iM2761 ^ i10) * (-17953)) ^ (-1142336879);
                        i2 = 1935653550;
                    }
                    i9 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    iM3169 = iM3169;
                    break;
                case -964978350:
                case 1930615626:
                    iM3169 = iM3169;
                    i14 = i14;
                    c = 335;
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0619.m2761("۠᩸") ^ i11;
                        i = ((iM2761 ^ i10) * (-14987)) ^ (-2087346694);
                        i2 = 1110815066;
                    } else {
                        iM2761 = C0773.m3169("ۛ۫") ^ i10;
                        i = ((iM2761 ^ i11) * 22305) ^ (-1163245726);
                        i2 = 597775067;
                    }
                    i9 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    iM3169 = iM3169;
                    break;
                case -568299725:
                case 1286590346:
                    iM3169 = iM3169;
                    i14 = i14;
                    s2 = 1;
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0619.m2761("۠᩸") ^ i11;
                        i = ((iM2761 ^ i10) * (-14987)) ^ (-2087346694);
                        i2 = 1110815066;
                    } else {
                        iM2761 = (i10 - C0773.m3169("᩶ܿ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2761 ^ i11) * (-5177)) ^ (-1616128082);
                        i2 = 105185874;
                    }
                    i9 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    iM3169 = iM3169;
                    break;
                case -293751865:
                case 2133664931:
                    i6 = 42122;
                    iM2761 = (C0773.m3169("ܿۧ") ^ i10) * (-33);
                    i = ((iM2761 ^ i11) * 16937) ^ (-566686835);
                    i2 = -1601420717;
                    i9 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    iM3169 = iM3169;
                    break;
                case -101114715:
                case 611798390:
                    i14 = i14;
                    iM3169 = C0773.m3169(strM5471);
                    if (C2288.m7767()) {
                        i3 = 2121220986;
                        iM2761 = C0619.m2761("᩺ܽ") ^ i10;
                        iM3169 = iM3169;
                        i = ((iM2761 ^ i11) * (-16841)) ^ 255970695;
                        i2 = 1933493378;
                        i9 = i14;
                        i13 = iM2761 ^ i2;
                        i12 = i;
                        iM3169 = iM3169;
                    } else {
                        int iM31613 = (C0773.m3169("ۖᩳ") ^ i11) * 95;
                        i9 = i14;
                        i13 = iM31613 ^ (-709110074);
                        i12 = ((iM31613 ^ i10) * (-24749)) ^ (-1640886042);
                        i3 = 2121220986;
                    }
                    break;
                case 80438749:
                case 1928052265:
                    iM3169 = iM3169;
                    i14 = i14;
                    int i15 = s + s2;
                    if (i5 - (i15 * i15) <= 0) {
                        iM2761 = C0773.m3169("֫۫") ^ i11;
                        i = ((iM2761 ^ i10) * (-18493)) ^ (-482166601);
                        i2 = 1678928042;
                    } else {
                        iM2761 = (C0773.m3169("֫ۜ") + i10) * 119;
                        i = ((iM2761 ^ i11) * (-19937)) ^ (-239150580);
                        i2 = -1865437946;
                    }
                    i9 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    iM3169 = iM3169;
                    break;
                case 351707652:
                case 956928375:
                    C1080.m4050();
                    C2310.m7813();
                    return null;
                default:
                    i14 = i14;
                    strM5471 = C1542.m5471(sArr2, i7, i8, i6);
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0619.m2761("᩺ܽ") ^ i10;
                        iM3169 = iM3169;
                        i = ((iM2761 ^ i11) * (-16841)) ^ 255970695;
                        i2 = 1933493378;
                    } else {
                        iM2761 = C0619.m2761("ۘܰ") ^ i11;
                        iM3169 = iM3169;
                        i = ((iM2761 ^ i10) * 23533) ^ 198879096;
                        i2 = 801885348;
                    }
                    i9 = i14;
                    i13 = iM2761 ^ i2;
                    i12 = i;
                    iM3169 = iM3169;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0442 A[PHI: r3 r4 r17 r18 r20 r21
      0x0442: PHI (r3v33 boolean) = (r3v32 boolean), (r3v1 boolean), (r3v1 boolean) binds: [B:76:0x043f, B:69:0x02d0, B:61:0x026b] A[DONT_GENERATE, DONT_INLINE]
      0x0442: PHI (r4v10 l.᩷ۨᩴ) = (r4v8 l.᩷ۨᩴ), (r4v1 l.᩷ۨᩴ), (r4v1 l.᩷ۨᩴ) binds: [B:76:0x043f, B:69:0x02d0, B:61:0x026b] A[DONT_GENERATE, DONT_INLINE]
      0x0442: PHI (r17v23 int) = (r17v17 int), (r17v20 int), (r17v24 int) binds: [B:76:0x043f, B:69:0x02d0, B:61:0x026b] A[DONT_GENERATE, DONT_INLINE]
      0x0442: PHI (r18v4 int) = (r18v2 int), (r18v1 int), (r18v1 int) binds: [B:76:0x043f, B:69:0x02d0, B:61:0x026b] A[DONT_GENERATE, DONT_INLINE]
      0x0442: PHI (r20v20 l.᩵ۚۤ) = (r20v16 l.᩵ۚۤ), (r20v18 l.᩵ۚۤ), (r20v21 l.᩵ۚۤ) binds: [B:76:0x043f, B:69:0x02d0, B:61:0x026b] A[DONT_GENERATE, DONT_INLINE]
      0x0442: PHI (r21v8 java.lang.Exception) = (r21v4 java.lang.Exception), (r21v6 java.lang.Exception), (r21v9 java.lang.Exception) binds: [B:76:0x043f, B:69:0x02d0, B:61:0x026b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int iM3169;
        int i2;
        int i3;
        int iM31610;
        int i4;
        int i5;
        boolean z = false;
        AbstractC22044 abstractC22044 = null;
        boolean z2 = false;
        Exception exc = null;
        C20348 c20348M46740 = null;
        Exception exc2 = null;
        int iM5470 = 0;
        int i6 = 0;
        boolean z3 = false;
        int i7 = 0;
        int i8 = -858768003;
        int i9 = C1519.f5300;
        int i10 = C2966.f9654;
        int iM31611 = C0773.m3169("ۜ۟") ^ i10;
        int i11 = ((iM31611 ^ i9) * 8901) ^ (-1818021406);
        int i12 = iM31611 ^ 651968;
        ArrayList arrayList = null;
        int i13 = 0;
        while (true) {
            int i14 = i12 ^ (i11 & (((i8 ^ i9) * (-9631)) >> 31));
            switch (i14) {
                case -2132757220:
                case 1746511948:
                    c20348M46740 = c20348M46740;
                    exc2 = exc2;
                    i14 = i14;
                    if (mo26247()) {
                        iM31610 = (C0619.m2761("᩻ܰ") ^ i9) * 109;
                        i4 = ((iM31610 ^ i10) * 22325) ^ (-1602977768);
                        i5 = -114809112;
                    } else {
                        iM31610 = (C0619.m2761("ۖ᩺") + i10) * 81;
                        i4 = ((iM31610 ^ i9) * 26861) ^ 265894943;
                        i5 = -12350304;
                    }
                    int i15 = iM31610 ^ i5;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i15;
                    i11 = i4;
                    c20348M46740 = c20348M46740;
                    break;
                case -2108915630:
                case -1596033122:
                    c20348M46740 = c20348M46740;
                    exc2 = exc2;
                    i14 = i14;
                    if (C3998.m12930(abstractC22044)) {
                        iM31610 = C0619.m2761("ۢܺ") ^ i9;
                        i4 = ((iM31610 ^ i10) * (-595)) ^ 1493922210;
                        i5 = 1282183041;
                    } else {
                        iM31610 = (C0619.m2761("ܿ֡") + i10) * (-99);
                        i4 = ((iM31610 ^ i9) * 29023) ^ (-165364181);
                        i5 = -1953689936;
                    }
                    int i16 = iM31610 ^ i5;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i16;
                    i11 = i4;
                    c20348M46740 = c20348M46740;
                    break;
                case -1866386324:
                case -1842899577:
                    i = i14;
                    C17364.m40795((InterfaceC15872) c20348M46740, -1985229329);
                    this.f32502 = C1343.m4950(c20348M46740);
                    this.f32496 = C3690.m11991(c20348M46740);
                    this.f32504 = C4282.m13659(c20348M46740);
                    this.f32490 = c20348M46740.m46755();
                    this.f32492 = C3690.m11991(c20348M46740);
                    this.f32489 = C1542.m5470(c20348M46740);
                    this.f32494 = C1343.m4950(c20348M46740);
                    this.f32487 = C4282.m13659(c20348M46740);
                    setTitle(c20348M46740.m46758());
                    this.f32491 = c20348M46740.m46742();
                    z3 = this.f32502;
                    iM3169 = (C0619.m2761("֫ۖ") + i10) * (-107);
                    i2 = ((iM3169 ^ i9) * (-7685)) ^ (-49739142);
                    i3 = 1099098121;
                    int i17 = i;
                    i12 = iM3169 ^ i3;
                    i11 = i2;
                    i8 = i17;
                    break;
                case -1827486938:
                case 2102664720:
                    z2 = true;
                    iM31610 = C0619.m2761("۟֡") ^ i10;
                    i4 = ((iM31610 ^ i9) * (-4881)) ^ (-235245813);
                    i5 = -1027857560;
                    int i18 = iM31610 ^ i5;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i18;
                    i11 = i4;
                    c20348M46740 = c20348M46740;
                    break;
                case -1659442048:
                case 122312921:
                    c20348M46740 = c20348M46740;
                    exc2 = exc2;
                    i14 = i14;
                    short s = f32484[120];
                    int i19 = (s * 2) + 1;
                    int i20 = s + 1;
                    if (i19 - (i20 * i20) > 0) {
                        iM31610 = (i10 - C0773.m3169("۟ۨ")) * (-75);
                        i4 = ((iM31610 ^ i9) * (-11241)) ^ (-2116030030);
                        i5 = -806710521;
                    } else {
                        iM31610 = C0773.m3169("ܽܰ") ^ i9;
                        i4 = ((iM31610 ^ i10) * 10189) ^ (-2113628132);
                        i5 = 2051235695;
                    }
                    int i110 = iM31610 ^ i5;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i110;
                    i11 = i4;
                    c20348M46740 = c20348M46740;
                    break;
                case -1628045232:
                case 595589678:
                    try {
                        i = i14;
                        try {
                            this.f32488.mo40353(C4282.m13653(this.f32502));
                            m26255();
                            iM3169 = C0773.m3169("᩹ܳ") ^ i9;
                            i2 = ((iM3169 ^ i10) * 11881) ^ 1383746783;
                            i3 = 2018363228;
                        } catch (Exception e) {
                            e = e;
                            exc2 = e;
                            iM3169 = C0619.m2761("ܽۢ") ^ i10;
                            i2 = ((iM3169 ^ i9) * 7867) ^ (-986113381);
                            i3 = -343276578;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        i = i14;
                    }
                    int i111 = i;
                    i12 = iM3169 ^ i3;
                    i11 = i2;
                    i8 = i111;
                    break;
                case -1553542347:
                case -261891690:
                    i = i14;
                    c20348M46740 = C20348.m46740(C2485.m8348(abstractC22044));
                    iM5470 = C1542.m5470(c20348M46740);
                    try {
                        arrayList = new ArrayList(iM5470);
                        this.f32497 = arrayList;
                        this.f32498 = arrayList;
                        i6 = i13;
                        iM3169 = (C0773.m3169("᩺ᩳ") ^ i10) * (-69);
                        i2 = ((iM3169 ^ i9) * (-25211)) ^ (-740479297);
                        i3 = -1973284344;
                    } catch (Exception e3) {
                        exc2 = e3;
                        arrayList = null;
                        iM3169 = C0619.m2761("ܽۢ") ^ i10;
                        i2 = ((iM3169 ^ i9) * 7867) ^ (-986113381);
                        i3 = -343276578;
                    }
                    int i112 = i;
                    i12 = iM3169 ^ i3;
                    i11 = i2;
                    i8 = i112;
                    break;
                case -1522718525:
                case 760445756:
                    i7 = 38429;
                    iM31610 = (C0773.m3169("ۢܽ") ^ i9) * (-89);
                    i4 = ((iM31610 ^ i10) * 14353) ^ 682599946;
                    i5 = 828432733;
                    int i113 = iM31610 ^ i5;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i113;
                    i11 = i4;
                    c20348M46740 = c20348M46740;
                    break;
                case -1489998663:
                case 526393840:
                    C2375.m8070(this.f32499, new ViewOnClickListenerC7876(2, this));
                    this.f32499.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.᩵۬ۤ
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view) {
                            AbstractActivityC10144 abstractActivityC10144 = null;
                            int i21 = -425282079;
                            int i22 = AbstractC0116.f1064;
                            int i23 = C2375.f7641;
                            int iM2761 = (i23 - C0619.m2761("᩺ۚ")) * 53;
                            int i24 = ((iM2761 ^ i22) * 23327) ^ 323677354;
                            int i25 = 1867833096;
                            while (true) {
                                i21 = ((((i21 ^ i22) * (-20807)) >> 31) & i24) ^ (iM2761 ^ i25);
                                switch (i21) {
                                    case -2130377571:
                                    case -1223340000:
                                        abstractActivityC10144 = this.f65914;
                                        if (C3448.f11240 >= 0) {
                                            iM2761 = (i22 - C0773.m3169("ᩳۧ")) * 71;
                                            i24 = ((iM2761 ^ i23) * 6683) ^ 1000848783;
                                            i25 = -1138834306;
                                        } else {
                                            iM2761 = (C0619.m2761("֨֡") ^ i23) * (-15);
                                            i24 = ((iM2761 ^ i22) * (-22387)) ^ 326836570;
                                            i25 = 83442849;
                                        }
                                        break;
                                    case -2064576615:
                                    case -1659710105:
                                        if (C4238.f15451 >= 0) {
                                            iM2761 = (i23 - C0619.m2761("۬۫")) * 109;
                                            i24 = ((iM2761 ^ i22) * (-21069)) ^ (-104320103);
                                            i25 = 1359935664;
                                        } else {
                                            iM2761 = C0619.m2761("֡ۙ") ^ i22;
                                            i24 = ((iM2761 ^ i23) * 29321) ^ (-1120176227);
                                            i25 = 1584156147;
                                        }
                                        break;
                                    case -1905860932:
                                    case 576565150:
                                        if (C3690.f12684 <= 0) {
                                            iM2761 = (i23 - C0619.m2761("۬۫")) * 109;
                                            i24 = ((iM2761 ^ i22) * (-21069)) ^ (-104320103);
                                            i25 = 1359935664;
                                        } else {
                                            iM2761 = (i23 - C0773.m3169("ܰܿ")) * 61;
                                            i24 = ((iM2761 ^ i22) * 28463) ^ 51240426;
                                            i25 = 1944863275;
                                        }
                                        break;
                                    case -1821896510:
                                    case -1136306607:
                                        C4282.m13644();
                                        C3779.m12264();
                                        return false;
                                    case -1786147197:
                                    case 743763454:
                                        if (C2419.f7754 >= 0) {
                                            iM2761 = (C0773.m3169("ۤܶ") ^ i22) * (-89);
                                            i24 = ((iM2761 ^ i23) * (-433)) ^ (-1182978592);
                                            i25 = -1709223332;
                                        } else {
                                            iM2761 = (i22 - C0773.m3169("ᩴ۬")) * (-37);
                                            i24 = ((iM2761 ^ i23) * 12585) ^ 224349503;
                                            i25 = -375781616;
                                        }
                                        break;
                                    case -1616000474:
                                    case -29561646:
                                        if (C0773.f2792 > 0) {
                                            iM2761 = C0773.m3169("ۚۙ") ^ i22;
                                            i24 = ((iM2761 ^ i23) * 20867) ^ (-832873384);
                                            i25 = 537171774;
                                        } else {
                                            iM2761 = (i23 - C0619.m2761("۬۫")) * 109;
                                            i24 = ((iM2761 ^ i22) * (-21069)) ^ (-104320103);
                                            i25 = 1359935664;
                                        }
                                        break;
                                    case -1510322268:
                                    case 688365022:
                                        if (C2354.f7599 >= 0) {
                                            iM2761 = (i23 - C0619.m2761("۬۫")) * 109;
                                            i24 = ((iM2761 ^ i22) * (-21069)) ^ (-104320103);
                                            i25 = 1359935664;
                                        } else {
                                            iM2761 = C0619.m2761("ܶ۫") ^ i22;
                                            i24 = ((iM2761 ^ i23) * 14197) ^ (-789565491);
                                            i25 = -2061820076;
                                        }
                                        break;
                                    case -1502736181:
                                    case 194589342:
                                        C1564.m5509();
                                        iM2761 = (i23 - C0619.m2761("۬۫")) * 109;
                                        i24 = ((iM2761 ^ i22) * (-21069)) ^ (-104320103);
                                        i25 = 1359935664;
                                        break;
                                    case -1316221824:
                                    case 1581104101:
                                        if (C1783.f6087 <= 0) {
                                            iM2761 = (i22 - C0773.m3169("ᩳۧ")) * 71;
                                            i24 = ((iM2761 ^ i23) * 6683) ^ 1000848783;
                                            i25 = -1138834306;
                                        } else {
                                            iM2761 = C0619.m2761("ۡܰ") ^ i23;
                                            i24 = ((iM2761 ^ i22) * 21477) ^ 1319847404;
                                            i25 = -372466319;
                                        }
                                        break;
                                    case -855198777:
                                    case 1079723486:
                                        if (C2834.f9334 <= 0) {
                                            iM2761 = (C0773.m3169("ۤܶ") ^ i22) * (-89);
                                            i24 = ((iM2761 ^ i23) * (-433)) ^ (-1182978592);
                                            i25 = -1709223332;
                                        } else {
                                            iM2761 = C0619.m2761("ۘ֫") ^ i23;
                                            i24 = ((iM2761 ^ i22) * 16049) ^ 637694027;
                                            i25 = -514342103;
                                        }
                                        break;
                                    case -566589297:
                                    case 1517421847:
                                        if (C0269.m1775() <= 0) {
                                            iM2761 = C0773.m3169("ۚۙ") ^ i22;
                                            i24 = ((iM2761 ^ i23) * 20867) ^ (-832873384);
                                            i25 = 537171774;
                                        } else {
                                            iM2761 = C0619.m2761("ۤۛ") ^ i23;
                                            i24 = ((iM2761 ^ i22) * 11851) ^ (-1462403986);
                                            i25 = 1295010896;
                                        }
                                        break;
                                    case 156608375:
                                    case 570762273:
                                        AbstractActivityC10144.m26227(abstractActivityC10144);
                                        return true;
                                    case 206860942:
                                    case 1999940570:
                                        C1826.m6301();
                                        if (C0862.f3233 == 0) {
                                            iM2761 = (C0773.m3169("ۤܶ") ^ i22) * (-89);
                                            i24 = ((iM2761 ^ i23) * (-433)) ^ (-1182978592);
                                            i25 = -1709223332;
                                        } else {
                                            iM2761 = (i23 - C0619.m2761("۬۫")) * 109;
                                            i24 = ((iM2761 ^ i22) * (-21069)) ^ (-104320103);
                                            i25 = 1359935664;
                                        }
                                        break;
                                    case 605729213:
                                    case 1098727947:
                                        if (C0773.f2792 <= 0) {
                                            iM2761 = (C0773.m3169("ۤܶ") ^ i22) * (-89);
                                            i24 = ((iM2761 ^ i23) * (-433)) ^ (-1182978592);
                                            i25 = -1709223332;
                                        } else {
                                            iM2761 = (i23 - C0619.m2761("ۡᩴ")) * (-113);
                                            i24 = ((iM2761 ^ i22) * (-2709)) ^ (-1217128010);
                                            i25 = 1719547412;
                                        }
                                        break;
                                    case 941641494:
                                    case 971899998:
                                        if (C2419.f7754 >= 0) {
                                            iM2761 = (C0773.m3169("ۤܶ") ^ i22) * (-89);
                                            i24 = ((iM2761 ^ i23) * (-433)) ^ (-1182978592);
                                            i25 = -1709223332;
                                        } else {
                                            iM2761 = (C0773.m3169("᩹֨") ^ i22) * (-43);
                                            i24 = ((iM2761 ^ i23) * (-26847)) ^ 5076239;
                                            i25 = -2080777752;
                                        }
                                        break;
                                    default:
                                        if (AbstractC0116.m1243() != 0) {
                                            iM2761 = (i23 - C0619.m2761("۬۫")) * 109;
                                            i24 = ((iM2761 ^ i22) * (-21069)) ^ (-104320103);
                                            i25 = 1359935664;
                                        } else {
                                            iM2761 = C0773.m3169("᩶۟") ^ i22;
                                            i24 = ((iM2761 ^ i23) * (-3519)) ^ 2146629526;
                                            i25 = -1578661583;
                                        }
                                        break;
                                }
                            }
                        }
                    });
                    break;
                case -1211075423:
                case 1699151768:
                    z2 = false;
                    iM31610 = C0619.m2761("۟֡") ^ i10;
                    i4 = ((iM31610 ^ i9) * (-4881)) ^ (-235245813);
                    i5 = -1027857560;
                    int i114 = iM31610 ^ i5;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i114;
                    i11 = i4;
                    c20348M46740 = c20348M46740;
                    break;
                case -1080680718:
                case 296362609:
                    i = i14;
                    mo19738();
                    iM3169 = C0773.m3169("᩹ܳ") ^ i9;
                    i2 = ((iM3169 ^ i10) * 11881) ^ 1383746783;
                    i3 = 2018363228;
                    int i115 = i;
                    i12 = iM3169 ^ i3;
                    i11 = i2;
                    i8 = i115;
                    break;
                case -777360630:
                case 1396608711:
                    i14 = i14;
                    c20348M46740 = c20348M46740;
                    exc2 = exc2;
                    this.f32500 = C0950.m3781(ApplicationC17729.f58258, C1826.m6310(f32484, 155, 23, i7), z);
                    iM31610 = (C0619.m2761("ۖ᩺") + i10) * 81;
                    i4 = ((iM31610 ^ i9) * 26861) ^ 265894943;
                    i5 = -12350304;
                    int i116 = iM31610 ^ i5;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i116;
                    i11 = i4;
                    c20348M46740 = c20348M46740;
                    break;
                case -615404568:
                case 1664957087:
                    i = i14;
                    i6++;
                    iM3169 = (C0773.m3169("᩺ᩳ") ^ i10) * (-69);
                    i2 = ((iM3169 ^ i9) * (-25211)) ^ (-740479297);
                    i3 = -1973284344;
                    int i117 = i;
                    i12 = iM3169 ^ i3;
                    i11 = i2;
                    i8 = i117;
                    break;
                case -407878012:
                case 2088221601:
                    c20348M46740 = c20348M46740;
                    exc2 = exc2;
                    i14 = i14;
                    super.onCreate(bundle);
                    m40415();
                    C2878.m9476(this, C0619.m2761(C1542.m5471(f32484, UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 3, i7)) ^ 2098819543);
                    C1564.m5518(this, C0773.m3169(AbstractC3624.m11769(f32484, 124, 3, i7)) ^ 2130003856);
                    C16390 c16390 = (C16390) C2878.m9476(this, C0619.m2761(C2702.m8881(f32484, 127, 3, i7)) ^ 2126267761);
                    this.f56046 = c16390;
                    C11235.m28312(this, c16390);
                    AbstractC0116.m1238(this);
                    C7068 onBackPressedDispatcher = getOnBackPressedDispatcher();
                    C12382 c12382 = new C12382(this);
                    C17202.m40369(onBackPressedDispatcher);
                    onBackPressedDispatcher.m19400(c12382);
                    C3099.m10093(this.f56046, new ViewOnClickListenerC8040(2, this));
                    C11870 c11870 = (C11870) C2878.m9476(this, C0773.m3169(C2702.m8881(f32484, 130, 3, i7)) ^ 2120805363);
                    this.f32499 = c11870;
                    c11870.m29754(C0773.m3169(C4238.m13530(f32484, 133, 3, i7)) ^ 2121374974, 0);
                    this.f32499.m29754(C0773.m3169(C1826.m6310(f32484, 136, 3, i7)) ^ 2099463957, 0);
                    this.f32499.m29754(C0773.m3169(RunnableC3055.m9937(f32484, 139, 3, i7)) ^ 2127930590, 45);
                    this.f32499.m29754(C0619.m2761(C11235.m28300(f32484, 142, 3, i7)) ^ 2097976708, 0);
                    this.f32499.m29754(C0773.m3169(C3998.m12925(f32484, 145, 3, i7)) ^ 2118051550, 0);
                    ListView listView = (ListView) C1564.m5518(this, R.id.list);
                    z = true;
                    listView.setFastScrollEnabled(true);
                    listView.setOnItemClickListener(this);
                    listView.setOnItemLongClickListener(this);
                    C19095 c19095 = new C19095(this);
                    this.f32501 = c19095;
                    listView.setAdapter((ListAdapter) c19095);
                    listView.setOnItemClickListener(this);
                    this.f32503 = new DialogInterfaceOnDismissListenerC20840(this);
                    AbstractC22044 abstractC22045 = f32486;
                    if (bundle != null) {
                        int iM2761 = C0619.m2761("ۨۧ") ^ i9;
                        abstractC22044 = abstractC22045;
                        i11 = ((iM2761 ^ i10) * 12449) ^ 1743467142;
                        i8 = i14;
                        exc2 = exc2;
                        i13 = 0;
                        i12 = iM2761 ^ (-1208691684);
                    } else {
                        abstractC22044 = abstractC22045;
                        i13 = 0;
                        iM31610 = (C0619.m2761("ܿ֡") + i10) * (-99);
                        i4 = ((iM31610 ^ i9) * 29023) ^ (-165364181);
                        i5 = -1953689936;
                        int i118 = iM31610 ^ i5;
                        i8 = i14;
                        exc2 = exc2;
                        i12 = i118;
                        i11 = i4;
                    }
                    c20348M46740 = c20348M46740;
                    break;
                case -138882112:
                case 1604533257:
                    c20348M46740 = c20348M46740;
                    exc2 = exc2;
                    i14 = i14;
                    try {
                        mo19737(z2);
                        iM31610 = C0619.m2761("۬۬") ^ i10;
                        i4 = ((iM31610 ^ i9) * 2539) ^ (-1246906236);
                        i5 = 503295327;
                        int i119 = iM31610 ^ i5;
                        i8 = i14;
                        exc2 = exc2;
                        i12 = i119;
                    } catch (Exception e4) {
                        int iM31612 = C0773.m3169("ܳ᩹") ^ i10;
                        i4 = ((iM31612 ^ i9) * (-30703)) ^ (-4777817);
                        i8 = i14;
                        exc2 = exc2;
                        i12 = iM31612 ^ (-2088621801);
                        exc = e4;
                    }
                    i11 = i4;
                    c20348M46740 = c20348M46740;
                    break;
                case -91660202:
                case 317645679:
                    i = i14;
                    if (z3) {
                        iM3169 = (C0619.m2761("᩶ܶ") + i10) * 45;
                        i2 = ((iM3169 ^ i9) * (-25973)) ^ 1899869346;
                        i3 = -682379716;
                    } else {
                        iM3169 = (C0773.m3169("ۢ֨") + i9) * (-49);
                        i2 = ((iM3169 ^ i10) * (-28731)) ^ (-2125757866);
                        i3 = 467897829;
                    }
                    int i1110 = i;
                    i12 = iM3169 ^ i3;
                    i11 = i2;
                    i8 = i1110;
                    break;
                case 107352249:
                case 1753913564:
                    c20348M46740 = c20348M46740;
                    exc2 = exc2;
                    i14 = i14;
                    if (C3099.m10085(bundle, RunnableC3646.m11809(f32484, 148, 7, i7))) {
                        iM31610 = (C0619.m2761("֫ۚ") + i9) * (-101);
                        i4 = ((iM31610 ^ i10) * (-9859)) ^ 1676819161;
                        i5 = 1914136356;
                    } else {
                        iM31610 = (C0619.m2761("ܿ֡") + i10) * (-99);
                        i4 = ((iM31610 ^ i9) * 29023) ^ (-165364181);
                        i5 = -1953689936;
                    }
                    int i1111 = iM31610 ^ i5;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i1111;
                    i11 = i4;
                    c20348M46740 = c20348M46740;
                    break;
                case 513611122:
                case 2123910191:
                    m40402(exc, z);
                    break;
                case 622286611:
                case 2110872987:
                    i = i14;
                    RunnableC0334.m2054(arrayList, new C11636(c20348M46740));
                    iM3169 = (C0773.m3169("ܿ֨") + i9) * 99;
                    i2 = ((iM3169 ^ i10) * 26431) ^ (-1529482990);
                    i3 = -1256489616;
                    int i1112 = i;
                    i12 = iM3169 ^ i3;
                    i11 = i2;
                    i8 = i1112;
                    break;
                case 675292300:
                case 757897366:
                    i = i14;
                    if (i6 < iM5470) {
                        iM3169 = C0773.m3169("۫᩻") ^ i10;
                        i2 = ((iM3169 ^ i9) * 28531) ^ 1890276076;
                        i3 = -1207410144;
                    } else {
                        iM3169 = (C0773.m3169("֨ܽ") + i9) * (-117);
                        i2 = ((iM3169 ^ i10) * (-21905)) ^ (-810847398);
                        i3 = 1223898267;
                    }
                    int i1113 = i;
                    i12 = iM3169 ^ i3;
                    i11 = i2;
                    i8 = i1113;
                    break;
                case 941354533:
                case 1374244364:
                    i7 = 52626;
                    iM31610 = (C0773.m3169("ۢܽ") ^ i9) * (-89);
                    i4 = ((iM31610 ^ i10) * 14353) ^ 682599946;
                    i5 = 828432733;
                    int i1114 = iM31610 ^ i5;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i1114;
                    i11 = i4;
                    c20348M46740 = c20348M46740;
                    break;
                case 948519072:
                case 1209699575:
                    c20348M46740 = c20348M46740;
                    exc2 = exc2;
                    i14 = i14;
                    if (z2) {
                        iM31610 = C0773.m3169("᩷ۜ") ^ i9;
                        i4 = ((iM31610 ^ i10) * 697) ^ (-285573358);
                        i5 = 2082175055;
                    } else {
                        iM31610 = C0773.m3169("ۗۤ") ^ i10;
                        i4 = ((iM31610 ^ i9) * 28969) ^ 536499770;
                        i5 = -1934279329;
                    }
                    int i1115 = iM31610 ^ i5;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i1115;
                    i11 = i4;
                    c20348M46740 = c20348M46740;
                    break;
                case 1138950368:
                case 1989484888:
                    m40402(exc2, z);
                    break;
                default:
                    try {
                        this.f32499.m29748();
                        i = i14;
                        iM3169 = (C0773.m3169("ۢ֨") + i9) * (-49);
                        i2 = ((iM3169 ^ i10) * (-28731)) ^ (-2125757866);
                        i3 = 467897829;
                    } catch (Exception e5) {
                        exc2 = e5;
                        i = i14;
                        iM3169 = C0619.m2761("ܽۢ") ^ i10;
                        i2 = ((iM3169 ^ i9) * 7867) ^ (-986113381);
                        i3 = -343276578;
                    }
                    int i1116 = i;
                    i12 = iM3169 ^ i3;
                    i11 = i2;
                    i8 = i1116;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x023e A[PHI: r4 r5 r6 r7
      0x023e: PHI (r4v4 java.lang.String) = (r4v2 java.lang.String), (r4v3 java.lang.String), (r4v2 java.lang.String) binds: [B:64:0x023c, B:39:0x012e, B:32:0x00e6] A[DONT_GENERATE, DONT_INLINE]
      0x023e: PHI (r5v4 l.᩹ۖ᩸) = (r5v2 l.᩹ۖ᩸), (r5v3 l.᩹ۖ᩸), (r5v2 l.᩹ۖ᩸) binds: [B:64:0x023c, B:39:0x012e, B:32:0x00e6] A[DONT_GENERATE, DONT_INLINE]
      0x023e: PHI (r6v4 boolean) = (r6v2 boolean), (r6v3 boolean), (r6v2 boolean) binds: [B:64:0x023c, B:39:0x012e, B:32:0x00e6] A[DONT_GENERATE, DONT_INLINE]
      0x023e: PHI (r7v3 l.۠ۖۧ) = (r7v2 l.۠ۖۧ), (r7v2 l.۠ۖۧ), (r7v4 l.۠ۖۧ) binds: [B:64:0x023c, B:39:0x012e, B:32:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x02ae A[PHI: r3
      0x02ae: PHI (r3v4 l.۟۬ۤ) = (r3v2 l.۟۬ۤ), (r3v2 l.۟۬ۤ), (r3v3 l.۟۬ۤ), (r3v2 l.۟۬ۤ), (r3v2 l.۟۬ۤ) binds: [B:76:0x02ac, B:68:0x026e, B:43:0x015b, B:16:0x005e, B:7:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x02fc  */
    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int iM2761;
        int i2;
        int i3;
        int i4 = 0;
        final C11636 c11636 = null;
        final C7908 c7908 = null;
        String str = null;
        C23255 c23255 = null;
        boolean z = false;
        DialogInterfaceC8327 dialogInterfaceC8327 = null;
        String str2 = null;
        C23255 c23256 = null;
        int i5 = -1770464968;
        int i6 = RunnableC3055.f9898;
        int i7 = C0487.f2131;
        int iM2762 = C0619.m2761("ܿܺ") ^ i7;
        int i8 = ((iM2762 ^ i6) * 5725) ^ (-1367919569);
        int i9 = -1605225170;
        while (true) {
            int i10 = iM2762 ^ i9;
            while (true) {
                i5 = ((((i5 ^ i6) * (-9565)) >> 31) & i8) ^ i10;
                switch (i5) {
                    case -2106331841:
                    case 703564061:
                        if (C1783.f6087 <= 0) {
                            iM2761 = C0619.m2761("ܶۜ") ^ i6;
                            i2 = ((iM2761 ^ i7) * (-19247)) ^ 939556807;
                            i3 = -849522359;
                        } else {
                            iM2761 = (i6 - C0619.m2761("۬۟")) * (-93);
                            i2 = ((iM2761 ^ i7) * (-29571)) ^ (-1666818192);
                            i3 = -1734827919;
                        }
                        i10 = iM2761 ^ i3;
                        i8 = i2;
                        break;
                    case -2070486132:
                    case -339662150:
                        mo26248(c11636.f36490);
                        break;
                    case -2054878214:
                    case -1827227259:
                        if (this.f32502) {
                            iM2761 = C0773.m3169("᩶ܿ") ^ i6;
                            i2 = ((iM2761 ^ i7) * (-4757)) ^ 725755242;
                            i3 = -1638368012;
                        } else {
                            iM2761 = C0619.m2761("ۙۨ") ^ i6;
                            i2 = ((iM2761 ^ i7) * (-1121)) ^ 845666168;
                            i3 = 1661942711;
                        }
                        i10 = iM2761 ^ i3;
                        i8 = i2;
                        break;
                    case -1995237604:
                    case -122706615:
                        c7908 = new C7908(this);
                        C23916.m53425(c7908.f26267, c11636.m29233());
                        if (C23916.f77426 <= 0) {
                            iM2761 = C0773.m3169("֫ܽ") ^ i6;
                            i2 = ((iM2761 ^ i7) * 4491) ^ 1213201394;
                            i3 = -1579092271;
                        } else {
                            iM2761 = (C0619.m2761("ܺܳ") + i6) * (-65);
                            i2 = ((iM2761 ^ i7) * 6283) ^ 355351941;
                            i3 = -1177990565;
                        }
                        i10 = iM2761 ^ i3;
                        i8 = i2;
                        break;
                    case -1941088140:
                    case 933443672:
                        str = c11636.f36488;
                        c23255 = c7908.f26268;
                        C2310.m7800(c23255, str);
                        z = true;
                        if (AbstractC0116.f1064 <= 0) {
                            iM2761 = (C0619.m2761("ܽ᩷") + i6) * (-95);
                            i2 = ((iM2761 ^ i7) * (-9183)) ^ (-608397368);
                            i3 = -799491394;
                        } else {
                            iM2761 = (C0619.m2761("ۤᩴ") + i7) * (-49);
                            i2 = ((iM2761 ^ i6) * 20331) ^ 889476413;
                            i3 = 210763586;
                        }
                        i10 = iM2761 ^ i3;
                        i8 = i2;
                        break;
                    case -1884516838:
                    case 579050195:
                        c23255.m54107(z);
                        dialogInterfaceC8327 = c7908.f26265;
                        dialogInterfaceC8327.m22432();
                        Button buttonM9932 = RunnableC3055.m9932(dialogInterfaceC8327);
                        if (C11235.f35427 >= 0) {
                            iM2761 = (C0619.m2761("ܽ᩷") + i6) * (-95);
                            i2 = ((iM2761 ^ i7) * (-9183)) ^ (-608397368);
                            i3 = -799491394;
                        } else {
                            C2375.m8070(buttonM9932, new View.OnClickListener() { // from class: l.᩶۬ۤ

                                /* JADX INFO: renamed from: ۙ֡ۜ, reason: not valid java name and contains not printable characters */
                                private static final short[] f67973 = {2843, 11157, 11842, -9994};

                                {
                                    int i11 = 8100211;
                                    int i12 = C2966.f9654;
                                    int i13 = C2288.f7433;
                                    int iM2763 = (C0619.m2761("ܳۚ") ^ i13) * 31;
                                    int i14 = ((iM2763 ^ i12) * (-11323)) ^ 1182101690;
                                    int i15 = -1163456262;
                                    while (true) {
                                        i11 = ((((i11 ^ i12) * (-20713)) >> 31) & i14) ^ (iM2763 ^ i15);
                                        switch (i11) {
                                            case -2020828525:
                                            case 918231453:
                                                if (C3077.f9998) {
                                                    iM2763 = (C0773.m3169("ܺۛ") ^ i13) * (-117);
                                                    i14 = ((iM2763 ^ i12) * 4381) ^ 1661911560;
                                                    i15 = 837883302;
                                                } else {
                                                    iM2763 = (i12 - C0773.m3169("᩸ۛ")) * (-113);
                                                    i14 = ((iM2763 ^ i13) * 5601) ^ 2093581243;
                                                    i15 = -1609844162;
                                                }
                                                break;
                                            case -1611528420:
                                            case -1501627058:
                                                if (C13473.f42873 != 0) {
                                                    iM2763 = (i12 - C0773.m3169("᩸ۛ")) * (-113);
                                                    i14 = ((iM2763 ^ i13) * 5601) ^ 2093581243;
                                                    i15 = -1609844162;
                                                } else {
                                                    iM2763 = C0773.m3169("ۢܶ") ^ i13;
                                                    i14 = ((iM2763 ^ i12) * 32607) ^ 83938642;
                                                    i15 = -2014688545;
                                                }
                                                break;
                                            case -1555188628:
                                            case 1911952423:
                                                if (C2878.f9462) {
                                                    iM2763 = C0619.m2761("᩻ۙ") ^ i12;
                                                    i14 = ((iM2763 ^ i13) * (-6221)) ^ 1489803856;
                                                    i15 = -222653409;
                                                } else {
                                                    iM2763 = (C0773.m3169("᩷ۗ") + i12) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                                    i14 = ((iM2763 ^ i13) * (-1161)) ^ 1486347530;
                                                    i15 = -1692764708;
                                                }
                                                break;
                                            case -1549116649:
                                            case -448362788:
                                                if (C1519.m5403()) {
                                                    iM2763 = (i13 - C0773.m3169("۬ۘ")) * 115;
                                                    i14 = ((iM2763 ^ i12) * (-15469)) ^ (-1753735221);
                                                    i15 = -1983282385;
                                                } else {
                                                    iM2763 = (i12 - C0619.m2761("ۧ۬")) * (-59);
                                                    i14 = ((iM2763 ^ i13) * 16437) ^ 1183697057;
                                                    i15 = 1689863622;
                                                }
                                                break;
                                            case -1451470201:
                                            case -837755038:
                                                if (C2702.f8586 <= 0) {
                                                    iM2763 = C0619.m2761("᩻ۙ") ^ i12;
                                                    i14 = ((iM2763 ^ i13) * (-6221)) ^ 1489803856;
                                                    i15 = -222653409;
                                                } else {
                                                    iM2763 = C0773.m3169("֫ܶ") ^ i12;
                                                    i14 = ((iM2763 ^ i13) * (-29535)) ^ (-2080086780);
                                                    i15 = -306658996;
                                                }
                                                break;
                                            case -1386671856:
                                            case -1023380874:
                                                C3779.m12264();
                                                if (C1564.f5401 > 0) {
                                                    iM2763 = C0619.m2761("᩻ۙ") ^ i12;
                                                    i14 = ((iM2763 ^ i13) * (-6221)) ^ 1489803856;
                                                    i15 = -222653409;
                                                } else {
                                                    iM2763 = (i13 - C0773.m3169("֡ܳ")) * (-13);
                                                    i14 = ((iM2763 ^ i12) * (-21817)) ^ (-1139328890);
                                                    i15 = 1600022116;
                                                }
                                                break;
                                            case -1154614579:
                                            case 1585667125:
                                                C2419.m8174();
                                                throw new RuntimeException();
                                            case -1113835144:
                                            case 107827614:
                                                if (C2287.f7432 < 0) {
                                                    iM2763 = C0619.m2761("ۢ۫") ^ i13;
                                                    i14 = ((iM2763 ^ i12) * 27303) ^ (-726860039);
                                                    i15 = 1922835710;
                                                } else {
                                                    iM2763 = C0619.m2761("᩻ۙ") ^ i12;
                                                    i14 = ((iM2763 ^ i13) * (-6221)) ^ 1489803856;
                                                    i15 = -222653409;
                                                }
                                                break;
                                            case -440880874:
                                            case -272070670:
                                                return;
                                            case -410566318:
                                            case 1873177186:
                                                C4282.m13644();
                                                iM2763 = (i13 - C0773.m3169("֡ܳ")) * (-13);
                                                i14 = ((iM2763 ^ i12) * (-21817)) ^ (-1139328890);
                                                i15 = 1600022116;
                                                break;
                                            case 125646762:
                                            case 798519435:
                                                if (C1826.f6190 <= 0) {
                                                    iM2763 = (i12 - C0773.m3169("᩸ۛ")) * (-113);
                                                    i14 = ((iM2763 ^ i13) * 5601) ^ 2093581243;
                                                    i15 = -1609844162;
                                                } else {
                                                    iM2763 = C0619.m2761("ۜܺ") ^ i13;
                                                    i14 = ((iM2763 ^ i12) * 25193) ^ 886929691;
                                                    i15 = -925292782;
                                                }
                                                break;
                                            case 281993194:
                                            case 1124803922:
                                                if (C23916.f77426 <= 0) {
                                                    iM2763 = (i12 - C0619.m2761("ۧ۬")) * (-59);
                                                    i14 = ((iM2763 ^ i13) * 16437) ^ 1183697057;
                                                    i15 = 1689863622;
                                                } else {
                                                    iM2763 = (i13 - C0773.m3169("֡ܳ")) * (-13);
                                                    i14 = ((iM2763 ^ i12) * (-21817)) ^ (-1139328890);
                                                    i15 = 1600022116;
                                                }
                                                break;
                                            case 514780641:
                                            case 568090802:
                                                if (C3734.f12817 >= 0) {
                                                    iM2763 = C0619.m2761("ۢ۫") ^ i13;
                                                    i14 = ((iM2763 ^ i12) * 27303) ^ (-726860039);
                                                    i15 = 1922835710;
                                                } else {
                                                    iM2763 = (C0619.m2761("ۙܳ") + i12) * 87;
                                                    i14 = ((iM2763 ^ i13) * 30259) ^ (-1486762112);
                                                    i15 = -102445913;
                                                }
                                                break;
                                            case 1386379548:
                                            case 2039807711:
                                                if (C4238.f15451 >= 0) {
                                                    iM2763 = C0619.m2761("᩻ۙ") ^ i12;
                                                    i14 = ((iM2763 ^ i13) * (-6221)) ^ 1489803856;
                                                    i15 = -222653409;
                                                } else {
                                                    iM2763 = C0773.m3169("ۢ֨") ^ i12;
                                                    i14 = ((iM2763 ^ i13) * 26675) ^ 321748585;
                                                    i15 = -1299747250;
                                                }
                                                break;
                                            case 1890038372:
                                            case 1912524533:
                                                if (C1519.f5300 >= 0) {
                                                    iM2763 = (i13 - C0773.m3169("֡ܳ")) * (-13);
                                                    i14 = ((iM2763 ^ i12) * (-21817)) ^ (-1139328890);
                                                    i15 = 1600022116;
                                                } else {
                                                    iM2763 = C0619.m2761("᩺۟") ^ i12;
                                                    i14 = ((iM2763 ^ i13) * (-24657)) ^ (-528746082);
                                                    i15 = 1052157297;
                                                }
                                                break;
                                            default:
                                                if (C2702.f8586 <= 0) {
                                                    iM2763 = (i12 - C0619.m2761("ۧ۬")) * (-59);
                                                    i14 = ((iM2763 ^ i13) * 16437) ^ 1183697057;
                                                    i15 = 1689863622;
                                                } else {
                                                    iM2763 = (C0773.m3169("ᩴܳ") + i13) * 69;
                                                    i14 = ((iM2763 ^ i12) * 29663) ^ 1376243124;
                                                    i15 = 1326664558;
                                                }
                                                break;
                                        }
                                    }
                                }

                                /* JADX WARN: Code duplicated, block: B:61:0x023b A[PHI: r9 r18
                                  0x023b: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:60:0x0239, B:29:0x00ed, B:7:0x0064] A[DONT_GENERATE, DONT_INLINE]
                                  0x023b: PHI (r18v4 int) = (r18v3 int), (r18v2 int), (r18v2 int) binds: [B:60:0x0239, B:29:0x00ed, B:7:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
                                /* JADX WARN: Code duplicated, block: B:69:0x028e A[PHI: r15 r16
                                  0x028e: PHI (r15v4 short) = (r15v2 short), (r15v3 short), (r15v2 short), (r15v2 short), (r15v2 short) binds: [B:68:0x028c, B:56:0x0217, B:23:0x00be, B:16:0x0097, B:109:0x028e] A[DONT_GENERATE, DONT_INLINE]
                                  0x028e: PHI (r16v4 char) = (r16v3 char), (r16v2 char), (r16v2 char), (r16v2 char), (r16v2 char) binds: [B:68:0x028c, B:56:0x0217, B:23:0x00be, B:16:0x0097, B:109:0x028e] A[DONT_GENERATE, DONT_INLINE]] */
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int iM3169;
                                    int i11;
                                    int i12;
                                    int iM2763;
                                    int i13;
                                    short[] sArr;
                                    ViewOnClickListenerC21333 viewOnClickListenerC21333 = this;
                                    int i14 = 508169247;
                                    int i15 = C1826.f6190;
                                    int i16 = C0269.f1558;
                                    int iM2764 = C0619.m2761("֡ܽ") ^ i16;
                                    int i17 = ((iM2764 ^ i15) * 21085) ^ 794505581;
                                    int i18 = iM2764 ^ (-1547730714);
                                    String str3 = null;
                                    short[] sArr2 = null;
                                    short[] sArr3 = null;
                                    int iM2765 = 0;
                                    int i19 = 0;
                                    int i20 = 0;
                                    int i21 = 0;
                                    short s = 0;
                                    char c = 0;
                                    short s2 = 0;
                                    int i22 = 0;
                                    short s3 = 0;
                                    C11636 c11637 = null;
                                    AbstractActivityC10144 abstractActivityC10144 = null;
                                    String strM6952 = null;
                                    InterfaceC19106 interfaceC19106M11756 = null;
                                    C23255 c23257 = null;
                                    C7908 c7909 = null;
                                    while (true) {
                                        i14 = i18 ^ (i17 & (((i14 ^ i15) * (-29485)) >> 31));
                                        switch (i14) {
                                            case -2093744232:
                                            case -1441738466:
                                                abstractActivityC10144.m26255();
                                                C11235.m28311(c7909.f26265);
                                                break;
                                            case -2087431889:
                                            case 1032962583:
                                                C3077.m10039(2125060649 ^ iM2765);
                                                C2287.m7751(c23257);
                                                break;
                                            case -1996621982:
                                            case 122879688:
                                                C11235.m28309();
                                                C2288.m7767();
                                                break;
                                            case -1968275351:
                                            case 781072391:
                                                sArr = f67973;
                                                if (C11235.m28309() == 0) {
                                                    int iM31610 = C0773.m3169("֫ۙ") ^ i16;
                                                    i11 = ((iM31610 ^ i15) * 19605) ^ 644694164;
                                                    i18 = iM31610 ^ (-1627648758);
                                                    viewOnClickListenerC21333 = this;
                                                    sArr2 = sArr;
                                                    i17 = i11;
                                                } else {
                                                    int iM31611 = (C0773.m3169("ۗ۟") ^ i16) * 25;
                                                    i18 = iM31611 ^ (-893074292);
                                                    sArr2 = sArr;
                                                    i17 = ((iM31611 ^ i15) * 19313) ^ 1973594842;
                                                    viewOnClickListenerC21333 = this;
                                                }
                                                break;
                                            case -1965649438:
                                            case -1912506681:
                                                iM2765 = C0619.m2761(C0487.m2361(sArr3, i20, i21, i19));
                                                if (AbstractC0641.f2496 >= 0) {
                                                    iM3169 = C0773.m3169("ۡ᩹") ^ i16;
                                                    i11 = ((iM3169 ^ i15) * 4615) ^ 1249282723;
                                                    i12 = 14317714;
                                                } else {
                                                    iM3169 = (i15 - C0619.m2761("ᩴۧ")) * (-71);
                                                    i11 = ((iM3169 ^ i16) * (-23285)) ^ (-1888916223);
                                                    i12 = -2033736325;
                                                }
                                                i18 = iM3169 ^ i12;
                                                i17 = i11;
                                                break;
                                            case -1929794235:
                                            case 441539228:
                                                if (C3033.m9845() <= 0) {
                                                    iM2763 = C0773.m3169("᩶ᩴ") ^ i15;
                                                    i17 = ((iM2763 ^ i16) * 7011) ^ 1068268054;
                                                    i13 = -575133589;
                                                } else {
                                                    iM2763 = (C0619.m2761("۟᩸") ^ i15) * 11;
                                                    i17 = ((iM2763 ^ i16) * 31317) ^ (-442340649);
                                                    i13 = -548472157;
                                                }
                                                i18 = iM2763 ^ i13;
                                                viewOnClickListenerC21333 = this;
                                                break;
                                            case -1803826533:
                                            case -1044914911:
                                                s = 45704;
                                                if (C3099.f10023 <= 0) {
                                                    iM3169 = (C0773.m3169("ۙۖ") ^ i15) * 27;
                                                    i11 = ((iM3169 ^ i16) * (-24605)) ^ 1088323337;
                                                    i12 = -1553109866;
                                                } else {
                                                    iM3169 = (C0773.m3169("ۜ۫") ^ i16) * 49;
                                                    i11 = ((iM3169 ^ i15) * 1467) ^ 1750760596;
                                                    i12 = -792515012;
                                                }
                                                i18 = iM3169 ^ i12;
                                                i17 = i11;
                                                break;
                                            case -1700275598:
                                            case 8683505:
                                                C1564.m5509();
                                                if (C2023.m6964() > 0) {
                                                    sArr = sArr2;
                                                    int iM31612 = (C0773.m3169("ۗ۟") ^ i16) * 25;
                                                    i18 = iM31612 ^ (-893074292);
                                                    sArr2 = sArr;
                                                    i17 = ((iM31612 ^ i15) * 19313) ^ 1973594842;
                                                    viewOnClickListenerC21333 = this;
                                                } else {
                                                    iM3169 = (C0773.m3169("ۙۖ") ^ i15) * 27;
                                                    i11 = ((iM3169 ^ i16) * (-24605)) ^ 1088323337;
                                                    i12 = -1553109866;
                                                    i18 = iM3169 ^ i12;
                                                    i17 = i11;
                                                }
                                                break;
                                            case -1508361846:
                                            case -114156663:
                                                i19 = 22958;
                                                iM3169 = (C0773.m3169("ᩳܿ") + i16) * (-51);
                                                i11 = ((iM3169 ^ i15) * 28343) ^ (-1789663920);
                                                i12 = 1110389857;
                                                i18 = iM3169 ^ i12;
                                                i17 = i11;
                                                break;
                                            case -1315626186:
                                            case -1185000142:
                                                C0619.m2763();
                                                if (C2287.m7745() <= 0) {
                                                    iM3169 = (C0619.m2761("᩺۟") + i15) * (-17);
                                                    i11 = ((iM3169 ^ i16) * (-25509)) ^ 1155227722;
                                                    i12 = -701018682;
                                                } else {
                                                    iM3169 = C0773.m3169("ۡ᩹") ^ i16;
                                                    i11 = ((iM3169 ^ i15) * 4615) ^ 1249282723;
                                                    i12 = 14317714;
                                                }
                                                i18 = iM3169 ^ i12;
                                                i17 = i11;
                                                break;
                                            case -1313201253:
                                            case -445100383:
                                                c = 0;
                                                if (C2878.f9462) {
                                                    iM3169 = (C0773.m3169("ۙۖ") ^ i15) * 27;
                                                    i11 = ((iM3169 ^ i16) * (-24605)) ^ 1088323337;
                                                    i12 = -1553109866;
                                                } else {
                                                    iM3169 = C0773.m3169("۠᩻") ^ i16;
                                                    i11 = ((iM3169 ^ i15) * (-20959)) ^ (-2113247589);
                                                    i12 = -814541876;
                                                }
                                                i18 = iM3169 ^ i12;
                                                i17 = i11;
                                                break;
                                            case -989386764:
                                            case 439471917:
                                                strM6952 = C2023.m6952(interfaceC19106M11756);
                                                abstractActivityC10144 = c7909.f26269;
                                                if (abstractActivityC10144.mo26249(strM6952)) {
                                                    iM3169 = (C0619.m2761("᩸ۨ") ^ i15) * (-3);
                                                    i11 = ((iM3169 ^ i16) * 1321) ^ 617431852;
                                                    i12 = 558144889;
                                                } else {
                                                    iM3169 = C0619.m2761("᩶ܿ") ^ i16;
                                                    i11 = ((iM3169 ^ i15) * 18665) ^ 1651508395;
                                                    i12 = -90870988;
                                                }
                                                i18 = iM3169 ^ i12;
                                                i17 = i11;
                                                break;
                                            case -917743055:
                                            case 1461210771:
                                                C4282.m13644();
                                                iM3169 = (C0773.m3169("ۙۖ") ^ i15) * 27;
                                                i11 = ((iM3169 ^ i16) * (-24605)) ^ 1088323337;
                                                i12 = -1553109866;
                                                i18 = iM3169 ^ i12;
                                                i17 = i11;
                                                break;
                                            case -827087265:
                                            case 1655032505:
                                                int i23 = s3 + s2;
                                                i22 = i23 * i23;
                                                if (C23916.f77426 <= 0) {
                                                    iM3169 = C0773.m3169("ۡ᩹") ^ i16;
                                                    i11 = ((iM3169 ^ i15) * 4615) ^ 1249282723;
                                                    i12 = 14317714;
                                                } else {
                                                    iM3169 = (C0773.m3169("۟᩹") + i15) * (-47);
                                                    i11 = ((iM3169 ^ i16) * (-2603)) ^ (-52367620);
                                                    i12 = -305902678;
                                                }
                                                i18 = iM3169 ^ i12;
                                                i17 = i11;
                                                break;
                                            case -707737438:
                                            case 1248064208:
                                                sArr3 = f67973;
                                                i20 = 1;
                                                i21 = 3;
                                                if (C2288.f7433 > 0) {
                                                    iM3169 = (i16 - C0619.m2761("ۨ᩶")) * (-57);
                                                    i11 = ((iM3169 ^ i15) * (-19013)) ^ (-348611499);
                                                    i12 = -142817680;
                                                    i18 = iM3169 ^ i12;
                                                    i17 = i11;
                                                } else {
                                                    sArr = sArr2;
                                                    int iM31613 = (C0773.m3169("ۗ۟") ^ i16) * 25;
                                                    i18 = iM31613 ^ (-893074292);
                                                    sArr2 = sArr;
                                                    i17 = ((iM31613 ^ i15) * 19313) ^ 1973594842;
                                                    viewOnClickListenerC21333 = this;
                                                }
                                                break;
                                            case -697967506:
                                            case -586818586:
                                                c7909 = c7908;
                                                c23257 = c7909.f26266;
                                                interfaceC19106M11756 = AbstractC3624.m11756(c23257);
                                                if (C1542.m5459() < 0) {
                                                    iM3169 = C0773.m3169("᩹֡") ^ i15;
                                                    i11 = ((iM3169 ^ i16) * (-3791)) ^ (-838567319);
                                                    i12 = 2128070274;
                                                    i18 = iM3169 ^ i12;
                                                    i17 = i11;
                                                } else {
                                                    sArr = sArr2;
                                                    int iM31614 = (C0773.m3169("ۗ۟") ^ i16) * 25;
                                                    i18 = iM31614 ^ (-893074292);
                                                    sArr2 = sArr;
                                                    i17 = ((iM31614 ^ i15) * 19313) ^ 1973594842;
                                                    viewOnClickListenerC21333 = this;
                                                }
                                                break;
                                            case -592330580:
                                            case -357980971:
                                                if ((s3 * s) - i22 <= 0) {
                                                    iM3169 = C0619.m2761("ܿۧ") ^ i15;
                                                    i11 = ((iM3169 ^ i16) * (-341)) ^ 1615924435;
                                                    i12 = -1023545883;
                                                } else {
                                                    iM3169 = C0773.m3169("ۘ᩸") ^ i16;
                                                    i11 = ((iM3169 ^ i15) * (-10071)) ^ 1292658348;
                                                    i12 = 2083555397;
                                                }
                                                i18 = iM3169 ^ i12;
                                                i17 = i11;
                                                break;
                                            case -533371832:
                                            case 370874384:
                                                s3 = sArr2[c];
                                                s2 = 11426;
                                                if (!C17202.f56030) {
                                                    iM2763 = C0773.m3169("᩶ᩴ") ^ i15;
                                                    i17 = ((iM2763 ^ i16) * 7011) ^ 1068268054;
                                                    i13 = -575133589;
                                                    i18 = iM2763 ^ i13;
                                                    viewOnClickListenerC21333 = this;
                                                } else {
                                                    iM3169 = (i15 - C0619.m2761("ۚۙ")) * 51;
                                                    i11 = ((iM3169 ^ i16) * 16145) ^ (-2029990863);
                                                    i12 = 2077778881;
                                                    i18 = iM3169 ^ i12;
                                                    i17 = i11;
                                                }
                                                break;
                                            case -374745002:
                                            case 798756661:
                                                C1146.m4231();
                                                if (!RunnableC0334.m2063()) {
                                                    iM3169 = (C0619.m2761("᩺۟") + i15) * (-17);
                                                    i11 = ((iM3169 ^ i16) * (-25509)) ^ 1155227722;
                                                    i12 = -701018682;
                                                    i18 = iM3169 ^ i12;
                                                    i17 = i11;
                                                } else {
                                                    sArr = sArr2;
                                                    int iM31615 = (C0773.m3169("ۗ۟") ^ i16) * 25;
                                                    i18 = iM31615 ^ (-893074292);
                                                    sArr2 = sArr;
                                                    i17 = ((iM31615 ^ i15) * 19313) ^ 1973594842;
                                                    viewOnClickListenerC21333 = this;
                                                }
                                                break;
                                            case -267814078:
                                            case 1032445866:
                                                c11637 = c11636;
                                                if (C3492.m11490(strM6952, c11637.f36488)) {
                                                    iM3169 = C0773.m3169("ᩴ֫") ^ i16;
                                                    i11 = ((iM3169 ^ i15) * (-5657)) ^ (-292336405);
                                                    i12 = 606578721;
                                                } else {
                                                    str3 = strM6952;
                                                    iM3169 = (C0619.m2761("ܿۗ") + i16) * (-83);
                                                    i11 = ((iM3169 ^ i15) * (-1971)) ^ (-1777410353);
                                                    i12 = -2070468099;
                                                }
                                                i18 = iM3169 ^ i12;
                                                i17 = i11;
                                                break;
                                            case 190974345:
                                            case 894413099:
                                                str3 = null;
                                                iM3169 = (C0619.m2761("ܿۗ") + i16) * (-83);
                                                i11 = ((iM3169 ^ i15) * (-1971)) ^ (-1777410353);
                                                i12 = -2070468099;
                                                i18 = iM3169 ^ i12;
                                                i17 = i11;
                                                break;
                                            case 386455237:
                                            case 793152502:
                                                c11637.m29225(str3);
                                                abstractActivityC10144.f32501.notifyDataSetChanged();
                                                if (C23916.m53419() != 0) {
                                                    iM3169 = (C0773.m3169("ۙۖ") ^ i15) * 27;
                                                    i11 = ((iM3169 ^ i16) * (-24605)) ^ 1088323337;
                                                    i12 = -1553109866;
                                                } else {
                                                    iM3169 = C0619.m2761("᩻᩸") ^ i15;
                                                    i11 = ((iM3169 ^ i16) * 15289) ^ (-1831572293);
                                                    i12 = -405437662;
                                                }
                                                i18 = iM3169 ^ i12;
                                                i17 = i11;
                                                break;
                                            default:
                                                i19 = 23528;
                                                iM3169 = (C0773.m3169("ᩳܿ") + i16) * (-51);
                                                i11 = ((iM3169 ^ i15) * 28343) ^ (-1789663920);
                                                i12 = 1110389857;
                                                i18 = iM3169 ^ i12;
                                                i17 = i11;
                                                break;
                                        }
                                        return;
                                    }
                                }
                            });
                            str2 = c11636.f36482;
                            c23256 = c7908.f26266;
                            if (str2 == null) {
                                iM2761 = (C0619.m2761("᩹۠") + i6) * 15;
                                i2 = ((iM2761 ^ i7) * (-26953)) ^ (-131144791);
                                i3 = 616730088;
                            } else {
                                iM2761 = C0619.m2761("ۛܶ") ^ i7;
                                i2 = ((iM2761 ^ i6) * (-9545)) ^ (-1006351544);
                                i3 = 823222664;
                            }
                        }
                        i10 = iM2761 ^ i3;
                        i8 = i2;
                        break;
                    case -1826590643:
                    case -179918593:
                        C2310.m7800(c23256, str);
                        C2485.m8358(C0269.m1782(dialogInterfaceC8327), 8);
                        iM2762 = (i7 - C0619.m2761("ۤ۬")) * (-121);
                        i8 = ((iM2762 ^ i6) * (-10869)) ^ (-762216520);
                        i9 = 1938856749;
                        break;
                    case -1739769123:
                    case 816329113:
                        c23256.mo52316(0, c23256.m54099());
                        C21576.m49090(c23256);
                        break;
                    case -1474919658:
                    case -544568657:
                        if (C3998.m12920()) {
                            iM2761 = C0619.m2761("ۢۗ") ^ i6;
                            i2 = ((iM2761 ^ i7) * 19425) ^ (-83236685);
                            i3 = 121357335;
                        } else {
                            iM2761 = C0619.m2761("ܶۜ") ^ i6;
                            i2 = ((iM2761 ^ i7) * (-19247)) ^ 939556807;
                            i3 = -849522359;
                        }
                        i10 = iM2761 ^ i3;
                        i8 = i2;
                        break;
                    case -1368491632:
                    case 1047633604:
                        if (C20932.f66974 <= 0) {
                            iM2761 = (C0619.m2761("ܽ᩷") + i6) * (-95);
                            i2 = ((iM2761 ^ i7) * (-9183)) ^ (-608397368);
                            i3 = -799491394;
                        } else {
                            iM2761 = C0773.m3169("ۨ᩹") ^ i7;
                            i2 = ((iM2761 ^ i6) * (-31647)) ^ 456891911;
                            i3 = -839554519;
                        }
                        i10 = iM2761 ^ i3;
                        i8 = i2;
                        break;
                    case -1222404627:
                    case 1869377289:
                        if (C2485.f7950 != 0) {
                            iM2761 = C0619.m2761("ܶۜ") ^ i6;
                            i2 = ((iM2761 ^ i7) * (-19247)) ^ 939556807;
                            i3 = -849522359;
                        } else {
                            iM2761 = C0619.m2761("ۧۚ") ^ i7;
                            i2 = ((iM2761 ^ i6) * (-5301)) ^ 850413980;
                            i3 = -1083762467;
                        }
                        i10 = iM2761 ^ i3;
                        i8 = i2;
                        break;
                    case -1128443218:
                    case -826559072:
                        if (C20932.m47848() == 0) {
                            iM2762 = (C0773.m3169("ۖ۠") ^ i7) * (-43);
                            i8 = ((iM2762 ^ i6) * (-22563)) ^ (-562555807);
                            i9 = 708087153;
                        }
                        iM2761 = C0619.m2761("ܶۜ") ^ i6;
                        i2 = ((iM2761 ^ i7) * (-19247)) ^ 939556807;
                        i3 = -849522359;
                        i10 = iM2761 ^ i3;
                        i8 = i2;
                        break;
                    case -735279121:
                    case 1274853287:
                        C11235.m28309();
                        if (C3099.m10095()) {
                            iM2762 = (C0619.m2761("֨ۖ") + i7) * (-81);
                            i8 = ((iM2762 ^ i6) * 25819) ^ 1600891377;
                            i9 = -1103247701;
                        }
                        iM2761 = C0619.m2761("ܶۜ") ^ i6;
                        i2 = ((iM2761 ^ i7) * (-19247)) ^ 939556807;
                        i3 = -849522359;
                        i10 = iM2761 ^ i3;
                        i8 = i2;
                        break;
                    case -634649444:
                    case -316149850:
                        if (C2287.f7432 >= 0) {
                            iM2761 = C0773.m3169("֫ܽ") ^ i6;
                            i2 = ((iM2761 ^ i7) * 4491) ^ 1213201394;
                            i3 = -1579092271;
                        } else {
                            iM2761 = (i7 - C0619.m2761("ܺۙ")) * (-85);
                            i2 = ((iM2761 ^ i6) * 1335) ^ (-1433227949);
                            i3 = -1245454292;
                        }
                        i10 = iM2761 ^ i3;
                        i8 = i2;
                        break;
                    case -404486316:
                    case 1950855417:
                        this.f32495 = -1;
                        m26245(i4, view);
                        break;
                    case 153843842:
                    case 643890475:
                        C0269.m1786(c23256, str2);
                        C2375.m8070(C2310.m7808(dialogInterfaceC8327), new View.OnClickListener() { // from class: l.ܿ۬ۤ
                            {
                                int i11 = -502388521;
                                int i12 = C20932.f66974;
                                int i13 = C0950.f3488;
                                int iM2763 = C0619.m2761("ۖ֨") ^ i13;
                                int i14 = ((iM2763 ^ i12) * (-24363)) ^ (-440155074);
                                int i15 = 949471030;
                                while (true) {
                                    i11 = ((((i11 ^ i12) * 29979) >> 31) & i14) ^ (iM2763 ^ i15);
                                    switch (i11) {
                                        case -1937315891:
                                        case 2101179794:
                                            AbstractC3624.m11755();
                                            C20932.m47848();
                                            throw new RuntimeException();
                                        case -1804779850:
                                        case -1009511937:
                                            C3099.m10095();
                                            C3734.m12152();
                                            iM2763 = (C0619.m2761("۠᩹") + i12) * (-89);
                                            i14 = ((iM2763 ^ i13) * (-6025)) ^ (-1023092979);
                                            i15 = -1828971937;
                                            break;
                                        case -1738907651:
                                        case -998260363:
                                            if (C0862.m3503()) {
                                                iM2763 = (C0619.m2761("᩸ۘ") + i12) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                                i14 = ((iM2763 ^ i13) * 17549) ^ 252909052;
                                                i15 = 947903028;
                                            } else {
                                                iM2763 = C0773.m3169("ۙۘ") ^ i12;
                                                i14 = ((iM2763 ^ i13) * 10675) ^ 1366525292;
                                                i15 = 443403685;
                                            }
                                            break;
                                        case -1433205745:
                                        case 1679600185:
                                            if (C0487.f2131 <= 0) {
                                                iM2763 = (C0619.m2761("۠᩹") + i12) * (-89);
                                                i14 = ((iM2763 ^ i13) * (-6025)) ^ (-1023092979);
                                                i15 = -1828971937;
                                            } else {
                                                iM2763 = (C0773.m3169("ۡ᩷") ^ i13) * (-77);
                                                i14 = ((iM2763 ^ i12) * 13805) ^ 2017933034;
                                                i15 = -1504907229;
                                            }
                                            break;
                                        case -1418336719:
                                        case 203803705:
                                            if (C3998.m12920()) {
                                                iM2763 = C0773.m3169("ۜۤ") ^ i12;
                                                i14 = ((iM2763 ^ i13) * (-31879)) ^ 362599867;
                                                i15 = -1046007979;
                                            } else {
                                                iM2763 = C0619.m2761("ۧۖ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * (-8679)) ^ (-1678573377);
                                                i15 = 1426021148;
                                            }
                                            break;
                                        case -1346598776:
                                        case 1687300257:
                                            if (C0862.f3233 != 0) {
                                                iM2763 = C0773.m3169("ۙۘ") ^ i12;
                                                i14 = ((iM2763 ^ i13) * 10675) ^ 1366525292;
                                                i15 = 443403685;
                                            } else {
                                                iM2763 = C0773.m3169("ۤܶ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * 12797) ^ 1519735943;
                                                i15 = -1693546809;
                                            }
                                            break;
                                        case -1130430703:
                                        case 815914559:
                                            C2023.m6964();
                                            if (C2375.f7641 <= 0) {
                                                iM2763 = C0773.m3169("֡ܺ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * 29663) ^ 658843264;
                                                i15 = -468377744;
                                            } else {
                                                iM2763 = C0773.m3169("ۙܶ") ^ i12;
                                                i14 = ((iM2763 ^ i13) * (-29697)) ^ 1517597374;
                                                i15 = 1654401888;
                                            }
                                            break;
                                        case -822713266:
                                        case -543964930:
                                            if (C2288.f7433 <= 0) {
                                                iM2763 = C0773.m3169("ۙۘ") ^ i12;
                                                i14 = ((iM2763 ^ i13) * 10675) ^ 1366525292;
                                                i15 = 443403685;
                                            } else {
                                                iM2763 = C0773.m3169("᩶ۛ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * 1217) ^ (-383014346);
                                                i15 = -321818899;
                                            }
                                            break;
                                        case -806950763:
                                        case 1933458661:
                                            if (C2287.f7432 < 0) {
                                                iM2763 = C0773.m3169("ۙܶ") ^ i12;
                                                i14 = ((iM2763 ^ i13) * (-29697)) ^ 1517597374;
                                                i15 = 1654401888;
                                            } else {
                                                iM2763 = C0619.m2761("ۧۖ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * (-8679)) ^ (-1678573377);
                                                i15 = 1426021148;
                                            }
                                            break;
                                        case -345293736:
                                        case 1218127482:
                                            if (C2375.f7641 <= 0) {
                                                iM2763 = (C0619.m2761("۠᩹") + i12) * (-89);
                                                i14 = ((iM2763 ^ i13) * (-6025)) ^ (-1023092979);
                                                i15 = -1828971937;
                                            } else {
                                                iM2763 = C0619.m2761("۫ۜ") ^ i12;
                                                i14 = ((iM2763 ^ i13) * (-11507)) ^ (-685565193);
                                                i15 = -1599142946;
                                            }
                                            break;
                                        case 30296855:
                                        case 443056552:
                                            return;
                                        case 421401524:
                                        case 1975745658:
                                            if (C13473.f42873 != 0) {
                                                iM2763 = C0773.m3169("ۙܶ") ^ i12;
                                                i14 = ((iM2763 ^ i13) * (-29697)) ^ 1517597374;
                                                i15 = 1654401888;
                                            } else {
                                                iM2763 = C0773.m3169("ۢܺ") ^ i12;
                                                i14 = ((iM2763 ^ i13) * (-28831)) ^ 181345703;
                                                i15 = 1322303012;
                                            }
                                            break;
                                        case 564173965:
                                        case 1356023976:
                                            if (C1783.m6232()) {
                                                iM2763 = C0619.m2761("ۢ۫") ^ i13;
                                                i14 = ((iM2763 ^ i12) * (-18729)) ^ (-843074392);
                                                i15 = 1398049552;
                                            } else {
                                                iM2763 = C0773.m3169("֡ܺ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * 29663) ^ 658843264;
                                                i15 = -468377744;
                                            }
                                            break;
                                        case 672454494:
                                        case 2079966180:
                                            if (C2878.f9462) {
                                                iM2763 = C0773.m3169("ۙۘ") ^ i12;
                                                i14 = ((iM2763 ^ i13) * 10675) ^ 1366525292;
                                                i15 = 443403685;
                                            } else {
                                                iM2763 = C0619.m2761("ۙۗ") ^ i12;
                                                i14 = ((iM2763 ^ i13) * (-8231)) ^ 1306439377;
                                                i15 = 869400623;
                                            }
                                            break;
                                        case 1213216920:
                                        case 1263591434:
                                            if (C1080.f3865 < 0) {
                                                iM2763 = C0619.m2761("ۧۖ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * (-8679)) ^ (-1678573377);
                                                i15 = 1426021148;
                                            } else {
                                                iM2763 = (C0619.m2761("۠᩹") + i12) * (-89);
                                                i14 = ((iM2763 ^ i13) * (-6025)) ^ (-1023092979);
                                                i15 = -1828971937;
                                            }
                                            break;
                                        default:
                                            if (C2023.f6737) {
                                                iM2763 = C0773.m3169("֡ܺ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * 29663) ^ 658843264;
                                                i15 = -468377744;
                                            } else {
                                                iM2763 = C0773.m3169("ۜ᩷") ^ i13;
                                                i14 = ((iM2763 ^ i12) * (-19081)) ^ 1958860558;
                                                i15 = 1220065737;
                                            }
                                            break;
                                    }
                                }
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                C11636 c11637 = null;
                                String str3 = null;
                                C7908 c7909 = null;
                                AbstractActivityC10144 abstractActivityC10144 = null;
                                C19095 c19095 = null;
                                int i11 = -594285239;
                                int i12 = C1783.f6087;
                                int i13 = C4282.f15546;
                                int iM2763 = (C0619.m2761("ᩴܶ") + i13) * 81;
                                int i14 = ((iM2763 ^ i12) * (-22307)) ^ (-1509849952);
                                int i15 = -901856610;
                                while (true) {
                                    i11 = ((((i11 ^ i12) * 7551) >> 31) & i14) ^ (iM2763 ^ i15);
                                    switch (i11) {
                                        case -2114211200:
                                        case 2069595999:
                                            C3077.m10041();
                                            RunnableC1848.m6360();
                                            iM2763 = (C0773.m3169("֡᩸") ^ i12) * 33;
                                            i14 = ((iM2763 ^ i13) * (-30335)) ^ (-809838622);
                                            i15 = 1699865951;
                                            break;
                                        case -2067529090:
                                        case 1572049840:
                                            c11637 = c11636;
                                            if (C0487.f2131 <= 0) {
                                                iM2763 = (C0773.m3169("֡᩸") ^ i12) * 33;
                                                i14 = ((iM2763 ^ i13) * (-30335)) ^ (-809838622);
                                                i15 = 1699865951;
                                            } else {
                                                iM2763 = (C0773.m3169("ۗܳ") ^ i12) * 35;
                                                i14 = ((iM2763 ^ i13) * 14033) ^ 351964419;
                                                i15 = 995213016;
                                            }
                                            break;
                                        case -2021321447:
                                        case -1314849181:
                                            c11637.m29225(str3);
                                            c7909 = c7908;
                                            if (C1080.m4050()) {
                                                iM2763 = C0773.m3169("ܺۙ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * (-24163)) ^ 1287875985;
                                                i15 = -625470943;
                                            } else {
                                                iM2763 = C0619.m2761("ܰۖ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * 7445) ^ (-969634220);
                                                i15 = -1155588074;
                                            }
                                            break;
                                        case -1982205481:
                                        case -587987144:
                                            if (!C2702.m8876()) {
                                                iM2763 = (C0773.m3169("۠ۚ") + i13) * 37;
                                                i14 = ((iM2763 ^ i12) * (-31465)) ^ (-641216252);
                                                i15 = 814870132;
                                            } else {
                                                iM2763 = (C0773.m3169("֡᩸") ^ i12) * 33;
                                                i14 = ((iM2763 ^ i13) * (-30335)) ^ (-809838622);
                                                i15 = 1699865951;
                                            }
                                            break;
                                        case -1875234997:
                                        case 2061158284:
                                            if (C2287.f7432 >= 0) {
                                                iM2763 = (C0773.m3169("۠ۚ") + i13) * 37;
                                                i14 = ((iM2763 ^ i12) * (-31465)) ^ (-641216252);
                                                i15 = 814870132;
                                            } else {
                                                iM2763 = (C0773.m3169("֡۠") + i13) * (-19);
                                                i14 = ((iM2763 ^ i12) * 28685) ^ (-1128906297);
                                                i15 = 1358409483;
                                            }
                                            break;
                                        case -1615037787:
                                        case 1790898520:
                                            C23916.m53419();
                                            if (C1564.f5401 > 0) {
                                                iM2763 = C0773.m3169("ۛܳ") ^ i12;
                                                i14 = ((iM2763 ^ i13) * (-22381)) ^ (-1250336048);
                                                i15 = 700528865;
                                            } else {
                                                iM2763 = (C0773.m3169("۠ۚ") + i13) * 37;
                                                i14 = ((iM2763 ^ i12) * (-31465)) ^ (-641216252);
                                                i15 = 814870132;
                                            }
                                            break;
                                        case -1577385123:
                                        case -880351226:
                                            c19095.notifyDataSetChanged();
                                            if (C3734.m12152() >= 0) {
                                                iM2763 = (C0773.m3169("֡᩸") ^ i12) * 33;
                                                i14 = ((iM2763 ^ i13) * (-30335)) ^ (-809838622);
                                                i15 = 1699865951;
                                            } else {
                                                iM2763 = C0619.m2761("ܽۛ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * 8039) ^ 1880718564;
                                                i15 = 1090193469;
                                            }
                                            break;
                                        case -928800856:
                                        case -174513026:
                                            AbstractC0641.m2813();
                                            break;
                                        case -643826151:
                                        case 1683509270:
                                            abstractActivityC10144.m26255();
                                            C2375.m8064(c7909.f26265);
                                            break;
                                        case -467052548:
                                        case 97149196:
                                            if (AbstractC0116.f1064 <= 0) {
                                                iM2763 = C0773.m3169("ۛܳ") ^ i12;
                                                i14 = ((iM2763 ^ i13) * (-22381)) ^ (-1250336048);
                                                i15 = 700528865;
                                            } else {
                                                iM2763 = C0619.m2761("ۗᩳ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * 7131) ^ (-797575235);
                                                i15 = 941329198;
                                            }
                                            break;
                                        case -31765525:
                                        case 84571830:
                                            abstractActivityC10144 = c7909.f26269;
                                            c19095 = abstractActivityC10144.f32501;
                                            if (AbstractC3624.f12429 <= 0) {
                                                iM2763 = (C0619.m2761("ۜ᩶") + i13) * (-23);
                                                i14 = ((iM2763 ^ i12) * (-16197)) ^ 1815807268;
                                                i15 = 1022208016;
                                            } else {
                                                iM2763 = C0773.m3169("֨ᩴ") ^ i12;
                                                i14 = ((iM2763 ^ i13) * 3041) ^ (-615217644);
                                                i15 = -338713753;
                                            }
                                            break;
                                        case 481876551:
                                        case 1117460735:
                                            if (C2834.f9334 <= 0) {
                                                iM2763 = C0619.m2761("ܰۖ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * 7445) ^ (-969634220);
                                                i15 = -1155588074;
                                            } else {
                                                iM2763 = C0619.m2761("᩷ܶ") ^ i12;
                                                i14 = ((iM2763 ^ i13) * 14789) ^ (-1415859029);
                                                i15 = 820876773;
                                            }
                                            break;
                                        case 509988678:
                                        case 1478472510:
                                            str3 = null;
                                            if (C3099.m10095()) {
                                                iM2763 = (C0619.m2761("ۜ᩶") + i13) * (-23);
                                                i14 = ((iM2763 ^ i12) * (-16197)) ^ 1815807268;
                                                i15 = 1022208016;
                                            } else {
                                                iM2763 = C0773.m3169("ۚܿ") ^ i12;
                                                i14 = ((iM2763 ^ i13) * (-16879)) ^ 1354645212;
                                                i15 = -74167248;
                                            }
                                            break;
                                        case 1118407486:
                                        case 1677036207:
                                            if (C0487.f2131 > 0) {
                                                iM2763 = (C0619.m2761("ۜ᩶") + i13) * (-23);
                                                i14 = ((iM2763 ^ i12) * (-16197)) ^ 1815807268;
                                                i15 = 1022208016;
                                            } else {
                                                iM2763 = (C0773.m3169("֡᩸") ^ i12) * 33;
                                                i14 = ((iM2763 ^ i13) * (-30335)) ^ (-809838622);
                                                i15 = 1699865951;
                                            }
                                            break;
                                        case 1391195929:
                                        case 1613727284:
                                            if (C0619.f2439) {
                                                iM2763 = C0619.m2761("ܰۖ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * 7445) ^ (-969634220);
                                                i15 = -1155588074;
                                            } else {
                                                iM2763 = (i12 - C0619.m2761("ܿ᩻")) * 123;
                                                i14 = ((iM2763 ^ i13) * 9365) ^ 798721655;
                                                i15 = 1117721922;
                                            }
                                            break;
                                        default:
                                            if (C2485.f7950 != 0) {
                                                iM2763 = (C0619.m2761("ۜ᩶") + i13) * (-23);
                                                i14 = ((iM2763 ^ i12) * (-16197)) ^ 1815807268;
                                                i15 = 1022208016;
                                            } else {
                                                iM2763 = C0773.m3169("ۤۗ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * 14809) ^ (-2045405730);
                                                i15 = 2031153366;
                                            }
                                            break;
                                    }
                                    return;
                                }
                            }
                        });
                        iM2762 = (i7 - C0619.m2761("ۤ۬")) * (-121);
                        i8 = ((iM2762 ^ i6) * (-10869)) ^ (-762216520);
                        i9 = 1938856749;
                        break;
                        break;
                    case 233159900:
                    case 1958378646:
                        i4 = this.f32490[i];
                        iM2761 = C0619.m2761("ܰܺ") ^ i7;
                        i2 = ((iM2761 ^ i6) * (-16721)) ^ 1455681112;
                        i3 = 745281038;
                        i10 = iM2761 ^ i3;
                        i8 = i2;
                        break;
                    case 321152951:
                    case 493202735:
                        if (this.f32504) {
                            iM2761 = (C0773.m3169("᩵۟") ^ i7) * (-29);
                            i2 = ((iM2761 ^ i6) * (-8023)) ^ 1247199496;
                            i3 = 750620000;
                        } else {
                            i4 = i;
                            iM2761 = C0619.m2761("ܰܺ") ^ i7;
                            i2 = ((iM2761 ^ i6) * (-16721)) ^ 1455681112;
                            i3 = 745281038;
                        }
                        i10 = iM2761 ^ i3;
                        i8 = i2;
                        break;
                    case 635367627:
                    case 878914860:
                        C0862.m3503();
                        if (C1519.f5300 < 0) {
                            iM2761 = C0773.m3169("֫ܽ") ^ i6;
                            i2 = ((iM2761 ^ i7) * 4491) ^ 1213201394;
                            i3 = -1579092271;
                            i10 = iM2761 ^ i3;
                            i8 = i2;
                        } else {
                            iM2762 = (C0619.m2761("֨ۖ") + i7) * (-81);
                            i8 = ((iM2762 ^ i6) * 25819) ^ 1600891377;
                            i9 = -1103247701;
                        }
                        break;
                    case 658587819:
                    case 1865479542:
                        C1146.m4231();
                        AbstractC0116.m1243();
                        break;
                    case 718477937:
                    case 1201890026:
                        C1564.m5509();
                        iM2761 = C0619.m2761("ܶۜ") ^ i6;
                        i2 = ((iM2761 ^ i7) * (-19247)) ^ 939556807;
                        i3 = -849522359;
                        i10 = iM2761 ^ i3;
                        i8 = i2;
                        break;
                    case 991803164:
                    case 1622531534:
                        c11636 = (C11636) C3690.m11990(this.f32497, i4);
                        if (c11636.m29232()) {
                            iM2761 = C0619.m2761("᩶ۘ") ^ i7;
                            i2 = ((iM2761 ^ i6) * 17009) ^ 847602664;
                            i3 = -55355776;
                        } else {
                            iM2761 = (C0773.m3169("ܺᩴ") + i6) * (-63);
                            i2 = ((iM2761 ^ i7) * 17419) ^ 1219678493;
                            i3 = -417039996;
                        }
                        i10 = iM2761 ^ i3;
                        i8 = i2;
                        break;
                    case 1800546210:
                    case 1806000077:
                        if (C2702.f8586 <= 0) {
                            iM2761 = C0773.m3169("֫ܽ") ^ i6;
                            i2 = ((iM2761 ^ i7) * 4491) ^ 1213201394;
                            i3 = -1579092271;
                        } else {
                            iM2761 = (i6 - C0773.m3169("᩵۬")) * (-9);
                            i2 = ((iM2761 ^ i7) * (-25409)) ^ 2033955929;
                            i3 = 1802901947;
                        }
                        i10 = iM2761 ^ i3;
                        i8 = i2;
                        break;
                    default:
                        if (C0269.f1558 <= 0) {
                            iM2761 = C0773.m3169("֫ܽ") ^ i6;
                            i2 = ((iM2761 ^ i7) * 4491) ^ 1213201394;
                            i3 = -1579092271;
                        } else {
                            iM2761 = C0619.m2761("ۢ֡") ^ i6;
                            i2 = ((iM2761 ^ i7) * (-11441)) ^ (-145643755);
                            i3 = -113751348;
                        }
                        i10 = iM2761 ^ i3;
                        i8 = i2;
                        break;
                }
                return;
            }
        }
    }

    @Override // l.AbstractActivityC17204, l.ActivityC3409, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f32503.m47659();
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0206 A[PHI: r4 r7 r22 r25
      0x0206: PHI (r4v3 boolean) = (r4v1 boolean), (r4v2 boolean), (r4v1 boolean) binds: [B:13:0x0064, B:61:0x0204, B:49:0x0176] A[DONT_GENERATE, DONT_INLINE]
      0x0206: PHI (r7v2 boolean) = (r7v1 boolean), (r7v1 boolean), (r7v3 boolean) binds: [B:13:0x0064, B:61:0x0204, B:49:0x0176] A[DONT_GENERATE, DONT_INLINE]
      0x0206: PHI (r22v27 l.᩷ۨᩴ) = (r22v5 l.᩷ۨᩴ), (r22v23 l.᩷ۨᩴ), (r22v28 l.᩷ۨᩴ) binds: [B:13:0x0064, B:61:0x0204, B:49:0x0176] A[DONT_GENERATE, DONT_INLINE]
      0x0206: PHI (r25v18 java.lang.String) = (r25v0 java.lang.String), (r25v14 java.lang.String), (r25v19 java.lang.String) binds: [B:13:0x0064, B:61:0x0204, B:49:0x0176] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0247 A[PHI: r8 r22 r25
      0x0247: PHI (r8v3 java.lang.CharSequence) = (r8v1 java.lang.CharSequence), (r8v2 java.lang.CharSequence), (r8v1 java.lang.CharSequence) binds: [B:65:0x0245, B:45:0x0149, B:16:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0247: PHI (r22v32 l.᩷ۨᩴ) = (r22v22 l.᩷ۨᩴ), (r22v29 l.᩷ۨᩴ), (r22v33 l.᩷ۨᩴ) binds: [B:65:0x0245, B:45:0x0149, B:16:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0247: PHI (r25v23 java.lang.String) = (r25v13 java.lang.String), (r25v20 java.lang.String), (r25v24 java.lang.String) binds: [B:65:0x0245, B:45:0x0149, B:16:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x040e A[PHI: r6 r18 r22 r24 r25
      0x040e: PHI (r6v2 int) = (r6v1 int), (r6v3 int) binds: [B:97:0x040c, B:53:0x019c] A[DONT_GENERATE, DONT_INLINE]
      0x040e: PHI (r18v4 short[]) = (r18v3 short[]), (r18v2 short[]) binds: [B:97:0x040c, B:53:0x019c] A[DONT_GENERATE, DONT_INLINE]
      0x040e: PHI (r22v25 l.᩷ۨᩴ) = (r22v10 l.᩷ۨᩴ), (r22v26 l.᩷ۨᩴ) binds: [B:97:0x040c, B:53:0x019c] A[DONT_GENERATE, DONT_INLINE]
      0x040e: PHI (r24v5 char) = (r24v4 char), (r24v3 char) binds: [B:97:0x040c, B:53:0x019c] A[DONT_GENERATE, DONT_INLINE]
      0x040e: PHI (r25v16 java.lang.String) = (r25v2 java.lang.String), (r25v17 java.lang.String) binds: [B:97:0x040c, B:53:0x019c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        if (l.C3099.f10023 > 0) goto L20;
     */
    @Override // l.ActivityC5577, l.ActivityC8866, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSaveInstanceState(android.os.Bundle r28) {
        /*
            Method dump skipped, instruction units count: 1302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC10144.onSaveInstanceState(android.os.Bundle):void");
    }

    /* JADX WARN: Code duplicated, block: B:171:0x07b0 A[PHI: r9 r18 r21 r22 r23 r24 r27
      0x07b0: PHI (r9v103 int) = (r9v27 int), (r9v30 int), (r9v104 int) binds: [B:170:0x07ae, B:162:0x0744, B:10:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x07b0: PHI (r18v6 short) = (r18v3 short), (r18v2 short), (r18v2 short) binds: [B:170:0x07ae, B:162:0x0744, B:10:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x07b0: PHI (r21v6 int) = (r21v2 int), (r21v3 int), (r21v2 int) binds: [B:170:0x07ae, B:162:0x0744, B:10:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x07b0: PHI (r22v6 short) = (r22v2 short), (r22v3 short), (r22v2 short) binds: [B:170:0x07ae, B:162:0x0744, B:10:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x07b0: PHI (r23v41 int) = (r23v11 int), (r23v14 int), (r23v42 int) binds: [B:170:0x07ae, B:162:0x0744, B:10:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x07b0: PHI (r24v38 java.util.ArrayList) = (r24v10 java.util.ArrayList), (r24v13 java.util.ArrayList), (r24v39 java.util.ArrayList) binds: [B:170:0x07ae, B:162:0x0744, B:10:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x07b0: PHI (r27v55 short[]) = (r27v25 short[]), (r27v28 short[]), (r27v56 short[]) binds: [B:170:0x07ae, B:162:0x0744, B:10:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x011c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0172 A[PHI: r15
      0x0172: PHI (r15v4 int) = (r15v3 int), (r15v2 int) binds: [B:48:0x0170, B:22:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x027a A[PHI: r5 r6 r8 r11 r12
      0x027a: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:68:0x0278, B:60:0x021e, B:15:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x027a: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:68:0x0278, B:60:0x021e, B:15:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x027a: PHI (r8v4 short[]) = (r8v2 short[]), (r8v3 short[]), (r8v2 short[]) binds: [B:68:0x0278, B:60:0x021e, B:15:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x027a: PHI (r11v4 java.util.ArrayList) = (r11v3 java.util.ArrayList), (r11v2 java.util.ArrayList), (r11v2 java.util.ArrayList) binds: [B:68:0x0278, B:60:0x021e, B:15:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x027a: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:68:0x0278, B:60:0x021e, B:15:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x038b A[PHI: r9 r27
      0x038b: PHI (r9v11 int) = (r9v10 int), (r9v12 int) binds: [B:91:0x0371, B:88:0x034f] A[DONT_GENERATE, DONT_INLINE]
      0x038b: PHI (r27v10 short[]) = (r27v9 short[]), (r27v11 short[]) binds: [B:91:0x0371, B:88:0x034f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m26233(AbstractActivityC10144 abstractActivityC10144) {
        int iM3169;
        int i;
        int i2;
        int i3;
        int iM31610;
        int i4;
        int i5;
        int iM2761;
        int i6;
        int i7;
        int iM31611;
        int i8;
        int i9;
        int i10 = C2288.f7433;
        int i11 = RunnableC0334.f1808;
        int iM2762 = C0619.m2761("֡ۗ") ^ i10;
        int i12 = ((iM2762 ^ i11) * (-31071)) ^ (-1730955065);
        Iterator itM4942 = null;
        ArrayList arrayList = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i13 = iM2762 ^ 2086371241;
        boolean z = false;
        boolean z2 = false;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int iM2763 = 0;
        int iM31612 = 0;
        char c = 0;
        short s = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        short s2 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 2143091182;
        Iterator itM13647 = null;
        ArrayList arrayList2 = null;
        int i25 = 0;
        int i26 = 0;
        while (true) {
            i24 = i13 ^ (i12 & (((i24 ^ i11) * (-25815)) >> 31));
            switch (i24) {
                case -2144018335:
                case 1614031571:
                    abstractActivityC10144.m26241(z2);
                    abstractActivityC10144.f32501.notifyDataSetChanged();
                    break;
                case -2134074212:
                case 1706334280:
                    arrayList = abstractActivityC10144.f32497;
                    i16 = abstractActivityC10144.f32490[i15];
                    if (C1564.f5401 <= 0) {
                        iM31610 = C0773.m3169("ۤۢ") ^ i11;
                        i4 = ((iM31610 ^ i10) * 7791) ^ (-2091010045);
                        i5 = -950773297;
                    } else {
                        iM31610 = C0773.m3169("ۤۤ") ^ i11;
                        i4 = ((iM31610 ^ i10) * (-27115)) ^ 1774472263;
                        i5 = 1083387237;
                    }
                    i13 = iM31610 ^ i5;
                    i12 = i4;
                    break;
                case -2126377637:
                case -470031178:
                    abstractActivityC10144.f32496 += z2 ? 1 : 0;
                    iM31610 = C0619.m2761("ۘۤ") ^ i10;
                    i4 = ((iM31610 ^ i11) * (-17783)) ^ 1191592258;
                    i5 = 1841567944;
                    i13 = iM31610 ^ i5;
                    i12 = i4;
                    break;
                case -2065394370:
                case -897425999:
                    i3 = i21;
                    i14 = 55105;
                    iM2761 = C0619.m2761("᩹ۙ") ^ i10;
                    i6 = ((iM2761 ^ i11) * 29389) ^ (-1330961084);
                    i7 = -1477586236;
                    i13 = iM2761 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i23 = i23;
                    ArrayList arrayList3 = arrayList2;
                    i21 = i3;
                    arrayList2 = arrayList3;
                    break;
                case -2042078338:
                case 1031501916:
                    ArrayList arrayList4 = arrayList2;
                    i23 = i23;
                    sArr3 = sArr3;
                    int i27 = i21;
                    arrayList2 = arrayList4;
                    if (((C11636) C3690.m11990(arrayList4, i27)).m29228(z2)) {
                        iM2761 = C0773.m3169("᩶۟") ^ i10;
                        i3 = i27;
                        i6 = ((iM2761 ^ i11) * 11649) ^ (-831226046);
                        i7 = -200091765;
                    } else {
                        i3 = i27;
                        iM2761 = (i10 - C0619.m2761("ܰۡ")) * (-43);
                        i6 = ((iM2761 ^ i11) * 8831) ^ 1587180153;
                        i7 = -1921629730;
                    }
                    i13 = iM2761 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i23 = i23;
                    ArrayList arrayList5 = arrayList2;
                    i21 = i3;
                    arrayList2 = arrayList5;
                    break;
                case -2041797939:
                case 459782594:
                    abstractActivityC10144.m40396(i17, 2124714607 ^ iM31612, z);
                    break;
                case -1999427666:
                case -37688050:
                    i23 = i23;
                    sArr3 = sArr3;
                    if (i15 < abstractActivityC10144.f32492) {
                        iM3169 = (i11 - C0773.m3169("ۧۜ")) * (-67);
                        i = ((iM3169 ^ i10) * (-17643)) ^ (-737069777);
                        i2 = -1957788710;
                    } else {
                        iM3169 = C0619.m2761("᩵᩶") ^ i10;
                        i = ((iM3169 ^ i11) * (-3335)) ^ 2146922428;
                        i2 = -1363154431;
                    }
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    sArr3 = sArr3;
                    i23 = i23;
                    break;
                case -1992646116:
                case -694421323:
                    i23 = i23;
                    sArr3 = sArr3;
                    int i28 = i21;
                    arrayList2 = arrayList2;
                    i3 = i28;
                    s = sArr[c];
                    if (C2288.f7433 <= 0) {
                        iM2761 = (i10 - C0619.m2761("᩹ᩴ")) * (-95);
                        i6 = ((iM2761 ^ i11) * (-3475)) ^ 156799984;
                        i7 = 401685391;
                    } else {
                        iM2761 = C0619.m2761("ۤܰ") ^ i10;
                        i6 = ((iM2761 ^ i11) * 19343) ^ (-138464438);
                        i7 = 789398922;
                    }
                    i13 = iM2761 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i23 = i23;
                    ArrayList arrayList6 = arrayList2;
                    i21 = i3;
                    arrayList2 = arrayList6;
                    break;
                case -1989785130:
                case 1920494296:
                    abstractActivityC10144.m26241(z2);
                    abstractActivityC10144.f32501.notifyDataSetChanged();
                    break;
                case -1913549973:
                case 1325797283:
                    sArr2 = f32484;
                    i25 = UMErrorCode.E_UM_BE_JSON_FAILED;
                    i26 = 3;
                    if (C2419.m8174() >= 0) {
                        iM31610 = C0773.m3169("ۤۢ") ^ i11;
                        i4 = ((iM31610 ^ i10) * 7791) ^ (-2091010045);
                        i5 = -950773297;
                    } else {
                        iM31610 = (C0773.m3169("۟᩹") + i10) * (-95);
                        i4 = ((iM31610 ^ i11) * 15199) ^ 582706172;
                        i5 = -1292043838;
                    }
                    i13 = iM31610 ^ i5;
                    i12 = i4;
                    break;
                case -1823702003:
                case -1535672268:
                    C2310.m7813();
                    if (C3033.f9831 < 0) {
                        iM31610 = (C0619.m2761("ۙۤ") + i11) * 83;
                        i4 = ((iM31610 ^ i10) * 8919) ^ (-1296153308);
                        i5 = 1713796827;
                    } else {
                        iM31610 = C0773.m3169("ۤۢ") ^ i11;
                        i4 = ((iM31610 ^ i10) * 7791) ^ (-2091010045);
                        i5 = -950773297;
                    }
                    i13 = iM31610 ^ i5;
                    i12 = i4;
                    break;
                case -1774536660:
                case -1587087598:
                    i23 = i23;
                    sArr3 = sArr3;
                    if (C1826.m6317(itM4942)) {
                        iM3169 = (C0619.m2761("ۤ֫") ^ i10) * (-29);
                        i = ((iM3169 ^ i11) * 31977) ^ (-358008225);
                        i2 = -1815517758;
                    } else {
                        iM3169 = C0619.m2761("᩵᩶") ^ i10;
                        i = ((iM3169 ^ i11) * (-3335)) ^ 2146922428;
                        i2 = -1363154431;
                    }
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    sArr3 = sArr3;
                    i23 = i23;
                    break;
                case -1773941761:
                case 353151878:
                    i23 = i23;
                    sArr3 = sArr3;
                    abstractActivityC10144.f32496 += z2 ? 1 : 0;
                    int i29 = i21;
                    arrayList2 = arrayList2;
                    i3 = i29;
                    iM2761 = (i10 - C0619.m2761("ܰۡ")) * (-43);
                    i6 = ((iM2761 ^ i11) * 8831) ^ 1587180153;
                    i7 = -1921629730;
                    i13 = iM2761 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i23 = i23;
                    ArrayList arrayList7 = arrayList2;
                    i21 = i3;
                    arrayList2 = arrayList7;
                    break;
                case -1759602906:
                case 1697065902:
                    C17202.m40372();
                    C4238.m13540();
                    iM31610 = (C0619.m2761("ۙۤ") + i11) * 83;
                    i4 = ((iM31610 ^ i10) * 8919) ^ (-1296153308);
                    i5 = 1713796827;
                    i13 = iM31610 ^ i5;
                    i12 = i4;
                    break;
                case -1748895191:
                case -219448450:
                    C2966.m9664();
                    if (RunnableC3055.f9898 < 0) {
                        i23 = i23;
                        sArr3 = sArr3;
                        int i30 = i21;
                        arrayList2 = arrayList2;
                        i3 = i30;
                        iM2761 = C0619.m2761("᩷ܺ") ^ i10;
                        i6 = ((iM2761 ^ i11) * (-6013)) ^ (-923223046);
                        i7 = -2101049486;
                        i13 = iM2761 ^ i7;
                        i12 = i6;
                        sArr3 = sArr3;
                        i23 = i23;
                        ArrayList arrayList8 = arrayList2;
                        i21 = i3;
                        arrayList2 = arrayList8;
                    } else {
                        i23 = i23;
                        sArr3 = sArr3;
                        iM3169 = C0773.m3169("᩸ᩳ") ^ i10;
                        i = ((iM3169 ^ i11) * 12329) ^ 597709657;
                        i2 = -179306880;
                        i13 = iM3169 ^ i2;
                        i12 = i;
                        sArr3 = sArr3;
                        i23 = i23;
                    }
                    break;
                case -1726419986:
                case 1315672381:
                    abstractActivityC10144.f32503.m47658();
                    break;
                case -1716477162:
                case -248530494:
                    i23 = i23;
                    sArr3 = sArr3;
                    i22 = (i22 == true ? 1 : 0) + 1;
                    int i31 = i21;
                    arrayList2 = arrayList2;
                    i3 = i31;
                    iM2761 = (C0619.m2761("ۡ֨") + i10) * 95;
                    i6 = ((iM2761 ^ i11) * 8487) ^ 2030547981;
                    i7 = -1480892296;
                    i13 = iM2761 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i23 = i23;
                    ArrayList arrayList9 = arrayList2;
                    i21 = i3;
                    arrayList2 = arrayList9;
                    break;
                case -1600017887:
                case 503967138:
                    i23 = i23;
                    sArr3 = sArr3;
                    int i32 = i21;
                    arrayList2 = arrayList2;
                    i3 = i32;
                    sArr = f32484;
                    c = 'm';
                    if (C17202.f56030) {
                        iM2761 = (C0619.m2761("ܶ֫") ^ i11) * 85;
                        i6 = ((iM2761 ^ i10) * 29785) ^ 2135574702;
                        i7 = 250589879;
                    } else {
                        iM2761 = (C0619.m2761("ۘۨ") ^ i11) * 7;
                        i6 = ((iM2761 ^ i10) * (-24309)) ^ (-310082456);
                        i7 = 639061699;
                    }
                    i13 = iM2761 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i23 = i23;
                    ArrayList arrayList10 = arrayList2;
                    i21 = i3;
                    arrayList2 = arrayList10;
                    break;
                case -1569437503:
                case 315649468:
                    abstractActivityC10144.f32496 += z2 ? 1 : 0;
                    i23 = i23;
                    sArr3 = sArr3;
                    i3 = i21;
                    iM2761 = (C0619.m2761("۠۠") ^ i10) * (-105);
                    i6 = ((iM2761 ^ i11) * (-3627)) ^ (-1699776174);
                    i7 = -449740105;
                    i13 = iM2761 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i23 = i23;
                    ArrayList arrayList11 = arrayList2;
                    i21 = i3;
                    arrayList2 = arrayList11;
                    break;
                case -1425614246:
                case -1058985742:
                    C2354.m7983();
                    if (!C2354.m7983()) {
                        i23 = i23;
                        sArr3 = sArr3;
                        iM3169 = C0773.m3169("᩸ᩳ") ^ i10;
                        i = ((iM3169 ^ i11) * 12329) ^ 597709657;
                        i2 = -179306880;
                        i13 = iM3169 ^ i2;
                        i12 = i;
                        sArr3 = sArr3;
                        i23 = i23;
                    } else {
                        i23 = i23;
                        sArr3 = sArr3;
                        int i33 = i21;
                        arrayList2 = arrayList2;
                        i3 = i33;
                        iM2761 = (i10 - C0619.m2761("᩹ᩴ")) * (-95);
                        i6 = ((iM2761 ^ i11) * (-3475)) ^ 156799984;
                        i7 = 401685391;
                        i13 = iM2761 ^ i7;
                        i12 = i6;
                        sArr3 = sArr3;
                        i23 = i23;
                        ArrayList arrayList12 = arrayList2;
                        i21 = i3;
                        arrayList2 = arrayList12;
                    }
                    break;
                case -1302067355:
                case -527066228:
                    if (C0862.m3503()) {
                        iM31610 = (C0619.m2761("᩶۠") ^ i11) * 119;
                        i4 = ((iM31610 ^ i10) * (-20409)) ^ 108862734;
                        i5 = -1358938565;
                    } else {
                        iM31610 = (C0619.m2761("ۙۤ") + i11) * 83;
                        i4 = ((iM31610 ^ i10) * 8919) ^ (-1296153308);
                        i5 = 1713796827;
                    }
                    i13 = iM31610 ^ i5;
                    i12 = i4;
                    break;
                case -1216672520:
                case -31049239:
                    i23 = i23;
                    sArr3 = sArr3;
                    ArrayList arrayList13 = abstractActivityC10144.f32497;
                    i21 = abstractActivityC10144.f32490[i22 == true ? 1 : 0];
                    if (C0862.f3233 != 0) {
                        arrayList2 = arrayList13;
                        iM3169 = C0773.m3169("᩸ᩳ") ^ i10;
                        i = ((iM3169 ^ i11) * 12329) ^ 597709657;
                        i2 = -179306880;
                        i13 = iM3169 ^ i2;
                        i12 = i;
                    } else {
                        int iM31613 = (C0773.m3169("ܺᩳ") ^ i10) * 73;
                        arrayList2 = arrayList13;
                        i12 = ((iM31613 ^ i11) * 19835) ^ (-1967652885);
                        i13 = iM31613 ^ 886732568;
                    }
                    sArr3 = sArr3;
                    i23 = i23;
                    break;
                case -1195022337:
                case 1144750556:
                    i23 = i23;
                    sArr3 = sArr3;
                    int i34 = i21;
                    arrayList2 = arrayList2;
                    i3 = i34;
                    int i35 = i18 + i19;
                    i20 = i35 + i35;
                    s2 = 199;
                    if (C1519.m5403()) {
                        iM2761 = C0773.m3169("۬᩷") ^ i10;
                        i6 = ((iM2761 ^ i11) * 27853) ^ (-1523367156);
                        i7 = 2141291245;
                    } else {
                        iM2761 = (i10 - C0619.m2761("᩹ᩴ")) * (-95);
                        i6 = ((iM2761 ^ i11) * (-3475)) ^ 156799984;
                        i7 = 401685391;
                    }
                    i13 = iM2761 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i23 = i23;
                    ArrayList arrayList14 = arrayList2;
                    i21 = i3;
                    arrayList2 = arrayList14;
                    break;
                case -1106263654:
                case 1321690220:
                    i23 = i23;
                    sArr3 = sArr3;
                    if (!C1826.m6317(itM13647)) {
                        int i36 = i21;
                        arrayList2 = arrayList2;
                        i3 = i36;
                        iM2761 = C0619.m2761("ۧۙ") ^ i10;
                        i6 = ((iM2761 ^ i11) * 29233) ^ (-2135667726);
                        i7 = 40292700;
                        i13 = iM2761 ^ i7;
                        i12 = i6;
                        sArr3 = sArr3;
                        i23 = i23;
                        ArrayList arrayList15 = arrayList2;
                        i21 = i3;
                        arrayList2 = arrayList15;
                    } else {
                        iM3169 = (C0773.m3169("ᩴܶ") ^ i11) * 55;
                        i = ((iM3169 ^ i10) * (-26779)) ^ (-1789185407);
                        i2 = -1318325278;
                        i13 = iM3169 ^ i2;
                        i12 = i;
                        sArr3 = sArr3;
                        i23 = i23;
                    }
                    break;
                case -1075779785:
                case -977482215:
                    short[] sArr4 = sArr3;
                    int i37 = i21;
                    arrayList2 = arrayList2;
                    i3 = i37;
                    int iM29755 = abstractActivityC10144.f32499.m29755();
                    z = false;
                    z2 = true;
                    if (iM29755 != 0) {
                        iM31611 = (C0619.m2761("ۙ᩵") ^ i11) * 81;
                        i8 = ((iM31611 ^ i10) * 7327) ^ 1534931441;
                        i9 = -1003717335;
                    } else {
                        iM31611 = (C0773.m3169("᩷᩺") ^ i11) * 87;
                        i8 = ((iM31611 ^ i10) * 31405) ^ 105904357;
                        i9 = 895694665;
                    }
                    i13 = iM31611 ^ i9;
                    sArr3 = sArr4;
                    i23 = iM29755;
                    i12 = i8;
                    ArrayList arrayList16 = arrayList2;
                    i21 = i3;
                    arrayList2 = arrayList16;
                    break;
                case -984069814:
                case 551928633:
                    i23 = i23;
                    sArr3 = sArr3;
                    int i38 = i21;
                    arrayList2 = arrayList2;
                    i3 = i38;
                    if (i23 != z2) {
                        iM2761 = C0619.m2761("֨ۙ") ^ i11;
                        i6 = ((iM2761 ^ i10) * (-11429)) ^ 784019941;
                        i7 = 1666126457;
                    } else {
                        iM2761 = C0619.m2761("ۧ᩵") ^ i10;
                        i6 = ((iM2761 ^ i11) * 7469) ^ (-1662973506);
                        i7 = 1340074354;
                    }
                    i13 = iM2761 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i23 = i23;
                    ArrayList arrayList17 = arrayList2;
                    i21 = i3;
                    arrayList2 = arrayList17;
                    break;
                case -908743974:
                case -856783875:
                    if (abstractActivityC10144.f32496 == 0) {
                        iM31610 = (C0773.m3169("ۗۙ") + i10) * (-89);
                        i4 = ((iM31610 ^ i11) * (-15809)) ^ (-1974694173);
                        i5 = -1785209700;
                    } else {
                        iM31610 = C0619.m2761("ܽ᩺") ^ i10;
                        i4 = ((iM31610 ^ i11) * 10673) ^ 1048785809;
                        i5 = 271234904;
                    }
                    i13 = iM31610 ^ i5;
                    i12 = i4;
                    break;
                case -890829986:
                case 1580025818:
                    C2419.m8174();
                    if (!C0619.f2439) {
                        iM31610 = (C0619.m2761("ۙۤ") + i11) * 83;
                        i4 = ((iM31610 ^ i10) * 8919) ^ (-1296153308);
                        i5 = 1713796827;
                        i13 = iM31610 ^ i5;
                        i12 = i4;
                    } else {
                        i23 = i23;
                        sArr3 = sArr3;
                        iM3169 = C0773.m3169("᩸ᩳ") ^ i10;
                        i = ((iM3169 ^ i11) * 12329) ^ 597709657;
                        i2 = -179306880;
                        i13 = iM3169 ^ i2;
                        i12 = i;
                        sArr3 = sArr3;
                        i23 = i23;
                    }
                    break;
                case -862102618:
                case 1099781592:
                    i23 = i23;
                    sArr3 = sArr3;
                    i3 = i21;
                    itM13647 = C4282.m13647(abstractActivityC10144.f32497);
                    iM2761 = (C0619.m2761("۠۠") ^ i10) * (-105);
                    i6 = ((iM2761 ^ i11) * (-3627)) ^ (-1699776174);
                    i7 = -449740105;
                    i13 = iM2761 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i23 = i23;
                    ArrayList arrayList18 = arrayList2;
                    i21 = i3;
                    arrayList2 = arrayList18;
                    break;
                case -850359800:
                case 1237173583:
                    itM4942 = C1343.m4942(abstractActivityC10144.f32497);
                    iM3169 = (C0619.m2761("᩵ܺ") + i10) * 67;
                    i = ((iM3169 ^ i11) * (-4695)) ^ (-694599729);
                    i2 = 711090410;
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    sArr3 = sArr3;
                    i23 = i23;
                    break;
                case -825616078:
                case 502486203:
                    i23 = i23;
                    sArr3 = sArr3;
                    int i39 = i21;
                    arrayList2 = arrayList2;
                    i3 = i39;
                    int i40 = s + s2;
                    if (i20 - (i40 * i40) >= 0) {
                        iM2761 = (i10 - C0773.m3169("᩻ܺ")) * (-91);
                        i6 = ((iM2761 ^ i11) * (-15367)) ^ 752345328;
                        i7 = 170510996;
                    } else {
                        iM2761 = (C0773.m3169("ۧۗ") + i11) * 53;
                        i6 = ((iM2761 ^ i10) * (-24749)) ^ 1746206093;
                        i7 = -1542855979;
                    }
                    i13 = iM2761 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i23 = i23;
                    ArrayList arrayList19 = arrayList2;
                    i21 = i3;
                    arrayList2 = arrayList19;
                    break;
                case -773077156:
                case 1600597482:
                    abstractActivityC10144.m26241(abstractActivityC10144.f32499.m29750());
                    break;
                case -751364018:
                case 2005724074:
                    i23 = i23;
                    if (i23 != 4) {
                        iM3169 = (C0619.m2761("۠᩸") + i11) * (-99);
                        sArr3 = sArr3;
                        i = ((iM3169 ^ i10) * (-6123)) ^ (-1654890501);
                        i2 = 1901875476;
                    } else {
                        sArr3 = sArr3;
                        iM3169 = C0619.m2761("۬᩵") ^ i10;
                        i = ((iM3169 ^ i11) * 32559) ^ 156818877;
                        i2 = -274506433;
                    }
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    sArr3 = sArr3;
                    i23 = i23;
                    break;
                case -627093395:
                case 1987897789:
                    i23 = i23;
                    sArr3 = sArr3;
                    int i41 = i21;
                    arrayList2 = arrayList2;
                    i3 = i41;
                    abstractActivityC10144.f32496 = z ? 1 : 0;
                    if (abstractActivityC10144.f32504) {
                        i22 = z ? 1 : 0;
                        iM2761 = (C0619.m2761("ۡ֨") + i10) * 95;
                        i6 = ((iM2761 ^ i11) * 8487) ^ 2030547981;
                        i7 = -1480892296;
                    } else {
                        iM2761 = (i11 - C0773.m3169("۟֡")) * (-113);
                        i6 = ((iM2761 ^ i10) * (-29195)) ^ (-1820928024);
                        i7 = -1975757947;
                    }
                    i13 = iM2761 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i23 = i23;
                    ArrayList arrayList110 = arrayList2;
                    i21 = i3;
                    arrayList2 = arrayList110;
                    break;
                case -612976828:
                case 1170060364:
                    i23 = i23;
                    sArr3 = sArr3;
                    int i42 = i21;
                    arrayList2 = arrayList2;
                    i3 = i42;
                    int i43 = abstractActivityC10144.f32492;
                    int i44 = i22 == true ? 1 : 0;
                    if (i44 < i43) {
                        iM2761 = (C0619.m2761("ܰ۫") ^ i11) * (-107);
                        i22 = i44 == true ? 1 : 0;
                        i6 = ((iM2761 ^ i10) * 20571) ^ (-1368298190);
                        i7 = 2000273261;
                    } else {
                        i22 = i44 == true ? 1 : 0;
                        iM2761 = C0619.m2761("ۧۙ") ^ i10;
                        i6 = ((iM2761 ^ i11) * 29233) ^ (-2135667726);
                        i7 = 40292700;
                    }
                    i13 = iM2761 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i23 = i23;
                    ArrayList arrayList111 = arrayList2;
                    i21 = i3;
                    arrayList2 = arrayList111;
                    break;
                case -531179926:
                case 1195351871:
                    break;
                case -484582733:
                case 764231233:
                    i23 = i23;
                    sArr3 = sArr3;
                    int i45 = i21;
                    arrayList2 = arrayList2;
                    i3 = i45;
                    abstractActivityC10144.f32496 = z ? 1 : 0;
                    if (abstractActivityC10144.f32504) {
                        iM2761 = (i11 - C0773.m3169("᩷᩸")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i6 = ((iM2761 ^ i10) * 13799) ^ 163102377;
                        i7 = 1101947554;
                    } else {
                        iM2761 = C0773.m3169("֨ۨ") ^ i11;
                        i6 = ((iM2761 ^ i10) * 1075) ^ (-1092501103);
                        i7 = -118504825;
                    }
                    i13 = iM2761 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i23 = i23;
                    ArrayList arrayList112 = arrayList2;
                    i21 = i3;
                    arrayList2 = arrayList112;
                    break;
                case -369120306:
                case 546762493:
                    abstractActivityC10144.f32496 += z2 ? 1 : 0;
                    iM3169 = (C0619.m2761("᩵ܺ") + i10) * 67;
                    i = ((iM3169 ^ i11) * (-4695)) ^ (-694599729);
                    i2 = 711090410;
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    sArr3 = sArr3;
                    i23 = i23;
                    break;
                case -189713327:
                case 691879388:
                    iM31612 = C0773.m3169(C2287.m7749(sArr3, UMErrorCode.E_UM_BE_RAW_OVERSIZE, 3, i14));
                    if (C1080.f3865 >= 0) {
                        iM31610 = (C0619.m2761("᩶۠") ^ i11) * 119;
                        i4 = ((iM31610 ^ i10) * (-20409)) ^ 108862734;
                        i5 = -1358938565;
                    } else {
                        iM31610 = (i10 - C0773.m3169("֡ܶ")) * 43;
                        i4 = ((iM31610 ^ i11) * 13105) ^ (-165484984);
                        i5 = 98743797;
                    }
                    i13 = iM31610 ^ i5;
                    i12 = i4;
                    break;
                case -102249812:
                case 1943402208:
                    i15 = 0;
                    iM3169 = (C0773.m3169("۫ᩴ") + i11) * 115;
                    i = ((iM3169 ^ i10) * 26027) ^ (-207294969);
                    i2 = -664059226;
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    sArr3 = sArr3;
                    i23 = i23;
                    break;
                case -57906029:
                case 1458592391:
                    i23 = i23;
                    sArr3 = sArr3;
                    int i46 = i21;
                    arrayList2 = arrayList2;
                    i3 = i46;
                    if (i23 != 2) {
                        iM2761 = C0619.m2761("۬ۛ") ^ i11;
                        i6 = ((iM2761 ^ i10) * (-18239)) ^ (-1238273169);
                        i7 = -1345036998;
                    } else {
                        iM2761 = C0619.m2761("᩺ۗ") ^ i10;
                        i6 = ((iM2761 ^ i11) * 19193) ^ 440327201;
                        i7 = -1279599716;
                    }
                    i13 = iM2761 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i23 = i23;
                    ArrayList arrayList113 = arrayList2;
                    i21 = i3;
                    arrayList2 = arrayList113;
                    break;
                case 131836514:
                case 1875319523:
                    i3 = i21;
                    i14 = 20137;
                    iM2761 = C0619.m2761("᩹ۙ") ^ i10;
                    i6 = ((iM2761 ^ i11) * 29389) ^ (-1330961084);
                    i7 = -1477586236;
                    i13 = iM2761 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i23 = i23;
                    ArrayList arrayList114 = arrayList2;
                    i21 = i3;
                    arrayList2 = arrayList114;
                    break;
                case 195091157:
                case 1058838340:
                    RunnableC1848.m6360();
                    break;
                case 247444759:
                case 1965821738:
                    if (((C11636) C3690.m11990(arrayList, i16)).m29230()) {
                        iM31610 = (C0773.m3169("۠᩶") + i11) * (-59);
                        i4 = ((iM31610 ^ i10) * 20517) ^ 813540377;
                        i5 = 499844066;
                    } else {
                        iM31610 = C0619.m2761("ۘۤ") ^ i10;
                        i4 = ((iM31610 ^ i11) * (-17783)) ^ 1191592258;
                        i5 = 1841567944;
                    }
                    i13 = iM31610 ^ i5;
                    i12 = i4;
                    break;
                case 261547161:
                case 2005899093:
                    i15++;
                    iM3169 = (C0773.m3169("۫ᩴ") + i11) * 115;
                    i = ((iM3169 ^ i10) * 26027) ^ (-207294969);
                    i2 = -664059226;
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    sArr3 = sArr3;
                    i23 = i23;
                    break;
                case 657723393:
                case 836141045:
                    iM2763 = C0619.m2761(C2485.m8350(sArr2, i25, i26, i14));
                    if (C20932.f66974 <= 0) {
                        iM31610 = C0773.m3169("᩸֨") ^ i10;
                        i4 = ((iM31610 ^ i11) * 2529) ^ (-988728886);
                        i5 = -1565510241;
                    } else {
                        iM31610 = (C0773.m3169("ܿ۟") ^ i11) * (-23);
                        i4 = ((iM31610 ^ i10) * 17421) ^ 1798340252;
                        i5 = 2058982151;
                    }
                    i13 = iM31610 ^ i5;
                    i12 = i4;
                    break;
                case 680477712:
                case 1926172257:
                    if (C1321.f4751 < 0) {
                        iM31610 = C0773.m3169("᩸֨") ^ i10;
                        i4 = ((iM31610 ^ i11) * 2529) ^ (-988728886);
                        i5 = -1565510241;
                        i13 = iM31610 ^ i5;
                        i12 = i4;
                    } else {
                        i23 = i23;
                        sArr3 = sArr3;
                        int i310 = i21;
                        arrayList2 = arrayList2;
                        i3 = i310;
                        iM2761 = (i10 - C0619.m2761("᩹ᩴ")) * (-95);
                        i6 = ((iM2761 ^ i11) * (-3475)) ^ 156799984;
                        i7 = 401685391;
                        i13 = iM2761 ^ i7;
                        i12 = i6;
                        sArr3 = sArr3;
                        i23 = i23;
                        ArrayList arrayList115 = arrayList2;
                        i21 = i3;
                        arrayList2 = arrayList115;
                    }
                    break;
                case 836994505:
                case 1940069961:
                    C17202.m40372();
                    if (!C2023.f6737) {
                        i23 = i23;
                        sArr3 = sArr3;
                        iM3169 = C0773.m3169("᩸ᩳ") ^ i10;
                        i = ((iM3169 ^ i11) * 12329) ^ 597709657;
                        i2 = -179306880;
                        i13 = iM3169 ^ i2;
                        i12 = i;
                        sArr3 = sArr3;
                        i23 = i23;
                    } else {
                        i23 = i23;
                        sArr3 = sArr3;
                        int i47 = i21;
                        arrayList2 = arrayList2;
                        i3 = i47;
                        iM2761 = (C0619.m2761("ۘۨ") ^ i11) * 7;
                        i6 = ((iM2761 ^ i10) * (-24309)) ^ (-310082456);
                        i7 = 639061699;
                        i13 = iM2761 ^ i7;
                        i12 = i6;
                        sArr3 = sArr3;
                        i23 = i23;
                        ArrayList arrayList116 = arrayList2;
                        i21 = i3;
                        arrayList2 = arrayList116;
                    }
                    break;
                case 924320979:
                case 1298120219:
                    i23 = i23;
                    sArr3 = sArr3;
                    int i48 = i21;
                    arrayList2 = arrayList2;
                    i3 = i48;
                    i18 = s * s;
                    i19 = 39601;
                    if (C3690.m11987()) {
                        iM2761 = C0619.m2761("᩷ܺ") ^ i10;
                        i6 = ((iM2761 ^ i11) * (-6013)) ^ (-923223046);
                        i7 = -2101049486;
                    } else {
                        iM2761 = (C0773.m3169("ۗܰ") ^ i11) * 53;
                        i6 = ((iM2761 ^ i10) * 23165) ^ (-1913866428);
                        i7 = -1739080687;
                    }
                    i13 = iM2761 ^ i7;
                    i12 = i6;
                    sArr3 = sArr3;
                    i23 = i23;
                    ArrayList arrayList117 = arrayList2;
                    i21 = i3;
                    arrayList2 = arrayList117;
                    break;
                case 988119721:
                case 1260404870:
                    i23 = i23;
                    sArr3 = sArr3;
                    if (!((C11636) C0950.m3796(itM13647)).m29228(z2)) {
                        i3 = i21;
                        iM2761 = (C0619.m2761("۠۠") ^ i10) * (-105);
                        i6 = ((iM2761 ^ i11) * (-3627)) ^ (-1699776174);
                        i7 = -449740105;
                        i13 = iM2761 ^ i7;
                        i12 = i6;
                        sArr3 = sArr3;
                        i23 = i23;
                        ArrayList arrayList118 = arrayList2;
                        i21 = i3;
                        arrayList2 = arrayList118;
                    } else {
                        iM3169 = C0773.m3169("᩶ۤ") ^ i11;
                        i = ((iM3169 ^ i10) * (-8045)) ^ 292590729;
                        i2 = -1748464352;
                        i13 = iM3169 ^ i2;
                        i12 = i;
                        sArr3 = sArr3;
                        i23 = i23;
                    }
                    break;
                case 1145273402:
                case 1330648268:
                    if (!((C11636) C0950.m3796(itM4942)).m29230()) {
                        iM3169 = (C0619.m2761("᩵ܺ") + i10) * 67;
                        i = ((iM3169 ^ i11) * (-4695)) ^ (-694599729);
                        i2 = 711090410;
                        i13 = iM3169 ^ i2;
                        i12 = i;
                        sArr3 = sArr3;
                        i23 = i23;
                    } else {
                        iM31610 = (C0773.m3169("᩵ۘ") ^ i11) * (-113);
                        i4 = ((iM31610 ^ i10) * 29249) ^ (-867924262);
                        i5 = -1370285254;
                        i13 = iM31610 ^ i5;
                        i12 = i4;
                    }
                    break;
                case 1152640133:
                case 1188131020:
                    abstractActivityC10144.m26241(z);
                    break;
                case 1175190660:
                case 1438630728:
                    if (AbstractC3624.f12429 <= 0) {
                        iM31610 = (C0773.m3169("ܰ᩹") + i10) * 21;
                        i4 = ((iM31610 ^ i11) * 23597) ^ 2014665405;
                        i5 = 556935255;
                        i13 = iM31610 ^ i5;
                        i12 = i4;
                    } else {
                        i23 = i23;
                        sArr3 = sArr3;
                        int i49 = i21;
                        arrayList2 = arrayList2;
                        i3 = i49;
                        iM2761 = (C0619.m2761("ۘۨ") ^ i11) * 7;
                        i6 = ((iM2761 ^ i10) * (-24309)) ^ (-310082456);
                        i7 = 639061699;
                        i13 = iM2761 ^ i7;
                        i12 = i6;
                        sArr3 = sArr3;
                        i23 = i23;
                        ArrayList arrayList119 = arrayList2;
                        i21 = i3;
                        arrayList2 = arrayList119;
                    }
                    break;
                case 1201808142:
                case 1366108896:
                    i17 = iM2763 ^ 2129847669;
                    sArr3 = f32484;
                    if (C3998.f13671 != 0) {
                        iM31610 = C0619.m2761("᩹ۧ") ^ i11;
                        i4 = ((iM31610 ^ i10) * (-6935)) ^ (-1108283123);
                        i5 = 1198770976;
                    } else {
                        iM31610 = (C0619.m2761("ۜ᩹") + i11) * 43;
                        i4 = ((iM31610 ^ i10) * (-12347)) ^ 1219879440;
                        i5 = 777702264;
                    }
                    i13 = iM31610 ^ i5;
                    i12 = i4;
                    break;
                default:
                    i23 = i23;
                    sArr3 = sArr3;
                    if (i23 != 3) {
                        iM3169 = (i10 - C0619.m2761("ܿ۠")) * (-115);
                        i = ((iM3169 ^ i11) * (-26459)) ^ 222589867;
                        i2 = -1576223866;
                    } else {
                        iM3169 = (C0773.m3169("ۤۙ") + i11) * (-89);
                        i = ((iM3169 ^ i10) * 21509) ^ (-719141674);
                        i2 = 26760289;
                    }
                    i13 = iM3169 ^ i2;
                    i12 = i;
                    sArr3 = sArr3;
                    i23 = i23;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0230 A[PHI: r1 r6 r8 r16
      0x0230: PHI (r1v2 java.lang.String) = (r1v1 java.lang.String), (r1v1 java.lang.String), (r1v3 java.lang.String) binds: [B:60:0x022e, B:52:0x01d7, B:36:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r6v3 int) = (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:60:0x022e, B:52:0x01d7, B:36:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r8v3 short) = (r8v1 short), (r8v2 short), (r8v1 short) binds: [B:60:0x022e, B:52:0x01d7, B:36:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r16v18 int) = (r16v10 int), (r16v12 int), (r16v19 int) binds: [B:60:0x022e, B:52:0x01d7, B:36:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x026a A[PHI: r4 r5 r12 r16
      0x026a: PHI (r4v3 short) = (r4v2 short), (r4v1 short), (r4v1 short) binds: [B:64:0x0268, B:40:0x0157, B:17:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x026a: PHI (r5v3 int) = (r5v2 int), (r5v1 int), (r5v1 int) binds: [B:64:0x0268, B:40:0x0157, B:17:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x026a: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:64:0x0268, B:40:0x0157, B:17:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x026a: PHI (r16v27 int) = (r16v9 int), (r16v17 int), (r16v28 int) binds: [B:64:0x0268, B:40:0x0157, B:17:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x02c1 A[PHI: r2 r10 r11 r16
      0x02c1: PHI (r2v3 short[]) = (r2v2 short[]), (r2v1 short[]), (r2v1 short[]) binds: [B:72:0x02bf, B:44:0x0178, B:14:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x02c1: PHI (r10v3 short[]) = (r10v1 short[]), (r10v2 short[]), (r10v1 short[]) binds: [B:72:0x02bf, B:44:0x0178, B:14:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x02c1: PHI (r11v3 int) = (r11v1 int), (r11v2 int), (r11v1 int) binds: [B:72:0x02bf, B:44:0x0178, B:14:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x02c1: PHI (r16v29 int) = (r16v7 int), (r16v16 int), (r16v30 int) binds: [B:72:0x02bf, B:44:0x0178, B:14:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x02f1 A[PHI: r3 r16
      0x02f1: PHI (r3v3 char) = (r3v1 char), (r3v2 char), (r3v1 char) binds: [B:76:0x02ef, B:68:0x02a0, B:10:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x02f1: PHI (r16v32 int) = (r16v6 int), (r16v8 int), (r16v33 int) binds: [B:76:0x02ef, B:68:0x02a0, B:10:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006a, code lost:
    
        if (l.C2419.f7754 < 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
    
        r16 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        if (l.C11235.f35427 < 0) goto L17;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m26218(l.AbstractActivityC10144 r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC10144.m26218(l.ۢ۬ۤ, boolean):void");
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public String mo26259() {
        throw new RuntimeException();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x011e  */
    /* JADX WARN: Code duplicated, block: B:54:0x017c  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e9 A[PHI: r10
      0x01e9: PHI (r10v3 java.util.ArrayList) = 
      (r10v2 java.util.ArrayList)
      (r10v2 java.util.ArrayList)
      (r10v2 java.util.ArrayList)
      (r10v2 java.util.ArrayList)
      (r10v4 java.util.ArrayList)
     binds: [B:63:0x01e7, B:18:0x0053, B:16:0x004f, B:13:0x0049, B:33:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0218  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26246(ArrayList arrayList) {
        int iM2761;
        int i;
        ArrayList arrayList2 = null;
        int[] iArr = null;
        int i2 = -1510522376;
        int i3 = C0773.f2792;
        int i4 = RunnableC3055.f9898;
        int iM2762 = (C0619.m2761("ᩴܿ") + i4) * 101;
        int i5 = ((iM2762 ^ i3) * (-28097)) ^ (-453537544);
        int i6 = iM2762 ^ 1761240803;
        ArrayList arrayList3 = null;
        while (true) {
            C10080 c10080 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * 32451) >> 31) & i5) ^ i6;
                switch (i2) {
                    case -2087601971:
                    case 34879574:
                        this.f32493 = arrayList3;
                        if (!C2288.m7767()) {
                            c10080 = new C10080(1);
                            if (C23916.m53419() == 0) {
                                iM2761 = (C0773.m3169("ۘ᩸") + i3) * 47;
                                i5 = ((iM2761 ^ i4) * 21241) ^ (-1131793049);
                                i = -1289417953;
                                i6 = iM2761 ^ i;
                            } else {
                                int iM2763 = (i4 - C0619.m2761("۠᩻")) * (-15);
                                i5 = ((iM2763 ^ i3) * 22623) ^ 922969507;
                                i6 = iM2763 ^ (-193400790);
                                arrayList3 = null;
                            }
                        }
                        break;
                    case -2082456951:
                    case -1379337250:
                        m26244();
                        m26255();
                        break;
                    case -1971645201:
                    case 1063488542:
                        this.f32497 = arrayList2;
                        this.f32498 = arrayList2;
                        if (mo26247()) {
                            iM2761 = C0773.m3169("ۖ᩹") ^ i3;
                            i5 = ((iM2761 ^ i4) * 15035) ^ 1457570494;
                            i = 2120735492;
                        } else {
                            iM2761 = C0619.m2761("ܶܿ") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-17077)) ^ (-49997400);
                            i = 121150157;
                        }
                        i6 = iM2761 ^ i;
                        break;
                    case -1968146774:
                    case -1782088531:
                        this.f32490 = iArr;
                        if (C1321.f4751 >= 0) {
                            iM2761 = (C0773.m3169("۬ۧ") + i3) * (-117);
                            i5 = ((iM2761 ^ i4) * (-21771)) ^ (-1083670484);
                            i = -1566970362;
                        } else {
                            iM2761 = (C0773.m3169("᩻᩻") + i3) * (-67);
                            i5 = ((iM2761 ^ i4) * (-27601)) ^ (-950146728);
                            i = 2085134124;
                        }
                        i6 = iM2761 ^ i;
                        break;
                    case -1594932268:
                    case -1201209992:
                        Collections.sort(arrayList3, C2661.comparing(c10080));
                        iM2761 = (C0773.m3169("᩵ۨ") ^ i3) * 27;
                        i5 = ((iM2761 ^ i4) * 25355) ^ (-1759446585);
                        i = 1797549357;
                        i6 = iM2761 ^ i;
                        break;
                    case -1521304360:
                    case -1257885211:
                        C0950.m3785();
                        C3448.m11248();
                        break;
                    case -1516340653:
                    case -746355224:
                        if (RunnableC3055.m9933() == 0) {
                            arrayList2 = new ArrayList(arrayList);
                            if (C11235.f35427 < 0) {
                                iM2761 = (C0773.m3169("ۢ᩷") ^ i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                i5 = ((iM2761 ^ i4) * (-13667)) ^ (-784423759);
                                i = -1918885158;
                                i6 = iM2761 ^ i;
                            } else {
                                int iM2764 = (i4 - C0619.m2761("۠᩻")) * (-15);
                                i5 = ((iM2764 ^ i3) * 22623) ^ 922969507;
                                i6 = iM2764 ^ (-193400790);
                                arrayList3 = null;
                            }
                        }
                        break;
                    case -1420742518:
                    case 217664974:
                        if (this.f32500) {
                            iM2761 = (i4 - C0619.m2761("᩵ۢ")) * (-55);
                            i5 = ((iM2761 ^ i3) * 13249) ^ 416331033;
                            i = -1294485056;
                        } else {
                            iM2761 = C0619.m2761("ܶܿ") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-17077)) ^ (-49997400);
                            i = 121150157;
                        }
                        i6 = iM2761 ^ i;
                        break;
                    case -1341633406:
                    case 1250341748:
                        AbstractC0116.m1243();
                        C0269.m1775();
                        iM2761 = (C0773.m3169("ۧ֡") ^ i3) * (-95);
                        i5 = ((iM2761 ^ i4) * 26301) ^ (-1977104058);
                        i = -764162869;
                        i6 = iM2761 ^ i;
                        break;
                    case -1138525837:
                    case 1371493568:
                        C3448.m11248();
                        if (C3779.f12953 > 0) {
                            iM2761 = (C0773.m3169("ۧ֡") ^ i3) * (-95);
                            i5 = ((iM2761 ^ i4) * 26301) ^ (-1977104058);
                            i = -764162869;
                        } else {
                            iM2761 = (C0773.m3169("۬ۧ") + i3) * (-117);
                            i5 = ((iM2761 ^ i4) * (-21771)) ^ (-1083670484);
                            i = -1566970362;
                        }
                        i6 = iM2761 ^ i;
                        break;
                    case -429453328:
                    case 112147375:
                        if (this.f32493 == null) {
                            iM2761 = C0773.m3169("ܳۤ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 19411) ^ (-2026705585);
                            i = -168659856;
                        } else {
                            iM2761 = (C0773.m3169("᩵ۨ") ^ i3) * 27;
                            i5 = ((iM2761 ^ i4) * 25355) ^ (-1759446585);
                            i = 1797549357;
                        }
                        i6 = iM2761 ^ i;
                        break;
                    case -7575026:
                    case 1068781450:
                        if (C3779.f12953 <= 0) {
                            iM2761 = (C0773.m3169("ۧ֡") ^ i3) * (-95);
                            i5 = ((iM2761 ^ i4) * 26301) ^ (-1977104058);
                            i = -764162869;
                        } else {
                            iM2761 = (i4 - C0773.m3169("۟᩻")) * (-61);
                            i5 = ((iM2761 ^ i3) * (-19409)) ^ (-450545271);
                            i = 2111087980;
                        }
                        i6 = iM2761 ^ i;
                        break;
                    case 458645566:
                    case 2112480287:
                        RunnableC1848.m6360();
                        if (C3734.f12817 < 0) {
                            int iM2765 = (i4 - C0619.m2761("۠᩻")) * (-15);
                            i5 = ((iM2765 ^ i3) * 22623) ^ 922969507;
                            i6 = iM2765 ^ (-193400790);
                            arrayList3 = null;
                        } else {
                            iM2761 = (i4 - C0773.m3169("۟᩻")) * (-61);
                            i5 = ((iM2761 ^ i3) * (-19409)) ^ (-450545271);
                            i = 2111087980;
                            i6 = iM2761 ^ i;
                        }
                        break;
                    case 535717349:
                    case 1888344286:
                        ArrayList arrayList4 = this.f32498;
                        if (C13473.f42873 == 0) {
                            arrayList3 = new ArrayList(arrayList4);
                            if (C0619.m2763()) {
                                iM2761 = (C0773.m3169("ۧ֡") ^ i3) * (-95);
                                i5 = ((iM2761 ^ i4) * 26301) ^ (-1977104058);
                                i = -764162869;
                            } else {
                                iM2761 = C0619.m2761("ۖ۟") ^ i4;
                                i5 = ((iM2761 ^ i3) * (-21159)) ^ 1123250399;
                                i = 1770886528;
                            }
                            i6 = iM2761 ^ i;
                        } else {
                            int iM2766 = (i4 - C0619.m2761("۠᩻")) * (-15);
                            i5 = ((iM2766 ^ i3) * 22623) ^ 922969507;
                            i6 = iM2766 ^ (-193400790);
                            arrayList3 = null;
                        }
                        break;
                    case 911109448:
                    case 1941867726:
                        if (C0487.f2131 <= 0) {
                            iM2761 = (i4 - C0773.m3169("۟᩻")) * (-61);
                            i5 = ((iM2761 ^ i3) * (-19409)) ^ (-450545271);
                            i = 2111087980;
                        } else {
                            iM2761 = (C0619.m2761("ۘ֫") + i3) * (-27);
                            i5 = ((iM2761 ^ i4) * (-16409)) ^ 743666874;
                            i = -1915629400;
                        }
                        i6 = iM2761 ^ i;
                        break;
                    case 1227184678:
                    case 1692638276:
                        if (C0773.m3161() != 0) {
                            iM2761 = (C0773.m3169("ۧ֡") ^ i3) * (-95);
                            i5 = ((iM2761 ^ i4) * 26301) ^ (-1977104058);
                            i = -764162869;
                        } else {
                            iM2761 = (i4 - C0619.m2761("ܺ֡")) * (-105);
                            i5 = ((iM2761 ^ i3) * 7551) ^ (-323292747);
                            i = 1608701448;
                        }
                        i6 = iM2761 ^ i;
                        break;
                    case 1661505642:
                    case 2108836275:
                        this.f32497 = this.f32493;
                        iM2761 = C0619.m2761("ܶܿ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-17077)) ^ (-49997400);
                        i = 121150157;
                        i6 = iM2761 ^ i;
                        break;
                    default:
                        iArr = new int[C2702.m8879(arrayList)];
                        if (C0487.m2356() < 0) {
                            iM2761 = C0619.m2761("ۨۛ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 23771) ^ 1389792493;
                            i = 2145081306;
                            i6 = iM2761 ^ i;
                        } else {
                            int iM2767 = (i4 - C0619.m2761("۠᩻")) * (-15);
                            i5 = ((iM2767 ^ i3) * 22623) ^ 922969507;
                            i6 = iM2767 ^ (-193400790);
                            arrayList3 = null;
                        }
                        break;
                }
                return;
            }
            int iM2768 = C0619.m2761("᩶᩵") ^ i3;
            i5 = ((iM2768 ^ i4) * (-3773)) ^ 690069271;
            i6 = iM2768 ^ 259314185;
        }
    }

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final void m26244() {
        this.f32501.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void m26241(boolean z) {
        C17930 c17930 = null;
        boolean z2 = false;
        int i = 0;
        Iterator itM13647 = null;
        int i2 = -1706467672;
        int i3 = C3099.f10023;
        int i4 = C1519.f5300;
        int iM2761 = (i3 - C0619.m2761("۫᩸")) * 41;
        int i5 = ((iM2761 ^ i4) * (-23511)) ^ 1499814932;
        int i6 = -924423408;
        while (true) {
            int i7 = iM2761 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i4) * 11791) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1862810384:
                    case 799217907:
                        if (C2288.f7433 > 0) {
                            iM2761 = C0773.m3169("ۛۤ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 31257) ^ 493582478;
                            i6 = 1112445574;
                        } else {
                            iM2761 = C0773.m3169("ۜۖ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 16081) ^ (-1495837926);
                            i6 = -388594556;
                        }
                        break;
                    case -1800800287:
                    case 1177524283:
                        ((C11636) C4238.m13529(itM13647)).m29228(z2);
                        iM2761 = (C0619.m2761("᩷۠") + i4) * (-23);
                        i5 = ((iM2761 ^ i3) * 2681) ^ 1243348651;
                        i6 = -710295108;
                        break;
                    case -1125673727:
                    case 1056929652:
                        if (!C3998.m12923(itM13647)) {
                            iM2761 = C0773.m3169("ܳ᩸") ^ i3;
                            i5 = ((iM2761 ^ i4) * 17159) ^ 482402915;
                            i6 = 475069261;
                        } else {
                            iM2761 = (C0773.m3169("۠ܽ") ^ i3) * 31;
                            i5 = ((iM2761 ^ i4) * 12511) ^ 1081127388;
                            i6 = 626738020;
                        }
                        break;
                    case -1074411800:
                    case 933810113:
                        C0950.m3785();
                        if (!RunnableC1848.m6360()) {
                            iM2761 = C0773.m3169("ᩳ۟") ^ i4;
                            i5 = ((iM2761 ^ i3) * 23915) ^ (-1746081504);
                            i6 = 1016623367;
                        } else {
                            iM2761 = (i3 - C0619.m2761("ۧۜ")) * 85;
                            i5 = ((iM2761 ^ i4) * (-29963)) ^ 1470470856;
                            i6 = -1610649147;
                        }
                        break;
                    case -989326541:
                    case -471475212:
                        C1321.m4852();
                        if (!RunnableC0334.m2063()) {
                            iM2761 = C0773.m3169("ۤᩴ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 31727) ^ 995926019;
                            i6 = -1303776036;
                        } else {
                            iM2761 = (i4 - C0773.m3169("ᩴۗ")) * 11;
                            i5 = ((iM2761 ^ i3) * (-20385)) ^ 894826438;
                            i6 = 1697773696;
                        }
                        break;
                    case -860050944:
                    case 1857899146:
                        if (AbstractC3624.f12429 > 0) {
                            iM2761 = C0773.m3169("ᩳ۟") ^ i4;
                            i5 = ((iM2761 ^ i3) * 23915) ^ (-1746081504);
                            i6 = 1016623367;
                            break;
                        }
                        iM2761 = (i4 - C0773.m3169("ᩴۗ")) * 11;
                        i5 = ((iM2761 ^ i3) * (-20385)) ^ 894826438;
                        i6 = 1697773696;
                        break;
                    case -770012607:
                    case 1538534842:
                        if (C2419.f7754 < 0) {
                            iM2761 = C0773.m3169("ܳ᩻") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-1779)) ^ (-1492023329);
                            i6 = -1362564390;
                        } else {
                            iM2761 = C0773.m3169("ۜۖ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 16081) ^ (-1495837926);
                            i6 = -388594556;
                        }
                        break;
                    case -735579553:
                    case 171248910:
                        if (C0269.f1558 > 0) {
                            iM2761 = C0773.m3169("۫ܽ") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-6571)) ^ (-554758308);
                            i6 = 65407630;
                        } else {
                            iM2761 = C0773.m3169("ۜۖ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 16081) ^ (-1495837926);
                            i6 = -388594556;
                        }
                        break;
                    case -725953296:
                    case 913780027:
                        if (!z) {
                            iM2761 = C0773.m3169("ۗ᩶") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-7627)) ^ 1661337128;
                            i6 = 371335490;
                        } else {
                            iM2761 = (i4 - C0619.m2761("ۢܰ")) * (-41);
                            i5 = ((iM2761 ^ i3) * 11957) ^ (-302423793);
                            i6 = 551614634;
                        }
                        break;
                    case -706646175:
                    case 1107477265:
                        if (!C2023.f6737) {
                            iM2761 = C0773.m3169("۠ۘ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 31109) ^ (-424995898);
                            i6 = 1334415159;
                        } else {
                            iM2761 = C0773.m3169("ۜۖ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 16081) ^ (-1495837926);
                            i6 = -388594556;
                        }
                        break;
                    case -420819965:
                    case 1024695603:
                        this.f32499.m29748();
                        iM2761 = C0773.m3169("֫ۛ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 17877) ^ 1835516630;
                        i6 = 197456479;
                        break;
                    case -371358867:
                    case 1315976635:
                        if (this.f32496 <= 0) {
                            z2 = false;
                            iM2761 = C0773.m3169("ܳ᩸") ^ i3;
                            i5 = ((iM2761 ^ i4) * 17159) ^ 482402915;
                            i6 = 475069261;
                        }
                        int iM3169 = (C0773.m3169("ۧ᩻") ^ i4) * (-41);
                        i5 = ((iM3169 ^ i3) * 3553) ^ (-172276900);
                        i7 = iM3169 ^ 1751389142;
                        z2 = false;
                        break;
                        break;
                    case -367264182:
                    case 1907673230:
                        C3033.m9845();
                        C3690.m11987();
                        iM2761 = (i4 - C0773.m3169("ᩴۗ")) * 11;
                        i5 = ((iM2761 ^ i3) * (-20385)) ^ 894826438;
                        i6 = 1697773696;
                        break;
                    case -305798511:
                    case 386427371:
                        if (C11235.f35427 < 0) {
                            iM2761 = C0773.m3169("֨᩷") ^ i3;
                            i5 = ((iM2761 ^ i4) * 5375) ^ (-1243633926);
                            i6 = -1917625304;
                        } else {
                            iM2761 = (i3 - C0619.m2761("ۧۜ")) * 85;
                            i5 = ((iM2761 ^ i4) * (-29963)) ^ 1470470856;
                            i6 = -1610649147;
                        }
                        break;
                    case -207581609:
                    case 339656717:
                        break;
                    case -8564108:
                    case 1513398268:
                        C3033.m9845();
                        C2702.m8876();
                        break;
                    case 31134301:
                    case 1958855257:
                        this.f32499.m29737();
                        iM2761 = C0773.m3169("֫ۛ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 17877) ^ 1835516630;
                        i6 = 197456479;
                        break;
                        break;
                    case 75121609:
                    case 1141045358:
                        this.f32501.notifyDataSetChanged();
                        if (C3448.m11248() == 0) {
                            iM2761 = (C0619.m2761("ۛۧ") ^ i4) * (-55);
                            i5 = ((iM2761 ^ i3) * (-5303)) ^ (-1259416605);
                            i6 = -1302091829;
                        } else {
                            iM2761 = (i3 - C0619.m2761("ۧۜ")) * 85;
                            i5 = ((iM2761 ^ i4) * (-29963)) ^ 1470470856;
                            i6 = -1610649147;
                        }
                        break;
                    case 209999184:
                    case 739693710:
                        c17930.mo40353(C4282.m13653(z));
                        if (!z) {
                            iM2761 = C0773.m3169("۬֡") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-26073)) ^ (-1307650224);
                            i6 = -1413509549;
                        } else {
                            iM2761 = (C0619.m2761("᩸ܶ") ^ i3) * 99;
                            i5 = ((iM2761 ^ i4) * 10813) ^ 1227890891;
                            i6 = -1049135957;
                        }
                        break;
                    case 409921110:
                    case 1237219040:
                        i = -1;
                        if (C1080.f3865 < 0) {
                            iM2761 = C0619.m2761("ܰ᩹") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-3011)) ^ 425149907;
                            i6 = 99235655;
                        } else {
                            iM2761 = C0773.m3169("ۜۖ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 16081) ^ (-1495837926);
                            i6 = -388594556;
                        }
                        break;
                    case 645173674:
                    case 1572724348:
                        this.f32502 = z;
                        c17930 = this.f32488;
                        if (C2485.f7950 == 0) {
                            iM2761 = C0619.m2761("᩸᩷") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-25799)) ^ (-1598163896);
                            i6 = 1423302953;
                        } else {
                            iM2761 = C0773.m3169("ۤᩴ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 31727) ^ 995926019;
                            i6 = -1303776036;
                        }
                        break;
                    case 1265493417:
                    case 1315723324:
                        if (this.f32502 != z) {
                            iM2761 = (C0619.m2761("ۖۚ") + i4) * 53;
                            i5 = ((iM2761 ^ i3) * (-14171)) ^ 31016651;
                            i6 = 417135075;
                        } else {
                            iM2761 = (i4 - C0619.m2761("ۢܰ")) * (-41);
                            i5 = ((iM2761 ^ i3) * 11957) ^ (-302423793);
                            i6 = 551614634;
                        }
                        break;
                    case 1516204395:
                    case 1572353160:
                        this.f32495 = i;
                        this.f32496 = z2 ? 1 : 0;
                        iM2761 = (i4 - C0619.m2761("ۢܰ")) * (-41);
                        i5 = ((iM2761 ^ i3) * 11957) ^ (-302423793);
                        i6 = 551614634;
                        break;
                    case 1554415659:
                    case 1767520108:
                        itM13647 = C4282.m13647(this.f32497);
                        iM2761 = (C0619.m2761("᩷۠") + i4) * (-23);
                        i5 = ((iM2761 ^ i3) * 2681) ^ 1243348651;
                        i6 = -710295108;
                        break;
                        break;
                    case 1907786573:
                    case 1939407951:
                        if (C0950.f3488 < 0) {
                            iM2761 = (i3 - C0773.m3169("۫ۧ")) * 45;
                            i5 = ((iM2761 ^ i4) * 4985) ^ 1819475808;
                            i6 = -939296674;
                        } else {
                            iM2761 = (i4 - C0773.m3169("ᩴۗ")) * 11;
                            i5 = ((iM2761 ^ i3) * (-20385)) ^ 894826438;
                            i6 = 1697773696;
                        }
                        break;
                    default:
                        if (C1519.f5300 < 0) {
                            iM2761 = C0773.m3169("֨ۢ") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-1347)) ^ 1625376230;
                            i6 = -716494069;
                        } else {
                            iM2761 = (i4 - C0773.m3169("ᩴۗ")) * 11;
                            i5 = ((iM2761 ^ i3) * (-20385)) ^ 894826438;
                            i6 = 1697773696;
                        }
                        break;
                }
                return;
            }
        }
    }

    @Override // l.ActivityC7405
    /* JADX INFO: renamed from: ᩺ */
    public final void mo3459() {
        m26230();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:58:0x024b A[PHI: r4 r9 r10 r11 r13 r15 r17 r32
      0x024b: PHI (r4v12 l.ܶ᩷ۚ) = (r4v3 l.ܶ᩷ۚ), (r4v1 l.ܶ᩷ۚ), (r4v1 l.ܶ᩷ۚ) binds: [B:26:0x00d7, B:29:0x0106, B:14:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r9v70 java.lang.String) = (r9v10 java.lang.String), (r9v64 java.lang.String), (r9v1 java.lang.String) binds: [B:26:0x00d7, B:29:0x0106, B:14:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r10v6 android.view.ViewGroup) = (r10v1 android.view.ViewGroup), (r10v3 android.view.ViewGroup), (r10v1 android.view.ViewGroup) binds: [B:26:0x00d7, B:29:0x0106, B:14:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r11v5 int) = (r11v1 int), (r11v2 int), (r11v1 int) binds: [B:26:0x00d7, B:29:0x0106, B:14:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r13v8 int) = (r13v3 int), (r13v1 int), (r13v1 int) binds: [B:26:0x00d7, B:29:0x0106, B:14:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r15v8 java.lang.String) = (r15v3 java.lang.String), (r15v1 java.lang.String), (r15v1 java.lang.String) binds: [B:26:0x00d7, B:29:0x0106, B:14:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r17v8 java.lang.String) = (r17v2 java.lang.String), (r17v1 java.lang.String), (r17v1 java.lang.String) binds: [B:26:0x00d7, B:29:0x0106, B:14:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r32v8 int) = (r32v3 int), (r32v1 int), (r32v1 int) binds: [B:26:0x00d7, B:29:0x0106, B:14:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public void m26230() {
        int iM2761;
        int i;
        int i2;
        String str;
        int i3;
        int i4;
        int i5;
        int iM3169;
        int i6;
        int i7;
        int iM2762;
        int i8;
        int iM2763;
        int i9;
        int iM2764;
        int i10;
        int i11;
        AbstractActivityC10144 abstractActivityC10144 = this;
        C2361 c2361 = null;
        int i12 = 0;
        boolean z = false;
        DialogInterfaceC8327 dialogInterfaceC8327M4860 = null;
        String strMo26259 = null;
        ViewGroup viewGroup = null;
        int iIndexOfChild = 0;
        int i13 = 0;
        int iM31610 = 0;
        String strM1236 = null;
        int iM2765 = 0;
        String strM2361 = null;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1795552718;
        int i17 = C3492.f12043;
        int i18 = C2288.f7433;
        int iM2766 = C0619.m2761("᩸ۚ") ^ i18;
        int i19 = ((iM2766 ^ i17) * (-14577)) ^ 133878003;
        int i20 = iM2766 ^ (-1453222141);
        Iterator itM13647 = null;
        short[] sArr = null;
        DialogInterfaceOnClickListenerC11332 dialogInterfaceOnClickListenerC11332 = null;
        DialogInterfaceOnClickListenerC16351 dialogInterfaceOnClickListenerC16351 = null;
        int i21 = 0;
        short s = 0;
        int i22 = 0;
        ArrayList arrayList = null;
        int i23 = 0;
        int iM31611 = 0;
        while (true) {
            i16 = i20 ^ (i19 & (((i16 ^ i17) * 14509) >> 31));
            switch (i16) {
                case -2141297956:
                case 1876172873:
                    break;
                case -2054046263:
                case 1726122878:
                    strMo26259 = strMo26259;
                    i22 = i22;
                    i23 = i23;
                    dialogInterfaceOnClickListenerC11332 = dialogInterfaceOnClickListenerC11332;
                    ArrayList arrayList2 = abstractActivityC10144.f32497;
                    if (arrayList2 != null) {
                        int iM2767 = C0619.m2761("֫ᩴ") ^ i17;
                        i3 = ((iM2767 ^ i18) * (-14447)) ^ 362171005;
                        i4 = iM2767 ^ (-1345138375);
                        arrayList = arrayList2;
                        i19 = i3;
                        i23 = i23;
                        dialogInterfaceOnClickListenerC11332 = dialogInterfaceOnClickListenerC11332;
                        i22 = i22;
                        strMo26259 = strMo26259;
                        i20 = i4;
                        abstractActivityC10144 = this;
                    } else {
                        int iM2768 = C0619.m2761("۠۬") ^ i18;
                        arrayList = arrayList2;
                        i23 = i23;
                        i19 = ((iM2768 ^ i17) * (-30049)) ^ 855452527;
                        abstractActivityC10144 = this;
                        str = strMo26259;
                        i20 = iM2768 ^ (-1142172691);
                        dialogInterfaceOnClickListenerC11332 = dialogInterfaceOnClickListenerC11332;
                        i22 = i22;
                        strMo26259 = str;
                    }
                    break;
                case -1868045015:
                case -484878191:
                    C17202.m40372();
                    C2834.m9344();
                    strMo26259 = strMo26259;
                    i22 = i22;
                    i5 = i23;
                    int iM2769 = (C0619.m2761("ۨ۫") + i18) * (-15);
                    i22 = i22;
                    i23 = i5;
                    strMo26259 = strMo26259;
                    i20 = iM2769 ^ 286617776;
                    i19 = ((iM2769 ^ i17) * (-24043)) ^ 662293798;
                    dialogInterfaceOnClickListenerC16351 = null;
                    break;
                case -1860623259:
                case 748832832:
                    strMo26259 = strMo26259;
                    i22 = i22;
                    i23 = i23;
                    dialogInterfaceOnClickListenerC11332 = dialogInterfaceOnClickListenerC11332;
                    int i24 = i14 + i15;
                    short s2 = s;
                    int i25 = s2 + 11699;
                    if ((i24 + i24) - (i25 * i25) < 0) {
                        iM2763 = (i17 - C0773.m3169("֨ۢ")) * 25;
                        i3 = ((iM2763 ^ i18) * 27215) ^ 1997448851;
                        i9 = 1874985374;
                    } else {
                        iM2763 = C0619.m2761("ܳۘ") ^ i17;
                        i3 = ((iM2763 ^ i18) * (-3857)) ^ 895367071;
                        i9 = 1438145111;
                    }
                    i4 = iM2763 ^ i9;
                    s = s2;
                    i19 = i3;
                    i23 = i23;
                    dialogInterfaceOnClickListenerC11332 = dialogInterfaceOnClickListenerC11332;
                    i22 = i22;
                    strMo26259 = strMo26259;
                    i20 = i4;
                    abstractActivityC10144 = this;
                    break;
                case -1848405083:
                case -886011076:
                    strMo26259 = strMo26259;
                    i22 = i22;
                    i23 = i23;
                    dialogInterfaceOnClickListenerC11332 = dialogInterfaceOnClickListenerC11332;
                    s = f32484[90];
                    i14 = s * s;
                    i15 = 136866601;
                    if (C2354.f7599 >= 0) {
                        int iM27610 = (C0619.m2761("ܰ۬") ^ i17) * (-21);
                        i19 = ((iM27610 ^ i18) * 5793) ^ (-777307515);
                        i4 = iM27610 ^ (-1465802790);
                        dialogInterfaceOnClickListenerC11332 = null;
                        i22 = i22;
                        i23 = i23;
                    } else {
                        iM2762 = C0619.m2761("ۢܽ") ^ i18;
                        i19 = ((iM2762 ^ i17) * (-28131)) ^ (-2031331690);
                        i8 = -213131357;
                        i4 = iM2762 ^ i8;
                        i23 = i23;
                        dialogInterfaceOnClickListenerC11332 = dialogInterfaceOnClickListenerC11332;
                        i22 = i22;
                    }
                    strMo26259 = strMo26259;
                    i20 = i4;
                    abstractActivityC10144 = this;
                    break;
                case -1777915125:
                case -862018106:
                    strMo26259 = strMo26259;
                    i22 = i22;
                    i5 = i23;
                    dialogInterfaceOnClickListenerC11332 = dialogInterfaceOnClickListenerC11332;
                    if (C3998.m12923(itM13647)) {
                        iM3169 = (C0619.m2761("᩵ۙ") ^ i17) * (-109);
                        i6 = ((iM3169 ^ i18) * (-1183)) ^ 1972373481;
                        i7 = 2124411146;
                    } else {
                        iM3169 = (C0773.m3169("ܺۜ") + i17) * 91;
                        i6 = ((iM3169 ^ i18) * (-24751)) ^ (-423899964);
                        i7 = 247558270;
                    }
                    int i26 = iM3169 ^ i7;
                    i23 = i5;
                    str = strMo26259;
                    i20 = i26;
                    i19 = i6;
                    dialogInterfaceOnClickListenerC11332 = dialogInterfaceOnClickListenerC11332;
                    i22 = i22;
                    strMo26259 = str;
                    break;
                case -1665039767:
                case 1303318668:
                    i21 = 47928;
                    iM2762 = (C0773.m3169("ܶܰ") + i18) * 67;
                    i19 = ((iM2762 ^ i17) * (-13929)) ^ (-1219252509);
                    i8 = -581026949;
                    i4 = iM2762 ^ i8;
                    i23 = i23;
                    dialogInterfaceOnClickListenerC11332 = dialogInterfaceOnClickListenerC11332;
                    i22 = i22;
                    strMo26259 = strMo26259;
                    i20 = i4;
                    abstractActivityC10144 = this;
                    break;
                case -1654631001:
                case 372948407:
                    C0950.m3790(this);
                    break;
                case -1584767653:
                case 1179525275:
                    i21 = 858;
                    iM2762 = (C0773.m3169("ܶܰ") + i18) * 67;
                    i19 = ((iM2762 ^ i17) * (-13929)) ^ (-1219252509);
                    i8 = -581026949;
                    i4 = iM2762 ^ i8;
                    i23 = i23;
                    dialogInterfaceOnClickListenerC11332 = dialogInterfaceOnClickListenerC11332;
                    i22 = i22;
                    strMo26259 = strMo26259;
                    i20 = i4;
                    abstractActivityC10144 = this;
                    break;
                case -1459369383:
                case 357604013:
                    strMo26259 = strMo26259;
                    iM2765 = C0619.m2761(C0773.m3166(f32484, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, 3, i21));
                    iM2761 = C0773.m3169("ܿۜ") ^ i18;
                    i = ((iM2761 ^ i17) * 21225) ^ 901932057;
                    i2 = 2082271297;
                    str = strMo26259;
                    i20 = iM2761 ^ i2;
                    i19 = i;
                    strMo26259 = str;
                    break;
                case -1409223267:
                case 1515091110:
                    C0269.m1775();
                    if (C0862.f3233 != 0) {
                        iM2764 = (C0773.m3169("ᩴۗ") + i17) * 53;
                        i10 = ((iM2764 ^ i18) * 25279) ^ (-455144121);
                        i11 = -1306639435;
                        i20 = iM2764 ^ i11;
                        i19 = i10;
                    } else {
                        strMo26259 = strMo26259;
                        i22 = i22;
                        i5 = i23;
                        int iM27611 = (C0619.m2761("ۨ۫") + i18) * (-15);
                        i22 = i22;
                        i23 = i5;
                        strMo26259 = strMo26259;
                        i20 = iM27611 ^ 286617776;
                        i19 = ((iM27611 ^ i17) * (-24043)) ^ 662293798;
                        dialogInterfaceOnClickListenerC16351 = null;
                    }
                    break;
                case -1386021369:
                case -652563135:
                    strMo26259 = mo26259();
                    Button buttonM7808 = C2310.m7808(dialogInterfaceC8327M4860);
                    viewGroup = (ViewGroup) buttonM7808.getParent();
                    iIndexOfChild = viewGroup.indexOfChild(buttonM7808);
                    if (C0619.f2439) {
                        iM2764 = (i18 - C0773.m3169("᩹ܽ")) * 17;
                        i10 = ((iM2764 ^ i17) * 22197) ^ (-1924131845);
                        i11 = -579610705;
                    } else {
                        iM2764 = C0619.m2761("۫᩵") ^ i18;
                        i10 = ((iM2764 ^ i17) * (-903)) ^ (-484494247);
                        i11 = -2073276830;
                    }
                    i20 = iM2764 ^ i11;
                    i19 = i10;
                    break;
                case -1154309566:
                case -194406723:
                    if (C2354.f7599 < 0) {
                        strMo26259 = strMo26259;
                        iM2761 = (C0619.m2761("᩻ܰ") ^ i17) * (-41);
                        i = ((iM2761 ^ i18) * (-4527)) ^ 1259050783;
                        i2 = -419161874;
                        str = strMo26259;
                        i20 = iM2761 ^ i2;
                        i19 = i;
                        strMo26259 = str;
                    } else {
                        strMo26259 = strMo26259;
                        i22 = i22;
                        i5 = i23;
                        int iM27612 = (C0619.m2761("ۨ۫") + i18) * (-15);
                        i22 = i22;
                        i23 = i5;
                        strMo26259 = strMo26259;
                        i20 = iM27612 ^ 286617776;
                        i19 = ((iM27612 ^ i17) * (-24043)) ^ 662293798;
                        dialogInterfaceOnClickListenerC16351 = null;
                    }
                    break;
                case -1138456615:
                case 1768135337:
                    strMo26259 = strMo26259;
                    i22 = i22;
                    i5 = i23;
                    dialogInterfaceOnClickListenerC11332 = dialogInterfaceOnClickListenerC11332;
                    itM13647 = C4282.m13647(arrayList);
                    iM3169 = C0619.m2761("ۗۛ") ^ i18;
                    i6 = ((iM3169 ^ i17) * 14027) ^ (-1820365539);
                    i7 = -195701070;
                    int i27 = iM3169 ^ i7;
                    i23 = i5;
                    str = strMo26259;
                    i20 = i27;
                    i19 = i6;
                    dialogInterfaceOnClickListenerC11332 = dialogInterfaceOnClickListenerC11332;
                    i22 = i22;
                    strMo26259 = str;
                    break;
                case -1125142022:
                case 1244630204:
                    CheckBox checkBox = (CheckBox) RunnableC3055.m9942(abstractActivityC10144, C0773.m3169(strM2361) ^ 2128843276);
                    viewGroup.removeViewAt(iIndexOfChild);
                    viewGroup.addView(checkBox, iIndexOfChild);
                    C0938.m3746(abstractActivityC10144, checkBox, strMo26259);
                    strMo26259 = strMo26259;
                    iM2761 = (C0773.m3169("ۡ۟") + i18) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i = ((iM2761 ^ i17) * (-32667)) ^ (-2014709341);
                    i2 = -2145077378;
                    str = strMo26259;
                    i20 = iM2761 ^ i2;
                    i19 = i;
                    strMo26259 = str;
                    break;
                case -1018767555:
                case -839120174:
                    strMo26259 = strMo26259;
                    dialogInterfaceC8327M4860 = C1321.m4860(c2361);
                    if (z) {
                        iM2761 = (C0619.m2761("ᩴۙ") ^ i17) * (-105);
                        i = ((iM2761 ^ i18) * (-15069)) ^ 1024829277;
                        i2 = 153385653;
                    } else {
                        iM2761 = (C0773.m3169("ۡ۟") + i18) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM2761 ^ i17) * (-32667)) ^ (-2014709341);
                        i2 = -2145077378;
                    }
                    str = strMo26259;
                    i20 = iM2761 ^ i2;
                    i19 = i;
                    strMo26259 = str;
                    break;
                case -858576207:
                case 1064267230:
                    strMo26259 = strMo26259;
                    C1321.m4857(c2361, iM31611 ^ i13);
                    i12 = 1;
                    if (!C0619.m2763()) {
                        dialogInterfaceOnClickListenerC11332 = new DialogInterfaceOnClickListenerC11332(abstractActivityC10144, i12);
                        iM31610 = C0773.m3169(C0950.m3780(f32484, 97, 3, i21));
                        if (C2354.f7599 >= 0) {
                            iM2761 = (C0619.m2761("᩻ܰ") ^ i17) * (-41);
                            i = ((iM2761 ^ i18) * (-4527)) ^ 1259050783;
                            i2 = -419161874;
                        } else {
                            iM2761 = (C0773.m3169("ۘ᩸") ^ i18) * 35;
                            i = ((iM2761 ^ i17) * (-15471)) ^ (-1309397340);
                            i2 = 1749075221;
                        }
                        str = strMo26259;
                        i20 = iM2761 ^ i2;
                        i19 = i;
                        strMo26259 = str;
                    } else {
                        i22 = i22;
                        i23 = i23;
                        int iM27613 = (C0619.m2761("ܰ۬") ^ i17) * (-21);
                        i19 = ((iM27613 ^ i18) * 5793) ^ (-777307515);
                        i4 = iM27613 ^ (-1465802790);
                        dialogInterfaceOnClickListenerC11332 = null;
                        i22 = i22;
                        i23 = i23;
                        strMo26259 = strMo26259;
                        i20 = i4;
                        abstractActivityC10144 = this;
                    }
                    break;
                case -826055767:
                case 1634839689:
                    strMo26259 = strMo26259;
                    iM31611 = C0773.m3169(C3690.m11996(f32484, 94, 3, i21));
                    i13 = 2100107328;
                    if (AbstractC3624.f12429 > 0) {
                        iM2761 = C0619.m2761("ܽܽ") ^ i17;
                        i = ((iM2761 ^ i18) * (-19319)) ^ (-165044037);
                        i2 = 748230327;
                        str = strMo26259;
                        i20 = iM2761 ^ i2;
                        i19 = i;
                        strMo26259 = str;
                    } else {
                        strMo26259 = strMo26259;
                        iM2764 = (i18 - C0773.m3169("᩹ܽ")) * 17;
                        i10 = ((iM2764 ^ i17) * 22197) ^ (-1924131845);
                        i11 = -579610705;
                        i20 = iM2764 ^ i11;
                        i19 = i10;
                    }
                    break;
                case -642176836:
                case 639124667:
                    C0950.m3790(this);
                    break;
                case -573065582:
                case 392545639:
                    strMo26259 = strMo26259;
                    RunnableC1848.m6359(c2361, C0773.m3169(strM1236) ^ 2122569330, dialogInterfaceOnClickListenerC16351);
                    z = abstractActivityC10144 instanceof ActivityC23375;
                    if (z) {
                        iM2761 = (C0619.m2761("᩺ۜ") ^ i17) * (-77);
                        i = ((iM2761 ^ i18) * 27331) ^ (-384468144);
                        i2 = 1444900488;
                    } else {
                        iM2761 = C0619.m2761("ۨۤ") ^ i17;
                        i = ((iM2761 ^ i18) * (-24165)) ^ (-1030627817);
                        i2 = -793733368;
                    }
                    str = strMo26259;
                    i20 = iM2761 ^ i2;
                    i19 = i;
                    strMo26259 = str;
                    break;
                case -432105003:
                case 542644994:
                    strMo26259 = strMo26259;
                    strM2361 = C0487.m2361(f32484, IShizukuService.Stub.TRANSACTION_getFlagsForUid, 3, i21);
                    if (C1343.f4799 == 0) {
                        iM2761 = (i17 - C0773.m3169("᩸֫")) * 57;
                        i = ((iM2761 ^ i18) * 11741) ^ (-312498007);
                        i2 = -841006436;
                        str = strMo26259;
                        i20 = iM2761 ^ i2;
                        i19 = i;
                        strMo26259 = str;
                    } else {
                        strMo26259 = strMo26259;
                        iM2764 = (i18 - C0773.m3169("᩹ܽ")) * 17;
                        i10 = ((iM2764 ^ i17) * 22197) ^ (-1924131845);
                        i11 = -579610705;
                        i20 = iM2764 ^ i11;
                        i19 = i10;
                    }
                    break;
                case -419287103:
                case 336664358:
                    DialogInterfaceOnClickListenerC11332 dialogInterfaceOnClickListenerC11333 = dialogInterfaceOnClickListenerC11332;
                    strMo26259 = strMo26259;
                    int i28 = DialogInterfaceC8327.f27315;
                    c2361 = new C2361(abstractActivityC10144);
                    sArr = f32484;
                    i23 = 3;
                    if (C2288.m7767()) {
                        dialogInterfaceOnClickListenerC11332 = dialogInterfaceOnClickListenerC11333;
                        i22 = 91;
                        iM2761 = (C0619.m2761("᩻ܰ") ^ i17) * (-41);
                        i = ((iM2761 ^ i18) * (-4527)) ^ 1259050783;
                        i2 = -419161874;
                        str = strMo26259;
                        i20 = iM2761 ^ i2;
                        i19 = i;
                        strMo26259 = str;
                    } else {
                        int iM31612 = C0773.m3169("ܺۢ") ^ i17;
                        i19 = ((iM31612 ^ i18) * 31973) ^ 1594709662;
                        strMo26259 = strMo26259;
                        i20 = iM31612 ^ 377577853;
                        dialogInterfaceOnClickListenerC11332 = dialogInterfaceOnClickListenerC11333;
                        i22 = 91;
                    }
                    break;
                case -102577621:
                case 741854928:
                    RunnableC3055.m9933();
                    break;
                case -17269571:
                case 580340734:
                    strMo26259 = strMo26259;
                    i22 = i22;
                    i5 = i23;
                    dialogInterfaceOnClickListenerC11332 = dialogInterfaceOnClickListenerC11332;
                    if (((C11636) C0950.m3796(itM13647)).m29229()) {
                        iM3169 = (C0773.m3169("֫ۨ") + i18) * (-7);
                        i6 = ((iM3169 ^ i17) * (-9189)) ^ 722471190;
                        i7 = 1537931532;
                    } else {
                        iM3169 = C0619.m2761("ۗۛ") ^ i18;
                        i6 = ((iM3169 ^ i17) * 14027) ^ (-1820365539);
                        i7 = -195701070;
                    }
                    int i29 = iM3169 ^ i7;
                    i23 = i5;
                    str = strMo26259;
                    i20 = i29;
                    i19 = i6;
                    dialogInterfaceOnClickListenerC11332 = dialogInterfaceOnClickListenerC11332;
                    i22 = i22;
                    strMo26259 = str;
                    break;
                case 91691868:
                case 523625006:
                    strMo26259 = strMo26259;
                    i22 = i22;
                    i5 = i23;
                    C13473.m33136(c2361, C0619.m2761(C20932.m47853(sArr, i22, i5, i21)) ^ 2099067757);
                    if (C3998.f13671 == 0) {
                        iM3169 = (C0773.m3169("۠۫") + i18) * 17;
                        dialogInterfaceOnClickListenerC11332 = dialogInterfaceOnClickListenerC11332;
                        i6 = ((iM3169 ^ i17) * (-11661)) ^ 580907251;
                        i7 = 1228954177;
                        int i210 = iM3169 ^ i7;
                        i23 = i5;
                        str = strMo26259;
                        i20 = i210;
                        i19 = i6;
                        dialogInterfaceOnClickListenerC11332 = dialogInterfaceOnClickListenerC11332;
                        i22 = i22;
                        strMo26259 = str;
                    } else {
                        int iM27614 = (C0619.m2761("ۨ۫") + i18) * (-15);
                        i22 = i22;
                        i23 = i5;
                        strMo26259 = strMo26259;
                        i20 = iM27614 ^ 286617776;
                        i19 = ((iM27614 ^ i17) * (-24043)) ^ 662293798;
                        dialogInterfaceOnClickListenerC16351 = null;
                    }
                    break;
                case 508440673:
                case 1071081065:
                    strMo26259 = strMo26259;
                    C2375.m8063(c2361, iM2765 ^ 2120200362, null);
                    iM2761 = C0619.m2761("ۨۤ") ^ i17;
                    i = ((iM2761 ^ i18) * (-24165)) ^ (-1030627817);
                    i2 = -793733368;
                    str = strMo26259;
                    i20 = iM2761 ^ i2;
                    i19 = i;
                    strMo26259 = str;
                    break;
                case 715990058:
                case 1730431580:
                    RunnableC0334.m2063();
                    if (C1519.f5300 >= 0) {
                        iM2764 = (C0773.m3169("ᩴۗ") + i17) * 53;
                        i10 = ((iM2764 ^ i18) * 25279) ^ (-455144121);
                        i11 = -1306639435;
                    } else {
                        iM2764 = (i18 - C0773.m3169("᩹ܽ")) * 17;
                        i10 = ((iM2764 ^ i17) * 22197) ^ (-1924131845);
                        i11 = -579610705;
                    }
                    i20 = iM2764 ^ i11;
                    i19 = i10;
                    break;
                default:
                    strMo26259 = strMo26259;
                    C3492.m11487(c2361, 2102050488 ^ iM31610, dialogInterfaceOnClickListenerC11332);
                    if (C2287.f7432 < 0) {
                        dialogInterfaceOnClickListenerC16351 = new DialogInterfaceOnClickListenerC16351(i12, abstractActivityC10144);
                        strM1236 = AbstractC0116.m1236(f32484, 100, 3, i21);
                        if (!C2354.m7983()) {
                            strMo26259 = strMo26259;
                            iM2764 = (i18 - C0773.m3169("᩹ܽ")) * 17;
                            i10 = ((iM2764 ^ i17) * 22197) ^ (-1924131845);
                            i11 = -579610705;
                            i20 = iM2764 ^ i11;
                            i19 = i10;
                        } else {
                            iM2761 = C0619.m2761("᩷ܺ") ^ i18;
                            i = ((iM2761 ^ i17) * (-4921)) ^ (-1987957452);
                            i2 = -1081693588;
                            str = strMo26259;
                            i20 = iM2761 ^ i2;
                            i19 = i;
                            strMo26259 = str;
                        }
                    } else {
                        i22 = i22;
                        i5 = i23;
                        int iM27615 = (C0619.m2761("ۨ۫") + i18) * (-15);
                        i22 = i22;
                        i23 = i5;
                        strMo26259 = strMo26259;
                        i20 = iM27615 ^ 286617776;
                        i19 = ((iM27615 ^ i17) * (-24043)) ^ 662293798;
                        dialogInterfaceOnClickListenerC16351 = null;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00be A[PHI: r10 r11 r12 r16
      0x00be: PHI (r10v5 short[]) = (r10v2 short[]), (r10v1 short[]), (r10v1 short[]) binds: [B:30:0x00bc, B:26:0x009a, B:14:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x00be: PHI (r11v5 int) = (r11v2 int), (r11v1 int), (r11v1 int) binds: [B:30:0x00bc, B:26:0x009a, B:14:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x00be: PHI (r12v5 int) = (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:30:0x00bc, B:26:0x009a, B:14:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x00be: PHI (r16v36 int) = (r16v25 int), (r16v26 int), (r16v37 int) binds: [B:30:0x00bc, B:26:0x009a, B:14:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0132 A[PHI: r16
      0x0132: PHI (r16v23 int) = (r16v22 int), (r16v24 int) binds: [B:42:0x011c, B:34:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x020f A[PHI: r5 r8 r16
      0x020f: PHI (r5v3 int) = (r5v2 int), (r5v1 int) binds: [B:62:0x020d, B:54:0x01b7] A[DONT_GENERATE, DONT_INLINE]
      0x020f: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:62:0x020d, B:54:0x01b7] A[DONT_GENERATE, DONT_INLINE]
      0x020f: PHI (r16v11 int) = (r16v9 int), (r16v12 int) binds: [B:62:0x020d, B:54:0x01b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x0292 A[PHI: r2 r4 r16 r17
      0x0292: PHI (r2v5 short[]) = (r2v2 short[]), (r2v1 short[]), (r2v1 short[]), (r2v1 short[]) binds: [B:74:0x0290, B:66:0x0244, B:37:0x010b, B:13:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0292: PHI (r4v5 short) = (r4v1 short), (r4v2 short), (r4v1 short), (r4v1 short) binds: [B:74:0x0290, B:66:0x0244, B:37:0x010b, B:13:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0292: PHI (r16v31 int) = (r16v6 int), (r16v8 int), (r16v17 int), (r16v32 int) binds: [B:74:0x0290, B:66:0x0244, B:37:0x010b, B:13:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0292: PHI (r17v5 java.lang.String) = (r17v1 java.lang.String), (r17v1 java.lang.String), (r17v1 java.lang.String), (r17v6 java.lang.String) binds: [B:74:0x0290, B:66:0x0244, B:37:0x010b, B:13:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        if (l.C3690.f12684 > 0) goto L9;
     */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m26238(l.AbstractActivityC10144 r20) {
        /*
            Method dump skipped, instruction units count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC10144.m26238(l.ۢ۬ۤ):void");
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m26252() {
        return this.f32498;
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public void mo26251() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x03da A[PHI: r18
      0x03da: PHI (r18v42 int) = (r18v4 int), (r18v8 int), (r18v9 int), (r18v34 int), (r18v44 int) binds: [B:102:0x03d8, B:86:0x0323, B:82:0x0306, B:23:0x00bb, B:9:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x042e A[PHI: r18
      0x042e: PHI (r18v37 int) = (r18v2 int), (r18v38 int) binds: [B:110:0x042c, B:16:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:115:0x045e A[PHI: r18
      0x045e: PHI (r18v35 int) = (r18v1 int), (r18v3 int), (r18v33 int), (r18v34 int), (r18v36 int) binds: [B:114:0x045c, B:106:0x040d, B:26:0x00c6, B:23:0x00bb, B:19:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0108 A[PHI: r12 r18
      0x0108: PHI (r12v5 l.ۧ۬ۤ) = (r12v4 l.ۧ۬ۤ), (r12v2 l.ۧ۬ۤ), (r12v2 l.ۧ۬ۤ) binds: [B:34:0x00f1, B:31:0x00d6, B:6:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r18v45 int) = (r18v28 int), (r18v31 int), (r18v47 int) binds: [B:34:0x00f1, B:31:0x00d6, B:6:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x0344 A[PHI: r18
      0x0344: PHI (r18v10 int) = (r18v7 int), (r18v11 int) binds: [B:90:0x0342, B:78:0x02e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x0374 A[PHI: r18
      0x0374: PHI (r18v43 int) = (r18v6 int), (r18v44 int) binds: [B:94:0x0372, B:9:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x03a6 A[PHI: r18
      0x03a6: PHI (r18v39 int) = (r18v5 int), (r18v32 int), (r18v33 int), (r18v38 int), (r18v41 int) binds: [B:98:0x03a4, B:28:0x00ca, B:26:0x00c6, B:16:0x0094, B:13:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        int iM3169;
        int i2;
        int i3;
        int i4 = C2375.f7641;
        int i5 = C1080.f3865;
        int iM2761 = (C0619.m2761("ۖۨ") + i4) * (-45);
        int i6 = ((iM2761 ^ i5) * 27357) ^ (-1520781555);
        ArrayList arrayList = null;
        C11636 c11636 = null;
        int i7 = iM2761 ^ 1809081394;
        int i8 = 0;
        boolean z = false;
        int i9 = 0;
        int i10 = 0;
        int iM8883 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1524076465;
        while (true) {
            int i14 = i7 ^ (i6 & (((i13 ^ i5) * (-12905)) >> 31));
            switch (i14) {
                case -2111521724:
                case 53699143:
                    return z;
                case -2100686404:
                case 3711161:
                    i14 = i14;
                    if (C1542.f5343 <= 0) {
                        iM3169 = (C0619.m2761("ܰۜ") + i4) * q.h;
                        i2 = ((iM3169 ^ i5) * (-14981)) ^ 27090901;
                        i3 = -485607124;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ܿ᩸")) * 21;
                        i2 = ((iM3169 ^ i5) * (-29417)) ^ 1325118987;
                        i3 = -1607622007;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -2041180716:
                case 2133900347:
                    int iM53427 = C23916.m53427(i9, i);
                    iM8883 = C2702.m8883(this.f32495, i);
                    i11 = iM53427;
                    iM3169 = C0773.m3169("ۚܰ") ^ i5;
                    i2 = ((iM3169 ^ i4) * (-17455)) ^ 897761763;
                    i3 = -1765173556;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1889934420:
                case -933686740:
                    C2310.m7813();
                    return false;
                case -1883907393:
                case 1710606648:
                    i14 = i14;
                    if (RunnableC1848.f6235) {
                        iM3169 = C0619.m2761("۫᩹") ^ i5;
                        i2 = ((iM3169 ^ i4) * 13471) ^ (-250265461);
                        i3 = 242664327;
                    } else {
                        iM3169 = C0619.m2761("ۖۛ") ^ i4;
                        i2 = ((iM3169 ^ i5) * (-1875)) ^ (-1074743838);
                        i3 = 1126662296;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1861444166:
                case 748098768:
                    i14 = i14;
                    i9 = this.f32495;
                    i10 = -1;
                    if (i9 == -1) {
                        iM3169 = C0773.m3169("ۨۙ") ^ i5;
                        i2 = ((iM3169 ^ i4) * (-20973)) ^ (-1082846666);
                        i3 = -874542481;
                    } else {
                        iM3169 = C0619.m2761("۟ܶ") ^ i4;
                        i2 = ((iM3169 ^ i5) * (-13533)) ^ 515203933;
                        i3 = 200209525;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1856022822:
                case 905983593:
                    i14 = i14;
                    C2375.m8065();
                    if (C3690.f12684 <= 0) {
                        iM3169 = C0619.m2761("ܽۗ") ^ i5;
                        i2 = ((iM3169 ^ i4) * 6995) ^ 598593265;
                        i3 = 322937854;
                    } else {
                        iM3169 = (C0619.m2761("ܰۜ") + i4) * q.h;
                        i2 = ((iM3169 ^ i5) * (-14981)) ^ 27090901;
                        i3 = -485607124;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1693191220:
                case 1258614727:
                    i14 = i14;
                    if (C4282.m13644()) {
                        iM3169 = C0619.m2761("۬֨") ^ i5;
                        i2 = ((iM3169 ^ i4) * (-31359)) ^ (-482069927);
                        i3 = -93733717;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ܿ᩸")) * 21;
                        i2 = ((iM3169 ^ i5) * (-29417)) ^ 1325118987;
                        i3 = -1607622007;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1687568229:
                case -961200211:
                    i14 = i14;
                    c11636 = (C11636) C1542.m5457(arrayList, i12);
                    if (c11636.m29234()) {
                        iM3169 = (C0773.m3169("ۤۘ") + i4) * 123;
                        i2 = ((iM3169 ^ i5) * (-18209)) ^ (-1269272171);
                        i3 = 1171900536;
                    } else {
                        iM3169 = C0773.m3169("֡ۗ") ^ i4;
                        i2 = ((iM3169 ^ i5) * (-22103)) ^ (-887544034);
                        i3 = -693176188;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1685022645:
                case -233792195:
                    i14 = i14;
                    C2834.m9344();
                    iM3169 = C0619.m2761("ܽۗ") ^ i5;
                    i2 = ((iM3169 ^ i4) * 6995) ^ 598593265;
                    i3 = 322937854;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1668487792:
                case -1389238163:
                    i14 = i14;
                    this.f32495 = i10;
                    this.f32501.notifyDataSetChanged();
                    iM3169 = C0773.m3169("ۧۜ") ^ i4;
                    i2 = ((iM3169 ^ i5) * (-23165)) ^ (-110981425);
                    i3 = -151325464;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1651024564:
                case -1225891752:
                    i14 = i14;
                    if (C11235.m28309() != 0) {
                        iM3169 = C0619.m2761("᩵ۧ") ^ i5;
                        i2 = ((iM3169 ^ i4) * 4977) ^ 1153247365;
                        i3 = -98362355;
                    } else {
                        iM3169 = C0619.m2761("۬᩶") ^ i5;
                        i2 = ((iM3169 ^ i4) * 3915) ^ (-1022349059);
                        i3 = -1649491506;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1631176127:
                case 728100277:
                    i14 = i14;
                    m26241(z);
                    m26245(i8, view);
                    this.f32495 = i;
                    iM3169 = C0773.m3169("ۧۜ") ^ i4;
                    i2 = ((iM3169 ^ i5) * (-23165)) ^ (-110981425);
                    i3 = -151325464;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1448342037:
                case -720345727:
                    C3690.m11987();
                    i14 = i14;
                    if (C3492.f12043 > 0) {
                        iM3169 = (i4 - C0773.m3169("ܿ᩸")) * 21;
                        i2 = ((iM3169 ^ i5) * (-29417)) ^ 1325118987;
                        i3 = -1607622007;
                    } else {
                        iM3169 = (C0773.m3169("᩻᩹") + i4) * 41;
                        i2 = ((iM3169 ^ i5) * (-29727)) ^ 522437151;
                        i3 = 140536172;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1365224986:
                case 1303321522:
                    i14 = i14;
                    if (i11 <= iM8883) {
                        iM3169 = C0773.m3169("ۙۜ") ^ i5;
                        i2 = ((iM3169 ^ i4) * 20261) ^ (-1495788753);
                        i3 = 1003012632;
                    } else {
                        iM3169 = (C0619.m2761("ᩴۗ") + i4) * 97;
                        i2 = ((iM3169 ^ i5) * 9049) ^ 943673577;
                        i3 = -457279055;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1337125885:
                case 1161975995:
                    if (C0862.m3503()) {
                        i14 = i14;
                        iM3169 = C0619.m2761("ܽۗ") ^ i5;
                        i2 = ((iM3169 ^ i4) * 6995) ^ 598593265;
                        i3 = 322937854;
                    } else {
                        iM3169 = C0773.m3169("ܰᩳ") ^ i4;
                        i14 = i14;
                        i2 = ((iM3169 ^ i5) * 31431) ^ (-172644797);
                        i3 = 1411494741;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1309479918:
                case 553639535:
                    i14 = i14;
                    if (C2419.m8174() < 0) {
                        iM3169 = C0619.m2761("ܽۗ") ^ i5;
                        i2 = ((iM3169 ^ i4) * 6995) ^ 598593265;
                        i3 = 322937854;
                    } else {
                        iM3169 = C0619.m2761("᩵ۧ") ^ i5;
                        i2 = ((iM3169 ^ i4) * 4977) ^ 1153247365;
                        i3 = -98362355;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1232654564:
                case 1711559182:
                    i14 = i14;
                    z = true;
                    z = true;
                    if (this.f32502) {
                        iM3169 = (C0773.m3169("ۧۙ") + i4) * (-53);
                        i2 = ((iM3169 ^ i5) * (-16283)) ^ (-1329487009);
                        i3 = -517300311;
                    } else {
                        iM3169 = C0773.m3169("ۢۖ") ^ i5;
                        i2 = ((iM3169 ^ i4) * (-25577)) ^ 1748081447;
                        i3 = -268212375;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1191747731:
                case 159231552:
                    i14 = i14;
                    i12 = this.f32490[i11];
                    iM3169 = C0619.m2761("ۧܿ") ^ i5;
                    i2 = ((iM3169 ^ i4) * 29789) ^ 434170707;
                    i3 = 500413565;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1176985109:
                case -94071181:
                    i14 = i14;
                    m26245(i8, view);
                    iM3169 = C0773.m3169("ۧۜ") ^ i4;
                    i2 = ((iM3169 ^ i5) * (-23165)) ^ (-110981425);
                    i3 = -151325464;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1088187552:
                case 280559734:
                    i14 = i14;
                    this.f32495 = i;
                    if (((C11636) C3690.m11990(this.f32497, i8)).m29234()) {
                        iM3169 = C0773.m3169("ۧۜ") ^ i4;
                        i2 = ((iM3169 ^ i5) * (-23165)) ^ (-110981425);
                        i3 = -151325464;
                    } else {
                        iM3169 = (C0773.m3169("ۙ֫") + i5) * (-35);
                        i2 = ((iM3169 ^ i4) * (-10031)) ^ (-155444061);
                        i3 = -1187187751;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1071290952:
                case 1187538476:
                    i14 = i14;
                    if (C2354.f7599 >= 0) {
                        iM3169 = (C0619.m2761("ܰۜ") + i4) * q.h;
                        i2 = ((iM3169 ^ i5) * (-14981)) ^ 27090901;
                        i3 = -485607124;
                    } else {
                        iM3169 = (C0773.m3169("ۤ۟") + i5) * 65;
                        i2 = ((iM3169 ^ i4) * 28025) ^ 1065596437;
                        i3 = -885050654;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -1023683278:
                case -189730499:
                    i14 = i14;
                    if (C2702.f8586 <= 0) {
                        iM3169 = (C0773.m3169("᩻᩹") + i4) * 41;
                        i2 = ((iM3169 ^ i5) * (-29727)) ^ 522437151;
                        i3 = 140536172;
                    } else {
                        iM3169 = C0773.m3169("ܿۤ") ^ i5;
                        i2 = ((iM3169 ^ i4) * (-32207)) ^ 364860243;
                        i3 = 1423141842;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -884417442:
                case 2114666177:
                    i14 = i14;
                    if (C0950.m3785() != 0) {
                        iM3169 = (i4 - C0773.m3169("ܿ᩸")) * 21;
                        i2 = ((iM3169 ^ i5) * (-29417)) ^ 1325118987;
                        i3 = -1607622007;
                    } else {
                        iM3169 = (C0619.m2761("ۚ᩵") ^ i4) * 43;
                        i2 = ((iM3169 ^ i5) * (-27191)) ^ 849905254;
                        i3 = -607068213;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -691363560:
                case -51725279:
                    i14 = i14;
                    i8 = this.f32490[i];
                    iM3169 = C0773.m3169("ۗۡ") ^ i4;
                    i2 = ((iM3169 ^ i5) * (-22351)) ^ 670500607;
                    i3 = 1694759756;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -683585013:
                case 554645119:
                    i14 = i14;
                    if (C1321.f4751 >= 0) {
                        iM3169 = C0619.m2761("۫᩹") ^ i5;
                        i2 = ((iM3169 ^ i4) * 13471) ^ (-250265461);
                        i3 = 242664327;
                    } else {
                        iM3169 = C0619.m2761("ܳ֡") ^ i4;
                        i2 = ((iM3169 ^ i5) * 17665) ^ (-1875359729);
                        i3 = 1370259913;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -528055647:
                case 558264823:
                    i14 = i14;
                    if (RunnableC1848.m6360()) {
                        iM3169 = C0773.m3169("᩸۟") ^ i5;
                        i2 = ((iM3169 ^ i4) * (-20305)) ^ (-510636497);
                        i3 = -614609610;
                    } else {
                        iM3169 = (C0619.m2761("ܰۜ") + i4) * q.h;
                        i2 = ((iM3169 ^ i5) * (-14981)) ^ 27090901;
                        i3 = -485607124;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -525447213:
                case 1946155078:
                    i14 = i14;
                    arrayList = this.f32497;
                    if (this.f32504) {
                        iM3169 = C0619.m2761("ۛۚ") ^ i4;
                        i2 = ((iM3169 ^ i5) * (-32043)) ^ 653321547;
                        i3 = -869724085;
                    } else {
                        i12 = i11;
                        iM3169 = C0619.m2761("ۧܿ") ^ i5;
                        i2 = ((iM3169 ^ i4) * 29789) ^ 434170707;
                        i3 = 500413565;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -414877650:
                case 628289918:
                    i14 = i14;
                    if (this.f32504) {
                        iM3169 = (C0773.m3169("֫ܺ") + i5) * (-39);
                        i2 = ((iM3169 ^ i4) * 27205) ^ 651502567;
                        i3 = 1873172510;
                    } else {
                        i8 = i;
                        iM3169 = C0773.m3169("ۗۡ") ^ i4;
                        i2 = ((iM3169 ^ i5) * (-22351)) ^ 670500607;
                        i3 = 1694759756;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case -78529317:
                case 527240163:
                    i14 = i14;
                    if (C2485.m8357() <= 0) {
                        iM3169 = (C0619.m2761("ܰۜ") + i4) * q.h;
                        i2 = ((iM3169 ^ i5) * (-14981)) ^ 27090901;
                        i3 = -485607124;
                    } else {
                        iM3169 = (C0773.m3169("֡۬") + i4) * (-7);
                        i2 = ((iM3169 ^ i5) * (-77)) ^ 298519504;
                        i3 = 1349756808;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case 39887780:
                case 1419810446:
                    i14 = i14;
                    this.f32496 += z ? 1 : 0;
                    iM3169 = (C0773.m3169("ۤۘ") + i4) * 123;
                    i2 = ((iM3169 ^ i5) * (-18209)) ^ (-1269272171);
                    i3 = 1171900536;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case 66328107:
                case 299742687:
                    i14 = i14;
                    if (((C11636) C3690.m11990(this.f32497, i8)).m29232()) {
                        iM3169 = (C0773.m3169("ᩴ۟") ^ i5) * (-81);
                        i2 = ((iM3169 ^ i4) * 22653) ^ 532341688;
                        i3 = -1542111861;
                    } else {
                        iM3169 = C0773.m3169("᩶ܳ") ^ i4;
                        i2 = ((iM3169 ^ i5) * (-557)) ^ 1954694294;
                        i3 = 316275978;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case 207081114:
                case 821948038:
                    return false;
                case 939118116:
                case 1991027458:
                    i14 = i14;
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (i4 - C0773.m3169("ܿ᩸")) * 21;
                        i2 = ((iM3169 ^ i5) * (-29417)) ^ 1325118987;
                        i3 = -1607622007;
                    } else {
                        iM3169 = (C0773.m3169("ᩳۨ") + i5) * 75;
                        i2 = ((iM3169 ^ i4) * (-31619)) ^ (-379050875);
                        i3 = -587316845;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case 1551186139:
                case 1652722087:
                    i11++;
                    iM3169 = C0773.m3169("ۚܰ") ^ i5;
                    i2 = ((iM3169 ^ i4) * (-17455)) ^ 897761763;
                    i3 = -1765173556;
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                case 2056144637:
                case 2141170645:
                    i14 = i14;
                    if (C2878.f9462) {
                        iM3169 = C0619.m2761("ܽۗ") ^ i5;
                        i2 = ((iM3169 ^ i4) * 6995) ^ 598593265;
                        i3 = 322937854;
                    } else {
                        iM3169 = (C0619.m2761("۠᩵") ^ i4) * 5;
                        i2 = ((iM3169 ^ i5) * 25375) ^ (-804886269);
                        i3 = -1125606751;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
                default:
                    i14 = i14;
                    if (c11636.m29228(z)) {
                        iM3169 = C0773.m3169("ܰᩴ") ^ i5;
                        i2 = ((iM3169 ^ i4) * 2991) ^ 1598240945;
                        i3 = -653915128;
                    } else {
                        iM3169 = (C0773.m3169("ۤۘ") + i4) * 123;
                        i2 = ((iM3169 ^ i5) * (-18209)) ^ (-1269272171);
                        i3 = 1171900536;
                    }
                    i7 = iM3169 ^ i3;
                    i6 = i2;
                    i13 = i14;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x006f  */
    /* JADX WARN: Code duplicated, block: B:48:0x01aa A[PHI: r8
      0x01aa: PHI (r8v5 java.lang.String) = (r8v4 java.lang.String), (r8v2 java.lang.String), (r8v2 java.lang.String) binds: [B:47:0x01a8, B:16:0x008c, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0205 A[PHI: r7
      0x0205: PHI (r7v4 java.lang.String) = (r7v3 java.lang.String), (r7v2 java.lang.String), (r7v2 java.lang.String), (r7v2 java.lang.String) binds: [B:55:0x0203, B:51:0x01e3, B:18:0x0090, B:16:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02bc A[PHI: r3 r10 r11 r13 r15 r22
      0x02bc: PHI (r3v4 android.view.MenuInflater) = 
      (r3v2 android.view.MenuInflater)
      (r3v3 android.view.MenuInflater)
      (r3v2 android.view.MenuInflater)
      (r3v2 android.view.MenuInflater)
     binds: [B:70:0x02ba, B:59:0x023f, B:35:0x0132, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x02bc: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:70:0x02ba, B:59:0x023f, B:35:0x0132, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x02bc: PHI (r11v4 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]) binds: [B:70:0x02ba, B:59:0x023f, B:35:0x0132, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x02bc: PHI (r13v4 short) = (r13v3 short), (r13v2 short), (r13v2 short), (r13v2 short) binds: [B:70:0x02ba, B:59:0x023f, B:35:0x0132, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x02bc: PHI (r15v4 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:70:0x02ba, B:59:0x023f, B:35:0x0132, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x02bc: PHI (r22v5 short) = (r22v4 short), (r22v3 short), (r22v3 short), (r22v3 short) binds: [B:70:0x02ba, B:59:0x023f, B:35:0x0132, B:9:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x02e6 A[PHI: r4 r5 r9 r16 r17
      0x02e6: PHI (r4v5 int) = (r4v4 int), (r4v2 int), (r4v2 int), (r4v2 int) binds: [B:43:0x0181, B:39:0x015b, B:31:0x010d, B:6:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r5v4 l.֨۠֫) = (r5v2 l.֨۠֫), (r5v3 l.֨۠֫), (r5v2 l.֨۠֫), (r5v2 l.֨۠֫) binds: [B:43:0x0181, B:39:0x015b, B:31:0x010d, B:6:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r9v5 int) = (r9v2 int), (r9v2 int), (r9v4 int), (r9v2 int) binds: [B:43:0x0181, B:39:0x015b, B:31:0x010d, B:6:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r16v3 short[]) = (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v5 short[]) binds: [B:43:0x0181, B:39:0x015b, B:31:0x010d, B:6:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r17v3 char) = (r17v2 char), (r17v2 char), (r17v2 char), (r17v5 char) binds: [B:43:0x0181, B:39:0x015b, B:31:0x010d, B:6:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        int iM2761;
        int i;
        int i2;
        int i3 = C2354.f7599;
        int i4 = C2966.f9654;
        int iM3169 = (C0773.m3169("֫ۢ") ^ i3) * 123;
        int i5 = ((iM3169 ^ i4) * 30391) ^ 265089956;
        String strM3780 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM3169 ^ (-1191804319);
        MenuInflater menuInflater = null;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        char c = 0;
        int i9 = 1692120479;
        short s2 = 0;
        String strM11809 = null;
        short[] sArr3 = null;
        int iM31610 = 0;
        MenuItem menuItemM5411 = null;
        C1038 c1038 = null;
        int iM2762 = 0;
        while (true) {
            i9 = i6 ^ (i5 & (((i9 ^ i4) * 11681) >> 31));
            switch (i9) {
                case -2100115936:
                case 238059184:
                    C2310.m7813();
                    C2966.m9664();
                    return false;
                case -2014252715:
                case 1745322944:
                    menuInflater.inflate(C0619.m2761(strM11809) ^ 2099883512, menu);
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0619.m2761("۬ۛ") ^ i3;
                        i = ((iM2761 ^ i4) * 26643) ^ 327950308;
                        i2 = -1638880689;
                    } else {
                        iM2761 = C0619.m2761("ܿ᩻") ^ i3;
                        i = ((iM2761 ^ i4) * 14029) ^ 1792837614;
                        i2 = -64588592;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1575750159:
                case 1816561244:
                    strM3780 = C0950.m3780(f32484, 182, 3, i8);
                    if (C1826.m6301() >= 0) {
                        iM2761 = C0619.m2761("ܳܽ") ^ i4;
                        i = ((iM2761 ^ i3) * (-20573)) ^ (-241261964);
                        i2 = -757236555;
                    } else {
                        iM2761 = C0773.m3169("ۘۧ") ^ i4;
                        i = ((iM2761 ^ i3) * (-23809)) ^ (-153630311);
                        i2 = -1449182873;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1565334908:
                case 2023949485:
                    s2 = sArr3[c];
                    s = 7414;
                    if (C1519.f5300 >= 0) {
                        iM2761 = C0619.m2761("ۘ᩸") ^ i3;
                        i = ((iM2761 ^ i4) * 29705) ^ 604648083;
                        i2 = 1849109081;
                    } else {
                        iM2761 = C0619.m2761("᩵ۢ") ^ i3;
                        i = ((iM2761 ^ i4) * (-19841)) ^ 508568375;
                        i2 = -1097652151;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1397321703:
                case 319827879:
                    C3448.m11248();
                    if (C20932.f66974 > 0) {
                        iM2761 = C0619.m2761("۬ۛ") ^ i3;
                        i = ((iM2761 ^ i4) * 26643) ^ 327950308;
                        i2 = -1638880689;
                    } else {
                        iM2761 = C0619.m2761("ܳܽ") ^ i4;
                        i = ((iM2761 ^ i3) * (-20573)) ^ (-241261964);
                        i2 = -757236555;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1392498111:
                case 787487444:
                    if ((s2 * s) - ((s2 * s2) + 13741849) > 0) {
                        iM2761 = (i4 - C0619.m2761("ᩴ᩺")) * (-77);
                        i = ((iM2761 ^ i3) * (-31863)) ^ 1357396929;
                        i2 = 1117609349;
                    } else {
                        iM2761 = C0619.m2761("۠ܳ") ^ i3;
                        i = ((iM2761 ^ i4) * (-17881)) ^ (-830242416);
                        i2 = 1499521762;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1316043045:
                case 1376658298:
                    if (C13473.m33144()) {
                        iM2761 = (C0619.m2761("᩶ۨ") + i4) * (-35);
                        i = ((iM2761 ^ i3) * 24975) ^ (-61264703);
                        i2 = -1759055578;
                    } else {
                        iM2761 = C0619.m2761("ۘ᩸") ^ i3;
                        i = ((iM2761 ^ i4) * 29705) ^ 604648083;
                        i2 = 1849109081;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1305618132:
                case 304384603:
                    menuInflater = getMenuInflater();
                    sArr = f32484;
                    i7 = 179;
                    if (C1146.m4231()) {
                        iM2761 = C0773.m3169("֨ܳ") ^ i3;
                        i = ((iM2761 ^ i4) * (-14851)) ^ 299524374;
                        i2 = 1719734046;
                    } else {
                        iM2761 = C0619.m2761("ۘ᩸") ^ i3;
                        i = ((iM2761 ^ i4) * 29705) ^ 604648083;
                        i2 = 1849109081;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1159660268:
                case 503404737:
                    MenuItem menuItemM2062 = RunnableC0334.m2062(menu, iM2762);
                    C1321.m4848(menuItemM2062);
                    c1038 = new C1038(1, menuItemM2062);
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0773.m3169("ۘ֫") ^ i3;
                        i = ((iM2761 ^ i4) * 22589) ^ 86833697;
                        i2 = -1032916167;
                    } else {
                        iM2761 = (C0619.m2761("۬ۙ") + i3) * 81;
                        i = ((iM2761 ^ i4) * (-28993)) ^ 782057358;
                        i2 = 1180614873;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -922732767:
                case 1215874737:
                    i8 = 53020;
                    iM2761 = (C0619.m2761("᩻֫") + i4) * 67;
                    i = ((iM2761 ^ i3) * 31315) ^ 1595340860;
                    i2 = 839753698;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -820795023:
                case -27800215:
                    if (RunnableC3055.m9933() != 0) {
                        iM2761 = C0619.m2761("ܳܽ") ^ i4;
                        i = ((iM2761 ^ i3) * (-20573)) ^ (-241261964);
                        i2 = -757236555;
                    } else {
                        iM2761 = (C0619.m2761("᩶ۨ") + i4) * (-35);
                        i = ((iM2761 ^ i3) * 24975) ^ (-61264703);
                        i2 = -1759055578;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -439933917:
                case 1338138396:
                    C3998.m12920();
                    C3998.m12920();
                    iM2761 = C0619.m2761("۬ۛ") ^ i3;
                    i = ((iM2761 ^ i4) * 26643) ^ 327950308;
                    i2 = -1638880689;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -386410796:
                case -310598680:
                    C2310.m7810(this.f32488, this, c1038);
                    sArr2 = f32484;
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0619.m2761("ۘ᩸") ^ i3;
                        i = ((iM2761 ^ i4) * 29705) ^ 604648083;
                        i2 = 1849109081;
                    } else {
                        iM2761 = C0619.m2761("ۗ۫") ^ i4;
                        i = ((iM2761 ^ i3) * (-31851)) ^ (-67613604);
                        i2 = -652542525;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -221042214:
                case 707781967:
                    menuItemM5411 = C1519.m5411(menu, 2129795197 ^ iM31610);
                    if (mo26247()) {
                        iM2761 = (i3 - C0619.m2761("ۙۧ")) * (-125);
                        i = ((iM2761 ^ i4) * (-21227)) ^ (-580660169);
                        i2 = -1670758407;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ᩴ۠")) * (-59);
                        i = ((iM2761 ^ i3) * 2383) ^ 2001683716;
                        i2 = -1968105696;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -152981499:
                case 311905899:
                    strM11809 = RunnableC3646.m11809(sArr, i7, 3, i8);
                    if (C2419.f7754 >= 0) {
                        iM2761 = C0619.m2761("۬ۛ") ^ i3;
                        i = ((iM2761 ^ i4) * 26643) ^ 327950308;
                        i2 = -1638880689;
                    } else {
                        iM2761 = (C0773.m3169("ۙۙ") ^ i4) * (-117);
                        i = ((iM2761 ^ i3) * (-9977)) ^ 424995106;
                        i2 = 1489068417;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -51544286:
                case 1837629836:
                    i8 = 7412;
                    iM2761 = (C0619.m2761("᩻֫") + i4) * 67;
                    i = ((iM2761 ^ i3) * 31315) ^ 1595340860;
                    i2 = 839753698;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 25320026:
                case 1088231251:
                    C2485.m8349(menuItemM5411, false);
                    iM2761 = C0773.m3169("᩵᩻") ^ i4;
                    i = ((iM2761 ^ i3) * (-28855)) ^ (-930392477);
                    i2 = -2130914093;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 89363094:
                case 880813995:
                    iM2762 = 2098818435 ^ C0619.m2761(strM3780);
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0773.m3169("ۘ֫") ^ i3;
                        i = ((iM2761 ^ i4) * 22589) ^ 86833697;
                        i2 = -1032916167;
                    } else {
                        iM2761 = C0619.m2761("۠ܰ") ^ i3;
                        i = ((iM2761 ^ i4) * 14941) ^ 338221762;
                        i2 = -1906209535;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 501243830:
                case 936917768:
                    return true;
                case 502031839:
                case 1229811489:
                    AbstractC0641.m2818(menuItemM5411, this.f32500);
                    iM2761 = C0773.m3169("᩵᩻") ^ i4;
                    i = ((iM2761 ^ i3) * (-28855)) ^ (-930392477);
                    i2 = -2130914093;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1141236468:
                case 1930758811:
                    iM31610 = C0773.m3169(C2702.m8881(sArr2, 185, 3, i8));
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = C0773.m3169("ۘ֫") ^ i3;
                        i = ((iM2761 ^ i4) * 22589) ^ 86833697;
                        i2 = -1032916167;
                    } else {
                        iM2761 = (C0773.m3169("᩵ۤ") ^ i3) * (-35);
                        i = ((iM2761 ^ i4) * 8895) ^ 1455194645;
                        i2 = -1331479143;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                default:
                    sArr3 = f32484;
                    c = 178;
                    if (C2287.f7432 >= 0) {
                        iM2761 = C0773.m3169("ۘ֫") ^ i3;
                        i = ((iM2761 ^ i4) * 22589) ^ 86833697;
                        i2 = -1032916167;
                    } else {
                        iM2761 = (C0619.m2761("᩶ۡ") ^ i4) * 43;
                        i = ((iM2761 ^ i3) * (-26771)) ^ 1527189345;
                        i2 = 461231189;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b5 A[PHI: r3 r14 r15
      0x00b5: PHI (r3v4 int) = (r3v3 int), (r3v2 int) binds: [B:26:0x00b3, B:15:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x00b5: PHI (r14v4 short[]) = (r14v3 short[]), (r14v2 short[]) binds: [B:26:0x00b3, B:15:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x00b5: PHI (r15v4 int) = (r15v3 int), (r15v2 int) binds: [B:26:0x00b3, B:15:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x01c3 A[PHI: r1 r9 r11 r12 r13
      0x01c3: PHI (r1v4 l.ۢ֫ܺ) = (r1v2 l.ۢ֫ܺ), (r1v3 l.ۢ֫ܺ), (r1v2 l.ۢ֫ܺ), (r1v2 l.ۢ֫ܺ), (r1v2 l.ۢ֫ܺ) binds: [B:50:0x01c1, B:39:0x0148, B:35:0x0124, B:12:0x005f, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:50:0x01c1, B:39:0x0148, B:35:0x0124, B:12:0x005f, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r11v4 short[]) = (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:50:0x01c1, B:39:0x0148, B:35:0x0124, B:12:0x005f, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:50:0x01c1, B:39:0x0148, B:35:0x0124, B:12:0x005f, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:50:0x01c1, B:39:0x0148, B:35:0x0124, B:12:0x005f, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0215 A[PHI: r2 r6
      0x0215: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v4 java.lang.String) binds: [B:58:0x0213, B:22:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x0215: PHI (r6v4 int) = (r6v3 int), (r6v2 int) binds: [B:58:0x0213, B:22:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x025f A[PHI: r21
      0x025f: PHI (r21v4 char) = (r21v3 char), (r21v5 char) binds: [B:9:0x0059, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0293 A[PHI: r5 r7 r8 r16
      0x0293: PHI (r5v4 short) = (r5v2 short), (r5v3 short), (r5v2 short), (r5v2 short), (r5v2 short), (r5v2 short) binds: [B:68:0x0291, B:62:0x0247, B:54:0x01f5, B:17:0x006c, B:15:0x0068, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:68:0x0291, B:62:0x0247, B:54:0x01f5, B:17:0x006c, B:15:0x0068, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:68:0x0291, B:62:0x0247, B:54:0x01f5, B:17:0x006c, B:15:0x0068, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:68:0x0291, B:62:0x0247, B:54:0x01f5, B:17:0x006c, B:15:0x0068, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m26228(AbstractActivityC10144 abstractActivityC10144) {
        int iM3169;
        int i;
        int i2;
        int i3 = C0950.f3488;
        int i4 = C2354.f7599;
        int iM31610 = C0773.m3169("֨ۤ") ^ i4;
        int i5 = ((iM31610 ^ i3) * (-22091)) ^ 46944485;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM31610 ^ (-1723308355);
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = -320628766;
        char c = 0;
        String strM8166 = null;
        InterfaceC9801 interfaceC9801 = null;
        while (true) {
            i16 = i6 ^ (i5 & (((i16 ^ i3) * (-4191)) >> 31));
            switch (i16) {
                case -2122978930:
                case 612824448:
                    i8 = s + 6844;
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0773.m3169("ۧ᩷") ^ i3;
                        i = ((iM3169 ^ i4) * (-15953)) ^ 2056553566;
                        i2 = -1277097648;
                    } else {
                        iM3169 = C0773.m3169("ۗۘ") ^ i3;
                        i = ((iM3169 ^ i4) * 16517) ^ 66099117;
                        i2 = 242476284;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2062749382:
                case 474478538:
                    if (C2288.f7433 > 0) {
                        iM3169 = C0619.m2761("۠ۚ") ^ i4;
                        i = ((iM3169 ^ i3) * (-6847)) ^ (-1109624746);
                        i2 = 1393126570;
                    } else {
                        iM3169 = C0773.m3169("ۜ֡") ^ i3;
                        i = ((iM3169 ^ i4) * 7063) ^ (-1089464700);
                        i2 = -195801855;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1762828684:
                case 153671953:
                    sArr = f32484;
                    if (C2375.m8065() <= 0) {
                        iM3169 = C0619.m2761("۠ۚ") ^ i4;
                        i = ((iM3169 ^ i3) * (-6847)) ^ (-1109624746);
                        i2 = 1393126570;
                    } else {
                        iM3169 = C0773.m3169("᩹ۢ") ^ i3;
                        i = ((iM3169 ^ i4) * (-15925)) ^ (-668311163);
                        i2 = -333170405;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1755499184:
                case -1016480064:
                    C2966.m9664();
                    C20932.m47848();
                    break;
                case -1722243023:
                case 31094477:
                    i9 = i8 * i8;
                    i10 = s * s;
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0619.m2761("۠ۚ") ^ i4;
                        i = ((iM3169 ^ i3) * (-6847)) ^ (-1109624746);
                        i2 = 1393126570;
                    } else {
                        iM3169 = C0773.m3169("ۜܰ") ^ i3;
                        i = ((iM3169 ^ i4) * (-5829)) ^ (-781798714);
                        i2 = 1303023142;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1606205748:
                case -1049450756:
                    break;
                case -1204369289:
                case -742562018:
                    C3077.m10039(C0619.m2761(strM8166) ^ 2129357046);
                    iM3169 = C0619.m2761("ۜᩳ") ^ i4;
                    i = ((iM3169 ^ i3) * (-8701)) ^ 1910113329;
                    i2 = 1360150651;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -858524314:
                case 450339995:
                    interfaceC9801 = ApplicationC17729.f58258;
                    sArr2 = f32484;
                    i13 = 44;
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0773.m3169("ۜ֡") ^ i3;
                        i = ((iM3169 ^ i4) * 7063) ^ (-1089464700);
                        i2 = -195801855;
                    } else {
                        iM3169 = C0619.m2761("᩶ۧ") ^ i4;
                        i = ((iM3169 ^ i3) * 10827) ^ 131719216;
                        i2 = -1306389665;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -721355909:
                case 1992002265:
                    C6421.m18184(interfaceC9801, C0619.m2756(sArr2, i13, i14, i12), true);
                    if (abstractActivityC10144.m26224(true)) {
                        int iM31611 = C0773.m3169("ۨۧ") ^ i3;
                        i5 = ((iM31611 ^ i4) * 7807) ^ (-2123415091);
                        i6 = iM31611 ^ 1944097397;
                    } else {
                        iM3169 = C0619.m2761("ۜᩳ") ^ i4;
                        i = ((iM3169 ^ i3) * (-8701)) ^ 1910113329;
                        i2 = 1360150651;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    }
                    break;
                case -629029922:
                case -522970400:
                    i11 = 46840336;
                    if (AbstractC0641.m2813() <= 0) {
                        iM3169 = C0773.m3169("ۜ֡") ^ i3;
                        i = ((iM3169 ^ i4) * 7063) ^ (-1089464700);
                        i2 = -195801855;
                    } else {
                        iM3169 = C0619.m2761("ۙ᩵") ^ i4;
                        i = ((iM3169 ^ i3) * (-30685)) ^ (-1956701628);
                        i2 = -706088407;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -509042893:
                case 1669267816:
                    C0619.m2763();
                    if (C2023.f6737) {
                        iM3169 = C0773.m3169("֫ᩴ") ^ i4;
                        i = ((iM3169 ^ i3) * (-12247)) ^ 2087314343;
                        i2 = -1166361629;
                    } else {
                        iM3169 = C0619.m2761("۠ۚ") ^ i4;
                        i = ((iM3169 ^ i3) * (-6847)) ^ (-1109624746);
                        i2 = 1393126570;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -456402778:
                case 362586454:
                    sArr3 = f32484;
                    i15 = 87;
                    i7 = 3;
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0773.m3169("֫ᩴ") ^ i4;
                        i = ((iM3169 ^ i3) * (-12247)) ^ 2087314343;
                        i2 = -1166361629;
                    } else {
                        iM3169 = C0773.m3169("ۧۢ") ^ i4;
                        i = ((iM3169 ^ i3) * 22029) ^ 959873306;
                        i2 = -415765576;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -384386606:
                case 2002206451:
                    strM8166 = C2419.m8166(sArr3, i15, i7, i12);
                    if (C2288.m7767()) {
                        iM3169 = C0773.m3169("ۧ᩷") ^ i3;
                        i = ((iM3169 ^ i4) * (-15953)) ^ 2056553566;
                        i2 = -1277097648;
                    } else {
                        iM3169 = (C0773.m3169("ۚۚ") + i3) * 71;
                        i = ((iM3169 ^ i4) * (-3735)) ^ 1045314925;
                        i2 = 1055790058;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -252006435:
                case -114295236:
                    s = sArr[c];
                    if (C1321.m4852()) {
                        iM3169 = C0619.m2761("ۤۘ") ^ i4;
                        i = ((iM3169 ^ i3) * 9619) ^ (-1259286570);
                        i2 = -1259986844;
                    } else {
                        iM3169 = C0619.m2761("۠ۚ") ^ i4;
                        i = ((iM3169 ^ i3) * (-6847)) ^ (-1109624746);
                        i2 = 1393126570;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 356582462:
                case 447565831:
                    i12 = 21620;
                    iM3169 = C0773.m3169("ۖ֡") ^ i3;
                    i = ((iM3169 ^ i4) * 15427) ^ 1529615768;
                    i2 = -1912804548;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 574693886:
                case 685741697:
                    i14 = 43;
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0773.m3169("ۜ֡") ^ i3;
                        i = ((iM3169 ^ i4) * 7063) ^ (-1089464700);
                        i2 = -195801855;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ᩳܽ")) * (-63);
                        i = ((iM3169 ^ i4) * 31629) ^ (-1433610424);
                        i2 = -1146482597;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 581148401:
                case 1407511689:
                    i12 = 64712;
                    iM3169 = C0773.m3169("ۖ֡") ^ i3;
                    i = ((iM3169 ^ i4) * 15427) ^ 1529615768;
                    i2 = -1912804548;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 617246476:
                case 844157734:
                    if (C3448.f11240 < 0) {
                        iM3169 = C0773.m3169("ۜ֡") ^ i3;
                        i = ((iM3169 ^ i4) * 7063) ^ (-1089464700);
                        i2 = -195801855;
                    } else {
                        iM3169 = C0773.m3169("ܿܳ") ^ i4;
                        i = ((iM3169 ^ i3) * 17373) ^ (-1780404424);
                        i2 = -1943594610;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 706377818:
                case 1568104224:
                    C1542.m5459();
                    RunnableC0334.m2063();
                    iM3169 = C0619.m2761("۠ۚ") ^ i4;
                    i = ((iM3169 ^ i3) * (-6847)) ^ (-1109624746);
                    i2 = 1393126570;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1166611717:
                case 1821277249:
                    int i17 = i10 + i11;
                    if (i9 - (i17 + i17) > 0) {
                        iM3169 = (C0619.m2761("ۡۚ") + i3) * (-113);
                        i = ((iM3169 ^ i4) * (-29559)) ^ 1122032714;
                        i2 = 1344310197;
                    } else {
                        iM3169 = (C0773.m3169("᩶ܺ") + i4) * (-69);
                        i = ((iM3169 ^ i3) * 15281) ^ 1879220936;
                        i2 = 933101421;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    c = '+';
                    if (C3099.f10023 <= 0) {
                        iM3169 = C0773.m3169("ܿܳ") ^ i4;
                        i = ((iM3169 ^ i3) * 17373) ^ (-1780404424);
                        i2 = -1943594610;
                    } else {
                        iM3169 = (C0773.m3169("᩺ܶ") + i4) * (-119);
                        i = ((iM3169 ^ i3) * (-29743)) ^ (-797968351);
                        i2 = 287310897;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0148  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r31v42 */
    /* JADX WARN: Type inference failed for: r31v43 */
    /* JADX WARN: Type inference failed for: r31v44 */
    /* JADX WARN: Type inference failed for: r31v45 */
    /* JADX WARN: Type inference failed for: r31v46 */
    /* JADX WARN: Type inference failed for: r31v58 */
    /* JADX WARN: Type inference failed for: r31v59 */
    /* JADX WARN: Type inference failed for: r31v60 */
    /* JADX WARN: Type inference failed for: r31v61 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.util.AttributeSet, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        DialogInterfaceOnClickListenerC3433 dialogInterfaceOnClickListenerC3433;
        String strM6246;
        int i;
        C3054 c3054;
        int i2;
        DialogInterfaceOnClickListenerC21269 dialogInterfaceOnClickListenerC21269;
        String str;
        int i3;
        DialogInterfaceOnClickListenerC21269 dialogInterfaceOnClickListenerC212610;
        int i4;
        String str2;
        int iM2761;
        int i5;
        int i6;
        int iM2762;
        int iM2763;
        int i7;
        int i8;
        String str3;
        int iM2764;
        int i9;
        int i10;
        int i11;
        short[] sArr;
        short[] sArr2;
        int i12;
        short[] sArr3;
        DialogInterfaceOnClickListenerC21269 dialogInterfaceOnClickListenerC212611;
        int i13;
        int iM3169;
        int i14;
        int i15;
        int iM31610;
        int i16;
        int i17;
        int i18;
        int iM31611;
        int i19;
        String strM6247;
        int i20;
        DialogInterfaceOnClickListenerC3433 dialogInterfaceOnClickListenerC3434;
        DialogInterfaceOnClickListenerC21760 dialogInterfaceOnClickListenerC21760;
        C10467 c10467;
        int i21;
        short[] sArr4;
        int i22;
        short[] sArr5;
        DialogInterfaceOnClickListenerC21269 dialogInterfaceOnClickListenerC212612;
        int i23;
        C2361 c2361;
        int iM2765;
        int iM31612;
        int i24;
        int i25;
        DialogInterfaceOnClickListenerC3433 dialogInterfaceOnClickListenerC3435;
        C2361 c2362;
        C10467 c10468;
        int i26;
        short[] sArr6;
        DialogInterfaceOnClickListenerC21269 dialogInterfaceOnClickListenerC212613;
        int iM31613;
        int i27;
        int i28;
        int i29;
        int i30;
        DialogInterfaceOnClickListenerC21269 dialogInterfaceOnClickListenerC212614;
        int iM31614;
        int i31;
        int i32;
        int iM31615;
        int i33;
        int i34;
        int i35;
        int iM31616;
        int i36;
        int i37;
        ?? r8;
        ?? r31;
        int iM2766;
        int i38;
        int i39;
        AbstractActivityC10144 abstractActivityC10144 = this;
        int i40 = 400570179;
        int i41 = AbstractC3624.f12429;
        int i42 = RunnableC3055.f9898;
        int iM2767 = (C0619.m2761("᩹᩻") ^ i41) * (-93);
        int i43 = ((iM2767 ^ i42) * 24403) ^ (-1610885916);
        int i44 = iM2767 ^ 1657366426;
        DialogInterfaceOnClickListenerC21760 dialogInterfaceOnClickListenerC21761 = null;
        String str4 = null;
        C3054 c3055 = null;
        C2361 c2363 = null;
        DialogInterfaceOnClickListenerC21269 dialogInterfaceOnClickListenerC212615 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        short[] sArr12 = null;
        int iM8344 = 0;
        boolean z = false;
        boolean z2 = false;
        int i45 = 0;
        int i46 = 0;
        int iM2768 = 0;
        int i47 = 0;
        int i48 = 0;
        int iM2769 = 0;
        int iM31617 = 0;
        int i49 = 0;
        int i50 = 0;
        int i51 = 0;
        int i52 = 0;
        C10467 c10469 = null;
        String str5 = null;
        DialogInterfaceOnClickListenerC3433 dialogInterfaceOnClickListenerC3436 = null;
        int i53 = 0;
        C2361 c2364 = null;
        ?? r9 = 0;
        int i54 = 0;
        while (true) {
            i40 = i44 ^ (i43 & (((i40 ^ i42) * (-17411)) >> 31));
            switch (i40) {
                case -2124187179:
                case 1192049881:
                    C10467 c104610 = c10469;
                    c104610.setAdapter((SpinnerAdapter) c3055);
                    c104610.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    c104610.setSelection(abstractActivityC10144.f32489);
                    new C24317(abstractActivityC10144, abstractActivityC10144, abstractActivityC10144.f32504, c104610);
                    return z;
                case -2121308659:
                case -542445552:
                    C13677.m33453(abstractActivityC10144, new RunnableC12350(z ? 1 : 0, abstractActivityC10144));
                    return z;
                case -2106048123:
                case -142693517:
                    C2361 c2365 = c2364;
                    C3492.m11487(c2365, C0773.m3169(C11235.m28300(sArr8, i51, i52, i45)) ^ 2129616506, dialogInterfaceOnClickListenerC21761);
                    RunnableC1848.m6359(c2365, i54, r9);
                    C1321.m4860(c2365);
                    return z;
                case -2059003738:
                case 1396389849:
                    return z2;
                case -2025823129:
                case -941140759:
                    C2419.m8168(c2363, C0619.m2761(C0269.m1785(sArr11, i46, i53, i45)) ^ 2127836176, dialogInterfaceOnClickListenerC212615);
                    i54 = i54;
                    C3033.m9848(c2363, i54, r9);
                    dialogInterfaceOnClickListenerC3436 = new DialogInterfaceOnClickListenerC3433(z2 ? 1 : 0, abstractActivityC10144);
                    sArr12 = f32484;
                    if (C2485.f7950 != 0) {
                        iM31615 = (C0773.m3169("ܶܿ") ^ i41) * 51;
                        i33 = ((iM31615 ^ i42) * 5733) ^ (-2012070996);
                        i34 = -1226537065;
                    } else {
                        iM31615 = C0773.m3169("ܳۤ") ^ i42;
                        i33 = ((iM31615 ^ i41) * (-12263)) ^ 1367529089;
                        i34 = -934523884;
                    }
                    i44 = iM31615 ^ i34;
                    i43 = i33;
                    break;
                case -1967231165:
                case -1380874098:
                    i54 = i54;
                    if (abstractActivityC10144.f32493 == null) {
                        iM2766 = C0619.m2761("ܺ᩻") ^ i42;
                        i38 = ((iM2766 ^ i41) * 15029) ^ 1208202570;
                        i39 = 1412979541;
                    } else {
                        iM2766 = C0619.m2761("ۢ᩸") ^ i42;
                        i38 = ((iM2766 ^ i41) * (-22755)) ^ 1323364072;
                        i39 = 1335422552;
                    }
                    i44 = iM2766 ^ i39;
                    i43 = i38;
                    i54 = i54;
                    break;
                case -1955116595:
                case -1738826991:
                    DialogInterfaceOnClickListenerC3433 dialogInterfaceOnClickListenerC3437 = dialogInterfaceOnClickListenerC3436;
                    C2361 c2366 = c2364;
                    DialogInterfaceOnClickListenerC21760 dialogInterfaceOnClickListenerC21762 = dialogInterfaceOnClickListenerC21761;
                    C10467 c104611 = c10469;
                    int i55 = i50;
                    short[] sArr13 = sArr8;
                    int i56 = i51;
                    short[] sArr14 = sArr9;
                    DialogInterfaceOnClickListenerC21269 dialogInterfaceOnClickListenerC212616 = dialogInterfaceOnClickListenerC212615;
                    int i57 = i52;
                    String str6 = str4;
                    str5 = str5;
                    i49 = i49;
                    c3055 = c3055;
                    str3 = str6;
                    short[] sArr15 = sArr7;
                    int iM27610 = C0619.m2761(C23916.m53420(sArr15, 204, 3, i45)) ^ 2121231097;
                    int i58 = iM2768;
                    if (iM8344 == i58) {
                        int iM31618 = C0773.m3169("᩸ܰ") ^ i42;
                        sArr7 = sArr15;
                        i52 = i57;
                        sArr8 = sArr13;
                        sArr9 = sArr14;
                        dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212616;
                        i50 = i55;
                        i51 = i56;
                        i54 = iM27610;
                        i43 = ((iM31618 ^ i41) * (-6177)) ^ (-1654255229);
                        c10469 = c104611;
                        dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21762;
                        dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3437;
                        c2364 = c2366;
                        r9 = 0;
                        i44 = iM31618 ^ (-1233306643);
                        iM2768 = i58;
                    } else {
                        int iM31619 = (C0773.m3169("ۖܺ") + i41) * 73;
                        i43 = ((iM31619 ^ i42) * (-23435)) ^ (-975901024);
                        sArr7 = sArr15;
                        i52 = i57;
                        i54 = iM27610;
                        sArr8 = sArr13;
                        sArr9 = sArr14;
                        dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212616;
                        i50 = i55;
                        i51 = i56;
                        iM2768 = i58;
                        c10469 = c104611;
                        dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21762;
                        dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3437;
                        c2364 = c2366;
                        i44 = iM31619 ^ 811556433;
                        r9 = 0;
                    }
                    C3054 c3056 = c3055;
                    i49 = i49;
                    str5 = str5;
                    str4 = str3;
                    c3055 = c3056;
                    break;
                case -1949470921:
                case -1434762947:
                    C1321.m4852();
                    if (!C0862.m3503()) {
                        iM31615 = (C0773.m3169("ܶܿ") ^ i41) * 51;
                        i33 = ((iM31615 ^ i42) * 5733) ^ (-2012070996);
                        i34 = -1226537065;
                        i44 = iM31615 ^ i34;
                        i43 = i33;
                    } else {
                        i10 = i54;
                        dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                        c2364 = c2364;
                        dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21761;
                        c10469 = c10469;
                        i11 = i50;
                        sArr2 = sArr8;
                        i12 = i51;
                        sArr3 = sArr9;
                        dialogInterfaceOnClickListenerC212611 = dialogInterfaceOnClickListenerC212615;
                        i13 = i52;
                        String str7 = str4;
                        str5 = str5;
                        i49 = i49;
                        c3055 = c3055;
                        str3 = str7;
                        iM31611 = (C0773.m3169("֫ܳ") + i41) * (-103);
                        i16 = ((iM31611 ^ i42) * 475) ^ 11660973;
                        i19 = 1230056426;
                        i18 = iM31611 ^ i19;
                        i52 = i13;
                        sArr8 = sArr2;
                        sArr9 = sArr3;
                        dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212611;
                        i50 = i11;
                        i51 = i12;
                        i54 = i10;
                        c10469 = c10469;
                        dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21761;
                        dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                        c2364 = c2364;
                        i44 = i18;
                        i43 = i16;
                        r9 = r9;
                        C3054 c3057 = c3055;
                        i49 = i49;
                        str5 = str5;
                        str4 = str3;
                        c3055 = c3057;
                    }
                    break;
                case -1939806375:
                case 27508906:
                    if (!C2023.f6737) {
                        i3 = i50;
                        dialogInterfaceOnClickListenerC212610 = dialogInterfaceOnClickListenerC212615;
                        str2 = str5;
                        i4 = i49;
                        int iM27611 = (C0619.m2761("֫ۘ") ^ i41) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i44 = iM27611 ^ (-1927485639);
                        i43 = ((iM27611 ^ i42) * (-2211)) ^ (-1947817949);
                        c10469 = c10469;
                        i49 = i4;
                        str5 = str2;
                        dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                        str4 = str4;
                        dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212610;
                        i50 = i3;
                    } else {
                        dialogInterfaceOnClickListenerC3435 = dialogInterfaceOnClickListenerC3436;
                        c2362 = c2364;
                        c10468 = c10469;
                        i26 = i50;
                        sArr6 = sArr9;
                        dialogInterfaceOnClickListenerC212613 = dialogInterfaceOnClickListenerC212615;
                        String str8 = str4;
                        str5 = str5;
                        i49 = i49;
                        c3055 = c3055;
                        str3 = str8;
                        int iM27612 = (C0619.m2761("᩻ۡ") ^ i41) * 115;
                        i44 = iM27612 ^ 1572607642;
                        c2364 = c2362;
                        i43 = ((iM27612 ^ i42) * (-31037)) ^ 2021730708;
                        sArr9 = sArr6;
                        dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212613;
                        i50 = i26;
                        c10469 = c10468;
                        dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3435;
                        r9 = r9;
                        C3054 c3058 = c3055;
                        i49 = i49;
                        str5 = str5;
                        str4 = str3;
                        c3055 = c3058;
                    }
                    break;
                case -1889170555:
                case 971354292:
                    C2966.m9668(iM31617);
                    return z;
                case -1885912365:
                case -1766109170:
                    C0773.m3161();
                    if (AbstractC0116.f1064 > 0) {
                        iM31615 = C0619.m2761("ܺۗ") ^ i41;
                        i33 = ((iM31615 ^ i42) * 32329) ^ (-1261997130);
                        i34 = -1515103074;
                    } else {
                        iM31615 = C0619.m2761("ۙۚ") ^ i42;
                        i33 = ((iM31615 ^ i41) * 31073) ^ 472289475;
                        i34 = 483315901;
                    }
                    i44 = iM31615 ^ i34;
                    i43 = i33;
                    break;
                case -1863578486:
                case -1493758056:
                    C17202.m40371(C0619.m2761(C2354.m7980(f32484, 207, 3, i45)) ^ 2099382755);
                    return z;
                case -1826395097:
                case -959808217:
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                    C2361 c2367 = c2364;
                    dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21761;
                    c10469 = c10469;
                    i11 = i50;
                    sArr2 = sArr8;
                    i12 = i51;
                    sArr3 = sArr9;
                    dialogInterfaceOnClickListenerC212611 = dialogInterfaceOnClickListenerC212615;
                    i13 = i52;
                    String str9 = str4;
                    str5 = str5;
                    i49 = i49;
                    c3055 = c3055;
                    str3 = str9;
                    C2485.m8345(c2367, i47 ^ i48);
                    c2364 = c2367;
                    i10 = i54;
                    iM2769 = C0619.m2761(C3448.m11252(f32484, 216, 3, i45));
                    if (C1146.f4234 >= 0) {
                        iM31611 = (C0773.m3169("֫ܳ") + i41) * (-103);
                        i16 = ((iM31611 ^ i42) * 475) ^ 11660973;
                        i19 = 1230056426;
                    } else {
                        iM31611 = (C0619.m2761("۟᩸") + i41) * (-81);
                        i16 = ((iM31611 ^ i42) * 17711) ^ 1805956425;
                        i19 = -1516181475;
                    }
                    i18 = iM31611 ^ i19;
                    i52 = i13;
                    sArr8 = sArr2;
                    sArr9 = sArr3;
                    dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212611;
                    i50 = i11;
                    i51 = i12;
                    i54 = i10;
                    c10469 = c10469;
                    dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21761;
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                    c2364 = c2364;
                    i44 = i18;
                    i43 = i16;
                    r9 = r9;
                    C3054 c3059 = c3055;
                    i49 = i49;
                    str5 = str5;
                    str4 = str3;
                    c3055 = c3059;
                    break;
                case -1798896048:
                case -1739767304:
                    str3 = str4;
                    i45 = 25229;
                    iM2764 = C0773.m3169("ۛۙ") ^ i41;
                    i43 = ((iM2764 ^ i42) * (-7523)) ^ (-472944474);
                    i9 = 1244522089;
                    i15 = iM2764 ^ i9;
                    sArr7 = sArr7;
                    i52 = i52;
                    sArr8 = sArr8;
                    sArr9 = sArr9;
                    dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212615;
                    i50 = i50;
                    i51 = i51;
                    i54 = i54;
                    z = z;
                    c10469 = c10469;
                    dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21761;
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                    c2364 = c2364;
                    i44 = i15;
                    abstractActivityC10144 = this;
                    r9 = r9;
                    C3054 c30510 = c3055;
                    i49 = i49;
                    str5 = str5;
                    str4 = str3;
                    c3055 = c30510;
                    break;
                case -1777919782:
                case -1518012918:
                    abstractActivityC10144.f32497 = abstractActivityC10144.f32493;
                    iM2766 = (C0619.m2761("ۨᩳ") + i41) * 23;
                    i38 = ((iM2766 ^ i42) * (-32113)) ^ 707486066;
                    i39 = 1893638492;
                    i44 = iM2766 ^ i39;
                    i43 = i38;
                    i54 = i54;
                    break;
                case -1769953393:
                case -1465287155:
                    i10 = i54;
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                    c2364 = c2364;
                    dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21761;
                    c10469 = c10469;
                    i11 = i50;
                    sArr2 = sArr8;
                    i12 = i51;
                    sArr3 = sArr9;
                    dialogInterfaceOnClickListenerC212611 = dialogInterfaceOnClickListenerC212615;
                    i13 = i52;
                    String str10 = str4;
                    str5 = str5;
                    i49 = i49;
                    c3055 = c3055;
                    str3 = str10;
                    if (iM8344 == (C0619.m2761(C3099.m10092(f32484, 210, 3, i45)) ^ 2120573278)) {
                        iM31611 = C0619.m2761("ۙۨ") ^ i41;
                        i16 = ((iM31611 ^ i42) * (-15565)) ^ 1368537637;
                        i19 = 1832155437;
                    } else {
                        iM31611 = (C0773.m3169("᩸۬") + i42) * (-63);
                        i16 = ((iM31611 ^ i41) * 25173) ^ 193824802;
                        i19 = -633395208;
                    }
                    i18 = iM31611 ^ i19;
                    i52 = i13;
                    sArr8 = sArr2;
                    sArr9 = sArr3;
                    dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212611;
                    i50 = i11;
                    i51 = i12;
                    i54 = i10;
                    c10469 = c10469;
                    dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21761;
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                    c2364 = c2364;
                    i44 = i18;
                    i43 = i16;
                    r9 = r9;
                    C3054 c30511 = c3055;
                    i49 = i49;
                    str5 = str5;
                    str4 = str3;
                    c3055 = c30511;
                    break;
                case -1728712936:
                case 1549989841:
                    i20 = i54;
                    dialogInterfaceOnClickListenerC3434 = dialogInterfaceOnClickListenerC3436;
                    dialogInterfaceOnClickListenerC21760 = dialogInterfaceOnClickListenerC21761;
                    c10467 = c10469;
                    i21 = i50;
                    sArr4 = sArr8;
                    i22 = i51;
                    sArr5 = sArr9;
                    dialogInterfaceOnClickListenerC212612 = dialogInterfaceOnClickListenerC212615;
                    i23 = i52;
                    String str11 = str4;
                    str5 = str5;
                    i49 = i49;
                    c3055 = c3055;
                    str3 = str11;
                    int i59 = DialogInterfaceC8327.f27315;
                    c2361 = new C2361(abstractActivityC10144);
                    iM2765 = C0619.m2761(C23916.m53420(f32484, 213, 3, i45));
                    i48 = 2124148747;
                    if (C2834.f9334 <= 0) {
                        iM31612 = C0619.m2761("᩺ܶ") ^ i42;
                        i24 = ((iM31612 ^ i41) * 23505) ^ (-443683456);
                        i25 = -109702702;
                    } else {
                        iM31612 = C0773.m3169("ᩳܽ") ^ i41;
                        i24 = ((iM31612 ^ i42) * (-20315)) ^ 752284276;
                        i25 = -657621817;
                    }
                    i44 = iM31612 ^ i25;
                    i52 = i23;
                    sArr8 = sArr4;
                    sArr9 = sArr5;
                    dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212612;
                    i50 = i21;
                    i51 = i22;
                    c10469 = c10467;
                    dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21760;
                    c2364 = c2361;
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3434;
                    i47 = iM2765;
                    i43 = i24;
                    i54 = i20;
                    r9 = r9;
                    C3054 c30512 = c3055;
                    i49 = i49;
                    str5 = str5;
                    str4 = str3;
                    c3055 = c30512;
                    break;
                case -1713034773:
                case -1699894831:
                    i10 = i54;
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                    c2364 = c2364;
                    dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21761;
                    c10469 = c10469;
                    i11 = i50;
                    sArr2 = sArr8;
                    i12 = i51;
                    sArr3 = sArr9;
                    dialogInterfaceOnClickListenerC212611 = dialogInterfaceOnClickListenerC212615;
                    i13 = i52;
                    String str12 = str4;
                    str5 = str5;
                    i49 = i49;
                    c3055 = c3055;
                    str3 = str12;
                    if (C2288.m7766()) {
                        iM31611 = C0773.m3169("᩻ᩳ") ^ i41;
                        i16 = ((iM31611 ^ i42) * (-27297)) ^ 285473088;
                        i19 = -2107201956;
                    } else {
                        iM31611 = (C0773.m3169("᩸ۚ") + i42) * (-57);
                        i16 = ((iM31611 ^ i41) * 9263) ^ (-1571999130);
                        i19 = -88049669;
                    }
                    i18 = iM31611 ^ i19;
                    i52 = i13;
                    sArr8 = sArr2;
                    sArr9 = sArr3;
                    dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212611;
                    i50 = i11;
                    i51 = i12;
                    i54 = i10;
                    c10469 = c10469;
                    dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21761;
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                    c2364 = c2364;
                    i44 = i18;
                    i43 = i16;
                    r9 = r9;
                    C3054 c30513 = c3055;
                    i49 = i49;
                    str5 = str5;
                    str4 = str3;
                    c3055 = c30513;
                    break;
                case -1624747602:
                case -337117872:
                    i30 = i50;
                    dialogInterfaceOnClickListenerC212614 = dialogInterfaceOnClickListenerC212615;
                    dialogInterfaceOnClickListenerC3433 = dialogInterfaceOnClickListenerC3436;
                    if (C4238.m13535(ApplicationC17729.f58258, C4282.m13652(C2310.m7803(f32484, 272, 11, i45), AbstractC0116.m1236(f32484, 240, 32, i45)), z2)) {
                        iM31614 = C0773.m3169("ۘܳ") ^ i41;
                        i31 = ((iM31614 ^ i42) * 24205) ^ 737577573;
                        i32 = 417278905;
                    } else {
                        iM31614 = (C0773.m3169("ۚ᩹") + i41) * 97;
                        i31 = ((iM31614 ^ i42) * 6769) ^ (-853984285);
                        i32 = 546198468;
                    }
                    i44 = iM31614 ^ i32;
                    i43 = i31;
                    dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212614;
                    i50 = i30;
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3433;
                    break;
                case -1615380767:
                case 1807640157:
                    return z;
                case -1574755116:
                case -153945064:
                    if (C2287.m7745() > 0) {
                        i20 = i54;
                        dialogInterfaceOnClickListenerC3434 = dialogInterfaceOnClickListenerC3436;
                        iM2765 = i47;
                        c10467 = c10469;
                        i21 = i50;
                        i22 = i51;
                        sArr5 = sArr9;
                        dialogInterfaceOnClickListenerC212612 = dialogInterfaceOnClickListenerC212615;
                        c2361 = c2364;
                        dialogInterfaceOnClickListenerC21760 = dialogInterfaceOnClickListenerC21761;
                        sArr4 = sArr8;
                        i23 = i52;
                        String str13 = str4;
                        str5 = str5;
                        i49 = i49;
                        c3055 = c3055;
                        str3 = str13;
                        iM31612 = C0619.m2761("᩺ܶ") ^ i42;
                        i24 = ((iM31612 ^ i41) * 23505) ^ (-443683456);
                        i25 = -109702702;
                        i44 = iM31612 ^ i25;
                        i52 = i23;
                        sArr8 = sArr4;
                        sArr9 = sArr5;
                        dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212612;
                        i50 = i21;
                        i51 = i22;
                        c10469 = c10467;
                        dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21760;
                        c2364 = c2361;
                        dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3434;
                        i47 = iM2765;
                        i43 = i24;
                        i54 = i20;
                        r9 = r9;
                        C3054 c30514 = c3055;
                        i49 = i49;
                        str5 = str5;
                        str4 = str3;
                        c3055 = c30514;
                    }
                    dialogInterfaceOnClickListenerC3435 = dialogInterfaceOnClickListenerC3436;
                    c2362 = c2364;
                    c10468 = c10469;
                    i26 = i50;
                    sArr6 = sArr9;
                    dialogInterfaceOnClickListenerC212613 = dialogInterfaceOnClickListenerC212615;
                    String str14 = str4;
                    str5 = str5;
                    i49 = i49;
                    c3055 = c3055;
                    str3 = str14;
                    int iM27613 = (C0619.m2761("᩻ۡ") ^ i41) * 115;
                    i44 = iM27613 ^ 1572607642;
                    c2364 = c2362;
                    i43 = ((iM27613 ^ i42) * (-31037)) ^ 2021730708;
                    sArr9 = sArr6;
                    dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212613;
                    i50 = i26;
                    c10469 = c10468;
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3435;
                    r9 = r9;
                    C3054 c30515 = c3055;
                    i49 = i49;
                    str5 = str5;
                    str4 = str3;
                    c3055 = c30515;
                    break;
                case -1564857601:
                case -1230803900:
                    i54 = i54;
                    abstractActivityC10144.m26241(z2);
                    if (abstractActivityC10144.f32504) {
                        iM2766 = (C0773.m3169("ܺ᩵") + i42) * 63;
                        i38 = ((iM2766 ^ i41) * 31251) ^ 2010702472;
                        i39 = 1101728258;
                    } else {
                        iM2766 = C0773.m3169("ܳ۟") ^ i41;
                        i38 = ((iM2766 ^ i42) * 2543) ^ 1266102585;
                        i39 = 1929075198;
                    }
                    i44 = iM2766 ^ i39;
                    i43 = i38;
                    i54 = i54;
                    break;
                case -1559631682:
                case 651790792:
                    m26230();
                    return z;
                case -1558671106:
                case 1544140752:
                    dialogInterfaceOnClickListenerC3435 = dialogInterfaceOnClickListenerC3436;
                    c2362 = c2364;
                    c10468 = c10469;
                    i26 = i50;
                    sArr6 = sArr9;
                    dialogInterfaceOnClickListenerC212613 = dialogInterfaceOnClickListenerC212615;
                    String str15 = str4;
                    str5 = str5;
                    i49 = i49;
                    c3055 = c3055;
                    str3 = str15;
                    C3099.m10082(c2362, iM2769 ^ 2124706874);
                    DialogInterfaceOnClickListenerC21760 dialogInterfaceOnClickListenerC21763 = new DialogInterfaceOnClickListenerC21760(z ? 1 : 0, abstractActivityC10144);
                    sArr8 = f32484;
                    i51 = 219;
                    i52 = 3;
                    if (C1321.f4751 >= 0) {
                        dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21763;
                        int iM27614 = (C0619.m2761("᩻ۡ") ^ i41) * 115;
                        i44 = iM27614 ^ 1572607642;
                        c2364 = c2362;
                        i43 = ((iM27614 ^ i42) * (-31037)) ^ 2021730708;
                        sArr9 = sArr6;
                        dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212613;
                        i50 = i26;
                    } else {
                        int iM27615 = (C0619.m2761("ۜ֡") + i42) * (-11);
                        i43 = ((iM27615 ^ i41) * 19177) ^ (-1292290919);
                        i44 = iM27615 ^ 1926217176;
                        dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21763;
                        sArr9 = sArr6;
                        dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212613;
                        i50 = i26;
                        c2364 = c2362;
                    }
                    c10469 = c10468;
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3435;
                    r9 = r9;
                    C3054 c30516 = c3055;
                    i49 = i49;
                    str5 = str5;
                    str4 = str3;
                    c3055 = c30516;
                    break;
                case -1553472274:
                case 1805308460:
                    abstractActivityC10144.f32497 = abstractActivityC10144.f32498;
                    iM2766 = (C0619.m2761("ۨᩳ") + i41) * 23;
                    i38 = ((iM2766 ^ i42) * (-32113)) ^ 707486066;
                    i39 = 1893638492;
                    i44 = iM2766 ^ i39;
                    i43 = i38;
                    i54 = i54;
                    break;
                case -1528304797:
                case -381107607:
                    i10 = i54;
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                    c2364 = c2364;
                    dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21761;
                    c10469 = c10469;
                    i11 = i50;
                    sArr2 = sArr8;
                    i12 = i51;
                    sArr3 = sArr9;
                    dialogInterfaceOnClickListenerC212611 = dialogInterfaceOnClickListenerC212615;
                    i13 = i52;
                    String str16 = str4;
                    str5 = str5;
                    i49 = i49;
                    c3055 = c3055;
                    str3 = str16;
                    iM2768 = C0619.m2761(C3492.m11486(f32484, 201, 3, i45)) ^ 2124016654;
                    sArr7 = f32484;
                    if (!C2288.m7767()) {
                        iM31611 = C0773.m3169("ܿ᩻") ^ i41;
                        i16 = ((iM31611 ^ i42) * (-30771)) ^ (-1582667658);
                        i19 = -743027769;
                        i18 = iM31611 ^ i19;
                        i52 = i13;
                        sArr8 = sArr2;
                        sArr9 = sArr3;
                        dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212611;
                        i50 = i11;
                        i51 = i12;
                        i54 = i10;
                        c10469 = c10469;
                        dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21761;
                        dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                        c2364 = c2364;
                        i44 = i18;
                        i43 = i16;
                        r9 = r9;
                        C3054 c30517 = c3055;
                        i49 = i49;
                        str5 = str5;
                        str4 = str3;
                        c3055 = c30517;
                    } else {
                        strM6247 = str3;
                        int iM27616 = C0619.m2761("ۧ۬") ^ i41;
                        i52 = i13;
                        sArr8 = sArr2;
                        c3055 = c3055;
                        sArr9 = sArr3;
                        dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212611;
                        i50 = i11;
                        i51 = i12;
                        c10469 = c10469;
                        dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21761;
                        i49 = i49;
                        str5 = str5;
                        dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                        c2364 = c2364;
                        i44 = iM27616 ^ (-1730199745);
                        str4 = strM6247;
                        i43 = ((iM27616 ^ i42) * 13319) ^ (-2014062804);
                        i54 = i10;
                    }
                    break;
                case -1480433901:
                case -441038387:
                    int i60 = DialogInterfaceC8327.f27315;
                    c2363 = new C2361(abstractActivityC10144);
                    dialogInterfaceOnClickListenerC212610 = dialogInterfaceOnClickListenerC212615;
                    iM2762 = C0619.m2761(C3779.m12266(f32484, 286, 3, i45)) ^ 2101762072;
                    if (C3690.f12684 > 0) {
                        iM2763 = (C0619.m2761("۟ۨ") ^ i42) * (-19);
                        i7 = ((iM2763 ^ i41) * (-7821)) ^ (-1600922662);
                        i8 = -1140333185;
                        r9 = r9;
                        i44 = iM2763 ^ i8;
                        DialogInterfaceOnClickListenerC21269 dialogInterfaceOnClickListenerC212617 = dialogInterfaceOnClickListenerC212610;
                        i50 = iM2762;
                        i43 = i7;
                        dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212617;
                    } else {
                        i3 = iM2762;
                        str2 = str5;
                        i4 = i49;
                        int iM27617 = (C0619.m2761("֫ۘ") ^ i41) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i44 = iM27617 ^ (-1927485639);
                        i43 = ((iM27617 ^ i42) * (-2211)) ^ (-1947817949);
                        c10469 = c10469;
                        i49 = i4;
                        str5 = str2;
                        dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                        str4 = str4;
                        dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212610;
                        i50 = i3;
                    }
                    break;
                case -1348257226:
                case 167492296:
                    i10 = i54;
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                    c2364 = c2364;
                    dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21761;
                    c10469 = c10469;
                    i11 = i50;
                    sArr = sArr7;
                    sArr2 = sArr8;
                    i12 = i51;
                    sArr3 = sArr9;
                    dialogInterfaceOnClickListenerC212611 = dialogInterfaceOnClickListenerC212615;
                    i13 = i52;
                    String str17 = str4;
                    str5 = str5;
                    i49 = i49;
                    c3055 = c3055;
                    str3 = str17;
                    if (mo26257()) {
                        iM3169 = C0619.m2761("ۗ᩹") ^ i42;
                        i43 = ((iM3169 ^ i41) * (-14529)) ^ (-2091925451);
                        i14 = -259979410;
                    } else {
                        iM3169 = (C0619.m2761("ۗܶ") ^ i42) * 87;
                        i43 = ((iM3169 ^ i41) * (-19215)) ^ (-1266067529);
                        i14 = -1195910478;
                    }
                    i15 = iM3169 ^ i14;
                    sArr7 = sArr;
                    i52 = i13;
                    sArr8 = sArr2;
                    sArr9 = sArr3;
                    dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212611;
                    i50 = i11;
                    i51 = i12;
                    i54 = i10;
                    c10469 = c10469;
                    dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21761;
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                    c2364 = c2364;
                    i44 = i15;
                    abstractActivityC10144 = this;
                    r9 = r9;
                    C3054 c30518 = c3055;
                    i49 = i49;
                    str5 = str5;
                    str4 = str3;
                    c3055 = c30518;
                    break;
                case -1308233772:
                case -295923319:
                    C3099.m10095();
                    dialogInterfaceOnClickListenerC3435 = dialogInterfaceOnClickListenerC3436;
                    c2362 = c2364;
                    c10468 = c10469;
                    i26 = i50;
                    sArr6 = sArr9;
                    dialogInterfaceOnClickListenerC212613 = dialogInterfaceOnClickListenerC212615;
                    String str18 = str4;
                    str5 = str5;
                    i49 = i49;
                    c3055 = c3055;
                    str3 = str18;
                    int iM27618 = (C0619.m2761("᩻ۡ") ^ i41) * 115;
                    i44 = iM27618 ^ 1572607642;
                    c2364 = c2362;
                    i43 = ((iM27618 ^ i42) * (-31037)) ^ 2021730708;
                    sArr9 = sArr6;
                    dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212613;
                    i50 = i26;
                    c10469 = c10468;
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3435;
                    r9 = r9;
                    C3054 c30519 = c3055;
                    i49 = i49;
                    str5 = str5;
                    str4 = str3;
                    c3055 = c30519;
                    break;
                case -1252738474:
                case 1241586754:
                    C3077.m10039(C0773.m3169(C2834.m9343(f32484, 298, 3, i45)) ^ 2101890005);
                    iM2762 = i50;
                    i54 = i54;
                    r8 = r9;
                    dialogInterfaceOnClickListenerC212610 = dialogInterfaceOnClickListenerC212615;
                    iM2763 = C0619.m2761("᩵ۛ") ^ i41;
                    i7 = ((iM2763 ^ i42) * 9429) ^ 329897556;
                    i8 = 542144145;
                    r9 = r8;
                    i44 = iM2763 ^ i8;
                    DialogInterfaceOnClickListenerC21269 dialogInterfaceOnClickListenerC212618 = dialogInterfaceOnClickListenerC212610;
                    i50 = iM2762;
                    i43 = i7;
                    dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212618;
                    break;
                case -1205054720:
                case -498637640:
                    dialogInterfaceOnClickListenerC3435 = dialogInterfaceOnClickListenerC3436;
                    c10468 = c10469;
                    i26 = i50;
                    sArr6 = sArr9;
                    dialogInterfaceOnClickListenerC212613 = dialogInterfaceOnClickListenerC212615;
                    String str19 = str4;
                    str5 = str5;
                    i49 = i49;
                    c3055 = c3055;
                    str3 = str19;
                    if (iM8344 == (C0773.m3169(C2834.m9343(f32484, 222, 3, i45)) ^ 2101573953)) {
                        iM31613 = C0773.m3169("ܺۢ") ^ i41;
                        i27 = ((iM31613 ^ i42) * 4717) ^ 2067793486;
                        i28 = -2005991365;
                    } else {
                        iM31613 = C0773.m3169("ᩳۗ") ^ i42;
                        i27 = ((iM31613 ^ i41) * (-9499)) ^ (-1043452319);
                        i28 = -1885147110;
                    }
                    i44 = iM31613 ^ i28;
                    i43 = i27;
                    sArr9 = sArr6;
                    dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212613;
                    i50 = i26;
                    c10469 = c10468;
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3435;
                    r9 = r9;
                    C3054 c305110 = c3055;
                    i49 = i49;
                    str5 = str5;
                    str4 = str3;
                    c3055 = c305110;
                    break;
                case -1157720466:
                case 1890412471:
                    dialogInterfaceOnClickListenerC3433 = dialogInterfaceOnClickListenerC3436;
                    i30 = i50;
                    dialogInterfaceOnClickListenerC212614 = dialogInterfaceOnClickListenerC212615;
                    if (iM8344 == (C0619.m2761(C2966.m9670(f32484, 237, 3, i45)) ^ 2123897815)) {
                        iM31614 = (C0773.m3169("ۙ᩺") + i42) * 3;
                        i31 = ((iM31614 ^ i41) * (-12001)) ^ (-929980549);
                        i32 = -2062623467;
                    } else {
                        iM31614 = (C0773.m3169("ۚۨ") ^ i42) * (-5);
                        i31 = ((iM31614 ^ i41) * (-11607)) ^ (-1610383429);
                        i32 = 218100190;
                    }
                    i44 = iM31614 ^ i32;
                    i43 = i31;
                    dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212614;
                    i50 = i30;
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3433;
                    break;
                case -1149184281:
                case 974709128:
                    if (C2288.f7433 > 0) {
                        iM31615 = (C0773.m3169("۫᩶") ^ i42) * (-69);
                        i33 = ((iM31615 ^ i41) * (-2841)) ^ (-1018526006);
                        i34 = 1779505228;
                        i44 = iM31615 ^ i34;
                        i43 = i33;
                    } else {
                        dialogInterfaceOnClickListenerC3435 = dialogInterfaceOnClickListenerC3436;
                        c2362 = c2364;
                        c10468 = c10469;
                        i26 = i50;
                        sArr6 = sArr9;
                        dialogInterfaceOnClickListenerC212613 = dialogInterfaceOnClickListenerC212615;
                        String str110 = str4;
                        str5 = str5;
                        i49 = i49;
                        c3055 = c3055;
                        str3 = str110;
                        int iM27619 = (C0619.m2761("᩻ۡ") ^ i41) * 115;
                        i44 = iM27619 ^ 1572607642;
                        c2364 = c2362;
                        i43 = ((iM27619 ^ i42) * (-31037)) ^ 2021730708;
                        sArr9 = sArr6;
                        dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212613;
                        i50 = i26;
                        c10469 = c10468;
                        dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3435;
                        r9 = r9;
                        C3054 c305111 = c3055;
                        i49 = i49;
                        str5 = str5;
                        str4 = str3;
                        c3055 = c305111;
                    }
                    break;
                case -1104914864:
                case -731073215:
                    i54 = i54;
                    ArrayList arrayList = new ArrayList(abstractActivityC10144.f32498);
                    abstractActivityC10144.f32493 = arrayList;
                    Collections.sort(arrayList, C2661.comparing(new C7873(z ? 1 : 0)));
                    iM2766 = C0619.m2761("ۢ᩸") ^ i42;
                    i38 = ((iM2766 ^ i41) * (-22755)) ^ 1323364072;
                    i39 = 1335422552;
                    i44 = iM2766 ^ i39;
                    i43 = i38;
                    i54 = i54;
                    break;
                case -1075918231:
                case 446504552:
                    i10 = i54;
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                    int i61 = iM2768;
                    c2364 = c2364;
                    dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21761;
                    c10469 = c10469;
                    i11 = i50;
                    sArr = sArr7;
                    sArr2 = sArr8;
                    i12 = i51;
                    sArr3 = sArr9;
                    dialogInterfaceOnClickListenerC212611 = dialogInterfaceOnClickListenerC212615;
                    i13 = i52;
                    String str20 = str4;
                    str5 = str5;
                    i49 = i49;
                    c3055 = c3055;
                    str3 = str20;
                    if (!abstractActivityC10144.m26224(z2)) {
                        iM31610 = (C0773.m3169("ᩳᩳ") ^ i42) * 19;
                        iM2768 = i61;
                        i16 = ((iM31610 ^ i41) * 17699) ^ (-1080631264);
                        i17 = -961690508;
                        i18 = iM31610 ^ i17;
                        sArr7 = sArr;
                        i52 = i13;
                        sArr8 = sArr2;
                        sArr9 = sArr3;
                        dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212611;
                        i50 = i11;
                        i51 = i12;
                        i54 = i10;
                        c10469 = c10469;
                        dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21761;
                        dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                        c2364 = c2364;
                        i44 = i18;
                        i43 = i16;
                        r9 = r9;
                        C3054 c305112 = c3055;
                        i49 = i49;
                        str5 = str5;
                        str4 = str3;
                        c3055 = c305112;
                    } else {
                        iM2768 = i61;
                        iM3169 = (C0619.m2761("ۗܶ") ^ i42) * 87;
                        i43 = ((iM3169 ^ i41) * (-19215)) ^ (-1266067529);
                        i14 = -1195910478;
                        i15 = iM3169 ^ i14;
                        sArr7 = sArr;
                        i52 = i13;
                        sArr8 = sArr2;
                        sArr9 = sArr3;
                        dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212611;
                        i50 = i11;
                        i51 = i12;
                        i54 = i10;
                        c10469 = c10469;
                        dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21761;
                        dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                        c2364 = c2364;
                        i44 = i15;
                        abstractActivityC10144 = this;
                        r9 = r9;
                        C3054 c305113 = c3055;
                        i49 = i49;
                        str5 = str5;
                        str4 = str3;
                        c3055 = c305113;
                    }
                    break;
                case -1014837991:
                case 1360490489:
                    dialogInterfaceOnClickListenerC3433 = dialogInterfaceOnClickListenerC3436;
                    i = i49;
                    c3054 = c3055;
                    i2 = i50;
                    dialogInterfaceOnClickListenerC21269 = dialogInterfaceOnClickListenerC212615;
                    str = str4;
                    C10467 c104612 = new C10467(abstractActivityC10144, r9);
                    strM6246 = C1783.m6246(abstractActivityC10144, C0619.m2761(C4282.m13650(f32484, 228, 3, i45)) ^ 2101576263);
                    sArr9 = f32484;
                    if (C2419.f7754 >= 0) {
                        c10469 = c104612;
                        int iM27620 = C0619.m2761("ۖۖ") ^ i42;
                        i29 = ((iM27620 ^ i41) * (-25813)) ^ 978337232;
                        i44 = iM27620 ^ 1080519801;
                        str4 = str;
                        c3055 = c3054;
                        dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC21269;
                        i50 = i2;
                        i49 = i;
                    } else {
                        int iM27621 = C0619.m2761("ܿܽ") ^ i41;
                        i29 = ((iM27621 ^ i42) * (-11667)) ^ 2093717467;
                        i44 = iM27621 ^ 1147848783;
                        c10469 = c104612;
                        c3055 = c3054;
                        str4 = str;
                        i49 = i;
                        dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC21269;
                        i50 = i2;
                    }
                    str5 = strM6246;
                    i43 = i29;
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3433;
                    break;
                case -954537202:
                case 511535045:
                    i10 = i54;
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                    c2364 = c2364;
                    dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21761;
                    c10469 = c10469;
                    i11 = i50;
                    sArr = sArr7;
                    sArr2 = sArr8;
                    i12 = i51;
                    sArr3 = sArr9;
                    dialogInterfaceOnClickListenerC212611 = dialogInterfaceOnClickListenerC212615;
                    i13 = i52;
                    String str21 = str4;
                    str5 = str5;
                    i49 = i49;
                    c3055 = c3055;
                    str3 = str21;
                    if (iM8344 == (C0619.m2761(RunnableC3055.m9937(f32484, 198, 3, i45)) ^ 2100772751)) {
                        iM3169 = (i42 - C0773.m3169("ܰ᩷")) * (-33);
                        i43 = ((iM3169 ^ i41) * (-16309)) ^ (-1243250823);
                        i14 = 1266750408;
                    } else {
                        iM3169 = (C0619.m2761("֨ۜ") ^ i41) * (-87);
                        i43 = ((iM3169 ^ i42) * 5043) ^ (-1978155180);
                        i14 = -1764186675;
                    }
                    i15 = iM3169 ^ i14;
                    sArr7 = sArr;
                    i52 = i13;
                    sArr8 = sArr2;
                    sArr9 = sArr3;
                    dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212611;
                    i50 = i11;
                    i51 = i12;
                    i54 = i10;
                    c10469 = c10469;
                    dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21761;
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                    c2364 = c2364;
                    i44 = i15;
                    abstractActivityC10144 = this;
                    r9 = r9;
                    C3054 c305114 = c3055;
                    i49 = i49;
                    str5 = str5;
                    str4 = str3;
                    c3055 = c305114;
                    break;
                case -940524854:
                case 1179460606:
                    AbstractC0116.m1243();
                    return false;
                case -913784114:
                case 1828804772:
                    new C6417(abstractActivityC10144, abstractActivityC10144);
                    return z;
                case -895562276:
                case 1395841832:
                    iM2762 = i50;
                    dialogInterfaceOnClickListenerC212610 = dialogInterfaceOnClickListenerC212615;
                    r8 = r9;
                    if (abstractActivityC10144.m26224(z)) {
                        iM2763 = C0773.m3169("ᩳ۟") ^ i42;
                        i7 = ((iM2763 ^ i41) * (-871)) ^ 29629862;
                        i8 = -1608593142;
                        r9 = r9;
                    } else {
                        iM2763 = C0619.m2761("᩵ۛ") ^ i41;
                        i7 = ((iM2763 ^ i42) * 9429) ^ 329897556;
                        i8 = 542144145;
                        r9 = r8;
                    }
                    i44 = iM2763 ^ i8;
                    DialogInterfaceOnClickListenerC21269 dialogInterfaceOnClickListenerC212619 = dialogInterfaceOnClickListenerC212610;
                    i50 = iM2762;
                    i43 = i7;
                    dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212619;
                    break;
                case -751646704:
                case 897114001:
                    if (C2287.f7432 < 0) {
                        dialogInterfaceOnClickListenerC3433 = dialogInterfaceOnClickListenerC3436;
                        strM6246 = str5;
                        i = i49;
                        c3054 = c3055;
                        i2 = i50;
                        dialogInterfaceOnClickListenerC21269 = dialogInterfaceOnClickListenerC212615;
                        str = str4;
                        int iM27622 = C0619.m2761("ۖۖ") ^ i42;
                        i29 = ((iM27622 ^ i41) * (-25813)) ^ 978337232;
                        i44 = iM27622 ^ 1080519801;
                        str4 = str;
                        c3055 = c3054;
                        dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC21269;
                        i50 = i2;
                        i49 = i;
                        str5 = strM6246;
                        i43 = i29;
                        dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3433;
                    } else {
                        i3 = i50;
                        dialogInterfaceOnClickListenerC212610 = dialogInterfaceOnClickListenerC212615;
                        str2 = str5;
                        i4 = i49;
                        int iM276110 = (C0619.m2761("֫ۘ") ^ i41) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i44 = iM276110 ^ (-1927485639);
                        i43 = ((iM276110 ^ i42) * (-2211)) ^ (-1947817949);
                        c10469 = c10469;
                        i49 = i4;
                        str5 = str2;
                        dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                        str4 = str4;
                        dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212610;
                        i50 = i3;
                    }
                    break;
                case -652210017:
                case 957781048:
                    m26244();
                    return z;
                case -642309617:
                case 1636618704:
                    int i62 = i50;
                    dialogInterfaceOnClickListenerC212610 = dialogInterfaceOnClickListenerC212615;
                    i3 = i62;
                    if (iM8344 == (C0773.m3169(C2485.m8350(f32484, 283, 3, i45)) ^ 2121560084)) {
                        iM2761 = (C0773.m3169("ᩴۚ") + i42) * 35;
                        i5 = ((iM2761 ^ i41) * 9217) ^ (-1394308695);
                        i6 = -2081848717;
                    } else {
                        iM2761 = C0619.m2761("᩵۫") ^ i41;
                        i5 = ((iM2761 ^ i42) * 3069) ^ (-1134041572);
                        i6 = -1199927467;
                    }
                    i44 = iM2761 ^ i6;
                    i43 = i5;
                    dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212610;
                    i50 = i3;
                    break;
                case -587888701:
                case 660338074:
                    abstractActivityC10144.f32504 = z2;
                    abstractActivityC10144.f32495 = -1;
                    i54 = i54;
                    C2878.m9476(abstractActivityC10144, C0773.m3169(C23916.m53420(f32484, 324, 3, i45)) ^ 2100195512);
                    abstractActivityC10144.f32491 = r9;
                    m26255();
                    iM2766 = C0773.m3169("ܳ۟") ^ i41;
                    i38 = ((iM2766 ^ i42) * 2543) ^ 1266102585;
                    i39 = 1929075198;
                    i44 = iM2766 ^ i39;
                    i43 = i38;
                    i54 = i54;
                    break;
                case -397479984:
                case 260506715:
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                    str5 = str5;
                    c10469 = c10469;
                    i11 = i50;
                    dialogInterfaceOnClickListenerC212611 = dialogInterfaceOnClickListenerC212615;
                    c3055 = c3055;
                    short[] sArr16 = sArr9;
                    strM6247 = C1783.m6246(abstractActivityC10144, C0619.m2761(C2354.m7980(sArr16, 231, 3, i45)) ^ 2119738270);
                    sArr10 = f32484;
                    if (C11235.m28309() != 0) {
                        sArr3 = sArr16;
                        i10 = i54;
                        c2364 = c2364;
                        dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21761;
                        sArr2 = sArr8;
                        i12 = i51;
                        i13 = i52;
                        i49 = 234;
                        int iM276111 = C0619.m2761("ۧ۬") ^ i41;
                        i52 = i13;
                        sArr8 = sArr2;
                        c3055 = c3055;
                        sArr9 = sArr3;
                        dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212611;
                        i50 = i11;
                        i51 = i12;
                        c10469 = c10469;
                        dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21761;
                        i49 = i49;
                        str5 = str5;
                        dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                        c2364 = c2364;
                        i44 = iM276111 ^ (-1730199745);
                        str4 = strM6247;
                        i43 = ((iM276111 ^ i42) * 13319) ^ (-2014062804);
                        i54 = i10;
                    } else {
                        int iM31620 = (C0773.m3169("ᩳ֡") ^ i42) * (-111);
                        i44 = iM31620 ^ 1751198903;
                        sArr9 = sArr16;
                        i43 = ((iM31620 ^ i41) * 12527) ^ (-515408316);
                        c10469 = c10469;
                        str5 = str5;
                        c3055 = c3055;
                        dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212611;
                        i50 = i11;
                        dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                        i49 = 234;
                        str4 = strM6247;
                    }
                    break;
                case -208363639:
                case 856428653:
                    i35 = i54;
                    ?? r32 = r9;
                    if (iM8344 == (C0619.m2761(AbstractC3624.m11769(f32484, 295, 3, i45)) ^ 2120650085)) {
                        iM31616 = (i41 - C0773.m3169("ۛ֨")) * 63;
                        i36 = ((iM31616 ^ i42) * (-3785)) ^ (-50073522);
                        i37 = -646746827;
                        r31 = r32;
                    } else {
                        iM31616 = (i42 - C0773.m3169("᩶ܶ")) * (-27);
                        i36 = ((iM31616 ^ i41) * (-22021)) ^ 114378069;
                        i37 = -904973518;
                        r31 = r32;
                    }
                    i44 = iM31616 ^ i37;
                    i43 = i36;
                    i54 = i35;
                    r9 = r31;
                    break;
                case -202239349:
                case 29366013:
                    i10 = i54;
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                    c2364 = c2364;
                    dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21761;
                    c10469 = c10469;
                    i11 = i50;
                    sArr = sArr7;
                    sArr2 = sArr8;
                    i12 = i51;
                    sArr3 = sArr9;
                    dialogInterfaceOnClickListenerC212611 = dialogInterfaceOnClickListenerC212615;
                    i13 = i52;
                    String str22 = str4;
                    str5 = str5;
                    i49 = i49;
                    c3055 = c3055;
                    str3 = str22;
                    iM8344 = C2485.m8344(menuItem);
                    z = true;
                    z = true;
                    z2 = false;
                    z2 = false;
                    if (iM8344 == (C0773.m3169(RunnableC3646.m11809(f32484, 189, 3, i45)) ^ 2123261274)) {
                        iM3169 = C0619.m2761("᩸᩷") ^ i42;
                        i43 = ((iM3169 ^ i41) * (-29365)) ^ (-596380123);
                        i14 = -471596109;
                    } else {
                        iM3169 = (C0773.m3169("᩵֡") + i42) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i43 = ((iM3169 ^ i41) * 16237) ^ (-614387893);
                        i14 = -1844261295;
                    }
                    i15 = iM3169 ^ i14;
                    sArr7 = sArr;
                    i52 = i13;
                    sArr8 = sArr2;
                    sArr9 = sArr3;
                    dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212611;
                    i50 = i11;
                    i51 = i12;
                    i54 = i10;
                    c10469 = c10469;
                    dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21761;
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                    c2364 = c2364;
                    i44 = i15;
                    abstractActivityC10144 = this;
                    r9 = r9;
                    C3054 c305115 = c3055;
                    i49 = i49;
                    str5 = str5;
                    str4 = str3;
                    c3055 = c305115;
                    break;
                case -155044508:
                case 628644382:
                    RunnableC1848.m6363(abstractActivityC10144, new Intent(abstractActivityC10144, (Class<?>) ActivityC24449.class));
                    return z;
                case -139625128:
                case 1231442465:
                    i54 = i54;
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                    c2364 = c2364;
                    dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21761;
                    c10469 = c10469;
                    i50 = i50;
                    sArr7 = sArr7;
                    sArr8 = sArr8;
                    i51 = i51;
                    sArr9 = sArr9;
                    dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212615;
                    i52 = i52;
                    String str23 = str4;
                    str5 = str5;
                    i49 = i49;
                    c3055 = c3055;
                    str3 = str23;
                    int iM27623 = C0619.m2761(C2419.m8166(f32484, 192, 3, i45)) ^ 2119094182;
                    short[] sArr17 = f32484;
                    z = z ? 1 : 0;
                    iM31617 = C0773.m3169(C0619.m2756(sArr17, 195, 3, i45)) ^ 2101211744;
                    if (iM8344 == iM27623) {
                        iM2764 = C0773.m3169("᩸ۨ") ^ i41;
                        i43 = ((iM2764 ^ i42) * 4751) ^ 692622391;
                        i9 = -1325943075;
                    } else {
                        iM2764 = (C0619.m2761("ۢܺ") ^ i41) * 13;
                        i43 = ((iM2764 ^ i42) * (-1379)) ^ 10314365;
                        i9 = 470770724;
                    }
                    i15 = iM2764 ^ i9;
                    sArr7 = sArr7;
                    i52 = i52;
                    sArr8 = sArr8;
                    sArr9 = sArr9;
                    dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212615;
                    i50 = i50;
                    i51 = i51;
                    i54 = i54;
                    z = z;
                    c10469 = c10469;
                    dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21761;
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                    c2364 = c2364;
                    i44 = i15;
                    abstractActivityC10144 = this;
                    r9 = r9;
                    C3054 c305116 = c3055;
                    i49 = i49;
                    str5 = str5;
                    str4 = str3;
                    c3055 = c305116;
                    break;
                case -82205081:
                case 1486927346:
                    i10 = i54;
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                    c2364 = c2364;
                    dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21761;
                    c10469 = c10469;
                    i11 = i50;
                    sArr = sArr7;
                    sArr2 = sArr8;
                    i12 = i51;
                    sArr3 = sArr9;
                    dialogInterfaceOnClickListenerC212611 = dialogInterfaceOnClickListenerC212615;
                    i13 = i52;
                    String str24 = str4;
                    str5 = str5;
                    i49 = i49;
                    c3055 = c3055;
                    str3 = str24;
                    if (C2702.m8873()) {
                        iM31610 = C0773.m3169("ۨ۬") ^ i42;
                        i16 = ((iM31610 ^ i41) * (-32461)) ^ 1625679044;
                        i17 = -815501154;
                    } else {
                        iM31610 = (i41 - C0619.m2761("᩷ܿ")) * 75;
                        i16 = ((iM31610 ^ i42) * 5997) ^ (-1947746373);
                        i17 = -1293102477;
                    }
                    i18 = iM31610 ^ i17;
                    sArr7 = sArr;
                    i52 = i13;
                    sArr8 = sArr2;
                    sArr9 = sArr3;
                    dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212611;
                    i50 = i11;
                    i51 = i12;
                    i54 = i10;
                    c10469 = c10469;
                    dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21761;
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                    c2364 = c2364;
                    i44 = i18;
                    i43 = i16;
                    r9 = r9;
                    C3054 c305117 = c3055;
                    i49 = i49;
                    str5 = str5;
                    str4 = str3;
                    c3055 = c305117;
                    break;
                case -34914217:
                case 605347121:
                    C3077.m10039(iM31617);
                    return z;
                case 6506829:
                case 1107167363:
                    str3 = str4;
                    i45 = 10552;
                    iM2764 = C0773.m3169("ۛۙ") ^ i41;
                    i43 = ((iM2764 ^ i42) * (-7523)) ^ (-472944474);
                    i9 = 1244522089;
                    i15 = iM2764 ^ i9;
                    sArr7 = sArr7;
                    i52 = i52;
                    sArr8 = sArr8;
                    sArr9 = sArr9;
                    dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212615;
                    i50 = i50;
                    i51 = i51;
                    i54 = i54;
                    z = z;
                    c10469 = c10469;
                    dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21761;
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                    c2364 = c2364;
                    i44 = i15;
                    abstractActivityC10144 = this;
                    r9 = r9;
                    C3054 c305118 = c3055;
                    i49 = i49;
                    str5 = str5;
                    str4 = str3;
                    c3055 = c305118;
                    break;
                case 25600168:
                case 148714026:
                    C2023.m6964();
                    if (AbstractC3624.m11755() != 0) {
                        iM31615 = C0619.m2761("ۙۚ") ^ i42;
                        i33 = ((iM31615 ^ i41) * 31073) ^ 472289475;
                        i34 = 483315901;
                    } else {
                        iM31615 = (C0773.m3169("ܶܿ") ^ i41) * 51;
                        i33 = ((iM31615 ^ i42) * 5733) ^ (-2012070996);
                        i34 = -1226537065;
                    }
                    i44 = iM31615 ^ i34;
                    i43 = i33;
                    break;
                case 145502242:
                case 1588777906:
                    z = z ? 1 : 0;
                    i54 = i54;
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                    c2364 = c2364;
                    dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21761;
                    c10469 = c10469;
                    i50 = i50;
                    sArr7 = sArr7;
                    sArr8 = sArr8;
                    i51 = i51;
                    sArr9 = sArr9;
                    dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212615;
                    i52 = i52;
                    String str25 = str4;
                    str5 = str5;
                    i49 = i49;
                    c3055 = c3055;
                    str3 = str25;
                    short s = f32484[188];
                    if (((s * s) + 43903876) - (s * 13252) < 0) {
                        iM2764 = C0773.m3169("᩷ۖ") ^ i42;
                        i43 = ((iM2764 ^ i41) * 13675) ^ (-151296365);
                        i9 = 2128136939;
                    } else {
                        iM2764 = (C0619.m2761("ۜۙ") ^ i41) * 9;
                        i43 = ((iM2764 ^ i42) * (-7839)) ^ (-1970567995);
                        i9 = -358383892;
                    }
                    i15 = iM2764 ^ i9;
                    sArr7 = sArr7;
                    i52 = i52;
                    sArr8 = sArr8;
                    sArr9 = sArr9;
                    dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212615;
                    i50 = i50;
                    i51 = i51;
                    i54 = i54;
                    z = z;
                    c10469 = c10469;
                    dialogInterfaceOnClickListenerC21761 = dialogInterfaceOnClickListenerC21761;
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                    c2364 = c2364;
                    i44 = i15;
                    abstractActivityC10144 = this;
                    r9 = r9;
                    C3054 c305119 = c3055;
                    i49 = i49;
                    str5 = str5;
                    str4 = str3;
                    c3055 = c305119;
                    break;
                case 148011103:
                case 925165887:
                    abstractActivityC10144.mo19736(new RunnableC23571(abstractActivityC10144, z2));
                    return z;
                case 309041141:
                case 602887830:
                    int i63 = i50;
                    C2485.m8345(c2363, i63);
                    C1519.m5410(c2363, mo26250());
                    dialogInterfaceOnClickListenerC212615 = new DialogInterfaceOnClickListenerC21269(z ? 1 : 0, abstractActivityC10144);
                    sArr11 = f32484;
                    i46 = 289;
                    if (C2354.m7983()) {
                        int iM27624 = C0619.m2761("ۧۘ") ^ i41;
                        i44 = iM27624 ^ (-1945459726);
                        i50 = i63;
                        i43 = ((iM27624 ^ i42) * 10443) ^ 1385391771;
                        i53 = 3;
                    } else {
                        i2 = i63;
                        dialogInterfaceOnClickListenerC21269 = dialogInterfaceOnClickListenerC212615;
                        dialogInterfaceOnClickListenerC3433 = dialogInterfaceOnClickListenerC3436;
                        strM6246 = str5;
                        str = str4;
                        i = i49;
                        c3054 = c3055;
                        i53 = 3;
                        int iM27625 = C0619.m2761("ۖۖ") ^ i42;
                        i29 = ((iM27625 ^ i41) * (-25813)) ^ 978337232;
                        i44 = iM27625 ^ 1080519801;
                        str4 = str;
                        c3055 = c3054;
                        dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC21269;
                        i50 = i2;
                        i49 = i;
                        str5 = strM6246;
                        i43 = i29;
                        dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3433;
                    }
                    break;
                case 325705130:
                case 2035244664:
                    if (C2287.m7745() > 0) {
                        iM31615 = C0619.m2761("ܺۗ") ^ i41;
                        i33 = ((iM31615 ^ i42) * 32329) ^ (-1261997130);
                        i34 = -1515103074;
                        i44 = iM31615 ^ i34;
                        i43 = i33;
                    } else {
                        dialogInterfaceOnClickListenerC3435 = dialogInterfaceOnClickListenerC3436;
                        c2362 = c2364;
                        c10468 = c10469;
                        i26 = i50;
                        sArr6 = sArr9;
                        dialogInterfaceOnClickListenerC212613 = dialogInterfaceOnClickListenerC212615;
                        String str111 = str4;
                        str5 = str5;
                        i49 = i49;
                        c3055 = c3055;
                        str3 = str111;
                        int iM276112 = (C0619.m2761("᩻ۡ") ^ i41) * 115;
                        i44 = iM276112 ^ 1572607642;
                        c2364 = c2362;
                        i43 = ((iM276112 ^ i42) * (-31037)) ^ 2021730708;
                        sArr9 = sArr6;
                        dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212613;
                        i50 = i26;
                        c10469 = c10468;
                        dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3435;
                        r9 = r9;
                        C3054 c3051110 = c3055;
                        i49 = i49;
                        str5 = str5;
                        str4 = str3;
                        c3055 = c3051110;
                    }
                    break;
                case 341083421:
                case 1317031161:
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                    c10469 = c10469;
                    i3 = i50;
                    dialogInterfaceOnClickListenerC212610 = dialogInterfaceOnClickListenerC212615;
                    short[] sArr18 = sArr10;
                    int i64 = i49;
                    String strM12271 = C3779.m12271(abstractActivityC10144, C0773.m3169(C3998.m12925(sArr18, i64, 3, i45)) ^ 2127228592);
                    sArr10 = sArr18;
                    String str26 = str5;
                    i4 = i64;
                    str4 = str4;
                    str2 = str26;
                    C3054 c30520 = new C3054(abstractActivityC10144, C4583.m14375(str26, str4, strM12271));
                    if (RunnableC3646.f12471) {
                        c3055 = c30520;
                        int iM276113 = (C0619.m2761("֫ۘ") ^ i41) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i44 = iM276113 ^ (-1927485639);
                        i43 = ((iM276113 ^ i42) * (-2211)) ^ (-1947817949);
                        c10469 = c10469;
                        i49 = i4;
                        str5 = str2;
                        dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                    } else {
                        int iM27626 = (i42 - C0619.m2761("ܰ᩹")) * (-3);
                        i44 = iM27626 ^ 111229334;
                        i43 = ((iM27626 ^ i41) * 10109) ^ 696761597;
                        c10469 = c10469;
                        c3055 = c30520;
                        dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3436;
                        i49 = i4;
                        str5 = str2;
                    }
                    str4 = str4;
                    dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212610;
                    i50 = i3;
                    break;
                case 995586010:
                case 1795189818:
                    new C4179(abstractActivityC10144, abstractActivityC10144);
                    return z;
                case 1313129913:
                case 1985706134:
                    i35 = i54;
                    abstractActivityC10144.f32500 = (abstractActivityC10144.f32500 ? 1 : 0) ^ (z ? 1 : 0);
                    ?? r33 = r9;
                    C2375.m8061(C17202.m40375(C2419.m8173(ApplicationC17729.f58258), RunnableC1848.m6366(f32484, 301, 23, i45), abstractActivityC10144.f32500));
                    AbstractC0641.m2818(menuItem, abstractActivityC10144.f32500);
                    if (abstractActivityC10144.f32500) {
                        iM31616 = (i41 - C0619.m2761("ۤ֫")) * 87;
                        i36 = ((iM31616 ^ i42) * (-11325)) ^ 413397774;
                        i37 = 1206989766;
                        r31 = r33;
                    } else {
                        iM31616 = (C0773.m3169("᩵ܰ") + i42) * (-33);
                        i36 = ((iM31616 ^ i41) * (-101)) ^ (-509251093);
                        i37 = 1925092783;
                        r31 = r33;
                    }
                    i44 = iM31616 ^ i37;
                    i43 = i36;
                    i54 = i35;
                    r9 = r31;
                    break;
                case 1706900826:
                case 1954328137:
                    dialogInterfaceOnClickListenerC3435 = dialogInterfaceOnClickListenerC3436;
                    c10468 = c10469;
                    i26 = i50;
                    dialogInterfaceOnClickListenerC212613 = dialogInterfaceOnClickListenerC212615;
                    String str27 = str4;
                    str5 = str5;
                    i49 = i49;
                    c3055 = c3055;
                    sArr6 = sArr9;
                    str3 = str27;
                    if (iM8344 == (C0619.m2761(AbstractC0641.m2820(f32484, HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS, 3, i45)) ^ 2118461994)) {
                        iM31613 = (i41 - C0619.m2761("ۚ֫")) * (-61);
                        i27 = ((iM31613 ^ i42) * (-27197)) ^ (-2126598541);
                        i28 = 56064955;
                    } else {
                        iM31613 = C0619.m2761("ۚᩴ") ^ i41;
                        i27 = ((iM31613 ^ i42) * (-28269)) ^ (-1564332251);
                        i28 = 994091687;
                    }
                    i44 = iM31613 ^ i28;
                    i43 = i27;
                    sArr9 = sArr6;
                    dialogInterfaceOnClickListenerC212615 = dialogInterfaceOnClickListenerC212613;
                    i50 = i26;
                    c10469 = c10468;
                    dialogInterfaceOnClickListenerC3436 = dialogInterfaceOnClickListenerC3435;
                    r9 = r9;
                    C3054 c3051111 = c3055;
                    i49 = i49;
                    str5 = str5;
                    str4 = str3;
                    c3055 = c3051111;
                    break;
                default:
                    C11235.m28307(c2363, C0619.m2761(C2354.m7980(sArr12, 292, 3, i45)) ^ 2118710097, dialogInterfaceOnClickListenerC3436);
                    C3099.m10090(c2363);
                    return z;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0179  */
    /* JADX WARN: Code duplicated, block: B:54:0x023c  */
    /* JADX WARN: Code duplicated, block: B:61:0x027c  */
    /* JADX WARN: Code duplicated, block: B:64:0x02ae A[PHI: r14 r15
      0x02ae: PHI (r14v4 java.util.LinkedHashSet) = (r14v2 java.util.LinkedHashSet), (r14v3 java.util.LinkedHashSet), (r14v2 java.util.LinkedHashSet) binds: [B:62:0x0294, B:57:0x025e, B:45:0x01d6] A[DONT_GENERATE, DONT_INLINE]
      0x02ae: PHI (r15v4 java.util.LinkedHashSet) = (r15v2 java.util.LinkedHashSet), (r15v3 java.util.LinkedHashSet), (r15v2 java.util.LinkedHashSet) binds: [B:62:0x0294, B:57:0x025e, B:45:0x01d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private boolean m26224(boolean z) {
        int i;
        int i2;
        short[] sArr;
        int iM2761;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        int i7;
        short[] sArr2;
        boolean z3;
        int iM3169;
        int i8;
        int i9;
        int iM31610;
        int i10;
        int i11;
        int iM31611;
        int i12;
        int i13;
        int i14;
        int i15;
        short[] sArr3;
        int i16;
        int i17;
        int i18;
        boolean z4;
        int i19;
        int i20;
        int i21;
        boolean z5;
        int iM31612;
        int i22;
        int i23;
        int i24;
        StringBuilder sb;
        AbstractActivityC10144 abstractActivityC10144 = this;
        int i25 = 977401819;
        int i26 = AbstractC0641.f2496;
        int i27 = C2287.f7432;
        int iM2762 = (C0619.m2761("᩷۬") + i26) * 3;
        int i28 = ((iM2762 ^ i27) * (-15671)) ^ (-1745306627);
        int i29 = iM2762 ^ 1610905295;
        C11636 c11636 = null;
        String str = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i30 = 0;
        boolean z6 = false;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int iM7752 = 0;
        int i36 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        boolean z7 = false;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        StringBuilder sb2 = null;
        String str2 = null;
        String strM9937 = null;
        short[] sArr7 = null;
        int i41 = 0;
        int i42 = 0;
        String strM6952 = null;
        int i43 = 0;
        LinkedHashSet linkedHashSetM7502 = null;
        LinkedHashSet linkedHashSetM7503 = null;
        while (true) {
            i25 = i29 ^ (i28 & (((i25 ^ i27) * 12155) >> 31));
            switch (i25) {
                case -2146373426:
                case -64283915:
                    i14 = i42;
                    i15 = i38;
                    sArr3 = sArr5;
                    i16 = i40;
                    i17 = i30;
                    short[] sArr8 = sArr6;
                    z7 = z7;
                    i37 = i37;
                    sArr = sArr8;
                    iM7752 = C2288.m7752(abstractActivityC10144.f32497);
                    i18 = -1;
                    if (RunnableC0334.m2063()) {
                        z4 = false;
                        int iM31613 = C0773.m3169("᩻ᩳ") ^ i27;
                        int i44 = ((iM31613 ^ i26) * (-9391)) ^ 1878947442;
                        i29 = iM31613 ^ 107832450;
                        sArr5 = sArr3;
                        i40 = i16;
                        i38 = i15;
                        z6 = z4;
                        i31 = i18;
                        i30 = i17;
                        i42 = i14;
                        i28 = i44;
                    } else {
                        int iM31614 = (C0773.m3169("ܶ֫") ^ i27) * (-7);
                        i28 = ((iM31614 ^ i26) * 30521) ^ (-985689845);
                        i29 = iM31614 ^ (-1273694959);
                        sArr5 = sArr3;
                        i40 = i16;
                        i38 = i15;
                        i30 = i17;
                        i42 = i14;
                        z6 = false;
                        i31 = -1;
                    }
                    abstractActivityC10144 = this;
                    short[] sArr9 = sArr;
                    i37 = i37;
                    z7 = z7;
                    sArr6 = sArr9;
                    break;
                case -2108266005:
                case -1426563139:
                    return z7;
                case -2080505117:
                case -1042596079:
                    i20 = i42;
                    i21 = i38;
                    i24 = i30;
                    sb = sb2;
                    C3779.m12258(sb, C0619.m2756(sArr7, i43, i21, i20));
                    C3779.m12269(sb, i33);
                    strM6952 = C2023.m6952(sb);
                    if (C0487.f2131 > 0) {
                        int iM31615 = C0773.m3169("᩺֨") ^ i26;
                        z5 = z6;
                        i22 = ((iM31615 ^ i27) * (-28913)) ^ 1306946502;
                        i29 = iM31615 ^ (-943192951);
                        sb2 = sb;
                        i30 = i24;
                        i42 = i20;
                        i28 = i22;
                        z6 = z5;
                        i38 = i21;
                    } else {
                        z5 = z6;
                        int iM31616 = (i27 - C0773.m3169("ۧۗ")) * 91;
                        sb2 = sb;
                        int i45 = ((iM31616 ^ i26) * (-13221)) ^ (-791222957);
                        i29 = iM31616 ^ (-896230457);
                        z6 = z5;
                        i38 = i21;
                        int i46 = i24;
                        i42 = i20;
                        i28 = i45;
                        i30 = i46;
                    }
                    break;
                case -2038843949:
                case -1849889998:
                    C13473.m33144();
                    C1826.m6301();
                    return false;
                case -2030827096:
                case -1233700855:
                    C0619.m2763();
                    if (C2834.m9344() >= 0) {
                        i20 = i42;
                        i21 = i38;
                        i24 = i30;
                        z5 = z6;
                        sb = sb2;
                        int iM31617 = (i27 - C0773.m3169("ۧۗ")) * 91;
                        sb2 = sb;
                        int i47 = ((iM31617 ^ i26) * (-13221)) ^ (-791222957);
                        i29 = iM31617 ^ (-896230457);
                        z6 = z5;
                        i38 = i21;
                        int i48 = i24;
                        i42 = i20;
                        i28 = i47;
                        i30 = i48;
                    } else {
                        iM31610 = C0619.m2761("ۙۜ") ^ i26;
                        i10 = ((iM31610 ^ i27) * 24107) ^ 393097251;
                        i11 = -1354269961;
                        i29 = iM31610 ^ i11;
                        i28 = i10;
                    }
                    break;
                case -1945554690:
                case 1595152261:
                    i31 = i31;
                    i42 = i42;
                    i38 = i38;
                    i40 = i40;
                    i = i30;
                    z6 = z6;
                    sArr5 = sArr5;
                    short[] sArr10 = sArr6;
                    z7 = z7;
                    i37 = i37;
                    sArr = sArr10;
                    if (((s * s) + 9461776) - (s * s2) < 0) {
                        iM31611 = C0773.m3169("᩸ۤ") ^ i27;
                        i28 = ((iM31611 ^ i26) * 17129) ^ (-113977429);
                        i12 = 587039158;
                    } else {
                        iM31611 = C0773.m3169("۬᩶") ^ i26;
                        i28 = ((iM31611 ^ i27) * (-9631)) ^ 249189806;
                        i12 = 1278859729;
                    }
                    i29 = iM31611 ^ i12;
                    abstractActivityC10144 = this;
                    sArr5 = sArr5;
                    i40 = i40;
                    i30 = i;
                    z6 = z6;
                    i31 = i31;
                    i42 = i42;
                    i38 = i38;
                    short[] sArr11 = sArr;
                    i37 = i37;
                    z7 = z7;
                    sArr6 = sArr11;
                    break;
                case -1933554298:
                case -897979626:
                    if (z) {
                        iM31610 = (C0619.m2761("ܽܰ") + i27) * 89;
                        i10 = ((iM31610 ^ i26) * 19273) ^ 488439329;
                        i11 = 2033977223;
                    } else {
                        iM31610 = C0619.m2761("ۖ۠") ^ i27;
                        i10 = ((iM31610 ^ i26) * (-10177)) ^ (-568236352);
                        i11 = 1105617929;
                    }
                    i29 = iM31610 ^ i11;
                    i28 = i10;
                    break;
                case -1929098054:
                case -181664975:
                    i32++;
                    i33 = i34;
                    i19 = i36;
                    sArr = sArr6;
                    iM2761 = (C0773.m3169("ۖۚ") + i27) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i = i19;
                    i3 = ((iM2761 ^ i26) * (-3561)) ^ 1942736523;
                    i4 = -1558385841;
                    i29 = iM2761 ^ i4;
                    i28 = i3;
                    sArr5 = sArr5;
                    i40 = i40;
                    i30 = i;
                    z6 = z6;
                    i31 = i31;
                    i42 = i42;
                    i38 = i38;
                    short[] sArr12 = sArr;
                    i37 = i37;
                    z7 = z7;
                    sArr6 = sArr12;
                    break;
                case -1876526654:
                case -1197086879:
                    i31 = i31;
                    sArr = sArr6;
                    int i49 = i42;
                    i38 = i38;
                    i40 = i40;
                    i = i30;
                    z6 = z6;
                    sArr5 = sArr5;
                    int i50 = i39;
                    int iM31618 = C0773.m3169(C3077.m10047(sArr5, i50, i40, i49)) ^ 2102473357;
                    if (C2023.f6737) {
                        i42 = i49;
                        i39 = i50;
                        z7 = z7;
                        i37 = iM31618;
                        iM31611 = (C0619.m2761("۬ۜ") + i26) * 21;
                        i28 = ((iM31611 ^ i27) * (-15613)) ^ 1630216509;
                        i12 = -1602186927;
                        i29 = iM31611 ^ i12;
                        abstractActivityC10144 = this;
                        sArr5 = sArr5;
                        i40 = i40;
                        i30 = i;
                        z6 = z6;
                        i31 = i31;
                        i42 = i42;
                        i38 = i38;
                        short[] sArr13 = sArr;
                        i37 = i37;
                        z7 = z7;
                        sArr6 = sArr13;
                    } else {
                        int iM2763 = (C0619.m2761("᩹ۛ") + i26) * 87;
                        i28 = ((iM2763 ^ i27) * (-5703)) ^ 1818089282;
                        i29 = iM2763 ^ 588098674;
                        i39 = i50;
                        sArr5 = sArr5;
                        i40 = i40;
                        i30 = i;
                        z6 = z6;
                        i31 = i31;
                        i42 = i49;
                        i38 = i38;
                        sArr6 = sArr;
                        i37 = iM31618;
                    }
                    break;
                case -1866049837:
                case 2119114415:
                    m26255();
                    return z6;
                case -1818606792:
                case -1138982213:
                    i20 = i42;
                    i21 = i38;
                    int i51 = i30;
                    z5 = z6;
                    int i52 = i31;
                    short[] sArr14 = sArr6;
                    strM9937 = RunnableC3055.m9937(sArr14, 19, 3, i20);
                    if (C2287.f7432 >= 0) {
                        iM31612 = (C0773.m3169("ۗ᩺") + i26) * 81;
                        i22 = ((iM31612 ^ i27) * (-13909)) ^ 1943060645;
                        i23 = 1537790220;
                    } else {
                        iM31612 = (C0773.m3169("᩻ܳ") + i27) * 101;
                        i22 = ((iM31612 ^ i26) * (-3437)) ^ (-1824078166);
                        i23 = -1403834875;
                    }
                    i29 = iM31612 ^ i23;
                    sArr6 = sArr14;
                    i30 = i51;
                    i31 = i52;
                    i42 = i20;
                    i28 = i22;
                    z6 = z5;
                    i38 = i21;
                    break;
                case -1805206500:
                case 1628634847:
                    if (C2419.m8175(linkedHashSetM7502, linkedHashSetM7503)) {
                        iM31610 = C0619.m2761("ۖ۠") ^ i27;
                        i10 = ((iM31610 ^ i26) * (-10177)) ^ (-568236352);
                        i11 = 1105617929;
                    } else {
                        iM31610 = (i26 - C0619.m2761("ᩴܳ")) * 25;
                        i10 = ((iM31610 ^ i27) * (-29403)) ^ (-928815816);
                        i11 = 443704862;
                    }
                    i29 = iM31610 ^ i11;
                    i28 = i10;
                    break;
                case -1795637915:
                case 718474023:
                    if (i30 != i31) {
                        iM31610 = C0619.m2761("ۤۢ") ^ i26;
                        i10 = ((iM31610 ^ i27) * 2351) ^ 1800999593;
                        i11 = -1362606832;
                    } else {
                        i41 = i30;
                        i35 = i33;
                        iM31610 = C0773.m3169("᩶ۡ") ^ i27;
                        i10 = ((iM31610 ^ i26) * 27175) ^ 883765766;
                        i11 = 1916383659;
                    }
                    i29 = iM31610 ^ i11;
                    i28 = i10;
                    break;
                case -1675812770:
                case 605883548:
                    if (i30 != i32) {
                        iM31610 = (C0773.m3169("᩹᩶") ^ i26) * 49;
                        i10 = ((iM31610 ^ i27) * o.a.v) ^ (-1135353795);
                        i11 = 1821870502;
                    } else {
                        i41 = i30;
                        i35 = i33;
                        iM31610 = C0773.m3169("᩶ۡ") ^ i27;
                        i10 = ((iM31610 ^ i26) * 27175) ^ 883765766;
                        i11 = 1916383659;
                    }
                    i29 = iM31610 ^ i11;
                    i28 = i10;
                    break;
                case -1561778989:
                case -1014901737:
                    sArr = sArr6;
                    i13 = 1964;
                    int iM2764 = (C0619.m2761("ᩴܽ") + i26) * (-53);
                    i29 = iM2764 ^ (-1120422852);
                    i28 = ((iM2764 ^ i27) * (-12635)) ^ 1082851835;
                    sArr5 = sArr5;
                    i40 = i40;
                    i30 = i30;
                    z6 = z6;
                    i31 = i31;
                    i42 = i13;
                    i38 = i38;
                    abstractActivityC10144 = this;
                    short[] sArr15 = sArr;
                    i37 = i37;
                    z7 = z7;
                    sArr6 = sArr15;
                    break;
                case -1462139763:
                case -301393173:
                    RunnableC3646.m11813();
                    if (C1542.f5343 > 0) {
                        iM31610 = C0773.m3169("ۛܽ") ^ i27;
                        i10 = ((iM31610 ^ i26) * 20345) ^ (-901817553);
                        i11 = -803986553;
                        i29 = iM31610 ^ i11;
                        i28 = i10;
                    } else {
                        z4 = z6;
                        i14 = i42;
                        i15 = i38;
                        sArr3 = sArr5;
                        i17 = i30;
                        i18 = i31;
                        i16 = i40;
                        short[] sArr16 = sArr6;
                        z7 = z7;
                        i37 = i37;
                        sArr = sArr16;
                        int iM31619 = C0773.m3169("᩻ᩳ") ^ i27;
                        int i410 = ((iM31619 ^ i26) * (-9391)) ^ 1878947442;
                        i29 = iM31619 ^ 107832450;
                        sArr5 = sArr3;
                        i40 = i16;
                        i38 = i15;
                        z6 = z4;
                        i31 = i18;
                        i30 = i17;
                        i42 = i14;
                        i28 = i410;
                        abstractActivityC10144 = this;
                        short[] sArr17 = sArr;
                        i37 = i37;
                        z7 = z7;
                        sArr6 = sArr17;
                    }
                    break;
                case -1462056219:
                case 1911273039:
                    i5 = i31;
                    i42 = i42;
                    i6 = i38;
                    i = i30;
                    z2 = z6;
                    i7 = i37;
                    sArr2 = sArr6;
                    abstractActivityC10144.f32492 = i33;
                    z3 = z7;
                    abstractActivityC10144.f32504 = z3;
                    sArr5 = f32484;
                    i39 = 16;
                    i40 = 3;
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0773.m3169("ᩳ᩺") ^ i26;
                        i8 = ((iM3169 ^ i27) * 20761) ^ 221404873;
                        i9 = 1949432297;
                    } else {
                        iM3169 = C0773.m3169("۠ܳ") ^ i26;
                        i8 = ((iM3169 ^ i27) * (-2777)) ^ 1827224635;
                        i9 = 846245568;
                    }
                    i29 = iM3169 ^ i9;
                    z7 = z3;
                    i28 = i8;
                    sArr6 = sArr2;
                    z6 = z2;
                    i31 = i5;
                    i37 = i7;
                    i38 = i6;
                    i30 = i;
                    i42 = i42;
                    break;
                case -1368769390:
                case 1342400076:
                    if (C2310.f7472 >= 0) {
                        i5 = i31;
                        z3 = z7;
                        i42 = i42;
                        i6 = i38;
                        i = i30;
                        z2 = z6;
                        i7 = i37;
                        sArr2 = sArr6;
                        iM3169 = C0773.m3169("ᩳ᩺") ^ i26;
                        i8 = ((iM3169 ^ i27) * 20761) ^ 221404873;
                        i9 = 1949432297;
                        i29 = iM3169 ^ i9;
                        z7 = z3;
                        i28 = i8;
                        sArr6 = sArr2;
                        z6 = z2;
                        i31 = i5;
                        i37 = i7;
                        i38 = i6;
                        i30 = i;
                        i42 = i42;
                    } else {
                        z4 = z6;
                        i14 = i42;
                        i15 = i38;
                        sArr3 = sArr5;
                        i17 = i30;
                        i18 = i31;
                        i16 = i40;
                        short[] sArr18 = sArr6;
                        z7 = z7;
                        i37 = i37;
                        sArr = sArr18;
                        int iM316110 = C0773.m3169("᩻ᩳ") ^ i27;
                        int i411 = ((iM316110 ^ i26) * (-9391)) ^ 1878947442;
                        i29 = iM316110 ^ 107832450;
                        sArr5 = sArr3;
                        i40 = i16;
                        i38 = i15;
                        z6 = z4;
                        i31 = i18;
                        i30 = i17;
                        i42 = i14;
                        i28 = i411;
                        abstractActivityC10144 = this;
                        short[] sArr19 = sArr;
                        i37 = i37;
                        z7 = z7;
                        sArr6 = sArr19;
                    }
                    break;
                case -1340253858:
                case 1325126140:
                    z6 = z6;
                    int i53 = i42;
                    i = i30;
                    StringBuilder sb3 = sb2;
                    sArr7 = f32484;
                    i43 = 22;
                    if (C2288.f7433 <= 0) {
                        i42 = i53;
                        sb2 = sb3;
                        i38 = 2;
                        short[] sArr20 = sArr6;
                        z7 = z7;
                        i37 = i37;
                        sArr = sArr20;
                        iM31611 = (i27 - C0619.m2761("᩷ܺ")) * 15;
                        i28 = ((iM31611 ^ i26) * (-26143)) ^ 1674434717;
                        i12 = 1667725248;
                        i29 = iM31611 ^ i12;
                        abstractActivityC10144 = this;
                        sArr5 = sArr5;
                        i40 = i40;
                        i30 = i;
                        z6 = z6;
                        i31 = i31;
                        i42 = i42;
                        i38 = i38;
                        short[] sArr110 = sArr;
                        i37 = i37;
                        z7 = z7;
                        sArr6 = sArr110;
                    } else {
                        int iM31620 = (i27 - C0773.m3169("֨ܳ")) * 55;
                        i29 = iM31620 ^ 118865649;
                        sb2 = sb3;
                        i30 = i;
                        i42 = i53;
                        i28 = ((iM31620 ^ i26) * (-1015)) ^ (-979188462);
                        z6 = z6;
                        i38 = 2;
                    }
                    break;
                case -1163147701:
                case 418618522:
                    int i54 = i31;
                    int i55 = i37;
                    short[] sArr21 = sArr6;
                    int i56 = i42;
                    int i57 = i38;
                    int i58 = i40;
                    int i59 = i30;
                    boolean z8 = z6;
                    short[] sArr22 = sArr5;
                    if (i33 > 0) {
                        int iM31621 = (C0773.m3169("ۢ۠") + i27) * 127;
                        i28 = ((iM31621 ^ i26) * (-14697)) ^ (-1447714537);
                        i29 = iM31621 ^ (-36757642);
                    } else {
                        int iM2765 = (C0619.m2761("᩵ܺ") + i26) * (-109);
                        i29 = iM2765 ^ 1263960648;
                        i28 = ((iM2765 ^ i27) * (-32299)) ^ 1321581306;
                    }
                    sArr5 = sArr22;
                    i40 = i58;
                    sArr6 = sArr21;
                    i30 = i59;
                    z6 = z8;
                    i31 = i54;
                    i42 = i56;
                    i38 = i57;
                    i37 = i55;
                    z7 = true;
                    break;
                case -1070377847:
                case -18406788:
                    RunnableC3055.m9933();
                    AbstractC3624.m11755();
                    z4 = z6;
                    i14 = i42;
                    i15 = i38;
                    sArr3 = sArr5;
                    i17 = i30;
                    i18 = i31;
                    i16 = i40;
                    short[] sArr111 = sArr6;
                    z7 = z7;
                    i37 = i37;
                    sArr = sArr111;
                    int iM316111 = C0773.m3169("᩻ᩳ") ^ i27;
                    int i412 = ((iM316111 ^ i26) * (-9391)) ^ 1878947442;
                    i29 = iM316111 ^ 107832450;
                    sArr5 = sArr3;
                    i40 = i16;
                    i38 = i15;
                    z6 = z4;
                    i31 = i18;
                    i30 = i17;
                    i42 = i14;
                    i28 = i412;
                    abstractActivityC10144 = this;
                    short[] sArr112 = sArr;
                    i37 = i37;
                    z7 = z7;
                    sArr6 = sArr112;
                    break;
                case -1064434406:
                case 185780059:
                    i31 = i31;
                    i42 = i42;
                    i38 = i38;
                    i40 = i40;
                    i = i30;
                    z6 = z6;
                    sArr5 = sArr5;
                    short[] sArr23 = sArr6;
                    z7 = z7;
                    i37 = i37;
                    sArr = sArr23;
                    sArr4 = f32484;
                    c = 15;
                    if (RunnableC3055.f9898 >= 0) {
                        iM31611 = (C0619.m2761("۬ۜ") + i26) * 21;
                        i28 = ((iM31611 ^ i27) * (-15613)) ^ 1630216509;
                        i12 = -1602186927;
                    } else {
                        iM31611 = C0773.m3169("᩹᩺") ^ i26;
                        i28 = ((iM31611 ^ i27) * (-11439)) ^ 1217760342;
                        i12 = -1885436002;
                    }
                    i29 = iM31611 ^ i12;
                    abstractActivityC10144 = this;
                    sArr5 = sArr5;
                    i40 = i40;
                    i30 = i;
                    z6 = z6;
                    i31 = i31;
                    i42 = i42;
                    i38 = i38;
                    short[] sArr113 = sArr;
                    i37 = i37;
                    z7 = z7;
                    sArr6 = sArr113;
                    break;
                case -1054000836:
                case 1115829380:
                    C3734.m12152();
                    if (C2287.f7432 >= 0) {
                        i31 = i31;
                        i42 = i42;
                        i38 = i38;
                        i40 = i40;
                        i = i30;
                        z6 = z6;
                        sArr5 = sArr5;
                        short[] sArr24 = sArr6;
                        z7 = z7;
                        i37 = i37;
                        sArr = sArr24;
                        iM31611 = (C0619.m2761("۬ۜ") + i26) * 21;
                        i28 = ((iM31611 ^ i27) * (-15613)) ^ 1630216509;
                        i12 = -1602186927;
                        i29 = iM31611 ^ i12;
                        abstractActivityC10144 = this;
                        sArr5 = sArr5;
                        i40 = i40;
                        i30 = i;
                        z6 = z6;
                        i31 = i31;
                        i42 = i42;
                        i38 = i38;
                        short[] sArr114 = sArr;
                        i37 = i37;
                        z7 = z7;
                        sArr6 = sArr114;
                    } else {
                        iM31610 = (C0773.m3169("ᩳܰ") + i26) * 61;
                        i10 = ((iM31610 ^ i27) * (-3843)) ^ 1593479252;
                        i11 = -73348488;
                        i29 = iM31610 ^ i11;
                        i28 = i10;
                    }
                    break;
                case -1050339990:
                case -752323940:
                    str2 = c11636.f36482;
                    str = c11636.f36488;
                    if (str2 == null) {
                        i36 = i30;
                        i34 = i33;
                        i = i36;
                        z6 = z6;
                        i2 = i37;
                        sArr = sArr6;
                        sArr5 = sArr5;
                        int iM31622 = (i26 - C0773.m3169("ۛ᩵")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        boolean z9 = z7;
                        i28 = ((iM31622 ^ i27) * (-1223)) ^ 1158353490;
                        i29 = iM31622 ^ (-1947892462);
                        sArr5 = sArr5;
                        i40 = i40;
                        z7 = z9;
                        z6 = z6;
                        i31 = i31;
                        i38 = i38;
                        sArr6 = sArr;
                        i37 = i2;
                        i30 = i;
                        i42 = i42;
                    } else {
                        iM31610 = C0773.m3169("ۘᩴ") ^ i26;
                        i10 = ((iM31610 ^ i27) * (-1319)) ^ 441111621;
                        i11 = 1847946854;
                        i29 = iM31610 ^ i11;
                        i28 = i10;
                    }
                    break;
                case -1041162038:
                case 714183941:
                    if (!abstractActivityC10144.mo26249(str2)) {
                        iM31610 = (i26 - C0619.m2761("ᩴܳ")) * 25;
                        i10 = ((iM31610 ^ i27) * (-29403)) ^ (-928815816);
                        i11 = 443704862;
                        i29 = iM31610 ^ i11;
                        i28 = i10;
                    } else {
                        i36 = i30;
                        i34 = i33;
                        i = i36;
                        z6 = z6;
                        i2 = i37;
                        sArr = sArr6;
                        sArr5 = sArr5;
                        int iM31623 = (i26 - C0773.m3169("ۛ᩵")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        boolean z10 = z7;
                        i28 = ((iM31623 ^ i27) * (-1223)) ^ 1158353490;
                        i29 = iM31623 ^ (-1947892462);
                        sArr5 = sArr5;
                        i40 = i40;
                        z7 = z10;
                        z6 = z6;
                        i31 = i31;
                        i38 = i38;
                        sArr6 = sArr;
                        i37 = i2;
                        i30 = i;
                        i42 = i42;
                    }
                    break;
                case -1021843877:
                case 1354875759:
                    if (C3998.f13671 != 0) {
                        iM31610 = (C0773.m3169("ᩳܰ") + i26) * 61;
                        i10 = ((iM31610 ^ i27) * (-3843)) ^ 1593479252;
                        i11 = -73348488;
                    } else {
                        iM31610 = C0619.m2761("۠᩶") ^ i27;
                        i10 = ((iM31610 ^ i26) * 3357) ^ 1432347791;
                        i11 = -1059464778;
                    }
                    i29 = iM31610 ^ i11;
                    i28 = i10;
                    break;
                case -957563607:
                case -359159850:
                    sArr = sArr6;
                    i13 = 25262;
                    int iM2766 = (C0619.m2761("ᩴܽ") + i26) * (-53);
                    i29 = iM2766 ^ (-1120422852);
                    i28 = ((iM2766 ^ i27) * (-12635)) ^ 1082851835;
                    sArr5 = sArr5;
                    i40 = i40;
                    i30 = i30;
                    z6 = z6;
                    i31 = i31;
                    i42 = i13;
                    i38 = i38;
                    abstractActivityC10144 = this;
                    short[] sArr115 = sArr;
                    i37 = i37;
                    z7 = z7;
                    sArr6 = sArr115;
                    break;
                case -917087752:
                case -883993523:
                    sArr = sArr6;
                    i19 = -1;
                    i32 = 0;
                    i33 = 0;
                    iM2761 = (C0773.m3169("ۖۚ") + i27) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i = i19;
                    i3 = ((iM2761 ^ i26) * (-3561)) ^ 1942736523;
                    i4 = -1558385841;
                    i29 = iM2761 ^ i4;
                    i28 = i3;
                    sArr5 = sArr5;
                    i40 = i40;
                    i30 = i;
                    z6 = z6;
                    i31 = i31;
                    i42 = i42;
                    i38 = i38;
                    short[] sArr116 = sArr;
                    i37 = i37;
                    z7 = z7;
                    sArr6 = sArr116;
                    break;
                case -768761820:
                case -239438661:
                    linkedHashSetM7502 = C2195.m7502(str);
                    linkedHashSetM7503 = C2195.m7502(str2);
                    if (linkedHashSetM7502 != linkedHashSetM7503) {
                        iM31610 = C0773.m3169("ܳۧ") ^ i26;
                        i10 = ((iM31610 ^ i27) * (-30423)) ^ 1886493004;
                        i11 = -1737778512;
                    } else {
                        iM31610 = C0619.m2761("ۖ۠") ^ i27;
                        i10 = ((iM31610 ^ i26) * (-10177)) ^ (-568236352);
                        i11 = 1105617929;
                    }
                    i29 = iM31610 ^ i11;
                    i28 = i10;
                    break;
                case -698525456:
                case 717517108:
                    i31 = i31;
                    int i60 = iM7752;
                    i42 = i42;
                    i38 = i38;
                    i40 = i40;
                    i = i30;
                    z6 = z6;
                    sArr5 = sArr5;
                    short[] sArr25 = sArr6;
                    z7 = z7;
                    i37 = i37;
                    sArr = sArr25;
                    if (i32 < i60) {
                        int iM31624 = (i27 - C0773.m3169("ۛ᩹")) * 81;
                        iM7752 = i60;
                        i28 = ((iM31624 ^ i26) * (-11797)) ^ 2136763455;
                        i29 = iM31624 ^ (-438876471);
                    } else {
                        iM7752 = i60;
                        iM2761 = C0773.m3169("۫۫") ^ i26;
                        i3 = ((iM2761 ^ i27) * (-10029)) ^ (-816385264);
                        i4 = 813600473;
                        i29 = iM2761 ^ i4;
                        i28 = i3;
                    }
                    sArr5 = sArr5;
                    i40 = i40;
                    i30 = i;
                    z6 = z6;
                    i31 = i31;
                    i42 = i42;
                    i38 = i38;
                    short[] sArr117 = sArr;
                    i37 = i37;
                    z7 = z7;
                    sArr6 = sArr117;
                    break;
                case -676749858:
                case -7836135:
                    abstractActivityC10144.f32490[i33] = i30;
                    i35 = i33 + 1;
                    i41 = -1;
                    iM31610 = C0773.m3169("᩶ۡ") ^ i27;
                    i10 = ((iM31610 ^ i26) * 27175) ^ 883765766;
                    i11 = 1916383659;
                    i29 = iM31610 ^ i11;
                    i28 = i10;
                    break;
                case -527861755:
                case 332843915:
                    abstractActivityC10144.f32501.notifyDataSetChanged();
                    iM31610 = C0773.m3169("ۤ۠") ^ i27;
                    i10 = ((iM31610 ^ i26) * (-13127)) ^ (-577823501);
                    i11 = -27763494;
                    i29 = iM31610 ^ i11;
                    i28 = i10;
                    break;
                case -497634246:
                case 344525231:
                    C17202.m40372();
                    if (AbstractC3624.f12429 <= 0) {
                        iM31610 = (C0773.m3169("ᩳܰ") + i26) * 61;
                        i10 = ((iM31610 ^ i27) * (-3843)) ^ 1593479252;
                        i11 = -73348488;
                        i29 = iM31610 ^ i11;
                        i28 = i10;
                    } else {
                        i5 = i31;
                        z3 = z7;
                        i42 = i42;
                        i6 = i38;
                        i = i30;
                        z2 = z6;
                        i7 = i37;
                        sArr2 = sArr6;
                        iM3169 = C0773.m3169("ᩳ᩺") ^ i26;
                        i8 = ((iM3169 ^ i27) * 20761) ^ 221404873;
                        i9 = 1949432297;
                        i29 = iM3169 ^ i9;
                        z7 = z3;
                        i28 = i8;
                        sArr6 = sArr2;
                        z6 = z2;
                        i31 = i5;
                        i37 = i7;
                        i38 = i6;
                        i30 = i;
                        i42 = i42;
                    }
                    break;
                case -454028024:
                case 1936640770:
                    if (str == null) {
                        i36 = i30;
                        i34 = i33;
                        i = i36;
                        z6 = z6;
                        i2 = i37;
                        sArr = sArr6;
                        sArr5 = sArr5;
                        int iM31625 = (i26 - C0773.m3169("ۛ᩵")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        boolean z11 = z7;
                        i28 = ((iM31625 ^ i27) * (-1223)) ^ 1158353490;
                        i29 = iM31625 ^ (-1947892462);
                        sArr5 = sArr5;
                        i40 = i40;
                        z7 = z11;
                        z6 = z6;
                        i31 = i31;
                        i38 = i38;
                        sArr6 = sArr;
                        i37 = i2;
                        i30 = i;
                        i42 = i42;
                    } else {
                        iM31610 = (i26 - C0773.m3169("ۨ᩻")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i10 = ((iM31610 ^ i27) * 3263) ^ (-1863662590);
                        i11 = 306340961;
                        i29 = iM31610 ^ i11;
                        i28 = i10;
                    }
                    break;
                case -305664379:
                case 1448949580:
                    abstractActivityC10144.m26241(z6);
                    iM31610 = C0773.m3169("ۤ۠") ^ i27;
                    i10 = ((iM31610 ^ i26) * (-13127)) ^ (-577823501);
                    i11 = -27763494;
                    i29 = iM31610 ^ i11;
                    i28 = i10;
                    break;
                case -231926647:
                case 1730455871:
                    abstractActivityC10144.f32490[i35] = i32;
                    i34 = i35 + 1;
                    i36 = i41;
                    i = i30;
                    z6 = z6;
                    i2 = i37;
                    sArr = sArr6;
                    sArr5 = sArr5;
                    int iM31626 = (i26 - C0773.m3169("ۛ᩵")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    boolean z12 = z7;
                    i28 = ((iM31626 ^ i27) * (-1223)) ^ 1158353490;
                    i29 = iM31626 ^ (-1947892462);
                    sArr5 = sArr5;
                    i40 = i40;
                    z7 = z12;
                    z6 = z6;
                    i31 = i31;
                    i38 = i38;
                    sArr6 = sArr;
                    i37 = i2;
                    i30 = i;
                    i42 = i42;
                    break;
                case 73478305:
                case 211976734:
                    i31 = i31;
                    int i61 = i42;
                    i38 = i38;
                    i = i30;
                    z6 = z6;
                    int i62 = i37;
                    C1564.m5518(abstractActivityC10144, i62);
                    sb2 = new StringBuilder();
                    sArr6 = f32484;
                    if (C17202.f56030) {
                        int iM2767 = C0619.m2761("ۡܰ") ^ i27;
                        int i63 = ((iM2767 ^ i26) * 11145) ^ 1409153975;
                        i29 = iM2767 ^ 1007403229;
                        i37 = i62;
                        i30 = i;
                        z6 = z6;
                        i42 = i61;
                        i28 = i63;
                        i38 = i38;
                        i31 = i31;
                    } else {
                        i42 = i61;
                        sArr = sArr6;
                        sArr5 = sArr5;
                        i40 = i40;
                        z7 = z7;
                        i37 = i62;
                        iM31611 = (i27 - C0619.m2761("᩷ܺ")) * 15;
                        i28 = ((iM31611 ^ i26) * (-26143)) ^ 1674434717;
                        i12 = 1667725248;
                        i29 = iM31611 ^ i12;
                        abstractActivityC10144 = this;
                        sArr5 = sArr5;
                        i40 = i40;
                        i30 = i;
                        z6 = z6;
                        i31 = i31;
                        i42 = i42;
                        i38 = i38;
                        short[] sArr118 = sArr;
                        i37 = i37;
                        z7 = z7;
                        sArr6 = sArr118;
                    }
                    break;
                case 88628557:
                case 600942561:
                    i31 = i31;
                    i42 = i42;
                    i38 = i38;
                    i40 = i40;
                    i = i30;
                    z6 = z6;
                    sArr5 = sArr5;
                    short[] sArr26 = sArr6;
                    z7 = z7;
                    i37 = i37;
                    sArr = sArr26;
                    s = sArr4[c];
                    s2 = 6152;
                    if (RunnableC1848.f6235) {
                        iM31611 = (i27 - C0619.m2761("᩷ܺ")) * 15;
                        i28 = ((iM31611 ^ i26) * (-26143)) ^ 1674434717;
                        i12 = 1667725248;
                    } else {
                        iM31611 = (i27 - C0773.m3169("֡ܶ")) * (-83);
                        i28 = ((iM31611 ^ i26) * (-14613)) ^ (-1753845783);
                        i12 = -191128518;
                    }
                    i29 = iM31611 ^ i12;
                    abstractActivityC10144 = this;
                    sArr5 = sArr5;
                    i40 = i40;
                    i30 = i;
                    z6 = z6;
                    i31 = i31;
                    i42 = i42;
                    i38 = i38;
                    short[] sArr119 = sArr;
                    i37 = i37;
                    z7 = z7;
                    sArr6 = sArr119;
                    break;
                case 138159615:
                case 1087285289:
                    if (C3690.f12684 > 0) {
                        iM31610 = (C0773.m3169("ᩳܰ") + i26) * 61;
                        i10 = ((iM31610 ^ i27) * (-3843)) ^ 1593479252;
                        i11 = -73348488;
                    } else {
                        iM31610 = C0619.m2761("ۙۜ") ^ i26;
                        i10 = ((iM31610 ^ i27) * 24107) ^ 393097251;
                        i11 = -1354269961;
                    }
                    i29 = iM31610 ^ i11;
                    i28 = i10;
                    break;
                case 314501462:
                case 2119266909:
                    if (linkedHashSetM7502 != null) {
                        iM31610 = C0619.m2761("ܽ۟") ^ i27;
                        i10 = ((iM31610 ^ i26) * 6793) ^ 2066693058;
                        i11 = 343000407;
                    } else {
                        iM31610 = (i26 - C0619.m2761("ᩴܳ")) * 25;
                        i10 = ((iM31610 ^ i27) * (-29403)) ^ (-928815816);
                        i11 = 443704862;
                    }
                    i29 = iM31610 ^ i11;
                    i28 = i10;
                    break;
                case 630338598:
                case 1704222797:
                    C0269.m1775();
                    if (C2310.f7472 < 0) {
                        i42 = i42;
                        i38 = i38;
                        i = i30;
                        z6 = z6;
                        short[] sArr27 = sArr6;
                        z7 = z7;
                        i37 = i37;
                        sArr = sArr27;
                        iM31611 = (i27 - C0619.m2761("᩷ܺ")) * 15;
                        i28 = ((iM31611 ^ i26) * (-26143)) ^ 1674434717;
                        i12 = 1667725248;
                        i29 = iM31611 ^ i12;
                        abstractActivityC10144 = this;
                        sArr5 = sArr5;
                        i40 = i40;
                        i30 = i;
                        z6 = z6;
                        i31 = i31;
                        i42 = i42;
                        i38 = i38;
                        short[] sArr1110 = sArr;
                        i37 = i37;
                        z7 = z7;
                        sArr6 = sArr1110;
                    }
                    z4 = z6;
                    i14 = i42;
                    i15 = i38;
                    sArr3 = sArr5;
                    i17 = i30;
                    i18 = i31;
                    i16 = i40;
                    short[] sArr1111 = sArr6;
                    z7 = z7;
                    i37 = i37;
                    sArr = sArr1111;
                    int iM316112 = C0773.m3169("᩻ᩳ") ^ i27;
                    int i413 = ((iM316112 ^ i26) * (-9391)) ^ 1878947442;
                    i29 = iM316112 ^ 107832450;
                    sArr5 = sArr3;
                    i40 = i16;
                    i38 = i15;
                    z6 = z4;
                    i31 = i18;
                    i30 = i17;
                    i42 = i14;
                    i28 = i413;
                    abstractActivityC10144 = this;
                    short[] sArr1112 = sArr;
                    i37 = i37;
                    z7 = z7;
                    sArr6 = sArr1112;
                    break;
                case 650846464:
                case 1536925311:
                    i20 = i42;
                    i21 = i38;
                    i24 = i30;
                    z5 = z6;
                    sb = sb2;
                    C1783.m6234(sb, C3779.m12271(abstractActivityC10144, C0773.m3169(strM9937) ^ 2099560290));
                    if (C2023.m6964() > 0) {
                        sb2 = sb;
                        int iM31627 = C0773.m3169("ۨ֫") ^ i26;
                        i22 = ((iM31627 ^ i27) * (-27371)) ^ (-1978325958);
                        i29 = iM31627 ^ (-1003577395);
                        i30 = i24;
                        i42 = i20;
                        i28 = i22;
                        z6 = z5;
                        i38 = i21;
                    } else {
                        int iM316113 = (i27 - C0773.m3169("ۧۗ")) * 91;
                        sb2 = sb;
                        int i414 = ((iM316113 ^ i26) * (-13221)) ^ (-791222957);
                        i29 = iM316113 ^ (-896230457);
                        z6 = z5;
                        i38 = i21;
                        int i415 = i24;
                        i42 = i20;
                        i28 = i414;
                        i30 = i415;
                    }
                    break;
                case 1293855509:
                case 1519903336:
                    abstractActivityC10144.f32491 = strM6952;
                    abstractActivityC10144.f32495 = i31;
                    if (abstractActivityC10144.f32502) {
                        iM31610 = (C0773.m3169("ܺۙ") + i27) * (-111);
                        i10 = ((iM31610 ^ i26) * (-18843)) ^ (-770919669);
                        i11 = 587425828;
                    } else {
                        iM31610 = C0773.m3169("۟ۧ") ^ i27;
                        i10 = ((iM31610 ^ i26) * (-14021)) ^ 1399745775;
                        i11 = -1816031638;
                    }
                    i29 = iM31610 ^ i11;
                    i28 = i10;
                    break;
                default:
                    i31 = i31;
                    z7 = z7;
                    i42 = i42;
                    i38 = i38;
                    i40 = i40;
                    i = i30;
                    z6 = z6;
                    i2 = i37;
                    sArr = sArr6;
                    sArr5 = sArr5;
                    c11636 = (C11636) C3690.m11990(abstractActivityC10144.f32497, i32);
                    if (!c11636.m29232()) {
                        z7 = z7;
                        iM2761 = C0619.m2761("ܿ᩻") ^ i26;
                        i37 = i2;
                        i3 = ((iM2761 ^ i27) * (-2797)) ^ 2119209939;
                        i4 = 1509760114;
                        i29 = iM2761 ^ i4;
                        i28 = i3;
                        sArr5 = sArr5;
                        i40 = i40;
                        i30 = i;
                        z6 = z6;
                        i31 = i31;
                        i42 = i42;
                        i38 = i38;
                        short[] sArr1113 = sArr;
                        i37 = i37;
                        z7 = z7;
                        sArr6 = sArr1113;
                    } else {
                        i36 = i32;
                        i34 = i33;
                        int iM31628 = (i26 - C0773.m3169("ۛ᩵")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        boolean z13 = z7;
                        i28 = ((iM31628 ^ i27) * (-1223)) ^ 1158353490;
                        i29 = iM31628 ^ (-1947892462);
                        sArr5 = sArr5;
                        i40 = i40;
                        z7 = z13;
                        z6 = z6;
                        i31 = i31;
                        i38 = i38;
                        sArr6 = sArr;
                        i37 = i2;
                        i30 = i;
                        i42 = i42;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26245(int i, View view) {
        int iM3169;
        int i2;
        ArrayList arrayList = null;
        boolean z = false;
        boolean z2 = false;
        int i3 = 1848555335;
        int i4 = C3492.f12043;
        int i5 = C1321.f4751;
        int iM2761 = (i5 - C0619.m2761("֡ܿ")) * (-111);
        int i6 = ((iM2761 ^ i4) * (-4297)) ^ (-812755603);
        int i7 = 160577935;
        while (true) {
            int i8 = iM2761 ^ i7;
            while (true) {
                i3 = ((((i3 ^ i4) * (-21025)) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -1898712114:
                    case -502294872:
                        if (!RunnableC0334.m2063()) {
                            iM2761 = C0619.m2761("֫۟") ^ i5;
                            i6 = ((iM2761 ^ i4) * 6879) ^ 490279171;
                            i7 = -1524175425;
                        } else {
                            iM2761 = (C0773.m3169("᩵ۜ") + i4) * (-79);
                            i6 = ((iM2761 ^ i5) * 30687) ^ (-2080831922);
                            i7 = 1630613618;
                        }
                        break;
                    case -1748063859:
                    case 1746235554:
                        if (((C11636) C3690.m11990(arrayList, i)).m29230()) {
                            iM3169 = C0619.m2761("ܳܶ") ^ i4;
                            i6 = ((iM3169 ^ i5) * (-9079)) ^ (-515850071);
                            i2 = 148451482;
                        } else {
                            iM3169 = C0773.m3169("ۢۘ") ^ i5;
                            i6 = ((iM3169 ^ i4) * 22999) ^ (-80333077);
                            i2 = 1359561060;
                        }
                        i8 = iM3169 ^ i2;
                        z = true;
                        break;
                    case -1351475146:
                    case 153550196:
                        if (C2023.m6964() > 0) {
                            iM2761 = (C0619.m2761("ۤۖ") + i5) * (-103);
                            i6 = ((iM2761 ^ i4) * (-22637)) ^ (-1136665087);
                            i7 = 699637043;
                        } else {
                            iM2761 = C0773.m3169("ۘܺ") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-17033)) ^ 1565208498;
                            i7 = -268821890;
                        }
                        break;
                    case -1264818151:
                    case -1260955998:
                        C1542.m5459();
                        iM2761 = C0773.m3169("ۘܺ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-17033)) ^ 1565208498;
                        i7 = -268821890;
                        break;
                    case -1225891713:
                    case -820739084:
                        if (C3734.f12817 < 0) {
                            iM2761 = (i4 - C0773.m3169("ܺ۠")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i6 = ((iM2761 ^ i5) * (-9211)) ^ 191214486;
                            i7 = 376102347;
                        } else {
                            iM2761 = (C0619.m2761("֫֨") ^ i4) * (-123);
                            i6 = ((iM2761 ^ i5) * 25601) ^ (-1895650726);
                            i7 = 1785144537;
                        }
                        break;
                    case -1064277553:
                    case -541835963:
                        m26241(z);
                        iM2761 = (C0773.m3169("ᩴ֡") + i5) * 63;
                        i6 = ((iM2761 ^ i4) * 12829) ^ 860334972;
                        i7 = 268477975;
                        break;
                    case -845685118:
                    case 940447987:
                        if (C3448.m11248() == 0) {
                            iM2761 = C0619.m2761("᩶᩷") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-23519)) ^ (-593316254);
                            i7 = 1144286400;
                        } else {
                            iM2761 = (C0619.m2761("֫֨") ^ i4) * (-123);
                            i6 = ((iM2761 ^ i5) * 25601) ^ (-1895650726);
                            i7 = 1785144537;
                        }
                        break;
                    case -814194059:
                    case 1330111597:
                        m26241(z2);
                        iM2761 = C0619.m2761("᩵ۖ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-19457)) ^ 105815423;
                        i7 = 66087503;
                        break;
                    case -778633578:
                    case -616153197:
                        if (!C3998.m12920()) {
                            iM2761 = (C0773.m3169("ۡۛ") ^ i4) * 99;
                            i6 = ((iM2761 ^ i5) * (-29985)) ^ 1133080504;
                            i7 = 921231959;
                        } else {
                            iM2761 = (C0773.m3169("ᩴۘ") ^ i4) * (-127);
                            i6 = ((iM2761 ^ i5) * (-26149)) ^ 1620669605;
                            i7 = 1625344276;
                        }
                        break;
                    case -637817058:
                    case -141475287:
                        this.f32496 -= z ? 1 : 0;
                        if (C1564.f5401 > 0) {
                            iM2761 = C0773.m3169("ۘܰ") ^ i5;
                            i6 = ((iM2761 ^ i4) * 26465) ^ 1465890071;
                            i7 = -1286115727;
                        } else {
                            iM2761 = (C0773.m3169("᩵ۜ") + i4) * (-79);
                            i6 = ((iM2761 ^ i5) * 30687) ^ (-2080831922);
                            i7 = 1630613618;
                        }
                        break;
                    case -587844683:
                    case 268815751:
                        break;
                    case -491782790:
                    case 204745931:
                        if (C3099.f10023 > 0) {
                            iM2761 = (i4 - C0773.m3169("۫ᩴ")) * 13;
                            i6 = ((iM2761 ^ i5) * 16457) ^ (-1775833523);
                            i7 = 338297555;
                        } else {
                            iM2761 = C0773.m3169("ۘܺ") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-17033)) ^ 1565208498;
                            i7 = -268821890;
                        }
                        break;
                    case -430473736:
                    case 48046397:
                        if (!C1343.m4943()) {
                            iM2761 = C0619.m2761("֫۟") ^ i5;
                            i6 = ((iM2761 ^ i4) * 6879) ^ 490279171;
                            i7 = -1524175425;
                            break;
                        }
                        iM2761 = (C0773.m3169("ۡۛ") ^ i4) * 99;
                        i6 = ((iM2761 ^ i5) * (-29985)) ^ 1133080504;
                        i7 = 921231959;
                        break;
                    case -243797410:
                    case 275420879:
                        this.f32496 += z ? 1 : 0;
                        break;
                    case 62817360:
                    case 1309343049:
                        if (C0773.f2792 > 0) {
                            iM2761 = (C0773.m3169("᩵ۜ") + i4) * (-79);
                            i6 = ((iM2761 ^ i5) * 30687) ^ (-2080831922);
                            i7 = 1630613618;
                            break;
                        }
                        iM2761 = C0773.m3169("ۘܺ") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-17033)) ^ 1565208498;
                        i7 = -268821890;
                        break;
                    case 344342286:
                    case 2042775225:
                        if (C0487.m2356() < 0) {
                            iM2761 = C0773.m3169("ۗ᩸") ^ i5;
                            i6 = ((iM2761 ^ i4) * 29519) ^ (-1545435853);
                            i7 = -849363071;
                        } else {
                            iM2761 = (C0619.m2761("֫֨") ^ i4) * (-123);
                            i6 = ((iM2761 ^ i5) * 25601) ^ (-1895650726);
                            i7 = 1785144537;
                        }
                        break;
                    case 365914706:
                    case 2097072623:
                        z2 = false;
                        C2966.m9662(view, 0);
                        if (this.f32496 != 0) {
                            iM2761 = C0619.m2761("᩵ۖ") ^ i4;
                            i6 = ((iM2761 ^ i5) * (-19457)) ^ 105815423;
                            i7 = 66087503;
                            break;
                            break;
                        }
                        iM2761 = (i5 - C0619.m2761("ۛܳ")) * (-125);
                        i6 = ((iM2761 ^ i4) * (-16941)) ^ 1157212440;
                        i7 = -394146396;
                        break;
                    case 391362739:
                    case 670679629:
                        if (C1564.f5401 > 0) {
                            iM2761 = C0619.m2761("᩹ۙ") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-8899)) ^ 1160443190;
                            i7 = -2054262716;
                        } else {
                            iM2761 = C0619.m2761("֫۟") ^ i5;
                            i6 = ((iM2761 ^ i4) * 6879) ^ 490279171;
                            i7 = -1524175425;
                        }
                        break;
                    case 456084016:
                    case 1921700416:
                        C3077.m10046(view, C3296.f10761);
                        if (this.f32496 != 0) {
                            iM2761 = (C0773.m3169("ᩴ֡") + i5) * 63;
                            i6 = ((iM2761 ^ i4) * 12829) ^ 860334972;
                            i7 = 268477975;
                            break;
                            break;
                        }
                        iM2761 = (C0773.m3169("֨ۤ") + i4) * 61;
                        i6 = ((iM2761 ^ i5) * 2301) ^ (-280297304);
                        i7 = 509277556;
                        break;
                    case 588616895:
                    case 630828131:
                        if (C1564.f5401 > 0) {
                            iM2761 = (C0773.m3169("ᩴ֨") ^ i4) * 75;
                            i6 = ((iM2761 ^ i5) * (-9657)) ^ 126222519;
                            i7 = 1847139296;
                        } else {
                            iM2761 = (C0773.m3169("᩵ۜ") + i4) * (-79);
                            i6 = ((iM2761 ^ i5) * 30687) ^ (-2080831922);
                            i7 = 1630613618;
                        }
                        break;
                    case 1231167079:
                    case 1883482469:
                        C3033.m9845();
                        C2966.m9664();
                        break;
                    default:
                        arrayList = this.f32497;
                        if (!C1783.m6232()) {
                            iM2761 = (C0619.m2761("֫֨") ^ i4) * (-123);
                            i6 = ((iM2761 ^ i5) * 25601) ^ (-1895650726);
                            i7 = 1785144537;
                            break;
                        }
                        iM2761 = (i4 - C0773.m3169("۫᩶")) * (-31);
                        i6 = ((iM2761 ^ i5) * (-28825)) ^ (-448305780);
                        i7 = 42899859;
                        break;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ int m26235(AbstractActivityC10144 abstractActivityC10144, int i) {
        return abstractActivityC10144.f32490[i];
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ff A[PHI: r3 r4
      0x00ff: PHI (r3v4 l.ܽܺۗ) = (r3v3 l.ܽܺۗ), (r3v2 l.ܽܺۗ) binds: [B:43:0x00fd, B:10:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x00ff: PHI (r4v4 java.util.ArrayList) = (r4v3 java.util.ArrayList), (r4v2 java.util.ArrayList) binds: [B:43:0x00fd, B:10:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0132 A[PHI: r1 r12
      0x0132: PHI (r1v4 l.ܽܺۗ) = (r1v2 l.ܽܺۗ), (r1v2 l.ܽܺۗ), (r1v2 l.ܽܺۗ), (r1v6 l.ܽܺۗ) binds: [B:16:0x0050, B:13:0x004a, B:10:0x003f, B:47:0x0130] A[DONT_GENERATE, DONT_INLINE]
      0x0132: PHI (r12v7 java.util.function.IntUnaryOperator) = 
      (r12v4 java.util.function.IntUnaryOperator)
      (r12v4 java.util.function.IntUnaryOperator)
      (r12v4 java.util.function.IntUnaryOperator)
      (r12v8 java.util.function.IntUnaryOperator)
     binds: [B:16:0x0050, B:13:0x004a, B:10:0x003f, B:47:0x0130] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x016b A[PHI: r6
      0x016b: PHI (r6v4 l.ܽܺۗ) = (r6v2 l.ܽܺۗ), (r6v3 l.ܽܺۗ), (r6v2 l.ܽܺۗ) binds: [B:51:0x0169, B:33:0x00b0, B:13:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final List m26256() {
        int iM2761;
        int i;
        int iM2762;
        int i2;
        int i3 = 0;
        InterfaceC17686 interfaceC17686Range = null;
        InterfaceC17686 map = null;
        final ArrayList arrayList = null;
        IntFunction intFunction = null;
        InterfaceC17686 map2 = null;
        int i4 = 969818131;
        int i5 = C3033.f9831;
        int i6 = C11235.f35427;
        int iM3169 = C0773.m3169("ܺ᩸") ^ i6;
        int i7 = ((iM3169 ^ i5) * (-15919)) ^ (-1159911740);
        int i8 = 316402657;
        while (true) {
            int i9 = iM3169 ^ i8;
            IntUnaryOperator intUnaryOperator = null;
            while (true) {
                i4 = ((((i4 ^ i5) * 14753) >> 31) & i7) ^ i9;
                switch (i4) {
                    case -2143739189:
                    case -29100401:
                        if (this.f32504) {
                            iM2761 = (C0619.m2761("ۙۜ") + i5) * (-115);
                            i7 = ((iM2761 ^ i6) * 11769) ^ 541026177;
                            i = -1721933169;
                        } else {
                            iM2761 = (C0619.m2761("᩷ܺ") ^ i6) * (-105);
                            i7 = ((iM2761 ^ i5) * (-23337)) ^ 1197349213;
                            i = -769447750;
                        }
                        i9 = iM2761 ^ i;
                        break;
                    case -1942766729:
                    case 235510929:
                        if (C20932.f66974 > 0) {
                            iM2761 = C0773.m3169("ܰۙ") ^ i6;
                            i7 = ((iM2761 ^ i5) * (-9221)) ^ 2010226012;
                            i = 884916670;
                        } else {
                            iM2761 = (C0619.m2761("᩻ۜ") ^ i5) * (-83);
                            i7 = ((iM2761 ^ i6) * 21257) ^ 302046796;
                            i = -1711795511;
                        }
                        i9 = iM2761 ^ i;
                        break;
                    case -1708873985:
                    case 1706359899:
                        return map.mapToObj(intFunction).toList();
                    case -1603493570:
                    case -434660507:
                        AbstractC0116.m1243();
                        if (C2419.m8174() >= 0) {
                            iM2761 = (C0619.m2761("᩻ۜ") ^ i5) * (-83);
                            i7 = ((iM2761 ^ i6) * 21257) ^ 302046796;
                            i = -1711795511;
                        } else {
                            iM2761 = C0619.m2761("ܰۘ") ^ i6;
                            i7 = ((iM2761 ^ i5) * (-3129)) ^ (-1421774788);
                            i = -1662301587;
                        }
                        i9 = iM2761 ^ i;
                        break;
                    case -1554839674:
                    case 280940089:
                        C17202.m40372();
                        iM2761 = C0773.m3169("ܰۙ") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-9221)) ^ 2010226012;
                        i = 884916670;
                        i9 = iM2761 ^ i;
                        break;
                    case -1506006277:
                    case 328235531:
                        if (this.f32502) {
                            iM2761 = C0773.m3169("ܳۙ") ^ i5;
                            i7 = ((iM2761 ^ i6) * (-231)) ^ (-1400984543);
                            i = -1741305472;
                        } else {
                            iM2761 = (C0619.m2761("᩺᩹") ^ i6) * 59;
                            i7 = ((iM2761 ^ i5) * 8827) ^ (-535574002);
                            i = -1700448670;
                        }
                        i9 = iM2761 ^ i;
                        break;
                    case -1503914173:
                    case 1657369426:
                        C3033.m9845();
                        return null;
                    case -1494946970:
                    case 953177650:
                        if (this.f32502) {
                            iM2762 = C0773.m3169("ۗܽ") ^ i6;
                            i7 = ((iM2762 ^ i5) * 2299) ^ 2094509231;
                            i2 = -681459853;
                        } else {
                            iM2762 = C0619.m2761("۟ۜ") ^ i6;
                            i7 = ((iM2762 ^ i5) * (-8811)) ^ (-1253194613);
                            i2 = 1181946386;
                        }
                        i9 = iM2762 ^ i2;
                        i3 = 0;
                        break;
                    case -290752637:
                    case 1504740831:
                        C3099.m10086(arrayList);
                        intFunction = new IntFunction() { // from class: l.ܺ۬ۤ
                            @Override // java.util.function.IntFunction
                            public final Object apply(int i10) {
                                ArrayList arrayList2 = null;
                                int i11 = -1636792970;
                                int i12 = C1321.f4751;
                                int i13 = C2354.f7599;
                                int iM2763 = C0619.m2761("ۘ᩵") ^ i12;
                                int i14 = ((iM2763 ^ i13) * 12737) ^ 126722730;
                                int i15 = 1660189775;
                                while (true) {
                                    i11 = ((((i11 ^ i13) * (-9873)) >> 31) & i14) ^ (iM2763 ^ i15);
                                    switch (i11) {
                                        case -2126959630:
                                        case -853328569:
                                            C1826.m6301();
                                            return null;
                                        case -1876217418:
                                        case 234370390:
                                            if (C3077.f9998) {
                                                iM2763 = C0619.m2761("֨ۗ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * 22707) ^ (-861609044);
                                                i15 = -1747304914;
                                            } else {
                                                iM2763 = C0619.m2761("ᩴᩴ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * 26139) ^ 646582414;
                                                i15 = 619249038;
                                            }
                                            break;
                                        case -1836615978:
                                        case 670682005:
                                            C2310.m7813();
                                            if (!C3077.f9998) {
                                                iM2763 = C0619.m2761("ۤۤ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * 12317) ^ (-266917718);
                                                i15 = 291110626;
                                            } else {
                                                iM2763 = (C0619.m2761("᩷ۧ") + i12) * 61;
                                                i14 = ((iM2763 ^ i13) * 13725) ^ 2135492927;
                                                i15 = -976431747;
                                            }
                                            break;
                                        case -1773310292:
                                        case 1416420768:
                                            if (RunnableC1848.m6360()) {
                                                iM2763 = (C0619.m2761("᩷ۧ") + i12) * 61;
                                                i14 = ((iM2763 ^ i13) * 13725) ^ 2135492927;
                                                i15 = -976431747;
                                            } else {
                                                iM2763 = C0773.m3169("ۢۖ") ^ i12;
                                                i14 = ((iM2763 ^ i13) * (-12685)) ^ (-1837593271);
                                                i15 = -702617363;
                                            }
                                            break;
                                        case -1723719847:
                                        case -1265911138:
                                            if (C23916.f77426 > 0) {
                                                iM2763 = C0619.m2761("ۤۤ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * 12317) ^ (-266917718);
                                                i15 = 291110626;
                                            } else {
                                                iM2763 = C0773.m3169("ۢ֨") ^ i12;
                                                i14 = ((iM2763 ^ i13) * (-29945)) ^ (-1760187080);
                                                i15 = 874476203;
                                            }
                                            break;
                                        case -1651805560:
                                        case 759147572:
                                            if (C17202.f56030) {
                                                iM2763 = (C0773.m3169("ۘۘ") + i12) * (-67);
                                                i14 = ((iM2763 ^ i13) * 10885) ^ 1303473239;
                                                i15 = -209100957;
                                            } else {
                                                iM2763 = (C0773.m3169("ۜۗ") ^ i12) * 45;
                                                i14 = ((iM2763 ^ i13) * 331) ^ (-1541947529);
                                                i15 = -440666003;
                                            }
                                            break;
                                        case -1392292755:
                                        case 1764354602:
                                            if (!C2023.f6737) {
                                                iM2763 = C0619.m2761("ᩴᩴ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * 26139) ^ 646582414;
                                                i15 = 619249038;
                                            } else {
                                                iM2763 = C0619.m2761("ۤۤ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * 12317) ^ (-266917718);
                                                i15 = 291110626;
                                            }
                                            break;
                                        case -1335212306:
                                        case 1996404514:
                                            C2375.m8065();
                                            C2419.m8174();
                                            iM2763 = C0619.m2761("ۤۤ") ^ i13;
                                            i14 = ((iM2763 ^ i12) * 12317) ^ (-266917718);
                                            i15 = 291110626;
                                            break;
                                        case -1134510802:
                                        case -751124820:
                                            if (C2287.f7432 >= 0) {
                                                iM2763 = C0619.m2761("ۤۤ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * 12317) ^ (-266917718);
                                                i15 = 291110626;
                                            } else {
                                                iM2763 = (C0619.m2761("۫ܿ") ^ i12) * (-97);
                                                i14 = ((iM2763 ^ i13) * 21481) ^ (-619963681);
                                                i15 = -600779361;
                                            }
                                            break;
                                        case -712799944:
                                        case 1012283918:
                                            if (C3448.f11240 >= 0) {
                                                iM2763 = (C0773.m3169("ۜۗ") ^ i12) * 45;
                                                i14 = ((iM2763 ^ i13) * 331) ^ (-1541947529);
                                                i15 = -440666003;
                                            } else {
                                                iM2763 = (C0773.m3169("ۘᩴ") ^ i12) * (-17);
                                                i14 = ((iM2763 ^ i13) * 16811) ^ (-2066604348);
                                                i15 = -317327068;
                                            }
                                            break;
                                        case -575458618:
                                        case 1887890338:
                                            if (C3734.f12817 >= 0) {
                                                iM2763 = C0619.m2761("ۤۤ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * 12317) ^ (-266917718);
                                                i15 = 291110626;
                                            } else {
                                                iM2763 = C0773.m3169("۠ۘ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * (-28833)) ^ (-1049735239);
                                                i15 = -947281450;
                                            }
                                            break;
                                        case -311018289:
                                        case 910479330:
                                            return (C11636) C1542.m5457(arrayList2, i10);
                                        case 49370765:
                                        case 1575799130:
                                            arrayList2 = arrayList;
                                            if (C3779.m12264()) {
                                                iM2763 = (C0619.m2761("ܿۘ") + i13) * 35;
                                                i14 = ((iM2763 ^ i12) * (-9769)) ^ (-1463328275);
                                                i15 = 1345767668;
                                            } else {
                                                iM2763 = (C0773.m3169("ۜۗ") ^ i12) * 45;
                                                i14 = ((iM2763 ^ i13) * 331) ^ (-1541947529);
                                                i15 = -440666003;
                                            }
                                            break;
                                        case 129663377:
                                        case 468806449:
                                            if (RunnableC3055.f9898 >= 0) {
                                                iM2763 = C0619.m2761("ۤۤ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * 12317) ^ (-266917718);
                                                i15 = 291110626;
                                            } else {
                                                iM2763 = (C0619.m2761("᩸᩸") + i13) * (-53);
                                                i14 = ((iM2763 ^ i12) * (-26599)) ^ 36765649;
                                                i15 = -934013796;
                                            }
                                            break;
                                        case 1474917310:
                                        case 2126531338:
                                            if (C3077.f9998) {
                                                iM2763 = C0619.m2761("ۜ᩸") ^ i12;
                                                i14 = ((iM2763 ^ i13) * (-11413)) ^ (-899888163);
                                                i15 = 917701073;
                                            } else {
                                                iM2763 = C0619.m2761("ᩴᩴ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * 26139) ^ 646582414;
                                                i15 = 619249038;
                                            }
                                            break;
                                        default:
                                            if (C3033.m9845() <= 0) {
                                                iM2763 = (C0619.m2761("᩷ۧ") + i12) * 61;
                                                i14 = ((iM2763 ^ i13) * 13725) ^ 2135492927;
                                                i15 = -976431747;
                                            } else {
                                                iM2763 = (i13 - C0773.m3169("ۗᩳ")) * 15;
                                                i14 = ((iM2763 ^ i12) * (-6771)) ^ (-1772426921);
                                                i15 = -400956252;
                                            }
                                            break;
                                    }
                                }
                            }
                        };
                        if (!C2966.m9664()) {
                        }
                        iM2761 = C0619.m2761("۟᩵") ^ i6;
                        i7 = ((iM2761 ^ i5) * 9503) ^ (-1172323364);
                        i = -145350535;
                        i9 = iM2761 ^ i;
                        break;
                        break;
                    case -71596378:
                    case 1166235489:
                        InterfaceC17686 interfaceC17686Range2 = C11719.range(i3, this.f32492);
                        if (C0862.f3233 != 0) {
                            iM2761 = C0773.m3169("ܰۙ") ^ i6;
                            i7 = ((iM2761 ^ i5) * (-9221)) ^ 2010226012;
                            i = 884916670;
                        } else {
                            map2 = interfaceC17686Range2.map(new IntUnaryOperator() { // from class: l.᩻۬ۤ
                                public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator2) {
                                    return C21263.$default$andThen(this, intUnaryOperator2);
                                }

                                @Override // java.util.function.IntUnaryOperator
                                public final int applyAsInt(int i10) {
                                    return AbstractActivityC10144.m26235(this.f81065, i10);
                                }

                                public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator2) {
                                    return C21263.$default$compose(this, intUnaryOperator2);
                                }
                            });
                            if (AbstractC3624.m11755() != 0) {
                                iM2761 = C0619.m2761("ܰۘ") ^ i6;
                                i7 = ((iM2761 ^ i5) * (-3129)) ^ (-1421774788);
                                i = -1662301587;
                            } else {
                                iM2761 = C0773.m3169("ۤۖ") ^ i5;
                                i7 = ((iM2761 ^ i6) * 26419) ^ 524822761;
                                i = -254170669;
                            }
                        }
                        i9 = iM2761 ^ i;
                        break;
                    case 520443403:
                    case 931294470:
                        final ArrayList arrayList2 = this.f32497;
                        C1321.m4848(arrayList2);
                        if (!C17202.f56030) {
                            break;
                        }
                        InterfaceC20670 interfaceC20670MapToObj = map2.mapToObj(new IntFunction() { // from class: l.ܺ۬ۤ
                            @Override // java.util.function.IntFunction
                            public final Object apply(int i10) {
                                ArrayList arrayList3 = null;
                                int i11 = -1636792970;
                                int i12 = C1321.f4751;
                                int i13 = C2354.f7599;
                                int iM2763 = C0619.m2761("ۘ᩵") ^ i12;
                                int i14 = ((iM2763 ^ i13) * 12737) ^ 126722730;
                                int i15 = 1660189775;
                                while (true) {
                                    i11 = ((((i11 ^ i13) * (-9873)) >> 31) & i14) ^ (iM2763 ^ i15);
                                    switch (i11) {
                                        case -2126959630:
                                        case -853328569:
                                            C1826.m6301();
                                            return null;
                                        case -1876217418:
                                        case 234370390:
                                            if (C3077.f9998) {
                                                iM2763 = C0619.m2761("֨ۗ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * 22707) ^ (-861609044);
                                                i15 = -1747304914;
                                            } else {
                                                iM2763 = C0619.m2761("ᩴᩴ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * 26139) ^ 646582414;
                                                i15 = 619249038;
                                            }
                                            break;
                                        case -1836615978:
                                        case 670682005:
                                            C2310.m7813();
                                            if (!C3077.f9998) {
                                                iM2763 = C0619.m2761("ۤۤ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * 12317) ^ (-266917718);
                                                i15 = 291110626;
                                            } else {
                                                iM2763 = (C0619.m2761("᩷ۧ") + i12) * 61;
                                                i14 = ((iM2763 ^ i13) * 13725) ^ 2135492927;
                                                i15 = -976431747;
                                            }
                                            break;
                                        case -1773310292:
                                        case 1416420768:
                                            if (RunnableC1848.m6360()) {
                                                iM2763 = (C0619.m2761("᩷ۧ") + i12) * 61;
                                                i14 = ((iM2763 ^ i13) * 13725) ^ 2135492927;
                                                i15 = -976431747;
                                            } else {
                                                iM2763 = C0773.m3169("ۢۖ") ^ i12;
                                                i14 = ((iM2763 ^ i13) * (-12685)) ^ (-1837593271);
                                                i15 = -702617363;
                                            }
                                            break;
                                        case -1723719847:
                                        case -1265911138:
                                            if (C23916.f77426 > 0) {
                                                iM2763 = C0619.m2761("ۤۤ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * 12317) ^ (-266917718);
                                                i15 = 291110626;
                                            } else {
                                                iM2763 = C0773.m3169("ۢ֨") ^ i12;
                                                i14 = ((iM2763 ^ i13) * (-29945)) ^ (-1760187080);
                                                i15 = 874476203;
                                            }
                                            break;
                                        case -1651805560:
                                        case 759147572:
                                            if (C17202.f56030) {
                                                iM2763 = (C0773.m3169("ۘۘ") + i12) * (-67);
                                                i14 = ((iM2763 ^ i13) * 10885) ^ 1303473239;
                                                i15 = -209100957;
                                            } else {
                                                iM2763 = (C0773.m3169("ۜۗ") ^ i12) * 45;
                                                i14 = ((iM2763 ^ i13) * 331) ^ (-1541947529);
                                                i15 = -440666003;
                                            }
                                            break;
                                        case -1392292755:
                                        case 1764354602:
                                            if (!C2023.f6737) {
                                                iM2763 = C0619.m2761("ᩴᩴ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * 26139) ^ 646582414;
                                                i15 = 619249038;
                                            } else {
                                                iM2763 = C0619.m2761("ۤۤ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * 12317) ^ (-266917718);
                                                i15 = 291110626;
                                            }
                                            break;
                                        case -1335212306:
                                        case 1996404514:
                                            C2375.m8065();
                                            C2419.m8174();
                                            iM2763 = C0619.m2761("ۤۤ") ^ i13;
                                            i14 = ((iM2763 ^ i12) * 12317) ^ (-266917718);
                                            i15 = 291110626;
                                            break;
                                        case -1134510802:
                                        case -751124820:
                                            if (C2287.f7432 >= 0) {
                                                iM2763 = C0619.m2761("ۤۤ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * 12317) ^ (-266917718);
                                                i15 = 291110626;
                                            } else {
                                                iM2763 = (C0619.m2761("۫ܿ") ^ i12) * (-97);
                                                i14 = ((iM2763 ^ i13) * 21481) ^ (-619963681);
                                                i15 = -600779361;
                                            }
                                            break;
                                        case -712799944:
                                        case 1012283918:
                                            if (C3448.f11240 >= 0) {
                                                iM2763 = (C0773.m3169("ۜۗ") ^ i12) * 45;
                                                i14 = ((iM2763 ^ i13) * 331) ^ (-1541947529);
                                                i15 = -440666003;
                                            } else {
                                                iM2763 = (C0773.m3169("ۘᩴ") ^ i12) * (-17);
                                                i14 = ((iM2763 ^ i13) * 16811) ^ (-2066604348);
                                                i15 = -317327068;
                                            }
                                            break;
                                        case -575458618:
                                        case 1887890338:
                                            if (C3734.f12817 >= 0) {
                                                iM2763 = C0619.m2761("ۤۤ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * 12317) ^ (-266917718);
                                                i15 = 291110626;
                                            } else {
                                                iM2763 = C0773.m3169("۠ۘ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * (-28833)) ^ (-1049735239);
                                                i15 = -947281450;
                                            }
                                            break;
                                        case -311018289:
                                        case 910479330:
                                            return (C11636) C1542.m5457(arrayList3, i10);
                                        case 49370765:
                                        case 1575799130:
                                            arrayList3 = arrayList2;
                                            if (C3779.m12264()) {
                                                iM2763 = (C0619.m2761("ܿۘ") + i13) * 35;
                                                i14 = ((iM2763 ^ i12) * (-9769)) ^ (-1463328275);
                                                i15 = 1345767668;
                                            } else {
                                                iM2763 = (C0773.m3169("ۜۗ") ^ i12) * 45;
                                                i14 = ((iM2763 ^ i13) * 331) ^ (-1541947529);
                                                i15 = -440666003;
                                            }
                                            break;
                                        case 129663377:
                                        case 468806449:
                                            if (RunnableC3055.f9898 >= 0) {
                                                iM2763 = C0619.m2761("ۤۤ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * 12317) ^ (-266917718);
                                                i15 = 291110626;
                                            } else {
                                                iM2763 = (C0619.m2761("᩸᩸") + i13) * (-53);
                                                i14 = ((iM2763 ^ i12) * (-26599)) ^ 36765649;
                                                i15 = -934013796;
                                            }
                                            break;
                                        case 1474917310:
                                        case 2126531338:
                                            if (C3077.f9998) {
                                                iM2763 = C0619.m2761("ۜ᩸") ^ i12;
                                                i14 = ((iM2763 ^ i13) * (-11413)) ^ (-899888163);
                                                i15 = 917701073;
                                            } else {
                                                iM2763 = C0619.m2761("ᩴᩴ") ^ i13;
                                                i14 = ((iM2763 ^ i12) * 26139) ^ 646582414;
                                                i15 = 619249038;
                                            }
                                            break;
                                        default:
                                            if (C3033.m9845() <= 0) {
                                                iM2763 = (C0619.m2761("᩷ۧ") + i12) * 61;
                                                i14 = ((iM2763 ^ i13) * 13725) ^ 2135492927;
                                                i15 = -976431747;
                                            } else {
                                                iM2763 = (i13 - C0773.m3169("ۗᩳ")) * 15;
                                                i14 = ((iM2763 ^ i12) * (-6771)) ^ (-1772426921);
                                                i15 = -400956252;
                                            }
                                            break;
                                    }
                                }
                            }
                        });
                        int i10 = 0;
                        if (C2310.f7472 >= 0) {
                            break;
                        }
                        return interfaceC20670MapToObj.filter(new C17603(i10)).toList();
                    case 666404405:
                    case 2011761708:
                        InterfaceC20670 interfaceC20670M40367 = C17202.m40367(this.f32497);
                        if (C2288.f7433 > 0) {
                            int i11 = 0;
                            if (C1343.f4799 != 0) {
                                break;
                            }
                            return interfaceC20670M40367.filter(new C17603(i11)).toList();
                        }
                        iM2761 = C0619.m2761("ܰۘ") ^ i6;
                        i7 = ((iM2761 ^ i5) * (-3129)) ^ (-1421774788);
                        i = -1662301587;
                        i9 = iM2761 ^ i;
                        break;
                    case 765928688:
                    case 1400660706:
                        map = interfaceC17686Range.map(intUnaryOperator);
                        arrayList = this.f32497;
                        if (C2702.f8586 <= 0) {
                            iM2761 = (C0773.m3169("֫ۢ") + i5) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i7 = ((iM2761 ^ i6) * 18417) ^ (-545707120);
                            i = -422233782;
                        } else {
                            iM2761 = (C0619.m2761("۠ۧ") ^ i5) * 85;
                            i7 = ((iM2761 ^ i6) * (-26019)) ^ 483694637;
                            i = -36675154;
                        }
                        i9 = iM2761 ^ i;
                        break;
                    case 869785248:
                    case 2079501182:
                        C4238.m13540();
                        if (C2287.f7432 >= 0) {
                            iM2761 = (C0619.m2761("᩻ۜ") ^ i5) * (-83);
                            i7 = ((iM2761 ^ i6) * 21257) ^ 302046796;
                            i = -1711795511;
                        } else {
                            iM2761 = (C0773.m3169("֫ۢ") + i5) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i7 = ((iM2761 ^ i6) * 18417) ^ (-545707120);
                            i = -422233782;
                        }
                        i9 = iM2761 ^ i;
                        break;
                    case 1129487051:
                    case 1823296692:
                        return this.f32497;
                    default:
                        interfaceC17686Range = C11719.range(i3, this.f32492);
                        if (C13473.f42873 == 0) {
                            intUnaryOperator = new IntUnaryOperator() { // from class: l.ܶ۬ۤ
                                public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator2) {
                                    return C21263.$default$andThen(this, intUnaryOperator2);
                                }

                                @Override // java.util.function.IntUnaryOperator
                                public final int applyAsInt(int i12) {
                                    return AbstractActivityC10144.m26215(this.f52198, i12);
                                }

                                public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator2) {
                                    return C21263.$default$compose(this, intUnaryOperator2);
                                }
                            };
                            if (C2023.f6737) {
                                iM2761 = (C0619.m2761("᩻ۜ") ^ i5) * (-83);
                                i7 = ((iM2761 ^ i6) * 21257) ^ 302046796;
                                i = -1711795511;
                            } else {
                                iM2761 = (i5 - C0773.m3169("᩹ۤ")) * 55;
                                i7 = ((iM2761 ^ i6) * 25837) ^ 845766955;
                                i = -1438713255;
                            }
                            i9 = iM2761 ^ i;
                        }
                        break;
                }
            }
            iM3169 = (C0619.m2761("ۘᩴ") + i5) * (-31);
            i7 = ((iM3169 ^ i6) * (-10303)) ^ (-2125724788);
            i8 = -1882692872;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ int m26215(AbstractActivityC10144 abstractActivityC10144, int i) {
        return abstractActivityC10144.f32490[i];
    }
}
