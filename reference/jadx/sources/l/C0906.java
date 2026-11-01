package l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.tabs.TabLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.List;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX INFO: renamed from: l.֨ۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81J9 */
/* JADX INFO: loaded from: classes3.dex */
public class C0906 extends AbstractC22611 implements InterfaceC19601 {

    /* JADX INFO: renamed from: ᩷ܺۜ, reason: not valid java name and contains not printable characters */
    private static final short[] f3632 = {9183, -23460, 27304, 19056, 12940, 12940, 12940, 12940, 12940, 12940, 12945, 12940, 12940, 12940, 12940, 12945, 12940, 12940, 12940, 12940, 12945, 12940, 12940, 12940, 12940, 12945, 12940, 12940, 12940, 12940, 12940, 12940, 12940, 12940, 12940, 12940, 12940, 12940, 1939, -12517, -12540, -12544, -12501, -12528, -12527, -12532, -12501, -12542, -12527, -12538, -12537, -12515, -12517, -12518, -12517, -12540, -12544, -12501, -12538, -12519, -12501, -12537, -12517, -12543, -12538, -12521, -12527, -12517, -12540, -12544, -12501, -12538, -12519, -12501, -12520, -12515, -12518, -12527, -12517, -12540, -12544, -12501, -12538, -12519, -12501, -12540, -12523, -12538, -12523, -12519, -12517, -12540, -12544, -12501, -12538, -12519, -12501, -12540, -12538, -12517, -12520, -12517, -12525, -12543, -12527, -12517, -12540, -12544, -12501, -12538, -12519, -12501, -12520, -12517, -12521, -12523, -12520, -12517, -12540, -12544, -12501, -12538, -12519, -12501, -12523, -12540, -12515, -12501, -12519, -12517, -12528, -12540, -12537, -12538, -12515, 7260, -4822, 1170, 14476, 13817, 15436, 4594, 13246, 6657, 2939, 1501, 15674, 7974, 13136, 14202, -731, 7579, 12657, 6375, 5703, 821, 4236, 9818, -13796, -13523, 9547, 9335, 6775, -6733, -251, 7568, -5116, 5786, 1105, -4072, 4472, 2271, 4448, -5635, -13211, 1482, -6239, -3191, 3678, 4845, 5733, -10037, -12199, -9391, 1572, 6197, -8021, -10468, -9486, -8626, -2269, 3529, 3292, -5129, 3671, -7944, -4104, -1676, -508, -7832, -4005, 4747, -10110, -8464, 2619, -8762, -8129, -4962, -4633, -10296, 5281, -5164, -1007, 7380, -7809, 2972, 988, -198, -7652, -7684, 3957, 6777, -10587, 1140, -8198, -9030, -3429, 3398, -9352, 111, -31646, -31645, -31618, -31706, -31690, -31694, -31690, -31646, -31645, -31618, -31706, -31690, -31694, -31689, -31646, -31645, -31618, -31706, -31690, -31691, -31693, -31646, -31645, -31618, -31706, -31690, -31691, -31695, -31646, -31645, -31618, -31706, -31690, -31691, -31682, -31646, -31645, -31618, -31706, -31690, -31691, -31681, -31639, -31626, -31630, -31655, -31646, -31645, -31618, -31655, -31632, -31645, -31628, -31627, -31633, -31639, -31640, -31639, -31626, -31630, -31655, -31628, -31637, -31655, -31627, -31639, -31629, -31628, -31643, -31645, -31639, -31626, -31630, -31655, -31628, -31637, -31655, -31638, -31633, -31640, -31645, -31639, -31626, -31630, -31655, -31628, -31637, -31655, -31626, -31641, -31628, -31641, -31637, -31639, -31626, -31630, -31655, -31628, -31637, -31655, -31626, -31628, -31639, -31638, -31639, -31647, -31629, -31645, -31639, -31626, -31630, -31655, -31628, -31637, -31655, -31638, -31639, -31643, -31641, -31638, -31639, -31626, -31630, -31655, -31634, -31641, -31627, -31655, -31641, -31626, -31633, -31655, -31637, -31639, -31646, -31639, -31626, -31630, -31655, -31628, -31637, -31655, -31641, -31626, -31633, -31655, -31637, -31639, -31646, -31626, -31627, -31628, -31633, -11007, -8781, -4008, -11849, -3964, -7641, 7591, 6448, 2962, -2566, 4821, -15224, -14519, -13608, -3661, 3741, -14325, 1417, -11768, 11154, 4718, 8103, 27903, 27888, 27898, 27884, 27889, 27895, 27898, 27812, 27885, 27881, 27895, 27882, 27901, 27894, 27899, 27884, 27812, 27812, 6253, -11554, -8644, 13569, 2045, 8874, -15482, -13994};

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f3633;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C18377 f3634;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C6094 f3635;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC16655 f3636;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public MenuItem f3637;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C19383 f3638;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3608(C0906 c0906, String str) {
        C6094 c6094 = null;
        List listM16530 = null;
        C6094 c6095 = null;
        int i = 0;
        Object objM5478 = null;
        int i2 = -488277798;
        int i3 = C1937.f7317;
        int i4 = C10634.f36300;
        int iM11306 = (ThreadFactoryC3888.m11306("ۜۙ") + i3) * (-11);
        int i5 = ((iM11306 ^ i4) * (-6295)) ^ (-1695682097);
        int i6 = -1563396324;
        while (true) {
            i2 = ((((i2 ^ i4) * (-6469)) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -2031044366:
                case -1630708317:
                    C2249.m6915();
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷֨") + i4) * (-101);
                        i5 = ((iM11306 ^ i3) * 24909) ^ (-1070798379);
                        i6 = -999992492;
                    } else {
                        iM11306 = C19806.m45029("᩺ۢ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 20999) ^ (-1827728651);
                        i6 = -918108983;
                    }
                    break;
                case -1998942034:
                case -681587762:
                    c0906.f3633 = c6095.m16529((String) objM5478);
                    iM11306 = (C19806.m45029("ۘᩳ") ^ i3) * 67;
                    i5 = ((iM11306 ^ i4) * 19599) ^ (-1988895855);
                    i6 = 1728901424;
                    break;
                case -1874440241:
                case -566997086:
                    if (C3722.f13525 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳ֨") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM11306 ^ i4) * (-26797)) ^ 166818232;
                        i6 = -650541261;
                    } else {
                        iM11306 = C19806.m45029("۫᩵") ^ i4;
                        i5 = ((iM11306 ^ i3) * 18935) ^ (-763698924);
                        i6 = 463490993;
                    }
                    break;
                case -1793880259:
                case 1983972106:
                    C1461.m5080();
                    C10634.m26820();
                    break;
                case -1582270630:
                case 1750013579:
                    C2332.m7079();
                    C1025.m3861();
                    iM11306 = C19806.m45029("᩺ۢ") ^ i4;
                    i5 = ((iM11306 ^ i3) * 20999) ^ (-1827728651);
                    i6 = -918108983;
                    break;
                case -1532738768:
                case 773803152:
                    c6094 = c0906.f3635;
                    if (C1377.f5749) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴۙ") + i3) * (-115);
                        i5 = ((iM11306 ^ i4) * 18997) ^ (-325597955);
                        i6 = 1790712136;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳ֨") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM11306 ^ i4) * (-26797)) ^ 166818232;
                        i6 = -650541261;
                    }
                    break;
                case -769180913:
                case 1250403274:
                    c0906.m3612();
                    iM11306 = (C19806.m45029("ۨܺ") ^ i4) * 37;
                    i5 = ((iM11306 ^ i3) * (-6683)) ^ 878481662;
                    i6 = -827263308;
                    break;
                case -716169134:
                case -37998652:
                    if (c0906.isHidden()) {
                        iM11306 = (C19806.m45029("ۨܺ") ^ i4) * 37;
                        i5 = ((iM11306 ^ i3) * (-6683)) ^ 878481662;
                        i6 = -827263308;
                    } else {
                        iM11306 = C19806.m45029("ۖܳ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 30287) ^ (-2112270192);
                        i6 = 966497663;
                    }
                    break;
                case -527001458:
                case 88697175:
                    c0906.f3633 = str;
                    iM11306 = (C19806.m45029("ۘᩳ") ^ i3) * 67;
                    i5 = ((iM11306 ^ i4) * 19599) ^ (-1988895855);
                    i6 = 1728901424;
                    break;
                case -351461070:
                case 669868505:
                    if (C1937.m6276(listM16530) == 1) {
                        iM11306 = C19806.m45029("᩹ᩴ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 1941) ^ 1195207150;
                        i6 = -1406644376;
                    } else {
                        iM11306 = C19806.m45029("ۡܰ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 24853) ^ 782515012;
                        i6 = 1603451018;
                    }
                    break;
                case 20620583:
                case 1165325708:
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = (C19806.m45029("᩺᩶") + i4) * 33;
                        i5 = ((iM11306 ^ i3) * (-32043)) ^ 1875036899;
                        i6 = 1054645540;
                    } else {
                        iM11306 = C19806.m45029("֫ۖ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 27083) ^ (-1906755166);
                        i6 = 2080017449;
                    }
                    break;
                case 51159058:
                case 1834323820:
                    if (!C19806.f63586) {
                        iM11306 = C19806.m45029("᩺ۢ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 20999) ^ (-1827728651);
                        i6 = -918108983;
                    } else {
                        iM11306 = (C19806.m45029("᩺᩶") + i4) * 33;
                        i5 = ((iM11306 ^ i3) * (-32043)) ^ 1875036899;
                        i6 = 1054645540;
                    }
                    break;
                case 62057952:
                case 2081288942:
                    if (C3286.f12186) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷֨") + i4) * (-101);
                        i5 = ((iM11306 ^ i3) * 24909) ^ (-1070798379);
                        i6 = -999992492;
                    } else {
                        iM11306 = C19806.m45029("᩻֡") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-29911)) ^ (-1362162637);
                        i6 = -957540137;
                    }
                    break;
                case 102706410:
                case 1918882402:
                    C6171.m17171(c6094);
                    if (C0216.f1393 != 0) {
                        iM11306 = C19806.m45029("ۜۡ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 16979) ^ (-1823364857);
                        i6 = -391115014;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹᩹") ^ i3) * (-67);
                        i5 = ((iM11306 ^ i4) * (-26099)) ^ (-1869286242);
                        i6 = 1787452228;
                    }
                    break;
                case 270320871:
                case 1428700041:
                    break;
                case 317380895:
                case 1955233814:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳ֨") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM11306 ^ i4) * (-26797)) ^ 166818232;
                        i6 = -650541261;
                    } else {
                        iM11306 = (C19806.m45029("᩺ۛ") + i4) * 119;
                        i5 = ((iM11306 ^ i3) * (-7291)) ^ (-1124109066);
                        i6 = -840390477;
                    }
                    break;
                case 645523101:
                case 1770813449:
                    listM16530 = c0906.f3635.m16530();
                    if (C2249.f8050 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷֨") + i4) * (-101);
                        i5 = ((iM11306 ^ i3) * 24909) ^ (-1070798379);
                        i6 = -999992492;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙ᩸") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-31483)) ^ (-1054579850);
                        i6 = 1409889254;
                    }
                    break;
                case 660232944:
                case 1705497152:
                    if (C1025.m3861() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳ֨") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM11306 ^ i4) * (-26797)) ^ 166818232;
                        i6 = -650541261;
                    } else {
                        iM11306 = C19806.m45029("᩺ۢ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 20999) ^ (-1827728651);
                        i6 = -918108983;
                    }
                    break;
                case 1172244871:
                case 2070570964:
                    objM5478 = RunnableC1606.m5478(listM16530, i);
                    if (C1189.f5284 <= 0) {
                        iM11306 = C19806.m45029("᩺ۢ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 20999) ^ (-1827728651);
                        i6 = -918108983;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۗᩳ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-28609)) ^ 1939426406;
                        i6 = 937329337;
                    }
                    break;
                case 1201108254:
                case 1931412753:
                    c6095 = c0906.f3635;
                    i = 0;
                    if (C1937.f7317 >= 0) {
                        iM11306 = C19806.m45029("ۜۡ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 16979) ^ (-1823364857);
                        i6 = -391115014;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ܿ") + i3) * (-117);
                        i5 = ((iM11306 ^ i4) * (-8377)) ^ 835276636;
                        i6 = 79369749;
                    }
                    break;
                default:
                    if (C0629.f2722 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷֨") + i4) * (-101);
                        i5 = ((iM11306 ^ i3) * 24909) ^ (-1070798379);
                        i6 = -999992492;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ᩷") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-28209)) ^ 2114118455;
                        i6 = -111812074;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean mo3617() {
        return true;
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String mo3618() {
        return null;
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo3619() {
        return false;
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean mo3621() {
        return false;
    }

    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int mo3622() {
        String strM4832 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = 0;
        int i6 = -253344921;
        int i7 = C3660.f13403;
        int i8 = C1189.f5284;
        int iM45029 = C19806.m45029("֡᩶") ^ i8;
        int i9 = ((iM45029 ^ i7) * 30457) ^ (-1927727378);
        int i10 = -594354740;
        while (true) {
            i6 = ((((i6 ^ i7) * (-5101)) >> 31) & i9) ^ (iM45029 ^ i10);
            switch (i6) {
                case -2034966103:
                case -1395347704:
                    sArr = f3632;
                    if (C0216.f1393 != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴ᩹") + i8) * 15;
                        i9 = ((iM45029 ^ i7) * (-16033)) ^ (-562385167);
                        i10 = -1748676112;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩹") ^ i7;
                        i9 = ((iM45029 ^ i8) * 28661) ^ (-689154628);
                        i10 = -825703240;
                    }
                    break;
                case -1823085195:
                case 1586768550:
                    s2 = 1;
                    if (C2871.m8646()) {
                        iM45029 = C19806.m45029("ۙᩴ") ^ i7;
                        i9 = ((iM45029 ^ i8) * 14349) ^ 323432833;
                        i10 = -1786867454;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶᩵") ^ i7;
                        i9 = ((iM45029 ^ i8) * 12677) ^ 373020946;
                        i10 = 159465417;
                    }
                    break;
                case -1794702884:
                case 60019546:
                    C1977.m6356();
                    iM45029 = ThreadFactoryC3888.m11306("ۜۜ") ^ i8;
                    i9 = ((iM45029 ^ i7) * 15777) ^ (-1787470921);
                    i10 = 1214496430;
                    break;
                case -1646655846:
                case 942006047:
                    C0526.m2437();
                    return 0;
                case -1641263051:
                case 694540710:
                    RunnableC0195.m1431();
                    if (C3660.m10791() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֨᩷") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-16513)) ^ (-1934824137);
                        i10 = -1734491160;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜۜ") ^ i8;
                        i9 = ((iM45029 ^ i7) * 15777) ^ (-1787470921);
                        i10 = 1214496430;
                    }
                    break;
                case -1573054047:
                case -355729345:
                    if (C1148.f5161 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴ᩹") + i8) * 15;
                        i9 = ((iM45029 ^ i7) * (-16033)) ^ (-562385167);
                        i10 = -1748676112;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜۜ") ^ i8;
                        i9 = ((iM45029 ^ i7) * 15777) ^ (-1787470921);
                        i10 = 1214496430;
                    }
                    break;
                case -1502110796:
                case -526972613:
                    i2 = i + 1;
                    if (C1377.f5749) {
                        iM45029 = (i8 - ThreadFactoryC3888.m11306("ۨۨ")) * 41;
                        i9 = ((iM45029 ^ i7) * (-16999)) ^ (-1316170535);
                        i10 = 1751482796;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴ᩹") + i8) * 15;
                        i9 = ((iM45029 ^ i7) * (-16033)) ^ (-562385167);
                        i10 = -1748676112;
                    }
                    break;
                case -1324966834:
                case 47210234:
                    int i11 = s + s2;
                    if ((i11 * i11) - i2 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴܿ") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-9457)) ^ 421626843;
                        i10 = 1303745512;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶۢ") ^ i8;
                        i9 = ((iM45029 ^ i7) * 10289) ^ (-503121975);
                        i10 = 80670592;
                    }
                    break;
                case -1175910668:
                case -566078124:
                    s = sArr[c];
                    if (CallableC1627.f6528) {
                        iM45029 = (i7 - C19806.m45029("ۛۜ")) * 53;
                        i9 = ((iM45029 ^ i8) * 4915) ^ (-1542002961);
                        i10 = -649981312;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴ᩹") + i8) * 15;
                        i9 = ((iM45029 ^ i7) * (-16033)) ^ (-562385167);
                        i10 = -1748676112;
                    }
                    break;
                case -1080203958:
                case -244962908:
                    i = s * 2;
                    if (C3535.f13026 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶᩵") ^ i7;
                        i9 = ((iM45029 ^ i8) * 12677) ^ 373020946;
                        i10 = 159465417;
                    } else {
                        iM45029 = (i7 - ThreadFactoryC3888.m11306("ܽܰ")) * (-31);
                        i9 = ((iM45029 ^ i8) * (-18727)) ^ (-975345962);
                        i10 = 1116801675;
                    }
                    break;
                case -771609134:
                case 8838220:
                    i5 = 3;
                    if (C0962.f3784) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶᩵") ^ i7;
                        i9 = ((iM45029 ^ i8) * 12677) ^ 373020946;
                        i10 = 159465417;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ܰ") ^ i7;
                        i9 = ((iM45029 ^ i8) * 4873) ^ (-143669653);
                        i10 = -696568794;
                    }
                    break;
                case -635926048:
                case 1268722796:
                    i3 = 18255;
                    iM45029 = (i8 - ThreadFactoryC3888.m11306("ܿ᩹")) * (-17);
                    i9 = ((iM45029 ^ i7) * (-8089)) ^ 2066869309;
                    i10 = -1187499188;
                    break;
                case -542996130:
                case 845577269:
                    sArr2 = f3632;
                    i4 = 428;
                    if (C1025.f4800 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֨᩷") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-16513)) ^ (-1934824137);
                        i10 = -1734491160;
                    } else {
                        iM45029 = C19806.m45029("ᩴ۟") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-28877)) ^ (-484943387);
                        i10 = -1572360952;
                    }
                    break;
                case -388255722:
                case 1799902178:
                    C0526.m2437();
                    if (C2332.f8260) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡۜ") + i7) * (-61);
                        i9 = ((iM45029 ^ i8) * (-25995)) ^ (-142469191);
                        i10 = 830578853;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜۜ") ^ i8;
                        i9 = ((iM45029 ^ i7) * 15777) ^ (-1787470921);
                        i10 = 1214496430;
                    }
                    break;
                case 310637012:
                case 1104555772:
                    strM4832 = C1377.m4832(sArr2, i4, i5, i3);
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜۜ") ^ i8;
                        i9 = ((iM45029 ^ i7) * 15777) ^ (-1787470921);
                        i10 = 1214496430;
                    } else {
                        iM45029 = C19806.m45029("ᩳ۬") ^ i7;
                        i9 = ((iM45029 ^ i8) * 14855) ^ (-891530449);
                        i10 = -2118955468;
                    }
                    break;
                case 371086766:
                case 1724919596:
                    return ThreadFactoryC3888.m11306(strM4832) ^ 2125629505;
                case 562489002:
                case 1955115997:
                    i3 = 21433;
                    iM45029 = (i8 - ThreadFactoryC3888.m11306("ܿ᩹")) * (-17);
                    i9 = ((iM45029 ^ i7) * (-8089)) ^ 2066869309;
                    i10 = -1187499188;
                    break;
                case 865141933:
                case 1499859523:
                    if (RunnableC1895.m6170() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴ᩹") + i8) * 15;
                        i9 = ((iM45029 ^ i7) * (-16033)) ^ (-562385167);
                        i10 = -1748676112;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ᩳ") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-18795)) ^ (-1502012522);
                        i10 = 686986238;
                    }
                    break;
                default:
                    c = 427;
                    if (C1398.f5802 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֨᩷") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-16513)) ^ (-1934824137);
                        i10 = -1734491160;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨ᩹") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-25509)) ^ (-1026359791);
                        i10 = -911258540;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3606(C0906 c0906) {
        int i = -941600951;
        int i2 = C2871.f10837;
        int i3 = C1460.f5948;
        int iM45029 = C19806.m45029("ܺۧ") ^ i2;
        int i4 = ((iM45029 ^ i3) * 173) ^ (-370098945);
        int i5 = 2147195386;
        while (true) {
            i = ((((i ^ i3) * (-31579)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2025080244:
                case -1978540365:
                    if (C2704.f10408) {
                        iM45029 = (i3 - C19806.m45029("᩸۬")) * (-75);
                        i4 = ((iM45029 ^ i2) * (-16425)) ^ 308718898;
                        i5 = -212791068;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡ܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 11769) ^ (-1221560095);
                        i5 = 932908349;
                    }
                    break;
                case -1830508330:
                case -111565708:
                    if (C1189.f5284 > 0) {
                        iM45029 = (C19806.m45029("۫ܺ") ^ i3) * (-81);
                        i4 = ((iM45029 ^ i2) * 10717) ^ (-987935034);
                        i5 = -850898389;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡ܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 11769) ^ (-1221560095);
                        i5 = 932908349;
                    }
                    break;
                case -1682376987:
                case 1383373378:
                    break;
                case -1661748810:
                case 1245956949:
                    if (C19806.m45024()) {
                        iM45029 = (C19806.m45029("۫ܺ") ^ i3) * (-81);
                        i4 = ((iM45029 ^ i2) * 10717) ^ (-987935034);
                        i5 = -850898389;
                    } else {
                        iM45029 = (C19806.m45029("۟ۡ") + i2) * 63;
                        i4 = ((iM45029 ^ i3) * 20905) ^ 1078634214;
                        i5 = -584240824;
                    }
                    break;
                case -1656668369:
                case -854889061:
                    if (C1148.m4232() <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ᩴ᩸")) * (-79);
                        i4 = ((iM45029 ^ i2) * 1649) ^ 544246595;
                        i5 = -1464297307;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۨ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-8367)) ^ 1416941992;
                        i5 = -1072926082;
                    }
                    break;
                case -1655424112:
                case -745718471:
                    C2642.m8171();
                    iM45029 = (C19806.m45029("ۜ۟") + i2) * (-65);
                    i4 = ((iM45029 ^ i3) * 16075) ^ (-960717769);
                    i5 = 632925129;
                    break;
                case -1251334664:
                case 584871874:
                    C1937.m6279();
                    break;
                case -1223776382:
                case 958846206:
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = (C19806.m45029("ۜ۟") + i2) * (-65);
                        i4 = ((iM45029 ^ i3) * 16075) ^ (-960717769);
                        i5 = 632925129;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ᩺") ^ i3) * (-117);
                        i4 = ((iM45029 ^ i2) * (-18689)) ^ (-969417080);
                        i5 = 1564769711;
                    }
                    break;
                case -1137340525:
                case 1772452774:
                    if (C1377.f5749) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ۠") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-793)) ^ (-574130405);
                        i5 = 954275705;
                    } else {
                        iM45029 = (C19806.m45029("۫ܺ") ^ i3) * (-81);
                        i4 = ((iM45029 ^ i2) * 10717) ^ (-987935034);
                        i5 = -850898389;
                    }
                    break;
                case -731407270:
                case 1319076600:
                    if (C10634.m26820()) {
                        iM45029 = ThreadFactoryC3888.m11306("֡ܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 11769) ^ (-1221560095);
                        i5 = 932908349;
                    } else {
                        iM45029 = (C19806.m45029("ܺܿ") + i3) * (-5);
                        i4 = ((iM45029 ^ i2) * (-6411)) ^ 1547004332;
                        i5 = 935284874;
                    }
                    break;
                case -586666418:
                case 1387327126:
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ᩴ᩸")) * (-79);
                        i4 = ((iM45029 ^ i2) * 1649) ^ 544246595;
                        i5 = -1464297307;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶۘ") ^ i2) * 37;
                        i4 = ((iM45029 ^ i3) * (-18841)) ^ (-1101825251);
                        i5 = -1712689588;
                    }
                    break;
                case -323623008:
                case 1929152028:
                    if (C1461.f5957 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡ܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 11769) ^ (-1221560095);
                        i5 = 932908349;
                    } else {
                        iM45029 = (C19806.m45029("᩹᩸") ^ i3) * (-99);
                        i4 = ((iM45029 ^ i2) * 30709) ^ (-1295920967);
                        i5 = 1178581763;
                    }
                    break;
                case 231551562:
                case 917073719:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (!RunnableC1564.m5345()) {
                        iM45029 = (i2 - C19806.m45029("۬ܶ")) * 99;
                        i4 = ((iM45029 ^ i3) * 24165) ^ 76809170;
                        i5 = -1603940400;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡ܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 11769) ^ (-1221560095);
                        i5 = 932908349;
                    }
                    break;
                case 285603370:
                case 1023446488:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (i2 - C19806.m45029("۬ܶ")) * 99;
                        i4 = ((iM45029 ^ i3) * 24165) ^ 76809170;
                        i5 = -1603940400;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷ۗ") ^ i3) * 65;
                        i4 = ((iM45029 ^ i2) * (-11411)) ^ (-1034535666);
                        i5 = -794580856;
                    }
                    break;
                case 430338620:
                case 580369973:
                    if (C1875.f7103 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡ܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 11769) ^ (-1221560095);
                        i5 = 932908349;
                    } else {
                        iM45029 = (C19806.m45029("ۜ۟") + i2) * (-65);
                        i4 = ((iM45029 ^ i3) * 16075) ^ (-960717769);
                        i5 = 632925129;
                    }
                    break;
                case 536286235:
                case 1024495933:
                    c0906.m3612();
                    iM45029 = (C19806.m45029("᩹֡") + i3) * (-113);
                    i4 = ((iM45029 ^ i2) * 21699) ^ (-1374909075);
                    i5 = 47635104;
                    break;
                case 1161365546:
                case 1487862663:
                    if (c0906.isHidden()) {
                        iM45029 = (C19806.m45029("᩹֡") + i3) * (-113);
                        i4 = ((iM45029 ^ i2) * 21699) ^ (-1374909075);
                        i5 = 47635104;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۘ᩻")) * 23;
                        i4 = ((iM45029 ^ i3) * 537) ^ (-603810921);
                        i5 = 210447860;
                    }
                    break;
                default:
                    if (C3722.f13525 <= 0) {
                        iM45029 = (C19806.m45029("ۜ۟") + i2) * (-65);
                        i4 = ((iM45029 ^ i3) * 16075) ^ (-960717769);
                        i5 = 632925129;
                    } else {
                        iM45029 = (i2 - C19806.m45029("᩹۠")) * (-81);
                        i4 = ((iM45029 ^ i3) * (-9709)) ^ 332645269;
                        i5 = 1913258305;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0071  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d5 A[PHI: r1 r2 r12 r16 r17
      0x00d5: PHI (r1v2 int) = (r1v1 int), (r1v1 int), (r1v1 int), (r1v4 int) binds: [B:31:0x00d3, B:27:0x00b4, B:14:0x0059, B:6:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00d5: PHI (r2v2 int) = (r2v1 int), (r2v1 int), (r2v1 int), (r2v4 int) binds: [B:31:0x00d3, B:27:0x00b4, B:14:0x0059, B:6:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00d5: PHI (r12v3 int) = (r12v2 int), (r12v1 int), (r12v1 int), (r12v1 int) binds: [B:31:0x00d3, B:27:0x00b4, B:14:0x0059, B:6:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00d5: PHI (r16v26 int) = (r16v18 int), (r16v19 int), (r16v21 int), (r16v29 int) binds: [B:31:0x00d3, B:27:0x00b4, B:14:0x0059, B:6:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00d5: PHI (r17v3 java.lang.String) = (r17v1 java.lang.String), (r17v2 java.lang.String), (r17v1 java.lang.String), (r17v1 java.lang.String) binds: [B:31:0x00d3, B:27:0x00b4, B:14:0x0059, B:6:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01e9 A[PHI: r4 r5 r6 r8 r16
      0x01e9: PHI (r4v3 char) = (r4v2 char), (r4v1 char), (r4v1 char) binds: [B:58:0x01e7, B:54:0x01c7, B:46:0x0180] A[DONT_GENERATE, DONT_INLINE]
      0x01e9: PHI (r5v3 short) = (r5v1 short), (r5v2 short), (r5v1 short) binds: [B:58:0x01e7, B:54:0x01c7, B:46:0x0180] A[DONT_GENERATE, DONT_INLINE]
      0x01e9: PHI (r6v3 int) = (r6v1 int), (r6v2 int), (r6v1 int) binds: [B:58:0x01e7, B:54:0x01c7, B:46:0x0180] A[DONT_GENERATE, DONT_INLINE]
      0x01e9: PHI (r8v2 short) = (r8v1 short), (r8v1 short), (r8v3 short) binds: [B:58:0x01e7, B:54:0x01c7, B:46:0x0180] A[DONT_GENERATE, DONT_INLINE]
      0x01e9: PHI (r16v11 int) = (r16v8 int), (r16v9 int), (r16v12 int) binds: [B:58:0x01e7, B:54:0x01c7, B:46:0x0180] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0218 A[PHI: r10 r11 r16
      0x0218: PHI (r10v3 short[]) = (r10v1 short[]), (r10v2 short[]), (r10v1 short[]) binds: [B:62:0x0216, B:35:0x0107, B:15:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0218: PHI (r11v3 int) = (r11v1 int), (r11v2 int), (r11v1 int) binds: [B:62:0x0216, B:35:0x0107, B:15:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0218: PHI (r16v20 int) = (r16v7 int), (r16v17 int), (r16v22 int) binds: [B:62:0x0216, B:35:0x0107, B:15:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0248 A[PHI: r3 r7 r16
      0x0248: PHI (r3v3 short[]) = (r3v2 short[]), (r3v1 short[]), (r3v1 short[]) binds: [B:66:0x0246, B:50:0x01a1, B:11:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0248: PHI (r7v3 int) = (r7v1 int), (r7v2 int), (r7v1 int) binds: [B:66:0x0246, B:50:0x01a1, B:11:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0248: PHI (r16v24 int) = (r16v6 int), (r16v10 int), (r16v25 int) binds: [B:66:0x0246, B:50:0x01a1, B:11:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String mo3615() {
        int iM45029;
        int i;
        int i2;
        int iM450210 = 0;
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
        int i9 = -910041528;
        int i10 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int i11 = RunnableC3388.f12514;
        int iM11306 = (ThreadFactoryC3888.m11306("ۡ۟") ^ i11) * (-13);
        int i12 = ((iM11306 ^ i10) * (-12381)) ^ 1687232677;
        int i13 = iM11306 ^ 1921999504;
        String strM3009 = null;
        while (true) {
            int i14 = i13 ^ (i12 & (((i9 ^ i10) * (-1975)) >> 31));
            switch (i14) {
                case -2140640821:
                case 631132799:
                    i14 = i14;
                    s = sArr[c];
                    i4 = s * s;
                    if (C3286.m9798() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۤ") ^ i10;
                        i = ((iM45029 ^ i11) * 10009) ^ 478425759;
                        i2 = 787037951;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֡ۢ") + i11) * 93;
                        i = ((iM45029 ^ i10) * 11093) ^ (-1817133052);
                        i2 = 1751425192;
                    }
                    int i15 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i15;
                    break;
                case -2124929312:
                case 1157413317:
                    i14 = i14;
                    sArr2 = f3632;
                    i7 = 401;
                    if (C1668.f6641 >= 0) {
                        iM45029 = C19806.m45029("ܿۨ") ^ i11;
                        i = ((iM45029 ^ i10) * (-24687)) ^ 1288619322;
                        i2 = -1828547873;
                    } else {
                        iM45029 = C19806.m45029("۬ۘ") ^ i11;
                        i = ((iM45029 ^ i10) * 2785) ^ 1670871623;
                        i2 = 1681796682;
                    }
                    int i16 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i16;
                    break;
                case -1955410877:
                case 1477820490:
                    i14 = i14;
                    sArr = f3632;
                    if (C0216.f1393 != 0) {
                        iM45029 = (C19806.m45029("ۨۛ") ^ i11) * 87;
                        i = ((iM45029 ^ i10) * (-10381)) ^ 1744475640;
                        i2 = -1710138984;
                    } else {
                        iM45029 = C19806.m45029("ۢܿ") ^ i11;
                        i = ((iM45029 ^ i10) * 13709) ^ (-1887434020);
                        i2 = -991994614;
                    }
                    int i17 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i17;
                    break;
                case -1880383957:
                case 315550919:
                    C0629.m2907();
                    if (C0526.m2437() >= 0) {
                        iM45029 = C19806.m45029("᩸۠") ^ i10;
                        i14 = i14;
                        i = ((iM45029 ^ i11) * (-3717)) ^ (-1900720696);
                        i2 = -891954671;
                    } else {
                        i14 = i14;
                        iM45029 = (C19806.m45029("ۨۛ") ^ i11) * 87;
                        i = ((iM45029 ^ i10) * (-10381)) ^ 1744475640;
                        i2 = -1710138984;
                    }
                    int i18 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i18;
                    break;
                case -1539647069:
                case 1776736234:
                    i14 = i14;
                    strM3009 = C0671.m3009(sArr2, i7, i8, i6);
                    if (C1977.f7413 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ᩺") ^ i10;
                        i = ((iM45029 ^ i11) * 3929) ^ 148633930;
                        i2 = 1936878280;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ۨ") ^ i11) * 25;
                        i = ((iM45029 ^ i10) * (-19113)) ^ (-760328047);
                        i2 = 740005013;
                    }
                    int i19 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i19;
                    break;
                case -1390650686:
                case 218268905:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (C2124.m6673() > 0) {
                        iM45029 = C19806.m45029("᩸۠") ^ i10;
                        i14 = i14;
                        i = ((iM45029 ^ i11) * (-3717)) ^ (-1900720696);
                        i2 = -891954671;
                    } else {
                        i14 = i14;
                        iM45029 = ThreadFactoryC3888.m11306("ܰ᩺") ^ i10;
                        i = ((iM45029 ^ i11) * 3929) ^ 148633930;
                        i2 = 1936878280;
                    }
                    int i110 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i110;
                    break;
                case -1302202720:
                case 341902653:
                    i14 = i14;
                    s2 = 11344;
                    if (C3722.m10894() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۤ") ^ i10;
                        i = ((iM45029 ^ i11) * 10009) ^ 478425759;
                        i2 = 787037951;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ᩹") ^ i11;
                        i = ((iM45029 ^ i10) * (-17609)) ^ (-1371015195);
                        i2 = 701233145;
                    }
                    int i111 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i111;
                    break;
                case -1211373531:
                case -450004419:
                    i14 = i14;
                    if (i5 - (s * s2) < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖۢ") ^ i10) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM45029 ^ i11) * 17023) ^ 1381575433;
                        i2 = 1823162897;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚۛ") ^ i11) * (-17);
                        i = ((iM45029 ^ i10) * (-24089)) ^ (-653660793);
                        i2 = -1136937010;
                    }
                    int i112 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i112;
                    break;
                case -861009370:
                case 1809118414:
                    RunnableC3388.m10064();
                    C1461.m5080();
                    return null;
                case -764377547:
                case -573016435:
                    C2249.m6915();
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    iM45029 = C19806.m45029("᩸۠") ^ i10;
                    i14 = i14;
                    i = ((iM45029 ^ i11) * (-3717)) ^ (-1900720696);
                    i2 = -891954671;
                    int i113 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i113;
                    break;
                case -291823558:
                case -96599399:
                    i14 = i14;
                    i8 = 3;
                    if (C1977.f7413 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ᩺") ^ i10;
                        i = ((iM45029 ^ i11) * 3929) ^ 148633930;
                        i2 = 1936878280;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻᩵") ^ i10;
                        i = ((iM45029 ^ i11) * 13357) ^ (-1479816413);
                        i2 = 87786318;
                    }
                    int i114 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i114;
                    break;
                case -161491537:
                case 251467272:
                    i14 = i14;
                    i5 = i4 + 32171584;
                    if (C1419.f5860 >= 0) {
                        iM45029 = (C19806.m45029("ۨۛ") ^ i11) * 87;
                        i = ((iM45029 ^ i10) * (-10381)) ^ 1744475640;
                        i2 = -1710138984;
                    } else {
                        iM45029 = (i10 - ThreadFactoryC3888.m11306("۟ۘ")) * 97;
                        i = ((iM45029 ^ i11) * (-6155)) ^ (-1254269304);
                        i2 = -1290331202;
                    }
                    int i115 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i115;
                    break;
                case -135072744:
                case 1036423916:
                    i6 = 19012;
                    iM45029 = C19806.m45029("ܺۙ") ^ i10;
                    i = ((iM45029 ^ i11) * (-19565)) ^ 1458071888;
                    i2 = 542823816;
                    int i116 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i116;
                    break;
                case -85749466:
                case 470453079:
                    i6 = 9624;
                    iM45029 = C19806.m45029("ܺۙ") ^ i10;
                    i = ((iM45029 ^ i11) * (-19565)) ^ 1458071888;
                    i2 = 542823816;
                    int i117 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i117;
                    break;
                case -55608859:
                case 1524592680:
                    i14 = i14;
                    if (C1461.f5957 <= 0) {
                        iM45029 = C19806.m45029("ܿۨ") ^ i11;
                        i = ((iM45029 ^ i10) * (-24687)) ^ 1288619322;
                        i2 = -1828547873;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳܶ") ^ i10;
                        i = ((iM45029 ^ i11) * 17833) ^ 1781912524;
                        i2 = -2024250400;
                    }
                    int i118 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i118;
                    break;
                case 317426436:
                case 1325054601:
                    return C1875.m6085(iM450210 ^ i3);
                case 643386740:
                case 1427010779:
                    i14 = i14;
                    c = 400;
                    if (C2704.f10408) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺ۖ") ^ i10;
                        i = ((iM45029 ^ i11) * (-32323)) ^ 864133104;
                        i2 = 560547808;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۤ") ^ i10;
                        i = ((iM45029 ^ i11) * 10009) ^ 478425759;
                        i2 = 787037951;
                    }
                    int i119 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i119;
                    break;
                case 671464653:
                case 673070412:
                    if (!C2704.f10408) {
                        i14 = i14;
                        iM45029 = C19806.m45029("ܿۨ") ^ i11;
                        i = ((iM45029 ^ i10) * (-24687)) ^ 1288619322;
                        i2 = -1828547873;
                        int i1110 = i14;
                        i13 = iM45029 ^ i2;
                        i12 = i;
                        i9 = i1110;
                    }
                    i14 = i14;
                    iM45029 = ThreadFactoryC3888.m11306("ܰ᩺") ^ i10;
                    i = ((iM45029 ^ i11) * 3929) ^ 148633930;
                    i2 = 1936878280;
                    int i1111 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i1111;
                    break;
                default:
                    i14 = i14;
                    iM450210 = C19806.m45029(strM3009);
                    i3 = 2102781156;
                    if (C0050.f912 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ᩺") ^ i10;
                        i = ((iM45029 ^ i11) * 3929) ^ 148633930;
                        i2 = 1936878280;
                    } else {
                        iM45029 = C19806.m45029("۬ᩳ") ^ i11;
                        i = ((iM45029 ^ i10) * 16621) ^ (-2044719250);
                        i2 = -1930720324;
                    }
                    int i1112 = i14;
                    i13 = iM45029 ^ i2;
                    i12 = i;
                    i9 = i1112;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d3 A[PHI: r3 r5
      0x00d3: PHI (r3v4 l.ۡ᩺ۙ) = (r3v3 l.ۡ᩺ۙ), (r3v2 l.ۡ᩺ۙ), (r3v2 l.ۡ᩺ۙ), (r3v2 l.ۡ᩺ۙ), (r3v2 l.ۡ᩺ۙ) binds: [B:39:0x00d1, B:28:0x0087, B:20:0x0066, B:16:0x0058, B:9:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r5v4 l.ۡ᩺ۙ) = (r5v2 l.ۡ᩺ۙ), (r5v3 l.ۡ᩺ۙ), (r5v2 l.ۡ᩺ۙ), (r5v2 l.ۡ᩺ۙ), (r5v2 l.ۡ᩺ۙ) binds: [B:39:0x00d1, B:28:0x0087, B:20:0x0066, B:16:0x0058, B:9:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x014c A[PHI: r1 r11
      0x014c: PHI (r1v5 java.lang.Class<l.ᩳ᩻ۘ>) = (r1v4 java.lang.Class<l.ᩳ᩻ۘ>), (r1v2 java.lang.Class<l.ᩳ᩻ۘ>) binds: [B:50:0x014a, B:13:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x014c: PHI (r11v8 l.ܽܶۙ) = (r11v5 l.ܽܶۙ), (r11v4 l.ܽܶۙ) binds: [B:50:0x014a, B:13:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0179 A[PHI: r2
      0x0179: PHI (r2v5 l.ᩳ᩻ۘ) = (r2v2 l.ᩳ᩻ۘ), (r2v4 l.ᩳ᩻ۘ), (r2v2 l.ᩳ᩻ۘ), (r2v2 l.ᩳ᩻ۘ), (r2v2 l.ᩳ᩻ۘ), (r2v2 l.ᩳ᩻ۘ) binds: [B:54:0x0177, B:43:0x0107, B:23:0x0073, B:18:0x005c, B:16:0x0058, B:13:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC22611, l.ComponentCallbacksC22654
    public final void onCreate(Bundle bundle) {
        int iM11306;
        int i;
        Class<C18377> cls = null;
        C18377 c18377 = null;
        C9186 c9186M42622 = null;
        C18377 c18378 = null;
        C9186 c9186M42648 = null;
        int i2 = -1927264119;
        int i3 = C2249.f8050;
        int i4 = C1398.f5802;
        int iM11307 = (ThreadFactoryC3888.m11306("᩵ᩳ") ^ i4) * (-65);
        int i5 = ((iM11307 ^ i3) * (-13423)) ^ (-719710107);
        int i6 = -2065565082;
        while (true) {
            int i7 = iM11307 ^ i6;
            C16717 c16717 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-2523)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1951706693:
                    case -78549748:
                        super.onCreate(bundle);
                        if (C1377.f5749) {
                            iM11306 = ThreadFactoryC3888.m11306("᩵᩸") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-30521)) ^ 874571560;
                            i = -1084140610;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ܿ᩶") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-16629)) ^ (-1957488665);
                            i = 584181969;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -1908581825:
                    case -1253784998:
                        if (C1025.f4800 < 0) {
                            iM11306 = C19806.m45029("ܰܶ") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-12337)) ^ (-1007734550);
                            i = -399404241;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ܽܺ") ^ i4) * (-3);
                            i5 = ((iM11306 ^ i3) * (-9017)) ^ (-1490623787);
                            i = -670054830;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -1851333437:
                    case -1704492862:
                        c9186M42622 = c18377.m42622();
                        if (C1668.f6641 >= 0) {
                            iM11306 = C19806.m45029("ܰܶ") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-12337)) ^ (-1007734550);
                            i = -399404241;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ܰۘ") ^ i3) * 21;
                            i5 = ((iM11306 ^ i4) * (-4465)) ^ 918840508;
                            i = 42519958;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -1498329422:
                    case 709602894:
                        C0797.m3359();
                        if (AbstractC0464.f2088 <= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ܿ᩶") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-16629)) ^ (-1957488665);
                            i = 584181969;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ܽۗ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 29993) ^ 899660885;
                            i = -1545182154;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -1484129176:
                    case -1143201752:
                        c18377 = (C18377) c16717.m39205(cls);
                        this.f3634 = c18377;
                        if (C3577.f13150 >= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ܿ᩶") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-16629)) ^ (-1957488665);
                            i = 584181969;
                        } else {
                            iM11306 = (C19806.m45029("ۤ۟") ^ i4) * 29;
                            i5 = ((iM11306 ^ i3) * (-3137)) ^ 2094930558;
                            i = 1893568749;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -1237535778:
                    case 1669714531:
                        if (ThreadFactoryC3888.f14547 > 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ܿ᩶") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-16629)) ^ (-1957488665);
                            i = 584181969;
                        } else {
                            iM11306 = C19806.m45029("ܰܶ") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-12337)) ^ (-1007734550);
                            i = -399404241;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -895149627:
                    case 277260619:
                        int i8 = 1;
                        if (!C2332.f8260) {
                        }
                        C7105.m18983(c9186M42622, this, new C11528(i8, this));
                        c18378 = this.f3634;
                        if (C3660.f13403 < 0) {
                            iM11306 = C19806.m45029("۫᩹") ^ i3;
                            i5 = ((iM11306 ^ i4) * 9775) ^ (-527401178);
                            i = -60028281;
                            i7 = iM11306 ^ i;
                        }
                        break;
                        break;
                        break;
                    case 139493092:
                    case 1007659782:
                        c9186M42648 = c18378.m42648();
                        if (C0962.f3784) {
                            iM11306 = C19806.m45029("ܰܶ") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-12337)) ^ (-1007734550);
                            i = -399404241;
                        } else {
                            iM11306 = (i4 - C19806.m45029("᩵ܰ")) * (-127);
                            i5 = ((iM11306 ^ i3) * 13837) ^ 1941737687;
                            i = -1315173885;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case 327721889:
                    case 782684959:
                        int i9 = 2;
                        if (C2332.f8260) {
                            C1937.m6282(c9186M42648, this, new C20137(i9, this));
                            if (C2249.f8050 < 0) {
                                this.f3636 = new C13608(this, getChildFragmentManager());
                            }
                            iM11306 = ThreadFactoryC3888.m11306("ܿ᩶") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-16629)) ^ (-1957488665);
                            i = 584181969;
                        } else {
                            iM11306 = C19806.m45029("ܰܶ") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-12337)) ^ (-1007734550);
                            i = -399404241;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case 676471878:
                    case 1583895808:
                        RunnableC1895.m6170();
                        iM11306 = ThreadFactoryC3888.m11306("ܿ᩶") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-16629)) ^ (-1957488665);
                        i = 584181969;
                        i7 = iM11306 ^ i;
                        break;
                    case 1466793805:
                    case 2130791538:
                        if (C2477.m7593() < 0) {
                            c16717 = new C16717(AbstractC0464.m2305(this));
                            cls = C18377.class;
                            if (C19806.f63586) {
                                iM11306 = ThreadFactoryC3888.m11306("ܽۗ") ^ i3;
                                i5 = ((iM11306 ^ i4) * 29993) ^ 899660885;
                                i = -1545182154;
                            } else {
                                iM11306 = ThreadFactoryC3888.m11306("ۙۚ") ^ i4;
                                i5 = ((iM11306 ^ i3) * 19643) ^ 1559426945;
                                i = -1935928652;
                            }
                            i7 = iM11306 ^ i;
                        }
                        break;
                    default:
                        C0671.m3008();
                        break;
                }
                return;
            }
            iM11307 = (i4 - C19806.m45029("᩶᩸")) * 63;
            i5 = ((iM11307 ^ i3) * (-7671)) ^ (-1463641505);
            i6 = 740500959;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x01b7 A[PHI: r7
      0x01b7: PHI (r7v4 l.᩺֨ۙ) = (r7v2 l.᩺֨ۙ), (r7v3 l.᩺֨ۙ), (r7v2 l.᩺֨ۙ) binds: [B:52:0x019d, B:25:0x00ba, B:22:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x027b A[PHI: r10 r12 r13
      0x027b: PHI (r10v4 short) = (r10v2 short), (r10v3 short), (r10v2 short), (r10v2 short) binds: [B:102:0x027b, B:71:0x0279, B:62:0x0222, B:7:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x027b: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:102:0x027b, B:71:0x0279, B:62:0x0222, B:7:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x027b: PHI (r13v4 short) = (r13v2 short), (r13v2 short), (r13v3 short), (r13v2 short) binds: [B:102:0x027b, B:71:0x0279, B:62:0x0222, B:7:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02b1 A[PHI: r5 r9 r21
      0x02b1: PHI (r5v3 java.lang.String) = (r5v2 java.lang.String), (r5v2 java.lang.String), (r5v5 java.lang.String) binds: [B:101:0x02b1, B:75:0x02af, B:32:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      0x02b1: PHI (r9v4 char) = (r9v2 char), (r9v3 char), (r9v2 char) binds: [B:101:0x02b1, B:75:0x02af, B:32:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      0x02b1: PHI (r21v3 short[]) = (r21v1 short[]), (r21v2 short[]), (r21v1 short[]) binds: [B:101:0x02b1, B:75:0x02af, B:32:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.InterfaceC19601
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo3616() {
        int iM11306;
        int i;
        int i2;
        int iM11307;
        int i3;
        int i4;
        int i5 = C3535.f13026;
        int i6 = C3577.f13150;
        int iM11308 = (ThreadFactoryC3888.m11306("ܺۜ") ^ i6) * 29;
        int i7 = ((iM11308 ^ i5) * (-5435)) ^ 1822858534;
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM11308 ^ 801535107;
        StringBuilder sb = null;
        AbstractC8894 childFragmentManager = null;
        char c = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = -2051170985;
        ComponentCallbacksC22654 componentCallbacksC22654M23119 = null;
        C19383 c19383 = null;
        String strM10423 = null;
        int iM6354 = 0;
        while (true) {
            i12 = i8 ^ (i7 & (((i12 ^ i5) * 5613) >> 31));
            switch (i12) {
                case -2056611111:
                case 273856357:
                    if (!C19806.f63586) {
                        iM11306 = (i5 - C19806.m45029("ܰ᩷")) * (-73);
                        i = ((iM11306 ^ i6) * (-6195)) ^ (-1166509970);
                        i2 = 1199926762;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                    } else {
                        iM11307 = (i6 - ThreadFactoryC3888.m11306("᩻ܶ")) * 59;
                        i3 = ((iM11307 ^ i5) * (-12795)) ^ 529202902;
                        i4 = -216111975;
                        i8 = iM11307 ^ i4;
                        i7 = i3;
                        sb = null;
                    }
                    break;
                case -1955529312:
                case -50240481:
                    i9 = s * 2;
                    if (!C1668.m5583()) {
                        iM11307 = (i6 - ThreadFactoryC3888.m11306("᩻ܶ")) * 59;
                        i3 = ((iM11307 ^ i5) * (-12795)) ^ 529202902;
                        i4 = -216111975;
                        i8 = iM11307 ^ i4;
                        i7 = i3;
                        sb = null;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۜ֫") ^ i6;
                        i = ((iM11306 ^ i5) * (-7083)) ^ 1452021576;
                        i2 = 741369153;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                    }
                    break;
                case -1818871894:
                case 808111948:
                    if (this.f3638 != null) {
                        iM11306 = (C19806.m45029("֡ۘ") + i6) * 115;
                        i = ((iM11306 ^ i5) * 16543) ^ (-787301987);
                        i2 = 1013480093;
                    } else {
                        iM11306 = C19806.m45029("ۘۤ") ^ i5;
                        i = ((iM11306 ^ i6) * 15317) ^ 1333789468;
                        i2 = -1960121440;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1814321948:
                case -715139977:
                    if (C3722.f13525 > 0) {
                        iM11306 = (i6 - C19806.m45029("۟᩸")) * (-89);
                        i = ((iM11306 ^ i5) * (-25219)) ^ (-1410849341);
                        i2 = 1391775798;
                    } else {
                        iM11306 = C19806.m45029("ۖ᩹") ^ i5;
                        i = ((iM11306 ^ i6) * (-27835)) ^ 735835159;
                        i2 = -628471643;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1713975790:
                case -435192611:
                    strM10423 = C3535.m10423(sArr2, 422, 1, i11);
                    if (C2249.f8050 >= 0) {
                        iM11306 = (i5 - C19806.m45029("ܰ᩷")) * (-73);
                        i = ((iM11306 ^ i6) * (-6195)) ^ (-1166509970);
                        i2 = 1199926762;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧ۬") + i5) * 93;
                        i = ((iM11306 ^ i6) * (-29815)) ^ (-1015683935);
                        i2 = 1019001773;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1708930874:
                case 2080629248:
                    CallableC1627.m5507();
                    iM11307 = (i6 - ThreadFactoryC3888.m11306("᩻ܶ")) * 59;
                    i3 = ((iM11307 ^ i5) * (-12795)) ^ 529202902;
                    i4 = -216111975;
                    i8 = iM11307 ^ i4;
                    i7 = i3;
                    sb = null;
                    break;
                case -1706636566:
                case -1224868515:
                    i10 = i9 + 1;
                    s2 = 1;
                    if (C1148.f5161 <= 0) {
                        iM11306 = (i6 - C19806.m45029("۟᩸")) * (-89);
                        i = ((iM11306 ^ i5) * (-25219)) ^ (-1410849341);
                        i2 = 1391775798;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡ᩵") + i5) * (-117);
                        i = ((iM11306 ^ i6) * (-24171)) ^ (-1042152501);
                        i2 = -1948020333;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1699581219:
                case 345647949:
                    C2124.m6683(sb, iM6354);
                    sArr2 = f3632;
                    if (ThreadFactoryC3888.f14547 > 0) {
                        iM11306 = C19806.m45029("ۗܺ") ^ i6;
                        i = ((iM11306 ^ i5) * 31015) ^ (-484340090);
                        i2 = 52123394;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("᩶ۚ") ^ i6;
                        i3 = ((iM11307 ^ i5) * (-10957)) ^ (-1005901013);
                        i4 = 152427923;
                        i8 = iM11307 ^ i4;
                        i7 = i3;
                        sb = null;
                    }
                    break;
                case -1678558242:
                case 1529941480:
                    C2124.m6683(sb, c19383.m44426());
                    componentCallbacksC22654M23119 = childFragmentManager.m23119(C0817.m3407(sb));
                    if (componentCallbacksC22654M23119 instanceof InterfaceC19601) {
                        iM11306 = ThreadFactoryC3888.m11306("ۤۘ") ^ i6;
                        i = ((iM11306 ^ i5) * 5891) ^ (-1733076164);
                        i2 = 1050376798;
                    } else {
                        iM11306 = C19806.m45029("ۘۤ") ^ i5;
                        i = ((iM11306 ^ i6) * 15317) ^ 1333789468;
                        i2 = -1960121440;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1537809287:
                case 1442730477:
                    if (((InterfaceC19601) componentCallbacksC22654M23119).mo3616()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ᩻") ^ i5;
                        i = ((iM11306 ^ i6) * (-11809)) ^ (-111508474);
                        i2 = 54360269;
                    } else {
                        iM11306 = C19806.m45029("ۘۤ") ^ i5;
                        i = ((iM11306 ^ i6) * 15317) ^ 1333789468;
                        i2 = -1960121440;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1510643454:
                case -578626013:
                    int i13 = s + s2;
                    if (i10 - (i13 * i13) <= 0) {
                        iM11306 = C19806.m45029("ܺᩴ") ^ i6;
                        i = ((iM11306 ^ i5) * (-32659)) ^ (-725043490);
                        i2 = -495708942;
                    } else {
                        iM11306 = (C19806.m45029("ᩴܺ") + i5) * 23;
                        i = ((iM11306 ^ i6) * (-1713)) ^ (-1237154554);
                        i2 = 695977984;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1500652402:
                case -1184619406:
                    sArr = f3632;
                    c = 404;
                    if (C2124.f7782 <= 0) {
                        iM11306 = (i5 - C19806.m45029("ܰ᩷")) * (-73);
                        i = ((iM11306 ^ i6) * (-6195)) ^ (-1166509970);
                        i2 = 1199926762;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ᩳ") ^ i5;
                        i = ((iM11306 ^ i6) * 23619) ^ 1249161301;
                        i2 = 993515915;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1273728493:
                case -455725867:
                    i11 = 25348;
                    iM11306 = ThreadFactoryC3888.m11306("֡᩶") ^ i6;
                    i = ((iM11306 ^ i5) * (-1507)) ^ (-530996205);
                    i2 = -1427683862;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1225901117:
                case 1308920065:
                    childFragmentManager = getChildFragmentManager();
                    short[] sArr3 = f3632;
                    if (C1066.f4915 <= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("᩶ۚ") ^ i6;
                        i3 = ((iM11307 ^ i5) * (-10957)) ^ (-1005901013);
                        i4 = 152427923;
                        i8 = iM11307 ^ i4;
                        i7 = i3;
                        sb = null;
                    } else {
                        String strM7082 = C2332.m7082(sArr3, 405, 17, i11);
                        if (C0216.f1393 == 0) {
                            sb = new StringBuilder(strM7082);
                            iM6354 = C1977.m6354(this.f3638);
                            if (!C1419.m4973()) {
                                int iM11309 = (ThreadFactoryC3888.m11306("᩻ܺ") + i5) * (-125);
                                i8 = iM11309 ^ 963928823;
                                i7 = ((iM11309 ^ i6) * 18937) ^ (-1856741583);
                                childFragmentManager = childFragmentManager;
                            }
                        }
                        childFragmentManager = childFragmentManager;
                        iM11307 = (i6 - ThreadFactoryC3888.m11306("᩻ܶ")) * 59;
                        i3 = ((iM11307 ^ i5) * (-12795)) ^ 529202902;
                        i4 = -216111975;
                        i8 = iM11307 ^ i4;
                        i7 = i3;
                        sb = null;
                    }
                    break;
                case -1114276697:
                case -394613287:
                    C1148.m4223(sb, strM10423);
                    c19383 = this.f3638;
                    if (C1937.f7317 < 0) {
                        iM11306 = C19806.m45029("ۖۢ") ^ i5;
                        i = ((iM11306 ^ i6) * 14797) ^ (-806417226);
                        i2 = -1005331187;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("᩶ۚ") ^ i6;
                        i3 = ((iM11307 ^ i5) * (-10957)) ^ (-1005901013);
                        i4 = 152427923;
                        i8 = iM11307 ^ i4;
                        i7 = i3;
                        sb = null;
                    }
                    break;
                case -1057770746:
                case 1558033473:
                    return true;
                case -724955981:
                case 257569263:
                    return false;
                case -708928739:
                case 1691814624:
                    s = sArr[c];
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = (i6 - C19806.m45029("۟᩸")) * (-89);
                        i = ((iM11306 ^ i5) * (-25219)) ^ (-1410849341);
                        i2 = 1391775798;
                    } else {
                        iM11306 = (i6 - C19806.m45029("ܺܿ")) * (-69);
                        i = ((iM11306 ^ i5) * 18081) ^ (-1603762182);
                        i2 = -1142288091;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -288318078:
                case 863376339:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = (i6 - C19806.m45029("۟᩸")) * (-89);
                        i = ((iM11306 ^ i5) * (-25219)) ^ (-1410849341);
                        i2 = 1391775798;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                    } else {
                        iM11307 = (i6 - ThreadFactoryC3888.m11306("᩻ܶ")) * 59;
                        i3 = ((iM11307 ^ i5) * (-12795)) ^ 529202902;
                        i4 = -216111975;
                        i8 = iM11307 ^ i4;
                        i7 = i3;
                        sb = null;
                    }
                    break;
                case 1122210932:
                case 1603340913:
                    C2477.m7593();
                    return false;
                default:
                    i11 = 27806;
                    iM11306 = ThreadFactoryC3888.m11306("֡᩶") ^ i6;
                    i = ((iM11306 ^ i5) * (-1507)) ^ (-530996205);
                    i2 = -1427683862;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void m3612() {
        ActivityC19126 activityC19126M5049 = null;
        ActivityC5677 activityC5677 = null;
        TextView textViewM15670 = null;
        C9186 c9186M42648 = null;
        String str = null;
        int i = 1908042589;
        int i2 = ThreadFactoryC3888.f14547;
        int i3 = C3535.f13026;
        int iM45029 = (C19806.m45029("ۗۨ") + i3) * 75;
        int i4 = ((iM45029 ^ i2) * (-11943)) ^ 276119488;
        int i5 = -288077764;
        while (true) {
            i = ((((i ^ i2) * 15827) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2037163704:
                case -1043631453:
                    if (CallableC1627.f6528) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ֫") ^ i2;
                        i4 = ((iM45029 ^ i3) * 28825) ^ (-411249187);
                        i5 = 41119724;
                    } else {
                        iM45029 = (C19806.m45029("ᩴۜ") + i2) * (-103);
                        i4 = ((iM45029 ^ i3) * (-30733)) ^ (-486937552);
                        i5 = -92349290;
                    }
                    break;
                case -2000363277:
                case 903154915:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = C19806.m45029("᩻ۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 22187) ^ (-155584749);
                        i5 = 1940626209;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚۨ") + i3) * 99;
                        i4 = ((iM45029 ^ i2) * (-10203)) ^ 2130938133;
                        i5 = -894564427;
                    }
                    break;
                case -1930344568:
                case -559806318:
                    if (C19806.m45024()) {
                        iM45029 = (C19806.m45029("᩶֨") ^ i3) * (-29);
                        i4 = ((iM45029 ^ i2) * (-26145)) ^ (-590631914);
                        i5 = 1989842275;
                    } else {
                        iM45029 = C19806.m45029("֡֨") ^ i2;
                        i4 = ((iM45029 ^ i3) * 19839) ^ (-807744481);
                        i5 = -1708876583;
                    }
                    break;
                case -1848785530:
                case 1410335652:
                    if (C1461.f5957 <= 0) {
                        iM45029 = (C19806.m45029("ᩴۜ") + i2) * (-103);
                        i4 = ((iM45029 ^ i3) * (-30733)) ^ (-486937552);
                        i5 = -92349290;
                    } else {
                        iM45029 = C19806.m45029("֨᩺") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-26179)) ^ 1838943776;
                        i5 = 2085413595;
                    }
                    break;
                case -1803188317:
                case -958916198:
                    if (C3577.f13150 >= 0) {
                        iM45029 = C19806.m45029("ܶܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 17257) ^ 216088995;
                        i5 = 455791233;
                    } else {
                        iM45029 = C19806.m45029("᩻ۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 22187) ^ (-155584749);
                        i5 = 1940626209;
                    }
                    break;
                case -1699534808:
                case -1348712974:
                    if (textViewM15670 != null) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶֫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 16319) ^ (-2145387242);
                        i5 = 255885767;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫֫") ^ i2) * 65;
                        i4 = ((iM45029 ^ i3) * (-15927)) ^ 610704265;
                        i5 = -1386926942;
                    }
                    break;
                case -1247549783:
                case 1685042354:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM45029 = (C19806.m45029("᩶֨") ^ i3) * (-29);
                        i4 = ((iM45029 ^ i2) * (-26145)) ^ (-590631914);
                        i5 = 1989842275;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ۬") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-25429)) ^ 1233177817;
                        i5 = -1750589654;
                    }
                    break;
                case -1177685796:
                case 1113994438:
                    activityC5677.m15657((CharSequence) C13012.m32191(100, str));
                    break;
                case -967728800:
                case 1302382774:
                    str = (String) c9186M42648.m44956();
                    if (str != null) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-12769)) ^ 1225606625;
                        i5 = -984364983;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘۚ") + i2) * (-39);
                        i4 = ((iM45029 ^ i3) * (-19729)) ^ (-73278159);
                        i5 = 414768444;
                    }
                    break;
                case -903044895:
                case -138729593:
                    c9186M42648 = this.f3634.m42648();
                    if (C3535.m10431() <= 0) {
                        iM45029 = (C19806.m45029("ᩴۜ") + i2) * (-103);
                        i4 = ((iM45029 ^ i3) * (-30733)) ^ (-486937552);
                        i5 = -92349290;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("۬᩷")) * (-17);
                        i4 = ((iM45029 ^ i3) * 6777) ^ 203668990;
                        i5 = 248717249;
                    }
                    break;
                case -867720454:
                case 473385249:
                    activityC5677 = (ActivityC5677) activityC19126M5049;
                    if (RunnableC3388.m10064()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜܰ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-12777)) ^ 304497097;
                        i5 = 671991644;
                    } else {
                        iM45029 = (C19806.m45029("᩶֨") ^ i3) * (-29);
                        i4 = ((iM45029 ^ i2) * (-26145)) ^ (-590631914);
                        i5 = 1989842275;
                    }
                    break;
                case -838057686:
                case 1486042748:
                    if (textViewM15670 != null) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܳܶ")) * (-59);
                        i4 = ((iM45029 ^ i2) * 1587) ^ (-1966603383);
                        i5 = -1950067615;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩹ۤ")) * 17;
                        i4 = ((iM45029 ^ i3) * 9419) ^ (-790170799);
                        i5 = -2019528992;
                    }
                    break;
                case -472971729:
                case 1439875396:
                    if (C0671.f2816 == 0) {
                        iM45029 = C19806.m45029("ܶܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 17257) ^ 216088995;
                        i5 = 455791233;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸᩹") ^ i2;
                        i4 = ((iM45029 ^ i3) * 1461) ^ 878298632;
                        i5 = -1604420263;
                    }
                    break;
                case -188105526:
                case 1002789097:
                    activityC5677.m15657((CharSequence) this.f3633);
                    break;
                case -163661732:
                case -9773258:
                    RunnableC0195.m1431();
                    if (C3722.f13525 <= 0) {
                        iM45029 = (C19806.m45029("ᩴۜ") + i2) * (-103);
                        i4 = ((iM45029 ^ i3) * (-30733)) ^ (-486937552);
                        i5 = -92349290;
                    } else {
                        iM45029 = C19806.m45029("ܶܿ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 17257) ^ 216088995;
                        i5 = 455791233;
                    }
                    break;
                case -131757684:
                case 2124870616:
                    activityC19126M5049 = C1460.m5049(this);
                    if (C0671.f2816 != 0) {
                        iM45029 = (C19806.m45029("ᩴۜ") + i2) * (-103);
                        i4 = ((iM45029 ^ i3) * (-30733)) ^ (-486937552);
                        i5 = -92349290;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֨ܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 16001) ^ 1424700174;
                        i5 = -364680136;
                    }
                    break;
                case 220747222:
                case 1154091095:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    C1668.m5583();
                    iM45029 = C19806.m45029("᩻ۡ") ^ i2;
                    i4 = ((iM45029 ^ i3) * 22187) ^ (-155584749);
                    i5 = 1940626209;
                    break;
                case 598480662:
                case 1402691923:
                    if (RunnableC1895.f7152) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶۖ") ^ i3) * (-51);
                        i4 = ((iM45029 ^ i2) * (-23581)) ^ (-1924700323);
                        i5 = -177166476;
                    } else {
                        iM45029 = C19806.m45029("᩻ۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 22187) ^ (-155584749);
                        i5 = 1940626209;
                    }
                    break;
                case 634071779:
                case 1542839663:
                    C2477.m7593();
                    C10634.m26820();
                    break;
                case 710274108:
                case 1816357325:
                    textViewM15670.setEllipsize(TextUtils.TruncateAt.END);
                    iM45029 = (i2 - ThreadFactoryC3888.m11306("᩹ۤ")) * 17;
                    i4 = ((iM45029 ^ i3) * 9419) ^ (-790170799);
                    i5 = -2019528992;
                    break;
                case 1251413703:
                case 2012029079:
                    textViewM15670 = activityC5677.m15670();
                    if (this.f3638.m44426() == 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۧܺ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM45029 ^ i2) * 11211) ^ 76073774;
                        i5 = 456835389;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘۚ") + i2) * (-39);
                        i4 = ((iM45029 ^ i3) * (-19729)) ^ (-73278159);
                        i5 = 414768444;
                    }
                    break;
                case 1352893485:
                case 1793756585:
                    textViewM15670.setEllipsize(TextUtils.TruncateAt.START);
                    iM45029 = (ThreadFactoryC3888.m11306("֫֫") ^ i2) * 65;
                    i4 = ((iM45029 ^ i3) * (-15927)) ^ 610704265;
                    i5 = -1386926942;
                    break;
                default:
                    if (C1937.f7317 >= 0) {
                        iM45029 = C19806.m45029("᩻ۡ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 22187) ^ (-155584749);
                        i5 = 1940626209;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۛ") + i2) * (-61);
                        i4 = ((iM45029 ^ i3) * (-7133)) ^ 1253174017;
                        i5 = 1606697415;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01d5 A[PHI: r6 r7 r8 r17 r18
      0x01d5: PHI (r6v3 int) = (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:56:0x01d3, B:52:0x01b2, B:30:0x00a5] A[DONT_GENERATE, DONT_INLINE]
      0x01d5: PHI (r7v3 int) = (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:56:0x01d3, B:52:0x01b2, B:30:0x00a5] A[DONT_GENERATE, DONT_INLINE]
      0x01d5: PHI (r8v3 int) = (r8v1 int), (r8v2 int), (r8v1 int) binds: [B:56:0x01d3, B:52:0x01b2, B:30:0x00a5] A[DONT_GENERATE, DONT_INLINE]
      0x01d5: PHI (r17v17 int) = (r17v7 int), (r17v8 int), (r17v19 int) binds: [B:56:0x01d3, B:52:0x01b2, B:30:0x00a5] A[DONT_GENERATE, DONT_INLINE]
      0x01d5: PHI (r18v2 java.lang.String) = (r18v1 java.lang.String), (r18v1 java.lang.String), (r18v3 java.lang.String) binds: [B:56:0x01d3, B:52:0x01b2, B:30:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x020a A[PHI: r5 r11 r12 r17
      0x020a: PHI (r5v3 short) = (r5v2 short), (r5v1 short) binds: [B:60:0x0208, B:37:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r11v2 short[]) = (r11v1 short[]), (r11v3 short[]) binds: [B:60:0x0208, B:37:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r12v2 int) = (r12v1 int), (r12v3 int) binds: [B:60:0x0208, B:37:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r17v14 int) = (r17v6 int), (r17v15 int) binds: [B:60:0x0208, B:37:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x020c A[PHI: r1 r2 r5 r11 r12
      0x020c: PHI (r1v53 int) = (r1v26 int), (r1v1 int), (r1v1 int), (r1v58 int) binds: [B:61:0x020a, B:17:0x005c, B:13:0x0052, B:26:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r2v3 int) = (r2v1 int), (r2v1 int), (r2v1 int), (r2v5 int) binds: [B:61:0x020a, B:17:0x005c, B:13:0x0052, B:26:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r5v5 short) = (r5v3 short), (r5v1 short), (r5v1 short), (r5v1 short) binds: [B:61:0x020a, B:17:0x005c, B:13:0x0052, B:26:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r11v5 short[]) = (r11v2 short[]), (r11v1 short[]), (r11v1 short[]), (r11v1 short[]) binds: [B:61:0x020a, B:17:0x005c, B:13:0x0052, B:26:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x020c: PHI (r12v5 int) = (r12v2 int), (r12v1 int), (r12v1 int), (r12v1 int) binds: [B:61:0x020a, B:17:0x005c, B:13:0x0052, B:26:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0253 A[PHI: r3 r4 r17
      0x0253: PHI (r3v3 short[]) = (r3v2 short[]), (r3v1 short[]), (r3v1 short[]) binds: [B:66:0x0251, B:15:0x0056, B:6:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0253: PHI (r4v2 char) = (r4v1 char), (r4v1 char), (r4v3 char) binds: [B:66:0x0251, B:15:0x0056, B:6:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0253: PHI (r17v25 int) = (r17v5 int), (r17v20 int), (r17v26 int) binds: [B:66:0x0251, B:15:0x0056, B:6:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC22611
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String mo3620() {
        int iM45029;
        int i;
        int i2;
        int iM11306 = 0;
        int i3 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        short s2 = 0;
        int i7 = 0;
        short[] sArr2 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 883096691;
        int i11 = C0050.f912;
        int i12 = C1025.f4800;
        int iM450210 = C19806.m45029("ܶۨ") ^ i12;
        int i13 = ((iM450210 ^ i11) * (-28285)) ^ (-1349355992);
        int i14 = iM450210 ^ (-1476798070);
        String strM10571 = null;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i11) * 18677) >> 31));
            switch (i10) {
                case -2122257944:
                case 1713422244:
                    iM11306 = ThreadFactoryC3888.m11306(strM10571);
                    if (C1977.m6356()) {
                        i3 = 2124818840;
                        iM45029 = ThreadFactoryC3888.m11306("ܳ֡") ^ i11;
                        iM11306 = iM11306;
                        i = ((iM45029 ^ i12) * 22715) ^ 1653874950;
                        i2 = 649671514;
                        int i15 = iM11306;
                        i14 = iM45029 ^ i2;
                        i13 = i;
                        iM11306 = i15;
                    } else {
                        int iM11307 = (ThreadFactoryC3888.m11306("ܶ۠") ^ i12) * 59;
                        i14 = iM11307 ^ 520088449;
                        i13 = ((iM11307 ^ i11) * 12841) ^ (-239422448);
                        i3 = 2124818840;
                    }
                    break;
                case -2116241786:
                case -183480933:
                    i7 = 29785;
                    iM45029 = ThreadFactoryC3888.m11306("ۜۗ") ^ i12;
                    i = ((iM45029 ^ i11) * (-17065)) ^ (-1391948165);
                    i2 = 1484535789;
                    int i16 = iM11306;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM11306 = i16;
                    break;
                case -2107430026:
                case 1873879028:
                    i7 = 41695;
                    iM45029 = ThreadFactoryC3888.m11306("ۜۗ") ^ i12;
                    i = ((iM45029 ^ i11) * (-17065)) ^ (-1391948165);
                    i2 = 1484535789;
                    int i17 = iM11306;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM11306 = i17;
                    break;
                case -1999824807:
                case 1576510643:
                    iM11306 = iM11306;
                    sArr2 = f3632;
                    i8 = 424;
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = iM11306;
                        iM45029 = ThreadFactoryC3888.m11306("ܳ֡") ^ i11;
                        iM11306 = iM11306;
                        i = ((iM45029 ^ i12) * 22715) ^ 1653874950;
                        i2 = 649671514;
                    } else {
                        iM45029 = (C19806.m45029("ۗܳ") + i11) * (-71);
                        i = ((iM45029 ^ i12) * (-28359)) ^ (-1351984117);
                        i2 = -1321136992;
                    }
                    int i18 = iM11306;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM11306 = i18;
                    break;
                case -1960846830:
                case 103851910:
                    return C1875.m6085(iM11306 ^ i3);
                case -1616606734:
                case 914028747:
                    iM11306 = iM11306;
                    s2 = 1195;
                    if (C3577.f13150 >= 0) {
                        iM45029 = (i11 - C19806.m45029("ۚۗ")) * (-93);
                        i = ((iM45029 ^ i12) * (-31465)) ^ 1945539363;
                        i2 = -354215517;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ֫") ^ i12;
                        i = ((iM45029 ^ i11) * 6113) ^ 530793416;
                        i2 = 175729341;
                    }
                    int i19 = iM11306;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM11306 = i19;
                    break;
                case -1366958507:
                case -866995351:
                    if (C1025.f4800 < 0) {
                        iM11306 = iM11306;
                        iM45029 = (C19806.m45029("ۘ֨") + i11) * (-29);
                        i = ((iM45029 ^ i12) * (-1431)) ^ (-184254562);
                        i2 = -1765507992;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ֡") ^ i11;
                        iM11306 = iM11306;
                        i = ((iM45029 ^ i12) * 22715) ^ 1653874950;
                        i2 = 649671514;
                    }
                    int i110 = iM11306;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM11306 = i110;
                    break;
                case -1103715311:
                case 2020850697:
                    if (C0629.f2722 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ֡") ^ i11;
                        iM11306 = iM11306;
                        i = ((iM45029 ^ i12) * 22715) ^ 1653874950;
                        i2 = 649671514;
                    } else {
                        iM11306 = iM11306;
                        iM45029 = C19806.m45029("ۜۤ") ^ i12;
                        i = ((iM45029 ^ i11) * 2839) ^ (-1610540672);
                        i2 = 2117398802;
                    }
                    int i111 = iM11306;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM11306 = i111;
                    break;
                case -908617519:
                case 566631209:
                    C0526.m2437();
                    return null;
                case -770711404:
                case 667606358:
                    C2871.m8646();
                    if (C0797.f3386) {
                        iM11306 = iM11306;
                        iM45029 = (i11 - C19806.m45029("ۚۗ")) * (-93);
                        i = ((iM45029 ^ i12) * (-31465)) ^ 1945539363;
                        i2 = -354215517;
                        int i112 = iM11306;
                        i14 = iM45029 ^ i2;
                        i13 = i;
                        iM11306 = i112;
                    }
                    iM11306 = iM11306;
                    iM45029 = (C19806.m45029("ۘ֨") + i11) * (-29);
                    i = ((iM45029 ^ i12) * (-1431)) ^ (-184254562);
                    i2 = -1765507992;
                    int i113 = iM11306;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM11306 = i113;
                    break;
                case -753719720:
                case -222493705:
                    strM10571 = C3577.m10571(sArr2, i8, i9, i7);
                    if (C1460.f5948 >= 0) {
                        iM11306 = iM11306;
                        iM45029 = (ThreadFactoryC3888.m11306("۬ۖ") + i12) * 31;
                        i = ((iM45029 ^ i11) * 21007) ^ (-252111106);
                        i2 = 1651354033;
                    } else {
                        iM45029 = (i12 - C19806.m45029("۠۟")) * 97;
                        iM11306 = iM11306;
                        i = ((iM45029 ^ i11) * (-13511)) ^ (-357362409);
                        i2 = 1966791028;
                    }
                    int i114 = iM11306;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM11306 = i114;
                    break;
                case -721156249:
                case 1788038775:
                    C1461.m5080();
                    iM11306 = iM11306;
                    iM45029 = (C19806.m45029("ۘ֨") + i11) * (-29);
                    i = ((iM45029 ^ i12) * (-1431)) ^ (-184254562);
                    i2 = -1765507992;
                    int i115 = iM11306;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM11306 = i115;
                    break;
                case -624395325:
                case 1485968630:
                    iM11306 = iM11306;
                    int i20 = s + s2;
                    if ((i20 * i20) - i6 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ᩺") + i12) * (-101);
                        i = ((iM45029 ^ i11) * 9081) ^ (-445378675);
                        i2 = -959025456;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ܳ") ^ i11;
                        i = ((iM45029 ^ i12) * (-14401)) ^ (-1631803790);
                        i2 = -1187385595;
                    }
                    int i116 = iM11306;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM11306 = i116;
                    break;
                case -602877634:
                case 932607105:
                    iM11306 = iM11306;
                    i4 = s * s;
                    i5 = 1428025;
                    if (C1398.f5802 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬ۖ") + i12) * 31;
                        i = ((iM45029 ^ i11) * 21007) ^ (-252111106);
                        i2 = 1651354033;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ᩳ") ^ i11;
                        i = ((iM45029 ^ i12) * (-24573)) ^ 1361498108;
                        i2 = -1191739141;
                    }
                    int i117 = iM11306;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM11306 = i117;
                    break;
                case -369956444:
                case 1857259719:
                    iM11306 = iM11306;
                    i9 = 3;
                    if (C1066.f4915 <= 0) {
                        iM45029 = (C19806.m45029("ۘ֨") + i11) * (-29);
                        i = ((iM45029 ^ i12) * (-1431)) ^ (-184254562);
                        i2 = -1765507992;
                    } else {
                        iM45029 = C19806.m45029("֫ۖ") ^ i11;
                        i = ((iM45029 ^ i12) * 24889) ^ (-851441024);
                        i2 = -1623652048;
                    }
                    int i118 = iM11306;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM11306 = i118;
                    break;
                case -186755582:
                case 1829551964:
                    iM11306 = iM11306;
                    int i21 = i4 + i5;
                    i6 = i21 + i21;
                    if (C0050.f912 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬ۖ") + i12) * 31;
                        i = ((iM45029 ^ i11) * 21007) ^ (-252111106);
                        i2 = 1651354033;
                    } else {
                        iM45029 = C19806.m45029("ۨۢ") ^ i11;
                        i = ((iM45029 ^ i12) * 6173) ^ (-7257081);
                        i2 = -745616149;
                    }
                    int i119 = iM11306;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM11306 = i119;
                    break;
                case 752110761:
                case 1547366908:
                    iM11306 = iM11306;
                    s = sArr[c];
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = iM11306;
                        iM45029 = ThreadFactoryC3888.m11306("ܳ֡") ^ i11;
                        iM11306 = iM11306;
                        i = ((iM45029 ^ i12) * 22715) ^ 1653874950;
                        i2 = 649671514;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ᩻") ^ i12;
                        i = ((iM45029 ^ i11) * (-29269)) ^ 1565342768;
                        i2 = 211935088;
                    }
                    int i1110 = iM11306;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM11306 = i1110;
                    break;
                case 1794126341:
                case 2001259319:
                    iM11306 = iM11306;
                    sArr = f3632;
                    if (C0671.f2816 != 0) {
                        iM45029 = C19806.m45029("ۜۤ") ^ i12;
                        i = ((iM45029 ^ i11) * 2839) ^ (-1610540672);
                        i2 = 2117398802;
                    } else {
                        iM45029 = C19806.m45029("֡᩵") ^ i12;
                        i = ((iM45029 ^ i11) * 1499) ^ (-1980061480);
                        i2 = -285008134;
                    }
                    int i1111 = iM11306;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM11306 = i1111;
                    break;
                default:
                    iM11306 = iM11306;
                    c = 423;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = C19806.m45029("ۜۤ") ^ i12;
                        i = ((iM45029 ^ i11) * 2839) ^ (-1610540672);
                        i2 = 2117398802;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩺۬") ^ i11;
                        i = ((iM45029 ^ i12) * 17131) ^ 1992458847;
                        i2 = 269702061;
                    }
                    int i1112 = iM11306;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM11306 = i1112;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3610(C0906 c0906, C6094 c6094) {
        MenuItem menuItem = null;
        int i = -177677710;
        int i2 = C1025.f4800;
        int i3 = C1398.f5802;
        int iM11306 = ThreadFactoryC3888.m11306("ۨۡ") ^ i2;
        int i4 = ((iM11306 ^ i3) * 10197) ^ (-1489011503);
        int i5 = 268803619;
        while (true) {
            i = ((((i ^ i3) * 11497) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1979200787:
                case 2097687994:
                    c0906.f3635 = c6094;
                    menuItem = c0906.f3637;
                    if (menuItem != null) {
                        iM11306 = ThreadFactoryC3888.m11306("᩹۬") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-14675)) ^ (-421018347);
                        i5 = -226110299;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-17299)) ^ (-1749560488);
                        i5 = 2095450680;
                    }
                    break;
                case -1963834439:
                case 208099609:
                    if (C0797.m3359()) {
                        iM11306 = C19806.m45029("۬ۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20367)) ^ (-1578735988);
                        i5 = -479018218;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۜ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22923)) ^ 2034630369;
                        i5 = -389776219;
                    }
                    break;
                case -1613947123:
                case -1403735959:
                    break;
                case -1559087099:
                case -932762748:
                    if (C1377.m4833() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 4951) ^ (-1384108774);
                        i5 = -916892298;
                    } else {
                        iM11306 = C19806.m45029("᩵۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-29263)) ^ (-293912507);
                        i5 = 452210986;
                    }
                    break;
                case -1376196062:
                case -901316878:
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = (C19806.m45029("ۢۖ") ^ i2) * (-35);
                        i4 = ((iM11306 ^ i3) * (-29059)) ^ (-128652031);
                        i5 = -832262442;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 15835) ^ (-1196223620);
                        i5 = 1444815492;
                    }
                    break;
                case -1318326315:
                case -1215455601:
                    if (C0629.f2722 <= 0) {
                        iM11306 = (C19806.m45029("ۢۖ") ^ i2) * (-35);
                        i4 = ((iM11306 ^ i3) * (-29059)) ^ (-128652031);
                        i5 = -832262442;
                    } else {
                        iM11306 = C19806.m45029("ۘ֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * 15537) ^ (-692454051);
                        i5 = -188228685;
                    }
                    break;
                case -1254368730:
                case -1032927586:
                    if (C2332.f8260) {
                        iM11306 = C19806.m45029("ۧ᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-24705)) ^ (-1119474435);
                        i5 = 675742682;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴ᩹") + i2) * 101;
                        i4 = ((iM11306 ^ i3) * (-14805)) ^ (-677648929);
                        i5 = 1766781851;
                    }
                    break;
                case -1180447879:
                case -350514574:
                    if (C2249.f8050 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۜ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22923)) ^ 2034630369;
                        i5 = -389776219;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܺܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 4951) ^ (-1384108774);
                        i5 = -916892298;
                    }
                    break;
                case -1061898731:
                case 127761443:
                    if (C3743.f13569) {
                        iM11306 = (C19806.m45029("֨۫") ^ i3) * 63;
                        i4 = ((iM11306 ^ i2) * 30037) ^ 1761718539;
                        i5 = 768013645;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܺܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 4951) ^ (-1384108774);
                        i5 = -916892298;
                    }
                    break;
                case -1009675750:
                case -366945845:
                    RunnableC1564.m5345();
                    if (CallableC1627.m5507() == 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴ᩹") + i2) * 101;
                        i4 = ((iM11306 ^ i3) * (-14805)) ^ (-677648929);
                        i5 = 1766781851;
                    } else {
                        iM11306 = (C19806.m45029("ۢ۫") ^ i3) * (-109);
                        i4 = ((iM11306 ^ i2) * (-1379)) ^ 2104448307;
                        i5 = 1375511201;
                    }
                    break;
                case -858962705:
                case -461582001:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩴ᩹") + i2) * 101;
                        i4 = ((iM11306 ^ i3) * (-14805)) ^ (-677648929);
                        i5 = 1766781851;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡܽ") + i3) * 93;
                        i4 = ((iM11306 ^ i2) * (-25631)) ^ (-1213650293);
                        i5 = -661333249;
                    }
                    break;
                case -644621621:
                case 1053817619:
                    C2124.m6680(menuItem, c6094.m16556());
                    iM11306 = ThreadFactoryC3888.m11306("᩵ᩳ") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-17299)) ^ (-1749560488);
                    i5 = 2095450680;
                    break;
                case -630166620:
                case -118093958:
                    if (C1148.f5161 <= 0) {
                        iM11306 = (C19806.m45029("ۢ۫") ^ i3) * (-109);
                        i4 = ((iM11306 ^ i2) * (-1379)) ^ 2104448307;
                        i5 = 1375511201;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܶ᩷") + i2) * 109;
                        i4 = ((iM11306 ^ i3) * 6001) ^ 1281684413;
                        i5 = 944996319;
                    }
                    break;
                case -415300631:
                case -162013955:
                    C2704.m8255();
                    C3535.m10431();
                    break;
                case 130805085:
                case 434652921:
                    C1668.m5583();
                    C1937.m6279();
                    iM11306 = (C19806.m45029("ۢ۫") ^ i3) * (-109);
                    i4 = ((iM11306 ^ i2) * (-1379)) ^ 2104448307;
                    i5 = 1375511201;
                    break;
                case 585905939:
                case 1053647807:
                    if (!C0797.f3386) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 4951) ^ (-1384108774);
                        i5 = -916892298;
                    } else {
                        iM11306 = (C19806.m45029("ۢ۫") ^ i3) * (-109);
                        i4 = ((iM11306 ^ i2) * (-1379)) ^ 2104448307;
                        i5 = 1375511201;
                    }
                    break;
                case 2074817659:
                case 2140172042:
                    if (C1148.f5161 <= 0) {
                        iM11306 = (C19806.m45029("ۢۖ") ^ i2) * (-35);
                        i4 = ((iM11306 ^ i3) * (-29059)) ^ (-128652031);
                        i5 = -832262442;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩹۠") ^ i2;
                        i4 = ((iM11306 ^ i3) * 9873) ^ (-3226587);
                        i5 = 1514179825;
                    }
                    break;
                default:
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۜ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22923)) ^ 2034630369;
                        i5 = -389776219;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠᩸") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-30047)) ^ (-471080878);
                        i5 = -377807621;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0906() {
        short[] sArr = null;
        int i = 0;
        int i2 = -2056075680;
        int i3 = C1148.f5161;
        int i4 = C1875.f7103;
        short s = f3632[0];
        int i5 = s + 16939;
        int i6 = (s * s) + 286929721;
        int i7 = (i6 + i6) - (i5 * i5) >= 0 ? 12988 : 197;
        super(ThreadFactoryC3888.m11306(C1148.m4230(f3632, 1, 3, i7)) ^ 2102166111);
        int iM45029 = C19806.m45029("֫ۚ") ^ i4;
        int i8 = ((iM45029 ^ i3) * (-2525)) ^ (-701889221);
        int i9 = -1525268616;
        while (true) {
            i2 = ((((i2 ^ i3) * (-13805)) >> 31) & i8) ^ (iM45029 ^ i9);
            switch (i2) {
                case -2034932580:
                case 1222935305:
                    sArr = f3632;
                    if (CallableC1627.f6528) {
                        iM45029 = C19806.m45029("᩻ۘ") ^ i4;
                        i8 = ((iM45029 ^ i3) * 4075) ^ (-535009310);
                        i9 = -10064274;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳ۫") + i3) * 19;
                        i8 = ((iM45029 ^ i4) * 13937) ^ 2104530869;
                        i9 = 325069312;
                    }
                    break;
                case -1967974739:
                case 1492883879:
                    if (C1025.f4800 >= 0) {
                        iM45029 = (i4 - C19806.m45029("֫ۛ")) * (-39);
                        i8 = ((iM45029 ^ i3) * 10715) ^ (-154059338);
                        i9 = -969789813;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ֨") ^ i3;
                        i8 = ((iM45029 ^ i4) * 28471) ^ 1170567465;
                        i9 = -1123763561;
                    }
                    break;
                case -1822548542:
                case 893458966:
                    if (C1419.f5860 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜ᩶") + i3) * 47;
                        i8 = ((iM45029 ^ i4) * 19289) ^ (-2069922953);
                        i9 = 1775614743;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶ֡") ^ i4;
                        i8 = ((iM45029 ^ i3) * 375) ^ 1161358466;
                        i9 = -1546291825;
                    }
                    break;
                case -1472344178:
                case 1311218266:
                    setHasOptionsMenu(true);
                    if (C0050.f912 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳ۫") + i3) * 19;
                        i8 = ((iM45029 ^ i4) * 13937) ^ 2104530869;
                        i9 = 325069312;
                    } else {
                        iM45029 = (i4 - C19806.m45029("֨᩶")) * 69;
                        i8 = ((iM45029 ^ i3) * 27049) ^ (-1440830313);
                        i9 = 1745913556;
                    }
                    break;
                case -1028178562:
                case 19208907:
                    if (C2249.f8050 >= 0) {
                        iM45029 = C19806.m45029("ܰ᩻") ^ i4;
                        i8 = ((iM45029 ^ i3) * 14187) ^ (-1074429580);
                        i9 = -1086088152;
                    } else {
                        iM45029 = (i4 - C19806.m45029("᩹᩻")) * 75;
                        i8 = ((iM45029 ^ i3) * 8701) ^ 152459053;
                        i9 = -31137091;
                    }
                    break;
                case -864795695:
                case 1416787662:
                    C2477.m7593();
                    if (!C0962.f3784) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳ۫") + i3) * 19;
                        i8 = ((iM45029 ^ i4) * 13937) ^ 2104530869;
                        i9 = 325069312;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜ᩶") + i3) * 47;
                        i8 = ((iM45029 ^ i4) * 19289) ^ (-2069922953);
                        i9 = 1775614743;
                    }
                    break;
                case -510111970:
                case -436482815:
                    if (C3535.f13026 <= 0) {
                        iM45029 = (i4 - C19806.m45029("֫ۛ")) * (-39);
                        i8 = ((iM45029 ^ i3) * 10715) ^ (-154059338);
                        i9 = -969789813;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜ᩶") + i3) * 47;
                        i8 = ((iM45029 ^ i4) * 19289) ^ (-2069922953);
                        i9 = 1775614743;
                    }
                    break;
                case -309068258:
                case -3899090:
                    RunnableC1564.m5345();
                    C3535.m10431();
                    iM45029 = (ThreadFactoryC3888.m11306("ۜ᩶") + i3) * 47;
                    i8 = ((iM45029 ^ i4) * 19289) ^ (-2069922953);
                    i9 = 1775614743;
                    break;
                case -255684011:
                case 703674574:
                    if (C1977.f7413 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜ᩶") + i3) * 47;
                        i8 = ((iM45029 ^ i4) * 19289) ^ (-2069922953);
                        i9 = 1775614743;
                    } else {
                        iM45029 = (C19806.m45029("᩹֨") + i3) * (-45);
                        i8 = ((iM45029 ^ i4) * (-8219)) ^ (-1802775807);
                        i9 = -736319707;
                    }
                    break;
                case 79740752:
                case 951675335:
                    m50133(C7105.m18989(sArr, i, 34, i7));
                    return;
                case 202600399:
                case 1743721732:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = (i4 - C19806.m45029("֫ۛ")) * (-39);
                        i8 = ((iM45029 ^ i3) * 10715) ^ (-154059338);
                        i9 = -969789813;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙۢ") + i3) * q.h;
                        i8 = ((iM45029 ^ i4) * 3351) ^ (-1555187084);
                        i9 = 1696529671;
                    }
                    break;
                case 341067390:
                case 478733089:
                    i = 4;
                    if (C0278.f1572 <= 0) {
                        iM45029 = C19806.m45029("ܰ᩻") ^ i4;
                        i8 = ((iM45029 ^ i3) * 14187) ^ (-1074429580);
                        i9 = -1086088152;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴܿ") ^ i3;
                        i8 = ((iM45029 ^ i4) * (-9193)) ^ 525633920;
                        i9 = 1191776107;
                    }
                    break;
                case 407664132:
                case 1920024271:
                    if (C1977.f7413 <= 0) {
                        iM45029 = (i4 - C19806.m45029("֫ۛ")) * (-39);
                        i8 = ((iM45029 ^ i3) * 10715) ^ (-154059338);
                        i9 = -969789813;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۟۟") + i3) * 87;
                        i8 = ((iM45029 ^ i4) * (-7591)) ^ (-146595080);
                        i9 = -178143389;
                    }
                    break;
                case 466589752:
                case 2020151421:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    throw new RuntimeException();
                case 509494808:
                case 1777171501:
                    if (C0962.m3746() >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ܳ") ^ i4;
                        i8 = ((iM45029 ^ i3) * 23787) ^ (-745870503);
                        i9 = 178938027;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۜ᩶") + i3) * 47;
                        i8 = ((iM45029 ^ i4) * 19289) ^ (-2069922953);
                        i9 = 1775614743;
                    }
                    break;
                default:
                    if (C10634.f36300 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ܳ") ^ i4;
                        i8 = ((iM45029 ^ i3) * 23787) ^ (-745870503);
                        i9 = 178938027;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("᩵ۗ")) * (-27);
                        i8 = ((iM45029 ^ i3) * (-1513)) ^ (-2033531925);
                        i9 = 467344697;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x012e A[PHI: r11 r15
      0x012e: PHI (r11v7 int) = (r11v4 int), (r11v2 int) binds: [B:35:0x012c, B:9:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x012e: PHI (r15v6 short[]) = (r15v3 short[]), (r15v2 short[]) binds: [B:35:0x012c, B:9:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x016d A[PHI: r4 r5 r6
      0x016d: PHI (r4v4 l.ᩳ᩻ۘ) = (r4v2 l.ᩳ᩻ۘ), (r4v3 l.ᩳ᩻ۘ), (r4v2 l.ᩳ᩻ۘ), (r4v2 l.ᩳ᩻ۘ) binds: [B:39:0x016b, B:30:0x00ea, B:15:0x0076, B:12:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r5v4 l.֨᩺ۙ) = (r5v2 l.֨᩺ۙ), (r5v3 l.֨᩺ۙ), (r5v2 l.֨᩺ۙ), (r5v2 l.֨᩺ۙ) binds: [B:39:0x016b, B:30:0x00ea, B:15:0x0076, B:12:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r6v4 l.᩵ۢܰ) = (r6v2 l.᩵ۢܰ), (r6v3 l.᩵ۢܰ), (r6v2 l.᩵ۢܰ), (r6v2 l.᩵ۢܰ) binds: [B:39:0x016b, B:30:0x00ea, B:15:0x0076, B:12:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x01a7 A[PHI: r3 r7
      0x01a7: PHI (r3v6 int) = (r3v4 int), (r3v2 int), (r3v2 int), (r3v2 int), (r3v2 int) binds: [B:43:0x01a5, B:27:0x00d6, B:23:0x00a7, B:17:0x007a, B:15:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x01a7: PHI (r7v5 l.ᩳ᩻ۘ) = (r7v2 l.ᩳ᩻ۘ), (r7v2 l.ᩳ᩻ۘ), (r7v4 l.ᩳ᩻ۘ), (r7v2 l.ᩳ᩻ۘ), (r7v2 l.ᩳ᩻ۘ) binds: [B:43:0x01a5, B:27:0x00d6, B:23:0x00a7, B:17:0x007a, B:15:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x01de A[PHI: r8
      0x01de: PHI (r8v5 java.lang.String) = (r8v4 java.lang.String), (r8v2 java.lang.String), (r8v2 java.lang.String) binds: [B:47:0x01dc, B:12:0x006d, B:9:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.ComponentCallbacksC22654
    public final void onViewCreated(View view, Bundle bundle) {
        int iM45029;
        int i;
        int i2;
        short[] sArr;
        int iM11306;
        int i3;
        final C0906 c0906 = this;
        int i4 = 1393754090;
        int i5 = C1461.f5957;
        int i6 = C7105.f23796;
        int iM450210 = (C19806.m45029("۫ۤ") ^ i6) * 65;
        int i7 = ((iM450210 ^ i5) * (-1083)) ^ (-1225606332);
        int i8 = iM450210 ^ 73167771;
        String strM10790 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int iM11307 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        short s = 0;
        C18377 c18377 = null;
        C19383 c19383 = null;
        InterfaceC1423 viewLifecycleOwner = null;
        C18377 c18378 = null;
        int iM11308 = 0;
        while (true) {
            i4 = i8 ^ (i7 & (((i4 ^ i5) * 2751) >> 31));
            switch (i4) {
                case -2112230730:
                case 1972905853:
                    C2332.m7079();
                    break;
                case -2101102808:
                case -1315507183:
                    C19383 c19384 = (C19383) C2642.m8167(view, iM11308);
                    c0906.f3638 = c19384;
                    c19384.m44420(c0906.f3636);
                    if (C0817.f3443) {
                        iM45029 = C19806.m45029("ܰۡ") ^ i6;
                        i = ((iM45029 ^ i5) * 19471) ^ 309576226;
                        i2 = -505065013;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ᩳ") + i6) * 29;
                        i = ((iM45029 ^ i5) * 3251) ^ 1212712119;
                        i2 = -1541124354;
                    }
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
                case -2071191324:
                case -1808918636:
                    i12 = 37800;
                    iM45029 = C19806.m45029("ᩴܰ") ^ i6;
                    i = ((iM45029 ^ i5) * 1507) ^ (-748377532);
                    i2 = 295252906;
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
                case -1962408391:
                case -1459982654:
                    if (C2249.f8050 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ᩳ") + i6) * 29;
                        i = ((iM45029 ^ i5) * 3251) ^ 1212712119;
                        i2 = -1541124354;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨۙ") ^ i5;
                        i = ((iM45029 ^ i6) * 32729) ^ 817246064;
                        i2 = -249736399;
                    }
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
                case -1960291603:
                case -604086855:
                    strM10790 = C3660.m10790(f3632, 394, 3, i12);
                    if (C2871.f10837 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۨۙ") ^ i5;
                        i = ((iM45029 ^ i6) * 32729) ^ 817246064;
                        i2 = -249736399;
                    } else {
                        iM45029 = (i5 - C19806.m45029("ۜ֨")) * (-21);
                        i = ((iM45029 ^ i6) * 8667) ^ 591114661;
                        i2 = -355788606;
                    }
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
                case -1862917772:
                case 1383025034:
                    C3286.m9779(c19383);
                    c18378.m42646(viewLifecycleOwner, new C3145(2, c19383));
                    c18377 = c0906.f3634;
                    if (C1461.f5957 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖܿ") ^ i5;
                        i = ((iM45029 ^ i6) * (-101)) ^ (-1831480788);
                        i2 = 771604983;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ܶ") ^ i6) * (-47);
                        i = ((iM45029 ^ i5) * 17851) ^ 1073453309;
                        i2 = 357403708;
                    }
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
                case -1834973354:
                case 159657353:
                    C1398.m4895();
                    if (RunnableC1564.m5345()) {
                        iM45029 = (C19806.m45029("ᩳ᩸") + i6) * 77;
                        i = ((iM45029 ^ i5) * 6813) ^ 785369872;
                        i2 = 1780757949;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨۙ") ^ i5;
                        i = ((iM45029 ^ i6) * 32729) ^ 817246064;
                        i2 = -249736399;
                    }
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
                case -1517331476:
                case -600260050:
                    int i13 = 1610361 + i11;
                    short s2 = s;
                    int i14 = s2 + 1269;
                    if ((i14 * i14) - (i13 + i13) > 0) {
                        iM11306 = (i6 - C19806.m45029("ᩳۨ")) * 19;
                        i7 = ((iM11306 ^ i5) * 29991) ^ (-1317200169);
                        i3 = 464957458;
                    } else {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۧۖ")) * (-105);
                        i7 = ((iM11306 ^ i6) * 2947) ^ 1475465625;
                        i3 = 978872808;
                    }
                    i8 = iM11306 ^ i3;
                    c0906 = this;
                    s = s2;
                    break;
                case -1451707805:
                case 36871654:
                    C1461.m5080();
                    if (C1398.f5802 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖܿ") ^ i5;
                        i = ((iM45029 ^ i6) * (-101)) ^ (-1831480788);
                        i2 = 771604983;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ᩳ") + i6) * 29;
                        i = ((iM45029 ^ i5) * 3251) ^ 1212712119;
                        i2 = -1541124354;
                    }
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
                case -1036535475:
                case 348138198:
                    C1937.m6282(c18377.m42644(), getViewLifecycleOwner(), new InterfaceC10597() { // from class: l.ۢۖۜ
                        @Override // l.InterfaceC10597
                        /* JADX INFO: renamed from: ۙ */
                        public final void mo1473(Object obj) {
                            C0906.m3608(this.f31565, (String) obj);
                        }
                    });
                    break;
                case -275563850:
                case -149602340:
                    TabLayout tabLayout = (TabLayout) C3743.m10957(view, iM11307 ^ i9);
                    tabLayout.setupWithViewPager(c0906.f3638);
                    if (C1398.m4895() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖܿ") ^ i5;
                        i = ((iM45029 ^ i6) * (-101)) ^ (-1831480788);
                        i2 = 771604983;
                    } else {
                        tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C2317(c0906));
                        c18378 = c0906.f3634;
                        viewLifecycleOwner = getViewLifecycleOwner();
                        c19383 = c0906.f3638;
                        if (C0629.f2722 <= 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("۟ᩳ") + i6) * 29;
                            i = ((iM45029 ^ i5) * 3251) ^ 1212712119;
                            i2 = -1541124354;
                        } else {
                            iM45029 = C19806.m45029("ۛۖ") ^ i5;
                            i = ((iM45029 ^ i6) * (-29313)) ^ 1771555415;
                            i2 = -929839220;
                        }
                    }
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
                case 181471490:
                case 1230801033:
                    C1419.m4973();
                    C2124.m6673();
                    iM45029 = ThreadFactoryC3888.m11306("ۖܿ") ^ i5;
                    i = ((iM45029 ^ i6) * (-101)) ^ (-1831480788);
                    i2 = 771604983;
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
                case 511853756:
                case 933743504:
                    i12 = 61783;
                    iM45029 = C19806.m45029("ᩴܰ") ^ i6;
                    i = ((iM45029 ^ i5) * 1507) ^ (-748377532);
                    i2 = 295252906;
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
                case 729932117:
                case 1039614436:
                    c0906.f3638.m44422(new C11491(c0906));
                    sArr3 = f3632;
                    i10 = 397;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = (C19806.m45029("ᩳ᩸") + i6) * 77;
                        i = ((iM45029 ^ i5) * 6813) ^ 785369872;
                        i2 = 1780757949;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۬ܿ") ^ i5;
                        i = ((iM45029 ^ i6) * (-3169)) ^ 822948372;
                        i2 = 21324073;
                    }
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
                case 774366358:
                case 2101532490:
                    s = sArr2[393];
                    i11 = s * s;
                    if (C0216.f1393 != 0) {
                        sArr = sArr2;
                        int iM450211 = C19806.m45029("᩹֨") ^ i6;
                        i8 = iM450211 ^ 1489496118;
                        sArr2 = sArr;
                        i7 = ((iM450211 ^ i5) * (-26447)) ^ (-1697076724);
                    } else {
                        int iM450212 = C19806.m45029("۫ۜ") ^ i5;
                        i7 = ((iM450212 ^ i6) * 32555) ^ 641054429;
                        i8 = iM450212 ^ (-34948322);
                    }
                    c0906 = this;
                    break;
                case 1236514236:
                case 1426637087:
                    iM11308 = 2119936330 ^ ThreadFactoryC3888.m11306(strM10790);
                    if (C2332.f8260) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۛ") ^ i5;
                        i = ((iM45029 ^ i6) * (-8703)) ^ 1883594578;
                        i2 = -626675604;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖܿ") ^ i5;
                        i = ((iM45029 ^ i6) * (-101)) ^ (-1831480788);
                        i2 = 771604983;
                    }
                    i8 = iM45029 ^ i2;
                    i7 = i;
                    break;
                case 1742394989:
                case 1963130176:
                    short s3 = s;
                    sArr = f3632;
                    if (C1189.f5284 <= 0) {
                        s = s3;
                        int iM450213 = C19806.m45029("᩹֨") ^ i6;
                        i8 = iM450213 ^ 1489496118;
                        sArr2 = sArr;
                        i7 = ((iM450213 ^ i5) * (-26447)) ^ (-1697076724);
                    } else {
                        int iM450214 = (i6 - C19806.m45029("᩵ܶ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        sArr2 = sArr;
                        i8 = iM450214 ^ (-626531052);
                        i7 = ((iM450214 ^ i5) * (-1013)) ^ (-1457158141);
                        s = s3;
                    }
                    c0906 = this;
                    break;
                default:
                    iM11307 = ThreadFactoryC3888.m11306(MenuItemOnMenuItemClickListenerC3244.m9715(sArr3, i10, 3, i12));
                    i9 = 2122951113;
                    if (C1025.f4800 < 0) {
                        iM45029 = (i6 - C19806.m45029("ۚ۫")) * 5;
                        i = ((iM45029 ^ i5) * (-15567)) ^ 1706650767;
                        i2 = 82075274;
                        i8 = iM45029 ^ i2;
                        i7 = i;
                    } else {
                        sArr = sArr2;
                        int iM450215 = C19806.m45029("᩹֨") ^ i6;
                        i8 = iM450215 ^ 1489496118;
                        sArr2 = sArr;
                        i7 = ((iM450215 ^ i5) * (-26447)) ^ (-1697076724);
                        c0906 = this;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0071  */
    /* JADX WARN: Code duplicated, block: B:59:0x020a A[PHI: r2 r7 r8 r16
      0x020a: PHI (r2v3 int) = (r2v2 int), (r2v2 int), (r2v5 int) binds: [B:58:0x0208, B:54:0x01e8, B:23:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:58:0x0208, B:54:0x01e8, B:23:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:58:0x0208, B:54:0x01e8, B:23:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x020a: PHI (r16v14 int) = (r16v5 int), (r16v6 int), (r16v15 int) binds: [B:58:0x0208, B:54:0x01e8, B:23:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0241 A[PHI: r3 r6 r16
      0x0241: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v3 java.lang.String), (r3v2 java.lang.String) binds: [B:62:0x023f, B:27:0x00d0, B:9:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0241: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:62:0x023f, B:27:0x00d0, B:9:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0241: PHI (r16v24 int) = (r16v4 int), (r16v13 int), (r16v25 int) binds: [B:62:0x023f, B:27:0x00d0, B:9:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0275 A[PHI: r1 r5 r9 r11 r12 r16
      0x0275: PHI (r1v4 l.᩵֨ۙ) = (r1v2 l.᩵֨ۙ), (r1v2 l.᩵֨ۙ), (r1v3 l.᩵֨ۙ), (r1v2 l.᩵֨ۙ), (r1v2 l.᩵֨ۙ), (r1v2 l.᩵֨ۙ) binds: [B:66:0x0273, B:50:0x01c4, B:35:0x0117, B:31:0x00ef, B:18:0x0088, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r5v4 char) = (r5v3 char), (r5v2 char), (r5v2 char), (r5v2 char), (r5v2 char), (r5v2 char) binds: [B:66:0x0273, B:50:0x01c4, B:35:0x0117, B:31:0x00ef, B:18:0x0088, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:66:0x0273, B:50:0x01c4, B:35:0x0117, B:31:0x00ef, B:18:0x0088, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r11v4 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:66:0x0273, B:50:0x01c4, B:35:0x0117, B:31:0x00ef, B:18:0x0088, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:66:0x0273, B:50:0x01c4, B:35:0x0117, B:31:0x00ef, B:18:0x0088, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r16v20 int) = (r16v3 int), (r16v7 int), (r16v11 int), (r16v12 int), (r16v18 int), (r16v21 int) binds: [B:66:0x0273, B:50:0x01c4, B:35:0x0117, B:31:0x00ef, B:18:0x0088, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC22611, l.ComponentCallbacksC22654
    public final void onResume() {
        int iM11306;
        int i;
        int i2;
        int i3 = C0278.f1572;
        int i4 = C3535.f13026;
        int iM11307 = (ThreadFactoryC3888.m11306("۬᩸") ^ i4) * (-49);
        int i5 = ((iM11307 ^ i3) * (-6365)) ^ (-1330217629);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM11307 ^ (-499801468);
        ActivityC19126 activityC19126M5049 = null;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1381901357;
        String strM8640 = null;
        int iM45029 = 0;
        while (true) {
            int i12 = i6 ^ (i5 & (((i11 ^ i3) * (-2765)) >> 31));
            switch (i12) {
                case -2146398905:
                case -212342412:
                    i12 = i12;
                    c = 389;
                    if (C0962.f3784) {
                        iM11306 = (C19806.m45029("ܳ᩶") + i4) * (-77);
                        i = ((iM11306 ^ i3) * 2675) ^ 549558440;
                        i2 = 279974245;
                    } else {
                        iM11306 = C19806.m45029("۬֫") ^ i3;
                        i = ((iM11306 ^ i4) * (-2979)) ^ 1751858361;
                        i2 = -2046201561;
                    }
                    int i13 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i11 = i13;
                    break;
                case -2087539409:
                case 1572492405:
                    i12 = i12;
                    i10 = 390;
                    if (C0526.f2219) {
                        iM11306 = (C19806.m45029("ܳ᩶") + i4) * (-77);
                        i = ((iM11306 ^ i3) * 2675) ^ 549558440;
                        i2 = 279974245;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܰ᩷")) * (-31);
                        i = ((iM11306 ^ i3) * 6237) ^ 947472029;
                        i2 = -42245758;
                    }
                    int i14 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i11 = i14;
                    break;
                case -2074689116:
                case -1634892198:
                    i12 = i12;
                    strM8640 = C2871.m8640(sArr2, i10, 3, i9);
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM11306 = C19806.m45029("ܰ᩶") ^ i3;
                        i = ((iM11306 ^ i4) * 28711) ^ 1940043107;
                        i2 = 2100585496;
                    } else {
                        iM11306 = C19806.m45029("֫᩸") ^ i3;
                        i = ((iM11306 ^ i4) * 16179) ^ (-507594709);
                        i2 = 1017995087;
                    }
                    int i15 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i11 = i15;
                    break;
                case -2024981256:
                case 1101579237:
                    i12 = i12;
                    super.onResume();
                    if (isHidden()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡۘ") + i4) * 29;
                        i = ((iM11306 ^ i3) * (-22149)) ^ 1201174288;
                        i2 = 1798167444;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧۘ") ^ i3;
                        i = ((iM11306 ^ i4) * (-17265)) ^ (-2137271172);
                        i2 = 1707542688;
                    }
                    int i16 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i11 = i16;
                    break;
                case -1871524823:
                case -1760806962:
                    i9 = 38264;
                    iM11306 = ThreadFactoryC3888.m11306("᩶᩺") ^ i3;
                    i = ((iM11306 ^ i4) * 1949) ^ 583015249;
                    i2 = 1557958214;
                    int i17 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i11 = i17;
                    break;
                case -1750193960:
                case 972211651:
                    AbstractC0464.m2313();
                    C0797.m3359();
                    break;
                case -1740933080:
                case 1615044153:
                    RunnableC1895.m6170();
                    if (!ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        i12 = i12;
                        iM11306 = (ThreadFactoryC3888.m11306("ܺۡ") ^ i4) * (-41);
                        i = ((iM11306 ^ i3) * (-30781)) ^ (-1403600035);
                        i2 = -49072714;
                        int i18 = i12;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                        i11 = i18;
                    }
                    i12 = i12;
                    iM11306 = (C19806.m45029("ܳ᩶") + i4) * (-77);
                    i = ((iM11306 ^ i3) * 2675) ^ 549558440;
                    i2 = 279974245;
                    int i19 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i11 = i19;
                    break;
                case -1686196609:
                case -510415347:
                    i12 = i12;
                    s = sArr[c];
                    if (C10634.f36300 >= 0) {
                        iM11306 = C19806.m45029("ܰ᩶") ^ i3;
                        i = ((iM11306 ^ i4) * 28711) ^ 1940043107;
                        i2 = 2100585496;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ᩳۧ")) * 97;
                        i = ((iM11306 ^ i4) * 22647) ^ (-118058690);
                        i2 = -900924539;
                    }
                    int i110 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i11 = i110;
                    break;
                case -1219336822:
                case 906295481:
                    break;
                case -985763500:
                case 1204624857:
                    i12 = i12;
                    sArr = f3632;
                    if (C1377.f5749) {
                        iM11306 = ThreadFactoryC3888.m11306("ۤۚ") ^ i4;
                        i = ((iM11306 ^ i3) * 24201) ^ 467714637;
                        i2 = -537891538;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺۡ") ^ i4) * (-41);
                        i = ((iM11306 ^ i3) * (-30781)) ^ (-1403600035);
                        i2 = -49072714;
                    }
                    int i111 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i11 = i111;
                    break;
                case -979306012:
                case 656798492:
                    i12 = i12;
                    int i20 = s + s2;
                    if (i8 - (i20 * i20) <= 0) {
                        iM11306 = (C19806.m45029("ᩴ֨") ^ i3) * (-55);
                        i = ((iM11306 ^ i4) * 4159) ^ 2088957867;
                        i2 = 990604133;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘܿ") ^ i4) * 59;
                        i = ((iM11306 ^ i3) * (-27959)) ^ 7454083;
                        i2 = -346029862;
                    }
                    int i112 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i11 = i112;
                    break;
                case -943494290:
                case 1508891646:
                    C0216.m1591();
                    if (C2124.m6673() <= 0) {
                        i12 = i12;
                        iM11306 = (C19806.m45029("ܳ᩶") + i4) * (-77);
                        i = ((iM11306 ^ i3) * 2675) ^ 549558440;
                        i2 = 279974245;
                    } else {
                        iM11306 = C19806.m45029("᩸᩸") ^ i3;
                        i12 = i12;
                        i = ((iM11306 ^ i4) * (-2897)) ^ (-862281060);
                        i2 = 891814963;
                    }
                    int i113 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i11 = i113;
                    break;
                case -493747146:
                case 454328828:
                    i12 = i12;
                    i7 = s * 2;
                    if (C2124.f7782 <= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("֨ۘ")) * 63;
                        i = ((iM11306 ^ i3) * (-24419)) ^ 1117141437;
                        i2 = -707237257;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘۚ") ^ i4) * (-113);
                        i = ((iM11306 ^ i3) * 26999) ^ 982552425;
                        i2 = -2097960004;
                    }
                    int i114 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i11 = i114;
                    break;
                case 53017834:
                case 793401231:
                    i12 = i12;
                    i8 = i7 + 1;
                    if (C1066.m4023() <= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("֨ۘ")) * 63;
                        i = ((iM11306 ^ i3) * (-24419)) ^ 1117141437;
                        i2 = -707237257;
                    } else {
                        iM11306 = (C19806.m45029("ܽ᩸") ^ i3) * (-83);
                        i = ((iM11306 ^ i4) * 30833) ^ (-1622654637);
                        i2 = 778930752;
                    }
                    int i115 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i11 = i115;
                    break;
                case 567973381:
                case 1774314689:
                    i12 = i12;
                    iM45029 = 2100312996 ^ C19806.m45029(strM8640);
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("֨ۘ")) * 63;
                        i = ((iM11306 ^ i3) * (-24419)) ^ 1117141437;
                        i2 = -707237257;
                    } else {
                        iM11306 = C19806.m45029("ܺ۬") ^ i3;
                        i = ((iM11306 ^ i4) * 32757) ^ 881407928;
                        i2 = 1308920395;
                    }
                    int i116 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i11 = i116;
                    break;
                case 578044941:
                case 2024855318:
                    i12 = i12;
                    activityC19126M5049 = C1460.m5049(this);
                    sArr2 = f3632;
                    if (C2124.m6673() <= 0) {
                        iM11306 = (C19806.m45029("ܳ᩶") + i4) * (-77);
                        i = ((iM11306 ^ i3) * 2675) ^ 549558440;
                        i2 = 279974245;
                    } else {
                        iM11306 = (C19806.m45029("᩵۫") + i4) * 3;
                        i = ((iM11306 ^ i3) * 16343) ^ 979401490;
                        i2 = 1108357610;
                    }
                    int i117 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i11 = i117;
                    break;
                case 677136468:
                case 1794484416:
                    i12 = i12;
                    C19806.m45024();
                    iM11306 = (C19806.m45029("ܳ᩶") + i4) * (-77);
                    i = ((iM11306 ^ i3) * 2675) ^ 549558440;
                    i2 = 279974245;
                    int i118 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i11 = i118;
                    break;
                case 842967941:
                case 1306107814:
                    if (C0278.f1572 > 0) {
                        iM11306 = C19806.m45029("᩸᩸") ^ i3;
                        i12 = i12;
                        i = ((iM11306 ^ i4) * (-2897)) ^ (-862281060);
                        i2 = 891814963;
                    } else {
                        i12 = i12;
                        iM11306 = C19806.m45029("ܰ᩶") ^ i3;
                        i = ((iM11306 ^ i4) * 28711) ^ 1940043107;
                        i2 = 2100585496;
                    }
                    int i119 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i11 = i119;
                    break;
                case 1357260668:
                case 1551336012:
                    i12 = i12;
                    s2 = 1;
                    if (C3722.f13525 <= 0) {
                        iM11306 = (C19806.m45029("ܳ᩶") + i4) * (-77);
                        i = ((iM11306 ^ i3) * 2675) ^ 549558440;
                        i2 = 279974245;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("֨ۨ")) * (-53);
                        i = ((iM11306 ^ i3) * (-19295)) ^ (-1128151030);
                        i2 = 27048905;
                    }
                    int i1110 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i11 = i1110;
                    break;
                case 1400074206:
                case 2009399156:
                    i12 = i12;
                    activityC19126M5049.setTitle(iM45029);
                    m3612();
                    iM11306 = (ThreadFactoryC3888.m11306("ۡۘ") + i4) * 29;
                    i = ((iM11306 ^ i3) * (-22149)) ^ 1201174288;
                    i2 = 1798167444;
                    int i1111 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i11 = i1111;
                    break;
                default:
                    i9 = 637;
                    iM11306 = ThreadFactoryC3888.m11306("᩶᩺") ^ i3;
                    i = ((iM11306 ^ i4) * 1949) ^ 583015249;
                    i2 = 1557958214;
                    int i1112 = i12;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    i11 = i1112;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0199 A[PHI: r9 r10
      0x0199: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:49:0x0197, B:15:0x006b, B:12:0x0062, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0199: PHI (r10v4 short) = (r10v3 short), (r10v2 short), (r10v2 short), (r10v2 short) binds: [B:49:0x0197, B:15:0x006b, B:12:0x0062, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x01e9 A[PHI: r6 r7 r11
      0x01e9: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:57:0x01e7, B:45:0x0179, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x01e9: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:57:0x01e7, B:45:0x0179, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x01e9: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:57:0x01e7, B:45:0x0179, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x021c A[PHI: r3 r5 r8
      0x021c: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v5 java.lang.String) binds: [B:61:0x021a, B:53:0x01c8, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x021c: PHI (r5v4 char) = (r5v3 char), (r5v2 char), (r5v2 char) binds: [B:61:0x021a, B:53:0x01c8, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x021c: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:61:0x021a, B:53:0x01c8, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x024e A[PHI: r2 r19
      0x024e: PHI (r2v5 int) = (r2v2 int), (r2v4 int), (r2v2 int) binds: [B:65:0x024c, B:23:0x0089, B:12:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:65:0x024c, B:23:0x0089, B:12:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0281 A[PHI: r1 r13 r14
      0x0281: PHI (r1v5 l.᩵֨ۙ) = (r1v2 l.᩵֨ۙ), (r1v4 l.᩵֨ۙ), (r1v2 l.᩵֨ۙ), (r1v2 l.᩵֨ۙ) binds: [B:69:0x027f, B:28:0x00c7, B:17:0x006f, B:15:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:69:0x027f, B:28:0x00c7, B:17:0x006f, B:15:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:69:0x027f, B:28:0x00c7, B:17:0x006f, B:15:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC22611, l.ComponentCallbacksC22654
    public final void onHiddenChanged(boolean z) {
        int iM45029;
        int i;
        int i2;
        int i3 = C0050.f912;
        int i4 = C3722.f13525;
        int iM11306 = ThreadFactoryC3888.m11306("ۜᩳ") ^ i4;
        int i5 = ((iM11306 ^ i3) * 25109) ^ (-47966199);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM11306 ^ 60205824;
        ActivityC19126 activityC19126M5049 = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        short s3 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -2121242734;
        String strM6105 = null;
        int iM11307 = 0;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * 22715) >> 31));
            switch (i12) {
                case -2002605339:
                case 2147364691:
                    C2642.m8171();
                    iM45029 = ThreadFactoryC3888.m11306("ܳ᩺") ^ i3;
                    i = ((iM45029 ^ i4) * (-17359)) ^ (-900791367);
                    i2 = 953680120;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1994168235:
                case -1205851742:
                    if (i8 - (i9 + 1) < 0) {
                        iM45029 = (C19806.m45029("᩺ۛ") ^ i4) * (-113);
                        i = ((iM45029 ^ i3) * (-29211)) ^ 516129754;
                        i2 = 805505602;
                    } else {
                        iM45029 = C19806.m45029("᩷۬") ^ i3;
                        i = ((iM45029 ^ i4) * 1577) ^ (-1852177319);
                        i2 = -624070620;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1763388782:
                case -335961977:
                    i10 = 38775;
                    iM45029 = C19806.m45029("ᩳۜ") ^ i3;
                    i = ((iM45029 ^ i4) * (-25019)) ^ (-1087599485);
                    i2 = -740180483;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1614274857:
                case -42739996:
                    super.onHiddenChanged(z);
                    if (z) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ᩵") ^ i3;
                        i = ((iM45029 ^ i4) * 19939) ^ 1461880611;
                        i2 = -264563872;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("֡ܺ")) * 57;
                        i = ((iM45029 ^ i3) * (-2557)) ^ 980240900;
                        i2 = -1669319050;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1546556733:
                case 1137604599:
                    i10 = 24731;
                    iM45029 = C19806.m45029("ᩳۜ") ^ i3;
                    i = ((iM45029 ^ i4) * (-25019)) ^ (-1087599485);
                    i2 = -740180483;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1403440644:
                case 466620866:
                    sArr = f3632;
                    if (C0216.m1591() <= 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ܿۖ")) * (-91);
                        i = ((iM45029 ^ i3) * 14771) ^ 968966103;
                        i2 = 1500022078;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴۤ") + i3) * 83;
                        i = ((iM45029 ^ i4) * (-9359)) ^ 1241146382;
                        i2 = -1798641847;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1314468725:
                case -181146220:
                    if (C0797.f3386) {
                        iM45029 = ThreadFactoryC3888.m11306("۬᩺") ^ i3;
                        i = ((iM45029 ^ i4) * 31721) ^ (-1864985671);
                        i2 = 869550014;
                    } else {
                        iM45029 = C19806.m45029("᩺᩷") ^ i4;
                        i = ((iM45029 ^ i3) * (-11379)) ^ (-683891861);
                        i2 = -692440148;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1239231724:
                case -205042869:
                    C2249.m6915();
                    if (C1148.f5161 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۬᩺") ^ i3;
                        i = ((iM45029 ^ i4) * 31721) ^ (-1864985671);
                        i2 = 869550014;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ܿۖ")) * (-91);
                        i = ((iM45029 ^ i3) * 14771) ^ 968966103;
                        i2 = 1500022078;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1139707656:
                case 674064221:
                    ((ActivityC5677) AbstractC0464.m2305(this)).m15657((CharSequence) null);
                    break;
                case -1012140531:
                case 352183540:
                    i9 = s * s3;
                    if (RunnableC3388.m10064()) {
                        iM45029 = C19806.m45029("۠۬") ^ i4;
                        i = ((iM45029 ^ i3) * (-1611)) ^ 412487054;
                        i2 = -1403157629;
                    } else {
                        iM45029 = C19806.m45029("᩺᩷") ^ i4;
                        i = ((iM45029 ^ i3) * (-11379)) ^ (-683891861);
                        i2 = -692440148;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -999174353:
                case 1389779717:
                    activityC19126M5049 = C1460.m5049(this);
                    sArr2 = f3632;
                    i11 = 172;
                    if (C0050.f912 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ᩺") ^ i3;
                        i = ((iM45029 ^ i4) * (-17359)) ^ (-900791367);
                        i2 = 953680120;
                    } else {
                        iM45029 = (C19806.m45029("ᩴۖ") ^ i4) * (-95);
                        i = ((iM45029 ^ i3) * 14713) ^ (-1305640598);
                        i2 = 381331400;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -903745566:
                case -182654479:
                    C19806.m45024();
                    if (C2332.f8260) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ᩺") ^ i3;
                        i = ((iM45029 ^ i4) * (-17359)) ^ (-900791367);
                        i2 = 953680120;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۬᩺") ^ i3;
                        i = ((iM45029 ^ i4) * 31721) ^ (-1864985671);
                        i2 = 869550014;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -897802066:
                case -544472960:
                    activityC19126M5049.setTitle(iM11307);
                    m3612();
                    break;
                case -894244013:
                case -381666978:
                    i7 = s + s2;
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = C19806.m45029("ۧۨ") ^ i3;
                        i = ((iM45029 ^ i4) * 29479) ^ (-1075730441);
                        i2 = -1189500778;
                    } else {
                        iM45029 = (C19806.m45029("ۙ֫") ^ i3) * (-89);
                        i = ((iM45029 ^ i4) * 21741) ^ (-589477405);
                        i2 = -144632690;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -677560124:
                case 1523214276:
                    iM11307 = 2098530459 ^ ThreadFactoryC3888.m11306(strM6105);
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ܿۖ")) * (-91);
                        i = ((iM45029 ^ i3) * 14771) ^ 968966103;
                        i2 = 1500022078;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ۜܳ")) * 15;
                        i = ((iM45029 ^ i3) * (-3187)) ^ (-612174760);
                        i2 = -304847699;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -595923570:
                case -408082041:
                    s = sArr[c];
                    s2 = 1;
                    if (RunnableC1895.f7152) {
                        iM45029 = (C19806.m45029("᩸ᩴ") + i3) * 77;
                        i = ((iM45029 ^ i4) * (-29317)) ^ (-1725219938);
                        i2 = 595451968;
                    } else {
                        iM45029 = C19806.m45029("᩺᩷") ^ i4;
                        i = ((iM45029 ^ i3) * (-11379)) ^ (-683891861);
                        i2 = -692440148;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 325137453:
                case 639035168:
                    c = 171;
                    if (C1461.f5957 <= 0) {
                        iM45029 = C19806.m45029("ۧۨ") ^ i3;
                        i = ((iM45029 ^ i4) * 29479) ^ (-1075730441);
                        i2 = -1189500778;
                    } else {
                        iM45029 = C19806.m45029("ܿ֫") ^ i4;
                        i = ((iM45029 ^ i3) * (-17037)) ^ 2050107782;
                        i2 = -117162984;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 652768205:
                case 1058053890:
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ᩺") ^ i3;
                        i = ((iM45029 ^ i4) * (-17359)) ^ (-900791367);
                        i2 = 953680120;
                    } else {
                        iM45029 = C19806.m45029("᩷ᩳ") ^ i4;
                        i = ((iM45029 ^ i3) * 19135) ^ 1209785573;
                        i2 = -1994110726;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1049914803:
                case 1915661977:
                    i8 = i7 * i7;
                    s3 = 2;
                    if (C0216.f1393 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۬᩺") ^ i3;
                        i = ((iM45029 ^ i4) * 31721) ^ (-1864985671);
                        i2 = 869550014;
                    } else {
                        iM45029 = C19806.m45029("ܿ۟") ^ i4;
                        i = ((iM45029 ^ i3) * (-10855)) ^ 497806952;
                        i2 = -422238633;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1962041532:
                case 2137239099:
                    C19806.m45024();
                    break;
                default:
                    strM6105 = C1875.m6105(sArr2, i11, 3, i10);
                    if (C0050.m946() <= 0) {
                        iM45029 = C19806.m45029("ۧۨ") ^ i3;
                        i = ((iM45029 ^ i4) * 29479) ^ (-1075730441);
                        i2 = -1189500778;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ܺ᩸")) * 101;
                        i = ((iM45029 ^ i4) * (-25709)) ^ 1999111865;
                        i2 = -604593635;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0085, code lost:
    
        if (l.C2788.m8472() == 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008a, code lost:
    
        if (l.C0278.f1572 <= 0) goto L70;
     */
    @Override // l.ComponentCallbacksC22654
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreateOptionsMenu(android.view.Menu r27, android.view.MenuInflater r28) {
        /*
            Method dump skipped, instruction units count: 976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0906.onCreateOptionsMenu(android.view.Menu, android.view.MenuInflater):void");
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0279 A[PHI: r14 r15 r35
      0x0279: PHI (r14v4 l.֡ܺ᩺) = (r14v3 l.֡ܺ᩺), (r14v2 l.֡ܺ᩺) binds: [B:46:0x0277, B:42:0x024e] A[DONT_GENERATE, DONT_INLINE]
      0x0279: PHI (r15v3 l.۠ۡۜ) = (r15v2 l.۠ۡۜ), (r15v4 l.۠ۡۜ) binds: [B:46:0x0277, B:42:0x024e] A[DONT_GENERATE, DONT_INLINE]
      0x0279: PHI (r35v46 java.util.List) = (r35v45 java.util.List), (r35v47 java.util.List) binds: [B:46:0x0277, B:42:0x024e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e3, code lost:
    
        if (l.C3286.f12186 == false) goto L18;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m3609(final l.C0906 r40, final l.ActivityC5677 r41) {
        /*
            Method dump skipped, instruction units count: 1876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0906.m3609(l.֨ۚۜ, l.ۚ᩻ۘ):void");
    }

    @Override // l.ComponentCallbacksC22654
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C12562 c12562;
        C12562 c12563;
        C12562 c12564;
        View view;
        DialogInterface.OnClickListener onClickListener;
        Bundle bundle;
        C12562 c12565;
        C12562 c12566;
        C8067 c8067;
        C12562 c12567;
        C12562 c12568;
        int i;
        Spinner spinner;
        int iM11306;
        int i2;
        int i3;
        DialogInterface.OnClickListener onClickListener2;
        int i4;
        int i5;
        C12562 c12569;
        C12562 c125610;
        C12562 c125611;
        short[] sArr;
        int i6;
        int iM11307;
        int i7;
        int iM11308;
        int i8;
        int i9;
        int i10;
        int iM11309;
        int i11;
        int i12;
        int i13;
        C12562 c125612;
        DialogInterface.OnClickListener onClickListener3;
        Bundle bundle2;
        C12562 c125613;
        C12562 c125614;
        C8067 c8068;
        C12562 c125615;
        Spinner spinner2;
        C12562 c125616;
        C12562 c125617;
        View view2;
        C12562 c125618;
        int i14;
        C12562 c125619;
        View view3;
        DialogInterface.OnClickListener onClickListener4;
        Bundle bundle3;
        C12562 c125620;
        C12562 c125621;
        C8067 c8069;
        Spinner spinner3;
        C12562 c125622;
        C12562 c125623;
        int iM113010;
        int i15;
        int i16;
        C12562 c125624;
        DialogInterface.OnClickListener onClickListener5;
        Bundle bundle4;
        C12562 c125625;
        C8067 c80610;
        C12562 c125626;
        Spinner spinner4;
        C12562 c125627;
        View view4;
        int iM113011;
        int i17;
        int i18;
        int i19;
        C12562 c125628;
        View view5;
        C12562 c125629;
        C12562 c125630;
        Spinner spinner5;
        C8067 c80611;
        DialogInterface.OnClickListener onClickListener6;
        C12562 c125631;
        Bundle bundle5;
        C12562 c125632;
        C12562 c125633;
        int iM45029;
        int i20;
        int i21;
        C12562 c125634;
        int i22;
        View view6;
        C8067 c80612;
        C12562 c125635;
        C12562 c125636;
        Spinner spinner6;
        Bundle bundle6;
        C12562 c125637;
        C12562 c125638;
        C22074 c22074;
        DialogInterface.OnClickListener onClickListener7;
        C12562 c125639;
        int iM450210;
        int i23;
        int i24;
        int iM450211;
        int i25;
        int i26;
        C12562 c125640;
        Bundle bundle7;
        int i27;
        int iM113012;
        int i28;
        int i29;
        int i30;
        int i31;
        C12562 c125641 = null;
        int i32 = C1668.f6641;
        int i33 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int iM450212 = (i33 - C19806.m45029("ۧۢ")) * 27;
        int i34 = ((iM450212 ^ i32) * (-29493)) ^ (-442442187);
        C12562 c125642 = null;
        C12562 c125643 = null;
        C12562 c125644 = null;
        String strM6085 = null;
        String strM940 = null;
        C22074 c22075 = null;
        C8067 c80613 = null;
        DialogInterface.OnClickListener onClickListener8 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i35 = iM450212 ^ 251393626;
        int i36 = 0;
        int i37 = 0;
        boolean z = false;
        int i38 = 0;
        int iM450213 = 0;
        int iM113013 = 0;
        int iM450214 = 0;
        int i39 = 0;
        int i40 = 0;
        ActivityC5677 activityC5677 = null;
        C12562 c125645 = null;
        C12562 c125646 = null;
        Bundle bundle8 = null;
        String strM10790 = null;
        ActivityC5677 activityC5678 = null;
        boolean z2 = false;
        boolean z3 = false;
        int i41 = -880100948;
        View view7 = null;
        final C12562 c125647 = null;
        Spinner spinner7 = null;
        C12562 c125648 = null;
        while (true) {
            i41 = i35 ^ (i34 & (((i41 ^ i32) * 15569) >> 31));
            switch (i41) {
                case -2131109351:
                case -1454919798:
                    return true;
                case -2123644601:
                case 1302020581:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    return false;
                case -2090743127:
                case 679972061:
                    c125634 = c125643;
                    i22 = i36;
                    C12562 c125649 = c125648;
                    view6 = view7;
                    c80612 = c80613;
                    c125635 = c125646;
                    c125636 = c125647;
                    spinner6 = spinner7;
                    bundle6 = bundle8;
                    c125637 = c125645;
                    c125638 = c125642;
                    c22074 = c22075;
                    DialogInterface.OnClickListener onClickListener9 = onClickListener8;
                    c125641 = c125641;
                    onClickListener7 = onClickListener9;
                    spinner6.setAdapter((SpinnerAdapter) c22074);
                    spinner6.setSelection(C0797.m3360(0, C0278.m1785(6, bundle6.getInt(C1461.m5070(f3632, 272, 15, i37)))));
                    C7105.m18978(c125641, C2642.m8163(bundle6, CallableC1627.m5502(f3632, 287, 13, i37)));
                    c125639 = c125649;
                    C7105.m18978(c125639, C2642.m8163(bundle6, CallableC1627.m5502(f3632, 300, 11, i37)));
                    if (AbstractC0464.f2088 <= 0) {
                        iM450210 = C19806.m45029("᩷ۧ") ^ i33;
                        i23 = ((iM450210 ^ i32) * 26417) ^ (-1765406444);
                        i24 = 1656346346;
                    } else {
                        iM450210 = (i32 - C19806.m45029("۫ܽ")) * 87;
                        i23 = ((iM450210 ^ i33) * (-31617)) ^ (-65001406);
                        i24 = 1931074723;
                    }
                    i35 = iM450210 ^ i24;
                    c22075 = c22074;
                    c125642 = c125638;
                    c125645 = c125637;
                    c125647 = c125636;
                    bundle8 = bundle6;
                    c125646 = c125635;
                    spinner7 = spinner6;
                    i41 = i41;
                    view7 = view6;
                    c80613 = c80612;
                    i34 = i23;
                    c125648 = c125639;
                    c125643 = c125634;
                    i36 = i22;
                    C12562 c125650 = c125641;
                    onClickListener8 = onClickListener7;
                    c125641 = c125650;
                    break;
                case -2038455743:
                case 1431665932:
                    i37 = 27981;
                    iM11306 = ThreadFactoryC3888.m11306("᩷ۘ") ^ i33;
                    i2 = ((iM11306 ^ i32) * (-4281)) ^ 1950107967;
                    i3 = -1120285;
                    i10 = iM11306 ^ i3;
                    i38 = i38;
                    i40 = i40;
                    c125642 = c125642;
                    c125645 = c125645;
                    c125641 = c125641;
                    onClickListener8 = onClickListener8;
                    sArr2 = sArr2;
                    i39 = i39;
                    z = z;
                    i41 = i41;
                    c125643 = c125643;
                    c125648 = c125648;
                    c125646 = c125646;
                    view7 = view7;
                    c125647 = c125647;
                    spinner7 = spinner7;
                    c80613 = c80613;
                    bundle8 = bundle8;
                    i35 = i10;
                    i34 = i2;
                    i36 = i36;
                    break;
                case -2032080254:
                case 157470248:
                    c125643 = c125643;
                    i36 = i36;
                    C12562 c125651 = c125642;
                    C12562 c125652 = c125645;
                    C12562 c125653 = c125647;
                    c125648 = c125648;
                    view7 = view7;
                    c80613 = c80613;
                    C12562 c125654 = c125646;
                    Spinner spinner8 = spinner7;
                    Bundle bundle9 = bundle8;
                    DialogInterface.OnClickListener onClickListener10 = onClickListener8;
                    c125641 = c125641;
                    onClickListener7 = onClickListener10;
                    C1937.m6283(c125653, C3743.m10960(bundle9, RunnableC1606.m5481(f3632, 311, 12, i37)));
                    C7105.m18978(c125652, C3743.m10960(bundle9, C3577.m10571(f3632, 323, 15, i37)));
                    C7105.m18978(c125651, C2642.m8163(bundle9, C2871.m8640(f3632, 338, 12, i37)));
                    if (C2642.m8163(bundle9, C0526.m2424(f3632, 350, 15, i37))) {
                        iM450211 = (ThreadFactoryC3888.m11306("᩶ᩳ") + i32) * (-91);
                        i25 = ((iM450211 ^ i33) * 2991) ^ 984242209;
                        i26 = -1154001113;
                    } else {
                        iM450211 = C19806.m45029("ۡ᩷") ^ i32;
                        i25 = ((iM450211 ^ i33) * 20795) ^ 609280291;
                        i26 = 282494082;
                    }
                    i35 = iM450211 ^ i26;
                    c125642 = c125651;
                    c125645 = c125652;
                    c125647 = c125653;
                    bundle8 = bundle9;
                    c125646 = c125654;
                    spinner7 = spinner8;
                    i36 = i36;
                    c125648 = c125648;
                    view7 = view7;
                    c80613 = c80613;
                    i34 = i25;
                    c125643 = c125643;
                    C12562 c125655 = c125641;
                    onClickListener8 = onClickListener7;
                    c125641 = c125655;
                    break;
                case -2018736213:
                case -695199658:
                    c125640 = c125646;
                    bundle7 = bundle8;
                    onClickListener7 = onClickListener8;
                    C7105.m18978(c125640, false);
                    C2477.m7603(c125640, false);
                    C1460.m5046(c125640, 0.75f);
                    int iM450215 = C19806.m45029("ۨۚ") ^ i33;
                    i25 = ((iM450215 ^ i32) * 11379) ^ (-1559381858);
                    i35 = iM450215 ^ (-303656661);
                    bundle8 = bundle7;
                    c125646 = c125640;
                    spinner7 = spinner7;
                    c125642 = c125642;
                    c125645 = c125645;
                    c125647 = c125647;
                    i36 = i36;
                    c125648 = c125648;
                    view7 = view7;
                    c80613 = c80613;
                    i34 = i25;
                    c125643 = c125643;
                    C12562 c125656 = c125641;
                    onClickListener8 = onClickListener7;
                    c125641 = c125656;
                    break;
                case -1930395747:
                case -1550497213:
                    c12562 = c125643;
                    i13 = i36;
                    c125612 = c125648;
                    onClickListener3 = onClickListener8;
                    bundle2 = bundle8;
                    c125613 = c125646;
                    c125614 = c125641;
                    c8068 = c80613;
                    c125615 = c125645;
                    spinner2 = spinner7;
                    c125616 = c125642;
                    c125617 = c125647;
                    ActivityC5677 activityC5679 = (ActivityC5677) C1460.m5049(this);
                    View viewM4976 = C1419.m4976(activityC5679, C19806.m45029(C1668.m5577(f3632, 197, 3, i37)) ^ 2129335307);
                    sArr2 = f3632;
                    i39 = 200;
                    i40 = 3;
                    if (C2642.f10294 <= 0) {
                        activityC5677 = activityC5679;
                        view2 = viewM4976;
                        int iM450216 = (i32 - C19806.m45029("ᩳ᩵")) * (-71);
                        i30 = ((iM450216 ^ i33) * (-5845)) ^ (-1784100731);
                        i31 = iM450216 ^ (-1664841915);
                        c125648 = c125612;
                        c125642 = c125616;
                        c125645 = c125615;
                        c125647 = c125617;
                        c125646 = c125613;
                        c125641 = c125614;
                        spinner7 = spinner2;
                        c80613 = c8068;
                        onClickListener8 = onClickListener3;
                        bundle8 = bundle2;
                        i36 = i13;
                        view7 = view2;
                        i35 = i31;
                        i34 = i30;
                    } else {
                        int iM450217 = C19806.m45029("ܰ۠") ^ i32;
                        activityC5677 = activityC5679;
                        c125648 = c125612;
                        i34 = ((iM450217 ^ i33) * 27477) ^ 1074788015;
                        c125647 = c125617;
                        c125646 = c125613;
                        spinner7 = spinner2;
                        c80613 = c8068;
                        bundle8 = bundle2;
                        i36 = i13;
                        view7 = viewM4976;
                        i35 = iM450217 ^ 207885796;
                        c125642 = c125616;
                        c125645 = c125615;
                        c125641 = c125614;
                        onClickListener8 = onClickListener3;
                        i41 = i41;
                    }
                    c125643 = c12562;
                    break;
                case -1869754307:
                case 1207483423:
                    C12562 c125657 = c125643;
                    i19 = i36;
                    c125628 = c125648;
                    view5 = view7;
                    c125629 = c125646;
                    C12562 c125658 = c125647;
                    C12562 c125659 = c125645;
                    C12562 c125660 = c125642;
                    DialogInterface.OnClickListener onClickListener11 = onClickListener8;
                    c125630 = c125641;
                    C8067 c80614 = c80613;
                    spinner5 = spinner7;
                    Bundle bundle10 = bundle8;
                    c80611 = c80614;
                    onClickListener6 = onClickListener11;
                    c125631 = c125659;
                    bundle5 = bundle10;
                    c125632 = c125658;
                    C5140 c5140 = new C5140(c125630, c125628, c125658, c125659, c125660, c125657);
                    C1668.m5571(c125630, c5140);
                    C1668.m5571(c125628, c5140);
                    C1189.m4370(c125632, c5140);
                    C1189.m4370(c125631, c5140);
                    c125633 = c125660;
                    C1668.m5571(c125633, c5140);
                    c125643 = c125657;
                    C1189.m4370(c125643, c5140);
                    strM6085 = C1875.m6085(ThreadFactoryC3888.m11306(C0797.m3361(f3632, 227, 3, i37)) ^ 2099072847);
                    strM940 = C0050.m940(f3632, 230, 7, i37);
                    strM10790 = C3660.m10790(f3632, 237, 7, i37);
                    if (C1875.f7103 >= 0) {
                        iM45029 = (i33 - C19806.m45029("ܳۢ")) * (-53);
                        i20 = ((iM45029 ^ i32) * 15747) ^ (-1867300641);
                        i21 = -1317334071;
                    } else {
                        iM45029 = C19806.m45029("ۡۨ") ^ i33;
                        i20 = ((iM45029 ^ i32) * 10757) ^ 1020191914;
                        i21 = 2146967013;
                    }
                    i27 = iM45029 ^ i21;
                    c125648 = c125628;
                    c125642 = c125633;
                    c125645 = c125631;
                    c125647 = c125632;
                    c125646 = c125629;
                    c125641 = c125630;
                    spinner7 = spinner5;
                    c80613 = c80611;
                    onClickListener8 = onClickListener6;
                    bundle8 = bundle5;
                    i36 = i19;
                    view7 = view5;
                    i35 = i27;
                    i34 = i20;
                    break;
                case -1799995567:
                case 1772523612:
                    int i42 = i36;
                    c12568 = c125642;
                    c12564 = c125648;
                    onClickListener = onClickListener8;
                    bundle = bundle8;
                    c12566 = c125641;
                    c8067 = c80613;
                    spinner = spinner7;
                    c12563 = c125647;
                    view = view7;
                    c12565 = c125646;
                    short[] sArr4 = sArr3;
                    C12562 c125661 = (C12562) C3743.m10957(view, C19806.m45029(RunnableC1895.m6164(sArr4, 212, 3, i37)) ^ 2128589099);
                    i36 = i42;
                    c12562 = c125643;
                    iM113013 = ThreadFactoryC3888.m11306(CallableC1627.m5502(f3632, 215, 3, i37));
                    if (C0216.f1393 != 0) {
                        sArr3 = sArr4;
                        c12567 = c125661;
                        i = i40;
                        int iM450218 = C19806.m45029("ᩳ֨") ^ i32;
                        i30 = ((iM450218 ^ i33) * 4985) ^ (-1345737409);
                        i31 = iM450218 ^ (-744520847);
                        c125648 = c12564;
                        i40 = i;
                        c125642 = c12568;
                        c125645 = c12567;
                        c125641 = c12566;
                        onClickListener8 = onClickListener;
                        sArr2 = sArr2;
                        i39 = i39;
                        i36 = i36;
                        c125646 = c12565;
                        view7 = view;
                        c125647 = c12563;
                        spinner7 = spinner;
                        c80613 = c8067;
                        bundle8 = bundle;
                        i35 = i31;
                        i34 = i30;
                        c125643 = c12562;
                    } else {
                        int iM113014 = (i33 - ThreadFactoryC3888.m11306("ܽܶ")) * 19;
                        c125648 = c12564;
                        sArr3 = sArr4;
                        c125646 = c12565;
                        c125641 = c12566;
                        onClickListener8 = onClickListener;
                        i41 = i41;
                        i36 = i36;
                        view7 = view;
                        c125647 = c12563;
                        spinner7 = spinner;
                        c80613 = c8067;
                        bundle8 = bundle;
                        i35 = iM113014 ^ 1033710374;
                        i34 = ((iM113014 ^ i32) * 1531) ^ (-1082850811);
                        c125643 = c12562;
                        c125645 = c125661;
                        c125642 = c12568;
                    }
                    break;
                case -1727003877:
                case -553847897:
                    activityC5678.m15669(new RunnableC20717(2, this, activityC5678));
                    return z3;
                case -1692525365:
                case -344585208:
                    c12562 = c125643;
                    i36 = i36;
                    c12563 = c125647;
                    c12564 = c125648;
                    view = view7;
                    onClickListener = onClickListener8;
                    bundle = bundle8;
                    c12565 = c125646;
                    short[] sArr5 = sArr2;
                    int i43 = i39;
                    c12566 = c125641;
                    c8067 = c80613;
                    c12567 = c125645;
                    c12568 = c125642;
                    i = i40;
                    Spinner spinner9 = (Spinner) C3743.m10957(view, ThreadFactoryC3888.m11306(C2124.m6685(sArr5, i43, i, i37)) ^ 2127392231);
                    sArr2 = sArr5;
                    i39 = i43;
                    iM450213 = C19806.m45029(C1148.m4230(f3632, 203, 3, i37));
                    if (C1668.f6641 < 0) {
                        int iM113015 = ThreadFactoryC3888.m11306("ۜۨ") ^ i33;
                        i40 = i;
                        c125642 = c12568;
                        c125645 = c12567;
                        c125641 = c12566;
                        c80613 = c8067;
                        onClickListener8 = onClickListener;
                        bundle8 = bundle;
                        sArr2 = sArr2;
                        i39 = i39;
                        i35 = iM113015 ^ 1031485770;
                        i34 = ((iM113015 ^ i32) * 129) ^ 1065424967;
                        c125646 = c12565;
                        c125643 = c12562;
                        view7 = view;
                        c125647 = c12563;
                        spinner7 = spinner9;
                        c125648 = c12564;
                        i36 = i36;
                    } else {
                        spinner = spinner9;
                        int iM450219 = C19806.m45029("ᩳ֨") ^ i32;
                        i30 = ((iM450219 ^ i33) * 4985) ^ (-1345737409);
                        i31 = iM450219 ^ (-744520847);
                        c125648 = c12564;
                        i40 = i;
                        c125642 = c12568;
                        c125645 = c12567;
                        c125641 = c12566;
                        onClickListener8 = onClickListener;
                        sArr2 = sArr2;
                        i39 = i39;
                        i36 = i36;
                        c125646 = c12565;
                        view7 = view;
                        c125647 = c12563;
                        spinner7 = spinner;
                        c80613 = c8067;
                        bundle8 = bundle;
                        i35 = i31;
                        i34 = i30;
                        c125643 = c12562;
                    }
                    break;
                case -1668744555:
                case 1103269120:
                    if (C2642.f10294 <= 0) {
                        iM113012 = (i32 - C19806.m45029("ۧܳ")) * 33;
                        i28 = ((iM113012 ^ i33) * (-26137)) ^ 1810494170;
                        i29 = -604992657;
                        i35 = iM113012 ^ i29;
                        i34 = i28;
                        i41 = i41;
                    } else {
                        i19 = i36;
                        c125628 = c125648;
                        view5 = view7;
                        onClickListener6 = onClickListener8;
                        bundle5 = bundle8;
                        c125629 = c125646;
                        c125630 = c125641;
                        c80611 = c80613;
                        c125631 = c125645;
                        spinner5 = spinner7;
                        c125633 = c125642;
                        c125632 = c125647;
                        iM45029 = (i33 - C19806.m45029("ܳۢ")) * (-53);
                        i20 = ((iM45029 ^ i32) * 15747) ^ (-1867300641);
                        i21 = -1317334071;
                        i27 = iM45029 ^ i21;
                        c125648 = c125628;
                        c125642 = c125633;
                        c125645 = c125631;
                        c125647 = c125632;
                        c125646 = c125629;
                        c125641 = c125630;
                        spinner7 = spinner5;
                        c80613 = c80611;
                        onClickListener8 = onClickListener6;
                        bundle8 = bundle5;
                        i36 = i19;
                        view7 = view5;
                        i35 = i27;
                        i34 = i20;
                    }
                    break;
                case -1659391637:
                case 755465019:
                    onClickListener7 = onClickListener8;
                    bundle7 = bundle8;
                    c125640 = c125646;
                    C7105.m18978(c125640, C2642.m8163(bundle7, C0629.m2906(f3632, 365, 14, i37)));
                    int iM4502110 = C19806.m45029("ۨۚ") ^ i33;
                    i25 = ((iM4502110 ^ i32) * 11379) ^ (-1559381858);
                    i35 = iM4502110 ^ (-303656661);
                    bundle8 = bundle7;
                    c125646 = c125640;
                    spinner7 = spinner7;
                    c125642 = c125642;
                    c125645 = c125645;
                    c125647 = c125647;
                    i36 = i36;
                    c125648 = c125648;
                    view7 = view7;
                    c80613 = c80613;
                    i34 = i25;
                    c125643 = c125643;
                    C12562 c1256510 = c125641;
                    onClickListener8 = onClickListener7;
                    c125641 = c1256510;
                    break;
                case -1532985270:
                case 1453390286:
                    C12562 c125662 = c125643;
                    C1937.m6283(c125644, C1189.m4371(ApplicationC0716.f2992, CallableC1627.m5502(f3632, 379, 4, i37), true));
                    C8067 c8067M3751 = C0962.m3751(activityC5677);
                    C2871.m8638(c8067M3751, view7);
                    final C12562 c125663 = c125646;
                    c12562 = c125662;
                    final Bundle bundle11 = bundle8;
                    onClickListener = onClickListener;
                    int i44 = i36;
                    final Spinner spinner10 = spinner7;
                    final C12562 c125664 = c125642;
                    final C12562 c125665 = c125641;
                    final C12562 c125666 = c125645;
                    final C12562 c125667 = c125648;
                    C12562 c125668 = c125647;
                    C12562 c125669 = c125648;
                    i36 = i44;
                    c12566 = c125641;
                    spinner = spinner7;
                    view5 = view7;
                    final C12562 c125670 = c125644;
                    DialogInterface.OnClickListener onClickListener12 = new DialogInterface.OnClickListener() { // from class: l.ۙۚۜ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i45) {
                            C0906.m3607(this.f15767, bundle11, spinner10, c125665, c125667, c125647, c125666, c125664, c125663, c125670);
                        }
                    };
                    iM450214 = C19806.m45029(C0671.m3009(f3632, 383, 3, i37));
                    if (C1025.m3861() > 0) {
                        int iM450220 = (C19806.m45029("ۘܽ") ^ i32) * 11;
                        i20 = ((iM450220 ^ i33) * 9141) ^ (-489372617);
                        i27 = iM450220 ^ (-861538330);
                        c125641 = c12566;
                        spinner7 = spinner;
                        onClickListener8 = onClickListener;
                        c80613 = c8067M3751;
                        c125643 = c12562;
                        c125646 = c125663;
                        c125642 = c125664;
                        c125645 = c125666;
                        c125647 = c125668;
                        i36 = i36;
                        c125648 = c125669;
                        view7 = view5;
                        i35 = i27;
                        i34 = i20;
                    } else {
                        sArr2 = sArr2;
                        i39 = i39;
                        i = i40;
                        c12565 = c125663;
                        c12568 = c125664;
                        c12567 = c125666;
                        c12563 = c125668;
                        c12564 = c125669;
                        view = view5;
                        bundle = bundle8;
                        c8067 = c8067M3751;
                        int iM4502111 = C19806.m45029("ᩳ֨") ^ i32;
                        i30 = ((iM4502111 ^ i33) * 4985) ^ (-1345737409);
                        i31 = iM4502111 ^ (-744520847);
                        c125648 = c12564;
                        i40 = i;
                        c125642 = c12568;
                        c125645 = c12567;
                        c125641 = c12566;
                        onClickListener8 = onClickListener;
                        sArr2 = sArr2;
                        i39 = i39;
                        i36 = i36;
                        c125646 = c12565;
                        view7 = view;
                        c125647 = c12563;
                        spinner7 = spinner;
                        c80613 = c8067;
                        bundle8 = bundle;
                        i35 = i31;
                        i34 = i30;
                        c125643 = c12562;
                    }
                    break;
                case -1526531421:
                case 1711014501:
                    if (C1189.f5284 > 0) {
                        c12562 = c125643;
                        i13 = i36;
                        c125612 = c125648;
                        view2 = view7;
                        onClickListener3 = onClickListener8;
                        bundle2 = bundle8;
                        c125613 = c125646;
                        c125614 = c125641;
                        c8068 = c80613;
                        c125615 = c125645;
                        spinner2 = spinner7;
                        c125616 = c125642;
                        c125617 = c125647;
                        int iM4502112 = (i32 - C19806.m45029("ᩳ᩵")) * (-71);
                        i30 = ((iM4502112 ^ i33) * (-5845)) ^ (-1784100731);
                        i31 = iM4502112 ^ (-1664841915);
                        c125648 = c125612;
                        c125642 = c125616;
                        c125645 = c125615;
                        c125647 = c125617;
                        c125646 = c125613;
                        c125641 = c125614;
                        spinner7 = spinner2;
                        c80613 = c8068;
                        onClickListener8 = onClickListener3;
                        bundle8 = bundle2;
                        i36 = i13;
                        view7 = view2;
                        i35 = i31;
                        i34 = i30;
                        c125643 = c12562;
                    } else {
                        c125634 = c125643;
                        i22 = i36;
                        c125639 = c125648;
                        view6 = view7;
                        c80612 = c80613;
                        c125635 = c125646;
                        c125636 = c125647;
                        spinner6 = spinner7;
                        bundle6 = bundle8;
                        c125637 = c125645;
                        c125638 = c125642;
                        c22074 = c22075;
                        DialogInterface.OnClickListener onClickListener13 = onClickListener8;
                        c125641 = c125641;
                        onClickListener7 = onClickListener13;
                        iM450210 = C19806.m45029("᩷ۧ") ^ i33;
                        i23 = ((iM450210 ^ i32) * 26417) ^ (-1765406444);
                        i24 = 1656346346;
                        i35 = iM450210 ^ i24;
                        c22075 = c22074;
                        c125642 = c125638;
                        c125645 = c125637;
                        c125647 = c125636;
                        bundle8 = bundle6;
                        c125646 = c125635;
                        spinner7 = spinner6;
                        i41 = i41;
                        view7 = view6;
                        c80613 = c80612;
                        i34 = i23;
                        c125648 = c125639;
                        c125643 = c125634;
                        i36 = i22;
                        C12562 c1256511 = c125641;
                        onClickListener8 = onClickListener7;
                        c125641 = c1256511;
                    }
                    break;
                case -1494308636:
                case 1804866275:
                    c125643 = c125643;
                    i36 = i36;
                    c125648 = c125648;
                    onClickListener8 = onClickListener8;
                    bundle8 = bundle8;
                    z = z;
                    i38 = i38;
                    i39 = i39;
                    c125641 = c125641;
                    c80613 = c80613;
                    c125645 = c125645;
                    spinner7 = spinner7;
                    c125642 = c125642;
                    c125647 = c125647;
                    view7 = view7;
                    c125646 = c125646;
                    sArr2 = sArr2;
                    i40 = i40;
                    if (i38 == (ThreadFactoryC3888.m11306(RunnableC1895.m6164(f3632, 182, 3, i37)) ^ 2118305074)) {
                        iM11306 = (C19806.m45029("ۗ۟") ^ i32) * 33;
                        i2 = ((iM11306 ^ i33) * (-6403)) ^ (-1576142583);
                        i3 = -1005187936;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ᩳ") ^ i33;
                        i2 = ((iM11306 ^ i32) * (-6035)) ^ (-1065083970);
                        i3 = 135776187;
                    }
                    i10 = iM11306 ^ i3;
                    i38 = i38;
                    i40 = i40;
                    c125642 = c125642;
                    c125645 = c125645;
                    c125641 = c125641;
                    onClickListener8 = onClickListener8;
                    sArr2 = sArr2;
                    i39 = i39;
                    z = z;
                    i41 = i41;
                    c125643 = c125643;
                    c125648 = c125648;
                    c125646 = c125646;
                    view7 = view7;
                    c125647 = c125647;
                    spinner7 = spinner7;
                    c80613 = c80613;
                    bundle8 = bundle8;
                    i35 = i10;
                    i34 = i2;
                    i36 = i36;
                    break;
                case -1374195382:
                case 1121389047:
                    activityC5678.m15678();
                    return z3;
                case -1359898275:
                case -839069281:
                    c125643 = c125643;
                    i36 = i36;
                    onClickListener2 = onClickListener8;
                    bundle8 = bundle8;
                    i4 = i38;
                    i5 = i39;
                    c12569 = c125641;
                    c80613 = c80613;
                    c125610 = c125645;
                    spinner7 = spinner7;
                    c125611 = c125642;
                    c125647 = c125647;
                    view7 = view7;
                    c125646 = c125646;
                    sArr = sArr2;
                    i6 = i40;
                    z2 = true;
                    c125648 = c125648;
                    if (i4 == (C19806.m45029(C3577.m10571(f3632, 191, 3, i37)) ^ 2099009355)) {
                        iM11307 = (C19806.m45029("ܳ֡") ^ i32) * (-103);
                        i2 = ((iM11307 ^ i33) * (-12453)) ^ 1672580706;
                        i7 = 885989267;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ܿ۫") ^ i32) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i2 = ((iM11307 ^ i33) * (-5555)) ^ (-669129823);
                        i7 = -1392111835;
                    }
                    i10 = iM11307 ^ i7;
                    i38 = i4;
                    i40 = i6;
                    c125642 = c125611;
                    c125645 = c125610;
                    c125641 = c12569;
                    onClickListener8 = onClickListener2;
                    sArr2 = sArr;
                    i39 = i5;
                    i41 = i41;
                    c125643 = c125643;
                    c125648 = c125648;
                    c125646 = c125646;
                    view7 = view7;
                    c125647 = c125647;
                    spinner7 = spinner7;
                    c80613 = c80613;
                    bundle8 = bundle8;
                    i35 = i10;
                    i34 = i2;
                    i36 = i36;
                    break;
                case -1336510891:
                case -1230302927:
                    c12562 = c125643;
                    int i45 = i36;
                    C12562 c125671 = c125648;
                    DialogInterface.OnClickListener onClickListener14 = onClickListener8;
                    Bundle bundle12 = bundle8;
                    boolean z4 = z;
                    int i46 = i39;
                    C12562 c125672 = c125641;
                    C8067 c80615 = c80613;
                    C12562 c125673 = c125645;
                    Spinner spinner11 = spinner7;
                    C12562 c125674 = c125642;
                    C12562 c125675 = c125647;
                    View view8 = view7;
                    C12562 c125676 = c125646;
                    short[] sArr6 = sArr2;
                    int i47 = i40;
                    activityC5678 = (ActivityC5677) C1460.m5049(this);
                    int iM18990 = C7105.m18990(menuItem);
                    z3 = true;
                    if (iM18990 == (ThreadFactoryC3888.m11306(C1398.m4892(f3632, PicnicEngine.MAX_AUX_BYTES, 3, i37)) ^ 2123307493)) {
                        iM11309 = (ThreadFactoryC3888.m11306("۟᩻") ^ i32) * 67;
                        i11 = ((iM11309 ^ i33) * 10327) ^ (-1604444583);
                        i12 = -148423005;
                    } else {
                        iM11309 = ThreadFactoryC3888.m11306("֡۬") ^ i32;
                        i11 = ((iM11309 ^ i33) * 22789) ^ 1975668123;
                        i12 = 1268941962;
                    }
                    int i48 = iM11309 ^ i12;
                    i38 = iM18990;
                    i34 = i11;
                    i40 = i47;
                    c125642 = c125674;
                    c125645 = c125673;
                    c125641 = c125672;
                    onClickListener8 = onClickListener14;
                    sArr2 = sArr6;
                    i39 = i46;
                    z = z4;
                    i41 = i41;
                    i36 = i45;
                    c125648 = c125671;
                    c125646 = c125676;
                    view7 = view8;
                    c125647 = c125675;
                    spinner7 = spinner11;
                    c80613 = c80615;
                    bundle8 = bundle12;
                    i35 = i48;
                    c125643 = c12562;
                    break;
                case -1264872142:
                case -336627750:
                    c125643 = c125643;
                    i36 = i36;
                    c125648 = c125648;
                    onClickListener8 = onClickListener8;
                    bundle8 = bundle8;
                    z = z;
                    i38 = i38;
                    i39 = i39;
                    c125641 = c125641;
                    c80613 = c80613;
                    c125645 = c125645;
                    spinner7 = spinner7;
                    c125642 = c125642;
                    c125647 = c125647;
                    view7 = view7;
                    c125646 = c125646;
                    sArr2 = sArr2;
                    i40 = i40;
                    short s = f3632[175];
                    int i49 = s + 11960;
                    int i50 = (s * s) + 143041600;
                    if ((i49 * i49) - (i50 + i50) > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡ۟") + i33) * 87;
                        i2 = ((iM11306 ^ i32) * (-22415)) ^ (-1229801611);
                        i3 = -1307584981;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰ۟") + i32) * 5;
                        i2 = ((iM11306 ^ i33) * 21475) ^ 1045044463;
                        i3 = 117302029;
                    }
                    i10 = iM11306 ^ i3;
                    i38 = i38;
                    i40 = i40;
                    c125642 = c125642;
                    c125645 = c125645;
                    c125641 = c125641;
                    onClickListener8 = onClickListener8;
                    sArr2 = sArr2;
                    i39 = i39;
                    z = z;
                    i41 = i41;
                    c125643 = c125643;
                    c125648 = c125648;
                    c125646 = c125646;
                    view7 = view7;
                    c125647 = c125647;
                    spinner7 = spinner7;
                    c80613 = c80613;
                    bundle8 = bundle8;
                    i35 = i10;
                    i34 = i2;
                    i36 = i36;
                    break;
                case -1224340078:
                case 1950166869:
                    c125618 = c125643;
                    i14 = i36;
                    c125619 = c125645;
                    view3 = view7;
                    onClickListener4 = onClickListener8;
                    bundle3 = bundle8;
                    c125620 = c125646;
                    c125621 = c125642;
                    c8069 = c80613;
                    spinner3 = spinner7;
                    c125622 = (C12562) C2642.m8167(view3, iM450213 ^ 2121075855);
                    c125648 = (C12562) C2642.m8167(view3, ThreadFactoryC3888.m11306(C1460.m5047(f3632, 206, 3, i37)) ^ 2123319888);
                    c125623 = (C12562) C2642.m8167(view3, ThreadFactoryC3888.m11306(C3660.m10790(f3632, 209, 3, i37)) ^ 2118551629);
                    sArr3 = f3632;
                    if (C3722.f13525 <= 0) {
                        iM113010 = ThreadFactoryC3888.m11306("۬ۢ") ^ i33;
                        i15 = ((iM113010 ^ i32) * (-16333)) ^ (-632439845);
                        i16 = 142908901;
                    } else {
                        iM113010 = (ThreadFactoryC3888.m11306("ۙۜ") ^ i32) * 63;
                        i15 = ((iM113010 ^ i33) * (-4473)) ^ 1902118508;
                        i16 = 783623960;
                    }
                    int i51 = iM113010 ^ i16;
                    c125646 = c125620;
                    spinner7 = spinner3;
                    c80613 = c8069;
                    onClickListener8 = onClickListener4;
                    bundle8 = bundle3;
                    i41 = i41;
                    i35 = i51;
                    view7 = view3;
                    i36 = i14;
                    c125647 = c125623;
                    c125643 = c125618;
                    C12562 c125677 = c125619;
                    c125641 = c125622;
                    i34 = i15;
                    c125642 = c125621;
                    c125645 = c125677;
                    break;
                case -1076586651:
                case 1405631178:
                    activityC5678.m15677();
                    return z3;
                case -1003884261:
                case 1480997679:
                    c125643 = c125643;
                    i36 = i36;
                    c125648 = c125648;
                    onClickListener8 = onClickListener8;
                    bundle8 = bundle8;
                    i38 = i38;
                    i39 = i39;
                    c125641 = c125641;
                    c80613 = c80613;
                    c125645 = c125645;
                    spinner7 = spinner7;
                    c125642 = c125642;
                    c125647 = c125647;
                    view7 = view7;
                    c125646 = c125646;
                    sArr2 = sArr2;
                    i40 = i40;
                    z = z;
                    if (i38 == (C19806.m45029(C1189.m4365(f3632, 188, 3, i37)) ^ 2120601681)) {
                        iM11306 = (i33 - C19806.m45029("ۗ֨")) * (-47);
                        i2 = ((iM11306 ^ i32) * (-17459)) ^ 693927485;
                        i3 = 2009740034;
                    } else {
                        iM11306 = C19806.m45029("ܽ۟") ^ i33;
                        i2 = ((iM11306 ^ i32) * (-24733)) ^ (-1991218456);
                        i3 = -407391348;
                    }
                    i10 = iM11306 ^ i3;
                    i38 = i38;
                    i40 = i40;
                    c125642 = c125642;
                    c125645 = c125645;
                    c125641 = c125641;
                    onClickListener8 = onClickListener8;
                    sArr2 = sArr2;
                    i39 = i39;
                    z = z;
                    i41 = i41;
                    c125643 = c125643;
                    c125648 = c125648;
                    c125646 = c125646;
                    view7 = view7;
                    c125647 = c125647;
                    spinner7 = spinner7;
                    c80613 = c80613;
                    bundle8 = bundle8;
                    i35 = i10;
                    i34 = i2;
                    i36 = i36;
                    break;
                case -919141345:
                case 88033887:
                    iM113011 = i36;
                    c125624 = c125648;
                    onClickListener5 = onClickListener8;
                    c80610 = c80613;
                    c125625 = c125641;
                    spinner4 = spinner7;
                    c125626 = c125645;
                    c125627 = c125647;
                    view4 = view7;
                    C12562 c125678 = c125642;
                    c125643 = (C12562) C2642.m8167(view4, iM113011);
                    c125646 = (C12562) C3743.m10957(view4, C19806.m45029(RunnableC0195.m1429(f3632, 221, 3, i37)) ^ 2102884607);
                    c125644 = (C12562) C3743.m10957(view4, C19806.m45029(RunnableC1606.m5481(f3632, BERTags.FLAGS, 3, i37)) ^ 2121172482);
                    Bundle bundleM16571 = this.f3635.m16571();
                    if (C3722.f13525 > 0) {
                        int iM113016 = ThreadFactoryC3888.m11306("֨᩹") ^ i32;
                        int i52 = ((iM113016 ^ i33) * 20345) ^ 30617431;
                        i35 = iM113016 ^ 133690739;
                        c125648 = c125624;
                        i36 = iM113011;
                        i34 = i52;
                        view7 = view4;
                        c125647 = c125627;
                        spinner7 = spinner4;
                        c80613 = c80610;
                        bundle8 = bundleM16571;
                        c125642 = c125678;
                        c125645 = c125626;
                        c125641 = c125625;
                        onClickListener8 = onClickListener5;
                        i41 = i41;
                    } else {
                        bundle4 = bundleM16571;
                        c125642 = c125678;
                        int iM113017 = (i32 - ThreadFactoryC3888.m11306("᩺ۨ")) * (-39);
                        i17 = ((iM113017 ^ i33) * 22827) ^ 1472860294;
                        i18 = iM113017 ^ (-1395058120);
                        view7 = view4;
                        c125647 = c125627;
                        spinner7 = spinner4;
                        c80613 = c80610;
                        bundle8 = bundle4;
                        i35 = i18;
                        c125645 = c125626;
                        c125641 = c125625;
                        onClickListener8 = onClickListener5;
                        i41 = i41;
                        C12562 c125679 = c125624;
                        i36 = iM113011;
                        i34 = i17;
                        c125648 = c125679;
                    }
                    break;
                case -840861404:
                case 2022281951:
                    activityC5678.m15666();
                    return z2;
                case -818665391:
                case -504535451:
                    activityC5678.m15662(z);
                    return z3;
                case -810595322:
                case 1303198376:
                    c125624 = c125648;
                    onClickListener5 = onClickListener8;
                    bundle4 = bundle8;
                    c125625 = c125641;
                    c80610 = c80613;
                    c125626 = c125645;
                    spinner4 = spinner7;
                    c125627 = c125647;
                    view4 = view7;
                    C12562 c125680 = c125646;
                    c125642 = (C12562) C3743.m10957(view4, iM113013 ^ 2099379119);
                    iM113011 = ThreadFactoryC3888.m11306(C0797.m3361(f3632, 218, 3, i37)) ^ 2122721347;
                    if (C1066.f4915 <= 0) {
                        c125646 = c125680;
                        int iM113018 = (i32 - ThreadFactoryC3888.m11306("᩺ۨ")) * (-39);
                        i17 = ((iM113018 ^ i33) * 22827) ^ 1472860294;
                        i18 = iM113018 ^ (-1395058120);
                    } else {
                        int iM450221 = C19806.m45029("ۙܿ") ^ i33;
                        i17 = ((iM450221 ^ i32) * 20113) ^ (-1193821590);
                        i18 = iM450221 ^ 1283021898;
                        c125646 = c125680;
                    }
                    view7 = view4;
                    c125647 = c125627;
                    spinner7 = spinner4;
                    c80613 = c80610;
                    bundle8 = bundle4;
                    i35 = i18;
                    c125645 = c125626;
                    c125641 = c125625;
                    onClickListener8 = onClickListener5;
                    i41 = i41;
                    C12562 c1256710 = c125624;
                    i36 = iM113011;
                    i34 = i17;
                    c125648 = c1256710;
                    break;
                case -807655962:
                case -589767298:
                    c125643 = c125643;
                    i36 = i36;
                    c125648 = c125648;
                    onClickListener8 = onClickListener8;
                    bundle8 = bundle8;
                    z = z;
                    i38 = i38;
                    i39 = i39;
                    c125641 = c125641;
                    c80613 = c80613;
                    c125645 = c125645;
                    spinner7 = spinner7;
                    c125642 = c125642;
                    c125647 = c125647;
                    view7 = view7;
                    c125646 = c125646;
                    sArr2 = sArr2;
                    i40 = i40;
                    if (i38 == (C19806.m45029(C2704.m8240(f3632, 179, 3, i37)) ^ 2101517707)) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ۖ") + i32) * (-117);
                        i2 = ((iM11306 ^ i33) * (-15161)) ^ 1243393818;
                        i3 = -751004490;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿ᩵") ^ i33;
                        i2 = ((iM11306 ^ i32) * (-4597)) ^ (-2009255655);
                        i3 = -274162079;
                    }
                    i10 = iM11306 ^ i3;
                    i38 = i38;
                    i40 = i40;
                    c125642 = c125642;
                    c125645 = c125645;
                    c125641 = c125641;
                    onClickListener8 = onClickListener8;
                    sArr2 = sArr2;
                    i39 = i39;
                    z = z;
                    i41 = i41;
                    c125643 = c125643;
                    c125648 = c125648;
                    c125646 = c125646;
                    view7 = view7;
                    c125647 = c125647;
                    spinner7 = spinner7;
                    c80613 = c80613;
                    bundle8 = bundle8;
                    i35 = i10;
                    i34 = i2;
                    i36 = i36;
                    break;
                case -657773378:
                case 1323667544:
                    AbstractC0464.m2309(c80613, iM450214 ^ 2116647834, onClickListener8);
                    C10634.m26830(c80613, ThreadFactoryC3888.m11306(C0278.m1774(f3632, 386, 3, i37)) ^ 2118266382, null);
                    ThreadFactoryC3888.m11299(c80613, false);
                    C8875.m23019(C2704.m8239(c80613));
                    i36 = i36;
                    c125648 = c125648;
                    bundle8 = bundle8;
                    c125643 = c125643;
                    z = z;
                    i38 = i38;
                    i39 = i39;
                    onClickListener8 = onClickListener8;
                    c80613 = c80613;
                    c125641 = c125641;
                    spinner7 = spinner7;
                    c125645 = c125645;
                    c125647 = c125647;
                    view7 = view7;
                    c125646 = c125646;
                    sArr2 = sArr2;
                    c125642 = c125642;
                    i40 = i40;
                    iM11306 = C19806.m45029("ܰܳ") ^ i32;
                    i2 = ((iM11306 ^ i33) * (-18017)) ^ 87297218;
                    i3 = 394514565;
                    i10 = iM11306 ^ i3;
                    i38 = i38;
                    i40 = i40;
                    c125642 = c125642;
                    c125645 = c125645;
                    c125641 = c125641;
                    onClickListener8 = onClickListener8;
                    sArr2 = sArr2;
                    i39 = i39;
                    z = z;
                    i41 = i41;
                    c125643 = c125643;
                    c125648 = c125648;
                    c125646 = c125646;
                    view7 = view7;
                    c125647 = c125647;
                    spinner7 = spinner7;
                    c80613 = c80613;
                    bundle8 = bundle8;
                    i35 = i10;
                    i34 = i2;
                    i36 = i36;
                    break;
                case -648078597:
                case 1921657008:
                    return super.onOptionsItemSelected(menuItem);
                case -436696801:
                case 1595702144:
                    c125643 = c125643;
                    i36 = i36;
                    c12564 = c125648;
                    onClickListener8 = onClickListener8;
                    bundle8 = bundle8;
                    i39 = i39;
                    c125641 = c125641;
                    c80613 = c80613;
                    c125645 = c125645;
                    spinner7 = spinner7;
                    c125642 = c125642;
                    c125647 = c125647;
                    view7 = view7;
                    c125646 = c125646;
                    sArr2 = sArr2;
                    i40 = i40;
                    i38 = i38;
                    if (i38 == (C19806.m45029(C0817.m3406(f3632, 194, 3, i37)) ^ 2098848674)) {
                        iM11308 = (i33 - C19806.m45029("᩵ۗ")) * 29;
                        i8 = ((iM11308 ^ i32) * 10415) ^ 1402139797;
                        i9 = 875432114;
                    } else {
                        iM11308 = C19806.m45029("ܿۜ") ^ i33;
                        i8 = ((iM11308 ^ i32) * (-26599)) ^ (-1467724990);
                        i9 = 1003225694;
                    }
                    i38 = i38;
                    i40 = i40;
                    c125642 = c125642;
                    c125645 = c125645;
                    c125641 = c125641;
                    onClickListener8 = onClickListener8;
                    sArr2 = sArr2;
                    i39 = i39;
                    c125643 = c125643;
                    c125646 = c125646;
                    view7 = view7;
                    c125647 = c125647;
                    spinner7 = spinner7;
                    c80613 = c80613;
                    bundle8 = bundle8;
                    i35 = iM11308 ^ i9;
                    i34 = i8;
                    c125648 = c12564;
                    i36 = i36;
                    break;
                case -367781306:
                case 959035642:
                    this.f3635.m47185(activityC5678);
                    return z2;
                case -208209781:
                case 1959872507:
                    i37 = 33798;
                    iM11306 = ThreadFactoryC3888.m11306("᩷ۘ") ^ i33;
                    i2 = ((iM11306 ^ i32) * (-4281)) ^ 1950107967;
                    i3 = -1120285;
                    i10 = iM11306 ^ i3;
                    i38 = i38;
                    i40 = i40;
                    c125642 = c125642;
                    c125645 = c125645;
                    c125641 = c125641;
                    onClickListener8 = onClickListener8;
                    sArr2 = sArr2;
                    i39 = i39;
                    z = z;
                    i41 = i41;
                    c125643 = c125643;
                    c125648 = c125648;
                    c125646 = c125646;
                    view7 = view7;
                    c125647 = c125647;
                    spinner7 = spinner7;
                    c80613 = c80613;
                    bundle8 = bundle8;
                    i35 = i10;
                    i34 = i2;
                    i36 = i36;
                    break;
                case -106017370:
                case 1565226684:
                    if (C0278.f1572 <= 0) {
                        i19 = i36;
                        c125628 = c125648;
                        view5 = view7;
                        onClickListener6 = onClickListener8;
                        bundle5 = bundle8;
                        c125629 = c125646;
                        c125630 = c125641;
                        c80611 = c80613;
                        c125631 = c125645;
                        spinner5 = spinner7;
                        c125633 = c125642;
                        c125632 = c125647;
                        iM45029 = (i33 - C19806.m45029("ܳۢ")) * (-53);
                        i20 = ((iM45029 ^ i32) * 15747) ^ (-1867300641);
                        i21 = -1317334071;
                        i27 = iM45029 ^ i21;
                        c125648 = c125628;
                        c125642 = c125633;
                        c125645 = c125631;
                        c125647 = c125632;
                        c125646 = c125629;
                        c125641 = c125630;
                        spinner7 = spinner5;
                        c80613 = c80611;
                        onClickListener8 = onClickListener6;
                        bundle8 = bundle5;
                        i36 = i19;
                        view7 = view5;
                        i35 = i27;
                        i34 = i20;
                    } else {
                        c125634 = c125643;
                        i22 = i36;
                        c125639 = c125648;
                        view6 = view7;
                        c80612 = c80613;
                        c125635 = c125646;
                        c125636 = c125647;
                        spinner6 = spinner7;
                        bundle6 = bundle8;
                        c125637 = c125645;
                        c125638 = c125642;
                        c22074 = c22075;
                        DialogInterface.OnClickListener onClickListener15 = onClickListener8;
                        c125641 = c125641;
                        onClickListener7 = onClickListener15;
                        iM450210 = C19806.m45029("᩷ۧ") ^ i33;
                        i23 = ((iM450210 ^ i32) * 26417) ^ (-1765406444);
                        i24 = 1656346346;
                        i35 = iM450210 ^ i24;
                        c22075 = c22074;
                        c125642 = c125638;
                        c125645 = c125637;
                        c125647 = c125636;
                        bundle8 = bundle6;
                        c125646 = c125635;
                        spinner7 = spinner6;
                        i41 = i41;
                        view7 = view6;
                        c80613 = c80612;
                        i34 = i23;
                        c125648 = c125639;
                        c125643 = c125634;
                        i36 = i22;
                        C12562 c1256512 = c125641;
                        onClickListener8 = onClickListener7;
                        c125641 = c1256512;
                    }
                    break;
                case -69072256:
                case 1599972228:
                    c125643 = c125643;
                    i36 = i36;
                    c12564 = c125648;
                    onClickListener8 = onClickListener8;
                    bundle8 = bundle8;
                    i38 = i38;
                    i39 = i39;
                    c125641 = c125641;
                    c80613 = c80613;
                    c125645 = c125645;
                    spinner7 = spinner7;
                    c125642 = c125642;
                    c125647 = c125647;
                    view7 = view7;
                    c125646 = c125646;
                    sArr2 = sArr2;
                    i40 = i40;
                    if (this.f3635 == null) {
                        c125648 = c12564;
                        z = z;
                        iM11306 = C19806.m45029("ܰܳ") ^ i32;
                        i2 = ((iM11306 ^ i33) * (-18017)) ^ 87297218;
                        i3 = 394514565;
                        i10 = iM11306 ^ i3;
                        i38 = i38;
                        i40 = i40;
                        c125642 = c125642;
                        c125645 = c125645;
                        c125641 = c125641;
                        onClickListener8 = onClickListener8;
                        sArr2 = sArr2;
                        i39 = i39;
                        z = z;
                        i41 = i41;
                        c125643 = c125643;
                        c125648 = c125648;
                        c125646 = c125646;
                        view7 = view7;
                        c125647 = c125647;
                        spinner7 = spinner7;
                        c80613 = c80613;
                        bundle8 = bundle8;
                        i35 = i10;
                        i34 = i2;
                        i36 = i36;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("᩺֡") ^ i33;
                        i8 = ((iM11308 ^ i32) * 19135) ^ 543643403;
                        i9 = -355418697;
                        i38 = i38;
                        i40 = i40;
                        c125642 = c125642;
                        c125645 = c125645;
                        c125641 = c125641;
                        onClickListener8 = onClickListener8;
                        sArr2 = sArr2;
                        i39 = i39;
                        c125643 = c125643;
                        c125646 = c125646;
                        view7 = view7;
                        c125647 = c125647;
                        spinner7 = spinner7;
                        c80613 = c80613;
                        bundle8 = bundle8;
                        i35 = iM11308 ^ i9;
                        i34 = i8;
                        c125648 = c12564;
                        i36 = i36;
                    }
                    break;
                case 198652819:
                case 275464451:
                    c125643 = c125643;
                    i36 = i36;
                    c125648 = c125648;
                    onClickListener8 = onClickListener8;
                    bundle8 = bundle8;
                    z = z;
                    i38 = i38;
                    i39 = i39;
                    c125641 = c125641;
                    c80613 = c80613;
                    c125645 = c125645;
                    spinner7 = spinner7;
                    c125642 = c125642;
                    c125647 = c125647;
                    view7 = view7;
                    c125646 = c125646;
                    sArr2 = sArr2;
                    i40 = i40;
                    if (this.f3635 == null) {
                        iM11306 = C19806.m45029("ܰܳ") ^ i32;
                        i2 = ((iM11306 ^ i33) * (-18017)) ^ 87297218;
                        i3 = 394514565;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ֨") ^ i33;
                        i2 = ((iM11306 ^ i32) * 29369) ^ (-2043877936);
                        i3 = -799664824;
                    }
                    i10 = iM11306 ^ i3;
                    i38 = i38;
                    i40 = i40;
                    c125642 = c125642;
                    c125645 = c125645;
                    c125641 = c125641;
                    onClickListener8 = onClickListener8;
                    sArr2 = sArr2;
                    i39 = i39;
                    z = z;
                    i41 = i41;
                    c125643 = c125643;
                    c125648 = c125648;
                    c125646 = c125646;
                    view7 = view7;
                    c125647 = c125647;
                    spinner7 = spinner7;
                    c80613 = c80613;
                    bundle8 = bundle8;
                    i35 = i10;
                    i34 = i2;
                    i36 = i36;
                    break;
                case 735227479:
                case 1628936784:
                    if (C0216.f1393 == 0) {
                        c125634 = c125643;
                        i22 = i36;
                        c125639 = c125648;
                        view6 = view7;
                        c80612 = c80613;
                        c125635 = c125646;
                        c125636 = c125647;
                        spinner6 = spinner7;
                        bundle6 = bundle8;
                        c125637 = c125645;
                        c125638 = c125642;
                        c22074 = c22075;
                        DialogInterface.OnClickListener onClickListener16 = onClickListener8;
                        c125641 = c125641;
                        onClickListener7 = onClickListener16;
                        iM450210 = C19806.m45029("᩷ۧ") ^ i33;
                        i23 = ((iM450210 ^ i32) * 26417) ^ (-1765406444);
                        i24 = 1656346346;
                        i35 = iM450210 ^ i24;
                        c22075 = c22074;
                        c125642 = c125638;
                        c125645 = c125637;
                        c125647 = c125636;
                        bundle8 = bundle6;
                        c125646 = c125635;
                        spinner7 = spinner6;
                        i41 = i41;
                        view7 = view6;
                        c80613 = c80612;
                        i34 = i23;
                        c125648 = c125639;
                        c125643 = c125634;
                        i36 = i22;
                        C12562 c1256513 = c125641;
                        onClickListener8 = onClickListener7;
                        c125641 = c1256513;
                    } else {
                        iM113012 = ThreadFactoryC3888.m11306("ۜܿ") ^ i33;
                        i28 = ((iM113012 ^ i32) * 21567) ^ 2141760627;
                        i29 = -936519881;
                        i35 = iM113012 ^ i29;
                        i34 = i28;
                        i41 = i41;
                    }
                    break;
                case 737943593:
                case 1351952033:
                    C1875.m6086();
                    C0671.m3008();
                    iM113012 = ThreadFactoryC3888.m11306("ۜܿ") ^ i33;
                    i28 = ((iM113012 ^ i32) * 21567) ^ 2141760627;
                    i29 = -936519881;
                    i35 = iM113012 ^ i29;
                    i34 = i28;
                    i41 = i41;
                    break;
                case 918424657:
                case 1388910380:
                    c12562 = c125643;
                    i13 = i36;
                    c125612 = c125648;
                    view2 = view7;
                    C8067 c80616 = c80613;
                    c125613 = c125646;
                    C12562 c125681 = c125647;
                    spinner2 = spinner7;
                    Bundle bundle13 = bundle8;
                    C12562 c125682 = c125645;
                    c125616 = c125642;
                    DialogInterface.OnClickListener onClickListener17 = onClickListener8;
                    c125614 = c125641;
                    c8068 = c80616;
                    C22074 c22076 = new C22074(requireContext(), new String[]{strM6085, RunnableC1564.m5344(f3632, 244, 7, i37), MenuItemOnMenuItemClickListenerC3244.m9715(f3632, 251, 7, i37), C3535.m10423(f3632, 258, 7, i37), C0797.m3361(f3632, 265, 7, i37), strM940, strM10790}, C1460.m5054(42.0f));
                    if (RunnableC1606.f6488 >= 0) {
                        c22075 = c22076;
                        onClickListener3 = onClickListener17;
                        bundle2 = bundle13;
                        c125615 = c125682;
                        c125617 = c125681;
                        int iM4502113 = (i32 - C19806.m45029("ᩳ᩵")) * (-71);
                        i30 = ((iM4502113 ^ i33) * (-5845)) ^ (-1784100731);
                        i31 = iM4502113 ^ (-1664841915);
                        c125648 = c125612;
                        c125642 = c125616;
                        c125645 = c125615;
                        c125647 = c125617;
                        c125646 = c125613;
                        c125641 = c125614;
                        spinner7 = spinner2;
                        c80613 = c8068;
                        onClickListener8 = onClickListener3;
                        bundle8 = bundle2;
                        i36 = i13;
                        view7 = view2;
                        i35 = i31;
                        i34 = i30;
                        c125643 = c12562;
                    } else {
                        int iM450222 = C19806.m45029("ۤ᩶") ^ i32;
                        i35 = iM450222 ^ 337368612;
                        i34 = ((iM450222 ^ i33) * 4501) ^ (-928058878);
                        c22075 = c22076;
                        c125642 = c125616;
                        c125645 = c125682;
                        c125647 = c125681;
                        c125646 = c125613;
                        i41 = i41;
                        c125643 = c12562;
                        view7 = view2;
                        c125648 = c125612;
                        i36 = i13;
                        onClickListener8 = onClickListener17;
                        c125641 = c125614;
                        bundle8 = bundle13;
                        spinner7 = spinner2;
                        c80613 = c8068;
                    }
                    break;
                case 1075646833:
                case 1406021993:
                    if (C1461.f5957 <= 0) {
                        c12562 = c125643;
                        i36 = i36;
                        c12564 = c125648;
                        onClickListener = onClickListener8;
                        bundle = bundle8;
                        c12566 = c125641;
                        c8067 = c80613;
                        c12567 = c125645;
                        spinner = spinner7;
                        c12568 = c125642;
                        c12563 = c125647;
                        view = view7;
                        c12565 = c125646;
                        i = i40;
                        int iM4502114 = C19806.m45029("ᩳ֨") ^ i32;
                        i30 = ((iM4502114 ^ i33) * 4985) ^ (-1345737409);
                        i31 = iM4502114 ^ (-744520847);
                        c125648 = c12564;
                        i40 = i;
                        c125642 = c12568;
                        c125645 = c12567;
                        c125641 = c12566;
                        onClickListener8 = onClickListener;
                        sArr2 = sArr2;
                        i39 = i39;
                        i36 = i36;
                        c125646 = c12565;
                        view7 = view;
                        c125647 = c12563;
                        spinner7 = spinner;
                        c80613 = c8067;
                        bundle8 = bundle;
                        i35 = i31;
                        i34 = i30;
                        c125643 = c12562;
                    }
                    c12562 = c125643;
                    i13 = i36;
                    c125612 = c125648;
                    view2 = view7;
                    onClickListener3 = onClickListener8;
                    bundle2 = bundle8;
                    c125613 = c125646;
                    c125614 = c125641;
                    c8068 = c80613;
                    c125615 = c125645;
                    spinner2 = spinner7;
                    c125616 = c125642;
                    c125617 = c125647;
                    int iM4502115 = (i32 - C19806.m45029("ᩳ᩵")) * (-71);
                    i30 = ((iM4502115 ^ i33) * (-5845)) ^ (-1784100731);
                    i31 = iM4502115 ^ (-1664841915);
                    c125648 = c125612;
                    c125642 = c125616;
                    c125645 = c125615;
                    c125647 = c125617;
                    c125646 = c125613;
                    c125641 = c125614;
                    spinner7 = spinner2;
                    c80613 = c8068;
                    onClickListener8 = onClickListener3;
                    bundle8 = bundle2;
                    i36 = i13;
                    view7 = view2;
                    i35 = i31;
                    i34 = i30;
                    c125643 = c12562;
                    break;
                case 1155946107:
                case 1367998485:
                    if (!C1377.f5749) {
                        c125618 = c125643;
                        i14 = i36;
                        c125623 = c125647;
                        c125622 = c125641;
                        view3 = view7;
                        onClickListener4 = onClickListener8;
                        bundle3 = bundle8;
                        c125620 = c125646;
                        c125619 = c125645;
                        c8069 = c80613;
                        c125621 = c125642;
                        spinner3 = spinner7;
                        iM113010 = ThreadFactoryC3888.m11306("۬ۢ") ^ i33;
                        i15 = ((iM113010 ^ i32) * (-16333)) ^ (-632439845);
                        i16 = 142908901;
                        int i53 = iM113010 ^ i16;
                        c125646 = c125620;
                        spinner7 = spinner3;
                        c80613 = c8069;
                        onClickListener8 = onClickListener4;
                        bundle8 = bundle3;
                        i41 = i41;
                        i35 = i53;
                        view7 = view3;
                        i36 = i14;
                        c125647 = c125623;
                        c125643 = c125618;
                        C12562 c1256711 = c125619;
                        c125641 = c125622;
                        i34 = i15;
                        c125642 = c125621;
                        c125645 = c1256711;
                    } else {
                        iM113012 = (i32 - C19806.m45029("ۧܳ")) * 33;
                        i28 = ((iM113012 ^ i33) * (-26137)) ^ 1810494170;
                        i29 = -604992657;
                        i35 = iM113012 ^ i29;
                        i34 = i28;
                        i41 = i41;
                    }
                    break;
                default:
                    c125643 = c125643;
                    i36 = i36;
                    c125648 = c125648;
                    onClickListener2 = onClickListener8;
                    bundle8 = bundle8;
                    i4 = i38;
                    i5 = i39;
                    c12569 = c125641;
                    c80613 = c80613;
                    c125610 = c125645;
                    spinner7 = spinner7;
                    c125611 = c125642;
                    c125647 = c125647;
                    view7 = view7;
                    c125646 = c125646;
                    sArr = sArr2;
                    i6 = i40;
                    z = false;
                    if (i4 == (C19806.m45029(C3286.m9788(f3632, 185, 3, i37)) ^ 2103237820)) {
                        iM11307 = (ThreadFactoryC3888.m11306("֫᩶") + i33) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i2 = ((iM11307 ^ i32) * (-12653)) ^ (-1461355365);
                        i7 = 1876444219;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("֫ܶ") ^ i32;
                        i2 = ((iM11307 ^ i33) * 15001) ^ 281990459;
                        i7 = 1397992303;
                    }
                    i10 = iM11307 ^ i7;
                    i38 = i4;
                    i40 = i6;
                    c125642 = c125611;
                    c125645 = c125610;
                    c125641 = c12569;
                    onClickListener8 = onClickListener2;
                    sArr2 = sArr;
                    i39 = i5;
                    i41 = i41;
                    c125643 = c125643;
                    c125648 = c125648;
                    c125646 = c125646;
                    view7 = view7;
                    c125647 = c125647;
                    spinner7 = spinner7;
                    c80613 = c80613;
                    bundle8 = bundle8;
                    i35 = i10;
                    i34 = i2;
                    i36 = i36;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3607(C0906 c0906, Bundle bundle, Spinner spinner, C12562 c12562, C12562 c12563, C12562 c12564, C12562 c12565, C12562 c12566, C12562 c12567, C12562 c12568) {
        int iM11306;
        int i;
        int i2;
        short[] sArr;
        int i3;
        int iM11307;
        int i4;
        int i5;
        int iM11308;
        int i6;
        int i7;
        Bundle bundle2 = bundle;
        int i8 = C3577.f13150;
        int i9 = C1937.f7317;
        int iM45029 = C19806.m45029("ܿۡ") ^ i9;
        int i10 = ((iM45029 ^ i8) * (-30519)) ^ (-2018752787);
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        int i11 = iM45029 ^ (-1296262010);
        boolean zM6229 = false;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        boolean z = false;
        int i21 = -835210656;
        int i22 = 0;
        while (true) {
            i21 = i11 ^ (i10 & (((i21 ^ i8) * 541) >> 31));
            switch (i21) {
                case -2000394623:
                case -916878958:
                    RunnableC1606.m5473();
                    C2788.m8472();
                    iM11306 = C19806.m45029("֡۫") ^ i9;
                    i = ((iM11306 ^ i8) * 15499) ^ 132308626;
                    i2 = 558829192;
                    i11 = iM11306 ^ i2;
                    i10 = i;
                    break;
                case -1831217464:
                case 1444474621:
                    short[] sArr8 = sArr2;
                    boolean z2 = zM6229;
                    AbstractC0464.m2314(bundle2, C0962.m3747(sArr8, i20, 13, i12), C0629.m2909(c12562));
                    sArr3 = f3632;
                    i22 = 67;
                    if (C1419.m4973()) {
                        sArr2 = sArr8;
                        zM6229 = z2;
                        sArr3 = sArr3;
                        sArr7 = sArr7;
                        int iM11309 = ThreadFactoryC3888.m11306("۬ܺ") ^ i8;
                        int i23 = ((iM11309 ^ i9) * (-275)) ^ (-1393942964);
                        i11 = iM11309 ^ (-544662161);
                        sArr2 = sArr2;
                        sArr7 = sArr7;
                        i10 = i23;
                        sArr3 = sArr3;
                        bundle2 = bundle;
                    } else {
                        int iM450210 = C19806.m45029("ۢۨ") ^ i9;
                        i11 = iM450210 ^ 1070933550;
                        i10 = ((iM450210 ^ i8) * (-23137)) ^ 275485374;
                        zM6229 = z2;
                        sArr2 = sArr8;
                    }
                    break;
                case -1774663761:
                case -906356546:
                    zM6229 = zM6229;
                    sArr3 = sArr3;
                    sArr7 = sArr7;
                    bundle2.putInt(C1937.m6288(f3632, 39, 15, i12), spinner.getSelectedItemPosition());
                    sArr2 = f3632;
                    i20 = 54;
                    if (C7105.f23796 >= 0) {
                        iM11308 = C19806.m45029("ۘܿ") ^ i9;
                        i6 = ((iM11308 ^ i8) * (-3435)) ^ (-170985874);
                        i7 = -1835196839;
                    } else {
                        iM11308 = (i9 - ThreadFactoryC3888.m11306("ۤ۬")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i6 = ((iM11308 ^ i8) * (-21387)) ^ (-199112443);
                        i7 = 1252217579;
                    }
                    i11 = iM11308 ^ i7;
                    zM6229 = zM6229;
                    sArr2 = sArr2;
                    i10 = i6;
                    sArr7 = sArr7;
                    sArr3 = sArr3;
                    break;
                case -1341365379:
                case -515954501:
                    sArr2 = sArr2;
                    sArr3 = sArr3;
                    zM6229 = zM6229;
                    sArr7 = sArr7;
                    if (C2124.m6673() > 0) {
                        iM11308 = C19806.m45029("᩻ܶ") ^ i8;
                        i6 = ((iM11308 ^ i9) * 1145) ^ (-414176594);
                        i7 = 1980528182;
                        i11 = iM11308 ^ i7;
                        zM6229 = zM6229;
                        sArr2 = sArr2;
                        i10 = i6;
                        sArr7 = sArr7;
                        sArr3 = sArr3;
                    } else {
                        zM6229 = zM6229;
                        int iM113010 = ThreadFactoryC3888.m11306("۬ܺ") ^ i8;
                        int i24 = ((iM113010 ^ i9) * (-275)) ^ (-1393942964);
                        i11 = iM113010 ^ (-544662161);
                        sArr2 = sArr2;
                        sArr7 = sArr7;
                        i10 = i24;
                        sArr3 = sArr3;
                        bundle2 = bundle;
                    }
                    break;
                case -1133057988:
                case 959972150:
                    C1460.m5053(bundle2, C2249.m6918(sArr7, i13, i14, i12), ViewGroupOnHierarchyChangeListenerC1916.m6229(c12567));
                    c0906.f3635.m16566();
                    zM6229 = ViewGroupOnHierarchyChangeListenerC1916.m6229(c12568);
                    if (C10634.f36300 >= 0) {
                        sArr2 = sArr2;
                        sArr3 = sArr3;
                        sArr7 = sArr7;
                        int iM113011 = ThreadFactoryC3888.m11306("۬ܺ") ^ i8;
                        int i25 = ((iM113011 ^ i9) * (-275)) ^ (-1393942964);
                        i11 = iM113011 ^ (-544662161);
                        sArr2 = sArr2;
                        sArr7 = sArr7;
                        i10 = i25;
                        sArr3 = sArr3;
                        bundle2 = bundle;
                    } else {
                        int iM113012 = ThreadFactoryC3888.m11306("᩸֫") ^ i8;
                        i10 = ((iM113012 ^ i9) * (-1023)) ^ 808802929;
                        i11 = iM113012 ^ (-574874786);
                    }
                    break;
                case -1123245914:
                case -915470419:
                    C1460.m5053(bundle2, C2124.m6685(sArr4, i15, i16, i12), C0629.m2909(c12564));
                    sArr5 = f3632;
                    i17 = 90;
                    if (C0216.m1591() > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳᩴ") ^ i9;
                        i = ((iM11306 ^ i8) * (-17587)) ^ (-1205162251);
                        i2 = -615931023;
                        i11 = iM11306 ^ i2;
                        i10 = i;
                    } else {
                        sArr = sArr4;
                        sArr3 = sArr3;
                        i3 = i22;
                        int iM113013 = ThreadFactoryC3888.m11306("ۖ֫") ^ i8;
                        short[] sArr9 = sArr;
                        i10 = ((iM113013 ^ i9) * (-14839)) ^ (-540909828);
                        i22 = i3;
                        sArr4 = sArr9;
                        i11 = iM113013 ^ 1419942446;
                        sArr3 = sArr3;
                    }
                    break;
                case -1096122720:
                case 727614950:
                    i12 = 53108;
                    iM11308 = (C19806.m45029("ۢ֫") + i8) * 99;
                    i6 = ((iM11308 ^ i9) * (-8131)) ^ (-437022396);
                    i7 = 340738602;
                    i11 = iM11308 ^ i7;
                    zM6229 = zM6229;
                    sArr2 = sArr2;
                    i10 = i6;
                    sArr7 = sArr7;
                    sArr3 = sArr3;
                    break;
                case -889991537:
                case -29596799:
                    CallableC1627.m5507();
                    C0962.m3746();
                    break;
                case -888259442:
                case 1162117874:
                    C0050.m946();
                    if (C2871.f10837 >= 0) {
                        sArr2 = sArr2;
                        sArr3 = sArr3;
                        zM6229 = zM6229;
                        sArr7 = sArr7;
                        iM11308 = (C19806.m45029("᩶۟") + i8) * (-7);
                        i6 = ((iM11308 ^ i9) * 17209) ^ (-116137030);
                        i7 = 1284044573;
                        i11 = iM11308 ^ i7;
                        zM6229 = zM6229;
                        sArr2 = sArr2;
                        i10 = i6;
                        sArr7 = sArr7;
                        sArr3 = sArr3;
                    } else {
                        iM11306 = C19806.m45029("֡۫") ^ i9;
                        i = ((iM11306 ^ i8) * 15499) ^ 132308626;
                        i2 = 558829192;
                        i11 = iM11306 ^ i2;
                        i10 = i;
                    }
                    break;
                case -887611181:
                case 1931591481:
                    i12 = 30326;
                    iM11308 = (C19806.m45029("ۢ֫") + i8) * 99;
                    i6 = ((iM11308 ^ i9) * (-8131)) ^ (-437022396);
                    i7 = 340738602;
                    i11 = iM11308 ^ i7;
                    zM6229 = zM6229;
                    sArr2 = sArr2;
                    i10 = i6;
                    sArr7 = sArr7;
                    sArr3 = sArr3;
                    break;
                case -865349605:
                case 821467261:
                    AbstractC0464.m2314(bundle2, ThreadFactoryC3888.m11312(sArr5, i17, 15, i12), ViewGroupOnHierarchyChangeListenerC1916.m6229(c12565));
                    sArr6 = f3632;
                    i18 = IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i19 = 12;
                    if (C1875.m6086() != 0) {
                        iM11306 = C19806.m45029("֡۫") ^ i9;
                        i = ((iM11306 ^ i8) * 15499) ^ 132308626;
                        i2 = 558829192;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛ֫") ^ i8) * (-69);
                        i = ((iM11306 ^ i9) * (-22013)) ^ 1113760652;
                        i2 = 417414688;
                    }
                    i11 = iM11306 ^ i2;
                    i10 = i;
                    break;
                case -831585816:
                case 1027864855:
                    if (C2871.f10837 < 0) {
                        sArr2 = sArr2;
                        sArr3 = sArr3;
                        zM6229 = zM6229;
                        sArr7 = sArr7;
                        iM11308 = C19806.m45029("ۘܿ") ^ i9;
                        i6 = ((iM11308 ^ i8) * (-3435)) ^ (-170985874);
                        i7 = -1835196839;
                        i11 = iM11308 ^ i7;
                        zM6229 = zM6229;
                        sArr2 = sArr2;
                        i10 = i6;
                        sArr7 = sArr7;
                        sArr3 = sArr3;
                    }
                    sArr2 = sArr2;
                    sArr3 = sArr3;
                    zM6229 = zM6229;
                    sArr7 = sArr7;
                    iM11308 = (C19806.m45029("᩶۟") + i8) * (-7);
                    i6 = ((iM11308 ^ i9) * 17209) ^ (-116137030);
                    i7 = 1284044573;
                    i11 = iM11308 ^ i7;
                    zM6229 = zM6229;
                    sArr2 = sArr2;
                    i10 = i6;
                    sArr7 = sArr7;
                    sArr3 = sArr3;
                    break;
                case -731279611:
                case 856656435:
                    sArr3 = sArr3;
                    i3 = i22;
                    AbstractC0464.m2314(bundle2, C2249.m6918(sArr3, i3, 11, i12), ViewGroupOnHierarchyChangeListenerC1916.m6229(c12563));
                    sArr = f3632;
                    i16 = 12;
                    if (C1148.f5161 <= 0) {
                        i15 = 78;
                        int iM113014 = ThreadFactoryC3888.m11306("ۖ֫") ^ i8;
                        short[] sArr10 = sArr;
                        i10 = ((iM113014 ^ i9) * (-14839)) ^ (-540909828);
                        i22 = i3;
                        sArr4 = sArr10;
                        i11 = iM113014 ^ 1419942446;
                        sArr3 = sArr3;
                    } else {
                        int iM450211 = (C19806.m45029("ۢۖ") ^ i8) * (-17);
                        int i26 = ((iM450211 ^ i9) * (-25083)) ^ 563976287;
                        i22 = i3;
                        i11 = iM450211 ^ 1899461764;
                        sArr4 = sArr;
                        sArr3 = sArr3;
                        i10 = i26;
                        i15 = 78;
                    }
                    break;
                case -562372542:
                case 1198678846:
                    C1679.m5597(ApplicationC0716.f2992, C2704.m8240(f3632, 131, 4, i12), zM6229);
                    break;
                case -322828162:
                case 1820457645:
                    sArr2 = sArr2;
                    sArr3 = sArr3;
                    zM6229 = zM6229;
                    sArr7 = sArr7;
                    short s = f3632[38];
                    if (((s * s) + 54081316) - (s * 14708) >= 0) {
                        iM11308 = ThreadFactoryC3888.m11306("۟֨") ^ i9;
                        i6 = ((iM11308 ^ i8) * 27211) ^ (-46802309);
                        i7 = -1058919902;
                    } else {
                        iM11308 = C19806.m45029("ᩴ᩹") ^ i8;
                        i6 = ((iM11308 ^ i9) * 23213) ^ 1360109237;
                        i7 = -370166801;
                    }
                    i11 = iM11308 ^ i7;
                    zM6229 = zM6229;
                    sArr2 = sArr2;
                    i10 = i6;
                    sArr7 = sArr7;
                    sArr3 = sArr3;
                    break;
                case -150911956:
                case 819107225:
                    sArr2 = sArr2;
                    sArr3 = sArr3;
                    zM6229 = zM6229;
                    sArr7 = sArr7;
                    if (!z) {
                        iM11307 = ThreadFactoryC3888.m11306("ܺۘ") ^ i9;
                        i4 = ((iM11307 ^ i8) * (-18197)) ^ (-680140705);
                        i5 = -336023065;
                        i11 = iM11307 ^ i5;
                        bundle2 = bundle;
                        sArr7 = sArr7;
                        sArr3 = sArr3;
                        boolean z3 = zM6229;
                        sArr2 = sArr2;
                        i10 = i4;
                        zM6229 = z3;
                    } else {
                        zM6229 = zM6229;
                        int iM113015 = ThreadFactoryC3888.m11306("۬ܺ") ^ i8;
                        int i27 = ((iM113015 ^ i9) * (-275)) ^ (-1393942964);
                        i11 = iM113015 ^ (-544662161);
                        sArr2 = sArr2;
                        sArr7 = sArr7;
                        i10 = i27;
                        sArr3 = sArr3;
                        bundle2 = bundle;
                    }
                    break;
                case -146445653:
                case 4465236:
                    sArr2 = sArr2;
                    sArr3 = sArr3;
                    zM6229 = zM6229;
                    sArr7 = sArr7;
                    if (C1937.f7317 >= 0) {
                        iM11308 = (C19806.m45029("᩶۟") + i8) * (-7);
                        i6 = ((iM11308 ^ i9) * 17209) ^ (-116137030);
                        i7 = 1284044573;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("ܰ᩺") ^ i9;
                        i6 = ((iM11308 ^ i8) * 11283) ^ (-1411577510);
                        i7 = 176399516;
                    }
                    i11 = iM11308 ^ i7;
                    zM6229 = zM6229;
                    sArr2 = sArr2;
                    i10 = i6;
                    sArr7 = sArr7;
                    sArr3 = sArr3;
                    break;
                case 1083111408:
                case 2032250963:
                    if (C3660.f13403 >= 0) {
                        sArr2 = sArr2;
                        sArr3 = sArr3;
                        sArr7 = sArr7;
                        int iM113016 = ThreadFactoryC3888.m11306("۬ܺ") ^ i8;
                        int i28 = ((iM113016 ^ i9) * (-275)) ^ (-1393942964);
                        i11 = iM113016 ^ (-544662161);
                        sArr2 = sArr2;
                        sArr7 = sArr7;
                        i10 = i28;
                        sArr3 = sArr3;
                        bundle2 = bundle;
                    } else {
                        iM11306 = C19806.m45029("֡۫") ^ i9;
                        i = ((iM11306 ^ i8) * 15499) ^ 132308626;
                        i2 = 558829192;
                        i11 = iM11306 ^ i2;
                        i10 = i;
                    }
                    break;
                case 1493175913:
                case 1713933080:
                    sArr2 = sArr2;
                    sArr3 = sArr3;
                    zM6229 = zM6229;
                    sArr7 = sArr7;
                    z = C0962.f3784;
                    iM11307 = (i8 - ThreadFactoryC3888.m11306("ۡۢ")) * (-85);
                    i4 = ((iM11307 ^ i9) * (-13057)) ^ (-945767616);
                    i5 = 1831032138;
                    i11 = iM11307 ^ i5;
                    bundle2 = bundle;
                    sArr7 = sArr7;
                    sArr3 = sArr3;
                    boolean z4 = zM6229;
                    sArr2 = sArr2;
                    i10 = i4;
                    zM6229 = z4;
                    break;
                default:
                    AbstractC0464.m2314(bundle2, C2704.m8240(sArr6, i18, i19, i12), C0629.m2909(c12566));
                    sArr7 = f3632;
                    i13 = BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i14 = 14;
                    if (!C0962.f3784) {
                        iM11306 = C19806.m45029("۫ۖ") ^ i9;
                        i = ((iM11306 ^ i8) * 12567) ^ 2052234889;
                        i2 = 1472872474;
                        i11 = iM11306 ^ i2;
                        i10 = i;
                    } else {
                        sArr = sArr4;
                        sArr3 = sArr3;
                        i3 = i22;
                        int iM113017 = ThreadFactoryC3888.m11306("ۖ֫") ^ i8;
                        short[] sArr11 = sArr;
                        i10 = ((iM113017 ^ i9) * (-14839)) ^ (-540909828);
                        i22 = i3;
                        sArr4 = sArr11;
                        i11 = iM113017 ^ 1419942446;
                        sArr3 = sArr3;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:81:0x02c8 A[PHI: r10 r11
      0x02c8: PHI (r10v4 short[]) = (r10v3 short[]), (r10v2 short[]) binds: [B:78:0x02af, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x02c8: PHI (r11v4 char) = (r11v3 char), (r11v2 char) binds: [B:78:0x02af, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x0332  */
    /* JADX WARN: Code duplicated, block: B:97:0x0366  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        if (l.C1461.f5957 > 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0059, code lost:
    
        if (l.C0817.f3443 == false) goto L10;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m3611(l.C0906 r20, boolean[] r21, java.lang.String[] r22, l.DialogInterfaceC19356 r23, l.ActivityC5677 r24) {
        /*
            Method dump skipped, instruction units count: 1258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0906.m3611(l.֨ۚۜ, boolean[], java.lang.String[], l.᩵ۡۜ, l.ۚ᩻ۘ):void");
    }
}
