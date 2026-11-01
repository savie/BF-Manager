package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.HashMap;
import java.util.Locale;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩹᩻ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4YO */
/* JADX INFO: loaded from: classes.dex */
public final class C22618 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractActivityC12483 f73702;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AbstractC17131 f73703;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC17295 f73704;

    /* JADX INFO: renamed from: ۟֡᩸, reason: not valid java name and contains not printable characters */
    private static final short[] f73701 = {2212, 23689, 16681, -24414, 28711, 20939, 20051, 30004, 32584, 21146, -18172, -17324, -17792, 17598, -20135, 21974, 17510, 22497, 29208, -24561, 31249, -21969, -19389, -21627, 24504, 19212, 21478, -23663, 17466, -17987, 31402, 20474, -17998, -17379, 25344, 30287, -18075, 21545, 21928, 30940, 19199, -21862, 21754, -22123, 21454, 23652, -17362, 22556, 18663, 23181, 17595, -18297, 30246, 17102, 28689, 17279, 19193, -19044, 11510, 11517, 22826, 32059, 22558};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final HashMap f73700 = new HashMap();

    public C22618(AbstractActivityC12483 abstractActivityC12483, InterfaceC17295 interfaceC17295) {
        int i = -110519170;
        int i2 = C0050.f912;
        int i3 = C2642.f10294;
        int iM11306 = (ThreadFactoryC3888.m11306("ۛۧ") + i2) * 19;
        int i4 = ((iM11306 ^ i3) * 7175) ^ (-1105471475);
        int i5 = -1429399465;
        while (true) {
            i = ((((i ^ i3) * (-25051)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2115388180:
                case 1451668092:
                    RunnableC1606.m5473();
                    if (C3535.f13026 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ᩻") ^ i3;
                        i4 = ((iM11306 ^ i2) * 17913) ^ 1379407041;
                        i5 = 321969000;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֡ۤ") + i2) * 5;
                        i4 = ((iM11306 ^ i3) * 13481) ^ 1290205366;
                        i5 = -1603637047;
                    }
                    break;
                case -1814774608:
                case 442472513:
                    if (C0278.f1572 <= 0) {
                        iM11306 = C19806.m45029("ܿ֫") ^ i2;
                        i4 = ((iM11306 ^ i3) * 18015) ^ (-1588011301);
                        i5 = 447532499;
                    } else {
                        iM11306 = (C19806.m45029("ᩳۖ") + i2) * (-5);
                        i4 = ((iM11306 ^ i3) * (-5235)) ^ (-1275034589);
                        i5 = 1478775129;
                    }
                    break;
                case -1487520522:
                case -228793713:
                    if (C0526.f2219) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ᩻") ^ i3;
                        i4 = ((iM11306 ^ i2) * 17913) ^ 1379407041;
                        i5 = 321969000;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֡ܺ") ^ i3) * 115;
                        i4 = ((iM11306 ^ i2) * (-827)) ^ (-1374731156);
                        i5 = 768325228;
                    }
                    break;
                case -1476865477:
                case -369661917:
                    C2249.m6915();
                    if (C1398.f5802 <= 0) {
                        iM11306 = C19806.m45029("ܿ֫") ^ i2;
                        i4 = ((iM11306 ^ i3) * 18015) ^ (-1588011301);
                        i5 = 447532499;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ᩻") ^ i3;
                        i4 = ((iM11306 ^ i2) * 17913) ^ 1379407041;
                        i5 = 321969000;
                    }
                    break;
                case -1246370970:
                case -280079480:
                    if (C0962.f3784) {
                        iM11306 = (ThreadFactoryC3888.m11306("֡ۤ") + i2) * 5;
                        i4 = ((iM11306 ^ i3) * 13481) ^ 1290205366;
                        i5 = -1603637047;
                    } else {
                        iM11306 = C19806.m45029("᩵᩶") ^ i2;
                        i4 = ((iM11306 ^ i3) * 11875) ^ (-1747157736);
                        i5 = -618187370;
                    }
                    break;
                case -1068889323:
                case 1324176366:
                    if (C3286.m9798() <= 0) {
                        iM11306 = C19806.m45029("ܿ֫") ^ i2;
                        i4 = ((iM11306 ^ i3) * 18015) ^ (-1588011301);
                        i5 = 447532499;
                    } else {
                        iM11306 = C19806.m45029("᩷᩻") ^ i2;
                        i4 = ((iM11306 ^ i3) * 22463) ^ 337366797;
                        i5 = 160834101;
                    }
                    break;
                case -977404891:
                case -592249705:
                    C1066.m4023();
                    C19806.m45024();
                    throw new RuntimeException();
                case -616658533:
                case -29989088:
                    if (C3660.f13403 >= 0) {
                        iM11306 = C19806.m45029("ܿ֫") ^ i2;
                        i4 = ((iM11306 ^ i3) * 18015) ^ (-1588011301);
                        i5 = 447532499;
                    } else {
                        iM11306 = C19806.m45029("ۧ۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 1659) ^ 123691169;
                        i5 = -254413482;
                    }
                    break;
                case -137629829:
                case 523600309:
                    if (C1377.f5749) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۘ") + i3) * 37;
                        i4 = ((iM11306 ^ i2) * 2997) ^ 2135089944;
                        i5 = -1999804996;
                    } else {
                        iM11306 = C19806.m45029("ۡ۟") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-28615)) ^ 1486854487;
                        i5 = -1201441761;
                    }
                    break;
                case 199376007:
                case 425016175:
                    if (C2788.f10625 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۢ᩻") ^ i3;
                        i4 = ((iM11306 ^ i2) * 17913) ^ 1379407041;
                        i5 = 321969000;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩶۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * 22209) ^ (-1609332457);
                        i5 = 46461240;
                    }
                    break;
                case 212553355:
                case 1105458762:
                    C2332.m7079();
                    if (C1460.m5050() == 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֡ۤ") + i2) * 5;
                        i4 = ((iM11306 ^ i3) * 13481) ^ 1290205366;
                        i5 = -1603637047;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֨ۘ") ^ i3) * 81;
                        i4 = ((iM11306 ^ i2) * 11333) ^ 896175216;
                        i5 = 1607383406;
                    }
                    break;
                case 234138762:
                case 1761319126:
                    this.f73702 = abstractActivityC12483;
                    if (C19806.f63586) {
                        iM11306 = C19806.m45029("ۡ۟") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-28615)) ^ 1486854487;
                        i5 = -1201441761;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܶ֫") ^ i3) * (-45);
                        i4 = ((iM11306 ^ i2) * (-11893)) ^ (-1721863461);
                        i5 = -495864083;
                    }
                    break;
                case 754584089:
                case 1602565700:
                    C10634.m26820();
                    iM11306 = (ThreadFactoryC3888.m11306("֡ۤ") + i2) * 5;
                    i4 = ((iM11306 ^ i3) * 13481) ^ 1290205366;
                    i5 = -1603637047;
                    break;
                case 791321325:
                case 1905878943:
                    this.f73704 = interfaceC17295;
                    return;
                case 1170208050:
                case 2055913916:
                    if (C0817.f3443) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺۜ") ^ i3) * 51;
                        i4 = ((iM11306 ^ i2) * (-20269)) ^ (-1873944893);
                        i5 = 1033459863;
                    } else {
                        iM11306 = C19806.m45029("ۡ۟") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-28615)) ^ 1486854487;
                        i5 = -1201441761;
                    }
                    break;
                default:
                    if (C1668.m5583()) {
                        iM11306 = (i2 - C19806.m45029("ۙ֡")) * (-101);
                        i4 = ((iM11306 ^ i3) * 28289) ^ 1324169530;
                        i5 = 31171446;
                    } else {
                        iM11306 = C19806.m45029("ܿ֫") ^ i2;
                        i4 = ((iM11306 ^ i3) * 18015) ^ (-1588011301);
                        i5 = 447532499;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50140(AbstractC17131 abstractC17131) {
        this.f73703 = abstractC17131;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50139() {
        short[] sArr;
        int iM11306;
        int i;
        int i2;
        TextInputLayout textInputLayout;
        TextInputLayout textInputLayout2;
        TextInputLayout textInputLayout3;
        EditText editText;
        short[] sArr2;
        short[] sArr3;
        TextInputLayout textInputLayout4;
        ViewOnClickListenerC8972 viewOnClickListenerC8972;
        short[] sArr4;
        short[] sArr5;
        int i3;
        TextInputLayout textInputLayout5;
        TextInputLayout textInputLayout6;
        TextInputLayout textInputLayout7;
        EditText editText2;
        C8067 c8067;
        short[] sArr6;
        int i4;
        int i5;
        ViewOnClickListenerC8972 viewOnClickListenerC8973;
        TextInputLayout textInputLayout8;
        int iM45029;
        int i6;
        int i7;
        int iM450210;
        int i8;
        int i9;
        int iM450211;
        int i10;
        int i11;
        TextInputLayout textInputLayout9;
        TextInputLayout textInputLayout10;
        TextInputLayout textInputLayout11;
        TextInputLayout textInputLayout12;
        View view;
        View view2;
        TextView textView;
        EditText editText3;
        C8067 c8068;
        short[] sArr7;
        int i12;
        int i13;
        TextInputLayout textInputLayout13;
        TextInputLayout textInputLayout14;
        RadioButton radioButton;
        ViewOnClickListenerC8972 viewOnClickListenerC8974;
        short[] sArr8;
        C12562 c12562;
        int iM450212;
        C12562 c12563;
        int i14;
        int i15;
        final TextInputLayout textInputLayout15 = null;
        final TextInputLayout textInputLayout16 = null;
        final TextInputLayout textInputLayout17 = null;
        DialogInterfaceC19356 dialogInterfaceC19356M10334 = null;
        View viewM10957 = null;
        TextView textView2 = null;
        int iM11307 = 0;
        int i16 = 0;
        int i17 = -80556612;
        int i18 = C2788.f10625;
        int i19 = AbstractC0464.f2088;
        int iM11308 = ThreadFactoryC3888.m11306("ۛܶ") ^ i18;
        int i20 = ((iM11308 ^ i19) * 23137) ^ 1031082412;
        int i21 = iM11308 ^ (-326899254);
        EditText editTextM5346 = null;
        ViewOnClickListenerC8972 viewOnClickListenerC8975 = null;
        C8067 c8069 = null;
        EditText editText4 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        short[] sArr12 = null;
        short[] sArr13 = null;
        short[] sArr14 = null;
        short[] sArr15 = null;
        short[] sArr16 = null;
        short[] sArr17 = null;
        short[] sArr18 = null;
        short[] sArr19 = null;
        short[] sArr20 = null;
        AbstractActivityC12483 abstractActivityC12483 = null;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        View view3 = null;
        C12562 c12564 = null;
        View view4 = null;
        final TextInputLayout textInputLayout18 = null;
        RadioButton radioButton2 = null;
        String str = null;
        final TextInputLayout textInputLayout19 = null;
        final TextInputLayout textInputLayout20 = null;
        final TextInputLayout textInputLayout21 = null;
        final TextInputLayout textInputLayout22 = null;
        final TextInputLayout textInputLayout23 = null;
        final TextInputLayout textInputLayout24 = null;
        final RadioButton radioButton3 = null;
        int i26 = 0;
        while (true) {
            i17 = i21 ^ (i20 & (((i17 ^ i19) * 30017) >> 31));
            switch (i17) {
                case -2052661487:
                case 1935109147:
                    textInputLayout24 = textInputLayout24;
                    textInputLayout22 = textInputLayout22;
                    view3 = view3;
                    c12564 = c12564;
                    editTextM5346 = editTextM5346;
                    c8069 = c8069;
                    sArr20 = sArr20;
                    i24 = i24;
                    i25 = i25;
                    textInputLayout23 = textInputLayout23;
                    textInputLayout20 = textInputLayout20;
                    radioButton2 = radioButton2;
                    view4 = view4;
                    textView2 = textView2;
                    viewOnClickListenerC8975 = viewOnClickListenerC8975;
                    textInputLayout21 = textInputLayout21;
                    sArr18 = sArr18;
                    textInputLayout15 = textInputLayout15;
                    textInputLayout16 = textInputLayout16;
                    short[] sArr21 = sArr16;
                    TextInputLayout textInputLayout25 = (TextInputLayout) C3743.m10957(view3, C19806.m45029(C1977.m6363(sArr21, 28, 3, i26)) ^ 2123426864);
                    sArr17 = f73701;
                    if (AbstractC0464.f2088 <= 0) {
                        textInputLayout19 = textInputLayout25;
                        sArr16 = sArr21;
                        sArr = sArr9;
                        i22 = i22;
                        sArr13 = sArr13;
                        i23 = i23;
                        sArr15 = sArr15;
                        int iM450213 = (C19806.m45029("ۜ᩸") + i18) * (-127);
                        i21 = iM450213 ^ (-2107438474);
                        sArr9 = sArr;
                        i20 = ((iM450213 ^ i19) * 6241) ^ (-448135367);
                        sArr18 = sArr18;
                        c8069 = c8069;
                        viewOnClickListenerC8975 = viewOnClickListenerC8975;
                        textInputLayout21 = textInputLayout21;
                        i24 = i24;
                        sArr20 = sArr20;
                        i25 = i25;
                        textInputLayout19 = textInputLayout19;
                        editTextM5346 = editTextM5346;
                        textInputLayout15 = textInputLayout15;
                        textInputLayout16 = textInputLayout16;
                        sArr16 = sArr16;
                        sArr15 = sArr15;
                        sArr13 = sArr13;
                        i23 = i23;
                        i22 = i22;
                    } else {
                        int iM450214 = C19806.m45029("ۛᩴ") ^ i19;
                        i21 = iM450214 ^ 1082676574;
                        i20 = ((iM450214 ^ i18) * (-26565)) ^ 1658451648;
                        sArr16 = sArr21;
                        sArr18 = sArr18;
                        c8069 = c8069;
                        viewOnClickListenerC8975 = viewOnClickListenerC8975;
                        textInputLayout21 = textInputLayout21;
                        i24 = i24;
                        sArr20 = sArr20;
                        i25 = i25;
                        textInputLayout19 = textInputLayout25;
                        editTextM5346 = editTextM5346;
                        textInputLayout15 = textInputLayout15;
                        textInputLayout16 = textInputLayout16;
                    }
                    radioButton2 = radioButton2;
                    textInputLayout20 = textInputLayout20;
                    textView2 = textView2;
                    view4 = view4;
                    view3 = view3;
                    textInputLayout23 = textInputLayout23;
                    textInputLayout22 = textInputLayout22;
                    c12564 = c12564;
                    textInputLayout24 = textInputLayout24;
                    break;
                case -2024780744:
                case -960059762:
                    i26 = 11434;
                    iM11306 = (i19 - C19806.m45029("֡ۛ")) * 77;
                    i = ((iM11306 ^ i18) * (-14405)) ^ (-174556663);
                    i2 = -154256041;
                    i21 = iM11306 ^ i2;
                    i20 = i;
                    sArr9 = sArr9;
                    sArr10 = sArr10;
                    sArr18 = sArr18;
                    c8069 = c8069;
                    viewOnClickListenerC8975 = viewOnClickListenerC8975;
                    textInputLayout21 = textInputLayout21;
                    i24 = i24;
                    sArr20 = sArr20;
                    i25 = i25;
                    textInputLayout19 = textInputLayout19;
                    editTextM5346 = editTextM5346;
                    textInputLayout15 = textInputLayout15;
                    textInputLayout16 = textInputLayout16;
                    sArr16 = sArr16;
                    sArr15 = sArr15;
                    sArr13 = sArr13;
                    i23 = i23;
                    i22 = i22;
                    radioButton2 = radioButton2;
                    textInputLayout20 = textInputLayout20;
                    textView2 = textView2;
                    view4 = view4;
                    view3 = view3;
                    textInputLayout23 = textInputLayout23;
                    textInputLayout22 = textInputLayout22;
                    c12564 = c12564;
                    textInputLayout24 = textInputLayout24;
                    break;
                case -1952604873:
                case -364112746:
                    textInputLayout15 = textInputLayout15;
                    textInputLayout16 = textInputLayout16;
                    textInputLayout24 = textInputLayout24;
                    textInputLayout19 = textInputLayout19;
                    view3 = view3;
                    c12564 = c12564;
                    editTextM5346 = editTextM5346;
                    c8069 = c8069;
                    sArr16 = sArr16;
                    sArr20 = sArr20;
                    i24 = i24;
                    i25 = i25;
                    textInputLayout23 = textInputLayout23;
                    textInputLayout20 = textInputLayout20;
                    radioButton2 = radioButton2;
                    view4 = view4;
                    textView2 = textView2;
                    viewOnClickListenerC8975 = viewOnClickListenerC8975;
                    textInputLayout6 = textInputLayout21;
                    sArr18 = sArr18;
                    short[] sArr22 = sArr14;
                    TextInputLayout textInputLayout26 = (TextInputLayout) C3743.m10957(view3, C19806.m45029(C3722.m10901(sArr22, 19, 3, i26)) ^ 2098264727);
                    sArr15 = f73701;
                    int iM11309 = ThreadFactoryC3888.m11306("᩷ᩳ") ^ i18;
                    textInputLayout22 = textInputLayout26;
                    i21 = iM11309 ^ 1812347385;
                    i20 = ((iM11309 ^ i19) * 31285) ^ 1012505861;
                    sArr14 = sArr22;
                    sArr18 = sArr18;
                    c8069 = c8069;
                    viewOnClickListenerC8975 = viewOnClickListenerC8975;
                    textInputLayout21 = textInputLayout6;
                    i24 = i24;
                    sArr20 = sArr20;
                    i25 = i25;
                    textInputLayout19 = textInputLayout19;
                    editTextM5346 = editTextM5346;
                    textInputLayout15 = textInputLayout15;
                    textInputLayout16 = textInputLayout16;
                    sArr16 = sArr16;
                    radioButton2 = radioButton2;
                    textInputLayout20 = textInputLayout20;
                    textView2 = textView2;
                    view4 = view4;
                    view3 = view3;
                    textInputLayout23 = textInputLayout23;
                    textInputLayout22 = textInputLayout22;
                    c12564 = c12564;
                    textInputLayout24 = textInputLayout24;
                    break;
                case -1910441478:
                case -1657004072:
                    TextInputLayout textInputLayout27 = textInputLayout24;
                    TextView textView3 = textView2;
                    ThreadFactoryC3888.m11303(textView3, iM11307 ^ i16);
                    C12562 c12565 = c12564;
                    RunnableC1895.m6165(c12565, 8);
                    View view5 = view4;
                    RunnableC1895.m6165(view5, 8);
                    EditText editTextM5347 = RunnableC1564.m5346(textInputLayout16);
                    String strMo1460 = this.f73703.mo1460();
                    int iM113010 = (i18 - ThreadFactoryC3888.m11306("֡ᩳ")) * (-93);
                    i20 = ((iM113010 ^ i19) * 10259) ^ 552673900;
                    i21 = iM113010 ^ 494952760;
                    c12564 = c12565;
                    str = strMo1460;
                    textInputLayout24 = textInputLayout27;
                    textView2 = textView3;
                    view4 = view5;
                    editText4 = editTextM5347;
                    break;
                case -1686876744:
                case 1616162051:
                    textInputLayout9 = textInputLayout24;
                    textInputLayout10 = textInputLayout23;
                    textInputLayout11 = textInputLayout22;
                    textInputLayout12 = textInputLayout19;
                    view = view3;
                    view2 = view4;
                    textView = textView2;
                    editText3 = editTextM5346;
                    c8068 = c8069;
                    sArr7 = sArr20;
                    i12 = i24;
                    i13 = i25;
                    textInputLayout13 = textInputLayout21;
                    textInputLayout14 = textInputLayout20;
                    radioButton = radioButton2;
                    viewOnClickListenerC8974 = viewOnClickListenerC8975;
                    sArr8 = sArr18;
                    c12562 = (C12562) C2642.m8167(view, ThreadFactoryC3888.m11306(C1148.m4230(sArr8, 34, 3, i26)) ^ 2117904132);
                    if (C3722.f13525 <= 0) {
                        iM450212 = (C19806.m45029("۬᩺") + i18) * 25;
                        c12563 = c12562;
                        i14 = ((iM450212 ^ i19) * (-29549)) ^ 1473885356;
                        i15 = 339027251;
                    } else {
                        iM450212 = C19806.m45029("۬۠") ^ i18;
                        c12563 = c12562;
                        i14 = ((iM450212 ^ i19) * 29603) ^ 1524474460;
                        i15 = -1604733284;
                    }
                    i21 = iM450212 ^ i15;
                    i20 = i14;
                    sArr18 = sArr8;
                    c8069 = c8068;
                    viewOnClickListenerC8975 = viewOnClickListenerC8974;
                    textInputLayout21 = textInputLayout13;
                    textInputLayout24 = textInputLayout9;
                    i24 = i12;
                    sArr20 = sArr7;
                    i25 = i13;
                    textInputLayout19 = textInputLayout12;
                    editTextM5346 = editText3;
                    radioButton2 = radioButton;
                    textInputLayout20 = textInputLayout14;
                    textView2 = textView;
                    view4 = view2;
                    view3 = view;
                    textInputLayout23 = textInputLayout10;
                    textInputLayout22 = textInputLayout11;
                    c12564 = c12563;
                    break;
                case -1633540591:
                case -911081665:
                    textInputLayout24 = textInputLayout24;
                    textInputLayout22 = textInputLayout22;
                    textInputLayout3 = textInputLayout19;
                    view3 = view3;
                    c12564 = c12564;
                    ViewOnClickListenerC8972 viewOnClickListenerC8976 = viewOnClickListenerC8975;
                    textInputLayout23 = textInputLayout23;
                    textInputLayout20 = textInputLayout20;
                    view4 = view4;
                    textView2 = textView2;
                    textInputLayout4 = textInputLayout21;
                    viewOnClickListenerC8976.onClick(radioButton3);
                    C8067 c8067M5356 = RunnableC1564.m5356(abstractActivityC12483);
                    C2871.m8638(c8067M5356, view3);
                    sArr20 = f73701;
                    i24 = 46;
                    i25 = 3;
                    if (!RunnableC1564.m5345()) {
                        int iM450215 = C19806.m45029("᩺᩷") ^ i18;
                        i21 = iM450215 ^ (-1725874502);
                        viewOnClickListenerC8975 = viewOnClickListenerC8976;
                        c8069 = c8067M5356;
                        i20 = ((iM450215 ^ i19) * 32581) ^ 1018175584;
                        textInputLayout20 = textInputLayout20;
                        textInputLayout21 = textInputLayout4;
                        textInputLayout19 = textInputLayout3;
                        view3 = view3;
                        textView2 = textView2;
                        textInputLayout22 = textInputLayout22;
                        view4 = view4;
                        textInputLayout23 = textInputLayout23;
                        c12564 = c12564;
                        textInputLayout24 = textInputLayout24;
                    } else {
                        textInputLayout = textInputLayout15;
                        textInputLayout2 = textInputLayout16;
                        c8069 = c8067M5356;
                        radioButton2 = radioButton2;
                        editText = editTextM5346;
                        sArr5 = sArr13;
                        i3 = i23;
                        sArr2 = sArr15;
                        sArr3 = sArr16;
                        sArr4 = sArr18;
                        viewOnClickListenerC8972 = viewOnClickListenerC8976;
                        textInputLayout5 = textInputLayout23;
                        int iM113011 = ThreadFactoryC3888.m11306("ᩳᩳ") ^ i19;
                        textInputLayout23 = textInputLayout5;
                        i21 = iM113011 ^ (-46953879);
                        i20 = ((iM113011 ^ i18) * (-31461)) ^ 1874576326;
                        sArr13 = sArr5;
                        i23 = i3;
                        sArr18 = sArr4;
                        viewOnClickListenerC8975 = viewOnClickListenerC8972;
                        textInputLayout21 = textInputLayout4;
                        textInputLayout19 = textInputLayout3;
                        editTextM5346 = editText;
                        textInputLayout15 = textInputLayout;
                        textInputLayout16 = textInputLayout2;
                        sArr16 = sArr3;
                        sArr15 = sArr2;
                        radioButton2 = radioButton2;
                        textInputLayout20 = textInputLayout20;
                        textView2 = textView2;
                        view4 = view4;
                        view3 = view3;
                        textInputLayout23 = textInputLayout23;
                        textInputLayout22 = textInputLayout22;
                        c12564 = c12564;
                        textInputLayout24 = textInputLayout24;
                    }
                    break;
                case -1521323218:
                case -447097437:
                    if (C3722.m10894() > 0) {
                        textInputLayout24 = textInputLayout24;
                        textInputLayout22 = textInputLayout22;
                        c12564 = c12564;
                        textInputLayout23 = textInputLayout23;
                        iM450211 = ThreadFactoryC3888.m11306("᩵ܶ") ^ i19;
                        i10 = ((iM450211 ^ i18) * 19867) ^ 1569474707;
                        i11 = -1991003433;
                        i21 = iM450211 ^ i11;
                        i20 = i10;
                        textInputLayout23 = textInputLayout23;
                        textInputLayout22 = textInputLayout22;
                        c12564 = c12564;
                        textInputLayout24 = textInputLayout24;
                    } else {
                        textInputLayout9 = textInputLayout24;
                        textInputLayout11 = textInputLayout22;
                        textInputLayout12 = textInputLayout19;
                        view = view3;
                        c12562 = c12564;
                        editText3 = editTextM5346;
                        c8068 = c8069;
                        sArr7 = sArr20;
                        i12 = i24;
                        i13 = i25;
                        textInputLayout10 = textInputLayout23;
                        textInputLayout14 = textInputLayout20;
                        radioButton = radioButton2;
                        view2 = view4;
                        textView = textView2;
                        viewOnClickListenerC8974 = viewOnClickListenerC8975;
                        textInputLayout13 = textInputLayout21;
                        sArr8 = sArr18;
                        iM450212 = (C19806.m45029("۬᩺") + i18) * 25;
                        c12563 = c12562;
                        i14 = ((iM450212 ^ i19) * (-29549)) ^ 1473885356;
                        i15 = 339027251;
                        i21 = iM450212 ^ i15;
                        i20 = i14;
                        sArr18 = sArr8;
                        c8069 = c8068;
                        viewOnClickListenerC8975 = viewOnClickListenerC8974;
                        textInputLayout21 = textInputLayout13;
                        textInputLayout24 = textInputLayout9;
                        i24 = i12;
                        sArr20 = sArr7;
                        i25 = i13;
                        textInputLayout19 = textInputLayout12;
                        editTextM5346 = editText3;
                        radioButton2 = radioButton;
                        textInputLayout20 = textInputLayout14;
                        textView2 = textView;
                        view4 = view2;
                        view3 = view;
                        textInputLayout23 = textInputLayout10;
                        textInputLayout22 = textInputLayout11;
                        c12564 = c12563;
                    }
                    break;
                case -1477103106:
                case 2025990897:
                    dialogInterfaceC19356M10334.m44378().setSoftInputMode(16);
                    C16737.m39290(RunnableC1564.m5346(textInputLayout15));
                    int iM113012 = (ThreadFactoryC3888.m11306("᩵ᩴ") ^ i19) * (-13);
                    i21 = iM113012 ^ 1840673289;
                    i20 = ((iM113012 ^ i18) * (-12213)) ^ 1727497105;
                    textInputLayout24 = textInputLayout24;
                    break;
                case -1393521536:
                case 704927801:
                    textInputLayout = textInputLayout15;
                    textInputLayout2 = textInputLayout16;
                    textInputLayout22 = textInputLayout22;
                    textInputLayout3 = textInputLayout19;
                    view3 = view3;
                    c12564 = c12564;
                    editText = editTextM5346;
                    sArr2 = sArr15;
                    sArr3 = sArr16;
                    textInputLayout23 = textInputLayout23;
                    textInputLayout20 = textInputLayout20;
                    radioButton2 = radioButton2;
                    view4 = view4;
                    textView2 = textView2;
                    short[] sArr23 = sArr12;
                    TextInputLayout textInputLayout28 = (TextInputLayout) C3743.m10957(view3, ThreadFactoryC3888.m11306(ViewGroupOnHierarchyChangeListenerC1916.m6241(sArr23, 13, 3, i26)) ^ 2123385484);
                    sArr13 = f73701;
                    i23 = 16;
                    int iM113013 = ThreadFactoryC3888.m11306("ۨᩳ") ^ i18;
                    textInputLayout24 = textInputLayout28;
                    i21 = iM113013 ^ (-1697677428);
                    i20 = ((iM113013 ^ i19) * 2301) ^ 1464737807;
                    sArr12 = sArr23;
                    sArr18 = sArr18;
                    c8069 = c8069;
                    viewOnClickListenerC8975 = viewOnClickListenerC8975;
                    textInputLayout21 = textInputLayout21;
                    i24 = i24;
                    sArr20 = sArr20;
                    i25 = i25;
                    textInputLayout19 = textInputLayout3;
                    editTextM5346 = editText;
                    textInputLayout15 = textInputLayout;
                    textInputLayout16 = textInputLayout2;
                    sArr16 = sArr3;
                    sArr15 = sArr2;
                    radioButton2 = radioButton2;
                    textInputLayout20 = textInputLayout20;
                    textView2 = textView2;
                    view4 = view4;
                    view3 = view3;
                    textInputLayout23 = textInputLayout23;
                    textInputLayout22 = textInputLayout22;
                    c12564 = c12564;
                    textInputLayout24 = textInputLayout24;
                    break;
                case -1261766606:
                case 1672787966:
                    textInputLayout15 = textInputLayout15;
                    textInputLayout16 = textInputLayout16;
                    textInputLayout24 = textInputLayout24;
                    textInputLayout22 = textInputLayout22;
                    textInputLayout20 = textInputLayout20;
                    textInputLayout19 = textInputLayout19;
                    radioButton2 = radioButton2;
                    c12564 = c12564;
                    editTextM5346 = editTextM5346;
                    viewOnClickListenerC8975 = viewOnClickListenerC8975;
                    c8069 = c8069;
                    sArr10 = sArr10;
                    i22 = i22;
                    sArr13 = sArr13;
                    i23 = i23;
                    sArr15 = sArr15;
                    sArr16 = sArr16;
                    sArr20 = sArr20;
                    i24 = i24;
                    i25 = i25;
                    textInputLayout23 = textInputLayout23;
                    view4 = view4;
                    textView2 = textView2;
                    textInputLayout21 = textInputLayout21;
                    sArr18 = sArr18;
                    int iM450216 = C19806.m45029(C1398.m4892(f73701, 1, 3, i26)) ^ 2126496496;
                    AbstractActivityC12483 abstractActivityC12484 = this.f73702;
                    View viewM9787 = C3286.m9787(abstractActivityC12484, iM450216);
                    sArr9 = f73701;
                    if (C2788.f10625 < 0) {
                        int iM113014 = ThreadFactoryC3888.m11306("ۘ᩹") ^ i18;
                        i20 = ((iM113014 ^ i19) * (-27197)) ^ 398082316;
                        i21 = iM113014 ^ (-929716805);
                        abstractActivityC12483 = abstractActivityC12484;
                        sArr10 = sArr10;
                        sArr18 = sArr18;
                        c8069 = c8069;
                        viewOnClickListenerC8975 = viewOnClickListenerC8975;
                        textInputLayout21 = textInputLayout21;
                        textInputLayout22 = textInputLayout22;
                        i24 = i24;
                        sArr20 = sArr20;
                        i25 = i25;
                        textInputLayout19 = textInputLayout19;
                        editTextM5346 = editTextM5346;
                        textInputLayout15 = textInputLayout15;
                        textInputLayout16 = textInputLayout16;
                        sArr16 = sArr16;
                        sArr15 = sArr15;
                        sArr13 = sArr13;
                        i23 = i23;
                        i22 = i22;
                        radioButton2 = radioButton2;
                        textInputLayout20 = textInputLayout20;
                        textView2 = textView2;
                        view3 = viewM9787;
                        view4 = view4;
                        textInputLayout23 = textInputLayout23;
                        c12564 = c12564;
                        textInputLayout24 = textInputLayout24;
                    } else {
                        view3 = viewM9787;
                        abstractActivityC12483 = abstractActivityC12484;
                        int iM113015 = ThreadFactoryC3888.m11306("ۗۤ") ^ i19;
                        i21 = iM113015 ^ (-1390588145);
                        i20 = ((iM113015 ^ i18) * 12237) ^ (-969621283);
                        sArr10 = sArr10;
                        sArr18 = sArr18;
                        c8069 = c8069;
                        viewOnClickListenerC8975 = viewOnClickListenerC8975;
                        textInputLayout21 = textInputLayout21;
                        i24 = i24;
                        sArr20 = sArr20;
                        i25 = i25;
                        textInputLayout19 = textInputLayout19;
                        editTextM5346 = editTextM5346;
                        textInputLayout15 = textInputLayout15;
                        textInputLayout16 = textInputLayout16;
                        sArr16 = sArr16;
                        sArr15 = sArr15;
                        sArr13 = sArr13;
                        i23 = i23;
                        i22 = i22;
                        radioButton2 = radioButton2;
                        textInputLayout20 = textInputLayout20;
                        textView2 = textView2;
                        view4 = view4;
                        view3 = view3;
                        textInputLayout23 = textInputLayout23;
                        textInputLayout22 = textInputLayout22;
                        c12564 = c12564;
                        textInputLayout24 = textInputLayout24;
                    }
                    break;
                case -1211296274:
                case 1130996743:
                    TextInputLayout textInputLayout29 = textInputLayout24;
                    TextInputLayout textInputLayout30 = textInputLayout22;
                    View view6 = view3;
                    C12562 c12566 = c12564;
                    TextInputLayout textInputLayout31 = textInputLayout23;
                    View viewM10958 = C3743.m10957(view6, ThreadFactoryC3888.m11306(ViewTreeObserverOnPreDrawListenerC3327.m9869(f73701, 43, 3, i26)) ^ 2098072775);
                    editTextM5346 = RunnableC1564.m5346(textInputLayout18);
                    int iM450217 = C19806.m45029("֨᩷") ^ i18;
                    i21 = iM450217 ^ 681852741;
                    i20 = ((iM450217 ^ i19) * 23089) ^ 643162850;
                    c8069 = c8069;
                    viewOnClickListenerC8975 = viewOnClickListenerC8975;
                    textInputLayout23 = textInputLayout31;
                    textInputLayout21 = textInputLayout21;
                    i24 = i24;
                    sArr20 = sArr20;
                    i25 = i25;
                    textInputLayout19 = textInputLayout19;
                    c12564 = c12566;
                    radioButton2 = radioButton2;
                    textInputLayout20 = textInputLayout20;
                    textView2 = textView2;
                    textInputLayout24 = textInputLayout29;
                    view4 = viewM10958;
                    view3 = view6;
                    textInputLayout22 = textInputLayout30;
                    break;
                case -1175740941:
                case -126850393:
                    textInputLayout15 = textInputLayout15;
                    textInputLayout16 = textInputLayout16;
                    textInputLayout24 = textInputLayout24;
                    textInputLayout22 = textInputLayout22;
                    textInputLayout19 = textInputLayout19;
                    view3 = view3;
                    c12564 = c12564;
                    editTextM5346 = editTextM5346;
                    c8069 = c8069;
                    sArr18 = sArr18;
                    sArr20 = sArr20;
                    i24 = i24;
                    i25 = i25;
                    textInputLayout23 = textInputLayout23;
                    textInputLayout20 = textInputLayout20;
                    radioButton2 = radioButton2;
                    view4 = view4;
                    textView2 = textView2;
                    viewOnClickListenerC8975 = viewOnClickListenerC8975;
                    sArr16 = sArr16;
                    short[] sArr24 = sArr15;
                    TextInputLayout textInputLayout32 = (TextInputLayout) C3743.m10957(view3, C19806.m45029(C2332.m7082(sArr24, 22, 3, i26)) ^ 2101661819);
                    if (!C0962.f3784) {
                        int iM450218 = C19806.m45029("ܶ᩻") ^ i18;
                        textInputLayout6 = textInputLayout32;
                        i21 = iM450218 ^ (-562903273);
                        i20 = ((iM450218 ^ i19) * (-15675)) ^ (-826907489);
                        sArr15 = sArr24;
                        sArr18 = sArr18;
                        c8069 = c8069;
                        viewOnClickListenerC8975 = viewOnClickListenerC8975;
                        textInputLayout21 = textInputLayout6;
                        i24 = i24;
                        sArr20 = sArr20;
                        i25 = i25;
                        textInputLayout19 = textInputLayout19;
                        editTextM5346 = editTextM5346;
                        textInputLayout15 = textInputLayout15;
                        textInputLayout16 = textInputLayout16;
                        sArr16 = sArr16;
                        radioButton2 = radioButton2;
                        textInputLayout20 = textInputLayout20;
                        textView2 = textView2;
                        view4 = view4;
                        view3 = view3;
                        textInputLayout23 = textInputLayout23;
                        textInputLayout22 = textInputLayout22;
                        c12564 = c12564;
                        textInputLayout24 = textInputLayout24;
                    } else {
                        textInputLayout21 = textInputLayout32;
                        sArr15 = sArr24;
                        sArr10 = sArr10;
                        i22 = i22;
                        sArr13 = sArr13;
                        i23 = i23;
                        int iM113016 = ThreadFactoryC3888.m11306("ۗۤ") ^ i19;
                        i21 = iM113016 ^ (-1390588145);
                        i20 = ((iM113016 ^ i18) * 12237) ^ (-969621283);
                        sArr10 = sArr10;
                        sArr18 = sArr18;
                        c8069 = c8069;
                        viewOnClickListenerC8975 = viewOnClickListenerC8975;
                        textInputLayout21 = textInputLayout21;
                        i24 = i24;
                        sArr20 = sArr20;
                        i25 = i25;
                        textInputLayout19 = textInputLayout19;
                        editTextM5346 = editTextM5346;
                        textInputLayout15 = textInputLayout15;
                        textInputLayout16 = textInputLayout16;
                        sArr16 = sArr16;
                        sArr15 = sArr15;
                        sArr13 = sArr13;
                        i23 = i23;
                        i22 = i22;
                        radioButton2 = radioButton2;
                        textInputLayout20 = textInputLayout20;
                        textView2 = textView2;
                        view4 = view4;
                        view3 = view3;
                        textInputLayout23 = textInputLayout23;
                        textInputLayout22 = textInputLayout22;
                        c12564 = c12564;
                        textInputLayout24 = textInputLayout24;
                    }
                    break;
                case -1138197023:
                case -494271688:
                    i26 = 30936;
                    iM11306 = (i19 - C19806.m45029("֡ۛ")) * 77;
                    i = ((iM11306 ^ i18) * (-14405)) ^ (-174556663);
                    i2 = -154256041;
                    i21 = iM11306 ^ i2;
                    i20 = i;
                    sArr9 = sArr9;
                    sArr10 = sArr10;
                    sArr18 = sArr18;
                    c8069 = c8069;
                    viewOnClickListenerC8975 = viewOnClickListenerC8975;
                    textInputLayout21 = textInputLayout21;
                    i24 = i24;
                    sArr20 = sArr20;
                    i25 = i25;
                    textInputLayout19 = textInputLayout19;
                    editTextM5346 = editTextM5346;
                    textInputLayout15 = textInputLayout15;
                    textInputLayout16 = textInputLayout16;
                    sArr16 = sArr16;
                    sArr15 = sArr15;
                    sArr13 = sArr13;
                    i23 = i23;
                    i22 = i22;
                    radioButton2 = radioButton2;
                    textInputLayout20 = textInputLayout20;
                    textView2 = textView2;
                    view4 = view4;
                    view3 = view3;
                    textInputLayout23 = textInputLayout23;
                    textInputLayout22 = textInputLayout22;
                    c12564 = c12564;
                    textInputLayout24 = textInputLayout24;
                    break;
                case -1015431143:
                case -759781065:
                    textInputLayout15 = textInputLayout15;
                    textInputLayout16 = textInputLayout16;
                    textInputLayout24 = textInputLayout24;
                    textInputLayout22 = textInputLayout22;
                    textInputLayout19 = textInputLayout19;
                    view3 = view3;
                    c12564 = c12564;
                    editTextM5346 = editTextM5346;
                    c8069 = c8069;
                    int i27 = i23;
                    sArr15 = sArr15;
                    sArr16 = sArr16;
                    sArr20 = sArr20;
                    i24 = i24;
                    i25 = i25;
                    textInputLayout23 = textInputLayout23;
                    textInputLayout20 = textInputLayout20;
                    radioButton2 = radioButton2;
                    view4 = view4;
                    textView2 = textView2;
                    viewOnClickListenerC8975 = viewOnClickListenerC8975;
                    textInputLayout21 = textInputLayout21;
                    sArr18 = sArr18;
                    sArr13 = sArr13;
                    short[] sArr25 = sArr11;
                    int i28 = i22;
                    TextInputLayout textInputLayout33 = (TextInputLayout) C2642.m8167(view3, ThreadFactoryC3888.m11306(CallableC1627.m5502(sArr25, i28, 3, i26)) ^ 2102265727);
                    sArr12 = f73701;
                    if (C0216.m1591() <= 0) {
                        i22 = i28;
                        i23 = i27;
                        sArr11 = sArr25;
                        sArr10 = sArr10;
                        textInputLayout17 = textInputLayout33;
                        int iM113017 = ThreadFactoryC3888.m11306("ۗۤ") ^ i19;
                        i21 = iM113017 ^ (-1390588145);
                        i20 = ((iM113017 ^ i18) * 12237) ^ (-969621283);
                        sArr10 = sArr10;
                        sArr18 = sArr18;
                        c8069 = c8069;
                        viewOnClickListenerC8975 = viewOnClickListenerC8975;
                        textInputLayout21 = textInputLayout21;
                        i24 = i24;
                        sArr20 = sArr20;
                        i25 = i25;
                        textInputLayout19 = textInputLayout19;
                        editTextM5346 = editTextM5346;
                        textInputLayout15 = textInputLayout15;
                        textInputLayout16 = textInputLayout16;
                        sArr16 = sArr16;
                        sArr15 = sArr15;
                        sArr13 = sArr13;
                        i23 = i23;
                        i22 = i22;
                    } else {
                        int iM113018 = ThreadFactoryC3888.m11306("ۧ֨") ^ i19;
                        i21 = iM113018 ^ (-191700986);
                        i20 = ((iM113018 ^ i18) * (-17479)) ^ (-324162711);
                        i22 = i28;
                        i23 = i27;
                        sArr11 = sArr25;
                        sArr18 = sArr18;
                        c8069 = c8069;
                        viewOnClickListenerC8975 = viewOnClickListenerC8975;
                        textInputLayout21 = textInputLayout21;
                        i24 = i24;
                        sArr20 = sArr20;
                        i25 = i25;
                        textInputLayout19 = textInputLayout19;
                        editTextM5346 = editTextM5346;
                        textInputLayout15 = textInputLayout15;
                        textInputLayout16 = textInputLayout16;
                        sArr16 = sArr16;
                        sArr15 = sArr15;
                        sArr13 = sArr13;
                        textInputLayout17 = textInputLayout33;
                    }
                    radioButton2 = radioButton2;
                    textInputLayout20 = textInputLayout20;
                    textView2 = textView2;
                    view4 = view4;
                    view3 = view3;
                    textInputLayout23 = textInputLayout23;
                    textInputLayout22 = textInputLayout22;
                    c12564 = c12564;
                    textInputLayout24 = textInputLayout24;
                    break;
                case -785236335:
                case 1527914290:
                    C1377.m4833();
                    C1977.m6356();
                    textInputLayout9 = textInputLayout24;
                    textInputLayout11 = textInputLayout22;
                    textInputLayout12 = textInputLayout19;
                    view = view3;
                    c12562 = c12564;
                    editText3 = editTextM5346;
                    c8068 = c8069;
                    sArr7 = sArr20;
                    i12 = i24;
                    i13 = i25;
                    textInputLayout10 = textInputLayout23;
                    textInputLayout14 = textInputLayout20;
                    radioButton = radioButton2;
                    view2 = view4;
                    textView = textView2;
                    viewOnClickListenerC8974 = viewOnClickListenerC8975;
                    textInputLayout13 = textInputLayout21;
                    sArr8 = sArr18;
                    iM450212 = (C19806.m45029("۬᩺") + i18) * 25;
                    c12563 = c12562;
                    i14 = ((iM450212 ^ i19) * (-29549)) ^ 1473885356;
                    i15 = 339027251;
                    i21 = iM450212 ^ i15;
                    i20 = i14;
                    sArr18 = sArr8;
                    c8069 = c8068;
                    viewOnClickListenerC8975 = viewOnClickListenerC8974;
                    textInputLayout21 = textInputLayout13;
                    textInputLayout24 = textInputLayout9;
                    i24 = i12;
                    sArr20 = sArr7;
                    i25 = i13;
                    textInputLayout19 = textInputLayout12;
                    editTextM5346 = editText3;
                    radioButton2 = radioButton;
                    textInputLayout20 = textInputLayout14;
                    textView2 = textView;
                    view4 = view2;
                    view3 = view;
                    textInputLayout23 = textInputLayout10;
                    textInputLayout22 = textInputLayout11;
                    c12564 = c12563;
                    break;
                case -512012798:
                case -262579081:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    C0216.m1591();
                    break;
                case -337642117:
                case 150911481:
                    textInputLayout24 = textInputLayout24;
                    textInputLayout22 = textInputLayout22;
                    textInputLayout19 = textInputLayout19;
                    view3 = view3;
                    c12564 = c12564;
                    editTextM5346 = editTextM5346;
                    viewOnClickListenerC8975 = viewOnClickListenerC8975;
                    c8069 = c8069;
                    sArr20 = sArr20;
                    i24 = i24;
                    i25 = i25;
                    textInputLayout23 = textInputLayout23;
                    textInputLayout20 = textInputLayout20;
                    view4 = view4;
                    textView2 = textView2;
                    textInputLayout21 = textInputLayout21;
                    short[] sArr26 = sArr19;
                    RadioButton radioButton4 = (RadioButton) C3743.m10957(view3, C19806.m45029(C0526.m2424(sArr26, 40, 3, i26)) ^ 2124077379);
                    if (C2871.f10837 < 0) {
                        int iM450219 = (C19806.m45029("۬᩹") + i19) * 29;
                        i21 = iM450219 ^ (-1266214902);
                        i20 = ((iM450219 ^ i18) * 13601) ^ 1002149531;
                        sArr19 = sArr26;
                        c8069 = c8069;
                        viewOnClickListenerC8975 = viewOnClickListenerC8975;
                        textInputLayout20 = textInputLayout20;
                        textInputLayout21 = textInputLayout21;
                        i24 = i24;
                        sArr20 = sArr20;
                        i25 = i25;
                        textInputLayout19 = textInputLayout19;
                        editTextM5346 = editTextM5346;
                        radioButton2 = radioButton4;
                        view3 = view3;
                        textView2 = textView2;
                        textInputLayout22 = textInputLayout22;
                        view4 = view4;
                        textInputLayout23 = textInputLayout23;
                        c12564 = c12564;
                        textInputLayout24 = textInputLayout24;
                    } else {
                        textInputLayout15 = textInputLayout15;
                        textInputLayout16 = textInputLayout16;
                        sArr19 = sArr26;
                        sArr = sArr9;
                        i22 = i22;
                        sArr13 = sArr13;
                        i23 = i23;
                        sArr15 = sArr15;
                        sArr16 = sArr16;
                        sArr18 = sArr18;
                        radioButton2 = radioButton4;
                        int iM4502110 = (C19806.m45029("ۜ᩸") + i18) * (-127);
                        i21 = iM4502110 ^ (-2107438474);
                        sArr9 = sArr;
                        i20 = ((iM4502110 ^ i19) * 6241) ^ (-448135367);
                        sArr18 = sArr18;
                        c8069 = c8069;
                        viewOnClickListenerC8975 = viewOnClickListenerC8975;
                        textInputLayout21 = textInputLayout21;
                        i24 = i24;
                        sArr20 = sArr20;
                        i25 = i25;
                        textInputLayout19 = textInputLayout19;
                        editTextM5346 = editTextM5346;
                        textInputLayout15 = textInputLayout15;
                        textInputLayout16 = textInputLayout16;
                        sArr16 = sArr16;
                        sArr15 = sArr15;
                        sArr13 = sArr13;
                        i23 = i23;
                        i22 = i22;
                        radioButton2 = radioButton2;
                        textInputLayout20 = textInputLayout20;
                        textView2 = textView2;
                        view4 = view4;
                        view3 = view3;
                        textInputLayout23 = textInputLayout23;
                        textInputLayout22 = textInputLayout22;
                        c12564 = c12564;
                        textInputLayout24 = textInputLayout24;
                    }
                    break;
                case -290446431:
                case 1530981850:
                    final DialogInterfaceC19356 dialogInterfaceC19356 = dialogInterfaceC19356M10334;
                    C7105.m18993(C1398.m4897(dialogInterfaceC19356M10334), new View.OnClickListener(this) { // from class: l.ۖ᩻ۨ

                        /* JADX INFO: renamed from: ۫᩹᩷, reason: not valid java name and contains not printable characters */
                        private static final short[] f10799 = {1094, -28697, -31736, 26069, -30364, -27457, -30825, -29314, 31957, -20662};

                        /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ C22618 f10808;

                        /* JADX WARN: Code duplicated, block: B:59:0x02a2 A[PHI: r16
                          0x02a2: PHI (r16v4 int) = (r16v0 int), (r16v2 int), (r16v5 int) binds: [B:16:0x0084, B:58:0x02a0, B:50:0x0229] A[DONT_GENERATE, DONT_INLINE]] */
                        {
                            int i29;
                            int iM113019;
                            int i30;
                            int i31;
                            int i32;
                            int iM113020;
                            int i33;
                            int i34;
                            int iM450220;
                            int i35;
                            int i36;
                            ViewOnClickListenerC2861 viewOnClickListenerC2861 = this;
                            int i37 = 1224461416;
                            int i38 = C2124.f7782;
                            int i39 = C1419.f5860;
                            int iM450221 = (C19806.m45029("ۚܽ") + i39) * 65;
                            int i40 = ((iM450221 ^ i38) * (-2787)) ^ 686232037;
                            int i41 = iM450221 ^ (-855500004);
                            while (true) {
                                i37 = ((((i37 ^ i38) * 26461) >> 31) & i40) ^ i41;
                                switch (i37) {
                                    case -1975316414:
                                    case -1024423594:
                                        if (AbstractC0464.f2088 <= 0) {
                                            iM450220 = ThreadFactoryC3888.m11306("ۛ᩷") ^ i38;
                                            i35 = ((iM450220 ^ i39) * 14147) ^ 885504416;
                                            i36 = -1531360054;
                                            i41 = iM450220 ^ i36;
                                            i40 = i35;
                                        } else {
                                            int iM450222 = C19806.m45029("ۢ֨") ^ i39;
                                            i41 = iM450222 ^ 1628154652;
                                            i40 = ((iM450222 ^ i38) * 29305) ^ 416130131;
                                        }
                                        break;
                                    case -1492118194:
                                    case -319537027:
                                        C0671.m3008();
                                        iM113019 = (ThreadFactoryC3888.m11306("ۚۗ") + i39) * (-85);
                                        i30 = ((iM113019 ^ i38) * 9165) ^ 286848080;
                                        i31 = -63044827;
                                        i41 = iM113019 ^ i31;
                                        i40 = i30;
                                        break;
                                    case -1263830688:
                                    case -1245628660:
                                        if (C1419.f5860 >= 0) {
                                            iM450220 = ThreadFactoryC3888.m11306("ۛ᩷") ^ i38;
                                            i35 = ((iM450220 ^ i39) * 14147) ^ 885504416;
                                            i36 = -1531360054;
                                            i41 = iM450220 ^ i36;
                                            i40 = i35;
                                        } else {
                                            int iM450223 = C19806.m45029("ܳ۠") ^ i38;
                                            i41 = iM450223 ^ (-1726672189);
                                            i40 = ((iM450223 ^ i39) * (-19111)) ^ 312001634;
                                        }
                                        break;
                                    case -1151104450:
                                    case 1840073659:
                                        i29 = i37;
                                        if (CallableC1627.f6528) {
                                            iM113020 = C19806.m45029("۟ۖ") ^ i38;
                                            i33 = ((iM113020 ^ i39) * (-9323)) ^ 1950637550;
                                            i34 = -1615506462;
                                        } else {
                                            iM113020 = ThreadFactoryC3888.m11306("᩵ۧ") ^ i38;
                                            i33 = ((iM113020 ^ i39) * (-11599)) ^ (-1288783040);
                                            i34 = -1687356060;
                                        }
                                        i41 = iM113020 ^ i34;
                                        i40 = i33;
                                        i37 = i29;
                                        break;
                                    case -795193478:
                                    case -752737219:
                                        if (ThreadFactoryC3888.f14547 > 0) {
                                            i32 = i37;
                                            int iM113021 = ThreadFactoryC3888.m11306("ۤۢ") ^ i39;
                                            i40 = ((iM113021 ^ i38) * (-12191)) ^ 2075409256;
                                            i37 = i32;
                                            i41 = iM113021 ^ 167737338;
                                            viewOnClickListenerC2861 = this;
                                        } else {
                                            i29 = i37;
                                            iM113020 = ThreadFactoryC3888.m11306("᩵ۧ") ^ i38;
                                            i33 = ((iM113020 ^ i39) * (-11599)) ^ (-1288783040);
                                            i34 = -1687356060;
                                            i41 = iM113020 ^ i34;
                                            i40 = i33;
                                            i37 = i29;
                                        }
                                        break;
                                    case -597712130:
                                    case -15978183:
                                        if (C2124.f7782 <= 0) {
                                            i29 = i37;
                                            iM113020 = ThreadFactoryC3888.m11306("ܰۙ") ^ i38;
                                            i33 = ((iM113020 ^ i39) * 23305) ^ (-1324577357);
                                            i34 = 361766533;
                                            i41 = iM113020 ^ i34;
                                            i40 = i33;
                                            i37 = i29;
                                        } else {
                                            iM113019 = (ThreadFactoryC3888.m11306("ۚۗ") + i39) * (-85);
                                            i30 = ((iM113019 ^ i38) * 9165) ^ 286848080;
                                            i31 = -63044827;
                                            i41 = iM113019 ^ i31;
                                            i40 = i30;
                                        }
                                        break;
                                    case -399634882:
                                    case 1160123726:
                                        i29 = i37;
                                        if (C1419.f5860 >= 0) {
                                            iM113020 = ThreadFactoryC3888.m11306("ܰۙ") ^ i38;
                                            i33 = ((iM113020 ^ i39) * 23305) ^ (-1324577357);
                                            i34 = 361766533;
                                        } else {
                                            iM113020 = C19806.m45029("۠ۘ") ^ i39;
                                            i33 = ((iM113020 ^ i38) * (-10247)) ^ (-983180449);
                                            i34 = -1271764526;
                                        }
                                        i41 = iM113020 ^ i34;
                                        i40 = i33;
                                        i37 = i29;
                                        break;
                                    case -331856145:
                                    case 2138486644:
                                        return;
                                    case -307622888:
                                    case 646036086:
                                        C3743.m10966();
                                        throw new RuntimeException();
                                    case -270784434:
                                    case 1637006160:
                                        if (!C3577.m10565()) {
                                            i32 = i37;
                                            int iM113022 = ThreadFactoryC3888.m11306("ۤۢ") ^ i39;
                                            i40 = ((iM113022 ^ i38) * (-12191)) ^ 2075409256;
                                            i37 = i32;
                                            i41 = iM113022 ^ 167737338;
                                            viewOnClickListenerC2861 = this;
                                        } else {
                                            int iM113023 = (ThreadFactoryC3888.m11306("ۛܳ") ^ i38) * (-73);
                                            i29 = i37;
                                            i40 = ((iM113023 ^ i39) * (-20983)) ^ 750532666;
                                            i41 = iM113023 ^ (-434434530);
                                            i37 = i29;
                                        }
                                        break;
                                    case -254265535:
                                    case 1327611674:
                                        i32 = i37;
                                        viewOnClickListenerC2861.f10808 = this;
                                        if (C1668.m5583()) {
                                            int iM450224 = (i38 - C19806.m45029("۫֫")) * (-19);
                                            i41 = iM450224 ^ 921789569;
                                            i40 = ((iM450224 ^ i39) * 12071) ^ (-1270090528);
                                            i37 = i32;
                                        } else {
                                            int iM113024 = ThreadFactoryC3888.m11306("ۤۢ") ^ i39;
                                            i40 = ((iM113024 ^ i38) * (-12191)) ^ 2075409256;
                                            i37 = i32;
                                            i41 = iM113024 ^ 167737338;
                                        }
                                        viewOnClickListenerC2861 = this;
                                        break;
                                    case -227572522:
                                    case 44648939:
                                        if (C1419.f5860 >= 0) {
                                            i32 = i37;
                                            int iM113025 = ThreadFactoryC3888.m11306("ۤۢ") ^ i39;
                                            i40 = ((iM113025 ^ i38) * (-12191)) ^ 2075409256;
                                            i37 = i32;
                                            i41 = iM113025 ^ 167737338;
                                            viewOnClickListenerC2861 = this;
                                        } else {
                                            int iM450225 = (C19806.m45029("ܳۡ") + i39) * 27;
                                            i41 = iM450225 ^ (-104391969);
                                            i40 = ((iM450225 ^ i38) * (-27905)) ^ 2003666878;
                                        }
                                        break;
                                    case 1472780:
                                    case 1644920103:
                                        C2642.m8171();
                                        if (!RunnableC1564.f6300) {
                                            iM113019 = (ThreadFactoryC3888.m11306("ۚۗ") + i39) * (-85);
                                            i30 = ((iM113019 ^ i38) * 9165) ^ 286848080;
                                            i31 = -63044827;
                                            i41 = iM113019 ^ i31;
                                            i40 = i30;
                                        } else {
                                            i29 = i37;
                                            iM113020 = ThreadFactoryC3888.m11306("᩵ۧ") ^ i38;
                                            i33 = ((iM113020 ^ i39) * (-11599)) ^ (-1288783040);
                                            i34 = -1687356060;
                                            i41 = iM113020 ^ i34;
                                            i40 = i33;
                                            i37 = i29;
                                        }
                                        break;
                                    case 147537300:
                                    case 2118015367:
                                        if (C3660.m10791() != 0) {
                                            iM450220 = ThreadFactoryC3888.m11306("ۛ᩷") ^ i38;
                                            i35 = ((iM450220 ^ i39) * 14147) ^ 885504416;
                                            i36 = -1531360054;
                                        } else {
                                            iM450220 = C19806.m45029("ܽ᩻") ^ i38;
                                            i35 = ((iM450220 ^ i39) * 1275) ^ (-1232042111);
                                            i36 = -36148073;
                                        }
                                        i41 = iM450220 ^ i36;
                                        i40 = i35;
                                        break;
                                    case 695469838:
                                    case 929674685:
                                        i29 = i37;
                                        if (C1460.f5948 >= 0) {
                                            iM113020 = ThreadFactoryC3888.m11306("ܰۙ") ^ i38;
                                            i33 = ((iM113020 ^ i39) * 23305) ^ (-1324577357);
                                            i34 = 361766533;
                                        } else {
                                            iM113020 = (i39 - ThreadFactoryC3888.m11306("ۘ᩺")) * (-81);
                                            i33 = ((iM113020 ^ i38) * (-7355)) ^ 1982682730;
                                            i34 = -741667946;
                                        }
                                        i41 = iM113020 ^ i34;
                                        i40 = i33;
                                        i37 = i29;
                                        break;
                                    default:
                                        if (C1025.f4800 >= 0) {
                                            iM113019 = (ThreadFactoryC3888.m11306("ۚۗ") + i39) * (-85);
                                            i30 = ((iM113019 ^ i38) * 9165) ^ 286848080;
                                            i31 = -63044827;
                                        } else {
                                            iM113019 = C19806.m45029("᩷۠") ^ i39;
                                            i30 = ((iM113019 ^ i38) * 12659) ^ 716790963;
                                            i31 = -1428847289;
                                        }
                                        i41 = iM113019 ^ i31;
                                        i40 = i30;
                                        break;
                                }
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view7) {
                            int i29;
                            TextInputLayout textInputLayout34;
                            String str2;
                            String str3;
                            int i30;
                            short[] sArr27;
                            short[] sArr28;
                            int iM450220;
                            int i31;
                            int i32;
                            int iM450221;
                            int i33;
                            int i34;
                            int i35;
                            int i36;
                            int iM113019;
                            int i37;
                            int i38;
                            int iM450222;
                            int i39;
                            int iM450223;
                            int i40;
                            TextInputLayout textInputLayout35;
                            int i41;
                            int i42;
                            int iM113020 = 0;
                            TextInputLayout textInputLayout36 = null;
                            int i43 = -725864311;
                            int i44 = RunnableC3388.f12514;
                            int i45 = C2124.f7782;
                            int iM450224 = (C19806.m45029("۠ۚ") ^ i45) * (-49);
                            int i46 = ((iM450224 ^ i44) * 249) ^ (-361222948);
                            int i47 = iM450224 ^ 1283853167;
                            String strM6105 = null;
                            short[] sArr29 = null;
                            short[] sArr30 = null;
                            int iM450225 = 0;
                            int i48 = 0;
                            int i49 = 0;
                            char c = 0;
                            short s = 0;
                            short s2 = 0;
                            boolean zM10786 = false;
                            String strM2906 = null;
                            String str4 = null;
                            String strM3407 = null;
                            TextInputLayout textInputLayout37 = null;
                            String strM6674 = null;
                            String strM6675 = null;
                            TextInputLayout textInputLayout38 = null;
                            while (true) {
                                i43 = i47 ^ (i46 & (((i43 ^ i44) * (-32351)) >> 31));
                                switch (i43) {
                                    case -2143068636:
                                    case -503480413:
                                        textInputLayout35 = textInputLayout38;
                                        textInputLayout37 = textInputLayout37;
                                        str4 = str4;
                                        strM2906 = strM2906;
                                        int i50 = i49;
                                        iM450225 = C19806.m45029(strM6105);
                                        i48 = 2126765274;
                                        if (!C0526.f2219) {
                                            int iM450226 = (C19806.m45029("᩶ۖ") + i44) * (-47);
                                            i41 = ((iM450226 ^ i45) * (-11479)) ^ 42660832;
                                            i42 = iM450226 ^ (-518696432);
                                            textInputLayout37 = textInputLayout37;
                                            str4 = str4;
                                            strM2906 = strM2906;
                                            i49 = i50;
                                            i47 = i42;
                                            i46 = i41;
                                            textInputLayout38 = textInputLayout35;
                                        } else {
                                            textInputLayout38 = textInputLayout35;
                                            i36 = i50;
                                            iM113019 = ThreadFactoryC3888.m11306("֫᩵") ^ i44;
                                            i33 = ((iM113019 ^ i45) * (-16275)) ^ 927165529;
                                            i37 = -1109767596;
                                            i35 = iM113019 ^ i37;
                                            i49 = i36;
                                            textInputLayout37 = textInputLayout37;
                                            str4 = str4;
                                            strM2906 = strM2906;
                                            i47 = i35;
                                            i46 = i33;
                                        }
                                        break;
                                    case -2089594423:
                                    case -990505887:
                                        textInputLayout37 = textInputLayout37;
                                        strM2906 = strM2906;
                                        i29 = i49;
                                        sArr30 = sArr30;
                                        String strM10964 = C3743.m10964(sArr30, 1, 3, i29);
                                        if (C0671.m3008() >= 0) {
                                            str4 = strM10964;
                                            iM450221 = (ThreadFactoryC3888.m11306("ܽۚ") ^ i45) * 3;
                                            i33 = ((iM450221 ^ i44) * (-28057)) ^ 626643813;
                                            i34 = -715405476;
                                            i35 = iM450221 ^ i34;
                                            i49 = i29;
                                            sArr30 = sArr30;
                                            textInputLayout37 = textInputLayout37;
                                            str4 = str4;
                                            strM2906 = strM2906;
                                            i47 = i35;
                                            i46 = i33;
                                        } else {
                                            int iM450227 = (C19806.m45029("ۛۨ") + i44) * (-23);
                                            i49 = i29;
                                            sArr30 = sArr30;
                                            textInputLayout37 = textInputLayout37;
                                            str4 = strM10964;
                                            i47 = iM450227 ^ 2032375203;
                                            i46 = ((iM450227 ^ i45) * (-11291)) ^ 1759490787;
                                            strM2906 = strM2906;
                                        }
                                        break;
                                    case -1856178813:
                                    case -1623298882:
                                        textInputLayout37 = textInputLayout37;
                                        str4 = str4;
                                        strM2906 = strM2906;
                                        i36 = i49;
                                        textInputLayout36 = textInputLayout16;
                                        strM6674 = C2124.m6674(ViewTreeObserverOnPreDrawListenerC3327.m9864(RunnableC1564.m5346(textInputLayout36)));
                                        if (C3660.m10786(strM6674)) {
                                            iM113019 = (i44 - C19806.m45029("ᩴܶ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i33 = ((iM113019 ^ i45) * 26523) ^ (-1450137723);
                                            i37 = 1118832822;
                                        } else {
                                            iM113019 = C19806.m45029("ܽ۫") ^ i44;
                                            i33 = ((iM113019 ^ i45) * 5239) ^ 919911488;
                                            i37 = 898624726;
                                        }
                                        i35 = iM113019 ^ i37;
                                        i49 = i36;
                                        textInputLayout37 = textInputLayout37;
                                        str4 = str4;
                                        strM2906 = strM2906;
                                        i47 = i35;
                                        i46 = i33;
                                        break;
                                    case -1821302306:
                                    case 601518529:
                                        C2871.m8646();
                                        if (!C1377.f5749) {
                                            sArr28 = sArr29;
                                            textInputLayout34 = textInputLayout37;
                                            str2 = str4;
                                            str3 = strM2906;
                                            i30 = i49;
                                            sArr27 = sArr30;
                                            iM450220 = ThreadFactoryC3888.m11306("ۧۖ") ^ i44;
                                            i31 = ((iM450220 ^ i45) * 2837) ^ 1431245787;
                                            i32 = 583221059;
                                            int i51 = iM450220 ^ i32;
                                            sArr29 = sArr28;
                                            i49 = i30;
                                            sArr30 = sArr27;
                                            i46 = i31;
                                            textInputLayout37 = textInputLayout34;
                                            str4 = str2;
                                            strM2906 = str3;
                                            i47 = i51;
                                        } else {
                                            textInputLayout37 = textInputLayout37;
                                            str4 = str4;
                                            strM2906 = strM2906;
                                            i29 = i49;
                                            sArr30 = sArr30;
                                            iM450221 = (ThreadFactoryC3888.m11306("ܽۚ") ^ i45) * 3;
                                            i33 = ((iM450221 ^ i44) * (-28057)) ^ 626643813;
                                            i34 = -715405476;
                                            i35 = iM450221 ^ i34;
                                            i49 = i29;
                                            sArr30 = sArr30;
                                            textInputLayout37 = textInputLayout37;
                                            str4 = str4;
                                            strM2906 = strM2906;
                                            i47 = i35;
                                            i46 = i33;
                                        }
                                        break;
                                    case -1808740266:
                                    case 1793412424:
                                        textInputLayout37 = textInputLayout37;
                                        str4 = str4;
                                        strM2906 = strM2906;
                                        i36 = i49;
                                        zM10786 = C3660.m10786(strM6675);
                                        sArr30 = f10799;
                                        if (C2788.f10625 >= 0) {
                                            iM113019 = ThreadFactoryC3888.m11306("֫᩵") ^ i44;
                                            i33 = ((iM113019 ^ i45) * (-16275)) ^ 927165529;
                                            i37 = -1109767596;
                                        } else {
                                            iM113019 = (ThreadFactoryC3888.m11306("᩵ܽ") + i44) * 79;
                                            i33 = ((iM113019 ^ i45) * (-18785)) ^ 1003610518;
                                            i37 = 1077591744;
                                        }
                                        i35 = iM113019 ^ i37;
                                        i49 = i36;
                                        textInputLayout37 = textInputLayout37;
                                        str4 = str4;
                                        strM2906 = strM2906;
                                        i47 = i35;
                                        i46 = i33;
                                        break;
                                    case -1785733199:
                                    case -255871770:
                                        i49 = 1105;
                                        int iM450228 = C19806.m45029("۫۬") ^ i44;
                                        i33 = ((iM450228 ^ i45) * 8833) ^ (-2109567196);
                                        i35 = iM450228 ^ 1334506590;
                                        sArr30 = sArr30;
                                        textInputLayout37 = textInputLayout37;
                                        str4 = str4;
                                        strM2906 = strM2906;
                                        i47 = i35;
                                        i46 = i33;
                                        break;
                                    case -1638891318:
                                    case 1205365894:
                                        textInputLayout37 = textInputLayout37;
                                        str4 = str4;
                                        i38 = i49;
                                        strM2906 = C0629.m2906(f10799, 4, 3, i38);
                                        if (RunnableC0195.m1431()) {
                                            iM450222 = C19806.m45029("ۨ֫") ^ i44;
                                            i33 = ((iM450222 ^ i45) * (-32509)) ^ (-1518968742);
                                            i39 = -244050463;
                                        } else {
                                            iM450222 = (i44 - C19806.m45029("֫᩸")) * (-109);
                                            i33 = ((iM450222 ^ i45) * (-19299)) ^ 2083701055;
                                            i39 = -655639040;
                                        }
                                        i35 = iM450222 ^ i39;
                                        i49 = i38;
                                        textInputLayout37 = textInputLayout37;
                                        str4 = str4;
                                        i47 = i35;
                                        i46 = i33;
                                        break;
                                    case -1416627673:
                                    case 603499089:
                                        TextInputLayout textInputLayout39 = textInputLayout38;
                                        String str5 = str4;
                                        String str6 = strM2906;
                                        int i52 = i49;
                                        TextInputLayout textInputLayout40 = textInputLayout17;
                                        strM3407 = C0817.m3407(ViewTreeObserverOnPreDrawListenerC3327.m9864(RunnableC1564.m5346(textInputLayout40)));
                                        if (C3660.m10786(strM3407)) {
                                            iM450223 = ThreadFactoryC3888.m11306("᩸֫") ^ i45;
                                            i33 = ((iM450223 ^ i44) * 6749) ^ 735091678;
                                            i40 = -1119123176;
                                        } else {
                                            iM450223 = (C19806.m45029("֫۬") ^ i45) * 69;
                                            i33 = ((iM450223 ^ i44) * (-24001)) ^ 1675163543;
                                            i40 = -2026015719;
                                        }
                                        i47 = iM450223 ^ i40;
                                        i49 = i52;
                                        str4 = str5;
                                        strM2906 = str6;
                                        textInputLayout38 = textInputLayout39;
                                        textInputLayout37 = textInputLayout40;
                                        i46 = i33;
                                        break;
                                    case -1259010897:
                                    case -977016817:
                                        textInputLayout37 = textInputLayout37;
                                        str4 = str4;
                                        strM2906 = strM2906;
                                        i36 = i49;
                                        iM113020 = ThreadFactoryC3888.m11306(str4) ^ 2127951876;
                                        if (zM10786) {
                                            iM113019 = ThreadFactoryC3888.m11306("֨ۚ") ^ i45;
                                            i33 = ((iM113019 ^ i44) * (-28913)) ^ (-1168937150);
                                            i37 = 569527331;
                                        } else {
                                            iM113019 = C19806.m45029("ۗ۬") ^ i45;
                                            i33 = ((iM113019 ^ i44) * 10675) ^ 1224414286;
                                            i37 = -391827392;
                                        }
                                        i35 = iM113019 ^ i37;
                                        i49 = i36;
                                        textInputLayout37 = textInputLayout37;
                                        str4 = str4;
                                        strM2906 = strM2906;
                                        i47 = i35;
                                        i46 = i33;
                                        break;
                                    case -1255125259:
                                    case -892127968:
                                        textInputLayout37.setError(C1875.m6085(iM113020));
                                        C1977.m6361(RunnableC1564.m5346(textInputLayout37));
                                        break;
                                    case -1142330933:
                                    case 1000846991:
                                        C22618 c22618 = this.f10808;
                                        textInputLayout37 = textInputLayout37;
                                        RadioButton radioButton5 = radioButton3;
                                        str4 = str4;
                                        TextInputLayout textInputLayout41 = textInputLayout24;
                                        if (C1461.f5957 > 0) {
                                            String str7 = strM2906;
                                            TextInputLayout textInputLayout42 = textInputLayout23;
                                            TextInputLayout textInputLayout43 = textInputLayout38;
                                            TextInputLayout textInputLayout44 = textInputLayout22;
                                            int i53 = i49;
                                            TextInputLayout textInputLayout45 = textInputLayout21;
                                            if (C1066.m4023() > 0) {
                                                RunnableC0195.m1442(new C5684(c22618, radioButton5, strM6675, strM6674, strM3407, textInputLayout41, textInputLayout42, textInputLayout44, textInputLayout45, textInputLayout20, textInputLayout19, textInputLayout18, dialogInterfaceC19356));
                                            } else {
                                                strM2906 = str7;
                                                textInputLayout38 = textInputLayout43;
                                                i38 = i53;
                                                iM450222 = (i44 - C19806.m45029("֫᩸")) * (-109);
                                                i33 = ((iM450222 ^ i45) * (-19299)) ^ 2083701055;
                                                i39 = -655639040;
                                                i35 = iM450222 ^ i39;
                                                i49 = i38;
                                                textInputLayout37 = textInputLayout37;
                                                str4 = str4;
                                                i47 = i35;
                                                i46 = i33;
                                            }
                                        }
                                        strM2906 = strM2906;
                                        i36 = i49;
                                        iM113019 = ThreadFactoryC3888.m11306("֫᩵") ^ i44;
                                        i33 = ((iM113019 ^ i45) * (-16275)) ^ 927165529;
                                        i37 = -1109767596;
                                        i35 = iM113019 ^ i37;
                                        i49 = i36;
                                        textInputLayout37 = textInputLayout37;
                                        str4 = str4;
                                        strM2906 = strM2906;
                                        i47 = i35;
                                        i46 = i33;
                                        break;
                                    case -1128066509:
                                    case 867130367:
                                        RunnableC3388.m10064();
                                        break;
                                    case -984949843:
                                    case 1561948971:
                                        textInputLayout37 = textInputLayout37;
                                        str4 = str4;
                                        strM2906 = strM2906;
                                        i29 = i49;
                                        sArr30 = sArr30;
                                        s = sArr29[c];
                                        s2 = 18720;
                                        if (RunnableC1564.f6300) {
                                            iM450221 = (ThreadFactoryC3888.m11306("ܽۚ") ^ i45) * 3;
                                            i33 = ((iM450221 ^ i44) * (-28057)) ^ 626643813;
                                            i34 = -715405476;
                                        } else {
                                            iM450221 = (C19806.m45029("ܺ᩺") ^ i45) * (-109);
                                            i33 = ((iM450221 ^ i44) * 18815) ^ 1807665440;
                                            i34 = -647089691;
                                        }
                                        i35 = iM450221 ^ i34;
                                        i49 = i29;
                                        sArr30 = sArr30;
                                        textInputLayout37 = textInputLayout37;
                                        str4 = str4;
                                        strM2906 = strM2906;
                                        i47 = i35;
                                        i46 = i33;
                                        break;
                                    case -878327500:
                                    case 510724998:
                                        textInputLayout37 = textInputLayout37;
                                        str4 = str4;
                                        strM2906 = strM2906;
                                        i29 = i49;
                                        sArr30 = sArr30;
                                        if ((s * s2) - ((s * s) + 87609600) <= 0) {
                                            iM450221 = (i44 - ThreadFactoryC3888.m11306("ܶ֡")) * 25;
                                            i33 = ((iM450221 ^ i45) * 1221) ^ 663362106;
                                            i34 = -1896291882;
                                        } else {
                                            iM450221 = C19806.m45029("ܶܳ") ^ i45;
                                            i33 = ((iM450221 ^ i44) * 4967) ^ (-328503608);
                                            i34 = -501956857;
                                        }
                                        i35 = iM450221 ^ i34;
                                        i49 = i29;
                                        sArr30 = sArr30;
                                        textInputLayout37 = textInputLayout37;
                                        str4 = str4;
                                        strM2906 = strM2906;
                                        i47 = i35;
                                        i46 = i33;
                                        break;
                                    case -779429760:
                                    case 938019057:
                                        textInputLayout37 = textInputLayout37;
                                        str4 = str4;
                                        strM2906 = strM2906;
                                        i29 = i49;
                                        sArr30 = sArr30;
                                        if (C2871.m8642()) {
                                            iM450221 = C19806.m45029("᩻᩺") ^ i45;
                                            i33 = ((iM450221 ^ i44) * (-25945)) ^ (-150287385);
                                            i34 = 957107510;
                                        } else {
                                            iM450221 = ThreadFactoryC3888.m11306("ۜ֨") ^ i45;
                                            i33 = ((iM450221 ^ i44) * (-30801)) ^ (-977708860);
                                            i34 = 809709761;
                                        }
                                        i35 = iM450221 ^ i34;
                                        i49 = i29;
                                        sArr30 = sArr30;
                                        textInputLayout37 = textInputLayout37;
                                        str4 = str4;
                                        strM2906 = strM2906;
                                        i47 = i35;
                                        i46 = i33;
                                        break;
                                    case -663304157:
                                    case -520496222:
                                        i49 = 64209;
                                        int iM450229 = C19806.m45029("۫۬") ^ i44;
                                        i33 = ((iM450229 ^ i45) * 8833) ^ (-2109567196);
                                        i35 = iM450229 ^ 1334506590;
                                        sArr30 = sArr30;
                                        textInputLayout37 = textInputLayout37;
                                        str4 = str4;
                                        strM2906 = strM2906;
                                        i47 = i35;
                                        i46 = i33;
                                        break;
                                    case -520924576:
                                    case 1627691222:
                                        C1461.m5080();
                                        if (RunnableC1606.m5473() == 0) {
                                            textInputLayout37 = textInputLayout37;
                                            str4 = str4;
                                            strM2906 = strM2906;
                                            i29 = i49;
                                            sArr30 = sArr30;
                                            iM450221 = ThreadFactoryC3888.m11306("᩹֨") ^ i45;
                                            i33 = ((iM450221 ^ i44) * (-12355)) ^ (-1074608651);
                                            i34 = 1804312907;
                                            i35 = iM450221 ^ i34;
                                            i49 = i29;
                                            sArr30 = sArr30;
                                            textInputLayout37 = textInputLayout37;
                                            str4 = str4;
                                            strM2906 = strM2906;
                                            i47 = i35;
                                            i46 = i33;
                                        } else {
                                            sArr28 = sArr29;
                                            textInputLayout34 = textInputLayout37;
                                            str2 = str4;
                                            str3 = strM2906;
                                            i30 = i49;
                                            sArr27 = sArr30;
                                            iM450220 = ThreadFactoryC3888.m11306("ۧۖ") ^ i44;
                                            i31 = ((iM450220 ^ i45) * 2837) ^ 1431245787;
                                            i32 = 583221059;
                                            int i54 = iM450220 ^ i32;
                                            sArr29 = sArr28;
                                            i49 = i30;
                                            sArr30 = sArr27;
                                            i46 = i31;
                                            textInputLayout37 = textInputLayout34;
                                            str4 = str2;
                                            strM2906 = str3;
                                            i47 = i54;
                                        }
                                        break;
                                    case -312123467:
                                    case 471014671:
                                        C1668.m5583();
                                        if (C1937.f7317 < 0) {
                                            textInputLayout37 = textInputLayout37;
                                            str4 = str4;
                                            strM2906 = strM2906;
                                            i36 = i49;
                                            iM113019 = ThreadFactoryC3888.m11306("֫᩵") ^ i44;
                                            i33 = ((iM113019 ^ i45) * (-16275)) ^ 927165529;
                                            i37 = -1109767596;
                                            i35 = iM113019 ^ i37;
                                            i49 = i36;
                                            textInputLayout37 = textInputLayout37;
                                            str4 = str4;
                                            strM2906 = strM2906;
                                            i47 = i35;
                                            i46 = i33;
                                        }
                                        textInputLayout37 = textInputLayout37;
                                        str4 = str4;
                                        strM2906 = strM2906;
                                        i29 = i49;
                                        sArr30 = sArr30;
                                        iM450221 = (ThreadFactoryC3888.m11306("ܽۚ") ^ i45) * 3;
                                        i33 = ((iM450221 ^ i44) * (-28057)) ^ 626643813;
                                        i34 = -715405476;
                                        i35 = iM450221 ^ i34;
                                        i49 = i29;
                                        sArr30 = sArr30;
                                        textInputLayout37 = textInputLayout37;
                                        str4 = str4;
                                        strM2906 = strM2906;
                                        i47 = i35;
                                        i46 = i33;
                                        break;
                                    case 33632456:
                                    case 1318356066:
                                        textInputLayout37 = textInputLayout37;
                                        str4 = str4;
                                        strM2906 = strM2906;
                                        i29 = i49;
                                        sArr30 = sArr30;
                                        textInputLayout38 = textInputLayout15;
                                        strM6675 = C2124.m6674(C3577.m10576(C0962.m3740(textInputLayout38)));
                                        if (C3743.m10966() <= 0) {
                                            iM450221 = ThreadFactoryC3888.m11306("᩹֨") ^ i45;
                                            i33 = ((iM450221 ^ i44) * (-12355)) ^ (-1074608651);
                                            i34 = 1804312907;
                                        } else {
                                            iM450221 = (ThreadFactoryC3888.m11306("ۜᩴ") + i45) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i33 = ((iM450221 ^ i44) * (-17649)) ^ (-1663655358);
                                            i34 = 1707689491;
                                        }
                                        i35 = iM450221 ^ i34;
                                        i49 = i29;
                                        sArr30 = sArr30;
                                        textInputLayout37 = textInputLayout37;
                                        str4 = str4;
                                        strM2906 = strM2906;
                                        i47 = i35;
                                        i46 = i33;
                                        break;
                                    case 59646850:
                                    case 1449753626:
                                        textInputLayout38.setError(C1875.m6085(iM113020));
                                        C2871.m8645(RunnableC1564.m5346(textInputLayout38));
                                        break;
                                    case 125956732:
                                    case 1984196503:
                                        textInputLayout35 = textInputLayout38;
                                        textInputLayout37 = textInputLayout37;
                                        str4 = str4;
                                        strM2906 = strM2906;
                                        i29 = i49;
                                        strM6105 = C1875.m6105(f10799, 7, 3, i29);
                                        if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                                            sArr30 = sArr30;
                                            textInputLayout38 = textInputLayout35;
                                            iM450221 = (ThreadFactoryC3888.m11306("ܽۚ") ^ i45) * 3;
                                            i33 = ((iM450221 ^ i44) * (-28057)) ^ 626643813;
                                            i34 = -715405476;
                                            i35 = iM450221 ^ i34;
                                            i49 = i29;
                                            sArr30 = sArr30;
                                            textInputLayout37 = textInputLayout37;
                                            str4 = str4;
                                            strM2906 = strM2906;
                                            i47 = i35;
                                            i46 = i33;
                                        } else {
                                            int iM113021 = (ThreadFactoryC3888.m11306("ۘ᩻") + i45) * (-77);
                                            i41 = ((iM113021 ^ i44) * (-28227)) ^ 1729303302;
                                            i42 = iM113021 ^ (-468871159);
                                            i49 = i29;
                                            textInputLayout37 = textInputLayout37;
                                            str4 = str4;
                                            strM2906 = strM2906;
                                            i47 = i42;
                                            i46 = i41;
                                            textInputLayout38 = textInputLayout35;
                                        }
                                        break;
                                    case 422394715:
                                    case 472813855:
                                        textInputLayout36.setError(C1875.m6085(iM450225 ^ i48));
                                        C1977.m6361(RunnableC1564.m5346(textInputLayout36));
                                        break;
                                    case 581208332:
                                    case 1472532400:
                                        textInputLayout34 = textInputLayout37;
                                        str2 = str4;
                                        str3 = strM2906;
                                        i30 = i49;
                                        sArr27 = sArr30;
                                        sArr28 = f10799;
                                        c = 0;
                                        if (C0629.f2722 <= 0) {
                                            iM450220 = ThreadFactoryC3888.m11306("ۧۖ") ^ i44;
                                            i31 = ((iM450220 ^ i45) * 2837) ^ 1431245787;
                                            i32 = 583221059;
                                        } else {
                                            iM450220 = (C19806.m45029("ۘ᩵") ^ i44) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i31 = ((iM450220 ^ i45) * 9863) ^ 47925817;
                                            i32 = 2068276655;
                                        }
                                        int i55 = iM450220 ^ i32;
                                        sArr29 = sArr28;
                                        i49 = i30;
                                        sArr30 = sArr27;
                                        i46 = i31;
                                        textInputLayout37 = textInputLayout34;
                                        str4 = str2;
                                        strM2906 = str3;
                                        i47 = i55;
                                        break;
                                    case 1212261282:
                                    case 1869889437:
                                        C1668.m5582(ThreadFactoryC3888.m11306(strM2906) ^ 2127704856);
                                        break;
                                    default:
                                        C1066.m4023();
                                        sArr28 = sArr29;
                                        textInputLayout34 = textInputLayout37;
                                        str2 = str4;
                                        str3 = strM2906;
                                        i30 = i49;
                                        sArr27 = sArr30;
                                        iM450220 = ThreadFactoryC3888.m11306("ۧۖ") ^ i44;
                                        i31 = ((iM450220 ^ i45) * 2837) ^ 1431245787;
                                        i32 = 583221059;
                                        int i56 = iM450220 ^ i32;
                                        sArr29 = sArr28;
                                        i49 = i30;
                                        sArr30 = sArr27;
                                        i46 = i31;
                                        textInputLayout37 = textInputLayout34;
                                        str4 = str2;
                                        strM2906 = str3;
                                        i47 = i56;
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    break;
                case -270846477:
                case 1388983942:
                    TextInputLayout textInputLayout34 = textInputLayout15;
                    textInputLayout24 = textInputLayout24;
                    textInputLayout22 = textInputLayout22;
                    view3 = view3;
                    c12564 = c12564;
                    textInputLayout23 = textInputLayout23;
                    textInputLayout20 = textInputLayout20;
                    radioButton2 = radioButton2;
                    view4 = view4;
                    textView2 = textView2;
                    short[] sArr27 = sArr10;
                    TextInputLayout textInputLayout35 = (TextInputLayout) C3743.m10957(view3, ThreadFactoryC3888.m11306(RunnableC1564.m5344(sArr27, 7, 3, i26)) ^ 2119241928);
                    sArr11 = f73701;
                    i22 = 10;
                    int iM450220 = C19806.m45029("ᩴܺ") ^ i19;
                    i21 = iM450220 ^ (-1965611690);
                    i20 = ((iM450220 ^ i18) * (-29411)) ^ (-1881865067);
                    sArr10 = sArr27;
                    sArr18 = sArr18;
                    c8069 = c8069;
                    viewOnClickListenerC8975 = viewOnClickListenerC8975;
                    textInputLayout21 = textInputLayout21;
                    i24 = i24;
                    sArr20 = sArr20;
                    i25 = i25;
                    textInputLayout19 = textInputLayout19;
                    editTextM5346 = editTextM5346;
                    textInputLayout15 = textInputLayout34;
                    textInputLayout16 = textInputLayout35;
                    sArr16 = sArr16;
                    sArr15 = sArr15;
                    sArr13 = sArr13;
                    i23 = i23;
                    radioButton2 = radioButton2;
                    textInputLayout20 = textInputLayout20;
                    textView2 = textView2;
                    view4 = view4;
                    view3 = view3;
                    textInputLayout23 = textInputLayout23;
                    textInputLayout22 = textInputLayout22;
                    c12564 = c12564;
                    textInputLayout24 = textInputLayout24;
                    break;
                case -176217403:
                case 354269044:
                    if (C2249.f8050 < 0) {
                        textInputLayout15 = textInputLayout15;
                        textInputLayout16 = textInputLayout16;
                        textInputLayout24 = textInputLayout24;
                        textInputLayout22 = textInputLayout22;
                        textInputLayout19 = textInputLayout19;
                        view3 = view3;
                        c12564 = c12564;
                        editTextM5346 = editTextM5346;
                        c8069 = c8069;
                        sArr = sArr9;
                        i22 = i22;
                        sArr13 = sArr13;
                        i23 = i23;
                        sArr15 = sArr15;
                        sArr16 = sArr16;
                        sArr20 = sArr20;
                        i24 = i24;
                        i25 = i25;
                        textInputLayout23 = textInputLayout23;
                        textInputLayout20 = textInputLayout20;
                        radioButton2 = radioButton2;
                        view4 = view4;
                        textView2 = textView2;
                        viewOnClickListenerC8975 = viewOnClickListenerC8975;
                        textInputLayout21 = textInputLayout21;
                        sArr18 = sArr18;
                        int iM4502111 = (C19806.m45029("ۜ᩸") + i18) * (-127);
                        i21 = iM4502111 ^ (-2107438474);
                        sArr9 = sArr;
                        i20 = ((iM4502111 ^ i19) * 6241) ^ (-448135367);
                        sArr18 = sArr18;
                        c8069 = c8069;
                        viewOnClickListenerC8975 = viewOnClickListenerC8975;
                        textInputLayout21 = textInputLayout21;
                        i24 = i24;
                        sArr20 = sArr20;
                        i25 = i25;
                        textInputLayout19 = textInputLayout19;
                        editTextM5346 = editTextM5346;
                        textInputLayout15 = textInputLayout15;
                        textInputLayout16 = textInputLayout16;
                        sArr16 = sArr16;
                        sArr15 = sArr15;
                        sArr13 = sArr13;
                        i23 = i23;
                        i22 = i22;
                        radioButton2 = radioButton2;
                        textInputLayout20 = textInputLayout20;
                        textView2 = textView2;
                        view4 = view4;
                        view3 = view3;
                        textInputLayout23 = textInputLayout23;
                        textInputLayout22 = textInputLayout22;
                        c12564 = c12564;
                        textInputLayout24 = textInputLayout24;
                    } else {
                        textInputLayout9 = textInputLayout24;
                        textInputLayout11 = textInputLayout22;
                        textInputLayout12 = textInputLayout19;
                        view = view3;
                        c12562 = c12564;
                        editText3 = editTextM5346;
                        c8068 = c8069;
                        sArr7 = sArr20;
                        i12 = i24;
                        i13 = i25;
                        textInputLayout10 = textInputLayout23;
                        textInputLayout14 = textInputLayout20;
                        radioButton = radioButton2;
                        view2 = view4;
                        textView = textView2;
                        viewOnClickListenerC8974 = viewOnClickListenerC8975;
                        textInputLayout13 = textInputLayout21;
                        sArr8 = sArr18;
                        iM450212 = (C19806.m45029("۬᩺") + i18) * 25;
                        c12563 = c12562;
                        i14 = ((iM450212 ^ i19) * (-29549)) ^ 1473885356;
                        i15 = 339027251;
                        i21 = iM450212 ^ i15;
                        i20 = i14;
                        sArr18 = sArr8;
                        c8069 = c8068;
                        viewOnClickListenerC8975 = viewOnClickListenerC8974;
                        textInputLayout21 = textInputLayout13;
                        textInputLayout24 = textInputLayout9;
                        i24 = i12;
                        sArr20 = sArr7;
                        i25 = i13;
                        textInputLayout19 = textInputLayout12;
                        editTextM5346 = editText3;
                        radioButton2 = radioButton;
                        textInputLayout20 = textInputLayout14;
                        textView2 = textView;
                        view4 = view2;
                        view3 = view;
                        textInputLayout23 = textInputLayout10;
                        textInputLayout22 = textInputLayout11;
                        c12564 = c12563;
                    }
                    break;
                case -45474724:
                case 1595528544:
                    textInputLayout24 = textInputLayout24;
                    textInputLayout22 = textInputLayout22;
                    textInputLayout7 = textInputLayout19;
                    view3 = view3;
                    c12564 = c12564;
                    c8067 = c8069;
                    sArr6 = sArr20;
                    i4 = i24;
                    i5 = i25;
                    textInputLayout23 = textInputLayout23;
                    textInputLayout20 = textInputLayout20;
                    radioButton2 = radioButton2;
                    view4 = view4;
                    textView2 = textView2;
                    textInputLayout8 = textInputLayout21;
                    viewOnClickListenerC8973 = viewOnClickListenerC8975;
                    EditText editText5 = editTextM5346;
                    MenuItemOnMenuItemClickListenerC3244.m9704(editText5, Locale.getDefault().getCountry());
                    editText2 = editText5;
                    C1668.m5571(c12564, new C4459(1, view4));
                    if (this.f73703 != null) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖ᩶") ^ i19;
                        i6 = ((iM45029 ^ i18) * 15225) ^ (-1973244224);
                        i7 = 621452335;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸۬") ^ i19;
                        i6 = ((iM45029 ^ i18) * 6253) ^ (-1716782870);
                        i7 = 1291873939;
                    }
                    i21 = iM45029 ^ i7;
                    i20 = i6;
                    c8069 = c8067;
                    viewOnClickListenerC8975 = viewOnClickListenerC8973;
                    textInputLayout21 = textInputLayout8;
                    i24 = i4;
                    sArr20 = sArr6;
                    i25 = i5;
                    textInputLayout19 = textInputLayout7;
                    editTextM5346 = editText2;
                    radioButton2 = radioButton2;
                    textInputLayout20 = textInputLayout20;
                    textView2 = textView2;
                    view4 = view4;
                    view3 = view3;
                    textInputLayout23 = textInputLayout23;
                    textInputLayout22 = textInputLayout22;
                    c12564 = c12564;
                    textInputLayout24 = textInputLayout24;
                    break;
                case 53381724:
                case 93975899:
                    textInputLayout24 = textInputLayout24;
                    c12564 = c12564;
                    textView2 = (TextView) viewM10957;
                    textInputLayout23 = textInputLayout23;
                    textInputLayout22 = textInputLayout22;
                    iM11307 = ThreadFactoryC3888.m11306(C0817.m3406(f73701, 55, 3, i26));
                    i16 = 2124598797;
                    if (C1377.f5749) {
                        iM450211 = (C19806.m45029("۫ᩴ") + i19) * (-51);
                        i10 = ((iM450211 ^ i18) * (-15755)) ^ (-296799588);
                        i11 = -115762424;
                    } else {
                        iM450211 = ThreadFactoryC3888.m11306("᩵ܶ") ^ i19;
                        i10 = ((iM450211 ^ i18) * 19867) ^ 1569474707;
                        i11 = -1991003433;
                    }
                    i21 = iM450211 ^ i11;
                    i20 = i10;
                    textInputLayout23 = textInputLayout23;
                    textInputLayout22 = textInputLayout22;
                    c12564 = c12564;
                    textInputLayout24 = textInputLayout24;
                    break;
                case 167494960:
                case 494641612:
                    textInputLayout16 = textInputLayout16;
                    textInputLayout24 = textInputLayout24;
                    textInputLayout22 = textInputLayout22;
                    textInputLayout19 = textInputLayout19;
                    view3 = view3;
                    c12564 = c12564;
                    editTextM5346 = editTextM5346;
                    c8069 = c8069;
                    sArr13 = sArr13;
                    i23 = i23;
                    sArr15 = sArr15;
                    sArr16 = sArr16;
                    sArr20 = sArr20;
                    i24 = i24;
                    i25 = i25;
                    textInputLayout23 = textInputLayout23;
                    textInputLayout20 = textInputLayout20;
                    radioButton2 = radioButton2;
                    view4 = view4;
                    textView2 = textView2;
                    viewOnClickListenerC8975 = viewOnClickListenerC8975;
                    textInputLayout21 = textInputLayout21;
                    sArr18 = sArr18;
                    i22 = i22;
                    sArr = sArr9;
                    TextInputLayout textInputLayout36 = (TextInputLayout) C2642.m8167(view3, ThreadFactoryC3888.m11306(C0797.m3361(sArr, 4, 3, i26)) ^ 2120284972);
                    sArr10 = f73701;
                    if (C1419.m4973()) {
                        textInputLayout15 = textInputLayout36;
                        int iM4502112 = (C19806.m45029("ۜ᩸") + i18) * (-127);
                        i21 = iM4502112 ^ (-2107438474);
                        sArr9 = sArr;
                        i20 = ((iM4502112 ^ i19) * 6241) ^ (-448135367);
                    } else {
                        int iM113019 = (i18 - ThreadFactoryC3888.m11306("ᩴۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        textInputLayout15 = textInputLayout36;
                        i21 = iM113019 ^ (-32965327);
                        i20 = ((iM113019 ^ i19) * 20817) ^ (-944640256);
                        sArr9 = sArr;
                    }
                    sArr18 = sArr18;
                    c8069 = c8069;
                    viewOnClickListenerC8975 = viewOnClickListenerC8975;
                    textInputLayout21 = textInputLayout21;
                    i24 = i24;
                    sArr20 = sArr20;
                    i25 = i25;
                    textInputLayout19 = textInputLayout19;
                    editTextM5346 = editTextM5346;
                    textInputLayout15 = textInputLayout15;
                    textInputLayout16 = textInputLayout16;
                    sArr16 = sArr16;
                    sArr15 = sArr15;
                    sArr13 = sArr13;
                    i23 = i23;
                    i22 = i22;
                    radioButton2 = radioButton2;
                    textInputLayout20 = textInputLayout20;
                    textView2 = textView2;
                    view4 = view4;
                    view3 = view3;
                    textInputLayout23 = textInputLayout23;
                    textInputLayout22 = textInputLayout22;
                    c12564 = c12564;
                    textInputLayout24 = textInputLayout24;
                    break;
                case 194828228:
                case 431658399:
                    TextInputLayout textInputLayout37 = textInputLayout15;
                    textInputLayout24 = textInputLayout24;
                    TextInputLayout textInputLayout38 = textInputLayout22;
                    View view7 = view3;
                    c12564 = c12564;
                    textInputLayout23 = textInputLayout23;
                    view4 = view4;
                    TextInputLayout textInputLayout39 = (TextInputLayout) C2642.m8167(view7, ThreadFactoryC3888.m11306(RunnableC0195.m1429(f73701, 25, 3, i26)) ^ 2124353384);
                    sArr16 = f73701;
                    int iM113020 = ThreadFactoryC3888.m11306("ܳᩳ") ^ i19;
                    i21 = iM113020 ^ 724902556;
                    i20 = ((iM113020 ^ i18) * 28639) ^ (-1103891835);
                    view3 = view7;
                    sArr18 = sArr18;
                    c8069 = c8069;
                    viewOnClickListenerC8975 = viewOnClickListenerC8975;
                    textInputLayout21 = textInputLayout21;
                    textInputLayout22 = textInputLayout38;
                    i24 = i24;
                    sArr20 = sArr20;
                    i25 = i25;
                    textInputLayout19 = textInputLayout19;
                    editTextM5346 = editTextM5346;
                    textInputLayout15 = textInputLayout37;
                    textInputLayout16 = textInputLayout16;
                    radioButton2 = radioButton2;
                    textView2 = textView2;
                    textInputLayout20 = textInputLayout39;
                    view4 = view4;
                    textInputLayout23 = textInputLayout23;
                    c12564 = c12564;
                    textInputLayout24 = textInputLayout24;
                    break;
                case 209844376:
                case 417991808:
                    textInputLayout24 = textInputLayout24;
                    textInputLayout22 = textInputLayout22;
                    view3 = view3;
                    c12564 = c12564;
                    textInputLayout23 = textInputLayout23;
                    textInputLayout20 = textInputLayout20;
                    radioButton2 = radioButton2;
                    view4 = view4;
                    textView2 = textView2;
                    TextInputLayout textInputLayout40 = textInputLayout21;
                    short[] sArr28 = sArr17;
                    TextInputLayout textInputLayout41 = (TextInputLayout) C3743.m10957(view3, C19806.m45029(C0526.m2424(sArr28, 31, 3, i26)) ^ 2123197685);
                    sArr18 = f73701;
                    int iM113021 = (i18 - ThreadFactoryC3888.m11306("᩸۠")) * 13;
                    i21 = iM113021 ^ (-1130150507);
                    i20 = ((iM113021 ^ i19) * 5413) ^ (-1856980690);
                    c8069 = c8069;
                    sArr17 = sArr28;
                    viewOnClickListenerC8975 = viewOnClickListenerC8975;
                    textInputLayout21 = textInputLayout40;
                    i24 = i24;
                    sArr20 = sArr20;
                    i25 = i25;
                    textInputLayout19 = textInputLayout19;
                    editTextM5346 = editTextM5346;
                    textInputLayout18 = textInputLayout41;
                    radioButton2 = radioButton2;
                    textInputLayout20 = textInputLayout20;
                    textView2 = textView2;
                    view4 = view4;
                    view3 = view3;
                    textInputLayout23 = textInputLayout23;
                    textInputLayout22 = textInputLayout22;
                    c12564 = c12564;
                    textInputLayout24 = textInputLayout24;
                    break;
                case 225193729:
                case 963500199:
                    textInputLayout15 = textInputLayout15;
                    textInputLayout16 = textInputLayout16;
                    textInputLayout24 = textInputLayout24;
                    textInputLayout22 = textInputLayout22;
                    textInputLayout19 = textInputLayout19;
                    view3 = view3;
                    c12564 = c12564;
                    editTextM5346 = editTextM5346;
                    c8069 = c8069;
                    sArr9 = sArr9;
                    sArr10 = sArr10;
                    i22 = i22;
                    sArr13 = sArr13;
                    i23 = i23;
                    sArr15 = sArr15;
                    sArr16 = sArr16;
                    sArr20 = sArr20;
                    i24 = i24;
                    i25 = i25;
                    textInputLayout23 = textInputLayout23;
                    textInputLayout20 = textInputLayout20;
                    radioButton2 = radioButton2;
                    view4 = view4;
                    textView2 = textView2;
                    viewOnClickListenerC8975 = viewOnClickListenerC8975;
                    textInputLayout21 = textInputLayout21;
                    sArr18 = sArr18;
                    short s = f73701[0];
                    if (((s * s) + 82174225) - (s * 18130) >= 0) {
                        iM11306 = C19806.m45029("᩹ۗ") ^ i19;
                        i = ((iM11306 ^ i18) * 12269) ^ 536926677;
                        i2 = -550387615;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧۚ") ^ i18) * 97;
                        i = ((iM11306 ^ i19) * (-12649)) ^ (-1609977673);
                        i2 = -1284896252;
                    }
                    i21 = iM11306 ^ i2;
                    i20 = i;
                    sArr9 = sArr9;
                    sArr10 = sArr10;
                    sArr18 = sArr18;
                    c8069 = c8069;
                    viewOnClickListenerC8975 = viewOnClickListenerC8975;
                    textInputLayout21 = textInputLayout21;
                    i24 = i24;
                    sArr20 = sArr20;
                    i25 = i25;
                    textInputLayout19 = textInputLayout19;
                    editTextM5346 = editTextM5346;
                    textInputLayout15 = textInputLayout15;
                    textInputLayout16 = textInputLayout16;
                    sArr16 = sArr16;
                    sArr15 = sArr15;
                    sArr13 = sArr13;
                    i23 = i23;
                    i22 = i22;
                    radioButton2 = radioButton2;
                    textInputLayout20 = textInputLayout20;
                    textView2 = textView2;
                    view4 = view4;
                    view3 = view3;
                    textInputLayout23 = textInputLayout23;
                    textInputLayout22 = textInputLayout22;
                    c12564 = c12564;
                    textInputLayout24 = textInputLayout24;
                    break;
                case 291221709:
                case 1974960446:
                    textInputLayout24 = textInputLayout24;
                    textInputLayout22 = textInputLayout22;
                    textInputLayout7 = textInputLayout19;
                    view3 = view3;
                    c12564 = c12564;
                    editText2 = editTextM5346;
                    c8067 = c8069;
                    sArr6 = sArr20;
                    i4 = i24;
                    i5 = i25;
                    textInputLayout23 = textInputLayout23;
                    textInputLayout20 = textInputLayout20;
                    radioButton2 = radioButton2;
                    view4 = view4;
                    textView2 = textView2;
                    viewOnClickListenerC8973 = viewOnClickListenerC8975;
                    textInputLayout8 = textInputLayout21;
                    radioButton3 = (RadioButton) C3743.m10957(view3, ThreadFactoryC3888.m11306(C3535.m10423(f73701, 37, 3, i26)) ^ 2128174069);
                    sArr19 = f73701;
                    iM45029 = (C19806.m45029("ۚ֡") ^ i19) * (-9);
                    i6 = ((iM45029 ^ i18) * (-32607)) ^ 1306689652;
                    i7 = 257283227;
                    i21 = iM45029 ^ i7;
                    i20 = i6;
                    c8069 = c8067;
                    viewOnClickListenerC8975 = viewOnClickListenerC8973;
                    textInputLayout21 = textInputLayout8;
                    i24 = i4;
                    sArr20 = sArr6;
                    i25 = i5;
                    textInputLayout19 = textInputLayout7;
                    editTextM5346 = editText2;
                    radioButton2 = radioButton2;
                    textInputLayout20 = textInputLayout20;
                    textView2 = textView2;
                    view4 = view4;
                    view3 = view3;
                    textInputLayout23 = textInputLayout23;
                    textInputLayout22 = textInputLayout22;
                    c12564 = c12564;
                    textInputLayout24 = textInputLayout24;
                    break;
                case 358736576:
                case 996213899:
                    textInputLayout24 = textInputLayout24;
                    textInputLayout22 = textInputLayout22;
                    view3 = view3;
                    c12564 = c12564;
                    textInputLayout23 = textInputLayout23;
                    textInputLayout20 = textInputLayout20;
                    view4 = view4;
                    textView2 = textView2;
                    TextInputLayout textInputLayout42 = textInputLayout21;
                    C11150.m28071(textInputLayout15);
                    C11150.m28071(textInputLayout16);
                    C11150.m28071(textInputLayout17);
                    radioButton2 = radioButton2;
                    ViewOnClickListenerC8972 viewOnClickListenerC8977 = new ViewOnClickListenerC8972(radioButton3, radioButton2, 2);
                    C1937.m6291(radioButton3, viewOnClickListenerC8977);
                    C7105.m18993(radioButton2, viewOnClickListenerC8977);
                    int iM450221 = C19806.m45029("᩵᩷") ^ i18;
                    i21 = iM450221 ^ 1263501925;
                    i20 = ((iM450221 ^ i19) * (-15173)) ^ (-1981255537);
                    c8069 = c8069;
                    viewOnClickListenerC8975 = viewOnClickListenerC8977;
                    textInputLayout21 = textInputLayout42;
                    i24 = i24;
                    sArr20 = sArr20;
                    i25 = i25;
                    textInputLayout19 = textInputLayout19;
                    radioButton2 = radioButton2;
                    textInputLayout20 = textInputLayout20;
                    textView2 = textView2;
                    view4 = view4;
                    view3 = view3;
                    textInputLayout23 = textInputLayout23;
                    textInputLayout22 = textInputLayout22;
                    c12564 = c12564;
                    textInputLayout24 = textInputLayout24;
                    break;
                case 1268066824:
                case 1549920900:
                    if (C2642.f10294 <= 0) {
                        textInputLayout = textInputLayout15;
                        textInputLayout2 = textInputLayout16;
                        textInputLayout24 = textInputLayout24;
                        textInputLayout5 = textInputLayout23;
                        textInputLayout22 = textInputLayout22;
                        textInputLayout3 = textInputLayout19;
                        view3 = view3;
                        view4 = view4;
                        c12564 = c12564;
                        textView2 = textView2;
                        editText = editTextM5346;
                        sArr5 = sArr13;
                        i3 = i23;
                        sArr2 = sArr15;
                        sArr3 = sArr16;
                        textInputLayout4 = textInputLayout21;
                        textInputLayout20 = textInputLayout20;
                        radioButton2 = radioButton2;
                        viewOnClickListenerC8972 = viewOnClickListenerC8975;
                        sArr4 = sArr18;
                        int iM1130110 = ThreadFactoryC3888.m11306("ᩳᩳ") ^ i19;
                        textInputLayout23 = textInputLayout5;
                        i21 = iM1130110 ^ (-46953879);
                        i20 = ((iM1130110 ^ i18) * (-31461)) ^ 1874576326;
                        sArr13 = sArr5;
                        i23 = i3;
                        sArr18 = sArr4;
                        viewOnClickListenerC8975 = viewOnClickListenerC8972;
                        textInputLayout21 = textInputLayout4;
                        textInputLayout19 = textInputLayout3;
                        editTextM5346 = editText;
                        textInputLayout15 = textInputLayout;
                        textInputLayout16 = textInputLayout2;
                        sArr16 = sArr3;
                        sArr15 = sArr2;
                        radioButton2 = radioButton2;
                        textInputLayout20 = textInputLayout20;
                        textView2 = textView2;
                        view4 = view4;
                        view3 = view3;
                        textInputLayout23 = textInputLayout23;
                        textInputLayout22 = textInputLayout22;
                        c12564 = c12564;
                        textInputLayout24 = textInputLayout24;
                    }
                    textInputLayout24 = textInputLayout24;
                    textInputLayout22 = textInputLayout22;
                    c12564 = c12564;
                    textInputLayout23 = textInputLayout23;
                    iM450211 = ThreadFactoryC3888.m11306("᩵ܶ") ^ i19;
                    i10 = ((iM450211 ^ i18) * 19867) ^ 1569474707;
                    i11 = -1991003433;
                    i21 = iM450211 ^ i11;
                    i20 = i10;
                    textInputLayout23 = textInputLayout23;
                    textInputLayout22 = textInputLayout22;
                    c12564 = c12564;
                    textInputLayout24 = textInputLayout24;
                    break;
                case 1288477521:
                case 1369440205:
                    textInputLayout24 = textInputLayout24;
                    textInputLayout22 = textInputLayout22;
                    view3 = view3;
                    c12564 = c12564;
                    short[] sArr29 = sArr20;
                    textInputLayout23 = textInputLayout23;
                    TextInputLayout textInputLayout43 = textInputLayout20;
                    view4 = view4;
                    textView2 = textView2;
                    int i29 = i25;
                    TextInputLayout textInputLayout44 = textInputLayout21;
                    int i30 = i24;
                    textInputLayout3 = textInputLayout19;
                    C8067 c80610 = c8069;
                    dialogInterfaceC19356M10334 = C3509.m10334(c80610, ThreadFactoryC3888.m11306(C1460.m5047(sArr29, i30, i29, i26)) ^ 2101281489, (DialogInterface.OnClickListener) null, C19806.m45029(C3722.m10901(f73701, 49, 3, i26)) ^ 2128263165, (DialogInterface.OnClickListener) null);
                    if (C1977.m6366()) {
                        iM450210 = C19806.m45029("ܿᩴ") ^ i19;
                        i8 = ((iM450210 ^ i18) * (-28853)) ^ (-1111663677);
                        i9 = 547382979;
                    } else {
                        iM450210 = (C19806.m45029("ܳܳ") ^ i18) * 65;
                        i8 = ((iM450210 ^ i19) * 32721) ^ 606762869;
                        i9 = 1031359262;
                    }
                    i21 = iM450210 ^ i9;
                    i20 = i8;
                    c8069 = c80610;
                    textInputLayout20 = textInputLayout43;
                    textInputLayout21 = textInputLayout44;
                    i24 = i30;
                    sArr20 = sArr29;
                    i25 = i29;
                    textInputLayout19 = textInputLayout3;
                    view3 = view3;
                    textView2 = textView2;
                    textInputLayout22 = textInputLayout22;
                    view4 = view4;
                    textInputLayout23 = textInputLayout23;
                    c12564 = c12564;
                    textInputLayout24 = textInputLayout24;
                    break;
                case 1327588817:
                case 1360790604:
                    textInputLayout = textInputLayout15;
                    textInputLayout2 = textInputLayout16;
                    textInputLayout24 = textInputLayout24;
                    textInputLayout22 = textInputLayout22;
                    textInputLayout3 = textInputLayout19;
                    view3 = view3;
                    view4 = view4;
                    c12564 = c12564;
                    textView2 = textView2;
                    editText = editTextM5346;
                    C8067 c80611 = c8069;
                    sArr3 = sArr16;
                    short[] sArr30 = sArr20;
                    int i31 = i24;
                    int i32 = i25;
                    textInputLayout4 = textInputLayout21;
                    textInputLayout20 = textInputLayout20;
                    radioButton2 = radioButton2;
                    viewOnClickListenerC8972 = viewOnClickListenerC8975;
                    sArr4 = sArr18;
                    sArr2 = sArr15;
                    sArr5 = sArr13;
                    i3 = i23;
                    textInputLayout5 = (TextInputLayout) C3743.m10957(view3, C19806.m45029(C2704.m8240(sArr5, i3, 3, i26)) ^ 2123542853);
                    sArr14 = f73701;
                    if (C2332.f8260) {
                        int iM450222 = C19806.m45029("۟ۤ") ^ i19;
                        i21 = iM450222 ^ (-738201099);
                        i20 = ((iM450222 ^ i18) * 12271) ^ (-1826664179);
                        sArr13 = sArr5;
                        i23 = i3;
                        c12564 = c12564;
                        sArr18 = sArr4;
                        c8069 = c80611;
                        viewOnClickListenerC8975 = viewOnClickListenerC8972;
                        textInputLayout21 = textInputLayout4;
                        textInputLayout24 = textInputLayout24;
                        i24 = i31;
                        sArr20 = sArr30;
                        i25 = i32;
                        textInputLayout19 = textInputLayout3;
                        editTextM5346 = editText;
                        textInputLayout15 = textInputLayout;
                        textInputLayout16 = textInputLayout2;
                        sArr16 = sArr3;
                        sArr15 = sArr2;
                        radioButton2 = radioButton2;
                        textInputLayout20 = textInputLayout20;
                        textView2 = textView2;
                        view4 = view4;
                        view3 = view3;
                        textInputLayout22 = textInputLayout22;
                        textInputLayout23 = textInputLayout5;
                    } else {
                        c8069 = c80611;
                        i24 = i31;
                        sArr20 = sArr30;
                        i25 = i32;
                        int iM1130111 = ThreadFactoryC3888.m11306("ᩳᩳ") ^ i19;
                        textInputLayout23 = textInputLayout5;
                        i21 = iM1130111 ^ (-46953879);
                        i20 = ((iM1130111 ^ i18) * (-31461)) ^ 1874576326;
                        sArr13 = sArr5;
                        i23 = i3;
                        sArr18 = sArr4;
                        viewOnClickListenerC8975 = viewOnClickListenerC8972;
                        textInputLayout21 = textInputLayout4;
                        textInputLayout19 = textInputLayout3;
                        editTextM5346 = editText;
                        textInputLayout15 = textInputLayout;
                        textInputLayout16 = textInputLayout2;
                        sArr16 = sArr3;
                        sArr15 = sArr2;
                        radioButton2 = radioButton2;
                        textInputLayout20 = textInputLayout20;
                        textView2 = textView2;
                        view4 = view4;
                        view3 = view3;
                        textInputLayout23 = textInputLayout23;
                        textInputLayout22 = textInputLayout22;
                        c12564 = c12564;
                        textInputLayout24 = textInputLayout24;
                    }
                    break;
                case 1406377916:
                case 1812492584:
                    C1668.m5582(C19806.m45029(C1398.m4892(f73701, 60, 3, i26)) ^ 2127654614);
                    int iM1130112 = (ThreadFactoryC3888.m11306("᩵ᩴ") ^ i19) * (-13);
                    i21 = iM1130112 ^ 1840673289;
                    i20 = ((iM1130112 ^ i18) * (-12213)) ^ 1727497105;
                    textInputLayout24 = textInputLayout24;
                    break;
                case 1442697492:
                case 2120994473:
                    textInputLayout24 = textInputLayout24;
                    MenuItemOnMenuItemClickListenerC3244.m9704(editText4, RunnableC0195.m1437(str, CallableC1627.m5502(f73701, 58, 2, i26), ""));
                    textInputLayout22 = textInputLayout22;
                    textInputLayout7 = textInputLayout19;
                    view3 = view3;
                    c12564 = c12564;
                    editText2 = editTextM5346;
                    c8067 = c8069;
                    sArr6 = sArr20;
                    i4 = i24;
                    i5 = i25;
                    textInputLayout23 = textInputLayout23;
                    textInputLayout20 = textInputLayout20;
                    radioButton2 = radioButton2;
                    view4 = view4;
                    textView2 = textView2;
                    viewOnClickListenerC8973 = viewOnClickListenerC8975;
                    textInputLayout8 = textInputLayout21;
                    iM45029 = ThreadFactoryC3888.m11306("᩸۬") ^ i19;
                    i6 = ((iM45029 ^ i18) * 6253) ^ (-1716782870);
                    i7 = 1291873939;
                    i21 = iM45029 ^ i7;
                    i20 = i6;
                    c8069 = c8067;
                    viewOnClickListenerC8975 = viewOnClickListenerC8973;
                    textInputLayout21 = textInputLayout8;
                    i24 = i4;
                    sArr20 = sArr6;
                    i25 = i5;
                    textInputLayout19 = textInputLayout7;
                    editTextM5346 = editText2;
                    radioButton2 = radioButton2;
                    textInputLayout20 = textInputLayout20;
                    textView2 = textView2;
                    view4 = view4;
                    view3 = view3;
                    textInputLayout23 = textInputLayout23;
                    textInputLayout22 = textInputLayout22;
                    c12564 = c12564;
                    textInputLayout24 = textInputLayout24;
                    break;
                default:
                    textInputLayout24 = textInputLayout24;
                    TextInputLayout textInputLayout45 = textInputLayout22;
                    c12564 = c12564;
                    TextView textView4 = textView2;
                    textInputLayout23 = textInputLayout23;
                    view4 = view4;
                    TextInputLayout textInputLayout46 = textInputLayout21;
                    View view8 = view3;
                    viewM10957 = C3743.m10957(view8, ThreadFactoryC3888.m11306(C0797.m3361(f73701, 52, 3, i26)) ^ 2120983634);
                    int iM113022 = ThreadFactoryC3888.m11306("ۧۖ") ^ i18;
                    i21 = iM113022 ^ (-797457598);
                    view3 = view8;
                    i20 = ((iM113022 ^ i19) * (-15273)) ^ 717363989;
                    textInputLayout21 = textInputLayout46;
                    textInputLayout22 = textInputLayout45;
                    textView2 = textView4;
                    view4 = view4;
                    textInputLayout23 = textInputLayout23;
                    c12564 = c12564;
                    textInputLayout24 = textInputLayout24;
                    break;
            }
            return;
        }
    }
}
