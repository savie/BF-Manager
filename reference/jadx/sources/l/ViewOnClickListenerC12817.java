package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plugin.api.PluginContext;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۫ۗ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D2S2 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC12817 extends AbstractC11800 implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    /* JADX INFO: renamed from: ۘܶۜ, reason: not valid java name and contains not printable characters */
    private static final short[] f41051 = {2891, 19458, -22858, 24268, -26617, -25442, -27966, 24376, 23558, -19463, 19631, -27088, 16653, -18679, -18184, -20063, 5887, -24641, 17645, -23293, 3676, -21772, 31624, -22502, 20899, -16561, -22407, 22255, 29047, -19160, 16892, -20522, -22904, -17175, 18303, -23696, -19222, 23753, -23149, 17971, 31710, -18159, -22264, 18596, 21129, 29385, 17056, 17650, 5508, -9434, -12061, 10095, 5874, -14218, -15210, 22755, 22764, 22761, 22752, 22774, -13752, 2978, 14016, -15914, -13622, 2189, 2605, -5638, -1591, -12446, -12389, 966, -1900, -15840, 286, -13296};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C18300 f41052;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C1255 f41053;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5360 f41054;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ImageView f41055;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public TextView f41056;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public TextView f41057;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f41058;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31778(final ViewOnClickListenerC12817 viewOnClickListenerC12817, final DialogInterfaceC8327 dialogInterfaceC8327, View view) {
        int i;
        int i2;
        int iM2761;
        int i3;
        MenuItem menuItem;
        short s;
        short[] sArr;
        int i4;
        int i5;
        short[] sArr2;
        int i6;
        int iM3169;
        int i7;
        int i8;
        int iM31610;
        int i9;
        int i10;
        AbstractC22044 abstractC22044;
        int iM31611;
        int i11;
        int i12;
        int iM2762;
        int i13;
        int i14;
        int i15 = 1758817628;
        int i16 = C1564.f5401;
        int i17 = C2375.f7641;
        int iM31612 = (C0773.m3169("ܳۜ") + i17) * 83;
        int i18 = ((iM31612 ^ i16) * (-23107)) ^ (-1721094406);
        int i19 = iM31612 ^ 72289249;
        AbstractC22044 abstractC22044M52727 = null;
        AbstractC22044 abstractC22044M7806 = null;
        String strM5399 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        C18452 c18452 = null;
        boolean z = false;
        boolean zIsEmpty = false;
        int i20 = 0;
        int i21 = 0;
        int iM2763 = 0;
        int i22 = 0;
        int iM31613 = 0;
        int i23 = 0;
        int iM2764 = 0;
        short s2 = 0;
        int i24 = 0;
        C18300 c18300 = null;
        String strM1784 = null;
        int i25 = 0;
        MenuItem menuItem2 = null;
        C9898 c9898M42995 = null;
        while (true) {
            boolean z2 = false;
            while (true) {
                i15 = i19 ^ (i18 & (((i15 ^ i16) * 8375) >> 31));
                switch (i15) {
                    case -2136646841:
                    case -1985908704:
                        menuItem2 = menuItem2;
                        sArr4 = sArr4;
                        i24 = i24;
                        iM31613 = C0773.m3169(C3998.m12925(sArr4, i24, 3, i20));
                        i23 = 2129470988;
                        if (C0269.m1775() <= 0) {
                            iM2761 = C0773.m3169("ܶ۬") ^ i16;
                            i = ((iM2761 ^ i17) * (-12911)) ^ (-99400143);
                            i3 = 777139835;
                        } else {
                            iM2761 = C0619.m2761("ۛ֨") ^ i17;
                            i = ((iM2761 ^ i16) * 20133) ^ (-1177668044);
                            i3 = 1781929543;
                        }
                        i2 = iM2761 ^ i3;
                        sArr4 = sArr4;
                        i24 = i24;
                        menuItem2 = menuItem2;
                        boolean z3 = z2;
                        i19 = i2;
                        i18 = i;
                        z2 = z3 ? 1 : 0;
                        break;
                    case -2125723735:
                    case 6014837:
                        z2 = z2 ? 1 : 0;
                        menuItem2 = menuItem2;
                        sArr2 = sArr4;
                        i6 = i24;
                        s2 = sArr3[48];
                        if (C0862.f3233 == 0) {
                            int iM31614 = C0773.m3169("ۡۢ") ^ i17;
                            i18 = ((iM31614 ^ i16) * 18709) ^ 1138670640;
                            i5 = iM31614 ^ 410146777;
                            sArr4 = sArr2;
                            i24 = i6;
                            menuItem2 = menuItem2;
                            z2 = z2;
                            i19 = i5;
                            viewOnClickListenerC12817 = viewOnClickListenerC12817;
                        } else {
                            sArr4 = sArr2;
                            i24 = i6;
                            int iM2765 = C0619.m2761("᩸ܶ") ^ i17;
                            i18 = ((iM2765 ^ i16) * (-21531)) ^ (-595031369);
                            i5 = iM2765 ^ 1866070003;
                            menuItem2 = menuItem2;
                            z2 = z2;
                            i19 = i5;
                            viewOnClickListenerC12817 = viewOnClickListenerC12817;
                        }
                        break;
                    case -1976513963:
                    case 775597837:
                        menuItem = menuItem2;
                        int iM2766 = C0619.m2761(strM5399) ^ 2099486615;
                        C0950.m3793(c9898M42995, z2 ? 1 : 0, iM2766, z2 ? 1 : 0, iM2766);
                        iM31610 = (i16 - C0773.m3169("ۚۨ")) * 97;
                        i9 = ((iM31610 ^ i17) * 22167) ^ (-1437407913);
                        i10 = 1200234997;
                        i19 = iM31610 ^ i10;
                        i18 = i9;
                        menuItem2 = menuItem;
                        break;
                    case -1751671687:
                    case -1262776199:
                        i20 = 10581;
                        int iM31615 = C0773.m3169("֡֫") ^ i16;
                        i = ((iM31615 ^ i17) * 30029) ^ (-828302757);
                        i2 = iM31615 ^ (-1907648090);
                        viewOnClickListenerC12817 = viewOnClickListenerC12817;
                        sArr4 = sArr4;
                        i24 = i24;
                        menuItem2 = menuItem2;
                        boolean z4 = z2;
                        i19 = i2;
                        i18 = i;
                        z2 = z4 ? 1 : 0;
                        break;
                    case -1302240545:
                    case -915432207:
                        AbstractC3624.m11755();
                        if (C2485.f7950 != 0) {
                            z2 = z2 ? 1 : 0;
                            menuItem2 = menuItem2;
                            int iM2767 = C0619.m2761("᩸ܶ") ^ i17;
                            i18 = ((iM2767 ^ i16) * (-21531)) ^ (-595031369);
                            i5 = iM2767 ^ 1866070003;
                            menuItem2 = menuItem2;
                            z2 = z2;
                            i19 = i5;
                            viewOnClickListenerC12817 = viewOnClickListenerC12817;
                        } else {
                            menuItem2 = menuItem2;
                            sArr4 = sArr4;
                            i24 = i24;
                            iM2761 = C0773.m3169("ܶ۬") ^ i16;
                            i = ((iM2761 ^ i17) * (-12911)) ^ (-99400143);
                            i3 = 777139835;
                            i2 = iM2761 ^ i3;
                            sArr4 = sArr4;
                            i24 = i24;
                            menuItem2 = menuItem2;
                            boolean z5 = z2;
                            i19 = i2;
                            i18 = i;
                            z2 = z5 ? 1 : 0;
                        }
                        break;
                    case -1171338889:
                    case -915653256:
                        int i26 = iM2763 ^ i22;
                        C4238.m13541(c9898M42995, z2 ? 1 : 0, i26, z2 ? 1 : 0, i26);
                        c18452.m42994(new InterfaceC21436(viewOnClickListenerC12817) { // from class: l.᩸ۗ֫

                            /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
                            public final /* synthetic */ ViewOnClickListenerC12817 f72827;

                            @Override // l.InterfaceC21436
                            public final boolean onMenuItemClick(MenuItem menuItem3) {
                                ViewOnClickListenerC12817 viewOnClickListenerC12818 = null;
                                int i27 = 376780800;
                                int i28 = C23916.f77426;
                                int i29 = RunnableC3055.f9898;
                                int iM31616 = (C0773.m3169("ܺܽ") ^ i28) * 65;
                                int i30 = ((iM31616 ^ i29) * (-28609)) ^ (-659080743);
                                int i31 = -538607090;
                                while (true) {
                                    i27 = ((((i27 ^ i29) * (-18213)) >> 31) & i30) ^ (iM31616 ^ i31);
                                    switch (i27) {
                                        case -1733966849:
                                        case -518840616:
                                            ViewOnClickListenerC12817.m31777(viewOnClickListenerC12818, dialogInterfaceC8327, menuItem3);
                                            return true;
                                        case -1682824175:
                                        case 1967454317:
                                            C2878.m9491();
                                            C2702.m8876();
                                            iM31616 = C0619.m2761("ۜۧ") ^ i28;
                                            i30 = ((iM31616 ^ i29) * (-2559)) ^ (-246356915);
                                            i31 = 762248310;
                                            break;
                                        case -1494469308:
                                        case 1161792835:
                                            if (RunnableC0334.f1808 <= 0) {
                                                iM31616 = C0619.m2761("ۜۧ") ^ i28;
                                                i30 = ((iM31616 ^ i29) * (-2559)) ^ (-246356915);
                                                i31 = 762248310;
                                            } else {
                                                iM31616 = (C0619.m2761("֡֡") + i28) * 53;
                                                i30 = ((iM31616 ^ i29) * (-1671)) ^ 112020996;
                                                i31 = -1872636850;
                                            }
                                            break;
                                        case -1470318751:
                                        case 1845181371:
                                            if (C4238.f15451 >= 0) {
                                                iM31616 = C0619.m2761("ܰ۟") ^ i29;
                                                i30 = ((iM31616 ^ i28) * (-28329)) ^ 999199249;
                                                i31 = -447637837;
                                            } else {
                                                iM31616 = (i29 - C0619.m2761("ܺ֨")) * 9;
                                                i30 = ((iM31616 ^ i28) * (-1421)) ^ (-1384880073);
                                                i31 = 2143497669;
                                            }
                                            break;
                                        case -1216664123:
                                        case -717344755:
                                            if (C0950.m3785() == 0) {
                                                iM31616 = (i29 - C0619.m2761("ۛ֨")) * 41;
                                                i30 = ((iM31616 ^ i28) * 24971) ^ 341613007;
                                                i31 = 197413506;
                                            } else {
                                                iM31616 = C0619.m2761("ۜۧ") ^ i28;
                                                i30 = ((iM31616 ^ i29) * (-2559)) ^ (-246356915);
                                                i31 = 762248310;
                                            }
                                            break;
                                        case -840442294:
                                        case 758873649:
                                            if (C2419.f7754 >= 0) {
                                                iM31616 = (C0619.m2761("ۡ᩸") + i28) * 11;
                                                i30 = ((iM31616 ^ i29) * (-14057)) ^ (-609031549);
                                                i31 = -1772850363;
                                            } else {
                                                iM31616 = (C0773.m3169("ܽۧ") + i28) * 27;
                                                i30 = ((iM31616 ^ i29) * (-8583)) ^ (-929597474);
                                                i31 = -1639021887;
                                            }
                                            break;
                                        case -121010323:
                                        case 741697563:
                                            if (RunnableC3646.f12471) {
                                                iM31616 = C0773.m3169("֡᩻") ^ i29;
                                                i30 = ((iM31616 ^ i28) * 1739) ^ (-715270608);
                                                i31 = 1567036091;
                                            } else {
                                                iM31616 = C0773.m3169("ۗۨ") ^ i28;
                                                i30 = ((iM31616 ^ i29) * 26659) ^ 591165828;
                                                i31 = 1541573573;
                                            }
                                            break;
                                        case -1338505:
                                        case 1563014456:
                                            if (C17202.f56030) {
                                                iM31616 = (C0773.m3169("᩺᩷") ^ i28) * 91;
                                                i30 = ((iM31616 ^ i29) * 26713) ^ 257831358;
                                                i31 = 541978243;
                                            } else {
                                                iM31616 = C0619.m2761("ۜۧ") ^ i28;
                                                i30 = ((iM31616 ^ i29) * (-2559)) ^ (-246356915);
                                                i31 = 762248310;
                                            }
                                            break;
                                        case 256738456:
                                        case 1845326514:
                                            C2702.m8876();
                                            if (!C3077.f9998) {
                                                iM31616 = (i29 - C0619.m2761("ۛ֨")) * 41;
                                                i30 = ((iM31616 ^ i28) * 24971) ^ 341613007;
                                                i31 = 197413506;
                                            } else {
                                                iM31616 = (C0619.m2761("ۡ᩸") + i28) * 11;
                                                i30 = ((iM31616 ^ i29) * (-14057)) ^ (-609031549);
                                                i31 = -1772850363;
                                            }
                                            break;
                                        case 295343882:
                                        case 1907840948:
                                            if (C3448.f11240 >= 0) {
                                                iM31616 = C0773.m3169("֡᩻") ^ i29;
                                                i30 = ((iM31616 ^ i28) * 1739) ^ (-715270608);
                                                i31 = 1567036091;
                                            } else {
                                                iM31616 = C0619.m2761("ۜۧ") ^ i28;
                                                i30 = ((iM31616 ^ i29) * (-2559)) ^ (-246356915);
                                                i31 = 762248310;
                                            }
                                            break;
                                        case 303192598:
                                        case 1490158865:
                                            if (C17202.f56030) {
                                                iM31616 = C0773.m3169("ܺۚ") ^ i29;
                                                i30 = ((iM31616 ^ i28) * (-26901)) ^ 881358640;
                                                i31 = -1331634441;
                                            } else {
                                                iM31616 = C0619.m2761("ܰ۟") ^ i29;
                                                i30 = ((iM31616 ^ i28) * (-28329)) ^ 999199249;
                                                i31 = -447637837;
                                            }
                                            break;
                                        case 395146347:
                                        case 819860927:
                                            C0950.m3785();
                                            C3998.m12920();
                                            return false;
                                        case 474475055:
                                        case 1627456162:
                                            if (C3099.f10023 <= 0) {
                                                iM31616 = C0619.m2761("ۜۧ") ^ i28;
                                                i30 = ((iM31616 ^ i29) * (-2559)) ^ (-246356915);
                                                i31 = 762248310;
                                            } else {
                                                iM31616 = C0619.m2761("ۢ᩸") ^ i29;
                                                i30 = ((iM31616 ^ i28) * (-30815)) ^ (-1029448305);
                                                i31 = -991403742;
                                            }
                                            break;
                                        case 703112891:
                                        case 787773808:
                                            if (AbstractC3624.f12429 <= 0) {
                                                iM31616 = (i29 - C0619.m2761("ۛ֨")) * 41;
                                                i30 = ((iM31616 ^ i28) * 24971) ^ 341613007;
                                                i31 = 197413506;
                                            } else {
                                                iM31616 = C0619.m2761("ᩴۛ") ^ i28;
                                                i30 = ((iM31616 ^ i29) * 10843) ^ (-249500656);
                                                i31 = 1647471712;
                                            }
                                            break;
                                        case 1185872005:
                                        case 1522323347:
                                            if (RunnableC3646.f12471) {
                                                iM31616 = C0619.m2761("ܰ۟") ^ i29;
                                                i30 = ((iM31616 ^ i28) * (-28329)) ^ 999199249;
                                                i31 = -447637837;
                                            } else {
                                                iM31616 = (i29 - C0773.m3169("ܳܰ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                i30 = ((iM31616 ^ i28) * 31669) ^ 1972641090;
                                                i31 = -93475241;
                                            }
                                            break;
                                        default:
                                            viewOnClickListenerC12818 = this.f72827;
                                            if (C3492.f12043 <= 0) {
                                                iM31616 = C0619.m2761("ܰ۟") ^ i29;
                                                i30 = ((iM31616 ^ i28) * (-28329)) ^ 999199249;
                                                i31 = -447637837;
                                            } else {
                                                iM31616 = (C0773.m3169("۟᩹") ^ i29) * 65;
                                                i30 = ((iM31616 ^ i28) * (-12377)) ^ 236028287;
                                                i31 = -1875818842;
                                            }
                                            break;
                                    }
                                }
                            }

                            {
                                int i27 = 1978526701;
                                int i28 = C23916.f77426;
                                int i29 = C3690.f12684;
                                int iM2768 = (C0619.m2761("۠۬") ^ i29) * (-41);
                                int i30 = ((iM2768 ^ i28) * 3463) ^ 1341277990;
                                int i31 = 448598580;
                                while (true) {
                                    i27 = ((((i27 ^ i28) * 30839) >> 31) & i30) ^ (iM2768 ^ i31);
                                    switch (i27) {
                                        case -1900698098:
                                        case -812286084:
                                            C3077.m10041();
                                            throw new RuntimeException();
                                        case -1800792808:
                                        case 637820702:
                                            if (C2834.m9344() < 0) {
                                                iM2768 = (i28 - C0619.m2761("ܽᩳ")) * (-15);
                                                i30 = ((iM2768 ^ i29) * (-7745)) ^ 1995626503;
                                                i31 = -1228760411;
                                            } else {
                                                iM2768 = C0773.m3169("ۚܶ") ^ i28;
                                                i30 = ((iM2768 ^ i29) * 29129) ^ (-617269432);
                                                i31 = -1269420540;
                                            }
                                            break;
                                        case -1701380315:
                                        case 1673953873:
                                            if (C4238.m13540() <= 0) {
                                                iM2768 = C0773.m3169("ۚܶ") ^ i28;
                                                i30 = ((iM2768 ^ i29) * 29129) ^ (-617269432);
                                                i31 = -1269420540;
                                            } else {
                                                iM2768 = (C0619.m2761("᩹ܺ") ^ i28) * 77;
                                                i30 = ((iM2768 ^ i29) * (-23493)) ^ (-1102658027);
                                                i31 = -1624763582;
                                            }
                                            break;
                                        case -1661640275:
                                        case -1562820731:
                                            C2419.m8174();
                                            C1080.m4050();
                                            iM2768 = C0773.m3169("ۚܶ") ^ i28;
                                            i30 = ((iM2768 ^ i29) * 29129) ^ (-617269432);
                                            i31 = -1269420540;
                                            break;
                                        case -1573509219:
                                        case 1390665997:
                                            return;
                                        case -1351025198:
                                        case -30461676:
                                            if (C2419.f7754 >= 0) {
                                                iM2768 = (i29 - C0619.m2761("ۧۗ")) * 29;
                                                i30 = ((iM2768 ^ i28) * 10497) ^ (-1742035008);
                                                i31 = 124861262;
                                            } else {
                                                iM2768 = (i29 - C0773.m3169("۬ۚ")) * 69;
                                                i30 = ((iM2768 ^ i28) * 8423) ^ 1711273636;
                                                i31 = -1514729161;
                                            }
                                            break;
                                        case -1079863899:
                                        case 446819141:
                                            if (C1519.f5300 >= 0) {
                                                iM2768 = (C0773.m3169("ܰ᩷") ^ i29) * 29;
                                                i30 = ((iM2768 ^ i28) * (-12725)) ^ (-1105290441);
                                                i31 = -2092768274;
                                            } else {
                                                iM2768 = (C0619.m2761("᩹ۖ") ^ i28) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                                i30 = ((iM2768 ^ i29) * 20885) ^ (-132335097);
                                                i31 = -10988768;
                                            }
                                            break;
                                        case -568694103:
                                        case -336490261:
                                            if (C0269.f1558 <= 0) {
                                                iM2768 = (C0773.m3169("ܰ᩷") ^ i29) * 29;
                                                i30 = ((iM2768 ^ i28) * (-12725)) ^ (-1105290441);
                                                i31 = -2092768274;
                                            } else {
                                                iM2768 = C0773.m3169("ۨᩴ") ^ i28;
                                                i30 = ((iM2768 ^ i29) * (-3047)) ^ (-1669460443);
                                                i31 = 638672968;
                                            }
                                            break;
                                        case -377898343:
                                        case 1569712931:
                                            if (C2288.f7433 <= 0) {
                                                iM2768 = C0773.m3169("ۚܶ") ^ i28;
                                                i30 = ((iM2768 ^ i29) * 29129) ^ (-617269432);
                                                i31 = -1269420540;
                                            } else {
                                                iM2768 = (i29 - C0773.m3169("ۗ۟")) * 71;
                                                i30 = ((iM2768 ^ i28) * (-25951)) ^ (-1625311780);
                                                i31 = -1630798941;
                                            }
                                            break;
                                        case -263791744:
                                        case 1132043592:
                                            this.f72827 = viewOnClickListenerC12817;
                                            if (C3448.m11248() != 0) {
                                                iM2768 = (C0773.m3169("ܰ᩷") ^ i29) * 29;
                                                i30 = ((iM2768 ^ i28) * (-12725)) ^ (-1105290441);
                                                i31 = -2092768274;
                                            } else {
                                                iM2768 = (C0619.m2761("ܶᩳ") ^ i29) * 19;
                                                i30 = ((iM2768 ^ i28) * (-25403)) ^ 690767988;
                                                i31 = -438038870;
                                            }
                                            break;
                                        case -227523034:
                                        case 1179809709:
                                            C1519.m5403();
                                            if (C0862.f3233 != 0) {
                                                iM2768 = (C0773.m3169("ܰ᩷") ^ i29) * 29;
                                                i30 = ((iM2768 ^ i28) * (-12725)) ^ (-1105290441);
                                                i31 = -2092768274;
                                            } else {
                                                iM2768 = C0773.m3169("ۚܶ") ^ i28;
                                                i30 = ((iM2768 ^ i29) * 29129) ^ (-617269432);
                                                i31 = -1269420540;
                                            }
                                            break;
                                        case 461678749:
                                        case 485671762:
                                            if (C3099.f10023 <= 0) {
                                                iM2768 = (i28 - C0619.m2761("ܽᩳ")) * (-15);
                                                i30 = ((iM2768 ^ i29) * (-7745)) ^ 1995626503;
                                                i31 = -1228760411;
                                            } else {
                                                iM2768 = (C0773.m3169("֡ۚ") ^ i29) * (-83);
                                                i30 = ((iM2768 ^ i28) * (-25743)) ^ (-2086103677);
                                                i31 = 692405280;
                                            }
                                            break;
                                        case 733529090:
                                        case 981358181:
                                            if (C1783.m6232()) {
                                                iM2768 = (C0773.m3169("ܰ᩷") ^ i29) * 29;
                                                i30 = ((iM2768 ^ i28) * (-12725)) ^ (-1105290441);
                                                i31 = -2092768274;
                                            } else {
                                                iM2768 = C0619.m2761("ܽ᩸") ^ i29;
                                                i30 = ((iM2768 ^ i28) * 17817) ^ 1217188462;
                                                i31 = 2023869462;
                                            }
                                            break;
                                        case 1240644877:
                                        case 2138870988:
                                            if (C1146.f4234 >= 0) {
                                                iM2768 = (C0773.m3169("ܰ᩷") ^ i29) * 29;
                                                i30 = ((iM2768 ^ i28) * (-12725)) ^ (-1105290441);
                                                i31 = -2092768274;
                                            } else {
                                                iM2768 = C0773.m3169("ᩴۧ") ^ i28;
                                                i30 = ((iM2768 ^ i29) * 1789) ^ (-2138122363);
                                                i31 = -1602841024;
                                            }
                                            break;
                                        case 1326605741:
                                        case 2011829851:
                                            if (C13473.m33144()) {
                                                iM2768 = (i28 - C0773.m3169("᩵ۘ")) * (-119);
                                                i30 = ((iM2768 ^ i29) * 541) ^ 109034041;
                                                i31 = 246181497;
                                            } else {
                                                iM2768 = (i28 - C0619.m2761("ܽᩳ")) * (-15);
                                                i30 = ((iM2768 ^ i29) * (-7745)) ^ 1995626503;
                                                i31 = -1228760411;
                                            }
                                            break;
                                        default:
                                            if (C1080.f3865 >= 0) {
                                                iM2768 = (i29 - C0619.m2761("ۧۗ")) * 29;
                                                i30 = ((iM2768 ^ i28) * 10497) ^ (-1742035008);
                                                i31 = 124861262;
                                            } else {
                                                iM2768 = (C0619.m2761("ܺۘ") ^ i29) * 69;
                                                i30 = ((iM2768 ^ i28) * (-21857)) ^ 1826230234;
                                                i31 = -1440490219;
                                            }
                                            break;
                                    }
                                }
                            }
                        });
                        c18452.mo21878();
                        break;
                    case -1164592244:
                    case -880001570:
                        menuItem = menuItem2;
                        iM2763 = C0619.m2761(C1783.m6233(f41051, 63, 3, i20));
                        i22 = 2101580891;
                        if (C20932.f66974 > 0) {
                            iM31610 = (C0773.m3169("ܺ᩻") ^ i16) * 7;
                            i9 = ((iM31610 ^ i17) * (-12741)) ^ (-1915622158);
                            i10 = -535857367;
                            i19 = iM31610 ^ i10;
                            i18 = i9;
                            menuItem2 = menuItem;
                        } else {
                            s = s2;
                            sArr = sArr4;
                            i4 = i24;
                            int iM2768 = C0619.m2761("᩵ᩴ") ^ i16;
                            short s3 = s;
                            i18 = ((iM2768 ^ i17) * (-10089)) ^ (-1736052962);
                            i19 = iM2768 ^ 1683793196;
                            viewOnClickListenerC12817 = viewOnClickListenerC12817;
                            sArr4 = sArr;
                            i24 = i4;
                            menuItem2 = menuItem;
                            s2 = s3;
                        }
                        break;
                    case -1086052363:
                    case 851574455:
                        C3690.m11992(menuItem2, z2);
                        menuItem = menuItem2;
                        iM31610 = C0773.m3169("۠ۜ") ^ i17;
                        i9 = ((iM31610 ^ i16) * 12805) ^ (-630229668);
                        i10 = -833883127;
                        i19 = iM31610 ^ i10;
                        i18 = i9;
                        menuItem2 = menuItem;
                        break;
                    case -1041740045:
                    case 1422209470:
                        C2287.m7745();
                        C2023.m6964();
                        break;
                    case -1041417160:
                    case 1143410616:
                        if (C3690.f12684 > 0) {
                            menuItem = menuItem2;
                            s = s2;
                            sArr = sArr4;
                            i4 = i24;
                            int iM2769 = C0619.m2761("᩵ᩴ") ^ i16;
                            short s4 = s;
                            i18 = ((iM2769 ^ i17) * (-10089)) ^ (-1736052962);
                            i19 = iM2769 ^ 1683793196;
                            viewOnClickListenerC12817 = viewOnClickListenerC12817;
                            sArr4 = sArr;
                            i24 = i4;
                            menuItem2 = menuItem;
                            s2 = s4;
                        } else {
                            z2 = z2 ? 1 : 0;
                            menuItem2 = menuItem2;
                            int iM27610 = C0619.m2761("᩸ܶ") ^ i17;
                            i18 = ((iM27610 ^ i16) * (-21531)) ^ (-595031369);
                            i5 = iM27610 ^ 1866070003;
                            menuItem2 = menuItem2;
                            z2 = z2;
                            i19 = i5;
                            viewOnClickListenerC12817 = viewOnClickListenerC12817;
                        }
                        break;
                    case -1001560650:
                    case 1349668162:
                        menuItem = menuItem2;
                        abstractC22044 = abstractC22044M52727;
                        abstractC22044M7806 = C2310.m7806(abstractC22044, C3492.m11486(sArr5, i21, i25, i20));
                        z = true;
                        if (C3998.m12930(abstractC22044M7806)) {
                            iM31611 = (C0773.m3169("۠ۧ") ^ i17) * (-39);
                            i11 = ((iM31611 ^ i16) * 17785) ^ 632058765;
                            i12 = 1246987083;
                        } else {
                            iM31611 = (C0619.m2761("ܽۢ") + i16) * 85;
                            i11 = ((iM31611 ^ i17) * (-1325)) ^ 1738533151;
                            i12 = -477980869;
                        }
                        i19 = iM31611 ^ i12;
                        abstractC22044M52727 = abstractC22044;
                        i18 = i11;
                        menuItem2 = menuItem;
                        break;
                    case -620266681:
                    case 467949620:
                        C1146.m4231();
                        menuItem2 = menuItem2;
                        sArr4 = sArr4;
                        i24 = i24;
                        iM2761 = C0773.m3169("ܶ۬") ^ i16;
                        i = ((iM2761 ^ i17) * (-12911)) ^ (-99400143);
                        i3 = 777139835;
                        i2 = iM2761 ^ i3;
                        sArr4 = sArr4;
                        i24 = i24;
                        menuItem2 = menuItem2;
                        boolean z6 = z2;
                        i19 = i2;
                        i18 = i;
                        z2 = z6 ? 1 : 0;
                        break;
                    case -532958265:
                    case 72397116:
                        Object[] objArr = z2 ? 1 : 0;
                        menuItem = menuItem2;
                        s = s2;
                        sArr = sArr4;
                        i4 = i24;
                        sArr3 = f41051;
                        if (C1519.f5300 < 0) {
                            int iM27611 = C0619.m2761("ܰۙ") ^ i16;
                            i18 = ((iM27611 ^ i17) * (-8993)) ^ (-1731126559);
                            i5 = iM27611 ^ (-69532749);
                            sArr4 = sArr;
                            i24 = i4;
                            menuItem2 = menuItem;
                            z2 = objArr == true ? 1 : 0;
                            s2 = s;
                            i19 = i5;
                            viewOnClickListenerC12817 = viewOnClickListenerC12817;
                        } else {
                            z2 = objArr == true ? 1 : 0;
                            int iM27612 = C0619.m2761("᩵ᩴ") ^ i16;
                            short s5 = s;
                            i18 = ((iM27612 ^ i17) * (-10089)) ^ (-1736052962);
                            i19 = iM27612 ^ 1683793196;
                            viewOnClickListenerC12817 = viewOnClickListenerC12817;
                            sArr4 = sArr;
                            i24 = i4;
                            menuItem2 = menuItem;
                            s2 = s5;
                        }
                        break;
                    case -327367052:
                    case 484825906:
                        AbstractC22044 abstractC22045 = abstractC22044M52727;
                        int i27 = iM2764 ^ 2116728758;
                        MenuItem menuItemM3793 = C0950.m3793(c9898M42995, z2 ? 1 : 0, i27, z2 ? 1 : 0, i27);
                        C18300 c18301 = viewOnClickListenerC12817.f41052;
                        if (C2310.f7472 >= 0) {
                            abstractC22044M52727 = abstractC22045;
                            c18300 = c18301;
                            menuItem2 = menuItemM3793;
                            iM2762 = C0619.m2761("᩹֨") ^ i16;
                            i13 = ((iM2762 ^ i17) * (-16131)) ^ 239429105;
                            i14 = -1149638716;
                            i19 = iM2762 ^ i14;
                            i18 = i13;
                        } else {
                            int iM27613 = (C0619.m2761("ۤۛ") ^ i17) * (-35);
                            i18 = ((iM27613 ^ i16) * 13729) ^ 1815514862;
                            i19 = iM27613 ^ 402705030;
                            c18300 = c18301;
                            abstractC22044M52727 = abstractC22045;
                            menuItem2 = menuItemM3793;
                        }
                        break;
                    case -186856385:
                    case 1001874948:
                        menuItem = menuItem2;
                        sArr = sArr4;
                        i4 = i24;
                        z2 = false;
                        c18452 = new C18452(viewOnClickListenerC12817.f41054.f18798, view, 0);
                        if (C2834.m9344() >= 0) {
                            s = s2;
                            int iM27614 = C0619.m2761("᩵ᩴ") ^ i16;
                            short s6 = s;
                            i18 = ((iM27614 ^ i17) * (-10089)) ^ (-1736052962);
                            i19 = iM27614 ^ 1683793196;
                            viewOnClickListenerC12817 = viewOnClickListenerC12817;
                            sArr4 = sArr;
                            i24 = i4;
                            menuItem2 = menuItem;
                            s2 = s6;
                        }
                        break;
                    case -178314450:
                    case 1006785547:
                        z2 = z2 ? 1 : 0;
                        menuItem2 = menuItem2;
                        c9898M42995 = c18452.m42995();
                        sArr4 = f41051;
                        i24 = 49;
                        if (!C17202.f56030) {
                            int iM27615 = C0619.m2761("᩸ܶ") ^ i17;
                            i18 = ((iM27615 ^ i16) * (-21531)) ^ (-595031369);
                            i5 = iM27615 ^ 1866070003;
                            menuItem2 = menuItem2;
                            z2 = z2;
                            i19 = i5;
                            viewOnClickListenerC12817 = viewOnClickListenerC12817;
                        } else {
                            int iM27616 = C0619.m2761("ܺ۬") ^ i16;
                            i = ((iM27616 ^ i17) * (-165)) ^ (-1013958769);
                            i2 = iM27616 ^ (-214534303);
                            menuItem2 = menuItem2;
                            boolean z7 = z2;
                            i19 = i2;
                            i18 = i;
                            z2 = z7 ? 1 : 0;
                        }
                        break;
                    case -84705169:
                    case 1857272709:
                        menuItem = menuItem2;
                        strM5399 = C1519.m5399(f41051, 60, 3, i20);
                        if (C3492.f12043 > 0) {
                            iM31610 = (i16 - C0619.m2761("᩷᩻")) * 37;
                            i9 = ((iM31610 ^ i17) * 24633) ^ (-912240934);
                            i10 = 1028259262;
                            i19 = iM31610 ^ i10;
                            i18 = i9;
                            menuItem2 = menuItem;
                        } else {
                            menuItem2 = menuItem;
                            iM2762 = C0619.m2761("᩹֨") ^ i16;
                            i13 = ((iM2762 ^ i17) * (-16131)) ^ 239429105;
                            i14 = -1149638716;
                            i19 = iM2762 ^ i14;
                            i18 = i13;
                        }
                        break;
                    case 34361590:
                    case 1823219585:
                        z2 = z2 ? 1 : 0;
                        menuItem2 = menuItem2;
                        sArr2 = sArr4;
                        i6 = i24;
                        short s7 = s2;
                        int i28 = s7 + 1067;
                        if ((s7 * 4268) - (i28 * i28) <= 0) {
                            iM3169 = C0773.m3169("ۡ᩹") ^ i16;
                            i7 = ((iM3169 ^ i17) * 4575) ^ 1187411354;
                            i8 = -253128824;
                        } else {
                            iM3169 = (C0773.m3169("᩶᩶") ^ i17) * (-117);
                            i7 = ((iM3169 ^ i16) * 32329) ^ (-1995386176);
                            i8 = 17601802;
                        }
                        i5 = iM3169 ^ i8;
                        s2 = s7;
                        i18 = i7;
                        sArr4 = sArr2;
                        i24 = i6;
                        menuItem2 = menuItem2;
                        z2 = z2;
                        i19 = i5;
                        viewOnClickListenerC12817 = viewOnClickListenerC12817;
                        break;
                    case 165034883:
                    case 884166064:
                        menuItem = menuItem2;
                        iM2764 = C0619.m2761(C2354.m7980(f41051, 52, 3, i20));
                        if (!RunnableC1848.m6360()) {
                            iM31610 = (C0619.m2761("ۜܰ") ^ i17) * 27;
                            i9 = ((iM31610 ^ i16) * 8783) ^ (-1725300622);
                            i10 = 1335344141;
                            i19 = iM31610 ^ i10;
                            i18 = i9;
                            menuItem2 = menuItem;
                        } else {
                            s = s2;
                            sArr = sArr4;
                            i4 = i24;
                            int iM27617 = C0619.m2761("᩵ᩴ") ^ i16;
                            short s8 = s;
                            i18 = ((iM27617 ^ i17) * (-10089)) ^ (-1736052962);
                            i19 = iM27617 ^ 1683793196;
                            viewOnClickListenerC12817 = viewOnClickListenerC12817;
                            sArr4 = sArr;
                            i24 = i4;
                            menuItem2 = menuItem;
                            s2 = s8;
                        }
                        break;
                    case 165346127:
                    case 1463299427:
                        menuItem = menuItem2;
                        zIsEmpty = C23522.m52721(strM1784).getAll().isEmpty() ^ z;
                        iM31610 = (C0619.m2761("֨ܳ") + i16) * (-115);
                        i9 = ((iM31610 ^ i17) * (-22857)) ^ 1232007941;
                        i10 = -1711169353;
                        i19 = iM31610 ^ i10;
                        i18 = i9;
                        menuItem2 = menuItem;
                        break;
                    case 238071748:
                    case 518543379:
                        menuItem = menuItem2;
                        int i29 = iM31613 ^ i23;
                        C4238.m13541(c9898M42995, z2 ? 1 : 0, i29, z2 ? 1 : 0, i29);
                        if (viewOnClickListenerC12817.f41052.m42666()) {
                            iM31610 = (C0773.m3169("᩹ۛ") + i17) * 127;
                            i9 = ((iM31610 ^ i16) * (-5573)) ^ (-397584488);
                            i10 = 116764138;
                        } else {
                            iM31610 = (i16 - C0773.m3169("ۚۨ")) * 97;
                            i9 = ((iM31610 ^ i17) * 22167) ^ (-1437407913);
                            i10 = 1200234997;
                        }
                        i19 = iM31610 ^ i10;
                        i18 = i9;
                        menuItem2 = menuItem;
                        break;
                    case 496823440:
                    case 655873467:
                        menuItem = menuItem2;
                        strM1784 = C0269.m1784(c18300);
                        abstractC22044M52727 = C23522.m52727(strM1784);
                        sArr5 = f41051;
                        i21 = 55;
                        i25 = 5;
                        if (C1343.f4799 == 0) {
                            iM31610 = (i16 - C0773.m3169("ۛ֡")) * 13;
                            i9 = ((iM31610 ^ i17) * 185) ^ 1845614372;
                            i10 = -35256417;
                            i19 = iM31610 ^ i10;
                            i18 = i9;
                            menuItem2 = menuItem;
                        } else {
                            menuItem2 = menuItem;
                            iM2762 = C0619.m2761("᩹֨") ^ i16;
                            i13 = ((iM2762 ^ i17) * (-16131)) ^ 239429105;
                            i14 = -1149638716;
                            i19 = iM2762 ^ i14;
                            i18 = i13;
                        }
                        break;
                    case 516426240:
                    case 1389253181:
                        if (C2310.f7472 >= 0) {
                            iM2762 = (i17 - C0773.m3169("᩹ܽ")) * (-9);
                            i13 = ((iM2762 ^ i16) * (-30109)) ^ 1632324222;
                            i14 = 1445494812;
                            i19 = iM2762 ^ i14;
                            i18 = i13;
                        } else {
                            z2 = z2 ? 1 : 0;
                            menuItem2 = menuItem2;
                            int iM27618 = C0619.m2761("᩸ܶ") ^ i17;
                            i18 = ((iM27618 ^ i16) * (-21531)) ^ (-595031369);
                            i5 = iM27618 ^ 1866070003;
                            menuItem2 = menuItem2;
                            z2 = z2;
                            i19 = i5;
                            viewOnClickListenerC12817 = viewOnClickListenerC12817;
                        }
                        break;
                    case 1000561277:
                    case 2003975313:
                        menuItem = menuItem2;
                        if (zIsEmpty) {
                            iM31610 = C0773.m3169("۠ۜ") ^ i17;
                            i9 = ((iM31610 ^ i16) * 12805) ^ (-630229668);
                            i10 = -833883127;
                        } else {
                            iM31610 = C0773.m3169("֫ܿ") ^ i17;
                            i9 = ((iM31610 ^ i16) * 12527) ^ (-1493352544);
                            i10 = -879098504;
                        }
                        i19 = iM31610 ^ i10;
                        i18 = i9;
                        menuItem2 = menuItem;
                        break;
                    case 1908202781:
                    case 2020702085:
                        menuItem = menuItem2;
                        if (C2834.m9336(abstractC22044M7806.mo4282()) <= 0) {
                            abstractC22044 = abstractC22044M52727;
                            iM31611 = (C0619.m2761("ܽۢ") + i16) * 85;
                            i11 = ((iM31611 ^ i17) * (-1325)) ^ 1738533151;
                            i12 = -477980869;
                            i19 = iM31611 ^ i12;
                            abstractC22044M52727 = abstractC22044;
                            i18 = i11;
                            menuItem2 = menuItem;
                        } else {
                            zIsEmpty = z;
                            iM31610 = (C0619.m2761("֨ܳ") + i16) * (-115);
                            i9 = ((iM31610 ^ i17) * (-22857)) ^ 1232007941;
                            i10 = -1711169353;
                            i19 = iM31610 ^ i10;
                            i18 = i9;
                            menuItem2 = menuItem;
                        }
                        break;
                    default:
                        i20 = 22661;
                        int iM31616 = C0773.m3169("֡֫") ^ i16;
                        i = ((iM31616 ^ i17) * 30029) ^ (-828302757);
                        i2 = iM31616 ^ (-1907648090);
                        viewOnClickListenerC12817 = viewOnClickListenerC12817;
                        sArr4 = sArr4;
                        i24 = i24;
                        menuItem2 = menuItem2;
                        boolean z8 = z2;
                        i19 = i2;
                        i18 = i;
                        z2 = z8 ? 1 : 0;
                        break;
                }
                return;
            }
            int iM31617 = (i17 - C0773.m3169("ۡ۬")) * (-37);
            i19 = iM31617 ^ (-290750572);
            i18 = ((iM31617 ^ i16) * (-1193)) ^ (-278305238);
            sArr4 = sArr;
            i24 = i4;
            menuItem2 = menuItem;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m31784(ViewOnClickListenerC12817 viewOnClickListenerC12817) {
        C18300 c18300 = null;
        PluginContext pluginContextM42678 = null;
        int i = 1101089320;
        int i2 = C1080.f3865;
        int i3 = C3492.f12043;
        int iM3169 = (C0773.m3169("ۢܶ") ^ i2) * (-103);
        int i4 = ((iM3169 ^ i3) * 15499) ^ 1950431724;
        int i5 = 784260072;
        while (true) {
            i = ((((i ^ i3) * (-11731)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2005573946:
                case 576218946:
                    if (C3998.f13671 != 0) {
                        iM3169 = C0773.m3169("ۘۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 9535) ^ 1859272593;
                        i5 = -104117165;
                    } else {
                        iM3169 = (C0619.m2761("ۗ᩺") ^ i2) * (-31);
                        i4 = ((iM3169 ^ i3) * (-18945)) ^ 920125875;
                        i5 = -1666734099;
                    }
                    break;
                case -1948664377:
                case -825973747:
                    C20932.m47848();
                    if (C23916.m53419() == 0) {
                        iM3169 = C0619.m2761("᩺ܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-24863)) ^ 1067306830;
                        i5 = 2024722004;
                    } else {
                        iM3169 = C0773.m3169("᩻ۗ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 19885) ^ 903637386;
                        i5 = 556398996;
                    }
                    break;
                case -1800247695:
                case 385880957:
                    C2310.m7813();
                    C23916.m53419();
                    break;
                case -1761569804:
                case 1680658879:
                    c18300 = viewOnClickListenerC12817.f41052;
                    if (C23916.f77426 <= 0) {
                        iM3169 = C0619.m2761("᩺ܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-24863)) ^ 1067306830;
                        i5 = 2024722004;
                    } else {
                        iM3169 = (C0619.m2761("ۚۗ") ^ i3) * (-27);
                        i4 = ((iM3169 ^ i2) * (-17807)) ^ (-783113861);
                        i5 = 2109339641;
                    }
                    break;
                case -1745932991:
                case 474983333:
                    if (C2702.f8586 <= 0) {
                        iM3169 = C0619.m2761("᩺ܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-24863)) ^ 1067306830;
                        i5 = 2024722004;
                    } else {
                        iM3169 = C0773.m3169("ۖۖ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-14537)) ^ (-1457733933);
                        i5 = 833495371;
                    }
                    break;
                case -1459604262:
                case -365098093:
                    C3998.m12920();
                    if (!C2023.f6737) {
                        iM3169 = C0619.m2761("ۜ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 15571) ^ 1385555085;
                        i5 = 362946041;
                    } else {
                        iM3169 = C0773.m3169("᩻ۗ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 19885) ^ 903637386;
                        i5 = 556398996;
                    }
                    break;
                case -1360636012:
                case -1025008004:
                    if (C1146.m4231()) {
                        iM3169 = C0619.m2761("ۧ֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-18079)) ^ (-2113184705);
                        i5 = 1284087859;
                    } else {
                        iM3169 = (i3 - C0773.m3169("᩷ܿ")) * 91;
                        i4 = ((iM3169 ^ i2) * (-23499)) ^ 1459894307;
                        i5 = -2093883190;
                    }
                    break;
                case -1315739123:
                case 1834122875:
                    if (C2485.f7950 != 0) {
                        iM3169 = C0619.m2761("ۜ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 15571) ^ 1385555085;
                        i5 = 362946041;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ܰۨ")) * 39;
                        i4 = ((iM3169 ^ i2) * 17817) ^ 469218374;
                        i5 = 1461280580;
                    }
                    break;
                case -1130841749:
                case -232256282:
                    if (C0950.m3785() != 0) {
                        iM3169 = C0619.m2761("ۜ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 15571) ^ 1385555085;
                        i5 = 362946041;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۧܳ")) * 15;
                        i4 = ((iM3169 ^ i2) * 15903) ^ (-156553997);
                        i5 = -1695199170;
                    }
                    break;
                case -1003061933:
                case -95644480:
                    C2310.m7813();
                    C1519.m5403();
                    iM3169 = (i3 - C0773.m3169("᩷ܿ")) * 91;
                    i4 = ((iM3169 ^ i2) * (-23499)) ^ 1459894307;
                    i5 = -2093883190;
                    break;
                case -206202414:
                case 1801152875:
                    C1343.m4943();
                    if (!C2354.m7983()) {
                        iM3169 = C0773.m3169("᩻ۗ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 19885) ^ 903637386;
                        i5 = 556398996;
                    } else {
                        iM3169 = (i3 - C0773.m3169("᩷ܿ")) * 91;
                        i4 = ((iM3169 ^ i2) * (-23499)) ^ 1459894307;
                        i5 = -2093883190;
                    }
                    break;
                case 27245426:
                case 1568128211:
                    pluginContextM42678 = c18300.m42678();
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0773.m3169("ۘۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 9535) ^ 1859272593;
                        i5 = -104117165;
                    } else {
                        iM3169 = (C0619.m2761("ۤۙ") + i2) * 23;
                        i4 = ((iM3169 ^ i3) * 28279) ^ (-87583167);
                        i5 = -2063322085;
                    }
                    break;
                case 586525722:
                case 1315356250:
                    if (C1146.f4234 >= 0) {
                        iM3169 = C0619.m2761("᩺ܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-24863)) ^ 1067306830;
                        i5 = 2024722004;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ܰ᩹")) * (-115);
                        i4 = ((iM3169 ^ i2) * (-9763)) ^ 703355168;
                        i5 = -1505633772;
                    }
                    break;
                case 859941184:
                case 962873823:
                    ((C20889) pluginContextM42678).openPreference(null);
                    break;
                case 1057495068:
                case 1083077430:
                    if (C3099.m10095()) {
                        iM3169 = C0773.m3169("ۘۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 9535) ^ 1859272593;
                        i5 = -104117165;
                    } else {
                        iM3169 = C0773.m3169("۬ۜ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-2213)) ^ 1458922123;
                        i5 = -1795148350;
                    }
                    break;
                default:
                    if (C2966.f9654 >= 0) {
                        iM3169 = C0619.m2761("ۜ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * 15571) ^ 1385555085;
                        i5 = 362946041;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ܰۗ")) * 85;
                        i4 = ((iM3169 ^ i3) * (-10123)) ^ 1371202342;
                        i5 = -408518007;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:46:0x019b A[PHI: r5 r11 r12 r13
      0x019b: PHI (r5v6 l.֨ܶ) = (r5v4 l.֨ܶ), (r5v2 l.֨ܶ), (r5v2 l.֨ܶ), (r5v2 l.֨ܶ) binds: [B:45:0x0199, B:37:0x014c, B:28:0x00de, B:82:0x019b] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r11v5 int) = (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:45:0x0199, B:37:0x014c, B:28:0x00de, B:82:0x019b] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r12v5 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:45:0x0199, B:37:0x014c, B:28:0x00de, B:82:0x019b] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r13v5 short[]) = (r13v3 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:45:0x0199, B:37:0x014c, B:28:0x00de, B:82:0x019b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x01d7 A[PHI: r9 r10 r19
      0x01d7: PHI (r9v3 int) = (r9v2 int), (r9v4 int) binds: [B:49:0x01d5, B:41:0x0175] A[DONT_GENERATE, DONT_INLINE]
      0x01d7: PHI (r10v3 int) = (r10v2 int), (r10v4 int) binds: [B:49:0x01d5, B:41:0x0175] A[DONT_GENERATE, DONT_INLINE]
      0x01d7: PHI (r19v4 android.view.View) = (r19v3 android.view.View), (r19v2 android.view.View) binds: [B:49:0x01d5, B:41:0x0175] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0216 A[PHI: r6 r7 r14 r15 r20
      0x0216: PHI (r6v5 android.widget.TextView) = 
      (r6v2 android.widget.TextView)
      (r6v4 android.widget.TextView)
      (r6v2 android.widget.TextView)
      (r6v2 android.widget.TextView)
     binds: [B:53:0x0214, B:32:0x0110, B:13:0x007d, B:10:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v2 int), (r7v4 int) binds: [B:53:0x0214, B:32:0x0110, B:13:0x007d, B:10:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r14v3 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v4 short[]) binds: [B:53:0x0214, B:32:0x0110, B:13:0x007d, B:10:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r15v3 int) = (r15v2 int), (r15v2 int), (r15v2 int), (r15v4 int) binds: [B:53:0x0214, B:32:0x0110, B:13:0x007d, B:10:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r20v5 java.lang.String) = (r20v4 java.lang.String), (r20v3 java.lang.String), (r20v3 java.lang.String), (r20v3 java.lang.String) binds: [B:53:0x0214, B:32:0x0110, B:13:0x007d, B:10:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    public ViewOnClickListenerC12817(C5360 c5360, View view) {
        int iM3169;
        int i;
        int iM31610;
        int iM2761;
        int i2;
        int i3;
        super(view);
        int i4 = 933113650;
        int i5 = C1564.f5401;
        int i6 = C0487.f2131;
        short s = f41051[0];
        int i7 = s + 5119;
        int i8 = (s * s) + 26204161;
        int i9 = (i7 * i7) - (i8 + i8) > 0 ? 39566 : 51596;
        this.f41054 = c5360;
        int iM31611 = C0773.m3169("֨ۘ") ^ i5;
        int i10 = ((iM31611 ^ i6) * 24341) ^ 186355790;
        int i11 = iM31611 ^ (-1799886097);
        TextView textView = null;
        String strM4056 = null;
        short[] sArr = null;
        int i12 = 0;
        C1255 c1255 = null;
        int i13 = 0;
        int iM2762 = 0;
        int i14 = 0;
        int iM31612 = 0;
        int i15 = 0;
        View viewM9333 = null;
        View viewM9334 = null;
        short[] sArr2 = null;
        int i16 = 0;
        while (true) {
            i4 = i11 ^ (i10 & (((i4 ^ i6) * 32281) >> 31));
            switch (i4) {
                case -2131330879:
                case -1196335887:
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0619.m2761("۟ۡ") ^ i6;
                        i10 = ((iM3169 ^ i5) * 14403) ^ 2077391589;
                        i = 1579541831;
                        i11 = iM3169 ^ i;
                    } else {
                        iM31610 = i12;
                        iM2761 = C0619.m2761("᩶ᩳ") ^ i6;
                        i2 = ((iM2761 ^ i5) * (-4101)) ^ (-322711506);
                        i3 = -964481424;
                        i12 = iM31610;
                        i11 = iM2761 ^ i3;
                        i10 = i2;
                    }
                    break;
                case -2127311723:
                case -299844244:
                    iM31610 = C0773.m3169(C2966.m9670(f41051, 1, 3, i9));
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0619.m2761("᩶ᩳ") ^ i6;
                        i2 = ((iM2761 ^ i5) * (-4101)) ^ (-322711506);
                        i3 = -964481424;
                    } else {
                        iM2761 = (C0619.m2761("ۡ֨") ^ i6) * 101;
                        i2 = ((iM2761 ^ i5) * 29239) ^ 1172822362;
                        i3 = -409718371;
                    }
                    i12 = iM31610;
                    i11 = iM2761 ^ i3;
                    i10 = i2;
                    break;
                case -1873415644:
                case 2113696854:
                    iM2762 = C0619.m2761(C2834.m9343(sArr2, 7, 3, i9));
                    i14 = 2101496667;
                    if (C2354.f7599 >= 0) {
                        iM3169 = (C0773.m3169("᩻֡") + i6) * 21;
                        i10 = ((iM3169 ^ i5) * (-12407)) ^ (-1862203077);
                        i = -1512030288;
                    } else {
                        iM3169 = C0619.m2761("۟ܺ") ^ i6;
                        i10 = ((iM3169 ^ i5) * 15301) ^ 409965450;
                        i = 712101789;
                    }
                    i11 = iM3169 ^ i;
                    break;
                case -1820712041:
                case -1439628227:
                    this.f41057 = textView;
                    iM31612 = C0773.m3169(C2834.m9343(f41051, 13, 3, i9));
                    i16 = 2128815928;
                    if (C2310.m7813() <= 0) {
                        iM3169 = C0619.m2761("۟ۡ") ^ i6;
                        i10 = ((iM3169 ^ i5) * 14403) ^ 2077391589;
                        i = 1579541831;
                    } else {
                        iM3169 = (C0619.m2761("᩸ۧ") ^ i6) * 11;
                        i10 = ((iM3169 ^ i5) * 25467) ^ 571474355;
                        i = 1668614950;
                    }
                    i11 = iM3169 ^ i;
                    break;
                case -1814950707:
                case 1018155551:
                    this.f41055 = (ImageView) viewM9334;
                    strM4056 = C1080.m4056(f41051, 4, 3, i9);
                    if (C23916.m53419() != 0) {
                        iM3169 = (C0773.m3169("ܺۢ") ^ i5) * 85;
                        i10 = ((iM3169 ^ i6) * (-19585)) ^ (-1975674271);
                        i = 211037638;
                    } else {
                        iM3169 = (C0773.m3169("ܺܽ") + i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i10 = ((iM3169 ^ i6) * (-12027)) ^ 1585401497;
                        i = -906080906;
                    }
                    i11 = iM3169 ^ i;
                    break;
                case -1779152924:
                case 1023431870:
                    this.f41056 = (TextView) C3448.m11246(view, iM2762 ^ i14);
                    if (C0950.f3488 >= 0) {
                        iM3169 = C0619.m2761("۟ۡ") ^ i6;
                        i10 = ((iM3169 ^ i5) * 14403) ^ 2077391589;
                        i = 1579541831;
                    } else {
                        iM3169 = (C0619.m2761("ܶ֫") + i6) * (-89);
                        i10 = ((iM3169 ^ i5) * (-24127)) ^ (-1861416828);
                        i = 1339332726;
                    }
                    i11 = iM3169 ^ i;
                    break;
                case -1504069488:
                case 1231986246:
                    C23916.m53419();
                    if (AbstractC0641.f2496 < 0) {
                        iM3169 = (i5 - C0773.m3169("֡ᩳ")) * 37;
                        i10 = ((iM3169 ^ i6) * 29477) ^ (-1313311192);
                        i = 1901485524;
                    } else {
                        iM3169 = (C0773.m3169("ܺۢ") ^ i5) * 85;
                        i10 = ((iM3169 ^ i6) * (-19585)) ^ (-1975674271);
                        i = 211037638;
                    }
                    i11 = iM3169 ^ i;
                    break;
                case -1332334111:
                case 1604833067:
                    textView = (TextView) C2834.m9333(view, C0619.m2761(AbstractC0641.m2820(sArr, i15, i13, i9)) ^ 2130046561);
                    if (RunnableC3646.m11813() != 0) {
                        iM3169 = (C0773.m3169("ܺۢ") ^ i5) * 85;
                        i10 = ((iM3169 ^ i6) * (-19585)) ^ (-1975674271);
                        i = 211037638;
                    } else {
                        iM3169 = (C0619.m2761("᩺ۘ") ^ i5) * (-19);
                        i10 = ((iM3169 ^ i6) * 1797) ^ 1880858847;
                        i = 1971973438;
                    }
                    i11 = iM3169 ^ i;
                    break;
                case -964637135:
                case -338176120:
                    C3779.m12264();
                    iM31610 = i12;
                    iM2761 = C0619.m2761("᩶ᩳ") ^ i6;
                    i2 = ((iM2761 ^ i5) * (-4101)) ^ (-322711506);
                    i3 = -964481424;
                    i12 = iM31610;
                    i11 = iM2761 ^ i3;
                    i10 = i2;
                    break;
                case -791259630:
                case 1654542907:
                    this.f41058 = (TextView) C2834.m9333(view, iM31612 ^ i16);
                    RunnableC3055.m9944(c1255, this);
                    C2375.m8070(view, this);
                    return;
                case -772724779:
                case 1093918825:
                    C1564.m5509();
                    C1564.m5509();
                    throw new RuntimeException();
                case -728827424:
                case 1554192575:
                    viewM9333 = C2834.m9333(view, C0773.m3169(strM4056) ^ 2117519297);
                    if (C2023.f6737) {
                        iM3169 = (C0773.m3169("᩻֡") + i6) * 21;
                        i10 = ((iM3169 ^ i5) * (-12407)) ^ (-1862203077);
                        i = -1512030288;
                    } else {
                        iM3169 = C0773.m3169("ۢۢ") ^ i6;
                        i10 = ((iM3169 ^ i5) * (-18793)) ^ 2026331505;
                        i = 267531792;
                    }
                    i11 = iM3169 ^ i;
                    break;
                case -666409978:
                case -463717948:
                    viewM9334 = C2834.m9333(view, i12 ^ 2097769410);
                    if (C3734.m12152() < 0) {
                        iM3169 = (C0773.m3169("᩺ۗ") ^ i5) * (-53);
                        i10 = ((iM3169 ^ i6) * 11187) ^ (-941073068);
                        i = 217897143;
                        i11 = iM3169 ^ i;
                    } else {
                        iM31610 = i12;
                        iM2761 = C0619.m2761("᩶ᩳ") ^ i6;
                        i2 = ((iM2761 ^ i5) * (-4101)) ^ (-322711506);
                        i3 = -964481424;
                        i12 = iM31610;
                        i11 = iM2761 ^ i3;
                        i10 = i2;
                    }
                    break;
                case 411282760:
                case 1395548836:
                    c1255 = (C1255) viewM9333;
                    this.f41053 = c1255;
                    sArr2 = f41051;
                    if (RunnableC0334.m2063()) {
                        iM3169 = C0619.m2761("۟ۡ") ^ i6;
                        i10 = ((iM3169 ^ i5) * 14403) ^ 2077391589;
                        i = 1579541831;
                    } else {
                        iM3169 = (C0619.m2761("۬ۜ") ^ i5) * (-53);
                        i10 = ((iM3169 ^ i6) * 2613) ^ (-48956865);
                        i = 249928069;
                    }
                    i11 = iM3169 ^ i;
                    break;
                case 473743683:
                case 1230272957:
                    C1343.m4943();
                    if (C3448.f11240 < 0) {
                        iM3169 = (i5 - C0773.m3169("֡ᩳ")) * 37;
                        i10 = ((iM3169 ^ i6) * 29477) ^ (-1313311192);
                        i = 1901485524;
                        i11 = iM3169 ^ i;
                    } else {
                        iM31610 = i12;
                        iM2761 = C0619.m2761("᩶ᩳ") ^ i6;
                        i2 = ((iM2761 ^ i5) * (-4101)) ^ (-322711506);
                        i3 = -964481424;
                        i12 = iM31610;
                        i11 = iM2761 ^ i3;
                        i10 = i2;
                    }
                    break;
                default:
                    sArr = f41051;
                    i15 = 10;
                    i13 = 3;
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (C0773.m3169("ܺۢ") ^ i5) * 85;
                        i10 = ((iM3169 ^ i6) * (-19585)) ^ (-1975674271);
                        i = 211037638;
                    } else {
                        iM3169 = C0773.m3169("ܳۖ") ^ i5;
                        i10 = ((iM3169 ^ i6) * 11751) ^ 1259348306;
                        i = -905890223;
                    }
                    i11 = iM3169 ^ i;
                    break;
            }
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 1250845514;
        int i2 = C0950.f3488;
        int i3 = C2287.f7432;
        int iM2761 = C0619.m2761("۠᩶") ^ i2;
        int i4 = ((iM2761 ^ i3) * (-14193)) ^ 693662766;
        int i5 = 1572346882;
        while (true) {
            i = ((((i ^ i3) * (-15083)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1831323900:
                case 1106917720:
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0619.m2761("۠᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * 9305) ^ 1116799363;
                        i5 = 1786354433;
                    } else {
                        iM2761 = (i3 - C0773.m3169("֫ۛ")) * 93;
                        i4 = ((iM2761 ^ i2) * (-15225)) ^ 399077126;
                        i5 = -1388502063;
                    }
                    break;
                case -1816759582:
                case 803620114:
                    this.f41052.m42657(z);
                    C23522.m52718();
                    iM2761 = C0619.m2761("ۙۨ") ^ i3;
                    i4 = ((iM2761 ^ i2) * 22211) ^ (-294610063);
                    i5 = 996705081;
                    break;
                case -1427849574:
                case 1056586622:
                    if (C2834.m9344() >= 0) {
                        iM2761 = C0619.m2761("۠᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * 9305) ^ 1116799363;
                        i5 = 1786354433;
                    } else {
                        iM2761 = C0773.m3169("۠ۧ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 6975) ^ (-53861095);
                        i5 = -284228817;
                    }
                    break;
                case -1250473940:
                case 1958592059:
                    if (C1542.f5343 <= 0) {
                        iM2761 = C0773.m3169("ܶܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-10243)) ^ (-872306510);
                        i5 = 1305969055;
                    } else {
                        iM2761 = C0773.m3169("ۜۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-15417)) ^ 934390145;
                        i5 = -661821592;
                    }
                    break;
                case -1149254113:
                case 1999978992:
                    break;
                case -935606145:
                case -419610294:
                    if (C2702.f8586 <= 0) {
                        iM2761 = (i3 - C0619.m2761("֫ۚ")) * 97;
                        i4 = ((iM2761 ^ i2) * 14879) ^ 53258322;
                        i5 = -1613651173;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ܶ᩻")) * (-11);
                        i4 = ((iM2761 ^ i2) * (-31753)) ^ (-795871901);
                        i5 = -1580328816;
                    }
                    break;
                case -896309832:
                case 1268602219:
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0619.m2761("۠᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * 9305) ^ 1116799363;
                        i5 = 1786354433;
                    } else {
                        iM2761 = (C0619.m2761("ۛ᩹") ^ i2) * (-97);
                        i4 = ((iM2761 ^ i3) * 21065) ^ 1481308266;
                        i5 = 1585084708;
                    }
                    break;
                case -866873474:
                case -482945803:
                    C20932.m47848();
                    if (RunnableC0334.f1808 > 0) {
                        iM2761 = C0773.m3169("ܶܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-10243)) ^ (-872306510);
                        i5 = 1305969055;
                    } else {
                        iM2761 = (C0619.m2761("᩷ᩳ") ^ i3) * (-43);
                        i4 = ((iM2761 ^ i2) * 4701) ^ (-963776612);
                        i5 = 894847853;
                    }
                    break;
                case -821333074:
                case 1045113349:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = (C0619.m2761("᩷ᩳ") ^ i3) * (-43);
                        i4 = ((iM2761 ^ i2) * 4701) ^ (-963776612);
                        i5 = 894847853;
                    } else {
                        iM2761 = C0773.m3169("ܺۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-16153)) ^ 2105574603;
                        i5 = -190134573;
                    }
                    break;
                case -683387793:
                case -557257916:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = (i3 - C0619.m2761("֫ۚ")) * 97;
                        i4 = ((iM2761 ^ i2) * 14879) ^ 53258322;
                        i5 = -1613651173;
                    } else {
                        iM2761 = (C0619.m2761("۫ۖ") ^ i3) * 49;
                        i4 = ((iM2761 ^ i2) * (-15103)) ^ (-1045347927);
                        i5 = -830568733;
                    }
                    break;
                case -620957321:
                case 571167384:
                    C23916.m53419();
                    C2310.m7813();
                    iM2761 = (C0619.m2761("᩷ᩳ") ^ i3) * (-43);
                    i4 = ((iM2761 ^ i2) * 4701) ^ (-963776612);
                    i5 = 894847853;
                    break;
                case -372256458:
                case 1336289996:
                    if (C3690.f12684 <= 0) {
                        iM2761 = (C0619.m2761("᩷ᩳ") ^ i3) * (-43);
                        i4 = ((iM2761 ^ i2) * 4701) ^ (-963776612);
                        i5 = 894847853;
                    } else {
                        iM2761 = C0773.m3169("۫ۛ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6671)) ^ (-505472575);
                        i5 = -1445892094;
                    }
                    break;
                case -44899654:
                case 453146587:
                    RunnableC3646.m11813();
                    if (C1564.f5401 > 0) {
                        iM2761 = (i3 - C0619.m2761("֫ۚ")) * 97;
                        i4 = ((iM2761 ^ i2) * 14879) ^ 53258322;
                        i5 = -1613651173;
                    } else {
                        iM2761 = C0773.m3169("ܶܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-10243)) ^ (-872306510);
                        i5 = 1305969055;
                    }
                    break;
                case 394008097:
                case 560039385:
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0773.m3169("ܶܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-10243)) ^ (-872306510);
                        i5 = 1305969055;
                    } else {
                        iM2761 = (C0619.m2761("ܶۡ") ^ i2) * (-85);
                        i4 = ((iM2761 ^ i3) * (-18741)) ^ 550752967;
                        i5 = 46610195;
                    }
                    break;
                case 616274793:
                case 1238804308:
                    C3492.m11488();
                    C0862.m3503();
                    break;
                case 628045092:
                case 742804557:
                    if (C1783.m6232()) {
                        iM2761 = (i2 - C0619.m2761("ۛۗ")) * (-47);
                        i4 = ((iM2761 ^ i3) * 433) ^ (-1858218590);
                        i5 = 23894485;
                    } else {
                        iM2761 = (C0619.m2761("᩷ᩳ") ^ i3) * (-43);
                        i4 = ((iM2761 ^ i2) * 4701) ^ (-963776612);
                        i5 = 894847853;
                    }
                    break;
                case 836278118:
                case 1242388801:
                    if (C3492.f12043 <= 0) {
                        iM2761 = C0773.m3169("ܶܺ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-10243)) ^ (-872306510);
                        i5 = 1305969055;
                    } else {
                        iM2761 = (C0619.m2761("ܿ᩹") ^ i2) * 85;
                        i4 = ((iM2761 ^ i3) * 25633) ^ 1950399387;
                        i5 = -1548519958;
                    }
                    break;
                default:
                    if (this.f41052.m42686() != z) {
                        iM2761 = C0773.m3169("ۜ֨") ^ i2;
                        i4 = ((iM2761 ^ i3) * 24069) ^ 1965202941;
                        i5 = -1194522254;
                    } else {
                        iM2761 = C0619.m2761("ۙۨ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 22211) ^ (-294610063);
                        i5 = 996705081;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31777(ViewOnClickListenerC12817 viewOnClickListenerC12817, final DialogInterfaceC8327 dialogInterfaceC8327, MenuItem menuItem) {
        Object[] objArr;
        int iM2761;
        int i;
        int iM3169;
        int i2;
        int i3;
        int i4;
        int iM2762;
        int i5;
        int i6;
        char c;
        ?? r3;
        int iM31610;
        int i7;
        int i8;
        Object[] objArr2;
        AbstractActivityC17204 abstractActivityC17204;
        short[] sArr;
        AbstractActivityC17204 abstractActivityC17205;
        int i9;
        Object[] objArr3;
        AbstractActivityC17204 abstractActivityC17206;
        Object[] objArr4;
        final ViewOnClickListenerC12817 viewOnClickListenerC12818 = viewOnClickListenerC12817;
        int i10 = 0;
        String str = null;
        char c2 = 0;
        int iM2763 = 0;
        int iM31611 = 0;
        int iM31612 = 0;
        C2361 c2361 = null;
        C18300 c18300 = null;
        String strM11252 = null;
        int iM2764 = 0;
        int i11 = 0;
        short[] sArr2 = null;
        int i12 = 0;
        int i13 = 1828876587;
        int i14 = RunnableC3055.f9898;
        int i15 = C11235.f35427;
        int iM31613 = (C0773.m3169("֫᩸") + i15) * (-53);
        int i16 = ((iM31613 ^ i14) * 27909) ^ (-1557043544);
        int i17 = iM31613 ^ 1136592630;
        AbstractActivityC17204 abstractActivityC17207 = null;
        Object[] objArr5 = null;
        String strM33142 = null;
        AbstractActivityC17204 abstractActivityC17208 = null;
        Object[] objArr6 = null;
        short[] sArr3 = null;
        int i18 = 0;
        int i19 = 0;
        int iM8344 = 0;
        C5360 c5360 = null;
        short s = 0;
        C2361 c2362 = null;
        int i20 = 0;
        C18300 c18301 = null;
        String strM8354 = null;
        while (true) {
            i13 = i17 ^ (i16 & (((i13 ^ i14) * 11411) >> 31));
            switch (i13) {
                case -2145751340:
                case -736515880:
                    objArr6 = objArr6;
                    AbstractActivityC17204 abstractActivityC17209 = abstractActivityC17208;
                    abstractActivityC17207 = abstractActivityC17207;
                    String str2 = strM33142;
                    Object[] objArr7 = new Object[i10];
                    objArr7[c2] = c18301.m42687();
                    short[] sArr4 = f41051;
                    i12 = 42;
                    if (C20932.f66974 <= 0) {
                        strM33142 = str2;
                        objArr5 = objArr7;
                        iM8344 = iM8344;
                        abstractActivityC17208 = abstractActivityC17209;
                        sArr2 = sArr4;
                        c2 = c2;
                        int iM31614 = (C0773.m3169("ۤܳ") ^ i14) * 77;
                        i16 = ((iM31614 ^ i15) * (-11163)) ^ (-1007917837);
                        i4 = iM31614 ^ 1705695109;
                        c2 = c2;
                        abstractActivityC17207 = abstractActivityC17207;
                        objArr5 = objArr5;
                        iM8344 = iM8344;
                        objArr6 = objArr6;
                        i17 = i4;
                        viewOnClickListenerC12818 = viewOnClickListenerC12817;
                    } else {
                        int iM2765 = C0619.m2761("ۘᩴ") ^ i15;
                        i16 = ((iM2765 ^ i14) * 19645) ^ 639200277;
                        strM33142 = str2;
                        objArr6 = objArr6;
                        i17 = iM2765 ^ 1573558878;
                        abstractActivityC17207 = abstractActivityC17207;
                        objArr5 = objArr7;
                        abstractActivityC17208 = abstractActivityC17209;
                        sArr2 = sArr4;
                    }
                    break;
                case -2113603298:
                case -564217413:
                    objArr6 = objArr6;
                    iM8344 = iM8344;
                    objArr5 = objArr5;
                    c = c2;
                    abstractActivityC17207 = abstractActivityC17207;
                    i12 = i12;
                    sArr2 = sArr2;
                    abstractActivityC17208 = abstractActivityC17208;
                    r3 = 1;
                    r3 = 1;
                    str = null;
                    if (iM8344 == (C0773.m3169(strM11252) ^ 2129478147)) {
                        iM31610 = (i15 - C0619.m2761("ܽۧ")) * 95;
                        i5 = ((iM31610 ^ i14) * 30665) ^ 60433789;
                        i7 = -524646946;
                    } else {
                        iM31610 = C0773.m3169("ۧ᩺") ^ i14;
                        i5 = ((iM31610 ^ i15) * 30093) ^ (-769287014);
                        i7 = 1812210228;
                    }
                    i8 = iM31610 ^ i7;
                    c2 = c;
                    i10 = r3;
                    iM8344 = iM8344;
                    objArr6 = objArr6;
                    i17 = i8;
                    i16 = i5;
                    abstractActivityC17208 = abstractActivityC17208;
                    sArr2 = sArr2;
                    i12 = i12;
                    abstractActivityC17207 = abstractActivityC17207;
                    objArr5 = objArr5;
                    break;
                case -2088860670:
                case -1411541458:
                    C0773.m3161();
                    if (C2288.f7433 <= 0) {
                        objArr2 = objArr6;
                        abstractActivityC17205 = abstractActivityC17207;
                        i9 = i12;
                        sArr = sArr2;
                        abstractActivityC17204 = abstractActivityC17208;
                        objArr3 = objArr5;
                        int iM31615 = (C0773.m3169("ۢᩴ") ^ i14) * (-109);
                        abstractActivityC17206 = abstractActivityC17205;
                        i16 = ((iM31615 ^ i15) * 1363) ^ 1777597256;
                        objArr4 = objArr2;
                        i17 = iM31615 ^ 1043170665;
                        objArr6 = objArr4;
                        AbstractActivityC17204 abstractActivityC172010 = abstractActivityC17206;
                        objArr5 = objArr3;
                        abstractActivityC17208 = abstractActivityC17204;
                        sArr2 = sArr;
                        i12 = i9;
                        abstractActivityC17207 = abstractActivityC172010;
                    } else {
                        int iM2766 = (C0619.m2761("ۖܿ") ^ i15) * (-101);
                        i17 = iM2766 ^ (-1791517105);
                        i16 = ((iM2766 ^ i14) * (-6387)) ^ 1846229342;
                    }
                    break;
                case -2045237821:
                case -2043886178:
                    objArr6 = objArr6;
                    iM8344 = iM8344;
                    objArr5 = objArr5;
                    c = c2;
                    abstractActivityC17207 = abstractActivityC17207;
                    i12 = i12;
                    sArr2 = sArr2;
                    abstractActivityC17208 = abstractActivityC17208;
                    if (iM8344 == (C0773.m3169(C3077.m10047(f41051, 24, 3, i18)) ^ 2130267647)) {
                        iM31610 = C0773.m3169("֡᩺") ^ i15;
                        i5 = ((iM31610 ^ i14) * (-10223)) ^ 775241632;
                        i7 = -138148487;
                        r3 = i10;
                    } else {
                        iM31610 = C0619.m2761("ۙᩳ") ^ i14;
                        i5 = ((iM31610 ^ i15) * 3055) ^ 290655712;
                        i7 = 404904864;
                        r3 = i10;
                    }
                    i8 = iM31610 ^ i7;
                    c2 = c;
                    i10 = r3;
                    iM8344 = iM8344;
                    objArr6 = objArr6;
                    i17 = i8;
                    i16 = i5;
                    abstractActivityC17208 = abstractActivityC17208;
                    sArr2 = sArr2;
                    i12 = i12;
                    abstractActivityC17207 = abstractActivityC17207;
                    objArr5 = objArr5;
                    break;
                case -1961410151:
                case -407687953:
                    objArr6 = objArr6;
                    iM8344 = iM8344;
                    objArr5 = objArr5;
                    abstractActivityC17207 = abstractActivityC17207;
                    i12 = i12;
                    sArr2 = sArr2;
                    abstractActivityC17208 = abstractActivityC17208;
                    iM2763 = C0619.m2761(C3998.m12925(f41051, 30, 3, i18)) ^ 2126264545;
                    if (C3033.m9845() > 0) {
                        iM2762 = (C0619.m2761("ܳۤ") + i15) * (-111);
                        i5 = ((iM2762 ^ i14) * 1863) ^ 471722755;
                        i6 = 648774157;
                        i8 = iM2762 ^ i6;
                        i10 = i10;
                        iM8344 = iM8344;
                        objArr6 = objArr6;
                        i17 = i8;
                        i16 = i5;
                        abstractActivityC17208 = abstractActivityC17208;
                        sArr2 = sArr2;
                        i12 = i12;
                        abstractActivityC17207 = abstractActivityC17207;
                        objArr5 = objArr5;
                    } else {
                        c2 = c2;
                        abstractActivityC17208 = abstractActivityC17208;
                        sArr2 = sArr2;
                        i12 = i12;
                        int iM31616 = (C0773.m3169("ۤܳ") ^ i14) * 77;
                        i16 = ((iM31616 ^ i15) * (-11163)) ^ (-1007917837);
                        i4 = iM31616 ^ 1705695109;
                        c2 = c2;
                        abstractActivityC17207 = abstractActivityC17207;
                        objArr5 = objArr5;
                        iM8344 = iM8344;
                        objArr6 = objArr6;
                        i17 = i4;
                        viewOnClickListenerC12818 = viewOnClickListenerC12817;
                    }
                    break;
                case -1938980322:
                case -725712195:
                    objArr6 = objArr6;
                    iM8344 = iM8344;
                    objArr5 = objArr5;
                    c2 = c2;
                    abstractActivityC17207 = abstractActivityC17207;
                    i12 = i12;
                    sArr2 = sArr2;
                    abstractActivityC17208 = abstractActivityC17208;
                    s = f41051[20];
                    i11 = s * s;
                    if (C3448.f11240 < 0) {
                        iM2761 = (i15 - C0619.m2761("֫ܶ")) * 31;
                        i16 = ((iM2761 ^ i14) * (-3245)) ^ (-1885975401);
                        i = 112853214;
                        i4 = iM2761 ^ i;
                        c2 = c2;
                        abstractActivityC17208 = abstractActivityC17208;
                        sArr2 = sArr2;
                        iM8344 = iM8344;
                        i12 = i12;
                        abstractActivityC17207 = abstractActivityC17207;
                        objArr6 = objArr6;
                        objArr5 = objArr5;
                        i17 = i4;
                        viewOnClickListenerC12818 = viewOnClickListenerC12817;
                    }
                    abstractActivityC17208 = abstractActivityC17208;
                    sArr2 = sArr2;
                    i12 = i12;
                    int iM31617 = (C0773.m3169("ۤܳ") ^ i14) * 77;
                    i16 = ((iM31617 ^ i15) * (-11163)) ^ (-1007917837);
                    i4 = iM31617 ^ 1705695109;
                    c2 = c2;
                    abstractActivityC17207 = abstractActivityC17207;
                    objArr5 = objArr5;
                    iM8344 = iM8344;
                    objArr6 = objArr6;
                    i17 = i4;
                    viewOnClickListenerC12818 = viewOnClickListenerC12817;
                    break;
                case -1736449785:
                case 1338000750:
                    strM8354 = C2485.m8354(abstractActivityC17208, C0773.m3169(AbstractC0641.m2820(sArr3, i20, 3, i18)) ^ 2122200012, objArr6);
                    if (C1564.f5401 > 0) {
                        int iM31618 = C0773.m3169("ۤܺ") ^ i15;
                        objArr = objArr6;
                        i17 = iM31618 ^ (-1175704912);
                        i16 = ((iM31618 ^ i14) * (-6829)) ^ (-11378715);
                        objArr6 = objArr;
                    } else {
                        objArr6 = objArr6;
                        abstractActivityC17207 = abstractActivityC17207;
                        i12 = i12;
                        sArr2 = sArr2;
                        abstractActivityC17208 = abstractActivityC17208;
                        iM2762 = (i15 - C0773.m3169("ܿᩴ")) * 51;
                        i5 = ((iM2762 ^ i14) * (-20535)) ^ (-912893123);
                        i6 = -1046433649;
                        i8 = iM2762 ^ i6;
                        i10 = i10;
                        iM8344 = iM8344;
                        objArr6 = objArr6;
                        i17 = i8;
                        i16 = i5;
                        abstractActivityC17208 = abstractActivityC17208;
                        sArr2 = sArr2;
                        i12 = i12;
                        abstractActivityC17207 = abstractActivityC17207;
                        objArr5 = objArr5;
                    }
                    break;
                case -1722951456:
                case 1554984337:
                    if (C1080.f3865 < 0) {
                        objArr2 = objArr6;
                        abstractActivityC17205 = abstractActivityC17207;
                        i9 = i12;
                        sArr = sArr2;
                        abstractActivityC17204 = abstractActivityC17208;
                        objArr3 = objArr5;
                        int iM31619 = (C0773.m3169("ۢᩴ") ^ i14) * (-109);
                        abstractActivityC17206 = abstractActivityC17205;
                        i16 = ((iM31619 ^ i15) * 1363) ^ 1777597256;
                        objArr4 = objArr2;
                        i17 = iM31619 ^ 1043170665;
                        objArr6 = objArr4;
                        AbstractActivityC17204 abstractActivityC172011 = abstractActivityC17206;
                        objArr5 = objArr3;
                        abstractActivityC17208 = abstractActivityC17204;
                        sArr2 = sArr;
                        i12 = i9;
                        abstractActivityC17207 = abstractActivityC172011;
                    } else {
                        objArr6 = objArr6;
                        iM8344 = iM8344;
                        objArr5 = objArr5;
                        abstractActivityC17207 = abstractActivityC17207;
                        i12 = i12;
                        sArr2 = sArr2;
                        abstractActivityC17208 = abstractActivityC17208;
                        iM2762 = C0619.m2761("᩻᩹") ^ i14;
                        i5 = ((iM2762 ^ i15) * 2509) ^ (-1237522258);
                        i6 = 178371405;
                        i8 = iM2762 ^ i6;
                        i10 = i10;
                        iM8344 = iM8344;
                        objArr6 = objArr6;
                        i17 = i8;
                        i16 = i5;
                        abstractActivityC17208 = abstractActivityC17208;
                        sArr2 = sArr2;
                        i12 = i12;
                        abstractActivityC17207 = abstractActivityC17207;
                        objArr5 = objArr5;
                    }
                    break;
                case -1703783025:
                case -524418153:
                    C1542.m5459();
                    C1080.m4050();
                    break;
                case -1496176493:
                case -1141622105:
                    objArr6 = objArr6;
                    iM8344 = iM8344;
                    objArr5 = objArr5;
                    abstractActivityC17207 = abstractActivityC17207;
                    i12 = i12;
                    sArr2 = sArr2;
                    abstractActivityC17208 = abstractActivityC17208;
                    iM31612 = C0773.m3169(C2310.m7803(f41051, 36, 3, i18)) ^ 2101825726;
                    int i21 = i19;
                    if (iM8344 == i21) {
                        iM2762 = C0773.m3169("ۡᩳ") ^ i14;
                        i19 = i21;
                        i5 = ((iM2762 ^ i15) * (-12969)) ^ 705322658;
                        i6 = -728784565;
                    } else {
                        i19 = i21;
                        iM2762 = C0619.m2761("ܰ᩹") ^ i14;
                        i5 = ((iM2762 ^ i15) * (-17255)) ^ (-985897604);
                        i6 = 1389034235;
                    }
                    i8 = iM2762 ^ i6;
                    i10 = i10;
                    iM8344 = iM8344;
                    objArr6 = objArr6;
                    i17 = i8;
                    i16 = i5;
                    abstractActivityC17208 = abstractActivityC17208;
                    sArr2 = sArr2;
                    i12 = i12;
                    abstractActivityC17207 = abstractActivityC17207;
                    objArr5 = objArr5;
                    break;
                case -1410287970:
                case 265540106:
                    if (C1519.m5403()) {
                        objArr6 = objArr6;
                        abstractActivityC17207 = abstractActivityC17207;
                        i12 = i12;
                        sArr2 = sArr2;
                        abstractActivityC17208 = abstractActivityC17208;
                        iM2762 = (i15 - C0773.m3169("ܿᩴ")) * 51;
                        i5 = ((iM2762 ^ i14) * (-20535)) ^ (-912893123);
                        i6 = -1046433649;
                        i8 = iM2762 ^ i6;
                        i10 = i10;
                        iM8344 = iM8344;
                        objArr6 = objArr6;
                        i17 = i8;
                        i16 = i5;
                        abstractActivityC17208 = abstractActivityC17208;
                        sArr2 = sArr2;
                        i12 = i12;
                        abstractActivityC17207 = abstractActivityC17207;
                        objArr5 = objArr5;
                    }
                    objArr6 = objArr6;
                    iM8344 = iM8344;
                    objArr5 = objArr5;
                    abstractActivityC17207 = abstractActivityC17207;
                    i12 = i12;
                    sArr2 = sArr2;
                    abstractActivityC17208 = abstractActivityC17208;
                    iM2762 = C0619.m2761("᩻᩹") ^ i14;
                    i5 = ((iM2762 ^ i15) * 2509) ^ (-1237522258);
                    i6 = 178371405;
                    i8 = iM2762 ^ i6;
                    i10 = i10;
                    iM8344 = iM8344;
                    objArr6 = objArr6;
                    i17 = i8;
                    i16 = i5;
                    abstractActivityC17208 = abstractActivityC17208;
                    sArr2 = sArr2;
                    i12 = i12;
                    abstractActivityC17207 = abstractActivityC17207;
                    objArr5 = objArr5;
                    break;
                case -1289863509:
                case -1098370809:
                    break;
                case -1193872330:
                case -1166230213:
                    objArr6 = objArr6;
                    short[] sArr5 = sArr2;
                    abstractActivityC17208 = abstractActivityC17208;
                    Object[] objArr8 = objArr5;
                    abstractActivityC17207 = abstractActivityC17207;
                    i12 = i12;
                    sArr2 = sArr5;
                    objArr5 = objArr8;
                    iM8344 = iM8344;
                    if (iM8344 == (C0773.m3169(C2023.m6966(f41051, 39, 3, i18)) ^ 2122664667)) {
                        iM2762 = C0773.m3169("ۜܽ") ^ i15;
                        i5 = ((iM2762 ^ i14) * 22457) ^ (-551743907);
                        i6 = 1659052254;
                    } else {
                        iM2762 = C0619.m2761("ᩳۧ") ^ i14;
                        i5 = ((iM2762 ^ i15) * 25309) ^ (-1558716712);
                        i6 = 1493300219;
                    }
                    i8 = iM2762 ^ i6;
                    i10 = i10;
                    iM8344 = iM8344;
                    objArr6 = objArr6;
                    i17 = i8;
                    i16 = i5;
                    abstractActivityC17208 = abstractActivityC17208;
                    sArr2 = sArr2;
                    i12 = i12;
                    abstractActivityC17207 = abstractActivityC17207;
                    objArr5 = objArr5;
                    break;
                case -1182417627:
                case 722388274:
                    RunnableC0334.m2055(c2361, strM8354);
                    C3492.m11487(c2361, iM31611, new DialogInterface.OnClickListener(viewOnClickListenerC12818) { // from class: l.ܳۗ֫

                        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ViewOnClickListenerC12817 f49126;

                        {
                            int i22 = -87576223;
                            int i23 = C4238.f15451;
                            int i24 = C0773.f2792;
                            int iM2767 = C0619.m2761("ۨᩴ") ^ i24;
                            int i25 = ((iM2767 ^ i23) * 20479) ^ (-66354388);
                            int i26 = -245032019;
                            while (true) {
                                i22 = ((((i22 ^ i23) * 27749) >> 31) & i25) ^ (iM2767 ^ i26);
                                switch (i22) {
                                    case -2080664696:
                                    case 999955024:
                                        this.f49126 = viewOnClickListenerC12818;
                                        if (RunnableC1848.f6235) {
                                            iM2767 = (C0619.m2761("ܳ᩵") ^ i24) * 61;
                                            i25 = ((iM2767 ^ i23) * (-5057)) ^ 1949300588;
                                            i26 = -1800225368;
                                        } else {
                                            iM2767 = C0619.m2761("ᩴܽ") ^ i23;
                                            i25 = ((iM2767 ^ i24) * (-26929)) ^ 43158669;
                                            i26 = 1930067340;
                                        }
                                        break;
                                    case -2043301017:
                                    case 1454369391:
                                        if (C4238.f15451 < 0) {
                                            iM2767 = C0773.m3169("ۜܰ") ^ i24;
                                            i25 = ((iM2767 ^ i23) * 20865) ^ 763730918;
                                            i26 = 150077948;
                                        } else {
                                            iM2767 = C0619.m2761("᩹ۚ") ^ i23;
                                            i25 = ((iM2767 ^ i24) * 19147) ^ (-846838274);
                                            i26 = 809206596;
                                        }
                                        break;
                                    case -2037414420:
                                    case -1659374375:
                                        C0773.m3161();
                                        C17202.m40372();
                                        throw new RuntimeException();
                                    case -1771013550:
                                    case 64416021:
                                        if (C17202.m40372()) {
                                            iM2767 = C0773.m3169("ۖۚ") ^ i24;
                                            i25 = ((iM2767 ^ i23) * (-7863)) ^ (-1614206128);
                                            i26 = 736194875;
                                        } else {
                                            iM2767 = C0773.m3169("ۜܰ") ^ i24;
                                            i25 = ((iM2767 ^ i23) * 20865) ^ 763730918;
                                            i26 = 150077948;
                                        }
                                        break;
                                    case -1173901344:
                                    case 1161447215:
                                        if (C4282.f15546 <= 0) {
                                            iM2767 = C0773.m3169("ۜܰ") ^ i24;
                                            i25 = ((iM2767 ^ i23) * 20865) ^ 763730918;
                                            i26 = 150077948;
                                        } else {
                                            iM2767 = (i23 - C0773.m3169("ܺ֡")) * (-19);
                                            i25 = ((iM2767 ^ i24) * 31773) ^ 815369645;
                                            i26 = -1123549680;
                                        }
                                        break;
                                    case -1024344602:
                                    case -977372180:
                                        if (C1826.f6190 <= 0) {
                                            iM2767 = (C0619.m2761("ܳ᩵") ^ i24) * 61;
                                            i25 = ((iM2767 ^ i23) * (-5057)) ^ 1949300588;
                                            i26 = -1800225368;
                                        } else {
                                            iM2767 = C0773.m3169("ᩳۡ") ^ i24;
                                            i25 = ((iM2767 ^ i23) * 10833) ^ (-1611431703);
                                            i26 = -454215627;
                                        }
                                        break;
                                    case -848265398:
                                    case 1417344608:
                                        if (C2023.f6737) {
                                            iM2767 = (C0619.m2761("ܳ᩵") ^ i24) * 61;
                                            i25 = ((iM2767 ^ i23) * (-5057)) ^ 1949300588;
                                            i26 = -1800225368;
                                        } else {
                                            iM2767 = C0619.m2761("᩺ۖ") ^ i24;
                                            i25 = ((iM2767 ^ i23) * (-15355)) ^ (-303226454);
                                            i26 = -1553446021;
                                        }
                                        break;
                                    case -831809605:
                                    case 156203297:
                                        if (C2966.f9654 >= 0) {
                                            iM2767 = (i23 - C0619.m2761("֨֫")) * 119;
                                            i25 = ((iM2767 ^ i24) * (-8355)) ^ 1209086495;
                                            i26 = -1200184379;
                                        } else {
                                            iM2767 = C0619.m2761("ۢ᩶") ^ i24;
                                            i25 = ((iM2767 ^ i23) * 30605) ^ (-329535806);
                                            i26 = 125870701;
                                        }
                                        break;
                                    case -772470706:
                                    case -480391320:
                                        if (C1519.m5403()) {
                                            iM2767 = (C0619.m2761("ۨ᩷") ^ i23) * (-37);
                                            i25 = ((iM2767 ^ i24) * 20273) ^ 1243939501;
                                            i26 = 1330961327;
                                        } else {
                                            iM2767 = C0773.m3169("ۘۛ") ^ i23;
                                            i25 = ((iM2767 ^ i24) * 5063) ^ (-1536805171);
                                            i26 = -964125877;
                                        }
                                        break;
                                    case -667181907:
                                    case -406033733:
                                        return;
                                    case -262518890:
                                    case 1964913936:
                                        if (C0619.f2439) {
                                            iM2767 = C0619.m2761("᩹ۚ") ^ i23;
                                            i25 = ((iM2767 ^ i24) * 19147) ^ (-846838274);
                                            i26 = 809206596;
                                        } else {
                                            iM2767 = (C0619.m2761("᩶֡") + i24) * 119;
                                            i25 = ((iM2767 ^ i23) * (-23971)) ^ (-510146306);
                                            i26 = 202393059;
                                        }
                                        break;
                                    case 589551202:
                                    case 1501549398:
                                        if (C1321.m4852()) {
                                            iM2767 = (C0619.m2761("۫ۛ") ^ i23) * (-97);
                                            i25 = ((iM2767 ^ i24) * 17023) ^ (-1323123582);
                                            i26 = -283644938;
                                        } else {
                                            iM2767 = (i23 - C0619.m2761("֨֫")) * 119;
                                            i25 = ((iM2767 ^ i24) * (-8355)) ^ 1209086495;
                                            i26 = -1200184379;
                                        }
                                        break;
                                    case 725883345:
                                    case 936836385:
                                        if (C2702.f8586 <= 0) {
                                            iM2767 = (i23 - C0619.m2761("֨֫")) * 119;
                                            i25 = ((iM2767 ^ i24) * (-8355)) ^ 1209086495;
                                            i26 = -1200184379;
                                        } else {
                                            iM2767 = (C0773.m3169("۬ۚ") ^ i23) * 15;
                                            i25 = ((iM2767 ^ i24) * (-28827)) ^ (-2027745254);
                                            i26 = 2058204050;
                                        }
                                        break;
                                    case 1195686777:
                                    case 1883209057:
                                        C11235.m28309();
                                        if (C4238.f15451 >= 0) {
                                            iM2767 = (C0619.m2761("ܳ᩵") ^ i24) * 61;
                                            i25 = ((iM2767 ^ i23) * (-5057)) ^ 1949300588;
                                            i26 = -1800225368;
                                        } else {
                                            iM2767 = C0773.m3169("ۜܰ") ^ i24;
                                            i25 = ((iM2767 ^ i23) * 20865) ^ 763730918;
                                            i26 = 150077948;
                                        }
                                        break;
                                    case 1408787763:
                                    case 2053939841:
                                        C3734.m12152();
                                        C13473.m33144();
                                        iM2767 = C0619.m2761("᩹ۚ") ^ i23;
                                        i25 = ((iM2767 ^ i24) * 19147) ^ (-846838274);
                                        i26 = 809206596;
                                        break;
                                    default:
                                        C4238.m13540();
                                        if (C11235.f35427 < 0) {
                                            iM2767 = (i23 - C0619.m2761("֨֫")) * 119;
                                            i25 = ((iM2767 ^ i24) * (-8355)) ^ 1209086495;
                                            i26 = -1200184379;
                                        } else {
                                            iM2767 = C0773.m3169("ۜܰ") ^ i24;
                                            i25 = ((iM2767 ^ i23) * 20865) ^ 763730918;
                                            i26 = 150077948;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i22) {
                            int i23 = -1256992495;
                            int i24 = C3690.f12684;
                            int i25 = C3779.f12953;
                            int iM31620 = (i25 - C0773.m3169("ۜܰ")) * (-95);
                            int i26 = ((iM31620 ^ i24) * 9539) ^ 1646309337;
                            int i27 = 2025012774;
                            while (true) {
                                i23 = ((((i23 ^ i24) * (-19487)) >> 31) & i26) ^ (iM31620 ^ i27);
                                switch (i23) {
                                    case -1855871297:
                                    case -953480837:
                                        if (C4282.f15546 <= 0) {
                                            iM31620 = C0773.m3169("ۧ۫") ^ i24;
                                            i26 = ((iM31620 ^ i25) * 28091) ^ (-1552988333);
                                            i27 = 2073827049;
                                        } else {
                                            iM31620 = C0773.m3169("ۚ᩷") ^ i25;
                                            i26 = ((iM31620 ^ i24) * 20951) ^ (-1270827974);
                                            i27 = 1941386950;
                                        }
                                        break;
                                    case -1802035914:
                                    case 1398772000:
                                        if (C1564.f5401 <= 0) {
                                            iM31620 = C0773.m3169("ۨۘ") ^ i25;
                                            i26 = ((iM31620 ^ i24) * (-6913)) ^ 871081499;
                                            i27 = -105800628;
                                        } else {
                                            iM31620 = C0619.m2761("ܽ֨") ^ i24;
                                            i26 = ((iM31620 ^ i25) * (-8933)) ^ 1387957793;
                                            i27 = -1575622549;
                                        }
                                        break;
                                    case -1662628096:
                                    case 2059525614:
                                        if (C0487.f2131 <= 0) {
                                            iM31620 = C0619.m2761("ۜܳ") ^ i25;
                                            i26 = ((iM31620 ^ i24) * (-23755)) ^ 1516024206;
                                            i27 = 148217890;
                                        } else {
                                            iM31620 = C0619.m2761("ۙ۬") ^ i25;
                                            i26 = ((iM31620 ^ i24) * 8745) ^ (-1694935139);
                                            i27 = 1181193321;
                                        }
                                        break;
                                    case -1629037807:
                                    case 119618789:
                                        if (AbstractC0116.f1064 <= 0) {
                                            iM31620 = C0619.m2761("ۜܳ") ^ i25;
                                            i26 = ((iM31620 ^ i24) * (-23755)) ^ 1516024206;
                                            i27 = 148217890;
                                        } else {
                                            iM31620 = C0773.m3169("ܰ۠") ^ i25;
                                            i26 = ((iM31620 ^ i24) * 335) ^ (-266629058);
                                            i27 = -290212355;
                                        }
                                        break;
                                    case -1568485733:
                                    case -394574204:
                                        if (C17202.m40372()) {
                                            iM31620 = C0619.m2761("ܽܿ") ^ i24;
                                            i26 = ((iM31620 ^ i25) * (-14943)) ^ 370890507;
                                            i27 = -861262039;
                                        } else {
                                            iM31620 = C0619.m2761("ۜܳ") ^ i25;
                                            i26 = ((iM31620 ^ i24) * (-23755)) ^ 1516024206;
                                            i27 = 148217890;
                                        }
                                        break;
                                    case -971110559:
                                    case 1422825220:
                                        ViewOnClickListenerC12817.m31776(this.f49126, dialogInterfaceC8327);
                                        break;
                                    case -933752840:
                                    case 558703299:
                                        C1146.m4231();
                                        C2023.m6964();
                                        iM31620 = (i24 - C0773.m3169("ۗ᩹")) * 53;
                                        i26 = ((iM31620 ^ i25) * (-7517)) ^ (-1407489498);
                                        i27 = -400866055;
                                        break;
                                    case -802612854:
                                    case 1762920139:
                                        C0773.m3161();
                                        if (!C4282.m13644()) {
                                            iM31620 = (i24 - C0773.m3169("ۗ᩹")) * 53;
                                            i26 = ((iM31620 ^ i25) * (-7517)) ^ (-1407489498);
                                            i27 = -400866055;
                                        } else {
                                            iM31620 = C0619.m2761("ۜܳ") ^ i25;
                                            i26 = ((iM31620 ^ i24) * (-23755)) ^ 1516024206;
                                            i27 = 148217890;
                                        }
                                        break;
                                    case -533699825:
                                    case 541343081:
                                        C2354.m7983();
                                        break;
                                    case -449579812:
                                    case 1878988396:
                                        if (AbstractC3624.f12429 <= 0) {
                                            iM31620 = C0773.m3169("ܶ᩺") ^ i25;
                                            i26 = ((iM31620 ^ i24) * (-15255)) ^ (-119431056);
                                            i27 = 2090349257;
                                        } else {
                                            iM31620 = C0773.m3169("ܶ᩻") ^ i24;
                                            i26 = ((iM31620 ^ i25) * (-28805)) ^ 859802244;
                                            i27 = -118637564;
                                        }
                                        break;
                                    case -229013013:
                                    case 850158228:
                                        if (C1519.f5300 >= 0) {
                                            iM31620 = C0773.m3169("ۧ۫") ^ i24;
                                            i26 = ((iM31620 ^ i25) * 28091) ^ (-1552988333);
                                            i27 = 2073827049;
                                        } else {
                                            iM31620 = C0773.m3169("ۨ᩹") ^ i25;
                                            i26 = ((iM31620 ^ i24) * 17229) ^ (-535988848);
                                            i27 = 1315420702;
                                        }
                                        break;
                                    case -215332965:
                                    case 1642473513:
                                        if (C3690.f12684 <= 0) {
                                            iM31620 = C0773.m3169("ܶ᩺") ^ i25;
                                            i26 = ((iM31620 ^ i24) * (-15255)) ^ (-119431056);
                                            i27 = 2090349257;
                                        } else {
                                            iM31620 = C0619.m2761("ۖܽ") ^ i25;
                                            i26 = ((iM31620 ^ i24) * (-27273)) ^ 531567249;
                                            i27 = -1123049689;
                                        }
                                        break;
                                    case -2774487:
                                    case 1426100731:
                                        if (C20932.f66974 > 0) {
                                            iM31620 = C0773.m3169("ۧ۫") ^ i24;
                                            i26 = ((iM31620 ^ i25) * 28091) ^ (-1552988333);
                                            i27 = 2073827049;
                                        } else {
                                            iM31620 = C0619.m2761("ۜܳ") ^ i25;
                                            i26 = ((iM31620 ^ i24) * (-23755)) ^ 1516024206;
                                            i27 = 148217890;
                                        }
                                        break;
                                    case 410563640:
                                    case 1164938093:
                                        if (!C3779.m12264()) {
                                            iM31620 = (i24 - C0773.m3169("ۗ᩹")) * 53;
                                            i26 = ((iM31620 ^ i25) * (-7517)) ^ (-1407489498);
                                            i27 = -400866055;
                                        } else {
                                            iM31620 = C0773.m3169("ۨۘ") ^ i25;
                                            i26 = ((iM31620 ^ i24) * (-6913)) ^ 871081499;
                                            i27 = -105800628;
                                        }
                                        break;
                                    case 985742506:
                                    case 1513062701:
                                        if (RunnableC3646.f12471) {
                                            iM31620 = C0619.m2761("ۜܳ") ^ i25;
                                            i26 = ((iM31620 ^ i24) * (-23755)) ^ 1516024206;
                                            i27 = 148217890;
                                        } else {
                                            iM31620 = C0619.m2761("ᩴۡ") ^ i24;
                                            i26 = ((iM31620 ^ i25) * 28437) ^ (-2141879835);
                                            i27 = 1595298724;
                                        }
                                        break;
                                    default:
                                        if (C3448.f11240 >= 0) {
                                            iM31620 = (i24 - C0773.m3169("ۗ᩹")) * 53;
                                            i26 = ((iM31620 ^ i25) * (-7517)) ^ (-1407489498);
                                            i27 = -400866055;
                                        } else {
                                            iM31620 = (i24 - C0619.m2761("ᩴܳ")) * (-127);
                                            i26 = ((iM31620 ^ i25) * 12943) ^ 304480685;
                                            i27 = 1477062320;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    C3033.m9848(c2361, iM2763, str);
                    C1321.m4860(c2361);
                    objArr6 = objArr6;
                    iM8344 = iM8344;
                    objArr5 = objArr5;
                    abstractActivityC17207 = abstractActivityC17207;
                    i12 = i12;
                    sArr2 = sArr2;
                    abstractActivityC17208 = abstractActivityC17208;
                    iM2762 = C0619.m2761("ᩳۧ") ^ i14;
                    i5 = ((iM2762 ^ i15) * 25309) ^ (-1558716712);
                    i6 = 1493300219;
                    i8 = iM2762 ^ i6;
                    i10 = i10;
                    iM8344 = iM8344;
                    objArr6 = objArr6;
                    i17 = i8;
                    i16 = i5;
                    abstractActivityC17208 = abstractActivityC17208;
                    sArr2 = sArr2;
                    i12 = i12;
                    abstractActivityC17207 = abstractActivityC17207;
                    objArr5 = objArr5;
                    break;
                case -938252972:
                case -29771107:
                    i18 = 12206;
                    iM2761 = C0619.m2761("۬ۧ") ^ i15;
                    i16 = ((iM2761 ^ i14) * 3983) ^ (-286154391);
                    i = -758212011;
                    i4 = iM2761 ^ i;
                    c2 = c2;
                    abstractActivityC17208 = abstractActivityC17208;
                    sArr2 = sArr2;
                    iM8344 = iM8344;
                    i12 = i12;
                    abstractActivityC17207 = abstractActivityC17207;
                    objArr6 = objArr6;
                    objArr5 = objArr5;
                    i17 = i4;
                    viewOnClickListenerC12818 = viewOnClickListenerC12817;
                    break;
                case -833851685:
                case -465463441:
                    C2361 c2363 = c2362;
                    C1519.m5410(c2363, strM33142);
                    C2419.m8168(c2363, iM31611, new DialogInterface.OnClickListener() { // from class: l.ᩴۗ֫
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i22) {
                            int i23 = -1221998184;
                            int i24 = C2287.f7432;
                            int i25 = C1564.f5401;
                            int iM2767 = C0619.m2761("ۡ۟") ^ i24;
                            int i26 = ((iM2767 ^ i25) * (-16525)) ^ 725757173;
                            int i27 = 203807065;
                            while (true) {
                                i23 = ((((i23 ^ i25) * 15885) >> 31) & i26) ^ (iM2767 ^ i27);
                                switch (i23) {
                                    case -1993171602:
                                    case 231580662:
                                        if (C0487.m2356() >= 0) {
                                            iM2767 = (i24 - C0773.m3169("᩸۫")) * (-21);
                                            i26 = ((iM2767 ^ i25) * (-25919)) ^ 1429045891;
                                            i27 = 112924792;
                                        } else {
                                            iM2767 = C0619.m2761("ۡ۬") ^ i25;
                                            i26 = ((iM2767 ^ i24) * (-12837)) ^ (-320918454);
                                            i27 = -1934238085;
                                        }
                                        break;
                                    case -1942840498:
                                    case 2035050775:
                                        if (C1519.f5300 >= 0) {
                                            iM2767 = C0619.m2761("ܶ۠") ^ i25;
                                            i26 = ((iM2767 ^ i24) * (-30509)) ^ 562207456;
                                            i27 = 784084872;
                                        } else {
                                            iM2767 = C0773.m3169("ܺۢ") ^ i24;
                                            i26 = ((iM2767 ^ i25) * 9131) ^ (-77842862);
                                            i27 = 1972858197;
                                        }
                                        break;
                                    case -1869883027:
                                    case 541702898:
                                        C1826.m6301();
                                        if (RunnableC3646.m11813() == 0) {
                                            iM2767 = (C0773.m3169("۬᩶") ^ i25) * (-49);
                                            i26 = ((iM2767 ^ i24) * (-19543)) ^ (-1861631215);
                                            i27 = 1139462395;
                                        } else {
                                            iM2767 = (i24 - C0773.m3169("᩸۫")) * (-21);
                                            i26 = ((iM2767 ^ i25) * (-25919)) ^ 1429045891;
                                            i27 = 112924792;
                                        }
                                        break;
                                    case -1831422304:
                                    case -1405552310:
                                        if (RunnableC0334.f1808 <= 0) {
                                            iM2767 = C0619.m2761("ܶ۠") ^ i25;
                                            i26 = ((iM2767 ^ i24) * (-30509)) ^ 562207456;
                                            i27 = 784084872;
                                        } else {
                                            iM2767 = (i24 - C0773.m3169("ۧ᩸")) * (-117);
                                            i26 = ((iM2767 ^ i25) * (-21923)) ^ (-73720640);
                                            i27 = 1487640406;
                                        }
                                        break;
                                    case -1747616038:
                                    case 1637729680:
                                        if (C1080.f3865 >= 0) {
                                            iM2767 = C0619.m2761("ܶ۠") ^ i25;
                                            i26 = ((iM2767 ^ i24) * (-30509)) ^ 562207456;
                                            i27 = 784084872;
                                        } else {
                                            iM2767 = C0619.m2761("֡ۙ") ^ i24;
                                            i26 = ((iM2767 ^ i25) * (-29043)) ^ (-2052778721);
                                            i27 = -2132686469;
                                        }
                                        break;
                                    case -1690943567:
                                    case 1902958870:
                                        if (C11235.f35427 >= 0) {
                                            iM2767 = (C0773.m3169("ۖ֨") + i25) * (-113);
                                            i26 = ((iM2767 ^ i24) * 4581) ^ 2123341269;
                                            i27 = 1914605542;
                                        } else {
                                            iM2767 = C0773.m3169("᩵ܺ") ^ i24;
                                            i26 = ((iM2767 ^ i25) * (-9107)) ^ 66736459;
                                            i27 = -1310186826;
                                        }
                                        break;
                                    case -1316239966:
                                    case -165485597:
                                        if (C0619.m2763()) {
                                            iM2767 = (C0773.m3169("۬᩶") ^ i25) * (-49);
                                            i26 = ((iM2767 ^ i24) * (-19543)) ^ (-1861631215);
                                            i27 = 1139462395;
                                        } else {
                                            iM2767 = C0619.m2761("ۘ᩶") ^ i24;
                                            i26 = ((iM2767 ^ i25) * (-30173)) ^ 452175551;
                                            i27 = -2044667925;
                                        }
                                        break;
                                    case -889250708:
                                    case 1683610419:
                                        C1564.m5509();
                                        if (C3448.f11240 >= 0) {
                                            iM2767 = (i24 - C0773.m3169("᩸۫")) * (-21);
                                            i26 = ((iM2767 ^ i25) * (-25919)) ^ 1429045891;
                                            i27 = 112924792;
                                        } else {
                                            iM2767 = C0619.m2761("ܶ۠") ^ i25;
                                            i26 = ((iM2767 ^ i24) * (-30509)) ^ 562207456;
                                            i27 = 784084872;
                                        }
                                        break;
                                    case -667303301:
                                    case 999716171:
                                        C0862.m3503();
                                        iM2767 = C0619.m2761("ܶ۠") ^ i25;
                                        i26 = ((iM2767 ^ i24) * (-30509)) ^ 562207456;
                                        i27 = 784084872;
                                        break;
                                    case -529973713:
                                    case 104310652:
                                        if (C4238.f15451 >= 0) {
                                            iM2767 = C0773.m3169("ܳۜ") ^ i24;
                                            i26 = ((iM2767 ^ i25) * (-31259)) ^ (-1465922769);
                                            i27 = 1479457403;
                                        } else {
                                            iM2767 = C0773.m3169("ۤ۫") ^ i25;
                                            i26 = ((iM2767 ^ i24) * 23187) ^ (-82065248);
                                            i27 = -509541755;
                                        }
                                        break;
                                    case -436159456:
                                    case -176155212:
                                        if (C23916.f77426 <= 0) {
                                            iM2767 = C0773.m3169("ܳۜ") ^ i24;
                                            i26 = ((iM2767 ^ i25) * (-31259)) ^ (-1465922769);
                                            i27 = 1479457403;
                                        } else {
                                            iM2767 = C0619.m2761("᩻֨") ^ i25;
                                            i26 = ((iM2767 ^ i24) * (-11423)) ^ (-428031683);
                                            i27 = -693362060;
                                        }
                                        break;
                                    case 16179754:
                                    case 465890639:
                                        if (C2375.f7641 <= 0) {
                                            iM2767 = C0619.m2761("ܶ۠") ^ i25;
                                            i26 = ((iM2767 ^ i24) * (-30509)) ^ 562207456;
                                            i27 = 784084872;
                                        } else {
                                            iM2767 = C0773.m3169("ۙ۠") ^ i25;
                                            i26 = ((iM2767 ^ i24) * (-17265)) ^ 1188888875;
                                            i27 = 2002426210;
                                        }
                                        break;
                                    case 103948386:
                                    case 838633434:
                                        C23522.m52710(C0269.m1784(this.f63007.f41052));
                                        break;
                                    case 755580638:
                                    case 1988446577:
                                        if (C0773.f2792 <= 0) {
                                            iM2767 = C0619.m2761("ܶ۠") ^ i25;
                                            i26 = ((iM2767 ^ i24) * (-30509)) ^ 562207456;
                                            i27 = 784084872;
                                        } else {
                                            iM2767 = C0619.m2761("֨ۧ") ^ i25;
                                            i26 = ((iM2767 ^ i24) * (-13235)) ^ (-645586357);
                                            i27 = -314431146;
                                        }
                                        break;
                                    case 1365037448:
                                    case 2028532170:
                                        if (!C17202.f56030) {
                                            iM2767 = C0619.m2761("ܶ۠") ^ i25;
                                            i26 = ((iM2767 ^ i24) * (-30509)) ^ 562207456;
                                            i27 = 784084872;
                                        } else {
                                            iM2767 = C0773.m3169("ܳۜ") ^ i24;
                                            i26 = ((iM2767 ^ i25) * (-31259)) ^ (-1465922769);
                                            i27 = 1479457403;
                                        }
                                        break;
                                    default:
                                        C2966.m9664();
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    RunnableC1848.m6359(c2363, iM2763, str);
                    C3099.m10090(c2363);
                    break;
                case -819443818:
                case 553836959:
                    objArr2 = objArr6;
                    short[] sArr6 = sArr2;
                    abstractActivityC17204 = abstractActivityC17208;
                    int i22 = i12;
                    int iM2767 = C0619.m2761(RunnableC1848.m6366(sArr6, i22, 3, i18)) ^ 2098490625;
                    sArr = sArr6;
                    abstractActivityC17205 = abstractActivityC17207;
                    i9 = i22;
                    objArr3 = objArr5;
                    strM33142 = C13473.m33142(abstractActivityC17205, iM2767, objArr3);
                    if (C2878.f9462) {
                        int iM316110 = (C0773.m3169("ۢᩴ") ^ i14) * (-109);
                        abstractActivityC17206 = abstractActivityC17205;
                        i16 = ((iM316110 ^ i15) * 1363) ^ 1777597256;
                        objArr4 = objArr2;
                        i17 = iM316110 ^ 1043170665;
                    } else {
                        abstractActivityC17206 = abstractActivityC17205;
                        int iM31620 = (C0773.m3169("۬֫") + i14) * 11;
                        objArr4 = objArr2;
                        i17 = iM31620 ^ (-1056671814);
                        i16 = ((iM31620 ^ i15) * 1019) ^ (-1101268669);
                    }
                    objArr6 = objArr4;
                    AbstractActivityC17204 abstractActivityC172012 = abstractActivityC17206;
                    objArr5 = objArr3;
                    abstractActivityC17208 = abstractActivityC17204;
                    sArr2 = sArr;
                    i12 = i9;
                    abstractActivityC17207 = abstractActivityC172012;
                    break;
                case -806088599:
                case 2118189687:
                    iM8344 = iM8344;
                    int i23 = i11 + 12773476;
                    short s2 = s;
                    int i24 = s2 + 3574;
                    if ((i24 * i24) - (i23 + i23) > 0) {
                        iM3169 = C0619.m2761("ܳۢ") ^ i14;
                        i2 = ((iM3169 ^ i15) * (-7085)) ^ (-1454821419);
                        i3 = -827961977;
                    } else {
                        iM3169 = C0773.m3169("ۙ۬") ^ i14;
                        i2 = ((iM3169 ^ i15) * 5915) ^ (-1585439176);
                        i3 = 571427299;
                    }
                    i4 = iM3169 ^ i3;
                    s = s2;
                    i16 = i2;
                    c2 = c2;
                    abstractActivityC17208 = abstractActivityC17208;
                    sArr2 = sArr2;
                    iM8344 = iM8344;
                    i12 = i12;
                    abstractActivityC17207 = abstractActivityC17207;
                    objArr6 = objArr6;
                    objArr5 = objArr5;
                    i17 = i4;
                    viewOnClickListenerC12818 = viewOnClickListenerC12817;
                    break;
                case -694714985:
                case 2075984988:
                    objArr6 = new Object[i10];
                    objArr6[c2] = c18300.m42687();
                    sArr3 = f41051;
                    if (RunnableC3646.f12471) {
                        objArr6 = objArr6;
                        i20 = 45;
                        abstractActivityC17207 = abstractActivityC17207;
                        i12 = i12;
                        sArr2 = sArr2;
                        abstractActivityC17208 = abstractActivityC17208;
                        iM2762 = (i15 - C0773.m3169("ܿᩴ")) * 51;
                        i5 = ((iM2762 ^ i14) * (-20535)) ^ (-912893123);
                        i6 = -1046433649;
                        i8 = iM2762 ^ i6;
                        i10 = i10;
                        iM8344 = iM8344;
                        objArr6 = objArr6;
                        i17 = i8;
                        i16 = i5;
                        abstractActivityC17208 = abstractActivityC17208;
                        sArr2 = sArr2;
                        i12 = i12;
                        abstractActivityC17207 = abstractActivityC17207;
                        objArr5 = objArr5;
                    } else {
                        int iM2768 = C0619.m2761("ۧۛ") ^ i14;
                        i17 = iM2768 ^ 1919142487;
                        i16 = ((iM2768 ^ i15) * (-29119)) ^ 1181611373;
                        i20 = 45;
                    }
                    break;
                case -600186916:
                case 1214950868:
                    objArr6 = objArr6;
                    iM8344 = iM8344;
                    objArr5 = objArr5;
                    abstractActivityC17207 = abstractActivityC17207;
                    i12 = i12;
                    sArr2 = sArr2;
                    abstractActivityC17208 = abstractActivityC17208;
                    i19 = iM2764 ^ 2126594639;
                    c2 = 0;
                    if (C4282.m13644()) {
                        iM2762 = C0619.m2761("֡ۘ") ^ i14;
                        i5 = ((iM2762 ^ i15) * 14949) ^ 247401781;
                        i6 = 229600828;
                    } else {
                        iM2762 = (i15 - C0773.m3169("ܿᩴ")) * 51;
                        i5 = ((iM2762 ^ i14) * (-20535)) ^ (-912893123);
                        i6 = -1046433649;
                    }
                    i8 = iM2762 ^ i6;
                    i10 = i10;
                    iM8344 = iM8344;
                    objArr6 = objArr6;
                    i17 = i8;
                    i16 = i5;
                    abstractActivityC17208 = abstractActivityC17208;
                    sArr2 = sArr2;
                    i12 = i12;
                    abstractActivityC17207 = abstractActivityC17207;
                    objArr5 = objArr5;
                    break;
                case -484247713:
                case -268318613:
                    objArr6 = objArr6;
                    AbstractActivityC17204 abstractActivityC172013 = c5360.f18798;
                    int i25 = DialogInterfaceC8327.f27315;
                    c2361 = new C2361(abstractActivityC172013);
                    C2485.m8345(c2361, iM31612);
                    abstractActivityC17208 = c5360.f18798;
                    C18300 c18302 = viewOnClickListenerC12818.f41052;
                    if (C3998.f13671 == 0) {
                        int iM31621 = (C0773.m3169("ܳܿ") ^ i15) * (-91);
                        c18300 = c18302;
                        i16 = ((iM31621 ^ i14) * 5033) ^ (-1766951625);
                        objArr = objArr6;
                        i17 = iM31621 ^ 533285007;
                        objArr6 = objArr;
                    } else {
                        c18300 = c18302;
                        iM8344 = iM8344;
                        objArr5 = objArr5;
                        c2 = c2;
                        abstractActivityC17207 = abstractActivityC17207;
                        int iM316111 = (C0773.m3169("ۤܳ") ^ i14) * 77;
                        i16 = ((iM316111 ^ i15) * (-11163)) ^ (-1007917837);
                        i4 = iM316111 ^ 1705695109;
                        c2 = c2;
                        abstractActivityC17207 = abstractActivityC17207;
                        objArr5 = objArr5;
                        iM8344 = iM8344;
                        objArr6 = objArr6;
                        i17 = i4;
                        viewOnClickListenerC12818 = viewOnClickListenerC12817;
                    }
                    break;
                case -479749740:
                case 616193036:
                    i18 = 50574;
                    iM2761 = C0619.m2761("۬ۧ") ^ i15;
                    i16 = ((iM2761 ^ i14) * 3983) ^ (-286154391);
                    i = -758212011;
                    i4 = iM2761 ^ i;
                    c2 = c2;
                    abstractActivityC17208 = abstractActivityC17208;
                    sArr2 = sArr2;
                    iM8344 = iM8344;
                    i12 = i12;
                    abstractActivityC17207 = abstractActivityC17207;
                    objArr6 = objArr6;
                    objArr5 = objArr5;
                    i17 = i4;
                    viewOnClickListenerC12818 = viewOnClickListenerC12817;
                    break;
                case -447303081:
                case 1629598312:
                    ActivityC20779.m47538(c5360.f18798, C0269.m1784(viewOnClickListenerC12818.f41052), viewOnClickListenerC12818.f41055.getDrawable(), i10, str);
                    break;
                case -230800738:
                case 40987016:
                    objArr6 = objArr6;
                    iM8344 = iM8344;
                    objArr5 = objArr5;
                    abstractActivityC17207 = abstractActivityC17207;
                    i12 = i12;
                    sArr2 = sArr2;
                    abstractActivityC17208 = abstractActivityC17208;
                    c = c2;
                    iM2764 = C0619.m2761(C0269.m1785(f41051, 27, 3, i18));
                    iM31610 = (C0773.m3169("֨֨") ^ i15) * 55;
                    i5 = ((iM31610 ^ i14) * (-2201)) ^ (-1986999888);
                    i7 = 1385366480;
                    r3 = i10;
                    i8 = iM31610 ^ i7;
                    c2 = c;
                    i10 = r3;
                    iM8344 = iM8344;
                    objArr6 = objArr6;
                    i17 = i8;
                    i16 = i5;
                    abstractActivityC17208 = abstractActivityC17208;
                    sArr2 = sArr2;
                    i12 = i12;
                    abstractActivityC17207 = abstractActivityC17207;
                    objArr5 = objArr5;
                    break;
                case 501983181:
                case 1697054420:
                    new C15579(c5360.f18798, viewOnClickListenerC12818.f41052);
                    break;
                case 602346177:
                case 1814308363:
                    RunnableC0334.m2063();
                    C0487.m2356();
                    objArr6 = objArr6;
                    iM8344 = iM8344;
                    objArr5 = objArr5;
                    abstractActivityC17207 = abstractActivityC17207;
                    i12 = i12;
                    sArr2 = sArr2;
                    abstractActivityC17208 = abstractActivityC17208;
                    iM2762 = C0619.m2761("᩻᩹") ^ i14;
                    i5 = ((iM2762 ^ i15) * 2509) ^ (-1237522258);
                    i6 = 178371405;
                    i8 = iM2762 ^ i6;
                    i10 = i10;
                    iM8344 = iM8344;
                    objArr6 = objArr6;
                    i17 = i8;
                    i16 = i5;
                    abstractActivityC17208 = abstractActivityC17208;
                    sArr2 = sArr2;
                    i12 = i12;
                    abstractActivityC17207 = abstractActivityC17207;
                    objArr5 = objArr5;
                    break;
                case 1049868669:
                case 1864753041:
                    objArr6 = objArr6;
                    i12 = i12;
                    sArr2 = sArr2;
                    abstractActivityC17208 = abstractActivityC17208;
                    Object[] objArr9 = objArr5;
                    AbstractActivityC17204 abstractActivityC172014 = c5360.f18798;
                    int i26 = DialogInterfaceC8327.f27315;
                    C2361 c2364 = new C2361(abstractActivityC172014);
                    C2485.m8345(c2364, iM31612);
                    AbstractActivityC17204 abstractActivityC172015 = c5360.f18798;
                    C18300 c18303 = viewOnClickListenerC12818.f41052;
                    if (C20932.f66974 <= 0) {
                        c2362 = c2364;
                        objArr5 = objArr9;
                        iM8344 = iM8344;
                        abstractActivityC17207 = abstractActivityC172015;
                        c18301 = c18303;
                        iM2762 = C0619.m2761("᩻᩹") ^ i14;
                        i5 = ((iM2762 ^ i15) * 2509) ^ (-1237522258);
                        i6 = 178371405;
                        i8 = iM2762 ^ i6;
                        i10 = i10;
                        iM8344 = iM8344;
                        objArr6 = objArr6;
                        i17 = i8;
                        i16 = i5;
                        abstractActivityC17208 = abstractActivityC17208;
                        sArr2 = sArr2;
                        i12 = i12;
                        abstractActivityC17207 = abstractActivityC17207;
                        objArr5 = objArr5;
                    } else {
                        int iM31622 = (C0773.m3169("ۛ֡") + i15) * 75;
                        i16 = ((iM31622 ^ i14) * (-1457)) ^ 147425002;
                        c2362 = c2364;
                        objArr6 = objArr6;
                        i17 = iM31622 ^ (-2002871190);
                        objArr5 = objArr9;
                        abstractActivityC17208 = abstractActivityC17208;
                        sArr2 = sArr2;
                        i12 = i12;
                        abstractActivityC17207 = abstractActivityC172015;
                        c18301 = c18303;
                    }
                    break;
                case 1585142316:
                case 1764523832:
                    objArr6 = objArr6;
                    iM8344 = iM8344;
                    objArr5 = objArr5;
                    abstractActivityC17207 = abstractActivityC17207;
                    i12 = i12;
                    sArr2 = sArr2;
                    abstractActivityC17208 = abstractActivityC17208;
                    iM31611 = C0773.m3169(C2288.m7761(f41051, 33, 3, i18)) ^ 2099516285;
                    if (RunnableC1848.f6235) {
                        iM2762 = C0619.m2761("᩻᩹") ^ i14;
                        i5 = ((iM2762 ^ i15) * 2509) ^ (-1237522258);
                        i6 = 178371405;
                    } else {
                        iM2762 = (C0619.m2761("۫ᩴ") ^ i14) * (-123);
                        i5 = ((iM2762 ^ i15) * 3817) ^ 718601161;
                        i6 = 1065112582;
                    }
                    i8 = iM2762 ^ i6;
                    i10 = i10;
                    iM8344 = iM8344;
                    objArr6 = objArr6;
                    i17 = i8;
                    i16 = i5;
                    abstractActivityC17208 = abstractActivityC17208;
                    sArr2 = sArr2;
                    i12 = i12;
                    abstractActivityC17207 = abstractActivityC17207;
                    objArr5 = objArr5;
                    break;
                default:
                    C5360 c5361 = viewOnClickListenerC12818.f41054;
                    iM8344 = C2485.m8344(menuItem);
                    strM11252 = C3448.m11252(f41051, 21, 3, i18);
                    int iM31623 = (C0773.m3169("ܺۗ") + i15) * (-41);
                    i2 = ((iM31623 ^ i14) * 28089) ^ (-1144369810);
                    i4 = iM31623 ^ (-1476495460);
                    c5360 = c5361;
                    i16 = i2;
                    c2 = c2;
                    abstractActivityC17208 = abstractActivityC17208;
                    sArr2 = sArr2;
                    iM8344 = iM8344;
                    i12 = i12;
                    abstractActivityC17207 = abstractActivityC17207;
                    objArr6 = objArr6;
                    objArr5 = objArr5;
                    i17 = i4;
                    viewOnClickListenerC12818 = viewOnClickListenerC12817;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0211 A[PHI: r2 r9 r10 r11 r13 r14 r15 r20
      0x0211: PHI (r2v3 l.ۚۗ֫) = (r2v1 l.ۚۗ֫), (r2v1 l.ۚۗ֫), (r2v2 l.ۚۗ֫), (r2v1 l.ۚۗ֫), (r2v1 l.ۚۗ֫) binds: [B:57:0x020f, B:46:0x0194, B:42:0x016f, B:34:0x0126, B:30:0x0105] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r9v3 int) = (r9v2 int), (r9v1 int), (r9v1 int), (r9v1 int), (r9v1 int) binds: [B:57:0x020f, B:46:0x0194, B:42:0x016f, B:34:0x0126, B:30:0x0105] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r10v3 int) = (r10v2 int), (r10v1 int), (r10v1 int), (r10v1 int), (r10v1 int) binds: [B:57:0x020f, B:46:0x0194, B:42:0x016f, B:34:0x0126, B:30:0x0105] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r11v3 int) = (r11v2 int), (r11v1 int), (r11v1 int), (r11v1 int), (r11v1 int) binds: [B:57:0x020f, B:46:0x0194, B:42:0x016f, B:34:0x0126, B:30:0x0105] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r13v2 short[]) = (r13v1 short[]), (r13v1 short[]), (r13v1 short[]), (r13v1 short[]), (r13v3 short[]) binds: [B:57:0x020f, B:46:0x0194, B:42:0x016f, B:34:0x0126, B:30:0x0105] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r14v2 int) = (r14v1 int), (r14v1 int), (r14v1 int), (r14v1 int), (r14v3 int) binds: [B:57:0x020f, B:46:0x0194, B:42:0x016f, B:34:0x0126, B:30:0x0105] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r15v2 int) = (r15v1 int), (r15v1 int), (r15v1 int), (r15v1 int), (r15v3 int) binds: [B:57:0x020f, B:46:0x0194, B:42:0x016f, B:34:0x0126, B:30:0x0105] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r20v3 java.lang.String) = 
      (r20v1 java.lang.String)
      (r20v2 java.lang.String)
      (r20v1 java.lang.String)
      (r20v1 java.lang.String)
      (r20v1 java.lang.String)
     binds: [B:57:0x020f, B:46:0x0194, B:42:0x016f, B:34:0x0126, B:30:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x024b A[PHI: r4 r7 r8
      0x024b: PHI (r4v3 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:61:0x0249, B:26:0x00e2, B:9:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r7v3 short) = (r7v2 short), (r7v1 short), (r7v1 short) binds: [B:61:0x0249, B:26:0x00e2, B:9:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r8v3 int) = (r8v2 int), (r8v1 int), (r8v1 int) binds: [B:61:0x0249, B:26:0x00e2, B:9:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x029b A[PHI: r3 r6 r21
      0x029b: PHI (r3v3 l.۫ۛ֫) = (r3v1 l.۫ۛ֫), (r3v1 l.۫ۛ֫), (r3v2 l.۫ۛ֫), (r3v1 l.۫ۛ֫), (r3v1 l.۫ۛ֫), (r3v1 l.۫ۛ֫) binds: [B:69:0x0299, B:65:0x027b, B:38:0x014a, B:16:0x008d, B:12:0x006e, B:9:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x029b: PHI (r6v3 char) = (r6v1 char), (r6v2 char), (r6v1 char), (r6v1 char), (r6v1 char), (r6v1 char) binds: [B:69:0x0299, B:65:0x027b, B:38:0x014a, B:16:0x008d, B:12:0x006e, B:9:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x029b: PHI (r21v5 short[]) = (r21v4 short[]), (r21v3 short[]), (r21v3 short[]), (r21v3 short[]), (r21v3 short[]), (r21v3 short[]) binds: [B:69:0x0299, B:65:0x027b, B:38:0x014a, B:16:0x008d, B:12:0x006e, B:9:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m31776(ViewOnClickListenerC12817 viewOnClickListenerC12817, DialogInterfaceC8327 dialogInterfaceC8327) {
        int iM3169;
        int i;
        int i2;
        C5360 c5360 = null;
        RunnableC12905 runnableC12905 = null;
        int iM31610 = 0;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        short[] sArr = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = -979990045;
        int i11 = C1321.f4751;
        int i12 = C1826.f6190;
        int iM31611 = C0773.m3169("֫ۖ") ^ i12;
        int i13 = ((iM31611 ^ i11) * (-6245)) ^ 2100500146;
        int i14 = iM31611 ^ (-86221041);
        short[] sArr2 = null;
        String strM7812 = null;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i11) * (-22765)) >> 31));
            switch (i10) {
                case -2114558367:
                case 797065696:
                    break;
                case -2038449991:
                case -1905203546:
                    i7 = 48329;
                    iM3169 = (i11 - C0773.m3169("ۛ᩶")) * (-73);
                    i = ((iM3169 ^ i12) * 17105) ^ 1097029989;
                    i2 = -1729050485;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1753410247:
                case -130321494:
                    c = 16;
                    if (C1542.f5343 <= 0) {
                        iM3169 = (C0619.m2761("ܺ᩻") + i11) * (-71);
                        i = ((iM3169 ^ i12) * 9615) ^ 359762544;
                        i2 = -984862271;
                    } else {
                        iM3169 = (C0619.m2761("۟ۧ") + i11) * (-11);
                        i = ((iM3169 ^ i12) * 10069) ^ 53839309;
                        i2 = -530543946;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1640375709:
                case 1729331260:
                    sArr2 = f41051;
                    if (C2310.f7472 >= 0) {
                        iM3169 = (C0619.m2761("ܺ᩻") + i11) * (-71);
                        i = ((iM3169 ^ i12) * 9615) ^ 359762544;
                        i2 = -984862271;
                    } else {
                        iM3169 = (C0773.m3169("᩹ۤ") + i12) * (-117);
                        i = ((iM3169 ^ i11) * 31361) ^ (-999287154);
                        i2 = 436101964;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1365339223:
                case -18725900:
                    C3998.m12920();
                    if (C2310.f7472 >= 0) {
                        iM3169 = (i12 - C0619.m2761("᩹᩵")) * q.h;
                        i = ((iM3169 ^ i11) * (-23603)) ^ (-210136670);
                        i2 = -1284572614;
                    } else {
                        iM3169 = (C0619.m2761("ܺ᩻") + i11) * (-71);
                        i = ((iM3169 ^ i12) * 9615) ^ 359762544;
                        i2 = -984862271;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -1262650276:
                case -857245417:
                    C5360.m16011(c5360, runnableC12905);
                    if (C20932.f66974 <= 0) {
                        iM3169 = (C0619.m2761("ۘܿ") ^ i12) * (-15);
                        i = ((iM3169 ^ i11) * (-15737)) ^ 1019336149;
                        i2 = 1837500691;
                    } else {
                        iM3169 = (C0773.m3169("ۖۧ") ^ i11) * (-3);
                        i = ((iM3169 ^ i12) * 27163) ^ (-254483331);
                        i2 = 2117241275;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -979577135:
                case 558667574:
                    runnableC12905 = new RunnableC12905(1, viewOnClickListenerC12817);
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = (C0619.m2761("ܺ᩻") + i11) * (-71);
                        i = ((iM3169 ^ i12) * 9615) ^ 359762544;
                        i2 = -984862271;
                    } else {
                        iM3169 = (i11 - C0619.m2761("ۤۢ")) * (-65);
                        i = ((iM3169 ^ i12) * (-10345)) ^ 824743543;
                        i2 = 2139112660;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -815027304:
                case 236501725:
                    C3779.m12264();
                    AbstractC0116.m1243();
                    iM3169 = (i12 - C0619.m2761("᩹᩵")) * q.h;
                    i = ((iM3169 ^ i11) * (-23603)) ^ (-210136670);
                    i2 = -1284572614;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -558526290:
                case -547344139:
                    i4 = i3 * i3;
                    i5 = s * s;
                    i6 = 336649104;
                    if (C1826.f6190 <= 0) {
                        iM3169 = (C0619.m2761("ۘܿ") ^ i12) * (-15);
                        i = ((iM3169 ^ i11) * (-15737)) ^ 1019336149;
                        i2 = 1837500691;
                    } else {
                        iM3169 = (i12 - C0773.m3169("ۤᩴ")) * (-49);
                        i = ((iM3169 ^ i11) * (-25949)) ^ 929200229;
                        i2 = -91475208;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -546988829:
                case 1912956601:
                    sArr = f41051;
                    i8 = 17;
                    i9 = 3;
                    if (C2966.m9664()) {
                        iM3169 = (C0773.m3169("۠ۡ") ^ i12) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM3169 ^ i11) * 21345) ^ 916447361;
                        i2 = -1749925461;
                    } else {
                        iM3169 = (C0619.m2761("ۘܿ") ^ i12) * (-15);
                        i = ((iM3169 ^ i11) * (-15737)) ^ 1019336149;
                        i2 = 1837500691;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -430136565:
                case -107724679:
                    C2375.m8064(dialogInterfaceC8327);
                    strM7812 = C2310.m7812(viewOnClickListenerC12817.f41052);
                    if (C1519.f5300 >= 0) {
                        iM3169 = (C0619.m2761("ۘܿ") ^ i12) * (-15);
                        i = ((iM3169 ^ i11) * (-15737)) ^ 1019336149;
                        i2 = 1837500691;
                    } else {
                        iM3169 = C0619.m2761("ܳ۠") ^ i12;
                        i = ((iM3169 ^ i11) * (-32273)) ^ (-383592174);
                        i2 = 811072106;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -352633122:
                case 123397643:
                    i7 = 52041;
                    iM3169 = (i11 - C0773.m3169("ۛ᩶")) * (-73);
                    i = ((iM3169 ^ i12) * 17105) ^ 1097029989;
                    i2 = -1729050485;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -249410267:
                case 376477843:
                    C1564.m5509();
                    C20932.m47848();
                    break;
                case -198597022:
                case 1254306081:
                    int i15 = i5 + i6;
                    if (i4 - (i15 + i15) > 0) {
                        iM3169 = C0773.m3169("ܽۢ") ^ i11;
                        i = ((iM3169 ^ i12) * (-25639)) ^ (-1906494482);
                        i2 = 552042631;
                    } else {
                        iM3169 = C0773.m3169("ۜۜ") ^ i12;
                        i = ((iM3169 ^ i11) * 2653) ^ 1711654393;
                        i2 = 1673465452;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case -143113630:
                case 2109748335:
                    C3099.m10095();
                    if (C3690.f12684 <= 0) {
                        iM3169 = (C0619.m2761("ܺ᩻") + i11) * (-71);
                        i = ((iM3169 ^ i12) * 9615) ^ 359762544;
                        i2 = -984862271;
                    } else {
                        iM3169 = C0773.m3169("᩻᩻") ^ i12;
                        i = ((iM3169 ^ i11) * (-19363)) ^ 1596854993;
                        i2 = -1710997645;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case 254919713:
                case 1601682673:
                    iM31610 = C0773.m3169(C20932.m47853(sArr, i8, i9, i7));
                    if (C3033.f9831 >= 0) {
                        iM3169 = (C0619.m2761("֫ۘ") + i11) * 23;
                        i = ((iM3169 ^ i12) * (-8271)) ^ (-408023646);
                        i2 = -1978904873;
                    } else {
                        iM3169 = C0619.m2761("᩸᩻") ^ i12;
                        i = ((iM3169 ^ i11) * 31463) ^ (-524985918);
                        i2 = -329686263;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case 923039753:
                case 1790470140:
                    s = sArr2[c];
                    i3 = s + 18348;
                    if (C0773.m3161() != 0) {
                        iM3169 = (C0619.m2761("֫ۘ") + i11) * 23;
                        i = ((iM3169 ^ i12) * (-8271)) ^ (-408023646);
                        i2 = -1978904873;
                    } else {
                        iM3169 = C0619.m2761("ۧܿ") ^ i11;
                        i = ((iM3169 ^ i12) * (-4611)) ^ (-354466993);
                        i2 = 2046309046;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case 938350797:
                case 1420963712:
                    C23522.m52720(strM7812);
                    c5360 = viewOnClickListenerC12817.f41054;
                    if (C3734.m12152() >= 0) {
                        iM3169 = (C0619.m2761("ۘܿ") ^ i12) * (-15);
                        i = ((iM3169 ^ i11) * (-15737)) ^ 1019336149;
                        i2 = 1837500691;
                    } else {
                        iM3169 = C0619.m2761("ۤ᩶") ^ i12;
                        i = ((iM3169 ^ i11) * 20413) ^ (-688019663);
                        i2 = 1168725187;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case 1420316031:
                case 1841489155:
                    ((RunnableC6697) c5360.f18801).run();
                    iM3169 = (C0773.m3169("᩸ܶ") ^ i11) * (-9);
                    i = ((iM3169 ^ i12) * 28405) ^ 258217989;
                    i2 = 184988915;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                case 2013253403:
                case 2063690131:
                    C2702.m8876();
                    if (C17202.f56030) {
                        iM3169 = (C0619.m2761("ܺ᩻") + i11) * (-71);
                        i = ((iM3169 ^ i12) * 9615) ^ 359762544;
                        i2 = -984862271;
                    } else {
                        iM3169 = (C0619.m2761("֫ۘ") + i11) * 23;
                        i = ((iM3169 ^ i12) * (-8271)) ^ (-408023646);
                        i2 = -1978904873;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
                default:
                    C3077.m10039(2118307559 ^ iM31610);
                    if (c5360.f18801 != null) {
                        iM3169 = C0773.m3169("ۛۗ") ^ i11;
                        i = ((iM3169 ^ i12) * (-26801)) ^ (-1850942404);
                        i2 = -231716520;
                    } else {
                        iM3169 = (C0773.m3169("᩸ܶ") ^ i11) * (-9);
                        i = ((iM3169 ^ i12) * 28405) ^ 258217989;
                        i2 = 184988915;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    break;
            }
            return;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM2761;
        int i;
        int iM2762;
        int i2;
        int i3;
        short[] sArr;
        C9590 c9590;
        short[] sArr2;
        int i4;
        AbstractC22044 abstractC22044M42671;
        C9590 c9591;
        int iM3169;
        int i5;
        int i6;
        int i7;
        int iM2763;
        int i8;
        final ViewOnClickListenerC12817 viewOnClickListenerC12817 = this;
        int i9 = -1556213505;
        int i10 = AbstractC0116.f1064;
        int i11 = RunnableC3055.f9898;
        int iM2764 = C0619.m2761("ۧ᩸") ^ i11;
        int i12 = ((iM2764 ^ i10) * (-1843)) ^ (-729311591);
        int i13 = iM2764 ^ (-783617585);
        AbstractC22044 abstractC22044 = null;
        DialogInterface.OnClickListener onClickListener = null;
        Button buttonM22433 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i14 = 0;
        boolean z = false;
        int i15 = 0;
        int i16 = 0;
        int iM31610 = 0;
        int i17 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        C9590 c9592 = null;
        int i18 = 0;
        C18300 c18300 = null;
        View view2 = null;
        final DialogInterfaceC8327 dialogInterfaceC8327M23911 = null;
        short[] sArr6 = null;
        int i19 = 0;
        C5360 c5360 = null;
        C2361 c2361 = null;
        int i20 = 0;
        boolean z2 = false;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i10) * 5345) >> 31));
            switch (i9) {
                case -2130949150:
                case 120019847:
                    int i21 = i18;
                    sArr4 = sArr4;
                    int iM31611 = C0773.m3169(C1321.m4861(sArr4, i21, 3, i14));
                    if (C13473.f42873 != 0) {
                        i18 = i21;
                        i16 = 2128516931;
                        i15 = iM31611;
                        i20 = i20;
                        iM2763 = (i10 - C0619.m2761("ܳܰ")) * (-93);
                        i5 = ((iM2763 ^ i11) * (-16065)) ^ (-2025952657);
                        i8 = -382176313;
                        i7 = iM2763 ^ i8;
                        sArr4 = sArr4;
                        int i22 = i20;
                        c9592 = c9592;
                        i12 = i5;
                        sArr6 = sArr6;
                        i13 = i7;
                        i20 = i22;
                    } else {
                        int iM2765 = C0619.m2761("᩷֡") ^ i10;
                        int i23 = ((iM2765 ^ i11) * 30017) ^ (-29447089);
                        sArr4 = sArr4;
                        i13 = iM2765 ^ 624055130;
                        i18 = i21;
                        i15 = iM31611;
                        i12 = i23;
                        i16 = 2128516931;
                    }
                    break;
                case -2098631487:
                case 753534866:
                    sArr6 = sArr6;
                    sArr4 = sArr4;
                    c9592 = c9592;
                    i20 = i20;
                    s = sArr3[c];
                    s2 = 9980;
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0773.m3169("۠۫") ^ i11;
                        i12 = ((iM2761 ^ i10) * (-30135)) ^ (-927816940);
                        i = 286238248;
                    } else {
                        iM2761 = C0773.m3169("ܺۗ") ^ i10;
                        i12 = ((iM2761 ^ i11) * 1457) ^ (-781076654);
                        i = 650926234;
                    }
                    int i24 = iM2761 ^ i;
                    i20 = i20;
                    sArr6 = sArr6;
                    c9592 = c9592;
                    i13 = i24;
                    sArr4 = sArr4;
                    viewOnClickListenerC12817 = this;
                    break;
                case -2096796349:
                case 1456140867:
                    sArr4 = sArr4;
                    AbstractActivityC17204 abstractActivityC17204 = c5360.f18798;
                    int i25 = DialogInterfaceC8327.f27315;
                    c2361 = new C2361(abstractActivityC17204);
                    C9590 c9593 = c9592;
                    i20 = i20;
                    View view3 = c9593.f31055;
                    if (C2023.m6964() <= 0) {
                        c9592 = c9593;
                        view2 = view3;
                        sArr6 = sArr6;
                        iM2761 = (C0773.m3169("᩹۫") ^ i10) * (-83);
                        i12 = ((iM2761 ^ i11) * 27637) ^ 1857329311;
                        i = 450109768;
                        int i26 = iM2761 ^ i;
                        i20 = i20;
                        sArr6 = sArr6;
                        c9592 = c9592;
                        i13 = i26;
                        sArr4 = sArr4;
                        viewOnClickListenerC12817 = this;
                    } else {
                        int iM31612 = C0773.m3169("ᩴۙ") ^ i10;
                        sArr4 = sArr4;
                        c9592 = c9593;
                        i12 = ((iM31612 ^ i11) * 29837) ^ (-1020623462);
                        i20 = i20;
                        i13 = iM31612 ^ (-812751583);
                        view2 = view3;
                    }
                    break;
                case -1823656741:
                case -1269857374:
                    sArr6 = sArr6;
                    c9592 = c9592;
                    short[] sArr7 = sArr4;
                    i20 = i20;
                    onClickListener = null;
                    C18300 c18301 = c18300;
                    c9592.m25071(c18301, abstractC22044.mo4285(), null);
                    if (viewOnClickListenerC12817.f41052.m42667() != null) {
                        iM3169 = (C0773.m3169("᩵ۤ") ^ i11) * 65;
                        i5 = ((iM3169 ^ i10) * 20209) ^ 109231760;
                        i6 = -1126885895;
                    } else {
                        iM3169 = (i10 - C0773.m3169("ܶܳ")) * 29;
                        i5 = ((iM3169 ^ i11) * 10275) ^ (-380894499);
                        i6 = 1066462459;
                    }
                    i7 = iM3169 ^ i6;
                    sArr4 = sArr7;
                    c18300 = c18301;
                    z2 = false;
                    int i27 = i20;
                    c9592 = c9592;
                    i12 = i5;
                    sArr6 = sArr6;
                    i13 = i7;
                    i20 = i27;
                    break;
                case -1589548007:
                case 844851478:
                    i14 = 13756;
                    iM2761 = (C0773.m3169("᩵ᩳ") + i11) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i12 = ((iM2761 ^ i10) * (-4751)) ^ 2132117575;
                    i = -431900522;
                    int i28 = iM2761 ^ i;
                    i20 = i20;
                    sArr6 = sArr6;
                    c9592 = c9592;
                    i13 = i28;
                    sArr4 = sArr4;
                    viewOnClickListenerC12817 = this;
                    break;
                case -1548567496:
                case -82604633:
                    C1542.m5459();
                    sArr4 = sArr4;
                    i20 = i20;
                    iM2763 = (i10 - C0619.m2761("ܳܰ")) * (-93);
                    i5 = ((iM2763 ^ i11) * (-16065)) ^ (-2025952657);
                    i8 = -382176313;
                    i7 = iM2763 ^ i8;
                    sArr4 = sArr4;
                    int i29 = i20;
                    c9592 = c9592;
                    i12 = i5;
                    sArr6 = sArr6;
                    i13 = i7;
                    i20 = i29;
                    break;
                case -1476163193:
                case 214912355:
                    C11235.m28299(buttonM22433, new View.OnClickListener() { // from class: l.᩷ۗ֫
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            ViewOnClickListenerC12817.m31784(this.f69416);
                        }
                    });
                    iM2762 = (C0773.m3169("۠ܿ") + i10) * (-101);
                    i2 = ((iM2762 ^ i11) * (-18651)) ^ (-1273180910);
                    i3 = 774270938;
                    i13 = iM2762 ^ i3;
                    i12 = i2;
                    break;
                case -1468828534:
                case -1059760612:
                    iM31610 = C0773.m3169(C0950.m3780(sArr6, 70, 3, i14));
                    i17 = 2119569501;
                    if (!C0619.f2439) {
                        iM2762 = C0619.m2761("ܽ᩺") ^ i10;
                        i2 = ((iM2762 ^ i11) * (-16619)) ^ (-336385866);
                        i3 = 951273401;
                        i13 = iM2762 ^ i3;
                        i12 = i2;
                    } else {
                        sArr6 = sArr6;
                        sArr4 = sArr4;
                        c9592 = c9592;
                        i20 = i20;
                        iM2761 = C0773.m3169("۠۫") ^ i11;
                        i12 = ((iM2761 ^ i10) * (-30135)) ^ (-927816940);
                        i = 286238248;
                        int i210 = iM2761 ^ i;
                        i20 = i20;
                        sArr6 = sArr6;
                        c9592 = c9592;
                        i13 = i210;
                        sArr4 = sArr4;
                        viewOnClickListenerC12817 = this;
                    }
                    break;
                case -1468716453:
                case -879517064:
                    View view4 = view2;
                    C1343.m4952(c2361, view4);
                    sArr4 = f41051;
                    i18 = 67;
                    if (C3033.f9831 >= 0) {
                        view2 = view4;
                        sArr6 = sArr6;
                        sArr4 = sArr4;
                        c9592 = c9592;
                        i20 = i20;
                        iM2761 = C0773.m3169("۠۫") ^ i11;
                        i12 = ((iM2761 ^ i10) * (-30135)) ^ (-927816940);
                        i = 286238248;
                        int i211 = iM2761 ^ i;
                        i20 = i20;
                        sArr6 = sArr6;
                        c9592 = c9592;
                        i13 = i211;
                        sArr4 = sArr4;
                        viewOnClickListenerC12817 = this;
                    } else {
                        int iM31613 = C0773.m3169("ۗۗ") ^ i11;
                        view2 = view4;
                        i12 = ((iM31613 ^ i10) * 3563) ^ 652983853;
                        i13 = iM31613 ^ (-314870045);
                    }
                    break;
                case -1332961698:
                case -711557253:
                    C3077.m10041();
                    if (C1542.f5343 > 0) {
                        sArr6 = sArr6;
                        sArr4 = sArr4;
                        c9592 = c9592;
                        i20 = i20;
                        iM2761 = C0773.m3169("۠۫") ^ i11;
                        i12 = ((iM2761 ^ i10) * (-30135)) ^ (-927816940);
                        i = 286238248;
                        int i212 = iM2761 ^ i;
                        i20 = i20;
                        sArr6 = sArr6;
                        c9592 = c9592;
                        i13 = i212;
                        sArr4 = sArr4;
                        viewOnClickListenerC12817 = this;
                    } else {
                        sArr4 = sArr4;
                        i20 = i20;
                        iM2763 = (i10 - C0619.m2761("ܳܰ")) * (-93);
                        i5 = ((iM2763 ^ i11) * (-16065)) ^ (-2025952657);
                        i8 = -382176313;
                        i7 = iM2763 ^ i8;
                        sArr4 = sArr4;
                        int i213 = i20;
                        c9592 = c9592;
                        i12 = i5;
                        sArr6 = sArr6;
                        i13 = i7;
                        i20 = i213;
                    }
                    break;
                case -1266560460:
                case 2003243051:
                    if (viewOnClickListenerC12817.f41052.m42686()) {
                        iM2762 = C0773.m3169("ۖۤ") ^ i11;
                        i2 = ((iM2762 ^ i10) * 5681) ^ 1756620786;
                        i3 = 1109370061;
                    } else {
                        iM2762 = C0619.m2761("ۢۚ") ^ i11;
                        i2 = ((iM2762 ^ i10) * (-12883)) ^ (-1893442314);
                        i3 = 494786835;
                    }
                    i13 = iM2762 ^ i3;
                    i12 = i2;
                    break;
                case -825754958:
                case 123754661:
                    z = true;
                    iM2763 = (i10 - C0619.m2761("ᩴۡ")) * 51;
                    sArr6 = sArr6;
                    i5 = ((iM2763 ^ i11) * 17005) ^ (-1334229051);
                    i8 = 1384292990;
                    i7 = iM2763 ^ i8;
                    sArr4 = sArr4;
                    int i214 = i20;
                    c9592 = c9592;
                    i12 = i5;
                    sArr6 = sArr6;
                    i13 = i7;
                    i20 = i214;
                    break;
                case -790975188:
                case -145498180:
                    C2485.m8358(buttonM22433, 8);
                    iM2762 = (C0773.m3169("۠ܿ") + i10) * (-101);
                    i2 = ((iM2762 ^ i11) * (-18651)) ^ (-1273180910);
                    i3 = 774270938;
                    i13 = iM2762 ^ i3;
                    i12 = i2;
                    break;
                case -708412395:
                case 400180507:
                    dialogInterfaceC8327M23911 = C8947.m23911(c2361, i19, onClickListener, C0619.m2761(C23916.m53420(sArr5, i20, 3, i14)) ^ 2122140436, onClickListener);
                    buttonM22433 = dialogInterfaceC8327M23911.m22433();
                    if (z) {
                        iM2762 = (C0619.m2761("ܶ᩹") ^ i11) * (-41);
                        i2 = ((iM2762 ^ i10) * 10005) ^ (-156317890);
                        i3 = 889194325;
                    } else {
                        iM2762 = (i10 - C0619.m2761("ۧۜ")) * (-29);
                        i2 = ((iM2762 ^ i11) * (-25511)) ^ 857286841;
                        i3 = 1481435385;
                    }
                    i13 = iM2762 ^ i3;
                    i12 = i2;
                    break;
                case -414164334:
                case 1747579322:
                    C2419.m8174();
                    AbstractC0116.m1243();
                    break;
                case -204504213:
                case 1511255591:
                    if (!C0862.m3503()) {
                        iM2762 = C0773.m3169("۟ܺ") ^ i10;
                        i2 = ((iM2762 ^ i11) * (-12479)) ^ (-980520935);
                        i3 = 1471871192;
                        i13 = iM2762 ^ i3;
                        i12 = i2;
                    } else {
                        sArr4 = sArr4;
                        i20 = i20;
                        iM2763 = (i10 - C0619.m2761("ܳܰ")) * (-93);
                        i5 = ((iM2763 ^ i11) * (-16065)) ^ (-2025952657);
                        i8 = -382176313;
                        i7 = iM2763 ^ i8;
                        sArr4 = sArr4;
                        int i215 = i20;
                        c9592 = c9592;
                        i12 = i5;
                        sArr6 = sArr6;
                        i13 = i7;
                        i20 = i215;
                    }
                    break;
                case -144575825:
                case 1057828953:
                    C23916.m53431(buttonM22433, z2);
                    iM2762 = (C0773.m3169("۠ܿ") + i10) * (-101);
                    i2 = ((iM2762 ^ i11) * (-18651)) ^ (-1273180910);
                    i3 = 774270938;
                    i13 = iM2762 ^ i3;
                    i12 = i2;
                    break;
                case 273544615:
                case 1017987288:
                    i19 = iM31610 ^ i17;
                    sArr5 = f41051;
                    i20 = 73;
                    if (AbstractC3624.f12429 <= 0) {
                        iM2762 = C0773.m3169("۟ܺ") ^ i10;
                        i2 = ((iM2762 ^ i11) * (-12479)) ^ (-980520935);
                        i3 = 1471871192;
                    } else {
                        iM2762 = (C0773.m3169("۬֡") ^ i11) * (-49);
                        i2 = ((iM2762 ^ i10) * 20969) ^ (-1035432875);
                        i3 = 658630148;
                    }
                    i13 = iM2762 ^ i3;
                    i12 = i2;
                    break;
                case 431454672:
                case 1224242712:
                    z = false;
                    iM2763 = (i10 - C0619.m2761("ᩴۡ")) * 51;
                    sArr6 = sArr6;
                    i5 = ((iM2763 ^ i11) * 17005) ^ (-1334229051);
                    i8 = 1384292990;
                    i7 = iM2763 ^ i8;
                    sArr4 = sArr4;
                    int i216 = i20;
                    c9592 = c9592;
                    i12 = i5;
                    sArr6 = sArr6;
                    i13 = i7;
                    i20 = i216;
                    break;
                case 530136120:
                case 1700294989:
                    sArr = sArr6;
                    c9590 = c9592;
                    sArr2 = sArr4;
                    i4 = i20;
                    C18300 c18302 = viewOnClickListenerC12817.f41052;
                    abstractC22044M42671 = c18302.m42671();
                    if (C1321.f4751 >= 0) {
                        c18300 = c18302;
                        int iM31614 = C0773.m3169("֨ۘ") ^ i11;
                        c9591 = c9590;
                        i12 = ((iM31614 ^ i10) * 19241) ^ 1113200644;
                        abstractC22044 = abstractC22044M42671;
                        sArr6 = sArr;
                        i13 = iM31614 ^ 433308383;
                    } else {
                        c9591 = c9590;
                        int iM31615 = C0773.m3169("۟۠") ^ i11;
                        c18300 = c18302;
                        abstractC22044 = abstractC22044M42671;
                        sArr6 = sArr;
                        i13 = iM31615 ^ 1582542791;
                        i12 = ((iM31615 ^ i10) * 25537) ^ (-1606047520);
                    }
                    i20 = i4;
                    c9592 = c9591;
                    sArr4 = sArr2;
                    break;
                case 556766444:
                case 642067985:
                    C3492.m11487(c2361, i15 ^ i16, onClickListener);
                    sArr6 = f41051;
                    if (!C2966.m9664()) {
                        sArr = sArr6;
                        c9590 = c9592;
                        sArr2 = sArr4;
                        abstractC22044M42671 = abstractC22044;
                        i4 = i20;
                        int iM31616 = C0773.m3169("֨ۘ") ^ i11;
                        c9591 = c9590;
                        i12 = ((iM31616 ^ i10) * 19241) ^ 1113200644;
                        abstractC22044 = abstractC22044M42671;
                        sArr6 = sArr;
                        i13 = iM31616 ^ 433308383;
                        i20 = i4;
                        c9592 = c9591;
                        sArr4 = sArr2;
                    } else {
                        iM2762 = C0773.m3169("ۚۙ") ^ i11;
                        i2 = ((iM2762 ^ i10) * 21491) ^ (-1093170125);
                        i3 = 717847207;
                        i13 = iM2762 ^ i3;
                        i12 = i2;
                    }
                    break;
                case 584205307:
                case 1829091324:
                    sArr6 = sArr6;
                    sArr4 = sArr4;
                    c9592 = c9592;
                    i20 = i20;
                    if (((s * s) + 24900100) - (s * s2) >= 0) {
                        iM2761 = (C0619.m2761("֨۠") + i11) * (-7);
                        i12 = ((iM2761 ^ i10) * (-7923)) ^ 1181255522;
                        i = -704704974;
                    } else {
                        iM2761 = C0773.m3169("ܿۜ") ^ i10;
                        i12 = ((iM2761 ^ i11) * 22589) ^ 727204990;
                        i = -1520470312;
                    }
                    int i217 = iM2761 ^ i;
                    i20 = i20;
                    sArr6 = sArr6;
                    c9592 = c9592;
                    i13 = i217;
                    sArr4 = sArr4;
                    viewOnClickListenerC12817 = this;
                    break;
                case 995554874:
                case 1866548438:
                    sArr6 = sArr6;
                    sArr4 = sArr4;
                    c9592 = c9592;
                    i20 = i20;
                    sArr3 = f41051;
                    c = 'B';
                    if (C20932.f66974 <= 0) {
                        iM2761 = (C0773.m3169("᩹۫") ^ i10) * (-83);
                        i12 = ((iM2761 ^ i11) * 27637) ^ 1857329311;
                        i = 450109768;
                    } else {
                        iM2761 = C0619.m2761("ۖܳ") ^ i11;
                        i12 = ((iM2761 ^ i10) * (-3849)) ^ (-643427872);
                        i = -956945653;
                    }
                    int i218 = iM2761 ^ i;
                    i20 = i20;
                    sArr6 = sArr6;
                    c9592 = c9592;
                    i13 = i218;
                    sArr4 = sArr4;
                    viewOnClickListenerC12817 = this;
                    break;
                case 1027401888:
                case 2000108301:
                    i20 = i20;
                    sArr6 = sArr6;
                    sArr4 = sArr4;
                    C5360 c5361 = viewOnClickListenerC12817.f41054;
                    c9592 = new C9590(c5361.f18798);
                    if (C3033.f9831 >= 0) {
                        c5360 = c5361;
                        iM2763 = (i10 - C0619.m2761("ܳܰ")) * (-93);
                        i5 = ((iM2763 ^ i11) * (-16065)) ^ (-2025952657);
                        i8 = -382176313;
                        i7 = iM2763 ^ i8;
                        sArr4 = sArr4;
                        int i219 = i20;
                        c9592 = c9592;
                        i12 = i5;
                        sArr6 = sArr6;
                        i13 = i7;
                        i20 = i219;
                    } else {
                        int iM2766 = (C0619.m2761("ۨۙ") + i10) * (-87);
                        c5360 = c5361;
                        sArr4 = sArr4;
                        i20 = i20;
                        c9592 = c9592;
                        i12 = ((iM2766 ^ i11) * 21415) ^ (-1416989950);
                        viewOnClickListenerC12817 = this;
                        i13 = iM2766 ^ (-2034920691);
                        sArr6 = sArr6;
                    }
                    break;
                case 1288647150:
                case 1534167148:
                    i14 = 40636;
                    iM2761 = (C0773.m3169("᩵ᩳ") + i11) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i12 = ((iM2761 ^ i10) * (-4751)) ^ 2132117575;
                    i = -431900522;
                    int i2110 = iM2761 ^ i;
                    i20 = i20;
                    sArr6 = sArr6;
                    c9592 = c9592;
                    i13 = i2110;
                    sArr4 = sArr4;
                    viewOnClickListenerC12817 = this;
                    break;
                case 1900584067:
                case 1933836128:
                    C2375.m8070(C2310.m7808(dialogInterfaceC8327M23911), new View.OnClickListener(viewOnClickListenerC12817) { // from class: l.ۤۗ֫

                        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ViewOnClickListenerC12817 f33600;

                        {
                            int i30 = 914567332;
                            int i31 = C0950.f3488;
                            int i32 = C3492.f12043;
                            int iM2767 = (C0619.m2761("ᩴ֫") ^ i31) * 59;
                            int i33 = ((iM2767 ^ i32) * (-25703)) ^ 834245750;
                            int i34 = 612663798;
                            while (true) {
                                i30 = ((((i30 ^ i32) * (-32373)) >> 31) & i33) ^ (iM2767 ^ i34);
                                switch (i30) {
                                    case -2147277601:
                                    case -553629825:
                                        if (C2485.f7950 != 0) {
                                            iM2767 = (C0773.m3169("۫ۚ") ^ i32) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i33 = ((iM2767 ^ i31) * 13283) ^ 792637193;
                                            i34 = 1519768153;
                                        } else {
                                            iM2767 = C0773.m3169("ۡܳ") ^ i31;
                                            i33 = ((iM2767 ^ i32) * (-27921)) ^ 2095081317;
                                            i34 = 219144160;
                                        }
                                        break;
                                    case -1804049488:
                                    case 1636416810:
                                        if (C2966.f9654 >= 0) {
                                            iM2767 = (C0773.m3169("ۨ᩺") ^ i32) * 7;
                                            i33 = ((iM2767 ^ i31) * 8865) ^ (-1727141342);
                                            i34 = -582192698;
                                        } else {
                                            iM2767 = (C0773.m3169("۟۫") + i31) * 83;
                                            i33 = ((iM2767 ^ i32) * 10545) ^ 1831729480;
                                            i34 = -1665575745;
                                        }
                                        break;
                                    case -1720688977:
                                    case 574784385:
                                        return;
                                    case -1708878402:
                                    case 1579320866:
                                        if (C1783.f6087 <= 0) {
                                            iM2767 = (C0773.m3169("ۤܽ") ^ i31) * (-23);
                                            i33 = ((iM2767 ^ i32) * 9363) ^ (-116457953);
                                            i34 = -800803349;
                                        } else {
                                            iM2767 = C0619.m2761("֨᩻") ^ i32;
                                            i33 = ((iM2767 ^ i31) * (-11517)) ^ (-1053520429);
                                            i34 = 1258349372;
                                        }
                                        break;
                                    case -1632417560:
                                    case 1788153263:
                                        C20932.m47848();
                                        if (C1321.f4751 >= 0) {
                                            iM2767 = (C0773.m3169("ۨ᩺") ^ i32) * 7;
                                            i33 = ((iM2767 ^ i31) * 8865) ^ (-1727141342);
                                            i34 = -582192698;
                                        } else {
                                            iM2767 = (C0773.m3169("ۤܽ") ^ i31) * (-23);
                                            i33 = ((iM2767 ^ i32) * 9363) ^ (-116457953);
                                            i34 = -800803349;
                                        }
                                        break;
                                    case -1613649545:
                                    case 2032527886:
                                        if (C11235.m28309() != 0) {
                                            iM2767 = (C0773.m3169("ۨ᩺") ^ i32) * 7;
                                            i33 = ((iM2767 ^ i31) * 8865) ^ (-1727141342);
                                            i34 = -582192698;
                                        } else {
                                            iM2767 = C0773.m3169("ۖܰ") ^ i32;
                                            i33 = ((iM2767 ^ i31) * (-6093)) ^ (-508918039);
                                            i34 = 1607306570;
                                        }
                                        break;
                                    case -1427795508:
                                    case -267553563:
                                        if (C2288.m7767()) {
                                            iM2767 = (C0773.m3169("ۤܽ") ^ i31) * (-23);
                                            i33 = ((iM2767 ^ i32) * 9363) ^ (-116457953);
                                            i34 = -800803349;
                                        } else {
                                            iM2767 = C0619.m2761("ۗܿ") ^ i31;
                                            i33 = ((iM2767 ^ i32) * (-28573)) ^ 151979591;
                                            i34 = 1210780187;
                                        }
                                        break;
                                    case -1151797738:
                                    case 873951957:
                                        C2375.m8065();
                                        C2023.m6964();
                                        throw new RuntimeException();
                                    case -1115650663:
                                    case 76394126:
                                        C1519.m5403();
                                        if (C3779.f12953 <= 0) {
                                            iM2767 = (C0773.m3169("۫ۚ") ^ i32) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i33 = ((iM2767 ^ i31) * 13283) ^ 792637193;
                                            i34 = 1519768153;
                                        } else {
                                            iM2767 = (C0773.m3169("ۤܽ") ^ i31) * (-23);
                                            i33 = ((iM2767 ^ i32) * 9363) ^ (-116457953);
                                            i34 = -800803349;
                                        }
                                        break;
                                    case -669741500:
                                    case 1808173977:
                                        AbstractC0641.m2813();
                                        if (C23916.m53419() == 0) {
                                            iM2767 = (C0773.m3169("ۚۙ") + i31) * (-43);
                                            i33 = ((iM2767 ^ i32) * (-18555)) ^ 1656976145;
                                            i34 = -1627038327;
                                        } else {
                                            iM2767 = (C0773.m3169("ۨ᩺") ^ i32) * 7;
                                            i33 = ((iM2767 ^ i31) * 8865) ^ (-1727141342);
                                            i34 = -582192698;
                                        }
                                        break;
                                    case -637322904:
                                    case 1458603963:
                                        C23916.m53419();
                                        C11235.m28309();
                                        iM2767 = (C0773.m3169("ۤܽ") ^ i31) * (-23);
                                        i33 = ((iM2767 ^ i32) * 9363) ^ (-116457953);
                                        i34 = -800803349;
                                        break;
                                    case -219874993:
                                    case 1280523209:
                                        this.f33600 = viewOnClickListenerC12817;
                                        if (C2485.f7950 != 0) {
                                            iM2767 = (C0773.m3169("۫ۚ") ^ i32) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i33 = ((iM2767 ^ i31) * 13283) ^ 792637193;
                                            i34 = 1519768153;
                                        } else {
                                            iM2767 = (C0619.m2761("ۙۡ") + i31) * 27;
                                            i33 = ((iM2767 ^ i32) * (-18189)) ^ (-1526383449);
                                            i34 = 1610649608;
                                        }
                                        break;
                                    case 17932733:
                                    case 1278986905:
                                        if (C1826.f6190 <= 0) {
                                            iM2767 = (C0773.m3169("ۚۙ") + i31) * (-43);
                                            i33 = ((iM2767 ^ i32) * (-18555)) ^ 1656976145;
                                            i34 = -1627038327;
                                        } else {
                                            iM2767 = (i32 - C0773.m3169("ۜۢ")) * (-73);
                                            i33 = ((iM2767 ^ i31) * (-7399)) ^ 748379784;
                                            i34 = -1092184320;
                                        }
                                        break;
                                    case 176877655:
                                    case 1492563494:
                                        if (C2375.f7641 <= 0) {
                                            iM2767 = (C0773.m3169("ۚۙ") + i31) * (-43);
                                            i33 = ((iM2767 ^ i32) * (-18555)) ^ 1656976145;
                                            i34 = -1627038327;
                                        } else {
                                            iM2767 = (C0619.m2761("ۧ۫") + i32) * 31;
                                            i33 = ((iM2767 ^ i31) * 17461) ^ 1043718867;
                                            i34 = 1424561240;
                                        }
                                        break;
                                    case 183498323:
                                    case 1042198443:
                                        if (C3690.f12684 <= 0) {
                                            iM2767 = C0773.m3169("ܰ᩸") ^ i31;
                                            i33 = ((iM2767 ^ i32) * (-20937)) ^ (-1066142218);
                                            i34 = -51518211;
                                        } else {
                                            iM2767 = (i31 - C0773.m3169("֫᩷")) * (-109);
                                            i33 = ((iM2767 ^ i32) * 32423) ^ (-1420778447);
                                            i34 = -2138724479;
                                        }
                                        break;
                                    default:
                                        if (C2354.f7599 >= 0) {
                                            iM2767 = (C0773.m3169("۫ۚ") ^ i32) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i33 = ((iM2767 ^ i31) * 13283) ^ 792637193;
                                            i34 = 1519768153;
                                        } else {
                                            iM2767 = (C0619.m2761("۫ᩳ") + i32) * (-37);
                                            i33 = ((iM2767 ^ i31) * 19601) ^ 729227693;
                                            i34 = 2091989057;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view5) {
                            ViewOnClickListenerC12817 viewOnClickListenerC12818 = null;
                            int i30 = 755674379;
                            int i31 = C4238.f15451;
                            int i32 = C1321.f4751;
                            int iM2767 = C0619.m2761("᩶ۖ") ^ i31;
                            int i33 = ((iM2767 ^ i32) * 17043) ^ 1445807097;
                            int i34 = 1942589868;
                            while (true) {
                                i30 = ((((i30 ^ i32) * 1897) >> 31) & i33) ^ (iM2767 ^ i34);
                                switch (i30) {
                                    case -1701250655:
                                    case -11387564:
                                        if (C1564.f5401 > 0) {
                                            iM2767 = C0773.m3169("ܿ᩹") ^ i32;
                                            i33 = ((iM2767 ^ i31) * (-26105)) ^ (-1081305498);
                                            i34 = -287583040;
                                        } else {
                                            iM2767 = C0619.m2761("᩺᩵") ^ i32;
                                            i33 = ((iM2767 ^ i31) * (-27139)) ^ (-959607274);
                                            i34 = 2022435531;
                                        }
                                        break;
                                    case -1648500818:
                                    case -1100168026:
                                        if (C0773.f2792 <= 0) {
                                            iM2767 = C0619.m2761("᩺᩵") ^ i32;
                                            i33 = ((iM2767 ^ i31) * (-27139)) ^ (-959607274);
                                            i34 = 2022435531;
                                        } else {
                                            iM2767 = (C0619.m2761("۟᩵") + i32) * 99;
                                            i33 = ((iM2767 ^ i31) * 17505) ^ 1520866705;
                                            i34 = 777387602;
                                        }
                                        break;
                                    case -1638365398:
                                    case 1127151969:
                                        if (C2354.m7983()) {
                                            iM2767 = C0773.m3169("۫ᩳ") ^ i31;
                                            i33 = ((iM2767 ^ i32) * 7801) ^ (-1226005705);
                                            i34 = -2044275724;
                                        } else {
                                            iM2767 = (i31 - C0619.m2761("᩶ᩳ")) * (-7);
                                            i33 = ((iM2767 ^ i32) * (-15533)) ^ (-486011450);
                                            i34 = 1344750586;
                                        }
                                        break;
                                    case -1408493336:
                                    case 814816821:
                                        if (C0619.f2439) {
                                            iM2767 = C0773.m3169("ܿ᩹") ^ i32;
                                            i33 = ((iM2767 ^ i31) * (-26105)) ^ (-1081305498);
                                            i34 = -287583040;
                                        } else {
                                            iM2767 = C0619.m2761("۬ۖ") ^ i31;
                                            i33 = ((iM2767 ^ i32) * 15703) ^ (-495788276);
                                            i34 = -1384223837;
                                        }
                                        break;
                                    case -1043618136:
                                    case 1910365822:
                                        viewOnClickListenerC12818 = this.f33600;
                                        if (AbstractC3624.f12429 <= 0) {
                                            iM2767 = (C0773.m3169("ۢۜ") ^ i31) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i33 = ((iM2767 ^ i32) * (-13893)) ^ (-345133308);
                                            i34 = -673883657;
                                        } else {
                                            iM2767 = (i32 - C0619.m2761("ۘ۠")) * 35;
                                            i33 = ((iM2767 ^ i31) * 7959) ^ (-1513126551);
                                            i34 = -1389506147;
                                        }
                                        break;
                                    case -981624923:
                                    case 1249940522:
                                        if (C1146.f4234 >= 0) {
                                            iM2767 = (i31 - C0619.m2761("᩶ᩳ")) * (-7);
                                            i33 = ((iM2767 ^ i32) * (-15533)) ^ (-486011450);
                                            i34 = 1344750586;
                                        } else {
                                            iM2767 = C0773.m3169("ۡۘ") ^ i32;
                                            i33 = ((iM2767 ^ i31) * 20689) ^ 1952531966;
                                            i34 = -790366153;
                                        }
                                        break;
                                    case -912456865:
                                    case 345736951:
                                        if (C2834.f9334 <= 0) {
                                            iM2767 = (C0619.m2761("ۖܳ") ^ i31) * (-127);
                                            i33 = ((iM2767 ^ i32) * 19763) ^ (-1645453496);
                                            i34 = -1067698795;
                                        } else {
                                            iM2767 = (i31 - C0619.m2761("ۘۛ")) * 13;
                                            i33 = ((iM2767 ^ i32) * (-7107)) ^ 1156322135;
                                            i34 = -2037818042;
                                        }
                                        break;
                                    case -569345397:
                                    case 1467058520:
                                        RunnableC3055.m9933();
                                        C1783.m6232();
                                        break;
                                    case -132261648:
                                    case 1987836763:
                                        if (C3077.f9998) {
                                            iM2767 = C0773.m3169("ۨܽ") ^ i31;
                                            i33 = ((iM2767 ^ i32) * (-8223)) ^ 28796207;
                                            i34 = 148579546;
                                        } else {
                                            iM2767 = (C0773.m3169("ۢۜ") ^ i31) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i33 = ((iM2767 ^ i32) * (-13893)) ^ (-345133308);
                                            i34 = -673883657;
                                        }
                                        break;
                                    case 466193376:
                                    case 1000702180:
                                        if (C11235.f35427 >= 0) {
                                            iM2767 = (C0619.m2761("ۖܳ") ^ i31) * (-127);
                                            i33 = ((iM2767 ^ i32) * 19763) ^ (-1645453496);
                                            i34 = -1067698795;
                                        } else {
                                            iM2767 = C0773.m3169("ܶ᩹") ^ i32;
                                            i33 = ((iM2767 ^ i31) * (-7149)) ^ 36583246;
                                            i34 = -938077105;
                                        }
                                        break;
                                    case 589179040:
                                    case 1089125826:
                                        if (C2419.f7754 >= 0) {
                                            iM2767 = (C0773.m3169("ۢۜ") ^ i31) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i33 = ((iM2767 ^ i32) * (-13893)) ^ (-345133308);
                                            i34 = -673883657;
                                        } else {
                                            iM2767 = (C0619.m2761("۬᩵") + i32) * (-19);
                                            i33 = ((iM2767 ^ i31) * (-10801)) ^ (-1348343589);
                                            i34 = -1240596285;
                                        }
                                        break;
                                    case 820031360:
                                    case 1440515160:
                                        if (!C1080.m4050()) {
                                            iM2767 = C0619.m2761("᩺᩵") ^ i32;
                                            i33 = ((iM2767 ^ i31) * (-27139)) ^ (-959607274);
                                            i34 = 2022435531;
                                        } else {
                                            iM2767 = (C0619.m2761("ۖܳ") ^ i31) * (-127);
                                            i33 = ((iM2767 ^ i32) * 19763) ^ (-1645453496);
                                            i34 = -1067698795;
                                        }
                                        break;
                                    case 1212412065:
                                    case 1526228543:
                                        C3492.m11488();
                                        if (C2310.f7472 >= 0) {
                                            iM2767 = (i31 - C0619.m2761("᩶ᩳ")) * (-7);
                                            i33 = ((iM2767 ^ i32) * (-15533)) ^ (-486011450);
                                            i34 = 1344750586;
                                        } else {
                                            iM2767 = C0619.m2761("᩺᩵") ^ i32;
                                            i33 = ((iM2767 ^ i31) * (-27139)) ^ (-959607274);
                                            i34 = 2022435531;
                                        }
                                        break;
                                    case 1362311414:
                                    case 2102641317:
                                        C0487.m2356();
                                        C1343.m4943();
                                        iM2767 = C0619.m2761("᩺᩵") ^ i32;
                                        i33 = ((iM2767 ^ i31) * (-27139)) ^ (-959607274);
                                        i34 = 2022435531;
                                        break;
                                    case 1618343034:
                                    case 1854812471:
                                        if (C2419.f7754 >= 0) {
                                            iM2767 = (C0619.m2761("ۖܳ") ^ i31) * (-127);
                                            i33 = ((iM2767 ^ i32) * 19763) ^ (-1645453496);
                                            i34 = -1067698795;
                                        } else {
                                            iM2767 = (C0619.m2761("᩷ᩴ") ^ i31) * 33;
                                            i33 = ((iM2767 ^ i32) * (-23335)) ^ (-1605740331);
                                            i34 = -1369646380;
                                        }
                                        break;
                                    default:
                                        ViewOnClickListenerC12817.m31778(viewOnClickListenerC12818, dialogInterfaceC8327M23911, view5);
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    break;
                default:
                    if (C1080.f3865 >= 0) {
                        sArr6 = sArr6;
                        sArr4 = sArr4;
                        c9592 = c9592;
                        i20 = i20;
                        iM2761 = (C0773.m3169("᩹۫") ^ i10) * (-83);
                        i12 = ((iM2761 ^ i11) * 27637) ^ 1857329311;
                        i = 450109768;
                        int i2111 = iM2761 ^ i;
                        i20 = i20;
                        sArr6 = sArr6;
                        c9592 = c9592;
                        i13 = i2111;
                        sArr4 = sArr4;
                        viewOnClickListenerC12817 = this;
                    }
                    sArr6 = sArr6;
                    sArr4 = sArr4;
                    c9592 = c9592;
                    i20 = i20;
                    iM2761 = C0773.m3169("۠۫") ^ i11;
                    i12 = ((iM2761 ^ i10) * (-30135)) ^ (-927816940);
                    i = 286238248;
                    int i2112 = iM2761 ^ i;
                    i20 = i20;
                    sArr6 = sArr6;
                    c9592 = c9592;
                    i13 = i2112;
                    sArr4 = sArr4;
                    viewOnClickListenerC12817 = this;
                    break;
            }
            return;
        }
    }
}
