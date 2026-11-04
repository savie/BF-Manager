package l;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.textfield.IndicatorViewController;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.concurrent.locks.ReentrantLock;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۘۡ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RP */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC4062 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶᩻ܶ, reason: not valid java name and contains not printable characters */
    private static final short[] f13862 = {5351, -8071, -8069, -8084, -8079, -8082, -8079, -8084, -8095, -18899, 26277, -20348, -30213, -29511, -24916, -8066, -8079, -8074, -8068, -8114, -8079, -8067, -8081, -8102, -8095, -8111, -8068, -8144, -8138, -8138, -8138, -8143, 28797, -27638, 25390, -18339, -17777, 24875, 30345, 26244, -26807, -27486, 25456, 30673, -28063, -31941, -20399, 25812, -16817, -25014, -25512, 28220, -18027, 31528, 31278, -29744, 6547, 6461, 1830, 14420, 25499, 25494, 25482, 25490, 25499, 623, -679, -690, -680, -677, -700, -699, -680, -690, -30360, 30304, 26469, -27832, 30779, -27213, 30846, -25223, -28647, -21039, 32308, -28394, 8509, 23751, 23754, 23766, 23758, 23751, 6923, 16335, 16344, 16334, 16333, 16338, 16339, 16334, 16344, -17626, 22873, -20337, 20575, 26774, 18917, -23497, -20969, 19400, 20472, -24268, 21679, 25240, 29036, 24515, 26605, 18680, 19878, 1107, -6261, 28876, -25596, 25079, 27406, -19320, 25315, 27773, -25364, -31879, -32295, 24969, -18918, 25586, -30056, 27057, -6211, -6263, -6257, -6244, -6253, -6258, -6255, -6244, -6263, -6252, -6254, -6253, -6235, -6258, -6248, -6263, -6215, -6264, -6257, -6244, -6263, -6252, -6254, -6253, -6187, -6189, -6189, -6189, -6188, 32496, -18504, -27194, 26910, -17422, 25322, 29790, -28600, 31368, 24921, 28541, 26549, -16456, 29892, 26724, 30550, -18072, 28130};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C24750 f13863;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final View f13864;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final TextInputLayout f13865;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final TextView f13866;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final byte[] f13867;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final TextInputLayout f13868;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f13869;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final View f13870;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f13871;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Button f13872;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 f13873;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Button f13874;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r32v1 */
    /* JADX WARN: Type inference failed for: r32v10 */
    /* JADX WARN: Type inference failed for: r32v11 */
    /* JADX WARN: Type inference failed for: r32v12 */
    /* JADX WARN: Type inference failed for: r32v13 */
    /* JADX WARN: Type inference failed for: r32v17 */
    /* JADX WARN: Type inference failed for: r32v18 */
    /* JADX WARN: Type inference failed for: r32v19 */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r32v20 */
    /* JADX WARN: Type inference failed for: r32v21 */
    /* JADX WARN: Type inference failed for: r32v22 */
    /* JADX WARN: Type inference failed for: r32v25 */
    /* JADX WARN: Type inference failed for: r32v26 */
    /* JADX WARN: Type inference failed for: r32v27 */
    /* JADX WARN: Type inference failed for: r32v28 */
    /* JADX WARN: Type inference failed for: r32v29 */
    /* JADX WARN: Type inference failed for: r32v3 */
    /* JADX WARN: Type inference failed for: r32v30 */
    /* JADX WARN: Type inference failed for: r32v32 */
    /* JADX WARN: Type inference failed for: r32v33 */
    /* JADX WARN: Type inference failed for: r32v34 */
    /* JADX WARN: Type inference failed for: r32v35 */
    /* JADX WARN: Type inference failed for: r32v36 */
    /* JADX WARN: Type inference failed for: r32v37 */
    /* JADX WARN: Type inference failed for: r32v38 */
    /* JADX WARN: Type inference failed for: r32v39 */
    /* JADX WARN: Type inference failed for: r32v4 */
    /* JADX WARN: Type inference failed for: r32v40 */
    /* JADX WARN: Type inference failed for: r32v41 */
    /* JADX WARN: Type inference failed for: r32v42 */
    /* JADX WARN: Type inference failed for: r32v43 */
    /* JADX WARN: Type inference failed for: r32v44 */
    /* JADX WARN: Type inference failed for: r32v45 */
    /* JADX WARN: Type inference failed for: r32v5 */
    /* JADX WARN: Type inference failed for: r32v6 */
    /* JADX WARN: Type inference failed for: r32v8 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r4v71 */
    /* JADX WARN: Type inference failed for: r4v72 */
    /* JADX WARN: Type inference failed for: r4v73 */
    /* JADX WARN: Type inference failed for: r4v74 */
    /* JADX WARN: Type inference failed for: r4v75 */
    public ViewOnClickListenerC4062(AbstractActivityC17204 abstractActivityC17204, C24750 c24750, byte[] bArr, String str) {
        ?? r32;
        int i;
        Button button;
        short[] sArr;
        int i2;
        short[] sArr2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        ?? r33;
        int i7;
        short[] sArr3;
        int i8;
        short[] sArr4;
        int i9;
        short[] sArr5;
        int i10;
        ?? r34;
        int i11;
        ?? r35;
        int iM2761;
        int iM2762;
        int i12;
        int i13;
        ?? r4;
        int i14;
        int i15;
        ?? r36;
        int i16;
        int i17;
        int i18;
        short[] sArr6;
        int i19;
        short[] sArr7;
        int i20;
        String str2;
        String strM5471;
        int iM3169;
        int i21;
        ?? r37;
        View view;
        boolean z2;
        View view2;
        int iM31610;
        int i22;
        int i23;
        Button button2;
        ?? r38;
        ?? r39;
        ?? r310;
        int iM2763;
        int i24;
        ?? r311;
        ?? r312;
        final ViewOnClickListenerC4062 viewOnClickListenerC4062 = this;
        AbstractActivityC17204 abstractActivityC17205 = abstractActivityC17204;
        int i25 = -1856328091;
        int i26 = C3690.f12684;
        int i27 = C2702.f8586;
        short s = f13862[0];
        int i28 = s + 15496;
        int i29 = (s * s) + 240126016;
        int i30 = (i28 * i28) - (i29 + i29) <= 0 ? 57368 : 40980;
        C3734.m12144(abstractActivityC17205, C13473.m33137(f13862, 1, 8, i30));
        int iM2764 = (C0619.m2761("ܶ۠") + i27) * 123;
        int i31 = ((iM2764 ^ i26) * 32581) ^ (-398368176);
        View view3 = null;
        TextInputLayout textInputLayout = null;
        Button button3 = null;
        DialogInterfaceC8327 dialogInterfaceC8327M10090 = null;
        Runnable runnable = null;
        String str3 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        boolean z3 = false;
        int i32 = 0;
        int i33 = 0;
        int iM31611 = 0;
        int iM2765 = 0;
        int iM31612 = 0;
        int iM2766 = 0;
        int i34 = 0;
        ViewOnClickListenerC16544 viewOnClickListenerC16544 = null;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = iM2764 ^ 2005978965;
        View viewM11246 = null;
        View view4 = null;
        View viewM9333 = null;
        View viewM9334 = null;
        Object[] objArr = null;
        int i42 = 0;
        View viewM9942 = null;
        String str4 = null;
        TextInputLayout textInputLayout2 = null;
        Button button4 = null;
        short[] sArr12 = null;
        int iM2767 = 0;
        while (true) {
            i25 = i41 ^ (i31 & (((i25 ^ i26) * (-11403)) >> 31));
            switch (i25) {
                case -2100567526:
                case 882235597:
                    button = button3;
                    z = z3 ? 1 : 0;
                    View view5 = viewM9333;
                    C0269.m1781(view5, str4);
                    viewOnClickListenerC4062.f13866 = (TextView) view5;
                    if (!RunnableC1848.f6235) {
                        int iM2768 = C0619.m2761("۫᩺") ^ i26;
                        i22 = ((iM2768 ^ i27) * (-26629)) ^ (-99722354);
                        i41 = iM2768 ^ 708333280;
                        viewM9333 = view5;
                        z3 = z;
                        i42 = i42;
                        button3 = button;
                        i31 = i22;
                    } else {
                        viewM9333 = view5;
                        r32 = i42;
                        i = i33;
                        i4 = iM2767;
                        sArr = sArr10;
                        i2 = i38;
                        sArr2 = sArr11;
                        i3 = i39;
                        int iM2769 = (C0619.m2761("۫ܳ") + i26) * (-83);
                        int i43 = i4;
                        i13 = ((iM2769 ^ i27) * 26091) ^ 505455240;
                        i41 = iM2769 ^ 4970517;
                        i39 = i3;
                        iM2767 = i43;
                        sArr11 = sArr2;
                        sArr10 = sArr;
                        i38 = i2;
                        i33 = i;
                        r37 = r32;
                        r4 = r37;
                        button2 = button;
                        i31 = i13;
                        i42 = r4;
                        z3 = z;
                        button3 = button2;
                    }
                    break;
                case -2059850278:
                case 251703048:
                    r37 = i42;
                    button = button3;
                    z = z3 ? 1 : 0;
                    View viewM9335 = C2834.m9333(viewM9942, C0773.m3169(str3) ^ 2099683232);
                    C2310.m7811(viewM9335, str4);
                    int iM27610 = (C0619.m2761("ۛܿ") + i27) * (-95);
                    viewM9333 = viewM9333;
                    i13 = ((iM27610 ^ i26) * 731) ^ (-36653841);
                    sArr11 = sArr11;
                    i39 = i39;
                    i41 = iM27610 ^ (-1031638413);
                    view4 = viewM9335;
                    r4 = r37;
                    button2 = button;
                    i31 = i13;
                    i42 = r4;
                    z3 = z;
                    button3 = button2;
                    break;
                case -1887637316:
                case -603717133:
                    ?? r313 = i42;
                    view = view4;
                    button = button3;
                    z2 = z3 ? 1 : 0;
                    view2 = viewM9333;
                    viewOnClickListenerC4062.f13864 = view;
                    sArr11 = f13862;
                    i39 = 35;
                    i40 = 3;
                    r312 = r313;
                    if (C0487.f2131 <= 0) {
                        iM31610 = (C0619.m2761("۬᩺") ^ i27) * 41;
                        i22 = ((iM31610 ^ i26) * 30181) ^ 1997391252;
                        i23 = -1270026663;
                        r311 = r312;
                    } else {
                        iM31610 = (i26 - C0773.m3169("֡ۧ")) * 7;
                        i22 = ((iM31610 ^ i27) * (-13345)) ^ 104356344;
                        i23 = 1624056050;
                        r311 = r313;
                    }
                    i41 = iM31610 ^ i23;
                    viewM9333 = view2;
                    view4 = view;
                    z3 = z2;
                    i42 = r311;
                    button3 = button;
                    i31 = i22;
                    break;
                case -1768806275:
                case 650840425:
                    C1146.m4231();
                    if (C20932.f66974 <= 0) {
                        r312 = i42;
                        view = view4;
                        button = button3;
                        z2 = z3 ? 1 : 0;
                        view2 = viewM9333;
                        iM31610 = (C0619.m2761("۬᩺") ^ i27) * 41;
                        i22 = ((iM31610 ^ i26) * 30181) ^ 1997391252;
                        i23 = -1270026663;
                        r311 = r312;
                        i41 = iM31610 ^ i23;
                        viewM9333 = view2;
                        view4 = view;
                        z3 = z2;
                        i42 = r311;
                        button3 = button;
                        i31 = i22;
                    } else {
                        iM2763 = (C0619.m2761("۟ۖ") + i26) * 75;
                        i31 = ((iM2763 ^ i27) * 20745) ^ (-1417110786);
                        i24 = 194421872;
                        i41 = iM2763 ^ i24;
                    }
                    break;
                case -1758734420:
                case 1447108859:
                    C2930.m9576(button4);
                    textInputLayout.setHelperTextEnabled(i42);
                    textInputLayout.setHelperTextColor(ColorStateList.valueOf(C3296.f10768));
                    objArr = new Object[i42];
                    objArr[z3 ? 1 : 0] = str;
                    sArr12 = f13862;
                    i32 = 50;
                    iM2763 = C0619.m2761("۬ۡ") ^ i27;
                    i31 = ((iM2763 ^ i26) * 31387) ^ 1538617685;
                    i24 = 2043582595;
                    i41 = iM2763 ^ i24;
                    break;
                case -1659824786:
                case -407683183:
                    button = button3;
                    z = z3 ? 1 : 0;
                    View viewM9336 = C2834.m9333(viewM9942, iM31611 ^ 2102394022);
                    C0269.m1781(viewM9336, str4);
                    int iM31613 = C0773.m3169("ۖܳ") ^ i26;
                    i22 = ((iM31613 ^ i27) * 833) ^ (-383513803);
                    i41 = iM31613 ^ (-786515267);
                    view3 = viewM9336;
                    z3 = z;
                    i42 = i42;
                    button3 = button;
                    i31 = i22;
                    break;
                case -1451437161:
                case 207539019:
                    C17617.m41267(textInputLayout2);
                    C2361 c2361M3794 = C0950.m3794(abstractActivityC17204);
                    C1343.m4952(c2361M3794, viewM9942);
                    C2375.m8062(c2361M3794, z3);
                    dialogInterfaceC8327M10090 = C3099.m10090(c2361M3794);
                    viewOnClickListenerC4062.f13873 = dialogInterfaceC8327M10090;
                    runnable = new Runnable() { // from class: l.᩹ۡ᩻
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewOnClickListenerC4062.m13109(this.f75907);
                        }
                    };
                    iM2763 = C0619.m2761("֨ۧ") ^ i27;
                    i31 = ((iM2763 ^ i26) * (-25951)) ^ 563773849;
                    i24 = 876808391;
                    i41 = iM2763 ^ i24;
                    break;
                case -1409046783:
                case -523587581:
                    ?? r314 = i42;
                    button = button3;
                    i18 = i37;
                    int i44 = i38;
                    sArr6 = sArr11;
                    i19 = i39;
                    z = z3 ? 1 : 0;
                    short[] sArr13 = sArr10;
                    String strM12266 = C3779.m12266(sArr13, i18, i44, i30);
                    sArr7 = sArr13;
                    View view6 = viewM11246;
                    C0269.m1781(view6, strM12266);
                    viewOnClickListenerC4062.f13870 = view6;
                    i20 = i44;
                    str2 = strM12266;
                    strM5471 = C1542.m5471(f13862, 32, 3, i30);
                    r310 = r314;
                    if (C3734.m12152() >= 0) {
                        iM3169 = (C0773.m3169("᩷ۤ") ^ i26) * 35;
                        i16 = ((iM3169 ^ i27) * (-15861)) ^ 813252338;
                        i21 = -2107057234;
                        r39 = r310;
                    } else {
                        iM3169 = (C0773.m3169("ۖۧ") ^ i26) * (-111);
                        i16 = ((iM3169 ^ i27) * (-21295)) ^ 399389023;
                        i21 = 828789659;
                        r39 = r314;
                    }
                    i17 = iM3169 ^ i21;
                    i39 = i19;
                    i37 = i18;
                    str4 = str2;
                    sArr11 = sArr6;
                    sArr10 = sArr7;
                    i38 = i20;
                    str3 = strM5471;
                    z3 = z;
                    r36 = r39;
                    button3 = button;
                    i31 = i16;
                    i41 = i17;
                    r38 = r36;
                    i42 = r38;
                    break;
                case -1335699124:
                case -450774438:
                    TextInputLayout textInputLayout3 = textInputLayout2;
                    button = button3;
                    viewOnClickListenerC4062.f13868 = textInputLayout3;
                    textInputLayout3.setEndIconVisible(false);
                    textInputLayout3.setEndIconMode(i42);
                    if (C3779.f12953 <= 0) {
                        textInputLayout2 = textInputLayout3;
                        r32 = i42;
                        i = i33;
                        i4 = iM2767;
                        sArr = sArr10;
                        i2 = i38;
                        sArr2 = sArr11;
                        i3 = i39;
                        z = false;
                        int iM27611 = (C0619.m2761("۫ܳ") + i26) * (-83);
                        int i45 = i4;
                        i13 = ((iM27611 ^ i27) * 26091) ^ 505455240;
                        i41 = iM27611 ^ 4970517;
                        i39 = i3;
                        iM2767 = i45;
                        sArr11 = sArr2;
                        sArr10 = sArr;
                        i38 = i2;
                        i33 = i;
                        r37 = r32;
                        r4 = r37;
                        button2 = button;
                        i31 = i13;
                        i42 = r4;
                        z3 = z;
                        button3 = button2;
                    } else {
                        int iM27612 = C0619.m2761("۫۬") ^ i27;
                        textInputLayout2 = textInputLayout3;
                        button3 = button;
                        z3 = false;
                        i31 = ((iM27612 ^ i26) * (-24449)) ^ 554124280;
                        i41 = iM27612 ^ (-177629650);
                    }
                    break;
                case -1268925876:
                case 832610890:
                    textInputLayout.setHelperText(C13473.m33142(abstractActivityC17205, C0773.m3169(C2485.m8350(sArr12, i32, 3, i30)) ^ 2129785072, objArr));
                    C17617.m41267(textInputLayout);
                    if (C1783.f6087 <= 0) {
                        iM2763 = (C0619.m2761("۟ۖ") + i26) * 75;
                        i31 = ((iM2763 ^ i27) * 20745) ^ (-1417110786);
                        i24 = 194421872;
                    } else {
                        iM2763 = C0773.m3169("᩺֨") ^ i26;
                        i31 = ((iM2763 ^ i27) * 15345) ^ (-1672703666);
                        i24 = -1752389479;
                    }
                    i41 = iM2763 ^ i24;
                    break;
                case -1244031820:
                case 695876485:
                    if (!C3492.m11488()) {
                        iM2763 = (C0619.m2761("۟ۖ") + i26) * 75;
                        i31 = ((iM2763 ^ i27) * 20745) ^ (-1417110786);
                        i24 = 194421872;
                        i41 = iM2763 ^ i24;
                    } else {
                        r32 = i42;
                        i = i33;
                        button = button3;
                        sArr = sArr10;
                        i2 = i38;
                        sArr2 = sArr11;
                        i3 = i39;
                        z = z3 ? 1 : 0;
                        i4 = iM2767;
                        int iM27613 = (C0619.m2761("۫ܳ") + i26) * (-83);
                        int i46 = i4;
                        i13 = ((iM27613 ^ i27) * 26091) ^ 505455240;
                        i41 = iM27613 ^ 4970517;
                        i39 = i3;
                        iM2767 = i46;
                        sArr11 = sArr2;
                        sArr10 = sArr;
                        i38 = i2;
                        i33 = i;
                        r37 = r32;
                        r4 = r37;
                        button2 = button;
                        i31 = i13;
                        i42 = r4;
                        z3 = z;
                        button3 = button2;
                    }
                    break;
                case -1193812930:
                case -1072140149:
                    button = button3;
                    z = z3 ? 1 : 0;
                    viewM9334 = C2834.m9333(viewM9942, iM31612 ^ 2125465873);
                    if (C11235.f35427 < 0) {
                        iM2762 = (C0619.m2761("ܽ᩹") + i27) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM2762 ^ i26) * (-26095)) ^ 1391234857;
                        i12 = 1430087105;
                        i6 = iM2762 ^ i12;
                        i42 = i42;
                        int i47 = i5;
                        i41 = i6;
                        z3 = z;
                        button3 = button;
                        i31 = i47;
                    } else {
                        strM5471 = str3;
                        sArr7 = sArr10;
                        i20 = i38;
                        sArr6 = sArr11;
                        i19 = i39;
                        str2 = str4;
                        i18 = i37;
                        r310 = i42;
                        iM3169 = (C0773.m3169("᩷ۤ") ^ i26) * 35;
                        i16 = ((iM3169 ^ i27) * (-15861)) ^ 813252338;
                        i21 = -2107057234;
                        r39 = r310;
                        i17 = iM3169 ^ i21;
                        i39 = i19;
                        i37 = i18;
                        str4 = str2;
                        sArr11 = sArr6;
                        sArr10 = sArr7;
                        i38 = i20;
                        str3 = strM5471;
                        z3 = z;
                        r36 = r39;
                        button3 = button;
                        i31 = i16;
                        i41 = i17;
                        r38 = r36;
                        i42 = r38;
                    }
                    break;
                case -1171733737:
                case -1125774995:
                    Button button5 = button3;
                    boolean z4 = z3 ? 1 : 0;
                    viewOnClickListenerC4062.f13871 = abstractActivityC17205;
                    viewOnClickListenerC4062.f13863 = c24750;
                    viewOnClickListenerC4062.f13867 = bArr;
                    viewOnClickListenerC4062.f13869 = true;
                    ViewOnClickListenerC16544 viewOnClickListenerC16545 = c24750.f80134;
                    int iM31614 = (i27 - C0773.m3169("ܶ֨")) * 13;
                    abstractActivityC17205 = abstractActivityC17204;
                    viewOnClickListenerC16544 = viewOnClickListenerC16545;
                    i35 = i35;
                    i39 = i39;
                    i36 = i36;
                    z3 = z4 ? 1 : 0;
                    sArr11 = sArr11;
                    sArr10 = sArr10;
                    i38 = i38;
                    sArr9 = sArr9;
                    i41 = iM31614 ^ (-2017696819);
                    button3 = button5;
                    iM2767 = iM2767;
                    i31 = ((iM31614 ^ i26) * (-16891)) ^ 1638116931;
                    i33 = i33;
                    i42 = 1;
                    viewOnClickListenerC4062 = this;
                    break;
                case -1154523950:
                case 411594633:
                    if (C3099.f10023 > 0) {
                        r33 = i42;
                        i = i33;
                        i7 = iM2767;
                        button = button3;
                        sArr3 = sArr9;
                        i8 = i36;
                        sArr4 = sArr10;
                        i9 = i38;
                        sArr5 = sArr11;
                        i10 = i39;
                        z = z3 ? 1 : 0;
                        iM2761 = C0619.m2761("ܿ᩷") ^ i27;
                        i5 = ((iM2761 ^ i26) * 21533) ^ (-1909178363);
                        i11 = -38303728;
                        r35 = r33;
                        i6 = iM2761 ^ i11;
                        i39 = i10;
                        i36 = i8;
                        sArr11 = sArr5;
                        sArr10 = sArr4;
                        i38 = i9;
                        sArr9 = sArr3;
                        iM2767 = i7;
                        r34 = r35;
                        i33 = i;
                        i42 = r34;
                        int i48 = i5;
                        i41 = i6;
                        z3 = z;
                        button3 = button;
                        i31 = i48;
                    } else {
                        r32 = i42;
                        i = i33;
                        button = button3;
                        sArr = sArr10;
                        i2 = i38;
                        sArr2 = sArr11;
                        i3 = i39;
                        z = z3 ? 1 : 0;
                        i4 = iM2767;
                        int iM27614 = (C0619.m2761("۫ܳ") + i26) * (-83);
                        int i49 = i4;
                        i13 = ((iM27614 ^ i27) * 26091) ^ 505455240;
                        i41 = iM27614 ^ 4970517;
                        i39 = i3;
                        iM2767 = i49;
                        sArr11 = sArr2;
                        sArr10 = sArr;
                        i38 = i2;
                        i33 = i;
                        r37 = r32;
                        r4 = r37;
                        button2 = button;
                        i31 = i13;
                        i42 = r4;
                        z3 = z;
                        button3 = button2;
                    }
                    break;
                case -1105808358:
                case 267899501:
                    r32 = i42;
                    i = i33;
                    button = button3;
                    sArr = sArr10;
                    i2 = i38;
                    sArr2 = sArr11;
                    i3 = i39;
                    z = z3 ? 1 : 0;
                    i4 = iM2767;
                    viewM9942 = RunnableC3055.m9942(abstractActivityC17205, i);
                    sArr9 = f13862;
                    i36 = 12;
                    if (C0487.f2131 > 0) {
                        int iM31615 = (C0773.m3169("᩷᩻") + i26) * 119;
                        i5 = ((iM31615 ^ i27) * (-16919)) ^ (-745750250);
                        i6 = iM31615 ^ 1568903092;
                        i39 = i3;
                        iM2767 = i4;
                        sArr11 = sArr2;
                        sArr10 = sArr;
                        i38 = i2;
                        r34 = r32;
                        i33 = i;
                        i42 = r34;
                        int i410 = i5;
                        i41 = i6;
                        z3 = z;
                        button3 = button;
                        i31 = i410;
                    } else {
                        int iM27615 = (C0619.m2761("۫ܳ") + i26) * (-83);
                        int i411 = i4;
                        i13 = ((iM27615 ^ i27) * 26091) ^ 505455240;
                        i41 = iM27615 ^ 4970517;
                        i39 = i3;
                        iM2767 = i411;
                        sArr11 = sArr2;
                        sArr10 = sArr;
                        i38 = i2;
                        i33 = i;
                        r37 = r32;
                        r4 = r37;
                        button2 = button;
                        i31 = i13;
                        i42 = r4;
                        z3 = z;
                        button3 = button2;
                    }
                    break;
                case -826057929:
                case 1498120778:
                    ?? r315 = i42;
                    button = button3;
                    z = z3 ? 1 : 0;
                    short[] sArr14 = sArr8;
                    int i50 = i35;
                    int iM27616 = C0619.m2761(C0619.m2756(sArr14, i50, 3, i30)) ^ 2119778144;
                    int iM31616 = (i27 - C0773.m3169("ۨۡ")) * (-61);
                    i13 = ((iM31616 ^ i26) * 22843) ^ (-793463100);
                    sArr8 = sArr14;
                    i35 = i50;
                    i39 = i39;
                    i36 = i36;
                    r4 = r315 == true ? 1 : 0;
                    sArr11 = sArr11;
                    sArr10 = sArr10;
                    i38 = i38;
                    sArr9 = sArr9;
                    i41 = iM31616 ^ (-1305428508);
                    iM2767 = iM2767;
                    i33 = iM27616;
                    button2 = button;
                    i31 = i13;
                    i42 = r4;
                    z3 = z;
                    button3 = button2;
                    break;
                case -710104475:
                case 770526427:
                    C3779.m12264();
                    C2310.m7813();
                    iM2763 = (C0619.m2761("۟ۖ") + i26) * 75;
                    i31 = ((iM2763 ^ i27) * 20745) ^ (-1417110786);
                    i24 = 194421872;
                    i41 = iM2763 ^ i24;
                    break;
                case -663948508:
                case 15735946:
                    short[] sArr15 = sArr11;
                    int i51 = i39;
                    int i52 = i40;
                    viewM9333 = C2834.m9333(viewM9942, C0773.m3169(C23916.m53420(sArr15, i51, i52, i30)) ^ 2120012288);
                    int iM31617 = C0773.m3169("ܿۖ") ^ i27;
                    i14 = ((iM31617 ^ i26) * 17267) ^ (-964003322);
                    i15 = iM31617 ^ (-895098159);
                    sArr11 = sArr15;
                    i39 = i51;
                    i40 = i52;
                    i41 = i15;
                    z3 = z3 ? 1 : 0;
                    button3 = button3;
                    i31 = i14;
                    r38 = i42;
                    i42 = r38;
                    break;
                case -566797186:
                case 1606246536:
                    View viewM9337 = C2834.m9333(viewM9942, iM2766 ^ i34);
                    C2310.m7811(viewM9337, str4);
                    Button button6 = (Button) viewM9337;
                    viewOnClickListenerC4062.f13872 = button6;
                    button = button3;
                    C2375.m8070(button, viewOnClickListenerC4062);
                    C2375.m8070(button6, viewOnClickListenerC4062);
                    if (!RunnableC1848.f6235) {
                        int iM27617 = (C0619.m2761("ۘۘ") + i26) * 79;
                        z = z3 ? 1 : 0;
                        i13 = ((iM27617 ^ i27) * 4115) ^ (-1529322685);
                        button4 = button6;
                        i41 = iM27617 ^ (-92334580);
                        r4 = i42;
                        button2 = button;
                        i31 = i13;
                        i42 = r4;
                        z3 = z;
                        button3 = button2;
                    } else {
                        z = z3 ? 1 : 0;
                        button4 = button6;
                        strM5471 = str3;
                        sArr7 = sArr10;
                        i20 = i38;
                        sArr6 = sArr11;
                        i19 = i39;
                        str2 = str4;
                        i18 = i37;
                        r310 = i42;
                        iM3169 = (C0773.m3169("᩷ۤ") ^ i26) * 35;
                        i16 = ((iM3169 ^ i27) * (-15861)) ^ 813252338;
                        i21 = -2107057234;
                        r39 = r310;
                        i17 = iM3169 ^ i21;
                        i39 = i19;
                        i37 = i18;
                        str4 = str2;
                        sArr11 = sArr6;
                        sArr10 = sArr7;
                        i38 = i20;
                        str3 = strM5471;
                        z3 = z;
                        r36 = r39;
                        button3 = button;
                        i31 = i16;
                        i41 = i17;
                        r38 = r36;
                        i42 = r38;
                    }
                    break;
                case -440258758:
                case 2048011117:
                    C1783.m6232();
                    throw new RuntimeException();
                case -269672256:
                case -255911180:
                    button = button3;
                    z = z3 ? 1 : 0;
                    textInputLayout = (TextInputLayout) view3;
                    viewOnClickListenerC4062.f13865 = textInputLayout;
                    iM2765 = C0619.m2761(C2966.m9670(f13862, 41, 3, i30));
                    if (C1343.f4799 == 0) {
                        iM2762 = C0619.m2761("᩺ۘ") ^ i27;
                        i5 = ((iM2762 ^ i26) * (-30805)) ^ 851188398;
                        i12 = 516833875;
                        i6 = iM2762 ^ i12;
                        i42 = i42;
                        int i412 = i5;
                        i41 = i6;
                        z3 = z;
                        button3 = button;
                        i31 = i412;
                    } else {
                        strM5471 = str3;
                        sArr7 = sArr10;
                        i20 = i38;
                        sArr6 = sArr11;
                        i19 = i39;
                        str2 = str4;
                        i18 = i37;
                        r310 = i42;
                        iM3169 = (C0773.m3169("᩷ۤ") ^ i26) * 35;
                        i16 = ((iM3169 ^ i27) * (-15861)) ^ 813252338;
                        i21 = -2107057234;
                        r39 = r310;
                        i17 = iM3169 ^ i21;
                        i39 = i19;
                        i37 = i18;
                        str4 = str2;
                        sArr11 = sArr6;
                        sArr10 = sArr7;
                        i38 = i20;
                        str3 = strM5471;
                        z3 = z;
                        r36 = r39;
                        button3 = button;
                        i31 = i16;
                        i41 = i17;
                        r38 = r36;
                        i42 = r38;
                    }
                    break;
                case -173510298:
                case 707412687:
                    ?? r316 = i42;
                    i = i33;
                    i7 = iM2767;
                    button = button3;
                    sArr3 = sArr9;
                    i8 = i36;
                    sArr4 = sArr10;
                    i9 = i38;
                    sArr5 = sArr11;
                    i10 = i39;
                    z = z3 ? 1 : 0;
                    C2375.m8064(viewOnClickListenerC16544.f53557);
                    sArr8 = f13862;
                    i35 = 9;
                    r33 = r316;
                    if (C1146.f4234 >= 0) {
                        iM2761 = C0619.m2761("ܿ᩷") ^ i27;
                        i5 = ((iM2761 ^ i26) * 21533) ^ (-1909178363);
                        i11 = -38303728;
                        r35 = r33;
                    } else {
                        iM2761 = C0619.m2761("ۜܿ") ^ i26;
                        i5 = ((iM2761 ^ i27) * 27945) ^ (-1710998678);
                        i11 = -265240140;
                        r35 = r316;
                    }
                    i6 = iM2761 ^ i11;
                    i39 = i10;
                    i36 = i8;
                    sArr11 = sArr5;
                    sArr10 = sArr4;
                    i38 = i9;
                    sArr9 = sArr3;
                    iM2767 = i7;
                    r34 = r35;
                    i33 = i;
                    i42 = r34;
                    int i413 = i5;
                    i41 = i6;
                    z3 = z;
                    button3 = button;
                    i31 = i413;
                    break;
                case -125473206:
                case -27497374:
                    r36 = i42;
                    button = button3;
                    boolean z5 = z3 ? 1 : 0;
                    int i53 = iM2767;
                    viewM11246 = C3448.m11246(viewM9942, i53);
                    sArr10 = f13862;
                    i37 = 15;
                    i38 = 17;
                    int iM31618 = C0773.m3169("ۖۗ") ^ i26;
                    i16 = ((iM31618 ^ i27) * 30117) ^ 569583795;
                    i17 = iM31618 ^ (-566678622);
                    iM2767 = i53;
                    i39 = i39;
                    z3 = z5 ? 1 : 0;
                    sArr11 = sArr11;
                    button3 = button;
                    i31 = i16;
                    i41 = i17;
                    r38 = r36;
                    i42 = r38;
                    break;
                case 348913519:
                case 757939680:
                    button = button3;
                    z = z3 ? 1 : 0;
                    iM31611 = C0773.m3169(C1826.m6310(f13862, 38, 3, i30));
                    iM2762 = C0619.m2761("֨֨") ^ i27;
                    i5 = ((iM2762 ^ i26) * 28895) ^ 1898358363;
                    i12 = -1344443091;
                    i6 = iM2762 ^ i12;
                    i42 = i42;
                    int i414 = i5;
                    i41 = i6;
                    z3 = z;
                    button3 = button;
                    i31 = i414;
                    break;
                case 421429288:
                case 1051698206:
                    short[] sArr16 = sArr9;
                    int i54 = i36;
                    iM2767 = C0619.m2761(C3448.m11252(sArr16, i54, 3, i30)) ^ 2123440208;
                    int iM31619 = (C0773.m3169("֨ܽ") ^ i27) * 33;
                    i14 = ((iM31619 ^ i26) * 19491) ^ (-1359891277);
                    i15 = iM31619 ^ (-1363339261);
                    i36 = i54;
                    i39 = i39;
                    sArr11 = sArr11;
                    sArr10 = sArr10;
                    i38 = i38;
                    sArr9 = sArr16;
                    i41 = i15;
                    z3 = z3 ? 1 : 0;
                    button3 = button3;
                    i31 = i14;
                    r38 = i42;
                    i42 = r38;
                    break;
                case 662789577:
                case 1453563505:
                    button = button3;
                    z = z3 ? 1 : 0;
                    View viewM9338 = C2834.m9333(viewM9942, iM2765 ^ 2127342009);
                    C2310.m7811(viewM9338, str4);
                    textInputLayout2 = (TextInputLayout) viewM9338;
                    iM2762 = (i26 - C0773.m3169("᩷᩺")) * (-49);
                    i5 = ((iM2762 ^ i27) * 14011) ^ (-1146972221);
                    i12 = 1148211039;
                    i6 = iM2762 ^ i12;
                    i42 = i42;
                    int i415 = i5;
                    i41 = i6;
                    z3 = z;
                    button3 = button;
                    i31 = i415;
                    break;
                case 1505424414:
                case 2083346756:
                    C21232.m48399(dialogInterfaceC8327M10090, C0619.m2761(AbstractC0116.m1236(f13862, 53, 3, i30)) ^ 2102111960, runnable);
                    return;
                case 1707122440:
                case 1882803945:
                    z = z3 ? 1 : 0;
                    View view7 = viewM9334;
                    C0269.m1781(view7, str4);
                    Button button7 = (Button) view7;
                    viewOnClickListenerC4062.f13874 = button7;
                    iM2766 = C0619.m2761(C2288.m7761(f13862, 47, 3, i30));
                    i34 = 2129947656;
                    int iM27618 = (C0619.m2761("᩸ۧ") + i27) * (-65);
                    i31 = ((iM27618 ^ i26) * (-7827)) ^ 1414291751;
                    button2 = button7;
                    i41 = iM27618 ^ (-994544995);
                    i42 = i42;
                    z3 = z;
                    button3 = button2;
                    break;
                default:
                    button = button3;
                    z = z3 ? 1 : 0;
                    iM31612 = C0773.m3169(C2375.m8069(f13862, 44, 3, i30));
                    iM2762 = (C0619.m2761("֨ۡ") + i26) * (-83);
                    i5 = ((iM2762 ^ i27) * (-19891)) ^ 449955312;
                    i12 = 774989147;
                    i6 = iM2762 ^ i12;
                    i42 = i42;
                    int i416 = i5;
                    i41 = i6;
                    z3 = z;
                    button3 = button;
                    i31 = i416;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13105(ViewOnClickListenerC4062 viewOnClickListenerC4062, String str, String str2) {
        int i = -646158802;
        int i2 = RunnableC0334.f1808;
        int i3 = C0773.f2792;
        int iM2761 = (i3 - C0619.m2761("ۜۧ")) * (-117);
        int i4 = ((iM2761 ^ i2) * 4869) ^ 1179528155;
        int i5 = 488445830;
        while (true) {
            i = ((((i ^ i2) * (-24267)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2132138292:
                case 1987502478:
                    if (C0269.f1558 <= 0) {
                        iM2761 = (i3 - C0619.m2761("ۙ۠")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2761 ^ i2) * (-19899)) ^ (-227645438);
                        i5 = 262999581;
                    } else {
                        iM2761 = C0619.m2761("ܿ֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * 16343) ^ 550466288;
                        i5 = 586741344;
                    }
                    break;
                case -1847656893:
                case 229807710:
                    if (C2023.f6737) {
                        iM2761 = (i3 - C0619.m2761("ۙ۠")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2761 ^ i2) * (-19899)) ^ (-227645438);
                        i5 = 262999581;
                    } else {
                        iM2761 = C0773.m3169("֫֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-485)) ^ 700814836;
                        i5 = -1712926296;
                    }
                    break;
                case -1403413958:
                case -1148846345:
                    if (C20932.f66974 <= 0) {
                        iM2761 = C0619.m2761("ۚ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * 22215) ^ 488472348;
                        i5 = -836064204;
                    } else {
                        iM2761 = C0773.m3169("ۚ᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-1657)) ^ (-691981620);
                        i5 = -1257908166;
                    }
                    break;
                case -1129050152:
                case 563108081:
                    C1783.m6232();
                    C0619.m2763();
                    break;
                case -1026716052:
                case 404980580:
                    if (C3998.f13671 != 0) {
                        iM2761 = (i3 - C0619.m2761("ۙ۠")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2761 ^ i2) * (-19899)) ^ (-227645438);
                        i5 = 262999581;
                    } else {
                        iM2761 = (C0619.m2761("ۜᩳ") ^ i2) * (-111);
                        i4 = ((iM2761 ^ i3) * (-11273)) ^ (-1334776526);
                        i5 = 1616826638;
                    }
                    break;
                case -1002716049:
                case 390590182:
                    if (C2419.f7754 >= 0) {
                        iM2761 = (C0619.m2761("ۜᩳ") ^ i2) * (-111);
                        i4 = ((iM2761 ^ i3) * (-11273)) ^ (-1334776526);
                        i5 = 1616826638;
                    } else {
                        iM2761 = C0619.m2761("᩵ᩳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-12901)) ^ (-1201000907);
                        i5 = 2133827689;
                    }
                    break;
                case -905778988:
                case -880035109:
                    AbstractActivityC17204 abstractActivityC17204 = viewOnClickListenerC4062.f13871;
                    byte[] bArr = viewOnClickListenerC4062.f13867;
                    if (C1321.m4852()) {
                        C20470 c20470 = new C20470(viewOnClickListenerC4062);
                        ReentrantLock reentrantLock = C11650.f37690;
                        if (RunnableC3646.m11813() != 0) {
                            iM2761 = (i3 - C0619.m2761("ۙ۠")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i4 = ((iM2761 ^ i2) * (-19899)) ^ (-227645438);
                            i5 = 262999581;
                        } else if (C2287.f7432 < 0) {
                            C3077.m10038(new Thread(new RunnableC18167(bArr, str, str2, abstractActivityC17204, c20470)));
                        }
                        break;
                    }
                    iM2761 = C0619.m2761("ᩳۚ") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-18397)) ^ 1728490284;
                    i5 = 2112744108;
                    break;
                case -771307934:
                case 1417312407:
                    viewOnClickListenerC4062.m13114();
                    if (C3033.m9845() <= 0) {
                        iM2761 = C0619.m2761("ۚ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * 22215) ^ 488472348;
                        i5 = -836064204;
                    } else {
                        iM2761 = C0619.m2761("֫᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-19119)) ^ (-1046075547);
                        i5 = -4334537;
                    }
                    break;
                case -763784618:
                case 19269603:
                    C0950.m3785();
                    iM2761 = C0619.m2761("ۚ۟") ^ i3;
                    i4 = ((iM2761 ^ i2) * 22215) ^ 488472348;
                    i5 = -836064204;
                    break;
                case -605747317:
                case 1213279908:
                    C0773.m3161();
                    if (C2702.f8586 > 0) {
                        iM2761 = (i3 - C0619.m2761("ۙ۠")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2761 ^ i2) * (-19899)) ^ (-227645438);
                        i5 = 262999581;
                    } else {
                        iM2761 = (C0619.m2761("ܺۨ") + i3) * 123;
                        i4 = ((iM2761 ^ i2) * 18669) ^ 684419346;
                        i5 = -799054879;
                    }
                    break;
                case 218666063:
                case 806597660:
                    RunnableC0334.m2063();
                    if (C1564.m5509() <= 0) {
                        iM2761 = (C0619.m2761("ۜᩳ") ^ i2) * (-111);
                        i4 = ((iM2761 ^ i3) * (-11273)) ^ (-1334776526);
                        i5 = 1616826638;
                    } else {
                        iM2761 = C0619.m2761("ۚ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * 22215) ^ 488472348;
                        i5 = -836064204;
                    }
                    break;
                case 641519972:
                case 1236595665:
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0619.m2761("ۚ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * 22215) ^ 488472348;
                        i5 = -836064204;
                    } else {
                        iM2761 = C0773.m3169("۠ۧ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 31845) ^ (-1315759440);
                        i5 = 652532793;
                    }
                    break;
                default:
                    if (C0773.f2792 <= 0) {
                        iM2761 = (C0619.m2761("ۜᩳ") ^ i2) * (-111);
                        i4 = ((iM2761 ^ i3) * (-11273)) ^ (-1334776526);
                        i5 = 1616826638;
                    } else {
                        iM2761 = C0619.m2761("ۤۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-31317)) ^ 326298303;
                        i5 = 327414739;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0144 A[PHI: r5 r7 r11
      0x0144: PHI (r5v5 short[]) = (r5v2 short[]), (r5v3 short[]), (r5v2 short[]), (r5v2 short[]), (r5v2 short[]) binds: [B:114:0x0144, B:36:0x0142, B:20:0x00c9, B:13:0x009e, B:129:0x0144] A[DONT_GENERATE, DONT_INLINE]
      0x0144: PHI (r7v5 com.google.android.material.textfield.TextInputLayout) = 
      (r7v2 com.google.android.material.textfield.TextInputLayout)
      (r7v3 com.google.android.material.textfield.TextInputLayout)
      (r7v2 com.google.android.material.textfield.TextInputLayout)
      (r7v2 com.google.android.material.textfield.TextInputLayout)
      (r7v2 com.google.android.material.textfield.TextInputLayout)
     binds: [B:114:0x0144, B:36:0x0142, B:20:0x00c9, B:13:0x009e, B:129:0x0144] A[DONT_GENERATE, DONT_INLINE]
      0x0144: PHI (r11v5 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:114:0x0144, B:36:0x0142, B:20:0x00c9, B:13:0x009e, B:129:0x0144] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0374 A[PHI: r9 r12 r18 r19 r20
      0x0374: PHI (r9v5 java.lang.String) = (r9v2 java.lang.String), (r9v2 java.lang.String), (r9v6 java.lang.String) binds: [B:84:0x0372, B:76:0x0316, B:33:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x0374: PHI (r12v38 int) = (r12v16 int), (r12v20 int), (r12v42 int) binds: [B:84:0x0372, B:76:0x0316, B:33:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x0374: PHI (r18v16 short) = (r18v13 short), (r18v2 short), (r18v2 short) binds: [B:84:0x0372, B:76:0x0316, B:33:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x0374: PHI (r19v6 int) = (r19v3 int), (r19v2 int), (r19v2 int) binds: [B:84:0x0372, B:76:0x0316, B:33:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x0374: PHI (r20v10 java.lang.String) = (r20v2 java.lang.String), (r20v3 java.lang.String), (r20v2 java.lang.String) binds: [B:84:0x0372, B:76:0x0316, B:33:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13106(ViewOnClickListenerC4062 viewOnClickListenerC4062, C13778 c13778) {
        int iM2761;
        int i;
        int i2;
        short s;
        int i3;
        int iM2762;
        int i4;
        int iM2763;
        int i5;
        int iM3169;
        int i6;
        C24750 c24750;
        short[] sArr;
        viewOnClickListenerC4062 = viewOnClickListenerC4062;
        C13778 c13779 = c13778;
        int i7 = C4282.f15546;
        int i8 = C1564.f5401;
        int iM2764 = C0619.m2761("᩸ᩳ") ^ i8;
        int i9 = ((iM2764 ^ i7) * 2939) ^ 1942147334;
        C24750 c24751 = null;
        String strM33137 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i10 = iM2764 ^ 1901867430;
        int i11 = 0;
        int iM9938 = 0;
        int iM31610 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        char c = 0;
        short s2 = 0;
        int i15 = 0;
        int i16 = -817383519;
        int i17 = 0;
        String strM9847 = null;
        TextInputLayout textInputLayout = null;
        TextInputLayout textInputLayout2 = null;
        short[] sArr5 = null;
        String strM9486 = null;
        while (true) {
            i16 = i10 ^ (i9 & (((i16 ^ i7) * (-22443)) >> 31));
            switch (i16) {
                case -2102077918:
                case 306691822:
                    i14 = 23713;
                    iM2763 = (i8 - C0619.m2761("᩸ۖ")) * (-35);
                    i9 = (-1008559886) ^ ((iM2763 ^ i7) * 20235);
                    i5 = 1996824209;
                    i10 = iM2763 ^ i5;
                    c13779 = c13778;
                    i17 = i17;
                    break;
                case -1934669767:
                case 1648776834:
                    C1826.m6301();
                    C3448.m11248();
                    break;
                case -1559294429:
                case 1300860639:
                    C20932.m47848();
                    if (C3492.f12043 > 0) {
                        s = s2;
                        i3 = i17;
                        iM2762 = (i7 - C0619.m2761("ۖ۫")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i9 = ((iM2762 ^ i8) * 1029) ^ (-1627370667);
                        i4 = 1955361686;
                        i10 = iM2762 ^ i4;
                        viewOnClickListenerC4062 = viewOnClickListenerC4062;
                        s2 = s;
                        i17 = i3;
                        c13779 = c13778;
                    } else {
                        iM2761 = (C0773.m3169("ۡ᩶") ^ i7) * 15;
                        i = ((iM2761 ^ i8) * (-5067)) ^ (-1011418860);
                        i2 = -1455492775;
                        i10 = iM2761 ^ i2;
                        i9 = i;
                    }
                    break;
                case -1539038821:
                case -916963622:
                    String str = strM9486;
                    i17 = i17;
                    C17202.m40379(c13779, str);
                    viewOnClickListenerC4062.m13103();
                    if (!C2878.m9488(c13778)) {
                        strM9486 = str;
                        iM3169 = C0773.m3169("֡۟") ^ i8;
                        i9 = ((iM3169 ^ i7) * 3993) ^ (-325891941);
                        i6 = 725722263;
                        i10 = iM3169 ^ i6;
                        i17 = i17;
                    } else {
                        int iM2765 = (C0619.m2761("ܶܽ") ^ i7) * 25;
                        strM9486 = str;
                        i10 = iM2765 ^ (-422718862);
                        i9 = ((iM2765 ^ i8) * 10125) ^ (-1180403822);
                        i17 = i17;
                        viewOnClickListenerC4062 = viewOnClickListenerC4062;
                    }
                    break;
                case -1397653931:
                case 167803221:
                    C11235.m28302(textInputLayout, C0619.m2761(strM33137) ^ 2098370438);
                    break;
                case -1270187858:
                case 404220924:
                    C11235.m28302(textInputLayout2, C0619.m2761(strM9847) ^ 2126309934);
                    break;
                case -1047914610:
                case 668789489:
                    iM31610 = C0773.m3169(C3690.m11996(f13862, 83, 3, i14));
                    if (!C13473.m33144()) {
                        c24750 = c24751;
                        sArr = sArr3;
                        int iM31611 = C0773.m3169("ܶۛ") ^ i8;
                        sArr3 = sArr;
                        i9 = ((iM31611 ^ i7) * 20785) ^ (-2044725074);
                        i10 = iM31611 ^ 1104763639;
                        c24751 = c24750;
                    } else {
                        iM2761 = C0773.m3169("ۚ᩹") ^ i8;
                        i = ((iM2761 ^ i7) * 18351) ^ 269255862;
                        i2 = 1840600218;
                        i10 = iM2761 ^ i2;
                        i9 = i;
                    }
                    break;
                case -951057092:
                case 611422678:
                    AbstractC0641.m2813();
                    iM2761 = (C0773.m3169("ۡ᩶") ^ i7) * 15;
                    i = ((iM2761 ^ i8) * (-5067)) ^ (-1011418860);
                    i2 = -1455492775;
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case -745516872:
                case 1794572436:
                    strM33137 = C13473.m33137(sArr5, i12, 3, i14);
                    if (C4282.f15546 > 0) {
                        iM2761 = C0619.m2761("ۤ᩵") ^ i7;
                        i = ((iM2761 ^ i8) * 761) ^ (-1406510337);
                        i2 = -2012073647;
                        i10 = iM2761 ^ i2;
                        i9 = i;
                    } else {
                        i17 = i17;
                        iM2763 = C0773.m3169("ܳۢ") ^ i7;
                        i9 = 411225113 ^ ((iM2763 ^ i8) * (-30437));
                        i5 = 611953406;
                        i10 = iM2763 ^ i5;
                        c13779 = c13778;
                        i17 = i17;
                    }
                    break;
                case -727642485:
                case 255426804:
                    c24750 = c24751;
                    sArr = sArr3;
                    i17 = 74;
                    if (C17202.f56030) {
                        sArr3 = sArr;
                        int iM2766 = C0619.m2761("۬ܽ") ^ i8;
                        i10 = iM2766 ^ 1666722126;
                        c24751 = c24750;
                        i9 = ((iM2766 ^ i7) * 17167) ^ 176673205;
                        i13 = 3;
                    } else {
                        i13 = 3;
                        int iM31612 = C0773.m3169("ܶۛ") ^ i8;
                        sArr3 = sArr;
                        i9 = ((iM31612 ^ i7) * 20785) ^ (-2044725074);
                        i10 = iM31612 ^ 1104763639;
                        c24751 = c24750;
                    }
                    break;
                case -635268025:
                case 197697262:
                    s = s2;
                    i3 = i17;
                    sArr2 = f13862;
                    c = 'A';
                    if (C3998.f13671 != 0) {
                        iM2762 = (i7 - C0619.m2761("ۖ۫")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i9 = ((iM2762 ^ i8) * 1029) ^ (-1627370667);
                        i4 = 1955361686;
                    } else {
                        iM2762 = C0619.m2761("ܶܺ") ^ i7;
                        i9 = ((iM2762 ^ i8) * (-15355)) ^ 123922772;
                        i4 = 612421302;
                    }
                    i10 = iM2762 ^ i4;
                    viewOnClickListenerC4062 = viewOnClickListenerC4062;
                    s2 = s;
                    i17 = i3;
                    c13779 = c13778;
                    break;
                case -634308647:
                case 1373040762:
                    i17 = i17;
                    iM9938 = RunnableC3055.m9938(c13778);
                    if (iM9938 != 1000) {
                        iM3169 = C0619.m2761("۟ۢ") ^ i8;
                        i9 = ((iM3169 ^ i7) * (-12787)) ^ (-324001966);
                        i6 = 271334912;
                    } else {
                        iM3169 = C0773.m3169("ܽۨ") ^ i8;
                        i9 = ((iM3169 ^ i7) * 13839) ^ 166777636;
                        i6 = 1027867893;
                    }
                    i10 = iM3169 ^ i6;
                    i17 = i17;
                    break;
                case -491425977:
                case 1051688989:
                    textInputLayout = viewOnClickListenerC4062.f13868;
                    sArr5 = f13862;
                    i12 = 80;
                    if (C2834.f9334 <= 0) {
                        iM2761 = (C0773.m3169("ۡ᩶") ^ i7) * 15;
                        i = ((iM2761 ^ i8) * (-5067)) ^ (-1011418860);
                        i2 = -1455492775;
                    } else {
                        iM2761 = (C0773.m3169("ᩴۜ") ^ i7) * 89;
                        i = ((iM2761 ^ i8) * (-10743)) ^ (-1484721318);
                        i2 = -784755615;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case -361942070:
                case 1205010957:
                    textInputLayout2 = viewOnClickListenerC4062.f13865;
                    sArr4 = f13862;
                    i11 = 77;
                    if (C13473.f42873 == 0) {
                        iM2761 = (i7 - C0619.m2761("ۜ᩹")) * (-109);
                        i = ((iM2761 ^ i8) * 27499) ^ (-523993281);
                        i2 = -1645764548;
                        i10 = iM2761 ^ i2;
                        i9 = i;
                    } else {
                        s = s2;
                        i3 = i17;
                        iM2762 = (i7 - C0619.m2761("ۖ۫")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i9 = ((iM2762 ^ i8) * 1029) ^ (-1627370667);
                        i4 = 1955361686;
                        i10 = iM2762 ^ i4;
                        viewOnClickListenerC4062 = viewOnClickListenerC4062;
                        s2 = s;
                        i17 = i3;
                        c13779 = c13778;
                    }
                    break;
                case -78982316:
                case 1548895970:
                    strM9847 = C3033.m9847(sArr4, i11, 3, i14);
                    if (C4238.m13540() > 0) {
                        iM2761 = (i7 - C0773.m3169("ܺ֨")) * (-111);
                        i = ((iM2761 ^ i8) * 5149) ^ 1918493062;
                        i2 = -1456880391;
                        i10 = iM2761 ^ i2;
                        i9 = i;
                    } else {
                        s = s2;
                        i3 = i17;
                        iM2762 = (i7 - C0619.m2761("ۖ۫")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i9 = ((iM2762 ^ i8) * 1029) ^ (-1627370667);
                        i4 = 1955361686;
                        i10 = iM2762 ^ i4;
                        viewOnClickListenerC4062 = viewOnClickListenerC4062;
                        s2 = s;
                        i17 = i3;
                        c13779 = c13778;
                    }
                    break;
                case 2332519:
                case 2089934809:
                    i17 = i17;
                    s2 = sArr2[c];
                    i15 = s2 * s2;
                    if (C2288.f7433 <= 0) {
                        iM2763 = C0773.m3169("ܳۢ") ^ i7;
                        i9 = 411225113 ^ ((iM2763 ^ i8) * (-30437));
                        i5 = 611953406;
                    } else {
                        iM2763 = (C0619.m2761("ᩴܳ") ^ i8) * (-105);
                        i9 = 1398434592 ^ ((iM2763 ^ i7) * 31583);
                        i5 = 2078762787;
                    }
                    i10 = iM2763 ^ i5;
                    c13779 = c13778;
                    i17 = i17;
                    break;
                case 11030915:
                case 1790641232:
                    if (iM9938 != 1100) {
                        iM2761 = C0773.m3169("ۢۢ") ^ i8;
                        i = ((iM2761 ^ i7) * 20223) ^ 812026469;
                        i2 = -1155716483;
                    } else {
                        iM2761 = C0773.m3169("ܶ֡") ^ i8;
                        i = ((iM2761 ^ i7) * (-6669)) ^ 6080653;
                        i2 = 1144554629;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case 14349284:
                case 1977668910:
                    C0269.m1775();
                    if (!RunnableC3646.f12471) {
                        c24750 = c24751;
                        sArr = sArr3;
                        int iM31613 = C0773.m3169("ܶۛ") ^ i8;
                        sArr3 = sArr;
                        i9 = ((iM31613 ^ i7) * 20785) ^ (-2044725074);
                        i10 = iM31613 ^ 1104763639;
                        c24751 = c24750;
                    } else {
                        iM2761 = (C0773.m3169("ۡ᩶") ^ i7) * 15;
                        i = ((iM2761 ^ i8) * (-5067)) ^ (-1011418860);
                        i2 = -1455492775;
                        i10 = iM2761 ^ i2;
                        i9 = i;
                    }
                    break;
                case 19989919:
                case 1967003632:
                    i3 = i17;
                    C2375.m8064(viewOnClickListenerC4062.f13873);
                    C24750 c24752 = viewOnClickListenerC4062.f13863;
                    sArr3 = f13862;
                    if (C2288.f7433 > 0) {
                        int iM31614 = (i7 - C0773.m3169("᩺ܺ")) * 109;
                        int i18 = ((iM31614 ^ i8) * 5901) ^ 477284645;
                        i10 = iM31614 ^ 1291239802;
                        c24751 = c24752;
                        i17 = i3;
                        i9 = i18;
                        viewOnClickListenerC4062 = viewOnClickListenerC4062;
                    } else {
                        c24751 = c24752;
                        s = s2;
                        iM2762 = (i7 - C0619.m2761("ۖ۫")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i9 = ((iM2762 ^ i8) * 1029) ^ (-1627370667);
                        i4 = 1955361686;
                        i10 = iM2762 ^ i4;
                        viewOnClickListenerC4062 = viewOnClickListenerC4062;
                        s2 = s;
                        i17 = i3;
                        c13779 = c13778;
                    }
                    break;
                case 98103031:
                case 388127734:
                    C17202.m40373(RunnableC1848.m6367(c13779, 2119322505 ^ iM31610));
                    break;
                case 199013852:
                case 994991393:
                    if (C3734.f12817 < 0) {
                        iM2761 = (C0773.m3169("ۡ᩶") ^ i7) * 15;
                        i = ((iM2761 ^ i8) * (-5067)) ^ (-1011418860);
                        i2 = -1455492775;
                    } else {
                        iM2761 = (i8 - C0773.m3169("᩸۟")) * 101;
                        i = ((iM2761 ^ i7) * (-19859)) ^ (-707249719);
                        i2 = -5597729;
                    }
                    i10 = iM2761 ^ i2;
                    i9 = i;
                    break;
                case 433001772:
                case 1345526880:
                    c24751.m55253(C0619.m2761(C3998.m12925(sArr3, i17, i13, i14)) ^ 2128079634);
                    break;
                case 711070369:
                case 717221782:
                    i14 = 64811;
                    iM2763 = (i8 - C0619.m2761("᩸ۖ")) * (-35);
                    i9 = (-1008559886) ^ ((iM2763 ^ i7) * 20235);
                    i5 = 1996824209;
                    i10 = iM2763 ^ i5;
                    c13779 = c13778;
                    i17 = i17;
                    break;
                case 982608894:
                case 1252547824:
                    i17 = i17;
                    strM9486 = C2878.m9486(f13862, 66, 8, i14);
                    if (C2310.f7472 >= 0) {
                        iM2763 = C0773.m3169("ܳۢ") ^ i7;
                        i9 = 411225113 ^ ((iM2763 ^ i8) * (-30437));
                        i5 = 611953406;
                    } else {
                        iM2763 = C0773.m3169("۫ۧ") ^ i7;
                        i9 = 1801924255 ^ ((iM2763 ^ i8) * (-2981));
                        i5 = -302293869;
                    }
                    i10 = iM2763 ^ i5;
                    c13779 = c13778;
                    i17 = i17;
                    break;
                default:
                    i3 = i17;
                    s = s2;
                    if ((i15 + 972196) - (s * 1972) < 0) {
                        iM2762 = C0619.m2761("᩸ܳ") ^ i8;
                        i9 = ((iM2762 ^ i7) * 5695) ^ 1654720751;
                        i4 = -132117462;
                    } else {
                        iM2762 = (C0773.m3169("ۡܳ") ^ i7) * 41;
                        i9 = ((iM2762 ^ i8) * (-523)) ^ 1897335819;
                        i4 = -191560471;
                    }
                    i10 = iM2762 ^ i4;
                    viewOnClickListenerC4062 = viewOnClickListenerC4062;
                    s2 = s;
                    i17 = i3;
                    c13779 = c13778;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0066  */
    /* JADX WARN: Code duplicated, block: B:53:0x01b9 A[PHI: r10 r11 r13 r14
      0x01b9: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:52:0x01b7, B:42:0x0145, B:26:0x00c0, B:16:0x007d, B:13:0x0062, B:10:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x01b9: PHI (r11v4 short) = (r11v3 short), (r11v2 short), (r11v2 short), (r11v2 short), (r11v2 short), (r11v2 short) binds: [B:52:0x01b7, B:42:0x0145, B:26:0x00c0, B:16:0x007d, B:13:0x0062, B:10:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x01b9: PHI (r13v4 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:52:0x01b7, B:42:0x0145, B:26:0x00c0, B:16:0x007d, B:13:0x0062, B:10:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x01b9: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:52:0x01b7, B:42:0x0145, B:26:0x00c0, B:16:0x007d, B:13:0x0062, B:10:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01ed A[PHI: r2 r9
      0x01ed: PHI (r2v5 int) = (r2v2 int), (r2v4 int), (r2v2 int) binds: [B:56:0x01eb, B:38:0x0121, B:10:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x01ed: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:56:0x01eb, B:38:0x0121, B:10:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x021f A[PHI: r3 r8
      0x021f: PHI (r3v4 android.view.View) = (r3v2 android.view.View), (r3v3 android.view.View), (r3v2 android.view.View) binds: [B:60:0x021d, B:34:0x0105, B:7:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x021f: PHI (r8v4 short) = (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:60:0x021d, B:34:0x0105, B:7:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0251 A[PHI: r4 r5 r7 r19
      0x0251: PHI (r4v4 float[]) = (r4v2 float[]), (r4v3 float[]), (r4v2 float[]) binds: [B:64:0x024f, B:30:0x00e3, B:22:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r5v3 java.lang.String) = (r5v2 java.lang.String), (r5v2 java.lang.String), (r5v4 java.lang.String) binds: [B:64:0x024f, B:30:0x00e3, B:22:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r7v4 char) = (r7v3 char), (r7v2 char), (r7v2 char) binds: [B:64:0x024f, B:30:0x00e3, B:22:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:64:0x024f, B:30:0x00e3, B:22:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private final void m13114() {
        int iM3169;
        int i;
        int i2;
        int i3 = C0950.f3488;
        int i4 = C2834.f9334;
        int iM2761 = (i4 - C0619.m2761("ᩳۜ")) * 49;
        int i5 = ((iM2761 ^ i3) * (-1635)) ^ (-1803469008);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2761 ^ (-1959100741);
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = -925825546;
        String strM4056 = null;
        float[] fArr = null;
        View view = null;
        int i12 = 0;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i3) * IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION) >> 31));
            switch (i11) {
                case -2106968813:
                case -415613602:
                    i12 = 0;
                    if (C0487.f2131 <= 0) {
                        iM3169 = (i4 - C0619.m2761("ۖ᩸")) * (-31);
                        i = ((iM3169 ^ i3) * 26111) ^ (-1070553820);
                        i2 = 899157111;
                    } else {
                        iM3169 = (C0773.m3169("ܽ᩻") + i4) * (-27);
                        i = ((iM3169 ^ i3) * (-1025)) ^ (-2091691320);
                        i2 = -1816434364;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2059433798:
                case 1786436792:
                    if (AbstractC0116.f1064 > 0) {
                        iM3169 = (C0773.m3169("ۜܿ") + i3) * 93;
                        i = ((iM3169 ^ i4) * (-26829)) ^ 395929203;
                        i2 = -966667229;
                    } else {
                        iM3169 = (C0773.m3169("ۖܶ") + i3) * 101;
                        i = ((iM3169 ^ i4) * 2605) ^ (-770685746);
                        i2 = -1468233265;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1915413834:
                case -137646036:
                    s = sArr[c];
                    if (C2485.f7950 != 0) {
                        iM3169 = (C0773.m3169("ۖܶ") + i3) * 101;
                        i = ((iM3169 ^ i4) * 2605) ^ (-770685746);
                        i2 = -1468233265;
                    } else {
                        iM3169 = C0773.m3169("ᩴ᩻") ^ i3;
                        i = ((iM3169 ^ i4) * 2671) ^ 1127976445;
                        i2 = 901294977;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1567591638:
                case 1093580930:
                    i7 = s * 2;
                    if (C2354.f7599 >= 0) {
                        iM3169 = (i4 - C0619.m2761("ۖ᩸")) * (-31);
                        i = ((iM3169 ^ i3) * 26111) ^ (-1070553820);
                        i2 = 899157111;
                    } else {
                        iM3169 = C0773.m3169("᩻ܽ") ^ i3;
                        i = ((iM3169 ^ i4) * 13747) ^ (-850675231);
                        i2 = 881199261;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1548836205:
                case 157754696:
                    i8 = i7 + 1;
                    s2 = 1;
                    if (C1564.m5509() <= 0) {
                        iM3169 = (C0619.m2761("۟᩶") + i4) * (-81);
                        i = ((iM3169 ^ i3) * 2397) ^ 1781369597;
                        i2 = -893253412;
                    } else {
                        iM3169 = C0773.m3169("ۢᩳ") ^ i4;
                        i = ((iM3169 ^ i3) * (-10175)) ^ 1556390248;
                        i2 = -1365752848;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1488456980:
                case -1160630861:
                    sArr = f13862;
                    c = 'V';
                    if (C2878.f9462) {
                        iM3169 = (C0773.m3169("۬ܽ") + i4) * (-77);
                        i = ((iM3169 ^ i3) * 21451) ^ (-1374369161);
                        i2 = -1548873687;
                    } else {
                        iM3169 = C0773.m3169("ۛܳ") ^ i4;
                        i = ((iM3169 ^ i3) * 17669) ^ (-1664645170);
                        i2 = -1029933858;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1474278682:
                case -1086874061:
                    C0862.m3504(view, 0.0f);
                    fArr = new float[2];
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = (C0773.m3169("۬ܽ") + i4) * (-77);
                        i = ((iM3169 ^ i3) * 21451) ^ (-1374369161);
                        i2 = -1548873687;
                    } else {
                        iM3169 = (C0619.m2761("۟᩵") + i3) * 25;
                        i = ((iM3169 ^ i4) * (-30651)) ^ 533870781;
                        i2 = -969714041;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -529049257:
                case 138381996:
                    i9 = 11405;
                    iM3169 = (C0773.m3169("֨ۨ") + i3) * (-71);
                    i = ((iM3169 ^ i4) * 15951) ^ 227178375;
                    i2 = 389472308;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -506390031:
                case 1010530292:
                    int i13 = s + s2;
                    if (i8 - (i13 * i13) <= 0) {
                        iM3169 = C0619.m2761("ܿۢ") ^ i3;
                        i = ((iM3169 ^ i4) * (-31203)) ^ 1713696123;
                        i2 = -1966470487;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۖܺ")) * 119;
                        i = ((iM3169 ^ i3) * (-5073)) ^ (-59869357);
                        i2 = -756928680;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -371402405:
                case 92286520:
                    this.f13873.m22427((DialogInterface.OnKeyListener) null);
                    if (C13473.f42873 != 0) {
                        iM3169 = (C0619.m2761("۟᩶") + i4) * (-81);
                        i = ((iM3169 ^ i3) * 2397) ^ 1781369597;
                        i2 = -893253412;
                    } else {
                        iM3169 = (C0773.m3169("ۗ᩺") ^ i4) * 11;
                        i = ((iM3169 ^ i3) * (-14835)) ^ (-2135924268);
                        i2 = -1893936689;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -210727070:
                case 90856021:
                    // fill-array-data instruction
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    sArr2 = f13862;
                    i10 = 87;
                    if (C2702.f8586 <= 0) {
                        iM3169 = (C0619.m2761("۟᩶") + i4) * (-81);
                        i = ((iM3169 ^ i3) * 2397) ^ 1781369597;
                        i2 = -893253412;
                    } else {
                        iM3169 = C0773.m3169("ۙۧ") ^ i4;
                        i = ((iM3169 ^ i3) * 27477) ^ 1362916153;
                        i2 = 2018340784;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -68681812:
                case 720195415:
                    C1519.m5397(C1826.m6307(view, strM4056, fArr).setDuration(200L));
                    break;
                case 217332531:
                case 634488129:
                    C4282.m13644();
                    if (C17202.f56030) {
                        iM3169 = (i4 - C0619.m2761("ۖ᩸")) * (-31);
                        i = ((iM3169 ^ i3) * 26111) ^ (-1070553820);
                        i2 = 899157111;
                    } else {
                        iM3169 = (C0619.m2761("۟᩶") + i4) * (-81);
                        i = ((iM3169 ^ i3) * 2397) ^ 1781369597;
                        i2 = -893253412;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 597933141:
                case 900224089:
                    C2310.m7813();
                    break;
                case 652176986:
                case 759479120:
                    C2834.m9344();
                    iM3169 = (C0619.m2761("۟᩶") + i4) * (-81);
                    i = ((iM3169 ^ i3) * 2397) ^ 1781369597;
                    i2 = -893253412;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 816067810:
                case 1265265244:
                    view = this.f13870;
                    C13473.m33140(view, i12);
                    if (C0950.f3488 >= 0) {
                        iM3169 = (C0773.m3169("ۖܶ") + i3) * 101;
                        i = ((iM3169 ^ i4) * 2605) ^ (-770685746);
                        i2 = -1468233265;
                    } else {
                        iM3169 = C0773.m3169("᩻ۚ") ^ i3;
                        i = ((iM3169 ^ i4) * (-15749)) ^ 1708243684;
                        i2 = 1057548149;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 923009358:
                case 1357124045:
                    strM4056 = C1080.m4056(sArr2, i10, 5, i9);
                    if (C2375.f7641 <= 0) {
                        iM3169 = (C0773.m3169("۬ܽ") + i4) * (-77);
                        i = ((iM3169 ^ i3) * 21451) ^ (-1374369161);
                        i2 = -1548873687;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۨ᩹")) * (-29);
                        i = ((iM3169 ^ i4) * 11481) ^ 1259064450;
                        i2 = 466404061;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1404556761:
                case 1429081219:
                    if (C0862.f3233 == 0) {
                        iM3169 = (C0619.m2761("۟᩶") + i4) * (-81);
                        i = ((iM3169 ^ i3) * 2397) ^ 1781369597;
                        i2 = -893253412;
                    } else {
                        iM3169 = (C0773.m3169("ۜܿ") + i3) * 93;
                        i = ((iM3169 ^ i4) * (-26829)) ^ 395929203;
                        i2 = -966667229;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    i9 = 23718;
                    iM3169 = (C0773.m3169("֨ۨ") + i3) * (-71);
                    i = ((iM3169 ^ i4) * 15951) ^ 227178375;
                    i2 = 389472308;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m13115(ViewOnClickListenerC4062 viewOnClickListenerC4062) {
        DialogInterfaceC8327 dialogInterfaceC8327 = null;
        int i = -1569298995;
        int i2 = AbstractC3624.f12429;
        int i3 = C1826.f6190;
        int iM3169 = (i3 - C0773.m3169("᩸֨")) * 25;
        int i4 = ((iM3169 ^ i2) * 21149) ^ (-26448124);
        int i5 = 1031839450;
        while (true) {
            i = ((((i ^ i2) * 6243) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2098676579:
                case 583333207:
                    C3998.m12920();
                    break;
                case -2034977550:
                case -1011979316:
                    if (C2287.f7432 >= 0) {
                        iM3169 = (i3 - C0619.m2761("ۖ۟")) * (-49);
                        i4 = ((iM3169 ^ i2) * (-18049)) ^ (-1834421896);
                        i5 = 1764865141;
                    } else {
                        iM3169 = (i3 - C0619.m2761("᩺ۤ")) * 63;
                        i4 = ((iM3169 ^ i2) * 26365) ^ (-1333027863);
                        i5 = 722630367;
                    }
                    break;
                case -1910189424:
                case -124886564:
                    if (C3690.f12684 <= 0) {
                        iM3169 = (C0619.m2761("ܿ᩶") + i3) * (-91);
                        i4 = ((iM3169 ^ i2) * (-779)) ^ (-967818435);
                        i5 = 1400211;
                    } else {
                        iM3169 = C0619.m2761("ۨۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 21487) ^ (-1860605174);
                        i5 = 98235165;
                    }
                    break;
                case -1906810419:
                case 802821793:
                    if (C1146.f4234 >= 0) {
                        iM3169 = (C0619.m2761("ܿ᩶") + i3) * (-91);
                        i4 = ((iM3169 ^ i2) * (-779)) ^ (-967818435);
                        i5 = 1400211;
                    } else {
                        iM3169 = C0773.m3169("ۨ᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * 23171) ^ 934549453;
                        i5 = 1333267263;
                    }
                    break;
                case -1774513742:
                case 643816165:
                    if (C1343.f4799 != 0) {
                        iM3169 = (C0619.m2761("ܿ᩹") + i2) * 3;
                        i4 = ((iM3169 ^ i3) * (-23073)) ^ 1408972959;
                        i5 = -1056013829;
                    } else {
                        iM3169 = C0619.m2761("ۘۢ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-13711)) ^ (-634166694);
                        i5 = -492756885;
                    }
                    break;
                case -1697883962:
                case -1454583637:
                    if (C2878.f9462) {
                        iM3169 = C0619.m2761("ۖ᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * 25497) ^ 934169056;
                        i5 = 998008018;
                    } else {
                        iM3169 = C0619.m2761("ۢܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-27521)) ^ 65454001;
                        i5 = 1262483912;
                    }
                    break;
                case -1307379239:
                case 1933823672:
                    C4282.m13644();
                    if (C3492.f12043 <= 0) {
                        iM3169 = (C0619.m2761("ܿ᩶") + i3) * (-91);
                        i4 = ((iM3169 ^ i2) * (-779)) ^ (-967818435);
                        i5 = 1400211;
                    } else {
                        iM3169 = (C0619.m2761("ܿ᩹") + i2) * 3;
                        i4 = ((iM3169 ^ i3) * (-23073)) ^ 1408972959;
                        i5 = -1056013829;
                    }
                    break;
                case -814546330:
                case 1381396455:
                    C11235.m28311(dialogInterfaceC8327);
                    if (C0773.m3161() != 0) {
                        iM3169 = C0619.m2761("ۖ᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * 25497) ^ 934169056;
                        i5 = 998008018;
                    } else {
                        iM3169 = C0619.m2761("ۗۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-277)) ^ 514332003;
                        i5 = 1073045583;
                    }
                    break;
                case -727351307:
                case 1888592249:
                    C2375.m8065();
                    if (AbstractC3624.f12429 > 0) {
                        iM3169 = (i3 - C0619.m2761("ۖ۟")) * (-49);
                        i4 = ((iM3169 ^ i2) * (-18049)) ^ (-1834421896);
                        i5 = 1764865141;
                    } else {
                        iM3169 = (C0619.m2761("ܿ᩹") + i2) * 3;
                        i4 = ((iM3169 ^ i3) * (-23073)) ^ 1408972959;
                        i5 = -1056013829;
                    }
                    break;
                case -671992908:
                case 574101029:
                    C3998.m12920();
                    C1826.m6301();
                    iM3169 = (C0619.m2761("ܿ᩹") + i2) * 3;
                    i4 = ((iM3169 ^ i3) * (-23073)) ^ 1408972959;
                    i5 = -1056013829;
                    break;
                case -409863163:
                case 1323047136:
                    dialogInterfaceC8327 = viewOnClickListenerC4062.f13873;
                    if (C2702.m8876()) {
                        iM3169 = (C0619.m2761("ۚܺ") ^ i2) * (-79);
                        i4 = ((iM3169 ^ i3) * (-30653)) ^ (-1158883719);
                        i5 = 388398008;
                    } else {
                        iM3169 = C0619.m2761("ۖ᩷") ^ i2;
                        i4 = ((iM3169 ^ i3) * 25497) ^ 934169056;
                        i5 = 998008018;
                    }
                    break;
                case 506708702:
                case 1312228823:
                    if (C0773.f2792 <= 0) {
                        iM3169 = C0619.m2761("ۨ۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * 22747) ^ (-2122686177);
                        i5 = -100725020;
                    } else {
                        iM3169 = (C0773.m3169("ܶ᩹") + i3) * 75;
                        i4 = ((iM3169 ^ i2) * (-17599)) ^ 1932189203;
                        i5 = -1456428693;
                    }
                    break;
                case 731760715:
                case 793262780:
                    if (C0950.m3785() != 0) {
                        iM3169 = C0619.m2761("ۨ۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * 22747) ^ (-2122686177);
                        i5 = -100725020;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ۢۙ")) * 59;
                        i4 = ((iM3169 ^ i3) * 11445) ^ (-246238014);
                        i5 = 215647645;
                    }
                    break;
                case 1449988736:
                case 1940706172:
                    if (C1542.f5343 <= 0) {
                        iM3169 = (C0619.m2761("ܿ᩶") + i3) * (-91);
                        i4 = ((iM3169 ^ i2) * (-779)) ^ (-967818435);
                        i5 = 1400211;
                    } else {
                        iM3169 = C0619.m2761("ۗ᩻") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-14027)) ^ 1392094332;
                        i5 = 431729321;
                    }
                    break;
                case 1527810370:
                case 1581097612:
                    viewOnClickListenerC4062.f13863.m55256();
                    break;
                default:
                    RunnableC3646.m11813();
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0619.m2761("ۨ۟") ^ i2;
                        i4 = ((iM3169 ^ i3) * 22747) ^ (-2122686177);
                        i5 = -100725020;
                    } else {
                        iM3169 = (C0619.m2761("ܿ᩶") + i3) * (-91);
                        i4 = ((iM3169 ^ i2) * (-779)) ^ (-967818435);
                        i5 = 1400211;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m13109(ViewOnClickListenerC4062 viewOnClickListenerC4062) {
        DialogInterfaceC8327 dialogInterfaceC8327 = null;
        int i = -1831226197;
        int i2 = C0950.f3488;
        int i3 = C2966.f9654;
        int iM2761 = (C0619.m2761("ᩳ۫") ^ i3) * (-67);
        int i4 = ((iM2761 ^ i2) * 23229) ^ (-319513253);
        int i5 = -1032953200;
        while (true) {
            i = ((((i ^ i2) * 26875) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2037920889:
                case 16384116:
                    if (C4238.f15451 >= 0) {
                        iM2761 = (i3 - C0773.m3169("᩷ᩴ")) * (-13);
                        i4 = ((iM2761 ^ i2) * (-13257)) ^ 1213056373;
                        i5 = -835641292;
                    } else {
                        iM2761 = C0619.m2761("᩹᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * 26693) ^ 1622145270;
                        i5 = 1755270924;
                    }
                    break;
                case -1967771173:
                case 33434870:
                    if (C11235.m28309() != 0) {
                        iM2761 = C0773.m3169("ܳۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-29605)) ^ 1382070694;
                        i5 = 1390176865;
                    } else {
                        iM2761 = C0619.m2761("᩶᩶") ^ i3;
                        i4 = ((iM2761 ^ i2) * 28585) ^ (-964462740);
                        i5 = -1617384654;
                    }
                    break;
                case -1671637737:
                case 1889608157:
                    if (C2419.m8174() >= 0) {
                        iM2761 = C0619.m2761("᩺ۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-5071)) ^ 603933215;
                        i5 = 1430918301;
                    } else {
                        iM2761 = (C0619.m2761("ܳ᩹") + i2) * (-111);
                        i4 = ((iM2761 ^ i3) * 24677) ^ (-504425208);
                        i5 = 851921635;
                    }
                    break;
                case -1509362819:
                case -273663074:
                    if (C4282.f15546 <= 0) {
                        iM2761 = C0773.m3169("ۖ֨") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-8365)) ^ (-849794001);
                        i5 = -1226744674;
                    } else {
                        iM2761 = C0619.m2761("ۛ֡") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-31529)) ^ 1510228917;
                        i5 = -24362651;
                    }
                    break;
                case -1314763106:
                case -175913490:
                    if (C1080.f3865 >= 0) {
                        iM2761 = (C0773.m3169("۫ۧ") + i2) * (-15);
                        i4 = ((iM2761 ^ i3) * 10719) ^ 1656840664;
                        i5 = -476616758;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۤܳ")) * (-51);
                        i4 = ((iM2761 ^ i3) * 15395) ^ (-592716147);
                        i5 = 231549415;
                    }
                    break;
                case -1305391796:
                case 1097525521:
                    if (C1146.m4231()) {
                        iM2761 = C0773.m3169("ܺ֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-14785)) ^ 399589451;
                        i5 = 296531980;
                    } else {
                        iM2761 = C0773.m3169("ۖ֨") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-8365)) ^ (-849794001);
                        i5 = -1226744674;
                    }
                    break;
                case -973661629:
                case 700780830:
                    if (!C3077.f9998) {
                        iM2761 = C0619.m2761("᩺ۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-5071)) ^ 603933215;
                        i5 = 1430918301;
                    } else {
                        iM2761 = C0773.m3169("ۖ֨") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-8365)) ^ (-849794001);
                        i5 = -1226744674;
                    }
                    break;
                case -940417854:
                case -507426609:
                    RunnableC3055.m9933();
                    iM2761 = C0773.m3169("ۖ֨") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-8365)) ^ (-849794001);
                    i5 = -1226744674;
                    break;
                case -933827856:
                case 1272725662:
                    C2288.m7767();
                    if (C3033.f9831 >= 0) {
                        iM2761 = (C0773.m3169("۫ۧ") + i2) * (-15);
                        i4 = ((iM2761 ^ i3) * 10719) ^ 1656840664;
                        i5 = -476616758;
                    } else {
                        iM2761 = C0773.m3169("ۖ֨") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-8365)) ^ (-849794001);
                        i5 = -1226744674;
                    }
                    break;
                case -855536005:
                case 552155305:
                    viewOnClickListenerC4062.f13863.m55256();
                    break;
                case -142585051:
                case 903288489:
                    C2375.m8064(dialogInterfaceC8327);
                    if (C0487.f2131 <= 0) {
                        iM2761 = (i3 - C0773.m3169("᩷ᩴ")) * (-13);
                        i4 = ((iM2761 ^ i2) * (-13257)) ^ 1213056373;
                        i5 = -835641292;
                    } else {
                        iM2761 = C0773.m3169("ܳۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 24195) ^ 2116181052;
                        i5 = -1107944577;
                    }
                    break;
                case 42213425:
                case 1611592282:
                    if (C0487.f2131 <= 0) {
                        iM2761 = C0619.m2761("᩺ۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-5071)) ^ 603933215;
                        i5 = 1430918301;
                    } else {
                        iM2761 = (i3 - C0773.m3169("֡۟")) * 35;
                        i4 = ((iM2761 ^ i2) * (-5117)) ^ (-902974621);
                        i5 = -412882728;
                    }
                    break;
                case 262345427:
                case 587684223:
                    dialogInterfaceC8327 = viewOnClickListenerC4062.f13873;
                    if (C3099.m10095()) {
                        iM2761 = (C0773.m3169("۫ۧ") + i2) * (-15);
                        i4 = ((iM2761 ^ i3) * 10719) ^ 1656840664;
                        i5 = -476616758;
                    } else {
                        iM2761 = (C0773.m3169("ܽۙ") + i2) * (-13);
                        i4 = ((iM2761 ^ i3) * 21849) ^ (-1852188434);
                        i5 = -670330781;
                    }
                    break;
                case 653608698:
                case 1670602368:
                    if (C3077.m10041()) {
                        iM2761 = C0619.m2761("᩺ۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-5071)) ^ 603933215;
                        i5 = 1430918301;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ۛۢ")) * (-75);
                        i4 = ((iM2761 ^ i3) * 26187) ^ 76363490;
                        i5 = -2085855520;
                    }
                    break;
                case 738083023:
                case 1871291751:
                    C3779.m12264();
                    break;
                default:
                    C20932.m47848();
                    if (!C2878.f9462) {
                        iM2761 = (C0773.m3169("۫ۧ") + i2) * (-15);
                        i4 = ((iM2761 ^ i3) * 10719) ^ 1656840664;
                        i5 = -476616758;
                    } else {
                        iM2761 = C0773.m3169("ܳۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-29605)) ^ 1382070694;
                        i5 = 1390176865;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0166 A[PHI: r7 r10
      0x0166: PHI (r7v4 com.google.android.material.textfield.TextInputLayout) = 
      (r7v2 com.google.android.material.textfield.TextInputLayout)
      (r7v3 com.google.android.material.textfield.TextInputLayout)
      (r7v2 com.google.android.material.textfield.TextInputLayout)
     binds: [B:136:0x0166, B:38:0x0164, B:8:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x0166: PHI (r10v5 java.lang.String) = (r10v2 java.lang.String), (r10v4 java.lang.String), (r10v2 java.lang.String) binds: [B:136:0x0166, B:38:0x0164, B:8:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0296 A[PHI: r8 r11 r14 r25
      0x0296: PHI (r8v7 java.lang.String) = (r8v2 java.lang.String), (r8v4 java.lang.String), (r8v2 java.lang.String), (r8v2 java.lang.String) binds: [B:68:0x0294, B:58:0x023b, B:28:0x00fd, B:8:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r11v7 int) = (r11v2 int), (r11v2 int), (r11v4 int), (r11v2 int) binds: [B:68:0x0294, B:58:0x023b, B:28:0x00fd, B:8:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r14v7 short[]) = (r14v4 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:68:0x0294, B:58:0x023b, B:28:0x00fd, B:8:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r25v16 l.᩻ۖ᩻) = (r25v11 l.᩻ۖ᩻), (r25v3 l.᩻ۖ᩻), (r25v3 l.᩻ۖ᩻), (r25v3 l.᩻ۖ᩻) binds: [B:68:0x0294, B:58:0x023b, B:28:0x00fd, B:8:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m13116(ViewOnClickListenerC4062 viewOnClickListenerC4062, C13778 c13778) {
        int iM3169;
        int i;
        int i2;
        int iM2761;
        C24750 c24750;
        int i3;
        int iM2762;
        int i4;
        int i5;
        int iM2763;
        int i6;
        int i7;
        ViewOnClickListenerC4062 viewOnClickListenerC4063 = viewOnClickListenerC4062;
        int i8 = C1080.f3865;
        int i9 = C0269.f1558;
        int iM2764 = C0619.m2761("ۚܳ") ^ i9;
        int i10 = ((iM2764 ^ i8) * 2143) ^ (-1705676025);
        TextInputLayout textInputLayout = null;
        C24750 c24751 = null;
        String strM53420 = null;
        short[] sArr = null;
        int i11 = iM2764 ^ 1598323894;
        int i12 = 0;
        int iM9938 = 0;
        int iM31610 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        char c = 0;
        short s = 0;
        String strM33137 = null;
        int i16 = 1590385370;
        String strM9486 = null;
        short[] sArr2 = null;
        int iM31611 = 0;
        String strM11486 = null;
        TextInputLayout textInputLayout2 = null;
        while (true) {
            i16 = i11 ^ (i10 & (((i16 ^ i8) * (-23415)) >> 31));
            switch (i16) {
                case -2145993510:
                case 1051037393:
                    C24750 c24752 = c24751;
                    i14 = 101;
                    if (C2375.f7641 <= 0) {
                        c24751 = c24752;
                        i12 = 3;
                        iM2763 = C0619.m2761("۟۬") ^ i8;
                        i10 = ((iM2763 ^ i9) * (-14681)) ^ 570640033;
                        i6 = 44810356;
                        i7 = iM2763 ^ i6;
                        c24751 = c24751;
                        i11 = i7;
                        viewOnClickListenerC4063 = viewOnClickListenerC4062;
                    } else {
                        int iM2765 = (i8 - C0619.m2761("֫ۡ")) * (-89);
                        c24751 = c24752;
                        i10 = ((iM2765 ^ i9) * (-5775)) ^ 1153602305;
                        i11 = iM2765 ^ (-872323044);
                        i12 = 3;
                    }
                    break;
                case -2026886269:
                case 265570274:
                    C2375.m8064(viewOnClickListenerC4063.f13873);
                    C24750 c24753 = viewOnClickListenerC4063.f13863;
                    sArr = f13862;
                    if (!C1519.m5403()) {
                        c24751 = c24753;
                        iM3169 = C0619.m2761("ۙۡ") ^ i8;
                        i = ((iM3169 ^ i9) * 4119) ^ (-1790813674);
                        i2 = -2023954664;
                        i11 = iM3169 ^ i2;
                        i10 = i;
                    } else {
                        iM2761 = C0773.m3169("ۗ֡") ^ i9;
                        c24750 = c24753;
                        i10 = ((iM2761 ^ i8) * (-9687)) ^ (-350691858);
                        i3 = 300142436;
                        int i17 = iM2761 ^ i3;
                        c24751 = c24750;
                        i11 = i17;
                    }
                    break;
                case -2013193255:
                case 987575807:
                    i13 = 52254;
                    iM2762 = (C0773.m3169("ۧۛ") ^ i9) * (-25);
                    i4 = ((iM2762 ^ i8) * (-4793)) ^ 1274014592;
                    i5 = 623296427;
                    i7 = iM2762 ^ i5;
                    strM33137 = strM33137;
                    i10 = i4;
                    c24751 = c24751;
                    i11 = i7;
                    viewOnClickListenerC4063 = viewOnClickListenerC4062;
                    break;
                case -1915338712:
                case -582429409:
                    if (iM9938 != 1101) {
                        iM3169 = C0773.m3169("۬ۛ") ^ i8;
                        i = ((iM3169 ^ i9) * 26669) ^ 789518477;
                        i2 = -1874414112;
                    } else {
                        iM3169 = (i8 - C0619.m2761("۠֨")) * (-15);
                        i = ((iM3169 ^ i9) * 10511) ^ (-928834186);
                        i2 = -340395897;
                    }
                    i11 = iM3169 ^ i2;
                    i10 = i;
                    break;
                case -1783228590:
                case 1260404327:
                    if (iM9938 != 1200) {
                        iM3169 = (i9 - C0619.m2761("ᩳ᩶")) * 87;
                        i = ((iM3169 ^ i8) * 3355) ^ 585210510;
                        i2 = -1708533115;
                    } else {
                        iM3169 = C0619.m2761("᩺ۗ") ^ i9;
                        i = ((iM3169 ^ i8) * 25429) ^ (-762440599);
                        i2 = 1113609862;
                    }
                    i11 = iM3169 ^ i2;
                    i10 = i;
                    break;
                case -1778920351:
                case 2097130411:
                    if (iM9938 != 1601) {
                        iM3169 = C0773.m3169("᩻֡") ^ i8;
                        i = ((iM3169 ^ i9) * (-16757)) ^ 658084470;
                        i2 = -407502737;
                    } else {
                        iM3169 = C0619.m2761("ܶ֨") ^ i8;
                        i = ((iM3169 ^ i9) * (-18469)) ^ (-796419875);
                        i2 = 1281240404;
                    }
                    i11 = iM3169 ^ i2;
                    i10 = i;
                    break;
                case -1757897074:
                case -323665196:
                    iM31610 = C0773.m3169(C2878.m9486(f13862, UMErrorCode.E_UM_BE_RAW_OVERSIZE, 3, i13));
                    if (C2966.f9654 >= 0) {
                        iM3169 = C0619.m2761("ۙۡ") ^ i8;
                        i = ((iM3169 ^ i9) * 4119) ^ (-1790813674);
                        i2 = -2023954664;
                    } else {
                        iM3169 = (C0619.m2761("ۢ۠") ^ i9) * 15;
                        i = ((iM3169 ^ i8) * 22605) ^ (-1542009191);
                        i2 = -1517656319;
                    }
                    i11 = iM3169 ^ i2;
                    i10 = i;
                    break;
                case -1652558879:
                case -1032568520:
                    strM33137 = strM33137;
                    c24751 = c24751;
                    C17202.m40379(c13778, strM33137);
                    viewOnClickListenerC4062.m13103();
                    textInputLayout = viewOnClickListenerC4063.f13865;
                    if (C1564.m5516(c13778)) {
                        int iM2766 = (i9 - C0619.m2761("᩹ᩳ")) * (-7);
                        strM33137 = strM33137;
                        c24751 = c24751;
                        i10 = ((iM2766 ^ i8) * (-2771)) ^ 1943637040;
                        i11 = iM2766 ^ 840510302;
                    } else {
                        iM2762 = C0773.m3169("ۤ۬") ^ i8;
                        i4 = ((iM2762 ^ i9) * 18765) ^ (-230415444);
                        i5 = -538387263;
                        i7 = iM2762 ^ i5;
                        strM33137 = strM33137;
                        i10 = i4;
                        c24751 = c24751;
                        i11 = i7;
                    }
                    viewOnClickListenerC4063 = viewOnClickListenerC4062;
                    break;
                case -1527232672:
                case -826785113:
                    strM9486 = C2878.m9486(f13862, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 3, i13);
                    if (C0773.f2792 > 0) {
                        iM3169 = C0773.m3169("ۙ᩹") ^ i9;
                        i = ((iM3169 ^ i8) * (-25533)) ^ 869212175;
                        i2 = -1877450854;
                        i11 = iM3169 ^ i2;
                        i10 = i;
                    } else {
                        c24751 = c24751;
                        iM2763 = C0619.m2761("۟۬") ^ i8;
                        i10 = ((iM2763 ^ i9) * (-14681)) ^ 570640033;
                        i6 = 44810356;
                        i7 = iM2763 ^ i6;
                        c24751 = c24751;
                        i11 = i7;
                        viewOnClickListenerC4063 = viewOnClickListenerC4062;
                    }
                    break;
                case -1273846519:
                case 1631474146:
                    AbstractC0641.m2813();
                    break;
                case -1268840373:
                case 274347894:
                    C2375.m8071(textInputLayout, C0619.m2761(strM11486) ^ 2126319396);
                    break;
                case -1223951216:
                case -1039869547:
                    strM33137 = strM33137;
                    c24751 = c24751;
                    int i18 = s + 1;
                    if ((i15 + 1) - (i18 * i18) <= 0) {
                        iM2762 = C0619.m2761("۫֡") ^ i8;
                        i4 = ((iM2762 ^ i9) * (-23569)) ^ 1860883629;
                        i5 = 137939926;
                    } else {
                        iM2762 = C0619.m2761("᩹۟") ^ i9;
                        i4 = ((iM2762 ^ i8) * 14931) ^ (-6814843);
                        i5 = 362321510;
                    }
                    i7 = iM2762 ^ i5;
                    strM33137 = strM33137;
                    i10 = i4;
                    c24751 = c24751;
                    i11 = i7;
                    viewOnClickListenerC4063 = viewOnClickListenerC4062;
                    break;
                case -1098775668:
                case 2117300968:
                    strM33137 = strM33137;
                    c24751 = c24751;
                    s = sArr2[c];
                    i15 = s * 2;
                    if (C1343.m4943()) {
                        iM2762 = C0773.m3169("ᩳۢ") ^ i9;
                        i4 = ((iM2762 ^ i8) * 7555) ^ 1948218797;
                        i5 = -1739694528;
                    } else {
                        iM2762 = C0773.m3169("᩹ۙ") ^ i9;
                        i4 = ((iM2762 ^ i8) * 5713) ^ (-2090859866);
                        i5 = 444447249;
                    }
                    i7 = iM2762 ^ i5;
                    strM33137 = strM33137;
                    i10 = i4;
                    c24751 = c24751;
                    i11 = i7;
                    viewOnClickListenerC4063 = viewOnClickListenerC4062;
                    break;
                case -1084348091:
                case -616301777:
                    C2375.m8071(textInputLayout, C0619.m2761(strM9486) ^ 2102130128);
                    break;
                case -748797656:
                case -22972790:
                    i13 = 16317;
                    iM2762 = (C0773.m3169("ۧۛ") ^ i9) * (-25);
                    i4 = ((iM2762 ^ i8) * (-4793)) ^ 1274014592;
                    i5 = 623296427;
                    i7 = iM2762 ^ i5;
                    strM33137 = strM33137;
                    i10 = i4;
                    c24751 = c24751;
                    i11 = i7;
                    viewOnClickListenerC4063 = viewOnClickListenerC4062;
                    break;
                case -640856719:
                case 132895782:
                    C3448.m11248();
                    iM3169 = (i8 - C0619.m2761("ܰ֨")) * (-45);
                    i = ((iM3169 ^ i9) * (-461)) ^ 696994646;
                    i2 = -617068711;
                    i11 = iM3169 ^ i2;
                    i10 = i;
                    break;
                case -534708337:
                case 892869006:
                    C1783.m6232();
                    if (C3690.f12684 <= 0) {
                        iM3169 = C0619.m2761("ۙۚ") ^ i9;
                        i = ((iM3169 ^ i8) * 1561) ^ (-1358783084);
                        i2 = 662742404;
                    } else {
                        iM3169 = C0619.m2761("ۙۡ") ^ i8;
                        i = ((iM3169 ^ i9) * 4119) ^ (-1790813674);
                        i2 = -2023954664;
                    }
                    i11 = iM3169 ^ i2;
                    i10 = i;
                    break;
                case -513550826:
                case 1783946929:
                    C17202.m40373(RunnableC1848.m6367(c13778, 2118675201 ^ iM31611));
                    break;
                case 76437153:
                case 1679929918:
                    C24750 c24754 = c24751;
                    iM9938 = RunnableC3055.m9938(c13778);
                    if (iM9938 == 1001) {
                        int iM2767 = C0619.m2761("ܽ᩸") ^ i9;
                        i = ((iM2767 ^ i8) * 25299) ^ (-667446881);
                        c24751 = c24754;
                        i11 = iM2767 ^ 122946055;
                        i10 = i;
                    } else {
                        iM2761 = C0619.m2761("֡ᩴ") ^ i9;
                        c24750 = c24754;
                        i10 = ((iM2761 ^ i8) * 22241) ^ 45364403;
                        i3 = -1567616828;
                        int i19 = iM2761 ^ i3;
                        c24751 = c24750;
                        i11 = i19;
                    }
                    break;
                case 147252922:
                case 811687624:
                    C2287.m7745();
                    if (AbstractC3624.m11755() == 0) {
                        c24751 = c24751;
                        iM2763 = C0619.m2761("۟۬") ^ i8;
                        i10 = ((iM2763 ^ i9) * (-14681)) ^ 570640033;
                        i6 = 44810356;
                        i7 = iM2763 ^ i6;
                        c24751 = c24751;
                        i11 = i7;
                        viewOnClickListenerC4063 = viewOnClickListenerC4062;
                    } else {
                        iM3169 = (i8 - C0619.m2761("ܰ֨")) * (-45);
                        i = ((iM3169 ^ i9) * (-461)) ^ 696994646;
                        i2 = -617068711;
                        i11 = iM3169 ^ i2;
                        i10 = i;
                    }
                    break;
                case 480314420:
                case 530619318:
                    C2375.m8071(textInputLayout2, C0619.m2761(strM53420) ^ 2125143142);
                    break;
                case 672293059:
                case 2057709848:
                    strM11486 = C3492.m11486(f13862, IShizukuService.Stub.TRANSACTION_isHidden, 3, i13);
                    if (RunnableC3646.f12471) {
                        iM3169 = C0619.m2761("ۙۡ") ^ i8;
                        i = ((iM3169 ^ i9) * 4119) ^ (-1790813674);
                        i2 = -2023954664;
                    } else {
                        iM3169 = (C0773.m3169("ۛ۠") ^ i8) * 37;
                        i = ((iM3169 ^ i9) * 29295) ^ (-61855073);
                        i2 = 26049834;
                    }
                    i11 = iM3169 ^ i2;
                    i10 = i;
                    break;
                case 961009607:
                case 1547332312:
                    if (C2702.f8586 > 0) {
                        iM3169 = C0619.m2761("ۙۚ") ^ i9;
                        i = ((iM3169 ^ i8) * 1561) ^ (-1358783084);
                        i2 = 662742404;
                        i11 = iM3169 ^ i2;
                        i10 = i;
                    } else {
                        c24751 = c24751;
                        iM2763 = C0619.m2761("۟۬") ^ i8;
                        i10 = ((iM2763 ^ i9) * (-14681)) ^ 570640033;
                        i6 = 44810356;
                        i7 = iM2763 ^ i6;
                        c24751 = c24751;
                        i11 = i7;
                        viewOnClickListenerC4063 = viewOnClickListenerC4062;
                    }
                    break;
                case 1020488705:
                case 1365928236:
                    iM31611 = C0773.m3169(C3077.m10047(f13862, 116, 3, i13));
                    if (C17202.f56030) {
                        iM3169 = (i9 - C0619.m2761("ۚ֫")) * 115;
                        i = ((iM3169 ^ i8) * (-28487)) ^ (-1873439819);
                        i2 = -583551396;
                    } else {
                        iM3169 = (i8 - C0619.m2761("ܰ֨")) * (-45);
                        i = ((iM3169 ^ i9) * (-461)) ^ 696994646;
                        i2 = -617068711;
                    }
                    i11 = iM3169 ^ i2;
                    i10 = i;
                    break;
                case 1191573382:
                case 1275655589:
                    c24751 = c24751;
                    strM33137 = C13473.m33137(f13862, 93, 8, i13);
                    if (C3077.f9998) {
                        iM2763 = C0619.m2761("᩺ܺ") ^ i8;
                        i10 = ((iM2763 ^ i9) * 4081) ^ (-1373666978);
                        i6 = 1176148233;
                    } else {
                        iM2763 = C0619.m2761("۟۬") ^ i8;
                        i10 = ((iM2763 ^ i9) * (-14681)) ^ 570640033;
                        i6 = 44810356;
                    }
                    i7 = iM2763 ^ i6;
                    c24751 = c24751;
                    i11 = i7;
                    viewOnClickListenerC4063 = viewOnClickListenerC4062;
                    break;
                case 1215535967:
                case 1831204100:
                    textInputLayout2 = viewOnClickListenerC4063.f13868;
                    strM53420 = C23916.m53420(f13862, UMErrorCode.E_UM_BE_JSON_FAILED, 3, i13);
                    if (C1343.m4943()) {
                        iM3169 = C0773.m3169("᩵᩶") ^ i8;
                        i = ((iM3169 ^ i9) * (-19357)) ^ (-593459520);
                        i2 = -993688577;
                    } else {
                        iM3169 = C0619.m2761("ۙۚ") ^ i9;
                        i = ((iM3169 ^ i8) * 1561) ^ (-1358783084);
                        i2 = 662742404;
                    }
                    i11 = iM3169 ^ i2;
                    i10 = i;
                    break;
                case 1620548334:
                case 1769835884:
                    C17617.m41269(textInputLayout, C3033.m9850(c13778, 2121635521 ^ iM31610));
                    break;
                case 1879195440:
                case 1925459941:
                    strM33137 = strM33137;
                    c24751 = c24751;
                    sArr2 = f13862;
                    c = '\\';
                    if (C2310.f7472 < 0) {
                        iM2762 = (C0619.m2761("۬ܺ") + i8) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2762 ^ i9) * (-18011)) ^ 1072483689;
                        i5 = 1712080858;
                        i7 = iM2762 ^ i5;
                        strM33137 = strM33137;
                        i10 = i4;
                        c24751 = c24751;
                        i11 = i7;
                        viewOnClickListenerC4063 = viewOnClickListenerC4062;
                    } else {
                        strM33137 = strM33137;
                        iM2763 = C0619.m2761("۟۬") ^ i8;
                        i10 = ((iM2763 ^ i9) * (-14681)) ^ 570640033;
                        i6 = 44810356;
                        i7 = iM2763 ^ i6;
                        c24751 = c24751;
                        i11 = i7;
                        viewOnClickListenerC4063 = viewOnClickListenerC4062;
                    }
                    break;
                default:
                    c24751.m55253(C0773.m3169(C2702.m8881(sArr, i14, i12, i13)) ^ 2129445386);
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x018b A[PHI: r2 r4 r9 r10 r12 r13
      0x018b: PHI (r2v4 java.lang.Runnable) = 
      (r2v3 java.lang.Runnable)
      (r2v2 java.lang.Runnable)
      (r2v2 java.lang.Runnable)
      (r2v2 java.lang.Runnable)
      (r2v2 java.lang.Runnable)
     binds: [B:44:0x0189, B:36:0x013e, B:28:0x00e0, B:11:0x0071, B:8:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x018b: PHI (r4v4 android.view.View) = 
      (r4v2 android.view.View)
      (r4v2 android.view.View)
      (r4v3 android.view.View)
      (r4v2 android.view.View)
      (r4v2 android.view.View)
     binds: [B:44:0x0189, B:36:0x013e, B:28:0x00e0, B:11:0x0071, B:8:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x018b: PHI (r9v4 short[]) = (r9v3 short[]), (r9v2 short[]), (r9v2 short[]), (r9v2 short[]), (r9v2 short[]) binds: [B:44:0x0189, B:36:0x013e, B:28:0x00e0, B:11:0x0071, B:8:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x018b: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:44:0x0189, B:36:0x013e, B:28:0x00e0, B:11:0x0071, B:8:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x018b: PHI (r12v4 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:44:0x0189, B:36:0x013e, B:28:0x00e0, B:11:0x0071, B:8:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x018b: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:44:0x0189, B:36:0x013e, B:28:0x00e0, B:11:0x0071, B:8:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x021a A[PHI: r6 r14 r19
      0x021a: PHI (r6v3 long) = (r6v1 long), (r6v2 long), (r6v1 long), (r6v1 long), (r6v1 long) binds: [B:55:0x0218, B:20:0x0092, B:16:0x007e, B:14:0x007a, B:11:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x021a: PHI (r14v4 short) = (r14v3 short), (r14v2 short), (r14v2 short), (r14v2 short), (r14v2 short) binds: [B:55:0x0218, B:20:0x0092, B:16:0x007e, B:14:0x007a, B:11:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x021a: PHI (r19v4 int) = (r19v3 int), (r19v2 int), (r19v2 int), (r19v2 int), (r19v2 int) binds: [B:55:0x0218, B:20:0x0092, B:16:0x007e, B:14:0x007a, B:11:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0251 A[PHI: r5 r8 r18 r24
      0x0251: PHI (r5v4 android.animation.ObjectAnimator) = 
      (r5v2 android.animation.ObjectAnimator)
      (r5v2 android.animation.ObjectAnimator)
      (r5v3 android.animation.ObjectAnimator)
      (r5v2 android.animation.ObjectAnimator)
     binds: [B:59:0x024f, B:40:0x0164, B:24:0x00b9, B:14:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:59:0x024f, B:40:0x0164, B:24:0x00b9, B:14:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r18v4 short) = (r18v3 short), (r18v2 short), (r18v2 short), (r18v2 short) binds: [B:59:0x024f, B:40:0x0164, B:24:0x00b9, B:14:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r24v5 short) = (r24v4 short), (r24v3 short), (r24v3 short), (r24v3 short) binds: [B:59:0x024f, B:40:0x0164, B:24:0x00b9, B:14:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0285 A[PHI: r16 r17
      0x0285: PHI (r16v5 short[]) = (r16v3 short[]), (r16v2 short[]) binds: [B:63:0x0283, B:8:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r17v5 char) = (r17v3 char), (r17v2 char) binds: [B:63:0x0283, B:8:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m13103() {
        int iM3169;
        int i;
        int i2;
        int i3 = C1783.f6087;
        int i4 = C1146.f4234;
        int iM31610 = (C0773.m3169("ᩴۙ") ^ i3) * 53;
        int i5 = ((iM31610 ^ i4) * 26671) ^ (-1986894377);
        long j = 0;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM31610 ^ (-749279352);
        int iM2761 = 0;
        int i7 = 0;
        int i8 = 0;
        short s = 0;
        int i9 = 0;
        char c = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = -1218398826;
        short s3 = 0;
        ObjectAnimator objectAnimatorM6307 = null;
        View view = null;
        float[] fArr = null;
        Runnable runnable = null;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i4) * 6401) >> 31));
            switch (i11) {
                case -1946913706:
                case 1735395868:
                    s3 = sArr[c];
                    s2 = 4729;
                    if (C2419.m8174() >= 0) {
                        iM3169 = C0773.m3169("ܶۚ") ^ i4;
                        i = ((iM3169 ^ i3) * 28543) ^ 1049313472;
                        i2 = 1011010673;
                    } else {
                        iM3169 = (C0773.m3169("ۢۗ") + i4) * 13;
                        i = ((iM3169 ^ i3) * 17879) ^ (-626550718);
                        i2 = 97190171;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1942260713:
                case 1489523367:
                    C2485.m8357();
                    iM3169 = (C0619.m2761("ۨ᩷") ^ i3) * 85;
                    i = ((iM3169 ^ i4) * (-29109)) ^ (-2097561458);
                    i2 = 1962972201;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1921512144:
                case -749382784:
                    i9 = 52839;
                    iM3169 = (C0619.m2761("ۢۡ") ^ i4) * (-23);
                    i = ((iM3169 ^ i3) * 15291) ^ 53426532;
                    i2 = -1117332787;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1910319769:
                case -33032397:
                    sArr = f13862;
                    c = '8';
                    if (C3077.f9998) {
                        iM3169 = (C0773.m3169("֨᩷") ^ i3) * 37;
                        i = ((iM3169 ^ i4) * 15431) ^ 1023537459;
                        i2 = 846158955;
                    } else {
                        iM3169 = (C0619.m2761("᩷۬") + i4) * (-9);
                        i = ((iM3169 ^ i3) * (-27879)) ^ (-1205895939);
                        i2 = -1439996786;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1884592777:
                case 449536196:
                    i9 = 25594;
                    iM3169 = (C0619.m2761("ۢۡ") ^ i4) * (-23);
                    i = ((iM3169 ^ i3) * 15291) ^ 53426532;
                    i2 = -1117332787;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1737255352:
                case 1267430189:
                    runnable = new Runnable() { // from class: l.ۨۡ᩻
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewOnClickListenerC4062.m13115(this.f39442);
                        }
                    };
                    sArr2 = f13862;
                    i7 = 57;
                    if (C2485.f7950 != 0) {
                        iM3169 = C0619.m2761("ۡܰ") ^ i3;
                        i = ((iM3169 ^ i4) * (-27809)) ^ (-1234842597);
                        i2 = -1828809755;
                    } else {
                        iM3169 = C0773.m3169("ܶܳ") ^ i4;
                        i = ((iM3169 ^ i3) * (-26435)) ^ 1024446312;
                        i2 = 2064684422;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1679422256:
                case 212664523:
                    if ((s3 * s) - i10 > 0) {
                        iM3169 = (C0619.m2761("۠ۜ") ^ i3) * (-59);
                        i = ((iM3169 ^ i4) * 31705) ^ 1685010560;
                        i2 = 1755511426;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ᩳۜ")) * (-53);
                        i = ((iM3169 ^ i3) * (-12401)) ^ 1614518456;
                        i2 = -132001724;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -945461904:
                case 910739393:
                    fArr = new float[2];
                    if (C2834.f9334 <= 0) {
                        iM3169 = (i3 - C0619.m2761("᩵᩺")) * 31;
                        i = ((iM3169 ^ i4) * 1445) ^ 1459845450;
                        i2 = 607671880;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ܺ᩷")) * (-15);
                        i = ((iM3169 ^ i4) * 20831) ^ 870057170;
                        i2 = -501205817;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -932853838:
                case 2120173858:
                    j = 200;
                    RunnableC0334.m2052(objectAnimatorM6307.setDuration(200L));
                    if (C2354.f7599 >= 0) {
                        iM3169 = (C0619.m2761("ۨ᩷") ^ i3) * 85;
                        i = ((iM3169 ^ i4) * (-29109)) ^ (-2097561458);
                        i2 = 1962972201;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ܶ᩷")) * (-79);
                        i = ((iM3169 ^ i3) * 531) ^ (-1526589129);
                        i2 = 1712753347;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -900141847:
                case 448367207:
                    C21232.m48399(this.f13873, 2127263291 ^ iM2761, runnable);
                    if (C23916.f77426 <= 0) {
                        iM3169 = C0619.m2761("ۡܰ") ^ i3;
                        i = ((iM3169 ^ i4) * (-27809)) ^ (-1234842597);
                        i2 = -1828809755;
                    } else {
                        iM3169 = C0619.m2761("۠۠") ^ i4;
                        i = ((iM3169 ^ i3) * 21407) ^ 1208486461;
                        i2 = -2043591229;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -882299591:
                case -670353228:
                    iM2761 = C0619.m2761(C2023.m6966(sArr2, i7, 3, i9));
                    if (C0619.m2763()) {
                        iM3169 = C0773.m3169("ܶۚ") ^ i4;
                        i = ((iM3169 ^ i3) * 28543) ^ 1049313472;
                        i2 = 1011010673;
                    } else {
                        iM3169 = C0619.m2761("֫֨") ^ i3;
                        i = ((iM3169 ^ i4) * (-24397)) ^ 601070245;
                        i2 = -2140393406;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -808216241:
                case -696884988:
                    C0862.m3503();
                    break;
                case -657840516:
                case -617183774:
                    C1321.m4852();
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = (C0619.m2761("ۨ᩷") ^ i3) * 85;
                        i = ((iM3169 ^ i4) * (-29109)) ^ (-2097561458);
                        i2 = 1962972201;
                    } else {
                        iM3169 = C0773.m3169("ܶۚ") ^ i4;
                        i = ((iM3169 ^ i3) * 28543) ^ 1049313472;
                        i2 = 1011010673;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -540403577:
                case -281234196:
                    C3779.m12264();
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0619.m2761("ۡܰ") ^ i3;
                        i = ((iM3169 ^ i4) * (-27809)) ^ (-1234842597);
                        i2 = -1828809755;
                    } else {
                        iM3169 = (C0619.m2761("᩷۬") + i4) * (-9);
                        i = ((iM3169 ^ i3) * (-27879)) ^ (-1205895939);
                        i2 = -1439996786;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -201329200:
                case 666702505:
                    int i12 = s3 + s2;
                    i10 = i12 * i12;
                    s = 18916;
                    if (C13473.f42873 != 0) {
                        iM3169 = (C0619.m2761("ۨ᩷") ^ i3) * 85;
                        i = ((iM3169 ^ i4) * (-29109)) ^ (-2097561458);
                        i2 = 1962972201;
                    } else {
                        iM3169 = C0773.m3169("֫᩻") ^ i3;
                        i = ((iM3169 ^ i4) * 787) ^ (-360174185);
                        i2 = -774721770;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 179154633:
                case 1155285806:
                    // fill-array-data instruction
                    fArr[0] = 1.0f;
                    fArr[1] = 0.0f;
                    view = this.f13870;
                    sArr3 = f13862;
                    i8 = 60;
                    if (C11235.m28309() != 0) {
                        iM3169 = C0619.m2761("ۡܰ") ^ i3;
                        i = ((iM3169 ^ i4) * (-27809)) ^ (-1234842597);
                        i2 = -1828809755;
                    } else {
                        iM3169 = (C0619.m2761("᩸ۜ") + i3) * (-11);
                        i = ((iM3169 ^ i4) * 16945) ^ (-846080121);
                        i2 = -686223325;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 411235585:
                case 1001862054:
                    objectAnimatorM6307 = C1826.m6307(view, C17202.m40377(sArr3, i8, 5, i9), fArr);
                    if (C0487.f2131 <= 0) {
                        iM3169 = C0773.m3169("ܶۚ") ^ i4;
                        i = ((iM3169 ^ i3) * 28543) ^ 1049313472;
                        i2 = 1011010673;
                    } else {
                        iM3169 = C0773.m3169("ܰ᩹") ^ i4;
                        i = ((iM3169 ^ i3) * (-21861)) ^ (-544071425);
                        i2 = -836309399;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 957228077:
                case 1639317375:
                    if (AbstractC0641.f2496 < 0) {
                        iM3169 = (C0619.m2761("ۨ᩷") ^ i3) * 85;
                        i = ((iM3169 ^ i4) * (-29109)) ^ (-2097561458);
                        i2 = 1962972201;
                    } else {
                        iM3169 = C0619.m2761("ۡܰ") ^ i3;
                        i = ((iM3169 ^ i4) * (-27809)) ^ (-1234842597);
                        i2 = -1828809755;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    C3492.m11477(new Runnable() { // from class: l.ۛۡ᩻
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewOnClickListenerC4062.m13104(this.f21369);
                        }
                    }, j);
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13104(ViewOnClickListenerC4062 viewOnClickListenerC4062) {
        C2485.m8358(viewOnClickListenerC4062.f13870, 8);
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 40421. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:99)
        */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r52) {
        /*
            Method dump skipped, instruction units count: 4042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC4062.onClick(android.view.View):void");
    }
}
