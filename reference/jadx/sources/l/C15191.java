package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.umeng.analytics.pro.cb;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.ec.rfc8032.Scalar448;

/* JADX INFO: renamed from: l.ܳ۟ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5MS */
/* JADX INFO: loaded from: classes4.dex */
public final class C15191 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f49591 = 0;

    /* JADX INFO: renamed from: ܽܺۨ, reason: not valid java name and contains not printable characters */
    private static final short[] f49592 = {2672, -16342, -16321, -16322, -16335, -16335, -16323, -16322, -16323, -16352, -16330, -16325, -16321, -16329, -16324, -16330, -16352, -16333, -16347, -16333, -16336, -16322, -16329, -16332, -16323, -16324, -16346, -16332, -16352, -16333, -16335, -16346, -16325, -16323, -16324, -16325, -16330, -16325, -16324, -16346, -16329, -16352, -16350, -16323, -16322, -16333, -16346, -16323, -16352, -16325, -16324, -16346, -16329, -16331, -16329, -16352, -16322, -16333, -16341, -16323, -16345, -16346, -16321, -16325, -16350, -16321, -16333, -16350, -16321, -16329, -16324, -16345, -16350, -16322, -16345, -16352, -16333, -16322, -16351, -16352, -16333, -16347, -16351, -16346, -16341, -16322, -16329, -16351, -16346, -16352, -16325, -16324, -16331, -16346, -16352, -16333, -16324, -16351, -16325, -16346, -16325, -16323, -16324, -16372, -16333, -16346, -16346, -16352, -16257, -16350, -16352, -16325, -16348, -16333, -16346, -16329, -16333, -16346, -16346, -16352, -16333, -16352, -16352, -16333, -16341, -16333, -16324, -16325, -16321, -16333, -16324, -16325, -16321, -16333, -16346, -16323, -16352, -16336, -16323, -16323, -16322, 3154, 12592, 12590, 12590, 12592, 7130, 9618, 9607, 9607, 9601, 9629, 9618, 9605, 9626, 9620, 9618, 9607, 9626, 9628, 9629, 9616, 9628, 9631, 9628, 9601, 9630, 9622, 9629, 9606, 9618, 9629, 9626, 9630, 9618, 9607, 9628, 9601, 9626, 9629, 9607, 9622, 9601, 9603, 9628, 9631, 9618, 9607, 9628, 9601, 9631, 9618, 9610, 9628, 9606, 9607, 9626, 9623, 9618, 9601, 9601, 9618, 9610, 9603, 9631, 9606, 9601, 9618, 9631, 9600, 9600, 9607, 9601, 9626, 9629, 9620, 9600, 9607, 9610, 9631, 9622, 9617, 9628, 9628, 9631, -17008, 17811, 31187, 9623, 9626, 9630, 9622, 9629, 9621, 9628, 9629, 9607, 9621, 9601, 9618, 9616, 9607, 9626, 9628, 9629, 9626, 9629, 9607, 9622, 9620, 9622, 9601, 9630, 9626, 9603, 9630, 9618, 9603, 9623, 9601, 9618, 9604, 9618, 9617, 9631, 9622, 9618, 9629, 9626, 9630, 9601, 9618, 9604, 9611, 9630, 9631, 9618, 9629, 9626, 9630, 9618, 9607, 9626, 9628, 9629, 9694, 9631, 9626, 9600, 9607, 9617, 9626, 9607, 9630, 9618, 9603, 9601, 9626, 9603, 9603, 9631, 9622, 9601, 9628, 9607, 9618, 9607, 9622, 9605, 9622, 9616, 9607, 9628, 9601, 9618, 9629, 9626, 9630, 9618, 9607, 9622, 9623, 9694, 9600, 9622, 9631, 9622, 9616, 9607, 9628, 9601, 9618, 9616, 9616, 9622, 9600, 9600, 9626, 9617, 9626, 9631, 9626, 9607, 9610, 9694, 9600, 9622, 9601, 9605, 9626, 9616, 9622, 9631, 9618, 9610, 9622, 9601, 9694, 9631, 9626, 9600, 9607, 9616, 9631, 9626, 9603, 9618, 9631, 9603, 9627, 9618, 9626, 9629, 9600, 9622, 9607, 9630, 9622, 9601, 9620, 9622, 9603, 9618, 9607, 9627, 9600, 9621, 9628, 9629, 9607, 9694, 9621, 9618, 9630, 9626, 9631, 9610, 9600, 9616, 9618, 9631, 9622, 9600, 9627, 9618, 9603, 9622, 9607, 9601, 9618, 9629, 9600, 9631, 9618, 9607, 9622, 9600, 9622, 9631, 9622, 9616, 9607, 9628, 9601, 9629, 9622, 9607, 9604, 9628, 9601, 9624, 9694, 9600, 9622, 9616, 9606, 9601, 9626, 9607, 9610, 9694, 9616, 9628, 9629, 9621, 9626, 9620, 9618, 9629, 9626, 9630, 9618, 9607, 9622, 9623, 9694, 9601, 9628, 9607, 9618, 9607, 9622, 9618, 9629, 9626, 9630, 9618, 9607, 9622, 9623, 9694, 9605, 9622, 9616, 9607, 9628, 9601, 9693, 9617, 9630, 9603, 9693, 9620, 9626, 9621, 9693, 9625, 9603, 9620, 9693, 9628, 9607, 9621, 9693, 9603, 9629, 9620, 9693, 9607, 9607, 9616, 9693, 9607, 9607, 9621, 9693, 9604, 9622, 9617, 9603, 9600, 9622, 9607, 9607, 9610, 9603, 9622, 9686, 9667, 9665, 9643, 9605, 9626, 9622, 9604, 9617, 9606, 9607, 9607, 9628, 9629, 9603, 9601, 9622, 9621, 9622, 9601, 9622, 9629, 9616, 9622, 9600, 9616, 9601, 9622, 9622, 9629, 9638, 9629, 9624, 9629, 9628, 9604, 9629, 9683, 9621, 9626, 9601, 9600, 9607, 9683, 9607, 9618, 9620, 9673, 9683, 2460, -11016, -11025, -11015, -11097, -11089, -11078, -11080, -11022, -11099, -11016, -11025, -11015, -11099, -11015, -11010, -11016, -11037, -11036, -11027, -11029, -11016, -11016, -11029, -11021, -11014, -11034, -11009, -11016, -11029, -11034, -11015, -11100, -11022, -11033, -11034};

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final AbstractC8639 f49593;

    static {
        short[] sArr;
        short[] sArr2;
        int i;
        int i2;
        short[] sArr3;
        int i3;
        int i4;
        int i5;
        int i6;
        short[] sArr4;
        int i7;
        String[] strArr;
        short[] sArr5;
        int i8;
        int i9;
        int i10;
        short[] sArr6;
        short[] sArr7;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int iM3169;
        int i21;
        short[] sArr8;
        short[] sArr9;
        int iM2761;
        int i22;
        short[] sArr10;
        String str;
        int i23;
        int i24;
        int i25;
        int i26;
        int iM31610;
        int i27;
        int i28;
        int i29 = C4282.f15546;
        int i30 = C1321.f4751;
        int iM31611 = (C0773.m3169("ۤۛ") + i30) * 81;
        int i31 = ((iM31611 ^ i29) * 25087) ^ (-906606572);
        int i32 = 0;
        String strM9847 = null;
        String[] strArr2 = null;
        String strM13530 = null;
        String str2 = null;
        short[] sArr11 = null;
        short[] sArr12 = null;
        short[] sArr13 = null;
        short[] sArr14 = null;
        short[] sArr15 = null;
        short[] sArr16 = null;
        int i33 = -1429444374;
        String strM11769 = null;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        String strM6310 = null;
        String strM9937 = null;
        String strM53420 = null;
        String strM47853 = null;
        String str3 = null;
        String strM13650 = null;
        String strM6366 = null;
        String str4 = null;
        short[] sArr17 = null;
        short[] sArr18 = null;
        short[] sArr19 = null;
        int i39 = iM31611 ^ 1975302382;
        short s = 0;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        String strM9938 = null;
        String strM117610 = null;
        String strM3780 = null;
        String str5 = null;
        short[] sArr20 = null;
        short[] sArr21 = null;
        String strM6233 = null;
        String strM9486 = null;
        String strM2049 = null;
        short[] sArr22 = null;
        int i43 = 0;
        int i44 = 0;
        String str6 = null;
        short[] sArr23 = null;
        String strM20410 = null;
        short[] sArr24 = null;
        String strM9848 = null;
        int i45 = 0;
        while (true) {
            int i46 = i39 ^ (i31 & (((i33 ^ i29) * (-11147)) >> 31));
            switch (i46) {
                case -2012449061:
                case -1942039048:
                    i46 = i46;
                    sArr19 = sArr19;
                    sArr22 = sArr22;
                    i43 = i43;
                    sArr17 = sArr17;
                    i45 = i45;
                    sArr24 = sArr24;
                    sArr = sArr21;
                    sArr20 = sArr20;
                    sArr23 = sArr23;
                    i35 = i35;
                    sArr13 = sArr13;
                    sArr14 = sArr14;
                    sArr2 = sArr12;
                    i38 = i38;
                    sArr18 = sArr18;
                    i44 = i44;
                    i = i40;
                    i2 = i41;
                    int i47 = i34;
                    s = s;
                    sArr3 = sArr16;
                    i34 = i47;
                    strM6310 = C1826.m6310(f49592, 5, 5, i43);
                    short[] sArr25 = f49592;
                    if (!C0862.m3503()) {
                        sArr11 = sArr25;
                        sArr19 = sArr19;
                        i41 = i2;
                        i44 = i44;
                        sArr18 = sArr18;
                        i6 = 10;
                        int iM2762 = (C0619.m2761("᩷۠") ^ i29) * (-119);
                        int i48 = ((iM2762 ^ i30) * 32211) ^ 806255150;
                        i39 = iM2762 ^ 1262215270;
                        i38 = i38;
                        i40 = i;
                        sArr22 = sArr22;
                        i36 = i6;
                        i33 = i46;
                        sArr17 = sArr17;
                        i35 = i35;
                        i45 = i45;
                        sArr23 = sArr23;
                        sArr14 = sArr14;
                        sArr13 = sArr13;
                        sArr24 = sArr24;
                        sArr21 = sArr;
                        sArr12 = sArr2;
                        sArr11 = sArr11;
                        sArr20 = sArr20;
                        i43 = i43;
                        i31 = i48;
                        int i49 = i34;
                        sArr16 = sArr3;
                        s = s;
                        i34 = i49;
                    } else {
                        int iM2763 = (C0619.m2761("᩸ܰ") ^ i29) * 97;
                        int i50 = ((iM2763 ^ i30) * 1731) ^ 1613287837;
                        i3 = iM2763 ^ 731313122;
                        sArr11 = sArr25;
                        i4 = i50;
                        i40 = i;
                        sArr21 = sArr;
                        i5 = 10;
                        i14 = i5;
                        i43 = i43;
                        i15 = i3;
                        i39 = i15;
                        i31 = i4;
                        sArr19 = sArr19;
                        i41 = i2;
                        sArr11 = sArr11;
                        i44 = i44;
                        sArr18 = sArr18;
                        sArr17 = sArr17;
                        sArr23 = sArr23;
                        sArr12 = sArr2;
                        i6 = i14;
                        i38 = i38;
                        sArr22 = sArr22;
                        i36 = i6;
                        i33 = i46;
                        i35 = i35;
                        i45 = i45;
                        sArr14 = sArr14;
                        sArr13 = sArr13;
                        sArr24 = sArr24;
                        sArr11 = sArr11;
                        sArr20 = sArr20;
                        int i51 = i34;
                        sArr16 = sArr3;
                        s = s;
                        i34 = i51;
                    }
                    break;
                case -1924810740:
                case -166497572:
                    i46 = i46;
                    sArr19 = sArr19;
                    i43 = i43;
                    sArr17 = sArr17;
                    sArr24 = sArr24;
                    sArr = sArr21;
                    sArr20 = sArr20;
                    sArr23 = sArr23;
                    short[] sArr26 = sArr16;
                    i34 = i34;
                    i35 = i35;
                    sArr13 = sArr13;
                    sArr14 = sArr14;
                    sArr11 = sArr11;
                    sArr2 = sArr12;
                    i38 = i38;
                    s = s;
                    sArr18 = sArr18;
                    i44 = i44;
                    i = i40;
                    i20 = i41;
                    i6 = i36;
                    sArr9 = sArr26;
                    strM13530 = C4238.m13530(sArr9, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 5, i43);
                    sArr22 = f49592;
                    i45 = q.h;
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0773.m3169("᩶۟") ^ i30;
                        i22 = ((iM2761 ^ i29) * 5317) ^ 1619564628;
                        sArr10 = sArr9;
                        str = str6;
                        i23 = 2103738806;
                    } else {
                        iM2761 = C0619.m2761("ۖۡ") ^ i29;
                        i22 = ((iM2761 ^ i30) * (-21045)) ^ 763817431;
                        sArr10 = sArr9;
                        str = str6;
                        i23 = -132086227;
                    }
                    i39 = iM2761 ^ i23;
                    str6 = str;
                    s = s;
                    i41 = i20;
                    i40 = i;
                    i36 = i6;
                    i44 = i44;
                    sArr18 = sArr18;
                    sArr17 = sArr17;
                    sArr23 = sArr23;
                    sArr14 = sArr14;
                    sArr13 = sArr13;
                    sArr24 = sArr24;
                    sArr21 = sArr;
                    sArr12 = sArr2;
                    sArr11 = sArr11;
                    sArr20 = sArr20;
                    i34 = i34;
                    i38 = i38;
                    i35 = i35;
                    sArr16 = sArr10;
                    i43 = i43;
                    i31 = i22;
                    sArr19 = sArr19;
                    i33 = i46;
                    break;
                case -1848541547:
                case 1670395073:
                    i46 = i46;
                    sArr19 = sArr19;
                    i43 = i43;
                    sArr17 = sArr17;
                    i45 = i45;
                    sArr24 = sArr24;
                    sArr = sArr21;
                    sArr20 = sArr20;
                    sArr23 = sArr23;
                    sArr16 = sArr16;
                    i34 = i34;
                    i35 = i35;
                    sArr13 = sArr13;
                    sArr14 = sArr14;
                    sArr11 = sArr11;
                    sArr2 = sArr12;
                    i38 = i38;
                    s = s;
                    sArr18 = sArr18;
                    i44 = i44;
                    i = i40;
                    i20 = i41;
                    i6 = i36;
                    sArr22 = sArr22;
                    C1783.m6232();
                    if (C1343.f4799 == 0) {
                        sArr19 = sArr19;
                        i41 = i20;
                        i44 = i44;
                        sArr18 = sArr18;
                        sArr3 = sArr16;
                        int iM2764 = (C0619.m2761("᩷۠") ^ i29) * (-119);
                        int i410 = ((iM2764 ^ i30) * 32211) ^ 806255150;
                        i39 = iM2764 ^ 1262215270;
                        i38 = i38;
                        i40 = i;
                        sArr22 = sArr22;
                        i36 = i6;
                        i33 = i46;
                        sArr17 = sArr17;
                        i35 = i35;
                        i45 = i45;
                        sArr23 = sArr23;
                        sArr14 = sArr14;
                        sArr13 = sArr13;
                        sArr24 = sArr24;
                        sArr21 = sArr;
                        sArr12 = sArr2;
                        sArr11 = sArr11;
                        sArr20 = sArr20;
                        i43 = i43;
                        i31 = i410;
                        int i411 = i34;
                        sArr16 = sArr3;
                        s = s;
                        i34 = i411;
                    } else {
                        i16 = i38;
                        i40 = i;
                        i35 = i35;
                        sArr24 = sArr24;
                        sArr21 = sArr;
                        int iM31612 = (i30 - C0773.m3169("ܽۙ")) * (-73);
                        i39 = iM31612 ^ 987317379;
                        i43 = i43;
                        i31 = ((iM31612 ^ i29) * (-28949)) ^ 1013211216;
                        s = s;
                        i41 = i20;
                        sArr22 = sArr22;
                        i36 = i6;
                        i44 = i44;
                        sArr18 = sArr18;
                        sArr17 = sArr17;
                        i45 = i45;
                        sArr23 = sArr23;
                        sArr14 = sArr14;
                        sArr13 = sArr13;
                        sArr12 = sArr2;
                        sArr11 = sArr11;
                        sArr20 = sArr20;
                        i38 = i16;
                        sArr19 = sArr19;
                        i34 = i34;
                        i33 = i46;
                        sArr16 = sArr16;
                    }
                    break;
                case -1783546581:
                case 151603187:
                    i46 = i46;
                    sArr19 = sArr19;
                    i43 = i43;
                    sArr17 = sArr17;
                    i45 = i45;
                    sArr24 = sArr24;
                    sArr = sArr21;
                    sArr20 = sArr20;
                    sArr23 = sArr23;
                    sArr16 = sArr16;
                    i34 = i34;
                    i35 = i35;
                    sArr13 = sArr13;
                    sArr14 = sArr14;
                    sArr11 = sArr11;
                    sArr2 = sArr12;
                    i38 = i38;
                    s = s;
                    sArr18 = sArr18;
                    i44 = i44;
                    i = i40;
                    i20 = i41;
                    i6 = i36;
                    sArr22 = sArr22;
                    if (C23916.m53419() != 0) {
                        sArr22 = sArr22;
                        i45 = i45;
                        sArr9 = sArr16;
                        iM2761 = C0773.m3169("᩶۟") ^ i30;
                        i22 = ((iM2761 ^ i29) * 5317) ^ 1619564628;
                        sArr10 = sArr9;
                        str = str6;
                        i23 = 2103738806;
                        i39 = iM2761 ^ i23;
                        str6 = str;
                        s = s;
                        i41 = i20;
                        i40 = i;
                        i36 = i6;
                        i44 = i44;
                        sArr18 = sArr18;
                        sArr17 = sArr17;
                        sArr23 = sArr23;
                        sArr14 = sArr14;
                        sArr13 = sArr13;
                        sArr24 = sArr24;
                        sArr21 = sArr;
                        sArr12 = sArr2;
                        sArr11 = sArr11;
                        sArr20 = sArr20;
                        i34 = i34;
                        i38 = i38;
                        i35 = i35;
                        sArr16 = sArr10;
                        i43 = i43;
                        i31 = i22;
                        sArr19 = sArr19;
                        i33 = i46;
                    } else {
                        i16 = i38;
                        i40 = i;
                        i35 = i35;
                        sArr24 = sArr24;
                        sArr21 = sArr;
                        int iM31613 = (i30 - C0773.m3169("ܽۙ")) * (-73);
                        i39 = iM31613 ^ 987317379;
                        i43 = i43;
                        i31 = ((iM31613 ^ i29) * (-28949)) ^ 1013211216;
                        s = s;
                        i41 = i20;
                        sArr22 = sArr22;
                        i36 = i6;
                        i44 = i44;
                        sArr18 = sArr18;
                        sArr17 = sArr17;
                        i45 = i45;
                        sArr23 = sArr23;
                        sArr14 = sArr14;
                        sArr13 = sArr13;
                        sArr12 = sArr2;
                        sArr11 = sArr11;
                        sArr20 = sArr20;
                        i38 = i16;
                        sArr19 = sArr19;
                        i34 = i34;
                        i33 = i46;
                        sArr16 = sArr16;
                    }
                    break;
                case -1729756589:
                case 1509693112:
                    short[] sArr27 = sArr19;
                    sArr16 = sArr16;
                    strM9847 = C3033.m9847(f49592, 1, 3, i43);
                    sArr20 = f49592;
                    int iM2765 = C0619.m2761("ᩳ۟") ^ i30;
                    i39 = iM2765 ^ 1328513881;
                    i31 = ((iM2765 ^ i29) * (-20093)) ^ (-2000926142);
                    sArr19 = sArr27;
                    s = s;
                    sArr22 = sArr22;
                    i36 = i36;
                    i33 = i46;
                    sArr14 = sArr14;
                    sArr13 = sArr13;
                    sArr12 = sArr12;
                    sArr11 = sArr11;
                    i34 = i34;
                    i38 = i38;
                    i35 = i35;
                    sArr16 = sArr16;
                    break;
                case -1590165942:
                case 1377237866:
                    i46 = i46;
                    short[] sArr28 = sArr11;
                    short[] sArr29 = sArr12;
                    int i52 = i35;
                    i6 = i36;
                    i38 = i38;
                    sArr22 = sArr22;
                    int i53 = i34;
                    s = s;
                    short[] sArr30 = sArr16;
                    i34 = i53;
                    sArr4 = sArr18;
                    sArr17 = sArr17;
                    i35 = i52;
                    i7 = i44;
                    i45 = i45;
                    sArr23 = sArr23;
                    sArr14 = sArr14;
                    i = i40;
                    sArr13 = sArr13;
                    int i54 = i41;
                    sArr24 = sArr24;
                    sArr = sArr21;
                    sArr2 = sArr29;
                    sArr16 = sArr30;
                    i43 = i43;
                    sArr11 = sArr28;
                    sArr20 = sArr20;
                    strArr = new String[]{strM6310, strM6233, strM9937, strM9486, strM53420, strM47853, strM2049, strM9848, str3, strM13650, strM20410, strM9938, strM117610, strM6366, strM3780, C4238.m13530(sArr15, i53, 10, i43), strM9847, strM11769};
                    sArr19 = f49592;
                    i42 = IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    if (C3448.m11248() == 0) {
                        int iM31614 = C0773.m3169("ܰۤ") ^ i29;
                        sArr5 = sArr19;
                        i8 = iM31614 ^ 1835310000;
                        i9 = ((iM31614 ^ i30) * (-6321)) ^ 1860487479;
                        i41 = i54;
                        i10 = i37;
                        sArr17 = sArr17;
                        sArr6 = sArr23;
                        sArr3 = sArr16;
                        i18 = i8;
                        i17 = i9;
                        i19 = i34;
                        sArr18 = sArr4;
                        i37 = i10;
                        sArr7 = sArr6;
                        sArr8 = sArr15;
                        i13 = i17;
                        sArr19 = sArr5;
                        sArr15 = sArr8;
                        strArr2 = strArr;
                        sArr23 = sArr7;
                        i34 = i19;
                        i40 = i;
                        i44 = i7;
                        sArr21 = sArr;
                        sArr12 = sArr2;
                        i43 = i43;
                        i31 = i13;
                        i39 = i18;
                        i38 = i38;
                        sArr22 = sArr22;
                        i36 = i6;
                        i33 = i46;
                        i35 = i35;
                        i45 = i45;
                        sArr14 = sArr14;
                        sArr13 = sArr13;
                        sArr24 = sArr24;
                        sArr11 = sArr11;
                        sArr20 = sArr20;
                        int i55 = i34;
                        sArr16 = sArr3;
                        s = s;
                        i34 = i55;
                    } else {
                        i41 = i54;
                        sArr18 = sArr4;
                        strArr2 = strArr;
                        i44 = i7;
                        sArr3 = sArr16;
                        int iM2766 = (C0619.m2761("᩷۠") ^ i29) * (-119);
                        int i412 = ((iM2766 ^ i30) * 32211) ^ 806255150;
                        i39 = iM2766 ^ 1262215270;
                        i38 = i38;
                        i40 = i;
                        sArr22 = sArr22;
                        i36 = i6;
                        i33 = i46;
                        sArr17 = sArr17;
                        i35 = i35;
                        i45 = i45;
                        sArr23 = sArr23;
                        sArr14 = sArr14;
                        sArr13 = sArr13;
                        sArr24 = sArr24;
                        sArr21 = sArr;
                        sArr12 = sArr2;
                        sArr11 = sArr11;
                        sArr20 = sArr20;
                        i43 = i43;
                        i31 = i412;
                        int i413 = i34;
                        sArr16 = sArr3;
                        s = s;
                        i34 = i413;
                    }
                    break;
                case -1302750886:
                case -57649935:
                    i46 = i46;
                    sArr19 = sArr19;
                    short[] sArr31 = sArr11;
                    short[] sArr32 = sArr12;
                    int i56 = i35;
                    i6 = i36;
                    i38 = i38;
                    sArr22 = sArr22;
                    C2834.m9344();
                    i43 = i43;
                    sArr18 = sArr18;
                    sArr17 = sArr17;
                    i45 = i45;
                    sArr24 = sArr24;
                    sArr = sArr21;
                    sArr2 = sArr32;
                    sArr20 = sArr20;
                    sArr11 = sArr31;
                    sArr23 = sArr23;
                    sArr16 = sArr16;
                    i34 = i34;
                    sArr13 = sArr13;
                    sArr14 = sArr14;
                    i35 = i56;
                    s = s;
                    i44 = i44;
                    i = i40;
                    i20 = i41;
                    i16 = i38;
                    i40 = i;
                    i35 = i35;
                    sArr24 = sArr24;
                    sArr21 = sArr;
                    int iM31615 = (i30 - C0773.m3169("ܽۙ")) * (-73);
                    i39 = iM31615 ^ 987317379;
                    i43 = i43;
                    i31 = ((iM31615 ^ i29) * (-28949)) ^ 1013211216;
                    s = s;
                    i41 = i20;
                    sArr22 = sArr22;
                    i36 = i6;
                    i44 = i44;
                    sArr18 = sArr18;
                    sArr17 = sArr17;
                    i45 = i45;
                    sArr23 = sArr23;
                    sArr14 = sArr14;
                    sArr13 = sArr13;
                    sArr12 = sArr2;
                    sArr11 = sArr11;
                    sArr20 = sArr20;
                    i38 = i16;
                    sArr19 = sArr19;
                    i34 = i34;
                    i33 = i46;
                    sArr16 = sArr16;
                    break;
                case -1142459922:
                case 1490857436:
                    f49593 = AbstractC8639.m23277(str4, str6, strM13530, str5, str2, C2287.m7749(f49592, 137, 4, i43), strArr2);
                    return;
                case -1026469080:
                case 1943904086:
                    i46 = i46;
                    sArr19 = sArr19;
                    int i57 = i38;
                    int i58 = i35;
                    strM9848 = C3033.m9847(sArr13, i57, i58, i43);
                    i24 = i57;
                    i25 = i58;
                    String strM8881 = C2702.m8881(f49592, 56, 6, i43);
                    short[] sArr33 = f49592;
                    int iM31616 = (i30 - C0773.m3169("᩷ۛ")) * 29;
                    str3 = strM8881;
                    i31 = ((iM31616 ^ i29) * (-29715)) ^ (-283042350);
                    i26 = iM31616 ^ 395983814;
                    sArr14 = sArr33;
                    sArr19 = sArr19;
                    i38 = i24;
                    i35 = i25;
                    i33 = i46;
                    i39 = i26;
                    sArr22 = sArr22;
                    i36 = i36;
                    sArr11 = sArr11;
                    break;
                case -1021784196:
                case 1649762833:
                    short s2 = f49592[0];
                    int iM31617 = C0773.m3169("۫֡") ^ i29;
                    int i59 = ((iM31617 ^ i30) * (-4455)) ^ (-1792337177);
                    i26 = iM31617 ^ 56841335;
                    i32 = (s2 * s2) + 227647744;
                    s = s2;
                    i31 = i59;
                    sArr19 = sArr19;
                    i33 = i46;
                    i39 = i26;
                    sArr22 = sArr22;
                    i36 = i36;
                    sArr11 = sArr11;
                    break;
                case -915824131:
                case 1031592377:
                    i46 = i46;
                    sArr5 = sArr19;
                    int i60 = i36;
                    short[] sArr34 = sArr11;
                    short[] sArr35 = sArr12;
                    sArr22 = sArr22;
                    i6 = i60;
                    short[] sArr36 = sArr14;
                    strM13650 = C4282.m13650(sArr36, 62, 6, i43);
                    short[] sArr37 = f49592;
                    i37 = 68;
                    if (C2375.m8065() <= 0) {
                        sArr14 = sArr36;
                        i43 = i43;
                        i7 = i44;
                        i45 = i45;
                        i = i40;
                        sArr24 = sArr24;
                        sArr = sArr21;
                        sArr2 = sArr35;
                        sArr20 = sArr20;
                        sArr11 = sArr34;
                        i35 = i35;
                        sArr13 = sArr13;
                        i38 = i38;
                        sArr7 = sArr37;
                        sArr4 = sArr18;
                        i12 = i41;
                        int i61 = i34;
                        s = s;
                        sArr3 = sArr16;
                        i34 = i61;
                        int iM2767 = C0619.m2761("֨᩷") ^ i29;
                        i13 = ((iM2767 ^ i30) * 19481) ^ (-224975263);
                        i11 = iM2767 ^ 766128425;
                    } else {
                        int iM2768 = (C0619.m2761("ᩳ᩸") ^ i30) * (-57);
                        i7 = i44;
                        i45 = i45;
                        sArr24 = sArr24;
                        sArr = sArr21;
                        sArr2 = sArr35;
                        sArr20 = sArr20;
                        sArr11 = sArr34;
                        i35 = i35;
                        sArr13 = sArr13;
                        sArr14 = sArr36;
                        i38 = i38;
                        sArr7 = sArr37;
                        i11 = iM2768 ^ (-864490762);
                        sArr4 = sArr18;
                        i = i40;
                        i12 = i41;
                        i13 = ((iM2768 ^ i29) * (-4553)) ^ (-804609002);
                        i43 = i43;
                        int i62 = i34;
                        s = s;
                        sArr3 = sArr16;
                        i34 = i62;
                    }
                    i18 = i11;
                    sArr19 = sArr5;
                    i19 = i34;
                    sArr8 = sArr15;
                    strArr = strArr2;
                    i41 = i12;
                    sArr18 = sArr4;
                    sArr15 = sArr8;
                    strArr2 = strArr;
                    sArr23 = sArr7;
                    i34 = i19;
                    i40 = i;
                    i44 = i7;
                    sArr21 = sArr;
                    sArr12 = sArr2;
                    i43 = i43;
                    i31 = i13;
                    i39 = i18;
                    i38 = i38;
                    sArr22 = sArr22;
                    i36 = i6;
                    i33 = i46;
                    i35 = i35;
                    i45 = i45;
                    sArr14 = sArr14;
                    sArr13 = sArr13;
                    sArr24 = sArr24;
                    sArr11 = sArr11;
                    sArr20 = sArr20;
                    int i510 = i34;
                    sArr16 = sArr3;
                    s = s;
                    i34 = i510;
                    break;
                case -884689297:
                case -518411632:
                    i46 = i46;
                    sArr19 = sArr19;
                    i14 = i36;
                    short[] sArr38 = sArr11;
                    strM6233 = C1783.m6233(sArr38, i14, 5, i43);
                    strM9937 = RunnableC3055.m9937(f49592, 15, 8, i43);
                    short[] sArr39 = f49592;
                    int iM2769 = C0619.m2761("᩻᩻") ^ i30;
                    sArr2 = sArr39;
                    i15 = iM2769 ^ 2133606798;
                    i4 = ((iM2769 ^ i29) * (-16985)) ^ 58446223;
                    sArr11 = sArr38;
                    i2 = i41;
                    int i63 = i34;
                    s = s;
                    sArr3 = sArr16;
                    i34 = i63;
                    i39 = i15;
                    i31 = i4;
                    sArr19 = sArr19;
                    i41 = i2;
                    sArr11 = sArr11;
                    i44 = i44;
                    sArr18 = sArr18;
                    sArr17 = sArr17;
                    sArr23 = sArr23;
                    sArr12 = sArr2;
                    i6 = i14;
                    i38 = i38;
                    sArr22 = sArr22;
                    i36 = i6;
                    i33 = i46;
                    i35 = i35;
                    i45 = i45;
                    sArr14 = sArr14;
                    sArr13 = sArr13;
                    sArr24 = sArr24;
                    sArr11 = sArr11;
                    sArr20 = sArr20;
                    int i511 = i34;
                    sArr16 = sArr3;
                    s = s;
                    i34 = i511;
                    break;
                case -642264683:
                case -459667400:
                    i46 = i46;
                    sArr19 = sArr19;
                    short[] sArr40 = sArr12;
                    strM9486 = C2878.m9486(sArr40, 23, 4, i43);
                    sArr21 = f49592;
                    if (C11235.m28309() == 0) {
                        int iM27610 = (i30 - C0619.m2761("᩵ܺ")) * 99;
                        i4 = ((iM27610 ^ i29) * 10265) ^ (-2078144075);
                        i40 = 27;
                        sArr17 = sArr17;
                        i44 = i44;
                        i45 = i45;
                        sArr24 = sArr24;
                        sArr2 = sArr40;
                        sArr20 = sArr20;
                        sArr23 = sArr23;
                        i35 = i35;
                        sArr13 = sArr13;
                        sArr14 = sArr14;
                        i38 = i38;
                        sArr18 = sArr18;
                        i2 = i41;
                        short[] sArr41 = sArr22;
                        i3 = iM27610 ^ (-1263846992);
                        i43 = i43;
                        i5 = i36;
                        sArr22 = sArr41;
                        int i64 = i34;
                        s = s;
                        sArr3 = sArr16;
                        i34 = i64;
                        i14 = i5;
                        i43 = i43;
                        i15 = i3;
                        i39 = i15;
                        i31 = i4;
                        sArr19 = sArr19;
                        i41 = i2;
                        sArr11 = sArr11;
                        i44 = i44;
                        sArr18 = sArr18;
                        sArr17 = sArr17;
                        sArr23 = sArr23;
                        sArr12 = sArr2;
                        i6 = i14;
                        i38 = i38;
                        sArr22 = sArr22;
                        i36 = i6;
                        i33 = i46;
                        i35 = i35;
                        i45 = i45;
                        sArr14 = sArr14;
                        sArr13 = sArr13;
                        sArr24 = sArr24;
                        sArr11 = sArr11;
                        sArr20 = sArr20;
                        int i512 = i34;
                        sArr16 = sArr3;
                        s = s;
                        i34 = i512;
                    } else {
                        sArr2 = sArr40;
                        sArr13 = sArr13;
                        i16 = i38;
                        i40 = 27;
                        i20 = i41;
                        i6 = i36;
                        sArr22 = sArr22;
                        int iM31618 = (i30 - C0773.m3169("ܽۙ")) * (-73);
                        i39 = iM31618 ^ 987317379;
                        i43 = i43;
                        i31 = ((iM31618 ^ i29) * (-28949)) ^ 1013211216;
                        s = s;
                        i41 = i20;
                        sArr22 = sArr22;
                        i36 = i6;
                        i44 = i44;
                        sArr18 = sArr18;
                        sArr17 = sArr17;
                        i45 = i45;
                        sArr23 = sArr23;
                        sArr14 = sArr14;
                        sArr13 = sArr13;
                        sArr12 = sArr2;
                        sArr11 = sArr11;
                        sArr20 = sArr20;
                        i38 = i16;
                        sArr19 = sArr19;
                        i34 = i34;
                        i33 = i46;
                        sArr16 = sArr16;
                    }
                    break;
                case -638330011:
                case 984423572:
                    i46 = i46;
                    sArr5 = sArr19;
                    strM6366 = RunnableC1848.m6366(sArr18, i44, i41, i43);
                    strM3780 = C0950.m3780(f49592, 87, 6, i43);
                    short[] sArr42 = f49592;
                    int iM31619 = (C0773.m3169("ۧۡ") + i29) * 65;
                    i17 = ((iM31619 ^ i30) * 31801) ^ 1341186580;
                    i18 = iM31619 ^ (-319002139);
                    sArr15 = sArr42;
                    s = s;
                    i43 = i43;
                    i45 = i45;
                    sArr24 = sArr24;
                    sArr = sArr21;
                    sArr20 = sArr20;
                    sArr6 = sArr23;
                    sArr3 = sArr16;
                    i35 = i35;
                    sArr13 = sArr13;
                    sArr14 = sArr14;
                    sArr11 = sArr11;
                    sArr2 = sArr12;
                    i38 = i38;
                    i19 = 93;
                    i7 = i44;
                    i = i40;
                    strArr = strArr2;
                    i6 = i36;
                    sArr22 = sArr22;
                    i10 = i37;
                    i37 = i10;
                    sArr7 = sArr6;
                    sArr8 = sArr15;
                    i13 = i17;
                    sArr19 = sArr5;
                    sArr15 = sArr8;
                    strArr2 = strArr;
                    sArr23 = sArr7;
                    i34 = i19;
                    i40 = i;
                    i44 = i7;
                    sArr21 = sArr;
                    sArr12 = sArr2;
                    i43 = i43;
                    i31 = i13;
                    i39 = i18;
                    i38 = i38;
                    sArr22 = sArr22;
                    i36 = i6;
                    i33 = i46;
                    i35 = i35;
                    i45 = i45;
                    sArr14 = sArr14;
                    sArr13 = sArr13;
                    sArr24 = sArr24;
                    sArr11 = sArr11;
                    sArr20 = sArr20;
                    int i513 = i34;
                    sArr16 = sArr3;
                    s = s;
                    i34 = i513;
                    break;
                case -634984933:
                case -276350881:
                    i43 = 49234;
                    iM3169 = C0619.m2761("ۗܿ") ^ i30;
                    i4 = ((iM3169 ^ i29) * (-22693)) ^ 1177633897;
                    i21 = -10218869;
                    i15 = iM3169 ^ i21;
                    i14 = i36;
                    sArr2 = sArr12;
                    i2 = i41;
                    int i65 = i34;
                    s = s;
                    sArr3 = sArr16;
                    i34 = i65;
                    i39 = i15;
                    i31 = i4;
                    sArr19 = sArr19;
                    i41 = i2;
                    sArr11 = sArr11;
                    i44 = i44;
                    sArr18 = sArr18;
                    sArr17 = sArr17;
                    sArr23 = sArr23;
                    sArr12 = sArr2;
                    i6 = i14;
                    i38 = i38;
                    sArr22 = sArr22;
                    i36 = i6;
                    i33 = i46;
                    i35 = i35;
                    i45 = i45;
                    sArr14 = sArr14;
                    sArr13 = sArr13;
                    sArr24 = sArr24;
                    sArr11 = sArr11;
                    sArr20 = sArr20;
                    int i514 = i34;
                    sArr16 = sArr3;
                    s = s;
                    i34 = i514;
                    break;
                case -604019228:
                case 654849043:
                    i46 = i46;
                    sArr19 = sArr19;
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0773.m3169("۟ᩳ") ^ i29;
                        i4 = ((iM3169 ^ i30) * (-20765)) ^ (-1799824806);
                        i21 = 1194550432;
                        i15 = iM3169 ^ i21;
                        i14 = i36;
                        sArr2 = sArr12;
                        i2 = i41;
                        int i66 = i34;
                        s = s;
                        sArr3 = sArr16;
                        i34 = i66;
                        i39 = i15;
                        i31 = i4;
                        sArr19 = sArr19;
                        i41 = i2;
                        sArr11 = sArr11;
                        i44 = i44;
                        sArr18 = sArr18;
                        sArr17 = sArr17;
                        sArr23 = sArr23;
                        sArr12 = sArr2;
                        i6 = i14;
                        i38 = i38;
                        sArr22 = sArr22;
                        i36 = i6;
                        i33 = i46;
                        i35 = i35;
                        i45 = i45;
                        sArr14 = sArr14;
                        sArr13 = sArr13;
                        sArr24 = sArr24;
                        sArr11 = sArr11;
                        sArr20 = sArr20;
                        int i515 = i34;
                        sArr16 = sArr3;
                        s = s;
                        i34 = i515;
                    } else {
                        i43 = i43;
                        sArr17 = sArr17;
                        i45 = i45;
                        sArr24 = sArr24;
                        sArr = sArr21;
                        sArr20 = sArr20;
                        sArr23 = sArr23;
                        sArr16 = sArr16;
                        i34 = i34;
                        i35 = i35;
                        sArr13 = sArr13;
                        sArr14 = sArr14;
                        sArr11 = sArr11;
                        sArr2 = sArr12;
                        i38 = i38;
                        s = s;
                        sArr18 = sArr18;
                        i44 = i44;
                        i = i40;
                        i20 = i41;
                        i6 = i36;
                        sArr22 = sArr22;
                        i16 = i38;
                        i40 = i;
                        i35 = i35;
                        sArr24 = sArr24;
                        sArr21 = sArr;
                        int iM316110 = (i30 - C0773.m3169("ܽۙ")) * (-73);
                        i39 = iM316110 ^ 987317379;
                        i43 = i43;
                        i31 = ((iM316110 ^ i29) * (-28949)) ^ 1013211216;
                        s = s;
                        i41 = i20;
                        sArr22 = sArr22;
                        i36 = i6;
                        i44 = i44;
                        sArr18 = sArr18;
                        sArr17 = sArr17;
                        i45 = i45;
                        sArr23 = sArr23;
                        sArr14 = sArr14;
                        sArr13 = sArr13;
                        sArr12 = sArr2;
                        sArr11 = sArr11;
                        sArr20 = sArr20;
                        i38 = i16;
                        sArr19 = sArr19;
                        i34 = i34;
                        i33 = i46;
                        sArr16 = sArr16;
                    }
                    break;
                case -595336205:
                case 383553523:
                    i46 = i46;
                    sArr19 = sArr19;
                    String strM7980 = C2354.m7980(sArr22, i45, 4, i43);
                    String strM1236 = AbstractC0116.m1236(f49592, 129, 8, i43);
                    iM2761 = (C0619.m2761("۟ܺ") + i30) * (-105);
                    i22 = ((iM2761 ^ i29) * 11195) ^ 1404719495;
                    str2 = strM1236;
                    i43 = i43;
                    sArr17 = sArr17;
                    sArr24 = sArr24;
                    sArr = sArr21;
                    sArr20 = sArr20;
                    str5 = strM7980;
                    sArr23 = sArr23;
                    sArr10 = sArr16;
                    i34 = i34;
                    i35 = i35;
                    sArr13 = sArr13;
                    sArr14 = sArr14;
                    sArr11 = sArr11;
                    sArr2 = sArr12;
                    i38 = i38;
                    s = s;
                    sArr18 = sArr18;
                    i44 = i44;
                    i = i40;
                    i20 = i41;
                    str = str6;
                    i6 = i36;
                    i23 = 286618548;
                    i39 = iM2761 ^ i23;
                    str6 = str;
                    s = s;
                    i41 = i20;
                    i40 = i;
                    i36 = i6;
                    i44 = i44;
                    sArr18 = sArr18;
                    sArr17 = sArr17;
                    sArr23 = sArr23;
                    sArr14 = sArr14;
                    sArr13 = sArr13;
                    sArr24 = sArr24;
                    sArr21 = sArr;
                    sArr12 = sArr2;
                    sArr11 = sArr11;
                    sArr20 = sArr20;
                    i34 = i34;
                    i38 = i38;
                    i35 = i35;
                    sArr16 = sArr10;
                    i43 = i43;
                    i31 = i22;
                    sArr19 = sArr19;
                    i33 = i46;
                    break;
                case -545960654:
                case 810499384:
                    i46 = i46;
                    sArr19 = sArr19;
                    strM53420 = C23916.m53420(sArr21, i40, 8, i43);
                    strM47853 = C20932.m47853(f49592, 35, 2, i43);
                    sArr24 = f49592;
                    if (RunnableC3055.f9898 < 0) {
                        int iM27611 = C0619.m2761("ۧ۠") ^ i29;
                        i25 = i35;
                        i24 = i38;
                        i26 = iM27611 ^ 805577470;
                        i31 = ((iM27611 ^ i30) * 22701) ^ 1859640759;
                        sArr19 = sArr19;
                        i38 = i24;
                        i35 = i25;
                        i33 = i46;
                        i39 = i26;
                        sArr22 = sArr22;
                        i36 = i36;
                        sArr11 = sArr11;
                    } else {
                        sArr13 = sArr13;
                        sArr2 = sArr12;
                        i16 = i38;
                        i20 = i41;
                        i6 = i36;
                        sArr22 = sArr22;
                        int iM316111 = (i30 - C0773.m3169("ܽۙ")) * (-73);
                        i39 = iM316111 ^ 987317379;
                        i43 = i43;
                        i31 = ((iM316111 ^ i29) * (-28949)) ^ 1013211216;
                        s = s;
                        i41 = i20;
                        sArr22 = sArr22;
                        i36 = i6;
                        i44 = i44;
                        sArr18 = sArr18;
                        sArr17 = sArr17;
                        i45 = i45;
                        sArr23 = sArr23;
                        sArr14 = sArr14;
                        sArr13 = sArr13;
                        sArr12 = sArr2;
                        sArr11 = sArr11;
                        sArr20 = sArr20;
                        i38 = i16;
                        sArr19 = sArr19;
                        i34 = i34;
                        i33 = i46;
                        sArr16 = sArr16;
                    }
                    break;
                case -374053138:
                case 1607880266:
                    i46 = i46;
                    sArr19 = sArr19;
                    strM11769 = AbstractC3624.m11769(sArr20, 4, 1, i43);
                    if (C1826.f6190 <= 0) {
                        iM3169 = C0773.m3169("۟ᩳ") ^ i29;
                        i4 = ((iM3169 ^ i30) * (-20765)) ^ (-1799824806);
                        i21 = 1194550432;
                    } else {
                        iM3169 = C0773.m3169("֫᩻") ^ i29;
                        i4 = ((iM3169 ^ i30) * 3779) ^ 1928415929;
                        i21 = -1397816322;
                    }
                    i15 = iM3169 ^ i21;
                    i14 = i36;
                    sArr2 = sArr12;
                    i2 = i41;
                    int i67 = i34;
                    s = s;
                    sArr3 = sArr16;
                    i34 = i67;
                    i39 = i15;
                    i31 = i4;
                    sArr19 = sArr19;
                    i41 = i2;
                    sArr11 = sArr11;
                    i44 = i44;
                    sArr18 = sArr18;
                    sArr17 = sArr17;
                    sArr23 = sArr23;
                    sArr12 = sArr2;
                    i6 = i14;
                    i38 = i38;
                    sArr22 = sArr22;
                    i36 = i6;
                    i33 = i46;
                    i35 = i35;
                    i45 = i45;
                    sArr14 = sArr14;
                    sArr13 = sArr13;
                    sArr24 = sArr24;
                    sArr11 = sArr11;
                    sArr20 = sArr20;
                    int i516 = i34;
                    sArr16 = sArr3;
                    s = s;
                    i34 = i516;
                    break;
                case -246549714:
                case 346505522:
                    i46 = i46;
                    sArr19 = sArr19;
                    strM2049 = RunnableC0334.m2049(sArr24, 37, 12, i43);
                    sArr13 = f49592;
                    i38 = 49;
                    i35 = 7;
                    if (C1146.f4234 < 0) {
                        int iM27612 = (C0619.m2761("ۧ᩵") ^ i29) * 115;
                        i22 = ((iM27612 ^ i30) * 16831) ^ 1875473976;
                        i39 = iM27612 ^ (-1215436951);
                        i38 = 49;
                        i31 = i22;
                        sArr19 = sArr19;
                        i33 = i46;
                    } else {
                        sArr13 = sArr13;
                        sArr2 = sArr12;
                        i16 = i38;
                        i20 = i41;
                        i6 = i36;
                        sArr22 = sArr22;
                        int iM316112 = (i30 - C0773.m3169("ܽۙ")) * (-73);
                        i39 = iM316112 ^ 987317379;
                        i43 = i43;
                        i31 = ((iM316112 ^ i29) * (-28949)) ^ 1013211216;
                        s = s;
                        i41 = i20;
                        sArr22 = sArr22;
                        i36 = i6;
                        i44 = i44;
                        sArr18 = sArr18;
                        sArr17 = sArr17;
                        i45 = i45;
                        sArr23 = sArr23;
                        sArr14 = sArr14;
                        sArr13 = sArr13;
                        sArr12 = sArr2;
                        sArr11 = sArr11;
                        sArr20 = sArr20;
                        i38 = i16;
                        sArr19 = sArr19;
                        i34 = i34;
                        i33 = i46;
                        sArr16 = sArr16;
                    }
                    break;
                case 105124629:
                case 1642618915:
                    i43 = 55067;
                    iM3169 = C0619.m2761("ۗܿ") ^ i30;
                    i4 = ((iM3169 ^ i29) * (-22693)) ^ 1177633897;
                    i21 = -10218869;
                    i15 = iM3169 ^ i21;
                    i14 = i36;
                    sArr2 = sArr12;
                    i2 = i41;
                    int i68 = i34;
                    s = s;
                    sArr3 = sArr16;
                    i34 = i68;
                    i39 = i15;
                    i31 = i4;
                    sArr19 = sArr19;
                    i41 = i2;
                    sArr11 = sArr11;
                    i44 = i44;
                    sArr18 = sArr18;
                    sArr17 = sArr17;
                    sArr23 = sArr23;
                    sArr12 = sArr2;
                    i6 = i14;
                    i38 = i38;
                    sArr22 = sArr22;
                    i36 = i6;
                    i33 = i46;
                    i35 = i35;
                    i45 = i45;
                    sArr14 = sArr14;
                    sArr13 = sArr13;
                    sArr24 = sArr24;
                    sArr11 = sArr11;
                    sArr20 = sArr20;
                    int i517 = i34;
                    sArr16 = sArr3;
                    s = s;
                    i34 = i517;
                    break;
                case 278404651:
                case 666908532:
                    int i69 = s + 15088;
                    if ((i32 + i32) - (i69 * i69) < 0) {
                        iM31610 = (C0773.m3169("᩹ۖ") ^ i29) * 37;
                        i27 = ((iM31610 ^ i30) * 31073) ^ 1070690725;
                        i28 = 719012651;
                    } else {
                        iM31610 = C0773.m3169("ۘᩴ") ^ i30;
                        i27 = ((iM31610 ^ i29) * (-21929)) ^ 1972999802;
                        i28 = 1226770872;
                    }
                    i26 = iM31610 ^ i28;
                    i31 = i27;
                    sArr19 = sArr19;
                    i33 = i46;
                    i39 = i26;
                    sArr22 = sArr22;
                    i36 = i36;
                    sArr11 = sArr11;
                    break;
                case 354277902:
                case 2050061964:
                    i46 = i46;
                    sArr5 = sArr19;
                    strM117610 = AbstractC3624.m11769(sArr17, 79, 3, i43);
                    sArr18 = f49592;
                    i41 = 5;
                    if (C2485.f7950 == 0) {
                        int iM31620 = (C0773.m3169("ᩳܰ") ^ i30) * (-27);
                        i45 = i45;
                        sArr24 = sArr24;
                        sArr = sArr21;
                        sArr20 = sArr20;
                        strArr = strArr2;
                        i35 = i35;
                        sArr13 = sArr13;
                        sArr14 = sArr14;
                        sArr11 = sArr11;
                        sArr2 = sArr12;
                        i38 = i38;
                        i7 = 82;
                        sArr4 = sArr18;
                        i = i40;
                        i6 = i36;
                        i9 = ((iM31620 ^ i29) * 10291) ^ 1243620704;
                        sArr22 = sArr22;
                        i10 = i37;
                        i8 = iM31620 ^ 1461974442;
                        i43 = i43;
                        sArr6 = sArr23;
                        int i70 = i34;
                        s = s;
                        sArr3 = sArr16;
                        i34 = i70;
                        i18 = i8;
                        i17 = i9;
                        i19 = i34;
                        sArr18 = sArr4;
                        i37 = i10;
                        sArr7 = sArr6;
                        sArr8 = sArr15;
                        i13 = i17;
                        sArr19 = sArr5;
                        sArr15 = sArr8;
                        strArr2 = strArr;
                        sArr23 = sArr7;
                        i34 = i19;
                        i40 = i;
                        i44 = i7;
                        sArr21 = sArr;
                        sArr12 = sArr2;
                        i43 = i43;
                        i31 = i13;
                        i39 = i18;
                        i38 = i38;
                        sArr22 = sArr22;
                        i36 = i6;
                        i33 = i46;
                        i35 = i35;
                        i45 = i45;
                        sArr14 = sArr14;
                        sArr13 = sArr13;
                        sArr24 = sArr24;
                        sArr11 = sArr11;
                        sArr20 = sArr20;
                        int i518 = i34;
                        sArr16 = sArr3;
                        s = s;
                        i34 = i518;
                    } else {
                        i43 = i43;
                        sArr17 = sArr17;
                        i45 = i45;
                        sArr24 = sArr24;
                        sArr = sArr21;
                        sArr20 = sArr20;
                        sArr19 = sArr5;
                        sArr23 = sArr23;
                        sArr16 = sArr16;
                        i34 = i34;
                        strArr = strArr2;
                        i35 = i35;
                        sArr13 = sArr13;
                        sArr14 = sArr14;
                        sArr11 = sArr11;
                        sArr2 = sArr12;
                        i38 = i38;
                        i7 = 82;
                        s = s;
                        i = i40;
                        i6 = i36;
                        sArr22 = sArr22;
                        strArr2 = strArr;
                        i44 = i7;
                        sArr3 = sArr16;
                        int iM27613 = (C0619.m2761("᩷۠") ^ i29) * (-119);
                        int i414 = ((iM27613 ^ i30) * 32211) ^ 806255150;
                        i39 = iM27613 ^ 1262215270;
                        i38 = i38;
                        i40 = i;
                        sArr22 = sArr22;
                        i36 = i6;
                        i33 = i46;
                        sArr17 = sArr17;
                        i35 = i35;
                        i45 = i45;
                        sArr23 = sArr23;
                        sArr14 = sArr14;
                        sArr13 = sArr13;
                        sArr24 = sArr24;
                        sArr21 = sArr;
                        sArr12 = sArr2;
                        sArr11 = sArr11;
                        sArr20 = sArr20;
                        i43 = i43;
                        i31 = i414;
                        int i415 = i34;
                        sArr16 = sArr3;
                        s = s;
                        i34 = i415;
                    }
                    break;
                case 530937454:
                case 1148416650:
                    C0950.m3785();
                    throw new RuntimeException();
                case 1198460000:
                case 1237827857:
                    String strM3500 = C0862.m3500(sArr19, i42, 13, i43);
                    i46 = i46;
                    sArr19 = sArr19;
                    String strM10047 = C3077.m10047(f49592, 116, 4, i43);
                    short[] sArr43 = f49592;
                    iM2761 = C0773.m3169("ܺ۫") ^ i30;
                    i23 = 735936902;
                    sArr17 = sArr17;
                    sArr24 = sArr24;
                    sArr = sArr21;
                    sArr20 = sArr20;
                    sArr23 = sArr23;
                    i34 = i34;
                    i35 = i35;
                    sArr13 = sArr13;
                    sArr14 = sArr14;
                    sArr11 = sArr11;
                    sArr2 = sArr12;
                    i38 = i38;
                    s = s;
                    sArr18 = sArr18;
                    i44 = i44;
                    i = i40;
                    i20 = i41;
                    str = strM10047;
                    i6 = i36;
                    str4 = strM3500;
                    i22 = ((iM2761 ^ i29) * (-14797)) ^ 235733373;
                    i43 = i43;
                    sArr10 = sArr43;
                    i39 = iM2761 ^ i23;
                    str6 = str;
                    s = s;
                    i41 = i20;
                    i40 = i;
                    i36 = i6;
                    i44 = i44;
                    sArr18 = sArr18;
                    sArr17 = sArr17;
                    sArr23 = sArr23;
                    sArr14 = sArr14;
                    sArr13 = sArr13;
                    sArr24 = sArr24;
                    sArr21 = sArr;
                    sArr12 = sArr2;
                    sArr11 = sArr11;
                    sArr20 = sArr20;
                    i34 = i34;
                    i38 = i38;
                    i35 = i35;
                    sArr16 = sArr10;
                    i43 = i43;
                    i31 = i22;
                    sArr19 = sArr19;
                    i33 = i46;
                    break;
                default:
                    i46 = i46;
                    sArr5 = sArr19;
                    i43 = i43;
                    i45 = i45;
                    sArr24 = sArr24;
                    sArr = sArr21;
                    sArr20 = sArr20;
                    i35 = i35;
                    sArr13 = sArr13;
                    sArr14 = sArr14;
                    sArr11 = sArr11;
                    sArr2 = sArr12;
                    i38 = i38;
                    sArr4 = sArr18;
                    i7 = i44;
                    i = i40;
                    i12 = i41;
                    i6 = i36;
                    sArr22 = sArr22;
                    int i71 = i34;
                    s = s;
                    sArr3 = sArr16;
                    i34 = i71;
                    i10 = i37;
                    sArr6 = sArr23;
                    strM20410 = RunnableC0334.m2049(sArr6, i10, 4, i43);
                    strM9938 = RunnableC3055.m9937(f49592, 72, 7, i43);
                    sArr17 = f49592;
                    if (AbstractC3624.f12429 > 0) {
                        int iM27614 = (i29 - C0619.m2761("۬ۖ")) * (-43);
                        i9 = ((iM27614 ^ i30) * (-31841)) ^ (-715399482);
                        i8 = iM27614 ^ (-843464119);
                        strArr = strArr2;
                        i41 = i12;
                        i18 = i8;
                        i17 = i9;
                        i19 = i34;
                        sArr18 = sArr4;
                        i37 = i10;
                        sArr7 = sArr6;
                        sArr8 = sArr15;
                        i13 = i17;
                        sArr19 = sArr5;
                        sArr15 = sArr8;
                        strArr2 = strArr;
                        sArr23 = sArr7;
                        i34 = i19;
                        i40 = i;
                        i44 = i7;
                        sArr21 = sArr;
                        sArr12 = sArr2;
                        i43 = i43;
                        i31 = i13;
                        i39 = i18;
                        i38 = i38;
                        sArr22 = sArr22;
                        i36 = i6;
                        i33 = i46;
                        i35 = i35;
                        i45 = i45;
                        sArr14 = sArr14;
                        sArr13 = sArr13;
                        sArr24 = sArr24;
                        sArr11 = sArr11;
                        sArr20 = sArr20;
                        int i519 = i34;
                        sArr16 = sArr3;
                        s = s;
                        i34 = i519;
                    } else {
                        i37 = i10;
                        sArr7 = sArr6;
                        int iM27615 = C0619.m2761("֨᩷") ^ i29;
                        i13 = ((iM27615 ^ i30) * 19481) ^ (-224975263);
                        i11 = iM27615 ^ 766128425;
                        i18 = i11;
                        sArr19 = sArr5;
                        i19 = i34;
                        sArr8 = sArr15;
                        strArr = strArr2;
                        i41 = i12;
                        sArr18 = sArr4;
                        sArr15 = sArr8;
                        strArr2 = strArr;
                        sArr23 = sArr7;
                        i34 = i19;
                        i40 = i;
                        i44 = i7;
                        sArr21 = sArr;
                        sArr12 = sArr2;
                        i43 = i43;
                        i31 = i13;
                        i39 = i18;
                        i38 = i38;
                        sArr22 = sArr22;
                        i36 = i6;
                        i33 = i46;
                        i35 = i35;
                        i45 = i45;
                        sArr14 = sArr14;
                        sArr13 = sArr13;
                        sArr24 = sArr24;
                        sArr11 = sArr11;
                        sArr20 = sArr20;
                        int i5110 = i34;
                        sArr16 = sArr3;
                        s = s;
                        i34 = i5110;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0539 A[PHI: r19 r23
      0x0539: PHI (r19v35 int) = (r19v8 int), (r19v11 int), (r19v36 int) binds: [B:129:0x0537, B:117:0x04a8, B:26:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x0539: PHI (r23v27 java.util.Iterator) = (r23v3 java.util.Iterator), (r23v6 java.util.Iterator), (r23v28 java.util.Iterator) binds: [B:129:0x0537, B:117:0x04a8, B:26:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:138:0x058e A[PHI: r19 r23
      0x058e: PHI (r19v40 int) = (r19v6 int), (r19v7 int), (r19v41 int) binds: [B:137:0x058c, B:133:0x056b, B:18:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x058e: PHI (r23v32 java.util.Iterator) = (r23v1 java.util.Iterator), (r23v2 java.util.Iterator), (r23v33 java.util.Iterator) binds: [B:137:0x058c, B:133:0x056b, B:18:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b0, code lost:
    
        if (l.C0950.f3488 < 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b2, code lost:
    
        r23 = r2;
        r19 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c1, code lost:
    
        if (l.C2702.m8876() == false) goto L10;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m36538(l.C23001 r24, java.util.HashMap r25, l.C21905 r26) {
        /*
            Method dump skipped, instruction units count: 1762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15191.m36538(l.᩸ᩴۤ, java.util.HashMap, l.᩷۟ۤ):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:159:0x032b  */
    /* JADX WARN: Code duplicated, block: B:306:0x05da  */
    /* JADX WARN: Code duplicated, block: B:308:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:349:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:350:0x06a5 A[PHI: r19 r22
      0x06a5: PHI (r19v5 int) = (r19v3 int), (r19v3 int), (r19v3 int), (r19v6 int) binds: [B:346:0x0699, B:348:0x069f, B:286:0x057a, B:295:0x05aa] A[DONT_GENERATE, DONT_INLINE]
      0x06a5: PHI (r22v5 int) = (r22v2 int), (r22v4 int), (r22v2 int), (r22v2 int) binds: [B:346:0x0699, B:348:0x069f, B:286:0x057a, B:295:0x05aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36539(C23001 c23001, C22941 c22941) throws IOException {
        int i;
        int i2;
        String strM5471;
        int i3;
        String strM9847;
        Iterator it;
        int i4;
        int parent;
        int i5;
        boolean z;
        C8002 c8002M11760;
        String name;
        int iMo16635;
        short s = f49592[146];
        int i6 = ((s * s) + 541696) - (s * 1472) < 0 ? 17321 : 9715;
        Iterator itM2357 = C0487.m2357(c23001.mo15672());
        while (C3998.m12923(itM2357)) {
            Iterator itM47859 = C20932.m47859(((C25239) C4238.m13529(itM2357)).mo19822());
            while (C3998.m12923(itM47859)) {
                C23747 c23747 = (C23747) C0950.m3796(itM47859);
                if (f49593.contains(RunnableC0334.m2058(c23747))) {
                    itM2357 = itM2357;
                    itM47859 = itM47859;
                } else {
                    int iMo35833 = c23747.mo35833();
                    String strM11252 = C3448.m11252(f49592, 147, 4, i6);
                    if (iMo35833 != 1 || c23747.mo4331() > 1 || c23747.mo4328() != 0) {
                        if (c23747.mo4331() == 1) {
                            Iterator itM478510 = C20932.m47859(c23747.mo4334(0).mo9078());
                            i = 0;
                            i2 = 0;
                            while (C3998.m12923(itM478510)) {
                                InterfaceC8697 interfaceC8697 = (InterfaceC8697) C0950.m3796(itM478510);
                                if (!interfaceC8697.mo18155()) {
                                    InterfaceC5650 value = interfaceC8697.getValue();
                                    if ((value.mo16636() && !value.mo11710().mo8825() && C1564.m5512(value.mo11710().getValue())) || (value.mo16635() == 18 && value.getValue() == 0)) {
                                        i++;
                                    }
                                }
                                if (interfaceC8697.mo18155() && interfaceC8697.mo18154() != 0 && interfaceC8697.getValue().mo16637() == 16777216) {
                                    i2++;
                                }
                            }
                        } else {
                            i = 0;
                            i2 = 0;
                        }
                        Iterator itM478511 = C20932.m47859(c23747.mo33925());
                        int i7 = 0;
                        int i8 = 0;
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
                        while (true) {
                            boolean zM12923 = C3998.m12923(itM478511);
                            int i27 = i17;
                            int i28 = i18;
                            int i29 = i16;
                            String strM11486 = C3492.m11486(f49592, 151, 10, i6);
                            int i30 = i15;
                            String strM12266 = C3779.m12266(f49592, 161, 5, i6);
                            int i31 = i13;
                            String strM7980 = C2354.m7980(f49592, 166, 4, i6);
                            int i32 = i12;
                            String strM5472 = C1542.m5471(f49592, 170, 8, i6);
                            int i33 = i11;
                            String strM47853 = C20932.m47853(f49592, 178, 12, i6);
                            int i34 = i10;
                            String strM11996 = C3690.m11996(f49592, 190, 6, i6);
                            if (zM12923) {
                                Iterator itM478512 = C20932.m47859(((InterfaceC2731) C4238.m13529(itM478511)).mo9078());
                                while (C1826.m6317(itM478512)) {
                                    InterfaceC8697 interfaceC8698 = (InterfaceC8697) C4238.m13529(itM478512);
                                    if (interfaceC8698.mo18155() && interfaceC8698.mo18154() != 0) {
                                        Iterator itM2358 = C0487.m2357(interfaceC8698.values());
                                        int i35 = 16777217;
                                        while (true) {
                                            if (C3998.m12923(itM2358)) {
                                                it = itM478511;
                                                int i36 = i35 + 1;
                                                if (((InterfaceC5650) C0950.m3796(itM2358)).mo16637() == i35) {
                                                    i35 = i36;
                                                    itM478511 = it;
                                                }
                                            } else {
                                                it = itM478511;
                                                i7++;
                                            }
                                        }
                                    } else {
                                        it = itM478511;
                                    }
                                    if (interfaceC8698.mo18155() && interfaceC8698.mo18154() != 0) {
                                        Iterator itM478513 = C20932.m47859(interfaceC8698.values());
                                        while (true) {
                                            if (C1826.m6317(itM478513)) {
                                                InterfaceC5650 interfaceC5650 = (InterfaceC5650) C0950.m3796(itM478513);
                                                Iterator it2 = itM478513;
                                                int iMo16637 = interfaceC5650.mo16637();
                                                i4 = i7;
                                                if (iMo16637 >= 16777220 && iMo16637 <= 16777225 && ((iMo16635 = interfaceC5650.mo16635()) == 0 || iMo16635 == 1 || iMo16635 == 2 || iMo16635 == 3)) {
                                                    itM478513 = it2;
                                                    i7 = i4;
                                                }
                                            } else {
                                                i4 = i7;
                                                i8++;
                                            }
                                        }
                                    } else {
                                        i4 = i7;
                                    }
                                    if (interfaceC8698.mo18155() && ((parent = interfaceC8698.getParent()) == 0 || ((-65536) & parent) == 16973824 || ((parent >>> 16) & 255) == interfaceC8698.getType().mo35833())) {
                                        if (interfaceC8698.mo18154() == 0) {
                                            i5 = i8;
                                        } else {
                                            Iterator itM2359 = C0487.m2357(interfaceC8698.values());
                                            while (true) {
                                                if (C1826.m6317(itM2359)) {
                                                    InterfaceC5650 interfaceC5651 = (InterfaceC5650) C0950.m3796(itM2359);
                                                    Iterator it3 = itM2359;
                                                    if ((interfaceC5651.mo16637() & (-65536)) == 16842752) {
                                                        i5 = i8;
                                                    } else {
                                                        i5 = i8;
                                                        if ((interfaceC5651.mo16637() & (-16777216)) != (C0773.m3169(C1343.m4939(f49592, HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS, 3, i6)) ^ 2101875555)) {
                                                            itM2359 = it3;
                                                            i8 = i5;
                                                        }
                                                    }
                                                } else {
                                                    i5 = i8;
                                                }
                                            }
                                        }
                                        i34++;
                                    } else {
                                        i5 = i8;
                                    }
                                    if (!interfaceC8698.mo18155() && interfaceC8698.getValue().mo16635() == 18) {
                                        i33++;
                                    }
                                    if (!interfaceC8698.mo18155() && interfaceC8698.getValue().mo16635() == 5) {
                                        i32++;
                                    }
                                    if (!interfaceC8698.mo18155() && (interfaceC8698.getValue().mo16635() == 6 || interfaceC8698.getValue().mo16635() == 4)) {
                                        i30++;
                                    }
                                    if (interfaceC8698.mo18155() ? false : interfaceC8698.getValue().mo16632()) {
                                        i29++;
                                    }
                                    if (interfaceC8698.mo18155() ? false : interfaceC8698.getValue().mo16634()) {
                                        i14++;
                                    }
                                    if (interfaceC8698.mo18155()) {
                                        z = false;
                                    } else {
                                        InterfaceC5650 value2 = interfaceC8698.getValue();
                                        if (value2.mo16636() && AbstractC3624.m11760(c22941, value2.mo11710().getValue()) == null) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                    }
                                    if (z) {
                                        i9++;
                                    }
                                    if (!interfaceC8698.mo18155() && interfaceC8698.getValue().mo16636() && (c8002M11760 = AbstractC3624.m11760(c22941, interfaceC8698.getValue().mo11710().getValue())) != null && C23916.m53421(c8002M11760) <= 1048576) {
                                        byte[] bArrM46522 = C20244.m46522(C2310.m7804(c22941, c8002M11760), 0);
                                        try {
                                            XmlResourceParserC9734 xmlResourceParserC9734M35991 = C14955.m35982(bArrM46522).m35991();
                                            while (true) {
                                                int next = xmlResourceParserC9734M35991.next();
                                                if (next != 1) {
                                                    if (next == 2) {
                                                        name = xmlResourceParserC9734M35991.getName();
                                                        if (!C2419.m8175(name, C4238.m13530(f49592, 510, 3, i6))) {
                                                        }
                                                    }
                                                    xmlResourceParserC9734M35991 = xmlResourceParserC9734M35991;
                                                } else {
                                                    name = null;
                                                }
                                            }
                                        } catch (Throwable unused) {
                                        }
                                        byte b = -1;
                                        if (name != null) {
                                            switch (C0619.m2761(name)) {
                                                case -1493546681:
                                                    if (C3492.m11490(name, RunnableC3646.m11809(f49592, 276, 14, i6))) {
                                                        b = 0;
                                                    }
                                                    break;
                                                case -1388777169:
                                                    if (C3492.m11490(name, C13473.m33137(f49592, 290, 6, i6))) {
                                                        b = 1;
                                                    }
                                                    break;
                                                case -930826704:
                                                    if (C2419.m8175(name, C2702.m8881(f49592, 296, 6, i6))) {
                                                        b = 2;
                                                    }
                                                    break;
                                                case -925180581:
                                                    if (C2419.m8175(name, C2288.m7761(f49592, 302, 6, i6))) {
                                                        b = 3;
                                                    }
                                                    break;
                                                case -820387517:
                                                    if (C3492.m11490(name, C4238.m13530(f49592, 308, 6, i6))) {
                                                        b = 4;
                                                    }
                                                    break;
                                                case -510364471:
                                                    if (C3492.m11490(name, C3077.m10047(f49592, 314, 17, i6))) {
                                                        b = 5;
                                                    }
                                                    break;
                                                case -173195978:
                                                    if (C3492.m11490(name, C3099.m10092(f49592, 331, 21, i6))) {
                                                        b = 6;
                                                    }
                                                    break;
                                                case -94197862:
                                                    if (C3492.m11490(name, RunnableC0334.m2049(f49592, 352, 10, i6))) {
                                                        b = 7;
                                                    }
                                                    break;
                                                case 3056464:
                                                    if (C2419.m8175(name, C3077.m10047(f49592, 362, 4, i6))) {
                                                        b = 8;
                                                    }
                                                    break;
                                                case 3347807:
                                                    if (C3492.m11490(name, strM7980)) {
                                                        b = 9;
                                                    }
                                                    break;
                                                case 92909918:
                                                    if (C3492.m11490(name, C3099.m10092(f49592, 366, 5, i6))) {
                                                        b = 10;
                                                    }
                                                    break;
                                                case 94842723:
                                                    if (C3492.m11490(name, strM12266)) {
                                                        b = 11;
                                                    }
                                                    break;
                                                case 100360477:
                                                    if (C2419.m8175(name, C3099.m10092(f49592, 371, 5, i6))) {
                                                        b = 12;
                                                    }
                                                    break;
                                                case 103785528:
                                                    if (C2419.m8175(name, C3998.m12925(f49592, 376, 5, i6))) {
                                                        b = cb.k;
                                                    }
                                                    break;
                                                case 106438894:
                                                    if (C3492.m11490(name, C13473.m33137(f49592, 381, 5, i6))) {
                                                        b = cb.f82047l;
                                                    }
                                                    break;
                                                case 108532386:
                                                    if (C2419.m8175(name, C23916.m53420(f49592, 386, 11, i6))) {
                                                        b = 15;
                                                    }
                                                    break;
                                                case 109250890:
                                                    if (C3492.m11490(name, RunnableC0334.m2049(f49592, 397, 5, i6))) {
                                                        b = 16;
                                                    }
                                                    break;
                                                case 109399969:
                                                    if (C3492.m11490(name, C0619.m2756(f49592, 402, 5, i6))) {
                                                        b = 17;
                                                    }
                                                    break;
                                                case 1052832078:
                                                    if (C2419.m8175(name, C1343.m4939(f49592, 407, 9, i6))) {
                                                        b = 18;
                                                    }
                                                    break;
                                                case 1191572447:
                                                    if (C3492.m11490(name, AbstractC3624.m11769(f49592, 416, 8, i6))) {
                                                        b = 19;
                                                    }
                                                    break;
                                                case 1747193040:
                                                    if (C2419.m8175(name, C1146.m4222(f49592, 424, 23, i6))) {
                                                        b = 20;
                                                    }
                                                    break;
                                                case 1862666772:
                                                    if (C2419.m8175(name, strM11486)) {
                                                        b = 21;
                                                    }
                                                    break;
                                                case 2013827269:
                                                    if (C3492.m11490(name, AbstractC0116.m1236(f49592, Scalar448.TARGET_LENGTH, 15, i6))) {
                                                        b = 22;
                                                    }
                                                    break;
                                                case 2118620333:
                                                    if (C2419.m8175(name, C2354.m7980(f49592, 462, 15, i6))) {
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
                                                    i27++;
                                                    break;
                                                case 3:
                                                case 10:
                                                case 16:
                                                case 18:
                                                    i22++;
                                                    break;
                                                case 6:
                                                case 14:
                                                case 20:
                                                    i25++;
                                                    break;
                                                case 9:
                                                    i24++;
                                                    break;
                                                case 13:
                                                    i19++;
                                                    break;
                                                case 15:
                                                    i31++;
                                                    break;
                                                case 19:
                                                    i14++;
                                                    i27++;
                                                    break;
                                                case 21:
                                                    i26++;
                                                    break;
                                                default:
                                                    String strM5463 = C1542.m5463(name);
                                                    if (C2834.m9345(strM5463, strM11996) || C2834.m9345(strM5463, C3077.m10047(f49592, 521, 4, i6)) || C2834.m9345(strM5463, C0269.m1785(f49592, 525, 6, i6))) {
                                                        i19++;
                                                    } else if (C3448.m11238(strM5463, strM47853)) {
                                                        i20++;
                                                    } else if (C3448.m11238(strM5463, strM5472)) {
                                                        i21++;
                                                    } else if (!C3448.m11238(strM5463, C3779.m12266(f49592, 531, 16, i6))) {
                                                        System.out.println(C1343.m4946(C2288.m7761(f49592, 547, 19, i6), name));
                                                    } else {
                                                        i25++;
                                                    }
                                                    break;
                                            }
                                        } else {
                                            String strM32975 = C13376.m32975(bArrM46522);
                                            if (strM32975 != null) {
                                                switch (C0619.m2761(strM32975)) {
                                                    case 1468055:
                                                        if (C2419.m8175(strM32975, C2287.m7749(f49592, 477, 4, i6))) {
                                                            b = 0;
                                                        }
                                                        break;
                                                    case 1472726:
                                                        if (C2419.m8175(strM32975, C2878.m9486(f49592, 481, 4, i6))) {
                                                            b = 1;
                                                        }
                                                        break;
                                                    case 1475827:
                                                        if (C3492.m11490(strM32975, C0487.m2361(f49592, 485, 4, i6))) {
                                                            b = 2;
                                                        }
                                                        break;
                                                    case 1480755:
                                                        if (C3492.m11490(strM32975, C3492.m11486(f49592, 489, 4, i6))) {
                                                            b = 3;
                                                        }
                                                        break;
                                                    case 1481531:
                                                        if (C3492.m11490(strM32975, C2023.m6966(f49592, 493, 4, i6))) {
                                                            b = 4;
                                                        }
                                                        break;
                                                    case 1485557:
                                                        if (C3492.m11490(strM32975, C2834.m9343(f49592, 497, 4, i6))) {
                                                            b = 5;
                                                        }
                                                        break;
                                                    case 1485560:
                                                        if (C2419.m8175(strM32975, C3779.m12266(f49592, 501, 4, i6))) {
                                                            b = 6;
                                                        }
                                                        break;
                                                    case 46127306:
                                                        if (C3492.m11490(strM32975, C0773.m3166(f49592, 505, 5, i6))) {
                                                            b = 7;
                                                        }
                                                        break;
                                                }
                                                switch (b) {
                                                    case 0:
                                                    case 1:
                                                    case 2:
                                                    case 7:
                                                        i27++;
                                                        break;
                                                    case 3:
                                                    case 5:
                                                    case 6:
                                                        i31++;
                                                        break;
                                                    case 4:
                                                        i28++;
                                                        i27++;
                                                        break;
                                                    default:
                                                        i23++;
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                    c22941 = c22941;
                                    i7 = i4;
                                    itM478511 = it;
                                    i8 = i5;
                                }
                                c22941 = c22941;
                                i17 = i27;
                                i18 = i28;
                                i16 = i29;
                                i15 = i30;
                                i13 = i31;
                                i12 = i32;
                                i11 = i33;
                                i10 = i34;
                            } else {
                                if (i > 0) {
                                    strM5471 = C1343.m4939(f49592, 196, 2, i6);
                                } else {
                                    i = 0;
                                    strM5471 = null;
                                }
                                if (i2 > i) {
                                    strM5471 = strM11252;
                                } else {
                                    i2 = i;
                                }
                                if (i7 > i2) {
                                    strM5471 = C3033.m9847(f49592, 198, 5, i6);
                                } else {
                                    i7 = i2;
                                }
                                if (i8 > i7) {
                                    strM5471 = C1146.m4222(f49592, 203, 7, i6);
                                } else {
                                    i8 = i7;
                                }
                                if (i9 > i8) {
                                    strM5471 = C1080.m4056(f49592, 210, 6, i6);
                                } else {
                                    i9 = i8;
                                }
                                int i37 = i34;
                                if (i37 > i9) {
                                    strM5471 = C3099.m10092(f49592, 216, 5, i6);
                                } else {
                                    i37 = i9;
                                }
                                if (i33 > i37) {
                                    strM5471 = C1542.m5471(f49592, 221, 4, i6);
                                    i37 = i33;
                                }
                                if (i32 > i37) {
                                    strM9847 = C3734.m12149(f49592, 228, 5, i6);
                                    i3 = i32;
                                } else {
                                    String str = strM5471;
                                    i3 = i37;
                                    strM9847 = str;
                                }
                                if (i31 > i3) {
                                    strM9847 = C2419.m8166(f49592, 233, 4, i6);
                                } else {
                                    i31 = i3;
                                }
                                if (i30 > i31) {
                                    strM9847 = C11235.m28300(f49592, 237, 8, i6);
                                    i31 = i30;
                                }
                                if (i29 > i31) {
                                    strM9847 = C2354.m7980(f49592, 245, 7, i6);
                                    i31 = i29;
                                }
                                if (i28 > i31) {
                                    strM9847 = AbstractC3624.m11769(f49592, 252, 6, i6);
                                    i31 = i28;
                                }
                                if (i27 > i31) {
                                    strM9847 = C3033.m9847(f49592, 258, 8, i6);
                                    i31 = i27;
                                }
                                int i38 = i14;
                                if (i38 > i31) {
                                    i31 = i38;
                                } else {
                                    strM12266 = strM9847;
                                }
                                int i39 = i19;
                                if (i39 > i31) {
                                    i31 = i39;
                                } else {
                                    strM11996 = strM12266;
                                }
                                int i40 = i20;
                                if (i40 > i31) {
                                    i31 = i40;
                                } else {
                                    strM47853 = strM11996;
                                }
                                int i41 = i21;
                                if (i41 > i31) {
                                    i31 = i41;
                                } else {
                                    strM5472 = strM47853;
                                }
                                int i42 = i22;
                                if (i42 > i31) {
                                    strM5472 = C17202.m40377(f49592, 266, 4, i6);
                                    i31 = i42;
                                }
                                int i43 = i23;
                                if (i43 > i31) {
                                    strM5472 = C0269.m1785(f49592, BottomAppBarTopEdgeTreatment.ANGLE_UP, 3, i6);
                                    i31 = i43;
                                }
                                int i44 = i24;
                                if (i44 > i31) {
                                    i31 = i44;
                                } else {
                                    strM7980 = strM5472;
                                }
                                int i45 = i25;
                                if (i45 > i31) {
                                    strM7980 = C1321.m4861(f49592, 273, 3, i6);
                                    i31 = i45;
                                }
                                if (i26 <= i31) {
                                    strM11486 = strM7980;
                                }
                                strM11252 = strM11486 != null ? strM11486 : String.format(AbstractC3624.m11769(f49592, 513, 8, i6), C0619.m2764(c23747.mo35833()));
                                c23747 = c23747;
                            }
                        }
                    }
                    c23747.m53022(strM11252);
                }
                itM2357 = itM2357;
                c22941 = c22941;
                itM47859 = itM47859;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m36541(String str, boolean z) {
        int iM10045 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        char cM13656 = 0;
        int i3 = -451894346;
        int i4 = C2966.f9654;
        int i5 = C3779.f12953;
        int iM3169 = C0773.m3169("᩵ᩴ") ^ i4;
        int i6 = ((iM3169 ^ i5) * (-22441)) ^ 250920750;
        int i7 = 734196131;
        while (true) {
            i3 = ((((i3 ^ i5) * (-17079)) >> 31) & i6) ^ (iM3169 ^ i7);
            switch (i3) {
                case -2144714383:
                case -1170727306:
                    if (C3998.m12920()) {
                        iM3169 = (i4 - C0773.m3169("ۗۙ")) * 11;
                        i6 = ((iM3169 ^ i5) * 6345) ^ (-1194229002);
                        i7 = 106935516;
                    } else {
                        iM3169 = (C0773.m3169("ۗܰ") + i5) * 63;
                        i6 = ((iM3169 ^ i4) * (-2715)) ^ 148649108;
                        i7 = 1879777679;
                    }
                    break;
                case -2102829087:
                case -56798809:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0773.m3169("ܳۗ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 7075) ^ (-42299743);
                        i7 = -118379395;
                    } else {
                        iM3169 = (i5 - C0773.m3169("ܽ᩶")) * (-113);
                        i6 = ((iM3169 ^ i4) * (-20929)) ^ 1936832310;
                        i7 = -1549321047;
                    }
                    break;
                case -2034419805:
                case 1887507809:
                    if (cM13656 == '$') {
                        iM3169 = (C0773.m3169("᩻ۚ") ^ i4) * (-93);
                        i6 = ((iM3169 ^ i5) * 19173) ^ 615457329;
                        i7 = 622129755;
                    } else {
                        iM3169 = (C0619.m2761("֨ᩴ") ^ i4) * (-53);
                        i6 = ((iM3169 ^ i5) * 29975) ^ 927801198;
                        i7 = -1718464894;
                    }
                    break;
                case -1907676546:
                case 172025218:
                    if (C2702.m8876()) {
                        iM3169 = C0619.m2761("᩺ۛ") ^ i4;
                        i6 = ((iM3169 ^ i5) * 28557) ^ 1703088627;
                        i7 = 1783639886;
                    } else {
                        iM3169 = C0773.m3169("ۗۧ") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-31983)) ^ (-1509975821);
                        i7 = -2085176629;
                    }
                    break;
                case -1902635500:
                case -916226385:
                    i2++;
                    iM3169 = C0619.m2761("ܰۧ") ^ i4;
                    i6 = ((iM3169 ^ i5) * (-14947)) ^ (-158718928);
                    i7 = -778164538;
                    break;
                case -1786582788:
                case 946841803:
                    if (!C2023.f6737) {
                        iM3169 = C0773.m3169("ܳۗ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 7075) ^ (-42299743);
                        i7 = -118379395;
                    } else {
                        iM3169 = C0773.m3169("ܰۙ") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-23787)) ^ (-432896310);
                        i7 = 1635938765;
                    }
                    break;
                case -1769612777:
                case -250938270:
                    if ('A' <= cM13656) {
                        iM3169 = (C0773.m3169("ܰܺ") ^ i5) * 41;
                        i6 = ((iM3169 ^ i4) * (-585)) ^ (-832057211);
                        i7 = 1879172134;
                    } else {
                        iM3169 = C0619.m2761("۬ᩴ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 14519) ^ 1721860781;
                        i7 = 583052546;
                    }
                    break;
                case -1616080976:
                case -132556161:
                    return z3;
                case -1542320748:
                case 1000525011:
                    if (cM13656 <= 'z') {
                        iM3169 = (C0773.m3169("᩻ۚ") ^ i4) * (-93);
                        i6 = ((iM3169 ^ i5) * 19173) ^ 615457329;
                        i7 = 622129755;
                    } else {
                        iM3169 = C0619.m2761("ۢܺ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 24245) ^ 717731172;
                        i7 = -1088593991;
                    }
                    break;
                case -1499931432:
                case -169034087:
                    i = 100;
                    iM3169 = C0619.m2761("ܳ۫") ^ i5;
                    i6 = ((iM3169 ^ i4) * 1779) ^ (-730751014);
                    i7 = 301698528;
                    break;
                case -1302980643:
                case 1716620524:
                    i2 = 0;
                    iM3169 = C0619.m2761("ܰۧ") ^ i4;
                    i6 = ((iM3169 ^ i5) * (-14947)) ^ (-158718928);
                    i7 = -778164538;
                    break;
                case -1264899256:
                case 1264242919:
                    if (C2354.f7599 >= 0) {
                        iM3169 = C0773.m3169("ܰۙ") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-23787)) ^ (-432896310);
                        i7 = 1635938765;
                    } else {
                        iM3169 = (C0773.m3169("֨֡") + i5) * (-97);
                        i6 = ((iM3169 ^ i4) * 22443) ^ (-451012975);
                        i7 = 91097338;
                    }
                    break;
                case -1226933505:
                case 149280727:
                    if (C1826.f6190 <= 0) {
                        iM3169 = (C0619.m2761("֨۫") + i4) * (-45);
                        i6 = ((iM3169 ^ i5) * 32427) ^ 785751713;
                        i7 = 1332142048;
                    } else {
                        iM3169 = C0773.m3169("ۘۢ") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-27603)) ^ (-1385210669);
                        i7 = 1420540867;
                    }
                    break;
                case -1054379958:
                case 190317884:
                    if ('0' <= cM13656) {
                        iM3169 = C0773.m3169("ۚۘ") ^ i4;
                        i6 = ((iM3169 ^ i5) * 16777) ^ (-949940173);
                        i7 = 1982180918;
                    } else {
                        iM3169 = (C0619.m2761("ۜۤ") ^ i5) * (-77);
                        i6 = ((iM3169 ^ i4) * (-6889)) ^ (-1744986930);
                        i7 = -2002776880;
                    }
                    break;
                case -1004009992:
                case 1283524274:
                    if (i2 < iM10045) {
                        iM3169 = C0619.m2761("֡᩷") ^ i4;
                        i6 = ((iM3169 ^ i5) * 16891) ^ 618654866;
                        i7 = -21987097;
                    } else {
                        iM3169 = (C0773.m3169("ܿ۫") + i5) * 77;
                        i6 = ((iM3169 ^ i4) * (-23515)) ^ (-369729326);
                        i7 = 481621482;
                    }
                    break;
                case -972315785:
                case -971878204:
                    if (C2878.f9462) {
                        iM3169 = C0773.m3169("ۧ᩷") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-19227)) ^ (-236276659);
                        i7 = 1815025123;
                    } else {
                        iM3169 = (C0619.m2761("ۖۙ") + i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((iM3169 ^ i4) * 25381) ^ 1506897531;
                        i7 = 910452355;
                    }
                    break;
                case -910908150:
                case -843847158:
                    if (C3690.m11987()) {
                        iM3169 = C0773.m3169("ܳۗ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 7075) ^ (-42299743);
                        i7 = -118379395;
                    } else {
                        iM3169 = (i5 - C0619.m2761("᩹ۘ")) * 99;
                        i6 = ((iM3169 ^ i4) * (-23783)) ^ 28471088;
                        i7 = 1903312813;
                    }
                    break;
                case -781642929:
                case 271134621:
                    C2834.m9344();
                    if (C2878.m9491() <= 0) {
                        iM3169 = C0773.m3169("ۗۧ") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-31983)) ^ (-1509975821);
                        i7 = -2085176629;
                    } else {
                        iM3169 = (i5 - C0773.m3169("ܽ᩶")) * (-113);
                        i6 = ((iM3169 ^ i4) * (-20929)) ^ 1936832310;
                        i7 = -1549321047;
                    }
                    break;
                case -744151877:
                case 1316540952:
                    if (iM10045 > i) {
                        iM3169 = (C0773.m3169("ۢ۬") + i4) * (-99);
                        i6 = ((iM3169 ^ i5) * (-32317)) ^ 1493720637;
                        i7 = 1472967887;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۗ۫")) * (-51);
                        i6 = ((iM3169 ^ i5) * 16321) ^ 1274265476;
                        i7 = 8466206;
                    }
                    break;
                case -646495046:
                case 741854678:
                    if (cM13656 <= 'Z') {
                        iM3169 = (C0773.m3169("᩻ۚ") ^ i4) * (-93);
                        i6 = ((iM3169 ^ i5) * 19173) ^ 615457329;
                        i7 = 622129755;
                    } else {
                        iM3169 = C0619.m2761("۬ᩴ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 14519) ^ 1721860781;
                        i7 = 583052546;
                    }
                    break;
                case -641444261:
                case -348475189:
                    if (cM13656 > '9') {
                        iM3169 = (C0619.m2761("ۜۤ") ^ i5) * (-77);
                        i6 = ((iM3169 ^ i4) * (-6889)) ^ (-1744986930);
                        i7 = -2002776880;
                    } else {
                        iM3169 = (C0773.m3169("᩻ۚ") ^ i4) * (-93);
                        i6 = ((iM3169 ^ i5) * 19173) ^ 615457329;
                        i7 = 622129755;
                    }
                    break;
                case -520040857:
                case -339029508:
                    if (z) {
                        iM3169 = C0773.m3169("ᩴ᩹") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-21643)) ^ 1630130265;
                        i7 = -1530894011;
                    } else {
                        iM3169 = (C0773.m3169("ۢ۬") + i4) * (-99);
                        i6 = ((iM3169 ^ i5) * (-32317)) ^ 1493720637;
                        i7 = 1472967887;
                    }
                    break;
                case -458698334:
                case 445688942:
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0773.m3169("ܰۙ") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-23787)) ^ (-432896310);
                        i7 = 1635938765;
                    } else {
                        iM3169 = C0619.m2761("ۗۨ") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-27783)) ^ 1059826712;
                        i7 = 324285772;
                    }
                    break;
                case -451455036:
                case 1269888935:
                    if (C1343.m4943()) {
                        iM3169 = (C0619.m2761("᩻ۡ") ^ i4) * 29;
                        i6 = ((iM3169 ^ i5) * (-14523)) ^ (-552872339);
                        i7 = 421141234;
                    } else {
                        iM3169 = (C0773.m3169("ۗܰ") + i5) * 63;
                        i6 = ((iM3169 ^ i4) * (-2715)) ^ 148649108;
                        i7 = 1879777679;
                    }
                    break;
                case -248504240:
                case 1211499236:
                    C3734.m12152();
                    if (C2288.f7433 > 0) {
                        iM3169 = (C0773.m3169("ۗܰ") + i5) * 63;
                        i6 = ((iM3169 ^ i4) * (-2715)) ^ 148649108;
                        i7 = 1879777679;
                    } else {
                        iM3169 = (C0619.m2761("۟۠") ^ i5) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i6 = ((iM3169 ^ i4) * (-17487)) ^ 213488458;
                        i7 = 1109479363;
                    }
                    break;
                case -194732612:
                case 126379098:
                    C23916.m53419();
                    RunnableC1848.m6360();
                    return false;
                case -176119798:
                case 400683771:
                    if (cM13656 != '_') {
                        iM3169 = C0773.m3169("ۛܿ") ^ i5;
                        i6 = ((iM3169 ^ i4) * (-24015)) ^ 402423971;
                        i7 = 1494849427;
                    } else {
                        iM3169 = (C0773.m3169("᩻ۚ") ^ i4) * (-93);
                        i6 = ((iM3169 ^ i5) * 19173) ^ 615457329;
                        i7 = 622129755;
                    }
                    break;
                case -145960660:
                case 1666340251:
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0619.m2761("֨۫") + i4) * (-45);
                        i6 = ((iM3169 ^ i5) * 32427) ^ 785751713;
                        i7 = 1332142048;
                    } else {
                        iM3169 = (i5 - C0619.m2761("ᩳܿ")) * 81;
                        i6 = ((iM3169 ^ i4) * 17241) ^ 1301172322;
                        i7 = -851847442;
                    }
                    break;
                case 31789815:
                case 1613045156:
                    i = 75;
                    iM3169 = C0619.m2761("ܳ۫") ^ i5;
                    i6 = ((iM3169 ^ i4) * 1779) ^ (-730751014);
                    i7 = 301698528;
                    break;
                case 177137614:
                case 1708671592:
                    if (C17202.f56030) {
                        iM3169 = C0619.m2761("۟۟") ^ i5;
                        i6 = ((iM3169 ^ i4) * 3589) ^ 314569893;
                        i7 = 856174264;
                    } else {
                        iM3169 = C0773.m3169("ܳۗ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 7075) ^ (-42299743);
                        i7 = -118379395;
                    }
                    break;
                case 287718378:
                case 547348510:
                    C20932.m47848();
                    if (C2287.f7432 < 0) {
                        iM3169 = C0619.m2761("ۖۨ") ^ i4;
                        i6 = ((iM3169 ^ i5) * 7685) ^ (-1625486484);
                        i7 = -700067850;
                    } else {
                        iM3169 = (i5 - C0773.m3169("ܽ᩶")) * (-113);
                        i6 = ((iM3169 ^ i4) * (-20929)) ^ 1936832310;
                        i7 = -1549321047;
                    }
                    break;
                case 443826353:
                case 1672449490:
                    cM13656 = C4282.m13656(str, i2);
                    if ('a' <= cM13656) {
                        iM3169 = C0773.m3169("᩶ܳ") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-22839)) ^ (-2030995313);
                        i7 = -1497484691;
                    } else {
                        iM3169 = C0619.m2761("ۢܺ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 24245) ^ 717731172;
                        i7 = -1088593991;
                    }
                    break;
                case 477719974:
                case 1806360630:
                    return z2;
                case 514434552:
                case 1419577438:
                    C23916.m53419();
                    C0950.m3785();
                    iM3169 = (i5 - C0773.m3169("ܽ᩶")) * (-113);
                    i6 = ((iM3169 ^ i4) * (-20929)) ^ 1936832310;
                    i7 = -1549321047;
                    break;
                case 654946256:
                case 1287177950:
                    if (AbstractC3624.f12429 > 0) {
                        iM3169 = (C0619.m2761("֨۫") + i4) * (-45);
                        i6 = ((iM3169 ^ i5) * 32427) ^ 785751713;
                        i7 = 1332142048;
                    } else {
                        iM3169 = C0619.m2761("ۖۨ") ^ i4;
                        i6 = ((iM3169 ^ i5) * 7685) ^ (-1625486484);
                        i7 = -700067850;
                    }
                    break;
                case 774696210:
                case 895549535:
                    C2419.m8174();
                    if (C0862.f3233 == 0) {
                        iM3169 = (C0619.m2761("۟۠") ^ i5) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i6 = ((iM3169 ^ i4) * (-17487)) ^ 213488458;
                        i7 = 1109479363;
                    } else {
                        iM3169 = C0773.m3169("ܰۙ") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-23787)) ^ (-432896310);
                        i7 = 1635938765;
                    }
                    break;
                case 946025166:
                case 1701417443:
                    z2 = false;
                    z3 = true;
                    if (iM10045 >= 1) {
                        iM3169 = C0619.m2761("ۡ᩶") ^ i5;
                        i6 = ((iM3169 ^ i4) * (-3653)) ^ 1928173923;
                        i7 = -96628168;
                    } else {
                        iM3169 = (C0773.m3169("ۢ۬") + i4) * (-99);
                        i6 = ((iM3169 ^ i5) * (-32317)) ^ 1493720637;
                        i7 = 1472967887;
                    }
                    break;
                case 965883810:
                case 1274458995:
                    iM10045 = C3077.m10045(str);
                    if (z) {
                        iM3169 = (C0773.m3169("ۚܺ") ^ i4) * 71;
                        i6 = ((iM3169 ^ i5) * 31095) ^ (-918645660);
                        i7 = 1716376556;
                    } else {
                        iM3169 = C0619.m2761("ܺܺ") ^ i5;
                        i6 = ((iM3169 ^ i4) * (-7103)) ^ 1696502694;
                        i7 = 1237165010;
                    }
                    break;
                case 970777091:
                case 1042403178:
                    if (cM13656 != '.') {
                        iM3169 = (C0773.m3169("ۢ۬") + i4) * (-99);
                        i6 = ((iM3169 ^ i5) * (-32317)) ^ 1493720637;
                        i7 = 1472967887;
                    } else {
                        iM3169 = (C0773.m3169("᩻ۚ") ^ i4) * (-93);
                        i6 = ((iM3169 ^ i5) * 19173) ^ 615457329;
                        i7 = 622129755;
                    }
                    break;
                default:
                    if (C2834.f9334 <= 0) {
                        iM3169 = (C0619.m2761("۟۠") ^ i5) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i6 = ((iM3169 ^ i4) * (-17487)) ^ 213488458;
                        i7 = 1109479363;
                    } else {
                        iM3169 = C0773.m3169("ۗۜ") ^ i5;
                        i6 = ((iM3169 ^ i4) * (-28967)) ^ (-211477353);
                        i7 = -1447902558;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0541 A[PHI: r9 r13 r14 r42
      0x0541: PHI (r9v5 l.ۗᩴۤ) = (r9v4 l.ۗᩴۤ), (r9v2 l.ۗᩴۤ), (r9v2 l.ۗᩴۤ) binds: [B:120:0x0527, B:117:0x04fe, B:89:0x036d] A[DONT_GENERATE, DONT_INLINE]
      0x0541: PHI (r13v4 java.lang.String) = (r13v2 java.lang.String), (r13v3 java.lang.String), (r13v2 java.lang.String) binds: [B:120:0x0527, B:117:0x04fe, B:89:0x036d] A[DONT_GENERATE, DONT_INLINE]
      0x0541: PHI (r14v69 java.lang.String) = (r14v47 java.lang.String), (r14v48 java.lang.String), (r14v70 java.lang.String) binds: [B:120:0x0527, B:117:0x04fe, B:89:0x036d] A[DONT_GENERATE, DONT_INLINE]
      0x0541: PHI (r42v56 java.lang.String) = (r42v44 java.lang.String), (r42v45 java.lang.String), (r42v57 java.lang.String) binds: [B:120:0x0527, B:117:0x04fe, B:89:0x036d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:210:0x0a4a A[PHI: r0 r3 r4 r6 r14 r29 r32 r40 r42
      0x0a4a: PHI (r0v117 short) = (r0v71 short), (r0v78 short), (r0v118 short) binds: [B:209:0x0a48, B:196:0x0993, B:24:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x0a4a: PHI (r3v147 short[]) = (r3v34 short[]), (r3v37 short[]), (r3v148 short[]) binds: [B:209:0x0a48, B:196:0x0993, B:24:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x0a4a: PHI (r4v5 int) = (r4v2 int), (r4v2 int), (r4v6 int) binds: [B:209:0x0a48, B:196:0x0993, B:24:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x0a4a: PHI (r6v4 l.ᩳ᩶᩹) = (r6v2 l.ᩳ᩶᩹), (r6v2 l.ᩳ᩶᩹), (r6v5 l.ᩳ᩶᩹) binds: [B:209:0x0a48, B:196:0x0993, B:24:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x0a4a: PHI (r14v115 java.lang.String) = (r14v27 java.lang.String), (r14v30 java.lang.String), (r14v116 java.lang.String) binds: [B:209:0x0a48, B:196:0x0993, B:24:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x0a4a: PHI (r29v25 java.lang.String) = (r29v13 java.lang.String), (r29v16 java.lang.String), (r29v26 java.lang.String) binds: [B:209:0x0a48, B:196:0x0993, B:24:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x0a4a: PHI (r32v48 int) = (r32v31 int), (r32v34 int), (r32v49 int) binds: [B:209:0x0a48, B:196:0x0993, B:24:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x0a4a: PHI (r40v3 int) = (r40v1 int), (r40v2 int), (r40v1 int) binds: [B:209:0x0a48, B:196:0x0993, B:24:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x0a4a: PHI (r42v82 java.lang.String) = (r42v24 java.lang.String), (r42v27 java.lang.String), (r42v83 java.lang.String) binds: [B:209:0x0a48, B:196:0x0993, B:24:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x031d A[PHI: r11 r33 r42
      0x031d: PHI (r11v4 int) = (r11v3 int), (r11v2 int) binds: [B:82:0x031b, B:75:0x02d3] A[DONT_GENERATE, DONT_INLINE]
      0x031d: PHI (r33v3 java.lang.String) = (r33v2 java.lang.String), (r33v1 java.lang.String) binds: [B:82:0x031b, B:75:0x02d3] A[DONT_GENERATE, DONT_INLINE]
      0x031d: PHI (r42v61 java.lang.String) = (r42v59 java.lang.String), (r42v62 java.lang.String) binds: [B:82:0x031b, B:75:0x02d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x039c A[PHI: r42
      0x039c: PHI (r42v95 java.lang.String) = 
      (r42v58 java.lang.String)
      (r42v63 java.lang.String)
      (r42v67 java.lang.String)
      (r42v70 java.lang.String)
      (r42v96 java.lang.String)
     binds: [B:87:0x0353, B:72:0x02b1, B:219:0x039c, B:62:0x0235, B:51:0x01fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36540(C23001 c23001, C22941 c22941, HashMap map, HashMap map2, C21905 c21905, boolean z) {
        String str;
        int i;
        int iM2761;
        int i2;
        String str2;
        int i3;
        short[] sArr;
        Object[] objArr;
        int i4;
        short[] sArr2;
        int iM2762;
        int i5;
        int iM3169;
        int i6;
        String str3;
        short s;
        short[] sArr3;
        int iM31610;
        int i7;
        int iM2763;
        int i8;
        int i9;
        int iM31611;
        int i10;
        int iM31612;
        int i11;
        int iM31613;
        int i12;
        int i13;
        int iM31614;
        int i14;
        int i15;
        map = map;
        map2 = map2;
        C23747 c23747 = null;
        Iterator itM2357 = null;
        int i16 = 0;
        C13304 c13304 = null;
        Iterator itM2358 = null;
        int i17 = 0;
        int iMo27607 = 0;
        int i18 = 0;
        int iMo35833 = 0;
        int i19 = 0;
        String str4 = null;
        long jM7977 = 0;
        byte[] bArrM46522 = null;
        int i20 = 0;
        int i21 = 1116928697;
        int i22 = C0487.f2131;
        int i23 = C0773.f2792;
        int iM2764 = (i23 - C0619.m2761("᩹ᩴ")) * (-21);
        int i24 = ((iM2764 ^ i22) * (-12723)) ^ (-1334027839);
        int i25 = iM2764 ^ (-1098966318);
        String strM2058 = null;
        String strM1236 = null;
        String str5 = null;
        C3609 c3609 = null;
        String value = null;
        StringBuilder sb = null;
        C19327 c19327 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int iMo23383 = 0;
        int iLastIndexOf = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        boolean z2 = false;
        char c = 0;
        int i29 = 0;
        Iterator itM47859 = null;
        short s2 = 0;
        C25239 c25239 = null;
        String strM32975 = null;
        Object[] objArr2 = null;
        String str6 = null;
        Iterator itM478510 = null;
        C8002 c8002 = null;
        Iterator itM2359 = null;
        String strM9931 = null;
        while (true) {
            i21 = i25 ^ (i24 & (((i21 ^ i22) * 9553) >> 31));
            switch (i21) {
                case -2122633224:
                case 1066800511:
                    strM32975 = strM32975;
                    str = strM2058;
                    strM1236 = strM1236;
                    sArr2 = sArr5;
                    if (C1826.m6317(itM478510)) {
                        iM2762 = (C0619.m2761("ۢ᩻") + i23) * (-89);
                        i4 = ((iM2762 ^ i22) * 22953) ^ (-2123915067);
                        i5 = 226854682;
                    } else {
                        iM2762 = C0619.m2761("֫ۤ") ^ i22;
                        i4 = ((iM2762 ^ i23) * 22613) ^ (-1578519207);
                        i5 = 231798500;
                    }
                    i25 = iM2762 ^ i5;
                    strM2058 = str;
                    sArr5 = sArr2;
                    strM1236 = strM1236;
                    strM32975 = strM32975;
                    i24 = i4;
                    map2 = map2;
                    break;
                case -2058817472:
                case -200227715:
                    strM32975 = strM32975;
                    iMo23383 = c13304.mo23383() | i18 | (iMo35833 << i19);
                    c19327 = c21905.f70753;
                    if (C2354.f7599 < 0) {
                        int iM2765 = (i22 - C0619.m2761("᩷᩷")) * (-77);
                        i24 = ((iM2765 ^ i23) * (-9685)) ^ 1042148530;
                        i25 = iM2765 ^ (-306137520);
                        strM32975 = strM32975;
                    } else {
                        str3 = strM1236;
                        s = s2;
                        sArr3 = sArr5;
                        String str7 = strM2058;
                        i29 = i29;
                        str2 = str7;
                        iM31610 = C0619.m2761("ܽۛ") ^ i23;
                        i24 = ((iM31610 ^ i22) * (-24397)) ^ (-1557757134);
                        i7 = -38830644;
                        i25 = iM31610 ^ i7;
                        s2 = s;
                        sArr5 = sArr3;
                        strM1236 = str3;
                        strM32975 = strM32975;
                        int i30 = i29;
                        strM2058 = str2;
                        i29 = i30;
                    }
                    break;
                case -2043944636:
                case -582626829:
                    strM32975 = strM32975;
                    str3 = strM1236;
                    s = s2;
                    sArr3 = sArr5;
                    String str8 = strM2058;
                    i29 = i29;
                    str2 = str8;
                    int i31 = (s * s) + 11316496;
                    i20 = i31 + i31;
                    if (C3448.f11240 >= 0) {
                        iM31610 = C0619.m2761("ܽۛ") ^ i23;
                        i24 = ((iM31610 ^ i22) * (-24397)) ^ (-1557757134);
                        i7 = -38830644;
                    } else {
                        iM31610 = (i23 - C0773.m3169("۫۟")) * (-93);
                        i24 = ((iM31610 ^ i22) * (-13181)) ^ 796505370;
                        i7 = -1260318048;
                    }
                    i25 = iM31610 ^ i7;
                    s2 = s;
                    sArr5 = sArr3;
                    strM1236 = str3;
                    strM32975 = strM32975;
                    int i32 = i29;
                    strM2058 = str2;
                    i29 = i32;
                    break;
                case -2028801030:
                case 285755697:
                    strM32975 = strM32975;
                    try {
                        bArrM46522 = C20244.m46522(C2310.m7804(c22941, c8002), 0);
                        iM31612 = C0773.m3169("ۡܶ") ^ i22;
                        i10 = ((iM31612 ^ i23) * 31893) ^ (-1780150504);
                        i11 = 435271502;
                    } catch (Throwable unused) {
                        iM31612 = C0619.m2761("᩺ۖ") ^ i22;
                        i10 = ((iM31612 ^ i23) * (-9077)) ^ 1717835524;
                        i11 = 2114053679;
                    }
                    i25 = iM31612 ^ i11;
                    i24 = i10;
                    strM32975 = strM32975;
                    break;
                case -2016972423:
                case 1149964833:
                    C13304 c13305 = (C13304) C0950.m3796(itM2357);
                    c13304 = c13305;
                    itM2358 = C0487.m2357(c13305.values());
                    i17 = i16;
                    iM2761 = (i23 - C0619.m2761("ܺ۬")) * (-103);
                    i = ((iM2761 ^ i22) * 1901) ^ 284128969;
                    i2 = -97138162;
                    i25 = iM2761 ^ i2;
                    i24 = i;
                    strM1236 = strM1236;
                    strM32975 = strM32975;
                    break;
                case -1914023340:
                case -670965937:
                    strM32975 = strM32975;
                    c3609.m11707(str6, null);
                    strM1236 = strM1236;
                    iM2761 = (C0619.m2761("᩶۫") ^ i23) * (-113);
                    i = ((iM2761 ^ i22) * 10951) ^ 1132349700;
                    i2 = -1262188885;
                    i25 = iM2761 ^ i2;
                    i24 = i;
                    strM1236 = strM1236;
                    strM32975 = strM32975;
                    break;
                case -1892556197:
                case 2036968084:
                    if (C1783.f6087 > 0) {
                        strM32975 = strM32975;
                        i3 = i29;
                        str2 = strM2058;
                        strM1236 = strM1236;
                        sArr5 = sArr5;
                        iM3169 = C0619.m2761("ۜᩳ") ^ i22;
                        i24 = ((iM3169 ^ i23) * (-459)) ^ (-899678886);
                        i6 = 2031357854;
                        i25 = iM3169 ^ i6;
                        map = map;
                        sArr5 = sArr5;
                        strM1236 = strM1236;
                        strM2058 = str2;
                        strM32975 = strM32975;
                        i29 = i3;
                        map2 = map2;
                    } else {
                        iM31614 = C0773.m3169("ۤۨ") ^ i22;
                        i14 = ((iM31614 ^ i23) * (-29327)) ^ (-2064033578);
                        i15 = 502060249;
                        i25 = iM31614 ^ i15;
                        i24 = i14;
                    }
                    break;
                case -1891257559:
                case 1135155135:
                    strM32975 = strM32975;
                    strM1236 = strM1236;
                    if (C17202.m40370(map2, value)) {
                        iM2761 = (i23 - C0619.m2761("ۤܰ")) * 39;
                        i = ((iM2761 ^ i22) * (-31371)) ^ (-519369806);
                        i2 = 600334329;
                    } else {
                        iM2761 = C0619.m2761("᩵ۙ") ^ i22;
                        i = ((iM2761 ^ i23) * (-30105)) ^ 955574804;
                        i2 = 1857112542;
                    }
                    i25 = iM2761 ^ i2;
                    i24 = i;
                    strM1236 = strM1236;
                    strM32975 = strM32975;
                    break;
                case -1796802444:
                case 446760805:
                    str2 = strM2058;
                    i3 = i27;
                    z2 = false;
                    iM3169 = C0773.m3169("ܳᩳ") ^ i22;
                    i24 = ((iM3169 ^ i23) * (-8645)) ^ 1369644069;
                    i6 = -78672406;
                    i25 = iM3169 ^ i6;
                    map = map;
                    sArr5 = sArr5;
                    strM1236 = strM1236;
                    strM2058 = str2;
                    strM32975 = strM32975;
                    i29 = i3;
                    map2 = map2;
                    break;
                case -1778916532:
                case 154382436:
                    C1080.m4050();
                    if (C23916.f77426 > 0) {
                        iM31614 = C0773.m3169("ۤۨ") ^ i22;
                        i14 = ((iM31614 ^ i23) * (-29327)) ^ (-2064033578);
                        i15 = 502060249;
                        i25 = iM31614 ^ i15;
                        i24 = i14;
                    } else {
                        strM32975 = strM32975;
                        strM1236 = strM1236;
                        iM2761 = (C0773.m3169("۬֫") + i23) * (-107);
                        i = ((iM2761 ^ i22) * (-25245)) ^ (-999736096);
                        i2 = 688855760;
                        i25 = iM2761 ^ i2;
                        i24 = i;
                        strM1236 = strM1236;
                        strM32975 = strM32975;
                    }
                    break;
                case -1775721488:
                case -58328309:
                    if (C4282.f15546 <= 0) {
                        strM32975 = strM32975;
                        str3 = strM1236;
                        s = s2;
                        sArr3 = sArr5;
                        String str9 = strM2058;
                        i29 = i29;
                        str2 = str9;
                        iM31610 = C0619.m2761("ܽۛ") ^ i23;
                        i24 = ((iM31610 ^ i22) * (-24397)) ^ (-1557757134);
                        i7 = -38830644;
                        i25 = iM31610 ^ i7;
                        s2 = s;
                        sArr5 = sArr3;
                        strM1236 = str3;
                        strM32975 = strM32975;
                        int i33 = i29;
                        strM2058 = str2;
                        i29 = i33;
                    } else {
                        iM31614 = C0773.m3169("۬۬") ^ i23;
                        i14 = ((iM31614 ^ i22) * 10291) ^ 1457906923;
                        i15 = 2074940749;
                        i25 = iM31614 ^ i15;
                        i24 = i14;
                    }
                    break;
                case -1741951955:
                case -303768287:
                    strM32975 = strM32975;
                    C8002 c8003 = (C8002) C2310.m7814(map, value);
                    int iM31615 = C0773.m3169("ۨ᩸") ^ i23;
                    i10 = ((iM31615 ^ i22) * 31607) ^ 384337984;
                    i25 = iM31615 ^ (-1410055694);
                    c8002 = c8003;
                    i24 = i10;
                    strM32975 = strM32975;
                    break;
                case -1679790831:
                case 943845431:
                    try {
                        strM32975 = C13376.m32975(bArrM46522);
                        iM31614 = (C0773.m3169("ۧ֨") + i22) * (-75);
                        i14 = ((iM31614 ^ i23) * (-24827)) ^ (-1316799346);
                        i15 = 1086485555;
                        i25 = iM31614 ^ i15;
                        i24 = i14;
                    } catch (Throwable unused2) {
                        strM32975 = strM32975;
                        iM31612 = C0619.m2761("᩺ۖ") ^ i22;
                        i10 = ((iM31612 ^ i23) * (-9077)) ^ 1717835524;
                        i11 = 2114053679;
                        i25 = iM31612 ^ i11;
                        i24 = i10;
                        strM32975 = strM32975;
                    }
                    break;
                case -1623278443:
                case 1852155793:
                    if (C4238.f15451 >= 0) {
                        strM32975 = strM32975;
                        str3 = strM1236;
                        s = s2;
                        sArr3 = sArr5;
                        String str10 = strM2058;
                        i29 = i29;
                        str2 = str10;
                        iM31610 = (C0773.m3169("ۨۧ") + i23) * (-97);
                        i24 = ((iM31610 ^ i22) * 13687) ^ (-145455286);
                        i7 = -1758308251;
                        i25 = iM31610 ^ i7;
                        s2 = s;
                        sArr5 = sArr3;
                        strM1236 = str3;
                        strM32975 = strM32975;
                        int i34 = i29;
                        strM2058 = str2;
                        i29 = i34;
                    } else {
                        strM32975 = strM32975;
                        strM1236 = strM1236;
                        iM2761 = (C0773.m3169("۬֫") + i23) * (-107);
                        i = ((iM2761 ^ i22) * (-25245)) ^ (-999736096);
                        i2 = 688855760;
                        i25 = iM2761 ^ i2;
                        i24 = i;
                        strM1236 = strM1236;
                        strM32975 = strM32975;
                    }
                    break;
                case -1574266245:
                case 1124523842:
                    strM32975 = strM32975;
                    jM7977 = C2354.m7977(c8002);
                    iM31612 = (i23 - C0619.m2761("ۙ᩵")) * (-51);
                    i10 = ((iM31612 ^ i22) * 30235) ^ (-2113618298);
                    i11 = -865851840;
                    i25 = iM31612 ^ i11;
                    i24 = i10;
                    strM32975 = strM32975;
                    break;
                case -1562482867:
                case -997463081:
                    strM32975 = strM32975;
                    strM1236 = strM1236;
                    C20017 c20017 = (C20017) C4238.m13529(itM2359);
                    String strMo9077 = c20017.mo9077();
                    itM2357 = C0487.m2357(c20017.mo9078());
                    str5 = strMo9077;
                    i16 = i28;
                    iM2761 = (C0773.m3169("ᩴ֨") ^ i22) * (-127);
                    i = ((iM2761 ^ i23) * 8207) ^ 594358099;
                    i2 = -2063304661;
                    i25 = iM2761 ^ i2;
                    i24 = i;
                    strM1236 = strM1236;
                    strM32975 = strM32975;
                    break;
                case -1478619520:
                case -1058735006:
                    strM32975 = strM32975;
                    strM1236 = strM1236;
                    c3609 = (C3609) C0950.m3796(itM2358);
                    if (c3609.mo16636()) {
                        iM2761 = (i22 - C0619.m2761("᩵ۤ")) * 91;
                        i = ((iM2761 ^ i23) * (-22301)) ^ 81182189;
                        i2 = 272875798;
                    } else {
                        iM2761 = (C0619.m2761("᩶۫") ^ i23) * (-113);
                        i = ((iM2761 ^ i22) * 10951) ^ 1132349700;
                        i2 = -1262188885;
                    }
                    i25 = iM2761 ^ i2;
                    i24 = i;
                    strM1236 = strM1236;
                    strM32975 = strM32975;
                    break;
                case -1419327092:
                case -1046671942:
                    if (!z) {
                        strM32975 = strM32975;
                        iM31612 = C0619.m2761("᩺ۖ") ^ i22;
                        i10 = ((iM31612 ^ i23) * (-9077)) ^ 1717835524;
                        i11 = 2114053679;
                        i25 = iM31612 ^ i11;
                        i24 = i10;
                        strM32975 = strM32975;
                    } else {
                        iM31614 = (C0773.m3169("۠֡") ^ i23) * (-127);
                        i14 = ((iM31614 ^ i22) * 13713) ^ (-1459210922);
                        i15 = 453811807;
                        i25 = iM31614 ^ i15;
                        i24 = i14;
                    }
                    break;
                case -1334693985:
                case -617131897:
                    strM32975 = strM32975;
                    strM1236 = strM1236;
                    if (C1826.m6317(itM2357)) {
                        iM2761 = (i23 - C0619.m2761("ܺۘ")) * 101;
                        i = ((iM2761 ^ i22) * 25373) ^ 440183787;
                        i2 = -1074924434;
                    } else {
                        i28 = i16;
                        iM2761 = (i23 - C0619.m2761("᩻ۡ")) * (-35);
                        i = ((iM2761 ^ i22) * 9981) ^ (-454949661);
                        i2 = -1966936203;
                    }
                    i25 = iM2761 ^ i2;
                    i24 = i;
                    strM1236 = strM1236;
                    strM32975 = strM32975;
                    break;
                case -1323302934:
                case -505231084:
                    strM32975 = strM32975;
                    str = strM2058;
                    strM1236 = strM1236;
                    sArr2 = sArr5;
                    itM478510 = C20932.m47859(c25239.mo19822());
                    i27 = i29;
                    iM2762 = C0773.m3169("ۛ᩵") ^ i22;
                    i4 = ((iM2762 ^ i23) * (-29837)) ^ (-1895921866);
                    i5 = -1777695206;
                    i25 = iM2762 ^ i5;
                    strM2058 = str;
                    sArr5 = sArr2;
                    strM1236 = strM1236;
                    strM32975 = strM32975;
                    i24 = i4;
                    map2 = map2;
                    break;
                case -1246335754:
                case 178081605:
                    C3492.m11488();
                    C1564.m5509();
                    strM32975 = strM32975;
                    strM1236 = strM1236;
                    iM2761 = (C0773.m3169("۬֫") + i23) * (-107);
                    i = ((iM2761 ^ i22) * (-25245)) ^ (-999736096);
                    i2 = 688855760;
                    i25 = iM2761 ^ i2;
                    i24 = i;
                    strM1236 = strM1236;
                    strM32975 = strM32975;
                    break;
                case -1062280726:
                case -44408318:
                    strM32975 = strM32975;
                    strM1236 = strM1236;
                    sArr5 = sArr5;
                    i3 = i29;
                    str2 = strM2058;
                    Object[] objArr3 = new Object[i3];
                    objArr3[c] = C0619.m2764(c25239.mo27607());
                    sArr4 = f49592;
                    if (C0487.f2131 > 0) {
                        int iM31616 = (C0773.m3169("۠ܶ") + i23) * 79;
                        i29 = i3;
                        i25 = iM31616 ^ 1230848754;
                        objArr2 = objArr3;
                        sArr5 = sArr5;
                        strM1236 = strM1236;
                        strM32975 = strM32975;
                        i24 = ((iM31616 ^ i22) * 2293) ^ 1730015062;
                        int i35 = i29;
                        strM2058 = str2;
                        i29 = i35;
                    } else {
                        objArr2 = objArr3;
                        iM3169 = C0619.m2761("ۜᩳ") ^ i22;
                        i24 = ((iM3169 ^ i23) * (-459)) ^ (-899678886);
                        i6 = 2031357854;
                        i25 = iM3169 ^ i6;
                        map = map;
                        sArr5 = sArr5;
                        strM1236 = strM1236;
                        strM2058 = str2;
                        strM32975 = strM32975;
                        i29 = i3;
                        map2 = map2;
                    }
                    break;
                case -1057356024:
                case 1047042520:
                    C1519.m5403();
                    C2419.m8174();
                    break;
                case -996126327:
                case -461561441:
                    strM32975 = strM32975;
                    strM1236 = strM1236;
                    sArr5 = sArr5;
                    String str11 = strM2058;
                    i29 = i29;
                    str2 = str11;
                    c25239 = (C25239) C0950.m3796(itM47859);
                    c = 0;
                    if (z2) {
                        iM2763 = C0773.m3169("ܰ᩹") ^ i22;
                        i24 = (-1443412054) ^ ((iM2763 ^ i23) * 17791);
                        i8 = -9385080;
                    } else {
                        iM2763 = C0773.m3169("᩸᩶") ^ i23;
                        i24 = (-1472507271) ^ ((iM2763 ^ i22) * 5919);
                        i8 = -1305225283;
                    }
                    i25 = iM2763 ^ i8;
                    sArr5 = sArr5;
                    strM1236 = strM1236;
                    strM32975 = strM32975;
                    int i36 = i29;
                    strM2058 = str2;
                    i29 = i36;
                    break;
                case -972043763:
                case 463969339:
                    strM32975 = strM32975;
                    str3 = strM1236;
                    s = s2;
                    sArr3 = sArr5;
                    String str12 = strM2058;
                    i29 = i29;
                    str2 = str12;
                    if (C1783.f6087 <= 0) {
                        iM31610 = C0619.m2761("᩻֡") ^ i22;
                        i24 = ((iM31610 ^ i23) * (-15233)) ^ 804772361;
                        i7 = 484543092;
                    } else {
                        iM31610 = C0773.m3169("᩶ۚ") ^ i23;
                        i24 = ((iM31610 ^ i22) * 30555) ^ (-1713204010);
                        i7 = 1526814451;
                    }
                    i25 = iM31610 ^ i7;
                    s2 = s;
                    sArr5 = sArr3;
                    strM1236 = str3;
                    strM32975 = strM32975;
                    int i37 = i29;
                    strM2058 = str2;
                    i29 = i37;
                    break;
                case -971092075:
                case -194707995:
                    strM32975 = strM32975;
                    strM9931 = RunnableC3055.m9931(value, iLastIndexOf);
                    iM31612 = (C0773.m3169("᩺ܶ") + i23) * 41;
                    i10 = ((iM31612 ^ i22) * (-1991)) ^ (-205586975);
                    i11 = -1351842757;
                    i25 = iM31612 ^ i11;
                    i24 = i10;
                    strM32975 = strM32975;
                    break;
                case -949240904:
                case -313352880:
                    str2 = strM2058;
                    i26 = 54410;
                    iM2763 = (i22 - C0619.m2761("ۤۖ")) * 43;
                    i24 = 1858529941 ^ ((iM2763 ^ i23) * (-20013));
                    i8 = 655255488;
                    i25 = iM2763 ^ i8;
                    sArr5 = sArr5;
                    strM1236 = strM1236;
                    strM32975 = strM32975;
                    int i38 = i29;
                    strM2058 = str2;
                    i29 = i38;
                    break;
                case -929639442:
                case 306118803:
                    strM32975 = strM32975;
                    strM1236 = strM1236;
                    itM2359 = C0487.m2357(c23747.mo33925());
                    i28 = i27;
                    iM2761 = (i23 - C0619.m2761("᩻ۡ")) * (-35);
                    i = ((iM2761 ^ i22) * 9981) ^ (-454949661);
                    i2 = -1966936203;
                    i25 = iM2761 ^ i2;
                    i24 = i;
                    strM1236 = strM1236;
                    strM32975 = strM32975;
                    break;
                case -923824606:
                case -731381914:
                    str2 = strM2058;
                    i3 = 1;
                    itM47859 = C20932.m47859(c23001.mo15672());
                    z2 = true;
                    iM3169 = C0773.m3169("ܳᩳ") ^ i22;
                    i24 = ((iM3169 ^ i23) * (-8645)) ^ 1369644069;
                    i6 = -78672406;
                    i25 = iM3169 ^ i6;
                    map = map;
                    sArr5 = sArr5;
                    strM1236 = strM1236;
                    strM2058 = str2;
                    strM32975 = strM32975;
                    i29 = i3;
                    map2 = map2;
                    break;
                case -885728981:
                case 609007934:
                    strM32975 = strM32975;
                    if (iLastIndexOf < value.lastIndexOf(47)) {
                        strM9931 = str4;
                        iM31612 = (C0773.m3169("᩺ܶ") + i23) * 41;
                        i10 = ((iM31612 ^ i22) * (-1991)) ^ (-205586975);
                        i11 = -1351842757;
                    } else {
                        iM31612 = (C0773.m3169("ۙᩴ") ^ i22) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i10 = ((iM31612 ^ i23) * 12151) ^ 1994255758;
                        i11 = 1778019902;
                    }
                    i25 = iM31612 ^ i11;
                    i24 = i10;
                    strM32975 = strM32975;
                    break;
                case -876132924:
                case 1154895099:
                    strM32975 = strM32975;
                    strM1236 = strM1236;
                    str = strM2058;
                    if (!C3492.m11490(str, C2288.m7761(f49592, 591, 7, i26))) {
                        int iM31617 = (C0773.m3169("ۘ֫") ^ i23) * 85;
                        i = ((iM31617 ^ i22) * (-4513)) ^ (-294545317);
                        i25 = iM31617 ^ 479501585;
                        map = map;
                        strM2058 = str;
                        i24 = i;
                        strM1236 = strM1236;
                        strM32975 = strM32975;
                    } else {
                        sArr2 = sArr5;
                        iM2762 = C0773.m3169("ۛ᩵") ^ i22;
                        i4 = ((iM2762 ^ i23) * (-29837)) ^ (-1895921866);
                        i5 = -1777695206;
                        i25 = iM2762 ^ i5;
                        strM2058 = str;
                        sArr5 = sArr2;
                        strM1236 = strM1236;
                        strM32975 = strM32975;
                        i24 = i4;
                        map2 = map2;
                    }
                    break;
                case -851837180:
                case -419847287:
                    strM32975 = strM32975;
                    if (jM7977 < 10485760) {
                        iM31612 = C0619.m2761("ۚ۟") ^ i22;
                        i10 = ((iM31612 ^ i23) * (-3263)) ^ 626132799;
                        i11 = -1872531545;
                    } else {
                        iM31612 = C0619.m2761("᩺ۖ") ^ i22;
                        i10 = ((iM31612 ^ i23) * (-9077)) ^ 1717835524;
                        i11 = 2114053679;
                    }
                    i25 = iM31612 ^ i11;
                    i24 = i10;
                    strM32975 = strM32975;
                    break;
                case -696224105:
                case -641873466:
                    str2 = strM2058;
                    i26 = 21323;
                    iM2763 = (i22 - C0619.m2761("ۤۖ")) * 43;
                    i24 = 1858529941 ^ ((iM2763 ^ i23) * (-20013));
                    i8 = 655255488;
                    i25 = iM2763 ^ i8;
                    sArr5 = sArr5;
                    strM1236 = strM1236;
                    strM32975 = strM32975;
                    int i39 = i29;
                    strM2058 = str2;
                    i29 = i39;
                    break;
                case -671628392:
                case 1835818515:
                    C2419.m8174();
                    if (C2310.f7472 >= 0) {
                        iM31614 = C0773.m3169("۟᩵") ^ i22;
                        i14 = ((iM31614 ^ i23) * (-9039)) ^ (-1411512980);
                        i15 = -2124870754;
                        i25 = iM31614 ^ i15;
                        i24 = i14;
                    } else {
                        strM32975 = strM32975;
                        str3 = strM1236;
                        s = s2;
                        sArr3 = sArr5;
                        String str13 = strM2058;
                        i29 = i29;
                        str2 = str13;
                        iM31610 = (C0773.m3169("ۨۧ") + i23) * (-97);
                        i24 = ((iM31610 ^ i22) * 13687) ^ (-145455286);
                        i7 = -1758308251;
                        i25 = iM31610 ^ i7;
                        s2 = s;
                        sArr5 = sArr3;
                        strM1236 = str3;
                        strM32975 = strM32975;
                        int i310 = i29;
                        strM2058 = str2;
                        i29 = i310;
                    }
                    break;
                case -647312949:
                case 1434215132:
                    strM32975 = strM32975;
                    if (c8002 != null) {
                        iM31612 = (C0619.m2761("۬۟") + i23) * 35;
                        i10 = ((iM31612 ^ i22) * 30031) ^ (-416621107);
                        i11 = 165830575;
                    } else {
                        iM31612 = C0619.m2761("᩺ۖ") ^ i22;
                        i10 = ((iM31612 ^ i23) * (-9077)) ^ 1717835524;
                        i11 = 2114053679;
                    }
                    i25 = iM31612 ^ i11;
                    i24 = i10;
                    strM32975 = strM32975;
                    break;
                case -632791629:
                case 1753928897:
                    try {
                        C3779.m12258(sb, strM32975);
                        break;
                    } catch (Throwable unused3) {
                    }
                    strM32975 = strM32975;
                    iM31612 = C0773.m3169("ۡۡ") ^ i23;
                    i10 = ((iM31612 ^ i22) * (-28009)) ^ 1662463591;
                    i11 = 1024848473;
                    i25 = iM31612 ^ i11;
                    i24 = i10;
                    strM32975 = strM32975;
                    break;
                case -598626673:
                case 2080221231:
                    i17 = 1;
                    iM2761 = (i23 - C0619.m2761("ܺ۬")) * (-103);
                    i = ((iM2761 ^ i22) * 1901) ^ 284128969;
                    i2 = -97138162;
                    i25 = iM2761 ^ i2;
                    i24 = i;
                    strM1236 = strM1236;
                    strM32975 = strM32975;
                    break;
                case -570145918:
                case 53469778:
                    strM32975 = strM32975;
                    strM1236 = strM1236;
                    if (!C1826.m6317(itM2359)) {
                        i27 = i28;
                        str = strM2058;
                        sArr2 = sArr5;
                        iM2762 = C0773.m3169("ۛ᩵") ^ i22;
                        i4 = ((iM2762 ^ i23) * (-29837)) ^ (-1895921866);
                        i5 = -1777695206;
                        i25 = iM2762 ^ i5;
                        strM2058 = str;
                        sArr5 = sArr2;
                        strM1236 = strM1236;
                        strM32975 = strM32975;
                        i24 = i4;
                        map2 = map2;
                    } else {
                        iM2761 = (C0619.m2761("ۛ۬") ^ i22) * (-91);
                        i = ((iM2761 ^ i23) * (-29717)) ^ (-1200540362);
                        i2 = 138609120;
                        i25 = iM2761 ^ i2;
                        i24 = i;
                        strM1236 = strM1236;
                        strM32975 = strM32975;
                    }
                    break;
                case -569030532:
                case 386797342:
                    strM32975 = strM32975;
                    i18 = iMo27607 << 24;
                    iMo35833 = c23747.mo35833();
                    i19 = 16;
                    if (C1343.f4799 == 0) {
                        int iM31618 = C0773.m3169("ᩴܺ") ^ i23;
                        i10 = ((iM31618 ^ i22) * (-15941)) ^ 796320592;
                        i25 = iM31618 ^ (-136989777);
                        i24 = i10;
                        strM32975 = strM32975;
                    } else {
                        str3 = strM1236;
                        s = s2;
                        sArr3 = sArr5;
                        String str14 = strM2058;
                        i29 = i29;
                        str2 = str14;
                        iM31610 = C0619.m2761("᩻֡") ^ i22;
                        i24 = ((iM31610 ^ i23) * (-15233)) ^ 804772361;
                        i7 = 484543092;
                        i25 = iM31610 ^ i7;
                        s2 = s;
                        sArr5 = sArr3;
                        strM1236 = str3;
                        strM32975 = strM32975;
                        int i311 = i29;
                        strM2058 = str2;
                        i29 = i311;
                    }
                    break;
                case -495752301:
                case 658148744:
                    strM32975 = strM32975;
                    str3 = strM1236;
                    s = s2;
                    sArr3 = sArr5;
                    String str15 = strM2058;
                    i29 = i29;
                    str2 = str15;
                    if (C3998.f13671 != 0) {
                        iM31610 = (C0773.m3169("ۨۧ") + i23) * (-97);
                        i24 = ((iM31610 ^ i22) * 13687) ^ (-145455286);
                        i7 = -1758308251;
                    } else {
                        iM31610 = (C0773.m3169("ܰܽ") ^ i22) * (-13);
                        i24 = ((iM31610 ^ i23) * 17915) ^ 1001440878;
                        i7 = -1512692240;
                    }
                    i25 = iM31610 ^ i7;
                    s2 = s;
                    sArr5 = sArr3;
                    strM1236 = str3;
                    strM32975 = strM32975;
                    int i312 = i29;
                    strM2058 = str2;
                    i29 = i312;
                    break;
                case -402557479:
                case 1935851387:
                    strM1236 = AbstractC0116.m1236(f49592, 576, 4, i26);
                    objArr = objArr2;
                    sArr = sArr4;
                    int iM2766 = (i23 - C0619.m2761("۟ᩴ")) * 101;
                    objArr2 = objArr;
                    i4 = ((iM2766 ^ i22) * (-22169)) ^ (-31886790);
                    i25 = iM2766 ^ (-641341296);
                    map = map;
                    strM2058 = strM2058;
                    sArr5 = sArr5;
                    sArr4 = sArr;
                    strM32975 = strM32975;
                    i24 = i4;
                    map2 = map2;
                    break;
                case -396394305:
                case 1395827504:
                    strM32975 = strM32975;
                    str3 = strM1236;
                    sArr3 = sArr5;
                    String str16 = strM2058;
                    i29 = i29;
                    str2 = str16;
                    s = s2;
                    int i40 = s + 3364;
                    if (i20 - (i40 * i40) >= 0) {
                        iM31610 = (C0773.m3169("ۚۜ") + i22) * q.h;
                        i24 = ((iM31610 ^ i23) * (-23891)) ^ (-1317688681);
                        i7 = -1612162910;
                    } else {
                        iM31610 = (i23 - C0773.m3169("ۗܶ")) * (-79);
                        i24 = ((iM31610 ^ i22) * (-2721)) ^ (-1495584193);
                        i7 = 2028053900;
                    }
                    i25 = iM31610 ^ i7;
                    s2 = s;
                    sArr5 = sArr3;
                    strM1236 = str3;
                    strM32975 = strM32975;
                    int i313 = i29;
                    strM2058 = str2;
                    i29 = i313;
                    break;
                case -351705673:
                case 110285629:
                    C0619.m2763();
                    if (C11235.f35427 < 0) {
                        iM31614 = C0773.m3169("ۤۨ") ^ i22;
                        i14 = ((iM31614 ^ i23) * (-29327)) ^ (-2064033578);
                        i15 = 502060249;
                    } else {
                        iM31614 = C0773.m3169("۬۬") ^ i23;
                        i14 = ((iM31614 ^ i22) * 10291) ^ 1457906923;
                        i15 = 2074940749;
                    }
                    i25 = iM31614 ^ i15;
                    i24 = i14;
                    break;
                case -351151775:
                case 506257784:
                    strM32975 = strM32975;
                    String str17 = (String) c19327.get(iMo23383);
                    C1321.m4848(str17);
                    C3779.m12258(sb, str17);
                    iM31612 = (i22 - C0773.m3169("ۗ֫")) * 17;
                    i10 = ((iM31612 ^ i23) * (-27935)) ^ 1683120481;
                    i11 = 1670618757;
                    i25 = iM31612 ^ i11;
                    i24 = i10;
                    strM32975 = strM32975;
                    break;
                case -331467950:
                case 409554076:
                    strM32975 = strM32975;
                    strM1236 = strM1236;
                    sArr5 = sArr5;
                    String str18 = strM2058;
                    i29 = i29;
                    str2 = str18;
                    if (C1826.m6317(itM47859)) {
                        iM2763 = C0773.m3169("ۡۜ") ^ i22;
                        i24 = (-1292930812) ^ ((iM2763 ^ i23) * 31205);
                        i8 = -217269604;
                    } else {
                        iM2763 = (C0773.m3169("ܳۚ") + i23) * 13;
                        i24 = (-654132758) ^ ((iM2763 ^ i22) * 29061);
                        i8 = 718755321;
                    }
                    i25 = iM2763 ^ i8;
                    sArr5 = sArr5;
                    strM1236 = strM1236;
                    strM32975 = strM32975;
                    int i314 = i29;
                    strM2058 = str2;
                    i29 = i314;
                    break;
                case -253284501:
                case -121595127:
                    break;
                case -192320938:
                case 1626965178:
                    strM32975 = strM32975;
                    C3779.m12258(sb, strM9931);
                    iM31612 = C0773.m3169("ۡۡ") ^ i23;
                    i10 = ((iM31612 ^ i22) * (-28009)) ^ 1662463591;
                    i11 = 1024848473;
                    i25 = iM31612 ^ i11;
                    i24 = i10;
                    strM32975 = strM32975;
                    break;
                case 55437267:
                case 1793913887:
                    strM32975 = strM32975;
                    str3 = strM1236;
                    s = s2;
                    sArr3 = sArr5;
                    String str19 = strM2058;
                    i29 = i29;
                    str2 = str19;
                    if (C0487.f2131 <= 0) {
                        iM31610 = C0619.m2761("ܽۛ") ^ i23;
                        i24 = ((iM31610 ^ i22) * (-24397)) ^ (-1557757134);
                        i7 = -38830644;
                    } else {
                        iM31610 = (C0619.m2761("ۨ᩵") + i23) * 51;
                        i24 = ((iM31610 ^ i22) * 11091) ^ 285002904;
                        i7 = -832148999;
                    }
                    i25 = iM31610 ^ i7;
                    s2 = s;
                    sArr5 = sArr3;
                    strM1236 = str3;
                    strM32975 = strM32975;
                    int i315 = i29;
                    strM2058 = str2;
                    i29 = i315;
                    break;
                case 67932418:
                case 1323977095:
                    if (C2966.f9654 < 0) {
                        strM32975 = strM32975;
                        strM1236 = strM1236;
                        sArr5 = sArr5;
                        String str20 = strM2058;
                        i29 = i29;
                        str2 = str20;
                        iM2763 = C0773.m3169("֨᩵") ^ i22;
                        i24 = (-624392921) ^ ((iM2763 ^ i23) * (-11275));
                        i8 = 2048774342;
                        i25 = iM2763 ^ i8;
                        sArr5 = sArr5;
                        strM1236 = strM1236;
                        strM32975 = strM32975;
                        int i316 = i29;
                        strM2058 = str2;
                        i29 = i316;
                    } else {
                        iM31614 = C0773.m3169("ۤۨ") ^ i22;
                        i14 = ((iM31614 ^ i23) * (-29327)) ^ (-2064033578);
                        i15 = 502060249;
                        i25 = iM31614 ^ i15;
                        i24 = i14;
                    }
                    break;
                case 187753626:
                case 1212472579:
                    try {
                        strM32975 = strM32975;
                        try {
                            C1783.m6234(sb, C2485.m8350(f49592, 598, 4, i26));
                            break;
                        } catch (Throwable unused4) {
                        }
                    } catch (Throwable unused5) {
                        strM32975 = strM32975;
                    }
                    iM31612 = C0773.m3169("ۡۡ") ^ i23;
                    i10 = ((iM31612 ^ i22) * (-28009)) ^ 1662463591;
                    i11 = 1024848473;
                    i25 = iM31612 ^ i11;
                    i24 = i10;
                    strM32975 = strM32975;
                    break;
                case 194246634:
                case 448372650:
                    C1519.m5403();
                    if (C2354.f7599 < 0) {
                        strM32975 = strM32975;
                        strM1236 = strM1236;
                        iM31611 = (i23 - C0773.m3169("ۢܿ")) * 39;
                        i24 = 1822220057 ^ ((iM31611 ^ i22) * 19453);
                        i9 = 954764371;
                        i25 = iM31611 ^ i9;
                        map = map;
                        map2 = map2;
                        strM1236 = strM1236;
                        strM32975 = strM32975;
                    } else {
                        strM32975 = strM32975;
                        i3 = i29;
                        str2 = strM2058;
                        strM1236 = strM1236;
                        sArr5 = sArr5;
                        iM3169 = C0619.m2761("ۜᩳ") ^ i22;
                        i24 = ((iM3169 ^ i23) * (-459)) ^ (-899678886);
                        i6 = 2031357854;
                        i25 = iM3169 ^ i6;
                        map = map;
                        sArr5 = sArr5;
                        strM1236 = strM1236;
                        strM2058 = str2;
                        strM32975 = strM32975;
                        i29 = i3;
                        map2 = map2;
                    }
                    break;
                case 243280931:
                case 496476719:
                    strM32975 = strM32975;
                    try {
                        C14955.m35982(bArrM46522);
                        iM31613 = (C0619.m2761("ۚۚ") ^ i23) * (-89);
                        i12 = ((iM31613 ^ i22) * (-26315)) ^ (-680957110);
                        i13 = 1855839996;
                    } catch (IOException unused6) {
                        iM31613 = (i22 - C0773.m3169("ܶ᩶")) * 85;
                        i12 = ((iM31613 ^ i23) * (-29573)) ^ (-1628449059);
                        i13 = 164926786;
                    } catch (Throwable unused7) {
                    }
                    i25 = iM31613 ^ i13;
                    i24 = i12;
                    strM32975 = strM32975;
                    break;
                case 376862787:
                case 1676418472:
                    sArr = sArr4;
                    objArr = objArr2;
                    strM1236 = String.format(C1321.m4861(sArr, 567, 9, i26), objArr);
                    int iM2767 = (i23 - C0619.m2761("۟ᩴ")) * 101;
                    objArr2 = objArr;
                    i4 = ((iM2767 ^ i22) * (-22169)) ^ (-31886790);
                    i25 = iM2767 ^ (-641341296);
                    map = map;
                    strM2058 = strM2058;
                    sArr5 = sArr5;
                    sArr4 = sArr;
                    strM32975 = strM32975;
                    i24 = i4;
                    map2 = map2;
                    break;
                case 414160209:
                case 713270435:
                    strM32975 = strM32975;
                    strM1236 = strM1236;
                    if (C3998.m12923(itM2358)) {
                        iM2761 = (i22 - C0619.m2761("ܿۖ")) * 59;
                        i = ((iM2761 ^ i23) * (-5277)) ^ 1846620724;
                        i2 = -1509755271;
                    } else {
                        i16 = i17;
                        iM2761 = (C0773.m3169("ᩴ֨") ^ i22) * (-127);
                        i = ((iM2761 ^ i23) * 8207) ^ 594358099;
                        i2 = -2063304661;
                    }
                    i25 = iM2761 ^ i2;
                    i24 = i;
                    strM1236 = strM1236;
                    strM32975 = strM32975;
                    break;
                case 539661360:
                case 1334531792:
                    String strM4058 = C1080.m4058(sb);
                    C1519.m5396(map2, value, strM4058);
                    str6 = strM4058;
                    iM31612 = C0773.m3169("۬֨") ^ i23;
                    i10 = ((iM31612 ^ i22) * 27065) ^ 1532741886;
                    i11 = -1432388646;
                    i25 = iM31612 ^ i11;
                    i24 = i10;
                    strM32975 = strM32975;
                    break;
                case 697859520:
                case 1769183915:
                    strM32975 = strM32975;
                    iLastIndexOf = value.lastIndexOf(46);
                    str4 = "";
                    if (iLastIndexOf == -1) {
                        strM9931 = str4;
                        iM31612 = (C0773.m3169("᩺ܶ") + i23) * 41;
                        i10 = ((iM31612 ^ i22) * (-1991)) ^ (-205586975);
                        i11 = -1351842757;
                    } else {
                        iM31612 = (C0773.m3169("۠ܽ") ^ i22) * (-11);
                        i10 = ((iM31612 ^ i23) * 15151) ^ (-1163300491);
                        i11 = -632099529;
                    }
                    i25 = iM31612 ^ i11;
                    i24 = i10;
                    strM32975 = strM32975;
                    break;
                case 698094974:
                case 1098408543:
                    strM32975 = strM32975;
                    strM1236 = strM1236;
                    sArr5 = sArr5;
                    String str21 = strM2058;
                    i29 = i29;
                    str2 = str21;
                    s2 = f49592[566];
                    if (C2966.f9654 >= 0) {
                        iM2763 = C0773.m3169("֨᩵") ^ i22;
                        i24 = (-624392921) ^ ((iM2763 ^ i23) * (-11275));
                        i8 = 2048774342;
                    } else {
                        iM2763 = C0619.m2761("ۖۡ") ^ i22;
                        i24 = (-298423875) ^ ((iM2763 ^ i23) * 24937);
                        i8 = -902542304;
                    }
                    i25 = iM2763 ^ i8;
                    sArr5 = sArr5;
                    strM1236 = strM1236;
                    strM32975 = strM32975;
                    int i317 = i29;
                    strM2058 = str2;
                    i29 = i317;
                    break;
                case 722546132:
                case 1242555735:
                    strM32975 = strM32975;
                    strM1236 = strM1236;
                    c23747 = (C23747) C0950.m3796(itM478510);
                    strM2058 = RunnableC0334.m2058(c23747);
                    sArr5 = f49592;
                    if (C1783.f6087 <= 0) {
                        iM31611 = (i23 - C0773.m3169("ۢܿ")) * 39;
                        i24 = 1822220057 ^ ((iM31611 ^ i22) * 19453);
                        i9 = 954764371;
                    } else {
                        iM31611 = (C0773.m3169("ۢۛ") ^ i23) * (-123);
                        i24 = (-1970977082) ^ ((iM31611 ^ i22) * 14721);
                        i9 = -1833857705;
                    }
                    i25 = iM31611 ^ i9;
                    map = map;
                    map2 = map2;
                    strM1236 = strM1236;
                    strM32975 = strM32975;
                    break;
                case 1034547076:
                case 1632479230:
                    if (strM32975 == null) {
                        strM32975 = strM32975;
                        iM31612 = C0619.m2761("᩺ۖ") ^ i22;
                        i10 = ((iM31612 ^ i23) * (-9077)) ^ 1717835524;
                        i11 = 2114053679;
                        i25 = iM31612 ^ i11;
                        i24 = i10;
                        strM32975 = strM32975;
                    } else {
                        iM31614 = (i22 - C0773.m3169("۬ۗ")) * 25;
                        i14 = ((iM31614 ^ i23) * 28129) ^ 1784622782;
                        i15 = -1817047978;
                        i25 = iM31614 ^ i15;
                        i24 = i14;
                    }
                    break;
                case 1146979877:
                case 1297108550:
                    strM32975 = strM32975;
                    strM1236 = strM1236;
                    value = c3609.mo11710().getValue();
                    if (C3734.m12151(map, value)) {
                        iM2761 = (C0773.m3169("ᩴ᩵") ^ i23) * (-115);
                        i = ((iM2761 ^ i22) * (-22331)) ^ 68208582;
                        i2 = 203759393;
                    } else {
                        iM2761 = (C0619.m2761("᩶۫") ^ i23) * (-113);
                        i = ((iM2761 ^ i22) * 10951) ^ 1132349700;
                        i2 = -1262188885;
                    }
                    i25 = iM2761 ^ i2;
                    i24 = i;
                    strM1236 = strM1236;
                    strM32975 = strM32975;
                    break;
                case 1439359314:
                case 1707734831:
                    str6 = (String) C0269.m1779(map2, value);
                    iM31612 = C0773.m3169("۬֨") ^ i23;
                    i10 = ((iM31612 ^ i22) * 27065) ^ 1532741886;
                    i11 = -1432388646;
                    i25 = iM31612 ^ i11;
                    i24 = i10;
                    strM32975 = strM32975;
                    break;
                case 1576419857:
                case 2143685329:
                    strM32975 = strM32975;
                    str = strM2058;
                    strM1236 = strM1236;
                    if (C2419.m8175(str, C0269.m1785(f49592, 586, 5, i26))) {
                        sArr2 = sArr5;
                        iM2762 = C0773.m3169("ۛ᩵") ^ i22;
                        i4 = ((iM2762 ^ i23) * (-29837)) ^ (-1895921866);
                        i5 = -1777695206;
                        i25 = iM2762 ^ i5;
                        strM2058 = str;
                        sArr5 = sArr2;
                    } else {
                        int iM2768 = C0619.m2761("᩷᩹") ^ i22;
                        i4 = ((iM2768 ^ i23) * (-31773)) ^ 1648622758;
                        i25 = iM2768 ^ (-592098242);
                        strM2058 = str;
                    }
                    strM1236 = strM1236;
                    strM32975 = strM32975;
                    i24 = i4;
                    map2 = map2;
                    break;
                case 1996335365:
                case 2042836418:
                    strM32975 = strM32975;
                    strM1236 = strM1236;
                    sb = new StringBuilder(strM1236);
                    C1783.m6234(sb, str5);
                    C1080.m4046(sb, '/');
                    iMo27607 = c25239.mo27607();
                    if (C0487.f2131 <= 0) {
                        iM2761 = (C0773.m3169("۬֫") + i23) * (-107);
                        i = ((iM2761 ^ i22) * (-25245)) ^ (-999736096);
                        i2 = 688855760;
                    } else {
                        iM2761 = C0773.m3169("ۙܳ") ^ i22;
                        i = ((iM2761 ^ i23) * (-19349)) ^ (-1438442565);
                        i2 = -916138978;
                    }
                    i25 = iM2761 ^ i2;
                    i24 = i;
                    strM1236 = strM1236;
                    strM32975 = strM32975;
                    break;
                default:
                    strM32975 = strM32975;
                    str = strM2058;
                    strM1236 = strM1236;
                    sArr2 = sArr5;
                    if (C3492.m11490(str, C17202.m40377(sArr2, 580, 6, i26))) {
                        iM2762 = C0773.m3169("ۛ᩵") ^ i22;
                        i4 = ((iM2762 ^ i23) * (-29837)) ^ (-1895921866);
                        i5 = -1777695206;
                    } else {
                        iM2762 = C0619.m2761("ۤܳ") ^ i22;
                        i4 = ((iM2762 ^ i23) * 29831) ^ 1453737906;
                        i5 = 1250417094;
                    }
                    i25 = iM2762 ^ i5;
                    strM2058 = str;
                    sArr5 = sArr2;
                    strM1236 = strM1236;
                    strM32975 = strM32975;
                    i24 = i4;
                    map2 = map2;
                    break;
            }
            return;
        }
    }
}
