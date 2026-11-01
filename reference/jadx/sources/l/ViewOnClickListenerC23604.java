package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.analytics.pro.i;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Map;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.engines.TwofishEngine;
import org.bouncycastle.math.ec.rfc8032.Ed448;
import org.bouncycastle.math.ec.rfc8032.Scalar448;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.bouncycastle.pqc.crypto.snova.GF16Utils;

/* JADX INFO: renamed from: l.᩻ۡ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: H1R6 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC23604 extends AbstractActivityC12483 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f76463 = 0;

    /* JADX INFO: renamed from: ᩻۠ܽ, reason: not valid java name and contains not printable characters */
    private static final short[] f76464 = {8562, 19110, 19105, 19113, 19104, 19082, 19106, 19118, 19110, 19107, -9138, -14097, 5427, 8038, -21309, 17102, -32678, -23585, 16564, -20652, 17288, -19996, 23356, 6638, 25697, 17823, -31757, 5472, -9851, -10055, -11542, 410, -11332, -13607, 8309, 23368, 23370, 23387, 23420, 23387, 23389, 23366, 23361, 23368, 23303, 23297, 23297, 23297, 23302, 23411, 23371, 23300, 3008, 2763, 12341, 5325, -15155, -11603, 9915, -17191, -17183, -17234, -8668, -9363, -13004, 9841, -24878, -24957, -30290, -29656, 21722, 24030, 3240, -22295, -22274, -22296, -22293, -22284, -22283, -22296, -22274, -11320, -16195, 12434, 7542, -2594, -2615, -2593, -2596, -2621, -2622, -2593, -2615, -22390, -24684, 30727, -20992, 30466, -27327, 32354, -24207, 28080, 6232, -31516, -31501, -31515, -31514, -31495, -31496, -31515, -31501, -8031, 5891, -9001, -3272, 2440, -13787, -7775, -6158, 6561, 2673, -4876, -4893, -4875, -4874, -4887, -4888, -4875, -4893, 29173, -25614, 31157, -23775, -26336, 27361, -4873, -4873, -4881, -4888, -4896, -4887, -4905, -4905, -23718, -25587, -32074, 4691, -7179, 385, 1627, 5855, 1804, 5361, -24984, -24985, -24992, -24982, -25000, -24985, -24981, -24967, -25012, -24969, -25017, -24982, -25050, -25056, -25056, -25056, -25049, -3766, 8186, -15063, 1004, 6795, 873, -16266, 4799, 5566, 3168, 7621, -574, 836, 4640, -1473, 348, -15759, 2668, 6045, 113, -4131, -2699, 11446, 1778, -2017, 30421, 30445, 30370, 7395, 14790, -7888, 1624, 12275, 15747, 14454, 1046, -2454, -9342, -14278, -14953, -14068, 9438, -6102, 11905, -3234, 15876, 8510, 14274, -2373, -14366, 9326, 8699, 15569, 9877, -22679, -22679, -10562, 15085, -1456, 15636, -1394, 14675, -14611, -248, -15581, 5694, 100, -15764, 10075, 22684, 22692, 22763, 913, -11920, -13286, 8670, 10238, 12657, -11672, 3567, 176, 2487, -23176, -23001, 21703, 9731, -8397, -8412, -8398, -8399, -8402, -8401, -8398, -8412, -24453, -23769, 21436, 19605, -19232, 22659, -8394, -8391, -8408, -8401, -8409, -8402, -8426, -8423, -32448, -20962, -31898, 5197, 8621, 11188, -9033, 8680, -27402, 32189, 29394, 27480, 31798, -21623, 5644, 28947, 31863, 31664, 19486, -27414, 18453, 30453, 29724, 31990, 438, 21234, 21221, 21235, 21232, 21231, 21230, 21235, 21221, 15854, -8233, -13190, -12666, 89, 3416, 728, -9612, -9629, -9611, -9610, -9623, -9624, -9611, -9629, 20009, 20146, -21008, -9617, -9624, -9632, -9623, -9656, -9617, -9627, -9619, -9624, -9625, -9621, -9629, 21811, -29629, -17789, 218, 415, 12400, 5004, 4737, 13721, 13726, 13718, 13727, 13758, 13721, 13715, 13723, 13726, 13713, 13725, 13717, 13697, 13697, 18695, 23023, -23815, 13721, 13726, 13718, 13727, 13729, 13729, 13703, 13704, 13721, 13726, 13718, 13727, 13735, 13736, 13721, 13726, 13718, 13727, 13757, 13701, 13724, 13700, 13721, 13756, 13727, 13719, 13721, 13726, 17924, -23809, 23555, -17707, 23778, 18378, 2777, 22927, 23135, 18209, -29015, -27624, 24077, -9637, -9644, -9645, -9639, -9621, -9644, -9640, -9654, -9601, -9660, -9612, -9639, -9707, -9709, -9709, -9709, -9708, -30624, -20439, 17516, 16860, -20306, 24174, -21581, 21110, 18399, 18408, -31541, 19279, -16673, -17017, -22433, 7470, -21505, -3130, 13281, 9145, -14918, 12648, 10946, 11714, -12504, 12648, 14932, 8471, 9102, -21521, -21536, -21529, -21523, -21537, -21536, -21524, -21506, -21557, -21520, -21568, -21523, -21599, -21593, -21593, -21593, -21600, -1008, -4055, -10437, -10824, -11537, 8430, -11473, -14288, 14920, -13135, -9599, 12801, 16107, 15938, -11307, -16147, -12857, -3294, -11769, -10471, 9746, -11316, 12951, -15907, -560, 8929, -2952, -15581, 11691, -708, -13559, 8921, -9176, 13498, -12430, -204, 16236, -8195, 15056, -3399, -9469, 15350, -2676, 9052, -9626, -12033, -6899, 15885, -21522, -21524, -21507, -21542, -21507, -21509, -21536, -21529, -21522, -21599, -21593, -21593, -21593, -21600, 13468, 16018, -1800, -21512, -21512, -3310, -9421, -15662, -21506, -21519, -16140, -1976, -13253, 9973, 11855, -9538, 12103, 12142, -10911, -2275, -416, -15738, -12197, 8433, -1157, 9579, -15704, -12456, -9159, 11905, 12489, -9852, -2915, -11977, -10972, -15771, 11425, -2666, 8448, -11910, 13751, -11323, -8789, -21629, -745, -314, -8312, -3415, -2680, -1669, -10469, 11093, 9595, 9884, -8607, -2573, -30, -15477, -2050, -13664, 12776, 8962, 961, -30754, 25794, 27268, 32454, -25930, 28726, 16716, 32331, -25320, 26570, -28508, 26882, -27624, 27980, 26546, -30771, 18840, -32614, -25249, 31049, 19794, -31369, 17030, -24934, -24773, -25275, -27935, 23533, -26146, 25650, -25903, 19018, 31277, -26952, -26722, -27641, 30523, 18915, -27482, 5207, 5189, 5192, 5142, -30024, 25657, -26318, 25337, -26642, 20049, -24699, -32111, -24896, 24696, 18406, 30728, 25261, 30390, 18355, 28250, -28722, 31754, 5202, 5197, 5185, 5203, 5132, 5130, 5130, 5130, 5133, 16519, 29353, 25285, -31930, 16989, 27543, -28509, 25703, 29516, -28103, 28758, -29099, 5207, 5196, 5195, 5203, 5221, 5191, 5200, 5197, 5202, 5185, 5217, 5193, 5189, 5197, 5192, 2824, 17926, 17921, 17947, 17930, 17921, 17947, 5564, -23348, -23337, -23344, -23352, -23310, -23350, -23341, -23349, -23338, -23309, -23344, -23336, -23338, -23343, -23348, -23337, -23344, -23352, -23316, -23334, -23348, -23348, -23338, -23344, -23343, -23301, -23334, -23351, -23338, -23332, -23334, -23348, 8294, 10492, 10458, 10444, 10459, 10468, 10438, 10459, 10444, 10472, 10442, 10461, 10432, 10463, 10432, 10461, 10448};

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public TextView f76465;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public TextView f76466;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public final C22959 f76467 = C22959.m50800();

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public TextView f76468;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public TextView f76469;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public TextView f76470;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        short[] sArr2 = null;
        int i6 = 0;
        int i7 = 2085577993;
        int i8 = C3660.f13403;
        int i9 = C2477.f9839;
        int iM45029 = (C19806.m45029("᩷ܽ") ^ i9) * 45;
        int i10 = ((iM45029 ^ i8) * 6853) ^ (-1727852110);
        int i11 = 2138456187;
        while (true) {
            i7 = ((((i7 ^ i8) * (-30249)) >> 31) & i10) ^ (iM45029 ^ i11);
            switch (i7) {
                case -2130498642:
                case -290507772:
                    c = 732;
                    if (C1937.f7317 >= 0) {
                        iM45029 = (C19806.m45029("֡᩻") ^ i9) * (-53);
                        i10 = ((iM45029 ^ i8) * 13093) ^ (-1960497935);
                        i11 = -767518726;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ܶ") ^ i8;
                        i10 = ((iM45029 ^ i9) * 23391) ^ (-291666173);
                        i11 = 1229570419;
                    }
                    break;
                case -1924090711:
                case 1209992693:
                    if (C1398.f5802 <= 0) {
                        iM45029 = (C19806.m45029("֡᩻") ^ i9) * (-53);
                        i10 = ((iM45029 ^ i8) * 13093) ^ (-1960497935);
                        i11 = -767518726;
                    } else {
                        iM45029 = C19806.m45029("֨ܳ") ^ i8;
                        i10 = ((iM45029 ^ i9) * (-21143)) ^ 734996796;
                        i11 = 2030150604;
                    }
                    break;
                case -1799383162:
                case -1000847319:
                    return ViewTreeObserverOnPreDrawListenerC3327.m9869(sArr2, i6, 16, i5);
                case -1788953198:
                case 1346504355:
                    if (C2124.f7782 > 0) {
                        iM45029 = C19806.m45029("ܿᩳ") ^ i8;
                        i10 = ((iM45029 ^ i9) * 23425) ^ 980743063;
                        i11 = 586771248;
                    } else {
                        iM45029 = (C19806.m45029("֡᩻") ^ i9) * (-53);
                        i10 = ((iM45029 ^ i8) * 13093) ^ (-1960497935);
                        i11 = -767518726;
                    }
                    break;
                case -1552716188:
                case -175205511:
                    if (C3743.m10966() <= 0) {
                        iM45029 = C19806.m45029("ܿᩳ") ^ i8;
                        i10 = ((iM45029 ^ i9) * 23425) ^ 980743063;
                        i11 = 586771248;
                    } else {
                        iM45029 = (i9 - ThreadFactoryC3888.m11306("ۜ᩺")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i10 = ((iM45029 ^ i8) * 15575) ^ 507957456;
                        i11 = -36916133;
                    }
                    break;
                case -1366321414:
                case 2079303170:
                    i = s + 5578;
                    if (C0671.f2816 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۚ") ^ i9;
                        i10 = ((iM45029 ^ i8) * (-733)) ^ 268111003;
                        i11 = -445685345;
                    } else {
                        iM45029 = C19806.m45029("֡ۡ") ^ i8;
                        i10 = ((iM45029 ^ i9) * 7629) ^ (-1121226513);
                        i11 = -1015154484;
                    }
                    break;
                case -1252544153:
                case 69254857:
                    C0962.m3746();
                    if (!ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM45029 = (C19806.m45029("֡᩻") ^ i9) * (-53);
                        i10 = ((iM45029 ^ i8) * 13093) ^ (-1960497935);
                        i11 = -767518726;
                    } else {
                        iM45029 = C19806.m45029("۟ۗ") ^ i8;
                        i10 = ((iM45029 ^ i9) * 27677) ^ (-2024706845);
                        i11 = -350634032;
                    }
                    break;
                case -1052038376:
                case 467018951:
                    i5 = 10409;
                    iM45029 = C19806.m45029("᩵᩷") ^ i9;
                    i10 = ((iM45029 ^ i8) * 28277) ^ 403680936;
                    i11 = -1952344713;
                    break;
                case -945650221:
                case 1517523638:
                    sArr = f76464;
                    if (C0962.f3784) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۚ") ^ i9;
                        i10 = ((iM45029 ^ i8) * (-733)) ^ 268111003;
                        i11 = -445685345;
                    } else {
                        iM45029 = C19806.m45029("ᩴۚ") ^ i8;
                        i10 = ((iM45029 ^ i9) * (-671)) ^ (-1154300554);
                        i11 = 886994369;
                    }
                    break;
                case -555426897:
                case 1083007010:
                    s = sArr[c];
                    if (RunnableC1606.m5473() != 0) {
                        iM45029 = C19806.m45029("۟ۗ") ^ i8;
                        i10 = ((iM45029 ^ i9) * 27677) ^ (-2024706845);
                        i11 = -350634032;
                    } else {
                        iM45029 = C19806.m45029("۫ܳ") ^ i9;
                        i10 = ((iM45029 ^ i8) * 655) ^ 1999667763;
                        i11 = -557953604;
                    }
                    break;
                case -530245722:
                case 2127514513:
                    C7105.m18985();
                    return null;
                case -331610552:
                case -74195653:
                    sArr2 = f76464;
                    i6 = 733;
                    if (C1875.f7103 >= 0) {
                        iM45029 = (i9 - ThreadFactoryC3888.m11306("ᩴ֨")) * (-69);
                        i10 = ((iM45029 ^ i8) * (-24765)) ^ (-1056085856);
                        i11 = 599963896;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ۠") ^ i8;
                        i10 = ((iM45029 ^ i9) * (-8337)) ^ (-2036762437);
                        i11 = 1408667371;
                    }
                    break;
                case -134036772:
                case 1116415701:
                    i4 = 31114084;
                    if (C1189.f5284 <= 0) {
                        iM45029 = C19806.m45029("۟ۗ") ^ i8;
                        i10 = ((iM45029 ^ i9) * 27677) ^ (-2024706845);
                        i11 = -350634032;
                    } else {
                        iM45029 = (C19806.m45029("ܳۡ") + i8) * (-13);
                        i10 = ((iM45029 ^ i9) * (-31063)) ^ (-1904242651);
                        i11 = -1452650667;
                    }
                    break;
                case -45562220:
                case 816576214:
                    i5 = 13095;
                    iM45029 = C19806.m45029("᩵᩷") ^ i9;
                    i10 = ((iM45029 ^ i8) * 28277) ^ 403680936;
                    i11 = -1952344713;
                    break;
                case 401654310:
                case 1937205548:
                    C0526.m2437();
                    ThreadFactoryC3888.m11300();
                    iM45029 = (i9 - ThreadFactoryC3888.m11306("ᩴ֨")) * (-69);
                    i10 = ((iM45029 ^ i8) * (-24765)) ^ (-1056085856);
                    i11 = 599963896;
                    break;
                case 433407915:
                case 1129348910:
                    if (C3660.m10791() != 0) {
                        iM45029 = (i9 - ThreadFactoryC3888.m11306("ᩴ֨")) * (-69);
                        i10 = ((iM45029 ^ i8) * (-24765)) ^ (-1056085856);
                        i11 = 599963896;
                    } else {
                        iM45029 = (C19806.m45029("ܰ֨") ^ i9) * (-47);
                        i10 = ((iM45029 ^ i8) * 8979) ^ 1173567155;
                        i11 = 784884611;
                    }
                    break;
                case 1078385897:
                case 2092385611:
                    C19806.m45024();
                    if (C3722.f13525 > 0) {
                        iM45029 = (C19806.m45029("֡᩻") ^ i9) * (-53);
                        i10 = ((iM45029 ^ i8) * 13093) ^ (-1960497935);
                        i11 = -767518726;
                    } else {
                        iM45029 = (i9 - ThreadFactoryC3888.m11306("ᩴ֨")) * (-69);
                        i10 = ((iM45029 ^ i8) * (-24765)) ^ (-1056085856);
                        i11 = 599963896;
                    }
                    break;
                case 1423142127:
                case 1737612073:
                    i2 = i * i;
                    i3 = s * s;
                    if (AbstractC0464.m2313() != 0) {
                        iM45029 = C19806.m45029("ܿᩳ") ^ i8;
                        i10 = ((iM45029 ^ i9) * 23425) ^ 980743063;
                        i11 = 586771248;
                    } else {
                        iM45029 = C19806.m45029("۬֡") ^ i9;
                        i10 = ((iM45029 ^ i8) * (-16755)) ^ (-288782671);
                        i11 = -2009917433;
                    }
                    break;
                default:
                    int i12 = i3 + i4;
                    if ((i12 + i12) - i2 >= 0) {
                        iM45029 = C19806.m45029("ۢ֫") ^ i9;
                        i10 = ((iM45029 ^ i8) * 4929) ^ 1975672443;
                        i11 = -1317341441;
                    } else {
                        iM45029 = (C19806.m45029("֫ܿ") + i8) * 123;
                        i10 = ((iM45029 ^ i9) * 2051) ^ (-145361461);
                        i11 = -777382725;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final void m52066() throws Throwable {
        Map mapM5684;
        TextView textView;
        short[] sArr;
        int iM45029;
        int i;
        int i2;
        String strM9788;
        short[] sArr2;
        int i3;
        int iM11306;
        int i4;
        int i5;
        short[] sArr3;
        short[] sArr4;
        int iM11307;
        int i6;
        short s;
        int iM11308;
        int i7;
        int i8;
        int iM11309;
        Map map;
        int i9;
        int i10;
        String str;
        int iM450210;
        TextView textView2;
        int iM113010;
        int i11;
        int i12;
        int iM450211;
        int i13;
        int i14;
        int iM450212;
        int i15;
        int i16;
        int iM450213;
        int i17;
        int i18;
        this = this;
        int i19 = 0;
        int i20 = -1620297391;
        int i21 = C2788.f10625;
        int i22 = C10634.f36300;
        int iM113011 = (ThreadFactoryC3888.m11306("۠ۗ") ^ i22) * 123;
        int i23 = ((iM113011 ^ i21) * 26705) ^ 407119980;
        int i24 = iM113011 ^ (-1239577653);
        String str2 = null;
        TextView textView3 = null;
        String strM8172 = null;
        TextView textView4 = null;
        String strM3009 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        TextView textView5 = null;
        boolean zContainsKey = false;
        int iM450214 = 0;
        char c = 0;
        short s2 = 0;
        int i25 = 0;
        Map map2 = null;
        String strM3747 = null;
        TextView textView6 = null;
        String strM1429 = null;
        int i26 = 0;
        int i27 = 0;
        Throwable th = null;
        TextView textView7 = null;
        String strM8640 = null;
        int i28 = 0;
        String strM10964 = null;
        TextView textView8 = null;
        TextView textView9 = null;
        String strM11312 = null;
        boolean zContainsKey2 = false;
        while (true) {
            i20 = i24 ^ (i23 & (((i20 ^ i21) * (-23677)) >> 31));
            switch (i20) {
                case -2059477671:
                case 967367447:
                    ThreadFactoryC3888.m11300();
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        textView7 = textView7;
                        textView4 = textView4;
                        iM450211 = (ThreadFactoryC3888.m11306("ᩳ۫") ^ i21) * 15;
                        i13 = ((iM450211 ^ i22) * 1395) ^ (-342939947);
                        i14 = -775664986;
                        i24 = iM450211 ^ i14;
                        i23 = i13;
                        textView4 = textView4;
                        textView7 = textView7;
                    } else {
                        textView7 = textView7;
                        mapM5684 = map2;
                        textView4 = textView4;
                        textView = textView5;
                        textView3 = textView3;
                        sArr = sArr6;
                        sArr7 = sArr7;
                        iM11309 = ThreadFactoryC3888.m11306("ܺܳ") ^ i21;
                        map = mapM5684;
                        i23 = ((iM11309 ^ i22) * (-25801)) ^ (-444849287);
                        i9 = -131810716;
                        i24 = iM11309 ^ i9;
                        sArr6 = sArr;
                        textView5 = textView;
                        sArr7 = sArr7;
                        map2 = map;
                        textView4 = textView4;
                        textView7 = textView7;
                        textView3 = textView3;
                    }
                    break;
                case -2011618353:
                case 214063589:
                    textView4 = textView4;
                    boolean zM5695 = C1709.m5695();
                    textView7 = textView7;
                    strM10964 = C3743.m10964(f76464, 380, 14, i27);
                    if (zM5695) {
                        iM450211 = ThreadFactoryC3888.m11306("᩷᩷") ^ i22;
                        i13 = ((iM450211 ^ i21) * (-20239)) ^ (-1624808811);
                        i14 = -1141970284;
                    } else {
                        iM450211 = ThreadFactoryC3888.m11306("֨۬") ^ i22;
                        i13 = ((iM450211 ^ i21) * (-2689)) ^ (-717553132);
                        i14 = 884210223;
                    }
                    i24 = iM450211 ^ i14;
                    i23 = i13;
                    textView4 = textView4;
                    textView7 = textView7;
                    break;
                case -1950896128:
                case -1409836397:
                    textView2 = textView4;
                    textView7 = this.f76468;
                    if (textView7 != null) {
                        iM450212 = C19806.m45029("᩻ۤ") ^ i22;
                        i15 = ((iM450212 ^ i21) * 19009) ^ (-453886806);
                        i16 = -1215508714;
                    } else {
                        iM450212 = C19806.m45029("ۗ۬") ^ i21;
                        i15 = ((iM450212 ^ i22) * 17575) ^ 1199555599;
                        i16 = -1924444812;
                    }
                    i24 = iM450212 ^ i16;
                    i23 = i15;
                    textView4 = textView2;
                    break;
                case -1948633714:
                case -353986267:
                    C3535.m10426(strM11312);
                    throw th;
                case -1929257197:
                case -1882889666:
                    C1461.m5083(textView6, (CharSequence) map2.get(str2));
                    textView3 = textView3;
                    iM11306 = C19806.m45029("ᩳ᩶") ^ i22;
                    i4 = ((iM11306 ^ i21) * (-32057)) ^ 1340297441;
                    i5 = 1369439255;
                    i24 = iM11306 ^ i5;
                    i23 = i4;
                    textView3 = textView3;
                    textView4 = textView4;
                    textView7 = textView7;
                    break;
                case -1920819832:
                case 734867750:
                    ThreadFactoryC3888.m11303(textView7, ThreadFactoryC3888.m11306(strM8640) ^ 2128084267);
                    return;
                case -1887020114:
                case 768259979:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    C3743.m10966();
                    textView7 = textView7;
                    textView4 = textView4;
                    textView3 = textView3;
                    sArr7 = sArr7;
                    iM45029 = (ThreadFactoryC3888.m11306("᩶ܶ") + i21) * 81;
                    i = ((iM45029 ^ i22) * (-3775)) ^ 1608584896;
                    i2 = -1783960005;
                    i24 = iM45029 ^ i2;
                    i23 = i;
                    sArr7 = sArr7;
                    textView3 = textView3;
                    textView4 = textView4;
                    textView7 = textView7;
                    break;
                case -1879160125:
                case 965566971:
                    textView7 = textView7;
                    textView4 = textView4;
                    textView3 = textView3;
                    iM450214 = C19806.m45029(strM3009);
                    i28 = 2129707278;
                    if (C2249.f8050 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡ֡") ^ i22) * 123;
                        i4 = ((iM11306 ^ i21) * 14843) ^ (-789891371);
                        i5 = 748809271;
                        i24 = iM11306 ^ i5;
                        i23 = i4;
                        textView3 = textView3;
                        textView4 = textView4;
                        textView7 = textView7;
                    } else {
                        strM9788 = str2;
                        sArr2 = sArr6;
                        i3 = i25;
                        iM450210 = (C19806.m45029("֨ۡ") + i21) * (-65);
                        str = strM9788;
                        i23 = ((iM450210 ^ i22) * 19361) ^ (-422070486);
                        i10 = -1297382823;
                        i24 = iM450210 ^ i10;
                        sArr6 = sArr2;
                        i25 = i3;
                        str2 = str;
                        textView4 = textView4;
                        textView7 = textView7;
                        textView3 = textView3;
                    }
                    break;
                case -1876902255:
                case -869819635:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM450213 = (i21 - C19806.m45029("֨ᩴ")) * (-93);
                        i17 = ((iM450213 ^ i22) * (-14367)) ^ 858981083;
                        i18 = -851238393;
                        i24 = iM450213 ^ i18;
                        i23 = i17;
                    } else {
                        textView7 = textView7;
                        textView4 = textView4;
                        iM450211 = (ThreadFactoryC3888.m11306("ᩳ۫") ^ i21) * 15;
                        i13 = ((iM450211 ^ i22) * 1395) ^ (-342939947);
                        i14 = -775664986;
                        i24 = iM450211 ^ i14;
                        i23 = i13;
                        textView4 = textView4;
                        textView7 = textView7;
                    }
                    break;
                case -1835050384:
                case 261124598:
                    textView7 = textView7;
                    textView4 = textView4;
                    textView3 = textView3;
                    textView6 = this.f76465;
                    if (textView6 != null) {
                        iM11306 = (C19806.m45029("ۨ۬") ^ i22) * 33;
                        i4 = ((iM11306 ^ i21) * 1247) ^ 1757682026;
                        i5 = 311005276;
                    } else {
                        iM11306 = C19806.m45029("ۖ᩷") ^ i21;
                        i4 = ((iM11306 ^ i22) * (-26559)) ^ 720340740;
                        i5 = 1096944531;
                    }
                    i24 = iM11306 ^ i5;
                    i23 = i4;
                    textView3 = textView3;
                    textView4 = textView4;
                    textView7 = textView7;
                    break;
                case -1824635735:
                case 678899513:
                    textView2 = textView4;
                    strM1429 = RunnableC0195.m1429(f76464, 397, 3, i27);
                    if (C0050.m946() <= 0) {
                        iM450212 = (ThreadFactoryC3888.m11306("ܺܶ") + i22) * 119;
                        i15 = ((iM450212 ^ i21) * (-14423)) ^ 390800095;
                        i16 = 46391955;
                    } else {
                        iM450212 = (C19806.m45029("֨ۢ") + i22) * (-97);
                        i15 = ((iM450212 ^ i21) * (-22275)) ^ (-1080792975);
                        i16 = -1426529281;
                    }
                    i24 = iM450212 ^ i16;
                    i23 = i15;
                    textView4 = textView2;
                    break;
                case -1818838536:
                case -196981602:
                    textView7 = textView7;
                    textView4 = textView4;
                    textView3 = textView3;
                    sArr4 = sArr7;
                    sArr3 = sArr6;
                    s = s2;
                    if ((i19 + 152324964) - (s * 24684) >= 0) {
                        iM11308 = (C19806.m45029("֫ܰ") + i21) * 59;
                        i7 = ((iM11308 ^ i22) * 32195) ^ (-1359631526);
                        i8 = -293909918;
                    } else {
                        iM11308 = (i22 - ThreadFactoryC3888.m11306("᩸ۤ")) * (-47);
                        i7 = ((iM11308 ^ i21) * (-97)) ^ (-1413721375);
                        i8 = -1275692867;
                    }
                    i24 = iM11308 ^ i8;
                    s2 = s;
                    i23 = i7;
                    sArr7 = sArr4;
                    sArr6 = sArr3;
                    textView4 = textView4;
                    textView7 = textView7;
                    textView3 = textView3;
                    break;
                case -1802760412:
                case 250365948:
                    C3535.m10426(strM3747);
                    throw th;
                case -1765154321:
                case -99320780:
                    textView7 = textView7;
                    textView4 = textView4;
                    textView3 = textView3;
                    sArr7 = sArr7;
                    strM3009 = C0671.m3009(sArr7, 363, 3, i27);
                    if (C2124.f7782 > 0) {
                        iM45029 = C19806.m45029("۬ۤ") ^ i21;
                        i = ((iM45029 ^ i22) * 11343) ^ (-284584205);
                        i2 = -329034155;
                        i24 = iM45029 ^ i2;
                        i23 = i;
                        sArr7 = sArr7;
                        textView3 = textView3;
                        textView4 = textView4;
                        textView7 = textView7;
                    } else {
                        mapM5684 = map2;
                        textView = textView5;
                        sArr = sArr6;
                        iM11309 = ThreadFactoryC3888.m11306("ܺܳ") ^ i21;
                        map = mapM5684;
                        i23 = ((iM11309 ^ i22) * (-25801)) ^ (-444849287);
                        i9 = -131810716;
                        i24 = iM11309 ^ i9;
                        sArr6 = sArr;
                        textView5 = textView;
                        sArr7 = sArr7;
                        map2 = map;
                        textView4 = textView4;
                        textView7 = textView7;
                        textView3 = textView3;
                    }
                    break;
                case -1741595483:
                case 645218452:
                    C1066.m4023();
                    if (C1460.m5050() != 0) {
                        textView2 = textView4;
                        iM450212 = (ThreadFactoryC3888.m11306("ܺܶ") + i22) * 119;
                        i15 = ((iM450212 ^ i21) * (-14423)) ^ 390800095;
                        i16 = 46391955;
                        i24 = iM450212 ^ i16;
                        i23 = i15;
                        textView4 = textView2;
                    } else {
                        textView7 = textView7;
                        mapM5684 = map2;
                        textView4 = textView4;
                        textView = textView5;
                        textView3 = textView3;
                        sArr = sArr6;
                        sArr7 = sArr7;
                        iM11309 = ThreadFactoryC3888.m11306("ܺܳ") ^ i21;
                        map = mapM5684;
                        i23 = ((iM11309 ^ i22) * (-25801)) ^ (-444849287);
                        i9 = -131810716;
                        i24 = iM11309 ^ i9;
                        sArr6 = sArr;
                        textView5 = textView;
                        sArr7 = sArr7;
                        map2 = map;
                        textView4 = textView4;
                        textView7 = textView7;
                        textView3 = textView3;
                    }
                    break;
                case -1606349701:
                case 1835338231:
                    i27 = 13808;
                    int iM450215 = C19806.m45029("ۚ֫") ^ i21;
                    i23 = ((iM450215 ^ i22) * 21635) ^ 1507258413;
                    i24 = iM450215 ^ 810518457;
                    this = this;
                    sArr6 = sArr6;
                    sArr7 = sArr7;
                    textView3 = textView3;
                    textView4 = textView4;
                    textView7 = textView7;
                    break;
                case -1594218816:
                case -1229769277:
                    MenuItemOnMenuItemClickListenerC3244.m9704(textView8, (CharSequence) map2.get(strM8172));
                    iM450211 = C19806.m45029("ܿۘ") ^ i21;
                    i13 = ((iM450211 ^ i22) * (-27115)) ^ (-101591234);
                    i14 = -651406262;
                    i24 = iM450211 ^ i14;
                    i23 = i13;
                    textView4 = textView4;
                    textView7 = textView7;
                    break;
                case -1584804796:
                case -1254739671:
                    textView7 = textView7;
                    textView4 = textView4;
                    textView8 = this.f76469;
                    if (textView8 != null) {
                        iM450211 = (ThreadFactoryC3888.m11306("ۙ֨") ^ i21) * (-39);
                        i13 = ((iM450211 ^ i22) * 22509) ^ 1658303153;
                        i14 = -934538095;
                    } else {
                        iM450211 = C19806.m45029("ۙܰ") ^ i22;
                        i13 = ((iM450211 ^ i21) * (-787)) ^ (-1823966821);
                        i14 = -1423548845;
                    }
                    i24 = iM450211 ^ i14;
                    i23 = i13;
                    textView4 = textView4;
                    textView7 = textView7;
                    break;
                case -1545099777:
                case -1420808118:
                    C1398.m4902(C10634.m26821(f76464, 349, 12, i27));
                    throw th;
                case -1488636676:
                case 197161222:
                    textView7 = textView7;
                    textView4 = textView4;
                    strM11312 = ThreadFactoryC3888.m11312(f76464, 374, 6, i27);
                    if (zContainsKey2) {
                        iM450211 = (i21 - C19806.m45029("᩸᩸")) * 95;
                        i13 = ((iM450211 ^ i22) * 21035) ^ 622524230;
                        i14 = -1008265170;
                    } else {
                        iM450211 = (C19806.m45029("֫᩶") ^ i22) * 5;
                        i13 = ((iM450211 ^ i21) * 8727) ^ (-864396467);
                        i14 = -1326216176;
                    }
                    i24 = iM450211 ^ i14;
                    i23 = i13;
                    textView4 = textView4;
                    textView7 = textView7;
                    break;
                case -1434233753:
                case 199656272:
                    textView7 = textView7;
                    textView4 = textView4;
                    textView9 = this.f76469;
                    if (textView9 != null) {
                        iM450211 = ThreadFactoryC3888.m11306("۠۟") ^ i22;
                        i13 = ((iM450211 ^ i21) * (-115)) ^ (-644915775);
                        i14 = -1878479260;
                    } else {
                        iM450211 = (C19806.m45029("ۛ᩵") + i21) * 59;
                        i13 = ((iM450211 ^ i22) * (-3395)) ^ 150971076;
                        i14 = -979564674;
                    }
                    i24 = iM450211 ^ i14;
                    i23 = i13;
                    textView4 = textView4;
                    textView7 = textView7;
                    break;
                case -1158988051:
                case 1459225628:
                    textView7 = textView7;
                    textView4 = textView4;
                    textView3 = textView3;
                    sArr7 = sArr7;
                    sArr6 = f76464;
                    i25 = TwofishEngine.GF256_FDBK;
                    if (C1937.f7317 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ܶ") + i21) * 81;
                        i = ((iM45029 ^ i22) * (-3775)) ^ 1608584896;
                        i2 = -1783960005;
                    } else {
                        iM45029 = C19806.m45029("ۢۨ") ^ i22;
                        i = ((iM45029 ^ i21) * 20125) ^ (-1153719251);
                        i2 = 1629798308;
                    }
                    i24 = iM45029 ^ i2;
                    i23 = i;
                    sArr7 = sArr7;
                    textView3 = textView3;
                    textView4 = textView4;
                    textView7 = textView7;
                    break;
                case -914411470:
                case 1803605346:
                    RunnableC1895.m6170();
                    if (!C0526.f2219) {
                        textView7 = textView7;
                        mapM5684 = map2;
                        textView4 = textView4;
                        textView = textView5;
                        textView3 = textView3;
                        sArr = sArr6;
                        sArr7 = sArr7;
                        iM11309 = ThreadFactoryC3888.m11306("ܺܳ") ^ i21;
                        map = mapM5684;
                        i23 = ((iM11309 ^ i22) * (-25801)) ^ (-444849287);
                        i9 = -131810716;
                        i24 = iM11309 ^ i9;
                        sArr6 = sArr;
                        textView5 = textView;
                        sArr7 = sArr7;
                        map2 = map;
                        textView4 = textView4;
                        textView7 = textView7;
                        textView3 = textView3;
                    } else {
                        textView7 = textView7;
                        textView4 = textView4;
                        textView3 = textView3;
                        sArr7 = sArr7;
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ܶ") + i21) * 81;
                        i = ((iM45029 ^ i22) * (-3775)) ^ 1608584896;
                        i2 = -1783960005;
                        i24 = iM45029 ^ i2;
                        i23 = i;
                        sArr7 = sArr7;
                        textView3 = textView3;
                        textView4 = textView4;
                        textView7 = textView7;
                    }
                    break;
                case -743717338:
                case 870987077:
                    textView7 = textView7;
                    textView4 = textView4;
                    TextView textView10 = this.f76465;
                    if (textView10 != null) {
                        iM113010 = (ThreadFactoryC3888.m11306("ۗᩴ") ^ i21) * (-3);
                        i11 = ((iM113010 ^ i22) * (-15219)) ^ (-1827048602);
                        i12 = 1871533781;
                    } else {
                        iM113010 = (ThreadFactoryC3888.m11306("ۗ۫") + i22) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i11 = ((iM113010 ^ i21) * 20397) ^ 704094833;
                        i12 = 103406261;
                    }
                    i24 = iM113010 ^ i12;
                    textView3 = textView10;
                    i23 = i11;
                    textView4 = textView4;
                    textView7 = textView7;
                    break;
                case -683451178:
                case 337803599:
                    C3535.m10426(strM11312);
                    throw th;
                case -645136304:
                case 607440653:
                    C1148.m4232();
                    C0962.m3746();
                    return;
                case -568287351:
                case 2127416907:
                    textView7 = textView7;
                    textView4 = textView4;
                    textView3 = textView3;
                    sArr2 = sArr6;
                    i3 = i25;
                    strM9788 = C3286.m9788(sArr2, i3, 2, i27);
                    zContainsKey = map2.containsKey(strM9788);
                    sArr7 = f76464;
                    if (C2477.f9839 <= 0) {
                        iM450210 = (C19806.m45029("֨ۡ") + i21) * (-65);
                        str = strM9788;
                        i23 = ((iM450210 ^ i22) * 19361) ^ (-422070486);
                        i10 = -1297382823;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("᩸ۨ") + i21) * (-31);
                        str = strM9788;
                        i23 = ((iM450210 ^ i22) * (-21249)) ^ 990583496;
                        i10 = -306634318;
                    }
                    i24 = iM450210 ^ i10;
                    sArr6 = sArr2;
                    i25 = i3;
                    str2 = str;
                    textView4 = textView4;
                    textView7 = textView7;
                    textView3 = textView3;
                    break;
                case -522334612:
                case -292008417:
                    textView7 = textView7;
                    textView4 = textView4;
                    strM8172 = C2642.m8172(f76464, 372, 2, i27);
                    zContainsKey2 = map2.containsKey(strM8172);
                    if (C19806.f63586) {
                        iM450211 = (ThreadFactoryC3888.m11306("ᩳ۫") ^ i21) * 15;
                        i13 = ((iM450211 ^ i22) * 1395) ^ (-342939947);
                        i14 = -775664986;
                    } else {
                        iM450211 = C19806.m45029("ۗᩳ") ^ i21;
                        i13 = ((iM450211 ^ i22) * 28131) ^ 1992394201;
                        i14 = -567380564;
                    }
                    i24 = iM450211 ^ i14;
                    i23 = i13;
                    textView4 = textView4;
                    textView7 = textView7;
                    break;
                case -512889174:
                case 396837348:
                    textView7 = textView7;
                    textView4 = textView4;
                    textView3 = textView3;
                    sArr3 = sArr6;
                    sArr4 = sArr7;
                    s2 = sArr5[c];
                    i19 = s2 * s2;
                    if (C1668.f6641 >= 0) {
                        iM11307 = (i22 - ThreadFactoryC3888.m11306("ܰ᩺")) * 13;
                        i23 = ((iM11307 ^ i21) * (-18035)) ^ (-1500895965);
                        i6 = 588551740;
                    } else {
                        iM11307 = (i22 - ThreadFactoryC3888.m11306("ۨ֨")) * (-51);
                        i23 = ((iM11307 ^ i21) * 29871) ^ (-1460746607);
                        i6 = 107950449;
                    }
                    i24 = iM11307 ^ i6;
                    sArr7 = sArr4;
                    sArr6 = sArr3;
                    textView4 = textView4;
                    textView7 = textView7;
                    textView3 = textView3;
                    break;
                case -442386562:
                case 2100849495:
                    TextView textView11 = textView7;
                    TextView textView12 = textView4;
                    TextView textView13 = textView3;
                    short[] sArr8 = sArr6;
                    short[] sArr9 = sArr7;
                    TextView textView14 = this.f76470;
                    if (textView14 != null) {
                        int iM113012 = ThreadFactoryC3888.m11306("ۚۢ") ^ i21;
                        int i29 = ((iM113012 ^ i22) * 9623) ^ 1515659532;
                        i24 = iM113012 ^ (-1513772407);
                        textView5 = textView14;
                        sArr6 = sArr8;
                        i23 = i29;
                        sArr7 = sArr9;
                        textView3 = textView13;
                        textView4 = textView12;
                        textView7 = textView11;
                        th = null;
                    } else {
                        int iM113013 = ThreadFactoryC3888.m11306("ܿᩳ") ^ i22;
                        int i30 = ((iM113013 ^ i21) * 21051) ^ (-319589818);
                        i24 = iM113013 ^ 484680320;
                        textView5 = textView14;
                        sArr6 = sArr8;
                        sArr7 = sArr9;
                        textView3 = textView13;
                        textView4 = textView12;
                        textView7 = textView11;
                        th = null;
                        i23 = i30;
                        this = this;
                    }
                    break;
                case -362845954:
                case 1662288206:
                    textView7 = textView7;
                    textView4 = textView4;
                    textView3 = textView3;
                    i26 = iM450214 ^ i28;
                    strM3747 = C0962.m3747(f76464, 366, 6, i27);
                    if (zContainsKey) {
                        iM11306 = C19806.m45029("ۤ᩻") ^ i21;
                        i4 = ((iM11306 ^ i22) * (-31729)) ^ (-519700368);
                        i5 = 1198604465;
                    } else {
                        iM11306 = C19806.m45029("᩷ۙ") ^ i22;
                        i4 = ((iM11306 ^ i21) * 17499) ^ 291169990;
                        i5 = -1930562964;
                    }
                    i24 = iM11306 ^ i5;
                    i23 = i4;
                    textView3 = textView3;
                    textView4 = textView4;
                    textView7 = textView7;
                    break;
                case -337735459:
                case 550335353:
                    C3535.m10426(strM10964);
                    throw th;
                case 45407136:
                case 1487240535:
                    C3535.m10426(strM10964);
                    throw th;
                case 82401311:
                case 566306055:
                    textView4 = this.f76468;
                    if (textView4 != null) {
                        iM450213 = (ThreadFactoryC3888.m11306("ܽ֡") + i21) * 19;
                        i17 = ((iM450213 ^ i22) * 24261) ^ (-375284599);
                        i18 = 1945289863;
                    } else {
                        iM450213 = C19806.m45029("ۨᩳ") ^ i22;
                        i17 = ((iM450213 ^ i21) * (-5143)) ^ (-1040516478);
                        i18 = 1423612989;
                    }
                    i24 = iM450213 ^ i18;
                    i23 = i17;
                    break;
                case 143329460:
                case 1612785258:
                    textView2 = textView4;
                    strM8640 = C2871.m8640(f76464, 394, 3, i27);
                    if (C0962.f3784) {
                        iM450212 = (i22 - ThreadFactoryC3888.m11306("ۗ᩻")) * (-81);
                        i15 = ((iM450212 ^ i21) * 2119) ^ 1680667208;
                        i16 = -1446848131;
                    } else {
                        iM450212 = (i21 - C19806.m45029("᩺ܰ")) * (-109);
                        i15 = ((iM450212 ^ i22) * (-6601)) ^ 1134119731;
                        i16 = 1730418472;
                    }
                    i24 = iM450212 ^ i16;
                    i23 = i15;
                    textView4 = textView2;
                    break;
                case 189319354:
                case 1496021620:
                    if (AbstractC0464.f2088 <= 0) {
                        textView2 = textView4;
                        iM450212 = (i22 - ThreadFactoryC3888.m11306("ۗ᩻")) * (-81);
                        i15 = ((iM450212 ^ i21) * 2119) ^ 1680667208;
                        i16 = -1446848131;
                        i24 = iM450212 ^ i16;
                        i23 = i15;
                        textView4 = textView2;
                    } else {
                        textView7 = textView7;
                        mapM5684 = map2;
                        textView4 = textView4;
                        textView = textView5;
                        textView3 = textView3;
                        sArr = sArr6;
                        sArr7 = sArr7;
                        iM11309 = ThreadFactoryC3888.m11306("ܺܳ") ^ i21;
                        map = mapM5684;
                        i23 = ((iM11309 ^ i22) * (-25801)) ^ (-444849287);
                        i9 = -131810716;
                        i24 = iM11309 ^ i9;
                        sArr6 = sArr;
                        textView5 = textView;
                        sArr7 = sArr7;
                        map2 = map;
                        textView4 = textView4;
                        textView7 = textView7;
                        textView3 = textView3;
                    }
                    break;
                case 213813004:
                case 875539588:
                    ThreadFactoryC3888.m11303(textView4, C19806.m45029(strM1429) ^ 2100593631);
                    return;
                case 235282283:
                case 789350896:
                    ThreadFactoryC3888.m11303(textView9, i26);
                    iM450211 = C19806.m45029("ܿۘ") ^ i21;
                    i13 = ((iM450211 ^ i22) * (-27115)) ^ (-101591234);
                    i14 = -651406262;
                    i24 = iM450211 ^ i14;
                    i23 = i13;
                    textView4 = textView4;
                    textView7 = textView7;
                    break;
                case 256963544:
                case 478386536:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    if (C0216.f1393 == 0) {
                        textView7 = textView7;
                        textView4 = textView4;
                        textView3 = textView3;
                        sArr3 = sArr6;
                        sArr4 = sArr7;
                        iM11307 = (i22 - ThreadFactoryC3888.m11306("ܰ᩺")) * 13;
                        i23 = ((iM11307 ^ i21) * (-18035)) ^ (-1500895965);
                        i6 = 588551740;
                        i24 = iM11307 ^ i6;
                        sArr7 = sArr4;
                        sArr6 = sArr3;
                        textView4 = textView4;
                        textView7 = textView7;
                        textView3 = textView3;
                    } else {
                        textView7 = textView7;
                        textView4 = textView4;
                        textView3 = textView3;
                        sArr7 = sArr7;
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ܶ") + i21) * 81;
                        i = ((iM45029 ^ i22) * (-3775)) ^ 1608584896;
                        i2 = -1783960005;
                        i24 = iM45029 ^ i2;
                        i23 = i;
                        sArr7 = sArr7;
                        textView3 = textView3;
                        textView4 = textView4;
                        textView7 = textView7;
                    }
                    break;
                case 297314090:
                case 1785994952:
                    textView3 = textView3;
                    C19806.m45022(textView3, i26);
                    iM11306 = C19806.m45029("ᩳ᩶") ^ i22;
                    i4 = ((iM11306 ^ i21) * (-32057)) ^ 1340297441;
                    i5 = 1369439255;
                    i24 = iM11306 ^ i5;
                    i23 = i4;
                    textView3 = textView3;
                    textView4 = textView4;
                    textView7 = textView7;
                    break;
                case 708796056:
                case 1881905943:
                    textView7 = textView7;
                    textView4 = textView4;
                    textView3 = textView3;
                    sArr = sArr6;
                    sArr7 = sArr7;
                    textView = textView5;
                    C1461.m5083(textView, C1709.m5682());
                    m52036();
                    mapM5684 = C1709.m5684();
                    if (C3577.m10565()) {
                        iM11309 = ThreadFactoryC3888.m11306("ۧ۟") ^ i22;
                        map = mapM5684;
                        i23 = ((iM11309 ^ i21) * (-13963)) ^ (-2017200168);
                        i9 = -369220433;
                    } else {
                        iM11309 = ThreadFactoryC3888.m11306("ܺܳ") ^ i21;
                        map = mapM5684;
                        i23 = ((iM11309 ^ i22) * (-25801)) ^ (-444849287);
                        i9 = -131810716;
                    }
                    i24 = iM11309 ^ i9;
                    sArr6 = sArr;
                    textView5 = textView;
                    sArr7 = sArr7;
                    map2 = map;
                    textView4 = textView4;
                    textView7 = textView7;
                    textView3 = textView3;
                    break;
                case 1309425214:
                case 1340805458:
                    C1398.m4902(strM3747);
                    throw th;
                case 1566304658:
                case 2106179028:
                    i27 = 1048;
                    int iM450216 = C19806.m45029("ۚ֫") ^ i21;
                    i23 = ((iM450216 ^ i22) * 21635) ^ 1507258413;
                    i24 = iM450216 ^ 810518457;
                    this = this;
                    sArr6 = sArr6;
                    sArr7 = sArr7;
                    textView3 = textView3;
                    textView4 = textView4;
                    textView7 = textView7;
                    break;
                default:
                    textView7 = textView7;
                    textView4 = textView4;
                    textView3 = textView3;
                    s = s2;
                    sArr3 = sArr6;
                    sArr4 = sArr7;
                    sArr5 = f76464;
                    c = 348;
                    if (C10634.f36300 < 0) {
                        iM11308 = (ThreadFactoryC3888.m11306("ۜۜ") + i21) * 57;
                        i7 = ((iM11308 ^ i22) * 11981) ^ (-1028453401);
                        i8 = 1125042060;
                        i24 = iM11308 ^ i8;
                        s2 = s;
                        i23 = i7;
                        sArr7 = sArr4;
                        sArr6 = sArr3;
                        textView4 = textView4;
                        textView7 = textView7;
                        textView3 = textView3;
                    } else {
                        s2 = s;
                        iM11307 = (i22 - ThreadFactoryC3888.m11306("ܰ᩺")) * 13;
                        i23 = ((iM11307 ^ i21) * (-18035)) ^ (-1500895965);
                        i6 = 588551740;
                        i24 = iM11307 ^ i6;
                        sArr7 = sArr4;
                        sArr6 = sArr3;
                        textView4 = textView4;
                        textView7 = textView7;
                        textView3 = textView3;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0151 A[PHI: r15
      0x0151: PHI (r15v3 int) = (r15v2 int), (r15v2 int), (r15v2 int), (r15v5 int) binds: [B:17:0x0071, B:15:0x006d, B:12:0x0067, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x01a7 A[PHI: r1 r13
      0x01a7: PHI (r1v4 android.content.Intent) = (r1v3 android.content.Intent), (r1v2 android.content.Intent) binds: [B:48:0x01a5, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x01a7: PHI (r13v4 short[]) = (r13v3 short[]), (r13v2 short[]) binds: [B:48:0x01a5, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0267 A[PHI: r11
      0x0267: PHI (r11v4 short) = (r11v3 short), (r11v2 short) binds: [B:63:0x0265, B:12:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02bf A[PHI: r8 r14 r22
      0x02bf: PHI (r8v4 short) = (r8v3 short), (r8v2 short) binds: [B:71:0x02bd, B:44:0x0181] A[DONT_GENERATE, DONT_INLINE]
      0x02bf: PHI (r14v3 int) = (r14v2 int), (r14v4 int) binds: [B:71:0x02bd, B:44:0x0181] A[DONT_GENERATE, DONT_INLINE]
      0x02bf: PHI (r22v5 int) = (r22v4 int), (r22v3 int) binds: [B:71:0x02bd, B:44:0x0181] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x030f A[PHI: r4 r6 r7 r10 r16 r17
      0x030f: PHI (r4v4 android.content.Intent) = 
      (r4v2 android.content.Intent)
      (r4v2 android.content.Intent)
      (r4v2 android.content.Intent)
      (r4v3 android.content.Intent)
      (r4v2 android.content.Intent)
      (r4v2 android.content.Intent)
      (r4v2 android.content.Intent)
     binds: [B:79:0x030d, B:75:0x02ef, B:67:0x029e, B:32:0x00f8, B:28:0x00d4, B:15:0x006d, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x030f: PHI (r6v4 short[]) = (r6v2 short[]), (r6v2 short[]), (r6v2 short[]), (r6v3 short[]), (r6v2 short[]), (r6v2 short[]), (r6v2 short[]) binds: [B:79:0x030d, B:75:0x02ef, B:67:0x029e, B:32:0x00f8, B:28:0x00d4, B:15:0x006d, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x030f: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:79:0x030d, B:75:0x02ef, B:67:0x029e, B:32:0x00f8, B:28:0x00d4, B:15:0x006d, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x030f: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:79:0x030d, B:75:0x02ef, B:67:0x029e, B:32:0x00f8, B:28:0x00d4, B:15:0x006d, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x030f: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:79:0x030d, B:75:0x02ef, B:67:0x029e, B:32:0x00f8, B:28:0x00d4, B:15:0x006d, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x030f: PHI (r17v4 char) = (r17v2 char), (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:79:0x030d, B:75:0x02ef, B:67:0x029e, B:32:0x00f8, B:28:0x00d4, B:15:0x006d, B:9:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractActivityC12483, l.ActivityC19126, android.app.Activity
    public final void onResume() {
        int iM45029;
        int i;
        int i2;
        int i3 = C2477.f9839;
        int i4 = C2871.f10837;
        int iM11306 = (i3 - ThreadFactoryC3888.m11306("۟ۚ")) * 35;
        int i5 = ((iM11306 ^ i4) * 6431) ^ (-1082084086);
        String strM3859 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM11306 ^ (-644682527);
        Intent intentM18982 = null;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        char c = 0;
        int i12 = -1996085322;
        int i13 = 0;
        String strM10056 = null;
        Intent intentM18983 = null;
        boolean z = false;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * 29203) >> 31));
            switch (i12) {
                case -2115268265:
                case -1670938383:
                    s = sArr[c];
                    i13 = s * s;
                    if (C2332.f8260) {
                        iM45029 = C19806.m45029("᩻֫") ^ i4;
                        i = ((iM45029 ^ i3) * 9327) ^ 535133212;
                        i2 = -1853833556;
                    } else {
                        iM45029 = (C19806.m45029("᩹ۧ") + i4) * (-81);
                        i = ((iM45029 ^ i3) * (-29505)) ^ 1002713444;
                        i2 = 509428292;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -2085590004:
                case 250259411:
                    C7105.m18982(this).removeExtra(strM10056);
                    m52052();
                    iM45029 = ThreadFactoryC3888.m11306("۟ۡ") ^ i4;
                    i = ((iM45029 ^ i3) * 1515) ^ (-1666178998);
                    i2 = 1846377194;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -2055020706:
                case 1181523572:
                    intentM18983 = C7105.m18982(this);
                    sArr3 = f76464;
                    if (C0797.m3359()) {
                        iM45029 = C19806.m45029("۬۬") ^ i3;
                        i = ((iM45029 ^ i4) * 20859) ^ (-1695392813);
                        i2 = 1654416152;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳۘ") ^ i3;
                        i = ((iM45029 ^ i4) * (-13879)) ^ 851664845;
                        i2 = -159253777;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -2035279356:
                case -1958710250:
                    C0050.m946();
                    C1875.m6086();
                    iM45029 = ThreadFactoryC3888.m11306("۠ۗ") ^ i4;
                    i = ((iM45029 ^ i3) * (-20383)) ^ (-652339727);
                    i2 = 101844866;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1895362696:
                case -1402698503:
                    sArr = f76464;
                    if (C0797.f3386) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳۘ") ^ i3;
                        i = ((iM45029 ^ i4) * (-13879)) ^ 851664845;
                        i2 = -159253777;
                    } else {
                        iM45029 = C19806.m45029("ۜ᩹") ^ i3;
                        i = ((iM45029 ^ i4) * 32589) ^ (-207718753);
                        i2 = -1758438873;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1745684391:
                case -1133267494:
                    C0278.m1783(this);
                    break;
                case -1716961682:
                case -549513543:
                    i10 = 700;
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = (C19806.m45029("᩹ۧ") + i4) * (-81);
                        i = ((iM45029 ^ i3) * (-29505)) ^ 1002713444;
                        i2 = 509428292;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩵ܽ") + i3) * (-111);
                        i = ((iM45029 ^ i4) * (-23831)) ^ 358530116;
                        i2 = -758262997;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1675549645:
                case -810327585:
                    intentM18982 = C7105.m18982(this);
                    sArr2 = f76464;
                    if (C3286.f12186) {
                        iM45029 = ThreadFactoryC3888.m11306("᩵᩹") ^ i3;
                        i = ((iM45029 ^ i4) * (-15269)) ^ 354087617;
                        i2 = -728093435;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚܶ") ^ i4;
                        i = ((iM45029 ^ i3) * 15333) ^ (-1529302815);
                        i2 = 1842339753;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1572166172:
                case 2089747550:
                    strM3859 = C1025.m3859(sArr2, i10, i11, i9);
                    z = false;
                    if (intentM18982.getBooleanExtra(strM3859, false)) {
                        iM45029 = (C19806.m45029("᩺ᩴ") ^ i3) * (-55);
                        i = ((iM45029 ^ i4) * 27775) ^ 71926168;
                        i2 = -1454819557;
                    } else {
                        iM45029 = (C19806.m45029("۫᩸") ^ i3) * (-83);
                        i = ((iM45029 ^ i4) * (-10809)) ^ 545119527;
                        i2 = 441442905;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1532467889:
                case 477973484:
                    if (C0050.f912 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۠ۗ") ^ i4;
                        i = ((iM45029 ^ i3) * (-20383)) ^ (-652339727);
                        i2 = 101844866;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ۫") ^ i4;
                        i = ((iM45029 ^ i3) * (-8135)) ^ 1129283296;
                        i2 = -41066915;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1488634853:
                case -64949077:
                    super.onResume();
                    if (MenuItemOnMenuItemClickListenerC3244.m9707()) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ᩳ۠")) * 69;
                        i = ((iM45029 ^ i4) * (-10079)) ^ 665318885;
                        i2 = -202676934;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ۬") ^ i4;
                        i = ((iM45029 ^ i3) * (-17465)) ^ 207000902;
                        i2 = 620900772;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1260204295:
                case 1466813565:
                    CallableC1627.m5507();
                    C1668.m5583();
                    break;
                case -1112356103:
                case 2110557882:
                    i9 = 4951;
                    iM45029 = (ThreadFactoryC3888.m11306("ܽ۬") + i4) * 61;
                    i = ((iM45029 ^ i3) * 2107) ^ (-784801333);
                    i2 = 70169908;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -998022280:
                case -419318828:
                    c = 699;
                    if (C2477.f9839 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳۘ") ^ i3;
                        i = ((iM45029 ^ i4) * (-13879)) ^ 851664845;
                        i2 = -159253777;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿ᩺") + i4) * 75;
                        i = ((iM45029 ^ i3) * (-32289)) ^ (-1387430597);
                        i2 = -311071046;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -870995211:
                case -393608893:
                    strM10056 = RunnableC3388.m10056(sArr3, i7, 18, i9);
                    if (intentM18983.getBooleanExtra(strM10056, z)) {
                        iM45029 = C19806.m45029("ܳ֡") ^ i3;
                        i = ((iM45029 ^ i4) * (-12441)) ^ (-1314118933);
                        i2 = 2128299507;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۟ۡ") ^ i4;
                        i = ((iM45029 ^ i3) * 1515) ^ (-1666178998);
                        i2 = 1846377194;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -793024178:
                case -587353212:
                    break;
                case -777026543:
                case -603784759:
                    if (i8 - (s * s2) >= 0) {
                        iM45029 = C19806.m45029("ܺۘ") ^ i3;
                        i = ((iM45029 ^ i4) * 1951) ^ (-888827311);
                        i2 = -2010898269;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙۜ") ^ i3) * (-19);
                        i = ((iM45029 ^ i4) * 5625) ^ (-1638798498);
                        i2 = -780138637;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -361049026:
                case 2136542082:
                    if (C2788.m8472() == 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳۘ") ^ i3;
                        i = ((iM45029 ^ i4) * (-13879)) ^ 851664845;
                        i2 = -159253777;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩵᩹") ^ i3;
                        i = ((iM45029 ^ i4) * (-15269)) ^ 354087617;
                        i2 = -728093435;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -132792173:
                case 1997059078:
                    i9 = 42175;
                    iM45029 = (ThreadFactoryC3888.m11306("ܽ۬") + i4) * 61;
                    i = ((iM45029 ^ i3) * 2107) ^ (-784801333);
                    i2 = 70169908;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -61175742:
                case 594777776:
                    i8 = i13 + 217769049;
                    if (RunnableC1564.m5345()) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳۘ") ^ i3;
                        i = ((iM45029 ^ i4) * (-13879)) ^ 851664845;
                        i2 = -159253777;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۧ") ^ i3;
                        i = ((iM45029 ^ i4) * (-3023)) ^ 574723968;
                        i2 = 591902633;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 313374838:
                case 1805869619:
                    i7 = 714;
                    if (C0962.f3784) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳۘ") ^ i3;
                        i = ((iM45029 ^ i4) * (-13879)) ^ 851664845;
                        i2 = -159253777;
                    } else {
                        iM45029 = C19806.m45029("ᩳ᩻") ^ i4;
                        i = ((iM45029 ^ i3) * 31079) ^ 476012464;
                        i2 = 1517903271;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 796275267:
                case 1333630881:
                    if (C1937.f7317 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۠ۗ") ^ i4;
                        i = ((iM45029 ^ i3) * (-20383)) ^ (-652339727);
                        i2 = 101844866;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳۘ") ^ i3;
                        i = ((iM45029 ^ i4) * (-13879)) ^ 851664845;
                        i2 = -159253777;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1046085631:
                case 1283134575:
                    C7105.m18982(this).removeExtra(strM3859);
                    m52054();
                    iM45029 = (C19806.m45029("۫᩸") ^ i3) * (-83);
                    i = ((iM45029 ^ i4) * (-10809)) ^ 545119527;
                    i2 = 441442905;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1400212404:
                case 1573388789:
                    s2 = 29514;
                    if (C2642.f10294 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ۫") ^ i4;
                        i = ((iM45029 ^ i3) * (-8135)) ^ 1129283296;
                        i2 = -41066915;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۤۖ")) * (-71);
                        i = ((iM45029 ^ i3) * 9723) ^ 2001666708;
                        i2 = -2086336765;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    i11 = 14;
                    if (C0962.f3784) {
                        iM45029 = ThreadFactoryC3888.m11306("۠ۗ") ^ i4;
                        i = ((iM45029 ^ i3) * (-20383)) ^ (-652339727);
                        i2 = 101844866;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۬᩸") ^ i4;
                        i = ((iM45029 ^ i3) * 21859) ^ 1827446320;
                        i2 = 280643172;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x022d A[PHI: r3 r4 r16
      0x022d: PHI (r3v2 short) = (r3v1 short), (r3v3 short) binds: [B:64:0x022b, B:54:0x01a8] A[DONT_GENERATE, DONT_INLINE]
      0x022d: PHI (r4v2 short) = (r4v1 short), (r4v3 short) binds: [B:64:0x022b, B:54:0x01a8] A[DONT_GENERATE, DONT_INLINE]
      0x022d: PHI (r16v5 java.lang.String) = (r16v3 java.lang.String), (r16v6 java.lang.String) binds: [B:64:0x022b, B:54:0x01a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0260 A[PHI: r5 r6 r8 r9 r16
      0x0260: PHI (r5v3 int) = (r5v1 int), (r5v2 int), (r5v1 int), (r5v1 int), (r5v1 int) binds: [B:68:0x025e, B:50:0x0183, B:46:0x015d, B:35:0x00db, B:18:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r6v3 short) = (r6v1 short), (r6v1 short), (r6v2 short), (r6v1 short), (r6v1 short) binds: [B:68:0x025e, B:50:0x0183, B:46:0x015d, B:35:0x00db, B:18:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r8v3 short[]) = (r8v1 short[]), (r8v1 short[]), (r8v1 short[]), (r8v2 short[]), (r8v1 short[]) binds: [B:68:0x025e, B:50:0x0183, B:46:0x015d, B:35:0x00db, B:18:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r9v7 int) = (r9v1 int), (r9v1 int), (r9v1 int), (r9v2 int), (r9v1 int) binds: [B:68:0x025e, B:50:0x0183, B:46:0x015d, B:35:0x00db, B:18:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r16v13 java.lang.String) = 
      (r16v2 java.lang.String)
      (r16v7 java.lang.String)
      (r16v8 java.lang.String)
      (r16v11 java.lang.String)
      (r16v14 java.lang.String)
     binds: [B:68:0x025e, B:50:0x0183, B:46:0x015d, B:35:0x00db, B:18:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        if (l.ViewGroupOnHierarchyChangeListenerC1916.f7262 == false) goto L18;
     */
    @Override // l.ActivityC1086, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNewIntent(android.content.Intent r19) {
        /*
            Method dump skipped, instruction units count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC23604.onNewIntent(android.content.Intent):void");
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01bc A[PHI: r20 r23
      0x01bc: PHI (r20v26 boolean) = (r20v21 boolean), (r20v27 boolean) binds: [B:49:0x01a3, B:32:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      0x01bc: PHI (r23v21 java.lang.String) = (r23v16 java.lang.String), (r23v22 java.lang.String) binds: [B:49:0x01a3, B:32:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x03bf A[PHI: r2 r20 r22 r23
      0x03bf: PHI (r2v4 java.lang.String) = (r2v1 java.lang.String), (r2v2 java.lang.String), (r2v1 java.lang.String) binds: [B:89:0x03bd, B:66:0x029c, B:9:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x03bf: PHI (r20v39 boolean) = (r20v9 boolean), (r20v17 boolean), (r20v45 boolean) binds: [B:89:0x03bd, B:66:0x029c, B:9:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x03bf: PHI (r22v6 char) = (r22v4 char), (r22v3 char), (r22v3 char) binds: [B:89:0x03bd, B:66:0x029c, B:9:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x03bf: PHI (r23v30 java.lang.String) = (r23v4 java.lang.String), (r23v12 java.lang.String), (r23v31 java.lang.String) binds: [B:89:0x03bd, B:66:0x029c, B:9:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x03f1 A[PHI: r7 r8 r16 r20 r21 r23
      0x03f1: PHI (r7v4 java.lang.String) = 
      (r7v1 java.lang.String)
      (r7v1 java.lang.String)
      (r7v3 java.lang.String)
      (r7v1 java.lang.String)
      (r7v1 java.lang.String)
     binds: [B:93:0x03ef, B:70:0x02c8, B:45:0x0186, B:38:0x0130, B:12:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x03f1: PHI (r8v4 java.lang.String) = 
      (r8v1 java.lang.String)
      (r8v1 java.lang.String)
      (r8v1 java.lang.String)
      (r8v3 java.lang.String)
      (r8v1 java.lang.String)
     binds: [B:93:0x03ef, B:70:0x02c8, B:45:0x0186, B:38:0x0130, B:12:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x03f1: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:93:0x03ef, B:70:0x02c8, B:45:0x0186, B:38:0x0130, B:12:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x03f1: PHI (r20v34 boolean) = (r20v8 boolean), (r20v16 boolean), (r20v22 boolean), (r20v24 boolean), (r20v35 boolean) binds: [B:93:0x03ef, B:70:0x02c8, B:45:0x0186, B:38:0x0130, B:12:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x03f1: PHI (r21v3 android.text.Editable) = 
      (r21v1 android.text.Editable)
      (r21v2 android.text.Editable)
      (r21v1 android.text.Editable)
      (r21v1 android.text.Editable)
      (r21v1 android.text.Editable)
     binds: [B:93:0x03ef, B:70:0x02c8, B:45:0x0186, B:38:0x0130, B:12:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x03f1: PHI (r23v27 java.lang.String) = 
      (r23v3 java.lang.String)
      (r23v11 java.lang.String)
      (r23v17 java.lang.String)
      (r23v19 java.lang.String)
      (r23v28 java.lang.String)
     binds: [B:93:0x03ef, B:70:0x02c8, B:45:0x0186, B:38:0x0130, B:12:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m52051(TextInputLayout textInputLayout, boolean z) {
        int iM45029;
        int i;
        int i2;
        int iM11306;
        int i3;
        int i4;
        String strM6674 = null;
        char[] cArr = null;
        int length = 0;
        boolean z2 = false;
        int i5 = 0;
        String strM9869 = null;
        String strM4969 = null;
        String strM6241 = null;
        short s = 0;
        int i6 = 0;
        int i7 = 0;
        short s2 = 0;
        int i8 = 1608694996;
        int i9 = C2871.f10837;
        int i10 = C1419.f5860;
        int iM450210 = (i10 - C19806.m45029("ۡۤ")) * 83;
        int i11 = ((iM450210 ^ i9) * (-10349)) ^ (-915905895);
        int i12 = iM450210 ^ (-1814988358);
        short[] sArr = null;
        int i13 = 0;
        Editable editableM10576 = null;
        char c = 0;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i9) * (-24819)) >> 31));
            switch (i8) {
                case -2139218745:
                case 993535450:
                    z2 = z2;
                    strM6241 = strM6241;
                    EditText editTextM3740 = C0962.m3740(textInputLayout);
                    C0629.m2908(editTextM3740);
                    editableM10576 = C3577.m10576(editTextM3740);
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = (i9 - C19806.m45029("۟ۢ")) * 83;
                        i = ((iM45029 ^ i10) * (-2921)) ^ (-493492677);
                        i2 = -1543266434;
                    } else {
                        iM45029 = (C19806.m45029("۫᩶") + i10) * (-113);
                        i = ((iM45029 ^ i9) * 23887) ^ 1752825612;
                        i2 = -311044141;
                    }
                    int i14 = iM45029 ^ i2;
                    strM6241 = strM6241;
                    boolean z3 = z2;
                    i12 = i14;
                    i11 = i;
                    z2 = z3;
                    break;
                case -2092135838:
                case 1482108736:
                    z2 = z2;
                    strM6241 = strM6241;
                    if (i7 - (s * s2) < 0) {
                        iM45029 = (i10 - C19806.m45029("ᩳ֨")) * (-73);
                        i = ((iM45029 ^ i9) * (-16355)) ^ 772095284;
                        i2 = 1807299128;
                    } else {
                        iM45029 = C19806.m45029("۟ۙ") ^ i9;
                        i = ((iM45029 ^ i10) * 10733) ^ 1627212909;
                        i2 = 1747691033;
                    }
                    int i15 = iM45029 ^ i2;
                    strM6241 = strM6241;
                    boolean z4 = z2;
                    i12 = i15;
                    i11 = i;
                    z2 = z4;
                    break;
                case -1927425625:
                case -1599636519:
                    i5++;
                    int iM11307 = ThreadFactoryC3888.m11306("ܰ۬") ^ i9;
                    i12 = iM11307 ^ 1814457953;
                    i11 = ((iM11307 ^ i10) * 18273) ^ 679838207;
                    strM6241 = strM6241;
                    break;
                case -1877863422:
                case -545344424:
                    C0671.m3008();
                    if (C1460.m5050() != 0) {
                        z2 = z2;
                        strM6241 = strM6241;
                        iM45029 = C19806.m45029("ۡ۫") ^ i9;
                        i = ((iM45029 ^ i10) * 18043) ^ (-1631052070);
                        i2 = -1780619803;
                        int i16 = iM45029 ^ i2;
                        strM6241 = strM6241;
                        boolean z5 = z2;
                        i12 = i16;
                        i11 = i;
                        z2 = z5;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠᩺") ^ i10;
                        i3 = ((iM11306 ^ i9) * 15181) ^ 313327844;
                        i4 = 1148718637;
                        i12 = iM11306 ^ i4;
                        i11 = i3;
                    }
                    break;
                case -1848055603:
                case 953909333:
                    C1025.m3861();
                    C1668.m5583();
                    z2 = z2;
                    strM6241 = strM6241;
                    iM45029 = (i9 - C19806.m45029("۟ۢ")) * 83;
                    i = ((iM45029 ^ i10) * (-2921)) ^ (-493492677);
                    i2 = -1543266434;
                    int i17 = iM45029 ^ i2;
                    strM6241 = strM6241;
                    boolean z6 = z2;
                    i12 = i17;
                    i11 = i;
                    z2 = z6;
                    break;
                case -1766262540:
                case 347650266:
                    C2642.m8170(textInputLayout, ThreadFactoryC3888.m11306(strM6241) ^ 2123083010);
                    iM45029 = ThreadFactoryC3888.m11306("۟۬") ^ i9;
                    i = ((iM45029 ^ i10) * (-26393)) ^ (-1923227825);
                    i2 = -932775842;
                    int i18 = iM45029 ^ i2;
                    strM6241 = strM6241;
                    boolean z7 = z2;
                    i12 = i18;
                    i11 = i;
                    z2 = z7;
                    break;
                case -1754138144:
                case -688072771:
                    z2 = z2;
                    strM6241 = strM6241;
                    if (C1977.m6360(strM6674) < 7) {
                        iM45029 = (i9 - C19806.m45029("᩶ܿ")) * 97;
                        i = ((iM45029 ^ i10) * 2757) ^ (-529810417);
                        i2 = 837271218;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ᩺") ^ i10;
                        i = ((iM45029 ^ i9) * (-15417)) ^ 1867442320;
                        i2 = -112066171;
                    }
                    int i19 = iM45029 ^ i2;
                    strM6241 = strM6241;
                    boolean z8 = z2;
                    i12 = i19;
                    i11 = i;
                    z2 = z8;
                    break;
                case -1676046803:
                case 2056663359:
                    return z2;
                case -1525888495:
                case 1641866142:
                    z2 = z2;
                    strM6241 = strM6241;
                    if (cArr[i5] == ' ') {
                        iM45029 = (C19806.m45029("᩶ۤ") + i9) * (-39);
                        i = ((iM45029 ^ i10) * 24119) ^ (-2076279241);
                        i2 = -1753369516;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿۙ") ^ i10;
                        i = ((iM45029 ^ i9) * 20509) ^ 782430626;
                        i2 = 1488797607;
                    }
                    int i110 = iM45029 ^ i2;
                    strM6241 = strM6241;
                    boolean z9 = z2;
                    i12 = i110;
                    i11 = i;
                    z2 = z9;
                    break;
                case -1483921483:
                case 1613644521:
                    C2124.m6673();
                    C1668.m5583();
                    return false;
                case -1303434263:
                case 1899860535:
                    short[] sArr2 = f76464;
                    z2 = z2;
                    if (C3577.m10565()) {
                        strM6241 = strM6241;
                        if (new C16762(C0797.m3361(sArr2, 195, 3, i13)).m39325((CharSequence) strM6674)) {
                            iM45029 = ThreadFactoryC3888.m11306("ܽ᩶") ^ i10;
                            i = ((iM45029 ^ i9) * (-4217)) ^ (-844260837);
                            i2 = 1027750053;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("ܰ᩹") ^ i10) * (-35);
                            i = ((iM45029 ^ i9) * (-20405)) ^ 1004178376;
                            i2 = -1344470522;
                        }
                    } else {
                        strM6241 = strM6241;
                        iM45029 = ThreadFactoryC3888.m11306("ۛ۠") ^ i9;
                        i = ((iM45029 ^ i10) * (-21675)) ^ 1377119984;
                        i2 = 1922862392;
                    }
                    int i111 = iM45029 ^ i2;
                    strM6241 = strM6241;
                    boolean z10 = z2;
                    i12 = i111;
                    i11 = i;
                    z2 = z10;
                    break;
                case -1066646319:
                case -274314258:
                    if (C1066.m4023() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۠᩺") ^ i10;
                        i3 = ((iM11306 ^ i9) * 15181) ^ 313327844;
                        i4 = 1148718637;
                        i12 = iM11306 ^ i4;
                        i11 = i3;
                    } else {
                        z2 = z2;
                        strM6241 = strM6241;
                        iM45029 = (i9 - C19806.m45029("۟ۢ")) * 83;
                        i = ((iM45029 ^ i10) * (-2921)) ^ (-493492677);
                        i2 = -1543266434;
                        int i112 = iM45029 ^ i2;
                        strM6241 = strM6241;
                        boolean z11 = z2;
                        i12 = i112;
                        i11 = i;
                        z2 = z11;
                    }
                    break;
                case -926575571:
                case -783627633:
                    z2 = z2;
                    strM6241 = strM6241;
                    sArr = f76464;
                    if (C0050.f912 <= 0) {
                        iM45029 = (i9 - C19806.m45029("۟ۢ")) * 83;
                        i = ((iM45029 ^ i10) * (-2921)) ^ (-493492677);
                        i2 = -1543266434;
                    } else {
                        iM45029 = (C19806.m45029("᩸᩺") + i9) * 45;
                        i = ((iM45029 ^ i10) * (-17325)) ^ (-1899779981);
                        i2 = 1532321409;
                    }
                    int i113 = iM45029 ^ i2;
                    strM6241 = strM6241;
                    boolean z12 = z2;
                    i12 = i113;
                    i11 = i;
                    z2 = z12;
                    break;
                case -923721096:
                case 41479273:
                    C3743.m10954(textInputLayout, C19806.m45029(strM9869) ^ 2126751030);
                    iM45029 = ThreadFactoryC3888.m11306("۟۬") ^ i9;
                    i = ((iM45029 ^ i10) * (-26393)) ^ (-1923227825);
                    i2 = -932775842;
                    int i114 = iM45029 ^ i2;
                    strM6241 = strM6241;
                    boolean z13 = z2;
                    i12 = i114;
                    i11 = i;
                    z2 = z13;
                    break;
                case -623153329:
                case 783210398:
                    i13 = 30345;
                    iM45029 = C19806.m45029("֨ۛ") ^ i9;
                    i = ((iM45029 ^ i10) * (-5857)) ^ (-126980410);
                    i2 = 848214136;
                    int i115 = iM45029 ^ i2;
                    strM6241 = strM6241;
                    boolean z14 = z2;
                    i12 = i115;
                    i11 = i;
                    z2 = z14;
                    break;
                case -556361391:
                case 1785067684:
                    z2 = z2;
                    strM6241 = strM6241;
                    if (i5 < length) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܺ֫") + i9) * 5;
                        i = ((iM45029 ^ i10) * (-15941)) ^ 471963718;
                        i2 = 526924463;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷ܳ") ^ i10) * (-23);
                        i = ((iM45029 ^ i9) * (-28717)) ^ 2134968563;
                        i2 = 1495766198;
                    }
                    int i116 = iM45029 ^ i2;
                    strM6241 = strM6241;
                    boolean z15 = z2;
                    i12 = i116;
                    i11 = i;
                    z2 = z15;
                    break;
                case -446798083:
                case 1585753784:
                    z2 = z2;
                    strM6241 = strM6241;
                    strM6674 = C2124.m6674(editableM10576);
                    int i20 = C1334.f5640;
                    if (C2642.m8171() != 0) {
                        iM45029 = C19806.m45029("ۡ۫") ^ i9;
                        i = ((iM45029 ^ i10) * 18043) ^ (-1631052070);
                        i2 = -1780619803;
                    } else {
                        iM45029 = (C19806.m45029("ۤܿ") ^ i10) * 17;
                        i = ((iM45029 ^ i9) * 21139) ^ 1031968924;
                        i2 = 852388454;
                    }
                    int i117 = iM45029 ^ i2;
                    strM6241 = strM6241;
                    boolean z16 = z2;
                    i12 = i117;
                    i11 = i;
                    z2 = z16;
                    break;
                case -387790074:
                case 972943828:
                    strM6241 = ViewGroupOnHierarchyChangeListenerC1916.m6241(f76464, 198, 3, i13);
                    if (C1461.f5957 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۠᩺") ^ i10;
                        i3 = ((iM11306 ^ i9) * 15181) ^ 313327844;
                        i4 = 1148718637;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۙ᩸") ^ i10) * 85;
                        i3 = ((iM11306 ^ i9) * 15191) ^ 545881853;
                        i4 = -86750029;
                    }
                    i12 = iM11306 ^ i4;
                    i11 = i3;
                    break;
                case -94714223:
                case 1227147747:
                    z2 = z2;
                    strM6241 = strM6241;
                    strM9869 = ViewTreeObserverOnPreDrawListenerC3327.m9869(f76464, 189, 3, i13);
                    if (C0050.f912 <= 0) {
                        iM45029 = (i9 - C19806.m45029("۟ۢ")) * 83;
                        i = ((iM45029 ^ i10) * (-2921)) ^ (-493492677);
                        i2 = -1543266434;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۧۘ") ^ i9;
                        i = ((iM45029 ^ i10) * 24147) ^ (-489083468);
                        i2 = 2046946341;
                    }
                    int i118 = iM45029 ^ i2;
                    strM6241 = strM6241;
                    boolean z17 = z2;
                    i12 = i118;
                    i11 = i;
                    z2 = z17;
                    break;
                case -976550:
                case 1221153504:
                    z2 = z2;
                    strM6241 = strM6241;
                    s = sArr[c];
                    i6 = s * s;
                    if (C3722.f13525 <= 0) {
                        iM45029 = (i10 - C19806.m45029("ۜ֨")) * 75;
                        i = ((iM45029 ^ i9) * 12511) ^ (-1977051632);
                        i2 = 95471224;
                    } else {
                        iM45029 = (C19806.m45029("ܳۘ") ^ i9) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM45029 ^ i10) * (-19039)) ^ (-685364865);
                        i2 = -924274371;
                    }
                    int i119 = iM45029 ^ i2;
                    strM6241 = strM6241;
                    boolean z18 = z2;
                    i12 = i119;
                    i11 = i;
                    z2 = z18;
                    break;
                case 29770105:
                case 731028734:
                    z2 = z2;
                    strM6241 = strM6241;
                    strM4969 = C1419.m4969(f76464, 192, 3, i13);
                    if (C1977.f7413 <= 0) {
                        iM45029 = (i9 - C19806.m45029("۟ۢ")) * 83;
                        i = ((iM45029 ^ i10) * (-2921)) ^ (-493492677);
                        i2 = -1543266434;
                    } else {
                        iM45029 = (C19806.m45029("ܺ۟") + i10) * (-17);
                        i = ((iM45029 ^ i9) * (-1399)) ^ 2087013541;
                        i2 = -1458787371;
                    }
                    int i1110 = iM45029 ^ i2;
                    strM6241 = strM6241;
                    boolean z19 = z2;
                    i12 = i1110;
                    i11 = i;
                    z2 = z19;
                    break;
                case 36883300:
                case 2036114020:
                    C2642.m8170(textInputLayout, C19806.m45029(strM4969) ^ 2121464047);
                    iM45029 = ThreadFactoryC3888.m11306("۟۬") ^ i9;
                    i = ((iM45029 ^ i10) * (-26393)) ^ (-1923227825);
                    i2 = -932775842;
                    int i1111 = iM45029 ^ i2;
                    strM6241 = strM6241;
                    boolean z110 = z2;
                    i12 = i1111;
                    i11 = i;
                    z2 = z110;
                    break;
                case 59972397:
                case 657271619:
                    C1398.m4895();
                    if (C2249.f8050 < 0) {
                        z2 = z2;
                        strM6241 = strM6241;
                        iM45029 = ThreadFactoryC3888.m11306("ۛ۠") ^ i9;
                        i = ((iM45029 ^ i10) * (-21675)) ^ 1377119984;
                        i2 = 1922862392;
                        int i1112 = iM45029 ^ i2;
                        strM6241 = strM6241;
                        boolean z111 = z2;
                        i12 = i1112;
                        i11 = i;
                        z2 = z111;
                    }
                    z2 = z2;
                    strM6241 = strM6241;
                    iM45029 = (i9 - C19806.m45029("۟ۢ")) * 83;
                    i = ((iM45029 ^ i10) * (-2921)) ^ (-493492677);
                    i2 = -1543266434;
                    int i1113 = iM45029 ^ i2;
                    strM6241 = strM6241;
                    boolean z112 = z2;
                    i12 = i1113;
                    i11 = i;
                    z2 = z112;
                    break;
                case 162501216:
                case 798849911:
                    z2 = z2;
                    strM6241 = strM6241;
                    c = 188;
                    if (C3743.m10966() <= 0) {
                        iM45029 = C19806.m45029("ۡ۫") ^ i9;
                        i = ((iM45029 ^ i10) * 18043) ^ (-1631052070);
                        i2 = -1780619803;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ᩶") ^ i10;
                        i = ((iM45029 ^ i9) * 17771) ^ 1291307325;
                        i2 = -1654021575;
                    }
                    int i1114 = iM45029 ^ i2;
                    strM6241 = strM6241;
                    boolean z113 = z2;
                    i12 = i1114;
                    i11 = i;
                    z2 = z113;
                    break;
                case 745423004:
                case 2112980363:
                    i13 = 10092;
                    iM45029 = C19806.m45029("֨ۛ") ^ i9;
                    i = ((iM45029 ^ i10) * (-5857)) ^ (-126980410);
                    i2 = 848214136;
                    int i1115 = iM45029 ^ i2;
                    strM6241 = strM6241;
                    boolean z114 = z2;
                    i12 = i1115;
                    i11 = i;
                    z2 = z114;
                    break;
                case 754009752:
                case 903633087:
                    z2 = z2;
                    strM6241 = strM6241;
                    if (z) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܰ᩹") ^ i10) * (-35);
                        i = ((iM45029 ^ i9) * (-20405)) ^ 1004178376;
                        i2 = -1344470522;
                    } else {
                        iM45029 = (C19806.m45029("۬۠") + i9) * (-31);
                        i = ((iM45029 ^ i10) * (-29105)) ^ 2081427832;
                        i2 = -425862167;
                    }
                    int i1116 = iM45029 ^ i2;
                    strM6241 = strM6241;
                    boolean z115 = z2;
                    i12 = i1116;
                    i11 = i;
                    z2 = z115;
                    break;
                case 884162884:
                case 1981207000:
                    z2 = z2;
                    strM6241 = strM6241;
                    i7 = i6 + 46348864;
                    s2 = 13616;
                    if (C0962.f3784) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ۠") ^ i9;
                        i = ((iM45029 ^ i10) * (-21675)) ^ 1377119984;
                        i2 = 1922862392;
                    } else {
                        iM45029 = (i10 - ThreadFactoryC3888.m11306("ۚۚ")) * 91;
                        i = ((iM45029 ^ i9) * 5951) ^ (-1056668852);
                        i2 = -1212005922;
                    }
                    int i1117 = iM45029 ^ i2;
                    strM6241 = strM6241;
                    boolean z116 = z2;
                    i12 = i1117;
                    i11 = i;
                    z2 = z116;
                    break;
                case 925081968:
                case 1696738049:
                    return true;
                default:
                    char[] charArray = strM6674.toCharArray();
                    length = charArray.length;
                    z2 = false;
                    i5 = 0;
                    cArr = charArray;
                    int iM11308 = ThreadFactoryC3888.m11306("ܰ۬") ^ i9;
                    i12 = iM11308 ^ 1814457953;
                    i11 = ((iM11308 ^ i10) * 18273) ^ 679838207;
                    strM6241 = strM6241;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x019a A[PHI: r2 r16 r17
      0x019a: PHI (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v2 java.lang.String) binds: [B:55:0x0182, B:45:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x019a: PHI (r16v9 int) = (r16v8 int), (r16v10 int) binds: [B:55:0x0182, B:45:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x019a: PHI (r17v9 short[]) = (r17v8 short[]), (r17v10 short[]) binds: [B:55:0x0182, B:45:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x01c3 A[PHI: r16 r17
      0x01c3: PHI (r16v11 int) = (r16v7 int), (r16v12 int) binds: [B:59:0x01c1, B:37:0x00e7] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r17v11 short[]) = (r17v7 short[]), (r17v12 short[]) binds: [B:59:0x01c1, B:37:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x0285 A[PHI: r5 r6 r7 r8 r16 r17
      0x0285: PHI (r5v4 short) = (r5v3 short), (r5v2 short), (r5v2 short), (r5v2 short) binds: [B:74:0x0283, B:70:0x025f, B:14:0x005c, B:26:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:74:0x0283, B:70:0x025f, B:14:0x005c, B:26:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:74:0x0283, B:70:0x025f, B:14:0x005c, B:26:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:74:0x0283, B:70:0x025f, B:14:0x005c, B:26:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r16v17 int) = (r16v1 int), (r16v2 int), (r16v14 int), (r16v25 int) binds: [B:74:0x0283, B:70:0x025f, B:14:0x005c, B:26:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r17v16 short[]) = (r17v1 short[]), (r17v2 short[]), (r17v14 short[]), (r17v21 short[]) binds: [B:74:0x0283, B:70:0x025f, B:14:0x005c, B:26:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x02ea A[PHI: r16 r17
      0x02ea: PHI (r16v19 int) = (r16v0 int), (r16v10 int), (r16v20 int) binds: [B:83:0x02e8, B:42:0x0111, B:9:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x02ea: PHI (r17v18 short[]) = (r17v0 short[]), (r17v10 short[]), (r17v19 short[]) binds: [B:83:0x02e8, B:42:0x0111, B:9:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r4v85, types: [l.ۗ᩵᩺] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52042(EditText editText, final DialogInterfaceC19356 dialogInterfaceC19356, ViewOnClickListenerC23604 viewOnClickListenerC23604, final TextInputLayout textInputLayout) {
        int iM11306;
        int i;
        int iM11307;
        int i2;
        String strM3407 = null;
        String strM5070 = null;
        short[] sArr = null;
        short s = 0;
        short s2 = 0;
        int i3 = 0;
        short s3 = 0;
        int i4 = 0;
        int i5 = -706807975;
        int i6 = C0629.f2722;
        int i7 = C1189.f5284;
        int iM45029 = (C19806.m45029("۟᩶") + i6) * 127;
        int i8 = ((iM45029 ^ i7) * 29139) ^ (-1437978284);
        int i9 = 423196262;
        while (true) {
            int i10 = iM45029 ^ i9;
            while (true) {
                i5 = ((((i5 ^ i7) * (-10573)) >> 31) & i8) ^ i10;
                switch (i5) {
                    case -1985405749:
                    case -77486192:
                        sArr = sArr;
                        i5 = i5;
                        if (C19328.m44319(textInputLayout)) {
                            iM11306 = (i7 - ThreadFactoryC3888.m11306("ۗۖ")) * 119;
                            i8 = (-1837233839) ^ ((iM11306 ^ i6) * 12987);
                            i = 1070530894;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("᩷ᩳ") + i6) * (-45);
                            i8 = 2057019052 ^ ((iM11306 ^ i7) * 25069);
                            i = -123426360;
                        }
                        i10 = i ^ iM11306;
                        i5 = i5;
                        sArr = sArr;
                        break;
                    case -1814944674:
                    case 610368806:
                        sArr = sArr;
                        i5 = i5;
                        i3 = (s * s2) + 1;
                        s3 = 1;
                        if (CallableC1627.f6528) {
                            iM11306 = ThreadFactoryC3888.m11306("֡ۘ") ^ i7;
                            i8 = 2105360745 ^ ((iM11306 ^ i6) * 22053);
                            i = -980773166;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("᩸ۘ") ^ i6;
                            i8 = 721600661 ^ ((iM11306 ^ i7) * (-11999));
                            i = 738635501;
                        }
                        i10 = i ^ iM11306;
                        i5 = i5;
                        sArr = sArr;
                        break;
                    case -1665263537:
                    case 402950817:
                        sArr = sArr;
                        i5 = i5;
                        if (viewOnClickListenerC23604.f76467.m50803()) {
                            iM11306 = (i7 - ThreadFactoryC3888.m11306("ۗۖ")) * 119;
                            i8 = (-1837233839) ^ ((iM11306 ^ i6) * 12987);
                            i = 1070530894;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ܶ᩹") ^ i7;
                            i8 = (-109782301) ^ ((iM11306 ^ i6) * (-29465));
                            i = 1342118465;
                        }
                        i10 = i ^ iM11306;
                        i5 = i5;
                        sArr = sArr;
                        break;
                    case -1604398998:
                    case 959191672:
                        C2642.m8170(textInputLayout, C19806.m45029(strM5070) ^ 2126740925);
                        break;
                    case -1481575710:
                    case 2133658610:
                        i4 = 30015;
                        iM11306 = C19806.m45029("ܺۨ") ^ i7;
                        i8 = 55461288 ^ ((iM11306 ^ i6) * 22025);
                        i = -1960314033;
                        i10 = i ^ iM11306;
                        i5 = i5;
                        sArr = sArr;
                        break;
                    case -1365481801:
                    case -1244882508:
                        sArr = sArr;
                        i5 = i5;
                        int i11 = s + s3;
                        if ((i11 * i11) - i3 < 0) {
                            iM11306 = (C19806.m45029("۬᩶") ^ i7) * 55;
                            i8 = 95970041 ^ ((iM11306 ^ i6) * (-16767));
                            i = 1614226015;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("᩶ۙ") ^ i6;
                            i8 = (-1063613506) ^ ((iM11306 ^ i7) * 18377);
                            i = 1963123420;
                        }
                        i10 = i ^ iM11306;
                        i5 = i5;
                        sArr = sArr;
                        break;
                    case -1110037725:
                    case 1353704171:
                        sArr = sArr;
                        i5 = i5;
                        if (C0216.f1393 != 0) {
                            iM11306 = C19806.m45029("ۛܿ") ^ i6;
                            i8 = 1902978873 ^ ((iM11306 ^ i7) * 22669);
                            i = 1881662784;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ۨۘ") ^ i6;
                            i8 = (-2108597594) ^ ((iM11306 ^ i7) * (-8727));
                            i = 151082283;
                        }
                        i10 = i ^ iM11306;
                        i5 = i5;
                        sArr = sArr;
                        break;
                    case -520444284:
                    case 1665723968:
                        C2704.m8255();
                        C2642.m8171();
                        iM45029 = C19806.m45029("ۤܺ") ^ i7;
                        i8 = ((iM45029 ^ i6) * (-9523)) ^ (-838583009);
                        i9 = 2101412225;
                    case -355290259:
                    case 393953612:
                        sArr = sArr;
                        i5 = i5;
                        strM5070 = C1461.m5070(f76464, 56, 3, i4);
                        if (C3577.f13150 < 0) {
                            iM11306 = C19806.m45029("۬۟") ^ i6;
                            i8 = (-928663796) ^ ((iM11306 ^ i7) * 16709);
                            i = 709040079;
                            i10 = i ^ iM11306;
                            i5 = i5;
                            sArr = sArr;
                        } else {
                            sArr = sArr;
                            iM11307 = C19806.m45029("ܰܳ") ^ i6;
                            i8 = ((iM11307 ^ i7) * 27209) ^ 2116921337;
                            i2 = -273813127;
                            i10 = iM11307 ^ i2;
                            i5 = i5;
                        }
                        break;
                    case -195104130:
                    case 218589030:
                        C0817.m3399();
                        break;
                    case -103256479:
                    case -54343746:
                        C1066.m4023();
                        if (RunnableC1606.f6488 >= 0) {
                            iM45029 = C19806.m45029("ۤ᩹") ^ i7;
                            i8 = ((iM45029 ^ i6) * 32761) ^ 1423302682;
                            i9 = -1240854075;
                        } else {
                            iM45029 = C19806.m45029("ۤܺ") ^ i7;
                            i8 = ((iM45029 ^ i6) * (-9523)) ^ (-838583009);
                            i9 = 2101412225;
                        }
                        break;
                    case -85489460:
                    case 281874823:
                        sArr = sArr;
                        i5 = i5;
                        short[] sArr2 = f76464;
                        if (C2642.m8171() != 0) {
                            iM11306 = C19806.m45029("ۛܿ") ^ i6;
                            i8 = 1902978873 ^ ((iM11306 ^ i7) * 22669);
                            i = 1881662784;
                        } else if (new C16762(C1148.m4230(sArr2, 59, 3, i4)).m39325((CharSequence) strM3407)) {
                            iM11306 = (ThreadFactoryC3888.m11306("ᩳۚ") + i6) * 61;
                            i8 = (-456614188) ^ ((iM11306 ^ i7) * 24299);
                            i = 1054333008;
                        } else {
                            iM11306 = (i7 - C19806.m45029("ᩳۡ")) * 53;
                            i8 = (-2034674442) ^ ((iM11306 ^ i6) * (-29291));
                            i = 713170483;
                        }
                        i10 = i ^ iM11306;
                        i5 = i5;
                        sArr = sArr;
                        break;
                    case 263573072:
                    case 1567432511:
                        break;
                    case 355268660:
                    case 443439391:
                        i5 = i5;
                        sArr = f76464;
                        if (C2871.f10837 >= 0) {
                            iM11307 = C19806.m45029("ܰܳ") ^ i6;
                            i8 = ((iM11307 ^ i7) * 27209) ^ 2116921337;
                            i2 = -273813127;
                        } else {
                            iM11307 = ThreadFactoryC3888.m11306("ۡܿ") ^ i7;
                            i8 = ((iM11307 ^ i6) * 603) ^ (-64552769);
                            i2 = 647160445;
                        }
                        i10 = iM11307 ^ i2;
                        i5 = i5;
                        break;
                    case 387099881:
                    case 1063929161:
                        C3743.m10966();
                        if (C1937.m6279() < 0) {
                            iM45029 = C19806.m45029("ۤܺ") ^ i7;
                            i8 = ((iM45029 ^ i6) * (-9523)) ^ (-838583009);
                            i9 = 2101412225;
                        }
                        sArr = sArr;
                        i5 = i5;
                        iM11306 = C19806.m45029("ۛܿ") ^ i6;
                        i8 = 1902978873 ^ ((iM11306 ^ i7) * 22669);
                        i = 1881662784;
                        i10 = i ^ iM11306;
                        i5 = i5;
                        sArr = sArr;
                        break;
                    case 968064484:
                    case 1456768050:
                        sArr = sArr;
                        i5 = i5;
                        s = sArr[55];
                        s2 = 2;
                        if (AbstractC0464.f2088 <= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("᩸ۘ") ^ i6;
                            i8 = 721600661 ^ ((iM11306 ^ i7) * (-11999));
                            i = 738635501;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ۖ᩸") ^ i6;
                            i8 = (-1574929787) ^ ((iM11306 ^ i7) * (-13685));
                            i = -2135090440;
                        }
                        i10 = i ^ iM11306;
                        i5 = i5;
                        sArr = sArr;
                        break;
                    case 1041766787:
                    case 1718487355:
                        i4 = 48261;
                        iM11306 = C19806.m45029("ܺۨ") ^ i7;
                        i8 = 55461288 ^ ((iM11306 ^ i6) * 22025);
                        i = -1960314033;
                        i10 = i ^ iM11306;
                        i5 = i5;
                        sArr = sArr;
                        break;
                    case 1069111923:
                    case 1646253418:
                        int iM2432 = C0526.m2432(strM3407);
                        short[] sArr3 = f76464;
                        if (C1398.f5802 > 0) {
                            i5 = i5;
                            if (C10634.f36300 < 0) {
                                sArr = sArr;
                                int iM450210 = C19806.m45029(ViewTreeObserverOnPreDrawListenerC3327.m9869(sArr3, 62, 3, i4));
                                if (!CallableC1627.f6528) {
                                    sArr = sArr;
                                    iM11307 = C19806.m45029("ܰܳ") ^ i6;
                                    i8 = ((iM11307 ^ i7) * 27209) ^ 2116921337;
                                    i2 = -273813127;
                                    i10 = iM11307 ^ i2;
                                    i5 = i5;
                                } else {
                                    final C17485 c17485 = new C17485(viewOnClickListenerC23604, iM450210 ^ 2121093094);
                                    C1025.m3858(c17485);
                                    if (!C0526.f2219) {
                                        C2642.m8165(new C22150(iM2432, viewOnClickListenerC23604, new InterfaceC6627() { // from class: l.ۗ᩵᩺

                                            /* JADX INFO: renamed from: ܺۜܺ, reason: not valid java name and contains not printable characters */
                                            private static final short[] f12692 = {8967, 1485, 1498, 1484, 1487, 1488, 1489, 1484, 1498, 28176, 30438, 29171, 31680, 28888, 22315};

                                            {
                                                int i12 = 846039153;
                                                int i13 = C10634.f36300;
                                                int i14 = C3722.f13525;
                                                int iM11308 = (i13 - ThreadFactoryC3888.m11306("ۛ֫")) * 37;
                                                int i15 = ((iM11308 ^ i14) * 16035) ^ (-76681752);
                                                int i16 = 2002871169;
                                                while (true) {
                                                    i12 = ((((i12 ^ i14) * (-16307)) >> 31) & i15) ^ (iM11308 ^ i16);
                                                    switch (i12) {
                                                        case -2003705777:
                                                        case -1636873232:
                                                            C3577.m10565();
                                                            C3722.m10894();
                                                            iM11308 = (i13 - ThreadFactoryC3888.m11306("ܺ᩻")) * 43;
                                                            i15 = ((iM11308 ^ i14) * (-17783)) ^ (-1371239027);
                                                            i16 = 804776893;
                                                            break;
                                                        case -1847538458:
                                                        case 1253266965:
                                                            if (C0629.f2722 <= 0) {
                                                                iM11308 = (C19806.m45029("ۢ۟") ^ i14) * 9;
                                                                i15 = ((iM11308 ^ i13) * (-17159)) ^ 1646736491;
                                                                i16 = -820444945;
                                                            } else {
                                                                iM11308 = (ThreadFactoryC3888.m11306("᩹۬") ^ i13) * (-33);
                                                                i15 = ((iM11308 ^ i14) * 16025) ^ (-1920529199);
                                                                i16 = -928482208;
                                                            }
                                                            break;
                                                        case -1755888280:
                                                        case 1651047995:
                                                            if (C0797.f3386) {
                                                                iM11308 = C19806.m45029("ᩴ֨") ^ i13;
                                                                i15 = ((iM11308 ^ i14) * (-8307)) ^ (-1996543756);
                                                                i16 = 1796266835;
                                                            } else {
                                                                iM11308 = ThreadFactoryC3888.m11306("᩸۠") ^ i14;
                                                                i15 = ((iM11308 ^ i13) * (-4975)) ^ (-1298882286);
                                                                i16 = 1488944795;
                                                            }
                                                            break;
                                                        case -1665157522:
                                                        case 403733986:
                                                            if (RunnableC1606.f6488 < 0) {
                                                                iM11308 = C19806.m45029("ᩴ֨") ^ i13;
                                                                i15 = ((iM11308 ^ i14) * (-8307)) ^ (-1996543756);
                                                                i16 = 1796266835;
                                                            } else {
                                                                iM11308 = (C19806.m45029("ۢ۟") ^ i14) * 9;
                                                                i15 = ((iM11308 ^ i13) * (-17159)) ^ 1646736491;
                                                                i16 = -820444945;
                                                            }
                                                            break;
                                                        case -1278054927:
                                                        case 362960930:
                                                            if (C3743.f13569) {
                                                                iM11308 = (i13 - C19806.m45029("ۗ᩺")) * (-73);
                                                                i15 = ((iM11308 ^ i14) * (-30197)) ^ 1365271462;
                                                                i16 = -1637839686;
                                                            } else {
                                                                iM11308 = (i13 - ThreadFactoryC3888.m11306("ܺ᩻")) * 43;
                                                                i15 = ((iM11308 ^ i14) * (-17783)) ^ (-1371239027);
                                                                i16 = 804776893;
                                                            }
                                                            break;
                                                        case -953869857:
                                                        case -102401614:
                                                            if (RunnableC3388.f12514 >= 0) {
                                                                iM11308 = ThreadFactoryC3888.m11306("ۖܳ") ^ i14;
                                                                i15 = ((iM11308 ^ i13) * (-23153)) ^ 1659758488;
                                                                i16 = -1178510679;
                                                            } else {
                                                                iM11308 = (i14 - ThreadFactoryC3888.m11306("᩺ᩳ")) * 83;
                                                                i15 = ((iM11308 ^ i13) * 16913) ^ (-1432440564);
                                                                i16 = 540971578;
                                                            }
                                                            break;
                                                        case -850506204:
                                                        case -107334362:
                                                            if (C1668.m5583()) {
                                                                iM11308 = C19806.m45029("۠ۖ") ^ i13;
                                                                i15 = ((iM11308 ^ i14) * 9691) ^ (-141456865);
                                                                i16 = 1567473133;
                                                            } else {
                                                                iM11308 = ThreadFactoryC3888.m11306("ۖܳ") ^ i14;
                                                                i15 = ((iM11308 ^ i13) * (-23153)) ^ 1659758488;
                                                                i16 = -1178510679;
                                                            }
                                                            break;
                                                        case -749083758:
                                                        case 947052880:
                                                            return;
                                                        case -736682356:
                                                        case 2068921:
                                                            C0629.m2907();
                                                            if (C0671.f2816 != 0) {
                                                                iM11308 = (C19806.m45029("ۢ۟") ^ i14) * 9;
                                                                i15 = ((iM11308 ^ i13) * (-17159)) ^ 1646736491;
                                                                i16 = -820444945;
                                                            } else {
                                                                iM11308 = (i13 - ThreadFactoryC3888.m11306("ܺ᩻")) * 43;
                                                                i15 = ((iM11308 ^ i14) * (-17783)) ^ (-1371239027);
                                                                i16 = 804776893;
                                                            }
                                                            break;
                                                        case -549568558:
                                                        case -496395664:
                                                            if (C2124.m6673() <= 0) {
                                                                iM11308 = C19806.m45029("ᩴ֨") ^ i13;
                                                                i15 = ((iM11308 ^ i14) * (-8307)) ^ (-1996543756);
                                                                i16 = 1796266835;
                                                            } else {
                                                                iM11308 = (i14 - ThreadFactoryC3888.m11306("᩵֡")) * 57;
                                                                i15 = ((iM11308 ^ i13) * (-11593)) ^ (-639720880);
                                                                i16 = 315737867;
                                                            }
                                                            break;
                                                        case -319188730:
                                                        case 1730694361:
                                                            if (C2249.f8050 >= 0) {
                                                                iM11308 = (i13 - ThreadFactoryC3888.m11306("ܺ᩻")) * 43;
                                                                i15 = ((iM11308 ^ i14) * (-17783)) ^ (-1371239027);
                                                                i16 = 804776893;
                                                            } else {
                                                                iM11308 = (i13 - ThreadFactoryC3888.m11306("۠ܳ")) * 17;
                                                                i15 = ((iM11308 ^ i14) * (-30189)) ^ 1495751307;
                                                                i16 = 1453545514;
                                                            }
                                                            break;
                                                        case -90961187:
                                                        case 115867145:
                                                            if (C3286.f12186) {
                                                                iM11308 = (C19806.m45029("۟᩹") ^ i13) * (-105);
                                                                i15 = ((iM11308 ^ i14) * 30191) ^ (-1372732002);
                                                                i16 = -660142132;
                                                            } else {
                                                                iM11308 = (i14 - C19806.m45029("᩶ۜ")) * 127;
                                                                i15 = ((iM11308 ^ i13) * 9851) ^ 1155924590;
                                                                i16 = 735129789;
                                                            }
                                                            break;
                                                        case 318687750:
                                                        case 2146642379:
                                                            if (!C19806.f63586) {
                                                                iM11308 = (i13 - ThreadFactoryC3888.m11306("ܺ᩻")) * 43;
                                                                i15 = ((iM11308 ^ i14) * (-17783)) ^ (-1371239027);
                                                                i16 = 804776893;
                                                            } else {
                                                                iM11308 = ThreadFactoryC3888.m11306("ۖܳ") ^ i14;
                                                                i15 = ((iM11308 ^ i13) * (-23153)) ^ 1659758488;
                                                                i16 = -1178510679;
                                                            }
                                                            break;
                                                        case 348204754:
                                                        case 431522914:
                                                            if (C3535.f13026 <= 0) {
                                                                iM11308 = (C19806.m45029("ۢ۟") ^ i14) * 9;
                                                                i15 = ((iM11308 ^ i13) * (-17159)) ^ 1646736491;
                                                                i16 = -820444945;
                                                            } else {
                                                                iM11308 = (i14 - C19806.m45029("ܶ᩶")) * (-3);
                                                                i15 = ((iM11308 ^ i13) * 11837) ^ (-299061513);
                                                                i16 = 1120274518;
                                                            }
                                                            break;
                                                        case 924231122:
                                                        case 2109895209:
                                                            if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                                                                iM11308 = C19806.m45029("ܳ᩸") ^ i13;
                                                                i15 = ((iM11308 ^ i14) * (-16241)) ^ 1452801006;
                                                                i16 = 1818093148;
                                                            } else {
                                                                iM11308 = (C19806.m45029("۟᩹") ^ i13) * (-105);
                                                                i15 = ((iM11308 ^ i14) * 30191) ^ (-1372732002);
                                                                i16 = -660142132;
                                                            }
                                                            break;
                                                        default:
                                                            C0278.m1789();
                                                            C0629.m2907();
                                                            throw new RuntimeException();
                                                    }
                                                }
                                            }

                                            /* JADX WARN: Code duplicated, block: B:17:0x0094  */
                                            /* JADX WARN: Code duplicated, block: B:35:0x0126 A[PHI: r4 r8 r9 r10
                                              0x0126: PHI (r4v4 int) = (r4v3 int), (r4v2 int), (r4v2 int), (r4v2 int) binds: [B:34:0x0124, B:28:0x00f3, B:12:0x0088, B:9:0x0082] A[DONT_GENERATE, DONT_INLINE]
                                              0x0126: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:34:0x0124, B:28:0x00f3, B:12:0x0088, B:9:0x0082] A[DONT_GENERATE, DONT_INLINE]
                                              0x0126: PHI (r9v4 short[]) = (r9v2 short[]), (r9v3 short[]), (r9v2 short[]), (r9v2 short[]) binds: [B:34:0x0124, B:28:0x00f3, B:12:0x0088, B:9:0x0082] A[DONT_GENERATE, DONT_INLINE]
                                              0x0126: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:34:0x0124, B:28:0x00f3, B:12:0x0088, B:9:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
                                            /* JADX WARN: Code duplicated, block: B:59:0x0241 A[PHI: r5 r19 r25
                                              0x0241: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:58:0x023f, B:24:0x00d0, B:9:0x0082] A[DONT_GENERATE, DONT_INLINE]
                                              0x0241: PHI (r19v4 int) = (r19v3 int), (r19v2 int), (r19v2 int) binds: [B:58:0x023f, B:24:0x00d0, B:9:0x0082] A[DONT_GENERATE, DONT_INLINE]
                                              0x0241: PHI (r25v5 short) = (r25v4 short), (r25v3 short), (r25v3 short) binds: [B:58:0x023f, B:24:0x00d0, B:9:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
                                            /* JADX WARN: Code duplicated, block: B:67:0x0295 A[PHI: r6 r7 r13 r14 r15 r17
                                              0x0295: PHI (r6v4 int) = (r6v2 int), (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:66:0x0293, B:50:0x01e2, B:38:0x015d, B:18:0x00aa, B:15:0x0090] A[DONT_GENERATE, DONT_INLINE]
                                              0x0295: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:66:0x0293, B:50:0x01e2, B:38:0x015d, B:18:0x00aa, B:15:0x0090] A[DONT_GENERATE, DONT_INLINE]
                                              0x0295: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:66:0x0293, B:50:0x01e2, B:38:0x015d, B:18:0x00aa, B:15:0x0090] A[DONT_GENERATE, DONT_INLINE]
                                              0x0295: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:66:0x0293, B:50:0x01e2, B:38:0x015d, B:18:0x00aa, B:15:0x0090] A[DONT_GENERATE, DONT_INLINE]
                                              0x0295: PHI (r15v4 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v3 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:66:0x0293, B:50:0x01e2, B:38:0x015d, B:18:0x00aa, B:15:0x0090] A[DONT_GENERATE, DONT_INLINE]
                                              0x0295: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:66:0x0293, B:50:0x01e2, B:38:0x015d, B:18:0x00aa, B:15:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
                                            /* JADX WARN: Code duplicated, block: B:71:0x02c7 A[PHI: r3 r16 r18 r20
                                              0x02c7: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v4 java.lang.String) binds: [B:70:0x02c5, B:62:0x0275, B:46:0x01bd] A[DONT_GENERATE, DONT_INLINE]
                                              0x02c7: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:70:0x02c5, B:62:0x0275, B:46:0x01bd] A[DONT_GENERATE, DONT_INLINE]
                                              0x02c7: PHI (r18v4 int) = (r18v2 int), (r18v3 int), (r18v2 int) binds: [B:70:0x02c5, B:62:0x0275, B:46:0x01bd] A[DONT_GENERATE, DONT_INLINE]
                                              0x02c7: PHI (r20v4 short) = (r20v2 short), (r20v3 short), (r20v2 short) binds: [B:70:0x02c5, B:62:0x0275, B:46:0x01bd] A[DONT_GENERATE, DONT_INLINE]] */
                                            @Override // l.InterfaceC6627
                                            /* JADX INFO: renamed from: ۙ */
                                            public final void mo3852(C1313 c1313) {
                                                int iM11308;
                                                int i12;
                                                int i13;
                                                int i14 = ThreadFactoryC3888.f14547;
                                                int i15 = C2124.f7782;
                                                int iM450211 = C19806.m45029("ܿ֫") ^ i14;
                                                int i16 = ((iM450211 ^ i15) * 14221) ^ (-1333119737);
                                                short[] sArr4 = null;
                                                short[] sArr5 = null;
                                                short[] sArr6 = null;
                                                short[] sArr7 = null;
                                                int i17 = iM450211 ^ 643363192;
                                                String strM10790 = null;
                                                int iM11309 = 0;
                                                int iM450212 = 0;
                                                int i18 = 0;
                                                int i19 = 0;
                                                int i20 = 0;
                                                int i21 = 0;
                                                int i22 = 0;
                                                int i23 = 0;
                                                char c = 0;
                                                int i24 = 0;
                                                int i25 = 0;
                                                short s4 = 0;
                                                int i26 = -79022774;
                                                short s5 = 0;
                                                while (true) {
                                                    i26 = i17 ^ (i16 & (((i26 ^ i15) * 9679) >> 31));
                                                    switch (i26) {
                                                        case -2125823697:
                                                        case 1983981045:
                                                            C2704.m8238(c1313, strM10790);
                                                            C1419.m4978(c17485);
                                                            if (C0962.m3738(c1313)) {
                                                                iM11308 = (C19806.m45029("ۢۘ") ^ i14) * 101;
                                                                i12 = ((iM11308 ^ i15) * (-31333)) ^ (-2144000918);
                                                                i13 = 1842806605;
                                                            } else {
                                                                iM11308 = (i15 - C19806.m45029("ܿᩴ")) * 61;
                                                                i12 = ((iM11308 ^ i14) * (-14543)) ^ 1746946079;
                                                                i13 = 1867735011;
                                                            }
                                                            i17 = iM11308 ^ i13;
                                                            i16 = i12;
                                                            break;
                                                        case -1992238405:
                                                        case -1583516993:
                                                            c = 0;
                                                            if (C0817.f3443) {
                                                                iM11308 = (C19806.m45029("ۤ۟") ^ i15) * 35;
                                                                i12 = ((iM11308 ^ i14) * 27649) ^ 921721381;
                                                                i13 = 1603975287;
                                                            } else {
                                                                iM11308 = C19806.m45029("۠ۜ") ^ i14;
                                                                i12 = ((iM11308 ^ i15) * (-24427)) ^ 1651690421;
                                                                i13 = -902450464;
                                                            }
                                                            i17 = iM11308 ^ i13;
                                                            i16 = i12;
                                                            break;
                                                        case -1963018046:
                                                        case -1672027368:
                                                            C7105.m18985();
                                                            C0526.m2437();
                                                            break;
                                                        case -1929162889:
                                                        case 1315376933:
                                                            int i27 = ViewOnClickListenerC23604.f76463;
                                                            sArr5 = f12692;
                                                            i23 = 1;
                                                            if (RunnableC3388.m10064()) {
                                                                iM11308 = (i15 - ThreadFactoryC3888.m11306("᩸᩵")) * 57;
                                                                i12 = ((iM11308 ^ i14) * (-8721)) ^ (-1010735138);
                                                                i13 = 1103309287;
                                                            } else {
                                                                iM11308 = C19806.m45029("۠ۜ") ^ i14;
                                                                i12 = ((iM11308 ^ i15) * (-24427)) ^ 1651690421;
                                                                i13 = -902450464;
                                                            }
                                                            i17 = iM11308 ^ i13;
                                                            i16 = i12;
                                                            break;
                                                        case -1897305828:
                                                        case 369551675:
                                                            C2477.m7593();
                                                            if (C1875.f7103 < 0) {
                                                                iM11308 = C19806.m45029("۠ۜ") ^ i14;
                                                                i12 = ((iM11308 ^ i15) * (-24427)) ^ 1651690421;
                                                                i13 = -902450464;
                                                            } else {
                                                                iM11308 = ThreadFactoryC3888.m11306("۬ۡ") ^ i14;
                                                                i12 = ((iM11308 ^ i15) * (-22143)) ^ 475545605;
                                                                i13 = -58239479;
                                                            }
                                                            i17 = iM11308 ^ i13;
                                                            i16 = i12;
                                                            break;
                                                        case -1800046286:
                                                        case 962184407:
                                                            i22 = 42024;
                                                            iM11308 = (C19806.m45029("ۧۢ") + i14) * 61;
                                                            i12 = ((iM11308 ^ i15) * 17665) ^ 901680506;
                                                            i13 = 418368596;
                                                            i17 = iM11308 ^ i13;
                                                            i16 = i12;
                                                            break;
                                                        case -1743275168:
                                                        case 1507972761:
                                                            if (C2871.f10837 >= 0) {
                                                                iM11308 = ThreadFactoryC3888.m11306("۬ۡ") ^ i14;
                                                                i12 = ((iM11308 ^ i15) * (-22143)) ^ 475545605;
                                                                i13 = -58239479;
                                                            } else {
                                                                iM11308 = (C19806.m45029("ᩴۧ") + i15) * (-53);
                                                                i12 = ((iM11308 ^ i14) * 17183) ^ (-1709050251);
                                                                i13 = 707060305;
                                                            }
                                                            i17 = iM11308 ^ i13;
                                                            i16 = i12;
                                                            break;
                                                        case -1657197741:
                                                        case -336707130:
                                                            C19328.m44318(textInputLayout, RunnableC3388.m10065(c1313, 2125505254 ^ iM11309));
                                                            break;
                                                        case -1427897992:
                                                        case 965564679:
                                                            C0216.m1591();
                                                            C1377.m4833();
                                                            iM11308 = C19806.m45029("۠ۜ") ^ i14;
                                                            i12 = ((iM11308 ^ i15) * (-24427)) ^ 1651690421;
                                                            i13 = -902450464;
                                                            i17 = iM11308 ^ i13;
                                                            i16 = i12;
                                                            break;
                                                        case -1237074980:
                                                        case -587270042:
                                                            C1668.m5582(2130406915 ^ iM450212);
                                                            C1189.m4367(dialogInterfaceC19356);
                                                            break;
                                                        case -1165078943:
                                                        case -517510151:
                                                            strM10790 = C3660.m10790(sArr5, i23, 8, i22);
                                                            if (C1148.f5161 <= 0) {
                                                                iM11308 = ThreadFactoryC3888.m11306("᩷ܺ") ^ i15;
                                                                i12 = ((iM11308 ^ i14) * 11033) ^ (-2060663827);
                                                                i13 = -1211961179;
                                                            } else {
                                                                iM11308 = (C19806.m45029("֡ۡ") ^ i14) * 75;
                                                                i12 = ((iM11308 ^ i15) * 30121) ^ 1947365637;
                                                                i13 = 961722297;
                                                            }
                                                            i17 = iM11308 ^ i13;
                                                            i16 = i12;
                                                            break;
                                                        case -1067823859:
                                                        case -963322580:
                                                            if (C0216.f1393 != 0) {
                                                                iM11308 = (C19806.m45029("ᩴۧ") + i15) * (-53);
                                                                i12 = ((iM11308 ^ i14) * 17183) ^ (-1709050251);
                                                                i13 = 707060305;
                                                            } else {
                                                                iM11308 = (i14 - C19806.m45029("ۡᩴ")) * (-31);
                                                                i12 = ((iM11308 ^ i15) * (-10073)) ^ (-345456081);
                                                                i13 = -739342680;
                                                            }
                                                            i17 = iM11308 ^ i13;
                                                            i16 = i12;
                                                            break;
                                                        case -903747939:
                                                        case 870991489:
                                                            iM11309 = ThreadFactoryC3888.m11306(C1066.m4040(sArr6, i18, i19, i22));
                                                            if (C3577.f13150 >= 0) {
                                                                iM11308 = (C19806.m45029("ᩴۧ") + i15) * (-53);
                                                                i12 = ((iM11308 ^ i14) * 17183) ^ (-1709050251);
                                                                i13 = 707060305;
                                                            } else {
                                                                iM11308 = (i14 - ThreadFactoryC3888.m11306("ܽᩳ")) * (-79);
                                                                i12 = ((iM11308 ^ i15) * 22215) ^ (-895693898);
                                                                i13 = -894633059;
                                                            }
                                                            i17 = iM11308 ^ i13;
                                                            i16 = i12;
                                                            break;
                                                        case -773553640:
                                                        case 276841341:
                                                            sArr6 = f12692;
                                                            i18 = 9;
                                                            i19 = 3;
                                                            if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                                                                iM11308 = C19806.m45029("۠ۜ") ^ i14;
                                                                i12 = ((iM11308 ^ i15) * (-24427)) ^ 1651690421;
                                                                i13 = -902450464;
                                                            } else {
                                                                iM11308 = ThreadFactoryC3888.m11306("۫᩸") ^ i15;
                                                                i12 = ((iM11308 ^ i14) * (-17695)) ^ 1065080510;
                                                                i13 = 1148268647;
                                                            }
                                                            i17 = iM11308 ^ i13;
                                                            i16 = i12;
                                                            break;
                                                        case -569090564:
                                                        case 1215542946:
                                                            i22 = 1471;
                                                            iM11308 = (C19806.m45029("ۧۢ") + i14) * 61;
                                                            i12 = ((iM11308 ^ i15) * 17665) ^ 901680506;
                                                            i13 = 418368596;
                                                            i17 = iM11308 ^ i13;
                                                            i16 = i12;
                                                            break;
                                                        case -253967408:
                                                        case 1882955056:
                                                            sArr4 = f12692;
                                                            if (C2788.f10625 >= 0) {
                                                                iM11308 = ThreadFactoryC3888.m11306("᩷ܺ") ^ i15;
                                                                i12 = ((iM11308 ^ i14) * 11033) ^ (-2060663827);
                                                                i13 = -1211961179;
                                                            } else {
                                                                iM11308 = ThreadFactoryC3888.m11306("ܰ᩷") ^ i14;
                                                                i12 = ((iM11308 ^ i15) * (-21885)) ^ (-1759314980);
                                                                i13 = -551310856;
                                                            }
                                                            i17 = iM11308 ^ i13;
                                                            i16 = i12;
                                                            break;
                                                        case 94889255:
                                                        case 1013053526:
                                                            s4 = sArr4[c];
                                                            i24 = s4 * 2;
                                                            if (C0671.f2816 != 0) {
                                                                iM11308 = ThreadFactoryC3888.m11306("᩷ܺ") ^ i15;
                                                                i12 = ((iM11308 ^ i14) * 11033) ^ (-2060663827);
                                                                i13 = -1211961179;
                                                            } else {
                                                                iM11308 = (C19806.m45029("ۖۡ") + i15) * 99;
                                                                i12 = ((iM11308 ^ i14) * (-30021)) ^ 460995234;
                                                                i13 = 1823303104;
                                                            }
                                                            i17 = iM11308 ^ i13;
                                                            i16 = i12;
                                                            break;
                                                        case 768874242:
                                                        case 1151752450:
                                                            i25 = i24 + 1;
                                                            s5 = 1;
                                                            if (C1189.f5284 <= 0) {
                                                                iM11308 = (i14 - C19806.m45029("ۡᩴ")) * (-31);
                                                                i12 = ((iM11308 ^ i15) * (-10073)) ^ (-345456081);
                                                                i13 = -739342680;
                                                            } else {
                                                                iM11308 = C19806.m45029("ۖ֨") ^ i14;
                                                                i12 = ((iM11308 ^ i15) * (-28419)) ^ 496735992;
                                                                i13 = 1061779688;
                                                            }
                                                            i17 = iM11308 ^ i13;
                                                            i16 = i12;
                                                            break;
                                                        case 920438710:
                                                        case 2028470007:
                                                            sArr7 = f12692;
                                                            i21 = 12;
                                                            i20 = 3;
                                                            if (C1977.m6356()) {
                                                                iM11308 = (C19806.m45029("ᩴۧ") + i15) * (-53);
                                                                i12 = ((iM11308 ^ i14) * 17183) ^ (-1709050251);
                                                                i13 = 707060305;
                                                            } else {
                                                                iM11308 = C19806.m45029("ۚۨ") ^ i15;
                                                                i12 = ((iM11308 ^ i14) * 30719) ^ (-1479107061);
                                                                i13 = 219899672;
                                                            }
                                                            i17 = iM11308 ^ i13;
                                                            i16 = i12;
                                                            break;
                                                        case 1606092009:
                                                        case 2055223901:
                                                            iM450212 = C19806.m45029(C10634.m26821(sArr7, i21, i20, i22));
                                                            if (C0817.f3443) {
                                                                iM11308 = C19806.m45029("ۛ᩶") ^ i15;
                                                                i12 = ((iM11308 ^ i14) * 10273) ^ 775299790;
                                                                i13 = -1042754772;
                                                            } else {
                                                                iM11308 = (i14 - C19806.m45029("ۡᩴ")) * (-31);
                                                                i12 = ((iM11308 ^ i15) * (-10073)) ^ (-345456081);
                                                                i13 = -739342680;
                                                            }
                                                            i17 = iM11308 ^ i13;
                                                            i16 = i12;
                                                            break;
                                                        default:
                                                            int i28 = s4 + s5;
                                                            if ((i28 * i28) - i25 >= 0) {
                                                                iM11308 = (i14 - ThreadFactoryC3888.m11306("᩷ۗ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                                i12 = ((iM11308 ^ i15) * 14711) ^ (-1272232185);
                                                                i13 = -1678341114;
                                                            } else {
                                                                iM11308 = (C19806.m45029("ۗۤ") ^ i15) * (-19);
                                                                i12 = ((iM11308 ^ i14) * 21735) ^ (-1367329085);
                                                                i13 = 639753785;
                                                            }
                                                            i17 = iM11308 ^ i13;
                                                            i16 = i12;
                                                            break;
                                                    }
                                                    return;
                                                }
                                            }
                                        }));
                                    }
                                    iM11306 = C19806.m45029("ۛܿ") ^ i6;
                                    i8 = 1902978873 ^ ((iM11306 ^ i7) * 22669);
                                    i = 1881662784;
                                    i10 = i ^ iM11306;
                                    i5 = i5;
                                    sArr = sArr;
                                }
                            } else {
                                sArr = sArr;
                                iM11306 = ThreadFactoryC3888.m11306("᩸ۘ") ^ i6;
                                i8 = 721600661 ^ ((iM11306 ^ i7) * (-11999));
                                i = 738635501;
                                i10 = i ^ iM11306;
                                i5 = i5;
                                sArr = sArr;
                            }
                        } else {
                            iM45029 = C19806.m45029("ۤܺ") ^ i7;
                            i8 = ((iM45029 ^ i6) * (-9523)) ^ (-838583009);
                            i9 = 2101412225;
                        }
                        break;
                    case 1464447993:
                    case 1818745128:
                        sArr = sArr;
                        i5 = i5;
                        strM3407 = C0817.m3407(C3577.m10576(editText));
                        if (C1977.m6360(strM3407) == 6) {
                            iM11306 = (ThreadFactoryC3888.m11306("ۗ᩺") + i6) * 79;
                            i8 = (-1365265901) ^ ((iM11306 ^ i7) * 28273);
                            i = -284813458;
                        } else {
                            iM11306 = (i7 - C19806.m45029("ᩳۡ")) * 53;
                            i8 = (-2034674442) ^ ((iM11306 ^ i6) * (-29291));
                            i = 713170483;
                        }
                        i10 = i ^ iM11306;
                        i5 = i5;
                        sArr = sArr;
                        break;
                    default:
                        C0216.m1591();
                        if (C0629.f2722 <= 0) {
                            sArr = sArr;
                            i5 = i5;
                            iM11306 = ThreadFactoryC3888.m11306("᩸ۘ") ^ i6;
                            i8 = 721600661 ^ ((iM11306 ^ i7) * (-11999));
                            i = 738635501;
                            i10 = i ^ iM11306;
                            i5 = i5;
                            sArr = sArr;
                        }
                        sArr = sArr;
                        i5 = i5;
                        iM11306 = C19806.m45029("ۛܿ") ^ i6;
                        i8 = 1902978873 ^ ((iM11306 ^ i7) * 22669);
                        i = 1881662784;
                        i10 = i ^ iM11306;
                        i5 = i5;
                        sArr = sArr;
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0115 A[PHI: r5
      0x0115: PHI (r5v3 char) = (r5v2 char), (r5v2 char), (r5v5 char) binds: [B:15:0x007a, B:12:0x0071, B:6:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0297 A[PHI: r3 r4 r18 r19 r20 r25
      0x0297: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v3 java.lang.String), (r3v2 java.lang.String) binds: [B:69:0x0295, B:65:0x0276, B:36:0x014c, B:9:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0297: PHI (r4v4 java.lang.Object[]) = (r4v2 java.lang.Object[]), (r4v2 java.lang.Object[]), (r4v3 java.lang.Object[]), (r4v2 java.lang.Object[]) binds: [B:69:0x0295, B:65:0x0276, B:36:0x014c, B:9:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0297: PHI (r18v4 short) = (r18v3 short), (r18v2 short), (r18v2 short), (r18v2 short) binds: [B:69:0x0295, B:65:0x0276, B:36:0x014c, B:9:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0297: PHI (r19v4 short) = (r19v3 short), (r19v2 short), (r19v2 short), (r19v2 short) binds: [B:69:0x0295, B:65:0x0276, B:36:0x014c, B:9:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0297: PHI (r20v4 int) = (r20v2 int), (r20v3 int), (r20v2 int), (r20v2 int) binds: [B:69:0x0295, B:65:0x0276, B:36:0x014c, B:9:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0297: PHI (r25v5 int) = (r25v3 int), (r25v4 int), (r25v3 int), (r25v3 int) binds: [B:69:0x0295, B:65:0x0276, B:36:0x014c, B:9:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02cc A[PHI: r7 r17
      0x02cc: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:73:0x02ca, B:26:0x00c1, B:12:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x02cc: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:73:0x02ca, B:26:0x00c1, B:12:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x02fc A[PHI: r8 r9 r10 r14 r16
      0x02fc: PHI (r8v4 short[]) = (r8v2 short[]), (r8v2 short[]), (r8v3 short[]), (r8v2 short[]), (r8v2 short[]), (r8v2 short[]) binds: [B:77:0x02fa, B:61:0x0254, B:46:0x01ae, B:17:0x007e, B:15:0x007a, B:9:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x02fc: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:77:0x02fa, B:61:0x0254, B:46:0x01ae, B:17:0x007e, B:15:0x007a, B:9:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x02fc: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:77:0x02fa, B:61:0x0254, B:46:0x01ae, B:17:0x007e, B:15:0x007a, B:9:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x02fc: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:77:0x02fa, B:61:0x0254, B:46:0x01ae, B:17:0x007e, B:15:0x007a, B:9:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x02fc: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:77:0x02fa, B:61:0x0254, B:46:0x01ae, B:17:0x007e, B:15:0x007a, B:9:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m52036() {
        int iM45029;
        int i;
        int i2;
        String strM3021;
        int i3 = AbstractC0464.f2088;
        int i4 = C2871.f10837;
        int iM11306 = ThreadFactoryC3888.m11306("᩹ܶ") ^ i3;
        int i5 = ((iM11306 ^ i4) * 11717) ^ 849674960;
        Object[] objArr = null;
        String str = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM11306 ^ (-533112722);
        char c = 0;
        int iM450210 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        char c2 = 0;
        short s = 0;
        short s2 = 0;
        int i12 = 0;
        int i13 = -1030338861;
        int i14 = 0;
        String strM5689 = null;
        TextView textView = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-12189)) >> 31));
            switch (i13) {
                case -2090326406:
                case -1088395264:
                    textView = this.f76466;
                    if (textView != null) {
                        iM45029 = (C19806.m45029("ܶ֡") ^ i3) * 95;
                        i = ((iM45029 ^ i4) * 5043) ^ (-43137471);
                        i2 = -806584007;
                    } else {
                        iM45029 = (C19806.m45029("ܶۖ") + i4) * (-109);
                        i = ((iM45029 ^ i3) * (-31549)) ^ (-810565570);
                        i2 = -1754354520;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1933980316:
                case 261641829:
                    if (C0050.m946() > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸۟") ^ i3;
                        i = ((iM45029 ^ i4) * (-17913)) ^ (-458465325);
                        i2 = -58834659;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩺᩹")) * 75;
                        i = ((iM45029 ^ i4) * (-17701)) ^ (-2032453253);
                        i2 = -1106237264;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1905103271:
                case -1055642020:
                    C1398.m4902(C3743.m10964(sArr2, i7, i8, i11));
                    throw null;
                case -1884921159:
                case 1384257571:
                    C1461.m5080();
                    if (C1977.f7413 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸۟") ^ i3;
                        i = ((iM45029 ^ i4) * (-17913)) ^ (-458465325);
                        i2 = -58834659;
                    } else {
                        iM45029 = (C19806.m45029("۟۠") + i4) * 75;
                        i = ((iM45029 ^ i3) * 13935) ^ 1491493146;
                        i2 = -1945725218;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1877706614:
                case -1202137964:
                    sArr = f76464;
                    if (C2642.f10294 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸۟") ^ i3;
                        i = ((iM45029 ^ i4) * (-17913)) ^ (-458465325);
                        i2 = -58834659;
                    } else {
                        iM45029 = (i4 - C19806.m45029("֫ܺ")) * 29;
                        i = ((iM45029 ^ i3) * 8641) ^ 1518317908;
                        i2 = 913650575;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1865279853:
                case -527216847:
                    C3577.m10565();
                    iM45029 = ThreadFactoryC3888.m11306("᩸۟") ^ i3;
                    i = ((iM45029 ^ i4) * (-17913)) ^ (-458465325);
                    i2 = -58834659;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1860134276:
                case 1936216902:
                    c2 = 0;
                    if (C1937.f7317 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۧ֨") ^ i4;
                        i = ((iM45029 ^ i3) * (-21157)) ^ 1041364244;
                        i2 = 1029090196;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֫ۘ") ^ i3;
                        i = ((iM45029 ^ i4) * 4289) ^ 586918896;
                        i2 = 757544637;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1541419683:
                case -667149030:
                    C19806.m45024();
                    C1398.m4895();
                    return;
                case -1516903082:
                case -537945596:
                    strM5689 = C1709.m5689();
                    objArr = new Object[1];
                    if (C2704.f10408) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤ֡") ^ i3) * (-29);
                        i = ((iM45029 ^ i4) * 16321) ^ 1551518675;
                        i2 = 102990611;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩺᩹")) * 75;
                        i = ((iM45029 ^ i4) * (-17701)) ^ (-2032453253);
                        i2 = -1106237264;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1360243903:
                case 1967470359:
                    s = sArr[c2];
                    s2 = 2632;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = (i3 - C19806.m45029("᩺᩹")) * 75;
                        i = ((iM45029 ^ i4) * (-17701)) ^ (-2032453253);
                        i2 = -1106237264;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨ۬") ^ i3) * (-71);
                        i = ((iM45029 ^ i4) * (-7799)) ^ (-2097055719);
                        i2 = 143575958;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1344777661:
                case -745452701:
                    MenuItemOnMenuItemClickListenerC3244.m9704(textView, str);
                    return;
                case -1330259305:
                case -85783419:
                    iM450210 = C19806.m45029(C2332.m7082(sArr3, i9, 3, i11));
                    if (C0050.m946() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۧ֨") ^ i4;
                        i = ((iM45029 ^ i3) * (-21157)) ^ 1041364244;
                        i2 = 1029090196;
                    } else {
                        iM45029 = (C19806.m45029("᩺۟") ^ i4) * 45;
                        i = ((iM45029 ^ i3) * (-28789)) ^ (-1960328094);
                        i2 = 970408805;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1144922097:
                case 1575180360:
                    if (C2642.f10294 > 0) {
                        iM45029 = (C19806.m45029("۟۠") + i4) * 75;
                        i = ((iM45029 ^ i3) * 13935) ^ 1491493146;
                        i2 = -1945725218;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۧ֨") ^ i4;
                        i = ((iM45029 ^ i3) * (-21157)) ^ 1041364244;
                        i2 = 1029090196;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1005442060:
                case 1298759504:
                    strM3021 = C0671.m3021(this, 2102859504 ^ iM450210, objArr);
                    str = strM3021;
                    iM45029 = (ThreadFactoryC3888.m11306("֫ۤ") + i4) * (-65);
                    i = ((iM45029 ^ i3) * (-397)) ^ (-863743148);
                    i2 = 1057275864;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -746730330:
                case 546266912:
                    i11 = 19151;
                    iM45029 = (C19806.m45029("ۤ᩺") + i4) * (-119);
                    i = ((iM45029 ^ i3) * (-5493)) ^ (-534146147);
                    i2 = 1386209480;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -686083604:
                case 1188925350:
                    if ((i14 + i10) - i12 < 0) {
                        iM45029 = C19806.m45029("ܺۢ") ^ i3;
                        i = ((iM45029 ^ i4) * (-18757)) ^ 1844640626;
                        i2 = 432608514;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡۖ") ^ i3;
                        i = ((iM45029 ^ i4) * (-26737)) ^ 1147044;
                        i2 = 2028811282;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -504840005:
                case 1949981661:
                    i12 = s * s2;
                    i14 = s * s;
                    if (C2788.f10625 >= 0) {
                        iM45029 = (i3 - C19806.m45029("᩺᩹")) * 75;
                        i = ((iM45029 ^ i4) * (-17701)) ^ (-2032453253);
                        i2 = -1106237264;
                    } else {
                        iM45029 = C19806.m45029("᩷ۖ") ^ i4;
                        i = ((iM45029 ^ i3) * 30991) ^ (-1786747762);
                        i2 = -290475769;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -78200461:
                case 572690146:
                    objArr[c] = strM5689;
                    sArr3 = f76464;
                    i9 = 10;
                    if (C19806.f63586) {
                        iM45029 = ThreadFactoryC3888.m11306("᩵ۘ") ^ i4;
                        i = ((iM45029 ^ i3) * 6269) ^ (-1394892023);
                        i2 = 1045095659;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("۟᩸")) * (-71);
                        i = ((iM45029 ^ i4) * 1461) ^ 1081331528;
                        i2 = -2046651845;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 59831117:
                case 430375012:
                    if (C1709.m5683()) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ܳ") + i3) * (-51);
                        i = ((iM45029 ^ i4) * (-22257)) ^ 1612307385;
                        i2 = 499427183;
                    } else {
                        iM45029 = (C19806.m45029("᩷ܺ") + i4) * (-29);
                        i = ((iM45029 ^ i3) * (-8455)) ^ 369316456;
                        i2 = 1704967849;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1027374158:
                case 1101743309:
                    i11 = 19673;
                    iM45029 = (C19806.m45029("ۤ᩺") + i4) * (-119);
                    i = ((iM45029 ^ i3) * (-5493)) ^ (-534146147);
                    i2 = 1386209480;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1270366932:
                case 2121544098:
                    strM3021 = C1709.m5689();
                    str = strM3021;
                    iM45029 = (ThreadFactoryC3888.m11306("֫ۤ") + i4) * (-65);
                    i = ((iM45029 ^ i3) * (-397)) ^ (-863743148);
                    i2 = 1057275864;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1454492475:
                case 1476964140:
                    sArr2 = f76464;
                    i7 = 1;
                    i8 = 9;
                    if (C3577.f13150 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸۟") ^ i3;
                        i = ((iM45029 ^ i4) * (-17913)) ^ (-458465325);
                        i2 = -58834659;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿۡ") ^ i3;
                        i = ((iM45029 ^ i4) * 12861) ^ 983795136;
                        i2 = -1720287495;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1537262230:
                case 1549572276:
                    i10 = 1731856;
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸۟") ^ i3;
                        i = ((iM45029 ^ i4) * (-17913)) ^ (-458465325);
                        i2 = -58834659;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ܰۢ")) * q.h;
                        i = ((iM45029 ^ i3) * 18719) ^ (-837310463);
                        i2 = -1982605410;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    c = 0;
                    if (C0526.f2219) {
                        iM45029 = (C19806.m45029("۟۠") + i4) * 75;
                        i = ((iM45029 ^ i3) * 13935) ^ 1491493146;
                        i2 = -1945725218;
                    } else {
                        iM45029 = C19806.m45029("ۧۡ") ^ i4;
                        i = ((iM45029 ^ i3) * 16219) ^ (-1266174534);
                        i2 = 1235619621;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0668 A[PHI: r14 r20 r21 r22 r26
      0x0668: PHI (r14v11 short[]) = (r14v4 short[]), (r14v9 short[]), (r14v13 short[]) binds: [B:9:0x006e, B:104:0x0666, B:96:0x05b6] A[DONT_GENERATE, DONT_INLINE]
      0x0668: PHI (r20v3 int) = (r20v2 int), (r20v2 int), (r20v5 int) binds: [B:9:0x006e, B:104:0x0666, B:96:0x05b6] A[DONT_GENERATE, DONT_INLINE]
      0x0668: PHI (r21v3 int) = (r21v2 int), (r21v2 int), (r21v5 int) binds: [B:9:0x006e, B:104:0x0666, B:96:0x05b6] A[DONT_GENERATE, DONT_INLINE]
      0x0668: PHI (r22v10 int) = (r22v3 int), (r22v8 int), (r22v13 int) binds: [B:9:0x006e, B:104:0x0666, B:96:0x05b6] A[DONT_GENERATE, DONT_INLINE]
      0x0668: PHI (r26v9 android.widget.TextView) = (r26v2 android.widget.TextView), (r26v7 android.widget.TextView), (r26v12 android.widget.TextView) binds: [B:9:0x006e, B:104:0x0666, B:96:0x05b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x0555 A[PHI: r9 r22 r26
      0x0555: PHI (r9v5 android.view.View) = (r9v2 android.view.View), (r9v4 android.view.View), (r9v2 android.view.View) binds: [B:90:0x0553, B:41:0x01dd, B:22:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x0555: PHI (r22v17 short[]) = (r22v14 short[]), (r22v2 short[]), (r22v2 short[]) binds: [B:90:0x0553, B:41:0x01dd, B:22:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x0555: PHI (r26v43 android.widget.TextView) = (r26v13 android.widget.TextView), (r26v36 android.widget.TextView), (r26v44 android.widget.TextView) binds: [B:90:0x0553, B:41:0x01dd, B:22:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        int iM45029;
        int i;
        int i2;
        int iM11306;
        int i3;
        int i4;
        short[] sArr;
        int iM11307;
        int i5;
        int iM11308;
        int i6;
        int i7;
        int i8;
        int i9 = AbstractC0464.f2088;
        int i10 = C3660.f13403;
        int iM450210 = C19806.m45029("ۛ᩵") ^ i9;
        int i11 = ((iM450210 ^ i10) * (-14969)) ^ 577231703;
        TextView textView = null;
        String strM6105 = null;
        String str = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i12 = iM450210 ^ 735647465;
        int i13 = 0;
        int iM450211 = 0;
        int i14 = 0;
        int i15 = 0;
        boolean z = false;
        int i16 = 0;
        int i17 = 0;
        int iM450212 = 0;
        int i18 = 0;
        int iM11309 = 0;
        int i19 = 0;
        int i20 = 717602403;
        int iM450213 = 0;
        View viewM7083 = null;
        String strM10056 = null;
        TextView textView2 = null;
        int iM113010 = 0;
        while (true) {
            i20 = i12 ^ (i11 & (((i20 ^ i10) * 28593) >> 31));
            switch (i20) {
                case -2127024334:
                case 591366918:
                    textView2 = textView2;
                    sArr2 = sArr2;
                    i13 = i13;
                    super.onCreate(bundle);
                    C2332.m7083(this, C19806.m45029(AbstractC0464.m2308(f76464, 595, 3, i16)) ^ 2100014342);
                    RunnableC0195.m1436(this, ThreadFactoryC3888.m11306(C3743.m10964(f76464, 598, 3, i16)) ^ 2125455995);
                    if (C1460.f5948 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۗ") ^ i9;
                        i = ((iM45029 ^ i10) * (-27489)) ^ 400042232;
                        i2 = 1929512474;
                    } else {
                        iM45029 = (C19806.m45029("᩸᩹") ^ i9) * (-91);
                        i = ((iM45029 ^ i10) * (-6911)) ^ (-167270182);
                        i2 = -235864096;
                    }
                    int i21 = iM45029 ^ i2;
                    textView2 = textView2;
                    i12 = i21;
                    i11 = i;
                    i13 = i13;
                    sArr2 = sArr2;
                    break;
                case -1793125977:
                case -1339999137:
                    C2871.m8646();
                    textView2 = textView2;
                    iM11306 = C19806.m45029("۟ܰ") ^ i10;
                    i3 = ((iM11306 ^ i9) * (-20221)) ^ 531083759;
                    i4 = 1009113965;
                    i8 = iM11306 ^ i4;
                    TextView textView3 = textView2;
                    i12 = i8;
                    i11 = i3;
                    textView2 = textView3;
                    break;
                case -1698532336:
                case -160530971:
                    TextView textView4 = (TextView) RunnableC0195.m1436(this, C19806.m45029(C2332.m7082(sArr3, 650, 3, i16)) ^ 2126723357);
                    View viewM7084 = C2332.m7083(this, ThreadFactoryC3888.m11306(C3660.m10790(f76464, 653, 3, i16)) ^ 2127896082);
                    strM10056 = RunnableC3388.m10056(f76464, 656, 9, i16);
                    C7105.m18988(viewM7084, strM10056);
                    this.f76470 = (TextView) viewM7084;
                    String strM5047 = C1460.m5047(f76464, 665, 3, i16);
                    if (C0671.f2816 != 0) {
                        textView2 = textView4;
                        str = strM5047;
                        iM11308 = ThreadFactoryC3888.m11306("ۤ۫") ^ i10;
                        i6 = ((iM11308 ^ i9) * (-1595)) ^ (-810814408);
                        i7 = -301938329;
                        i12 = iM11308 ^ i7;
                    } else {
                        int iM113011 = ThreadFactoryC3888.m11306("ۙ۫") ^ i9;
                        i6 = ((iM113011 ^ i10) * 14687) ^ 330595571;
                        i12 = iM113011 ^ (-104336177);
                        textView2 = textView4;
                        str = strM5047;
                    }
                    i11 = i6;
                    break;
                case -1651173385:
                case 151812286:
                    C7105.m18993(RunnableC0195.m1436(this, iM113010), this);
                    iM11306 = (i9 - ThreadFactoryC3888.m11306("ۚ֡")) * 51;
                    i3 = ((iM11306 ^ i10) * 25265) ^ 687462780;
                    i4 = 735058014;
                    i8 = iM11306 ^ i4;
                    TextView textView5 = textView2;
                    i12 = i8;
                    i11 = i3;
                    textView2 = textView5;
                    break;
                case -1607289864:
                case 132267959:
                    i16 = 5156;
                    iM45029 = (i10 - C19806.m45029("ᩴ᩻")) * (-113);
                    i = ((iM45029 ^ i9) * (-1807)) ^ (-1136185145);
                    i2 = -1935616970;
                    int i22 = iM45029 ^ i2;
                    textView2 = textView2;
                    i12 = i22;
                    i11 = i;
                    i13 = i13;
                    sArr2 = sArr2;
                    break;
                case -1586962055:
                case 1692153246:
                    textView2 = textView2;
                    sArr2 = sArr2;
                    i13 = i13;
                    C6938 c6938 = (C6938) C2332.m7083(this, C19806.m45029(C3722.m10901(f76464, 601, 3, i16)) ^ 2118389295);
                    this.f41645 = c6938;
                    C0278.m1782(this, c6938);
                    C7105.m18992(this);
                    C0526.m2430(this.f41645, new View.OnClickListener() { // from class: l.ۤ᩵᩺
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i23 = 782835363;
                            int i24 = C1937.f7317;
                            int i25 = C1398.f5802;
                            int iM450214 = C19806.m45029("᩵۠") ^ i24;
                            int i26 = ((iM450214 ^ i25) * 4235) ^ (-1025255341);
                            int i27 = -1958179826;
                            while (true) {
                                i23 = ((((i23 ^ i25) * (-31239)) >> 31) & i26) ^ (iM450214 ^ i27);
                                switch (i23) {
                                    case -2138424193:
                                    case 1790764947:
                                        int i28 = ViewOnClickListenerC23604.f76463;
                                        if (AbstractC0464.f2088 <= 0) {
                                            iM450214 = ThreadFactoryC3888.m11306("ۗܶ") ^ i25;
                                            i26 = ((iM450214 ^ i24) * 15061) ^ 567036528;
                                            i27 = -1009876408;
                                        } else {
                                            iM450214 = C19806.m45029("֨᩹") ^ i24;
                                            i26 = ((iM450214 ^ i25) * 4685) ^ 1856786749;
                                            i27 = -1497256477;
                                        }
                                        break;
                                    case -2057735572:
                                    case -993387705:
                                        if (C1461.f5957 <= 0) {
                                            iM450214 = (i25 - C19806.m45029("֨᩻")) * (-123);
                                            i26 = ((iM450214 ^ i24) * (-793)) ^ 585932032;
                                            i27 = -2004043438;
                                        } else {
                                            iM450214 = ThreadFactoryC3888.m11306("᩵ᩳ") ^ i24;
                                            i26 = ((iM450214 ^ i25) * 1095) ^ 1201908044;
                                            i27 = -2010131045;
                                        }
                                        break;
                                    case -2056424549:
                                    case -894741501:
                                        C2642.m8171();
                                        iM450214 = ThreadFactoryC3888.m11306("᩶᩻") ^ i25;
                                        i26 = ((iM450214 ^ i24) * 25947) ^ (-1696357581);
                                        i27 = 561603187;
                                        break;
                                    case -2012216371:
                                    case 1505143846:
                                        if (C1148.m4232() <= 0) {
                                            iM450214 = ThreadFactoryC3888.m11306("᩶᩻") ^ i25;
                                            i26 = ((iM450214 ^ i24) * 25947) ^ (-1696357581);
                                            i27 = 561603187;
                                        } else {
                                            iM450214 = (C19806.m45029("۠֡") + i25) * 81;
                                            i26 = ((iM450214 ^ i24) * 11893) ^ (-11763036);
                                            i27 = 614612594;
                                        }
                                        break;
                                    case -1427273447:
                                    case 687581593:
                                        if (C19806.f63586) {
                                            iM450214 = ThreadFactoryC3888.m11306("᩶ۙ") ^ i24;
                                            i26 = ((iM450214 ^ i25) * (-15437)) ^ 423776089;
                                            i27 = 308581837;
                                        } else {
                                            iM450214 = C19806.m45029("ۙۛ") ^ i24;
                                            i26 = ((iM450214 ^ i25) * (-4637)) ^ 465533981;
                                            i27 = -1439407726;
                                        }
                                        break;
                                    case -1346231202:
                                    case 1364794564:
                                        if (C1461.f5957 <= 0) {
                                            iM450214 = ThreadFactoryC3888.m11306("᩶᩻") ^ i25;
                                            i26 = ((iM450214 ^ i24) * 25947) ^ (-1696357581);
                                            i27 = 561603187;
                                        } else {
                                            iM450214 = (i24 - ThreadFactoryC3888.m11306("֡ۚ")) * (-105);
                                            i26 = ((iM450214 ^ i25) * (-21243)) ^ 192247474;
                                            i27 = 1812678596;
                                        }
                                        break;
                                    case -977486208:
                                    case -241127975:
                                        if (!C3743.f13569) {
                                            iM450214 = ThreadFactoryC3888.m11306("᩶ۙ") ^ i24;
                                            i26 = ((iM450214 ^ i25) * (-15437)) ^ 423776089;
                                            i27 = 308581837;
                                        } else {
                                            iM450214 = ThreadFactoryC3888.m11306("᩶᩻") ^ i25;
                                            i26 = ((iM450214 ^ i24) * 25947) ^ (-1696357581);
                                            i27 = 561603187;
                                        }
                                        break;
                                    case -744790199:
                                    case 1508277840:
                                        if (C2788.f10625 >= 0) {
                                            iM450214 = ThreadFactoryC3888.m11306("ۗܶ") ^ i25;
                                            i26 = ((iM450214 ^ i24) * 15061) ^ 567036528;
                                            i27 = -1009876408;
                                        } else {
                                            iM450214 = (i24 - C19806.m45029("ᩴۨ")) * (-11);
                                            i26 = ((iM450214 ^ i25) * 20743) ^ 286593232;
                                            i27 = -135146156;
                                        }
                                        break;
                                    case -429992174:
                                    case 1626849896:
                                        if (ThreadFactoryC3888.m11300() <= 0) {
                                            iM450214 = C19806.m45029("ᩴ᩵") ^ i24;
                                            i26 = ((iM450214 ^ i25) * 1859) ^ 1562510059;
                                            i27 = 1859274871;
                                        } else {
                                            iM450214 = C19806.m45029("᩷᩹") ^ i25;
                                            i26 = ((iM450214 ^ i24) * 10263) ^ 1811154215;
                                            i27 = -124969898;
                                        }
                                        break;
                                    case -388273014:
                                    case 1936918625:
                                        C2642.m8171();
                                        if (C1398.f5802 > 0) {
                                            iM450214 = (i25 - C19806.m45029("֨᩻")) * (-123);
                                            i26 = ((iM450214 ^ i24) * (-793)) ^ 585932032;
                                            i27 = -2004043438;
                                        } else {
                                            iM450214 = ThreadFactoryC3888.m11306("᩶ۙ") ^ i24;
                                            i26 = ((iM450214 ^ i25) * (-15437)) ^ 423776089;
                                            i27 = 308581837;
                                        }
                                        break;
                                    case -295624369:
                                    case 603287560:
                                        if (C2704.f10408) {
                                            iM450214 = (i25 - ThreadFactoryC3888.m11306("᩹᩻")) * 25;
                                            i26 = ((iM450214 ^ i24) * 17535) ^ 1480596254;
                                            i27 = -1271548132;
                                        } else {
                                            iM450214 = ThreadFactoryC3888.m11306("ۗܶ") ^ i25;
                                            i26 = ((iM450214 ^ i24) * 15061) ^ 567036528;
                                            i27 = -1009876408;
                                        }
                                        break;
                                    case -148683789:
                                    case -103031933:
                                        RunnableC0195.m1431();
                                        if (C0050.m946() <= 0) {
                                            iM450214 = C19806.m45029("ᩴ᩵") ^ i24;
                                            i26 = ((iM450214 ^ i25) * 1859) ^ 1562510059;
                                            i27 = 1859274871;
                                        } else {
                                            iM450214 = ThreadFactoryC3888.m11306("᩶᩻") ^ i25;
                                            i26 = ((iM450214 ^ i24) * 25947) ^ (-1696357581);
                                            i27 = 561603187;
                                        }
                                        break;
                                    case -42624273:
                                    case 1300042079:
                                        C0278.m1783(this.f35996);
                                        break;
                                    case 76946255:
                                    case 175053131:
                                        C1977.m6356();
                                        C2704.m8255();
                                        break;
                                    case 860969670:
                                    case 1670442600:
                                        if (C3722.f13525 <= 0) {
                                            iM450214 = C19806.m45029("ᩴ᩵") ^ i24;
                                            i26 = ((iM450214 ^ i25) * 1859) ^ 1562510059;
                                            i27 = 1859274871;
                                        } else {
                                            iM450214 = (ThreadFactoryC3888.m11306("ۘ᩸") + i25) * (-103);
                                            i26 = ((iM450214 ^ i24) * 22697) ^ (-847238430);
                                            i27 = -78751727;
                                        }
                                        break;
                                    default:
                                        if (C1066.f4915 <= 0) {
                                            iM450214 = ThreadFactoryC3888.m11306("᩶ۙ") ^ i24;
                                            i26 = ((iM450214 ^ i25) * (-15437)) ^ 423776089;
                                            i27 = 308581837;
                                        } else {
                                            iM450214 = (C19806.m45029("ۜᩳ") ^ i25) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                            i26 = ((iM450214 ^ i24) * (-16805)) ^ (-1647743462);
                                            i27 = -1976402941;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    if (C1461.m5073()) {
                        iM45029 = (C19806.m45029("᩻ۢ") + i10) * 91;
                        i = ((iM45029 ^ i9) * (-20871)) ^ 1134232950;
                        i2 = -1033168723;
                    } else {
                        iM45029 = (C19806.m45029("᩵ܶ") ^ i10) * 93;
                        i = ((iM45029 ^ i9) * 31763) ^ 196701405;
                        i2 = 610535732;
                    }
                    int i23 = iM45029 ^ i2;
                    textView2 = textView2;
                    i12 = i23;
                    i11 = i;
                    i13 = i13;
                    sArr2 = sArr2;
                    break;
                case -1582982950:
                case 672742595:
                    textView2 = textView2;
                    View viewM7085 = C2332.m7083(this, C19806.m45029(str) ^ 2118163290);
                    C1937.m6286(viewM7085, strM10056);
                    this.f76466 = (TextView) viewM7085;
                    viewM7083 = C2332.m7083(this, C19806.m45029(C1377.m4832(f76464, 668, 3, i16)) ^ 2101951923);
                    if (RunnableC1564.m5345()) {
                        iM11306 = C19806.m45029("ۡۖ") ^ i9;
                        i3 = ((iM11306 ^ i10) * (-30245)) ^ (-401143213);
                        i4 = -847414635;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩸ۡ") ^ i10;
                        i3 = ((iM11306 ^ i9) * 19173) ^ (-796494053);
                        i4 = -1600701859;
                    }
                    i8 = iM11306 ^ i4;
                    TextView textView6 = textView2;
                    i12 = i8;
                    i11 = i3;
                    textView2 = textView6;
                    break;
                case -1568158739:
                case -757212708:
                    textView2 = textView2;
                    C7105.m18993(RunnableC0195.m1436(this, C19806.m45029(strM6105) ^ 2129706875), this);
                    int iM113012 = 2121659072 ^ ThreadFactoryC3888.m11306(RunnableC3388.m10056(f76464, 631, 3, i16));
                    C7105.m18993(C2332.m7083(this, iM113012), this);
                    if (C1189.m4371(ApplicationC0716.f2992, C3286.m9788(f76464, 634, 4, i16), true)) {
                        i15 = iM113012;
                        iM11306 = C19806.m45029("ۖۧ") ^ i10;
                        i3 = ((iM11306 ^ i9) * (-32521)) ^ (-470984321);
                        i4 = 1013124808;
                        i8 = iM11306 ^ i4;
                        TextView textView7 = textView2;
                        i12 = i8;
                        i11 = i3;
                        textView2 = textView7;
                    } else {
                        int iM113013 = (ThreadFactoryC3888.m11306("ܰۨ") + i9) * 127;
                        textView2 = textView2;
                        i12 = iM113013 ^ 189513170;
                        i11 = ((iM113013 ^ i10) * (-6847)) ^ 1295675694;
                        i15 = iM113012;
                    }
                    break;
                case -1521350593:
                case -769560717:
                    textView2 = textView2;
                    C3722.m10890(C2332.m7083(this, i15), i14);
                    iM11306 = C19806.m45029("ۖۧ") ^ i10;
                    i3 = ((iM11306 ^ i9) * (-32521)) ^ (-470984321);
                    i4 = 1013124808;
                    i8 = iM11306 ^ i4;
                    TextView textView8 = textView2;
                    i12 = i8;
                    i11 = i3;
                    textView2 = textView8;
                    break;
                case -1510896748:
                case 755116538:
                    C3722.m10890(RunnableC0195.m1436(this, iM450211), i14);
                    iM11306 = C19806.m45029("۬ۚ") ^ i9;
                    i3 = ((iM11306 ^ i10) * 331) ^ 1350275700;
                    i4 = 1834563161;
                    i8 = iM11306 ^ i4;
                    TextView textView9 = textView2;
                    i12 = i8;
                    i11 = i3;
                    textView2 = textView9;
                    break;
                case -1416944097:
                case -799525873:
                    C3286.m9798();
                    C0216.m1591();
                    break;
                case -1412565670:
                case 534982278:
                    textView2 = textView2;
                    boolean zM18176 = C6730.m18176();
                    iM113010 = ThreadFactoryC3888.m11306(C19806.m45020(f76464, 638, 3, i16)) ^ 2104199180;
                    if (zM18176) {
                        iM11306 = (i10 - C19806.m45029("ۙۛ")) * q.h;
                        i3 = ((iM11306 ^ i9) * (-1101)) ^ 928366279;
                        i4 = 110577315;
                    } else {
                        iM11306 = (C19806.m45029("ۗᩳ") ^ i10) * (-3);
                        i3 = ((iM11306 ^ i9) * 23459) ^ 888953755;
                        i4 = -137114732;
                    }
                    i8 = iM11306 ^ i4;
                    TextView textView10 = textView2;
                    i12 = i8;
                    i11 = i3;
                    textView2 = textView10;
                    break;
                case -1346422431:
                case 1105745503:
                    m52050(z);
                    textView2 = textView2;
                    iM11306 = C19806.m45029("ۨ۬") ^ i9;
                    i3 = ((iM11306 ^ i10) * 30971) ^ 2103578805;
                    i4 = -907057706;
                    i8 = iM11306 ^ i4;
                    TextView textView11 = textView2;
                    i12 = i8;
                    i11 = i3;
                    textView2 = textView11;
                    break;
                case -1330703042:
                case 2010261105:
                    textView2 = textView2;
                    C1937.m6291(RunnableC0195.m1436(this, C19806.m45029(C19806.m45020(f76464, 641, 3, i16)) ^ 2126807997), this);
                    iM450212 = C19806.m45029(C3535.m10423(f76464, 644, 3, i16));
                    i18 = 2098524784;
                    if (AbstractC0464.f2088 > 0) {
                        iM11306 = C19806.m45029("֡ܶ") ^ i9;
                        i3 = ((iM11306 ^ i10) * 24459) ^ (-155543224);
                        i4 = 616144762;
                        i8 = iM11306 ^ i4;
                        TextView textView12 = textView2;
                        i12 = i8;
                        i11 = i3;
                        textView2 = textView12;
                    }
                    sArr = sArr2;
                    iM11307 = (ThreadFactoryC3888.m11306("֨ۜ") ^ i10) * 81;
                    i3 = ((iM11307 ^ i9) * (-20531)) ^ 1191524250;
                    i5 = -1441674422;
                    i8 = iM11307 ^ i5;
                    sArr2 = sArr;
                    TextView textView13 = textView2;
                    i12 = i8;
                    i11 = i3;
                    textView2 = textView13;
                    break;
                case -1161812556:
                case 778504739:
                    textView2 = textView2;
                    sArr2 = sArr2;
                    i13 = i13;
                    C7105.m18993(C2332.m7083(this, ThreadFactoryC3888.m11306(C1419.m4969(f76464, 604, 3, i16)) ^ 2127149359), this);
                    iM11309 = ThreadFactoryC3888.m11306(C0797.m3361(f76464, 607, 3, i16));
                    i19 = 2130348124;
                    if (C3577.f13150 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۗ") ^ i9;
                        i = ((iM45029 ^ i10) * (-27489)) ^ 400042232;
                        i2 = 1929512474;
                    } else {
                        iM45029 = (C19806.m45029("ۡܰ") ^ i9) * (-29);
                        i = ((iM45029 ^ i10) * (-18257)) ^ 859472285;
                        i2 = 838687996;
                    }
                    int i24 = iM45029 ^ i2;
                    textView2 = textView2;
                    i12 = i24;
                    i11 = i;
                    i13 = i13;
                    sArr2 = sArr2;
                    break;
                case -952167612:
                case -734798011:
                    i16 = 12651;
                    iM45029 = (i10 - C19806.m45029("ᩴ᩻")) * (-113);
                    i = ((iM45029 ^ i9) * (-1807)) ^ (-1136185145);
                    i2 = -1935616970;
                    int i25 = iM45029 ^ i2;
                    textView2 = textView2;
                    i12 = i25;
                    i11 = i;
                    i13 = i13;
                    sArr2 = sArr2;
                    break;
                case -932852854:
                case 893082640:
                    textView2 = textView2;
                    C1937.m6291(C2332.m7083(this, ThreadFactoryC3888.m11306(C1875.m6105(f76464, 622, 3, i16)) ^ 2117542616), this);
                    C1937.m6291(RunnableC0195.m1436(this, C19806.m45029(C0216.m1588(f76464, 625, 3, i16)) ^ 2100200231), this);
                    strM6105 = C1875.m6105(f76464, 628, 3, i16);
                    if (C1025.f4800 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۬۠") + i9) * 29;
                        i3 = ((iM11306 ^ i10) * (-24437)) ^ 1868658933;
                        i4 = -1581244830;
                        i8 = iM11306 ^ i4;
                        TextView textView14 = textView2;
                        i12 = i8;
                        i11 = i3;
                        textView2 = textView14;
                    } else {
                        textView2 = textView2;
                        iM11308 = ThreadFactoryC3888.m11306("ۤ۫") ^ i10;
                        i6 = ((iM11308 ^ i9) * (-1595)) ^ (-810814408);
                        i7 = -301938329;
                        i12 = iM11308 ^ i7;
                        i11 = i6;
                    }
                    break;
                case -857539141:
                case -543618746:
                    if (!C1709.m5683()) {
                        iM11308 = C19806.m45029("ۚۛ") ^ i10;
                        i6 = ((iM11308 ^ i9) * (-27433)) ^ (-1168228051);
                        i7 = -700011427;
                        i12 = iM11308 ^ i7;
                        i11 = i6;
                    } else {
                        textView2 = textView2;
                        iM11306 = C19806.m45029("ۨ۬") ^ i9;
                        i3 = ((iM11306 ^ i10) * 30971) ^ 2103578805;
                        i4 = -907057706;
                        i8 = iM11306 ^ i4;
                        TextView textView15 = textView2;
                        i12 = i8;
                        i11 = i3;
                        textView2 = textView15;
                    }
                    break;
                case -853244892:
                case 1187908940:
                    textView2 = textView2;
                    C1937.m6291(C2332.m7083(this, iM11309 ^ i19), this);
                    C1937.m6291(RunnableC0195.m1436(this, ThreadFactoryC3888.m11306(C2704.m8240(f76464, 610, 3, i16)) ^ 2101160983), this);
                    sArr2 = f76464;
                    if (C0817.m3399()) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ᩸") ^ i10;
                        i3 = ((iM11306 ^ i9) * (-4529)) ^ 1009197529;
                        i4 = -123579996;
                    } else {
                        iM11306 = C19806.m45029("ۡۖ") ^ i9;
                        i3 = ((iM11306 ^ i10) * (-30245)) ^ (-401143213);
                        i4 = -847414635;
                    }
                    i8 = iM11306 ^ i4;
                    TextView textView16 = textView2;
                    i12 = i8;
                    i11 = i3;
                    textView2 = textView16;
                    break;
                case -819963433:
                case -278308640:
                    C3722.m10890(C2332.m7083(this, iM113010), i14);
                    iM11306 = (i9 - ThreadFactoryC3888.m11306("ۚ֡")) * 51;
                    i3 = ((iM11306 ^ i10) * 25265) ^ 687462780;
                    i4 = 735058014;
                    i8 = iM11306 ^ i4;
                    TextView textView17 = textView2;
                    i12 = i8;
                    i11 = i3;
                    textView2 = textView17;
                    break;
                case -790918892:
                case 1863270018:
                    textView2 = textView2;
                    sArr = sArr2;
                    C1937.m6291(C2332.m7083(this, ThreadFactoryC3888.m11306(C2249.m6918(sArr, 613, 3, i16)) ^ 2098966565), this);
                    iM450213 = C19806.m45029(RunnableC0195.m1429(f76464, 616, 3, i16));
                    i17 = 2099679451;
                    if (C0526.f2219) {
                        iM11307 = (ThreadFactoryC3888.m11306("֨ۜ") ^ i10) * 81;
                        i3 = ((iM11307 ^ i9) * (-20531)) ^ 1191524250;
                        i5 = -1441674422;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("۠ۤ") + i9) * 27;
                        i3 = ((iM11307 ^ i10) * (-11981)) ^ (-270232989);
                        i5 = 456648428;
                    }
                    i8 = iM11307 ^ i5;
                    sArr2 = sArr;
                    TextView textView18 = textView2;
                    i12 = i8;
                    i11 = i3;
                    textView2 = textView18;
                    break;
                case -686023777:
                case 856376092:
                    this.f76465 = textView;
                    View viewM1436 = RunnableC0195.m1436(this, C19806.m45029(RunnableC0195.m1429(f76464, 674, 3, i16)) ^ 2098083208);
                    C7105.m18988(viewM1436, strM10056);
                    this.f76469 = (TextView) viewM1436;
                    C1461.m5083(textView2, C0671.m3006());
                    m52066();
                    C2332.m7081(new C20781(new WeakReference(this)));
                    textView2 = textView2;
                    z = false;
                    if (C1937.m6287(this).getBooleanExtra(C0671.m3009(f76464, 677, 15, i16), false)) {
                        iM11306 = C19806.m45029("ۚܿ") ^ i9;
                        i3 = ((iM11306 ^ i10) * 16609) ^ (-1518640548);
                        i4 = -1803513543;
                    } else {
                        iM11306 = C19806.m45029("ۨ۬") ^ i9;
                        i3 = ((iM11306 ^ i10) * 30971) ^ 2103578805;
                        i4 = -907057706;
                    }
                    i8 = iM11306 ^ i4;
                    TextView textView19 = textView2;
                    i12 = i8;
                    i11 = i3;
                    textView2 = textView19;
                    break;
                case -484206887:
                case 727739357:
                    CallableC1627.m5507();
                    if (C2477.m7593() < 0) {
                        textView2 = textView2;
                        sArr = sArr2;
                        iM11307 = (ThreadFactoryC3888.m11306("֨ۜ") ^ i10) * 81;
                        i3 = ((iM11307 ^ i9) * (-20531)) ^ 1191524250;
                        i5 = -1441674422;
                        i8 = iM11307 ^ i5;
                        sArr2 = sArr;
                        TextView textView110 = textView2;
                        i12 = i8;
                        i11 = i3;
                        textView2 = textView110;
                    } else {
                        iM11308 = (i9 - ThreadFactoryC3888.m11306("ܶ۫")) * 77;
                        i6 = ((iM11308 ^ i10) * 27561) ^ 1905022831;
                        i7 = 1757278864;
                        i12 = iM11308 ^ i7;
                        i11 = i6;
                    }
                    break;
                case -466834636:
                case 2041459875:
                    if (!C0817.f3443) {
                        iM11308 = (i9 - ThreadFactoryC3888.m11306("ܶ۫")) * 77;
                        i6 = ((iM11308 ^ i10) * 27561) ^ 1905022831;
                        i7 = 1757278864;
                        i12 = iM11308 ^ i7;
                        i11 = i6;
                    } else {
                        textView2 = textView2;
                        sArr2 = sArr2;
                        i13 = i13;
                        iM45029 = ThreadFactoryC3888.m11306("ۗۗ") ^ i9;
                        i = ((iM45029 ^ i10) * (-27489)) ^ 400042232;
                        i2 = 1929512474;
                        int i26 = iM45029 ^ i2;
                        textView2 = textView2;
                        i12 = i26;
                        i11 = i;
                        i13 = i13;
                        sArr2 = sArr2;
                    }
                    break;
                case -36292838:
                case 119434180:
                    C2642.m8171();
                    if (C0629.f2722 > 0) {
                        textView2 = textView2;
                        iM11306 = C19806.m45029("ۡۖ") ^ i9;
                        i3 = ((iM11306 ^ i10) * (-30245)) ^ (-401143213);
                        i4 = -847414635;
                        i8 = iM11306 ^ i4;
                        TextView textView111 = textView2;
                        i12 = i8;
                        i11 = i3;
                        textView2 = textView111;
                    }
                    textView2 = textView2;
                    iM11306 = C19806.m45029("۟ܰ") ^ i10;
                    i3 = ((iM11306 ^ i9) * (-20221)) ^ 531083759;
                    i4 = 1009113965;
                    i8 = iM11306 ^ i4;
                    TextView textView112 = textView2;
                    i12 = i8;
                    i11 = i3;
                    textView2 = textView112;
                    break;
                case 135830516:
                case 1032222574:
                    C0278.m1783(this);
                    break;
                case 165624890:
                case 1053650366:
                    RunnableC1895.m6165(RunnableC0195.m1436(this, i13), i14);
                    iM11306 = C19806.m45029("۬ۚ") ^ i9;
                    i3 = ((iM11306 ^ i10) * 331) ^ 1350275700;
                    i4 = 1834563161;
                    i8 = iM11306 ^ i4;
                    TextView textView113 = textView2;
                    i12 = i8;
                    i11 = i3;
                    textView2 = textView113;
                    break;
                case 192403917:
                case 926556279:
                    textView2 = textView2;
                    C1937.m6286(viewM7083, strM10056);
                    this.f76468 = (TextView) viewM7083;
                    View viewM7086 = C2332.m7083(this, ThreadFactoryC3888.m11306(C0050.m940(f76464, 671, 3, i16)) ^ 2130017501);
                    C1937.m6286(viewM7086, strM10056);
                    textView = (TextView) viewM7086;
                    if (C1148.f5161 <= 0) {
                        iM11306 = C19806.m45029("۟ܰ") ^ i10;
                        i3 = ((iM11306 ^ i9) * (-20221)) ^ 531083759;
                        i4 = 1009113965;
                    } else {
                        iM11306 = C19806.m45029("᩹۟") ^ i10;
                        i3 = ((iM11306 ^ i9) * (-11475)) ^ (-504918471);
                        i4 = -1532601895;
                    }
                    i8 = iM11306 ^ i4;
                    TextView textView114 = textView2;
                    i12 = i8;
                    i11 = i3;
                    textView2 = textView114;
                    break;
                case 490853879:
                case 1412179949:
                    C3743.m10966();
                    if (!C7105.m18985()) {
                        iM11308 = (i9 - ThreadFactoryC3888.m11306("ܶ۫")) * 77;
                        i6 = ((iM11308 ^ i10) * 27561) ^ 1905022831;
                        i7 = 1757278864;
                        i12 = iM11308 ^ i7;
                        i11 = i6;
                    } else {
                        textView2 = textView2;
                        iM11306 = C19806.m45029("۟ܰ") ^ i10;
                        i3 = ((iM11306 ^ i9) * (-20221)) ^ 531083759;
                        i4 = 1009113965;
                        i8 = iM11306 ^ i4;
                        TextView textView115 = textView2;
                        i12 = i8;
                        i11 = i3;
                        textView2 = textView115;
                    }
                    break;
                case 509235000:
                case 1236755301:
                    textView2 = textView2;
                    i13 = iM450213 ^ i17;
                    C1937.m6291(RunnableC0195.m1436(this, i13), this);
                    iM450211 = 2098292956 ^ C19806.m45029(C0629.m2906(f76464, 619, 3, i16));
                    C1937.m6291(RunnableC0195.m1436(this, iM450211), this);
                    i14 = 8;
                    if (C1709.m5688()) {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("ۧܰ")) * 7;
                        i3 = ((iM11306 ^ i9) * 23583) ^ (-1536917279);
                        i4 = 146732364;
                    } else {
                        iM11306 = C19806.m45029("᩵ᩴ") ^ i9;
                        i3 = ((iM11306 ^ i10) * 2455) ^ (-718561655);
                        i4 = 1722586118;
                    }
                    i8 = iM11306 ^ i4;
                    TextView textView116 = textView2;
                    i12 = i8;
                    i11 = i3;
                    textView2 = textView116;
                    break;
                case 524486107:
                case 2094767592:
                    textView2 = textView2;
                    C1937.m6291(RunnableC0195.m1436(this, iM450212 ^ i18), this);
                    C7105.m18993(RunnableC0195.m1436(this, C19806.m45029(C1189.m4365(f76464, 647, 3, i16)) ^ 2125815358), this);
                    sArr3 = f76464;
                    if (C1875.f7103 < 0) {
                        iM11306 = (C19806.m45029("֡ۘ") + i10) * (-67);
                        i3 = ((iM11306 ^ i9) * (-8373)) ^ (-1685019310);
                        i4 = -1152145321;
                        i8 = iM11306 ^ i4;
                        TextView textView117 = textView2;
                        i12 = i8;
                        i11 = i3;
                        textView2 = textView117;
                    } else {
                        textView2 = textView2;
                        iM11308 = ThreadFactoryC3888.m11306("ۤ۫") ^ i10;
                        i6 = ((iM11308 ^ i9) * (-1595)) ^ (-810814408);
                        i7 = -301938329;
                        i12 = iM11308 ^ i7;
                        i11 = i6;
                    }
                    break;
                case 618374449:
                case 1941655348:
                    textView2 = textView2;
                    sArr2 = sArr2;
                    i13 = i13;
                    short s = f76464[594];
                    if ((s * 34190) - ((s * s) + 292239025) <= 0) {
                        iM45029 = C19806.m45029("۠ۜ") ^ i10;
                        i = ((iM45029 ^ i9) * (-19465)) ^ (-1390892569);
                        i2 = -1874017016;
                    } else {
                        iM45029 = C19806.m45029("۟ܽ") ^ i9;
                        i = ((iM45029 ^ i10) * 22815) ^ 1016760039;
                        i2 = -1621264291;
                    }
                    int i27 = iM45029 ^ i2;
                    textView2 = textView2;
                    i12 = i27;
                    i11 = i;
                    i13 = i13;
                    sArr2 = sArr2;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0253 A[PHI: r2 r3 r10 r11 r16
      0x0253: PHI (r2v5 java.lang.String) = (r2v2 java.lang.String), (r2v4 java.lang.String), (r2v2 java.lang.String), (r2v2 java.lang.String) binds: [B:61:0x0251, B:50:0x01cd, B:38:0x013a, B:11:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x0253: PHI (r3v5 java.lang.String) = (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v4 java.lang.String), (r3v2 java.lang.String) binds: [B:61:0x0251, B:50:0x01cd, B:38:0x013a, B:11:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x0253: PHI (r10v4 short) = (r10v3 short), (r10v2 short), (r10v2 short), (r10v2 short) binds: [B:61:0x0251, B:50:0x01cd, B:38:0x013a, B:11:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x0253: PHI (r11v5 int) = (r11v4 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:61:0x0251, B:50:0x01cd, B:38:0x013a, B:11:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x0253: PHI (r16v21 int) = (r16v6 int), (r16v11 int), (r16v14 int), (r16v22 int) binds: [B:61:0x0251, B:50:0x01cd, B:38:0x013a, B:11:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02dc A[PHI: r4 r5 r7 r16
      0x02dc: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:73:0x02da, B:69:0x02bc, B:35:0x0107, B:22:0x0088, B:15:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x02dc: PHI (r5v8 int) = (r5v2 int), (r5v2 int), (r5v7 int), (r5v2 int), (r5v2 int) binds: [B:73:0x02da, B:69:0x02bc, B:35:0x0107, B:22:0x0088, B:15:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x02dc: PHI (r7v5 java.lang.String) = 
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
      (r7v4 java.lang.String)
      (r7v2 java.lang.String)
     binds: [B:73:0x02da, B:69:0x02bc, B:35:0x0107, B:22:0x0088, B:15:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x02dc: PHI (r16v19 int) = (r16v3 int), (r16v4 int), (r16v15 int), (r16v18 int), (r16v20 int) binds: [B:73:0x02da, B:69:0x02bc, B:35:0x0107, B:22:0x0088, B:15:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0045, code lost:
    
        if (l.C2704.f10408 != false) goto L7;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m52045(l.C17485 r20, l.DialogInterfaceC19356 r21, l.C1313 r22, l.ViewOnClickListenerC23604 r23, com.google.android.material.textfield.TextInputLayout r24) {
        /*
            Method dump skipped, instruction units count: 1010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC23604.m52045(l.ܿܿۚ, l.᩵ۡۜ, l.֨ᩴ᩺, l.᩻ۡ᩺, com.google.android.material.textfield.TextInputLayout):void");
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0218 A[PHI: r1 r4 r5 r6
      0x0218: PHI (r1v8 java.lang.String) = (r1v2 java.lang.String), (r1v7 java.lang.String), (r1v2 java.lang.String), (r1v2 java.lang.String) binds: [B:61:0x0216, B:45:0x016b, B:27:0x00ac, B:7:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0218: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:61:0x0216, B:45:0x016b, B:27:0x00ac, B:7:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0218: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:61:0x0216, B:45:0x016b, B:27:0x00ac, B:7:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0218: PHI (r6v3 short) = (r6v2 short), (r6v2 short), (r6v2 short), (r6v6 short) binds: [B:61:0x0216, B:45:0x016b, B:27:0x00ac, B:7:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0260 A[PHI: r2 r3
      0x0260: PHI (r2v6 int) = (r2v2 int), (r2v2 int), (r2v5 int), (r2v2 int), (r2v2 int) binds: [B:69:0x025e, B:65:0x0244, B:37:0x010a, B:31:0x00d3, B:16:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0260: PHI (r3v5 java.lang.String) = 
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v4 java.lang.String)
      (r3v2 java.lang.String)
     binds: [B:69:0x025e, B:65:0x0244, B:37:0x010a, B:31:0x00d3, B:16:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x028e A[PHI: r7
      0x028e: PHI (r7v6 int) = (r7v2 int), (r7v5 int), (r7v2 int) binds: [B:73:0x028c, B:56:0x01e4, B:11:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m52062(C17485 c17485, View view, EditText editText, ViewOnClickListenerC23604 viewOnClickListenerC23604, C1313 c1313) {
        int iM11306;
        int i;
        int i2;
        String strM5577 = null;
        int iM11307 = 0;
        String strM4365 = null;
        int iM11308 = 0;
        int i3 = 0;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = -204013001;
        int i7 = C2249.f8050;
        int i8 = C1066.f4915;
        int iM45029 = (C19806.m45029("۠ۛ") ^ i7) * 39;
        int i9 = ((iM45029 ^ i8) * 19137) ^ (-2069363191);
        int i10 = 1690913596;
        while (true) {
            int i11 = iM45029 ^ i10;
            while (true) {
                i6 = ((((i6 ^ i8) * i.a) >> 31) & i9) ^ i11;
                switch (i6) {
                    case -1937952081:
                    case 42196714:
                        C2704.m8256(C0526.m2431(c1313, 2124809025 ^ iM11307));
                        break;
                    case -1760914638:
                    case -463364681:
                        int i12 = s + 6468;
                        if ((i12 * i12) - i4 <= 0) {
                            iM11306 = (ThreadFactoryC3888.m11306("۫ۧ") ^ i7) * 75;
                            i = ((iM11306 ^ i8) * 18025) ^ 686243013;
                            i2 = 739679181;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ܺ۟") + i8) * (-21);
                            i = ((iM11306 ^ i7) * (-29659)) ^ 2064803078;
                            i2 = -1141025000;
                        }
                        i11 = iM11306 ^ i2;
                        i9 = i;
                        break;
                    case -1758204190:
                    case -572653583:
                        int i13 = (s * s) + 41835024;
                        i4 = i13 + i13;
                        if (C1977.f7413 <= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ܿᩳ") ^ i7;
                            i = ((iM11306 ^ i8) * (-6155)) ^ (-1963452077);
                            i2 = -1178326305;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ܺۚ") ^ i7;
                            i = ((iM11306 ^ i8) * 14641) ^ (-112817004);
                            i2 = 604121656;
                        }
                        i11 = iM11306 ^ i2;
                        i9 = i;
                        break;
                    case -1743397406:
                    case -346784363:
                        if (!RunnableC1564.m5345()) {
                            iM45029 = (C19806.m45029("ܳۨ") + i8) * (-79);
                            i9 = ((iM45029 ^ i7) * (-21619)) ^ 990513368;
                            i10 = 1789068754;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("ܿᩳ") ^ i7;
                        i = ((iM11306 ^ i8) * (-6155)) ^ (-1963452077);
                        i2 = -1178326305;
                        i11 = iM11306 ^ i2;
                        i9 = i;
                        break;
                    case -1709390911:
                    case 856721816:
                        RunnableC1606.m5477(C2642.m8167(view, iM11308 ^ i3), false);
                        C1977.m6361(editText);
                        viewOnClickListenerC23604.m52038();
                        break;
                    case -1650778289:
                    case 456753052:
                        strM5577 = C1668.m5577(f76464, 303, 8, i5);
                        if (C1066.m4023() <= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۜ֨") ^ i8;
                            i = ((iM11306 ^ i7) * 29447) ^ 1912734762;
                            i2 = -659769840;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("᩵ۚ") + i7) * (-65);
                            i = ((iM11306 ^ i8) * (-29313)) ^ (-114754769);
                            i2 = 1558964317;
                        }
                        i11 = iM11306 ^ i2;
                        i9 = i;
                        break;
                    case -1299575960:
                    case -337030206:
                        if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                            iM11306 = C19806.m45029("ۖۗ") ^ i8;
                            i = ((iM11306 ^ i7) * 25635) ^ 2053627959;
                            i2 = -1897361862;
                        } else {
                            iM11306 = C19806.m45029("ۙ֫") ^ i7;
                            i = ((iM11306 ^ i8) * (-18637)) ^ 1246626705;
                            i2 = 510526564;
                        }
                        i11 = iM11306 ^ i2;
                        i9 = i;
                        break;
                    case -1283415467:
                    case -267701439:
                        C3286.m9798();
                        C3660.m10791();
                        break;
                    case -1182935367:
                    case 478215721:
                        i5 = 25037;
                        iM11306 = (C19806.m45029("ۗ᩹") ^ i8) * (-35);
                        i = ((iM11306 ^ i7) * 3859) ^ 1616866682;
                        i2 = -1968458253;
                        i11 = iM11306 ^ i2;
                        i9 = i;
                        break;
                    case -1123007182:
                    case 806635011:
                        C2332.m7079();
                        if (C3286.f12186) {
                            iM45029 = ThreadFactoryC3888.m11306("᩸ۜ") ^ i7;
                            i9 = ((iM45029 ^ i8) * 17157) ^ 311377529;
                            i10 = 638652288;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("ܿᩳ") ^ i7;
                        i = ((iM11306 ^ i8) * (-6155)) ^ (-1963452077);
                        i2 = -1178326305;
                        i11 = iM11306 ^ i2;
                        i9 = i;
                        break;
                    case -769820927:
                    case -569537287:
                        if (RunnableC1606.f6488 >= 0) {
                            iM11306 = C19806.m45029("ۖۗ") ^ i8;
                            i = ((iM11306 ^ i7) * 25635) ^ 2053627959;
                            i2 = -1897361862;
                        } else {
                            iM11306 = C19806.m45029("ۢ֡") ^ i7;
                            i = ((iM11306 ^ i8) * (-23129)) ^ (-1769321624);
                            i2 = 363588267;
                        }
                        i11 = iM11306 ^ i2;
                        i9 = i;
                        break;
                    case -763540502:
                    case 94325756:
                        iM11308 = ThreadFactoryC3888.m11306(strM4365);
                        i3 = 2103319043;
                        if (RunnableC3388.f12514 >= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۜ֨") ^ i8;
                            i = ((iM11306 ^ i7) * 29447) ^ 1912734762;
                            i2 = -659769840;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("֫᩷") ^ i7;
                            i = ((iM11306 ^ i8) * 21867) ^ 866395030;
                            i2 = -210562341;
                        }
                        i11 = iM11306 ^ i2;
                        i9 = i;
                        break;
                    case -715225668:
                    case 1088515830:
                        iM11307 = ThreadFactoryC3888.m11306(RunnableC0195.m1429(f76464, 311, 3, i5));
                        if (RunnableC1895.f7152) {
                            iM11306 = ThreadFactoryC3888.m11306("ۡܺ") ^ i8;
                            i = ((iM11306 ^ i7) * (-23061)) ^ 1244380781;
                            i2 = -373176392;
                        } else {
                            iM11306 = C19806.m45029("ۖۗ") ^ i8;
                            i = ((iM11306 ^ i7) * 25635) ^ 2053627959;
                            i2 = -1897361862;
                        }
                        i11 = iM11306 ^ i2;
                        i9 = i;
                        break;
                    case -708288197:
                    case -156163103:
                        if (RunnableC1895.f7152) {
                            iM11306 = ThreadFactoryC3888.m11306("ۢۚ") ^ i8;
                            i = ((iM11306 ^ i7) * (-15957)) ^ 1470440466;
                            i2 = 1422088915;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ۜ֨") ^ i8;
                            i = ((iM11306 ^ i7) * 29447) ^ 1912734762;
                            i2 = -659769840;
                        }
                        i11 = iM11306 ^ i2;
                        i9 = i;
                        break;
                    case -428776053:
                    case 370074635:
                        if (C1875.f7103 >= 0) {
                            iM11306 = C19806.m45029("ۖۗ") ^ i8;
                            i = ((iM11306 ^ i7) * 25635) ^ 2053627959;
                            i2 = -1897361862;
                            i11 = iM11306 ^ i2;
                            i9 = i;
                        }
                        iM11306 = ThreadFactoryC3888.m11306("ܿᩳ") ^ i7;
                        i = ((iM11306 ^ i8) * (-6155)) ^ (-1963452077);
                        i2 = -1178326305;
                        i11 = iM11306 ^ i2;
                        i9 = i;
                        break;
                    case -306729248:
                    case 2031992529:
                        CallableC1627.m5508(c1313, strM5577);
                        C3286.m9795(c17485);
                        if (C0962.m3738(c1313)) {
                            iM11306 = C19806.m45029("ۚܶ") ^ i7;
                            i = ((iM11306 ^ i8) * 14455) ^ 854275840;
                            i2 = -1742805671;
                        } else {
                            iM11306 = (i7 - ThreadFactoryC3888.m11306("ۗᩴ")) * 91;
                            i = ((iM11306 ^ i8) * (-28981)) ^ (-1829957070);
                            i2 = -1213748806;
                        }
                        i11 = iM11306 ^ i2;
                        i9 = i;
                        break;
                    case 271604686:
                    case 1899792700:
                        i5 = 21120;
                        iM11306 = (C19806.m45029("ۗ᩹") ^ i8) * (-35);
                        i = ((iM11306 ^ i7) * 3859) ^ 1616866682;
                        i2 = -1968458253;
                        i11 = iM11306 ^ i2;
                        i9 = i;
                        break;
                    case 407175150:
                    case 2041020580:
                        C3743.m10966();
                        C1937.m6279();
                        iM45029 = (C19806.m45029("ܳۨ") + i8) * (-79);
                        i9 = ((iM45029 ^ i7) * (-21619)) ^ 990513368;
                        i10 = 1789068754;
                        break;
                    case 698000091:
                    case 736319408:
                        if (C3743.m10966() <= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ܿᩳ") ^ i7;
                            i = ((iM11306 ^ i8) * (-6155)) ^ (-1963452077);
                            i2 = -1178326305;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ۡۡ") ^ i8;
                            i = ((iM11306 ^ i7) * 13949) ^ 1940996791;
                            i2 = -684261850;
                        }
                        i11 = iM11306 ^ i2;
                        i9 = i;
                        break;
                    case 1484615594:
                    case 1814642001:
                        strM4365 = C1189.m4365(f76464, 314, 3, i5);
                        if (C2642.m8171() != 0) {
                            iM11306 = C19806.m45029("ۖۗ") ^ i8;
                            i = ((iM11306 ^ i7) * 25635) ^ 2053627959;
                            i2 = -1897361862;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ۜۘ") ^ i8) * 85;
                            i = ((iM11306 ^ i7) * (-21055)) ^ 1250799427;
                            i2 = -1037888506;
                        }
                        i11 = iM11306 ^ i2;
                        i9 = i;
                        break;
                    default:
                        s = f76464[302];
                        if (C1461.f5957 <= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۜ֨") ^ i8;
                            i = ((iM11306 ^ i7) * 29447) ^ 1912734762;
                            i2 = -659769840;
                        } else {
                            iM11306 = (C19806.m45029("ᩳۘ") + i8) * 99;
                            i = ((iM11306 ^ i7) * 9307) ^ 1843719937;
                            i2 = -835694245;
                        }
                        i11 = iM11306 ^ i2;
                        i9 = i;
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if (l.AbstractC0464.m2313() == 0) goto L12;
     */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m52059(final android.view.View r17, final android.widget.EditText r18, final l.ViewOnClickListenerC23604 r19) {
        /*
            Method dump skipped, instruction units count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC23604.m52059(android.view.View, android.widget.EditText, l.᩻ۡ᩺):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int iM45029;
        int i2;
        int i3;
        int iM450210;
        int i4;
        int i5;
        int i6;
        int i7;
        EditText editText;
        int i8;
        SpannableString spannableString;
        int i9;
        int i10;
        short[] sArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String str;
        View view2;
        int i16;
        int i17;
        int iM450211;
        int i18;
        int i19;
        int i20;
        int i21;
        SpannableString spannableString2;
        int i22;
        int i23;
        TextInputLayout textInputLayout;
        View view3;
        int iM450212;
        int i24;
        int iM11306;
        int i25;
        int i26;
        String str2;
        TextInputLayout textInputLayout2;
        View view4;
        int iM11307;
        int i27;
        int i28;
        int i29;
        int i30;
        EditText editText2;
        int i31;
        SpannableString spannableString3;
        int i32;
        int i33;
        short[] sArr2;
        int i34;
        String str3;
        int i35;
        int i36;
        int i37;
        int i38;
        int iM450213;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        SpannableString spannableString4;
        int i45;
        View view5;
        int i46;
        int i47;
        short[] sArr3;
        int i48;
        int i49;
        C8067 c8067M5356;
        int iM450214;
        int i50;
        int i51;
        int i52;
        int i53;
        int i54;
        int i55;
        int i56;
        int i57;
        int iM11308;
        int i58;
        int i59;
        int i60;
        int i61;
        int iM450215;
        int i62;
        int i63;
        int iM450216;
        int i64;
        int iM450217;
        int i65;
        EditText editText3 = null;
        int i66 = 177935111;
        int i67 = C1189.f5284;
        int i68 = C3535.f13026;
        int iM450218 = C19806.m45029("᩺ܽ") ^ i68;
        int i69 = ((iM450218 ^ i67) * 20495) ^ (-1125681884);
        int i70 = iM450218 ^ (-1883127212);
        TextInputLayout textInputLayout3 = null;
        EditText editText4 = null;
        View view6 = null;
        TextInputLayout textInputLayout4 = null;
        View view7 = null;
        TextInputLayout textInputLayout5 = null;
        C8067 c8067 = null;
        String strM3747 = null;
        Object obj = null;
        SpannableString spannableString5 = null;
        C8067 c8067M3751 = null;
        short[] sArr4 = null;
        int i71 = 0;
        int i72 = 0;
        int iM6360 = 0;
        int i73 = 0;
        int iM11309 = 0;
        int i74 = 0;
        int iM113010 = 0;
        int i75 = 0;
        int i76 = 0;
        int i77 = 0;
        int iM113011 = 0;
        int iM113012 = 0;
        int i78 = 0;
        int i79 = 0;
        int iM450219 = 0;
        int iM113013 = 0;
        int i80 = 0;
        int i81 = 0;
        String str4 = null;
        View view8 = null;
        EditText editText5 = null;
        String[] strArr = null;
        int length = 0;
        int i82 = 0;
        TextInputLayout textInputLayout6 = null;
        int i83 = 0;
        while (true) {
            i66 = i70 ^ (i69 & (((i66 ^ i67) * 3835) >> 31));
            switch (i66) {
                case -2134537494:
                case -513649654:
                    m52050((boolean) i81);
                    break;
                case -2129632484:
                case -2064622766:
                    C1460.m5055(c8067M3751, iM113013 ^ 2100445422, obj);
                    C10634.m26823(c8067M3751, C19806.m45029(C1461.m5070(f76464, 588, 3, i73)) ^ 2119946264, new DialogInterface.OnClickListener() { // from class: l.۟ۡ᩺

                        /* JADX INFO: renamed from: ֡ۙᩴ, reason: not valid java name and contains not printable characters */
                        private static final short[] f24460 = {3362, 674, 688, 701, 739, 24368, 32046, -28773};

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i84) {
                            int iM113014;
                            int i85;
                            int i86;
                            int iM450220;
                            int i87;
                            int i88;
                            short[] sArr5;
                            int iM450221;
                            int i89;
                            int i90;
                            int iM113015;
                            int i91;
                            int iM450222;
                            String str5;
                            int i92;
                            int i93;
                            int i94;
                            InterfaceC17314 interfaceC17314;
                            int i95 = AbstractC0464.f2088;
                            int i96 = RunnableC3388.f12514;
                            int iM450223 = (C19806.m45029("᩶᩷") ^ i96) * (-25);
                            int i97 = ((iM450223 ^ i95) * 32553) ^ 519749079;
                            String strM5344 = null;
                            short[] sArr6 = null;
                            short[] sArr7 = null;
                            short[] sArr8 = null;
                            int i98 = iM450223 ^ 1962532056;
                            int iM113016 = 0;
                            int i99 = 0;
                            short s = 0;
                            int i100 = 0;
                            int i101 = 0;
                            int i102 = 0;
                            int i103 = 0;
                            int i104 = 432688628;
                            InterfaceC17314 interfaceC17314M26827 = null;
                            InterfaceC17314 interfaceC17314M8257 = null;
                            while (true) {
                                i104 = i98 ^ (i97 & (((i104 ^ i95) * (-6381)) >> 31));
                                switch (i104) {
                                    case -2071433252:
                                    case 1210213929:
                                        interfaceC17314M8257 = interfaceC17314M8257;
                                        interfaceC17314M26827 = interfaceC17314M26827;
                                        s = sArr6[0];
                                        if (C1148.f5161 > 0) {
                                            iM113014 = C19806.m45029("ۧۧ") ^ i96;
                                            i85 = ((iM113014 ^ i95) * (-11355)) ^ (-1318268385);
                                            i86 = 824872146;
                                            i94 = iM113014 ^ i86;
                                            interfaceC17314M26827 = interfaceC17314M26827;
                                            interfaceC17314 = interfaceC17314M8257;
                                            i98 = i94;
                                            i97 = i85;
                                            interfaceC17314M8257 = interfaceC17314;
                                        } else {
                                            sArr5 = sArr6;
                                            iM450221 = (ThreadFactoryC3888.m11306("ܶ֨") + i95) * 27;
                                            i89 = ((iM450221 ^ i96) * (-16907)) ^ (-1403190732);
                                            i90 = 979328302;
                                            sArr6 = sArr5;
                                            i97 = i89;
                                            interfaceC17314M26827 = interfaceC17314M26827;
                                            interfaceC17314 = interfaceC17314M8257;
                                            i98 = iM450221 ^ i90;
                                            interfaceC17314M8257 = interfaceC17314;
                                        }
                                        break;
                                    case -2004423336:
                                    case -1534994347:
                                        C10634.m26820();
                                        break;
                                    case -1869620816:
                                    case 1631744804:
                                        interfaceC17314M8257 = interfaceC17314M8257;
                                        interfaceC17314M26827 = interfaceC17314M26827;
                                        i102 = 1;
                                        i103 = 4;
                                        if (C1148.m4232() <= 0) {
                                            iM113014 = C19806.m45029("ܿܶ") ^ i96;
                                            i85 = ((iM113014 ^ i95) * (-18339)) ^ 1665121080;
                                            i86 = -1709939884;
                                        } else {
                                            iM113014 = C19806.m45029("ۡۧ") ^ i95;
                                            i85 = ((iM113014 ^ i96) * (-30911)) ^ (-1953385405);
                                            i86 = 2063763002;
                                        }
                                        i94 = iM113014 ^ i86;
                                        interfaceC17314M26827 = interfaceC17314M26827;
                                        interfaceC17314 = interfaceC17314M8257;
                                        i98 = i94;
                                        i97 = i85;
                                        interfaceC17314M8257 = interfaceC17314;
                                        break;
                                    case -1776286518:
                                    case -1356160627:
                                        interfaceC17314M8257 = interfaceC17314M8257;
                                        interfaceC17314M26827 = interfaceC17314M26827;
                                        i100 = (s * s) + 63361600;
                                        if (!C0526.f2219) {
                                            iM113014 = C19806.m45029("۬۬") ^ i95;
                                            i85 = ((iM113014 ^ i96) * 11131) ^ (-940117423);
                                            i86 = -1023293463;
                                            i94 = iM113014 ^ i86;
                                            interfaceC17314M26827 = interfaceC17314M26827;
                                            interfaceC17314 = interfaceC17314M8257;
                                            i98 = i94;
                                            i97 = i85;
                                            interfaceC17314M8257 = interfaceC17314;
                                        } else {
                                            interfaceC17314M8257 = interfaceC17314M8257;
                                            iM450220 = ThreadFactoryC3888.m11306("ۘ᩵") ^ i95;
                                            i87 = ((iM450220 ^ i96) * (-9475)) ^ 274872709;
                                            i88 = -1084614047;
                                            i98 = iM450220 ^ i88;
                                            i97 = i87;
                                            interfaceC17314M26827 = interfaceC17314M26827;
                                        }
                                        break;
                                    case -1687966386:
                                    case -1107766377:
                                        interfaceC17314M8257 = interfaceC17314M8257;
                                        interfaceC17314M26827 = interfaceC17314M26827;
                                        if ((s * 15920) - i100 <= 0) {
                                            iM113014 = ThreadFactoryC3888.m11306("֨ܽ") ^ i96;
                                            i85 = ((iM113014 ^ i95) * (-21907)) ^ 1510102495;
                                            i86 = 1564248201;
                                        } else {
                                            iM113014 = ThreadFactoryC3888.m11306("۟ۤ") ^ i95;
                                            i85 = ((iM113014 ^ i96) * (-29243)) ^ (-1452936260);
                                            i86 = 1419881245;
                                        }
                                        i94 = iM113014 ^ i86;
                                        interfaceC17314M26827 = interfaceC17314M26827;
                                        interfaceC17314 = interfaceC17314M8257;
                                        i98 = i94;
                                        i97 = i85;
                                        interfaceC17314M8257 = interfaceC17314;
                                        break;
                                    case -1646971729:
                                    case -415743013:
                                        if (C2124.m6673() <= 0) {
                                            iM113015 = C19806.m45029("ۚۖ") ^ i96;
                                            i85 = ((iM113015 ^ i95) * 26597) ^ (-1701452704);
                                            i91 = 9858204;
                                            i94 = iM113015 ^ i91;
                                            interfaceC17314 = interfaceC17314M8257;
                                            i98 = i94;
                                            i97 = i85;
                                            interfaceC17314M8257 = interfaceC17314;
                                        }
                                        sArr5 = sArr6;
                                        interfaceC17314M8257 = interfaceC17314M8257;
                                        interfaceC17314M26827 = interfaceC17314M26827;
                                        iM450221 = (ThreadFactoryC3888.m11306("ܶ֨") + i95) * 27;
                                        i89 = ((iM450221 ^ i96) * (-16907)) ^ (-1403190732);
                                        i90 = 979328302;
                                        sArr6 = sArr5;
                                        i97 = i89;
                                        interfaceC17314M26827 = interfaceC17314M26827;
                                        interfaceC17314 = interfaceC17314M8257;
                                        i98 = iM450221 ^ i90;
                                        interfaceC17314M8257 = interfaceC17314;
                                        break;
                                    case -1634318817:
                                    case 664821195:
                                        if (!RunnableC1564.f6300) {
                                            sArr5 = sArr6;
                                            interfaceC17314M8257 = interfaceC17314M8257;
                                            interfaceC17314M26827 = interfaceC17314M26827;
                                            iM450221 = (ThreadFactoryC3888.m11306("ܶ֨") + i95) * 27;
                                            i89 = ((iM450221 ^ i96) * (-16907)) ^ (-1403190732);
                                            i90 = 979328302;
                                            sArr6 = sArr5;
                                            i97 = i89;
                                            interfaceC17314M26827 = interfaceC17314M26827;
                                            interfaceC17314 = interfaceC17314M8257;
                                            i98 = iM450221 ^ i90;
                                            interfaceC17314M8257 = interfaceC17314;
                                        } else {
                                            iM450222 = (ThreadFactoryC3888.m11306("ۧ֫") + i95) * (-105);
                                            str5 = strM5344;
                                            i92 = ((iM450222 ^ i96) * 4507) ^ (-1824396997);
                                            i93 = 934160357;
                                            i98 = iM450222 ^ i93;
                                            i97 = i92;
                                            strM5344 = str5;
                                        }
                                        break;
                                    case -1572516363:
                                    case -1019424861:
                                        i101 = 721;
                                        iM113014 = C19806.m45029("ۙܽ") ^ i95;
                                        i85 = ((iM113014 ^ i96) * (-28001)) ^ 2008276338;
                                        i86 = -893040231;
                                        i94 = iM113014 ^ i86;
                                        interfaceC17314M26827 = interfaceC17314M26827;
                                        interfaceC17314 = interfaceC17314M8257;
                                        i98 = i94;
                                        i97 = i85;
                                        interfaceC17314M8257 = interfaceC17314;
                                        break;
                                    case -1530019439:
                                    case -1106280060:
                                        RunnableC1895.m6165(C2332.m7083(this.f24461, iM113016 ^ i99), 8);
                                        break;
                                    case -1315237345:
                                    case 478328169:
                                        iM113016 = ThreadFactoryC3888.m11306(strM5344);
                                        if (C0671.f2816 != 0) {
                                            sArr5 = sArr6;
                                            interfaceC17314M8257 = interfaceC17314M8257;
                                            interfaceC17314M26827 = interfaceC17314M26827;
                                            i99 = 2121955062;
                                            iM450221 = (ThreadFactoryC3888.m11306("ܶ֨") + i95) * 27;
                                            i89 = ((iM450221 ^ i96) * (-16907)) ^ (-1403190732);
                                            i90 = 979328302;
                                            sArr6 = sArr5;
                                            i97 = i89;
                                            interfaceC17314M26827 = interfaceC17314M26827;
                                            interfaceC17314 = interfaceC17314M8257;
                                            i98 = iM450221 ^ i90;
                                            interfaceC17314M8257 = interfaceC17314;
                                        } else {
                                            int iM113017 = (ThreadFactoryC3888.m11306("ܽܶ") + i96) * 13;
                                            i98 = iM113017 ^ (-1563047703);
                                            i97 = ((iM113017 ^ i95) * 14827) ^ 365799456;
                                            i99 = 2121955062;
                                        }
                                        break;
                                    case -664702875:
                                    case 625350642:
                                        strM5344 = RunnableC1564.m5344(sArr8, 5, 3, i101);
                                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                                            iM450222 = (ThreadFactoryC3888.m11306("ۧ֫") + i95) * (-105);
                                            str5 = strM5344;
                                            i92 = ((iM450222 ^ i96) * 4507) ^ (-1824396997);
                                            i93 = 934160357;
                                        } else {
                                            iM450222 = C19806.m45029("ܶۢ") ^ i95;
                                            str5 = strM5344;
                                            i92 = ((iM450222 ^ i96) * 6055) ^ (-338342822);
                                            i93 = -369540268;
                                        }
                                        i98 = iM450222 ^ i93;
                                        i97 = i92;
                                        strM5344 = str5;
                                        break;
                                    case -446984086:
                                    case -149546912:
                                        interfaceC17314M8257 = interfaceC17314M8257;
                                        interfaceC17314M26827 = interfaceC17314M26827;
                                        if (C3286.m9798() > 0) {
                                            iM113014 = ThreadFactoryC3888.m11306("᩹ۚ") ^ i95;
                                            i85 = ((iM113014 ^ i96) * (-2003)) ^ (-1373535691);
                                            i86 = 166306271;
                                            i94 = iM113014 ^ i86;
                                            interfaceC17314M26827 = interfaceC17314M26827;
                                            interfaceC17314 = interfaceC17314M8257;
                                            i98 = i94;
                                            i97 = i85;
                                            interfaceC17314M8257 = interfaceC17314;
                                        } else {
                                            interfaceC17314M8257 = interfaceC17314M8257;
                                            iM450220 = ThreadFactoryC3888.m11306("ۘ᩵") ^ i95;
                                            i87 = ((iM450220 ^ i96) * (-9475)) ^ 274872709;
                                            i88 = -1084614047;
                                            i98 = iM450220 ^ i88;
                                            i97 = i87;
                                            interfaceC17314M26827 = interfaceC17314M26827;
                                        }
                                        break;
                                    case -125682094:
                                    case 214157279:
                                        i101 = 46865;
                                        iM113014 = C19806.m45029("ۙܽ") ^ i95;
                                        i85 = ((iM113014 ^ i96) * (-28001)) ^ 2008276338;
                                        i86 = -893040231;
                                        i94 = iM113014 ^ i86;
                                        interfaceC17314M26827 = interfaceC17314M26827;
                                        interfaceC17314 = interfaceC17314M8257;
                                        i98 = i94;
                                        i97 = i85;
                                        interfaceC17314M8257 = interfaceC17314;
                                        break;
                                    case 68449596:
                                    case 861777847:
                                        C0526.m2437();
                                        iM450222 = (ThreadFactoryC3888.m11306("ۧ֫") + i95) * (-105);
                                        str5 = strM5344;
                                        i92 = ((iM450222 ^ i96) * 4507) ^ (-1824396997);
                                        i93 = 934160357;
                                        i98 = iM450222 ^ i93;
                                        i97 = i92;
                                        strM5344 = str5;
                                        break;
                                    case 345839861:
                                    case 1759387725:
                                        C3743.m10966();
                                        if (C1460.f5948 >= 0) {
                                            interfaceC17314M8257 = interfaceC17314M8257;
                                            interfaceC17314M26827 = interfaceC17314M26827;
                                            iM113014 = C19806.m45029("ܿܶ") ^ i96;
                                            i85 = ((iM113014 ^ i95) * (-18339)) ^ 1665121080;
                                            i86 = -1709939884;
                                            i94 = iM113014 ^ i86;
                                            interfaceC17314M26827 = interfaceC17314M26827;
                                            interfaceC17314 = interfaceC17314M8257;
                                            i98 = i94;
                                            i97 = i85;
                                            interfaceC17314M8257 = interfaceC17314;
                                        } else {
                                            iM450222 = (ThreadFactoryC3888.m11306("ۧ֫") + i95) * (-105);
                                            str5 = strM5344;
                                            i92 = ((iM450222 ^ i96) * 4507) ^ (-1824396997);
                                            i93 = 934160357;
                                            i98 = iM450222 ^ i93;
                                            i97 = i92;
                                            strM5344 = str5;
                                        }
                                        break;
                                    case 593554747:
                                    case 1796482374:
                                        interfaceC17314M26827 = C10634.m26827(interfaceC17314M8257, RunnableC0195.m1429(sArr7, i102, i103, i101), false);
                                        if (C0050.f912 <= 0) {
                                            iM113015 = C19806.m45029("ۚۖ") ^ i96;
                                            i85 = ((iM113015 ^ i95) * 26597) ^ (-1701452704);
                                            i91 = 9858204;
                                        } else {
                                            iM113015 = ThreadFactoryC3888.m11306("ۤ᩶") ^ i96;
                                            i85 = ((iM113015 ^ i95) * (-5635)) ^ 395534310;
                                            i91 = -1011134366;
                                        }
                                        i94 = iM113015 ^ i91;
                                        interfaceC17314 = interfaceC17314M8257;
                                        i98 = i94;
                                        i97 = i85;
                                        interfaceC17314M8257 = interfaceC17314;
                                        break;
                                    case 747870761:
                                    case 1367879033:
                                        interfaceC17314M8257 = interfaceC17314M8257;
                                        interfaceC17314M26827 = interfaceC17314M26827;
                                        sArr5 = f24460;
                                        if (C1189.f5284 <= 0) {
                                            iM450221 = (ThreadFactoryC3888.m11306("ܶ֨") + i95) * 27;
                                            i89 = ((iM450221 ^ i96) * (-16907)) ^ (-1403190732);
                                            i90 = 979328302;
                                        } else {
                                            iM450221 = C19806.m45029("ܳۨ") ^ i96;
                                            i89 = ((iM450221 ^ i95) * (-961)) ^ (-1956034746);
                                            i90 = -702385789;
                                        }
                                        sArr6 = sArr5;
                                        i97 = i89;
                                        interfaceC17314M26827 = interfaceC17314M26827;
                                        interfaceC17314 = interfaceC17314M8257;
                                        i98 = iM450221 ^ i90;
                                        interfaceC17314M8257 = interfaceC17314;
                                        break;
                                    case 1572557263:
                                    case 2063601227:
                                        C2249.m6906(interfaceC17314M26827);
                                        sArr8 = f24460;
                                        if (RunnableC1606.f6488 >= 0) {
                                            interfaceC17314M26827 = interfaceC17314M26827;
                                            iM450220 = ThreadFactoryC3888.m11306("ۘ᩵") ^ i95;
                                            i87 = ((iM450220 ^ i96) * (-9475)) ^ 274872709;
                                            i88 = -1084614047;
                                        } else {
                                            iM450220 = C19806.m45029("ۖ᩸") ^ i96;
                                            interfaceC17314M26827 = interfaceC17314M26827;
                                            i87 = ((iM450220 ^ i95) * (-27531)) ^ (-152394283);
                                            i88 = -1153038289;
                                        }
                                        i98 = iM450220 ^ i88;
                                        i97 = i87;
                                        interfaceC17314M26827 = interfaceC17314M26827;
                                        break;
                                    default:
                                        interfaceC17314M26827 = interfaceC17314M26827;
                                        int i105 = ViewOnClickListenerC23604.f76463;
                                        interfaceC17314M8257 = C2704.m8257(ApplicationC0716.f2992);
                                        sArr7 = f24460;
                                        if (C3535.f13026 <= 0) {
                                            iM450220 = ThreadFactoryC3888.m11306("ۘ᩵") ^ i95;
                                            i87 = ((iM450220 ^ i96) * (-9475)) ^ 274872709;
                                            i88 = -1084614047;
                                        } else {
                                            iM450220 = (C19806.m45029("ۢ֫") ^ i96) * (-109);
                                            i87 = ((iM450220 ^ i95) * (-9913)) ^ 1144402263;
                                            i88 = -659577946;
                                        }
                                        i98 = iM450220 ^ i88;
                                        i97 = i87;
                                        interfaceC17314M26827 = interfaceC17314M26827;
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    C23250.m51307(CallableC1627.m5514(c8067M3751));
                    break;
                case -2109867230:
                case 1441973071:
                    C19328.m44316(textInputLayout3);
                    final EditText editText6 = editText4;
                    MenuItemOnMenuItemClickListenerC3244.m9704(editText6, C1709.m5682());
                    editText6.setSelection(i81, MenuItemOnMenuItemClickListenerC3244.m9708(editText6));
                    C8067 c8067M5357 = RunnableC1564.m5356(this);
                    View view9 = view8;
                    C1977.m6349(c8067M5357, view9);
                    final DialogInterfaceC19356 dialogInterfaceC19356M8239 = C2704.m8239(c8067M5357);
                    C16737.m39290(editText6);
                    final TextInputLayout textInputLayout7 = textInputLayout3;
                    C1937.m6291(C2642.m8167(view9, iM113011), new View.OnClickListener() { // from class: l.۟᩵᩺
                        {
                            int i84 = -37547139;
                            int i85 = C3535.f13026;
                            int i86 = C1977.f7413;
                            int iM113014 = (ThreadFactoryC3888.m11306("᩷᩺") ^ i86) * (-85);
                            int i87 = ((iM113014 ^ i85) * (-10295)) ^ (-1605222213);
                            int i88 = 2062384229;
                            while (true) {
                                i84 = ((((i84 ^ i85) * 14045) >> 31) & i87) ^ (iM113014 ^ i88);
                                switch (i84) {
                                    case -1960956341:
                                    case -2675575:
                                        C1875.m6086();
                                        C1977.m6356();
                                        throw new RuntimeException();
                                    case -1815642445:
                                    case 1295409030:
                                        if (AbstractC0464.m2313() != 0) {
                                            iM113014 = C19806.m45029("᩺ۗ") ^ i86;
                                            i87 = ((iM113014 ^ i85) * (-7129)) ^ 2035112036;
                                            i88 = 1918095833;
                                        } else {
                                            iM113014 = (i86 - ThreadFactoryC3888.m11306("ۤۤ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                            i87 = ((iM113014 ^ i85) * 27881) ^ (-260539367);
                                            i88 = -1731381133;
                                        }
                                        break;
                                    case -1813450209:
                                    case 461195438:
                                        if (C2124.f7782 <= 0) {
                                            iM113014 = C19806.m45029("᩺ۗ") ^ i86;
                                            i87 = ((iM113014 ^ i85) * (-7129)) ^ 2035112036;
                                            i88 = 1918095833;
                                        } else {
                                            iM113014 = (C19806.m45029("۟ܿ") ^ i86) * 87;
                                            i87 = ((iM113014 ^ i85) * (-11967)) ^ 849972915;
                                            i88 = -927874749;
                                        }
                                        break;
                                    case -1516104355:
                                    case 166645211:
                                        if (C0278.m1789() > 0) {
                                            iM113014 = (C19806.m45029("ۤ֫") ^ i85) * (-41);
                                            i87 = ((iM113014 ^ i86) * 14517) ^ 174906861;
                                            i88 = 923926775;
                                        } else {
                                            iM113014 = C19806.m45029("᩺ۗ") ^ i86;
                                            i87 = ((iM113014 ^ i85) * (-7129)) ^ 2035112036;
                                            i88 = 1918095833;
                                        }
                                        break;
                                    case -1470694756:
                                    case 1562672564:
                                        if (C0526.f2219) {
                                            iM113014 = (C19806.m45029("۟ܿ") ^ i86) * 87;
                                            i87 = ((iM113014 ^ i85) * (-11967)) ^ 849972915;
                                            i88 = -927874749;
                                        } else {
                                            iM113014 = ThreadFactoryC3888.m11306("֡᩻") ^ i85;
                                            i87 = ((iM113014 ^ i86) * 7515) ^ (-899721259);
                                            i88 = 1646217734;
                                        }
                                        break;
                                    case -1233595168:
                                    case 880693427:
                                        if (C3535.f13026 <= 0) {
                                            iM113014 = C19806.m45029("ᩴۤ") ^ i86;
                                            i87 = ((iM113014 ^ i85) * (-12005)) ^ (-1937414193);
                                            i88 = -140201431;
                                        } else {
                                            iM113014 = C19806.m45029("ۡۨ") ^ i86;
                                            i87 = ((iM113014 ^ i85) * (-25355)) ^ 918142202;
                                            i88 = 209212383;
                                        }
                                        break;
                                    case -1185500504:
                                    case 323679985:
                                        if (RunnableC1564.f6300) {
                                            iM113014 = C19806.m45029("᩺ۗ") ^ i86;
                                            i87 = ((iM113014 ^ i85) * (-7129)) ^ 2035112036;
                                            i88 = 1918095833;
                                        } else {
                                            iM113014 = (ThreadFactoryC3888.m11306("ۙ᩵") + i86) * 61;
                                            i87 = ((iM113014 ^ i85) * 9971) ^ (-2135705566);
                                            i88 = 71045083;
                                        }
                                        break;
                                    case -1135550130:
                                    case 542472128:
                                        C1377.m4833();
                                        if (C1189.f5284 > 0) {
                                            iM113014 = (C19806.m45029("۟ܿ") ^ i86) * 87;
                                            i87 = ((iM113014 ^ i85) * (-11967)) ^ 849972915;
                                            i88 = -927874749;
                                        } else {
                                            iM113014 = ThreadFactoryC3888.m11306("֫ܿ") ^ i85;
                                            i87 = ((iM113014 ^ i86) * (-13603)) ^ (-551890415);
                                            i88 = -1606965662;
                                        }
                                        break;
                                    case -1091710574:
                                    case 367240417:
                                        return;
                                    case -817411478:
                                    case 1585255036:
                                        if (C1668.f6641 >= 0) {
                                            iM113014 = (C19806.m45029("ۤ֫") ^ i85) * (-41);
                                            i87 = ((iM113014 ^ i86) * 14517) ^ 174906861;
                                            i88 = 923926775;
                                        } else {
                                            iM113014 = C19806.m45029("᩸۠") ^ i86;
                                            i87 = ((iM113014 ^ i85) * 12055) ^ 952766416;
                                            i88 = -1465897953;
                                        }
                                        break;
                                    case -720457937:
                                    case 393779423:
                                        C3286.m9798();
                                        C10634.m26820();
                                        iM113014 = ThreadFactoryC3888.m11306("֫ܿ") ^ i85;
                                        i87 = ((iM113014 ^ i86) * (-13603)) ^ (-551890415);
                                        i88 = -1606965662;
                                        break;
                                    case -299384786:
                                    case 740506374:
                                        if (C3722.f13525 <= 0) {
                                            iM113014 = C19806.m45029("ᩴۤ") ^ i86;
                                            i87 = ((iM113014 ^ i85) * (-12005)) ^ (-1937414193);
                                            i88 = -140201431;
                                        } else {
                                            iM113014 = (C19806.m45029("ۚܿ") ^ i85) * (-99);
                                            i87 = ((iM113014 ^ i86) * 27347) ^ (-961382927);
                                            i88 = 1518254066;
                                        }
                                        break;
                                    case -89748749:
                                    case 1413877238:
                                        if (C19806.f63586) {
                                            iM113014 = (C19806.m45029("۟ܿ") ^ i86) * 87;
                                            i87 = ((iM113014 ^ i85) * (-11967)) ^ 849972915;
                                            i88 = -927874749;
                                        } else {
                                            iM113014 = C19806.m45029("۠ۛ") ^ i85;
                                            i87 = ((iM113014 ^ i86) * (-5811)) ^ 1702209992;
                                            i88 = -139059848;
                                        }
                                        break;
                                    case 450665293:
                                    case 1040170723:
                                        if (RunnableC3388.f12514 >= 0) {
                                            iM113014 = (C19806.m45029("ۤ֫") ^ i85) * (-41);
                                            i87 = ((iM113014 ^ i86) * 14517) ^ 174906861;
                                            i88 = 923926775;
                                        } else {
                                            iM113014 = (i86 - ThreadFactoryC3888.m11306("۠ܳ")) * (-93);
                                            i87 = ((iM113014 ^ i85) * 7307) ^ 1207547857;
                                            i88 = 2037616309;
                                        }
                                        break;
                                    case 604210125:
                                    case 1730449647:
                                        if (C19806.f63586) {
                                            iM113014 = C19806.m45029("ᩴۤ") ^ i86;
                                            i87 = ((iM113014 ^ i85) * (-12005)) ^ (-1937414193);
                                            i88 = -140201431;
                                        } else {
                                            iM113014 = ThreadFactoryC3888.m11306("֡ۧ") ^ i85;
                                            i87 = ((iM113014 ^ i86) * (-27405)) ^ 546719060;
                                            i88 = 1241722264;
                                        }
                                        break;
                                    default:
                                        if (RunnableC1606.f6488 >= 0) {
                                            iM113014 = (C19806.m45029("ۤ֫") ^ i85) * (-41);
                                            i87 = ((iM113014 ^ i86) * 14517) ^ 174906861;
                                            i88 = 923926775;
                                        } else {
                                            iM113014 = (i85 - ThreadFactoryC3888.m11306("֨ۜ")) * (-123);
                                            i87 = ((iM113014 ^ i86) * (-17631)) ^ 1242674139;
                                            i88 = -1011248367;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view10) {
                            DialogInterfaceC19356 dialogInterfaceC19356 = null;
                            ViewOnClickListenerC23604 viewOnClickListenerC23604 = null;
                            int i84 = -1274677908;
                            int i85 = MenuItemOnMenuItemClickListenerC3244.f12064;
                            int i86 = AbstractC0464.f2088;
                            int iM113014 = ThreadFactoryC3888.m11306("ܺۡ") ^ i85;
                            int i87 = ((iM113014 ^ i86) * 14161) ^ 231478423;
                            int i88 = -1237515143;
                            while (true) {
                                i84 = ((((i84 ^ i86) * (-9493)) >> 31) & i87) ^ (iM113014 ^ i88);
                                switch (i84) {
                                    case -2101880913:
                                    case -1109413816:
                                        C1398.m4895();
                                        C2249.m6915();
                                        iM113014 = (ThreadFactoryC3888.m11306("ۙ۟") + i85) * 71;
                                        i87 = ((iM113014 ^ i86) * (-15779)) ^ (-821350378);
                                        i88 = -1702843455;
                                        break;
                                    case -2089553510:
                                    case 49209914:
                                        if (C1461.m5080()) {
                                            iM113014 = ThreadFactoryC3888.m11306("᩵᩵") ^ i86;
                                            i87 = ((iM113014 ^ i85) * (-22981)) ^ 2043885244;
                                            i88 = -960104338;
                                        } else {
                                            iM113014 = (C19806.m45029("ܺ᩺") + i85) * (-27);
                                            i87 = ((iM113014 ^ i86) * 10597) ^ (-270057361);
                                            i88 = -720062384;
                                        }
                                        break;
                                    case -1931945703:
                                    case 390068009:
                                        if (ThreadFactoryC3888.f14547 <= 0) {
                                            iM113014 = C19806.m45029("ۢ۬") ^ i86;
                                            i87 = ((iM113014 ^ i85) * 8063) ^ 1498624961;
                                            i88 = -440542427;
                                        } else {
                                            iM113014 = (ThreadFactoryC3888.m11306("᩸ᩴ") + i85) * (-15);
                                            i87 = ((iM113014 ^ i86) * (-17253)) ^ 929093111;
                                            i88 = 1016983260;
                                        }
                                        break;
                                    case -1898983903:
                                    case -721441501:
                                        viewOnClickListenerC23604 = this;
                                        if (C1461.m5080()) {
                                            iM113014 = C19806.m45029("᩹۟") ^ i86;
                                            i87 = ((iM113014 ^ i85) * 11925) ^ 2078285704;
                                            i88 = -54664094;
                                        } else {
                                            iM113014 = C19806.m45029("ۛܶ") ^ i85;
                                            i87 = ((iM113014 ^ i86) * (-10157)) ^ 2000229528;
                                            i88 = 784630176;
                                        }
                                        break;
                                    case -1882828884:
                                    case 1067961285:
                                        ViewOnClickListenerC23604.m52061(editText6, dialogInterfaceC19356, viewOnClickListenerC23604, textInputLayout7);
                                        break;
                                    case -1726225313:
                                    case -1634632899:
                                        dialogInterfaceC19356 = dialogInterfaceC19356M8239;
                                        if (RunnableC1895.f7152) {
                                            iM113014 = C19806.m45029("֡ܽ") ^ i86;
                                            i87 = ((iM113014 ^ i85) * 30413) ^ (-1500465858);
                                            i88 = -1935822920;
                                        } else {
                                            iM113014 = C19806.m45029("ۢ۬") ^ i86;
                                            i87 = ((iM113014 ^ i85) * 8063) ^ 1498624961;
                                            i88 = -440542427;
                                        }
                                        break;
                                    case -1705506758:
                                    case 105511336:
                                        if (C1937.f7317 >= 0) {
                                            iM113014 = ThreadFactoryC3888.m11306("᩵᩵") ^ i86;
                                            i87 = ((iM113014 ^ i85) * (-22981)) ^ 2043885244;
                                            i88 = -960104338;
                                        } else {
                                            iM113014 = C19806.m45029("۫ۛ") ^ i86;
                                            i87 = ((iM113014 ^ i85) * (-20425)) ^ 12977902;
                                            i88 = -59805491;
                                        }
                                        break;
                                    case -1675659707:
                                    case 249759754:
                                        if (C0278.m1789() <= 0) {
                                            iM113014 = ThreadFactoryC3888.m11306("᩵᩵") ^ i86;
                                            i87 = ((iM113014 ^ i85) * (-22981)) ^ 2043885244;
                                            i88 = -960104338;
                                        } else {
                                            iM113014 = (ThreadFactoryC3888.m11306("ܿۙ") ^ i86) * 109;
                                            i87 = ((iM113014 ^ i85) * (-3331)) ^ (-1306272748);
                                            i88 = 952619974;
                                        }
                                        break;
                                    case -1633418775:
                                    case -1081493435:
                                        if (C1937.m6279() >= 0) {
                                            iM113014 = (C19806.m45029("᩵ۨ") ^ i85) * (-79);
                                            i87 = ((iM113014 ^ i86) * (-5547)) ^ 1012378728;
                                            i88 = 2091983098;
                                        } else {
                                            iM113014 = C19806.m45029("ۢ۬") ^ i86;
                                            i87 = ((iM113014 ^ i85) * 8063) ^ 1498624961;
                                            i88 = -440542427;
                                        }
                                        break;
                                    case -1542645062:
                                    case -821793260:
                                        if (C1461.f5957 <= 0) {
                                            iM113014 = (C19806.m45029("᩵ۨ") ^ i85) * (-79);
                                            i87 = ((iM113014 ^ i86) * (-5547)) ^ 1012378728;
                                            i88 = 2091983098;
                                        } else {
                                            iM113014 = (ThreadFactoryC3888.m11306("ۨܶ") + i85) * (-107);
                                            i87 = ((iM113014 ^ i86) * 22753) ^ (-339050943);
                                            i88 = 802888364;
                                        }
                                        break;
                                    case -1529059133:
                                    case -750355835:
                                        if (AbstractC0464.f2088 <= 0) {
                                            iM113014 = ThreadFactoryC3888.m11306("᩵᩵") ^ i86;
                                            i87 = ((iM113014 ^ i85) * (-22981)) ^ 2043885244;
                                            i88 = -960104338;
                                        } else {
                                            iM113014 = (ThreadFactoryC3888.m11306("ۙ۟") + i85) * 71;
                                            i87 = ((iM113014 ^ i86) * (-15779)) ^ (-821350378);
                                            i88 = -1702843455;
                                        }
                                        break;
                                    case -1405946017:
                                    case 1769410532:
                                        if (RunnableC3388.f12514 >= 0) {
                                            iM113014 = C19806.m45029("᩹۟") ^ i86;
                                            i87 = ((iM113014 ^ i85) * 11925) ^ 2078285704;
                                            i88 = -54664094;
                                        } else {
                                            iM113014 = C19806.m45029("۫ܳ") ^ i86;
                                            i87 = ((iM113014 ^ i85) * (-5091)) ^ 878910200;
                                            i88 = -619603179;
                                        }
                                        break;
                                    case -776342941:
                                    case -741753112:
                                        if (AbstractC0464.f2088 <= 0) {
                                            iM113014 = C19806.m45029("᩹۟") ^ i86;
                                            i87 = ((iM113014 ^ i85) * 11925) ^ 2078285704;
                                            i88 = -54664094;
                                        } else {
                                            iM113014 = ThreadFactoryC3888.m11306("۬ۚ") ^ i86;
                                            i87 = ((iM113014 ^ i85) * 3575) ^ 53861023;
                                            i88 = -1541355418;
                                        }
                                        break;
                                    case 739490718:
                                    case 1950672841:
                                        ViewGroupOnHierarchyChangeListenerC1916.m6233();
                                        if (C0216.f1393 != 0) {
                                            iM113014 = C19806.m45029("ۢ۬") ^ i86;
                                            i87 = ((iM113014 ^ i85) * 8063) ^ 1498624961;
                                            i88 = -440542427;
                                        } else {
                                            iM113014 = (ThreadFactoryC3888.m11306("ۙ۟") + i85) * 71;
                                            i87 = ((iM113014 ^ i86) * (-15779)) ^ (-821350378);
                                            i88 = -1702843455;
                                        }
                                        break;
                                    case 1028679306:
                                    case 1483409312:
                                        C2642.m8171();
                                        C0216.m1591();
                                        break;
                                    default:
                                        if (C3743.m10966() <= 0) {
                                            iM113014 = (C19806.m45029("᩵ۨ") ^ i85) * (-79);
                                            i87 = ((iM113014 ^ i86) * (-5547)) ^ 1012378728;
                                            i88 = 2091983098;
                                        } else {
                                            iM113014 = C19806.m45029("ۡܽ") ^ i85;
                                            i87 = ((iM113014 ^ i86) * (-32381)) ^ 561524566;
                                            i88 = -1488244637;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    break;
                case -2022398970:
                case 1204103465:
                    i5 = iM6360;
                    i6 = i83;
                    i7 = iM113011;
                    editText = editText5;
                    i8 = i79;
                    spannableString = spannableString5;
                    i9 = i76;
                    i10 = i77;
                    sArr = sArr4;
                    i11 = iM11309;
                    int i84 = i80;
                    i13 = i72;
                    i14 = i81;
                    i15 = length;
                    str = str4;
                    view2 = view7;
                    i16 = i84;
                    View viewM9787 = C3286.m9787(this, C19806.m45029(C0962.m3747(f76464, 482, 3, i73)) ^ 2102288835);
                    i12 = i75;
                    View viewM8167 = C2642.m8167(viewM9787, i12);
                    C1937.m6286(viewM8167, str);
                    textInputLayout4 = (TextInputLayout) viewM8167;
                    if (!C19806.f63586) {
                        int iM450220 = C19806.m45029("۫ܿ") ^ i67;
                        i76 = i9;
                        view6 = viewM9787;
                        spannableString5 = spannableString;
                        i75 = i12;
                        i79 = i8;
                        i83 = i6;
                        iM11309 = i11;
                        i70 = iM450220 ^ 777136366;
                        sArr4 = sArr;
                        i77 = i10;
                        editText5 = editText;
                        iM113011 = i7;
                        i69 = ((iM450220 ^ i68) * 5035) ^ (-643777757);
                        iM6360 = i5;
                        int i85 = i15;
                        i81 = i14;
                        i72 = i13;
                        i80 = i16;
                        view7 = view2;
                        str4 = str;
                        length = i85;
                    } else {
                        view6 = viewM9787;
                        int iM113014 = ThreadFactoryC3888.m11306("ۜ۫") ^ i68;
                        i27 = ((iM113014 ^ i67) * (-20509)) ^ 514508515;
                        i29 = iM113014 ^ 2124492801;
                        i76 = i9;
                        i75 = i12;
                        spannableString5 = spannableString;
                        iM11309 = i11;
                        i79 = i8;
                        sArr4 = sArr;
                        i77 = i10;
                        i83 = i6;
                        i70 = i29;
                        editText5 = editText;
                        iM6360 = i5;
                        iM113011 = i7;
                        i69 = i27;
                        int i86 = i15;
                        i81 = i14;
                        i72 = i13;
                        i80 = i16;
                        view7 = view2;
                        str4 = str;
                        length = i86;
                    }
                    break;
                case -2013009339:
                case -976722502:
                    if (C0278.f1572 <= 0) {
                        i = i83;
                        i30 = iM113011;
                        editText2 = editText5;
                        i31 = i79;
                        spannableString3 = spannableString5;
                        i35 = i77;
                        i38 = i80;
                        sArr2 = sArr4;
                        i32 = i72;
                        i36 = iM11309;
                        i33 = i81;
                        i34 = length;
                        str3 = str4;
                        int iM450221 = (i67 - C19806.m45029("᩶۠")) * (-125);
                        int i87 = ((iM450221 ^ i68) * 23395) ^ 954841331;
                        i37 = iM450221 ^ 1897473488;
                        str4 = str3;
                        length = i34;
                        iM11309 = i36;
                        i81 = i33;
                        sArr4 = sArr2;
                        i77 = i35;
                        i72 = i32;
                        i80 = i38;
                        editText5 = editText2;
                        spannableString5 = spannableString3;
                        iM113011 = i30;
                        i69 = i87;
                        i79 = i31;
                        i83 = i;
                        i70 = i37;
                        iM6360 = iM6360;
                    } else {
                        i5 = iM6360;
                        i6 = i83;
                        i7 = iM113011;
                        editText = editText5;
                        i8 = i79;
                        spannableString = spannableString5;
                        i9 = i76;
                        i10 = i77;
                        sArr = sArr4;
                        i11 = iM11309;
                        str2 = strM3747;
                        i12 = i75;
                        textInputLayout2 = textInputLayout4;
                        view4 = view6;
                        int i88 = i80;
                        i13 = i72;
                        i14 = i81;
                        i15 = length;
                        str = str4;
                        view2 = view7;
                        i16 = i88;
                        iM11307 = (i67 - C19806.m45029("ۖܳ")) * 11;
                        i27 = ((iM11307 ^ i68) * 30739) ^ (-75705503);
                        i28 = -1648417149;
                        i29 = iM11307 ^ i28;
                        view6 = view4;
                        textInputLayout4 = textInputLayout2;
                        strM3747 = str2;
                        i76 = i9;
                        i75 = i12;
                        spannableString5 = spannableString;
                        iM11309 = i11;
                        i79 = i8;
                        sArr4 = sArr;
                        i77 = i10;
                        i83 = i6;
                        i70 = i29;
                        editText5 = editText;
                        iM6360 = i5;
                        iM113011 = i7;
                        i69 = i27;
                        int i89 = i15;
                        i81 = i14;
                        i72 = i13;
                        i80 = i16;
                        view7 = view2;
                        str4 = str;
                        length = i89;
                    }
                    break;
                case -1883870549:
                case 1970826719:
                    int i90 = iM6360;
                    i20 = i83;
                    i21 = i79;
                    int i91 = i80;
                    spannableString2 = spannableString5;
                    int i92 = i72;
                    int i93 = i81;
                    int i94 = length;
                    short[] sArr5 = sArr4;
                    iM113010 = ThreadFactoryC3888.m11306(C0671.m3009(sArr5, 512, 3, i73)) ^ 2120482631;
                    iM11309 = ThreadFactoryC3888.m11306(C1937.m6288(f76464, 515, 3, i73)) ^ 2127267754;
                    strM3747 = C0962.m3747(f76464, 518, 14, i73);
                    int i95 = iM113012;
                    if (i71 == i95) {
                        iM450215 = (C19806.m45029("ܽۙ") + i67) * (-81);
                        i62 = ((iM450215 ^ i68) * 21557) ^ 1210471627;
                        i63 = -296049708;
                    } else {
                        iM450215 = C19806.m45029("ܶۗ") ^ i68;
                        i62 = ((iM450215 ^ i67) * 5535) ^ 432306418;
                        i63 = 754684609;
                    }
                    i24 = iM450215 ^ i63;
                    iM113012 = i95;
                    sArr4 = sArr5;
                    i69 = i62;
                    length = i94;
                    iM6360 = i90;
                    i81 = i93;
                    i72 = i92;
                    i80 = i91;
                    i61 = i20;
                    i70 = i24;
                    spannableString5 = spannableString2;
                    i79 = i21;
                    i83 = i61;
                    break;
                case -1880820890:
                case -574980123:
                    iM6360 = iM6360;
                    length = length;
                    int i96 = i83;
                    textInputLayout4 = textInputLayout4;
                    view8 = view8;
                    textInputLayout3 = textInputLayout3;
                    view6 = view6;
                    View view10 = view7;
                    EditText editText7 = editText5;
                    i79 = i79;
                    int i97 = i80;
                    spannableString5 = spannableString5;
                    int i98 = i72;
                    i77 = i77;
                    sArr4 = sArr4;
                    iM11309 = iM11309;
                    int i99 = i76;
                    String str5 = strM3747;
                    EditText editText8 = editText4;
                    int iM113015 = ThreadFactoryC3888.m11306(C7105.m18989(f76464, Scalar448.TARGET_LENGTH, 3, i73)) ^ 2098129979;
                    iM113011 = ThreadFactoryC3888.m11306(C0526.m2424(f76464, Ed448.PRECOMP_RANGE, 3, i73)) ^ 2101272418;
                    String strM9869 = ViewTreeObserverOnPreDrawListenerC3327.m9869(f76464, 453, 17, i73);
                    i82 = i82;
                    if (i71 == i82) {
                        int iM450222 = (C19806.m45029("ۜ֫") ^ i68) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i69 = ((iM450222 ^ i67) * (-22695)) ^ 1917631614;
                        i75 = iM113015;
                        i81 = 0;
                        i83 = i96;
                        i70 = iM450222 ^ (-1300792420);
                        editText5 = editText7;
                    } else {
                        int iM450223 = C19806.m45029("֫ۙ") ^ i68;
                        i75 = iM113015;
                        i81 = 0;
                        i70 = iM450223 ^ 234831078;
                        i69 = ((iM450223 ^ i67) * (-53)) ^ (-603545899);
                        editText5 = editText7;
                        i83 = i96;
                    }
                    str4 = strM9869;
                    i72 = i98;
                    i80 = i97;
                    view7 = view10;
                    editText4 = editText8;
                    strM3747 = str5;
                    i76 = i99;
                    break;
                case -1786382156:
                case 2021798067:
                    i5 = iM6360;
                    i6 = i83;
                    i7 = iM113011;
                    editText = editText5;
                    i8 = i79;
                    spannableString = spannableString5;
                    i9 = i76;
                    i10 = i77;
                    sArr = sArr4;
                    i11 = iM11309;
                    str2 = strM3747;
                    i12 = i75;
                    textInputLayout2 = textInputLayout4;
                    view4 = view6;
                    int i100 = i80;
                    i13 = i72;
                    i14 = i81;
                    i15 = length;
                    str = str4;
                    view2 = view7;
                    i16 = i100;
                    if (C1709.m5683()) {
                        iM11307 = C19806.m45029("ܿۤ") ^ i68;
                        i27 = ((iM11307 ^ i67) * (-24419)) ^ 1188821701;
                        i28 = -1452323464;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("᩶ۘ") ^ i67;
                        i27 = ((iM11307 ^ i68) * 17191) ^ (-1021432268);
                        i28 = -1859660519;
                    }
                    i29 = iM11307 ^ i28;
                    view6 = view4;
                    textInputLayout4 = textInputLayout2;
                    strM3747 = str2;
                    i76 = i9;
                    i75 = i12;
                    spannableString5 = spannableString;
                    iM11309 = i11;
                    i79 = i8;
                    sArr4 = sArr;
                    i77 = i10;
                    i83 = i6;
                    i70 = i29;
                    editText5 = editText;
                    iM6360 = i5;
                    iM113011 = i7;
                    i69 = i27;
                    int i810 = i15;
                    i81 = i14;
                    i72 = i13;
                    i80 = i16;
                    view7 = view2;
                    str4 = str;
                    length = i810;
                    break;
                case -1778946149:
                case 119053489:
                    C8067 c8067M5358 = RunnableC1564.m5356(this);
                    String strM3412 = C0817.m3412(this, iM11309);
                    C1937.m6286(strM3412, strM3747);
                    String strM6690 = C2124.m6690(this, iM113010);
                    C7105.m18988(strM6690, strM3747);
                    CharSequence[] charSequenceArr = new CharSequence[i74];
                    charSequenceArr[i81] = strM3412;
                    charSequenceArr[i80] = strM6690;
                    c8067M5358.m21267(charSequenceArr, new DialogInterface.OnClickListener() { // from class: l.᩸ۡ᩺

                        /* JADX INFO: renamed from: ᩷᩹ܶ, reason: not valid java name and contains not printable characters */
                        private static final short[] f69812 = {2467, -29787, 25170, 29892, -30870, -21347, -25832, -22643, -30366, -29446, -32162, -27308, -26179, -25357, -22632, -30540, 25247, 29222, -31898};

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i101) {
                            int iM450224;
                            int i102;
                            int i103;
                            int iM113016;
                            int i104;
                            int i105;
                            int iM450225;
                            int i106;
                            int i107;
                            int i108 = C0050.f912;
                            int i109 = C3722.f13525;
                            int iM450226 = (i108 - C19806.m45029("ܺۙ")) * (-17);
                            int i110 = ((iM450226 ^ i109) * 24995) ^ (-1048516898);
                            C8067 c8067M5359 = null;
                            String strM2308 = null;
                            short[] sArr6 = null;
                            short[] sArr7 = null;
                            int i111 = iM450226 ^ 934775443;
                            DialogInterfaceOnClickListenerC2627 dialogInterfaceOnClickListenerC2627 = null;
                            int iM450227 = 0;
                            int iM113017 = 0;
                            int i112 = 0;
                            int iM113018 = 0;
                            short s = 0;
                            short s2 = 0;
                            int i113 = 0;
                            int i114 = 1208687425;
                            Runnable runnable = null;
                            ViewOnClickListenerC23604 viewOnClickListenerC23604 = null;
                            while (true) {
                                i114 = i111 ^ (i110 & (((i114 ^ i109) * (-2863)) >> 31));
                                switch (i114) {
                                    case -2077462345:
                                    case -1535064492:
                                        iM113017 = ThreadFactoryC3888.m11306(C1668.m5577(sArr7, 7, 3, i113));
                                        i112 = 2122153905;
                                        if (AbstractC0464.f2088 > 0) {
                                            iM113016 = (C19806.m45029("ᩳ᩵") + i109) * 23;
                                            i104 = ((iM113016 ^ i108) * (-6883)) ^ 115109674;
                                            i105 = -1104546953;
                                            i111 = iM113016 ^ i105;
                                            i110 = i104;
                                        }
                                        dialogInterfaceOnClickListenerC2627 = dialogInterfaceOnClickListenerC2627;
                                        int iM113019 = ThreadFactoryC3888.m11306("ܿ᩻") ^ i109;
                                        i104 = ((iM113019 ^ i108) * (-2391)) ^ (-492447374);
                                        dialogInterfaceOnClickListenerC2627 = dialogInterfaceOnClickListenerC2627;
                                        i111 = iM113019 ^ (-860500753);
                                        i110 = i104;
                                        break;
                                    case -1922941004:
                                    case 429927596:
                                        int iM450228 = C19806.m45029(C1977.m6363(f69812, 1, 3, i113));
                                        if (C1419.f5860 < 0) {
                                            C17485 c17485 = new C17485(viewOnClickListenerC23604, iM450228 ^ 2125300858);
                                            C0797.m3354(c17485);
                                            c17485.m40697(runnable);
                                            C14411.m34676(new C20076(c17485, viewOnClickListenerC23604), viewOnClickListenerC23604);
                                        }
                                        iM450225 = (i108 - C19806.m45029("۬ᩳ")) * 71;
                                        i106 = ((iM450225 ^ i109) * 31337) ^ (-1700530660);
                                        i107 = 110873107;
                                        int i115 = iM450225 ^ i107;
                                        c8067M5359 = c8067M5359;
                                        DialogInterfaceOnClickListenerC2627 dialogInterfaceOnClickListenerC2628 = dialogInterfaceOnClickListenerC2627;
                                        i111 = i115;
                                        i110 = i106;
                                        dialogInterfaceOnClickListenerC2627 = dialogInterfaceOnClickListenerC2628;
                                        break;
                                    case -1794829129:
                                    case -1288731909:
                                        C1460.m5055(c8067M5359, C19806.m45029(strM2308) ^ 2127354464, dialogInterfaceOnClickListenerC2627);
                                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                                            iM113016 = ThreadFactoryC3888.m11306("ܽۖ") ^ i109;
                                            i104 = ((iM113016 ^ i108) * 24851) ^ (-788379243);
                                            i105 = -1832448478;
                                            i111 = iM113016 ^ i105;
                                            i110 = i104;
                                        }
                                        dialogInterfaceOnClickListenerC2627 = dialogInterfaceOnClickListenerC2627;
                                        int iM1130110 = ThreadFactoryC3888.m11306("ܿ᩻") ^ i109;
                                        i104 = ((iM1130110 ^ i108) * (-2391)) ^ (-492447374);
                                        dialogInterfaceOnClickListenerC2627 = dialogInterfaceOnClickListenerC2627;
                                        i111 = iM1130110 ^ (-860500753);
                                        i110 = i104;
                                        break;
                                    case -1550773994:
                                    case 230379600:
                                        C1377.m4833();
                                        if (C1460.m5050() != 0) {
                                            iM450225 = (i108 - C19806.m45029("۬ᩳ")) * 71;
                                            i106 = ((iM450225 ^ i109) * 31337) ^ (-1700530660);
                                            i107 = 110873107;
                                            int i116 = iM450225 ^ i107;
                                            c8067M5359 = c8067M5359;
                                            DialogInterfaceOnClickListenerC2627 dialogInterfaceOnClickListenerC2629 = dialogInterfaceOnClickListenerC2627;
                                            i111 = i116;
                                            i110 = i106;
                                            dialogInterfaceOnClickListenerC2627 = dialogInterfaceOnClickListenerC2629;
                                        } else {
                                            dialogInterfaceOnClickListenerC2627 = dialogInterfaceOnClickListenerC2627;
                                            int iM1130111 = ThreadFactoryC3888.m11306("ܿ᩻") ^ i109;
                                            i104 = ((iM1130111 ^ i108) * (-2391)) ^ (-492447374);
                                            dialogInterfaceOnClickListenerC2627 = dialogInterfaceOnClickListenerC2627;
                                            i111 = iM1130111 ^ (-860500753);
                                            i110 = i104;
                                        }
                                        break;
                                    case -1524063136:
                                    case 333363793:
                                        C2788.m8472();
                                        if (C3722.f13525 > 0) {
                                            iM113016 = (C19806.m45029("ۨ᩶") ^ i108) * (-111);
                                            i104 = ((iM113016 ^ i109) * (-21181)) ^ (-1919978148);
                                            i105 = 1130688884;
                                            i111 = iM113016 ^ i105;
                                            i110 = i104;
                                        }
                                        dialogInterfaceOnClickListenerC2627 = dialogInterfaceOnClickListenerC2627;
                                        int iM1130112 = ThreadFactoryC3888.m11306("ܿ᩻") ^ i109;
                                        i104 = ((iM1130112 ^ i108) * (-2391)) ^ (-492447374);
                                        dialogInterfaceOnClickListenerC2627 = dialogInterfaceOnClickListenerC2627;
                                        i111 = iM1130112 ^ (-860500753);
                                        i110 = i104;
                                        break;
                                    case -1513341706:
                                    case -83280913:
                                        dialogInterfaceOnClickListenerC2627 = dialogInterfaceOnClickListenerC2627;
                                        c8067M5359 = c8067M5359;
                                        int i117 = s + s2;
                                        int i118 = (s * s) + 53158681;
                                        if ((i118 + i118) - (i117 * i117) < 0) {
                                            iM450224 = ThreadFactoryC3888.m11306("ۙܿ") ^ i109;
                                            i102 = ((iM450224 ^ i108) * 13833) ^ 22347450;
                                            i103 = -617041022;
                                        } else {
                                            iM450224 = (i108 - ThreadFactoryC3888.m11306("ۢ᩶")) * (-105);
                                            i102 = ((iM450224 ^ i109) * (-29269)) ^ 46924682;
                                            i103 = -669036574;
                                        }
                                        dialogInterfaceOnClickListenerC2627 = dialogInterfaceOnClickListenerC2627;
                                        i111 = iM450224 ^ i103;
                                        i110 = i102;
                                        c8067M5359 = c8067M5359;
                                        break;
                                    case -1504576428:
                                    case -1212555583:
                                        iM113018 = ThreadFactoryC3888.m11306(C0050.m940(f69812, 13, 3, i113));
                                        if (C2871.f10837 < 0) {
                                            iM113016 = ThreadFactoryC3888.m11306("֡᩻") ^ i108;
                                            i104 = ((iM113016 ^ i109) * (-21499)) ^ 1617084194;
                                            i105 = -1150336425;
                                            i111 = iM113016 ^ i105;
                                            i110 = i104;
                                        } else {
                                            int iM113020 = (i109 - ThreadFactoryC3888.m11306("ۧ᩻")) * 59;
                                            i111 = iM113020 ^ 116904162;
                                            i110 = ((iM113020 ^ i108) * 19455) ^ (-1535852370);
                                            dialogInterfaceOnClickListenerC2627 = null;
                                        }
                                        break;
                                    case -1311986349:
                                    case 372899427:
                                        dialogInterfaceOnClickListenerC2627 = dialogInterfaceOnClickListenerC2627;
                                        c8067M5359 = c8067M5359;
                                        int i119 = ViewOnClickListenerC23604.f76463;
                                        viewOnClickListenerC23604 = this.f69813;
                                        runnable = null;
                                        if (i101 == 0) {
                                            iM450224 = (i109 - C19806.m45029("ۨᩴ")) * 91;
                                            i102 = ((iM450224 ^ i108) * 7623) ^ (-1817611721);
                                            i103 = -555063538;
                                        } else {
                                            iM450224 = C19806.m45029("ۤۤ") ^ i109;
                                            i102 = ((iM450224 ^ i108) * (-597)) ^ 1138102199;
                                            i103 = 1488367194;
                                        }
                                        dialogInterfaceOnClickListenerC2627 = dialogInterfaceOnClickListenerC2627;
                                        i111 = iM450224 ^ i103;
                                        i110 = i102;
                                        c8067M5359 = c8067M5359;
                                        break;
                                    case -1158104887:
                                    case 1463575136:
                                        if (!C0526.f2219) {
                                            dialogInterfaceOnClickListenerC2627 = dialogInterfaceOnClickListenerC2627;
                                            c8067M5359 = c8067M5359;
                                            iM450224 = (ThreadFactoryC3888.m11306("ۗ֨") + i109) * (-113);
                                            i102 = ((iM450224 ^ i108) * (-10257)) ^ (-1793461732);
                                            i103 = -780644173;
                                            dialogInterfaceOnClickListenerC2627 = dialogInterfaceOnClickListenerC2627;
                                            i111 = iM450224 ^ i103;
                                            i110 = i102;
                                            c8067M5359 = c8067M5359;
                                        } else {
                                            iM450225 = (i108 - C19806.m45029("۬ᩳ")) * 71;
                                            i106 = ((iM450225 ^ i109) * 31337) ^ (-1700530660);
                                            i107 = 110873107;
                                            int i1110 = iM450225 ^ i107;
                                            c8067M5359 = c8067M5359;
                                            DialogInterfaceOnClickListenerC2627 dialogInterfaceOnClickListenerC26210 = dialogInterfaceOnClickListenerC2627;
                                            i111 = i1110;
                                            i110 = i106;
                                            dialogInterfaceOnClickListenerC2627 = dialogInterfaceOnClickListenerC26210;
                                        }
                                        break;
                                    case -1049398608:
                                    case 452358203:
                                        i113 = 63917;
                                        iM450224 = ThreadFactoryC3888.m11306("֡ۨ") ^ i108;
                                        i102 = ((iM450224 ^ i109) * 32603) ^ (-1920200870);
                                        i103 = 1511248615;
                                        dialogInterfaceOnClickListenerC2627 = dialogInterfaceOnClickListenerC2627;
                                        i111 = iM450224 ^ i103;
                                        i110 = i102;
                                        c8067M5359 = c8067M5359;
                                        break;
                                    case -963865041:
                                    case 1517303555:
                                        dialogInterfaceOnClickListenerC2627 = dialogInterfaceOnClickListenerC2627;
                                        c8067M5359 = c8067M5359;
                                        sArr6 = f69812;
                                        if (C3722.m10894() <= 0) {
                                            iM450224 = (ThreadFactoryC3888.m11306("ۗ֨") + i109) * (-113);
                                            i102 = ((iM450224 ^ i108) * (-10257)) ^ (-1793461732);
                                            i103 = -780644173;
                                        } else {
                                            iM450224 = ThreadFactoryC3888.m11306("᩹ۡ") ^ i109;
                                            i102 = ((iM450224 ^ i108) * (-23429)) ^ (-1340235977);
                                            i103 = 1756572913;
                                        }
                                        dialogInterfaceOnClickListenerC2627 = dialogInterfaceOnClickListenerC2627;
                                        i111 = iM450224 ^ i103;
                                        i110 = i102;
                                        c8067M5359 = c8067M5359;
                                        break;
                                    case -875976285:
                                    case -146468018:
                                        C10634.m26830(c8067M5359, 2124045884 ^ iM113018, runnable);
                                        CallableC1627.m5514(c8067M5359);
                                        break;
                                    case -560271457:
                                    case 1305354403:
                                        dialogInterfaceOnClickListenerC2627 = dialogInterfaceOnClickListenerC2627;
                                        c8067M5359 = c8067M5359;
                                        s = sArr6[0];
                                        s2 = 7291;
                                        if (C3722.f13525 > 0) {
                                            iM450224 = (C19806.m45029("᩸ᩳ") + i108) * (-103);
                                            i102 = ((iM450224 ^ i109) * (-3505)) ^ (-1298324011);
                                            i103 = -62164392;
                                            dialogInterfaceOnClickListenerC2627 = dialogInterfaceOnClickListenerC2627;
                                            i111 = iM450224 ^ i103;
                                            i110 = i102;
                                            c8067M5359 = c8067M5359;
                                        } else {
                                            c8067M5359 = c8067M5359;
                                            int iM1130113 = ThreadFactoryC3888.m11306("ܿ᩻") ^ i109;
                                            i104 = ((iM1130113 ^ i108) * (-2391)) ^ (-492447374);
                                            dialogInterfaceOnClickListenerC2627 = dialogInterfaceOnClickListenerC2627;
                                            i111 = iM1130113 ^ (-860500753);
                                            i110 = i104;
                                        }
                                        break;
                                    case -527762413:
                                    case 1893942130:
                                        C1148.m4224(c8067M5359, iM113017 ^ i112);
                                        int i120 = 4;
                                        if (C1668.f6641 < 0) {
                                            dialogInterfaceOnClickListenerC2627 = new DialogInterfaceOnClickListenerC2627(i120, viewOnClickListenerC23604);
                                            strM2308 = AbstractC0464.m2308(f69812, 10, 3, i113);
                                            if (C1377.f5749) {
                                                iM113016 = C19806.m45029("ۡܺ") ^ i108;
                                                i104 = ((iM113016 ^ i109) * (-32191)) ^ 136254476;
                                                i105 = -651210451;
                                                i111 = iM113016 ^ i105;
                                                i110 = i104;
                                                break;
                                            }
                                        }
                                        int iM113021 = (i109 - ThreadFactoryC3888.m11306("ۧ᩻")) * 59;
                                        i111 = iM113021 ^ 116904162;
                                        i110 = ((iM113021 ^ i108) * 19455) ^ (-1535852370);
                                        dialogInterfaceOnClickListenerC2627 = null;
                                        break;
                                    case -398953153:
                                    case 2106000270:
                                        C1668.m5582(C19806.m45029(C1668.m5577(f69812, 16, 3, i113)) ^ 2101738600);
                                        break;
                                    case -372572119:
                                    case 909515318:
                                        C2124.m6673();
                                        MenuItemOnMenuItemClickListenerC3244.m9701();
                                        break;
                                    case -342872059:
                                    case 420880151:
                                        C1875.m6086();
                                        dialogInterfaceOnClickListenerC2627 = dialogInterfaceOnClickListenerC2627;
                                        int iM1130114 = ThreadFactoryC3888.m11306("ܿ᩻") ^ i109;
                                        i104 = ((iM1130114 ^ i108) * (-2391)) ^ (-492447374);
                                        dialogInterfaceOnClickListenerC2627 = dialogInterfaceOnClickListenerC2627;
                                        i111 = iM1130114 ^ (-860500753);
                                        i110 = i104;
                                        break;
                                    case -28942370:
                                    case 2078067923:
                                        i113 = 24048;
                                        iM450224 = ThreadFactoryC3888.m11306("֡ۨ") ^ i108;
                                        i102 = ((iM450224 ^ i109) * 32603) ^ (-1920200870);
                                        i103 = 1511248615;
                                        dialogInterfaceOnClickListenerC2627 = dialogInterfaceOnClickListenerC2627;
                                        i111 = iM450224 ^ i103;
                                        i110 = i102;
                                        c8067M5359 = c8067M5359;
                                        break;
                                    case 4247023:
                                    case 661156102:
                                        C0050.m933(c8067M5359, 2129958903 ^ iM450227);
                                        sArr7 = f69812;
                                        if (RunnableC1606.f6488 < 0) {
                                            iM113016 = (i108 - ThreadFactoryC3888.m11306("ۛۜ")) * (-15);
                                            i104 = ((iM113016 ^ i109) * 15339) ^ (-666292981);
                                            i105 = 755830838;
                                            i111 = iM113016 ^ i105;
                                            i110 = i104;
                                        } else {
                                            int iM113022 = (i109 - ThreadFactoryC3888.m11306("ۧ᩻")) * 59;
                                            i111 = iM113022 ^ 116904162;
                                            i110 = ((iM113022 ^ i108) * 19455) ^ (-1535852370);
                                            dialogInterfaceOnClickListenerC2627 = null;
                                        }
                                        break;
                                    case 1611545636:
                                    case 2110276864:
                                        dialogInterfaceOnClickListenerC2627 = dialogInterfaceOnClickListenerC2627;
                                        c8067M5359 = c8067M5359;
                                        if (C1709.m5688()) {
                                            iM450225 = (C19806.m45029("᩷֡") + i108) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                            i106 = ((iM450225 ^ i109) * (-15283)) ^ (-874446842);
                                            i107 = -1897518260;
                                        } else {
                                            iM450225 = C19806.m45029("۟᩹") ^ i108;
                                            i106 = ((iM450225 ^ i109) * (-12583)) ^ 1175670138;
                                            i107 = 833451287;
                                        }
                                        int i1111 = iM450225 ^ i107;
                                        c8067M5359 = c8067M5359;
                                        DialogInterfaceOnClickListenerC2627 dialogInterfaceOnClickListenerC26211 = dialogInterfaceOnClickListenerC2627;
                                        i111 = i1111;
                                        i110 = i106;
                                        dialogInterfaceOnClickListenerC2627 = dialogInterfaceOnClickListenerC26211;
                                        break;
                                    default:
                                        c8067M5359 = RunnableC1564.m5356(viewOnClickListenerC23604);
                                        iM450227 = C19806.m45029(C0216.m1588(f69812, 4, 3, i113));
                                        if (C10634.f36300 < 0) {
                                            iM113016 = (ThreadFactoryC3888.m11306("᩶ᩳ") ^ i109) * (-23);
                                            i104 = ((iM113016 ^ i108) * (-3427)) ^ (-285803899);
                                            i105 = -1577395632;
                                            i111 = iM113016 ^ i105;
                                            i110 = i104;
                                        }
                                        dialogInterfaceOnClickListenerC2627 = dialogInterfaceOnClickListenerC2627;
                                        int iM1130115 = ThreadFactoryC3888.m11306("ܿ᩻") ^ i109;
                                        i104 = ((iM1130115 ^ i108) * (-2391)) ^ (-492447374);
                                        dialogInterfaceOnClickListenerC2627 = dialogInterfaceOnClickListenerC2627;
                                        i111 = iM1130115 ^ (-860500753);
                                        i110 = i104;
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    C2704.m8239(c8067M5358);
                    break;
                case -1768034008:
                case -1072653815:
                    i41 = iM6360;
                    i42 = i83;
                    i43 = iM113011;
                    i44 = i79;
                    int i101 = i80;
                    spannableString4 = spannableString5;
                    i45 = i72;
                    view5 = view7;
                    i46 = i81;
                    i47 = length;
                    int i102 = i77;
                    editText3 = (EditText) C3743.m10957(view5, i102);
                    sArr3 = sArr4;
                    i48 = i102;
                    i49 = i101;
                    editText5 = (EditText) C2642.m8167(view5, C19806.m45029(C1419.m4969(f76464, 497, 3, i73)) ^ 2123594626);
                    C19328.m44316(textInputLayout5);
                    C19328.m44316(textInputLayout6);
                    c8067M5356 = RunnableC1564.m5356(this);
                    C1977.m6349(c8067M5356, view5);
                    c8067M5356.m21257(new DialogInterface.OnDismissListener() { // from class: l.ܺ᩵᩺
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            ViewOnClickListenerC23604.m52065(this.f52213);
                        }
                    });
                    if (C3743.m10966() <= 0) {
                        iM450214 = (ThreadFactoryC3888.m11306("᩻ܺ") + i68) * (-5);
                        i50 = ((iM450214 ^ i67) * (-11065)) ^ 727248098;
                        i51 = -1467134833;
                    } else {
                        iM450214 = (C19806.m45029("᩵᩹") ^ i68) * (-123);
                        i50 = ((iM450214 ^ i67) * 5371) ^ 577846124;
                        i51 = 1220812474;
                    }
                    int i103 = iM450214 ^ i51;
                    iM113011 = i43;
                    i69 = i50;
                    sArr4 = sArr3;
                    i77 = i48;
                    c8067 = c8067M5356;
                    iM6360 = i41;
                    int i104 = i49;
                    view7 = view5;
                    spannableString5 = spannableString4;
                    i79 = i44;
                    i83 = i42;
                    i70 = i103;
                    length = i47;
                    i81 = i46;
                    i72 = i45;
                    i80 = i104;
                    break;
                case -1767723699:
                case 294036339:
                    C1419.m4977(this, new Intent(this, (Class<?>) ActivityC23892.class));
                    break;
                case -1760604329:
                case 1933474768:
                    i52 = iM6360;
                    i53 = i83;
                    i21 = i79;
                    i54 = i80;
                    spannableString2 = spannableString5;
                    i55 = i72;
                    i56 = i81;
                    i57 = length;
                    if (C1709.m5684().containsKey(AbstractC0464.m2308(f76464, 535, 2, i73))) {
                        iM450216 = C19806.m45029("ۙۛ") ^ i68;
                        i58 = ((iM450216 ^ i67) * (-3107)) ^ (-301724898);
                        i64 = -1487797290;
                    } else {
                        iM450216 = (i67 - C19806.m45029("ۨܳ")) * (-91);
                        i58 = ((iM450216 ^ i68) * (-16239)) ^ 1574678623;
                        i64 = -958256862;
                    }
                    i60 = iM450216 ^ i64;
                    length = i57;
                    iM6360 = i52;
                    i81 = i56;
                    i72 = i55;
                    i80 = i54;
                    i61 = i53;
                    i70 = i60;
                    i69 = i58;
                    spannableString5 = spannableString2;
                    i79 = i21;
                    i83 = i61;
                    break;
                case -1695302703:
                case -632277646:
                    i5 = iM6360;
                    i6 = i83;
                    i7 = iM113011;
                    editText = editText5;
                    i8 = i79;
                    spannableString = spannableString5;
                    i9 = i76;
                    i10 = i77;
                    sArr = sArr4;
                    i11 = iM11309;
                    str2 = strM3747;
                    i12 = i75;
                    textInputLayout2 = textInputLayout4;
                    view4 = view6;
                    int i105 = i80;
                    i13 = i72;
                    i14 = i81;
                    i15 = length;
                    str = str4;
                    view2 = view7;
                    i16 = i105;
                    if (i71 == (C19806.m45029(C1460.m5047(f76464, 476, 3, i73)) ^ 2128317553)) {
                        iM11307 = C19806.m45029("ܺܽ") ^ i68;
                        i27 = ((iM11307 ^ i67) * 29885) ^ 1363860566;
                        i28 = 405140085;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ۘۤ") ^ i67) * 109;
                        i27 = ((iM11307 ^ i68) * (-12957)) ^ 1201320246;
                        i28 = 921368108;
                    }
                    i29 = iM11307 ^ i28;
                    view6 = view4;
                    textInputLayout4 = textInputLayout2;
                    strM3747 = str2;
                    i76 = i9;
                    i75 = i12;
                    spannableString5 = spannableString;
                    iM11309 = i11;
                    i79 = i8;
                    sArr4 = sArr;
                    i77 = i10;
                    i83 = i6;
                    i70 = i29;
                    editText5 = editText;
                    iM6360 = i5;
                    iM113011 = i7;
                    i69 = i27;
                    int i811 = i15;
                    i81 = i14;
                    i72 = i13;
                    i80 = i16;
                    view7 = view2;
                    str4 = str;
                    length = i811;
                    break;
                case -1676147855:
                case -124821907:
                    i17 = i76;
                    i73 = 43913;
                    iM450211 = ThreadFactoryC3888.m11306("ܰۜ") ^ i68;
                    i18 = ((iM450211 ^ i67) * 3657) ^ 446932025;
                    i19 = 262900584;
                    int i106 = iM450211 ^ i19;
                    view6 = view6;
                    textInputLayout4 = textInputLayout4;
                    spannableString5 = spannableString5;
                    i75 = i75;
                    i79 = i79;
                    i83 = i83;
                    iM11309 = iM11309;
                    i70 = i106;
                    i69 = i18;
                    sArr4 = sArr4;
                    i77 = i77;
                    i72 = i72;
                    i80 = i80;
                    editText5 = editText5;
                    iM113011 = iM113011;
                    view7 = view7;
                    str4 = str4;
                    view8 = view8;
                    length = length;
                    i81 = i81;
                    textInputLayout3 = textInputLayout3;
                    iM6360 = iM6360;
                    int i107 = i17;
                    editText4 = editText4;
                    strM3747 = strM3747;
                    i76 = i107;
                    break;
                case -1632267003:
                case -1005317895:
                    if (C3577.f13150 < 0) {
                        iM450210 = (C19806.m45029("ܳۨ") ^ i68) * 75;
                        i2 = ((iM450210 ^ i67) * (-25669)) ^ (-139484345);
                        i4 = 1083821183;
                        i70 = iM450210 ^ i4;
                        i69 = i2;
                    } else {
                        i41 = iM6360;
                        i42 = i83;
                        c8067M5356 = c8067;
                        i48 = i77;
                        i43 = iM113011;
                        i44 = i79;
                        sArr3 = sArr4;
                        spannableString4 = spannableString5;
                        view5 = view7;
                        i49 = i80;
                        i45 = i72;
                        i46 = i81;
                        i47 = length;
                        iM450214 = (ThreadFactoryC3888.m11306("᩻ܺ") + i68) * (-5);
                        i50 = ((iM450214 ^ i67) * (-11065)) ^ 727248098;
                        i51 = -1467134833;
                        int i108 = iM450214 ^ i51;
                        iM113011 = i43;
                        i69 = i50;
                        sArr4 = sArr3;
                        i77 = i48;
                        c8067 = c8067M5356;
                        iM6360 = i41;
                        int i109 = i49;
                        view7 = view5;
                        spannableString5 = spannableString4;
                        i79 = i44;
                        i83 = i42;
                        i70 = i108;
                        length = i47;
                        i81 = i46;
                        i72 = i45;
                        i80 = i109;
                    }
                    break;
                case -1629562259:
                case 1022851948:
                    i52 = iM6360;
                    i53 = i83;
                    i21 = i79;
                    i54 = i80;
                    short[] sArr6 = sArr4;
                    spannableString2 = spannableString5;
                    i55 = i72;
                    i56 = i81;
                    i57 = length;
                    if (i71 == (C19806.m45029(C2788.m8470(f76464, 503, 3, i73)) ^ 2103979426)) {
                        iM11308 = ThreadFactoryC3888.m11306("ܿ֫") ^ i67;
                        i58 = ((iM11308 ^ i68) * 4457) ^ (-2017306441);
                        i59 = 1466080233;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("ܿ֨") ^ i67;
                        i58 = ((iM11308 ^ i68) * 24427) ^ (-645784500);
                        i59 = 106061518;
                    }
                    i60 = iM11308 ^ i59;
                    sArr4 = sArr6;
                    length = i57;
                    iM6360 = i52;
                    i81 = i56;
                    i72 = i55;
                    i80 = i54;
                    i61 = i53;
                    i70 = i60;
                    i69 = i58;
                    spannableString5 = spannableString2;
                    i79 = i21;
                    i83 = i61;
                    break;
                case -1590389784:
                case 342151339:
                    String strM6691 = C2124.m6690(this, C19806.m45029(C1066.m4040(f76464, 572, 3, i73)) ^ 2104689886);
                    int iM2304 = AbstractC0464.m2304(6.0f);
                    String[] strArrM5056 = C1460.m5056(C0817.m3407(strM6691), RunnableC3388.m10056(f76464, 575, 1, i73));
                    SpannableString spannableString6 = new SpannableString(C6851.m18460(strArrM5056));
                    length = strArrM5056.length;
                    strArr = strArrM5056;
                    i83 = iM2304;
                    spannableString5 = spannableString6;
                    i72 = i81;
                    i78 = 0;
                    iM450210 = (C19806.m45029("ۨ۟") + i67) * (-45);
                    i2 = ((iM450210 ^ i68) * (-29973)) ^ 237007701;
                    i4 = -1953573755;
                    i70 = iM450210 ^ i4;
                    i69 = i2;
                    break;
                case -1559362127:
                case 557963153:
                    C3722.m10894();
                    iM450210 = (ThreadFactoryC3888.m11306("ܳۗ") ^ i68) * (-127);
                    i2 = ((iM450210 ^ i67) * 24419) ^ (-1478907231);
                    i4 = 1112924492;
                    i70 = iM450210 ^ i4;
                    i69 = i2;
                    break;
                case -1519124835:
                case 833605219:
                    final DialogInterfaceC19356 dialogInterfaceC19356M82310 = C2704.m8239(c8067);
                    C16737.m39290(editText5);
                    View view11 = view7;
                    final EditText editText9 = editText5;
                    C7105.m18993(C2642.m8167(view11, iM113011), new ViewOnClickListenerC20385(i81, this, editText9));
                    View viewM10957 = C3743.m10957(view11, C19806.m45029(RunnableC3388.m10056(f76464, 500, 3, i73)) ^ 2121357428);
                    final EditText editText10 = editText3;
                    final TextInputLayout textInputLayout8 = textInputLayout6;
                    final TextInputLayout textInputLayout9 = textInputLayout5;
                    C7105.m18993(viewM10957, new View.OnClickListener() { // from class: l.֡᩵᩺
                        {
                            int i110 = 1932769984;
                            int i111 = C2249.f8050;
                            int i112 = C0278.f1572;
                            int iM450224 = C19806.m45029("ܰ֨") ^ i111;
                            int i113 = ((iM450224 ^ i112) * 7737) ^ 367452513;
                            int i114 = 643122826;
                            while (true) {
                                i110 = ((((i110 ^ i112) * 2901) >> 31) & i113) ^ (iM450224 ^ i114);
                                switch (i110) {
                                    case -1838731297:
                                    case -1730020942:
                                        if (C2124.m6673() <= 0) {
                                            iM450224 = ThreadFactoryC3888.m11306("᩶᩶") ^ i112;
                                            i113 = ((iM450224 ^ i111) * (-391)) ^ 1368603803;
                                            i114 = -1164026763;
                                        } else {
                                            iM450224 = (ThreadFactoryC3888.m11306("ܽۨ") ^ i111) * 87;
                                            i113 = ((iM450224 ^ i112) * (-27331)) ^ (-1122387115);
                                            i114 = 1326251973;
                                        }
                                        break;
                                    case -1691533565:
                                    case 787356153:
                                        return;
                                    case -1617857261:
                                    case 1552007670:
                                        if (C19806.f63586) {
                                            iM450224 = (i111 - C19806.m45029("۟᩸")) * 11;
                                            i113 = ((iM450224 ^ i112) * o.a.p) ^ 2066338170;
                                            i114 = -1533359404;
                                        } else {
                                            iM450224 = ThreadFactoryC3888.m11306("֫ۗ") ^ i112;
                                            i113 = ((iM450224 ^ i111) * 7651) ^ 1523470286;
                                            i114 = -93764437;
                                        }
                                        break;
                                    case -1558410389:
                                    case 1564916779:
                                        C0526.m2437();
                                        if (RunnableC3388.f12514 >= 0) {
                                            iM450224 = (i111 - C19806.m45029("۟᩸")) * 11;
                                            i113 = ((iM450224 ^ i112) * o.a.p) ^ 2066338170;
                                            i114 = -1533359404;
                                        } else {
                                            iM450224 = ThreadFactoryC3888.m11306("ܽۜ") ^ i112;
                                            i113 = ((iM450224 ^ i111) * (-28803)) ^ (-553703551);
                                            i114 = -507511597;
                                        }
                                        break;
                                    case -1479923775:
                                    case -1477832238:
                                        C2704.m8255();
                                        if (C0671.m3008() >= 0) {
                                            iM450224 = C19806.m45029("ܺ᩶") ^ i111;
                                            i113 = ((iM450224 ^ i112) * 32595) ^ 926991872;
                                            i114 = 1072687559;
                                        } else {
                                            iM450224 = (i112 - C19806.m45029("ᩴۤ")) * 11;
                                            i113 = ((iM450224 ^ i111) * 12829) ^ (-634561622);
                                            i114 = 515842358;
                                        }
                                        break;
                                    case -1344445406:
                                    case -121097817:
                                        if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                                            iM450224 = (i112 - C19806.m45029("ᩴۤ")) * 11;
                                            i113 = ((iM450224 ^ i111) * 12829) ^ (-634561622);
                                            i114 = 515842358;
                                        } else {
                                            iM450224 = (C19806.m45029("ܺۤ") + i112) * 25;
                                            i113 = ((iM450224 ^ i111) * (-3183)) ^ (-611024467);
                                            i114 = -1340401799;
                                        }
                                        break;
                                    case -831930899:
                                    case 1354527223:
                                        if (C1377.f5749) {
                                            iM450224 = (C19806.m45029("ܿ᩺") + i111) * 35;
                                            i113 = ((iM450224 ^ i112) * (-27303)) ^ (-199414092);
                                            i114 = 288864040;
                                        } else {
                                            iM450224 = ThreadFactoryC3888.m11306("ܽۜ") ^ i112;
                                            i113 = ((iM450224 ^ i111) * (-28803)) ^ (-553703551);
                                            i114 = -507511597;
                                        }
                                        break;
                                    case -744907695:
                                    case 605013204:
                                        if (RunnableC3388.m10064()) {
                                            iM450224 = (ThreadFactoryC3888.m11306("ܿܶ") + i111) * 115;
                                            i113 = ((iM450224 ^ i112) * (-15931)) ^ 1254020989;
                                            i114 = -1765990371;
                                        } else {
                                            iM450224 = ThreadFactoryC3888.m11306("᩶᩶") ^ i112;
                                            i113 = ((iM450224 ^ i111) * (-391)) ^ 1368603803;
                                            i114 = -1164026763;
                                        }
                                        break;
                                    case -625398910:
                                    case -417402560:
                                        if (C19806.f63586) {
                                            iM450224 = ThreadFactoryC3888.m11306("ܽۜ") ^ i112;
                                            i113 = ((iM450224 ^ i111) * (-28803)) ^ (-553703551);
                                            i114 = -507511597;
                                        } else {
                                            iM450224 = C19806.m45029("ۡ᩷") ^ i112;
                                            i113 = ((iM450224 ^ i111) * 541) ^ 1045572843;
                                            i114 = -2053761693;
                                        }
                                        break;
                                    case -432606307:
                                    case 1429056524:
                                        if (C0962.f3784) {
                                            iM450224 = (i111 - C19806.m45029("۟᩸")) * 11;
                                            i113 = ((iM450224 ^ i112) * o.a.p) ^ 2066338170;
                                            i114 = -1533359404;
                                        } else {
                                            iM450224 = (i112 - ThreadFactoryC3888.m11306("᩷֨")) * (-105);
                                            i113 = ((iM450224 ^ i111) * (-13105)) ^ 1287460542;
                                            i114 = 941357035;
                                        }
                                        break;
                                    case -316142639:
                                    case -53995381:
                                        C0817.m3399();
                                        C1461.m5080();
                                        throw new RuntimeException();
                                    case -71787921:
                                    case -38138053:
                                        if (C1189.f5284 <= 0) {
                                            iM450224 = C19806.m45029("ܺ᩶") ^ i111;
                                            i113 = ((iM450224 ^ i112) * 32595) ^ 926991872;
                                            i114 = 1072687559;
                                        } else {
                                            iM450224 = (C19806.m45029("ۢ᩹") ^ i111) * 21;
                                            i113 = ((iM450224 ^ i112) * 24065) ^ (-1754718726);
                                            i114 = 820417727;
                                        }
                                        break;
                                    case -7585068:
                                    case 629714248:
                                        if (C1461.f5957 > 0) {
                                            iM450224 = (i112 - C19806.m45029("ᩴۤ")) * 11;
                                            i113 = ((iM450224 ^ i111) * 12829) ^ (-634561622);
                                            i114 = 515842358;
                                        } else {
                                            iM450224 = ThreadFactoryC3888.m11306("ܽۜ") ^ i112;
                                            i113 = ((iM450224 ^ i111) * (-28803)) ^ (-553703551);
                                            i114 = -507511597;
                                        }
                                        break;
                                    case 576690750:
                                    case 1573901628:
                                        if (C0216.f1393 != 0) {
                                            iM450224 = ThreadFactoryC3888.m11306("ܽۜ") ^ i112;
                                            i113 = ((iM450224 ^ i111) * (-28803)) ^ (-553703551);
                                            i114 = -507511597;
                                        } else {
                                            iM450224 = (i111 - C19806.m45029("ۖۜ")) * (-97);
                                            i113 = ((iM450224 ^ i112) * 829) ^ (-1299842998);
                                            i114 = 1242396672;
                                        }
                                        break;
                                    case 966351579:
                                    case 1353643664:
                                        if (C1066.f4915 <= 0) {
                                            iM450224 = (i112 - C19806.m45029("ᩴۤ")) * 11;
                                            i113 = ((iM450224 ^ i111) * 12829) ^ (-634561622);
                                            i114 = 515842358;
                                        } else {
                                            iM450224 = (ThreadFactoryC3888.m11306("ۜᩳ") + i112) * 83;
                                            i113 = ((iM450224 ^ i111) * 15889) ^ 676064775;
                                            i114 = -802403354;
                                        }
                                        break;
                                    default:
                                        C3722.m10894();
                                        C7105.m18985();
                                        iM450224 = ThreadFactoryC3888.m11306("ܽۜ") ^ i112;
                                        i113 = ((iM450224 ^ i111) * (-28803)) ^ (-553703551);
                                        i114 = -507511597;
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:17:0x0052  */
                        /* JADX WARN: Code duplicated, block: B:38:0x00f1 A[PHI: r12 r15
                          0x00f1: PHI (r12v3 android.widget.EditText) = 
                          (r12v1 android.widget.EditText)
                          (r12v2 android.widget.EditText)
                          (r12v1 android.widget.EditText)
                          (r12v1 android.widget.EditText)
                          (r12v1 android.widget.EditText)
                         binds: [B:37:0x00ef, B:24:0x0080, B:18:0x0067, B:15:0x004e, B:9:0x0041] A[DONT_GENERATE, DONT_INLINE]
                          0x00f1: PHI (r15v3 com.google.android.material.textfield.TextInputLayout) = 
                          (r15v1 com.google.android.material.textfield.TextInputLayout)
                          (r15v2 com.google.android.material.textfield.TextInputLayout)
                          (r15v1 com.google.android.material.textfield.TextInputLayout)
                          (r15v1 com.google.android.material.textfield.TextInputLayout)
                          (r15v1 com.google.android.material.textfield.TextInputLayout)
                         binds: [B:37:0x00ef, B:24:0x0080, B:18:0x0067, B:15:0x004e, B:9:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:46:0x0142  */
                        /* JADX WARN: Code duplicated, block: B:54:0x018d  */
                        /* JADX WARN: Code duplicated, block: B:58:0x01bb A[PHI: r11 r13 r14
                          0x01bb: PHI (r11v5 android.widget.EditText) = 
                          (r11v3 android.widget.EditText)
                          (r11v3 android.widget.EditText)
                          (r11v4 android.widget.EditText)
                          (r11v3 android.widget.EditText)
                         binds: [B:57:0x01b9, B:33:0x00d2, B:28:0x00a0, B:6:0x0038] A[DONT_GENERATE, DONT_INLINE]
                          0x01bb: PHI (r13v3 l.᩵ۡۜ) = (r13v1 l.᩵ۡۜ), (r13v1 l.᩵ۡۜ), (r13v2 l.᩵ۡۜ), (r13v1 l.᩵ۡۜ) binds: [B:57:0x01b9, B:33:0x00d2, B:28:0x00a0, B:6:0x0038] A[DONT_GENERATE, DONT_INLINE]
                          0x01bb: PHI (r14v2 l.᩻ۡ᩺) = (r14v1 l.᩻ۡ᩺), (r14v1 l.᩻ۡ᩺), (r14v1 l.᩻ۡ᩺), (r14v4 l.᩻ۡ᩺) binds: [B:57:0x01b9, B:33:0x00d2, B:28:0x00a0, B:6:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view12) {
                            int iM450224;
                            int i110;
                            int i111 = 2145254633;
                            int i112 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
                            int i113 = C3577.f13150;
                            int iM113016 = (ThreadFactoryC3888.m11306("᩷۬") ^ i113) * 81;
                            int i114 = ((iM113016 ^ i112) * (-31125)) ^ 1961255574;
                            int i115 = iM113016 ^ 1679469006;
                            ViewOnClickListenerC23604 viewOnClickListenerC23604 = null;
                            DialogInterfaceC19356 dialogInterfaceC19356 = null;
                            EditText editText11 = null;
                            EditText editText12 = null;
                            TextInputLayout textInputLayout10 = null;
                            while (true) {
                                i111 = i115 ^ ((((i111 ^ i112) * 19511) >> 31) & i114);
                                switch (i111) {
                                    case -2085940422:
                                    case -1939024244:
                                        if (C19806.m45024()) {
                                            iM450224 = ThreadFactoryC3888.m11306("ۢܿ") ^ i112;
                                            i114 = ((iM450224 ^ i113) * (-16571)) ^ (-1905556100);
                                            i110 = 1574703708;
                                        } else {
                                            iM450224 = C19806.m45029("ܶۖ") ^ i113;
                                            i114 = ((iM450224 ^ i112) * 8293) ^ (-2028650319);
                                            i110 = 229046635;
                                        }
                                        i115 = iM450224 ^ i110;
                                        break;
                                    case -1754571432:
                                    case -213208631:
                                        if (C2704.f10408) {
                                            iM450224 = (ThreadFactoryC3888.m11306("ۤۡ") + i112) * (-15);
                                            i114 = ((iM450224 ^ i113) * 8017) ^ 360903645;
                                            i110 = -1922243655;
                                        } else {
                                            iM450224 = (C19806.m45029("۫ۜ") + i113) * (-15);
                                            i114 = ((iM450224 ^ i112) * (-19085)) ^ (-1580499645);
                                            i110 = -1802472419;
                                        }
                                        i115 = iM450224 ^ i110;
                                        break;
                                    case -1622219992:
                                    case 1922587225:
                                        if (C2704.f10408) {
                                            iM450224 = (i112 - C19806.m45029("ۡۜ")) * (-3);
                                            i114 = ((iM450224 ^ i113) * (-11907)) ^ 1816230162;
                                            i110 = -676341732;
                                        } else {
                                            iM450224 = ThreadFactoryC3888.m11306("ܳ֡") ^ i113;
                                            i114 = ((iM450224 ^ i112) * (-27955)) ^ 1905072960;
                                            i110 = 1528062933;
                                        }
                                        i115 = iM450224 ^ i110;
                                        break;
                                    case -1392100130:
                                    case -1128609934:
                                        if (C3722.f13525 <= 0) {
                                            iM450224 = ThreadFactoryC3888.m11306("ܳ֡") ^ i113;
                                            i114 = ((iM450224 ^ i112) * (-27955)) ^ 1905072960;
                                            i110 = 1528062933;
                                        } else {
                                            iM450224 = C19806.m45029("ܿ۬") ^ i112;
                                            i114 = ((iM450224 ^ i113) * (-18563)) ^ (-1093310105);
                                            i110 = 1328940146;
                                        }
                                        i115 = iM450224 ^ i110;
                                        break;
                                    case -1156058041:
                                    case 966912681:
                                        if (C3660.m10791() != 0) {
                                            iM450224 = (ThreadFactoryC3888.m11306("᩻ۛ") + i112) * 77;
                                            i114 = ((iM450224 ^ i113) * 13111) ^ 906753270;
                                            i110 = 1752630301;
                                        } else {
                                            iM450224 = (i113 - ThreadFactoryC3888.m11306("ۧ᩸")) * 39;
                                            i114 = ((iM450224 ^ i112) * (-28301)) ^ 1746231563;
                                            i110 = 942032304;
                                        }
                                        i115 = iM450224 ^ i110;
                                        break;
                                    case -1042692792:
                                    case -823105474:
                                        MenuItemOnMenuItemClickListenerC3244.m9701();
                                        if (ThreadFactoryC3888.f14547 > 0) {
                                            iM450224 = (ThreadFactoryC3888.m11306("᩻ۛ") + i112) * 77;
                                            i114 = ((iM450224 ^ i113) * 13111) ^ 906753270;
                                            i110 = 1752630301;
                                        } else {
                                            iM450224 = (C19806.m45029("۫ۜ") + i113) * (-15);
                                            i114 = ((iM450224 ^ i112) * (-19085)) ^ (-1580499645);
                                            i110 = -1802472419;
                                        }
                                        i115 = iM450224 ^ i110;
                                        break;
                                    case -730171624:
                                    case 1695355009:
                                        C3286.m9798();
                                        iM450224 = (ThreadFactoryC3888.m11306("᩻ۛ") + i112) * 77;
                                        i114 = ((iM450224 ^ i113) * 13111) ^ 906753270;
                                        i110 = 1752630301;
                                        i115 = iM450224 ^ i110;
                                        break;
                                    case -346101367:
                                    case -209587324:
                                        if (C2477.f9839 <= 0) {
                                            iM450224 = (C19806.m45029("۫ۜ") + i113) * (-15);
                                            i114 = ((iM450224 ^ i112) * (-19085)) ^ (-1580499645);
                                            i110 = -1802472419;
                                        } else {
                                            iM450224 = ThreadFactoryC3888.m11306("ۤۢ") ^ i113;
                                            i114 = ((iM450224 ^ i112) * 24223) ^ (-202429579);
                                            i110 = -855541156;
                                        }
                                        i115 = iM450224 ^ i110;
                                        break;
                                    case -116148960:
                                    case 1664338410:
                                        C0526.m2437();
                                        break;
                                    case -115726513:
                                    case 1977408866:
                                        ViewOnClickListenerC23604.m52055(editText11, editText12, dialogInterfaceC19356, viewOnClickListenerC23604, textInputLayout10, textInputLayout9);
                                        break;
                                    case 64617088:
                                    case 304641028:
                                        dialogInterfaceC19356 = dialogInterfaceC19356M82310;
                                        editText11 = editText9;
                                        if (C1025.f4800 >= 0) {
                                            iM450224 = ThreadFactoryC3888.m11306("ܳ֡") ^ i113;
                                            i114 = ((iM450224 ^ i112) * (-27955)) ^ 1905072960;
                                            i110 = 1528062933;
                                        } else {
                                            iM450224 = ThreadFactoryC3888.m11306("᩵ܺ") ^ i112;
                                            i114 = ((iM450224 ^ i113) * (-23735)) ^ (-1334971007);
                                            i110 = 1276231435;
                                        }
                                        i115 = iM450224 ^ i110;
                                        break;
                                    case 89410045:
                                    case 492973681:
                                        editText12 = editText10;
                                        textInputLayout10 = textInputLayout8;
                                        if (C3660.m10791() != 0) {
                                            iM450224 = (ThreadFactoryC3888.m11306("᩻ۛ") + i112) * 77;
                                            i114 = ((iM450224 ^ i113) * 13111) ^ 906753270;
                                            i110 = 1752630301;
                                        } else {
                                            iM450224 = (C19806.m45029("᩸֡") ^ i113) * 27;
                                            i114 = ((iM450224 ^ i112) * (-13319)) ^ (-1591742264);
                                            i110 = -1428384879;
                                        }
                                        i115 = iM450224 ^ i110;
                                        break;
                                    case 345637714:
                                    case 1049845055:
                                        if (C2124.m6673() <= 0) {
                                            iM450224 = (ThreadFactoryC3888.m11306("᩻ۛ") + i112) * 77;
                                            i114 = ((iM450224 ^ i113) * 13111) ^ 906753270;
                                            i110 = 1752630301;
                                        } else {
                                            iM450224 = C19806.m45029("᩵ܳ") ^ i113;
                                            i114 = ((iM450224 ^ i112) * 16911) ^ 316946139;
                                            i110 = 1320422933;
                                        }
                                        i115 = iM450224 ^ i110;
                                        break;
                                    case 678103046:
                                    case 1473045617:
                                        if (C7105.m18985()) {
                                            iM450224 = (C19806.m45029("۫ۜ") + i113) * (-15);
                                            i114 = ((iM450224 ^ i112) * (-19085)) ^ (-1580499645);
                                            i110 = -1802472419;
                                        } else {
                                            iM450224 = (ThreadFactoryC3888.m11306("᩸۟") + i112) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i114 = ((iM450224 ^ i113) * 5927) ^ (-1046720071);
                                            i110 = -1929986640;
                                        }
                                        i115 = iM450224 ^ i110;
                                        break;
                                    case 1043424719:
                                    case 2038190457:
                                        if (C0278.f1572 > 0) {
                                            iM450224 = C19806.m45029("᩵ܳ") ^ i113;
                                            i114 = ((iM450224 ^ i112) * 16911) ^ 316946139;
                                            i110 = 1320422933;
                                        } else {
                                            iM450224 = ThreadFactoryC3888.m11306("ۢܿ") ^ i112;
                                            i114 = ((iM450224 ^ i113) * (-16571)) ^ (-1905556100);
                                            i110 = 1574703708;
                                        }
                                        i115 = iM450224 ^ i110;
                                        break;
                                    default:
                                        viewOnClickListenerC23604 = this;
                                        if (C2642.f10294 <= 0) {
                                            iM450224 = ThreadFactoryC3888.m11306("ܳ֡") ^ i113;
                                            i114 = ((iM450224 ^ i112) * (-27955)) ^ 1905072960;
                                            i110 = 1528062933;
                                        } else {
                                            iM450224 = (ThreadFactoryC3888.m11306("ۡܽ") ^ i113) * (-69);
                                            i114 = ((iM450224 ^ i112) * 7957) ^ (-633580358);
                                            i110 = 1421617489;
                                        }
                                        i115 = iM450224 ^ i110;
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    break;
                case -1508320722:
                case 49127318:
                    new C4160(this).m11807();
                    break;
                case -1419810410:
                case 1578389355:
                    View view12 = view6;
                    final EditText editText11 = (EditText) C2642.m8167(view12, i76);
                    C19328.m44316(textInputLayout4);
                    C8067 c8067M5359 = RunnableC1564.m5356(this);
                    C1977.m6349(c8067M5359, view12);
                    final DialogInterfaceC19356 dialogInterfaceC19356M82311 = C2704.m8239(c8067M5359);
                    C16737.m39290(editText11);
                    final TextInputLayout textInputLayout10 = textInputLayout4;
                    C1937.m6291(C3743.m10957(view12, iM113011), new View.OnClickListener() { // from class: l.᩷᩵᩺
                        {
                            int i110 = -147314130;
                            int i111 = MenuItemOnMenuItemClickListenerC3244.f12064;
                            int i112 = C0050.f912;
                            int iM450224 = C19806.m45029("ۙܰ") ^ i112;
                            int i113 = ((iM450224 ^ i111) * 21819) ^ (-995697159);
                            int i114 = -890700604;
                            while (true) {
                                i110 = ((((i110 ^ i111) * (-16495)) >> 31) & i113) ^ (iM450224 ^ i114);
                                switch (i110) {
                                    case -2073947191:
                                    case 1587435983:
                                        if (!C7105.m18985()) {
                                            iM450224 = (ThreadFactoryC3888.m11306("۬᩸") + i111) * (-11);
                                            i113 = ((iM450224 ^ i112) * (-4503)) ^ 389573234;
                                            i114 = 1158379805;
                                        } else {
                                            iM450224 = ThreadFactoryC3888.m11306("ܽۨ") ^ i111;
                                            i113 = ((iM450224 ^ i112) * (-27197)) ^ (-828573513);
                                            i114 = -1543689351;
                                        }
                                        break;
                                    case -2034057648:
                                    case 1331615672:
                                        if (C2871.f10837 >= 0) {
                                            iM450224 = C19806.m45029("ܿۘ") ^ i112;
                                            i113 = ((iM450224 ^ i111) * (-27561)) ^ (-530391982);
                                            i114 = 1877491293;
                                        } else {
                                            iM450224 = (C19806.m45029("۫ܰ") + i112) * 39;
                                            i113 = ((iM450224 ^ i111) * (-18465)) ^ 1659280635;
                                            i114 = -1296926402;
                                        }
                                        break;
                                    case -1336705146:
                                    case -499775198:
                                        if (C1066.f4915 <= 0) {
                                            iM450224 = C19806.m45029("᩻۬") ^ i112;
                                            i113 = ((iM450224 ^ i111) * (-20621)) ^ 1869484473;
                                            i114 = -934563333;
                                        } else {
                                            iM450224 = (C19806.m45029("۟ܰ") ^ i112) * 17;
                                            i113 = ((iM450224 ^ i111) * (-13617)) ^ (-1009505356);
                                            i114 = 556513072;
                                        }
                                        break;
                                    case -1299393753:
                                    case 2014810528:
                                        if (C1066.f4915 <= 0) {
                                            iM450224 = C19806.m45029("ܿۘ") ^ i112;
                                            i113 = ((iM450224 ^ i111) * (-27561)) ^ (-530391982);
                                            i114 = 1877491293;
                                        } else {
                                            iM450224 = (i111 - ThreadFactoryC3888.m11306("ܰ֨")) * 21;
                                            i113 = ((iM450224 ^ i112) * 27615) ^ (-1286447721);
                                            i114 = 2020544032;
                                        }
                                        break;
                                    case -1247584957:
                                    case 768397994:
                                        return;
                                    case -1133676512:
                                    case 1908484220:
                                        if (C7105.f23796 >= 0) {
                                            iM450224 = C19806.m45029("᩻۬") ^ i112;
                                            i113 = ((iM450224 ^ i111) * (-20621)) ^ 1869484473;
                                            i114 = -934563333;
                                        } else {
                                            iM450224 = (i111 - C19806.m45029("᩺᩸")) * 91;
                                            i113 = ((iM450224 ^ i112) * 17961) ^ 790222183;
                                            i114 = 1116150947;
                                        }
                                        break;
                                    case -713938007:
                                    case 1682752366:
                                        if (C2642.f10294 <= 0) {
                                            iM450224 = (ThreadFactoryC3888.m11306("۬᩸") + i111) * (-11);
                                            i113 = ((iM450224 ^ i112) * (-4503)) ^ 389573234;
                                            i114 = 1158379805;
                                        } else {
                                            iM450224 = (i111 - ThreadFactoryC3888.m11306("ܿᩴ")) * (-105);
                                            i113 = ((iM450224 ^ i112) * 5385) ^ 744201953;
                                            i114 = -1915129454;
                                        }
                                        break;
                                    case -644181213:
                                    case 1687015258:
                                        C1398.m4895();
                                        if (C2477.m7593() < 0) {
                                            iM450224 = C19806.m45029("᩻۬") ^ i112;
                                            i113 = ((iM450224 ^ i111) * (-20621)) ^ 1869484473;
                                            i114 = -934563333;
                                        } else {
                                            iM450224 = ThreadFactoryC3888.m11306("ܽۨ") ^ i111;
                                            i113 = ((iM450224 ^ i112) * (-27197)) ^ (-828573513);
                                            i114 = -1543689351;
                                        }
                                        break;
                                    case -594146652:
                                    case 1299579915:
                                        if (RunnableC1606.f6488 >= 0) {
                                            iM450224 = C19806.m45029("ۗܽ") ^ i112;
                                            i113 = ((iM450224 ^ i111) * 27495) ^ (-91696569);
                                            i114 = 682069503;
                                        } else {
                                            iM450224 = ThreadFactoryC3888.m11306("۟ۡ") ^ i112;
                                            i113 = ((iM450224 ^ i111) * 2377) ^ (-1812338929);
                                            i114 = -108454078;
                                        }
                                        break;
                                    case 50321797:
                                    case 224428719:
                                        MenuItemOnMenuItemClickListenerC3244.m9701();
                                        C2642.m8171();
                                        throw new RuntimeException();
                                    case 401088556:
                                    case 1372966018:
                                        RunnableC1606.m5473();
                                        if (C1875.f7103 < 0) {
                                            iM450224 = C19806.m45029("ܿۘ") ^ i112;
                                            i113 = ((iM450224 ^ i111) * (-27561)) ^ (-530391982);
                                            i114 = 1877491293;
                                        } else {
                                            iM450224 = ThreadFactoryC3888.m11306("ܽۨ") ^ i111;
                                            i113 = ((iM450224 ^ i112) * (-27197)) ^ (-828573513);
                                            i114 = -1543689351;
                                        }
                                        break;
                                    case 468622525:
                                    case 803542466:
                                        if (C0797.f3386) {
                                            iM450224 = (ThreadFactoryC3888.m11306("۬᩸") + i111) * (-11);
                                            i113 = ((iM450224 ^ i112) * (-4503)) ^ 389573234;
                                            i114 = 1158379805;
                                        } else {
                                            iM450224 = (i112 - C19806.m45029("۠֨")) * (-23);
                                            i113 = ((iM450224 ^ i111) * (-19767)) ^ 1100825987;
                                            i114 = -45220038;
                                        }
                                        break;
                                    case 599933127:
                                    case 1210445022:
                                        C0817.m3399();
                                        C2704.m8255();
                                        iM450224 = ThreadFactoryC3888.m11306("ܽۨ") ^ i111;
                                        i113 = ((iM450224 ^ i112) * (-27197)) ^ (-828573513);
                                        i114 = -1543689351;
                                        break;
                                    case 1651412851:
                                    case 2044936755:
                                        if (C1377.f5749) {
                                            iM450224 = (C19806.m45029("ܽ᩹") + i111) * (-89);
                                            i113 = ((iM450224 ^ i112) * 21811) ^ 5220502;
                                            i114 = -1245953181;
                                        } else {
                                            iM450224 = C19806.m45029("᩻۬") ^ i112;
                                            i113 = ((iM450224 ^ i111) * (-20621)) ^ 1869484473;
                                            i114 = -934563333;
                                        }
                                        break;
                                    case 1849373224:
                                    case 2069193244:
                                        if (C3286.f12186) {
                                            iM450224 = C19806.m45029("᩻۬") ^ i112;
                                            i113 = ((iM450224 ^ i111) * (-20621)) ^ 1869484473;
                                            i114 = -934563333;
                                        } else {
                                            iM450224 = C19806.m45029("ۡ᩻") ^ i112;
                                            i113 = ((iM450224 ^ i111) * (-16139)) ^ 318796442;
                                            i114 = 1038835237;
                                        }
                                        break;
                                    default:
                                        if (ThreadFactoryC3888.f14547 <= 0) {
                                            iM450224 = C19806.m45029("ܿۘ") ^ i112;
                                            i113 = ((iM450224 ^ i111) * (-27561)) ^ (-530391982);
                                            i114 = 1877491293;
                                        } else {
                                            iM450224 = (i111 - C19806.m45029("ۡ᩸")) * (-101);
                                            i113 = ((iM450224 ^ i112) * (-23027)) ^ 673567175;
                                            i114 = 57622579;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view13) {
                            EditText editText12 = null;
                            DialogInterfaceC19356 dialogInterfaceC19356 = null;
                            int i110 = 28488808;
                            int i111 = C7105.f23796;
                            int i112 = C1977.f7413;
                            int iM450224 = C19806.m45029("᩵ۜ") ^ i112;
                            int i113 = ((iM450224 ^ i111) * (-20117)) ^ (-1432071335);
                            int i114 = 527268045;
                            while (true) {
                                i110 = ((((i110 ^ i111) * (-14959)) >> 31) & i113) ^ (iM450224 ^ i114);
                                switch (i110) {
                                    case -1828122384:
                                    case 1603565699:
                                        if (C2477.f9839 <= 0) {
                                            iM450224 = (ThreadFactoryC3888.m11306("۬ۙ") + i111) * (-103);
                                            i113 = ((iM450224 ^ i112) * 17999) ^ 2141719147;
                                            i114 = -47975374;
                                        } else {
                                            iM450224 = C19806.m45029("᩹᩻") ^ i111;
                                            i113 = ((iM450224 ^ i112) * 8867) ^ 2106844028;
                                            i114 = -68729184;
                                        }
                                        break;
                                    case -1464386802:
                                    case 1539794972:
                                        if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                                            iM450224 = ThreadFactoryC3888.m11306("۟᩺") ^ i112;
                                            i113 = ((iM450224 ^ i111) * (-28313)) ^ 433372445;
                                            i114 = 216350429;
                                        } else {
                                            iM450224 = C19806.m45029("ܽۚ") ^ i112;
                                            i113 = ((iM450224 ^ i111) * (-26001)) ^ 760204746;
                                            i114 = 1822762471;
                                        }
                                        break;
                                    case -884939546:
                                    case -575194105:
                                        dialogInterfaceC19356 = dialogInterfaceC19356M82311;
                                        if (C2704.f10408) {
                                            iM450224 = C19806.m45029("᩶ۛ") ^ i111;
                                            i113 = ((iM450224 ^ i112) * (-15311)) ^ 184458606;
                                            i114 = 496528787;
                                        } else {
                                            iM450224 = (ThreadFactoryC3888.m11306("ۧᩳ") + i111) * 19;
                                            i113 = ((iM450224 ^ i112) * 3967) ^ (-633191558);
                                            i114 = 870328128;
                                        }
                                        break;
                                    case -806991373:
                                    case 1298914894:
                                        if (C0216.m1591() <= 0) {
                                            iM450224 = ThreadFactoryC3888.m11306("ۘܶ") ^ i111;
                                            i113 = ((iM450224 ^ i112) * 13967) ^ 672494343;
                                            i114 = -1580650896;
                                        } else {
                                            iM450224 = (C19806.m45029("ۧ֡") ^ i111) * 23;
                                            i113 = ((iM450224 ^ i112) * (-1229)) ^ (-135619151);
                                            i114 = 2102959005;
                                        }
                                        break;
                                    case -781402098:
                                    case 1322847225:
                                        C1668.m5583();
                                        C3660.m10791();
                                        iM450224 = ThreadFactoryC3888.m11306("ۘܶ") ^ i111;
                                        i113 = ((iM450224 ^ i112) * 13967) ^ 672494343;
                                        i114 = -1580650896;
                                        break;
                                    case -671153255:
                                    case 618318041:
                                        ViewOnClickListenerC23604.m52056(editText12, dialogInterfaceC19356, this, textInputLayout10);
                                        break;
                                    case -660966524:
                                    case 1995922859:
                                        if (C2124.f7782 <= 0) {
                                            iM450224 = (ThreadFactoryC3888.m11306("۬ۙ") + i111) * (-103);
                                            i113 = ((iM450224 ^ i112) * 17999) ^ 2141719147;
                                            i114 = -47975374;
                                        } else {
                                            iM450224 = ThreadFactoryC3888.m11306("ۚۚ") ^ i111;
                                            i113 = ((iM450224 ^ i112) * (-6119)) ^ (-1010218585);
                                            i114 = -179605797;
                                        }
                                        break;
                                    case -606666531:
                                    case 1806540801:
                                        C1875.m6086();
                                        C2332.m7079();
                                        break;
                                    case -511892937:
                                    case 922414071:
                                        if (C0797.m3359()) {
                                            iM450224 = (ThreadFactoryC3888.m11306("᩵ۘ") ^ i112) * (-59);
                                            i113 = ((iM450224 ^ i111) * (-1903)) ^ (-256565085);
                                            i114 = 1853932360;
                                        } else {
                                            iM450224 = ThreadFactoryC3888.m11306("ۘܶ") ^ i111;
                                            i113 = ((iM450224 ^ i112) * 13967) ^ 672494343;
                                            i114 = -1580650896;
                                        }
                                        break;
                                    case -281716544:
                                    case 912526785:
                                        C2704.m8255();
                                        if (!RunnableC1895.f7152) {
                                            iM450224 = ThreadFactoryC3888.m11306("۟᩺") ^ i112;
                                            i113 = ((iM450224 ^ i111) * (-28313)) ^ 433372445;
                                            i114 = 216350429;
                                        } else {
                                            iM450224 = ThreadFactoryC3888.m11306("ۘܶ") ^ i111;
                                            i113 = ((iM450224 ^ i112) * 13967) ^ 672494343;
                                            i114 = -1580650896;
                                        }
                                        break;
                                    case 44225994:
                                    case 1380993502:
                                        if (C1025.m3861() <= 0) {
                                            iM450224 = ThreadFactoryC3888.m11306("۟᩺") ^ i112;
                                            i113 = ((iM450224 ^ i111) * (-28313)) ^ 433372445;
                                            i114 = 216350429;
                                        } else {
                                            iM450224 = ThreadFactoryC3888.m11306("۟۠") ^ i112;
                                            i113 = ((iM450224 ^ i111) * 2667) ^ (-2010930948);
                                            i114 = -88965781;
                                        }
                                        break;
                                    case 830495917:
                                    case 1353695722:
                                        if (C0629.m2907()) {
                                            iM450224 = (i112 - ThreadFactoryC3888.m11306("ᩴܿ")) * (-49);
                                            i113 = ((iM450224 ^ i111) * (-10535)) ^ 615496888;
                                            i114 = 2071058656;
                                        } else {
                                            iM450224 = ThreadFactoryC3888.m11306("ۘܶ") ^ i111;
                                            i113 = ((iM450224 ^ i112) * 13967) ^ 672494343;
                                            i114 = -1580650896;
                                        }
                                        break;
                                    case 997867744:
                                    case 1060102324:
                                        editText12 = editText11;
                                        if (C1398.f5802 <= 0) {
                                            iM450224 = (ThreadFactoryC3888.m11306("ۧᩳ") + i111) * 19;
                                            i113 = ((iM450224 ^ i112) * 3967) ^ (-633191558);
                                            i114 = 870328128;
                                        } else {
                                            iM450224 = ThreadFactoryC3888.m11306("ۨ᩵") ^ i112;
                                            i113 = ((iM450224 ^ i111) * (-977)) ^ 1645178395;
                                            i114 = -1723495953;
                                        }
                                        break;
                                    case 1050697566:
                                    case 1254247582:
                                        if (RunnableC1895.f7152) {
                                            iM450224 = (ThreadFactoryC3888.m11306("ۛ᩺") ^ i111) * (-61);
                                            i113 = ((iM450224 ^ i112) * 2437) ^ 141317303;
                                            i114 = -1704245261;
                                        } else {
                                            iM450224 = (ThreadFactoryC3888.m11306("ۧᩳ") + i111) * 19;
                                            i113 = ((iM450224 ^ i112) * 3967) ^ (-633191558);
                                            i114 = 870328128;
                                        }
                                        break;
                                    case 1818973966:
                                    case 1883240365:
                                        C0962.m3746();
                                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                                            iM450224 = ThreadFactoryC3888.m11306("ۘܶ") ^ i111;
                                            i113 = ((iM450224 ^ i112) * 13967) ^ 672494343;
                                            i114 = -1580650896;
                                        } else {
                                            iM450224 = (ThreadFactoryC3888.m11306("᩹ᩳ") + i112) * 49;
                                            i113 = ((iM450224 ^ i111) * (-713)) ^ 656781904;
                                            i114 = -43236921;
                                        }
                                        break;
                                    default:
                                        ThreadFactoryC3888.m11300();
                                        if (ThreadFactoryC3888.m11300() > 0) {
                                            iM450224 = (ThreadFactoryC3888.m11306("۬ۙ") + i111) * (-103);
                                            i113 = ((iM450224 ^ i112) * 17999) ^ 2141719147;
                                            i114 = -47975374;
                                        } else {
                                            iM450224 = ThreadFactoryC3888.m11306("ۘܶ") ^ i111;
                                            i113 = ((iM450224 ^ i112) * 13967) ^ 672494343;
                                            i114 = -1580650896;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    break;
                case -1399929278:
                case 1377810039:
                    int i110 = iM6360;
                    int i111 = i83;
                    View view13 = view8;
                    TextInputLayout textInputLayout11 = textInputLayout3;
                    int i112 = iM113011;
                    EditText editText12 = editText5;
                    int i113 = i79;
                    SpannableString spannableString7 = spannableString5;
                    int i114 = i76;
                    int i115 = i77;
                    short[] sArr7 = sArr4;
                    int i116 = iM11309;
                    String str6 = strM3747;
                    EditText editText13 = editText4;
                    int i117 = i75;
                    TextInputLayout textInputLayout12 = textInputLayout4;
                    View view14 = view6;
                    int i118 = i80;
                    int i119 = i72;
                    int i120 = i81;
                    int i121 = length;
                    String str7 = str4;
                    View view15 = view7;
                    if (i71 == (ThreadFactoryC3888.m11306(C0671.m3009(f76464, FloatingActionButton.AUTO_MINI_LARGEST_SCREEN_WIDTH, 3, i73)) ^ 2120116829)) {
                        iM11306 = C19806.m45029("۬᩺") ^ i68;
                        i25 = ((iM11306 ^ i67) * (-22913)) ^ (-256634649);
                        i26 = 660798882;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶ܳ") + i67) * (-59);
                        i25 = ((iM11306 ^ i68) * (-27173)) ^ 1764554912;
                        i26 = -2079859913;
                    }
                    int i122 = iM11306 ^ i26;
                    view6 = view14;
                    textInputLayout4 = textInputLayout12;
                    i72 = i119;
                    i75 = i117;
                    i80 = i118;
                    iM11309 = i116;
                    view7 = view15;
                    sArr4 = sArr7;
                    i77 = i115;
                    str4 = str7;
                    editText5 = editText12;
                    length = i121;
                    iM113011 = i112;
                    i81 = i120;
                    textInputLayout3 = textInputLayout11;
                    view8 = view13;
                    iM6360 = i110;
                    i70 = i122;
                    i69 = i25;
                    spannableString5 = spannableString7;
                    i79 = i113;
                    i83 = i111;
                    editText4 = editText13;
                    strM3747 = str6;
                    i76 = i114;
                    break;
                case -1369255977:
                case 244262321:
                    i = i83;
                    iM6360 = i78 + C1977.m6360(strArr[i72]) + 3;
                    if (iM6360 < spannableString5.length()) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶᩷") ^ i68) * (-49);
                        i2 = ((iM45029 ^ i67) * (-22731)) ^ 698967592;
                        i3 = -1454972077;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩵ܶ") ^ i68;
                        i2 = ((iM45029 ^ i67) * 13061) ^ 873520962;
                        i3 = -1138793704;
                    }
                    int i123 = iM45029 ^ i3;
                    i83 = i;
                    i70 = i123;
                    i69 = i2;
                    break;
                case -1351159535:
                case 1615231704:
                    i = i83;
                    if (C1709.m5697()) {
                        iM45029 = (C19806.m45029("ۘܳ") ^ i67) * 5;
                        i2 = ((iM45029 ^ i68) * (-24511)) ^ (-2074753631);
                        i3 = -939895310;
                    } else {
                        iM45029 = C19806.m45029("ۜ᩻") ^ i67;
                        i2 = ((iM45029 ^ i68) * (-12483)) ^ 260830559;
                        i3 = -815892644;
                    }
                    int i124 = iM45029 ^ i3;
                    i83 = i;
                    i70 = i124;
                    i69 = i2;
                    break;
                case -1289284179:
                case 900556829:
                    iM6360 = iM6360;
                    strM3747 = strM3747;
                    i20 = i83;
                    view8 = view8;
                    editText4 = editText4;
                    textInputLayout3 = textInputLayout3;
                    iM113011 = iM113011;
                    editText5 = editText5;
                    i21 = i79;
                    i81 = i81;
                    spannableString2 = spannableString5;
                    length = length;
                    str4 = str4;
                    i77 = i77;
                    view7 = view7;
                    i80 = i80;
                    sArr4 = sArr4;
                    i72 = i72;
                    i22 = iM11309;
                    i23 = i75;
                    textInputLayout = textInputLayout4;
                    view3 = view6;
                    i82 = iM450219 ^ 2119466348;
                    iM450212 = C19806.m45029(AbstractC0464.m2308(f76464, 444, 3, i73)) ^ 2126179968;
                    if (C10634.f36300 < 0) {
                        int iM450224 = (C19806.m45029("ܳ᩻") ^ i67) * 37;
                        int i125 = ((iM450224 ^ i68) * 1029) ^ 1318414729;
                        i24 = iM450224 ^ (-409093384);
                        editText4 = editText4;
                        view6 = view3;
                        textInputLayout4 = textInputLayout;
                        strM3747 = strM3747;
                        i76 = iM450212;
                        i69 = i125;
                        i75 = i23;
                        i72 = i72;
                        iM11309 = i22;
                        sArr4 = sArr4;
                        i80 = i80;
                        i77 = i77;
                        view7 = view7;
                        editText5 = editText5;
                        str4 = str4;
                        iM113011 = iM113011;
                        length = length;
                        view8 = view8;
                        i81 = i81;
                        textInputLayout3 = textInputLayout3;
                        iM6360 = iM6360;
                        i61 = i20;
                        i70 = i24;
                        spannableString5 = spannableString2;
                        i79 = i21;
                        i83 = i61;
                    } else {
                        int iM113016 = (ThreadFactoryC3888.m11306("֡֡") ^ i67) * 75;
                        i17 = iM450212;
                        i69 = ((iM113016 ^ i68) * (-11727)) ^ 753735681;
                        view6 = view3;
                        textInputLayout4 = textInputLayout;
                        spannableString5 = spannableString2;
                        i75 = i23;
                        i79 = i21;
                        i83 = i20;
                        iM11309 = i22;
                        i70 = iM113016 ^ (-1078167582);
                        sArr4 = sArr4;
                        i77 = i77;
                        i72 = i72;
                        i80 = i80;
                        editText5 = editText5;
                        iM113011 = iM113011;
                        view7 = view7;
                        str4 = str4;
                        view8 = view8;
                        length = length;
                        i81 = i81;
                        textInputLayout3 = textInputLayout3;
                        iM6360 = iM6360;
                        int i1010 = i17;
                        editText4 = editText4;
                        strM3747 = strM3747;
                        i76 = i1010;
                    }
                    break;
                case -1227156715:
                case 962958303:
                    i52 = iM6360;
                    i53 = i83;
                    i21 = i79;
                    i54 = i80;
                    spannableString2 = spannableString5;
                    i55 = i72;
                    i56 = i81;
                    i57 = length;
                    if (C1709.m5684().containsKey(C0629.m2906(f76464, 540, 2, i73))) {
                        iM450216 = ThreadFactoryC3888.m11306("᩷ۚ") ^ i67;
                        i58 = ((iM450216 ^ i68) * (-24639)) ^ (-1916636921);
                        i64 = -441258263;
                    } else {
                        iM450216 = (i68 - ThreadFactoryC3888.m11306("ۙ۬")) * (-107);
                        i58 = ((iM450216 ^ i67) * (-6267)) ^ 326717586;
                        i64 = 10477021;
                    }
                    i60 = iM450216 ^ i64;
                    length = i57;
                    iM6360 = i52;
                    i81 = i56;
                    i72 = i55;
                    i80 = i54;
                    i61 = i53;
                    i70 = i60;
                    i69 = i58;
                    spannableString5 = spannableString2;
                    i79 = i21;
                    i83 = i61;
                    break;
                case -1208189147:
                case -924534403:
                    i = i83;
                    if (i72 < length) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۛ") ^ i68;
                        i2 = ((iM45029 ^ i67) * (-24671)) ^ 1318730604;
                        i3 = -243128020;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴۚ") + i68) * (-81);
                        i2 = ((iM45029 ^ i67) * 27175) ^ 1691775656;
                        i3 = -760540481;
                    }
                    int i126 = iM45029 ^ i3;
                    i83 = i;
                    i70 = i126;
                    i69 = i2;
                    break;
                case -1185785687:
                case -122493717:
                    C8067 c8067M53510 = RunnableC1564.m5356(this);
                    String strM3413 = C0817.m3412(this, iM11309);
                    C7105.m18988(strM3413, strM3747);
                    String strM3414 = C0817.m3412(this, iM113010);
                    C1937.m6286(strM3414, strM3747);
                    CharSequence[] charSequenceArr2 = new CharSequence[i74];
                    charSequenceArr2[i81] = strM3413;
                    charSequenceArr2[i80] = strM3414;
                    c8067M53510.m21267(charSequenceArr2, new DialogInterface.OnClickListener() { // from class: l.ۧ᩵᩺

                        /* JADX INFO: renamed from: ۖܽ᩺, reason: not valid java name and contains not printable characters */
                        private static final short[] f37934 = {8648, -17391, -17546, 20410, -19854, 19756, -16676, -21989, -18343, -18260, -23569, 17627, -21199, 17314, 19194, -18792, 28091, 21526, 27272};

                        /* JADX WARN: Code duplicated, block: B:50:0x01a4 A[PHI: r4 r5
                          0x01a4: PHI (r4v50 l.۠ۡۜ) = (r4v43 l.۠ۡۜ), (r4v2 l.۠ۡۜ) binds: [B:49:0x01a2, B:15:0x0071] A[DONT_GENERATE, DONT_INLINE]
                          0x01a4: PHI (r5v7 int) = (r5v4 int), (r5v2 int) binds: [B:49:0x01a2, B:15:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i127) {
                            int iM450225;
                            int i128;
                            int i129;
                            int iM113017;
                            int i130;
                            int i131;
                            int iM113018;
                            int i132;
                            int i133;
                            int i134 = C1875.f7103;
                            int i135 = C2788.f10625;
                            int iM450226 = (C19806.m45029("ۙۛ") ^ i134) * (-63);
                            int i136 = ((iM450226 ^ i135) * 22361) ^ (-1325933209);
                            C8067 c8067M3752 = null;
                            String strM18989 = null;
                            short[] sArr8 = null;
                            short[] sArr9 = null;
                            int i137 = iM450226 ^ 2118851249;
                            DialogInterfaceOnClickListenerC15867 dialogInterfaceOnClickListenerC15867 = null;
                            int iM450227 = 0;
                            int iM113019 = 0;
                            int i138 = 0;
                            int iM113020 = 0;
                            short s = 0;
                            short s2 = 0;
                            int i139 = 0;
                            int i140 = 193184557;
                            Runnable runnable = null;
                            ViewOnClickListenerC23604 viewOnClickListenerC23604 = null;
                            while (true) {
                                i140 = i137 ^ (i136 & (((i140 ^ i135) * 31005) >> 31));
                                switch (i140) {
                                    case -2133997912:
                                    case 1626652286:
                                        dialogInterfaceOnClickListenerC15867 = dialogInterfaceOnClickListenerC15867;
                                        c8067M3752 = c8067M3752;
                                        sArr8 = f37934;
                                        if (C0671.f2816 != 0) {
                                            iM113017 = ThreadFactoryC3888.m11306("ܺ᩷") ^ i135;
                                            i130 = ((iM113017 ^ i134) * 2419) ^ (-569822800);
                                            i131 = 183603580;
                                        } else {
                                            iM113017 = C19806.m45029("᩶ۨ") ^ i134;
                                            i130 = ((iM113017 ^ i135) * 7909) ^ (-978040041);
                                            i131 = -2044631606;
                                        }
                                        dialogInterfaceOnClickListenerC15867 = dialogInterfaceOnClickListenerC15867;
                                        i137 = iM113017 ^ i131;
                                        i136 = i130;
                                        c8067M3752 = c8067M3752;
                                        break;
                                    case -2011365159:
                                    case 225029933:
                                        c8067M3752 = C0962.m3751(viewOnClickListenerC23604);
                                        iM450227 = C19806.m45029(C2704.m8240(f37934, 4, 3, i139));
                                        if (C3577.f13150 >= 0) {
                                            iM450225 = C19806.m45029("ۚܳ") ^ i134;
                                            i128 = ((iM450225 ^ i135) * (-31687)) ^ 74258334;
                                            i129 = -697980173;
                                        } else {
                                            iM450225 = ThreadFactoryC3888.m11306("᩸ܳ") ^ i134;
                                            i128 = ((iM450225 ^ i135) * 15611) ^ 1275170621;
                                            i129 = -1895640150;
                                        }
                                        i137 = iM450225 ^ i129;
                                        i136 = i128;
                                        break;
                                    case -1971001152:
                                    case 1446378440:
                                        C1189.m4360(ThreadFactoryC3888.m11306(C2249.m6918(f37934, 16, 3, i139)) ^ 2118409619);
                                        break;
                                    case -1621447051:
                                    case 262123019:
                                        dialogInterfaceOnClickListenerC15867 = dialogInterfaceOnClickListenerC15867;
                                        c8067M3752 = c8067M3752;
                                        int i141 = s + 1;
                                        if (((s * s2) + 1) - (i141 * i141) > 0) {
                                            iM113017 = (i135 - ThreadFactoryC3888.m11306("ܿܺ")) * (-53);
                                            i130 = ((iM113017 ^ i134) * (-14789)) ^ (-1200021840);
                                            i131 = -1128730843;
                                        } else {
                                            iM113017 = (C19806.m45029("᩸ᩴ") + i134) * 43;
                                            i130 = ((iM113017 ^ i135) * (-4369)) ^ (-1069730876);
                                            i131 = -104054098;
                                        }
                                        dialogInterfaceOnClickListenerC15867 = dialogInterfaceOnClickListenerC15867;
                                        i137 = iM113017 ^ i131;
                                        i136 = i130;
                                        c8067M3752 = c8067M3752;
                                        break;
                                    case -1533868706:
                                    case 11581981:
                                        iM113020 = ThreadFactoryC3888.m11306(ViewGroupOnHierarchyChangeListenerC1916.m6241(f37934, 13, 3, i139));
                                        if (C1419.f5860 < 0) {
                                            iM450225 = (ThreadFactoryC3888.m11306("ۤ۬") + i135) * (-73);
                                            i128 = ((iM450225 ^ i134) * 87) ^ 1427640088;
                                            i129 = -1777086056;
                                            i137 = iM450225 ^ i129;
                                            i136 = i128;
                                        } else {
                                            int iM450228 = (C19806.m45029("ۡ֡") + i135) * (-3);
                                            i130 = ((iM450228 ^ i134) * (-25521)) ^ (-889193939);
                                            i137 = iM450228 ^ 1323527614;
                                            i136 = i130;
                                            c8067M3752 = c8067M3752;
                                        }
                                        break;
                                    case -1407750427:
                                    case 2139982967:
                                        if (C2871.f10837 < 0) {
                                            int iM450229 = (C19806.m45029("ۡ֡") + i135) * (-3);
                                            i130 = ((iM450229 ^ i134) * (-25521)) ^ (-889193939);
                                            i137 = iM450229 ^ 1323527614;
                                            i136 = i130;
                                            c8067M3752 = c8067M3752;
                                        } else {
                                            iM450225 = C19806.m45029("ۙܶ") ^ i134;
                                            i128 = ((iM450225 ^ i135) * 24203) ^ 2127512200;
                                            i129 = -1655990763;
                                            i137 = iM450225 ^ i129;
                                            i136 = i128;
                                        }
                                        break;
                                    case -1298571505:
                                    case 1829981525:
                                        dialogInterfaceOnClickListenerC15867 = dialogInterfaceOnClickListenerC15867;
                                        c8067M3752 = c8067M3752;
                                        s = sArr8[0];
                                        s2 = 2;
                                        if (RunnableC1606.f6488 < 0) {
                                            iM113017 = (i135 - C19806.m45029("۬ۚ")) * (-47);
                                            i130 = ((iM113017 ^ i134) * (-22473)) ^ 59403437;
                                            i131 = 638658461;
                                            dialogInterfaceOnClickListenerC15867 = dialogInterfaceOnClickListenerC15867;
                                            i137 = iM113017 ^ i131;
                                            i136 = i130;
                                            c8067M3752 = c8067M3752;
                                        } else {
                                            int iM113021 = ThreadFactoryC3888.m11306("ۤᩴ") ^ i134;
                                            i137 = iM113021 ^ (-1799589942);
                                            i136 = ((iM113021 ^ i135) * (-8015)) ^ 1150468201;
                                            c8067M3752 = c8067M3752;
                                            dialogInterfaceOnClickListenerC15867 = null;
                                        }
                                        break;
                                    case -1213942992:
                                    case 819184480:
                                        if (C1025.m3861() > 0) {
                                            dialogInterfaceOnClickListenerC15867 = dialogInterfaceOnClickListenerC15867;
                                            c8067M3752 = c8067M3752;
                                            iM113017 = ThreadFactoryC3888.m11306("ܺ᩷") ^ i135;
                                            i130 = ((iM113017 ^ i134) * 2419) ^ (-569822800);
                                            i131 = 183603580;
                                            dialogInterfaceOnClickListenerC15867 = dialogInterfaceOnClickListenerC15867;
                                            i137 = iM113017 ^ i131;
                                            i136 = i130;
                                            c8067M3752 = c8067M3752;
                                        } else {
                                            iM450225 = C19806.m45029("ۙܶ") ^ i134;
                                            i128 = ((iM450225 ^ i135) * 24203) ^ 2127512200;
                                            i129 = -1655990763;
                                            i137 = iM450225 ^ i129;
                                            i136 = i128;
                                        }
                                        break;
                                    case -739231477:
                                    case 1028940487:
                                        C0671.m3008();
                                        iM450225 = C19806.m45029("ۙܶ") ^ i134;
                                        i128 = ((iM450225 ^ i135) * 24203) ^ 2127512200;
                                        i129 = -1655990763;
                                        i137 = iM450225 ^ i129;
                                        i136 = i128;
                                        break;
                                    case -595801116:
                                    case 60107258:
                                        C1460.m5055(c8067M3752, ThreadFactoryC3888.m11306(strM18989) ^ 2101576219, dialogInterfaceOnClickListenerC15867);
                                        if (C10634.f36300 < 0) {
                                            iM450225 = ThreadFactoryC3888.m11306("᩹᩻") ^ i134;
                                            i128 = ((iM450225 ^ i135) * 23931) ^ (-966111616);
                                            i129 = 1335974353;
                                            i137 = iM450225 ^ i129;
                                            i136 = i128;
                                        } else {
                                            c8067M3752 = c8067M3752;
                                            int iM113022 = ThreadFactoryC3888.m11306("ۤᩴ") ^ i134;
                                            i137 = iM113022 ^ (-1799589942);
                                            i136 = ((iM113022 ^ i135) * (-8015)) ^ 1150468201;
                                            c8067M3752 = c8067M3752;
                                            dialogInterfaceOnClickListenerC15867 = null;
                                        }
                                        break;
                                    case -551583273:
                                    case 341778901:
                                        if (C1419.f5860 < 0) {
                                            iM450225 = C19806.m45029("ۙܶ") ^ i134;
                                            i128 = ((iM450225 ^ i135) * 24203) ^ 2127512200;
                                            i129 = -1655990763;
                                        } else {
                                            iM450225 = C19806.m45029("ۚܳ") ^ i134;
                                            i128 = ((iM450225 ^ i135) * (-31687)) ^ 74258334;
                                            i129 = -697980173;
                                        }
                                        i137 = iM450225 ^ i129;
                                        i136 = i128;
                                        break;
                                    case -336921721:
                                    case -241029074:
                                        DialogInterfaceOnClickListenerC15867 dialogInterfaceOnClickListenerC15868 = dialogInterfaceOnClickListenerC15867;
                                        int iM450230 = C19806.m45029(C2124.m6685(f37934, 1, 3, i139));
                                        if (RunnableC3388.f12514 < 0) {
                                            C17485 c17485 = new C17485(viewOnClickListenerC23604, iM450230 ^ 2098571353);
                                            C0797.m3354(c17485);
                                            c17485.m40697(runnable);
                                            C14411.m34675(new C15843(c17485, viewOnClickListenerC23604), viewOnClickListenerC23604);
                                        } else {
                                            dialogInterfaceOnClickListenerC15867 = dialogInterfaceOnClickListenerC15868;
                                            int iM4502210 = (C19806.m45029("ۡ֡") + i135) * (-3);
                                            i130 = ((iM4502210 ^ i134) * (-25521)) ^ (-889193939);
                                            i137 = iM4502210 ^ 1323527614;
                                            i136 = i130;
                                            c8067M3752 = c8067M3752;
                                        }
                                        break;
                                    case -104863679:
                                    case 2138713820:
                                        iM113019 = ThreadFactoryC3888.m11306(C1189.m4365(sArr9, 7, 3, i139));
                                        i138 = 2101314819;
                                        if (C3722.f13525 > 0) {
                                            iM450225 = (i134 - C19806.m45029("ۛᩴ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i128 = ((iM450225 ^ i135) * 24901) ^ (-2127027540);
                                            i129 = 165231397;
                                            i137 = iM450225 ^ i129;
                                            i136 = i128;
                                        } else {
                                            int iM4502211 = (C19806.m45029("ۡ֡") + i135) * (-3);
                                            i130 = ((iM4502211 ^ i134) * (-25521)) ^ (-889193939);
                                            i137 = iM4502211 ^ 1323527614;
                                            i136 = i130;
                                            c8067M3752 = c8067M3752;
                                        }
                                        break;
                                    case 151096620:
                                    case 1858837328:
                                        i139 = 57023;
                                        iM113017 = (C19806.m45029("ۧ᩺") + i134) * (-5);
                                        i130 = ((iM113017 ^ i135) * (-1921)) ^ (-1731583199);
                                        i131 = 1667878676;
                                        dialogInterfaceOnClickListenerC15867 = dialogInterfaceOnClickListenerC15867;
                                        i137 = iM113017 ^ i131;
                                        i136 = i130;
                                        c8067M3752 = c8067M3752;
                                        break;
                                    case 191636596:
                                    case 1278094879:
                                        dialogInterfaceOnClickListenerC15867 = dialogInterfaceOnClickListenerC15867;
                                        c8067M3752 = c8067M3752;
                                        int i142 = ViewOnClickListenerC23604.f76463;
                                        viewOnClickListenerC23604 = this.f37935;
                                        runnable = null;
                                        if (i127 == 0) {
                                            iM113017 = (C19806.m45029("ۢ۟") ^ i135) * (-69);
                                            i130 = ((iM113017 ^ i134) * 6527) ^ (-1241051307);
                                            i131 = -1486290297;
                                        } else {
                                            iM113017 = C19806.m45029("ۧ۬") ^ i135;
                                            i130 = ((iM113017 ^ i134) * (-23481)) ^ 1670122775;
                                            i131 = -1128431605;
                                        }
                                        dialogInterfaceOnClickListenerC15867 = dialogInterfaceOnClickListenerC15867;
                                        i137 = iM113017 ^ i131;
                                        i136 = i130;
                                        c8067M3752 = c8067M3752;
                                        break;
                                    case 420524303:
                                    case 1987731141:
                                        ThreadFactoryC3888.m11300();
                                        C3722.m10894();
                                        break;
                                    case 854887063:
                                    case 1960443233:
                                        C2788.m8479(c8067M3752, iM113019 ^ i138);
                                        if (!C0817.f3443) {
                                            c8067M3752 = c8067M3752;
                                            int iM113023 = ThreadFactoryC3888.m11306("ۤᩴ") ^ i134;
                                            i137 = iM113023 ^ (-1799589942);
                                            i136 = ((iM113023 ^ i135) * (-8015)) ^ 1150468201;
                                            c8067M3752 = c8067M3752;
                                            dialogInterfaceOnClickListenerC15867 = null;
                                        } else {
                                            dialogInterfaceOnClickListenerC15867 = new DialogInterfaceOnClickListenerC15867(3, viewOnClickListenerC23604);
                                            strM18989 = C7105.m18989(f37934, 10, 3, i139);
                                            if (AbstractC0464.m2313() == 0) {
                                                iM450225 = (C19806.m45029("᩵᩻") + i135) * (-91);
                                                i128 = ((iM450225 ^ i134) * 30023) ^ (-1778057703);
                                                i129 = -244270826;
                                                i137 = iM450225 ^ i129;
                                                i136 = i128;
                                            } else {
                                                int iM4502212 = (C19806.m45029("ۡ֡") + i135) * (-3);
                                                i130 = ((iM4502212 ^ i134) * (-25521)) ^ (-889193939);
                                                i137 = iM4502212 ^ 1323527614;
                                                i136 = i130;
                                                c8067M3752 = c8067M3752;
                                            }
                                        }
                                        break;
                                    case 880877053:
                                    case 1767093816:
                                        DialogInterfaceOnClickListenerC15867 dialogInterfaceOnClickListenerC15869 = dialogInterfaceOnClickListenerC15867;
                                        C8067 c8068 = c8067M3752;
                                        if (C1709.m5688()) {
                                            iM113018 = ThreadFactoryC3888.m11306("᩹ܺ") ^ i134;
                                            i132 = ((iM113018 ^ i135) * 29141) ^ 988236758;
                                            i133 = 1664034965;
                                        } else {
                                            iM113018 = C19806.m45029("֡᩸") ^ i135;
                                            i132 = ((iM113018 ^ i134) * (-4717)) ^ 1439505516;
                                            i133 = -2082743831;
                                        }
                                        int i143 = iM113018 ^ i133;
                                        c8067M3752 = c8068;
                                        i137 = i143;
                                        i136 = i132;
                                        dialogInterfaceOnClickListenerC15867 = dialogInterfaceOnClickListenerC15869;
                                        break;
                                    case 1210484417:
                                    case 1680931772:
                                        C1377.m4836(c8067M3752, 2099016941 ^ iM450227);
                                        sArr9 = f37934;
                                        if (C0962.m3746() < 0) {
                                            iM450225 = ThreadFactoryC3888.m11306("ۢ۬") ^ i135;
                                            i128 = ((iM450225 ^ i134) * 18019) ^ (-760020626);
                                            i129 = -1433135040;
                                            i137 = iM450225 ^ i129;
                                            i136 = i128;
                                        } else {
                                            dialogInterfaceOnClickListenerC15867 = dialogInterfaceOnClickListenerC15867;
                                            c8067M3752 = c8067M3752;
                                            iM113017 = ThreadFactoryC3888.m11306("ܺ᩷") ^ i135;
                                            i130 = ((iM113017 ^ i134) * 2419) ^ (-569822800);
                                            i131 = 183603580;
                                            dialogInterfaceOnClickListenerC15867 = dialogInterfaceOnClickListenerC15867;
                                            i137 = iM113017 ^ i131;
                                            i136 = i130;
                                            c8067M3752 = c8067M3752;
                                        }
                                        break;
                                    case 1756624810:
                                    case 1777516987:
                                        C1066.m4025(c8067M3752, 2126815466 ^ iM113020, runnable);
                                        C2704.m8239(c8067M3752);
                                        break;
                                    default:
                                        i139 = 14900;
                                        iM113017 = (C19806.m45029("ۧ᩺") + i134) * (-5);
                                        i130 = ((iM113017 ^ i135) * (-1921)) ^ (-1731583199);
                                        i131 = 1667878676;
                                        dialogInterfaceOnClickListenerC15867 = dialogInterfaceOnClickListenerC15867;
                                        i137 = iM113017 ^ i131;
                                        i136 = i130;
                                        c8067M3752 = c8067M3752;
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    CallableC1627.m5514(c8067M53510);
                    break;
                case -1089200388:
                case 1108306434:
                    if (C2788.f10625 >= 0) {
                        iM450210 = ThreadFactoryC3888.m11306("᩵۟") ^ i67;
                        i2 = ((iM450210 ^ i68) * (-18611)) ^ 1263213096;
                        i4 = -286256066;
                    } else {
                        iM450210 = C19806.m45029("۬᩶") ^ i68;
                        i2 = ((iM450210 ^ i67) * (-28197)) ^ 913006362;
                        i4 = 73405868;
                    }
                    i70 = iM450210 ^ i4;
                    i69 = i2;
                    break;
                case -1088937358:
                case 806844544:
                    C1668.m5582(ThreadFactoryC3888.m11306(C2642.m8172(f76464, 591, 3, i73)) ^ 2121134354);
                    break;
                case -1052792669:
                case 247938632:
                    C3286.m9800(this, new Intent(this, (Class<?>) ActivityC13418.class));
                    break;
                case -1032025304:
                case 390221912:
                    i52 = iM6360;
                    i53 = i83;
                    i21 = i79;
                    i54 = i80;
                    spannableString2 = spannableString5;
                    i55 = i72;
                    i56 = i81;
                    i57 = length;
                    obj = null;
                    if (i71 == (C19806.m45029(C1977.m6363(f76464, 537, 3, i73)) ^ 2119216516)) {
                        iM450216 = (i67 - C19806.m45029("ۧ᩺")) * 127;
                        i58 = ((iM450216 ^ i68) * (-18483)) ^ 1305435376;
                        i64 = -660163023;
                    } else {
                        iM450216 = (i67 - ThreadFactoryC3888.m11306("֫᩷")) * (-85);
                        i58 = ((iM450216 ^ i68) * 11197) ^ 1143598836;
                        i64 = -1756608980;
                    }
                    i60 = iM450216 ^ i64;
                    length = i57;
                    iM6360 = i52;
                    i81 = i56;
                    i72 = i55;
                    i80 = i54;
                    i61 = i53;
                    i70 = i60;
                    i69 = i58;
                    spannableString5 = spannableString2;
                    i79 = i21;
                    i83 = i61;
                    break;
                case -872520198:
                case 1782162291:
                    i42 = i83;
                    i44 = i79;
                    int i127 = i80;
                    C8067 c8067M53511 = RunnableC1564.m5356(this);
                    spannableString4 = spannableString5;
                    i45 = i72;
                    i41 = iM6360;
                    C1377.m4836(c8067M53511, C19806.m45029(C1875.m6105(f76464, 548, 3, i73)) ^ 2098277204);
                    C1148.m4224(c8067M53511, ThreadFactoryC3888.m11306(C0278.m1774(f76464, 551, 3, i73)) ^ 2121555166);
                    if (!C2332.f8260) {
                        c8067M5356 = c8067;
                        i48 = i77;
                        view5 = view7;
                        i43 = iM113011;
                        i46 = i81;
                        sArr3 = sArr4;
                        i47 = length;
                        i49 = i127;
                        iM450214 = (ThreadFactoryC3888.m11306("᩻ܺ") + i68) * (-5);
                        i50 = ((iM450214 ^ i67) * (-11065)) ^ 727248098;
                        i51 = -1467134833;
                        int i1011 = iM450214 ^ i51;
                        iM113011 = i43;
                        i69 = i50;
                        sArr4 = sArr3;
                        i77 = i48;
                        c8067 = c8067M5356;
                        iM6360 = i41;
                        int i1012 = i49;
                        view7 = view5;
                        spannableString5 = spannableString4;
                        i79 = i44;
                        i83 = i42;
                        i70 = i1011;
                        length = i47;
                        i81 = i46;
                        i72 = i45;
                        i80 = i1012;
                    } else {
                        AbstractC0464.m2309(c8067M53511, C19806.m45029(C2871.m8640(f76464, 554, 3, i73)) ^ 2129659078, new DialogInterfaceOnClickListenerC8081(i81, this));
                        C10634.m26830(c8067M53511, C19806.m45029(C2249.m6918(f76464, 557, 3, i73)) ^ 2100789100, obj);
                        CallableC1627.m5514(c8067M53511);
                    }
                    break;
                case -803028408:
                case -131706929:
                    iM6360 = iM6360;
                    i83 = i83;
                    view8 = view8;
                    textInputLayout3 = textInputLayout3;
                    iM113011 = iM113011;
                    editText5 = editText5;
                    i79 = i79;
                    i81 = i81;
                    spannableString5 = spannableString5;
                    length = length;
                    str4 = str4;
                    i77 = i77;
                    view7 = view7;
                    i80 = i80;
                    sArr4 = sArr4;
                    i72 = i72;
                    iM11309 = iM11309;
                    i75 = i75;
                    textInputLayout4 = textInputLayout4;
                    view6 = view6;
                    int i128 = i76;
                    strM3747 = strM3747;
                    editText4 = editText4;
                    i17 = i128;
                    short s = f76464[439];
                    int i129 = s + 1;
                    if (((s * 2) + 1) - (i129 * i129) <= 0) {
                        iM450211 = ThreadFactoryC3888.m11306("᩹ܺ") ^ i67;
                        i18 = ((iM450211 ^ i68) * (-28783)) ^ (-1332773341);
                        i19 = -1999970371;
                    } else {
                        iM450211 = C19806.m45029("֫᩵") ^ i68;
                        i18 = ((iM450211 ^ i67) * (-20475)) ^ 2078805459;
                        i19 = 882285672;
                    }
                    int i1013 = iM450211 ^ i19;
                    view6 = view6;
                    textInputLayout4 = textInputLayout4;
                    spannableString5 = spannableString5;
                    i75 = i75;
                    i79 = i79;
                    i83 = i83;
                    iM11309 = iM11309;
                    i70 = i1013;
                    i69 = i18;
                    sArr4 = sArr4;
                    i77 = i77;
                    i72 = i72;
                    i80 = i80;
                    editText5 = editText5;
                    iM113011 = iM113011;
                    view7 = view7;
                    str4 = str4;
                    view8 = view8;
                    length = length;
                    i81 = i81;
                    textInputLayout3 = textInputLayout3;
                    iM6360 = iM6360;
                    int i1014 = i17;
                    editText4 = editText4;
                    strM3747 = strM3747;
                    i76 = i1014;
                    break;
                case -801637508:
                case 1694924051:
                    i = i83;
                    if (i71 == (C19806.m45029(RunnableC1564.m5344(f76464, 566, 3, i73)) ^ 2128798227)) {
                        iM45029 = C19806.m45029("ۙ֨") ^ i68;
                        i2 = ((iM45029 ^ i67) * (-28619)) ^ (-1495457354);
                        i3 = 1266955611;
                    } else {
                        iM45029 = (i68 - C19806.m45029("֨ᩳ")) * 63;
                        i2 = ((iM45029 ^ i67) * (-13445)) ^ 712085306;
                        i3 = -520924903;
                    }
                    int i1210 = iM45029 ^ i3;
                    i83 = i;
                    i70 = i1210;
                    i69 = i2;
                    break;
                case -792532429:
                case 1447439505:
                    C3743.m10966();
                    if (C2124.f7782 <= 0) {
                        iM6360 = iM6360;
                        i20 = i83;
                        view8 = view8;
                        textInputLayout3 = textInputLayout3;
                        iM450212 = i76;
                        iM113011 = iM113011;
                        editText5 = editText5;
                        i21 = i79;
                        i81 = i81;
                        spannableString2 = spannableString5;
                        length = length;
                        strM3747 = strM3747;
                        editText4 = editText4;
                        str4 = str4;
                        i77 = i77;
                        view7 = view7;
                        i80 = i80;
                        sArr4 = sArr4;
                        i72 = i72;
                        i22 = iM11309;
                        i23 = i75;
                        textInputLayout = textInputLayout4;
                        view3 = view6;
                        int iM113017 = (ThreadFactoryC3888.m11306("֡֡") ^ i67) * 75;
                        i17 = iM450212;
                        i69 = ((iM113017 ^ i68) * (-11727)) ^ 753735681;
                        view6 = view3;
                        textInputLayout4 = textInputLayout;
                        spannableString5 = spannableString2;
                        i75 = i23;
                        i79 = i21;
                        i83 = i20;
                        iM11309 = i22;
                        i70 = iM113017 ^ (-1078167582);
                        sArr4 = sArr4;
                        i77 = i77;
                        i72 = i72;
                        i80 = i80;
                        editText5 = editText5;
                        iM113011 = iM113011;
                        view7 = view7;
                        str4 = str4;
                        view8 = view8;
                        length = length;
                        i81 = i81;
                        textInputLayout3 = textInputLayout3;
                        iM6360 = iM6360;
                        int i1015 = i17;
                        editText4 = editText4;
                        strM3747 = strM3747;
                        i76 = i1015;
                    } else {
                        i41 = iM6360;
                        i42 = i83;
                        c8067M5356 = c8067;
                        i48 = i77;
                        i43 = iM113011;
                        i44 = i79;
                        sArr3 = sArr4;
                        spannableString4 = spannableString5;
                        view5 = view7;
                        i49 = i80;
                        i45 = i72;
                        i46 = i81;
                        i47 = length;
                        iM450214 = (ThreadFactoryC3888.m11306("᩻ܺ") + i68) * (-5);
                        i50 = ((iM450214 ^ i67) * (-11065)) ^ 727248098;
                        i51 = -1467134833;
                        int i1016 = iM450214 ^ i51;
                        iM113011 = i43;
                        i69 = i50;
                        sArr4 = sArr3;
                        i77 = i48;
                        c8067 = c8067M5356;
                        iM6360 = i41;
                        int i1017 = i49;
                        view7 = view5;
                        spannableString5 = spannableString4;
                        i79 = i44;
                        i83 = i42;
                        i70 = i1016;
                        length = i47;
                        i81 = i46;
                        i72 = i45;
                        i80 = i1017;
                    }
                    break;
                case -775400676:
                case 622500850:
                    int i130 = i80;
                    int i131 = i81;
                    C8067 c8067M3752 = C0962.m3751(this);
                    Object[] objArr = new Object[i130];
                    objArr[i131] = C0817.m3412(this, ThreadFactoryC3888.m11306(ViewGroupOnHierarchyChangeListenerC1916.m6241(f76464, 542, 3, i73)) ^ 2123107206);
                    String strM3021 = C0671.m3021(this, i79, objArr);
                    C1937.m6286(strM3021, strM3747);
                    CharSequence[] charSequenceArr3 = new CharSequence[i130];
                    charSequenceArr3[i131] = strM3021;
                    c8067M3752.m21267(charSequenceArr3, new DialogInterface.OnClickListener() { // from class: l.ۨۡ᩺

                        /* JADX INFO: renamed from: ᩴۨۢ, reason: not valid java name and contains not printable characters */
                        private static final short[] f39008 = {1171, 26963, 18370, -29263};

                        /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
                        
                            if (l.RunnableC3388.m10064() == false) goto L10;
                         */
                        @Override // android.content.DialogInterface.OnClickListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void onClick(android.content.DialogInterface r18, int r19) {
                            /*
                                Method dump skipped, instruction units count: 656
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: l.DialogInterfaceOnClickListenerC11609.onClick(android.content.DialogInterface, int):void");
                        }
                    });
                    CallableC1627.m5514(c8067M3752);
                    break;
                case -571068704:
                case 1997435829:
                    i = i83;
                    if (i71 == (ThreadFactoryC3888.m11306(C0629.m2906(f76464, 569, 3, i73)) ^ 2121831337)) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽܰ") + i68) * (-107);
                        i2 = ((iM45029 ^ i67) * (-18365)) ^ 1746459513;
                        i3 = -301233396;
                    } else {
                        iM45029 = C19806.m45029("ܿۘ") ^ i67;
                        i2 = ((iM45029 ^ i68) * 32103) ^ 1697547923;
                        i3 = -1734164746;
                    }
                    int i1211 = iM45029 ^ i3;
                    i83 = i;
                    i70 = i1211;
                    i69 = i2;
                    break;
                case -517695436:
                case 1151369700:
                    i = i83;
                    if (i71 == (C19806.m45029(C2871.m8640(f76464, 563, 3, i73)) ^ 2125603017)) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡ᩺") ^ i67) * 21;
                        i2 = ((iM45029 ^ i68) * (-67)) ^ 1450111418;
                        i3 = 1473783723;
                    } else {
                        iM45029 = (C19806.m45029("ۧۚ") + i68) * 23;
                        i2 = ((iM45029 ^ i67) * (-29221)) ^ 1459764282;
                        i3 = 1292814018;
                    }
                    int i1212 = iM45029 ^ i3;
                    i83 = i;
                    i70 = i1212;
                    i69 = i2;
                    break;
                case -469998490:
                case 622843055:
                    i72++;
                    i78 = iM6360;
                    iM450210 = (C19806.m45029("ۨ۟") + i67) * (-45);
                    i2 = ((iM450210 ^ i68) * (-29973)) ^ 237007701;
                    i4 = -1953573755;
                    i70 = iM450210 ^ i4;
                    i69 = i2;
                    break;
                case -458980990:
                case 421586638:
                    i = i83;
                    if (i71 == (C19806.m45029(RunnableC1564.m5344(f76464, 579, 3, i73)) ^ 2119190024)) {
                        iM45029 = (C19806.m45029("ۛۡ") ^ i67) * (-97);
                        i2 = ((iM45029 ^ i68) * (-32167)) ^ 2097319535;
                        i3 = 353592529;
                    } else {
                        iM45029 = C19806.m45029("ܽۚ") ^ i67;
                        i2 = ((iM45029 ^ i68) * (-17773)) ^ (-473146876);
                        i3 = 189817605;
                    }
                    int i1213 = iM45029 ^ i3;
                    i83 = i;
                    i70 = i1213;
                    i69 = i2;
                    break;
                case -458047444:
                case -387652674:
                    i = i83;
                    if (i71 == (ThreadFactoryC3888.m11306(C0216.m1588(f76464, 576, 3, i73)) ^ 2118512517)) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢᩴ") + i68) * (-85);
                        i2 = ((iM45029 ^ i67) * (-3579)) ^ (-1020819687);
                        i3 = -352075688;
                    } else {
                        iM45029 = (i67 - ThreadFactoryC3888.m11306("ۤ۠")) * (-39);
                        i2 = ((iM45029 ^ i68) * (-13131)) ^ (-191113514);
                        i3 = 33536239;
                    }
                    int i1214 = iM45029 ^ i3;
                    i83 = i;
                    i70 = i1214;
                    i69 = i2;
                    break;
                case -452228368:
                case 1347113691:
                    iM6360 = iM6360;
                    i20 = i83;
                    view8 = view8;
                    textInputLayout3 = textInputLayout3;
                    iM113011 = iM113011;
                    editText5 = editText5;
                    i21 = i79;
                    i81 = i81;
                    spannableString2 = spannableString5;
                    length = length;
                    str4 = str4;
                    i77 = i77;
                    view7 = view7;
                    i80 = i80;
                    sArr4 = sArr4;
                    i72 = i72;
                    i22 = iM11309;
                    i23 = i75;
                    textInputLayout = textInputLayout4;
                    view3 = view6;
                    int i132 = i76;
                    strM3747 = strM3747;
                    editText4 = editText4;
                    i17 = i132;
                    CallableC1627.m5508(view, C0629.m2906(f76464, 440, 1, i73));
                    int iM6354 = C1977.m6354(view);
                    iM450219 = C19806.m45029(RunnableC1564.m5344(f76464, 441, 3, i73));
                    if (C10634.f36300 >= 0) {
                        iM450212 = i17;
                        i71 = iM6354;
                        int iM113018 = (ThreadFactoryC3888.m11306("֡֡") ^ i67) * 75;
                        i17 = iM450212;
                        i69 = ((iM113018 ^ i68) * (-11727)) ^ 753735681;
                        view6 = view3;
                        textInputLayout4 = textInputLayout;
                        spannableString5 = spannableString2;
                        i75 = i23;
                        i79 = i21;
                        i83 = i20;
                        iM11309 = i22;
                        i70 = iM113018 ^ (-1078167582);
                        sArr4 = sArr4;
                        i77 = i77;
                        i72 = i72;
                        i80 = i80;
                        editText5 = editText5;
                        iM113011 = iM113011;
                        view7 = view7;
                        str4 = str4;
                        view8 = view8;
                        length = length;
                        i81 = i81;
                        textInputLayout3 = textInputLayout3;
                        iM6360 = iM6360;
                    } else {
                        int iM113019 = (ThreadFactoryC3888.m11306("֡᩸") ^ i67) * (-105);
                        spannableString5 = spannableString2;
                        i72 = i72;
                        i79 = i21;
                        i80 = i80;
                        i83 = i20;
                        i70 = iM113019 ^ 1077803367;
                        i69 = ((iM113019 ^ i68) * 7877) ^ 133289049;
                        i71 = iM6354;
                        view7 = view7;
                        str4 = str4;
                        view6 = view3;
                        textInputLayout4 = textInputLayout;
                        length = length;
                        i75 = i23;
                        i81 = i81;
                        iM11309 = i22;
                        textInputLayout3 = textInputLayout3;
                        sArr4 = sArr4;
                        i77 = i77;
                        iM6360 = iM6360;
                        editText5 = editText5;
                        iM113011 = iM113011;
                        view8 = view8;
                    }
                    int i1018 = i17;
                    editText4 = editText4;
                    strM3747 = strM3747;
                    i76 = i1018;
                    break;
                case -421504102:
                case 1802922589:
                    i17 = i76;
                    i73 = 30177;
                    iM450211 = ThreadFactoryC3888.m11306("ܰۜ") ^ i68;
                    i18 = ((iM450211 ^ i67) * 3657) ^ 446932025;
                    i19 = 262900584;
                    int i1019 = iM450211 ^ i19;
                    view6 = view6;
                    textInputLayout4 = textInputLayout4;
                    spannableString5 = spannableString5;
                    i75 = i75;
                    i79 = i79;
                    i83 = i83;
                    iM11309 = iM11309;
                    i70 = i1019;
                    i69 = i18;
                    sArr4 = sArr4;
                    i77 = i77;
                    i72 = i72;
                    i80 = i80;
                    editText5 = editText5;
                    iM113011 = iM113011;
                    view7 = view7;
                    str4 = str4;
                    view8 = view8;
                    length = length;
                    i81 = i81;
                    textInputLayout3 = textInputLayout3;
                    iM6360 = iM6360;
                    int i10110 = i17;
                    editText4 = editText4;
                    strM3747 = strM3747;
                    i76 = i10110;
                    break;
                case -314728319:
                case 1311049394:
                    C8067 c8067M53512 = RunnableC1564.m5356(this);
                    int i133 = i80;
                    Object[] objArr2 = new Object[i133];
                    objArr2[i81] = C2124.m6690(this, C19806.m45029(C1977.m6363(f76464, 560, 3, i73)) ^ 2126514582);
                    String strM6104 = C1875.m6104(this, i79, objArr2);
                    C7105.m18988(strM6104, strM3747);
                    CharSequence[] charSequenceArr4 = new CharSequence[i133];
                    charSequenceArr4[i81] = strM6104;
                    c8067M53512.m21267(charSequenceArr4, new DialogInterface.OnClickListener() { // from class: l.ᩴۡ᩺

                        /* JADX INFO: renamed from: ᩶ᩴۙ, reason: not valid java name and contains not printable characters */
                        private static final short[] f60587 = {1545, -7697, -6213, -4596};

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i134) {
                            int iM450225;
                            int i135;
                            int iM113020;
                            int i136;
                            ViewOnClickListenerC23604 viewOnClickListenerC23604 = null;
                            Runnable runnable = null;
                            short[] sArr8 = null;
                            short s2 = 0;
                            short s3 = 0;
                            int i137 = 0;
                            int i138 = 0;
                            int i139 = 0;
                            int i140 = 0;
                            int i141 = 220171387;
                            int i142 = C1937.f7317;
                            int i143 = C1460.f5948;
                            int iM113021 = ThreadFactoryC3888.m11306("ۙ۟") ^ i142;
                            int i144 = ((iM113021 ^ i143) * 18615) ^ 2083995007;
                            int i145 = iM113021 ^ (-370081472);
                            while (true) {
                                C17485 c17485 = null;
                                while (true) {
                                    i141 = ((((i141 ^ i143) * (-13881)) >> 31) & i144) ^ i145;
                                    switch (i141) {
                                        case -1825901383:
                                        case -290325573:
                                            int i146 = ViewOnClickListenerC23604.f76463;
                                            short[] sArr9 = f60587;
                                            if (C7105.f23796 < 0) {
                                                if (C3743.f13569) {
                                                    int iM113022 = ThreadFactoryC3888.m11306(MenuItemOnMenuItemClickListenerC3244.m9715(sArr9, 1, 3, i140));
                                                    if (C2871.f10837 < 0) {
                                                        int i147 = iM113022 ^ 2122112511;
                                                        if (C2249.f8050 < 0) {
                                                            viewOnClickListenerC23604 = this.f60588;
                                                            c17485 = new C17485(viewOnClickListenerC23604, i147);
                                                            C0797.m3354(c17485);
                                                            runnable = null;
                                                            if (C0629.f2722 > 0) {
                                                                iM450225 = ThreadFactoryC3888.m11306("ᩳ֡") ^ i142;
                                                                i144 = ((iM450225 ^ i143) * (-31851)) ^ 908410791;
                                                                i135 = 864902104;
                                                                i145 = iM450225 ^ i135;
                                                                break;
                                                            }
                                                        }
                                                        iM113020 = (ThreadFactoryC3888.m11306("ۙۚ") ^ i142) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                                        i144 = ((iM113020 ^ i143) * (-20327)) ^ 224672333;
                                                        i136 = 429346222;
                                                        i145 = iM113020 ^ i136;
                                                        break;
                                                    }
                                                }
                                                iM113020 = C19806.m45029("۬ܺ") ^ i143;
                                                i144 = ((iM113020 ^ i142) * (-6665)) ^ 1624953905;
                                                i136 = -261858446;
                                                i145 = iM113020 ^ i136;
                                            } else {
                                                iM113020 = (C19806.m45029("᩶ܳ") ^ i143) * (-69);
                                                i144 = ((iM113020 ^ i142) * (-17829)) ^ 1330267953;
                                                i136 = -810992534;
                                                i145 = iM113020 ^ i136;
                                            }
                                            break;
                                        case -1624030131:
                                        case -360865397:
                                            s2 = sArr8[0];
                                            s3 = 17385;
                                            if (RunnableC1895.m6170() == 0) {
                                                iM450225 = ThreadFactoryC3888.m11306("۫ۚ") ^ i143;
                                                i144 = ((iM450225 ^ i142) * 20923) ^ (-1242809673);
                                                i135 = 356507768;
                                                i145 = iM450225 ^ i135;
                                            } else {
                                                iM113020 = (ThreadFactoryC3888.m11306("ۙۚ") ^ i142) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                                i144 = ((iM113020 ^ i143) * (-20327)) ^ 224672333;
                                                i136 = 429346222;
                                                i145 = iM113020 ^ i136;
                                            }
                                            break;
                                        case -1498866158:
                                        case 921789953:
                                            sArr8 = f60587;
                                            if (ThreadFactoryC3888.f14547 <= 0) {
                                                iM450225 = C19806.m45029("ۧۜ") ^ i143;
                                                i144 = ((iM450225 ^ i142) * (-7869)) ^ (-768687830);
                                                i135 = 352989151;
                                            } else {
                                                iM450225 = (C19806.m45029("᩺ۚ") ^ i142) * (-121);
                                                i144 = ((iM450225 ^ i143) * (-21685)) ^ 208881769;
                                                i135 = 2028888208;
                                            }
                                            i145 = iM450225 ^ i135;
                                            break;
                                        case -1443614590:
                                        case 943816389:
                                            if (C0671.f2816 != 0) {
                                                iM113020 = C19806.m45029("۬ܺ") ^ i143;
                                                i144 = ((iM113020 ^ i142) * (-6665)) ^ 1624953905;
                                                i136 = -261858446;
                                                i145 = iM113020 ^ i136;
                                            }
                                            iM450225 = C19806.m45029("ۧۜ") ^ i143;
                                            i144 = ((iM450225 ^ i142) * (-7869)) ^ (-768687830);
                                            i135 = 352989151;
                                            i145 = iM450225 ^ i135;
                                            break;
                                        case -1431443199:
                                        case 1549969561:
                                            i140 = 48935;
                                            iM450225 = (i142 - C19806.m45029("ۛ᩹")) * (-91);
                                            i144 = ((iM450225 ^ i143) * (-7295)) ^ 39217087;
                                            i135 = -1484930510;
                                            i145 = iM450225 ^ i135;
                                            break;
                                        case -1149173195:
                                        case 416523708:
                                            int i148 = i138 + i139;
                                            if ((i148 + i148) - i137 < 0) {
                                                iM450225 = C19806.m45029("ۘ᩶") ^ i143;
                                                i144 = ((iM450225 ^ i142) * (-21157)) ^ (-1736712118);
                                                i135 = 248944121;
                                            } else {
                                                iM450225 = (C19806.m45029("᩸ۧ") ^ i142) * (-3);
                                                i144 = ((iM450225 ^ i143) * 19293) ^ (-38670844);
                                                i135 = -1771045637;
                                            }
                                            i145 = iM450225 ^ i135;
                                            break;
                                        case -667805893:
                                        case -661355035:
                                            c17485.m40697(runnable);
                                            C14411.m34676(new C20076(c17485, viewOnClickListenerC23604), viewOnClickListenerC23604);
                                            break;
                                        case -435509023:
                                        case 869290942:
                                            i139 = 302238225;
                                            if (C1668.f6641 < 0) {
                                                iM450225 = (ThreadFactoryC3888.m11306("᩺֫") + i143) * (-79);
                                                i144 = ((iM450225 ^ i142) * (-28831)) ^ 1122034131;
                                                i135 = 663531970;
                                                i145 = iM450225 ^ i135;
                                            } else {
                                                iM113020 = (C19806.m45029("᩶ܳ") ^ i143) * (-69);
                                                i144 = ((iM113020 ^ i142) * (-17829)) ^ 1330267953;
                                                i136 = -810992534;
                                                i145 = iM113020 ^ i136;
                                            }
                                            break;
                                        case -356450607:
                                        case 454262044:
                                            i140 = 23800;
                                            iM450225 = (i142 - C19806.m45029("ۛ᩹")) * (-91);
                                            i144 = ((iM450225 ^ i143) * (-7295)) ^ 39217087;
                                            i135 = -1484930510;
                                            i145 = iM450225 ^ i135;
                                            break;
                                        case -249792836:
                                        case 1560371772:
                                            RunnableC1564.m5345();
                                            iM113020 = (C19806.m45029("᩶ܳ") ^ i143) * (-69);
                                            i144 = ((iM113020 ^ i142) * (-17829)) ^ 1330267953;
                                            i136 = -810992534;
                                            i145 = iM113020 ^ i136;
                                            break;
                                        case -248924031:
                                        case 226401578:
                                            int i149 = s2 + s3;
                                            i137 = i149 * i149;
                                            i138 = s2 * s2;
                                            if (!C2332.f8260) {
                                                iM113020 = (C19806.m45029("᩶ܳ") ^ i143) * (-69);
                                                i144 = ((iM113020 ^ i142) * (-17829)) ^ 1330267953;
                                                i136 = -810992534;
                                                i145 = iM113020 ^ i136;
                                            } else {
                                                iM450225 = (C19806.m45029("ܽ᩸") ^ i142) * (-119);
                                                i144 = ((iM450225 ^ i143) * 6539) ^ 1290200751;
                                                i135 = 1485398488;
                                                i145 = iM450225 ^ i135;
                                            }
                                            break;
                                        case 38645515:
                                        case 1904085935:
                                            if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                                                iM450225 = (C19806.m45029("ۙ᩷") ^ i143) * 59;
                                                i144 = ((iM450225 ^ i142) * 9319) ^ 443616704;
                                                i135 = -1478767399;
                                                i145 = iM450225 ^ i135;
                                            } else {
                                                iM113020 = C19806.m45029("۬ܺ") ^ i143;
                                                i144 = ((iM113020 ^ i142) * (-6665)) ^ 1624953905;
                                                i136 = -261858446;
                                                i145 = iM113020 ^ i136;
                                            }
                                            break;
                                        case 343016202:
                                        case 1591254904:
                                            if (C1398.f5802 <= 0) {
                                                int iM113023 = (i142 - ThreadFactoryC3888.m11306("۠ۢ")) * 21;
                                                i144 = ((iM113023 ^ i143) * (-18219)) ^ 659879048;
                                                i145 = iM113023 ^ (-584173632);
                                            } else {
                                                iM113020 = (C19806.m45029("᩶ܳ") ^ i143) * (-69);
                                                i144 = ((iM113020 ^ i142) * (-17829)) ^ 1330267953;
                                                i136 = -810992534;
                                                i145 = iM113020 ^ i136;
                                            }
                                            break;
                                        case 942153438:
                                        case 1233825571:
                                            C2871.m8646();
                                            C0962.m3746();
                                            break;
                                        default:
                                            C1977.m6356();
                                            if (!RunnableC1564.f6300) {
                                                iM113020 = (C19806.m45029("᩶ܳ") ^ i143) * (-69);
                                                i144 = ((iM113020 ^ i142) * (-17829)) ^ 1330267953;
                                                i136 = -810992534;
                                                i145 = iM113020 ^ i136;
                                            }
                                            iM450225 = C19806.m45029("ۧۜ") ^ i143;
                                            i144 = ((iM450225 ^ i142) * (-7869)) ^ (-768687830);
                                            i135 = 352989151;
                                            i145 = iM450225 ^ i135;
                                            break;
                                    }
                                    return;
                                }
                            }
                        }
                    });
                    C2704.m8239(c8067M53512);
                    break;
                case -275508261:
                case -173659680:
                    i5 = iM6360;
                    int i134 = i83;
                    int i135 = iM113011;
                    int i136 = i79;
                    short[] sArr8 = sArr4;
                    SpannableString spannableString8 = spannableString5;
                    View view16 = view7;
                    i16 = i80;
                    i13 = i72;
                    i14 = i81;
                    i15 = length;
                    EditText editText14 = editText5;
                    View viewM10958 = C3743.m10957(view16, ThreadFactoryC3888.m11306(C2332.m7082(f76464, 491, 3, i73)) ^ 2128374312);
                    str = str4;
                    C1937.m6286(viewM10958, str);
                    textInputLayout6 = (TextInputLayout) viewM10958;
                    view2 = view16;
                    int iM113020 = ThreadFactoryC3888.m11306(C2788.m8470(f76464, 494, 3, i73)) ^ 2120165084;
                    if (RunnableC1606.m5473() != 0) {
                        iM450213 = C19806.m45029("ۤۗ") ^ i68;
                        i39 = ((iM450213 ^ i67) * (-10061)) ^ (-1372990471);
                        i40 = -520814960;
                    } else {
                        iM450213 = C19806.m45029("֡ܿ") ^ i67;
                        i39 = ((iM450213 ^ i68) * 15273) ^ (-1810411215);
                        i40 = -1336502906;
                    }
                    int i137 = iM450213 ^ i40;
                    sArr4 = sArr8;
                    editText5 = editText14;
                    iM113011 = i135;
                    i77 = iM113020;
                    i69 = i39;
                    spannableString5 = spannableString8;
                    i79 = i136;
                    i83 = i134;
                    i70 = i137;
                    iM6360 = i5;
                    int i812 = i15;
                    i81 = i14;
                    i72 = i13;
                    i80 = i16;
                    view7 = view2;
                    str4 = str;
                    length = i812;
                    break;
                case -249930527:
                case 1329024963:
                    m52067();
                    break;
                case -208616260:
                case 1530554649:
                    C3722.m10894();
                    if (!RunnableC1564.m5345()) {
                        iM450210 = (ThreadFactoryC3888.m11306("ܳۗ") ^ i68) * (-127);
                        i2 = ((iM450210 ^ i67) * 24419) ^ (-1478907231);
                        i4 = 1112924492;
                        i70 = iM450210 ^ i4;
                        i69 = i2;
                    } else {
                        i41 = iM6360;
                        i42 = i83;
                        c8067M5356 = c8067;
                        i48 = i77;
                        i43 = iM113011;
                        i44 = i79;
                        sArr3 = sArr4;
                        spannableString4 = spannableString5;
                        view5 = view7;
                        i49 = i80;
                        i45 = i72;
                        i46 = i81;
                        i47 = length;
                        iM450214 = (ThreadFactoryC3888.m11306("᩻ܺ") + i68) * (-5);
                        i50 = ((iM450214 ^ i67) * (-11065)) ^ 727248098;
                        i51 = -1467134833;
                        int i10111 = iM450214 ^ i51;
                        iM113011 = i43;
                        i69 = i50;
                        sArr4 = sArr3;
                        i77 = i48;
                        c8067 = c8067M5356;
                        iM6360 = i41;
                        int i10112 = i49;
                        view7 = view5;
                        spannableString5 = spannableString4;
                        i79 = i44;
                        i83 = i42;
                        i70 = i10111;
                        length = i47;
                        i81 = i46;
                        i72 = i45;
                        i80 = i10112;
                    }
                    break;
                case -158361886:
                case 1681762808:
                    iM6360 = iM6360;
                    i = i83;
                    i30 = iM113011;
                    editText2 = editText5;
                    i31 = i79;
                    int i138 = i80;
                    spannableString3 = spannableString5;
                    i32 = i72;
                    int i139 = i77;
                    i33 = i81;
                    sArr2 = sArr4;
                    i34 = length;
                    str3 = str4;
                    i35 = i139;
                    View viewM4976 = C1419.m4976(this, C19806.m45029(C3722.m10901(f76464, 485, 3, i73)) ^ 2123554701);
                    i36 = iM11309;
                    View viewM8168 = C2642.m8167(viewM4976, C19806.m45029(ThreadFactoryC3888.m11312(f76464, 488, 3, i73)) ^ 2128475339);
                    C1937.m6286(viewM8168, str3);
                    textInputLayout5 = (TextInputLayout) viewM8168;
                    if (C0797.m3359()) {
                        int iM450225 = C19806.m45029("ܳۜ") ^ i68;
                        int i140 = ((iM450225 ^ i67) * 8541) ^ (-605565168);
                        i37 = iM450225 ^ (-1438190602);
                        str4 = str3;
                        length = i34;
                        iM11309 = i36;
                        i81 = i33;
                        sArr4 = sArr2;
                        i77 = i35;
                        i72 = i32;
                        i80 = i138;
                        editText5 = editText2;
                        iM113011 = i30;
                        view7 = viewM4976;
                        i69 = i140;
                        spannableString5 = spannableString3;
                    } else {
                        view7 = viewM4976;
                        i38 = i138;
                        int iM450226 = (i67 - C19806.m45029("᩶۠")) * (-125);
                        int i813 = ((iM450226 ^ i68) * 23395) ^ 954841331;
                        i37 = iM450226 ^ 1897473488;
                        str4 = str3;
                        length = i34;
                        iM11309 = i36;
                        i81 = i33;
                        sArr4 = sArr2;
                        i77 = i35;
                        i72 = i32;
                        i80 = i38;
                        editText5 = editText2;
                        spannableString5 = spannableString3;
                        iM113011 = i30;
                        i69 = i813;
                    }
                    i79 = i31;
                    i83 = i;
                    i70 = i37;
                    iM6360 = iM6360;
                    break;
                case -128661393:
                case 1535170745:
                    C2124.m6673();
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM6360 = iM6360;
                        i20 = i83;
                        view8 = view8;
                        textInputLayout3 = textInputLayout3;
                        iM450212 = i76;
                        iM113011 = iM113011;
                        editText5 = editText5;
                        i21 = i79;
                        i81 = i81;
                        spannableString2 = spannableString5;
                        length = length;
                        strM3747 = strM3747;
                        editText4 = editText4;
                        str4 = str4;
                        i77 = i77;
                        view7 = view7;
                        i80 = i80;
                        sArr4 = sArr4;
                        i72 = i72;
                        i22 = iM11309;
                        i23 = i75;
                        textInputLayout = textInputLayout4;
                        view3 = view6;
                        int iM1130110 = (ThreadFactoryC3888.m11306("֡֡") ^ i67) * 75;
                        i17 = iM450212;
                        i69 = ((iM1130110 ^ i68) * (-11727)) ^ 753735681;
                        view6 = view3;
                        textInputLayout4 = textInputLayout;
                        spannableString5 = spannableString2;
                        i75 = i23;
                        i79 = i21;
                        i83 = i20;
                        iM11309 = i22;
                        i70 = iM1130110 ^ (-1078167582);
                        sArr4 = sArr4;
                        i77 = i77;
                        i72 = i72;
                        i80 = i80;
                        editText5 = editText5;
                        iM113011 = iM113011;
                        view7 = view7;
                        str4 = str4;
                        view8 = view8;
                        length = length;
                        i81 = i81;
                        textInputLayout3 = textInputLayout3;
                        iM6360 = iM6360;
                        int i10113 = i17;
                        editText4 = editText4;
                        strM3747 = strM3747;
                        i76 = i10113;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("᩵۟") ^ i67;
                        i2 = ((iM450210 ^ i68) * (-18611)) ^ 1263213096;
                        i4 = -286256066;
                        i70 = iM450210 ^ i4;
                        i69 = i2;
                    }
                    break;
                case -81948459:
                case 1802204433:
                    i5 = iM6360;
                    i6 = i83;
                    TextInputLayout textInputLayout13 = textInputLayout4;
                    view4 = view6;
                    i7 = iM113011;
                    editText = editText5;
                    i8 = i79;
                    spannableString = spannableString5;
                    i9 = i76;
                    i10 = i77;
                    sArr = sArr4;
                    i11 = iM11309;
                    i12 = i75;
                    int i141 = i80;
                    i13 = i72;
                    i14 = i81;
                    i15 = length;
                    str = str4;
                    view2 = view7;
                    i16 = i141;
                    textInputLayout2 = textInputLayout13;
                    str2 = strM3747;
                    if (i71 == (ThreadFactoryC3888.m11306(C1066.m4040(f76464, 479, 3, i73)) ^ 2124137100)) {
                        iM11307 = (C19806.m45029("ܺۚ") + i67) * (-65);
                        i27 = ((iM11307 ^ i68) * 2423) ^ 731068658;
                        i28 = 854021484;
                    } else {
                        iM11307 = C19806.m45029("ᩴ᩸") ^ i68;
                        i27 = ((iM11307 ^ i67) * 31275) ^ (-1605363313);
                        i28 = 1662257655;
                    }
                    i29 = iM11307 ^ i28;
                    view6 = view4;
                    textInputLayout4 = textInputLayout2;
                    strM3747 = str2;
                    i76 = i9;
                    i75 = i12;
                    spannableString5 = spannableString;
                    iM11309 = i11;
                    i79 = i8;
                    sArr4 = sArr;
                    i77 = i10;
                    i83 = i6;
                    i70 = i29;
                    editText5 = editText;
                    iM6360 = i5;
                    iM113011 = i7;
                    i69 = i27;
                    int i814 = i15;
                    i81 = i14;
                    i72 = i13;
                    i80 = i16;
                    view7 = view2;
                    str4 = str;
                    length = i814;
                    break;
                case -64704010:
                case 204595409:
                    i = i83;
                    spannableString5.setSpan(new AbsoluteSizeSpan(i83), iM6360 - 3, iM6360, 17);
                    iM45029 = ThreadFactoryC3888.m11306("᩵ܶ") ^ i68;
                    i2 = ((iM45029 ^ i67) * 13061) ^ 873520962;
                    i3 = -1138793704;
                    int i1215 = iM45029 ^ i3;
                    i83 = i;
                    i70 = i1215;
                    i69 = i2;
                    break;
                case 130456311:
                case 1981022902:
                    spannableString3 = spannableString5;
                    i32 = i72;
                    iM6360 = iM6360;
                    i = i83;
                    i33 = i81;
                    i34 = length;
                    iM113012 = ThreadFactoryC3888.m11306(ViewGroupOnHierarchyChangeListenerC1916.m6241(f76464, 506, 3, i73)) ^ 2100796214;
                    i74 = 2;
                    int iM113021 = ThreadFactoryC3888.m11306(C2788.m8470(f76464, 509, 3, i73)) ^ 2119103678;
                    sArr4 = f76464;
                    if (C1066.m4023() <= 0) {
                        i31 = iM113021;
                        str3 = str4;
                        i30 = iM113011;
                        editText2 = editText5;
                        i38 = 1;
                        i35 = i77;
                        sArr2 = sArr4;
                        i36 = iM11309;
                        int iM450227 = (i67 - C19806.m45029("᩶۠")) * (-125);
                        int i815 = ((iM450227 ^ i68) * 23395) ^ 954841331;
                        i37 = iM450227 ^ 1897473488;
                        str4 = str3;
                        length = i34;
                        iM11309 = i36;
                        i81 = i33;
                        sArr4 = sArr2;
                        i77 = i35;
                        i72 = i32;
                        i80 = i38;
                        editText5 = editText2;
                        spannableString5 = spannableString3;
                        iM113011 = i30;
                        i69 = i815;
                        i79 = i31;
                        i83 = i;
                        i70 = i37;
                        iM6360 = iM6360;
                    } else {
                        int iM113022 = (ThreadFactoryC3888.m11306("֨ۚ") + i68) * (-45);
                        i69 = ((iM113022 ^ i67) * (-5847)) ^ 110348982;
                        i83 = i;
                        length = i34;
                        i81 = i33;
                        i70 = iM113022 ^ 1343031836;
                        i72 = i32;
                        iM6360 = iM6360;
                        i80 = 1;
                        i79 = iM113021;
                        spannableString5 = spannableString3;
                    }
                    break;
                case 204577698:
                case 1646076803:
                    m52052();
                    break;
                case 208663435:
                case 1673410828:
                    i5 = iM6360;
                    i6 = i83;
                    i7 = iM113011;
                    editText = editText5;
                    i8 = i79;
                    spannableString = spannableString5;
                    i9 = i76;
                    i10 = i77;
                    sArr = sArr4;
                    i11 = iM11309;
                    str2 = strM3747;
                    i12 = i75;
                    textInputLayout2 = textInputLayout4;
                    view4 = view6;
                    int i142 = i80;
                    i13 = i72;
                    i14 = i81;
                    i15 = length;
                    str = str4;
                    view2 = view7;
                    i16 = i142;
                    View viewM9788 = C3286.m9787(this, ThreadFactoryC3888.m11306(C2871.m8640(f76464, 473, 3, i73)) ^ 2128999871);
                    View viewM8169 = C2642.m8167(viewM9788, i12);
                    C7105.m18988(viewM8169, str);
                    textInputLayout3 = (TextInputLayout) viewM8169;
                    editText4 = (EditText) C3743.m10957(viewM9788, i9);
                    if (C2642.f10294 <= 0) {
                        view8 = viewM9788;
                        iM11307 = (i67 - C19806.m45029("ۖܳ")) * 11;
                        i27 = ((iM11307 ^ i68) * 30739) ^ (-75705503);
                        i28 = -1648417149;
                        i29 = iM11307 ^ i28;
                        view6 = view4;
                        textInputLayout4 = textInputLayout2;
                        strM3747 = str2;
                        i76 = i9;
                        i75 = i12;
                        spannableString5 = spannableString;
                        iM11309 = i11;
                        i79 = i8;
                        sArr4 = sArr;
                        i77 = i10;
                        i83 = i6;
                        i70 = i29;
                        editText5 = editText;
                        iM6360 = i5;
                        iM113011 = i7;
                        i69 = i27;
                    } else {
                        int iM450228 = (C19806.m45029("ܶ֫") + i67) * 15;
                        view8 = viewM9788;
                        view6 = view4;
                        textInputLayout4 = textInputLayout2;
                        iM6360 = i5;
                        i75 = i12;
                        iM11309 = i11;
                        sArr4 = sArr;
                        i77 = i10;
                        editText5 = editText;
                        iM113011 = i7;
                        i69 = ((iM450228 ^ i68) * (-20163)) ^ 1978267132;
                        strM3747 = str2;
                        i76 = i9;
                        spannableString5 = spannableString;
                        i79 = i8;
                        i83 = i6;
                        i70 = iM450228 ^ (-1044343371);
                    }
                    int i816 = i15;
                    i81 = i14;
                    i72 = i13;
                    i80 = i16;
                    view7 = view2;
                    str4 = str;
                    length = i816;
                    break;
                case 603165095:
                case 797640827:
                    int i143 = iM6360;
                    i53 = i83;
                    i21 = i79;
                    i54 = i80;
                    spannableString2 = spannableString5;
                    int i144 = i72;
                    int i145 = i81;
                    if (i71 == (ThreadFactoryC3888.m11306(AbstractC0464.m2308(f76464, 545, 3, i73)) ^ 2099888784)) {
                        iM450217 = (i67 - ThreadFactoryC3888.m11306("ۘ᩵")) * 71;
                        i58 = ((iM450217 ^ i68) * (-11787)) ^ 2072013073;
                        i65 = 853398911;
                    } else {
                        iM450217 = C19806.m45029("۫ۛ") ^ i68;
                        i58 = ((iM450217 ^ i67) * 19007) ^ 1978067410;
                        i65 = -1094420101;
                    }
                    i60 = iM450217 ^ i65;
                    i81 = i145;
                    i72 = i144;
                    iM6360 = i143;
                    i80 = i54;
                    i61 = i53;
                    i70 = i60;
                    i69 = i58;
                    spannableString5 = spannableString2;
                    i79 = i21;
                    i83 = i61;
                    break;
                case 656721812:
                case 927110417:
                    m52054();
                    break;
                case 757476823:
                case 1649049288:
                    C1148.m4232();
                    break;
                case 1160048612:
                case 2065055241:
                    break;
                case 1321186143:
                case 1904435527:
                    C2477.m7593();
                    if (!RunnableC1895.f7152) {
                        iM450210 = (ThreadFactoryC3888.m11306("ܳۗ") ^ i68) * (-127);
                        i2 = ((iM450210 ^ i67) * 24419) ^ (-1478907231);
                        i4 = 1112924492;
                        i70 = iM450210 ^ i4;
                        i69 = i2;
                    } else {
                        i5 = iM6360;
                        i6 = i83;
                        i7 = iM113011;
                        editText = editText5;
                        i8 = i79;
                        spannableString = spannableString5;
                        i9 = i76;
                        i10 = i77;
                        sArr = sArr4;
                        i11 = iM11309;
                        i12 = i75;
                        int i146 = i80;
                        i13 = i72;
                        i14 = i81;
                        i15 = length;
                        str = str4;
                        view2 = view7;
                        i16 = i146;
                        int iM1130111 = ThreadFactoryC3888.m11306("ۜ۫") ^ i68;
                        i27 = ((iM1130111 ^ i67) * (-20509)) ^ 514508515;
                        i29 = iM1130111 ^ 2124492801;
                        i76 = i9;
                        i75 = i12;
                        spannableString5 = spannableString;
                        iM11309 = i11;
                        i79 = i8;
                        sArr4 = sArr;
                        i77 = i10;
                        i83 = i6;
                        i70 = i29;
                        editText5 = editText;
                        iM6360 = i5;
                        iM113011 = i7;
                        i69 = i27;
                        int i817 = i15;
                        i81 = i14;
                        i72 = i13;
                        i80 = i16;
                        view7 = view2;
                        str4 = str;
                        length = i817;
                    }
                    break;
                case 1424194652:
                case 1931167935:
                    i52 = iM6360;
                    i53 = i83;
                    i21 = i79;
                    i54 = i80;
                    spannableString2 = spannableString5;
                    i55 = i72;
                    i56 = i81;
                    i57 = length;
                    if (i71 == (ThreadFactoryC3888.m11306(C0526.m2424(f76464, 532, 3, i73)) ^ 2104332234)) {
                        iM450216 = C19806.m45029("᩵ܺ") ^ i68;
                        i58 = ((iM450216 ^ i67) * 22375) ^ (-256039193);
                        i64 = 1720095909;
                    } else {
                        iM450216 = (C19806.m45029("ۤ᩶") ^ i68) * 127;
                        i58 = ((iM450216 ^ i67) * 12045) ^ (-1689814486);
                        i64 = -2016974293;
                    }
                    i60 = iM450216 ^ i64;
                    length = i57;
                    iM6360 = i52;
                    i81 = i56;
                    i72 = i55;
                    i80 = i54;
                    i61 = i53;
                    i70 = i60;
                    i69 = i58;
                    spannableString5 = spannableString2;
                    i79 = i21;
                    i83 = i61;
                    break;
                case 1578359877:
                case 2046301928:
                    if (C1937.m6279() < 0) {
                        i5 = iM6360;
                        i6 = i83;
                        i7 = iM113011;
                        editText = editText5;
                        i8 = i79;
                        spannableString = spannableString5;
                        i9 = i76;
                        i10 = i77;
                        sArr = sArr4;
                        i11 = iM11309;
                        str2 = strM3747;
                        i12 = i75;
                        textInputLayout2 = textInputLayout4;
                        view4 = view6;
                        int i818 = i80;
                        i13 = i72;
                        i14 = i81;
                        i15 = length;
                        str = str4;
                        view2 = view7;
                        i16 = i818;
                        iM11307 = (i67 - C19806.m45029("ۖܳ")) * 11;
                        i27 = ((iM11307 ^ i68) * 30739) ^ (-75705503);
                        i28 = -1648417149;
                        i29 = iM11307 ^ i28;
                        view6 = view4;
                        textInputLayout4 = textInputLayout2;
                        strM3747 = str2;
                        i76 = i9;
                        i75 = i12;
                        spannableString5 = spannableString;
                        iM11309 = i11;
                        i79 = i8;
                        sArr4 = sArr;
                        i77 = i10;
                        i83 = i6;
                        i70 = i29;
                        editText5 = editText;
                        iM6360 = i5;
                        iM113011 = i7;
                        i69 = i27;
                        int i819 = i15;
                        i81 = i14;
                        i72 = i13;
                        i80 = i16;
                        view7 = view2;
                        str4 = str;
                        length = i819;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("ܳۗ") ^ i68) * (-127);
                        i2 = ((iM450210 ^ i67) * 24419) ^ (-1478907231);
                        i4 = 1112924492;
                        i70 = iM450210 ^ i4;
                        i69 = i2;
                    }
                    break;
                case 2049465290:
                case 2074887636:
                    i = i83;
                    c8067M3751 = C0962.m3751(this);
                    C1377.m4836(c8067M3751, C19806.m45029(C0050.m940(f76464, 582, 3, i73)) ^ 2129773409);
                    C1875.m6095(c8067M3751, spannableString5);
                    iM113013 = ThreadFactoryC3888.m11306(MenuItemOnMenuItemClickListenerC3244.m9715(f76464, GF16Utils.GF16_MASK, 3, i73));
                    if (!C3743.f13569) {
                        i30 = iM113011;
                        editText2 = editText5;
                        i31 = i79;
                        spannableString3 = spannableString5;
                        i35 = i77;
                        i38 = i80;
                        sArr2 = sArr4;
                        i32 = i72;
                        i36 = iM11309;
                        i33 = i81;
                        i34 = length;
                        str3 = str4;
                        int iM450229 = (i67 - C19806.m45029("᩶۠")) * (-125);
                        int i8110 = ((iM450229 ^ i68) * 23395) ^ 954841331;
                        i37 = iM450229 ^ 1897473488;
                        str4 = str3;
                        length = i34;
                        iM11309 = i36;
                        i81 = i33;
                        sArr4 = sArr2;
                        i77 = i35;
                        i72 = i32;
                        i80 = i38;
                        editText5 = editText2;
                        spannableString5 = spannableString3;
                        iM113011 = i30;
                        i69 = i8110;
                        i79 = i31;
                        i83 = i;
                        i70 = i37;
                        iM6360 = iM6360;
                    } else {
                        iM45029 = (C19806.m45029("᩹᩺") + i67) * 119;
                        i2 = ((iM45029 ^ i68) * 31857) ^ 1628761407;
                        i3 = -1231417780;
                        int i1216 = iM45029 ^ i3;
                        i83 = i;
                        i70 = i1216;
                        i69 = i2;
                    }
                    break;
                default:
                    C2332.m7081(new C16548(this));
                    i = i83;
                    iM45029 = C19806.m45029("ܽۚ") ^ i67;
                    i2 = ((iM45029 ^ i68) * (-17773)) ^ (-473146876);
                    i3 = 189817605;
                    int i1217 = iM45029 ^ i3;
                    i83 = i;
                    i70 = i1217;
                    i69 = i2;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0264 A[PHI: r1 r2
      0x0264: PHI (r1v11 int) = (r1v2 int), (r1v5 int), (r1v2 int) binds: [B:58:0x0262, B:32:0x0117, B:16:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r2v6 int) = (r2v2 int), (r2v4 int), (r2v2 int) binds: [B:58:0x0262, B:32:0x0117, B:16:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:79:0x0327 A[PHI: r4
      0x0327: PHI (r4v3 short[]) = (r4v2 short[]), (r4v2 short[]), (r4v2 short[]), (r4v2 short[]), (r4v4 short[]) binds: [B:78:0x0325, B:70:0x02d5, B:62:0x0294, B:54:0x023d, B:50:0x021b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52046(C17485 c17485, ViewOnClickListenerC23604 viewOnClickListenerC23604, View view, EditText editText, EditText editText2, TextInputLayout textInputLayout, C1313 c1313) {
        int iM11306;
        int i;
        int i2;
        int iM11307;
        int i3;
        int i4;
        int iM11308 = 0;
        int i5 = 0;
        int iM11309 = 0;
        short[] sArr = null;
        int i6 = 0;
        int i7 = 449545782;
        int i8 = C1977.f7413;
        int i9 = RunnableC3388.f12514;
        int iM113010 = ThreadFactoryC3888.m11306("ۘܳ") ^ i8;
        int i10 = ((iM113010 ^ i9) * (-23955)) ^ 1118888712;
        int i11 = 404720241;
        while (true) {
            int i12 = iM113010 ^ i11;
            while (true) {
                i7 = ((((i7 ^ i9) * (-21417)) >> 31) & i10) ^ i12;
                switch (i7) {
                    case -2117683366:
                    case 248287957:
                        C2704.m8255();
                        if (C3577.f13150 >= 0) {
                            iM11307 = (C19806.m45029("ܰۙ") ^ i9) * (-89);
                            i3 = ((iM11307 ^ i8) * 26049) ^ 226739036;
                            i4 = -372776696;
                            i12 = iM11307 ^ i4;
                            i10 = i3;
                        } else {
                            iM11306 = C19806.m45029("ܶۙ") ^ i9;
                            i = ((iM11306 ^ i8) * (-13119)) ^ (-440360567);
                            i2 = -1423969399;
                            i12 = iM11306 ^ i2;
                            i10 = i;
                        }
                        break;
                    case -1944183285:
                    case -1832326528:
                        if (C2642.f10294 > 0) {
                            iM11306 = C19806.m45029("ᩴܳ") ^ i8;
                            i = ((iM11306 ^ i9) * (-31223)) ^ (-1446313301);
                            i2 = 1556755566;
                            i12 = iM11306 ^ i2;
                            i10 = i;
                        } else {
                            iM11307 = (C19806.m45029("ܰۙ") ^ i9) * (-89);
                            i3 = ((iM11307 ^ i8) * 26049) ^ 226739036;
                            i4 = -372776696;
                            i12 = iM11307 ^ i4;
                            i10 = i3;
                        }
                        break;
                    case -1933376274:
                    case 1528963403:
                        if (C10634.f36300 >= 0) {
                            iM11306 = C19806.m45029("ᩴܳ") ^ i8;
                            i = ((iM11306 ^ i9) * (-31223)) ^ (-1446313301);
                            i2 = 1556755566;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ᩴᩳ") + i8) * (-121);
                            i = ((iM11306 ^ i9) * (-3911)) ^ (-1808065424);
                            i2 = -177684191;
                        }
                        i12 = iM11306 ^ i2;
                        i10 = i;
                        break;
                    case -1737547773:
                    case 1875121384:
                        C2704.m8238(c1313, C3660.m10790(f76464, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, 8, i6));
                        C1419.m4978(c17485);
                        if (C0962.m3738(c1313)) {
                            iM11306 = C19806.m45029("ۙۗ") ^ i9;
                            i = ((iM11306 ^ i8) * 28281) ^ 8730274;
                            i2 = -1315071179;
                        } else {
                            iM11306 = (i8 - C19806.m45029("᩷۟")) * (-35);
                            i = ((iM11306 ^ i9) * 10205) ^ 710865330;
                            i2 = 1905553753;
                        }
                        i12 = iM11306 ^ i2;
                        i10 = i;
                        break;
                    case -1281783383:
                    case 1466718948:
                        C0797.m3359();
                        if (C0216.f1393 != 0) {
                        }
                        iM11306 = C19806.m45029("ᩴܳ") ^ i8;
                        i = ((iM11306 ^ i9) * (-31223)) ^ (-1446313301);
                        i2 = 1556755566;
                        i12 = iM11306 ^ i2;
                        i10 = i;
                        break;
                    case -1234706878:
                    case 680209723:
                        i6 = 33942;
                        iM11306 = (C19806.m45029("ܽᩳ") ^ i9) * 127;
                        i = ((iM11306 ^ i8) * 22611) ^ 1435019074;
                        i2 = 230800895;
                        i12 = iM11306 ^ i2;
                        i10 = i;
                        break;
                    case -1204232043:
                    case 1625741664:
                        if (C3722.m10899(c1313) == 1100) {
                            iM11306 = ThreadFactoryC3888.m11306("᩸ۡ") ^ i8;
                            i = ((iM11306 ^ i9) * 28241) ^ 493145199;
                            i2 = -1279491540;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("᩺᩵") ^ i8) * 101;
                            i = ((iM11306 ^ i9) * (-15255)) ^ 1930180034;
                            i2 = 1324195135;
                        }
                        i12 = iM11306 ^ i2;
                        i10 = i;
                        break;
                    case -1151847332:
                    case -507894591:
                        C2642.m8170(textInputLayout, ThreadFactoryC3888.m11306(ViewTreeObserverOnPreDrawListenerC3327.m9869(f76464, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 3, i6)) ^ 2124059424);
                        break;
                    case -864161461:
                    case 798863764:
                        viewOnClickListenerC23604.m52036();
                        iM11308 = ThreadFactoryC3888.m11306(ThreadFactoryC3888.m11312(f76464, UMErrorCode.E_UM_BE_CREATE_FAILED, 3, i6));
                        i5 = 2122344807;
                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                            iM11306 = C19806.m45029("ܶۙ") ^ i9;
                            i = ((iM11306 ^ i8) * (-13119)) ^ (-440360567);
                            i2 = -1423969399;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("֡֫") + i8) * 29;
                            i = ((iM11306 ^ i9) * 32399) ^ (-1475292431);
                            i2 = -1806867393;
                        }
                        i12 = iM11306 ^ i2;
                        i10 = i;
                        break;
                    case -861883468:
                    case -282098018:
                        if (C1461.f5957 <= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("᩸ۘ") ^ i9;
                            i = ((iM11306 ^ i8) * (-9177)) ^ (-732212848);
                            i2 = -915435461;
                        } else {
                            iM11306 = C19806.m45029("ܽܳ") ^ i8;
                            i = ((iM11306 ^ i9) * 18759) ^ (-1742829420);
                            i2 = 1041685220;
                        }
                        i12 = iM11306 ^ i2;
                        i10 = i;
                        break;
                    case -843842490:
                    case 1243270318:
                        if (C10634.f36300 >= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("᩸ۘ") ^ i9;
                            i = ((iM11306 ^ i8) * (-9177)) ^ (-732212848);
                            i2 = -915435461;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("᩵᩻") ^ i9;
                            i = ((iM11306 ^ i8) * 16555) ^ 119634810;
                            i2 = 314620919;
                        }
                        i12 = iM11306 ^ i2;
                        i10 = i;
                        break;
                    case -564971111:
                    case 1813225718:
                        if (C3577.f13150 >= 0) {
                            iM11306 = C19806.m45029("ᩴܳ") ^ i8;
                            i = ((iM11306 ^ i9) * (-31223)) ^ (-1446313301);
                            i2 = 1556755566;
                        } else {
                            iM11306 = C19806.m45029("᩻᩻") ^ i9;
                            i = ((iM11306 ^ i8) * 31917) ^ (-744566166);
                            i2 = -1041769957;
                        }
                        i12 = iM11306 ^ i2;
                        i10 = i;
                        break;
                    case -554031991:
                    case 1297392767:
                        C2477.m7603(C2642.m8167(view, iM11308 ^ i5), false);
                        RunnableC1606.m5477(editText, false);
                        C1977.m6361(editText2);
                        viewOnClickListenerC23604.m52038();
                        break;
                    case -417133424:
                    case 1039948279:
                        sArr = f76464;
                        if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("᩸ۘ") ^ i9;
                            i = ((iM11306 ^ i8) * (-9177)) ^ (-732212848);
                            i2 = -915435461;
                        } else {
                            iM11306 = (C19806.m45029("᩶ܿ") ^ i9) * (-5);
                            i = ((iM11306 ^ i8) * (-12233)) ^ (-607366839);
                            i2 = -477304494;
                        }
                        i12 = iM11306 ^ i2;
                        i10 = i;
                        break;
                    case -378184326:
                    case 1379783822:
                        if (C10634.m26820()) {
                            iM11306 = C19806.m45029("ܶۙ") ^ i9;
                            i = ((iM11306 ^ i8) * (-13119)) ^ (-440360567);
                            i2 = -1423969399;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("᩺ۙ") ^ i9;
                            i = ((iM11306 ^ i8) * 12521) ^ (-1385600836);
                            i2 = -257447489;
                        }
                        i12 = iM11306 ^ i2;
                        i10 = i;
                        break;
                    case -232339122:
                    case 643712224:
                        C2704.m8256(C0526.m2431(c1313, 2126553779 ^ iM11309));
                        break;
                    case -130095790:
                    case 530165840:
                        C2871.m8646();
                        C1025.m3861();
                        iM11306 = C19806.m45029("ܶۙ") ^ i9;
                        i = ((iM11306 ^ i8) * (-13119)) ^ (-440360567);
                        i2 = -1423969399;
                        i12 = iM11306 ^ i2;
                        i10 = i;
                        break;
                    case 174187936:
                    case 303862963:
                        short s = sArr[102];
                        if (((s * s) + 100922116) - (s * 20092) >= 0) {
                            iM11306 = (i9 - C19806.m45029("᩷᩵")) * 93;
                            i = ((iM11306 ^ i8) * (-18265)) ^ (-447667114);
                            i2 = -750520833;
                        } else {
                            iM11306 = (C19806.m45029("ۡۗ") + i8) * 89;
                            i = ((iM11306 ^ i9) * 17875) ^ (-648045607);
                            i2 = -2096502722;
                        }
                        i12 = iM11306 ^ i2;
                        i10 = i;
                        break;
                    case 308066404:
                    case 1280994338:
                        iM11309 = ThreadFactoryC3888.m11306(C1419.m4969(f76464, 114, 3, i6));
                        if (C0962.f3784) {
                            iM11307 = (C19806.m45029("ܰۙ") ^ i9) * (-89);
                            i3 = ((iM11307 ^ i8) * 26049) ^ 226739036;
                            i4 = -372776696;
                        } else {
                            iM11307 = (i9 - ThreadFactoryC3888.m11306("᩻ܶ")) * (-113);
                            i3 = ((iM11307 ^ i8) * (-9545)) ^ (-1039960186);
                            i4 = 1700566652;
                        }
                        i12 = iM11307 ^ i4;
                        i10 = i3;
                        break;
                    case 570003303:
                    case 1856267167:
                        if (C1189.f5284 <= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("᩸ۘ") ^ i9;
                            i = ((iM11306 ^ i8) * (-9177)) ^ (-732212848);
                            i2 = -915435461;
                        } else {
                            iM11306 = (i8 - C19806.m45029("᩺ۤ")) * (-125);
                            i = ((iM11306 ^ i9) * 1709) ^ (-519943814);
                            i2 = -919969415;
                        }
                        i12 = iM11306 ^ i2;
                        i10 = i;
                        break;
                    case 891282517:
                    case 1623992708:
                        C1025.m3861();
                        C2642.m8171();
                        break;
                    case 1430212305:
                    case 1608803524:
                        if (C0216.f1393 != 0) {
                            iM11306 = ThreadFactoryC3888.m11306("᩸ۘ") ^ i9;
                            i = ((iM11306 ^ i8) * (-9177)) ^ (-732212848);
                            i2 = -915435461;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ۤ᩹") ^ i8) * 75;
                            i = ((iM11306 ^ i9) * (-3559)) ^ 173247184;
                            i2 = -287161343;
                        }
                        i12 = iM11306 ^ i2;
                        i10 = i;
                        break;
                    default:
                        i6 = 65374;
                        iM11306 = (C19806.m45029("ܽᩳ") ^ i9) * 127;
                        i = ((iM11306 ^ i8) * 22611) ^ 1435019074;
                        i2 = 230800895;
                        i12 = iM11306 ^ i2;
                        i10 = i;
                        break;
                }
                return;
            }
            iM113010 = (i8 - ThreadFactoryC3888.m11306("ܰۨ")) * 69;
            i10 = ((iM113010 ^ i9) * (-27589)) ^ 1989183482;
            i11 = -1987222660;
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x030a A[PHI: r5 r6 r7 r8 r16
      0x030a: PHI (r5v4 short[]) = (r5v2 short[]), (r5v2 short[]), (r5v2 short[]), (r5v3 short[]), (r5v2 short[]) binds: [B:77:0x0308, B:73:0x02ea, B:65:0x029a, B:57:0x0249, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x030a: PHI (r6v4 char) = (r6v2 char), (r6v2 char), (r6v2 char), (r6v3 char), (r6v2 char) binds: [B:77:0x0308, B:73:0x02ea, B:65:0x029a, B:57:0x0249, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x030a: PHI (r7v3 short) = (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v6 short) binds: [B:77:0x0308, B:73:0x02ea, B:65:0x029a, B:57:0x0249, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x030a: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v6 int) binds: [B:77:0x0308, B:73:0x02ea, B:65:0x029a, B:57:0x0249, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x030a: PHI (r16v30 android.widget.TextView) = 
      (r16v4 android.widget.TextView)
      (r16v5 android.widget.TextView)
      (r16v7 android.widget.TextView)
      (r16v9 android.widget.TextView)
      (r16v34 android.widget.TextView)
     binds: [B:77:0x0308, B:73:0x02ea, B:65:0x029a, B:57:0x0249, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        if (l.RunnableC3388.f12514 < 0) goto L10;
     */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m52063(l.C17485 r19, l.DialogInterfaceC19356 r20, l.C1313 r21, l.ViewOnClickListenerC23604 r22, com.google.android.material.textfield.TextInputLayout r23) {
        /*
            Method dump skipped, instruction units count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC23604.m52063(l.ܿܿۚ, l.᩵ۡۜ, l.֨ᩴ᩺, l.᩻ۡ᩺, com.google.android.material.textfield.TextInputLayout):void");
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0262 A[PHI: r5 r6 r16 r17 r18
      0x0262: PHI (r5v5 java.lang.String) = (r5v2 java.lang.String), (r5v4 java.lang.String), (r5v2 java.lang.String) binds: [B:17:0x0060, B:67:0x0260, B:49:0x016e] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r6v3 java.lang.String) = (r6v2 java.lang.String), (r6v2 java.lang.String), (r6v5 java.lang.String) binds: [B:17:0x0060, B:67:0x0260, B:49:0x016e] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r16v18 int) = (r16v3 int), (r16v13 int), (r16v19 int) binds: [B:17:0x0060, B:67:0x0260, B:49:0x016e] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r17v15 short[]) = (r17v0 short[]), (r17v10 short[]), (r17v16 short[]) binds: [B:17:0x0060, B:67:0x0260, B:49:0x016e] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r18v15 char) = (r18v0 char), (r18v10 char), (r18v16 char) binds: [B:17:0x0060, B:67:0x0260, B:49:0x016e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x02b8 A[PHI: r3 r16 r17 r18
      0x02b8: PHI (r3v5 java.lang.String) = (r3v4 java.lang.String), (r3v2 java.lang.String) binds: [B:71:0x02a1, B:61:0x0226] A[DONT_GENERATE, DONT_INLINE]
      0x02b8: PHI (r16v14 int) = (r16v12 int), (r16v15 int) binds: [B:71:0x02a1, B:61:0x0226] A[DONT_GENERATE, DONT_INLINE]
      0x02b8: PHI (r17v11 short[]) = (r17v9 short[]), (r17v12 short[]) binds: [B:71:0x02a1, B:61:0x0226] A[DONT_GENERATE, DONT_INLINE]
      0x02b8: PHI (r18v11 char) = (r18v9 char), (r18v12 char) binds: [B:71:0x02a1, B:61:0x0226] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02e6 A[PHI: r16 r17 r18
      0x02e6: PHI (r16v20 int) = (r16v11 int), (r16v21 int) binds: [B:75:0x02e4, B:43:0x0131] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r17v17 short[]) = (r17v8 short[]), (r17v18 short[]) binds: [B:75:0x02e4, B:43:0x0131] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r18v17 char) = (r18v8 char), (r18v18 char) binds: [B:75:0x02e4, B:43:0x0131] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x0435 A[PHI: r16 r17 r18
      0x0435: PHI (r16v27 int) = (r16v4 int), (r16v5 int), (r16v28 int) binds: [B:98:0x0433, B:94:0x0410, B:9:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0435: PHI (r17v24 short[]) = (r17v1 short[]), (r17v2 short[]), (r17v25 short[]) binds: [B:98:0x0433, B:94:0x0410, B:9:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0435: PHI (r18v26 char) = (r18v1 char), (r18v2 char), (r18v27 char) binds: [B:98:0x0433, B:94:0x0410, B:9:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r8v106, types: [l.ۜۡ᩺] */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m52055(EditText editText, EditText editText2, final DialogInterfaceC19356 dialogInterfaceC19356, final ViewOnClickListenerC23604 viewOnClickListenerC23604, TextInputLayout textInputLayout, final TextInputLayout textInputLayout2) {
        int iM45029;
        int i;
        int i2;
        char c;
        String strM3407 = null;
        String strM6674 = null;
        String strM4832 = null;
        String strM4230 = null;
        String strM10056 = null;
        short[] sArr = null;
        char c2 = 0;
        int i3 = 0;
        int i4 = 469686221;
        int i5 = C1189.f5284;
        int i6 = C1025.f4800;
        int iM450210 = C19806.m45029("ۢ۬") ^ i5;
        int i7 = ((iM450210 ^ i6) * (-19747)) ^ 614729694;
        int i8 = 1714506830;
        while (true) {
            int i9 = iM450210 ^ i8;
            while (true) {
                i4 = ((((i4 ^ i6) * (-2701)) >> 31) & i7) ^ i9;
                switch (i4) {
                    case -2004661934:
                    case 1790914453:
                        sArr = sArr;
                        c2 = c2;
                        i4 = i4;
                        strM4832 = C1377.m4832(f76464, 236, 3, i3);
                        if (C1875.f7103 >= 0) {
                            iM45029 = C19806.m45029("۫᩷") ^ i6;
                            i7 = ((iM45029 ^ i5) * (-31227)) ^ 1620234024;
                            i = 1174799839;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("ᩳܽ") ^ i6;
                            i7 = ((iM45029 ^ i5) * (-821)) ^ (-1391962166);
                            i = 1558539683;
                        }
                        i9 = iM45029 ^ i;
                        i4 = i4;
                        sArr = sArr;
                        c2 = c2;
                        break;
                    case -1940413882:
                    case -245503344:
                        C2642.m8170(textInputLayout, C19806.m45029(strM4832) ^ 2119037168);
                        break;
                    case -1898390827:
                    case -749689249:
                        sArr = sArr;
                        c2 = c2;
                        i4 = i4;
                        if (new C16762(C2249.m6918(f76464, 239, 3, i3)).m39325((CharSequence) strM3407)) {
                            iM45029 = (ThreadFactoryC3888.m11306("֡ۤ") ^ i6) * (-101);
                            i7 = ((iM45029 ^ i5) * (-14229)) ^ 1139067464;
                            i = 1413207698;
                        } else {
                            iM45029 = (C19806.m45029("ۧܶ") ^ i5) * (-91);
                            i7 = ((iM45029 ^ i6) * 30899) ^ 1468268604;
                            i = -1636167420;
                        }
                        i9 = iM45029 ^ i;
                        i4 = i4;
                        sArr = sArr;
                        c2 = c2;
                        break;
                    case -1844325041:
                    case 669095662:
                        i2 = i4;
                        sArr = f76464;
                        c = 235;
                        if (RunnableC3388.m10064()) {
                            int iM11306 = (ThreadFactoryC3888.m11306("᩻ۙ") ^ i6) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i7 = ((iM11306 ^ i5) * 26575) ^ 1453320994;
                            i9 = iM11306 ^ 1960858765;
                            i4 = i2;
                            c2 = 235;
                        } else {
                            int iM450211 = (C19806.m45029("᩸ۘ") ^ i5) * 119;
                            i7 = ((iM450211 ^ i6) * (-9231)) ^ 531864989;
                            i9 = iM450211 ^ 1074512335;
                            c2 = c;
                            i4 = i2;
                        }
                        break;
                    case -1766391300:
                    case -496505714:
                        C1461.m5080();
                        if (C10634.f36300 < 0) {
                        }
                        i2 = i4;
                        c = c2;
                        int iM450212 = (C19806.m45029("᩸ۘ") ^ i5) * 119;
                        i7 = ((iM450212 ^ i6) * (-9231)) ^ 531864989;
                        i9 = iM450212 ^ 1074512335;
                        c2 = c;
                        i4 = i2;
                        break;
                    case -1751744227:
                    case 1883561320:
                        C1398.m4895();
                        break;
                    case -1696165969:
                    case 138333355:
                        sArr = sArr;
                        c2 = c2;
                        i4 = i4;
                        strM10056 = RunnableC3388.m10056(f76464, 245, 3, i3);
                        if (C1377.f5749) {
                            iM45029 = ThreadFactoryC3888.m11306("᩵֫") ^ i6;
                            i7 = ((iM45029 ^ i5) * 23929) ^ (-2123269261);
                            i = 359827186;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("᩵۬") ^ i6;
                            i7 = ((iM45029 ^ i5) * 27209) ^ (-1938597560);
                            i = 1629936859;
                        }
                        i9 = iM45029 ^ i;
                        i4 = i4;
                        sArr = sArr;
                        c2 = c2;
                        break;
                    case -1546051326:
                    case -977521503:
                        sArr = sArr;
                        c2 = c2;
                        i4 = i4;
                        if (viewOnClickListenerC23604.f76467.m50803()) {
                            iM45029 = C19806.m45029("ᩳۡ") ^ i5;
                            i7 = ((iM45029 ^ i6) * 29261) ^ (-519641085);
                            i = -1888384507;
                        } else {
                            iM45029 = (i5 - ThreadFactoryC3888.m11306("֡ᩴ")) * (-73);
                            i7 = ((iM45029 ^ i6) * 20719) ^ 1684688758;
                            i = 147488382;
                        }
                        i9 = iM45029 ^ i;
                        i4 = i4;
                        sArr = sArr;
                        c2 = c2;
                        break;
                    case -1503336080:
                    case -977253397:
                        C2642.m8170(textInputLayout2, C19806.m45029(strM10056) ^ 2126803163);
                        break;
                    case -1459178439:
                    case -30752330:
                        sArr = sArr;
                        c2 = c2;
                        i4 = i4;
                        strM6674 = C2124.m6674(ViewTreeObserverOnPreDrawListenerC3327.m9864(editText2));
                        if (C1334.m4737(strM6674)) {
                            iM45029 = C19806.m45029("۟ۙ") ^ i5;
                            i7 = ((iM45029 ^ i6) * 21159) ^ (-382112853);
                            i = -1861743323;
                        } else {
                            iM45029 = (C19806.m45029("ᩴ᩶") + i5) * 69;
                            i7 = ((iM45029 ^ i6) * (-27359)) ^ 2060601504;
                            i = 920987936;
                        }
                        i9 = iM45029 ^ i;
                        i4 = i4;
                        sArr = sArr;
                        c2 = c2;
                        break;
                    case -1315695869:
                    case 594498362:
                        if (!C0962.f3784) {
                        }
                        sArr = sArr;
                        c2 = c2;
                        i4 = i4;
                        iM45029 = (C19806.m45029("᩷ۢ") + i5) * (-59);
                        i7 = ((iM45029 ^ i6) * (-10761)) ^ (-1085202831);
                        i = -549671310;
                        i9 = iM45029 ^ i;
                        i4 = i4;
                        sArr = sArr;
                        c2 = c2;
                        break;
                    case -1244274545:
                    case 376908341:
                        sArr = sArr;
                        c2 = c2;
                        i4 = i4;
                        if (C3535.f13026 <= 0) {
                            iM45029 = (C19806.m45029("᩷ۢ") + i5) * (-59);
                            i7 = ((iM45029 ^ i6) * (-10761)) ^ (-1085202831);
                            i = -549671310;
                        } else {
                            iM45029 = (i5 - C19806.m45029("ܺ᩻")) * (-57);
                            i7 = ((iM45029 ^ i6) * (-16857)) ^ (-771093144);
                            i = 2032755500;
                        }
                        i9 = iM45029 ^ i;
                        i4 = i4;
                        sArr = sArr;
                        c2 = c2;
                        break;
                    case -1167295771:
                    case 220928428:
                        sArr = sArr;
                        c2 = c2;
                        i4 = i4;
                        strM3407 = C0817.m3407(C3577.m10576(editText));
                        if (C1977.m6360(strM3407) == 6) {
                            iM45029 = ThreadFactoryC3888.m11306("۟۬") ^ i6;
                            i7 = ((iM45029 ^ i5) * (-12767)) ^ 960822777;
                            i = 1584002551;
                        } else {
                            iM45029 = (C19806.m45029("ۧܶ") ^ i5) * (-91);
                            i7 = ((iM45029 ^ i6) * 30899) ^ 1468268604;
                            i = -1636167420;
                        }
                        i9 = iM45029 ^ i;
                        i4 = i4;
                        sArr = sArr;
                        c2 = c2;
                        break;
                    case -1053090677:
                    case 582600722:
                        AbstractC0464.m2313();
                        break;
                    case -1043807714:
                    case 706426922:
                        if (!C0797.f3386) {
                            i2 = i4;
                            c = c2;
                            int iM450213 = (C19806.m45029("᩸ۘ") ^ i5) * 119;
                            i7 = ((iM450213 ^ i6) * (-9231)) ^ 531864989;
                            i9 = iM450213 ^ 1074512335;
                            c2 = c;
                            i4 = i2;
                        } else {
                            sArr = sArr;
                            c2 = c2;
                            i4 = i4;
                            iM45029 = C19806.m45029("۫᩷") ^ i6;
                            i7 = ((iM45029 ^ i5) * (-31227)) ^ 1620234024;
                            i = 1174799839;
                            i9 = iM45029 ^ i;
                            i4 = i4;
                            sArr = sArr;
                            c2 = c2;
                        }
                        break;
                    case -888604852:
                    case 1369099637:
                        sArr = sArr;
                        c2 = c2;
                        i4 = i4;
                        if (C2249.m6915() <= 0) {
                            iM45029 = ThreadFactoryC3888.m11306("ۨ֨") ^ i5;
                            i7 = ((iM45029 ^ i6) * (-21117)) ^ 2061474639;
                            i = 1785649361;
                        } else {
                            iM45029 = (i5 - ThreadFactoryC3888.m11306("۠᩶")) * (-85);
                            i7 = ((iM45029 ^ i6) * (-10989)) ^ (-1982443885);
                            i = 717385670;
                        }
                        i9 = iM45029 ^ i;
                        i4 = i4;
                        sArr = sArr;
                        c2 = c2;
                        break;
                    case -827269646:
                    case -660750301:
                        sArr = sArr;
                        c2 = c2;
                        i4 = i4;
                        if (C19328.m44319(textInputLayout, textInputLayout2)) {
                            iM45029 = C19806.m45029("ᩳۡ") ^ i5;
                            i7 = ((iM45029 ^ i6) * 29261) ^ (-519641085);
                            i = -1888384507;
                        } else {
                            iM45029 = (i5 - ThreadFactoryC3888.m11306("۫ۖ")) * (-53);
                            i7 = ((iM45029 ^ i6) * (-24739)) ^ 1910620816;
                            i = -861774386;
                        }
                        i9 = iM45029 ^ i;
                        i4 = i4;
                        sArr = sArr;
                        c2 = c2;
                        break;
                    case -747519153:
                    case 1964077343:
                        sArr = sArr;
                        c2 = c2;
                        i4 = i4;
                        strM4230 = C1148.m4230(f76464, 242, 3, i3);
                        if (C19806.m45024()) {
                            iM45029 = C19806.m45029("۫᩷") ^ i6;
                            i7 = ((iM45029 ^ i5) * (-31227)) ^ 1620234024;
                            i = 1174799839;
                        } else {
                            iM45029 = (C19806.m45029("᩵ۜ") ^ i6) * (-65);
                            i7 = ((iM45029 ^ i5) * 23331) ^ (-1227285320);
                            i = -92387908;
                        }
                        i9 = iM45029 ^ i;
                        i4 = i4;
                        sArr = sArr;
                        c2 = c2;
                        break;
                    case -514954034:
                    case 1194382617:
                        sArr = sArr;
                        c2 = c2;
                        i4 = i4;
                        if (C13465.m32965((Object) strM6674, (Object) C1709.m5689())) {
                            iM45029 = (i5 - ThreadFactoryC3888.m11306("᩷۠")) * 41;
                            i7 = ((iM45029 ^ i6) * 9325) ^ 1968290399;
                            i = 1613356167;
                        } else {
                            iM45029 = (C19806.m45029("ۜ᩺") + i6) * 25;
                            i7 = ((iM45029 ^ i5) * 12095) ^ (-1469076145);
                            i = -1530628476;
                        }
                        i9 = iM45029 ^ i;
                        i4 = i4;
                        sArr = sArr;
                        c2 = c2;
                        break;
                    case -188462292:
                    case 589878729:
                        int iM2432 = C0526.m2432(strM3407);
                        i4 = i4;
                        short[] sArr2 = f76464;
                        sArr = sArr;
                        if (C0278.m1789() > 0) {
                            c2 = c2;
                            int iM450214 = C19806.m45029(C3286.m9788(sArr2, 248, 3, i3));
                            if (C1419.f5860 < 0) {
                                final C17485 c17485 = new C17485(viewOnClickListenerC23604, iM450214 ^ 2097226446);
                                C1025.m3858(c17485);
                                if (!C1977.m6356()) {
                                    C3743.m10965(new C0982(iM2432, strM6674, viewOnClickListenerC23604, new InterfaceC6627() { // from class: l.ۜۡ᩺
                                        @Override // l.InterfaceC6627
                                        /* JADX INFO: renamed from: ۙ */
                                        public final void mo3852(C1313 c1313) {
                                            ViewOnClickListenerC23604 viewOnClickListenerC23605 = null;
                                            TextInputLayout textInputLayout3 = null;
                                            int i10 = 1020984018;
                                            int i11 = C1398.f5802;
                                            int i12 = C0629.f2722;
                                            int iM450215 = C19806.m45029("ᩴܶ") ^ i11;
                                            int i13 = ((iM450215 ^ i12) * 8157) ^ (-1141357817);
                                            int i14 = 1741616565;
                                            while (true) {
                                                i10 = ((((i10 ^ i12) * (-2671)) >> 31) & i13) ^ (iM450215 ^ i14);
                                                switch (i10) {
                                                    case -2022497892:
                                                    case -1204680250:
                                                        C1875.m6086();
                                                        C3743.m10966();
                                                        iM450215 = C19806.m45029("ܶܽ") ^ i12;
                                                        i13 = ((iM450215 ^ i11) * 7635) ^ (-2063528654);
                                                        i14 = -1738748377;
                                                        break;
                                                    case -1959528412:
                                                    case 1362617676:
                                                        C0216.m1591();
                                                        break;
                                                    case -1630192482:
                                                    case -1517390109:
                                                        if (RunnableC1895.f7152) {
                                                            iM450215 = (C19806.m45029("᩶ۛ") + i12) * 127;
                                                            i13 = ((iM450215 ^ i11) * 8463) ^ (-634601503);
                                                            i14 = 264389915;
                                                        } else {
                                                            iM450215 = (C19806.m45029("ۚۡ") + i11) * (-9);
                                                            i13 = ((iM450215 ^ i12) * (-22861)) ^ (-862755979);
                                                            i14 = -1853171194;
                                                        }
                                                        break;
                                                    case -1629543932:
                                                    case -1117603734:
                                                        if (C0962.m3746() >= 0) {
                                                            iM450215 = (C19806.m45029("ۚۡ") + i11) * (-9);
                                                            i13 = ((iM450215 ^ i12) * (-22861)) ^ (-862755979);
                                                            i14 = -1853171194;
                                                        } else {
                                                            iM450215 = (C19806.m45029("᩺᩻") ^ i12) * (-67);
                                                            i13 = ((iM450215 ^ i11) * 4391) ^ 57237759;
                                                            i14 = -535204988;
                                                        }
                                                        break;
                                                    case -1445941876:
                                                    case 888975707:
                                                        viewOnClickListenerC23605 = viewOnClickListenerC23604;
                                                        if (C0629.f2722 <= 0) {
                                                            iM450215 = (C19806.m45029("ۚۡ") + i11) * (-9);
                                                            i13 = ((iM450215 ^ i12) * (-22861)) ^ (-862755979);
                                                            i14 = -1853171194;
                                                        } else {
                                                            iM450215 = C19806.m45029("ۧᩳ") ^ i12;
                                                            i13 = ((iM450215 ^ i11) * 16765) ^ (-1495272182);
                                                            i14 = -245294059;
                                                        }
                                                        break;
                                                    case -752406056:
                                                    case 1864537416:
                                                        if (C0962.f3784) {
                                                            iM450215 = ThreadFactoryC3888.m11306("ۗۜ") ^ i11;
                                                            i13 = ((iM450215 ^ i12) * 19839) ^ (-157552002);
                                                            i14 = -1826101538;
                                                        } else {
                                                            iM450215 = (ThreadFactoryC3888.m11306("֡֫") + i12) * (-51);
                                                            i13 = ((iM450215 ^ i11) * (-851)) ^ 477937098;
                                                            i14 = 793396891;
                                                        }
                                                        break;
                                                    case -673761738:
                                                    case -502383427:
                                                        textInputLayout3 = textInputLayout2;
                                                        if (C1461.m5080()) {
                                                            iM450215 = ThreadFactoryC3888.m11306("ᩳ۬") ^ i11;
                                                            i13 = ((iM450215 ^ i12) * 19643) ^ 1957232384;
                                                            i14 = 1412283935;
                                                        } else {
                                                            iM450215 = (ThreadFactoryC3888.m11306("ܳ᩵") ^ i11) * (-3);
                                                            i13 = ((iM450215 ^ i12) * 22907) ^ 973989188;
                                                            i14 = -1845910656;
                                                        }
                                                        break;
                                                    case -404886013:
                                                    case 1980449849:
                                                        if (C2124.f7782 <= 0) {
                                                            iM450215 = ThreadFactoryC3888.m11306("ۗۜ") ^ i11;
                                                            i13 = ((iM450215 ^ i12) * 19839) ^ (-157552002);
                                                            i14 = -1826101538;
                                                        } else {
                                                            iM450215 = ThreadFactoryC3888.m11306("ۘۘ") ^ i11;
                                                            i13 = ((iM450215 ^ i12) * (-10433)) ^ 1766155642;
                                                            i14 = -1902405602;
                                                        }
                                                        break;
                                                    case -306987366:
                                                    case 2132407399:
                                                        if (ViewGroupOnHierarchyChangeListenerC1916.m6233() == 0) {
                                                            iM450215 = (i12 - ThreadFactoryC3888.m11306("ۡᩳ")) * (-117);
                                                            i13 = ((iM450215 ^ i11) * (-13235)) ^ 420400584;
                                                            i14 = -383702234;
                                                        } else {
                                                            iM450215 = ThreadFactoryC3888.m11306("ۗۜ") ^ i11;
                                                            i13 = ((iM450215 ^ i12) * 19839) ^ (-157552002);
                                                            i14 = -1826101538;
                                                        }
                                                        break;
                                                    case -280544925:
                                                    case 1394406298:
                                                        ViewOnClickListenerC23604.m52045(c17485, dialogInterfaceC19356, c1313, viewOnClickListenerC23605, textInputLayout3);
                                                        break;
                                                    case -143521312:
                                                    case 656524439:
                                                        if (C1419.f5860 >= 0) {
                                                            iM450215 = ThreadFactoryC3888.m11306("ۗۜ") ^ i11;
                                                            i13 = ((iM450215 ^ i12) * 19839) ^ (-157552002);
                                                            i14 = -1826101538;
                                                        } else {
                                                            iM450215 = C19806.m45029("ܶܽ") ^ i12;
                                                            i13 = ((iM450215 ^ i11) * 7635) ^ (-2063528654);
                                                            i14 = -1738748377;
                                                        }
                                                        break;
                                                    case 176892853:
                                                    case 1939289438:
                                                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                                                            iM450215 = ThreadFactoryC3888.m11306("ۗۜ") ^ i11;
                                                            i13 = ((iM450215 ^ i12) * 19839) ^ (-157552002);
                                                            i14 = -1826101538;
                                                        } else {
                                                            iM450215 = (ThreadFactoryC3888.m11306("۟ۙ") ^ i11) * (-79);
                                                            i13 = ((iM450215 ^ i12) * (-5657)) ^ (-708045675);
                                                            i14 = 1729933359;
                                                        }
                                                        break;
                                                    case 580462902:
                                                    case 880846292:
                                                        if (C3743.f13569) {
                                                            iM450215 = (i12 - C19806.m45029("ܳ᩸")) * (-5);
                                                            i13 = ((iM450215 ^ i11) * 21449) ^ (-727258526);
                                                            i14 = 2030576230;
                                                        } else {
                                                            iM450215 = ThreadFactoryC3888.m11306("ۗۜ") ^ i11;
                                                            i13 = ((iM450215 ^ i12) * 19839) ^ (-157552002);
                                                            i14 = -1826101538;
                                                        }
                                                        break;
                                                    case 1289288458:
                                                    case 1946504482:
                                                        if (CallableC1627.f6528) {
                                                            iM450215 = ThreadFactoryC3888.m11306("ۜ۠") ^ i11;
                                                            i13 = ((iM450215 ^ i12) * (-25325)) ^ (-915272855);
                                                            i14 = -1245000579;
                                                        } else {
                                                            iM450215 = C19806.m45029("ܶܽ") ^ i12;
                                                            i13 = ((iM450215 ^ i11) * 7635) ^ (-2063528654);
                                                            i14 = -1738748377;
                                                        }
                                                        break;
                                                    case 1693337243:
                                                    case 2134618427:
                                                        RunnableC1895.m6170();
                                                        if (!RunnableC3388.m10064()) {
                                                            iM450215 = (i12 - ThreadFactoryC3888.m11306("ۡᩳ")) * (-117);
                                                            i13 = ((iM450215 ^ i11) * (-13235)) ^ 420400584;
                                                            i14 = -383702234;
                                                        } else {
                                                            iM450215 = (C19806.m45029("ۚۡ") + i11) * (-9);
                                                            i13 = ((iM450215 ^ i12) * (-22861)) ^ (-862755979);
                                                            i14 = -1853171194;
                                                        }
                                                        break;
                                                    default:
                                                        if (C1189.f5284 <= 0) {
                                                            iM450215 = C19806.m45029("ܶܽ") ^ i12;
                                                            i13 = ((iM450215 ^ i11) * 7635) ^ (-2063528654);
                                                            i14 = -1738748377;
                                                        } else {
                                                            iM450215 = (ThreadFactoryC3888.m11306("ۤۤ") + i11) * (-3);
                                                            i13 = ((iM450215 ^ i12) * (-26011)) ^ (-2010291069);
                                                            i14 = 1545920959;
                                                        }
                                                        break;
                                                }
                                                return;
                                            }
                                        }

                                        {
                                            int i10 = 220653460;
                                            int i11 = RunnableC3388.f12514;
                                            int i12 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
                                            int iM11307 = (i12 - ThreadFactoryC3888.m11306("۫᩸")) * 91;
                                            int i13 = ((iM11307 ^ i11) * (-18553)) ^ 849637901;
                                            int i14 = -1675573167;
                                            while (true) {
                                                i10 = ((((i10 ^ i11) * 13223) >> 31) & i13) ^ (iM11307 ^ i14);
                                                switch (i10) {
                                                    case -1745508525:
                                                    case -1137506827:
                                                        if (C2642.f10294 <= 0) {
                                                            iM11307 = ThreadFactoryC3888.m11306("۫ܺ") ^ i12;
                                                            i13 = ((iM11307 ^ i11) * 22179) ^ (-305233870);
                                                            i14 = -1481753325;
                                                        } else {
                                                            iM11307 = (i12 - C19806.m45029("֫۬")) * (-83);
                                                            i13 = ((iM11307 ^ i11) * 25155) ^ (-2115121598);
                                                            i14 = 474590802;
                                                        }
                                                        break;
                                                    case -1621271272:
                                                    case 356040174:
                                                        if (RunnableC0195.m1431()) {
                                                            iM11307 = C19806.m45029("ܽۚ") ^ i11;
                                                            i13 = ((iM11307 ^ i12) * 20747) ^ 941522044;
                                                            i14 = 1325618731;
                                                        } else {
                                                            iM11307 = ThreadFactoryC3888.m11306("۫ܺ") ^ i12;
                                                            i13 = ((iM11307 ^ i11) * 22179) ^ (-305233870);
                                                            i14 = -1481753325;
                                                        }
                                                        break;
                                                    case -1602867907:
                                                    case -950154824:
                                                        if (C7105.f23796 >= 0) {
                                                            iM11307 = ThreadFactoryC3888.m11306("ۛ᩷") ^ i12;
                                                            i13 = ((iM11307 ^ i11) * 2581) ^ (-1553172707);
                                                            i14 = 1112018322;
                                                        } else {
                                                            iM11307 = (ThreadFactoryC3888.m11306("ۛܺ") ^ i11) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                                            i13 = ((iM11307 ^ i12) * (-28261)) ^ 1743442388;
                                                            i14 = -1191443327;
                                                        }
                                                        break;
                                                    case -1545509633:
                                                    case -34619758:
                                                        return;
                                                    case -1317977486:
                                                    case 1886197568:
                                                        if (C3577.f13150 >= 0) {
                                                            iM11307 = ThreadFactoryC3888.m11306("۫ܺ") ^ i12;
                                                            i13 = ((iM11307 ^ i11) * 22179) ^ (-305233870);
                                                            i14 = -1481753325;
                                                        } else {
                                                            iM11307 = ThreadFactoryC3888.m11306("ᩳۨ") ^ i11;
                                                            i13 = ((iM11307 ^ i12) * 3341) ^ 1881240501;
                                                            i14 = 1542913229;
                                                        }
                                                        break;
                                                    case -982961424:
                                                    case 185478909:
                                                        RunnableC1606.m5473();
                                                        if (C1460.f5948 < 0) {
                                                            iM11307 = (ThreadFactoryC3888.m11306("ۛܺ") ^ i11) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                                            i13 = ((iM11307 ^ i12) * (-28261)) ^ 1743442388;
                                                            i14 = -1191443327;
                                                        } else {
                                                            iM11307 = (ThreadFactoryC3888.m11306("ۗ᩷") + i11) * (-33);
                                                            i13 = ((iM11307 ^ i12) * (-10207)) ^ (-174733796);
                                                            i14 = 1372678221;
                                                        }
                                                        break;
                                                    case -973785177:
                                                    case -636503113:
                                                        if (C3743.f13569) {
                                                            iM11307 = (C19806.m45029("ۗۛ") + i12) * 69;
                                                            i13 = ((iM11307 ^ i11) * (-19959)) ^ (-1417748167);
                                                            i14 = -856720103;
                                                        } else {
                                                            iM11307 = (C19806.m45029("ᩳ᩸") ^ i12) * 23;
                                                            i13 = ((iM11307 ^ i11) * (-27803)) ^ (-1871350116);
                                                            i14 = 893974055;
                                                        }
                                                        break;
                                                    case -788315991:
                                                    case 1111946862:
                                                        if (C1419.m4973()) {
                                                            iM11307 = (C19806.m45029("ᩳ᩸") ^ i12) * 23;
                                                            i13 = ((iM11307 ^ i11) * (-27803)) ^ (-1871350116);
                                                            i14 = 893974055;
                                                        } else {
                                                            iM11307 = ThreadFactoryC3888.m11306("ܿܰ") ^ i12;
                                                            i13 = ((iM11307 ^ i11) * 2281) ^ 2018573096;
                                                            i14 = -358134083;
                                                        }
                                                        break;
                                                    case -690308202:
                                                    case 950693392:
                                                        if (C1419.m4973()) {
                                                            iM11307 = (C19806.m45029("ᩳ᩸") ^ i12) * 23;
                                                            i13 = ((iM11307 ^ i11) * (-27803)) ^ (-1871350116);
                                                            i14 = 893974055;
                                                        } else {
                                                            iM11307 = ThreadFactoryC3888.m11306("᩶ۘ") ^ i12;
                                                            i13 = ((iM11307 ^ i11) * (-16223)) ^ (-507921668);
                                                            i14 = 958980593;
                                                        }
                                                        break;
                                                    case -490392204:
                                                    case -286773969:
                                                        C1148.m4232();
                                                        C0797.m3359();
                                                        iM11307 = (ThreadFactoryC3888.m11306("ۗ᩷") + i11) * (-33);
                                                        i13 = ((iM11307 ^ i12) * (-10207)) ^ (-174733796);
                                                        i14 = 1372678221;
                                                        break;
                                                    case -362126289:
                                                    case 1630706869:
                                                        if (C2249.f8050 >= 0) {
                                                            iM11307 = ThreadFactoryC3888.m11306("۫ܺ") ^ i12;
                                                            i13 = ((iM11307 ^ i11) * 22179) ^ (-305233870);
                                                            i14 = -1481753325;
                                                        } else {
                                                            iM11307 = C19806.m45029("ۖ֨") ^ i11;
                                                            i13 = ((iM11307 ^ i12) * 8539) ^ 599050364;
                                                            i14 = -1959225917;
                                                        }
                                                        break;
                                                    case -267157588:
                                                    case 863559938:
                                                        RunnableC1606.m5473();
                                                        C0278.m1789();
                                                        throw new RuntimeException();
                                                    case 213849354:
                                                    case 1707281215:
                                                        if (CallableC1627.f6528) {
                                                            iM11307 = (ThreadFactoryC3888.m11306("ܳᩴ") ^ i12) * (-83);
                                                            i13 = ((iM11307 ^ i11) * (-5155)) ^ (-897573221);
                                                            i14 = 1594855295;
                                                        } else {
                                                            iM11307 = ThreadFactoryC3888.m11306("ۛ᩷") ^ i12;
                                                            i13 = ((iM11307 ^ i11) * 2581) ^ (-1553172707);
                                                            i14 = 1112018322;
                                                        }
                                                        break;
                                                    case 509310548:
                                                    case 988689025:
                                                        if (C2477.f9839 > 0) {
                                                            iM11307 = ThreadFactoryC3888.m11306("۫ܺ") ^ i12;
                                                            i13 = ((iM11307 ^ i11) * 22179) ^ (-305233870);
                                                            i14 = -1481753325;
                                                        } else {
                                                            iM11307 = (ThreadFactoryC3888.m11306("ۗ᩷") + i11) * (-33);
                                                            i13 = ((iM11307 ^ i12) * (-10207)) ^ (-174733796);
                                                            i14 = 1372678221;
                                                        }
                                                        break;
                                                    case 571417048:
                                                    case 1294057029:
                                                        if (C1668.f6641 >= 0) {
                                                            iM11307 = (ThreadFactoryC3888.m11306("ۗ᩷") + i11) * (-33);
                                                            i13 = ((iM11307 ^ i12) * (-10207)) ^ (-174733796);
                                                            i14 = 1372678221;
                                                        } else {
                                                            iM11307 = C19806.m45029("ۜ᩺") ^ i11;
                                                            i13 = ((iM11307 ^ i12) * 9231) ^ 997446437;
                                                            i14 = -962991924;
                                                        }
                                                        break;
                                                    default:
                                                        if (C0962.f3784) {
                                                            iM11307 = (C19806.m45029("ᩳ᩸") ^ i12) * 23;
                                                            i13 = ((iM11307 ^ i11) * (-27803)) ^ (-1871350116);
                                                            i14 = 893974055;
                                                        } else {
                                                            iM11307 = (C19806.m45029("ۡۛ") ^ i11) * 41;
                                                            i13 = ((iM11307 ^ i12) * (-8211)) ^ (-1414311264);
                                                            i14 = 1991057789;
                                                        }
                                                        break;
                                                }
                                            }
                                        }
                                    }));
                                }
                            }
                        } else {
                            c2 = c2;
                        }
                        iM45029 = ThreadFactoryC3888.m11306("ۨ֨") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-21117)) ^ 2061474639;
                        i = 1785649361;
                        i9 = iM45029 ^ i;
                        i4 = i4;
                        sArr = sArr;
                        c2 = c2;
                        break;
                    case -119047292:
                    case 1715480327:
                        C2642.m8170(textInputLayout2, ThreadFactoryC3888.m11306(strM4230) ^ 2121926352);
                        break;
                    case 438876448:
                    case 2042193621:
                        MenuItemOnMenuItemClickListenerC3244.m9701();
                        if (AbstractC0464.f2088 <= 0) {
                            sArr = sArr;
                            c2 = c2;
                            i4 = i4;
                            iM45029 = ThreadFactoryC3888.m11306("᩵۬") ^ i6;
                            i7 = ((iM45029 ^ i5) * 27209) ^ (-1938597560);
                            i = 1629936859;
                            i9 = iM45029 ^ i;
                            i4 = i4;
                            sArr = sArr;
                            c2 = c2;
                        }
                        sArr = sArr;
                        c2 = c2;
                        i4 = i4;
                        iM45029 = (C19806.m45029("᩷ۢ") + i5) * (-59);
                        i7 = ((iM45029 ^ i6) * (-10761)) ^ (-1085202831);
                        i = -549671310;
                        i9 = iM45029 ^ i;
                        i4 = i4;
                        sArr = sArr;
                        c2 = c2;
                        break;
                    case 960214329:
                    case 2011577468:
                        i3 = 29448;
                        iM45029 = ThreadFactoryC3888.m11306("ܿۧ") ^ i6;
                        i7 = ((iM45029 ^ i5) * 11687) ^ (-1670097877);
                        i = 137155428;
                        i9 = iM45029 ^ i;
                        i4 = i4;
                        sArr = sArr;
                        c2 = c2;
                        break;
                    case 1664551782:
                    case 1669956555:
                        i3 = 22720;
                        iM45029 = ThreadFactoryC3888.m11306("ܿۧ") ^ i6;
                        i7 = ((iM45029 ^ i5) * 11687) ^ (-1670097877);
                        i = 137155428;
                        i9 = iM45029 ^ i;
                        i4 = i4;
                        sArr = sArr;
                        c2 = c2;
                        break;
                    case 1714643326:
                    case 1779287148:
                        sArr = sArr;
                        c2 = c2;
                        i4 = i4;
                        short s = sArr[c2];
                        if (((s * s) + 71031184) - (s * 16856) < 0) {
                            iM45029 = C19806.m45029("֨ۡ") ^ i6;
                            i7 = ((iM45029 ^ i5) * 17119) ^ 1761118748;
                            i = -1487438198;
                        } else {
                            iM45029 = (i5 - ThreadFactoryC3888.m11306("ۘۡ")) * (-117);
                            i7 = ((iM45029 ^ i6) * (-10793)) ^ 494372956;
                            i = -744980109;
                        }
                        i9 = iM45029 ^ i;
                        i4 = i4;
                        sArr = sArr;
                        c2 = c2;
                        break;
                    case 2035364604:
                    case 2038240813:
                        sArr = sArr;
                        c2 = c2;
                        i4 = i4;
                        if (C1189.m4368() <= 0) {
                            iM45029 = (C19806.m45029("᩷ۢ") + i5) * (-59);
                            i7 = ((iM45029 ^ i6) * (-10761)) ^ (-1085202831);
                            i = -549671310;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("ܶۙ") ^ i6) * (-85);
                            i7 = ((iM45029 ^ i5) * (-32541)) ^ 1132913894;
                            i = -458358383;
                        }
                        i9 = iM45029 ^ i;
                        i4 = i4;
                        sArr = sArr;
                        c2 = c2;
                        break;
                }
                return;
            }
            iM450210 = ThreadFactoryC3888.m11306("۬᩺") ^ i6;
            i7 = ((iM450210 ^ i5) * 20361) ^ 2068976617;
            i8 = -234304045;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m52058(ViewOnClickListenerC23604 viewOnClickListenerC23604) {
        viewOnClickListenerC23604.m52036();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m52050(boolean z) {
        int i;
        TextInputLayout textInputLayout;
        int i2;
        int i3;
        int i4;
        int i5;
        int iM11306;
        int i6;
        int iM11307;
        int i7;
        int iM45029;
        int i8;
        int iM450210;
        int i9;
        int iM450211;
        int i10;
        int i11;
        int i12 = C7105.f23796;
        int i13 = C2124.f7782;
        int iM11308 = ThreadFactoryC3888.m11306("ۛ᩹") ^ i12;
        int i14 = ((iM11308 ^ i13) * (-29673)) ^ (-1191351040);
        String strM6288 = null;
        EditText editText = null;
        View viewM10957 = null;
        final EditText editText2 = null;
        final DialogInterfaceC19356 dialogInterfaceC19356M5514 = null;
        EditText editText3 = null;
        String strM4832 = null;
        short[] sArr = null;
        int i15 = iM11308 ^ (-575744798);
        int i16 = -1067077269;
        View viewM4976 = null;
        int iM11309 = 0;
        boolean z2 = false;
        int iM113010 = 0;
        int iM113011 = 0;
        int i17 = 0;
        int iM450212 = 0;
        int iM113012 = 0;
        int i18 = 0;
        int i19 = 0;
        short s = 0;
        int i20 = 0;
        TextInputLayout textInputLayout2 = null;
        final TextInputLayout textInputLayout3 = null;
        short[] sArr2 = null;
        int i21 = 0;
        int iM113013 = 0;
        while (true) {
            i16 = i15 ^ (i14 & (((i16 ^ i13) * (-23735)) >> 31));
            switch (i16) {
                case -2142977813:
                case 308746864:
                    short[] sArr3 = sArr;
                    short[] sArr4 = sArr2;
                    int i22 = iM11309;
                    String str = strM6288;
                    TextInputLayout textInputLayout4 = textInputLayout3;
                    int i23 = i21;
                    C8067 c8067M3751 = C0962.m3751(this);
                    C2871.m8638(c8067M3751, viewM4976);
                    c8067M3751.m21257(new DialogInterface.OnDismissListener() { // from class: l.۫᩵᩺
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            ViewOnClickListenerC23604.m52058(this.f42179);
                        }
                    });
                    dialogInterfaceC19356M5514 = CallableC1627.m5514(c8067M3751);
                    editText3 = editText.isEnabled() ? editText : editText2;
                    int iM450213 = (C19806.m45029("֨ܽ") ^ i12) * (-99);
                    i5 = ((iM450213 ^ i13) * 30127) ^ (-403519407);
                    i6 = iM450213 ^ (-1379453360);
                    i21 = i23;
                    sArr = sArr3;
                    iM11309 = i22;
                    strM6288 = str;
                    sArr2 = sArr4;
                    textInputLayout3 = textInputLayout4;
                    i15 = i6;
                    i14 = i5;
                    i16 = i16;
                    break;
                case -2076290044:
                case 389863746:
                    sArr = sArr;
                    sArr2 = sArr2;
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    iM11309 = iM11309;
                    strM6288 = strM6288;
                    textInputLayout3 = textInputLayout3;
                    i21 = i21;
                    C16737.m39290(editText3);
                    iM113012 = ThreadFactoryC3888.m11306(RunnableC1895.m6164(f76464, 182, 3, i21));
                    i18 = 2102775849;
                    if (C2477.m7593() < 0) {
                        iM450210 = C19806.m45029("ᩴ۫") ^ i13;
                        i5 = ((iM450210 ^ i12) * 21147) ^ (-1825274194);
                        i9 = -1669094396;
                        i6 = iM450210 ^ i9;
                        i21 = i21;
                        sArr = sArr;
                        iM11309 = iM11309;
                        strM6288 = strM6288;
                        sArr2 = sArr2;
                        textInputLayout3 = textInputLayout3;
                        dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                        i15 = i6;
                        i14 = i5;
                        i16 = i16;
                    }
                    sArr = sArr;
                    iM45029 = (ThreadFactoryC3888.m11306("ۨ᩵") + i12) * (-117);
                    i5 = ((iM45029 ^ i13) * 4971) ^ (-1654414711);
                    i8 = -318429984;
                    i6 = iM45029 ^ i8;
                    i21 = i21;
                    iM11309 = iM11309;
                    strM6288 = strM6288;
                    sArr2 = sArr2;
                    textInputLayout3 = textInputLayout3;
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    i15 = i6;
                    i14 = i5;
                    i16 = i16;
                    break;
                case -2069344786:
                case -677127721:
                    C2704.m8255();
                    if (C0629.f2722 <= 0) {
                        dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                        i = iM11309;
                        textInputLayout = textInputLayout3;
                        i2 = i21;
                        iM450211 = C19806.m45029("ܶܽ") ^ i12;
                        i10 = ((iM450211 ^ i13) * 15003) ^ (-223732056);
                        i11 = 520380489;
                        int i24 = iM450211 ^ i11;
                        iM11309 = i;
                        i16 = i16;
                        dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                        i15 = i24;
                        i14 = i10;
                        i21 = i2;
                        textInputLayout3 = textInputLayout;
                    } else {
                        sArr2 = sArr2;
                        dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                        iM11309 = iM11309;
                        strM6288 = strM6288;
                        textInputLayout3 = textInputLayout3;
                        i21 = i21;
                        iM45029 = (ThreadFactoryC3888.m11306("ۨ᩵") + i12) * (-117);
                        i5 = ((iM45029 ^ i13) * 4971) ^ (-1654414711);
                        i8 = -318429984;
                        i6 = iM45029 ^ i8;
                        i21 = i21;
                        iM11309 = iM11309;
                        strM6288 = strM6288;
                        sArr2 = sArr2;
                        textInputLayout3 = textInputLayout3;
                        dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                        i15 = i6;
                        i14 = i5;
                        i16 = i16;
                    }
                    break;
                case -1970253320:
                case -735578568:
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    textInputLayout3 = textInputLayout3;
                    i3 = i21;
                    iM11309 = ThreadFactoryC3888.m11306(C3743.m10964(f76464, 150, 3, i3)) ^ 2099162908;
                    if (C2704.f10408) {
                        iM11306 = (ThreadFactoryC3888.m11306("֨ܶ") ^ i13) * (-101);
                        i5 = ((iM11306 ^ i12) * 31485) ^ 1502109332;
                        i4 = -1953280518;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴ᩶") ^ i12;
                        i5 = ((iM11306 ^ i13) * (-6847)) ^ (-1197725387);
                        i4 = -1482915243;
                    }
                    i6 = iM11306 ^ i4;
                    i21 = i3;
                    textInputLayout3 = textInputLayout3;
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    i15 = i6;
                    i14 = i5;
                    i16 = i16;
                    break;
                case -1963768082:
                case 273160796:
                    i21 = 48260;
                    int iM113014 = (ThreadFactoryC3888.m11306("ܿۖ") + i13) * 89;
                    iM11309 = iM11309;
                    textInputLayout3 = textInputLayout3;
                    i15 = iM113014 ^ (-963064753);
                    i14 = ((iM113014 ^ i12) * 12129) ^ 1334439413;
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    break;
                case -1833826828:
                case -1262452344:
                    C3535.m10431();
                    RunnableC1606.m5473();
                    break;
                case -1820801823:
                case 1146525309:
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    i = iM11309;
                    textInputLayout = textInputLayout3;
                    i2 = i21;
                    View viewM8167 = C2642.m8167(viewM4976, i);
                    strM6288 = C1937.m6288(f76464, 153, 17, i2);
                    C7105.m18988(viewM8167, strM6288);
                    textInputLayout2 = (TextInputLayout) viewM8167;
                    if (C2332.f8260) {
                        iM450211 = (i12 - ThreadFactoryC3888.m11306("ۙۚ")) * 71;
                        i10 = ((iM450211 ^ i13) * (-5201)) ^ 1314620890;
                        i11 = 1933071940;
                    } else {
                        iM450211 = ThreadFactoryC3888.m11306("۬᩷") ^ i13;
                        i10 = ((iM450211 ^ i12) * (-13049)) ^ 384246984;
                        i11 = 402705969;
                    }
                    int i25 = iM450211 ^ i11;
                    iM11309 = i;
                    i16 = i16;
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    i15 = i25;
                    i14 = i10;
                    i21 = i2;
                    textInputLayout3 = textInputLayout;
                    break;
                case -1748628026:
                case -391856381:
                    C1937.m6291(C3743.m10957(viewM4976, iM113013 ^ i19), new View.OnClickListener() { // from class: l.ۛ᩵᩺
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ViewOnClickListenerC23604 viewOnClickListenerC23604 = null;
                            DialogInterfaceC19356 dialogInterfaceC19356 = null;
                            int i26 = 1336778545;
                            int i27 = C1066.f4915;
                            int i28 = C2249.f8050;
                            int iM113015 = ThreadFactoryC3888.m11306("ܺۛ") ^ i27;
                            int i29 = ((iM113015 ^ i28) * 22151) ^ (-1028779528);
                            int i30 = -2083430737;
                            while (true) {
                                i26 = ((((i26 ^ i28) * (-18597)) >> 31) & i29) ^ (iM113015 ^ i30);
                                switch (i26) {
                                    case -1964630727:
                                    case 1695807196:
                                        if (RunnableC1895.m6170() != 0) {
                                            iM113015 = (i27 - C19806.m45029("ᩴ᩵")) * (-17);
                                            i29 = ((iM113015 ^ i28) * (-18561)) ^ 231301616;
                                            i30 = -1816822898;
                                        } else {
                                            iM113015 = (ThreadFactoryC3888.m11306("᩹ܳ") + i28) * (-23);
                                            i29 = ((iM113015 ^ i27) * 30471) ^ 1772508478;
                                            i30 = -1595945879;
                                        }
                                        break;
                                    case -1883308940:
                                    case 585243648:
                                        if (C19806.f63586) {
                                            iM113015 = (ThreadFactoryC3888.m11306("ۚ᩸") + i28) * 123;
                                            i29 = ((iM113015 ^ i27) * (-19493)) ^ (-2016252207);
                                            i30 = -2080865495;
                                        } else {
                                            iM113015 = ThreadFactoryC3888.m11306("᩹ۖ") ^ i27;
                                            i29 = ((iM113015 ^ i28) * 10129) ^ 574337283;
                                            i30 = 1445791850;
                                        }
                                        break;
                                    case -1878837682:
                                    case -459380454:
                                        viewOnClickListenerC23604 = this;
                                        if (C3722.f13525 <= 0) {
                                            iM113015 = (i28 - C19806.m45029("ܺܽ")) * (-89);
                                            i29 = ((iM113015 ^ i27) * 5669) ^ 976506259;
                                            i30 = 1703764169;
                                        } else {
                                            iM113015 = (ThreadFactoryC3888.m11306("ܽۖ") ^ i28) * (-25);
                                            i29 = ((iM113015 ^ i27) * 2041) ^ 2052549643;
                                            i30 = -179581519;
                                        }
                                        break;
                                    case -1851541946:
                                    case 865213049:
                                        if (C0797.f3386) {
                                            iM113015 = (i28 - C19806.m45029("ܺܽ")) * (-89);
                                            i29 = ((iM113015 ^ i27) * 5669) ^ 976506259;
                                            i30 = 1703764169;
                                        } else {
                                            iM113015 = (C19806.m45029("ᩳۙ") + i28) * 85;
                                            i29 = ((iM113015 ^ i27) * (-12621)) ^ 1983916403;
                                            i30 = -867583422;
                                        }
                                        break;
                                    case -1714909463:
                                    case -1391718963:
                                        C2332.m7079();
                                        if (!C2332.f8260) {
                                            iM113015 = ThreadFactoryC3888.m11306("ۨۖ") ^ i27;
                                            i29 = ((iM113015 ^ i28) * (-30423)) ^ (-2002366456);
                                            i30 = 45185661;
                                        } else {
                                            iM113015 = (i28 - C19806.m45029("ܺܽ")) * (-89);
                                            i29 = ((iM113015 ^ i27) * 5669) ^ 976506259;
                                            i30 = 1703764169;
                                        }
                                        break;
                                    case -1445068673:
                                    case -165590394:
                                        if (C3722.f13525 > 0) {
                                            iM113015 = (i27 - C19806.m45029("ᩴ᩵")) * (-17);
                                            i29 = ((iM113015 ^ i28) * (-18561)) ^ 231301616;
                                            i30 = -1816822898;
                                        } else {
                                            iM113015 = ThreadFactoryC3888.m11306("ۨۖ") ^ i27;
                                            i29 = ((iM113015 ^ i28) * (-30423)) ^ (-2002366456);
                                            i30 = 45185661;
                                        }
                                        break;
                                    case -1424369113:
                                    case 161536389:
                                        ViewOnClickListenerC23604.m52042(editText2, dialogInterfaceC19356, viewOnClickListenerC23604, textInputLayout3);
                                        break;
                                    case -1131443976:
                                    case -429027040:
                                        if (C0050.m946() <= 0) {
                                            iM113015 = (i27 - C19806.m45029("ᩴ᩵")) * (-17);
                                            i29 = ((iM113015 ^ i28) * (-18561)) ^ 231301616;
                                            i30 = -1816822898;
                                        } else {
                                            iM113015 = (i27 - C19806.m45029("᩸ۢ")) * 57;
                                            i29 = ((iM113015 ^ i28) * (-22377)) ^ (-1655050224);
                                            i30 = -1458715058;
                                        }
                                        break;
                                    case -1022821333:
                                    case 361914740:
                                        dialogInterfaceC19356 = dialogInterfaceC19356M5514;
                                        if (C2124.f7782 <= 0) {
                                            iM113015 = (ThreadFactoryC3888.m11306("ۚ᩸") + i28) * 123;
                                            i29 = ((iM113015 ^ i27) * (-19493)) ^ (-2016252207);
                                            i30 = -2080865495;
                                        } else {
                                            iM113015 = ThreadFactoryC3888.m11306("۟᩻") ^ i27;
                                            i29 = ((iM113015 ^ i28) * (-30955)) ^ 1308908515;
                                            i30 = 1813782423;
                                        }
                                        break;
                                    case -204314666:
                                    case 1747793676:
                                        if (!C0962.f3784) {
                                            iM113015 = (i27 - C19806.m45029("ᩴ᩵")) * (-17);
                                            i29 = ((iM113015 ^ i28) * (-18561)) ^ 231301616;
                                            i30 = -1816822898;
                                        } else {
                                            iM113015 = (ThreadFactoryC3888.m11306("᩵ܳ") ^ i28) * (-85);
                                            i29 = ((iM113015 ^ i27) * (-29325)) ^ (-1210554794);
                                            i30 = -1239237180;
                                        }
                                        break;
                                    case 129855271:
                                    case 424594296:
                                        if (C0671.f2816 != 0) {
                                            iM113015 = (i27 - C19806.m45029("ᩴ᩵")) * (-17);
                                            i29 = ((iM113015 ^ i28) * (-18561)) ^ 231301616;
                                            i30 = -1816822898;
                                        } else {
                                            iM113015 = (C19806.m45029("ۢܿ") + i27) * (-75);
                                            i29 = ((iM113015 ^ i28) * 265) ^ (-1849779443);
                                            i30 = -1149687810;
                                        }
                                        break;
                                    case 253835434:
                                    case 1724910151:
                                        if (C2249.f8050 >= 0) {
                                            iM113015 = (i28 - C19806.m45029("ܺܽ")) * (-89);
                                            i29 = ((iM113015 ^ i27) * 5669) ^ 976506259;
                                            i30 = 1703764169;
                                        } else {
                                            iM113015 = (C19806.m45029("ܽۜ") ^ i28) * 43;
                                            i29 = ((iM113015 ^ i27) * 8849) ^ 672580234;
                                            i30 = 1918731120;
                                        }
                                        break;
                                    case 370573848:
                                    case 613805567:
                                        if (C3743.m10966() <= 0) {
                                            iM113015 = (ThreadFactoryC3888.m11306("᩵ܳ") ^ i28) * (-85);
                                            i29 = ((iM113015 ^ i27) * (-29325)) ^ (-1210554794);
                                            i30 = -1239237180;
                                        } else {
                                            iM113015 = ThreadFactoryC3888.m11306("۠ᩴ") ^ i27;
                                            i29 = ((iM113015 ^ i28) * 14935) ^ 1942559479;
                                            i30 = -2128433184;
                                        }
                                        break;
                                    case 776288219:
                                    case 944636957:
                                        if (C3535.f13026 <= 0) {
                                            iM113015 = (i28 - C19806.m45029("ܺܽ")) * (-89);
                                            i29 = ((iM113015 ^ i27) * 5669) ^ 976506259;
                                            i30 = 1703764169;
                                        } else {
                                            iM113015 = (ThreadFactoryC3888.m11306("ۙۜ") + i28) * 51;
                                            i29 = ((iM113015 ^ i27) * 17507) ^ 1301725751;
                                            i30 = 1414106673;
                                        }
                                        break;
                                    case 1042206060:
                                    case 2017752701:
                                        C0817.m3399();
                                        iM113015 = ThreadFactoryC3888.m11306("ۨۖ") ^ i27;
                                        i29 = ((iM113015 ^ i28) * (-30423)) ^ (-2002366456);
                                        i30 = 45185661;
                                        break;
                                    default:
                                        C0962.m3746();
                                        break;
                                }
                                return;
                            }
                        }

                        {
                            int i26 = -1109109873;
                            int i27 = C1398.f5802;
                            int i28 = C1419.f5860;
                            int iM113015 = ThreadFactoryC3888.m11306("᩺ۘ") ^ i28;
                            int i29 = ((iM113015 ^ i27) * 19785) ^ 1565119375;
                            int i30 = 880818113;
                            while (true) {
                                i26 = ((((i26 ^ i27) * 21617) >> 31) & i29) ^ (iM113015 ^ i30);
                                switch (i26) {
                                    case -2050100438:
                                    case -1244089143:
                                        C0216.m1591();
                                        C1668.m5583();
                                        iM113015 = (C19806.m45029("᩻ۢ") + i27) * 75;
                                        i29 = ((iM113015 ^ i28) * (-13835)) ^ (-103329983);
                                        i30 = -769131212;
                                        break;
                                    case -1898881296:
                                    case 1551676990:
                                        if (C1977.f7413 <= 0) {
                                            iM113015 = ThreadFactoryC3888.m11306("ᩳۛ") ^ i28;
                                            i29 = ((iM113015 ^ i27) * 2003) ^ 1176279276;
                                            i30 = -1437540866;
                                        } else {
                                            iM113015 = ThreadFactoryC3888.m11306("᩶۫") ^ i27;
                                            i29 = ((iM113015 ^ i28) * 27597) ^ (-577714700);
                                            i30 = -1794037663;
                                        }
                                        break;
                                    case -1608027507:
                                    case 1095400397:
                                        if (C1419.f5860 >= 0) {
                                            iM113015 = ThreadFactoryC3888.m11306("ᩳۛ") ^ i28;
                                            i29 = ((iM113015 ^ i27) * 2003) ^ 1176279276;
                                            i30 = -1437540866;
                                        } else {
                                            iM113015 = (ThreadFactoryC3888.m11306("۬ۖ") + i27) * 57;
                                            i29 = ((iM113015 ^ i28) * (-26391)) ^ 1252435000;
                                            i30 = -606793358;
                                        }
                                        break;
                                    case -1308918872:
                                    case -39944722:
                                        if (C0050.f912 <= 0) {
                                            iM113015 = (C19806.m45029("᩻ۢ") + i27) * 75;
                                            i29 = ((iM113015 ^ i28) * (-13835)) ^ (-103329983);
                                            i30 = -769131212;
                                        } else {
                                            iM113015 = (i28 - C19806.m45029("֫ۡ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i29 = ((iM113015 ^ i27) * 22685) ^ (-1480198302);
                                            i30 = -138329417;
                                        }
                                        break;
                                    case -1178040734:
                                    case 188858411:
                                        if (C10634.m26820()) {
                                            iM113015 = (C19806.m45029("᩻ۢ") + i27) * 75;
                                            i29 = ((iM113015 ^ i28) * (-13835)) ^ (-103329983);
                                            i30 = -769131212;
                                        } else {
                                            iM113015 = (i27 - ThreadFactoryC3888.m11306("᩵֫")) * (-105);
                                            i29 = ((iM113015 ^ i28) * (-23595)) ^ (-723689967);
                                            i30 = -463147095;
                                        }
                                        break;
                                    case -1106827607:
                                    case 1869376727:
                                        if (C3722.f13525 <= 0) {
                                            iM113015 = ThreadFactoryC3888.m11306("ᩳۛ") ^ i28;
                                            i29 = ((iM113015 ^ i27) * 2003) ^ 1176279276;
                                            i30 = -1437540866;
                                        } else {
                                            iM113015 = C19806.m45029("ۚ۬") ^ i28;
                                            i29 = ((iM113015 ^ i27) * 7891) ^ 918623321;
                                            i30 = -1200639622;
                                        }
                                        break;
                                    case -740545859:
                                    case 2146692684:
                                        C2332.m7079();
                                        if (C2704.m8255() > 0) {
                                            iM113015 = C19806.m45029("ܶ᩵") ^ i28;
                                            i29 = ((iM113015 ^ i27) * (-601)) ^ 928394923;
                                            i30 = 1349321647;
                                        } else {
                                            iM113015 = (C19806.m45029("᩻ۢ") + i27) * 75;
                                            i29 = ((iM113015 ^ i28) * (-13835)) ^ (-103329983);
                                            i30 = -769131212;
                                        }
                                        break;
                                    case -564109941:
                                    case -517798619:
                                        if (C10634.f36300 >= 0) {
                                            iM113015 = C19806.m45029("ܶ᩵") ^ i28;
                                            i29 = ((iM113015 ^ i27) * (-601)) ^ 928394923;
                                            i30 = 1349321647;
                                        } else {
                                            iM113015 = C19806.m45029("ᩴ֫") ^ i28;
                                            i29 = ((iM113015 ^ i27) * (-23107)) ^ (-1977340738);
                                            i30 = 1534225981;
                                        }
                                        break;
                                    case 197330306:
                                    case 2049832606:
                                        return;
                                    case 260350705:
                                    case 626963934:
                                        if (C7105.f23796 >= 0) {
                                            iM113015 = C19806.m45029("ۖ᩻") ^ i27;
                                            i29 = ((iM113015 ^ i28) * (-11629)) ^ 2012115590;
                                            i30 = -1959614187;
                                        } else {
                                            iM113015 = ThreadFactoryC3888.m11306("ۙܳ") ^ i27;
                                            i29 = ((iM113015 ^ i28) * 5753) ^ 1946457993;
                                            i30 = 550955781;
                                        }
                                        break;
                                    case 437747076:
                                    case 1842307922:
                                        if (C1148.f5161 <= 0) {
                                            iM113015 = C19806.m45029("ۖ᩻") ^ i27;
                                            i29 = ((iM113015 ^ i28) * (-11629)) ^ 2012115590;
                                            i30 = -1959614187;
                                        } else {
                                            iM113015 = (ThreadFactoryC3888.m11306("۫ۡ") + i27) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i29 = ((iM113015 ^ i28) * (-10893)) ^ 1741291103;
                                            i30 = -1868181858;
                                        }
                                        break;
                                    case 442097511:
                                    case 1752052994:
                                        if (C1066.f4915 <= 0) {
                                            iM113015 = C19806.m45029("ۖ᩻") ^ i27;
                                            i29 = ((iM113015 ^ i28) * (-11629)) ^ 2012115590;
                                            i30 = -1959614187;
                                        } else {
                                            iM113015 = C19806.m45029("ܿۛ") ^ i27;
                                            i29 = ((iM113015 ^ i28) * (-16545)) ^ (-366435988);
                                            i30 = 542380714;
                                        }
                                        break;
                                    case 657978168:
                                    case 1279213725:
                                        C1025.m3861();
                                        if (C2477.f9839 <= 0) {
                                            iM113015 = ThreadFactoryC3888.m11306("ᩳۛ") ^ i28;
                                            i29 = ((iM113015 ^ i27) * 2003) ^ 1176279276;
                                            i30 = -1437540866;
                                        } else {
                                            iM113015 = (C19806.m45029("᩻ۢ") + i27) * 75;
                                            i29 = ((iM113015 ^ i28) * (-13835)) ^ (-103329983);
                                            i30 = -769131212;
                                        }
                                        break;
                                    case 734623796:
                                    case 1473622635:
                                        if (C0797.f3386) {
                                            iM113015 = ThreadFactoryC3888.m11306("ᩳۛ") ^ i28;
                                            i29 = ((iM113015 ^ i27) * 2003) ^ 1176279276;
                                            i30 = -1437540866;
                                        } else {
                                            iM113015 = (i28 - C19806.m45029("۫᩵")) * (-59);
                                            i29 = ((iM113015 ^ i27) * 32195) ^ (-2069720216);
                                            i30 = -519314674;
                                        }
                                        break;
                                    case 1913563480:
                                    case 1924119063:
                                        RunnableC1564.m5345();
                                        C10634.m26820();
                                        throw new RuntimeException();
                                    default:
                                        if (C1189.m4368() <= 0) {
                                            iM113015 = (C19806.m45029("᩻ۢ") + i27) * 75;
                                            i29 = ((iM113015 ^ i28) * (-13835)) ^ (-103329983);
                                            i30 = -769131212;
                                        } else {
                                            iM113015 = (C19806.m45029("᩹ۜ") + i28) * 9;
                                            i29 = ((iM113015 ^ i27) * (-18021)) ^ 2047845357;
                                            i30 = -1729842302;
                                        }
                                        break;
                                }
                            }
                        }
                    });
                    break;
                case -1633492119:
                case -499780110:
                    sArr = sArr;
                    sArr2 = sArr2;
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    iM11309 = iM11309;
                    strM6288 = strM6288;
                    textInputLayout3 = textInputLayout3;
                    i21 = i21;
                    editText2 = (EditText) viewM10957;
                    C19328.m44316(textInputLayout2);
                    C19328.m44316(textInputLayout3);
                    C1461.m5083(editText, C1709.m5689());
                    z2 = false;
                    z2 = false;
                    if (z) {
                        iM450210 = (ThreadFactoryC3888.m11306("ۧܶ") + i13) * 123;
                        i5 = ((iM450210 ^ i12) * 17205) ^ 1784454518;
                        i9 = 1326528332;
                    } else {
                        iM450210 = C19806.m45029("ܰ۬") ^ i12;
                        i5 = ((iM450210 ^ i13) * (-20733)) ^ (-1905570781);
                        i9 = 1640689993;
                    }
                    i6 = iM450210 ^ i9;
                    i21 = i21;
                    sArr = sArr;
                    iM11309 = iM11309;
                    strM6288 = strM6288;
                    sArr2 = sArr2;
                    textInputLayout3 = textInputLayout3;
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    i15 = i6;
                    i14 = i5;
                    i16 = i16;
                    break;
                case -1603033230:
                case -620719104:
                    textInputLayout2.setHint(iM450212 ^ 2099511969);
                    C2477.m7603(editText, z2);
                    iM450210 = ThreadFactoryC3888.m11306("۟ܿ") ^ i13;
                    i5 = ((iM450210 ^ i12) * 17553) ^ (-810705601);
                    i9 = -136340832;
                    i6 = iM450210 ^ i9;
                    i21 = i21;
                    sArr = sArr;
                    iM11309 = iM11309;
                    strM6288 = strM6288;
                    sArr2 = sArr2;
                    textInputLayout3 = textInputLayout3;
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    i15 = i6;
                    i14 = i5;
                    i16 = i16;
                    break;
                case -1498187461:
                case 1387171750:
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    iM11309 = iM11309;
                    textInputLayout3 = textInputLayout3;
                    i21 = i21;
                    iM113011 = ThreadFactoryC3888.m11306(C0278.m1774(f76464, 170, 3, i21));
                    i17 = 2126233636;
                    if (C1377.f5749) {
                        iM11307 = (i13 - ThreadFactoryC3888.m11306("۫۟")) * (-53);
                        i5 = ((iM11307 ^ i12) * (-13437)) ^ (-1076904030);
                        i7 = 474640319;
                    } else {
                        iM11307 = (C19806.m45029("֡۠") ^ i13) * (-83);
                        i5 = ((iM11307 ^ i12) * (-9721)) ^ (-163311020);
                        i7 = -1140451798;
                    }
                    i6 = iM11307 ^ i7;
                    i21 = i21;
                    iM11309 = iM11309;
                    textInputLayout3 = textInputLayout3;
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    i15 = i6;
                    i14 = i5;
                    i16 = i16;
                    break;
                case -1497704810:
                case 548502946:
                    View viewM8168 = C2642.m8167(viewM4976, iM113011 ^ i17);
                    C1937.m6286(viewM8168, strM6288);
                    sArr2 = f76464;
                    int iM113015 = (ThreadFactoryC3888.m11306("ۢۗ") ^ i12) * 127;
                    iM11309 = iM11309;
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    textInputLayout3 = (TextInputLayout) viewM8168;
                    i14 = ((iM113015 ^ i13) * (-25965)) ^ 572023294;
                    i21 = i21;
                    i15 = iM113015 ^ (-1655644219);
                    i16 = i16;
                    break;
                case -1414643238:
                case 1551009329:
                    editText.setSelection(z2 ? 1 : 0, C1461.m5087(editText));
                    iM450210 = ThreadFactoryC3888.m11306("۟ܿ") ^ i13;
                    i5 = ((iM450210 ^ i12) * 17553) ^ (-810705601);
                    i9 = -136340832;
                    i6 = iM450210 ^ i9;
                    i21 = i21;
                    sArr = sArr;
                    iM11309 = iM11309;
                    strM6288 = strM6288;
                    sArr2 = sArr2;
                    textInputLayout3 = textInputLayout3;
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    i15 = i6;
                    i14 = i5;
                    i16 = i16;
                    break;
                case -1274533182:
                case 1005355463:
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    i = iM11309;
                    textInputLayout = textInputLayout3;
                    i2 = i21;
                    int i26 = (s * s) + 294122500;
                    if ((i20 * i20) - (i26 + i26) <= 0) {
                        iM450211 = (ThreadFactoryC3888.m11306("ۜܶ") + i13) * (-37);
                        i10 = ((iM450211 ^ i12) * 1215) ^ (-264198875);
                        i11 = 1884739216;
                    } else {
                        iM450211 = C19806.m45029("ۘۨ") ^ i12;
                        i10 = ((iM450211 ^ i13) * (-26165)) ^ (-1772762738);
                        i11 = -634612637;
                    }
                    int i27 = iM450211 ^ i11;
                    iM11309 = i;
                    i16 = i16;
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    i15 = i27;
                    i14 = i10;
                    i21 = i2;
                    textInputLayout3 = textInputLayout;
                    break;
                case -1121418390:
                case -969732233:
                    i21 = 40462;
                    int iM113016 = (ThreadFactoryC3888.m11306("ܿۖ") + i13) * 89;
                    iM11309 = iM11309;
                    textInputLayout3 = textInputLayout3;
                    i15 = iM113016 ^ (-963064753);
                    i14 = ((iM113016 ^ i12) * 12129) ^ 1334439413;
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    break;
                case -959396699:
                case 399142707:
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    i = iM11309;
                    textInputLayout = textInputLayout3;
                    i2 = i21;
                    short s2 = f76464[146];
                    int i28 = s2 + 17150;
                    if (!RunnableC1564.f6300) {
                        int iM450214 = (C19806.m45029("ۨۘ") + i12) * 65;
                        s = s2;
                        i20 = i28;
                        i14 = ((iM450214 ^ i13) * 17839) ^ (-1544458519);
                        i21 = i2;
                        textInputLayout3 = textInputLayout;
                        iM11309 = i;
                        i15 = iM450214 ^ 1482504216;
                        dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    } else {
                        s = s2;
                        i20 = i28;
                        iM450211 = C19806.m45029("ܶܽ") ^ i12;
                        i10 = ((iM450211 ^ i13) * 15003) ^ (-223732056);
                        i11 = 520380489;
                        int i29 = iM450211 ^ i11;
                        iM11309 = i;
                        i16 = i16;
                        dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                        i15 = i29;
                        i14 = i10;
                        i21 = i2;
                        textInputLayout3 = textInputLayout;
                    }
                    break;
                case -715895447:
                case 852851790:
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    i = iM11309;
                    textInputLayout = textInputLayout3;
                    i2 = i21;
                    viewM4976 = C1419.m4976(this, iM113010 ^ 2128729319);
                    if (C0671.m3008() >= 0) {
                        iM450211 = C19806.m45029("ܶܽ") ^ i12;
                        i10 = ((iM450211 ^ i13) * 15003) ^ (-223732056);
                        i11 = 520380489;
                    } else {
                        iM450211 = (i12 - ThreadFactoryC3888.m11306("ܶ᩶")) * (-97);
                        i10 = ((iM450211 ^ i13) * 32697) ^ (-1385800918);
                        i11 = -624287031;
                    }
                    int i210 = iM450211 ^ i11;
                    iM11309 = i;
                    i16 = i16;
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    i15 = i210;
                    i14 = i10;
                    i21 = i2;
                    textInputLayout3 = textInputLayout;
                    break;
                case -715074655:
                case -59653256:
                    C1461.m5080();
                    if (!C1461.m5080()) {
                        dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                        textInputLayout3 = textInputLayout3;
                        i3 = i21;
                        iM11306 = ThreadFactoryC3888.m11306("ᩴ᩶") ^ i12;
                        i5 = ((iM11306 ^ i13) * (-6847)) ^ (-1197725387);
                        i4 = -1482915243;
                        i6 = iM11306 ^ i4;
                        i21 = i3;
                        textInputLayout3 = textInputLayout3;
                        dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                        i15 = i6;
                        i14 = i5;
                        i16 = i16;
                    } else {
                        dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                        i = iM11309;
                        textInputLayout = textInputLayout3;
                        i2 = i21;
                        iM450211 = ThreadFactoryC3888.m11306("۬᩷") ^ i13;
                        i10 = ((iM450211 ^ i12) * (-13049)) ^ 384246984;
                        i11 = 402705969;
                        int i211 = iM450211 ^ i11;
                        iM11309 = i;
                        i16 = i16;
                        dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                        i15 = i211;
                        i14 = i10;
                        i21 = i2;
                        textInputLayout3 = textInputLayout;
                    }
                    break;
                case -499198207:
                case 926063506:
                    sArr = sArr;
                    sArr2 = sArr2;
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    iM11309 = iM11309;
                    strM6288 = strM6288;
                    textInputLayout3 = textInputLayout3;
                    i21 = i21;
                    iM450212 = C19806.m45029(C3660.m10790(f76464, 179, 3, i21));
                    iM450210 = ThreadFactoryC3888.m11306("ۛܿ") ^ i12;
                    i5 = ((iM450210 ^ i13) * 31429) ^ (-1005607150);
                    i9 = 291773163;
                    i6 = iM450210 ^ i9;
                    i21 = i21;
                    sArr = sArr;
                    iM11309 = iM11309;
                    strM6288 = strM6288;
                    sArr2 = sArr2;
                    textInputLayout3 = textInputLayout3;
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    i15 = i6;
                    i14 = i5;
                    i16 = i16;
                    break;
                case -461234697:
                case 640716736:
                    sArr2 = sArr2;
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    iM11309 = iM11309;
                    strM6288 = strM6288;
                    textInputLayout3 = textInputLayout3;
                    i21 = i21;
                    viewM10957 = C3743.m10957(viewM4976, ThreadFactoryC3888.m11306(C1189.m4365(sArr, PicnicEngine.MAX_AUX_BYTES, 3, i21)) ^ 2122200296);
                    if (!C0817.f3443) {
                        strM6288 = strM6288;
                        sArr2 = sArr2;
                        iM11307 = (C19806.m45029("֡۠") ^ i13) * (-83);
                        i5 = ((iM11307 ^ i12) * (-9721)) ^ (-163311020);
                        i7 = -1140451798;
                        i6 = iM11307 ^ i7;
                        i21 = i21;
                        iM11309 = iM11309;
                        textInputLayout3 = textInputLayout3;
                        dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                        i15 = i6;
                        i14 = i5;
                        i16 = i16;
                    } else {
                        iM45029 = C19806.m45029("ܰۤ") ^ i13;
                        i5 = ((iM45029 ^ i12) * 20363) ^ (-1744959829);
                        i8 = -382107434;
                        i6 = iM45029 ^ i8;
                        i21 = i21;
                        iM11309 = iM11309;
                        strM6288 = strM6288;
                        sArr2 = sArr2;
                        textInputLayout3 = textInputLayout3;
                        dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                        i15 = i6;
                        i14 = i5;
                        i16 = i16;
                    }
                    break;
                case -415644470:
                case -89072605:
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    iM11309 = iM11309;
                    String str2 = strM6288;
                    textInputLayout3 = textInputLayout3;
                    i21 = i21;
                    strM4832 = C1377.m4832(sArr2, 173, 3, i21);
                    if (C1460.f5948 >= 0) {
                        strM6288 = str2;
                        iM11307 = (C19806.m45029("֡۠") ^ i13) * (-83);
                        i5 = ((iM11307 ^ i12) * (-9721)) ^ (-163311020);
                        i7 = -1140451798;
                        i6 = iM11307 ^ i7;
                        i21 = i21;
                        iM11309 = iM11309;
                    } else {
                        int iM113017 = (i13 - ThreadFactoryC3888.m11306("᩸ܳ")) * 25;
                        i5 = ((iM113017 ^ i12) * 19585) ^ 675027295;
                        i6 = iM113017 ^ 1483502370;
                        i21 = i21;
                        iM11309 = iM11309;
                        strM6288 = str2;
                    }
                    textInputLayout3 = textInputLayout3;
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    i15 = i6;
                    i14 = i5;
                    i16 = i16;
                    break;
                case -350545672:
                case 1932048023:
                    sArr = sArr;
                    iM11309 = iM11309;
                    final TextInputLayout textInputLayout5 = textInputLayout2;
                    strM6288 = strM6288;
                    final EditText editText4 = editText;
                    sArr2 = sArr2;
                    textInputLayout3 = textInputLayout3;
                    i21 = i21;
                    final View view = viewM4976;
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    final EditText editText5 = editText2;
                    C7105.m18993(C3743.m10957(viewM4976, iM113012 ^ i18), new View.OnClickListener() { // from class: l.ܿ᩵᩺
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            View view3 = null;
                            EditText editText6 = null;
                            TextInputLayout textInputLayout6 = null;
                            EditText editText7 = null;
                            int i30 = -440438826;
                            int i31 = C2871.f10837;
                            int i32 = C3577.f13150;
                            int iM450215 = (C19806.m45029("᩵ۜ") ^ i31) * (-61);
                            int i33 = ((iM450215 ^ i32) * (-11889)) ^ 842501280;
                            int i34 = -455153518;
                            while (true) {
                                i30 = ((((i30 ^ i32) * (-4445)) >> 31) & i33) ^ (iM450215 ^ i34);
                                switch (i30) {
                                    case -1869401661:
                                    case -976397725:
                                        C1148.m4232();
                                        if (C3660.f13403 >= 0) {
                                            iM450215 = (ThreadFactoryC3888.m11306("᩻᩺") + i31) * (-79);
                                            i33 = ((iM450215 ^ i32) * (-10127)) ^ 1729144359;
                                            i34 = -113603746;
                                        } else {
                                            iM450215 = (ThreadFactoryC3888.m11306("ܶ᩺") + i32) * (-33);
                                            i33 = ((iM450215 ^ i31) * (-5527)) ^ (-692348616);
                                            i34 = 86918913;
                                        }
                                        break;
                                    case -1742173848:
                                    case 210598301:
                                        editText6 = editText5;
                                        if (C2788.f10625 >= 0) {
                                            iM450215 = C19806.m45029("᩸ܺ") ^ i31;
                                            i33 = ((iM450215 ^ i32) * (-25083)) ^ (-1501791718);
                                            i34 = -495637172;
                                        } else {
                                            iM450215 = (ThreadFactoryC3888.m11306("ܺܿ") ^ i32) * 91;
                                            i33 = ((iM450215 ^ i31) * (-4501)) ^ (-582781848);
                                            i34 = 932348521;
                                        }
                                        break;
                                    case -1567218617:
                                    case -1018276773:
                                        if (C0050.f912 <= 0) {
                                            iM450215 = C19806.m45029("֡۟") ^ i32;
                                            i33 = ((iM450215 ^ i31) * (-13651)) ^ 1983154573;
                                            i34 = 1593879918;
                                        } else {
                                            iM450215 = (ThreadFactoryC3888.m11306("ᩳۢ") + i31) * (-37);
                                            i33 = ((iM450215 ^ i32) * (-28555)) ^ 1605389140;
                                            i34 = 408613901;
                                        }
                                        break;
                                    case -1478565563:
                                    case -833126858:
                                        if (C0962.f3784) {
                                            iM450215 = (ThreadFactoryC3888.m11306("ܶ᩺") + i32) * (-33);
                                            i33 = ((iM450215 ^ i31) * (-5527)) ^ (-692348616);
                                            i34 = 86918913;
                                        } else {
                                            iM450215 = (ThreadFactoryC3888.m11306("֨᩶") ^ i31) * 37;
                                            i33 = ((iM450215 ^ i32) * (-4857)) ^ (-740886285);
                                            i34 = 2119800013;
                                        }
                                        break;
                                    case -1382374597:
                                    case 2062259530:
                                        if (C2704.f10408) {
                                            iM450215 = (i32 - ThreadFactoryC3888.m11306("۫ܰ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                            i33 = ((iM450215 ^ i31) * 1633) ^ 694973247;
                                            i34 = -635467643;
                                        } else {
                                            iM450215 = C19806.m45029("֡۟") ^ i32;
                                            i33 = ((iM450215 ^ i31) * (-13651)) ^ 1983154573;
                                            i34 = 1593879918;
                                        }
                                        break;
                                    case -1313833627:
                                    case -373091288:
                                        if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                                            iM450215 = (i32 - ThreadFactoryC3888.m11306("ᩳۛ")) * 47;
                                            i33 = ((iM450215 ^ i31) * (-13659)) ^ (-1926508447);
                                            i34 = 1024878267;
                                        } else {
                                            iM450215 = (C19806.m45029("᩹ܽ") + i31) * 13;
                                            i33 = ((iM450215 ^ i32) * 1713) ^ (-2124266517);
                                            i34 = -1649082683;
                                        }
                                        break;
                                    case -1194200717:
                                    case -581044291:
                                        if (C1668.m5583()) {
                                            iM450215 = (i31 - C19806.m45029("᩷ܺ")) * (-121);
                                            i33 = ((iM450215 ^ i32) * (-6717)) ^ 204986325;
                                            i34 = -1013659420;
                                        } else {
                                            iM450215 = (ThreadFactoryC3888.m11306("᩻᩺") + i31) * (-79);
                                            i33 = ((iM450215 ^ i32) * (-10127)) ^ 1729144359;
                                            i34 = -113603746;
                                        }
                                        break;
                                    case 126902418:
                                    case 982459860:
                                        view3 = view;
                                        if (C2871.f10837 >= 0) {
                                            iM450215 = C19806.m45029("᩸ܺ") ^ i31;
                                            i33 = ((iM450215 ^ i32) * (-25083)) ^ (-1501791718);
                                            i34 = -495637172;
                                        } else {
                                            iM450215 = (C19806.m45029("ۘۜ") ^ i32) * 73;
                                            i33 = ((iM450215 ^ i31) * (-4235)) ^ (-1009048982);
                                            i34 = -1131925337;
                                        }
                                        break;
                                    case 239370184:
                                    case 946245309:
                                        RunnableC1895.m6170();
                                        C3535.m10431();
                                        break;
                                    case 286814582:
                                    case 1769053247:
                                        if (C0050.f912 <= 0) {
                                            iM450215 = (ThreadFactoryC3888.m11306("ܶ᩺") + i32) * (-33);
                                            i33 = ((iM450215 ^ i31) * (-5527)) ^ (-692348616);
                                            i34 = 86918913;
                                        } else {
                                            iM450215 = C19806.m45029("ᩳ۬") ^ i31;
                                            i33 = ((iM450215 ^ i32) * (-18587)) ^ 1276606227;
                                            i34 = 54744368;
                                        }
                                        break;
                                    case 315392905:
                                    case 1350960130:
                                        RunnableC0195.m1431();
                                        if (C1189.f5284 <= 0) {
                                            iM450215 = (C19806.m45029("᩹ܽ") + i31) * 13;
                                            i33 = ((iM450215 ^ i32) * 1713) ^ (-2124266517);
                                            i34 = -1649082683;
                                        } else {
                                            iM450215 = (ThreadFactoryC3888.m11306("ܶ᩺") + i32) * (-33);
                                            i33 = ((iM450215 ^ i31) * (-5527)) ^ (-692348616);
                                            i34 = 86918913;
                                        }
                                        break;
                                    case 814427323:
                                    case 1958430617:
                                        textInputLayout6 = textInputLayout5;
                                        editText7 = editText4;
                                        if (C0962.f3784) {
                                            iM450215 = (ThreadFactoryC3888.m11306("ܶ᩺") + i32) * (-33);
                                            i33 = ((iM450215 ^ i31) * (-5527)) ^ (-692348616);
                                            i34 = 86918913;
                                        } else {
                                            iM450215 = C19806.m45029("ۗۨ") ^ i31;
                                            i33 = ((iM450215 ^ i32) * 19439) ^ (-1560063795);
                                            i34 = -120606751;
                                        }
                                        break;
                                    case 1071530789:
                                    case 1752260266:
                                        C1460.m5050();
                                        ViewTreeObserverOnPreDrawListenerC3327.m9874();
                                        iM450215 = (ThreadFactoryC3888.m11306("ܶ᩺") + i32) * (-33);
                                        i33 = ((iM450215 ^ i31) * (-5527)) ^ (-692348616);
                                        i34 = 86918913;
                                        break;
                                    case 1245669276:
                                    case 1909673379:
                                        ViewOnClickListenerC23604.m52043(textInputLayout6, editText7, this, view3, editText6);
                                        break;
                                    case 1442907198:
                                    case 2074319762:
                                        if (C0962.m3746() >= 0) {
                                            iM450215 = C19806.m45029("᩸ܺ") ^ i31;
                                            i33 = ((iM450215 ^ i32) * (-25083)) ^ (-1501791718);
                                            i34 = -495637172;
                                        } else {
                                            iM450215 = ThreadFactoryC3888.m11306("ۙ᩷") ^ i32;
                                            i33 = ((iM450215 ^ i31) * 9611) ^ (-1350304552);
                                            i34 = 1419432667;
                                        }
                                        break;
                                    default:
                                        C1419.m4973();
                                        if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                                            iM450215 = C19806.m45029("֡۟") ^ i32;
                                            i33 = ((iM450215 ^ i31) * (-13651)) ^ 1983154573;
                                            i34 = 1593879918;
                                        } else {
                                            iM450215 = (ThreadFactoryC3888.m11306("ܶ᩺") + i32) * (-33);
                                            i33 = ((iM450215 ^ i31) * (-5527)) ^ (-692348616);
                                            i34 = 86918913;
                                        }
                                        break;
                                }
                                return;
                            }
                        }

                        {
                            int i30 = -654104138;
                            int i31 = C1461.f5957;
                            int i32 = C1977.f7413;
                            int iM450215 = C19806.m45029("ۚᩴ") ^ i32;
                            int i33 = ((iM450215 ^ i31) * (-18323)) ^ 1975794940;
                            int i34 = 1642970863;
                            while (true) {
                                i30 = ((((i30 ^ i31) * (-5353)) >> 31) & i33) ^ (iM450215 ^ i34);
                                switch (i30) {
                                    case -2091128591:
                                    case 1148579189:
                                        if (C7105.m18985()) {
                                            iM450215 = (ThreadFactoryC3888.m11306("ܰᩴ") ^ i31) * (-103);
                                            i33 = ((iM450215 ^ i32) * (-32733)) ^ (-1963574537);
                                            i34 = -1776630054;
                                        } else {
                                            iM450215 = (ThreadFactoryC3888.m11306("ۘܳ") ^ i31) * (-115);
                                            i33 = ((iM450215 ^ i32) * 3029) ^ 1630717207;
                                            i34 = -765428093;
                                        }
                                        break;
                                    case -1799426065:
                                    case -229897369:
                                        if (C1875.f7103 >= 0) {
                                            iM450215 = (i31 - C19806.m45029("ۗۤ")) * (-73);
                                            i33 = ((iM450215 ^ i32) * 21745) ^ (-1484667634);
                                            i34 = 2129572609;
                                        } else {
                                            iM450215 = ThreadFactoryC3888.m11306("ۨ֡") ^ i32;
                                            i33 = ((iM450215 ^ i31) * 7803) ^ (-1999096179);
                                            i34 = -1818129523;
                                        }
                                        break;
                                    case -1744708393:
                                    case -551140773:
                                        if (C2704.m8255() <= 0) {
                                            iM450215 = (ThreadFactoryC3888.m11306("ܰᩴ") ^ i31) * (-103);
                                            i33 = ((iM450215 ^ i32) * (-32733)) ^ (-1963574537);
                                            i34 = -1776630054;
                                        } else {
                                            iM450215 = (i32 - C19806.m45029("ۙ֡")) * (-119);
                                            i33 = ((iM450215 ^ i31) * (-13801)) ^ (-685657205);
                                            i34 = 2081189874;
                                        }
                                        break;
                                    case -1738981349:
                                    case 1008627520:
                                        if (C1398.f5802 <= 0) {
                                            iM450215 = (C19806.m45029("ۤܰ") + i32) * 11;
                                            i33 = ((iM450215 ^ i31) * 20245) ^ 2141698783;
                                            i34 = -1831880038;
                                        } else {
                                            iM450215 = (i32 - C19806.m45029("᩵ܰ")) * 71;
                                            i33 = ((iM450215 ^ i31) * (-14141)) ^ (-179599182);
                                            i34 = 258302718;
                                        }
                                        break;
                                    case -1312007263:
                                    case 1758951655:
                                        if (C7105.f23796 >= 0) {
                                            iM450215 = C19806.m45029("۫ۡ") ^ i32;
                                            i33 = ((iM450215 ^ i31) * (-25461)) ^ 1969988897;
                                            i34 = -1216467140;
                                        } else {
                                            iM450215 = (i31 - ThreadFactoryC3888.m11306("ۨܽ")) * (-25);
                                            i33 = ((iM450215 ^ i32) * 28737) ^ 224819106;
                                            i34 = 2088211524;
                                        }
                                        break;
                                    case -1280652451:
                                    case 660760690:
                                        if (C2249.m6915() <= 0) {
                                            iM450215 = (i31 - C19806.m45029("ۗۤ")) * (-73);
                                            i33 = ((iM450215 ^ i32) * 21745) ^ (-1484667634);
                                            i34 = 2129572609;
                                        } else {
                                            iM450215 = C19806.m45029("֡᩹") ^ i32;
                                            i33 = ((iM450215 ^ i31) * (-15239)) ^ (-1982641949);
                                            i34 = -782320243;
                                        }
                                        break;
                                    case -1246664421:
                                    case -280105045:
                                        C3577.m10565();
                                        iM450215 = (C19806.m45029("ۤܰ") + i32) * 11;
                                        i33 = ((iM450215 ^ i31) * 20245) ^ 2141698783;
                                        i34 = -1831880038;
                                        break;
                                    case -1233773702:
                                    case 344521706:
                                        AbstractC0464.m2313();
                                        throw new RuntimeException();
                                    case -1046164048:
                                    case 61543383:
                                        if (C2124.f7782 <= 0) {
                                            iM450215 = (i31 - C19806.m45029("ۗۤ")) * (-73);
                                            i33 = ((iM450215 ^ i32) * 21745) ^ (-1484667634);
                                            i34 = 2129572609;
                                        } else {
                                            iM450215 = (ThreadFactoryC3888.m11306("ۚ֫") + i31) * 127;
                                            i33 = ((iM450215 ^ i32) * (-1329)) ^ 598106519;
                                            i34 = -37246402;
                                        }
                                        break;
                                    case -444895250:
                                    case 1634939540:
                                        if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                                            iM450215 = (i31 - C19806.m45029("ۗۤ")) * (-73);
                                            i33 = ((iM450215 ^ i32) * 21745) ^ (-1484667634);
                                            i34 = 2129572609;
                                        } else {
                                            iM450215 = (C19806.m45029("ۤܰ") + i32) * 11;
                                            i33 = ((iM450215 ^ i31) * 20245) ^ 2141698783;
                                            i34 = -1831880038;
                                        }
                                        break;
                                    case -115932715:
                                    case 1497356835:
                                        C3722.m10894();
                                        if (C3535.f13026 <= 0) {
                                            iM450215 = (C19806.m45029("֫ۘ") + i31) * (-97);
                                            i33 = ((iM450215 ^ i32) * (-15089)) ^ 845859437;
                                            i34 = -1787622874;
                                        } else {
                                            iM450215 = (C19806.m45029("ۤܰ") + i32) * 11;
                                            i33 = ((iM450215 ^ i31) * 20245) ^ 2141698783;
                                            i34 = -1831880038;
                                        }
                                        break;
                                    case 61760738:
                                    case 574950438:
                                        if (C0050.f912 <= 0) {
                                            iM450215 = (i31 - C19806.m45029("ۗۤ")) * (-73);
                                            i33 = ((iM450215 ^ i32) * 21745) ^ (-1484667634);
                                            i34 = 2129572609;
                                        } else {
                                            iM450215 = (C19806.m45029("ܶۛ") ^ i31) * (-83);
                                            i33 = ((iM450215 ^ i32) * 21471) ^ 1345594874;
                                            i34 = -822582759;
                                        }
                                        break;
                                    case 178064725:
                                    case 2021197400:
                                        if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                                            iM450215 = ThreadFactoryC3888.m11306("۟۬") ^ i31;
                                            i33 = ((iM450215 ^ i32) * 24517) ^ (-1394746118);
                                            i34 = -1440092887;
                                        } else {
                                            iM450215 = (i31 - C19806.m45029("ۗۤ")) * (-73);
                                            i33 = ((iM450215 ^ i32) * 21745) ^ (-1484667634);
                                            i34 = 2129572609;
                                        }
                                        break;
                                    case 310689143:
                                    case 338523126:
                                        C0817.m3399();
                                        if (C2249.f8050 >= 0) {
                                            iM450215 = C19806.m45029("۫ۡ") ^ i32;
                                            i33 = ((iM450215 ^ i31) * (-25461)) ^ 1969988897;
                                            i34 = -1216467140;
                                        } else {
                                            iM450215 = (i31 - C19806.m45029("ۗۤ")) * (-73);
                                            i33 = ((iM450215 ^ i32) * 21745) ^ (-1484667634);
                                            i34 = 2129572609;
                                        }
                                        break;
                                    case 317098228:
                                    case 870895025:
                                        if (C10634.f36300 >= 0) {
                                            iM450215 = (C19806.m45029("֫ۘ") + i31) * (-97);
                                            i33 = ((iM450215 ^ i32) * (-15089)) ^ 845859437;
                                            i34 = -1787622874;
                                        } else {
                                            iM450215 = ThreadFactoryC3888.m11306("ܽ֫") ^ i32;
                                            i33 = ((iM450215 ^ i31) * 15923) ^ 282059558;
                                            i34 = 1486386911;
                                        }
                                        break;
                                    default:
                                        return;
                                }
                            }
                        }
                    });
                    if (C1875.f7103 < 0) {
                        iM450210 = (C19806.m45029("ۙ֨") + i12) * 27;
                        i5 = ((iM450210 ^ i13) * (-217)) ^ (-1707886323);
                        i9 = 1503979304;
                        i6 = iM450210 ^ i9;
                        i21 = i21;
                        sArr = sArr;
                        iM11309 = iM11309;
                        strM6288 = strM6288;
                        sArr2 = sArr2;
                        textInputLayout3 = textInputLayout3;
                        dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                        i15 = i6;
                        i14 = i5;
                        i16 = i16;
                    }
                    sArr = sArr;
                    iM45029 = (ThreadFactoryC3888.m11306("ۨ᩵") + i12) * (-117);
                    i5 = ((iM45029 ^ i13) * 4971) ^ (-1654414711);
                    i8 = -318429984;
                    i6 = iM45029 ^ i8;
                    i21 = i21;
                    iM11309 = iM11309;
                    strM6288 = strM6288;
                    sArr2 = sArr2;
                    textInputLayout3 = textInputLayout3;
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    i15 = i6;
                    i14 = i5;
                    i16 = i16;
                    break;
                case -172805390:
                case 302932946:
                    sArr2 = sArr2;
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    iM11309 = iM11309;
                    strM6288 = strM6288;
                    textInputLayout3 = textInputLayout3;
                    i21 = i21;
                    editText = (EditText) C3743.m10957(viewM4976, C19806.m45029(strM4832) ^ 2104186778);
                    sArr = f76464;
                    if (C1419.m4973()) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨ᩵") + i12) * (-117);
                        i5 = ((iM45029 ^ i13) * 4971) ^ (-1654414711);
                        i8 = -318429984;
                    } else {
                        iM45029 = (C19806.m45029("᩸᩹") + i12) * (-5);
                        i5 = ((iM45029 ^ i13) * 18771) ^ (-1721163530);
                        i8 = 768165072;
                    }
                    i6 = iM45029 ^ i8;
                    i21 = i21;
                    iM11309 = iM11309;
                    strM6288 = strM6288;
                    sArr2 = sArr2;
                    textInputLayout3 = textInputLayout3;
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    i15 = i6;
                    i14 = i5;
                    i16 = i16;
                    break;
                case 659951536:
                case 1872476465:
                    CallableC1627.m5507();
                    C1419.m4973();
                    sArr2 = sArr2;
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    iM11309 = iM11309;
                    strM6288 = strM6288;
                    textInputLayout3 = textInputLayout3;
                    i21 = i21;
                    iM45029 = (ThreadFactoryC3888.m11306("ۨ᩵") + i12) * (-117);
                    i5 = ((iM45029 ^ i13) * 4971) ^ (-1654414711);
                    i8 = -318429984;
                    i6 = iM45029 ^ i8;
                    i21 = i21;
                    iM11309 = iM11309;
                    strM6288 = strM6288;
                    sArr2 = sArr2;
                    textInputLayout3 = textInputLayout3;
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    i15 = i6;
                    i14 = i5;
                    i16 = i16;
                    break;
                case 874280821:
                case 1408949885:
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    i = iM11309;
                    textInputLayout = textInputLayout3;
                    i2 = i21;
                    iM113010 = ThreadFactoryC3888.m11306(C1460.m5047(f76464, 147, 3, i2));
                    iM450211 = (C19806.m45029("ۜۜ") ^ i13) * (-111);
                    i10 = ((iM450211 ^ i12) * 3011) ^ 1913309851;
                    i11 = -151634478;
                    int i212 = iM450211 ^ i11;
                    iM11309 = i;
                    i16 = i16;
                    dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                    i15 = i212;
                    i14 = i10;
                    i21 = i2;
                    textInputLayout3 = textInputLayout;
                    break;
                case 1306801643:
                case 1845205496:
                    RunnableC1606.m5473();
                    if (C1398.m4895() <= 0) {
                        dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                        i = iM11309;
                        textInputLayout = textInputLayout3;
                        i2 = i21;
                        iM450211 = ThreadFactoryC3888.m11306("۬᩷") ^ i13;
                        i10 = ((iM450211 ^ i12) * (-13049)) ^ 384246984;
                        i11 = 402705969;
                        int i213 = iM450211 ^ i11;
                        iM11309 = i;
                        i16 = i16;
                        dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                        i15 = i213;
                        i14 = i10;
                        i21 = i2;
                        textInputLayout3 = textInputLayout;
                    } else {
                        sArr2 = sArr2;
                        dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                        iM11309 = iM11309;
                        strM6288 = strM6288;
                        textInputLayout3 = textInputLayout3;
                        i21 = i21;
                        iM45029 = (ThreadFactoryC3888.m11306("ۨ᩵") + i12) * (-117);
                        i5 = ((iM45029 ^ i13) * 4971) ^ (-1654414711);
                        i8 = -318429984;
                        i6 = iM45029 ^ i8;
                        i21 = i21;
                        iM11309 = iM11309;
                        strM6288 = strM6288;
                        sArr2 = sArr2;
                        textInputLayout3 = textInputLayout3;
                        dialogInterfaceC19356M5514 = dialogInterfaceC19356M5514;
                        i15 = i6;
                        i14 = i5;
                        i16 = i16;
                    }
                    break;
                default:
                    short[] sArr5 = sArr;
                    iM113013 = ThreadFactoryC3888.m11306(C3535.m10423(f76464, 185, 3, i21));
                    i19 = 2104220208;
                    int iM113018 = (ThreadFactoryC3888.m11306("ۜܳ") ^ i13) * 57;
                    i5 = ((iM113018 ^ i12) * 1439) ^ (-1314111288);
                    i6 = iM113018 ^ 1228102399;
                    sArr = sArr5;
                    i15 = i6;
                    i14 = i5;
                    i16 = i16;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m52065(ViewOnClickListenerC23604 viewOnClickListenerC23604) {
        viewOnClickListenerC23604.m52036();
    }

    /* JADX WARN: Code duplicated, block: B:61:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:69:0x0233 A[PHI: r2
      0x0233: PHI (r2v2 int) = (r2v1 int), (r2v1 int), (r2v1 int), (r2v6 int) binds: [B:68:0x0231, B:56:0x01c9, B:19:0x005c, B:6:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0261 A[PHI: r1
      0x0261: PHI (r1v6 java.lang.String) = (r1v1 java.lang.String), (r1v1 java.lang.String), (r1v5 java.lang.String), (r1v1 java.lang.String) binds: [B:72:0x025f, B:64:0x0216, B:33:0x00da, B:15:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52044(C17485 c17485, View view, EditText editText, ViewOnClickListenerC23604 viewOnClickListenerC23604, C1313 c1313) {
        int iM45029;
        int i;
        int i2;
        String strM8470 = null;
        int iM450210 = 0;
        short s = 0;
        int i3 = 0;
        short s2 = 0;
        int i4 = 0;
        int i5 = -30132719;
        int i6 = C1875.f7103;
        int i7 = AbstractC0464.f2088;
        int iM11306 = ThreadFactoryC3888.m11306("᩵᩷") ^ i6;
        int i8 = ((iM11306 ^ i7) * 30201) ^ (-1897770158);
        int i9 = iM11306 ^ (-169336331);
        while (true) {
            i5 = ((((i5 ^ i7) * 29823) >> 31) & i8) ^ i9;
            switch (i5) {
                case -2004613953:
                case 972303614:
                    i4 = 20853;
                    iM45029 = C19806.m45029("ܽۜ") ^ i7;
                    i = ((iM45029 ^ i6) * 12257) ^ (-2001535485);
                    i2 = -778252209;
                    i9 = iM45029 ^ i2;
                    i8 = i;
                    break;
                case -1979809705:
                case -456080575:
                    strM8470 = C2788.m8470(f76464, 73, 8, i4);
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = C19806.m45029("ۨܿ") ^ i6;
                        i = ((iM45029 ^ i7) * 24357) ^ (-347815165);
                        i2 = -1184455591;
                    } else {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("ᩳۢ")) * (-113);
                        i = ((iM45029 ^ i7) * (-29089)) ^ 1620856359;
                        i2 = -308819219;
                    }
                    i9 = iM45029 ^ i2;
                    i8 = i;
                    break;
                case -1918822627:
                case 403602404:
                    C2477.m7593();
                    if (C1189.f5284 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ᩻") ^ i6;
                        i = ((iM45029 ^ i7) * (-8441)) ^ (-237623632);
                        i2 = 776054228;
                        i9 = iM45029 ^ i2;
                        i8 = i;
                    }
                    iM45029 = (C19806.m45029("ۜ᩵") + i7) * 73;
                    i = ((iM45029 ^ i6) * (-31705)) ^ (-1909149671);
                    i2 = 1902948368;
                    i9 = iM45029 ^ i2;
                    i8 = i;
                    break;
                case -1858485288:
                case 320887712:
                    if (C1461.f5957 <= 0) {
                        iM45029 = C19806.m45029("ۨܿ") ^ i6;
                        i = ((iM45029 ^ i7) * 24357) ^ (-347815165);
                        i2 = -1184455591;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ᩺") ^ i7;
                        i = ((iM45029 ^ i6) * (-29679)) ^ 397503281;
                        i2 = 736071689;
                    }
                    i9 = iM45029 ^ i2;
                    i8 = i;
                    break;
                case -1749858254:
                case 1740723281:
                    if (C3743.f13569) {
                        iM45029 = (ThreadFactoryC3888.m11306("֡֫") + i7) * (-35);
                        i = ((iM45029 ^ i6) * 18909) ^ (-1798367862);
                        i2 = 1493566829;
                    } else {
                        iM45029 = (i7 - C19806.m45029("ۘۛ")) * (-13);
                        i = ((iM45029 ^ i6) * 7465) ^ (-1460955910);
                        i2 = 525548441;
                    }
                    i9 = iM45029 ^ i2;
                    i8 = i;
                    break;
                case -1672156747:
                case -804263962:
                    RunnableC3388.m10064();
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    iM45029 = (C19806.m45029("ۜ᩵") + i7) * 73;
                    i = ((iM45029 ^ i6) * (-31705)) ^ (-1909149671);
                    i2 = 1902948368;
                    i9 = iM45029 ^ i2;
                    i8 = i;
                    break;
                case -1642083164:
                case 1546353321:
                    i4 = 43163;
                    iM45029 = C19806.m45029("ܽۜ") ^ i7;
                    i = ((iM45029 ^ i6) * 12257) ^ (-2001535485);
                    i2 = -778252209;
                    i9 = iM45029 ^ i2;
                    i8 = i;
                    break;
                case -1471337815:
                case -1313814991:
                    CallableC1627.m5503(RunnableC3388.m10065(c1313, 2127440902 ^ iM450210));
                    break;
                case -1284614528:
                case -1157630902:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = (C19806.m45029("ۜ᩵") + i7) * 73;
                        i = ((iM45029 ^ i6) * (-31705)) ^ (-1909149671);
                        i2 = 1902948368;
                    } else {
                        iM45029 = (i6 - C19806.m45029("ۡܽ")) * (-93);
                        i = ((iM45029 ^ i7) * (-15575)) ^ (-1355247889);
                        i2 = 886432484;
                    }
                    i9 = iM45029 ^ i2;
                    i8 = i;
                    break;
                case -1146220073:
                case 2034613260:
                    s = f76464[72];
                    if (C0817.f3443) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ۡ") ^ i7;
                        i = ((iM45029 ^ i6) * 10397) ^ (-1295600470);
                        i2 = -1101367813;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖۜ") ^ i7;
                        i = ((iM45029 ^ i6) * 11345) ^ (-2104530187);
                        i2 = -708609284;
                    }
                    i9 = iM45029 ^ i2;
                    i8 = i;
                    break;
                case -982492826:
                case 506373061:
                    if (C1148.m4232() <= 0) {
                        iM45029 = C19806.m45029("ۨܿ") ^ i6;
                        i = ((iM45029 ^ i7) * 24357) ^ (-347815165);
                        i2 = -1184455591;
                        i9 = iM45029 ^ i2;
                        i8 = i;
                    }
                    iM45029 = (C19806.m45029("ۜ᩵") + i7) * 73;
                    i = ((iM45029 ^ i6) * (-31705)) ^ (-1909149671);
                    i2 = 1902948368;
                    i9 = iM45029 ^ i2;
                    i8 = i;
                    break;
                case -581661457:
                case 192856179:
                    CallableC1627.m5508(c1313, strM8470);
                    C1419.m4978(c17485);
                    if (RunnableC1564.m5342(c1313)) {
                        iM45029 = C19806.m45029("ۖ۟") ^ i6;
                        i = ((iM45029 ^ i7) * 29529) ^ 339121344;
                        i2 = 70817831;
                    } else {
                        iM45029 = C19806.m45029("֡ܳ") ^ i7;
                        i = ((iM45029 ^ i6) * (-8211)) ^ (-1463835210);
                        i2 = 1124792469;
                    }
                    i9 = iM45029 ^ i2;
                    i8 = i;
                    break;
                case -551849818:
                case -155939823:
                    if (C0050.m946() <= 0) {
                        iM45029 = (i7 - C19806.m45029("ۘۛ")) * (-13);
                        i = ((iM45029 ^ i6) * 7465) ^ (-1460955910);
                        i2 = 525548441;
                    } else {
                        iM45029 = C19806.m45029("᩸۠") ^ i6;
                        i = ((iM45029 ^ i7) * (-2673)) ^ 825426246;
                        i2 = 2047601437;
                    }
                    i9 = iM45029 ^ i2;
                    i8 = i;
                    break;
                case -432529495:
                case 1371472480:
                    int i10 = s + 1;
                    i3 = i10 * i10;
                    s2 = 2;
                    if (C3743.f13569) {
                        iM45029 = C19806.m45029("ۜۨ") ^ i6;
                        i = ((iM45029 ^ i7) * (-5197)) ^ (-1247340507);
                        i2 = -1198102114;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ᩻") ^ i6;
                        i = ((iM45029 ^ i7) * (-8441)) ^ (-237623632);
                        i2 = 776054228;
                    }
                    i9 = iM45029 ^ i2;
                    i8 = i;
                    break;
                case -284602045:
                case 578894792:
                    RunnableC1606.m5477(view, false);
                    C1977.m6361(editText);
                    viewOnClickListenerC23604.m52038();
                    break;
                case -192927936:
                case 517635322:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = C19806.m45029("ۨܿ") ^ i6;
                        i = ((iM45029 ^ i7) * 24357) ^ (-347815165);
                        i2 = -1184455591;
                    } else {
                        iM45029 = C19806.m45029("ۛ᩹") ^ i7;
                        i = ((iM45029 ^ i6) * (-28133)) ^ 912588427;
                        i2 = -2022102657;
                    }
                    i9 = iM45029 ^ i2;
                    i8 = i;
                    break;
                case 1158076496:
                case 2111536466:
                    C3660.m10791();
                    break;
                case 1323396629:
                case 1941817740:
                    if (C0278.f1572 <= 0) {
                        iM45029 = (C19806.m45029("ۜ᩵") + i7) * 73;
                        i = ((iM45029 ^ i6) * (-31705)) ^ (-1909149671);
                        i2 = 1902948368;
                    } else {
                        iM45029 = (C19806.m45029("ۚۖ") + i6) * (-25);
                        i = ((iM45029 ^ i7) * 2581) ^ (-1926356581);
                        i2 = 1876885358;
                    }
                    i9 = iM45029 ^ i2;
                    i8 = i;
                    break;
                case 1381460643:
                case 1549416017:
                    if (C0962.f3784) {
                        iM45029 = (i7 - C19806.m45029("ۘۛ")) * (-13);
                        i = ((iM45029 ^ i6) * 7465) ^ (-1460955910);
                        i2 = 525548441;
                        i9 = iM45029 ^ i2;
                        i8 = i;
                    }
                    iM45029 = (C19806.m45029("ۜ᩵") + i7) * 73;
                    i = ((iM45029 ^ i6) * (-31705)) ^ (-1909149671);
                    i2 = 1902948368;
                    i9 = iM45029 ^ i2;
                    i8 = i;
                    break;
                case 1403494847:
                case 1878452904:
                    if (i3 - ((s * s2) + 1) < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۬ܺ") ^ i6;
                        i = ((iM45029 ^ i7) * 3967) ^ 1811156221;
                        i2 = 1672858332;
                    } else {
                        iM45029 = (C19806.m45029("ܺ۫") ^ i7) * (-41);
                        i = ((iM45029 ^ i6) * 3601) ^ 1679826058;
                        i2 = -2073321965;
                    }
                    i9 = iM45029 ^ i2;
                    i8 = i;
                    break;
                default:
                    iM450210 = C19806.m45029(C1875.m6105(f76464, 81, 3, i4));
                    if (C1066.f4915 <= 0) {
                        iM45029 = (i7 - C19806.m45029("ۘۛ")) * (-13);
                        i = ((iM45029 ^ i6) * 7465) ^ (-1460955910);
                        i2 = 525548441;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺۟") + i6) * 25;
                        i = ((iM45029 ^ i7) * 8943) ^ (-34707437);
                        i2 = 1235974451;
                    }
                    i9 = iM45029 ^ i2;
                    i8 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0202 A[PHI: r7 r10 r11 r12 r16 r18
      0x0202: PHI (r7v3 int) = (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:55:0x0200, B:37:0x0134, B:19:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r10v3 short[]) = (r10v1 short[]), (r10v2 short[]), (r10v1 short[]) binds: [B:55:0x0200, B:37:0x0134, B:19:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r11v3 int) = (r11v1 int), (r11v2 int), (r11v1 int) binds: [B:55:0x0200, B:37:0x0134, B:19:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:55:0x0200, B:37:0x0134, B:19:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r16v21 int) = (r16v9 int), (r16v16 int), (r16v22 int) binds: [B:55:0x0200, B:37:0x0134, B:19:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r18v18 int) = (r18v6 int), (r18v13 int), (r18v19 int) binds: [B:55:0x0200, B:37:0x0134, B:19:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x02af A[PHI: r3 r8 r16 r18
      0x02af: PHI (r3v3 short[]) = (r3v2 short[]), (r3v1 short[]) binds: [B:67:0x02ad, B:51:0x01d8] A[DONT_GENERATE, DONT_INLINE]
      0x02af: PHI (r8v2 short) = (r8v1 short), (r8v3 short) binds: [B:67:0x02ad, B:51:0x01d8] A[DONT_GENERATE, DONT_INLINE]
      0x02af: PHI (r16v10 int) = (r16v6 int), (r16v11 int) binds: [B:67:0x02ad, B:51:0x01d8] A[DONT_GENERATE, DONT_INLINE]
      0x02af: PHI (r18v7 int) = (r18v3 int), (r18v8 int) binds: [B:67:0x02ad, B:51:0x01d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x02eb A[PHI: r16 r17 r18
      0x02eb: PHI (r16v25 int) = (r16v5 int), (r16v17 int), (r16v27 int) binds: [B:72:0x02e9, B:33:0x010e, B:11:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x02eb: PHI (r17v3 java.lang.String) = (r17v1 java.lang.String), (r17v2 java.lang.String), (r17v1 java.lang.String) binds: [B:72:0x02e9, B:33:0x010e, B:11:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x02eb: PHI (r18v22 int) = (r18v2 int), (r18v14 int), (r18v23 int) binds: [B:72:0x02e9, B:33:0x010e, B:11:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7321 m52039(ViewOnClickListenerC23604 viewOnClickListenerC23604, C9076 c9076) throws Throwable {
        int iM45029;
        int i;
        int i2;
        int iM450210 = 0;
        int i3 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i4 = 0;
        short s3 = 0;
        int i5 = 0;
        short[] sArr2 = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 544447737;
        int i9 = C1937.f7317;
        int i10 = RunnableC0195.f1321;
        int iM11306 = ThreadFactoryC3888.m11306("ۤۡ") ^ i10;
        int i11 = ((iM11306 ^ i9) * (-25419)) ^ (-193656652);
        int i12 = iM11306 ^ (-1324193825);
        String strM10423 = null;
        while (true) {
            int i13 = i12 ^ (i11 & (((i8 ^ i9) * (-23215)) >> 31));
            switch (i13) {
                case -2072701670:
                case 1392709571:
                    i13 = i13;
                    iM450210 = C19806.m45029(strM10423);
                    if (C1875.f7103 >= 0) {
                        i3 = 2126000834;
                        iM45029 = (i10 - ThreadFactoryC3888.m11306("ۗۜ")) * 55;
                        iM450210 = iM450210;
                        i = ((iM45029 ^ i9) * (-29153)) ^ 1832797890;
                        i2 = 2026408883;
                        i8 = i13;
                        i12 = iM45029 ^ i2;
                        i11 = i;
                        iM450210 = iM450210;
                    } else {
                        int iM450211 = (C19806.m45029("ܿܰ") ^ i9) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i8 = i13;
                        i12 = iM450211 ^ (-1933652952);
                        i11 = ((iM450211 ^ i10) * 30471) ^ 226758196;
                        i3 = 2126000834;
                    }
                    break;
                case -2054386037:
                case 1315830574:
                    iM450210 = iM450210;
                    i13 = i13;
                    c = 23;
                    if (C2871.f10837 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("۟᩹") ^ i10) * (-19);
                        i = ((iM45029 ^ i9) * (-961)) ^ 1792428650;
                        i2 = 1987202558;
                    } else {
                        iM45029 = (i9 - ThreadFactoryC3888.m11306("֨۫")) * 9;
                        i = ((iM45029 ^ i10) * (-737)) ^ (-1582640018);
                        i2 = -564267671;
                    }
                    i8 = i13;
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    iM450210 = iM450210;
                    break;
                case -1939777394:
                case 2057186087:
                    iM450210 = iM450210;
                    i13 = i13;
                    s3 = 59376;
                    if (C2642.m8171() != 0) {
                        iM450210 = iM450210;
                        iM45029 = (i10 - ThreadFactoryC3888.m11306("ۗۜ")) * 55;
                        iM450210 = iM450210;
                        i = ((iM45029 ^ i9) * (-29153)) ^ 1832797890;
                        i2 = 2026408883;
                    } else {
                        iM45029 = (i10 - ThreadFactoryC3888.m11306("ۙ᩹")) * (-63);
                        i = ((iM45029 ^ i9) * (-17457)) ^ (-323002719);
                        i2 = -1534336713;
                    }
                    i8 = i13;
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    iM450210 = iM450210;
                    break;
                case -1748742893:
                case 1335378570:
                    iM450210 = iM450210;
                    i13 = i13;
                    s = sArr[c];
                    s2 = 14844;
                    if (C10634.f36300 >= 0) {
                        iM45029 = (C19806.m45029("ܰۢ") ^ i9) * 45;
                        i = ((iM45029 ^ i10) * 24359) ^ (-1053505717);
                        i2 = 1955731692;
                    } else {
                        iM45029 = (C19806.m45029("ۙܿ") + i10) * 77;
                        i = ((iM45029 ^ i9) * (-28851)) ^ (-186693979);
                        i2 = -585334186;
                    }
                    i8 = i13;
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    iM450210 = iM450210;
                    break;
                case -1701839853:
                case 1751714238:
                    iM450210 = iM450210;
                    i13 = i13;
                    int i14 = s + s2;
                    i4 = i14 * i14;
                    if (C2477.f9839 <= 0) {
                        iM45029 = C19806.m45029("ܶ᩸") ^ i9;
                        i = ((iM45029 ^ i10) * 29395) ^ (-119380275);
                        i2 = 1469356959;
                    } else {
                        iM45029 = C19806.m45029("ۨᩴ") ^ i9;
                        i = ((iM45029 ^ i10) * (-3051)) ^ (-162990541);
                        i2 = -1859998010;
                    }
                    i8 = i13;
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    iM450210 = iM450210;
                    break;
                case -1685135285:
                case 2090643261:
                    i13 = i13;
                    C20364.f65938.m44958((InterfaceC1423) viewOnClickListenerC23604);
                    iM450210 = iM450210;
                    iM45029 = C19806.m45029("֫᩻") ^ i10;
                    i = ((iM45029 ^ i9) * 7725) ^ 396809457;
                    i2 = 1981416138;
                    i8 = i13;
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    iM450210 = iM450210;
                    break;
                case -1587639285:
                case 1866651401:
                    C0671.m3008();
                    if (C2249.f8050 < 0) {
                        iM450210 = iM450210;
                        i13 = i13;
                        iM45029 = C19806.m45029("ܶ᩸") ^ i9;
                        i = ((iM45029 ^ i10) * 29395) ^ (-119380275);
                        i2 = 1469356959;
                        i8 = i13;
                        i12 = iM45029 ^ i2;
                        i11 = i;
                        iM450210 = iM450210;
                    }
                    i13 = i13;
                    iM45029 = (i10 - ThreadFactoryC3888.m11306("ۗۜ")) * 55;
                    iM450210 = iM450210;
                    i = ((iM45029 ^ i9) * (-29153)) ^ 1832797890;
                    i2 = 2026408883;
                    i8 = i13;
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    iM450210 = iM450210;
                    break;
                case -1278773373:
                case -1064580910:
                    i5 = 2742;
                    iM45029 = (ThreadFactoryC3888.m11306("ۘܽ") ^ i9) * 51;
                    i = ((iM45029 ^ i10) * (-17703)) ^ 1924611056;
                    i2 = 872900584;
                    i8 = i13;
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    iM450210 = iM450210;
                    break;
                case -1138223888:
                case -598002103:
                    C2332.m7079();
                    i13 = i13;
                    iM45029 = (i10 - ThreadFactoryC3888.m11306("ۗۜ")) * 55;
                    iM450210 = iM450210;
                    i = ((iM45029 ^ i9) * (-29153)) ^ 1832797890;
                    i2 = 2026408883;
                    i8 = i13;
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    iM450210 = iM450210;
                    break;
                case -1030632336:
                case 1643571347:
                    iM450210 = iM450210;
                    i13 = i13;
                    if (C20364.m45944(c9076)) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳ᩸") + i9) * (-11);
                        i = ((iM45029 ^ i10) * 27243) ^ (-1582179934);
                        i2 = -1108238519;
                    } else {
                        iM45029 = C19806.m45029("֫᩻") ^ i10;
                        i = ((iM45029 ^ i9) * 7725) ^ 396809457;
                        i2 = 1981416138;
                    }
                    i8 = i13;
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    iM450210 = iM450210;
                    break;
                case -1005015565:
                case 1774137482:
                    C0817.m3399();
                    if (C0050.f912 <= 0) {
                        iM450210 = iM450210;
                        i13 = i13;
                        iM45029 = (ThreadFactoryC3888.m11306("۟᩹") ^ i10) * (-19);
                        i = ((iM45029 ^ i9) * (-961)) ^ 1792428650;
                        i2 = 1987202558;
                        i8 = i13;
                        i12 = iM45029 ^ i2;
                        i11 = i;
                        iM450210 = iM450210;
                    }
                    i13 = i13;
                    iM45029 = (i10 - ThreadFactoryC3888.m11306("ۗۜ")) * 55;
                    iM450210 = iM450210;
                    i = ((iM45029 ^ i9) * (-29153)) ^ 1832797890;
                    i2 = 2026408883;
                    i8 = i13;
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    iM450210 = iM450210;
                    break;
                case -707846487:
                case -692137682:
                    return C7321.f24318;
                case -658209618:
                case 1600681974:
                    iM450210 = iM450210;
                    i13 = i13;
                    sArr = f76464;
                    if (C3286.f12186) {
                        iM450210 = iM450210;
                        iM45029 = (i10 - ThreadFactoryC3888.m11306("ۗۜ")) * 55;
                        iM450210 = iM450210;
                        i = ((iM45029 ^ i9) * (-29153)) ^ 1832797890;
                        i2 = 2026408883;
                    } else {
                        iM45029 = (i10 - C19806.m45029("ᩳۧ")) * (-91);
                        i = ((iM45029 ^ i9) * 16863) ^ 112196911;
                        i2 = 1101936464;
                    }
                    i8 = i13;
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    iM450210 = iM450210;
                    break;
                case -277397466:
                case -36556626:
                    iM450210 = iM450210;
                    i13 = i13;
                    strM10423 = C3535.m10423(sArr2, i6, i7, i5);
                    if (C2788.f10625 >= 0) {
                        iM45029 = C19806.m45029("ۗᩴ") ^ i10;
                        i = ((iM45029 ^ i9) * 16997) ^ 449928214;
                        i2 = 1741526493;
                    } else {
                        iM45029 = C19806.m45029("᩸ۧ") ^ i10;
                        i = ((iM45029 ^ i9) * 18841) ^ 2052209584;
                        i2 = -254418177;
                    }
                    i8 = i13;
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    iM450210 = iM450210;
                    break;
                case 79130591:
                case 1342741812:
                    C3577.m10565();
                    if (C2788.f10625 < 0) {
                        iM450210 = iM450210;
                        i13 = i13;
                        iM45029 = C19806.m45029("ۗᩴ") ^ i10;
                        i = ((iM45029 ^ i9) * 16997) ^ 449928214;
                        i2 = 1741526493;
                        i8 = i13;
                        i12 = iM45029 ^ i2;
                        i11 = i;
                        iM450210 = iM450210;
                    }
                    i13 = i13;
                    iM45029 = (i10 - ThreadFactoryC3888.m11306("ۗۜ")) * 55;
                    iM450210 = iM450210;
                    i = ((iM45029 ^ i9) * (-29153)) ^ 1832797890;
                    i2 = 2026408883;
                    i8 = i13;
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    iM450210 = iM450210;
                    break;
                case 191862972:
                case 302088953:
                    i13 = i13;
                    C1668.m5576(iM450210 ^ i3);
                    viewOnClickListenerC23604.m52066();
                    if (RunnableC1564.m5345()) {
                        iM45029 = (i10 - ThreadFactoryC3888.m11306("ۗۜ")) * 55;
                        iM450210 = iM450210;
                        i = ((iM45029 ^ i9) * (-29153)) ^ 1832797890;
                        i2 = 2026408883;
                    } else {
                        iM45029 = C19806.m45029("ܳۘ") ^ i9;
                        iM450210 = iM450210;
                        i = ((iM45029 ^ i10) * 30659) ^ (-263428217);
                        i2 = -1759495083;
                    }
                    i8 = i13;
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    iM450210 = iM450210;
                    break;
                case 315059697:
                case 441625370:
                    iM450210 = iM450210;
                    i13 = i13;
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = C19806.m45029("ۗᩴ") ^ i10;
                        i = ((iM45029 ^ i9) * 16997) ^ 449928214;
                        i2 = 1741526493;
                    } else {
                        iM45029 = C19806.m45029("֨ۗ") ^ i9;
                        i = ((iM45029 ^ i10) * 11297) ^ (-494514071);
                        i2 = -1261128524;
                    }
                    i8 = i13;
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    iM450210 = iM450210;
                    break;
                case 546657218:
                case 1242205969:
                    C1937.m6279();
                    return null;
                case 675254962:
                case 1664289459:
                    iM450210 = iM450210;
                    i13 = i13;
                    sArr2 = f76464;
                    i6 = 24;
                    i7 = 3;
                    if (C0797.f3386) {
                        iM45029 = C19806.m45029("ܶ᩸") ^ i9;
                        i = ((iM45029 ^ i10) * 29395) ^ (-119380275);
                        i2 = 1469356959;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۨ") ^ i10;
                        i = ((iM45029 ^ i9) * 10429) ^ 215732510;
                        i2 = 1285664005;
                    }
                    i8 = i13;
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    iM450210 = iM450210;
                    break;
                case 1771105787:
                case 1875655676:
                    i5 = 60262;
                    iM45029 = (ThreadFactoryC3888.m11306("ۘܽ") ^ i9) * 51;
                    i = ((iM45029 ^ i10) * (-17703)) ^ 1924611056;
                    i2 = 872900584;
                    i8 = i13;
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    iM450210 = iM450210;
                    break;
                default:
                    iM450210 = iM450210;
                    i13 = i13;
                    if (i4 - (s * s3) < 0) {
                        iM45029 = (i10 - ThreadFactoryC3888.m11306("ܿ᩵")) * 33;
                        i = ((iM45029 ^ i9) * (-29593)) ^ 1571975639;
                        i2 = 1908177185;
                    } else {
                        iM45029 = C19806.m45029("۠᩶") ^ i9;
                        i = ((iM45029 ^ i10) * (-26473)) ^ (-1648670647);
                        i2 = 725045801;
                    }
                    i8 = i13;
                    i12 = iM45029 ^ i2;
                    i11 = i;
                    iM450210 = iM450210;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:92:0x02cb A[PHI: r10 r11 r21 r24
      0x02cb: PHI (r10v3 char) = (r10v2 char), (r10v1 char) binds: [B:91:0x02c9, B:77:0x022e] A[DONT_GENERATE, DONT_INLINE]
      0x02cb: PHI (r11v3 char) = (r11v2 char), (r11v1 char) binds: [B:91:0x02c9, B:77:0x022e] A[DONT_GENERATE, DONT_INLINE]
      0x02cb: PHI (r21v16 boolean) = (r21v13 boolean), (r21v17 boolean) binds: [B:91:0x02c9, B:77:0x022e] A[DONT_GENERATE, DONT_INLINE]
      0x02cb: PHI (r24v7 int) = (r24v4 int), (r24v8 int) binds: [B:91:0x02c9, B:77:0x022e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0078, code lost:
    
        if (l.C3286.f12186 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d7, code lost:
    
        if (l.MenuItemOnMenuItemClickListenerC3244.m9701() < 0) goto L35;
     */
    /* JADX WARN: Type inference failed for: r4v8, types: [l.ۢ᩵᩺] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m52061(android.widget.EditText r27, final l.DialogInterfaceC19356 r28, l.ViewOnClickListenerC23604 r29, final com.google.android.material.textfield.TextInputLayout r30) {
        /*
            Method dump skipped, instruction units count: 1902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC23604.m52061(android.widget.EditText, l.᩵ۡۜ, l.᩻ۡ᩺, com.google.android.material.textfield.TextInputLayout):void");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00f5 A[PHI: r10
      0x00f5: PHI (r10v4 short[]) = (r10v3 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:29:0x00f3, B:14:0x0088, B:11:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x01c3 A[PHI: r1 r2 r7 r13 r14
      0x01c3: PHI (r1v4 l.۠ۡۜ) = (r1v3 l.۠ۡۜ), (r1v2 l.۠ۡۜ), (r1v2 l.۠ۡۜ), (r1v2 l.۠ۡۜ), (r1v2 l.۠ۡۜ) binds: [B:49:0x01c1, B:41:0x017b, B:25:0x00ce, B:11:0x0083, B:7:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r2v5 int) = (r2v2 int), (r2v4 int), (r2v2 int), (r2v2 int), (r2v2 int) binds: [B:49:0x01c1, B:41:0x017b, B:25:0x00ce, B:11:0x0083, B:7:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r7v5 java.lang.String) = 
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
      (r7v4 java.lang.String)
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
     binds: [B:49:0x01c1, B:41:0x017b, B:25:0x00ce, B:11:0x0083, B:7:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r13v4 short[]) = (r13v3 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:49:0x01c1, B:41:0x017b, B:25:0x00ce, B:11:0x0083, B:7:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x01c3: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:49:0x01c1, B:41:0x017b, B:25:0x00ce, B:11:0x0083, B:7:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0258 A[PHI: r5 r18 r23
      0x0258: PHI (r5v5 java.lang.String) = (r5v2 java.lang.String), (r5v3 java.lang.String), (r5v2 java.lang.String), (r5v2 java.lang.String) binds: [B:60:0x0256, B:45:0x019b, B:14:0x0088, B:5:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r18v5 short) = (r18v3 short), (r18v2 short), (r18v2 short), (r18v2 short) binds: [B:60:0x0256, B:45:0x019b, B:14:0x0088, B:5:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r23v6 short) = (r23v4 short), (r23v3 short), (r23v3 short), (r23v3 short) binds: [B:60:0x0256, B:45:0x019b, B:14:0x0088, B:5:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x028c A[PHI: r3 r4 r6 r8 r9 r15 r16 r17
      0x028c: PHI (r3v3 int) = (r3v2 int), (r3v2 int), (r3v2 int), (r3v5 int) binds: [B:64:0x028a, B:37:0x0155, B:33:0x0131, B:21:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x028c: PHI (r4v3 java.lang.Object) = (r4v2 java.lang.Object), (r4v2 java.lang.Object), (r4v2 java.lang.Object), (r4v4 java.lang.Object) binds: [B:64:0x028a, B:37:0x0155, B:33:0x0131, B:21:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x028c: PHI (r6v4 int) = (r6v2 int), (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:64:0x028a, B:37:0x0155, B:33:0x0131, B:21:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x028c: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:64:0x028a, B:37:0x0155, B:33:0x0131, B:21:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x028c: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:64:0x028a, B:37:0x0155, B:33:0x0131, B:21:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x028c: PHI (r15v4 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:64:0x028a, B:37:0x0155, B:33:0x0131, B:21:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x028c: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:64:0x028a, B:37:0x0155, B:33:0x0131, B:21:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x028c: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:64:0x028a, B:37:0x0155, B:33:0x0131, B:21:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private final void m52038() {
        int iM45029;
        int i;
        int i2;
        int i3 = C3660.f13403;
        int i4 = C2249.f8050;
        int iM11306 = ThreadFactoryC3888.m11306("ᩳۗ") ^ i3;
        int i5 = ((iM11306 ^ i4) * (-23273)) ^ (-654215537);
        String strM26821 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i6 = iM11306 ^ 1010793470;
        C8067 c8067M5356 = null;
        int iM450210 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        char c = 0;
        short s = 0;
        int i11 = -130642571;
        short s2 = 0;
        Object obj = null;
        String strM6288 = null;
        int iM450211 = 0;
        int iM450212 = 0;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i4) * 22595) >> 31));
            switch (i11) {
                case -2120237336:
                case -426747928:
                    C1377.m4836(c8067M5356, iM450210);
                    sArr3 = f76464;
                    i7 = 17;
                    i8 = 3;
                    if (C1398.f5802 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧۧ") + i3) * 47;
                        i = ((iM45029 ^ i4) * (-5427)) ^ (-1033326555);
                        i2 = -444106995;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙᩳ") ^ i4;
                        i = ((iM45029 ^ i3) * 6653) ^ 739437822;
                        i2 = -1999458818;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1980640626:
                case -148247035:
                    i9 = 13563;
                    iM45029 = (i3 - ThreadFactoryC3888.m11306("ᩳ᩸")) * (-53);
                    i = ((iM45029 ^ i4) * 17821) ^ 943095155;
                    i2 = -1706452284;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1710046562:
                case 1142104318:
                    C3577.m10565();
                    C10634.m26820();
                    break;
                case -1708551551:
                case -175316592:
                    s = sArr[c];
                    s2 = 37628;
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۧ") ^ i3;
                        i = ((iM45029 ^ i4) * (-31983)) ^ (-1240728288);
                        i2 = -742532399;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨ᩺") ^ i3;
                        i = ((iM45029 ^ i4) * 747) ^ 389947761;
                        i2 = 1134072063;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1698212385:
                case 1017634656:
                    AbstractC0464.m2313();
                    if (C2249.f8050 >= 0) {
                        iM45029 = (i3 - C19806.m45029("ۚ᩺")) * 15;
                        i = ((iM45029 ^ i4) * 25207) ^ (-21968783);
                        i2 = -1957411795;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۚ") ^ i4;
                        i = ((iM45029 ^ i3) * 25405) ^ 1791074638;
                        i2 = 1536567781;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1689222471:
                case 1208601361:
                    iM450211 = 2098063078 ^ C19806.m45029(strM6288);
                    obj = null;
                    if (C3535.f13026 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧۧ") + i3) * 47;
                        i = ((iM45029 ^ i4) * (-5427)) ^ (-1033326555);
                        i2 = -444106995;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ܰ") + i4) * (-81);
                        i = ((iM45029 ^ i3) * 5443) ^ (-607101051);
                        i2 = 1477168539;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1678359576:
                case 1114700080:
                    if (C2642.m8171() == 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤܿ") ^ i4) * (-27);
                        i = ((iM45029 ^ i3) * 5) ^ (-814194215);
                        i2 = -1587870198;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۚ᩺")) * 15;
                        i = ((iM45029 ^ i4) * 25207) ^ (-21968783);
                        i2 = -1957411795;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1634750404:
                case -1317943261:
                    strM6288 = C1937.m6288(sArr4, 20, 3, i9);
                    if (C2249.f8050 >= 0) {
                        iM45029 = (i3 - C19806.m45029("ۚ᩺")) * 15;
                        i = ((iM45029 ^ i4) * 25207) ^ (-21968783);
                        i2 = -1957411795;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۛ") ^ i4;
                        i = ((iM45029 ^ i3) * 11771) ^ (-380786089);
                        i2 = 1530082615;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1429920388:
                case 751641666:
                    iM450210 = 2124064402 ^ C19806.m45029(strM26821);
                    if (RunnableC0195.m1431()) {
                        iM45029 = C19806.m45029("ܰ᩵") ^ i4;
                        i = ((iM45029 ^ i3) * 8229) ^ 116266285;
                        i2 = 653524930;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۚ᩺")) * 15;
                        i = ((iM45029 ^ i4) * 25207) ^ (-21968783);
                        i2 = -1957411795;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1416470407:
                case -59026386:
                    sArr = f76464;
                    c = '\r';
                    if (C1460.m5050() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧۧ") + i3) * 47;
                        i = ((iM45029 ^ i4) * (-5427)) ^ (-1033326555);
                        i2 = -444106995;
                    } else {
                        iM45029 = C19806.m45029("ۜۚ") ^ i4;
                        i = ((iM45029 ^ i3) * 11139) ^ 362808295;
                        i2 = 1514805392;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1106141461:
                case 1219564075:
                    iM450212 = C19806.m45029(C2477.m7604(sArr3, i7, i8, i9));
                    if (C1189.m4368() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧۧ") + i3) * 47;
                        i = ((iM45029 ^ i4) * (-5427)) ^ (-1033326555);
                        i2 = -444106995;
                    } else {
                        iM45029 = C19806.m45029("ܺۙ") ^ i3;
                        i = ((iM45029 ^ i4) * (-20803)) ^ (-780508969);
                        i2 = -1894971111;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -742231159:
                case 2018686786:
                    AbstractC0464.m2309(c8067M5356, iM450211, obj);
                    C23250.m51307(C2704.m8239(c8067M5356));
                    break;
                case -734641874:
                case -139539915:
                    if (((s * s) + 353966596) - (s * s2) >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿۗ") ^ i3;
                        i = ((iM45029 ^ i4) * 9599) ^ 1569700953;
                        i2 = -62400702;
                    } else {
                        iM45029 = (C19806.m45029("۬ۙ") + i4) * 101;
                        i = ((iM45029 ^ i3) * (-2297)) ^ (-620184734);
                        i2 = 279941833;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -540927123:
                case 1617607649:
                    strM26821 = C10634.m26821(sArr2, i10, 3, i9);
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۧ") ^ i3;
                        i = ((iM45029 ^ i4) * (-31983)) ^ (-1240728288);
                        i2 = -742532399;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۗ") ^ i3;
                        i = ((iM45029 ^ i4) * 20941) ^ (-457944990);
                        i2 = 1030479583;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -422124833:
                case 1752283104:
                    if (ThreadFactoryC3888.f14547 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۧ") ^ i3;
                        i = ((iM45029 ^ i4) * (-31983)) ^ (-1240728288);
                        i2 = -742532399;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤܿ") ^ i4) * (-27);
                        i = ((iM45029 ^ i3) * 5) ^ (-814194215);
                        i2 = -1587870198;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 65782478:
                case 691487820:
                    c8067M5356 = RunnableC1564.m5356(this);
                    sArr2 = f76464;
                    i10 = 14;
                    if (C0216.m1591() <= 0) {
                        iM45029 = (i3 - C19806.m45029("ۚ᩺")) * 15;
                        i = ((iM45029 ^ i4) * 25207) ^ (-21968783);
                        i2 = -1957411795;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("᩺۬")) * 47;
                        i = ((iM45029 ^ i3) * 18073) ^ (-1759900676);
                        i2 = 835274322;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 413388421:
                case 834090293:
                    C1148.m4224(c8067M5356, 2126039842 ^ iM450212);
                    sArr4 = f76464;
                    if (C3660.f13403 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤܿ") ^ i4) * (-27);
                        i = ((iM45029 ^ i3) * 5) ^ (-814194215);
                        i2 = -1587870198;
                    } else {
                        iM45029 = (C19806.m45029("᩹۟") ^ i3) * (-127);
                        i = ((iM45029 ^ i4) * (-759)) ^ (-1185493915);
                        i2 = 1603274873;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1810436473:
                case 1941674892:
                    i9 = 53036;
                    iM45029 = (i3 - ThreadFactoryC3888.m11306("ᩳ᩸")) * (-53);
                    i = ((iM45029 ^ i4) * 17821) ^ 943095155;
                    i2 = -1706452284;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    C2332.m7079();
                    C2642.m8171();
                    iM45029 = ThreadFactoryC3888.m11306("ۛۧ") ^ i3;
                    i = ((iM45029 ^ i4) * (-31983)) ^ (-1240728288);
                    i2 = -742532399;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0194 A[PHI: r0 r2 r3
      0x0194: PHI (r0v4 int) = (r0v1 int), (r0v6 int) binds: [B:51:0x0192, B:27:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x0194: PHI (r2v4 short) = (r2v3 short), (r2v1 short) binds: [B:51:0x0192, B:27:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x0194: PHI (r3v3 short) = (r3v2 short), (r3v1 short) binds: [B:51:0x0192, B:27:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x01e6 A[PHI: r1
      0x01e6: PHI (r1v4 short[]) = (r1v1 short[]), (r1v3 short[]), (r1v1 short[]) binds: [B:59:0x01e4, B:55:0x01c6, B:14:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x021b A[PHI: r5
      0x021b: PHI (r5v3 short) = (r5v1 short), (r5v2 short), (r5v1 short) binds: [B:63:0x0219, B:43:0x014f, B:11:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0251 A[PHI: r4 r7 r8 r9
      0x0251: PHI (r4v4 int) = (r4v1 int), (r4v3 int), (r4v1 int), (r4v1 int) binds: [B:67:0x024f, B:47:0x0170, B:10:0x0042, B:6:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r7v2 short[]) = (r7v1 short[]), (r7v1 short[]), (r7v1 short[]), (r7v4 short[]) binds: [B:67:0x024f, B:47:0x0170, B:10:0x0042, B:6:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r8v2 int) = (r8v1 int), (r8v1 int), (r8v1 int), (r8v4 int) binds: [B:67:0x024f, B:47:0x0170, B:10:0x0042, B:6:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r9v2 int) = (r9v1 int), (r9v1 int), (r9v1 int), (r9v4 int) binds: [B:67:0x024f, B:47:0x0170, B:10:0x0042, B:6:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        if (l.CallableC1627.m5507() != 0) goto L14;
     */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m52064(l.C17485 r17, l.ViewOnClickListenerC23604 r18, l.C1313 r19) {
        /*
            Method dump skipped, instruction units count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC23604.m52064(l.ܿܿۚ, l.᩻ۡ᩺, l.֨ᩴ᩺):void");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x01a0 A[PHI: r9 r18
      0x01a0: PHI (r9v11 int) = (r9v10 int), (r9v12 int) binds: [B:51:0x019e, B:41:0x0138] A[DONT_GENERATE, DONT_INLINE]
      0x01a0: PHI (r18v9 java.lang.String) = (r18v8 java.lang.String), (r18v10 java.lang.String) binds: [B:51:0x019e, B:41:0x0138] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0280 A[PHI: r9 r13 r18
      0x0280: PHI (r9v14 int) = (r9v6 int), (r9v7 int), (r9v16 int) binds: [B:69:0x027e, B:65:0x025f, B:25:0x00a5] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r13v6 short) = (r13v4 short), (r13v5 short), (r13v4 short) binds: [B:69:0x027e, B:65:0x025f, B:25:0x00a5] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r18v12 java.lang.String) = (r18v3 java.lang.String), (r18v4 java.lang.String), (r18v14 java.lang.String) binds: [B:69:0x027e, B:65:0x025f, B:25:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x02ce A[PHI: r9 r12 r18
      0x02ce: PHI (r9v19 int) = (r9v4 int), (r9v13 int), (r9v20 int) binds: [B:77:0x02cc, B:37:0x0117, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x02ce: PHI (r12v7 java.lang.String) = (r12v5 java.lang.String), (r12v6 java.lang.String), (r12v5 java.lang.String) binds: [B:77:0x02cc, B:37:0x0117, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x02ce: PHI (r18v17 java.lang.String) = (r18v1 java.lang.String), (r18v11 java.lang.String), (r18v18 java.lang.String) binds: [B:77:0x02cc, B:37:0x0117, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x02fd A[PHI: r1 r9 r18
      0x02fd: PHI (r1v8 ??) = (r1v33 ??), (r1v34 ??), (r1v7 ??), (r1v35 ??) binds: [B:81:0x02fb, B:73:0x02af, B:31:0x00d8, B:17:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x02fd: PHI (r9v17 int) = (r9v3 int), (r9v5 int), (r9v15 int), (r9v18 int) binds: [B:81:0x02fb, B:73:0x02af, B:31:0x00d8, B:17:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x02fd: PHI (r18v15 java.lang.String) = (r18v0 java.lang.String), (r18v2 java.lang.String), (r18v13 java.lang.String), (r18v16 java.lang.String) binds: [B:81:0x02fb, B:73:0x02af, B:31:0x00d8, B:17:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004c, code lost:
    
        if (l.C1066.f4915 <= 0) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ۘۡ᩺] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m52043(final com.google.android.material.textfield.TextInputLayout r20, final android.widget.EditText r21, final l.ViewOnClickListenerC23604 r22, final android.view.View r23, final android.widget.EditText r24) {
        /*
            Method dump skipped, instruction units count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC23604.m52043(com.google.android.material.textfield.TextInputLayout, android.widget.EditText, l.᩻ۡ᩺, android.view.View, android.widget.EditText):void");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x030b A[PHI: r8 r9 r29 r33
      0x030b: PHI (r8v3 java.lang.String) = (r8v2 java.lang.String), (r8v1 java.lang.String), (r8v1 java.lang.String), (r8v1 java.lang.String) binds: [B:71:0x0309, B:56:0x0237, B:48:0x01e1, B:27:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      0x030b: PHI (r9v3 java.lang.Object[]) = (r9v2 java.lang.Object[]), (r9v1 java.lang.Object[]), (r9v1 java.lang.Object[]), (r9v1 java.lang.Object[]) binds: [B:71:0x0309, B:56:0x0237, B:48:0x01e1, B:27:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      0x030b: PHI (r29v16 int) = (r29v7 int), (r29v10 int), (r29v11 int), (r29v17 int) binds: [B:71:0x0309, B:56:0x0237, B:48:0x01e1, B:27:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      0x030b: PHI (r33v10 java.lang.Object) = (r33v2 java.lang.Object), (r33v5 java.lang.Object), (r33v6 java.lang.Object), (r33v11 java.lang.Object) binds: [B:71:0x0309, B:56:0x0237, B:48:0x01e1, B:27:0x00f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x034e A[PHI: r6 r7 r13 r15 r17 r29 r33
      0x034e: PHI (r6v3 java.lang.StringBuilder) = (r6v2 java.lang.StringBuilder), (r6v2 java.lang.StringBuilder), (r6v6 java.lang.StringBuilder) binds: [B:24:0x00e7, B:75:0x034c, B:52:0x020d] A[DONT_GENERATE, DONT_INLINE]
      0x034e: PHI (r7v3 java.lang.Integer) = (r7v1 java.lang.Integer), (r7v2 java.lang.Integer), (r7v1 java.lang.Integer) binds: [B:24:0x00e7, B:75:0x034c, B:52:0x020d] A[DONT_GENERATE, DONT_INLINE]
      0x034e: PHI (r13v2 java.lang.String) = (r13v1 java.lang.String), (r13v1 java.lang.String), (r13v5 java.lang.String) binds: [B:24:0x00e7, B:75:0x034c, B:52:0x020d] A[DONT_GENERATE, DONT_INLINE]
      0x034e: PHI (r15v2 java.lang.String) = (r15v1 java.lang.String), (r15v1 java.lang.String), (r15v5 java.lang.String) binds: [B:24:0x00e7, B:75:0x034c, B:52:0x020d] A[DONT_GENERATE, DONT_INLINE]
      0x034e: PHI (r17v3 int) = (r17v1 int), (r17v2 int), (r17v1 int) binds: [B:24:0x00e7, B:75:0x034c, B:52:0x020d] A[DONT_GENERATE, DONT_INLINE]
      0x034e: PHI (r29v18 int) = (r29v5 int), (r29v6 int), (r29v22 int) binds: [B:24:0x00e7, B:75:0x034c, B:52:0x020d] A[DONT_GENERATE, DONT_INLINE]
      0x034e: PHI (r33v13 java.lang.Object) = (r33v0 java.lang.Object), (r33v1 java.lang.Object), (r33v15 java.lang.Object) binds: [B:24:0x00e7, B:75:0x034c, B:52:0x020d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private final void m52054() {
        int iM45029;
        int i;
        int i2;
        int iM11306;
        int i3;
        int i4;
        int i5;
        Object obj;
        Object[] objArr;
        int i6;
        int i7;
        int i8;
        short[] sArr;
        int iM11307;
        int i9;
        int iM450210;
        int i10;
        int i11;
        int i12;
        int iM450211;
        int i13;
        int iM450212;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        short[] sArr2;
        int i19;
        int i20;
        Object[] objArr2;
        int iM11308;
        int i21;
        this = this;
        int i22 = 0;
        int i23 = 0;
        Integer numM8476 = null;
        String strM6690 = null;
        Object[] objArr3 = null;
        final C17485 c17485 = null;
        String strM3021 = null;
        C8067 c8067M3751 = null;
        String strM6691 = null;
        String strM5481 = null;
        int iM450213 = 0;
        String strM11312 = null;
        int i24 = 0;
        int i25 = 0;
        short[] sArr3 = null;
        int i26 = 0;
        int i27 = 0;
        int i28 = 1780884004;
        int i29 = C1668.f6641;
        int i30 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM11309 = ThreadFactoryC3888.m11306("᩺ᩳ") ^ i29;
        int i31 = ((iM11309 ^ i30) * 4543) ^ 472416268;
        int i32 = iM11309 ^ (-1075795689);
        C1003 c1003 = null;
        Object[] objArr4 = null;
        Object obj2 = null;
        int i33 = 0;
        StringBuilder sb = null;
        boolean zM5695 = false;
        int i34 = 0;
        short s = 0;
        while (true) {
            i28 = i32 ^ (i31 & (((i28 ^ i30) * 23955) >> 31));
            switch (i28) {
                case -1935051549:
                case 658206225:
                    i22 = i22;
                    obj2 = obj2;
                    objArr4 = objArr4;
                    i26 = i26;
                    i27 = i27;
                    short[] sArr4 = sArr3;
                    c1003 = c1003;
                    sArr = sArr4;
                    i34 = C18622.f60381;
                    int iM450214 = (C19806.m45029("ۘ᩻") + i30) * 95;
                    i31 = ((iM450214 ^ i29) * 323) ^ (-98029972);
                    i16 = iM450214 ^ (-1176350717);
                    i27 = i27;
                    i26 = i26;
                    i22 = i22;
                    i32 = i16;
                    objArr4 = objArr4;
                    obj2 = obj2;
                    this = this;
                    C1003 c1004 = c1003;
                    sArr3 = sArr;
                    c1003 = c1004;
                    break;
                case -1913893022:
                case -1040731245:
                    if (C1419.f5860 >= 0) {
                        iM11308 = (i29 - ThreadFactoryC3888.m11306("ܳܳ")) * 23;
                        i17 = ((iM11308 ^ i30) * 23763) ^ (-1200630409);
                        i21 = -1942399701;
                    } else {
                        iM11308 = C19806.m45029("֫᩹") ^ i30;
                        i17 = ((iM11308 ^ i29) * 8631) ^ (-622408168);
                        i21 = 1871821161;
                    }
                    i32 = iM11308 ^ i21;
                    i31 = i17;
                    break;
                case -1817013581:
                case -1255981311:
                    i22 = i22;
                    obj2 = obj2;
                    strM6690 = C2124.m6690(this, iM450213 ^ 2123583519);
                    objArr3 = new Object[2];
                    if (C1937.f7317 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖܰ") ^ i30;
                        i = ((iM45029 ^ i29) * (-5261)) ^ 1492744234;
                        i2 = -1846962143;
                    } else {
                        iM45029 = (i30 - ThreadFactoryC3888.m11306("۬ܳ")) * (-95);
                        i = ((iM45029 ^ i29) * 24061) ^ (-343450276);
                        i2 = 212084832;
                    }
                    i4 = iM45029 ^ i2;
                    obj2 = obj2;
                    int i35 = i22;
                    i32 = i4;
                    i31 = i;
                    i22 = i35;
                    break;
                case -1727102370:
                case -1603994392:
                    obj2 = obj2;
                    C1003 c1005 = c1003;
                    objArr4 = objArr4;
                    sArr = sArr3;
                    i26 = i26;
                    i27 = i27;
                    i22 = i22;
                    c1003 = c1005;
                    i34 = 1;
                    int iM450215 = (C19806.m45029("ۘ᩻") + i30) * 95;
                    i31 = ((iM450215 ^ i29) * 323) ^ (-98029972);
                    i16 = iM450215 ^ (-1176350717);
                    i27 = i27;
                    i26 = i26;
                    i22 = i22;
                    i32 = i16;
                    objArr4 = objArr4;
                    obj2 = obj2;
                    this = this;
                    C1003 c1006 = c1003;
                    sArr3 = sArr;
                    c1003 = c1006;
                    break;
                case -1717918461:
                case -367886140:
                    i22 = i22;
                    obj2 = obj2;
                    ViewGroupOnHierarchyChangeListenerC1916.m6243(strM3021);
                    c8067M3751 = C0962.m3751(this);
                    strM11312 = ThreadFactoryC3888.m11312(f76464, 218, 3, i33);
                    if (C3535.m10431() > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤۚ") ^ i30) * 21;
                        i = ((iM45029 ^ i29) * (-10121)) ^ 662238679;
                        i2 = -1649543475;
                        i4 = iM45029 ^ i2;
                        obj2 = obj2;
                        int i36 = i22;
                        i32 = i4;
                        i31 = i;
                        i22 = i36;
                    } else {
                        objArr = objArr4;
                        i6 = i26;
                        i7 = i27;
                        i8 = i34;
                        short[] sArr5 = sArr3;
                        c1003 = c1003;
                        sArr = sArr5;
                        iM11307 = ThreadFactoryC3888.m11306("᩷ۧ") ^ i29;
                        i31 = ((iM11307 ^ i30) * 28949) ^ 748254217;
                        i9 = -843414135;
                        i12 = iM11307 ^ i9;
                        i27 = i7;
                        i34 = i8;
                        i22 = i22;
                        i32 = i12;
                        i26 = i6;
                        objArr4 = objArr;
                        obj2 = obj2;
                        C1003 c1007 = c1003;
                        sArr3 = sArr;
                        c1003 = c1007;
                    }
                    break;
                case -1699710952:
                case -1335273128:
                    i18 = i22;
                    sArr2 = sArr3;
                    i19 = i26;
                    i20 = i27;
                    objArr2 = objArr4;
                    strM3021 = C0671.m3021(this, ThreadFactoryC3888.m11306(C7105.m18989(sArr2, i19, i20, i33)) ^ 2116929526, objArr2);
                    int iM450216 = (C19806.m45029("۫ۗ") ^ i29) * (-33);
                    sArr3 = sArr2;
                    i26 = i19;
                    i27 = i20;
                    i22 = i18;
                    i31 = ((iM450216 ^ i30) * (-6821)) ^ 321374873;
                    i32 = iM450216 ^ (-526043442);
                    this = this;
                    objArr4 = objArr2;
                    obj2 = obj2;
                    break;
                case -1466467816:
                case -754008663:
                    i22 = i22;
                    obj2 = obj2;
                    C0050.m933(c8067M3751, ThreadFactoryC3888.m11306(strM11312) ^ 2116904971);
                    if (C3660.f13403 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖܰ") ^ i30;
                        i = ((iM45029 ^ i29) * (-5261)) ^ 1492744234;
                        i2 = -1846962143;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ᩻") ^ i29;
                        i = ((iM45029 ^ i30) * (-3331)) ^ 156257629;
                        i2 = -588000719;
                    }
                    i4 = iM45029 ^ i2;
                    obj2 = obj2;
                    int i37 = i22;
                    i32 = i4;
                    i31 = i;
                    i22 = i37;
                    break;
                case -1415385441:
                case 2000091711:
                    int i38 = i22;
                    Object obj3 = obj2;
                    C1003 c1008 = c1003;
                    Object[] objArr5 = objArr4;
                    short[] sArr6 = sArr3;
                    int i39 = i26;
                    int i40 = i27;
                    int i41 = i34;
                    if (zM5695) {
                        iM450212 = C19806.m45029("ۙۤ") ^ i29;
                        i14 = ((iM450212 ^ i30) * (-593)) ^ (-1888112936);
                        i15 = -1719747553;
                    } else {
                        iM450212 = (C19806.m45029("ᩴۙ") + i29) * 25;
                        i14 = ((iM450212 ^ i30) * (-6173)) ^ (-701856699);
                        i15 = -1461228810;
                    }
                    int i42 = iM450212 ^ i15;
                    i34 = i41;
                    i27 = i40;
                    sArr3 = sArr6;
                    i26 = i39;
                    i22 = i38;
                    i32 = i42;
                    c1003 = c1008;
                    i31 = i14;
                    objArr4 = objArr5;
                    obj2 = obj3;
                    i23 = 0;
                    this = this;
                    break;
                case -1397363250:
                case 1672917266:
                    obj = obj2;
                    i5 = i22;
                    Object[] objArr6 = new Object[i5];
                    objArr6[i23] = C1148.m4234(i34);
                    sArr3 = f76464;
                    i26 = 206;
                    i27 = 3;
                    if (!C1377.f5749) {
                        objArr4 = objArr6;
                        int iM450217 = C19806.m45029("ۘܶ") ^ i29;
                        int i43 = ((iM450217 ^ i30) * 4041) ^ 1595060924;
                        i32 = iM450217 ^ 958659366;
                        this = this;
                        obj2 = obj;
                        i22 = i5;
                        i31 = i43;
                    } else {
                        int iM450218 = (C19806.m45029("ᩳ᩺") ^ i30) * (-97);
                        i17 = ((iM450218 ^ i29) * 11425) ^ 272416079;
                        i32 = iM450218 ^ 1310027624;
                        this = this;
                        objArr4 = objArr6;
                        obj2 = obj;
                        i22 = i5;
                        i31 = i17;
                    }
                    break;
                case -1369846553:
                case 1058834173:
                    RunnableC3388.m10064();
                    i22 = i22;
                    obj2 = obj2;
                    iM45029 = ThreadFactoryC3888.m11306("ۖܰ") ^ i30;
                    i = ((iM45029 ^ i29) * (-5261)) ^ 1492744234;
                    i2 = -1846962143;
                    i4 = iM45029 ^ i2;
                    obj2 = obj2;
                    int i310 = i22;
                    i32 = i4;
                    i31 = i;
                    i22 = i310;
                    break;
                case -1326141512:
                case 1495117396:
                    sArr = sArr3;
                    i33 = 42851;
                    iM450211 = (i30 - C19806.m45029("ۛܿ")) * 85;
                    i31 = ((iM450211 ^ i29) * (-26313)) ^ (-1578206260);
                    i13 = -1754087524;
                    i16 = iM450211 ^ i13;
                    i34 = i34;
                    i27 = i27;
                    i26 = i26;
                    i22 = i22;
                    i32 = i16;
                    objArr4 = objArr4;
                    obj2 = obj2;
                    this = this;
                    C1003 c1009 = c1003;
                    sArr3 = sArr;
                    c1003 = c1009;
                    break;
                case -1197273321:
                case -78260171:
                    C0797.m3354(c17485);
                    C3743.m10965(new Thread(new RunnableC17294(this, new InterfaceC6627() { // from class: l.᩵ۡ᩺
                        {
                            int i44 = 1640999391;
                            int i45 = C3535.f13026;
                            int i46 = C1398.f5802;
                            int iM113010 = (i46 - ThreadFactoryC3888.m11306("ۚᩴ")) * (-73);
                            int i47 = ((iM113010 ^ i45) * (-23273)) ^ 1062442142;
                            int i48 = -890551097;
                            while (true) {
                                i44 = ((((i44 ^ i45) * 18213) >> 31) & i47) ^ (iM113010 ^ i48);
                                switch (i44) {
                                    case -2137826070:
                                    case 1829223976:
                                        if (C1668.f6641 >= 0) {
                                            iM113010 = ThreadFactoryC3888.m11306("ܿۡ") ^ i45;
                                            i47 = ((iM113010 ^ i46) * 10259) ^ (-168077231);
                                            i48 = 1443145353;
                                        } else {
                                            iM113010 = ThreadFactoryC3888.m11306("ܳܶ") ^ i45;
                                            i47 = ((iM113010 ^ i46) * (-22735)) ^ (-332704321);
                                            i48 = -2044472279;
                                        }
                                        break;
                                    case -2001201767:
                                    case -870163608:
                                        if (RunnableC0195.f1321 >= 0) {
                                            iM113010 = (C19806.m45029("֫ܳ") ^ i46) * (-123);
                                            i47 = ((iM113010 ^ i45) * 8285) ^ 1497003283;
                                            i48 = 2018168157;
                                        } else {
                                            iM113010 = (C19806.m45029("֫ۛ") ^ i45) * 5;
                                            i47 = ((iM113010 ^ i46) * (-10339)) ^ 649523775;
                                            i48 = 748030014;
                                        }
                                        break;
                                    case -1925951578:
                                    case -875123898:
                                        if (C0962.f3784) {
                                            iM113010 = ThreadFactoryC3888.m11306("ܿۡ") ^ i45;
                                            i47 = ((iM113010 ^ i46) * 10259) ^ (-168077231);
                                            i48 = 1443145353;
                                        } else {
                                            iM113010 = C19806.m45029("ۛᩳ") ^ i45;
                                            i47 = ((iM113010 ^ i46) * (-11455)) ^ 2133200519;
                                            i48 = -290032190;
                                        }
                                        break;
                                    case -1805228796:
                                    case -1021922127:
                                        if (ThreadFactoryC3888.f14547 <= 0) {
                                            iM113010 = (C19806.m45029("֫ܳ") ^ i46) * (-123);
                                            i47 = ((iM113010 ^ i45) * 8285) ^ 1497003283;
                                            i48 = 2018168157;
                                        } else {
                                            iM113010 = (i46 - ThreadFactoryC3888.m11306("ۖܶ")) * (-93);
                                            i47 = ((iM113010 ^ i45) * (-4239)) ^ 1973060555;
                                            i48 = 1140446169;
                                        }
                                        break;
                                    case -1698373563:
                                    case -307409062:
                                        if (C3660.f13403 >= 0) {
                                            iM113010 = ThreadFactoryC3888.m11306("ۛ֨") ^ i45;
                                            i47 = ((iM113010 ^ i46) * (-24501)) ^ (-2080444851);
                                            i48 = -1333062861;
                                        } else {
                                            iM113010 = C19806.m45029("ۖ֨") ^ i46;
                                            i47 = ((iM113010 ^ i45) * (-24427)) ^ 159167474;
                                            i48 = -1417236347;
                                        }
                                        break;
                                    case -1478394051:
                                    case -1152663939:
                                        RunnableC1564.m5345();
                                        C0050.m946();
                                        iM113010 = (C19806.m45029("֫ܳ") ^ i46) * (-123);
                                        i47 = ((iM113010 ^ i45) * 8285) ^ 1497003283;
                                        i48 = 2018168157;
                                        break;
                                    case -1368081692:
                                    case -1038344751:
                                        if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                                            iM113010 = C19806.m45029("֡ۛ") ^ i45;
                                            i47 = ((iM113010 ^ i46) * (-10385)) ^ 1207540360;
                                            i48 = -134089096;
                                        } else {
                                            iM113010 = (ThreadFactoryC3888.m11306("ܶۢ") ^ i46) * (-103);
                                            i47 = ((iM113010 ^ i45) * 10271) ^ 993682683;
                                            i48 = 1712700353;
                                        }
                                        break;
                                    case -1319721179:
                                    case -1230982600:
                                        return;
                                    case -685333157:
                                    case -641528235:
                                        if (C0671.f2816 != 0) {
                                            iM113010 = (C19806.m45029("֫ܳ") ^ i46) * (-123);
                                            i47 = ((iM113010 ^ i45) * 8285) ^ 1497003283;
                                            i48 = 2018168157;
                                        } else {
                                            iM113010 = (C19806.m45029("ۘ᩶") ^ i46) * 109;
                                            i47 = ((iM113010 ^ i45) * (-13897)) ^ 1697072189;
                                            i48 = -163916861;
                                        }
                                        break;
                                    case -626327923:
                                    case 442707566:
                                        if (C1461.f5957 <= 0) {
                                            iM113010 = C19806.m45029("᩷ۙ") ^ i46;
                                            i47 = ((iM113010 ^ i45) * 30399) ^ (-148848648);
                                            i48 = -1846314673;
                                        } else {
                                            iM113010 = (C19806.m45029("ۘ᩵") ^ i45) * (-79);
                                            i47 = ((iM113010 ^ i46) * (-10465)) ^ (-1669988386);
                                            i48 = -212080217;
                                        }
                                        break;
                                    case -413100955:
                                    case 165969172:
                                        C2124.m6673();
                                        if (!CallableC1627.f6528) {
                                            iM113010 = C19806.m45029("᩷ۙ") ^ i46;
                                            i47 = ((iM113010 ^ i45) * 30399) ^ (-148848648);
                                            i48 = -1846314673;
                                        } else {
                                            iM113010 = C19806.m45029("֡ۛ") ^ i45;
                                            i47 = ((iM113010 ^ i46) * (-10385)) ^ 1207540360;
                                            i48 = -134089096;
                                        }
                                        break;
                                    case -278137599:
                                    case 2013427433:
                                        if (C2642.f10294 <= 0) {
                                            iM113010 = C19806.m45029("֡ۛ") ^ i45;
                                            i47 = ((iM113010 ^ i46) * (-10385)) ^ 1207540360;
                                            i48 = -134089096;
                                        } else {
                                            iM113010 = (C19806.m45029("֫ܳ") ^ i46) * (-123);
                                            i47 = ((iM113010 ^ i45) * 8285) ^ 1497003283;
                                            i48 = 2018168157;
                                        }
                                        break;
                                    case -202064651:
                                    case 484103892:
                                        if (C3577.f13150 >= 0) {
                                            iM113010 = C19806.m45029("᩷ۙ") ^ i46;
                                            i47 = ((iM113010 ^ i45) * 30399) ^ (-148848648);
                                            i48 = -1846314673;
                                        } else {
                                            iM113010 = ThreadFactoryC3888.m11306("֡ۘ") ^ i46;
                                            i47 = ((iM113010 ^ i45) * (-27573)) ^ (-561837593);
                                            i48 = -1507733748;
                                        }
                                        break;
                                    case 241444362:
                                    case 2111632322:
                                        if (C19806.f63586) {
                                            iM113010 = ThreadFactoryC3888.m11306("ܿۡ") ^ i45;
                                            i47 = ((iM113010 ^ i46) * 10259) ^ (-168077231);
                                            i48 = 1443145353;
                                        } else {
                                            iM113010 = ThreadFactoryC3888.m11306("ۖۘ") ^ i45;
                                            i47 = ((iM113010 ^ i46) * (-32727)) ^ (-2034368107);
                                            i48 = -880376871;
                                        }
                                        break;
                                    case 617598457:
                                    case 887146932:
                                        C1875.m6086();
                                        throw new RuntimeException();
                                    default:
                                        if (C1148.m4232() > 0) {
                                            iM113010 = ThreadFactoryC3888.m11306("ۛ֨") ^ i45;
                                            i47 = ((iM113010 ^ i46) * (-24501)) ^ (-2080444851);
                                            i48 = -1333062861;
                                        } else {
                                            iM113010 = (C19806.m45029("֫ܳ") ^ i46) * (-123);
                                            i47 = ((iM113010 ^ i45) * 8285) ^ 1497003283;
                                            i48 = 2018168157;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // l.InterfaceC6627
                        /* JADX INFO: renamed from: ۙ */
                        public final void mo3852(C1313 c1313) {
                            C17485 c17486 = null;
                            int i44 = 1394590611;
                            int i45 = C1460.f5948;
                            int i46 = C2249.f8050;
                            int iM113010 = ThreadFactoryC3888.m11306("ۙ᩹") ^ i46;
                            int i47 = ((iM113010 ^ i45) * (-20299)) ^ (-1632675210);
                            int i48 = -2080963119;
                            while (true) {
                                i44 = ((((i44 ^ i45) * (-14507)) >> 31) & i47) ^ (iM113010 ^ i48);
                                switch (i44) {
                                    case -2032706830:
                                    case -1376161932:
                                        if (RunnableC3388.f12514 < 0) {
                                            iM113010 = ThreadFactoryC3888.m11306("۠ܺ") ^ i46;
                                            i47 = ((iM113010 ^ i45) * 22929) ^ (-1068897147);
                                            i48 = -2072560968;
                                        } else {
                                            iM113010 = C19806.m45029("ۨᩴ") ^ i45;
                                            i47 = ((iM113010 ^ i46) * (-6963)) ^ 1441161821;
                                            i48 = -717882867;
                                        }
                                        break;
                                    case -1922880796:
                                    case 1717422516:
                                        if (C1377.f5749) {
                                            iM113010 = ThreadFactoryC3888.m11306("ܺۢ") ^ i45;
                                            i47 = ((iM113010 ^ i46) * 15489) ^ (-127371558);
                                            i48 = 437048464;
                                        } else {
                                            iM113010 = (ThreadFactoryC3888.m11306("᩻᩹") + i46) * (-3);
                                            i47 = ((iM113010 ^ i45) * (-4685)) ^ 1721949787;
                                            i48 = 322269933;
                                        }
                                        break;
                                    case -1922177399:
                                    case 368251431:
                                        if (C0216.f1393 != 0) {
                                            iM113010 = (ThreadFactoryC3888.m11306("᩻᩹") + i46) * (-3);
                                            i47 = ((iM113010 ^ i45) * (-4685)) ^ 1721949787;
                                            i48 = 322269933;
                                        } else {
                                            iM113010 = (C19806.m45029("᩹ۘ") + i45) * 51;
                                            i47 = ((iM113010 ^ i46) * (-14969)) ^ (-1767954263);
                                            i48 = 474282677;
                                        }
                                        break;
                                    case -1630728243:
                                    case -1074899846:
                                        if (RunnableC1895.f7152) {
                                            iM113010 = (C19806.m45029("ۙ᩷") ^ i45) * (-27);
                                            i47 = ((iM113010 ^ i46) * (-19993)) ^ (-1756730339);
                                            i48 = -1208304205;
                                        } else {
                                            iM113010 = C19806.m45029("ۨᩴ") ^ i45;
                                            i47 = ((iM113010 ^ i46) * (-6963)) ^ 1441161821;
                                            i48 = -717882867;
                                        }
                                        break;
                                    case -1390071011:
                                    case 14667773:
                                        C2249.m6915();
                                        if (C1025.f4800 < 0) {
                                            iM113010 = (ThreadFactoryC3888.m11306("᩻᩹") + i46) * (-3);
                                            i47 = ((iM113010 ^ i45) * (-4685)) ^ 1721949787;
                                            i48 = 322269933;
                                        } else {
                                            iM113010 = ThreadFactoryC3888.m11306("۠ܺ") ^ i46;
                                            i47 = ((iM113010 ^ i45) * 22929) ^ (-1068897147);
                                            i48 = -2072560968;
                                        }
                                        break;
                                    case -1387908193:
                                    case -1146186400:
                                        if (C1461.m5080()) {
                                            iM113010 = C19806.m45029("ܰܳ") ^ i45;
                                            i47 = ((iM113010 ^ i46) * (-1149)) ^ (-268419218);
                                            i48 = -456545208;
                                        } else {
                                            iM113010 = (ThreadFactoryC3888.m11306("᩻᩹") + i46) * (-3);
                                            i47 = ((iM113010 ^ i45) * (-4685)) ^ 1721949787;
                                            i48 = 322269933;
                                        }
                                        break;
                                    case -1359857780:
                                    case -419522815:
                                        if (RunnableC1895.f7152) {
                                            iM113010 = ThreadFactoryC3888.m11306("ۙۡ") ^ i46;
                                            i47 = ((iM113010 ^ i45) * 24101) ^ 1862222541;
                                            i48 = -238384623;
                                        } else {
                                            iM113010 = C19806.m45029("ۨᩴ") ^ i45;
                                            i47 = ((iM113010 ^ i46) * (-6963)) ^ 1441161821;
                                            i48 = -717882867;
                                        }
                                        break;
                                    case -1032542797:
                                    case 1835370298:
                                        if (RunnableC1606.f6488 >= 0) {
                                            iM113010 = C19806.m45029("ۤ᩶") ^ i46;
                                            i47 = ((iM113010 ^ i45) * 32059) ^ (-1893843146);
                                            i48 = 1831178978;
                                        } else {
                                            iM113010 = (i46 - C19806.m45029("ۘܺ")) * 47;
                                            i47 = ((iM113010 ^ i45) * 31379) ^ 299394079;
                                            i48 = -546273657;
                                        }
                                        break;
                                    case -966248645:
                                    case 2086078120:
                                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                                            iM113010 = ThreadFactoryC3888.m11306("۠ܺ") ^ i46;
                                            i47 = ((iM113010 ^ i45) * 22929) ^ (-1068897147);
                                            i48 = -2072560968;
                                        } else {
                                            iM113010 = (C19806.m45029("ۤ᩵") + i46) * (-25);
                                            i47 = ((iM113010 ^ i45) * 2929) ^ (-616108936);
                                            i48 = 600213671;
                                        }
                                        break;
                                    case -794622043:
                                    case -31803442:
                                        if (RunnableC1895.f7152) {
                                            iM113010 = ThreadFactoryC3888.m11306("ᩴ֨") ^ i46;
                                            i47 = ((iM113010 ^ i45) * 29733) ^ 1623790668;
                                            i48 = 1855086423;
                                        } else {
                                            iM113010 = (ThreadFactoryC3888.m11306("᩻᩹") + i46) * (-3);
                                            i47 = ((iM113010 ^ i45) * (-4685)) ^ 1721949787;
                                            i48 = 322269933;
                                        }
                                        break;
                                    case -765327813:
                                    case 1142208397:
                                        C3577.m10565();
                                        iM113010 = C19806.m45029("ۨᩴ") ^ i45;
                                        i47 = ((iM113010 ^ i46) * (-6963)) ^ 1441161821;
                                        i48 = -717882867;
                                        break;
                                    case -108944475:
                                    case 1133820542:
                                        if (ThreadFactoryC3888.f14547 <= 0) {
                                            iM113010 = C19806.m45029("ۨᩴ") ^ i45;
                                            i47 = ((iM113010 ^ i46) * (-6963)) ^ 1441161821;
                                            i48 = -717882867;
                                        } else {
                                            iM113010 = ThreadFactoryC3888.m11306("᩷ܺ") ^ i46;
                                            i47 = ((iM113010 ^ i45) * 29611) ^ (-400121911);
                                            i48 = 2140028598;
                                        }
                                        break;
                                    case 85008763:
                                    case 824414007:
                                        C1189.m4368();
                                        break;
                                    case 352899762:
                                    case 463659763:
                                        ViewOnClickListenerC23604.m52064(c17486, this, c1313);
                                        break;
                                    case 529762638:
                                    case 833159254:
                                        c17486 = c17485;
                                        if (C0797.m3359()) {
                                            iM113010 = (C19806.m45029("ۛ᩶") ^ i45) * 13;
                                            i47 = ((iM113010 ^ i46) * (-16485)) ^ 1517964387;
                                            i48 = -1904111590;
                                        } else {
                                            iM113010 = C19806.m45029("ۤ᩶") ^ i46;
                                            i47 = ((iM113010 ^ i45) * 32059) ^ (-1893843146);
                                            i48 = 1831178978;
                                        }
                                        break;
                                    default:
                                        if (C3660.f13403 >= 0) {
                                            iM113010 = ThreadFactoryC3888.m11306("۠ܺ") ^ i46;
                                            i47 = ((iM113010 ^ i45) * 22929) ^ (-1068897147);
                                            i48 = -2072560968;
                                        } else {
                                            iM113010 = C19806.m45029("᩸֨") ^ i45;
                                            i47 = ((iM113010 ^ i46) * 6985) ^ 1260618466;
                                            i48 = 578652349;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    })));
                    break;
                case -1146657936:
                case 1080197944:
                    i22 = i22;
                    obj2 = obj2;
                    C1003 c10010 = c1003;
                    objArr4 = objArr4;
                    sArr = sArr3;
                    i26 = i26;
                    i27 = i27;
                    i34 = i34;
                    if (c10010 == null) {
                        c1003 = c10010;
                        iM450211 = (ThreadFactoryC3888.m11306("۬ۖ") + i29) * 11;
                        i31 = ((iM450211 ^ i30) * (-30045)) ^ (-589913782);
                        i13 = 573919883;
                    } else {
                        iM450211 = C19806.m45029("ۖ۠") ^ i30;
                        c1003 = c10010;
                        i31 = ((iM450211 ^ i29) * 11857) ^ (-2139073698);
                        i13 = -746767314;
                    }
                    i16 = iM450211 ^ i13;
                    i34 = i34;
                    i27 = i27;
                    i26 = i26;
                    i22 = i22;
                    i32 = i16;
                    objArr4 = objArr4;
                    obj2 = obj2;
                    this = this;
                    C1003 c10011 = c1003;
                    sArr3 = sArr;
                    c1003 = c10011;
                    break;
                case -1139517265:
                case -501579213:
                    obj2 = obj2;
                    objArr = objArr4;
                    int i44 = i26;
                    int i45 = i27;
                    int i46 = i34;
                    short[] sArr7 = sArr3;
                    c1003 = c1003;
                    sArr = sArr7;
                    zM5695 = C1709.m5695();
                    if (zM5695) {
                        int iM113010 = (ThreadFactoryC3888.m11306("ۜ۟") + i30) * 5;
                        i32 = iM113010 ^ 171925868;
                        i31 = ((iM113010 ^ i29) * 10147) ^ (-1704354088);
                        i34 = i46;
                        i27 = i45;
                        i26 = i44;
                        i22 = 1;
                    } else {
                        int iM113011 = (ThreadFactoryC3888.m11306("ۧ᩶") ^ i29) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i31 = ((iM113011 ^ i30) * 30235) ^ (-1417886641);
                        i32 = iM113011 ^ 502552481;
                        i34 = i46;
                        i27 = i45;
                        i26 = i44;
                        i22 = 1;
                    }
                    objArr4 = objArr;
                    obj2 = obj2;
                    C1003 c10012 = c1003;
                    sArr3 = sArr;
                    c1003 = c10012;
                    break;
                case -1095957121:
                case 1277695376:
                    i18 = i22;
                    objArr3[i23] = numM8476;
                    objArr3[i18] = strM6690;
                    strM3021 = C1875.m6104(this, ThreadFactoryC3888.m11306(C1377.m4832(f76464, 212, 3, i33)) ^ 2116591922, objArr3);
                    objArr2 = objArr4;
                    sArr2 = sArr3;
                    i19 = i26;
                    i20 = i27;
                    int iM450219 = (C19806.m45029("۫ۗ") ^ i29) * (-33);
                    sArr3 = sArr2;
                    i26 = i19;
                    i27 = i20;
                    i22 = i18;
                    i31 = ((iM450219 ^ i30) * (-6821)) ^ 321374873;
                    i32 = iM450219 ^ (-526043442);
                    this = this;
                    objArr4 = objArr2;
                    obj2 = obj2;
                    break;
                case -1066455518:
                case 2046610789:
                    i22 = i22;
                    obj2 = obj2;
                    objArr4 = objArr4;
                    i26 = i26;
                    i27 = i27;
                    i34 = i34;
                    short[] sArr8 = sArr3;
                    c1003 = c1003;
                    sArr = sArr8;
                    if (zM5695) {
                        iM450211 = (ThreadFactoryC3888.m11306("᩶ۨ") ^ i29) * (-71);
                        i31 = ((iM450211 ^ i30) * 5561) ^ (-147976190);
                        i13 = -1979460294;
                    } else {
                        iM450211 = (ThreadFactoryC3888.m11306("ᩳ᩻") + i30) * (-121);
                        i31 = ((iM450211 ^ i29) * 24313) ^ (-770144566);
                        i13 = 117301375;
                    }
                    i16 = iM450211 ^ i13;
                    i34 = i34;
                    i27 = i27;
                    i26 = i26;
                    i22 = i22;
                    i32 = i16;
                    objArr4 = objArr4;
                    obj2 = obj2;
                    this = this;
                    C1003 c10013 = c1003;
                    sArr3 = sArr;
                    c1003 = c10013;
                    break;
                case -1054273946:
                case 1864135228:
                    C1937.m6291(C1460.m5052(C2704.m8239(c8067M3751)), new ViewOnClickListenerC10198(i23, this));
                    break;
                case -829200656:
                case 2062915490:
                    if (!C19806.f63586) {
                        i22 = i22;
                        obj2 = obj2;
                        objArr = objArr4;
                        i6 = i26;
                        i7 = i27;
                        i8 = i34;
                        short[] sArr9 = sArr3;
                        c1003 = c1003;
                        sArr = sArr9;
                        iM11307 = ThreadFactoryC3888.m11306("᩷ۧ") ^ i29;
                        i31 = ((iM11307 ^ i30) * 28949) ^ 748254217;
                        i9 = -843414135;
                        i12 = iM11307 ^ i9;
                        i27 = i7;
                        i34 = i8;
                        i22 = i22;
                        i32 = i12;
                        i26 = i6;
                        objArr4 = objArr;
                        obj2 = obj2;
                        C1003 c10014 = c1003;
                        sArr3 = sArr;
                        c1003 = c10014;
                    } else {
                        iM11308 = (ThreadFactoryC3888.m11306("ܺ۠") + i30) * 67;
                        i17 = ((iM11308 ^ i29) * (-32485)) ^ (-975066656);
                        i21 = 2025155281;
                        i32 = iM11308 ^ i21;
                        i31 = i17;
                    }
                    break;
                case -782384817:
                case 399497858:
                    if (C1066.f4915 <= 0) {
                        i22 = i22;
                        obj2 = obj2;
                        iM45029 = (i30 - C19806.m45029("᩵ۗ")) * (-69);
                        i = ((iM45029 ^ i29) * 14979) ^ (-1665316486);
                        i2 = 1925732394;
                        i4 = iM45029 ^ i2;
                        obj2 = obj2;
                        int i311 = i22;
                        i32 = i4;
                        i31 = i;
                        i22 = i311;
                    } else {
                        iM11308 = (ThreadFactoryC3888.m11306("ܺ۠") + i30) * 67;
                        i17 = ((iM11308 ^ i29) * (-32485)) ^ (-975066656);
                        i21 = 2025155281;
                        i32 = iM11308 ^ i21;
                        i31 = i17;
                    }
                    break;
                case -741132068:
                case 1935352051:
                    i22 = i22;
                    obj2 = null;
                    C10634.m26823(c8067M3751, C19806.m45029(C3535.m10423(f76464, 226, 3, i33)) ^ 2125259465, null);
                    if (zM5695) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢ֫") + i30) * 95;
                        i = ((iM11306 ^ i29) * 7153) ^ (-2141328178);
                        i3 = -739132238;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۠ۚ") ^ i29;
                        i = ((iM11306 ^ i30) * 28351) ^ 788814150;
                        i3 = -259745525;
                    }
                    i4 = iM11306 ^ i3;
                    int i312 = i22;
                    i32 = i4;
                    i31 = i;
                    i22 = i312;
                    break;
                case -678305922:
                case 1534949318:
                    if (C0216.f1393 != 0) {
                        i5 = i22;
                        obj = obj2;
                        int iM4502110 = C19806.m45029("ۘܶ") ^ i29;
                        int i47 = ((iM4502110 ^ i30) * 4041) ^ 1595060924;
                        i32 = iM4502110 ^ 958659366;
                        this = this;
                        obj2 = obj;
                        i22 = i5;
                        i31 = i47;
                    } else {
                        i22 = i22;
                        obj2 = obj2;
                        iM45029 = ThreadFactoryC3888.m11306("ۖܰ") ^ i30;
                        i = ((iM45029 ^ i29) * (-5261)) ^ 1492744234;
                        i2 = -1846962143;
                        i4 = iM45029 ^ i2;
                        obj2 = obj2;
                        int i313 = i22;
                        i32 = i4;
                        i31 = i;
                        i22 = i313;
                    }
                    break;
                case -628851718:
                case -519741928:
                    i22 = i22;
                    obj2 = obj2;
                    C2788.m8480(sb, strM5481);
                    C1148.m4223(sb, strM6691);
                    C0671.m3015(c8067M3751, C0817.m3407(sb));
                    if (C1937.f7317 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖܰ") ^ i30;
                        i = ((iM45029 ^ i29) * (-5261)) ^ 1492744234;
                        i2 = -1846962143;
                    } else {
                        iM45029 = (i30 - ThreadFactoryC3888.m11306("᩻ۚ")) * 17;
                        i = ((iM45029 ^ i29) * (-471)) ^ (-1988482096);
                        i2 = -1011394165;
                    }
                    i4 = iM45029 ^ i2;
                    obj2 = obj2;
                    int i314 = i22;
                    i32 = i4;
                    i31 = i;
                    i22 = i314;
                    break;
                case -493990618:
                case 2058446458:
                    int i48 = i22;
                    obj2 = obj2;
                    C1003 c10015 = c1003;
                    objArr4 = objArr4;
                    sArr = sArr3;
                    i26 = i26;
                    i27 = i27;
                    i34 = i34;
                    if (i34 > i48) {
                        i22 = i48;
                        c1003 = c10015;
                        iM450211 = (ThreadFactoryC3888.m11306("᩶ۨ") ^ i29) * (-71);
                        i31 = ((iM450211 ^ i30) * 5561) ^ (-147976190);
                        i13 = -1979460294;
                        i16 = iM450211 ^ i13;
                        i34 = i34;
                        i27 = i27;
                        i26 = i26;
                        i22 = i22;
                        i32 = i16;
                        objArr4 = objArr4;
                        obj2 = obj2;
                        this = this;
                        C1003 c10016 = c1003;
                        sArr3 = sArr;
                        c1003 = c10016;
                    } else {
                        int iM113012 = (ThreadFactoryC3888.m11306("۬ۨ") ^ i29) * 115;
                        int i49 = ((iM113012 ^ i30) * 4943) ^ (-878417178);
                        i34 = i34;
                        i27 = i27;
                        i26 = i26;
                        i22 = i48;
                        objArr4 = objArr4;
                        i32 = iM113012 ^ 1330514647;
                        obj2 = obj2;
                        sArr3 = sArr;
                        c1003 = c10015;
                        i31 = i49;
                        this = this;
                    }
                    break;
                case -377006819:
                case 25728159:
                    C19806.m45024();
                    if (!C0797.m3359()) {
                        i22 = i22;
                        obj2 = obj2;
                        iM45029 = ThreadFactoryC3888.m11306("ۖܰ") ^ i30;
                        i = ((iM45029 ^ i29) * (-5261)) ^ 1492744234;
                        i2 = -1846962143;
                        i4 = iM45029 ^ i2;
                        obj2 = obj2;
                        int i315 = i22;
                        i32 = i4;
                        i31 = i;
                        i22 = i315;
                    } else {
                        iM11308 = (ThreadFactoryC3888.m11306("ܺ۠") + i30) * 67;
                        i17 = ((iM11308 ^ i29) * (-32485)) ^ (-975066656);
                        i21 = 2025155281;
                        i32 = iM11308 ^ i21;
                        i31 = i17;
                    }
                    break;
                case -372081390:
                case 681118385:
                    i22 = i22;
                    obj2 = obj2;
                    objArr = objArr4;
                    i6 = i26;
                    i7 = i27;
                    i8 = i34;
                    short[] sArr10 = sArr3;
                    c1003 = c1003;
                    sArr = sArr10;
                    s = f76464[205];
                    i24 = s * s;
                    i25 = 16589329;
                    if (AbstractC0464.f2088 <= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("᩷ۧ") ^ i29;
                        i31 = ((iM11307 ^ i30) * 28949) ^ 748254217;
                        i9 = -843414135;
                    } else {
                        iM11307 = (i29 - ThreadFactoryC3888.m11306("ܳ᩵")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i31 = ((iM11307 ^ i30) * 11233) ^ (-1811208420);
                        i9 = 1369963263;
                    }
                    i12 = iM11307 ^ i9;
                    i27 = i7;
                    i34 = i8;
                    i22 = i22;
                    i32 = i12;
                    i26 = i6;
                    objArr4 = objArr;
                    obj2 = obj2;
                    C1003 c10017 = c1003;
                    sArr3 = sArr;
                    c1003 = c10017;
                    break;
                case -323954495:
                case 791795534:
                    i22 = i22;
                    obj2 = obj2;
                    objArr4 = objArr4;
                    i26 = i26;
                    i27 = i27;
                    i34 = i34;
                    short[] sArr11 = sArr3;
                    c1003 = c1003;
                    sArr = sArr11;
                    try {
                        C1003 c1003M5060 = C1460.m5060();
                        int iM450220 = (i29 - C19806.m45029("ۚܽ")) * 45;
                        c1003 = c1003M5060;
                        i34 = i34;
                        i27 = i27;
                        i26 = i26;
                        i22 = i22;
                        i32 = iM450220 ^ (-535396492);
                        objArr4 = objArr4;
                        obj2 = obj2;
                        i31 = ((iM450220 ^ i30) * 28463) ^ 797780573;
                    } catch (IOException unused) {
                        iM450211 = (ThreadFactoryC3888.m11306("۬ۖ") + i29) * 11;
                        i31 = ((iM450211 ^ i30) * (-30045)) ^ (-589913782);
                        i13 = 573919883;
                        i16 = iM450211 ^ i13;
                        i34 = i34;
                        i27 = i27;
                        i26 = i26;
                        i22 = i22;
                        i32 = i16;
                        objArr4 = objArr4;
                        obj2 = obj2;
                    }
                    this = this;
                    C1003 c10018 = c1003;
                    sArr3 = sArr;
                    c1003 = c10018;
                    break;
                case -196307948:
                case 2124443319:
                    sArr = sArr3;
                    i33 = 9605;
                    iM450211 = (i30 - C19806.m45029("ۛܿ")) * 85;
                    i31 = ((iM450211 ^ i29) * (-26313)) ^ (-1578206260);
                    i13 = -1754087524;
                    i16 = iM450211 ^ i13;
                    i34 = i34;
                    i27 = i27;
                    i26 = i26;
                    i22 = i22;
                    i32 = i16;
                    objArr4 = objArr4;
                    obj2 = obj2;
                    this = this;
                    C1003 c10019 = c1003;
                    sArr3 = sArr;
                    c1003 = c10019;
                    break;
                case -180654896:
                case 820729484:
                    C3743.m10966();
                    C1148.m4232();
                    break;
                case 174244230:
                case 1744744046:
                    C1460.m5055(c8067M3751, ThreadFactoryC3888.m11306(C1875.m6105(f76464, 229, 3, i33)) ^ 2103300106, new DialogInterface.OnClickListener() { // from class: l.ۡۡ᩺
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i50) {
                            int i51 = -211029560;
                            int i52 = C2871.f10837;
                            int i53 = C0278.f1572;
                            int iM450221 = (C19806.m45029("ܿܽ") + i53) * (-55);
                            int i54 = ((iM450221 ^ i52) * 9627) ^ (-1379232218);
                            int i55 = 177964001;
                            while (true) {
                                i51 = ((((i51 ^ i52) * 8363) >> 31) & i54) ^ (iM450221 ^ i55);
                                switch (i51) {
                                    case -1891628333:
                                    case -664494548:
                                        C0526.m2437();
                                        ThreadFactoryC3888.m11300();
                                        break;
                                    case -1813804582:
                                    case -727135483:
                                        if (ViewGroupOnHierarchyChangeListenerC1916.m6233() == 0) {
                                            iM450221 = (ThreadFactoryC3888.m11306("ۘᩳ") ^ i53) * 39;
                                            i54 = ((iM450221 ^ i52) * (-19383)) ^ 1820276606;
                                            i55 = 1953955461;
                                        } else {
                                            iM450221 = C19806.m45029("᩶᩻") ^ i52;
                                            i54 = ((iM450221 ^ i53) * (-2713)) ^ (-1190148739);
                                            i55 = 1788330597;
                                        }
                                        break;
                                    case -1582827572:
                                    case 637143441:
                                        if (RunnableC0195.f1321 >= 0) {
                                            iM450221 = (C19806.m45029("۬᩻") + i52) * (-45);
                                            i54 = ((iM450221 ^ i53) * 29347) ^ 1229614445;
                                            i55 = 406967323;
                                        } else {
                                            iM450221 = ThreadFactoryC3888.m11306("ۧۤ") ^ i53;
                                            i54 = ((iM450221 ^ i52) * 22683) ^ 1055479890;
                                            i55 = -841356870;
                                        }
                                        break;
                                    case -1563951548:
                                    case 202760946:
                                        if (C3722.f13525 <= 0) {
                                            iM450221 = (ThreadFactoryC3888.m11306("ۘᩳ") ^ i53) * 39;
                                            i54 = ((iM450221 ^ i52) * (-19383)) ^ 1820276606;
                                            i55 = 1953955461;
                                        } else {
                                            iM450221 = C19806.m45029("ᩳ۠") ^ i53;
                                            i54 = ((iM450221 ^ i52) * (-2787)) ^ 529244512;
                                            i55 = 518167691;
                                        }
                                        break;
                                    case -1437091668:
                                    case 38690931:
                                        if (C0050.f912 <= 0) {
                                            iM450221 = C19806.m45029("᩶᩻") ^ i52;
                                            i54 = ((iM450221 ^ i53) * (-2713)) ^ (-1190148739);
                                            i55 = 1788330597;
                                        } else {
                                            iM450221 = C19806.m45029("ܿܺ") ^ i52;
                                            i54 = ((iM450221 ^ i53) * 26573) ^ 753118728;
                                            i55 = 409953258;
                                        }
                                        break;
                                    case -1432381763:
                                    case -980333371:
                                        if (RunnableC3388.f12514 >= 0) {
                                            iM450221 = C19806.m45029("᩶᩻") ^ i52;
                                            i54 = ((iM450221 ^ i53) * (-2713)) ^ (-1190148739);
                                            i55 = 1788330597;
                                        } else {
                                            iM450221 = (C19806.m45029("ۖܳ") ^ i53) * (-93);
                                            i54 = ((iM450221 ^ i52) * (-5235)) ^ 1442050405;
                                            i55 = 954099766;
                                        }
                                        break;
                                    case -889943640:
                                    case 1307636289:
                                        if (C0962.f3784) {
                                            iM450221 = C19806.m45029("ۘᩴ") ^ i52;
                                            i54 = ((iM450221 ^ i53) * (-27955)) ^ (-235618318);
                                            i55 = 1396035220;
                                        } else {
                                            iM450221 = (i53 - C19806.m45029("ܰۙ")) * 73;
                                            i54 = ((iM450221 ^ i52) * (-28499)) ^ 516860938;
                                            i55 = 174708750;
                                        }
                                        break;
                                    case -793889280:
                                    case 461677024:
                                        if (RunnableC1564.m5345()) {
                                            iM450221 = C19806.m45029("᩶᩻") ^ i52;
                                            i54 = ((iM450221 ^ i53) * (-2713)) ^ (-1190148739);
                                            i55 = 1788330597;
                                        } else {
                                            iM450221 = (i52 - C19806.m45029("ۛۚ")) * 67;
                                            i54 = ((iM450221 ^ i53) * (-12321)) ^ 1876118940;
                                            i55 = -928587758;
                                        }
                                        break;
                                    case -784743127:
                                    case 473796821:
                                        if (C1066.f4915 <= 0) {
                                            iM450221 = C19806.m45029("ۘᩴ") ^ i52;
                                            i54 = ((iM450221 ^ i53) * (-27955)) ^ (-235618318);
                                            i55 = 1396035220;
                                        } else {
                                            iM450221 = C19806.m45029("֨ۨ") ^ i52;
                                            i54 = ((iM450221 ^ i53) * (-30365)) ^ 1434526152;
                                            i55 = 2013539684;
                                        }
                                        break;
                                    case -507170172:
                                    case 806616381:
                                        if (C0629.f2722 <= 0) {
                                            iM450221 = (C19806.m45029("۬᩻") + i52) * (-45);
                                            i54 = ((iM450221 ^ i53) * 29347) ^ 1229614445;
                                            i55 = 406967323;
                                        } else {
                                            iM450221 = (ThreadFactoryC3888.m11306("ۘᩳ") ^ i53) * 39;
                                            i54 = ((iM450221 ^ i52) * (-19383)) ^ 1820276606;
                                            i55 = 1953955461;
                                        }
                                        break;
                                    case -125208822:
                                    case 177712479:
                                        C3286.m9798();
                                        C19806.m45024();
                                        iM450221 = C19806.m45029("᩶᩻") ^ i52;
                                        i54 = ((iM450221 ^ i53) * (-2713)) ^ (-1190148739);
                                        i55 = 1788330597;
                                        break;
                                    case 8422839:
                                    case 154386401:
                                        if (C19806.m45024()) {
                                            iM450221 = C19806.m45029("᩶᩻") ^ i52;
                                            i54 = ((iM450221 ^ i53) * (-2713)) ^ (-1190148739);
                                            i55 = 1788330597;
                                        } else {
                                            iM450221 = C19806.m45029("ܿ᩶") ^ i53;
                                            i54 = ((iM450221 ^ i52) * (-31339)) ^ 774531833;
                                            i55 = -436301958;
                                        }
                                        break;
                                    case 1201638736:
                                    case 1825022752:
                                        if (C2477.f9839 <= 0) {
                                            iM450221 = (C19806.m45029("۬᩻") + i52) * (-45);
                                            i54 = ((iM450221 ^ i53) * 29347) ^ 1229614445;
                                            i55 = 406967323;
                                        } else {
                                            iM450221 = C19806.m45029("ۚۧ") ^ i52;
                                            i54 = ((iM450221 ^ i53) * 11951) ^ (-890288180);
                                            i55 = -1092277453;
                                        }
                                        break;
                                    case 1286455111:
                                    case 1940403096:
                                        int i56 = ViewOnClickListenerC23604.f76463;
                                        if (RunnableC1564.f6300) {
                                            iM450221 = C19806.m45029("ۘᩴ") ^ i52;
                                            i54 = ((iM450221 ^ i53) * (-27955)) ^ (-235618318);
                                            i55 = 1396035220;
                                        } else {
                                            iM450221 = (i52 - ThreadFactoryC3888.m11306("֫۫")) * (-93);
                                            i54 = ((iM450221 ^ i53) * 32249) ^ 515087980;
                                            i55 = -1729622645;
                                        }
                                        break;
                                    case 1479088552:
                                    case 1742968527:
                                        C2332.m7081(new C17253(this.f30209));
                                        break;
                                    default:
                                        if (CallableC1627.f6528) {
                                            iM450221 = ThreadFactoryC3888.m11306("ۡ᩶") ^ i53;
                                            i54 = ((iM450221 ^ i52) * (-28275)) ^ 512069401;
                                            i55 = -1222617986;
                                        } else {
                                            iM450221 = (C19806.m45029("۬᩻") + i52) * (-45);
                                            i54 = ((iM450221 ^ i53) * 29347) ^ 1229614445;
                                            i55 = 406967323;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    iM45029 = (i29 - ThreadFactoryC3888.m11306("᩸ᩳ")) * 41;
                    i = ((iM45029 ^ i30) * 7571) ^ (-1776202541);
                    i2 = -2097073886;
                    i4 = iM45029 ^ i2;
                    obj2 = obj2;
                    int i316 = i22;
                    i32 = i4;
                    i31 = i;
                    i22 = i316;
                    break;
                case 235178923:
                case 1388843646:
                    i22 = i22;
                    obj2 = obj2;
                    numM8476 = C2788.m8476(i34);
                    iM450213 = C19806.m45029(ViewGroupOnHierarchyChangeListenerC1916.m6241(f76464, 209, 3, i33));
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = (i30 - C19806.m45029("᩵ۗ")) * (-69);
                        i = ((iM45029 ^ i29) * 14979) ^ (-1665316486);
                        i2 = 1925732394;
                    } else {
                        iM45029 = C19806.m45029("۟᩺") ^ i30;
                        i = ((iM45029 ^ i29) * 541) ^ 1029079253;
                        i2 = 337757645;
                    }
                    i4 = iM45029 ^ i2;
                    obj2 = obj2;
                    int i317 = i22;
                    i32 = i4;
                    i31 = i;
                    i22 = i317;
                    break;
                case 333900786:
                case 1923442387:
                    C1460.m5055(c8067M3751, C19806.m45029(C2642.m8172(f76464, 232, 3, i33)) ^ 2120961738, obj2);
                    iM45029 = (i29 - ThreadFactoryC3888.m11306("᩸ᩳ")) * 41;
                    i = ((iM45029 ^ i30) * 7571) ^ (-1776202541);
                    i2 = -2097073886;
                    i4 = iM45029 ^ i2;
                    obj2 = obj2;
                    int i318 = i22;
                    i32 = i4;
                    i31 = i;
                    i22 = i318;
                    break;
                case 545937039:
                case 1920987987:
                    int i50 = i22;
                    obj2 = obj2;
                    C1003 c10020 = c1003;
                    objArr4 = objArr4;
                    sArr = sArr3;
                    i26 = i26;
                    i27 = i27;
                    try {
                        i22 = i50;
                        c1003 = c10020;
                        i34 = c10020.f4683;
                        int iM4502111 = (C19806.m45029("ۘ᩻") + i30) * 95;
                        i31 = ((iM4502111 ^ i29) * 323) ^ (-98029972);
                        i16 = iM4502111 ^ (-1176350717);
                    } catch (IOException unused2) {
                        i22 = i50;
                        c1003 = c10020;
                        i34 = i34;
                        iM450211 = (ThreadFactoryC3888.m11306("۬ۖ") + i29) * 11;
                        i31 = ((iM450211 ^ i30) * (-30045)) ^ (-589913782);
                        i13 = 573919883;
                        i16 = iM450211 ^ i13;
                        i34 = i34;
                    }
                    i27 = i27;
                    i26 = i26;
                    i22 = i22;
                    i32 = i16;
                    objArr4 = objArr4;
                    obj2 = obj2;
                    this = this;
                    C1003 c100110 = c1003;
                    sArr3 = sArr;
                    c1003 = c100110;
                    break;
                case 1127920148:
                case 1889751866:
                    i22 = i22;
                    obj2 = obj2;
                    objArr = objArr4;
                    i6 = i26;
                    i7 = i27;
                    short[] sArr12 = sArr3;
                    c1003 = c1003;
                    sArr = sArr12;
                    int i51 = i24 + i25;
                    i8 = i34;
                    short s2 = s;
                    int i52 = s2 + 4073;
                    if ((i52 * i52) - (i51 + i51) > 0) {
                        iM450210 = (C19806.m45029("ܶᩳ") + i29) * (-35);
                        i10 = ((iM450210 ^ i30) * 4311) ^ (-1242256626);
                        i11 = 883889691;
                    } else {
                        iM450210 = C19806.m45029("ܰۨ") ^ i30;
                        i10 = ((iM450210 ^ i29) * (-26821)) ^ (-1608612644);
                        i11 = -132161957;
                    }
                    i12 = iM450210 ^ i11;
                    s = s2;
                    i31 = i10;
                    i27 = i7;
                    i34 = i8;
                    i22 = i22;
                    i32 = i12;
                    i26 = i6;
                    objArr4 = objArr;
                    obj2 = obj2;
                    C1003 c100111 = c1003;
                    sArr3 = sArr;
                    c1003 = c100111;
                    break;
                case 1152016942:
                case 1466138074:
                    i22 = i22;
                    obj2 = obj2;
                    c17485 = new C17485(this, C19806.m45029(CallableC1627.m5502(f76464, 215, 3, i33)) ^ 2101525176);
                    if (C2332.m7079() > 0) {
                        iM45029 = C19806.m45029("ۧ۠") ^ i30;
                        i = ((iM45029 ^ i29) * 22569) ^ 1170095291;
                        i2 = 430032505;
                        i4 = iM45029 ^ i2;
                        obj2 = obj2;
                        int i319 = i22;
                        i32 = i4;
                        i31 = i;
                        i22 = i319;
                    } else {
                        objArr = objArr4;
                        i6 = i26;
                        i7 = i27;
                        i8 = i34;
                        short[] sArr13 = sArr3;
                        c1003 = c1003;
                        sArr = sArr13;
                        iM11307 = ThreadFactoryC3888.m11306("᩷ۧ") ^ i29;
                        i31 = ((iM11307 ^ i30) * 28949) ^ 748254217;
                        i9 = -843414135;
                        i12 = iM11307 ^ i9;
                        i27 = i7;
                        i34 = i8;
                        i22 = i22;
                        i32 = i12;
                        i26 = i6;
                        objArr4 = objArr;
                        obj2 = obj2;
                        C1003 c100112 = c1003;
                        sArr3 = sArr;
                        c1003 = c100112;
                    }
                    break;
                case 1522750022:
                case 1856490903:
                    if (C2249.f8050 < 0) {
                        iM11308 = (ThreadFactoryC3888.m11306("ܺ۠") + i30) * 67;
                        i17 = ((iM11308 ^ i29) * (-32485)) ^ (-975066656);
                        i21 = 2025155281;
                    } else {
                        iM11308 = (i29 - ThreadFactoryC3888.m11306("ܳܳ")) * 23;
                        i17 = ((iM11308 ^ i30) * 23763) ^ (-1200630409);
                        i21 = -1942399701;
                    }
                    i32 = iM11308 ^ i21;
                    i31 = i17;
                    break;
                default:
                    i22 = i22;
                    obj2 = obj2;
                    strM6691 = C2124.m6690(this, C19806.m45029(RunnableC1564.m5344(f76464, 221, 3, i33)) ^ 2099157897);
                    if (C1189.f5284 <= 0) {
                        int iM450221 = C19806.m45029("ۛܺ") ^ i29;
                        i = ((iM450221 ^ i30) * (-2095)) ^ 1925649078;
                        i4 = iM450221 ^ 446068802;
                        obj2 = obj2;
                        sb = null;
                    } else {
                        sb = new StringBuilder();
                        C1148.m4223(sb, strM3021);
                        strM5481 = RunnableC1606.m5481(f76464, BERTags.FLAGS, 2, i33);
                        if (C7105.f23796 >= 0) {
                            iM45029 = (i30 - C19806.m45029("᩵ۗ")) * (-69);
                            i = ((iM45029 ^ i29) * 14979) ^ (-1665316486);
                            i2 = 1925732394;
                        } else {
                            iM45029 = C19806.m45029("۫֫") ^ i29;
                            i = ((iM45029 ^ i30) * 24753) ^ (-1921663126);
                            i2 = 1308511045;
                        }
                        i4 = iM45029 ^ i2;
                        obj2 = obj2;
                    }
                    int i3110 = i22;
                    i32 = i4;
                    i31 = i;
                    i22 = i3110;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0268 A[PHI: r3
      0x0268: PHI (r3v5 short) = (r3v2 short), (r3v4 short), (r3v2 short), (r3v2 short) binds: [B:73:0x0266, B:64:0x0200, B:19:0x0054, B:7:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m52056(EditText editText, DialogInterfaceC19356 dialogInterfaceC19356, ViewOnClickListenerC23604 viewOnClickListenerC23604, TextInputLayout textInputLayout) {
        int iM45029;
        int i;
        int i2;
        int iM11306;
        int i3;
        int i4;
        String strM3407 = null;
        short s = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = -1725034734;
        int i9 = C2477.f9839;
        int i10 = C1668.f6641;
        int iM450210 = C19806.m45029("ۤ۫") ^ i9;
        int i11 = ((iM450210 ^ i10) * 30015) ^ (-1821495881);
        int i12 = iM450210 ^ 1870687646;
        while (true) {
            C17485 c17485 = null;
            while (true) {
                i8 = ((((i8 ^ i10) * (-24159)) >> 31) & i11) ^ i12;
                switch (i8) {
                    case -2014626162:
                    case 1259127126:
                        if (RunnableC3388.f12514 < 0) {
                            iM45029 = ThreadFactoryC3888.m11306("۟ܶ") ^ i10;
                            i = ((iM45029 ^ i9) * 21933) ^ (-117951883);
                            i2 = -78717968;
                            i12 = iM45029 ^ i2;
                            i11 = i;
                        } else {
                            iM11306 = C19806.m45029("֨۬") ^ i10;
                            i3 = ((iM11306 ^ i9) * (-10779)) ^ (-1790069230);
                            i4 = -170106815;
                            i12 = iM11306 ^ i4;
                            i11 = i3;
                        }
                        break;
                    case -1989937983:
                    case 1950314662:
                        i7 = 14159;
                        iM11306 = C19806.m45029("ۡ۟") ^ i9;
                        i3 = ((iM11306 ^ i10) * 10453) ^ 1805843570;
                        i4 = -1718509425;
                        i12 = iM11306 ^ i4;
                        i11 = i3;
                        break;
                    case -1956911104:
                    case 383886021:
                        if (C2642.f10294 > 0) {
                            iM11306 = (i9 - C19806.m45029("ܿۜ")) * (-115);
                            i3 = ((iM11306 ^ i10) * (-13875)) ^ 1602000648;
                            i4 = -379780675;
                            i12 = iM11306 ^ i4;
                            i11 = i3;
                        }
                        break;
                    case -1707945862:
                    case -1484557117:
                        i5 = s * 25670;
                        i6 = s * s;
                        if (C10634.f36300 >= 0) {
                            iM11306 = C19806.m45029("֨۬") ^ i10;
                            i3 = ((iM11306 ^ i9) * (-10779)) ^ (-1790069230);
                            i4 = -170106815;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ۛ֨") + i9) * 93;
                            i3 = ((iM11306 ^ i10) * 30937) ^ (-1903630591);
                            i4 = 8849465;
                        }
                        i12 = iM11306 ^ i4;
                        i11 = i3;
                        break;
                    case -1340660650:
                    case -375358849:
                        if (m52051(textInputLayout, false)) {
                            iM11306 = (C19806.m45029("ܶ᩵") + i9) * 93;
                            i3 = ((iM11306 ^ i10) * 7221) ^ (-1241462605);
                            i4 = 25261469;
                        } else {
                            iM11306 = C19806.m45029("ۢ᩺") ^ i10;
                            i3 = ((iM11306 ^ i9) * 31127) ^ (-1054726874);
                            i4 = -148828574;
                        }
                        i12 = iM11306 ^ i4;
                        i11 = i3;
                        break;
                    case -1030107402:
                    case 430732327:
                        if (i5 - (164737225 + i6) <= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۤۜ") ^ i10;
                            i3 = ((iM11306 ^ i9) * 7777) ^ (-1903688946);
                            i4 = 505005094;
                        } else {
                            iM11306 = (i10 - ThreadFactoryC3888.m11306("ۘ᩸")) * 95;
                            i3 = ((iM11306 ^ i9) * (-21699)) ^ 657394040;
                            i4 = -820501386;
                        }
                        i12 = iM11306 ^ i4;
                        i11 = i3;
                        break;
                    case -1012194428:
                    case 196521609:
                        if (!viewOnClickListenerC23604.f76467.m50803()) {
                            iM45029 = (C19806.m45029("۫ۙ") + i9) * (-113);
                            i = ((iM45029 ^ i10) * (-24363)) ^ 907196737;
                            i2 = 531002259;
                            i12 = iM45029 ^ i2;
                            i11 = i;
                        } else {
                            iM11306 = C19806.m45029("ۢ᩺") ^ i10;
                            i3 = ((iM11306 ^ i9) * 31127) ^ (-1054726874);
                            i4 = -148828574;
                            i12 = iM11306 ^ i4;
                            i11 = i3;
                        }
                        break;
                    case -947949878:
                    case 531740663:
                        if (C2332.f8260) {
                            iM11306 = (ThreadFactoryC3888.m11306("۬ܰ") ^ i10) * (-5);
                            i3 = ((iM11306 ^ i9) * (-10425)) ^ (-359350428);
                            i4 = -2117672647;
                        } else {
                            iM11306 = C19806.m45029("ۘ֡") ^ i10;
                            i3 = ((iM11306 ^ i9) * (-2607)) ^ 214422783;
                            i4 = -276945148;
                        }
                        i12 = iM11306 ^ i4;
                        i11 = i3;
                        break;
                    case -905504543:
                    case 1655061146:
                        C10634.m26820();
                        break;
                    case -770428317:
                    case 1815407448:
                        if (C1668.f6641 < 0) {
                            int iM11307 = (ThreadFactoryC3888.m11306("ۛۜ") ^ i9) * (-93);
                            i11 = ((iM11307 ^ i10) * 28593) ^ 720176622;
                            i12 = iM11307 ^ 1473559287;
                        } else {
                            iM11306 = C19806.m45029("֨۬") ^ i10;
                            i3 = ((iM11306 ^ i9) * (-10779)) ^ (-1790069230);
                            i4 = -170106815;
                            i12 = iM11306 ^ i4;
                            i11 = i3;
                        }
                        break;
                    case -559058940:
                    case 1309821055:
                        s = f76464[251];
                        if (C1066.f4915 <= 0) {
                            iM11306 = C19806.m45029("ۘ֡") ^ i10;
                            i3 = ((iM11306 ^ i9) * (-2607)) ^ 214422783;
                            i4 = -276945148;
                        } else {
                            iM11306 = C19806.m45029("ۧۛ") ^ i10;
                            i3 = ((iM11306 ^ i9) * (-25975)) ^ (-221567756);
                            i4 = 222879793;
                        }
                        i12 = iM11306 ^ i4;
                        i11 = i3;
                        break;
                    case -303065195:
                    case 2013532754:
                        MenuItemOnMenuItemClickListenerC3244.m9701();
                        C0278.m1789();
                        iM11306 = C19806.m45029("֨۬") ^ i10;
                        i3 = ((iM11306 ^ i9) * (-10779)) ^ (-1790069230);
                        i4 = -170106815;
                        i12 = iM11306 ^ i4;
                        i11 = i3;
                        break;
                    case -260723076:
                    case -111319593:
                        i7 = 55053;
                        iM11306 = C19806.m45029("ۡ۟") ^ i9;
                        i3 = ((iM11306 ^ i10) * 10453) ^ 1805843570;
                        i4 = -1718509425;
                        i12 = iM11306 ^ i4;
                        i11 = i3;
                        break;
                    case 276521361:
                    case 690595744:
                        short[] sArr = f76464;
                        if (C3577.m10565()) {
                            int iM450211 = C19806.m45029(C0797.m3361(sArr, 252, 3, i7));
                            if (C1977.f7413 > 0) {
                                c17485 = new C17485(viewOnClickListenerC23604, iM450211 ^ 2099565712);
                                if (C2642.f10294 > 0) {
                                    iM45029 = ThreadFactoryC3888.m11306("ܶ۠") ^ i9;
                                    i = ((iM45029 ^ i10) * (-29401)) ^ (-1791606449);
                                    i2 = 1562136552;
                                    i12 = iM45029 ^ i2;
                                    i11 = i;
                                    break;
                                }
                            }
                        }
                        break;
                    case 757968748:
                    case 1038440766:
                        C1025.m3858(c17485);
                        if (C0817.f3443) {
                            C2642.m8165(new C3804(strM3407, viewOnClickListenerC23604, new C1024(c17485, viewOnClickListenerC23604, dialogInterfaceC19356)));
                        }
                        int iM11308 = (ThreadFactoryC3888.m11306("ۛۜ") ^ i9) * (-93);
                        i11 = ((iM11308 ^ i10) * 28593) ^ 720176622;
                        i12 = iM11308 ^ 1473559287;
                        break;
                    case 1133780908:
                    case 1616579877:
                        break;
                    case 1260277222:
                    case 1781938682:
                        C3286.m9798();
                        if (C2788.m8472() != 0) {
                            iM11306 = C19806.m45029("ۘ֡") ^ i10;
                            i3 = ((iM11306 ^ i9) * (-2607)) ^ 214422783;
                            i4 = -276945148;
                            i12 = iM11306 ^ i4;
                            i11 = i3;
                        }
                        iM11306 = C19806.m45029("֨۬") ^ i10;
                        i3 = ((iM11306 ^ i9) * (-10779)) ^ (-1790069230);
                        i4 = -170106815;
                        i12 = iM11306 ^ i4;
                        i11 = i3;
                        break;
                    case 1617652769:
                    case 1717318167:
                        strM3407 = C0817.m3407(ViewTreeObserverOnPreDrawListenerC3327.m9864(editText));
                        C1189.m4367(dialogInterfaceC19356);
                        if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                            iM45029 = (ThreadFactoryC3888.m11306("۫᩵") ^ i10) * (-69);
                            i = ((iM45029 ^ i9) * (-1659)) ^ (-193364916);
                            i2 = 1013790182;
                        } else {
                            iM45029 = ThreadFactoryC3888.m11306("۟ܶ") ^ i10;
                            i = ((iM45029 ^ i9) * 21933) ^ (-117951883);
                            i2 = -78717968;
                        }
                        i12 = iM45029 ^ i2;
                        i11 = i;
                        break;
                    default:
                        if (RunnableC1606.f6488 >= 0) {
                            iM11306 = C19806.m45029("ۘ֡") ^ i10;
                            i3 = ((iM11306 ^ i9) * (-2607)) ^ 214422783;
                            i4 = -276945148;
                        } else {
                            iM11306 = C19806.m45029("᩸᩹") ^ i9;
                            i3 = ((iM11306 ^ i10) * 27893) ^ 1861135435;
                            i4 = -1365296661;
                        }
                        i12 = iM11306 ^ i4;
                        i11 = i3;
                        break;
                }
                return;
            }
            int iM450212 = (C19806.m45029("ᩴᩳ") + i9) * 89;
            int i13 = ((iM450212 ^ i10) * (-2181)) ^ (-670833338);
            i12 = iM450212 ^ 1228764083;
            i11 = i13;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x02a5 A[PHI: r13 r14 r15 r22 r30 r32 r34 r35 r36 r37
      0x02a5: PHI (r13v5 android.widget.EditText) = (r13v4 android.widget.EditText), (r13v2 android.widget.EditText) binds: [B:41:0x02a3, B:30:0x019f] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r14v43 short[]) = (r14v33 short[]), (r14v44 short[]) binds: [B:41:0x02a3, B:30:0x019f] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r15v41 int) = (r15v31 int), (r15v42 int) binds: [B:41:0x02a3, B:30:0x019f] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r22v3 int) = (r22v2 int), (r22v4 int) binds: [B:41:0x02a3, B:30:0x019f] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r30v26 java.lang.String) = (r30v19 java.lang.String), (r30v27 java.lang.String) binds: [B:41:0x02a3, B:30:0x019f] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r32v28 android.widget.EditText) = (r32v25 android.widget.EditText), (r32v29 android.widget.EditText) binds: [B:41:0x02a3, B:30:0x019f] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r34v18 int) = (r34v13 int), (r34v19 int) binds: [B:41:0x02a3, B:30:0x019f] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r35v30 l.᩵ۡۜ) = (r35v25 l.᩵ۡۜ), (r35v31 l.᩵ۡۜ) binds: [B:41:0x02a3, B:30:0x019f] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r36v26 short) = (r36v22 short), (r36v27 short) binds: [B:41:0x02a3, B:30:0x019f] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r37v32 android.widget.TextView) = (r37v26 android.widget.TextView), (r37v33 android.widget.TextView) binds: [B:41:0x02a3, B:30:0x019f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00bc, code lost:
    
        if (l.C2704.f10408 != false) goto L15;
     */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m52067() {
        /*
            Method dump skipped, instruction units count: 1732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC23604.m52067():void");
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0161  */
    /* JADX WARN: Code duplicated, block: B:75:0x0279 A[PHI: r7
      0x0279: PHI (r7v4 int) = (r7v1 int), (r7v3 int), (r7v1 int) binds: [B:74:0x0277, B:58:0x01e7, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x02a5  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (l.C2788.f10625 >= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0043, code lost:
    
        if (l.C1148.f5161 > 0) goto L9;
     */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.۬ۡ᩺] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m52060(android.widget.EditText r16, android.widget.EditText r17, final l.DialogInterfaceC19356 r18, l.ViewOnClickListenerC23604 r19, final com.google.android.material.textfield.TextInputLayout r20, com.google.android.material.textfield.TextInputLayout r21) {
        /*
            Method dump skipped, instruction units count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC23604.m52060(android.widget.EditText, android.widget.EditText, l.᩵ۡۜ, l.᩻ۡ᩺, com.google.android.material.textfield.TextInputLayout, com.google.android.material.textfield.TextInputLayout):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0080, code lost:
    
        if (l.C3722.f13525 <= 0) goto L8;
     */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m52057(l.C17485 r27, l.ViewOnClickListenerC23604 r28, l.C1313 r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC23604.m52057(l.ܿܿۚ, l.᩻ۡ᩺, l.֨ᩴ᩺):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:56:0x01d7 A[PHI: r7 r10 r11 r16
      0x01d7: PHI (r7v3 int) = (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:55:0x01d5, B:34:0x00e3, B:12:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x01d7: PHI (r10v3 short[]) = (r10v1 short[]), (r10v2 short[]), (r10v1 short[]) binds: [B:55:0x01d5, B:34:0x00e3, B:12:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x01d7: PHI (r11v3 int) = (r11v1 int), (r11v2 int), (r11v1 int) binds: [B:55:0x01d5, B:34:0x00e3, B:12:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x01d7: PHI (r16v22 int) = (r16v11 int), (r16v18 int), (r16v25 int) binds: [B:55:0x01d5, B:34:0x00e3, B:12:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x022e A[PHI: r5 r12 r16
      0x022e: PHI (r5v3 short) = (r5v2 short), (r5v1 short) binds: [B:63:0x022c, B:30:0x00be] A[DONT_GENERATE, DONT_INLINE]
      0x022e: PHI (r12v2 int) = (r12v1 int), (r12v3 int) binds: [B:63:0x022c, B:30:0x00be] A[DONT_GENERATE, DONT_INLINE]
      0x022e: PHI (r16v19 int) = (r16v8 int), (r16v20 int) binds: [B:63:0x022c, B:30:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0230 A[PHI: r1 r2 r5 r12
      0x0230: PHI (r1v61 int) = (r1v42 int), (r1v1 int), (r1v1 int), (r1v66 int) binds: [B:64:0x022e, B:14:0x0058, B:6:0x003a, B:23:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r2v3 int) = (r2v1 int), (r2v1 int), (r2v1 int), (r2v5 int) binds: [B:64:0x022e, B:14:0x0058, B:6:0x003a, B:23:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r5v5 short) = (r5v3 short), (r5v1 short), (r5v1 short), (r5v1 short) binds: [B:64:0x022e, B:14:0x0058, B:6:0x003a, B:23:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r12v5 int) = (r12v2 int), (r12v1 int), (r12v1 int), (r12v1 int) binds: [B:64:0x022e, B:14:0x0058, B:6:0x003a, B:23:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0295 A[PHI: r3 r6 r16
      0x0295: PHI (r3v3 short[]) = (r3v2 short[]), (r3v1 short[]) binds: [B:72:0x0293, B:59:0x020b] A[DONT_GENERATE, DONT_INLINE]
      0x0295: PHI (r6v2 int) = (r6v1 int), (r6v3 int) binds: [B:72:0x0293, B:59:0x020b] A[DONT_GENERATE, DONT_INLINE]
      0x0295: PHI (r16v9 int) = (r16v6 int), (r16v10 int) binds: [B:72:0x0293, B:59:0x020b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x003e A[PHI: r17
      0x003e: PHI (r17v4 java.lang.String) = (r17v2 java.lang.String), (r17v1 java.lang.String) binds: [B:26:0x009f, B:6:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final void m52052() {
        int iM11306;
        int i;
        int i2;
        int iM45029 = 0;
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
        int i9 = 2016151847;
        int i10 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int i11 = ThreadFactoryC3888.f14547;
        int iM450210 = (C19806.m45029("ܰܽ") ^ i10) * 55;
        int i12 = ((iM450210 ^ i11) * (-6957)) ^ 1577248959;
        int i13 = iM450210 ^ 1647707490;
        String strM6363 = null;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i11) * 17111) >> 31));
            switch (i9) {
                case -2120948908:
                case 29062768:
                    C1189.m4368();
                    if (C2642.m8171() != 0) {
                        iM45029 = iM45029;
                        iM11306 = C19806.m45029("᩷᩺") ^ i11;
                        i = ((iM11306 ^ i10) * 18731) ^ (-968795519);
                        i2 = 772478537;
                    } else {
                        iM11306 = (C19806.m45029("ۡܳ") + i10) * (-63);
                        iM45029 = iM45029;
                        i = ((iM11306 ^ i11) * (-20951)) ^ 1786355627;
                        i2 = 1214321135;
                    }
                    int i14 = iM45029;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    iM45029 = i14;
                    break;
                case -1984451899:
                case -1759539761:
                    iM45029 = iM45029;
                    c = 201;
                    if (C0962.f3784) {
                        iM11306 = C19806.m45029("᩷᩺") ^ i11;
                        i = ((iM11306 ^ i10) * 18731) ^ (-968795519);
                        i2 = 772478537;
                    } else {
                        iM11306 = C19806.m45029("ܳ᩹") ^ i11;
                        i = ((iM11306 ^ i10) * (-25641)) ^ (-2053477408);
                        i2 = 1856008390;
                    }
                    int i15 = iM45029;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    iM45029 = i15;
                    break;
                case -1660231308:
                case 694661549:
                    iM45029 = iM45029;
                    if (C1709.m5695()) {
                        iM11306 = C19806.m45029("᩺ۡ") ^ i10;
                        i = ((iM11306 ^ i11) * 16295) ^ 1829215460;
                        i2 = -789994606;
                    } else {
                        iM11306 = (C19806.m45029("ۜ֨") + i11) * (-117);
                        i = ((iM11306 ^ i10) * 2915) ^ (-1510296340);
                        i2 = -679932635;
                    }
                    int i16 = iM45029;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    iM45029 = i16;
                    break;
                case -1156726691:
                case 1652255177:
                    C1025.m3861();
                    if (C1460.f5948 >= 0) {
                        iM45029 = iM45029;
                        iM11306 = (C19806.m45029("ܽ᩵") + i11) * 39;
                        i = ((iM11306 ^ i10) * 897) ^ 670125975;
                        i2 = -1463492912;
                        int i17 = iM45029;
                        i13 = iM11306 ^ i2;
                        i12 = i;
                        iM45029 = i17;
                    }
                    iM45029 = iM45029;
                    iM11306 = C19806.m45029("᩷᩺") ^ i11;
                    i = ((iM11306 ^ i10) * 18731) ^ (-968795519);
                    i2 = 772478537;
                    int i18 = iM45029;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    iM45029 = i18;
                    break;
                case -1151933334:
                case 1911065986:
                    RunnableC0195.m1442(new C10904(this));
                    break;
                case -947660456:
                case 673674758:
                    C3286.m9798();
                    iM45029 = iM45029;
                    iM11306 = C19806.m45029("᩷᩺") ^ i11;
                    i = ((iM11306 ^ i10) * 18731) ^ (-968795519);
                    i2 = 772478537;
                    int i19 = iM45029;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    iM45029 = i19;
                    break;
                case -881949434:
                case 1518599477:
                    iM45029 = iM45029;
                    i4 = s * 2;
                    if (C10634.f36300 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨ᩺") + i11) * (-105);
                        i = ((iM11306 ^ i10) * 9197) ^ (-1901805539);
                        i2 = 122820835;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۬ᩳ") ^ i10) * (-75);
                        i = ((iM11306 ^ i11) * 23023) ^ (-1222511994);
                        i2 = -861761530;
                    }
                    int i110 = iM45029;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    iM45029 = i110;
                    break;
                case -850151078:
                case 1898861231:
                    iM45029 = C19806.m45029(strM6363);
                    if (C1398.f5802 <= 0) {
                        i3 = 2098290893;
                        iM11306 = (C19806.m45029("ۡܳ") + i10) * (-63);
                        iM45029 = iM45029;
                        i = ((iM11306 ^ i11) * (-20951)) ^ 1786355627;
                        i2 = 1214321135;
                        int i111 = iM45029;
                        i13 = iM11306 ^ i2;
                        i12 = i;
                        iM45029 = i111;
                    } else {
                        int iM450211 = (C19806.m45029("᩸᩻") + i10) * 9;
                        i13 = iM450211 ^ (-1266171411);
                        i12 = ((iM450211 ^ i11) * (-10149)) ^ (-1886403696);
                        i3 = 2098290893;
                    }
                    break;
                case -724107171:
                case -174827116:
                    iM45029 = iM45029;
                    sArr = f76464;
                    if (C0629.f2722 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨ᩺") + i11) * (-105);
                        i = ((iM11306 ^ i10) * 9197) ^ (-1901805539);
                        i2 = 122820835;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸ܶ") ^ i10) * (-3);
                        i = ((iM11306 ^ i11) * (-26913)) ^ (-540762635);
                        i2 = -1790189792;
                    }
                    int i112 = iM45029;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    iM45029 = i112;
                    break;
                case -574884676:
                case 411406454:
                    iM45029 = iM45029;
                    i5 = i4 + 1;
                    if (C2249.f8050 >= 0) {
                        iM11306 = (C19806.m45029("ܽ᩵") + i11) * 39;
                        i = ((iM11306 ^ i10) * 897) ^ 670125975;
                        i2 = -1463492912;
                    } else {
                        iM11306 = (C19806.m45029("ۙܺ") ^ i10) * 55;
                        i = ((iM11306 ^ i11) * 12287) ^ (-39543123);
                        i2 = 2108229609;
                    }
                    int i113 = iM45029;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    iM45029 = i113;
                    break;
                case -446886776:
                case -247757800:
                    iM45029 = iM45029;
                    i8 = 3;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = iM45029;
                        iM11306 = (C19806.m45029("ۡܳ") + i10) * (-63);
                        iM45029 = iM45029;
                        i = ((iM11306 ^ i11) * (-20951)) ^ 1786355627;
                        i2 = 1214321135;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۤۜ") + i11) * (-11);
                        i = ((iM11306 ^ i10) * 23937) ^ (-2117418045);
                        i2 = 2145417539;
                    }
                    int i114 = iM45029;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    iM45029 = i114;
                    break;
                case -388447205:
                case -330807085:
                    i6 = 43967;
                    iM11306 = ThreadFactoryC3888.m11306("ۡ֨") ^ i11;
                    i = ((iM11306 ^ i10) * 15811) ^ 686916133;
                    i2 = -882265705;
                    int i115 = iM45029;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    iM45029 = i115;
                    break;
                case -388031961:
                case 952304484:
                    iM45029 = iM45029;
                    s = sArr[c];
                    if (C1977.f7413 <= 0) {
                        iM45029 = iM45029;
                        iM11306 = (C19806.m45029("ۡܳ") + i10) * (-63);
                        iM45029 = iM45029;
                        i = ((iM11306 ^ i11) * (-20951)) ^ 1786355627;
                        i2 = 1214321135;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫֫") ^ i11;
                        i = ((iM11306 ^ i10) * 3143) ^ (-1161176586);
                        i2 = -1660038366;
                    }
                    int i116 = iM45029;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    iM45029 = i116;
                    break;
                case -365737357:
                case 82054332:
                    iM45029 = iM45029;
                    s2 = 1;
                    if (C3660.f13403 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ۖ") ^ i10) * 17;
                        i = ((iM11306 ^ i11) * 6169) ^ 322402924;
                        i2 = -749457035;
                    } else {
                        iM11306 = (C19806.m45029("ۛܶ") + i11) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM11306 ^ i10) * (-22037)) ^ (-1982878735);
                        i2 = 185983631;
                    }
                    int i117 = iM45029;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    iM45029 = i117;
                    break;
                case -63714377:
                case 911204847:
                    strM6363 = C1977.m6363(sArr2, i7, i8, i6);
                    if (C1189.m4368() <= 0) {
                        iM45029 = iM45029;
                        iM11306 = (ThreadFactoryC3888.m11306("۫ۖ") ^ i10) * 17;
                        i = ((iM11306 ^ i11) * 6169) ^ 322402924;
                        i2 = -749457035;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴ᩵") ^ i10;
                        iM45029 = iM45029;
                        i = ((iM11306 ^ i11) * 6745) ^ (-1226562153);
                        i2 = 1817371244;
                    }
                    int i118 = iM45029;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    iM45029 = i118;
                    break;
                case 90337375:
                case 2020332206:
                    C1066.m4023();
                    C0817.m3399();
                    break;
                case 439017083:
                case 759521771:
                    i6 = 27134;
                    iM11306 = ThreadFactoryC3888.m11306("ۡ֨") ^ i11;
                    i = ((iM11306 ^ i10) * 15811) ^ 686916133;
                    i2 = -882265705;
                    int i119 = iM45029;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    iM45029 = i119;
                    break;
                case 498551655:
                case 1481869965:
                    C1668.m5582(iM45029 ^ i3);
                    break;
                case 1399269973:
                case 1720430924:
                    iM45029 = iM45029;
                    sArr2 = f76464;
                    i7 = 202;
                    if (C7105.m18985()) {
                        iM11306 = (C19806.m45029("ܽ᩵") + i11) * 39;
                        i = ((iM11306 ^ i10) * 897) ^ 670125975;
                        i2 = -1463492912;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۬ܽ") + i10) * 65;
                        i = ((iM11306 ^ i11) * 1037) ^ (-741768564);
                        i2 = 277107088;
                    }
                    int i1110 = iM45029;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    iM45029 = i1110;
                    break;
                case 1611252577:
                case 1895260868:
                    iM45029 = iM45029;
                    int i20 = s + s2;
                    if (i5 - (i20 * i20) > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙۢ") ^ i10;
                        i = ((iM11306 ^ i11) * 30817) ^ 1668059594;
                        i2 = -1155002139;
                    } else {
                        iM11306 = (i11 - C19806.m45029("ۙ᩺")) * (-69);
                        i = ((iM11306 ^ i10) * (-17089)) ^ (-1457274638);
                        i2 = 1529114146;
                    }
                    int i1111 = iM45029;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    iM45029 = i1111;
                    break;
                default:
                    if (C2124.f7782 <= 0) {
                        iM11306 = (C19806.m45029("ۡܳ") + i10) * (-63);
                        iM45029 = iM45029;
                        i = ((iM11306 ^ i11) * (-20951)) ^ 1786355627;
                        i2 = 1214321135;
                    } else {
                        iM45029 = iM45029;
                        iM11306 = (ThreadFactoryC3888.m11306("۫ۖ") ^ i10) * 17;
                        i = ((iM11306 ^ i11) * 6169) ^ 322402924;
                        i2 = -749457035;
                    }
                    int i1112 = iM45029;
                    i13 = iM11306 ^ i2;
                    i12 = i;
                    iM45029 = i1112;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52049(ViewOnClickListenerC23604 viewOnClickListenerC23604) {
        viewOnClickListenerC23604.m52036();
    }

    /* JADX WARN: Code duplicated, block: B:66:0x01fe A[PHI: r4
      0x01fe: PHI (r4v6 int) = (r4v2 int), (r4v4 int), (r4v2 int), (r4v2 int) binds: [B:65:0x01fc, B:53:0x0184, B:14:0x0055, B:7:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52040(final View view, final EditText editText, final ViewOnClickListenerC23604 viewOnClickListenerC23604) {
        int iM45029;
        int i;
        InterfaceC6627 interfaceC6627 = null;
        short[] sArr = null;
        short s = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1082548910;
        int i5 = C2788.f10625;
        int i6 = RunnableC3388.f12514;
        int iM11306 = (ThreadFactoryC3888.m11306("᩺۟") ^ i6) * (-111);
        int i7 = ((iM11306 ^ i5) * (-6011)) ^ 817427692;
        int i8 = 1341350213;
        while (true) {
            int i9 = iM11306 ^ i8;
            final C17485 c17485 = null;
            while (true) {
                i4 = ((((i4 ^ i5) * (-31935)) >> 31) & i7) ^ i9;
                switch (i4) {
                    case -2068446909:
                    case 550300202:
                        s = sArr[27];
                        if (C2124.m6673() > 0) {
                            iM45029 = C19806.m45029("ۗ۬") ^ i5;
                            i7 = ((iM45029 ^ i6) * (-18219)) ^ (-954553010);
                            i = 1800865339;
                            i9 = iM45029 ^ i;
                        } else {
                            iM11306 = C19806.m45029("֫ܽ") ^ i6;
                            i7 = ((iM11306 ^ i5) * (-24785)) ^ 2108979581;
                            i8 = -1822166143;
                        }
                        break;
                    case -1834892489:
                    case 1727063213:
                        sArr = f76464;
                        if (RunnableC1606.f6488 < 0) {
                            iM45029 = C19806.m45029("۠۠") ^ i5;
                            i7 = ((iM45029 ^ i6) * (-27397)) ^ 310893722;
                            i = -182264580;
                            i9 = iM45029 ^ i;
                        } else {
                            iM11306 = C19806.m45029("ۛܿ") ^ i6;
                            i7 = ((iM11306 ^ i5) * (-16725)) ^ (-1218286982);
                            i8 = 2085522432;
                        }
                        break;
                    case -1722351328:
                    case -1685530350:
                        short[] sArr2 = f76464;
                        if (RunnableC3388.f12514 < 0) {
                            String strM8640 = C2871.m8640(sArr2, 28, 3, i3);
                            if (C1977.m6356()) {
                                iM11306 = C19806.m45029("֫ܽ") ^ i6;
                                i7 = ((iM11306 ^ i5) * (-24785)) ^ 2108979581;
                                i8 = -1822166143;
                                break;
                            } else {
                                int iM11307 = ThreadFactoryC3888.m11306(strM8640) ^ 2121396240;
                                if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                                    iM11306 = C19806.m45029("ۛܿ") ^ i6;
                                    i7 = ((iM11306 ^ i5) * (-16725)) ^ (-1218286982);
                                    i8 = 2085522432;
                                    break;
                                } else {
                                    c17485 = new C17485(viewOnClickListenerC23604, iM11307);
                                    if (C1460.m5050() == 0) {
                                        iM45029 = (ThreadFactoryC3888.m11306("ۡ֫") + i5) * (-89);
                                        i7 = ((iM45029 ^ i6) * 30173) ^ (-189177257);
                                        i = 1988312070;
                                        i9 = iM45029 ^ i;
                                        break;
                                    }
                                }
                            }
                        }
                        iM11306 = (C19806.m45029("ۗ֡") + i5) * 77;
                        i7 = ((iM11306 ^ i6) * (-20459)) ^ 1525398356;
                        i8 = 482824793;
                        break;
                    case -1503310746:
                    case -294482945:
                        i3 = 33365;
                        iM45029 = (ThreadFactoryC3888.m11306("֫᩶") ^ i6) * (-45);
                        i7 = ((iM45029 ^ i5) * (-29677)) ^ (-857015629);
                        i = 1074610355;
                        i9 = iM45029 ^ i;
                        break;
                    case -1407728670:
                    case 2046346831:
                        if (viewOnClickListenerC23604.f76467.m50803()) {
                            iM45029 = C19806.m45029("ܰܳ") ^ i5;
                            i7 = ((iM45029 ^ i6) * (-19183)) ^ 1380000113;
                            i = -397025909;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("ۤ᩸") + i5) * 61;
                            i7 = ((iM45029 ^ i6) * 4601) ^ 318637735;
                            i = 1638920400;
                        }
                        i9 = iM45029 ^ i;
                        break;
                    case -1390859726:
                    case -383288250:
                        C0797.m3354(c17485);
                        interfaceC6627 = new InterfaceC6627() { // from class: l.ۙۡ᩺
                            @Override // l.InterfaceC6627
                            /* JADX INFO: renamed from: ۙ */
                            public final void mo3852(C1313 c1313) {
                                EditText editText2 = null;
                                ViewOnClickListenerC23604 viewOnClickListenerC23605 = null;
                                int i10 = 1506281526;
                                int i11 = C10634.f36300;
                                int i12 = C1066.f4915;
                                int iM450210 = (C19806.m45029("ᩳۢ") + i11) * (-91);
                                int i13 = ((iM450210 ^ i12) * (-2723)) ^ 1930079382;
                                int i14 = -224800330;
                                while (true) {
                                    i10 = ((((i10 ^ i12) * 4667) >> 31) & i13) ^ (iM450210 ^ i14);
                                    switch (i10) {
                                        case -2141337311:
                                        case -895210154:
                                            if (C2642.f10294 <= 0) {
                                                iM450210 = (i11 - ThreadFactoryC3888.m11306("۠᩺")) * (-107);
                                                i13 = ((iM450210 ^ i12) * 23097) ^ 576746502;
                                                i14 = 1578294604;
                                            } else {
                                                iM450210 = C19806.m45029("ۜۚ") ^ i11;
                                                i13 = ((iM450210 ^ i12) * 5093) ^ (-935923950);
                                                i14 = -819352814;
                                            }
                                            break;
                                        case -1239105131:
                                        case -540338192:
                                            if (C2788.f10625 >= 0) {
                                                iM450210 = (i12 - C19806.m45029("ᩴۧ")) * (-87);
                                                i13 = ((iM450210 ^ i11) * 25497) ^ 319459790;
                                                i14 = -1528556297;
                                            } else {
                                                iM450210 = (C19806.m45029("۬۫") + i12) * (-55);
                                                i13 = ((iM450210 ^ i11) * 1613) ^ 1969341658;
                                                i14 = 1226648985;
                                            }
                                            break;
                                        case -1185326199:
                                        case -1009078241:
                                            C1937.m6279();
                                            if (C3660.m10791() == 0) {
                                                iM450210 = C19806.m45029("ۧۙ") ^ i11;
                                                i13 = ((iM450210 ^ i12) * 889) ^ (-1697739694);
                                                i14 = -426369411;
                                            } else {
                                                iM450210 = (i12 - C19806.m45029("ᩴۧ")) * (-87);
                                                i13 = ((iM450210 ^ i11) * 25497) ^ 319459790;
                                                i14 = -1528556297;
                                            }
                                            break;
                                        case -908351019:
                                        case -844761097:
                                            ViewOnClickListenerC23604.m52044(c17485, view, editText2, viewOnClickListenerC23605, c1313);
                                            break;
                                        case -807282253:
                                        case 1421707736:
                                            C1398.m4895();
                                            if (!C0962.f3784) {
                                                iM450210 = (ThreadFactoryC3888.m11306("۬۟") + i12) * 21;
                                                i13 = ((iM450210 ^ i11) * (-31697)) ^ (-1683768812);
                                                i14 = -1688526742;
                                            } else {
                                                iM450210 = C19806.m45029("ۧۙ") ^ i11;
                                                i13 = ((iM450210 ^ i12) * 889) ^ (-1697739694);
                                                i14 = -426369411;
                                            }
                                            break;
                                        case -467204080:
                                        case 1356060826:
                                            viewOnClickListenerC23605 = viewOnClickListenerC23604;
                                            if (C1398.f5802 <= 0) {
                                                iM450210 = C19806.m45029("᩸۠") ^ i11;
                                                i13 = ((iM450210 ^ i12) * 11755) ^ 1211193188;
                                                i14 = -340111653;
                                            } else {
                                                iM450210 = C19806.m45029("۟ܿ") ^ i12;
                                                i13 = ((iM450210 ^ i11) * 28527) ^ (-1515277879);
                                                i14 = -1474755879;
                                            }
                                            break;
                                        case -359821356:
                                        case -258828258:
                                            if (C2642.f10294 <= 0) {
                                                iM450210 = (ThreadFactoryC3888.m11306("۬۟") + i12) * 21;
                                                i13 = ((iM450210 ^ i11) * (-31697)) ^ (-1683768812);
                                                i14 = -1688526742;
                                            } else {
                                                iM450210 = ThreadFactoryC3888.m11306("᩷᩷") ^ i11;
                                                i13 = ((iM450210 ^ i12) * (-29889)) ^ (-711041080);
                                                i14 = -1873590895;
                                            }
                                            break;
                                        case -283042679:
                                        case 794097434:
                                            if (C1977.f7413 <= 0) {
                                                iM450210 = C19806.m45029("᩸۠") ^ i11;
                                                i13 = ((iM450210 ^ i12) * 11755) ^ 1211193188;
                                                i14 = -340111653;
                                            } else {
                                                iM450210 = C19806.m45029("ۤۤ") ^ i12;
                                                i13 = ((iM450210 ^ i11) * 25327) ^ (-1752953901);
                                                i14 = 1628021808;
                                            }
                                            break;
                                        case -140282350:
                                        case 1882033159:
                                            editText2 = editText;
                                            if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                                                iM450210 = (i12 - C19806.m45029("ᩴۧ")) * (-87);
                                                i13 = ((iM450210 ^ i11) * 25497) ^ 319459790;
                                                i14 = -1528556297;
                                            } else {
                                                iM450210 = C19806.m45029("֫۫") ^ i11;
                                                i13 = ((iM450210 ^ i12) * 16603) ^ (-2142064979);
                                                i14 = -271084975;
                                            }
                                            break;
                                        case 78991838:
                                        case 910464806:
                                            if (C1668.f6641 >= 0) {
                                                iM450210 = C19806.m45029("᩸۠") ^ i11;
                                                i13 = ((iM450210 ^ i12) * 11755) ^ 1211193188;
                                                i14 = -340111653;
                                            } else {
                                                iM450210 = (i12 - ThreadFactoryC3888.m11306("ۖ᩵")) * (-7);
                                                i13 = ((iM450210 ^ i11) * 23691) ^ (-885712796);
                                                i14 = 2114117444;
                                            }
                                            break;
                                        case 586048195:
                                        case 941847483:
                                            if (C1189.f5284 <= 0) {
                                                iM450210 = (i11 - ThreadFactoryC3888.m11306("۠᩺")) * (-107);
                                                i13 = ((iM450210 ^ i12) * 23097) ^ 576746502;
                                                i14 = 1578294604;
                                            } else {
                                                iM450210 = (i12 - ThreadFactoryC3888.m11306("ۘܿ")) * (-21);
                                                i13 = ((iM450210 ^ i11) * 14819) ^ (-1561326043);
                                                i14 = 671043660;
                                            }
                                            break;
                                        case 853999068:
                                        case 2002549225:
                                            C0671.m3008();
                                            MenuItemOnMenuItemClickListenerC3244.m9701();
                                            break;
                                        case 855713456:
                                        case 1837018764:
                                            if (C0526.f2219) {
                                                iM450210 = C19806.m45029("ۧۙ") ^ i11;
                                                i13 = ((iM450210 ^ i12) * 889) ^ (-1697739694);
                                                i14 = -426369411;
                                            } else {
                                                iM450210 = (i11 - C19806.m45029("᩺ۗ")) * (-75);
                                                i13 = ((iM450210 ^ i12) * 28769) ^ (-1200282448);
                                                i14 = 845148189;
                                            }
                                            break;
                                        case 1239662035:
                                        case 1528383331:
                                            if (C2124.f7782 <= 0) {
                                                iM450210 = (i12 - C19806.m45029("ᩴۧ")) * (-87);
                                                i13 = ((iM450210 ^ i11) * 25497) ^ 319459790;
                                                i14 = -1528556297;
                                            } else {
                                                iM450210 = C19806.m45029("ۖۤ") ^ i11;
                                                i13 = ((iM450210 ^ i12) * (-5819)) ^ 64934610;
                                                i14 = 153151280;
                                            }
                                            break;
                                        case 1246140681:
                                        case 1502756548:
                                            C2871.m8646();
                                            if (!C2332.f8260) {
                                                iM450210 = (i12 - C19806.m45029("ᩴۧ")) * (-87);
                                                i13 = ((iM450210 ^ i11) * 25497) ^ 319459790;
                                                i14 = -1528556297;
                                            } else {
                                                iM450210 = (i11 - ThreadFactoryC3888.m11306("۠᩺")) * (-107);
                                                i13 = ((iM450210 ^ i12) * 23097) ^ 576746502;
                                                i14 = 1578294604;
                                            }
                                            break;
                                        default:
                                            C2788.m8472();
                                            C3660.m10791();
                                            iM450210 = (i11 - ThreadFactoryC3888.m11306("۠᩺")) * (-107);
                                            i13 = ((iM450210 ^ i12) * 23097) ^ 576746502;
                                            i14 = 1578294604;
                                            break;
                                    }
                                    return;
                                }
                            }

                            {
                                int i10 = -1236290734;
                                int i11 = C1977.f7413;
                                int i12 = C2871.f10837;
                                int iM11308 = (ThreadFactoryC3888.m11306("ܶܺ") + i11) * (-5);
                                int i13 = ((iM11308 ^ i12) * (-23985)) ^ 2029352542;
                                int i14 = 1758348694;
                                while (true) {
                                    i10 = ((((i10 ^ i12) * 10029) >> 31) & i13) ^ (iM11308 ^ i14);
                                    switch (i10) {
                                        case -2124875699:
                                        case -1168515189:
                                            C3743.m10966();
                                            CallableC1627.m5507();
                                            throw new RuntimeException();
                                        case -1939148932:
                                        case 219229966:
                                            if (RunnableC0195.f1321 >= 0) {
                                                iM11308 = (ThreadFactoryC3888.m11306("᩶֡") + i12) * (-41);
                                                i13 = ((iM11308 ^ i11) * 11455) ^ (-1893912242);
                                                i14 = -995008609;
                                            } else {
                                                iM11308 = (ThreadFactoryC3888.m11306("֫ۖ") ^ i12) * 69;
                                                i13 = ((iM11308 ^ i11) * (-12389)) ^ (-69140635);
                                                i14 = -586250394;
                                            }
                                            break;
                                        case -1934664574:
                                        case -818701079:
                                            C1025.m3861();
                                            if (C10634.f36300 < 0) {
                                                iM11308 = (ThreadFactoryC3888.m11306("᩶֡") + i12) * (-41);
                                                i13 = ((iM11308 ^ i11) * 11455) ^ (-1893912242);
                                                i14 = -995008609;
                                            } else {
                                                iM11308 = (i11 - ThreadFactoryC3888.m11306("᩷۠")) * 89;
                                                i13 = ((iM11308 ^ i12) * (-22667)) ^ 1366537245;
                                                i14 = 59563726;
                                            }
                                            break;
                                        case -1816551570:
                                        case 229406827:
                                            RunnableC1606.m5473();
                                            C2249.m6915();
                                            iM11308 = (i11 - ThreadFactoryC3888.m11306("᩷۠")) * 89;
                                            i13 = ((iM11308 ^ i12) * (-22667)) ^ 1366537245;
                                            i14 = 59563726;
                                            break;
                                        case -1763137673:
                                        case 1927241103:
                                            if (C3743.f13569) {
                                                iM11308 = (C19806.m45029("۫ۤ") + i11) * (-31);
                                                i13 = ((iM11308 ^ i12) * (-16101)) ^ (-2001648449);
                                                i14 = 300206499;
                                            } else {
                                                iM11308 = ThreadFactoryC3888.m11306("ۜ֨") ^ i12;
                                                i13 = ((iM11308 ^ i11) * (-21947)) ^ 1961354047;
                                                i14 = 1046451266;
                                            }
                                            break;
                                        case -1427068154:
                                        case 951278988:
                                            if (CallableC1627.f6528) {
                                                iM11308 = (C19806.m45029("᩹ܺ") + i11) * (-99);
                                                i13 = ((iM11308 ^ i12) * (-8543)) ^ 300427807;
                                                i14 = 2057922088;
                                            } else {
                                                iM11308 = (ThreadFactoryC3888.m11306("᩶֡") + i12) * (-41);
                                                i13 = ((iM11308 ^ i11) * 11455) ^ (-1893912242);
                                                i14 = -995008609;
                                            }
                                            break;
                                        case -1289335522:
                                        case -385172358:
                                            if (RunnableC1895.f7152) {
                                                iM11308 = ThreadFactoryC3888.m11306("ᩳ֡") ^ i12;
                                                i13 = ((iM11308 ^ i11) * 12255) ^ (-802656720);
                                                i14 = 402882564;
                                            } else {
                                                iM11308 = (ThreadFactoryC3888.m11306("ۚ᩵") + i11) * (-57);
                                                i13 = ((iM11308 ^ i12) * (-18039)) ^ (-1169668587);
                                                i14 = -1886098951;
                                            }
                                            break;
                                        case -1244280064:
                                        case 361726248:
                                            if (C0216.f1393 == 0) {
                                                iM11308 = (ThreadFactoryC3888.m11306("ۚ᩵") + i11) * (-57);
                                                i13 = ((iM11308 ^ i12) * (-18039)) ^ (-1169668587);
                                                i14 = -1886098951;
                                            } else {
                                                iM11308 = ThreadFactoryC3888.m11306("ۜ֨") ^ i12;
                                                i13 = ((iM11308 ^ i11) * (-21947)) ^ 1961354047;
                                                i14 = 1046451266;
                                            }
                                            break;
                                        case -1040355190:
                                        case 13883038:
                                            if (C1189.m4368() <= 0) {
                                                iM11308 = (ThreadFactoryC3888.m11306("᩶֡") + i12) * (-41);
                                                i13 = ((iM11308 ^ i11) * 11455) ^ (-1893912242);
                                                i14 = -995008609;
                                            } else {
                                                iM11308 = C19806.m45029("᩶ܳ") ^ i11;
                                                i13 = ((iM11308 ^ i12) * 7501) ^ (-1036091914);
                                                i14 = 1634755586;
                                            }
                                            break;
                                        case -826314051:
                                        case -405622139:
                                            if (C0216.m1591() <= 0) {
                                                iM11308 = ThreadFactoryC3888.m11306("ۜ֨") ^ i12;
                                                i13 = ((iM11308 ^ i11) * (-21947)) ^ 1961354047;
                                                i14 = 1046451266;
                                            } else {
                                                iM11308 = (C19806.m45029("᩵ܶ") + i11) * 49;
                                                i13 = ((iM11308 ^ i12) * 29503) ^ (-1723773309);
                                                i14 = 9948875;
                                            }
                                            break;
                                        case -59131517:
                                        case 605248353:
                                            return;
                                        case 863421179:
                                        case 1844262716:
                                            if (C0216.f1393 != 0) {
                                                iM11308 = (ThreadFactoryC3888.m11306("ۚ᩵") + i11) * (-57);
                                                i13 = ((iM11308 ^ i12) * (-18039)) ^ (-1169668587);
                                                i14 = -1886098951;
                                            } else {
                                                iM11308 = (ThreadFactoryC3888.m11306("۫ܰ") + i12) * 47;
                                                i13 = ((iM11308 ^ i11) * (-13631)) ^ (-1411672210);
                                                i14 = -1489355514;
                                            }
                                            break;
                                        case 1010469849:
                                        case 1193783899:
                                            if (C0817.f3443) {
                                                iM11308 = (i12 - C19806.m45029("ۜۡ")) * (-47);
                                                i13 = ((iM11308 ^ i11) * (-10767)) ^ (-1317638661);
                                                i14 = 1422637112;
                                            } else {
                                                iM11308 = (ThreadFactoryC3888.m11306("᩶֡") + i12) * (-41);
                                                i13 = ((iM11308 ^ i11) * 11455) ^ (-1893912242);
                                                i14 = -995008609;
                                            }
                                            break;
                                        case 1206394156:
                                        case 2097554937:
                                            if (C0216.f1393 != 0) {
                                                iM11308 = (ThreadFactoryC3888.m11306("᩶֡") + i12) * (-41);
                                                i13 = ((iM11308 ^ i11) * 11455) ^ (-1893912242);
                                                i14 = -995008609;
                                            } else {
                                                iM11308 = (i11 - ThreadFactoryC3888.m11306("ܺ۬")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                i13 = ((iM11308 ^ i12) * (-8029)) ^ (-808582453);
                                                i14 = 386671859;
                                            }
                                            break;
                                        case 1647943392:
                                        case 1798001737:
                                            if (CallableC1627.m5507() != 0) {
                                                iM11308 = (C19806.m45029("ܽ᩵") + i12) * 55;
                                                i13 = ((iM11308 ^ i11) * 5723) ^ (-320971520);
                                                i14 = -1004786820;
                                            } else {
                                                iM11308 = (C19806.m45029("᩶᩵") ^ i12) * (-119);
                                                i13 = ((iM11308 ^ i11) * (-259)) ^ 1241506161;
                                                i14 = -185368790;
                                            }
                                            break;
                                        default:
                                            C1419.m4973();
                                            if (C2249.f8050 >= 0) {
                                                iM11308 = ThreadFactoryC3888.m11306("ۜ֨") ^ i12;
                                                i13 = ((iM11308 ^ i11) * (-21947)) ^ 1961354047;
                                                i14 = 1046451266;
                                            } else {
                                                iM11308 = (i11 - ThreadFactoryC3888.m11306("᩷۠")) * 89;
                                                i13 = ((iM11308 ^ i12) * (-22667)) ^ 1366537245;
                                                i14 = 59563726;
                                            }
                                            break;
                                    }
                                }
                            }
                        };
                        if (C3660.m10791() == 0) {
                            iM45029 = C19806.m45029("ܰۡ") ^ i6;
                            i7 = ((iM45029 ^ i5) * 29185) ^ 541776698;
                            i = 1912028214;
                            i9 = iM45029 ^ i;
                        } else {
                            iM11306 = C19806.m45029("ۛܿ") ^ i6;
                            i7 = ((iM11306 ^ i5) * (-16725)) ^ (-1218286982);
                            i8 = 2085522432;
                        }
                        break;
                    case -1288212570:
                    case 1171867865:
                        if (!C0797.f3386) {
                            iM45029 = C19806.m45029("ᩳۢ") ^ i6;
                            i7 = ((iM45029 ^ i5) * 9113) ^ 1616801469;
                            i = 622321780;
                            i9 = iM45029 ^ i;
                        } else {
                            iM11306 = C19806.m45029("֫ܽ") ^ i6;
                            i7 = ((iM11306 ^ i5) * (-24785)) ^ 2108979581;
                            i8 = -1822166143;
                        }
                        break;
                    case -1095158248:
                    case 2123410842:
                        i2 = (s * s) + 167883849;
                        if (C2704.m8255() <= 0) {
                            iM45029 = C19806.m45029("ۖۨ") ^ i5;
                            i7 = ((iM45029 ^ i6) * (-10917)) ^ 559564904;
                            i = -894536739;
                        } else {
                            iM45029 = C19806.m45029("ۧ۫") ^ i6;
                            i7 = ((iM45029 ^ i5) * 11413) ^ (-2094358042);
                            i = 2067789967;
                        }
                        i9 = iM45029 ^ i;
                        break;
                    case -582058040:
                    case 524305369:
                        C1460.m5050();
                        C0216.m1591();
                        iM11306 = C19806.m45029("ۛܿ") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-16725)) ^ (-1218286982);
                        i8 = 2085522432;
                        break;
                    case -498162053:
                    case 2145572238:
                        ThreadFactoryC3888.m11300();
                        RunnableC1895.m6170();
                        break;
                    case -448801324:
                    case 1515394339:
                        if ((s * 25914) - i2 > 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("᩶᩶") + i6) * (-11);
                            i7 = ((iM45029 ^ i5) * (-8773)) ^ 192804831;
                            i = 153093824;
                        } else {
                            iM45029 = C19806.m45029("֫ۧ") ^ i5;
                            i7 = ((iM45029 ^ i6) * (-2117)) ^ 1529656174;
                            i = 1938493484;
                        }
                        i9 = iM45029 ^ i;
                        break;
                    case -269014984:
                    case 1993792986:
                        if (!C19806.f63586) {
                            C2642.m8165(new Thread(new RunnableC21527(0, viewOnClickListenerC23604, interfaceC6627)));
                        }
                        iM11306 = C19806.m45029("ۛܿ") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-16725)) ^ (-1218286982);
                        i8 = 2085522432;
                        break;
                    case -237114940:
                    case 224638156:
                        C1025.m3861();
                        if (C2871.f10837 >= 0) {
                            iM11306 = C19806.m45029("ۛܿ") ^ i6;
                            i7 = ((iM11306 ^ i5) * (-16725)) ^ (-1218286982);
                            i8 = 2085522432;
                        }
                        iM45029 = C19806.m45029("ۖۨ") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-10917)) ^ 559564904;
                        i = -894536739;
                        i9 = iM45029 ^ i;
                        break;
                    case 560748303:
                    case 866664447:
                        if (ThreadFactoryC3888.f14547 <= 0) {
                            iM45029 = C19806.m45029("ۖۨ") ^ i5;
                            i7 = ((iM45029 ^ i6) * (-10917)) ^ 559564904;
                            i = -894536739;
                        } else {
                            iM45029 = (C19806.m45029("֨᩹") + i6) * 33;
                            i7 = ((iM45029 ^ i5) * 15467) ^ (-239757864);
                            i = -862392665;
                        }
                        i9 = iM45029 ^ i;
                        break;
                    case 581744507:
                    case 1022442571:
                        i3 = 35306;
                        iM45029 = (ThreadFactoryC3888.m11306("֫᩶") ^ i6) * (-45);
                        i7 = ((iM45029 ^ i5) * (-29677)) ^ (-857015629);
                        i = 1074610355;
                        i9 = iM45029 ^ i;
                        break;
                    case 1035719006:
                    case 1767519781:
                        break;
                    default:
                        C1398.m4895();
                        if (C1398.f5802 <= 0) {
                            iM11306 = C19806.m45029("֫ܽ") ^ i6;
                            i7 = ((iM11306 ^ i5) * (-24785)) ^ 2108979581;
                            i8 = -1822166143;
                        }
                        iM45029 = C19806.m45029("ۖۨ") ^ i5;
                        i7 = ((iM45029 ^ i6) * (-10917)) ^ 559564904;
                        i = -894536739;
                        i9 = iM45029 ^ i;
                        break;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52048(DialogInterfaceC19356 dialogInterfaceC19356, ViewOnClickListenerC23604 viewOnClickListenerC23604) {
        C1668.m5572(dialogInterfaceC19356);
        viewOnClickListenerC23604.m52067();
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01fb A[PHI: r4 r16 r17 r18
      0x01fb: PHI (r4v5 java.lang.String) = (r4v4 java.lang.String), (r4v2 java.lang.String) binds: [B:54:0x01e2, B:39:0x0140] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r16v15 int) = (r16v11 int), (r16v16 int) binds: [B:54:0x01e2, B:39:0x0140] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r17v14 short[]) = (r17v10 short[]), (r17v15 short[]) binds: [B:54:0x01e2, B:39:0x0140] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r18v15 char) = (r18v11 char), (r18v16 char) binds: [B:54:0x01e2, B:39:0x0140] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x024e A[PHI: r3 r16 r17 r18
      0x024e: PHI (r3v12 boolean) = (r3v6 boolean), (r3v2 boolean), (r3v2 boolean) binds: [B:63:0x024d, B:58:0x021e, B:35:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r16v17 int) = (r16v9 int), (r16v10 int), (r16v18 int) binds: [B:63:0x024d, B:58:0x021e, B:35:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r17v16 short[]) = (r17v8 short[]), (r17v9 short[]), (r17v17 short[]) binds: [B:63:0x024d, B:58:0x021e, B:35:0x010d] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r18v17 char) = (r18v9 char), (r18v10 char), (r18v18 char) binds: [B:63:0x024d, B:58:0x021e, B:35:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        if (l.RunnableC3388.m10064() == false) goto L15;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m52041(android.widget.EditText r19, android.widget.EditText r20, l.DialogInterfaceC19356 r21, l.ViewOnClickListenerC23604 r22, com.google.android.material.textfield.TextInputLayout r23, com.google.android.material.textfield.TextInputLayout r24) {
        /*
            Method dump skipped, instruction units count: 1180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC23604.m52041(android.widget.EditText, android.widget.EditText, l.᩵ۡۜ, l.᩻ۡ᩺, com.google.android.material.textfield.TextInputLayout, com.google.android.material.textfield.TextInputLayout):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52047(C17485 c17485, ViewOnClickListenerC23604 viewOnClickListenerC23604, C1313 c1313) throws Throwable {
        int iM11306;
        int i;
        int i2;
        short[] sArr;
        int iM11307;
        int i3;
        int i4;
        int iM11308;
        int i5;
        ViewOnClickListenerC23604 viewOnClickListenerC23605 = viewOnClickListenerC23604;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1008371982;
        int i9 = C3535.f13026;
        int i10 = C0629.f2722;
        int iM45029 = (i10 - C19806.m45029("۬ۖ")) * (-125);
        int i11 = ((iM45029 ^ i9) * (-16731)) ^ (-1376503952);
        int i12 = iM45029 ^ (-1250115640);
        String strM4365 = null;
        TextView textView = null;
        String strM8240 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int iM11309 = 0;
        String strM10901 = null;
        int iM113010 = 0;
        short s = 0;
        Map mapM5684 = null;
        TextView textView2 = null;
        String strM6105 = null;
        int i13 = 0;
        int i14 = 0;
        String strM8241 = null;
        Throwable th = null;
        boolean zContainsKey = false;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i9) * 14277) >> 31));
            switch (i8) {
                case -2118557984:
                case 888974246:
                    C2871.m8646();
                    return;
                case -2115756281:
                case -976796211:
                    sArr3 = sArr3;
                    strM10901 = strM10901;
                    if ((i7 + 194993296) - i6 >= 0) {
                        iM11307 = (i10 - ThreadFactoryC3888.m11306("ۚۛ")) * (-101);
                        i = ((iM11307 ^ i9) * (-5503)) ^ (-1469895807);
                        i3 = -476702332;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ۢ֡") ^ i10) * 63;
                        i = ((iM11307 ^ i9) * 29295) ^ (-2131373822);
                        i3 = -1739232653;
                    }
                    int i15 = iM11307 ^ i3;
                    strM10901 = strM10901;
                    sArr3 = sArr3;
                    viewOnClickListenerC23605 = viewOnClickListenerC23604;
                    i12 = i15;
                    i11 = i;
                    break;
                case -2095372170:
                case -1255203041:
                    C1398.m4902(strM8241);
                    throw th;
                case -2033398939:
                case -461188272:
                    sArr3 = sArr3;
                    strM10901 = strM10901;
                    CallableC1627.m5508(c1313, strM10901);
                    C3286.m9795(c17485);
                    if (RunnableC1564.m5342(c1313)) {
                        iM11307 = ThreadFactoryC3888.m11306("֫۬") ^ i10;
                        i = ((iM11307 ^ i9) * 14489) ^ 1015791015;
                        i3 = -1408893967;
                    } else {
                        iM11307 = (C19806.m45029("᩵ۗ") + i10) * 95;
                        i = ((iM11307 ^ i9) * (-2517)) ^ 1454999422;
                        i3 = -793177284;
                    }
                    int i16 = iM11307 ^ i3;
                    strM10901 = strM10901;
                    sArr3 = sArr3;
                    viewOnClickListenerC23605 = viewOnClickListenerC23604;
                    i12 = i16;
                    i11 = i;
                    break;
                case -1976357374:
                case 730712392:
                    MenuItemOnMenuItemClickListenerC3244.m9704(textView, (CharSequence) mapM5684.get(strM4365));
                    return;
                case -1846059371:
                case 1106225461:
                    C1398.m4902(strM8241);
                    throw th;
                case -1701794805:
                case -100627699:
                    textView2 = viewOnClickListenerC23605.f76465;
                    if (textView2 != null) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰܺ") ^ i9;
                        i = ((iM11306 ^ i10) * (-23969)) ^ 1646322246;
                        i2 = -1646504805;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨܽ") ^ i10;
                        i = ((iM11306 ^ i9) * (-20899)) ^ 574452534;
                        i2 = 1384162468;
                    }
                    i12 = iM11306 ^ i2;
                    i11 = i;
                    break;
                case -1634278695:
                case -1083531884:
                    strM8240 = C2704.m8240(f76464, 132, 3, i13);
                    if (ViewGroupOnHierarchyChangeListenerC1916.m6233() == 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۬ܿ") ^ i9;
                        i = ((iM11306 ^ i10) * 20009) ^ (-1324008925);
                        i2 = 1025573782;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                    } else {
                        sArr = sArr3;
                        iM11308 = (C19806.m45029("۠ۖ") ^ i9) * 71;
                        i11 = ((iM11308 ^ i10) * (-22727)) ^ (-249113904);
                        i5 = 747407757;
                        i4 = iM11308 ^ i5;
                        sArr3 = sArr;
                        i12 = i4;
                        viewOnClickListenerC23605 = viewOnClickListenerC23604;
                    }
                    break;
                case -1581899960:
                case -260956216:
                    C1189.m4360(iM11309 ^ i14);
                    mapM5684 = C1709.m5684();
                    sArr3 = f76464;
                    if (C3722.f13525 > 0) {
                        iM11306 = C19806.m45029("֡ۤ") ^ i10;
                        i = ((iM11306 ^ i9) * (-27027)) ^ 1471297019;
                        i2 = -1069244198;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                    } else {
                        sArr = sArr3;
                        iM11308 = (C19806.m45029("۠ۖ") ^ i9) * 71;
                        i11 = ((iM11308 ^ i10) * (-22727)) ^ (-249113904);
                        i5 = 747407757;
                        i4 = iM11308 ^ i5;
                        sArr3 = sArr;
                        i12 = i4;
                        viewOnClickListenerC23605 = viewOnClickListenerC23604;
                    }
                    break;
                case -1230030123:
                case -797703398:
                    i13 = 60550;
                    iM11307 = ThreadFactoryC3888.m11306("֨ܰ") ^ i9;
                    i = ((iM11307 ^ i10) * 7351) ^ (-1826807463);
                    i3 = -1308071731;
                    int i17 = iM11307 ^ i3;
                    strM10901 = strM10901;
                    sArr3 = sArr3;
                    viewOnClickListenerC23605 = viewOnClickListenerC23604;
                    i12 = i17;
                    i11 = i;
                    break;
                case -1183124514:
                case -752106115:
                    strM4365 = C1189.m4365(sArr3, 135, 2, i13);
                    zContainsKey = mapM5684.containsKey(strM4365);
                    th = null;
                    if (C1148.f5161 > 0) {
                        iM11306 = C19806.m45029("ᩳ᩹") ^ i9;
                        i = ((iM11306 ^ i10) * (-14587)) ^ 1529248314;
                        i2 = -1785939552;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                    } else {
                        sArr = sArr3;
                        iM11308 = (ThreadFactoryC3888.m11306("ܽ֫") + i9) * 119;
                        i11 = ((iM11308 ^ i10) * (-10407)) ^ 1003010893;
                        i5 = -373263939;
                        i4 = iM11308 ^ i5;
                        sArr3 = sArr;
                        i12 = i4;
                        viewOnClickListenerC23605 = viewOnClickListenerC23604;
                    }
                    break;
                case -1142106094:
                case 1236344961:
                    if (C1937.f7317 >= 0) {
                        sArr = sArr3;
                        iM11308 = C19806.m45029("֨ᩳ") ^ i10;
                        i11 = ((iM11308 ^ i9) * (-501)) ^ (-2101452228);
                        i5 = -512724988;
                        i4 = iM11308 ^ i5;
                        sArr3 = sArr;
                        i12 = i4;
                        viewOnClickListenerC23605 = viewOnClickListenerC23604;
                    } else {
                        iM11306 = (C19806.m45029("᩵ۢ") ^ i9) * 81;
                        i = ((iM11306 ^ i10) * 5851) ^ 41916852;
                        i2 = 1646892820;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                    }
                    break;
                case -1127105785:
                case 1605393815:
                    sArr = sArr3;
                    String str = strM10901;
                    short s2 = s;
                    int i18 = s2 * 27928;
                    i7 = s2 * s2;
                    if (C0526.f2219) {
                        strM10901 = str;
                        s = s2;
                        i6 = i18;
                        iM11308 = C19806.m45029("֨ᩳ") ^ i10;
                        i11 = ((iM11308 ^ i9) * (-501)) ^ (-2101452228);
                        i5 = -512724988;
                        i4 = iM11308 ^ i5;
                        sArr3 = sArr;
                        i12 = i4;
                        viewOnClickListenerC23605 = viewOnClickListenerC23604;
                    } else {
                        int iM450210 = (C19806.m45029("۬۬") + i9) * 101;
                        strM10901 = str;
                        s = s2;
                        sArr3 = sArr;
                        i11 = ((iM450210 ^ i10) * (-27123)) ^ 2009392569;
                        i12 = iM450210 ^ 1378550972;
                        viewOnClickListenerC23605 = viewOnClickListenerC23604;
                        i6 = i18;
                    }
                    break;
                case -1077237422:
                case -898642983:
                    strM8241 = C2704.m8240(f76464, 137, 6, i13);
                    if (zContainsKey) {
                        iM11306 = (C19806.m45029("ᩴۧ") ^ i10) * (-103);
                        i = ((iM11306 ^ i9) * 14877) ^ 1156017656;
                        i2 = 2112218498;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩶۬") ^ i9;
                        i = ((iM11306 ^ i10) * 4995) ^ (-1064750527);
                        i2 = -982275294;
                    }
                    i12 = iM11306 ^ i2;
                    i11 = i;
                    break;
                case -1036218738:
                case 1124084039:
                    strM6105 = C1875.m6105(f76464, 143, 3, i13);
                    if (C2642.f10294 > 0) {
                        iM11306 = C19806.m45029("ۢܺ") ^ i9;
                        i = ((iM11306 ^ i10) * (-2561)) ^ 269988863;
                        i2 = 214777336;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                    } else {
                        sArr = sArr3;
                        iM11308 = (C19806.m45029("۠ۖ") ^ i9) * 71;
                        i11 = ((iM11308 ^ i10) * (-22727)) ^ (-249113904);
                        i5 = 747407757;
                        i4 = iM11308 ^ i5;
                        sArr3 = sArr;
                        i12 = i4;
                        viewOnClickListenerC23605 = viewOnClickListenerC23604;
                    }
                    break;
                case -429760817:
                case -418886330:
                    sArr = sArr3;
                    iM113010 = ThreadFactoryC3888.m11306(C1875.m6105(f76464, 129, 3, i13));
                    if (RunnableC0195.m1431()) {
                        iM11308 = C19806.m45029("ܿۡ") ^ i9;
                        i11 = ((iM11308 ^ i10) * 9623) ^ (-1667729823);
                        i5 = 1013772993;
                    } else {
                        iM11308 = (C19806.m45029("۠ۖ") ^ i9) * 71;
                        i11 = ((iM11308 ^ i10) * (-22727)) ^ (-249113904);
                        i5 = 747407757;
                    }
                    i4 = iM11308 ^ i5;
                    sArr3 = sArr;
                    i12 = i4;
                    viewOnClickListenerC23605 = viewOnClickListenerC23604;
                    break;
                case -303504806:
                case 380593750:
                    sArr = sArr3;
                    strM10901 = C3722.m10901(f76464, UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 8, i13);
                    if (C3660.f13403 >= 0) {
                        iM11308 = (ThreadFactoryC3888.m11306("ܽ֫") + i9) * 119;
                        i11 = ((iM11308 ^ i10) * (-10407)) ^ 1003010893;
                        i5 = -373263939;
                    } else {
                        iM11308 = (ThreadFactoryC3888.m11306("ۜ֡") ^ i9) * (-69);
                        i11 = ((iM11308 ^ i10) * 11961) ^ 1507159327;
                        i5 = -857523474;
                    }
                    i4 = iM11308 ^ i5;
                    sArr3 = sArr;
                    i12 = i4;
                    viewOnClickListenerC23605 = viewOnClickListenerC23604;
                    break;
                case -232822517:
                case 1534950535:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (C3743.m10966() <= 0) {
                        sArr = sArr3;
                        iM11308 = (ThreadFactoryC3888.m11306("ܽ֫") + i9) * 119;
                        i11 = ((iM11308 ^ i10) * (-10407)) ^ 1003010893;
                        i5 = -373263939;
                        i4 = iM11308 ^ i5;
                        sArr3 = sArr;
                        i12 = i4;
                        viewOnClickListenerC23605 = viewOnClickListenerC23604;
                    } else {
                        iM11306 = (C19806.m45029("᩵ۢ") ^ i9) * 81;
                        i = ((iM11306 ^ i10) * 5851) ^ 41916852;
                        i2 = 1646892820;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                    }
                    break;
                case -103197326:
                case 1876854620:
                    C0278.m1789();
                    C1066.m4023();
                    iM11306 = (C19806.m45029("᩵ۢ") ^ i9) * 81;
                    i = ((iM11306 ^ i10) * 5851) ^ 41916852;
                    i2 = 1646892820;
                    i12 = iM11306 ^ i2;
                    i11 = i;
                    break;
                case -36161469:
                case 934253254:
                    sArr = sArr3;
                    short s3 = s;
                    sArr2 = f76464;
                    if (RunnableC0195.f1321 >= 0) {
                        s = s3;
                        iM11308 = C19806.m45029("֨ᩳ") ^ i10;
                        i11 = ((iM11308 ^ i9) * (-501)) ^ (-2101452228);
                        i5 = -512724988;
                        i4 = iM11308 ^ i5;
                    } else {
                        int iM450211 = (C19806.m45029("ۛܽ") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        int i19 = ((iM450211 ^ i10) * (-5447)) ^ (-106165201);
                        i4 = iM450211 ^ (-994454818);
                        s = s3;
                        i11 = i19;
                    }
                    sArr3 = sArr;
                    i12 = i4;
                    viewOnClickListenerC23605 = viewOnClickListenerC23604;
                    break;
                case 533897522:
                case 1342631670:
                    i13 = 65104;
                    iM11307 = ThreadFactoryC3888.m11306("֨ܰ") ^ i9;
                    i = ((iM11307 ^ i10) * 7351) ^ (-1826807463);
                    i3 = -1308071731;
                    int i110 = iM11307 ^ i3;
                    strM10901 = strM10901;
                    sArr3 = sArr3;
                    viewOnClickListenerC23605 = viewOnClickListenerC23604;
                    i12 = i110;
                    i11 = i;
                    break;
                case 706203970:
                case 1670130012:
                    C2704.m8256(C0526.m2431(c1313, iM113010 ^ 2102140370));
                    return;
                case 806064689:
                case 1656873562:
                    iM11309 = ThreadFactoryC3888.m11306(strM8240);
                    i14 = 2116799571;
                    if (C2788.m8472() == 0) {
                        iM11306 = C19806.m45029("۬ܰ") ^ i10;
                        i = ((iM11306 ^ i9) * 24703) ^ (-55509279);
                        i2 = -484633912;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                    } else {
                        sArr = sArr3;
                        iM11308 = (ThreadFactoryC3888.m11306("ܽ֫") + i9) * 119;
                        i11 = ((iM11308 ^ i10) * (-10407)) ^ 1003010893;
                        i5 = -373263939;
                        i4 = iM11308 ^ i5;
                        sArr3 = sArr;
                        i12 = i4;
                        viewOnClickListenerC23605 = viewOnClickListenerC23604;
                    }
                    break;
                case 1395514751:
                case 1488215869:
                    ThreadFactoryC3888.m11303(textView2, ThreadFactoryC3888.m11306(strM6105) ^ 2116803822);
                    return;
                case 1472502581:
                case 1512980461:
                    sArr = sArr3;
                    s = sArr2[120];
                    if (C1460.f5948 >= 0) {
                        iM11308 = C19806.m45029("֨ᩳ") ^ i10;
                        i11 = ((iM11308 ^ i9) * (-501)) ^ (-2101452228);
                        i5 = -512724988;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("۬ۙ") ^ i10;
                        i11 = ((iM11308 ^ i9) * (-22365)) ^ 1702359154;
                        i5 = 1289703486;
                    }
                    i4 = iM11308 ^ i5;
                    sArr3 = sArr;
                    i12 = i4;
                    viewOnClickListenerC23605 = viewOnClickListenerC23604;
                    break;
                case 2019988310:
                case 2101789516:
                    if (C3286.f12186) {
                        iM11306 = (C19806.m45029("᩵ۢ") ^ i9) * 81;
                        i = ((iM11306 ^ i10) * 5851) ^ 41916852;
                        i2 = 1646892820;
                    } else {
                        iM11306 = (C19806.m45029("᩸۫") ^ i10) * 29;
                        i = ((iM11306 ^ i9) * 24357) ^ (-474526566);
                        i2 = 1552430311;
                    }
                    i12 = iM11306 ^ i2;
                    i11 = i;
                    break;
                default:
                    textView = viewOnClickListenerC23605.f76465;
                    if (textView != null) {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ܰ") ^ i10;
                        i = ((iM11306 ^ i9) * 9637) ^ 290373004;
                        i2 = 954279321;
                    } else {
                        iM11306 = C19806.m45029("᩸ۡ") ^ i10;
                        i = ((iM11306 ^ i9) * 9727) ^ (-1388076249);
                        i2 = -1505495886;
                    }
                    i12 = iM11306 ^ i2;
                    i11 = i;
                    break;
            }
        }
    }
}
