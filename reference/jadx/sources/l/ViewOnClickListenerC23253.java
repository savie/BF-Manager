package l;

import android.R;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.AdapterView;
import com.alipay.sdk.m.p.a;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩺᩸ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5MD */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC23253 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۧ᩻ۤ, reason: not valid java name and contains not printable characters */
    private static final short[] f75433 = {5028, 7173, -14923, 9504, 8320, -16736, -16736, -16701, -16690, -16736, -16689, -16700, -16674, -16680, -16685, -16693, -16700, -16690, -16680, -16699, -16701, -16690, -16752, -16763, -16701, -16690, -16736, -16678, -16693, -16680, -16689, -16700, -16674, -16745, 2440, -4999, 5465, 25698, 25700, 25713, 25721, 25625, 994, -12277, 5858, 15260, 15255, 15256, 15259, 15253, 15260, 15270, 15259, 15248, 15255, 15270, 15258, 15254, 15255, 15247, 15260, 15243, 15245, 15260, 15255, 15256, 15259, 15253, 15260, 15270, 15254, 15258, 15245, 15270, 15258, 15254, 15255, 15247, 15260, 15243, 15245, 15322, 15279, 15256, 15253, 15244, 15260, 15347, 15305, 15259, 15270, 15321, 15347, 15286, 15258, 15245, 15347, 15293, 15260, 15258, 15347, 15281, 15260, 15233, 15305, 15233, 15256, 15245, 15245, 15243, 15347, 15291, 15248, 15255, 15291, 15248, 15255, 15281, 15260, 15233, 15347, 15305, 15259, 15347, 15305, 15233, 15305, 15302, 15302, 15302, 15286, 15258, 15245, 15293, 15260, 15258, 15347, 15248, 15261, 15324, 15305, 15297, 15233, 15321, 6763, 15321, 15302, 15302, 15302, 15347, 15305, 433, -5890, 8005, -11491, 4819, 808, 3452, 4503, 408, 4261, 2162, -7002, -5865, -1890, -12281, -954};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C6037 f75434;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ViewOnClickListenerC6361 f75435;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15492 f75436;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C4201 f75437;

    public ViewOnClickListenerC23253(ViewOnClickListenerC6361 viewOnClickListenerC6361, View view, C6037 c6037) {
        short[] sArr;
        int iM11306;
        int i;
        int i2;
        View viewM10957 = null;
        C15492 c15492 = null;
        int i3 = 0;
        int iM45029 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = -1555763987;
        int i6 = RunnableC0195.f1321;
        int i7 = C3577.f13150;
        short s = f75433[0];
        int i8 = ((s * s) + 198471744) - (s * 28176) >= 0 ? 19131 : 58220;
        int iM450210 = C19806.m45029("ᩴ۬") ^ i7;
        int i9 = ((iM450210 ^ i6) * (-26011)) ^ 1888606743;
        int i10 = 1358477579;
        while (true) {
            int i11 = iM450210 ^ i10;
            while (true) {
                i5 = ((((i5 ^ i6) * (-28381)) >> 31) & i9) ^ i11;
                switch (i5) {
                    case -2059304439:
                    case 1241454195:
                        i3 = R.id.button1;
                        if (AbstractC0464.m2313() == 0) {
                            iM450210 = C19806.m45029("ۜܳ") ^ i6;
                            i9 = ((iM450210 ^ i7) * (-15645)) ^ 1251799764;
                            i10 = 186523712;
                        } else {
                            iM450210 = C19806.m45029("ۤۘ") ^ i7;
                            i9 = ((iM450210 ^ i6) * 20993) ^ 152932271;
                            i10 = 1249734088;
                        }
                        break;
                    case -1841179520:
                    case -489876693:
                        i4 = 1;
                        if (C0629.m2907()) {
                            iM450210 = (C19806.m45029("ۜ۬") ^ i7) * 95;
                            i9 = ((iM450210 ^ i6) * (-13409)) ^ 553319719;
                            i10 = 372764201;
                        }
                        sArr = sArr2;
                        iM11306 = C19806.m45029("ۖۙ") ^ i7;
                        i = ((iM11306 ^ i6) * (-17707)) ^ 739137418;
                        i2 = 1608391200;
                        sArr2 = sArr;
                        i11 = iM11306 ^ i2;
                        i9 = i;
                        break;
                    case -1463079484:
                    case 1601136309:
                        C7105.m18993(C3743.m10957(view, i3), this);
                        if (C1937.m6279() < 0) {
                            iM450210 = (C19806.m45029("ۛۤ") ^ i7) * 21;
                            i9 = ((iM450210 ^ i6) * 26401) ^ 1301586660;
                            i10 = -1185827905;
                        } else {
                            iM450210 = ThreadFactoryC3888.m11306("ۡ֡") ^ i6;
                            i9 = ((iM450210 ^ i7) * (-12779)) ^ (-352740435);
                            i10 = -2022830720;
                        }
                        break;
                    case -1060892632:
                    case 193733245:
                        c15492.addTextChangedListener(new C7024());
                        if (C1419.f5860 < 0) {
                            iM450210 = (ThreadFactoryC3888.m11306("ۡ᩹") + i7) * 5;
                            i9 = ((iM450210 ^ i6) * (-7179)) ^ (-617902800);
                            i10 = -1634620696;
                        } else {
                            iM450210 = (ThreadFactoryC3888.m11306("᩻ܿ") + i6) * (-21);
                            i9 = ((iM450210 ^ i7) * (-29657)) ^ 1500214797;
                            i10 = -925071642;
                        }
                        break;
                    case -1016047502:
                    case -207752912:
                        viewM10957 = C3743.m10957(view, 2120048886 ^ iM45029);
                        if (!C0797.m3359()) {
                            iM450210 = ThreadFactoryC3888.m11306("ۡ֡") ^ i6;
                            i9 = ((iM450210 ^ i7) * (-12779)) ^ (-352740435);
                            i10 = -2022830720;
                            break;
                        }
                        iM450210 = (ThreadFactoryC3888.m11306("ۖ᩻") ^ i6) * (-79);
                        i9 = ((iM450210 ^ i7) * 31245) ^ (-946874218);
                        i10 = -1519619215;
                        break;
                    case -988577104:
                    case 850256645:
                        if (C1668.f6641 < 0) {
                            iM450210 = ThreadFactoryC3888.m11306("ۘۤ") ^ i6;
                            i9 = ((iM450210 ^ i7) * 19143) ^ (-731617565);
                            i10 = -975925363;
                        } else {
                            iM450210 = C19806.m45029("ۤۘ") ^ i7;
                            i9 = ((iM450210 ^ i6) * 20993) ^ 152932271;
                            i10 = 1249734088;
                        }
                        break;
                    case -902381152:
                    case 982658159:
                        this.f75435 = viewOnClickListenerC6361;
                        this.f75434 = c6037;
                        sArr = f75433;
                        if (RunnableC1895.m6170() != 0) {
                            iM11306 = C19806.m45029("ۖۙ") ^ i7;
                            i = ((iM11306 ^ i6) * (-17707)) ^ 739137418;
                            i2 = 1608391200;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("֨ᩴ") ^ i6;
                            i = ((iM11306 ^ i7) * (-8659)) ^ (-1134582921);
                            i2 = 1092095156;
                        }
                        sArr2 = sArr;
                        i11 = iM11306 ^ i2;
                        i9 = i;
                        break;
                    case -793709585:
                    case -639628236:
                        C3577.m10565();
                        iM450210 = (ThreadFactoryC3888.m11306("᩻ܿ") + i6) * (-21);
                        i9 = ((iM450210 ^ i7) * (-29657)) ^ 1500214797;
                        i10 = -925071642;
                        break;
                    case -731917273:
                    case 1724256240:
                        c15492 = (C15492) viewM10957;
                        if (!C3743.f13569) {
                            iM450210 = ThreadFactoryC3888.m11306("ۘۤ") ^ i6;
                            i9 = ((iM450210 ^ i7) * 19143) ^ (-731617565);
                            i10 = -975925363;
                            break;
                        }
                        iM450210 = ThreadFactoryC3888.m11306("ᩴ֡") ^ i6;
                        i9 = ((iM450210 ^ i7) * (-11821)) ^ (-427130434);
                        i10 = -2121875031;
                        break;
                    case -623178139:
                    case 1711375058:
                        C3535.m10431();
                        if (C1460.f5948 >= 0) {
                            iM450210 = ThreadFactoryC3888.m11306("ۡ֡") ^ i6;
                            i9 = ((iM450210 ^ i7) * (-12779)) ^ (-352740435);
                            i10 = -2022830720;
                            break;
                        }
                        iM450210 = (ThreadFactoryC3888.m11306("᩻ܿ") + i6) * (-21);
                        i9 = ((iM450210 ^ i7) * (-29657)) ^ 1500214797;
                        i10 = -925071642;
                        break;
                    case 270333409:
                    case 1685840244:
                        iM45029 = C19806.m45029(C10634.m26821(sArr2, i4, 3, i8));
                        if (C1461.f5957 > 0) {
                            iM450210 = C19806.m45029("ۚ֡") ^ i7;
                            i9 = ((iM450210 ^ i6) * (-14397)) ^ 617498903;
                            i10 = 1505607718;
                        } else {
                            iM450210 = ThreadFactoryC3888.m11306("ۡ֡") ^ i6;
                            i9 = ((iM450210 ^ i7) * (-12779)) ^ (-352740435);
                            i10 = -2022830720;
                        }
                        break;
                    case 329590292:
                    case 1206778587:
                        C2788.m8472();
                        throw new RuntimeException();
                    case 567550718:
                    case 616235315:
                        ThreadFactoryC3888.m11300();
                        if (C1875.f7103 < 0) {
                            iM450210 = C19806.m45029("ۤۘ") ^ i7;
                            i9 = ((iM450210 ^ i6) * 20993) ^ 152932271;
                            i10 = 1249734088;
                            break;
                        }
                        iM450210 = (ThreadFactoryC3888.m11306("᩻ܿ") + i6) * (-21);
                        i9 = ((iM450210 ^ i7) * (-29657)) ^ 1500214797;
                        i10 = -925071642;
                        break;
                    case 575680087:
                    case 943181182:
                        this.f75436 = c15492;
                        if (C0278.f1572 > 0) {
                            C4201 c4201 = new C4201(this, viewOnClickListenerC6361);
                            this.f75437 = c4201;
                            c15492.setAdapter(c4201);
                            if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                                iM450210 = (i7 - ThreadFactoryC3888.m11306("ᩴۗ")) * (-25);
                                i9 = ((iM450210 ^ i6) * (-27635)) ^ (-1681548515);
                                i10 = 1728365593;
                            } else {
                                iM450210 = ThreadFactoryC3888.m11306("ۘۤ") ^ i6;
                                i9 = ((iM450210 ^ i7) * 19143) ^ (-731617565);
                                i10 = -975925363;
                            }
                        }
                        sArr = sArr2;
                        iM11306 = C19806.m45029("ۖۙ") ^ i7;
                        i = ((iM11306 ^ i6) * (-17707)) ^ 739137418;
                        i2 = 1608391200;
                        sArr2 = sArr;
                        i11 = iM11306 ^ i2;
                        i9 = i;
                        break;
                    default:
                        c15492.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ۚ᩸ۖ
                            @Override // android.widget.AdapterView.OnItemClickListener
                            public final void onItemClick(AdapterView adapterView, View view2, int i12, long j) {
                                ViewOnClickListenerC23253.m51313(this.f19215);
                            }
                        });
                        return;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a6 A[PHI: r0 r8
      0x00a6: PHI (r0v4 int) = (r0v3 int), (r0v2 int), (r0v2 int), (r0v2 int), (r0v2 int) binds: [B:35:0x00a4, B:31:0x0085, B:16:0x0041, B:13:0x003c, B:10:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r8v8 android.text.style.StyleSpan) = 
      (r8v4 android.text.style.StyleSpan)
      (r8v7 android.text.style.StyleSpan)
      (r8v4 android.text.style.StyleSpan)
      (r8v4 android.text.style.StyleSpan)
      (r8v4 android.text.style.StyleSpan)
     binds: [B:35:0x00a4, B:31:0x0085, B:16:0x0041, B:13:0x003c, B:10:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0110  */
    /* JADX WARN: Code duplicated, block: B:50:0x013b A[PHI: r2
      0x013b: PHI (r2v4 int) = (r2v3 int), (r2v2 int), (r2v2 int) binds: [B:24:0x005a, B:13:0x003c, B:7:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0198  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51311(SpannableStringBuilder spannableStringBuilder, String str) {
        int iM11306;
        int i;
        int iM9702 = 0;
        int iM5086 = 0;
        int i2 = -1667125511;
        int i3 = C0050.f912;
        int i4 = C2788.f10625;
        int iM11307 = (ThreadFactoryC3888.m11306("۬ۚ") + i4) * 63;
        int i5 = ((iM11307 ^ i3) * (-479)) ^ 1638692668;
        int i6 = 1247872928;
        while (true) {
            int i7 = iM11307 ^ i6;
            StyleSpan styleSpan = null;
            while (true) {
                i2 = ((((i2 ^ i3) * 32555) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1712598354:
                    case 981430734:
                        if (ThreadFactoryC3888.m11300() > 0) {
                            iM11306 = (C19806.m45029("ۤ۠") ^ i4) * 77;
                            i5 = ((iM11306 ^ i3) * (-21893)) ^ (-1544087501);
                            i = 1164020816;
                            i7 = iM11306 ^ i;
                        }
                        break;
                    case -1710333367:
                    case 897403541:
                        iM9702 = MenuItemOnMenuItemClickListenerC3244.m9702(spannableStringBuilder);
                        if (C7105.m18985()) {
                            iM11306 = (C19806.m45029("᩷֡") + i3) * 81;
                            i5 = ((iM11306 ^ i4) * (-24053)) ^ (-1947799708);
                            i = -1127748243;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ۤۚ") ^ i4;
                            i5 = ((iM11306 ^ i3) * 16481) ^ 1074006614;
                            i = 973482917;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -1505238896:
                    case 490941229:
                        C1148.m4232();
                        iM11306 = ThreadFactoryC3888.m11306("֡ܳ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 21981) ^ 156469606;
                        i = 215315101;
                        i7 = iM11306 ^ i;
                        break;
                    case -1441989189:
                    case -1239531005:
                        ThreadFactoryC3888.m11309(spannableStringBuilder, styleSpan, iM9702, iM5086, 33);
                        break;
                    case -1312124891:
                    case 224375305:
                        iM5086 = C1461.m5086(spannableStringBuilder);
                        if (C10634.f36300 >= 0) {
                            iM11306 = (i4 - ThreadFactoryC3888.m11306("ۡۙ")) * 55;
                            i5 = ((iM11306 ^ i3) * 173) ^ 1156840078;
                            i = 380092949;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ۨ֨") ^ i4) * 25;
                            i5 = ((iM11306 ^ i3) * 9555) ^ (-1310985881);
                            i = 1313748637;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -1061470416:
                    case -270000891:
                        C1025.m3865(spannableStringBuilder, str);
                        if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        }
                        styleSpan = new StyleSpan(1);
                        if (C0526.f2219) {
                            iM11306 = (C19806.m45029("᩷֡") + i3) * 81;
                            i5 = ((iM11306 ^ i4) * (-24053)) ^ (-1947799708);
                            i = -1127748243;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ܶܶ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 6415) ^ (-1984129929);
                            i = 1098239274;
                        }
                        i7 = iM11306 ^ i;
                        break;
                        break;
                    case -950682197:
                    case 878806059:
                        C1460.m5050();
                        if (C2249.f8050 >= 0) {
                            iM11306 = (C19806.m45029("᩷֡") + i3) * 81;
                            i5 = ((iM11306 ^ i4) * (-24053)) ^ (-1947799708);
                            i = -1127748243;
                        } else {
                            iM11306 = C19806.m45029("ۢ֡") ^ i4;
                            i5 = ((iM11306 ^ i3) * 12389) ^ (-584097140);
                            i = -600008985;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -528291641:
                    case 418187860:
                        if (C1875.f7103 >= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("֡ܳ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 21981) ^ 156469606;
                            i = 215315101;
                        } else {
                            iM11306 = (C19806.m45029("᩷֡") + i3) * 81;
                            i5 = ((iM11306 ^ i4) * (-24053)) ^ (-1947799708);
                            i = -1127748243;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -401703220:
                    case 434345348:
                        if (ThreadFactoryC3888.m11300() <= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("֡ܳ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 21981) ^ 156469606;
                            i = 215315101;
                        } else {
                            iM11306 = (i3 - ThreadFactoryC3888.m11306("۫ᩴ")) * (-103);
                            i5 = ((iM11306 ^ i4) * (-19557)) ^ 513039284;
                            i = -1026108988;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -329036004:
                    case 1349453599:
                        if (C0278.f1572 <= 0) {
                            iM11306 = C19806.m45029("ۢ֡") ^ i4;
                            i5 = ((iM11306 ^ i3) * 12389) ^ (-584097140);
                            i = -600008985;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ۧۚ") ^ i3) * (-67);
                            i5 = ((iM11306 ^ i4) * 16293) ^ 566926926;
                            i = 1818945232;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case 164800206:
                    case 1586567408:
                        if (C1875.f7103 >= 0) {
                            iM11306 = (C19806.m45029("᩷֡") + i3) * 81;
                            i5 = ((iM11306 ^ i4) * (-24053)) ^ (-1947799708);
                            i = -1127748243;
                        } else {
                            iM11306 = (i4 - ThreadFactoryC3888.m11306("ۡۙ")) * 55;
                            i5 = ((iM11306 ^ i3) * 173) ^ 1156840078;
                            i = 380092949;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case 499645810:
                    case 934419450:
                        if (C0216.m1591() > 0) {
                            iM11306 = C19806.m45029("۬ۨ") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-8477)) ^ (-1791758233);
                            i = 2035748362;
                            i7 = iM11306 ^ i;
                        }
                        break;
                    case 1090477772:
                    case 1567023649:
                        AbstractC0464.m2313();
                        break;
                    case 1627837968:
                    case 2089091744:
                        if (C3577.f13150 < 0) {
                            iM11306 = (i4 - ThreadFactoryC3888.m11306("۬ܶ")) * (-57);
                            i5 = ((iM11306 ^ i3) * 1473) ^ (-1307027463);
                            i = -475013624;
                            i7 = iM11306 ^ i;
                        }
                        break;
                    default:
                        if (RunnableC1564.m5345()) {
                            iM11306 = (i4 - ThreadFactoryC3888.m11306("ۡۙ")) * 55;
                            i5 = ((iM11306 ^ i3) * 173) ^ 1156840078;
                            i = 380092949;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("۫᩵") + i4) * (-49);
                            i5 = ((iM11306 ^ i3) * (-30251)) ^ (-1010502441);
                            i = 351626692;
                        }
                        i7 = iM11306 ^ i;
                        break;
                }
                return;
            }
            iM11307 = ThreadFactoryC3888.m11306("ᩳۘ") ^ i3;
            i5 = ((iM11307 ^ i4) * 19951) ^ 1904152208;
            i6 = 2017994509;
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0202 A[PHI: r7 r11 r12 r13 r19
      0x0202: PHI (r7v31 l.۬᩸ۖ) = (r7v6 l.۬᩸ۖ), (r7v7 l.۬᩸ۖ), (r7v36 l.۬᩸ۖ) binds: [B:58:0x0200, B:54:0x01dd, B:11:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r11v5 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:58:0x0200, B:54:0x01dd, B:11:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r12v5 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:58:0x0200, B:54:0x01dd, B:11:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r13v5 int) = (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:58:0x0200, B:54:0x01dd, B:11:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0202: PHI (r19v26 android.text.Editable) = (r19v4 android.text.Editable), (r19v5 android.text.Editable), (r19v32 android.text.Editable) binds: [B:58:0x0200, B:54:0x01dd, B:11:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0239 A[PHI: r7 r9 r10 r15 r19
      0x0239: PHI (r7v13 l.۬᩸ۖ) = (r7v5 l.۬᩸ۖ), (r7v14 l.۬᩸ۖ) binds: [B:62:0x0237, B:38:0x0124] A[DONT_GENERATE, DONT_INLINE]
      0x0239: PHI (r9v4 short) = (r9v3 short), (r9v2 short) binds: [B:62:0x0237, B:38:0x0124] A[DONT_GENERATE, DONT_INLINE]
      0x0239: PHI (r10v4 short) = (r10v3 short), (r10v2 short) binds: [B:62:0x0237, B:38:0x0124] A[DONT_GENERATE, DONT_INLINE]
      0x0239: PHI (r15v3 short[]) = (r15v2 short[]), (r15v4 short[]) binds: [B:62:0x0237, B:38:0x0124] A[DONT_GENERATE, DONT_INLINE]
      0x0239: PHI (r19v11 android.text.Editable) = (r19v3 android.text.Editable), (r19v12 android.text.Editable) binds: [B:62:0x0237, B:38:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x026b A[PHI: r2 r3 r4 r7 r8 r19
      0x026b: PHI (r2v4 l.ܶ᩸ۖ) = (r2v2 l.ܶ᩸ۖ), (r2v2 l.ܶ᩸ۖ), (r2v3 l.ܶ᩸ۖ), (r2v2 l.ܶ᩸ۖ) binds: [B:66:0x0269, B:42:0x0146, B:6:0x0059, B:19:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x026b: PHI (r3v4 android.text.Editable) = (r3v2 android.text.Editable), (r3v2 android.text.Editable), (r3v3 android.text.Editable), (r3v2 android.text.Editable) binds: [B:66:0x0269, B:42:0x0146, B:6:0x0059, B:19:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x026b: PHI (r4v4 java.lang.String) = (r4v2 java.lang.String), (r4v3 java.lang.String), (r4v2 java.lang.String), (r4v2 java.lang.String) binds: [B:66:0x0269, B:42:0x0146, B:6:0x0059, B:19:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x026b: PHI (r7v28 l.۬᩸ۖ) = (r7v4 l.۬᩸ۖ), (r7v12 l.۬᩸ۖ), (r7v16 l.۬᩸ۖ), (r7v29 l.۬᩸ۖ) binds: [B:66:0x0269, B:42:0x0146, B:6:0x0059, B:19:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x026b: PHI (r8v4 char) = (r8v3 char), (r8v2 char), (r8v2 char), (r8v2 char) binds: [B:66:0x0269, B:42:0x0146, B:6:0x0059, B:19:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x026b: PHI (r19v22 android.text.Editable) = 
      (r19v2 android.text.Editable)
      (r19v10 android.text.Editable)
      (r19v14 android.text.Editable)
      (r19v23 android.text.Editable)
     binds: [B:66:0x0269, B:42:0x0146, B:6:0x0059, B:19:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02a1 A[PHI: r5 r6 r20
      0x02a1: PHI (r5v59 l.۬᩸ۖ) = (r5v40 l.۬᩸ۖ), (r5v2 l.۬᩸ۖ), (r5v2 l.۬᩸ۖ), (r5v44 l.۬᩸ۖ), (r5v2 l.۬᩸ۖ), (r5v2 l.۬᩸ۖ), (r5v2 l.۬᩸ۖ) binds: [B:28:0x00c1, B:20:0x0096, B:13:0x006d, B:71:0x029e, B:82:0x02a1, B:81:0x02a1, B:80:0x02a1] A[DONT_GENERATE, DONT_INLINE]
      0x02a1: PHI (r6v41 android.text.Editable) = 
      (r6v27 android.text.Editable)
      (r6v2 android.text.Editable)
      (r6v2 android.text.Editable)
      (r6v30 android.text.Editable)
      (r6v2 android.text.Editable)
      (r6v2 android.text.Editable)
      (r6v2 android.text.Editable)
     binds: [B:28:0x00c1, B:20:0x0096, B:13:0x006d, B:71:0x029e, B:82:0x02a1, B:81:0x02a1, B:80:0x02a1] A[DONT_GENERATE, DONT_INLINE]
      0x02a1: PHI (r20v8 short[]) = (r20v3 short[]), (r20v3 short[]), (r20v3 short[]), (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:28:0x00c1, B:20:0x0096, B:13:0x006d, B:71:0x029e, B:82:0x02a1, B:81:0x02a1, B:80:0x02a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51313(ViewOnClickListenerC23253 viewOnClickListenerC23253) {
        int iM45029;
        int i;
        int i2;
        int iM450210;
        int i3;
        int i4;
        int i5 = C7105.f23796;
        int i6 = C0629.f2722;
        int iM450211 = (i5 - C19806.m45029("ܰܺ")) * (-119);
        int i7 = ((iM450211 ^ i6) * 20105) ^ 778346406;
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM450211 ^ (-330622524);
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1008382341;
        Editable editableM10576 = null;
        C13375 c13375 = null;
        String strM6674 = null;
        Editable editableM10577 = null;
        C15492 c15492 = null;
        while (true) {
            i13 = i8 ^ (i7 & (((i13 ^ i6) * 13311) >> 31));
            switch (i13) {
                case -2119496890:
                case 1855461462:
                    C2788.m8472();
                    break;
                case -2094363788:
                case -716640509:
                    c13375 = c13375;
                    editableM10576 = editableM10576;
                    s = sArr[c];
                    s2 = 30978;
                    if (C1148.f5161 <= 0) {
                        iM45029 = C19806.m45029("֨ۛ") ^ i5;
                        i = ((iM45029 ^ i6) * 30627) ^ (-526199362);
                        i2 = -2060326425;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۢ") ^ i6;
                        i = ((iM45029 ^ i5) * (-28547)) ^ (-1082112880);
                        i2 = 1325900257;
                    }
                    int i14 = iM45029 ^ i2;
                    editableM10576 = editableM10576;
                    i8 = i14;
                    i7 = i;
                    c13375 = c13375;
                    break;
                case -2069920252:
                case 1090494400:
                    c13375 = c13375;
                    editableM10576 = editableM10576;
                    sArr2 = f75433;
                    if (C1025.f4800 >= 0) {
                        iM45029 = C19806.m45029("֨ۛ") ^ i5;
                        i = ((iM45029 ^ i6) * 30627) ^ (-526199362);
                        i2 = -2060326425;
                    } else {
                        iM45029 = C19806.m45029("᩷ۖ") ^ i5;
                        i = ((iM45029 ^ i6) * (-1835)) ^ (-1195125451);
                        i2 = -128643667;
                    }
                    int i15 = iM45029 ^ i2;
                    editableM10576 = editableM10576;
                    i8 = i15;
                    i7 = i;
                    c13375 = c13375;
                    break;
                case -2054156622:
                case 262134175:
                    RunnableC3388.m10064();
                    if (C2124.m6673() > 0) {
                        c13375 = c13375;
                        editableM10576 = editableM10576;
                        iM45029 = ThreadFactoryC3888.m11306("ۙ֡") ^ i6;
                        i = ((iM45029 ^ i5) * (-19345)) ^ 392855311;
                        i2 = -1648928115;
                        int i16 = iM45029 ^ i2;
                        editableM10576 = editableM10576;
                        i8 = i16;
                        i7 = i;
                        c13375 = c13375;
                    } else {
                        iM450210 = C19806.m45029("ܰۘ") ^ i5;
                        i3 = ((iM450210 ^ i6) * (-28097)) ^ 1767699821;
                        i4 = -1526945583;
                        i8 = iM450210 ^ i4;
                        i7 = i3;
                    }
                    break;
                case -1898425439:
                case 623783395:
                    C0817.m3399();
                    iM450210 = C19806.m45029("ܰۘ") ^ i5;
                    i3 = ((iM450210 ^ i6) * (-28097)) ^ 1767699821;
                    i4 = -1526945583;
                    i8 = iM450210 ^ i4;
                    i7 = i3;
                    break;
                case -1751979135:
                case 1600758829:
                    i12 = 60502;
                    iM45029 = (C19806.m45029("ܳۡ") ^ i6) * 59;
                    i = ((iM45029 ^ i5) * 25963) ^ (-1015305803);
                    i2 = 1801322827;
                    int i17 = iM45029 ^ i2;
                    editableM10576 = editableM10576;
                    i8 = i17;
                    i7 = i;
                    c13375 = c13375;
                    break;
                case -1744325316:
                case 478126240:
                    c13375 = c13375;
                    editableM10576 = editableM10576;
                    i11 = 239909121;
                    if (C1875.f7103 >= 0) {
                        iM45029 = (C19806.m45029("۟֡") + i6) * 25;
                        i = ((iM45029 ^ i5) * (-12701)) ^ 1769011599;
                        i2 = 203423328;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖۘ") ^ i6) * 51;
                        i = ((iM45029 ^ i5) * 11147) ^ (-1451836717);
                        i2 = 106375689;
                    }
                    int i18 = iM45029 ^ i2;
                    editableM10576 = editableM10576;
                    i8 = i18;
                    i7 = i;
                    c13375 = c13375;
                    break;
                case -1087854116:
                case 1574448834:
                    c13375 = viewOnClickListenerC23253.f75437.f15265;
                    editableM10576 = C3577.m10576(c15492);
                    if (C0671.f2816 != 0) {
                        iM450210 = C19806.m45029("ܰۘ") ^ i5;
                        i3 = ((iM450210 ^ i6) * (-28097)) ^ 1767699821;
                        i4 = -1526945583;
                    } else {
                        iM450210 = C19806.m45029("۫ܰ") ^ i5;
                        i3 = ((iM450210 ^ i6) * 28375) ^ (-1686188408);
                        i4 = 587193209;
                    }
                    i8 = iM450210 ^ i4;
                    i7 = i3;
                    break;
                case -1058251606:
                case 1826347481:
                    c13375 = c13375;
                    editableM10576 = editableM10576;
                    c = '\"';
                    if (C2477.f9839 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ֡") ^ i6;
                        i = ((iM45029 ^ i5) * (-19345)) ^ 392855311;
                        i2 = -1648928115;
                    } else {
                        iM45029 = (C19806.m45029("᩶᩻") ^ i6) * 123;
                        i = ((iM45029 ^ i5) * 9455) ^ 150801179;
                        i2 = -2140732040;
                    }
                    int i19 = iM45029 ^ i2;
                    editableM10576 = editableM10576;
                    i8 = i19;
                    i7 = i;
                    c13375 = c13375;
                    break;
                case -996044564:
                case 842163133:
                    c13375 = c13375;
                    editableM10576 = editableM10576;
                    if (RunnableC1895.m6176(strM6674, C0671.m3009(sArr2, 35, 1, i12))) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘۨ") ^ i6) * (-3);
                        i = ((iM45029 ^ i5) * 28407) ^ (-1781085469);
                        i2 = -1737821626;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۟ۙ") ^ i6) * 47;
                        i = ((iM45029 ^ i5) * (-24697)) ^ 543003542;
                        i2 = -112175893;
                    }
                    int i110 = iM45029 ^ i2;
                    editableM10576 = editableM10576;
                    i8 = i110;
                    i7 = i;
                    c13375 = c13375;
                    break;
                case -926108211:
                case 1330973435:
                    C2477.m7593();
                    if (C1460.f5948 >= 0) {
                        c13375 = c13375;
                        editableM10576 = editableM10576;
                        iM45029 = (C19806.m45029("۟֡") + i6) * 25;
                        i = ((iM45029 ^ i5) * (-12701)) ^ 1769011599;
                        i2 = 203423328;
                        int i111 = iM45029 ^ i2;
                        editableM10576 = editableM10576;
                        i8 = i111;
                        i7 = i;
                        c13375 = c13375;
                    } else {
                        iM450210 = C19806.m45029("ܰۘ") ^ i5;
                        i3 = ((iM450210 ^ i6) * (-28097)) ^ 1767699821;
                        i4 = -1526945583;
                        i8 = iM450210 ^ i4;
                        i7 = i3;
                    }
                    break;
                case -649472709:
                case 873616215:
                    c13375 = c13375;
                    editableM10576 = editableM10576;
                    if (i9 - (i10 + i11) <= 0) {
                        iM45029 = C19806.m45029("ܰ᩻") ^ i5;
                        i = ((iM45029 ^ i6) * (-9143)) ^ (-1908718068);
                        i2 = -1794308023;
                    } else {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("֨ۗ")) * (-99);
                        i = ((iM45029 ^ i6) * (-8913)) ^ (-1812890138);
                        i2 = -630498802;
                    }
                    int i112 = iM45029 ^ i2;
                    editableM10576 = editableM10576;
                    i8 = i112;
                    i7 = i;
                    c13375 = c13375;
                    break;
                case -392473613:
                case 1537028345:
                    c13375.filter(editableM10576, c15492);
                    if (C0050.f912 > 0) {
                        c13375 = c13375;
                        editableM10576 = editableM10576;
                        C0817.m3402(new RunnableC22547(0, c15492), 100L);
                        iM45029 = (ThreadFactoryC3888.m11306("۟ۙ") ^ i6) * 47;
                        i = ((iM45029 ^ i5) * (-24697)) ^ 543003542;
                        i2 = -112175893;
                        int i113 = iM45029 ^ i2;
                        editableM10576 = editableM10576;
                        i8 = i113;
                        i7 = i;
                        c13375 = c13375;
                    } else {
                        iM450210 = C19806.m45029("ܰۘ") ^ i5;
                        i3 = ((iM450210 ^ i6) * (-28097)) ^ 1767699821;
                        i4 = -1526945583;
                        i8 = iM450210 ^ i4;
                        i7 = i3;
                    }
                    break;
                case -367050090:
                case -164251662:
                    if (C2871.f10837 < 0) {
                        iM450210 = C19806.m45029("ܰۘ") ^ i5;
                        i3 = ((iM450210 ^ i6) * (-28097)) ^ 1767699821;
                        i4 = -1526945583;
                    } else {
                        iM450210 = C19806.m45029("᩸ܰ") ^ i5;
                        i3 = ((iM450210 ^ i6) * 13623) ^ (-95959560);
                        i4 = 1341612069;
                    }
                    i8 = iM450210 ^ i4;
                    i7 = i3;
                    break;
                case 126635017:
                case 1130314878:
                    c13375 = c13375;
                    editableM10576 = editableM10576;
                    sArr = f75433;
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        iM45029 = (C19806.m45029("᩶۫") + i5) * 97;
                        i = ((iM45029 ^ i6) * 9161) ^ 447955795;
                        i2 = -572101571;
                        int i114 = iM45029 ^ i2;
                        editableM10576 = editableM10576;
                        i8 = i114;
                        i7 = i;
                        c13375 = c13375;
                    } else {
                        c13375 = c13375;
                        editableM10576 = editableM10576;
                        iM450210 = C19806.m45029("ܰۘ") ^ i5;
                        i3 = ((iM450210 ^ i6) * (-28097)) ^ 1767699821;
                        i4 = -1526945583;
                        i8 = iM450210 ^ i4;
                        i7 = i3;
                    }
                    break;
                case 292606479:
                case 1505439854:
                    c13375 = c13375;
                    editableM10576 = editableM10576;
                    strM6674 = C2124.m6674(editableM10577);
                    if (C3535.f13026 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ֡") ^ i6;
                        i = ((iM45029 ^ i5) * (-19345)) ^ 392855311;
                        i2 = -1648928115;
                    } else {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("ۙ۬")) * (-127);
                        i = ((iM45029 ^ i5) * (-29875)) ^ 85970274;
                        i2 = 453751505;
                    }
                    int i115 = iM45029 ^ i2;
                    editableM10576 = editableM10576;
                    i8 = i115;
                    i7 = i;
                    c13375 = c13375;
                    break;
                case 483842858:
                case 1550358477:
                    c13375 = c13375;
                    editableM10576 = editableM10576;
                    i9 = s * s2;
                    i10 = s * s;
                    if (C3743.f13569) {
                        iM45029 = C19806.m45029("֫ۖ") ^ i5;
                        i = ((iM45029 ^ i6) * (-30059)) ^ (-1381059716);
                        i2 = 1382241944;
                    } else {
                        iM45029 = (C19806.m45029("۟֡") + i6) * 25;
                        i = ((iM45029 ^ i5) * (-12701)) ^ 1769011599;
                        i2 = 203423328;
                    }
                    int i116 = iM45029 ^ i2;
                    editableM10576 = editableM10576;
                    i8 = i116;
                    i7 = i;
                    c13375 = c13375;
                    break;
                case 1011232788:
                case 1628625166:
                    i12 = 35317;
                    iM45029 = (C19806.m45029("ܳۡ") ^ i6) * 59;
                    i = ((iM45029 ^ i5) * 25963) ^ (-1015305803);
                    i2 = 1801322827;
                    int i117 = iM45029 ^ i2;
                    editableM10576 = editableM10576;
                    i8 = i117;
                    i7 = i;
                    c13375 = c13375;
                    break;
                case 1748196969:
                case 2110532292:
                    break;
                default:
                    c13375 = c13375;
                    editableM10576 = editableM10576;
                    c15492 = viewOnClickListenerC23253.f75436;
                    editableM10577 = C3577.m10576(c15492);
                    if (C7105.f23796 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ֡") ^ i6;
                        i = ((iM45029 ^ i5) * (-19345)) ^ 392855311;
                        i2 = -1648928115;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳ۟") ^ i5;
                        i = ((iM45029 ^ i6) * (-29185)) ^ 1555848312;
                        i2 = -619421396;
                    }
                    int i118 = iM45029 ^ i2;
                    editableM10576 = editableM10576;
                    i8 = i118;
                    i7 = i;
                    c13375 = c13375;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ea A[PHI: r4 r6 r14 r15
      0x00ea: PHI (r4v4 java.lang.String) = (r4v3 java.lang.String), (r4v2 java.lang.String) binds: [B:29:0x00e8, B:21:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x00ea: PHI (r6v3 int) = (r6v2 int), (r6v4 int) binds: [B:29:0x00e8, B:21:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x00ea: PHI (r14v4 short[]) = (r14v3 short[]), (r14v2 short[]) binds: [B:29:0x00e8, B:21:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x00ea: PHI (r15v4 int) = (r15v3 int), (r15v2 int) binds: [B:29:0x00e8, B:21:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x020d A[PHI: r20
      0x020d: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]) binds: [B:56:0x020b, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0240 A[PHI: r8 r9
      0x0240: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:60:0x023e, B:52:0x01ec, B:12:0x0062, B:9:0x0059, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:60:0x023e, B:52:0x01ec, B:12:0x0062, B:9:0x0059, B:6:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x026e A[PHI: r1 r2 r3 r5 r10 r11 r12
      0x026e: PHI (r1v4 l.ܶ᩸ۖ) = (r1v2 l.ܶ᩸ۖ), (r1v2 l.ܶ᩸ۖ), (r1v2 l.ܶ᩸ۖ), (r1v2 l.ܶ᩸ۖ), (r1v2 l.ܶ᩸ۖ), (r1v6 l.ܶ᩸ۖ) binds: [B:64:0x026c, B:48:0x01c8, B:33:0x0121, B:25:0x00bf, B:9:0x0059, B:87:0x026e] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r2v4 java.lang.Object) = 
      (r2v2 java.lang.Object)
      (r2v2 java.lang.Object)
      (r2v2 java.lang.Object)
      (r2v2 java.lang.Object)
      (r2v2 java.lang.Object)
      (r2v6 java.lang.Object)
     binds: [B:64:0x026c, B:48:0x01c8, B:33:0x0121, B:25:0x00bf, B:9:0x0059, B:87:0x026e] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r3v5 java.lang.Object) = 
      (r3v2 java.lang.Object)
      (r3v2 java.lang.Object)
      (r3v3 java.lang.Object)
      (r3v2 java.lang.Object)
      (r3v2 java.lang.Object)
      (r3v2 java.lang.Object)
     binds: [B:64:0x026c, B:48:0x01c8, B:33:0x0121, B:25:0x00bf, B:9:0x0059, B:87:0x026e] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r5v5 java.lang.String) = 
      (r5v2 java.lang.String)
      (r5v2 java.lang.String)
      (r5v2 java.lang.String)
      (r5v3 java.lang.String)
      (r5v2 java.lang.String)
      (r5v2 java.lang.String)
     binds: [B:64:0x026c, B:48:0x01c8, B:33:0x0121, B:25:0x00bf, B:9:0x0059, B:87:0x026e] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r10v5 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:64:0x026c, B:48:0x01c8, B:33:0x0121, B:25:0x00bf, B:9:0x0059, B:87:0x026e] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r11v5 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:64:0x026c, B:48:0x01c8, B:33:0x0121, B:25:0x00bf, B:9:0x0059, B:87:0x026e] A[DONT_GENERATE, DONT_INLINE]
      0x026e: PHI (r12v5 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:64:0x026c, B:48:0x01c8, B:33:0x0121, B:25:0x00bf, B:9:0x0059, B:87:0x026e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51315(ViewOnClickListenerC23253 viewOnClickListenerC23253, DialogInterfaceC19356 dialogInterfaceC19356, ArrayList arrayList, int i) {
        int iM45029;
        int i2;
        int i3;
        int i4 = C1875.f7103;
        int i5 = C1977.f7413;
        int iM450210 = (C19806.m45029("ܺᩴ") + i5) * (-103);
        int i6 = ((iM450210 ^ i4) * (-7983)) ^ (-787771851);
        String strM10567 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM450210 ^ (-941085729);
        int iM9708 = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1507040933;
        String strMo10694 = null;
        Object obj = null;
        Object objM9796 = null;
        C15492 c15492 = null;
        while (true) {
            i13 = i7 ^ (i6 & (((i13 ^ i4) * 31581) >> 31));
            switch (i13) {
                case -1966048585:
                case 1791685470:
                    if (C3722.m10894() <= 0) {
                        iM45029 = C19806.m45029("֫۫") ^ i5;
                        i2 = ((iM45029 ^ i4) * 11925) ^ 327807540;
                        i3 = -1358522233;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗۚ") ^ i5;
                        i2 = ((iM45029 ^ i4) * 2653) ^ (-775250905);
                        i3 = 273219369;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -1943255707:
                case -602631878:
                    strMo10694 = ((InterfaceC3609) obj).mo10694();
                    sArr2 = f75433;
                    i12 = 43;
                    if (C1398.f5802 <= 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ᩳ᩸")) * 55;
                        i2 = ((iM45029 ^ i5) * (-14631)) ^ 1056309277;
                        i3 = -732834718;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴ֡") ^ i5) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i2 = ((iM45029 ^ i4) * (-20589)) ^ (-1802583910);
                        i3 = 1162246847;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -1723214089:
                case 951120657:
                    if (RunnableC1564.f6300) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ۬") ^ i5;
                        i2 = ((iM45029 ^ i4) * 28019) ^ (-1812150010);
                        i3 = -2036937221;
                    } else {
                        iM45029 = (C19806.m45029("ܰ۬") + i4) * (-81);
                        i2 = ((iM45029 ^ i5) * 21153) ^ (-1907711542);
                        i3 = -334183;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -1352363105:
                case 842650674:
                    obj = ((C10946) objM9796).f37217;
                    if (C1025.f4800 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ۬") ^ i5;
                        i2 = ((iM45029 ^ i4) * 28019) ^ (-1812150010);
                        i3 = -2036937221;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ᩵") ^ i4;
                        i2 = ((iM45029 ^ i5) * (-25325)) ^ 2147389646;
                        i3 = 925289717;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -1164196383:
                case 870353611:
                    MenuItemOnMenuItemClickListenerC3244.m9704(c15492, strM10567);
                    iM9708 = MenuItemOnMenuItemClickListenerC3244.m9708(c15492);
                    if (C3743.f13569) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹֫") ^ i4;
                        i2 = ((iM45029 ^ i5) * (-28171)) ^ 1773627673;
                        i3 = -1452254308;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ᩳ᩸")) * 55;
                        i2 = ((iM45029 ^ i5) * (-14631)) ^ 1056309277;
                        i3 = -732834718;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -1083362236:
                case -643700408:
                    int i14 = s + s2;
                    i8 = i14 * i14;
                    i9 = s * s;
                    i10 = 153264400;
                    if (C1937.f7317 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ۬") ^ i5;
                        i2 = ((iM45029 ^ i4) * 28019) ^ (-1812150010);
                        i3 = -2036937221;
                    } else {
                        iM45029 = (i5 - C19806.m45029("۠֨")) * (-123);
                        i2 = ((iM45029 ^ i4) * (-9653)) ^ (-220360211);
                        i3 = -294741566;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -1059744501:
                case 1112389710:
                    sArr = f75433;
                    if (C1875.f7103 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ۨ") ^ i4) * 21;
                        i2 = ((iM45029 ^ i5) * 12417) ^ (-952327132);
                        i3 = 1457771066;
                    } else {
                        iM45029 = C19806.m45029("ۧ᩷") ^ i4;
                        i2 = ((iM45029 ^ i5) * (-7125)) ^ (-1877428745);
                        i3 = 264221796;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -1022901206:
                case -50089053:
                    C1937.m6279();
                    RunnableC0195.m1431();
                    iM45029 = (C19806.m45029("ܰۢ") ^ i5) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i2 = ((iM45029 ^ i4) * (-27669)) ^ (-269027953);
                    i3 = -1336571648;
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -749464365:
                case 992597421:
                    C1668.m5572(dialogInterfaceC19356);
                    c15492 = viewOnClickListenerC23253.f75436;
                    objM9796 = C3286.m9796(arrayList, i);
                    if (C0050.f912 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ۬") ^ i5;
                        i2 = ((iM45029 ^ i4) * 28019) ^ (-1812150010);
                        i3 = -2036937221;
                        i7 = iM45029 ^ i3;
                        i6 = i2;
                    } else {
                        int iM11306 = ThreadFactoryC3888.m11306("ᩴ۫") ^ i5;
                        i6 = ((iM11306 ^ i4) * 7279) ^ (-72158225);
                        i7 = iM11306 ^ 1614771009;
                    }
                    break;
                case -733197880:
                case 2044261998:
                    int i15 = i9 + i10;
                    if ((i15 + i15) - i8 >= 0) {
                        iM45029 = (i4 - C19806.m45029("ܺ᩵")) * (-9);
                        i2 = ((iM45029 ^ i5) * 17899) ^ 1063139403;
                        i3 = 1503214940;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘۖ") + i5) * 3;
                        i2 = ((iM45029 ^ i4) * 13291) ^ (-694434097);
                        i3 = -698989640;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -710453384:
                case 1979571004:
                    strM10567 = C3577.m10567(C0050.m940(sArr2, i12, 1, i11), strMo10694);
                    if (C2249.f8050 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ۬") ^ i5;
                        i2 = ((iM45029 ^ i4) * 28019) ^ (-1812150010);
                        i3 = -2036937221;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡ֫") + i4) * (-35);
                        i2 = ((iM45029 ^ i5) * 21513) ^ 721961213;
                        i3 = -338891888;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -509717353:
                case -489283486:
                    i11 = 53323;
                    iM45029 = ThreadFactoryC3888.m11306("᩷ۨ") ^ i4;
                    i2 = ((iM45029 ^ i5) * (-32493)) ^ (-194629994);
                    i3 = 946224175;
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -460433479:
                case 694787773:
                    s = sArr[42];
                    s2 = 12380;
                    if (C0817.f3443) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽܺ") ^ i5) * 91;
                        i2 = ((iM45029 ^ i4) * (-2925)) ^ 208694982;
                        i3 = -1734389081;
                    } else {
                        iM45029 = C19806.m45029("֫۫") ^ i5;
                        i2 = ((iM45029 ^ i4) * 11925) ^ 327807540;
                        i3 = -1358522233;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case -202901560:
                case -132335726:
                    C1377.m4833();
                    break;
                case 502353483:
                case 775423514:
                    C3577.m10565();
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = (C19806.m45029("ܰۢ") ^ i5) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i2 = ((iM45029 ^ i4) * (-27669)) ^ (-269027953);
                        i3 = -1336571648;
                    } else {
                        iM45029 = C19806.m45029("֫۫") ^ i5;
                        i2 = ((iM45029 ^ i4) * 11925) ^ 327807540;
                        i3 = -1358522233;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case 541403710:
                case 1780636296:
                    i11 = 57643;
                    iM45029 = ThreadFactoryC3888.m11306("᩷ۨ") ^ i4;
                    i2 = ((iM45029 ^ i5) * (-32493)) ^ (-194629994);
                    i3 = 946224175;
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                case 821788621:
                case 1111650915:
                    c15492.setSelection(0, iM9708);
                    C1977.m6361(c15492);
                    c15492.performHapticFeedback(0);
                    break;
                case 1384429082:
                case 1734038171:
                    if (C1461.f5957 > 0) {
                        iM45029 = C19806.m45029("֫۫") ^ i5;
                        i2 = ((iM45029 ^ i4) * 11925) ^ 327807540;
                        i3 = -1358522233;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۘ۬") ^ i5;
                        i2 = ((iM45029 ^ i4) * 28019) ^ (-1812150010);
                        i3 = -2036937221;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
                default:
                    C0629.m2907();
                    if (C0216.f1393 == 0) {
                        iM45029 = C19806.m45029("֫۫") ^ i5;
                        i2 = ((iM45029 ^ i4) * 11925) ^ 327807540;
                        i3 = -1358522233;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ۨ") ^ i4) * 21;
                        i2 = ((iM45029 ^ i5) * 12417) ^ (-952327132);
                        i3 = 1457771066;
                    }
                    i7 = iM45029 ^ i3;
                    i6 = i2;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c5 A[PHI: r4
      0x00c5: PHI (r4v4 java.lang.Object[]) = (r4v3 java.lang.Object[]), (r4v2 java.lang.Object[]), (r4v2 java.lang.Object[]) binds: [B:28:0x00c3, B:24:0x00a6, B:13:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01c1 A[PHI: r7 r8
      0x01c1: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:51:0x01bf, B:10:0x0064, B:7:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x01c1: PHI (r8v4 short) = (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:51:0x01bf, B:10:0x0064, B:7:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01f5 A[PHI: r9 r21
      0x01f5: PHI (r9v3 int) = (r9v2 int), (r9v4 int) binds: [B:55:0x01f3, B:47:0x019e] A[DONT_GENERATE, DONT_INLINE]
      0x01f5: PHI (r21v5 char) = (r21v4 char), (r21v3 char) binds: [B:55:0x01f3, B:47:0x019e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0226 A[PHI: r10 r11 r12 r16
      0x0226: PHI (r10v5 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:59:0x0224, B:43:0x017e, B:13:0x006c, B:10:0x0064, B:5:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r11v5 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:59:0x0224, B:43:0x017e, B:13:0x006c, B:10:0x0064, B:5:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r12v5 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:59:0x0224, B:43:0x017e, B:13:0x006c, B:10:0x0064, B:5:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r16v5 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:59:0x0224, B:43:0x017e, B:13:0x006c, B:10:0x0064, B:5:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0254 A[PHI: r1 r2 r3 r5 r14 r15
      0x0254: PHI (r1v4 l.ܶ᩸ۖ) = (r1v3 l.ܶ᩸ۖ), (r1v2 l.ܶ᩸ۖ), (r1v2 l.ܶ᩸ۖ), (r1v2 l.ܶ᩸ۖ) binds: [B:33:0x00ff, B:63:0x0252, B:20:0x0087, B:7:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r2v4 java.lang.Integer) = (r2v3 java.lang.Integer), (r2v2 java.lang.Integer), (r2v2 java.lang.Integer), (r2v2 java.lang.Integer) binds: [B:33:0x00ff, B:63:0x0252, B:20:0x0087, B:7:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r3v8 int) = (r3v3 int), (r3v2 int), (r3v2 int), (r3v2 int) binds: [B:33:0x00ff, B:63:0x0252, B:20:0x0087, B:7:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:33:0x00ff, B:63:0x0252, B:20:0x0087, B:7:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r14v4 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v3 short[]), (r14v2 short[]) binds: [B:33:0x00ff, B:63:0x0252, B:20:0x0087, B:7:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:33:0x00ff, B:63:0x0252, B:20:0x0087, B:7:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51314(ViewOnClickListenerC23253 viewOnClickListenerC23253, int i) {
        int iM11306;
        int i2;
        int i3;
        int i4 = C1025.f4800;
        int i5 = RunnableC0195.f1321;
        int iM11307 = (i5 - ThreadFactoryC3888.m11306("֨ᩴ")) * (-89);
        int i6 = ((iM11307 ^ i4) * 11867) ^ 1170248826;
        Integer numM8476 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM11307 ^ (-1091213896);
        C15492 c15492 = null;
        int i8 = 0;
        short s = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 555473245;
        char c = 0;
        Object[] objArr = null;
        int i16 = 0;
        while (true) {
            i15 = i7 ^ (i6 & (((i15 ^ i4) * 21421) >> 31));
            switch (i15) {
                case -2089302667:
                case -1380009325:
                    i13 = 12690;
                    int iM45029 = C19806.m45029("ܺ᩷") ^ i4;
                    i6 = ((iM45029 ^ i5) * (-10719)) ^ (-787281076);
                    i7 = iM45029 ^ (-1504123229);
                    break;
                case -1963768970:
                case -1943449368:
                    int i17 = i11 + i12;
                    if ((i17 + i17) - i10 >= 0) {
                        iM11306 = C19806.m45029("ۜ۠") ^ i4;
                        i2 = ((iM11306 ^ i5) * (-16505)) ^ 280819727;
                        i3 = -1107761239;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧܿ") ^ i5;
                        i2 = ((iM11306 ^ i4) * (-23083)) ^ 853547154;
                        i3 = 241938936;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -1906249395:
                case 32675920:
                    C0797.m3359();
                    break;
                case -1823580407:
                case 2130075332:
                    c = '$';
                    if (C2249.f8050 >= 0) {
                        iM11306 = C19806.m45029("ܰܽ") ^ i4;
                        i2 = ((iM11306 ^ i5) * (-7341)) ^ (-2129670755);
                        i3 = -716535627;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴۙ") ^ i5;
                        i2 = ((iM11306 ^ i4) * (-15023)) ^ (-770244540);
                        i3 = -69834244;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -1688551624:
                case -1209021233:
                    i10 = i9 * i9;
                    i11 = s * s;
                    i12 = 308599489;
                    if (C2477.f9839 <= 0) {
                        iM11306 = C19806.m45029("֨ܳ") ^ i4;
                        i2 = ((iM11306 ^ i5) * (-21549)) ^ 958923496;
                        i3 = 1590801161;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽܺ") + i4) * (-125);
                        i2 = ((iM11306 ^ i5) * 21253) ^ 69874157;
                        i3 = -1803350100;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -1286246214:
                case -803578697:
                    objArr = new Object[i16];
                    if (C7105.f23796 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙۙ") ^ i5;
                        i2 = ((iM11306 ^ i4) * (-29127)) ^ 537065142;
                        i3 = 774183185;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۙۨ")) * 65;
                        i2 = ((iM11306 ^ i5) * (-32259)) ^ (-487748850);
                        i3 = -476669595;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -1273249623:
                case 827107641:
                    if (C1668.f6641 >= 0) {
                        iM11306 = (C19806.m45029("ۘ᩷") + i5) * 95;
                        i2 = ((iM11306 ^ i4) * 9909) ^ 1865042256;
                        i3 = -2129584892;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟֫") ^ i4;
                        i2 = ((iM11306 ^ i5) * 10143) ^ 68898688;
                        i3 = -88139056;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -1153820217:
                case 2124587323:
                    i9 = s + s2;
                    if (C1668.f6641 >= 0) {
                        iM11306 = C19806.m45029("ܰܽ") ^ i4;
                        i2 = ((iM11306 ^ i5) * (-7341)) ^ (-2129670755);
                        i3 = -716535627;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹۬") + i5) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i2 = ((iM11306 ^ i4) * 531) ^ 2021074920;
                        i3 = 1997311154;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -977130359:
                case 896051271:
                    MenuItemOnMenuItemClickListenerC3244.m9704(c15492, String.format(C1025.m3859(sArr2, i14, i8, i13), objArr));
                    break;
                case -505542943:
                case 2053457662:
                    if (RunnableC0195.m1431()) {
                        iM11306 = C19806.m45029("֨ܳ") ^ i4;
                        i2 = ((iM11306 ^ i5) * (-21549)) ^ 958923496;
                        i3 = 1590801161;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۙۙ") ^ i5;
                        i2 = ((iM11306 ^ i4) * (-29127)) ^ 537065142;
                        i3 = 774183185;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case -208541604:
                case 1995040785:
                    c15492 = viewOnClickListenerC23253.f75436;
                    numM8476 = C2788.m8476(i);
                    if (C2704.f10408) {
                        int iM11308 = ThreadFactoryC3888.m11306("۟ܰ") ^ i5;
                        i6 = ((iM11308 ^ i4) * (-32053)) ^ (-1460412126);
                        i7 = iM11308 ^ 276855512;
                        i16 = 1;
                    } else {
                        i16 = 1;
                        iM11306 = (C19806.m45029("ۘ᩷") + i5) * 95;
                        i2 = ((iM11306 ^ i4) * 9909) ^ 1865042256;
                        i3 = -2129584892;
                        i7 = iM11306 ^ i3;
                        i6 = i2;
                    }
                    break;
                case 100375159:
                case 2073237993:
                    C2788.m8472();
                    if (C1066.f4915 > 0) {
                        iM11306 = (i4 - C19806.m45029("ܳ۬")) * (-121);
                        i2 = ((iM11306 ^ i5) * 6465) ^ 1746503926;
                        i3 = -1114764005;
                    } else {
                        iM11306 = (C19806.m45029("ۘ᩷") + i5) * 95;
                        i2 = ((iM11306 ^ i4) * 9909) ^ 1865042256;
                        i3 = -2129584892;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case 113495532:
                case 526457029:
                    objArr[0] = numM8476;
                    if (C0797.f3386) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙۙ") ^ i5;
                        i2 = ((iM11306 ^ i4) * (-29127)) ^ 537065142;
                        i3 = 774183185;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽۖ") ^ i5;
                        i2 = ((iM11306 ^ i4) * 27623) ^ 428350700;
                        i3 = -715653268;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case 434600495:
                case 1302464714:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = (i4 - C19806.m45029("ܳ۬")) * (-121);
                        i2 = ((iM11306 ^ i5) * 6465) ^ 1746503926;
                        i3 = -1114764005;
                    } else {
                        iM11306 = C19806.m45029("֨ܳ") ^ i4;
                        i2 = ((iM11306 ^ i5) * (-21549)) ^ 958923496;
                        i3 = 1590801161;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case 596643555:
                case 705574067:
                    sArr = f75433;
                    if (C1937.f7317 >= 0) {
                        iM11306 = C19806.m45029("֨ܳ") ^ i4;
                        i2 = ((iM11306 ^ i5) * (-21549)) ^ 958923496;
                        i3 = 1590801161;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۜۜ") ^ i5;
                        i2 = ((iM11306 ^ i4) * (-11953)) ^ (-2835863);
                        i3 = 815485658;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case 1257070151:
                case 1476429130:
                    s = sArr[c];
                    s2 = 17567;
                    if (C1977.f7413 <= 0) {
                        iM11306 = (i4 - C19806.m45029("ܳ۬")) * (-121);
                        i2 = ((iM11306 ^ i5) * 6465) ^ 1746503926;
                        i3 = -1114764005;
                    } else {
                        iM11306 = C19806.m45029("ۘۘ") ^ i4;
                        i2 = ((iM11306 ^ i5) * (-21615)) ^ 281554336;
                        i3 = -1374449932;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                case 1257599813:
                case 1833552098:
                    i13 = 25665;
                    int iM450210 = C19806.m45029("ܺ᩷") ^ i4;
                    i6 = ((iM450210 ^ i5) * (-10719)) ^ (-787281076);
                    i7 = iM450210 ^ (-1504123229);
                    break;
                case 1367383049:
                case 1988283910:
                    sArr2 = f75433;
                    i14 = 37;
                    i8 = 5;
                    if (C19806.f63586) {
                        iM11306 = (C19806.m45029("ۘ᩷") + i5) * 95;
                        i2 = ((iM11306 ^ i4) * 9909) ^ 1865042256;
                        i3 = -2129584892;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖ᩸") ^ i5;
                        i2 = ((iM11306 ^ i4) * (-13143)) ^ 1129135968;
                        i3 = -1765961610;
                    }
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
                default:
                    C1025.m3861();
                    C0278.m1789();
                    iM11306 = C19806.m45029("֨ܳ") ^ i4;
                    i2 = ((iM11306 ^ i5) * (-21549)) ^ 958923496;
                    i3 = 1590801161;
                    i7 = iM11306 ^ i3;
                    i6 = i2;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x009d A[PHI: r3
      0x009d: PHI (r3v4 int) = (r3v3 int), (r3v2 int) binds: [B:31:0x009b, B:17:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0176 A[PHI: r0 r9
      0x0176: PHI (r0v4 int) = (r0v2 int), (r0v3 int), (r0v2 int), (r0v2 int), (r0v2 int) binds: [B:56:0x0174, B:46:0x011b, B:42:0x00f9, B:26:0x0085, B:14:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0176: PHI (r9v6 android.text.style.StyleSpan) = 
      (r9v4 android.text.style.StyleSpan)
      (r9v4 android.text.style.StyleSpan)
      (r9v5 android.text.style.StyleSpan)
      (r9v4 android.text.style.StyleSpan)
      (r9v4 android.text.style.StyleSpan)
     binds: [B:56:0x0174, B:46:0x011b, B:42:0x00f9, B:26:0x0085, B:14:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m51318(SpannableStringBuilder spannableStringBuilder, String str) {
        int iM45029;
        int i;
        int iM5086 = 0;
        int iM5087 = 0;
        int i2 = 0;
        int i3 = -673285558;
        int i4 = C0050.f912;
        int i5 = C0278.f1572;
        int iM450210 = C19806.m45029("ܶܳ") ^ i5;
        int i6 = ((iM450210 ^ i4) * (-1607)) ^ 1067035319;
        int i7 = 1965120575;
        while (true) {
            int i8 = iM450210 ^ i7;
            StyleSpan styleSpan = null;
            while (true) {
                i3 = ((((i3 ^ i4) * 11975) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -1947259232:
                    case -1532297153:
                        C2704.m8255();
                        break;
                    case -1916711624:
                    case 574427503:
                        if (C1419.f5860 >= 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("᩶ۧ") ^ i4) * (-43);
                            i6 = ((iM45029 ^ i5) * (-29719)) ^ (-1251288134);
                            i = -1091663846;
                        } else {
                            iM45029 = C19806.m45029("֫ۤ") ^ i4;
                            i6 = ((iM45029 ^ i5) * 23479) ^ (-1119965385);
                            i = -783770563;
                        }
                        i8 = iM45029 ^ i;
                        break;
                    case -1654475961:
                    case 1746193355:
                        C0526.m2437();
                        RunnableC3388.m10064();
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۧ") ^ i4) * (-43);
                        i6 = ((iM45029 ^ i5) * (-29719)) ^ (-1251288134);
                        i = -1091663846;
                        i8 = iM45029 ^ i;
                        break;
                    case -1636350467:
                    case -643917841:
                        iM5087 = C1461.m5086(spannableStringBuilder);
                        if (C2124.f7782 > 0) {
                            iM45029 = (i4 - ThreadFactoryC3888.m11306("᩺ۢ")) * (-77);
                            i6 = ((iM45029 ^ i5) * (-24689)) ^ (-1763057602);
                            i = -338985142;
                            i8 = iM45029 ^ i;
                        }
                        break;
                    case -1516436721:
                    case -203172085:
                        i2 = 33;
                        C19806.m45018(spannableStringBuilder, styleSpan, iM5086, iM5087, 33);
                        if (C1461.f5957 <= 0) {
                            iM45029 = C19806.m45029("֫ۤ") ^ i4;
                            i6 = ((iM45029 ^ i5) * 23479) ^ (-1119965385);
                            i = -783770563;
                        } else {
                            iM45029 = (i5 - C19806.m45029("ۧܶ")) * (-43);
                            i6 = ((iM45029 ^ i4) * (-21595)) ^ 1089401297;
                            i = 911399684;
                        }
                        i8 = iM45029 ^ i;
                        break;
                    case -1250880106:
                    case -9508802:
                        iM5086 = C1461.m5086(spannableStringBuilder);
                        if (RunnableC1895.m6170() != 0) {
                            iM45029 = (i5 - ThreadFactoryC3888.m11306("ۤۙ")) * 53;
                            i6 = ((iM45029 ^ i4) * (-19721)) ^ (-2050810520);
                            i = -1799922398;
                        } else {
                            iM45029 = C19806.m45029("۠۠") ^ i5;
                            i6 = ((iM45029 ^ i4) * (-31891)) ^ 1539287776;
                            i = 1862048631;
                        }
                        i8 = iM45029 ^ i;
                        break;
                    case -957135259:
                    case -453626050:
                        if (C2124.f7782 > 0) {
                            iM45029 = ThreadFactoryC3888.m11306("ۜۖ") ^ i4;
                            i6 = ((iM45029 ^ i5) * 6961) ^ 584095286;
                            i = -1287345497;
                            i8 = iM45029 ^ i;
                        }
                        break;
                    case -860647082:
                    case -524995408:
                        if (C1377.f5749) {
                            iM45029 = (i5 - ThreadFactoryC3888.m11306("ۤۙ")) * 53;
                            i6 = ((iM45029 ^ i4) * (-19721)) ^ (-2050810520);
                            i = -1799922398;
                        } else {
                            iM45029 = (ThreadFactoryC3888.m11306("᩶ۧ") ^ i4) * (-43);
                            i6 = ((iM45029 ^ i5) * (-29719)) ^ (-1251288134);
                            i = -1091663846;
                        }
                        i8 = iM45029 ^ i;
                        break;
                    case -327915766:
                    case 997543836:
                        if (C0050.m946() <= 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("᩶ۧ") ^ i4) * (-43);
                            i6 = ((iM45029 ^ i5) * (-29719)) ^ (-1251288134);
                            i = -1091663846;
                        } else {
                            if (C2642.m8171() == 0) {
                                C19806.m45018(spannableStringBuilder, new RelativeSizeSpan(1.1f), iM5086, MenuItemOnMenuItemClickListenerC3244.m9702(spannableStringBuilder), i2);
                            }
                            iM45029 = (i5 - ThreadFactoryC3888.m11306("ۤۙ")) * 53;
                            i6 = ((iM45029 ^ i4) * (-19721)) ^ (-2050810520);
                            i = -1799922398;
                        }
                        i8 = iM45029 ^ i;
                        break;
                    case -195088858:
                    case 841466858:
                        C0216.m1591();
                        if (C3577.f13150 >= 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("᩶ۧ") ^ i4) * (-43);
                            i6 = ((iM45029 ^ i5) * (-29719)) ^ (-1251288134);
                            i = -1091663846;
                        } else {
                            iM45029 = C19806.m45029("ܰܰ") ^ i5;
                            i6 = ((iM45029 ^ i4) * (-21277)) ^ 1426898154;
                            i = -775654351;
                        }
                        i8 = iM45029 ^ i;
                        break;
                    case 830241988:
                    case 1938506768:
                        C1025.m3865(spannableStringBuilder, str);
                        if (C1937.f7317 < 0) {
                            styleSpan = new StyleSpan(1);
                            if (C2332.f8260) {
                                iM45029 = (C19806.m45029("۫ܺ") ^ i5) * 17;
                                i6 = ((iM45029 ^ i4) * (-30279)) ^ (-1910730111);
                                i = 1786941109;
                            } else {
                                iM45029 = (i5 - ThreadFactoryC3888.m11306("ۤۙ")) * 53;
                                i6 = ((iM45029 ^ i4) * (-19721)) ^ (-2050810520);
                                i = -1799922398;
                            }
                            i8 = iM45029 ^ i;
                        }
                        break;
                    case 1750514149:
                    case 1776690531:
                        if (C0216.f1393 != 0) {
                            iM45029 = (i5 - ThreadFactoryC3888.m11306("ۤۙ")) * 53;
                            i6 = ((iM45029 ^ i4) * (-19721)) ^ (-2050810520);
                            i = -1799922398;
                        } else {
                            iM45029 = C19806.m45029("ۙۤ") ^ i5;
                            i6 = ((iM45029 ^ i4) * (-10555)) ^ (-1152514299);
                            i = -729175930;
                        }
                        i8 = iM45029 ^ i;
                        break;
                    default:
                        if (C1398.f5802 > 0) {
                            iM45029 = (ThreadFactoryC3888.m11306("᩹ᩴ") ^ i4) * 19;
                            i6 = ((iM45029 ^ i5) * 8453) ^ (-218385648);
                            i = 1139589974;
                            i8 = iM45029 ^ i;
                        }
                        break;
                }
                return;
            }
            iM450210 = ThreadFactoryC3888.m11306("᩺۬") ^ i4;
            i6 = ((iM450210 ^ i5) * (-28345)) ^ 1327539766;
            i7 = 2114871739;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 21781. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51321() {
        /*
            Method dump skipped, instruction units count: 2178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC23253.m51321():void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51322(String str) {
        C15492 c15492 = null;
        int i = 0;
        boolean z = false;
        int i2 = -735053613;
        int i3 = C2249.f8050;
        int i4 = C1189.f5284;
        int iM45029 = C19806.m45029("᩸᩵") ^ i3;
        int i5 = ((iM45029 ^ i4) * 25043) ^ 495693375;
        int i6 = 1836257575;
        while (true) {
            i2 = ((((i2 ^ i4) * (-8891)) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -1801152129:
                case 999541506:
                    if (RunnableC0195.m1431()) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩹ۗ") ^ i4) * 37;
                        i5 = ((iM45029 ^ i3) * (-17591)) ^ (-537911216);
                        i6 = 1064695083;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ۫") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-32303)) ^ 1584479836;
                        i6 = -698954984;
                    }
                    break;
                case -1747933299:
                case -348383306:
                    i = 0;
                    c15492.m37081(false);
                    if (C1668.m5583()) {
                        iM45029 = ThreadFactoryC3888.m11306("ܶ֫") ^ i3;
                        i5 = ((iM45029 ^ i4) * 23469) ^ (-2052651315);
                        i6 = -305151811;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۛ᩹")) * (-17);
                        i5 = ((iM45029 ^ i4) * 1725) ^ (-790900047);
                        i6 = 339517673;
                    }
                    break;
                case -1658735259:
                case 766276839:
                    C1461.m5083(c15492, str);
                    z = true;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (i3 - C19806.m45029("ᩴۨ")) * 55;
                        i5 = ((iM45029 ^ i4) * 6453) ^ (-133640324);
                        i6 = 1386808543;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۜ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-23803)) ^ 793240136;
                        i6 = 2113648717;
                    }
                    break;
                case -1650568347:
                case -198645648:
                    RunnableC0195.m1431();
                    C2788.m8472();
                    break;
                case -1391259979:
                case 1678108883:
                    if (C2332.f8260) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܿۖ") ^ i4) * 61;
                        i5 = ((iM45029 ^ i3) * (-30287)) ^ 37805025;
                        i6 = -1214534586;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۜ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-23803)) ^ 793240136;
                        i6 = 2113648717;
                    }
                    break;
                case -1137899712:
                case 920411827:
                    C1398.m4895();
                    if (C1461.f5957 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۜ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-23803)) ^ 793240136;
                        i6 = 2113648717;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ۫") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-32303)) ^ 1584479836;
                        i6 = -698954984;
                    }
                    break;
                case -1125494878:
                case 69615400:
                    if (C2642.m8171() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۜ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-23803)) ^ 793240136;
                        i6 = 2113648717;
                    } else {
                        iM45029 = (C19806.m45029("ᩴ֫") ^ i3) * 127;
                        i5 = ((iM45029 ^ i4) * 24293) ^ 1797877962;
                        i6 = -1524241704;
                    }
                    break;
                case -1114088327:
                case 1330428712:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    if (!RunnableC1564.f6300) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ۫") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-32303)) ^ 1584479836;
                        i6 = -698954984;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۙ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-28963)) ^ (-1586297994);
                        i6 = -304360907;
                    }
                    break;
                case -1074898841:
                case -890115600:
                    if (C1937.f7317 >= 0) {
                        iM45029 = C19806.m45029("۫֫") ^ i4;
                        i5 = ((iM45029 ^ i3) * 3917) ^ (-1551676651);
                        i6 = -865377967;
                    } else {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("֡ᩳ")) * 85;
                        i5 = ((iM45029 ^ i3) * (-22583)) ^ 1479817590;
                        i6 = -1153965050;
                    }
                    break;
                case -973600107:
                case 372678831:
                    C2642.m8171();
                    iM45029 = ThreadFactoryC3888.m11306("᩸ۙ") ^ i4;
                    i5 = ((iM45029 ^ i3) * (-28963)) ^ (-1586297994);
                    i6 = -304360907;
                    break;
                case -920801871:
                case 759944854:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = C19806.m45029("۫֫") ^ i4;
                        i5 = ((iM45029 ^ i3) * 3917) ^ (-1551676651);
                        i6 = -865377967;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۙ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-28963)) ^ (-1586297994);
                        i6 = -304360907;
                    }
                    break;
                case -686622600:
                case 2002753000:
                    if (C2332.f8260) {
                        iM45029 = C19806.m45029("ۜ֨") ^ i3;
                        i5 = ((iM45029 ^ i4) * 7229) ^ (-1525810377);
                        i6 = 1422332508;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۜ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-23803)) ^ 793240136;
                        i6 = 2113648717;
                    }
                    break;
                case -104041676:
                case 92161344:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (ThreadFactoryC3888.m11306("֡ۗ") + i3) * (-5);
                        i5 = ((iM45029 ^ i4) * (-24825)) ^ 1778193936;
                        i6 = -2099146363;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ۛ᩹")) * (-17);
                        i5 = ((iM45029 ^ i4) * 1725) ^ (-790900047);
                        i6 = 339517673;
                    }
                    break;
                case -66126355:
                case 1184354111:
                    c15492 = this.f75436;
                    if (C1419.f5860 >= 0) {
                        iM45029 = C19806.m45029("۫֫") ^ i4;
                        i5 = ((iM45029 ^ i3) * 3917) ^ (-1551676651);
                        i6 = -865377967;
                    } else {
                        iM45029 = (C19806.m45029("۫ۢ") ^ i4) * (-95);
                        i5 = ((iM45029 ^ i3) * 7261) ^ 1929901758;
                        i6 = -1092372848;
                    }
                    break;
                case 1111104025:
                case 2054226912:
                    c15492.setSelection(i, C1461.m5087(c15492));
                    break;
                default:
                    c15492.m37081(z);
                    if (C7105.f23796 >= 0) {
                        iM45029 = C19806.m45029("۫֫") ^ i4;
                        i5 = ((iM45029 ^ i3) * 3917) ^ (-1551676651);
                        i6 = -865377967;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳۗ") + i4) * 41;
                        i5 = ((iM45029 ^ i3) * (-17909)) ^ 1773157503;
                        i6 = -1176362716;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c0 A[PHI: r0
      0x00c0: PHI (r0v4 int) = (r0v3 int), (r0v2 int), (r0v2 int) binds: [B:35:0x00be, B:13:0x0039, B:10:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ee A[PHI: r8
      0x00ee: PHI (r8v8 android.text.style.RelativeSizeSpan) = 
      (r8v4 android.text.style.RelativeSizeSpan)
      (r8v5 android.text.style.RelativeSizeSpan)
      (r8v4 android.text.style.RelativeSizeSpan)
     binds: [B:39:0x00ec, B:31:0x009d, B:10:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x011c A[PHI: r2
      0x011c: PHI (r2v4 int) = (r2v2 int), (r2v3 int), (r2v2 int), (r2v2 int) binds: [B:43:0x011a, B:24:0x005b, B:18:0x0043, B:16:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0191  */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m51310(SpannableStringBuilder spannableStringBuilder, String str) {
        int iM11306;
        int i;
        int iM5086 = 0;
        int iM5087 = 0;
        int i2 = 1862203177;
        int i3 = C1419.f5860;
        int i4 = C2249.f8050;
        int iM11307 = ThreadFactoryC3888.m11306("ۡۜ") ^ i4;
        int i5 = ((iM11307 ^ i3) * (-115)) ^ 241877688;
        int i6 = 1317963089;
        while (true) {
            int i7 = iM11307 ^ i6;
            RelativeSizeSpan relativeSizeSpan = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-27261)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1942795906:
                    case 971484484:
                        iM5086 = C1461.m5086(spannableStringBuilder);
                        if (C2704.m8255() <= 0) {
                            iM11306 = (C19806.m45029("ۚ֫") + i3) * (-127);
                            i5 = ((iM11306 ^ i4) * (-27525)) ^ (-1293620459);
                            i = 1887927478;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("᩹᩹") ^ i3;
                            i5 = ((iM11306 ^ i4) * 29335) ^ (-1144868471);
                            i = 1283758683;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -1935780616:
                    case -1100619951:
                        if (C3535.f13026 <= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۤܳ") ^ i4;
                            i5 = ((iM11306 ^ i3) * 11939) ^ 1183293274;
                            i = 498781154;
                        } else {
                            iM11306 = (C19806.m45029("ܳ۬") ^ i3) * 13;
                            i5 = ((iM11306 ^ i4) * (-30935)) ^ (-1488698180);
                            i = -1131653707;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -1930885092:
                    case 428985962:
                        C19806.m45018(spannableStringBuilder, relativeSizeSpan, iM5086, iM5087, 33);
                        break;
                    case -1897068507:
                    case -1179883733:
                        if (RunnableC1895.m6170() != 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۤܳ") ^ i4;
                            i5 = ((iM11306 ^ i3) * 11939) ^ 1183293274;
                            i = 498781154;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ܿܳ") ^ i3) * 79;
                            i5 = ((iM11306 ^ i4) * (-17411)) ^ (-1852862354);
                            i = 74228574;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -1754463731:
                    case -1542307571:
                        if (C1025.f4800 >= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۛ᩻") ^ i4;
                            i5 = ((iM11306 ^ i3) * 29725) ^ (-1263582618);
                            i = -2009134610;
                        } else {
                            iM11306 = C19806.m45029("ᩳܽ") ^ i3;
                            i5 = ((iM11306 ^ i4) * 18477) ^ 1534053929;
                            i = -331047148;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -1725441023:
                    case 2084972491:
                        C0797.m3349(spannableStringBuilder, str);
                        if (C2124.f7782 > 0) {
                            relativeSizeSpan = new RelativeSizeSpan(0.8f);
                            if (C0671.m3008() >= 0) {
                                iM11306 = ThreadFactoryC3888.m11306("ۛ᩻") ^ i4;
                                i5 = ((iM11306 ^ i3) * 29725) ^ (-1263582618);
                                i = -2009134610;
                            } else {
                                iM11306 = (ThreadFactoryC3888.m11306("ܿ᩵") ^ i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                i5 = ((iM11306 ^ i3) * (-8765)) ^ 63808605;
                                i = -1897269863;
                            }
                            i7 = iM11306 ^ i;
                        }
                        break;
                    case -1167983408:
                    case 559887472:
                        if (RunnableC1895.m6170() != 0) {
                            iM11306 = ThreadFactoryC3888.m11306("᩹ܿ") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-23177)) ^ 122986253;
                            i = -1408036250;
                        } else {
                            iM11306 = (C19806.m45029("۬ۖ") + i4) * (-39);
                            i5 = ((iM11306 ^ i3) * 30285) ^ (-2023419953);
                            i = 668065532;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -972838142:
                    case 2041585914:
                        RunnableC0195.m1431();
                        C2249.m6915();
                        break;
                    case -964363820:
                    case 1696058096:
                        iM5087 = C1461.m5086(spannableStringBuilder);
                        if (AbstractC0464.f2088 <= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("᩹ܿ") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-23177)) ^ 122986253;
                            i = -1408036250;
                        } else {
                            iM11306 = (C19806.m45029("ۧۨ") ^ i4) * 79;
                            i5 = ((iM11306 ^ i3) * (-25405)) ^ (-952970610);
                            i = 1193894072;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -623725434:
                    case 1214035841:
                        C1937.m6279();
                        if (C1875.f7103 < 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۤܳ") ^ i4;
                            i5 = ((iM11306 ^ i3) * 11939) ^ 1183293274;
                            i = 498781154;
                        } else {
                            iM11306 = (C19806.m45029("ۚ֫") + i3) * (-127);
                            i5 = ((iM11306 ^ i4) * (-27525)) ^ (-1293620459);
                            i = 1887927478;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case -572963262:
                    case 1711414230:
                        RunnableC3388.m10064();
                        iM11306 = ThreadFactoryC3888.m11306("᩹ܿ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-23177)) ^ 122986253;
                        i = -1408036250;
                        i7 = iM11306 ^ i;
                        break;
                    case -389741332:
                    case -381226005:
                        if (C3660.f13403 >= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۤܳ") ^ i4;
                            i5 = ((iM11306 ^ i3) * 11939) ^ 1183293274;
                            i = 498781154;
                        } else {
                            iM11306 = C19806.m45029("ۜܿ") ^ i4;
                            i5 = ((iM11306 ^ i3) * 23853) ^ (-390784105);
                            i = 1291705972;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case 281257383:
                    case 1724342281:
                        if (C1977.f7413 <= 0) {
                            iM11306 = (C19806.m45029("ۚ֫") + i3) * (-127);
                            i5 = ((iM11306 ^ i4) * (-27525)) ^ (-1293620459);
                            i = 1887927478;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ۛ᩻") ^ i4;
                            i5 = ((iM11306 ^ i3) * 29725) ^ (-1263582618);
                            i = -2009134610;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    case 1567063204:
                    case 1973969597:
                        if (C0629.f2722 > 0) {
                            iM11306 = ThreadFactoryC3888.m11306("᩹ܿ") ^ i3;
                            i5 = ((iM11306 ^ i4) * (-23177)) ^ 122986253;
                            i = -1408036250;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ۤܳ") ^ i4;
                            i5 = ((iM11306 ^ i3) * 11939) ^ 1183293274;
                            i = 498781154;
                        }
                        i7 = iM11306 ^ i;
                        break;
                    default:
                        if (C1461.f5957 <= 0) {
                            iM11306 = ThreadFactoryC3888.m11306("ۤܳ") ^ i4;
                            i5 = ((iM11306 ^ i3) * 11939) ^ 1183293274;
                            i = 498781154;
                        } else {
                            iM11306 = C19806.m45029("᩷ۙ") ^ i4;
                            i5 = ((iM11306 ^ i3) * 18921) ^ 860942735;
                            i = -515940771;
                        }
                        i7 = iM11306 ^ i;
                        break;
                }
                return;
            }
            iM11307 = (ThreadFactoryC3888.m11306("᩻᩵") ^ i3) * (-71);
            i5 = ((iM11307 ^ i4) * 28899) ^ 203763619;
            i6 = -646910679;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 108081. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r70) {
        /*
            Method dump skipped, instruction units count: 10808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC23253.onClick(android.view.View):void");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x012c  */
    /* JADX WARN: Code duplicated, block: B:48:0x01a5 A[PHI: r4 r5
      0x01a5: PHI (r4v57 int) = (r4v2 int), (r4v2 int), (r4v51 int), (r4v2 int), (r4v2 int), (r4v2 int) binds: [B:198:0x01a5, B:195:0x01a5, B:47:0x01a3, B:32:0x0128, B:11:0x008b, B:229:0x01a5] A[DONT_GENERATE, DONT_INLINE]
      0x01a5: PHI (r5v47 int) = (r5v2 int), (r5v2 int), (r5v45 int), (r5v2 int), (r5v2 int), (r5v2 int) binds: [B:198:0x01a5, B:195:0x01a5, B:47:0x01a3, B:32:0x0128, B:11:0x008b, B:229:0x01a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m51312(SpannableStringBuilder spannableStringBuilder, ArrayList arrayList, boolean z, char c) {
        int iM45029;
        int i;
        int i2;
        int iM450210;
        int i3;
        int i4;
        int i5;
        int iM11306;
        int i6;
        int iM11307;
        int i7;
        int i8;
        int iM11308;
        int i9;
        int i10;
        int iM450211;
        int i11;
        int iM11309;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        StringBuilder sb;
        int iM450212;
        int i18;
        int i19;
        int iM450213;
        int i20;
        int i21;
        int i22;
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        short[] sArr = null;
        char c2 = 0;
        int i23 = 1777338935;
        int i24 = RunnableC1606.f6488;
        int i25 = C1189.f5284;
        int iM113010 = (ThreadFactoryC3888.m11306("ܰ۫") + i24) * 43;
        int i26 = ((iM113010 ^ i25) * (-23121)) ^ (-115064080);
        int i27 = iM113010 ^ (-683875312);
        InterfaceC3609 interfaceC3609 = null;
        String strM10901 = null;
        StringBuilder sb2 = null;
        Iterator itM5072 = null;
        StringBuilder sb3 = null;
        int i28 = 0;
        int i29 = 0;
        int value = 0;
        int i30 = 0;
        int iM3364 = 0;
        int i31 = 0;
        InterfaceC9961 interfaceC9961 = null;
        String strM3407 = null;
        Iterator itM4898 = null;
        C6037 c6037 = null;
        String strMo31755 = null;
        StringBuilder sb4 = null;
        InterfaceC3609 interfaceC36010 = null;
        while (true) {
            i23 = i27 ^ (i26 & (((i23 ^ i25) * 28897) >> 31));
            switch (i23) {
                case -2131038149:
                case 1328664637:
                    interfaceC9961 = (InterfaceC9961) C0216.m1584(itM4898);
                    sb3 = new StringBuilder();
                    C19806.m45023(sb3, '\n');
                    if (interfaceC9961.mo25193() != -1) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴ۟") ^ i24;
                        i = ((iM45029 ^ i25) * 2789) ^ (-1577690623);
                        i2 = 1974871688;
                    } else {
                        iM45029 = (C19806.m45029("۟֡") + i25) * (-125);
                        i = ((iM45029 ^ i24) * (-2665)) ^ (-185709966);
                        i2 = -847183498;
                    }
                    i27 = iM45029 ^ i2;
                    i26 = i;
                    break;
                case -2130560213:
                case -1029503895:
                    sb3 = sb3;
                    i28 = i28;
                    RunnableC3388.m10062(spannableStringBuilder2, C3577.m10567(C1066.m4040(f75433, 26, 8, i30), c6037.m16365(interfaceC36010.getParent())));
                    iM450213 = C19806.m45029("ۜ֨") ^ i25;
                    i20 = ((iM450213 ^ i24) * 21213) ^ 955570324;
                    i21 = -1239880829;
                    i22 = iM450213 ^ i21;
                    i26 = i20;
                    i28 = i28;
                    StringBuilder sb5 = sb3;
                    i27 = i22;
                    sb3 = sb5;
                    break;
                case -2103010986:
                case -707311230:
                    C3535.m10431();
                    if (!C0817.f3443) {
                        sb3 = sb3;
                        i28 = i28;
                        strM10901 = strM10901;
                        i29 = i29;
                        i31 = i31;
                        value = value;
                        iM450210 = (i25 - ThreadFactoryC3888.m11306("ۡ֫")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM450210 ^ i24) * (-5913)) ^ (-1418992532);
                        i4 = -562705069;
                        i8 = iM450210 ^ i4;
                        value = value;
                        i31 = i31;
                        i29 = i29;
                        strM10901 = strM10901;
                        sb3 = sb3;
                        i27 = i8;
                        i26 = i3;
                        i28 = i28;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۡ") ^ i24;
                        i = ((iM45029 ^ i25) * (-26063)) ^ 722742770;
                        i2 = -351601928;
                        i27 = iM45029 ^ i2;
                        i26 = i;
                    }
                    break;
                case -2091787906:
                case 518440103:
                    sb3 = sb3;
                    i28 = i28;
                    if (!C0962.m3748(itM4898)) {
                        iM11308 = ThreadFactoryC3888.m11306("֡ۧ") ^ i24;
                        i9 = ((iM11308 ^ i25) * 16477) ^ 877437786;
                        i10 = -741915870;
                        i5 = iM11308 ^ i10;
                        strM10901 = strM10901;
                        i26 = i9;
                        sb3 = sb3;
                        i27 = i5;
                        i28 = i28;
                    } else {
                        iM450211 = (C19806.m45029("ۖᩳ") ^ i24) * (-37);
                        i26 = ((iM450211 ^ i25) * 29291) ^ (-544813868);
                        i11 = -719444740;
                        i22 = iM450211 ^ i11;
                        i28 = i28;
                        StringBuilder sb6 = sb3;
                        i27 = i22;
                        sb3 = sb6;
                    }
                    break;
                case -1933370874:
                case 1714744278:
                    C0216.m1591();
                    if (AbstractC0464.f2088 > 0) {
                        sb3 = sb3;
                        strM10901 = strM10901;
                        i15 = i29;
                        i16 = i31;
                        i14 = value;
                        int iM450214 = (i24 - C19806.m45029("ۧ۬")) * 119;
                        i26 = ((iM450214 ^ i25) * 31011) ^ 1595427849;
                        value = i14;
                        spannableStringBuilder2 = spannableStringBuilder;
                        i31 = i16;
                        i29 = i15;
                        strM10901 = strM10901;
                        sb3 = sb3;
                        i27 = iM450214 ^ 1383452907;
                    } else {
                        sb3 = sb3;
                        i28 = i28;
                        strM10901 = strM10901;
                        i29 = i29;
                        i31 = i31;
                        value = value;
                        iM450210 = (i25 - ThreadFactoryC3888.m11306("ۡ֫")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM450210 ^ i24) * (-5913)) ^ (-1418992532);
                        i4 = -562705069;
                        i8 = iM450210 ^ i4;
                        value = value;
                        i31 = i31;
                        i29 = i29;
                        strM10901 = strM10901;
                        sb3 = sb3;
                        i27 = i8;
                        i26 = i3;
                        i28 = i28;
                    }
                    break;
                case -1886096904:
                case 862311689:
                    if (C1025.f4800 < 0) {
                        sb3 = sb3;
                        i28 = i28;
                        strM10901 = strM10901;
                        i29 = i29;
                        i31 = i31;
                        value = value;
                        iM11306 = ThreadFactoryC3888.m11306("᩹ۢ") ^ i25;
                        i3 = ((iM11306 ^ i24) * 16981) ^ 1558852400;
                        i6 = -58287170;
                        i8 = iM11306 ^ i6;
                        value = value;
                        i31 = i31;
                        i29 = i29;
                        strM10901 = strM10901;
                        sb3 = sb3;
                        i27 = i8;
                        i26 = i3;
                        i28 = i28;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۡ") ^ i24;
                        i = ((iM45029 ^ i25) * (-26063)) ^ 722742770;
                        i2 = -351601928;
                        i27 = iM45029 ^ i2;
                        i26 = i;
                    }
                    break;
                case -1852127712:
                case 74899201:
                    C0629.m2907();
                    break;
                case -1813916389:
                case -966882306:
                    itM4898 = C1398.m4898(interfaceC36010.values());
                    iM450211 = (ThreadFactoryC3888.m11306("ۗ᩺") + i24) * 119;
                    i26 = ((iM450211 ^ i25) * 19979) ^ (-2125985907);
                    i11 = -23960525;
                    i22 = iM450211 ^ i11;
                    i28 = i28;
                    StringBuilder sb7 = sb3;
                    i27 = i22;
                    sb3 = sb7;
                    break;
                case -1812193171:
                case 1848300111:
                    i30 = 48810;
                    iM11309 = C19806.m45029("ۖܳ") ^ i25;
                    i12 = ((iM11309 ^ i24) * (-1879)) ^ 1624834560;
                    i13 = -402665171;
                    i17 = iM11309 ^ i13;
                    i26 = i12;
                    value = value;
                    i28 = i28;
                    i31 = i31;
                    i29 = i29;
                    strM10901 = strM10901;
                    sb3 = sb3;
                    i27 = i17;
                    spannableStringBuilder2 = spannableStringBuilder;
                    break;
                case -1803466358:
                case -527608433:
                    iM3364 = C0797.m3364(sb3) + C1461.m5086(spannableStringBuilder);
                    C2788.m8480(sb3, c6037.m16366(interfaceC9961));
                    if (C2871.f10837 < 0) {
                        iM45029 = (C19806.m45029("᩸ۚ") + i25) * 53;
                        i = ((iM45029 ^ i24) * (-12269)) ^ 870609590;
                        i2 = -724418277;
                        i27 = iM45029 ^ i2;
                        i26 = i;
                    } else {
                        sb3 = sb3;
                        strM10901 = strM10901;
                        i15 = i29;
                        i16 = i31;
                        i14 = value;
                        int iM450215 = (i24 - C19806.m45029("ۧ۬")) * 119;
                        i26 = ((iM450215 ^ i25) * 31011) ^ 1595427849;
                        value = i14;
                        spannableStringBuilder2 = spannableStringBuilder;
                        i31 = i16;
                        i29 = i15;
                        strM10901 = strM10901;
                        sb3 = sb3;
                        i27 = iM450215 ^ 1383452907;
                    }
                    break;
                case -1765382193:
                case 668516158:
                    sb3 = sb3;
                    i28 = i28;
                    strM10901 = strM10901;
                    i29 = i29;
                    i31 = i31;
                    if (interfaceC3609.mo10692().mo19106() != i31) {
                        iM11307 = (i24 - ThreadFactoryC3888.m11306("۠ܺ")) * (-35);
                        i3 = ((iM11307 ^ i25) * 6163) ^ 1372730290;
                        i7 = 930420535;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ܿ᩷") ^ i25;
                        i3 = ((iM11307 ^ i24) * 16159) ^ (-126008339);
                        i7 = 208472826;
                    }
                    i8 = iM11307 ^ i7;
                    i31 = i31;
                    i29 = i29;
                    strM10901 = strM10901;
                    sb3 = sb3;
                    i27 = i8;
                    i26 = i3;
                    i28 = i28;
                    break;
                case -1749438463:
                case 1041392149:
                    sb3 = sb3;
                    i14 = value;
                    strM10901 = strM10901;
                    i15 = i29;
                    i28 = 0;
                    interfaceC3609 = (InterfaceC3609) RunnableC1606.m5478(arrayList, 0);
                    i16 = 1;
                    if (C3722.f13525 > 0) {
                        int iM450216 = C19806.m45029("۬ܿ") ^ i24;
                        int i32 = ((iM450216 ^ i25) * 1079) ^ (-883118221);
                        i17 = iM450216 ^ (-1868340017);
                        i26 = i32;
                        value = i14;
                        i29 = i15;
                        i31 = 1;
                        strM10901 = strM10901;
                        sb3 = sb3;
                        i27 = i17;
                        spannableStringBuilder2 = spannableStringBuilder;
                    } else {
                        int iM450217 = (i24 - C19806.m45029("ۧ۬")) * 119;
                        i26 = ((iM450217 ^ i25) * 31011) ^ 1595427849;
                        value = i14;
                        spannableStringBuilder2 = spannableStringBuilder;
                        i31 = i16;
                        i29 = i15;
                        strM10901 = strM10901;
                        sb3 = sb3;
                        i27 = iM450217 ^ 1383452907;
                    }
                    break;
                case -1704801605:
                case 1322750832:
                    C2788.m8480(sb3, c6037.m16375(interfaceC9961.mo25193()));
                    m51316(spannableStringBuilder2, C2124.m6674(sb3));
                    sb3.setLength(i28);
                    ThreadFactoryC3888.m11302(sb3, a.h);
                    iM45029 = (C19806.m45029("۟֡") + i25) * (-125);
                    i = ((iM45029 ^ i24) * (-2665)) ^ (-185709966);
                    i2 = -847183498;
                    i27 = iM45029 ^ i2;
                    i26 = i;
                    break;
                case -1644672363:
                case 1355161305:
                    sb3 = sb3;
                    i28 = i28;
                    C2788.m8480(sb4, strMo31755);
                    C2788.m8480(sb4, strM3407);
                    m51311(spannableStringBuilder2, C2124.m6674(sb4));
                    boolean zMo7644 = interfaceC36010.mo7644();
                    c6037 = this.f75434;
                    if (zMo7644) {
                        iM450213 = C19806.m45029("ܶۡ") ^ i24;
                        i20 = ((iM450213 ^ i25) * (-27167)) ^ 644597160;
                        i21 = 405194600;
                    } else {
                        iM450213 = C19806.m45029("ۜ֨") ^ i25;
                        i20 = ((iM450213 ^ i24) * 21213) ^ 955570324;
                        i21 = -1239880829;
                    }
                    i22 = iM450213 ^ i21;
                    i26 = i20;
                    i28 = i28;
                    StringBuilder sb8 = sb3;
                    i27 = i22;
                    sb3 = sb8;
                    break;
                case -1638184799:
                case 769780689:
                    sb3 = sb3;
                    i28 = i28;
                    strM10901 = strM10901;
                    i29 = i29;
                    i31 = i31;
                    value = value;
                    if (C1461.f5957 <= 0) {
                        iM11309 = C19806.m45029("ۘۘ") ^ i25;
                        i12 = ((iM11309 ^ i24) * (-27895)) ^ (-675863124);
                        i13 = 1827846216;
                    } else {
                        iM11309 = (ThreadFactoryC3888.m11306("۠ۙ") ^ i24) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i12 = ((iM11309 ^ i25) * (-20089)) ^ 623473660;
                        i13 = -1224325557;
                    }
                    i17 = iM11309 ^ i13;
                    i26 = i12;
                    value = value;
                    i28 = i28;
                    i31 = i31;
                    i29 = i29;
                    strM10901 = strM10901;
                    sb3 = sb3;
                    i27 = i17;
                    spannableStringBuilder2 = spannableStringBuilder;
                    break;
                case -1612925480:
                case 1990443806:
                    value = interfaceC9961.getValue();
                    ThreadFactoryC3888.m11309(spannableStringBuilder2, new BackgroundColorSpan(value), iM3364, MenuItemOnMenuItemClickListenerC3244.m9702(spannableStringBuilder), 33);
                    if (C0278.m1789() <= 0) {
                        i29 = 33;
                        iM45029 = ThreadFactoryC3888.m11306("ܺۡ") ^ i24;
                        i = ((iM45029 ^ i25) * (-26063)) ^ 722742770;
                        i2 = -351601928;
                        i27 = iM45029 ^ i2;
                        i26 = i;
                    } else {
                        int iM113011 = (ThreadFactoryC3888.m11306("۬ۢ") ^ i25) * (-75);
                        i27 = iM113011 ^ (-1444374876);
                        i26 = ((iM113011 ^ i24) * 2619) ^ (-1481319322);
                        i29 = 33;
                    }
                    break;
                case -1580487658:
                case 49207281:
                    sb3 = sb3;
                    i28 = i28;
                    strM10901 = strM10901;
                    i29 = i29;
                    if (C1460.m5058(C1875.m6108(interfaceC3609.getType()), C0671.m3009(f75433, 24, 2, i30))) {
                        i31 = i31;
                        iM11307 = ThreadFactoryC3888.m11306("ܿ᩷") ^ i25;
                        i3 = ((iM11307 ^ i24) * 16159) ^ (-126008339);
                        i7 = 208472826;
                        i8 = iM11307 ^ i7;
                        i31 = i31;
                    } else {
                        int iM450218 = C19806.m45029("᩻ܰ") ^ i25;
                        i3 = ((iM450218 ^ i24) * 4731) ^ 244712609;
                        i8 = iM450218 ^ 1548573475;
                    }
                    i29 = i29;
                    strM10901 = strM10901;
                    sb3 = sb3;
                    i27 = i8;
                    i26 = i3;
                    i28 = i28;
                    break;
                case -1575993445:
                case 81644231:
                    C0050.m946();
                    C3660.m10791();
                    sb3 = sb3;
                    i28 = i28;
                    strM10901 = strM10901;
                    i29 = i29;
                    i31 = i31;
                    value = value;
                    iM450210 = (i25 - ThreadFactoryC3888.m11306("ۡ֫")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i3 = ((iM450210 ^ i24) * (-5913)) ^ (-1418992532);
                    i4 = -562705069;
                    i8 = iM450210 ^ i4;
                    value = value;
                    i31 = i31;
                    i29 = i29;
                    strM10901 = strM10901;
                    sb3 = sb3;
                    i27 = i8;
                    i26 = i3;
                    i28 = i28;
                    break;
                case -1554793199:
                case 2083212243:
                    break;
                case -1490267466:
                case 1708429234:
                    sb3 = sb3;
                    i28 = i28;
                    StringBuilder sb9 = sb2;
                    strM10901 = strM10901;
                    i29 = i29;
                    i31 = i31;
                    value = value;
                    C2788.m8480(sb9, interfaceC3609.mo7645());
                    C0526.m2433(spannableStringBuilder2, C2124.m6674(sb9));
                    iM450210 = C19806.m45029("᩶ۡ") ^ i24;
                    i3 = ((iM450210 ^ i25) * 29163) ^ (-190091417);
                    i4 = -892268685;
                    i8 = iM450210 ^ i4;
                    value = value;
                    i31 = i31;
                    i29 = i29;
                    strM10901 = strM10901;
                    sb3 = sb3;
                    i27 = i8;
                    i26 = i3;
                    i28 = i28;
                    break;
                case -1478482375:
                case -98261264:
                    sb3 = sb3;
                    i28 = i28;
                    strM10901 = strM10901;
                    i29 = i29;
                    i31 = i31;
                    value = value;
                    short s = sArr[c2];
                    int i33 = 65552 * s;
                    int i34 = s + 16388;
                    if (i33 - (i34 * i34) > 0) {
                        iM11309 = (C19806.m45029("᩻᩵") + i25) * 95;
                        i12 = ((iM11309 ^ i24) * (-6753)) ^ (-907137818);
                        i13 = 1659227335;
                    } else {
                        iM11309 = (i24 - ThreadFactoryC3888.m11306("۫֫")) * (-125);
                        i12 = ((iM11309 ^ i25) * 30899) ^ (-889716391);
                        i13 = 2012984389;
                    }
                    i17 = iM11309 ^ i13;
                    i26 = i12;
                    value = value;
                    i28 = i28;
                    i31 = i31;
                    i29 = i29;
                    strM10901 = strM10901;
                    sb3 = sb3;
                    i27 = i17;
                    spannableStringBuilder2 = spannableStringBuilder;
                    break;
                case -1471958510:
                case 107435321:
                    sb3 = sb3;
                    i28 = i28;
                    strM10901 = strM10901;
                    i29 = i29;
                    i31 = i31;
                    strM3407 = "";
                    value = value;
                    iM11306 = ThreadFactoryC3888.m11306("ܶ᩷") ^ i24;
                    i3 = ((iM11306 ^ i25) * (-9393)) ^ (-2113875607);
                    i6 = -938503193;
                    i8 = iM11306 ^ i6;
                    value = value;
                    i31 = i31;
                    i29 = i29;
                    strM10901 = strM10901;
                    sb3 = sb3;
                    i27 = i8;
                    i26 = i3;
                    i28 = i28;
                    break;
                case -1432335962:
                case -414963499:
                    C1461.m5080();
                    if (C2332.f8260) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۡ") ^ i24;
                        i = ((iM45029 ^ i25) * (-26063)) ^ 722742770;
                        i2 = -351601928;
                    } else {
                        iM45029 = (C19806.m45029("۫᩹") ^ i24) * 77;
                        i = ((iM45029 ^ i25) * (-9983)) ^ (-245126181);
                        i2 = -1592727704;
                    }
                    i27 = iM45029 ^ i2;
                    i26 = i;
                    break;
                case -1296619369:
                case -1165317928:
                    if (((value >>> 24) & 255) <= 64) {
                        iM450211 = (ThreadFactoryC3888.m11306("ۗ᩺") + i24) * 119;
                        i26 = ((iM450211 ^ i25) * 19979) ^ (-2125985907);
                        i11 = -23960525;
                        i22 = iM450211 ^ i11;
                        i28 = i28;
                        StringBuilder sb10 = sb3;
                        i27 = i22;
                        sb3 = sb10;
                    } else {
                        iM45029 = (C19806.m45029("ᩴۚ") + i24) * 85;
                        i = ((iM45029 ^ i25) * 3211) ^ (-91048938);
                        i2 = 1988003402;
                        i27 = iM45029 ^ i2;
                        i26 = i;
                    }
                    break;
                case -1147382735:
                case -135137317:
                    sb3 = sb3;
                    i28 = i28;
                    if (interfaceC36010.getParent() != 0) {
                        iM450211 = (i25 - ThreadFactoryC3888.m11306("ܺᩳ")) * (-29);
                        i26 = ((iM450211 ^ i24) * 11337) ^ 513649970;
                        i11 = -920947965;
                        i22 = iM450211 ^ i11;
                        i28 = i28;
                        StringBuilder sb11 = sb3;
                        i27 = i22;
                        sb3 = sb11;
                    }
                    iM450213 = C19806.m45029("ۜ֨") ^ i25;
                    i20 = ((iM450213 ^ i24) * 21213) ^ 955570324;
                    i21 = -1239880829;
                    i22 = iM450213 ^ i21;
                    i26 = i20;
                    i28 = i28;
                    StringBuilder sb12 = sb3;
                    i27 = i22;
                    sb3 = sb12;
                    break;
                case -1098566113:
                case -859672886:
                    sb3 = sb3;
                    i28 = i28;
                    interfaceC36010 = (InterfaceC3609) C0278.m1776(itM5072);
                    strM10901 = strM10901;
                    sb4 = new StringBuilder(strM10901);
                    strMo31755 = interfaceC36010.mo10690().mo31755();
                    if (!C0797.f3386) {
                        iM11308 = (C19806.m45029("᩻᩸") ^ i25) * 27;
                        i9 = ((iM11308 ^ i24) * 27085) ^ 1114112704;
                        i10 = 1251518705;
                        i5 = iM11308 ^ i10;
                        strM10901 = strM10901;
                        i26 = i9;
                        sb3 = sb3;
                        i27 = i5;
                        i28 = i28;
                    }
                    i29 = i29;
                    i31 = i31;
                    value = value;
                    iM11306 = ThreadFactoryC3888.m11306("᩹ۢ") ^ i25;
                    i3 = ((iM11306 ^ i24) * 16981) ^ 1558852400;
                    i6 = -58287170;
                    i8 = iM11306 ^ i6;
                    value = value;
                    i31 = i31;
                    i29 = i29;
                    strM10901 = strM10901;
                    sb3 = sb3;
                    i27 = i8;
                    i26 = i3;
                    i28 = i28;
                    break;
                case -1020187654:
                case 932250525:
                    sb3 = sb3;
                    i28 = i28;
                    strM10901 = strM10901;
                    i29 = i29;
                    i31 = i31;
                    value = value;
                    m51311(spannableStringBuilder2, C2788.m8470(f75433, 9, 6, i30));
                    if (C1148.f5161 <= 0) {
                        iM450210 = (i25 - ThreadFactoryC3888.m11306("ۡ֫")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM450210 ^ i24) * (-5913)) ^ (-1418992532);
                        i4 = -562705069;
                    } else {
                        iM450210 = C19806.m45029("֫᩺") ^ i25;
                        i3 = ((iM450210 ^ i24) * (-1769)) ^ 444120411;
                        i4 = 974277991;
                    }
                    i8 = iM450210 ^ i4;
                    value = value;
                    i31 = i31;
                    i29 = i29;
                    strM10901 = strM10901;
                    sb3 = sb3;
                    i27 = i8;
                    i26 = i3;
                    i28 = i28;
                    break;
                case -977421071:
                case 621142656:
                    sb3 = sb3;
                    i28 = i28;
                    sb = sb2;
                    strM10901 = strM10901;
                    i29 = i29;
                    i31 = i31;
                    value = value;
                    if (C1937.m6276(arrayList) > i31) {
                        iM450212 = (C19806.m45029("ܽ۬") ^ i25) * 19;
                        i18 = ((iM450212 ^ i24) * (-16037)) ^ 917263645;
                        i19 = 1398777187;
                    } else {
                        iM450212 = C19806.m45029("᩹ܽ") ^ i25;
                        i18 = ((iM450212 ^ i24) * (-31081)) ^ 1511255931;
                        i19 = -1347412564;
                    }
                    sb2 = sb;
                    i28 = i28;
                    int i35 = i29;
                    strM10901 = strM10901;
                    sb3 = sb3;
                    i27 = iM450212 ^ i19;
                    i26 = i18;
                    value = value;
                    i31 = i31;
                    i29 = i35;
                    break;
                case -912505262:
                case 1157455463:
                    i30 = 24602;
                    iM11309 = C19806.m45029("ۖܳ") ^ i25;
                    i12 = ((iM11309 ^ i24) * (-1879)) ^ 1624834560;
                    i13 = -402665171;
                    i17 = iM11309 ^ i13;
                    i26 = i12;
                    value = value;
                    i28 = i28;
                    i31 = i31;
                    i29 = i29;
                    strM10901 = strM10901;
                    sb3 = sb3;
                    i27 = i17;
                    spannableStringBuilder2 = spannableStringBuilder;
                    break;
                case -708681124:
                case -99998361:
                    ThreadFactoryC3888.m11309(spannableStringBuilder2, new ForegroundColorSpan(C3057.m9163(value, C20368.f66007)), iM3364, MenuItemOnMenuItemClickListenerC3244.m9702(spannableStringBuilder), i29);
                    iM450211 = (ThreadFactoryC3888.m11306("ۗ᩺") + i24) * 119;
                    i26 = ((iM450211 ^ i25) * 19979) ^ (-2125985907);
                    i11 = -23960525;
                    i22 = iM450211 ^ i11;
                    i28 = i28;
                    StringBuilder sb13 = sb3;
                    i27 = i22;
                    sb3 = sb13;
                    break;
                case -537551751:
                case -466397783:
                    sb3 = sb3;
                    i28 = i28;
                    strM10901 = strM10901;
                    i29 = i29;
                    i31 = i31;
                    value = value;
                    String strM2424 = C0526.m2424(f75433, 23, 1, i30);
                    if (C2332.m7079() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩹ۢ") ^ i25;
                        i3 = ((iM11306 ^ i24) * 16981) ^ 1558852400;
                        i6 = -58287170;
                    } else {
                        StringBuilder sb14 = new StringBuilder(strM2424);
                        C1148.m4223(sb14, interfaceC3609.mo7645());
                        strM3407 = C0817.m3407(sb14);
                        iM11306 = ThreadFactoryC3888.m11306("ܶ᩷") ^ i24;
                        i3 = ((iM11306 ^ i25) * (-9393)) ^ (-2113875607);
                        i6 = -938503193;
                    }
                    i8 = iM11306 ^ i6;
                    value = value;
                    i31 = i31;
                    i29 = i29;
                    strM10901 = strM10901;
                    sb3 = sb3;
                    i27 = i8;
                    i26 = i3;
                    i28 = i28;
                    break;
                case -399366974:
                case 1505023542:
                    sb3 = sb3;
                    i28 = i28;
                    strM10901 = strM10901;
                    i29 = i29;
                    i31 = i31;
                    value = value;
                    sArr = f75433;
                    c2 = 4;
                    if (C19806.f63586) {
                        iM11309 = C19806.m45029("ۙ᩻") ^ i24;
                        i12 = ((iM11309 ^ i25) * 22479) ^ 1921785183;
                        i13 = -881687949;
                    } else {
                        iM11309 = ThreadFactoryC3888.m11306("ۜܰ") ^ i25;
                        i12 = ((iM11309 ^ i24) * (-8293)) ^ (-1990224858);
                        i13 = -1973237995;
                    }
                    i17 = iM11309 ^ i13;
                    i26 = i12;
                    value = value;
                    i28 = i28;
                    i31 = i31;
                    i29 = i29;
                    strM10901 = strM10901;
                    sb3 = sb3;
                    i27 = i17;
                    spannableStringBuilder2 = spannableStringBuilder;
                    break;
                case -341993868:
                case 579613783:
                    C0526.m2433(spannableStringBuilder2, C0817.m3407(sb3));
                    if (interfaceC9961.mo25192() < 28) {
                        iM450211 = (ThreadFactoryC3888.m11306("ۗ᩺") + i24) * 119;
                        i26 = ((iM450211 ^ i25) * 19979) ^ (-2125985907);
                        i11 = -23960525;
                        i22 = iM450211 ^ i11;
                        i28 = i28;
                        StringBuilder sb15 = sb3;
                        i27 = i22;
                        sb3 = sb15;
                    } else {
                        iM45029 = (C19806.m45029("ᩴᩳ") ^ i24) * (-107);
                        i = ((iM45029 ^ i25) * 1297) ^ 96921851;
                        i2 = 802020300;
                        i27 = iM45029 ^ i2;
                        i26 = i;
                    }
                    break;
                case -303437313:
                case 756814630:
                    if (interfaceC9961.mo25192() > 31) {
                        iM450211 = (ThreadFactoryC3888.m11306("ۗ᩺") + i24) * 119;
                        i26 = ((iM450211 ^ i25) * 19979) ^ (-2125985907);
                        i11 = -23960525;
                        i22 = iM450211 ^ i11;
                        i28 = i28;
                        StringBuilder sb16 = sb3;
                        i27 = i22;
                        sb3 = sb16;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۧ᩸") ^ i25;
                        i = ((iM45029 ^ i24) * (-23025)) ^ (-1056585170);
                        i2 = -275054696;
                        i27 = iM45029 ^ i2;
                        i26 = i;
                    }
                    break;
                case -246662301:
                case 627047885:
                    sb3 = sb3;
                    i28 = i28;
                    strM10901 = strM10901;
                    i29 = i29;
                    i31 = i31;
                    value = value;
                    m51311(spannableStringBuilder2, C2477.m7604(f75433, 6, 3, i30));
                    if (MenuItemOnMenuItemClickListenerC3244.m9701() < 0) {
                        StringBuilder sb17 = new StringBuilder(strM10901);
                        ThreadFactoryC3888.m11302(sb17, c);
                        C2788.m8480(sb17, interfaceC3609.mo10694());
                        C0526.m2433(spannableStringBuilder2, C0817.m3407(sb17));
                        iM450210 = C19806.m45029("᩶ۡ") ^ i24;
                        i3 = ((iM450210 ^ i25) * 29163) ^ (-190091417);
                        i4 = -892268685;
                        i8 = iM450210 ^ i4;
                        value = value;
                        i31 = i31;
                        i29 = i29;
                        strM10901 = strM10901;
                        sb3 = sb3;
                        i27 = i8;
                        i26 = i3;
                        i28 = i28;
                    } else {
                        iM11309 = C19806.m45029("ۙ᩻") ^ i24;
                        i12 = ((iM11309 ^ i25) * 22479) ^ 1921785183;
                        i13 = -881687949;
                        i17 = iM11309 ^ i13;
                        i26 = i12;
                        value = value;
                        i28 = i28;
                        i31 = i31;
                        i29 = i29;
                        strM10901 = strM10901;
                        sb3 = sb3;
                        i27 = i17;
                        spannableStringBuilder2 = spannableStringBuilder;
                    }
                    break;
                case -163662539:
                case 481803217:
                    sb3 = sb3;
                    i28 = i28;
                    sb = sb2;
                    strM10901 = strM10901;
                    i29 = i29;
                    i31 = i31;
                    value = value;
                    C1148.m4223(sb, C0671.m3020(interfaceC3609.getType()));
                    ThreadFactoryC3888.m11302(sb, '/');
                    if (C2477.f9839 > 0) {
                        iM450212 = (C19806.m45029("ܶ᩹") ^ i24) * (-109);
                        i18 = ((iM450212 ^ i25) * 29897) ^ 217867636;
                        i19 = 1179497591;
                        sb2 = sb;
                        i28 = i28;
                        int i36 = i29;
                        strM10901 = strM10901;
                        sb3 = sb3;
                        i27 = iM450212 ^ i19;
                        i26 = i18;
                        value = value;
                        i31 = i31;
                        i29 = i36;
                    } else {
                        sb2 = sb;
                        iM11309 = C19806.m45029("ۘۘ") ^ i25;
                        i12 = ((iM11309 ^ i24) * (-27895)) ^ (-675863124);
                        i13 = 1827846216;
                        i17 = iM11309 ^ i13;
                        i26 = i12;
                        value = value;
                        i28 = i28;
                        i31 = i31;
                        i29 = i29;
                        strM10901 = strM10901;
                        sb3 = sb3;
                        i27 = i17;
                        spannableStringBuilder2 = spannableStringBuilder;
                    }
                    break;
                case 5732709:
                case 689820662:
                    sb3 = sb3;
                    i28 = i28;
                    strM10901 = strM10901;
                    i29 = i29;
                    i31 = i31;
                    value = value;
                    C2788.m8480(sb2, C1977.m6363(f75433, 15, 8, i30));
                    iM450210 = ThreadFactoryC3888.m11306("ܿᩴ") ^ i25;
                    i3 = ((iM450210 ^ i24) * 139) ^ 1317309232;
                    i4 = -2038893551;
                    i8 = iM450210 ^ i4;
                    value = value;
                    i31 = i31;
                    i29 = i29;
                    strM10901 = strM10901;
                    sb3 = sb3;
                    i27 = i8;
                    i26 = i3;
                    i28 = i28;
                    break;
                case 178917864:
                case 1247034745:
                    sb3 = sb3;
                    i28 = i28;
                    strM10901 = strM10901;
                    i29 = i29;
                    i31 = i31;
                    value = value;
                    StringBuilder sb18 = new StringBuilder(strM10901);
                    ThreadFactoryC3888.m11302(sb18, c);
                    if (interfaceC3609.mo10692().mo19106() != i31) {
                        sb2 = sb18;
                        iM450210 = ThreadFactoryC3888.m11306("ܿᩴ") ^ i25;
                        i3 = ((iM450210 ^ i24) * 139) ^ 1317309232;
                        i4 = -2038893551;
                        i8 = iM450210 ^ i4;
                        value = value;
                        i31 = i31;
                        i29 = i29;
                        strM10901 = strM10901;
                        sb3 = sb3;
                        i27 = i8;
                        i26 = i3;
                        i28 = i28;
                    } else {
                        int iM113012 = (i24 - ThreadFactoryC3888.m11306("֫֫")) * (-23);
                        int i37 = ((iM113012 ^ i25) * 7857) ^ (-1404063062);
                        i5 = iM113012 ^ 1945929565;
                        sb2 = sb18;
                        i26 = i37;
                        value = value;
                        i31 = i31;
                        i29 = i29;
                        strM10901 = strM10901;
                        sb3 = sb3;
                        i27 = i5;
                        i28 = i28;
                    }
                    break;
                case 408268507:
                case 781975326:
                    C1461.m5080();
                    if (C1148.f5161 <= 0) {
                        iM45029 = (C19806.m45029("ᩳ᩷") + i25) * (-41);
                        i = ((iM45029 ^ i24) * (-29379)) ^ (-1753941572);
                        i2 = -1367021179;
                        i27 = iM45029 ^ i2;
                        i26 = i;
                    } else {
                        sb3 = sb3;
                        i28 = i28;
                        strM10901 = strM10901;
                        i29 = i29;
                        i31 = i31;
                        value = value;
                        iM450210 = (i25 - ThreadFactoryC3888.m11306("ۡ֫")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM450210 ^ i24) * (-5913)) ^ (-1418992532);
                        i4 = -562705069;
                        i8 = iM450210 ^ i4;
                        value = value;
                        i31 = i31;
                        i29 = i29;
                        strM10901 = strM10901;
                        sb3 = sb3;
                        i27 = i8;
                        i26 = i3;
                        i28 = i28;
                    }
                    break;
                case 481614201:
                case 1540538084:
                    if (C1419.m4973()) {
                        iM45029 = (C19806.m45029("ܿۨ") ^ i24) * 63;
                        i = ((iM45029 ^ i25) * 8803) ^ 2145838981;
                        i2 = 1838021436;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۡ") ^ i24;
                        i = ((iM45029 ^ i25) * (-26063)) ^ 722742770;
                        i2 = -351601928;
                    }
                    i27 = iM45029 ^ i2;
                    i26 = i;
                    break;
                case 614840937:
                case 801995507:
                    if (C1460.f5948 < 0) {
                        sb3 = sb3;
                        i28 = i28;
                        strM10901 = strM10901;
                        i29 = i29;
                        i31 = i31;
                        value = value;
                        iM11309 = C19806.m45029("ۘۘ") ^ i25;
                        i12 = ((iM11309 ^ i24) * (-27895)) ^ (-675863124);
                        i13 = 1827846216;
                        i17 = iM11309 ^ i13;
                        i26 = i12;
                        value = value;
                        i28 = i28;
                        i31 = i31;
                        i29 = i29;
                        strM10901 = strM10901;
                        sb3 = sb3;
                        i27 = i17;
                        spannableStringBuilder2 = spannableStringBuilder;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۡ") ^ i24;
                        i = ((iM45029 ^ i25) * (-26063)) ^ 722742770;
                        i2 = -351601928;
                        i27 = iM45029 ^ i2;
                        i26 = i;
                    }
                    break;
                case 993606593:
                case 2138337220:
                    sb3 = sb3;
                    i28 = i28;
                    i29 = i29;
                    i31 = i31;
                    value = value;
                    strM10901 = C3722.m10901(f75433, 5, 1, i30);
                    if (z) {
                        iM450210 = ThreadFactoryC3888.m11306("᩶᩻") ^ i24;
                        i3 = ((iM450210 ^ i25) * (-23537)) ^ 568858867;
                        i4 = 753251303;
                    } else {
                        iM450210 = C19806.m45029("ۨ᩸") ^ i25;
                        i3 = ((iM450210 ^ i24) * 22131) ^ 1290417909;
                        i4 = 1427748716;
                    }
                    i8 = iM450210 ^ i4;
                    value = value;
                    i31 = i31;
                    i29 = i29;
                    strM10901 = strM10901;
                    sb3 = sb3;
                    i27 = i8;
                    i26 = i3;
                    i28 = i28;
                    break;
                case 1007689884:
                case 1711491893:
                    sb3 = sb3;
                    i28 = i28;
                    strM10901 = strM10901;
                    if (!RunnableC1564.m5348(itM5072)) {
                        i29 = i29;
                        i31 = i31;
                        iM11307 = ThreadFactoryC3888.m11306("ܿ᩷") ^ i25;
                        i3 = ((iM11307 ^ i24) * 16159) ^ (-126008339);
                        i7 = 208472826;
                        i8 = iM11307 ^ i7;
                        i31 = i31;
                        i29 = i29;
                        strM10901 = strM10901;
                        sb3 = sb3;
                        i27 = i8;
                        i26 = i3;
                        i28 = i28;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("᩺᩸") ^ i24;
                        i9 = ((iM11308 ^ i25) * (-3975)) ^ 999479370;
                        i10 = 588707628;
                        i5 = iM11308 ^ i10;
                        strM10901 = strM10901;
                        i26 = i9;
                        sb3 = sb3;
                        i27 = i5;
                        i28 = i28;
                    }
                    break;
                case 1231005580:
                case 1752750547:
                    C1419.m4973();
                    if (C1977.m6356()) {
                        iM45029 = C19806.m45029("ۨۗ") ^ i25;
                        i = ((iM45029 ^ i24) * (-10943)) ^ (-1214444681);
                        i2 = 1126413271;
                    } else {
                        iM45029 = (C19806.m45029("۫᩹") ^ i24) * 77;
                        i = ((iM45029 ^ i25) * (-9983)) ^ (-245126181);
                        i2 = -1592727704;
                    }
                    i27 = iM45029 ^ i2;
                    i26 = i;
                    break;
                default:
                    sb3 = sb3;
                    i28 = i28;
                    itM5072 = C1461.m5072(arrayList);
                    iM11308 = ThreadFactoryC3888.m11306("֡ۧ") ^ i24;
                    i9 = ((iM11308 ^ i25) * 16477) ^ 877437786;
                    i10 = -741915870;
                    i5 = iM11308 ^ i10;
                    strM10901 = strM10901;
                    i26 = i9;
                    sb3 = sb3;
                    i27 = i5;
                    i28 = i28;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m51316(SpannableStringBuilder spannableStringBuilder, String str) {
        int iM9702 = 0;
        UnderlineSpan underlineSpan = null;
        int iM5086 = 0;
        int i = 0;
        int i2 = -2044111654;
        int i3 = C1148.f5161;
        int i4 = C2788.f10625;
        int iM45029 = C19806.m45029("ۤۢ") ^ i4;
        int i5 = ((iM45029 ^ i3) * (-20453)) ^ 310872568;
        int i6 = 1876097942;
        while (true) {
            i2 = ((((i2 ^ i3) * 27389) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -1844307703:
                case -1049889377:
                    if (C2124.f7782 > 0) {
                        iM45029 = C19806.m45029("۫ܺ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 19379) ^ 1994285207;
                        i6 = 1647581184;
                    } else {
                        iM45029 = C19806.m45029("᩶᩷") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-30049)) ^ (-1528524458);
                        i6 = -1189127824;
                    }
                    break;
                case -1549709038:
                case -14078423:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = (C19806.m45029("۫ܿ") + i3) * 69;
                        i5 = ((iM45029 ^ i4) * (-4071)) ^ (-1189562561);
                        i6 = -108656178;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙۛ") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM45029 ^ i3) * (-28501)) ^ 1408005956;
                        i6 = 463983604;
                    }
                    break;
                case -1210437767:
                case -1131832940:
                    C0797.m3359();
                    if (C3660.f13403 >= 0) {
                        iM45029 = C19806.m45029("᩶᩷") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-30049)) ^ (-1528524458);
                        i6 = -1189127824;
                    } else {
                        iM45029 = (C19806.m45029("ۛ֨") + i3) * 87;
                        i5 = ((iM45029 ^ i4) * 26627) ^ (-1057762923);
                        i6 = 786655492;
                    }
                    break;
                case -1170420418:
                case 1860887955:
                    if (C0671.f2816 != 0) {
                        iM45029 = (C19806.m45029("۫ܿ") + i3) * 69;
                        i5 = ((iM45029 ^ i4) * (-4071)) ^ (-1189562561);
                        i6 = -108656178;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩵ۖ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 2569) ^ (-230378869);
                        i6 = -602851340;
                    }
                    break;
                case -1167459735:
                case -884196649:
                    i = 33;
                    ThreadFactoryC3888.m11309(spannableStringBuilder, underlineSpan, iM9702, iM5086, 33);
                    if (C0817.f3443) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤܶ") ^ i3) * 11;
                        i5 = ((iM45029 ^ i4) * 6737) ^ 998841467;
                        i6 = 778762187;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩶ܿ")) * (-75);
                        i5 = ((iM45029 ^ i4) * 23971) ^ 1723896951;
                        i6 = 728165227;
                    }
                    break;
                case -1140652771:
                case 99713162:
                    if (C0962.m3746() < 0) {
                        iM45029 = (C19806.m45029("۫ܿ") + i3) * 69;
                        i5 = ((iM45029 ^ i4) * (-4071)) ^ (-1189562561);
                        i6 = -108656178;
                    } else {
                        iM45029 = (C19806.m45029("ۛ֨") + i3) * 87;
                        i5 = ((iM45029 ^ i4) * 26627) ^ (-1057762923);
                        i6 = 786655492;
                    }
                    break;
                case -1042354143:
                case 1827863911:
                    C3535.m10431();
                    C2788.m8472();
                    iM45029 = (C19806.m45029("ۛ֨") + i3) * 87;
                    i5 = ((iM45029 ^ i4) * 26627) ^ (-1057762923);
                    i6 = 786655492;
                    break;
                case -626751077:
                case 2146188088:
                    C1025.m3865(spannableStringBuilder, str);
                    if (C0817.f3443) {
                        iM45029 = C19806.m45029("᩺ۢ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 25623) ^ (-950192336);
                        i6 = 1017756015;
                    } else {
                        iM45029 = (C19806.m45029("ۛ֨") + i3) * 87;
                        i5 = ((iM45029 ^ i4) * 26627) ^ (-1057762923);
                        i6 = 786655492;
                    }
                    break;
                case -433580010:
                case 1390181004:
                    if (C1025.f4800 < 0 && ThreadFactoryC3888.f14547 > 0) {
                        ThreadFactoryC3888.m11309(spannableStringBuilder, new RelativeSizeSpan(0.8f), iM9702, MenuItemOnMenuItemClickListenerC3244.m9702(spannableStringBuilder), i);
                    }
                    iM45029 = (C19806.m45029("ۛ֨") + i3) * 87;
                    i5 = ((iM45029 ^ i4) * 26627) ^ (-1057762923);
                    i6 = 786655492;
                    break;
                case -413748311:
                case -93334497:
                    iM5086 = C1461.m5086(spannableStringBuilder);
                    if (C2642.f10294 <= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩶ܿ")) * (-75);
                        i5 = ((iM45029 ^ i4) * 23971) ^ 1723896951;
                        i6 = 728165227;
                    } else {
                        iM45029 = C19806.m45029("ۛ۟") ^ i4;
                        i5 = ((iM45029 ^ i3) * 4663) ^ 1519747325;
                        i6 = 1871170523;
                    }
                    break;
                case -401634797:
                case 1222404040:
                    C1377.m4833();
                    break;
                case -381392879:
                case 326318750:
                    underlineSpan = new UnderlineSpan();
                    if (AbstractC0464.m2313() != 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("᩶ܿ")) * (-75);
                        i5 = ((iM45029 ^ i4) * 23971) ^ 1723896951;
                        i6 = 728165227;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸֨") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-29829)) ^ (-1178260019);
                        i6 = -1729702786;
                    }
                    break;
                case 159721368:
                case 1394933675:
                    iM9702 = MenuItemOnMenuItemClickListenerC3244.m9702(spannableStringBuilder);
                    if (C3286.f12186) {
                        iM45029 = C19806.m45029("۫ܺ") ^ i4;
                        i5 = ((iM45029 ^ i3) * 19379) ^ 1994285207;
                        i6 = 1647581184;
                    } else {
                        iM45029 = (C19806.m45029("᩻᩺") ^ i4) * (-123);
                        i5 = ((iM45029 ^ i3) * 6007) ^ 1261615941;
                        i6 = 1228753941;
                    }
                    break;
                default:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = (C19806.m45029("ۛ֨") + i3) * 87;
                        i5 = ((iM45029 ^ i4) * 26627) ^ (-1057762923);
                        i6 = 786655492;
                    } else {
                        iM45029 = C19806.m45029("᩹۬") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-11269)) ^ 828027109;
                        i6 = 747936223;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0125 A[PHI: r3
      0x0125: PHI (r3v4 int) = (r3v2 int), (r3v3 int), (r3v2 int), (r3v2 int) binds: [B:48:0x0123, B:31:0x0096, B:23:0x0075, B:10:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0151 A[PHI: r2
      0x0151: PHI (r2v3 int) = (r2v2 int), (r2v4 int) binds: [B:52:0x014f, B:35:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x017d  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m51320(SpannableStringBuilder spannableStringBuilder, String str) {
        int iM11306;
        int i;
        int iM5086 = 0;
        int iM9702 = 0;
        int i2 = 0;
        int i3 = -2096136803;
        int i4 = C1066.f4915;
        int i5 = C1461.f5957;
        int iM11307 = ThreadFactoryC3888.m11306("ۙ֨") ^ i5;
        int i6 = ((iM11307 ^ i4) * (-15135)) ^ 273530825;
        int i7 = -1832173865;
        while (true) {
            int i8 = iM11307 ^ i7;
            StyleSpan styleSpan = null;
            while (true) {
                i3 = ((((i3 ^ i4) * 21923) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -1967507536:
                    case -894510437:
                        if (RunnableC1606.f6488 >= 0) {
                            iM11306 = C19806.m45029("ᩴ۫") ^ i5;
                            i6 = ((iM11306 ^ i4) * (-10847)) ^ 1121428093;
                            i = -530987693;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ۖ۟") ^ i5;
                            i6 = ((iM11306 ^ i4) * 31541) ^ 889283427;
                            i = -1900937967;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case -1892026856:
                    case -980299863:
                        C1025.m3865(spannableStringBuilder, str);
                        if (C3722.f13525 > 0) {
                            styleSpan = new StyleSpan(2);
                            if (C3286.m9798() > 0) {
                                iM11306 = ThreadFactoryC3888.m11306("ۖ᩷") ^ i5;
                                i6 = ((iM11306 ^ i4) * (-19805)) ^ 2044506556;
                                i = 1193976798;
                                i8 = iM11306 ^ i;
                            }
                        }
                        break;
                    case -1845890524:
                    case 525299740:
                        iM9702 = MenuItemOnMenuItemClickListenerC3244.m9702(spannableStringBuilder);
                        if (C2124.f7782 <= 0) {
                            iM11306 = (C19806.m45029("ܳܿ") ^ i4) * (-101);
                            i6 = ((iM11306 ^ i5) * (-21473)) ^ 1867718816;
                            i = -1547749527;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ۘ᩻") + i4) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i6 = ((iM11306 ^ i5) * 2937) ^ (-1238460604);
                            i = -438871701;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case -1748571188:
                    case -690742661:
                        if (RunnableC1564.m5345()) {
                            iM11306 = (C19806.m45029("ܳܿ") ^ i4) * (-101);
                            i6 = ((iM11306 ^ i5) * (-21473)) ^ 1867718816;
                            i = -1547749527;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("ᩴ֡") ^ i4;
                            i6 = ((iM11306 ^ i5) * (-12483)) ^ 666607434;
                            i = -1874140880;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case -1425661782:
                    case -1321628257:
                        C2642.m8171();
                        AbstractC0464.m2313();
                        break;
                    case -1203781113:
                    case -1164233728:
                        C1066.m4023();
                        RunnableC3388.m10064();
                        iM11306 = (C19806.m45029("֨ᩳ") + i4) * 55;
                        i6 = ((iM11306 ^ i5) * (-6469)) ^ (-1312980799);
                        i = 1788988576;
                        i8 = iM11306 ^ i;
                        break;
                    case -1198216084:
                    case -114674124:
                        i2 = 33;
                        ThreadFactoryC3888.m11309(spannableStringBuilder, styleSpan, iM5086, iM9702, 33);
                        if (C1189.f5284 <= 0) {
                            iM11306 = C19806.m45029("ۙ᩺") ^ i5;
                            i6 = ((iM11306 ^ i4) * 10263) ^ 146814768;
                            i = -1970331805;
                        } else {
                            iM11306 = (ThreadFactoryC3888.m11306("ܶ۠") ^ i5) * (-65);
                            i6 = ((iM11306 ^ i4) * (-30047)) ^ (-1982501256);
                            i = -1948081045;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case -756364287:
                    case 1200466981:
                        C2704.m8255();
                        if (AbstractC0464.f2088 <= 0) {
                        }
                        iM11306 = (C19806.m45029("֨ᩳ") + i4) * 55;
                        i6 = ((iM11306 ^ i5) * (-6469)) ^ (-1312980799);
                        i = 1788988576;
                        i8 = iM11306 ^ i;
                        break;
                    case -666505009:
                    case 1268776831:
                        C1025.m3861();
                        if (C1398.f5802 <= 0) {
                            iM11306 = (C19806.m45029("֨ᩳ") + i4) * 55;
                            i6 = ((iM11306 ^ i5) * (-6469)) ^ (-1312980799);
                            i = 1788988576;
                        } else {
                            iM11306 = C19806.m45029("ᩴ۫") ^ i5;
                            i6 = ((iM11306 ^ i4) * (-10847)) ^ 1121428093;
                            i = -530987693;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case -168431117:
                    case 671285593:
                        if (C2249.f8050 >= 0) {
                            iM11306 = C19806.m45029("ۙ᩺") ^ i5;
                            i6 = ((iM11306 ^ i4) * 10263) ^ 146814768;
                            i = -1970331805;
                        } else {
                            iM11306 = C19806.m45029("ۧܳ") ^ i4;
                            i6 = ((iM11306 ^ i5) * (-16439)) ^ (-842042978);
                            i = 970352901;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case 96572828:
                    case 1436748253:
                        if (C1419.f5860 >= 0) {
                            iM11306 = C19806.m45029("ۙ᩺") ^ i5;
                            i6 = ((iM11306 ^ i4) * 10263) ^ 146814768;
                            i = -1970331805;
                        } else {
                            if (!C19806.m45024()) {
                                C19806.m45018(spannableStringBuilder, new RelativeSizeSpan(0.8f), iM5086, MenuItemOnMenuItemClickListenerC3244.m9702(spannableStringBuilder), i2);
                            }
                            iM11306 = C19806.m45029("ᩴ۫") ^ i5;
                            i6 = ((iM11306 ^ i4) * (-10847)) ^ 1121428093;
                            i = -530987693;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    case 957261556:
                    case 2134729567:
                        C3286.m9798();
                        if (RunnableC3388.m10064()) {
                            iM11306 = C19806.m45029("ۙ᩺") ^ i5;
                            i6 = ((iM11306 ^ i4) * 10263) ^ 146814768;
                            i = -1970331805;
                        } else {
                            iM11306 = C19806.m45029("ᩴ۫") ^ i5;
                            i6 = ((iM11306 ^ i4) * (-10847)) ^ 1121428093;
                            i = -530987693;
                        }
                        i8 = iM11306 ^ i;
                        break;
                    default:
                        iM5086 = C1461.m5086(spannableStringBuilder);
                        if (!C2704.f10408) {
                        }
                        iM11306 = C19806.m45029("ᩳᩴ") ^ i5;
                        i6 = ((iM11306 ^ i4) * 14173) ^ 728096205;
                        i = -1644708757;
                        i8 = iM11306 ^ i;
                        break;
                        break;
                }
                return;
            }
            iM11307 = C19806.m45029("ۛ᩷") ^ i4;
            i6 = ((iM11307 ^ i5) * (-14463)) ^ 838346241;
            i7 = -1107740835;
        }
    }
}
