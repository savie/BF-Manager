package l;

import android.view.View;
import android.widget.CheckedTextView;
import com.google.android.material.slider.BaseSlider;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۚᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2R7 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC5530 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۤ᩹ۚ, reason: not valid java name and contains not printable characters */
    private static final short[] f18953 = {1782, -21269, -21258, -21254, -21252, -21265, -21267, -21254, -21295, -21265, -21250, -21275, -21295, -21251, -21279, -21252, -21254, -21295, -21268, -21257, -21269, -21258, -21254, -21252, -21265, -21267, -21254, -21295, -21265, -21250, -21275, -21295, -21251, -21279, -21252, -21254, -21295, -21252, -21269, -21256, -21269, -21252, -21251, -21269};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC19356 f18954;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC4514 f18955;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckedTextView f18956;

    /* JADX WARN: Code duplicated, block: B:38:0x0154 A[PHI: r5 r6
      0x0154: PHI (r5v4 l.ܿۧ᩺) = (r5v3 l.ܿۧ᩺), (r5v2 l.ܿۧ᩺), (r5v2 l.ܿۧ᩺) binds: [B:37:0x0152, B:29:0x0101, B:9:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r6v4 boolean) = (r6v3 boolean), (r6v2 boolean), (r6v2 boolean) binds: [B:37:0x0152, B:29:0x0101, B:9:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x01b1 A[PHI: r2 r3 r4 r8
      0x01b1: PHI (r2v4 l.ܿۧ᩺) = (r2v3 l.ܿۧ᩺), (r2v2 l.ܿۧ᩺), (r2v2 l.ܿۧ᩺) binds: [B:45:0x01af, B:21:0x00b3, B:91:0x01b1] A[DONT_GENERATE, DONT_INLINE]
      0x01b1: PHI (r3v4 l.ۙ۠ۘ) = (r3v3 l.ۙ۠ۘ), (r3v2 l.ۙ۠ۘ), (r3v2 l.ۙ۠ۘ) binds: [B:45:0x01af, B:21:0x00b3, B:91:0x01b1] A[DONT_GENERATE, DONT_INLINE]
      0x01b1: PHI (r4v4 int) = (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:45:0x01af, B:21:0x00b3, B:91:0x01b1] A[DONT_GENERATE, DONT_INLINE]
      0x01b1: PHI (r8v4 l.֡ᩴۘ) = (r8v2 l.֡ᩴۘ), (r8v3 l.֡ᩴۘ), (r8v2 l.֡ᩴۘ) binds: [B:45:0x01af, B:21:0x00b3, B:91:0x01b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x026a A[PHI: r10 r11 r12 r13 r14 r17 r18
      0x026a: PHI (r10v4 short[]) = (r10v3 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:41:0x0187, B:33:0x0124, B:62:0x0266] A[DONT_GENERATE, DONT_INLINE]
      0x026a: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:41:0x0187, B:33:0x0124, B:62:0x0266] A[DONT_GENERATE, DONT_INLINE]
      0x026a: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:41:0x0187, B:33:0x0124, B:62:0x0266] A[DONT_GENERATE, DONT_INLINE]
      0x026a: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:41:0x0187, B:33:0x0124, B:62:0x0266] A[DONT_GENERATE, DONT_INLINE]
      0x026a: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:41:0x0187, B:33:0x0124, B:62:0x0266] A[DONT_GENERATE, DONT_INLINE]
      0x026a: PHI (r17v3 short) = (r17v2 short), (r17v2 short), (r17v5 short) binds: [B:41:0x0187, B:33:0x0124, B:62:0x0266] A[DONT_GENERATE, DONT_INLINE]
      0x026a: PHI (r18v3 int) = (r18v2 int), (r18v2 int), (r18v4 int) binds: [B:41:0x0187, B:33:0x0124, B:62:0x0266] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM11306;
        int i;
        int i2;
        short[] sArr;
        int iM45029;
        int i3;
        int i4;
        ViewOnClickListenerC5530 viewOnClickListenerC5530 = this;
        int i5 = -1933578859;
        int i6 = C3577.f13150;
        int i7 = C1419.f5860;
        int iM450210 = C19806.m45029("ۧۧ") ^ i7;
        int i8 = ((iM450210 ^ i6) * (-27391)) ^ 65213875;
        int i9 = iM450210 ^ (-266527617);
        ViewOnClickListenerC4514 viewOnClickListenerC4514 = null;
        InterfaceC17314 interfaceC17314Mo4065 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        InterfaceC17314 interfaceC17314M5517 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        char c = 0;
        short s = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        C0590 c0590 = null;
        C0590 c0591 = null;
        boolean zIsChecked = false;
        while (true) {
            i5 = i9 ^ (i8 & (((i5 ^ i6) * 23931) >> 31));
            switch (i5) {
                case -2141412018:
                case 216326122:
                    interfaceC17314M5517 = CallableC1627.m5517(ApplicationC0716.f2992);
                    viewOnClickListenerC4514 = viewOnClickListenerC5530.f18955;
                    i10 = viewOnClickListenerC4514.f16060;
                    if (C1937.f7317 >= 0) {
                        iM11306 = C19806.m45029("۟ۛ") ^ i7;
                        i = ((iM11306 ^ i6) * 10357) ^ (-1587805803);
                        i2 = 1642949428;
                    } else {
                        iM11306 = (C19806.m45029("۬֫") ^ i7) * (-51);
                        i = ((iM11306 ^ i6) * 4519) ^ (-381689016);
                        i2 = -1741861386;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -2108419650:
                case 379068744:
                    C0216.m1591();
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖۤ") ^ i6;
                        i = ((iM11306 ^ i7) * (-22001)) ^ 396643046;
                        i2 = -1210671843;
                    } else {
                        iM11306 = C19806.m45029("᩻᩵") ^ i6;
                        i = ((iM11306 ^ i7) * (-25345)) ^ (-1440282033);
                        i2 = -54367826;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -1908471487:
                case -388444489:
                    sArr3 = f18953;
                    i12 = 1;
                    i13 = 19;
                    if (C3535.f13026 <= 0) {
                        iM11306 = C19806.m45029("۬ۚ") ^ i7;
                        i = ((iM11306 ^ i6) * 1541) ^ (-1973048939);
                        i2 = 1475659178;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۘۢ") ^ i6;
                        i = ((iM11306 ^ i7) * 11773) ^ (-2130221877);
                        i2 = 2049513988;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -1866481086:
                case -93715315:
                    short s2 = sArr2[c];
                    int i19 = s2 + 480;
                    if (C1460.f5948 < 0) {
                        int iM450211 = C19806.m45029("۫֫") ^ i7;
                        int i20 = ((iM450211 ^ i6) * (-11939)) ^ 789519877;
                        i9 = iM450211 ^ (-1133231663);
                        s = s2;
                        i15 = i19;
                        i8 = i20;
                        viewOnClickListenerC5530 = this;
                    } else {
                        s = s2;
                        i15 = i19;
                        iM11306 = C19806.m45029("۬ۚ") ^ i7;
                        i = ((iM11306 ^ i6) * 1541) ^ (-1973048939);
                        i2 = 1475659178;
                        i9 = iM11306 ^ i2;
                        i8 = i;
                    }
                    break;
                case -1697725158:
                case 1457994755:
                    i11 = 56827;
                    iM11306 = (i6 - C19806.m45029("ۘ۠")) * 65;
                    i = ((iM11306 ^ i7) * (-3777)) ^ (-788827285);
                    i2 = -843407547;
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -1602322943:
                case -521895075:
                    interfaceC17314Mo4065 = interfaceC17314M5517.mo4065(i10, C0216.m1588(sArr3, i12, i13, i11));
                    zIsChecked = viewOnClickListenerC5530.f18956.isChecked();
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                        iM11306 = C19806.m45029("᩻᩵") ^ i6;
                        i = ((iM11306 ^ i7) * (-25345)) ^ (-1440282033);
                        i2 = -54367826;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸۫") ^ i7;
                        i = ((iM11306 ^ i6) * 10287) ^ (-1480808846);
                        i2 = -614758693;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -1499314017:
                case 633194981:
                    sArr = f18953;
                    c = 0;
                    if (C1025.f4800 >= 0) {
                        iM45029 = (C19806.m45029("ᩴۘ") + i6) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM45029 ^ i7) * (-21983)) ^ 538480929;
                        i4 = -1506784446;
                    } else {
                        iM45029 = (C19806.m45029("ᩴۖ") + i6) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM45029 ^ i7) * 31301) ^ (-1458817344);
                        i4 = 992165300;
                    }
                    i9 = iM45029 ^ i4;
                    sArr2 = sArr;
                    i8 = i3;
                    viewOnClickListenerC5530 = this;
                    break;
                case -1381451998:
                case -444699729:
                    C3660.m10783(C10634.m26827(interfaceC17314Mo4065, C1461.m5070(sArr4, i14, 24, i11), zIsChecked));
                    if (C0629.f2722 <= 0) {
                        iM11306 = C19806.m45029("᩻᩵") ^ i6;
                        i = ((iM11306 ^ i7) * (-25345)) ^ (-1440282033);
                        i2 = -54367826;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֡۠") ^ i6) * 17;
                        i = ((iM11306 ^ i7) * 31837) ^ 451552332;
                        i2 = -1078495669;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -1315382681:
                case 2083465023:
                    int i21 = i17 + i18;
                    if (i16 - (i21 + i21) <= 0) {
                        iM11306 = (C19806.m45029("ۘۜ") + i7) * 71;
                        i = ((iM11306 ^ i6) * 6749) ^ 857716839;
                        i2 = 1722127585;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤۘ") ^ i7;
                        i = ((iM11306 ^ i6) * 10963) ^ (-1107232066);
                        i2 = -2092439283;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case -642576179:
                case -385555847:
                    C0526.m2437();
                    break;
                case -489112081:
                case 756745600:
                    C1377.m4833();
                    C1189.m4368();
                    sArr = sArr2;
                    iM45029 = (C19806.m45029("ᩴۘ") + i6) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i3 = ((iM45029 ^ i7) * (-21983)) ^ 538480929;
                    i4 = -1506784446;
                    i9 = iM45029 ^ i4;
                    sArr2 = sArr;
                    i8 = i3;
                    viewOnClickListenerC5530 = this;
                    break;
                case -386732955:
                case 1712088231:
                    C1398.m4895();
                    if (C1377.m4833() == 0) {
                        iM11306 = C19806.m45029("۟ۛ") ^ i7;
                        i = ((iM11306 ^ i6) * 10357) ^ (-1587805803);
                        i2 = 1642949428;
                        i9 = iM11306 ^ i2;
                        i8 = i;
                    } else {
                        sArr = sArr2;
                        iM45029 = (C19806.m45029("ᩴۘ") + i6) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM45029 ^ i7) * (-21983)) ^ 538480929;
                        i4 = -1506784446;
                        i9 = iM45029 ^ i4;
                        sArr2 = sArr;
                        i8 = i3;
                        viewOnClickListenerC5530 = this;
                    }
                    break;
                case -132509305:
                case 1920030165:
                    c0591 = viewOnClickListenerC4514.f16044.f42057;
                    if (C1377.m4833() == 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜ۟") + i7) * 73;
                        i = ((iM11306 ^ i6) * (-7777)) ^ 838512318;
                        i2 = -2078875781;
                        i9 = iM11306 ^ i2;
                        i8 = i;
                    } else {
                        sArr = sArr2;
                        iM45029 = (C19806.m45029("ᩴۘ") + i6) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM45029 ^ i7) * (-21983)) ^ 538480929;
                        i4 = -1506784446;
                        i9 = iM45029 ^ i4;
                        sArr2 = sArr;
                        i8 = i3;
                        viewOnClickListenerC5530 = this;
                    }
                    break;
                case -87114293:
                case 1775539339:
                    i16 = i15 * i15;
                    i17 = s * s;
                    i18 = 230400;
                    if (C3660.f13403 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛ۠") ^ i6) * (-75);
                        i = ((iM11306 ^ i7) * (-23107)) ^ (-1424041124);
                        i2 = 341624649;
                        i9 = iM11306 ^ i2;
                        i8 = i;
                    } else {
                        sArr = sArr2;
                        iM45029 = (C19806.m45029("ᩴۘ") + i6) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM45029 ^ i7) * (-21983)) ^ 538480929;
                        i4 = -1506784446;
                        i9 = iM45029 ^ i4;
                        sArr2 = sArr;
                        i8 = i3;
                        viewOnClickListenerC5530 = this;
                    }
                    break;
                case 177310890:
                case 1861718878:
                    c0591.m2793();
                    c0590 = viewOnClickListenerC4514.f16055.f42057;
                    if (C3743.m10966() <= 0) {
                        iM11306 = C19806.m45029("۟ۛ") ^ i7;
                        i = ((iM11306 ^ i6) * 10357) ^ (-1587805803);
                        i2 = 1642949428;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ܶ") ^ i7;
                        i = ((iM11306 ^ i6) * (-15147)) ^ 645502452;
                        i2 = -1812371336;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case 251180242:
                case 2140185126:
                    sArr4 = f18953;
                    i14 = 20;
                    if (C7105.m18985()) {
                        iM11306 = C19806.m45029("۬ۚ") ^ i7;
                        i = ((iM11306 ^ i6) * 1541) ^ (-1973048939);
                        i2 = 1475659178;
                    } else {
                        iM11306 = (C19806.m45029("ۜᩴ") ^ i6) * 99;
                        i = ((iM11306 ^ i7) * 21681) ^ 967406214;
                        i2 = 955543470;
                    }
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case 261730825:
                case 1497025043:
                    i11 = 44174;
                    iM11306 = (i6 - C19806.m45029("ۘ۠")) * 65;
                    i = ((iM11306 ^ i7) * (-3777)) ^ (-788827285);
                    i2 = -843407547;
                    i9 = iM11306 ^ i2;
                    i8 = i;
                    break;
                case 1180326588:
                case 1420003051:
                    c0590.m2793();
                    C1189.m4367(viewOnClickListenerC5530.f18954);
                    break;
                default:
                    if (C3660.m10791() == 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖۤ") ^ i6;
                        i = ((iM11306 ^ i7) * (-22001)) ^ 396643046;
                        i2 = -1210671843;
                        i9 = iM11306 ^ i2;
                        i8 = i;
                    } else {
                        sArr = sArr2;
                        iM45029 = (C19806.m45029("ᩴۘ") + i6) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM45029 ^ i7) * (-21983)) ^ 538480929;
                        i4 = -1506784446;
                        i9 = iM45029 ^ i4;
                        sArr2 = sArr;
                        i8 = i3;
                        viewOnClickListenerC5530 = this;
                    }
                    break;
            }
            return;
        }
    }

    public ViewOnClickListenerC5530(ViewOnClickListenerC4514 viewOnClickListenerC4514, CheckedTextView checkedTextView, DialogInterfaceC19356 dialogInterfaceC19356) {
        int i = 661553251;
        int i2 = ThreadFactoryC3888.f14547;
        int i3 = C1460.f5948;
        int iM45029 = C19806.m45029("ۜ᩵") ^ i3;
        int i4 = ((iM45029 ^ i2) * (-27005)) ^ 11504476;
        int i5 = 366710635;
        while (true) {
            i = ((((i ^ i2) * 7597) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2094773095:
                case 1984558050:
                    this.f18954 = dialogInterfaceC19356;
                    return;
                case -1826412128:
                case -1735206242:
                    C3743.m10966();
                    if (C2477.f9839 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-8579)) ^ (-2102387067);
                        i5 = -1978963514;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩻ܿ")) * (-83);
                        i4 = ((iM45029 ^ i2) * (-19855)) ^ (-1140498227);
                        i5 = -1482786793;
                    }
                    break;
                case -1467104790:
                case -493355133:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = ThreadFactoryC3888.m11306("ܶ۠") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-28329)) ^ 1956814606;
                        i5 = 379066819;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۟ܽ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 18323) ^ 753253978;
                        i5 = 1999990824;
                    }
                    break;
                case -1440653891:
                case 1489418942:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    iM45029 = C19806.m45029("ۨ֫") ^ i2;
                    i4 = ((iM45029 ^ i3) * 21279) ^ (-299705186);
                    i5 = -1216006684;
                    break;
                case -1364375505:
                case 1019205916:
                    if (C1875.m6086() != 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩻ܿ")) * (-83);
                        i4 = ((iM45029 ^ i2) * (-19855)) ^ (-1140498227);
                        i5 = -1482786793;
                    } else {
                        iM45029 = (C19806.m45029("᩵ᩴ") + i2) * (-3);
                        i4 = ((iM45029 ^ i3) * (-18623)) ^ (-1000432003);
                        i5 = 998089049;
                    }
                    break;
                case -1316492776:
                case -746089054:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۟ܽ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 18323) ^ 753253978;
                        i5 = 1999990824;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-23455)) ^ (-1259540212);
                        i5 = -1839228879;
                    }
                    break;
                case -1045891928:
                case 851408730:
                    if (C1377.m4833() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-8579)) ^ (-2102387067);
                        i5 = -1978963514;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ᩻") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-16843)) ^ (-1742493173);
                        i5 = -1901290422;
                    }
                    break;
                case -984897145:
                case -654857522:
                    if (C3286.f12186) {
                        iM45029 = C19806.m45029("ۨ֫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 21279) ^ (-299705186);
                        i5 = -1216006684;
                    } else {
                        iM45029 = C19806.m45029("۠ۢ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 7637) ^ (-1625411815);
                        i5 = 109159991;
                    }
                    break;
                case -944318642:
                case 101301202:
                    if (C3722.m10894() <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩻ܿ")) * (-83);
                        i4 = ((iM45029 ^ i2) * (-19855)) ^ (-1140498227);
                        i5 = -1482786793;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴᩴ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 12267) ^ 1455431145;
                        i5 = 531141448;
                    }
                    break;
                case -908534965:
                case -657462065:
                    if (C3577.f13150 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩻ܿ")) * (-83);
                        i4 = ((iM45029 ^ i2) * (-19855)) ^ (-1140498227);
                        i5 = -1482786793;
                    } else {
                        iM45029 = C19806.m45029("۬۟") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-23159)) ^ (-48016909);
                        i5 = -404439697;
                    }
                    break;
                case -864171026:
                case 781164433:
                    C3535.m10431();
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩻ܿ")) * (-83);
                        i4 = ((iM45029 ^ i2) * (-19855)) ^ (-1140498227);
                        i5 = -1482786793;
                    } else {
                        iM45029 = C19806.m45029("ۨ֫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 21279) ^ (-299705186);
                        i5 = -1216006684;
                    }
                    break;
                case -597149674:
                case 596315997:
                    C0278.m1789();
                    if (C3743.m10966() <= 0) {
                        iM45029 = C19806.m45029("֨۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-2575)) ^ 321184926;
                        i5 = 678164507;
                    } else {
                        iM45029 = C19806.m45029("ۨ֫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 21279) ^ (-299705186);
                        i5 = -1216006684;
                    }
                    break;
                case -538844142:
                case -504994781:
                    C0797.m3359();
                    C1461.m5080();
                    throw new RuntimeException();
                case -238164540:
                case 1915307801:
                    this.f18955 = viewOnClickListenerC4514;
                    this.f18956 = checkedTextView;
                    if (C3743.f13569) {
                        iM45029 = C19806.m45029("ۤ᩷") ^ i2;
                        i4 = ((iM45029 ^ i3) * 7125) ^ (-207640388);
                        i5 = -1902849831;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-8579)) ^ (-2102387067);
                        i5 = -1978963514;
                    }
                    break;
                case -71477122:
                case 637223793:
                    if (C0216.m1591() <= 0) {
                        iM45029 = C19806.m45029("֨۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-2575)) ^ 321184926;
                        i5 = 678164507;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺᩴ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-4765)) ^ (-1317554262);
                        i5 = 633244516;
                    }
                    break;
                default:
                    if (C3286.f12186) {
                        iM45029 = ThreadFactoryC3888.m11306("۟ܽ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 18323) ^ 753253978;
                        i5 = 1999990824;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ܽܺ")) * 63;
                        i4 = ((iM45029 ^ i3) * (-32607)) ^ 1930516860;
                        i5 = -320290954;
                    }
                    break;
            }
        }
    }
}
