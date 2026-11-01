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
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.ۛۗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q62Z */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC5788 extends AbstractActivityC12483 implements AdapterView.OnItemLongClickListener, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ֡᩻ܶ, reason: not valid java name and contains not printable characters */
    private static final short[] f19653 = {345, 17050, 17052, 17039, 17024, 17053, 17118, 2589, 338, 848, -6807, -1362, -4115, -3679, 16377, -3968, 6234, 10038, 4554, 1903, -3537, 16202, -7273, 6479, 11733, 3067, 9380, -21193, 25582, -30844, 5175, -10265, -11194, 10659, -10953, -12897, 15298, -16231, -1718, -11347, -10951, -11202, -15145, -16211, 15195, -3549, 10651, -3521, 8359, 9804, 7719, -2006, -2798, 2704, -15811, -1132, 491, 7944, 1836, -12140, 3037, -7601, 2348, -11751, 5279, -12614, -13381, -13387, -8549, -15497, 8373, -22935, -22925, 665, 24203, 24194, 24223, 24207, 24196, 24201, 24242, 24217, 24196, 24221, 24242, 24206, 24197, 24200, 24206, 24198, 24242, 24217, 24223, 24204, 24195, 24222, 24193, 24204, 24217, 24196, 24194, 24195, 24242, 24203, 24194, 24223, 24192, 24204, 24217, 24242, 24206, 24194, 24195, 24217, 24223, 24194, 24193, -10769, 11302, -13382, 3775, -29320, -26696, -32281, 29085, 29682, -29639, 26520, -32304, 26060, -17114, 26750, -17053, -17315, -18739, -20056, -27545, -31233, -26781, 31734, 27584, 31082, 25263, 30961, 28567, -31404, 32080, 30840, -5927, -5922, -5941, -5922, -5937, -5915, -5919, -5922, -5928, -5941, -5948, -5927, -5946, -5941, -5922, -5949, -5947, -5948, -5899, -5945, -5947, -5938, -5937, -5899, -5927, -5947, -5928, -5922, -5937, -5938, 6583, -14001, -12182, 10597, 9438, -10516, 11965, -8375, -11174, 13243, 2359, 17427, -22767, -20250, 16732, -25016, -32687, -32428, 21110, -19831, 23985, -22271, -16468, -20696, -17237, -25647, -17047, 20513, 16613, -25086, -25536, 19428, -24909, -18262, -23810, 21694, -24439, -21300, -24978, -26136, -22688, 24247, -21897, -19297, -25462, 18445, 20043, 19405, -18338, -20222, -24207, -20814, -21351, -22961, -21995, -19538, -21364, 18823, -28447, -24795, 24008, -24322, -12499, -12506, -12501, -12499, -12507, -12527, -12486, -12484, -12497, -12512, -12483, -12510, -12497, -12486, -12505, -12511, -12512, -12527, -12504, -12511, -12484, -12509, -12497, -12486, -12527, -12499, -12511, -12512, -12486, -12484, -12511, -12510, -12504, -12511, -12484, -12500, -12505, -12502, -12527, -12486, -12505, -12482, -12527, 19908, -25095, -17373, 23188, -26602, -22658, -20001, -19154, -20846, -27766, -26631, -24966, 24213, -20791, 19697, -18798, -20097, -25535, -12486, -12484, -12497, -12512, -12483, -12510, -12497, -12486, -12505, -12511, -12512, -12527, -12509, -12511, -12502, -12501, -12527, -12483, -12511, -12484, -12486, -12501, -12502, -23121, -19980, -32554, 383, -14631, -14626, -14645, -14626, -14641, -14619, -14623, 7480, -4378, 15330, -12910, 2114, 11848, 11847, 11850, 11847};

    /* JADX INFO: renamed from: ܺܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f19654 = 0;

    /* JADX INFO: renamed from: ᩶ܰ, reason: not valid java name and contains not printable characters */
    public static final AbstractC20745 f19655;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public boolean f19656;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public C17077 f19657;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public boolean f19658;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public C7935 f19659;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public int f19660;

    /* JADX INFO: renamed from: ۟ܰ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceOnDismissListenerC8913 f19661;

    /* JADX INFO: renamed from: ۠ܰ, reason: not valid java name and contains not printable characters */
    public C9186 f19662;

    /* JADX INFO: renamed from: ۡܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f19663;

    /* JADX INFO: renamed from: ۤܰ, reason: not valid java name and contains not printable characters */
    public String f19664;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public int[] f19665;

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f19666;

    /* JADX INFO: renamed from: ᩳܰ, reason: not valid java name and contains not printable characters */
    public int f19667;

    /* JADX INFO: renamed from: ᩴܰ, reason: not valid java name and contains not printable characters */
    public boolean f19668;

    /* JADX INFO: renamed from: ᩵ܰ, reason: not valid java name and contains not printable characters */
    public boolean f19669;

    /* JADX INFO: renamed from: ᩷ܰ, reason: not valid java name and contains not printable characters */
    public int f19670;

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f19671;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public int f19672;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public boolean f19673;

    /* JADX INFO: renamed from: ֨ۙ */
    public boolean mo8785() {
        return false;
    }

    /* JADX INFO: renamed from: ۖ */
    public CharSequence mo8787(String str) {
        return str;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void mo15951(int i) {
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo1989(RunnableC18488 runnableC18488);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo1990(boolean z);

    /* JADX INFO: renamed from: ۙۙ */
    public String mo8788() {
        return null;
    }

    /* JADX INFO: renamed from: ۨ */
    public boolean mo8790(String str) {
        return true;
    }

    /* JADX INFO: renamed from: ۨۙ */
    public boolean mo8791() {
        return false;
    }

    /* JADX INFO: renamed from: ܳ */
    public boolean mo8792() {
        return false;
    }

    /* JADX INFO: renamed from: ᩹ۙ */
    public abstract void mo1991();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void m15938(boolean z) {
        C9186 c9186 = null;
        boolean z2 = false;
        int i = 0;
        Iterator itM9863 = null;
        int i2 = -1743924833;
        int i3 = C3535.f13026;
        int i4 = C2249.f8050;
        int iM11306 = ThreadFactoryC3888.m11306("᩷ۤ") ^ i4;
        int i5 = ((iM11306 ^ i3) * (-8079)) ^ (-1011874070);
        int i6 = -1544370671;
        while (true) {
            int i7 = iM11306 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i3) * 11761) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2096819149:
                    case -501985160:
                        if (C10634.f36300 < 0) {
                            iM11306 = (C19806.m45029("᩶᩷") + i4) * (-111);
                            i5 = ((iM11306 ^ i3) * 27867) ^ (-10060600);
                            i6 = 1944546539;
                        } else {
                            iM11306 = C19806.m45029("ܺܺ") ^ i4;
                            i5 = ((iM11306 ^ i3) * 4675) ^ 1076800084;
                            i6 = 1706544469;
                        }
                        break;
                    case -2044991975:
                    case 895793745:
                        ((C22722) C0216.m1584(itM9863)).m50370(z2);
                        iM11306 = C19806.m45029("ۢ᩶") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-21793)) ^ (-1219475406);
                        i6 = -2006750129;
                        break;
                    case -1947210351:
                    case 63721326:
                        this.f19668 = z;
                        c9186 = this.f19662;
                        if (C0629.f2722 > 0) {
                            iM11306 = C19806.m45029("ۙ᩹") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-18547)) ^ 122698331;
                            i6 = -1594062148;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ۡ۟") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-21745)) ^ (-2000579625);
                            i6 = -2127615574;
                        }
                        break;
                    case -1896078518:
                    case 2031538761:
                        if (this.f19667 <= 0) {
                            z2 = false;
                            iM11306 = (ThreadFactoryC3888.m11306("ۧ᩷") ^ i4) * (-71);
                            i5 = ((iM11306 ^ i3) * 32473) ^ 399708235;
                            i6 = -550731734;
                        }
                        int iM11307 = (i3 - ThreadFactoryC3888.m11306("۬ۚ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM11307 ^ i4) * 16627) ^ 1777224386;
                        i7 = iM11307 ^ 1689710681;
                        z2 = false;
                        break;
                        break;
                    case -1650413595:
                    case 1715523433:
                        i = -1;
                        if (C10634.f36300 < 0) {
                            iM11306 = C19806.m45029("ۨ֨") ^ i4;
                            i5 = ((iM11306 ^ i3) * 29055) ^ 508778659;
                            i6 = 1997083518;
                        } else {
                            iM11306 = C19806.m45029("ۤ᩻") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-23893)) ^ 257419138;
                            i6 = 221399571;
                        }
                        break;
                    case -1636033879:
                    case -11176000:
                        break;
                    case -1627990259:
                    case -903324207:
                        if (C3286.m9798() > 0) {
                            iM11306 = (C19806.m45029("ܰ᩹") ^ i4) * (-17);
                            i5 = ((iM11306 ^ i3) * (-15365)) ^ 1737000572;
                            i6 = 1040942218;
                        } else {
                            iM11306 = C19806.m45029("ܺܺ") ^ i4;
                            i5 = ((iM11306 ^ i3) * 4675) ^ 1076800084;
                            i6 = 1706544469;
                        }
                        break;
                    case -1565641272:
                    case -14919581:
                        c9186.mo23642(C1148.m4221(z));
                        if (!z) {
                            iM11306 = C19806.m45029("۫ܰ") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-17707)) ^ (-210557029);
                            i6 = -1933339221;
                        } else {
                            iM11306 = (i3 - ThreadFactoryC3888.m11306("᩺ۗ")) * (-11);
                            i5 = ((iM11306 ^ i4) * 28701) ^ 886517875;
                            i6 = -1820139602;
                        }
                        break;
                    case -1512801414:
                    case 450780094:
                        ViewGroupOnHierarchyChangeListenerC1916.m6233();
                        C0629.m2907();
                        iM11306 = ThreadFactoryC3888.m11306("ۡ۟") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-21745)) ^ (-2000579625);
                        i6 = -2127615574;
                        break;
                    case -1243903953:
                    case 1369390416:
                        if (C2642.f10294 > 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("۠ۡ") + i4) * (-29);
                            i5 = ((iM11306 ^ i3) * 1835) ^ 1609661450;
                            i6 = 666098830;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ۡ۟") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-21745)) ^ (-2000579625);
                            i6 = -2127615574;
                        }
                        break;
                    case -1217750575:
                    case -322793438:
                        this.f19672 = i;
                        this.f19667 = z2 ? 1 : 0;
                        iM11306 = C19806.m45029("ۧۨ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-23937)) ^ (-1509378682);
                        i6 = 1060567630;
                    case -1188671853:
                    case 1288068114:
                        if (!z) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۨۜ") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i5 = ((iM11306 ^ i4) * 13407) ^ (-724872637);
                            i6 = -1460230170;
                        } else {
                            iM11306 = C19806.m45029("ۧۨ") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-23937)) ^ (-1509378682);
                            i6 = 1060567630;
                        }
                        break;
                    case -1177509231:
                    case 320145118:
                        if (C1875.m6086() == 0) {
                            iM11306 = C19806.m45029("ܺܺ") ^ i4;
                            i5 = ((iM11306 ^ i3) * 4675) ^ 1076800084;
                            i6 = 1706544469;
                            break;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("ۡ۟") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-21745)) ^ (-2000579625);
                        i6 = -2127615574;
                        break;
                    case -1157295578:
                    case -530061349:
                        if (C0216.f1393 == 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۜ᩵") ^ i3;
                            i5 = ((iM11306 ^ i4) * 9929) ^ 1789294113;
                            i6 = 261270310;
                        } else {
                            iM11306 = C19806.m45029("ۤ᩻") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-23893)) ^ 257419138;
                            i6 = 221399571;
                        }
                        break;
                    case -947348391:
                    case -103242657:
                        if (this.f19668 != z) {
                            iM11306 = (i4 - C19806.m45029("᩸ۗ")) * 61;
                            i5 = ((iM11306 ^ i3) * 2159) ^ 494118462;
                            i6 = 1560980545;
                        } else {
                            iM11306 = C19806.m45029("ۧۨ") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-23937)) ^ (-1509378682);
                            i6 = 1060567630;
                        }
                        break;
                    case -926710514:
                    case -556807765:
                        C1668.m5583();
                        break;
                    case -333442421:
                    case 124408304:
                        if (!C0797.f3386) {
                            iM11306 = C19806.m45029("᩵ۡ") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-5561)) ^ 192506978;
                            i6 = -1506041012;
                        } else {
                            iM11306 = C19806.m45029("ܺܺ") ^ i4;
                            i5 = ((iM11306 ^ i3) * 4675) ^ 1076800084;
                            i6 = 1706544469;
                        }
                        break;
                    case -112659344:
                    case 1349679136:
                        if (!C19806.m45024()) {
                            iM11306 = C19806.m45029("᩶ۡ") ^ i4;
                            i5 = ((iM11306 ^ i3) * (-27329)) ^ (-20360996);
                            i6 = 1748427346;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ۡ۟") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-21745)) ^ (-2000579625);
                            i6 = -2127615574;
                        }
                        break;
                    case -50537932:
                    case 1670556723:
                        if (C3660.m10791() == 0) {
                            iM11306 = (C19806.m45029("ۛܳ") + i3) * 19;
                            i5 = ((iM11306 ^ i4) * 6429) ^ 1310111801;
                            i6 = -6253427;
                        } else {
                            iM11306 = C19806.m45029("ۤ᩻") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-23893)) ^ 257419138;
                            i6 = 221399571;
                        }
                        break;
                    case 165993923:
                    case 1285560673:
                        this.f19659.m20956();
                        iM11306 = ThreadFactoryC3888.m11306("᩷۬") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-27531)) ^ 883937384;
                        i6 = -1935264216;
                        break;
                    case 908797632:
                    case 1985864320:
                        itM9863 = ViewTreeObserverOnPreDrawListenerC3327.m9863(this.f19666);
                        iM11306 = C19806.m45029("ۢ᩶") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-21793)) ^ (-1219475406);
                        i6 = -2006750129;
                        break;
                        break;
                    case 927570470:
                    case 1912743364:
                        this.f19659.m20965();
                        iM11306 = ThreadFactoryC3888.m11306("᩷۬") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-27531)) ^ 883937384;
                        i6 = -1935264216;
                        break;
                        break;
                    case 989539866:
                    case 1208013556:
                        if (!RunnableC1564.m5348(itM9863)) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۧ᩷") ^ i4) * (-71);
                            i5 = ((iM11306 ^ i3) * 32473) ^ 399708235;
                            i6 = -550731734;
                            break;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("ۡۗ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 25529) ^ (-2135230210);
                        i6 = -637860336;
                        break;
                    case 1389528603:
                    case 1687892052:
                        C0629.m2907();
                        if (!RunnableC1895.f7152) {
                            iM11306 = (i3 - C19806.m45029("᩺ۧ")) * 67;
                            i5 = ((iM11306 ^ i4) * (-7531)) ^ 834030802;
                            i6 = 1195909254;
                        } else {
                            iM11306 = C19806.m45029("ܺܺ") ^ i4;
                            i5 = ((iM11306 ^ i3) * 4675) ^ 1076800084;
                            i6 = 1706544469;
                        }
                        break;
                    case 1902952894:
                    case 2071121997:
                        this.f19657.notifyDataSetChanged();
                        if (!C1668.m5583()) {
                            iM11306 = C19806.m45029("ۤ᩻") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-23893)) ^ 257419138;
                            i6 = 221399571;
                            break;
                        }
                        iM11306 = (i3 - C19806.m45029("۬᩶")) * 7;
                        i5 = ((iM11306 ^ i4) * 23495) ^ 75348840;
                        i6 = -111426822;
                        break;
                    default:
                        if (!C19806.f63586) {
                            iM11306 = (i3 - ThreadFactoryC3888.m11306("۟ۙ")) * (-93);
                            i5 = ((iM11306 ^ i4) * (-465)) ^ (-2138662308);
                            i6 = -1255353886;
                        } else {
                            iM11306 = C19806.m45029("ۤ᩻") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-23893)) ^ 257419138;
                            i6 = 221399571;
                        }
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0293 A[PHI: r5 r12 r13 r18
      0x0293: PHI (r5v3 char) = (r5v2 char), (r5v1 char), (r5v1 char) binds: [B:69:0x0291, B:46:0x01af, B:15:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r12v3 short[]) = (r12v1 short[]), (r12v2 short[]), (r12v1 short[]) binds: [B:69:0x0291, B:46:0x01af, B:15:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r13v3 int) = (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:69:0x0291, B:46:0x01af, B:15:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0293: PHI (r18v27 int) = (r18v7 int), (r18v16 int), (r18v28 int) binds: [B:69:0x0291, B:46:0x01af, B:15:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02ca A[PHI: r4 r6 r7 r8 r9 r10 r18
      0x02ca: PHI (r4v3 short[]) = (r4v2 short[]), (r4v1 short[]), (r4v1 short[]), (r4v1 short[]) binds: [B:73:0x02c8, B:65:0x026e, B:61:0x024c, B:57:0x0228] A[DONT_GENERATE, DONT_INLINE]
      0x02ca: PHI (r6v3 short) = (r6v1 short), (r6v2 short), (r6v1 short), (r6v1 short) binds: [B:73:0x02c8, B:65:0x026e, B:61:0x024c, B:57:0x0228] A[DONT_GENERATE, DONT_INLINE]
      0x02ca: PHI (r7v3 short) = (r7v1 short), (r7v2 short), (r7v1 short), (r7v1 short) binds: [B:73:0x02c8, B:65:0x026e, B:61:0x024c, B:57:0x0228] A[DONT_GENERATE, DONT_INLINE]
      0x02ca: PHI (r8v3 int) = (r8v1 int), (r8v1 int), (r8v2 int), (r8v1 int) binds: [B:73:0x02c8, B:65:0x026e, B:61:0x024c, B:57:0x0228] A[DONT_GENERATE, DONT_INLINE]
      0x02ca: PHI (r9v3 int) = (r9v1 int), (r9v1 int), (r9v2 int), (r9v1 int) binds: [B:73:0x02c8, B:65:0x026e, B:61:0x024c, B:57:0x0228] A[DONT_GENERATE, DONT_INLINE]
      0x02ca: PHI (r10v2 int) = (r10v1 int), (r10v1 int), (r10v1 int), (r10v3 int) binds: [B:73:0x02c8, B:65:0x026e, B:61:0x024c, B:57:0x0228] A[DONT_GENERATE, DONT_INLINE]
      0x02ca: PHI (r18v10 int) = (r18v6 int), (r18v8 int), (r18v9 int), (r18v11 int) binds: [B:73:0x02c8, B:65:0x026e, B:61:0x024c, B:57:0x0228] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x02fa A[PHI: r1 r18
      0x02fa: PHI (r1v3 java.lang.String) = (r1v1 java.lang.String), (r1v2 java.lang.String), (r1v1 java.lang.String) binds: [B:77:0x02f8, B:38:0x0156, B:11:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x02fa: PHI (r18v29 int) = (r18v5 int), (r18v18 int), (r18v30 int) binds: [B:77:0x02f8, B:38:0x0156, B:11:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        if (l.C0817.f3443 != false) goto L15;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m15929(l.AbstractActivityC5788 r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC5788.m15929(l.ۛۗۨ, boolean):void");
    }

    /* JADX WARN: Code duplicated, block: B:49:0x017b A[PHI: r15
      0x017b: PHI (r15v6 int) = (r15v3 int), (r15v2 int) binds: [B:48:0x0179, B:9:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x0358 A[PHI: r9 r26
      0x0358: PHI (r9v68 int) = (r9v67 int), (r9v69 int) binds: [B:91:0x0340, B:88:0x031e] A[DONT_GENERATE, DONT_INLINE]
      0x0358: PHI (r26v46 short[]) = (r26v45 short[]), (r26v47 short[]) binds: [B:91:0x0340, B:88:0x031e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x007d, code lost:
    
        if (l.C1148.f5161 > 0) goto L17;
     */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m15930(l.AbstractActivityC5788 r33) {
        /*
            Method dump skipped, instruction units count: 2520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC5788.m15930(l.ۛۗۨ):void");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0116 A[PHI: r10 r11
      0x0116: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:31:0x0114, B:15:0x0083, B:12:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0116: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:31:0x0114, B:15:0x0083, B:12:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01ec A[PHI: r9 r13 r15
      0x01ec: PHI (r9v5 java.lang.String) = (r9v2 java.lang.String), (r9v4 java.lang.String), (r9v2 java.lang.String), (r9v2 java.lang.String) binds: [B:51:0x01ea, B:47:0x01c2, B:35:0x014f, B:9:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x01ec: PHI (r13v4 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:51:0x01ea, B:47:0x01c2, B:35:0x014f, B:9:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x01ec: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:51:0x01ea, B:47:0x01c2, B:35:0x014f, B:9:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x02a2 A[PHI: r5 r6 r17 r18
      0x02a2: PHI (r5v4 l.۠ۗۨ) = (r5v2 l.۠ۗۨ), (r5v3 l.۠ۗۨ), (r5v2 l.۠ۗۨ), (r5v2 l.۠ۗۨ) binds: [B:66:0x02a0, B:39:0x0179, B:12:0x007a, B:9:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x02a2: PHI (r6v4 l.ۡ᩺ۙ) = (r6v2 l.ۡ᩺ۙ), (r6v3 l.ۡ᩺ۙ), (r6v2 l.ۡ᩺ۙ), (r6v2 l.ۡ᩺ۙ) binds: [B:66:0x02a0, B:39:0x0179, B:12:0x007a, B:9:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x02a2: PHI (r17v4 int) = (r17v3 int), (r17v2 int), (r17v2 int), (r17v2 int) binds: [B:66:0x02a0, B:39:0x0179, B:12:0x007a, B:9:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x02a2: PHI (r18v4 short) = (r18v3 short), (r18v2 short), (r18v2 short), (r18v2 short) binds: [B:66:0x02a0, B:39:0x0179, B:12:0x007a, B:9:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x02f1 A[PHI: r3 r4 r8 r16 r19 r20 r21 r26
      0x02f1: PHI (r3v4 android.view.MenuInflater) = 
      (r3v2 android.view.MenuInflater)
      (r3v3 android.view.MenuInflater)
      (r3v2 android.view.MenuInflater)
      (r3v2 android.view.MenuInflater)
     binds: [B:70:0x02d7, B:55:0x0227, B:43:0x019d, B:6:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x02f1: PHI (r4v5 int) = (r4v2 int), (r4v2 int), (r4v4 int), (r4v2 int) binds: [B:70:0x02d7, B:55:0x0227, B:43:0x019d, B:6:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x02f1: PHI (r8v5 java.lang.String) = (r8v2 java.lang.String), (r8v4 java.lang.String), (r8v2 java.lang.String), (r8v2 java.lang.String) binds: [B:70:0x02d7, B:55:0x0227, B:43:0x019d, B:6:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x02f1: PHI (r16v4 int) = (r16v3 int), (r16v2 int), (r16v2 int), (r16v2 int) binds: [B:70:0x02d7, B:55:0x0227, B:43:0x019d, B:6:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x02f1: PHI (r19v3 short[]) = (r19v2 short[]), (r19v2 short[]), (r19v2 short[]), (r19v5 short[]) binds: [B:70:0x02d7, B:55:0x0227, B:43:0x019d, B:6:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x02f1: PHI (r20v3 char) = (r20v2 char), (r20v2 char), (r20v2 char), (r20v5 char) binds: [B:70:0x02d7, B:55:0x0227, B:43:0x019d, B:6:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x02f1: PHI (r21v4 int) = (r21v3 int), (r21v2 int), (r21v2 int), (r21v2 int) binds: [B:70:0x02d7, B:55:0x0227, B:43:0x019d, B:6:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x02f1: PHI (r26v5 short) = (r26v4 short), (r26v3 short), (r26v3 short), (r26v3 short) binds: [B:70:0x02d7, B:55:0x0227, B:43:0x019d, B:6:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        int iM11306;
        int i;
        int i2;
        int i3 = AbstractC0464.f2088;
        int i4 = C2642.f10294;
        int iM45029 = (C19806.m45029("ܿ֡") ^ i4) * 77;
        int i5 = ((iM45029 ^ i3) * (-28451)) ^ 745931436;
        String strM5344 = null;
        short[] sArr = null;
        int i6 = iM45029 ^ 1495285074;
        MenuInflater menuInflater = null;
        int iM450210 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        short s = 0;
        char c = 0;
        int i11 = 0;
        int i12 = 1598948765;
        short s2 = 0;
        String strM8470 = null;
        short[] sArr2 = null;
        int i13 = 0;
        MenuItem menuItemM6916 = null;
        C9186 c9186 = null;
        C7905 c7905 = null;
        int iM11307 = 0;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * (-29537)) >> 31));
            switch (i12) {
                case -2087400736:
                case -327841914:
                    menuInflater.inflate(ThreadFactoryC3888.m11306(strM8470) ^ 2099434552, menu);
                    if (C3286.f12186) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ܰ") ^ i3;
                        i = ((iM11306 ^ i4) * (-16187)) ^ (-468700247);
                        i2 = 935576468;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ܿ") ^ i4;
                        i = ((iM11306 ^ i3) * (-17317)) ^ 1795060064;
                        i2 = -431356598;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1809399835:
                case 609533515:
                    MenuItem menuItemM10785 = C3660.m10785(menu, iM11307);
                    C3286.m9779(menuItemM10785);
                    c7905 = new C7905(menuItemM10785);
                    c9186 = this.f19662;
                    if (C1419.f5860 >= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܰܶ")) * 81;
                        i = ((iM11306 ^ i3) * (-27683)) ^ (-1198175594);
                        i2 = -944778826;
                    } else {
                        iM11306 = C19806.m45029("ۧ֫") ^ i4;
                        i = ((iM11306 ^ i3) * (-25489)) ^ (-1578175872);
                        i2 = 1304669159;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1354533991:
                case -1246711547:
                    if (C3660.f13403 < 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܰܶ")) * 81;
                        i = ((iM11306 ^ i3) * (-27683)) ^ (-1198175594);
                        i2 = -944778826;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ܰ") ^ i3;
                        i = ((iM11306 ^ i4) * (-16187)) ^ (-468700247);
                        i2 = 935576468;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1325617050:
                case 1249561811:
                    iM11307 = 2123101455 ^ ThreadFactoryC3888.m11306(strM5344);
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = C19806.m45029("ܿᩳ") ^ i3;
                        i = ((iM11306 ^ i4) * 32365) ^ 1464315209;
                        i2 = -148815958;
                    } else {
                        iM11306 = C19806.m45029("֫ۧ") ^ i4;
                        i = ((iM11306 ^ i3) * 7133) ^ (-1038862093);
                        i2 = -1950518461;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1247493183:
                case -789526655:
                    C0050.m946();
                    iM11306 = (i3 - ThreadFactoryC3888.m11306("ᩴۤ")) * (-65);
                    i = ((iM11306 ^ i4) * (-609)) ^ (-649760147);
                    i2 = -1736405589;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1076198655:
                case -205261838:
                    int i14 = s2 + s;
                    if (i10 - (i14 * i14) >= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۤ۟")) * (-55);
                        i = ((iM11306 ^ i3) * 18839) ^ (-647776400);
                        i2 = -139181698;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ۙ᩵")) * 33;
                        i = ((iM11306 ^ i3) * (-8909)) ^ (-564424048);
                        i2 = 24403574;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1032037751:
                case 1106039625:
                    i7 = 18128;
                    iM11306 = ThreadFactoryC3888.m11306("ܽۧ") ^ i3;
                    i = ((iM11306 ^ i4) * (-23037)) ^ (-399436205);
                    i2 = -1754714386;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -933387765:
                case -420447603:
                    s2 = sArr2[c];
                    i11 = s2 * s2;
                    i9 = 40883236;
                    if (C0817.f3443) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰۛ") + i4) * (-125);
                        i = ((iM11306 ^ i3) * (-14681)) ^ (-936309359);
                        i2 = -172435149;
                    } else {
                        iM11306 = C19806.m45029("ܿᩳ") ^ i3;
                        i = ((iM11306 ^ i4) * 32365) ^ 1464315209;
                        i2 = -148815958;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -928988693:
                case 841625748:
                    return true;
                case -821330301:
                case 405963221:
                    menuInflater = getMenuInflater();
                    strM8470 = C2788.m8470(f19653, 179, 3, i7);
                    if (C0797.f3386) {
                        iM11306 = C19806.m45029("ܿᩳ") ^ i3;
                        i = ((iM11306 ^ i4) * 32365) ^ 1464315209;
                        i2 = -148815958;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻᩺") ^ i3;
                        i = ((iM11306 ^ i4) * 12761) ^ (-1717156204);
                        i2 = -1273724930;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -636049076:
                case -234293692:
                    menuItemM6916 = C2249.m6916(menu, iM450210 ^ i13);
                    if (mo8791()) {
                        iM11306 = C19806.m45029("۬ۖ") ^ i4;
                        i = ((iM11306 ^ i3) * 30667) ^ 877753371;
                        i2 = 286782508;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿ᩻") ^ i4) * 87;
                        i = ((iM11306 ^ i3) * (-491)) ^ 96757421;
                        i2 = -962003034;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -566851037:
                case 329229640:
                    i7 = 16003;
                    iM11306 = ThreadFactoryC3888.m11306("ܽۧ") ^ i3;
                    i = ((iM11306 ^ i4) * (-23037)) ^ (-399436205);
                    i2 = -1754714386;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -470124486:
                case 244077436:
                    C1937.m6280(menuItemM6916, this.f19669);
                    iM11306 = (C19806.m45029("ܺۖ") ^ i3) * (-25);
                    i = ((iM11306 ^ i4) * (-10213)) ^ (-878302718);
                    i2 = 1817169641;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -103660518:
                case 2140288311:
                    strM5344 = RunnableC1564.m5344(f19653, 182, 3, i7);
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘܳ") + i3) * 63;
                        i = ((iM11306 ^ i4) * 8961) ^ (-2013511823);
                        i2 = 1887288728;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ܰ") ^ i3;
                        i = ((iM11306 ^ i4) * (-16187)) ^ (-468700247);
                        i2 = 935576468;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 316122950:
                case 1158895490:
                    iM450210 = C19806.m45029(RunnableC1606.m5481(sArr, i8, 3, i7));
                    i13 = 2102970623;
                    if (C19806.m45024()) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۨ᩶")) * 75;
                        i = ((iM11306 ^ i3) * 25087) ^ 1630324733;
                        i2 = -136145243;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗ᩺") + i3) * 37;
                        i = ((iM11306 ^ i4) * (-24257)) ^ (-1500751536);
                        i2 = 879626198;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 390200226:
                case 1473016674:
                    C2788.m8472();
                    return false;
                case 462843598:
                case 1381501561:
                    C1937.m6282(c9186, this, c7905);
                    sArr = f19653;
                    i8 = 185;
                    if (C3535.f13026 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ܰ") ^ i3;
                        i = ((iM11306 ^ i4) * (-16187)) ^ (-468700247);
                        i2 = 935576468;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۬᩶") ^ i3;
                        i = ((iM11306 ^ i4) * (-29453)) ^ 899509521;
                        i2 = 1253433707;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 489365552:
                case 2070944844:
                    C2124.m6680(menuItemM6916, false);
                    iM11306 = (C19806.m45029("ܺۖ") ^ i3) * (-25);
                    i = ((iM11306 ^ i4) * (-10213)) ^ (-878302718);
                    i2 = 1817169641;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 758939551:
                case 1872908264:
                    if (C0817.m3399()) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܰܶ")) * 81;
                        i = ((iM11306 ^ i3) * (-27683)) ^ (-1198175594);
                        i2 = -944778826;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۨ᩶")) * 75;
                        i = ((iM11306 ^ i3) * 25087) ^ 1630324733;
                        i2 = -136145243;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 944190914:
                case 1010690291:
                    C0526.m2437();
                    if (C0629.f2722 > 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ᩴۤ")) * (-65);
                        i = ((iM11306 ^ i4) * (-609)) ^ (-649760147);
                        i2 = -1736405589;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۨ᩶")) * 75;
                        i = ((iM11306 ^ i3) * 25087) ^ 1630324733;
                        i2 = -136145243;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1696461852:
                case 1818448565:
                    int i15 = i11 + i9;
                    i10 = i15 + i15;
                    s = 6394;
                    if (C2704.f10408) {
                        iM11306 = C19806.m45029("᩻ۨ") ^ i3;
                        i = ((iM11306 ^ i4) * 2927) ^ (-1301117757);
                        i2 = -407171093;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܰܶ")) * 81;
                        i = ((iM11306 ^ i3) * (-27683)) ^ (-1198175594);
                        i2 = -944778826;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    sArr2 = f19653;
                    c = 178;
                    if (C1419.f5860 >= 0) {
                        iM11306 = C19806.m45029("ܿᩳ") ^ i3;
                        i = ((iM11306 ^ i4) * 32365) ^ 1464315209;
                        i2 = -148815958;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗ֨") ^ i3) * 123;
                        i = ((iM11306 ^ i4) * (-7373)) ^ 1764286334;
                        i2 = -1849993057;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:54:0x0167  */
    /* JADX WARN: Code duplicated, block: B:58:0x0194 A[PHI: r0
      0x0194: PHI (r0v6 boolean) = (r0v5 boolean), (r0v2 boolean), (r0v2 boolean) binds: [B:57:0x0192, B:49:0x014b, B:16:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    public AbstractActivityC5788() {
        int iM45029;
        int i;
        boolean z = false;
        int i2 = -2052099132;
        int i3 = RunnableC0195.f1321;
        int i4 = C2477.f9839;
        int iM450210 = (C19806.m45029("ۖۖ") ^ i4) * 31;
        int i5 = ((iM450210 ^ i3) * 20167) ^ (-1889008750);
        int i6 = -982860726;
        while (true) {
            int i7 = iM450210 ^ i6;
            C9186 c9186 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-16525)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1700048635:
                    case 374256120:
                        AbstractC0464.m2313();
                        if (C2642.f10294 <= 0) {
                            iM45029 = C19806.m45029("۟ᩳ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-11355)) ^ 1993414799;
                            i = -2021110765;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("۬᩶") + i4) * (-37);
                            i5 = ((iM45029 ^ i3) * (-2199)) ^ (-1960782552);
                            i = -513724046;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -1656112383:
                    case 698751066:
                        C3743.m10966();
                        iM45029 = C19806.m45029("۟ᩳ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-11355)) ^ 1993414799;
                        i = -2021110765;
                        i7 = iM45029 ^ i;
                        break;
                    case -1546250153:
                    case -530995180:
                        if (!CallableC1627.f6528) {
                        }
                        iM45029 = C19806.m45029("᩻۠") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-30079)) ^ (-13672954);
                        i = 1088669813;
                        i7 = iM45029 ^ i;
                        break;
                        break;
                    case -1422508659:
                    case 805135056:
                        if (C2249.m6915() <= 0) {
                            iM45029 = C19806.m45029("۟ᩳ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-11355)) ^ 1993414799;
                            i = -2021110765;
                        } else {
                            iM45029 = C19806.m45029("ܰ֨") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-7501)) ^ (-1748285520);
                            i = -526952431;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -1092033995:
                    case 1128426042:
                        if (C3286.f12186) {
                            iM45029 = (ThreadFactoryC3888.m11306("۬᩶") + i4) * (-37);
                            i5 = ((iM45029 ^ i3) * (-2199)) ^ (-1960782552);
                            i = -513724046;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("۫ۙ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-1921)) ^ (-1103305778);
                            i = -1872202828;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -1083806032:
                    case 1844628758:
                        if (C7105.f23796 >= 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۚ֡") + i3) * (-67);
                            i5 = ((iM45029 ^ i4) * (-27841)) ^ 1192606873;
                            i = -2073785993;
                        } else {
                            iM45029 = (i3 - ThreadFactoryC3888.m11306("ۙ֡")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i5 = ((iM45029 ^ i4) * 30835) ^ (-865684936);
                            i = -1360186158;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -782300339:
                    case 1399002584:
                        z = false;
                        z = false;
                        this.f19668 = false;
                        if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("۬᩶") + i4) * (-37);
                            i5 = ((iM45029 ^ i3) * (-2199)) ^ (-1960782552);
                            i = -513724046;
                        } else {
                            iM45029 = (i4 - C19806.m45029("ۜ᩷")) * (-27);
                            i5 = ((iM45029 ^ i3) * (-16321)) ^ 519851849;
                            i = 84942447;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -722946965:
                    case 740239174:
                        if (C2124.f7782 <= 0) {
                            iM45029 = C19806.m45029("۟ᩳ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-11355)) ^ 1993414799;
                            i = -2021110765;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("ۚ֡") + i3) * (-67);
                            i5 = ((iM45029 ^ i4) * (-27841)) ^ 1192606873;
                            i = -2073785993;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -483056157:
                    case -45208419:
                        if (CallableC1627.m5507() != 0) {
                            iM45029 = C19806.m45029("۟ᩳ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-11355)) ^ 1993414799;
                            i = -2021110765;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("ۖܰ") ^ i4;
                            i5 = ((iM45029 ^ i3) * 28267) ^ 1590055144;
                            i = -1990104336;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -208766325:
                    case -138828407:
                        C1461.m5080();
                        ViewTreeObserverOnPreDrawListenerC3327.m9874();
                        throw new RuntimeException();
                    case -112150780:
                    case 717506337:
                        if (C1977.m6356()) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۚ֡") + i3) * (-67);
                            i5 = ((iM45029 ^ i4) * (-27841)) ^ 1192606873;
                            i = -2073785993;
                        } else {
                            iM45029 = C19806.m45029("۠᩺") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-1871)) ^ 1379388909;
                            i = -2018427284;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case 128187140:
                    case 611425985:
                        this.f19662 = c9186;
                        if (C1668.f6641 < 0) {
                            iM45029 = (i3 - ThreadFactoryC3888.m11306("ܽܽ")) * (-105);
                            i5 = ((iM45029 ^ i4) * (-16929)) ^ 1287890163;
                            i = 159831908;
                            i7 = iM45029 ^ i;
                        }
                        break;
                    case 423233080:
                    case 1261124984:
                        this.f19673 = z;
                        if (C3660.f13403 < 0) {
                            c9186 = new C9186(C2788.m8473(z));
                            if (AbstractC0464.f2088 > 0) {
                                iM45029 = C19806.m45029("ۡܰ") ^ i3;
                                i5 = ((iM45029 ^ i4) * 6795) ^ 368193475;
                                i = -2019257091;
                                i7 = iM45029 ^ i;
                            }
                        }
                        break;
                    case 610535333:
                    case 679852991:
                        this.f19667 = z ? 1 : 0;
                        if (C0526.f2219) {
                            iM45029 = (ThreadFactoryC3888.m11306("ۚ֡") + i3) * (-67);
                            i5 = ((iM45029 ^ i4) * (-27841)) ^ 1192606873;
                            i = -2073785993;
                        } else {
                            iM45029 = C19806.m45029("ᩳ۫") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-9787)) ^ (-288307207);
                            i = 991494478;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    default:
                        this.f19672 = -1;
                        return;
                }
            }
            iM450210 = ThreadFactoryC3888.m11306("ۗۖ") ^ i4;
            i5 = ((iM450210 ^ i3) * (-32545)) ^ 1558227192;
            i6 = 499323175;
        }
    }

    static {
        AbstractC20745 abstractC20745 = null;
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
        int i6 = -834499434;
        int i7 = RunnableC0195.f1321;
        int i8 = AbstractC0464.f2088;
        int iM11306 = ThreadFactoryC3888.m11306("۫ܺ") ^ i7;
        int i9 = ((iM11306 ^ i8) * (-9743)) ^ (-1550970729);
        int i10 = 2107735966;
        while (true) {
            i6 = ((((i6 ^ i8) * 15553) >> 31) & i9) ^ (iM11306 ^ i10);
            switch (i6) {
                case -2016867874:
                case -562793374:
                    sArr = f19653;
                    c = 0;
                    if (C0216.f1393 != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ܿ") + i7) * 69;
                        i9 = ((iM11306 ^ i8) * 29337) ^ 1034172347;
                        i10 = 218078272;
                    } else {
                        iM11306 = C19806.m45029("ۚܳ") ^ i7;
                        i9 = ((iM11306 ^ i8) * 19115) ^ 2096536091;
                        i10 = 1483477720;
                    }
                    break;
                case -1934152540:
                case 1275919954:
                    f19655 = C1189.m4364(abstractC20745, C3535.m10423(sArr2, i4, i5, i3));
                    return;
                case -1856427088:
                case 1075267310:
                    i5 = 6;
                    if (C1461.f5957 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ᩺") ^ i7;
                        i9 = ((iM11306 ^ i8) * 29985) ^ 478221543;
                        i10 = -547832235;
                    } else {
                        iM11306 = C19806.m45029("ܶ᩻") ^ i8;
                        i9 = ((iM11306 ^ i7) * (-16291)) ^ 1248652027;
                        i10 = 342799216;
                    }
                    break;
                case -1734796393:
                case -626010987:
                    i2 = i * i;
                    s2 = 74124;
                    if (C2124.f7782 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟᩹") ^ i8;
                        i9 = ((iM11306 ^ i7) * 599) ^ 1190156719;
                        i10 = 162038940;
                    } else {
                        iM11306 = (C19806.m45029("ܽۚ") + i7) * (-37);
                        i9 = ((iM11306 ^ i8) * 3563) ^ (-2042339585);
                        i10 = 1877057083;
                    }
                    break;
                case -1520380766:
                case -634026527:
                    i4 = 1;
                    if (C0278.f1572 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ᩺") ^ i7;
                        i9 = ((iM11306 ^ i8) * 29985) ^ 478221543;
                        i10 = -547832235;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵᩹") ^ i7) * (-45);
                        i9 = ((iM11306 ^ i8) * 8537) ^ (-898314308);
                        i10 = -1575078107;
                    }
                    break;
                case -1375967361:
                case -992234023:
                    if (CallableC1627.f6528) {
                        iM11306 = C19806.m45029("ۗܺ") ^ i8;
                        i9 = ((iM11306 ^ i7) * 14595) ^ (-31514831);
                        i10 = 2047472997;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ܿ") + i7) * 69;
                        i9 = ((iM11306 ^ i8) * 29337) ^ 1034172347;
                        i10 = 218078272;
                    }
                    break;
                case -1346726133:
                case 182973909:
                    C0050.m946();
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟᩹") ^ i8;
                        i9 = ((iM11306 ^ i7) * 599) ^ 1190156719;
                        i10 = 162038940;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ᩺") ^ i7;
                        i9 = ((iM11306 ^ i8) * 29985) ^ 478221543;
                        i10 = -547832235;
                    }
                    break;
                case -1328061262:
                case 458673692:
                    i3 = 17134;
                    iM11306 = (i8 - C19806.m45029("ۗᩳ")) * 109;
                    i9 = ((iM11306 ^ i7) * (-165)) ^ (-764753083);
                    i10 = 1570612144;
                    break;
                case -1198662842:
                case -71753966:
                    if (C2871.f10837 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ܿ") + i7) * 69;
                        i9 = ((iM11306 ^ i8) * 29337) ^ 1034172347;
                        i10 = 218078272;
                    } else {
                        iM11306 = (C19806.m45029("ۧ᩶") ^ i8) * (-47);
                        i9 = ((iM11306 ^ i7) * (-29923)) ^ 1779301337;
                        i10 = -1527527836;
                    }
                    break;
                case -561739800:
                case 1234923952:
                    i = s + 18531;
                    if (C2332.f8260) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨ᩹") + i7) * (-105);
                        i9 = ((iM11306 ^ i8) * (-8621)) ^ (-170539133);
                        i10 = 373799145;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ܿ") + i7) * 69;
                        i9 = ((iM11306 ^ i8) * 29337) ^ 1034172347;
                        i10 = 218078272;
                    }
                    break;
                case -383986199:
                case 1041695755:
                    if ((s * s2) - i2 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֨ܳ") ^ i7;
                        i9 = ((iM11306 ^ i8) * 13245) ^ 1754170000;
                        i10 = -1500640268;
                    } else {
                        iM11306 = C19806.m45029("ۡ۟") ^ i8;
                        i9 = ((iM11306 ^ i7) * 1057) ^ (-98256892);
                        i10 = -390787189;
                    }
                    break;
                case -227731792:
                case 1270163239:
                    C3660.m10791();
                    if (C2788.f10625 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ۡ") + i7) * 43;
                        i9 = ((iM11306 ^ i8) * 31989) ^ 1145210398;
                        i10 = -1880614094;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟᩹") ^ i8;
                        i9 = ((iM11306 ^ i7) * 599) ^ 1190156719;
                        i10 = 162038940;
                    }
                    break;
                case -62925953:
                case 1186235726:
                    abstractC20745 = C11904.f39938;
                    sArr2 = f19653;
                    if (C1148.m4232() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟᩹") ^ i8;
                        i9 = ((iM11306 ^ i7) * 599) ^ 1190156719;
                        i10 = 162038940;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۫᩷") ^ i8) * (-127);
                        i9 = ((iM11306 ^ i7) * 10143) ^ 159503275;
                        i10 = -49551446;
                    }
                    break;
                case 89877292:
                case 454536703:
                    i3 = 42200;
                    iM11306 = (i8 - C19806.m45029("ۗᩳ")) * 109;
                    i9 = ((iM11306 ^ i7) * (-165)) ^ (-764753083);
                    i10 = 1570612144;
                    break;
                case 132770709:
                case 577476865:
                    s = sArr[c];
                    if (C19806.f63586) {
                        iM11306 = ThreadFactoryC3888.m11306("۟᩹") ^ i8;
                        i9 = ((iM11306 ^ i7) * 599) ^ 1190156719;
                        i10 = 162038940;
                    } else {
                        iM11306 = C19806.m45029("۬ܽ") ^ i8;
                        i9 = ((iM11306 ^ i7) * (-4249)) ^ (-2072377541);
                        i10 = 301538118;
                    }
                    break;
                case 629033996:
                case 1277955908:
                    if (C2788.f10625 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽܳ") ^ i8;
                        i9 = ((iM11306 ^ i7) * 27981) ^ 1668938349;
                        i10 = -1441839615;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ۡ") + i7) * 43;
                        i9 = ((iM11306 ^ i8) * 31989) ^ 1145210398;
                        i10 = -1880614094;
                    }
                    break;
                case 945512661:
                case 2089654420:
                    C0817.m3399();
                    C1189.m4368();
                    throw new RuntimeException();
                case 1421380090:
                case 1627860908:
                    if (C2249.f8050 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽܳ") ^ i8;
                        i9 = ((iM11306 ^ i7) * 27981) ^ 1668938349;
                        i10 = -1441839615;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ۖ") + i7) * 109;
                        i9 = ((iM11306 ^ i8) * 13369) ^ (-471389450);
                        i10 = 1854933640;
                    }
                    break;
                default:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    C0671.m3008();
                    iM11306 = ThreadFactoryC3888.m11306("ۨ᩺") ^ i7;
                    i9 = ((iM11306 ^ i8) * 29985) ^ 478221543;
                    i10 = -547832235;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0159 A[PHI: r16
      0x0159: PHI (r16v16 int) = (r16v14 int), (r16v17 int) binds: [B:44:0x0142, B:36:0x0113] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x01fb A[PHI: r5 r6 r16 r17
      0x01fb: PHI (r5v3 int) = (r5v2 int), (r5v1 int) binds: [B:60:0x01f9, B:24:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r6v3 int) = (r6v2 int), (r6v1 int) binds: [B:60:0x01f9, B:24:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r16v20 int) = (r16v8 int), (r16v21 int) binds: [B:60:0x01f9, B:24:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r17v2 java.lang.String) = (r17v1 java.lang.String), (r17v3 java.lang.String) binds: [B:60:0x01f9, B:24:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0231 A[PHI: r4 r16
      0x0231: PHI (r4v3 short) = (r4v2 short), (r4v1 short), (r4v1 short), (r4v1 short) binds: [B:64:0x022f, B:39:0x0131, B:16:0x0089, B:13:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x0231: PHI (r16v25 int) = (r16v7 int), (r16v15 int), (r16v24 int), (r16v26 int) binds: [B:64:0x022f, B:39:0x0131, B:16:0x0089, B:13:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0264 A[PHI: r3 r10 r11 r16
      0x0264: PHI (r3v3 char) = (r3v2 char), (r3v1 char), (r3v1 char), (r3v1 char) binds: [B:68:0x0262, B:32:0x00f3, B:18:0x008d, B:16:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r10v3 short[]) = (r10v1 short[]), (r10v2 short[]), (r10v1 short[]), (r10v1 short[]) binds: [B:68:0x0262, B:32:0x00f3, B:18:0x008d, B:16:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r11v3 int) = (r11v1 int), (r11v2 int), (r11v1 int), (r11v1 int) binds: [B:68:0x0262, B:32:0x00f3, B:18:0x008d, B:16:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r16v23 int) = (r16v6 int), (r16v18 int), (r16v22 int), (r16v24 int) binds: [B:68:0x0262, B:32:0x00f3, B:18:0x008d, B:16:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0294 A[PHI: r2 r7 r8 r12 r16
      0x0294: PHI (r2v3 short[]) = (r2v2 short[]), (r2v1 short[]), (r2v1 short[]), (r2v1 short[]), (r2v1 short[]), (r2v1 short[]) binds: [B:72:0x0292, B:56:0x01d5, B:52:0x01b4, B:28:0x00cf, B:13:0x007f, B:10:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0294: PHI (r7v3 int) = (r7v1 int), (r7v2 int), (r7v1 int), (r7v1 int), (r7v1 int), (r7v1 int) binds: [B:72:0x0292, B:56:0x01d5, B:52:0x01b4, B:28:0x00cf, B:13:0x007f, B:10:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0294: PHI (r8v3 short) = (r8v1 short), (r8v1 short), (r8v2 short), (r8v1 short), (r8v1 short), (r8v1 short) binds: [B:72:0x0292, B:56:0x01d5, B:52:0x01b4, B:28:0x00cf, B:13:0x007f, B:10:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0294: PHI (r12v3 int) = (r12v1 int), (r12v1 int), (r12v1 int), (r12v2 int), (r12v1 int), (r12v1 int) binds: [B:72:0x0292, B:56:0x01d5, B:52:0x01b4, B:28:0x00cf, B:13:0x007f, B:10:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0294: PHI (r16v27 int) = (r16v5 int), (r16v9 int), (r16v10 int), (r16v19 int), (r16v26 int), (r16v29 int) binds: [B:72:0x0292, B:56:0x01d5, B:52:0x01b4, B:28:0x00cf, B:13:0x007f, B:10:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m15921(AbstractActivityC5788 abstractActivityC5788) {
        int iM11306;
        int i;
        int i2;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        short s2 = 0;
        int i6 = 0;
        short[] sArr2 = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 653305886;
        int i10 = C1025.f4800;
        int i11 = C1668.f6641;
        int iM45029 = C19806.m45029("᩻᩹") ^ i10;
        int i12 = ((iM45029 ^ i11) * 11307) ^ (-182835471);
        int i13 = iM45029 ^ (-260702091);
        String strM10056 = null;
        while (true) {
            int i14 = i13 ^ (i12 & (((i9 ^ i11) * (-10205)) >> 31));
            switch (i14) {
                case -1931665851:
                case -25916142:
                    i14 = i14;
                    i3 = s * s;
                    i4 = 236882881;
                    if (C1937.f7317 >= 0) {
                        iM11306 = C19806.m45029("ۖ᩵") ^ i10;
                        i = ((iM11306 ^ i11) * 26041) ^ 1351832827;
                        i2 = 1341933476;
                    } else {
                        iM11306 = (C19806.m45029("۟ᩴ") + i11) * (-75);
                        i = ((iM11306 ^ i10) * (-5793)) ^ 1985975229;
                        i2 = -1141090228;
                    }
                    int i15 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i15;
                    break;
                case -1798891726:
                case -615374938:
                    i14 = i14;
                    if (abstractActivityC5788.mo8792()) {
                        iM11306 = ThreadFactoryC3888.m11306("۟۫") ^ i11;
                        i = ((iM11306 ^ i10) * (-6217)) ^ (-768176456);
                        i2 = 1573653272;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡܽ") ^ i10;
                        i = ((iM11306 ^ i11) * 21829) ^ 1759116954;
                        i2 = 595185661;
                    }
                    int i16 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i16;
                    break;
                case -1784237544:
                case -1622319820:
                    if (C2788.f10625 < 0) {
                        i14 = i14;
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳ۬") + i11) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM11306 ^ i10) * (-31485)) ^ (-722050484);
                        i2 = -1538840193;
                    } else {
                        iM11306 = (C19806.m45029("ܺ᩺") + i11) * (-107);
                        i14 = i14;
                        i = ((iM11306 ^ i10) * 15059) ^ (-572953419);
                        i2 = -266450613;
                    }
                    int i17 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i17;
                    break;
                case -1763258381:
                case -1414622558:
                    i6 = 63966;
                    iM11306 = (i11 - ThreadFactoryC3888.m11306("᩻ᩴ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i = ((iM11306 ^ i10) * 24173) ^ 2120523337;
                    i2 = -486998184;
                    int i18 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i18;
                    break;
                case -1725996536:
                case -204937394:
                    i14 = i14;
                    boolean z = true;
                    if (C1066.f4915 > 0) {
                        abstractActivityC5788.mo1989(new RunnableC18488(abstractActivityC5788, z));
                    }
                    iM11306 = ThreadFactoryC3888.m11306("֡ۘ") ^ i10;
                    i = ((iM11306 ^ i11) * (-22869)) ^ 1627282813;
                    i2 = 81110700;
                    int i19 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i19;
                    break;
                case -1565509283:
                case -204269461:
                    C1668.m5576(C19806.m45029(strM10056) ^ 2119047483);
                    break;
                case -1471964593:
                case 549764068:
                    i14 = i14;
                    sArr = f19653;
                    if (C1148.f5161 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳ۬") + i11) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM11306 ^ i10) * (-31485)) ^ (-722050484);
                        i2 = -1538840193;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽܶ") ^ i10) * 119;
                        i = ((iM11306 ^ i11) * (-19565)) ^ (-1176013042);
                        i2 = -844800932;
                    }
                    int i110 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i110;
                    break;
                case -1367536856:
                case 351471441:
                    i14 = i14;
                    s = sArr[c];
                    if (RunnableC1895.m6170() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡ۘ") ^ i10;
                        i = ((iM11306 ^ i11) * (-22869)) ^ 1627282813;
                        i2 = 81110700;
                    } else {
                        iM11306 = C19806.m45029("ۗۢ") ^ i10;
                        i = ((iM11306 ^ i11) * (-21141)) ^ (-2136059778);
                        i2 = 784704310;
                    }
                    int i111 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i111;
                    break;
                case -1223602622:
                case 1758549473:
                    i14 = i14;
                    sArr2 = f19653;
                    i7 = 27;
                    if (C2642.f10294 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ᩹") ^ i10;
                        i = ((iM11306 ^ i11) * (-5377)) ^ 1761132921;
                        i2 = 968907328;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫ۖ") ^ i10;
                        i = ((iM11306 ^ i11) * (-8533)) ^ (-667171061);
                        i2 = 107992752;
                    }
                    int i112 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i112;
                    break;
                case -1215491141:
                case -257677992:
                    i6 = 64144;
                    iM11306 = (i11 - ThreadFactoryC3888.m11306("᩻ᩴ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i = ((iM11306 ^ i10) * 24173) ^ 2120523337;
                    i2 = -486998184;
                    int i113 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i113;
                    break;
                case -1048060073:
                case -806707034:
                    i14 = i14;
                    c = 26;
                    if (C3535.m10431() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ᩹") ^ i10;
                        i = ((iM11306 ^ i11) * (-5377)) ^ 1761132921;
                        i2 = 968907328;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۗܽ") ^ i11;
                        i = ((iM11306 ^ i10) * (-17059)) ^ 2054754439;
                        i2 = -2088161144;
                    }
                    int i114 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i114;
                    break;
                case -894026645:
                case 1946893751:
                    i14 = i14;
                    if (abstractActivityC5788.m15943(false)) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡܽ") ^ i10;
                        i = ((iM11306 ^ i11) * 21829) ^ 1759116954;
                        i2 = 595185661;
                    } else {
                        iM11306 = C19806.m45029("ۧ۟") ^ i10;
                        i = ((iM11306 ^ i11) * 22129) ^ (-80254037);
                        i2 = -1201635850;
                    }
                    int i115 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i115;
                    break;
                case -731584716:
                case -291330076:
                    i14 = i14;
                    C2249.m6915();
                    iM11306 = ThreadFactoryC3888.m11306("ۧ᩹") ^ i10;
                    i = ((iM11306 ^ i11) * (-5377)) ^ 1761132921;
                    i2 = 968907328;
                    int i116 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i116;
                    break;
                case -690055948:
                case -382605898:
                    i14 = i14;
                    i8 = 3;
                    if (C0526.f2219) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳ۬") + i11) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM11306 ^ i10) * (-31485)) ^ (-722050484);
                        i2 = -1538840193;
                    } else {
                        iM11306 = (i11 - ThreadFactoryC3888.m11306("ۘ۬")) * (-79);
                        i = ((iM11306 ^ i10) * 28353) ^ (-1227432123);
                        i2 = 823081273;
                    }
                    int i117 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i117;
                    break;
                case -574467986:
                case 2062041735:
                    i14 = i14;
                    if (C3660.m10791() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ᩹") ^ i10;
                        i = ((iM11306 ^ i11) * (-5377)) ^ 1761132921;
                        i2 = 968907328;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡ۘ") ^ i10;
                        i = ((iM11306 ^ i11) * (-22869)) ^ 1627282813;
                        i2 = 81110700;
                    }
                    int i118 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i118;
                    break;
                case -378446083:
                case 2141246042:
                    C0278.m1789();
                    C0962.m3746();
                    break;
                case 164189267:
                case 829253714:
                    i14 = i14;
                    s2 = 15391;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳ۬") + i11) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM11306 ^ i10) * (-31485)) ^ (-722050484);
                        i2 = -1538840193;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ۤ") ^ i11;
                        i = ((iM11306 ^ i10) * (-19017)) ^ (-969092580);
                        i2 = -1850776607;
                    }
                    int i119 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i119;
                    break;
                case 442877408:
                case 625663592:
                    i14 = i14;
                    int i20 = i3 + i4;
                    i5 = i20 + i20;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳ۬") + i11) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM11306 ^ i10) * (-31485)) ^ (-722050484);
                        i2 = -1538840193;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷֡") + i10) * (-21);
                        i = ((iM11306 ^ i11) * (-17183)) ^ 336336685;
                        i2 = -800178079;
                    }
                    int i1110 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i1110;
                    break;
                case 1223420339:
                case 1885056802:
                    i14 = i14;
                    strM10056 = RunnableC3388.m10056(sArr2, i7, i8, i6);
                    if (C3722.f13525 <= 0) {
                        iM11306 = C19806.m45029("ۖ᩵") ^ i10;
                        i = ((iM11306 ^ i11) * 26041) ^ 1351832827;
                        i2 = 1341933476;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۬۠") + i11) * (-3);
                        i = ((iM11306 ^ i10) * 24623) ^ (-2092516018);
                        i2 = -899696212;
                    }
                    int i1111 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i1111;
                    break;
                case 1359944825:
                case 1596469056:
                    i14 = i14;
                    C0962.m3746();
                    if (C1419.f5860 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡ۘ") ^ i10;
                        i = ((iM11306 ^ i11) * (-22869)) ^ 1627282813;
                        i2 = 81110700;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳ۬") + i11) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM11306 ^ i10) * (-31485)) ^ (-722050484);
                        i2 = -1538840193;
                    }
                    int i1112 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i1112;
                    break;
                default:
                    i14 = i14;
                    int i21 = s + s2;
                    if ((i21 * i21) - i5 <= 0) {
                        iM11306 = (C19806.m45029("ۡۚ") ^ i11) * 53;
                        i = ((iM11306 ^ i10) * (-2595)) ^ (-1973248146);
                        i2 = -1394069786;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ۛ") ^ i10) * 75;
                        i = ((iM11306 ^ i11) * 32503) ^ 1569092407;
                        i2 = -2009013385;
                    }
                    int i1113 = i14;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    i9 = i1113;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0728 A[PHI: r3 r13 r23 r26 r31 r32 r34 r40 r42
      0x0728: PHI (r3v37 short[]) = (r3v5 short[]), (r3v8 short[]), (r3v12 short[]), (r3v38 short[]) binds: [B:13:0x00d0, B:142:0x0726, B:129:0x0655, B:88:0x03c8] A[DONT_GENERATE, DONT_INLINE]
      0x0728: PHI (r13v28 java.util.ArrayList) = (r13v12 java.util.ArrayList), (r13v15 java.util.ArrayList), (r13v19 java.util.ArrayList), (r13v29 java.util.ArrayList) binds: [B:13:0x00d0, B:142:0x0726, B:129:0x0655, B:88:0x03c8] A[DONT_GENERATE, DONT_INLINE]
      0x0728: PHI (r23v29 java.lang.String) = (r23v5 java.lang.String), (r23v8 java.lang.String), (r23v12 java.lang.String), (r23v30 java.lang.String) binds: [B:13:0x00d0, B:142:0x0726, B:129:0x0655, B:88:0x03c8] A[DONT_GENERATE, DONT_INLINE]
      0x0728: PHI (r26v4 char) = (r26v2 char), (r26v3 char), (r26v2 char), (r26v2 char) binds: [B:13:0x00d0, B:142:0x0726, B:129:0x0655, B:88:0x03c8] A[DONT_GENERATE, DONT_INLINE]
      0x0728: PHI (r31v4 int) = (r31v2 int), (r31v2 int), (r31v3 int), (r31v2 int) binds: [B:13:0x00d0, B:142:0x0726, B:129:0x0655, B:88:0x03c8] A[DONT_GENERATE, DONT_INLINE]
      0x0728: PHI (r32v24 l.᩺ۗۨ) = (r32v5 l.᩺ۗۨ), (r32v8 l.᩺ۗۨ), (r32v12 l.᩺ۗۨ), (r32v25 l.᩺ۗۨ) binds: [B:13:0x00d0, B:142:0x0726, B:129:0x0655, B:88:0x03c8] A[DONT_GENERATE, DONT_INLINE]
      0x0728: PHI (r34v22 int) = (r34v5 int), (r34v8 int), (r34v12 int), (r34v23 int) binds: [B:13:0x00d0, B:142:0x0726, B:129:0x0655, B:88:0x03c8] A[DONT_GENERATE, DONT_INLINE]
      0x0728: PHI (r40v34 java.lang.StringBuilder) = 
      (r40v12 java.lang.StringBuilder)
      (r40v15 java.lang.StringBuilder)
      (r40v19 java.lang.StringBuilder)
      (r40v35 java.lang.StringBuilder)
     binds: [B:13:0x00d0, B:142:0x0726, B:129:0x0655, B:88:0x03c8] A[DONT_GENERATE, DONT_INLINE]
      0x0728: PHI (r42v17 int) = (r42v4 int), (r42v7 int), (r42v11 int), (r42v18 int) binds: [B:13:0x00d0, B:142:0x0726, B:129:0x0655, B:88:0x03c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final void m15957() {
        int iM45029;
        int i;
        int i2;
        int iM450210;
        int i3;
        int i4;
        int i5;
        StringBuilder sb;
        int iM11306;
        int i6;
        int i7;
        int iM11307;
        int i8;
        String str;
        String str2;
        int iM450211;
        int i9;
        int iM450212;
        int i10;
        int iM450213;
        int i11;
        int i12 = 1097541829;
        int i13 = C0629.f2722;
        int i14 = C1066.f4915;
        int iM11308 = (ThreadFactoryC3888.m11306("ܽۜ") ^ i13) * (-17);
        int i15 = ((iM11308 ^ i14) * (-16665)) ^ (-1877461574);
        int i16 = iM11308 ^ 170318565;
        int[] iArr = null;
        C22722 c22722 = null;
        StringBuilder sb2 = null;
        String strM3407 = null;
        String strM3361 = null;
        String strM6674 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        boolean z = false;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        ArrayList arrayList = null;
        int i31 = 0;
        String str3 = null;
        Iterator itM9863 = null;
        StringBuilder sb3 = null;
        C22722 c22723 = null;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        while (true) {
            i12 = i16 ^ (i15 & (((i12 ^ i14) * 29355) >> 31));
            switch (i12) {
                case -2138072223:
                case 678795320:
                    sb3 = sb3;
                    str3 = str3;
                    arrayList = arrayList;
                    i31 = i31;
                    i17 = i17;
                    c22723 = c22723;
                    sArr2 = sArr2;
                    i28 = s * s2;
                    i29 = s * s;
                    if (!ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM450210 = (i14 - ThreadFactoryC3888.m11306("۟᩻")) * 93;
                        i3 = ((iM450210 ^ i13) * (-13039)) ^ 35207410;
                        i4 = -1244163998;
                        i5 = iM450210 ^ i4;
                        sArr2 = sArr2;
                        c22723 = c22723;
                        i31 = i31;
                        str3 = str3;
                        sb3 = sb3;
                        i16 = i5;
                        i15 = i3;
                        i17 = i17;
                        arrayList = arrayList;
                    } else {
                        sArr2 = sArr2;
                        i17 = i17;
                        i31 = i31;
                        int iM11309 = (ThreadFactoryC3888.m11306("᩻ܰ") + i14) * (-119);
                        arrayList = arrayList;
                        sb = sb3;
                        i16 = iM11309 ^ 2097423229;
                        i15 = ((iM11309 ^ i13) * (-23635)) ^ 1144782626;
                        c22723 = c22723;
                        str3 = str3;
                        sb3 = sb;
                    }
                    break;
                case -2102726566:
                case 1439234424:
                    arrayList = arrayList;
                    i17 = i17;
                    str3 = str3;
                    c22723 = c22723;
                    itM9863 = ViewTreeObserverOnPreDrawListenerC3327.m9863(arrayList);
                    i20 = i34;
                    i21 = 0;
                    iM11306 = ThreadFactoryC3888.m11306("ۖ֡") ^ i14;
                    i6 = ((iM11306 ^ i13) * 27035) ^ 1823616792;
                    i7 = 619553508;
                    i16 = iM11306 ^ i7;
                    i15 = i6;
                    c22723 = c22723;
                    str3 = str3;
                    sb3 = sb3;
                    i17 = i17;
                    arrayList = arrayList;
                    break;
                case -2005469268:
                case 1837179850:
                    i26 = i32 + 1;
                    if (c22723.f74020 == null) {
                        i24 = i22;
                        i25 = i26;
                        arrayList = arrayList;
                        iM450212 = C19806.m45029("۠۫") ^ i14;
                        i3 = ((iM450212 ^ i13) * (-17907)) ^ 1872060985;
                        i10 = -662990221;
                        i16 = iM450212 ^ i10;
                        i15 = i3;
                        i17 = i17;
                        arrayList = arrayList;
                    } else {
                        iM45029 = C19806.m45029("᩸ۤ") ^ i13;
                        i = ((iM45029 ^ i14) * (-31565)) ^ (-1832508711);
                        i2 = -409369972;
                        i16 = iM45029 ^ i2;
                        i15 = i;
                    }
                    break;
                case -1950478062:
                case 1610738683:
                    sb3 = sb3;
                    str3 = str3;
                    arrayList = arrayList;
                    i31 = i31;
                    i17 = i17;
                    c22723 = c22723;
                    sArr2 = sArr2;
                    s = sArr[c];
                    s2 = 8256;
                    if (C3535.m10431() <= 0) {
                        iM450210 = (C19806.m45029("ۡ֨") ^ i13) * 21;
                        i3 = ((iM450210 ^ i14) * (-15647)) ^ 1288773061;
                        i4 = -125574897;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("۬֡") ^ i13;
                        i3 = ((iM450210 ^ i14) * 2447) ^ 1690212744;
                        i4 = -1813997680;
                    }
                    i5 = iM450210 ^ i4;
                    sArr2 = sArr2;
                    c22723 = c22723;
                    i31 = i31;
                    str3 = str3;
                    sb3 = sb3;
                    i16 = i5;
                    i15 = i3;
                    i17 = i17;
                    arrayList = arrayList;
                    break;
                case -1908028553:
                case 1774731445:
                    C1419.m4973();
                    if (C0050.m946() > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۛ") ^ i13;
                        i = ((iM45029 ^ i14) * (-12407)) ^ 156059266;
                        i2 = 2025786801;
                        i16 = iM45029 ^ i2;
                        i15 = i;
                    } else {
                        str2 = str3;
                        arrayList = arrayList;
                        i17 = i17;
                        int iM450214 = (C19806.m45029("ۛ᩵") + i14) * 57;
                        C22722 c22724 = c22723;
                        int i35 = ((iM450214 ^ i13) * (-6911)) ^ 1006074260;
                        i16 = iM450214 ^ 1258264798;
                        i17 = i17;
                        arrayList = arrayList;
                        str3 = str2;
                        i15 = i35;
                        c22723 = c22724;
                    }
                    break;
                case -1866172266:
                case -293562876:
                    C0050.m946();
                    break;
                case -1836658316:
                case 1087609992:
                    sb3 = sb3;
                    str3 = str3;
                    arrayList = arrayList;
                    i31 = i31;
                    i17 = i17;
                    c22723 = c22723;
                    sArr2 = sArr2;
                    i30 = R.string.face_error_canceled;
                    if (C0797.m3359()) {
                        iM450210 = (ThreadFactoryC3888.m11306("ۘᩴ") ^ i13) * (-7);
                        i3 = ((iM450210 ^ i14) * 14673) ^ 1580346574;
                        i4 = -399336117;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("ۚۧ") ^ i13) * 73;
                        i3 = ((iM450210 ^ i14) * (-19169)) ^ (-657956306);
                        i4 = 1959634395;
                    }
                    i5 = iM450210 ^ i4;
                    sArr2 = sArr2;
                    c22723 = c22723;
                    i31 = i31;
                    str3 = str3;
                    sb3 = sb3;
                    i16 = i5;
                    i15 = i3;
                    i17 = i17;
                    arrayList = arrayList;
                    break;
                case -1819081841:
                case -185243356:
                    i24 = i22 + 1;
                    i25 = i26;
                    arrayList = arrayList;
                    iM450212 = C19806.m45029("۠۫") ^ i14;
                    i3 = ((iM450212 ^ i13) * (-17907)) ^ 1872060985;
                    i10 = -662990221;
                    i16 = iM450212 ^ i10;
                    i15 = i3;
                    i17 = i17;
                    arrayList = arrayList;
                    break;
                case -1812459262:
                case -1629220577:
                    arrayList = arrayList;
                    c22723 = (C22722) C1419.m4967(arrayList, iArr[i33]);
                    if (c22723.m50371()) {
                        i25 = i32;
                        i24 = i22;
                        iM450212 = C19806.m45029("۠۫") ^ i14;
                        i3 = ((iM450212 ^ i13) * (-17907)) ^ 1872060985;
                        i10 = -662990221;
                    } else {
                        iM450212 = (i14 - C19806.m45029("ᩳۗ")) * (-49);
                        i17 = i17;
                        i3 = ((iM450212 ^ i13) * 23219) ^ (-1833593072);
                        i10 = 267167450;
                    }
                    i16 = iM450212 ^ i10;
                    i15 = i3;
                    i17 = i17;
                    arrayList = arrayList;
                    break;
                case -1651173947:
                case 1294341604:
                    StringBuilder sbM8976 = C3012.m8976(strM6674, strM3361);
                    C2788.m8480(sbM8976, this.f19664);
                    strM3407 = C0817.m3407(sbM8976);
                    iM45029 = ThreadFactoryC3888.m11306("᩷᩺") ^ i13;
                    i = ((iM45029 ^ i14) * (-25403)) ^ (-73201682);
                    i2 = -1340682399;
                    i16 = iM45029 ^ i2;
                    i15 = i;
                    break;
                case -1640176126:
                case -1111005418:
                    i33++;
                    i22 = i24;
                    i32 = i25;
                    iM11306 = C19806.m45029("ۘܺ") ^ i14;
                    i6 = ((iM11306 ^ i13) * 27591) ^ (-1544384281);
                    i7 = 1446326734;
                    i16 = iM11306 ^ i7;
                    i15 = i6;
                    c22723 = c22723;
                    str3 = str3;
                    sb3 = sb3;
                    i17 = i17;
                    arrayList = arrayList;
                    break;
                case -1639421224:
                case -1265815133:
                    i20++;
                    i21 = i23;
                    arrayList = arrayList;
                    i17 = i17;
                    str3 = str3;
                    c22723 = c22723;
                    iM11306 = ThreadFactoryC3888.m11306("ۖ֡") ^ i14;
                    i6 = ((iM11306 ^ i13) * 27035) ^ 1823616792;
                    i7 = 619553508;
                    i16 = iM11306 ^ i7;
                    i15 = i6;
                    c22723 = c22723;
                    str3 = str3;
                    sb3 = sb3;
                    i17 = i17;
                    arrayList = arrayList;
                    break;
                case -1624943218:
                case -303695882:
                    C3743.m10966();
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    iM45029 = C19806.m45029("ۘܳ") ^ i14;
                    i = ((iM45029 ^ i13) * (-14663)) ^ 1995262139;
                    i2 = -176649565;
                    i16 = iM45029 ^ i2;
                    i15 = i;
                    break;
                case -1614293293:
                case -508235829:
                    sb3 = sb3;
                    str3 = str3;
                    arrayList = arrayList;
                    i31 = i31;
                    i17 = i17;
                    c22723 = c22723;
                    sArr2 = sArr2;
                    if ((i29 + i30) - i28 < 0) {
                        iM450210 = (i14 - ThreadFactoryC3888.m11306("᩹ۢ")) * (-113);
                        i3 = ((iM450210 ^ i13) * (-8647)) ^ (-1111240446);
                        i4 = 1934927723;
                    } else {
                        iM450210 = C19806.m45029("ܽᩳ") ^ i14;
                        i3 = ((iM450210 ^ i13) * 4543) ^ 1780771987;
                        i4 = -964982157;
                    }
                    i5 = iM450210 ^ i4;
                    sArr2 = sArr2;
                    c22723 = c22723;
                    i31 = i31;
                    str3 = str3;
                    sb3 = sb3;
                    i16 = i5;
                    i15 = i3;
                    i17 = i17;
                    arrayList = arrayList;
                    break;
                case -1552264890:
                case -1075981947:
                    C1419.m4963(this.f41645, strM3407);
                    break;
                case -1478327838:
                case 1095848449:
                    arrayList = arrayList;
                    i17 = i17;
                    sb3 = sb3;
                    str3 = str3;
                    c22723 = c22723;
                    if (C0962.m3748(itM9863)) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ۡ") ^ i14;
                        i6 = ((iM11306 ^ i13) * 24913) ^ 225037154;
                        i7 = -1423025991;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹۠") + i13) * 37;
                        i6 = ((iM11306 ^ i14) * (-28345)) ^ 2050468771;
                        i7 = 932201443;
                    }
                    i16 = iM11306 ^ i7;
                    i15 = i6;
                    c22723 = c22723;
                    str3 = str3;
                    sb3 = sb3;
                    i17 = i17;
                    arrayList = arrayList;
                    break;
                case -1336995179:
                case 2110348315:
                    sb3 = sb3;
                    str3 = str3;
                    arrayList = arrayList;
                    i31 = i31;
                    i17 = i17;
                    c22723 = c22723;
                    sArr2 = sArr2;
                    c = 339;
                    if (RunnableC1564.m5345()) {
                        iM450210 = (ThreadFactoryC3888.m11306("ۚۧ") ^ i13) * 73;
                        i3 = ((iM450210 ^ i14) * (-19169)) ^ (-657956306);
                        i4 = 1959634395;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("֡۟") ^ i13;
                        i3 = ((iM450210 ^ i14) * (-29469)) ^ 1975604917;
                        i4 = 1936625249;
                    }
                    i5 = iM450210 ^ i4;
                    sArr2 = sArr2;
                    c22723 = c22723;
                    i31 = i31;
                    str3 = str3;
                    sb3 = sb3;
                    i16 = i5;
                    i15 = i3;
                    i17 = i17;
                    arrayList = arrayList;
                    break;
                case -1298756588:
                case 770176607:
                    i27 = this.f19660;
                    iArr = this.f19665;
                    i33 = i34;
                    i32 = 0;
                    i22 = 0;
                    iM11306 = C19806.m45029("ۘܺ") ^ i14;
                    i6 = ((iM11306 ^ i13) * 27591) ^ (-1544384281);
                    i7 = 1446326734;
                    i16 = iM11306 ^ i7;
                    i15 = i6;
                    c22723 = c22723;
                    str3 = str3;
                    sb3 = sb3;
                    i17 = i17;
                    arrayList = arrayList;
                    break;
                case -1142329275:
                case -581530541:
                    if (this.f19664 != null) {
                        iM45029 = (i13 - ThreadFactoryC3888.m11306("ۨ᩷")) * (-53);
                        i = ((iM45029 ^ i14) * (-449)) ^ 473899100;
                        i2 = 228141212;
                    } else {
                        strM3407 = strM6674;
                        iM45029 = ThreadFactoryC3888.m11306("᩷᩺") ^ i13;
                        i = ((iM45029 ^ i14) * (-25403)) ^ (-73201682);
                        i2 = -1340682399;
                    }
                    i16 = iM45029 ^ i2;
                    i15 = i;
                    break;
                case -1122093984:
                case -917409121:
                    int i36 = i17;
                    StringBuilder sb4 = sb3;
                    String str4 = str3;
                    int i37 = i31;
                    C22722 c22725 = c22723;
                    short[] sArr4 = sArr2;
                    ArrayList arrayList2 = this.f19666;
                    if (arrayList2 == null) {
                        iM450213 = C19806.m45029("ۧᩴ") ^ i14;
                        i = ((iM450213 ^ i13) * (-16087)) ^ (-583396643);
                        i11 = -1484883493;
                    } else {
                        iM450213 = C19806.m45029("᩺ۤ") ^ i14;
                        i = ((iM450213 ^ i13) * (-6051)) ^ (-507635742);
                        i11 = 1893268470;
                    }
                    sArr2 = sArr4;
                    c22723 = c22725;
                    i31 = i37;
                    str3 = str4;
                    sb3 = sb4;
                    i16 = iM450213 ^ i11;
                    i17 = i36;
                    arrayList = arrayList2;
                    i15 = i;
                    break;
                case -1078226256:
                case 481173815:
                    sb3 = sb3;
                    str3 = str3;
                    arrayList = arrayList;
                    i31 = i31;
                    i17 = i17;
                    c22723 = c22723;
                    sArr2 = sArr2;
                    sArr = f19653;
                    if (C3577.f13150 >= 0) {
                        iM450210 = C19806.m45029("᩸֨") ^ i14;
                        i3 = ((iM450210 ^ i13) * (-29395)) ^ (-245646622);
                        i4 = -1270717902;
                    } else {
                        iM450210 = C19806.m45029("ۜᩴ") ^ i14;
                        i3 = ((iM450210 ^ i13) * (-27669)) ^ (-23443992);
                        i4 = -705440541;
                    }
                    i5 = iM450210 ^ i4;
                    sArr2 = sArr2;
                    c22723 = c22723;
                    i31 = i31;
                    str3 = str3;
                    sb3 = sb3;
                    i16 = i5;
                    i15 = i3;
                    i17 = i17;
                    arrayList = arrayList;
                    break;
                case -1027432232:
                case 127673818:
                    C1419.m4963(this.f41645, this.f19664);
                    break;
                case -922487962:
                case -707813385:
                    if (C0050.f912 <= 0) {
                        sb3 = sb3;
                        str3 = str3;
                        arrayList = arrayList;
                        i31 = i31;
                        i17 = i17;
                        c22723 = c22723;
                        sArr2 = sArr2;
                        iM450210 = (ThreadFactoryC3888.m11306("ۚۧ") ^ i13) * 73;
                        i3 = ((iM450210 ^ i14) * (-19169)) ^ (-657956306);
                        i4 = 1959634395;
                        i5 = iM450210 ^ i4;
                        sArr2 = sArr2;
                        c22723 = c22723;
                        i31 = i31;
                        str3 = str3;
                        sb3 = sb3;
                        i16 = i5;
                        i15 = i3;
                        i17 = i17;
                        arrayList = arrayList;
                    } else {
                        iM45029 = C19806.m45029("֨ۛ") ^ i14;
                        i = ((iM45029 ^ i13) * 28785) ^ 597540051;
                        i2 = -1771842980;
                        i16 = iM45029 ^ i2;
                        i15 = i;
                    }
                    break;
                case -829338979:
                case 1914439967:
                    str2 = str3;
                    arrayList = arrayList;
                    i17 = i17;
                    c22723 = c22723;
                    StringBuilder sb5 = sb2;
                    c22722 = (C22722) C0216.m1584(itM9863);
                    if (!c22722.m50371()) {
                        iM450211 = C19806.m45029("ܳ۫") ^ i13;
                        sb2 = sb5;
                        i3 = ((iM450211 ^ i14) * 10729) ^ (-390140689);
                        i9 = 1416024993;
                        i16 = iM450211 ^ i9;
                        c22723 = c22723;
                        str3 = str2;
                        i15 = i3;
                        i17 = i17;
                        arrayList = arrayList;
                    } else {
                        sb2 = sb5;
                        str3 = str2;
                        iM11306 = ThreadFactoryC3888.m11306("ۖ֡") ^ i14;
                        i6 = ((iM11306 ^ i13) * 27035) ^ 1823616792;
                        i7 = 619553508;
                        i16 = iM11306 ^ i7;
                        i15 = i6;
                        c22723 = c22723;
                        str3 = str3;
                        sb3 = sb3;
                        i17 = i17;
                        arrayList = arrayList;
                    }
                    break;
                case -771919508:
                case 980615068:
                    RunnableC1564.m5345();
                    if (C3535.m10431() > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۛ") ^ i13;
                        i = ((iM45029 ^ i14) * (-12407)) ^ 156059266;
                        i2 = 2025786801;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ֡") ^ i13;
                        i = ((iM45029 ^ i14) * (-26293)) ^ 990092742;
                        i2 = -1658142315;
                    }
                    i16 = iM45029 ^ i2;
                    i15 = i;
                    break;
                case -639339443:
                case 1773092098:
                    strM3361 = C0797.m3361(sArr3, i17, i19, i18);
                    if (C1025.f4800 < 0) {
                        iM45029 = C19806.m45029("ۙ۟") ^ i14;
                        i = ((iM45029 ^ i13) * (-19455)) ^ 404918957;
                        i2 = 681240492;
                        i16 = iM45029 ^ i2;
                        i15 = i;
                    } else {
                        sb3 = sb3;
                        str3 = str3;
                        arrayList = arrayList;
                        i31 = i31;
                        i17 = i17;
                        c22723 = c22723;
                        sArr2 = sArr2;
                        iM450210 = (C19806.m45029("ۡ֨") ^ i13) * 21;
                        i3 = ((iM450210 ^ i14) * (-15647)) ^ 1288773061;
                        i4 = -125574897;
                        i5 = iM450210 ^ i4;
                        sArr2 = sArr2;
                        c22723 = c22723;
                        i31 = i31;
                        str3 = str3;
                        sb3 = sb3;
                        i16 = i5;
                        i15 = i3;
                        i17 = i17;
                        arrayList = arrayList;
                    }
                    break;
                case -203469567:
                case 911991643:
                    if (RunnableC1606.f6488 >= 0) {
                        sb3 = sb3;
                        str3 = str3;
                        arrayList = arrayList;
                        i31 = i31;
                        i17 = i17;
                        c22723 = c22723;
                        sArr2 = sArr2;
                        iM450210 = C19806.m45029("᩸֨") ^ i14;
                        i3 = ((iM450210 ^ i13) * (-29395)) ^ (-245646622);
                        i4 = -1270717902;
                        i5 = iM450210 ^ i4;
                        sArr2 = sArr2;
                        c22723 = c22723;
                        i31 = i31;
                        str3 = str3;
                        sb3 = sb3;
                        i16 = i5;
                        i15 = i3;
                        i17 = i17;
                        arrayList = arrayList;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۛ") ^ i13;
                        i = ((iM45029 ^ i14) * (-12407)) ^ 156059266;
                        i2 = 2025786801;
                        i16 = iM45029 ^ i2;
                        i15 = i;
                    }
                    break;
                case -141378149:
                case 890443280:
                    sArr3 = f19653;
                    i17 = 341;
                    i19 = 3;
                    if (C3743.m10966() > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۟ۗ") ^ i14;
                        i = ((iM45029 ^ i13) * 9271) ^ (-2004932815);
                        i2 = 202624948;
                        i16 = iM45029 ^ i2;
                        i15 = i;
                    } else {
                        sb3 = sb3;
                        str3 = str3;
                        arrayList = arrayList;
                        c22723 = c22723;
                        int iM113010 = (ThreadFactoryC3888.m11306("᩻ܰ") + i14) * (-119);
                        arrayList = arrayList;
                        sb = sb3;
                        i16 = iM113010 ^ 2097423229;
                        i15 = ((iM113010 ^ i13) * (-23635)) ^ 1144782626;
                        c22723 = c22723;
                        str3 = str3;
                        sb3 = sb;
                    }
                    break;
                case -131037900:
                case 538078168:
                    str3 = str3;
                    arrayList = arrayList;
                    i17 = i17;
                    c22723 = c22723;
                    StringBuilder sb6 = new StringBuilder();
                    C0817.m3408(sb6, i20);
                    if (RunnableC0195.f1321 >= 0) {
                        sb3 = sb6;
                        sArr2 = sArr2;
                        i31 = i31;
                        iM450210 = (ThreadFactoryC3888.m11306("ۚۧ") ^ i13) * 73;
                        i3 = ((iM450210 ^ i14) * (-19169)) ^ (-657956306);
                        i4 = 1959634395;
                        i5 = iM450210 ^ i4;
                        sArr2 = sArr2;
                        c22723 = c22723;
                        i31 = i31;
                        str3 = str3;
                        sb3 = sb3;
                        i16 = i5;
                        i15 = i3;
                        i17 = i17;
                        arrayList = arrayList;
                    } else {
                        int iM113011 = (ThreadFactoryC3888.m11306("ۗۨ") ^ i13) * 37;
                        int i38 = ((iM113011 ^ i14) * 19935) ^ (-481762281);
                        i16 = iM113011 ^ (-826464074);
                        i17 = i17;
                        arrayList = arrayList;
                        sb3 = sb6;
                        i15 = i38;
                        c22723 = c22723;
                        str3 = str3;
                    }
                    break;
                case -26742838:
                case 1109416581:
                    C0050.m946();
                    if (C1668.f6641 >= 0) {
                        iM45029 = C19806.m45029("ۘܳ") ^ i14;
                        i = ((iM45029 ^ i13) * (-14663)) ^ 1995262139;
                        i2 = -176649565;
                    } else {
                        iM45029 = C19806.m45029("֨ۛ") ^ i14;
                        i = ((iM45029 ^ i13) * 28785) ^ 597540051;
                        i2 = -1771842980;
                    }
                    i16 = iM45029 ^ i2;
                    i15 = i;
                    break;
                case 23120409:
                case 474648139:
                    str = str3;
                    StringBuilder sb7 = sb2;
                    C2788.m8480(sb7, str);
                    C0817.m3408(sb7, i32);
                    strM6674 = C2124.m6674(sb7);
                    sb3 = sb3;
                    iM11307 = (C19806.m45029("ۗ۠") ^ i13) * (-15);
                    str3 = str;
                    i15 = ((iM11307 ^ i14) * 1223) ^ 167537075;
                    i8 = 19458830;
                    i16 = iM11307 ^ i8;
                    c22723 = c22723;
                    str3 = str3;
                    sb3 = sb3;
                    i17 = i17;
                    arrayList = arrayList;
                    break;
                case 28397855:
                case 1427869009:
                    str = str3;
                    sb3 = sb3;
                    C2788.m8480(sb3, str);
                    C0817.m3408(sb3, i21);
                    strM6674 = C2124.m6674(sb3);
                    iM11307 = (C19806.m45029("ۗ۠") ^ i13) * (-15);
                    str3 = str;
                    i15 = ((iM11307 ^ i14) * 1223) ^ 167537075;
                    i8 = 19458830;
                    i16 = iM11307 ^ i8;
                    c22723 = c22723;
                    str3 = str3;
                    sb3 = sb3;
                    i17 = i17;
                    arrayList = arrayList;
                    break;
                case 231928413:
                case 864666562:
                    int i39 = i27;
                    arrayList = arrayList;
                    i17 = i17;
                    sb3 = sb3;
                    str3 = str3;
                    c22723 = c22723;
                    if (i33 >= i39) {
                        i27 = i39;
                        iM11306 = C19806.m45029("ۧۚ") ^ i13;
                        i6 = ((iM11306 ^ i14) * (-11125)) ^ 176443520;
                        i7 = 1246774144;
                        i16 = iM11306 ^ i7;
                        i15 = i6;
                        c22723 = c22723;
                        str3 = str3;
                        sb3 = sb3;
                        i17 = i17;
                        arrayList = arrayList;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("᩹֫") + i14) * 99;
                        i27 = i39;
                        i15 = ((iM11307 ^ i13) * (-12577)) ^ (-1576859679);
                        i8 = -941129121;
                        i16 = iM11307 ^ i8;
                        c22723 = c22723;
                        str3 = str3;
                        sb3 = sb3;
                        i17 = i17;
                        arrayList = arrayList;
                    }
                    break;
                case 359131442:
                case 1669301456:
                    sb3 = sb3;
                    str3 = str3;
                    arrayList = arrayList;
                    i17 = i17;
                    c22723 = c22723;
                    boolean z2 = this.f19673;
                    sArr2 = f19653;
                    i31 = 340;
                    if (C0216.f1393 == 0) {
                        int iM450215 = C19806.m45029("֡ۘ") ^ i13;
                        z = z2;
                        i15 = ((iM450215 ^ i14) * 7217) ^ (-721114906);
                        c22723 = c22723;
                        str3 = str3;
                        sb3 = sb3;
                        i16 = iM450215 ^ 965410552;
                        i17 = i17;
                        arrayList = arrayList;
                    } else {
                        z = z2;
                        i17 = i17;
                        int iM113012 = (ThreadFactoryC3888.m11306("᩻ܰ") + i14) * (-119);
                        arrayList = arrayList;
                        sb = sb3;
                        i16 = iM113012 ^ 2097423229;
                        i15 = ((iM113012 ^ i13) * (-23635)) ^ 1144782626;
                        c22723 = c22723;
                        str3 = str3;
                        sb3 = sb;
                    }
                    break;
                case 624712672:
                case 719690603:
                    C22722 c22726 = c22723;
                    arrayList = arrayList;
                    i17 = i17;
                    StringBuilder sb8 = sb3;
                    short[] sArr5 = sArr2;
                    int i40 = i31;
                    String strM3009 = C0671.m3009(sArr5, i40, 1, i18);
                    i34 = 0;
                    if (!z) {
                        int iM450216 = C19806.m45029("ۢܰ") ^ i13;
                        i3 = ((iM450216 ^ i14) * (-7691)) ^ (-235854250);
                        i5 = iM450216 ^ 1185412402;
                        sArr2 = sArr5;
                        c22723 = c22726;
                        sb3 = sb8;
                        str3 = strM3009;
                        i31 = i40;
                        i16 = i5;
                        i15 = i3;
                        i17 = i17;
                        arrayList = arrayList;
                    } else {
                        int iM113013 = (ThreadFactoryC3888.m11306("֫᩻") + i13) * (-105);
                        i15 = ((iM113013 ^ i14) * (-15973)) ^ 396419837;
                        i31 = i40;
                        sArr2 = sArr5;
                        c22723 = c22726;
                        i17 = i17;
                        str3 = strM3009;
                        arrayList = arrayList;
                        sb = sb8;
                        i16 = iM113013 ^ (-1270415880);
                        sb3 = sb;
                    }
                    break;
                case 1191830909:
                case 1502368400:
                    i23 = i21 + 1;
                    C22722 c22727 = c22722;
                    if (c22727.f74020 != null) {
                        int iM450217 = (C19806.m45029("ۢۖ") + i13) * 93;
                        c22722 = c22727;
                        i15 = ((iM450217 ^ i14) * (-32117)) ^ (-879625623);
                        i16 = iM450217 ^ (-1151080517);
                    } else {
                        c22722 = c22727;
                        i21 = i23;
                        arrayList = arrayList;
                        i17 = i17;
                        str3 = str3;
                        c22723 = c22723;
                        iM11306 = ThreadFactoryC3888.m11306("ۖ֡") ^ i14;
                        i6 = ((iM11306 ^ i13) * 27035) ^ 1823616792;
                        i7 = 619553508;
                        i16 = iM11306 ^ i7;
                        i15 = i6;
                        c22723 = c22723;
                        str3 = str3;
                        sb3 = sb3;
                        i17 = i17;
                        arrayList = arrayList;
                    }
                    break;
                case 1339290741:
                case 1808795188:
                    if (C2642.m8171() == 0) {
                        str2 = str3;
                        arrayList = arrayList;
                        i17 = i17;
                        int iM450218 = (C19806.m45029("ۛ᩵") + i14) * 57;
                        C22722 c22728 = c22723;
                        int i310 = ((iM450218 ^ i13) * (-6911)) ^ 1006074260;
                        i16 = iM450218 ^ 1258264798;
                        i17 = i17;
                        arrayList = arrayList;
                        str3 = str2;
                        i15 = i310;
                        c22723 = c22728;
                    } else {
                        iM45029 = C19806.m45029("ۘܳ") ^ i14;
                        i = ((iM45029 ^ i13) * (-14663)) ^ 1995262139;
                        i2 = -176649565;
                        i16 = iM45029 ^ i2;
                        i15 = i;
                    }
                    break;
                case 1497321367:
                case 1771017124:
                    str2 = str3;
                    arrayList = arrayList;
                    i17 = i17;
                    StringBuilder sb9 = new StringBuilder();
                    C2124.m6683(sb9, i22);
                    if (C0671.f2816 == 0) {
                        c22723 = c22723;
                        iM450211 = ThreadFactoryC3888.m11306("᩷֡") ^ i14;
                        sb2 = sb9;
                        i3 = ((iM450211 ^ i13) * 22801) ^ 1794497010;
                        i9 = 1692391805;
                        i16 = iM450211 ^ i9;
                        c22723 = c22723;
                        str3 = str2;
                        i15 = i3;
                        i17 = i17;
                        arrayList = arrayList;
                    } else {
                        sb2 = sb9;
                        int iM450219 = (C19806.m45029("ۛ᩵") + i14) * 57;
                        C22722 c22729 = c22723;
                        int i311 = ((iM450219 ^ i13) * (-6911)) ^ 1006074260;
                        i16 = iM450219 ^ 1258264798;
                        i17 = i17;
                        arrayList = arrayList;
                        str3 = str2;
                        i15 = i311;
                        c22723 = c22729;
                    }
                    break;
                case 1620587984:
                case 1836855940:
                    if (C3743.m10966() <= 0) {
                        sb3 = sb3;
                        str3 = str3;
                        arrayList = arrayList;
                        c22723 = c22723;
                        int iM113014 = (ThreadFactoryC3888.m11306("᩻ܰ") + i14) * (-119);
                        arrayList = arrayList;
                        sb = sb3;
                        i16 = iM113014 ^ 2097423229;
                        i15 = ((iM113014 ^ i13) * (-23635)) ^ 1144782626;
                        c22723 = c22723;
                        str3 = str3;
                        sb3 = sb;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ֡") ^ i13;
                        i = ((iM45029 ^ i14) * (-26293)) ^ 990092742;
                        i2 = -1658142315;
                        i16 = iM45029 ^ i2;
                        i15 = i;
                    }
                    break;
                case 1779063424:
                case 1799052021:
                    i18 = 33120;
                    iM450210 = C19806.m45029("ܽܶ") ^ i13;
                    i3 = ((iM450210 ^ i14) * 21319) ^ 320384986;
                    i4 = -633453118;
                    i5 = iM450210 ^ i4;
                    sArr2 = sArr2;
                    c22723 = c22723;
                    i31 = i31;
                    str3 = str3;
                    sb3 = sb3;
                    i16 = i5;
                    i15 = i3;
                    i17 = i17;
                    arrayList = arrayList;
                    break;
                default:
                    i18 = 11879;
                    iM450210 = C19806.m45029("ܽܶ") ^ i13;
                    i3 = ((iM450210 ^ i14) * 21319) ^ 320384986;
                    i4 = -633453118;
                    i5 = iM450210 ^ i4;
                    sArr2 = sArr2;
                    c22723 = c22723;
                    i31 = i31;
                    str3 = str3;
                    sb3 = sb3;
                    i16 = i5;
                    i15 = i3;
                    i17 = i17;
                    arrayList = arrayList;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0441 A[PHI: r3 r4 r17 r18 r20 r21
      0x0441: PHI (r3v33 boolean) = (r3v32 boolean), (r3v1 boolean), (r3v1 boolean) binds: [B:76:0x043e, B:69:0x02cf, B:61:0x0268] A[DONT_GENERATE, DONT_INLINE]
      0x0441: PHI (r4v10 l.᩷۠ۚ) = (r4v8 l.᩷۠ۚ), (r4v1 l.᩷۠ۚ), (r4v1 l.᩷۠ۚ) binds: [B:76:0x043e, B:69:0x02cf, B:61:0x0268] A[DONT_GENERATE, DONT_INLINE]
      0x0441: PHI (r17v16 int) = (r17v10 int), (r17v13 int), (r17v17 int) binds: [B:76:0x043e, B:69:0x02cf, B:61:0x0268] A[DONT_GENERATE, DONT_INLINE]
      0x0441: PHI (r18v4 int) = (r18v2 int), (r18v1 int), (r18v1 int) binds: [B:76:0x043e, B:69:0x02cf, B:61:0x0268] A[DONT_GENERATE, DONT_INLINE]
      0x0441: PHI (r20v8 l.ܿ۬ۨ) = (r20v4 l.ܿ۬ۨ), (r20v6 l.ܿ۬ۨ), (r20v9 l.ܿ۬ۨ) binds: [B:76:0x043e, B:69:0x02cf, B:61:0x0268] A[DONT_GENERATE, DONT_INLINE]
      0x0441: PHI (r21v8 java.lang.Exception) = (r21v4 java.lang.Exception), (r21v6 java.lang.Exception), (r21v9 java.lang.Exception) binds: [B:76:0x043e, B:69:0x02cf, B:61:0x0268] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iM45029;
        int i;
        int i2;
        int i3;
        int iM450210;
        int i4;
        int i5;
        boolean z = false;
        AbstractC20745 abstractC20745 = null;
        boolean z2 = false;
        Exception exc = null;
        C17367 c17367M40441 = null;
        Exception exc2 = null;
        int iM4036 = 0;
        int i6 = 0;
        boolean z3 = false;
        int i7 = 0;
        int i8 = -1517537908;
        int i9 = C3722.f13525;
        int i10 = C1148.f5161;
        int iM11306 = (ThreadFactoryC3888.m11306("۬ۛ") + i10) * (-17);
        int i11 = ((iM11306 ^ i9) * (-30709)) ^ 1668788191;
        int i12 = iM11306 ^ (-194967543);
        ArrayList arrayList = null;
        int i13 = 0;
        while (true) {
            int i14 = i12 ^ (i11 & (((i8 ^ i9) * 29763) >> 31));
            switch (i14) {
                case -2061667277:
                case 1904822284:
                    i3 = i14;
                    if (z3) {
                        iM450210 = (C19806.m45029("۫ۛ") + i9) * 83;
                        i4 = ((iM450210 ^ i10) * 28233) ^ (-604034162);
                        i5 = 1151474626;
                    } else {
                        iM450210 = C19806.m45029("ܳ᩹") ^ i10;
                        i4 = ((iM450210 ^ i9) * (-17337)) ^ 633988005;
                        i5 = -1242853160;
                    }
                    int i15 = i3;
                    i12 = iM450210 ^ i5;
                    i11 = i4;
                    i8 = i15;
                    break;
                case -1869742214:
                case -1694916926:
                    c17367M40441 = c17367M40441;
                    exc2 = exc2;
                    i14 = i14;
                    if (C2788.m8474(abstractC20745)) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘܰ") ^ i9;
                        i = ((iM45029 ^ i10) * 14925) ^ (-1978925088);
                        i2 = -1003034359;
                    } else {
                        iM45029 = C19806.m45029("ۜᩴ") ^ i9;
                        i = ((iM45029 ^ i10) * (-18599)) ^ 444139866;
                        i2 = 1758583359;
                    }
                    int i16 = iM45029 ^ i2;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i16;
                    i11 = i;
                    c17367M40441 = c17367M40441;
                    break;
                case -1825531493:
                case -1269683044:
                    i7 = 64878;
                    iM45029 = (ThreadFactoryC3888.m11306("۠ۚ") + i10) * (-41);
                    i = ((iM45029 ^ i9) * (-17419)) ^ (-1338507981);
                    i2 = 1478397003;
                    int i17 = iM45029 ^ i2;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i17;
                    i11 = i;
                    c17367M40441 = c17367M40441;
                    break;
                case -1724816862:
                case 861981689:
                    C7105.m18993(this.f19659, new ViewOnClickListenerC16758(2, this));
                    this.f19659.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.᩵ۗۨ
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view) {
                            AbstractActivityC5788 abstractActivityC5788 = null;
                            int i18 = 607182262;
                            int i19 = C0629.f2722;
                            int i20 = C1398.f5802;
                            int iM450211 = C19806.m45029("ۘۤ") ^ i19;
                            int i21 = ((iM450211 ^ i20) * (-15723)) ^ 946138507;
                            int i22 = -1394858804;
                            while (true) {
                                i18 = ((((i18 ^ i20) * 15393) >> 31) & i21) ^ (iM450211 ^ i22);
                                switch (i18) {
                                    case -2054601196:
                                    case -91156037:
                                        if (C2477.f9839 <= 0) {
                                            iM450211 = C19806.m45029("ۘۙ") ^ i19;
                                            i21 = ((iM450211 ^ i20) * 14119) ^ 1044919286;
                                            i22 = -139035007;
                                        } else {
                                            iM450211 = (ThreadFactoryC3888.m11306("ۜ᩶") + i20) * 65;
                                            i21 = ((iM450211 ^ i19) * (-11785)) ^ 106123594;
                                            i22 = -1792286835;
                                        }
                                        break;
                                    case -2047555727:
                                    case 930324205:
                                        C1668.m5583();
                                        if (CallableC1627.m5507() == 0) {
                                            iM450211 = (i20 - C19806.m45029("ۤܶ")) * 19;
                                            i21 = ((iM450211 ^ i19) * (-5127)) ^ 72327888;
                                            i22 = -1897965115;
                                        } else {
                                            iM450211 = C19806.m45029("۠᩸") ^ i19;
                                            i21 = ((iM450211 ^ i20) * 25631) ^ (-1665690028);
                                            i22 = -1301772523;
                                        }
                                        break;
                                    case -1717829286:
                                    case 735281238:
                                        if (C0526.m2437() >= 0) {
                                            iM450211 = C19806.m45029("ۘۙ") ^ i19;
                                            i21 = ((iM450211 ^ i20) * 14119) ^ 1044919286;
                                            i22 = -139035007;
                                        } else {
                                            iM450211 = C19806.m45029("ۜۙ") ^ i19;
                                            i21 = ((iM450211 ^ i20) * (-22221)) ^ (-903275485);
                                            i22 = -1763291731;
                                        }
                                        break;
                                    case -1700344315:
                                    case 1734585656:
                                        C2332.m7079();
                                        iM450211 = C19806.m45029("ۘۙ") ^ i19;
                                        i21 = ((iM450211 ^ i20) * 14119) ^ 1044919286;
                                        i22 = -139035007;
                                        break;
                                    case -1593329591:
                                    case -1084357790:
                                        C2704.m8255();
                                        if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                                            iM450211 = (C19806.m45029("ܳ۟") ^ i20) * (-11);
                                            i21 = ((iM450211 ^ i19) * (-18921)) ^ 21350794;
                                            i22 = 1097615773;
                                        } else {
                                            iM450211 = C19806.m45029("ۘۙ") ^ i19;
                                            i21 = ((iM450211 ^ i20) * 14119) ^ 1044919286;
                                            i22 = -139035007;
                                        }
                                        break;
                                    case -1523623176:
                                    case 524262903:
                                        if (C7105.f23796 >= 0) {
                                            iM450211 = (C19806.m45029("ܳ۟") ^ i20) * (-11);
                                            i21 = ((iM450211 ^ i19) * (-18921)) ^ 21350794;
                                            i22 = 1097615773;
                                        } else {
                                            iM450211 = C19806.m45029("֨᩻") ^ i19;
                                            i21 = ((iM450211 ^ i20) * 831) ^ (-1046515203);
                                            i22 = 1600570036;
                                        }
                                        break;
                                    case -1303183428:
                                    case -557416674:
                                        AbstractActivityC5788.m15920(abstractActivityC5788);
                                        return true;
                                    case -1134704652:
                                    case 809883241:
                                        if (C0278.f1572 <= 0) {
                                            iM450211 = C19806.m45029("۠᩸") ^ i19;
                                            i21 = ((iM450211 ^ i20) * 25631) ^ (-1665690028);
                                            i22 = -1301772523;
                                        } else {
                                            iM450211 = C19806.m45029("ۘۙ") ^ i19;
                                            i21 = ((iM450211 ^ i20) * 14119) ^ 1044919286;
                                            i22 = -139035007;
                                        }
                                        break;
                                    case -1078776060:
                                    case -1010656170:
                                        if (C1377.f5749) {
                                            iM450211 = (ThreadFactoryC3888.m11306("ۚۙ") ^ i19) * 5;
                                            i21 = ((iM450211 ^ i20) * (-1573)) ^ 998849551;
                                            i22 = -1301796929;
                                        } else {
                                            iM450211 = (C19806.m45029("ܳ۟") ^ i20) * (-11);
                                            i21 = ((iM450211 ^ i19) * (-18921)) ^ 21350794;
                                            i22 = 1097615773;
                                        }
                                        break;
                                    case -750576552:
                                    case 947485289:
                                        if (C10634.f36300 >= 0) {
                                            iM450211 = (ThreadFactoryC3888.m11306("ۡ᩸") + i20) * 93;
                                            i21 = ((iM450211 ^ i19) * 321) ^ (-2091322564);
                                            i22 = -1871172471;
                                        } else {
                                            iM450211 = (C19806.m45029("ܶۜ") + i20) * 27;
                                            i21 = ((iM450211 ^ i19) * (-19005)) ^ (-1992493023);
                                            i22 = -817605165;
                                        }
                                        break;
                                    case -654446779:
                                    case 1706341722:
                                        if (C1148.f5161 <= 0) {
                                            iM450211 = C19806.m45029("۠᩸") ^ i19;
                                            i21 = ((iM450211 ^ i20) * 25631) ^ (-1665690028);
                                            i22 = -1301772523;
                                        } else {
                                            iM450211 = ThreadFactoryC3888.m11306("᩷ܽ") ^ i20;
                                            i21 = ((iM450211 ^ i19) * (-25181)) ^ (-960025708);
                                            i22 = 1909135673;
                                        }
                                        break;
                                    case -654220856:
                                    case 1275714467:
                                        if (C2642.f10294 <= 0) {
                                            iM450211 = C19806.m45029("۠᩸") ^ i19;
                                            i21 = ((iM450211 ^ i20) * 25631) ^ (-1665690028);
                                            i22 = -1301772523;
                                        } else {
                                            iM450211 = (ThreadFactoryC3888.m11306("᩶᩶") + i20) * (-91);
                                            i21 = ((iM450211 ^ i19) * (-9759)) ^ (-66298247);
                                            i22 = -2053418873;
                                        }
                                        break;
                                    case -151138817:
                                    case 1097901402:
                                        if (C0629.f2722 <= 0) {
                                            iM450211 = C19806.m45029("۠᩸") ^ i19;
                                            i21 = ((iM450211 ^ i20) * 25631) ^ (-1665690028);
                                            i22 = -1301772523;
                                        } else {
                                            iM450211 = C19806.m45029("ۘۘ") ^ i20;
                                            i21 = ((iM450211 ^ i19) * (-12135)) ^ 1869891358;
                                            i22 = 875197194;
                                        }
                                        break;
                                    case 1141943202:
                                    case 1397350236:
                                        if (C2871.f10837 >= 0) {
                                            iM450211 = (i20 - C19806.m45029("ۤܶ")) * 19;
                                            i21 = ((iM450211 ^ i19) * (-5127)) ^ 72327888;
                                            i22 = -1897965115;
                                        } else {
                                            iM450211 = ThreadFactoryC3888.m11306("ܿۤ") ^ i19;
                                            i21 = ((iM450211 ^ i20) * 8265) ^ (-324063431);
                                            i22 = 1377800731;
                                        }
                                        break;
                                    case 1218150091:
                                    case 1524438882:
                                        abstractActivityC5788 = this.f61971;
                                        if (C0817.f3443) {
                                            iM450211 = C19806.m45029("ۖᩳ") ^ i19;
                                            i21 = ((iM450211 ^ i20) * 22173) ^ (-835185418);
                                            i22 = -1589788379;
                                        } else {
                                            iM450211 = (ThreadFactoryC3888.m11306("ۡ᩸") + i20) * 93;
                                            i21 = ((iM450211 ^ i19) * 321) ^ (-2091322564);
                                            i22 = -1871172471;
                                        }
                                        break;
                                    default:
                                        C0797.m3359();
                                        C0629.m2907();
                                        return false;
                                }
                            }
                        }
                    });
                    break;
                case -1675098797:
                case 1821493084:
                    try {
                        this.f19659.m20965();
                        i3 = i14;
                        iM450210 = C19806.m45029("ܳ᩹") ^ i10;
                        i4 = ((iM450210 ^ i9) * (-17337)) ^ 633988005;
                        i5 = -1242853160;
                    } catch (Exception e) {
                        exc2 = e;
                        i3 = i14;
                        iM450210 = C19806.m45029("᩹ۖ") ^ i10;
                        i4 = ((iM450210 ^ i9) * 23637) ^ 1443672026;
                        i5 = -692761484;
                    }
                    int i18 = i3;
                    i12 = iM450210 ^ i5;
                    i11 = i4;
                    i8 = i18;
                    break;
                case -1626877727:
                case 1004921250:
                    i3 = i14;
                    mo1991();
                    iM450210 = (ThreadFactoryC3888.m11306("ۤ᩻") ^ i9) * 67;
                    i4 = ((iM450210 ^ i10) * (-26545)) ^ (-900102885);
                    i5 = -481394338;
                    int i19 = i3;
                    i12 = iM450210 ^ i5;
                    i11 = i4;
                    i8 = i19;
                    break;
                case -1609213009:
                case 1510634085:
                    i3 = i14;
                    C3660.m10788(arrayList, new C22722(c17367M40441));
                    iM450210 = (ThreadFactoryC3888.m11306("۟ܿ") ^ i10) * (-125);
                    i4 = ((iM450210 ^ i9) * (-22355)) ^ 623802047;
                    i5 = 2119141814;
                    int i110 = i3;
                    i12 = iM450210 ^ i5;
                    i11 = i4;
                    i8 = i110;
                    break;
                case -1582450822:
                case 1303315197:
                    z2 = false;
                    iM45029 = (ThreadFactoryC3888.m11306("۫᩷") + i10) * (-105);
                    i = ((iM45029 ^ i9) * 23313) ^ 175096438;
                    i2 = -2133716901;
                    int i111 = iM45029 ^ i2;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i111;
                    i11 = i;
                    c17367M40441 = c17367M40441;
                    break;
                case -1514223572:
                case 539202851:
                    c17367M40441 = c17367M40441;
                    exc2 = exc2;
                    i14 = i14;
                    if (z2) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳۖ") ^ i10;
                        i = ((iM45029 ^ i9) * 1831) ^ 1050106494;
                        i2 = 696516733;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶۙ") ^ i9;
                        i = ((iM45029 ^ i10) * (-7469)) ^ 1679137849;
                        i2 = 513486875;
                    }
                    int i112 = iM45029 ^ i2;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i112;
                    i11 = i;
                    c17367M40441 = c17367M40441;
                    break;
                case -1459279122:
                case -1262846092:
                    m31003(exc2, z);
                    break;
                case -1431875314:
                case 1626508993:
                    m31003(exc, z);
                    break;
                case -1424618513:
                case 51052636:
                    i7 = 59562;
                    iM45029 = (ThreadFactoryC3888.m11306("۠ۚ") + i10) * (-41);
                    i = ((iM45029 ^ i9) * (-17419)) ^ (-1338507981);
                    i2 = 1478397003;
                    int i113 = iM45029 ^ i2;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i113;
                    i11 = i;
                    c17367M40441 = c17367M40441;
                    break;
                case -1143624255:
                case 689256149:
                    i14 = i14;
                    c17367M40441 = c17367M40441;
                    exc2 = exc2;
                    this.f19669 = C1189.m4371(ApplicationC0716.f2992, C1668.m5577(f19653, 155, 23, i7), z);
                    iM45029 = (ThreadFactoryC3888.m11306("ܶ᩹") + i9) * 93;
                    i = ((iM45029 ^ i10) * (-8563)) ^ 1355275993;
                    i2 = -1089042326;
                    int i114 = iM45029 ^ i2;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i114;
                    i11 = i;
                    c17367M40441 = c17367M40441;
                    break;
                case -900189031:
                case 2086606017:
                    try {
                        i3 = i14;
                        try {
                            this.f19662.mo23642(C1148.m4221(this.f19668));
                            m15957();
                            iM450210 = (ThreadFactoryC3888.m11306("ۤ᩻") ^ i9) * 67;
                            i4 = ((iM450210 ^ i10) * (-26545)) ^ (-900102885);
                            i5 = -481394338;
                        } catch (Exception e2) {
                            e = e2;
                            exc2 = e;
                            iM450210 = C19806.m45029("᩹ۖ") ^ i10;
                            i4 = ((iM450210 ^ i9) * 23637) ^ 1443672026;
                            i5 = -692761484;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        i3 = i14;
                    }
                    int i115 = i3;
                    i12 = iM450210 ^ i5;
                    i11 = i4;
                    i8 = i115;
                    break;
                case -772461752:
                case 1811266365:
                    c17367M40441 = c17367M40441;
                    exc2 = exc2;
                    i14 = i14;
                    if (C2642.m8163(bundle, C1875.m6105(f19653, 148, 7, i7))) {
                        iM45029 = C19806.m45029("ۛܽ") ^ i9;
                        i = ((iM45029 ^ i10) * (-10019)) ^ 901165211;
                        i2 = -1242360990;
                    } else {
                        iM45029 = C19806.m45029("ۜᩴ") ^ i9;
                        i = ((iM45029 ^ i10) * (-18599)) ^ 444139866;
                        i2 = 1758583359;
                    }
                    int i116 = iM45029 ^ i2;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i116;
                    i11 = i;
                    c17367M40441 = c17367M40441;
                    break;
                case -757087360:
                case 721533852:
                    i3 = i14;
                    if (i6 < iM4036) {
                        iM450210 = ThreadFactoryC3888.m11306("᩵ܶ") ^ i9;
                        i4 = ((iM450210 ^ i10) * 29821) ^ 696533030;
                        i5 = 2138537694;
                    } else {
                        iM450210 = (C19806.m45029("ܽ᩵") ^ i10) * 13;
                        i4 = ((iM450210 ^ i9) * (-27965)) ^ 695138345;
                        i5 = 1514871501;
                    }
                    int i117 = i3;
                    i12 = iM450210 ^ i5;
                    i11 = i4;
                    i8 = i117;
                    break;
                case -734251332:
                case 1200500894:
                    c17367M40441 = c17367M40441;
                    exc2 = exc2;
                    i14 = i14;
                    super.onCreate(bundle);
                    m31023();
                    C2332.m7083(this, ThreadFactoryC3888.m11306(C1875.m6105(f19653, UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 3, i7)) ^ 2122515866);
                    RunnableC0195.m1436(this, ThreadFactoryC3888.m11306(C2788.m8470(f19653, 124, 3, i7)) ^ 2101367076);
                    C6938 c6938 = (C6938) C2332.m7083(this, C19806.m45029(C3577.m10571(f19653, 127, 3, i7)) ^ 2100091876);
                    this.f41645 = c6938;
                    C0216.m1585(this, c6938);
                    C7105.m18992(this);
                    C14494 onBackPressedDispatcher = getOnBackPressedDispatcher();
                    C8611 c8611 = new C8611(this);
                    RunnableC3388.m10051(onBackPressedDispatcher);
                    onBackPressedDispatcher.m34905(c8611);
                    RunnableC3388.m10053(this.f41645, new ViewOnClickListenerC10198(1, this));
                    C7935 c7935 = (C7935) RunnableC0195.m1436(this, C19806.m45029(C1419.m4969(f19653, 130, 3, i7)) ^ 2119897751);
                    this.f19659 = c7935;
                    c7935.m20971(ThreadFactoryC3888.m11306(ThreadFactoryC3888.m11312(f19653, 133, 3, i7)) ^ 2118301810, 0);
                    this.f19659.m20971(C19806.m45029(ThreadFactoryC3888.m11312(f19653, 136, 3, i7)) ^ 2129279075, 0);
                    this.f19659.m20971(C19806.m45029(C1148.m4230(f19653, 139, 3, i7)) ^ 2100405582, 45);
                    this.f19659.m20971(C19806.m45029(C3660.m10790(f19653, 142, 3, i7)) ^ 2098208207, 0);
                    this.f19659.m20971(ThreadFactoryC3888.m11306(C2477.m7604(f19653, 145, 3, i7)) ^ 2124915287, 0);
                    ListView listView = (ListView) RunnableC0195.m1436(this, R.id.list);
                    z = true;
                    listView.setFastScrollEnabled(true);
                    listView.setOnItemClickListener(this);
                    listView.setOnItemLongClickListener(this);
                    C17077 c17077 = new C17077(this);
                    this.f19657 = c17077;
                    listView.setAdapter((ListAdapter) c17077);
                    listView.setOnItemClickListener(this);
                    this.f19661 = new DialogInterfaceOnDismissListenerC8913(this);
                    AbstractC20745 abstractC20746 = f19655;
                    if (bundle != null) {
                        int iM11307 = ThreadFactoryC3888.m11306("ܿᩴ") ^ i9;
                        abstractC20745 = abstractC20746;
                        i11 = ((iM11307 ^ i10) * 14545) ^ (-1550528035);
                        i8 = i14;
                        exc2 = exc2;
                        i13 = 0;
                        i12 = iM11307 ^ 1317763058;
                    } else {
                        abstractC20745 = abstractC20746;
                        i13 = 0;
                        iM45029 = C19806.m45029("ۜᩴ") ^ i9;
                        i = ((iM45029 ^ i10) * (-18599)) ^ 444139866;
                        i2 = 1758583359;
                        int i118 = iM45029 ^ i2;
                        i8 = i14;
                        exc2 = exc2;
                        i12 = i118;
                        i11 = i;
                    }
                    c17367M40441 = c17367M40441;
                    break;
                case -619300669:
                case -95317441:
                    i3 = i14;
                    i6++;
                    iM450210 = ThreadFactoryC3888.m11306("ᩴ۠") ^ i9;
                    i4 = ((iM450210 ^ i10) * 6235) ^ 1731471959;
                    i5 = 243054250;
                    int i119 = i3;
                    i12 = iM450210 ^ i5;
                    i11 = i4;
                    i8 = i119;
                    break;
                case 231716380:
                case 1420896766:
                    c17367M40441 = c17367M40441;
                    exc2 = exc2;
                    i14 = i14;
                    if (mo8791()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡ۫") + i10) * (-119);
                        i = ((iM45029 ^ i9) * 7127) ^ (-625398575);
                        i2 = 418164696;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܶ᩹") + i9) * 93;
                        i = ((iM45029 ^ i10) * (-8563)) ^ 1355275993;
                        i2 = -1089042326;
                    }
                    int i1110 = iM45029 ^ i2;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i1110;
                    i11 = i;
                    c17367M40441 = c17367M40441;
                    break;
                case 478604949:
                case 1446493081:
                    i3 = i14;
                    c17367M40441 = C17367.m40441(AbstractC0464.m2302(abstractC20745));
                    iM4036 = C1066.m4036(c17367M40441);
                    try {
                        arrayList = new ArrayList(iM4036);
                        this.f19666 = arrayList;
                        this.f19671 = arrayList;
                        i6 = i13;
                        iM450210 = ThreadFactoryC3888.m11306("ᩴ۠") ^ i9;
                        i4 = ((iM450210 ^ i10) * 6235) ^ 1731471959;
                        i5 = 243054250;
                    } catch (Exception e4) {
                        exc2 = e4;
                        arrayList = null;
                        iM450210 = C19806.m45029("᩹ۖ") ^ i10;
                        i4 = ((iM450210 ^ i9) * 23637) ^ 1443672026;
                        i5 = -692761484;
                    }
                    int i1111 = i3;
                    i12 = iM450210 ^ i5;
                    i11 = i4;
                    i8 = i1111;
                    break;
                case 534362926:
                case 624420295:
                    c17367M40441 = c17367M40441;
                    exc2 = exc2;
                    i14 = i14;
                    try {
                        mo1990(z2);
                        iM45029 = (C19806.m45029("᩻۬") + i10) * 25;
                        i = ((iM45029 ^ i9) * 28973) ^ 1358087960;
                        i2 = 744762118;
                        int i1112 = iM45029 ^ i2;
                        i8 = i14;
                        exc2 = exc2;
                        i12 = i1112;
                    } catch (Exception e5) {
                        int iM11308 = ThreadFactoryC3888.m11306("ۛ֨") ^ i10;
                        i = ((iM11308 ^ i9) * (-10373)) ^ 1710545023;
                        i8 = i14;
                        exc2 = exc2;
                        i12 = iM11308 ^ 524355851;
                        exc = e5;
                    }
                    i11 = i;
                    c17367M40441 = c17367M40441;
                    break;
                case 643065086:
                case 1214493356:
                    i3 = i14;
                    C20190.m45649((InterfaceC0433) c17367M40441, -1985229329);
                    this.f19668 = C3660.m10781(c17367M40441);
                    this.f19667 = C1066.m4036(c17367M40441);
                    this.f19673 = C2249.m6907(c17367M40441);
                    this.f19665 = c17367M40441.m40460();
                    this.f19660 = C10634.m26819(c17367M40441);
                    this.f19670 = C10634.m26819(c17367M40441);
                    this.f19656 = C3660.m10781(c17367M40441);
                    this.f19658 = C3660.m10781(c17367M40441);
                    setTitle(c17367M40441.m40458());
                    this.f19664 = c17367M40441.m40448();
                    z3 = this.f19668;
                    iM450210 = ThreadFactoryC3888.m11306("᩵۟") ^ i9;
                    i4 = ((iM450210 ^ i10) * 29809) ^ 1699412344;
                    i5 = -1604290333;
                    int i1113 = i3;
                    i12 = iM450210 ^ i5;
                    i11 = i4;
                    i8 = i1113;
                    break;
                case 1754154668:
                case 1902708547:
                    c17367M40441 = c17367M40441;
                    exc2 = exc2;
                    i14 = i14;
                    short s = f19653[120];
                    if (((s * s) + 30625156) - (s * 11068) >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩵ۨ") ^ i9) * 65;
                        i = ((iM45029 ^ i10) * 5893) ^ (-281453803);
                        i2 = 802567398;
                    } else {
                        iM45029 = (C19806.m45029("ۛ۠") + i10) * 51;
                        i = ((iM45029 ^ i9) * 13839) ^ 2058526949;
                        i2 = -472386625;
                    }
                    int i1114 = iM45029 ^ i2;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i1114;
                    i11 = i;
                    c17367M40441 = c17367M40441;
                    break;
                default:
                    z2 = true;
                    iM45029 = (ThreadFactoryC3888.m11306("۫᩷") + i10) * (-105);
                    i = ((iM45029 ^ i9) * 23313) ^ 175096438;
                    i2 = -2133716901;
                    int i1115 = iM45029 ^ i2;
                    i8 = i14;
                    exc2 = exc2;
                    i12 = i1115;
                    i11 = i;
                    c17367M40441 = c17367M40441;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a3, code lost:
    
        if (l.RunnableC1895.f7152 == false) goto L16;
     */
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m15920(l.AbstractActivityC5788 r35) {
        /*
            Method dump skipped, instruction units count: 1556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC5788.m15920(l.ۛۗۨ):void");
    }

    @Override // l.AbstractActivityC12483, l.ActivityC19126, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f19661.m23203();
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0228 A[PHI: r4 r6 r22 r25
      0x0228: PHI (r4v3 boolean) = (r4v2 boolean), (r4v1 boolean) binds: [B:60:0x0226, B:52:0x01bd] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r6v2 int) = (r6v1 int), (r6v3 int) binds: [B:60:0x0226, B:52:0x01bd] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r22v19 l.᩷۠ۚ) = (r22v17 l.᩷۠ۚ), (r22v20 l.᩷۠ۚ) binds: [B:60:0x0226, B:52:0x01bd] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r25v13 java.lang.String) = (r25v11 java.lang.String), (r25v14 java.lang.String) binds: [B:60:0x0226, B:52:0x01bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x041b A[PHI: r7 r18 r22 r24 r25
      0x041b: PHI (r7v3 boolean) = (r7v1 boolean), (r7v1 boolean), (r7v2 boolean), (r7v1 boolean) binds: [B:96:0x0419, B:64:0x0267, B:48:0x0193, B:10:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x041b: PHI (r18v4 short[]) = (r18v3 short[]), (r18v2 short[]), (r18v2 short[]), (r18v2 short[]) binds: [B:96:0x0419, B:64:0x0267, B:48:0x0193, B:10:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x041b: PHI (r22v31 l.᩷۠ۚ) = (r22v5 l.᩷۠ۚ), (r22v16 l.᩷۠ۚ), (r22v21 l.᩷۠ۚ), (r22v32 l.᩷۠ۚ) binds: [B:96:0x0419, B:64:0x0267, B:48:0x0193, B:10:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x041b: PHI (r24v5 char) = (r24v4 char), (r24v3 char), (r24v3 char), (r24v3 char) binds: [B:96:0x0419, B:64:0x0267, B:48:0x0193, B:10:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x041b: PHI (r25v23 java.lang.String) = (r25v0 java.lang.String), (r25v10 java.lang.String), (r25v15 java.lang.String), (r25v24 java.lang.String) binds: [B:96:0x0419, B:64:0x0267, B:48:0x0193, B:10:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        int iM45029;
        int i;
        int i2;
        int iM450210;
        int i3;
        int i4;
        C11018 c11018 = null;
        Iterator itM9863 = null;
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        CharSequence title = null;
        String str = null;
        AbstractC20745 abstractC20745 = null;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = -1042161845;
        int i12 = C1066.f4915;
        int i13 = ThreadFactoryC3888.f14547;
        int iM11306 = ThreadFactoryC3888.m11306("᩸ᩴ") ^ i13;
        int i14 = ((iM11306 ^ i12) * (-29121)) ^ (-896364065);
        int i15 = iM11306 ^ (-1611062516);
        short[] sArr = null;
        int i16 = 0;
        ArrayList arrayList = null;
        char c = 0;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i12) * (-1345)) >> 31));
            switch (i11) {
                case -2111481047:
                case 1995637697:
                    i16 = 10273;
                    iM45029 = ThreadFactoryC3888.m11306("ۚۖ") ^ i13;
                    i = ((iM45029 ^ i12) * (-1903)) ^ (-310216927);
                    i2 = -1365354436;
                    int i17 = iM45029 ^ i2;
                    abstractC20745 = abstractC20745;
                    i15 = i17;
                    i14 = i;
                    str = str;
                    break;
                case -1766036025:
                case 757135535:
                    str = str;
                    abstractC20745 = abstractC20745;
                    C2477.m7595(c11018, i6);
                    c11018.m27784(this.f19656);
                    z2 = this.f19658;
                    if (C1377.m4833() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢ֡") + i12) * (-7);
                        i = ((iM45029 ^ i13) * 18519) ^ (-927617505);
                        i2 = 585455464;
                    } else {
                        iM45029 = (C19806.m45029("֨ۛ") ^ i13) * (-77);
                        i = ((iM45029 ^ i12) * (-18697)) ^ (-225797569);
                        i2 = 635593920;
                    }
                    int i18 = iM45029 ^ i2;
                    abstractC20745 = abstractC20745;
                    i15 = i18;
                    i14 = i;
                    str = str;
                    break;
                case -1666057749:
                case -631726140:
                    if (!RunnableC1895.f7152) {
                        int iM450211 = (i12 - C19806.m45029("ۛۜ")) * (-107);
                        i15 = iM450211 ^ 72877035;
                        i14 = ((iM450211 ^ i13) * (-3849)) ^ (-761042691);
                    } else {
                        abstractC20745 = abstractC20745;
                        iM450210 = ThreadFactoryC3888.m11306("۬ᩴ") ^ i13;
                        i3 = ((iM450210 ^ i12) * 1121) ^ (-1684481762);
                        i4 = -313633146;
                        AbstractC20745 abstractC20746 = abstractC20745;
                        i15 = iM450210 ^ i4;
                        i14 = i3;
                        abstractC20745 = abstractC20746;
                    }
                    break;
                case -1635536968:
                case 1349184956:
                    str = str;
                    abstractC20745 = abstractC20745;
                    i8 = i7 * i7;
                    i9 = s * s;
                    i10 = 56851600;
                    if (!C0526.f2219) {
                        iM45029 = C19806.m45029("᩹ۖ") ^ i12;
                        i = ((iM45029 ^ i13) * 29977) ^ (-510237891);
                        i2 = -1974787602;
                        int i19 = iM45029 ^ i2;
                        abstractC20745 = abstractC20745;
                        i15 = i19;
                        i14 = i;
                        str = str;
                    } else {
                        str = str;
                        iM450210 = ThreadFactoryC3888.m11306("۬ᩴ") ^ i13;
                        i3 = ((iM450210 ^ i12) * 1121) ^ (-1684481762);
                        i4 = -313633146;
                        AbstractC20745 abstractC20747 = abstractC20745;
                        i15 = iM450210 ^ i4;
                        i14 = i3;
                        abstractC20745 = abstractC20747;
                    }
                    break;
                case -1540231124:
                case 1434800081:
                    str = str;
                    abstractC20745 = abstractC20745;
                    s = sArr[c];
                    i7 = s + 7540;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿ۬") + i12) * (-53);
                        i = ((iM45029 ^ i13) * (-23101)) ^ 1988464355;
                        i2 = 1901646769;
                    } else {
                        iM45029 = C19806.m45029("᩻֨") ^ i13;
                        i = ((iM45029 ^ i12) * (-29033)) ^ 1255526058;
                        i2 = 1034292412;
                    }
                    int i110 = iM45029 ^ i2;
                    abstractC20745 = abstractC20745;
                    i15 = i110;
                    i14 = i;
                    str = str;
                    break;
                case -1201072035:
                case -816357849:
                    C1875.m6086();
                    if (C1977.f7413 > 0) {
                        str = str;
                        abstractC20745 = abstractC20745;
                        iM45029 = (ThreadFactoryC3888.m11306("ۢ֡") + i12) * (-7);
                        i = ((iM45029 ^ i13) * 18519) ^ (-927617505);
                        i2 = 585455464;
                        int i111 = iM45029 ^ i2;
                        abstractC20745 = abstractC20745;
                        i15 = i111;
                        i14 = i;
                        str = str;
                    } else {
                        int iM450212 = (i12 - C19806.m45029("ۛۜ")) * (-107);
                        i15 = iM450212 ^ 72877035;
                        i14 = ((iM450212 ^ i13) * (-3849)) ^ (-761042691);
                    }
                    break;
                case -1154667126:
                case 72502198:
                    C1937.m6279();
                    C3577.m10565();
                    break;
                case -1071265727:
                case 1808534009:
                    abstractC20745 = abstractC20745;
                    c11018.m27786(C2124.m6674(title));
                    str = this.f19664;
                    if (C0817.f3443) {
                        iM450210 = C19806.m45029("᩸᩺") ^ i12;
                        i3 = ((iM450210 ^ i13) * 8559) ^ 117542413;
                        i4 = -2143279715;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("۬ᩴ") ^ i13;
                        i3 = ((iM450210 ^ i12) * 1121) ^ (-1684481762);
                        i4 = -313633146;
                    }
                    AbstractC20745 abstractC20748 = abstractC20745;
                    i15 = iM450210 ^ i4;
                    i14 = i3;
                    abstractC20745 = abstractC20748;
                    break;
                case -949858506:
                case 1367884854:
                    str = str;
                    abstractC20745 = abstractC20745;
                    if (C0962.m3748(itM9863)) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴۢ") ^ i13) * (-125);
                        i = ((iM45029 ^ i12) * (-5051)) ^ 1870915671;
                        i2 = -1155333512;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴ᩹") ^ i12) * (-27);
                        i = ((iM45029 ^ i13) * (-10245)) ^ 1224554602;
                        i2 = -1529421150;
                    }
                    int i112 = iM45029 ^ i2;
                    abstractC20745 = abstractC20745;
                    i15 = i112;
                    i14 = i;
                    str = str;
                    break;
                case -912660492:
                case 1654316481:
                    str = str;
                    abstractC20745 = abstractC20745;
                    sArr = f19653;
                    c = 327;
                    if (C3577.m10565()) {
                        iM45029 = (C19806.m45029("֨ۡ") ^ i13) * q.h;
                        i = ((iM45029 ^ i12) * 31945) ^ (-1908467486);
                        i2 = 2079401496;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢ֡") + i12) * (-7);
                        i = ((iM45029 ^ i13) * 18519) ^ (-927617505);
                        i2 = 585455464;
                    }
                    int i113 = iM45029 ^ i2;
                    abstractC20745 = abstractC20745;
                    i15 = i113;
                    i14 = i;
                    str = str;
                    break;
                case -586018530:
                case 1966641234:
                    str = str;
                    abstractC20745 = abstractC20745;
                    C2477.m7595(c11018, i5);
                    i6 = this.f19670;
                    if (C2124.m6673() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۠ܳ") ^ i12;
                        i = ((iM45029 ^ i13) * 29045) ^ 2018936658;
                        i2 = 1441236631;
                    } else {
                        iM45029 = C19806.m45029("ܳ᩵") ^ i13;
                        i = ((iM45029 ^ i12) * (-5235)) ^ (-2079453888);
                        i2 = 2068024073;
                    }
                    int i114 = iM45029 ^ i2;
                    abstractC20745 = abstractC20745;
                    i15 = i114;
                    i14 = i;
                    str = str;
                    break;
                case -566070926:
                case 1976974450:
                    str = str;
                    abstractC20745 = abstractC20745;
                    RunnableC1606.m5475(c11018, this.f19667);
                    z = this.f19673;
                    if (C1398.f5802 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۠ܳ") ^ i12;
                        i = ((iM45029 ^ i13) * 29045) ^ 2018936658;
                        i2 = 1441236631;
                    } else {
                        iM45029 = (i12 - ThreadFactoryC3888.m11306("᩷᩸")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM45029 ^ i13) * 3363) ^ 1022358168;
                        i2 = 1424586074;
                    }
                    int i115 = iM45029 ^ i2;
                    abstractC20745 = abstractC20745;
                    i15 = i115;
                    i14 = i;
                    str = str;
                    break;
                case -536418155:
                case 1049450494:
                    str = str;
                    abstractC20745 = abstractC20745;
                    C2477.m7595(c11018, -1985229329);
                    c11018.m27784(this.f19668);
                    if (C2871.f10837 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢ֡") + i12) * (-7);
                        i = ((iM45029 ^ i13) * 18519) ^ (-927617505);
                        i2 = 585455464;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖۨ") + i13) * (-111);
                        i = ((iM45029 ^ i12) * 1191) ^ (-783739288);
                        i2 = 1413101124;
                    }
                    int i116 = iM45029 ^ i2;
                    abstractC20745 = abstractC20745;
                    i15 = i116;
                    i14 = i;
                    str = str;
                    break;
                case -438706596:
                case 130586555:
                    break;
                case -436255759:
                case 364717284:
                    c11018.m27783(str);
                    abstractC20745 = f19655;
                    RunnableC3388.m10052(abstractC20745);
                    int iM11307 = (i12 - ThreadFactoryC3888.m11306("ᩳ۟")) * 9;
                    str = str;
                    i = ((iM11307 ^ i13) * (-14611)) ^ 569684087;
                    i15 = iM11307 ^ (-800955574);
                    i14 = i;
                    str = str;
                    break;
                case -331819377:
                case 2125230212:
                    str = str;
                    abstractC20745 = abstractC20745;
                    c11018.m27784(z);
                    c11018.m27795(this.f19665);
                    i5 = this.f19660;
                    if (C2477.f9839 <= 0) {
                        iM45029 = (i13 - ThreadFactoryC3888.m11306("ܶܿ")) * (-89);
                        i = ((iM45029 ^ i12) * 24493) ^ 1499744429;
                        i2 = 1339840544;
                    } else {
                        iM45029 = (C19806.m45029("ۛ᩷") ^ i12) * 11;
                        i = ((iM45029 ^ i13) * (-23599)) ^ 1018963374;
                        i2 = -2112978344;
                    }
                    int i117 = iM45029 ^ i2;
                    abstractC20745 = abstractC20745;
                    i15 = i117;
                    i14 = i;
                    str = str;
                    break;
                case -328266241:
                case -269208579:
                    str = str;
                    abstractC20745 = abstractC20745;
                    int i20 = i9 + i10;
                    if ((i20 + i20) - i8 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۟ۧ") ^ i12;
                        i = ((iM45029 ^ i13) * 19805) ^ (-71583278);
                        i2 = 324006215;
                    } else {
                        iM45029 = C19806.m45029("ᩳ۫") ^ i13;
                        i = ((iM45029 ^ i12) * 32473) ^ (-1246748418);
                        i2 = 1844816856;
                    }
                    int i118 = iM45029 ^ i2;
                    abstractC20745 = abstractC20745;
                    i15 = i118;
                    i14 = i;
                    str = str;
                    break;
                case -214265359:
                case 1136787704:
                    try {
                        RunnableC1564.m5354(abstractC20745, c11018.m27798());
                        abstractC20745 = abstractC20745;
                        try {
                            try {
                                AbstractC0464.m2314(bundle, C1398.m4892(f19653, 328, 7, i16), true);
                                break;
                            } catch (IOException unused) {
                            }
                        } catch (IOException unused2) {
                        }
                    } catch (IOException unused3) {
                        abstractC20745 = abstractC20745;
                    }
                    str = str;
                    iM45029 = (i13 - C19806.m45029("ۖۚ")) * 97;
                    i = ((iM45029 ^ i12) * 23535) ^ 229252885;
                    i2 = 1589491996;
                    int i119 = iM45029 ^ i2;
                    abstractC20745 = abstractC20745;
                    i15 = i119;
                    i14 = i;
                    str = str;
                    break;
                case -117634812:
                case 1890518675:
                    str = str;
                    abstractC20745 = abstractC20745;
                    super.onSaveInstanceState(bundle);
                    ArrayList arrayList2 = this.f19671;
                    if (arrayList2 == null) {
                        arrayList = arrayList2;
                        iM45029 = (i13 - C19806.m45029("ۖۚ")) * 97;
                        i = ((iM45029 ^ i12) * 23535) ^ 229252885;
                        i2 = 1589491996;
                        int i1110 = iM45029 ^ i2;
                        abstractC20745 = abstractC20745;
                        i15 = i1110;
                        i14 = i;
                    } else {
                        int iM11308 = (ThreadFactoryC3888.m11306("ᩳ᩵") + i12) * (-93);
                        arrayList = arrayList2;
                        i14 = ((iM11308 ^ i13) * (-14001)) ^ 1715431184;
                        abstractC20745 = abstractC20745;
                        i15 = iM11308 ^ 1344748177;
                    }
                    str = str;
                    break;
                case 126277656:
                case 999627524:
                    i16 = 50858;
                    iM45029 = ThreadFactoryC3888.m11306("ۚۖ") ^ i13;
                    i = ((iM45029 ^ i12) * (-1903)) ^ (-310216927);
                    i2 = -1365354436;
                    int i1111 = iM45029 ^ i2;
                    abstractC20745 = abstractC20745;
                    i15 = i1111;
                    i14 = i;
                    str = str;
                    break;
                case 339786485:
                case 811299754:
                    C2124.m6673();
                    if (AbstractC0464.f2088 <= 0) {
                        str = str;
                        abstractC20745 = abstractC20745;
                        iM45029 = C19806.m45029("᩻֨") ^ i13;
                        i = ((iM45029 ^ i12) * (-29033)) ^ 1255526058;
                        i2 = 1034292412;
                        int i1112 = iM45029 ^ i2;
                        abstractC20745 = abstractC20745;
                        i15 = i1112;
                        i14 = i;
                        str = str;
                    }
                    str = str;
                    abstractC20745 = abstractC20745;
                    iM45029 = (ThreadFactoryC3888.m11306("ۢ֡") + i12) * (-7);
                    i = ((iM45029 ^ i13) * 18519) ^ (-927617505);
                    i2 = 585455464;
                    int i1113 = iM45029 ^ i2;
                    abstractC20745 = abstractC20745;
                    i15 = i1113;
                    i14 = i;
                    str = str;
                    break;
                case 355579501:
                case 384417061:
                    if (C1025.f4800 < 0) {
                        str = str;
                        abstractC20745 = abstractC20745;
                        iM45029 = ThreadFactoryC3888.m11306("ۨۤ") ^ i13;
                        i = ((iM45029 ^ i12) * (-27329)) ^ 524670405;
                        i2 = -1942238916;
                        int i1114 = iM45029 ^ i2;
                        abstractC20745 = abstractC20745;
                        i15 = i1114;
                        i14 = i;
                        str = str;
                    } else {
                        int iM450213 = (i12 - C19806.m45029("ۛۜ")) * (-107);
                        i15 = iM450213 ^ 72877035;
                        i14 = ((iM450213 ^ i13) * (-3849)) ^ (-761042691);
                    }
                    break;
                case 1190136705:
                case 1776984006:
                    ((C22722) C0278.m1776(itM9863)).m50368(c11018);
                    iM45029 = (i13 - C19806.m45029("֡᩻")) * (-113);
                    i = ((iM45029 ^ i12) * (-8807)) ^ (-1308926920);
                    i2 = -1881108832;
                    int i1115 = iM45029 ^ i2;
                    abstractC20745 = abstractC20745;
                    i15 = i1115;
                    i14 = i;
                    str = str;
                    break;
                case 1341197892:
                case 2129552250:
                    C2124.m6673();
                    C1025.m3861();
                    abstractC20745 = abstractC20745;
                    iM450210 = ThreadFactoryC3888.m11306("۬ᩴ") ^ i13;
                    i3 = ((iM450210 ^ i12) * 1121) ^ (-1684481762);
                    i4 = -313633146;
                    AbstractC20745 abstractC20749 = abstractC20745;
                    i15 = iM450210 ^ i4;
                    i14 = i3;
                    abstractC20745 = abstractC20749;
                    break;
                case 1498825697:
                case 2078412861:
                    C11018 c11019 = new C11018();
                    C2477.m7595(c11019, C1377.m4837(arrayList));
                    itM9863 = ViewTreeObserverOnPreDrawListenerC3327.m9863(arrayList);
                    c11018 = c11019;
                    iM45029 = (i13 - C19806.m45029("֡᩻")) * (-113);
                    i = ((iM45029 ^ i12) * (-8807)) ^ (-1308926920);
                    i2 = -1881108832;
                    int i1116 = iM45029 ^ i2;
                    abstractC20745 = abstractC20745;
                    i15 = i1116;
                    i14 = i;
                    str = str;
                    break;
                case 1808186421:
                case 2072419294:
                    C1461.m5080();
                    if (C0526.f2219) {
                        str = str;
                        abstractC20745 = abstractC20745;
                        iM45029 = (i13 - ThreadFactoryC3888.m11306("ܶܿ")) * (-89);
                        i = ((iM45029 ^ i12) * 24493) ^ 1499744429;
                        i2 = 1339840544;
                        int i1117 = iM45029 ^ i2;
                        abstractC20745 = abstractC20745;
                        i15 = i1117;
                        i14 = i;
                        str = str;
                    }
                    str = str;
                    abstractC20745 = abstractC20745;
                    iM45029 = ThreadFactoryC3888.m11306("ۨۤ") ^ i13;
                    i = ((iM45029 ^ i12) * (-27329)) ^ 524670405;
                    i2 = -1942238916;
                    int i1118 = iM45029 ^ i2;
                    abstractC20745 = abstractC20745;
                    i15 = i1118;
                    i14 = i;
                    str = str;
                    break;
                default:
                    str = str;
                    abstractC20745 = abstractC20745;
                    c11018.m27784(z2);
                    title = getTitle();
                    if (C1419.m4973()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۨۤ") ^ i13;
                        i = ((iM45029 ^ i12) * (-27329)) ^ 524670405;
                        i2 = -1942238916;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴܶ") ^ i12;
                        i = ((iM45029 ^ i13) * (-20279)) ^ 1666135760;
                        i2 = -1516578195;
                    }
                    int i1119 = iM45029 ^ i2;
                    abstractC20745 = abstractC20745;
                    i15 = i1119;
                    i14 = i;
                    str = str;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x021a  */
    /* JADX WARN: Code duplicated, block: B:57:0x025e  */
    /* JADX WARN: Code duplicated, block: B:60:0x028e A[PHI: r14 r15
      0x028e: PHI (r14v4 java.util.LinkedHashSet) = (r14v2 java.util.LinkedHashSet), (r14v3 java.util.LinkedHashSet), (r14v2 java.util.LinkedHashSet) binds: [B:58:0x0276, B:53:0x023e, B:41:0x01b4] A[DONT_GENERATE, DONT_INLINE]
      0x028e: PHI (r15v4 java.util.LinkedHashSet) = (r15v2 java.util.LinkedHashSet), (r15v3 java.util.LinkedHashSet), (r15v2 java.util.LinkedHashSet) binds: [B:58:0x0276, B:53:0x023e, B:41:0x01b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0192, code lost:
    
        if (l.ThreadFactoryC3888.f14547 <= 0) goto L8;
     */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m15943(boolean r47) {
        /*
            Method dump skipped, instruction units count: 2676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC5788.m15943(boolean):boolean");
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String mo15956() {
        throw new RuntimeException();
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0185  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ff A[PHI: r1
      0x01ff: PHI (r1v5 int[]) = (r1v2 int[]), (r1v2 int[]), (r1v4 int[]), (r1v2 int[]) binds: [B:70:0x01fd, B:66:0x01e1, B:53:0x014f, B:96:0x01ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15955(ArrayList arrayList) {
        int iM45029;
        int i;
        int[] iArr = null;
        int i2 = -1442875192;
        int i3 = C0050.f912;
        int i4 = C2788.f10625;
        int iM450210 = C19806.m45029("ܰ᩶") ^ i4;
        int i5 = ((iM450210 ^ i3) * 16061) ^ (-447600236);
        int i6 = iM450210 ^ (-484696179);
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        while (true) {
            C21051 c21051 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * 12071) >> 31) & i5) ^ i6;
                switch (i2) {
                    case -1899078562:
                    case -156825206:
                        if (C0962.f3784) {
                            iM45029 = ThreadFactoryC3888.m11306("᩵ܽ") ^ i4;
                            i5 = ((iM45029 ^ i3) * 18021) ^ (-1075903928);
                            i = 2006108526;
                        } else {
                            iM45029 = (C19806.m45029("ܽ᩶") + i3) * (-103);
                            i5 = ((iM45029 ^ i4) * 8167) ^ (-1299116038);
                            i = -1102552073;
                        }
                        i6 = iM45029 ^ i;
                        break;
                    case -1708317994:
                    case 1722967907:
                        m15952();
                        m15957();
                        break;
                    case -1568728880:
                    case 885579817:
                        C2704.m8255();
                        iM45029 = (C19806.m45029("ܽ᩶") + i3) * (-103);
                        i5 = ((iM45029 ^ i4) * 8167) ^ (-1299116038);
                        i = -1102552073;
                        i6 = iM45029 ^ i;
                        break;
                    case -1315866112:
                    case 1002386783:
                        if (C3535.f13026 > 0) {
                            int iM11306 = ThreadFactoryC3888.m11306("᩻᩵") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-10639)) ^ 1231954731;
                            i6 = iM11306 ^ (-1025013017);
                            arrayList2 = null;
                            arrayList3 = null;
                        } else {
                            iM45029 = (C19806.m45029("ܽ᩶") + i3) * (-103);
                            i5 = ((iM45029 ^ i4) * 8167) ^ (-1299116038);
                            i = -1102552073;
                            i6 = iM45029 ^ i;
                        }
                        break;
                    case -1106973585:
                    case 995117402:
                        C0216.m1591();
                        if (C1398.f5802 > 0) {
                            iM45029 = ThreadFactoryC3888.m11306("۟᩵") ^ i4;
                            i5 = ((iM45029 ^ i3) * 13107) ^ 1197618438;
                            i = 1686077344;
                            i6 = iM45029 ^ i;
                        } else {
                            int iM11307 = ThreadFactoryC3888.m11306("᩻᩵") ^ i3;
                            i5 = ((iM11307 ^ i4) * (-10639)) ^ 1231954731;
                            i6 = iM11307 ^ (-1025013017);
                            arrayList2 = null;
                            arrayList3 = null;
                        }
                        break;
                    case -872270482:
                    case 921832477:
                        if (C2642.m8171() != 0) {
                            iM45029 = ThreadFactoryC3888.m11306("۟᩵") ^ i4;
                            i5 = ((iM45029 ^ i3) * 13107) ^ 1197618438;
                            i = 1686077344;
                        } else {
                            iM45029 = C19806.m45029("ܺۤ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-18143)) ^ 993323259;
                            i = -1070991636;
                        }
                        i6 = iM45029 ^ i;
                        break;
                    case -830628943:
                    case 176134694:
                        iArr = new int[C0050.m938(arrayList)];
                        if (C3286.m9798() <= 0) {
                            iM45029 = ThreadFactoryC3888.m11306("۟᩵") ^ i4;
                            i5 = ((iM45029 ^ i3) * 13107) ^ 1197618438;
                            i = 1686077344;
                        } else {
                            iM45029 = C19806.m45029("᩺ۢ") ^ i3;
                            i5 = ((iM45029 ^ i4) * 21829) ^ (-1762090767);
                            i = 2128063523;
                        }
                        i6 = iM45029 ^ i;
                        break;
                    case -473563860:
                    case 2065422275:
                        this.f19663 = arrayList3;
                        if (C2124.f7782 > 0) {
                            c21051 = new C21051(1);
                            if (!RunnableC1895.f7152) {
                                int iM11308 = ThreadFactoryC3888.m11306("᩻᩵") ^ i3;
                                i5 = ((iM11308 ^ i4) * (-10639)) ^ 1231954731;
                                i6 = iM11308 ^ (-1025013017);
                                arrayList2 = null;
                                arrayList3 = null;
                            } else {
                                iM45029 = ThreadFactoryC3888.m11306("ۘۘ") ^ i4;
                                i5 = ((iM45029 ^ i3) * (-12417)) ^ (-1697472260);
                                i = -1871917557;
                                i6 = iM45029 ^ i;
                            }
                        }
                        break;
                    case -465613909:
                    case 1692599511:
                        C2642.m8171();
                        C1668.m5583();
                        break;
                    case -394791892:
                    case -353633756:
                        this.f19666 = arrayList2;
                        this.f19671 = arrayList2;
                        if (mo8791()) {
                            iM45029 = ThreadFactoryC3888.m11306("ܽ᩵") ^ i4;
                            i5 = ((iM45029 ^ i3) * 23571) ^ 1170478874;
                            i = -945122140;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("ᩳۧ") ^ i3;
                            i5 = ((iM45029 ^ i4) * 5445) ^ 264527666;
                            i = -2108409722;
                        }
                        i6 = iM45029 ^ i;
                        break;
                    case -158651267:
                    case 1334489749:
                        ArrayList arrayList4 = this.f19671;
                        if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                            arrayList3 = new ArrayList(arrayList4);
                            if (RunnableC1895.f7152) {
                                iM45029 = (i3 - C19806.m45029("ᩴۙ")) * (-79);
                                i5 = ((iM45029 ^ i4) * (-9897)) ^ (-169559657);
                                i = 79853661;
                                i6 = iM45029 ^ i;
                                break;
                            }
                        }
                        int iM11309 = ThreadFactoryC3888.m11306("᩻᩵") ^ i3;
                        i5 = ((iM11309 ^ i4) * (-10639)) ^ 1231954731;
                        i6 = iM11309 ^ (-1025013017);
                        arrayList2 = null;
                        arrayList3 = null;
                        break;
                    case -102301841:
                    case -4543466:
                        if (this.f19663 == null) {
                            iM45029 = (ThreadFactoryC3888.m11306("ܿۗ") + i4) * (-107);
                            i5 = ((iM45029 ^ i3) * (-25225)) ^ 1054265403;
                            i = -615928845;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("᩹ۘ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-3981)) ^ 1760805941;
                            i = 2118380544;
                        }
                        i6 = iM45029 ^ i;
                        break;
                    case -90614889:
                    case 845827740:
                        this.f19666 = this.f19663;
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۧ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 5445) ^ 264527666;
                        i = -2108409722;
                        i6 = iM45029 ^ i;
                        break;
                    case 306480298:
                    case 1554512679:
                        if (this.f19669) {
                            iM45029 = C19806.m45029("֫ۖ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-18181)) ^ 1779180083;
                            i = -1244868601;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("ᩳۧ") ^ i3;
                            i5 = ((iM45029 ^ i4) * 5445) ^ 264527666;
                            i = -2108409722;
                        }
                        i6 = iM45029 ^ i;
                        break;
                    case 365427408:
                    case 1647667860:
                        if (C2788.f10625 >= 0) {
                            iM45029 = ThreadFactoryC3888.m11306("۟᩵") ^ i4;
                            i5 = ((iM45029 ^ i3) * 13107) ^ 1197618438;
                            i = 1686077344;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("ܰᩳ") ^ i3) * (-105);
                            i5 = ((iM45029 ^ i4) * 3885) ^ 1010391670;
                            i = 1848295392;
                        }
                        i6 = iM45029 ^ i;
                        break;
                    case 855510632:
                    case 970202568:
                        this.f19665 = iArr;
                        if (C2871.f10837 < 0) {
                            iM45029 = C19806.m45029("ۘ֫") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-15009)) ^ 1074212079;
                            i = -1285794714;
                            i6 = iM45029 ^ i;
                        } else {
                            int iM113010 = ThreadFactoryC3888.m11306("᩻᩵") ^ i3;
                            i5 = ((iM113010 ^ i4) * (-10639)) ^ 1231954731;
                            i6 = iM113010 ^ (-1025013017);
                            arrayList2 = null;
                            arrayList3 = null;
                        }
                        break;
                    case 1166213085:
                    case 2064454250:
                        Collections.sort(arrayList3, C7618.comparing(c21051));
                        iM45029 = ThreadFactoryC3888.m11306("᩹ۘ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-3981)) ^ 1760805941;
                        i = 2118380544;
                        i6 = iM45029 ^ i;
                        break;
                    default:
                        if (!C19806.m45024()) {
                            arrayList2 = new ArrayList(arrayList);
                            if (C1189.f5284 > 0) {
                                iM45029 = C19806.m45029("ܽ֨") ^ i4;
                                i5 = ((iM45029 ^ i3) * (-24927)) ^ 1897665014;
                                i = 1057355513;
                                i6 = iM45029 ^ i;
                            }
                        } else {
                            int iM113011 = ThreadFactoryC3888.m11306("᩻᩵") ^ i3;
                            i5 = ((iM113011 ^ i4) * (-10639)) ^ 1231954731;
                            i6 = iM113011 ^ (-1025013017);
                            arrayList2 = null;
                            arrayList3 = null;
                        }
                        break;
                }
                return;
            }
            int iM450211 = C19806.m45029("ۛ᩹") ^ i3;
            i5 = ((iM450211 ^ i4) * (-15679)) ^ (-900241090);
            i6 = iM450211 ^ 2004500039;
        }
    }

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final void m15952() {
        this.f19657.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public void m15925() {
        int iM45029;
        int i;
        int i2;
        String str;
        int i3;
        int iM450210;
        int i4;
        int i5;
        DialogInterfaceOnClickListenerC20268 dialogInterfaceOnClickListenerC20268;
        String str2;
        int i6;
        int i7;
        int iM11306;
        int i8;
        int iM450211;
        int i9;
        int iM450212;
        int i10;
        int i11;
        AbstractActivityC5788 abstractActivityC5788 = this;
        C8067 c8067 = null;
        int i12 = 0;
        boolean z = false;
        DialogInterfaceC19356 dialogInterfaceC19356M8239 = null;
        String strMo15956 = null;
        ViewGroup viewGroup = null;
        int iIndexOfChild = 0;
        int i13 = 0;
        int iM450213 = 0;
        String strM9715 = null;
        int iM11307 = 0;
        String strM2906 = null;
        int i14 = 0;
        int i15 = -1461825739;
        int i16 = C1875.f7103;
        int i17 = C3577.f13150;
        int iM450214 = (C19806.m45029("ۘ᩹") ^ i16) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
        int i18 = ((iM450214 ^ i17) * 29759) ^ (-2057881200);
        int i19 = iM450214 ^ (-1829256207);
        Iterator itM9863 = null;
        short[] sArr = null;
        DialogInterfaceOnClickListenerC20268 dialogInterfaceOnClickListenerC20269 = null;
        DialogInterfaceOnClickListenerC0221 dialogInterfaceOnClickListenerC0221 = null;
        int i20 = 0;
        short s = 0;
        int i21 = 0;
        ArrayList arrayList = null;
        int i22 = 0;
        int iM11308 = 0;
        while (true) {
            i15 = i19 ^ (i18 & (((i15 ^ i17) * (-16005)) >> 31));
            switch (i15) {
                case -2119013436:
                case 708795245:
                    str = strMo15956;
                    i21 = i21;
                    i3 = i22;
                    dialogInterfaceOnClickListenerC20269 = dialogInterfaceOnClickListenerC20269;
                    if (C0962.m3748(itM9863)) {
                        iM450210 = (ThreadFactoryC3888.m11306("ۚۘ") + i17) * 85;
                        i4 = ((iM450210 ^ i16) * 25725) ^ 583882751;
                        i5 = -166505389;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("۬ۨ") ^ i17;
                        i4 = ((iM450210 ^ i16) * 6921) ^ 1863266762;
                        i5 = 10250888;
                    }
                    int i23 = iM450210 ^ i5;
                    i22 = i3;
                    str2 = str;
                    i19 = i23;
                    i18 = i4;
                    dialogInterfaceOnClickListenerC20269 = dialogInterfaceOnClickListenerC20269;
                    i21 = i21;
                    strMo15956 = str2;
                    break;
                case -2111819335:
                case -1958287126:
                    if (AbstractC0464.f2088 <= 0) {
                        strMo15956 = strMo15956;
                        iM45029 = (C19806.m45029("ۡ᩻") + i16) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM45029 ^ i17) * (-155)) ^ 1439813485;
                        i2 = -1908820960;
                        str2 = strMo15956;
                        i19 = iM45029 ^ i2;
                        i18 = i;
                        strMo15956 = str2;
                    } else {
                        dialogInterfaceOnClickListenerC20268 = dialogInterfaceOnClickListenerC20269;
                        int iM450215 = (i17 - C19806.m45029("۫ۢ")) * (-23);
                        i10 = ((iM450215 ^ i16) * 5037) ^ (-973130945);
                        i19 = iM450215 ^ 655427589;
                        dialogInterfaceOnClickListenerC20269 = dialogInterfaceOnClickListenerC20268;
                        i21 = i21;
                        i18 = i10;
                    }
                    break;
                case -1960756947:
                case -547534756:
                    break;
                case -1925043316:
                case -1079969318:
                    strMo15956 = strMo15956;
                    i21 = i21;
                    i22 = i22;
                    dialogInterfaceOnClickListenerC20269 = dialogInterfaceOnClickListenerC20269;
                    ArrayList arrayList2 = abstractActivityC5788.f19666;
                    if (arrayList2 != null) {
                        int iM450216 = (C19806.m45029("ܶܶ") ^ i16) * 83;
                        i6 = ((iM450216 ^ i17) * 14469) ^ (-1133599839);
                        i7 = iM450216 ^ (-1899668553);
                        arrayList = arrayList2;
                        i18 = i6;
                        i22 = i22;
                        dialogInterfaceOnClickListenerC20269 = dialogInterfaceOnClickListenerC20269;
                        i21 = i21;
                        strMo15956 = strMo15956;
                        i19 = i7;
                        abstractActivityC5788 = this;
                    } else {
                        int iM11309 = ThreadFactoryC3888.m11306("ܽۜ") ^ i17;
                        arrayList = arrayList2;
                        i22 = i22;
                        i18 = ((iM11309 ^ i16) * (-4723)) ^ 250335342;
                        abstractActivityC5788 = this;
                        str2 = strMo15956;
                        i19 = iM11309 ^ 938935019;
                        dialogInterfaceOnClickListenerC20269 = dialogInterfaceOnClickListenerC20269;
                        i21 = i21;
                        strMo15956 = str2;
                    }
                    break;
                case -1870887562:
                case -1175204127:
                    str = strMo15956;
                    i21 = i21;
                    i3 = i22;
                    dialogInterfaceOnClickListenerC20269 = dialogInterfaceOnClickListenerC20269;
                    if (((C22722) C0278.m1776(itM9863)).m50372()) {
                        iM450210 = (ThreadFactoryC3888.m11306("᩷᩻") ^ i16) * 115;
                        i4 = ((iM450210 ^ i17) * 12381) ^ 633209742;
                        i5 = -350561800;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("᩷ܺ") ^ i16;
                        i4 = ((iM450210 ^ i17) * (-3591)) ^ 1102983644;
                        i5 = 1786790858;
                    }
                    int i24 = iM450210 ^ i5;
                    i22 = i3;
                    str2 = str;
                    i19 = i24;
                    i18 = i4;
                    dialogInterfaceOnClickListenerC20269 = dialogInterfaceOnClickListenerC20269;
                    i21 = i21;
                    strMo15956 = str2;
                    break;
                case -1743530267:
                case 1693008159:
                    strMo15956 = strMo15956;
                    C2788.m8479(c8067, iM11308 ^ i13);
                    i12 = 1;
                    if (C1066.f4915 > 0) {
                        dialogInterfaceOnClickListenerC20269 = new DialogInterfaceOnClickListenerC20268(i12, abstractActivityC5788);
                        iM450213 = C19806.m45029(C0278.m1774(f19653, 37, 3, i20));
                        if (C3286.f12186) {
                            iM45029 = ThreadFactoryC3888.m11306("ۡۘ") ^ i16;
                            i = ((iM45029 ^ i17) * 30993) ^ (-2045335240);
                            i2 = -1311563593;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("ۘܺ") ^ i16;
                            i = ((iM45029 ^ i17) * 29717) ^ (-334438545);
                            i2 = 1906610571;
                        }
                        str2 = strMo15956;
                        i19 = iM45029 ^ i2;
                        i18 = i;
                        strMo15956 = str2;
                    } else {
                        i21 = i21;
                        i22 = i22;
                        int iM450217 = C19806.m45029("ᩴ֨") ^ i17;
                        i18 = ((iM450217 ^ i16) * (-32099)) ^ (-805933446);
                        i7 = iM450217 ^ 1354031188;
                        dialogInterfaceOnClickListenerC20269 = null;
                        dialogInterfaceOnClickListenerC0221 = null;
                        i21 = i21;
                        i22 = i22;
                        strMo15956 = strMo15956;
                        i19 = i7;
                        abstractActivityC5788 = this;
                    }
                    break;
                case -1708136565:
                case -1500628549:
                    strMo15956 = strMo15956;
                    iM11308 = ThreadFactoryC3888.m11306(C1189.m4365(f19653, 34, 3, i20));
                    i13 = 2127604711;
                    if (C10634.m26820()) {
                        iM45029 = (C19806.m45029("ۡ᩻") + i16) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM45029 ^ i17) * (-155)) ^ 1439813485;
                        i2 = -1908820960;
                    } else {
                        iM45029 = (i17 - C19806.m45029("ۨۤ")) * 9;
                        i = ((iM45029 ^ i16) * (-28441)) ^ 1259040980;
                        i2 = 365351184;
                    }
                    str2 = strMo15956;
                    i19 = iM45029 ^ i2;
                    i18 = i;
                    strMo15956 = str2;
                    break;
                case -1705904729:
                case 1374446335:
                    C0216.m1586(this);
                    break;
                case -1701488316:
                case -1107064601:
                    strMo15956 = strMo15956;
                    AbstractC0464.m2309(c8067, 2120764429 ^ iM450213, dialogInterfaceOnClickListenerC20269);
                    if (C1025.f4800 < 0) {
                        dialogInterfaceOnClickListenerC0221 = new DialogInterfaceOnClickListenerC0221(i12, abstractActivityC5788);
                        strM9715 = MenuItemOnMenuItemClickListenerC3244.m9715(f19653, 40, 3, i20);
                        if (C1977.f7413 > 0) {
                            iM45029 = (C19806.m45029("۠֫") ^ i16) * (-33);
                            i = ((iM45029 ^ i17) * (-19565)) ^ 306533416;
                            i2 = -2086623797;
                            str2 = strMo15956;
                            i19 = iM45029 ^ i2;
                            i18 = i;
                            strMo15956 = str2;
                        } else {
                            strMo15956 = strMo15956;
                            dialogInterfaceOnClickListenerC20268 = dialogInterfaceOnClickListenerC20269;
                            int iM450218 = (i17 - C19806.m45029("۫ۢ")) * (-23);
                            i10 = ((iM450218 ^ i16) * 5037) ^ (-973130945);
                            i19 = iM450218 ^ 655427589;
                            dialogInterfaceOnClickListenerC20269 = dialogInterfaceOnClickListenerC20268;
                            i21 = i21;
                            i18 = i10;
                        }
                    } else {
                        i21 = i21;
                        i22 = i22;
                        int iM450219 = C19806.m45029("ᩴ֨") ^ i17;
                        i18 = ((iM450219 ^ i16) * (-32099)) ^ (-805933446);
                        i7 = iM450219 ^ 1354031188;
                        dialogInterfaceOnClickListenerC20269 = null;
                        dialogInterfaceOnClickListenerC0221 = null;
                        i21 = i21;
                        i22 = i22;
                        strMo15956 = strMo15956;
                        i19 = i7;
                        abstractActivityC5788 = this;
                    }
                    break;
                case -1519312220:
                case -1388664953:
                    C0216.m1586(this);
                    break;
                case -1513399633:
                case 861609700:
                    i20 = 41303;
                    iM11306 = (i17 - ThreadFactoryC3888.m11306("ۛ᩺")) * (-95);
                    i18 = ((iM11306 ^ i16) * (-20897)) ^ (-1075857231);
                    i8 = 57620568;
                    i7 = iM11306 ^ i8;
                    i22 = i22;
                    dialogInterfaceOnClickListenerC20269 = dialogInterfaceOnClickListenerC20269;
                    i21 = i21;
                    strMo15956 = strMo15956;
                    i19 = i7;
                    abstractActivityC5788 = this;
                    break;
                case -1356229243:
                case 1283800627:
                    dialogInterfaceOnClickListenerC20268 = dialogInterfaceOnClickListenerC20269;
                    str = strMo15956;
                    int i25 = DialogInterfaceC19356.f62401;
                    c8067 = new C8067(abstractActivityC5788);
                    sArr = f19653;
                    i21 = 31;
                    i22 = 3;
                    if (RunnableC1564.f6300) {
                        strMo15956 = str;
                        int iM4502110 = (i17 - C19806.m45029("۫ۢ")) * (-23);
                        i10 = ((iM4502110 ^ i16) * 5037) ^ (-973130945);
                        i19 = iM4502110 ^ 655427589;
                        dialogInterfaceOnClickListenerC20269 = dialogInterfaceOnClickListenerC20268;
                        i21 = i21;
                        i18 = i10;
                    } else {
                        int iM113010 = (ThreadFactoryC3888.m11306("ۚ۠") + i16) * 59;
                        i18 = ((iM113010 ^ i17) * 7833) ^ (-352849676);
                        strMo15956 = str;
                        i19 = iM113010 ^ (-93275733);
                        dialogInterfaceOnClickListenerC20269 = dialogInterfaceOnClickListenerC20268;
                        i21 = 31;
                    }
                    break;
                case -1337694915:
                case -426317927:
                    strMo15956 = strMo15956;
                    dialogInterfaceC19356M8239 = C2704.m8239(c8067);
                    if (z) {
                        iM45029 = (C19806.m45029("᩹ۤ") + i17) * 5;
                        i = ((iM45029 ^ i16) * 10887) ^ (-1059782953);
                        i2 = 1354725924;
                    } else {
                        iM45029 = C19806.m45029("ܰۘ") ^ i16;
                        i = ((iM45029 ^ i17) * (-29945)) ^ (-889073365);
                        i2 = 879541849;
                    }
                    str2 = strMo15956;
                    i19 = iM45029 ^ i2;
                    i18 = i;
                    strMo15956 = str2;
                    break;
                case -1270657490:
                case 341316610:
                    strMo15956 = strMo15956;
                    iM11307 = ThreadFactoryC3888.m11306(C1937.m6288(f19653, 43, 3, i20));
                    iM45029 = ThreadFactoryC3888.m11306("᩻ᩳ") ^ i17;
                    i = ((iM45029 ^ i16) * (-25345)) ^ (-1272629688);
                    i2 = -1444701676;
                    str2 = strMo15956;
                    i19 = iM45029 ^ i2;
                    i18 = i;
                    strMo15956 = str2;
                    break;
                case -897934413:
                case 834829483:
                    C2871.m8646();
                    if (C1668.f6641 >= 0) {
                        strMo15956 = strMo15956;
                        iM45029 = ThreadFactoryC3888.m11306("ۡۘ") ^ i16;
                        i = ((iM45029 ^ i17) * 30993) ^ (-2045335240);
                        i2 = -1311563593;
                        str2 = strMo15956;
                        i19 = iM45029 ^ i2;
                        i18 = i;
                        strMo15956 = str2;
                    }
                    strMo15956 = strMo15956;
                    iM45029 = (C19806.m45029("ۡ᩻") + i16) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i = ((iM45029 ^ i17) * (-155)) ^ 1439813485;
                    i2 = -1908820960;
                    str2 = strMo15956;
                    i19 = iM45029 ^ i2;
                    i18 = i;
                    strMo15956 = str2;
                    break;
                case -822957142:
                case 1557513820:
                    str = strMo15956;
                    i21 = i21;
                    i3 = i22;
                    C0050.m933(c8067, C19806.m45029(C2871.m8640(sArr, i21, i3, i20)) ^ 2128497608);
                    if (C2332.m7079() > 0) {
                        iM450210 = (i17 - C19806.m45029("᩵֡")) * 61;
                        dialogInterfaceOnClickListenerC20269 = dialogInterfaceOnClickListenerC20269;
                        i4 = ((iM450210 ^ i16) * (-5869)) ^ (-71704894);
                        i5 = 1152004496;
                        int i26 = iM450210 ^ i5;
                        i22 = i3;
                        str2 = str;
                        i19 = i26;
                        i18 = i4;
                        dialogInterfaceOnClickListenerC20269 = dialogInterfaceOnClickListenerC20269;
                        i21 = i21;
                        strMo15956 = str2;
                    } else {
                        dialogInterfaceOnClickListenerC20268 = dialogInterfaceOnClickListenerC20269;
                        i21 = i21;
                        i22 = i3;
                        strMo15956 = str;
                        int iM4502111 = (i17 - C19806.m45029("۫ۢ")) * (-23);
                        i10 = ((iM4502111 ^ i16) * 5037) ^ (-973130945);
                        i19 = iM4502111 ^ 655427589;
                        dialogInterfaceOnClickListenerC20269 = dialogInterfaceOnClickListenerC20268;
                        i21 = i21;
                        i18 = i10;
                    }
                    break;
                case -412727882:
                case 2098453709:
                    CheckBox checkBox = (CheckBox) C3286.m9787(abstractActivityC5788, ThreadFactoryC3888.m11306(strM2906) ^ 2097225883);
                    viewGroup.removeViewAt(iIndexOfChild);
                    viewGroup.addView(checkBox, iIndexOfChild);
                    C11005.m27757(abstractActivityC5788, checkBox, strMo15956);
                    strMo15956 = strMo15956;
                    iM45029 = C19806.m45029("ܰۘ") ^ i16;
                    i = ((iM45029 ^ i17) * (-29945)) ^ (-889073365);
                    i2 = 879541849;
                    str2 = strMo15956;
                    i19 = iM45029 ^ i2;
                    i18 = i;
                    strMo15956 = str2;
                    break;
                case 65817803:
                case 860888790:
                    i20 = 55403;
                    iM11306 = (i17 - ThreadFactoryC3888.m11306("ۛ᩺")) * (-95);
                    i18 = ((iM11306 ^ i16) * (-20897)) ^ (-1075857231);
                    i8 = 57620568;
                    i7 = iM11306 ^ i8;
                    i22 = i22;
                    dialogInterfaceOnClickListenerC20269 = dialogInterfaceOnClickListenerC20269;
                    i21 = i21;
                    strMo15956 = strMo15956;
                    i19 = i7;
                    abstractActivityC5788 = this;
                    break;
                case 407188461:
                case 1933937218:
                    strMo15956 = strMo15956;
                    i21 = i21;
                    i22 = i22;
                    dialogInterfaceOnClickListenerC20269 = dialogInterfaceOnClickListenerC20269;
                    short s2 = s;
                    if ((s2 * 29642) - (i14 + 219662041) > 0) {
                        iM450211 = ThreadFactoryC3888.m11306("ۢᩴ") ^ i16;
                        i6 = ((iM450211 ^ i17) * 13583) ^ 831656585;
                        i9 = -388124492;
                    } else {
                        iM450211 = (C19806.m45029("ۤ᩵") + i17) * (-103);
                        i6 = ((iM450211 ^ i16) * (-7603)) ^ (-1887258658);
                        i9 = 314762091;
                    }
                    i7 = iM450211 ^ i9;
                    s = s2;
                    i18 = i6;
                    i22 = i22;
                    dialogInterfaceOnClickListenerC20269 = dialogInterfaceOnClickListenerC20269;
                    i21 = i21;
                    strMo15956 = strMo15956;
                    i19 = i7;
                    abstractActivityC5788 = this;
                    break;
                case 437204364:
                case 871042085:
                    strMo15956 = strMo15956;
                    i21 = i21;
                    i22 = i22;
                    dialogInterfaceOnClickListenerC20269 = dialogInterfaceOnClickListenerC20269;
                    s = f19653[30];
                    i14 = s * s;
                    if (C0797.f3386) {
                        int iM4502112 = C19806.m45029("ᩴ֨") ^ i17;
                        i18 = ((iM4502112 ^ i16) * (-32099)) ^ (-805933446);
                        i7 = iM4502112 ^ 1354031188;
                        dialogInterfaceOnClickListenerC20269 = null;
                        dialogInterfaceOnClickListenerC0221 = null;
                        i21 = i21;
                        i22 = i22;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚۡ") ^ i16) * (-115);
                        i18 = ((iM11306 ^ i17) * (-12613)) ^ 1131657956;
                        i8 = 736572576;
                        i7 = iM11306 ^ i8;
                        i22 = i22;
                        dialogInterfaceOnClickListenerC20269 = dialogInterfaceOnClickListenerC20269;
                        i21 = i21;
                    }
                    strMo15956 = strMo15956;
                    i19 = i7;
                    abstractActivityC5788 = this;
                    break;
                case 450596622:
                case 1596601431:
                    C1025.m3861();
                    C2249.m6915();
                    dialogInterfaceOnClickListenerC20268 = dialogInterfaceOnClickListenerC20269;
                    int iM4502113 = (i17 - C19806.m45029("۫ۢ")) * (-23);
                    i10 = ((iM4502113 ^ i16) * 5037) ^ (-973130945);
                    i19 = iM4502113 ^ 655427589;
                    dialogInterfaceOnClickListenerC20269 = dialogInterfaceOnClickListenerC20268;
                    i21 = i21;
                    i18 = i10;
                    break;
                case 581523686:
                case 1777035422:
                    strMo15956 = strMo15956;
                    strM2906 = C0629.m2906(f19653, 46, 3, i20);
                    if (C2788.m8472() == 0) {
                        iM45029 = (i16 - C19806.m45029("۫۬")) * (-97);
                        i = ((iM45029 ^ i17) * (-17387)) ^ (-412148216);
                        i2 = 98379906;
                        str2 = strMo15956;
                        i19 = iM45029 ^ i2;
                        i18 = i;
                        strMo15956 = str2;
                    } else {
                        strMo15956 = strMo15956;
                        dialogInterfaceOnClickListenerC20268 = dialogInterfaceOnClickListenerC20269;
                        int iM4502114 = (i17 - C19806.m45029("۫ۢ")) * (-23);
                        i10 = ((iM4502114 ^ i16) * 5037) ^ (-973130945);
                        i19 = iM4502114 ^ 655427589;
                        dialogInterfaceOnClickListenerC20269 = dialogInterfaceOnClickListenerC20268;
                        i21 = i21;
                        i18 = i10;
                    }
                    break;
                case 741133132:
                case 1524821773:
                    if (!C0797.f3386) {
                        iM450212 = C19806.m45029("ܽ֡") ^ i17;
                        i10 = ((iM450212 ^ i16) * 3271) ^ 2104779269;
                        i11 = 418223598;
                        i19 = iM450212 ^ i11;
                        i18 = i10;
                    }
                    dialogInterfaceOnClickListenerC20268 = dialogInterfaceOnClickListenerC20269;
                    int iM4502115 = (i17 - C19806.m45029("۫ۢ")) * (-23);
                    i10 = ((iM4502115 ^ i16) * 5037) ^ (-973130945);
                    i19 = iM4502115 ^ 655427589;
                    dialogInterfaceOnClickListenerC20269 = dialogInterfaceOnClickListenerC20268;
                    i21 = i21;
                    i18 = i10;
                    break;
                case 758492177:
                case 1082905234:
                    strMo15956 = strMo15956;
                    C1066.m4025(c8067, ThreadFactoryC3888.m11306(strM9715) ^ 2127670588, dialogInterfaceOnClickListenerC0221);
                    z = abstractActivityC5788 instanceof ActivityC8092;
                    if (z) {
                        iM45029 = C19806.m45029("ۡᩴ") ^ i16;
                        i = ((iM45029 ^ i17) * 30281) ^ (-1596810279);
                        i2 = 1601352240;
                    } else {
                        iM45029 = C19806.m45029("ۚ᩷") ^ i17;
                        i = ((iM45029 ^ i16) * 1719) ^ 1056306849;
                        i2 = 2086357783;
                    }
                    str2 = strMo15956;
                    i19 = iM45029 ^ i2;
                    i18 = i;
                    strMo15956 = str2;
                    break;
                case 817096025:
                case 1587805627:
                    C1025.m3861();
                    break;
                case 858625823:
                case 1647185421:
                    strMo15956 = strMo15956;
                    C10634.m26823(c8067, iM11307 ^ 2123417440, null);
                    iM45029 = C19806.m45029("ۚ᩷") ^ i17;
                    i = ((iM45029 ^ i16) * 1719) ^ 1056306849;
                    i2 = 2086357783;
                    str2 = strMo15956;
                    i19 = iM45029 ^ i2;
                    i18 = i;
                    strMo15956 = str2;
                    break;
                case 1256820216:
                case 1454182258:
                    strMo15956 = mo15956();
                    Button buttonM5052 = C1460.m5052(dialogInterfaceC19356M8239);
                    viewGroup = (ViewGroup) buttonM5052.getParent();
                    iIndexOfChild = viewGroup.indexOfChild(buttonM5052);
                    if (C0671.f2816 == 0) {
                        iM450212 = (C19806.m45029("ܰۡ") ^ i17) * (-27);
                        i10 = ((iM450212 ^ i16) * 18837) ^ (-393595413);
                        i11 = -1897524276;
                        i19 = iM450212 ^ i11;
                        i18 = i10;
                    }
                    dialogInterfaceOnClickListenerC20268 = dialogInterfaceOnClickListenerC20269;
                    int iM4502116 = (i17 - C19806.m45029("۫ۢ")) * (-23);
                    i10 = ((iM4502116 ^ i16) * 5037) ^ (-973130945);
                    i19 = iM4502116 ^ 655427589;
                    dialogInterfaceOnClickListenerC20269 = dialogInterfaceOnClickListenerC20268;
                    i21 = i21;
                    i18 = i10;
                    break;
                default:
                    str = strMo15956;
                    i21 = i21;
                    i3 = i22;
                    dialogInterfaceOnClickListenerC20269 = dialogInterfaceOnClickListenerC20269;
                    itM9863 = ViewTreeObserverOnPreDrawListenerC3327.m9863(arrayList);
                    iM450210 = ThreadFactoryC3888.m11306("᩷ܺ") ^ i16;
                    i4 = ((iM450210 ^ i17) * (-3591)) ^ 1102983644;
                    i5 = 1786790858;
                    int i27 = iM450210 ^ i5;
                    i22 = i3;
                    str2 = str;
                    i19 = i27;
                    i18 = i4;
                    dialogInterfaceOnClickListenerC20269 = dialogInterfaceOnClickListenerC20269;
                    i21 = i21;
                    strMo15956 = str2;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01ab A[PHI: r3 r9 r14 r15
      0x01ab: PHI (r3v4 int) = (r3v2 int), (r3v3 int), (r3v2 int), (r3v2 int) binds: [B:50:0x01a9, B:26:0x00b0, B:12:0x0062, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x01ab: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:50:0x01a9, B:26:0x00b0, B:12:0x0062, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x01ab: PHI (r14v4 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:50:0x01a9, B:26:0x00b0, B:12:0x0062, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x01ab: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:50:0x01a9, B:26:0x00b0, B:12:0x0062, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x01de A[PHI: r7 r8
      0x01de: PHI (r7v4 int) = (r7v3 int), (r7v2 int) binds: [B:54:0x01dc, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x01de: PHI (r8v4 short) = (r8v3 short), (r8v2 short) binds: [B:54:0x01dc, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0232 A[PHI: r5
      0x0232: PHI (r5v4 short) = (r5v3 short), (r5v2 short), (r5v2 short) binds: [B:62:0x0230, B:17:0x006e, B:15:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0267 A[PHI: r1 r11 r12 r13 r21
      0x0267: PHI (r1v4 l.ۛۧ᩺) = (r1v2 l.ۛۧ᩺), (r1v3 l.ۛۧ᩺), (r1v2 l.ۛۧ᩺), (r1v2 l.ۛۧ᩺), (r1v2 l.ۛۧ᩺) binds: [B:66:0x0265, B:39:0x0135, B:35:0x010f, B:15:0x006a, B:12:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0267: PHI (r11v4 short[]) = (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:66:0x0265, B:39:0x0135, B:35:0x010f, B:15:0x006a, B:12:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0267: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:66:0x0265, B:39:0x0135, B:35:0x010f, B:15:0x006a, B:12:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0267: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:66:0x0265, B:39:0x0135, B:35:0x010f, B:15:0x006a, B:12:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0267: PHI (r21v5 char) = (r21v4 char), (r21v3 char), (r21v3 char), (r21v3 char), (r21v3 char) binds: [B:66:0x0265, B:39:0x0135, B:35:0x010f, B:15:0x006a, B:12:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0295 A[PHI: r2 r6 r16
      0x0295: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v3 java.lang.String), (r2v2 java.lang.String) binds: [B:58:0x0210, B:22:0x008f, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0295: PHI (r6v4 int) = (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:58:0x0210, B:22:0x008f, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0295: PHI (r16v3 short[]) = (r16v2 short[]), (r16v2 short[]), (r16v4 short[]) binds: [B:58:0x0210, B:22:0x008f, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m15949(AbstractActivityC5788 abstractActivityC5788) {
        int iM45029;
        int i;
        int i2;
        int i3 = C3577.f13150;
        int i4 = C2249.f8050;
        int iM450210 = C19806.m45029("ۚܳ") ^ i4;
        int i5 = ((iM450210 ^ i3) * 5301) ^ (-685746955);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM450210 ^ 596478920;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = -935527181;
        char c = 0;
        String strM4040 = null;
        InterfaceC6025 interfaceC6025 = null;
        while (true) {
            i15 = i6 ^ (i5 & (((i15 ^ i3) * 31475) >> 31));
            switch (i15) {
                case -2071853975:
                case -601625348:
                    C1668.m5582(C19806.m45029(strM4040) ^ 2097827588);
                    iM45029 = ThreadFactoryC3888.m11306("ۡۗ") ^ i4;
                    i = ((iM45029 ^ i3) * 16229) ^ 2076549100;
                    i2 = -1899312067;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -2062461723:
                case 605187361:
                    C0962.m3746();
                    C1066.m4023();
                    break;
                case -2054337401:
                case -925113403:
                    s = sArr[c];
                    if (C2788.f10625 >= 0) {
                        iM45029 = (C19806.m45029("ۙۨ") ^ i4) * 101;
                        i = ((iM45029 ^ i3) * (-31147)) ^ (-543912821);
                        i2 = -1017649567;
                    } else {
                        iM45029 = C19806.m45029("ۤۨ") ^ i4;
                        i = ((iM45029 ^ i3) * (-21315)) ^ 210539337;
                        i2 = 1945038576;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -2050078282:
                case -1971479648:
                    if (C1977.f7413 > 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("֫ܽ")) * 41;
                        i = ((iM45029 ^ i3) * (-4511)) ^ (-1500074368);
                        i2 = 1439076253;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠᩹") ^ i3;
                        i = ((iM45029 ^ i4) * 8097) ^ (-1088051319);
                        i2 = 996516998;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1809982248:
                case -172923318:
                    i10 = s * s2;
                    if (C1148.f5161 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۠᩹") ^ i3;
                        i = ((iM45029 ^ i4) * 8097) ^ (-1088051319);
                        i2 = 996516998;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶۠") ^ i4;
                        i = ((iM45029 ^ i3) * 12139) ^ (-1667588561);
                        i2 = -2104721824;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1798172786:
                case -1710476904:
                    RunnableC1606.m5473();
                    C0671.m3008();
                    iM45029 = (C19806.m45029("ۙۨ") ^ i4) * 101;
                    i = ((iM45029 ^ i3) * (-31147)) ^ (-543912821);
                    i2 = -1017649567;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1582823092:
                case 640249856:
                    if (AbstractC0464.m2313() == 0) {
                        iM45029 = (C19806.m45029("ۙۨ") ^ i4) * 101;
                        i = ((iM45029 ^ i3) * (-31147)) ^ (-543912821);
                        i2 = -1017649567;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("֫ܽ")) * 41;
                        i = ((iM45029 ^ i3) * (-4511)) ^ (-1500074368);
                        i2 = 1439076253;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1503727590:
                case 641442725:
                    i11 = 24301;
                    iM45029 = C19806.m45029("ۜܿ") ^ i4;
                    i = ((iM45029 ^ i3) * (-6339)) ^ 842332752;
                    i2 = -1107408929;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1503281224:
                case 1021540466:
                    i9 = i8 * i8;
                    s2 = 2;
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ܶ") ^ i3;
                        i = ((iM45029 ^ i4) * 21369) ^ (-2046146992);
                        i2 = 520345135;
                    } else {
                        iM45029 = (C19806.m45029("ᩴܿ") + i3) * 85;
                        i = ((iM45029 ^ i4) * (-13717)) ^ (-1488147743);
                        i2 = -215717458;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1488982716:
                case -568064796:
                    c = 'I';
                    if (C0817.m3399()) {
                        iM45029 = (C19806.m45029("᩶᩶") ^ i3) * 69;
                        i = ((iM45029 ^ i4) * 25351) ^ (-1437819950);
                        i2 = 1006907160;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("֫ܽ")) * 41;
                        i = ((iM45029 ^ i3) * (-4511)) ^ (-1500074368);
                        i2 = 1439076253;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1282579685:
                case 703007370:
                    i8 = s + 1;
                    if (C1875.f7103 >= 0) {
                        iM45029 = (C19806.m45029("֫ܶ") + i4) * 67;
                        i = ((iM45029 ^ i3) * (-21993)) ^ 313452503;
                        i2 = -1078229415;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ܰܶ")) * 17;
                        i = ((iM45029 ^ i4) * (-985)) ^ 1786814100;
                        i2 = -503865691;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1145945505:
                case -133528699:
                    i13 = 43;
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("֫ܽ")) * 41;
                        i = ((iM45029 ^ i3) * (-4511)) ^ (-1500074368);
                        i2 = 1439076253;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۟᩹") ^ i3) * 41;
                        i = ((iM45029 ^ i4) * (-30735)) ^ (-1875289958);
                        i2 = 131157100;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -979295968:
                case 2107493715:
                    interfaceC6025 = ApplicationC0716.f2992;
                    sArr2 = f19653;
                    i12 = 74;
                    if (C2477.m7593() >= 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("֫ܽ")) * 41;
                        i = ((iM45029 ^ i3) * (-4511)) ^ (-1500074368);
                        i2 = 1439076253;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۜᩳ")) * 19;
                        i = ((iM45029 ^ i4) * (-23123)) ^ (-2009889563);
                        i2 = -2061455631;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -920727632:
                case -775418668:
                    sArr3 = f19653;
                    i14 = BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i7 = 3;
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۠᩹") ^ i3;
                        i = ((iM45029 ^ i4) * 8097) ^ (-1088051319);
                        i2 = 996516998;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ֨") + i4) * 41;
                        i = ((iM45029 ^ i3) * 13833) ^ (-10223925);
                        i2 = -1435190564;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -853411843:
                case 1446413433:
                    C1679.m5597(interfaceC6025, C1189.m4365(sArr2, i12, i13, i11), true);
                    if (abstractActivityC5788.m15943(true)) {
                        int iM450211 = C19806.m45029("᩻۠") ^ i3;
                        i5 = ((iM450211 ^ i4) * 12841) ^ 1332408965;
                        i6 = iM450211 ^ 1258714434;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡۗ") ^ i4;
                        i = ((iM45029 ^ i3) * 16229) ^ 2076549100;
                        i2 = -1899312067;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    }
                    break;
                case -803419565:
                case 263552428:
                    i11 = 32873;
                    iM45029 = C19806.m45029("ۜܿ") ^ i4;
                    i = ((iM45029 ^ i3) * (-6339)) ^ 842332752;
                    i2 = -1107408929;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -443176489:
                case 448655067:
                    RunnableC3388.m10064();
                    if (C1461.f5957 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۠᩹") ^ i3;
                        i = ((iM45029 ^ i4) * 8097) ^ (-1088051319);
                        i2 = 996516998;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۬ܶ") ^ i3;
                        i = ((iM45029 ^ i4) * 21369) ^ (-2046146992);
                        i2 = 520345135;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -23081158:
                case 1319715140:
                    break;
                case 1122767909:
                case 1858945336:
                    if ((i10 + 1) - i9 <= 0) {
                        iM45029 = C19806.m45029("֡᩵") ^ i3;
                        i = ((iM45029 ^ i4) * (-31555)) ^ (-1060753129);
                        i2 = 1016298173;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۫ۨ") ^ i4) * 27;
                        i = ((iM45029 ^ i3) * 17221) ^ 623660118;
                        i2 = -1704787179;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1160079196:
                case 2055096530:
                    strM4040 = C1066.m4040(sArr3, i14, i7, i11);
                    if (C1398.f5802 <= 0) {
                        iM45029 = (C19806.m45029("֫ܶ") + i4) * 67;
                        i = ((iM45029 ^ i3) * (-21993)) ^ 313452503;
                        i2 = -1078229415;
                    } else {
                        iM45029 = C19806.m45029("ܶ۠") ^ i3;
                        i = ((iM45029 ^ i4) * (-10561)) ^ (-1394014273);
                        i2 = 508534864;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    sArr = f19653;
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (C19806.m45029("֫ܶ") + i4) * 67;
                        i = ((iM45029 ^ i3) * (-21993)) ^ 313452503;
                        i2 = -1078229415;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("᩷ᩴ")) * 81;
                        i = ((iM45029 ^ i3) * (-23395)) ^ (-993263395);
                        i2 = 4510934;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    @Override // l.ActivityC4866
    /* JADX INFO: renamed from: ᩴ */
    public final void mo10632() {
        m15925();
    }

    /* JADX WARN: Code duplicated, block: B:65:0x02b3 A[PHI: r4 r16 r17 r18
      0x02b3: PHI (r4v5 char) = (r4v1 char), (r4v2 char), (r4v1 char) binds: [B:64:0x02b1, B:60:0x028e, B:9:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r16v41 short[]) = (r16v20 short[]), (r16v21 short[]), (r16v47 short[]) binds: [B:64:0x02b1, B:60:0x028e, B:9:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r17v35 int) = (r17v18 int), (r17v19 int), (r17v40 int) binds: [B:64:0x02b1, B:60:0x028e, B:9:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r18v26 java.lang.String) = (r18v12 java.lang.String), (r18v13 java.lang.String), (r18v29 java.lang.String) binds: [B:64:0x02b1, B:60:0x028e, B:9:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public String mo8786() {
        int iM11306;
        int i;
        int i2;
        int iM11307;
        int i3;
        int i4;
        int i5;
        String strM5070 = null;
        int iM45029 = 0;
        int i6 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        short s3 = 0;
        int i8 = 0;
        short[] sArr2 = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1093028111;
        int i12 = C1189.f5284;
        int i13 = C3535.f13026;
        int iM11308 = ThreadFactoryC3888.m11306("᩷ۘ") ^ i12;
        int i14 = ((iM11308 ^ i13) * 19) ^ 1610236289;
        int i15 = iM11308 ^ 772141908;
        while (true) {
            int i16 = i15 ^ ((((i11 ^ i13) * 6389) >> 31) & i14);
            switch (i16) {
                case -1997063016:
                case 1581281828:
                    strM5070 = strM5070;
                    i16 = i16;
                    short[] sArr3 = f19653;
                    if (C2124.f7782 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۙ") ^ i13;
                        sArr = sArr3;
                        i = ((iM11306 ^ i12) * 5677) ^ 2061381388;
                        i2 = 1501639830;
                        sArr = sArr;
                        i15 = iM11306 ^ i2;
                        i11 = i16;
                        i14 = i;
                        strM5070 = strM5070;
                    } else {
                        sArr = sArr3;
                        iM11307 = (C19806.m45029("ۤ۬") ^ i12) * (-121);
                        i3 = ((iM11307 ^ i13) * 23561) ^ (-1886375783);
                        i4 = 1652455676;
                        sArr = sArr;
                        i15 = iM11307 ^ i4;
                        strM5070 = strM5070;
                        i5 = i16;
                        i14 = i3;
                        i11 = i5;
                    }
                    break;
                case -1933112717:
                case 1460189690:
                    C1977.m6356();
                    return null;
                case -1894083144:
                case 1676519529:
                    i16 = i16;
                    C2704.m8255();
                    if (C3577.f13150 < 0) {
                        iM11307 = (C19806.m45029("ۤ۬") ^ i12) * (-121);
                        i3 = ((iM11307 ^ i13) * 23561) ^ (-1886375783);
                        i4 = 1652455676;
                        sArr = sArr;
                        i15 = iM11307 ^ i4;
                        strM5070 = strM5070;
                        i5 = i16;
                        i14 = i3;
                    } else {
                        int iM450210 = (C19806.m45029("ۡ۫") + i12) * 63;
                        short[] sArr4 = sArr;
                        i5 = i16;
                        i14 = ((iM450210 ^ i13) * (-9025)) ^ 508202544;
                        sArr = sArr4;
                        i15 = iM450210 ^ 1776219218;
                    }
                    i11 = i5;
                    break;
                case -1873102202:
                case 1512186857:
                    strM5070 = strM5070;
                    sArr = sArr;
                    i16 = i16;
                    if ((s * s3) - i7 > 0) {
                        iM11307 = (C19806.m45029("ۙ᩺") + i13) * 115;
                        i3 = ((iM11307 ^ i12) * 11199) ^ 152334920;
                        i4 = 1054827119;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ۛܺ") ^ i12;
                        i3 = ((iM11307 ^ i13) * (-1227)) ^ (-1500812403);
                        i4 = 761586863;
                    }
                    sArr = sArr;
                    i15 = iM11307 ^ i4;
                    strM5070 = strM5070;
                    i5 = i16;
                    i14 = i3;
                    i11 = i5;
                    break;
                case -1801776918:
                case 1227587968:
                    sArr = sArr;
                    i16 = i16;
                    sArr2 = f19653;
                    if (C3722.f13525 <= 0) {
                        i9 = 336;
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ܿ") ^ i13) * (-63);
                        strM5070 = strM5070;
                        i = ((iM11306 ^ i12) * 31265) ^ (-1207310767);
                        i2 = -1865365151;
                        sArr = sArr;
                        i15 = iM11306 ^ i2;
                        i11 = i16;
                        i14 = i;
                        strM5070 = strM5070;
                    } else {
                        int iM11309 = ThreadFactoryC3888.m11306("ۙ᩻") ^ i13;
                        int i17 = ((iM11309 ^ i12) * 17587) ^ 1136243657;
                        sArr = sArr;
                        i15 = iM11309 ^ (-1625656714);
                        i11 = i16;
                        i14 = i17;
                        i9 = 336;
                    }
                    break;
                case -1600275497:
                case 334161948:
                    if (C1668.f6641 >= 0) {
                        i16 = i16;
                        iM11307 = (C19806.m45029("ۤ۬") ^ i12) * (-121);
                        i3 = ((iM11307 ^ i13) * 23561) ^ (-1886375783);
                        i4 = 1652455676;
                        sArr = sArr;
                        i15 = iM11307 ^ i4;
                        strM5070 = strM5070;
                    } else {
                        int iM450211 = C19806.m45029("ܺܰ") ^ i13;
                        i16 = i16;
                        i3 = ((iM450211 ^ i12) * 9529) ^ 1155738505;
                        i15 = iM450211 ^ 1007514432;
                    }
                    i5 = i16;
                    i14 = i3;
                    i11 = i5;
                    break;
                case -1057316693:
                case 108600934:
                    sArr = sArr;
                    i16 = i16;
                    if (C0671.m3008() >= 0) {
                        strM5070 = strM5070;
                        i10 = 3;
                        iM11307 = (C19806.m45029("ۤ۬") ^ i12) * (-121);
                        i3 = ((iM11307 ^ i13) * 23561) ^ (-1886375783);
                        i4 = 1652455676;
                        sArr = sArr;
                        i15 = iM11307 ^ i4;
                        strM5070 = strM5070;
                        i5 = i16;
                        i14 = i3;
                        i11 = i5;
                    } else {
                        int iM450212 = (C19806.m45029("ۗᩴ") ^ i12) * (-31);
                        int i18 = ((iM450212 ^ i13) * (-29889)) ^ (-1849396818);
                        sArr = sArr;
                        i15 = iM450212 ^ (-1540577599);
                        i11 = i16;
                        i14 = i18;
                        i10 = 3;
                    }
                    break;
                case -1017680883:
                case -201305266:
                    sArr = sArr;
                    i16 = i16;
                    strM5070 = C1461.m5070(sArr2, i9, i10, i8);
                    if (C7105.f23796 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ܿ") ^ i13) * (-63);
                        strM5070 = strM5070;
                        i = ((iM11306 ^ i12) * 31265) ^ (-1207310767);
                        i2 = -1865365151;
                        sArr = sArr;
                        i15 = iM11306 ^ i2;
                        i11 = i16;
                        i14 = i;
                        strM5070 = strM5070;
                    } else {
                        int iM113010 = ThreadFactoryC3888.m11306("ᩴۨ") ^ i13;
                        int i19 = ((iM113010 ^ i12) * 87) ^ (-1133179562);
                        sArr = sArr;
                        i15 = iM113010 ^ 734981522;
                        i11 = i16;
                        i14 = i19;
                    }
                    break;
                case -955400191:
                case -681076397:
                    strM5070 = strM5070;
                    sArr = sArr;
                    i16 = i16;
                    c = 335;
                    if (C2642.f10294 <= 0) {
                        iM11307 = (C19806.m45029("ᩴܶ") ^ i12) * (-85);
                        i3 = ((iM11307 ^ i13) * (-5273)) ^ 1177986857;
                        i4 = -1425609523;
                    } else {
                        iM11307 = C19806.m45029("ۚ᩺") ^ i12;
                        i3 = ((iM11307 ^ i13) * 17551) ^ (-1472556251);
                        i4 = 1367795168;
                    }
                    sArr = sArr;
                    i15 = iM11307 ^ i4;
                    strM5070 = strM5070;
                    i5 = i16;
                    i14 = i3;
                    i11 = i5;
                    break;
                case -935267273:
                case -911766271:
                    sArr = sArr;
                    i16 = i16;
                    CallableC1627.m5507();
                    C2124.m6673();
                    strM5070 = strM5070;
                    iM11307 = (C19806.m45029("ۤ۬") ^ i12) * (-121);
                    i3 = ((iM11307 ^ i13) * 23561) ^ (-1886375783);
                    i4 = 1652455676;
                    sArr = sArr;
                    i15 = iM11307 ^ i4;
                    strM5070 = strM5070;
                    i5 = i16;
                    i14 = i3;
                    i11 = i5;
                    break;
                case -789674053:
                case 107074387:
                    strM5070 = strM5070;
                    sArr = sArr;
                    i16 = i16;
                    if (AbstractC0464.m2313() != 0) {
                        iM11307 = (C19806.m45029("ᩴܶ") ^ i12) * (-85);
                        i3 = ((iM11307 ^ i13) * (-5273)) ^ 1177986857;
                        i4 = -1425609523;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ܿܰ") ^ i12;
                        i3 = ((iM11307 ^ i13) * 24349) ^ 878502833;
                        i4 = -1219781151;
                    }
                    sArr = sArr;
                    i15 = iM11307 ^ i4;
                    strM5070 = strM5070;
                    i5 = i16;
                    i14 = i3;
                    i11 = i5;
                    break;
                case -610127962:
                case 1520479199:
                    strM5070 = strM5070;
                    sArr = sArr;
                    i16 = i16;
                    int i20 = s + s2;
                    i7 = i20 * i20;
                    if (C7105.f23796 >= 0) {
                        iM11307 = (C19806.m45029("ۤ۬") ^ i12) * (-121);
                        i3 = ((iM11307 ^ i13) * 23561) ^ (-1886375783);
                        i4 = 1652455676;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("۬ܶ") + i13) * 79;
                        i3 = ((iM11307 ^ i12) * 3517) ^ 808746283;
                        i4 = -1554157436;
                    }
                    sArr = sArr;
                    i15 = iM11307 ^ i4;
                    strM5070 = strM5070;
                    i5 = i16;
                    i14 = i3;
                    i11 = i5;
                    break;
                case -539279972:
                case -509937200:
                    return C2124.m6690(this, iM45029 ^ i6);
                case -135140489:
                case 757415457:
                    if (!C0817.m3399()) {
                        i16 = i16;
                        int iM450213 = (C19806.m45029("ۡ۫") + i12) * 63;
                        short[] sArr5 = sArr;
                        i5 = i16;
                        i14 = ((iM450213 ^ i13) * (-9025)) ^ 508202544;
                        sArr = sArr5;
                        i15 = iM450213 ^ 1776219218;
                        i11 = i5;
                    } else {
                        strM5070 = strM5070;
                        sArr = sArr;
                        i16 = i16;
                        iM11307 = (C19806.m45029("ᩴܶ") ^ i12) * (-85);
                        i3 = ((iM11307 ^ i13) * (-5273)) ^ 1177986857;
                        i4 = -1425609523;
                        sArr = sArr;
                        i15 = iM11307 ^ i4;
                        strM5070 = strM5070;
                        i5 = i16;
                        i14 = i3;
                        i11 = i5;
                    }
                    break;
                case -116668359:
                case 1949166457:
                    sArr = sArr;
                    i16 = i16;
                    iM45029 = C19806.m45029(strM5070);
                    if (C1875.f7103 >= 0) {
                        strM5070 = strM5070;
                        i6 = 2120271772;
                        iM11307 = (C19806.m45029("ۤ۬") ^ i12) * (-121);
                        i3 = ((iM11307 ^ i13) * 23561) ^ (-1886375783);
                        i4 = 1652455676;
                        sArr = sArr;
                        i15 = iM11307 ^ i4;
                        strM5070 = strM5070;
                        i5 = i16;
                        i14 = i3;
                        i11 = i5;
                    } else {
                        int iM450214 = (i13 - C19806.m45029("ۡܺ")) * q.h;
                        int i21 = ((iM450214 ^ i12) * 19091) ^ 39493729;
                        sArr = sArr;
                        i15 = iM450214 ^ 831213022;
                        i11 = i16;
                        i14 = i21;
                        i6 = 2120271772;
                    }
                    break;
                case 566276401:
                case 1479631110:
                    strM5070 = strM5070;
                    sArr = sArr;
                    i16 = i16;
                    s = sArr[c];
                    s2 = 17749;
                    if (C0050.f912 > 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("۟֡") ^ i13) * (-79);
                        i3 = ((iM11307 ^ i12) * (-17179)) ^ (-1932741387);
                        i4 = -1304763381;
                        sArr = sArr;
                        i15 = iM11307 ^ i4;
                        strM5070 = strM5070;
                        i5 = i16;
                        i14 = i3;
                        i11 = i5;
                    } else {
                        strM5070 = strM5070;
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ܿ") ^ i13) * (-63);
                        strM5070 = strM5070;
                        i = ((iM11306 ^ i12) * 31265) ^ (-1207310767);
                        i2 = -1865365151;
                        sArr = sArr;
                        i15 = iM11306 ^ i2;
                        i11 = i16;
                        i14 = i;
                        strM5070 = strM5070;
                    }
                    break;
                case 892046947:
                case 1614699702:
                    strM5070 = strM5070;
                    sArr = sArr;
                    i16 = i16;
                    s3 = 70996;
                    if (!C0526.f2219) {
                        iM11307 = (i12 - C19806.m45029("ۢۙ")) * (-117);
                        i3 = ((iM11307 ^ i13) * 28733) ^ 598023986;
                        i4 = -365711529;
                        sArr = sArr;
                        i15 = iM11307 ^ i4;
                        strM5070 = strM5070;
                        i5 = i16;
                        i14 = i3;
                        i11 = i5;
                    } else {
                        strM5070 = strM5070;
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ܿ") ^ i13) * (-63);
                        strM5070 = strM5070;
                        i = ((iM11306 ^ i12) * 31265) ^ (-1207310767);
                        i2 = -1865365151;
                        sArr = sArr;
                        i15 = iM11306 ^ i2;
                        i11 = i16;
                        i14 = i;
                        strM5070 = strM5070;
                    }
                    break;
                case 1562543393:
                case 1714709673:
                    i8 = 45249;
                    iM11306 = C19806.m45029("ۗۘ") ^ i12;
                    strM5070 = strM5070;
                    i = ((iM11306 ^ i13) * 23461) ^ 76019457;
                    i2 = -455249862;
                    sArr = sArr;
                    i15 = iM11306 ^ i2;
                    i11 = i16;
                    i14 = i;
                    strM5070 = strM5070;
                    break;
                default:
                    i8 = 29989;
                    iM11306 = C19806.m45029("ۗۘ") ^ i12;
                    strM5070 = strM5070;
                    i = ((iM11306 ^ i13) * 23461) ^ 76019457;
                    i2 = -455249862;
                    sArr = sArr;
                    i15 = iM11306 ^ i2;
                    i11 = i16;
                    i14 = i;
                    strM5070 = strM5070;
                    break;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r31v39 */
    /* JADX WARN: Type inference failed for: r31v40 */
    /* JADX WARN: Type inference failed for: r31v41 */
    /* JADX WARN: Type inference failed for: r31v42 */
    /* JADX WARN: Type inference failed for: r31v43 */
    /* JADX WARN: Type inference failed for: r31v55 */
    /* JADX WARN: Type inference failed for: r31v56 */
    /* JADX WARN: Type inference failed for: r31v57 */
    /* JADX WARN: Type inference failed for: r31v58 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.util.AttributeSet, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
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
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        DialogInterfaceOnClickListenerC13771 dialogInterfaceOnClickListenerC13771;
        int i;
        short[] sArr;
        DialogInterfaceOnClickListenerC21394 dialogInterfaceOnClickListenerC21394;
        String str;
        String str2;
        int i2;
        C8067 c8067;
        int i3;
        int i4;
        short[] sArr2;
        int i5;
        DialogInterfaceOnClickListenerC21394 dialogInterfaceOnClickListenerC21395;
        int i6;
        short[] sArr3;
        int iM45029;
        int i7;
        int i8;
        int iM11306;
        int i9;
        short[] sArr4;
        int iM11307;
        int i10;
        int i11;
        int iM450210;
        int i12;
        int i13;
        int i14;
        int iM11308;
        int i15;
        ?? r8;
        C8067 c8068;
        int i16;
        DialogInterfaceOnClickListenerC21394 dialogInterfaceOnClickListenerC21396;
        C0733 c0733;
        short[] sArr5;
        int iM450211;
        int i17;
        int i18;
        DialogInterfaceOnClickListenerC12069 dialogInterfaceOnClickListenerC12069;
        String str3;
        C12709 c12709;
        int i19;
        C0733 c0734;
        short[] sArr6;
        String strM3412;
        int i20;
        int i21;
        DialogInterfaceOnClickListenerC21394 dialogInterfaceOnClickListenerC21397;
        int iM450212;
        int i22;
        int i23;
        int iM450213;
        int i24;
        int i25;
        int iM11309;
        DialogInterfaceOnClickListenerC21394 dialogInterfaceOnClickListenerC21398;
        int iM113010;
        int i26;
        int i27;
        int i28;
        int iM450214;
        int i29;
        int i30;
        ?? r9;
        ?? r31;
        int iM450215;
        int i31;
        int i32;
        AbstractActivityC5788 abstractActivityC5788 = this;
        int i33 = -342489952;
        int i34 = C3577.f13150;
        int i35 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int iM450216 = (i34 - C19806.m45029("ۡۢ")) * 75;
        int i36 = ((iM450216 ^ i35) * (-19875)) ^ (-1381980625);
        int i37 = iM450216 ^ 1280682202;
        DialogInterfaceOnClickListenerC13771 dialogInterfaceOnClickListenerC13772 = null;
        String str4 = null;
        C0733 c0735 = null;
        C8067 c8069 = null;
        DialogInterfaceOnClickListenerC21394 dialogInterfaceOnClickListenerC21399 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        short[] sArr12 = null;
        int iM6285 = 0;
        boolean z = false;
        boolean z2 = false;
        int i38 = 0;
        int i39 = 0;
        int iM113011 = 0;
        int iM450217 = 0;
        int i40 = 0;
        int iM113012 = 0;
        int iM450218 = 0;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        C12709 c127010 = null;
        String str5 = null;
        DialogInterfaceOnClickListenerC12069 dialogInterfaceOnClickListenerC120610 = null;
        int i45 = 0;
        C8067 c80610 = null;
        ?? r10 = 0;
        int i46 = 0;
        while (true) {
            i33 = i37 ^ (i36 & (((i33 ^ i35) * 6823) >> 31));
            switch (i33) {
                case -2121598311:
                case 1804592665:
                    i28 = i46;
                    abstractActivityC5788.f19669 = (abstractActivityC5788.f19669 ? 1 : 0) ^ (z ? 1 : 0);
                    ?? r32 = r10;
                    C2249.m6906(C1066.m4033(CallableC1627.m5517(ApplicationC0716.f2992), C3577.m10571(f19653, 301, 23, i38), abstractActivityC5788.f19669));
                    C7105.m18980(menuItem, abstractActivityC5788.f19669);
                    if (abstractActivityC5788.f19669) {
                        iM450214 = ThreadFactoryC3888.m11306("۫ܽ") ^ i35;
                        i29 = ((iM450214 ^ i34) * (-23513)) ^ (-1288475110);
                        i30 = -2123833561;
                        r31 = r32;
                    } else {
                        iM450214 = ThreadFactoryC3888.m11306("᩶ܽ") ^ i34;
                        i29 = ((iM450214 ^ i35) * (-31395)) ^ (-581085852);
                        i30 = -2091264754;
                        r31 = r32;
                    }
                    i37 = iM450214 ^ i30;
                    i36 = i29;
                    i46 = i28;
                    r10 = r31;
                    break;
                case -2082608072:
                case -521823944:
                    i38 = 53070;
                    iM11306 = ThreadFactoryC3888.m11306("۫᩶") ^ i35;
                    i36 = ((iM11306 ^ i34) * (-8119)) ^ 1002530396;
                    i9 = -1287628675;
                    i11 = iM11306 ^ i9;
                    sArr7 = sArr7;
                    i44 = i44;
                    sArr8 = sArr8;
                    sArr9 = sArr9;
                    dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21399;
                    i42 = i42;
                    i43 = i43;
                    i46 = i46;
                    z = z;
                    dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                    c0735 = c0735;
                    c80610 = c80610;
                    i37 = i11;
                    i41 = i41;
                    str5 = str5;
                    str4 = str4;
                    abstractActivityC5788 = this;
                    r8 = r10;
                    c127010 = c127010;
                    r10 = r8;
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    break;
                case -2054883888:
                case 1409653985:
                    C1066.m4034(c8069, ThreadFactoryC3888.m11306(C3743.m10964(sArr12, 292, 3, i38)) ^ 2121613657, dialogInterfaceOnClickListenerC120610);
                    C2704.m8239(c8069);
                    return z;
                case -2028541306:
                case -489872594:
                    if (C3577.f13150 < 0) {
                        dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                        c8068 = c80610;
                        c127010 = c127010;
                        i16 = i42;
                        dialogInterfaceOnClickListenerC21396 = dialogInterfaceOnClickListenerC21399;
                        str4 = str4;
                        str5 = str5;
                        i41 = i41;
                        c0733 = c0735;
                        sArr5 = sArr9;
                        int iM450219 = C19806.m45029("ܿᩴ") ^ i34;
                        i37 = iM450219 ^ (-1677034977);
                        c80610 = c8068;
                        i36 = ((iM450219 ^ i35) * 14235) ^ 1402099999;
                        sArr9 = sArr5;
                        dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21396;
                        i42 = i16;
                        c0735 = c0733;
                        i41 = i41;
                        str5 = str5;
                        str4 = str4;
                        r8 = r10;
                        c127010 = c127010;
                        r10 = r8;
                        dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    } else {
                        iM45029 = (i35 - ThreadFactoryC3888.m11306("᩷ۡ")) * (-37);
                        i7 = ((iM45029 ^ i34) * 10869) ^ 1133251224;
                        i8 = 1238330511;
                        i37 = iM45029 ^ i8;
                        i36 = i7;
                    }
                    break;
                case -1842675385:
                case -788850592:
                    i3 = i46;
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    c80610 = c80610;
                    dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                    c127010 = c127010;
                    i4 = i42;
                    sArr4 = sArr7;
                    sArr2 = sArr8;
                    i5 = i43;
                    dialogInterfaceOnClickListenerC21395 = dialogInterfaceOnClickListenerC21399;
                    str4 = str4;
                    i6 = i44;
                    str5 = str5;
                    i41 = i41;
                    c0735 = c0735;
                    sArr3 = sArr9;
                    if (mo8792()) {
                        iM11307 = (ThreadFactoryC3888.m11306("᩸᩹") + i34) * 81;
                        i36 = ((iM11307 ^ i35) * 13165) ^ 213571056;
                        i10 = 790908310;
                    } else {
                        iM11307 = C19806.m45029("ۤ֡") ^ i35;
                        i36 = ((iM11307 ^ i34) * (-11063)) ^ (-1813351188);
                        i10 = 1029855173;
                    }
                    i11 = iM11307 ^ i10;
                    sArr7 = sArr4;
                    i44 = i6;
                    sArr8 = sArr2;
                    sArr9 = sArr3;
                    dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21395;
                    i42 = i4;
                    i43 = i5;
                    i46 = i3;
                    dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                    c0735 = c0735;
                    c80610 = c80610;
                    i37 = i11;
                    i41 = i41;
                    str5 = str5;
                    str4 = str4;
                    abstractActivityC5788 = this;
                    r8 = r10;
                    c127010 = c127010;
                    r10 = r8;
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    break;
                case -1800683966:
                case -816030451:
                    int i47 = i42;
                    C0050.m933(c8069, i47);
                    C1875.m6095(c8069, mo8786());
                    dialogInterfaceOnClickListenerC21399 = new DialogInterfaceOnClickListenerC21394(abstractActivityC5788, z ? 1 : 0);
                    sArr11 = f19653;
                    i39 = 289;
                    if (C7105.f23796 >= 0) {
                        i19 = i47;
                        dialogInterfaceOnClickListenerC12069 = dialogInterfaceOnClickListenerC120610;
                        strM3412 = str4;
                        c12709 = c127010;
                        sArr6 = sArr9;
                        i45 = 3;
                        str3 = str5;
                        i20 = i41;
                        c0734 = c0735;
                        int iM450220 = C19806.m45029("ۧᩳ") ^ i34;
                        short[] sArr13 = sArr6;
                        i36 = ((iM450220 ^ i35) * (-1367)) ^ (-921614966);
                        i37 = iM450220 ^ 639171513;
                        c127010 = c12709;
                        sArr9 = sArr13;
                        i42 = i19;
                        dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC12069;
                        c0735 = c0734;
                        i41 = i20;
                        str5 = str3;
                        str4 = strM3412;
                    } else {
                        int iM450221 = C19806.m45029("ۢۡ") ^ i35;
                        i37 = iM450221 ^ 1790274807;
                        i42 = i47;
                        i36 = ((iM450221 ^ i34) * 18443) ^ 2096034734;
                        i45 = 3;
                    }
                    break;
                case -1772517458:
                case 1312782617:
                    if (C7105.f23796 < 0) {
                        iM45029 = (C19806.m45029("᩹ۗ") ^ i34) * 35;
                        i7 = ((iM45029 ^ i35) * 13269) ^ 2027599310;
                        i8 = -1807483170;
                        i37 = iM45029 ^ i8;
                        i36 = i7;
                    } else {
                        i46 = i46;
                        dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                        iM450217 = iM450217;
                        c127010 = c127010;
                        i = i42;
                        i43 = i43;
                        dialogInterfaceOnClickListenerC21394 = dialogInterfaceOnClickListenerC21399;
                        c8067 = c80610;
                        dialogInterfaceOnClickListenerC13771 = dialogInterfaceOnClickListenerC13772;
                        str = str4;
                        sArr = sArr8;
                        i44 = i44;
                        str2 = str5;
                        i2 = i41;
                        int iM450222 = (C19806.m45029("ۘۘ") ^ i35) * (-27);
                        i37 = iM450222 ^ (-545638044);
                        i44 = i44;
                        sArr8 = sArr;
                        i41 = i2;
                        str5 = str2;
                        str4 = str;
                        dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21394;
                        i42 = i;
                        i43 = i43;
                        c127010 = c127010;
                        dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13771;
                        c80610 = c8067;
                        dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                        iM450217 = iM450217;
                        i36 = ((iM450222 ^ i34) * (-10741)) ^ 47226939;
                        i46 = i46;
                    }
                    break;
                case -1750366524:
                case 552908796:
                    C2871.m8646();
                    if (C10634.f36300 < 0) {
                        iM45029 = (C19806.m45029("ܺܺ") + i34) * 89;
                        i7 = ((iM45029 ^ i35) * (-23717)) ^ (-84171179);
                        i8 = 932624198;
                        i37 = iM45029 ^ i8;
                        i36 = i7;
                    } else {
                        i46 = i46;
                        dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                        iM450217 = iM450217;
                        c127010 = c127010;
                        i = i42;
                        i43 = i43;
                        dialogInterfaceOnClickListenerC21394 = dialogInterfaceOnClickListenerC21399;
                        c8067 = c80610;
                        dialogInterfaceOnClickListenerC13771 = dialogInterfaceOnClickListenerC13772;
                        str = str4;
                        sArr = sArr8;
                        i44 = i44;
                        str2 = str5;
                        i2 = i41;
                        int iM450223 = (C19806.m45029("ۘۘ") ^ i35) * (-27);
                        i37 = iM450223 ^ (-545638044);
                        i44 = i44;
                        sArr8 = sArr;
                        i41 = i2;
                        str5 = str2;
                        str4 = str;
                        dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21394;
                        i42 = i;
                        i43 = i43;
                        c127010 = c127010;
                        dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13771;
                        c80610 = c8067;
                        dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                        iM450217 = iM450217;
                        i36 = ((iM450223 ^ i34) * (-10741)) ^ 47226939;
                        i46 = i46;
                    }
                    break;
                case -1732339783:
                case 571129586:
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    C8067 c80611 = c80610;
                    dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                    c127010 = c127010;
                    i4 = i42;
                    sArr2 = sArr8;
                    i5 = i43;
                    dialogInterfaceOnClickListenerC21395 = dialogInterfaceOnClickListenerC21399;
                    str4 = str4;
                    i6 = i44;
                    str5 = str5;
                    i41 = i41;
                    c0735 = c0735;
                    sArr3 = sArr9;
                    C1377.m4836(c80611, iM450217 ^ i40);
                    c80610 = c80611;
                    i3 = i46;
                    iM113012 = ThreadFactoryC3888.m11306(C1461.m5070(f19653, 216, 3, i38));
                    if (C3660.f13403 >= 0) {
                        iM11308 = (ThreadFactoryC3888.m11306("᩺ܿ") ^ i35) * 75;
                        i12 = ((iM11308 ^ i34) * (-5867)) ^ (-968121443);
                        i15 = -1783568932;
                    } else {
                        iM11308 = (i35 - C19806.m45029("ۢ۟")) * (-17);
                        i12 = ((iM11308 ^ i34) * (-31339)) ^ (-1787227446);
                        i15 = -244527035;
                    }
                    i14 = iM11308 ^ i15;
                    i44 = i6;
                    sArr8 = sArr2;
                    sArr9 = sArr3;
                    dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21395;
                    i42 = i4;
                    i43 = i5;
                    i46 = i3;
                    dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                    c0735 = c0735;
                    c80610 = c80610;
                    i37 = i14;
                    i36 = i12;
                    i41 = i41;
                    str5 = str5;
                    str4 = str4;
                    r8 = r10;
                    c127010 = c127010;
                    r10 = r8;
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    break;
                case -1696487653:
                case -1062389052:
                    C1189.m4368();
                    return false;
                case -1623752030:
                case 134279280:
                    C1668.m5582(iM450218);
                    return z;
                case -1609570286:
                case 364140668:
                    z = z ? 1 : 0;
                    i46 = i46;
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    c80610 = c80610;
                    dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                    c127010 = c127010;
                    i42 = i42;
                    sArr7 = sArr7;
                    sArr8 = sArr8;
                    i43 = i43;
                    dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21399;
                    str4 = str4;
                    i44 = i44;
                    str5 = str5;
                    i41 = i41;
                    c0735 = c0735;
                    sArr9 = sArr9;
                    short s = f19653[188];
                    int i48 = (s * s) + 306005049;
                    int i49 = s + 17493;
                    if ((i48 + i48) - (i49 * i49) >= 0) {
                        iM11306 = (C19806.m45029("᩻᩶") + i35) * 77;
                        i36 = ((iM11306 ^ i34) * 28739) ^ (-211680369);
                        i9 = -2003345490;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜܽ") + i34) * (-45);
                        i36 = ((iM11306 ^ i35) * (-9271)) ^ 1177469315;
                        i9 = 817506100;
                    }
                    i11 = iM11306 ^ i9;
                    sArr7 = sArr7;
                    i44 = i44;
                    sArr8 = sArr8;
                    sArr9 = sArr9;
                    dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21399;
                    i42 = i42;
                    i43 = i43;
                    i46 = i46;
                    z = z;
                    dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                    c0735 = c0735;
                    c80610 = c80610;
                    i37 = i11;
                    i41 = i41;
                    str5 = str5;
                    str4 = str4;
                    abstractActivityC5788 = this;
                    r8 = r10;
                    c127010 = c127010;
                    r10 = r8;
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    break;
                case -1508879738:
                case 2002149777:
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    i21 = i42;
                    dialogInterfaceOnClickListenerC21397 = dialogInterfaceOnClickListenerC21399;
                    if (iM6285 == (ThreadFactoryC3888.m11306(C1025.m3859(f19653, 237, 3, i38)) ^ 2118782183)) {
                        iM450212 = C19806.m45029("֨֨") ^ i34;
                        i22 = ((iM450212 ^ i35) * (-27099)) ^ 2131409294;
                        i23 = -42424359;
                    } else {
                        iM450212 = C19806.m45029("ۢᩴ") ^ i34;
                        i22 = ((iM450212 ^ i35) * 22573) ^ (-184936192);
                        i23 = -1652566370;
                    }
                    i37 = iM450212 ^ i23;
                    i36 = i22;
                    dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21397;
                    i42 = i21;
                    r10 = r10;
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    break;
                case -1475203374:
                case -1058549034:
                    i46 = i46;
                    ArrayList arrayList = new ArrayList(abstractActivityC5788.f19671);
                    abstractActivityC5788.f19663 = arrayList;
                    Collections.sort(arrayList, C7618.comparing(new C10968(z ? 1 : 0)));
                    iM450215 = (C19806.m45029("ܳ۫") ^ i35) * 27;
                    i31 = ((iM450215 ^ i34) * (-24667)) ^ 122009412;
                    i32 = -1559701003;
                    i37 = iM450215 ^ i32;
                    i36 = i31;
                    i46 = i46;
                    break;
                case -1257787796:
                case -109144088:
                    i38 = 24504;
                    iM11306 = ThreadFactoryC3888.m11306("۫᩶") ^ i35;
                    i36 = ((iM11306 ^ i34) * (-8119)) ^ 1002530396;
                    i9 = -1287628675;
                    i11 = iM11306 ^ i9;
                    sArr7 = sArr7;
                    i44 = i44;
                    sArr8 = sArr8;
                    sArr9 = sArr9;
                    dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21399;
                    i42 = i42;
                    i43 = i43;
                    i46 = i46;
                    z = z;
                    dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                    c0735 = c0735;
                    c80610 = c80610;
                    i37 = i11;
                    i41 = i41;
                    str5 = str5;
                    str4 = str4;
                    abstractActivityC5788 = this;
                    r8 = r10;
                    c127010 = c127010;
                    r10 = r8;
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    break;
                case -1208912546:
                case -1175653432:
                    new C10022(abstractActivityC5788, abstractActivityC5788);
                    return z;
                case -1191428722:
                case 1094415662:
                    C1189.m4360(iM450218);
                    return z;
                case -1172480816:
                case 815208373:
                    C2249.m6915();
                    i46 = i46;
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    iM450217 = iM450217;
                    c127010 = c127010;
                    i = i42;
                    i43 = i43;
                    dialogInterfaceOnClickListenerC21394 = dialogInterfaceOnClickListenerC21399;
                    c8067 = c80610;
                    dialogInterfaceOnClickListenerC13771 = dialogInterfaceOnClickListenerC13772;
                    str = str4;
                    sArr = sArr8;
                    i44 = i44;
                    str2 = str5;
                    i2 = i41;
                    int iM450224 = (C19806.m45029("ۘۘ") ^ i35) * (-27);
                    i37 = iM450224 ^ (-545638044);
                    i44 = i44;
                    sArr8 = sArr;
                    i41 = i2;
                    str5 = str2;
                    str4 = str;
                    dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21394;
                    i42 = i;
                    i43 = i43;
                    c127010 = c127010;
                    dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13771;
                    c80610 = c8067;
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    iM450217 = iM450217;
                    i36 = ((iM450224 ^ i34) * (-10741)) ^ 47226939;
                    i46 = i46;
                    break;
                case -1126872698:
                case 400379008:
                    C2477.m7593();
                    if (!C1377.f5749) {
                        i3 = i46;
                        dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                        c80610 = c80610;
                        dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                        c127010 = c127010;
                        i4 = i42;
                        sArr2 = sArr8;
                        i5 = i43;
                        dialogInterfaceOnClickListenerC21395 = dialogInterfaceOnClickListenerC21399;
                        str4 = str4;
                        i6 = i44;
                        str5 = str5;
                        i41 = i41;
                        c0735 = c0735;
                        sArr3 = sArr9;
                        iM11308 = (ThreadFactoryC3888.m11306("᩺ܿ") ^ i35) * 75;
                        i12 = ((iM11308 ^ i34) * (-5867)) ^ (-968121443);
                        i15 = -1783568932;
                        i14 = iM11308 ^ i15;
                        i44 = i6;
                        sArr8 = sArr2;
                        sArr9 = sArr3;
                        dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21395;
                        i42 = i4;
                        i43 = i5;
                        i46 = i3;
                        dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                        c0735 = c0735;
                        c80610 = c80610;
                        i37 = i14;
                        i36 = i12;
                        i41 = i41;
                        str5 = str5;
                        str4 = str4;
                        r8 = r10;
                        c127010 = c127010;
                        r10 = r8;
                        dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    } else {
                        i46 = i46;
                        dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                        iM450217 = iM450217;
                        c127010 = c127010;
                        i = i42;
                        i43 = i43;
                        dialogInterfaceOnClickListenerC21394 = dialogInterfaceOnClickListenerC21399;
                        c8067 = c80610;
                        dialogInterfaceOnClickListenerC13771 = dialogInterfaceOnClickListenerC13772;
                        str = str4;
                        sArr = sArr8;
                        i44 = i44;
                        str2 = str5;
                        i2 = i41;
                        int iM450225 = (C19806.m45029("ۘۘ") ^ i35) * (-27);
                        i37 = iM450225 ^ (-545638044);
                        i44 = i44;
                        sArr8 = sArr;
                        i41 = i2;
                        str5 = str2;
                        str4 = str;
                        dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21394;
                        i42 = i;
                        i43 = i43;
                        c127010 = c127010;
                        dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13771;
                        c80610 = c8067;
                        dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                        iM450217 = iM450217;
                        i36 = ((iM450225 ^ i34) * (-10741)) ^ 47226939;
                        i46 = i46;
                    }
                    break;
                case -1122367991:
                case -723929598:
                    i3 = i46;
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    int i50 = iM113011;
                    c80610 = c80610;
                    dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                    c127010 = c127010;
                    i4 = i42;
                    sArr4 = sArr7;
                    sArr2 = sArr8;
                    i5 = i43;
                    dialogInterfaceOnClickListenerC21395 = dialogInterfaceOnClickListenerC21399;
                    str4 = str4;
                    i6 = i44;
                    str5 = str5;
                    i41 = i41;
                    c0735 = c0735;
                    sArr3 = sArr9;
                    if (!abstractActivityC5788.m15943(z2)) {
                        iM450210 = (ThreadFactoryC3888.m11306("ܽ֨") + i34) * q.h;
                        iM113011 = i50;
                        i12 = ((iM450210 ^ i35) * 23925) ^ 4696942;
                        i13 = 1380151889;
                        i14 = iM450210 ^ i13;
                        sArr7 = sArr4;
                        i44 = i6;
                        sArr8 = sArr2;
                        sArr9 = sArr3;
                        dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21395;
                        i42 = i4;
                        i43 = i5;
                        i46 = i3;
                        dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                        c0735 = c0735;
                        c80610 = c80610;
                        i37 = i14;
                        i36 = i12;
                        i41 = i41;
                        str5 = str5;
                        str4 = str4;
                        r8 = r10;
                        c127010 = c127010;
                        r10 = r8;
                        dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    } else {
                        iM113011 = i50;
                        iM11307 = C19806.m45029("ۤ֡") ^ i35;
                        i36 = ((iM11307 ^ i34) * (-11063)) ^ (-1813351188);
                        i10 = 1029855173;
                        i11 = iM11307 ^ i10;
                        sArr7 = sArr4;
                        i44 = i6;
                        sArr8 = sArr2;
                        sArr9 = sArr3;
                        dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21395;
                        i42 = i4;
                        i43 = i5;
                        i46 = i3;
                        dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                        c0735 = c0735;
                        c80610 = c80610;
                        i37 = i11;
                        i41 = i41;
                        str5 = str5;
                        str4 = str4;
                        abstractActivityC5788 = this;
                        r8 = r10;
                        c127010 = c127010;
                        r10 = r8;
                        dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    }
                    break;
                case -1109776999:
                case -885849827:
                    i3 = i46;
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    c80610 = c80610;
                    dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                    c127010 = c127010;
                    i4 = i42;
                    sArr2 = sArr8;
                    i5 = i43;
                    dialogInterfaceOnClickListenerC21395 = dialogInterfaceOnClickListenerC21399;
                    str4 = str4;
                    i6 = i44;
                    str5 = str5;
                    i41 = i41;
                    c0735 = c0735;
                    sArr3 = sArr9;
                    if (MenuItemOnMenuItemClickListenerC3244.m9707()) {
                        iM11308 = ThreadFactoryC3888.m11306("ۗ۟") ^ i35;
                        i12 = ((iM11308 ^ i34) * 7493) ^ (-1020330658);
                        i15 = -257235789;
                    } else {
                        iM11308 = (i34 - ThreadFactoryC3888.m11306("᩹ۘ")) * 73;
                        i12 = ((iM11308 ^ i35) * 14019) ^ (-2060119001);
                        i15 = 731578884;
                    }
                    i14 = iM11308 ^ i15;
                    i44 = i6;
                    sArr8 = sArr2;
                    sArr9 = sArr3;
                    dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21395;
                    i42 = i4;
                    i43 = i5;
                    i46 = i3;
                    dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                    c0735 = c0735;
                    c80610 = c80610;
                    i37 = i14;
                    i36 = i12;
                    i41 = i41;
                    str5 = str5;
                    str4 = str4;
                    r8 = r10;
                    c127010 = c127010;
                    r10 = r8;
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    break;
                case -1099337735:
                case 1246963699:
                    AbstractC0464.m2313();
                    if (C1398.f5802 <= 0) {
                        i3 = i46;
                        dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                        c80610 = c80610;
                        dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                        c127010 = c127010;
                        i4 = i42;
                        sArr2 = sArr8;
                        i5 = i43;
                        dialogInterfaceOnClickListenerC21395 = dialogInterfaceOnClickListenerC21399;
                        str4 = str4;
                        i6 = i44;
                        str5 = str5;
                        i41 = i41;
                        c0735 = c0735;
                        sArr3 = sArr9;
                        iM11308 = ThreadFactoryC3888.m11306("۟᩹") ^ i35;
                        i12 = ((iM11308 ^ i34) * (-12121)) ^ 1464037939;
                        i15 = 2043753820;
                        i14 = iM11308 ^ i15;
                        i44 = i6;
                        sArr8 = sArr2;
                        sArr9 = sArr3;
                        dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21395;
                        i42 = i4;
                        i43 = i5;
                        i46 = i3;
                        dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                        c0735 = c0735;
                        c80610 = c80610;
                        i37 = i14;
                        i36 = i12;
                        i41 = i41;
                        str5 = str5;
                        str4 = str4;
                        r8 = r10;
                        c127010 = c127010;
                        r10 = r8;
                        dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    } else {
                        i46 = i46;
                        dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                        iM450217 = iM450217;
                        c127010 = c127010;
                        i = i42;
                        i43 = i43;
                        dialogInterfaceOnClickListenerC21394 = dialogInterfaceOnClickListenerC21399;
                        c8067 = c80610;
                        dialogInterfaceOnClickListenerC13771 = dialogInterfaceOnClickListenerC13772;
                        str = str4;
                        sArr = sArr8;
                        i44 = i44;
                        str2 = str5;
                        i2 = i41;
                        int iM450226 = (C19806.m45029("ۘۘ") ^ i35) * (-27);
                        i37 = iM450226 ^ (-545638044);
                        i44 = i44;
                        sArr8 = sArr;
                        i41 = i2;
                        str5 = str2;
                        str4 = str;
                        dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21394;
                        i42 = i;
                        i43 = i43;
                        c127010 = c127010;
                        dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13771;
                        c80610 = c8067;
                        dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                        iM450217 = iM450217;
                        i36 = ((iM450226 ^ i34) * (-10741)) ^ 47226939;
                        i46 = i46;
                    }
                    break;
                case -1097994513:
                case 1816314304:
                    int i51 = DialogInterfaceC19356.f62401;
                    c8069 = new C8067(abstractActivityC5788);
                    dialogInterfaceOnClickListenerC21398 = dialogInterfaceOnClickListenerC21399;
                    iM11309 = ThreadFactoryC3888.m11306(C1148.m4230(f19653, 286, 3, i38)) ^ 2100265563;
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM113010 = (i34 - ThreadFactoryC3888.m11306("ۛᩴ")) * (-11);
                        i26 = ((iM113010 ^ i35) * 17203) ^ 343129077;
                        i27 = 1088728736;
                        r10 = r10;
                    } else {
                        iM113010 = C19806.m45029("ۚ᩺") ^ i35;
                        i26 = ((iM113010 ^ i34) * 20749) ^ (-1942426129);
                        i27 = -2045084034;
                        r10 = r10;
                    }
                    i37 = iM113010 ^ i27;
                    DialogInterfaceOnClickListenerC21394 dialogInterfaceOnClickListenerC213910 = dialogInterfaceOnClickListenerC21398;
                    i42 = iM11309;
                    i36 = i26;
                    dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC213910;
                    break;
                case -1078854256:
                case 1976900932:
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    i2 = i41;
                    C0733 c0736 = c0735;
                    i = i42;
                    dialogInterfaceOnClickListenerC21394 = dialogInterfaceOnClickListenerC21399;
                    String str6 = str4;
                    C12709 c127011 = new C12709(abstractActivityC5788, r10);
                    String strM3413 = C0817.m3412(abstractActivityC5788, ThreadFactoryC3888.m11306(C2124.m6685(f19653, 228, 3, i38)) ^ 2125993984);
                    sArr9 = f19653;
                    if (C3722.m10894() > 0) {
                        int iM450227 = (C19806.m45029("᩸ۢ") ^ i34) * 31;
                        i37 = iM450227 ^ (-392443131);
                        c127010 = c127011;
                        c0735 = c0736;
                        str4 = str6;
                        i41 = i2;
                        dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21394;
                        i42 = i;
                        str5 = strM3413;
                        i36 = ((iM450227 ^ i35) * 10515) ^ (-7081938);
                        r10 = r10;
                        dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    } else {
                        str = str6;
                        c127010 = c127011;
                        c0735 = c0736;
                        str2 = strM3413;
                        c8067 = c80610;
                        dialogInterfaceOnClickListenerC13771 = dialogInterfaceOnClickListenerC13772;
                        sArr = sArr8;
                        int iM450228 = (C19806.m45029("ۘۘ") ^ i35) * (-27);
                        i37 = iM450228 ^ (-545638044);
                        i44 = i44;
                        sArr8 = sArr;
                        i41 = i2;
                        str5 = str2;
                        str4 = str;
                        dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21394;
                        i42 = i;
                        i43 = i43;
                        c127010 = c127010;
                        dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13771;
                        c80610 = c8067;
                        dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                        iM450217 = iM450217;
                        i36 = ((iM450228 ^ i34) * (-10741)) ^ 47226939;
                        i46 = i46;
                    }
                    break;
                case -1039922398:
                case 1948533099:
                    abstractActivityC5788.mo1989(new RunnableC18488(abstractActivityC5788, z2));
                    return z;
                case -1002105282:
                case -547510992:
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    c127010 = c127010;
                    i = i42;
                    dialogInterfaceOnClickListenerC21394 = dialogInterfaceOnClickListenerC21399;
                    short[] sArr14 = sArr10;
                    int i52 = i41;
                    String strM3414 = C0817.m3412(abstractActivityC5788, ThreadFactoryC3888.m11306(C1398.m4892(sArr14, i52, 3, i38)) ^ 2123706004);
                    sArr10 = sArr14;
                    String str7 = str5;
                    i2 = i52;
                    String str8 = str4;
                    str2 = str7;
                    C0733 c0737 = new C0733(abstractActivityC5788, C3051.m9146(str7, str8, strM3414));
                    if (C2642.m8171() == 0) {
                        int iM113013 = (i34 - ThreadFactoryC3888.m11306("᩶ۢ")) * (-85);
                        i37 = iM113013 ^ (-690247482);
                        i36 = ((iM113013 ^ i35) * 31457) ^ (-1395937005);
                        c127010 = c127010;
                        c0735 = c0737;
                        dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                        i41 = i2;
                        str5 = str2;
                        str4 = str8;
                        dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21394;
                        i42 = i;
                    } else {
                        c0735 = c0737;
                        str = str8;
                        c8067 = c80610;
                        dialogInterfaceOnClickListenerC13771 = dialogInterfaceOnClickListenerC13772;
                        sArr = sArr8;
                        int iM450229 = (C19806.m45029("ۘۘ") ^ i35) * (-27);
                        i37 = iM450229 ^ (-545638044);
                        i44 = i44;
                        sArr8 = sArr;
                        i41 = i2;
                        str5 = str2;
                        str4 = str;
                        dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21394;
                        i42 = i;
                        i43 = i43;
                        c127010 = c127010;
                        dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13771;
                        c80610 = c8067;
                        dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                        iM450217 = iM450217;
                        i36 = ((iM450229 ^ i34) * (-10741)) ^ 47226939;
                        i46 = i46;
                    }
                    break;
                case -936456442:
                case 1401239106:
                    i46 = i46;
                    if (abstractActivityC5788.f19663 == null) {
                        iM450215 = (i35 - C19806.m45029("᩺᩸")) * (-81);
                        i31 = ((iM450215 ^ i34) * 4239) ^ (-882454724);
                        i32 = 2042046921;
                    } else {
                        iM450215 = (C19806.m45029("ܳ۫") ^ i35) * 27;
                        i31 = ((iM450215 ^ i34) * (-24667)) ^ 122009412;
                        i32 = -1559701003;
                    }
                    i37 = iM450215 ^ i32;
                    i36 = i31;
                    i46 = i46;
                    break;
                case -892641258:
                case 1248578303:
                    return z;
                case -819603128:
                case -751425265:
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    c8068 = c80610;
                    c127010 = c127010;
                    i16 = i42;
                    dialogInterfaceOnClickListenerC21396 = dialogInterfaceOnClickListenerC21399;
                    str4 = str4;
                    str5 = str5;
                    i41 = i41;
                    c0733 = c0735;
                    sArr5 = sArr9;
                    C1148.m4224(c8068, iM113012 ^ 2116644591);
                    DialogInterfaceOnClickListenerC13771 dialogInterfaceOnClickListenerC13773 = new DialogInterfaceOnClickListenerC13771(z ? 1 : 0, abstractActivityC5788);
                    sArr8 = f19653;
                    i43 = 219;
                    i44 = 3;
                    if (C0216.f1393 != 0) {
                        dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13773;
                        int iM4502110 = C19806.m45029("ܿᩴ") ^ i34;
                        i37 = iM4502110 ^ (-1677034977);
                        c80610 = c8068;
                        i36 = ((iM4502110 ^ i35) * 14235) ^ 1402099999;
                        sArr9 = sArr5;
                        dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21396;
                        i42 = i16;
                    } else {
                        int iM450230 = C19806.m45029("֨ۡ") ^ i34;
                        i36 = ((iM450230 ^ i35) * (-19709)) ^ 1188723658;
                        i37 = iM450230 ^ 1817454394;
                        dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13773;
                        sArr9 = sArr5;
                        dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21396;
                        i42 = i16;
                        c80610 = c8068;
                    }
                    c0735 = c0733;
                    i41 = i41;
                    str5 = str5;
                    str4 = str4;
                    r8 = r10;
                    c127010 = c127010;
                    r10 = r8;
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    break;
                case -675452826:
                case 877068553:
                    i46 = i46;
                    abstractActivityC5788.m15938(z2);
                    if (abstractActivityC5788.f19673) {
                        iM450215 = (i34 - C19806.m45029("᩺ᩳ")) * (-65);
                        i31 = ((iM450215 ^ i35) * 24053) ^ 1949873148;
                        i32 = -1146456442;
                    } else {
                        iM450215 = C19806.m45029("᩹֡") ^ i34;
                        i31 = ((iM450215 ^ i35) * 7557) ^ (-1274441208);
                        i32 = -1532084085;
                    }
                    i37 = iM450215 ^ i32;
                    i36 = i31;
                    i46 = i46;
                    break;
                case -669735400:
                case 557546631:
                    C3286.m9800(abstractActivityC5788, new Intent(abstractActivityC5788, (Class<?>) ActivityC0061.class));
                    return z;
                case -557042991:
                case 1328313646:
                    i28 = i46;
                    ?? r33 = r10;
                    if (iM6285 == (ThreadFactoryC3888.m11306(C0050.m940(f19653, 295, 3, i38)) ^ 2099632566)) {
                        iM450214 = (C19806.m45029("֨᩻") ^ i34) * (-25);
                        i29 = ((iM450214 ^ i35) * (-22885)) ^ 790364161;
                        i30 = 1617402393;
                        r31 = r33;
                    } else {
                        iM450214 = (i35 - C19806.m45029("ᩴܺ")) * (-95);
                        i29 = ((iM450214 ^ i34) * (-28367)) ^ 130153660;
                        i30 = 1061368898;
                        r31 = r33;
                    }
                    i37 = iM450214 ^ i30;
                    i36 = i29;
                    i46 = i28;
                    r10 = r31;
                    break;
                case -432356515:
                case 180940368:
                    if (C1668.f6641 < 0) {
                        iM11309 = i42;
                        dialogInterfaceOnClickListenerC21398 = dialogInterfaceOnClickListenerC21399;
                        iM113010 = (i34 - ThreadFactoryC3888.m11306("ۛᩴ")) * (-11);
                        i26 = ((iM113010 ^ i35) * 17203) ^ 343129077;
                        i27 = 1088728736;
                        r10 = r10;
                        i37 = iM113010 ^ i27;
                        DialogInterfaceOnClickListenerC21394 dialogInterfaceOnClickListenerC213911 = dialogInterfaceOnClickListenerC21398;
                        i42 = iM11309;
                        i36 = i26;
                        dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC213911;
                    } else {
                        iM45029 = (C19806.m45029("᩹ۗ") ^ i34) * 35;
                        i7 = ((iM45029 ^ i35) * 13269) ^ 2027599310;
                        i8 = -1807483170;
                        i37 = iM45029 ^ i8;
                        i36 = i7;
                    }
                    break;
                case -385934032:
                case 1046493328:
                    m15952();
                    return z;
                case -338792139:
                case 129137439:
                    int i53 = i42;
                    dialogInterfaceOnClickListenerC21394 = dialogInterfaceOnClickListenerC21399;
                    i = i53;
                    if (iM6285 == (C19806.m45029(C1875.m6105(f19653, 283, 3, i38)) ^ 2130607136)) {
                        iM450213 = ThreadFactoryC3888.m11306("֫ۘ") ^ i35;
                        i24 = ((iM450213 ^ i34) * (-13803)) ^ (-655209252);
                        i25 = 1796870627;
                    } else {
                        iM450213 = (C19806.m45029("᩷ۖ") + i34) * 53;
                        i24 = ((iM450213 ^ i35) * (-14165)) ^ (-221144804);
                        i25 = 1107659284;
                    }
                    i37 = iM450213 ^ i25;
                    i36 = i24;
                    dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21394;
                    i42 = i;
                    break;
                case -326710982:
                case 426659420:
                    abstractActivityC5788.f19666 = abstractActivityC5788.f19663;
                    iM450215 = ThreadFactoryC3888.m11306("ۤ۟") ^ i34;
                    i31 = ((iM450215 ^ i35) * (-31779)) ^ 1956548608;
                    i32 = -1366647007;
                    i37 = iM450215 ^ i32;
                    i36 = i31;
                    i46 = i46;
                    break;
                case -313197005:
                case 106778234:
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    C8067 c80612 = c80610;
                    DialogInterfaceOnClickListenerC13771 dialogInterfaceOnClickListenerC13774 = dialogInterfaceOnClickListenerC13772;
                    c127010 = c127010;
                    int i54 = i42;
                    short[] sArr15 = sArr8;
                    int i55 = i43;
                    DialogInterfaceOnClickListenerC21394 dialogInterfaceOnClickListenerC213912 = dialogInterfaceOnClickListenerC21399;
                    String str9 = str4;
                    int i56 = i44;
                    String str10 = str5;
                    int i57 = i41;
                    C0733 c0738 = c0735;
                    short[] sArr16 = sArr9;
                    short[] sArr17 = sArr7;
                    int iM113014 = ThreadFactoryC3888.m11306(C0817.m3406(sArr17, 204, 3, i38)) ^ 2127717341;
                    int i58 = iM113011;
                    if (iM6285 == i58) {
                        int iM450231 = C19806.m45029("۬᩷") ^ i34;
                        sArr7 = sArr17;
                        i44 = i56;
                        sArr8 = sArr15;
                        sArr9 = sArr16;
                        dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC213912;
                        i42 = i54;
                        i43 = i55;
                        i46 = iM113014;
                        i36 = ((iM450231 ^ i35) * (-7971)) ^ 1842154355;
                        dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13774;
                        c0735 = c0738;
                        c80610 = c80612;
                        r8 = 0;
                        i37 = iM450231 ^ (-1911906619);
                        i41 = i57;
                        str5 = str10;
                        str4 = str9;
                        iM113011 = i58;
                    } else {
                        int iM450232 = C19806.m45029("ܶۙ") ^ i35;
                        i36 = ((iM450232 ^ i34) * (-9125)) ^ (-214690273);
                        sArr7 = sArr17;
                        i44 = i56;
                        i46 = iM113014;
                        sArr8 = sArr15;
                        sArr9 = sArr16;
                        dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC213912;
                        i42 = i54;
                        i43 = i55;
                        iM113011 = i58;
                        dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13774;
                        c0735 = c0738;
                        c80610 = c80612;
                        i37 = iM450232 ^ 961272640;
                        i41 = i57;
                        str5 = str10;
                        str4 = str9;
                        r8 = 0;
                    }
                    c127010 = c127010;
                    r10 = r8;
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    break;
                case -289302155:
                case 429370586:
                    abstractActivityC5788.f19666 = abstractActivityC5788.f19671;
                    iM450215 = ThreadFactoryC3888.m11306("ۤ۟") ^ i34;
                    i31 = ((iM450215 ^ i35) * (-31779)) ^ 1956548608;
                    i32 = -1366647007;
                    i37 = iM450215 ^ i32;
                    i36 = i31;
                    i46 = i46;
                    break;
                case -265332421:
                case 1481912787:
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    c127010 = c127010;
                    i16 = i42;
                    dialogInterfaceOnClickListenerC21396 = dialogInterfaceOnClickListenerC21399;
                    str4 = str4;
                    str5 = str5;
                    i41 = i41;
                    c0733 = c0735;
                    sArr5 = sArr9;
                    if (iM6285 == (ThreadFactoryC3888.m11306(RunnableC0195.m1429(f19653, 222, 3, i38)) ^ 2118211495)) {
                        iM450211 = ThreadFactoryC3888.m11306("ۚܳ") ^ i35;
                        i17 = ((iM450211 ^ i34) * 27669) ^ (-395864167);
                        i18 = 1016269646;
                    } else {
                        iM450211 = C19806.m45029("ۖۖ") ^ i34;
                        i17 = ((iM450211 ^ i35) * (-31557)) ^ 1181086603;
                        i18 = -2039011379;
                    }
                    i37 = iM450211 ^ i18;
                    i36 = i17;
                    sArr9 = sArr5;
                    dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21396;
                    i42 = i16;
                    c0735 = c0733;
                    i41 = i41;
                    str5 = str5;
                    str4 = str4;
                    r8 = r10;
                    c127010 = c127010;
                    r10 = r8;
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    break;
                case -256933585:
                case 1713507661:
                    return z2;
                case -249998755:
                case 1299731465:
                    C1668.m5582(ThreadFactoryC3888.m11306(C2477.m7604(f19653, 298, 3, i38)) ^ 2127236272);
                    iM11309 = i42;
                    i46 = i46;
                    r9 = r10;
                    dialogInterfaceOnClickListenerC21398 = dialogInterfaceOnClickListenerC21399;
                    iM113010 = (i35 - ThreadFactoryC3888.m11306("᩵֨")) * 123;
                    i26 = ((iM113010 ^ i34) * (-16287)) ^ 526191834;
                    i27 = -105079466;
                    r10 = r9;
                    i37 = iM113010 ^ i27;
                    DialogInterfaceOnClickListenerC21394 dialogInterfaceOnClickListenerC213913 = dialogInterfaceOnClickListenerC21398;
                    i42 = iM11309;
                    i36 = i26;
                    dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC213913;
                    break;
                case -233311762:
                case 289712520:
                    i21 = i42;
                    dialogInterfaceOnClickListenerC21397 = dialogInterfaceOnClickListenerC21399;
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    if (C1668.m5579(ApplicationC0716.f2992, C3577.m10567(RunnableC0195.m1429(f19653, 272, 11, i38), C2642.m8172(f19653, 240, 32, i38)), z2)) {
                        iM450212 = C19806.m45029("᩷ܳ") ^ i35;
                        i22 = ((iM450212 ^ i34) * 143) ^ 1570652268;
                        i23 = 618726628;
                    } else {
                        iM450212 = (ThreadFactoryC3888.m11306("ۘܿ") ^ i34) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i22 = ((iM450212 ^ i35) * 16813) ^ 1201562452;
                        i23 = 303110036;
                    }
                    i37 = iM450212 ^ i23;
                    i36 = i22;
                    dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21397;
                    i42 = i21;
                    r10 = r10;
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    break;
                case -193719100:
                case 1739935882:
                    new C20605(abstractActivityC5788, abstractActivityC5788);
                    return z;
                case -157691056:
                case 712138865:
                    C8067 c80613 = c80610;
                    AbstractC0464.m2309(c80613, C19806.m45029(ViewTreeObserverOnPreDrawListenerC3327.m9869(sArr8, i43, i44, i38)) ^ 2099426314, dialogInterfaceOnClickListenerC13772);
                    C10634.m26830(c80613, i46, r10);
                    CallableC1627.m5514(c80613);
                    return z;
                case -100244219:
                case 589750298:
                    i3 = i46;
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    c80610 = c80610;
                    dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                    c127010 = c127010;
                    i4 = i42;
                    sArr4 = sArr7;
                    sArr2 = sArr8;
                    i5 = i43;
                    dialogInterfaceOnClickListenerC21395 = dialogInterfaceOnClickListenerC21399;
                    str4 = str4;
                    i6 = i44;
                    str5 = str5;
                    i41 = i41;
                    c0735 = c0735;
                    sArr3 = sArr9;
                    iM6285 = C1937.m6285(menuItem);
                    z = true;
                    z = true;
                    z2 = false;
                    if (iM6285 == (ThreadFactoryC3888.m11306(C3660.m10790(f19653, 189, 3, i38)) ^ 2098350131)) {
                        iM11307 = C19806.m45029("ۖۢ") ^ i34;
                        i36 = ((iM11307 ^ i35) * 28023) ^ (-366297677);
                        i10 = 149330392;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ۚۧ") ^ i34;
                        i36 = ((iM11307 ^ i35) * 30753) ^ (-1032857850);
                        i10 = -73684136;
                    }
                    i11 = iM11307 ^ i10;
                    sArr7 = sArr4;
                    i44 = i6;
                    sArr8 = sArr2;
                    sArr9 = sArr3;
                    dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21395;
                    i42 = i4;
                    i43 = i5;
                    i46 = i3;
                    dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                    c0735 = c0735;
                    c80610 = c80610;
                    i37 = i11;
                    i41 = i41;
                    str5 = str5;
                    str4 = str4;
                    abstractActivityC5788 = this;
                    r8 = r10;
                    c127010 = c127010;
                    r10 = r8;
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    break;
                case 39191408:
                case 404026772:
                    i3 = i46;
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    c80610 = c80610;
                    dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                    c127010 = c127010;
                    i4 = i42;
                    sArr4 = sArr7;
                    sArr2 = sArr8;
                    i5 = i43;
                    dialogInterfaceOnClickListenerC21395 = dialogInterfaceOnClickListenerC21399;
                    str4 = str4;
                    i6 = i44;
                    str5 = str5;
                    i41 = i41;
                    c0735 = c0735;
                    sArr3 = sArr9;
                    if (MenuItemOnMenuItemClickListenerC3244.m9707()) {
                        iM450210 = (i35 - C19806.m45029("ܳ᩷")) * (-49);
                        i12 = ((iM450210 ^ i34) * (-6897)) ^ (-521313135);
                        i13 = 565627225;
                    } else {
                        iM450210 = (i34 - ThreadFactoryC3888.m11306("۫ܰ")) * (-3);
                        i12 = ((iM450210 ^ i35) * (-12747)) ^ (-1212060087);
                        i13 = -1754862472;
                    }
                    i14 = iM450210 ^ i13;
                    sArr7 = sArr4;
                    i44 = i6;
                    sArr8 = sArr2;
                    sArr9 = sArr3;
                    dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21395;
                    i42 = i4;
                    i43 = i5;
                    i46 = i3;
                    dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                    c0735 = c0735;
                    c80610 = c80610;
                    i37 = i14;
                    i36 = i12;
                    i41 = i41;
                    str5 = str5;
                    str4 = str4;
                    r8 = r10;
                    c127010 = c127010;
                    r10 = r8;
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    break;
                case 55032743:
                case 847455868:
                    i3 = i46;
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    c80610 = c80610;
                    dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                    c127010 = c127010;
                    i4 = i42;
                    sArr4 = sArr7;
                    sArr2 = sArr8;
                    i5 = i43;
                    dialogInterfaceOnClickListenerC21395 = dialogInterfaceOnClickListenerC21399;
                    str4 = str4;
                    i6 = i44;
                    str5 = str5;
                    i41 = i41;
                    c0735 = c0735;
                    sArr3 = sArr9;
                    if (iM6285 == (ThreadFactoryC3888.m11306(RunnableC0195.m1429(f19653, 198, 3, i38)) ^ 2101256393)) {
                        iM11307 = C19806.m45029("ۧܿ") ^ i35;
                        i36 = ((iM11307 ^ i34) * (-18305)) ^ (-1272885876);
                        i10 = -191089358;
                    } else {
                        iM11307 = (C19806.m45029("ۜ᩶") ^ i35) * q.h;
                        i36 = ((iM11307 ^ i34) * (-11113)) ^ (-2001885389);
                        i10 = -356022420;
                    }
                    i11 = iM11307 ^ i10;
                    sArr7 = sArr4;
                    i44 = i6;
                    sArr8 = sArr2;
                    sArr9 = sArr3;
                    dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21395;
                    i42 = i4;
                    i43 = i5;
                    i46 = i3;
                    dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                    c0735 = c0735;
                    c80610 = c80610;
                    i37 = i11;
                    i41 = i41;
                    str5 = str5;
                    str4 = str4;
                    abstractActivityC5788 = this;
                    r8 = r10;
                    c127010 = c127010;
                    r10 = r8;
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    break;
                case 113754969:
                case 1591535025:
                    C1398.m4895();
                    if (!RunnableC1895.f7152) {
                        i3 = i46;
                        dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                        c80610 = c80610;
                        dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                        c127010 = c127010;
                        i4 = i42;
                        sArr2 = sArr8;
                        i5 = i43;
                        dialogInterfaceOnClickListenerC21395 = dialogInterfaceOnClickListenerC21399;
                        str4 = str4;
                        i6 = i44;
                        str5 = str5;
                        i41 = i41;
                        c0735 = c0735;
                        sArr3 = sArr9;
                        iM11308 = ThreadFactoryC3888.m11306("۟᩹") ^ i35;
                        i12 = ((iM11308 ^ i34) * (-12121)) ^ 1464037939;
                        i15 = 2043753820;
                        i14 = iM11308 ^ i15;
                        i44 = i6;
                        sArr8 = sArr2;
                        sArr9 = sArr3;
                        dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21395;
                        i42 = i4;
                        i43 = i5;
                        i46 = i3;
                        dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                        c0735 = c0735;
                        c80610 = c80610;
                        i37 = i14;
                        i36 = i12;
                        i41 = i41;
                        str5 = str5;
                        str4 = str4;
                        r8 = r10;
                        c127010 = c127010;
                        r10 = r8;
                        dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    } else {
                        iM45029 = (i35 - ThreadFactoryC3888.m11306("᩷ۡ")) * (-37);
                        i7 = ((iM45029 ^ i34) * 10869) ^ 1133251224;
                        i8 = 1238330511;
                        i37 = iM45029 ^ i8;
                        i36 = i7;
                    }
                    break;
                case 117134192:
                case 576482045:
                    C4376.m12229(abstractActivityC5788, new RunnableC4263(2, abstractActivityC5788));
                    return z;
                case 140300186:
                case 1850853439:
                    m15925();
                    return z;
                case 152252640:
                case 2084794725:
                    abstractActivityC5788.f19673 = z2;
                    abstractActivityC5788.f19672 = -1;
                    i46 = i46;
                    RunnableC0195.m1436(abstractActivityC5788, ThreadFactoryC3888.m11306(C3722.m10901(f19653, 324, 3, i38)) ^ 2125648937);
                    abstractActivityC5788.f19664 = r10;
                    m15957();
                    iM450215 = C19806.m45029("᩹֡") ^ i34;
                    i31 = ((iM450215 ^ i35) * 7557) ^ (-1274441208);
                    i32 = -1532084085;
                    i37 = iM450215 ^ i32;
                    i36 = i31;
                    i46 = i46;
                    break;
                case 344606302:
                case 1879961776:
                    i3 = i46;
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    c80610 = c80610;
                    dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                    c127010 = c127010;
                    i4 = i42;
                    sArr2 = sArr8;
                    i5 = i43;
                    dialogInterfaceOnClickListenerC21395 = dialogInterfaceOnClickListenerC21399;
                    str4 = str4;
                    i6 = i44;
                    str5 = str5;
                    i41 = i41;
                    c0735 = c0735;
                    sArr3 = sArr9;
                    if (iM6285 == (C19806.m45029(C3660.m10790(f19653, 210, 3, i38)) ^ 2118695477)) {
                        iM11308 = (i34 - ThreadFactoryC3888.m11306("ۗ᩵")) * (-57);
                        i12 = ((iM11308 ^ i35) * (-27397)) ^ (-1398861915);
                        i15 = -422535764;
                    } else {
                        iM11308 = (i35 - ThreadFactoryC3888.m11306("᩸ۛ")) * (-87);
                        i12 = ((iM11308 ^ i34) * 27053) ^ (-657267825);
                        i15 = 1113415779;
                    }
                    i14 = iM11308 ^ i15;
                    i44 = i6;
                    sArr8 = sArr2;
                    sArr9 = sArr3;
                    dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21395;
                    i42 = i4;
                    i43 = i5;
                    i46 = i3;
                    dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                    c0735 = c0735;
                    c80610 = c80610;
                    i37 = i14;
                    i36 = i12;
                    i41 = i41;
                    str5 = str5;
                    str4 = str4;
                    r8 = r10;
                    c127010 = c127010;
                    r10 = r8;
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    break;
                case 348597661:
                case 1452880849:
                    i46 = i46;
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    dialogInterfaceOnClickListenerC13771 = dialogInterfaceOnClickListenerC13772;
                    c127010 = c127010;
                    i = i42;
                    sArr = sArr8;
                    i43 = i43;
                    dialogInterfaceOnClickListenerC21394 = dialogInterfaceOnClickListenerC21399;
                    str = str4;
                    i44 = i44;
                    str2 = str5;
                    i2 = i41;
                    C0733 c0739 = c0735;
                    short[] sArr18 = sArr9;
                    int i59 = DialogInterfaceC19356.f62401;
                    c8067 = new C8067(abstractActivityC5788);
                    iM450217 = C19806.m45029(RunnableC1606.m5481(f19653, 213, 3, i38));
                    i40 = 2101692400;
                    if (C1977.f7413 > 0) {
                        int iM113015 = ThreadFactoryC3888.m11306("ۙ۠") ^ i35;
                        i37 = iM113015 ^ 1800185926;
                        i44 = i44;
                        sArr8 = sArr;
                        sArr9 = sArr18;
                        dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21394;
                        i42 = i;
                        i43 = i43;
                        dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13771;
                        c80610 = c8067;
                        c0735 = c0739;
                        iM450217 = iM450217;
                        i36 = ((iM113015 ^ i34) * 2921) ^ 2055182068;
                        i41 = i2;
                        str5 = str2;
                        str4 = str;
                        i46 = i46;
                        r8 = r10;
                        c127010 = c127010;
                        r10 = r8;
                        dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    } else {
                        sArr9 = sArr18;
                        c0735 = c0739;
                        int iM4502210 = (C19806.m45029("ۘۘ") ^ i35) * (-27);
                        i37 = iM4502210 ^ (-545638044);
                        i44 = i44;
                        sArr8 = sArr;
                        i41 = i2;
                        str5 = str2;
                        str4 = str;
                        dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21394;
                        i42 = i;
                        i43 = i43;
                        c127010 = c127010;
                        dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13771;
                        c80610 = c8067;
                        dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                        iM450217 = iM450217;
                        i36 = ((iM4502210 ^ i34) * (-10741)) ^ 47226939;
                        i46 = i46;
                    }
                    break;
                case 426118627:
                case 1839526635:
                    iM11309 = i42;
                    dialogInterfaceOnClickListenerC21398 = dialogInterfaceOnClickListenerC21399;
                    r9 = r10;
                    if (abstractActivityC5788.m15943(z)) {
                        iM113010 = (i34 - ThreadFactoryC3888.m11306("ܿۧ")) * (-111);
                        i26 = ((iM113010 ^ i35) * 24405) ^ 633966812;
                        i27 = -1407388174;
                        r10 = r10;
                    } else {
                        iM113010 = (i35 - ThreadFactoryC3888.m11306("᩵֨")) * 123;
                        i26 = ((iM113010 ^ i34) * (-16287)) ^ 526191834;
                        i27 = -105079466;
                        r10 = r9;
                    }
                    i37 = iM113010 ^ i27;
                    DialogInterfaceOnClickListenerC21394 dialogInterfaceOnClickListenerC213914 = dialogInterfaceOnClickListenerC21398;
                    i42 = iM11309;
                    i36 = i26;
                    dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC213914;
                    break;
                case 427941120:
                case 603159899:
                    AbstractC0464.m2309(c8069, ThreadFactoryC3888.m11306(ViewTreeObserverOnPreDrawListenerC3327.m9869(sArr11, i39, i45, i38)) ^ 2130204359, dialogInterfaceOnClickListenerC21399);
                    i46 = i46;
                    C1066.m4025(c8069, i46, r10);
                    dialogInterfaceOnClickListenerC120610 = new DialogInterfaceOnClickListenerC12069(z ? 1 : 0, abstractActivityC5788);
                    sArr12 = f19653;
                    if (C1460.f5948 >= 0) {
                        iM45029 = (i35 - ThreadFactoryC3888.m11306("᩷ۡ")) * (-37);
                        i7 = ((iM45029 ^ i34) * 10869) ^ 1133251224;
                        i8 = 1238330511;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤ᩷") ^ i34) * 23;
                        i7 = ((iM45029 ^ i35) * 30241) ^ (-1752124542);
                        i8 = 1845491216;
                    }
                    i37 = iM45029 ^ i8;
                    i36 = i7;
                    break;
                case 433898882:
                case 1668609588:
                    C2642.m8171();
                    if (C0629.f2722 <= 0) {
                        iM45029 = (i35 - C19806.m45029("ܶ֨")) * 77;
                        i7 = ((iM45029 ^ i34) * (-10629)) ^ (-264752323);
                        i8 = 1144626228;
                        i37 = iM45029 ^ i8;
                        i36 = i7;
                    } else {
                        i3 = i46;
                        dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                        c80610 = c80610;
                        dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                        c127010 = c127010;
                        i4 = i42;
                        sArr2 = sArr8;
                        i5 = i43;
                        dialogInterfaceOnClickListenerC21395 = dialogInterfaceOnClickListenerC21399;
                        str4 = str4;
                        i6 = i44;
                        str5 = str5;
                        i41 = i41;
                        c0735 = c0735;
                        sArr3 = sArr9;
                        iM11308 = ThreadFactoryC3888.m11306("۟᩹") ^ i35;
                        i12 = ((iM11308 ^ i34) * (-12121)) ^ 1464037939;
                        i15 = 2043753820;
                        i14 = iM11308 ^ i15;
                        i44 = i6;
                        sArr8 = sArr2;
                        sArr9 = sArr3;
                        dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21395;
                        i42 = i4;
                        i43 = i5;
                        i46 = i3;
                        dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                        c0735 = c0735;
                        c80610 = c80610;
                        i37 = i14;
                        i36 = i12;
                        i41 = i41;
                        str5 = str5;
                        str4 = str4;
                        r8 = r10;
                        c127010 = c127010;
                        r10 = r8;
                        dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    }
                    break;
                case 482000734:
                case 1396988885:
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    c127010 = c127010;
                    i16 = i42;
                    dialogInterfaceOnClickListenerC21396 = dialogInterfaceOnClickListenerC21399;
                    String str11 = str4;
                    str5 = str5;
                    i41 = i41;
                    c0733 = c0735;
                    sArr5 = sArr9;
                    str4 = str11;
                    if (iM6285 == (C19806.m45029(C2871.m8640(f19653, HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS, 3, i38)) ^ 2097830864)) {
                        iM450211 = ThreadFactoryC3888.m11306("۟۬") ^ i35;
                        i17 = ((iM450211 ^ i34) * (-31419)) ^ (-263239353);
                        i18 = -1152260208;
                    } else {
                        iM450211 = ThreadFactoryC3888.m11306("֨᩵") ^ i35;
                        i17 = ((iM450211 ^ i34) * 15529) ^ (-1709540990);
                        i18 = -279554344;
                    }
                    i37 = iM450211 ^ i18;
                    i36 = i17;
                    sArr9 = sArr5;
                    dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21396;
                    i42 = i16;
                    c0735 = c0733;
                    i41 = i41;
                    str5 = str5;
                    str4 = str4;
                    r8 = r10;
                    c127010 = c127010;
                    r10 = r8;
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    break;
                case 614672976:
                case 1469802210:
                    dialogInterfaceOnClickListenerC12069 = dialogInterfaceOnClickListenerC120610;
                    str3 = str5;
                    c12709 = c127010;
                    i19 = i42;
                    DialogInterfaceOnClickListenerC21394 dialogInterfaceOnClickListenerC213915 = dialogInterfaceOnClickListenerC21399;
                    c0734 = c0735;
                    sArr6 = sArr9;
                    strM3412 = C0817.m3412(abstractActivityC5788, C19806.m45029(C3286.m9788(sArr6, 231, 3, i38)) ^ 2122640507);
                    sArr10 = f19653;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC213915;
                        i20 = 234;
                        int iM4502211 = C19806.m45029("ۧᩳ") ^ i34;
                        short[] sArr19 = sArr6;
                        i36 = ((iM4502211 ^ i35) * (-1367)) ^ (-921614966);
                        i37 = iM4502211 ^ 639171513;
                        c127010 = c12709;
                        sArr9 = sArr19;
                        i42 = i19;
                        dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC12069;
                        c0735 = c0734;
                        i41 = i20;
                        str5 = str3;
                        str4 = strM3412;
                    } else {
                        int iM113016 = ThreadFactoryC3888.m11306("۫֨") ^ i35;
                        i37 = iM113016 ^ (-1929181264);
                        i36 = ((iM113016 ^ i34) * 7939) ^ 1120996761;
                        c127010 = c12709;
                        str5 = str3;
                        sArr9 = sArr6;
                        dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC213915;
                        i42 = i19;
                        dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC12069;
                        str4 = strM3412;
                        c0735 = c0734;
                        i41 = 234;
                    }
                    break;
                case 771316617:
                case 775924192:
                    i3 = i46;
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    c80610 = c80610;
                    dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                    c127010 = c127010;
                    i4 = i42;
                    sArr2 = sArr8;
                    i5 = i43;
                    dialogInterfaceOnClickListenerC21395 = dialogInterfaceOnClickListenerC21399;
                    str4 = str4;
                    i6 = i44;
                    str5 = str5;
                    i41 = i41;
                    c0735 = c0735;
                    sArr3 = sArr9;
                    iM113011 = ThreadFactoryC3888.m11306(C0962.m3747(f19653, 201, 3, i38)) ^ 2121416560;
                    sArr7 = f19653;
                    if (C1398.f5802 <= 0) {
                        iM11308 = ThreadFactoryC3888.m11306("۟᩹") ^ i35;
                        i12 = ((iM11308 ^ i34) * (-12121)) ^ 1464037939;
                        i15 = 2043753820;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("ܿܿ") ^ i34;
                        i12 = ((iM11308 ^ i35) * 24581) ^ (-2083735319);
                        i15 = -1668224055;
                    }
                    i14 = iM11308 ^ i15;
                    i44 = i6;
                    sArr8 = sArr2;
                    sArr9 = sArr3;
                    dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21395;
                    i42 = i4;
                    i43 = i5;
                    i46 = i3;
                    dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                    c0735 = c0735;
                    c80610 = c80610;
                    i37 = i14;
                    i36 = i12;
                    i41 = i41;
                    str5 = str5;
                    str4 = str4;
                    r8 = r10;
                    c127010 = c127010;
                    r10 = r8;
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    break;
                case 934157165:
                case 1633038918:
                    i46 = i46;
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    c80610 = c80610;
                    dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                    c127010 = c127010;
                    i42 = i42;
                    sArr7 = sArr7;
                    sArr8 = sArr8;
                    i43 = i43;
                    dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21399;
                    str4 = str4;
                    i44 = i44;
                    str5 = str5;
                    i41 = i41;
                    c0735 = c0735;
                    sArr9 = sArr9;
                    int iM450233 = C19806.m45029(MenuItemOnMenuItemClickListenerC3244.m9715(f19653, 192, 3, i38)) ^ 2098557778;
                    short[] sArr20 = f19653;
                    z = z ? 1 : 0;
                    iM450218 = C19806.m45029(C1460.m5047(sArr20, 195, 3, i38)) ^ 2116726910;
                    if (iM6285 == iM450233) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰۡ") + i34) * 65;
                        i36 = ((iM11306 ^ i35) * (-11701)) ^ (-1833230119);
                        i9 = 1275996788;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ۚ") ^ i35) * 29;
                        i36 = ((iM11306 ^ i34) * (-30289)) ^ (-1958200655);
                        i9 = 1337406018;
                    }
                    i11 = iM11306 ^ i9;
                    sArr7 = sArr7;
                    i44 = i44;
                    sArr8 = sArr8;
                    sArr9 = sArr9;
                    dialogInterfaceOnClickListenerC21399 = dialogInterfaceOnClickListenerC21399;
                    i42 = i42;
                    i43 = i43;
                    i46 = i46;
                    z = z;
                    dialogInterfaceOnClickListenerC13772 = dialogInterfaceOnClickListenerC13772;
                    c0735 = c0735;
                    c80610 = c80610;
                    i37 = i11;
                    i41 = i41;
                    str5 = str5;
                    str4 = str4;
                    abstractActivityC5788 = this;
                    r8 = r10;
                    c127010 = c127010;
                    r10 = r8;
                    dialogInterfaceOnClickListenerC120610 = dialogInterfaceOnClickListenerC120610;
                    break;
                case 1278216395:
                case 1364269574:
                    C12709 c127012 = c127010;
                    c127012.setAdapter((SpinnerAdapter) c0735);
                    c127012.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    c127012.setSelection(abstractActivityC5788.f19670);
                    new C7199(abstractActivityC5788, abstractActivityC5788, abstractActivityC5788.f19673, c127012);
                    return z;
                default:
                    C1189.m4361(C19806.m45029(C1460.m5047(f19653, 207, 3, i38)) ^ 2116666798);
                    return z;
            }
        }
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m15958() {
        return this.f19671;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0403 A[PHI: r18
      0x0403: PHI (r18v42 int) = (r18v3 int), (r18v9 int), (r18v43 int) binds: [B:109:0x0401, B:85:0x0328, B:8:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:114:0x0434 A[PHI: r18
      0x0434: PHI (r18v38 int) = (r18v2 int), (r18v4 int), (r18v39 int) binds: [B:113:0x0432, B:105:0x03e5, B:12:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:118:0x0467 A[PHI: r18
      0x0467: PHI (r18v37 int) = (r18v1 int), (r18v5 int), (r18v7 int), (r18v40 int) binds: [B:117:0x0465, B:101:0x03c8, B:93:0x0377, B:13:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x008c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0115 A[PHI: r12 r18
      0x0115: PHI (r12v5 l.᩺ۗۨ) = (r12v4 l.᩺ۗۨ), (r12v2 l.᩺ۗۨ), (r12v2 l.᩺ۗۨ) binds: [B:37:0x00fc, B:34:0x00d8, B:32:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x0115: PHI (r18v29 int) = (r18v27 int), (r18v28 int), (r18v30 int) binds: [B:37:0x00fc, B:34:0x00d8, B:32:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        if (l.RunnableC1564.f6300 != false) goto L23;
     */
    @Override // android.widget.AdapterView.OnItemLongClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onItemLongClick(android.widget.AdapterView r18, android.view.View r19, int r20, long r21) {
        /*
            Method dump skipped, instruction units count: 1466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC5788.onItemLongClick(android.widget.AdapterView, android.view.View, int, long):boolean");
    }

    /* JADX INFO: renamed from: ۚۙ */
    public void mo8789() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15954(int i, View view) {
        int iM45029;
        int i2;
        ArrayList arrayList = null;
        boolean z = false;
        boolean z2 = false;
        int i3 = -1524885212;
        int i4 = C2871.f10837;
        int i5 = C2477.f9839;
        int iM450210 = C19806.m45029("᩺ܳ") ^ i4;
        int i6 = ((iM450210 ^ i5) * 14653) ^ (-1932212487);
        int i7 = -1933937148;
        while (true) {
            int i8 = iM450210 ^ i7;
            while (true) {
                i3 = ((((i3 ^ i5) * 5855) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2070390520:
                    case -379631563:
                        C10634.m26820();
                        iM450210 = (ThreadFactoryC3888.m11306("ܿ֡") + i5) * (-91);
                        i6 = ((iM450210 ^ i4) * (-29249)) ^ (-770199539);
                        i7 = -730259151;
                    case -1775986949:
                    case -1764376893:
                        C0629.m2914(view, C20368.f65992);
                        if (this.f19667 != 0) {
                            iM450210 = (C19806.m45029("ᩳۢ") ^ i4) * (-87);
                            i6 = ((iM450210 ^ i5) * 47) ^ (-1262639955);
                            i7 = 1291242892;
                        } else {
                            iM450210 = (i5 - C19806.m45029("᩺ܶ")) * 79;
                            i6 = ((iM450210 ^ i4) * 22271) ^ (-1887401435);
                            i7 = 1200565774;
                        }
                        break;
                    case -1726011280:
                    case 351534897:
                        z2 = false;
                        C0629.m2914(view, 0);
                        if (this.f19667 != 0) {
                            iM450210 = ThreadFactoryC3888.m11306("ᩳ᩸") ^ i4;
                            i6 = ((iM450210 ^ i5) * (-19205)) ^ (-134559679);
                            i7 = 48132512;
                        } else {
                            iM450210 = (i5 - C19806.m45029("ܶܶ")) * (-15);
                            i6 = ((iM450210 ^ i4) * 15773) ^ (-1340019759);
                            i7 = -1979952841;
                        }
                        break;
                    case -1725475894:
                    case 225719020:
                        if (!RunnableC3388.m10064()) {
                            iM450210 = (ThreadFactoryC3888.m11306("ܿ֡") + i5) * (-91);
                            i6 = ((iM450210 ^ i4) * (-29249)) ^ (-770199539);
                            i7 = -730259151;
                            break;
                        }
                        iM450210 = ThreadFactoryC3888.m11306("᩷᩷") ^ i4;
                        i6 = ((iM450210 ^ i5) * (-26985)) ^ (-1572850589);
                        i7 = -1954188544;
                        break;
                    case -1725128262:
                    case 1121476432:
                        if (!C0629.m2907()) {
                            iM450210 = (i4 - C19806.m45029("᩵ۛ")) * 61;
                            i6 = ((iM450210 ^ i5) * 1727) ^ 1196012861;
                            i7 = 653722598;
                        } else {
                            iM450210 = (i5 - C19806.m45029("ᩳ֫")) * (-89);
                            i6 = ((iM450210 ^ i4) * 23989) ^ 1002510402;
                            i7 = -288627868;
                        }
                        break;
                    case -1565863197:
                    case 627839523:
                        RunnableC1606.m5473();
                        if (C10634.f36300 >= 0) {
                            iM450210 = C19806.m45029("֡۬") ^ i4;
                            i6 = ((iM450210 ^ i5) * 4769) ^ (-1024715197);
                            i7 = -265750345;
                        } else {
                            iM450210 = (i4 - C19806.m45029("᩵ۛ")) * 61;
                            i6 = ((iM450210 ^ i5) * 1727) ^ 1196012861;
                            i7 = 653722598;
                        }
                        break;
                    case -1339216567:
                    case 100914645:
                        break;
                    case -1289428038:
                    case -78643240:
                        if (C1668.f6641 < 0) {
                            iM450210 = C19806.m45029("ۘ۟") ^ i5;
                            i6 = ((iM450210 ^ i4) * (-23515)) ^ 1264998601;
                            i7 = 1817356079;
                        } else {
                            iM450210 = (i5 - C19806.m45029("ᩳ֫")) * (-89);
                            i6 = ((iM450210 ^ i4) * 23989) ^ 1002510402;
                            i7 = -288627868;
                        }
                        break;
                    case -1236972846:
                    case -695531698:
                        arrayList = this.f19666;
                        if (C1377.m4833() == 0) {
                            iM450210 = (C19806.m45029("ۧۚ") + i4) * 55;
                            i6 = ((iM450210 ^ i5) * 8619) ^ (-1156907292);
                            i7 = 921240467;
                        } else {
                            iM450210 = ThreadFactoryC3888.m11306("۫᩵") ^ i5;
                            i6 = ((iM450210 ^ i4) * 19587) ^ (-1093234344);
                            i7 = -761584409;
                        }
                        break;
                    case -902197567:
                    case 1787860296:
                        C2642.m8171();
                        break;
                    case -642871648:
                    case 1083826011:
                        m15938(z);
                        iM450210 = (C19806.m45029("ᩳۢ") ^ i4) * (-87);
                        i6 = ((iM450210 ^ i5) * 47) ^ (-1262639955);
                        i7 = 1291242892;
                        break;
                    case -455979911:
                    case 1610761298:
                        m15938(z2);
                        iM450210 = ThreadFactoryC3888.m11306("ᩳ᩸") ^ i4;
                        i6 = ((iM450210 ^ i5) * (-19205)) ^ (-134559679);
                        i7 = 48132512;
                        break;
                    case -287801730:
                    case -216570574:
                        if (C1668.f6641 >= 0) {
                            iM450210 = (i4 - C19806.m45029("᩵ۛ")) * 61;
                            i6 = ((iM450210 ^ i5) * 1727) ^ 1196012861;
                            i7 = 653722598;
                            break;
                        }
                        iM450210 = (ThreadFactoryC3888.m11306("ܿ֡") + i5) * (-91);
                        i6 = ((iM450210 ^ i4) * (-29249)) ^ (-770199539);
                        i7 = -730259151;
                        break;
                    case -230173261:
                    case 339587508:
                        if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                            iM450210 = (i4 - ThreadFactoryC3888.m11306("ܶۨ")) * (-23);
                            i6 = ((iM450210 ^ i5) * (-12385)) ^ 1999647137;
                            i7 = -221870430;
                        } else {
                            iM450210 = (ThreadFactoryC3888.m11306("ܿ֡") + i5) * (-91);
                            i6 = ((iM450210 ^ i4) * (-29249)) ^ (-770199539);
                            i7 = -730259151;
                        }
                        break;
                    case -122152289:
                    case 394874728:
                        if (C2124.m6673() > 0) {
                            iM450210 = (ThreadFactoryC3888.m11306("᩺۟") + i4) * 99;
                            i6 = ((iM450210 ^ i5) * 9335) ^ (-343182468);
                            i7 = 539659591;
                        } else {
                            iM450210 = C19806.m45029("֡۬") ^ i4;
                            i6 = ((iM450210 ^ i5) * 4769) ^ (-1024715197);
                            i7 = -265750345;
                        }
                        break;
                    case -65038943:
                    case 964046700:
                        if (C7105.f23796 < 0) {
                            iM450210 = (C19806.m45029("ۧ᩺") + i5) * 25;
                            i6 = ((iM450210 ^ i4) * (-5121)) ^ (-1906117380);
                            i7 = 207172326;
                        } else {
                            iM450210 = ThreadFactoryC3888.m11306("۫᩵") ^ i5;
                            i6 = ((iM450210 ^ i4) * 19587) ^ (-1093234344);
                            i7 = -761584409;
                        }
                        break;
                    case 373506919:
                    case 1044995953:
                        if (C1189.f5284 > 0) {
                            iM450210 = C19806.m45029("ۢ᩵") ^ i4;
                            i6 = ((iM450210 ^ i5) * (-30855)) ^ 366105035;
                            i7 = 1237254791;
                        } else {
                            iM450210 = (i5 - C19806.m45029("ᩳ֫")) * (-89);
                            i6 = ((iM450210 ^ i4) * 23989) ^ 1002510402;
                            i7 = -288627868;
                        }
                        break;
                    case 507875080:
                    case 1423886741:
                        if (C2704.m8255() > 0) {
                            iM450210 = (i5 - ThreadFactoryC3888.m11306("۠ܿ")) * 39;
                            i6 = ((iM450210 ^ i4) * 4329) ^ 1271157329;
                            i7 = -1592577765;
                        } else {
                            iM450210 = C19806.m45029("֡۬") ^ i4;
                            i6 = ((iM450210 ^ i5) * 4769) ^ (-1024715197);
                            i7 = -265750345;
                        }
                        break;
                    case 1193963258:
                    case 1894427187:
                        if (((C22722) C1419.m4967(arrayList, i)).m50364()) {
                            iM45029 = C19806.m45029("᩶ᩳ") ^ i5;
                            i6 = ((iM45029 ^ i4) * 3501) ^ 2063963019;
                            i2 = -434708824;
                        } else {
                            iM45029 = C19806.m45029("۫ۚ") ^ i5;
                            i6 = ((iM45029 ^ i4) * 22249) ^ 1873883313;
                            i2 = 1061334278;
                        }
                        i8 = iM45029 ^ i2;
                        z = true;
                        break;
                    case 1332967079:
                    case 2067231203:
                        this.f19667 -= z ? 1 : 0;
                        if (C1189.f5284 > 0) {
                            iM450210 = (ThreadFactoryC3888.m11306("֫۟") ^ i4) * (-67);
                            i6 = ((iM450210 ^ i5) * (-12227)) ^ 1957315647;
                            i7 = 1073148553;
                        } else {
                            iM450210 = ThreadFactoryC3888.m11306("۫᩵") ^ i5;
                            i6 = ((iM450210 ^ i4) * 19587) ^ (-1093234344);
                            i7 = -761584409;
                        }
                        break;
                    case 1408374785:
                    case 1672191159:
                        this.f19667 += z ? 1 : 0;
                        break;
                    default:
                        if (!RunnableC3388.m10064()) {
                            iM450210 = (i4 - C19806.m45029("᩵ۛ")) * 61;
                            i6 = ((iM450210 ^ i5) * 1727) ^ 1196012861;
                            i7 = 653722598;
                            break;
                        }
                        iM450210 = (i5 - C19806.m45029("ᩳۖ")) * (-51);
                        i6 = ((iM450210 ^ i4) * 8207) ^ (-1587323541);
                        i7 = 1070006437;
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x01fe A[PHI: r6 r13 r17 r18
      0x01fe: PHI (r6v3 int) = (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:58:0x01fc, B:30:0x00de, B:27:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x01fe: PHI (r13v3 int) = (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:58:0x01fc, B:30:0x00de, B:27:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x01fe: PHI (r17v19 int) = (r17v9 int), (r17v18 int), (r17v21 int) binds: [B:58:0x01fc, B:30:0x00de, B:27:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x01fe: PHI (r18v2 java.lang.String) = (r18v1 java.lang.String), (r18v1 java.lang.String), (r18v3 java.lang.String) binds: [B:58:0x01fc, B:30:0x00de, B:27:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x029d A[PHI: r3 r7 r8 r9 r11 r12 r17
      0x029d: PHI (r3v3 short[]) = (r3v2 short[]), (r3v1 short[]), (r3v1 short[]), (r3v1 short[]), (r3v1 short[]) binds: [B:70:0x029b, B:54:0x01d8, B:50:0x01b6, B:34:0x00ff, B:16:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x029d: PHI (r7v3 int) = (r7v1 int), (r7v2 int), (r7v1 int), (r7v1 int), (r7v1 int) binds: [B:70:0x029b, B:54:0x01d8, B:50:0x01b6, B:34:0x00ff, B:16:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x029d: PHI (r8v3 short) = (r8v1 short), (r8v2 short), (r8v1 short), (r8v1 short), (r8v1 short) binds: [B:70:0x029b, B:54:0x01d8, B:50:0x01b6, B:34:0x00ff, B:16:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x029d: PHI (r9v3 int) = (r9v1 int), (r9v1 int), (r9v2 int), (r9v1 int), (r9v1 int) binds: [B:70:0x029b, B:54:0x01d8, B:50:0x01b6, B:34:0x00ff, B:16:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x029d: PHI (r11v3 short[]) = (r11v1 short[]), (r11v1 short[]), (r11v1 short[]), (r11v2 short[]), (r11v1 short[]) binds: [B:70:0x029b, B:54:0x01d8, B:50:0x01b6, B:34:0x00ff, B:16:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x029d: PHI (r12v3 int) = (r12v1 int), (r12v1 int), (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:70:0x029b, B:54:0x01d8, B:50:0x01b6, B:34:0x00ff, B:16:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x029d: PHI (r17v22 int) = (r17v6 int), (r17v10 int), (r17v11 int), (r17v17 int), (r17v23 int) binds: [B:70:0x029b, B:54:0x01d8, B:50:0x01b6, B:34:0x00ff, B:16:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15927(AbstractActivityC5788 abstractActivityC5788) {
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
        int i7 = 0;
        short[] sArr2 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = -141255660;
        int i11 = C0050.f912;
        int i12 = C3535.f13026;
        int iM11306 = (ThreadFactoryC3888.m11306("ᩳ᩶") ^ i12) * (-31);
        int i13 = ((iM11306 ^ i11) * 6405) ^ 1051249972;
        int i14 = iM11306 ^ (-137929376);
        String strM4969 = null;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i11) * (-5143)) >> 31));
            switch (i10) {
                case -2123386358:
                case -2059870826:
                    i7 = 62237;
                    iM45029 = ThreadFactoryC3888.m11306("ۙ֫") ^ i12;
                    i = ((iM45029 ^ i11) * (-15311)) ^ (-479859105);
                    i2 = 1386914020;
                    int i15 = iM450210;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM450210 = i15;
                    break;
                case -1940167894:
                case -1673318968:
                    iM450210 = iM450210;
                    if ((i6 + 1) - i5 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽۚ") ^ i12) * (-89);
                        i = ((iM45029 ^ i11) * Scalar25519.L4) ^ (-1467940593);
                        i2 = 803933368;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙ᩶") + i11) * (-11);
                        i = ((iM45029 ^ i12) * 2297) ^ 662127479;
                        i2 = -700276434;
                    }
                    int i16 = iM450210;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM450210 = i16;
                    break;
                case -1806927028:
                case 104481290:
                    C3286.m9798();
                    C1398.m4895();
                    iM450210 = iM450210;
                    iM45029 = (C19806.m45029("ܿܶ") ^ i11) * (-15);
                    i = ((iM45029 ^ i12) * 30299) ^ 241925720;
                    i2 = -156602229;
                    int i17 = iM450210;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM450210 = i17;
                    break;
                case -1800241252:
                case -331473869:
                    iM450210 = iM450210;
                    sArr = f19653;
                    if (C1460.m5050() != 0) {
                        iM45029 = (C19806.m45029("ܶۖ") ^ i12) * 69;
                        i = ((iM45029 ^ i11) * 29177) ^ (-1002404258);
                        i2 = -778000847;
                    } else {
                        iM45029 = C19806.m45029("۟ۗ") ^ i12;
                        i = ((iM45029 ^ i11) * 4649) ^ (-725505670);
                        i2 = -459845371;
                    }
                    int i18 = iM450210;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM450210 = i18;
                    break;
                case -1752583775:
                case 1208730796:
                    iM450210 = iM450210;
                    sArr2 = f19653;
                    i8 = 50;
                    if (C1148.f5161 <= 0) {
                        iM45029 = (C19806.m45029("ܶۖ") ^ i12) * 69;
                        i = ((iM45029 ^ i11) * 29177) ^ (-1002404258);
                        i2 = -778000847;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖ᩸") ^ i11) * 33;
                        i = ((iM45029 ^ i12) * (-24341)) ^ (-466668622);
                        i2 = -1468794814;
                    }
                    int i19 = iM450210;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM450210 = i19;
                    break;
                case -1573633809:
                case -1257719921:
                    iM450210 = iM450210;
                    s = sArr[c];
                    if (C0817.m3399()) {
                        iM45029 = (i11 - ThreadFactoryC3888.m11306("ۗۚ")) * (-49);
                        i = ((iM45029 ^ i12) * 7723) ^ (-353677543);
                        i2 = 1471364433;
                    } else {
                        iM45029 = C19806.m45029("ۗۘ") ^ i11;
                        i = ((iM45029 ^ i12) * 27637) ^ (-104431541);
                        i2 = 1706555103;
                    }
                    int i110 = iM450210;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM450210 = i110;
                    break;
                case -1377188836:
                case 255554143:
                    strM4969 = C1419.m4969(sArr2, i8, i9, i7);
                    if (C0797.f3386) {
                        iM450210 = iM450210;
                        iM45029 = (ThreadFactoryC3888.m11306("۬ۡ") ^ i11) * (-51);
                        i = ((iM45029 ^ i12) * (-21401)) ^ (-164439743);
                        i2 = 183943660;
                    } else {
                        iM45029 = (C19806.m45029("ۙܽ") ^ i12) * (-43);
                        iM450210 = iM450210;
                        i = ((iM45029 ^ i11) * (-10333)) ^ (-1237306707);
                        i2 = -421167760;
                    }
                    int i111 = iM450210;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM450210 = i111;
                    break;
                case -1249995803:
                case -931890734:
                    iM450210 = iM450210;
                    i6 = s * s2;
                    if (C1025.m3861() <= 0) {
                        iM45029 = (C19806.m45029("ܶۖ") ^ i12) * 69;
                        i = ((iM45029 ^ i11) * 29177) ^ (-1002404258);
                        i2 = -778000847;
                    } else {
                        iM45029 = C19806.m45029("֨֫") ^ i11;
                        i = ((iM45029 ^ i12) * 12135) ^ 527690107;
                        i2 = -1066315830;
                    }
                    int i112 = iM450210;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM450210 = i112;
                    break;
                case -1165894152:
                case 222971145:
                    iM450210 = iM450210;
                    if (abstractActivityC5788.m15943(true)) {
                        iM45029 = C19806.m45029("᩻ۤ") ^ i12;
                        i = ((iM45029 ^ i11) * 30643) ^ 1359361794;
                        i2 = -932530569;
                    } else {
                        iM45029 = C19806.m45029("ۤ᩺") ^ i11;
                        i = ((iM45029 ^ i12) * 27043) ^ (-1954146268);
                        i2 = -1385841954;
                    }
                    int i113 = iM450210;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM450210 = i113;
                    break;
                case -1149782334:
                case 133866620:
                    iM450210 = iM450210;
                    c = '1';
                    if (C2704.f10408) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ۬") ^ i11;
                        i = ((iM45029 ^ i12) * (-4993)) ^ 128710715;
                        i2 = -300031019;
                    } else {
                        iM45029 = (C19806.m45029("ܿܶ") ^ i11) * (-15);
                        i = ((iM45029 ^ i12) * 30299) ^ 241925720;
                        i2 = -156602229;
                    }
                    int i114 = iM450210;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM450210 = i114;
                    break;
                case -894719682:
                case 1818460174:
                    i7 = 34822;
                    iM45029 = ThreadFactoryC3888.m11306("ۙ֫") ^ i12;
                    i = ((iM45029 ^ i11) * (-15311)) ^ (-479859105);
                    i2 = 1386914020;
                    int i115 = iM450210;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM450210 = i115;
                    break;
                case -878213865:
                case 2124770166:
                    iM450210 = iM450210;
                    i5 = i4 * i4;
                    s2 = 2;
                    if (C2642.m8171() != 0) {
                        iM45029 = (C19806.m45029("ܶۖ") ^ i12) * 69;
                        i = ((iM45029 ^ i11) * 29177) ^ (-1002404258);
                        i2 = -778000847;
                    } else {
                        iM45029 = (C19806.m45029("᩹ܳ") ^ i12) * (-25);
                        i = ((iM45029 ^ i11) * (-1201)) ^ (-1167396905);
                        i2 = 1788888081;
                    }
                    int i116 = iM450210;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM450210 = i116;
                    break;
                case -647849998:
                case 2136874196:
                    C0629.m2907();
                    if (C3286.f12186) {
                        iM450210 = iM450210;
                        iM45029 = (C19806.m45029("ܿܶ") ^ i11) * (-15);
                        i = ((iM45029 ^ i12) * 30299) ^ 241925720;
                        i2 = -156602229;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷۠") ^ i12;
                        iM450210 = iM450210;
                        i = ((iM45029 ^ i11) * (-19971)) ^ (-1393554181);
                        i2 = -1466744463;
                    }
                    int i117 = iM450210;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM450210 = i117;
                    break;
                case -549309522:
                case 2133387903:
                    C0050.m946();
                    break;
                case -514862293:
                case -36149519:
                    break;
                case -313092739:
                case 1001475153:
                    iM450210 = iM450210;
                    i4 = s + 1;
                    if (C1875.m6086() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬ۡ") ^ i11) * (-51);
                        i = ((iM45029 ^ i12) * (-21401)) ^ (-164439743);
                        i2 = 183943660;
                    } else {
                        iM45029 = C19806.m45029("ۘܺ") ^ i12;
                        i = ((iM45029 ^ i11) * (-24465)) ^ 273893603;
                        i2 = -1807261078;
                    }
                    int i118 = iM450210;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM450210 = i118;
                    break;
                case -143636953:
                case 231192381:
                    C2871.m8646();
                    if (C2477.m7593() < 0) {
                        iM450210 = iM450210;
                        iM45029 = C19806.m45029("ۗۘ") ^ i11;
                        i = ((iM45029 ^ i12) * 27637) ^ (-104431541);
                        i2 = 1706555103;
                        int i119 = iM450210;
                        i14 = iM45029 ^ i2;
                        i13 = i;
                        iM450210 = i119;
                    }
                    iM450210 = iM450210;
                    iM45029 = (C19806.m45029("ܿܶ") ^ i11) * (-15);
                    i = ((iM45029 ^ i12) * 30299) ^ 241925720;
                    i2 = -156602229;
                    int i1110 = iM450210;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM450210 = i1110;
                    break;
                case -109421765:
                case 2030739427:
                    iM450210 = iM450210;
                    i9 = 3;
                    if (C3722.f13525 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۬ۡ") ^ i11) * (-51);
                        i = ((iM45029 ^ i12) * (-21401)) ^ (-164439743);
                        i2 = 183943660;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֨ۙ") ^ i11;
                        i = ((iM45029 ^ i12) * 1041) ^ (-630705442);
                        i2 = -507253810;
                    }
                    int i1111 = iM450210;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM450210 = i1111;
                    break;
                case 64775559:
                case 841133206:
                    iM450210 = C19806.m45029(strM4969);
                    if (C10634.f36300 >= 0) {
                        i3 = 2102633763;
                        iM45029 = ThreadFactoryC3888.m11306("᩷۠") ^ i12;
                        iM450210 = iM450210;
                        i = ((iM45029 ^ i11) * (-19971)) ^ (-1393554181);
                        i2 = -1466744463;
                        int i1112 = iM450210;
                        i14 = iM45029 ^ i2;
                        i13 = i;
                        iM450210 = i1112;
                    } else {
                        int iM450211 = C19806.m45029("ܺ۠") ^ i12;
                        i14 = iM450211 ^ 1845160006;
                        i13 = ((iM450211 ^ i11) * (-10193)) ^ 477989136;
                        i3 = 2102633763;
                    }
                    break;
                case 698201565:
                case 1136128087:
                    C2477.m7593();
                    if (C1461.f5957 > 0) {
                        iM450210 = iM450210;
                        iM45029 = (C19806.m45029("ܶۖ") ^ i12) * 69;
                        i = ((iM45029 ^ i11) * 29177) ^ (-1002404258);
                        i2 = -778000847;
                        int i1113 = iM450210;
                        i14 = iM45029 ^ i2;
                        i13 = i;
                        iM450210 = i1113;
                    }
                    iM450210 = iM450210;
                    iM45029 = (C19806.m45029("ܿܶ") ^ i11) * (-15);
                    i = ((iM45029 ^ i12) * 30299) ^ 241925720;
                    i2 = -156602229;
                    int i1114 = iM450210;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM450210 = i1114;
                    break;
                default:
                    C1668.m5582(iM450210 ^ i3);
                    iM450210 = iM450210;
                    iM45029 = C19806.m45029("ۤ᩺") ^ i11;
                    i = ((iM45029 ^ i12) * 27043) ^ (-1954146268);
                    i2 = -1385841954;
                    int i1115 = iM450210;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    iM450210 = i1115;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ int m15940(AbstractActivityC5788 abstractActivityC5788, int i) {
        return abstractActivityC5788.f19665[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ int m15926(AbstractActivityC5788 abstractActivityC5788, int i) {
        return abstractActivityC5788.f19665[i];
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00eb A[PHI: r5
      0x00eb: PHI (r5v4 java.util.function.IntFunction) = (r5v3 java.util.function.IntFunction), (r5v2 java.util.function.IntFunction) binds: [B:38:0x00e9, B:12:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x016c A[PHI: r3 r4
      0x016c: PHI (r3v4 l.ܰ֫ᩴ) = (r3v2 l.ܰ֫ᩴ), (r3v3 l.ܰ֫ᩴ), (r3v2 l.ܰ֫ᩴ), (r3v2 l.ܰ֫ᩴ), (r3v2 l.ܰ֫ᩴ) binds: [B:53:0x016a, B:42:0x011d, B:15:0x0048, B:12:0x003f, B:9:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x016c: PHI (r4v4 java.util.ArrayList) = 
      (r4v2 java.util.ArrayList)
      (r4v3 java.util.ArrayList)
      (r4v2 java.util.ArrayList)
      (r4v2 java.util.ArrayList)
      (r4v2 java.util.ArrayList)
     binds: [B:53:0x016a, B:42:0x011d, B:15:0x0048, B:12:0x003f, B:9:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final List m15953() {
        int iM45029;
        int i;
        int iM450210;
        int i2;
        int i3 = 0;
        InterfaceC13514 interfaceC13514Range = null;
        InterfaceC13514 map = null;
        final ArrayList arrayList = null;
        IntFunction intFunction = null;
        InterfaceC13514 map2 = null;
        int i4 = 30978778;
        int i5 = C0278.f1572;
        int i6 = C3535.f13026;
        int iM450211 = (C19806.m45029("۟ᩴ") + i6) * (-7);
        int i7 = ((iM450211 ^ i5) * 13561) ^ (-1624320184);
        int i8 = 927196749;
        while (true) {
            int i9 = iM450211 ^ i8;
            IntUnaryOperator intUnaryOperator = null;
            while (true) {
                i4 = ((((i4 ^ i5) * (-3701)) >> 31) & i7) ^ i9;
                switch (i4) {
                    case -2117702839:
                    case 1630254607:
                        InterfaceC13514 interfaceC13514Range2 = C9653.range(i3, this.f19660);
                        if (AbstractC0464.f2088 <= 0) {
                            iM45029 = C19806.m45029("֨۠") ^ i6;
                            i7 = ((iM45029 ^ i5) * (-15167)) ^ 426645487;
                            i = -900573157;
                        } else {
                            map2 = interfaceC13514Range2.map(new IntUnaryOperator() { // from class: l.ܶۗۨ
                                public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator2) {
                                    return C15568.$default$andThen(this, intUnaryOperator2);
                                }

                                @Override // java.util.function.IntUnaryOperator
                                public final int applyAsInt(int i10) {
                                    return AbstractActivityC5788.m15940(this.f48857, i10);
                                }

                                public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator2) {
                                    return C15568.$default$compose(this, intUnaryOperator2);
                                }
                            });
                            if (C7105.f23796 >= 0) {
                                iM45029 = (C19806.m45029("ܽܿ") ^ i5) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                i7 = ((iM45029 ^ i6) * 6543) ^ 1077471411;
                                i = 2049599236;
                            } else {
                                iM45029 = (ThreadFactoryC3888.m11306("ᩳܺ") + i6) * 75;
                                i7 = ((iM45029 ^ i5) * (-17335)) ^ 1760848218;
                                i = -1225313581;
                            }
                        }
                        i9 = iM45029 ^ i;
                        break;
                    case -1970402167:
                    case 426115333:
                        C2249.m6915();
                        break;
                    case -1833637221:
                    case -1831842097:
                        map = interfaceC13514Range.map(intUnaryOperator);
                        arrayList = this.f19666;
                        if (CallableC1627.f6528) {
                            iM45029 = (i6 - ThreadFactoryC3888.m11306("ᩴܰ")) * 9;
                            i7 = ((iM45029 ^ i5) * 4949) ^ (-1771272731);
                            i = 2111369412;
                        } else {
                            iM45029 = (C19806.m45029("ۗܿ") + i6) * (-21);
                            i7 = ((iM45029 ^ i5) * (-2721)) ^ 1202445402;
                            i = -1475930108;
                        }
                        i9 = iM45029 ^ i;
                        break;
                    case -1783442884:
                    case 1020247187:
                        RunnableC1895.m6170();
                        if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                            iM45029 = (C19806.m45029("ۗܿ") + i6) * (-21);
                            i7 = ((iM45029 ^ i5) * (-2721)) ^ 1202445402;
                            i = -1475930108;
                        } else {
                            iM45029 = C19806.m45029("ܳ֨") ^ i5;
                            i7 = ((iM45029 ^ i6) * (-11195)) ^ (-1828696764);
                            i = -88769349;
                        }
                        i9 = iM45029 ^ i;
                        break;
                    case -1588280495:
                    case 1335149894:
                        final ArrayList arrayList2 = this.f19666;
                        C1419.m4970(arrayList2);
                        if (C1461.f5957 > 0) {
                            InterfaceC5046 interfaceC5046MapToObj = map2.mapToObj(new IntFunction() { // from class: l.᩸ۗۨ
                                @Override // java.util.function.IntFunction
                                public final Object apply(int i10) {
                                    ArrayList arrayList3 = null;
                                    int i11 = -399746851;
                                    int i12 = C2642.f10294;
                                    int i13 = C1460.f5948;
                                    int iM11306 = (ThreadFactoryC3888.m11306("ۛۘ") ^ i13) * (-31);
                                    int i14 = ((iM11306 ^ i12) * (-25503)) ^ (-386244313);
                                    int i15 = 1412714656;
                                    while (true) {
                                        i11 = ((((i11 ^ i12) * (-22581)) >> 31) & i14) ^ (iM11306 ^ i15);
                                        switch (i11) {
                                            case -1967521854:
                                            case 1196540953:
                                                C1668.m5583();
                                                if (C0526.m2437() >= 0) {
                                                    iM11306 = ThreadFactoryC3888.m11306("᩺֡") ^ i13;
                                                    i14 = ((iM11306 ^ i12) * (-121)) ^ 1262733190;
                                                    i15 = 1245018390;
                                                } else {
                                                    iM11306 = (C19806.m45029("᩺ۘ") ^ i12) * 109;
                                                    i14 = ((iM11306 ^ i13) * (-25853)) ^ 203522002;
                                                    i15 = -875565629;
                                                }
                                                break;
                                            case -1961714912:
                                            case 698696337:
                                                return (C22722) C3286.m9796(arrayList3, i10);
                                            case -1943397670:
                                            case -1446784325:
                                                if (RunnableC1564.m5345()) {
                                                    iM11306 = ThreadFactoryC3888.m11306("ᩴᩳ") ^ i13;
                                                    i14 = ((iM11306 ^ i12) * (-23831)) ^ (-275733714);
                                                    i15 = 1153473727;
                                                } else {
                                                    iM11306 = C19806.m45029("ۤۛ") ^ i12;
                                                    i14 = ((iM11306 ^ i13) * (-13781)) ^ (-2140517677);
                                                    i15 = -1023008193;
                                                }
                                                break;
                                            case -1685954624:
                                            case 963282644:
                                                if (RunnableC3388.f12514 >= 0) {
                                                    iM11306 = (i13 - ThreadFactoryC3888.m11306("֡ܿ")) * 89;
                                                    i14 = ((iM11306 ^ i12) * (-25567)) ^ (-2052033383);
                                                    i15 = 214206753;
                                                } else {
                                                    iM11306 = C19806.m45029("۫ܶ") ^ i12;
                                                    i14 = ((iM11306 ^ i13) * (-4373)) ^ 2036831072;
                                                    i15 = -731971546;
                                                }
                                                break;
                                            case -1596631178:
                                            case -1060288397:
                                                C1066.m4023();
                                                iM11306 = (ThreadFactoryC3888.m11306("ᩳ᩸") + i12) * (-13);
                                                i14 = ((iM11306 ^ i13) * 3581) ^ (-1215409366);
                                                i15 = -119210936;
                                                break;
                                            case -1373583673:
                                            case -51940692:
                                                C1377.m4833();
                                                if (C0216.m1591() > 0) {
                                                    iM11306 = (C19806.m45029("᩺ۘ") ^ i12) * 109;
                                                    i14 = ((iM11306 ^ i13) * (-25853)) ^ 203522002;
                                                    i15 = -875565629;
                                                } else {
                                                    iM11306 = (ThreadFactoryC3888.m11306("ᩳ᩸") + i12) * (-13);
                                                    i14 = ((iM11306 ^ i13) * 3581) ^ (-1215409366);
                                                    i15 = -119210936;
                                                }
                                                break;
                                            case -1206116585:
                                            case 1795939555:
                                                RunnableC3388.m10064();
                                                if (AbstractC0464.f2088 <= 0) {
                                                    iM11306 = ThreadFactoryC3888.m11306("ᩴᩳ") ^ i13;
                                                    i14 = ((iM11306 ^ i12) * (-23831)) ^ (-275733714);
                                                    i15 = 1153473727;
                                                } else {
                                                    iM11306 = (ThreadFactoryC3888.m11306("ᩳ᩸") + i12) * (-13);
                                                    i14 = ((iM11306 ^ i13) * 3581) ^ (-1215409366);
                                                    i15 = -119210936;
                                                }
                                                break;
                                            case -931531118:
                                            case 227458747:
                                                arrayList3 = arrayList2;
                                                if (C19806.f63586) {
                                                    iM11306 = (i13 - ThreadFactoryC3888.m11306("֡ܿ")) * 89;
                                                    i14 = ((iM11306 ^ i12) * (-25567)) ^ (-2052033383);
                                                    i15 = 214206753;
                                                } else {
                                                    iM11306 = (C19806.m45029("ᩳ᩹") ^ i13) * 25;
                                                    i14 = ((iM11306 ^ i12) * (-24677)) ^ (-1622868833);
                                                    i15 = 1871029697;
                                                }
                                                break;
                                            case -918522496:
                                            case 2012053324:
                                                if (C3743.f13569) {
                                                    iM11306 = ThreadFactoryC3888.m11306("ۡ᩹") ^ i13;
                                                    i14 = ((iM11306 ^ i12) * 31561) ^ 552223680;
                                                    i15 = -579015462;
                                                } else {
                                                    iM11306 = (C19806.m45029("᩺ۘ") ^ i12) * 109;
                                                    i14 = ((iM11306 ^ i13) * (-25853)) ^ 203522002;
                                                    i15 = -875565629;
                                                }
                                                break;
                                            case -876304457:
                                            case 1283763994:
                                                if (C0797.f3386) {
                                                    iM11306 = ThreadFactoryC3888.m11306("ᩴᩳ") ^ i13;
                                                    i14 = ((iM11306 ^ i12) * (-23831)) ^ (-275733714);
                                                    i15 = 1153473727;
                                                } else {
                                                    iM11306 = ThreadFactoryC3888.m11306("ۤۚ") ^ i12;
                                                    i14 = ((iM11306 ^ i13) * (-25627)) ^ 271387675;
                                                    i15 = 1436272895;
                                                }
                                                break;
                                            case -625243619:
                                            case 897503531:
                                                if (C3660.f13403 >= 0) {
                                                    iM11306 = ThreadFactoryC3888.m11306("ᩴᩳ") ^ i13;
                                                    i14 = ((iM11306 ^ i12) * (-23831)) ^ (-275733714);
                                                    i15 = 1153473727;
                                                } else {
                                                    iM11306 = C19806.m45029("᩺۫") ^ i12;
                                                    i14 = ((iM11306 ^ i13) * 32443) ^ 66259466;
                                                    i15 = 685052619;
                                                }
                                                break;
                                            case -593656718:
                                            case 669636488:
                                                if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                                                    iM11306 = (C19806.m45029("᩺ۘ") ^ i12) * 109;
                                                    i14 = ((iM11306 ^ i13) * (-25853)) ^ 203522002;
                                                    i15 = -875565629;
                                                } else {
                                                    iM11306 = (C19806.m45029("ۜܽ") ^ i12) * (-87);
                                                    i14 = ((iM11306 ^ i13) * (-15145)) ^ (-1987934150);
                                                    i15 = 1335181352;
                                                }
                                                break;
                                            case 203615754:
                                            case 1241542323:
                                                if (C2788.f10625 >= 0) {
                                                    iM11306 = ThreadFactoryC3888.m11306("ᩴᩳ") ^ i13;
                                                    i14 = ((iM11306 ^ i12) * (-23831)) ^ (-275733714);
                                                    i15 = 1153473727;
                                                } else {
                                                    iM11306 = ThreadFactoryC3888.m11306("᩹֨") ^ i13;
                                                    i14 = ((iM11306 ^ i12) * 7429) ^ 2022595350;
                                                    i15 = -1785297969;
                                                }
                                                break;
                                            case 524129519:
                                            case 1904426038:
                                                if (RunnableC1606.f6488 >= 0) {
                                                    iM11306 = (C19806.m45029("᩺ۘ") ^ i12) * 109;
                                                    i14 = ((iM11306 ^ i13) * (-25853)) ^ 203522002;
                                                    i15 = -875565629;
                                                } else {
                                                    iM11306 = (ThreadFactoryC3888.m11306("᩸ۚ") + i13) * (-35);
                                                    i14 = ((iM11306 ^ i12) * 31407) ^ (-465587777);
                                                    i15 = 2042186499;
                                                }
                                                break;
                                            case 828442565:
                                            case 927814464:
                                                if (C2704.m8255() <= 0) {
                                                    iM11306 = ThreadFactoryC3888.m11306("᩺֡") ^ i13;
                                                    i14 = ((iM11306 ^ i12) * (-121)) ^ 1262733190;
                                                    i15 = 1245018390;
                                                } else {
                                                    iM11306 = ThreadFactoryC3888.m11306("᩸ܳ") ^ i13;
                                                    i14 = ((iM11306 ^ i12) * 5097) ^ 858628547;
                                                    i15 = -1812414143;
                                                }
                                                break;
                                            default:
                                                ThreadFactoryC3888.m11300();
                                                C2642.m8171();
                                                return null;
                                        }
                                    }
                                }
                            });
                            int i10 = 1;
                            if (C2871.m8646()) {
                                return interfaceC5046MapToObj.filter(new C15024(i10)).toList();
                            }
                        }
                        iM45029 = (C19806.m45029("ܽܿ") ^ i5) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i7 = ((iM45029 ^ i6) * 6543) ^ 1077471411;
                        i = 2049599236;
                        i9 = iM45029 ^ i;
                        break;
                    case -1376866324:
                    case -406676727:
                        C0962.m3746();
                        if (C0050.f912 > 0) {
                        }
                        iM45029 = (C19806.m45029("ۗܿ") + i6) * (-21);
                        i7 = ((iM45029 ^ i5) * (-2721)) ^ 1202445402;
                        i = -1475930108;
                        i9 = iM45029 ^ i;
                        break;
                    case -1168642499:
                    case 1582640738:
                        if (this.f19668) {
                            iM450210 = (C19806.m45029("ۛۚ") + i5) * 13;
                            i7 = ((iM450210 ^ i6) * 23273) ^ 1118537791;
                            i2 = -19907769;
                        } else {
                            iM450210 = C19806.m45029("ܳۘ") ^ i5;
                            i7 = ((iM450210 ^ i6) * 15917) ^ 185579273;
                            i2 = 1923695748;
                        }
                        i9 = iM450210 ^ i2;
                        i3 = 0;
                        break;
                    case -950014861:
                    case 1475477139:
                        if (this.f19668) {
                            iM45029 = C19806.m45029("ۙ۫") ^ i5;
                            i7 = ((iM45029 ^ i6) * 31341) ^ (-1679278185);
                            i = 229703254;
                        } else {
                            iM45029 = C19806.m45029("ۖܽ") ^ i6;
                            i7 = ((iM45029 ^ i5) * 25073) ^ (-917437054);
                            i = -2066974725;
                        }
                        i9 = iM45029 ^ i;
                        break;
                    case -623232299:
                    case -40877232:
                        return map.mapToObj(intFunction).toList();
                    case 84044054:
                    case 589166399:
                        C3286.m9779(arrayList);
                        intFunction = new IntFunction() { // from class: l.᩸ۗۨ
                            @Override // java.util.function.IntFunction
                            public final Object apply(int i11) {
                                ArrayList arrayList3 = null;
                                int i12 = -399746851;
                                int i13 = C2642.f10294;
                                int i14 = C1460.f5948;
                                int iM11306 = (ThreadFactoryC3888.m11306("ۛۘ") ^ i14) * (-31);
                                int i15 = ((iM11306 ^ i13) * (-25503)) ^ (-386244313);
                                int i16 = 1412714656;
                                while (true) {
                                    i12 = ((((i12 ^ i13) * (-22581)) >> 31) & i15) ^ (iM11306 ^ i16);
                                    switch (i12) {
                                        case -1967521854:
                                        case 1196540953:
                                            C1668.m5583();
                                            if (C0526.m2437() >= 0) {
                                                iM11306 = ThreadFactoryC3888.m11306("᩺֡") ^ i14;
                                                i15 = ((iM11306 ^ i13) * (-121)) ^ 1262733190;
                                                i16 = 1245018390;
                                            } else {
                                                iM11306 = (C19806.m45029("᩺ۘ") ^ i13) * 109;
                                                i15 = ((iM11306 ^ i14) * (-25853)) ^ 203522002;
                                                i16 = -875565629;
                                            }
                                            break;
                                        case -1961714912:
                                        case 698696337:
                                            return (C22722) C3286.m9796(arrayList3, i11);
                                        case -1943397670:
                                        case -1446784325:
                                            if (RunnableC1564.m5345()) {
                                                iM11306 = ThreadFactoryC3888.m11306("ᩴᩳ") ^ i14;
                                                i15 = ((iM11306 ^ i13) * (-23831)) ^ (-275733714);
                                                i16 = 1153473727;
                                            } else {
                                                iM11306 = C19806.m45029("ۤۛ") ^ i13;
                                                i15 = ((iM11306 ^ i14) * (-13781)) ^ (-2140517677);
                                                i16 = -1023008193;
                                            }
                                            break;
                                        case -1685954624:
                                        case 963282644:
                                            if (RunnableC3388.f12514 >= 0) {
                                                iM11306 = (i14 - ThreadFactoryC3888.m11306("֡ܿ")) * 89;
                                                i15 = ((iM11306 ^ i13) * (-25567)) ^ (-2052033383);
                                                i16 = 214206753;
                                            } else {
                                                iM11306 = C19806.m45029("۫ܶ") ^ i13;
                                                i15 = ((iM11306 ^ i14) * (-4373)) ^ 2036831072;
                                                i16 = -731971546;
                                            }
                                            break;
                                        case -1596631178:
                                        case -1060288397:
                                            C1066.m4023();
                                            iM11306 = (ThreadFactoryC3888.m11306("ᩳ᩸") + i13) * (-13);
                                            i15 = ((iM11306 ^ i14) * 3581) ^ (-1215409366);
                                            i16 = -119210936;
                                            break;
                                        case -1373583673:
                                        case -51940692:
                                            C1377.m4833();
                                            if (C0216.m1591() > 0) {
                                                iM11306 = (C19806.m45029("᩺ۘ") ^ i13) * 109;
                                                i15 = ((iM11306 ^ i14) * (-25853)) ^ 203522002;
                                                i16 = -875565629;
                                            } else {
                                                iM11306 = (ThreadFactoryC3888.m11306("ᩳ᩸") + i13) * (-13);
                                                i15 = ((iM11306 ^ i14) * 3581) ^ (-1215409366);
                                                i16 = -119210936;
                                            }
                                            break;
                                        case -1206116585:
                                        case 1795939555:
                                            RunnableC3388.m10064();
                                            if (AbstractC0464.f2088 <= 0) {
                                                iM11306 = ThreadFactoryC3888.m11306("ᩴᩳ") ^ i14;
                                                i15 = ((iM11306 ^ i13) * (-23831)) ^ (-275733714);
                                                i16 = 1153473727;
                                            } else {
                                                iM11306 = (ThreadFactoryC3888.m11306("ᩳ᩸") + i13) * (-13);
                                                i15 = ((iM11306 ^ i14) * 3581) ^ (-1215409366);
                                                i16 = -119210936;
                                            }
                                            break;
                                        case -931531118:
                                        case 227458747:
                                            arrayList3 = arrayList;
                                            if (C19806.f63586) {
                                                iM11306 = (i14 - ThreadFactoryC3888.m11306("֡ܿ")) * 89;
                                                i15 = ((iM11306 ^ i13) * (-25567)) ^ (-2052033383);
                                                i16 = 214206753;
                                            } else {
                                                iM11306 = (C19806.m45029("ᩳ᩹") ^ i14) * 25;
                                                i15 = ((iM11306 ^ i13) * (-24677)) ^ (-1622868833);
                                                i16 = 1871029697;
                                            }
                                            break;
                                        case -918522496:
                                        case 2012053324:
                                            if (C3743.f13569) {
                                                iM11306 = ThreadFactoryC3888.m11306("ۡ᩹") ^ i14;
                                                i15 = ((iM11306 ^ i13) * 31561) ^ 552223680;
                                                i16 = -579015462;
                                            } else {
                                                iM11306 = (C19806.m45029("᩺ۘ") ^ i13) * 109;
                                                i15 = ((iM11306 ^ i14) * (-25853)) ^ 203522002;
                                                i16 = -875565629;
                                            }
                                            break;
                                        case -876304457:
                                        case 1283763994:
                                            if (C0797.f3386) {
                                                iM11306 = ThreadFactoryC3888.m11306("ᩴᩳ") ^ i14;
                                                i15 = ((iM11306 ^ i13) * (-23831)) ^ (-275733714);
                                                i16 = 1153473727;
                                            } else {
                                                iM11306 = ThreadFactoryC3888.m11306("ۤۚ") ^ i13;
                                                i15 = ((iM11306 ^ i14) * (-25627)) ^ 271387675;
                                                i16 = 1436272895;
                                            }
                                            break;
                                        case -625243619:
                                        case 897503531:
                                            if (C3660.f13403 >= 0) {
                                                iM11306 = ThreadFactoryC3888.m11306("ᩴᩳ") ^ i14;
                                                i15 = ((iM11306 ^ i13) * (-23831)) ^ (-275733714);
                                                i16 = 1153473727;
                                            } else {
                                                iM11306 = C19806.m45029("᩺۫") ^ i13;
                                                i15 = ((iM11306 ^ i14) * 32443) ^ 66259466;
                                                i16 = 685052619;
                                            }
                                            break;
                                        case -593656718:
                                        case 669636488:
                                            if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                                                iM11306 = (C19806.m45029("᩺ۘ") ^ i13) * 109;
                                                i15 = ((iM11306 ^ i14) * (-25853)) ^ 203522002;
                                                i16 = -875565629;
                                            } else {
                                                iM11306 = (C19806.m45029("ۜܽ") ^ i13) * (-87);
                                                i15 = ((iM11306 ^ i14) * (-15145)) ^ (-1987934150);
                                                i16 = 1335181352;
                                            }
                                            break;
                                        case 203615754:
                                        case 1241542323:
                                            if (C2788.f10625 >= 0) {
                                                iM11306 = ThreadFactoryC3888.m11306("ᩴᩳ") ^ i14;
                                                i15 = ((iM11306 ^ i13) * (-23831)) ^ (-275733714);
                                                i16 = 1153473727;
                                            } else {
                                                iM11306 = ThreadFactoryC3888.m11306("᩹֨") ^ i14;
                                                i15 = ((iM11306 ^ i13) * 7429) ^ 2022595350;
                                                i16 = -1785297969;
                                            }
                                            break;
                                        case 524129519:
                                        case 1904426038:
                                            if (RunnableC1606.f6488 >= 0) {
                                                iM11306 = (C19806.m45029("᩺ۘ") ^ i13) * 109;
                                                i15 = ((iM11306 ^ i14) * (-25853)) ^ 203522002;
                                                i16 = -875565629;
                                            } else {
                                                iM11306 = (ThreadFactoryC3888.m11306("᩸ۚ") + i14) * (-35);
                                                i15 = ((iM11306 ^ i13) * 31407) ^ (-465587777);
                                                i16 = 2042186499;
                                            }
                                            break;
                                        case 828442565:
                                        case 927814464:
                                            if (C2704.m8255() <= 0) {
                                                iM11306 = ThreadFactoryC3888.m11306("᩺֡") ^ i14;
                                                i15 = ((iM11306 ^ i13) * (-121)) ^ 1262733190;
                                                i16 = 1245018390;
                                            } else {
                                                iM11306 = ThreadFactoryC3888.m11306("᩸ܳ") ^ i14;
                                                i15 = ((iM11306 ^ i13) * 5097) ^ 858628547;
                                                i16 = -1812414143;
                                            }
                                            break;
                                        default:
                                            ThreadFactoryC3888.m11300();
                                            C2642.m8171();
                                            return null;
                                    }
                                }
                            }
                        };
                        if (C2332.f8260) {
                            iM45029 = (ThreadFactoryC3888.m11306("᩺۠") ^ i5) * 9;
                            i7 = ((iM45029 ^ i6) * 22835) ^ (-453488857);
                            i = -741358564;
                        } else {
                            iM45029 = C19806.m45029("ܳ֨") ^ i5;
                            i7 = ((iM45029 ^ i6) * (-11195)) ^ (-1828696764);
                            i = -88769349;
                        }
                        i9 = iM45029 ^ i;
                        break;
                    case 281486851:
                    case 911765014:
                        InterfaceC5046 interfaceC5046M2917 = C0629.m2917(this.f19666);
                        if (C0216.f1393 == 0) {
                            int i11 = 1;
                            if (C2332.m7079() <= 0) {
                                break;
                            }
                            return interfaceC5046M2917.filter(new C15024(i11)).toList();
                        }
                        iM45029 = (C19806.m45029("ۗܿ") + i6) * (-21);
                        i7 = ((iM45029 ^ i5) * (-2721)) ^ 1202445402;
                        i = -1475930108;
                        i9 = iM45029 ^ i;
                        break;
                    case 328413194:
                    case 1469327545:
                        if (this.f19673) {
                            iM45029 = (i5 - ThreadFactoryC3888.m11306("ۢۚ")) * (-73);
                            i7 = ((iM45029 ^ i6) * (-6683)) ^ (-1556356991);
                            i = 588856740;
                        } else {
                            iM45029 = (i6 - C19806.m45029("᩷ۧ")) * 9;
                            i7 = ((iM45029 ^ i5) * (-5849)) ^ (-1055796736);
                            i = 154466772;
                        }
                        i9 = iM45029 ^ i;
                        break;
                    case 529307158:
                    case 1876861414:
                        interfaceC13514Range = C9653.range(i3, this.f19660);
                        if (C1419.f5860 < 0) {
                            intUnaryOperator = new IntUnaryOperator() { // from class: l.ᩳۗۨ
                                public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator2) {
                                    return C15568.$default$andThen(this, intUnaryOperator2);
                                }

                                @Override // java.util.function.IntUnaryOperator
                                public final int applyAsInt(int i12) {
                                    return AbstractActivityC5788.m15926(this.f56383, i12);
                                }

                                public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator2) {
                                    return C15568.$default$compose(this, intUnaryOperator2);
                                }
                            };
                            if (C2788.f10625 < 0) {
                                iM45029 = C19806.m45029("ܳᩳ") ^ i6;
                                i7 = ((iM45029 ^ i5) * (-27305)) ^ 823979836;
                                i = -852456592;
                                i9 = iM45029 ^ i;
                            }
                        }
                        break;
                    case 631566688:
                    case 658790954:
                        C3722.m10894();
                        return null;
                    case 725023059:
                    case 1643757528:
                        C0962.m3746();
                        if (C3286.f12186) {
                            iM45029 = (C19806.m45029("ۗܿ") + i6) * (-21);
                            i7 = ((iM45029 ^ i5) * (-2721)) ^ 1202445402;
                            i = -1475930108;
                        } else {
                            iM45029 = C19806.m45029("֨۠") ^ i6;
                            i7 = ((iM45029 ^ i5) * (-15167)) ^ 426645487;
                            i = -900573157;
                        }
                        i9 = iM45029 ^ i;
                        break;
                    default:
                        return this.f19666;
                }
            }
            iM450211 = ThreadFactoryC3888.m11306("֨ܺ") ^ i5;
            i7 = ((iM450211 ^ i6) * 17749) ^ (-157517832);
            i8 = 976482271;
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0299 A[PHI: r3
      0x0299: PHI (r3v4 l.۫ۗۨ) = (r3v2 l.۫ۗۨ), (r3v3 l.۫ۗۨ), (r3v2 l.۫ۗۨ), (r3v2 l.۫ۗۨ) binds: [B:74:0x0281, B:42:0x0144, B:15:0x0047, B:7:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x02cb A[PHI: r4 r5 r6
      0x02cb: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v2 java.lang.String), (r4v4 java.lang.String) binds: [B:80:0x02c9, B:66:0x022f, B:38:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x02cb: PHI (r5v3 l.ۧۧۖ) = (r5v2 l.ۧۧۖ), (r5v2 l.ۧۧۖ), (r5v4 l.ۧۧۖ) binds: [B:80:0x02c9, B:66:0x022f, B:38:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x02cb: PHI (r6v3 boolean) = (r6v2 boolean), (r6v2 boolean), (r6v4 boolean) binds: [B:80:0x02c9, B:66:0x022f, B:38:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x02fd  */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (l.C1668.f6641 < 0) goto L15;
     */
    @Override // android.widget.AdapterView.OnItemClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onItemClick(android.widget.AdapterView r18, android.view.View r19, int r20, long r21) {
        /*
            Method dump skipped, instruction units count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC5788.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }
}
