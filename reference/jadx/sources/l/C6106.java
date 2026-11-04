package l;

import android.view.View;
import android.widget.TextView;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Collections;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۛۗ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 82RX */
/* JADX INFO: loaded from: classes3.dex */
public final class C6106 {

    /* JADX INFO: renamed from: ۤ۠ۤ, reason: not valid java name and contains not printable characters */
    private static final short[] f20840 = {7940, -7120, 1142, -11475, -5002, -6464, 2613, 1804, -3601, 798, -10222, -11974, -8708, -1077, -3829, -1279};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View f20841;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ActivityC24268 f20842;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C3072 f20843;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public List f20844;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C5817 f20845;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f20846;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f20847;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C3122 f20848;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public TextView f20849;

    public C6106(ActivityC24268 activityC24268) {
        boolean z;
        int i;
        View view;
        short[] sArr;
        int i2;
        boolean z2;
        int i3;
        int i4;
        short[] sArr2;
        int i5;
        boolean z3;
        View view2;
        int iM2761;
        int i6;
        int i7;
        int iM3169;
        int i8;
        int i9;
        int i10;
        int i11 = C2966.f9654;
        int i12 = AbstractC0116.f1064;
        short s = f20840[0];
        int i13 = ((s * s) + 137264656) - (s * 23432) >= 0 ? 36645 : 22409;
        int iM2762 = (C0619.m2761("֫֡") + i12) * (-127);
        int i14 = ((iM2762 ^ i11) * 28595) ^ (-636401356);
        View viewM9333 = null;
        String strM13650 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i15 = iM2762 ^ 1302421011;
        int iM2763 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = -851693200;
        int i21 = i14;
        C3122 c3122 = null;
        String strM12149 = null;
        boolean z4 = false;
        View view3 = null;
        View viewM11246 = null;
        int i22 = 0;
        C5817 c5817 = null;
        View viewM2812 = null;
        while (true) {
            i20 = i15 ^ ((((i20 ^ i11) * (-549)) >> 31) & i21);
            switch (i20) {
                case -2038170195:
                case -341339139:
                    sArr2 = sArr3;
                    i5 = i18;
                    z3 = z4;
                    view2 = viewM2812;
                    strM12149 = C3734.m12149(f20840, 1, 3, i13);
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0619.m2761("᩵ܺ") ^ i12;
                        i21 = ((iM2761 ^ i11) * 12433) ^ 977870506;
                        i6 = -87803481;
                    } else {
                        iM2761 = C0619.m2761("ܽ֫") ^ i11;
                        i21 = ((iM2761 ^ i12) * 6093) ^ (-1471665990);
                        i6 = -109017886;
                    }
                    i7 = iM2761 ^ i6;
                    z4 = z3;
                    i18 = i5;
                    sArr3 = sArr2;
                    viewM2812 = view2;
                    i15 = i7;
                    break;
                case -1850913650:
                case -130069674:
                    C3099.m10095();
                    if (C1564.f5401 <= 0) {
                        z2 = z4;
                        view = viewM2812;
                        sArr = sArr3;
                        i2 = i18;
                        int iM31610 = (C0773.m3169("۠۫") ^ i12) * (-121);
                        i3 = ((iM31610 ^ i11) * 30271) ^ 177180273;
                        i4 = iM31610 ^ 9100025;
                        z4 = z2;
                        i18 = i2;
                        sArr3 = sArr;
                        i15 = i4;
                        i21 = i3;
                        viewM2812 = view;
                    } else {
                        iM3169 = C0619.m2761("֨ۡ") ^ i11;
                        i21 = ((iM3169 ^ i12) * 27955) ^ 1764624178;
                        i8 = 579614998;
                        i15 = iM3169 ^ i8;
                    }
                    break;
                case -1748923857:
                case 1627851295:
                    c5817.m16965(view3);
                    strM13650 = C4282.m13650(f20840, 10, 3, i13);
                    if (!C17202.m40372()) {
                        view2 = viewM2812;
                        sArr2 = sArr3;
                        i5 = i18;
                        z3 = z4;
                        iM2761 = C0619.m2761("᩵ܺ") ^ i12;
                        i21 = ((iM2761 ^ i11) * 12433) ^ 977870506;
                        i6 = -87803481;
                        i7 = iM2761 ^ i6;
                        z4 = z3;
                        i18 = i5;
                        sArr3 = sArr2;
                        viewM2812 = view2;
                        i15 = i7;
                    } else {
                        iM3169 = C0619.m2761("ۖ᩶") ^ i11;
                        i21 = ((iM3169 ^ i12) * 8913) ^ 52672738;
                        i8 = -1948920784;
                        i15 = iM3169 ^ i8;
                    }
                    break;
                case -1692472238:
                case 1609669832:
                    iM2763 = C0619.m2761(C2834.m9343(sArr5, i17, i22, i13));
                    i16 = 2127342036;
                    if (C3033.f9831 < 0) {
                        iM3169 = C0619.m2761("ܶ۬") ^ i12;
                        i21 = ((iM3169 ^ i11) * (-28439)) ^ (-2080454267);
                        i8 = -764419270;
                        i15 = iM3169 ^ i8;
                    } else {
                        i = i18;
                        z = z4;
                        int iM31611 = (C0773.m3169("ۧܰ") + i11) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        int i23 = i;
                        i9 = ((iM31611 ^ i12) * 11889) ^ 588314344;
                        i10 = iM31611 ^ (-1135457574);
                        z4 = z;
                        i18 = i23;
                        i15 = i10;
                        i21 = i9;
                    }
                    break;
                case -1553886523:
                case 810101780:
                    short[] sArr6 = sArr4;
                    View viewM11247 = C3448.m11246(viewM2812, C0773.m3169(AbstractC0116.m1236(sArr6, 7, 3, i13)) ^ 2097481988);
                    if (C1080.f3865 >= 0) {
                        sArr4 = sArr6;
                        view3 = viewM11247;
                        i = i18;
                        z = z4;
                        int iM31612 = (C0773.m3169("ۧܰ") + i11) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        int i24 = i;
                        i9 = ((iM31612 ^ i12) * 11889) ^ 588314344;
                        i10 = iM31612 ^ (-1135457574);
                        z4 = z;
                        i18 = i24;
                    } else {
                        int iM2764 = C0619.m2761("᩺ܰ") ^ i12;
                        i9 = ((iM2764 ^ i11) * 16315) ^ (-1248736221);
                        i10 = iM2764 ^ 1696255061;
                        sArr4 = sArr6;
                        view3 = viewM11247;
                    }
                    i15 = i10;
                    i21 = i9;
                    break;
                case -1176013823:
                case -886541546:
                    view = viewM2812;
                    sArr = sArr3;
                    i2 = i18;
                    this.f20844 = Collections.EMPTY_LIST;
                    z2 = false;
                    this.f20847 = false;
                    this.f20842 = activityC24268;
                    if (RunnableC1848.f6235) {
                        int iM31613 = (C0773.m3169("۠۫") ^ i12) * (-121);
                        i3 = ((iM31613 ^ i11) * 30271) ^ 177180273;
                        i4 = iM31613 ^ 9100025;
                        z4 = z2;
                        i18 = i2;
                        sArr3 = sArr;
                    } else {
                        int iM2765 = (C0619.m2761("ܿۗ") ^ i12) * 7;
                        i3 = ((iM2765 ^ i11) * (-27003)) ^ 879795403;
                        i4 = iM2765 ^ (-143316831);
                        i18 = i2;
                        sArr3 = sArr;
                        z4 = false;
                    }
                    i15 = i4;
                    i21 = i3;
                    viewM2812 = view;
                    break;
                case -1080866068:
                case -228693972:
                    C0487.m2356();
                    if (!C0862.m3503()) {
                        view2 = viewM2812;
                        sArr2 = sArr3;
                        i5 = i18;
                        z3 = z4;
                        iM2761 = C0619.m2761("᩵ܺ") ^ i12;
                        i21 = ((iM2761 ^ i11) * 12433) ^ 977870506;
                        i6 = -87803481;
                        i7 = iM2761 ^ i6;
                        z4 = z3;
                        i18 = i5;
                        sArr3 = sArr2;
                        viewM2812 = view2;
                        i15 = i7;
                    } else {
                        iM3169 = (C0619.m2761("ۢ֨") + i11) * (-111);
                        i21 = ((iM3169 ^ i12) * 29847) ^ (-1778839207);
                        i8 = 346511834;
                        i15 = iM3169 ^ i8;
                    }
                    break;
                case -963390564:
                case 1757410595:
                    this.f20848 = c3122;
                    C1826.m6315(c5817, c3122);
                    sArr5 = f20840;
                    i17 = 13;
                    i22 = 3;
                    iM3169 = C0619.m2761("ᩴᩴ") ^ i11;
                    i21 = ((iM3169 ^ i12) * (-2715)) ^ (-2043376383);
                    i8 = 100820753;
                    i15 = iM3169 ^ i8;
                    break;
                case -897773309:
                case 1941750473:
                    C2375.m8065();
                    RunnableC1848.m6360();
                    throw new RuntimeException();
                case -836222866:
                case -19267714:
                    C2023.m6964();
                    iM3169 = (C0619.m2761("ۢ֨") + i11) * (-111);
                    i21 = ((iM3169 ^ i12) * 29847) ^ (-1778839207);
                    i8 = 346511834;
                    i15 = iM3169 ^ i8;
                    break;
                case -697173776:
                case 603985732:
                    C3072 c3072 = (C3072) C3448.m11246(viewM2812, iM2763 ^ i16);
                    this.f20843 = c3072;
                    c3072.setEnabled(z4);
                    c3072.m10020(new InterfaceC17242() { // from class: l.᩻ۗ֫
                        @Override // l.InterfaceC17242
                        /* JADX INFO: renamed from: ۫ */
                        public final void mo4897() {
                            C6106.m17619(this.f80135);
                        }
                    });
                    return;
                case -517692617:
                case 222874232:
                    C1080.m4050();
                    if (!RunnableC1848.f6235) {
                        view2 = viewM2812;
                        sArr2 = sArr3;
                        i5 = i18;
                        z3 = z4;
                        iM2761 = C0619.m2761("᩵ܺ") ^ i12;
                        i21 = ((iM2761 ^ i11) * 12433) ^ 977870506;
                        i6 = -87803481;
                        i7 = iM2761 ^ i6;
                        z4 = z3;
                        i18 = i5;
                        sArr3 = sArr2;
                        viewM2812 = view2;
                        i15 = i7;
                    } else {
                        iM3169 = C0619.m2761("֨ۡ") ^ i11;
                        i21 = ((iM3169 ^ i12) * 27955) ^ 1764624178;
                        i8 = 579614998;
                        i15 = iM3169 ^ i8;
                    }
                    break;
                case -8068673:
                case 1354563802:
                    int i25 = i18;
                    short[] sArr7 = sArr3;
                    boolean z5 = z4;
                    int i26 = i19;
                    viewM9333 = C2834.m9333(viewM2812, C0619.m2761(C4282.m13650(sArr7, i25, i26, i13)) ^ 2122856075);
                    int iM31614 = (i11 - C0773.m3169("ܿܶ")) * (-111);
                    i19 = i26;
                    sArr3 = sArr7;
                    i15 = iM31614 ^ (-187678721);
                    i21 = ((iM31614 ^ i12) * 21107) ^ (-105387464);
                    z4 = z5;
                    i18 = i25;
                    break;
                case 320326097:
                case 988470596:
                    TextView textView = (TextView) viewM11246;
                    this.f20849 = textView;
                    C11235.m28299(textView, new View.OnClickListener() { // from class: l.ۧۗ֫
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            C6106.m17614(this.f35680);
                        }
                    });
                    c3122 = new C3122(this);
                    if (RunnableC3055.f9898 < 0) {
                        iM3169 = C0619.m2761("ۚۘ") ^ i12;
                        i21 = ((iM3169 ^ i11) * (-25951)) ^ (-678943906);
                        i8 = -1030884066;
                        i15 = iM3169 ^ i8;
                    } else {
                        view2 = viewM2812;
                        sArr2 = sArr3;
                        i5 = i18;
                        z3 = z4;
                        iM2761 = C0619.m2761("᩵ܺ") ^ i12;
                        i21 = ((iM2761 ^ i11) * 12433) ^ 977870506;
                        i6 = -87803481;
                        i7 = iM2761 ^ i6;
                        z4 = z3;
                        i18 = i5;
                        sArr3 = sArr2;
                        viewM2812 = view2;
                        i15 = i7;
                    }
                    break;
                case 382402451:
                case 1023846974:
                    viewM11246 = C3448.m11246(viewM2812, C0619.m2761(strM13650) ^ 2119769996);
                    if (C2287.m7745() > 0) {
                        iM3169 = (C0773.m3169("᩷᩸") + i11) * (-21);
                        i21 = ((iM3169 ^ i12) * (-7931)) ^ 1789442917;
                        i8 = 653628360;
                        i15 = iM3169 ^ i8;
                    } else {
                        i = i18;
                        z = z4;
                        int iM31615 = (C0773.m3169("ۧܰ") + i11) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        int i27 = i;
                        i9 = ((iM31615 ^ i12) * 11889) ^ 588314344;
                        i10 = iM31615 ^ (-1135457574);
                        z4 = z;
                        i18 = i27;
                        i15 = i10;
                        i21 = i9;
                    }
                    break;
                case 726530387:
                case 1982118747:
                    c5817 = (C5817) viewM9333;
                    this.f20845 = c5817;
                    sArr4 = f20840;
                    if (C3779.f12953 > 0) {
                        iM3169 = C0773.m3169("ۤ᩹") ^ i12;
                        i21 = ((iM3169 ^ i11) * (-351)) ^ (-1515812741);
                        i8 = -1484808340;
                        i15 = iM3169 ^ i8;
                    } else {
                        z2 = z4;
                        view = viewM2812;
                        sArr = sArr3;
                        i2 = i18;
                        int iM31616 = (C0773.m3169("۠۫") ^ i12) * (-121);
                        i3 = ((iM31616 ^ i11) * 30271) ^ 177180273;
                        i4 = iM31616 ^ 9100025;
                        z4 = z2;
                        i18 = i2;
                        sArr3 = sArr;
                        i15 = i4;
                        i21 = i3;
                        viewM2812 = view;
                    }
                    break;
                case 1688184623:
                case 2108475624:
                    int i28 = i18;
                    short[] sArr8 = sArr3;
                    z = z4;
                    viewM2812 = AbstractC0641.m2812(activityC24268, C0619.m2761(strM12149) ^ 2125345963);
                    this.f20841 = viewM2812;
                    if (C0862.f3233 == 0) {
                        int iM2766 = C0619.m2761("۬۠") ^ i11;
                        i21 = ((iM2766 ^ i12) * (-16861)) ^ 1866332482;
                        i7 = iM2766 ^ 1719876642;
                        z4 = z;
                        i18 = i28;
                        sArr3 = sArr8;
                        i15 = i7;
                    } else {
                        i = i28;
                        sArr3 = sArr8;
                        int iM31617 = (C0773.m3169("ۧܰ") + i11) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        int i29 = i;
                        i9 = ((iM31617 ^ i12) * 11889) ^ 588314344;
                        i10 = iM31617 ^ (-1135457574);
                        z4 = z;
                        i18 = i29;
                        i15 = i10;
                        i21 = i9;
                    }
                    break;
                default:
                    z = z4;
                    sArr3 = f20840;
                    i = 4;
                    i19 = 3;
                    if (C3998.f13671 != 0) {
                        int iM31618 = (C0773.m3169("ۧܰ") + i11) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        int i210 = i;
                        i9 = ((iM31618 ^ i12) * 11889) ^ 588314344;
                        i10 = iM31618 ^ (-1135457574);
                        z4 = z;
                        i18 = i210;
                        i15 = i10;
                        i21 = i9;
                    } else {
                        int iM31619 = (C0773.m3169("ܺܳ") ^ i12) * 109;
                        i21 = ((iM31619 ^ i11) * 29091) ^ 1224109059;
                        i15 = iM31619 ^ (-1871951237);
                        z4 = z;
                        i18 = 4;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17621() {
        Runnable runnable = null;
        C5817 c5817 = null;
        int i = -1066516098;
        int i2 = AbstractC0116.f1064;
        int i3 = C1080.f3865;
        int iM2761 = C0619.m2761("ۢᩳ") ^ i3;
        int i4 = ((iM2761 ^ i2) * 7117) ^ 1112707425;
        int i5 = 1551942089;
        while (true) {
            i = ((((i ^ i2) * (-12321)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2014938896:
                case 1731988496:
                    if (this.f20847) {
                        iM2761 = (C0619.m2761("᩵᩻") + i2) * (-67);
                        i4 = ((iM2761 ^ i3) * 2527) ^ (-1357887992);
                        i5 = 1468877513;
                    } else {
                        iM2761 = (C0773.m3169("ۨܿ") + i3) * (-93);
                        i4 = ((iM2761 ^ i2) * 31861) ^ (-1046497274);
                        i5 = -150333473;
                    }
                    break;
                case -1989047424:
                case 103753852:
                    c5817 = this.f20845;
                    if (C23916.f77426 <= 0) {
                        iM2761 = C0773.m3169("ᩴ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14195)) ^ 2048525702;
                        i5 = 1137923557;
                    } else {
                        iM2761 = (C0773.m3169("֡֫") ^ i2) * 63;
                        i4 = ((iM2761 ^ i3) * (-16161)) ^ 560083686;
                        i5 = -1128194861;
                    }
                    break;
                case -1799389906:
                case 2013410614:
                    if (C3448.f11240 >= 0) {
                        iM2761 = (C0773.m3169("᩻ᩴ") ^ i3) * 41;
                        i4 = ((iM2761 ^ i2) * (-1261)) ^ (-1143353789);
                        i5 = 1527629891;
                    } else {
                        iM2761 = C0773.m3169("ᩴۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 12165) ^ 1168935945;
                        i5 = 1377101709;
                    }
                    break;
                case -1786837099:
                case -1131722605:
                    runnable = new Runnable() { // from class: l.֫ۗ֫
                        @Override // java.lang.Runnable
                        public final void run() {
                            RunnableC1848.m6368(this.f5649.f20848);
                        }
                    };
                    if (RunnableC0334.m2063()) {
                        iM2761 = (C0619.m2761("ᩴ᩶") ^ i3) * (-83);
                        i4 = ((iM2761 ^ i2) * 23957) ^ 842967041;
                        i5 = 1009529272;
                    } else {
                        iM2761 = C0773.m3169("ۛ᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-30267)) ^ 893997801;
                        i5 = -116444202;
                    }
                    break;
                case -1732888090:
                case -310295981:
                    if (C0487.f2131 > 0) {
                        iM2761 = (C0619.m2761("ܽۜ") + i2) * (-93);
                        i4 = ((iM2761 ^ i3) * (-13833)) ^ 1588348350;
                        i5 = -206149317;
                    } else {
                        iM2761 = (C0773.m3169("᩻ᩴ") ^ i3) * 41;
                        i4 = ((iM2761 ^ i2) * (-1261)) ^ (-1143353789);
                        i5 = 1527629891;
                    }
                    break;
                case -1700215941:
                case -878170637:
                    if (C20932.f66974 <= 0) {
                        iM2761 = (C0619.m2761("ܽۜ") + i2) * (-93);
                        i4 = ((iM2761 ^ i3) * (-13833)) ^ 1588348350;
                        i5 = -206149317;
                    } else {
                        iM2761 = (C0619.m2761("ܳ᩹") ^ i3) * (-127);
                        i4 = ((iM2761 ^ i2) * (-26811)) ^ 749978150;
                        i5 = -1919099436;
                    }
                    break;
                case -1517038182:
                case 198647686:
                    if (C0269.m1775() <= 0) {
                        iM2761 = (C0619.m2761("ᩴ᩶") ^ i3) * (-83);
                        i4 = ((iM2761 ^ i2) * 23957) ^ 842967041;
                        i5 = 1009529272;
                    } else {
                        iM2761 = (i3 - C0619.m2761("۟ۡ")) * 35;
                        i4 = ((iM2761 ^ i2) * 4501) ^ (-1449968835);
                        i5 = -261579394;
                    }
                    break;
                case -1465420947:
                case -501930982:
                    C0487.m2356();
                    iM2761 = C0773.m3169("᩶᩺") ^ i2;
                    i4 = ((iM2761 ^ i3) * 1331) ^ (-1645592243);
                    i5 = 887041828;
                    break;
                case -1420313173:
                case 1944041962:
                    C0862.m3503();
                    if (C1783.f6087 <= 0) {
                        iM2761 = (C0773.m3169("᩻ᩴ") ^ i3) * 41;
                        i4 = ((iM2761 ^ i2) * (-1261)) ^ (-1143353789);
                        i5 = 1527629891;
                    } else {
                        iM2761 = (C0619.m2761("ᩴ᩶") ^ i3) * (-83);
                        i4 = ((iM2761 ^ i2) * 23957) ^ 842967041;
                        i5 = 1009529272;
                    }
                    break;
                case -1316115434:
                case 1355852556:
                    if (C3033.m9845() <= 0) {
                        iM2761 = C0773.m3169("᩶᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * 1331) ^ (-1645592243);
                        i5 = 887041828;
                    } else {
                        iM2761 = (C0773.m3169("ۘ۫") ^ i2) * 53;
                        i4 = ((iM2761 ^ i3) * (-32217)) ^ (-1482543984);
                        i5 = -1590466840;
                    }
                    break;
                case -1078655175:
                case 979870049:
                    c5817.stopScroll();
                    if (c5817.isComputingLayout()) {
                        iM2761 = (C0619.m2761("ܳܳ") ^ i3) * 39;
                        i4 = ((iM2761 ^ i2) * (-15971)) ^ 2045353951;
                        i5 = -1905284325;
                    } else {
                        iM2761 = C0619.m2761("ܶۚ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 12051) ^ 1138524261;
                        i5 = 311863114;
                    }
                    break;
                case -948736533:
                case -49209195:
                    if (C13473.m33144()) {
                        iM2761 = C0619.m2761("ܰܿ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-31283)) ^ 1296425533;
                        i5 = -2021596133;
                    } else {
                        iM2761 = (C0619.m2761("ܽۜ") + i2) * (-93);
                        i4 = ((iM2761 ^ i3) * (-13833)) ^ 1588348350;
                        i5 = -206149317;
                    }
                    break;
                case -489992285:
                case -153384184:
                    c5817.post(runnable);
                    break;
                case -112347545:
                case 378059922:
                    runnable.run();
                    iM2761 = (C0773.m3169("ۨܿ") + i3) * (-93);
                    i4 = ((iM2761 ^ i2) * 31861) ^ (-1046497274);
                    i5 = -150333473;
                    break;
                case 246893740:
                case 1632001431:
                    if (C0487.m2356() >= 0) {
                        iM2761 = (C0773.m3169("᩻ᩴ") ^ i3) * 41;
                        i4 = ((iM2761 ^ i2) * (-1261)) ^ (-1143353789);
                        i5 = 1527629891;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ܽۙ")) * (-51);
                        i4 = ((iM2761 ^ i3) * 13609) ^ 762133938;
                        i5 = 2127638412;
                    }
                    break;
                case 818060380:
                case 1543657121:
                    RunnableC0334.m2063();
                    break;
                case 931696158:
                case 1558598908:
                    if (C3077.m10041()) {
                        iM2761 = C0773.m3169("ᩴ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14195)) ^ 2048525702;
                        i5 = 1137923557;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ᩴ᩹")) * (-45);
                        i4 = ((iM2761 ^ i3) * (-21195)) ^ 2083268521;
                        i5 = -1937105242;
                    }
                    break;
                case 986459302:
                case 2017252634:
                    if (C2878.m9491() <= 0) {
                        iM2761 = (C0619.m2761("ᩴ᩶") ^ i3) * (-83);
                        i4 = ((iM2761 ^ i2) * 23957) ^ 842967041;
                        i5 = 1009529272;
                    } else {
                        iM2761 = C0773.m3169("᩶᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * 1331) ^ (-1645592243);
                        i5 = 887041828;
                    }
                    break;
                case 1713003110:
                case 2064475347:
                    if (AbstractC0641.m2813() <= 0) {
                        iM2761 = C0773.m3169("᩶᩺") ^ i2;
                        i4 = ((iM2761 ^ i3) * 1331) ^ (-1645592243);
                        i5 = 887041828;
                    } else {
                        iM2761 = C0773.m3169("ܽۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-15219)) ^ 265304687;
                        i5 = -1553693543;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m17622() {
        int i = 0;
        boolean z = false;
        int i2 = 0;
        C23260 c23260 = null;
        int i3 = -910932022;
        int i4 = C3779.f12953;
        int i5 = C0269.f1558;
        int iM2761 = (C0619.m2761("ܽۤ") ^ i5) * (-71);
        int i6 = ((iM2761 ^ i4) * 31699) ^ 1304538898;
        int i7 = 239553006;
        while (true) {
            i3 = ((((i3 ^ i4) * 26315) >> 31) & i6) ^ (iM2761 ^ i7);
            switch (i3) {
                case -2074151410:
                case -315234442:
                    if (this.f20847) {
                        iM2761 = C0619.m2761("᩶ܺ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 2937) ^ (-1688901024);
                        i7 = -595184313;
                    } else {
                        iM2761 = C0619.m2761("᩹ۙ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-9765)) ^ 1816268858;
                        i7 = 1943382197;
                    }
                    break;
                case -1608116615:
                case -205285668:
                    break;
                case -1577621146:
                case -873027956:
                    if (C2288.f7433 <= 0) {
                        iM2761 = (C0619.m2761("ۤᩳ") ^ i4) * (-113);
                        i6 = ((iM2761 ^ i5) * (-12735)) ^ (-1213262722);
                        i7 = -659366969;
                    } else {
                        iM2761 = C0619.m2761("ۤۡ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-18769)) ^ (-1122518865);
                        i7 = -494849771;
                    }
                    break;
                case -1553673631:
                case -1252705978:
                    C17202.m40372();
                    break;
                case -1397480390:
                case 1866049830:
                    if (C3779.f12953 <= 0) {
                        iM2761 = (C0773.m3169("᩺ܽ") ^ i5) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i6 = ((iM2761 ^ i4) * (-19841)) ^ (-1153024679);
                        i7 = 2001645298;
                    } else {
                        iM2761 = C0619.m2761("ۘۗ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 25257) ^ (-1941820440);
                        i7 = -1821151137;
                    }
                    break;
                case -1335744824:
                case 986682542:
                    this.f20846 = i2;
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = (C0619.m2761("ۤᩳ") ^ i4) * (-113);
                        i6 = ((iM2761 ^ i5) * (-12735)) ^ (-1213262722);
                        i7 = -659366969;
                    } else {
                        iM2761 = (C0619.m2761("ᩳܽ") + i5) * (-69);
                        i6 = ((iM2761 ^ i4) * (-10481)) ^ (-218283998);
                        i7 = 841226809;
                    }
                    break;
                case -1137364289:
                case -1086368495:
                    if (C2485.f7950 != 0) {
                        iM2761 = (C0619.m2761("ۤᩳ") ^ i4) * (-113);
                        i6 = ((iM2761 ^ i5) * (-12735)) ^ (-1213262722);
                        i7 = -659366969;
                    } else {
                        iM2761 = C0619.m2761("ᩳܶ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-31565)) ^ (-540814558);
                        i7 = 1765166606;
                    }
                    break;
                case -1091690856:
                case -921887234:
                    i2 = i + (z ? 1 : 0);
                    if (C1564.f5401 <= 0) {
                        iM2761 = C0773.m3169("ܰᩳ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-21227)) ^ (-1078873944);
                        i7 = -679030240;
                    } else {
                        iM2761 = (C0773.m3169("ۢ᩺") + i4) * 95;
                        i6 = ((iM2761 ^ i5) * (-7455)) ^ 62347243;
                        i7 = -545244422;
                    }
                    break;
                case -1042443357:
                case 1933449066:
                    c23260 = new C23260(this, i2);
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = (C0619.m2761("ۤᩳ") ^ i4) * (-113);
                        i6 = ((iM2761 ^ i5) * (-12735)) ^ (-1213262722);
                        i7 = -659366969;
                    } else {
                        iM2761 = C0773.m3169("۬ܿ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-21021)) ^ 467884974;
                        i7 = 1692058096;
                    }
                    break;
                case -1033928625:
                case -31559083:
                    C3690.m11987();
                    iM2761 = (C0773.m3169("᩺ܽ") ^ i5) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i6 = ((iM2761 ^ i4) * (-19841)) ^ (-1153024679);
                    i7 = 2001645298;
                    break;
                case -887507874:
                case 190171293:
                    if (C3998.m12920()) {
                        iM2761 = (C0773.m3169("᩻ܶ") ^ i4) * 17;
                        i6 = ((iM2761 ^ i5) * 23903) ^ 50335254;
                        i7 = -1210839144;
                    } else {
                        iM2761 = C0773.m3169("ܰᩳ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-21227)) ^ (-1078873944);
                        i7 = -679030240;
                    }
                    break;
                case -680131641:
                case 1085090843:
                    if (C2023.f6737) {
                        iM2761 = (C0773.m3169("᩺ܽ") ^ i5) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i6 = ((iM2761 ^ i4) * (-19841)) ^ (-1153024679);
                        i7 = 2001645298;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ܺ֡")) * (-91);
                        i6 = ((iM2761 ^ i4) * 18533) ^ 19482252;
                        i7 = -1815157186;
                    }
                    break;
                case 192517590:
                case 1665465927:
                    C3779.m12264();
                    if (C3734.f12817 < 0) {
                        iM2761 = C0773.m3169("ۘ۟") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-9455)) ^ 294108368;
                        i7 = 2036362440;
                    } else {
                        iM2761 = (C0773.m3169("᩺ܽ") ^ i5) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i6 = ((iM2761 ^ i4) * (-19841)) ^ (-1153024679);
                        i7 = 2001645298;
                    }
                    break;
                case 412136870:
                case 2066716176:
                    if (C23916.f77426 <= 0) {
                        iM2761 = C0773.m3169("᩻᩵") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-4541)) ^ 1606769032;
                        i7 = 607928979;
                    } else {
                        iM2761 = C0773.m3169("ܰᩳ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-21227)) ^ (-1078873944);
                        i7 = -679030240;
                    }
                    break;
                case 951678378:
                case 1515112963:
                    i = this.f20846;
                    z = true;
                    z = true;
                    if (C11235.m28309() != 0) {
                        iM2761 = C0773.m3169("ۘ۟") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-9455)) ^ 294108368;
                        i7 = 2036362440;
                    } else {
                        iM2761 = C0619.m2761("ܺۨ") ^ i5;
                        i6 = ((iM2761 ^ i4) * 11277) ^ 1267971079;
                        i7 = -2081269045;
                    }
                    break;
                case 1160756501:
                case 1296188693:
                    C2834.m9339(c23260);
                    this.f20847 = z;
                    break;
                case 1954920549:
                case 2138728621:
                    if (C13473.m33144()) {
                        iM2761 = (C0619.m2761("ۘ᩵") + i5) * (-95);
                        i6 = ((iM2761 ^ i4) * 31047) ^ 1275750560;
                        i7 = -1116201534;
                    } else {
                        iM2761 = C0773.m3169("᩻᩵") ^ i5;
                        i6 = ((iM2761 ^ i4) * (-4541)) ^ 1606769032;
                        i7 = 607928979;
                    }
                    break;
                default:
                    if (!C2878.f9462) {
                        iM2761 = (C0773.m3169("᩺ܽ") ^ i5) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i6 = ((iM2761 ^ i4) * (-19841)) ^ (-1153024679);
                        i7 = 2001645298;
                    } else {
                        iM2761 = C0773.m3169("ܰᩳ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-21227)) ^ (-1078873944);
                        i7 = -679030240;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m17619(C6106 c6106) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = -973777714;
        int i5 = C2419.f7754;
        int i6 = RunnableC0334.f1808;
        int iM3169 = (C0773.m3169("ۙ۟") ^ i6) * 127;
        int i7 = ((iM3169 ^ i5) * 15575) ^ (-227552100);
        int i8 = 1289982299;
        while (true) {
            i4 = ((((i4 ^ i5) * 15775) >> 31) & i7) ^ (iM3169 ^ i8);
            switch (i4) {
                case -2055315382:
                case -111440948:
                    i2 = 1;
                    if (RunnableC0334.m2063()) {
                        iM3169 = (C0619.m2761("᩻ۖ") + i5) * (-41);
                        i7 = ((iM3169 ^ i6) * 8741) ^ 1412456595;
                        i8 = 749371318;
                    } else {
                        iM3169 = C0619.m2761("᩶ܿ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 27575) ^ 542904057;
                        i8 = -1253519684;
                    }
                    break;
                case -1978750416:
                case 1417816549:
                    C3734.m12152();
                    C2375.m8065();
                    iM3169 = (C0619.m2761("ۘ۫") ^ i6) * 23;
                    i7 = ((iM3169 ^ i5) * (-26719)) ^ 774083653;
                    i8 = 576012492;
                    break;
                case -1833679682:
                case 291555127:
                    if (C1343.f4799 != 0) {
                        iM3169 = C0619.m2761("ۗܳ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 14671) ^ (-1789791870);
                        i8 = -1078882365;
                    } else {
                        iM3169 = (C0619.m2761("᩺ۗ") ^ i5) * (-43);
                        i7 = ((iM3169 ^ i6) * (-29121)) ^ 1220424619;
                        i8 = -338295167;
                    }
                    break;
                case -1819310726:
                case 149360709:
                    C1564.m5509();
                    if (!C1321.m4852()) {
                        iM3169 = (C0619.m2761("ۘ۫") ^ i6) * 23;
                        i7 = ((iM3169 ^ i5) * (-26719)) ^ 774083653;
                        i8 = 576012492;
                    } else {
                        iM3169 = C0619.m2761("ۗܳ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 14671) ^ (-1789791870);
                        i8 = -1078882365;
                    }
                    break;
                case -1706980462:
                case 1027355839:
                    i3 = i + i2;
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0773.m3169("ۙ۠") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-4353)) ^ (-1252131076);
                        i8 = -1033294938;
                    } else {
                        iM3169 = C0619.m2761("ۜۜ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 2353) ^ 364161824;
                        i8 = -1382660463;
                    }
                    break;
                case -1559431669:
                case -449814580:
                    i = c6106.f20846;
                    if (AbstractC3624.m11755() != 0) {
                        iM3169 = C0773.m3169("ۙ۠") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-4353)) ^ (-1252131076);
                        i8 = -1033294938;
                    } else {
                        iM3169 = C0619.m2761("᩻ۨ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 18935) ^ (-1009088936);
                        i8 = -782319447;
                    }
                    break;
                case -1503688637:
                case -159832568:
                    C3779.m12264();
                    break;
                case -1450743508:
                case -136966578:
                    if (C0487.f2131 > 0) {
                        iM3169 = C0619.m2761("ۜۚ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 29565) ^ (-868130052);
                        i8 = -535212258;
                    } else {
                        iM3169 = (C0619.m2761("ۘ۫") ^ i6) * 23;
                        i7 = ((iM3169 ^ i5) * (-26719)) ^ 774083653;
                        i8 = 576012492;
                    }
                    break;
                case -1276094068:
                case 1553911875:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = (C0619.m2761("ۘ۫") ^ i6) * 23;
                        i7 = ((iM3169 ^ i5) * (-26719)) ^ 774083653;
                        i8 = 576012492;
                    } else {
                        iM3169 = C0619.m2761("ܺᩴ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-5299)) ^ (-518995083);
                        i8 = -857436295;
                    }
                    break;
                case -454949461:
                case 605332683:
                    if (C0619.f2439) {
                        iM3169 = (C0619.m2761("᩻ۖ") + i5) * (-41);
                        i7 = ((iM3169 ^ i6) * 8741) ^ 1412456595;
                        i8 = 749371318;
                    } else {
                        iM3169 = C0619.m2761("֡᩹") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-32359)) ^ 971100028;
                        i8 = -1726493115;
                    }
                    break;
                case -275918285:
                case 647747256:
                    if (C2023.m6964() <= 0) {
                        iM3169 = (C0619.m2761("ۘ۫") ^ i6) * 23;
                        i7 = ((iM3169 ^ i5) * (-26719)) ^ 774083653;
                        i8 = 576012492;
                    } else {
                        iM3169 = (C0619.m2761("ܿܿ") ^ i6) * (-69);
                        i7 = ((iM3169 ^ i5) * (-21775)) ^ 930405277;
                        i8 = -618991480;
                    }
                    break;
                case -7341918:
                case 1543563549:
                    if (C2354.f7599 >= 0) {
                        iM3169 = C0619.m2761("ۗܳ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 14671) ^ (-1789791870);
                        i8 = -1078882365;
                    } else {
                        iM3169 = C0619.m2761("ۨ֡") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-6939)) ^ 46088679;
                        i8 = 321188814;
                    }
                    break;
                case 635526299:
                case 1395343630:
                    c6106.f20846 = i3;
                    if (C4282.f15546 > 0) {
                        C2834.m9339(new C23260(c6106, i3));
                    }
                    iM3169 = C0619.m2761("ۜۚ") ^ i5;
                    i7 = ((iM3169 ^ i6) * 29565) ^ (-868130052);
                    i8 = -535212258;
                    break;
                case 1303561945:
                case 1752061418:
                    C2310.m7813();
                    if (C3734.f12817 >= 0) {
                        iM3169 = (C0619.m2761("᩻ۖ") + i5) * (-41);
                        i7 = ((iM3169 ^ i6) * 8741) ^ 1412456595;
                        i8 = 749371318;
                    } else {
                        iM3169 = (C0619.m2761("ۘ۫") ^ i6) * 23;
                        i7 = ((iM3169 ^ i5) * (-26719)) ^ 774083653;
                        i8 = 576012492;
                    }
                    break;
                default:
                    if (C2878.f9462) {
                        iM3169 = (C0619.m2761("ۘ۫") ^ i6) * 23;
                        i7 = ((iM3169 ^ i5) * (-26719)) ^ 774083653;
                        i8 = 576012492;
                    } else {
                        iM3169 = C0773.m3169("ܿܽ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-989)) ^ 545110270;
                        i8 = 998735832;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:52:0x0144  */
    /* JADX WARN: Code duplicated, block: B:64:0x01be  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m17618(final int i, final C6106 c6106, final Runnable runnable, final boolean z) {
        int iM2761;
        int i2;
        C5817 c5817 = null;
        int i3 = 162771818;
        int i4 = C0773.f2792;
        int i5 = C2288.f7433;
        int iM2762 = (C0619.m2761("ᩴۧ") + i4) * 101;
        int i6 = ((iM2762 ^ i5) * (-7299)) ^ (-1813083170);
        int i7 = 1574514178;
        while (true) {
            int i8 = iM2762 ^ i7;
            Runnable runnable2 = null;
            while (true) {
                i3 = ((((i3 ^ i5) * 17421) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -1988565253:
                    case 1291930790:
                        C2702.m8876();
                        iM2761 = (i5 - C0773.m3169("᩷ۨ")) * (-17);
                        i6 = ((iM2761 ^ i4) * 5861) ^ 1758992452;
                        i2 = -93167848;
                        i8 = iM2761 ^ i2;
                        break;
                    case -1673255703:
                    case -782003952:
                        if (RunnableC3646.f12471) {
                            iM2761 = (i5 - C0773.m3169("᩷ۨ")) * (-17);
                            i6 = ((iM2761 ^ i4) * 5861) ^ 1758992452;
                            i2 = -93167848;
                        } else {
                            iM2761 = C0619.m2761("۠᩷") ^ i4;
                            i6 = ((iM2761 ^ i5) * 26429) ^ 1141098052;
                            i2 = 1422582631;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    case -1144934141:
                    case 844661767:
                        if (C0269.f1558 <= 0) {
                            iM2761 = (i5 - C0773.m3169("᩷ۨ")) * (-17);
                            i6 = ((iM2761 ^ i4) * 5861) ^ 1758992452;
                            i2 = -93167848;
                        } else {
                            iM2761 = (C0619.m2761("ۘ֡") + i5) * 51;
                            i6 = ((iM2761 ^ i4) * (-27341)) ^ (-86753992);
                            i2 = 1206561666;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    case -1133284830:
                    case -423250799:
                        if (C3099.m10095()) {
                            iM2761 = (i5 - C0773.m3169("᩷ۨ")) * (-17);
                            i6 = ((iM2761 ^ i4) * 5861) ^ 1758992452;
                            i2 = -93167848;
                        } else {
                            iM2761 = (C0773.m3169("ۤ᩸") ^ i5) * 119;
                            i6 = ((iM2761 ^ i4) * (-2631)) ^ 1253973361;
                            i2 = 1908840229;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    case -1084935843:
                    case 1678963342:
                        if (C2310.f7472 >= 0) {
                            iM2761 = C0773.m3169("ۧ᩵") ^ i4;
                            i6 = ((iM2761 ^ i5) * 3975) ^ 507710059;
                            i2 = -68784580;
                        } else {
                            iM2761 = (C0619.m2761("ۙܳ") + i4) * (-115);
                            i6 = ((iM2761 ^ i5) * (-22539)) ^ 587225265;
                            i2 = -636736404;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    case -1007338505:
                    case -845250426:
                        if (C1564.f5401 > 0) {
                            runnable2 = new Runnable() { // from class: l.ܺۗ֫
                                {
                                    int i9 = -1013471314;
                                    int i10 = C3033.f9831;
                                    int i11 = C23916.f77426;
                                    int iM2763 = (C0619.m2761("ۗۛ") + i11) * (-63);
                                    int i12 = ((iM2763 ^ i10) * (-1017)) ^ 1668399178;
                                    int i13 = -1929832201;
                                    while (true) {
                                        i9 = ((((i9 ^ i10) * (-3355)) >> 31) & i12) ^ (iM2763 ^ i13);
                                        switch (i9) {
                                            case -2138170206:
                                            case 844439085:
                                                if (C1542.f5343 <= 0) {
                                                    iM2763 = C0773.m3169("ܳۢ") ^ i11;
                                                    i12 = ((iM2763 ^ i10) * 23013) ^ (-572853467);
                                                    i13 = -409014267;
                                                } else {
                                                    iM2763 = (C0619.m2761("ܽܰ") + i11) * 15;
                                                    i12 = ((iM2763 ^ i10) * 21063) ^ (-1871280832);
                                                    i13 = 221813591;
                                                }
                                                break;
                                            case -2126569097:
                                            case 220305165:
                                                if (C17202.f56030) {
                                                    iM2763 = (C0773.m3169("ۧ۬") + i10) * (-127);
                                                    i12 = ((iM2763 ^ i11) * 427) ^ 2128599060;
                                                    i13 = 687223041;
                                                } else {
                                                    iM2763 = C0773.m3169("ܳۢ") ^ i11;
                                                    i12 = ((iM2763 ^ i10) * 23013) ^ (-572853467);
                                                    i13 = -409014267;
                                                }
                                                break;
                                            case -1876528377:
                                            case 1209447002:
                                                if (C20932.m47848() != 0) {
                                                    iM2763 = C0773.m3169("᩻ۙ") ^ i10;
                                                    i12 = ((iM2763 ^ i11) * (-13479)) ^ 948235078;
                                                    i13 = 422763562;
                                                } else {
                                                    iM2763 = C0619.m2761("ۚᩴ") ^ i10;
                                                    i12 = ((iM2763 ^ i11) * (-19271)) ^ 701721267;
                                                    i13 = 159697043;
                                                }
                                                break;
                                            case -1752741973:
                                            case 2120739888:
                                                if (C1826.f6190 <= 0) {
                                                    iM2763 = (C0619.m2761("ۢۨ") + i11) * (-47);
                                                    i12 = ((iM2763 ^ i10) * (-1755)) ^ 1272622933;
                                                    i13 = -1369988216;
                                                } else {
                                                    iM2763 = (i10 - C0773.m3169("ۙ᩸")) * (-55);
                                                    i12 = ((iM2763 ^ i11) * 4631) ^ (-1875410065);
                                                    i13 = 1253182543;
                                                }
                                                break;
                                            case -1639148268:
                                            case 866626703:
                                                C11235.m28309();
                                                if (C2419.m8174() < 0) {
                                                    iM2763 = C0773.m3169("ܳۢ") ^ i11;
                                                    i12 = ((iM2763 ^ i10) * 23013) ^ (-572853467);
                                                    i13 = -409014267;
                                                } else {
                                                    iM2763 = C0773.m3169("᩻ۙ") ^ i10;
                                                    i12 = ((iM2763 ^ i11) * (-13479)) ^ 948235078;
                                                    i13 = 422763562;
                                                }
                                                break;
                                            case -639671116:
                                            case 1333004734:
                                                if (C0773.m3161() != 0) {
                                                    iM2763 = C0773.m3169("᩻ۙ") ^ i10;
                                                    i12 = ((iM2763 ^ i11) * (-13479)) ^ 948235078;
                                                    i13 = 422763562;
                                                } else {
                                                    iM2763 = C0619.m2761("֨ۤ") ^ i11;
                                                    i12 = ((iM2763 ^ i10) * 25545) ^ (-1909570266);
                                                    i13 = -759791233;
                                                }
                                                break;
                                            case -578992740:
                                            case -574709722:
                                                C3998.m12920();
                                                if (C13473.f42873 == 0) {
                                                    iM2763 = (C0773.m3169("֡᩻") ^ i10) * (-23);
                                                    i12 = ((iM2763 ^ i11) * (-28919)) ^ 1657726490;
                                                    i13 = 724936285;
                                                } else {
                                                    iM2763 = C0773.m3169("᩻ۙ") ^ i10;
                                                    i12 = ((iM2763 ^ i11) * (-13479)) ^ 948235078;
                                                    i13 = 422763562;
                                                }
                                                break;
                                            case -430438941:
                                            case -129571994:
                                                if (C17202.m40372()) {
                                                    iM2763 = C0773.m3169("ۛۧ") ^ i11;
                                                    i12 = ((iM2763 ^ i10) * (-19873)) ^ 717578170;
                                                    i13 = 1972863300;
                                                } else {
                                                    iM2763 = (C0619.m2761("ۢۨ") + i11) * (-47);
                                                    i12 = ((iM2763 ^ i10) * (-1755)) ^ 1272622933;
                                                    i13 = -1369988216;
                                                }
                                                break;
                                            case -397056811:
                                            case 2128566259:
                                                if (C1321.f4751 >= 0) {
                                                    iM2763 = C0773.m3169("᩻ۙ") ^ i10;
                                                    i12 = ((iM2763 ^ i11) * (-13479)) ^ 948235078;
                                                    i13 = 422763562;
                                                } else {
                                                    iM2763 = (i10 - C0773.m3169("۠᩷")) * (-91);
                                                    i12 = ((iM2763 ^ i11) * (-15057)) ^ (-355005376);
                                                    i13 = -1751461028;
                                                }
                                                break;
                                            case -384493760:
                                            case 1029025228:
                                                return;
                                            case -351302204:
                                            case 348447800:
                                                C1080.m4050();
                                                iM2763 = C0773.m3169("᩻ۙ") ^ i10;
                                                i12 = ((iM2763 ^ i11) * (-13479)) ^ 948235078;
                                                i13 = 422763562;
                                                break;
                                            case -152189890:
                                            case 1748859210:
                                                C1519.m5403();
                                                C3690.m11987();
                                                throw new RuntimeException();
                                            case -26665687:
                                            case 699041806:
                                                if (C11235.f35427 >= 0) {
                                                    iM2763 = C0773.m3169("ܳۢ") ^ i11;
                                                    i12 = ((iM2763 ^ i10) * 23013) ^ (-572853467);
                                                    i13 = -409014267;
                                                } else {
                                                    iM2763 = (i11 - C0619.m2761("ܺᩳ")) * (-49);
                                                    i12 = ((iM2763 ^ i10) * (-19645)) ^ (-1255462762);
                                                    i13 = 713720436;
                                                }
                                                break;
                                            case 875363036:
                                            case 1767789549:
                                                if (C13473.f42873 != 0) {
                                                    iM2763 = C0773.m3169("ܳۢ") ^ i11;
                                                    i12 = ((iM2763 ^ i10) * 23013) ^ (-572853467);
                                                    i13 = -409014267;
                                                } else {
                                                    iM2763 = (C0619.m2761("ۙۙ") ^ i11) * 61;
                                                    i12 = ((iM2763 ^ i10) * (-27651)) ^ 1800339371;
                                                    i13 = 979537267;
                                                }
                                                break;
                                            case 1477672333:
                                            case 1545043937:
                                                if (C2485.m8357() > 0) {
                                                    iM2763 = C0773.m3169("᩻ۙ") ^ i10;
                                                    i12 = ((iM2763 ^ i11) * (-13479)) ^ 948235078;
                                                    i13 = 422763562;
                                                } else {
                                                    iM2763 = C0773.m3169("᩶ܺ") ^ i11;
                                                    i12 = ((iM2763 ^ i10) * 14807) ^ 2109007476;
                                                    i13 = 774147114;
                                                }
                                                break;
                                            default:
                                                if (AbstractC3624.f12429 <= 0) {
                                                    iM2763 = (C0773.m3169("֡᩻") ^ i10) * (-23);
                                                    i12 = ((iM2763 ^ i11) * (-28919)) ^ 1657726490;
                                                    i13 = 724936285;
                                                } else {
                                                    iM2763 = (C0773.m3169("᩹ۜ") ^ i10) * 79;
                                                    i12 = ((iM2763 ^ i11) * 8567) ^ 1509827062;
                                                    i13 = 1820731210;
                                                }
                                                break;
                                        }
                                    }
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Runnable runnable3 = null;
                                    boolean z2 = false;
                                    int i9 = 1486660759;
                                    int i10 = C4282.f15546;
                                    int i11 = C0950.f3488;
                                    int iM3169 = (C0773.m3169("ۨۨ") ^ i10) * 21;
                                    int i12 = ((iM3169 ^ i11) * (-2567)) ^ (-670376316);
                                    int i13 = 1391799925;
                                    while (true) {
                                        i9 = ((((i9 ^ i11) * 25845) >> 31) & i12) ^ (iM3169 ^ i13);
                                        switch (i9) {
                                            case -2079724776:
                                            case -1130747541:
                                                if (C1080.f3865 >= 0) {
                                                    iM3169 = (C0619.m2761("ܰۤ") + i11) * (-113);
                                                    i12 = ((iM3169 ^ i10) * 23833) ^ (-4216245);
                                                    i13 = -1032652602;
                                                } else {
                                                    iM3169 = C0773.m3169("ۤᩳ") ^ i10;
                                                    i12 = ((iM3169 ^ i11) * (-31335)) ^ 2039223451;
                                                    i13 = 1741906652;
                                                }
                                                break;
                                            case -2039604669:
                                            case 606271269:
                                                if (C4282.f15546 <= 0) {
                                                    iM3169 = C0773.m3169("᩺ۙ") ^ i10;
                                                    i12 = ((iM3169 ^ i11) * (-4221)) ^ 967565569;
                                                    i13 = 724113135;
                                                } else {
                                                    iM3169 = (i11 - C0773.m3169("ۜ۠")) * 89;
                                                    i12 = ((iM3169 ^ i10) * (-6551)) ^ (-228582714);
                                                    i13 = 1019256540;
                                                }
                                                break;
                                            case -2026919194:
                                            case 1451322240:
                                                C3099.m10095();
                                                break;
                                            case -1781532778:
                                            case 260674149:
                                                if (C3734.f12817 >= 0) {
                                                    iM3169 = C0619.m2761("ۢۜ") ^ i11;
                                                    i12 = ((iM3169 ^ i10) * 1695) ^ (-827699056);
                                                    i13 = -584034781;
                                                } else {
                                                    iM3169 = (i10 - C0773.m3169("᩵᩶")) * 17;
                                                    i12 = ((iM3169 ^ i11) * 29819) ^ (-1973666063);
                                                    i13 = -2139905985;
                                                }
                                                break;
                                            case -1410661440:
                                            case -322620799:
                                                RunnableC3055.m9933();
                                                if (C1783.f6087 > 0) {
                                                    iM3169 = C0773.m3169("᩺ۙ") ^ i10;
                                                    i12 = ((iM3169 ^ i11) * (-4221)) ^ 967565569;
                                                    i13 = 724113135;
                                                } else {
                                                    iM3169 = (C0619.m2761("ܰۤ") + i11) * (-113);
                                                    i12 = ((iM3169 ^ i10) * 23833) ^ (-4216245);
                                                    i13 = -1032652602;
                                                }
                                                break;
                                            case -1358849160:
                                            case -1321002189:
                                                if (C2354.f7599 >= 0) {
                                                    iM3169 = C0619.m2761("ۢۜ") ^ i11;
                                                    i12 = ((iM3169 ^ i10) * 1695) ^ (-827699056);
                                                    i13 = -584034781;
                                                } else {
                                                    iM3169 = (i10 - C0773.m3169("᩹᩵")) * 15;
                                                    i12 = ((iM3169 ^ i11) * (-26825)) ^ 223230283;
                                                    i13 = 21264562;
                                                }
                                                break;
                                            case -1323664716:
                                            case 1812050999:
                                                if (C1343.m4943()) {
                                                    iM3169 = C0773.m3169("ۘۤ") ^ i10;
                                                    i12 = ((iM3169 ^ i11) * 2517) ^ 166109546;
                                                    i13 = -1741075086;
                                                } else {
                                                    iM3169 = C0773.m3169("᩺ۙ") ^ i10;
                                                    i12 = ((iM3169 ^ i11) * (-4221)) ^ 967565569;
                                                    i13 = 724113135;
                                                }
                                                break;
                                            case -1275183136:
                                            case -489153667:
                                                if (C3998.m12920()) {
                                                    iM3169 = C0773.m3169("ۨ֡") ^ i11;
                                                    i12 = ((iM3169 ^ i10) * (-29125)) ^ (-534004656);
                                                    i13 = 2007332840;
                                                } else {
                                                    iM3169 = (C0619.m2761("ܰۤ") + i11) * (-113);
                                                    i12 = ((iM3169 ^ i10) * 23833) ^ (-4216245);
                                                    i13 = -1032652602;
                                                }
                                                break;
                                            case -1232017893:
                                            case 1131425222:
                                                z2 = z;
                                                if (C1343.f4799 != 0) {
                                                    iM3169 = (i10 - C0773.m3169("᩺᩸")) * 61;
                                                    i12 = ((iM3169 ^ i11) * (-15063)) ^ 109402094;
                                                    i13 = 1459590330;
                                                } else {
                                                    iM3169 = C0773.m3169("۫ۜ") ^ i11;
                                                    i12 = ((iM3169 ^ i10) * 19297) ^ (-1076450241);
                                                    i13 = 1979539949;
                                                }
                                                break;
                                            case -664687246:
                                            case -288041077:
                                                C2485.m8357();
                                                C1519.m5403();
                                                iM3169 = (C0619.m2761("ܰۤ") + i11) * (-113);
                                                i12 = ((iM3169 ^ i10) * 23833) ^ (-4216245);
                                                i13 = -1032652602;
                                                break;
                                            case -527549827:
                                            case 1681352109:
                                                if (C3448.f11240 >= 0) {
                                                    iM3169 = (i10 - C0773.m3169("᩺᩸")) * 61;
                                                    i12 = ((iM3169 ^ i11) * (-15063)) ^ 109402094;
                                                    i13 = 1459590330;
                                                } else {
                                                    iM3169 = (C0773.m3169("᩷ۧ") + i10) * 3;
                                                    i12 = ((iM3169 ^ i11) * 30909) ^ (-1619591432);
                                                    i13 = 754721484;
                                                }
                                                break;
                                            case -489280880:
                                            case 2071958983:
                                                C6106.m17610(i, c6106, runnable3, z2);
                                                break;
                                            case 701205548:
                                            case 1091096035:
                                                if (RunnableC1848.f6235) {
                                                    iM3169 = C0619.m2761("ۢۜ") ^ i11;
                                                    i12 = ((iM3169 ^ i10) * 1695) ^ (-827699056);
                                                    i13 = -584034781;
                                                } else {
                                                    iM3169 = C0619.m2761("ۧۖ") ^ i11;
                                                    i12 = ((iM3169 ^ i10) * 30593) ^ 1008454333;
                                                    i13 = 942330267;
                                                }
                                                break;
                                            case 863990392:
                                            case 1243290677:
                                                C2288.m7767();
                                                if (!C17202.f56030) {
                                                    iM3169 = (C0619.m2761("ܰۤ") + i11) * (-113);
                                                    i12 = ((iM3169 ^ i10) * 23833) ^ (-4216245);
                                                    i13 = -1032652602;
                                                } else {
                                                    iM3169 = (i10 - C0773.m3169("᩵᩶")) * 17;
                                                    i12 = ((iM3169 ^ i11) * 29819) ^ (-1973666063);
                                                    i13 = -2139905985;
                                                }
                                                break;
                                            case 1402086860:
                                            case 1848059301:
                                                runnable3 = runnable;
                                                if (C13473.f42873 != 0) {
                                                    iM3169 = C0619.m2761("ۢۜ") ^ i11;
                                                    i12 = ((iM3169 ^ i10) * 1695) ^ (-827699056);
                                                    i13 = -584034781;
                                                } else {
                                                    iM3169 = (C0773.m3169("۟ۚ") ^ i10) * 45;
                                                    i12 = ((iM3169 ^ i11) * (-4127)) ^ 2087059335;
                                                    i13 = 596452643;
                                                }
                                                break;
                                            default:
                                                if (AbstractC0641.f2496 >= 0) {
                                                    iM3169 = (i10 - C0773.m3169("᩺᩸")) * 61;
                                                    i12 = ((iM3169 ^ i11) * (-15063)) ^ 109402094;
                                                    i13 = 1459590330;
                                                } else {
                                                    iM3169 = (C0619.m2761("֫ۧ") + i11) * (-83);
                                                    i12 = ((iM3169 ^ i10) * 3903) ^ 1625414302;
                                                    i13 = 511377493;
                                                }
                                                break;
                                        }
                                        return;
                                    }
                                }
                            };
                            c5817 = c6106.f20845;
                            c5817.stopScroll();
                            if (c5817.isComputingLayout()) {
                                iM2761 = C0773.m3169("᩵ᩳ") ^ i4;
                                i6 = ((iM2761 ^ i5) * 14859) ^ (-694970231);
                                i2 = 998359565;
                            } else {
                                iM2761 = (C0619.m2761("ᩳ۬") + i4) * 13;
                                i6 = ((iM2761 ^ i5) * (-32661)) ^ 1373131302;
                                i2 = 726994431;
                            }
                            i8 = iM2761 ^ i2;
                        }
                        break;
                    case -985365046:
                    case 2114802221:
                        if (AbstractC3624.f12429 <= 0) {
                            iM2761 = C0773.m3169("ۧ᩵") ^ i4;
                            i6 = ((iM2761 ^ i5) * 3975) ^ 507710059;
                            i2 = -68784580;
                        } else {
                            iM2761 = C0773.m3169("᩵ۖ") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-29125)) ^ 1426684072;
                            i2 = 1083586904;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    case -916015198:
                    case 1149926004:
                        if (C1542.m5459() >= 0) {
                            iM2761 = (i5 - C0773.m3169("᩷ۨ")) * (-17);
                            i6 = ((iM2761 ^ i4) * 5861) ^ 1758992452;
                            i2 = -93167848;
                        } else {
                            iM2761 = C0773.m3169("ᩳۢ") ^ i4;
                            i6 = ((iM2761 ^ i5) * 20271) ^ 933514141;
                            i2 = 1588583722;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    case -749397946:
                    case -88321636:
                        if (C3998.f13671 != 0) {
                            iM2761 = C0773.m3169("ۧ᩵") ^ i4;
                            i6 = ((iM2761 ^ i5) * 3975) ^ 507710059;
                            i2 = -68784580;
                        } else {
                            iM2761 = (C0619.m2761("ᩴܺ") ^ i4) * (-33);
                            i6 = ((iM2761 ^ i5) * 19137) ^ (-389195928);
                            i2 = 199408182;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    case -707232392:
                    case 1482758187:
                        if (C3033.m9845() > 0) {
                            iM2761 = C0773.m3169("ۙ᩶") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-2977)) ^ (-1974528051);
                            i2 = -1324887642;
                            i8 = iM2761 ^ i2;
                        }
                        break;
                    case -688890335:
                    case 343127577:
                        if (C0862.f3233 != 0) {
                            iM2761 = (i5 - C0773.m3169("᩷ۨ")) * (-17);
                            i6 = ((iM2761 ^ i4) * 5861) ^ 1758992452;
                            i2 = -93167848;
                        } else {
                            iM2761 = (C0619.m2761("ۨ᩹") + i5) * 71;
                            i6 = ((iM2761 ^ i4) * 3319) ^ (-1450619252);
                            i2 = -2003491964;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    case -216434725:
                    case 583476484:
                        C0862.m3503();
                        if (C13473.f42873 != 0) {
                            iM2761 = (i5 - C0773.m3169("᩷ۨ")) * (-17);
                            i6 = ((iM2761 ^ i4) * 5861) ^ 1758992452;
                            i2 = -93167848;
                        } else {
                            iM2761 = C0773.m3169("ۧ᩵") ^ i4;
                            i6 = ((iM2761 ^ i5) * 3975) ^ 507710059;
                            i2 = -68784580;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    case -110948251:
                    case 876237678:
                        runnable2.run();
                        break;
                    case 231087620:
                    case 741515084:
                        if (C3779.f12953 > 0) {
                            iM2761 = C0773.m3169("ۙ᩸") ^ i5;
                            i6 = ((iM2761 ^ i4) * 21033) ^ (-2096004293);
                            i2 = 1981906939;
                            i8 = iM2761 ^ i2;
                        }
                        break;
                    case 643069017:
                    case 971665034:
                        if (C2485.f7950 != 0) {
                            iM2761 = C0773.m3169("᩵ۖ") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-29125)) ^ 1426684072;
                            i2 = 1083586904;
                        } else {
                            iM2761 = C0773.m3169("ۧ۬") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-27041)) ^ 7558297;
                            i2 = -1422636006;
                        }
                        i8 = iM2761 ^ i2;
                        break;
                    case 1029222205:
                    case 1226634298:
                        c5817.post(runnable2);
                        break;
                    default:
                        C1783.m6232();
                        C0269.m1775();
                        break;
                }
                return;
            }
            iM2762 = (C0619.m2761("ۘۨ") + i4) * (-19);
            i6 = ((iM2762 ^ i5) * 26233) ^ 1349181419;
            i7 = -1033913497;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m17614(C6106 c6106) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1535849056;
        int i5 = C20932.f66974;
        int i6 = C0773.f2792;
        int iM3169 = C0773.m3169("᩸ۧ") ^ i6;
        int i7 = ((iM3169 ^ i5) * (-10359)) ^ 1629772462;
        int i8 = -1311556488;
        while (true) {
            i4 = ((((i4 ^ i5) * (-9941)) >> 31) & i7) ^ (iM3169 ^ i8);
            switch (i4) {
                case -2077369569:
                case -1759356575:
                    if (C2702.f8586 <= 0) {
                        iM3169 = (C0619.m2761("ۗۧ") + i5) * (-121);
                        i7 = ((iM3169 ^ i6) * (-1523)) ^ 604563254;
                        i8 = 527199937;
                    } else {
                        iM3169 = C0773.m3169("ۗܰ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-28917)) ^ 1167926290;
                        i8 = 1277633890;
                    }
                    break;
                case -1978695386:
                case -598188857:
                    C0619.m2763();
                    if (C2702.f8586 > 0) {
                        iM3169 = (C0773.m3169("ۡۢ") + i5) * (-127);
                        i7 = ((iM3169 ^ i6) * 1609) ^ 1946559360;
                        i8 = 912362353;
                    } else {
                        iM3169 = C0773.m3169("ۘۛ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 22829) ^ (-16227717);
                        i8 = 1354323747;
                    }
                    break;
                case -1774194997:
                case -1018265666:
                    i = c6106.f20846;
                    if (C2023.f6737) {
                        iM3169 = C0619.m2761("۟᩹") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-7925)) ^ (-1108380969);
                        i8 = 836558719;
                    } else {
                        iM3169 = C0773.m3169("ܽ۫") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-10943)) ^ 419986899;
                        i8 = -631047633;
                    }
                    break;
                case -1753747554:
                case -471010382:
                    if (C13473.m33144()) {
                        iM3169 = C0773.m3169("ۤܰ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 29605) ^ (-418951650);
                        i8 = -156008582;
                    } else {
                        iM3169 = (C0773.m3169("ۡۢ") + i5) * (-127);
                        i7 = ((iM3169 ^ i6) * 1609) ^ 1946559360;
                        i8 = 912362353;
                    }
                    break;
                case -1274326506:
                case -610151566:
                    AbstractC0641.m2813();
                    if (C2354.f7599 >= 0) {
                        iM3169 = C0773.m3169("ۘۛ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 22829) ^ (-16227717);
                        i8 = 1354323747;
                    } else {
                        iM3169 = C0619.m2761("۟᩹") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-7925)) ^ (-1108380969);
                        i8 = 836558719;
                    }
                    break;
                case -1124317990:
                case 221768329:
                    c6106.f20846 = i3;
                    if (C2375.m8065() > 0) {
                        C2834.m9339(new C23260(c6106, i3));
                    }
                    iM3169 = C0773.m3169("ۘۛ") ^ i6;
                    i7 = ((iM3169 ^ i5) * 22829) ^ (-16227717);
                    i8 = 1354323747;
                    break;
                case -560211179:
                case 1725186724:
                    i2 = 1;
                    if (C3099.f10023 <= 0) {
                        iM3169 = (C0619.m2761("ۗۧ") + i5) * (-121);
                        i7 = ((iM3169 ^ i6) * (-1523)) ^ 604563254;
                        i8 = 527199937;
                    } else {
                        iM3169 = C0773.m3169("ᩳ֫") ^ i5;
                        i7 = ((iM3169 ^ i6) * 18631) ^ 1150429165;
                        i8 = 176924532;
                    }
                    break;
                case -252725071:
                case 573043849:
                    C4282.m13644();
                    C17202.m40372();
                    iM3169 = C0619.m2761("۟᩹") ^ i6;
                    i7 = ((iM3169 ^ i5) * (-7925)) ^ (-1108380969);
                    i8 = 836558719;
                    break;
                case -221586584:
                case 541349481:
                    i3 = i + i2;
                    if (C3099.m10095()) {
                        iM3169 = (i6 - C0773.m3169("ۡ᩻")) * (-97);
                        i7 = ((iM3169 ^ i5) * 30277) ^ (-697237723);
                        i8 = 406887511;
                    } else {
                        iM3169 = (i5 - C0773.m3169("֨ۨ")) * 93;
                        i7 = ((iM3169 ^ i6) * (-17903)) ^ (-138548885);
                        i8 = 819914699;
                    }
                    break;
                case -174400809:
                case 1968436752:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = (C0619.m2761("ۗۧ") + i5) * (-121);
                        i7 = ((iM3169 ^ i6) * (-1523)) ^ 604563254;
                        i8 = 527199937;
                    } else {
                        iM3169 = C0619.m2761("۟᩹") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-7925)) ^ (-1108380969);
                        i8 = 836558719;
                    }
                    break;
                case 38776156:
                case 180467305:
                    if (C4238.f15451 >= 0) {
                        iM3169 = (i6 - C0773.m3169("ۡ᩻")) * (-97);
                        i7 = ((iM3169 ^ i5) * 30277) ^ (-697237723);
                        i8 = 406887511;
                    } else {
                        iM3169 = C0619.m2761("ܿܿ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-11761)) ^ 259702464;
                        i8 = 881679829;
                    }
                    break;
                case 677707944:
                case 1175700124:
                    if (C3690.f12684 <= 0) {
                        iM3169 = (C0773.m3169("ۡۢ") + i5) * (-127);
                        i7 = ((iM3169 ^ i6) * 1609) ^ 1946559360;
                        i8 = 912362353;
                    } else {
                        iM3169 = (i6 - C0619.m2761("᩹۫")) * 101;
                        i7 = ((iM3169 ^ i5) * (-29249)) ^ 1763648091;
                        i8 = 1374378167;
                    }
                    break;
                case 794006729:
                case 1128417452:
                    AbstractC0641.m2813();
                    break;
                case 1227900459:
                case 1726691038:
                    if (C1519.f5300 >= 0) {
                        iM3169 = (C0619.m2761("ۗۧ") + i5) * (-121);
                        i7 = ((iM3169 ^ i6) * (-1523)) ^ 604563254;
                        i8 = 527199937;
                    } else {
                        iM3169 = (C0619.m2761("ܰۡ") + i5) * 29;
                        i7 = ((iM3169 ^ i6) * (-12815)) ^ (-860577678);
                        i8 = -620555966;
                    }
                    break;
                default:
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0773.m3169("ۘۛ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 22829) ^ (-16227717);
                        i8 = 1354323747;
                    } else {
                        iM3169 = C0773.m3169("᩸ܶ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 6347) ^ (-651935510);
                        i8 = -437605239;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m17610(int i, C6106 c6106, Runnable runnable, boolean z) {
        int i2 = 525414695;
        int i3 = C0487.f2131;
        int i4 = C3099.f10023;
        int iM2761 = C0619.m2761("᩸ۡ") ^ i3;
        int i5 = ((iM2761 ^ i4) * (-30057)) ^ (-568617145);
        int i6 = -526315304;
        while (true) {
            i2 = ((((i2 ^ i4) * 30675) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -2145945812:
                case 1763449475:
                    c6106.f20845.scrollToPosition(0);
                    iM2761 = (C0773.m3169("ܿ᩹") + i3) * 127;
                    i5 = ((iM2761 ^ i4) * (-22155)) ^ (-651589480);
                    i6 = 1634657729;
                    break;
                case -2096389245:
                case 787552067:
                    C0269.m1775();
                    iM2761 = (i3 - C0619.m2761("ۛ᩹")) * 23;
                    i5 = ((iM2761 ^ i4) * 5659) ^ (-1879299837);
                    i6 = -177049855;
                    break;
                case -2077148577:
                case -137139031:
                    if (C2375.f7641 <= 0) {
                        iM2761 = (C0773.m3169("᩷ۤ") + i4) * (-73);
                        i5 = ((iM2761 ^ i3) * (-24047)) ^ (-1324741539);
                        i6 = -509890154;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ܺ᩻")) * 11;
                        i5 = ((iM2761 ^ i3) * 19093) ^ 1914873794;
                        i6 = -367878582;
                    }
                    break;
                case -1797619841:
                case -1061145841:
                    break;
                case -1700587451:
                case 772320434:
                    if (i != c6106.f20846) {
                        iM2761 = (C0773.m3169("ܿ᩹") + i3) * 127;
                        i5 = ((iM2761 ^ i4) * (-22155)) ^ (-651589480);
                        i6 = 1634657729;
                    } else {
                        iM2761 = (C0773.m3169("ۖ᩸") ^ i4) * (-67);
                        i5 = ((iM2761 ^ i3) * (-5689)) ^ 539133709;
                        i6 = 645655945;
                    }
                    break;
                case -1276292385:
                case 126102811:
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0773.m3169("᩷᩵") ^ i3;
                        i5 = ((iM2761 ^ i4) * 19761) ^ 1654425208;
                        i6 = 622346186;
                    } else {
                        iM2761 = (C0619.m2761("۬ۛ") + i4) * 71;
                        i5 = ((iM2761 ^ i3) * (-18595)) ^ (-1810452790);
                        i6 = -1620094155;
                    }
                    break;
                case -1211555801:
                case 1375119564:
                    if (C2702.f8586 <= 0) {
                        iM2761 = C0773.m3169("᩷᩵") ^ i3;
                        i5 = ((iM2761 ^ i4) * 19761) ^ 1654425208;
                        i6 = 622346186;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۨۧ")) * 61;
                        i5 = ((iM2761 ^ i4) * (-13523)) ^ 59596080;
                        i6 = -1581416789;
                    }
                    break;
                case -965504941:
                case -533743674:
                    if (C2287.m7745() <= 0) {
                        iM2761 = C0773.m3169("ۧۤ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-12169)) ^ (-2074998802);
                        i6 = -1781932693;
                    } else {
                        iM2761 = C0619.m2761("᩺ۧ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 18383) ^ (-1271980854);
                        i6 = 964349959;
                    }
                    break;
                case -845415632:
                case 1862032123:
                    C17202.m40372();
                    if (C2287.f7432 >= 0) {
                        iM2761 = C0773.m3169("᩷᩵") ^ i3;
                        i5 = ((iM2761 ^ i4) * 19761) ^ 1654425208;
                        i6 = 622346186;
                    } else {
                        iM2761 = (C0773.m3169("᩷ۤ") + i4) * (-73);
                        i5 = ((iM2761 ^ i3) * (-24047)) ^ (-1324741539);
                        i6 = -509890154;
                    }
                    break;
                case -773973415:
                case 880032094:
                    if (C3448.m11248() != 0) {
                        iM2761 = C0773.m3169("᩷᩵") ^ i3;
                        i5 = ((iM2761 ^ i4) * 19761) ^ 1654425208;
                        i6 = 622346186;
                    } else {
                        iM2761 = C0619.m2761("ܿܳ") ^ i4;
                        i5 = ((iM2761 ^ i3) * 4565) ^ 1918164540;
                        i6 = 877517584;
                    }
                    break;
                case -548295828:
                case -49639782:
                    if (C4282.f15546 <= 0) {
                        iM2761 = C0773.m3169("᩷᩵") ^ i3;
                        i5 = ((iM2761 ^ i4) * 19761) ^ 1654425208;
                        i6 = 622346186;
                    } else {
                        iM2761 = (C0773.m3169("ۙܿ") + i3) * (-83);
                        i5 = ((iM2761 ^ i4) * (-25543)) ^ (-944171644);
                        i6 = -703359975;
                    }
                    break;
                case -295336617:
                case 1713572260:
                    C2287.m7745();
                    C0487.m2356();
                    break;
                case -166039218:
                case 750979442:
                    if (C3998.f13671 != 0) {
                        iM2761 = C0773.m3169("ۧۤ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-12169)) ^ (-2074998802);
                        i6 = -1781932693;
                    } else {
                        iM2761 = (C0773.m3169("ᩴ᩵") ^ i4) * (-75);
                        i5 = ((iM2761 ^ i3) * 5845) ^ 1208604273;
                        i6 = -585445527;
                    }
                    break;
                case -67048480:
                case 1823629089:
                    C1321.m4852();
                    if (C3448.f11240 < 0) {
                        iM2761 = (C0773.m3169("᩷ۤ") + i4) * (-73);
                        i5 = ((iM2761 ^ i3) * (-24047)) ^ (-1324741539);
                        i6 = -509890154;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۛ᩹")) * 23;
                        i5 = ((iM2761 ^ i4) * 5659) ^ (-1879299837);
                        i6 = -177049855;
                    }
                    break;
                case 124452819:
                case 1517775941:
                    if (C3099.f10023 <= 0) {
                        iM2761 = (i3 - C0619.m2761("ۛ᩹")) * 23;
                        i5 = ((iM2761 ^ i4) * 5659) ^ (-1879299837);
                        i6 = -177049855;
                    } else {
                        iM2761 = C0619.m2761("ܽۚ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-27561)) ^ 486048142;
                        i6 = 161789303;
                    }
                    break;
                case 563388029:
                case 1161182692:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = (i3 - C0619.m2761("ۛ᩹")) * 23;
                        i5 = ((iM2761 ^ i4) * 5659) ^ (-1879299837);
                        i6 = -177049855;
                    } else {
                        iM2761 = (C0773.m3169("ᩴۖ") ^ i3) * (-3);
                        i5 = ((iM2761 ^ i4) * 16785) ^ (-979390398);
                        i6 = -471864745;
                    }
                    break;
                case 790761964:
                case 1814021698:
                    if (C1564.f5401 <= 0) {
                        iM2761 = C0773.m3169("ۧۤ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-12169)) ^ (-2074998802);
                        i6 = -1781932693;
                    } else {
                        iM2761 = C0619.m2761("᩹ܳ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 27493) ^ 355081448;
                        i6 = 1001485744;
                    }
                    break;
                case 845821452:
                case 1586396980:
                    if (C4282.m13644()) {
                        iM2761 = C0773.m3169("ᩳۜ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 30123) ^ 673685212;
                        i6 = 2076189424;
                    } else {
                        iM2761 = (C0773.m3169("᩷ۤ") + i4) * (-73);
                        i5 = ((iM2761 ^ i3) * (-24047)) ^ (-1324741539);
                        i6 = -509890154;
                    }
                    break;
                default:
                    C2023.m6957(runnable);
                    RunnableC1848.m6368(c6106.f20848);
                    if (z) {
                        iM2761 = C0773.m3169("ۧܿ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-5939)) ^ (-414205631);
                        i6 = 827211069;
                    } else {
                        iM2761 = (C0773.m3169("ܿ᩹") + i3) * 127;
                        i5 = ((iM2761 ^ i4) * (-22155)) ^ (-651589480);
                        i6 = 1634657729;
                    }
                    break;
            }
            return;
        }
    }
}
