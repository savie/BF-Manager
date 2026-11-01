package l;

import android.R;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Space;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.۬ܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 12B7 */
/* JADX INFO: loaded from: classes4.dex */
public class ViewOnClickListenerC13209 extends AbstractActivityC12483 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۢ᩹ۢ, reason: not valid java name and contains not printable characters */
    private static final short[] f43951 = {837, 1088, 8816, 1089, 8816, 27857, -18048, -19317, 3057, -18173, -19276, 20853, 8620, 7428, 16376, -2331, 25585, 6411, 5711, 9465, 3434, 3686, -364, 2710, 7159, 3551, 2709, 1068, 12235, 14263, 4688, 8790, -906, -3661, 5753, 12233, -3708, -1342, 7594, 8136, 3918, 5808, -1170, -5626, -7292, 3673, -3954, -509, 4848, -7034, -23, 6684, -4203, -1290, -5131, -885, -6381, 11250, 11378, -2698, 3550, 28385, -31892, -26517, 25679, -16418, -19519, 3889, -15532, 9870, -14553, 12227, 11989, -14685, -17226, -17240, 7329, -30416, -29143, 19436, -26108, 29159, 31681, 8115, 8116, 8106, 8111, 8110, 8069, 8119, 8127, 8110, 8114, 8117, 8126, 6929, -31782, -21883, 29931, -29026, -29515, -19480, 28427, -18667, 25267, -30331, 30749, -32261, 26665, 25038, -18656, -25430, -18024, -28104, -31559, 30310, 29071, -29332, 26309, -31838, 29035, 29151, -32360, -30209, 29087, -27634, -29522, -31092, 31969, -26859, -17456, -28434, -7054, -7053, -7052, -7051, -7050, -7049, -7048, -7047, -7167, -7166, -7165, -7164, -7163, -7162, -7161, -7160, -7158, -7157, -7156, -7155, -7154, -7152, -7151, -7150, -7149, -7148, -7147, -7146, -7145, -7144, -7143, -7142, -7135, -7134, -7133, -7132, -7131, -7130, -7129, -7128, -7126, -7125, -7124, -7123, -7122, -7120, -7119, -7118, -7117, -7116, -7115, -7114, -7113, -7112, -7111, -7110, -28904, 26937, 32033, -7094, 27281, -25755, 29182, -7118, -7131, -7130, -7131, -7118, -7118, -7135, -7124, -7165, -7121, -7132, -7131, 6897, 25081, 25070, 25069, 25070, 25081, 25081, 25066, 25063, 25032, 25060, 25071, 25070, 1572, 12559, 16290, 642, 13047, 7416, -10967, 15811, 5336, -12535, 5996, -12512, 14502, 4053, 21282, 21277, 21256, 21251, 21307, 21252, 21277, 21292, 21262, 21273, 21252, 21275, 21252, 21273, 21268, 7696, 20624, -23831, -16670, -9427, -9404, -9403, -9406, -9405, -9408, -9407, -9394, -9393, -9417, -9381, -9410, -9412, -9381, -9416, -9434, -9381, -9428, -9429, -9459, -9401, -9404, -9461, 22683, -30252, -31569, -9348, -18359, -32359, 21777, -31536, -29137, -23425, -29676, -18981, -29024, -20997, 22714, 21158, 19734, -17195, -16462, -9421, -9468, -9468, -9447, -9468, -9385, 20472, -23169, -22147};

    /* JADX INFO: renamed from: ܶܰ, reason: not valid java name and contains not printable characters */
    public static final int[] f43952;

    /* JADX INFO: renamed from: ᩸ܰ, reason: not valid java name and contains not printable characters */
    public static final int[] f43953;

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f43954 = 0;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public boolean f43955;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public C22959 f43956;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public TextView f43957;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public boolean f43958;

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f43959;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public C5447 f43960;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public boolean f43961;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i = 0;
        short s3 = 0;
        int i2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = -1761857900;
        int i6 = C1419.f5860;
        int i7 = C3535.f13026;
        int iM45029 = (C19806.m45029("ܺ֡") ^ i6) * (-49);
        int i8 = ((iM45029 ^ i7) * 3415) ^ 648506550;
        int i9 = -1444719717;
        while (true) {
            i5 = ((((i5 ^ i7) * 24027) >> 31) & i8) ^ (iM45029 ^ i9);
            switch (i5) {
                case -2081819793:
                case 2062841437:
                    return C0278.m1774(sArr2, i4, 15, i3);
                case -2074758013:
                case -37852728:
                    i2 = s + s3;
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = (C19806.m45029("۫֫") ^ i6) * 109;
                        i8 = ((iM45029 ^ i7) * 20807) ^ 1237603781;
                        i9 = -1941794734;
                    } else {
                        iM45029 = (C19806.m45029("۫ۙ") ^ i6) * 99;
                        i8 = ((iM45029 ^ i7) * (-27863)) ^ (-1289117131);
                        i9 = 1815769410;
                    }
                    break;
                case -2052145401:
                case -942701125:
                    sArr2 = f43951;
                    i4 = 234;
                    if (C1377.f5749) {
                        iM45029 = (C19806.m45029("ۖ۠") + i7) * 55;
                        i8 = ((iM45029 ^ i6) * 3119) ^ 136124745;
                        i9 = -475030958;
                    } else {
                        iM45029 = (C19806.m45029("۫֫") ^ i6) * 109;
                        i8 = ((iM45029 ^ i7) * 20807) ^ 1237603781;
                        i9 = -1941794734;
                    }
                    break;
                case -2008554116:
                case 1962462769:
                    C1668.m5583();
                    if (C3660.f13403 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۗ") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-19817)) ^ 725635776;
                        i9 = -2063056381;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶۛ") ^ i6;
                        i8 = ((iM45029 ^ i7) * 13629) ^ (-1289400278);
                        i9 = -7617626;
                    }
                    break;
                case -1981651007:
                case 1403766842:
                    if (C0817.f3443) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ۘ") ^ i7) * 21;
                        i8 = ((iM45029 ^ i6) * (-45)) ^ 72838682;
                        i9 = 1082934299;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۗ") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-19817)) ^ 725635776;
                        i9 = -2063056381;
                    }
                    break;
                case -1645798943:
                case -302886277:
                    if (C3722.m10894() <= 0) {
                        iM45029 = (C19806.m45029("۫֫") ^ i6) * 109;
                        i8 = ((iM45029 ^ i7) * 20807) ^ 1237603781;
                        i9 = -1941794734;
                    } else {
                        iM45029 = C19806.m45029("۠ۗ") ^ i6;
                        i8 = ((iM45029 ^ i7) * (-4437)) ^ (-2104275310);
                        i9 = -1704111820;
                    }
                    break;
                case -1244530136:
                case 761008106:
                    sArr = f43951;
                    if (C0216.f1393 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۨ") ^ i6;
                        i8 = ((iM45029 ^ i7) * (-30217)) ^ (-989953912);
                        i9 = -1588061427;
                    } else {
                        iM45029 = C19806.m45029("᩻ܽ") ^ i6;
                        i8 = ((iM45029 ^ i7) * (-2547)) ^ 1500982802;
                        i9 = -909809924;
                    }
                    break;
                case -1003537517:
                case 707472569:
                    C1668.m5583();
                    iM45029 = (C19806.m45029("۫֫") ^ i6) * 109;
                    i8 = ((iM45029 ^ i7) * 20807) ^ 1237603781;
                    i9 = -1941794734;
                    break;
                case -622277814:
                case 357862815:
                    if (C0671.f2816 != 0) {
                        iM45029 = (C19806.m45029("ܳ᩸") ^ i7) * (-29);
                        i8 = ((iM45029 ^ i6) * 15813) ^ (-640343845);
                        i9 = 1225092660;
                    } else {
                        iM45029 = (C19806.m45029("۫֫") ^ i6) * 109;
                        i8 = ((iM45029 ^ i7) * 20807) ^ 1237603781;
                        i9 = -1941794734;
                    }
                    break;
                case -493259382:
                case -125712702:
                    i3 = 23902;
                    iM45029 = ThreadFactoryC3888.m11306("֡ۡ") ^ i6;
                    i8 = ((iM45029 ^ i7) * 16433) ^ (-734463415);
                    i9 = 1343095581;
                    break;
                case -432647451:
                case 1787623386:
                    C1025.m3861();
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܶۛ") ^ i6;
                        i8 = ((iM45029 ^ i7) * 13629) ^ (-1289400278);
                        i9 = -7617626;
                    } else {
                        iM45029 = (C19806.m45029("۫֫") ^ i6) * 109;
                        i8 = ((iM45029 ^ i7) * 20807) ^ 1237603781;
                        i9 = -1941794734;
                    }
                    break;
                case -330361216:
                case 677300436:
                    c = 233;
                    if (C3577.f13150 >= 0) {
                        iM45029 = (C19806.m45029("۫֫") ^ i6) * 109;
                        i8 = ((iM45029 ^ i7) * 20807) ^ 1237603781;
                        i9 = -1941794734;
                    } else {
                        iM45029 = (C19806.m45029("᩸֡") + i6) * (-113);
                        i8 = ((iM45029 ^ i7) * (-2287)) ^ (-1414826449);
                        i9 = 1229142607;
                    }
                    break;
                case -251109026:
                case -188086768:
                    if (i - (i2 * i2) <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖۙ") ^ i7;
                        i8 = ((iM45029 ^ i6) * 15369) ^ 146394312;
                        i9 = 601492928;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֡᩻") ^ i7) * 5;
                        i8 = ((iM45029 ^ i6) * 16919) ^ (-1419203059);
                        i9 = 1040039411;
                    }
                    break;
                case 96983725:
                case 1338868665:
                    if (C1668.m5583()) {
                        iM45029 = ThreadFactoryC3888.m11306("֡ܽ") ^ i7;
                        i8 = ((iM45029 ^ i6) * 12955) ^ (-1976976585);
                        i9 = -1280336093;
                    } else {
                        iM45029 = (C19806.m45029("۫֫") ^ i6) * 109;
                        i8 = ((iM45029 ^ i7) * 20807) ^ 1237603781;
                        i9 = -1941794734;
                    }
                    break;
                case 447701041:
                case 830316782:
                    i = s * s2;
                    s3 = 8034;
                    if (C1668.f6641 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۗ") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-19817)) ^ 725635776;
                        i9 = -2063056381;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡܶ") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-2133)) ^ 1757528315;
                        i9 = -1570862686;
                    }
                    break;
                case 476468132:
                case 572247853:
                    if (C2788.f10625 >= 0) {
                        iM45029 = (C19806.m45029("ܳ᩸") ^ i7) * (-29);
                        i8 = ((iM45029 ^ i6) * 15813) ^ (-640343845);
                        i9 = 1225092660;
                    } else {
                        iM45029 = C19806.m45029("ۗ۫") ^ i7;
                        i8 = ((iM45029 ^ i6) * 21205) ^ 243952222;
                        i9 = -704478934;
                    }
                    break;
                case 1626370818:
                case 2084236060:
                    i3 = 21357;
                    iM45029 = ThreadFactoryC3888.m11306("֡ۡ") ^ i6;
                    i8 = ((iM45029 ^ i7) * 16433) ^ (-734463415);
                    i9 = 1343095581;
                    break;
                case 1704365470:
                case 2033731328:
                    C0797.m3359();
                    return null;
                default:
                    s = sArr[c];
                    s2 = 32136;
                    if (C1875.m6086() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۨ") ^ i6;
                        i8 = ((iM45029 ^ i7) * (-30217)) ^ (-989953912);
                        i9 = -1588061427;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ᩺") ^ i6;
                        i8 = ((iM45029 ^ i7) * (-13429)) ^ (-2006588718);
                        i9 = -821065751;
                    }
                    break;
            }
        }
    }

    static {
        int i = 0;
        int[] iArr = null;
        int i2 = -1855172404;
        int i3 = RunnableC1606.f6488;
        int i4 = C1460.f5948;
        int iM45029 = C19806.m45029("ܿ۠") ^ i3;
        int i5 = ((iM45029 ^ i4) * (-1291)) ^ 522014512;
        int i6 = -461714102;
        while (true) {
            i2 = ((((i2 ^ i4) * 14085) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -1949628261:
                case -591348915:
                    if (C2249.f8050 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۡ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-25599)) ^ (-248242309);
                        i6 = 491163264;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷۫") ^ i3;
                        i5 = ((iM45029 ^ i4) * 19401) ^ 944943699;
                        i6 = -984198360;
                    }
                    break;
                case -1866198317:
                case 113474395:
                    RunnableC1564.m5345();
                    C0629.m2907();
                    iM45029 = ThreadFactoryC3888.m11306("᩸ۡ") ^ i4;
                    i5 = ((iM45029 ^ i3) * (-25599)) ^ (-248242309);
                    i6 = 491163264;
                    break;
                case -1855956445:
                case 278006594:
                    // fill-array-data instruction
                    iArr[0] = 2131231440;
                    iArr[1] = 2131231446;
                    iArr[2] = 2131231447;
                    iArr[3] = 2131231448;
                    iArr[4] = 2131231449;
                    iArr[5] = 2131231450;
                    iArr[6] = 2131231451;
                    iArr[7] = 2131231452;
                    iArr[8] = 2131231453;
                    iArr[9] = 2131231441;
                    iArr[10] = 2131231442;
                    iArr[11] = 2131231443;
                    iArr[12] = 2131231444;
                    iArr[13] = 2131231445;
                    iArr[14] = 2131231454;
                    if (RunnableC1564.m5345()) {
                        iM45029 = C19806.m45029("ܺۜ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 18867) ^ 1198066902;
                        i6 = -616624948;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۢ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-8877)) ^ (-288874450);
                        i6 = 1217958835;
                    }
                    break;
                case -1599380035:
                case 473309580:
                    C1460.m5050();
                    if (C1460.f5948 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ֨") ^ i4;
                        i5 = ((iM45029 ^ i3) * 18239) ^ 2006072618;
                        i6 = -155229616;
                    } else {
                        iM45029 = C19806.m45029("ܺۜ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 18867) ^ 1198066902;
                        i6 = -616624948;
                    }
                    break;
                case -1567343208:
                case 195951635:
                    i = 15;
                    iArr = new int[15];
                    if (C0526.f2219) {
                        iM45029 = C19806.m45029("ᩳ᩵") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-2089)) ^ (-1315062491);
                        i6 = -131863976;
                    } else {
                        iM45029 = C19806.m45029("֨᩺") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-15953)) ^ 1632454190;
                        i6 = 350349397;
                    }
                    break;
                case -1399927570:
                case 464817119:
                    f43952 = iArr;
                    if (C1066.f4915 <= 0) {
                        iM45029 = C19806.m45029("ᩳ᩵") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-2089)) ^ (-1315062491);
                        i6 = -131863976;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗ۠") + i3) * (-51);
                        i5 = ((iM45029 ^ i4) * 32509) ^ (-1028458582);
                        i6 = 972955701;
                    }
                    break;
                case -1200922276:
                case 1900594039:
                    if (C1875.f7103 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۡ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-25599)) ^ (-248242309);
                        i6 = 491163264;
                    } else {
                        iM45029 = (C19806.m45029("۠ܰ") ^ i3) * 55;
                        i5 = ((iM45029 ^ i4) * 22911) ^ (-801730797);
                        i6 = -1751037830;
                    }
                    break;
                case -1074985806:
                case 1878489427:
                    if (C3535.f13026 <= 0) {
                        iM45029 = C19806.m45029("֫۟") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-23975)) ^ 1978682978;
                        i6 = 2131980959;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ᩺") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-21731)) ^ 766877788;
                        i6 = -1596880065;
                    }
                    break;
                case -252206031:
                case -167878501:
                    if (C0797.f3386) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۡ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-25599)) ^ (-248242309);
                        i6 = 491163264;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ܽۤ")) * 97;
                        i5 = ((iM45029 ^ i4) * (-23353)) ^ 2088242896;
                        i6 = -1886929758;
                    }
                    break;
                case -192324452:
                case 313081291:
                    if (C2124.f7782 > 0) {
                        iM45029 = C19806.m45029("ܺۜ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 18867) ^ 1198066902;
                        i6 = -616624948;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۡ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-25599)) ^ (-248242309);
                        i6 = 491163264;
                    }
                    break;
                case -111988641:
                case 326664995:
                    C3722.m10894();
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    throw new RuntimeException();
                case 14436957:
                case 237680312:
                    int[] iArr2 = new int[i];
                    // fill-array-data instruction
                    iArr2[0] = 2131888995;
                    iArr2[1] = 2131889001;
                    iArr2[2] = 2131889002;
                    iArr2[3] = 2131889003;
                    iArr2[4] = 2131889004;
                    iArr2[5] = 2131889005;
                    iArr2[6] = 2131889006;
                    iArr2[7] = 2131889007;
                    iArr2[8] = 2131889008;
                    iArr2[9] = 2131888996;
                    iArr2[10] = 2131888997;
                    iArr2[11] = 2131888998;
                    iArr2[12] = 2131888999;
                    iArr2[13] = 2131889000;
                    iArr2[14] = 2131889009;
                    f43953 = iArr2;
                    return;
                case 112716996:
                case 887635190:
                    if (C1875.f7103 < 0) {
                        iM45029 = C19806.m45029("֫۟") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-23975)) ^ 1978682978;
                        i6 = 2131980959;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۡ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-25599)) ^ (-248242309);
                        i6 = 491163264;
                    }
                    break;
                case 257834679:
                case 1765259974:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ֨") ^ i4;
                        i5 = ((iM45029 ^ i3) * 18239) ^ 2006072618;
                        i6 = -155229616;
                    } else {
                        iM45029 = (C19806.m45029("᩻ۘ") ^ i4) * 11;
                        i5 = ((iM45029 ^ i3) * (-27375)) ^ 1276303770;
                        i6 = -1113069298;
                    }
                    break;
                case 1153949706:
                case 1771082383:
                    if (C1148.m4232() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ֨") ^ i4;
                        i5 = ((iM45029 ^ i3) * 18239) ^ 2006072618;
                        i6 = -155229616;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻ۖ") + i3) * 63;
                        i5 = ((iM45029 ^ i4) * (-133)) ^ 1181945775;
                        i6 = -1927112010;
                    }
                    break;
                default:
                    if (C19806.m45024()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ֨") ^ i4;
                        i5 = ((iM45029 ^ i3) * 18239) ^ 2006072618;
                        i6 = -155229616;
                    } else {
                        iM45029 = (C19806.m45029("۬᩶") + i4) * (-89);
                        i5 = ((iM45029 ^ i3) * (-28135)) ^ (-1267485783);
                        i6 = -622850682;
                    }
                    break;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Iterator itM9863 = null;
        C14078 c14078 = null;
        boolean z = false;
        int i = -812714453;
        int i2 = C1398.f5802;
        int i3 = C1066.f4915;
        int iM11306 = (i3 - ThreadFactoryC3888.m11306("᩺ܳ")) * (-27);
        int i4 = ((iM11306 ^ i2) * (-19721)) ^ 339520245;
        int i5 = 296837160;
        while (true) {
            i = ((((i ^ i2) * 23883) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2027986313:
                case 1934417424:
                    C1148.m4232();
                    C2249.m6915();
                    break;
                case -1889681157:
                case -1625391034:
                    C10634.m26820();
                    iM11306 = (i3 - C19806.m45029("ۘᩳ")) * 33;
                    i4 = ((iM11306 ^ i2) * (-3597)) ^ (-1070453267);
                    i5 = 1852721955;
                    break;
                case -1796551397:
                case 1717770616:
                    c14078 = (C14078) C0216.m1584(itM9863);
                    if (c14078 == view) {
                        iM11306 = (C19806.m45029("ۢ᩹") ^ i2) * 17;
                        i4 = ((iM11306 ^ i3) * 17) ^ (-133434991);
                        i5 = 2062641739;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫ܰ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 2851) ^ (-1338139146);
                        i5 = 113604347;
                    }
                    break;
                case -1771567049:
                case 768669155:
                    z = false;
                    iM11306 = C19806.m45029("᩹᩸") ^ i3;
                    i4 = ((iM11306 ^ i2) * 7727) ^ 862314619;
                    i5 = 2036874496;
                    break;
                case -1719203368:
                case -1620029226:
                    itM9863 = ViewTreeObserverOnPreDrawListenerC3327.m9863(this.f43959);
                    iM11306 = C19806.m45029("۬᩶") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-5525)) ^ 1337563859;
                    i5 = -1755543277;
                    break;
                case -1501423999:
                case 139282676:
                    z = true;
                    iM11306 = C19806.m45029("᩹᩸") ^ i3;
                    i4 = ((iM11306 ^ i2) * 7727) ^ 862314619;
                    i5 = 2036874496;
                    break;
                case -1438406666:
                case 397531857:
                    if (C3577.f13150 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟֫") ^ i2) * (-113);
                        i4 = ((iM11306 ^ i3) * 18295) ^ (-1411332070);
                        i5 = 1682955641;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۘᩳ")) * 33;
                        i4 = ((iM11306 ^ i2) * (-3597)) ^ (-1070453267);
                        i5 = 1852721955;
                    }
                    break;
                case -1349090905:
                case -606112137:
                    C0629.m2907();
                    if (C2642.f10294 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20179)) ^ (-334631742);
                        i5 = -805522286;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۟֫") ^ i2) * (-113);
                        i4 = ((iM11306 ^ i3) * 18295) ^ (-1411332070);
                        i5 = 1682955641;
                    }
                    break;
                case -1125420843:
                case 1215681274:
                    if (C2249.m6915() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20179)) ^ (-334631742);
                        i5 = -805522286;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚ۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-16659)) ^ 271945385;
                        i5 = 1785039586;
                    }
                    break;
                case -708774748:
                case -472049452:
                    if (C1025.f4800 >= 0) {
                        iM11306 = (C19806.m45029("ۖ᩶") + i3) * 45;
                        i4 = ((iM11306 ^ i2) * (-6743)) ^ 1597095373;
                        i5 = 298315064;
                    } else {
                        iM11306 = C19806.m45029("ۘ᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-13303)) ^ 827912577;
                        i5 = -1641498290;
                    }
                    break;
                case -633964139:
                case 2032353642:
                    if (C0817.f3443) {
                        iM11306 = (C19806.m45029("᩷᩺") ^ i3) * 51;
                        i4 = ((iM11306 ^ i2) * (-685)) ^ 1543786159;
                        i5 = 1150385111;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20179)) ^ (-334631742);
                        i5 = -805522286;
                    }
                    break;
                case -489673769:
                case 762751640:
                    break;
                case -220180105:
                case -71113897:
                    if (RunnableC1564.m5348(itM9863)) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷᩷") ^ i3;
                        i4 = ((iM11306 ^ i2) * 22987) ^ 1697679442;
                        i5 = 64782070;
                    } else {
                        iM11306 = C19806.m45029("ۨᩳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 30771) ^ (-1658599033);
                        i5 = -909775199;
                    }
                    break;
                case -201670130:
                case 1013790912:
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-20179)) ^ (-334631742);
                        i5 = -805522286;
                    } else {
                        iM11306 = C19806.m45029("֡ܿ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 2063) ^ (-1653365133);
                        i5 = -2071789084;
                    }
                    break;
                case -201185982:
                case -74154307:
                    if (C3286.f12186) {
                        iM11306 = (C19806.m45029("ۖ᩶") + i3) * 45;
                        i4 = ((iM11306 ^ i2) * (-6743)) ^ 1597095373;
                        i5 = 298315064;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۜ֫") ^ i2;
                        i4 = ((iM11306 ^ i3) * 4161) ^ (-1820433198);
                        i5 = -1298995606;
                    }
                    break;
                case -167981448:
                case 1422890113:
                    if (C0817.f3443) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("֨۟")) * (-83);
                        i4 = ((iM11306 ^ i2) * 31769) ^ (-1769470402);
                        i5 = 1665357388;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۘᩳ")) * 33;
                        i4 = ((iM11306 ^ i2) * (-3597)) ^ (-1070453267);
                        i5 = 1852721955;
                    }
                    break;
                case -1054565:
                case 2102533061:
                    if (C1668.m5583()) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ܰ") ^ i2) * (-37);
                        i4 = ((iM11306 ^ i3) * 6375) ^ 983187417;
                        i5 = 534989841;
                    } else {
                        iM11306 = (C19806.m45029("ۖ᩶") + i3) * 45;
                        i4 = ((iM11306 ^ i2) * (-6743)) ^ 1597095373;
                        i5 = 298315064;
                    }
                    break;
                case 28367552:
                case 1090067889:
                    if (C3577.f13150 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟֫") ^ i2) * (-113);
                        i4 = ((iM11306 ^ i3) * 18295) ^ (-1411332070);
                        i5 = 1682955641;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘ֡") + i2) * (-115);
                        i4 = ((iM11306 ^ i3) * 2975) ^ 911227452;
                        i5 = -215709848;
                    }
                    break;
                case 265910493:
                case 306257134:
                    if (C3743.f13569) {
                        iM11306 = C19806.m45029("ᩴۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-27477)) ^ (-177611075);
                        i5 = -19465299;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۟֫") ^ i2) * (-113);
                        i4 = ((iM11306 ^ i3) * 18295) ^ (-1411332070);
                        i5 = 1682955641;
                    }
                    break;
                case 483875697:
                case 1220347326:
                    c14078.m34059(z);
                    iM11306 = C19806.m45029("۬᩶") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-5525)) ^ 1337563859;
                    i5 = -1755543277;
                    break;
                case 1446145382:
                case 1612066810:
                    if (C3577.m10565()) {
                        iM11306 = (C19806.m45029("ܽ᩶") + i3) * 85;
                        i4 = ((iM11306 ^ i2) * 2563) ^ (-865622683);
                        i5 = -1883711127;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۘᩳ")) * 33;
                        i4 = ((iM11306 ^ i2) * (-3597)) ^ (-1070453267);
                        i5 = 1852721955;
                    }
                    break;
                default:
                    if (RunnableC1564.f6300) {
                        iM11306 = (i3 - C19806.m45029("ۘᩳ")) * 33;
                        i4 = ((iM11306 ^ i2) * (-3597)) ^ (-1070453267);
                        i5 = 1852721955;
                    } else {
                        iM11306 = (C19806.m45029("ۧۢ") + i2) * 49;
                        i4 = ((iM11306 ^ i3) * 14933) ^ (-629566288);
                        i5 = 1114341533;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0125  */
    /* JADX WARN: Code duplicated, block: B:52:0x0151 A[PHI: r6
      0x0151: PHI (r6v9 l.᩶᩷ۘ) = (r6v4 l.᩶᩷ۘ), (r6v4 l.᩶᩷ۘ), (r6v4 l.᩶᩷ۘ), (r6v5 l.᩶᩷ۘ), (r6v4 l.᩶᩷ۘ), (r6v4 l.᩶᩷ۘ), (r6v4 l.᩶᩷ۘ) binds: [B:51:0x014f, B:43:0x0105, B:39:0x00e9, B:23:0x0060, B:14:0x0042, B:11:0x0039, B:6:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x017e  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32681(AbstractActivityC12483 abstractActivityC12483, boolean z) {
        int iM45029;
        int i;
        int i2 = 1077573524;
        int i3 = C1977.f7413;
        int i4 = C2477.f9839;
        int iM450210 = C19806.m45029("ۗܳ") ^ i3;
        int i5 = ((iM450210 ^ i4) * (-28969)) ^ 163854730;
        int i6 = 2015800828;
        while (true) {
            int i7 = iM450210 ^ i6;
            RunnableC20410 runnableC20410 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * 15525) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1718888542:
                    case -842443418:
                        C2704.m8255();
                        break;
                    case -1659967113:
                    case 930560624:
                        if (RunnableC0195.f1321 >= 0) {
                            iM45029 = (C19806.m45029("ܳۖ") ^ i3) * 53;
                            i5 = ((iM45029 ^ i4) * (-13083)) ^ 84955373;
                            i = -2056881620;
                        } else {
                            iM45029 = C19806.m45029("ۛ֫") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-22485)) ^ (-428386397);
                            i = -844880250;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -1616813774:
                    case -1316602737:
                        if (C1461.f5957 <= 0) {
                            iM45029 = C19806.m45029("ۙۛ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-18311)) ^ 752656588;
                            i = -373683602;
                        } else {
                            iM45029 = (i4 - C19806.m45029("۟֫")) * (-31);
                            i5 = ((iM45029 ^ i3) * (-15781)) ^ (-430944781);
                            i = -1028628167;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -1466251973:
                    case -971999638:
                        if (C2704.m8255() <= 0) {
                            iM45029 = C19806.m45029("֡۟") ^ i3;
                            i5 = ((iM45029 ^ i4) * 13845) ^ 1262374400;
                            i = -1932604655;
                        } else {
                            iM45029 = C19806.m45029("ᩴܽ") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-7429)) ^ 932420580;
                            i = 24901006;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -1250346426:
                    case 1765233016:
                        int i8 = 0;
                        if (ThreadFactoryC3888.m11300() > 0) {
                            runnableC20410 = new RunnableC20410(i8, abstractActivityC12483);
                            if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                                iM45029 = C19806.m45029("ۙۛ") ^ i4;
                                i5 = ((iM45029 ^ i3) * (-18311)) ^ 752656588;
                                i = -373683602;
                            } else {
                                iM45029 = C19806.m45029("֨ۖ") ^ i4;
                                i5 = ((iM45029 ^ i3) * 24483) ^ (-1047522125);
                                i = -1105230139;
                            }
                            i7 = iM45029 ^ i;
                        }
                        break;
                    case -1000672536:
                    case 157242380:
                        RunnableC1606.m5473();
                        if (C2788.f10625 < 0) {
                            iM45029 = C19806.m45029("ۙۛ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-18311)) ^ 752656588;
                            i = -373683602;
                        } else {
                            iM45029 = (C19806.m45029("ܳۖ") ^ i3) * 53;
                            i5 = ((iM45029 ^ i4) * (-13083)) ^ 84955373;
                            i = -2056881620;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -907267958:
                    case 2134277844:
                        if (C1977.m6356()) {
                            iM45029 = C19806.m45029("۟۫") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-24979)) ^ (-747084778);
                            i = 1356648477;
                        } else {
                            C1419.m4977(abstractActivityC12483, new Intent(abstractActivityC12483, (Class<?>) ViewOnClickListenerC13209.class));
                            if (z) {
                                iM45029 = (C19806.m45029("֨ۢ") + i3) * 67;
                                i5 = ((iM45029 ^ i4) * (-11189)) ^ (-1797871710);
                                i = 512801730;
                            } else {
                                iM45029 = (ThreadFactoryC3888.m11306("ۘ֡") + i4) * (-115);
                                i5 = ((iM45029 ^ i3) * 16735) ^ 1732551700;
                                i = -2113720331;
                            }
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -835832315:
                    case 733687034:
                        C2124.m6681(runnableC20410, 300L);
                        iM45029 = (ThreadFactoryC3888.m11306("ۘ֡") + i4) * (-115);
                        i5 = ((iM45029 ^ i3) * 16735) ^ 1732551700;
                        i = -2113720331;
                        i7 = iM45029 ^ i;
                        break;
                    case -313435283:
                    case 1373122851:
                        if (C0671.m3008() >= 0) {
                            iM45029 = C19806.m45029("ۙۛ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-18311)) ^ 752656588;
                            i = -373683602;
                        } else {
                            iM45029 = (i4 - C19806.m45029("۫ᩴ")) * 11;
                            i5 = ((iM45029 ^ i3) * 145) ^ (-291264397);
                            i = -758479784;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case -305980805:
                    case 463151678:
                        break;
                    case 14317167:
                    case 1650301567:
                        if (!C0526.f2219) {
                            iM45029 = ThreadFactoryC3888.m11306("᩺۫") ^ i3;
                            i5 = ((iM45029 ^ i4) * 20869) ^ (-703491431);
                            i = 758175969;
                            i7 = iM45029 ^ i;
                        }
                        break;
                    case 47814261:
                    case 1580064621:
                        if (C0629.f2722 > 0) {
                        }
                        iM45029 = C19806.m45029("֡۟") ^ i3;
                        i5 = ((iM45029 ^ i4) * 13845) ^ 1262374400;
                        i = -1932604655;
                        i7 = iM45029 ^ i;
                        break;
                    case 356065731:
                    case 2118445279:
                        C0050.m946();
                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                            iM45029 = C19806.m45029("ۙۛ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-18311)) ^ 752656588;
                            i = -373683602;
                        } else {
                            iM45029 = C19806.m45029("֡۟") ^ i3;
                            i5 = ((iM45029 ^ i4) * 13845) ^ 1262374400;
                            i = -1932604655;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    case 706997060:
                    case 1457286900:
                        if (C0278.f1572 > 0) {
                            iM45029 = C19806.m45029("֡ۨ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-21399)) ^ 1110658130;
                            i = 1195805177;
                            i7 = iM45029 ^ i;
                        }
                        break;
                    case 1400722243:
                    case 1663770870:
                        if (C0050.f912 <= 0) {
                            iM45029 = C19806.m45029("ۙۛ") ^ i4;
                            i5 = ((iM45029 ^ i3) * (-18311)) ^ 752656588;
                            i = -373683602;
                        } else {
                            iM45029 = (i3 - C19806.m45029("ܿܿ")) * (-73);
                            i5 = ((iM45029 ^ i4) * 16919) ^ 2085936784;
                            i = 1912172369;
                        }
                        i7 = iM45029 ^ i;
                        break;
                    default:
                        C1398.m4895();
                        C1189.m4368();
                        iM45029 = C19806.m45029("ۙۛ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-18311)) ^ 752656588;
                        i = -373683602;
                        i7 = iM45029 ^ i;
                        break;
                }
                return;
            }
            iM450210 = C19806.m45029("ܿۜ") ^ i4;
            i5 = ((iM450210 ^ i3) * 20511) ^ 1176997933;
            i6 = -1268051077;
        }
    }

    public ViewOnClickListenerC13209() {
        ArrayList arrayList = null;
        int i = -865381782;
        int i2 = C3722.f13525;
        int i3 = C7105.f23796;
        int iM11306 = (ThreadFactoryC3888.m11306("۬ۧ") ^ i3) * 51;
        int i4 = ((iM11306 ^ i2) * 14389) ^ 896228147;
        int i5 = -1463772392;
        while (true) {
            i = ((((i ^ i2) * 7721) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2120210861:
                case 442698297:
                    C1377.m4833();
                    if (C0050.f912 > 0) {
                        iM11306 = (C19806.m45029("ۗ᩺") ^ i2) * (-39);
                        i4 = ((iM11306 ^ i3) * (-25219)) ^ 872969005;
                        i5 = 2139508785;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-19545)) ^ (-481209681);
                        i5 = -884071038;
                    }
                    break;
                case -1509277342:
                case -563754794:
                    if (C19806.f63586) {
                        iM11306 = (C19806.m45029("֡ۗ") ^ i3) * (-23);
                        i4 = ((iM11306 ^ i2) * (-21145)) ^ (-341924721);
                        i5 = -1396683622;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ۚ۠")) * (-61);
                        i4 = ((iM11306 ^ i3) * (-23051)) ^ 1154635881;
                        i5 = 1757822636;
                    }
                    break;
                case -1458109087:
                case 1161128187:
                    if (C19806.f63586) {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-19545)) ^ (-481209681);
                        i5 = -884071038;
                    } else {
                        iM11306 = C19806.m45029("ۤۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-3573)) ^ 123181339;
                        i5 = -420125621;
                    }
                    break;
                case -1345792470:
                case 364318214:
                    this.f43956 = C22959.m50800();
                    return;
                case -1202163317:
                case 908768064:
                    C1977.m6356();
                    if (C2249.f8050 >= 0) {
                        iM11306 = (C19806.m45029("֡ۗ") ^ i3) * (-23);
                        i4 = ((iM11306 ^ i2) * (-21145)) ^ (-341924721);
                        i5 = -1396683622;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-19545)) ^ (-481209681);
                        i5 = -884071038;
                    }
                    break;
                case -920510673:
                case 63794741:
                    if (C2124.f7782 <= 0) {
                        iM11306 = (C19806.m45029("֡ۗ") ^ i3) * (-23);
                        i4 = ((iM11306 ^ i2) * (-21145)) ^ (-341924721);
                        i5 = -1396683622;
                    } else {
                        iM11306 = (C19806.m45029("ᩳۘ") + i2) * 89;
                        i4 = ((iM11306 ^ i3) * 31451) ^ 2077062579;
                        i5 = -466726438;
                    }
                    break;
                case -354743467:
                case 869305484:
                    this.f43959 = arrayList;
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = (C19806.m45029("ۢ۟") + i3) * (-9);
                        i4 = ((iM11306 ^ i2) * 30013) ^ (-455307556);
                        i5 = 1674667367;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ۠") ^ i2;
                        i4 = ((iM11306 ^ i3) * 6357) ^ (-916289583);
                        i5 = 818537888;
                    }
                    break;
                case -298940259:
                case 353259990:
                    if (C3660.m10791() != 0) {
                        iM11306 = (C19806.m45029("ۗ᩺") ^ i2) * (-39);
                        i4 = ((iM11306 ^ i3) * (-25219)) ^ 872969005;
                        i5 = 2139508785;
                    } else {
                        iM11306 = C19806.m45029("۠۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-13459)) ^ 914274450;
                        i5 = -208025008;
                    }
                    break;
                case -298635705:
                case 1432548430:
                    C3660.m10791();
                    RunnableC1606.m5473();
                    throw new RuntimeException();
                case -204092288:
                case 1112597556:
                    RunnableC1606.m5473();
                    C3722.m10894();
                    iM11306 = ThreadFactoryC3888.m11306("᩻ܺ") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-19545)) ^ (-481209681);
                    i5 = -884071038;
                    break;
                case -178440055:
                case -87575644:
                    arrayList = new ArrayList();
                    if (C3660.f13403 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-19545)) ^ (-481209681);
                        i5 = -884071038;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * 26035) ^ (-1008358982);
                        i5 = -1939207378;
                    }
                    break;
                case 380357833:
                case 2083494331:
                    C2642.m8171();
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۙۜ")) * 11;
                        i4 = ((iM11306 ^ i2) * 27825) ^ (-2143876790);
                        i5 = -266937680;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ܺ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-19545)) ^ (-481209681);
                        i5 = -884071038;
                    }
                    break;
                case 972899188:
                case 1264273344:
                    if (C7105.f23796 >= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۙۜ")) * 11;
                        i4 = ((iM11306 ^ i2) * 27825) ^ (-2143876790);
                        i5 = -266937680;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۨܿ")) * (-93);
                        i4 = ((iM11306 ^ i3) * 29903) ^ (-443999186);
                        i5 = -948150517;
                    }
                    break;
                case 1241509469:
                case 2143692741:
                    if (C2477.f9839 <= 0) {
                        iM11306 = (C19806.m45029("ۗ᩺") ^ i2) * (-39);
                        i4 = ((iM11306 ^ i3) * (-25219)) ^ 872969005;
                        i5 = 2139508785;
                    } else {
                        iM11306 = C19806.m45029("ܳܽ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-24559)) ^ 906799446;
                        i5 = 549435408;
                    }
                    break;
                case 1289986774:
                case 2045169168:
                    if (C0797.m3359()) {
                        iM11306 = (ThreadFactoryC3888.m11306("۬᩷") ^ i3) * 57;
                        i4 = ((iM11306 ^ i2) * 1681) ^ (-1401006810);
                        i5 = 1873718209;
                    } else {
                        iM11306 = (C19806.m45029("ۢ۟") + i3) * (-9);
                        i4 = ((iM11306 ^ i2) * 30013) ^ (-455307556);
                        i5 = 1674667367;
                    }
                    break;
                default:
                    if (C1461.f5957 <= 0) {
                        iM11306 = (C19806.m45029("ۗ᩺") ^ i2) * (-39);
                        i4 = ((iM11306 ^ i3) * (-25219)) ^ 872969005;
                        i5 = 2139508785;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫ۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22443)) ^ (-118515501);
                        i5 = -911612342;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static CharSequence m32680(boolean z) {
        int iM45029;
        int i;
        int i2;
        int i3;
        int iM11306;
        int i4;
        int i5;
        UnderlineSpan underlineSpan = null;
        int length = 0;
        int i6 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 1012769783;
        int i12 = C3577.f13150;
        int i13 = C7105.f23796;
        int iM450210 = (i13 - C19806.m45029("᩵ۤ")) * 115;
        int i14 = ((iM450210 ^ i12) * (-26995)) ^ (-569008504);
        int i15 = iM450210 ^ (-485837592);
        while (true) {
            SpannableString spannableString = null;
            while (true) {
                i11 = i15 ^ (i14 & (((i11 ^ i12) * 2517) >> 31));
                switch (i11) {
                    case -2019213431:
                    case 344624889:
                        C1875.m6086();
                        if (C3577.f13150 >= 0) {
                            int iM11307 = ThreadFactoryC3888.m11306("᩹᩸") ^ i13;
                            i15 = iM11307 ^ 288957351;
                            i14 = ((iM11307 ^ i12) * 8049) ^ (-1242315999);
                        } else {
                            length = length;
                            i6 = i6;
                            int iM11308 = ThreadFactoryC3888.m11306("ۙ֨") ^ i12;
                            i15 = iM11308 ^ 967047242;
                            i14 = ((iM11308 ^ i13) * (-6673)) ^ 331228724;
                            length = length;
                            i6 = i6;
                        }
                        break;
                    case -1833539750:
                    case -605351858:
                        if (C2704.m8255() <= 0) {
                            length = length;
                            i6 = i6;
                            int iM11309 = ThreadFactoryC3888.m11306("ۙ֨") ^ i12;
                            i15 = iM11309 ^ 967047242;
                            i14 = ((iM11309 ^ i13) * (-6673)) ^ 331228724;
                            length = length;
                            i6 = i6;
                        }
                        length = length;
                        i6 = i6;
                        spannableString = spannableString;
                        underlineSpan = underlineSpan;
                        iM45029 = ThreadFactoryC3888.m11306("᩵۟") ^ i13;
                        i = ((iM45029 ^ i12) * 3231) ^ (-1054274571);
                        i2 = -1187628181;
                        i3 = iM45029 ^ i2;
                        length = length;
                        i6 = i6;
                        SpannableString spannableString2 = spannableString;
                        i15 = i3;
                        i14 = i;
                        underlineSpan = underlineSpan;
                        spannableString = spannableString2;
                        break;
                    case -1601970864:
                    case 1648100487:
                        i10 = 8784;
                        iM45029 = ThreadFactoryC3888.m11306("ܶۗ") ^ i12;
                        i = ((iM45029 ^ i13) * (-6699)) ^ 725462826;
                        i2 = -221094961;
                        i3 = iM45029 ^ i2;
                        length = length;
                        i6 = i6;
                        SpannableString spannableString3 = spannableString;
                        i15 = i3;
                        i14 = i;
                        underlineSpan = underlineSpan;
                        spannableString = spannableString3;
                        break;
                    case -1581286415:
                    case 1934710094:
                        C0050.m946();
                        C1025.m3861();
                        return null;
                    case -1573002674:
                    case 1643430505:
                        length = length;
                        i6 = i6;
                        spannableString = spannableString;
                        underlineSpan = underlineSpan;
                        int i16 = i7 + i8;
                        i9 = i16 + i16;
                        s2 = 6337;
                        if (C0962.f3784) {
                            iM45029 = ThreadFactoryC3888.m11306("᩵۟") ^ i13;
                            i = ((iM45029 ^ i12) * 3231) ^ (-1054274571);
                            i2 = -1187628181;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("۫ᩳ") + i13) * 65;
                            i = ((iM45029 ^ i12) * 23033) ^ (-218717400);
                            i2 = -1057361733;
                        }
                        i3 = iM45029 ^ i2;
                        length = length;
                        i6 = i6;
                        SpannableString spannableString4 = spannableString;
                        i15 = i3;
                        i14 = i;
                        underlineSpan = underlineSpan;
                        spannableString = spannableString4;
                        break;
                    case -1555088532:
                    case -900842208:
                        length = length;
                        i6 = i6;
                        spannableString = spannableString;
                        underlineSpan = underlineSpan;
                        int i17 = s + s2;
                        if (i9 - (i17 * i17) >= 0) {
                            iM45029 = (i13 - ThreadFactoryC3888.m11306("֡۠")) * (-45);
                            i = ((iM45029 ^ i12) * 29479) ^ (-1497268862);
                            i2 = 239135991;
                        } else {
                            iM45029 = (C19806.m45029("᩸᩸") + i12) * 81;
                            i = ((iM45029 ^ i13) * (-14867)) ^ 1198115146;
                            i2 = -345608634;
                        }
                        i3 = iM45029 ^ i2;
                        length = length;
                        i6 = i6;
                        SpannableString spannableString5 = spannableString;
                        i15 = i3;
                        i14 = i;
                        underlineSpan = underlineSpan;
                        spannableString = spannableString5;
                        break;
                    case -1553046538:
                    case -714203137:
                        C1189.m4368();
                        C7105.m18985();
                        length = length;
                        i6 = i6;
                        spannableString = spannableString;
                        underlineSpan = underlineSpan;
                        iM45029 = ThreadFactoryC3888.m11306("᩵۟") ^ i13;
                        i = ((iM45029 ^ i12) * 3231) ^ (-1054274571);
                        i2 = -1187628181;
                        i3 = iM45029 ^ i2;
                        length = length;
                        i6 = i6;
                        SpannableString spannableString6 = spannableString;
                        i15 = i3;
                        i14 = i;
                        underlineSpan = underlineSpan;
                        spannableString = spannableString6;
                        break;
                    case -1192349302:
                    case 1763559260:
                        return spannableString;
                    case -1014526632:
                    case 1042710380:
                        length = length;
                        i6 = i6;
                        spannableString = spannableString;
                        underlineSpan = underlineSpan;
                        s = sArr[c];
                        if (!C0962.f3784) {
                            iM45029 = (ThreadFactoryC3888.m11306("֫ܶ") + i12) * 13;
                            i = ((iM45029 ^ i13) * 20081) ^ (-847700922);
                            i2 = -407354995;
                            i3 = iM45029 ^ i2;
                            length = length;
                            i6 = i6;
                            SpannableString spannableString7 = spannableString;
                            i15 = i3;
                            i14 = i;
                            underlineSpan = underlineSpan;
                            spannableString = spannableString7;
                        } else {
                            int iM113010 = ThreadFactoryC3888.m11306("ܶᩳ") ^ i12;
                            i15 = iM113010 ^ (-1907935913);
                            i14 = ((iM113010 ^ i13) * (-28841)) ^ (-195646041);
                            underlineSpan = underlineSpan;
                            length = length;
                            i6 = i6;
                        }
                        break;
                    case -999035542:
                    case 421683644:
                        SpannableString spannableString8 = spannableString;
                        spannableString8.setSpan(underlineSpan, 2, length, 17);
                        if (C1709.m5697()) {
                            iM11306 = ThreadFactoryC3888.m11306("ܺۛ") ^ i12;
                            i4 = ((iM11306 ^ i13) * 27807) ^ (-1307315777);
                            i5 = -839490406;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ᩳܿ") + i13) * (-83);
                            i4 = ((iM11306 ^ i12) * (-8745)) ^ (-1160985054);
                            i5 = -662567947;
                        }
                        spannableString = spannableString8;
                        i15 = iM11306 ^ i5;
                        i14 = i4;
                        i6 = 2;
                        break;
                    case -809657580:
                    case 1003350443:
                        length = length;
                        i6 = i6;
                        spannableString = spannableString;
                        underlineSpan = underlineSpan;
                        i7 = s * s;
                        i8 = 40157569;
                        if (C2332.m7079() > 0) {
                            iM45029 = (i12 - ThreadFactoryC3888.m11306("ᩴܺ")) * (-11);
                            i = ((iM45029 ^ i13) * 10439) ^ 415541813;
                            i2 = 950366232;
                            i3 = iM45029 ^ i2;
                            length = length;
                            i6 = i6;
                            SpannableString spannableString9 = spannableString;
                            i15 = i3;
                            i14 = i;
                            underlineSpan = underlineSpan;
                            spannableString = spannableString9;
                        } else {
                            int iM113011 = ThreadFactoryC3888.m11306("ܶᩳ") ^ i12;
                            i15 = iM113011 ^ (-1907935913);
                            i14 = ((iM113011 ^ i13) * (-28841)) ^ (-195646041);
                            underlineSpan = underlineSpan;
                            length = length;
                            i6 = i6;
                        }
                        break;
                    case -673068621:
                    case 278631685:
                        i10 = 11272;
                        iM45029 = ThreadFactoryC3888.m11306("ܶۗ") ^ i12;
                        i = ((iM45029 ^ i13) * (-6699)) ^ 725462826;
                        i2 = -221094961;
                        i3 = iM45029 ^ i2;
                        length = length;
                        i6 = i6;
                        SpannableString spannableString10 = spannableString;
                        i15 = i3;
                        i14 = i;
                        underlineSpan = underlineSpan;
                        spannableString = spannableString10;
                        break;
                    case -614581865:
                    case 1430845957:
                        RunnableC3388.m10064();
                        if (C2249.f8050 >= 0) {
                            i6 = i6;
                            spannableString = spannableString;
                            underlineSpan = underlineSpan;
                            int iM113012 = ThreadFactoryC3888.m11306("᩹᩵") ^ i13;
                            i = ((iM113012 ^ i12) * 24745) ^ 1757749364;
                            i3 = iM113012 ^ 1490124137;
                            i6 = i6;
                            SpannableString spannableString11 = spannableString;
                            i15 = i3;
                            i14 = i;
                            underlineSpan = underlineSpan;
                            spannableString = spannableString11;
                        }
                        length = length;
                        i6 = i6;
                        spannableString = spannableString;
                        underlineSpan = underlineSpan;
                        iM45029 = ThreadFactoryC3888.m11306("᩵۟") ^ i13;
                        i = ((iM45029 ^ i12) * 3231) ^ (-1054274571);
                        i2 = -1187628181;
                        i3 = iM45029 ^ i2;
                        length = length;
                        i6 = i6;
                        SpannableString spannableString12 = spannableString;
                        i15 = i3;
                        i14 = i;
                        underlineSpan = underlineSpan;
                        spannableString = spannableString12;
                        break;
                    case -486506330:
                    case -236031386:
                        spannableString = spannableString;
                        length = spannableString.length();
                        if (C2704.f10408) {
                            int iM113013 = (i12 - ThreadFactoryC3888.m11306("ܶۧ")) * (-57);
                            underlineSpan = underlineSpan;
                            i = ((iM113013 ^ i13) * 7741) ^ (-645606549);
                            i3 = iM113013 ^ 1275881412;
                        } else {
                            underlineSpan = underlineSpan;
                            i6 = i6;
                            int iM113014 = ThreadFactoryC3888.m11306("᩹᩵") ^ i13;
                            i = ((iM113014 ^ i12) * 24745) ^ 1757749364;
                            i3 = iM113014 ^ 1490124137;
                            i6 = i6;
                        }
                        SpannableString spannableString13 = spannableString;
                        i15 = i3;
                        i14 = i;
                        underlineSpan = underlineSpan;
                        spannableString = spannableString13;
                        break;
                    case 177473672:
                    case 1786802711:
                        length = length;
                        i6 = i6;
                        spannableString = spannableString;
                        underlineSpan = underlineSpan;
                        sArr = f43951;
                        c = 0;
                        if (C10634.f36300 < 0) {
                            iM45029 = C19806.m45029("֫ܿ") ^ i13;
                            i = ((iM45029 ^ i12) * (-19721)) ^ (-640509940);
                            i2 = -196961097;
                            i3 = iM45029 ^ i2;
                            length = length;
                            i6 = i6;
                            SpannableString spannableString14 = spannableString;
                            i15 = i3;
                            i14 = i;
                            underlineSpan = underlineSpan;
                            spannableString = spannableString14;
                        } else {
                            length = length;
                            int iM113015 = ThreadFactoryC3888.m11306("᩹᩵") ^ i13;
                            i = ((iM113015 ^ i12) * 24745) ^ 1757749364;
                            i3 = iM113015 ^ 1490124137;
                            i6 = i6;
                            SpannableString spannableString15 = spannableString;
                            i15 = i3;
                            i14 = i;
                            underlineSpan = underlineSpan;
                            spannableString = spannableString15;
                        }
                        break;
                    case 777223444:
                    case 1463533608:
                        return spannableString.subSequence(i6, spannableString.length());
                    default:
                        underlineSpan = underlineSpan;
                        String strM940 = z ? C0050.m940(f43951, 3, 2, i10) : C19806.m45020(f43951, 1, 2, i10);
                        short[] sArr2 = f43951;
                        if (C0671.f2816 == 0) {
                            i6 = i6;
                            int iM113016 = ThreadFactoryC3888.m11306(C1668.m5577(sArr2, 5, 3, i10));
                            if (C0629.m2907()) {
                                String strM6085 = C1875.m6085(iM113016 ^ 2116561982);
                                if (C0797.m3359()) {
                                    String strM9865 = ViewTreeObserverOnPreDrawListenerC3327.m9865(strM940, strM6085);
                                    if (!C0526.f2219) {
                                        SpannableString spannableString16 = new SpannableString(strM9865);
                                        underlineSpan = new UnderlineSpan();
                                        if (C1377.m4833() == 0) {
                                            int iM113017 = ThreadFactoryC3888.m11306("۫ۤ") ^ i13;
                                            i15 = 694421712 ^ iM113017;
                                            spannableString = spannableString16;
                                            i14 = ((iM113017 ^ i12) * 13303) ^ (-1241933197);
                                            length = length;
                                            i6 = i6;
                                            break;
                                        }
                                    }
                                } else {
                                    underlineSpan = underlineSpan;
                                }
                                int iM113018 = ThreadFactoryC3888.m11306("ۙ֨") ^ i12;
                                i15 = iM113018 ^ 967047242;
                                i14 = ((iM113018 ^ i13) * (-6673)) ^ 331228724;
                                length = length;
                                i6 = i6;
                                break;
                            }
                        } else {
                            i6 = i6;
                        }
                        int iM113019 = ThreadFactoryC3888.m11306("ܶᩳ") ^ i12;
                        i15 = iM113019 ^ (-1907935913);
                        i14 = ((iM113019 ^ i13) * (-28841)) ^ (-195646041);
                        underlineSpan = underlineSpan;
                        length = length;
                        i6 = i6;
                        break;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:164:0x0969 A[PHI: r3 r6 r12 r17 r18 r22 r23 r25 r27 r28 r30 r32 r33 r34 r35 r41 r43
      0x0969: PHI (r3v16 int) = (r3v3 int), (r3v9 int), (r3v17 int) binds: [B:163:0x0967, B:151:0x0877, B:19:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0969: PHI (r6v15 android.content.res.Resources) = (r6v3 android.content.res.Resources), (r6v8 android.content.res.Resources), (r6v16 android.content.res.Resources) binds: [B:163:0x0967, B:151:0x0877, B:19:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0969: PHI (r12v16 int) = (r12v4 int), (r12v9 int), (r12v17 int) binds: [B:163:0x0967, B:151:0x0877, B:19:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0969: PHI (r17v17 java.lang.String) = (r17v3 java.lang.String), (r17v8 java.lang.String), (r17v18 java.lang.String) binds: [B:163:0x0967, B:151:0x0877, B:19:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0969: PHI (r18v16 android.widget.TextView) = (r18v3 android.widget.TextView), (r18v8 android.widget.TextView), (r18v17 android.widget.TextView) binds: [B:163:0x0967, B:151:0x0877, B:19:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0969: PHI (r22v16 android.view.View) = (r22v3 android.view.View), (r22v8 android.view.View), (r22v17 android.view.View) binds: [B:163:0x0967, B:151:0x0877, B:19:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0969: PHI (r23v17 int) = (r23v3 int), (r23v8 int), (r23v18 int) binds: [B:163:0x0967, B:151:0x0877, B:19:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0969: PHI (r25v5 java.lang.String) = (r25v1 java.lang.String), (r25v2 java.lang.String), (r25v1 java.lang.String) binds: [B:163:0x0967, B:151:0x0877, B:19:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0969: PHI (r27v4 int) = (r27v1 int), (r27v1 int), (r27v5 int) binds: [B:163:0x0967, B:151:0x0877, B:19:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0969: PHI (r28v4 int) = (r28v1 int), (r28v1 int), (r28v5 int) binds: [B:163:0x0967, B:151:0x0877, B:19:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0969: PHI (r30v5 short) = (r30v2 short), (r30v1 short), (r30v1 short) binds: [B:163:0x0967, B:151:0x0877, B:19:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0969: PHI (r32v14 int) = (r32v2 int), (r32v7 int), (r32v15 int) binds: [B:163:0x0967, B:151:0x0877, B:19:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0969: PHI (r33v12 short[]) = (r33v1 short[]), (r33v6 short[]), (r33v13 short[]) binds: [B:163:0x0967, B:151:0x0877, B:19:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0969: PHI (r34v13 int) = (r34v2 int), (r34v7 int), (r3v2 int) binds: [B:163:0x0967, B:151:0x0877, B:19:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0969: PHI (r35v13 short[]) = (r35v1 short[]), (r35v6 short[]), (r35v14 short[]) binds: [B:163:0x0967, B:151:0x0877, B:19:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0969: PHI (r41v5 boolean) = (r41v1 boolean), (r41v2 boolean), (r41v1 boolean) binds: [B:163:0x0967, B:151:0x0877, B:19:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0969: PHI (r43v8 short) = (r43v2 short), (r43v1 short), (r43v1 short) binds: [B:163:0x0967, B:151:0x0877, B:19:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x0383 A[PHI: r8 r21 r32
      0x0383: PHI (r8v4 android.view.View) = (r8v3 android.view.View), (r8v1 android.view.View), (r8v1 android.view.View) binds: [B:76:0x036c, B:72:0x0332, B:59:0x029b] A[DONT_GENERATE, DONT_INLINE]
      0x0383: PHI (r21v6 l.ۚܺۘ) = (r21v1 l.ۚܺۘ), (r21v2 l.ۚܺۘ), (r21v1 l.ۚܺۘ) binds: [B:76:0x036c, B:72:0x0332, B:59:0x029b] A[DONT_GENERATE, DONT_INLINE]
      0x0383: PHI (r32v49 int) = (r32v45 int), (r32v47 int), (r32v51 int) binds: [B:76:0x036c, B:72:0x0332, B:59:0x029b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0137, code lost:
    
        if (l.ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) goto L26;
     */
    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m32688() {
        /*
            Method dump skipped, instruction units count: 2874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC13209.m32688():void");
    }

    /* JADX WARN: Code duplicated, block: B:56:0x021b A[PHI: r6
      0x021b: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:97:0x021b, B:55:0x0219, B:18:0x009d, B:15:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0257 A[PHI: r3 r7 r12 r13 r14
      0x0257: PHI (r3v4 l.۠ۡۜ) = (r3v3 l.۠ۡۜ), (r3v2 l.۠ۡۜ), (r3v2 l.۠ۡۜ), (r3v2 l.۠ۡۜ) binds: [B:59:0x0255, B:51:0x01f3, B:47:0x01cc, B:27:0x00e7] A[DONT_GENERATE, DONT_INLINE]
      0x0257: PHI (r7v5 java.lang.String) = (r7v2 java.lang.String), (r7v2 java.lang.String), (r7v4 java.lang.String), (r7v2 java.lang.String) binds: [B:59:0x0255, B:51:0x01f3, B:47:0x01cc, B:27:0x00e7] A[DONT_GENERATE, DONT_INLINE]
      0x0257: PHI (r12v4 short[]) = (r12v3 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:59:0x0255, B:51:0x01f3, B:47:0x01cc, B:27:0x00e7] A[DONT_GENERATE, DONT_INLINE]
      0x0257: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:59:0x0255, B:51:0x01f3, B:47:0x01cc, B:27:0x00e7] A[DONT_GENERATE, DONT_INLINE]
      0x0257: PHI (r14v4 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:59:0x0255, B:51:0x01f3, B:47:0x01cc, B:27:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32692() {
        int iM45029;
        int i;
        int i2;
        final ViewOnClickListenerC13209 viewOnClickListenerC13209 = this;
        int i3 = C2124.f7782;
        int i4 = C1460.f5948;
        int iM450210 = C19806.m45029("ۢ۫") ^ i4;
        int i5 = ((iM450210 ^ i3) * 27823) ^ (-264177395);
        TextView textView = null;
        String strM10423 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM450210 ^ 1869549613;
        int i7 = 0;
        int iM11306 = 0;
        int iM11307 = 0;
        DialogInterface.OnClickListener onClickListener = null;
        int i8 = 0;
        int i9 = 264735572;
        short s = 0;
        int i10 = 0;
        DialogInterfaceC19356 dialogInterfaceC19356M8239 = null;
        short[] sArr3 = null;
        C8067 c8067 = null;
        int i11 = 0;
        while (true) {
            i9 = i6 ^ (i5 & (((i9 ^ i3) * (-28121)) >> 31));
            switch (i9) {
                case -2087161061:
                case -539676257:
                    strM10423 = C3535.m10423(sArr3, BERTags.FLAGS, 3, i8);
                    if (C1461.f5957 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘۚ") ^ i4) * 17;
                        i = ((iM45029 ^ i3) * 11915) ^ 2106867263;
                        i2 = -1321475323;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۙۜ")) * 11;
                        i = ((iM45029 ^ i4) * (-27289)) ^ (-2053127094);
                        i2 = -1687160122;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -2083956561:
                case 1533499457:
                    int i12 = DialogInterfaceC19356.f62401;
                    c8067 = new C8067(viewOnClickListenerC13209);
                    sArr = f43951;
                    i11 = 221;
                    if (C3535.m10431() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘۚ") ^ i4) * 17;
                        i = ((iM45029 ^ i3) * 11915) ^ 2106867263;
                        i2 = -1321475323;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۛ") ^ i3;
                        i = ((iM45029 ^ i4) * 31603) ^ 1258383946;
                        i2 = -981362905;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1954985518:
                case -1018251501:
                    short s2 = f43951[220];
                    int i13 = s2 + 4313;
                    if (C3660.f13403 >= 0) {
                        s = s2;
                        i10 = i13;
                        iM45029 = (C19806.m45029("᩵֨") + i3) * 63;
                        i = ((iM45029 ^ i4) * (-31313)) ^ (-1396418797);
                        i2 = 1116381639;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM11308 = (i4 - ThreadFactoryC3888.m11306("ᩴᩴ")) * 67;
                        int i14 = ((iM11308 ^ i3) * (-2055)) ^ 1868369271;
                        i6 = iM11308 ^ (-1877263272);
                        s = s2;
                        i10 = i13;
                        i5 = i14;
                        viewOnClickListenerC13209 = this;
                    }
                    break;
                case -1941243773:
                case 1711128206:
                    dialogInterfaceC19356M8239 = C2704.m8239(c8067);
                    C23250.m51307(dialogInterfaceC19356M8239);
                    textView = (TextView) dialogInterfaceC19356M8239.m44364(R.id.message);
                    if (C2642.f10294 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۟ۚ") ^ i4;
                        i = ((iM45029 ^ i3) * (-24947)) ^ 1787786405;
                        i2 = 2116606626;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM11309 = (ThreadFactoryC3888.m11306("۟۫") + i4) * (-127);
                        i6 = iM11309 ^ (-738597963);
                        i5 = ((iM11309 ^ i3) * (-9713)) ^ 1986444166;
                        onClickListener = null;
                    }
                    break;
                case -1842238233:
                case 825520489:
                    C1189.m4368();
                    break;
                case -1807242511:
                case 1122915771:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (C19806.m45029("᩵֨") + i3) * 63;
                        i = ((iM45029 ^ i4) * (-31313)) ^ (-1396418797);
                        i2 = 1116381639;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM113010 = (ThreadFactoryC3888.m11306("۟۫") + i4) * (-127);
                        i6 = iM113010 ^ (-738597963);
                        i5 = ((iM113010 ^ i3) * (-9713)) ^ 1986444166;
                        onClickListener = null;
                    }
                    break;
                case -1726875241:
                case 557178701:
                    iM11307 = ThreadFactoryC3888.m11306(C0216.m1588(f43951, 230, 3, i8));
                    if (CallableC1627.f6528) {
                        iM45029 = C19806.m45029("᩹ۗ") ^ i4;
                        i = ((iM45029 ^ i3) * 21415) ^ 207532864;
                        i2 = 41382988;
                    } else {
                        iM45029 = (C19806.m45029("᩵֨") + i3) * 63;
                        i = ((iM45029 ^ i4) * (-31313)) ^ (-1396418797);
                        i2 = 1116381639;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1707178801:
                case 150524996:
                    InterfaceC22644 interfaceC22644M35579 = AbstractC14883.m35579(dialogInterfaceC19356M8239.m44363());
                    if (C2249.m6915() > 0) {
                        interfaceC22644M35579.mo47705(new C11798(true).m1041());
                        interfaceC22644M35579.build().mo20653(textView, C0817.m3407(C2704.m8247(textView)));
                    }
                    iM45029 = (ThreadFactoryC3888.m11306("ۘۚ") ^ i4) * 17;
                    i = ((iM45029 ^ i3) * 11915) ^ 2106867263;
                    i2 = -1321475323;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1626623018:
                case 596859109:
                    i8 = 24599;
                    iM45029 = (ThreadFactoryC3888.m11306("᩵ۢ") ^ i3) * (-87);
                    i = ((iM45029 ^ i4) * 6997) ^ 1432250542;
                    i2 = -656500135;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1306973687:
                case 1728853003:
                    iM11306 = ThreadFactoryC3888.m11306(C1937.m6288(sArr, i11, 3, i8));
                    if (C1460.f5948 >= 0) {
                        iM45029 = C19806.m45029("᩸᩸") ^ i3;
                        i = ((iM45029 ^ i4) * (-16659)) ^ 1240567159;
                        i2 = -441883156;
                    } else {
                        iM45029 = C19806.m45029("ᩳܿ") ^ i4;
                        i = ((iM45029 ^ i3) * 6721) ^ 1474117484;
                        i2 = -2118337022;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1273873935:
                case -429733244:
                    C10634.m26830(c8067, 2121942313 ^ iM11307, null);
                    iM45029 = ThreadFactoryC3888.m11306("᩹֡") ^ i3;
                    i = ((iM45029 ^ i4) * (-12565)) ^ 1166680042;
                    i2 = 308609741;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1217349860:
                case 106774128:
                    i8 = 19701;
                    iM45029 = (ThreadFactoryC3888.m11306("᩵ۢ") ^ i3) * (-87);
                    i = ((iM45029 ^ i4) * 6997) ^ 1432250542;
                    i2 = -656500135;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1194676930:
                case 220621334:
                    C2788.m8479(c8067, C19806.m45029(strM10423) ^ 2129746818);
                    if (C2788.f10625 < 0) {
                        onClickListener = new DialogInterface.OnClickListener() { // from class: l.ۛ᩷ۘ
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i15) {
                                int i16 = 1935910346;
                                int i17 = RunnableC1606.f6488;
                                int i18 = C0629.f2722;
                                int iM113011 = ThreadFactoryC3888.m11306("᩺۫") ^ i18;
                                int i19 = ((iM113011 ^ i17) * (-12191)) ^ 2066769746;
                                int i20 = 1794753951;
                                while (true) {
                                    i16 = ((((i16 ^ i17) * 5465) >> 31) & i19) ^ (iM113011 ^ i20);
                                    switch (i16) {
                                        case -1801153337:
                                        case 151054788:
                                            if (C3535.f13026 <= 0) {
                                                iM113011 = (i18 - ThreadFactoryC3888.m11306("ܰۚ")) * (-59);
                                                i19 = ((iM113011 ^ i17) * 27791) ^ 1095542124;
                                                i20 = 295140514;
                                            } else {
                                                iM113011 = (C19806.m45029("ۨ۟") + i17) * 89;
                                                i19 = ((iM113011 ^ i18) * 6645) ^ (-47807556);
                                                i20 = 1743798465;
                                            }
                                            break;
                                        case -1795641952:
                                        case -1784131062:
                                            C10634.m26820();
                                            if (C1025.f4800 >= 0) {
                                                iM113011 = (i17 - C19806.m45029("۬ۛ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                                i19 = ((iM113011 ^ i18) * (-4629)) ^ (-906333382);
                                                i20 = -2007158946;
                                            } else {
                                                iM113011 = C19806.m45029("ۖܺ") ^ i18;
                                                i19 = ((iM113011 ^ i17) * (-28927)) ^ 835593574;
                                                i20 = 2082796470;
                                            }
                                            break;
                                        case -1774652190:
                                        case -1501434481:
                                            if (C0962.f3784) {
                                                iM113011 = C19806.m45029("ۖܺ") ^ i18;
                                                i19 = ((iM113011 ^ i17) * (-28927)) ^ 835593574;
                                                i20 = 2082796470;
                                            } else {
                                                iM113011 = C19806.m45029("ۢ۟") ^ i17;
                                                i19 = ((iM113011 ^ i18) * (-8577)) ^ (-158989429);
                                                i20 = -761998220;
                                            }
                                            break;
                                        case -1557550255:
                                        case 740461185:
                                            if (C2124.f7782 <= 0) {
                                                iM113011 = C19806.m45029("ܶ᩵") ^ i18;
                                                i19 = ((iM113011 ^ i17) * (-27285)) ^ (-787767233);
                                                i20 = 806277459;
                                            } else {
                                                iM113011 = (ThreadFactoryC3888.m11306("֫᩸") + i17) * 5;
                                                i19 = ((iM113011 ^ i18) * (-27261)) ^ 1274174558;
                                                i20 = 177307548;
                                            }
                                            break;
                                        case -1515562363:
                                        case 854489036:
                                            if (C1937.m6279() >= 0) {
                                                iM113011 = (i18 - ThreadFactoryC3888.m11306("ܰۚ")) * (-59);
                                                i19 = ((iM113011 ^ i17) * 27791) ^ 1095542124;
                                                i20 = 295140514;
                                            } else {
                                                iM113011 = (C19806.m45029("ۚۡ") + i18) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                i19 = ((iM113011 ^ i17) * (-22273)) ^ (-290274184);
                                                i20 = 1940762520;
                                            }
                                            break;
                                        case -1513838795:
                                        case 2039820010:
                                            if (RunnableC0195.m1431()) {
                                                iM113011 = C19806.m45029("ۖ᩸") ^ i18;
                                                i19 = ((iM113011 ^ i17) * (-8831)) ^ (-1881154915);
                                                i20 = -588641761;
                                            } else {
                                                iM113011 = (i17 - C19806.m45029("۬ۛ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                                i19 = ((iM113011 ^ i18) * (-4629)) ^ (-906333382);
                                                i20 = -2007158946;
                                            }
                                            break;
                                        case -1284548149:
                                        case 1616165193:
                                            if (C1066.m4023() <= 0) {
                                                iM113011 = (i18 - ThreadFactoryC3888.m11306("ܰۚ")) * (-59);
                                                i19 = ((iM113011 ^ i17) * 27791) ^ 1095542124;
                                                i20 = 295140514;
                                            } else {
                                                iM113011 = (C19806.m45029("᩷ۢ") + i18) * (-35);
                                                i19 = ((iM113011 ^ i17) * (-20463)) ^ (-1181385055);
                                                i20 = -1137167094;
                                            }
                                            break;
                                        case -1137358154:
                                        case 593623144:
                                            RunnableC1606.m5473();
                                            RunnableC0195.m1431();
                                            break;
                                        case -813353799:
                                        case 1362690906:
                                            if (C10634.f36300 >= 0) {
                                                iM113011 = (i17 - C19806.m45029("ۜۨ")) * (-85);
                                                i19 = ((iM113011 ^ i18) * 19663) ^ (-1653378917);
                                                i20 = 1545587402;
                                            } else {
                                                iM113011 = ThreadFactoryC3888.m11306("ᩴ᩹") ^ i17;
                                                i19 = ((iM113011 ^ i18) * (-23157)) ^ (-1772416642);
                                                i20 = 2045537471;
                                            }
                                            break;
                                        case -508697451:
                                        case 25249038:
                                            C1398.m4895();
                                            iM113011 = C19806.m45029("ܶ᩵") ^ i18;
                                            i19 = ((iM113011 ^ i17) * (-27285)) ^ (-787767233);
                                            i20 = 806277459;
                                            break;
                                        case -344101639:
                                        case 638976899:
                                            if (C0278.f1572 <= 0) {
                                                iM113011 = C19806.m45029("ܶ᩵") ^ i18;
                                                i19 = ((iM113011 ^ i17) * (-27285)) ^ (-787767233);
                                                i20 = 806277459;
                                            } else {
                                                iM113011 = (i18 - ThreadFactoryC3888.m11306("֨۠")) * (-81);
                                                i19 = ((iM113011 ^ i17) * (-9425)) ^ 737183191;
                                                i20 = 1299975539;
                                            }
                                            break;
                                        case 94814774:
                                        case 207807557:
                                            ViewOnClickListenerC13209.m32687(this.f21318);
                                            break;
                                        case 427690309:
                                        case 1027858065:
                                            if (C3722.m10894() <= 0) {
                                                iM113011 = C19806.m45029("ۖܺ") ^ i18;
                                                i19 = ((iM113011 ^ i17) * (-28927)) ^ 835593574;
                                                i20 = 2082796470;
                                            } else {
                                                iM113011 = (C19806.m45029("ۛܳ") + i18) * 109;
                                                i19 = ((iM113011 ^ i17) * (-23617)) ^ (-931953348);
                                                i20 = -439297123;
                                            }
                                            break;
                                        case 1033304072:
                                        case 1867249750:
                                            C0962.m3746();
                                            if (!C3577.m10565()) {
                                                iM113011 = (i17 - C19806.m45029("ۜۨ")) * (-85);
                                                i19 = ((iM113011 ^ i18) * 19663) ^ (-1653378917);
                                                i20 = 1545587402;
                                            } else {
                                                iM113011 = C19806.m45029("ܶ᩵") ^ i18;
                                                i19 = ((iM113011 ^ i17) * (-27285)) ^ (-787767233);
                                                i20 = 806277459;
                                            }
                                            break;
                                        case 1139605163:
                                        case 1432789446:
                                            if (C0216.f1393 != 0) {
                                                iM113011 = C19806.m45029("ܶ᩵") ^ i18;
                                                i19 = ((iM113011 ^ i17) * (-27285)) ^ (-787767233);
                                                i20 = 806277459;
                                            } else {
                                                iM113011 = (ThreadFactoryC3888.m11306("ܰۜ") ^ i17) * 87;
                                                i19 = ((iM113011 ^ i18) * 9103) ^ 465930586;
                                                i20 = -495532763;
                                            }
                                            break;
                                        default:
                                            C1461.m5080();
                                            if (!C0817.f3443) {
                                                iM113011 = C19806.m45029("ۖܺ") ^ i18;
                                                i19 = ((iM113011 ^ i17) * (-28927)) ^ 835593574;
                                                i20 = 2082796470;
                                            } else {
                                                iM113011 = (i17 - C19806.m45029("ۜۨ")) * (-85);
                                                i19 = ((iM113011 ^ i18) * 19663) ^ (-1653378917);
                                                i20 = 1545587402;
                                            }
                                            break;
                                    }
                                    return;
                                }
                            }
                        };
                        sArr2 = f43951;
                        i7 = 227;
                        if (C1937.f7317 < 0) {
                            iM45029 = C19806.m45029("֡ۧ") ^ i4;
                            i = ((iM45029 ^ i3) * (-13931)) ^ (-180808465);
                            i2 = 468946208;
                            i6 = iM45029 ^ i2;
                            i5 = i;
                            break;
                        }
                    }
                    int iM113011 = (ThreadFactoryC3888.m11306("۟۫") + i4) * (-127);
                    i6 = iM113011 ^ (-738597963);
                    i5 = ((iM113011 ^ i3) * (-9713)) ^ 1986444166;
                    onClickListener = null;
                    break;
                case -1014041226:
                case 194999063:
                    if (C1977.f7413 <= 0) {
                        iM45029 = C19806.m45029("᩸᩸") ^ i3;
                        i = ((iM45029 ^ i4) * (-16659)) ^ 1240567159;
                        i2 = -441883156;
                    } else {
                        iM45029 = (C19806.m45029("ۛܿ") + i3) * 15;
                        i = ((iM45029 ^ i4) * (-18173)) ^ (-936081219);
                        i2 = 768601035;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -810351982:
                case 803623146:
                    C7105.m18985();
                    iM45029 = C19806.m45029("᩸᩸") ^ i3;
                    i = ((iM45029 ^ i4) * (-16659)) ^ 1240567159;
                    i2 = -441883156;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -626054875:
                case 1705574552:
                    C1377.m4836(c8067, 2129995272 ^ iM11306);
                    sArr3 = f43951;
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘۚ") ^ i4) * 17;
                        i = ((iM45029 ^ i3) * 11915) ^ 2106867263;
                        i2 = -1321475323;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֡ۘ") + i4) * 101;
                        i = ((iM45029 ^ i3) * (-14005)) ^ 871003850;
                        i2 = 587169214;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -521347366:
                case 849057381:
                    if (!C0817.f3443) {
                        iM45029 = C19806.m45029("᩸᩸") ^ i3;
                        i = ((iM45029 ^ i4) * (-16659)) ^ 1240567159;
                        i2 = -441883156;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    } else {
                        int iM113012 = (ThreadFactoryC3888.m11306("۟۫") + i4) * (-127);
                        i6 = iM113012 ^ (-738597963);
                        i5 = ((iM113012 ^ i3) * (-9713)) ^ 1986444166;
                        onClickListener = null;
                    }
                    break;
                case -1720848:
                case 1710147944:
                    C1460.m5055(c8067, ThreadFactoryC3888.m11306(RunnableC1895.m6164(sArr2, i7, 3, i8)) ^ 2124818991, onClickListener);
                    if (viewOnClickListenerC13209.f43958) {
                        iM45029 = (i3 - C19806.m45029("ۚܺ")) * (-101);
                        i = ((iM45029 ^ i4) * 23541) ^ (-1106593199);
                        i2 = 1458256478;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹֡") ^ i3;
                        i = ((iM45029 ^ i4) * (-12565)) ^ 1166680042;
                        i2 = 308609741;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    int i15 = (s * s) + 18601969;
                    if ((i15 + i15) - (i10 * i10) < 0) {
                        iM45029 = (i4 - C19806.m45029("᩷ۘ")) * (-59);
                        i = ((iM45029 ^ i3) * 5295) ^ (-1995611283);
                        i2 = 1277071340;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗ᩸") ^ i3;
                        i = ((iM45029 ^ i4) * 21221) ^ (-1025513536);
                        i2 = 1908823802;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 30281. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(android.os.Bundle r54) {
        /*
            Method dump skipped, instruction units count: 3028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC13209.onCreate(android.os.Bundle):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:88:0x03e3 A[PHI: r3 r4 r13 r17 r18 r20 r26
      0x03e3: PHI (r3v7 java.util.ArrayList) = (r3v2 java.util.ArrayList), (r3v2 java.util.ArrayList), (r3v3 java.util.ArrayList), (r3v2 java.util.ArrayList) binds: [B:87:0x03e1, B:76:0x0355, B:118:0x03e3, B:10:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x03e3: PHI (r4v7 int) = (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:87:0x03e1, B:76:0x0355, B:118:0x03e3, B:10:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x03e3: PHI (r13v41 short[]) = (r13v3 short[]), (r13v8 short[]), (r13v30 short[]), (r13v42 short[]) binds: [B:87:0x03e1, B:76:0x0355, B:118:0x03e3, B:10:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x03e3: PHI (r17v5 short) = (r17v3 short), (r17v2 short), (r17v2 short), (r17v2 short) binds: [B:87:0x03e1, B:76:0x0355, B:118:0x03e3, B:10:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x03e3: PHI (r18v5 int) = (r18v3 int), (r18v2 int), (r18v2 int), (r18v2 int) binds: [B:87:0x03e1, B:76:0x0355, B:118:0x03e3, B:10:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x03e3: PHI (r20v5 int) = (r20v2 int), (r20v3 int), (r20v2 int), (r20v2 int) binds: [B:87:0x03e1, B:76:0x0355, B:118:0x03e3, B:10:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x03e3: PHI (r26v38 java.lang.String) = (r26v2 java.lang.String), (r26v7 java.lang.String), (r26v27 java.lang.String), (r26v39 java.lang.String) binds: [B:87:0x03e1, B:76:0x0355, B:118:0x03e3, B:10:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public void m32690() {
        int iM45029;
        int i;
        int iM450210;
        int i2;
        int i3;
        int iM11306;
        int i4;
        int iM11307;
        int i5;
        int i6;
        ViewOnClickListenerC13209 viewOnClickListenerC13209 = this;
        int i7 = C1937.f7317;
        int i8 = C1419.f5860;
        int iM450211 = C19806.m45029("ܳۛ") ^ i7;
        int i9 = ((iM450211 ^ i8) * 10121) ^ (-45419522);
        ArrayList arrayList = null;
        Iterator itM9705 = null;
        C22381 c22381 = null;
        StringBuilder sb = null;
        String str = null;
        String strM6363 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i10 = iM450211 ^ 1847595218;
        LinearLayout linearLayout = null;
        int iM2304 = 0;
        boolean z = false;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        short s = 0;
        int i14 = 0;
        boolean z2 = false;
        int iM450212 = 0;
        boolean z3 = false;
        int i15 = -33649915;
        C14078 c14078 = null;
        int i16 = 0;
        while (true) {
            i15 = i10 ^ (i9 & (((i15 ^ i8) * 6171) >> 31));
            switch (i15) {
                case -2053340233:
                case -534821922:
                    str = str;
                    sArr = sArr;
                    s = f43951[67];
                    i14 = s * s;
                    if (C0216.f1393 != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿܶ") ^ i8) * (-125);
                        i9 = ((iM45029 ^ i7) * 9877) ^ 621639013;
                        i = -1760567553;
                    } else {
                        iM45029 = C19806.m45029("ۨۛ") ^ i8;
                        i9 = ((iM45029 ^ i7) * 19893) ^ 2129756081;
                        i = -834292925;
                    }
                    sArr = sArr;
                    str = str;
                    i10 = iM45029 ^ i;
                    viewOnClickListenerC13209 = this;
                    break;
                case -1962141855:
                case 1554257092:
                    str = str;
                    c22381 = (C22381) C0278.m1776(itM9705);
                    if (z3) {
                        iM11306 = C19806.m45029("۠ۢ") ^ i7;
                        i2 = ((iM11306 ^ i8) * (-28039)) ^ (-1541633612);
                        i4 = -1381426849;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ۠") ^ i8;
                        i2 = ((iM11306 ^ i7) * 12397) ^ (-1799393282);
                        i4 = -2032742613;
                    }
                    i6 = iM11306 ^ i4;
                    str = str;
                    i10 = i6;
                    i9 = i2;
                    break;
                case -1777079017:
                case 855956453:
                    MenuItemOnMenuItemClickListenerC3244.m9704((TextView) C2332.m7083(viewOnClickListenerC13209, ThreadFactoryC3888.m11306(strM6363) ^ 2100386375), viewOnClickListenerC13209.f43960.f18785);
                    break;
                case -1683422806:
                case 1665561649:
                    C1148.m4223(sb, C3577.m10571(sArr2, i16, 2, i13));
                    c14078.m34058(C0817.m3407(sb));
                    str = c22381.f73080;
                    if (C0817.f3443) {
                        iM11307 = ThreadFactoryC3888.m11306("ۖᩴ") ^ i8;
                        i2 = ((iM11307 ^ i7) * 25391) ^ 1761480948;
                        i5 = -1151965109;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("᩺᩸") ^ i8;
                        i2 = ((iM11307 ^ i7) * (-11093)) ^ 470659119;
                        i5 = -1881736724;
                    }
                    i10 = iM11307 ^ i5;
                    i9 = i2;
                    break;
                case -1640167754:
                case -1242043915:
                    str = str;
                    ((C14078) C3286.m9796(arrayList, i11)).m34059(z);
                    m32684();
                    sArr = f43951;
                    if (C1668.f6641 < 0) {
                        iM11306 = (i8 - ThreadFactoryC3888.m11306("᩵۬")) * (-127);
                        i2 = ((iM11306 ^ i7) * 18039) ^ (-1294290421);
                        i4 = -121447044;
                        i6 = iM11306 ^ i4;
                        str = str;
                        i10 = i6;
                        i9 = i2;
                    }
                    str = str;
                    iM11307 = ThreadFactoryC3888.m11306("᩺᩸") ^ i8;
                    i2 = ((iM11307 ^ i7) * (-11093)) ^ 470659119;
                    i5 = -1881736724;
                    i10 = iM11307 ^ i5;
                    i9 = i2;
                    break;
                case -991677110:
                case 1497871062:
                    i13 = 42205;
                    iM45029 = C19806.m45029("ܺᩳ") ^ i7;
                    i9 = ((iM45029 ^ i8) * 14871) ^ (-538676186);
                    i = 379981091;
                    sArr = sArr;
                    str = str;
                    i10 = iM45029 ^ i;
                    viewOnClickListenerC13209 = this;
                    break;
                case -896865028:
                case -599833428:
                    str = str;
                    sArr = sArr;
                    linearLayout = (LinearLayout) C2332.m7083(viewOnClickListenerC13209, iM450212 ^ 2130240868);
                    if (!C3286.f12186) {
                        iM450210 = C19806.m45029("᩷֨") ^ i8;
                        i2 = ((iM450210 ^ i7) * 30219) ^ 1573556384;
                        i3 = -678135764;
                        i6 = iM450210 ^ i3;
                        sArr = sArr;
                        str = str;
                        i10 = i6;
                        i9 = i2;
                    } else {
                        sArr = sArr;
                        str = str;
                        iM11307 = ThreadFactoryC3888.m11306("᩺᩸") ^ i8;
                        i2 = ((iM11307 ^ i7) * (-11093)) ^ 470659119;
                        i5 = -1881736724;
                        i10 = iM11307 ^ i5;
                        i9 = i2;
                    }
                    break;
                case -779264228:
                case -703883174:
                    str = str;
                    C0817.m3408(sb, i12);
                    sArr2 = f43951;
                    i16 = 74;
                    if (C2249.f8050 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿۘ") + i7) * (-47);
                        i2 = ((iM11306 ^ i8) * (-25735)) ^ (-1971669835);
                        i4 = -731602075;
                    } else {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("۬۟")) * (-93);
                        i2 = ((iM11306 ^ i8) * 7099) ^ (-1151008825);
                        i4 = -948909180;
                    }
                    i6 = iM11306 ^ i4;
                    str = str;
                    i10 = i6;
                    i9 = i2;
                    break;
                case -688079362:
                case 1109169758:
                    C1461.m5080();
                    C0050.m946();
                    break;
                case -591338566:
                case 1059765177:
                    str = str;
                    sArr = sArr;
                    i11 = 0;
                    if (C0962.m3748(itM9705)) {
                        iM450210 = (C19806.m45029("᩸ۜ") + i7) * (-23);
                        i2 = ((iM450210 ^ i8) * (-12789)) ^ (-640627900);
                        i3 = 1523255896;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("᩺ۧ") + i7) * 25;
                        i2 = ((iM450210 ^ i8) * 23181) ^ 254792051;
                        i3 = -1336958337;
                    }
                    i6 = iM450210 ^ i3;
                    sArr = sArr;
                    str = str;
                    i10 = i6;
                    i9 = i2;
                    break;
                case -474592177:
                case 468018890:
                    str = str;
                    sArr = sArr;
                    if ((i14 + 273968704) - (33104 * s) < 0) {
                        iM45029 = C19806.m45029("᩹ᩳ") ^ i8;
                        i9 = ((iM45029 ^ i7) * 25587) ^ (-1778844725);
                        i = -1931152202;
                    } else {
                        iM45029 = C19806.m45029("ۤ۬") ^ i7;
                        i9 = ((iM45029 ^ i8) * 23467) ^ 1074875362;
                        i = 284544850;
                    }
                    sArr = sArr;
                    str = str;
                    i10 = iM45029 ^ i;
                    viewOnClickListenerC13209 = this;
                    break;
                case -455764330:
                case -573025:
                    str = str;
                    sArr = sArr;
                    strM6363 = C1977.m6363(sArr, 71, 3, i13);
                    if (C2124.m6673() <= 0) {
                        iM450210 = ThreadFactoryC3888.m11306("۠ۧ") ^ i8;
                        i2 = ((iM450210 ^ i7) * (-31777)) ^ 807012723;
                        i3 = -2039407211;
                    } else {
                        iM450210 = (i8 - C19806.m45029("ᩳ᩶")) * (-13);
                        i2 = ((iM450210 ^ i7) * (-15181)) ^ (-573478822);
                        i3 = 336503856;
                    }
                    i6 = iM450210 ^ i3;
                    sArr = sArr;
                    str = str;
                    i10 = i6;
                    i9 = i2;
                    break;
                case -323511703:
                case 1175826480:
                    z2 = false;
                    iM11306 = (C19806.m45029("ۗ᩶") ^ i7) * 93;
                    i2 = ((iM11306 ^ i8) * 14509) ^ (-968440471);
                    i4 = 1388403627;
                    i6 = iM11306 ^ i4;
                    str = str;
                    i10 = i6;
                    i9 = i2;
                    break;
                case -247132639:
                case -35355272:
                    str = str;
                    c14078 = new C14078(viewOnClickListenerC13209);
                    sb = new StringBuilder();
                    i12 = c22381.f73081;
                    if (C0050.f912 > 0) {
                        iM11306 = C19806.m45029("۫᩵") ^ i8;
                        i2 = ((iM11306 ^ i7) * (-1987)) ^ (-270305521);
                        i4 = 61563338;
                        i6 = iM11306 ^ i4;
                        str = str;
                        i10 = i6;
                        i9 = i2;
                    }
                    sArr = sArr;
                    iM450210 = ThreadFactoryC3888.m11306("۠ۧ") ^ i8;
                    i2 = ((iM450210 ^ i7) * (-31777)) ^ 807012723;
                    i3 = -2039407211;
                    i6 = iM450210 ^ i3;
                    sArr = sArr;
                    str = str;
                    i10 = i6;
                    i9 = i2;
                    break;
                case -79075657:
                case 292545120:
                    i13 = 48280;
                    iM45029 = C19806.m45029("ܺᩳ") ^ i7;
                    i9 = ((iM45029 ^ i8) * 14871) ^ (-538676186);
                    i = 379981091;
                    sArr = sArr;
                    str = str;
                    i10 = iM45029 ^ i;
                    viewOnClickListenerC13209 = this;
                    break;
                case -48594377:
                case 704252403:
                    str = str;
                    sArr = sArr;
                    m32688();
                    iM450212 = C19806.m45029(C0629.m2906(f43951, 68, 3, i13));
                    if (C2642.m8171() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿܶ") ^ i8) * (-125);
                        i9 = ((iM45029 ^ i7) * 9877) ^ 621639013;
                        i = -1760567553;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۬֨") + i7) * 99;
                        i9 = ((iM45029 ^ i8) * (-3405)) ^ 1863170115;
                        i = -524519257;
                    }
                    sArr = sArr;
                    str = str;
                    i10 = iM45029 ^ i;
                    viewOnClickListenerC13209 = this;
                    break;
                case 37178183:
                case 1248009637:
                    str = str;
                    sArr = sArr;
                    arrayList = viewOnClickListenerC13209.f43959;
                    MenuItemOnMenuItemClickListenerC3244.m9710(arrayList);
                    linearLayout.removeAllViews();
                    iM2304 = AbstractC0464.m2304(16.0f);
                    if (C2704.m8255() > 0) {
                        iM450210 = ThreadFactoryC3888.m11306("ܺۘ") ^ i8;
                        i2 = ((iM450210 ^ i7) * 23057) ^ 1044718959;
                        i3 = -1522273749;
                        i6 = iM450210 ^ i3;
                        sArr = sArr;
                        str = str;
                        i10 = i6;
                        i9 = i2;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿܶ") ^ i8) * (-125);
                        i9 = ((iM45029 ^ i7) * 9877) ^ 621639013;
                        i = -1760567553;
                        sArr = sArr;
                        str = str;
                        i10 = iM45029 ^ i;
                        viewOnClickListenerC13209 = this;
                    }
                    break;
                case 395126876:
                case 1400248877:
                    linearLayout.addView(new Space(viewOnClickListenerC13209), iM2304, z ? 1 : 0);
                    z2 = z3;
                    iM11306 = (C19806.m45029("ۗ᩶") ^ i7) * 93;
                    i2 = ((iM11306 ^ i8) * 14509) ^ (-968440471);
                    i4 = 1388403627;
                    i6 = iM11306 ^ i4;
                    str = str;
                    i10 = i6;
                    i9 = i2;
                    break;
                case 660908920:
                case 1546623535:
                    C19806.m45024();
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        str = str;
                        sArr = sArr;
                        iM450210 = ThreadFactoryC3888.m11306("۠ۧ") ^ i8;
                        i2 = ((iM450210 ^ i7) * (-31777)) ^ 807012723;
                        i3 = -2039407211;
                        i6 = iM450210 ^ i3;
                        sArr = sArr;
                        str = str;
                        i10 = i6;
                        i9 = i2;
                    }
                    iM11307 = C19806.m45029("ۢۨ") ^ i7;
                    i2 = ((iM11307 ^ i8) * (-31853)) ^ 617130531;
                    i5 = -1449115787;
                    i10 = iM11307 ^ i5;
                    i9 = i2;
                    break;
                case 1124883563:
                case 1406257384:
                    C1377.m4833();
                    iM11307 = C19806.m45029("ۢۨ") ^ i7;
                    i2 = ((iM11307 ^ i8) * (-31853)) ^ 617130531;
                    i5 = -1449115787;
                    i10 = iM11307 ^ i5;
                    i9 = i2;
                    break;
                case 1517666216:
                case 1685336036:
                    if (!C3577.m10565()) {
                        str = str;
                        iM11306 = (ThreadFactoryC3888.m11306("ܿۘ") + i7) * (-47);
                        i2 = ((iM11306 ^ i8) * (-25735)) ^ (-1971669835);
                        i4 = -731602075;
                        i6 = iM11306 ^ i4;
                        str = str;
                        i10 = i6;
                        i9 = i2;
                    } else {
                        str = str;
                        sArr = sArr;
                        iM45029 = (ThreadFactoryC3888.m11306("ܿܶ") ^ i8) * (-125);
                        i9 = ((iM45029 ^ i7) * 9877) ^ 621639013;
                        i = -1760567553;
                        sArr = sArr;
                        str = str;
                        i10 = iM45029 ^ i;
                        viewOnClickListenerC13209 = this;
                    }
                    break;
                case 1626786233:
                case 1893932431:
                    itM9705 = MenuItemOnMenuItemClickListenerC3244.m9705(viewOnClickListenerC13209.f43960.f18786);
                    z = true;
                    z3 = true;
                    iM450210 = (C19806.m45029("ܶۨ") + i7) * 53;
                    i2 = ((iM450210 ^ i8) * (-32115)) ^ (-1315917154);
                    i3 = 318039697;
                    i6 = iM450210 ^ i3;
                    sArr = sArr;
                    str = str;
                    i10 = i6;
                    i9 = i2;
                    break;
                case 1861652335:
                case 1977190908:
                    c14078.m34062(str);
                    c14078.m34065(c22381.f73078);
                    c14078.m34066(c22381.f73082);
                    C2332.m7086(c14078, c22381);
                    if (!C0526.f2219) {
                        C1668.m5573(linearLayout, c14078, new LinearLayout.LayoutParams(i11, -2, 1.0f));
                        C3660.m10788(arrayList, c14078);
                        C1937.m6291(c14078, viewOnClickListenerC13209);
                        z3 = z2;
                        iM450210 = (C19806.m45029("ܶۨ") + i7) * 53;
                        i2 = ((iM450210 ^ i8) * (-32115)) ^ (-1315917154);
                        i3 = 318039697;
                        i6 = iM450210 ^ i3;
                        sArr = sArr;
                        str = str;
                        i10 = i6;
                        i9 = i2;
                    } else {
                        str = str;
                        sArr = sArr;
                        iM45029 = (ThreadFactoryC3888.m11306("ܿܶ") ^ i8) * (-125);
                        i9 = ((iM45029 ^ i7) * 9877) ^ 621639013;
                        i = -1760567553;
                        sArr = sArr;
                        str = str;
                        i10 = iM45029 ^ i;
                        viewOnClickListenerC13209 = this;
                    }
                    break;
                default:
                    RunnableC1895.m6170();
                    if (C10634.f36300 >= 0) {
                        str = str;
                        sArr = sArr;
                        iM45029 = (ThreadFactoryC3888.m11306("ܿܶ") ^ i8) * (-125);
                        i9 = ((iM45029 ^ i7) * 9877) ^ 621639013;
                        i = -1760567553;
                        sArr = sArr;
                        str = str;
                        i10 = iM45029 ^ i;
                        viewOnClickListenerC13209 = this;
                    } else {
                        iM11307 = C19806.m45029("ۢۨ") ^ i7;
                        i2 = ((iM11307 ^ i8) * (-31853)) ^ 617130531;
                        i5 = -1449115787;
                        i10 = iM11307 ^ i5;
                        i9 = i2;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0173 A[PHI: r3 r11 r12 r13
      0x0173: PHI (r3v4 int) = (r3v3 int), (r3v2 int), (r3v2 int) binds: [B:39:0x0171, B:35:0x014b, B:27:0x00ee] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r11v3 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v4 short[]) binds: [B:39:0x0171, B:35:0x014b, B:27:0x00ee] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r12v3 int) = (r12v2 int), (r12v2 int), (r12v4 int) binds: [B:39:0x0171, B:35:0x014b, B:27:0x00ee] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v4 int) binds: [B:39:0x0171, B:35:0x014b, B:27:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m32689(ViewOnClickListenerC13209 viewOnClickListenerC13209) {
        int i;
        int i2;
        int i3;
        short s;
        int iM11306;
        int i4;
        int i5;
        int iM11307;
        int i6;
        int iM11308;
        int i7;
        int i8;
        ViewOnClickListenerC13209 viewOnClickListenerC132010 = viewOnClickListenerC13209;
        int i9 = ThreadFactoryC3888.f14547;
        int i10 = C3722.f13525;
        int iM11309 = ThreadFactoryC3888.m11306("᩻ܺ") ^ i9;
        int i11 = ((iM11309 ^ i10) * 31109) ^ (-533151723);
        ViewOnLongClickListenerC0856 viewOnLongClickListenerC0856 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i12 = iM11309 ^ (-224732552);
        C4741 c4741 = null;
        int iM113010 = 0;
        int iM45029 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        short s2 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 1804149772;
        int i23 = 0;
        ViewOnClickListenerC17587 viewOnClickListenerC17587 = null;
        int i24 = 0;
        while (true) {
            i22 = i12 ^ (i11 & (((i22 ^ i10) * 25389) >> 31));
            switch (i22) {
                case -1899836048:
                case 400805411:
                    break;
                case -1527092125:
                case 2129595955:
                    i2 = i23;
                    s2 = f43951[60];
                    if (C1189.f5284 > 0) {
                        int iM113011 = ThreadFactoryC3888.m11306("ۗۘ") ^ i9;
                        i11 = ((iM113011 ^ i10) * (-12021)) ^ (-835099197);
                        i3 = iM113011 ^ (-504105960);
                        i23 = i2;
                        i12 = i3;
                        viewOnClickListenerC132010 = viewOnClickListenerC13209;
                    } else {
                        i23 = i2;
                        int iM113012 = ThreadFactoryC3888.m11306("ܶۢ") ^ i10;
                        i11 = ((iM113012 ^ i9) * (-26073)) ^ (-1659760600);
                        i12 = iM113012 ^ (-1658989127);
                        viewOnClickListenerC132010 = viewOnClickListenerC13209;
                    }
                    break;
                case -1374113784:
                case 1644999067:
                    C0817.m3399();
                    s = s2;
                    i = i23;
                    iM11308 = ThreadFactoryC3888.m11306("ۘۡ") ^ i9;
                    s2 = s;
                    i7 = ((iM11308 ^ i10) * 30543) ^ 658454882;
                    i8 = 2010144251;
                    i12 = iM11308 ^ i8;
                    i23 = i;
                    i11 = i7;
                    viewOnClickListenerC132010 = viewOnClickListenerC13209;
                    break;
                case -1331474250:
                case -224735473:
                    i17 = 58121;
                    iM11306 = ThreadFactoryC3888.m11306("ۚܳ") ^ i10;
                    i4 = ((iM11306 ^ i9) * 16385) ^ (-1447782056);
                    i5 = -757684300;
                    i12 = iM11306 ^ i5;
                    viewOnClickListenerC132010 = viewOnClickListenerC13209;
                    i23 = i23;
                    i11 = i4;
                    break;
                case -1294413698:
                case 1960277971:
                    i23 = i23;
                    i19 = i18 * i18;
                    i20 = s2 * s2;
                    i21 = 376903396;
                    if (RunnableC1895.f7152) {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("᩷ۤ")) * 55;
                        i4 = ((iM11306 ^ i9) * (-31459)) ^ (-587555584);
                        i5 = 1099722555;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫۟") ^ i9;
                        i4 = ((iM11306 ^ i10) * 9407) ^ 878040485;
                        i5 = 879725835;
                    }
                    i12 = iM11306 ^ i5;
                    viewOnClickListenerC132010 = viewOnClickListenerC13209;
                    i23 = i23;
                    i11 = i4;
                    break;
                case -1276814399:
                case 1705985083:
                    i = i23;
                    iM45029 = C19806.m45029(C10634.m26821(sArr, i, i14, i17));
                    if (C3535.f13026 <= 0) {
                        s = s2;
                        i13 = 2100482200;
                        iM11308 = ThreadFactoryC3888.m11306("ۘۡ") ^ i9;
                        s2 = s;
                        i7 = ((iM11308 ^ i10) * 30543) ^ 658454882;
                        i8 = 2010144251;
                        i12 = iM11308 ^ i8;
                        i23 = i;
                        i11 = i7;
                        viewOnClickListenerC132010 = viewOnClickListenerC13209;
                    } else {
                        int iM450210 = (C19806.m45029("ܿۘ") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i23 = i;
                        i11 = ((iM450210 ^ i10) * 30681) ^ 1322457550;
                        i12 = iM450210 ^ (-1389291266);
                        i13 = 2100482200;
                    }
                    break;
                case -1228576450:
                case -324410603:
                    viewOnClickListenerC17587 = new ViewOnClickListenerC17587(viewOnClickListenerC132010, 0);
                    viewOnLongClickListenerC0856 = null;
                    if (C2477.f9839 <= 0) {
                        iM11307 = C19806.m45029("᩶֨") ^ i10;
                        i4 = ((iM11307 ^ i9) * 6557) ^ (-1556583041);
                        i6 = 1324278616;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("۟ܳ") + i10) * (-39);
                        i4 = ((iM11307 ^ i9) * (-22365)) ^ 257543483;
                        i6 = 2140694493;
                    }
                    i12 = iM11307 ^ i6;
                    i11 = i4;
                    break;
                case -1215257347:
                case -169402485:
                    i = i23;
                    s = s2;
                    int i25 = s + 19414;
                    if (!C3286.f12186) {
                        s2 = s;
                        int iM450211 = C19806.m45029("ۧۤ") ^ i10;
                        i2 = i;
                        i11 = ((iM450211 ^ i9) * (-21861)) ^ 305995132;
                        i3 = iM450211 ^ 1370070228;
                        i18 = i25;
                        i23 = i2;
                        i12 = i3;
                        viewOnClickListenerC132010 = viewOnClickListenerC13209;
                    } else {
                        i18 = i25;
                        iM11308 = ThreadFactoryC3888.m11306("ۘۡ") ^ i9;
                        s2 = s;
                        i7 = ((iM11308 ^ i10) * 30543) ^ 658454882;
                        i8 = 2010144251;
                        i12 = iM11308 ^ i8;
                        i23 = i;
                        i11 = i7;
                        viewOnClickListenerC132010 = viewOnClickListenerC13209;
                    }
                    break;
                case -1201470449:
                case -209643463:
                    C0817.m3399();
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        s = s2;
                        i = i23;
                        iM11308 = ThreadFactoryC3888.m11306("ۘۡ") ^ i9;
                        s2 = s;
                        i7 = ((iM11308 ^ i10) * 30543) ^ 658454882;
                        i8 = 2010144251;
                        i12 = iM11308 ^ i8;
                        i23 = i;
                        i11 = i7;
                        viewOnClickListenerC132010 = viewOnClickListenerC13209;
                    } else {
                        iM11307 = C19806.m45029("᩶֨") ^ i10;
                        i4 = ((iM11307 ^ i9) * 6557) ^ (-1556583041);
                        i6 = 1324278616;
                        i12 = iM11307 ^ i6;
                        i11 = i4;
                    }
                    break;
                case -1046111728:
                case -294019210:
                    c4741.m40336(i24);
                    c4741.m40340();
                    if (C3743.m10966() <= 0) {
                        iM11307 = (C19806.m45029("ۧ᩺") + i9) * (-17);
                        i4 = ((iM11307 ^ i10) * 21869) ^ (-281748627);
                        i6 = 2051589195;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ۜ᩻") ^ i10) * 25;
                        i4 = ((iM11307 ^ i9) * (-32367)) ^ 1158447202;
                        i6 = 1170917416;
                    }
                    i12 = iM11307 ^ i6;
                    i11 = i4;
                    break;
                case -1007226693:
                case 446996402:
                    c4741.m40376(iM45029 ^ i13);
                    c4741.m40356();
                    i24 = 6;
                    if (C7105.f23796 >= 0) {
                        iM11307 = (C19806.m45029("ۧ᩺") + i9) * (-17);
                        i4 = ((iM11307 ^ i10) * 21869) ^ (-281748627);
                        i6 = 2051589195;
                    } else {
                        iM11307 = (C19806.m45029("۫᩻") + i9) * (-33);
                        i4 = ((iM11307 ^ i10) * 8161) ^ 59155440;
                        i6 = 863353338;
                    }
                    i12 = iM11307 ^ i6;
                    i11 = i4;
                    break;
                case -350642684:
                case 1898211817:
                    iM113010 = 2098552261 ^ ThreadFactoryC3888.m11306(C19806.m45020(sArr2, i15, i16, i17));
                    if (C7105.f23796 < 0) {
                        iM11307 = C19806.m45029("ܺ֡") ^ i10;
                        i4 = ((iM11307 ^ i9) * (-29285)) ^ (-1966061252);
                        i6 = 96606876;
                        i12 = iM11307 ^ i6;
                        i11 = i4;
                    } else {
                        s = s2;
                        i = i23;
                        iM11308 = ThreadFactoryC3888.m11306("ۘۡ") ^ i9;
                        s2 = s;
                        i7 = ((iM11308 ^ i10) * 30543) ^ 658454882;
                        i8 = 2010144251;
                        i12 = iM11308 ^ i8;
                        i23 = i;
                        i11 = i7;
                        viewOnClickListenerC132010 = viewOnClickListenerC13209;
                    }
                    break;
                case -210181410:
                case 1691747390:
                    i17 = 20984;
                    iM11306 = ThreadFactoryC3888.m11306("ۚܳ") ^ i10;
                    i4 = ((iM11306 ^ i9) * 16385) ^ (-1447782056);
                    i5 = -757684300;
                    i12 = iM11306 ^ i5;
                    viewOnClickListenerC132010 = viewOnClickListenerC13209;
                    i23 = i23;
                    i11 = i4;
                    break;
                case 369460792:
                case 958077522:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (C1148.f5161 > 0) {
                        s = s2;
                        i = i23;
                        iM11308 = ThreadFactoryC3888.m11306("ۘۡ") ^ i9;
                        s2 = s;
                        i7 = ((iM11308 ^ i10) * 30543) ^ 658454882;
                        i8 = 2010144251;
                        i12 = iM11308 ^ i8;
                        i23 = i;
                        i11 = i7;
                    } else {
                        int iM113013 = ThreadFactoryC3888.m11306("ܶۢ") ^ i10;
                        i11 = ((iM113013 ^ i9) * (-26073)) ^ (-1659760600);
                        i12 = iM113013 ^ (-1658989127);
                    }
                    viewOnClickListenerC132010 = viewOnClickListenerC13209;
                    break;
                case 549243105:
                case 778745758:
                    c4741.m40343(iM113010, viewOnClickListenerC17587, viewOnLongClickListenerC0856);
                    c4741.m40368(false);
                    i = i23;
                    iM11308 = ThreadFactoryC3888.m11306("ܶ᩺") ^ i10;
                    i7 = ((iM11308 ^ i9) * (-9691)) ^ (-743438895);
                    i8 = 849150973;
                    i12 = iM11308 ^ i8;
                    i23 = i;
                    i11 = i7;
                    viewOnClickListenerC132010 = viewOnClickListenerC13209;
                    break;
                case 565382390:
                case 913086669:
                    C3577.m10565();
                    C2704.m8255();
                    break;
                case 730925955:
                case 1289760112:
                    i23 = i23;
                    int i26 = i20 + i21;
                    if (i19 - (i26 + i26) > 0) {
                        iM11306 = C19806.m45029("ۧۡ") ^ i9;
                        i4 = ((iM11306 ^ i10) * 20805) ^ (-986477324);
                        i5 = -1524911104;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟ۗ") ^ i9;
                        i4 = ((iM11306 ^ i10) * (-21309)) ^ 1272127787;
                        i5 = -1527144749;
                    }
                    i12 = iM11306 ^ i5;
                    viewOnClickListenerC132010 = viewOnClickListenerC13209;
                    i23 = i23;
                    i11 = i4;
                    break;
                case 760413660:
                case 1863829979:
                    c4741 = new C4741(viewOnClickListenerC132010, viewOnClickListenerC132010);
                    sArr = f43951;
                    i23 = 61;
                    i14 = 3;
                    if (!C3743.f13569) {
                        int iM113014 = ThreadFactoryC3888.m11306("ܶۢ") ^ i10;
                        i11 = ((iM113014 ^ i9) * (-26073)) ^ (-1659760600);
                        i12 = iM113014 ^ (-1658989127);
                        viewOnClickListenerC132010 = viewOnClickListenerC13209;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ۡ᩷") ^ i10;
                        i4 = ((iM11307 ^ i9) * (-8847)) ^ 468138002;
                        i6 = -1768193107;
                        i12 = iM11307 ^ i6;
                        i11 = i4;
                    }
                    break;
                case 899264758:
                case 909874691:
                    sArr2 = f43951;
                    i15 = 64;
                    i16 = 3;
                    if (RunnableC0195.m1431()) {
                        iM11307 = C19806.m45029("ᩴ۟") ^ i9;
                        i4 = ((iM11307 ^ i10) * (-32217)) ^ 422016254;
                        i6 = -1116131605;
                    } else {
                        iM11307 = (C19806.m45029("ۧ᩺") + i9) * (-17);
                        i4 = ((iM11307 ^ i10) * 21869) ^ (-281748627);
                        i6 = 2051589195;
                    }
                    i12 = iM11307 ^ i6;
                    i11 = i4;
                    break;
                case 1546967795:
                case 1804856688:
                    C1419.m4973();
                    if (!RunnableC1564.f6300) {
                        i23 = i23;
                        iM11306 = ThreadFactoryC3888.m11306("֫۟") ^ i9;
                        i4 = ((iM11306 ^ i10) * 9407) ^ 878040485;
                        i5 = 879725835;
                        i12 = iM11306 ^ i5;
                        viewOnClickListenerC132010 = viewOnClickListenerC13209;
                        i23 = i23;
                        i11 = i4;
                    } else {
                        s = s2;
                        i = i23;
                        iM11308 = ThreadFactoryC3888.m11306("ۘۡ") ^ i9;
                        s2 = s;
                        i7 = ((iM11308 ^ i10) * 30543) ^ 658454882;
                        i8 = 2010144251;
                        i12 = iM11308 ^ i8;
                        i23 = i;
                        i11 = i7;
                        viewOnClickListenerC132010 = viewOnClickListenerC13209;
                    }
                    break;
                default:
                    i = i23;
                    if (viewOnClickListenerC132010.f43956.m50802()) {
                        int iM113015 = ThreadFactoryC3888.m11306("ܰ֨") ^ i9;
                        i23 = i;
                        i11 = ((iM113015 ^ i10) * (-9)) ^ (-1313673939);
                        i12 = iM113015 ^ 963946407;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("ܶ᩺") ^ i10;
                        i7 = ((iM11308 ^ i9) * (-9691)) ^ (-743438895);
                        i8 = 849150973;
                        i12 = iM11308 ^ i8;
                        i23 = i;
                        i11 = i7;
                        viewOnClickListenerC132010 = viewOnClickListenerC13209;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x01a4 A[PHI: r11 r13 r14 r15
      0x01a4: PHI (r11v5 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:45:0x01a2, B:13:0x009c, B:9:0x007c, B:6:0x0076, B:125:0x01a4] A[DONT_GENERATE, DONT_INLINE]
      0x01a4: PHI (r13v5 short[]) = (r13v3 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:45:0x01a2, B:13:0x009c, B:9:0x007c, B:6:0x0076, B:125:0x01a4] A[DONT_GENERATE, DONT_INLINE]
      0x01a4: PHI (r14v5 int) = (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:45:0x01a2, B:13:0x009c, B:9:0x007c, B:6:0x0076, B:125:0x01a4] A[DONT_GENERATE, DONT_INLINE]
      0x01a4: PHI (r15v5 int) = (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:45:0x01a2, B:13:0x009c, B:9:0x007c, B:6:0x0076, B:125:0x01a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x01f2 A[PHI: r6 r7 r9
      0x01f2: PHI (r6v4 int) = (r6v3 int), (r6v2 int), (r6v2 int), (r6v2 int) binds: [B:49:0x01da, B:32:0x010b, B:29:0x00eb, B:126:0x01f2] A[DONT_GENERATE, DONT_INLINE]
      0x01f2: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:49:0x01da, B:32:0x010b, B:29:0x00eb, B:126:0x01f2] A[DONT_GENERATE, DONT_INLINE]
      0x01f2: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:49:0x01da, B:32:0x010b, B:29:0x00eb, B:126:0x01f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0353 A[PHI: r17 r18
      0x0353: PHI (r17v6 int) = (r17v3 int), (r17v2 int), (r17v2 int), (r17v2 int) binds: [B:85:0x0351, B:22:0x00cc, B:17:0x00bf, B:111:0x0353] A[DONT_GENERATE, DONT_INLINE]
      0x0353: PHI (r18v6 short) = (r18v3 short), (r18v2 short), (r18v2 short), (r18v2 short) binds: [B:85:0x0351, B:22:0x00cc, B:17:0x00bf, B:111:0x0353] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x03bf A[PHI: r3 r8 r19 r20 r27
      0x03bf: PHI (r3v4 int[]) = (r3v2 int[]), (r3v2 int[]), (r3v2 int[]), (r3v3 int[]), (r3v2 int[]) binds: [B:93:0x03bd, B:68:0x02a1, B:17:0x00bf, B:116:0x03bf, B:113:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      0x03bf: PHI (r8v3 java.lang.String) = 
      (r8v2 java.lang.String)
      (r8v2 java.lang.String)
      (r8v2 java.lang.String)
      (r8v2 java.lang.String)
      (r8v5 java.lang.String)
     binds: [B:93:0x03bd, B:68:0x02a1, B:17:0x00bf, B:116:0x03bf, B:113:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      0x03bf: PHI (r19v4 short[]) = (r19v3 short[]), (r19v2 short[]), (r19v2 short[]), (r19v2 short[]), (r19v2 short[]) binds: [B:93:0x03bd, B:68:0x02a1, B:17:0x00bf, B:116:0x03bf, B:113:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      0x03bf: PHI (r20v4 char) = (r20v3 char), (r20v2 char), (r20v2 char), (r20v2 char), (r20v2 char) binds: [B:93:0x03bd, B:68:0x02a1, B:17:0x00bf, B:116:0x03bf, B:113:0x03bf] A[DONT_GENERATE, DONT_INLINE]
      0x03bf: PHI (r27v5 java.lang.String) = 
      (r27v3 java.lang.String)
      (r27v4 java.lang.String)
      (r27v3 java.lang.String)
      (r27v3 java.lang.String)
      (r27v3 java.lang.String)
     binds: [B:93:0x03bd, B:68:0x02a1, B:17:0x00bf, B:116:0x03bf, B:113:0x03bf] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int iM45029;
        int i;
        int i2;
        int iM450210;
        int i3;
        ViewOnClickListenerC13209 viewOnClickListenerC13209 = this;
        int i4 = C1189.f5284;
        int i5 = C2788.f10625;
        int iM11306 = (ThreadFactoryC3888.m11306("᩸ܶ") + i4) * 79;
        int i6 = ((iM11306 ^ i5) * 6433) ^ (-874746846);
        int[] iArr = null;
        String strM5577 = null;
        String strM4892 = null;
        short[] sArr = null;
        int i7 = iM11306 ^ (-9531943);
        View viewFindViewById = null;
        float rawX = 0.0f;
        float rawY = 0.0f;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        short s = 0;
        char c = 0;
        int i16 = 0;
        short s2 = 0;
        int i17 = -1266380398;
        short[] sArr2 = null;
        int iM450211 = 0;
        while (true) {
            i17 = i7 ^ (i6 & (((i17 ^ i5) * (-32657)) >> 31));
            switch (i17) {
                case -2115087196:
                case 1344333695:
                    if (rawY < C2642.m8169(viewFindViewById) + i10) {
                        iM450210 = (ThreadFactoryC3888.m11306("֫ܽ") + i5) * 65;
                        i6 = ((iM450210 ^ i4) * 19805) ^ (-270235150);
                        i3 = 1751541054;
                        i7 = iM450210 ^ i3;
                        viewOnClickListenerC13209 = this;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳ֨") + i5) * 59;
                        i = ((iM45029 ^ i4) * (-16439)) ^ 2098099609;
                        i2 = 832468506;
                        i7 = iM45029 ^ i2;
                        i6 = i;
                    }
                    break;
                case -2085375215:
                case 1706218730:
                    strM5577 = C1668.m5577(f43951, 83, 12, i11);
                    if (!RunnableC1564.m5345()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ֨") ^ i4;
                        i = ((iM45029 ^ i5) * 10191) ^ (-1587227133);
                        i2 = -909975504;
                        i7 = iM45029 ^ i2;
                        i6 = i;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("ۤۢ") ^ i5;
                        i6 = ((iM450210 ^ i4) * 2869) ^ 1915183339;
                        i3 = 1836131193;
                        i7 = iM450210 ^ i3;
                        viewOnClickListenerC13209 = this;
                    }
                    break;
                case -1906898467:
                case 1760671748:
                    C0278.m1789();
                    return false;
                case -1797541036:
                case -1284464671:
                    i11 = 8154;
                    iM450210 = (C19806.m45029("ۢۖ") ^ i4) * (-53);
                    i6 = ((iM450210 ^ i5) * 10881) ^ (-1733085120);
                    i3 = 1711538983;
                    i7 = iM450210 ^ i3;
                    viewOnClickListenerC13209 = this;
                    break;
                case -1796513999:
                case -1486298160:
                    if (motionEvent.getActionMasked() == 0) {
                        iM450210 = (i4 - ThreadFactoryC3888.m11306("᩵᩶")) * (-43);
                        i6 = ((iM450210 ^ i5) * 8265) ^ 1530986468;
                        i3 = 119499496;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("֫ܽ") + i5) * 65;
                        i6 = ((iM450210 ^ i4) * 19805) ^ (-270235150);
                        i3 = 1751541054;
                    }
                    i7 = iM450210 ^ i3;
                    viewOnClickListenerC13209 = this;
                    break;
                case -1681561424:
                case -1624006690:
                    int i18 = s2 + s;
                    if ((i18 * i18) - i15 <= 0) {
                        iM450210 = (i4 - C19806.m45029("᩶ۡ")) * 97;
                        i6 = ((iM450210 ^ i5) * 19655) ^ 429707333;
                        i3 = 491295250;
                    } else {
                        iM450210 = C19806.m45029("ᩴ֡") ^ i5;
                        i6 = ((iM450210 ^ i4) * (-28437)) ^ (-989809737);
                        i3 = 1713124365;
                    }
                    i7 = iM450210 ^ i3;
                    viewOnClickListenerC13209 = this;
                    break;
                case -1581796709:
                case 246922969:
                    C1977.m6361(C2332.m7083(viewOnClickListenerC13209, 2098086190 ^ iM450211));
                    if (ThreadFactoryC3888.f14547 > 0) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("᩵ۘ")) * (-121);
                        i = ((iM45029 ^ i4) * (-27667)) ^ 740793759;
                        i2 = -2043989585;
                        i7 = iM45029 ^ i2;
                        i6 = i;
                    } else {
                        iM450210 = (i5 - ThreadFactoryC3888.m11306("᩷ۙ")) * (-87);
                        i6 = ((iM450210 ^ i4) * 2863) ^ 1732733886;
                        i3 = -1702375469;
                        i7 = iM450210 ^ i3;
                        viewOnClickListenerC13209 = this;
                    }
                    break;
                case -1565583737:
                case -1036997559:
                    if (C19806.m45024()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗۛ") + i5) * 41;
                        i = ((iM45029 ^ i4) * (-26323)) ^ 542564408;
                        i2 = -1142065468;
                    } else {
                        iM45029 = (C19806.m45029("ᩴ۠") + i4) * (-65);
                        i = ((iM45029 ^ i5) * 24647) ^ (-28201886);
                        i2 = 283924411;
                    }
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    break;
                case -1478659662:
                case -698311833:
                    if (C1025.f4800 < 0) {
                        iM45029 = (C19806.m45029("ᩴ۠") + i4) * (-65);
                        i = ((iM45029 ^ i5) * 24647) ^ (-28201886);
                        i2 = 283924411;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۗܺ")) * 59;
                        i = ((iM45029 ^ i5) * (-6197)) ^ (-2014187190);
                        i2 = 1119188573;
                    }
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    break;
                case -1337861774:
                case 190129970:
                    if (rawX < C1025.m3866(viewFindViewById) + i9) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳܳ") ^ i5;
                        i = ((iM45029 ^ i4) * 23737) ^ (-1575501194);
                        i2 = 797949156;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳ֨") + i5) * 59;
                        i = ((iM45029 ^ i4) * (-16439)) ^ 2098099609;
                        i2 = 832468506;
                    }
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    break;
                case -1318369597:
                case 279441219:
                    int i19 = i16 + i14;
                    i15 = i19 + i19;
                    s = 3178;
                    if (RunnableC1606.f6488 >= 0) {
                        iM450210 = (ThreadFactoryC3888.m11306("ܶ᩷") + i5) * 11;
                        i6 = ((iM450210 ^ i4) * (-16563)) ^ (-1913525435);
                        i3 = 1505717561;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("᩻᩷") ^ i5;
                        i6 = ((iM450210 ^ i4) * 19455) ^ 590779179;
                        i3 = 1311296826;
                    }
                    i7 = iM450210 ^ i3;
                    viewOnClickListenerC13209 = this;
                    break;
                case -1317771511:
                case 1842648088:
                    C1937.m6279();
                    C1377.m4833();
                    iM450210 = (ThreadFactoryC3888.m11306("ܶ᩷") + i5) * 11;
                    i6 = ((iM450210 ^ i4) * (-16563)) ^ (-1913525435);
                    i3 = 1505717561;
                    i7 = iM450210 ^ i3;
                    viewOnClickListenerC13209 = this;
                    break;
                case -1275992202:
                case 1622676015:
                    i11 = 59671;
                    iM450210 = (C19806.m45029("ۢۖ") ^ i4) * (-53);
                    i6 = ((iM450210 ^ i5) * 10881) ^ (-1733085120);
                    i3 = 1711538983;
                    i7 = iM450210 ^ i3;
                    viewOnClickListenerC13209 = this;
                    break;
                case -1197533743:
                case 1129831319:
                    C2704.m8255();
                    if (!C0526.f2219) {
                        iM45029 = (C19806.m45029("ᩴ۠") + i4) * (-65);
                        i = ((iM45029 ^ i5) * 24647) ^ (-28201886);
                        i2 = 283924411;
                        i7 = iM45029 ^ i2;
                        i6 = i;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("ܶ᩷") + i5) * 11;
                        i6 = ((iM450210 ^ i4) * (-16563)) ^ (-1913525435);
                        i3 = 1505717561;
                        i7 = iM450210 ^ i3;
                        viewOnClickListenerC13209 = this;
                    }
                    break;
                case -1194897259:
                case -1182497810:
                    ((InputMethodManager) C0216.m1592(viewOnClickListenerC13209, strM5577)).hideSoftInputFromWindow(viewFindViewById.getWindowToken(), i8);
                    iM450210 = (ThreadFactoryC3888.m11306("֫ܽ") + i5) * 65;
                    i6 = ((iM450210 ^ i4) * 19805) ^ (-270235150);
                    i3 = 1751541054;
                    i7 = iM450210 ^ i3;
                    viewOnClickListenerC13209 = this;
                    break;
                case -854539479:
                case -125051890:
                    AbstractC0464.m2313();
                    if (C0962.m3746() < 0) {
                        iM450210 = (ThreadFactoryC3888.m11306("ܶ᩷") + i5) * 11;
                        i6 = ((iM450210 ^ i4) * (-16563)) ^ (-1913525435);
                        i3 = 1505717561;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("ۤۢ") ^ i5;
                        i6 = ((iM450210 ^ i4) * 2869) ^ 1915183339;
                        i3 = 1836131193;
                    }
                    i7 = iM450210 ^ i3;
                    viewOnClickListenerC13209 = this;
                    break;
                case -775953027:
                case 1272012413:
                    iArr = new int[2];
                    viewFindViewById.getLocationOnScreen(iArr);
                    if (CallableC1627.m5507() == 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴܰ") ^ i4;
                        i = ((iM45029 ^ i5) * (-30953)) ^ (-185781431);
                        i2 = 1882385308;
                        i7 = iM45029 ^ i2;
                        i6 = i;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("ۤۢ") ^ i5;
                        i6 = ((iM450210 ^ i4) * 2869) ^ 1915183339;
                        i3 = 1836131193;
                        i7 = iM450210 ^ i3;
                        viewOnClickListenerC13209 = this;
                    }
                    break;
                case -245153089:
                case 578947425:
                    if (!viewFindViewById.hasFocus()) {
                        iM450210 = (ThreadFactoryC3888.m11306("֫ܽ") + i5) * 65;
                        i6 = ((iM450210 ^ i4) * 19805) ^ (-270235150);
                        i3 = 1751541054;
                        i7 = iM450210 ^ i3;
                        viewOnClickListenerC13209 = this;
                    } else {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("᩹ܶ")) * (-117);
                        i = ((iM45029 ^ i4) * 27353) ^ (-1167323982);
                        i2 = -352916146;
                        i7 = iM45029 ^ i2;
                        i6 = i;
                    }
                    break;
                case -243443621:
                case 1939116399:
                    s2 = sArr2[c];
                    i16 = s2 * s2;
                    i14 = 10099684;
                    if (C1419.f5860 >= 0) {
                        iM450210 = (i5 - ThreadFactoryC3888.m11306("᩷ۙ")) * (-87);
                        i6 = ((iM450210 ^ i4) * 2863) ^ 1732733886;
                        i3 = -1702375469;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("ۨۘ") ^ i5) * (-79);
                        i6 = ((iM450210 ^ i4) * 22301) ^ (-2058483717);
                        i3 = -337992443;
                    }
                    i7 = iM450210 ^ i3;
                    viewOnClickListenerC13209 = this;
                    break;
                case -94212846:
                case 199870891:
                    i10 = iArr[1];
                    if (rawY >= i10) {
                        iM45029 = C19806.m45029("᩸۟") ^ i4;
                        i = ((iM45029 ^ i5) * 9505) ^ (-261298085);
                        i2 = 543516201;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳ֨") + i5) * 59;
                        i = ((iM45029 ^ i4) * (-16439)) ^ 2098099609;
                        i2 = 832468506;
                    }
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    break;
                case 7826065:
                case 687240309:
                    rawX = motionEvent.getRawX();
                    rawY = motionEvent.getRawY();
                    if (C2249.f8050 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܶۢ") ^ i4;
                        i = ((iM45029 ^ i5) * (-30593)) ^ 664067995;
                        i2 = 978907539;
                        i7 = iM45029 ^ i2;
                        i6 = i;
                    } else {
                        iM450210 = (i5 - ThreadFactoryC3888.m11306("᩷ۙ")) * (-87);
                        i6 = ((iM450210 ^ i4) * 2863) ^ 1732733886;
                        i3 = -1702375469;
                        i7 = iM450210 ^ i3;
                        viewOnClickListenerC13209 = this;
                    }
                    break;
                case 288546034:
                case 2145036915:
                    sArr = f43951;
                    i13 = 80;
                    i12 = 3;
                    if (RunnableC1895.m6170() != 0) {
                        iM45029 = (C19806.m45029("ᩴ۠") + i4) * (-65);
                        i = ((iM45029 ^ i5) * 24647) ^ (-28201886);
                        i2 = 283924411;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛ᩻") + i5) * (-35);
                        i = ((iM45029 ^ i4) * 31467) ^ 879434325;
                        i2 = 1196146870;
                    }
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    break;
                case 465358944:
                case 1265968821:
                    viewFindViewById = viewOnClickListenerC13209.findViewById(C19806.m45029(strM4892) ^ 2101510531);
                    if (viewFindViewById == null) {
                        iM450210 = (ThreadFactoryC3888.m11306("֫ܽ") + i5) * 65;
                        i6 = ((iM450210 ^ i4) * 19805) ^ (-270235150);
                        i3 = 1751541054;
                        i7 = iM450210 ^ i3;
                        viewOnClickListenerC13209 = this;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ܿ۬")) * 59;
                        i = ((iM45029 ^ i5) * 4109) ^ (-2141534836);
                        i2 = -1030389075;
                        i7 = iM45029 ^ i2;
                        i6 = i;
                    }
                    break;
                case 598967352:
                case 1956683370:
                    strM4892 = C1398.m4892(f43951, 77, 3, i11);
                    if (RunnableC0195.f1321 >= 0) {
                        iM450210 = ThreadFactoryC3888.m11306("ۤۢ") ^ i5;
                        i6 = ((iM450210 ^ i4) * 2869) ^ 1915183339;
                        i3 = 1836131193;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("᩷ۖ") ^ i5;
                        i6 = ((iM450210 ^ i4) * 11179) ^ 609724317;
                        i3 = -833551991;
                    }
                    i7 = iM450210 ^ i3;
                    viewOnClickListenerC13209 = this;
                    break;
                case 712903373:
                case 1505519896:
                    sArr2 = f43951;
                    c = 'L';
                    if (C1875.m6086() != 0) {
                        iM450210 = ThreadFactoryC3888.m11306("ۤۢ") ^ i5;
                        i6 = ((iM450210 ^ i4) * 2869) ^ 1915183339;
                        i3 = 1836131193;
                    } else {
                        iM450210 = C19806.m45029("۬ܿ") ^ i4;
                        i6 = ((iM450210 ^ i5) * (-145)) ^ (-1453208392);
                        i3 = 64157325;
                    }
                    i7 = iM450210 ^ i3;
                    viewOnClickListenerC13209 = this;
                    break;
                case 966351729:
                case 968783606:
                    return super.dispatchTouchEvent(motionEvent);
                case 1243524558:
                case 1957368992:
                    i8 = 0;
                    i9 = iArr[0];
                    if (rawX >= i9) {
                        iM45029 = C19806.m45029("᩵֨") ^ i4;
                        i = ((iM45029 ^ i5) * 9209) ^ 672109012;
                        i2 = 2064688336;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳ֨") + i5) * 59;
                        i = ((iM45029 ^ i4) * (-16439)) ^ 2098099609;
                        i2 = 832468506;
                    }
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    break;
                default:
                    iM450211 = C19806.m45029(C19806.m45020(sArr, i13, i12, i11));
                    if (RunnableC0195.m1431()) {
                        iM45029 = C19806.m45029("ᩴۛ") ^ i4;
                        i = ((iM45029 ^ i5) * 32329) ^ 856503874;
                        i2 = -772656563;
                    } else {
                        iM45029 = (C19806.m45029("ᩴ۠") + i4) * (-65);
                        i = ((iM45029 ^ i5) * 24647) ^ (-28201886);
                        i2 = 283924411;
                    }
                    i7 = iM45029 ^ i2;
                    i6 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0067  */
    /* JADX WARN: Code duplicated, block: B:62:0x021c A[PHI: r2 r3 r4 r11 r17
      0x021c: PHI (r2v3 char) = (r2v2 char), (r2v1 char), (r2v1 char), (r2v1 char) binds: [B:61:0x021a, B:57:0x01f8, B:25:0x00a0, B:15:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x021c: PHI (r3v3 short) = (r3v1 short), (r3v2 short), (r3v1 short), (r3v1 short) binds: [B:61:0x021a, B:57:0x01f8, B:25:0x00a0, B:15:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x021c: PHI (r4v3 short) = (r4v1 short), (r4v2 short), (r4v1 short), (r4v1 short) binds: [B:61:0x021a, B:57:0x01f8, B:25:0x00a0, B:15:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x021c: PHI (r11v3 int) = (r11v1 int), (r11v1 int), (r11v2 int), (r11v1 int) binds: [B:61:0x021a, B:57:0x01f8, B:25:0x00a0, B:15:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x021c: PHI (r17v18 int) = (r17v6 int), (r17v7 int), (r17v13 int), (r17v19 int) binds: [B:61:0x021a, B:57:0x01f8, B:25:0x00a0, B:15:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0271 A[PHI: r1 r5 r7 r17
      0x0271: PHI (r1v3 short[]) = (r1v1 short[]), (r1v2 short[]), (r1v1 short[]), (r1v1 short[]) binds: [B:69:0x026f, B:65:0x0250, B:53:0x01d6, B:45:0x0192] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r5v3 int) = (r5v1 int), (r5v1 int), (r5v2 int), (r5v1 int) binds: [B:69:0x026f, B:65:0x0250, B:53:0x01d6, B:45:0x0192] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r7v2 short) = (r7v1 short), (r7v1 short), (r7v1 short), (r7v3 short) binds: [B:69:0x026f, B:65:0x0250, B:53:0x01d6, B:45:0x0192] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r17v10 int) = (r17v4 int), (r17v5 int), (r17v8 int), (r17v11 int) binds: [B:69:0x026f, B:65:0x0250, B:53:0x01d6, B:45:0x0192] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02a3 A[PHI: r6 r17
      0x02a3: PHI (r6v3 int) = (r6v1 int), (r6v2 int), (r6v1 int) binds: [B:73:0x02a1, B:49:0x01b5, B:11:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x02a3: PHI (r17v20 int) = (r17v3 int), (r17v9 int), (r17v22 int) binds: [B:73:0x02a1, B:49:0x01b5, B:11:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        int i;
        int iM11306;
        int i2;
        int i3;
        int i4;
        int i5;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i6 = 0;
        int i7 = 0;
        short s3 = 0;
        int i8 = 0;
        short[] sArr2 = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = 792214416;
        int i12 = C0629.f2722;
        int i13 = C2249.f8050;
        int iM11307 = (ThreadFactoryC3888.m11306("᩻ۖ") ^ i12) * (-127);
        int i14 = ((iM11307 ^ i13) * (-14553)) ^ 138693746;
        int i15 = iM11307 ^ (-1509764974);
        C5447 c5447 = null;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i13) * (-24179)) >> 31));
            switch (i11) {
                case -1972275453:
                case -944436885:
                    C1668.m5583();
                    C1460.m5050();
                    break;
                case -1950510703:
                case 245288135:
                    i = i8;
                    c = 207;
                    if (C0817.m3399()) {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ᩴ") ^ i12;
                        i2 = ((iM11306 ^ i13) * (-22517)) ^ (-561209935);
                        i3 = 1659776827;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗ᩸") + i12) * 9;
                        i2 = ((iM11306 ^ i13) * (-8687)) ^ 21359935;
                        i3 = -1727727436;
                    }
                    i4 = iM11306 ^ i3;
                    i8 = i;
                    int i16 = i2;
                    i15 = i4;
                    i14 = i16;
                    break;
                case -1835460285:
                case -113266645:
                    i = i8;
                    bundle.putString(ViewGroupOnHierarchyChangeListenerC1916.m6241(sArr2, i9, i10, i8), c5447.f18784);
                    iM11306 = C19806.m45029("֨ۜ") ^ i12;
                    i2 = ((iM11306 ^ i13) * 15963) ^ (-421010699);
                    i3 = 1496338768;
                    i4 = iM11306 ^ i3;
                    i8 = i;
                    int i17 = i2;
                    i15 = i4;
                    i14 = i17;
                    break;
                case -1754379094:
                case -143464313:
                    i = i8;
                    i6 = s * s2;
                    if (C1977.f7413 <= 0) {
                        iM11306 = C19806.m45029("֡ܽ") ^ i12;
                        i2 = ((iM11306 ^ i13) * 5853) ^ (-1460662889);
                        i3 = -1496909730;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܺ֫") ^ i12;
                        i2 = ((iM11306 ^ i13) * (-32417)) ^ (-1733027067);
                        i3 = -311686010;
                    }
                    i4 = iM11306 ^ i3;
                    i8 = i;
                    int i18 = i2;
                    i15 = i4;
                    i14 = i18;
                    break;
                case -1736943468:
                case 106041417:
                    i5 = 52748;
                    int iM45029 = C19806.m45029("ۤۖ") ^ i13;
                    int i19 = i5;
                    i14 = ((iM45029 ^ i12) * 26321) ^ 1306686236;
                    i15 = iM45029 ^ 786443508;
                    i8 = i19;
                    break;
                case -1726167332:
                case -293363223:
                    i = i8;
                    C5447 c5448 = this.f43960;
                    if (c5448 != null) {
                        int iM450210 = (C19806.m45029("ᩴۗ") + i12) * 73;
                        i14 = ((iM450210 ^ i13) * 17557) ^ 115687310;
                        int i20 = iM450210 ^ (-865809796);
                        i8 = i;
                        c5447 = c5448;
                        i15 = i20;
                    } else {
                        c5447 = c5448;
                        iM11306 = C19806.m45029("֨ۜ") ^ i12;
                        i2 = ((iM11306 ^ i13) * 15963) ^ (-421010699);
                        i3 = 1496338768;
                        i4 = iM11306 ^ i3;
                        i8 = i;
                        int i110 = i2;
                        i15 = i4;
                        i14 = i110;
                    }
                    break;
                case -1247175386:
                case 593191274:
                    if (AbstractC0464.f2088 > 0) {
                        i = i8;
                        iM11306 = ThreadFactoryC3888.m11306("ܺ᩵") ^ i13;
                        i2 = ((iM11306 ^ i12) * 27657) ^ 724395508;
                        i3 = 29419786;
                        i4 = iM11306 ^ i3;
                        i8 = i;
                        int i111 = i2;
                        i15 = i4;
                        i14 = i111;
                    }
                    i = i8;
                    iM11306 = (i13 - C19806.m45029("۟֨")) * (-113);
                    i2 = ((iM11306 ^ i12) * 429) ^ (-428299885);
                    i3 = 1966963740;
                    i4 = iM11306 ^ i3;
                    i8 = i;
                    int i112 = i2;
                    i15 = i4;
                    i14 = i112;
                    break;
                case -1156484973:
                case 1639247494:
                    C1668.m5583();
                    int iM11308 = (ThreadFactoryC3888.m11306("᩺᩺") + i12) * 93;
                    i2 = ((iM11308 ^ i13) * 20855) ^ 40589797;
                    i4 = iM11308 ^ (-1700538761);
                    int i113 = i2;
                    i15 = i4;
                    i14 = i113;
                    break;
                case -1046265314:
                case 1159871930:
                    if (C2249.f8050 < 0) {
                        int iM11309 = (ThreadFactoryC3888.m11306("᩺᩺") + i12) * 93;
                        i2 = ((iM11309 ^ i13) * 20855) ^ 40589797;
                        i4 = iM11309 ^ (-1700538761);
                    } else {
                        i = i8;
                        iM11306 = (ThreadFactoryC3888.m11306("ۗ᩸") + i12) * 9;
                        i2 = ((iM11306 ^ i13) * (-8687)) ^ 21359935;
                        i3 = -1727727436;
                        i4 = iM11306 ^ i3;
                        i8 = i;
                    }
                    int i114 = i2;
                    i15 = i4;
                    i14 = i114;
                    break;
                case -965757759:
                case 2038419436:
                    i = i8;
                    i10 = 12;
                    if (C1419.f5860 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗ᩸") + i12) * 9;
                        i2 = ((iM11306 ^ i13) * (-8687)) ^ 21359935;
                        i3 = -1727727436;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳܳ") ^ i13;
                        i2 = ((iM11306 ^ i12) * 12009) ^ 995514539;
                        i3 = 1392160332;
                    }
                    i4 = iM11306 ^ i3;
                    i8 = i;
                    int i115 = i2;
                    i15 = i4;
                    i14 = i115;
                    break;
                case -845484669:
                case 553466212:
                    i = i8;
                    int i21 = s + s3;
                    if ((i21 * i21) - i7 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺۢ") ^ i13) * (-109);
                        i2 = ((iM11306 ^ i12) * (-8877)) ^ 43464643;
                        i3 = 828124939;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳᩳ") ^ i12;
                        i2 = ((iM11306 ^ i13) * (-29103)) ^ 592581094;
                        i3 = -1961572816;
                    }
                    i4 = iM11306 ^ i3;
                    i8 = i;
                    int i116 = i2;
                    i15 = i4;
                    i14 = i116;
                    break;
                case -839319458:
                case 618067086:
                    i5 = 24971;
                    int iM450211 = C19806.m45029("ۤۖ") ^ i13;
                    int i117 = i5;
                    i14 = ((iM450211 ^ i12) * 26321) ^ 1306686236;
                    i15 = iM450211 ^ 786443508;
                    i8 = i117;
                    break;
                case -592678911:
                case 112714475:
                    i = i8;
                    s3 = 1;
                    if (C10634.f36300 >= 0) {
                        iM11306 = C19806.m45029("֡ܽ") ^ i12;
                        i2 = ((iM11306 ^ i13) * 5853) ^ (-1460662889);
                        i3 = -1496909730;
                    } else {
                        iM11306 = (C19806.m45029("ᩳ᩶") + i13) * 33;
                        i2 = ((iM11306 ^ i12) * 12217) ^ (-1190688191);
                        i3 = -305683594;
                    }
                    i4 = iM11306 ^ i3;
                    i8 = i;
                    int i118 = i2;
                    i15 = i4;
                    i14 = i118;
                    break;
                case -84542611:
                case 971320559:
                    i = i8;
                    if (RunnableC0195.m1431()) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ᩹") ^ i13;
                        i2 = ((iM11306 ^ i12) * 28935) ^ 1662093205;
                        i3 = 1008068798;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܺ᩵") ^ i13;
                        i2 = ((iM11306 ^ i12) * 27657) ^ 724395508;
                        i3 = 29419786;
                    }
                    i4 = iM11306 ^ i3;
                    i8 = i;
                    int i119 = i2;
                    i15 = i4;
                    i14 = i119;
                    break;
                case -59377737:
                case 1598839737:
                    i = i8;
                    if (C0962.f3784) {
                        iM11306 = C19806.m45029("֡ܽ") ^ i12;
                        i2 = ((iM11306 ^ i13) * 5853) ^ (-1460662889);
                        i3 = -1496909730;
                    } else {
                        iM11306 = C19806.m45029("᩷ۧ") ^ i12;
                        i2 = ((iM11306 ^ i13) * (-3447)) ^ 1359155097;
                        i3 = 158148185;
                    }
                    i4 = iM11306 ^ i3;
                    i8 = i;
                    int i1110 = i2;
                    i15 = i4;
                    i14 = i1110;
                    break;
                case -33342989:
                case 1296506192:
                    i = i8;
                    i7 = i6 + 1;
                    if (C1668.f6641 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺ᩵") ^ i13;
                        i2 = ((iM11306 ^ i12) * 27657) ^ 724395508;
                        i3 = 29419786;
                    } else {
                        iM11306 = C19806.m45029("ᩳ۫") ^ i12;
                        i2 = ((iM11306 ^ i13) * (-1681)) ^ (-810962121);
                        i3 = 366676215;
                    }
                    i4 = iM11306 ^ i3;
                    i8 = i;
                    int i1111 = i2;
                    i15 = i4;
                    i14 = i1111;
                    break;
                case 224799759:
                case 1904390403:
                    i = i8;
                    s = sArr[c];
                    s2 = 2;
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗ᩸") + i12) * 9;
                        i2 = ((iM11306 ^ i13) * (-8687)) ^ 21359935;
                        i3 = -1727727436;
                    } else {
                        iM11306 = C19806.m45029("ܶۘ") ^ i13;
                        i2 = ((iM11306 ^ i12) * 9303) ^ 399715682;
                        i3 = 1460534183;
                    }
                    i4 = iM11306 ^ i3;
                    i8 = i;
                    int i1112 = i2;
                    i15 = i4;
                    i14 = i1112;
                    break;
                case 436325837:
                case 1546884103:
                    i = i8;
                    sArr = f43951;
                    if (C1066.f4915 <= 0) {
                        iM11306 = C19806.m45029("֡ܽ") ^ i12;
                        i2 = ((iM11306 ^ i13) * 5853) ^ (-1460662889);
                        i3 = -1496909730;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳ᩸") ^ i13) * (-21);
                        i2 = ((iM11306 ^ i12) * (-29257)) ^ (-621743664);
                        i3 = -1133594881;
                    }
                    i4 = iM11306 ^ i3;
                    i8 = i;
                    int i1113 = i2;
                    i15 = i4;
                    i14 = i1113;
                    break;
                case 938623449:
                case 1502841028:
                    if (C1189.f5284 > 0) {
                        int iM113010 = (ThreadFactoryC3888.m11306("᩺᩺") + i12) * 93;
                        i2 = ((iM113010 ^ i13) * 20855) ^ 40589797;
                        i4 = iM113010 ^ (-1700538761);
                    } else {
                        i = i8;
                        iM11306 = (i13 - C19806.m45029("۟֨")) * (-113);
                        i2 = ((iM11306 ^ i12) * 429) ^ (-428299885);
                        i3 = 1966963740;
                        i4 = iM11306 ^ i3;
                        i8 = i;
                    }
                    int i1114 = i2;
                    i15 = i4;
                    i14 = i1114;
                    break;
                case 1247754144:
                case 1449693904:
                    super.onSaveInstanceState(bundle);
                    break;
                default:
                    i = i8;
                    sArr2 = f43951;
                    i9 = 208;
                    if (C1189.f5284 <= 0) {
                        iM11306 = (i13 - C19806.m45029("۟֨")) * (-113);
                        i2 = ((iM11306 ^ i12) * 429) ^ (-428299885);
                        i3 = 1966963740;
                    } else {
                        iM11306 = C19806.m45029("ܽ᩻") ^ i13;
                        i2 = ((iM11306 ^ i12) * 27117) ^ 1042363260;
                        i3 = -1189321635;
                    }
                    i4 = iM11306 ^ i3;
                    i8 = i;
                    int i1115 = i2;
                    i15 = i4;
                    i14 = i1115;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0257 A[PHI: r5 r6 r16
      0x0257: PHI (r5v3 short[]) = (r5v2 short[]), (r5v4 short[]) binds: [B:60:0x0255, B:56:0x0232] A[DONT_GENERATE, DONT_INLINE]
      0x0257: PHI (r6v3 char) = (r6v2 char), (r6v4 char) binds: [B:60:0x0255, B:56:0x0232] A[DONT_GENERATE, DONT_INLINE]
      0x0257: PHI (r16v9 int) = (r16v8 int), (r16v10 int) binds: [B:60:0x0255, B:56:0x0232] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x02ef A[PHI: r16
      0x02ef: PHI (r16v29 int) = (r16v4 int), (r16v6 int), (r15v10 int) binds: [B:76:0x02ed, B:68:0x02ac, B:13:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0320 A[PHI: r4 r10 r11 r12 r16
      0x0320: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:80:0x031e, B:41:0x0183, B:8:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0320: PHI (r10v4 short[]) = (r10v2 short[]), (r10v3 short[]), (r10v2 short[]) binds: [B:80:0x031e, B:41:0x0183, B:8:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0320: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:80:0x031e, B:41:0x0183, B:8:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0320: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:80:0x031e, B:41:0x0183, B:8:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0320: PHI (r16v21 int) = (r16v3 int), (r16v16 int), (r16v22 int) binds: [B:80:0x031e, B:41:0x0183, B:8:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0352 A[PHI: r7 r8 r16
      0x0352: PHI (r7v4 short) = (r7v2 short), (r7v2 short), (r7v2 short), (r7v3 short), (r7v2 short) binds: [B:84:0x0350, B:72:0x02cc, B:64:0x028b, B:52:0x020d, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0352: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:84:0x0350, B:72:0x02cc, B:64:0x028b, B:52:0x020d, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0352: PHI (r16v20 int) = (r16v2 int), (r16v5 int), (r16v7 int), (r16v11 int), (r16v23 int) binds: [B:84:0x0350, B:72:0x02cc, B:64:0x028b, B:52:0x020d, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        if (l.C2704.f10408 == false) goto L12;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m32683(l.ViewOnClickListenerC13209 r19, final android.widget.PopupWindow r20, int r21, java.lang.String r22, android.view.View r23) {
        /*
            Method dump skipped, instruction units count: 1098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC13209.m32683(l.۬ܺۘ, android.widget.PopupWindow, int, java.lang.String, android.view.View):void");
    }

    /* JADX WARN: Code duplicated, block: B:124:0x05f1 A[PHI: r1 r10 r19 r28 r30
      0x05f1: PHI (r1v142 android.widget.EditText) = (r1v133 android.widget.EditText), (r1v135 android.widget.EditText), (r1v143 android.widget.EditText) binds: [B:122:0x05d8, B:110:0x0543, B:90:0x040f] A[DONT_GENERATE, DONT_INLINE]
      0x05f1: PHI (r10v79 java.lang.StringBuilder) = (r10v66 java.lang.StringBuilder), (r10v68 java.lang.StringBuilder), (r10v80 java.lang.StringBuilder) binds: [B:122:0x05d8, B:110:0x0543, B:90:0x040f] A[DONT_GENERATE, DONT_INLINE]
      0x05f1: PHI (r19v32 int) = (r19v24 int), (r19v26 int), (r19v33 int) binds: [B:122:0x05d8, B:110:0x0543, B:90:0x040f] A[DONT_GENERATE, DONT_INLINE]
      0x05f1: PHI (r28v55 int) = (r28v47 int), (r28v49 int), (r28v56 int) binds: [B:122:0x05d8, B:110:0x0543, B:90:0x040f] A[DONT_GENERATE, DONT_INLINE]
      0x05f1: PHI (r30v30 boolean) = (r30v18 boolean), (r30v24 boolean), (r30v31 boolean) binds: [B:122:0x05d8, B:110:0x0543, B:90:0x040f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x02e1 A[PHI: r7 r15 r28
      0x02e1: PHI (r7v4 int) = (r7v3 int), (r7v1 int) binds: [B:67:0x02df, B:50:0x01d6] A[DONT_GENERATE, DONT_INLINE]
      0x02e1: PHI (r15v4 android.view.View$OnClickListener) = (r15v3 android.view.View$OnClickListener), (r15v2 android.view.View$OnClickListener) binds: [B:67:0x02df, B:50:0x01d6] A[DONT_GENERATE, DONT_INLINE]
      0x02e1: PHI (r28v29 int) = (r28v23 int), (r28v30 int) binds: [B:67:0x02df, B:50:0x01d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m32693() {
        int iM11306;
        int i;
        int i2;
        int iM11307;
        int i3;
        int i4;
        int i5;
        int iM11308;
        int i6;
        int i7;
        int iM11309;
        int i8;
        int i9;
        C22381 c22381;
        int i10;
        String upperCase;
        int iM45029;
        int i11;
        int i12;
        StringBuilder sb;
        boolean z;
        int iM450210;
        int i13;
        int i14;
        int i15 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int i16 = C3660.f13403;
        int iM450211 = C19806.m45029("ᩳۜ") ^ i15;
        int i17 = ((iM450211 ^ i16) * 3621) ^ (-203819087);
        final String str = null;
        View viewM1436 = null;
        TextView textView = null;
        Iterator itM9863 = null;
        C14078 c14078 = null;
        C22381 c22382 = null;
        View.OnClickListener onClickListener = null;
        View viewM8167 = null;
        int i18 = iM450211 ^ (-1997891630);
        int iM450212 = 0;
        int i19 = 0;
        boolean z2 = false;
        int iM450213 = 0;
        int iM450214 = 0;
        int i20 = 0;
        EditText editText = null;
        int iM113010 = 0;
        int i21 = 0;
        short s = 0;
        int i22 = 0;
        int i23 = 200281926;
        StringBuilder sb2 = null;
        View viewM9787 = null;
        final PopupWindow popupWindow = null;
        final int i24 = 0;
        while (true) {
            i23 = i18 ^ (i17 & (((i23 ^ i16) * 13565) >> 31));
            switch (i23) {
                case -2122771480:
                case -1448554097:
                    popupWindow.setWidth(-1);
                    popupWindow.setHeight(-2);
                    popupWindow.setFocusable(z2);
                    popupWindow.setBackgroundDrawable(new ColorDrawable(i19));
                    if (C1875.m6086() == 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܶ᩹") ^ i15;
                        i = ((iM11306 ^ i16) * 27341) ^ (-556173213);
                        i2 = 1711480682;
                        i18 = iM11306 ^ i2;
                        i17 = i;
                    } else {
                        iM450212 = iM450212;
                        z = z2;
                        editText = editText;
                        i19 = i19;
                        int iM113011 = (i15 - ThreadFactoryC3888.m11306("᩹ۙ")) * (-53);
                        i6 = ((iM113011 ^ i16) * (-2155)) ^ 1344584805;
                        i12 = iM113011 ^ 383054842;
                        z2 = z;
                        sb2 = null;
                        int i25 = i19;
                        editText = editText;
                        i17 = i6;
                        i19 = i25;
                        int i26 = iM450212;
                        i18 = i12;
                        iM450212 = i26;
                    }
                    break;
                case -2100361405:
                case 1455320272:
                    iM450212 = iM450212;
                    editText = editText;
                    sb2 = sb2;
                    i19 = i19;
                    z2 = z2;
                    int i27 = s + 1;
                    if ((i22 + 1) - (i27 * i27) <= 0) {
                        iM11308 = ThreadFactoryC3888.m11306("ۘܺ") ^ i16;
                        i6 = ((iM11308 ^ i15) * (-20617)) ^ 1377735809;
                        i7 = -938842864;
                    } else {
                        iM11308 = (i15 - C19806.m45029("᩻ۤ")) * (-11);
                        i6 = ((iM11308 ^ i16) * 26695) ^ 1842605115;
                        i7 = 590260715;
                    }
                    i12 = iM11308 ^ i7;
                    z2 = z2;
                    sb2 = sb2;
                    int i28 = i19;
                    editText = editText;
                    i17 = i6;
                    i19 = i28;
                    int i29 = iM450212;
                    i18 = i12;
                    iM450212 = i29;
                    break;
                case -2060844644:
                case 520460614:
                    AbstractC0464.m2313();
                    if (C1937.m6279() < 0) {
                        iM450212 = iM450212;
                        z = z2;
                        editText = editText;
                        i19 = i19;
                        int iM113012 = (i15 - ThreadFactoryC3888.m11306("᩹ۙ")) * (-53);
                        i6 = ((iM113012 ^ i16) * (-2155)) ^ 1344584805;
                        i12 = iM113012 ^ 383054842;
                        z2 = z;
                        sb2 = null;
                        int i210 = i19;
                        editText = editText;
                        i17 = i6;
                        i19 = i210;
                        int i211 = iM450212;
                        i18 = i12;
                        iM450212 = i211;
                    } else {
                        iM450212 = iM450212;
                        editText = editText;
                        sb = sb2;
                        i19 = i19;
                        z = z2;
                        iM450210 = C19806.m45029("ܺۙ") ^ i15;
                        i13 = ((iM450210 ^ i16) * 13235) ^ (-906903077);
                        i14 = 1623851863;
                        int i30 = i19;
                        editText = editText;
                        i17 = i13;
                        z2 = z;
                        sb2 = sb;
                        iM450212 = iM450212;
                        i18 = iM450210 ^ i14;
                        i19 = i30;
                    }
                    break;
                case -2045454027:
                case 960746624:
                    iM450212 = iM450212;
                    editText = editText;
                    sb2 = sb2;
                    i19 = i19;
                    z2 = true;
                    if (this.f43958) {
                        iM45029 = C19806.m45029("᩷ۤ") ^ i16;
                        i6 = ((iM45029 ^ i15) * (-31447)) ^ (-1450975442);
                        i11 = -1439370061;
                    } else {
                        iM45029 = C19806.m45029("֫֡") ^ i15;
                        i6 = ((iM45029 ^ i16) * 18027) ^ 522857682;
                        i11 = 507428937;
                    }
                    i12 = iM45029 ^ i11;
                    sb2 = sb2;
                    int i212 = i19;
                    editText = editText;
                    i17 = i6;
                    i19 = i212;
                    int i213 = iM450212;
                    i18 = i12;
                    iM450212 = i213;
                    break;
                case -1861930340:
                case -1071937729:
                    iM450212 = iM450212;
                    editText = editText;
                    sb2 = sb2;
                    z2 = z2;
                    i19 = 0;
                    if (C3660.m10786(str)) {
                        iM11307 = C19806.m45029("ᩳ᩷") ^ i15;
                        i3 = ((iM11307 ^ i16) * (-7345)) ^ 1671259878;
                        i4 = 1285947367;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("۫۬") + i15) * (-101);
                        i3 = ((iM11307 ^ i16) * (-28693)) ^ 600133528;
                        i4 = 635973772;
                    }
                    i5 = iM11307 ^ i4;
                    editText = editText;
                    i17 = i3;
                    z2 = z2;
                    sb2 = sb2;
                    i10 = iM450212;
                    i18 = i5;
                    iM450212 = i10;
                    break;
                case -1797141548:
                case -1341387544:
                    iM450212 = iM450212;
                    editText = editText;
                    C1461.m5083(editText, str);
                    i19 = i19;
                    sb2 = sb2;
                    z2 = z2;
                    iM11308 = ThreadFactoryC3888.m11306("᩹ܿ") ^ i16;
                    i6 = ((iM11308 ^ i15) * (-2109)) ^ (-1064839933);
                    i7 = 297386896;
                    i12 = iM11308 ^ i7;
                    z2 = z2;
                    sb2 = sb2;
                    int i214 = i19;
                    editText = editText;
                    i17 = i6;
                    i19 = i214;
                    int i215 = iM450212;
                    i18 = i12;
                    iM450212 = i215;
                    break;
                case -1735687511:
                case 1501832736:
                    iM450212 = iM450212;
                    C7105.m18993(viewM8167, onClickListener);
                    boolean zM18173 = C6730.m18173();
                    iM450214 = 2102094970 ^ C19806.m45029(C0962.m3747(f43951, 292, 3, i20));
                    if (zM18173) {
                        iM11309 = (C19806.m45029("۟۬") + i16) * 19;
                        i8 = ((iM11309 ^ i15) * 19983) ^ 493377793;
                        i9 = 1533308691;
                    } else {
                        iM11309 = ThreadFactoryC3888.m11306("ۧ᩺") ^ i15;
                        i8 = ((iM11309 ^ i16) * (-30973)) ^ (-1543891866);
                        i9 = -1240553129;
                    }
                    i10 = iM450212;
                    i18 = iM11309 ^ i9;
                    i17 = i8;
                    iM450212 = i10;
                    break;
                case -1672582661:
                case 80249477:
                    iM450212 = iM450212;
                    if (c22382 == null) {
                        iM11309 = C19806.m45029("ۙۘ") ^ i16;
                        i8 = ((iM11309 ^ i15) * 8187) ^ 2116947276;
                        i9 = 933260441;
                    } else {
                        iM11309 = ThreadFactoryC3888.m11306("ᩳܰ") ^ i15;
                        i8 = ((iM11309 ^ i16) * 979) ^ 1743286208;
                        i9 = -570226521;
                    }
                    i10 = iM450212;
                    i18 = iM11309 ^ i9;
                    i17 = i8;
                    iM450212 = i10;
                    break;
                case -1649630335:
                case 439961854:
                    iM450212 = iM450212;
                    C7105.m18993(C3743.m10957(viewM9787, iM450213), onClickListener);
                    viewM8167 = C2642.m8167(viewM9787, ThreadFactoryC3888.m11306(RunnableC1564.m5344(f43951, 289, 3, i20)) ^ 2127005005);
                    if (C3660.m10791() != 0) {
                        iM11309 = (C19806.m45029("᩷ۨ") ^ i15) * 15;
                        i8 = ((iM11309 ^ i16) * (-16413)) ^ (-1582233766);
                        i9 = -884467343;
                    } else {
                        iM11309 = (ThreadFactoryC3888.m11306("۫ۧ") ^ i16) * (-69);
                        i8 = ((iM11309 ^ i15) * 9381) ^ 1241402643;
                        i9 = 1146236293;
                    }
                    i10 = iM450212;
                    i18 = iM11309 ^ i9;
                    i17 = i8;
                    iM450212 = i10;
                    break;
                case -1618905418:
                case 1340270840:
                    WindowManager.LayoutParams attributes = C3660.m10777(this).getAttributes();
                    attributes.alpha = 0.7f;
                    iM450212 = iM450212;
                    C2249.m6910(this).addFlags(2);
                    C2249.m6910(this).setAttributes(attributes);
                    if (C3660.m10791() != 0) {
                        iM11309 = (ThreadFactoryC3888.m11306("۫᩷") ^ i16) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((iM11309 ^ i15) * 2705) ^ 197463961;
                        i9 = 1378728629;
                    } else {
                        iM11309 = (C19806.m45029("᩵᩹") ^ i16) * 57;
                        i8 = ((iM11309 ^ i15) * (-29909)) ^ (-299662545);
                        i9 = 1155856775;
                    }
                    i10 = iM450212;
                    i18 = iM11309 ^ i9;
                    i17 = i8;
                    iM450212 = i10;
                    break;
                case -1609656635:
                case 1388063712:
                    C2704.m8256(C1377.m4832(f43951, 295, 6, i20));
                    break;
                case -1608111156:
                case 703314092:
                    iM450212 = iM450212;
                    editText = editText;
                    sb2 = sb2;
                    i19 = i19;
                    z2 = z2;
                    s = f43951[249];
                    i22 = s * 2;
                    if (C1189.f5284 > 0) {
                        iM11308 = C19806.m45029("۟ۖ") ^ i15;
                        i6 = ((iM11308 ^ i16) * (-14843)) ^ 927192636;
                        i7 = -138632528;
                        i12 = iM11308 ^ i7;
                        z2 = z2;
                        sb2 = sb2;
                        int i216 = i19;
                        editText = editText;
                        i17 = i6;
                        i19 = i216;
                        int i217 = iM450212;
                        i18 = i12;
                        iM450212 = i217;
                    } else {
                        iM450212 = iM450212;
                        int iM450215 = (C19806.m45029("ۜۖ") + i15) * (-87);
                        int i31 = ((iM450215 ^ i16) * 7633) ^ 1312978272;
                        i18 = iM450215 ^ 368102180;
                        i19 = i19;
                        editText = editText;
                        i17 = i31;
                        z2 = z2;
                        sb2 = sb2;
                    }
                    break;
                case -1601391371:
                case -1043795905:
                    RunnableC1895.m6170();
                    if (C1398.f5802 <= 0) {
                        editText = editText;
                        sb2 = sb2;
                        i19 = i19;
                        z2 = z2;
                        int iM450216 = (C19806.m45029("ۜۖ") + i15) * (-87);
                        int i32 = ((iM450216 ^ i16) * 7633) ^ 1312978272;
                        i18 = iM450216 ^ 368102180;
                        i19 = i19;
                        editText = editText;
                        i17 = i32;
                        z2 = z2;
                        sb2 = sb2;
                    } else {
                        iM450212 = iM450212;
                        iM11309 = (C19806.m45029("᩷ۨ") ^ i15) * 15;
                        i8 = ((iM11309 ^ i16) * (-16413)) ^ (-1582233766);
                        i9 = -884467343;
                        i10 = iM450212;
                        i18 = iM11309 ^ i9;
                        i17 = i8;
                        iM450212 = i10;
                    }
                    break;
                case -1537628661:
                case -279678246:
                    C2124.m6673();
                    C0526.m2437();
                    break;
                case -1531870972:
                case 580906067:
                    editText = editText;
                    upperCase = C1937.m6290(C2124.m6674(C3577.m10576(editText))).toUpperCase(Locale.ROOT);
                    str = upperCase;
                    iM11308 = (ThreadFactoryC3888.m11306("ۜۙ") ^ i16) * 73;
                    i6 = ((iM11308 ^ i15) * 19881) ^ (-449927646);
                    i7 = -2130781039;
                    i12 = iM11308 ^ i7;
                    z2 = z2;
                    sb2 = sb2;
                    int i218 = i19;
                    editText = editText;
                    i17 = i6;
                    i19 = i218;
                    int i219 = iM450212;
                    i18 = i12;
                    iM450212 = i219;
                    break;
                case -1516620084:
                case -1086562136:
                    iM450212 = iM450212;
                    itM9863 = ViewTreeObserverOnPreDrawListenerC3327.m9863(this.f43959);
                    int iM113013 = (i15 - ThreadFactoryC3888.m11306("ᩴۗ")) * (-65);
                    int i33 = ((iM113013 ^ i16) * (-30883)) ^ (-2102168976);
                    i5 = iM113013 ^ 232020228;
                    editText = editText;
                    i17 = i33;
                    i10 = iM450212;
                    i18 = i5;
                    iM450212 = i10;
                    break;
                case -1479419451:
                case 1547577092:
                    iM450212 = iM450212;
                    editText = editText;
                    sb2 = sb2;
                    i19 = i19;
                    z2 = z2;
                    if (!str.matches(C1189.m4365(f43951, 253, 23, i20))) {
                        iM11308 = (ThreadFactoryC3888.m11306("᩸ܽ") + i15) * (-63);
                        i6 = ((iM11308 ^ i16) * (-3569)) ^ (-1970073879);
                        i7 = 386531006;
                        i12 = iM11308 ^ i7;
                        z2 = z2;
                        sb2 = sb2;
                        int i2110 = i19;
                        editText = editText;
                        i17 = i6;
                        i19 = i2110;
                        int i2111 = iM450212;
                        i18 = i12;
                        iM450212 = i2111;
                    } else {
                        i19 = i19;
                        iM11307 = C19806.m45029("ᩳ᩷") ^ i15;
                        i3 = ((iM11307 ^ i16) * (-7345)) ^ 1671259878;
                        i4 = 1285947367;
                        i5 = iM11307 ^ i4;
                        editText = editText;
                        i17 = i3;
                        z2 = z2;
                        sb2 = sb2;
                        i10 = iM450212;
                        i18 = i5;
                        iM450212 = i10;
                    }
                    break;
                case -1303056827:
                case 1682242856:
                    editText = editText;
                    upperCase = "";
                    str = upperCase;
                    iM11308 = (ThreadFactoryC3888.m11306("ۜۙ") ^ i16) * 73;
                    i6 = ((iM11308 ^ i15) * 19881) ^ (-449927646);
                    i7 = -2130781039;
                    i12 = iM11308 ^ i7;
                    z2 = z2;
                    sb2 = sb2;
                    int i2112 = i19;
                    editText = editText;
                    i17 = i6;
                    i19 = i2112;
                    int i2113 = iM450212;
                    i18 = i12;
                    iM450212 = i2113;
                    break;
                case -1218015894:
                case -619353314:
                    iM450212 = iM450212;
                    c14078 = (C14078) C0216.m1584(itM9863);
                    if (!c14078.m34063()) {
                        int iM113014 = (i15 - ThreadFactoryC3888.m11306("ᩴۗ")) * (-65);
                        int i34 = ((iM113014 ^ i16) * (-30883)) ^ (-2102168976);
                        i5 = iM113014 ^ 232020228;
                        editText = editText;
                        i17 = i34;
                        i10 = iM450212;
                        i18 = i5;
                        iM450212 = i10;
                    } else {
                        iM11309 = ThreadFactoryC3888.m11306("᩹֡") ^ i15;
                        i8 = ((iM11309 ^ i16) * (-8441)) ^ (-1859031272);
                        i9 = -606298304;
                        i10 = iM450212;
                        i18 = iM11309 ^ i9;
                        i17 = i8;
                        iM450212 = i10;
                    }
                    break;
                case -1204236917:
                case 507153570:
                    C1419.m4973();
                    iM450212 = iM450212;
                    iM11309 = (C19806.m45029("᩷ۨ") ^ i15) * 15;
                    i8 = ((iM11309 ^ i16) * (-16413)) ^ (-1582233766);
                    i9 = -884467343;
                    i10 = iM450212;
                    i18 = iM11309 ^ i9;
                    i17 = i8;
                    iM450212 = i10;
                    break;
                case -1108860569:
                case -80101580:
                    if (C1461.f5957 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۬ۡ") ^ i16;
                        i = ((iM11306 ^ i15) * (-185)) ^ (-2081889009);
                        i2 = 1805283195;
                        i18 = iM11306 ^ i2;
                        i17 = i;
                    } else {
                        iM450212 = iM450212;
                        editText = editText;
                        sb = sb2;
                        i19 = i19;
                        z = z2;
                        iM450210 = C19806.m45029("ܺۙ") ^ i15;
                        i13 = ((iM450210 ^ i16) * 13235) ^ (-906903077);
                        i14 = 1623851863;
                        int i35 = i19;
                        editText = editText;
                        i17 = i13;
                        z2 = z;
                        sb2 = sb;
                        iM450212 = iM450212;
                        i18 = iM450210 ^ i14;
                        i19 = i35;
                    }
                    break;
                case -1087446262:
                case 1604624177:
                    i20 = 56182;
                    iM11308 = (C19806.m45029("۬ۖ") + i16) * (-117);
                    i6 = ((iM11308 ^ i15) * (-29897)) ^ 294957960;
                    i7 = -62475142;
                    i12 = iM11308 ^ i7;
                    z2 = z2;
                    sb2 = sb2;
                    int i2114 = i19;
                    editText = editText;
                    i17 = i6;
                    i19 = i2114;
                    int i2115 = iM450212;
                    i18 = i12;
                    iM450212 = i2115;
                    break;
                case -1031316186:
                case -361512942:
                    CallableC1627.m5507();
                    if (C1875.f7103 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻ۛ") ^ i15) * 5;
                        i = ((iM11306 ^ i16) * 7955) ^ 1939904305;
                        i2 = 1010362862;
                        i18 = iM11306 ^ i2;
                        i17 = i;
                    } else {
                        iM450212 = iM450212;
                        iM11309 = (C19806.m45029("᩷ۨ") ^ i15) * 15;
                        i8 = ((iM11309 ^ i16) * (-16413)) ^ (-1582233766);
                        i9 = -884467343;
                        i10 = iM450212;
                        i18 = iM11309 ^ i9;
                        i17 = i8;
                        iM450212 = i10;
                    }
                    break;
                case -957349593:
                case 951819618:
                    c22381 = null;
                    c22382 = c22381;
                    iM11309 = C19806.m45029("۫ܿ") ^ i16;
                    i8 = ((iM11309 ^ i15) * (-29563)) ^ (-1767717570);
                    i9 = 199267596;
                    i10 = iM450212;
                    i18 = iM11309 ^ i9;
                    i17 = i8;
                    iM450212 = i10;
                    break;
                case -956174114:
                case 1338804598:
                    popupWindow.setOutsideTouchable(z2);
                    popupWindow.setContentView(viewM9787);
                    iM450212 = 2100191160 ^ C19806.m45029(C0817.m3406(f43951, 301, 3, i20));
                    if (C1460.f5948 < 0) {
                        iM11306 = (i16 - ThreadFactoryC3888.m11306("ܶ֫")) * (-45);
                        i = ((iM11306 ^ i15) * 22021) ^ 136364603;
                        i2 = 968332464;
                        i18 = iM11306 ^ i2;
                        i17 = i;
                    } else {
                        editText = editText;
                        sb2 = sb2;
                        i19 = i19;
                        z2 = z2;
                        int iM450217 = (C19806.m45029("ۜۖ") + i15) * (-87);
                        int i36 = ((iM450217 ^ i16) * 7633) ^ 1312978272;
                        i18 = iM450217 ^ 368102180;
                        i19 = i19;
                        editText = editText;
                        i17 = i36;
                        z2 = z2;
                        sb2 = sb2;
                    }
                    break;
                case -932516710:
                case 1220086978:
                    iM450212 = iM450212;
                    editText = editText;
                    sb2 = sb2;
                    i19 = i19;
                    z2 = z2;
                    viewM1436 = RunnableC0195.m1436(this, ThreadFactoryC3888.m11306(C1937.m6288(f43951, 276, 3, i20)) ^ 2129894057);
                    if (C2332.m7079() > 0) {
                        iM11308 = (ThreadFactoryC3888.m11306("ۨ᩷") + i15) * 19;
                        i6 = ((iM11308 ^ i16) * (-30275)) ^ (-2139192259);
                        i7 = -1305566243;
                        i12 = iM11308 ^ i7;
                        z2 = z2;
                        sb2 = sb2;
                        int i2116 = i19;
                        editText = editText;
                        i17 = i6;
                        i19 = i2116;
                        int i2117 = iM450212;
                        i18 = i12;
                        iM450212 = i2117;
                    } else {
                        iM450212 = iM450212;
                        int iM450218 = (C19806.m45029("ۜۖ") + i15) * (-87);
                        int i37 = ((iM450218 ^ i16) * 7633) ^ 1312978272;
                        i18 = iM450218 ^ 368102180;
                        i19 = i19;
                        editText = editText;
                        i17 = i37;
                        z2 = z2;
                        sb2 = sb2;
                    }
                    break;
                case -865119184:
                case 1866196282:
                    popupWindow.setAnimationStyle(iM450212);
                    popupWindow.showAtLocation(C3660.m10777(this).getDecorView(), 81, i19, i19);
                    popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.ۡ᩷ۘ
                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            ViewOnClickListenerC13209 viewOnClickListenerC13209 = null;
                            Window windowM10777 = null;
                            WindowManager.LayoutParams attributes2 = null;
                            float f = 0.0f;
                            Window windowM6910 = null;
                            int i38 = 0;
                            int i39 = -2046771247;
                            int i40 = AbstractC0464.f2088;
                            int i41 = ThreadFactoryC3888.f14547;
                            int iM450219 = (C19806.m45029("֨᩹") ^ i40) * (-5);
                            int i42 = ((iM450219 ^ i41) * 19767) ^ 969677989;
                            int i43 = -1640708140;
                            while (true) {
                                i39 = ((((i39 ^ i41) * (-14219)) >> 31) & i42) ^ (iM450219 ^ i43);
                                switch (i39) {
                                    case -2079156958:
                                    case 2104644463:
                                        attributes2 = windowM10777.getAttributes();
                                        f = 1.0f;
                                        if (C3743.m10966() <= 0) {
                                            iM450219 = C19806.m45029("ۛۚ") ^ i40;
                                            i42 = ((iM450219 ^ i41) * (-13335)) ^ (-101904110);
                                            i43 = -1972002124;
                                        } else {
                                            iM450219 = C19806.m45029("ܶ᩵") ^ i40;
                                            i42 = ((iM450219 ^ i41) * 21345) ^ 717325345;
                                            i43 = 1476861853;
                                        }
                                        break;
                                    case -1885228214:
                                    case -1792890271:
                                        if (AbstractC0464.f2088 <= 0) {
                                            iM450219 = C19806.m45029("ᩳۨ") ^ i41;
                                            i42 = ((iM450219 ^ i40) * 22559) ^ (-1062260422);
                                            i43 = -1745926863;
                                        } else {
                                            iM450219 = (i40 - ThreadFactoryC3888.m11306("ۖ᩸")) * (-107);
                                            i42 = ((iM450219 ^ i41) * 20371) ^ 649287220;
                                            i43 = 1424700589;
                                        }
                                        break;
                                    case -1692185635:
                                    case 1888656084:
                                        i38 = 2;
                                        if (C1875.m6086() != 0) {
                                            iM450219 = (i40 - C19806.m45029("ᩴۧ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i42 = ((iM450219 ^ i41) * 5425) ^ 105323201;
                                            i43 = 180683005;
                                        } else {
                                            iM450219 = (i40 - ThreadFactoryC3888.m11306("ۚۚ")) * 7;
                                            i42 = ((iM450219 ^ i41) * (-5947)) ^ 1261019126;
                                            i43 = -791130229;
                                        }
                                        break;
                                    case -1621924539:
                                    case -1166717734:
                                        windowM6910.clearFlags(i38);
                                        C2249.m6910(viewOnClickListenerC13209).setAttributes(attributes2);
                                        break;
                                    case -1596176276:
                                    case -68008757:
                                        windowM10777 = C3660.m10777(viewOnClickListenerC13209);
                                        if (C2477.f9839 <= 0) {
                                            iM450219 = ThreadFactoryC3888.m11306("᩺᩶") ^ i40;
                                            i42 = ((iM450219 ^ i41) * (-7249)) ^ (-1916105026);
                                            i43 = -1930162765;
                                        } else {
                                            iM450219 = (ThreadFactoryC3888.m11306("ܽ᩻") + i41) * 61;
                                            i42 = ((iM450219 ^ i40) * (-635)) ^ (-529996740);
                                            i43 = -394134859;
                                        }
                                        break;
                                    case -1376689049:
                                    case 1539973380:
                                        viewOnClickListenerC13209 = this.f31059;
                                        if (RunnableC1606.f6488 >= 0) {
                                            iM450219 = (i40 - C19806.m45029("ᩴۧ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i42 = ((iM450219 ^ i41) * 5425) ^ 105323201;
                                            i43 = 180683005;
                                        } else {
                                            iM450219 = C19806.m45029("ۡۜ") ^ i41;
                                            i42 = ((iM450219 ^ i40) * 15463) ^ 1218752815;
                                            i43 = -155246989;
                                        }
                                        break;
                                    case -1047530016:
                                    case 1708868112:
                                        AbstractC0464.m2313();
                                        break;
                                    case -874889672:
                                    case 6639941:
                                        attributes2.alpha = f;
                                        windowM6910 = C2249.m6910(viewOnClickListenerC13209);
                                        if (C3722.m10894() <= 0) {
                                            iM450219 = ThreadFactoryC3888.m11306("᩺᩶") ^ i40;
                                            i42 = ((iM450219 ^ i41) * (-7249)) ^ (-1916105026);
                                            i43 = -1930162765;
                                        } else {
                                            iM450219 = (i41 - C19806.m45029("۬ۚ")) * 11;
                                            i42 = ((iM450219 ^ i40) * 5387) ^ (-252204370);
                                            i43 = -961548122;
                                        }
                                        break;
                                    case -832497454:
                                    case 1530412842:
                                        if (C1875.f7103 >= 0) {
                                            iM450219 = ThreadFactoryC3888.m11306("᩺᩶") ^ i40;
                                            i42 = ((iM450219 ^ i41) * (-7249)) ^ (-1916105026);
                                            i43 = -1930162765;
                                        } else {
                                            iM450219 = ThreadFactoryC3888.m11306("ܿܶ") ^ i40;
                                            i42 = ((iM450219 ^ i41) * 26761) ^ (-1037847665);
                                            i43 = 1471264762;
                                        }
                                        break;
                                    case -770191668:
                                    case 1895417090:
                                        if (C1066.f4915 <= 0) {
                                            iM450219 = ThreadFactoryC3888.m11306("᩺᩶") ^ i40;
                                            i42 = ((iM450219 ^ i41) * (-7249)) ^ (-1916105026);
                                            i43 = -1930162765;
                                        } else {
                                            iM450219 = (i41 - C19806.m45029("ۤۤ")) * 123;
                                            i42 = ((iM450219 ^ i40) * (-5303)) ^ 1705486792;
                                            i43 = 1718117282;
                                        }
                                        break;
                                    case -728369752:
                                    case 367131431:
                                        C0216.m1591();
                                        if (!C19806.m45024()) {
                                            iM450219 = (i40 - C19806.m45029("ᩴۧ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i42 = ((iM450219 ^ i41) * 5425) ^ 105323201;
                                            i43 = 180683005;
                                        } else {
                                            iM450219 = (i41 - C19806.m45029("ۤۤ")) * 123;
                                            i42 = ((iM450219 ^ i40) * (-5303)) ^ 1705486792;
                                            i43 = 1718117282;
                                        }
                                        break;
                                    case -668515610:
                                    case -582099751:
                                        int i44 = ViewOnClickListenerC13209.f43954;
                                        if (C7105.m18985()) {
                                            iM450219 = C19806.m45029("ᩳۨ") ^ i41;
                                            i42 = ((iM450219 ^ i40) * 22559) ^ (-1062260422);
                                            i43 = -1745926863;
                                        } else {
                                            iM450219 = ThreadFactoryC3888.m11306("᩶۬") ^ i40;
                                            i42 = ((iM450219 ^ i41) * 15701) ^ (-749528179);
                                            i43 = -1225547382;
                                        }
                                        break;
                                    case -419349042:
                                    case 1759824741:
                                        if (C1066.f4915 > 0) {
                                            iM450219 = (i40 - C19806.m45029("ᩴۧ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i42 = ((iM450219 ^ i41) * 5425) ^ 105323201;
                                            i43 = 180683005;
                                        } else {
                                            iM450219 = C19806.m45029("ᩳۨ") ^ i41;
                                            i42 = ((iM450219 ^ i40) * 22559) ^ (-1062260422);
                                            i43 = -1745926863;
                                        }
                                        break;
                                    case -292409957:
                                    case 534655983:
                                        if (C2642.m8171() != 0) {
                                            iM450219 = C19806.m45029("ᩳۨ") ^ i41;
                                            i42 = ((iM450219 ^ i40) * 22559) ^ (-1062260422);
                                            i43 = -1745926863;
                                        } else {
                                            iM450219 = C19806.m45029("ܺ᩹") ^ i41;
                                            i42 = ((iM450219 ^ i40) * 25909) ^ 257734132;
                                            i43 = 224087889;
                                        }
                                        break;
                                    case -234809327:
                                    case 265545482:
                                        if (C3286.f12186) {
                                            iM450219 = C19806.m45029("ᩳۨ") ^ i41;
                                            i42 = ((iM450219 ^ i40) * 22559) ^ (-1062260422);
                                            i43 = -1745926863;
                                        } else {
                                            iM450219 = (C19806.m45029("۫ۙ") + i41) * (-97);
                                            i42 = ((iM450219 ^ i40) * (-28399)) ^ (-2139673230);
                                            i43 = -690588785;
                                        }
                                        break;
                                    default:
                                        RunnableC1606.m5473();
                                        iM450219 = C19806.m45029("ᩳۨ") ^ i41;
                                        i42 = ((iM450219 ^ i40) * 22559) ^ (-1062260422);
                                        i43 = -1745926863;
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    break;
                case -786691637:
                case 446211459:
                    C3722.m10890(C2642.m8167(viewM9787, iM450214), 8);
                    iM11309 = ThreadFactoryC3888.m11306("᩹֨") ^ i15;
                    i8 = ((iM11309 ^ i16) * (-6123)) ^ (-1030147303);
                    i9 = -287062272;
                    i10 = iM450212;
                    i18 = iM11309 ^ i9;
                    i17 = i8;
                    iM450212 = i10;
                    break;
                case -755588859:
                case -559390268:
                    StringBuilder sb3 = sb2;
                    C1148.m4223(sb3, C2124.m6690(this, iM113010 ^ i21));
                    String strM6674 = C2124.m6674(sb3);
                    TextView textView2 = textView;
                    MenuItemOnMenuItemClickListenerC3244.m9704(textView2, strM6674);
                    RunnableC1895.m6165(textView2, i19);
                    C1977.m6361(editText);
                    break;
                case -738674862:
                case 1716705830:
                    iM450212 = iM450212;
                    onClickListener = new View.OnClickListener(this) { // from class: l.ۧ᩷ۘ

                        /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ViewOnClickListenerC13209 f38024;

                        {
                            int i38 = 1957057023;
                            int i39 = C10634.f36300;
                            int i40 = MenuItemOnMenuItemClickListenerC3244.f12064;
                            int iM113015 = (i40 - ThreadFactoryC3888.m11306("ܶܽ")) * (-71);
                            int i41 = ((iM113015 ^ i39) * 23329) ^ (-780326306);
                            int i42 = -1810453673;
                            while (true) {
                                i38 = ((((i38 ^ i39) * (-1115)) >> 31) & i41) ^ (iM113015 ^ i42);
                                switch (i38) {
                                    case -1775094079:
                                    case 883868120:
                                        if (C3660.m10791() != 0) {
                                            iM113015 = ThreadFactoryC3888.m11306("ۖܽ") ^ i40;
                                            i41 = ((iM113015 ^ i39) * (-15573)) ^ (-2146963760);
                                            i42 = -251507221;
                                        } else {
                                            iM113015 = (ThreadFactoryC3888.m11306("ۗۙ") ^ i39) * (-51);
                                            i41 = ((iM113015 ^ i40) * (-2519)) ^ 1915569779;
                                            i42 = -1596015474;
                                        }
                                        break;
                                    case -1757533836:
                                    case 1429084305:
                                        return;
                                    case -1552096486:
                                    case 1391652411:
                                        if (C2249.f8050 >= 0) {
                                            iM113015 = C19806.m45029("ۧۛ") ^ i40;
                                            i41 = ((iM113015 ^ i39) * (-19163)) ^ 585826610;
                                            i42 = 1561290734;
                                        } else {
                                            iM113015 = (ThreadFactoryC3888.m11306("᩷᩻") ^ i40) * (-9);
                                            i41 = ((iM113015 ^ i39) * (-27497)) ^ 2009320887;
                                            i42 = 64868996;
                                        }
                                        break;
                                    case -1350304495:
                                    case 2127927117:
                                        if (C1148.m4232() <= 0) {
                                            iM113015 = (ThreadFactoryC3888.m11306("ܳ᩷") + i39) * q.h;
                                            i41 = ((iM113015 ^ i40) * 13093) ^ (-1804258820);
                                            i42 = 2138464728;
                                        } else {
                                            iM113015 = (ThreadFactoryC3888.m11306("ۚ۫") + i40) * (-13);
                                            i41 = ((iM113015 ^ i39) * 13621) ^ 845303145;
                                            i42 = -641996861;
                                        }
                                        break;
                                    case -1302180527:
                                    case 1436401236:
                                        if (C1460.f5948 < 0) {
                                            iM113015 = (C19806.m45029("ۚۤ") ^ i39) * (-29);
                                            i41 = ((iM113015 ^ i40) * (-14761)) ^ (-615713490);
                                            i42 = 1654943138;
                                        } else {
                                            iM113015 = (ThreadFactoryC3888.m11306("ܳ᩷") + i39) * q.h;
                                            i41 = ((iM113015 ^ i40) * 13093) ^ (-1804258820);
                                            i42 = 2138464728;
                                        }
                                        break;
                                    case -1244250243:
                                    case 190981467:
                                        if (C0050.f912 <= 0) {
                                            iM113015 = (ThreadFactoryC3888.m11306("ܳ᩷") + i39) * q.h;
                                            i41 = ((iM113015 ^ i40) * 13093) ^ (-1804258820);
                                            i42 = 2138464728;
                                        } else {
                                            iM113015 = ThreadFactoryC3888.m11306("ܿۗ") ^ i39;
                                            i41 = ((iM113015 ^ i40) * (-21705)) ^ 833130516;
                                            i42 = -645735537;
                                        }
                                        break;
                                    case -894464995:
                                    case -143807466:
                                        if (C1937.f7317 >= 0) {
                                            iM113015 = C19806.m45029("ۧۛ") ^ i40;
                                            i41 = ((iM113015 ^ i39) * (-19163)) ^ 585826610;
                                            i42 = 1561290734;
                                        } else {
                                            iM113015 = (C19806.m45029("ᩳ᩶") + i39) * 37;
                                            i41 = ((iM113015 ^ i40) * 5775) ^ (-1359760425);
                                            i42 = -1647536816;
                                        }
                                        break;
                                    case -860008409:
                                    case 148306178:
                                        this.f38024 = this;
                                        if (C2249.f8050 >= 0) {
                                            iM113015 = (C19806.m45029("ۚۤ") ^ i39) * (-29);
                                            i41 = ((iM113015 ^ i40) * (-14761)) ^ (-615713490);
                                            i42 = 1654943138;
                                        } else {
                                            iM113015 = C19806.m45029("᩸ܽ") ^ i39;
                                            i41 = ((iM113015 ^ i40) * 24247) ^ (-86145938);
                                            i42 = -1411122612;
                                        }
                                        break;
                                    case -838708642:
                                    case 33446550:
                                        if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                                            iM113015 = (C19806.m45029("ۚۤ") ^ i39) * (-29);
                                            i41 = ((iM113015 ^ i40) * (-14761)) ^ (-615713490);
                                            i42 = 1654943138;
                                        } else {
                                            iM113015 = (i40 - C19806.m45029("᩸᩶")) * 19;
                                            i41 = ((iM113015 ^ i39) * 14309) ^ (-730419703);
                                            i42 = -968458653;
                                        }
                                        break;
                                    case 221245219:
                                    case 1042545889:
                                        MenuItemOnMenuItemClickListenerC3244.m9701();
                                        if (C1977.f7413 > 0) {
                                            iM113015 = ThreadFactoryC3888.m11306("ۖܽ") ^ i40;
                                            i41 = ((iM113015 ^ i39) * (-15573)) ^ (-2146963760);
                                            i42 = -251507221;
                                        } else {
                                            iM113015 = (ThreadFactoryC3888.m11306("ܳ᩷") + i39) * q.h;
                                            i41 = ((iM113015 ^ i40) * 13093) ^ (-1804258820);
                                            i42 = 2138464728;
                                        }
                                        break;
                                    case 334097198:
                                    case 1714719413:
                                        if (C0817.f3443) {
                                            iM113015 = C19806.m45029("ᩳۘ") ^ i39;
                                            i41 = ((iM113015 ^ i40) * (-9765)) ^ (-166664344);
                                            i42 = 1214933688;
                                        } else {
                                            iM113015 = (C19806.m45029("ۚۤ") ^ i39) * (-29);
                                            i41 = ((iM113015 ^ i40) * (-14761)) ^ (-615713490);
                                            i42 = 1654943138;
                                        }
                                        break;
                                    case 350502370:
                                    case 2004345939:
                                        if (C3722.f13525 <= 0) {
                                            iM113015 = C19806.m45029("ۧۛ") ^ i40;
                                            i41 = ((iM113015 ^ i39) * (-19163)) ^ 585826610;
                                            i42 = 1561290734;
                                        } else {
                                            iM113015 = (i40 - C19806.m45029("ۡ۬")) * 19;
                                            i41 = ((iM113015 ^ i39) * (-32647)) ^ (-912485813);
                                            i42 = 1553250421;
                                        }
                                        break;
                                    case 660529588:
                                    case 1720107164:
                                        if (C3577.m10565()) {
                                            iM113015 = C19806.m45029("ۚᩴ") ^ i40;
                                            i41 = ((iM113015 ^ i39) * 13701) ^ (-1387756155);
                                            i42 = -952733224;
                                        } else {
                                            iM113015 = (ThreadFactoryC3888.m11306("ܳ᩷") + i39) * q.h;
                                            i41 = ((iM113015 ^ i40) * 13093) ^ (-1804258820);
                                            i42 = 2138464728;
                                        }
                                        break;
                                    case 983516299:
                                    case 1582369155:
                                        C0278.m1789();
                                        throw new RuntimeException();
                                    case 1088662658:
                                    case 1342210939:
                                        C2704.m8255();
                                        C3722.m10894();
                                        iM113015 = (ThreadFactoryC3888.m11306("ܳ᩷") + i39) * q.h;
                                        i41 = ((iM113015 ^ i40) * 13093) ^ (-1804258820);
                                        i42 = 2138464728;
                                        break;
                                    default:
                                        C1875.m6086();
                                        if (AbstractC0464.f2088 > 0) {
                                            iM113015 = ThreadFactoryC3888.m11306("ۖܽ") ^ i40;
                                            i41 = ((iM113015 ^ i39) * (-15573)) ^ (-2146963760);
                                            i42 = -251507221;
                                        } else {
                                            iM113015 = (ThreadFactoryC3888.m11306("ۤۗ") ^ i40) * (-125);
                                            i41 = ((iM113015 ^ i39) * (-25463)) ^ 1361306842;
                                            i42 = 876528920;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i38 = 0;
                            String str2 = null;
                            int i39 = 1179640775;
                            int i40 = C1461.f5957;
                            int i41 = C1398.f5802;
                            int iM450219 = (C19806.m45029("֨ۨ") ^ i40) * 47;
                            int i42 = ((iM450219 ^ i41) * (-23991)) ^ (-1487300018);
                            int i43 = 1845866078;
                            while (true) {
                                i39 = ((((i39 ^ i41) * (-21329)) >> 31) & i42) ^ (iM450219 ^ i43);
                                switch (i39) {
                                    case -1955594471:
                                    case -22047603:
                                        ViewOnClickListenerC13209.m32683(this.f38024, popupWindow, i38, str2, view);
                                        break;
                                    case -1931924317:
                                    case -1805329362:
                                        C1419.m4973();
                                        if (C1398.f5802 <= 0) {
                                            iM450219 = (C19806.m45029("᩸᩺") + i41) * 95;
                                            i42 = ((iM450219 ^ i40) * (-19529)) ^ 1924226521;
                                            i43 = 882807573;
                                        } else {
                                            iM450219 = (i41 - C19806.m45029("᩸۟")) * (-93);
                                            i42 = ((iM450219 ^ i40) * 31361) ^ (-1234623140);
                                            i43 = 452130345;
                                        }
                                        break;
                                    case -1802702367:
                                    case -1421035984:
                                        if (RunnableC3388.f12514 >= 0) {
                                            iM450219 = (i40 - C19806.m45029("ܺ֡")) * (-53);
                                            i42 = ((iM450219 ^ i41) * 29401) ^ (-190394790);
                                            i43 = 1643300587;
                                        } else {
                                            iM450219 = (C19806.m45029("ܶۛ") ^ i40) * (-39);
                                            i42 = ((iM450219 ^ i41) * 4363) ^ (-602132454);
                                            i43 = -846446348;
                                        }
                                        break;
                                    case -1578325706:
                                    case -1222054026:
                                        str2 = str;
                                        if (C0817.f3443) {
                                            iM450219 = C19806.m45029("᩷ܿ") ^ i40;
                                            i42 = ((iM450219 ^ i41) * (-32421)) ^ (-1762916890);
                                            i43 = -1496739194;
                                        } else {
                                            iM450219 = C19806.m45029("᩺᩵") ^ i40;
                                            i42 = ((iM450219 ^ i41) * (-30739)) ^ (-2032068010);
                                            i43 = 1513012863;
                                        }
                                        break;
                                    case -1407678467:
                                    case 191239491:
                                        if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                                            iM450219 = (C19806.m45029("᩸᩺") + i41) * 95;
                                            i42 = ((iM450219 ^ i40) * (-19529)) ^ 1924226521;
                                            i43 = 882807573;
                                        } else {
                                            iM450219 = (C19806.m45029("ۚۙ") ^ i40) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i42 = ((iM450219 ^ i41) * 25781) ^ (-1204567438);
                                            i43 = -193990320;
                                        }
                                        break;
                                    case -965835807:
                                    case 1173865506:
                                        if (RunnableC1564.f6300) {
                                            iM450219 = (i40 - C19806.m45029("ܺ֡")) * (-53);
                                            i42 = ((iM450219 ^ i41) * 29401) ^ (-190394790);
                                            i43 = 1643300587;
                                        } else {
                                            iM450219 = (i41 - ThreadFactoryC3888.m11306("ۧܿ")) * (-17);
                                            i42 = ((iM450219 ^ i40) * 11523) ^ 1716490086;
                                            i43 = 683675560;
                                        }
                                        break;
                                    case -897070668:
                                    case 801414147:
                                        if (C3286.m9798() <= 0) {
                                            iM450219 = (i41 - C19806.m45029("᩸۟")) * (-93);
                                            i42 = ((iM450219 ^ i40) * 31361) ^ (-1234623140);
                                            i43 = 452130345;
                                        } else {
                                            iM450219 = (i40 - C19806.m45029("ܺ֡")) * (-53);
                                            i42 = ((iM450219 ^ i41) * 29401) ^ (-190394790);
                                            i43 = 1643300587;
                                        }
                                        break;
                                    case -758444481:
                                    case 548608420:
                                        C0526.m2437();
                                        C0797.m3359();
                                        break;
                                    case -687015701:
                                    case -434468098:
                                        if (C0797.f3386) {
                                            iM450219 = (i40 - C19806.m45029("ܺ֡")) * (-53);
                                            i42 = ((iM450219 ^ i41) * 29401) ^ (-190394790);
                                            i43 = 1643300587;
                                        } else {
                                            iM450219 = (C19806.m45029("ܳۘ") + i40) * (-63);
                                            i42 = ((iM450219 ^ i41) * 18941) ^ 2030316442;
                                            i43 = 773436010;
                                        }
                                        break;
                                    case -531395280:
                                    case 38325479:
                                        C19806.m45024();
                                        if (C1668.f6641 >= 0) {
                                            iM450219 = (i40 - ThreadFactoryC3888.m11306("᩻᩹")) * 35;
                                            i42 = ((iM450219 ^ i41) * (-31589)) ^ 1100337899;
                                            i43 = -1715814452;
                                        } else {
                                            iM450219 = (i40 - C19806.m45029("ܺ֡")) * (-53);
                                            i42 = ((iM450219 ^ i41) * 29401) ^ (-190394790);
                                            i43 = 1643300587;
                                        }
                                        break;
                                    case -326520981:
                                    case 1011224300:
                                        if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                                            iM450219 = C19806.m45029("֨ۚ") ^ i41;
                                            i42 = ((iM450219 ^ i40) * 11859) ^ (-99165587);
                                            i43 = 37929348;
                                        } else {
                                            iM450219 = (i41 - C19806.m45029("᩸۟")) * (-93);
                                            i42 = ((iM450219 ^ i40) * 31361) ^ (-1234623140);
                                            i43 = 452130345;
                                        }
                                        break;
                                    case -67580583:
                                    case 281316290:
                                        if (C2249.f8050 >= 0) {
                                            iM450219 = C19806.m45029("᩺᩵") ^ i40;
                                            i42 = ((iM450219 ^ i41) * (-30739)) ^ (-2032068010);
                                            i43 = 1513012863;
                                        } else {
                                            iM450219 = (ThreadFactoryC3888.m11306("ۖۡ") + i41) * 5;
                                            i42 = ((iM450219 ^ i40) * (-5041)) ^ (-1901196279);
                                            i43 = 1354252859;
                                        }
                                        break;
                                    case 153595990:
                                    case 1082458539:
                                        C0278.m1789();
                                        C10634.m26820();
                                        iM450219 = (i40 - C19806.m45029("ܺ֡")) * (-53);
                                        i42 = ((iM450219 ^ i41) * 29401) ^ (-190394790);
                                        i43 = 1643300587;
                                        break;
                                    case 660960109:
                                    case 1419837683:
                                        if (C1668.f6641 >= 0) {
                                            iM450219 = (i40 - C19806.m45029("ܺ֡")) * (-53);
                                            i42 = ((iM450219 ^ i41) * 29401) ^ (-190394790);
                                            i43 = 1643300587;
                                        } else {
                                            iM450219 = (C19806.m45029("ܰ۠") ^ i41) * 5;
                                            i42 = ((iM450219 ^ i40) * 25735) ^ (-1588803009);
                                            i43 = 2082580401;
                                        }
                                        break;
                                    case 693584459:
                                    case 2089073954:
                                        if (C3660.m10791() != 0) {
                                            iM450219 = (i40 - C19806.m45029("ܺ֡")) * (-53);
                                            i42 = ((iM450219 ^ i41) * 29401) ^ (-190394790);
                                            i43 = 1643300587;
                                        } else {
                                            iM450219 = ThreadFactoryC3888.m11306("֡۬") ^ i40;
                                            i42 = ((iM450219 ^ i41) * (-13119)) ^ 278500064;
                                            i43 = -1888915421;
                                        }
                                        break;
                                    default:
                                        i38 = i24;
                                        if (C0216.f1393 != 0) {
                                            iM450219 = (i40 - ThreadFactoryC3888.m11306("᩻᩹")) * 35;
                                            i42 = ((iM450219 ^ i41) * (-31589)) ^ 1100337899;
                                            i43 = -1715814452;
                                        } else {
                                            iM450219 = ThreadFactoryC3888.m11306("ܿ۫") ^ i41;
                                            i42 = ((iM450219 ^ i40) * (-23147)) ^ 499100026;
                                            i43 = -1673708281;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    };
                    iM450213 = C19806.m45029(C1937.m6288(f43951, 286, 3, i20)) ^ 2120204338;
                    if (C1148.m4232() <= 0) {
                        iM11309 = (ThreadFactoryC3888.m11306("۫᩷") ^ i16) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((iM11309 ^ i15) * 2705) ^ 197463961;
                        i9 = 1378728629;
                    } else {
                        iM11309 = (i15 - C19806.m45029("ۜ᩶")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i8 = ((iM11309 ^ i16) * (-9759)) ^ (-1241694415);
                        i9 = 196821939;
                    }
                    i10 = iM450212;
                    i18 = iM11309 ^ i9;
                    i17 = i8;
                    iM450212 = i10;
                    break;
                case -572949963:
                case 1177773855:
                    iM450212 = iM450212;
                    editText = editText;
                    sb2 = sb2;
                    i19 = i19;
                    z2 = z2;
                    if (str.contentEquals(C3577.m10576(editText))) {
                        iM11308 = ThreadFactoryC3888.m11306("᩹ܿ") ^ i16;
                        i6 = ((iM11308 ^ i15) * (-2109)) ^ (-1064839933);
                        i7 = 297386896;
                    } else {
                        iM11308 = C19806.m45029("ۗ۫") ^ i16;
                        i6 = ((iM11308 ^ i15) * (-25055)) ^ (-37525188);
                        i7 = 55521379;
                    }
                    i12 = iM11308 ^ i7;
                    z2 = z2;
                    sb2 = sb2;
                    int i2118 = i19;
                    editText = editText;
                    i17 = i6;
                    i19 = i2118;
                    int i2119 = iM450212;
                    i18 = i12;
                    iM450212 = i2119;
                    break;
                case -307977164:
                case 1904033954:
                    iM450212 = iM450212;
                    editText = editText;
                    sb2 = sb2;
                    i19 = i19;
                    z2 = z2;
                    if (this.f43960.f18787) {
                        iM11308 = (C19806.m45029("֫᩺") ^ i16) * 69;
                        i6 = ((iM11308 ^ i15) * 2549) ^ 1022715533;
                        i7 = -1542057213;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("᩹ܿ") ^ i16;
                        i6 = ((iM11308 ^ i15) * (-2109)) ^ (-1064839933);
                        i7 = 297386896;
                    }
                    i12 = iM11308 ^ i7;
                    z2 = z2;
                    sb2 = sb2;
                    int i21110 = i19;
                    editText = editText;
                    i17 = i6;
                    i19 = i21110;
                    int i21111 = iM450212;
                    i18 = i12;
                    iM450212 = i21111;
                    break;
                case -63663283:
                case 47658885:
                    if (!C3743.f13569) {
                        iM450212 = iM450212;
                        editText = editText;
                        sb = sb2;
                        i19 = i19;
                        z = z2;
                        iM450210 = C19806.m45029("ܺۙ") ^ i15;
                        i13 = ((iM450210 ^ i16) * 13235) ^ (-906903077);
                        i14 = 1623851863;
                        int i38 = i19;
                        editText = editText;
                        i17 = i13;
                        z2 = z;
                        sb2 = sb;
                        iM450212 = iM450212;
                        i18 = iM450210 ^ i14;
                        i19 = i38;
                    } else {
                        iM450212 = iM450212;
                        iM11309 = C19806.m45029("ۡ۬") ^ i16;
                        i8 = ((iM11309 ^ i15) * (-3673)) ^ (-1580055219);
                        i9 = 1428791374;
                        i10 = iM450212;
                        i18 = iM11309 ^ i9;
                        i17 = i8;
                        iM450212 = i10;
                    }
                    break;
                case 101708931:
                case 2061349055:
                    c22381 = (C22381) c14078.getTag();
                    c22382 = c22381;
                    iM11309 = C19806.m45029("۫ܿ") ^ i16;
                    i8 = ((iM11309 ^ i15) * (-29563)) ^ (-1767717570);
                    i9 = 199267596;
                    i10 = iM450212;
                    i18 = iM11309 ^ i9;
                    i17 = i8;
                    iM450212 = i10;
                    break;
                case 127111622:
                case 2130847245:
                    iM450212 = iM450212;
                    i24 = c22382.f73079;
                    popupWindow = new PopupWindow(this);
                    viewM9787 = C3286.m9787(this, ThreadFactoryC3888.m11306(C2642.m8172(f43951, 283, 3, i20)) ^ 2122113944);
                    if (C2642.f10294 <= 0) {
                        iM11309 = C19806.m45029("ۡ۬") ^ i16;
                        i8 = ((iM11309 ^ i15) * (-3673)) ^ (-1580055219);
                        i9 = 1428791374;
                    } else {
                        iM11309 = (ThreadFactoryC3888.m11306("᩺᩺") ^ i16) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i8 = ((iM11309 ^ i15) * 10347) ^ 1200828472;
                        i9 = -1780525707;
                    }
                    i10 = iM450212;
                    i18 = iM11309 ^ i9;
                    i17 = i8;
                    iM450212 = i10;
                    break;
                case 312355112:
                case 1079592203:
                    iM450212 = iM450212;
                    if (C0962.m3748(itM9863)) {
                        iM11309 = C19806.m45029("ۢ֨") ^ i15;
                        i8 = ((iM11309 ^ i16) * 28477) ^ 1867316446;
                        i9 = 375669723;
                    } else {
                        iM11309 = (ThreadFactoryC3888.m11306("᩵ܰ") ^ i16) * 97;
                        i8 = ((iM11309 ^ i15) * (-26609)) ^ (-976699388);
                        i9 = -1100553665;
                    }
                    i10 = iM450212;
                    i18 = iM11309 ^ i9;
                    i17 = i8;
                    iM450212 = i10;
                    break;
                case 386682003:
                case 1339303520:
                    C7105.m18993(C2642.m8167(viewM9787, iM450214), onClickListener);
                    iM11309 = ThreadFactoryC3888.m11306("᩹֨") ^ i15;
                    i8 = ((iM11309 ^ i16) * (-6123)) ^ (-1030147303);
                    i9 = -287062272;
                    i10 = iM450212;
                    i18 = iM11309 ^ i9;
                    i17 = i8;
                    iM450212 = i10;
                    break;
                case 423428541:
                case 2055555772:
                    if (C1066.m4023() > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨۗ") ^ i16;
                        i = ((iM11306 ^ i15) * 23889) ^ (-1157267806);
                        i2 = -1986760434;
                        i18 = iM11306 ^ i2;
                        i17 = i;
                    } else {
                        iM450212 = iM450212;
                        iM11309 = (C19806.m45029("᩷ۨ") ^ i15) * 15;
                        i8 = ((iM11309 ^ i16) * (-16413)) ^ (-1582233766);
                        i9 = -884467343;
                        i10 = iM450212;
                        i18 = iM11309 ^ i9;
                        i17 = i8;
                        iM450212 = i10;
                    }
                    break;
                case 460416757:
                case 908200749:
                    i20 = 52640;
                    iM11308 = (C19806.m45029("۬ۖ") + i16) * (-117);
                    i6 = ((iM11308 ^ i15) * (-29897)) ^ 294957960;
                    i7 = -62475142;
                    i12 = iM11308 ^ i7;
                    z2 = z2;
                    sb2 = sb2;
                    int i21112 = i19;
                    editText = editText;
                    i17 = i6;
                    i19 = i21112;
                    int i21113 = iM450212;
                    i18 = i12;
                    iM450212 = i21113;
                    break;
                case 736434879:
                case 1092080879:
                    iM450212 = iM450212;
                    editText = editText;
                    textView = (TextView) viewM1436;
                    i19 = i19;
                    z = z2;
                    String strM4892 = C1398.m4892(f43951, 279, 1, i20);
                    if (!C3286.f12186) {
                        sb = new StringBuilder(strM4892);
                        iM113010 = ThreadFactoryC3888.m11306(C0817.m3406(f43951, 280, 3, i20));
                        i21 = 2123507495;
                        if (C3743.f13569) {
                            iM450210 = C19806.m45029("ۧܿ") ^ i16;
                            i13 = ((iM450210 ^ i15) * (-27023)) ^ (-2049279027);
                            i14 = 1163419006;
                        } else {
                            iM450210 = C19806.m45029("ܺۙ") ^ i15;
                            i13 = ((iM450210 ^ i16) * 13235) ^ (-906903077);
                            i14 = 1623851863;
                        }
                        int i39 = i19;
                        editText = editText;
                        i17 = i13;
                        z2 = z;
                        sb2 = sb;
                        iM450212 = iM450212;
                        i18 = iM450210 ^ i14;
                        i19 = i39;
                    } else {
                        int iM113015 = (i15 - ThreadFactoryC3888.m11306("᩹ۙ")) * (-53);
                        i6 = ((iM113015 ^ i16) * (-2155)) ^ 1344584805;
                        i12 = iM113015 ^ 383054842;
                        z2 = z;
                        sb2 = null;
                        int i21114 = i19;
                        editText = editText;
                        i17 = i6;
                        i19 = i21114;
                        int i21115 = iM450212;
                        i18 = i12;
                        iM450212 = i21115;
                    }
                    break;
                case 828477490:
                case 1033498301:
                    this.f43961 = z2;
                    m32692();
                    break;
                case 1147483687:
                case 1576059773:
                    C1066.m4023();
                    if (C2871.f10837 < 0) {
                        iM450212 = iM450212;
                        iM11309 = C19806.m45029("ۡ۬") ^ i16;
                        i8 = ((iM11309 ^ i15) * (-3673)) ^ (-1580055219);
                        i9 = 1428791374;
                        i10 = iM450212;
                        i18 = iM11309 ^ i9;
                        i17 = i8;
                        iM450212 = i10;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻ۛ") ^ i15) * 5;
                        i = ((iM11306 ^ i16) * 7955) ^ 1939904305;
                        i2 = 1010362862;
                        i18 = iM11306 ^ i2;
                        i17 = i;
                    }
                    break;
                case 1363357333:
                case 1640697589:
                    iM450212 = iM450212;
                    i19 = i19;
                    sb2 = sb2;
                    z2 = z2;
                    editText = (EditText) C2332.m7083(this, C19806.m45029(C2788.m8470(f43951, 250, 3, i20)) ^ 2098613941);
                    if (this.f43960.f18787) {
                        iM11308 = C19806.m45029("᩻ᩳ") ^ i15;
                        i6 = ((iM11308 ^ i16) * 21533) ^ 1079713579;
                        i7 = -2086750532;
                    } else {
                        iM11308 = (i16 - C19806.m45029("ۖۨ")) * (-127);
                        i6 = ((iM11308 ^ i15) * 7065) ^ (-378146629);
                        i7 = -1521553191;
                    }
                    i12 = iM11308 ^ i7;
                    z2 = z2;
                    sb2 = sb2;
                    int i21116 = i19;
                    editText = editText;
                    i17 = i6;
                    i19 = i21116;
                    int i21117 = iM450212;
                    i18 = i12;
                    iM450212 = i21117;
                    break;
                default:
                    if (!C1668.m5583()) {
                        iM11306 = C19806.m45029("᩸۬") ^ i16;
                        i = ((iM11306 ^ i15) * 5623) ^ (-2063405990);
                        i2 = 310844331;
                        i18 = iM11306 ^ i2;
                        i17 = i;
                    } else {
                        iM450212 = iM450212;
                        iM11309 = C19806.m45029("ۡ۬") ^ i16;
                        i8 = ((iM11309 ^ i15) * (-3673)) ^ (-1580055219);
                        i9 = 1428791374;
                        i10 = iM450212;
                        i18 = iM11309 ^ i9;
                        i17 = i8;
                        iM450212 = i10;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m32687(ViewOnClickListenerC13209 viewOnClickListenerC13209) {
        TextView textView = null;
        boolean z = false;
        CharSequence charSequenceM32680 = null;
        boolean z2 = false;
        int i = -1419133160;
        int i2 = C1460.f5948;
        int i3 = C2642.f10294;
        int iM11306 = (i3 - ThreadFactoryC3888.m11306("ۢ᩹")) * (-43);
        int i4 = ((iM11306 ^ i2) * 6829) ^ (-2092579014);
        int i5 = -1810719193;
        while (true) {
            i = ((((i ^ i2) * (-451)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2028020543:
                case 1965887691:
                    break;
                case -1573705788:
                case -517527539:
                    viewOnClickListenerC13209.f43961 = z2;
                    viewOnClickListenerC13209.m32693();
                    iM11306 = (C19806.m45029("ܿ۬") + i2) * (-41);
                    i4 = ((iM11306 ^ i3) * 30859) ^ 1774995199;
                    i5 = 219320462;
                    break;
                case -1532319102:
                case 315359106:
                    MenuItemOnMenuItemClickListenerC3244.m9704(textView, charSequenceM32680);
                    z2 = false;
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() != 0) {
                        iM11306 = (i3 - C19806.m45029("᩸۟")) * 55;
                        i4 = ((iM11306 ^ i2) * 32641) ^ (-1033861339);
                        i5 = 855170642;
                    } else {
                        iM11306 = (i2 - C19806.m45029("֫ܶ")) * (-83);
                        i4 = ((iM11306 ^ i3) * 31873) ^ 736780429;
                        i5 = 151887057;
                    }
                    break;
                case -1408362253:
                case 321801356:
                    if (C1148.f5161 <= 0) {
                        iM11306 = C19806.m45029("᩵ۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 793) ^ 1145238008;
                        i5 = -2088550571;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳ֨") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM11306 ^ i3) * (-7095)) ^ 1804090298;
                        i5 = 354309387;
                    }
                    break;
                case -1406381840:
                case -1359825024:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۬֫") ^ i3) * (-117);
                        i4 = ((iM11306 ^ i2) * (-14375)) ^ (-29916780);
                        i5 = 1801826396;
                    } else {
                        iM11306 = (C19806.m45029("᩵֡") ^ i3) * 119;
                        i4 = ((iM11306 ^ i2) * 25775) ^ (-1066382549);
                        i5 = -1125524522;
                    }
                    break;
                case -1358820419:
                case -930193039:
                    if (C0817.f3443) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨ᩶") + i3) * (-117);
                        i4 = ((iM11306 ^ i2) * (-28801)) ^ (-427564133);
                        i5 = 1410127055;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳܽ") ^ i3) * (-79);
                        i4 = ((iM11306 ^ i2) * (-14785)) ^ 116766028;
                        i5 = -2129091933;
                    }
                    break;
                case -1268455983:
                case -826815510:
                    if (C0526.f2219) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳܽ") ^ i3) * (-79);
                        i4 = ((iM11306 ^ i2) * (-14785)) ^ 116766028;
                        i5 = -2129091933;
                    } else {
                        iM11306 = (C19806.m45029("᩷᩸") + i2) * (-5);
                        i4 = ((iM11306 ^ i3) * 23341) ^ (-1427220633);
                        i5 = 1139849340;
                    }
                    break;
                case -1075682829:
                case -519929307:
                    RunnableC1606.m5473();
                    if (C2871.f10837 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۬֫") ^ i3) * (-117);
                        i4 = ((iM11306 ^ i2) * (-14375)) ^ (-29916780);
                        i5 = 1801826396;
                    } else {
                        iM11306 = C19806.m45029("᩵ۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 793) ^ 1145238008;
                        i5 = -2088550571;
                    }
                    break;
                case -985160905:
                case 622354296:
                    textView = viewOnClickListenerC13209.f43957;
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = C19806.m45029("᩵ۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 793) ^ 1145238008;
                        i5 = -2088550571;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰ᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-22575)) ^ 739606225;
                        i5 = -1409325395;
                    }
                    break;
                case -644880809:
                case 1952879646:
                    if (C1460.m5050() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳܽ") ^ i3) * (-79);
                        i4 = ((iM11306 ^ i2) * (-14785)) ^ 116766028;
                        i5 = -2129091933;
                    } else {
                        iM11306 = C19806.m45029("ۨ֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-25507)) ^ 1124045873;
                        i5 = 1256515983;
                    }
                    break;
                case -424103957:
                case 1086619558:
                    C7105.m18985();
                    iM11306 = C19806.m45029("᩵ۙ") ^ i2;
                    i4 = ((iM11306 ^ i3) * 793) ^ 1145238008;
                    i5 = -2088550571;
                    break;
                case -405352684:
                case 964952631:
                    C19806.m45024();
                    if (!C7105.m18985()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳܽ") ^ i3) * (-79);
                        i4 = ((iM11306 ^ i2) * (-14785)) ^ 116766028;
                        i5 = -2129091933;
                    } else {
                        iM11306 = C19806.m45029("᩵ۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 793) ^ 1145238008;
                        i5 = -2088550571;
                    }
                    break;
                case -78798585:
                case 1614098241:
                    C3722.m10894();
                    if (C10634.f36300 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۬֫") ^ i3) * (-117);
                        i4 = ((iM11306 ^ i2) * (-14375)) ^ (-29916780);
                        i5 = 1801826396;
                    } else {
                        iM11306 = C19806.m45029("ۙ᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-30249)) ^ 1848206340;
                        i5 = 62956575;
                    }
                    break;
                case 98593022:
                case 361090278:
                    viewOnClickListenerC13209.f43958 = z2;
                    if (viewOnClickListenerC13209.f43961) {
                        iM11306 = C19806.m45029("ۤۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 6315) ^ 28415538;
                        i5 = -21197238;
                    } else {
                        iM11306 = (C19806.m45029("ܿ۬") + i2) * (-41);
                        i4 = ((iM11306 ^ i3) * 30859) ^ 1774995199;
                        i5 = 219320462;
                    }
                    break;
                case 257384575:
                case 1500430003:
                    charSequenceM32680 = m32680(z);
                    if (C1461.f5957 <= 0) {
                        iM11306 = (i3 - C19806.m45029("᩸۟")) * 55;
                        i4 = ((iM11306 ^ i2) * 32641) ^ (-1033861339);
                        i5 = 855170642;
                    } else {
                        iM11306 = (C19806.m45029("ۘܶ") + i3) * (-69);
                        i4 = ((iM11306 ^ i2) * 4707) ^ 364532602;
                        i5 = -562674550;
                    }
                    break;
                case 518699351:
                case 1737916903:
                    C2642.m8171();
                    break;
                case 932925332:
                case 1108778095:
                    z = true;
                    if (C1189.f5284 <= 0) {
                        iM11306 = C19806.m45029("᩵ۙ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 793) ^ 1145238008;
                        i5 = -2088550571;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۘۢ")) * (-45);
                        i4 = ((iM11306 ^ i2) * 31831) ^ 1114608934;
                        i5 = 2122671343;
                    }
                    break;
                default:
                    if (C19806.m45024()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳܽ") ^ i3) * (-79);
                        i4 = ((iM11306 ^ i2) * (-14785)) ^ 116766028;
                        i5 = -2129091933;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۜ֨")) * 11;
                        i4 = ((iM11306 ^ i3) * (-30735)) ^ (-1005871217);
                        i5 = -1896300063;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 20881. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public void m32684() {
        /*
            Method dump skipped, instruction units count: 2088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC13209.m32684():void");
    }
}
