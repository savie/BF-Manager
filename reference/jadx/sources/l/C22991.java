package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.pro.cb;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.ec.rfc8032.Scalar448;

/* JADX INFO: renamed from: l.᩺۫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5MS */
/* JADX INFO: loaded from: classes.dex */
public final class C22991 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f74728 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final AbstractC23844 f74729;

    /* JADX INFO: renamed from: ܶۜܿ, reason: not valid java name and contains not printable characters */
    private static final short[] f74730 = {5427, -20510, -20489, -20490, -20487, -20487, -20491, -20490, -20491, -20504, -20482, -20493, -20489, -20481, -20492, -20482, -20504, -20485, -20499, -20485, -20488, -20490, -20481, -20484, -20491, -20492, -20498, -20484, -20504, -20485, -20487, -20498, -20493, -20491, -20492, -20493, -20482, -20493, -20492, -20498, -20481, -20504, -20502, -20491, -20490, -20485, -20498, -20491, -20504, -20493, -20492, -20498, -20481, -20483, -20481, -20504, -20490, -20485, -20509, -20491, -20497, -20498, -20489, -20493, -20502, -20489, -20485, -20502, -20489, -20481, -20492, -20497, -20502, -20490, -20497, -20504, -20485, -20490, -20503, -20504, -20485, -20499, -20503, -20498, -20509, -20490, -20481, -20503, -20498, -20504, -20493, -20492, -20483, -20498, -20504, -20485, -20492, -20503, -20493, -20498, -20493, -20491, -20492, -20540, -20485, -20498, -20498, -20504, -20553, -20502, -20504, -20493, -20500, -20485, -20498, -20481, -20485, -20498, -20498, -20504, -20485, -20504, -20504, -20485, -20509, -20485, -20492, -20493, -20489, -20485, -20492, -20493, -20489, -20485, -20498, -20491, -20504, -20488, -20491, -20491, -20490, 3398, -30249, -30263, -30263, -30249, 4232, -13528, -13507, -13507, -13509, -13529, -13528, -13505, -13536, -13522, -13528, -13507, -13536, -13530, -13529, -13526, -13530, -13531, -13530, -13509, -13532, -13524, -13529, -13508, -13528, -13529, -13536, -13532, -13528, -13507, -13530, -13509, -13536, -13529, -13507, -13524, -13509, -13511, -13530, -13531, -13528, -13507, -13530, -13509, -13531, -13528, -13520, -13530, -13508, -13507, -13536, -13523, -13528, -13509, -13509, -13528, -13520, -13511, -13531, -13508, -13509, -13528, -13531, -13510, -13510, -13507, -13509, -13536, -13529, -13522, -13510, -13507, -13520, -13531, -13524, -13525, -13530, -13530, -13531, -18228, 19101, -23682, -13523, -13536, -13532, -13524, -13529, -13521, -13530, -13529, -13507, -13521, -13509, -13528, -13526, -13507, -13536, -13530, -13529, -13536, -13529, -13507, -13524, -13522, -13524, -13509, -13532, -13536, -13511, -13532, -13528, -13511, -13523, -13509, -13528, -13506, -13528, -13525, -13531, -13524, -13528, -13529, -13536, -13532, -13509, -13528, -13506, -13519, -13532, -13531, -13528, -13529, -13536, -13532, -13528, -13507, -13536, -13530, -13529, -13468, -13531, -13536, -13510, -13507, -13525, -13536, -13507, -13532, -13528, -13511, -13509, -13536, -13511, -13511, -13531, -13524, -13509, -13530, -13507, -13528, -13507, -13524, -13505, -13524, -13526, -13507, -13530, -13509, -13528, -13529, -13536, -13532, -13528, -13507, -13524, -13523, -13468, -13510, -13524, -13531, -13524, -13526, -13507, -13530, -13509, -13528, -13526, -13526, -13524, -13510, -13510, -13536, -13525, -13536, -13531, -13536, -13507, -13520, -13468, -13510, -13524, -13509, -13505, -13536, -13526, -13524, -13531, -13528, -13520, -13524, -13509, -13468, -13531, -13536, -13510, -13507, -13526, -13531, -13536, -13511, -13528, -13531, -13511, -13535, -13528, -13536, -13529, -13510, -13524, -13507, -13532, -13524, -13509, -13522, -13524, -13511, -13528, -13507, -13535, -13510, -13521, -13530, -13529, -13507, -13468, -13521, -13528, -13532, -13536, -13531, -13520, -13510, -13526, -13528, -13531, -13524, -13510, -13535, -13528, -13511, -13524, -13507, -13509, -13528, -13529, -13510, -13531, -13528, -13507, -13524, -13510, -13524, -13531, -13524, -13526, -13507, -13530, -13509, -13529, -13524, -13507, -13506, -13530, -13509, -13534, -13468, -13510, -13524, -13526, -13508, -13509, -13536, -13507, -13520, -13468, -13526, -13530, -13529, -13521, -13536, -13522, -13528, -13529, -13536, -13532, -13528, -13507, -13524, -13523, -13468, -13509, -13530, -13507, -13528, -13507, -13524, -13528, -13529, -13536, -13532, -13528, -13507, -13524, -13523, -13468, -13505, -13524, -13526, -13507, -13530, -13509, -13465, -13525, -13532, -13511, -13465, -13522, -13536, -13521, -13465, -13533, -13511, -13522, -13465, -13530, -13507, -13521, -13465, -13511, -13529, -13522, -13465, -13507, -13507, -13526, -13465, -13507, -13507, -13521, -13465, -13506, -13524, -13525, -13511, -13510, -13524, -13507, -13507, -13520, -13511, -13524, -13460, -13447, -13445, -13551, -13505, -13536, -13524, -13506, -13525, -13508, -13507, -13507, -13530, -13529, -13511, -13509, -13524, -13521, -13524, -13509, -13524, -13529, -13526, -13524, -13510, -13526, -13509, -13524, -13524, -13529, -13540, -13529, -13534, -13529, -13530, -13506, -13529, -13463, -13521, -13536, -13509, -13510, -13507, -13463, -13507, -13528, -13522, -13453, -13463, 8245, 31285, 31266, 31284, 31338, 31330, 31351, 31349, 31295, 31336, 31285, 31266, 31284, 31336, 31284, 31283, 31285, 31278, 31273, 31264, 31270, 31285, 31285, 31270, 31294, 31287, 31275, 31282, 31285, 31270, 31275, 31284, 31337, 31295, 31274, 31275};

    static {
        short[] sArr;
        short[] sArr2;
        short[] sArr3;
        short[] sArr4;
        short[] sArr5;
        int i;
        int i2;
        short[] sArr6;
        short[] sArr7;
        short[] sArr8;
        int i3;
        int i4;
        short[] sArr9;
        String[] strArr;
        int i5;
        int i6;
        short[] sArr10;
        int i7;
        short[] sArr11;
        short[] sArr12;
        short[] sArr13;
        short[] sArr14;
        int i8;
        int i9;
        int i10;
        int i11;
        int iM11306;
        int i12;
        short[] sArr15;
        int i13;
        short[] sArr16;
        int iM11307;
        int i14;
        int i15;
        short[] sArr17;
        short[] sArr18;
        int i16;
        int iM11308;
        int i17;
        String strM4365;
        int i18;
        int i19;
        short[] sArr19;
        int i20;
        int i21;
        int i22;
        int iM45029;
        int i23;
        int i24;
        short[] sArr20;
        short[] sArr21;
        short[] sArr22;
        short[] sArr23;
        int i25;
        int i26;
        int iM11309;
        int i27;
        int i28;
        short[] sArr24;
        int i29;
        int i30;
        int i31;
        int iM113010;
        int i32;
        int i33 = C2477.f9839;
        int i34 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM450210 = C19806.m45029("ۨۤ") ^ i34;
        int i35 = ((iM450210 ^ i33) * 24883) ^ (-1925883244);
        short s = 0;
        int i36 = 0;
        int i37 = 0;
        String strM9869 = null;
        String[] strArr2 = null;
        String strM3406 = null;
        String str = null;
        short[] sArr25 = null;
        short[] sArr26 = null;
        short[] sArr27 = null;
        short[] sArr28 = null;
        short[] sArr29 = null;
        short[] sArr30 = null;
        short[] sArr31 = null;
        int i38 = 798193042;
        String strM8640 = null;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        String strM10901 = null;
        String strM4969 = null;
        String strM98610 = null;
        String strM8172 = null;
        String strM7604 = null;
        String strM5502 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        short[] sArr32 = null;
        short[] sArr33 = null;
        short[] sArr34 = null;
        int i42 = iM450210 ^ (-153455331);
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        int i46 = 0;
        int i47 = 0;
        String strM6685 = null;
        String strM4366 = null;
        String strM9715 = null;
        String str5 = null;
        short[] sArr35 = null;
        int i48 = 0;
        String strM7605 = null;
        String strM3009 = null;
        short[] sArr36 = null;
        short[] sArr37 = null;
        String strM3361 = null;
        String str6 = null;
        short[] sArr38 = null;
        int i49 = 0;
        String strM8470 = null;
        int i50 = 0;
        while (true) {
            int i51 = i42 ^ (i35 & (((i38 ^ i33) * (-18651)) >> 31));
            switch (i51) {
                case -2103824085:
                case -601326878:
                    i51 = i51;
                    sArr34 = sArr34;
                    sArr33 = sArr33;
                    sArr36 = sArr36;
                    sArr32 = sArr32;
                    i47 = i47;
                    sArr38 = sArr38;
                    sArr13 = sArr27;
                    sArr29 = sArr29;
                    sArr30 = sArr30;
                    sArr4 = sArr37;
                    i50 = i50;
                    i45 = i45;
                    sArr5 = sArr26;
                    sArr11 = sArr31;
                    i7 = i39;
                    i44 = i44;
                    i48 = i48;
                    sArr14 = sArr25;
                    i = i43;
                    i46 = i46;
                    int i52 = i40;
                    sArr35 = sArr35;
                    sArr6 = sArr28;
                    i49 = i49;
                    i41 = i41;
                    i2 = i52;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        sArr9 = sArr30;
                        strArr = strArr2;
                        sArr12 = sArr6;
                        i8 = i41;
                        int iM113011 = ThreadFactoryC3888.m11306("᩸᩶") ^ i33;
                        i9 = i8;
                        iM11306 = iM113011;
                        i11 = ((iM113011 ^ i34) * 31953) ^ 1470290542;
                        i10 = 887643437;
                        i39 = i7;
                        i42 = iM11306 ^ i10;
                        strArr2 = strArr;
                        i12 = i11;
                        sArr38 = sArr38;
                        i35 = i12;
                        i46 = i46;
                        sArr37 = sArr4;
                        i38 = i51;
                        sArr29 = sArr29;
                        sArr35 = sArr35;
                        i40 = i2;
                        sArr33 = sArr33;
                        sArr32 = sArr32;
                        i47 = i47;
                        sArr25 = sArr14;
                        i41 = i9;
                        i48 = i48;
                        sArr36 = sArr36;
                        sArr26 = sArr5;
                        i50 = i50;
                        sArr30 = sArr9;
                        i43 = i;
                        i44 = i44;
                        sArr31 = sArr11;
                        i45 = i45;
                        sArr27 = sArr13;
                        sArr34 = sArr34;
                        i22 = i49;
                        sArr28 = sArr12;
                        i49 = i22;
                    }
                    i46 = i46;
                    sArr32 = sArr32;
                    i47 = i47;
                    int iM113012 = ThreadFactoryC3888.m11306("ۡ֨") ^ i34;
                    i21 = ((iM113012 ^ i33) * (-30347)) ^ (-607202025);
                    i20 = iM113012 ^ 2085495015;
                    i29 = i49;
                    sArr36 = sArr36;
                    sArr19 = sArr14;
                    i49 = i29;
                    sArr38 = sArr38;
                    i42 = i20;
                    i39 = i7;
                    i43 = i;
                    sArr15 = sArr13;
                    i35 = i21;
                    i48 = i48;
                    i44 = i44;
                    sArr37 = sArr4;
                    sArr34 = sArr34;
                    sArr25 = sArr19;
                    sArr33 = sArr33;
                    sArr26 = sArr5;
                    sArr31 = sArr11;
                    i45 = i45;
                    i50 = i50;
                    i38 = i51;
                    sArr29 = sArr29;
                    sArr27 = sArr15;
                    sArr30 = sArr30;
                    i22 = i49;
                    sArr28 = sArr6;
                    sArr35 = sArr35;
                    i40 = i2;
                    i41 = i41;
                    i49 = i22;
                    break;
                case -1948259159:
                case -742579801:
                    i51 = i51;
                    i49 = i49;
                    sArr34 = sArr34;
                    sArr33 = sArr33;
                    sArr36 = sArr36;
                    sArr32 = sArr32;
                    i47 = i47;
                    sArr38 = sArr38;
                    short[] sArr39 = sArr27;
                    sArr29 = sArr29;
                    short[] sArr40 = sArr30;
                    int i53 = i41;
                    sArr4 = sArr37;
                    i50 = i50;
                    i45 = i45;
                    sArr5 = sArr26;
                    sArr11 = sArr31;
                    i2 = i40;
                    i44 = i44;
                    sArr35 = sArr35;
                    i48 = i48;
                    sArr14 = sArr25;
                    i = i43;
                    i46 = i46;
                    i7 = i39;
                    sArr13 = sArr39;
                    strM7604 = C2477.m7604(sArr13, i7, 4, i);
                    strM5502 = CallableC1627.m5502(f74730, 72, 7, i);
                    short[] sArr41 = f74730;
                    if (C1419.m4973()) {
                        i8 = i53;
                        sArr12 = sArr41;
                        sArr9 = sArr40;
                        strArr = strArr2;
                        int iM113013 = ThreadFactoryC3888.m11306("᩸᩶") ^ i33;
                        i9 = i8;
                        iM11306 = iM113013;
                        i11 = ((iM113013 ^ i34) * 31953) ^ 1470290542;
                        i10 = 887643437;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫᩻") ^ i33) * (-5);
                        i11 = ((iM11306 ^ i34) * (-4603)) ^ (-613279503);
                        i10 = 1799543451;
                        i9 = i53;
                        sArr12 = sArr41;
                        sArr9 = sArr40;
                        strArr = strArr2;
                    }
                    i39 = i7;
                    i42 = iM11306 ^ i10;
                    strArr2 = strArr;
                    i12 = i11;
                    sArr38 = sArr38;
                    i35 = i12;
                    i46 = i46;
                    sArr37 = sArr4;
                    i38 = i51;
                    sArr29 = sArr29;
                    sArr35 = sArr35;
                    i40 = i2;
                    sArr33 = sArr33;
                    sArr32 = sArr32;
                    i47 = i47;
                    sArr25 = sArr14;
                    i41 = i9;
                    i48 = i48;
                    sArr36 = sArr36;
                    sArr26 = sArr5;
                    i50 = i50;
                    sArr30 = sArr9;
                    i43 = i;
                    i44 = i44;
                    sArr31 = sArr11;
                    i45 = i45;
                    sArr27 = sArr13;
                    sArr34 = sArr34;
                    i22 = i49;
                    sArr28 = sArr12;
                    i49 = i22;
                    break;
                case -1889412234:
                case -582160457:
                    C7105.m18985();
                    throw new RuntimeException();
                case -1850230133:
                case -1123677431:
                    i51 = i51;
                    sArr33 = sArr33;
                    sArr36 = sArr36;
                    sArr32 = sArr32;
                    sArr38 = sArr38;
                    short[] sArr42 = sArr25;
                    sArr15 = sArr27;
                    sArr29 = sArr29;
                    sArr30 = sArr30;
                    i41 = i41;
                    sArr4 = sArr37;
                    i50 = i50;
                    i45 = i45;
                    i46 = i46;
                    sArr5 = sArr26;
                    sArr11 = sArr31;
                    i2 = i40;
                    i44 = i44;
                    sArr35 = sArr35;
                    i48 = i48;
                    sArr6 = sArr28;
                    i = i43;
                    sArr14 = sArr42;
                    strM4366 = C1189.m4365(sArr14, 37, 12, i);
                    sArr34 = f74730;
                    if (!C0797.f3386) {
                        int iM113014 = ThreadFactoryC3888.m11306("᩸ܿ") ^ i34;
                        int i54 = ((iM113014 ^ i33) * 15677) ^ 1203078816;
                        i13 = iM113014 ^ (-359764467);
                        i47 = 49;
                        sArr33 = sArr33;
                        i49 = 7;
                        sArr16 = sArr38;
                        i35 = i54;
                        i42 = i13;
                        sArr38 = sArr16;
                        i43 = i;
                        i46 = i46;
                        i44 = i44;
                        sArr37 = sArr4;
                        sArr36 = sArr36;
                        sArr32 = sArr32;
                        sArr25 = sArr14;
                        i48 = i48;
                        sArr26 = sArr5;
                        sArr31 = sArr11;
                        i45 = i45;
                        i50 = i50;
                        i38 = i51;
                        sArr29 = sArr29;
                        sArr27 = sArr15;
                        sArr30 = sArr30;
                        i22 = i49;
                        sArr28 = sArr6;
                        sArr35 = sArr35;
                        i40 = i2;
                        i41 = i41;
                        i49 = i22;
                    } else {
                        i47 = 49;
                        sArr34 = sArr34;
                        i46 = i46;
                        i7 = i39;
                        sArr13 = sArr15;
                        sArr32 = sArr32;
                        i49 = 7;
                        int iM113015 = ThreadFactoryC3888.m11306("ۡ֨") ^ i34;
                        i21 = ((iM113015 ^ i33) * (-30347)) ^ (-607202025);
                        i20 = iM113015 ^ 2085495015;
                        i29 = i49;
                        sArr36 = sArr36;
                        sArr19 = sArr14;
                        i49 = i29;
                        sArr38 = sArr38;
                        i42 = i20;
                        i39 = i7;
                        i43 = i;
                        sArr15 = sArr13;
                        i35 = i21;
                        i48 = i48;
                        i44 = i44;
                        sArr37 = sArr4;
                        sArr34 = sArr34;
                        sArr25 = sArr19;
                        sArr33 = sArr33;
                        sArr26 = sArr5;
                        sArr31 = sArr11;
                        i45 = i45;
                        i50 = i50;
                        i38 = i51;
                        sArr29 = sArr29;
                        sArr27 = sArr15;
                        sArr30 = sArr30;
                        i22 = i49;
                        sArr28 = sArr6;
                        sArr35 = sArr35;
                        i40 = i2;
                        i41 = i41;
                        i49 = i22;
                    }
                    break;
                case -1810758627:
                case 1473821782:
                    i51 = i51;
                    sArr34 = sArr34;
                    sArr33 = sArr33;
                    sArr36 = sArr36;
                    sArr32 = sArr32;
                    i47 = i47;
                    sArr38 = sArr38;
                    sArr = sArr25;
                    short[] sArr43 = sArr27;
                    sArr29 = sArr29;
                    sArr30 = sArr30;
                    sArr37 = sArr37;
                    i50 = i50;
                    i45 = i45;
                    i46 = i46;
                    sArr5 = sArr26;
                    sArr11 = sArr31;
                    i44 = i44;
                    i48 = i48;
                    i = i43;
                    int i55 = i40;
                    sArr35 = sArr35;
                    sArr6 = sArr28;
                    i49 = i49;
                    i41 = i41;
                    i2 = i55;
                    s = f74730[0];
                    i36 = s * 2;
                    i37 = 1;
                    iM11307 = (ThreadFactoryC3888.m11306("ۗ᩶") ^ i33) * (-109);
                    i14 = 1345175455;
                    i15 = ((iM11307 ^ i34) * 22437) ^ (-349180609);
                    sArr17 = sArr43;
                    sArr14 = sArr;
                    int i56 = i;
                    iM45029 = iM11307;
                    i43 = i56;
                    i23 = iM45029 ^ i14;
                    i39 = i39;
                    sArr37 = sArr37;
                    sArr38 = sArr38;
                    i42 = i23;
                    sArr15 = sArr17;
                    i35 = i15;
                    i46 = i46;
                    i44 = i44;
                    sArr34 = sArr34;
                    sArr33 = sArr33;
                    sArr36 = sArr36;
                    sArr32 = sArr32;
                    i47 = i47;
                    sArr25 = sArr14;
                    i48 = i48;
                    sArr26 = sArr5;
                    sArr31 = sArr11;
                    i45 = i45;
                    i50 = i50;
                    i38 = i51;
                    sArr29 = sArr29;
                    sArr27 = sArr15;
                    sArr30 = sArr30;
                    i22 = i49;
                    sArr28 = sArr6;
                    sArr35 = sArr35;
                    i40 = i2;
                    i41 = i41;
                    i49 = i22;
                    break;
                case -1682344507:
                case -1545877068:
                    i51 = i51;
                    sArr34 = sArr34;
                    sArr33 = sArr33;
                    sArr36 = sArr36;
                    sArr32 = sArr32;
                    i47 = i47;
                    sArr38 = sArr38;
                    sArr = sArr25;
                    sArr5 = sArr26;
                    sArr18 = sArr27;
                    short[] sArr44 = sArr31;
                    sArr29 = sArr29;
                    sArr30 = sArr30;
                    i44 = i44;
                    i45 = i45;
                    i16 = i48;
                    i46 = i46;
                    i = i43;
                    int i57 = i40;
                    sArr35 = sArr35;
                    sArr6 = sArr28;
                    i49 = i49;
                    i41 = i41;
                    i2 = i57;
                    sArr11 = sArr44;
                    strM3406 = C0817.m3406(sArr11, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 5, i);
                    short[] sArr45 = f74730;
                    if (ThreadFactoryC3888.f14547 > 0) {
                        iM11308 = (ThreadFactoryC3888.m11306("۬᩶") + i34) * 87;
                        i17 = ((iM11308 ^ i33) * 24155) ^ 357241945;
                        sArr37 = sArr45;
                        strM4365 = str5;
                        i18 = q.h;
                        i19 = -1992903590;
                        i42 = iM11308 ^ i19;
                        sArr38 = sArr38;
                        sArr30 = sArr30;
                        i35 = i17;
                        str5 = strM4365;
                        i46 = i46;
                        i48 = i16;
                        i38 = i51;
                        sArr29 = sArr29;
                        sArr34 = sArr34;
                        sArr25 = sArr;
                        sArr33 = sArr33;
                        sArr36 = sArr36;
                        sArr32 = sArr32;
                        i47 = i47;
                        sArr26 = sArr5;
                        i50 = i18;
                        i43 = i;
                        i44 = i44;
                        sArr31 = sArr11;
                        i45 = i45;
                        sArr27 = sArr18;
                        i22 = i49;
                        sArr28 = sArr6;
                        sArr35 = sArr35;
                        i40 = i2;
                        i41 = i41;
                        i49 = i22;
                    } else {
                        sArr37 = sArr45;
                        i48 = i16;
                        i50 = q.h;
                        int iM450211 = C19806.m45029("᩸֫") ^ i34;
                        i48 = i48;
                        i15 = ((iM450211 ^ i33) * (-22053)) ^ 185602045;
                        sArr17 = sArr18;
                        sArr14 = sArr;
                        int i58 = i;
                        i23 = iM450211 ^ 1873336383;
                        i43 = i58;
                        sArr38 = sArr38;
                        i42 = i23;
                        sArr15 = sArr17;
                        i35 = i15;
                        i46 = i46;
                        i44 = i44;
                        sArr34 = sArr34;
                        sArr33 = sArr33;
                        sArr36 = sArr36;
                        sArr32 = sArr32;
                        i47 = i47;
                        sArr25 = sArr14;
                        i48 = i48;
                        sArr26 = sArr5;
                        sArr31 = sArr11;
                        i45 = i45;
                        i50 = i50;
                        i38 = i51;
                        sArr29 = sArr29;
                        sArr27 = sArr15;
                        sArr30 = sArr30;
                        i22 = i49;
                        sArr28 = sArr6;
                        sArr35 = sArr35;
                        i40 = i2;
                        i41 = i41;
                        i49 = i22;
                    }
                    break;
                case -1656374544:
                case -4951938:
                    i51 = i51;
                    sArr34 = sArr34;
                    sArr33 = sArr33;
                    sArr36 = sArr36;
                    i47 = i47;
                    sArr38 = sArr38;
                    sArr19 = sArr25;
                    short[] sArr46 = sArr27;
                    short[] sArr47 = sArr31;
                    sArr29 = sArr29;
                    sArr30 = sArr30;
                    sArr4 = sArr37;
                    i44 = i44;
                    i50 = i50;
                    i45 = i45;
                    sArr5 = sArr26;
                    i = i43;
                    i48 = i48;
                    int i59 = i40;
                    sArr35 = sArr35;
                    sArr6 = sArr28;
                    i49 = i49;
                    i41 = i41;
                    i2 = i59;
                    strM10901 = C3722.m10901(f74730, 5, 5, i);
                    sArr32 = f74730;
                    if (C1025.m3861() <= 0) {
                        i46 = 10;
                        i7 = i39;
                        sArr11 = sArr47;
                        sArr13 = sArr46;
                        sArr14 = sArr19;
                        i47 = i47;
                        int iM113016 = ThreadFactoryC3888.m11306("ۡ֨") ^ i34;
                        i21 = ((iM113016 ^ i33) * (-30347)) ^ (-607202025);
                        i20 = iM113016 ^ 2085495015;
                        i29 = i49;
                        sArr36 = sArr36;
                        sArr19 = sArr14;
                        i49 = i29;
                    } else {
                        int iM450212 = (C19806.m45029("֡ܽ") + i33) * (-39);
                        int i60 = ((iM450212 ^ i34) * 31061) ^ (-974097418);
                        i20 = iM450212 ^ (-755771232);
                        i21 = i60;
                        i7 = i39;
                        sArr11 = sArr47;
                        sArr13 = sArr46;
                        sArr36 = sArr36;
                        i47 = i47;
                        i46 = 10;
                    }
                    sArr38 = sArr38;
                    i42 = i20;
                    i39 = i7;
                    i43 = i;
                    sArr15 = sArr13;
                    i35 = i21;
                    i48 = i48;
                    i44 = i44;
                    sArr37 = sArr4;
                    sArr34 = sArr34;
                    sArr25 = sArr19;
                    sArr33 = sArr33;
                    sArr26 = sArr5;
                    sArr31 = sArr11;
                    i45 = i45;
                    i50 = i50;
                    i38 = i51;
                    sArr29 = sArr29;
                    sArr27 = sArr15;
                    sArr30 = sArr30;
                    i22 = i49;
                    sArr28 = sArr6;
                    sArr35 = sArr35;
                    i40 = i2;
                    i41 = i41;
                    i49 = i22;
                    break;
                case -1539037903:
                case -1298877103:
                    i51 = i51;
                    sArr34 = sArr34;
                    sArr33 = sArr33;
                    sArr36 = sArr36;
                    sArr32 = sArr32;
                    i47 = i47;
                    sArr38 = sArr38;
                    sArr = sArr25;
                    sArr2 = sArr27;
                    short[] sArr48 = sArr28;
                    sArr3 = sArr31;
                    sArr29 = sArr29;
                    sArr30 = sArr30;
                    sArr4 = sArr37;
                    i44 = i44;
                    i50 = i50;
                    i49 = i49;
                    i46 = i46;
                    sArr5 = sArr26;
                    i41 = i41;
                    i = i43;
                    i2 = i40;
                    sArr6 = sArr48;
                    strM3009 = C0671.m3009(sArr6, 79, 3, i);
                    sArr7 = f74730;
                    i48 = 82;
                    i45 = 5;
                    if (C2642.f10294 > 0) {
                        int iM450213 = (C19806.m45029("ۙۘ") ^ i34) * 3;
                        i3 = ((iM450213 ^ i33) * (-22029)) ^ 762908903;
                        i4 = iM450213 ^ (-224921578);
                        sArr35 = sArr7;
                        sArr9 = sArr30;
                        strArr = strArr2;
                        i42 = i4;
                        i5 = i41;
                        strArr2 = strArr;
                        i6 = i3;
                        sArr10 = sArr29;
                        sArr38 = sArr38;
                        sArr26 = sArr5;
                        i35 = i6;
                        i46 = i46;
                        i50 = i50;
                        i38 = i51;
                        sArr27 = sArr2;
                        sArr34 = sArr34;
                        sArr25 = sArr;
                        sArr33 = sArr33;
                        sArr36 = sArr36;
                        sArr32 = sArr32;
                        i47 = i47;
                        sArr30 = sArr9;
                        i43 = i;
                        i44 = i44;
                        sArr31 = sArr3;
                        int i61 = i2;
                        i41 = i5;
                        sArr37 = sArr4;
                        sArr29 = sArr10;
                        i49 = i49;
                        sArr28 = sArr6;
                        sArr35 = sArr35;
                        i40 = i61;
                    } else {
                        sArr8 = sArr2;
                        i45 = 5;
                        sArr35 = sArr7;
                        sArr18 = sArr8;
                        sArr37 = sArr4;
                        sArr11 = sArr3;
                        int iM450214 = C19806.m45029("᩸֫") ^ i34;
                        i48 = i48;
                        i15 = ((iM450214 ^ i33) * (-22053)) ^ 185602045;
                        sArr17 = sArr18;
                        sArr14 = sArr;
                        int i510 = i;
                        i23 = iM450214 ^ 1873336383;
                        i43 = i510;
                        sArr38 = sArr38;
                        i42 = i23;
                        sArr15 = sArr17;
                        i35 = i15;
                        i46 = i46;
                        i44 = i44;
                        sArr34 = sArr34;
                        sArr33 = sArr33;
                        sArr36 = sArr36;
                        sArr32 = sArr32;
                        i47 = i47;
                        sArr25 = sArr14;
                        i48 = i48;
                        sArr26 = sArr5;
                        sArr31 = sArr11;
                        i45 = i45;
                        i50 = i50;
                        i38 = i51;
                        sArr29 = sArr29;
                        sArr27 = sArr15;
                        sArr30 = sArr30;
                        i22 = i49;
                        sArr28 = sArr6;
                        sArr35 = sArr35;
                        i40 = i2;
                        i41 = i41;
                        i49 = i22;
                    }
                    break;
                case -1495223270:
                case -185708248:
                    i51 = i51;
                    i45 = i45;
                    sArr34 = sArr34;
                    sArr33 = sArr33;
                    sArr36 = sArr36;
                    sArr32 = sArr32;
                    i47 = i47;
                    sArr38 = sArr38;
                    sArr = sArr25;
                    short[] sArr49 = sArr26;
                    short[] sArr50 = sArr28;
                    sArr3 = sArr31;
                    sArr29 = sArr29;
                    sArr30 = sArr30;
                    sArr4 = sArr37;
                    i44 = i44;
                    i50 = i50;
                    i49 = i49;
                    i48 = i48;
                    i46 = i46;
                    i41 = i41;
                    i = i43;
                    i2 = i40;
                    sArr35 = sArr35;
                    sArr5 = sArr49;
                    strM8172 = C2642.m8172(sArr5, 62, 6, i);
                    sArr8 = f74730;
                    i39 = 68;
                    if (!C0962.f3784) {
                        int iM450215 = (C19806.m45029("᩺᩵") ^ i34) * (-69);
                        i12 = ((iM450215 ^ i33) * (-11055)) ^ 2069732804;
                        i42 = iM450215 ^ 293434605;
                        i9 = i41;
                        sArr9 = sArr30;
                        sArr13 = sArr8;
                        sArr11 = sArr3;
                        sArr12 = sArr50;
                        sArr14 = sArr;
                        sArr38 = sArr38;
                        i35 = i12;
                        i46 = i46;
                        sArr37 = sArr4;
                        i38 = i51;
                        sArr29 = sArr29;
                        sArr35 = sArr35;
                        i40 = i2;
                        sArr33 = sArr33;
                        sArr32 = sArr32;
                        i47 = i47;
                        sArr25 = sArr14;
                        i41 = i9;
                        i48 = i48;
                        sArr36 = sArr36;
                        sArr26 = sArr5;
                        i50 = i50;
                        sArr30 = sArr9;
                        i43 = i;
                        i44 = i44;
                        sArr31 = sArr11;
                        i45 = i45;
                        sArr27 = sArr13;
                        sArr34 = sArr34;
                        i22 = i49;
                        sArr28 = sArr12;
                        i49 = i22;
                    } else {
                        i48 = i48;
                        sArr7 = sArr35;
                        sArr6 = sArr50;
                        sArr35 = sArr7;
                        sArr18 = sArr8;
                        sArr37 = sArr4;
                        sArr11 = sArr3;
                        int iM450216 = C19806.m45029("᩸֫") ^ i34;
                        i48 = i48;
                        i15 = ((iM450216 ^ i33) * (-22053)) ^ 185602045;
                        sArr17 = sArr18;
                        sArr14 = sArr;
                        int i511 = i;
                        i23 = iM450216 ^ 1873336383;
                        i43 = i511;
                        sArr38 = sArr38;
                        i42 = i23;
                        sArr15 = sArr17;
                        i35 = i15;
                        i46 = i46;
                        i44 = i44;
                        sArr34 = sArr34;
                        sArr33 = sArr33;
                        sArr36 = sArr36;
                        sArr32 = sArr32;
                        i47 = i47;
                        sArr25 = sArr14;
                        i48 = i48;
                        sArr26 = sArr5;
                        sArr31 = sArr11;
                        i45 = i45;
                        i50 = i50;
                        i38 = i51;
                        sArr29 = sArr29;
                        sArr27 = sArr15;
                        sArr30 = sArr30;
                        i22 = i49;
                        sArr28 = sArr6;
                        sArr35 = sArr35;
                        i40 = i2;
                        i41 = i41;
                        i49 = i22;
                    }
                    break;
                case -1239803105:
                case 1992116062:
                    i2 = i40;
                    i43 = 13445;
                    sArr11 = sArr31;
                    sArr6 = sArr28;
                    sArr17 = sArr27;
                    sArr5 = sArr26;
                    sArr14 = sArr25;
                    iM45029 = C19806.m45029("ᩴܺ") ^ i33;
                    i15 = ((iM45029 ^ i34) * (-32095)) ^ (-671231702);
                    i14 = 1558350477;
                    i23 = iM45029 ^ i14;
                    i39 = i39;
                    sArr37 = sArr37;
                    sArr38 = sArr38;
                    i42 = i23;
                    sArr15 = sArr17;
                    i35 = i15;
                    i46 = i46;
                    i44 = i44;
                    sArr34 = sArr34;
                    sArr33 = sArr33;
                    sArr36 = sArr36;
                    sArr32 = sArr32;
                    i47 = i47;
                    sArr25 = sArr14;
                    i48 = i48;
                    sArr26 = sArr5;
                    sArr31 = sArr11;
                    i45 = i45;
                    i50 = i50;
                    i38 = i51;
                    sArr29 = sArr29;
                    sArr27 = sArr15;
                    sArr30 = sArr30;
                    i22 = i49;
                    sArr28 = sArr6;
                    sArr35 = sArr35;
                    i40 = i2;
                    i41 = i41;
                    i49 = i22;
                    break;
                case -1224788181:
                case 506670603:
                    i51 = i51;
                    sArr34 = sArr34;
                    sArr33 = sArr33;
                    sArr36 = sArr36;
                    sArr32 = sArr32;
                    i47 = i47;
                    sArr38 = sArr38;
                    sArr = sArr25;
                    short[] sArr51 = sArr26;
                    sArr18 = sArr27;
                    short[] sArr52 = sArr28;
                    short[] sArr53 = sArr31;
                    sArr29 = sArr29;
                    sArr30 = sArr30;
                    sArr37 = sArr37;
                    i44 = i44;
                    i50 = i50;
                    i49 = i49;
                    i45 = i45;
                    i48 = i48;
                    i46 = i46;
                    i41 = i41;
                    i2 = i40;
                    sArr35 = sArr35;
                    i = i43;
                    strM8640 = C2871.m8640(sArr38, 4, 1, i);
                    if (AbstractC0464.f2088 > 0) {
                        iM11307 = (i34 - ThreadFactoryC3888.m11306("᩷֫")) * 5;
                        i14 = -1178603297;
                        i15 = ((iM11307 ^ i33) * 7669) ^ 1286839099;
                        sArr11 = sArr53;
                        sArr6 = sArr52;
                        sArr17 = sArr18;
                        sArr5 = sArr51;
                        sArr14 = sArr;
                        int i512 = i;
                        iM45029 = iM11307;
                        i43 = i512;
                        i23 = iM45029 ^ i14;
                        i39 = i39;
                        sArr37 = sArr37;
                        sArr38 = sArr38;
                        i42 = i23;
                        sArr15 = sArr17;
                        i35 = i15;
                        i46 = i46;
                        i44 = i44;
                        sArr34 = sArr34;
                        sArr33 = sArr33;
                        sArr36 = sArr36;
                        sArr32 = sArr32;
                        i47 = i47;
                        sArr25 = sArr14;
                        i48 = i48;
                        sArr26 = sArr5;
                        sArr31 = sArr11;
                        i45 = i45;
                        i50 = i50;
                        i38 = i51;
                        sArr29 = sArr29;
                        sArr27 = sArr15;
                        sArr30 = sArr30;
                        i22 = i49;
                        sArr28 = sArr6;
                        sArr35 = sArr35;
                        i40 = i2;
                        i41 = i41;
                        i49 = i22;
                    } else {
                        i48 = i48;
                        sArr37 = sArr37;
                        sArr11 = sArr53;
                        sArr6 = sArr52;
                        sArr5 = sArr51;
                        int iM450217 = C19806.m45029("᩸֫") ^ i34;
                        i48 = i48;
                        i15 = ((iM450217 ^ i33) * (-22053)) ^ 185602045;
                        sArr17 = sArr18;
                        sArr14 = sArr;
                        int i513 = i;
                        i23 = iM450217 ^ 1873336383;
                        i43 = i513;
                        sArr38 = sArr38;
                        i42 = i23;
                        sArr15 = sArr17;
                        i35 = i15;
                        i46 = i46;
                        i44 = i44;
                        sArr34 = sArr34;
                        sArr33 = sArr33;
                        sArr36 = sArr36;
                        sArr32 = sArr32;
                        i47 = i47;
                        sArr25 = sArr14;
                        i48 = i48;
                        sArr26 = sArr5;
                        sArr31 = sArr11;
                        i45 = i45;
                        i50 = i50;
                        i38 = i51;
                        sArr29 = sArr29;
                        sArr27 = sArr15;
                        sArr30 = sArr30;
                        i22 = i49;
                        sArr28 = sArr6;
                        sArr35 = sArr35;
                        i40 = i2;
                        i41 = i41;
                        i49 = i22;
                    }
                    break;
                case -1014291194:
                case 763059680:
                    i51 = i51;
                    i24 = i43;
                    sArr34 = sArr34;
                    sArr33 = sArr33;
                    sArr36 = sArr36;
                    sArr32 = sArr32;
                    i47 = i47;
                    sArr38 = sArr38;
                    sArr20 = sArr25;
                    sArr21 = sArr26;
                    sArr15 = sArr27;
                    sArr22 = sArr28;
                    sArr23 = sArr31;
                    sArr29 = sArr29;
                    sArr30 = sArr30;
                    sArr4 = sArr37;
                    i44 = i44;
                    i50 = i50;
                    i49 = i49;
                    i45 = i45;
                    i48 = i48;
                    i46 = i46;
                    i41 = i41;
                    i2 = i40;
                    sArr35 = sArr35;
                    C1460.m5050();
                    if (C3743.f13569) {
                        i25 = i44;
                        sArr33 = sArr33;
                        int iM450218 = (C19806.m45029("ۚܶ") ^ i34) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        int i62 = ((iM450218 ^ i33) * (-2681)) ^ 176846774;
                        i13 = iM450218 ^ 349309068;
                        int i63 = i25;
                        i30 = i62;
                        i31 = i63;
                        sArr24 = sArr38;
                        i35 = i30;
                        i44 = i31;
                        i44 = i44;
                        sArr16 = sArr24;
                        sArr11 = sArr23;
                        sArr6 = sArr22;
                        sArr5 = sArr21;
                        sArr34 = sArr34;
                        sArr14 = sArr20;
                        i47 = i47;
                        i = i24;
                        i42 = i13;
                        sArr38 = sArr16;
                        i43 = i;
                        i46 = i46;
                        i44 = i44;
                        sArr37 = sArr4;
                        sArr36 = sArr36;
                        sArr32 = sArr32;
                        sArr25 = sArr14;
                        i48 = i48;
                        sArr26 = sArr5;
                        sArr31 = sArr11;
                        i45 = i45;
                        i50 = i50;
                        i38 = i51;
                        sArr29 = sArr29;
                        sArr27 = sArr15;
                        sArr30 = sArr30;
                        i22 = i49;
                        sArr28 = sArr6;
                        sArr35 = sArr35;
                        i40 = i2;
                        i41 = i41;
                        i49 = i22;
                    }
                    i7 = i39;
                    sArr11 = sArr23;
                    sArr6 = sArr22;
                    sArr13 = sArr15;
                    sArr5 = sArr21;
                    sArr14 = sArr20;
                    i = i24;
                    i46 = i46;
                    sArr32 = sArr32;
                    i47 = i47;
                    int iM113017 = ThreadFactoryC3888.m11306("ۡ֨") ^ i34;
                    i21 = ((iM113017 ^ i33) * (-30347)) ^ (-607202025);
                    i20 = iM113017 ^ 2085495015;
                    i29 = i49;
                    sArr36 = sArr36;
                    sArr19 = sArr14;
                    i49 = i29;
                    sArr38 = sArr38;
                    i42 = i20;
                    i39 = i7;
                    i43 = i;
                    sArr15 = sArr13;
                    i35 = i21;
                    i48 = i48;
                    i44 = i44;
                    sArr37 = sArr4;
                    sArr34 = sArr34;
                    sArr25 = sArr19;
                    sArr33 = sArr33;
                    sArr26 = sArr5;
                    sArr31 = sArr11;
                    i45 = i45;
                    i50 = i50;
                    i38 = i51;
                    sArr29 = sArr29;
                    sArr27 = sArr15;
                    sArr30 = sArr30;
                    i22 = i49;
                    sArr28 = sArr6;
                    sArr35 = sArr35;
                    i40 = i2;
                    i41 = i41;
                    i49 = i22;
                    break;
                case -827721797:
                case 1402576872:
                    i51 = i51;
                    i24 = i43;
                    sArr34 = sArr34;
                    sArr33 = sArr33;
                    sArr36 = sArr36;
                    sArr32 = sArr32;
                    i47 = i47;
                    sArr38 = sArr38;
                    sArr20 = sArr25;
                    sArr21 = sArr26;
                    sArr15 = sArr27;
                    sArr22 = sArr28;
                    sArr23 = sArr31;
                    sArr29 = sArr29;
                    sArr30 = sArr30;
                    sArr4 = sArr37;
                    i44 = i44;
                    i50 = i50;
                    i49 = i49;
                    i45 = i45;
                    i48 = i48;
                    i46 = i46;
                    i41 = i41;
                    i2 = i40;
                    sArr35 = sArr35;
                    if (C3660.f13403 < 0) {
                        i7 = i39;
                        sArr11 = sArr23;
                        sArr6 = sArr22;
                        sArr13 = sArr15;
                        sArr5 = sArr21;
                        sArr14 = sArr20;
                        i = i24;
                        i46 = i46;
                        sArr32 = sArr32;
                        i47 = i47;
                        int iM113018 = ThreadFactoryC3888.m11306("ۡ֨") ^ i34;
                        i21 = ((iM113018 ^ i33) * (-30347)) ^ (-607202025);
                        i20 = iM113018 ^ 2085495015;
                        i29 = i49;
                        sArr36 = sArr36;
                        sArr19 = sArr14;
                        i49 = i29;
                        sArr38 = sArr38;
                        i42 = i20;
                        i39 = i7;
                        i43 = i;
                        sArr15 = sArr13;
                        i35 = i21;
                        i48 = i48;
                        i44 = i44;
                        sArr37 = sArr4;
                        sArr34 = sArr34;
                        sArr25 = sArr19;
                        sArr33 = sArr33;
                        sArr26 = sArr5;
                        sArr31 = sArr11;
                        i45 = i45;
                        i50 = i50;
                        i38 = i51;
                        sArr29 = sArr29;
                        sArr27 = sArr15;
                        sArr30 = sArr30;
                        i22 = i49;
                        sArr28 = sArr6;
                        sArr35 = sArr35;
                        i40 = i2;
                        i41 = i41;
                        i49 = i22;
                    } else {
                        int iM450219 = (C19806.m45029("֡ܺ") + i33) * (-83);
                        i42 = iM450219 ^ 1549070557;
                        sArr38 = sArr38;
                        i35 = ((iM450219 ^ i34) * (-3323)) ^ 427769594;
                        i46 = i46;
                        i48 = i48;
                        i45 = i45;
                        i44 = i44;
                        sArr37 = sArr4;
                        i50 = i50;
                        i38 = i51;
                        sArr29 = sArr29;
                        sArr35 = sArr35;
                        i40 = i2;
                        sArr31 = sArr23;
                        sArr27 = sArr15;
                        sArr26 = sArr21;
                        sArr34 = sArr34;
                        sArr25 = sArr20;
                        sArr33 = sArr33;
                        sArr36 = sArr36;
                        sArr32 = sArr32;
                        i47 = i47;
                        i43 = i24;
                        i41 = i41;
                        sArr30 = sArr30;
                        i49 = i49;
                        sArr28 = sArr22;
                    }
                    break;
                case -709869601:
                case 922251691:
                    i51 = i51;
                    int i64 = i49;
                    short[] sArr54 = sArr29;
                    int i65 = i40;
                    int i66 = i43;
                    sArr4 = sArr37;
                    sArr3 = sArr31;
                    i44 = i44;
                    i50 = i50;
                    sArr29 = sArr54;
                    sArr35 = sArr35;
                    short[] sArr55 = sArr28;
                    i49 = i64;
                    i2 = i65;
                    sArr2 = sArr27;
                    i45 = i45;
                    short[] sArr56 = sArr26;
                    i48 = i48;
                    sArr34 = sArr34;
                    sArr = sArr25;
                    i46 = i46;
                    sArr33 = sArr33;
                    sArr36 = sArr36;
                    sArr32 = sArr32;
                    i47 = i47;
                    sArr38 = sArr38;
                    strArr = new String[]{strM10901, strM7605, strM4969, strM8470, strM6685, strM3361, strM4366, strM98610, strM9715, strM8172, strM7604, strM5502, strM3009, str2, str3, C0962.m3747(sArr54, i65, 10, i43), strM9869, strM8640};
                    sArr9 = f74730;
                    if (!ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        int iM450220 = (C19806.m45029("ۗۘ") + i33) * 29;
                        i4 = iM450220 ^ 1216349843;
                        i3 = ((iM450220 ^ i34) * (-18713)) ^ 958294838;
                        i48 = i48;
                        i45 = i45;
                        sArr6 = sArr55;
                        sArr5 = sArr56;
                        i = i66;
                        i41 = IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i42 = i4;
                        i5 = i41;
                        strArr2 = strArr;
                        i6 = i3;
                        sArr10 = sArr29;
                        sArr38 = sArr38;
                        sArr26 = sArr5;
                        i35 = i6;
                        i46 = i46;
                        i50 = i50;
                        i38 = i51;
                        sArr27 = sArr2;
                        sArr34 = sArr34;
                        sArr25 = sArr;
                        sArr33 = sArr33;
                        sArr36 = sArr36;
                        sArr32 = sArr32;
                        i47 = i47;
                        sArr30 = sArr9;
                        i43 = i;
                        i44 = i44;
                        sArr31 = sArr3;
                        int i67 = i2;
                        i41 = i5;
                        sArr37 = sArr4;
                        sArr29 = sArr10;
                        i49 = i49;
                        sArr28 = sArr6;
                        sArr35 = sArr35;
                        i40 = i67;
                    } else {
                        i7 = i39;
                        sArr11 = sArr3;
                        sArr12 = sArr55;
                        sArr13 = sArr2;
                        sArr5 = sArr56;
                        sArr14 = sArr;
                        i = i66;
                        i8 = IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        int iM113019 = ThreadFactoryC3888.m11306("᩸᩶") ^ i33;
                        i9 = i8;
                        iM11306 = iM113019;
                        i11 = ((iM113019 ^ i34) * 31953) ^ 1470290542;
                        i10 = 887643437;
                        i39 = i7;
                        i42 = iM11306 ^ i10;
                        strArr2 = strArr;
                        i12 = i11;
                        sArr38 = sArr38;
                        i35 = i12;
                        i46 = i46;
                        sArr37 = sArr4;
                        i38 = i51;
                        sArr29 = sArr29;
                        sArr35 = sArr35;
                        i40 = i2;
                        sArr33 = sArr33;
                        sArr32 = sArr32;
                        i47 = i47;
                        sArr25 = sArr14;
                        i41 = i9;
                        i48 = i48;
                        sArr36 = sArr36;
                        sArr26 = sArr5;
                        i50 = i50;
                        sArr30 = sArr9;
                        i43 = i;
                        i44 = i44;
                        sArr31 = sArr11;
                        i45 = i45;
                        sArr27 = sArr13;
                        sArr34 = sArr34;
                        i22 = i49;
                        sArr28 = sArr12;
                        i49 = i22;
                    }
                    break;
                case -690579958:
                case -47803680:
                    i51 = i51;
                    int i68 = i49;
                    sArr30 = sArr30;
                    i41 = i41;
                    String strM6363 = C1977.m6363(sArr30, i41, 13, i43);
                    short[] sArr57 = sArr37;
                    int i69 = i44;
                    String strM98611 = ViewTreeObserverOnPreDrawListenerC3327.m9869(f74730, 116, 4, i43);
                    short[] sArr58 = f74730;
                    int iM450221 = C19806.m45029("ۘۚ") ^ i34;
                    sArr34 = sArr34;
                    sArr33 = sArr33;
                    sArr36 = sArr36;
                    sArr32 = sArr32;
                    i47 = i47;
                    str6 = strM98611;
                    sArr = sArr25;
                    sArr18 = sArr27;
                    i44 = i69;
                    i2 = i40;
                    i17 = ((iM450221 ^ i33) * (-5971)) ^ (-1118346994);
                    sArr35 = sArr35;
                    i45 = i45;
                    i46 = i46;
                    str4 = strM6363;
                    sArr38 = sArr38;
                    strM4365 = str5;
                    sArr6 = sArr28;
                    sArr29 = sArr29;
                    i19 = 47777537;
                    sArr11 = sArr58;
                    i49 = i68;
                    sArr37 = sArr57;
                    i = i43;
                    i18 = i50;
                    sArr5 = sArr26;
                    i16 = i48;
                    iM11308 = iM450221;
                    i42 = iM11308 ^ i19;
                    sArr38 = sArr38;
                    sArr30 = sArr30;
                    i35 = i17;
                    str5 = strM4365;
                    i46 = i46;
                    i48 = i16;
                    i38 = i51;
                    sArr29 = sArr29;
                    sArr34 = sArr34;
                    sArr25 = sArr;
                    sArr33 = sArr33;
                    sArr36 = sArr36;
                    sArr32 = sArr32;
                    i47 = i47;
                    sArr26 = sArr5;
                    i50 = i18;
                    i43 = i;
                    i44 = i44;
                    sArr31 = sArr11;
                    i45 = i45;
                    sArr27 = sArr18;
                    i22 = i49;
                    sArr28 = sArr6;
                    sArr35 = sArr35;
                    i40 = i2;
                    i41 = i41;
                    i49 = i22;
                    break;
                case -468460337:
                case 380884070:
                    f74729 = AbstractC23844.m52568(str4, str6, strM3406, str5, str, C2871.m8640(f74730, 137, 4, i43), strArr2);
                    return;
                case 127308523:
                case 295670766:
                    i51 = i51;
                    int i70 = i49;
                    String strM7606 = C2477.m7604(sArr35, i48, i45, i43);
                    String strM9788 = C3286.m9788(f74730, 87, 6, i43);
                    sArr10 = f74730;
                    int iM113020 = ThreadFactoryC3888.m11306("ۛ֨") ^ i33;
                    i6 = ((iM113020 ^ i34) * 30557) ^ (-247638704);
                    str3 = strM9788;
                    sArr4 = sArr37;
                    sArr35 = sArr35;
                    sArr34 = sArr34;
                    sArr33 = sArr33;
                    sArr36 = sArr36;
                    sArr32 = sArr32;
                    i47 = i47;
                    sArr38 = sArr38;
                    sArr = sArr25;
                    sArr2 = sArr27;
                    sArr6 = sArr28;
                    sArr3 = sArr31;
                    i5 = i41;
                    i2 = 93;
                    i44 = i44;
                    i46 = i46;
                    i49 = i70;
                    i42 = iM113020 ^ (-1518214372);
                    i = i43;
                    str2 = strM7606;
                    sArr9 = sArr30;
                    i50 = i50;
                    sArr5 = sArr26;
                    sArr38 = sArr38;
                    sArr26 = sArr5;
                    i35 = i6;
                    i46 = i46;
                    i50 = i50;
                    i38 = i51;
                    sArr27 = sArr2;
                    sArr34 = sArr34;
                    sArr25 = sArr;
                    sArr33 = sArr33;
                    sArr36 = sArr36;
                    sArr32 = sArr32;
                    i47 = i47;
                    sArr30 = sArr9;
                    i43 = i;
                    i44 = i44;
                    sArr31 = sArr3;
                    int i610 = i2;
                    i41 = i5;
                    sArr37 = sArr4;
                    sArr29 = sArr10;
                    i49 = i49;
                    sArr28 = sArr6;
                    sArr35 = sArr35;
                    i40 = i610;
                    break;
                case 480630341:
                case 1471464500:
                    i51 = i51;
                    i26 = i49;
                    strM6685 = C2124.m6685(sArr33, i44, 8, i43);
                    strM3361 = C0797.m3361(f74730, 35, 2, i43);
                    sArr25 = f74730;
                    if (C3535.f13026 > 0) {
                        iM11309 = (ThreadFactoryC3888.m11306("ۘۤ") + i34) * (-9);
                        i27 = ((iM11309 ^ i33) * (-15791)) ^ (-488643399);
                        i28 = -950914130;
                        i38 = i51;
                        i22 = i26;
                        i42 = iM11309 ^ i28;
                        i35 = i27;
                        i49 = i22;
                    } else {
                        sArr34 = sArr34;
                        sArr33 = sArr33;
                        sArr36 = sArr36;
                        sArr38 = sArr38;
                        sArr13 = sArr27;
                        sArr29 = sArr29;
                        sArr30 = sArr30;
                        i41 = i41;
                        sArr4 = sArr37;
                        i50 = i50;
                        i45 = i45;
                        sArr5 = sArr26;
                        sArr11 = sArr31;
                        i7 = i39;
                        i2 = i40;
                        i44 = i44;
                        sArr35 = sArr35;
                        i48 = i48;
                        sArr14 = sArr25;
                        sArr6 = sArr28;
                        i = i43;
                        i49 = i26;
                        int iM1130110 = ThreadFactoryC3888.m11306("ۡ֨") ^ i34;
                        i21 = ((iM1130110 ^ i33) * (-30347)) ^ (-607202025);
                        i20 = iM1130110 ^ 2085495015;
                        i29 = i49;
                        sArr36 = sArr36;
                        sArr19 = sArr14;
                        i49 = i29;
                        sArr38 = sArr38;
                        i42 = i20;
                        i39 = i7;
                        i43 = i;
                        sArr15 = sArr13;
                        i35 = i21;
                        i48 = i48;
                        i44 = i44;
                        sArr37 = sArr4;
                        sArr34 = sArr34;
                        sArr25 = sArr19;
                        sArr33 = sArr33;
                        sArr26 = sArr5;
                        sArr31 = sArr11;
                        i45 = i45;
                        i50 = i50;
                        i38 = i51;
                        sArr29 = sArr29;
                        sArr27 = sArr15;
                        sArr30 = sArr30;
                        i22 = i49;
                        sArr28 = sArr6;
                        sArr35 = sArr35;
                        i40 = i2;
                        i41 = i41;
                        i49 = i22;
                    }
                    break;
                case 547659632:
                case 751875877:
                    i51 = i51;
                    int i71 = i49;
                    strM9869 = ViewTreeObserverOnPreDrawListenerC3327.m9869(f74730, 1, 3, i43);
                    short[] sArr59 = f74730;
                    int iM113021 = ThreadFactoryC3888.m11306("ܳۡ") ^ i33;
                    int i72 = ((iM113021 ^ i34) * (-30369)) ^ (-739212439);
                    i24 = i43;
                    i13 = iM113021 ^ (-959522869);
                    sArr34 = sArr34;
                    sArr36 = sArr36;
                    sArr32 = sArr32;
                    i47 = i47;
                    sArr20 = sArr25;
                    sArr21 = sArr26;
                    sArr15 = sArr27;
                    sArr22 = sArr28;
                    sArr23 = sArr31;
                    sArr29 = sArr29;
                    i41 = i41;
                    sArr24 = sArr59;
                    sArr4 = sArr37;
                    i35 = i72;
                    i45 = i45;
                    i48 = i48;
                    i46 = i46;
                    i49 = i71;
                    sArr30 = sArr30;
                    i2 = i40;
                    i50 = i50;
                    sArr35 = sArr35;
                    i44 = i44;
                    sArr16 = sArr24;
                    sArr11 = sArr23;
                    sArr6 = sArr22;
                    sArr5 = sArr21;
                    sArr34 = sArr34;
                    sArr14 = sArr20;
                    i47 = i47;
                    i = i24;
                    i42 = i13;
                    sArr38 = sArr16;
                    i43 = i;
                    i46 = i46;
                    i44 = i44;
                    sArr37 = sArr4;
                    sArr36 = sArr36;
                    sArr32 = sArr32;
                    sArr25 = sArr14;
                    i48 = i48;
                    sArr26 = sArr5;
                    sArr31 = sArr11;
                    i45 = i45;
                    i50 = i50;
                    i38 = i51;
                    sArr29 = sArr29;
                    sArr27 = sArr15;
                    sArr30 = sArr30;
                    i22 = i49;
                    sArr28 = sArr6;
                    sArr35 = sArr35;
                    i40 = i2;
                    i41 = i41;
                    i49 = i22;
                    break;
                case 648123908:
                case 1155142973:
                    i51 = i51;
                    int i73 = i49;
                    C7105.m18985();
                    C2788.m8472();
                    sArr34 = sArr34;
                    sArr33 = sArr33;
                    sArr36 = sArr36;
                    sArr32 = sArr32;
                    i47 = i47;
                    sArr38 = sArr38;
                    sArr13 = sArr27;
                    sArr29 = sArr29;
                    sArr30 = sArr30;
                    i41 = i41;
                    sArr4 = sArr37;
                    i50 = i50;
                    i45 = i45;
                    sArr5 = sArr26;
                    sArr11 = sArr31;
                    i7 = i39;
                    i2 = i40;
                    i44 = i44;
                    sArr35 = sArr35;
                    i48 = i48;
                    sArr14 = sArr25;
                    sArr6 = sArr28;
                    i = i43;
                    i46 = i46;
                    i49 = i73;
                    i46 = i46;
                    sArr32 = sArr32;
                    i47 = i47;
                    int iM1130111 = ThreadFactoryC3888.m11306("ۡ֨") ^ i34;
                    i21 = ((iM1130111 ^ i33) * (-30347)) ^ (-607202025);
                    i20 = iM1130111 ^ 2085495015;
                    i29 = i49;
                    sArr36 = sArr36;
                    sArr19 = sArr14;
                    i49 = i29;
                    sArr38 = sArr38;
                    i42 = i20;
                    i39 = i7;
                    i43 = i;
                    sArr15 = sArr13;
                    i35 = i21;
                    i48 = i48;
                    i44 = i44;
                    sArr37 = sArr4;
                    sArr34 = sArr34;
                    sArr25 = sArr19;
                    sArr33 = sArr33;
                    sArr26 = sArr5;
                    sArr31 = sArr11;
                    i45 = i45;
                    i50 = i50;
                    i38 = i51;
                    sArr29 = sArr29;
                    sArr27 = sArr15;
                    sArr30 = sArr30;
                    i22 = i49;
                    sArr28 = sArr6;
                    sArr35 = sArr35;
                    i40 = i2;
                    i41 = i41;
                    i49 = i22;
                    break;
                case 670009660:
                case 1583092061:
                    i51 = i51;
                    int i74 = i49;
                    strM8470 = C2788.m8470(sArr36, 23, 4, i43);
                    sArr33 = f74730;
                    if (C2332.f8260) {
                        int iM450222 = C19806.m45029("᩵᩺") ^ i33;
                        i30 = ((iM450222 ^ i34) * 9795) ^ (-1500704123);
                        i24 = i43;
                        sArr34 = sArr34;
                        sArr36 = sArr36;
                        sArr32 = sArr32;
                        i47 = i47;
                        sArr20 = sArr25;
                        sArr21 = sArr26;
                        sArr15 = sArr27;
                        sArr22 = sArr28;
                        sArr23 = sArr31;
                        sArr29 = sArr29;
                        sArr30 = sArr30;
                        i41 = i41;
                        i13 = iM450222 ^ 1821875726;
                        sArr4 = sArr37;
                        i50 = i50;
                        i45 = i45;
                        i48 = i48;
                        i46 = i46;
                        i49 = i74;
                        sArr38 = sArr38;
                        i2 = i40;
                        i31 = 27;
                        sArr35 = sArr35;
                    } else {
                        i25 = 27;
                        i24 = i43;
                        sArr34 = sArr34;
                        sArr36 = sArr36;
                        sArr32 = sArr32;
                        i47 = i47;
                        sArr38 = sArr38;
                        sArr20 = sArr25;
                        sArr21 = sArr26;
                        sArr15 = sArr27;
                        sArr22 = sArr28;
                        sArr23 = sArr31;
                        sArr29 = sArr29;
                        sArr30 = sArr30;
                        i41 = i41;
                        sArr4 = sArr37;
                        i50 = i50;
                        i45 = i45;
                        i48 = i48;
                        i46 = i46;
                        i49 = i74;
                        i2 = i40;
                        sArr35 = sArr35;
                        int iM4502110 = (C19806.m45029("ۚܶ") ^ i34) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        int i611 = ((iM4502110 ^ i33) * (-2681)) ^ 176846774;
                        i13 = iM4502110 ^ 349309068;
                        int i612 = i25;
                        i30 = i611;
                        i31 = i612;
                    }
                    sArr24 = sArr38;
                    i35 = i30;
                    i44 = i31;
                    i44 = i44;
                    sArr16 = sArr24;
                    sArr11 = sArr23;
                    sArr6 = sArr22;
                    sArr5 = sArr21;
                    sArr34 = sArr34;
                    sArr14 = sArr20;
                    i47 = i47;
                    i = i24;
                    i42 = i13;
                    sArr38 = sArr16;
                    i43 = i;
                    i46 = i46;
                    i44 = i44;
                    sArr37 = sArr4;
                    sArr36 = sArr36;
                    sArr32 = sArr32;
                    sArr25 = sArr14;
                    i48 = i48;
                    sArr26 = sArr5;
                    sArr31 = sArr11;
                    i45 = i45;
                    i50 = i50;
                    i38 = i51;
                    sArr29 = sArr29;
                    sArr27 = sArr15;
                    sArr30 = sArr30;
                    i22 = i49;
                    sArr28 = sArr6;
                    sArr35 = sArr35;
                    i40 = i2;
                    i41 = i41;
                    i49 = i22;
                    break;
                case 825360333:
                case 1069880215:
                    i51 = i51;
                    int i75 = i49;
                    strM4365 = C1189.m4365(sArr37, i50, 4, i43);
                    String strM98612 = ViewTreeObserverOnPreDrawListenerC3327.m9869(f74730, 129, 8, i43);
                    int iM113022 = ThreadFactoryC3888.m11306("֫ۗ") ^ i33;
                    i19 = 1719821316;
                    str = strM98612;
                    sArr34 = sArr34;
                    sArr33 = sArr33;
                    sArr36 = sArr36;
                    sArr32 = sArr32;
                    i47 = i47;
                    sArr38 = sArr38;
                    sArr = sArr25;
                    sArr18 = sArr27;
                    sArr29 = sArr29;
                    i17 = ((iM113022 ^ i34) * 6581) ^ 102106160;
                    i45 = i45;
                    i46 = i46;
                    sArr11 = sArr31;
                    sArr30 = sArr30;
                    i44 = i44;
                    i = i43;
                    i18 = i50;
                    sArr5 = sArr26;
                    i16 = i48;
                    iM11308 = iM113022;
                    i41 = i41;
                    i2 = i40;
                    sArr35 = sArr35;
                    sArr6 = sArr28;
                    i49 = i75;
                    i42 = iM11308 ^ i19;
                    sArr38 = sArr38;
                    sArr30 = sArr30;
                    i35 = i17;
                    str5 = strM4365;
                    i46 = i46;
                    i48 = i16;
                    i38 = i51;
                    sArr29 = sArr29;
                    sArr34 = sArr34;
                    sArr25 = sArr;
                    sArr33 = sArr33;
                    sArr36 = sArr36;
                    sArr32 = sArr32;
                    i47 = i47;
                    sArr26 = sArr5;
                    i50 = i18;
                    i43 = i;
                    i44 = i44;
                    sArr31 = sArr11;
                    i45 = i45;
                    sArr27 = sArr18;
                    i22 = i49;
                    sArr28 = sArr6;
                    sArr35 = sArr35;
                    i40 = i2;
                    i41 = i41;
                    i49 = i22;
                    break;
                case 983538362:
                case 1987840061:
                    i51 = i51;
                    i29 = i49;
                    strM7605 = C2477.m7604(sArr32, i46, 5, i43);
                    strM4969 = C1419.m4969(f74730, 15, 8, i43);
                    sArr36 = f74730;
                    int iM113023 = (ThreadFactoryC3888.m11306("ۗ᩵") ^ i34) * 91;
                    sArr34 = sArr34;
                    sArr33 = sArr33;
                    sArr13 = sArr27;
                    sArr29 = sArr29;
                    sArr30 = sArr30;
                    sArr4 = sArr37;
                    i50 = i50;
                    i21 = ((iM113023 ^ i33) * 1029) ^ 249597296;
                    i45 = i45;
                    sArr5 = sArr26;
                    sArr11 = sArr31;
                    i7 = i39;
                    i41 = i41;
                    i44 = i44;
                    i48 = i48;
                    sArr14 = sArr25;
                    i2 = i40;
                    i = i43;
                    sArr35 = sArr35;
                    sArr6 = sArr28;
                    i20 = iM113023 ^ 1649643822;
                    sArr38 = sArr38;
                    sArr19 = sArr14;
                    i49 = i29;
                    sArr38 = sArr38;
                    i42 = i20;
                    i39 = i7;
                    i43 = i;
                    sArr15 = sArr13;
                    i35 = i21;
                    i48 = i48;
                    i44 = i44;
                    sArr37 = sArr4;
                    sArr34 = sArr34;
                    sArr25 = sArr19;
                    sArr33 = sArr33;
                    sArr26 = sArr5;
                    sArr31 = sArr11;
                    i45 = i45;
                    i50 = i50;
                    i38 = i51;
                    sArr29 = sArr29;
                    sArr27 = sArr15;
                    sArr30 = sArr30;
                    i22 = i49;
                    sArr28 = sArr6;
                    sArr35 = sArr35;
                    i40 = i2;
                    i41 = i41;
                    i49 = i22;
                    break;
                case 1267679357:
                case 1578997115:
                    i51 = i51;
                    strM98610 = ViewTreeObserverOnPreDrawListenerC3327.m9869(sArr34, i47, i49, i43);
                    i26 = i49;
                    strM9715 = MenuItemOnMenuItemClickListenerC3244.m9715(f74730, 56, 6, i43);
                    sArr26 = f74730;
                    iM11309 = ThreadFactoryC3888.m11306("֨ܳ") ^ i33;
                    i27 = ((iM11309 ^ i34) * (-3621)) ^ (-1569101420);
                    i28 = -690944897;
                    i38 = i51;
                    i22 = i26;
                    i42 = iM11309 ^ i28;
                    i35 = i27;
                    i49 = i22;
                    break;
                case 1787971036:
                case 1816804519:
                    int i76 = s + 1;
                    if ((i76 * i76) - (i36 + i37) >= 0) {
                        iM113010 = (ThreadFactoryC3888.m11306("ۘ᩵") + i34) * 67;
                        i32 = ((iM113010 ^ i33) * (-32207)) ^ (-716703025);
                        i14 = -1731616591;
                    } else {
                        iM113010 = ThreadFactoryC3888.m11306("᩹᩷") ^ i34;
                        i32 = ((iM113010 ^ i33) * (-4389)) ^ 1296477948;
                        i14 = -675537417;
                    }
                    sArr34 = sArr34;
                    sArr33 = sArr33;
                    sArr36 = sArr36;
                    sArr32 = sArr32;
                    i47 = i47;
                    sArr17 = sArr27;
                    sArr29 = sArr29;
                    sArr37 = sArr37;
                    i45 = i45;
                    sArr11 = sArr31;
                    i39 = i39;
                    i44 = i44;
                    iM45029 = iM113010;
                    sArr30 = sArr30;
                    i50 = i50;
                    sArr5 = sArr26;
                    i48 = i48;
                    sArr14 = sArr25;
                    i46 = i46;
                    i15 = i32;
                    sArr38 = sArr38;
                    int i77 = i40;
                    sArr35 = sArr35;
                    sArr6 = sArr28;
                    i49 = i49;
                    i41 = i41;
                    i2 = i77;
                    i23 = iM45029 ^ i14;
                    i39 = i39;
                    sArr37 = sArr37;
                    sArr38 = sArr38;
                    i42 = i23;
                    sArr15 = sArr17;
                    i35 = i15;
                    i46 = i46;
                    i44 = i44;
                    sArr34 = sArr34;
                    sArr33 = sArr33;
                    sArr36 = sArr36;
                    sArr32 = sArr32;
                    i47 = i47;
                    sArr25 = sArr14;
                    i48 = i48;
                    sArr26 = sArr5;
                    sArr31 = sArr11;
                    i45 = i45;
                    i50 = i50;
                    i38 = i51;
                    sArr29 = sArr29;
                    sArr27 = sArr15;
                    sArr30 = sArr30;
                    i22 = i49;
                    sArr28 = sArr6;
                    sArr35 = sArr35;
                    i40 = i2;
                    i41 = i41;
                    i49 = i22;
                    break;
                default:
                    sArr17 = sArr27;
                    sArr5 = sArr26;
                    sArr11 = sArr31;
                    sArr14 = sArr25;
                    sArr6 = sArr28;
                    i2 = i40;
                    i43 = 44954;
                    iM45029 = C19806.m45029("ᩴܺ") ^ i33;
                    i15 = ((iM45029 ^ i34) * (-32095)) ^ (-671231702);
                    i14 = 1558350477;
                    i23 = iM45029 ^ i14;
                    i39 = i39;
                    sArr37 = sArr37;
                    sArr38 = sArr38;
                    i42 = i23;
                    sArr15 = sArr17;
                    i35 = i15;
                    i46 = i46;
                    i44 = i44;
                    sArr34 = sArr34;
                    sArr33 = sArr33;
                    sArr36 = sArr36;
                    sArr32 = sArr32;
                    i47 = i47;
                    sArr25 = sArr14;
                    i48 = i48;
                    sArr26 = sArr5;
                    sArr31 = sArr11;
                    i45 = i45;
                    i50 = i50;
                    i38 = i51;
                    sArr29 = sArr29;
                    sArr27 = sArr15;
                    sArr30 = sArr30;
                    i22 = i49;
                    sArr28 = sArr6;
                    sArr35 = sArr35;
                    i40 = i2;
                    i41 = i41;
                    i49 = i22;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:141:0x059c A[PHI: r19 r23
      0x059c: PHI (r19v28 int) = (r19v10 int), (r19v19 int), (r19v29 int) binds: [B:15:0x0060, B:140:0x059a, B:120:0x04a2] A[DONT_GENERATE, DONT_INLINE]
      0x059c: PHI (r23v15 java.util.Iterator) = (r23v3 java.util.Iterator), (r23v6 java.util.Iterator), (r23v16 java.util.Iterator) binds: [B:15:0x0060, B:140:0x059a, B:120:0x04a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50855(C22785 c22785, HashMap map, C1117 c1117) {
        int i;
        int iM11306;
        int i2;
        int i3;
        int iM45029;
        int i4;
        int i5;
        int iM11307;
        int i6;
        int i7;
        int i8;
        int iM11308;
        int i9;
        int i10;
        C7262 c7262 = null;
        Iterator itM4898 = null;
        C0206 c0206 = null;
        int iMo1519 = 0;
        int i11 = 0;
        String strM1533 = null;
        int iMo19106 = 0;
        int iMo26942 = 0;
        int i12 = 0;
        String str = null;
        boolean zM5058 = false;
        short s = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1730553525;
        int i16 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int i17 = C2871.f10837;
        int iM450210 = C19806.m45029("᩷ܰ") ^ i17;
        int i18 = ((iM450210 ^ i16) * 19069) ^ 1844297665;
        int i19 = iM450210 ^ 1978997087;
        short[] sArr = null;
        Iterator itM10417 = null;
        while (true) {
            i15 = i19 ^ (i18 & (((i15 ^ i16) * (-18481)) >> 31));
            switch (i15) {
                case -2133755419:
                case -1129165498:
                    itM4898 = itM4898;
                    i = i13;
                    if (C0629.f2722 <= 0) {
                        iM45029 = (C19806.m45029("۫ۗ") + i16) * (-123);
                        i4 = ((iM45029 ^ i17) * 18783) ^ 1532504636;
                        i5 = 751660297;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤ᩶") ^ i16;
                        i4 = ((iM45029 ^ i17) * (-25149)) ^ (-1249918299);
                        i5 = 1707645145;
                    }
                    int i20 = iM45029 ^ i5;
                    i13 = i;
                    i19 = i20;
                    i18 = i4;
                    itM4898 = itM4898;
                    break;
                case -2109700227:
                case -1571770757:
                    itM4898 = itM4898;
                    i = i13;
                    if (C2249.m6915() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢ۬") ^ i16;
                        i4 = ((iM45029 ^ i17) * 11215) ^ (-1767376699);
                        i5 = 1804507961;
                    } else {
                        iM45029 = (C19806.m45029("۠ۘ") + i17) * (-99);
                        i4 = ((iM45029 ^ i16) * 30517) ^ (-832166416);
                        i5 = 1885441970;
                    }
                    int i21 = iM45029 ^ i5;
                    i13 = i;
                    i19 = i21;
                    i18 = i4;
                    itM4898 = itM4898;
                    break;
                case -2083701535:
                case -482269698:
                    C2124.m6673();
                    if (RunnableC3388.f12514 < 0) {
                        itM4898 = itM4898;
                        i = i13;
                        iM45029 = ThreadFactoryC3888.m11306("ۢ۬") ^ i16;
                        i4 = ((iM45029 ^ i17) * 11215) ^ (-1767376699);
                        i5 = 1804507961;
                        int i22 = iM45029 ^ i5;
                        i13 = i;
                        i19 = i22;
                        i18 = i4;
                        itM4898 = itM4898;
                    } else {
                        iM11306 = C19806.m45029("ۘܳ") ^ i17;
                        i2 = ((iM11306 ^ i16) * 14775) ^ (-1055028989);
                        i3 = -1076071186;
                        i19 = iM11306 ^ i3;
                        i18 = i2;
                    }
                    break;
                case -2018929691:
                case -1860049303:
                    itM4898 = itM4898;
                    s = s;
                    i13 = i13;
                    if (i11 >= iMo1519) {
                        itM4898 = itM4898;
                        int iM11309 = (ThreadFactoryC3888.m11306("ۡ֨") ^ i16) * 51;
                        i18 = ((iM11309 ^ i17) * 26803) ^ (-380832010);
                        i13 = i13;
                        i19 = iM11309 ^ 881738825;
                        s = s;
                    } else {
                        iM11308 = (C19806.m45029("ۚۢ") ^ i17) * (-67);
                        i9 = ((iM11308 ^ i16) * (-3543)) ^ 1647732406;
                        i10 = 795478576;
                        i8 = iM11308 ^ i10;
                        i18 = i9;
                        i13 = i13;
                        s = s;
                        i19 = i8;
                        itM4898 = itM4898;
                    }
                    break;
                case -1903437482:
                case -1603541829:
                    i14 = 35319;
                    iM11308 = (i16 - ThreadFactoryC3888.m11306("ܰ۟")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i9 = ((iM11308 ^ i17) * (-4691)) ^ 2107930986;
                    i10 = 1567668612;
                    i8 = iM11308 ^ i10;
                    i18 = i9;
                    i13 = i13;
                    s = s;
                    i19 = i8;
                    itM4898 = itM4898;
                    break;
                case -1875456773:
                case -5964750:
                    itM4898 = itM4898;
                    i = i13;
                    s = sArr[141];
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        iM45029 = C19806.m45029("ۧۛ") ^ i16;
                        i4 = ((iM45029 ^ i17) * 31595) ^ 1255862972;
                        i5 = 1197015658;
                        int i23 = iM45029 ^ i5;
                        i13 = i;
                        i19 = i23;
                        i18 = i4;
                        itM4898 = itM4898;
                    } else {
                        i13 = i;
                        int iM450211 = C19806.m45029("ۘ᩸") ^ i17;
                        i4 = ((iM450211 ^ i16) * 21045) ^ (-818200883);
                        i19 = iM450211 ^ (-1315778184);
                        i18 = i4;
                        itM4898 = itM4898;
                    }
                    break;
                case -1804280079:
                case -1414949106:
                    if (RunnableC1606.f6488 >= 0) {
                        itM4898 = itM4898;
                        i = i13;
                        iM45029 = (C19806.m45029("۫ۗ") + i16) * (-123);
                        i4 = ((iM45029 ^ i17) * 18783) ^ 1532504636;
                        i5 = 751660297;
                        int i24 = iM45029 ^ i5;
                        i13 = i;
                        i19 = i24;
                        i18 = i4;
                        itM4898 = itM4898;
                    } else {
                        iM11306 = C19806.m45029("ۘܳ") ^ i17;
                        i2 = ((iM11306 ^ i16) * 14775) ^ (-1055028989);
                        i3 = -1076071186;
                        i19 = iM11306 ^ i3;
                        i18 = i2;
                    }
                    break;
                case -1742227317:
                case -664668379:
                    s = s;
                    i13 = i13;
                    c7262 = (C7262) C0278.m1776(itM10417);
                    itM4898 = C1398.m4898(c7262.mo19112());
                    int iM113010 = (ThreadFactoryC3888.m11306("ۡ֨") ^ i16) * 51;
                    i18 = ((iM113010 ^ i17) * 26803) ^ (-380832010);
                    i13 = i13;
                    i19 = iM113010 ^ 881738825;
                    s = s;
                    break;
                case -1697135435:
                case -946051028:
                    try {
                        PrintStream printStream = System.out;
                        StringBuilder sb = new StringBuilder();
                        C1148.m4223(sb, strM1533);
                        i13 = i13;
                        try {
                            s = s;
                            itM4898 = itM4898;
                            try {
                                C1148.m4223(sb, C2871.m8640(f74730, 142, 4, i14));
                                C1148.m4223(sb, str);
                                printStream.println(C2124.m6674(sb));
                                c0206.m1525(i11, str);
                                try {
                                    RunnableC1895.m6172(map, strM1533, str);
                                    break;
                                } catch (Exception unused) {
                                }
                            } catch (Exception unused2) {
                            }
                        } catch (Exception unused3) {
                            itM4898 = itM4898;
                            s = s;
                        }
                    } catch (Exception unused4) {
                        itM4898 = itM4898;
                        s = s;
                        i13 = i13;
                    }
                    iM11308 = C19806.m45029("᩷ۢ") ^ i16;
                    i9 = ((iM11308 ^ i17) * (-6335)) ^ (-226861510);
                    i10 = -1978825914;
                    i8 = iM11308 ^ i10;
                    i18 = i9;
                    i13 = i13;
                    s = s;
                    i19 = i8;
                    itM4898 = itM4898;
                    break;
                case -1533187058:
                case 665785732:
                    itM4898 = itM4898;
                    s = s;
                    i13 = i13;
                    if (C0962.m3748(itM10417)) {
                        iM11308 = C19806.m45029("᩷۬") ^ i17;
                        i9 = ((iM11308 ^ i16) * (-23105)) ^ 1690913432;
                        i10 = 718573906;
                    } else {
                        iM11308 = (C19806.m45029("ۚܺ") ^ i17) * (-55);
                        i9 = ((iM11308 ^ i16) * 5717) ^ (-449807140);
                        i10 = -855967538;
                    }
                    i8 = iM11308 ^ i10;
                    i18 = i9;
                    i13 = i13;
                    s = s;
                    i19 = i8;
                    itM4898 = itM4898;
                    break;
                case -1491898577:
                case 249098705:
                    itM4898 = itM4898;
                    s = s;
                    i13 = i13;
                    iMo19106 = c7262.mo19106() << 24;
                    iMo26942 = c0206.mo26942();
                    iM11308 = (C19806.m45029("᩶ۙ") + i16) * (-13);
                    i9 = ((iM11308 ^ i17) * 10095) ^ 832973900;
                    i10 = -1163798463;
                    i8 = iM11308 ^ i10;
                    i18 = i9;
                    i13 = i13;
                    s = s;
                    i19 = i8;
                    itM4898 = itM4898;
                    break;
                case -1401362347:
                case 1695916051:
                    itM4898 = itM4898;
                    s = s;
                    i13 = i13;
                    if (C0962.m3748(itM4898)) {
                        iM11308 = ThreadFactoryC3888.m11306("᩶᩹") ^ i17;
                        i9 = ((iM11308 ^ i16) * (-24559)) ^ 72826359;
                        i10 = 1679665102;
                    } else {
                        iM11308 = C19806.m45029("ܰ᩵") ^ i16;
                        i9 = ((iM11308 ^ i17) * 11005) ^ 645714808;
                        i10 = -304391976;
                    }
                    i8 = iM11308 ^ i10;
                    i18 = i9;
                    i13 = i13;
                    s = s;
                    i19 = i8;
                    itM4898 = itM4898;
                    break;
                case -1374849179:
                case 1593963221:
                    itM4898 = itM4898;
                    s = s;
                    i13 = i13;
                    if (strM1533 == null) {
                        iM11308 = C19806.m45029("᩷ۢ") ^ i16;
                        i9 = ((iM11308 ^ i17) * (-6335)) ^ (-226861510);
                        i10 = -1978825914;
                    } else {
                        iM11308 = (C19806.m45029("ۛۘ") + i17) * (-123);
                        i9 = ((iM11308 ^ i16) * (-18087)) ^ (-879419888);
                        i10 = 149242076;
                    }
                    i8 = iM11308 ^ i10;
                    i18 = i9;
                    i13 = i13;
                    s = s;
                    i19 = i8;
                    itM4898 = itM4898;
                    break;
                case -1361802594:
                case 583568096:
                    C1937.m6279();
                    C1419.m4973();
                    iM11306 = C19806.m45029("ۘܳ") ^ i17;
                    i2 = ((iM11306 ^ i16) * 14775) ^ (-1055028989);
                    i3 = -1076071186;
                    i19 = iM11306 ^ i3;
                    i18 = i2;
                    break;
                case -1258395374:
                case 56765780:
                    C1189.m4368();
                    if (C2477.m7593() < 0) {
                        itM4898 = itM4898;
                        i = i13;
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ᩶") ^ i16) * (-39);
                        i4 = ((iM45029 ^ i17) * 14737) ^ (-999246839);
                        i5 = 742540829;
                        int i25 = iM45029 ^ i5;
                        i13 = i;
                        i19 = i25;
                        i18 = i4;
                        itM4898 = itM4898;
                    } else {
                        iM11306 = (i16 - ThreadFactoryC3888.m11306("ۛ۬")) * (-127);
                        i2 = ((iM11306 ^ i17) * (-393)) ^ 1231155453;
                        i3 = 629267907;
                        i19 = iM11306 ^ i3;
                        i18 = i2;
                    }
                    break;
                case -1172241242:
                case 221035833:
                    RunnableC0195.m1431();
                    ThreadFactoryC3888.m11300();
                    break;
                case -1131205715:
                case 345476652:
                    if (!C3743.f13569) {
                        iM11306 = C19806.m45029("ۘܳ") ^ i17;
                        i2 = ((iM11306 ^ i16) * 14775) ^ (-1055028989);
                        i3 = -1076071186;
                        i19 = iM11306 ^ i3;
                        i18 = i2;
                    } else {
                        itM4898 = itM4898;
                        i = i13;
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩶") ^ i17;
                        i4 = ((iM45029 ^ i16) * 5415) ^ 1919657901;
                        i5 = -938046019;
                        int i26 = iM45029 ^ i5;
                        i13 = i;
                        i19 = i26;
                        i18 = i4;
                        itM4898 = itM4898;
                    }
                    break;
                case -1022536748:
                case 336964190:
                    itM4898 = itM4898;
                    i = i13;
                    sArr = f74730;
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = C19806.m45029("ᩴۖ") ^ i17;
                        i4 = ((iM45029 ^ i16) * 24409) ^ 269870151;
                        i5 = 545620940;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۧ") ^ i17;
                        i4 = ((iM45029 ^ i16) * 7875) ^ 2030718879;
                        i5 = 583415962;
                    }
                    int i27 = iM45029 ^ i5;
                    i13 = i;
                    i19 = i27;
                    i18 = i4;
                    itM4898 = itM4898;
                    break;
                case -1018661474:
                case 349236976:
                    itM4898 = itM4898;
                    i11++;
                    iM11308 = ThreadFactoryC3888.m11306("ۢܿ") ^ i16;
                    i9 = ((iM11308 ^ i17) * (-25213)) ^ 2084630538;
                    i10 = -823164181;
                    i8 = iM11308 ^ i10;
                    i18 = i9;
                    i13 = i13;
                    s = s;
                    i19 = i8;
                    itM4898 = itM4898;
                    break;
                case -961331899:
                case 1414321645:
                    itM4898 = itM4898;
                    s = s;
                    i13 = i13;
                    if (zM5058) {
                        iM11308 = C19806.m45029("᩷ۢ") ^ i16;
                        i9 = ((iM11308 ^ i17) * (-6335)) ^ (-226861510);
                        i10 = -1978825914;
                        i8 = iM11308 ^ i10;
                        i18 = i9;
                    } else {
                        int iM450212 = C19806.m45029("᩹ܺ") ^ i17;
                        int i28 = ((iM450212 ^ i16) * (-18897)) ^ (-8900037);
                        i8 = iM450212 ^ 673508824;
                        i18 = i28;
                    }
                    i13 = i13;
                    s = s;
                    i19 = i8;
                    itM4898 = itM4898;
                    break;
                case -955895734:
                case -785064219:
                    itM4898 = itM4898;
                    i = i13;
                    if (C1875.f7103 >= 0) {
                        iM45029 = (i17 - ThreadFactoryC3888.m11306("ܳ۟")) * 127;
                        i4 = ((iM45029 ^ i16) * (-12147)) ^ (-199325304);
                        i5 = 1356057969;
                    } else {
                        iM45029 = C19806.m45029("ܺ᩻") ^ i17;
                        i4 = ((iM45029 ^ i16) * (-24895)) ^ 1034000841;
                        i5 = 1814824374;
                    }
                    int i29 = iM45029 ^ i5;
                    i13 = i;
                    i19 = i29;
                    i18 = i4;
                    itM4898 = itM4898;
                    break;
                case -688981119:
                case 1927670250:
                    itM4898 = itM4898;
                    C0206 c0207 = (C0206) C0216.m1584(itM4898);
                    iMo1519 = c0207.mo1519();
                    i11 = 0;
                    c0206 = c0207;
                    iM11308 = ThreadFactoryC3888.m11306("ۢܿ") ^ i16;
                    i9 = ((iM11308 ^ i17) * (-25213)) ^ 2084630538;
                    i10 = -823164181;
                    i8 = iM11308 ^ i10;
                    i18 = i9;
                    i13 = i13;
                    s = s;
                    i19 = i8;
                    itM4898 = itM4898;
                    break;
                case -606146375:
                case 273249713:
                    itM4898 = itM4898;
                    i = i13;
                    if (C19806.f63586) {
                        iM45029 = (i17 - ThreadFactoryC3888.m11306("ܳ۟")) * 127;
                        i4 = ((iM45029 ^ i16) * (-12147)) ^ (-199325304);
                        i5 = 1356057969;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֡᩸") + i17) * (-39);
                        i4 = ((iM45029 ^ i16) * 19391) ^ (-1430991134);
                        i5 = 2118376671;
                    }
                    int i210 = iM45029 ^ i5;
                    i13 = i;
                    i19 = i210;
                    i18 = i4;
                    itM4898 = itM4898;
                    break;
                case -578530557:
                case 1543207989:
                    i14 = 56100;
                    iM11308 = (i16 - ThreadFactoryC3888.m11306("ܰ۟")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i9 = ((iM11308 ^ i17) * (-4691)) ^ 2107930986;
                    i10 = 1567668612;
                    i8 = iM11308 ^ i10;
                    i18 = i9;
                    i13 = i13;
                    s = s;
                    i19 = i8;
                    itM4898 = itM4898;
                    break;
                case -563959782:
                case 747545944:
                    itM4898 = itM4898;
                    i = i13;
                    if (C0629.f2722 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩶") ^ i17;
                        i4 = ((iM45029 ^ i16) * 5415) ^ 1919657901;
                        i5 = -938046019;
                    } else {
                        iM45029 = C19806.m45029("ۖᩴ") ^ i16;
                        i4 = ((iM45029 ^ i17) * 9975) ^ 596553407;
                        i5 = -1835478156;
                    }
                    int i211 = iM45029 ^ i5;
                    i13 = i;
                    i19 = i211;
                    i18 = i4;
                    itM4898 = itM4898;
                    break;
                case -555946565:
                case -359230356:
                    itM4898 = itM4898;
                    i = i13;
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ᩶") ^ i16) * (-39);
                        i4 = ((iM45029 ^ i17) * 14737) ^ (-999246839);
                        i5 = 742540829;
                    } else {
                        iM45029 = C19806.m45029("ۡۢ") ^ i16;
                        i4 = ((iM45029 ^ i17) * 24915) ^ (-1288855012);
                        i5 = -350830647;
                    }
                    int i212 = iM45029 ^ i5;
                    i13 = i;
                    i19 = i212;
                    i18 = i4;
                    itM4898 = itM4898;
                    break;
                case -430076974:
                case -324871513:
                    C10634.m26820();
                    if (C0050.f912 > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܳۙ") + i16) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i2 = ((iM11306 ^ i17) * (-18869)) ^ (-1298253810);
                        i3 = -1292139924;
                        i19 = iM11306 ^ i3;
                        i18 = i2;
                    } else {
                        itM4898 = itM4898;
                        i = i13;
                        iM45029 = ThreadFactoryC3888.m11306("ۢ۬") ^ i16;
                        i4 = ((iM45029 ^ i17) * 11215) ^ (-1767376699);
                        i5 = 1804507961;
                        int i213 = iM45029 ^ i5;
                        i13 = i;
                        i19 = i213;
                        i18 = i4;
                        itM4898 = itM4898;
                    }
                    break;
                case -419281451:
                case 1119764290:
                    break;
                case -333185208:
                case 236917549:
                    itM4898 = itM4898;
                    i13 = 72420100 + (s * s);
                    if (CallableC1627.f6528) {
                        int iM113011 = ThreadFactoryC3888.m11306("֫֡") ^ i16;
                        i18 = ((iM113011 ^ i17) * (-27259)) ^ (-1835881231);
                        i19 = iM113011 ^ 1851915077;
                    } else {
                        int iM450213 = C19806.m45029("ۘ᩸") ^ i17;
                        i4 = ((iM450213 ^ i16) * 21045) ^ (-818200883);
                        i19 = iM450213 ^ (-1315778184);
                        i18 = i4;
                    }
                    itM4898 = itM4898;
                    break;
                case -234611443:
                case 93404036:
                    itM4898 = itM4898;
                    s = s;
                    i13 = i13;
                    strM1533 = c0206.m1533(i11);
                    iM11308 = (C19806.m45029("ᩴܰ") + i16) * 53;
                    i9 = ((iM11308 ^ i17) * (-21307)) ^ (-1444220093);
                    i10 = -2107726402;
                    i8 = iM11308 ^ i10;
                    i18 = i9;
                    i13 = i13;
                    s = s;
                    i19 = i8;
                    itM4898 = itM4898;
                    break;
                case -99625561:
                case 2137281592:
                    C2642.m8171();
                    if (C2124.f7782 <= 0) {
                        itM4898 = itM4898;
                        i = i13;
                        iM45029 = (i17 - ThreadFactoryC3888.m11306("ܳ۟")) * 127;
                        i4 = ((iM45029 ^ i16) * (-12147)) ^ (-199325304);
                        i5 = 1356057969;
                        int i214 = iM45029 ^ i5;
                        i13 = i;
                        i19 = i214;
                        i18 = i4;
                        itM4898 = itM4898;
                    } else {
                        iM11306 = C19806.m45029("ۘܳ") ^ i17;
                        i2 = ((iM11306 ^ i16) * 14775) ^ (-1055028989);
                        i3 = -1076071186;
                        i19 = iM11306 ^ i3;
                        i18 = i2;
                    }
                    break;
                case -40085885:
                case 718069021:
                    itM4898 = itM4898;
                    s = s;
                    i13 = i13;
                    i12 = iMo19106 | (iMo26942 << 16);
                    if (C1668.f6641 < 0) {
                        iM11308 = C19806.m45029("᩹᩶") ^ i17;
                        i9 = ((iM11308 ^ i16) * 24061) ^ (-444813308);
                        i10 = -1876308223;
                        i8 = iM11308 ^ i10;
                        i18 = i9;
                        i13 = i13;
                        s = s;
                        i19 = i8;
                        itM4898 = itM4898;
                    } else {
                        i13 = i13;
                        s = s;
                        int iM450214 = C19806.m45029("ۘ᩸") ^ i17;
                        i4 = ((iM450214 ^ i16) * 21045) ^ (-818200883);
                        i19 = iM450214 ^ (-1315778184);
                        i18 = i4;
                        itM4898 = itM4898;
                    }
                    break;
                case 584749712:
                case 1885743470:
                    itM4898 = itM4898;
                    s = s;
                    i13 = i13;
                    try {
                        String str2 = (String) c1117.f5042.get(i12 | i11);
                        try {
                            C1419.m4970(str2);
                            zM5058 = C1460.m5058(strM1533, str2);
                            int iM113012 = (ThreadFactoryC3888.m11306("ۡ᩷") ^ i16) * (-39);
                            i18 = ((iM113012 ^ i17) * 7573) ^ 1478538253;
                            i13 = i13;
                            s = s;
                            i19 = iM113012 ^ (-2112087632);
                            str = str2;
                        } catch (Exception unused5) {
                            str = str2;
                            iM11308 = C19806.m45029("᩷ۢ") ^ i16;
                            i9 = ((iM11308 ^ i17) * (-6335)) ^ (-226861510);
                            i10 = -1978825914;
                            i8 = iM11308 ^ i10;
                            i18 = i9;
                            i13 = i13;
                            s = s;
                            i19 = i8;
                        }
                    } catch (Exception unused6) {
                    }
                    itM4898 = itM4898;
                    break;
                case 656900992:
                case 854432668:
                    itM4898 = itM4898;
                    int i30 = i13;
                    if ((s * 17020) - i30 > 0) {
                        iM11307 = ThreadFactoryC3888.m11306("֫ᩳ") ^ i17;
                        i6 = ((iM11307 ^ i16) * (-27595)) ^ (-843047083);
                        i7 = -385112943;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ۚ۠") + i17) * 41;
                        i6 = ((iM11307 ^ i16) * (-23395)) ^ 1085336800;
                        i7 = 639487988;
                    }
                    i8 = iM11307 ^ i7;
                    i18 = i6;
                    i13 = i30;
                    i19 = i8;
                    itM4898 = itM4898;
                    break;
                case 1110609103:
                case 2061922436:
                    C0278.m1789();
                    if (C2124.m6673() > 0) {
                        itM4898 = itM4898;
                        i = i13;
                        iM45029 = C19806.m45029("ᩴۖ") ^ i17;
                        i4 = ((iM45029 ^ i16) * 24409) ^ 269870151;
                        i5 = 545620940;
                        int i215 = iM45029 ^ i5;
                        i13 = i;
                        i19 = i215;
                        i18 = i4;
                        itM4898 = itM4898;
                    } else {
                        iM11306 = C19806.m45029("ۘܳ") ^ i17;
                        i2 = ((iM11306 ^ i16) * 14775) ^ (-1055028989);
                        i3 = -1076071186;
                        i19 = iM11306 ^ i3;
                        i18 = i2;
                    }
                    break;
                case 1356637440:
                case 1364344578:
                    itM4898 = itM4898;
                    s = s;
                    i13 = i13;
                    itM10417 = C3535.m10417(c22785.mo17615());
                    iM11308 = C19806.m45029("ܰ᩵") ^ i16;
                    i9 = ((iM11308 ^ i17) * 11005) ^ 645714808;
                    i10 = -304391976;
                    i8 = iM11308 ^ i10;
                    i18 = i9;
                    i13 = i13;
                    s = s;
                    i19 = i8;
                    itM4898 = itM4898;
                    break;
                default:
                    C0050.m946();
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = (i16 - ThreadFactoryC3888.m11306("ۛ۬")) * (-127);
                        i2 = ((iM11306 ^ i17) * (-393)) ^ 1231155453;
                        i3 = 629267907;
                        i19 = iM11306 ^ i3;
                        i18 = i2;
                    } else {
                        itM4898 = itM4898;
                        i = i13;
                        iM45029 = ThreadFactoryC3888.m11306("ۢ۬") ^ i16;
                        i4 = ((iM45029 ^ i17) * 11215) ^ (-1767376699);
                        i5 = 1804507961;
                        int i216 = iM45029 ^ i5;
                        i13 = i;
                        i19 = i216;
                        i18 = i4;
                        itM4898 = itM4898;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m50858(String str, boolean z) {
        int iM8641 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        char cM8652 = 0;
        int i3 = 1860727696;
        int i4 = RunnableC0195.f1321;
        int i5 = C2249.f8050;
        int iM11306 = (ThreadFactoryC3888.m11306("ᩴۧ") ^ i5) * (-89);
        int i6 = ((iM11306 ^ i4) * 22019) ^ 1301202311;
        int i7 = 943314280;
        while (true) {
            i3 = ((((i3 ^ i4) * 19237) >> 31) & i6) ^ (iM11306 ^ i7);
            switch (i3) {
                case -2120354589:
                case -1430529858:
                    return z2;
                case -2025814614:
                case 1748587583:
                    i2 = 0;
                    iM11306 = C19806.m45029("ᩳۡ") ^ i5;
                    i6 = ((iM11306 ^ i4) * (-1839)) ^ (-267432945);
                    i7 = 878255886;
                    break;
                case -1845144329:
                case 644283509:
                    if (C10634.f36300 >= 0) {
                        iM11306 = (C19806.m45029("ܺ᩷") ^ i4) * (-105);
                        i6 = ((iM11306 ^ i5) * 16597) ^ (-1459253879);
                        i7 = -42309590;
                    } else {
                        iM11306 = (C19806.m45029("֫᩶") ^ i5) * (-65);
                        i6 = ((iM11306 ^ i4) * (-28495)) ^ 2010868712;
                        i7 = -746610826;
                    }
                    break;
                case -1696158435:
                case -171307830:
                    C1460.m5050();
                    if (C1398.f5802 > 0) {
                        iM11306 = (i4 - C19806.m45029("ۚ֨")) * (-17);
                        i6 = ((iM11306 ^ i5) * 28613) ^ 1025044021;
                        i7 = -441875132;
                    } else {
                        iM11306 = (C19806.m45029("ۨۨ") + i5) * (-73);
                        i6 = ((iM11306 ^ i4) * 6457) ^ 1409839047;
                        i7 = 1906014906;
                    }
                    break;
                case -1647693554:
                case -76367313:
                    if (!C7105.m18985()) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۛۡ")) * 23;
                        i6 = ((iM11306 ^ i5) * (-20963)) ^ 208320128;
                        i7 = -738688279;
                    } else {
                        iM11306 = (C19806.m45029("ۨۨ") + i5) * (-73);
                        i6 = ((iM11306 ^ i4) * 6457) ^ 1409839047;
                        i7 = 1906014906;
                    }
                    break;
                case -1634856385:
                case 366525659:
                    if (cM8652 <= 'Z') {
                        iM11306 = C19806.m45029("ܽ᩶") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-32119)) ^ (-2142217514);
                        i7 = 881280740;
                    } else {
                        iM11306 = C19806.m45029("᩹ᩳ") ^ i5;
                        i6 = ((iM11306 ^ i4) * 30783) ^ 1741988730;
                        i7 = 931715504;
                    }
                    break;
                case -1505710916:
                case 518466542:
                    if (C2332.f8260) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ۢ") + i5) * 95;
                        i6 = ((iM11306 ^ i4) * (-10777)) ^ 323462678;
                        i7 = 336165775;
                    } else {
                        iM11306 = (C19806.m45029("ᩴ᩷") ^ i4) * (-89);
                        i6 = ((iM11306 ^ i5) * 12253) ^ (-2001972854);
                        i7 = 2110659804;
                    }
                    break;
                case -1403351478:
                case 922157547:
                    z2 = false;
                    z3 = true;
                    if (iM8641 >= 1) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷ۛ") ^ i4;
                        i6 = ((iM11306 ^ i5) * 31193) ^ (-158631773);
                        i7 = -952453656;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۬ۤ") ^ i4;
                        i6 = ((iM11306 ^ i5) * 3911) ^ 2113611905;
                        i7 = 575209416;
                    }
                    break;
                case -1291239457:
                case 999895306:
                    RunnableC0195.m1431();
                    if (C1066.m4023() > 0) {
                        iM11306 = (C19806.m45029("֫᩶") ^ i5) * (-65);
                        i6 = ((iM11306 ^ i4) * (-28495)) ^ 2010868712;
                        i7 = -746610826;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ܰ") + i5) * 43;
                        i6 = ((iM11306 ^ i4) * 11319) ^ 1966959354;
                        i7 = 1724808802;
                    }
                    break;
                case -1119438286:
                case -197561169:
                    if (i2 < iM8641) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜۢ") ^ i5) * (-29);
                        i6 = ((iM11306 ^ i4) * 16817) ^ (-1154597622);
                        i7 = 555646224;
                    } else {
                        iM11306 = (C19806.m45029("᩶ۛ") ^ i4) * (-43);
                        i6 = ((iM11306 ^ i5) * 5275) ^ 1009362766;
                        i7 = 395387463;
                    }
                    break;
                case -1052573382:
                case -88891403:
                    if (cM8652 == '$') {
                        iM11306 = C19806.m45029("ܽ᩶") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-32119)) ^ (-2142217514);
                        i7 = 881280740;
                    } else {
                        iM11306 = C19806.m45029("֨᩹") ^ i5;
                        i6 = ((iM11306 ^ i4) * o.a.u) ^ 50557133;
                        i7 = -1809285952;
                    }
                    break;
                case -964753033:
                case 1150171615:
                    if (C3577.m10565()) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("֨ۘ")) * 57;
                        i6 = ((iM11306 ^ i5) * (-12997)) ^ 764824019;
                        i7 = -1946530112;
                    } else {
                        iM11306 = C19806.m45029("ۤ۠") ^ i5;
                        i6 = ((iM11306 ^ i4) * 15637) ^ 690205333;
                        i7 = -67453927;
                    }
                    break;
                case -924647517:
                case -902762875:
                    i = 100;
                    iM11306 = (ThreadFactoryC3888.m11306("ۘۛ") ^ i5) * (-21);
                    i6 = ((iM11306 ^ i4) * 11201) ^ 1024558614;
                    i7 = -1685116050;
                    break;
                case -736344580:
                case 1898293985:
                    if (C1977.f7413 <= 0) {
                        iM11306 = (C19806.m45029("ۨۨ") + i5) * (-73);
                        i6 = ((iM11306 ^ i4) * 6457) ^ 1409839047;
                        i7 = 1906014906;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۟۫") + i4) * (-105);
                        i6 = ((iM11306 ^ i5) * 4069) ^ (-2106292891);
                        i7 = -516393713;
                    }
                    break;
                case -537263267:
                case 1174545306:
                    iM8641 = C2871.m8641(str);
                    if (z) {
                        iM11306 = C19806.m45029("ܶܳ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-10705)) ^ 1622060425;
                        i7 = 1776672363;
                    } else {
                        iM11306 = (C19806.m45029("֨ۙ") ^ i5) * 83;
                        i6 = ((iM11306 ^ i4) * (-21561)) ^ (-1923528907);
                        i7 = 136278310;
                    }
                    break;
                case -534343370:
                case 1809451426:
                    C2788.m8472();
                    if (!C1377.f5749) {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ܰ") + i5) * 43;
                        i6 = ((iM11306 ^ i4) * 11319) ^ 1966959354;
                        i7 = 1724808802;
                    } else {
                        iM11306 = (C19806.m45029("ۨۨ") + i5) * (-73);
                        i6 = ((iM11306 ^ i4) * 6457) ^ 1409839047;
                        i7 = 1906014906;
                    }
                    break;
                case -396253410:
                case 1391835363:
                    RunnableC1606.m5473();
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = (C19806.m45029("ᩴ᩷") ^ i4) * (-89);
                        i6 = ((iM11306 ^ i5) * 12253) ^ (-2001972854);
                        i7 = 2110659804;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ܰ") + i5) * 43;
                        i6 = ((iM11306 ^ i4) * 11319) ^ 1966959354;
                        i7 = 1724808802;
                    }
                    break;
                case -359508791:
                case 363282059:
                    cM8652 = C2871.m8652(str, i2);
                    if ('a' <= cM8652) {
                        iM11306 = (i4 - C19806.m45029("ۙ۟")) * (-55);
                        i6 = ((iM11306 ^ i5) * (-22447)) ^ 250339801;
                        i7 = -1941152697;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ۛ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-15935)) ^ 232861346;
                        i7 = -1702542844;
                    }
                    break;
                case -354579692:
                case -242325237:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۢ") + i4) * (-33);
                        i6 = ((iM11306 ^ i5) * 463) ^ (-1305673883);
                        i7 = 1935033329;
                    } else {
                        iM11306 = C19806.m45029("۫ܽ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-6939)) ^ 504309476;
                        i7 = -1227633309;
                    }
                    break;
                case -349848046:
                case 1414259838:
                    if (z) {
                        iM11306 = (C19806.m45029("ۨۗ") + i5) * (-105);
                        i6 = ((iM11306 ^ i4) * (-3267)) ^ 1344984417;
                        i7 = 1144286784;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۬ۤ") ^ i4;
                        i6 = ((iM11306 ^ i5) * 3911) ^ 2113611905;
                        i7 = 575209416;
                    }
                    break;
                case -215530481:
                case 12819788:
                    if (C1066.m4023() <= 0) {
                        iM11306 = (i4 - C19806.m45029("ۚ֨")) * (-17);
                        i6 = ((iM11306 ^ i5) * 28613) ^ 1025044021;
                        i7 = -441875132;
                    } else {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۢ᩸")) * (-15);
                        i6 = ((iM11306 ^ i4) * (-26873)) ^ (-1693589449);
                        i7 = -1402689971;
                    }
                    break;
                case -186323630:
                case -33153527:
                    i2++;
                    iM11306 = C19806.m45029("ᩳۡ") ^ i5;
                    i6 = ((iM11306 ^ i4) * (-1839)) ^ (-267432945);
                    i7 = 878255886;
                    break;
                case -162258762:
                case 1752920668:
                    i = 75;
                    iM11306 = (ThreadFactoryC3888.m11306("ۘۛ") ^ i5) * (-21);
                    i6 = ((iM11306 ^ i4) * 11201) ^ 1024558614;
                    i7 = -1685116050;
                    break;
                case -135739451:
                case 800224741:
                    if ('0' <= cM8652) {
                        iM11306 = ThreadFactoryC3888.m11306("۫ܰ") ^ i4;
                        i6 = ((iM11306 ^ i5) * 9943) ^ (-370265919);
                        i7 = -833529362;
                    } else {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۙۙ")) * (-127);
                        i6 = ((iM11306 ^ i4) * (-1357)) ^ (-809873519);
                        i7 = -1435272743;
                    }
                    break;
                case 144762523:
                case 1896701842:
                    if (C1398.f5802 <= 0) {
                        iM11306 = (C19806.m45029("ᩴ᩷") ^ i4) * (-89);
                        i6 = ((iM11306 ^ i5) * 12253) ^ (-2001972854);
                        i7 = 2110659804;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩹֨") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-18249)) ^ (-632894346);
                        i7 = -1558875824;
                    }
                    break;
                case 167028604:
                case 1836531561:
                    return z3;
                case 352765570:
                case 1262393696:
                    if (C3660.f13403 >= 0) {
                        iM11306 = (C19806.m45029("ۤ᩸") ^ i4) * (-27);
                        i6 = ((iM11306 ^ i5) * (-32291)) ^ 1575594857;
                        i7 = -883841607;
                    } else {
                        iM11306 = (C19806.m45029("᩷᩶") + i5) * (-105);
                        i6 = ((iM11306 ^ i4) * 29751) ^ 1996113518;
                        i7 = 491300505;
                    }
                    break;
                case 374926916:
                case 1847944197:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = (C19806.m45029("ۨۨ") + i5) * (-73);
                        i6 = ((iM11306 ^ i4) * 6457) ^ 1409839047;
                        i7 = 1906014906;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۜܽ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-30233)) ^ (-1933273287);
                        i7 = -1120786852;
                    }
                    break;
                case 381637518:
                case 1390187826:
                    if (cM8652 != '.') {
                        iM11306 = ThreadFactoryC3888.m11306("۬ۤ") ^ i4;
                        i6 = ((iM11306 ^ i5) * 3911) ^ 2113611905;
                        i7 = 575209416;
                    } else {
                        iM11306 = C19806.m45029("ܽ᩶") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-32119)) ^ (-2142217514);
                        i7 = 881280740;
                    }
                    break;
                case 507245712:
                case 820676872:
                    C1189.m4368();
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        iM11306 = C19806.m45029("ۤ۠") ^ i5;
                        i6 = ((iM11306 ^ i4) * 15637) ^ 690205333;
                        i7 = -67453927;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۛۡ")) * 23;
                        i6 = ((iM11306 ^ i5) * (-20963)) ^ 208320128;
                        i7 = -738688279;
                    }
                    break;
                case 626276118:
                case 1424192915:
                    if (cM8652 != '_') {
                        iM11306 = ThreadFactoryC3888.m11306("ۖۡ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-11111)) ^ 69675600;
                        i7 = 1499894637;
                    } else {
                        iM11306 = C19806.m45029("ܽ᩶") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-32119)) ^ (-2142217514);
                        i7 = 881280740;
                    }
                    break;
                case 641942444:
                case 1930296814:
                    if (C1148.f5161 <= 0) {
                        iM11306 = (C19806.m45029("ܺ᩷") ^ i4) * (-105);
                        i6 = ((iM11306 ^ i5) * 16597) ^ (-1459253879);
                        i7 = -42309590;
                    } else {
                        iM11306 = (C19806.m45029("᩸ۛ") + i5) * 55;
                        i6 = ((iM11306 ^ i4) * (-23965)) ^ 902958191;
                        i7 = 310802625;
                    }
                    break;
                case 768119078:
                case 1216107997:
                    if (C1025.m3861() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۢ") + i4) * (-33);
                        i6 = ((iM11306 ^ i5) * 463) ^ (-1305673883);
                        i7 = 1935033329;
                    } else {
                        iM11306 = (i5 - C19806.m45029("ۚᩳ")) * 25;
                        i6 = ((iM11306 ^ i4) * (-1065)) ^ 644562436;
                        i7 = -1885764804;
                    }
                    break;
                case 885511525:
                case 2007679852:
                    C1419.m4973();
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ܰ") + i5) * 43;
                        i6 = ((iM11306 ^ i4) * 11319) ^ 1966959354;
                        i7 = 1724808802;
                    } else {
                        iM11306 = (C19806.m45029("ۤ᩸") ^ i4) * (-27);
                        i6 = ((iM11306 ^ i5) * (-32291)) ^ 1575594857;
                        i7 = -883841607;
                    }
                    break;
                case 906172542:
                case 1000670845:
                    C1148.m4232();
                    iM11306 = (C19806.m45029("ۤ᩸") ^ i4) * (-27);
                    i6 = ((iM11306 ^ i5) * (-32291)) ^ 1575594857;
                    i7 = -883841607;
                    break;
                case 961785681:
                case 1174544457:
                    if ('A' <= cM8652) {
                        iM11306 = C19806.m45029("ۤܿ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-15803)) ^ 1051884967;
                        i7 = 1029380279;
                    } else {
                        iM11306 = C19806.m45029("᩹ᩳ") ^ i5;
                        i6 = ((iM11306 ^ i4) * 30783) ^ 1741988730;
                        i7 = 931715504;
                    }
                    break;
                case 1098011922:
                case 1806519953:
                    if (cM8652 <= 'z') {
                        iM11306 = C19806.m45029("ܽ᩶") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-32119)) ^ (-2142217514);
                        i7 = 881280740;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ۛ") ^ i4;
                        i6 = ((iM11306 ^ i5) * (-15935)) ^ 232861346;
                        i7 = -1702542844;
                    }
                    break;
                case 1274195622:
                case 1837388312:
                    if (cM8652 > '9') {
                        iM11306 = (i5 - ThreadFactoryC3888.m11306("ۙۙ")) * (-127);
                        i6 = ((iM11306 ^ i4) * (-1357)) ^ (-809873519);
                        i7 = -1435272743;
                    } else {
                        iM11306 = C19806.m45029("ܽ᩶") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-32119)) ^ (-2142217514);
                        i7 = 881280740;
                    }
                    break;
                case 1569790703:
                case 1943360314:
                    C1668.m5583();
                    return false;
                default:
                    if (iM8641 > i) {
                        iM11306 = ThreadFactoryC3888.m11306("۬ۤ") ^ i4;
                        i6 = ((iM11306 ^ i5) * 3911) ^ 2113611905;
                        i7 = 575209416;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶܿ") ^ i5;
                        i6 = ((iM11306 ^ i4) * (-7063)) ^ 477016296;
                        i7 = -1470438503;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:159:0x0330  */
    /* JADX WARN: Code duplicated, block: B:306:0x05df  */
    /* JADX WARN: Code duplicated, block: B:308:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:349:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:350:0x06aa A[PHI: r19 r22
      0x06aa: PHI (r19v5 int) = (r19v3 int), (r19v3 int), (r19v3 int), (r19v6 int) binds: [B:346:0x069e, B:348:0x06a4, B:286:0x057f, B:295:0x05af] A[DONT_GENERATE, DONT_INLINE]
      0x06aa: PHI (r22v5 int) = (r22v2 int), (r22v4 int), (r22v2 int), (r22v2 int) binds: [B:346:0x069e, B:348:0x06a4, B:286:0x057f, B:295:0x05af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50856(C22785 c22785, C2455 c2455) throws IOException {
        int i;
        int i2;
        String strM8240;
        int i3;
        String strM5502;
        Iterator it;
        int i4;
        int parent;
        int i5;
        boolean z;
        C12107 c12107M2916;
        String name;
        int iMo25192;
        short s = f74730[146];
        int i6 = s + 9302;
        int i7 = (s * s) + 86527204;
        int i8 = (i6 * i6) - (i7 + i7) <= 0 ? 52041 : 65052;
        Iterator itM4898 = C1398.m4898(c22785.mo17615());
        while (RunnableC1564.m5348(itM4898)) {
            Iterator itM10417 = C3535.m10417(((C7262) C0216.m1584(itM4898)).mo19112());
            while (C0962.m3748(itM10417)) {
                C0206 c0206 = (C0206) C0278.m1776(itM10417);
                if (f74729.contains(C0671.m3020(c0206))) {
                    itM4898 = itM4898;
                    itM10417 = itM10417;
                } else {
                    int iMo26942 = c0206.mo26942();
                    String strM1429 = RunnableC0195.m1429(f74730, 147, 4, i8);
                    if (iMo26942 != 1 || c0206.mo1536() > 1 || c0206.mo1519() != 0) {
                        if (c0206.mo1536() == 1) {
                            Iterator itM4899 = C1398.m4898(c0206.mo1530(0).mo31746());
                            i = 0;
                            i2 = 0;
                            while (C0962.m3748(itM4899)) {
                                InterfaceC3609 interfaceC3609 = (InterfaceC3609) C0216.m1584(itM4899);
                                if (!interfaceC3609.mo7644()) {
                                    InterfaceC9961 value = interfaceC3609.getValue();
                                    if ((value.mo25185() && !value.mo25187().mo11445() && C2249.m6911(value.mo25187().getValue())) || (value.mo25192() == 18 && value.getValue() == 0)) {
                                        i++;
                                    }
                                }
                                if (interfaceC3609.mo7644() && interfaceC3609.mo7647() != 0 && interfaceC3609.getValue().mo25193() == 16777216) {
                                    i2++;
                                }
                            }
                        } else {
                            i = 0;
                            i2 = 0;
                        }
                        Iterator itM10418 = C3535.m10417(c0206.mo25271());
                        int i9 = 0;
                        int i10 = 0;
                        int i11 = 0;
                        int i12 = 0;
                        int i13 = 0;
                        int i14 = 0;
                        int i15 = 0;
                        int i16 = 0;
                        int i17 = 0;
                        int i18 = 0;
                        int i19 = 0;
                        int i20 = 0;
                        int i21 = 0;
                        int i22 = 0;
                        int i23 = 0;
                        int i24 = 0;
                        int i25 = 0;
                        int i26 = 0;
                        int i27 = 0;
                        int i28 = 0;
                        while (true) {
                            boolean zM3748 = C0962.m3748(itM10418);
                            int i29 = i19;
                            int i30 = i20;
                            int i31 = i18;
                            String strM8640 = C2871.m8640(f74730, 151, 10, i8);
                            int i32 = i17;
                            String strM4969 = C1419.m4969(f74730, 161, 5, i8);
                            int i33 = i15;
                            String strM6288 = C1937.m6288(f74730, 166, 4, i8);
                            int i34 = i14;
                            String strM9715 = MenuItemOnMenuItemClickListenerC3244.m9715(f74730, 170, 8, i8);
                            int i35 = i13;
                            String strM9869 = ViewTreeObserverOnPreDrawListenerC3327.m9869(f74730, 178, 12, i8);
                            int i36 = i12;
                            String strM1588 = C0216.m1588(f74730, 190, 6, i8);
                            if (zM3748) {
                                Iterator itM10419 = C3535.m10417(((InterfaceC12783) C0278.m1776(itM10418)).mo31746());
                                while (RunnableC1564.m5348(itM10419)) {
                                    InterfaceC3609 interfaceC36010 = (InterfaceC3609) C0278.m1776(itM10419);
                                    if (interfaceC36010.mo7644() && interfaceC36010.mo7647() != 0) {
                                        Iterator itM104110 = C3535.m10417(interfaceC36010.values());
                                        int i37 = 16777217;
                                        while (true) {
                                            if (RunnableC1564.m5348(itM104110)) {
                                                it = itM10418;
                                                int i38 = i37 + 1;
                                                if (((InterfaceC9961) C0216.m1584(itM104110)).mo25193() == i37) {
                                                    i37 = i38;
                                                    itM10418 = it;
                                                }
                                            } else {
                                                it = itM10418;
                                                i9++;
                                            }
                                        }
                                    } else {
                                        it = itM10418;
                                    }
                                    if (interfaceC36010.mo7644() && interfaceC36010.mo7647() != 0) {
                                        Iterator itM48910 = C1398.m4898(interfaceC36010.values());
                                        while (true) {
                                            if (RunnableC1564.m5348(itM48910)) {
                                                InterfaceC9961 interfaceC9961 = (InterfaceC9961) C0278.m1776(itM48910);
                                                Iterator it2 = itM48910;
                                                int iMo25193 = interfaceC9961.mo25193();
                                                i4 = i9;
                                                if (iMo25193 >= 16777220 && iMo25193 <= 16777225 && ((iMo25192 = interfaceC9961.mo25192()) == 0 || iMo25192 == 1 || iMo25192 == 2 || iMo25192 == 3)) {
                                                    itM48910 = it2;
                                                    i9 = i4;
                                                }
                                            } else {
                                                i4 = i9;
                                                i10++;
                                            }
                                        }
                                    } else {
                                        i4 = i9;
                                    }
                                    if (interfaceC36010.mo7644() && ((parent = interfaceC36010.getParent()) == 0 || ((-65536) & parent) == 16973824 || ((parent >>> 16) & 255) == interfaceC36010.getType().mo26942())) {
                                        if (interfaceC36010.mo7647() == 0) {
                                            i5 = i10;
                                        } else {
                                            Iterator itM104111 = C3535.m10417(interfaceC36010.values());
                                            while (true) {
                                                if (C0962.m3748(itM104111)) {
                                                    InterfaceC9961 interfaceC9962 = (InterfaceC9961) C0278.m1776(itM104111);
                                                    Iterator it3 = itM104111;
                                                    if ((interfaceC9962.mo25193() & (-65536)) == 16842752) {
                                                        i5 = i10;
                                                    } else {
                                                        i5 = i10;
                                                        if ((interfaceC9962.mo25193() & (-16777216)) != (ThreadFactoryC3888.m11306(C3743.m10964(f74730, HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS, 3, i8)) ^ 2126628648)) {
                                                            itM104111 = it3;
                                                            i10 = i5;
                                                        }
                                                    }
                                                } else {
                                                    i5 = i10;
                                                }
                                            }
                                        }
                                        i36++;
                                    } else {
                                        i5 = i10;
                                    }
                                    if (!interfaceC36010.mo7644() && interfaceC36010.getValue().mo25192() == 18) {
                                        i35++;
                                    }
                                    if (!interfaceC36010.mo7644() && interfaceC36010.getValue().mo25192() == 5) {
                                        i34++;
                                    }
                                    if (!interfaceC36010.mo7644() && (interfaceC36010.getValue().mo25192() == 6 || interfaceC36010.getValue().mo25192() == 4)) {
                                        i32++;
                                    }
                                    if (interfaceC36010.mo7644() ? false : interfaceC36010.getValue().mo25189()) {
                                        i31++;
                                    }
                                    if (interfaceC36010.mo7644() ? false : interfaceC36010.getValue().mo25191()) {
                                        i16++;
                                    }
                                    if (interfaceC36010.mo7644()) {
                                        z = false;
                                    } else {
                                        InterfaceC9961 value2 = interfaceC36010.getValue();
                                        if (value2.mo25185() && ViewGroupOnHierarchyChangeListenerC1916.m6235(c2455, value2.mo25187().getValue()) == null) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                    }
                                    if (z) {
                                        i11++;
                                    }
                                    if (!interfaceC36010.mo7644() && interfaceC36010.getValue().mo25185() && (c12107M2916 = C0629.m2916(c2455, interfaceC36010.getValue().mo25187().getValue())) != null && C2249.m6912(c12107M2916) <= 1048576) {
                                        byte[] bArrM44470 = C19431.m44470(RunnableC0195.m1439(c2455, c12107M2916), 0);
                                        try {
                                            XmlResourceParserC11068 xmlResourceParserC11068M47106 = C20945.m47103(bArrM44470).m47106();
                                            while (true) {
                                                int next = xmlResourceParserC11068M47106.next();
                                                if (next != 1) {
                                                    if (next == 2) {
                                                        name = xmlResourceParserC11068M47106.getName();
                                                        if (!C1460.m5058(name, C2249.m6918(f74730, 510, 3, i8))) {
                                                        }
                                                    }
                                                    xmlResourceParserC11068M47106 = xmlResourceParserC11068M47106;
                                                } else {
                                                    name = null;
                                                }
                                            }
                                        } catch (Throwable unused) {
                                        }
                                        byte b = -1;
                                        if (name != null) {
                                            switch (ThreadFactoryC3888.m11306(name)) {
                                                case -1493546681:
                                                    if (AbstractC0464.m2315(name, C1875.m6105(f74730, 276, 14, i8))) {
                                                        b = 0;
                                                    }
                                                    break;
                                                case -1388777169:
                                                    if (C1460.m5058(name, ViewGroupOnHierarchyChangeListenerC1916.m6241(f74730, 290, 6, i8))) {
                                                        b = 1;
                                                    }
                                                    break;
                                                case -930826704:
                                                    if (AbstractC0464.m2315(name, C2704.m8240(f74730, 296, 6, i8))) {
                                                        b = 2;
                                                    }
                                                    break;
                                                case -925180581:
                                                    if (C1460.m5058(name, C10634.m26821(f74730, 302, 6, i8))) {
                                                        b = 3;
                                                    }
                                                    break;
                                                case -820387517:
                                                    if (AbstractC0464.m2315(name, C2249.m6918(f74730, 308, 6, i8))) {
                                                        b = 4;
                                                    }
                                                    break;
                                                case -510364471:
                                                    if (C1460.m5058(name, C7105.m18989(f74730, 314, 17, i8))) {
                                                        b = 5;
                                                    }
                                                    break;
                                                case -173195978:
                                                    if (AbstractC0464.m2315(name, C3577.m10571(f74730, 331, 21, i8))) {
                                                        b = 6;
                                                    }
                                                    break;
                                                case -94197862:
                                                    if (C1460.m5058(name, C1668.m5577(f74730, 352, 10, i8))) {
                                                        b = 7;
                                                    }
                                                    break;
                                                case 3056464:
                                                    if (C1460.m5058(name, C0797.m3361(f74730, 362, 4, i8))) {
                                                        b = 8;
                                                    }
                                                    break;
                                                case 3347807:
                                                    if (AbstractC0464.m2315(name, strM6288)) {
                                                        b = 9;
                                                    }
                                                    break;
                                                case 92909918:
                                                    if (AbstractC0464.m2315(name, C2124.m6685(f74730, 366, 5, i8))) {
                                                        b = 10;
                                                    }
                                                    break;
                                                case 94842723:
                                                    if (C1460.m5058(name, strM4969)) {
                                                        b = 11;
                                                    }
                                                    break;
                                                case 100360477:
                                                    if (C1460.m5058(name, C0526.m2424(f74730, 371, 5, i8))) {
                                                        b = 12;
                                                    }
                                                    break;
                                                case 103785528:
                                                    if (AbstractC0464.m2315(name, C3722.m10901(f74730, 376, 5, i8))) {
                                                        b = cb.k;
                                                    }
                                                    break;
                                                case 106438894:
                                                    if (C1460.m5058(name, C10634.m26821(f74730, 381, 5, i8))) {
                                                        b = cb.f77931l;
                                                    }
                                                    break;
                                                case 108532386:
                                                    if (AbstractC0464.m2315(name, RunnableC3388.m10056(f74730, 386, 11, i8))) {
                                                        b = 15;
                                                    }
                                                    break;
                                                case 109250890:
                                                    if (C1460.m5058(name, C2477.m7604(f74730, 397, 5, i8))) {
                                                        b = 16;
                                                    }
                                                    break;
                                                case 109399969:
                                                    if (AbstractC0464.m2315(name, C3535.m10423(f74730, 402, 5, i8))) {
                                                        b = 17;
                                                    }
                                                    break;
                                                case 1052832078:
                                                    if (AbstractC0464.m2315(name, RunnableC3388.m10056(f74730, 407, 9, i8))) {
                                                        b = 18;
                                                    }
                                                    break;
                                                case 1191572447:
                                                    if (C1460.m5058(name, C0962.m3747(f74730, 416, 8, i8))) {
                                                        b = 19;
                                                    }
                                                    break;
                                                case 1747193040:
                                                    if (AbstractC0464.m2315(name, ViewTreeObserverOnPreDrawListenerC3327.m9869(f74730, 424, 23, i8))) {
                                                        b = 20;
                                                    }
                                                    break;
                                                case 1862666772:
                                                    if (C1460.m5058(name, strM8640)) {
                                                        b = 21;
                                                    }
                                                    break;
                                                case 2013827269:
                                                    if (AbstractC0464.m2315(name, AbstractC0464.m2308(f74730, Scalar448.TARGET_LENGTH, 15, i8))) {
                                                        b = 22;
                                                    }
                                                    break;
                                                case 2118620333:
                                                    if (C1460.m5058(name, C1066.m4040(f74730, 462, 15, i8))) {
                                                        b = 23;
                                                    }
                                                    break;
                                            }
                                            switch (b) {
                                                case 0:
                                                case 1:
                                                case 2:
                                                case 4:
                                                case 5:
                                                case 7:
                                                case 8:
                                                case 11:
                                                case 12:
                                                case 17:
                                                case 22:
                                                case 23:
                                                    i29++;
                                                    break;
                                                case 3:
                                                case 10:
                                                case 16:
                                                case 18:
                                                    i24++;
                                                    break;
                                                case 6:
                                                case 14:
                                                case 20:
                                                    i27++;
                                                    break;
                                                case 9:
                                                    i26++;
                                                    break;
                                                case 13:
                                                    i21++;
                                                    break;
                                                case 15:
                                                    i33++;
                                                    break;
                                                case 19:
                                                    i16++;
                                                    i29++;
                                                    break;
                                                case 21:
                                                    i28++;
                                                    break;
                                                default:
                                                    String strM9716 = MenuItemOnMenuItemClickListenerC3244.m9716(name);
                                                    if (C0817.m3404(strM9716, strM1588) || C2124.m6675(strM9716, C0817.m3406(f74730, 521, 4, i8)) || C2124.m6675(strM9716, C2788.m8470(f74730, 525, 6, i8))) {
                                                        i21++;
                                                    } else if (C0817.m3404(strM9716, strM9869)) {
                                                        i22++;
                                                    } else if (C2124.m6675(strM9716, strM9715)) {
                                                        i23++;
                                                    } else if (!C0817.m3404(strM9716, C2124.m6685(f74730, 531, 16, i8))) {
                                                        System.out.println(C3577.m10567(C1066.m4040(f74730, 547, 19, i8), name));
                                                    } else {
                                                        i27++;
                                                    }
                                                    break;
                                            }
                                        } else {
                                            String strM11555 = C4052.m11555(bArrM44470);
                                            if (strM11555 != null) {
                                                switch (C19806.m45029(strM11555)) {
                                                    case 1468055:
                                                        if (AbstractC0464.m2315(strM11555, RunnableC1606.m5481(f74730, 477, 4, i8))) {
                                                            b = 0;
                                                        }
                                                        break;
                                                    case 1472726:
                                                        if (C1460.m5058(strM11555, C1875.m6105(f74730, 481, 4, i8))) {
                                                            b = 1;
                                                        }
                                                        break;
                                                    case 1475827:
                                                        if (C1460.m5058(strM11555, C1460.m5047(f74730, 485, 4, i8))) {
                                                            b = 2;
                                                        }
                                                        break;
                                                    case 1480755:
                                                        if (C1460.m5058(strM11555, C2871.m8640(f74730, 489, 4, i8))) {
                                                            b = 3;
                                                        }
                                                        break;
                                                    case 1481531:
                                                        if (C1460.m5058(strM11555, C1461.m5070(f74730, 493, 4, i8))) {
                                                            b = 4;
                                                        }
                                                        break;
                                                    case 1485557:
                                                        if (C1460.m5058(strM11555, C1189.m4365(f74730, 497, 4, i8))) {
                                                            b = 5;
                                                        }
                                                        break;
                                                    case 1485560:
                                                        if (AbstractC0464.m2315(strM11555, C0050.m940(f74730, 501, 4, i8))) {
                                                            b = 6;
                                                        }
                                                        break;
                                                    case 46127306:
                                                        if (AbstractC0464.m2315(strM11555, C0962.m3747(f74730, 505, 5, i8))) {
                                                            b = 7;
                                                        }
                                                        break;
                                                }
                                                switch (b) {
                                                    case 0:
                                                    case 1:
                                                    case 2:
                                                    case 7:
                                                        i29++;
                                                        break;
                                                    case 3:
                                                    case 5:
                                                    case 6:
                                                        i33++;
                                                        break;
                                                    case 4:
                                                        i30++;
                                                        i29++;
                                                        break;
                                                    default:
                                                        i25++;
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                    c2455 = c2455;
                                    i9 = i4;
                                    itM10418 = it;
                                    i10 = i5;
                                }
                                c2455 = c2455;
                                i19 = i29;
                                i20 = i30;
                                i18 = i31;
                                i17 = i32;
                                i15 = i33;
                                i14 = i34;
                                i13 = i35;
                                i12 = i36;
                            } else {
                                if (i > 0) {
                                    strM8240 = C1025.m3859(f74730, 196, 2, i8);
                                } else {
                                    i = 0;
                                    strM8240 = null;
                                }
                                if (i2 > i) {
                                    strM8240 = strM1429;
                                } else {
                                    i2 = i;
                                }
                                if (i9 > i2) {
                                    strM8240 = C0278.m1774(f74730, 198, 5, i8);
                                } else {
                                    i9 = i2;
                                }
                                if (i10 > i9) {
                                    strM8240 = C3286.m9788(f74730, 203, 7, i8);
                                } else {
                                    i10 = i9;
                                }
                                if (i11 > i10) {
                                    strM8240 = C0526.m2424(f74730, 210, 6, i8);
                                } else {
                                    i11 = i10;
                                }
                                int i39 = i36;
                                if (i39 > i11) {
                                    strM8240 = C1189.m4365(f74730, 216, 5, i8);
                                } else {
                                    i39 = i11;
                                }
                                if (i35 > i39) {
                                    strM8240 = C2704.m8240(f74730, 221, 4, i8);
                                    i39 = i35;
                                }
                                if (i34 > i39) {
                                    strM5502 = C3743.m10964(f74730, 228, 5, i8);
                                    i3 = i34;
                                } else {
                                    String str = strM8240;
                                    i3 = i39;
                                    strM5502 = str;
                                }
                                if (i33 > i3) {
                                    strM5502 = C1025.m3859(f74730, 233, 4, i8);
                                } else {
                                    i33 = i3;
                                }
                                if (i32 > i33) {
                                    strM5502 = C1025.m3859(f74730, 237, 8, i8);
                                    i33 = i32;
                                }
                                if (i31 > i33) {
                                    strM5502 = C2332.m7082(f74730, 245, 7, i8);
                                    i33 = i31;
                                }
                                if (i30 > i33) {
                                    strM5502 = C3535.m10423(f74730, 252, 6, i8);
                                    i33 = i30;
                                }
                                if (i29 > i33) {
                                    strM5502 = CallableC1627.m5502(f74730, 258, 8, i8);
                                    i33 = i29;
                                }
                                int i40 = i16;
                                if (i40 > i33) {
                                    i33 = i40;
                                } else {
                                    strM4969 = strM5502;
                                }
                                int i41 = i21;
                                if (i41 > i33) {
                                    i33 = i41;
                                } else {
                                    strM1588 = strM4969;
                                }
                                int i42 = i22;
                                if (i42 > i33) {
                                    i33 = i42;
                                } else {
                                    strM9869 = strM1588;
                                }
                                int i43 = i23;
                                if (i43 > i33) {
                                    i33 = i43;
                                } else {
                                    strM9715 = strM9869;
                                }
                                int i44 = i24;
                                if (i44 > i33) {
                                    strM9715 = MenuItemOnMenuItemClickListenerC3244.m9715(f74730, 266, 4, i8);
                                    i33 = i44;
                                }
                                int i45 = i25;
                                if (i45 > i33) {
                                    strM9715 = C1668.m5577(f74730, BottomAppBarTopEdgeTreatment.ANGLE_UP, 3, i8);
                                    i33 = i45;
                                }
                                int i46 = i26;
                                if (i46 > i33) {
                                    i33 = i46;
                                } else {
                                    strM6288 = strM9715;
                                }
                                int i47 = i27;
                                if (i47 > i33) {
                                    strM6288 = C1189.m4365(f74730, 273, 3, i8);
                                    i33 = i47;
                                }
                                if (i28 <= i33) {
                                    strM8640 = strM6288;
                                }
                                strM1429 = strM8640 != null ? strM8640 : String.format(CallableC1627.m5502(f74730, 513, 8, i8), C2788.m8476(c0206.mo26942()));
                                c0206 = c0206;
                            }
                        }
                    }
                    c0206.m1534(strM1429);
                }
                itM4898 = itM4898;
                c2455 = c2455;
                itM10417 = itM10417;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x050c A[PHI: r9 r13 r14 r43
      0x050c: PHI (r9v8 l.ܽۚۨ) = (r9v4 l.ܽۚۨ), (r9v2 l.ܽۚۨ), (r9v2 l.ܽۚۨ) binds: [B:118:0x04f4, B:115:0x04cd, B:89:0x0366] A[DONT_GENERATE, DONT_INLINE]
      0x050c: PHI (r13v7 java.lang.String) = (r13v2 java.lang.String), (r13v3 java.lang.String), (r13v2 java.lang.String) binds: [B:118:0x04f4, B:115:0x04cd, B:89:0x0366] A[DONT_GENERATE, DONT_INLINE]
      0x050c: PHI (r14v40 java.lang.String) = (r14v20 java.lang.String), (r14v21 java.lang.String), (r14v41 java.lang.String) binds: [B:118:0x04f4, B:115:0x04cd, B:89:0x0366] A[DONT_GENERATE, DONT_INLINE]
      0x050c: PHI (r43v28 java.lang.String) = (r43v15 java.lang.String), (r43v16 java.lang.String), (r43v29 java.lang.String) binds: [B:118:0x04f4, B:115:0x04cd, B:89:0x0366] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x031a A[PHI: r11 r33 r43
      0x031a: PHI (r11v4 int) = (r11v3 int), (r11v2 int) binds: [B:82:0x0318, B:75:0x02d0] A[DONT_GENERATE, DONT_INLINE]
      0x031a: PHI (r33v3 java.lang.String) = (r33v2 java.lang.String), (r33v1 java.lang.String) binds: [B:82:0x0318, B:75:0x02d0] A[DONT_GENERATE, DONT_INLINE]
      0x031a: PHI (r43v33 java.lang.String) = (r43v31 java.lang.String), (r43v34 java.lang.String) binds: [B:82:0x0318, B:75:0x02d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x0397 A[PHI: r43
      0x0397: PHI (r43v95 java.lang.String) = 
      (r43v30 java.lang.String)
      (r43v35 java.lang.String)
      (r43v39 java.lang.String)
      (r43v42 java.lang.String)
      (r43v96 java.lang.String)
     binds: [B:87:0x034e, B:72:0x02ac, B:217:0x0397, B:62:0x0230, B:51:0x01f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0131, code lost:
    
        if (l.C1148.f5161 > 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0193, code lost:
    
        if (l.MenuItemOnMenuItemClickListenerC3244.m9701() < 0) goto L24;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m50857(l.C22785 r58, l.C2455 r59, java.util.HashMap r60, java.util.HashMap r61, l.C1117 r62, boolean r63) {
        /*
            Method dump skipped, instruction units count: 3236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22991.m50857(l.᩺ۚۨ, l.ۖۢ᩺, java.util.HashMap, java.util.HashMap, l.֨۫ۨ, boolean):void");
    }
}
