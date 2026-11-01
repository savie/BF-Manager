package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.ref.WeakReference;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: l.᩵᩵᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 44LP */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC19680 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f63178 = 0;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static WeakReference f63181;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final View f63182;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final TextInputLayout f63183;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f63184;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f63185;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final TextInputLayout f63186;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19356 f63187;

    /* JADX INFO: renamed from: ۧܿ۬, reason: not valid java name and contains not printable characters */
    private static final short[] f63180 = {7, -14072, -14070, -14051, -14080, -14049, -14080, -14051, -14064, 8564, 481, 483, 500, 489, 502, 489, 500, 505, 25932, 25325, 20400, -29166, -32149, 30115, 486, 489, 494, 484, 470, 489, 485, 503, 450, 505, 457, 484, 424, 430, 430, 430, 425, 21115, 23335, 25008, -28339, 25227, 30978, -27027, -24708, 22643, -32262, 23178, 26650, 22640, 22933, -27065, -24697, 28301, 20450, -25728, -30479, 25890, 3017, 27037, 27039, 27016, 27029, 27018, 27029, 27016, 27013, 27017, 27023, 27033, 27022, 27043, 27026, 27037, 27025, 27033, 9302, -4440, -4443, -4423, -4447, -4440, 3485, 22933, 22914, 22932, 22930, 22923, 22931, -8687, 14794, -12733, 3577, 12277, 12896, -14061, 1397, -11857, -13403, 13623, 3762, 22971, 22915, 22988, -11162, 10976, -11833, -14373, -12210, 3745, -12129, 9095, 14954, 11233, 10457, 8963, 8569, -9151, -12768, -10207, -15770, 14566, 4825, -27527, -27542, -27527, -27534, -27544, 4360, -13200, -13187, -13215, -13191, -13200, 3699, 24131, -11601, 10514, 801, 1038, -8456, 14581, -16063, 11839, 1922, 9538, 749, 14113, 24181, 12117, 15860, 10599, 9404, 15958, 14028, -8782, -12023, 8353, 9659, 15070, 10684, 11028, 13106, -11507};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C22959 f63179 = C22959.m50800();

    /* JADX WARN: Code duplicated, block: B:62:0x026b A[PHI: r16 r18
      0x026b: PHI (r16v4 java.lang.ref.WeakReference) = 
      (r16v3 java.lang.ref.WeakReference)
      (r16v2 java.lang.ref.WeakReference)
      (r16v2 java.lang.ref.WeakReference)
      (r16v2 java.lang.ref.WeakReference)
     binds: [B:60:0x0253, B:50:0x01e3, B:41:0x0191, B:38:0x017e] A[DONT_GENERATE, DONT_INLINE]
      0x026b: PHI (r18v5 l.᩵ۡۜ) = (r18v2 l.᩵ۡۜ), (r18v4 l.᩵ۡۜ), (r18v2 l.᩵ۡۜ), (r18v2 l.᩵ۡۜ) binds: [B:60:0x0253, B:50:0x01e3, B:41:0x0191, B:38:0x017e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x029d A[PHI: r3 r15
      0x029d: PHI (r3v90 l.᩵ۡۜ) = (r3v10 l.᩵ۡۜ), (r3v89 l.᩵ۡۜ), (r3v10 l.᩵ۡۜ), (r3v10 l.᩵ۡۜ) binds: [B:64:0x0285, B:57:0x023a, B:47:0x01c2, B:39:0x0183] A[DONT_GENERATE, DONT_INLINE]
      0x029d: PHI (r15v4 java.lang.ref.WeakReference) = 
      (r15v3 java.lang.ref.WeakReference)
      (r15v2 java.lang.ref.WeakReference)
      (r15v2 java.lang.ref.WeakReference)
      (r15v2 java.lang.ref.WeakReference)
     binds: [B:64:0x0285, B:57:0x023a, B:47:0x01c2, B:39:0x0183] A[DONT_GENERATE, DONT_INLINE]] */
    public ViewOnClickListenerC19680(AbstractActivityC12483 abstractActivityC12483, String str, String str2, DialogInterface.OnCancelListener onCancelListener) {
        EditText editText;
        int i;
        short[] sArr;
        DialogInterfaceC19356 dialogInterfaceC19356;
        int iM45029;
        int i2;
        int i3;
        int iM11306;
        int i4;
        int i5;
        short[] sArr2;
        int i6;
        String str3;
        int i7;
        int i8;
        int i9;
        short[] sArr3;
        int i10;
        int i11;
        String str4;
        int iM450210;
        int i12;
        int i13;
        DialogInterfaceC19356 dialogInterfaceC19357;
        short[] sArr4;
        int iM450211;
        int i14;
        int i15;
        int iM11307;
        int i16;
        int i17;
        final ViewOnClickListenerC19680 viewOnClickListenerC19680 = this;
        int i18 = -1352666844;
        int i19 = C2124.f7782;
        int i20 = RunnableC3388.f12514;
        short s = f63180[9];
        int i21 = (s * 27640) - ((s * s) + 190992400) <= 0 ? MLKEMEngine.KyberPolyBytes : 2441;
        C2704.m8238(abstractActivityC12483, ViewTreeObserverOnPreDrawListenerC3327.m9869(f63180, 10, 8, i21));
        int iM450212 = (C19806.m45029("ܽ֡") ^ i19) * (-119);
        TextInputLayout textInputLayout = null;
        EditText editTextM3740 = null;
        EditText editText2 = null;
        WeakReference weakReference = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        final View view = null;
        TextInputLayout textInputLayout2 = null;
        int iM11308 = 0;
        int iM11309 = 0;
        int i22 = 0;
        int iM450213 = 0;
        String str5 = null;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = ((iM450212 ^ i20) * 29595) ^ 1151600656;
        DialogInterfaceC19356 dialogInterfaceC19358 = null;
        int i29 = iM450212 ^ 1995544422;
        WeakReference weakReference2 = null;
        final DialogInterfaceC19356 dialogInterfaceC19359 = null;
        int iM450214 = 0;
        DialogInterfaceC19356 dialogInterfaceC19356M21252 = null;
        int i30 = 0;
        while (true) {
            i18 = i29 ^ (i28 & (((i18 ^ i20) * 12721) >> 31));
            switch (i18) {
                case -2146445189:
                case -339953170:
                    int i31 = DialogInterfaceC19356.f62401;
                    C8067 c8067 = new C8067(abstractActivityC12483);
                    C2871.m8638(c8067, view);
                    c8067.m21256(onCancelListener);
                    dialogInterfaceC19356M21252 = c8067.m21252();
                    viewOnClickListenerC19680.f63187 = dialogInterfaceC19356M21252;
                    if (C1461.m5073()) {
                        iM11307 = ThreadFactoryC3888.m11306("۠ۙ") ^ i20;
                        i16 = ((iM11307 ^ i19) * 4203) ^ 539185638;
                        i17 = -314884728;
                    } else {
                        iM11307 = (C19806.m45029("۠ۛ") ^ i19) * 77;
                        i16 = ((iM11307 ^ i20) * (-27967)) ^ 327439641;
                        i17 = 2023371437;
                    }
                    i29 = iM11307 ^ i17;
                    i28 = i16;
                    break;
                case -2144743990:
                case -32870155:
                    dialogInterfaceC19359 = (DialogInterfaceC19356) weakReference2.get();
                    if (dialogInterfaceC19359 != null) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙ᩷") ^ i20;
                        i28 = ((iM45029 ^ i19) * (-12959)) ^ 759986921;
                        i2 = 50941329;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗۙ") ^ i19) * (-97);
                        i28 = ((iM45029 ^ i20) * 8599) ^ 1812140943;
                        i2 = -93220798;
                    }
                    i29 = iM45029 ^ i2;
                    break;
                case -2128514147:
                case 470257483:
                    if (!f63179.m50802()) {
                        iM11307 = ThreadFactoryC3888.m11306("۠ۙ") ^ i20;
                        i16 = ((iM11307 ^ i19) * 4203) ^ 539185638;
                        i17 = -314884728;
                        i29 = iM11307 ^ i17;
                        i28 = i16;
                    } else {
                        iM45029 = C19806.m45029("ܿ᩷") ^ i20;
                        i28 = ((iM45029 ^ i19) * 14889) ^ 1949204600;
                        i2 = -1368323970;
                        i29 = iM45029 ^ i2;
                    }
                    break;
                case -1991786278:
                case 832670762:
                    C7105.m18993(C3743.m10957(view, iM450214), viewOnClickListenerC19680);
                    iM11308 = ThreadFactoryC3888.m11306(C0817.m3406(f63180, 59, 3, i21)) ^ 2102993812;
                    C1937.m6291(C2642.m8167(view, iM11308), viewOnClickListenerC19680);
                    if (C20368.m45991()) {
                        iM11307 = ThreadFactoryC3888.m11306("ܰۘ") ^ i19;
                        i16 = ((iM11307 ^ i20) * (-4731)) ^ (-928077159);
                        i17 = -1238483074;
                    } else {
                        iM11307 = C19806.m45029("ۚ֨") ^ i20;
                        i16 = ((iM11307 ^ i19) * (-25697)) ^ (-946477805);
                        i17 = 1975292511;
                    }
                    i29 = iM11307 ^ i17;
                    i28 = i16;
                    break;
                case -1971255015:
                case 272092769:
                    str3 = str5;
                    i7 = i23;
                    i8 = i25;
                    short[] sArr8 = sArr5;
                    int i32 = i26;
                    int i33 = i27;
                    sArr = sArr7;
                    dialogInterfaceC19356 = dialogInterfaceC19359;
                    int i34 = i24;
                    sArr2 = sArr6;
                    i6 = i34;
                    viewOnClickListenerC19680.f63184 = abstractActivityC12483;
                    iM11309 = ThreadFactoryC3888.m11306(C0629.m2906(f63180, 18, 3, i21)) ^ 2123086629;
                    if (!C7105.m18985()) {
                        int iM450215 = C19806.m45029("ۖ᩸") ^ i20;
                        i9 = ((iM450215 ^ i19) * (-13477)) ^ 931393551;
                        i29 = 649304006 ^ iM450215;
                        viewOnClickListenerC19680 = this;
                        i26 = i32;
                        i27 = i33;
                        sArr5 = sArr8;
                        i28 = i9;
                        dialogInterfaceC19359 = dialogInterfaceC19356;
                        sArr7 = sArr;
                        i25 = i8;
                        i23 = i7;
                        str5 = str3;
                        short[] sArr9 = sArr2;
                        i24 = i6;
                        sArr6 = sArr9;
                    } else {
                        i26 = i32;
                        i27 = i33;
                        sArr5 = sArr8;
                        int iM113010 = ThreadFactoryC3888.m11306("ܽ᩹") ^ i20;
                        i28 = ((iM113010 ^ i19) * 13445) ^ (-1268385230);
                        i29 = iM113010 ^ (-57359060);
                        viewOnClickListenerC19680 = this;
                        dialogInterfaceC19359 = dialogInterfaceC19356;
                        sArr7 = sArr;
                        i25 = i8;
                        i23 = i7;
                        str5 = str3;
                        short[] sArr10 = sArr2;
                        i24 = i6;
                        sArr6 = sArr10;
                    }
                    break;
                case -1926207303:
                case 226880108:
                    ThreadFactoryC3888.m11300();
                    if (C2788.f10625 >= 0) {
                        editText = editText2;
                        i = i25;
                        sArr = sArr7;
                        dialogInterfaceC19356 = dialogInterfaceC19359;
                        iM11306 = (ThreadFactoryC3888.m11306("ۘܿ") + i19) * 101;
                        i28 = ((iM11306 ^ i20) * (-12093)) ^ 380187077;
                        i3 = 1839194616;
                        i4 = iM11306 ^ i3;
                        editText2 = editText;
                        i29 = i4;
                        dialogInterfaceC19359 = dialogInterfaceC19356;
                        sArr7 = sArr;
                        i25 = i;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۢ") ^ i20;
                        i28 = ((iM45029 ^ i19) * (-18115)) ^ 2082037318;
                        i2 = 1748885219;
                        i29 = iM45029 ^ i2;
                    }
                    break;
                case -1807283518:
                case 1414552565:
                    weakReference = f63181;
                    if (weakReference != null) {
                        iM45029 = (C19806.m45029("᩸ܽ") + i19) * 89;
                        i28 = ((iM45029 ^ i20) * (-31597)) ^ (-1498999774);
                        i2 = 959656975;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧ۟") + i20) * (-67);
                        i28 = ((iM45029 ^ i19) * 26055) ^ (-2104387369);
                        i2 = -867101878;
                    }
                    i29 = iM45029 ^ i2;
                    break;
                case -1660333424:
                case 875746995:
                    if (RunnableC0195.m1443(dialogInterfaceC19359)) {
                        iM45029 = (i20 - C19806.m45029("᩵᩹")) * 53;
                        i28 = ((iM45029 ^ i19) * 28167) ^ 479032112;
                        i2 = 1591173245;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗۙ") ^ i19) * (-97);
                        i28 = ((iM45029 ^ i20) * 8599) ^ 1812140943;
                        i2 = -93220798;
                    }
                    i29 = iM45029 ^ i2;
                    break;
                case -1491843596:
                case -1003713102:
                    if (RunnableC0195.m1443(dialogInterfaceC19358)) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛܰ") + i20) * (-71);
                        i28 = ((iM45029 ^ i19) * 22573) ^ (-1156499351);
                        i2 = 154099414;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧ۟") + i20) * (-67);
                        i28 = ((iM45029 ^ i19) * 26055) ^ (-2104387369);
                        i2 = -867101878;
                    }
                    i29 = iM45029 ^ i2;
                    break;
                case -1358801569:
                case -1142475712:
                    dialogInterfaceC19358 = (DialogInterfaceC19356) weakReference.get();
                    if (dialogInterfaceC19358 != null) {
                        iM45029 = ThreadFactoryC3888.m11306("ۤۖ") ^ i19;
                        i28 = ((iM45029 ^ i20) * (-5477)) ^ 1933915300;
                        i2 = -1279797301;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧ۟") + i20) * (-67);
                        i28 = ((iM45029 ^ i19) * 26055) ^ (-2104387369);
                        i2 = -867101878;
                    }
                    i29 = iM45029 ^ i2;
                    break;
                case -1196193765:
                case 1548097798:
                    str3 = str5;
                    i7 = i23;
                    i8 = i25;
                    short[] sArr11 = sArr5;
                    int i35 = i26;
                    int i36 = i27;
                    sArr = sArr7;
                    dialogInterfaceC19356 = dialogInterfaceC19359;
                    int i37 = i24;
                    sArr2 = sArr6;
                    i6 = i37;
                    View viewM9787 = C3286.m9787(abstractActivityC12483, iM11309);
                    int iM450216 = C19806.m45029(C1460.m5047(f63180, 21, 3, i21));
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        i26 = i35;
                        i27 = i36;
                        view = viewM9787;
                        sArr5 = sArr11;
                        i22 = iM450216;
                        int iM113011 = ThreadFactoryC3888.m11306("ܽ᩹") ^ i20;
                        i28 = ((iM113011 ^ i19) * 13445) ^ (-1268385230);
                        i29 = iM113011 ^ (-57359060);
                        viewOnClickListenerC19680 = this;
                    } else {
                        int iM450217 = (C19806.m45029("᩺᩷") ^ i19) * (-99);
                        int i38 = ((iM450217 ^ i20) * 10643) ^ (-949512980);
                        i29 = iM450217 ^ (-2139732867);
                        i26 = i35;
                        i27 = i36;
                        sArr5 = sArr11;
                        i28 = i38;
                        view = viewM9787;
                        i22 = iM450216;
                    }
                    dialogInterfaceC19359 = dialogInterfaceC19356;
                    sArr7 = sArr;
                    i25 = i8;
                    i23 = i7;
                    str5 = str3;
                    short[] sArr12 = sArr2;
                    i24 = i6;
                    sArr6 = sArr12;
                    break;
                case -1045078819:
                case -656334136:
                    AbstractC0464.m2301(C2642.m8167(view, iM450214), 0.8f);
                    AbstractC0464.m2301(C2642.m8167(view, iM11308), 0.8f);
                    iM11307 = C19806.m45029("ۚ֨") ^ i20;
                    i16 = ((iM11307 ^ i19) * (-25697)) ^ (-946477805);
                    i17 = 1975292511;
                    i29 = iM11307 ^ i17;
                    i28 = i16;
                    break;
                case -889858310:
                case -24864337:
                    i = i25;
                    sArr = sArr7;
                    dialogInterfaceC19356 = dialogInterfaceC19359;
                    editText = editText2;
                    editText.setOnKeyListener(new View.OnKeyListener(viewOnClickListenerC19680) { // from class: l.ۘ᩵᩺

                        /* JADX INFO: renamed from: ۟ܽۢ, reason: not valid java name and contains not printable characters */
                        private static final short[] f15182 = {8790, 5265, -516, 1977, 26715, 26708, 26707, 26713, 26731, 26708, 26712, 26698, 26751, 26692, 26740, 26713, 26645, 26643, 26643, 26643, 26644};

                        /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ViewOnClickListenerC19680 f15183;

                        {
                            int i39 = 1740061140;
                            int i40 = C1419.f5860;
                            int i41 = C1875.f7103;
                            int iM113012 = (ThreadFactoryC3888.m11306("ᩴܺ") + i41) * (-77);
                            int i42 = ((iM113012 ^ i40) * 25403) ^ (-1316612294);
                            int i43 = 725812800;
                            while (true) {
                                i39 = ((((i39 ^ i40) * (-12651)) >> 31) & i42) ^ (iM113012 ^ i43);
                                switch (i39) {
                                    case -2088446721:
                                    case -2000800790:
                                        C7105.m18985();
                                        iM113012 = C19806.m45029("۬۬") ^ i41;
                                        i42 = ((iM113012 ^ i40) * (-10313)) ^ 319751200;
                                        i43 = -1178968594;
                                        break;
                                    case -2087612503:
                                    case -1525793518:
                                        if (C0962.m3746() < 0) {
                                            iM113012 = ThreadFactoryC3888.m11306("ۛᩳ") ^ i41;
                                            i42 = ((iM113012 ^ i40) * (-9825)) ^ 1944081895;
                                            i43 = -1003417743;
                                        } else {
                                            iM113012 = C19806.m45029("ܳ᩵") ^ i40;
                                            i42 = ((iM113012 ^ i41) * 29575) ^ (-2094635354);
                                            i43 = 1445209127;
                                        }
                                        break;
                                    case -1987599148:
                                    case -1504977750:
                                        if (RunnableC1606.m5473() != 0) {
                                            iM113012 = ThreadFactoryC3888.m11306("ܺ֡") ^ i40;
                                            i42 = ((iM113012 ^ i41) * (-31349)) ^ (-183151765);
                                            i43 = 1446077300;
                                        } else {
                                            iM113012 = (C19806.m45029("ۤ᩺") + i41) * (-115);
                                            i42 = ((iM113012 ^ i40) * (-15703)) ^ (-1964080491);
                                            i43 = -1292322124;
                                        }
                                        break;
                                    case -1937630639:
                                    case -361914622:
                                        if (C0817.f3443) {
                                            iM113012 = (ThreadFactoryC3888.m11306("ᩴܶ") ^ i40) * 99;
                                            i42 = ((iM113012 ^ i41) * 7857) ^ (-1578060196);
                                            i43 = 1430317074;
                                        } else {
                                            iM113012 = C19806.m45029("۬۬") ^ i41;
                                            i42 = ((iM113012 ^ i40) * (-10313)) ^ 319751200;
                                            i43 = -1178968594;
                                        }
                                        break;
                                    case -1581364093:
                                    case -1568395766:
                                        if (RunnableC1606.f6488 >= 0) {
                                            iM113012 = ThreadFactoryC3888.m11306("ۛᩳ") ^ i41;
                                            i42 = ((iM113012 ^ i40) * (-9825)) ^ 1944081895;
                                            i43 = -1003417743;
                                        } else {
                                            iM113012 = C19806.m45029("ۡۖ") ^ i40;
                                            i42 = ((iM113012 ^ i41) * (-31551)) ^ (-380672751);
                                            i43 = 1495453502;
                                        }
                                        break;
                                    case -1528018885:
                                    case 391015845:
                                        if (C1461.f5957 <= 0) {
                                            iM113012 = C19806.m45029("۬۬") ^ i41;
                                            i42 = ((iM113012 ^ i40) * (-10313)) ^ 319751200;
                                            i43 = -1178968594;
                                        } else {
                                            iM113012 = ThreadFactoryC3888.m11306("᩺ۢ") ^ i40;
                                            i42 = ((iM113012 ^ i41) * (-10229)) ^ (-188227573);
                                            i43 = 1545901574;
                                        }
                                        break;
                                    case -1300132683:
                                    case -1111622778:
                                        if (C1875.f7103 >= 0) {
                                            iM113012 = ThreadFactoryC3888.m11306("ܺ֡") ^ i40;
                                            i42 = ((iM113012 ^ i41) * (-31349)) ^ (-183151765);
                                            i43 = 1446077300;
                                        } else {
                                            iM113012 = ThreadFactoryC3888.m11306("ۛᩳ") ^ i41;
                                            i42 = ((iM113012 ^ i40) * (-9825)) ^ 1944081895;
                                            i43 = -1003417743;
                                        }
                                        break;
                                    case -883129414:
                                    case 841786515:
                                        if (AbstractC0464.m2313() != 0) {
                                            iM113012 = C19806.m45029("۬۬") ^ i41;
                                            i42 = ((iM113012 ^ i40) * (-10313)) ^ 319751200;
                                            i43 = -1178968594;
                                        } else {
                                            iM113012 = (i41 - C19806.m45029("᩷֫")) * (-43);
                                            i42 = ((iM113012 ^ i40) * 7553) ^ 1386232204;
                                            i43 = -28825111;
                                        }
                                        break;
                                    case -634104678:
                                    case 54641352:
                                        if (C1977.f7413 <= 0) {
                                            iM113012 = C19806.m45029("ۛ᩸") ^ i41;
                                            i42 = ((iM113012 ^ i40) * (-23227)) ^ (-189295007);
                                            i43 = 1504735717;
                                        } else {
                                            iM113012 = C19806.m45029("᩸ۚ") ^ i40;
                                            i42 = ((iM113012 ^ i41) * (-9635)) ^ (-1756035996);
                                            i43 = -1441325339;
                                        }
                                        break;
                                    case -487307176:
                                    case 2142514429:
                                        return;
                                    case -361695789:
                                    case 235222115:
                                        if (C7105.f23796 >= 0) {
                                            iM113012 = C19806.m45029("ۛ᩸") ^ i41;
                                            i42 = ((iM113012 ^ i40) * (-23227)) ^ (-189295007);
                                            i43 = 1504735717;
                                        } else {
                                            iM113012 = (C19806.m45029("ܳۚ") + i40) * (-87);
                                            i42 = ((iM113012 ^ i41) * 30713) ^ (-1576516286);
                                            i43 = 1806959849;
                                        }
                                        break;
                                    case -57464846:
                                    case 788591140:
                                        RunnableC1606.m5473();
                                        if (C0278.m1789() > 0) {
                                            iM113012 = C19806.m45029("ܳ᩵") ^ i40;
                                            i42 = ((iM113012 ^ i41) * 29575) ^ (-2094635354);
                                            i43 = 1445209127;
                                        } else {
                                            iM113012 = C19806.m45029("۬۬") ^ i41;
                                            i42 = ((iM113012 ^ i40) * (-10313)) ^ 319751200;
                                            i43 = -1178968594;
                                        }
                                        break;
                                    case 234528704:
                                    case 1182007014:
                                        if (C2642.f10294 <= 0) {
                                            iM113012 = ThreadFactoryC3888.m11306("ܺ֡") ^ i40;
                                            i42 = ((iM113012 ^ i41) * (-31349)) ^ (-183151765);
                                            i43 = 1446077300;
                                        } else {
                                            iM113012 = ThreadFactoryC3888.m11306("ۗ᩸") ^ i41;
                                            i42 = ((iM113012 ^ i40) * 3725) ^ 1928996311;
                                            i43 = 1236652838;
                                        }
                                        break;
                                    case 550242258:
                                    case 1384879043:
                                        C19806.m45024();
                                        throw new RuntimeException();
                                    case 1116839026:
                                    case 1778861737:
                                        this.f15183 = viewOnClickListenerC19680;
                                        if (ThreadFactoryC3888.f14547 <= 0) {
                                            iM113012 = ThreadFactoryC3888.m11306("ܺ֡") ^ i40;
                                            i42 = ((iM113012 ^ i41) * (-31349)) ^ (-183151765);
                                            i43 = 1446077300;
                                        } else {
                                            iM113012 = C19806.m45029("ۤ֡") ^ i41;
                                            i42 = ((iM113012 ^ i40) * 21055) ^ (-1504081656);
                                            i43 = -58743499;
                                        }
                                        break;
                                    default:
                                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                                            iM113012 = ThreadFactoryC3888.m11306("ۛᩳ") ^ i41;
                                            i42 = ((iM113012 ^ i40) * (-9825)) ^ 1944081895;
                                            i43 = -1003417743;
                                        } else {
                                            iM113012 = (i41 - C19806.m45029("۬۫")) * (-17);
                                            i42 = ((iM113012 ^ i40) * 8393) ^ (-295630950);
                                            i43 = 1653449786;
                                        }
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:37:0x0124 A[PHI: r5 r7 r8 r9 r10 r14 r15
                          0x0124: PHI (r5v4 android.view.View) = (r5v2 android.view.View), (r5v3 android.view.View), (r5v2 android.view.View) binds: [B:36:0x0122, B:24:0x00b4, B:9:0x0078] A[DONT_GENERATE, DONT_INLINE]
                          0x0124: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:36:0x0122, B:24:0x00b4, B:9:0x0078] A[DONT_GENERATE, DONT_INLINE]
                          0x0124: PHI (r8v4 short[]) = (r8v2 short[]), (r8v3 short[]), (r8v2 short[]) binds: [B:36:0x0122, B:24:0x00b4, B:9:0x0078] A[DONT_GENERATE, DONT_INLINE]
                          0x0124: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:36:0x0122, B:24:0x00b4, B:9:0x0078] A[DONT_GENERATE, DONT_INLINE]
                          0x0124: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:36:0x0122, B:24:0x00b4, B:9:0x0078] A[DONT_GENERATE, DONT_INLINE]
                          0x0124: PHI (r14v4 short[]) = (r14v3 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:36:0x0122, B:24:0x00b4, B:9:0x0078] A[DONT_GENERATE, DONT_INLINE]
                          0x0124: PHI (r15v4 int) = (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:36:0x0122, B:24:0x00b4, B:9:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:51:0x01be  */
                        /* JADX WARN: Code duplicated, block: B:62:0x0238 A[PHI: r3 r4 r16 r17
                          0x0238: PHI (r3v3 int) = (r3v2 int), (r3v4 int) binds: [B:61:0x0236, B:28:0x00d8] A[DONT_GENERATE, DONT_INLINE]
                          0x0238: PHI (r4v3 android.view.View) = (r4v2 android.view.View), (r4v4 android.view.View) binds: [B:61:0x0236, B:28:0x00d8] A[DONT_GENERATE, DONT_INLINE]
                          0x0238: PHI (r16v4 short) = (r16v3 short), (r16v2 short) binds: [B:61:0x0236, B:28:0x00d8] A[DONT_GENERATE, DONT_INLINE]
                          0x0238: PHI (r17v4 short) = (r17v3 short), (r17v2 short) binds: [B:61:0x0236, B:28:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:72:0x028d  */
                        /* JADX WARN: Code duplicated, block: B:76:0x02bc  */
                        /* JADX WARN: Code restructure failed: missing block: B:9:0x0078, code lost:
                        
                            if (l.ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) goto L10;
                         */
                        @Override // android.view.View.OnKeyListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final boolean onKey(android.view.View r25, int r26, android.view.KeyEvent r27) {
                            /*
                                Method dump skipped, instruction units count: 990
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: l.ViewOnKeyListenerC4156.onKey(android.view.View, int, android.view.KeyEvent):boolean");
                        }
                    });
                    C19328.m44316(textInputLayout2);
                    C19328.m44316(textInputLayout);
                    sArr6 = f63180;
                    i24 = 47;
                    i23 = 3;
                    if (RunnableC1564.m5345()) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘܿ") + i19) * 101;
                        i28 = ((iM11306 ^ i20) * (-12093)) ^ 380187077;
                        i3 = 1839194616;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿۢ") ^ i19;
                        i28 = ((iM11306 ^ i20) * 32557) ^ (-579335539);
                        i3 = -1673837676;
                    }
                    i4 = iM11306 ^ i3;
                    editText2 = editText;
                    i29 = i4;
                    dialogInterfaceC19359 = dialogInterfaceC19356;
                    sArr7 = sArr;
                    i25 = i;
                    break;
                case -764517048:
                case 1563267074:
                    C0797.m3359();
                    if (C0050.f912 > 0) {
                        str3 = str5;
                        i7 = i23;
                        i8 = i25;
                        sArr = sArr7;
                        dialogInterfaceC19356 = dialogInterfaceC19359;
                        int i39 = i24;
                        sArr2 = sArr6;
                        i6 = i39;
                        int iM113012 = ThreadFactoryC3888.m11306("ܽ᩹") ^ i20;
                        i28 = ((iM113012 ^ i19) * 13445) ^ (-1268385230);
                        i29 = iM113012 ^ (-57359060);
                        viewOnClickListenerC19680 = this;
                        dialogInterfaceC19359 = dialogInterfaceC19356;
                        sArr7 = sArr;
                        i25 = i8;
                        i23 = i7;
                        str5 = str3;
                        short[] sArr13 = sArr2;
                        i24 = i6;
                        sArr6 = sArr13;
                    } else {
                        short[] sArr14 = sArr7;
                        dialogInterfaceC19357 = dialogInterfaceC19359;
                        sArr4 = sArr14;
                        iM450211 = (C19806.m45029("ۤ᩺") + i19) * (-85);
                        i14 = ((iM450211 ^ i20) * (-27913)) ^ (-1781802702);
                        i15 = 128279515;
                        i29 = iM450211 ^ i15;
                        i28 = i14;
                        DialogInterfaceC19356 dialogInterfaceC193510 = dialogInterfaceC19357;
                        sArr7 = sArr4;
                        dialogInterfaceC19359 = dialogInterfaceC193510;
                    }
                    break;
                case -731067560:
                case 615471618:
                    C1668.m5572(dialogInterfaceC19358);
                    iM45029 = (ThreadFactoryC3888.m11306("ۧ۟") + i20) * (-67);
                    i28 = ((iM45029 ^ i19) * 26055) ^ (-2104387369);
                    i2 = -867101878;
                    i29 = iM45029 ^ i2;
                    break;
                case -668905323:
                case 835665764:
                    C0962.m3746();
                    C3535.m10431();
                    throw new RuntimeException();
                case -641123238:
                case 1972406120:
                    dialogInterfaceC19357 = dialogInterfaceC19359;
                    C7105.m18993(C3743.m10957(view, C19806.m45029(RunnableC3388.m10056(f63180, 50, 3, i21)) ^ 2129116197), viewOnClickListenerC19680);
                    sArr4 = f63180;
                    i30 = 53;
                    i25 = 3;
                    if (RunnableC1606.f6488 >= 0) {
                        iM450211 = (C19806.m45029("ۤ᩺") + i19) * (-85);
                        i14 = ((iM450211 ^ i20) * (-27913)) ^ (-1781802702);
                        i15 = 128279515;
                    } else {
                        iM450211 = C19806.m45029("᩻᩸") ^ i19;
                        i14 = ((iM450211 ^ i20) * (-27565)) ^ (-300691572);
                        i15 = 1928988025;
                    }
                    i29 = iM450211 ^ i15;
                    i28 = i14;
                    DialogInterfaceC19356 dialogInterfaceC193511 = dialogInterfaceC19357;
                    sArr7 = sArr4;
                    dialogInterfaceC19359 = dialogInterfaceC193511;
                    break;
                case -560525922:
                case -346708758:
                    C1025.m3864(new Runnable() { // from class: l.ۤᩳ᩺
                        @Override // java.lang.Runnable
                        public final void run() {
                            DialogInterfaceC19356 dialogInterfaceC193512 = null;
                            int i40 = -1530672176;
                            int i41 = C3535.f13026;
                            int i42 = C2788.f10625;
                            int iM450218 = C19806.m45029("֫ۤ") ^ i41;
                            int i43 = ((iM450218 ^ i42) * (-20721)) ^ (-2041591641);
                            int i44 = -460424149;
                            while (true) {
                                i40 = ((((i40 ^ i42) * 261) >> 31) & i43) ^ (iM450218 ^ i44);
                                switch (i40) {
                                    case -1762501577:
                                    case 588567869:
                                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                                            iM450218 = (ThreadFactoryC3888.m11306("ۜ۟") ^ i42) * (-3);
                                            i43 = ((iM450218 ^ i41) * 2163) ^ (-1754353290);
                                            i44 = -973093684;
                                        } else {
                                            iM450218 = C19806.m45029("ܽ᩵") ^ i41;
                                            i43 = ((iM450218 ^ i42) * 21385) ^ (-183699955);
                                            i44 = -303024624;
                                        }
                                        break;
                                    case -1650304713:
                                    case -1451628883:
                                        if (C1937.m6279() < 0) {
                                            iM450218 = (ThreadFactoryC3888.m11306("ۖۖ") ^ i42) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i43 = ((iM450218 ^ i41) * (-32395)) ^ 1942234595;
                                            i44 = 1948984997;
                                        } else {
                                            iM450218 = (i42 - ThreadFactoryC3888.m11306("ۛ᩻")) * 13;
                                            i43 = ((iM450218 ^ i41) * (-2167)) ^ 1663987914;
                                            i44 = -1174444627;
                                        }
                                        break;
                                    case -1489287902:
                                    case 1041452392:
                                        RunnableC3388.m10064();
                                        break;
                                    case -1460752899:
                                    case 2038154276:
                                        C1668.m5572(dialogInterfaceC193512);
                                        iM450218 = C19806.m45029("ۖ۫") ^ i42;
                                        i43 = ((iM450218 ^ i41) * (-30319)) ^ 1405780575;
                                        i44 = -504374601;
                                        break;
                                    case -1309614933:
                                    case 339472269:
                                        C2477.m7593();
                                        if (C0278.f1572 > 0) {
                                            iM450218 = (i42 - ThreadFactoryC3888.m11306("ۛ᩻")) * 13;
                                            i43 = ((iM450218 ^ i41) * (-2167)) ^ 1663987914;
                                            i44 = -1174444627;
                                        } else {
                                            iM450218 = C19806.m45029("ۧۧ") ^ i41;
                                            i43 = ((iM450218 ^ i42) * 2781) ^ 598497071;
                                            i44 = -119822883;
                                        }
                                        break;
                                    case -1307512617:
                                    case 1052974787:
                                        if (C1937.f7317 >= 0) {
                                            iM450218 = (ThreadFactoryC3888.m11306("ۖۖ") ^ i42) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i43 = ((iM450218 ^ i41) * (-32395)) ^ 1942234595;
                                            i44 = 1948984997;
                                        } else {
                                            iM450218 = ThreadFactoryC3888.m11306("ۧ᩷") ^ i42;
                                            i43 = ((iM450218 ^ i41) * 29141) ^ (-1546738369);
                                            i44 = -1241874715;
                                        }
                                        break;
                                    case -1144346419:
                                    case -235408191:
                                        if (C3535.f13026 <= 0) {
                                            iM450218 = (ThreadFactoryC3888.m11306("ۖۖ") ^ i42) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i43 = ((iM450218 ^ i41) * (-32395)) ^ 1942234595;
                                            i44 = 1948984997;
                                        } else {
                                            iM450218 = (C19806.m45029("᩸᩵") + i41) * 119;
                                            i43 = ((iM450218 ^ i42) * (-24639)) ^ 1893200840;
                                            i44 = 258470707;
                                        }
                                        break;
                                    case -1140889696:
                                    case 1886186730:
                                        if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                                            iM450218 = (ThreadFactoryC3888.m11306("᩷ᩴ") ^ i42) * (-107);
                                            i43 = ((iM450218 ^ i41) * 16647) ^ (-2097177024);
                                            i44 = -1833774137;
                                        } else {
                                            iM450218 = (i42 - ThreadFactoryC3888.m11306("ۛ᩻")) * 13;
                                            i43 = ((iM450218 ^ i41) * (-2167)) ^ 1663987914;
                                            i44 = -1174444627;
                                        }
                                        break;
                                    case -1014612560:
                                    case -243365542:
                                        if (RunnableC0195.m1443(dialogInterfaceC193512)) {
                                            iM450218 = ThreadFactoryC3888.m11306("᩷֫") ^ i41;
                                            i43 = ((iM450218 ^ i42) * 6797) ^ (-1574138272);
                                            i44 = 647545391;
                                        } else {
                                            iM450218 = C19806.m45029("ۖ۫") ^ i42;
                                            i43 = ((iM450218 ^ i41) * (-30319)) ^ 1405780575;
                                            i44 = -504374601;
                                        }
                                        break;
                                    case -906598730:
                                    case -770401504:
                                        if (C2704.f10408) {
                                            iM450218 = ThreadFactoryC3888.m11306("ۢ᩸") ^ i42;
                                            i43 = ((iM450218 ^ i41) * 26705) ^ 2011743948;
                                            i44 = -1494034345;
                                        } else {
                                            iM450218 = (ThreadFactoryC3888.m11306("ۖۖ") ^ i42) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i43 = ((iM450218 ^ i41) * (-32395)) ^ 1942234595;
                                            i44 = 1948984997;
                                        }
                                        break;
                                    case -845627593:
                                    case 872540852:
                                        break;
                                    case -588391168:
                                    case 1071866053:
                                        if (C3577.m10565()) {
                                            iM450218 = (i42 - C19806.m45029("۟ۘ")) * (-35);
                                            i43 = ((iM450218 ^ i41) * 7275) ^ (-962960444);
                                            i44 = 159749599;
                                        } else {
                                            iM450218 = (ThreadFactoryC3888.m11306("ۖۖ") ^ i42) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i43 = ((iM450218 ^ i41) * (-32395)) ^ 1942234595;
                                            i44 = 1948984997;
                                        }
                                        break;
                                    case -553180783:
                                    case 1611949123:
                                        if (C1066.f4915 <= 0) {
                                            iM450218 = (ThreadFactoryC3888.m11306("ۖۖ") ^ i42) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i43 = ((iM450218 ^ i41) * (-32395)) ^ 1942234595;
                                            i44 = 1948984997;
                                        } else {
                                            iM450218 = (ThreadFactoryC3888.m11306("ۡᩳ") + i41) * (-105);
                                            i43 = ((iM450218 ^ i42) * 23159) ^ (-666639571);
                                            i44 = -590746707;
                                        }
                                        break;
                                    case 119454880:
                                    case 1822876328:
                                        if (C0671.f2816 != 0) {
                                            iM450218 = C19806.m45029("ۧۧ") ^ i41;
                                            i43 = ((iM450218 ^ i42) * 2781) ^ 598497071;
                                            i44 = -119822883;
                                        } else {
                                            iM450218 = C19806.m45029("ۨۙ") ^ i41;
                                            i43 = ((iM450218 ^ i42) * 3119) ^ 1810242949;
                                            i44 = 1060262539;
                                        }
                                        break;
                                    case 171585448:
                                    case 1624420965:
                                        if (RunnableC1895.f7152) {
                                            iM450218 = ThreadFactoryC3888.m11306("ᩴ۬") ^ i41;
                                            i43 = ((iM450218 ^ i42) * (-1511)) ^ (-992192756);
                                            i44 = -2096178201;
                                        } else {
                                            iM450218 = (i42 - ThreadFactoryC3888.m11306("ۛ᩻")) * 13;
                                            i43 = ((iM450218 ^ i41) * (-2167)) ^ 1663987914;
                                            i44 = -1174444627;
                                        }
                                        break;
                                    case 1693101171:
                                    case 1748527088:
                                        C0278.m1789();
                                        iM450218 = C19806.m45029("ۧۧ") ^ i41;
                                        i43 = ((iM450218 ^ i42) * 2781) ^ 598497071;
                                        i44 = -119822883;
                                        break;
                                    case 1900065108:
                                    case 1931271511:
                                        if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                                            iM450218 = (ThreadFactoryC3888.m11306("ۜ۟") ^ i42) * (-3);
                                            i43 = ((iM450218 ^ i41) * 2163) ^ (-1754353290);
                                            i44 = -973093684;
                                        } else {
                                            iM450218 = (ThreadFactoryC3888.m11306("᩺ۘ") + i41) * (-101);
                                            i43 = ((iM450218 ^ i42) * (-28481)) ^ 1344718573;
                                            i44 = -633386187;
                                        }
                                        break;
                                    default:
                                        dialogInterfaceC193512 = dialogInterfaceC19359;
                                        if (C2642.f10294 <= 0) {
                                            iM450218 = C19806.m45029("ۧۧ") ^ i41;
                                            i43 = ((iM450218 ^ i42) * 2781) ^ 598497071;
                                            i44 = -119822883;
                                        } else {
                                            iM450218 = (i42 - C19806.m45029("ᩴۢ")) * (-25);
                                            i43 = ((iM450218 ^ i41) * (-3761)) ^ (-733030429);
                                            i44 = -1928753553;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    iM45029 = (ThreadFactoryC3888.m11306("ۗۙ") ^ i19) * (-97);
                    i28 = ((iM45029 ^ i20) * 8599) ^ 1812140943;
                    i2 = -93220798;
                    i29 = iM45029 ^ i2;
                    break;
                case -540137680:
                case 959054637:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    if (C0278.f1572 <= 0) {
                        iM45029 = (i20 - C19806.m45029("᩹֫")) * 39;
                        i28 = ((iM45029 ^ i19) * (-10773)) ^ 550204948;
                        i2 = 1250624761;
                    } else {
                        iM45029 = C19806.m45029("᩺֡") ^ i19;
                        i28 = ((iM45029 ^ i20) * (-27199)) ^ (-869273155);
                        i2 = 821083881;
                    }
                    i29 = iM45029 ^ i2;
                    break;
                case -476578515:
                case 812712665:
                    weakReference2 = C14015.f46056;
                    if (weakReference2 != null) {
                        iM45029 = (i19 - ThreadFactoryC3888.m11306("ۢᩳ")) * 3;
                        i28 = ((iM45029 ^ i20) * 23333) ^ (-482684598);
                        i2 = -421130396;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗۙ") ^ i19) * (-97);
                        i28 = ((iM45029 ^ i20) * 8599) ^ 1812140943;
                        i2 = -93220798;
                    }
                    i29 = iM45029 ^ i2;
                    break;
                case -433778098:
                case 1319740624:
                    C0050.m946();
                    C1419.m4973();
                    sArr3 = sArr5;
                    i10 = i26;
                    i11 = i27;
                    short[] sArr15 = sArr7;
                    dialogInterfaceC19356 = dialogInterfaceC19359;
                    str4 = str5;
                    i7 = i23;
                    i8 = i25;
                    sArr = sArr15;
                    int i40 = i24;
                    sArr2 = sArr6;
                    i6 = i40;
                    int iM450218 = (C19806.m45029("ۗۘ") + i19) * (-5);
                    str3 = str4;
                    i9 = ((iM450218 ^ i20) * 12451) ^ (-1034226048);
                    sArr5 = sArr3;
                    i26 = i10;
                    i27 = i11;
                    i29 = iM450218 ^ 1909672945;
                    i28 = i9;
                    dialogInterfaceC19359 = dialogInterfaceC19356;
                    sArr7 = sArr;
                    i25 = i8;
                    i23 = i7;
                    str5 = str3;
                    short[] sArr16 = sArr2;
                    i24 = i6;
                    sArr6 = sArr16;
                    break;
                case -432990022:
                case -163703653:
                    C1025.m3861();
                    if (C2249.m6915() > 0) {
                        short[] sArr17 = sArr7;
                        dialogInterfaceC19357 = dialogInterfaceC19359;
                        sArr4 = sArr17;
                        iM450211 = (C19806.m45029("ۤ᩺") + i19) * (-85);
                        i14 = ((iM450211 ^ i20) * (-27913)) ^ (-1781802702);
                        i15 = 128279515;
                        i29 = iM450211 ^ i15;
                        i28 = i14;
                        DialogInterfaceC19356 dialogInterfaceC193512 = dialogInterfaceC19357;
                        sArr7 = sArr4;
                        dialogInterfaceC19359 = dialogInterfaceC193512;
                    } else {
                        sArr3 = sArr5;
                        i10 = i26;
                        i11 = i27;
                        short[] sArr18 = sArr7;
                        dialogInterfaceC19356 = dialogInterfaceC19359;
                        str4 = str5;
                        i7 = i23;
                        i8 = i25;
                        sArr = sArr18;
                        int i41 = i24;
                        sArr2 = sArr6;
                        i6 = i41;
                        int iM450219 = (C19806.m45029("ۗۘ") + i19) * (-5);
                        str3 = str4;
                        i9 = ((iM450219 ^ i20) * 12451) ^ (-1034226048);
                        sArr5 = sArr3;
                        i26 = i10;
                        i27 = i11;
                        i29 = iM450219 ^ 1909672945;
                        i28 = i9;
                        dialogInterfaceC19359 = dialogInterfaceC19356;
                        sArr7 = sArr;
                        i25 = i8;
                        i23 = i7;
                        str5 = str3;
                        short[] sArr19 = sArr2;
                        i24 = i6;
                        sArr6 = sArr19;
                    }
                    break;
                case -365684484:
                case 1067218019:
                    i7 = i23;
                    i8 = i25;
                    sArr = sArr7;
                    dialogInterfaceC19356 = dialogInterfaceC19359;
                    int i42 = i24;
                    sArr2 = sArr6;
                    i6 = i42;
                    View viewM10957 = C3743.m10957(view, i22 ^ 2099339855);
                    String strM2906 = C0629.m2906(f63180, 24, 17, i21);
                    C1937.m6286(viewM10957, strM2906);
                    viewOnClickListenerC19680.f63182 = viewM10957;
                    sArr5 = f63180;
                    i26 = 41;
                    i27 = 3;
                    if (C0050.f912 > 0) {
                        int iM113013 = ThreadFactoryC3888.m11306("᩵ۤ") ^ i19;
                        i28 = ((iM113013 ^ i20) * 21743) ^ (-1979947392);
                        i29 = iM113013 ^ 29593535;
                        dialogInterfaceC19359 = dialogInterfaceC19356;
                        sArr7 = sArr;
                        i25 = i8;
                        i23 = i7;
                        str5 = strM2906;
                        short[] sArr20 = sArr2;
                        i24 = i6;
                        sArr6 = sArr20;
                    } else {
                        str3 = strM2906;
                        int iM113014 = ThreadFactoryC3888.m11306("ܽ᩹") ^ i20;
                        i28 = ((iM113014 ^ i19) * 13445) ^ (-1268385230);
                        i29 = iM113014 ^ (-57359060);
                        viewOnClickListenerC19680 = this;
                        dialogInterfaceC19359 = dialogInterfaceC19356;
                        sArr7 = sArr;
                        i25 = i8;
                        i23 = i7;
                        str5 = str3;
                        short[] sArr110 = sArr2;
                        i24 = i6;
                        sArr6 = sArr110;
                    }
                    break;
                case -341827044:
                case 171674170:
                    i5 = i23;
                    int i43 = i24;
                    i = i25;
                    sArr = sArr7;
                    dialogInterfaceC19356 = dialogInterfaceC19359;
                    short[] sArr21 = sArr6;
                    sArr2 = sArr21;
                    C1937.m6291(C3743.m10957(view, ThreadFactoryC3888.m11306(RunnableC3388.m10056(sArr21, i43, i5, i21)) ^ 2101866182), viewOnClickListenerC19680);
                    if (C2871.f10837 < 0) {
                        iM450210 = (C19806.m45029("֨ۙ") ^ i20) * 91;
                        i6 = i43;
                        i12 = ((iM450210 ^ i19) * (-9489)) ^ 1925747021;
                        i13 = 1602873362;
                        int i44 = iM450210 ^ i13;
                        i23 = i5;
                        i28 = i12;
                        i29 = i44;
                        dialogInterfaceC19359 = dialogInterfaceC19356;
                        sArr7 = sArr;
                        i25 = i;
                        short[] sArr111 = sArr2;
                        i24 = i6;
                        sArr6 = sArr111;
                    } else {
                        i6 = i43;
                        i8 = i;
                        str4 = str5;
                        sArr3 = sArr5;
                        i11 = i27;
                        i7 = i5;
                        i10 = i26;
                        int iM4502110 = (C19806.m45029("ۗۘ") + i19) * (-5);
                        str3 = str4;
                        i9 = ((iM4502110 ^ i20) * 12451) ^ (-1034226048);
                        sArr5 = sArr3;
                        i26 = i10;
                        i27 = i11;
                        i29 = iM4502110 ^ 1909672945;
                        i28 = i9;
                        dialogInterfaceC19359 = dialogInterfaceC19356;
                        sArr7 = sArr;
                        i25 = i8;
                        i23 = i7;
                        str5 = str3;
                        short[] sArr112 = sArr2;
                        i24 = i6;
                        sArr6 = sArr112;
                    }
                    break;
                case -235165010:
                case 1985688251:
                    sArr3 = sArr5;
                    i10 = i26;
                    i11 = i27;
                    short[] sArr22 = sArr7;
                    dialogInterfaceC19356 = dialogInterfaceC19359;
                    str4 = str5;
                    i7 = i23;
                    i8 = i25;
                    sArr = sArr22;
                    int i45 = i24;
                    sArr2 = sArr6;
                    i6 = i45;
                    View viewM8167 = C2642.m8167(view, ThreadFactoryC3888.m11306(RunnableC1606.m5481(sArr3, i10, i11, i21)) ^ 2118950516);
                    C7105.m18988(viewM8167, str4);
                    textInputLayout2 = (TextInputLayout) viewM8167;
                    if (C1977.f7413 <= 0) {
                        int iM4502111 = (C19806.m45029("ۗۘ") + i19) * (-5);
                        str3 = str4;
                        i9 = ((iM4502111 ^ i20) * 12451) ^ (-1034226048);
                        sArr5 = sArr3;
                        i26 = i10;
                        i27 = i11;
                        i29 = iM4502111 ^ 1909672945;
                        i28 = i9;
                    } else {
                        str3 = str4;
                        int iM450220 = (C19806.m45029("ۨ۟") + i20) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i26 = i10;
                        i27 = i11;
                        sArr5 = sArr3;
                        i28 = ((iM450220 ^ i19) * 16347) ^ 1236947270;
                        i29 = iM450220 ^ (-1062458090);
                    }
                    dialogInterfaceC19359 = dialogInterfaceC19356;
                    sArr7 = sArr;
                    i25 = i8;
                    i23 = i7;
                    str5 = str3;
                    short[] sArr113 = sArr2;
                    i24 = i6;
                    sArr6 = sArr113;
                    break;
                case -159427528:
                case 1878612697:
                    int i46 = i25;
                    sArr = sArr7;
                    dialogInterfaceC19356 = dialogInterfaceC19359;
                    String str6 = str5;
                    int i47 = i24;
                    sArr2 = sArr6;
                    i6 = i47;
                    viewOnClickListenerC19680.f63186 = textInputLayout2;
                    i7 = i23;
                    i8 = i46;
                    iM450213 = C19806.m45029(RunnableC1564.m5344(f63180, 44, 3, i21));
                    if (C2642.f10294 > 0) {
                        int iM450221 = (C19806.m45029("۬᩵") ^ i19) * (-79);
                        i28 = ((iM450221 ^ i20) * (-16349)) ^ 1547497309;
                        i29 = iM450221 ^ 707427610;
                        str5 = str6;
                        dialogInterfaceC19359 = dialogInterfaceC19356;
                        sArr7 = sArr;
                        i25 = i8;
                        i23 = i7;
                        short[] sArr23 = sArr2;
                        i24 = i6;
                        sArr6 = sArr23;
                    } else {
                        str3 = str6;
                        int iM113015 = ThreadFactoryC3888.m11306("ܽ᩹") ^ i20;
                        i28 = ((iM113015 ^ i19) * 13445) ^ (-1268385230);
                        i29 = iM113015 ^ (-57359060);
                        viewOnClickListenerC19680 = this;
                        dialogInterfaceC19359 = dialogInterfaceC19356;
                        sArr7 = sArr;
                        i25 = i8;
                        i23 = i7;
                        str5 = str3;
                        short[] sArr114 = sArr2;
                        i24 = i6;
                        sArr6 = sArr114;
                    }
                    break;
                case -133396437:
                case 1197998725:
                    C0817.m3399();
                    if (C2871.f10837 < 0) {
                        iM45029 = (i20 - C19806.m45029("᩹֫")) * 39;
                        i28 = ((iM45029 ^ i19) * (-10773)) ^ 550204948;
                        i2 = 1250624761;
                        i29 = iM45029 ^ i2;
                    } else {
                        sArr3 = sArr5;
                        i10 = i26;
                        i11 = i27;
                        short[] sArr115 = sArr7;
                        dialogInterfaceC19356 = dialogInterfaceC19359;
                        str4 = str5;
                        i7 = i23;
                        i8 = i25;
                        sArr = sArr115;
                        int i48 = i24;
                        sArr2 = sArr6;
                        i6 = i48;
                        int iM4502112 = (C19806.m45029("ۗۘ") + i19) * (-5);
                        str3 = str4;
                        i9 = ((iM4502112 ^ i20) * 12451) ^ (-1034226048);
                        sArr5 = sArr3;
                        i26 = i10;
                        i27 = i11;
                        i29 = iM4502112 ^ 1909672945;
                        i28 = i9;
                        dialogInterfaceC19359 = dialogInterfaceC19356;
                        sArr7 = sArr;
                        i25 = i8;
                        i23 = i7;
                        str5 = str3;
                        short[] sArr116 = sArr2;
                        i24 = i6;
                        sArr6 = sArr116;
                    }
                    break;
                case -31728110:
                case 646338337:
                    C2871.m8645(textInputLayout);
                    C16737.m39290(C0962.m3740(textInputLayout));
                    return;
                case 72760054:
                case 1775762737:
                    dialogInterfaceC19356M21252.m44362();
                    f63181 = new WeakReference(dialogInterfaceC19356M21252);
                    if (C1461.m5087(editTextM3740) > 0) {
                        iM45029 = C19806.m45029("֨ۜ") ^ i19;
                        i28 = ((iM45029 ^ i20) * (-1421)) ^ (-1829542477);
                        i2 = 1360881438;
                    } else {
                        iM45029 = C19806.m45029("֡ܳ") ^ i20;
                        i28 = ((iM45029 ^ i19) * (-26055)) ^ (-433644931);
                        i2 = -2037941771;
                    }
                    i29 = iM45029 ^ i2;
                    break;
                case 90360879:
                case 1864967208:
                    short[] sArr24 = sArr7;
                    i = i25;
                    C7105.m18993(C3743.m10957(view, C19806.m45029(C1977.m6363(sArr24, i30, i, i21)) ^ 2119622886), viewOnClickListenerC19680);
                    dialogInterfaceC19356 = dialogInterfaceC19359;
                    sArr = sArr24;
                    iM450214 = C19806.m45029(C3743.m10964(f63180, 56, 3, i21)) ^ 2102721020;
                    if (CallableC1627.m5507() == 0) {
                        int iM450222 = (C19806.m45029("ᩳ۟") + i20) * (-17);
                        int i49 = ((iM450222 ^ i19) * 6431) ^ (-1794546174);
                        i4 = iM450222 ^ (-1340569873);
                        i28 = i49;
                        i29 = i4;
                        dialogInterfaceC19359 = dialogInterfaceC19356;
                        sArr7 = sArr;
                        i25 = i;
                    } else {
                        i5 = i23;
                        int i50 = i24;
                        sArr2 = sArr6;
                        i6 = i50;
                        iM450210 = C19806.m45029("ܶܶ") ^ i20;
                        i12 = ((iM450210 ^ i19) * 30789) ^ 100184153;
                        i13 = 1104031823;
                        int i410 = iM450210 ^ i13;
                        i23 = i5;
                        i28 = i12;
                        i29 = i410;
                        dialogInterfaceC19359 = dialogInterfaceC19356;
                        sArr7 = sArr;
                        i25 = i;
                        short[] sArr117 = sArr2;
                        i24 = i6;
                        sArr6 = sArr117;
                    }
                    break;
                case 184543443:
                case 411516408:
                    C16737.m39290(RunnableC1564.m5346(textInputLayout2));
                    iM11307 = ThreadFactoryC3888.m11306("۠ۙ") ^ i20;
                    i16 = ((iM11307 ^ i19) * 4203) ^ 539185638;
                    i17 = -314884728;
                    i29 = iM11307 ^ i17;
                    i28 = i16;
                    break;
                case 231576071:
                case 1933252558:
                    return;
                case 544777077:
                case 1653919311:
                    if (C2477.m7593() < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩻ۢ") ^ i20;
                        i28 = ((iM45029 ^ i19) * (-18115)) ^ 2082037318;
                        i2 = 1748885219;
                        i29 = iM45029 ^ i2;
                    } else {
                        sArr3 = sArr5;
                        i10 = i26;
                        i11 = i27;
                        short[] sArr118 = sArr7;
                        dialogInterfaceC19356 = dialogInterfaceC19359;
                        str4 = str5;
                        i7 = i23;
                        i8 = i25;
                        sArr = sArr118;
                        int i411 = i24;
                        sArr2 = sArr6;
                        i6 = i411;
                        int iM4502113 = (C19806.m45029("ۗۘ") + i19) * (-5);
                        str3 = str4;
                        i9 = ((iM4502113 ^ i20) * 12451) ^ (-1034226048);
                        sArr5 = sArr3;
                        i26 = i10;
                        i27 = i11;
                        i29 = iM4502113 ^ 1909672945;
                        i28 = i9;
                        dialogInterfaceC19359 = dialogInterfaceC19356;
                        sArr7 = sArr;
                        i25 = i8;
                        i23 = i7;
                        str5 = str3;
                        short[] sArr119 = sArr2;
                        i24 = i6;
                        sArr6 = sArr119;
                    }
                    break;
                case 1026308984:
                case 1826830098:
                    i5 = i23;
                    i = i25;
                    sArr = sArr7;
                    dialogInterfaceC19356 = dialogInterfaceC19359;
                    int i51 = i24;
                    sArr2 = sArr6;
                    i6 = i51;
                    View viewM10958 = C3743.m10957(view, iM450213 ^ 2099645878);
                    C1937.m6286(viewM10958, str5);
                    textInputLayout = (TextInputLayout) viewM10958;
                    viewOnClickListenerC19680.f63183 = textInputLayout;
                    editTextM3740 = C0962.m3740(textInputLayout2);
                    C0629.m2908(editTextM3740);
                    EditText editTextM3741 = C0962.m3740(textInputLayout);
                    C0629.m2908(editTextM3741);
                    MenuItemOnMenuItemClickListenerC3244.m9704(editTextM3740, str);
                    C1461.m5083(editTextM3741, str2);
                    if (C0671.m3008() >= 0) {
                        editText2 = editTextM3741;
                        iM450210 = C19806.m45029("ܶܶ") ^ i20;
                        i12 = ((iM450210 ^ i19) * 30789) ^ 100184153;
                        i13 = 1104031823;
                        int i412 = iM450210 ^ i13;
                        i23 = i5;
                        i28 = i12;
                        i29 = i412;
                    } else {
                        int iM450223 = (i20 - C19806.m45029("ܶۜ")) * 23;
                        editText2 = editTextM3741;
                        int i52 = ((iM450223 ^ i19) * 12427) ^ (-150760151);
                        i29 = iM450223 ^ (-118173179);
                        i23 = i5;
                        i28 = i52;
                    }
                    dialogInterfaceC19359 = dialogInterfaceC19356;
                    sArr7 = sArr;
                    i25 = i;
                    short[] sArr1110 = sArr2;
                    i24 = i6;
                    sArr6 = sArr1110;
                    break;
                default:
                    if (!C0817.f3443) {
                        editText = editText2;
                        i = i25;
                        sArr = sArr7;
                        dialogInterfaceC19356 = dialogInterfaceC19359;
                        iM11306 = (ThreadFactoryC3888.m11306("ۘܿ") + i19) * 101;
                        i28 = ((iM11306 ^ i20) * (-12093)) ^ 380187077;
                        i3 = 1839194616;
                        i4 = iM11306 ^ i3;
                        editText2 = editText;
                        i29 = i4;
                        dialogInterfaceC19359 = dialogInterfaceC19356;
                        sArr7 = sArr;
                        i25 = i;
                    } else {
                        iM45029 = (C19806.m45029("֡ܽ") + i19) * 45;
                        i28 = ((iM45029 ^ i20) * (-8539)) ^ 165204225;
                        i2 = -1958287038;
                        i29 = iM45029 ^ i2;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m44816(ViewOnClickListenerC19680 viewOnClickListenerC19680) {
        int i = -308904185;
        int i2 = C1398.f5802;
        int i3 = C3577.f13150;
        int iM45029 = C19806.m45029("ܳܶ") ^ i2;
        int i4 = ((iM45029 ^ i3) * 14513) ^ (-119917095);
        int i5 = 560534626;
        while (true) {
            i = ((((i ^ i3) * 27313) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2017404853:
                case -1759186756:
                    if (C1189.f5284 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗۘ") + i2) * 97;
                        i4 = ((iM45029 ^ i3) * 22667) ^ 840462377;
                        i5 = -1802190403;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۬᩵") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-7725)) ^ 1823904122;
                        i5 = -787781683;
                    }
                    break;
                case -1787852663:
                case -720210155:
                    C2124.m6673();
                    if (C1025.f4800 < 0) {
                        iM45029 = (C19806.m45029("ۧ۫") + i3) * 55;
                        i4 = ((iM45029 ^ i2) * 11555) ^ (-946254349);
                        i5 = -714324883;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۗۘ") + i2) * 97;
                        i4 = ((iM45029 ^ i3) * 22667) ^ 840462377;
                        i5 = -1802190403;
                    }
                    break;
                case -1557490107:
                case -943151709:
                    C0797.m3359();
                    if (!C19806.m45024()) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۖۢ")) * (-65);
                        i4 = ((iM45029 ^ i2) * (-26533)) ^ (-1065321076);
                        i5 = 2118473200;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۬᩵") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-7725)) ^ 1823904122;
                        i5 = -787781683;
                    }
                    break;
                case -1543023464:
                case 175949820:
                    if (!C0526.f2219) {
                        if (ViewGroupOnHierarchyChangeListenerC1916.f7262 && C0817.f3443 && RunnableC0195.m1431()) {
                            if (!RunnableC1564.m5345()) {
                                if (C2871.m8646()) {
                                    if (C2477.m7593() < 0) {
                                        if (RunnableC0195.f1321 < 0) {
                                            if (RunnableC3388.f12514 < 0) {
                                                AbstractActivityC12483 abstractActivityC12483 = viewOnClickListenerC19680.f63184;
                                                if (C2788.f10625 < 0) {
                                                    C3286.m9800(abstractActivityC12483, new Intent(abstractActivityC12483, (Class<?>) ViewOnClickListenerC23604.class));
                                                }
                                                break;
                                            }
                                        }
                                    }
                                }
                                iM45029 = (C19806.m45029("ۧ۫") + i3) * 55;
                                i4 = ((iM45029 ^ i2) * 11555) ^ (-946254349);
                                i5 = -714324883;
                                break;
                            }
                            iM45029 = (C19806.m45029("᩹ᩳ") ^ i2) * 75;
                            i4 = ((iM45029 ^ i3) * (-21995)) ^ (-2015838134);
                            i5 = 1250195128;
                            break;
                        }
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۖۢ")) * (-65);
                        i4 = ((iM45029 ^ i2) * (-26533)) ^ (-1065321076);
                        i5 = 2118473200;
                        break;
                    }
                    iM45029 = (ThreadFactoryC3888.m11306("ۗۘ") + i2) * 97;
                    i4 = ((iM45029 ^ i3) * 22667) ^ 840462377;
                    i5 = -1802190403;
                    break;
                case -866327735:
                case 1589876713:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    C1668.m5583();
                    break;
                default:
                    C19806.m45024();
                    C3535.m10431();
                    iM45029 = (i3 - ThreadFactoryC3888.m11306("ۖۢ")) * (-65);
                    i4 = ((iM45029 ^ i2) * (-26533)) ^ (-1065321076);
                    i5 = 2118473200;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC19680(AbstractActivityC12483 abstractActivityC12483) {
        this(abstractActivityC12483, null);
        int i = -180974086;
        int i2 = C2477.f9839;
        int i3 = C10634.f36300;
        short s = f63180[0];
        int i4 = s + 9572;
        int i5 = (s * s) + 91623184;
        CallableC1627.m5508(abstractActivityC12483, RunnableC0195.m1429(f63180, 1, 8, (i4 * i4) - (i5 + i5) <= 0 ? 51561 : 28931));
        int iM11306 = ThreadFactoryC3888.m11306("ۛۛ") ^ i2;
        int i6 = ((iM11306 ^ i3) * (-32503)) ^ 1089876405;
        int i7 = -338955911;
        while (true) {
            i = ((((i ^ i3) * 14127) >> 31) & i6) ^ (iM11306 ^ i7);
            switch (i) {
                case -2067620970:
                case 235883754:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (RunnableC1564.f6300) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶᩶") ^ i2;
                        i6 = ((iM11306 ^ i3) * 27265) ^ 860458098;
                        i7 = 906489762;
                    } else {
                        iM11306 = C19806.m45029("ܰۖ") ^ i2;
                        i6 = ((iM11306 ^ i3) * (-18255)) ^ (-1112447250);
                        i7 = -66469234;
                    }
                    break;
                case -1980067628:
                case 1495394310:
                    return;
                case -1942478394:
                case 1668409371:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩶᩶") ^ i2;
                        i6 = ((iM11306 ^ i3) * 27265) ^ 860458098;
                        i7 = 906489762;
                    } else {
                        iM11306 = C19806.m45029("ܶۚ") ^ i3;
                        i6 = ((iM11306 ^ i2) * 15087) ^ (-2043661234);
                        i7 = 319050393;
                    }
                    break;
                case -1750439737:
                case 2079575166:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    throw new RuntimeException();
                case -1409267562:
                case 1360039127:
                    RunnableC1606.m5473();
                    iM11306 = ThreadFactoryC3888.m11306("ۚۗ") ^ i2;
                    i6 = ((iM11306 ^ i3) * 11833) ^ 1119499585;
                    i7 = 197267885;
                    break;
                case 1177921420:
                case 1682522939:
                    if (C1398.f5802 > 0) {
                        iM11306 = C19806.m45029("ܶۚ") ^ i3;
                        i6 = ((iM11306 ^ i2) * 15087) ^ (-2043661234);
                        i7 = 319050393;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚۗ") ^ i2;
                        i6 = ((iM11306 ^ i3) * 11833) ^ 1119499585;
                        i7 = 197267885;
                    }
                    break;
                default:
                    if (C1066.m4023() <= 0) {
                        iM11306 = C19806.m45029("ۨ᩷") ^ i3;
                        i6 = ((iM11306 ^ i2) * (-26777)) ^ 401942394;
                        i7 = 1002870642;
                    } else {
                        iM11306 = (C19806.m45029("ᩴ᩺") + i3) * 109;
                        i6 = ((iM11306 ^ i2) * 3857) ^ (-1698305423);
                        i7 = -545425335;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ViewOnClickListenerC19680(AbstractActivityC12483 abstractActivityC12483, DialogInterfaceOnCancelListenerC13288 dialogInterfaceOnCancelListenerC13288) {
        int i = -1915582649;
        int i2 = C2642.f10294;
        int i3 = C1460.f5948;
        short s = f63180[62];
        int i4 = ((s * s) + 158785201) - (s * 25202) >= 0 ? 27132 : 55696;
        CallableC1627.m5508(abstractActivityC12483, C1419.m4969(f63180, 63, 8, i4));
        this(abstractActivityC12483, RunnableC0195.m1433(ApplicationC0716.f2992, C2871.m8640(f63180, 71, 9, i4), null), "", dialogInterfaceOnCancelListenerC13288);
        int iM45029 = (C19806.m45029("۟ۖ") + i2) * 99;
        int i5 = ((iM45029 ^ i3) * (-17723)) ^ 728944505;
        int i6 = 258395908;
        while (true) {
            i = (iM45029 ^ i6) ^ (i5 & (((i ^ i3) * (-4931)) >> 31));
            switch (i) {
                case -1005446148:
                case -147107192:
                    return;
                case -233685689:
                case -231521517:
                    C0962.m3746();
                    if (C1460.m5050() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֡᩹") + i3) * (-61);
                        i5 = ((iM45029 ^ i2) * (-77)) ^ 23381483;
                        i6 = -669481624;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨۙ") ^ i2;
                        i5 = ((iM45029 ^ i3) * 15857) ^ 1101492008;
                        i6 = 352357320;
                    }
                    break;
                case 177941763:
                case 980382598:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("֡᩹") + i3) * (-61);
                        i5 = ((iM45029 ^ i2) * (-77)) ^ 23381483;
                        i6 = -669481624;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖۜ") + i2) * (-63);
                        i5 = ((iM45029 ^ i3) * 5957) ^ (-1002919153);
                        i6 = 1153577874;
                    }
                    break;
                case 248903575:
                case 907249559:
                    if (RunnableC3388.f12514 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧ֫") + i3) * 123;
                        i5 = ((iM45029 ^ i2) * 3835) ^ (-1077808712);
                        i6 = 1695057197;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ܺ֡")) * (-117);
                        i5 = ((iM45029 ^ i3) * (-15455)) ^ (-1417397325);
                        i6 = 2036419161;
                    }
                    break;
                case 1061279379:
                case 2084906642:
                    C19806.m45024();
                    iM45029 = (ThreadFactoryC3888.m11306("ۤܽ") ^ i3) * 85;
                    i5 = ((iM45029 ^ i2) * (-28193)) ^ 1817242470;
                    i6 = -1942046949;
                    break;
                case 1809275161:
                case 2120926690:
                    if (C1419.f5860 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖۜ") + i2) * (-63);
                        i5 = ((iM45029 ^ i3) * 5957) ^ (-1002919153);
                        i6 = 1153577874;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤܽ") ^ i3) * 85;
                        i5 = ((iM45029 ^ i2) * (-28193)) ^ 1817242470;
                        i6 = -1942046949;
                    }
                    break;
                default:
                    C0278.m1789();
                    C19806.m45024();
                    throw new RuntimeException();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m44812(C21796 c21796, ViewOnClickListenerC19680 viewOnClickListenerC19680, int i, KeyEvent keyEvent) {
        short s = 0;
        int i2 = 0;
        int i3 = 0;
        short[] sArr = null;
        int i4 = 0;
        int i5 = 0;
        int i6 = 676515118;
        int i7 = C1419.f5860;
        int i8 = ThreadFactoryC3888.f14547;
        int iM45029 = (C19806.m45029("ۛܳ") + i7) * (-19);
        int i9 = ((iM45029 ^ i8) * 5121) ^ (-1914128103);
        int i10 = -1119940280;
        while (true) {
            i6 = ((((i6 ^ i8) * (-6409)) >> 31) & i9) ^ (iM45029 ^ i10);
            switch (i6) {
                case -1948888178:
                case -271964009:
                    if (C1461.f5957 <= 0) {
                        iM45029 = (C19806.m45029("᩸֨") ^ i8) * (-39);
                        i9 = ((iM45029 ^ i7) * 2255) ^ (-131667679);
                        i10 = 487536130;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֨ۗ") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-16741)) ^ 64761624;
                        i10 = 687588522;
                    }
                    break;
                case -1741558782:
                case 359062101:
                    if (C7105.f23796 >= 0) {
                        iM45029 = (C19806.m45029("ۙ۫") + i7) * (-57);
                        i9 = ((iM45029 ^ i8) * 5149) ^ (-1421138266);
                        i10 = 811961354;
                    } else {
                        iM45029 = C19806.m45029("ᩴ֨") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-9733)) ^ 1796002331;
                        i10 = -789644454;
                    }
                    break;
                case -1413697617:
                case 1534696450:
                    i3 = 37916;
                    iM45029 = ThreadFactoryC3888.m11306("ܿ۫") ^ i8;
                    i9 = ((iM45029 ^ i7) * (-8699)) ^ (-1987886850);
                    i10 = 2050184226;
                    break;
                case -1304592187:
                case -901112298:
                    if (!C0962.f3784) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚᩳ") ^ i7) * (-101);
                        i9 = ((iM45029 ^ i8) * (-30201)) ^ 220224161;
                        i10 = 1221260977;
                    } else {
                        iM45029 = C19806.m45029("ۛۖ") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-30655)) ^ (-1675553116);
                        i10 = 1056517111;
                    }
                    break;
                case -1077721215:
                case 88984468:
                    if (C2871.m8646()) {
                        iM45029 = C19806.m45029("ܽۚ") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-16609)) ^ 2071381595;
                        i10 = 1799517761;
                    } else {
                        iM45029 = (C19806.m45029("᩷ᩴ") + i7) * 81;
                        i9 = ((iM45029 ^ i8) * 24949) ^ 793267241;
                        i10 = -17639169;
                    }
                    break;
                case -894999748:
                case 2120568590:
                    i3 = 18389;
                    iM45029 = ThreadFactoryC3888.m11306("ܿ۫") ^ i8;
                    i9 = ((iM45029 ^ i7) * (-8699)) ^ (-1987886850);
                    i10 = 2050184226;
                    break;
                case -637982938:
                case 157767608:
                    C2704.m8238(keyEvent, C0050.m940(sArr, i4, i5, i3));
                    if (keyEvent.getAction() == 0) {
                        iM45029 = (C19806.m45029("۟֫") + i8) * (-79);
                        i9 = ((iM45029 ^ i7) * (-25715)) ^ (-476346112);
                        i10 = 344962626;
                    } else {
                        iM45029 = (C19806.m45029("ۢ۫") + i8) * 57;
                        i9 = ((iM45029 ^ i7) * (-12439)) ^ (-529798915);
                        i10 = 1407562410;
                    }
                    break;
                case -81952711:
                case 249589148:
                    if (i2 - (s * 28662) >= 0) {
                        iM45029 = C19806.m45029("ܺۙ") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-29465)) ^ (-1417219094);
                        i10 = -1898351705;
                    } else {
                        iM45029 = (i7 - C19806.m45029("ᩴ۟")) * 71;
                        i9 = ((iM45029 ^ i8) * (-13129)) ^ (-1694723943);
                        i10 = 1075316391;
                    }
                    break;
                case -11638272:
                case 1521746002:
                    C0797.m3359();
                    RunnableC1564.m5345();
                    iM45029 = C19806.m45029("ۛۖ") ^ i8;
                    i9 = ((iM45029 ^ i7) * (-30655)) ^ (-1675553116);
                    i10 = 1056517111;
                    break;
                case 40503393:
                case 1884362334:
                    i2 = (s * s) + 205377561;
                    if (C0216.f1393 != 0) {
                        iM45029 = (C19806.m45029("᩸֨") ^ i8) * (-39);
                        i9 = ((iM45029 ^ i7) * 2255) ^ (-131667679);
                        i10 = 487536130;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤۤ") ^ i8;
                        i9 = ((iM45029 ^ i7) * 12631) ^ (-650587913);
                        i10 = -1384196419;
                    }
                    break;
                case 56095735:
                case 802232165:
                    s = f63180[126];
                    if (C3577.m10565()) {
                        iM45029 = (C19806.m45029("ܺܽ") + i7) * (-21);
                        i9 = ((iM45029 ^ i8) * (-32351)) ^ (-1172288412);
                        i10 = 161306145;
                    } else {
                        iM45029 = (C19806.m45029("᩷ᩴ") + i7) * 81;
                        i9 = ((iM45029 ^ i8) * 24949) ^ 793267241;
                        i10 = -17639169;
                    }
                    break;
                case 97356297:
                case 969732581:
                    c21796.m48556();
                    viewOnClickListenerC19680.m44815();
                    return true;
                case 166616168:
                case 1364789979:
                    if (C1025.f4800 >= 0) {
                        iM45029 = (C19806.m45029("᩸֨") ^ i8) * (-39);
                        i9 = ((iM45029 ^ i7) * 2255) ^ (-131667679);
                        i10 = 487536130;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿ᩸") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-2509)) ^ (-115307108);
                        i10 = 980081396;
                    }
                    break;
                case 238465426:
                case 2123954305:
                    if (C1461.f5957 <= 0) {
                        iM45029 = (C19806.m45029("ۙ۫") + i7) * (-57);
                        i9 = ((iM45029 ^ i8) * 5149) ^ (-1421138266);
                        i10 = 811961354;
                    } else {
                        iM45029 = (i8 - ThreadFactoryC3888.m11306("ܿۚ")) * 99;
                        i9 = ((iM45029 ^ i7) * (-11687)) ^ 699055435;
                        i10 = 1207291294;
                    }
                    break;
                case 401034382:
                case 1717316472:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = (C19806.m45029("ۙ۫") + i7) * (-57);
                        i9 = ((iM45029 ^ i8) * 5149) ^ (-1421138266);
                        i10 = 811961354;
                    } else {
                        iM45029 = C19806.m45029("ۛۖ") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-30655)) ^ (-1675553116);
                        i10 = 1056517111;
                    }
                    break;
                case 401827177:
                case 1754954408:
                    C1025.m3861();
                    return false;
                case 509869118:
                case 1025579896:
                    if (C2642.f10294 <= 0) {
                        iM45029 = (C19806.m45029("ۙ۫") + i7) * (-57);
                        i9 = ((iM45029 ^ i8) * 5149) ^ (-1421138266);
                        i10 = 811961354;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳۗ") ^ i8) * (-35);
                        i9 = ((iM45029 ^ i7) * 16447) ^ 913315911;
                        i10 = 1559177554;
                    }
                    break;
                case 743455146:
                case 985378286:
                    sArr = f63180;
                    i4 = 127;
                    i5 = 5;
                    if (C3660.f13403 >= 0) {
                        iM45029 = C19806.m45029("ۛۖ") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-30655)) ^ (-1675553116);
                        i10 = 1056517111;
                    } else {
                        iM45029 = C19806.m45029("۠ۢ") ^ i7;
                        i9 = ((iM45029 ^ i8) * 13357) ^ 136480850;
                        i10 = -590904640;
                    }
                    break;
                case 837104915:
                case 1814625426:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚᩳ") ^ i7) * (-101);
                        i9 = ((iM45029 ^ i8) * (-30201)) ^ 220224161;
                        i10 = 1221260977;
                    } else {
                        iM45029 = C19806.m45029("ۖۜ") ^ i7;
                        i9 = ((iM45029 ^ i8) * 21999) ^ (-1197634437);
                        i10 = -598831148;
                    }
                    break;
                case 1449290216:
                case 1598593470:
                    if (C0216.f1393 != 0) {
                        iM45029 = (C19806.m45029("᩸֨") ^ i8) * (-39);
                        i9 = ((iM45029 ^ i7) * 2255) ^ (-131667679);
                        i10 = 487536130;
                    } else {
                        iM45029 = C19806.m45029("ۛۖ") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-30655)) ^ (-1675553116);
                        i10 = 1056517111;
                    }
                    break;
                case 1874818447:
                case 2039146629:
                    return false;
                default:
                    if (i == 4) {
                        iM45029 = ThreadFactoryC3888.m11306("۬֫") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-27437)) ^ 299462015;
                        i10 = -328457056;
                    } else {
                        iM45029 = (C19806.m45029("ۢ۫") + i8) * 57;
                        i9 = ((iM45029 ^ i7) * (-12439)) ^ (-529798915);
                        i10 = 1407562410;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:55:0x01e7 A[PHI: r3 r7 r15 r16 r17
      0x01e7: PHI (r3v7 boolean) = (r3v2 boolean), (r3v3 boolean), (r3v2 boolean), (r3v2 boolean), (r3v2 boolean) binds: [B:54:0x01e5, B:39:0x0143, B:27:0x00c9, B:12:0x0075, B:86:0x01e7] A[DONT_GENERATE, DONT_INLINE]
      0x01e7: PHI (r7v8 java.lang.String) = 
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
      (r7v4 java.lang.String)
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
     binds: [B:54:0x01e5, B:39:0x0143, B:27:0x00c9, B:12:0x0075, B:86:0x01e7] A[DONT_GENERATE, DONT_INLINE]
      0x01e7: PHI (r15v7 int) = (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:54:0x01e5, B:39:0x0143, B:27:0x00c9, B:12:0x0075, B:86:0x01e7] A[DONT_GENERATE, DONT_INLINE]
      0x01e7: PHI (r16v7 int) = (r16v3 int), (r16v2 int), (r16v2 int), (r16v2 int), (r16v2 int) binds: [B:54:0x01e5, B:39:0x0143, B:27:0x00c9, B:12:0x0075, B:86:0x01e7] A[DONT_GENERATE, DONT_INLINE]
      0x01e7: PHI (r17v7 int) = (r17v3 int), (r17v2 int), (r17v2 int), (r17v2 int), (r17v2 int) binds: [B:54:0x01e5, B:39:0x0143, B:27:0x00c9, B:12:0x0075, B:86:0x01e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0075, code lost:
    
        if (l.C3660.f13403 >= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007d, code lost:
    
        if (l.MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) goto L36;
     */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m44815() {
        /*
            Method dump skipped, instruction units count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC19680.m44815():void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44817() {
        this.f63185 = true;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x03cb A[PHI: r15 r24 r28 r29 r30
      0x03cb: PHI (r15v4 int) = (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:84:0x03c9, B:70:0x0306, B:20:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x03cb: PHI (r24v24 l.۠ۡۜ) = (r24v17 l.۠ۡۜ), (r24v2 l.۠ۡۜ), (r24v2 l.۠ۡۜ) binds: [B:84:0x03c9, B:70:0x0306, B:20:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x03cb: PHI (r28v56 short[]) = (r28v29 short[]), (r28v32 short[]), (r28v57 short[]) binds: [B:84:0x03c9, B:70:0x0306, B:20:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x03cb: PHI (r29v3 int) = (r29v2 int), (r29v1 int), (r29v1 int) binds: [B:84:0x03c9, B:70:0x0306, B:20:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x03cb: PHI (r30v30 com.google.android.material.textfield.TextInputLayout) = 
      (r30v18 com.google.android.material.textfield.TextInputLayout)
      (r30v21 com.google.android.material.textfield.TextInputLayout)
      (r30v31 com.google.android.material.textfield.TextInputLayout)
     binds: [B:84:0x03c9, B:70:0x0306, B:20:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44811(final ViewOnClickListenerC19680 viewOnClickListenerC19680, String str, C1313 c1313) {
        short[] sArr;
        short[] sArr2;
        int i;
        C8067 c8067;
        int i2;
        int i3;
        int iM11306;
        int i4;
        int iM11307;
        int i5;
        int i6;
        int iM45029;
        int i7;
        int i8;
        int iM11308;
        int i9;
        int i10;
        TextInputLayout textInputLayout;
        short[] sArr3;
        C8067 c8068;
        int iM450210;
        int i11;
        int i12;
        TextInputLayout textInputLayout2;
        int iM450211;
        int i13;
        short[] sArr4;
        int iM11309;
        int i14;
        int i15;
        int i16;
        viewOnClickListenerC19680 = viewOnClickListenerC19680;
        int i17 = -1766223192;
        int i18 = C3722.f13525;
        int i19 = RunnableC3388.f12514;
        int iM450212 = C19806.m45029("ۛ᩷") ^ i19;
        int i20 = ((iM450212 ^ i18) * (-23001)) ^ (-1695551631);
        int i21 = iM450212 ^ (-1982375105);
        AbstractActivityC12483 abstractActivityC12483 = null;
        Runnable runnable = null;
        C8067 c8067M3751 = null;
        C8067 c8067M5356 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        TextInputLayout textInputLayout3 = null;
        int i22 = 0;
        int iM450213 = 0;
        int iM6174 = 0;
        int i23 = 0;
        int i24 = 0;
        int iM450214 = 0;
        int i25 = 0;
        int iM450215 = 0;
        int iM113010 = 0;
        int i26 = 0;
        boolean zM3738 = false;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int iM450216 = 0;
        short s = 0;
        while (true) {
            i17 = i21 ^ (i20 & (((i17 ^ i18) * 4133) >> 31));
            switch (i17) {
                case -2138368516:
                case 1323030163:
                    textInputLayout2 = textInputLayout3;
                    sArr6 = sArr6;
                    c8067M3751 = C0962.m3751(abstractActivityC12483);
                    iM450216 = C19806.m45029(C1977.m6363(f63180, 99, 3, i22));
                    i25 = 2100946299;
                    if (C2477.f9839 <= 0) {
                        iM450211 = ThreadFactoryC3888.m11306("ۗ᩷") ^ i19;
                        i7 = ((iM450211 ^ i18) * 4343) ^ (-1612592901);
                        i13 = 1986559273;
                    } else {
                        iM450211 = (i19 - C19806.m45029("ۧ᩹")) * 71;
                        i7 = ((iM450211 ^ i18) * 22761) ^ (-464551359);
                        i13 = -1309277371;
                    }
                    i16 = iM450211 ^ i13;
                    textInputLayout3 = textInputLayout2;
                    sArr4 = sArr6;
                    i21 = i16;
                    i20 = i7;
                    sArr6 = sArr4;
                    break;
                case -2128000218:
                case -243408555:
                    sArr6 = sArr6;
                    if (viewOnClickListenerC19680.f63185) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡܶ") ^ i19;
                        i7 = ((iM45029 ^ i18) * 3265) ^ 1387458784;
                        i8 = 1841434677;
                    } else {
                        iM45029 = (C19806.m45029("ۘۧ") + i18) * 5;
                        i7 = ((iM45029 ^ i19) * 9047) ^ 105404423;
                        i8 = -860668510;
                    }
                    i16 = iM45029 ^ i8;
                    sArr4 = sArr6;
                    i21 = i16;
                    i20 = i7;
                    sArr6 = sArr4;
                    break;
                case -1995746928:
                case -1280501730:
                    ThreadFactoryC3888.m11300();
                    if (C2332.m7079() <= 0) {
                        iM11309 = (ThreadFactoryC3888.m11306("ܽۙ") + i19) * (-15);
                        i14 = ((iM11309 ^ i18) * 17437) ^ (-1523403558);
                        i15 = 89338054;
                        i21 = iM11309 ^ i15;
                        i20 = i14;
                    } else {
                        textInputLayout2 = textInputLayout3;
                        sArr6 = sArr6;
                        iM450211 = (ThreadFactoryC3888.m11306("۫ܺ") + i18) * (-45);
                        i7 = ((iM450211 ^ i19) * 26455) ^ 1933188128;
                        i13 = -1838412586;
                        i16 = iM450211 ^ i13;
                        textInputLayout3 = textInputLayout2;
                        sArr4 = sArr6;
                        i21 = i16;
                        i20 = i7;
                        sArr6 = sArr4;
                    }
                    break;
                case -1963299130:
                case 824790262:
                    C15829.m37614(C0526.m2431(c1313, i23));
                    break;
                case -1856388213:
                case -670589111:
                    textInputLayout2 = textInputLayout3;
                    sArr6 = sArr6;
                    C1189.m4360(iM450215 ^ 2099283270);
                    if (C0278.f1572 <= 0) {
                        iM450211 = ThreadFactoryC3888.m11306("ۗ᩷") ^ i19;
                        i7 = ((iM450211 ^ i18) * 4343) ^ (-1612592901);
                        i13 = 1986559273;
                    } else {
                        iM450211 = C19806.m45029("ܰ֨") ^ i19;
                        i7 = ((iM450211 ^ i18) * (-25407)) ^ 910613993;
                        i13 = 1756007275;
                    }
                    i16 = iM450211 ^ i13;
                    textInputLayout3 = textInputLayout2;
                    sArr4 = sArr6;
                    i21 = i16;
                    i20 = i7;
                    sArr6 = sArr4;
                    break;
                case -1719208293:
                case 1434594505:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    C1025.m3861();
                    break;
                case -1567404996:
                case 1705846542:
                    C3743.m10954(textInputLayout3, C19806.m45029(RunnableC3388.m10056(f63180, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 3, i22)) ^ 2127004931);
                    break;
                case -1555858045:
                case 933163931:
                    C1066.m4025(c8067M5356, ThreadFactoryC3888.m11306(C1398.m4892(sArr6, i24, 3, i22)) ^ 2124953778, runnable);
                    C2704.m8239(c8067M5356);
                    textInputLayout2 = textInputLayout3;
                    sArr6 = sArr6;
                    iM450211 = (C19806.m45029("ᩳ᩶") ^ i18) * (-69);
                    i7 = ((iM450211 ^ i19) * 11873) ^ 1661446511;
                    i13 = 1678211589;
                    i16 = iM450211 ^ i13;
                    textInputLayout3 = textInputLayout2;
                    sArr4 = sArr6;
                    i21 = i16;
                    i20 = i7;
                    sArr6 = sArr4;
                    break;
                case -1460819332:
                case 979627205:
                    i2 = i29;
                    i22 = 23015;
                    iM11306 = C19806.m45029("ۗ۠") ^ i19;
                    i20 = ((iM11306 ^ i18) * 27699) ^ 634627465;
                    i4 = 1234451334;
                    i3 = iM11306 ^ i4;
                    sArr5 = sArr5;
                    c8067M3751 = c8067M3751;
                    sArr6 = sArr6;
                    textInputLayout3 = textInputLayout3;
                    i21 = i3;
                    i28 = i28;
                    int i30 = i27;
                    i29 = i2;
                    i27 = i30;
                    break;
                case -1393579216:
                case 565471149:
                    sArr6 = sArr6;
                    if (iM6174 != 1101) {
                        iM45029 = C19806.m45029("֫ܰ") ^ i19;
                        i7 = ((iM45029 ^ i18) * (-955)) ^ (-1245535452);
                        i8 = -950923698;
                    } else {
                        iM45029 = (i18 - C19806.m45029("ۜܶ")) * (-7);
                        i7 = ((iM45029 ^ i19) * (-9355)) ^ (-532658567);
                        i8 = -1673569522;
                    }
                    i16 = iM45029 ^ i8;
                    sArr4 = sArr6;
                    i21 = i16;
                    i20 = i7;
                    sArr6 = sArr4;
                    break;
                case -1351875711:
                case -543646579:
                    C0278.m1789();
                    C2871.m8646();
                    sArr = sArr6;
                    sArr2 = sArr5;
                    i28 = i28;
                    i = i29;
                    c8067 = c8067M3751;
                    i27 = i27;
                    int iM113011 = (i18 - ThreadFactoryC3888.m11306("ܺۜ")) * 51;
                    int i31 = ((iM113011 ^ i19) * 29157) ^ 1641573633;
                    sArr5 = sArr2;
                    c8067M3751 = c8067;
                    sArr6 = sArr;
                    i28 = i28;
                    i21 = iM113011 ^ (-294529037);
                    i27 = i27;
                    i29 = i;
                    i20 = i31;
                    viewOnClickListenerC19680 = viewOnClickListenerC19680;
                    break;
                case -1278923592:
                case 1436137413:
                    C0050.m933(c8067M5356, iM450214);
                    sArr6 = sArr6;
                    iM113010 = ThreadFactoryC3888.m11306(MenuItemOnMenuItemClickListenerC3244.m9715(f63180, 114, 3, i22));
                    i26 = 2097236236;
                    if (C1025.f4800 >= 0) {
                        iM45029 = (C19806.m45029("ܽܰ") ^ i18) * 101;
                        i7 = ((iM45029 ^ i19) * 3091) ^ (-2135978248);
                        i8 = 1107524957;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽۘ") + i19) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i7 = ((iM45029 ^ i18) * (-19449)) ^ 684707295;
                        i8 = -100084534;
                    }
                    i16 = iM45029 ^ i8;
                    sArr4 = sArr6;
                    i21 = i16;
                    i20 = i7;
                    sArr6 = sArr4;
                    break;
                case -1195935347:
                case 1318786874:
                    if (!CallableC1627.f6528) {
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        i28 = i28;
                        c8067M3751 = c8067M3751;
                        int i32 = i29;
                        i27 = i27;
                        i2 = i32;
                        iM11306 = C19806.m45029("ۗ᩻") ^ i19;
                        i20 = ((iM11306 ^ i18) * (-11925)) ^ 1154308103;
                        i4 = 1100514230;
                        i3 = iM11306 ^ i4;
                        sArr5 = sArr5;
                        c8067M3751 = c8067M3751;
                        sArr6 = sArr6;
                        textInputLayout3 = textInputLayout3;
                        i21 = i3;
                        i28 = i28;
                        int i33 = i27;
                        i29 = i2;
                        i27 = i33;
                    } else {
                        textInputLayout3 = textInputLayout3;
                        i28 = i28;
                        c8067M3751 = c8067M3751;
                        int iM113012 = (ThreadFactoryC3888.m11306("ܽۢ") ^ i18) * 55;
                        i20 = ((iM113012 ^ i19) * (-15465)) ^ 1833880012;
                        i21 = iM113012 ^ 38178643;
                        viewOnClickListenerC19680 = viewOnClickListenerC19680;
                        c8067M3751 = c8067M3751;
                        textInputLayout3 = textInputLayout3;
                        i28 = i28;
                    }
                    break;
                case -1194668478:
                case 399983740:
                    textInputLayout3 = textInputLayout3;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    i28 = i28;
                    c8067M3751 = c8067M3751;
                    int i34 = i29;
                    i27 = i27;
                    i2 = i34;
                    s = f63180[86];
                    if (C1148.f5161 <= 0) {
                        iM11306 = C19806.m45029("ۗ᩻") ^ i19;
                        i20 = ((iM11306 ^ i18) * (-11925)) ^ 1154308103;
                        i4 = 1100514230;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽ᩹") ^ i19;
                        i20 = ((iM11306 ^ i18) * 21597) ^ 1398780915;
                        i4 = -1928617142;
                    }
                    i3 = iM11306 ^ i4;
                    sArr5 = sArr5;
                    c8067M3751 = c8067M3751;
                    sArr6 = sArr6;
                    textInputLayout3 = textInputLayout3;
                    i21 = i3;
                    i28 = i28;
                    int i35 = i27;
                    i29 = i2;
                    i27 = i35;
                    break;
                case -1170217023:
                case 1844988243:
                    textInputLayout2 = textInputLayout3;
                    sArr6 = sArr6;
                    iM450215 = C19806.m45029(C1066.m4040(f63180, IShizukuService.Stub.TRANSACTION_attachUserService, 3, i22));
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM450211 = (ThreadFactoryC3888.m11306("۫ܺ") + i18) * (-45);
                        i7 = ((iM450211 ^ i19) * 26455) ^ 1933188128;
                        i13 = -1838412586;
                    } else {
                        iM450211 = (C19806.m45029("֫ᩴ") ^ i18) * 93;
                        i7 = ((iM450211 ^ i19) * (-26715)) ^ (-912782566);
                        i13 = 1193664014;
                    }
                    i16 = iM450211 ^ i13;
                    textInputLayout3 = textInputLayout2;
                    sArr4 = sArr6;
                    i21 = i16;
                    i20 = i7;
                    sArr6 = sArr4;
                    break;
                case -1093767650:
                case -395812330:
                    if (!C2871.m8646()) {
                        textInputLayout2 = textInputLayout3;
                        sArr6 = sArr6;
                        iM450211 = (ThreadFactoryC3888.m11306("۫ܺ") + i18) * (-45);
                        i7 = ((iM450211 ^ i19) * 26455) ^ 1933188128;
                        i13 = -1838412586;
                        i16 = iM450211 ^ i13;
                        textInputLayout3 = textInputLayout2;
                        sArr4 = sArr6;
                        i21 = i16;
                        i20 = i7;
                        sArr6 = sArr4;
                    } else {
                        sArr = sArr6;
                        sArr2 = sArr5;
                        i28 = i28;
                        i = i29;
                        c8067 = c8067M3751;
                        i27 = i27;
                        int iM113013 = (i18 - ThreadFactoryC3888.m11306("ܺۜ")) * 51;
                        int i36 = ((iM113013 ^ i19) * 29157) ^ 1641573633;
                        sArr5 = sArr2;
                        c8067M3751 = c8067;
                        sArr6 = sArr;
                        i28 = i28;
                        i21 = iM113013 ^ (-294529037);
                        i27 = i27;
                        i29 = i;
                        i20 = i36;
                        viewOnClickListenerC19680 = viewOnClickListenerC19680;
                    }
                    break;
                case -1091579950:
                case -317037372:
                    textInputLayout2 = textInputLayout3;
                    sArr6 = sArr6;
                    if (iM6174 != 1001) {
                        iM450211 = ThreadFactoryC3888.m11306("֫۠") ^ i19;
                        i7 = ((iM450211 ^ i18) * 2511) ^ (-2140270963);
                        i13 = 854584346;
                    } else {
                        iM450211 = C19806.m45029("ۗ֡") ^ i18;
                        i7 = ((iM450211 ^ i19) * 7541) ^ 1075112155;
                        i13 = -128069409;
                    }
                    i16 = iM450211 ^ i13;
                    textInputLayout3 = textInputLayout2;
                    sArr4 = sArr6;
                    i21 = i16;
                    i20 = i7;
                    sArr6 = sArr4;
                    break;
                case -929244945:
                case 319531049:
                    TextInputLayout textInputLayout4 = textInputLayout3;
                    short[] sArr7 = sArr6;
                    short[] sArr8 = sArr5;
                    int i37 = i28;
                    C8067 c8069 = c8067M3751;
                    short s2 = s;
                    int i38 = i29;
                    i27 = i27;
                    i2 = i38;
                    if (((s2 * s2) + 42419169) - (s2 * 13026) < 0) {
                        iM11307 = (C19806.m45029("᩸ۙ") + i18) * (-123);
                        i5 = ((iM11307 ^ i19) * (-22849)) ^ 1733711893;
                        i6 = -1269812488;
                    } else {
                        iM11307 = (i18 - ThreadFactoryC3888.m11306("ۛܿ")) * (-81);
                        i5 = ((iM11307 ^ i19) * 32747) ^ (-1663855714);
                        i6 = 422982095;
                    }
                    int i39 = iM11307 ^ i6;
                    s = s2;
                    sArr5 = sArr8;
                    c8067M3751 = c8069;
                    sArr6 = sArr7;
                    i21 = i39;
                    i20 = i5;
                    i28 = i37;
                    textInputLayout3 = textInputLayout4;
                    int i310 = i27;
                    i29 = i2;
                    i27 = i310;
                    break;
                case -858718584:
                case -589390721:
                    C1148.m4224(c8067M5356, iM113010 ^ i26);
                    AbstractC0464.m2309(c8067M5356, iM450213, new DialogInterface.OnClickListener() { // from class: l.ܶ᩵᩺
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i40) {
                            int i41 = 547514549;
                            int i42 = C2124.f7782;
                            int i43 = C1419.f5860;
                            int iM450217 = C19806.m45029("ܽۢ") ^ i43;
                            int i44 = ((iM450217 ^ i42) * (-10317)) ^ (-1807041834);
                            int i45 = -1198458853;
                            while (true) {
                                i41 = ((((i41 ^ i42) * 22309) >> 31) & i44) ^ (iM450217 ^ i45);
                                switch (i41) {
                                    case -1935230264:
                                    case 362997665:
                                        if (C0050.f912 <= 0) {
                                            iM450217 = (i42 - ThreadFactoryC3888.m11306("ܰۤ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i44 = ((iM450217 ^ i43) * 3079) ^ (-1263624342);
                                            i45 = -1824910125;
                                        } else {
                                            iM450217 = C19806.m45029("ܶ᩵") ^ i42;
                                            i44 = ((iM450217 ^ i43) * 31917) ^ 792027336;
                                            i45 = 1296446911;
                                        }
                                        break;
                                    case -1803326986:
                                    case -1082016206:
                                        if (RunnableC3388.m10064()) {
                                            iM450217 = ThreadFactoryC3888.m11306("ۙۢ") ^ i43;
                                            i44 = ((iM450217 ^ i42) * (-15295)) ^ (-800090319);
                                            i45 = 1493592219;
                                        } else {
                                            iM450217 = C19806.m45029("ۢ᩸") ^ i42;
                                            i44 = ((iM450217 ^ i43) * (-12427)) ^ (-1646364627);
                                            i45 = 289012924;
                                        }
                                        break;
                                    case -1692421222:
                                    case 636363213:
                                        if (C1025.f4800 >= 0) {
                                            iM450217 = (i42 - ThreadFactoryC3888.m11306("ܰۤ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i44 = ((iM450217 ^ i43) * 3079) ^ (-1263624342);
                                            i45 = -1824910125;
                                        } else {
                                            iM450217 = C19806.m45029("֡ۡ") ^ i43;
                                            i44 = ((iM450217 ^ i42) * (-27375)) ^ 1879651824;
                                            i45 = 1767875834;
                                        }
                                        break;
                                    case -1586497078:
                                    case 1756479276:
                                        if (C7105.f23796 >= 0) {
                                            iM450217 = C19806.m45029("ۢ᩸") ^ i42;
                                            i44 = ((iM450217 ^ i43) * (-12427)) ^ (-1646364627);
                                            i45 = 289012924;
                                        } else {
                                            iM450217 = C19806.m45029("ܰ᩵") ^ i43;
                                            i44 = ((iM450217 ^ i42) * (-26613)) ^ (-74832904);
                                            i45 = 1780567565;
                                        }
                                        break;
                                    case -1575035866:
                                    case -1373171651:
                                        if (C1875.f7103 >= 0) {
                                            iM450217 = C19806.m45029("ۢ᩸") ^ i42;
                                            i44 = ((iM450217 ^ i43) * (-12427)) ^ (-1646364627);
                                            i45 = 289012924;
                                        } else {
                                            iM450217 = C19806.m45029("᩹ܶ") ^ i42;
                                            i44 = ((iM450217 ^ i43) * (-20991)) ^ 500365483;
                                            i45 = 1555217543;
                                        }
                                        break;
                                    case -1410715553:
                                    case -534063581:
                                        if (RunnableC1895.m6170() != 0) {
                                            iM450217 = (ThreadFactoryC3888.m11306("۫ۢ") ^ i42) * (-89);
                                            i44 = ((iM450217 ^ i43) * 32707) ^ 116225270;
                                            i45 = -601566948;
                                        } else {
                                            iM450217 = (ThreadFactoryC3888.m11306("֨ۧ") ^ i43) * 61;
                                            i44 = ((iM450217 ^ i42) * (-21635)) ^ (-1352714615);
                                            i45 = 1231717196;
                                        }
                                        break;
                                    case -1404635999:
                                    case -900346638:
                                        if (C2642.f10294 > 0) {
                                            iM450217 = (ThreadFactoryC3888.m11306("۫ۢ") ^ i42) * (-89);
                                            i44 = ((iM450217 ^ i43) * 32707) ^ 116225270;
                                            i45 = -601566948;
                                        } else {
                                            iM450217 = C19806.m45029("ۘ᩶") ^ i43;
                                            i44 = ((iM450217 ^ i42) * (-393)) ^ 1333609836;
                                            i45 = -2020141070;
                                        }
                                        break;
                                    case -1321343724:
                                    case -1227232232:
                                        CallableC1627.m5507();
                                        C0526.m2437();
                                        iM450217 = C19806.m45029("ۘ᩶") ^ i43;
                                        i44 = ((iM450217 ^ i42) * (-393)) ^ 1333609836;
                                        i45 = -2020141070;
                                        break;
                                    case -1149387675:
                                    case 456121804:
                                        if (!C3743.f13569) {
                                            iM450217 = C19806.m45029("ۘ᩶") ^ i43;
                                            i44 = ((iM450217 ^ i42) * (-393)) ^ 1333609836;
                                            i45 = -2020141070;
                                        } else {
                                            iM450217 = C19806.m45029("ۢ᩸") ^ i42;
                                            i44 = ((iM450217 ^ i43) * (-12427)) ^ (-1646364627);
                                            i45 = 289012924;
                                        }
                                        break;
                                    case -1124132640:
                                    case -933237455:
                                        if (C1148.f5161 <= 0) {
                                            iM450217 = (i42 - ThreadFactoryC3888.m11306("ܰۤ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i44 = ((iM450217 ^ i43) * 3079) ^ (-1263624342);
                                            i45 = -1824910125;
                                        } else {
                                            iM450217 = C19806.m45029("ܳ֫") ^ i42;
                                            i44 = ((iM450217 ^ i43) * 2255) ^ 1118417883;
                                            i45 = -1749961488;
                                        }
                                        break;
                                    case -274981533:
                                    case 1379397654:
                                        C19806.m45024();
                                        C3535.m10431();
                                        break;
                                    case 312681646:
                                    case 1831867940:
                                        if (C1377.f5749) {
                                            iM450217 = (ThreadFactoryC3888.m11306("۬᩹") ^ i42) * (-27);
                                            i44 = ((iM450217 ^ i43) * 26681) ^ 821926227;
                                            i45 = 1198805907;
                                        } else {
                                            iM450217 = C19806.m45029("᩻᩹") ^ i43;
                                            i44 = ((iM450217 ^ i42) * (-19005)) ^ (-1761630562);
                                            i45 = 536251094;
                                        }
                                        break;
                                    case 724173137:
                                    case 1319200086:
                                        if (C2788.m8472() != 0) {
                                            iM450217 = C19806.m45029("ۘ᩶") ^ i43;
                                            i44 = ((iM450217 ^ i42) * (-393)) ^ 1333609836;
                                            i45 = -2020141070;
                                        } else {
                                            iM450217 = ThreadFactoryC3888.m11306("ᩴ᩹") ^ i43;
                                            i44 = ((iM450217 ^ i42) * 28275) ^ 48612770;
                                            i45 = -1163580408;
                                        }
                                        break;
                                    case 792090313:
                                    case 1862691831:
                                        if (C1875.m6086() != 0) {
                                            iM450217 = (ThreadFactoryC3888.m11306("۫ۢ") ^ i42) * (-89);
                                            i44 = ((iM450217 ^ i43) * 32707) ^ 116225270;
                                            i45 = -601566948;
                                        } else {
                                            iM450217 = ThreadFactoryC3888.m11306("ܳ᩷") ^ i42;
                                            i44 = ((iM450217 ^ i43) * 3797) ^ (-232274977);
                                            i45 = -688617883;
                                        }
                                        break;
                                    case 987581003:
                                    case 2054410101:
                                        ViewOnClickListenerC19680.m44816(this.f50332);
                                        break;
                                    default:
                                        if (C1148.f5161 > 0) {
                                            iM450217 = C19806.m45029("᩻᩹") ^ i43;
                                            i44 = ((iM450217 ^ i42) * (-19005)) ^ (-1761630562);
                                            i45 = 536251094;
                                        } else {
                                            iM450217 = (ThreadFactoryC3888.m11306("۫ۢ") ^ i42) * (-89);
                                            i44 = ((iM450217 ^ i43) * 32707) ^ 116225270;
                                            i45 = -601566948;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    sArr6 = f63180;
                    i24 = BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    if (C3660.f13403 < 0) {
                        iM11309 = (ThreadFactoryC3888.m11306("ۗᩳ") + i19) * (-119);
                        i14 = ((iM11309 ^ i18) * (-16877)) ^ (-1869696397);
                        i15 = -1161939192;
                        i21 = iM11309 ^ i15;
                        i20 = i14;
                    } else {
                        textInputLayout3 = textInputLayout3;
                        i28 = i28;
                        c8067M3751 = c8067M3751;
                        int iM113014 = (ThreadFactoryC3888.m11306("ܽۢ") ^ i18) * 55;
                        i20 = ((iM113014 ^ i19) * (-15465)) ^ 1833880012;
                        i21 = iM113014 ^ 38178643;
                        viewOnClickListenerC19680 = viewOnClickListenerC19680;
                        c8067M3751 = c8067M3751;
                        textInputLayout3 = textInputLayout3;
                        i28 = i28;
                    }
                    break;
                case -735567720:
                case -156590420:
                    sArr6 = sArr6;
                    textInputLayout2 = textInputLayout3;
                    if (new C16762(C0629.m2906(f63180, IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, 3, i22)).m39325((CharSequence) str)) {
                        iM450211 = (i19 - ThreadFactoryC3888.m11306("ۜᩳ")) * 49;
                        i7 = ((iM450211 ^ i18) * 18831) ^ 1174178119;
                        i13 = 1130058693;
                    } else {
                        iM450211 = (C19806.m45029("ᩳ᩶") ^ i18) * (-69);
                        i7 = ((iM450211 ^ i19) * 11873) ^ 1661446511;
                        i13 = 1678211589;
                    }
                    i16 = iM450211 ^ i13;
                    textInputLayout3 = textInputLayout2;
                    sArr4 = sArr6;
                    i21 = i16;
                    i20 = i7;
                    sArr6 = sArr4;
                    break;
                case -730045226:
                case 2009621295:
                    break;
                case -694763024:
                case 2061233326:
                    textInputLayout3 = textInputLayout3;
                    short[] sArr9 = sArr6;
                    short[] sArr10 = sArr5;
                    int i40 = i28;
                    int i41 = i29;
                    C8067 c80610 = c8067M3751;
                    int iM450217 = C19806.m45029(RunnableC0195.m1429(sArr10, i40, i41, i22)) ^ 2119726765;
                    int i42 = i27;
                    if (iM6174 != i42) {
                        int iM113015 = ThreadFactoryC3888.m11306("֨ۡ") ^ i18;
                        i20 = ((iM113015 ^ i19) * 26837) ^ 237860762;
                        c8067M3751 = c80610;
                        textInputLayout3 = textInputLayout3;
                        i28 = i40;
                        sArr5 = sArr10;
                        sArr6 = sArr9;
                        i21 = iM113015 ^ (-932911833);
                        i27 = i42;
                        i29 = i41;
                        i23 = iM450217;
                    } else {
                        int iM113016 = ThreadFactoryC3888.m11306("ۧ᩷") ^ i19;
                        c8067M3751 = c80610;
                        i27 = i42;
                        i29 = i41;
                        i28 = i40;
                        i23 = iM450217;
                        sArr5 = sArr10;
                        sArr6 = sArr9;
                        i21 = iM113016 ^ (-790898852);
                        i20 = ((iM113016 ^ i18) * (-21067)) ^ 1793306294;
                        textInputLayout3 = textInputLayout3;
                    }
                    break;
                case -678162224:
                case 2087520957:
                    textInputLayout3 = textInputLayout3;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    i28 = i28;
                    c8067M3751 = c8067M3751;
                    int i43 = i29;
                    i27 = i27;
                    i2 = i43;
                    C2704.m8238(c1313, C1460.m5047(f63180, 87, 6, i22));
                    if (!C7105.m18985()) {
                        iM11306 = (C19806.m45029("᩸᩷") + i18) * 35;
                        i20 = ((iM11306 ^ i19) * (-3821)) ^ 2015604513;
                        i4 = 1047730467;
                        i3 = iM11306 ^ i4;
                        sArr5 = sArr5;
                        c8067M3751 = c8067M3751;
                        sArr6 = sArr6;
                        textInputLayout3 = textInputLayout3;
                        i21 = i3;
                        i28 = i28;
                        int i311 = i27;
                        i29 = i2;
                        i27 = i311;
                    } else {
                        sArr5 = sArr5;
                        sArr6 = sArr6;
                        i29 = i2;
                        i27 = i27;
                        int iM113017 = (ThreadFactoryC3888.m11306("ܽۢ") ^ i18) * 55;
                        i20 = ((iM113017 ^ i19) * (-15465)) ^ 1833880012;
                        i21 = iM113017 ^ 38178643;
                        viewOnClickListenerC19680 = viewOnClickListenerC19680;
                        c8067M3751 = c8067M3751;
                        textInputLayout3 = textInputLayout3;
                        i28 = i28;
                    }
                    break;
                case -644015109:
                case 826685175:
                    C2642.m8170(viewOnClickListenerC19680.f63183, C19806.m45029(C2249.m6918(f63180, 123, 3, i22)) ^ 2129155865);
                    break;
                case -584892753:
                case 1728654063:
                    C3743.m10954(textInputLayout3, ThreadFactoryC3888.m11306(AbstractC0464.m2308(f63180, 108, 3, i22)) ^ 2100538424);
                    break;
                case -499471601:
                case -205373953:
                    int i44 = C14015.f46057;
                    C7643.m20197(abstractActivityC12483, false, true, runnable);
                    sArr6 = sArr6;
                    iM45029 = (C19806.m45029("ۘۧ") + i18) * 5;
                    i7 = ((iM45029 ^ i19) * 9047) ^ 105404423;
                    i8 = -860668510;
                    i16 = iM45029 ^ i8;
                    sArr4 = sArr6;
                    i21 = i16;
                    i20 = i7;
                    sArr6 = sArr4;
                    break;
                case -439200043:
                case 516322952:
                    sArr = sArr6;
                    sArr2 = sArr5;
                    i28 = i28;
                    i = i29;
                    c8067 = c8067M3751;
                    i27 = i27;
                    viewOnClickListenerC19680.m44815();
                    textInputLayout3 = viewOnClickListenerC19680.f63186;
                    abstractActivityC12483 = viewOnClickListenerC19680.f63184;
                    zM3738 = C0962.m3738(c1313);
                    if (C1977.f7413 > 0) {
                        int iM113018 = ThreadFactoryC3888.m11306("ۤۨ") ^ i19;
                        i2 = i;
                        i20 = ((iM113018 ^ i18) * (-25427)) ^ 800360412;
                        i3 = iM113018 ^ (-1788361424);
                        sArr5 = sArr2;
                        c8067M3751 = c8067;
                        sArr6 = sArr;
                        i21 = i3;
                        i28 = i28;
                        int i312 = i27;
                        i29 = i2;
                        i27 = i312;
                    } else {
                        int iM113019 = (i18 - ThreadFactoryC3888.m11306("ܺۜ")) * 51;
                        int i313 = ((iM113019 ^ i19) * 29157) ^ 1641573633;
                        sArr5 = sArr2;
                        c8067M3751 = c8067;
                        sArr6 = sArr;
                        i28 = i28;
                        i21 = iM113019 ^ (-294529037);
                        i27 = i27;
                        i29 = i;
                        i20 = i313;
                        viewOnClickListenerC19680 = viewOnClickListenerC19680;
                    }
                    break;
                case -71343923:
                case 129002515:
                    textInputLayout = textInputLayout3;
                    sArr3 = sArr6;
                    c8068 = c8067M3751;
                    C1189.m4367(viewOnClickListenerC19680.f63187);
                    if (C2871.m8642()) {
                        iM450210 = C19806.m45029("۟ۡ") ^ i18;
                        i11 = ((iM450210 ^ i19) * (-16265)) ^ 1487869275;
                        i12 = -665486972;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("ۛۨ") + i19) * q.h;
                        i11 = ((iM450210 ^ i18) * 17333) ^ (-453756212);
                        i12 = 1259956015;
                    }
                    int i45 = iM450210 ^ i12;
                    c8067M3751 = c8068;
                    i20 = i11;
                    textInputLayout3 = textInputLayout;
                    sArr4 = sArr3;
                    i21 = i45;
                    sArr6 = sArr4;
                    break;
                case -47475268:
                case 96041254:
                    sArr3 = sArr6;
                    C18974.m43673(abstractActivityC12483);
                    textInputLayout = textInputLayout3;
                    c8068 = c8067M3751;
                    iM450210 = (ThreadFactoryC3888.m11306("ۛۨ") + i19) * q.h;
                    i11 = ((iM450210 ^ i18) * 17333) ^ (-453756212);
                    i12 = 1259956015;
                    int i46 = iM450210 ^ i12;
                    c8067M3751 = c8068;
                    i20 = i11;
                    textInputLayout3 = textInputLayout;
                    sArr4 = sArr3;
                    i21 = i46;
                    sArr6 = sArr4;
                    break;
                case 191358987:
                case 1433086426:
                    TextInputLayout textInputLayout5 = textInputLayout3;
                    short[] sArr11 = sArr6;
                    short[] sArr12 = sArr5;
                    int i47 = i28;
                    int i48 = i29;
                    C8067 c80611 = c8067M3751;
                    int i49 = i27;
                    iM450213 = C19806.m45029(C0216.m1588(f63180, 93, 3, i22)) ^ 2098763911;
                    if (zM3738) {
                        iM11308 = (C19806.m45029("᩹֨") ^ i18) * 19;
                        i9 = ((iM11308 ^ i19) * 13551) ^ (-1550561906);
                        i10 = -805802468;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("ۧ֨") ^ i19;
                        i9 = ((iM11308 ^ i18) * (-22267)) ^ (-631633662);
                        i10 = -1017610258;
                    }
                    int i50 = iM11308 ^ i10;
                    sArr5 = sArr12;
                    c8067M3751 = c80611;
                    i27 = i49;
                    sArr6 = sArr11;
                    i29 = i48;
                    i21 = i50;
                    i20 = i9;
                    i28 = i47;
                    textInputLayout3 = textInputLayout5;
                    runnable = null;
                    break;
                case 209214842:
                case 656059340:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        textInputLayout2 = textInputLayout3;
                        sArr6 = sArr6;
                        iM450211 = ThreadFactoryC3888.m11306("ۗ᩷") ^ i19;
                        i7 = ((iM450211 ^ i18) * 4343) ^ (-1612592901);
                        i13 = 1986559273;
                        i16 = iM450211 ^ i13;
                        textInputLayout3 = textInputLayout2;
                        sArr4 = sArr6;
                        i21 = i16;
                        i20 = i7;
                        sArr6 = sArr4;
                    }
                    textInputLayout2 = textInputLayout3;
                    sArr6 = sArr6;
                    iM450211 = (ThreadFactoryC3888.m11306("۫ܺ") + i18) * (-45);
                    i7 = ((iM450211 ^ i19) * 26455) ^ 1933188128;
                    i13 = -1838412586;
                    i16 = iM450211 ^ i13;
                    textInputLayout3 = textInputLayout2;
                    sArr4 = sArr6;
                    i21 = i16;
                    i20 = i7;
                    sArr6 = sArr4;
                    break;
                case 741426850:
                case 1318948959:
                    i2 = i29;
                    i22 = 19878;
                    iM11306 = C19806.m45029("ۗ۠") ^ i19;
                    i20 = ((iM11306 ^ i18) * 27699) ^ 634627465;
                    i4 = 1234451334;
                    i3 = iM11306 ^ i4;
                    sArr5 = sArr5;
                    c8067M3751 = c8067M3751;
                    sArr6 = sArr6;
                    textInputLayout3 = textInputLayout3;
                    i21 = i3;
                    i28 = i28;
                    int i314 = i27;
                    i29 = i2;
                    i27 = i314;
                    break;
                case 817753398:
                case 1677090590:
                    C8067 c80612 = c8067M3751;
                    C1377.m4836(c80612, iM450216 ^ i25);
                    C0671.m3015(c80612, C0526.m2431(c1313, i23));
                    C1460.m5055(c80612, iM450213, runnable);
                    CallableC1627.m5514(c80612);
                    break;
                case 1158610052:
                case 2103169517:
                    sArr6 = sArr6;
                    c8067M5356 = RunnableC1564.m5356(abstractActivityC12483);
                    iM450214 = C19806.m45029(C1189.m4365(f63180, UMErrorCode.E_UM_BE_CREATE_FAILED, 3, i22)) ^ 2104560258;
                    if (C2124.m6673() > 0) {
                        iM45029 = (C19806.m45029("᩹ۧ") + i18) * (-65);
                        i7 = ((iM45029 ^ i19) * (-7783)) ^ (-1226575310);
                        i8 = 800589149;
                        i16 = iM45029 ^ i8;
                        sArr4 = sArr6;
                        i21 = i16;
                        i20 = i7;
                        sArr6 = sArr4;
                    } else {
                        sArr5 = sArr5;
                        i28 = i28;
                        c8067M3751 = c8067M3751;
                        int i315 = i29;
                        i27 = i27;
                        i2 = i315;
                        iM11306 = C19806.m45029("ۗ᩻") ^ i19;
                        i20 = ((iM11306 ^ i18) * (-11925)) ^ 1154308103;
                        i4 = 1100514230;
                        i3 = iM11306 ^ i4;
                        sArr5 = sArr5;
                        c8067M3751 = c8067M3751;
                        sArr6 = sArr6;
                        textInputLayout3 = textInputLayout3;
                        i21 = i3;
                        i28 = i28;
                        int i316 = i27;
                        i29 = i2;
                        i27 = i316;
                    }
                    break;
                case 1247454246:
                case 1566070256:
                    textInputLayout3 = textInputLayout3;
                    short[] sArr13 = sArr6;
                    c8067M3751 = c8067M3751;
                    iM6174 = RunnableC1895.m6174(c1313);
                    i27 = 9;
                    sArr5 = f63180;
                    i29 = 3;
                    if (C1668.f6641 < 0) {
                        int iM113020 = (ThreadFactoryC3888.m11306("᩷ᩳ") + i18) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i20 = ((iM113020 ^ i19) * (-22303)) ^ (-652219705);
                        c8067M3751 = c8067M3751;
                        sArr6 = sArr13;
                        i28 = 96;
                        i21 = iM113020 ^ 1823370742;
                        textInputLayout3 = textInputLayout3;
                    } else {
                        sArr6 = sArr13;
                        i28 = 96;
                        int iM1130110 = (ThreadFactoryC3888.m11306("ܽۢ") ^ i18) * 55;
                        i20 = ((iM1130110 ^ i19) * (-15465)) ^ 1833880012;
                        i21 = iM1130110 ^ 38178643;
                        viewOnClickListenerC19680 = viewOnClickListenerC19680;
                        c8067M3751 = c8067M3751;
                        textInputLayout3 = textInputLayout3;
                        i28 = i28;
                    }
                    break;
                case 1498564884:
                case 1673705648:
                    if (iM6174 != 1200) {
                        iM11309 = C19806.m45029("ۢ۟") ^ i19;
                        i14 = ((iM11309 ^ i18) * 3429) ^ (-607781240);
                        i15 = 351945540;
                    } else {
                        iM11309 = ThreadFactoryC3888.m11306("ۜۖ") ^ i18;
                        i14 = ((iM11309 ^ i19) * 17523) ^ 1371045345;
                        i15 = 339270231;
                    }
                    i21 = iM11309 ^ i15;
                    i20 = i14;
                    break;
                default:
                    CallableC1627.m5507();
                    if (CallableC1627.m5507() != 0) {
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        i28 = i28;
                        c8067M3751 = c8067M3751;
                        int i317 = i29;
                        i27 = i27;
                        i2 = i317;
                        iM11306 = C19806.m45029("ۗ᩻") ^ i19;
                        i20 = ((iM11306 ^ i18) * (-11925)) ^ 1154308103;
                        i4 = 1100514230;
                        i3 = iM11306 ^ i4;
                        sArr5 = sArr5;
                        c8067M3751 = c8067M3751;
                        sArr6 = sArr6;
                        textInputLayout3 = textInputLayout3;
                        i21 = i3;
                        i28 = i28;
                        int i318 = i27;
                        i29 = i2;
                        i27 = i318;
                    } else {
                        sArr = sArr6;
                        sArr2 = sArr5;
                        i28 = i28;
                        i = i29;
                        c8067 = c8067M3751;
                        i27 = i27;
                        int iM1130111 = (i18 - ThreadFactoryC3888.m11306("ܺۜ")) * 51;
                        int i319 = ((iM1130111 ^ i19) * 29157) ^ 1641573633;
                        sArr5 = sArr2;
                        c8067M3751 = c8067;
                        sArr6 = sArr;
                        i28 = i28;
                        i21 = iM1130111 ^ (-294529037);
                        i27 = i27;
                        i29 = i;
                        i20 = i319;
                        viewOnClickListenerC19680 = viewOnClickListenerC19680;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0281 A[PHI: r4 r5 r6 r20 r21
      0x0281: PHI (r4v4 android.view.View) = (r4v2 android.view.View), (r4v3 android.view.View), (r4v2 android.view.View), (r4v2 android.view.View) binds: [B:67:0x027f, B:43:0x0188, B:39:0x0166, B:35:0x0142] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:67:0x027f, B:43:0x0188, B:39:0x0166, B:35:0x0142] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r6v3 float[]) = (r6v2 float[]), (r6v2 float[]), (r6v2 float[]), (r6v4 float[]) binds: [B:67:0x027f, B:43:0x0188, B:39:0x0166, B:35:0x0142] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r20v14 short) = (r20v3 short), (r20v12 short), (r20v13 short), (r20v15 short) binds: [B:67:0x027f, B:43:0x0188, B:39:0x0166, B:35:0x0142] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r21v5 char) = (r21v4 char), (r21v3 char), (r21v3 char), (r21v3 char) binds: [B:67:0x027f, B:43:0x0188, B:39:0x0166, B:35:0x0142] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02b3 A[PHI: r2 r3 r7 r16 r20
      0x02b3: PHI (r2v4 l.᩵ۡۜ) = (r2v2 l.᩵ۡۜ), (r2v3 l.᩵ۡۜ), (r2v2 l.᩵ۡۜ), (r2v2 l.᩵ۡۜ) binds: [B:71:0x02b1, B:47:0x01ab, B:27:0x00e6, B:13:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r3v5 int) = (r3v2 int), (r3v4 int), (r3v2 int), (r3v2 int) binds: [B:71:0x02b1, B:47:0x01ab, B:27:0x00e6, B:13:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r7v4 java.lang.String) = (r7v2 java.lang.String), (r7v2 java.lang.String), (r7v3 java.lang.String), (r7v2 java.lang.String) binds: [B:71:0x02b1, B:47:0x01ab, B:27:0x00e6, B:13:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:71:0x02b1, B:47:0x01ab, B:27:0x00e6, B:13:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r20v21 short) = (r20v2 short), (r20v11 short), (r20v17 short), (r20v22 short) binds: [B:71:0x02b1, B:47:0x01ab, B:27:0x00e6, B:13:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0081, code lost:
    
        if (l.C1148.f5161 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0083, code lost:
    
        r20 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008c, code lost:
    
        if (l.MenuItemOnMenuItemClickListenerC3244.f12064 < 0) goto L9;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final l.C21796 m44809(boolean r23) {
        /*
            Method dump skipped, instruction units count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC19680.m44809(boolean):l.᩸᩵᩺");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44810(ViewOnClickListenerC19680 viewOnClickListenerC19680) {
        RunnableC1895.m6165(viewOnClickListenerC19680.f63182, 8);
    }

    /* JADX WARN: Code duplicated, block: B:68:0x02ba A[PHI: r30
      0x02ba: PHI (r30v49 int) = (r30v48 int), (r30v50 int) binds: [B:66:0x02a3, B:63:0x0286] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM11306;
        int i;
        int i2;
        short s;
        int i3;
        int iM11307;
        int i4;
        int iM11308;
        int i5;
        int i6;
        int iM45029;
        int i7;
        int i8;
        int iM11309;
        int i9;
        int i10;
        int i11;
        int iM450210;
        int i12;
        int i13;
        int iM113010;
        int i14;
        int i15;
        int i16;
        C8391 c8391;
        short[] sArr;
        int i17;
        ViewOnClickListenerC19680 viewOnClickListenerC19680 = this;
        int iM6354 = 0;
        DialogInterfaceC19356 dialogInterfaceC19356 = null;
        String strM3407 = null;
        String strM3408 = null;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        short[] sArr2 = null;
        int i21 = -1944673993;
        int i22 = AbstractC0464.f2088;
        int i23 = ThreadFactoryC3888.f14547;
        int iM450211 = (C19806.m45029("ܽۧ") + i23) * (-89);
        int i24 = ((iM450211 ^ i22) * 7317) ^ 900964542;
        int i25 = iM450211 ^ 1560447951;
        C8391 c8392 = null;
        TextInputLayout[] textInputLayoutArr = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i26 = 0;
        boolean z = false;
        int i27 = 0;
        int i28 = 0;
        char c = 0;
        int iM6355 = 0;
        int i29 = 0;
        int iM6356 = 0;
        int i30 = 0;
        short s2 = 0;
        int i31 = 0;
        int i32 = 0;
        AbstractActivityC12483 abstractActivityC12483 = null;
        String strM10964 = null;
        Editable editableM10576 = null;
        TextInputLayout textInputLayout = null;
        TextInputLayout textInputLayout2 = null;
        boolean z2 = false;
        while (true) {
            i21 = i25 ^ (i24 & (((i21 ^ i22) * (-4169)) >> 31));
            switch (i21) {
                case -2132871568:
                case -775789669:
                    i28 = i28;
                    if (C1334.m4737(strM3407)) {
                        iM113010 = C19806.m45029("ܿۗ") ^ i22;
                        i14 = ((iM113010 ^ i23) * 18557) ^ (-1133020118);
                        i15 = -556067345;
                    } else {
                        iM113010 = ThreadFactoryC3888.m11306("ۙ۫") ^ i23;
                        i14 = ((iM113010 ^ i22) * 4595) ^ (-1487975235);
                        i15 = 1181312283;
                    }
                    i25 = iM113010 ^ i15;
                    i24 = i14;
                    i28 = i28;
                    break;
                case -2066854919:
                case -1454944476:
                    short[] sArr6 = sArr5;
                    int i33 = i20;
                    c8392 = c8392;
                    int i34 = i30;
                    i27 = i27;
                    i3 = i34;
                    i20 = i33;
                    int iM450212 = C19806.m45029(C2332.m7082(sArr6, i33, i3, i26)) ^ 2120792014;
                    sArr5 = sArr6;
                    int i35 = iM6356;
                    if (i35 != iM450212) {
                        int iM113011 = (ThreadFactoryC3888.m11306("ۖ۬") + i22) * (-27);
                        iM6356 = i35;
                        i25 = iM113011 ^ 881553067;
                        i24 = ((iM113011 ^ i23) * 10405) ^ 1197514641;
                        c8392 = c8392;
                        sArr5 = sArr5;
                        i20 = i20;
                        int i36 = i27;
                        i30 = i3;
                        i27 = i36;
                    } else {
                        z = z ? 1 : 0;
                        iM6356 = i35;
                        iM6355 = iM6355;
                        sArr4 = sArr4;
                        i11 = i31;
                        i10 = i32;
                        int iM113012 = (i23 - ThreadFactoryC3888.m11306("֨ܿ")) * (-27);
                        i24 = ((iM113012 ^ i22) * 25995) ^ 726837857;
                        i6 = iM113012 ^ (-1055269098);
                        i31 = i11;
                        i32 = i10;
                        z = z;
                        sArr4 = sArr4;
                        iM6355 = iM6355;
                        i25 = i6;
                        c8392 = c8392;
                        sArr5 = sArr5;
                        i20 = i20;
                        viewOnClickListenerC19680 = this;
                        int i37 = i27;
                        i30 = i3;
                        i27 = i37;
                    }
                    break;
                case -2034678352:
                case 1721700341:
                    i28 = i28;
                    if (C2871.m8641(strM3408) < 7) {
                        iM113010 = C19806.m45029("ᩴۘ") ^ i23;
                        i14 = ((iM113010 ^ i22) * 15103) ^ 106003929;
                        i15 = -420540782;
                    } else {
                        iM113010 = (C19806.m45029("ۜᩳ") + i22) * (-27);
                        i14 = ((iM113010 ^ i23) * 24217) ^ 1522258071;
                        i15 = 1040993449;
                    }
                    i25 = iM113010 ^ i15;
                    i24 = i14;
                    i28 = i28;
                    break;
                case -2028382194:
                case 1667474308:
                    i28 = i28;
                    if (C2871.m8641(strM3407) < 4) {
                        iM113010 = (i23 - C19806.m45029("۟᩻")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i14 = ((iM113010 ^ i22) * (-9365)) ^ 660386898;
                        i15 = -277588731;
                    } else {
                        iM113010 = C19806.m45029("᩸ܳ") ^ i22;
                        i14 = ((iM113010 ^ i23) * (-11581)) ^ (-1668515987);
                        i15 = 1451008449;
                    }
                    i25 = iM113010 ^ i15;
                    i24 = i14;
                    i28 = i28;
                    break;
                case -1994544592:
                case 844965919:
                    i20 = i20;
                    short[] sArr7 = sArr4;
                    i10 = i32;
                    sArr5 = sArr5;
                    c8392 = c8392;
                    z = z ? 1 : 0;
                    i11 = i31;
                    int i38 = i30;
                    i27 = i27;
                    i3 = i38;
                    int iM450213 = C19806.m45029(C1377.m4832(sArr7, i11, i10, i26)) ^ 2098501666;
                    sArr4 = sArr7;
                    AbstractActivityC12483 abstractActivityC12484 = viewOnClickListenerC19680.f63184;
                    int i39 = iM6355;
                    if (i39 != iM450213) {
                        int iM113013 = ThreadFactoryC3888.m11306("ܳ֫") ^ i22;
                        i31 = i11;
                        i32 = i10;
                        i29 = iM450213;
                        z = z ? 1 : 0;
                        sArr4 = sArr4;
                        abstractActivityC12483 = abstractActivityC12484;
                        c8392 = c8392;
                        sArr5 = sArr5;
                        i20 = i20;
                        i24 = ((iM113013 ^ i23) * 14227) ^ 45918458;
                        viewOnClickListenerC19680 = this;
                        i30 = i3;
                        i27 = i27;
                        i25 = iM113013 ^ 1053110715;
                        iM6355 = i39;
                    } else {
                        iM6355 = i39;
                        i29 = iM450213;
                        abstractActivityC12483 = abstractActivityC12484;
                        int iM113014 = (i23 - ThreadFactoryC3888.m11306("֨ܿ")) * (-27);
                        i24 = ((iM113014 ^ i22) * 25995) ^ 726837857;
                        i6 = iM113014 ^ (-1055269098);
                        i31 = i11;
                        i32 = i10;
                        z = z;
                        sArr4 = sArr4;
                        iM6355 = iM6355;
                        i25 = i6;
                        c8392 = c8392;
                        sArr5 = sArr5;
                        i20 = i20;
                        viewOnClickListenerC19680 = this;
                        int i310 = i27;
                        i30 = i3;
                        i27 = i310;
                    }
                    break;
                case -1942210779:
                case -319784520:
                    i28 = i28;
                    textInputLayoutArr = new TextInputLayout[2];
                    z2 = false;
                    z2 = false;
                    textInputLayout2 = viewOnClickListenerC19680.f63186;
                    if (AbstractC0464.f2088 > 0) {
                        iM113010 = ThreadFactoryC3888.m11306("ܽۛ") ^ i23;
                        i14 = ((iM113010 ^ i22) * 2747) ^ (-1328343423);
                        i15 = 1874931438;
                        i25 = iM113010 ^ i15;
                        i24 = i14;
                        i28 = i28;
                    } else {
                        i28 = i28;
                        i20 = i20;
                        sArr5 = sArr5;
                        c8392 = c8392;
                        int i40 = i30;
                        i27 = i27;
                        i3 = i40;
                        iM11309 = ThreadFactoryC3888.m11306("᩵ܺ") ^ i23;
                        i24 = ((iM11309 ^ i22) * (-31057)) ^ (-745452238);
                        i9 = 899310911;
                        i25 = iM11309 ^ i9;
                        viewOnClickListenerC19680 = this;
                        c8392 = c8392;
                        sArr5 = sArr5;
                        i20 = i20;
                        int i311 = i27;
                        i30 = i3;
                        i27 = i311;
                    }
                    break;
                case -1881307570:
                case -131083525:
                    if (!C0797.f3386) {
                        iM11306 = ThreadFactoryC3888.m11306("᩸᩻") ^ i23;
                        i = ((iM11306 ^ i22) * 2963) ^ 1029936591;
                        i2 = 1944035496;
                        i25 = iM11306 ^ i2;
                        i24 = i;
                    } else {
                        i20 = i20;
                        sArr5 = sArr5;
                        c8392 = c8392;
                        int i41 = i30;
                        i27 = i27;
                        i3 = i41;
                        iM11309 = ThreadFactoryC3888.m11306("᩵ܺ") ^ i23;
                        i24 = ((iM11309 ^ i22) * (-31057)) ^ (-745452238);
                        i9 = 899310911;
                        i25 = iM11309 ^ i9;
                        viewOnClickListenerC19680 = this;
                        c8392 = c8392;
                        sArr5 = sArr5;
                        i20 = i20;
                        int i312 = i27;
                        i30 = i3;
                        i27 = i312;
                    }
                    break;
                case -1828181446:
                case -1441394643:
                    iM6355 = iM6355;
                    i20 = i20;
                    sArr4 = sArr4;
                    i31 = i31;
                    i32 = i32;
                    sArr5 = sArr5;
                    c8392 = c8392;
                    z = z ? 1 : 0;
                    s = s2;
                    int i42 = i30;
                    i27 = i27;
                    i3 = i42;
                    sArr3 = f63180;
                    c = 138;
                    if (RunnableC1895.m6170() != 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("ۛ᩵") ^ i22) * 49;
                        i24 = ((iM11307 ^ i23) * (-31445)) ^ 1424107530;
                        i4 = -1612595939;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("᩻ۗ") + i23) * (-39);
                        i24 = ((iM11307 ^ i22) * 8797) ^ (-1973795015);
                        i4 = 693295363;
                    }
                    i6 = iM11307 ^ i4;
                    s2 = s;
                    i32 = i32;
                    i31 = i31;
                    z = z;
                    sArr4 = sArr4;
                    iM6355 = iM6355;
                    i25 = i6;
                    c8392 = c8392;
                    sArr5 = sArr5;
                    i20 = i20;
                    viewOnClickListenerC19680 = this;
                    int i313 = i27;
                    i30 = i3;
                    i27 = i313;
                    break;
                case -1821295649:
                case -1084244374:
                    i28 = i28;
                    if (C1334.m4739(strM3408)) {
                        iM113010 = (ThreadFactoryC3888.m11306("ᩳۗ") ^ i22) * 85;
                        i14 = ((iM113010 ^ i23) * 27625) ^ 320366008;
                        i15 = -282202439;
                    } else {
                        iM113010 = (C19806.m45029("ܶܽ") ^ i22) * (-13);
                        i14 = ((iM113010 ^ i23) * (-5105)) ^ 240831689;
                        i15 = 339146000;
                    }
                    i25 = iM113010 ^ i15;
                    i24 = i14;
                    i28 = i28;
                    break;
                case -1801564025:
                case -13865082:
                    i28 = i28;
                    int iM450214 = C19806.m45029(strM10964) ^ 2127635729;
                    dialogInterfaceC19356 = viewOnClickListenerC19680.f63187;
                    if (iM6354 == iM450214) {
                        iM113010 = C19806.m45029("ܿۘ") ^ i22;
                        i14 = ((iM113010 ^ i23) * 21271) ^ 37398868;
                        i15 = -1393421283;
                    } else {
                        iM113010 = ThreadFactoryC3888.m11306("ۛۜ") ^ i22;
                        i14 = ((iM113010 ^ i23) * 17387) ^ 1619872417;
                        i15 = -831186348;
                    }
                    i25 = iM113010 ^ i15;
                    i24 = i14;
                    i28 = i28;
                    break;
                case -1776847342:
                case -1382311899:
                    new ViewOnClickListenerC22502(abstractActivityC12483, dialogInterfaceC19356);
                    C1668.m5572(dialogInterfaceC19356);
                    break;
                case -1757994320:
                case 1210008293:
                    C3743.m10954(textInputLayout, C19806.m45029(C0629.m2906(f63180, 165, 3, i26)) ^ 2128050919);
                    break;
                case -1711999750:
                case -449337950:
                    iM6354 = C1977.m6354(view);
                    sArr2 = f63180;
                    i28 = 146;
                    i27 = 3;
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩸᩻") ^ i23;
                        i = ((iM11306 ^ i22) * 2963) ^ 1029936591;
                        i2 = 1944035496;
                    } else {
                        iM11306 = (i23 - C19806.m45029("ܶ֡")) * (-81);
                        i = ((iM11306 ^ i22) * 21983) ^ 1066359231;
                        i2 = -1600504127;
                    }
                    i25 = iM11306 ^ i2;
                    i24 = i;
                    break;
                case -1558500417:
                case 763452098:
                    C1875.m6086();
                    C1937.m6279();
                    break;
                case -1532832248:
                case 1956618253:
                    C1461.m5080();
                    if (C1875.f7103 >= 0) {
                        i20 = i20;
                        sArr5 = sArr5;
                        c8392 = c8392;
                        int i43 = i30;
                        i27 = i27;
                        i3 = i43;
                        iM11309 = ThreadFactoryC3888.m11306("᩵ܺ") ^ i23;
                        i24 = ((iM11309 ^ i22) * (-31057)) ^ (-745452238);
                        i9 = 899310911;
                        i25 = iM11309 ^ i9;
                        viewOnClickListenerC19680 = this;
                        c8392 = c8392;
                        sArr5 = sArr5;
                        i20 = i20;
                        int i314 = i27;
                        i30 = i3;
                        i27 = i314;
                    } else {
                        iM11306 = (C19806.m45029("᩷ۨ") ^ i22) * 115;
                        i = ((iM11306 ^ i23) * (-11997)) ^ (-1969166794);
                        i2 = -1193902325;
                        i25 = iM11306 ^ i2;
                        i24 = i;
                    }
                    break;
                case -1526827710:
                case 872146959:
                    iM6355 = iM6355;
                    i20 = i20;
                    sArr4 = sArr4;
                    i31 = i31;
                    i32 = i32;
                    sArr5 = sArr5;
                    c8392 = c8392;
                    z = z ? 1 : 0;
                    int i44 = i30;
                    i27 = i27;
                    i3 = i44;
                    int i45 = i18 + i19;
                    s = s2;
                    int i46 = s + 11093;
                    if ((i46 * i46) - (i45 + i45) <= 0) {
                        iM11307 = C19806.m45029("᩷ۚ") ^ i22;
                        i24 = ((iM11307 ^ i23) * 13147) ^ (-588987259);
                        i4 = 906377481;
                    } else {
                        iM11307 = C19806.m45029("᩹ܶ") ^ i23;
                        i24 = ((iM11307 ^ i22) * (-5983)) ^ (-1251958795);
                        i4 = 967225422;
                    }
                    i6 = iM11307 ^ i4;
                    s2 = s;
                    i32 = i32;
                    i31 = i31;
                    z = z;
                    sArr4 = sArr4;
                    iM6355 = iM6355;
                    i25 = i6;
                    c8392 = c8392;
                    sArr5 = sArr5;
                    i20 = i20;
                    viewOnClickListenerC19680 = this;
                    int i315 = i27;
                    i30 = i3;
                    i27 = i315;
                    break;
                case -1503749216:
                case -1045850086:
                    break;
                case -1443240226:
                case -642295697:
                    if (RunnableC1606.m5473() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚۙ") + i22) * (-27);
                        i = ((iM11306 ^ i23) * 7207) ^ 255410486;
                        i2 = -1751183359;
                        i25 = iM11306 ^ i2;
                        i24 = i;
                    } else {
                        sArr5 = sArr5;
                        c8392 = c8392;
                        z = z ? 1 : 0;
                        s = s2;
                        int i47 = i30;
                        i27 = i27;
                        i3 = i47;
                        iM11307 = (ThreadFactoryC3888.m11306("ۛ᩵") ^ i22) * 49;
                        i24 = ((iM11307 ^ i23) * (-31445)) ^ 1424107530;
                        i4 = -1612595939;
                        i6 = iM11307 ^ i4;
                        s2 = s;
                        i32 = i32;
                        i31 = i31;
                        z = z;
                        sArr4 = sArr4;
                        iM6355 = iM6355;
                        i25 = i6;
                        c8392 = c8392;
                        sArr5 = sArr5;
                        i20 = i20;
                        viewOnClickListenerC19680 = this;
                        int i316 = i27;
                        i30 = i3;
                        i27 = i316;
                    }
                    break;
                case -1432091958:
                case -1222804792:
                    i20 = i20;
                    sArr5 = sArr5;
                    c8392 = c8392;
                    int i48 = i30;
                    i27 = i27;
                    i3 = i48;
                    iM6355 = C1977.m6354(view);
                    z = true;
                    z = true;
                    sArr4 = f63180;
                    i31 = 140;
                    i32 = 3;
                    if (C1419.f5860 >= 0) {
                        iM11309 = ThreadFactoryC3888.m11306("᩵ܺ") ^ i23;
                        i24 = ((iM11309 ^ i22) * (-31057)) ^ (-745452238);
                        i9 = 899310911;
                    } else {
                        iM11309 = (i22 - ThreadFactoryC3888.m11306("ۗۡ")) * (-119);
                        i24 = ((iM11309 ^ i23) * 26903) ^ (-245925800);
                        i9 = -656427078;
                    }
                    i25 = iM11309 ^ i9;
                    viewOnClickListenerC19680 = this;
                    c8392 = c8392;
                    sArr5 = sArr5;
                    i20 = i20;
                    int i317 = i27;
                    i30 = i3;
                    i27 = i317;
                    break;
                case -1332756878:
                case -552200558:
                    C3743.m10954(textInputLayout, ThreadFactoryC3888.m11306(C1937.m6288(f63180, 162, 3, i26)) ^ 2127465242);
                    break;
                case -1274378223:
                case -16447805:
                    iM6355 = iM6355;
                    i20 = i20;
                    sArr4 = sArr4;
                    i31 = i31;
                    i32 = i32;
                    sArr5 = sArr5;
                    c8392 = c8392;
                    z = z ? 1 : 0;
                    int i49 = i30;
                    i27 = i27;
                    i3 = i49;
                    s2 = sArr3[c];
                    i18 = s2 * s2;
                    i19 = 123054649;
                    if (C1460.m5050() != 0) {
                        iM11308 = C19806.m45029("֫᩸") ^ i23;
                        i24 = ((iM11308 ^ i22) * 16037) ^ (-152308557);
                        i5 = -1370713390;
                    } else {
                        iM11308 = ThreadFactoryC3888.m11306("᩵ۖ") ^ i22;
                        i24 = ((iM11308 ^ i23) * 4501) ^ (-560968057);
                        i5 = 1805280297;
                    }
                    i6 = iM11308 ^ i5;
                    i32 = i32;
                    i31 = i31;
                    z = z;
                    sArr4 = sArr4;
                    iM6355 = iM6355;
                    i25 = i6;
                    c8392 = c8392;
                    sArr5 = sArr5;
                    i20 = i20;
                    viewOnClickListenerC19680 = this;
                    int i318 = i27;
                    i30 = i3;
                    i27 = i318;
                    break;
                case -1260590672:
                case -617356809:
                    C7105.m18985();
                    if (!C19806.f63586) {
                        sArr5 = sArr5;
                        c8392 = c8392;
                        z = z ? 1 : 0;
                        s = s2;
                        int i410 = i30;
                        i27 = i27;
                        i3 = i410;
                        iM11307 = (ThreadFactoryC3888.m11306("ۛ᩵") ^ i22) * 49;
                        i24 = ((iM11307 ^ i23) * (-31445)) ^ 1424107530;
                        i4 = -1612595939;
                        i6 = iM11307 ^ i4;
                        s2 = s;
                        i32 = i32;
                        i31 = i31;
                        z = z;
                        sArr4 = sArr4;
                        iM6355 = iM6355;
                        i25 = i6;
                        c8392 = c8392;
                        sArr5 = sArr5;
                        i20 = i20;
                        viewOnClickListenerC19680 = this;
                        int i319 = i27;
                        i30 = i3;
                        i27 = i319;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۨ") ^ i23;
                        i = ((iM11306 ^ i22) * (-8227)) ^ 161532529;
                        i2 = 587003438;
                        i25 = iM11306 ^ i2;
                        i24 = i;
                    }
                    break;
                case -1225727234:
                case -816251020:
                    C14411.m34674(abstractActivityC12483, c8392);
                    break;
                case -1219890458:
                case 1424914061:
                    viewOnClickListenerC19680.m44809(z2);
                    C13330 c13330 = new C13330(viewOnClickListenerC19680, strM3408);
                    if (RunnableC3388.f12514 < 0) {
                        C3743.m10965(new Thread(new RunnableC18705(0, strM3408, strM3407, abstractActivityC12483, c13330)));
                    }
                    iM113010 = (i23 - C19806.m45029("ۗۨ")) * 101;
                    i14 = ((iM113010 ^ i22) * 26225) ^ (-1258456411);
                    i15 = -1208731200;
                    i25 = iM113010 ^ i15;
                    i24 = i14;
                    i28 = i28;
                    break;
                case -1074582222:
                case 2074671689:
                    i28 = i28;
                    strM3408 = C0817.m3407(editableM10576);
                    if (C12529.m31136((CharSequence) strM3407, (CharSequence) C2642.m8172(f63180, 152, 1, i26), z2)) {
                        iM113010 = (i22 - ThreadFactoryC3888.m11306("ۘ֨")) * 29;
                        i14 = ((iM113010 ^ i23) * 9727) ^ 1311184074;
                        i15 = -2083986261;
                    } else {
                        iM113010 = C19806.m45029("ۖۨ") ^ i23;
                        i14 = ((iM113010 ^ i22) * 17123) ^ 218511161;
                        i15 = 889254738;
                    }
                    i25 = iM113010 ^ i15;
                    i24 = i14;
                    i28 = i28;
                    break;
                case -1032108050:
                case 557422228:
                    C14411.m34677(abstractActivityC12483, c8392);
                    break;
                case -995221382:
                case 966935508:
                    i28 = i28;
                    textInputLayoutArr[z2 ? 1 : 0] = textInputLayout2;
                    textInputLayout = viewOnClickListenerC19680.f63183;
                    textInputLayoutArr[z ? 1 : 0] = textInputLayout;
                    if (!C19328.m44319(textInputLayoutArr)) {
                        iM113010 = ThreadFactoryC3888.m11306("֡ۚ") ^ i23;
                        i14 = ((iM113010 ^ i22) * (-27097)) ^ (-1945145475);
                        i15 = 1570418783;
                        i25 = iM113010 ^ i15;
                        i24 = i14;
                        i28 = i28;
                    } else {
                        iM6355 = iM6355;
                        i28 = i28;
                        sArr4 = sArr4;
                        i31 = i31;
                        i32 = i32;
                        i20 = i20;
                        sArr5 = sArr5;
                        c8392 = c8392;
                        z = z ? 1 : 0;
                        int i50 = i30;
                        i27 = i27;
                        i3 = i50;
                        iM45029 = (C19806.m45029("᩵᩸") ^ i23) * q.h;
                        i7 = ((iM45029 ^ i22) * (-27441)) ^ 1952115374;
                        i8 = -1960927701;
                        i6 = iM45029 ^ i8;
                        i24 = i7;
                        i32 = i32;
                        i31 = i31;
                        z = z;
                        sArr4 = sArr4;
                        iM6355 = iM6355;
                        i25 = i6;
                        c8392 = c8392;
                        sArr5 = sArr5;
                        i20 = i20;
                        viewOnClickListenerC19680 = this;
                        int i3110 = i27;
                        i30 = i3;
                        i27 = i3110;
                    }
                    break;
                case -746711608:
                case 1852290413:
                    i3 = i30;
                    i26 = 24117;
                    iM45029 = ThreadFactoryC3888.m11306("ۧۨ") ^ i23;
                    i7 = ((iM45029 ^ i22) * (-19989)) ^ (-377980955);
                    i8 = -1183549625;
                    i6 = iM45029 ^ i8;
                    i24 = i7;
                    i32 = i32;
                    i31 = i31;
                    z = z;
                    sArr4 = sArr4;
                    iM6355 = iM6355;
                    i25 = i6;
                    c8392 = c8392;
                    sArr5 = sArr5;
                    i20 = i20;
                    viewOnClickListenerC19680 = this;
                    int i3111 = i27;
                    i30 = i3;
                    i27 = i3111;
                    break;
                case -615384141:
                case 269104173:
                    C2642.m8170(textInputLayout2, C19806.m45029(C1977.m6363(f63180, 156, 3, i26)) ^ 2127174612);
                    break;
                case -590680072:
                case 236793181:
                    i28 = i28;
                    if (C1334.m4735(strM3407)) {
                        iM113010 = C19806.m45029("ܿۗ") ^ i22;
                        i14 = ((iM113010 ^ i23) * 18557) ^ (-1133020118);
                        i15 = -556067345;
                    } else {
                        iM113010 = ThreadFactoryC3888.m11306("۟ۙ") ^ i23;
                        i14 = ((iM113010 ^ i22) * 14957) ^ 742209868;
                        i15 = 852890701;
                    }
                    i25 = iM113010 ^ i15;
                    i24 = i14;
                    i28 = i28;
                    break;
                case -377902567:
                case 1966247504:
                    if (!C3743.f13569) {
                        i20 = i20;
                        sArr5 = sArr5;
                        c8392 = c8392;
                        int i411 = i30;
                        i27 = i27;
                        i3 = i411;
                        iM11309 = ThreadFactoryC3888.m11306("᩵ܺ") ^ i23;
                        i24 = ((iM11309 ^ i22) * (-31057)) ^ (-745452238);
                        i9 = 899310911;
                        i25 = iM11309 ^ i9;
                        viewOnClickListenerC19680 = this;
                        c8392 = c8392;
                        sArr5 = sArr5;
                        i20 = i20;
                        int i3112 = i27;
                        i30 = i3;
                        i27 = i3112;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۨ") ^ i23;
                        i = ((iM11306 ^ i22) * (-8227)) ^ 161532529;
                        i2 = 587003438;
                        i25 = iM11306 ^ i2;
                        i24 = i;
                    }
                    break;
                case -283696734:
                case 1096812881:
                    iM6355 = iM6355;
                    i20 = i20;
                    sArr4 = sArr4;
                    i32 = i32;
                    sArr5 = sArr5;
                    c8392 = c8392;
                    z = z ? 1 : 0;
                    int i51 = i30;
                    i27 = i27;
                    i3 = i51;
                    i31 = i31;
                    C2704.m8238(view, C3577.m10571(f63180, 139, 1, i26));
                    if (f63179.m50803()) {
                        iM45029 = (C19806.m45029("᩵᩸") ^ i23) * q.h;
                        i7 = ((iM45029 ^ i22) * (-27441)) ^ 1952115374;
                        i8 = -1960927701;
                    } else {
                        iM45029 = (C19806.m45029("᩶ۘ") ^ i22) * 23;
                        i7 = ((iM45029 ^ i23) * 6103) ^ 1318010611;
                        i8 = 1205792443;
                    }
                    i6 = iM45029 ^ i8;
                    i24 = i7;
                    i32 = i32;
                    i31 = i31;
                    z = z;
                    sArr4 = sArr4;
                    iM6355 = iM6355;
                    i25 = i6;
                    c8392 = c8392;
                    sArr5 = sArr5;
                    i20 = i20;
                    viewOnClickListenerC19680 = this;
                    int i3113 = i27;
                    i30 = i3;
                    i27 = i3113;
                    break;
                case -196951075:
                case 677260570:
                    C2642.m8170(textInputLayout2, C19806.m45029(C0278.m1774(f63180, 153, 3, i26)) ^ 2124688942);
                    break;
                case -191871933:
                case 761209089:
                    new ViewOnClickListenerC2476(abstractActivityC12483, dialogInterfaceC19356);
                    C1668.m5572(dialogInterfaceC19356);
                    break;
                case -182320001:
                case 454614651:
                    i28 = i28;
                    EditText editTextM3740 = C0962.m3740(textInputLayout);
                    ViewGroupOnHierarchyChangeListenerC1916.m6243(editTextM3740);
                    editableM10576 = C3577.m10576(editTextM3740);
                    if (C1461.f5957 > 0) {
                        iM113010 = (i22 - ThreadFactoryC3888.m11306("᩵ۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i14 = ((iM113010 ^ i23) * 933) ^ 2017494351;
                        i15 = -2133146606;
                        i25 = iM113010 ^ i15;
                        i24 = i14;
                        i28 = i28;
                    } else {
                        i28 = i28;
                        sArr5 = sArr5;
                        c8392 = c8392;
                        z = z ? 1 : 0;
                        s = s2;
                        int i412 = i30;
                        i27 = i27;
                        i3 = i412;
                        iM11307 = (ThreadFactoryC3888.m11306("ۛ᩵") ^ i22) * 49;
                        i24 = ((iM11307 ^ i23) * (-31445)) ^ 1424107530;
                        i4 = -1612595939;
                        i6 = iM11307 ^ i4;
                        s2 = s;
                        i32 = i32;
                        i31 = i31;
                        z = z;
                        sArr4 = sArr4;
                        iM6355 = iM6355;
                        i25 = i6;
                        c8392 = c8392;
                        sArr5 = sArr5;
                        i20 = i20;
                        viewOnClickListenerC19680 = this;
                        int i3114 = i27;
                        i30 = i3;
                        i27 = i3114;
                    }
                    break;
                case -128997655:
                case 200904450:
                    i28 = i28;
                    EditText editTextM3741 = C0962.m3740(textInputLayout2);
                    ViewGroupOnHierarchyChangeListenerC1916.m6243(editTextM3741);
                    strM3407 = C0817.m3407(C3577.m10576(editTextM3741));
                    if (C2788.f10625 < 0) {
                        iM113010 = ThreadFactoryC3888.m11306("֨ܶ") ^ i23;
                        i14 = ((iM113010 ^ i22) * (-29555)) ^ (-306884531);
                        i15 = -1556006667;
                        i25 = iM113010 ^ i15;
                        i24 = i14;
                        i28 = i28;
                    } else {
                        i28 = i28;
                        i20 = i20;
                        sArr5 = sArr5;
                        c8392 = c8392;
                        int i413 = i30;
                        i27 = i27;
                        i3 = i413;
                        iM11309 = ThreadFactoryC3888.m11306("᩵ܺ") ^ i23;
                        i24 = ((iM11309 ^ i22) * (-31057)) ^ (-745452238);
                        i9 = 899310911;
                        i25 = iM11309 ^ i9;
                        viewOnClickListenerC19680 = this;
                        c8392 = c8392;
                        sArr5 = sArr5;
                        i20 = i20;
                        int i3115 = i27;
                        i30 = i3;
                        i27 = i3115;
                    }
                    break;
                case 173271446:
                case 2140307897:
                    short[] sArr8 = sArr2;
                    if (iM6354 == (C19806.m45029(CallableC1627.m5502(sArr8, i28, i27, i26)) ^ 2104393157)) {
                        int iM113015 = ThreadFactoryC3888.m11306("᩹۠") ^ i22;
                        sArr2 = sArr8;
                        i24 = ((iM113015 ^ i23) * 6971) ^ 300326225;
                        i25 = iM113015 ^ (-1265502952);
                    } else {
                        sArr2 = sArr8;
                        iM11306 = C19806.m45029("ۗۜ") ^ i22;
                        i = ((iM11306 ^ i23) * 30913) ^ 1647937877;
                        i2 = 1967207492;
                        i25 = iM11306 ^ i2;
                        i24 = i;
                    }
                    break;
                case 184837641:
                case 1290567661:
                    C1875.m6086();
                    C1377.m4833();
                    iM113010 = (i23 - C19806.m45029("ۗۨ")) * 101;
                    i14 = ((iM113010 ^ i22) * 26225) ^ (-1258456411);
                    i15 = -1208731200;
                    i25 = iM113010 ^ i15;
                    i24 = i14;
                    i28 = i28;
                    break;
                case 352244383:
                case 1722245700:
                    i16 = i27;
                    c8391 = c8392;
                    iM6356 = C1977.m6354(view);
                    sArr = f63180;
                    i20 = 143;
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        i17 = 3;
                        int iM113016 = ThreadFactoryC3888.m11306("ۘۛ") ^ i22;
                        short[] sArr9 = sArr;
                        i24 = ((iM113016 ^ i23) * (-20023)) ^ 423063953;
                        i25 = iM113016 ^ (-241464582);
                        i27 = i16;
                        i30 = i17;
                        c8392 = c8391;
                        sArr5 = sArr9;
                    } else {
                        int iM113017 = (ThreadFactoryC3888.m11306("֫ۛ") ^ i23) * (-119);
                        i = ((iM113017 ^ i22) * (-19815)) ^ (-1345935994);
                        i25 = iM113017 ^ 1393597645;
                        c8392 = c8391;
                        i27 = i16;
                        i30 = 3;
                        sArr5 = sArr;
                        i24 = i;
                    }
                    break;
                case 579497111:
                case 728482516:
                    int i52 = i20;
                    short[] sArr10 = sArr5;
                    int i53 = i30;
                    i27 = i27;
                    i3 = i53;
                    C8391 c8393 = new C8391(viewOnClickListenerC19680.m44809(z), viewOnClickListenerC19680);
                    int iM6357 = C1977.m6354(view);
                    Object[] objArr = z ? 1 : 0;
                    i29 = i29;
                    if (iM6357 == i29) {
                        iM450210 = ThreadFactoryC3888.m11306("᩶᩺") ^ i23;
                        i12 = ((iM450210 ^ i22) * 1689) ^ (-1922269579);
                        i13 = -1810136274;
                    } else {
                        iM450210 = C19806.m45029("᩸᩸") ^ i22;
                        i12 = ((iM450210 ^ i23) * 8105) ^ (-221803631);
                        i13 = -292480295;
                    }
                    i25 = iM450210 ^ i13;
                    i24 = i12;
                    sArr5 = sArr10;
                    z = objArr == true ? 1 : 0;
                    i20 = i52;
                    c8392 = c8393;
                    int i3116 = i27;
                    i30 = i3;
                    i27 = i3116;
                    break;
                case 633300399:
                case 1049761792:
                    C1066.m4023();
                    if (!C0962.f3784) {
                        sArr = sArr5;
                        i17 = i30;
                        c8391 = c8392;
                        i16 = i27;
                        int iM113018 = ThreadFactoryC3888.m11306("ۘۛ") ^ i22;
                        short[] sArr11 = sArr;
                        i24 = ((iM113018 ^ i23) * (-20023)) ^ 423063953;
                        i25 = iM113018 ^ (-241464582);
                        i27 = i16;
                        i30 = i17;
                        c8392 = c8391;
                        sArr5 = sArr11;
                    } else {
                        iM11306 = C19806.m45029("۫۠") ^ i23;
                        i = ((iM11306 ^ i22) * (-20177)) ^ (-1845705747);
                        i2 = -1924090202;
                        i25 = iM11306 ^ i2;
                        i24 = i;
                    }
                    break;
                case 739210422:
                case 1677382750:
                    C3286.m9798();
                    if (C2249.f8050 >= 0) {
                        iM11306 = (C19806.m45029("᩷ۨ") ^ i22) * 115;
                        i = ((iM11306 ^ i23) * (-11997)) ^ (-1969166794);
                        i2 = -1193902325;
                        i25 = iM11306 ^ i2;
                        i24 = i;
                    } else {
                        iM113010 = (i23 - C19806.m45029("ۗۨ")) * 101;
                        i14 = ((iM113010 ^ i22) * 26225) ^ (-1258456411);
                        i15 = -1208731200;
                        i25 = iM113010 ^ i15;
                        i24 = i14;
                        i28 = i28;
                    }
                    break;
                case 757291398:
                case 990796949:
                    i28 = i28;
                    strM10964 = C3743.m10964(f63180, 149, 3, i26);
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        i28 = i28;
                        i20 = i20;
                        sArr5 = sArr5;
                        c8392 = c8392;
                        int i414 = i30;
                        i27 = i27;
                        i3 = i414;
                        iM11309 = ThreadFactoryC3888.m11306("᩵ܺ") ^ i23;
                        i24 = ((iM11309 ^ i22) * (-31057)) ^ (-745452238);
                        i9 = 899310911;
                        i25 = iM11309 ^ i9;
                        viewOnClickListenerC19680 = this;
                        c8392 = c8392;
                        sArr5 = sArr5;
                        i20 = i20;
                        int i3117 = i27;
                        i30 = i3;
                        i27 = i3117;
                    } else {
                        iM113010 = ThreadFactoryC3888.m11306("֡۠") ^ i23;
                        i14 = ((iM113010 ^ i22) * (-7901)) ^ (-786654219);
                        i15 = -1023578148;
                        i25 = iM113010 ^ i15;
                        i24 = i14;
                        i28 = i28;
                    }
                    break;
                case 766230234:
                case 1689601427:
                    C2642.m8170(textInputLayout2, ThreadFactoryC3888.m11306(C1461.m5070(f63180, 159, 3, i26)) ^ 2129502113);
                    break;
                case 987799359:
                case 1678704095:
                    if (C3660.f13403 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۨ") ^ i23;
                        i = ((iM11306 ^ i22) * (-8227)) ^ 161532529;
                        i2 = 587003438;
                    } else {
                        iM11306 = C19806.m45029("۫۠") ^ i23;
                        i = ((iM11306 ^ i22) * (-20177)) ^ (-1845705747);
                        i2 = -1924090202;
                    }
                    i25 = iM11306 ^ i2;
                    i24 = i;
                    break;
                default:
                    i3 = i30;
                    i26 = 47436;
                    iM45029 = ThreadFactoryC3888.m11306("ۧۨ") ^ i23;
                    i7 = ((iM45029 ^ i22) * (-19989)) ^ (-377980955);
                    i8 = -1183549625;
                    i6 = iM45029 ^ i8;
                    i24 = i7;
                    i32 = i32;
                    i31 = i31;
                    z = z;
                    sArr4 = sArr4;
                    iM6355 = iM6355;
                    i25 = i6;
                    c8392 = c8392;
                    sArr5 = sArr5;
                    i20 = i20;
                    viewOnClickListenerC19680 = this;
                    int i3118 = i27;
                    i30 = i3;
                    i27 = i3118;
                    break;
            }
            return;
        }
    }
}
