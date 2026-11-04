package l;

import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.Spinner;
import bin.mt.plus.Main;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.Primes;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX INFO: renamed from: l.۠֡ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q152 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC8261 implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    /* JADX INFO: renamed from: ᩺ܿۗ, reason: not valid java name and contains not printable characters */
    private static final short[] f27186 = {2723, -3714, -9412, 12314, 9378, -8697, 9384, 8266, -3737, -2347, 14837, -15367, -2057, 13154, -3957, -12104, 13853, -6973, -1316, 9259, -1251, -8605, -15809, 15491, -15766, 12936, -10665, -16151, 9458, -7039, -13581, -10849, -10600, -14504, -21785, -21762, -21781, -21782, -21799, -21771, -21789, -21785, -21772, -21787, -21778, -21799, -21774, -21761, -21770, -21789, -21785, -21762, -21781, -21782, -21799, -21771, -21789, -21785, -21772, -21787, -21778, -21799, -21781, -21785, -21774, -21787, -21778, -21799, -21787, -21785, -21771, -21789, -21785, -21762, -21781, -21782, -21799, -21771, -21789, -21785, -21772, -21787, -21778, -21799, -21772, -21789, -21791, -21789, -21762, -21785, -21762, -21781, -21782, -21799, -21771, -21789, -21785, -21772, -21787, -21778, -21799, -21778, -21789, -21762, -21785, -21762, -21781, -21782, -21799, -21771, -21789, -21785, -21772, -21787, -21778, -21799, -21777, -21790, -21836, -21784, -21785, -21781, -21789, -21785, -21762, -21781, -21782, -21799, -21771, -21789, -21785, -21772, -21787, -21778, -21799, -21789, -21762, -21785, -21787, -21774, -21782, -21761, -21799, -21781, -21785, -21774, -21787, -21778, -14975, 8611, 9096, -14305, 9663, 10862, 14524, -2493, -458, 647, 31890, 31935, 31912, 31933, 31971, 31929, 31904, 31933, 171, 15957, 5945, 13405, 16221, 4602, 15072, -1231, 1868, -4935, 27846, 27790, 27846, 27822, 27861, 27862, 27870, 27861, 27812, 27812, 27825, 27825, 27828, 27828, 27866, 27862, 27861, 27831, 27831, 27812, 27812, 27825, 27825, 27828, 27828, 27864, 27864, 27864, 27871, 27818, 27800, -1171, 5767, 14040, 27900, 6008, -1482, -1066, -4350, 1536, -7992, 27799, 27790, 27803, 27802, 27817, 27781, 27795, 27799, 27780, 27797, 27806, 27817, 27778, 27791, 27782, 27795, 27799, 27790, 27803, 27802, 27817, 27781, 27795, 27799, 27780, 27797, 27806, 27817, 27803, 27799, 27778, 27797, 27806, 27817, 27797, 27799, 27781, 27795, 27799, 27790, 27803, 27802, 27817, 27781, 27795, 27799, 27780, 27797, 27806, 27817, 27780, 27795, 27793, 27795, 27790, 27799, 27790, 27803, 27802, 27817, 27781, 27795, 27799, 27780, 27797, 27806, 27817, 27806, 27795, 27790, 27799, 27790, 27803, 27802, 27817, 27781, 27795, 27799, 27780, 27797, 27806, 27817, 27807, 27794, 27844, 27800, 27799, 27803, 27795, 27799, 27790, 27803, 27802, 27817, 27781, 27795, 27799, 27780, 27797, 27806, 27817, 27795, 27790, 27799, 27797, 27778, 27802, 27791, 27817, 27803, 27799, 27778, 27797, 27806, 27818, 27780, 27899, 2187, 2170, -7023, 27818, 27778, 27903, 27818, 27792, 27898, 27818, 27796, 27902};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final CheckBox f27187;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final CheckBox f27188;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C17771 f27189;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C8614 f27190;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final CheckBox f27191;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final Spinner f27192;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C17771 f27193;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String f27194;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 f27195;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f27196;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final CheckBox f27197;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CheckBox f27198;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0225 A[PHI: r0 r3 r20
      0x0225: PHI (r0v4 l.᩷ۨᩴ) = (r0v1 l.᩷ۨᩴ), (r0v1 l.᩷ۨᩴ), (r0v3 l.᩷ۨᩴ), (r0v1 l.᩷ۨᩴ) binds: [B:60:0x0223, B:48:0x01ca, B:21:0x009e, B:14:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0225: PHI (r3v5 short[]) = (r3v1 short[]), (r3v1 short[]), (r3v4 short[]), (r3v1 short[]) binds: [B:60:0x0223, B:48:0x01ca, B:21:0x009e, B:14:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0225: PHI (r20v3 l.᩷ۨᩴ) = (r20v1 l.᩷ۨᩴ), (r20v1 l.᩷ۨᩴ), (r20v2 l.᩷ۨᩴ), (r20v1 l.᩷ۨᩴ) binds: [B:60:0x0223, B:48:0x01ca, B:21:0x009e, B:14:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0251  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if (l.C3033.m9845() > 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        if (l.C2834.f9334 <= 0) goto L7;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m22272(l.ViewOnClickListenerC8261 r22, int r23, l.C4245 r24, boolean r25, boolean r26, boolean r27, java.lang.String r28, int r29, int r30, l.C9651 r31, boolean r32) {
        /*
            Method dump skipped, instruction units count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC8261.m22272(l.۠֡ۤ, int, l.ۘܶۤ, boolean, boolean, boolean, java.lang.String, int, int, l.ۡ᩷᩸, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x01d9, code lost:
    
        if (l.C3077.f9998 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ViewOnClickListenerC8261(l.AbstractC22044 r66, l.C8614 r67, java.lang.String r68) {
        /*
            Method dump skipped, instruction units count: 3828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC8261.<init>(l.᩷ۨᩴ, l.۠ۨܳ, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m22270() {
        CheckBox checkBox = null;
        boolean z = false;
        int i = -1662891565;
        int i2 = C2419.f7754;
        int i3 = C3033.f9831;
        int iM3169 = (C0773.m3169("ۚۗ") + i3) * 45;
        int i4 = ((iM3169 ^ i2) * 7523) ^ (-2129020610);
        int i5 = -2011208722;
        while (true) {
            i = ((((i ^ i2) * (-26759)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1580749451:
                case 2075776216:
                    checkBox = this.f27188;
                    if (C2288.m7767()) {
                        iM3169 = (C0773.m3169("᩹ܰ") ^ i2) * (-93);
                        i4 = ((iM3169 ^ i3) * 25635) ^ 1756286770;
                        i5 = 748212047;
                    } else {
                        iM3169 = C0619.m2761("ܳۘ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 13891) ^ 457341617;
                        i5 = -357858273;
                    }
                    break;
                case -1520139871:
                case -12629359:
                    C1519.m5403();
                    break;
                case -1323193504:
                case -895726384:
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0619.m2761("۟ᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-15751)) ^ (-1647617726);
                        i5 = -2014449881;
                    } else {
                        iM3169 = C0773.m3169("ۤᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 29289) ^ 1484772364;
                        i5 = 1034958660;
                    }
                    break;
                case -1220586665:
                case -176137685:
                    if (C11235.m28309() != 0) {
                        iM3169 = (C0773.m3169("᩹ܰ") ^ i2) * (-93);
                        i4 = ((iM3169 ^ i3) * 25635) ^ 1756286770;
                        i5 = 748212047;
                    } else {
                        iM3169 = (C0619.m2761("ۙᩴ") ^ i2) * (-9);
                        i4 = ((iM3169 ^ i3) * 32541) ^ (-2073576665);
                        i5 = -920046942;
                    }
                    break;
                case -1181325871:
                case -540209632:
                    if (C1343.m4943()) {
                        iM3169 = C0619.m2761("ᩴۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 30325) ^ 728824246;
                        i5 = -239770939;
                    } else {
                        iM3169 = C0619.m2761("۟ᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-15751)) ^ (-1647617726);
                        i5 = -2014449881;
                    }
                    break;
                case -813242327:
                case 1738586438:
                    this.f27189.m41606(z);
                    if (C1146.m4231()) {
                        iM3169 = C0619.m2761("۬ۛ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 10189) ^ (-1622908407);
                        i5 = -1644211841;
                    } else {
                        iM3169 = C0619.m2761("۟ᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-15751)) ^ (-1647617726);
                        i5 = -2014449881;
                    }
                    break;
                case -764615455:
                case 961565610:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = (C0619.m2761("᩸ۘ") ^ i3) * (-123);
                        i4 = ((iM3169 ^ i2) * (-15815)) ^ 1258899804;
                        i5 = -1981884029;
                    } else {
                        iM3169 = (C0619.m2761("ۛܿ") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM3169 ^ i3) * (-21927)) ^ 1621533676;
                        i5 = -327979321;
                    }
                    break;
                case -756498551:
                case 1066916548:
                    if (checkBox.getVisibility() == 0) {
                        iM3169 = C0619.m2761("ܺ֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3951)) ^ 407841453;
                        i5 = -1771565488;
                    } else {
                        iM3169 = C0773.m3169("۟᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-15605)) ^ (-228992131);
                        i5 = -2146098780;
                    }
                    break;
                case -555716715:
                case 907136881:
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0619.m2761("ۛ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-27387)) ^ 428058824;
                        i5 = -122585242;
                    } else {
                        iM3169 = (C0619.m2761("ۨ᩸") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM3169 ^ i2) * (-4585)) ^ 1773740936;
                        i5 = 1624490771;
                    }
                    break;
                case -340521189:
                case -85563931:
                    if (C2966.f9654 >= 0) {
                        iM3169 = (C0619.m2761("ۨ᩸") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM3169 ^ i2) * (-4585)) ^ 1773740936;
                        i5 = 1624490771;
                    } else {
                        iM3169 = (i2 - C0619.m2761("᩷ܽ")) * (-117);
                        i4 = ((iM3169 ^ i3) * (-29777)) ^ (-878883574);
                        i5 = 1747091996;
                    }
                    break;
                case -290222452:
                case 1892044818:
                    C2834.m9344();
                    AbstractC0641.m2813();
                    iM3169 = (C0619.m2761("ۨ᩸") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i4 = ((iM3169 ^ i2) * (-4585)) ^ 1773740936;
                    i5 = 1624490771;
                    break;
                case -140413200:
                case 1914941370:
                    this.f27193.m41600(z);
                    break;
                case -89473567:
                case 353102393:
                    if (C2485.m8360(checkBox)) {
                        iM3169 = C0619.m2761("᩸ۗ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 26369) ^ (-1168795854);
                        i5 = 1520190812;
                    } else {
                        iM3169 = C0773.m3169("۟᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-15605)) ^ (-228992131);
                        i5 = -2146098780;
                    }
                    break;
                case 17191625:
                case 510294939:
                    if (C2419.f7754 >= 0) {
                        iM3169 = (C0773.m3169("᩹ܰ") ^ i2) * (-93);
                        i4 = ((iM3169 ^ i3) * 25635) ^ 1756286770;
                        i5 = 748212047;
                    } else {
                        iM3169 = C0619.m2761("ۗ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * 6357) ^ 1138515648;
                        i5 = -1835818819;
                    }
                    break;
                case 20342711:
                case 505358964:
                    z = true;
                    iM3169 = (C0619.m2761("᩹֫") + i3) * (-81);
                    i4 = ((iM3169 ^ i2) * (-28895)) ^ 282181601;
                    i5 = -707417235;
                    break;
                case 283236925:
                case 1092207480:
                    if (C2288.f7433 > 0) {
                        iM3169 = (C0619.m2761("᩸ۘ") ^ i3) * (-123);
                        i4 = ((iM3169 ^ i2) * (-15815)) ^ 1258899804;
                        i5 = -1981884029;
                    } else {
                        iM3169 = C0619.m2761("ۛ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-27387)) ^ 428058824;
                        i5 = -122585242;
                    }
                    break;
                case 330851263:
                case 451186613:
                    if (C2023.f6737) {
                        iM3169 = C0619.m2761("ۛ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-27387)) ^ 428058824;
                        i5 = -122585242;
                    } else {
                        iM3169 = C0773.m3169("᩷ܿ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 17497) ^ (-1580938956);
                        i5 = 1491094357;
                    }
                    break;
                case 800755963:
                case 1875504498:
                    z = false;
                    iM3169 = (C0619.m2761("᩹֫") + i3) * (-81);
                    i4 = ((iM3169 ^ i2) * (-28895)) ^ 282181601;
                    i5 = -707417235;
                    break;
                case 1734643215:
                case 1748050937:
                    C2023.m6964();
                    if (C3690.f12684 > 0) {
                        iM3169 = (C0773.m3169("᩹ܰ") ^ i2) * (-93);
                        i4 = ((iM3169 ^ i3) * 25635) ^ 1756286770;
                        i5 = 748212047;
                    } else {
                        iM3169 = C0619.m2761("ۛ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-27387)) ^ 428058824;
                        i5 = -122585242;
                    }
                    break;
                default:
                    if (C3077.f9998) {
                        iM3169 = C0619.m2761("᩺ܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 23509) ^ 539791416;
                        i5 = 1471804335;
                    } else {
                        iM3169 = C0619.m2761("ۛ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-27387)) ^ 428058824;
                        i5 = -122585242;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:141:0x07ab A[PHI: r2 r13 r16 r21 r23 r35 r39 r40 r41 r45
      0x07ab: PHI (r2v37 java.lang.String) = (r2v24 java.lang.String), (r2v38 java.lang.String) binds: [B:139:0x0794, B:109:0x0569] A[DONT_GENERATE, DONT_INLINE]
      0x07ab: PHI (r13v56 java.lang.String) = (r13v44 java.lang.String), (r13v57 java.lang.String) binds: [B:139:0x0794, B:109:0x0569] A[DONT_GENERATE, DONT_INLINE]
      0x07ab: PHI (r16v4 l.ۘܶۤ) = (r16v3 l.ۘܶۤ), (r16v2 l.ۘܶۤ) binds: [B:139:0x0794, B:109:0x0569] A[DONT_GENERATE, DONT_INLINE]
      0x07ab: PHI (r21v50 java.lang.String) = (r21v38 java.lang.String), (r21v51 java.lang.String) binds: [B:139:0x0794, B:109:0x0569] A[DONT_GENERATE, DONT_INLINE]
      0x07ab: PHI (r23v56 boolean) = (r23v44 boolean), (r23v57 boolean) binds: [B:139:0x0794, B:109:0x0569] A[DONT_GENERATE, DONT_INLINE]
      0x07ab: PHI (r35v46 boolean) = (r35v35 boolean), (r35v47 boolean) binds: [B:139:0x0794, B:109:0x0569] A[DONT_GENERATE, DONT_INLINE]
      0x07ab: PHI (r39v66 java.lang.String) = (r39v56 java.lang.String), (r39v67 java.lang.String) binds: [B:139:0x0794, B:109:0x0569] A[DONT_GENERATE, DONT_INLINE]
      0x07ab: PHI (r40v23 java.lang.String) = (r40v15 java.lang.String), (r40v24 java.lang.String) binds: [B:139:0x0794, B:109:0x0569] A[DONT_GENERATE, DONT_INLINE]
      0x07ab: PHI (r41v35 java.lang.String) = (r41v23 java.lang.String), (r41v36 java.lang.String) binds: [B:139:0x0794, B:109:0x0569] A[DONT_GENERATE, DONT_INLINE]
      0x07ab: PHI (r45v42 l.ܽᩳ᩻) = (r45v31 l.ܽᩳ᩻), (r45v43 l.ܽᩳ᩻) binds: [B:139:0x0794, B:109:0x0569] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int iM2761;
        int i2;
        int i3;
        int iM4845;
        int iM4846;
        String strM6366;
        String str;
        String str2;
        String str3;
        String strM8350;
        String str4;
        int iM2762;
        int i4;
        int i5;
        int iM2763;
        int i6;
        int i7;
        int iM3169;
        int i8;
        int i9;
        boolean z;
        int iM31610;
        int i10;
        int iM2764;
        int i11;
        int i12;
        int iM2765;
        int i13;
        int i14;
        int selectedItemPosition = 0;
        boolean zM33141 = false;
        boolean zM33142 = false;
        boolean z2 = false;
        String strM9931 = null;
        int iM29451 = 0;
        String str5 = null;
        Exception exc = null;
        int iM29456 = 0;
        C4245 c4245 = null;
        C4245 c4246 = null;
        String str6 = null;
        int i15 = 0;
        int i16 = 0;
        String strM9932 = null;
        int i17 = -1052681950;
        int i18 = C1321.f4751;
        int i19 = C4282.f15546;
        int iM31611 = (C0773.m3169("ۚۙ") + i19) * (-107);
        int i20 = ((iM31611 ^ i18) * 18691) ^ 2105919177;
        int i21 = iM31611 ^ 1266730681;
        C8614 c8614 = null;
        C4245 c4245Matcher = null;
        String str7 = null;
        String strM4228 = null;
        int i22 = 0;
        boolean zM33143 = false;
        boolean zM8360 = false;
        String str8 = null;
        DialogInterfaceC8327 dialogInterfaceC8327 = null;
        Exception exc2 = null;
        String str9 = null;
        C17771 c17771 = null;
        String str10 = null;
        C4245 c4247 = null;
        String str11 = null;
        int i23 = 0;
        int iM31612 = 0;
        C17771 c17772 = null;
        String str12 = null;
        boolean z3 = false;
        while (true) {
            i17 = i21 ^ (i20 & (((i17 ^ i18) * 28207) >> 31));
            switch (i17) {
                case -2113868031:
                case -373329804:
                    if (!C0487.m2359(str10, str12)) {
                        strM9932 = str10;
                        iM2765 = (i19 - C0619.m2761("֨ۨ")) * (-15);
                        i13 = ((iM2765 ^ i18) * (-31837)) ^ 1121485968;
                        i14 = 1274992207;
                        i21 = iM2765 ^ i14;
                        i20 = i13;
                    } else {
                        zM33142 = zM33142;
                        str9 = str9;
                        z2 = z2;
                        iM2762 = C0619.m2761("ۖۗ") ^ i19;
                        i4 = ((iM2762 ^ i18) * (-10035)) ^ (-1483333839);
                        i5 = 545073787;
                        i21 = iM2762 ^ i5;
                        i20 = i4;
                        z2 = z2;
                        str9 = str9;
                        zM33142 = zM33142;
                    }
                    break;
                case -2001510596:
                case -705064758:
                    C3077.m10039(iM31612);
                    C0862.m3505(c17772);
                    break;
                case -1980363307:
                case -512453214:
                    C2966.m9668(C0619.m2761(C1343.m4939(f27186, 334, 3, i22)) ^ 2123883401);
                    C2287.m7751(c17772);
                    break;
                case -1961830602:
                case -1798519669:
                    String str13 = str12;
                    zM33142 = zM33142;
                    boolean z4 = z3;
                    String str14 = str9;
                    String str15 = str7;
                    String str16 = strM4228;
                    boolean z5 = z2;
                    c17771 = this.f27189;
                    String strM4058 = C1080.m4058(c17771.m41599());
                    C17771 c17773 = this.f27193;
                    String strM6952 = C2023.m6952(c17773.m41599());
                    boolean zM9480 = C2878.m9480(strM4058);
                    DialogInterfaceC8327 dialogInterfaceC8328 = this.f27195;
                    if (zM9480) {
                        int iM2766 = C0619.m2761("ܳ᩸") ^ i18;
                        i20 = ((iM2766 ^ i19) * 13361) ^ (-1517763612);
                        strM4228 = str16;
                        z3 = z4;
                        c17772 = c17773;
                        str10 = strM6952;
                        dialogInterfaceC8327 = dialogInterfaceC8328;
                        str7 = str15;
                        z2 = z5;
                        str12 = str13;
                        str9 = str14;
                        str8 = strM4058;
                        i21 = iM2766 ^ 1794454088;
                    } else {
                        int iM31613 = (i19 - C0773.m3169("ۡۘ")) * 21;
                        i = ((iM31613 ^ i18) * 25565) ^ (-1099229668);
                        strM4228 = str16;
                        z3 = z4;
                        c17772 = c17773;
                        str10 = strM6952;
                        dialogInterfaceC8327 = dialogInterfaceC8328;
                        str7 = str15;
                        z2 = z5;
                        str12 = str13;
                        str9 = str14;
                        str8 = strM4058;
                        i21 = iM31613 ^ (-481984761);
                        i20 = i;
                    }
                    zM33142 = zM33142;
                    break;
                case -1878151245:
                case -169975076:
                    C17202.m40373(C1343.m4946(AbstractC3624.m11765(C0773.m3169(C3448.m11252(f27186, 207, 3, i22)) ^ 2103068585), str9));
                    C2287.m7751(c17771);
                    break;
                case -1853051446:
                case 629354208:
                    if (C11730.m29461(strM9932)) {
                        iM2765 = C0619.m2761("֫ܿ") ^ i18;
                        i13 = ((iM2765 ^ i19) * 1913) ^ (-78094547);
                        i14 = -1044438893;
                    } else {
                        iM2765 = C0619.m2761("۠ۚ") ^ i18;
                        i13 = ((iM2765 ^ i19) * 451) ^ 129625547;
                        i14 = 1206685987;
                    }
                    i21 = iM2765 ^ i14;
                    i20 = i13;
                    break;
                case -1848807451:
                case 893903520:
                    str12 = str12;
                    c17772 = c17772;
                    zM33142 = zM33142;
                    str9 = str9;
                    strM4228 = strM4228;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    if (zM33143) {
                        iM3169 = (i18 - C0773.m3169("ᩴܽ")) * (-103);
                        i8 = ((iM3169 ^ i19) * 18981) ^ (-1728891897);
                        i9 = 340370819;
                    } else {
                        iM3169 = C0773.m3169("ۜۡ") ^ i18;
                        i8 = ((iM3169 ^ i19) * 27533) ^ 734631536;
                        i9 = -1613226529;
                    }
                    int i24 = iM3169 ^ i9;
                    strM4228 = strM4228;
                    zM33142 = zM33142;
                    str12 = str12;
                    str10 = str10;
                    i21 = i24;
                    i20 = i8;
                    str7 = str7;
                    c17772 = c17772;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case -1785325075:
                case -518485357:
                    str12 = str12;
                    c17772 = c17772;
                    zM33142 = zM33142;
                    str9 = str9;
                    strM4228 = strM4228;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    if (!zM33141) {
                        strM4228 = str10;
                        int iM31614 = C0773.m3169("ܶۙ") ^ i18;
                        c17772 = c17772;
                        zM33142 = zM33142;
                        str10 = str10;
                        str7 = str7;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                        String str17 = str12;
                        i21 = iM31614 ^ (-1180327890);
                        i20 = ((iM31614 ^ i19) * 32529) ^ 1165010988;
                        str12 = str17;
                    } else {
                        iM3169 = (C0619.m2761("᩶ۖ") ^ i19) * 67;
                        i8 = ((iM3169 ^ i18) * (-17631)) ^ 1708406881;
                        i9 = 1711801419;
                        int i25 = iM3169 ^ i9;
                        strM4228 = strM4228;
                        zM33142 = zM33142;
                        str12 = str12;
                        str10 = str10;
                        i21 = i25;
                        i20 = i8;
                        str7 = str7;
                        c17772 = c17772;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                    }
                    break;
                case -1758509751:
                case -457983907:
                    str12 = str12;
                    c17772 = c17772;
                    zM33142 = zM33142;
                    z3 = z3;
                    str9 = str9;
                    strM4228 = strM4228;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    short s = f27186[166];
                    int i26 = s + 14411;
                    if ((s * 57644) - (i26 * i26) > 0) {
                        iM2763 = C0773.m3169("ۖܶ") ^ i18;
                        i6 = ((iM2763 ^ i19) * (-15369)) ^ (-1155849963);
                        i7 = -1902391173;
                    } else {
                        iM2763 = (i19 - C0619.m2761("᩺᩸")) * (-5);
                        i6 = ((iM2763 ^ i18) * (-19317)) ^ 887817611;
                        i7 = 1581759591;
                    }
                    int i27 = iM2763 ^ i7;
                    strM4228 = strM4228;
                    z3 = z3;
                    zM33142 = zM33142;
                    str12 = str12;
                    c17772 = c17772;
                    i21 = i27;
                    i20 = i6;
                    str10 = str10;
                    str7 = str7;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case -1668800031:
                case 1091340182:
                    c17772 = c17772;
                    zM33142 = zM33142;
                    str9 = str9;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    if (!C0487.m2359(str8, str12)) {
                        strM9931 = str8;
                        iM2761 = C0619.m2761("ۜܶ") ^ i18;
                        i2 = ((iM2761 ^ i19) * (-7611)) ^ (-1881020700);
                        i3 = 228828939;
                        i21 = iM2761 ^ i3;
                        i20 = i2;
                        str7 = str7;
                        c17772 = c17772;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                        zM33142 = zM33142;
                    } else {
                        strM6366 = str12;
                        str10 = str10;
                        str9 = str9;
                        str = strM4228;
                        iM31610 = (C0773.m3169("۟ۨ") + i18) * (-25);
                        i6 = ((iM31610 ^ i19) * (-6193)) ^ (-1515551714);
                        i10 = 233419846;
                        i21 = iM31610 ^ i10;
                        c17772 = c17772;
                        strM4228 = str;
                        zM33142 = zM33142;
                        str12 = strM6366;
                        i20 = i6;
                        str10 = str10;
                        str7 = str7;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                    }
                    break;
                case -1667368860:
                case 1648689804:
                    if (!C11730.m29457(RunnableC3055.m9931(str10, i23))) {
                        c17772 = c17772;
                        zM33142 = zM33142;
                        str9 = str9;
                        z2 = z2;
                        str8 = str8;
                        str7 = str7;
                        iM2761 = (C0773.m3169("ܰܿ") + i18) * (-89);
                        i2 = ((iM2761 ^ i19) * 12669) ^ (-1514999143);
                        i3 = 1973326928;
                        i21 = iM2761 ^ i3;
                        i20 = i2;
                        str7 = str7;
                        c17772 = c17772;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                        zM33142 = zM33142;
                    } else {
                        int iM31615 = (i19 - C0773.m3169("ۖ᩵")) * 95;
                        zM33142 = zM33142;
                        i = ((iM31615 ^ i18) * (-26235)) ^ 1337889572;
                        i21 = iM31615 ^ 743943369;
                        i20 = i;
                        zM33142 = zM33142;
                    }
                    break;
                case -1614959919:
                case -45097711:
                    C2966.m9668(C0619.m2761(C3690.m11996(f27186, Primes.SMALL_FACTOR_LIMIT, 3, i22)) ^ 2129700223);
                    C2287.m7751(c17771);
                    break;
                case -1609254183:
                case -1063927007:
                    C3734.m12142(C1783.m6243(exc));
                    C2287.m7751(c17772);
                    break;
                case -1596116048:
                case -1097916540:
                    str12 = str12;
                    c17772 = c17772;
                    zM33142 = zM33142;
                    str9 = str9;
                    strM4228 = strM4228;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    c4247 = null;
                    if (selectedItemPosition != 2) {
                        iM3169 = C0773.m3169("۟ܰ") ^ i18;
                        i8 = ((iM3169 ^ i19) * 20125) ^ 2022281524;
                        i9 = 1738759425;
                    } else {
                        iM3169 = (i19 - C0773.m3169("᩶ۡ")) * (-77);
                        i8 = ((iM3169 ^ i18) * 19613) ^ 1671269428;
                        i9 = 1786068347;
                    }
                    int i28 = iM3169 ^ i9;
                    strM4228 = strM4228;
                    zM33142 = zM33142;
                    str12 = str12;
                    str10 = str10;
                    i21 = i28;
                    i20 = i8;
                    str7 = str7;
                    c17772 = c17772;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case -1594345922:
                case 960502049:
                    str12 = str12;
                    c17772 = c17772;
                    zM33142 = zM33142;
                    str9 = str9;
                    strM4228 = strM4228;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    iM31612 = C0773.m3169(C23916.m53420(f27186, 173, 3, i22)) ^ 2102739149;
                    iM3169 = (i18 - C0619.m2761("ۧۛ")) * (-67);
                    i8 = ((iM3169 ^ i19) * (-3935)) ^ (-740258911);
                    i9 = 240803893;
                    int i29 = iM3169 ^ i9;
                    strM4228 = strM4228;
                    zM33142 = zM33142;
                    str12 = str12;
                    str10 = str10;
                    i21 = i29;
                    i20 = i8;
                    str7 = str7;
                    c17772 = c17772;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case -1551545606:
                case 2041148427:
                    str12 = str12;
                    c17772 = c17772;
                    z3 = z3;
                    str8 = str8;
                    str9 = str9;
                    str7 = str7;
                    strM4228 = strM4228;
                    str10 = str10;
                    zM33143 = C13473.m33141(this.f27187);
                    zM33141 = C13473.m33141(this.f27188);
                    zM8360 = C2485.m8360(this.f27197);
                    zM33142 = C13473.m33141(this.f27191);
                    boolean zM33144 = C13473.m33141(this.f27198);
                    if (selectedItemPosition != 0) {
                        int iM2767 = C0619.m2761("֫ۜ") ^ i19;
                        z = zM33144;
                        i20 = ((iM2767 ^ i18) * (-3189)) ^ 1298869403;
                        strM4228 = strM4228;
                        str12 = str12;
                        str9 = str9;
                        i21 = iM2767 ^ 213146830;
                    } else {
                        z = zM33144;
                        int iM2768 = C0619.m2761("ۨۜ") ^ i19;
                        strM4228 = strM4228;
                        str12 = str12;
                        str9 = str9;
                        i21 = iM2768 ^ (-77815064);
                        i20 = ((iM2768 ^ i18) * 27781) ^ 2044646913;
                    }
                    str10 = str10;
                    str7 = str7;
                    str8 = str8;
                    z2 = z;
                    z3 = z3;
                    c17772 = c17772;
                    break;
                case -1422154838:
                case 1052785354:
                    c17772 = c17772;
                    zM33142 = zM33142;
                    str9 = str9;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    if (C11730.m29461(strM9931)) {
                        iM2761 = (C0619.m2761("ۙ۫") ^ i18) * (-35);
                        i2 = ((iM2761 ^ i19) * 32573) ^ (-526210025);
                        i3 = 1338573468;
                    } else {
                        iM2761 = C0773.m3169("ۖۨ") ^ i19;
                        i2 = ((iM2761 ^ i18) * (-973)) ^ 1611216052;
                        i3 = -1155608810;
                    }
                    i21 = iM2761 ^ i3;
                    i20 = i2;
                    str7 = str7;
                    c17772 = c17772;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    zM33142 = zM33142;
                    break;
                case -1414154436:
                case -1053073845:
                    str12 = str12;
                    c17772 = c17772;
                    zM33142 = zM33142;
                    str9 = str9;
                    strM4228 = strM4228;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    if (selectedItemPosition != 3) {
                        iM3169 = C0773.m3169("֨ܿ") ^ i19;
                        i8 = ((iM3169 ^ i18) * (-23605)) ^ 1247815315;
                        i9 = 357959194;
                    } else {
                        iM3169 = (i19 - C0773.m3169("۟۟")) * 33;
                        i8 = ((iM3169 ^ i18) * 12525) ^ 2058268250;
                        i9 = 1155110734;
                    }
                    int i210 = iM3169 ^ i9;
                    strM4228 = strM4228;
                    zM33142 = zM33142;
                    str12 = str12;
                    str10 = str10;
                    i21 = i210;
                    i20 = i8;
                    str7 = str7;
                    c17772 = c17772;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case -1386630405:
                case 1730627868:
                    iM4846 = C11730.m29456(strM9932);
                    iM4845 = iM29456;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    i16 = iM4846;
                    i15 = iM4845;
                    str6 = str10;
                    c4245 = c4247;
                    iM2761 = (C0619.m2761("᩹ۗ") + i18) * (-9);
                    i2 = ((iM2761 ^ i19) * 24123) ^ 998470963;
                    i3 = 1402171641;
                    i21 = iM2761 ^ i3;
                    i20 = i2;
                    str7 = str7;
                    c17772 = c17772;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    zM33142 = zM33142;
                    break;
                case -1271079101:
                case 1367453266:
                    iM4846 = C11730.m29451(RunnableC3055.m9931(str10, i23));
                    iM4845 = iM29451;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    i16 = iM4846;
                    i15 = iM4845;
                    str6 = str10;
                    c4245 = c4247;
                    iM2761 = (C0619.m2761("᩹ۗ") + i18) * (-9);
                    i2 = ((iM2761 ^ i19) * 24123) ^ 998470963;
                    i3 = 1402171641;
                    i21 = iM2761 ^ i3;
                    i20 = i2;
                    str7 = str7;
                    c17772 = c17772;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    zM33142 = zM33142;
                    break;
                case -1223358598:
                case -736798909:
                    c17772 = c17772;
                    zM33142 = zM33142;
                    str9 = str9;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    strM9931 = RunnableC3055.m9931(str8, 2);
                    iM2761 = C0619.m2761("ۜܶ") ^ i18;
                    i2 = ((iM2761 ^ i19) * (-7611)) ^ (-1881020700);
                    i3 = 228828939;
                    i21 = iM2761 ^ i3;
                    i20 = i2;
                    str7 = str7;
                    c17772 = c17772;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    zM33142 = zM33142;
                    break;
                case -1103115424:
                case -6939550:
                    zM33142 = zM33142;
                    str9 = str9;
                    z2 = z2;
                    c17772 = c17772;
                    str8 = str8;
                    str6 = str5;
                    c4245 = c4246;
                    str7 = str7;
                    i15 = 0;
                    i16 = 0;
                    iM2761 = (C0619.m2761("᩹ۗ") + i18) * (-9);
                    i2 = ((iM2761 ^ i19) * 24123) ^ 998470963;
                    i3 = 1402171641;
                    i21 = iM2761 ^ i3;
                    i20 = i2;
                    str7 = str7;
                    c17772 = c17772;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    zM33142 = zM33142;
                    break;
                case -907104092:
                case 672617802:
                    str12 = str12;
                    c17772 = c17772;
                    zM33142 = zM33142;
                    z3 = z3;
                    str9 = str9;
                    strM4228 = strM4228;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    i23 = 1;
                    if (selectedItemPosition == 1) {
                        z = z2;
                        zM33142 = zM33142;
                        int iM2769 = C0619.m2761("ۨۜ") ^ i19;
                        strM4228 = strM4228;
                        str12 = str12;
                        str9 = str9;
                        i21 = iM2769 ^ (-77815064);
                        i20 = ((iM2769 ^ i18) * 27781) ^ 2044646913;
                        str10 = str10;
                        str7 = str7;
                        str8 = str8;
                        z2 = z;
                        z3 = z3;
                        c17772 = c17772;
                    } else {
                        iM2763 = (C0619.m2761("֫᩻") ^ i19) * 43;
                        i6 = ((iM2763 ^ i18) * (-1571)) ^ (-1347634264);
                        i7 = -1711557965;
                        int i211 = iM2763 ^ i7;
                        strM4228 = strM4228;
                        z3 = z3;
                        zM33142 = zM33142;
                        str12 = str12;
                        c17772 = c17772;
                        i21 = i211;
                        i20 = i6;
                        str10 = str10;
                        str7 = str7;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                    }
                    break;
                case -865266538:
                case 1631616169:
                    C11235.m28311(dialogInterfaceC8327);
                    break;
                case -684777052:
                case 1553458698:
                    C3077.m10039(iM31612);
                    C0862.m3505(c17771);
                    break;
                case -536887031:
                case 2058937098:
                    str12 = str12;
                    c17772 = c17772;
                    zM33142 = zM33142;
                    z3 = z3;
                    str9 = str9;
                    strM4228 = strM4228;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    try {
                        c4245Matcher = C3369.m11070(str8, zM33141, zM8360).matcher((CharSequence) "");
                        iM2763 = C0773.m3169("۠ۧ") ^ i19;
                        i6 = ((iM2763 ^ i18) * (-15115)) ^ (-678680829);
                        i7 = -977540735;
                    } catch (Exception e) {
                        exc2 = e;
                        iM2763 = (C0773.m3169("֡ۜ") ^ i18) * 81;
                        i6 = ((iM2763 ^ i19) * (-10823)) ^ 1586025789;
                        i7 = -1859471090;
                    }
                    int i212 = iM2763 ^ i7;
                    strM4228 = strM4228;
                    z3 = z3;
                    zM33142 = zM33142;
                    str12 = str12;
                    c17772 = c17772;
                    i21 = i212;
                    i20 = i6;
                    str10 = str10;
                    str7 = str7;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case -501620271:
                case -441422188:
                    str12 = str12;
                    c17772 = c17772;
                    zM33142 = zM33142;
                    str9 = str9;
                    strM4228 = strM4228;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    selectedItemPosition = this.f27192.getSelectedItemPosition();
                    c8614 = this.f27190;
                    z3 = false;
                    if (selectedItemPosition == 0) {
                        iM3169 = (C0773.m3169("ᩴܳ") + i18) * 39;
                        i8 = ((iM3169 ^ i19) * 23623) ^ (-357955635);
                        i9 = -1950459902;
                    } else {
                        iM3169 = C0773.m3169("᩵ۘ") ^ i19;
                        i8 = ((iM3169 ^ i18) * 23017) ^ (-952621628);
                        i9 = 1560932381;
                    }
                    int i213 = iM3169 ^ i9;
                    strM4228 = strM4228;
                    zM33142 = zM33142;
                    str12 = str12;
                    str10 = str10;
                    i21 = i213;
                    i20 = i8;
                    str7 = str7;
                    c17772 = c17772;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case -361346476:
                case -201495540:
                    str12 = str12;
                    c17772 = c17772;
                    zM33142 = zM33142;
                    z3 = z3;
                    str9 = str9;
                    strM4228 = strM4228;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    if (!C2966.m9673()) {
                        iM2763 = C0619.m2761("ۨ᩺") ^ i18;
                        i6 = ((iM2763 ^ i19) * 21087) ^ (-692087382);
                        i7 = 256679933;
                        int i214 = iM2763 ^ i7;
                        strM4228 = strM4228;
                        z3 = z3;
                        zM33142 = zM33142;
                        str12 = str12;
                        c17772 = c17772;
                        i21 = i214;
                        i20 = i6;
                        str10 = str10;
                        str7 = str7;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                    } else {
                        z3 = z3;
                        iM3169 = C0773.m3169("᩵ۘ") ^ i19;
                        i8 = ((iM3169 ^ i18) * 23017) ^ (-952621628);
                        i9 = 1560932381;
                        int i215 = iM3169 ^ i9;
                        strM4228 = strM4228;
                        zM33142 = zM33142;
                        str12 = str12;
                        str10 = str10;
                        i21 = i215;
                        i20 = i8;
                        str7 = str7;
                        c17772 = c17772;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                    }
                    break;
                case -310162847:
                case 80766933:
                    c17772 = c17772;
                    zM33142 = zM33142;
                    str9 = str9;
                    str = strM4228;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    String strM4056 = C1080.m4056(f27186, PicnicEngine.MAX_AUX_BYTES, 2, i22);
                    boolean zM2359 = C0487.m2359(str8, strM4056);
                    str11 = strM4056;
                    strM6366 = RunnableC1848.m6366(f27186, 178, 2, i22);
                    if (zM2359) {
                        iM31610 = (C0773.m3169("۟ۨ") + i18) * (-25);
                        i6 = ((iM31610 ^ i19) * (-6193)) ^ (-1515551714);
                        i10 = 233419846;
                    } else {
                        iM31610 = (C0619.m2761("ۘۨ") + i19) * 73;
                        i6 = ((iM31610 ^ i18) * (-20449)) ^ (-1590307651);
                        i10 = 870544155;
                    }
                    i21 = iM31610 ^ i10;
                    c17772 = c17772;
                    strM4228 = str;
                    zM33142 = zM33142;
                    str12 = strM6366;
                    i20 = i6;
                    str10 = str10;
                    str7 = str7;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case -267739756:
                case 990266065:
                    c17772 = c17772;
                    zM33142 = zM33142;
                    String str18 = str9;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    try {
                        str12 = str12;
                        try {
                            try {
                                str9 = str18;
                                try {
                                    str10 = str10;
                                    try {
                                        strM4228 = C1146.m4228(RunnableC3646.m11812(C1146.m4228(C1146.m4228(RunnableC3646.m11812(str10, C1146.m4222(f27186, 205, 2, i22), C2702.m8881(f27186, 210, 1, i22)), C23916.m53420(f27186, 331, 2, i22), C3998.m12925(f27186, 333, 1, i22)), C1343.m4939(f27186, 337, 2, i22), C2966.m9670(f27186, 339, 1, i22)), AbstractC0641.m2820(f27186, 340, 2, i22), C2354.m7980(f27186, 342, 1, i22)), C2288.m7761(f27186, 343, 2, i22), C0862.m3500(f27186, 345, 1, i22));
                                        int iM31616 = C0773.m3169("ܶۙ") ^ i18;
                                        c17772 = c17772;
                                        zM33142 = zM33142;
                                        str10 = str10;
                                        str7 = str7;
                                        str8 = str8;
                                        z2 = z2;
                                        str9 = str9;
                                        String str19 = str12;
                                        i21 = iM31616 ^ (-1180327890);
                                        i20 = ((iM31616 ^ i19) * 32529) ^ 1165010988;
                                        str12 = str19;
                                    } catch (Exception e2) {
                                        e = e2;
                                        exc2 = e;
                                        z3 = z3;
                                        strM4228 = strM4228;
                                        iM2763 = (C0773.m3169("֡ۜ") ^ i18) * 81;
                                        i6 = ((iM2763 ^ i19) * (-10823)) ^ 1586025789;
                                        i7 = -1859471090;
                                        int i216 = iM2763 ^ i7;
                                        strM4228 = strM4228;
                                        z3 = z3;
                                        zM33142 = zM33142;
                                        str12 = str12;
                                        c17772 = c17772;
                                        i21 = i216;
                                        i20 = i6;
                                        str10 = str10;
                                        str7 = str7;
                                        str8 = str8;
                                        z2 = z2;
                                        str9 = str9;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    str10 = str10;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                str10 = str10;
                                str9 = str18;
                                exc2 = e;
                                z3 = z3;
                                strM4228 = strM4228;
                                iM2763 = (C0773.m3169("֡ۜ") ^ i18) * 81;
                                i6 = ((iM2763 ^ i19) * (-10823)) ^ 1586025789;
                                i7 = -1859471090;
                                int i217 = iM2763 ^ i7;
                                strM4228 = strM4228;
                                z3 = z3;
                                zM33142 = zM33142;
                                str12 = str12;
                                c17772 = c17772;
                                i21 = i217;
                                i20 = i6;
                                str10 = str10;
                                str7 = str7;
                                str8 = str8;
                                z2 = z2;
                                str9 = str9;
                                break;
                            }
                        } catch (Exception e5) {
                            e = e5;
                        }
                    } catch (Exception e6) {
                        e = e6;
                        str12 = str12;
                    }
                    break;
                case -204592264:
                case 838143896:
                    str12 = str12;
                    c17772 = c17772;
                    zM33142 = zM33142;
                    str9 = str9;
                    strM4228 = strM4228;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    if (selectedItemPosition != 4) {
                        c4246 = c4247;
                        str5 = str10;
                        iM3169 = C0619.m2761("ۧ֨") ^ i18;
                        i8 = ((iM3169 ^ i19) * 25171) ^ 1458238751;
                        i9 = 413650874;
                    } else {
                        iM3169 = (i19 - C0773.m3169("᩶ۡ")) * (-77);
                        i8 = ((iM3169 ^ i18) * 19613) ^ 1671269428;
                        i9 = 1786068347;
                    }
                    int i218 = iM3169 ^ i9;
                    strM4228 = strM4228;
                    zM33142 = zM33142;
                    str12 = str12;
                    str10 = str10;
                    i21 = i218;
                    i20 = i8;
                    str7 = str7;
                    c17772 = c17772;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case -64561509:
                case 347041751:
                    str2 = str12;
                    c17772 = c17772;
                    str3 = str10;
                    zM33142 = zM33142;
                    z2 = z2;
                    str8 = str8;
                    str4 = strM4228;
                    String strM7803 = C2310.m7803(f27186, 180, 1, i22);
                    boolean zM23510 = C0487.m2359(str8, strM7803);
                    str7 = strM7803;
                    strM8350 = C2485.m8350(f27186, 181, 24, i22);
                    if (zM23510) {
                        iM2764 = (C0773.m3169("ۗ֡") + i19) * 59;
                        i11 = ((iM2764 ^ i18) * (-23109)) ^ (-1519550430);
                        i12 = 7130821;
                    } else {
                        iM2764 = C0619.m2761("ۜۢ") ^ i18;
                        i11 = ((iM2764 ^ i19) * (-3089)) ^ (-387290889);
                        i12 = 915778382;
                    }
                    int i30 = iM2764 ^ i12;
                    strM4228 = str4;
                    zM33142 = zM33142;
                    str12 = str2;
                    i21 = i30;
                    c17772 = c17772;
                    boolean z6 = z2;
                    str9 = strM8350;
                    i20 = i11;
                    str10 = str3;
                    str7 = str7;
                    str8 = str8;
                    z2 = z6;
                    break;
                case -56355085:
                case 379219114:
                    i22 = 27894;
                    iM2763 = C0619.m2761("֡֨") ^ i18;
                    i6 = ((iM2763 ^ i19) * (-24645)) ^ 1771600878;
                    i7 = 844410839;
                    int i219 = iM2763 ^ i7;
                    strM4228 = strM4228;
                    z3 = z3;
                    zM33142 = zM33142;
                    str12 = str12;
                    c17772 = c17772;
                    i21 = i219;
                    i20 = i6;
                    str10 = str10;
                    str7 = str7;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case -15149193:
                case 671339552:
                    i22 = 26575;
                    iM2763 = C0619.m2761("֡֨") ^ i18;
                    i6 = ((iM2763 ^ i19) * (-24645)) ^ 1771600878;
                    i7 = 844410839;
                    int i2110 = iM2763 ^ i7;
                    strM4228 = strM4228;
                    z3 = z3;
                    zM33142 = zM33142;
                    str12 = str12;
                    c17772 = c17772;
                    i21 = i2110;
                    i20 = i6;
                    str10 = str10;
                    str7 = str7;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case 81678255:
                case 1474393789:
                    strM9932 = RunnableC3055.m9931(str10, 2);
                    iM2765 = (i19 - C0619.m2761("֨ۨ")) * (-15);
                    i13 = ((iM2765 ^ i18) * (-31837)) ^ 1121485968;
                    i14 = 1274992207;
                    i21 = iM2765 ^ i14;
                    i20 = i13;
                    break;
                case 386744808:
                case 1904474816:
                    c17772 = c17772;
                    zM33142 = zM33142;
                    str9 = str9;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    if (!C11730.m29457(RunnableC3055.m9931(str8, i23))) {
                        str2 = str12;
                        str3 = str10;
                        strM8350 = str9;
                        str4 = strM4228;
                        iM2764 = C0619.m2761("ۜۢ") ^ i18;
                        i11 = ((iM2764 ^ i19) * (-3089)) ^ (-387290889);
                        i12 = 915778382;
                        int i31 = iM2764 ^ i12;
                        strM4228 = str4;
                        zM33142 = zM33142;
                        str12 = str2;
                        i21 = i31;
                        c17772 = c17772;
                        boolean z7 = z2;
                        str9 = strM8350;
                        i20 = i11;
                        str10 = str3;
                        str7 = str7;
                        str8 = str8;
                        z2 = z7;
                    } else {
                        iM2761 = C0619.m2761("ܺܶ") ^ i19;
                        i2 = ((iM2761 ^ i18) * (-3787)) ^ 1066549205;
                        i3 = 1031907584;
                        i21 = iM2761 ^ i3;
                        i20 = i2;
                        str7 = str7;
                        c17772 = c17772;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                        zM33142 = zM33142;
                    }
                    break;
                case 421720361:
                case 1607858950:
                    zM33142 = zM33142;
                    str9 = str9;
                    z2 = z2;
                    str8 = str8;
                    iM29451 = C11730.m29451(RunnableC3055.m9931(str8, i23));
                    c17772 = c17772;
                    String str20 = str7;
                    if (C0487.m2359(str10, str20)) {
                        iM2761 = C0773.m3169("ܺᩴ") ^ i19;
                        str7 = str20;
                        i2 = ((iM2761 ^ i18) * (-13899)) ^ (-1194238260);
                        i3 = 1189496803;
                    } else {
                        str7 = str20;
                        iM2761 = (C0773.m3169("ܰܿ") + i18) * (-89);
                        i2 = ((iM2761 ^ i19) * 12669) ^ (-1514999143);
                        i3 = 1973326928;
                    }
                    i21 = iM2761 ^ i3;
                    i20 = i2;
                    str7 = str7;
                    c17772 = c17772;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    zM33142 = zM33142;
                    break;
                case 524130614:
                case 2000251079:
                    str12 = str12;
                    c17772 = c17772;
                    zM33142 = zM33142;
                    str9 = str9;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    try {
                        strM4228 = strM4228;
                        try {
                            C7974.m21762(c4245Matcher.pattern(), strM4228);
                            str5 = strM4228;
                            c4246 = c4245Matcher;
                            iM3169 = C0619.m2761("ۧ֨") ^ i18;
                            i8 = ((iM3169 ^ i19) * 25171) ^ 1458238751;
                            i9 = 413650874;
                        } catch (Exception e7) {
                            e = e7;
                            exc = e;
                            iM3169 = C0619.m2761("ܶ۟") ^ i19;
                            i8 = ((iM3169 ^ i18) * (-23195)) ^ 1482037819;
                            i9 = -2068323419;
                        }
                    } catch (Exception e8) {
                        e = e8;
                        strM4228 = strM4228;
                    }
                    int i2111 = iM3169 ^ i9;
                    strM4228 = strM4228;
                    zM33142 = zM33142;
                    str12 = str12;
                    str10 = str10;
                    i21 = i2111;
                    i20 = i8;
                    str7 = str7;
                    c17772 = c17772;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case 655568174:
                case 1975298654:
                    C17202.m40373(C1783.m6243(exc2));
                    C0862.m3505(c17771);
                    break;
                case 723012033:
                case 1751985790:
                    c17772 = c17772;
                    zM33142 = zM33142;
                    str9 = str9;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    try {
                        try {
                            iM4845 = C1321.m4845(str8);
                            iM4846 = C1321.m4845(str10);
                            i16 = iM4846;
                            i15 = iM4845;
                            str6 = str10;
                            c4245 = c4247;
                            iM2761 = (C0619.m2761("᩹ۗ") + i18) * (-9);
                            i2 = ((iM2761 ^ i19) * 24123) ^ 998470963;
                            i3 = 1402171641;
                        } catch (NumberFormatException unused) {
                            iM2761 = (C0773.m3169("ᩴܿ") ^ i18) * 11;
                            i2 = ((iM2761 ^ i19) * (-20625)) ^ (-343432227);
                            i3 = -45392166;
                        }
                    } catch (NumberFormatException unused2) {
                        iM2761 = (i19 - C0619.m2761("ۢۘ")) * (-35);
                        i2 = ((iM2761 ^ i18) * 16513) ^ (-20289706);
                        i3 = -1590878839;
                    }
                    i21 = iM2761 ^ i3;
                    i20 = i2;
                    str7 = str7;
                    c17772 = c17772;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    zM33142 = zM33142;
                    break;
                case 1147630427:
                case 1997569478:
                    c17771.m41603();
                    c17772.m41603();
                    C11235.m28308(C17202.m40375(C3734.m12143(C17202.m40375(C17202.m40375(C3734.m12143(C2419.m8173(ApplicationC17729.f58258).mo3486(selectedItemPosition, RunnableC3646.m11809(f27186, IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION, 16, i22)), C0487.m2361(f27186, 233, 22, i22), zM8360), C3033.m9847(f27186, 255, 17, i22), zM33141), C2354.m7980(f27186, 272, 15, i22), zM33143), C1783.m6233(f27186, 287, 19, i22), zM33142), C2023.m6966(f27186, 306, 25, i22), z2));
                    C11235.m28311(dialogInterfaceC8327);
                    Main mainM9939 = RunnableC3055.m9939(c8614);
                    final int i32 = selectedItemPosition;
                    final C4245 c4248 = c4245;
                    final boolean z8 = zM33141;
                    final boolean z9 = z2;
                    final boolean z10 = zM33142;
                    final String str21 = str6;
                    final int i33 = i15;
                    final int i34 = i16;
                    C0938.m3749(new InterfaceC18837(this) { // from class: l.ᩳ֡ۤ

                        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ViewOnClickListenerC8261 f60797;

                        {
                            int i35 = 1249431681;
                            int i36 = C2966.f9654;
                            int i37 = C1783.f6087;
                            int iM31617 = C0773.m3169("ܶ᩶") ^ i37;
                            int i38 = ((iM31617 ^ i36) * 11163) ^ (-206890033);
                            int i39 = -1214245731;
                            while (true) {
                                i35 = ((((i35 ^ i36) * (-28257)) >> 31) & i38) ^ (iM31617 ^ i39);
                                switch (i35) {
                                    case -2138602061:
                                    case -40597653:
                                        this.f60797 = this;
                                        if (C4282.f15546 <= 0) {
                                            iM31617 = C0773.m3169("֨᩺") ^ i37;
                                            i38 = ((iM31617 ^ i36) * 26905) ^ 1497199279;
                                            i39 = -222046755;
                                        } else {
                                            iM31617 = C0619.m2761("۟ۢ") ^ i36;
                                            i38 = ((iM31617 ^ i37) * (-23927)) ^ (-1544575240);
                                            i39 = -1697942636;
                                        }
                                        break;
                                    case -2021841530:
                                    case -256860582:
                                        if (C2310.f7472 >= 0) {
                                            iM31617 = C0619.m2761("֡ۘ") ^ i37;
                                            i38 = ((iM31617 ^ i36) * 6359) ^ (-1932701802);
                                            i39 = -782381145;
                                        } else {
                                            iM31617 = C0619.m2761("ܺ᩸") ^ i36;
                                            i38 = ((iM31617 ^ i37) * (-21927)) ^ 1437573736;
                                            i39 = 114367734;
                                        }
                                        break;
                                    case -1864164019:
                                    case 750016806:
                                        C0269.m1775();
                                        iM31617 = C0619.m2761("֡ۘ") ^ i37;
                                        i38 = ((iM31617 ^ i36) * 6359) ^ (-1932701802);
                                        i39 = -782381145;
                                        break;
                                    case -1826056888:
                                    case 726749046:
                                        if (C3734.m12152() >= 0) {
                                            iM31617 = C0773.m3169("֨᩺") ^ i37;
                                            i38 = ((iM31617 ^ i36) * 26905) ^ 1497199279;
                                            i39 = -222046755;
                                        } else {
                                            iM31617 = (C0619.m2761("ۤۛ") ^ i37) * (-107);
                                            i38 = ((iM31617 ^ i36) * (-24857)) ^ 1888106599;
                                            i39 = 103980201;
                                        }
                                        break;
                                    case -1803991350:
                                    case 131362228:
                                        if (RunnableC1848.m6360()) {
                                            iM31617 = C0773.m3169("֨᩺") ^ i37;
                                            i38 = ((iM31617 ^ i36) * 26905) ^ 1497199279;
                                            i39 = -222046755;
                                        } else {
                                            iM31617 = C0773.m3169("ۧۜ") ^ i37;
                                            i38 = ((iM31617 ^ i36) * 22251) ^ 539607985;
                                            i39 = 25484051;
                                        }
                                        break;
                                    case -1769987725:
                                    case -1194494314:
                                        if (C2702.f8586 <= 0) {
                                            iM31617 = C0773.m3169("᩵ۡ") ^ i37;
                                            i38 = ((iM31617 ^ i36) * (-11845)) ^ (-558012362);
                                            i39 = 1723187401;
                                        } else {
                                            iM31617 = (i37 - C0773.m3169("۠᩻")) * (-99);
                                            i38 = ((iM31617 ^ i36) * 9873) ^ 1138801705;
                                            i39 = 1914706060;
                                        }
                                        break;
                                    case -1687612666:
                                    case -1472733730:
                                        AbstractC0116.m1243();
                                        C2485.m8357();
                                        throw new RuntimeException();
                                    case -1682812339:
                                    case 180101890:
                                        if (C0619.m2763()) {
                                            iM31617 = C0619.m2761("֡ۘ") ^ i37;
                                            i38 = ((iM31617 ^ i36) * 6359) ^ (-1932701802);
                                            i39 = -782381145;
                                        } else {
                                            iM31617 = C0773.m3169("᩻᩺") ^ i36;
                                            i38 = ((iM31617 ^ i37) * (-31075)) ^ 8343518;
                                            i39 = 1839994054;
                                        }
                                        break;
                                    case -1680989365:
                                    case -244166864:
                                        if (C3033.f9831 >= 0) {
                                            iM31617 = C0773.m3169("᩵ۡ") ^ i37;
                                            i38 = ((iM31617 ^ i36) * (-11845)) ^ (-558012362);
                                            i39 = 1723187401;
                                        } else {
                                            iM31617 = C0619.m2761("ۧ۬") ^ i37;
                                            i38 = ((iM31617 ^ i36) * 3663) ^ (-388077611);
                                            i39 = -592145312;
                                        }
                                        break;
                                    case -1596692908:
                                    case -1574930892:
                                        return;
                                    case -1471945996:
                                    case -522844643:
                                        if (C3099.f10023 > 0) {
                                            iM31617 = C0619.m2761("ۛᩳ") ^ i36;
                                            i38 = ((iM31617 ^ i37) * 23393) ^ 1416915654;
                                            i39 = -1314164195;
                                        } else {
                                            iM31617 = C0619.m2761("֡ۘ") ^ i37;
                                            i38 = ((iM31617 ^ i36) * 6359) ^ (-1932701802);
                                            i39 = -782381145;
                                        }
                                        break;
                                    case -1199610970:
                                    case 1010284099:
                                        if (C3998.f13671 != 0) {
                                            iM31617 = C0619.m2761("᩺۫") ^ i36;
                                            i38 = ((iM31617 ^ i37) * 6617) ^ 279033357;
                                            i39 = 895425670;
                                        } else {
                                            iM31617 = (C0619.m2761("۟֡") + i36) * 29;
                                            i38 = ((iM31617 ^ i37) * (-31359)) ^ (-3574983);
                                            i39 = 1603976761;
                                        }
                                        break;
                                    case -1191741959:
                                    case 834844121:
                                        if (!RunnableC1848.f6235) {
                                            iM31617 = C0619.m2761("ۛᩳ") ^ i36;
                                            i38 = ((iM31617 ^ i37) * 23393) ^ 1416915654;
                                            i39 = -1314164195;
                                        } else {
                                            iM31617 = C0773.m3169("᩵ۡ") ^ i37;
                                            i38 = ((iM31617 ^ i36) * (-11845)) ^ (-558012362);
                                            i39 = 1723187401;
                                        }
                                        break;
                                    case 746754611:
                                    case 1155335590:
                                        if (!C2878.f9462) {
                                            iM31617 = C0619.m2761("᩺۫") ^ i36;
                                            i38 = ((iM31617 ^ i37) * 6617) ^ 279033357;
                                            i39 = 895425670;
                                        } else {
                                            iM31617 = C0619.m2761("֡ۘ") ^ i37;
                                            i38 = ((iM31617 ^ i36) * 6359) ^ (-1932701802);
                                            i39 = -782381145;
                                        }
                                        break;
                                    case 1269853744:
                                    case 2001891361:
                                        if (C1080.m4050()) {
                                            iM31617 = (C0773.m3169("᩸᩹") ^ i37) * 53;
                                            i38 = ((iM31617 ^ i36) * (-18279)) ^ (-1191556945);
                                            i39 = 1473720865;
                                        } else {
                                            iM31617 = C0619.m2761("֡ۘ") ^ i37;
                                            i38 = ((iM31617 ^ i36) * 6359) ^ (-1932701802);
                                            i39 = -782381145;
                                        }
                                        break;
                                    default:
                                        if (C0487.f2131 <= 0) {
                                            iM31617 = C0619.m2761("֡ۘ") ^ i37;
                                            i38 = ((iM31617 ^ i36) * 6359) ^ (-1932701802);
                                            i39 = -782381145;
                                        } else {
                                            iM31617 = C0619.m2761("ܶ֡") ^ i36;
                                            i38 = ((iM31617 ^ i37) * 10495) ^ 360617090;
                                            i39 = 1061115612;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // l.InterfaceC18837
                        /* JADX INFO: renamed from: ۙ */
                        public final /* synthetic */ void mo1268() {
                        }

                        @Override // l.InterfaceC18837
                        /* JADX INFO: renamed from: ۙ */
                        public final /* synthetic */ boolean mo1270(Exception exc3) {
                            return false;
                        }

                        /* JADX WARN: Code duplicated, block: B:47:0x015d A[PHI: r20
                          0x015d: PHI (r20v4 int) = (r20v2 int), (r20v1 int), (r20v1 int), (r20v1 int) binds: [B:33:0x00e6, B:16:0x0069, B:9:0x0042, B:6:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:51:0x018d A[PHI: r13 r14 r15 r16 r17 r21
                          0x018d: PHI (r13v4 l.۠֡ۤ) = (r13v3 l.۠֡ۤ), (r13v3 l.۠֡ۤ), (r13v3 l.۠֡ۤ), (r13v5 l.۠֡ۤ) binds: [B:25:0x0090, B:50:0x018b, B:36:0x0107, B:29:0x00c0] A[DONT_GENERATE, DONT_INLINE]
                          0x018d: PHI (r14v2 int) = (r14v1 int), (r14v1 int), (r14v1 int), (r14v3 int) binds: [B:25:0x0090, B:50:0x018b, B:36:0x0107, B:29:0x00c0] A[DONT_GENERATE, DONT_INLINE]
                          0x018d: PHI (r15v3 l.ۘܶۤ) = (r15v2 l.ۘܶۤ), (r15v1 l.ۘܶۤ), (r15v1 l.ۘܶۤ), (r15v1 l.ۘܶۤ) binds: [B:25:0x0090, B:50:0x018b, B:36:0x0107, B:29:0x00c0] A[DONT_GENERATE, DONT_INLINE]
                          0x018d: PHI (r16v4 boolean) = (r16v2 boolean), (r16v1 boolean), (r16v1 boolean), (r16v1 boolean) binds: [B:25:0x0090, B:50:0x018b, B:36:0x0107, B:29:0x00c0] A[DONT_GENERATE, DONT_INLINE]
                          0x018d: PHI (r17v4 boolean) = (r17v2 boolean), (r17v1 boolean), (r17v1 boolean), (r17v1 boolean) binds: [B:25:0x0090, B:50:0x018b, B:36:0x0107, B:29:0x00c0] A[DONT_GENERATE, DONT_INLINE]
                          0x018d: PHI (r21v2 int) = (r21v1 int), (r21v1 int), (r21v1 int), (r21v3 int) binds: [B:25:0x0090, B:50:0x018b, B:36:0x0107, B:29:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:55:0x01bc  */
                        /* JADX WARN: Code duplicated, block: B:59:0x01eb  */
                        @Override // l.InterfaceC18837
                        /* JADX INFO: renamed from: ۙ */
                        public final void mo1269(C9651 c9651, boolean z11) {
                            int iM27610;
                            int i35;
                            int i36 = 673626530;
                            int i37 = C1321.f4751;
                            int i38 = C4238.f15451;
                            int iM31617 = C0773.m3169("᩶ۨ") ^ i38;
                            int i39 = ((iM31617 ^ i37) * 10419) ^ 1035785868;
                            int i40 = iM31617 ^ (-98286812);
                            ViewOnClickListenerC8261 viewOnClickListenerC8261 = null;
                            C4245 c4249 = null;
                            int i41 = 0;
                            boolean z12 = false;
                            boolean z13 = false;
                            int i42 = 0;
                            int i43 = 0;
                            while (true) {
                                i36 = i40 ^ ((((i36 ^ i37) * (-5799)) >> 31) & i39);
                                switch (i36) {
                                    case -2134292209:
                                    case -1378809322:
                                        if (C2834.f9334 <= 0) {
                                            iM27610 = (i38 - C0619.m2761("ۨۘ")) * (-59);
                                            i39 = ((iM27610 ^ i37) * 29897) ^ 1019475119;
                                            i35 = -1304655616;
                                        } else {
                                            iM27610 = (C0619.m2761("۠ܽ") ^ i37) * (-15);
                                            i39 = ((iM27610 ^ i38) * (-32061)) ^ 724398754;
                                            i35 = -2126400184;
                                        }
                                        i40 = iM27610 ^ i35;
                                        break;
                                    case -1828408061:
                                    case -1079774054:
                                        int i44 = i34;
                                        viewOnClickListenerC8261 = this.f60797;
                                        i41 = i32;
                                        if (C11235.m28309() != 0) {
                                            i43 = i44;
                                            iM27610 = C0619.m2761("ۗۛ") ^ i37;
                                            i39 = ((iM27610 ^ i38) * 27957) ^ 2031913027;
                                            i35 = 2040644862;
                                            i40 = iM27610 ^ i35;
                                        } else {
                                            int iM27611 = (i38 - C0619.m2761("ܺܿ")) * 19;
                                            i39 = ((iM27611 ^ i37) * (-6995)) ^ 1052099647;
                                            i40 = iM27611 ^ 1554256119;
                                            i43 = i44;
                                        }
                                        break;
                                    case -1708792268:
                                    case 986819703:
                                        C1080.m4050();
                                        iM27610 = (C0773.m3169("ۗᩳ") ^ i38) * 9;
                                        i39 = ((iM27610 ^ i37) * 8009) ^ 1494797537;
                                        i35 = 943074050;
                                        i40 = iM27610 ^ i35;
                                        break;
                                    case -1345499859:
                                    case -767983256:
                                        if (C4282.m13644()) {
                                            iM27610 = (C0773.m3169("۠۬") ^ i37) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i39 = ((iM27610 ^ i38) * 22365) ^ 836506749;
                                            i35 = -1113326706;
                                        } else {
                                            iM27610 = C0619.m2761("ۗۛ") ^ i37;
                                            i39 = ((iM27610 ^ i38) * 27957) ^ 2031913027;
                                            i35 = 2040644862;
                                        }
                                        i40 = iM27610 ^ i35;
                                        break;
                                    case -1325233119:
                                    case -1135188594:
                                        if (C3077.m10041()) {
                                            iM27610 = (C0773.m3169("ۗᩳ") ^ i38) * 9;
                                            i39 = ((iM27610 ^ i37) * 8009) ^ 1494797537;
                                            i35 = 943074050;
                                        } else {
                                            iM27610 = C0619.m2761("ܿۨ") ^ i38;
                                            i39 = ((iM27610 ^ i37) * 4827) ^ (-1593771455);
                                            i35 = -1969938932;
                                        }
                                        i40 = iM27610 ^ i35;
                                        break;
                                    case -1240816693:
                                    case 1668640822:
                                        int i45 = i33;
                                        if (C1564.f5401 <= 0) {
                                            i42 = i45;
                                            iM27610 = C0773.m3169("۟ۙ") ^ i37;
                                            i39 = ((iM27610 ^ i38) * 5097) ^ (-1665909109);
                                            i35 = 1019077269;
                                            i40 = iM27610 ^ i35;
                                        } else {
                                            int iM31618 = C0773.m3169("ᩴۡ") ^ i38;
                                            i39 = ((iM31618 ^ i37) * 23553) ^ 45497638;
                                            i40 = iM31618 ^ 632337095;
                                            i42 = i45;
                                        }
                                        break;
                                    case -1213421367:
                                    case 1294289514:
                                        if (C1080.m4050()) {
                                            iM27610 = C0773.m3169("۟ۙ") ^ i37;
                                            i39 = ((iM27610 ^ i38) * 5097) ^ (-1665909109);
                                            i35 = 1019077269;
                                        } else {
                                            iM27610 = (C0773.m3169("ۗᩳ") ^ i38) * 9;
                                            i39 = ((iM27610 ^ i37) * 8009) ^ 1494797537;
                                            i35 = 943074050;
                                        }
                                        i40 = iM27610 ^ i35;
                                        break;
                                    case -1150795740:
                                    case 1372281821:
                                        if (RunnableC3646.m11813() != 0) {
                                            iM27610 = (C0773.m3169("ۗᩳ") ^ i38) * 9;
                                            i39 = ((iM27610 ^ i37) * 8009) ^ 1494797537;
                                            i35 = 943074050;
                                        } else {
                                            iM27610 = (C0773.m3169("᩷᩹") + i37) * 123;
                                            i39 = ((iM27610 ^ i38) * 19591) ^ (-1155659511);
                                            i35 = 1076825285;
                                        }
                                        i40 = iM27610 ^ i35;
                                        break;
                                    case -1149151564:
                                    case 1008911532:
                                        if (C2310.m7813() <= 0) {
                                            iM27610 = C0619.m2761("ۗۛ") ^ i37;
                                            i39 = ((iM27610 ^ i38) * 27957) ^ 2031913027;
                                            i35 = 2040644862;
                                        } else {
                                            iM27610 = (i37 - C0773.m3169("֡ۡ")) * (-111);
                                            i39 = ((iM27610 ^ i38) * (-14665)) ^ 1588094195;
                                            i35 = -1485779331;
                                        }
                                        i40 = iM27610 ^ i35;
                                        break;
                                    case -923293656:
                                    case 1413498623:
                                        C2023.m6964();
                                        break;
                                    case -758549876:
                                    case -549863071:
                                        if (C23916.f77426 > 0) {
                                            iM27610 = C0773.m3169("۟ۙ") ^ i37;
                                            i39 = ((iM27610 ^ i38) * 5097) ^ (-1665909109);
                                            i35 = 1019077269;
                                        } else {
                                            iM27610 = (i38 - C0619.m2761("ۨۘ")) * (-59);
                                            i39 = ((iM27610 ^ i37) * 29897) ^ 1019475119;
                                            i35 = -1304655616;
                                        }
                                        i40 = iM27610 ^ i35;
                                        break;
                                    case -752070885:
                                    case 529525039:
                                        c4249 = c4248;
                                        boolean z14 = z8;
                                        boolean z15 = z9;
                                        if (C3099.f10023 <= 0) {
                                            z12 = z14;
                                            z13 = z15;
                                            iM27610 = C0619.m2761("ۗۛ") ^ i37;
                                            i39 = ((iM27610 ^ i38) * 27957) ^ 2031913027;
                                            i35 = 2040644862;
                                            i40 = iM27610 ^ i35;
                                        } else {
                                            int iM27612 = (i37 - C0619.m2761("ᩴ᩶")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i39 = ((iM27612 ^ i38) * 32245) ^ 1540938276;
                                            i40 = iM27612 ^ 1648217193;
                                            z12 = z14;
                                            z13 = z15;
                                        }
                                        break;
                                    case -453997132:
                                    case 1080462756:
                                        ViewOnClickListenerC8261.m22272(viewOnClickListenerC8261, i41, c4249, z12, z13, z10, str21, i42, i43, c9651, z11);
                                        break;
                                    case -264237935:
                                    case 1684198760:
                                        if (C0487.f2131 <= 0) {
                                            iM27610 = (i38 - C0619.m2761("ۨۘ")) * (-59);
                                            i39 = ((iM27610 ^ i37) * 29897) ^ 1019475119;
                                            i35 = -1304655616;
                                        } else {
                                            iM27610 = C0773.m3169("᩷ۖ") ^ i38;
                                            i39 = ((iM27610 ^ i37) * 28135) ^ (-855681506);
                                            i35 = 1686996862;
                                        }
                                        i40 = iM27610 ^ i35;
                                        break;
                                    case 545156499:
                                    case 1284523327:
                                        if (C0619.f2439) {
                                            iM27610 = (C0773.m3169("ۗᩳ") ^ i38) * 9;
                                            i39 = ((iM27610 ^ i37) * 8009) ^ 1494797537;
                                            i35 = 943074050;
                                        } else {
                                            iM27610 = (C0619.m2761("ۤۚ") ^ i37) * (-53);
                                            i39 = ((iM27610 ^ i38) * (-24607)) ^ 486502239;
                                            i35 = -421164249;
                                        }
                                        i40 = iM27610 ^ i35;
                                        break;
                                    default:
                                        if (C0487.f2131 <= 0) {
                                            iM27610 = C0773.m3169("۟ۙ") ^ i37;
                                            i39 = ((iM27610 ^ i38) * 5097) ^ (-1665909109);
                                            i35 = 1019077269;
                                        } else {
                                            iM27610 = C0773.m3169("ۘ᩹") ^ i38;
                                            i39 = ((iM27610 ^ i37) * 12989) ^ 240928382;
                                            i35 = 914266759;
                                        }
                                        i40 = iM27610 ^ i35;
                                        break;
                                }
                                return;
                            }
                        }
                    }, mainM9939, this.f27194);
                    break;
                case 1308745096:
                case 1628751702:
                    C17202.m40373(C1343.m4946(AbstractC0116.m1244(C0619.m2761(C2354.m7980(f27186, 214, 3, i22)) ^ 2129583085), str9));
                    C0862.m3505(c17772);
                    break;
                case 1953853534:
                case 1996384409:
                    zM33142 = zM33142;
                    str9 = str9;
                    iM29456 = C11730.m29456(strM9931);
                    z2 = z2;
                    String str22 = str11;
                    if (C0487.m2359(str10, str22)) {
                        str11 = str22;
                        iM2762 = C0619.m2761("ۖۗ") ^ i19;
                        i4 = ((iM2762 ^ i18) * (-10035)) ^ (-1483333839);
                        i5 = 545073787;
                    } else {
                        iM2762 = C0619.m2761("ۘۢ") ^ i18;
                        str11 = str22;
                        i4 = ((iM2762 ^ i19) * (-31247)) ^ (-1936866735);
                        i5 = 614001520;
                    }
                    i21 = iM2762 ^ i5;
                    i20 = i4;
                    z2 = z2;
                    str9 = str9;
                    zM33142 = zM33142;
                    break;
                default:
                    RunnableC3055.m9939(c8614).m40396(C0619.m2761(C3998.m12925(f27186, 167, 3, i22)) ^ 2119665759, C0773.m3169(C3998.m12925(f27186, 170, 3, i22)) ^ 2119929443, z3);
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0392 A[PHI: r18
      0x0392: PHI (r18v42 int) = (r18v5 int), (r18v8 int), (r18v45 int) binds: [B:99:0x0390, B:85:0x02f8, B:11:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:108:0x03e1 A[PHI: r7 r8 r18
      0x03e1: PHI (r7v3 android.widget.CheckBox) = (r7v2 android.widget.CheckBox), (r7v4 android.widget.CheckBox) binds: [B:107:0x03df, B:60:0x0207] A[DONT_GENERATE, DONT_INLINE]
      0x03e1: PHI (r8v3 android.widget.CheckBox) = (r8v2 android.widget.CheckBox), (r8v4 android.widget.CheckBox) binds: [B:107:0x03df, B:60:0x0207] A[DONT_GENERATE, DONT_INLINE]
      0x03e1: PHI (r18v19 int) = (r18v3 int), (r18v20 int) binds: [B:107:0x03df, B:60:0x0207] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:112:0x0413 A[PHI: r18
      0x0413: PHI (r18v36 int) = (r18v2 int), (r18v35 int), (r18v37 int) binds: [B:111:0x0411, B:27:0x00b2, B:24:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:116:0x0445 A[PHI: r18
      0x0445: PHI (r18v43 int) = (r18v1 int), (r18v4 int), (r18v7 int), (r18v40 int), (r18v44 int) binds: [B:115:0x0443, B:103:0x03c0, B:89:0x0317, B:17:0x007e, B:10:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x013a A[PHI: r18
      0x013a: PHI (r18v32 int) = (r18v27 int), (r18v33 int) binds: [B:42:0x0123, B:33:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0279 A[PHI: r18
      0x0279: PHI (r18v17 int) = (r18v13 int), (r18v18 int) binds: [B:71:0x0262, B:64:0x0222] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x02dc A[PHI: r3 r4 r18
      0x02dc: PHI (r3v4 int) = (r3v3 int), (r3v2 int) binds: [B:81:0x02c5, B:75:0x0290] A[DONT_GENERATE, DONT_INLINE]
      0x02dc: PHI (r4v4 int) = (r4v3 int), (r4v2 int) binds: [B:81:0x02c5, B:75:0x0290] A[DONT_GENERATE, DONT_INLINE]
      0x02dc: PHI (r18v11 int) = (r18v9 int), (r18v12 int) binds: [B:81:0x02c5, B:75:0x0290] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x0336 A[PHI: r18
      0x0336: PHI (r18v39 int) = (r18v6 int), (r18v34 int), (r18v35 int), (r18v38 int), (r18v40 int) binds: [B:93:0x0334, B:29:0x00b6, B:27:0x00b2, B:20:0x008b, B:17:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x0362 A[PHI: r18
      0x0362: PHI (r18v46 int) = (r18v37 int), (r18v48 int) binds: [B:24:0x00aa, B:6:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        int iM2761;
        int i2;
        int i3;
        int i4 = C1146.f4234;
        int i5 = C3734.f12817;
        int iM2762 = (C0619.m2761("ۗܳ") + i5) * 3;
        int i6 = ((iM2762 ^ i4) * 17395) ^ (-2125796716);
        CheckBox checkBox = null;
        int i7 = iM2762 ^ (-1746891873);
        int i8 = 0;
        int i9 = 0;
        boolean z = false;
        int i10 = 0;
        int i11 = -1563281082;
        CheckBox checkBox2 = null;
        CheckBox checkBox3 = null;
        CheckBox checkBox4 = null;
        CheckBox checkBox5 = null;
        boolean z2 = false;
        while (true) {
            int i12 = i7 ^ (i6 & (((i11 ^ i4) * 20699) >> 31));
            switch (i12) {
                case -1899437636:
                case 1222038086:
                    i12 = i12;
                    C2485.m8358(checkBox, i9);
                    C2485.m8358(checkBox2, i9);
                    C13473.m33140(checkBox3, i10);
                    C2485.m8358(checkBox4, i10);
                    C2485.m8358(checkBox5, i9);
                    iM2761 = C0773.m3169("ۢۚ") ^ i5;
                    i2 = ((iM2761 ^ i4) * 14241) ^ 1928771440;
                    i3 = -1678135760;
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1814512309:
                case -1584156277:
                    i12 = i12;
                    i8 = 1;
                    i9 = 0;
                    if (i != 0) {
                        iM2761 = C0619.m2761("ۨۧ") ^ i4;
                        i2 = ((iM2761 ^ i5) * (-5521)) ^ 473090503;
                        i3 = -142705333;
                    } else {
                        iM2761 = (i5 - C0619.m2761("ۧۧ")) * (-19);
                        i2 = ((iM2761 ^ i4) * (-12007)) ^ 1110634935;
                        i3 = -946466814;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1651681333:
                case 1512718618:
                    i12 = i12;
                    C13473.m33140(checkBox, i9);
                    C13473.m33140(checkBox2, i9);
                    C13473.m33140(checkBox4, i9);
                    C13473.m33140(checkBox3, i10);
                    C13473.m33140(checkBox5, i10);
                    iM2761 = C0773.m3169("ۢۚ") ^ i5;
                    i2 = ((iM2761 ^ i4) * 14241) ^ 1928771440;
                    i3 = -1678135760;
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1645064474:
                case 836871152:
                    i12 = i12;
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0619.m2761("ۧ᩵") ^ i5;
                        i2 = ((iM2761 ^ i4) * UMErrorCode.E_UM_BE_CREATE_FAILED) ^ 29600050;
                        i3 = 2121420255;
                    } else {
                        iM2761 = C0773.m3169("ܽᩴ") ^ i4;
                        i2 = ((iM2761 ^ i5) * 23405) ^ 1425915708;
                        i3 = 300553566;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1641027476:
                case -199519480:
                    i12 = i12;
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = (C0773.m3169("ۢ᩵") + i4) * (-23);
                        i2 = ((iM2761 ^ i5) * (-24093)) ^ 525559405;
                        i3 = 748886848;
                    } else {
                        iM2761 = (C0773.m3169("ۖ֫") + i5) * (-85);
                        i2 = ((iM2761 ^ i4) * 1787) ^ (-319737128);
                        i3 = -1207399155;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1605102426:
                case 999459024:
                    i12 = i12;
                    if (C3998.m12920()) {
                        iM2761 = C0773.m3169("᩸۟") ^ i4;
                        i2 = ((iM2761 ^ i5) * 507) ^ (-1236160094);
                        i3 = 763898755;
                    } else {
                        iM2761 = (C0773.m3169("ܶܽ") + i4) * (-41);
                        i2 = ((iM2761 ^ i5) * (-10521)) ^ (-290085160);
                        i3 = -1875297211;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1583437890:
                case -762084467:
                    z2 = true;
                    iM2761 = C0619.m2761("ܰ᩷") ^ i4;
                    i2 = ((iM2761 ^ i5) * 13971) ^ (-1203401164);
                    i3 = 1093999408;
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1570340824:
                case 743688074:
                    i12 = i12;
                    AbstractC0116.m1243();
                    if (C0862.m3503()) {
                        iM2761 = (C0773.m3169("᩸ۖ") ^ i5) * 45;
                        i2 = ((iM2761 ^ i4) * (-20013)) ^ (-239381821);
                        i3 = 645931718;
                    } else {
                        iM2761 = (C0619.m2761("᩸ᩴ") ^ i5) * 87;
                        i2 = ((iM2761 ^ i4) * (-4261)) ^ (-157637863);
                        i3 = -910918283;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1486871577:
                case 1450017794:
                    z = false;
                    iM2761 = C0619.m2761("᩺֫") ^ i5;
                    i2 = ((iM2761 ^ i4) * 29395) ^ (-1553453029);
                    i3 = -899288427;
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1427730888:
                case 1601570397:
                    i12 = i12;
                    this.f27189.m41597(z);
                    if (i != 0) {
                        iM2761 = C0773.m3169("ۤۨ") ^ i5;
                        i2 = ((iM2761 ^ i4) * 305) ^ 1369888355;
                        i3 = -2030285327;
                    } else {
                        iM2761 = C0619.m2761("᩺ۜ") ^ i5;
                        i2 = ((iM2761 ^ i4) * 14461) ^ (-376559866);
                        i3 = 881676965;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1348207440:
                case -1171594797:
                    i12 = i12;
                    if (C2288.f7433 > 0) {
                        iM2761 = (C0773.m3169("᩸ۖ") ^ i5) * 45;
                        i2 = ((iM2761 ^ i4) * (-20013)) ^ (-239381821);
                        i3 = 645931718;
                    } else {
                        iM2761 = (C0773.m3169("ܶܽ") + i4) * (-41);
                        i2 = ((iM2761 ^ i5) * (-10521)) ^ (-290085160);
                        i3 = -1875297211;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1170982594:
                case 1381995045:
                    i12 = i12;
                    if (RunnableC3646.f12471) {
                        iM2761 = C0619.m2761("ۧ᩵") ^ i5;
                        i2 = ((iM2761 ^ i4) * UMErrorCode.E_UM_BE_CREATE_FAILED) ^ 29600050;
                        i3 = 2121420255;
                    } else {
                        iM2761 = C0619.m2761("ۗ۠") ^ i4;
                        i2 = ((iM2761 ^ i5) * (-26795)) ^ (-1026690330);
                        i3 = -1043521800;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1108300610:
                case -573746205:
                    i12 = i12;
                    if (i != i8) {
                        iM2761 = C0619.m2761("ۘۘ") ^ i5;
                        i2 = ((iM2761 ^ i4) * 24979) ^ (-2048823287);
                        i3 = -1998944460;
                    } else {
                        iM2761 = (C0773.m3169("ܽܽ") ^ i4) * 83;
                        i2 = ((iM2761 ^ i5) * (-19695)) ^ 1278751189;
                        i3 = -1178612166;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1089303952:
                case -935067655:
                    i12 = i12;
                    if (i != 4) {
                        iM2761 = C0773.m3169("ۢۚ") ^ i5;
                        i2 = ((iM2761 ^ i4) * 14241) ^ 1928771440;
                        i3 = -1678135760;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ۗܿ")) * (-99);
                        i2 = ((iM2761 ^ i5) * 1243) ^ (-933723449);
                        i3 = -381360751;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -1038465995:
                case 782439860:
                    i12 = i12;
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (C0773.m3169("᩸ۖ") ^ i5) * 45;
                        i2 = ((iM2761 ^ i4) * (-20013)) ^ (-239381821);
                        i3 = 645931718;
                    } else {
                        iM2761 = (C0773.m3169("ۢ᩵") + i4) * (-23);
                        i2 = ((iM2761 ^ i5) * (-24093)) ^ 525559405;
                        i3 = 748886848;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -886993206:
                case -460551475:
                    i12 = i12;
                    if (i != 3) {
                        iM2761 = C0773.m3169("ᩳۨ") ^ i4;
                        i2 = ((iM2761 ^ i5) * (-2949)) ^ (-1928081581);
                        i3 = 2017041198;
                    } else {
                        iM2761 = C0773.m3169("᩵᩻") ^ i4;
                        i2 = ((iM2761 ^ i5) * (-17689)) ^ (-940000138);
                        i3 = -1172736888;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -831699469:
                case 2109412984:
                    if (C2419.f7754 < 0) {
                        i12 = i12;
                        iM2761 = C0619.m2761("ۧ᩵") ^ i5;
                        i2 = ((iM2761 ^ i4) * UMErrorCode.E_UM_BE_CREATE_FAILED) ^ 29600050;
                        i3 = 2121420255;
                        i7 = iM2761 ^ i3;
                        i6 = i2;
                        i11 = i12;
                    }
                    i12 = i12;
                    iM2761 = (C0773.m3169("ܶܽ") + i4) * (-41);
                    i2 = ((iM2761 ^ i5) * (-10521)) ^ (-290085160);
                    i3 = -1875297211;
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -801546592:
                case 334258124:
                    i12 = i12;
                    if (i == i8) {
                        iM2761 = C0619.m2761("᩺ۜ") ^ i5;
                        i2 = ((iM2761 ^ i4) * 14461) ^ (-376559866);
                        i3 = 881676965;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ܳۢ")) * (-113);
                        i2 = ((iM2761 ^ i4) * (-179)) ^ (-1407638628);
                        i3 = 2075988908;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -781601444:
                case 161487517:
                    i12 = i12;
                    AbstractC0116.m1243();
                    C2419.m8174();
                    iM2761 = (C0773.m3169("᩸ۖ") ^ i5) * 45;
                    i2 = ((iM2761 ^ i4) * (-20013)) ^ (-239381821);
                    i3 = 645931718;
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -770627999:
                case -345869560:
                    C0487.m2356();
                    if (C2878.f9462) {
                        iM2761 = (C0773.m3169("ۖܶ") + i4) * (-79);
                        i12 = i12;
                        i2 = ((iM2761 ^ i5) * (-9461)) ^ (-1635993878);
                        i3 = 811777873;
                    } else {
                        i12 = i12;
                        iM2761 = (C0773.m3169("ܶܽ") + i4) * (-41);
                        i2 = ((iM2761 ^ i5) * (-10521)) ^ (-290085160);
                        i3 = -1875297211;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -444111483:
                case 302127965:
                    AbstractC0641.m2813();
                    break;
                case -284703838:
                case 1212637018:
                    z2 = false;
                    iM2761 = C0619.m2761("ܰ᩷") ^ i4;
                    i2 = ((iM2761 ^ i5) * 13971) ^ (-1203401164);
                    i3 = 1093999408;
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -246629259:
                case -18206219:
                    i12 = i12;
                    this.f27193.m41597(z2);
                    checkBox5 = this.f27198;
                    checkBox4 = this.f27191;
                    if (RunnableC1848.f6235) {
                        iM2761 = C0773.m3169("ۡ᩸") ^ i4;
                        i2 = ((iM2761 ^ i5) * (-6427)) ^ 1939947063;
                        i3 = 2115302470;
                    } else {
                        iM2761 = C0773.m3169("ܳۨ") ^ i4;
                        i2 = ((iM2761 ^ i5) * (-3873)) ^ (-1985103313);
                        i3 = -65117334;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -137230579:
                case 673290115:
                    i12 = i12;
                    C2485.m8358(checkBox, i10);
                    C2485.m8358(checkBox2, i10);
                    C2485.m8358(checkBox3, i9);
                    C13473.m33140(checkBox4, i10);
                    C2485.m8358(checkBox5, i10);
                    iM2761 = C0773.m3169("ۢۚ") ^ i5;
                    i2 = ((iM2761 ^ i4) * 14241) ^ 1928771440;
                    i3 = -1678135760;
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case -117197339:
                case 499815053:
                    i12 = i12;
                    if (i != 2) {
                        iM2761 = C0619.m2761("ܿᩴ") ^ i5;
                        i2 = ((iM2761 ^ i4) * (-14123)) ^ 1048937409;
                        i3 = 1906098017;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ۗܿ")) * (-99);
                        i2 = ((iM2761 ^ i5) * 1243) ^ (-933723449);
                        i3 = -381360751;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case 4721648:
                case 932909316:
                    i12 = i12;
                    if (C1519.f5300 >= 0) {
                        iM2761 = (C0773.m3169("ܶܽ") + i4) * (-41);
                        i2 = ((iM2761 ^ i5) * (-10521)) ^ (-290085160);
                        i3 = -1875297211;
                    } else {
                        iM2761 = (C0773.m3169("ۚ֨") + i4) * (-41);
                        i2 = ((iM2761 ^ i5) * 25079) ^ 1526557940;
                        i3 = 106511438;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case 40460618:
                case 1453978613:
                    i12 = i12;
                    if (C2702.f8586 <= 0) {
                        iM2761 = (C0773.m3169("᩸ۖ") ^ i5) * 45;
                        i2 = ((iM2761 ^ i4) * (-20013)) ^ (-239381821);
                        i3 = 645931718;
                    } else {
                        iM2761 = C0619.m2761("۬᩸") ^ i5;
                        i2 = ((iM2761 ^ i4) * 31177) ^ (-1255429159);
                        i3 = -1367165083;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case 174285868:
                case 1193911921:
                    i12 = i12;
                    C2485.m8358(checkBox, i10);
                    C2485.m8358(checkBox2, i10);
                    C13473.m33140(checkBox3, i10);
                    C2485.m8358(checkBox4, i10);
                    C13473.m33140(checkBox5, i10);
                    iM2761 = C0773.m3169("ۢۚ") ^ i5;
                    i2 = ((iM2761 ^ i4) * 14241) ^ 1928771440;
                    i3 = -1678135760;
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case 250199217:
                case 1521895586:
                    m22270();
                    break;
                case 440550111:
                case 675749095:
                    z = true;
                    iM2761 = C0619.m2761("᩺֫") ^ i5;
                    i2 = ((iM2761 ^ i4) * 29395) ^ (-1553453029);
                    i3 = -899288427;
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case 685012544:
                case 1896611091:
                    i12 = i12;
                    if (C1321.f4751 >= 0) {
                        iM2761 = (C0773.m3169("ܶܽ") + i4) * (-41);
                        i2 = ((iM2761 ^ i5) * (-10521)) ^ (-290085160);
                        i3 = -1875297211;
                    } else {
                        iM2761 = (C0619.m2761("᩷ܳ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i2 = ((iM2761 ^ i5) * 19749) ^ 926699607;
                        i3 = -65256030;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case 746869556:
                case 1611983366:
                    i12 = i12;
                    if (C3734.f12817 >= 0) {
                        iM2761 = (C0773.m3169("ۢ᩵") + i4) * (-23);
                        i2 = ((iM2761 ^ i5) * (-24093)) ^ 525559405;
                        i3 = 748886848;
                    } else {
                        iM2761 = C0619.m2761("ܽ۬") ^ i5;
                        i2 = ((iM2761 ^ i4) * (-24631)) ^ (-2048726251);
                        i3 = 1460301251;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case 959157015:
                case 1428670023:
                    i12 = i12;
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0773.m3169("ۡ᩸") ^ i4;
                        i2 = ((iM2761 ^ i5) * (-6427)) ^ 1939947063;
                        i3 = 2115302470;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ۛ۟")) * (-25);
                        i2 = ((iM2761 ^ i4) * (-24517)) ^ 1614758975;
                        i3 = 1189752247;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case 985260224:
                case 1281874813:
                    i12 = i12;
                    checkBox3 = this.f27187;
                    checkBox2 = this.f27188;
                    checkBox = this.f27197;
                    i10 = 8;
                    if (i != 0) {
                        iM2761 = C0619.m2761("ۛۗ") ^ i4;
                        i2 = ((iM2761 ^ i5) * 12745) ^ (-418500606);
                        i3 = 1840567997;
                    } else {
                        iM2761 = C0619.m2761("ۢۤ") ^ i5;
                        i2 = ((iM2761 ^ i4) * (-14269)) ^ 102743034;
                        i3 = 144524592;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                case 1191706550:
                case 1999572749:
                    i12 = i12;
                    if (i == i8) {
                        iM2761 = (i5 - C0619.m2761("ۧۧ")) * (-19);
                        i2 = ((iM2761 ^ i4) * (-12007)) ^ 1110634935;
                        i3 = -946466814;
                    } else {
                        iM2761 = C0619.m2761("ۧܳ") ^ i4;
                        i2 = ((iM2761 ^ i5) * (-30779)) ^ (-179179050);
                        i3 = 387555529;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
                default:
                    i12 = i12;
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = C0619.m2761("ܽ۬") ^ i5;
                        i2 = ((iM2761 ^ i4) * (-24631)) ^ (-2048726251);
                        i3 = 1460301251;
                    } else {
                        iM2761 = C0619.m2761("᩷۬") ^ i5;
                        i2 = ((iM2761 ^ i4) * (-11169)) ^ (-641173523);
                        i3 = -1011218919;
                    }
                    i7 = iM2761 ^ i3;
                    i6 = i2;
                    i11 = i12;
                    break;
            }
            return;
        }
    }
}
