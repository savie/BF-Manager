package l;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ܶۜۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 517G */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC15057 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f49081;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f49082;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49083;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f49084;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f49085;

    public /* synthetic */ ViewOnClickListenerC15057(Object obj, View view, TextView textView, TextView textView2, int i) {
        int i2 = -1830897465;
        int i3 = C0629.f2722;
        int i4 = C1189.f5284;
        this.f49083 = i;
        this.f49085 = obj;
        this.f49081 = view;
        this.f49084 = textView;
        this.f49082 = textView2;
        int iM11306 = ThreadFactoryC3888.m11306("۟۫") ^ i3;
        int i5 = ((iM11306 ^ i4) * 30743) ^ 1460265237;
        int i6 = 433854779;
        while (true) {
            i2 = (iM11306 ^ i6) ^ (i5 & (((i2 ^ i4) * 3819) >> 31));
            switch (i2) {
                case -2136928580:
                case 4537764:
                    if (C2477.m7593() >= 0) {
                        iM11306 = C19806.m45029("ܺۛ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 16379) ^ 1339979410;
                        i6 = 7664443;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫᩷") ^ i4;
                        i5 = ((iM11306 ^ i3) * 31045) ^ (-837320695);
                        i6 = 1718618709;
                    }
                    break;
                case -1137862340:
                case 372654216:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = C19806.m45029("ܺۛ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 16379) ^ 1339979410;
                        i6 = 7664443;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܳ֡")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM11306 ^ i4) * (-26167)) ^ 437116197;
                        i6 = 1712745224;
                    }
                    break;
                case -746642098:
                case 45186744:
                    return;
                case -169849698:
                case 1506805412:
                    C0629.m2907();
                    throw new RuntimeException();
                case 179507731:
                case 779637305:
                    if (C1460.f5948 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۨ") + i3) * 123;
                        i5 = ((iM11306 ^ i4) * (-5545)) ^ 1244834094;
                        i6 = -679234249;
                    } else {
                        iM11306 = C19806.m45029("۟ۢ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 19481) ^ (-563443504);
                        i6 = 1928798058;
                    }
                    break;
                case 1289329381:
                case 1882370027:
                    ThreadFactoryC3888.m11300();
                    if (C1461.f5957 <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܳ֡")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((iM11306 ^ i4) * (-26167)) ^ 437116197;
                        i6 = 1712745224;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۤ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-13397)) ^ 1246455088;
                        i6 = 1355985344;
                    }
                    break;
                default:
                    C1460.m5050();
                    C1875.m6086();
                    iM11306 = (i3 - ThreadFactoryC3888.m11306("ܳ֡")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i5 = ((iM11306 ^ i4) * (-26167)) ^ 437116197;
                    i6 = 1712745224;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:94:0x03a3 A[PHI: r2 r7 r8 r25
      0x03a3: PHI (r2v91 l.᩷ۜۘ) = (r2v7 l.᩷ۜۘ), (r2v82 l.᩷ۜۘ), (r2v94 l.᩷ۜۘ) binds: [B:13:0x007e, B:93:0x03a1, B:69:0x027b] A[DONT_GENERATE, DONT_INLINE]
      0x03a3: PHI (r7v69 android.widget.Spinner) = (r7v12 android.widget.Spinner), (r7v64 android.widget.Spinner), (r7v71 android.widget.Spinner) binds: [B:13:0x007e, B:93:0x03a1, B:69:0x027b] A[DONT_GENERATE, DONT_INLINE]
      0x03a3: PHI (r8v4 android.widget.TextView) = (r8v2 android.widget.TextView), (r8v2 android.widget.TextView), (r8v7 android.widget.TextView) binds: [B:13:0x007e, B:93:0x03a1, B:69:0x027b] A[DONT_GENERATE, DONT_INLINE]
      0x03a3: PHI (r25v5 android.widget.EditText) = (r25v3 android.widget.EditText), (r25v3 android.widget.EditText), (r25v9 android.widget.EditText) binds: [B:13:0x007e, B:93:0x03a1, B:69:0x027b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C20701 c20701;
        int i;
        int i2;
        C20701 c20702;
        Spinner spinner;
        int iM11306;
        int i3;
        int iM45029;
        int i4;
        Spinner spinner2;
        ViewOnClickListenerC15057 viewOnClickListenerC15057 = this;
        View view2 = view;
        int i5 = C0050.f912;
        int i6 = C0278.f1572;
        int iM450210 = (C19806.m45029("᩶ۚ") ^ i6) * 9;
        int i7 = ((iM450210 ^ i5) * 4323) ^ 1689243949;
        View view3 = null;
        Spinner spinner3 = null;
        TextView textView = null;
        EditText editText = null;
        RadioButton radioButton = null;
        int i8 = iM450210 ^ 273671377;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        C20701 c20703 = null;
        int i9 = -1823789074;
        TextView textView2 = null;
        RadioButton radioButton2 = null;
        TextView textView3 = null;
        RadioButton radioButton3 = null;
        View view4 = null;
        RadioButton radioButton4 = null;
        TextView textView4 = null;
        while (true) {
            i9 = i8 ^ (i7 & (((i9 ^ i5) * (-17655)) >> 31));
            switch (i9) {
                case -2120096557:
                case -1211039788:
                    C0629.m2915(radioButton, z3);
                    break;
                case -2018948474:
                case -805428551:
                    C1875.m6086();
                    C1460.m5050();
                    break;
                case -1928857861:
                case -1071013043:
                    radioButton4 = (RadioButton) viewOnClickListenerC15057.f49085;
                    if (C0526.m2437() < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ۬") ^ i6;
                        i = ((iM11306 ^ i5) * (-3791)) ^ 248011611;
                        i3 = 1491132988;
                        i8 = iM11306 ^ i3;
                        i7 = i;
                    } else {
                        spinner = spinner3;
                        int iM450211 = (C19806.m45029("ܳۖ") ^ i6) * (-65);
                        i7 = (-1293593850) ^ ((iM450211 ^ i5) * 25817);
                        i8 = iM450211 ^ (-1603672464);
                        viewOnClickListenerC15057 = this;
                        view2 = view;
                        spinner3 = spinner;
                    }
                    break;
                case -1813046707:
                case 642481627:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    if (C3660.f13403 < 0) {
                        iM11306 = (i6 - C19806.m45029("ۧۛ")) * 119;
                        i = ((iM11306 ^ i5) * 18061) ^ (-1879572368);
                        i3 = -620940233;
                        i8 = iM11306 ^ i3;
                        i7 = i;
                    } else {
                        c20701 = c20703;
                        spinner2 = spinner3;
                        int iM450212 = C19806.m45029("۠ܿ") ^ i6;
                        int i10 = ((iM450212 ^ i5) * (-29)) ^ (-2143710962);
                        i8 = iM450212 ^ (-762708607);
                        view2 = view;
                        spinner3 = spinner2;
                        c20703 = c20701;
                        i7 = i10;
                    }
                    break;
                case -1752073283:
                case 1268881468:
                    z4 = false;
                    iM11306 = (ThreadFactoryC3888.m11306("ܺۛ") + i5) * 77;
                    i = ((iM11306 ^ i6) * (-26293)) ^ (-163622130);
                    i3 = 831476659;
                    i8 = iM11306 ^ i3;
                    i7 = i;
                    break;
                case -1622094856:
                case 2074640958:
                    z4 = true;
                    iM11306 = (ThreadFactoryC3888.m11306("ܺۛ") + i5) * 77;
                    i = ((iM11306 ^ i6) * (-26293)) ^ (-163622130);
                    i3 = 831476659;
                    i8 = iM11306 ^ i3;
                    i7 = i;
                    break;
                case -1532205646:
                case 2036315139:
                    c20702 = c20703;
                    spinner = spinner3;
                    if (C7105.f23796 >= 0) {
                        iM45029 = (C19806.m45029("ᩳᩳ") + i5) * 15;
                        i2 = ((iM45029 ^ i6) * (-28401)) ^ 1881832832;
                        i4 = -446725728;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ۧ") ^ i5) * 59;
                        i2 = ((iM45029 ^ i6) * (-20031)) ^ (-1237026184);
                        i4 = -1074166783;
                    }
                    i8 = iM45029 ^ i4;
                    viewOnClickListenerC15057 = this;
                    c20703 = c20702;
                    spinner3 = spinner;
                    i7 = i2;
                    view2 = view;
                    break;
                case -1333466180:
                case -730814903:
                    c20701 = c20703;
                    spinner3 = (Spinner) view3;
                    TextView textView5 = viewOnClickListenerC15057.f49084;
                    if (!C0797.f3386) {
                        textView = textView5;
                        int iM11307 = ThreadFactoryC3888.m11306("᩻ۘ") ^ i5;
                        i = ((iM11307 ^ i6) * 16269) ^ (-1580907325);
                        i8 = iM11307 ^ 585597671;
                        view2 = view;
                        c20703 = c20701;
                        i7 = i;
                    } else {
                        int iM450213 = (C19806.m45029("֫֡") + i5) * (-29);
                        textView = textView5;
                        i2 = ((iM450213 ^ i6) * (-16145)) ^ 1669954674;
                        i8 = iM450213 ^ 966164075;
                        c20703 = c20701;
                        i7 = i2;
                        view2 = view;
                    }
                    break;
                case -823688360:
                case -660936377:
                    C0629.m2915(radioButton3, z4);
                    if (radioButton2 == view2) {
                        iM11306 = (i5 - C19806.m45029("᩻֨")) * (-3);
                        i = ((iM11306 ^ i6) * 14795) ^ (-974097166);
                        i3 = 2061123740;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ۡ") + i6) * 13;
                        i = ((iM11306 ^ i5) * 14645) ^ 2058269378;
                        i3 = 1665515291;
                    }
                    i8 = iM11306 ^ i3;
                    i7 = i;
                    break;
                case -740103347:
                case 619128812:
                    C1460.m5050();
                    if (C0216.f1393 == 0) {
                        c20702 = c20703;
                        spinner = spinner3;
                        iM45029 = (C19806.m45029("ᩳᩳ") + i5) * 15;
                        i2 = ((iM45029 ^ i6) * (-28401)) ^ 1881832832;
                        i4 = -446725728;
                        i8 = iM45029 ^ i4;
                        viewOnClickListenerC15057 = this;
                        c20703 = c20702;
                        spinner3 = spinner;
                        i7 = i2;
                        view2 = view;
                    } else {
                        iM11306 = (i6 - C19806.m45029("ۧۛ")) * 119;
                        i = ((iM11306 ^ i5) * 18061) ^ (-1879572368);
                        i3 = -620940233;
                        i8 = iM11306 ^ i3;
                        i7 = i;
                    }
                    break;
                case -708790497:
                case 1859002553:
                    c20702 = c20703;
                    spinner = spinner3;
                    editText = (EditText) textView;
                    textView4 = viewOnClickListenerC15057.f49082;
                    if (RunnableC1895.f7152) {
                        int iM450214 = (C19806.m45029("ܶۗ") + i6) * (-105);
                        i2 = ((iM450214 ^ i5) * 1027) ^ (-1325029368);
                        i8 = iM450214 ^ (-1658640432);
                    } else {
                        iM45029 = (C19806.m45029("ᩳᩳ") + i5) * 15;
                        i2 = ((iM45029 ^ i6) * (-28401)) ^ 1881832832;
                        i4 = -446725728;
                        i8 = iM45029 ^ i4;
                        viewOnClickListenerC15057 = this;
                    }
                    c20703 = c20702;
                    spinner3 = spinner;
                    i7 = i2;
                    view2 = view;
                    break;
                case -665135682:
                case 855678004:
                    z2 = false;
                    iM11306 = (ThreadFactoryC3888.m11306("۫ܺ") + i5) * 47;
                    i = ((iM11306 ^ i6) * 21603) ^ (-2045175272);
                    i3 = -137086021;
                    i8 = iM11306 ^ i3;
                    i7 = i;
                    break;
                case -621086914:
                case 1075608387:
                    radioButton3 = (RadioButton) view4;
                    textView3 = viewOnClickListenerC15057.f49084;
                    if (C2124.f7782 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۙ֡") ^ i6;
                        i = ((iM11306 ^ i5) * (-15427)) ^ 1907725963;
                        i3 = 1388285793;
                        i8 = iM11306 ^ i3;
                        i7 = i;
                    } else {
                        c20701 = c20703;
                        spinner2 = spinner3;
                        int iM450215 = C19806.m45029("۠ܿ") ^ i6;
                        int i11 = ((iM450215 ^ i5) * (-29)) ^ (-2143710962);
                        i8 = iM450215 ^ (-762708607);
                        view2 = view;
                        spinner3 = spinner2;
                        c20703 = c20701;
                        i7 = i11;
                    }
                    break;
                case -618967995:
                case 1336548961:
                    spinner = spinner3;
                    c20703 = (C20701) viewOnClickListenerC15057.f49085;
                    if (C2642.f10294 <= 0) {
                        int iM450216 = (C19806.m45029("ܳۖ") ^ i6) * (-65);
                        i7 = (-1293593850) ^ ((iM450216 ^ i5) * 25817);
                        i8 = iM450216 ^ (-1603672464);
                        viewOnClickListenerC15057 = this;
                    } else {
                        int iM450217 = (C19806.m45029("۟ۧ") + i6) * 17;
                        i7 = ((iM450217 ^ i5) * 29163) ^ (-1138272768);
                        i8 = iM450217 ^ 352280399;
                    }
                    view2 = view;
                    spinner3 = spinner;
                    break;
                case -616297890:
                case 845279813:
                    c20702 = c20703;
                    spinner = spinner3;
                    switch (viewOnClickListenerC15057.f49083) {
                        case 0:
                            int iM450218 = (C19806.m45029("ۘۢ") ^ i5) * 39;
                            int i12 = ((iM450218 ^ i6) * 27703) ^ (-1625509620);
                            i8 = iM450218 ^ 1097563450;
                            view2 = view;
                            c20703 = c20702;
                            spinner3 = spinner;
                            i7 = i12;
                            viewOnClickListenerC15057 = this;
                            continue;
                        default:
                            iM45029 = C19806.m45029("֡ܰ") ^ i5;
                            i2 = ((iM45029 ^ i6) * 18829) ^ 803760153;
                            i4 = -1945923839;
                            break;
                    }
                    i8 = iM45029 ^ i4;
                    viewOnClickListenerC15057 = this;
                    c20703 = c20702;
                    spinner3 = spinner;
                    i7 = i2;
                    view2 = view;
                    break;
                case -536179856:
                case 444025220:
                    c20701 = c20703;
                    spinner2 = spinner3;
                    View view5 = viewOnClickListenerC15057.f49081;
                    if (C2642.f10294 > 0) {
                        int iM450219 = C19806.m45029("ܶ۬") ^ i6;
                        i2 = ((iM450219 ^ i5) * (-30115)) ^ 329947679;
                        i8 = iM450219 ^ (-922270888);
                        spinner3 = spinner2;
                        view3 = view5;
                        c20703 = c20701;
                        i7 = i2;
                        view2 = view;
                    } else {
                        view3 = view5;
                        int iM4502110 = C19806.m45029("۠ܿ") ^ i6;
                        int i13 = ((iM4502110 ^ i5) * (-29)) ^ (-2143710962);
                        i8 = iM4502110 ^ (-762708607);
                        view2 = view;
                        spinner3 = spinner2;
                        c20703 = c20701;
                        i7 = i13;
                    }
                    break;
                case -424162855:
                case 1338529262:
                    radioButton2 = (RadioButton) textView3;
                    textView2 = viewOnClickListenerC15057.f49082;
                    if (C2871.f10837 < 0) {
                        iM11306 = (C19806.m45029("ۨ᩶") ^ i5) * 47;
                        i = ((iM11306 ^ i6) * 25425) ^ (-1901679618);
                        i3 = -1544569654;
                        i8 = iM11306 ^ i3;
                        i7 = i;
                    } else {
                        c20701 = c20703;
                        spinner2 = spinner3;
                        int iM4502111 = C19806.m45029("۠ܿ") ^ i6;
                        int i14 = ((iM4502111 ^ i5) * (-29)) ^ (-2143710962);
                        i8 = iM4502111 ^ (-762708607);
                        view2 = view;
                        spinner3 = spinner2;
                        c20703 = c20701;
                        i7 = i14;
                    }
                    break;
                case -399370813:
                case 1632870754:
                    z = true;
                    iM11306 = (i5 - ThreadFactoryC3888.m11306("᩻᩺")) * (-37);
                    i = ((iM11306 ^ i6) * 5771) ^ (-789730208);
                    i3 = -293722105;
                    i8 = iM11306 ^ i3;
                    i7 = i;
                    break;
                case 204392565:
                case 837572406:
                    ViewGroupOnHierarchyChangeListenerC1916.m6230(radioButton4, z2);
                    if (radioButton3 == view2) {
                        iM11306 = C19806.m45029("ۛܳ") ^ i6;
                        i = ((iM11306 ^ i5) * 533) ^ (-2083481558);
                        i3 = -2111368409;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢ֨") + i6) * 49;
                        i = ((iM11306 ^ i5) * (-18949)) ^ 591935563;
                        i3 = 878766432;
                    }
                    i8 = iM11306 ^ i3;
                    i7 = i;
                    break;
                case 238398319:
                case 1885876657:
                    z3 = true;
                    iM11306 = (C19806.m45029("᩸֫") + i6) * (-83);
                    i = ((iM11306 ^ i5) * (-5631)) ^ 29029366;
                    i3 = -963708730;
                    i8 = iM11306 ^ i3;
                    i7 = i;
                    break;
                case 271323883:
                case 1223266034:
                    ViewGroupOnHierarchyChangeListenerC1916.m6230(radioButton2, z);
                    if (radioButton == view2) {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ۡ") ^ i5;
                        i = ((iM11306 ^ i6) * (-27031)) ^ 1331120844;
                        i3 = 1109133642;
                    } else {
                        z3 = z5;
                        iM11306 = (C19806.m45029("᩸֫") + i6) * (-83);
                        i = ((iM11306 ^ i5) * (-5631)) ^ 29029366;
                        i3 = -963708730;
                    }
                    i8 = iM11306 ^ i3;
                    i7 = i;
                    break;
                case 425336458:
                case 545596303:
                    c20702 = c20703;
                    spinner = spinner3;
                    if (!C0797.m3359()) {
                        c20703 = c20702;
                        int iM4502112 = (C19806.m45029("ܳۖ") ^ i6) * (-65);
                        i7 = (-1293593850) ^ ((iM4502112 ^ i5) * 25817);
                        i8 = iM4502112 ^ (-1603672464);
                        viewOnClickListenerC15057 = this;
                        view2 = view;
                        spinner3 = spinner;
                    } else {
                        iM45029 = (i6 - C19806.m45029("֫ܳ")) * 87;
                        i2 = ((iM45029 ^ i5) * (-12537)) ^ (-1862863817);
                        i4 = -1482712421;
                        i8 = iM45029 ^ i4;
                        viewOnClickListenerC15057 = this;
                        c20703 = c20702;
                        spinner3 = spinner;
                        i7 = i2;
                        view2 = view;
                    }
                    break;
                case 475256450:
                case 1272289026:
                    z = false;
                    iM11306 = (i5 - ThreadFactoryC3888.m11306("᩻᩺")) * (-37);
                    i = ((iM11306 ^ i6) * 5771) ^ (-789730208);
                    i3 = -293722105;
                    i8 = iM11306 ^ i3;
                    i7 = i;
                    break;
                case 636577905:
                case 1962031912:
                    C20701.m46552(c20703, spinner3, editText, (EditText) textView4);
                    break;
                case 1093436358:
                case 1720613088:
                    RunnableC1895.m6170();
                    if (C1875.f7103 < 0) {
                        spinner = spinner3;
                        int iM4502113 = (C19806.m45029("ܳۖ") ^ i6) * (-65);
                        i7 = (-1293593850) ^ ((iM4502113 ^ i5) * 25817);
                        i8 = iM4502113 ^ (-1603672464);
                        viewOnClickListenerC15057 = this;
                        view2 = view;
                        spinner3 = spinner;
                    } else {
                        c20701 = c20703;
                        spinner2 = spinner3;
                        int iM4502114 = C19806.m45029("۠ܿ") ^ i6;
                        int i15 = ((iM4502114 ^ i5) * (-29)) ^ (-2143710962);
                        i8 = iM4502114 ^ (-762708607);
                        view2 = view;
                        spinner3 = spinner2;
                        c20703 = c20701;
                        i7 = i15;
                    }
                    break;
                case 1167539295:
                case 1358252164:
                    view4 = viewOnClickListenerC15057.f49081;
                    if (!C0962.f3784) {
                        iM11306 = (C19806.m45029("۠ܺ") ^ i5) * 91;
                        i = ((iM11306 ^ i6) * (-897)) ^ (-106694111);
                        i3 = -906215427;
                        i8 = iM11306 ^ i3;
                        i7 = i;
                    } else {
                        spinner = spinner3;
                        int iM4502115 = (C19806.m45029("ܳۖ") ^ i6) * (-65);
                        i7 = (-1293593850) ^ ((iM4502115 ^ i5) * 25817);
                        i8 = iM4502115 ^ (-1603672464);
                        viewOnClickListenerC15057 = this;
                        view2 = view;
                        spinner3 = spinner;
                    }
                    break;
                case 1223225235:
                case 1478944713:
                    radioButton = (RadioButton) textView2;
                    z5 = false;
                    if (radioButton4 == view2) {
                        iM11306 = C19806.m45029("᩶֫") ^ i6;
                        i = ((iM11306 ^ i5) * (-28479)) ^ (-1208913624);
                        i3 = 1174979679;
                    } else {
                        iM11306 = C19806.m45029("ۧܰ") ^ i5;
                        i = ((iM11306 ^ i6) * 22841) ^ 1625969423;
                        i3 = -1804562060;
                    }
                    i8 = iM11306 ^ i3;
                    i7 = i;
                    break;
                case 1319397676:
                case 1796659810:
                    C1398.m4895();
                    C1066.m4023();
                    c20701 = c20703;
                    spinner2 = spinner3;
                    int iM4502116 = C19806.m45029("۠ܿ") ^ i6;
                    int i16 = ((iM4502116 ^ i5) * (-29)) ^ (-2143710962);
                    i8 = iM4502116 ^ (-762708607);
                    view2 = view;
                    spinner3 = spinner2;
                    c20703 = c20701;
                    i7 = i16;
                    break;
                default:
                    z2 = true;
                    iM11306 = (ThreadFactoryC3888.m11306("۫ܺ") + i5) * 47;
                    i = ((iM11306 ^ i6) * 21603) ^ (-2045175272);
                    i3 = -137086021;
                    i8 = iM11306 ^ i3;
                    i7 = i;
                    break;
            }
            return;
        }
    }
}
